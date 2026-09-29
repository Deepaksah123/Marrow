package kotlin;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import kotlin.TypeSerializer1;

/* JADX INFO: loaded from: classes2.dex */
public final class _locateTypeId implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    private static final int[] IconCompatParcelizer = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    private final write AudioAttributesCompatParcelizer;
    private EGLSurface AudioAttributesImplApi21Parcelizer;
    private SurfaceTexture AudioAttributesImplBaseParcelizer;
    private final int[] MediaBrowserCompatCustomActionResultReceiver;
    private EGLContext RemoteActionCompatParcelizer;
    private EGLDisplay read;
    private final Handler write;

    public interface write {
    }

    public _locateTypeId(Handler handler) {
        this(handler, (byte) 0);
    }

    private _locateTypeId(Handler handler, byte b) {
        this.write = handler;
        this.AudioAttributesCompatParcelizer = null;
        this.MediaBrowserCompatCustomActionResultReceiver = new int[1];
    }

    public final void IconCompatParcelizer(int i) throws TypeSerializer1.IconCompatParcelizer {
        EGLDisplay eGLDisplayRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        this.read = eGLDisplayRemoteActionCompatParcelizer;
        EGLConfig eGLConfigIconCompatParcelizer = IconCompatParcelizer(eGLDisplayRemoteActionCompatParcelizer);
        EGLContext eGLContext = read(this.read, eGLConfigIconCompatParcelizer, i);
        this.RemoteActionCompatParcelizer = eGLContext;
        this.AudioAttributesImplApi21Parcelizer = read(this.read, eGLConfigIconCompatParcelizer, eGLContext, i);
        RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.MediaBrowserCompatCustomActionResultReceiver[0]);
        this.AudioAttributesImplBaseParcelizer = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void IconCompatParcelizer() {
        this.write.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.AudioAttributesImplBaseParcelizer;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.MediaBrowserCompatCustomActionResultReceiver, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.read;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.read;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.AudioAttributesImplApi21Parcelizer;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.read, this.AudioAttributesImplApi21Parcelizer);
            }
            EGLContext eGLContext = this.RemoteActionCompatParcelizer;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.read, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.read;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.read);
            }
            this.read = null;
            this.RemoteActionCompatParcelizer = null;
            this.AudioAttributesImplApi21Parcelizer = null;
            this.AudioAttributesImplBaseParcelizer = null;
        }
    }

    public final SurfaceTexture AudioAttributesCompatParcelizer() {
        return (SurfaceTexture) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.write.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.AudioAttributesImplBaseParcelizer;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    private static EGLDisplay RemoteActionCompatParcelizer() throws TypeSerializer1.IconCompatParcelizer {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        TypeSerializer1.IconCompatParcelizer(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        TypeSerializer1.IconCompatParcelizer(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eGLDisplayEglGetDisplay;
    }

    private static EGLConfig IconCompatParcelizer(EGLDisplay eGLDisplay) throws TypeSerializer1.IconCompatParcelizer {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, IconCompatParcelizer, 0, eGLConfigArr, 0, 1, iArr, 0);
        boolean z = zEglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null;
        TypeSerializer1.IconCompatParcelizer(z, LaissezFaireSubTypeValidator.read("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    private static EGLContext read(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) throws TypeSerializer1.IconCompatParcelizer {
        int[] iArr;
        if (i == 0) {
            iArr = new int[]{12440, 2, 12344};
        } else {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        }
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        TypeSerializer1.IconCompatParcelizer(eGLContextEglCreateContext != null, "eglCreateContext failed");
        return eGLContextEglCreateContext;
    }

    private static EGLSurface read(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) throws TypeSerializer1.IconCompatParcelizer {
        int[] iArr;
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i == 2) {
                iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr = new int[]{12375, 1, 12374, 1, 12344};
            }
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
            TypeSerializer1.IconCompatParcelizer(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        TypeSerializer1.IconCompatParcelizer(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    private static void RemoteActionCompatParcelizer(int[] iArr) throws TypeSerializer1.IconCompatParcelizer {
        GLES20.glGenTextures(1, iArr, 0);
        TypeSerializer1.RemoteActionCompatParcelizer();
    }
}
