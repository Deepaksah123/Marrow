package de.hdodenhof.circleimageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.isAwaited;

/* JADX INFO: loaded from: classes4.dex */
public class CircleImageView extends ImageView {
    private int AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private BitmapShader AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private final Paint IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private final Paint MediaBrowserCompatItemReceiver;
    private float MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private int MediaDescriptionCompat;
    private final Paint MediaMetadataCompat;
    private final RectF RatingCompat;
    private float handleMediaPlayPauseIfPendingOnHandler;
    private final RectF onAddQueueItem;
    private ColorFilter onCommand;
    private boolean onCustomAction;
    private boolean onFastForward;
    private final Matrix onPlay;
    private Bitmap read;
    private static final ImageView.ScaleType write = ImageView.ScaleType.CENTER_CROP;
    private static final Bitmap.Config RemoteActionCompatParcelizer = Bitmap.Config.ARGB_8888;

    public CircleImageView(Context context) {
        super(context);
        this.onAddQueueItem = new RectF();
        this.RatingCompat = new RectF();
        this.onPlay = new Matrix();
        this.IconCompatParcelizer = new Paint();
        this.MediaBrowserCompatItemReceiver = new Paint();
        this.MediaMetadataCompat = new Paint();
        this.AudioAttributesImplBaseParcelizer = -16777216;
        this.MediaBrowserCompatSearchResultReceiver = 0;
        this.MediaDescriptionCompat = 0;
        write();
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onAddQueueItem = new RectF();
        this.RatingCompat = new RectF();
        this.onPlay = new Matrix();
        this.IconCompatParcelizer = new Paint();
        this.MediaBrowserCompatItemReceiver = new Paint();
        this.MediaMetadataCompat = new Paint();
        this.AudioAttributesImplBaseParcelizer = -16777216;
        this.MediaBrowserCompatSearchResultReceiver = 0;
        this.MediaDescriptionCompat = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, isAwaited.AudioAttributesCompatParcelizer.CircleImageView, i, 0);
        this.MediaBrowserCompatSearchResultReceiver = typedArrayObtainStyledAttributes.getDimensionPixelSize(isAwaited.AudioAttributesCompatParcelizer.CircleImageView_civ_border_width, 0);
        this.AudioAttributesImplBaseParcelizer = typedArrayObtainStyledAttributes.getColor(isAwaited.AudioAttributesCompatParcelizer.CircleImageView_civ_border_color, -16777216);
        this.AudioAttributesImplApi21Parcelizer = typedArrayObtainStyledAttributes.getBoolean(isAwaited.AudioAttributesCompatParcelizer.CircleImageView_civ_border_overlay, false);
        if (typedArrayObtainStyledAttributes.hasValue(isAwaited.AudioAttributesCompatParcelizer.CircleImageView_civ_circle_background_color)) {
            this.MediaDescriptionCompat = typedArrayObtainStyledAttributes.getColor(isAwaited.AudioAttributesCompatParcelizer.CircleImageView_civ_circle_background_color, 0);
        } else if (typedArrayObtainStyledAttributes.hasValue(isAwaited.AudioAttributesCompatParcelizer.CircleImageView_civ_fill_color)) {
            this.MediaDescriptionCompat = typedArrayObtainStyledAttributes.getColor(isAwaited.AudioAttributesCompatParcelizer.CircleImageView_civ_fill_color, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
        write();
    }

    private void write() {
        super.setScaleType(write);
        this.onCustomAction = true;
        setOutlineProvider(new RemoteActionCompatParcelizer(this, (byte) 0));
        if (this.onFastForward) {
            IconCompatParcelizer();
            this.onFastForward = false;
        }
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return write;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != write) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
        }
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z) {
        if (z) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            super.onDraw(canvas);
            return;
        }
        if (this.read != null) {
            if (this.MediaDescriptionCompat != 0) {
                canvas.drawCircle(this.onAddQueueItem.centerX(), this.onAddQueueItem.centerY(), this.handleMediaPlayPauseIfPendingOnHandler, this.MediaMetadataCompat);
            }
            canvas.drawCircle(this.onAddQueueItem.centerX(), this.onAddQueueItem.centerY(), this.handleMediaPlayPauseIfPendingOnHandler, this.IconCompatParcelizer);
            if (this.MediaBrowserCompatSearchResultReceiver > 0) {
                canvas.drawCircle(this.RatingCompat.centerX(), this.RatingCompat.centerY(), this.MediaBrowserCompatMediaItem, this.MediaBrowserCompatItemReceiver);
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        IconCompatParcelizer();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        IconCompatParcelizer();
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        IconCompatParcelizer();
    }

    public void setBorderColor(int i) {
        if (i == this.AudioAttributesImplBaseParcelizer) {
            return;
        }
        this.AudioAttributesImplBaseParcelizer = i;
        this.MediaBrowserCompatItemReceiver.setColor(i);
        invalidate();
    }

    @Deprecated
    public void setBorderColorResource(int i) {
        setBorderColor(getContext().getResources().getColor(i));
    }

    public void setCircleBackgroundColor(int i) {
        if (i == this.MediaDescriptionCompat) {
            return;
        }
        this.MediaDescriptionCompat = i;
        this.MediaMetadataCompat.setColor(i);
        invalidate();
    }

    public void setCircleBackgroundColorResource(int i) {
        setCircleBackgroundColor(getContext().getResources().getColor(i));
    }

    @Deprecated
    public void setFillColor(int i) {
        setCircleBackgroundColor(i);
    }

    @Deprecated
    public void setFillColorResource(int i) {
        setCircleBackgroundColorResource(i);
    }

    public void setBorderWidth(int i) {
        if (i == this.MediaBrowserCompatSearchResultReceiver) {
            return;
        }
        this.MediaBrowserCompatSearchResultReceiver = i;
        IconCompatParcelizer();
    }

    public void setBorderOverlay(boolean z) {
        if (z == this.AudioAttributesImplApi21Parcelizer) {
            return;
        }
        this.AudioAttributesImplApi21Parcelizer = z;
        IconCompatParcelizer();
    }

    public void setDisableCircularTransformation(boolean z) {
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == z) {
            return;
        }
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = z;
        RemoteActionCompatParcelizer();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        RemoteActionCompatParcelizer();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        RemoteActionCompatParcelizer();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        RemoteActionCompatParcelizer();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        RemoteActionCompatParcelizer();
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == this.onCommand) {
            return;
        }
        this.onCommand = colorFilter;
        AudioAttributesCompatParcelizer();
        invalidate();
    }

    @Override // android.widget.ImageView
    public ColorFilter getColorFilter() {
        return this.onCommand;
    }

    private void AudioAttributesCompatParcelizer() {
        Paint paint = this.IconCompatParcelizer;
        if (paint != null) {
            paint.setColorFilter(this.onCommand);
        }
    }

    private static Bitmap IconCompatParcelizer(Drawable drawable) {
        Bitmap bitmapCreateBitmap;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            if (drawable instanceof ColorDrawable) {
                bitmapCreateBitmap = Bitmap.createBitmap(2, 2, RemoteActionCompatParcelizer);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), RemoteActionCompatParcelizer);
            }
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void RemoteActionCompatParcelizer() {
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            this.read = null;
        } else {
            this.read = IconCompatParcelizer(getDrawable());
        }
        IconCompatParcelizer();
    }

    private void IconCompatParcelizer() {
        int i;
        if (!this.onCustomAction) {
            this.onFastForward = true;
            return;
        }
        if (getWidth() == 0 && getHeight() == 0) {
            return;
        }
        if (this.read == null) {
            invalidate();
            return;
        }
        Bitmap bitmap = this.read;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.AudioAttributesImplApi26Parcelizer = new BitmapShader(bitmap, tileMode, tileMode);
        this.IconCompatParcelizer.setAntiAlias(true);
        this.IconCompatParcelizer.setShader(this.AudioAttributesImplApi26Parcelizer);
        this.MediaBrowserCompatItemReceiver.setStyle(Paint.Style.STROKE);
        this.MediaBrowserCompatItemReceiver.setAntiAlias(true);
        this.MediaBrowserCompatItemReceiver.setColor(this.AudioAttributesImplBaseParcelizer);
        this.MediaBrowserCompatItemReceiver.setStrokeWidth(this.MediaBrowserCompatSearchResultReceiver);
        this.MediaMetadataCompat.setStyle(Paint.Style.FILL);
        this.MediaMetadataCompat.setAntiAlias(true);
        this.MediaMetadataCompat.setColor(this.MediaDescriptionCompat);
        this.AudioAttributesCompatParcelizer = this.read.getHeight();
        this.MediaBrowserCompatCustomActionResultReceiver = this.read.getWidth();
        this.RatingCompat.set(read());
        this.MediaBrowserCompatMediaItem = Math.min((this.RatingCompat.height() - this.MediaBrowserCompatSearchResultReceiver) / 2.0f, (this.RatingCompat.width() - this.MediaBrowserCompatSearchResultReceiver) / 2.0f);
        this.onAddQueueItem.set(this.RatingCompat);
        if (!this.AudioAttributesImplApi21Parcelizer && (i = this.MediaBrowserCompatSearchResultReceiver) > 0) {
            float f = i - 1.0f;
            this.onAddQueueItem.inset(f, f);
        }
        this.handleMediaPlayPauseIfPendingOnHandler = Math.min(this.onAddQueueItem.height() / 2.0f, this.onAddQueueItem.width() / 2.0f);
        AudioAttributesCompatParcelizer();
        AudioAttributesImplBaseParcelizer();
        invalidate();
    }

    private RectF read() {
        int iMin = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        float paddingLeft = getPaddingLeft() + ((r0 - iMin) / 2.0f);
        float paddingTop = getPaddingTop() + ((r1 - iMin) / 2.0f);
        float f = iMin;
        return new RectF(paddingLeft, paddingTop, paddingLeft + f, f + paddingTop);
    }

    private void AudioAttributesImplBaseParcelizer() {
        float fWidth;
        float fHeight;
        this.onPlay.set(null);
        float fHeight2 = this.MediaBrowserCompatCustomActionResultReceiver * this.onAddQueueItem.height();
        float fWidth2 = this.onAddQueueItem.width() * this.AudioAttributesCompatParcelizer;
        float fWidth3 = BitmapDescriptorFactory.HUE_RED;
        if (fHeight2 > fWidth2) {
            fWidth = this.onAddQueueItem.height() / this.AudioAttributesCompatParcelizer;
            fHeight = 0.0f;
            fWidth3 = (this.onAddQueueItem.width() - (this.MediaBrowserCompatCustomActionResultReceiver * fWidth)) * 0.5f;
        } else {
            fWidth = this.onAddQueueItem.width() / this.MediaBrowserCompatCustomActionResultReceiver;
            fHeight = (this.onAddQueueItem.height() - (this.AudioAttributesCompatParcelizer * fWidth)) * 0.5f;
        }
        this.onPlay.setScale(fWidth, fWidth);
        this.onPlay.postTranslate(((int) (fWidth3 + 0.5f)) + this.onAddQueueItem.left, ((int) (fHeight + 0.5f)) + this.onAddQueueItem.top);
        this.AudioAttributesImplApi26Parcelizer.setLocalMatrix(this.onPlay);
    }

    /* JADX INFO: loaded from: classes5.dex */
    class RemoteActionCompatParcelizer extends ViewOutlineProvider {
        private RemoteActionCompatParcelizer() {
        }

        /* synthetic */ RemoteActionCompatParcelizer(CircleImageView circleImageView, byte b) {
            this();
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            Rect rect = new Rect();
            CircleImageView.this.RatingCompat.roundOut(rect);
            outline.setRoundRect(rect, rect.width() / 2.0f);
        }
    }
}
