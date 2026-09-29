package kotlin;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeSerializer1 {

    public static final class IconCompatParcelizer extends Exception {
        public IconCompatParcelizer(String str) {
            super(str);
        }
    }

    public static void IconCompatParcelizer(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }

    public static boolean read(Context context) {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 24) {
            return false;
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 26 && ("samsung".equals(LaissezFaireSubTypeValidator.read) || "XT1650".equals(LaissezFaireSubTypeValidator.MediaBrowserCompatItemReceiver))) {
            return false;
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return RemoteActionCompatParcelizer("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean read() {
        return RemoteActionCompatParcelizer("EGL_KHR_surfaceless_context");
    }

    public static void RemoteActionCompatParcelizer() throws IconCompatParcelizer {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                StringBuilder sb2 = new StringBuilder("error code: 0x");
                sb2.append(Integer.toHexString(iGlGetError));
                strGluErrorString = sb2.toString();
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z = true;
        }
        if (z) {
            throw new IconCompatParcelizer(sb.toString());
        }
    }

    public static FloatBuffer read(float[] fArr) {
        return (FloatBuffer) RemoteActionCompatParcelizer(fArr.length).put(fArr).flip();
    }

    private static FloatBuffer RemoteActionCompatParcelizer(int i) {
        return ByteBuffer.allocateDirect(i << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static int write() throws IconCompatParcelizer {
        int iIconCompatParcelizer = IconCompatParcelizer();
        AudioAttributesCompatParcelizer(36197, iIconCompatParcelizer);
        return iIconCompatParcelizer;
    }

    private static int IconCompatParcelizer() throws IconCompatParcelizer {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        RemoteActionCompatParcelizer();
        return iArr[0];
    }

    public static void AudioAttributesCompatParcelizer(int i, int i2) throws IconCompatParcelizer {
        GLES20.glBindTexture(i, i2);
        RemoteActionCompatParcelizer();
        GLES20.glTexParameteri(i, TarConstants.DEFAULT_BLKSIZE, 9729);
        RemoteActionCompatParcelizer();
        GLES20.glTexParameteri(i, 10241, 9729);
        RemoteActionCompatParcelizer();
        GLES20.glTexParameteri(i, 10242, 33071);
        RemoteActionCompatParcelizer();
        GLES20.glTexParameteri(i, 10243, 33071);
        RemoteActionCompatParcelizer();
    }

    public static void IconCompatParcelizer(boolean z, String str) throws IconCompatParcelizer {
        if (!z) {
            throw new IconCompatParcelizer(str);
        }
    }

    private static boolean RemoteActionCompatParcelizer(String str) {
        String strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }
}
