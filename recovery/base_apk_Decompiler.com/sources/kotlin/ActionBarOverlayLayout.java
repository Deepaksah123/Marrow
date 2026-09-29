package kotlin;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
final class ActionBarOverlayLayout extends Drawable {
    private float AudioAttributesImplApi21Parcelizer;
    private float AudioAttributesImplApi26Parcelizer;
    private PorterDuffColorFilter AudioAttributesImplBaseParcelizer;
    private final Rect IconCompatParcelizer;
    private ColorStateList MediaBrowserCompatCustomActionResultReceiver;
    private ColorStateList read;
    private final RectF write;
    private boolean RemoteActionCompatParcelizer = false;
    private boolean AudioAttributesCompatParcelizer = true;
    private PorterDuff.Mode MediaDescriptionCompat = PorterDuff.Mode.SRC_IN;
    private final Paint MediaBrowserCompatItemReceiver = new Paint(5);

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    ActionBarOverlayLayout(ColorStateList colorStateList, float f) {
        this.AudioAttributesImplApi21Parcelizer = f;
        IconCompatParcelizer(colorStateList);
        this.write = new RectF();
        this.IconCompatParcelizer = new Rect();
    }

    private void IconCompatParcelizer(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.read = colorStateList;
        this.MediaBrowserCompatItemReceiver.setColor(colorStateList.getColorForState(getState(), this.read.getDefaultColor()));
    }

    final void write(float f, boolean z, boolean z2) {
        if (f == this.AudioAttributesImplApi26Parcelizer && this.RemoteActionCompatParcelizer == z && this.AudioAttributesCompatParcelizer == z2) {
            return;
        }
        this.AudioAttributesImplApi26Parcelizer = f;
        this.RemoteActionCompatParcelizer = z;
        this.AudioAttributesCompatParcelizer = z2;
        AudioAttributesCompatParcelizer(null);
        invalidateSelf();
    }

    final float write() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.MediaBrowserCompatItemReceiver;
        if (this.AudioAttributesImplBaseParcelizer == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.AudioAttributesImplBaseParcelizer);
            z = true;
        }
        RectF rectF = this.write;
        float f = this.AudioAttributesImplApi21Parcelizer;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    private void AudioAttributesCompatParcelizer(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.write.set(rect.left, rect.top, rect.right, rect.bottom);
        this.IconCompatParcelizer.set(rect);
        if (this.RemoteActionCompatParcelizer) {
            this.IconCompatParcelizer.inset((int) Math.ceil(C0205setSubtitle.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesCompatParcelizer)), (int) Math.ceil(C0205setSubtitle.read(this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesCompatParcelizer)));
            this.write.set(this.IconCompatParcelizer);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        AudioAttributesCompatParcelizer(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.IconCompatParcelizer, this.AudioAttributesImplApi21Parcelizer);
    }

    final void IconCompatParcelizer(float f) {
        if (f == this.AudioAttributesImplApi21Parcelizer) {
            return;
        }
        this.AudioAttributesImplApi21Parcelizer = f;
        AudioAttributesCompatParcelizer(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.MediaBrowserCompatItemReceiver.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.MediaBrowserCompatItemReceiver.setColorFilter(colorFilter);
    }

    public final float AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final void RemoteActionCompatParcelizer(ColorStateList colorStateList) {
        IconCompatParcelizer(colorStateList);
        invalidateSelf();
    }

    public final ColorStateList read() {
        return this.read;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.MediaBrowserCompatCustomActionResultReceiver = colorStateList;
        this.AudioAttributesImplBaseParcelizer = write(colorStateList, this.MediaDescriptionCompat);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.MediaDescriptionCompat = mode;
        this.AudioAttributesImplBaseParcelizer = write(this.MediaBrowserCompatCustomActionResultReceiver, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.read;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.MediaBrowserCompatItemReceiver.getColor();
        if (z) {
            this.MediaBrowserCompatItemReceiver.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.MediaBrowserCompatCustomActionResultReceiver;
        if (colorStateList2 == null || (mode = this.MediaDescriptionCompat) == null) {
            return z;
        }
        this.AudioAttributesImplBaseParcelizer = write(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.MediaBrowserCompatCustomActionResultReceiver;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.read;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    private PorterDuffColorFilter write(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
