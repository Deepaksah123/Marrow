package in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import in.juspay.widget.qrscanner.com.google.zxing.client.android.AmbientLightManager;
import in.juspay.widget.qrscanner.com.google.zxing.client.android.camera.CameraConfigurationUtils;
import in.juspay.widget.qrscanner.com.google.zxing.client.android.camera.open.OpenCameraInterface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class c {
    private static final String n = "c";
    private Camera a;
    private Camera.CameraInfo b;
    private in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.a c;
    private AmbientLightManager d;
    private boolean e;
    private String f;
    private h h;
    private in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i i;
    private in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i j;
    private Context l;
    private d g = new d();
    private int k = -1;
    private final a m = new a();

    final class a implements Camera.PreviewCallback {
        private k a;
        private in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i b;

        public a() {
        }

        public final void a(in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVar) {
            this.b = iVar;
        }

        public final void a(k kVar) {
            this.a = kVar;
        }

        @Override // android.hardware.Camera.PreviewCallback
        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            Exception e;
            in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVar = this.b;
            k kVar = this.a;
            if (iVar == null || kVar == null) {
                String unused = c.n;
                if (kVar == null) {
                    return;
                } else {
                    e = new Exception("No resolution available");
                }
            } else {
                try {
                    if (bArr == null) {
                        throw new NullPointerException("No preview data received");
                    }
                    kVar.a(new in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.j(bArr, iVar.a, iVar.b, camera.getParameters().getPreviewFormat(), c.this.e()));
                    return;
                } catch (RuntimeException e2) {
                    e = e2;
                    String unused2 = c.n;
                }
            }
            kVar.a(e);
        }
    }

    public c(Context context) {
        this.l = context;
    }

    private static List<in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i> a(Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                arrayList.add(new in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i(previewSize.width, previewSize.height));
                return arrayList;
            }
        } else {
            for (Camera.Size size : supportedPreviewSizes) {
                arrayList.add(new in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i(size.width, size.height));
            }
        }
        return arrayList;
    }

    private void a(int i) {
        this.a.setDisplayOrientation(i);
    }

    private void a(boolean z) {
        Camera.Parameters parametersF = f();
        if (parametersF == null) {
            return;
        }
        parametersF.flatten();
        CameraConfigurationUtils.setFocus(parametersF, this.g.a(), z);
        if (!z) {
            CameraConfigurationUtils.setTorch(parametersF, false);
            if (this.g.h()) {
                CameraConfigurationUtils.setInvertColor(parametersF);
            }
            if (this.g.e()) {
                CameraConfigurationUtils.setBarcodeSceneMode(parametersF);
            }
            if (this.g.g()) {
                CameraConfigurationUtils.setVideoStabilization(parametersF);
                CameraConfigurationUtils.setFocusArea(parametersF);
                CameraConfigurationUtils.setMetering(parametersF);
            }
        }
        List<in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i> listA = a(parametersF);
        if (listA.size() == 0) {
            this.i = null;
        } else {
            in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVarA = this.h.a(listA, h());
            this.i = iVarA;
            parametersF.setPreviewSize(iVarA.a, iVarA.b);
        }
        if (Build.DEVICE.equals("glass-1")) {
            CameraConfigurationUtils.setBestPreviewFPS(parametersF);
        }
        parametersF.flatten();
        this.a.setParameters(parametersF);
    }

    private int b() {
        int iA = this.h.a();
        int i = 0;
        if (iA != 0) {
            if (iA == 1) {
                i = 90;
            } else if (iA == 2) {
                i = 180;
            } else if (iA == 3) {
                i = 270;
            }
        }
        Camera.CameraInfo cameraInfo = this.b;
        int i2 = cameraInfo.facing;
        int i3 = cameraInfo.orientation;
        return (i2 == 1 ? 360 - ((i3 + i) % 360) : (i3 - i) + 360) % 360;
    }

    private Camera.Parameters f() {
        Camera.Parameters parameters = this.a.getParameters();
        String str = this.f;
        if (str == null) {
            this.f = parameters.flatten();
            return parameters;
        }
        parameters.unflatten(str);
        return parameters;
    }

    private void k() {
        try {
            int iB = b();
            this.k = iB;
            a(iB);
        } catch (Exception unused) {
        }
        try {
            a(false);
        } catch (Exception unused2) {
            try {
                a(true);
            } catch (Exception unused3) {
            }
        }
        Camera.Size previewSize = this.a.getParameters().getPreviewSize();
        if (previewSize == null) {
            this.j = this.i;
        } else {
            this.j = new in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i(previewSize.width, previewSize.height);
        }
        this.m.a(this.j);
    }

    public final void a(d dVar) {
        this.g = dVar;
    }

    public final void a(e eVar) throws IOException {
        eVar.a(this.a);
    }

    public final void a(h hVar) {
        this.h = hVar;
    }

    public final void a(k kVar) {
        Camera camera = this.a;
        if (camera == null || !this.e) {
            return;
        }
        this.m.a(kVar);
        camera.setOneShotPreviewCallback(this.m);
    }

    public final void b(boolean z) {
        if (this.a != null) {
            try {
                if (z != i()) {
                    in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.a aVar = this.c;
                    if (aVar != null) {
                        aVar.e();
                    }
                    Camera.Parameters parameters = this.a.getParameters();
                    CameraConfigurationUtils.setTorch(parameters, z);
                    if (this.g.f()) {
                        CameraConfigurationUtils.setBestExposure(parameters, z);
                    }
                    this.a.setParameters(parameters);
                    in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.a aVar2 = this.c;
                    if (aVar2 != null) {
                        aVar2.d();
                    }
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    public final void c() {
        Camera camera = this.a;
        if (camera != null) {
            camera.release();
            this.a = null;
        }
    }

    public final void d() {
        if (this.a == null) {
            throw new RuntimeException("Camera not open");
        }
        k();
    }

    public final int e() {
        return this.k;
    }

    public final in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i g() {
        if (this.j == null) {
            return null;
        }
        boolean zH = h();
        in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.i iVar = this.j;
        return zH ? iVar.a() : iVar;
    }

    public final boolean h() {
        int i = this.k;
        if (i != -1) {
            return i % 180 != 0;
        }
        throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
    }

    public final boolean i() {
        String flashMode;
        Camera.Parameters parameters = this.a.getParameters();
        if (parameters == null || (flashMode = parameters.getFlashMode()) == null) {
            return false;
        }
        return "on".equals(flashMode) || "torch".equals(flashMode);
    }

    public final void j() {
        Camera cameraOpen = OpenCameraInterface.open(this.g.b());
        this.a = cameraOpen;
        if (cameraOpen == null) {
            throw new RuntimeException("Failed to open camera");
        }
        int cameraId = OpenCameraInterface.getCameraId(this.g.b());
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.b = cameraInfo;
        Camera.getCameraInfo(cameraId, cameraInfo);
    }

    public final void l() {
        Camera camera = this.a;
        if (camera == null || this.e) {
            return;
        }
        camera.startPreview();
        this.e = true;
        this.c = new in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.a(this.a, this.g);
        AmbientLightManager ambientLightManager = new AmbientLightManager(this.l, this, this.g);
        this.d = ambientLightManager;
        ambientLightManager.start();
    }

    public final void m() {
        in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.a aVar = this.c;
        if (aVar != null) {
            aVar.e();
            this.c = null;
        }
        AmbientLightManager ambientLightManager = this.d;
        if (ambientLightManager != null) {
            ambientLightManager.stop();
            this.d = null;
        }
        Camera camera = this.a;
        if (camera == null || !this.e) {
            return;
        }
        camera.stopPreview();
        this.m.a((k) null);
        this.e = false;
    }
}
