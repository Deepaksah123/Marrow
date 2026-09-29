package kotlin;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;

/* JADX INFO: loaded from: classes5.dex */
final class IndexSeekMap extends ForwardingExtractorInput<LinearProgressIndicatorSpec> {
    private float AudioAttributesImplApi21Parcelizer;
    private float RemoteActionCompatParcelizer;
    private Path read;
    private float write;

    @Override // kotlin.ForwardingExtractorInput
    public final int write() {
        return -1;
    }

    public IndexSeekMap(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.AudioAttributesImplApi21Parcelizer = 300.0f;
    }

    @Override // kotlin.ForwardingExtractorInput
    public final int RemoteActionCompatParcelizer() {
        return ((LinearProgressIndicatorSpec) this.AudioAttributesCompatParcelizer).MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // kotlin.ForwardingExtractorInput
    public final void AudioAttributesCompatParcelizer(Canvas canvas, Rect rect, float f) {
        this.AudioAttributesImplApi21Parcelizer = rect.width();
        float f2 = ((LinearProgressIndicatorSpec) this.AudioAttributesCompatParcelizer).MediaBrowserCompatCustomActionResultReceiver;
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(BitmapDescriptorFactory.HUE_RED, (rect.height() - ((LinearProgressIndicatorSpec) this.AudioAttributesCompatParcelizer).MediaBrowserCompatCustomActionResultReceiver) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.AudioAttributesCompatParcelizer).AudioAttributesImplApi26Parcelizer) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.IconCompatParcelizer.AudioAttributesCompatParcelizer() && ((LinearProgressIndicatorSpec) this.AudioAttributesCompatParcelizer).IconCompatParcelizer == 1) || (this.IconCompatParcelizer.RemoteActionCompatParcelizer() && ((LinearProgressIndicatorSpec) this.AudioAttributesCompatParcelizer).AudioAttributesCompatParcelizer == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.IconCompatParcelizer.AudioAttributesCompatParcelizer() || this.IconCompatParcelizer.RemoteActionCompatParcelizer()) {
            canvas.translate(BitmapDescriptorFactory.HUE_RED, (((LinearProgressIndicatorSpec) this.AudioAttributesCompatParcelizer).MediaBrowserCompatCustomActionResultReceiver * (f - 1.0f)) / 2.0f);
        }
        float f3 = this.AudioAttributesImplApi21Parcelizer;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        this.RemoteActionCompatParcelizer = ((LinearProgressIndicatorSpec) this.AudioAttributesCompatParcelizer).MediaBrowserCompatCustomActionResultReceiver * f;
        this.write = ((LinearProgressIndicatorSpec) this.AudioAttributesCompatParcelizer).RemoteActionCompatParcelizer * f;
    }

    @Override // kotlin.ForwardingExtractorInput
    public final void write(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        float f3 = this.AudioAttributesImplApi21Parcelizer;
        float f4 = (-f3) / 2.0f;
        float f5 = this.write;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.save();
        canvas.clipPath(this.read);
        float f6 = this.RemoteActionCompatParcelizer;
        RectF rectF = new RectF(((f * f3) + f4) - (f5 * 2.0f), (-f6) / 2.0f, f4 + (f2 * f3), f6 / 2.0f);
        float f7 = this.write;
        canvas.drawRoundRect(rectF, f7, f7, paint);
        canvas.restore();
    }

    @Override // kotlin.ForwardingExtractorInput
    final void write(Canvas canvas, Paint paint) {
        int iIconCompatParcelizer = createExtractors.IconCompatParcelizer(((LinearProgressIndicatorSpec) this.AudioAttributesCompatParcelizer).read, this.IconCompatParcelizer.getAlpha());
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(iIconCompatParcelizer);
        Path path = new Path();
        this.read = path;
        float f = this.AudioAttributesImplApi21Parcelizer;
        float f2 = this.RemoteActionCompatParcelizer;
        RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.write;
        path.addRoundRect(rectF, f3, f3, Path.Direction.CCW);
        canvas.drawPath(this.read, paint);
    }
}
