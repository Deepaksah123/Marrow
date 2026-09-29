package kotlin;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class _isNegInf extends ContentProvider {
    private static final String[] IconCompatParcelizer = {"_display_name", "_size"};
    private static final File read = new File("/");
    private static final HashMap<String, IconCompatParcelizer> write = new HashMap<>();
    private String AudioAttributesCompatParcelizer;
    private final int AudioAttributesImplApi21Parcelizer;
    private final Object MediaBrowserCompatItemReceiver;
    private IconCompatParcelizer RemoteActionCompatParcelizer;

    interface IconCompatParcelizer {
        File read(Uri uri);

        Uri write(File file);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    public _isNegInf() {
        this((byte) 0);
    }

    private _isNegInf(byte b) {
        this.MediaBrowserCompatItemReceiver = new Object();
        this.AudioAttributesImplApi21Parcelizer = 0;
    }

    public static Uri AudioAttributesCompatParcelizer(Context context, String str, File file) {
        return write(context, str, 0).write(file);
    }

    private static IconCompatParcelizer write(Context context, String str, int i) {
        IconCompatParcelizer iconCompatParcelizer;
        HashMap<String, IconCompatParcelizer> map = write;
        synchronized (map) {
            iconCompatParcelizer = map.get(str);
            if (iconCompatParcelizer == null) {
                try {
                    try {
                        iconCompatParcelizer = read(context, str, i);
                        map.put(str, iconCompatParcelizer);
                    } catch (XmlPullParserException e) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                    }
                } catch (IOException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return iconCompatParcelizer;
    }

    private static XmlResourceParser IconCompatParcelizer(Context context, String str, ProviderInfo providerInfo, int i) {
        if (providerInfo == null) {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority ".concat(String.valueOf(str)));
        }
        if (((PackageItemInfo) providerInfo).metaData == null && i != 0) {
            ((PackageItemInfo) providerInfo).metaData = new Bundle(1);
            ((PackageItemInfo) providerInfo).metaData.putInt("android.support.FILE_PROVIDER_PATHS", i);
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (xmlResourceParserLoadXmlMetaData != null) {
            return xmlResourceParserLoadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    private static IconCompatParcelizer read(Context context, String str, int i) throws XmlPullParserException, IOException {
        write writeVar = new write(str);
        XmlResourceParser xmlResourceParserIconCompatParcelizer = IconCompatParcelizer(context, str, context.getPackageManager().resolveContentProvider(str, 128), i);
        while (true) {
            int next = xmlResourceParserIconCompatParcelizer.next();
            if (next == 1) {
                return writeVar;
            }
            if (next == 2) {
                String name = xmlResourceParserIconCompatParcelizer.getName();
                File externalStorageDirectory = null;
                String attributeValue = xmlResourceParserIconCompatParcelizer.getAttributeValue(null, "name");
                String attributeValue2 = xmlResourceParserIconCompatParcelizer.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    externalStorageDirectory = read;
                } else if ("files-path".equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] externalFilesDirs = _isNaN.getExternalFilesDirs(context, null);
                    if (externalFilesDirs.length > 0) {
                        externalStorageDirectory = externalFilesDirs[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] externalCacheDirs = _isNaN.getExternalCacheDirs(context);
                    if (externalCacheDirs.length > 0) {
                        externalStorageDirectory = externalCacheDirs[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] fileArrRemoteActionCompatParcelizer = read.RemoteActionCompatParcelizer(context);
                    if (fileArrRemoteActionCompatParcelizer.length > 0) {
                        externalStorageDirectory = fileArrRemoteActionCompatParcelizer[0];
                    }
                }
                if (externalStorageDirectory != null) {
                    writeVar.write(attributeValue, IconCompatParcelizer(externalStorageDirectory, attributeValue2));
                }
            }
        }
    }

    private static int read(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: ".concat(String.valueOf(str)));
    }

    private static File IconCompatParcelizer(File file, String... strArr) {
        int length = strArr.length;
        for (int i = 0; i <= 0; i++) {
            String str = strArr[0];
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static String[] IconCompatParcelizer(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    private static Object[] AudioAttributesCompatParcelizer(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String AudioAttributesCompatParcelizer(String str) {
        return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (((ComponentInfo) providerInfo).exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        if (providerInfo.authority == null || providerInfo.authority.trim().isEmpty()) {
            throw new SecurityException("Provider must have a non-empty authority");
        }
        String str = providerInfo.authority.split(";")[0];
        synchronized (this.MediaBrowserCompatItemReceiver) {
            this.AudioAttributesCompatParcelizer = str;
        }
        HashMap<String, IconCompatParcelizer> map = write;
        synchronized (map) {
            map.remove(str);
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File file = write().read(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = IconCompatParcelizer;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = queryParameter == null ? file.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(file.length());
            }
            i2 = i;
        }
        String[] strArrIconCompatParcelizer = IconCompatParcelizer(strArr3, i2);
        Object[] objArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArrIconCompatParcelizer, 1);
        matrixCursor.addRow(objArrAudioAttributesCompatParcelizer);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File file = write().read(uri);
        int iLastIndexOf = file.getName().lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(file.getName().substring(iLastIndexOf + 1));
            return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
        }
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return write().read(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(write().read(uri), read(str));
    }

    private IconCompatParcelizer write() {
        IconCompatParcelizer iconCompatParcelizer;
        synchronized (this.MediaBrowserCompatItemReceiver) {
            configureFromStringCreator.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
            if (this.RemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = write(getContext(), this.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi21Parcelizer);
            }
            iconCompatParcelizer = this.RemoteActionCompatParcelizer;
        }
        return iconCompatParcelizer;
    }

    static class write implements IconCompatParcelizer {
        private final HashMap<String, File> AudioAttributesCompatParcelizer = new HashMap<>();
        private final String RemoteActionCompatParcelizer;

        write(String str) {
            this.RemoteActionCompatParcelizer = str;
        }

        final void write(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.AudioAttributesCompatParcelizer.put(str, file.getCanonicalFile());
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(String.valueOf(file)), e);
            }
        }

        @Override // o._isNegInf.IconCompatParcelizer
        public final Uri write(File file) {
            String strSubstring;
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.AudioAttributesCompatParcelizer.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (read(canonicalPath, path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains ".concat(String.valueOf(canonicalPath)));
                }
                String path2 = entry.getValue().getPath();
                if (path2.endsWith("/")) {
                    strSubstring = canonicalPath.substring(path2.length());
                } else {
                    strSubstring = canonicalPath.substring(path2.length() + 1);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(Uri.encode(entry.getKey()));
                sb.append('/');
                sb.append(Uri.encode(strSubstring, "/"));
                return new Uri.Builder().scheme("content").authority(this.RemoteActionCompatParcelizer).encodedPath(sb.toString()).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(String.valueOf(file)));
            }
        }

        @Override // o._isNegInf.IconCompatParcelizer
        public final File read(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int iIndexOf = encodedPath.indexOf(47, 1);
            if (iIndexOf == -1) {
                throw new IllegalArgumentException("Unable to find path from root: ".concat(String.valueOf(uri)));
            }
            String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
            String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
            File file = this.AudioAttributesCompatParcelizer.get(strDecode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for ".concat(String.valueOf(uri)));
            }
            File file2 = new File(file, strDecode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (read(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(String.valueOf(file2)));
            }
        }

        private static boolean read(String str, String str2) {
            String strAudioAttributesCompatParcelizer = _isNegInf.AudioAttributesCompatParcelizer(str);
            String strAudioAttributesCompatParcelizer2 = _isNegInf.AudioAttributesCompatParcelizer(str2);
            StringBuilder sb = new StringBuilder();
            sb.append(strAudioAttributesCompatParcelizer2);
            sb.append('/');
            return strAudioAttributesCompatParcelizer.startsWith(sb.toString());
        }
    }

    static class read {
        static File[] RemoteActionCompatParcelizer(Context context) {
            return context.getExternalMediaDirs();
        }
    }
}
