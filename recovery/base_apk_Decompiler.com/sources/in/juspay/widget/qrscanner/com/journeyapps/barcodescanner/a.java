package in.juspay.widget.qrscanner.com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.onProgress;

/* JADX INFO: loaded from: classes5.dex */
public class a extends ViewGroup {
    private static final String A = "a";
    private in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.b a;
    private WindowManager b;
    private Handler c;
    private boolean d;
    private SurfaceView e;
    private TextureView f;
    private boolean g;
    private h h;
    private int i;
    private List<f> j;
    private in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.h k;
    private in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.d l;
    private i m;
    private i n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Rect f2o;
    private i p;
    private Rect q;
    private Rect r;
    private i s;
    private double t;
    private l u;
    private boolean v;
    private final SurfaceHolder.Callback w;
    private final Handler.Callback x;
    private g y;
    private final f z;

    /* JADX INFO: renamed from: in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.a$a, reason: collision with other inner class name */
    class TextureViewSurfaceTextureListenerC0011a implements TextureView.SurfaceTextureListener {
        TextureViewSurfaceTextureListenerC0011a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            a.this.p = new i(i, i2);
            a.this.i();
        }
    }

    class b implements SurfaceHolder.Callback {
        b() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            if (surfaceHolder == null) {
                String unused = a.A;
                return;
            }
            a.this.p = new i(i2, i3);
            a.this.i();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            a.this.p = null;
        }
    }

    class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == onProgress.RemoteActionCompatParcelizer.zxing_prewiew_size_ready) {
                a.this.b((i) message.obj);
                return true;
            }
            if (i != onProgress.RemoteActionCompatParcelizer.zxing_camera_error) {
                if (i != onProgress.RemoteActionCompatParcelizer.zxing_camera_closed) {
                    return false;
                }
                a.this.z.d();
                return false;
            }
            Exception exc = (Exception) message.obj;
            if (!a.this.e()) {
                return false;
            }
            a.this.pause();
            a.this.z.a(exc);
            return false;
        }
    }

    class d implements g {

        /* JADX INFO: renamed from: in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.a$d$a, reason: collision with other inner class name */
        class RunnableC0012a implements Runnable {
            RunnableC0012a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.g();
            }
        }

        d() {
        }

        @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.g
        public void a(int i) {
            a.this.c.postDelayed(new RunnableC0012a(), 250L);
        }
    }

    class e implements f {
        e() {
        }

        @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.a.f
        public void a() {
            Iterator it = a.this.j.iterator();
            while (it.hasNext()) {
                ((f) it.next()).a();
            }
        }

        @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.a.f
        public void a(Exception exc) {
            Iterator it = a.this.j.iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(exc);
            }
        }

        @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.a.f
        public void b() {
            Iterator it = a.this.j.iterator();
            while (it.hasNext()) {
                ((f) it.next()).b();
            }
        }

        @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.a.f
        public void c() {
            Iterator it = a.this.j.iterator();
            while (it.hasNext()) {
                ((f) it.next()).c();
            }
        }

        @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.a.f
        public void d() {
            Iterator it = a.this.j.iterator();
            while (it.hasNext()) {
                ((f) it.next()).d();
            }
        }
    }

    public interface f {
        void a();

        void a(Exception exc);

        void b();

        void c();

        void d();
    }

    protected void f() {
    }

    public a(Context context) {
        super(context);
        this.d = false;
        this.g = false;
        this.i = -1;
        this.j = new ArrayList();
        this.l = new in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.d();
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = 0.1d;
        this.u = null;
        this.v = false;
        this.w = new b();
        this.x = new c();
        this.y = new d();
        this.z = new e();
        a(context, null, 0, 0);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = false;
        this.g = false;
        this.i = -1;
        this.j = new ArrayList();
        this.l = new in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.d();
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = 0.1d;
        this.u = null;
        this.v = false;
        this.w = new b();
        this.x = new c();
        this.y = new d();
        this.z = new e();
        a(context, attributeSet, 0, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = false;
        this.g = false;
        this.i = -1;
        this.j = new ArrayList();
        this.l = new in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.d();
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = 0.1d;
        this.u = null;
        this.v = false;
        this.w = new b();
        this.x = new c();
        this.y = new d();
        this.z = new e();
        a(context, attributeSet, i, 0);
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        a(attributeSet);
        this.b = (WindowManager) context.getSystemService("window");
        this.c = new Handler(this.x);
        this.h = new h();
    }

    private void a(i iVar) {
        this.m = iVar;
        in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.b bVar = this.a;
        if (bVar == null || bVar.d() != null) {
            return;
        }
        in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.h hVar = new in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.h(getDisplayRotation(), iVar);
        this.k = hVar;
        hVar.a(getPreviewScalingStrategy());
        this.a.a(this.k);
        this.a.c();
        boolean z = this.v;
        if (z) {
            this.a.a(z);
        }
    }

    private void a(in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.e eVar) {
        in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.b bVar;
        if (this.g || (bVar = this.a) == null) {
            return;
        }
        bVar.a(eVar);
        this.a.h();
        this.g = true;
        f();
        this.z.c();
    }

    private void b() {
        i iVar;
        in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.h hVar;
        i iVar2 = this.m;
        if (iVar2 == null || (iVar = this.n) == null || (hVar = this.k) == null) {
            this.r = null;
            this.q = null;
            this.f2o = null;
            throw new IllegalStateException("containerSize or previewSize is not set yet");
        }
        int i = iVar.a;
        int i2 = iVar.b;
        int i3 = iVar2.a;
        int i4 = iVar2.b;
        this.f2o = hVar.a(iVar);
        this.q = a(new Rect(0, 0, i3, i4), this.f2o);
        Rect rect = new Rect(this.q);
        Rect rect2 = this.f2o;
        rect.offset(-rect2.left, -rect2.top);
        Rect rect3 = new Rect((rect.left * i) / this.f2o.width(), (rect.top * i2) / this.f2o.height(), (rect.right * i) / this.f2o.width(), (rect.bottom * i2) / this.f2o.height());
        this.r = rect3;
        if (rect3.width() > 0 && this.r.height() > 0) {
            this.z.a();
        } else {
            this.r = null;
            this.q = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(i iVar) {
        this.n = iVar;
        if (this.m != null) {
            b();
            requestLayout();
            i();
        }
    }

    private void d() {
        if (this.a != null) {
            return;
        }
        in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.b bVarC = c();
        this.a = bVarC;
        bVarC.a(this.c);
        this.a.g();
        this.i = getDisplayRotation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (!e() || getDisplayRotation() == this.i) {
            return;
        }
        pause();
        resume();
    }

    private int getDisplayRotation() {
        return this.b.getDefaultDisplay().getRotation();
    }

    private void h() {
        View view;
        if (this.d) {
            TextureView textureView = new TextureView(getContext());
            this.f = textureView;
            textureView.setSurfaceTextureListener(j());
            view = this.f;
        } else {
            SurfaceView surfaceView = new SurfaceView(getContext());
            this.e = surfaceView;
            surfaceView.getHolder().addCallback(this.w);
            view = this.e;
        }
        addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        Rect rect;
        in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.e eVar;
        i iVar = this.p;
        if (iVar == null || this.n == null || (rect = this.f2o) == null) {
            return;
        }
        if (this.e == null || !iVar.equals(new i(rect.width(), this.f2o.height()))) {
            TextureView textureView = this.f;
            if (textureView == null || textureView.getSurfaceTexture() == null) {
                return;
            }
            if (this.n != null) {
                this.f.setTransform(a(new i(this.f.getWidth(), this.f.getHeight()), this.n));
            }
            eVar = new in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.e(this.f.getSurfaceTexture());
        } else {
            eVar = new in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.e(this.e.getHolder());
        }
        a(eVar);
    }

    private TextureView.SurfaceTextureListener j() {
        return new TextureViewSurfaceTextureListenerC0011a();
    }

    protected Matrix a(i iVar, i iVar2) {
        float f2;
        float f3 = iVar.a / iVar.b;
        float f4 = iVar2.a / iVar2.b;
        float f5 = 1.0f;
        if (f3 < f4) {
            float f6 = f4 / f3;
            f2 = 1.0f;
            f5 = f6;
        } else {
            f2 = f3 / f4;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f5, f2);
        float f7 = iVar.a;
        float f8 = iVar.b;
        matrix.postTranslate((f7 - (f5 * f7)) / 2.0f, (f8 - (f2 * f8)) / 2.0f);
        return matrix;
    }

    protected Rect a(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        if (this.s != null) {
            rect3.inset(Math.max(0, (rect3.width() - this.s.a) / 2), Math.max(0, (rect3.height() - this.s.b) / 2));
            return rect3;
        }
        int iMin = (int) Math.min(((double) rect3.width()) * this.t, ((double) rect3.height()) * this.t);
        rect3.inset(iMin, iMin);
        if (rect3.height() > rect3.width()) {
            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
        }
        return rect3;
    }

    protected void a(AttributeSet attributeSet) {
        l jVar;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, onProgress.AudioAttributesImplBaseParcelizer.zxing_camera_preview);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(onProgress.AudioAttributesImplBaseParcelizer.zxing_camera_preview_zxing_framing_rect_width, -1.0f);
        int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(onProgress.AudioAttributesImplBaseParcelizer.zxing_camera_preview_zxing_framing_rect_height, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.s = new i(dimension, dimension2);
        }
        this.d = typedArrayObtainStyledAttributes.getBoolean(onProgress.AudioAttributesImplBaseParcelizer.zxing_camera_preview_zxing_use_texture_view, true);
        int integer = typedArrayObtainStyledAttributes.getInteger(onProgress.AudioAttributesImplBaseParcelizer.zxing_camera_preview_zxing_preview_scaling_strategy, -1);
        if (integer == 1) {
            jVar = new in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.g();
        } else {
            if (integer != 2) {
                if (integer == 3) {
                    jVar = new in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.j();
                }
                typedArrayObtainStyledAttributes.recycle();
            }
            jVar = new in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.i();
        }
        this.u = jVar;
        typedArrayObtainStyledAttributes.recycle();
    }

    public void addStateListener(f fVar) {
        this.j.add(fVar);
    }

    protected in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.b c() {
        in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.b bVar = new in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.b(getContext());
        bVar.a(this.l);
        return bVar;
    }

    protected boolean e() {
        return this.a != null;
    }

    public in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.b getCameraInstance() {
        return this.a;
    }

    public in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.d getCameraSettings() {
        return this.l;
    }

    public Rect getFramingRect() {
        return this.q;
    }

    public i getFramingRectSize() {
        return this.s;
    }

    public double getMarginFraction() {
        return this.t;
    }

    public Rect getPreviewFramingRect() {
        return this.r;
    }

    public l getPreviewScalingStrategy() {
        l lVar = this.u;
        return lVar != null ? lVar : this.f != null ? new in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.g() : new in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.i();
    }

    public boolean isCameraClosed() {
        in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.b bVar = this.a;
        return bVar == null || bVar.f();
    }

    public boolean isPreviewActive() {
        return this.g;
    }

    public boolean isUseTextureView() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        a(new i(i3 - i, i4 - i2));
        SurfaceView surfaceView = this.e;
        if (surfaceView == null) {
            TextureView textureView = this.f;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
                return;
            }
            return;
        }
        Rect rect = this.f2o;
        if (rect == null) {
            surfaceView.layout(0, 0, getWidth(), getHeight());
        } else {
            surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", parcelableOnSaveInstanceState);
        bundle.putBoolean("torch", this.v);
        return bundle;
    }

    public void pause() {
        TextureView textureView;
        SurfaceView surfaceView;
        k.a();
        this.i = -1;
        in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.b bVar = this.a;
        if (bVar != null) {
            bVar.b();
            this.a = null;
            this.g = false;
        } else {
            this.c.sendEmptyMessage(onProgress.RemoteActionCompatParcelizer.zxing_camera_closed);
        }
        if (this.p == null && (surfaceView = this.e) != null) {
            surfaceView.getHolder().removeCallback(this.w);
        }
        if (this.p == null && (textureView = this.f) != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.m = null;
        this.n = null;
        this.r = null;
        this.h.a();
        this.z.b();
    }

    public void pauseAndWait() {
        in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.b cameraInstance = getCameraInstance();
        pause();
        long jNanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.f() && System.nanoTime() - jNanoTime <= 2000000000) {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public void resume() {
        k.a();
        d();
        if (this.p != null) {
            i();
        } else {
            SurfaceView surfaceView = this.e;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.w);
            } else {
                TextureView textureView = this.f;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        j().onSurfaceTextureAvailable(this.f.getSurfaceTexture(), this.f.getWidth(), this.f.getHeight());
                    } else {
                        this.f.setSurfaceTextureListener(j());
                    }
                }
            }
        }
        requestLayout();
        this.h.a(getContext(), this.y);
    }

    public void setCameraSettings(in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.d dVar) {
        this.l = dVar;
    }

    public void setFramingRectSize(i iVar) {
        this.s = iVar;
    }

    public void setMarginFraction(double d2) {
        if (d2 >= 0.5d) {
            throw new IllegalArgumentException("The margin fraction must be less than 0.5");
        }
        this.t = d2;
    }

    public void setPreviewScalingStrategy(l lVar) {
        this.u = lVar;
    }

    public void setTorch(boolean z) {
        this.v = z;
        in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.l.b bVar = this.a;
        if (bVar != null) {
            bVar.a(z);
        }
    }

    public void setUseTextureView(boolean z) {
        this.d = z;
    }
}
