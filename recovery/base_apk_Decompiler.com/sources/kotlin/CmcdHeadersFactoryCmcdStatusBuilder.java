package kotlin;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.CeaDecoderExternalSyntheticLambda0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/CmcdHeadersFactoryCmcdStatusBuilder;", "", "<init>", "()V", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CmcdHeadersFactoryCmcdStatusBuilder {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o.CmcdHeadersFactoryCmcdStatusBuilder$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u001f\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0013J\u001d\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u0014"}, d2 = {"Lo/CmcdHeadersFactoryCmcdStatusBuilder$read;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "", "p1", "", "IconCompatParcelizer", "(Landroid/content/Context;Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;)V", "Ljava/io/File;", "Landroid/net/Uri;", "RemoteActionCompatParcelizer", "(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;", "(Landroid/content/Context;)Ljava/io/File;", "AudioAttributesCompatParcelizer", "read", "(Landroid/content/Context;Landroid/net/Uri;)Ljava/io/File;", "(Landroid/content/Context;Ljava/lang/String;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void IconCompatParcelizer(Context p0, r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<String> p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            CmcdConfigurationRequestConfig.write(CmcdConfigurationRequestConfig.read(p0), p1);
        }

        public final Uri RemoteActionCompatParcelizer(Context p0, File p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            if (p1 == null) {
                p1 = RemoteActionCompatParcelizer(p0);
            }
            try {
                return AudioAttributesCompatParcelizer(p0, p1);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        private static File RemoteActionCompatParcelizer(Context p0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            sb.append(jCurrentTimeMillis);
            sb.append(".jpg");
            return new File(read(p0), sb.toString());
        }

        private static Uri AudioAttributesCompatParcelizer(Context p0, File p1) {
            Uri uriAudioAttributesCompatParcelizer = _isNegInf.AudioAttributesCompatParcelizer(p0, "com.marrow.fileprovider", p1);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(uriAudioAttributesCompatParcelizer, "");
            return uriAudioAttributesCompatParcelizer;
        }

        private static File read(Context p0) {
            File externalCacheDir = p0.getExternalCacheDir();
            File file = new File(externalCacheDir, "_images");
            if (!file.exists()) {
                file.mkdirs();
            }
            if (externalCacheDir != null && file.exists()) {
                return file;
            }
            File cacheDir = p0.getCacheDir();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cacheDir, "");
            return cacheDir;
        }

        public static File AudioAttributesCompatParcelizer(Context p0, Uri p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = p0.getContentResolver().openFileDescriptor(p1, "r");
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    return null;
                }
                FileOutputStream fileInputStream = parcelFileDescriptorOpenFileDescriptor;
                try {
                    fileInputStream = new FileInputStream(fileInputStream.getFileDescriptor());
                    try {
                        FileInputStream fileInputStream2 = fileInputStream;
                        Companion companion = CmcdHeadersFactoryCmcdStatusBuilder.INSTANCE;
                        File fileRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0);
                        fileInputStream = new FileOutputStream(fileRemoteActionCompatParcelizer);
                        try {
                            FileOutputStream fileOutputStream = fileInputStream;
                            byte[] bArr = new byte[fileInputStream2.available()];
                            while (fileInputStream2.read(bArr) != -1) {
                                fileOutputStream.write(bArr);
                            }
                            getShowPopup getshowpopup = getShowPopup.INSTANCE;
                            MagicModuleMetaLSModel.IconCompatParcelizer(fileInputStream, null);
                            MagicModuleMetaLSModel.IconCompatParcelizer(fileInputStream, null);
                            MagicModuleMetaLSModel.IconCompatParcelizer(fileInputStream, null);
                            return fileRemoteActionCompatParcelizer;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        public static void RemoteActionCompatParcelizer(Context p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            CeaDecoderExternalSyntheticLambda0.Companion companion = CeaDecoderExternalSyntheticLambda0.INSTANCE;
            p0.startActivity(CeaDecoderExternalSyntheticLambda0.Companion.RemoteActionCompatParcelizer(p0, p1));
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
