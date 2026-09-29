package kotlin;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;

/* JADX INFO: loaded from: classes5.dex */
final class hasGaplessInfo extends ForwardingExtractorInput<CircularProgressIndicatorSpec> {
    private float AudioAttributesImplApi26Parcelizer;
    private float RemoteActionCompatParcelizer;
    private float read;
    private int write;

    public hasGaplessInfo(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.write = 1;
    }

    @Override // kotlin.ForwardingExtractorInput
    public final int write() {
        return read();
    }

    @Override // kotlin.ForwardingExtractorInput
    public final int RemoteActionCompatParcelizer() {
        return read();
    }

    @Override // kotlin.ForwardingExtractorInput
    public final void AudioAttributesCompatParcelizer(Canvas canvas, Rect rect, float f) {
        float fWidth = rect.width() / write();
        float fHeight = rect.height() / RemoteActionCompatParcelizer();
        float f2 = (((CircularProgressIndicatorSpec) this.AudioAttributesCompatParcelizer).AudioAttributesImplApi26Parcelizer / 2.0f) + ((CircularProgressIndicatorSpec) this.AudioAttributesCompatParcelizer).MediaBrowserCompatItemReceiver;
        canvas.translate((f2 * fWidth) + rect.left, (f2 * fHeight) + rect.top);
        canvas.scale(fWidth, fHeight);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        this.write = ((CircularProgressIndicatorSpec) this.AudioAttributesCompatParcelizer).AudioAttributesImplBaseParcelizer == 0 ? 1 : -1;
        this.AudioAttributesImplApi26Parcelizer = ((CircularProgressIndicatorSpec) this.AudioAttributesCompatParcelizer).MediaBrowserCompatCustomActionResultReceiver * f;
        this.read = ((CircularProgressIndicatorSpec) this.AudioAttributesCompatParcelizer).RemoteActionCompatParcelizer * f;
        this.RemoteActionCompatParcelizer = (((CircularProgressIndicatorSpec) this.AudioAttributesCompatParcelizer).AudioAttributesImplApi26Parcelizer - ((CircularProgressIndicatorSpec) this.AudioAttributesCompatParcelizer).MediaBrowserCompatCustomActionResultReceiver) / 2.0f;
        if ((this.IconCompatParcelizer.AudioAttributesCompatParcelizer() && ((CircularProgressIndicatorSpec) this.AudioAttributesCompatParcelizer).IconCompatParcelizer == 2) || (this.IconCompatParcelizer.RemoteActionCompatParcelizer() && ((CircularProgressIndicatorSpec) this.AudioAttributesCompatParcelizer).AudioAttributesCompatParcelizer == 1)) {
            this.RemoteActionCompatParcelizer += ((1.0f - f) * ((CircularProgressIndicatorSpec) this.AudioAttributesCompatParcelizer).MediaBrowserCompatCustomActionResultReceiver) / 2.0f;
        } else if ((this.IconCompatParcelizer.AudioAttributesCompatParcelizer() && ((CircularProgressIndicatorSpec) this.AudioAttributesCompatParcelizer).IconCompatParcelizer == 1) || (this.IconCompatParcelizer.RemoteActionCompatParcelizer() && ((CircularProgressIndicatorSpec) this.AudioAttributesCompatParcelizer).AudioAttributesCompatParcelizer == 2)) {
            this.RemoteActionCompatParcelizer -= ((1.0f - f) * ((CircularProgressIndicatorSpec) this.AudioAttributesCompatParcelizer).MediaBrowserCompatCustomActionResultReceiver) / 2.0f;
        }
    }

    @Override // kotlin.ForwardingExtractorInput
    final void write(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f != f2) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.BUTT);
            paint.setAntiAlias(true);
            paint.setColor(i);
            paint.setStrokeWidth(this.AudioAttributesImplApi26Parcelizer);
            float f3 = this.write;
            float f4 = f * 360.0f * f3;
            float f5 = (f2 >= f ? f2 - f : (1.0f + f2) - f) * 360.0f * f3;
            float f6 = this.RemoteActionCompatParcelizer;
            float f7 = -f6;
            canvas.drawArc(new RectF(f7, f7, f6, f6), f4, f5, false, paint);
            if (this.read <= BitmapDescriptorFactory.HUE_RED || Math.abs(f5) >= 360.0f) {
                return;
            }
            paint.setStyle(Paint.Style.FILL);
            write(canvas, paint, this.AudioAttributesImplApi26Parcelizer, this.read, f4);
            write(canvas, paint, this.AudioAttributesImplApi26Parcelizer, this.read, f4 + f5);
        }
    }

    @Override // kotlin.ForwardingExtractorInput
    final void write(Canvas canvas, Paint paint) {
        int iIconCompatParcelizer = createExtractors.IconCompatParcelizer(((CircularProgressIndicatorSpec) this.AudioAttributesCompatParcelizer).read, this.IconCompatParcelizer.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(iIconCompatParcelizer);
        paint.setStrokeWidth(this.AudioAttributesImplApi26Parcelizer);
        float f = this.RemoteActionCompatParcelizer;
        float f2 = -f;
        canvas.drawArc(new RectF(f2, f2, f, f), BitmapDescriptorFactory.HUE_RED, 360.0f, false, paint);
    }

    private int read() {
        return ((CircularProgressIndicatorSpec) this.AudioAttributesCompatParcelizer).AudioAttributesImplApi26Parcelizer + (((CircularProgressIndicatorSpec) this.AudioAttributesCompatParcelizer).MediaBrowserCompatItemReceiver << 1);
    }

    private void write(Canvas canvas, Paint paint, float f, float f2, float f3) {
        canvas.save();
        canvas.rotate(f3);
        float f4 = this.RemoteActionCompatParcelizer;
        float f5 = f / 2.0f;
        canvas.drawRoundRect(new RectF(f4 - f5, f2, f4 + f5, -f2), f2, f2, paint);
        canvas.restore();
    }
}
