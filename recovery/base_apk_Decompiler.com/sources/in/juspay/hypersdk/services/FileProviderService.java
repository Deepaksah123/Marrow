package in.juspay.hypersdk.services;

import android.content.Context;
import android.os.Environment;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogLevel;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.FileProviderInterface;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.core.Constants;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.PaymentConstants;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.data.SdkInfo;
import in.juspay.hypersdk.security.EncryptionHelper;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class FileProviderService implements FileProviderInterface {
    private static final String LOG_TAG = "FileProviderService";
    private final JuspayServices juspayServices;
    private final Workspace workspace;
    private final Map<String, String> fileCache = new HashMap();
    private final List<String> fileCacheWhiteList = new ArrayList();
    private final boolean shouldCheckInternalAssets = true;

    /* JADX INFO: renamed from: in.juspay.hypersdk.services.FileProviderService$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$in$juspay$hypersdk$services$FileProviderService$Mode;

        static {
            int[] iArr = new int[Mode.values().length];
            $SwitchMap$in$juspay$hypersdk$services$FileProviderService$Mode = iArr;
            try {
                iArr[Mode.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$in$juspay$hypersdk$services$FileProviderService$Mode[Mode.RE_OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    enum Mode {
        NEW,
        RE_OPEN
    }

    public final class TempWriter {
        private final File tempDir;

        TempWriter(String str, Mode mode) throws FileNotFoundException {
            File fileOpenInCache;
            int i = AnonymousClass1.$SwitchMap$in$juspay$hypersdk$services$FileProviderService$Mode[mode.ordinal()];
            if (i == 1) {
                fileOpenInCache = FileProviderService.this.workspace.openInCache(String.format("temp-%s-%s", str, Long.valueOf(System.currentTimeMillis())));
                fileOpenInCache.mkdir();
            } else if (i != 2) {
                fileOpenInCache = null;
            } else {
                fileOpenInCache = FileProviderService.this.workspace.openInCache(str);
                if (!fileOpenInCache.exists()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" does not exist in cache!");
                    throw new FileNotFoundException(sb.toString());
                }
            }
            this.tempDir = fileOpenInCache;
        }

        public final String getDirName() {
            return this.tempDir.getName();
        }

        public final String[] list() {
            return FileProviderService.listFiles(this.tempDir);
        }

        public final boolean moveToMain(String str, String str2) {
            String strAsDecryptedJSA = FileProviderService.asDecryptedJSA(FileProviderService.this.appendSdkNameAndVersion(str));
            File file = new File(this.tempDir, strAsDecryptedJSA);
            if (!file.exists()) {
                return false;
            }
            FileProviderService fileProviderService = FileProviderService.this;
            Context context = fileProviderService.juspayServices.getContext();
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("/");
            sb.append(strAsDecryptedJSA);
            return file.renameTo(fileProviderService.getFileFromInternalStorage(context, sb.toString()));
        }

        public final boolean write(String str, byte[] bArr) {
            File file = new File(this.tempDir, FileProviderService.this.appendSdkNameAndVersion(str));
            FileProviderService fileProviderService = FileProviderService.this;
            return fileProviderService.writeToFile(fileProviderService.juspayServices.getContext(), file, bArr, false);
        }
    }

    public FileProviderService(JuspayServices juspayServices) {
        this.juspayServices = juspayServices;
        this.workspace = juspayServices.getWorkspace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String asDecryptedJSA(String str) {
        return replaceExtension(str, ".jsa", Constants.DECRYPTED_JSA_EXT);
    }

    private static String asEncryptedJSA(String str) {
        return replaceExtension(str, Constants.DECRYPTED_JSA_EXT, ".jsa");
    }

    private void cacheFile(String str, String str2) {
        this.fileCache.put(str, str2);
        this.juspayServices.sdkDebug(LOG_TAG, "Caching file: ".concat(String.valueOf(str)));
    }

    private void copyFile(Context context, String str, String str2) {
        copyFile(getFileFromInternalStorage(context, str), getFileFromInternalStorage(context, str2));
    }

    private void deleteFileFromCache(String str) {
        if (isFileCached(str)) {
            this.fileCache.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File getFileFromInternalStorage(Context context, String str) {
        this.juspayServices.sdkDebug(LOG_TAG, "Context while reading Internal Storage :".concat(String.valueOf(context)));
        this.juspayServices.sdkDebug(LOG_TAG, "Getting file from internal storage. Filename: ".concat(String.valueOf(str)));
        File fileOpen = this.workspace.open(str);
        File parentFile = fileOpen.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        return fileOpen;
    }

    private boolean isFileCached(String str) {
        return this.fileCache.containsKey(str);
    }

    private InputStream openAsset(Context context, String str) {
        return this.workspace.openAsset(str);
    }

    private String readFromAssets(Context context, String str) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            byte[] assetFileAsByte = getAssetFileAsByte(context, str);
            if (!str.endsWith("jsa")) {
                JuspayServices juspayServices = this.juspayServices;
                StringBuilder sb = new StringBuilder("Done reading ");
                sb.append(str);
                sb.append(" from assets");
                juspayServices.sdkDebug(LOG_TAG, sb.toString());
                return new String(assetFileAsByte);
            }
            JuspayServices juspayServices2 = this.juspayServices;
            StringBuilder sb2 = new StringBuilder("Read JSA Asset file ");
            sb2.append(str);
            sb2.append(" with encrypted hash - ");
            sb2.append(EncryptionHelper.md5(assetFileAsByte));
            juspayServices2.sdkDebug(LOG_TAG, sb2.toString());
            return new String(EncryptionHelper.decryptThenGunzip(assetFileAsByte, EncryptionHelper.ENCRYPTED_VERSION));
        } catch (Exception e) {
            sdkTracker.trackException("action", LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, "Exception trying to read from file: ".concat(String.valueOf(str)), e);
            return null;
        }
    }

    private void readFromInputStream(ByteArrayOutputStream byteArrayOutputStream, InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                byteArrayOutputStream.write(bArr, 0, i);
            }
        }
    }

    private String readFromInternalStorage(Context context, String str) {
        String strAppendSdkNameAndVersion = appendSdkNameAndVersion(str);
        if (this.juspayServices.getSdkInfo().usesLocalAssets()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            if (strAppendSdkNameAndVersion.endsWith("jsa")) {
                byte[] bArrDecryptGunzipInternalStorage = decryptGunzipInternalStorage(context, strAppendSdkNameAndVersion);
                if (bArrDecryptGunzipInternalStorage != null) {
                    return new String(bArrDecryptGunzipInternalStorage);
                }
                StringBuilder sb2 = new StringBuilder("Returning null from internal storage for ");
                sb2.append(strAppendSdkNameAndVersion);
                sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, LogLevel.WARNING, Labels.System.FILE_PROVIDER_SERVICE, "readFromInternalStorage", sb2.toString());
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(getFileFromInternalStorage(context, strAppendSdkNameAndVersion));
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                try {
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            int i = bufferedReader.read();
                            if (i == -1) {
                                bufferedReader.close();
                                inputStreamReader.close();
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Returning the file content without decryption for ");
                                sb3.append(strAppendSdkNameAndVersion);
                                sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, LogLevel.DEBUG, Labels.System.FILE_PROVIDER_SERVICE, "readFromInternalStorage", sb3.toString());
                                String string = sb.toString();
                                fileInputStream.close();
                                return string;
                            }
                            sb.append((char) i);
                        } finally {
                        }
                    }
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            sdkTracker.trackException("action", LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, "read from internal storage failed", e);
            return null;
        }
    }

    private static String replaceExtension(String str, String str2, String str3) {
        return str.endsWith(str2) ? str.replace(str2, str3) : str;
    }

    public static String stripSdkNameAndVersion(String str) {
        try {
            int iLastIndexOf = str.lastIndexOf(46);
            int iLastIndexOf2 = str.lastIndexOf(95, str.lastIndexOf(95, iLastIndexOf) - 1);
            StringBuilder sb = new StringBuilder();
            sb.append(str.substring(0, iLastIndexOf2));
            sb.append(str.substring(iLastIndexOf));
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    private void updateFallback(Context context, String str, String str2) {
        if (str2.endsWith("jsa") && isFilePresent(context, str2)) {
            JuspayServices juspayServices = this.juspayServices;
            StringBuilder sb = new StringBuilder("updateFallback: starting");
            sb.append(str2);
            sb.append("  ");
            sb.append(str);
            juspayServices.sdkDebug(LOG_TAG, sb.toString());
            try {
                String strMd5 = EncryptionHelper.md5(decryptGunzipInternalStorage(context, str2));
                JSONObject jSONObject = new JSONObject(this.workspace.getFromSharedPreference(PaymentConstants.JP_BLOCKED_HASH, "{}"));
                this.juspayServices.sdkDebug(LOG_TAG, "updateFallback: got the blocked hash");
                if (!jSONObject.has(str)) {
                    StringBuilder sb2 = new StringBuilder("fb/");
                    sb2.append(str2);
                    copyFile(context, str2, sb2.toString());
                    JuspayServices juspayServices2 = this.juspayServices;
                    StringBuilder sb3 = new StringBuilder("updateFallback: we didn;t get the file name from blocked hash ");
                    sb3.append(str2);
                    juspayServices2.sdkDebug(LOG_TAG, sb3.toString());
                    this.juspayServices.sdkDebug(LOG_TAG, "updateFallback: wonderful.. copying to the fallback");
                    this.juspayServices.sdkDebug(LOG_TAG, "updateFallback: file copied");
                    return;
                }
                JuspayServices juspayServices3 = this.juspayServices;
                StringBuilder sb4 = new StringBuilder("updateFallback: got the file name ");
                sb4.append(str);
                juspayServices3.sdkDebug(LOG_TAG, sb4.toString());
                JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                if (jSONObject2.has("latest_hash") && jSONObject2.getString("latest_hash").equals(strMd5)) {
                    return;
                }
                this.juspayServices.sdkDebug(LOG_TAG, "updateFallback: wonderful.. copying to the fallback");
                StringBuilder sb5 = new StringBuilder("fb/");
                sb5.append(str2);
                copyFile(context, str2, sb5.toString());
                jSONObject2.remove("latest_hash");
                jSONObject.put(str, jSONObject2);
                this.workspace.writeToSharedPreference(PaymentConstants.JP_BLOCKED_HASH, jSONObject.toString());
                this.juspayServices.sdkDebug(LOG_TAG, "updateFallback: file copied");
            } catch (FileNotFoundException e) {
                this.juspayServices.getSdkTracker().trackException("action", LogSubCategory.Action.SYSTEM, Labels.HyperSdk.AUTO_FALLBACK, "File not found: ".concat(String.valueOf(str2)), e);
            } catch (Exception e2) {
                this.juspayServices.getSdkTracker().trackException("action", LogSubCategory.Action.SYSTEM, Labels.HyperSdk.AUTO_FALLBACK, "Exception: ".concat(String.valueOf(str2)), e2);
            }
        }
    }

    private boolean writeToFile(Context context, String str, byte[] bArr, boolean z) {
        String strAppendSdkNameAndVersion = appendSdkNameAndVersion(str);
        updateFallback(context, str, strAppendSdkNameAndVersion);
        deleteFileFromCache(strAppendSdkNameAndVersion);
        return writeToFile(context, getFileFromInternalStorage(context, strAppendSdkNameAndVersion), bArr, z);
    }

    public void addToFileCacheWhiteList(String str) {
        this.fileCacheWhiteList.add(str);
    }

    public String appendSdkNameAndVersion(String str) {
        SdkInfo sdkInfo = this.juspayServices.getSdkInfo();
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf <= 0 || iLastIndexOf >= str.length() - 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("_");
            sb.append(sdkInfo.getSdkName());
            sb.append("_");
            sb.append(sdkInfo.getSdkVersion());
            return sb.toString();
        }
        String strSubstring = str.substring(0, iLastIndexOf);
        String strSubstring2 = str.substring(iLastIndexOf);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strSubstring);
        sb2.append("_");
        sb2.append(sdkInfo.getSdkName());
        sb2.append("_");
        sb2.append(sdkInfo.getSdkVersion());
        sb2.append(strSubstring2);
        return sb2.toString();
    }

    public byte[] decryptGunzipAssetFile(Context context, String str) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        byte[] assetFileAsByte = new byte[0];
        try {
            assetFileAsByte = getAssetFileAsByte(context, str);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Exception in reading ");
            sb.append(str);
            sb.append(" from assets");
            sdkTracker.trackException("action", LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, sb.toString(), e);
        }
        return EncryptionHelper.decryptThenGunzip(assetFileAsByte, EncryptionHelper.ENCRYPTED_VERSION);
    }

    public byte[] decryptGunzipInternalStorage(Context context, String str) throws FileNotFoundException {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            File fileFromInternalStorage = getFileFromInternalStorage(context, asDecryptedJSA(str));
            if (fileFromInternalStorage.exists()) {
                int length = (int) fileFromInternalStorage.length();
                byte[] bArr = new byte[length];
                FileInputStream fileInputStream = new FileInputStream(fileFromInternalStorage);
                try {
                    if (fileInputStream.read(bArr) == length) {
                        fileInputStream.close();
                        return bArr;
                    }
                    fileInputStream.close();
                } finally {
                }
            }
        } catch (Exception e) {
            try {
                StringBuilder sb = new StringBuilder("Exception in reading ");
                sb.append(asDecryptedJSA(str));
                sb.append(" from internal storage");
                sdkTracker.trackException("action", LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, sb.toString(), e);
            } catch (FileNotFoundException e2) {
                this.juspayServices.sdkDebug(LOG_TAG, "No File to decrypt in internal storage: ".concat(String.valueOf(str)));
                throw e2;
            } catch (Exception e3) {
                StringBuilder sb2 = new StringBuilder("Exception in reading ");
                sb2.append(str);
                sb2.append(" from internal storage");
                sdkTracker.trackException("action", LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, sb2.toString(), e3);
                return null;
            }
        }
        byte[] internalStorageFileAsByte = getInternalStorageFileAsByte(context, str);
        JuspayServices juspayServices = this.juspayServices;
        StringBuilder sb3 = new StringBuilder("Read Encrypted file from internalStorage - ");
        sb3.append(str);
        sb3.append(" with encrypted hash - ");
        sb3.append(EncryptionHelper.md5(internalStorageFileAsByte));
        juspayServices.sdkDebug(LOG_TAG, sb3.toString());
        return EncryptionHelper.decryptThenGunzip(internalStorageFileAsByte, EncryptionHelper.ENCRYPTED_VERSION);
    }

    public boolean deleteFileFromInternalStorage(Context context, String str) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        RemoteAssetService remoteAssetService = this.juspayServices.getRemoteAssetService();
        File fileFromInternalStorage = getFileFromInternalStorage(context, str);
        if (!fileFromInternalStorage.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" not found");
            JuspayLogger.e(LOG_TAG, sb.toString());
            return false;
        }
        JuspayServices juspayServices = this.juspayServices;
        StringBuilder sb2 = new StringBuilder("Deleting ");
        sb2.append(str);
        sb2.append(" from internal storage");
        juspayServices.sdkDebug(LOG_TAG, sb2.toString());
        JuspayLogger.e(LOG_TAG, "FILE CORRUPTED. DISABLING SDK");
        JuspayLogger.d(LOG_TAG, "Deleted file ".concat(String.valueOf(str)));
        sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, LogLevel.WARNING, Labels.System.FILE_PROVIDER_SERVICE, "file_corrupted", str);
        try {
            remoteAssetService.resetMetadata(str.replace(".zip", ".jsa"));
        } catch (Exception e) {
            sdkTracker.trackException("action", LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, "Error while resetting etag", e);
        }
        return fileFromInternalStorage.delete();
    }

    public byte[] getAssetFileAsByte(String str) {
        return getAssetFileAsByte(this.juspayServices.getContext(), str);
    }

    public byte[] getInternalStorageFileAsByte(Context context, String str) throws FileNotFoundException {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        RemoteAssetService remoteAssetService = this.juspayServices.getRemoteAssetService();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                FileInputStream fileInputStream = new FileInputStream(getFileFromInternalStorage(context, str));
                try {
                    readFromInputStream(byteArrayOutputStream, fileInputStream);
                    fileInputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException e) {
            this.juspayServices.sdkDebug(LOG_TAG, "File not found ".concat(String.valueOf(str)));
            try {
                remoteAssetService.resetMetadata(str.replace(".zip", ".jsa"));
            } catch (JSONException unused) {
                sdkTracker.trackException("action", LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, "Couldn't reset ".concat(String.valueOf(str)), e);
            }
            throw e;
        } catch (IOException e2) {
            sdkTracker.trackException("action", LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, "Could not read ".concat(String.valueOf(str)), e2);
            deleteFileFromInternalStorage(context, str);
            throw new RuntimeException(e2);
        } catch (Exception e3) {
            sdkTracker.trackException("action", LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, "Exception: Could not read ".concat(String.valueOf(str)), e3);
            deleteFileFromInternalStorage(context, str);
            throw new RuntimeException(e3);
        }
    }

    public boolean isFilePresent(Context context, String str) {
        if (this.workspace.open(appendSdkNameAndVersion(str)).exists()) {
            return true;
        }
        try {
            InputStream inputStreamOpenAsset = openAsset(context, str);
            if (inputStreamOpenAsset != null) {
                inputStreamOpenAsset.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public String[] listFiles(String str) {
        return listFiles(this.workspace.open(str));
    }

    public TempWriter newTempWriter(String str) {
        try {
            return new TempWriter(str, Mode.NEW);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public TempWriter reOpenTempWriter(String str) {
        return new TempWriter(str, Mode.RE_OPEN);
    }

    public String readFromCache(String str) {
        if (!isFileCached(str)) {
            return null;
        }
        String str2 = this.fileCache.get(str);
        this.juspayServices.sdkDebug(LOG_TAG, "Returning cached value of the file: ".concat(String.valueOf(str)));
        this.juspayServices.sdkDebug(LOG_TAG, "Cached: ".concat(String.valueOf(str2)));
        return str2;
    }

    public String readFromFile(String str) {
        return readFromFile(this.juspayServices.getContext(), str, true);
    }

    @Override // in.juspay.hyper.core.FileProviderInterface
    public void renewFile(String str, String str2, long j) {
        this.juspayServices.getRemoteAssetService().renewFile(this.juspayServices.getContext(), str, null, str2, j);
    }

    public boolean updateCertificate(Context context, String str, byte[] bArr) {
        return writeToFile(context, str, bArr, true);
    }

    public boolean updateFile(Context context, String str, byte[] bArr) {
        return writeToFile(context, str, bArr, false);
    }

    public String writeFileToDisk(Context context, String str, String str2) {
        try {
            File file = new File(context.getExternalFilesDirs(Environment.DIRECTORY_DOWNLOADS)[0].getAbsolutePath());
            file.mkdirs();
            File file2 = new File(file, str2);
            file2.createNewFile();
            if (!file2.exists()) {
                JuspayLogger.d(LOG_TAG, "Exception in creating the file");
                return String.format("{\"error\":\"true\",\"data\":\"%s\"}", "unknown_error::Exception in creating the file");
            }
            FileWriter fileWriter = new FileWriter(file2);
            fileWriter.write(str);
            fileWriter.flush();
            fileWriter.close();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error", "false");
            jSONObject.put("data", file);
            return jSONObject.toString();
        } catch (Exception e) {
            JuspayLogger.d(LOG_TAG, "Exception in downloading the file :".concat(String.valueOf(e)));
            return String.format("{\"error\":\"true\",\"data\":\"%s\"}", "unknown_error::".concat(String.valueOf(e)));
        }
    }

    private boolean copyFile(File file, File file2) {
        FileOutputStream fileOutputStream;
        try {
            JuspayServices juspayServices = this.juspayServices;
            StringBuilder sb = new StringBuilder("copyFile: ");
            sb.append(file.getAbsolutePath());
            sb.append("   ");
            sb.append(file2.getAbsolutePath());
            juspayServices.sdkDebug(LOG_TAG, sb.toString());
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
            } finally {
            }
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        fileInputStream.close();
                        return true;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } finally {
            }
        } catch (FileNotFoundException e) {
            SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
            StringBuilder sb2 = new StringBuilder("File not found: ");
            sb2.append(file.getName());
            sdkTracker.trackException("action", LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, sb2.toString(), e);
            return false;
        } catch (Exception e2) {
            SdkTracker sdkTracker2 = this.juspayServices.getSdkTracker();
            StringBuilder sb3 = new StringBuilder("Exception: ");
            sb3.append(file.getName());
            sdkTracker2.trackException("action", LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, sb3.toString(), e2);
            return false;
        }
    }

    public byte[] getAssetFileAsByte(Context context, String str) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                InputStream inputStreamOpenAsset = openAsset(context, str);
                try {
                    readFromInputStream(byteArrayOutputStream, inputStreamOpenAsset);
                    if (inputStreamOpenAsset != null) {
                        inputStreamOpenAsset.close();
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException e) {
            sdkTracker.trackException("action", LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, "Could not read ".concat(String.valueOf(str)), e);
            throw new RuntimeException(e);
        } catch (IOException e2) {
            sdkTracker.trackException("action", LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, "Could not read ".concat(String.valueOf(str)), e2);
            deleteFileFromInternalStorage(context, str);
            throw new RuntimeException(e2);
        } catch (Exception e3) {
            sdkTracker.trackException("action", LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, "Exception: Could not read ".concat(String.valueOf(str)), e3);
            deleteFileFromInternalStorage(context, str);
            return new byte[0];
        }
    }

    @Override // in.juspay.hyper.core.FileProviderInterface
    public String readFromFile(Context context, String str) {
        return readFromFile(context, str, true);
    }

    public boolean updateFile(String str, byte[] bArr) {
        return writeToFile(this.juspayServices.getContext(), str, bArr, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] listFiles(File file) {
        if (!file.exists()) {
            return null;
        }
        File[] fileArrListFiles = file.listFiles();
        TreeSet treeSet = new TreeSet();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    treeSet.add(asEncryptedJSA(stripSdkNameAndVersion(file2.getName())));
                }
            }
        }
        return (String[]) treeSet.toArray(new String[0]);
    }

    public String readFromFile(Context context, String str, boolean z) {
        String fromCache = z ? readFromCache(str) : null;
        if (fromCache == null) {
            fromCache = readFromInternalStorage(context, str);
        }
        if (fromCache == null) {
            fromCache = readFromAssets(context, str);
        }
        if (this.fileCacheWhiteList.contains(str) && fromCache != null) {
            cacheFile(str, fromCache);
        }
        return fromCache == null ? "" : fromCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean writeToFile(Context context, File file, byte[] bArr, boolean z) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        if (!z) {
            try {
                if (file.getName().contains(".jsa")) {
                    String strAsDecryptedJSA = asDecryptedJSA(file.getName());
                    File parentFile = file.getParentFile();
                    StringBuilder sb = new StringBuilder("temp_");
                    sb.append(strAsDecryptedJSA);
                    File file2 = new File(parentFile, sb.toString());
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            fileOutputStream.write(EncryptionHelper.decryptThenGunzip(bArr, EncryptionHelper.ENCRYPTED_VERSION));
                            file2.renameTo(new File(file.getParentFile(), strAsDecryptedJSA));
                            fileOutputStream.close();
                            return true;
                        } finally {
                        }
                    } catch (Exception e) {
                        StringBuilder sb2 = new StringBuilder("Exception writing decrypted js file ");
                        sb2.append(strAsDecryptedJSA);
                        sdkTracker.trackException("action", LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, sb2.toString(), e);
                        return true;
                    }
                }
            } catch (FileNotFoundException e2) {
                StringBuilder sb3 = new StringBuilder("File not found: ");
                sb3.append(file.getName());
                sdkTracker.trackException("action", LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, sb3.toString(), e2);
                return false;
            } catch (IOException e3) {
                StringBuilder sb4 = new StringBuilder("IOException: ");
                sb4.append(file.getName());
                sdkTracker.trackException("action", LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, sb4.toString(), e3);
                return false;
            } catch (Exception e4) {
                StringBuilder sb5 = new StringBuilder("Exception: ");
                sb5.append(file.getName());
                sdkTracker.trackException("action", LogSubCategory.Action.SYSTEM, Labels.System.FILE_PROVIDER_SERVICE, sb5.toString(), e4);
                return false;
            }
        }
        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
        try {
            fileOutputStream2.write(bArr);
            fileOutputStream2.close();
            return true;
        } catch (Throwable th) {
            try {
                fileOutputStream2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
