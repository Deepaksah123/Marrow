package kotlin;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: renamed from: o.setSubtitle, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0205setSubtitle extends Drawable {
    private static final double AudioAttributesCompatParcelizer = Math.cos(Math.toRadians(45.0d));
    private Paint AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private Path AudioAttributesImplBaseParcelizer;
    private final RectF IconCompatParcelizer;
    private Paint MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private float MediaBrowserCompatSearchResultReceiver;
    private float MediaDescriptionCompat;
    private Paint MediaMetadataCompat;
    private float RatingCompat;
    private boolean RemoteActionCompatParcelizer;
    private float read;
    private ColorStateList write;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.MediaBrowserCompatItemReceiver = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int iCeil = (int) Math.ceil(read(this.RatingCompat, this.read, this.RemoteActionCompatParcelizer));
        int iCeil2 = (int) Math.ceil(AudioAttributesCompatParcelizer(this.RatingCompat, this.read, this.RemoteActionCompatParcelizer));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    static float read(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * 1.5f)) + ((1.0d - AudioAttributesCompatParcelizer) * ((double) f2))) : f * 1.5f;
    }

    static float AudioAttributesCompatParcelizer(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - AudioAttributesCompatParcelizer) * ((double) f2))) : f;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.MediaBrowserCompatItemReceiver) {
            AudioAttributesCompatParcelizer(getBounds());
            this.MediaBrowserCompatItemReceiver = false;
        }
        canvas.translate(BitmapDescriptorFactory.HUE_RED, this.MediaBrowserCompatSearchResultReceiver / 2.0f);
        read(canvas);
        canvas.translate(BitmapDescriptorFactory.HUE_RED, -0.0f);
        throw null;
    }

    private void read(Canvas canvas) {
        float f = this.AudioAttributesImplApi26Parcelizer + BitmapDescriptorFactory.HUE_RED + (this.MediaBrowserCompatSearchResultReceiver / 2.0f);
        float f2 = 2.0f * f;
        boolean z = this.IconCompatParcelizer.width() - f2 > BitmapDescriptorFactory.HUE_RED;
        boolean z2 = this.IconCompatParcelizer.height() - f2 > BitmapDescriptorFactory.HUE_RED;
        int iSave = canvas.save();
        canvas.translate(this.IconCompatParcelizer.left + f, this.IconCompatParcelizer.top + f);
        canvas.drawPath(this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi21Parcelizer);
        if (z) {
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, -0.0f, this.IconCompatParcelizer.width() - f2, -0.0f, null);
        }
        canvas.restoreToCount(iSave);
        int iSave2 = canvas.save();
        canvas.translate(this.IconCompatParcelizer.right - f, this.IconCompatParcelizer.bottom - f);
        canvas.rotate(180.0f);
        canvas.drawPath(this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi21Parcelizer);
        if (z) {
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, -0.0f, this.IconCompatParcelizer.width() - f2, BitmapDescriptorFactory.HUE_RED, null);
        }
        canvas.restoreToCount(iSave2);
        int iSave3 = canvas.save();
        canvas.translate(this.IconCompatParcelizer.left + f, this.IconCompatParcelizer.bottom - f);
        canvas.rotate(270.0f);
        canvas.drawPath(this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi21Parcelizer);
        if (z2) {
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, -0.0f, this.IconCompatParcelizer.height() - f2, -0.0f, null);
        }
        canvas.restoreToCount(iSave3);
        int iSave4 = canvas.save();
        canvas.translate(this.IconCompatParcelizer.right - f, this.IconCompatParcelizer.top + f);
        canvas.rotate(90.0f);
        canvas.drawPath(this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi21Parcelizer);
        if (z2) {
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, -0.0f, this.IconCompatParcelizer.height() - f2, -0.0f, null);
        }
        canvas.restoreToCount(iSave4);
    }

    private void RemoteActionCompatParcelizer() {
        RectF rectF = new RectF(-0.0f, -0.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(-0.0f, -0.0f);
        Path path = this.AudioAttributesImplBaseParcelizer;
        if (path == null) {
            this.AudioAttributesImplBaseParcelizer = new Path();
        } else {
            path.reset();
        }
        this.AudioAttributesImplBaseParcelizer.setFillType(Path.FillType.EVEN_ODD);
        this.AudioAttributesImplBaseParcelizer.moveTo(-0.0f, BitmapDescriptorFactory.HUE_RED);
        this.AudioAttributesImplBaseParcelizer.rLineTo(-0.0f, BitmapDescriptorFactory.HUE_RED);
        this.AudioAttributesImplBaseParcelizer.arcTo(rectF2, 180.0f, 90.0f, false);
        this.AudioAttributesImplBaseParcelizer.arcTo(rectF, 270.0f, -90.0f, false);
        this.AudioAttributesImplBaseParcelizer.close();
        throw new ArithmeticException();
    }

    private void AudioAttributesCompatParcelizer(Rect rect) {
        this.IconCompatParcelizer.set(rect.left + this.RatingCompat, rect.top + BitmapDescriptorFactory.HUE_RED, rect.right - this.RatingCompat, rect.bottom);
        RemoteActionCompatParcelizer();
    }
}
