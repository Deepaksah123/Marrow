package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.SeekMap;
import kotlin.calculateNextSearchBytePosition;
import kotlin.frameSizeBytesByTypeNb;
import kotlin.getDefaultViewModelCreationExtras;
import kotlin.isNarrowBandValidFrameType;
import kotlin.isValidFrameType;
import kotlin.readFrames;
import kotlin.readSample;

/* JADX INFO: loaded from: classes3.dex */
public class ShapeableImageView extends AppCompatImageView implements readSample {
    private static final int AudioAttributesCompatParcelizer = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_MaterialComponents_ShapeableImageView;
    private Path AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private int IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private final RectF MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private final Path MediaBrowserCompatSearchResultReceiver;
    private ColorStateList MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final isNarrowBandValidFrameType MediaDescriptionCompat;
    private frameSizeBytesByTypeNb MediaMetadataCompat;
    private isValidFrameType RatingCompat;
    private final RectF RemoteActionCompatParcelizer;
    private float handleMediaPlayPauseIfPendingOnHandler;
    private int onAddQueueItem;
    private int onCustomAction;
    private final Paint read;
    private final Paint write;

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShapeableImageView(Context context, AttributeSet attributeSet, int i) {
        int i2 = AudioAttributesCompatParcelizer;
        super(readFrames.IconCompatParcelizer(context, attributeSet, i, i2), attributeSet, i);
        this.MediaDescriptionCompat = isNarrowBandValidFrameType.RemoteActionCompatParcelizer();
        this.MediaBrowserCompatSearchResultReceiver = new Path();
        this.MediaBrowserCompatCustomActionResultReceiver = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.write = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.RemoteActionCompatParcelizer = new RectF();
        this.MediaBrowserCompatItemReceiver = new RectF();
        this.AudioAttributesImplApi21Parcelizer = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.ShapeableImageView, i, i2);
        setLayerType(2, null);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = SeekMap.IconCompatParcelizer(context2, typedArrayObtainStyledAttributes, calculateNextSearchBytePosition.MediaMetadataCompat.ShapeableImageView_strokeColor);
        this.handleMediaPlayPauseIfPendingOnHandler = typedArrayObtainStyledAttributes.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.ShapeableImageView_strokeWidth, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.ShapeableImageView_contentPadding, 0);
        this.AudioAttributesImplApi26Parcelizer = dimensionPixelSize;
        this.onAddQueueItem = dimensionPixelSize;
        this.MediaBrowserCompatMediaItem = dimensionPixelSize;
        this.IconCompatParcelizer = dimensionPixelSize;
        this.AudioAttributesImplApi26Parcelizer = typedArrayObtainStyledAttributes.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.ShapeableImageView_contentPaddingLeft, dimensionPixelSize);
        this.onAddQueueItem = typedArrayObtainStyledAttributes.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.ShapeableImageView_contentPaddingTop, dimensionPixelSize);
        this.MediaBrowserCompatMediaItem = typedArrayObtainStyledAttributes.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.ShapeableImageView_contentPaddingRight, dimensionPixelSize);
        this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.ShapeableImageView_contentPaddingBottom, dimensionPixelSize);
        this.onCustomAction = typedArrayObtainStyledAttributes.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.ShapeableImageView_contentPaddingStart, Integer.MIN_VALUE);
        this.AudioAttributesImplBaseParcelizer = typedArrayObtainStyledAttributes.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.ShapeableImageView_contentPaddingEnd, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.read = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.RatingCompat = isValidFrameType.read(context2, attributeSet, i, i2).RemoteActionCompatParcelizer();
        setOutlineProvider(new RemoteActionCompatParcelizer());
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.MediaBrowserCompatCustomActionResultReceiver || !isLayoutDirectionResolved()) {
            return;
        }
        this.MediaBrowserCompatCustomActionResultReceiver = true;
        if (isPaddingRelative() || IconCompatParcelizer()) {
            setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
        } else {
            setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.AudioAttributesImplApi21Parcelizer, this.write);
        IconCompatParcelizer(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        AudioAttributesCompatParcelizer(i, i2);
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.onCustomAction = Integer.MIN_VALUE;
        this.AudioAttributesImplBaseParcelizer = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.AudioAttributesImplApi26Parcelizer) + i, (super.getPaddingTop() - this.onAddQueueItem) + i2, (super.getPaddingRight() - this.MediaBrowserCompatMediaItem) + i3, (super.getPaddingBottom() - this.IconCompatParcelizer) + i4);
        this.AudioAttributesImplApi26Parcelizer = i;
        this.onAddQueueItem = i2;
        this.MediaBrowserCompatMediaItem = i3;
        this.IconCompatParcelizer = i4;
    }

    public void setContentPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative((super.getPaddingStart() - MediaBrowserCompatItemReceiver()) + i, (super.getPaddingTop() - this.onAddQueueItem) + i2, (super.getPaddingEnd() - AudioAttributesCompatParcelizer()) + i3, (super.getPaddingBottom() - this.IconCompatParcelizer) + i4);
        this.AudioAttributesImplApi26Parcelizer = read() ? i3 : i;
        this.onAddQueueItem = i2;
        if (!read()) {
            i = i3;
        }
        this.MediaBrowserCompatMediaItem = i;
        this.IconCompatParcelizer = i4;
    }

    private boolean IconCompatParcelizer() {
        return (this.onCustomAction == Integer.MIN_VALUE && this.AudioAttributesImplBaseParcelizer == Integer.MIN_VALUE) ? false : true;
    }

    private int write() {
        return this.IconCompatParcelizer;
    }

    private int AudioAttributesCompatParcelizer() {
        int i = this.AudioAttributesImplBaseParcelizer;
        return i != Integer.MIN_VALUE ? i : read() ? this.AudioAttributesImplApi26Parcelizer : this.MediaBrowserCompatMediaItem;
    }

    private int RemoteActionCompatParcelizer() {
        int i;
        int i2;
        if (IconCompatParcelizer()) {
            if (read() && (i2 = this.AudioAttributesImplBaseParcelizer) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!read() && (i = this.onCustomAction) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.AudioAttributesImplApi26Parcelizer;
    }

    private int AudioAttributesImplApi26Parcelizer() {
        int i;
        int i2;
        if (IconCompatParcelizer()) {
            if (read() && (i2 = this.onCustomAction) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!read() && (i = this.AudioAttributesImplBaseParcelizer) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.MediaBrowserCompatMediaItem;
    }

    private int MediaBrowserCompatItemReceiver() {
        int i = this.onCustomAction;
        return i != Integer.MIN_VALUE ? i : read() ? this.MediaBrowserCompatMediaItem : this.AudioAttributesImplApi26Parcelizer;
    }

    private int MediaBrowserCompatCustomActionResultReceiver() {
        return this.onAddQueueItem;
    }

    private boolean read() {
        return getLayoutDirection() == 1;
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i + RemoteActionCompatParcelizer(), i2 + MediaBrowserCompatCustomActionResultReceiver(), i3 + AudioAttributesImplApi26Parcelizer(), i4 + write());
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i + MediaBrowserCompatItemReceiver(), i2 + MediaBrowserCompatCustomActionResultReceiver(), i3 + AudioAttributesCompatParcelizer(), i4 + write());
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - write();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - AudioAttributesCompatParcelizer();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - RemoteActionCompatParcelizer();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - AudioAttributesImplApi26Parcelizer();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - MediaBrowserCompatItemReceiver();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // kotlin.readSample
    public void setShapeAppearanceModel(isValidFrameType isvalidframetype) {
        this.RatingCompat = isvalidframetype;
        frameSizeBytesByTypeNb framesizebytesbytypenb = this.MediaMetadataCompat;
        if (framesizebytesbytypenb != null) {
            framesizebytesbytypenb.setShapeAppearanceModel(isvalidframetype);
        }
        AudioAttributesCompatParcelizer(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    private void AudioAttributesCompatParcelizer(int i, int i2) {
        this.RemoteActionCompatParcelizer.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        this.MediaDescriptionCompat.IconCompatParcelizer(this.RatingCompat, 1.0f, this.RemoteActionCompatParcelizer, this.MediaBrowserCompatSearchResultReceiver);
        this.AudioAttributesImplApi21Parcelizer.rewind();
        this.AudioAttributesImplApi21Parcelizer.addPath(this.MediaBrowserCompatSearchResultReceiver);
        this.MediaBrowserCompatItemReceiver.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i, i2);
        this.AudioAttributesImplApi21Parcelizer.addRect(this.MediaBrowserCompatItemReceiver, Path.Direction.CCW);
    }

    private void IconCompatParcelizer(Canvas canvas) {
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != null) {
            this.read.setStrokeWidth(this.handleMediaPlayPauseIfPendingOnHandler);
            int colorForState = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getColorForState(getDrawableState(), this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getDefaultColor());
            if (this.handleMediaPlayPauseIfPendingOnHandler <= BitmapDescriptorFactory.HUE_RED || colorForState == 0) {
                return;
            }
            this.read.setColor(colorForState);
            canvas.drawPath(this.MediaBrowserCompatSearchResultReceiver, this.read);
        }
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(getDefaultViewModelCreationExtras.IconCompatParcelizer(getContext(), i));
    }

    public void setStrokeWidth(float f) {
        if (this.handleMediaPlayPauseIfPendingOnHandler != f) {
            this.handleMediaPlayPauseIfPendingOnHandler = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = colorStateList;
        invalidate();
    }

    /* JADX INFO: loaded from: classes5.dex */
    class RemoteActionCompatParcelizer extends ViewOutlineProvider {
        private final Rect read = new Rect();

        RemoteActionCompatParcelizer() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.RatingCompat == null) {
                return;
            }
            if (ShapeableImageView.this.MediaMetadataCompat == null) {
                ShapeableImageView.this.MediaMetadataCompat = new frameSizeBytesByTypeNb(ShapeableImageView.this.RatingCompat);
            }
            ShapeableImageView.this.RemoteActionCompatParcelizer.round(this.read);
            ShapeableImageView.this.MediaMetadataCompat.setBounds(this.read);
            ShapeableImageView.this.MediaMetadataCompat.getOutline(outline);
        }
    }
}
