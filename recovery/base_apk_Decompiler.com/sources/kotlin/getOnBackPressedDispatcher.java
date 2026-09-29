package kotlin;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin._init_lambda5;

/* JADX INFO: loaded from: classes4.dex */
public final class getOnBackPressedDispatcher extends Drawable {
    private static final float RemoteActionCompatParcelizer = (float) Math.toRadians(45.0d);
    private float AudioAttributesCompatParcelizer;
    private final Paint AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private float AudioAttributesImplBaseParcelizer;
    private float IconCompatParcelizer;
    private float MediaBrowserCompatCustomActionResultReceiver;
    private final Path MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private final int MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private float read;
    private float write;

    private static float read(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public getOnBackPressedDispatcher(Context context) {
        Paint paint = new Paint();
        this.AudioAttributesImplApi21Parcelizer = paint;
        this.MediaBrowserCompatItemReceiver = new Path();
        this.MediaBrowserCompatSearchResultReceiver = false;
        this.AudioAttributesImplApi26Parcelizer = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, _init_lambda5.AudioAttributesImplApi26Parcelizer.DrawerArrowToggle, _init_lambda5.read.drawerArrowStyle, _init_lambda5.MediaBrowserCompatItemReceiver.Base_Widget_AppCompat_DrawerArrowToggle);
        read(typedArrayObtainStyledAttributes.getColor(_init_lambda5.AudioAttributesImplApi26Parcelizer.DrawerArrowToggle_color, 0));
        IconCompatParcelizer(typedArrayObtainStyledAttributes.getDimension(_init_lambda5.AudioAttributesImplApi26Parcelizer.DrawerArrowToggle_thickness, BitmapDescriptorFactory.HUE_RED));
        AudioAttributesCompatParcelizer(typedArrayObtainStyledAttributes.getBoolean(_init_lambda5.AudioAttributesImplApi26Parcelizer.DrawerArrowToggle_spinBars, true));
        RemoteActionCompatParcelizer(Math.round(typedArrayObtainStyledAttributes.getDimension(_init_lambda5.AudioAttributesImplApi26Parcelizer.DrawerArrowToggle_gapBetweenBars, BitmapDescriptorFactory.HUE_RED)));
        this.MediaDescriptionCompat = typedArrayObtainStyledAttributes.getDimensionPixelSize(_init_lambda5.AudioAttributesImplApi26Parcelizer.DrawerArrowToggle_drawableSize, 0);
        this.IconCompatParcelizer = Math.round(typedArrayObtainStyledAttributes.getDimension(_init_lambda5.AudioAttributesImplApi26Parcelizer.DrawerArrowToggle_barLength, BitmapDescriptorFactory.HUE_RED));
        this.AudioAttributesCompatParcelizer = Math.round(typedArrayObtainStyledAttributes.getDimension(_init_lambda5.AudioAttributesImplApi26Parcelizer.DrawerArrowToggle_arrowHeadLength, BitmapDescriptorFactory.HUE_RED));
        this.read = typedArrayObtainStyledAttributes.getDimension(_init_lambda5.AudioAttributesImplApi26Parcelizer.DrawerArrowToggle_arrowShaftLength, BitmapDescriptorFactory.HUE_RED);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void read(int i) {
        if (i != this.AudioAttributesImplApi21Parcelizer.getColor()) {
            this.AudioAttributesImplApi21Parcelizer.setColor(i);
            invalidateSelf();
        }
    }

    private void IconCompatParcelizer(float f) {
        if (this.AudioAttributesImplApi21Parcelizer.getStrokeWidth() != f) {
            this.AudioAttributesImplApi21Parcelizer.setStrokeWidth(f);
            this.MediaBrowserCompatCustomActionResultReceiver = (float) (((double) (f / 2.0f)) * Math.cos(RemoteActionCompatParcelizer));
            invalidateSelf();
        }
    }

    private void RemoteActionCompatParcelizer(float f) {
        if (f != this.write) {
            this.write = f;
            invalidateSelf();
        }
    }

    private void AudioAttributesCompatParcelizer(boolean z) {
        if (this.MediaMetadataCompat != z) {
            this.MediaMetadataCompat = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = this.AudioAttributesImplApi26Parcelizer;
        boolean z = false;
        if (i != 0 && (i == 1 || (i == 3 ? findFormatOverrides.write(this) == 0 : findFormatOverrides.write(this) == 1))) {
            z = true;
        }
        float f = this.AudioAttributesCompatParcelizer;
        float f2 = read(this.IconCompatParcelizer, (float) Math.sqrt(f * f * 2.0f), this.AudioAttributesImplBaseParcelizer);
        float f3 = read(this.IconCompatParcelizer, this.read, this.AudioAttributesImplBaseParcelizer);
        float fRound = Math.round(read(BitmapDescriptorFactory.HUE_RED, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplBaseParcelizer));
        float f4 = read(BitmapDescriptorFactory.HUE_RED, RemoteActionCompatParcelizer, this.AudioAttributesImplBaseParcelizer);
        float f5 = read(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.AudioAttributesImplBaseParcelizer);
        double d = f2;
        boolean z2 = z;
        double d2 = f4;
        float fRound2 = Math.round(Math.cos(d2) * d);
        float fRound3 = Math.round(d * Math.sin(d2));
        this.MediaBrowserCompatItemReceiver.rewind();
        float f6 = read(this.write + this.AudioAttributesImplApi21Parcelizer.getStrokeWidth(), -this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplBaseParcelizer);
        float f7 = (-f3) / 2.0f;
        this.MediaBrowserCompatItemReceiver.moveTo(f7 + fRound, BitmapDescriptorFactory.HUE_RED);
        this.MediaBrowserCompatItemReceiver.rLineTo(f3 - (fRound * 2.0f), BitmapDescriptorFactory.HUE_RED);
        this.MediaBrowserCompatItemReceiver.moveTo(f7, f6);
        this.MediaBrowserCompatItemReceiver.rLineTo(fRound2, fRound3);
        this.MediaBrowserCompatItemReceiver.moveTo(f7, -f6);
        this.MediaBrowserCompatItemReceiver.rLineTo(fRound2, -fRound3);
        this.MediaBrowserCompatItemReceiver.close();
        canvas.save();
        float strokeWidth = this.AudioAttributesImplApi21Parcelizer.getStrokeWidth();
        float fHeight = bounds.height();
        canvas.translate(bounds.centerX(), ((((int) ((fHeight - (3.0f * strokeWidth)) - (2.0f * r7))) / 4) << 1) + (strokeWidth * 1.5f) + this.write);
        if (this.MediaMetadataCompat) {
            canvas.rotate(f5 * (this.MediaBrowserCompatSearchResultReceiver ^ z2 ? -1 : 1));
        } else if (z2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi21Parcelizer);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.AudioAttributesImplApi21Parcelizer.getAlpha()) {
            this.AudioAttributesImplApi21Parcelizer.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.AudioAttributesImplApi21Parcelizer.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.MediaDescriptionCompat;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.MediaDescriptionCompat;
    }

    public final void AudioAttributesCompatParcelizer(float f) {
        if (this.AudioAttributesImplBaseParcelizer != f) {
            this.AudioAttributesImplBaseParcelizer = f;
            invalidateSelf();
        }
    }
}
