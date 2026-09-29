package in.juspay.hypersdk.services;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Base64;
import dalvik.system.ZipPathValidator;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.PaymentConstants;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.data.SessionInfo;
import in.juspay.hypersdk.security.EncryptionHelper;
import in.juspay.hypersdk.utils.network.SessionizedNetUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.ref.WeakReference;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class RemoteAssetService {
    private static final String LOG_TAG = "RemoteAssetService";
    private static final JSONArray fileDownloadTimes = new JSONArray();
    private JSONObject assetMetadata;
    private final JuspayServices juspayServices;
    private final String sdkName;
    private final Workspace workspace;

    /* JADX INFO: loaded from: classes5.dex */
    static class AssetDownloadTask extends AsyncTask<Void, Void, Boolean> {
        private String callback;
        private final WeakReference<Context> contextWeakReference;
        private String fileName;
        private String location;
        private RemoteAssetService remoteAssetService;
        private long renewFileStartTime;
        private long ttlInMilliSeconds;

        AssetDownloadTask(Context context, String str, String str2, String str3, long j, RemoteAssetService remoteAssetService, long j2) {
            this.location = str;
            this.fileName = str2;
            this.callback = str3;
            this.ttlInMilliSeconds = j;
            this.remoteAssetService = remoteAssetService;
            this.contextWeakReference = new WeakReference<>(context);
            this.renewFileStartTime = j2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Boolean doInBackground(Void... voidArr) {
            Context context = this.contextWeakReference.get();
            if (context != null) {
                try {
                    if (!this.location.contains("certificates")) {
                        return Boolean.valueOf(this.remoteAssetService.getContent(context, this.location, this.fileName, this.ttlInMilliSeconds));
                    }
                    this.remoteAssetService.updateCertificates(context, this.location, this.ttlInMilliSeconds);
                } catch (Exception e) {
                    SdkTracker sdkTracker = this.remoteAssetService.juspayServices.getSdkTracker();
                    StringBuilder sb = new StringBuilder("Could not renew file ");
                    sb.append(this.location);
                    sb.append(": ");
                    sb.append(e.getMessage());
                    sdkTracker.trackAndLogException(RemoteAssetService.LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.REMOTE_ASSET_SERVICE, sb.toString(), e);
                }
            }
            return Boolean.FALSE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.renewFileStartTime;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("startTime", this.renewFileStartTime);
                jSONObject.put("endTime", jCurrentTimeMillis);
                jSONObject.put("totalTime", jCurrentTimeMillis - j);
                jSONObject.put("fileName", this.fileName);
            } catch (JSONException unused) {
            }
            RemoteAssetService.fileDownloadTimes.put(jSONObject);
            String str = this.callback;
            if (str != null) {
                String str2 = String.format("window.callUICallback('%s', '%b', '%s', '%s');", str, bool, this.location, this.remoteAssetService.juspayServices.getFileProviderService().appendSdkNameAndVersion(this.fileName));
                this.remoteAssetService.juspayServices.sdkDebug(RemoteAssetService.LOG_TAG, str2);
                this.remoteAssetService.juspayServices.addJsToWebView(str2);
            }
        }
    }

    public RemoteAssetService(JuspayServices juspayServices) {
        this.juspayServices = juspayServices;
        this.workspace = juspayServices.getWorkspace();
        this.sdkName = juspayServices.getSdkInfo().getSdkName();
    }

    private String decideAndUpdateInternalStorage(Context context, byte[] bArr, String str, String str2) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        FileProviderService fileProviderService = this.juspayServices.getFileProviderService();
        String strMd5 = EncryptionHelper.md5(bArr);
        if (strMd5 == null) {
            strMd5 = "";
        }
        String str3 = strMd5;
        this.juspayServices.sdkDebug(LOG_TAG, "hashInDisk: ".concat(String.valueOf(str)));
        this.juspayServices.sdkDebug(LOG_TAG, "newHash: ".concat(String.valueOf(str3)));
        StringBuilder sb = new StringBuilder("Hash of used file '");
        sb.append(str2);
        sb.append("' is now ");
        sb.append(str3);
        sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.REMOTE_ASSET_SERVICE, "remote_asset_service_update_hash", sb.toString());
        if (str != null && str.equals(str3)) {
            StringBuilder sb2 = new StringBuilder("Remote hash is same as disk hash. Not updating asset '");
            sb2.append(str2);
            sb2.append("'");
            sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.REMOTE_ASSET_SERVICE, "remote_asset_service_compare_hash", sb2.toString());
            return null;
        }
        StringBuilder sb3 = new StringBuilder("Remote hash differs from disk hash. Updating asset '");
        sb3.append(str2);
        sb3.append("'");
        sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.REMOTE_ASSET_SERVICE, "remote_asset_service_compare_hash", sb3.toString());
        if (fileProviderService.updateFile(context, str2, bArr)) {
            return str3;
        }
        return null;
    }

    private byte[] download(String str, String str2) {
        HashMap map = new HashMap();
        map.put("ts", String.valueOf(System.currentTimeMillis()));
        map.put("If-None-Match", str);
        map.put("Accept-Encoding", "gzip");
        this.juspayServices.sdkDebug(LOG_TAG, "START fetching content from: ".concat(String.valueOf(str2)));
        try {
            return new SessionizedNetUtils(this.juspayServices.getSessionInfo(), 0, 0, false).fetchIfModified(str2, map);
        } catch (Exception e) {
            this.juspayServices.getSdkTracker().trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.REMOTE_ASSET_SERVICE, "Error While Downloading File", e);
            return null;
        }
    }

    private long getAssetTtl() {
        return Long.parseLong(this.workspace.getFromSharedPreference("REMOTE_ASSET_TTL_MILLISECONDS", "3600000"));
    }

    private void setMetadata(String str, JSONObject jSONObject) {
        synchronized (this) {
            if (this.assetMetadata == null) {
                getMetadata(str);
            }
            this.assetMetadata.put(str, jSONObject);
            this.workspace.writeToSharedPreference("asset_metadata.json", this.assetMetadata.toString());
        }
    }

    private byte[] unZipAndVerify(Context context, byte[] bArr, String str) {
        FileProviderService fileProviderService = this.juspayServices.getFileProviderService();
        return unZipAndVerify(bArr, str, fileProviderService.getAssetFileAsByte(context, "remoteAssetPublicKey"), this.juspayServices.getSdkTracker());
    }

    private String unzipAndUpdateInternalStorage(Context context, byte[] bArr) throws IOException {
        FileProviderService fileProviderService = this.juspayServices.getFileProviderService();
        String strMd5 = EncryptionHelper.md5(bArr);
        if (strMd5 == null) {
            strMd5 = "";
        }
        ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(bArr));
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return strMd5;
                }
                String name = nextEntry.getName();
                if (!nextEntry.isDirectory()) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        try {
                            int i = zipInputStream.read();
                            if (i == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(i);
                        } finally {
                        }
                    }
                    fileProviderService.updateCertificate(context, name, byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.close();
                }
            } catch (Throwable th) {
                try {
                    zipInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCertificates(Context context, String str, long j) throws JSONException, IOException {
        String string;
        String strMd5;
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        JSONObject metadata = getMetadata(str);
        boolean z = true;
        String strSubstring = str.substring(str.lastIndexOf("/") + 1);
        if (metadata.getString("lastChecked") != null) {
            string = metadata.getString(PaymentConstants.ATTR_HASH_IN_DISK);
            strMd5 = metadata.getString("zipHashInDisk");
        } else {
            string = "";
            strMd5 = "";
        }
        byte[] bArrDownload = download(strMd5, str);
        if (bArrDownload != null) {
            strMd5 = EncryptionHelper.md5(bArrDownload);
        } else {
            z = false;
        }
        boolean z2 = z;
        String str2 = strMd5;
        byte[] bArrUnZipAndVerify = unZipAndVerify(context, bArrDownload, strSubstring);
        this.juspayServices.sdkDebug(LOG_TAG, "DONE fetching content from: ".concat(String.valueOf(str)));
        this.juspayServices.sdkDebug(LOG_TAG, "hashInDisk: ".concat(String.valueOf(string)));
        this.juspayServices.sdkDebug(LOG_TAG, "newHash: ");
        StringBuilder sb = new StringBuilder("Hash of used file '");
        sb.append(strSubstring);
        sb.append("' is now ");
        sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.REMOTE_ASSET_SERVICE, "remote_asset_service_update_hash", sb.toString());
        if (bArrUnZipAndVerify != null) {
            String strUnzipAndUpdateInternalStorage = unzipAndUpdateInternalStorage(context, bArrUnZipAndVerify);
            metadata.put("lastChecked", System.currentTimeMillis());
            metadata.put(PaymentConstants.ATTR_HASH_IN_DISK, strUnzipAndUpdateInternalStorage);
            metadata.put("zipHashInDisk", str2);
            setMetadata(str, metadata);
            return;
        }
        if (z2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("ETAG matches for '");
        sb2.append(strSubstring);
        sb2.append("'. Not downloading from ");
        sb2.append(str);
        sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.REMOTE_ASSET_SERVICE, "remote_asset_service_etag_match", sb2.toString());
    }

    public boolean getContent(Context context, String str) {
        return getContent(context, str, getAssetTtl());
    }

    public JSONArray getFileDownloadTimes() {
        return fileDownloadTimes;
    }

    public JSONObject getMetadata(String str) {
        JSONObject jSONObject;
        synchronized (this) {
            SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
            try {
                this.assetMetadata = new JSONObject(this.workspace.getFromSharedPreference("asset_metadata.json", "{}"));
                JuspayServices juspayServices = this.juspayServices;
                StringBuilder sb = new StringBuilder("assetMetadata: ");
                sb.append(this.assetMetadata);
                juspayServices.sdkDebug(LOG_TAG, sb.toString());
                if (!this.assetMetadata.has(str)) {
                    this.assetMetadata.put(str, new JSONObject());
                    ((JSONObject) this.assetMetadata.get(str)).put("lastChecked", 0);
                    ((JSONObject) this.assetMetadata.get(str)).put(PaymentConstants.ATTR_HASH_IN_DISK, "");
                    ((JSONObject) this.assetMetadata.get(str)).put("zipHashInDisk", "");
                }
                jSONObject = (JSONObject) this.assetMetadata.get(str);
            } catch (JSONException e) {
                sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.REMOTE_ASSET_SERVICE, "Exception trying to read from KeyStore: asset_metadata.json", e);
                throw new RuntimeException("Unexpected internal error.", e);
            }
        }
        return jSONObject;
    }

    public void renewFile(Context context, String str, String str2, String str3, long j) {
        renewFile(context, str, str2, getAssetTtl(), str3, j);
    }

    public void resetMetadata(String str) {
        synchronized (this) {
            if (this.assetMetadata == null) {
                getMetadata(str);
            }
            this.assetMetadata.remove(str);
            this.workspace.writeToSharedPreference("asset_metadata.json", this.assetMetadata.toString());
        }
    }

    private boolean getContent(Context context, String str, long j) {
        return getContent(context, str, null, j);
    }

    public void renewFile(Context context, String str, String str2, long j) {
        renewFile(context, str, str2, getAssetTtl(), null, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean getContent(Context context, String str, String str2, long j) throws JSONException, IOException {
        String string;
        String fromFile;
        String strMd5;
        boolean z;
        String str3;
        SessionInfo sessionInfo = this.juspayServices.getSessionInfo();
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        FileProviderService fileProviderService = this.juspayServices.getFileProviderService();
        String strReplace = !sessionInfo.isVerifyAssetsEnabled() ? str.replace(".zip", ".jsa") : str;
        String strSubstring = str2 == null ? strReplace.substring(strReplace.lastIndexOf("/") + 1) : str2;
        String strReplace2 = strSubstring.replace(".zip", ".jsa");
        JSONObject metadata = getMetadata(strReplace2);
        if (metadata.getString("lastChecked") != null) {
            fromFile = metadata.getString(PaymentConstants.ATTR_HASH_IN_DISK);
            string = metadata.getString("zipHashInDisk");
        } else {
            string = "";
            if (strSubstring.contains(".zip")) {
                fromFile = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(strSubstring);
                sb.append(".hash");
                fromFile = fileProviderService.readFromFile(context, sb.toString());
            }
        }
        byte[] bArrDownload = download(string, strReplace);
        String str4 = string;
        if (bArrDownload != null) {
            strMd5 = EncryptionHelper.md5(bArrDownload);
            z = true;
        } else {
            strMd5 = str4;
            z = false;
        }
        byte[] bArrUnZipAndVerify = unZipAndVerify(context, bArrDownload, strSubstring);
        if (bArrUnZipAndVerify == null) {
            if (!z) {
                StringBuilder sb2 = new StringBuilder("ETAG matches for '");
                sb2.append(strSubstring);
                sb2.append("'. Not downloading from ");
                sb2.append(strReplace);
                sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.REMOTE_ASSET_SERVICE, "remote_asset_service_etag_match", sb2.toString());
                return false;
            }
            bArrUnZipAndVerify = EncryptionHelper.v1Encrypt(fileProviderService.readFromFile(context, strReplace2, false).getBytes());
        }
        if (bArrUnZipAndVerify != null) {
            this.juspayServices.sdkDebug(LOG_TAG, "DONE fetching content from: ".concat(String.valueOf(strReplace)));
            str3 = "zipHashInDisk";
            this.juspayServices.sdkDebug(LOG_TAG, "Text: ".concat(new String(bArrUnZipAndVerify)));
        } else {
            str3 = "zipHashInDisk";
        }
        String strDecideAndUpdateInternalStorage = decideAndUpdateInternalStorage(context, bArrUnZipAndVerify, fromFile, strReplace2);
        if (strDecideAndUpdateInternalStorage == null) {
            return true;
        }
        if (!strSubstring.contains(".zip")) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(strSubstring);
            sb3.append(".hash");
            fileProviderService.writeFileToDisk(context, strDecideAndUpdateInternalStorage, sb3.toString());
        }
        metadata.put("lastChecked", System.currentTimeMillis());
        metadata.put(PaymentConstants.ATTR_HASH_IN_DISK, strDecideAndUpdateInternalStorage);
        metadata.put(str3, strMd5);
        setMetadata(strReplace2, metadata);
        return true;
    }

    public void renewFile(Context context, String str, String str2, long j, String str3, long j2) {
        this.juspayServices.sdkDebug(LOG_TAG, "Looking to renew file: ".concat(String.valueOf(str)));
        new AssetDownloadTask(context, str, str3, str2, j, this, j2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public static byte[] unZipAndVerify(byte[] bArr, String str, byte[] bArr2, SdkTracker sdkTracker) {
        if (bArr == null || !str.contains(".zip")) {
            return bArr;
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                ZipInputStream zipInputStream = new ZipInputStream(byteArrayInputStream);
                try {
                    if (Build.VERSION.SDK_INT >= 34) {
                        ZipPathValidator.clearCallback();
                    }
                    byte[] byteArray = null;
                    byte[] bArrDecode = null;
                    while (true) {
                        try {
                            ZipEntry nextEntry = zipInputStream.getNextEntry();
                            if (nextEntry != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr3 = new byte[1024];
                                while (true) {
                                    int i = zipInputStream.read(bArr3);
                                    if (i == -1) {
                                        break;
                                    }
                                    byteArrayOutputStream.write(bArr3, 0, i);
                                }
                                zipInputStream.closeEntry();
                                byteArrayOutputStream.close();
                                if (nextEntry.getName().contains(PaymentConstants.SIGNATURE)) {
                                    bArrDecode = Base64.decode(byteArrayOutputStream.toByteArray(), 2);
                                } else if (nextEntry.getName().contains(".jsa") || (str.contains("certificate") && nextEntry.getName().contains(".zip"))) {
                                    byteArray = byteArrayOutputStream.toByteArray();
                                }
                            } else {
                                try {
                                    break;
                                } catch (ClassNotFoundException e) {
                                    sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.REMOTE_ASSET_SERVICE, "Exception while Reading Public Key", e);
                                    zipInputStream.close();
                                    byteArrayInputStream.close();
                                    return null;
                                } catch (InvalidKeyException e2) {
                                    sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.REMOTE_ASSET_SERVICE, "Key Used was Invalid", e2);
                                    zipInputStream.close();
                                    byteArrayInputStream.close();
                                    return null;
                                } catch (NoSuchAlgorithmException e3) {
                                    sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.REMOTE_ASSET_SERVICE, "DSA Algorithm not found", e3);
                                    zipInputStream.close();
                                    byteArrayInputStream.close();
                                    return null;
                                } catch (SignatureException e4) {
                                    sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.REMOTE_ASSET_SERVICE, "Exception while matching Signature for file", e4);
                                    zipInputStream.close();
                                    byteArrayInputStream.close();
                                    return null;
                                }
                            }
                        } catch (Exception e5) {
                            sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.REMOTE_ASSET_SERVICE, "Exception while verifying Signature", e5);
                        }
                    }
                    ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bArr2));
                    try {
                        PublicKey publicKey = (PublicKey) objectInputStream.readObject();
                        Signature signature = Signature.getInstance("DSA");
                        signature.initVerify(publicKey);
                        signature.update(byteArray);
                        if (!signature.verify(bArrDecode)) {
                            sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.REMOTE_ASSET_SERVICE, "signature_not_verified", str);
                            objectInputStream.close();
                            zipInputStream.close();
                            byteArrayInputStream.close();
                            return null;
                        }
                        sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.REMOTE_ASSET_SERVICE, "signature_verified", str);
                        objectInputStream.close();
                        zipInputStream.close();
                        byteArrayInputStream.close();
                        return byteArray;
                    } catch (Throwable th) {
                        try {
                            objectInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e6) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", LogSubCategory.Action.SYSTEM, Labels.System.REMOTE_ASSET_SERVICE, "IOException while verifying Signature", e6);
            return null;
        }
    }
}
