package in.juspay.widget.qrscanner.com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import in.juspay.widget.qrscanner.com.google.zxing.ResultPoint;
import in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.onProgress;

/* JADX INFO: loaded from: classes5.dex */
public class ViewfinderView extends View {
    protected static final int[] m = {0, 64, 128, PsExtractor.AUDIO_STREAM, 255, PsExtractor.AUDIO_STREAM, 128, 64};
    protected final Paint a;
    protected Bitmap b;
    protected final int c;
    protected final int d;
    protected final int e;
    protected final int f;
    protected int g;
    protected List<ResultPoint> h;
    protected List<ResultPoint> i;
    protected in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.a j;
    protected Rect k;
    protected Rect l;

    class a implements a.f {
        a() {
        }

        @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.a.f
        public void a(Exception exc) {
        }

        @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.a.f
        public void b() {
        }

        @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.a.f
        public void c() {
        }

        @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.a.f
        public void d() {
        }

        @Override // in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.a.f
        public void a() {
            ViewfinderView.this.a();
            ViewfinderView.this.invalidate();
        }
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Paint(1);
        Resources resources = getResources();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, onProgress.AudioAttributesImplBaseParcelizer.zxing_finder);
        this.c = typedArrayObtainStyledAttributes.getColor(onProgress.AudioAttributesImplBaseParcelizer.zxing_finder_zxing_viewfinder_mask, resources.getColor(onProgress.read.zxing_viewfinder_mask));
        this.d = typedArrayObtainStyledAttributes.getColor(onProgress.AudioAttributesImplBaseParcelizer.zxing_finder_zxing_result_view, resources.getColor(onProgress.read.zxing_result_view));
        this.e = typedArrayObtainStyledAttributes.getColor(onProgress.AudioAttributesImplBaseParcelizer.zxing_finder_zxing_viewfinder_laser, resources.getColor(onProgress.read.zxing_viewfinder_laser));
        this.f = typedArrayObtainStyledAttributes.getColor(onProgress.AudioAttributesImplBaseParcelizer.zxing_finder_zxing_possible_result_points, resources.getColor(onProgress.read.zxing_possible_result_points));
        typedArrayObtainStyledAttributes.recycle();
        this.g = 0;
        this.h = new ArrayList(20);
        this.i = new ArrayList(20);
    }

    protected void a() {
        in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.a aVar = this.j;
        if (aVar != null) {
            Rect framingRect = aVar.getFramingRect();
            Rect previewFramingRect = this.j.getPreviewFramingRect();
            if (framingRect == null || previewFramingRect == null) {
                return;
            }
            this.k = framingRect;
            this.l = previewFramingRect;
        }
    }

    public void a(ResultPoint resultPoint) {
        if (this.h.size() < 20) {
            this.h.add(resultPoint);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Rect rect;
        a();
        Rect rect2 = this.k;
        if (rect2 == null || (rect = this.l) == null) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        this.a.setColor(this.b != null ? this.d : this.c);
        float f = width;
        canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, rect2.top, this.a);
        canvas.drawRect(BitmapDescriptorFactory.HUE_RED, rect2.top, rect2.left, rect2.bottom + 1, this.a);
        canvas.drawRect(rect2.right + 1, rect2.top, f, rect2.bottom + 1, this.a);
        canvas.drawRect(BitmapDescriptorFactory.HUE_RED, rect2.bottom + 1, f, height, this.a);
        if (this.b != null) {
            this.a.setAlpha(160);
            canvas.drawBitmap(this.b, (Rect) null, rect2, this.a);
            return;
        }
        this.a.setColor(this.e);
        Paint paint = this.a;
        int[] iArr = m;
        paint.setAlpha(iArr[this.g]);
        this.g = (this.g + 1) % iArr.length;
        int iHeight = (rect2.height() / 2) + rect2.top;
        canvas.drawRect(rect2.left + 2, iHeight - 1, rect2.right - 1, iHeight + 2, this.a);
        float fWidth = rect2.width() / rect.width();
        float fHeight = rect2.height() / rect.height();
        int i = rect2.left;
        int i2 = rect2.top;
        if (!this.i.isEmpty()) {
            this.a.setAlpha(80);
            this.a.setColor(this.f);
            for (ResultPoint resultPoint : this.i) {
                canvas.drawCircle(((int) (resultPoint.getX() * fWidth)) + i, ((int) (resultPoint.getY() * fHeight)) + i2, 3.0f, this.a);
            }
            this.i.clear();
        }
        if (!this.h.isEmpty()) {
            this.a.setAlpha(160);
            this.a.setColor(this.f);
            for (ResultPoint resultPoint2 : this.h) {
                canvas.drawCircle(((int) (resultPoint2.getX() * fWidth)) + i, ((int) (resultPoint2.getY() * fHeight)) + i2, 6.0f, this.a);
            }
            List<ResultPoint> list = this.h;
            List<ResultPoint> list2 = this.i;
            this.h = list2;
            this.i = list;
            list2.clear();
        }
        postInvalidateDelayed(80L, rect2.left - 6, rect2.top - 6, rect2.right + 6, rect2.bottom + 6);
    }

    public void setCameraPreview(in.juspay.widget.qrscanner.com.journeyapps.barcodescanner.a aVar) {
        this.j = aVar;
        aVar.addStateListener(new a());
    }
}
