package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin._isBlank;
import kotlin.getDefaultViewModelCreationExtras;

/* JADX INFO: loaded from: classes4.dex */
public class ImageFilterButton extends AppCompatImageButton {
    private float AudioAttributesCompatParcelizer;
    private float AudioAttributesImplApi21Parcelizer;
    private Path AudioAttributesImplApi26Parcelizer;
    private float AudioAttributesImplBaseParcelizer;
    private LayerDrawable IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private Drawable[] MediaBrowserCompatItemReceiver;
    private float MediaBrowserCompatMediaItem;
    private float MediaBrowserCompatSearchResultReceiver;
    private RectF MediaDescriptionCompat;
    private float MediaMetadataCompat;
    private ViewOutlineProvider RatingCompat;
    private Drawable RemoteActionCompatParcelizer;
    private float onAddQueueItem;
    private Drawable read;
    private ImageFilterView.IconCompatParcelizer write;

    public ImageFilterButton(Context context) {
        super(context);
        this.write = new ImageFilterView.IconCompatParcelizer();
        this.AudioAttributesCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.MediaBrowserCompatMediaItem = BitmapDescriptorFactory.HUE_RED;
        this.MediaBrowserCompatSearchResultReceiver = Float.NaN;
        this.MediaBrowserCompatItemReceiver = new Drawable[2];
        this.MediaBrowserCompatCustomActionResultReceiver = true;
        this.read = null;
        this.RemoteActionCompatParcelizer = null;
        this.AudioAttributesImplBaseParcelizer = Float.NaN;
        this.AudioAttributesImplApi21Parcelizer = Float.NaN;
        this.onAddQueueItem = Float.NaN;
        this.MediaMetadataCompat = Float.NaN;
        read(null);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.write = new ImageFilterView.IconCompatParcelizer();
        this.AudioAttributesCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.MediaBrowserCompatMediaItem = BitmapDescriptorFactory.HUE_RED;
        this.MediaBrowserCompatSearchResultReceiver = Float.NaN;
        this.MediaBrowserCompatItemReceiver = new Drawable[2];
        this.MediaBrowserCompatCustomActionResultReceiver = true;
        this.read = null;
        this.RemoteActionCompatParcelizer = null;
        this.AudioAttributesImplBaseParcelizer = Float.NaN;
        this.AudioAttributesImplApi21Parcelizer = Float.NaN;
        this.onAddQueueItem = Float.NaN;
        this.MediaMetadataCompat = Float.NaN;
        read(attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.write = new ImageFilterView.IconCompatParcelizer();
        this.AudioAttributesCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.MediaBrowserCompatMediaItem = BitmapDescriptorFactory.HUE_RED;
        this.MediaBrowserCompatSearchResultReceiver = Float.NaN;
        this.MediaBrowserCompatItemReceiver = new Drawable[2];
        this.MediaBrowserCompatCustomActionResultReceiver = true;
        this.read = null;
        this.RemoteActionCompatParcelizer = null;
        this.AudioAttributesImplBaseParcelizer = Float.NaN;
        this.AudioAttributesImplApi21Parcelizer = Float.NaN;
        this.onAddQueueItem = Float.NaN;
        this.MediaMetadataCompat = Float.NaN;
        read(attributeSet);
    }

    private void read(AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, _isBlank.read.ImageFilterView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.read = typedArrayObtainStyledAttributes.getDrawable(_isBlank.read.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == _isBlank.read.ImageFilterView_crossfade) {
                    this.AudioAttributesCompatParcelizer = typedArrayObtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED);
                } else if (index == _isBlank.read.ImageFilterView_warmth) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == _isBlank.read.ImageFilterView_saturation) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == _isBlank.read.ImageFilterView_contrast) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == _isBlank.read.ImageFilterView_round) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == _isBlank.read.ImageFilterView_roundPercent) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == _isBlank.read.ImageFilterView_overlay) {
                    AudioAttributesCompatParcelizer(typedArrayObtainStyledAttributes.getBoolean(index, this.MediaBrowserCompatCustomActionResultReceiver));
                } else if (index == _isBlank.read.ImageFilterView_imagePanX) {
                    setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.AudioAttributesImplBaseParcelizer));
                } else if (index == _isBlank.read.ImageFilterView_imagePanY) {
                    setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.AudioAttributesImplApi21Parcelizer));
                } else if (index == _isBlank.read.ImageFilterView_imageRotate) {
                    setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.MediaMetadataCompat));
                } else if (index == _isBlank.read.ImageFilterView_imageZoom) {
                    setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.onAddQueueItem));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.RemoteActionCompatParcelizer = drawable;
            if (this.read != null && drawable != null) {
                Drawable[] drawableArr = this.MediaBrowserCompatItemReceiver;
                Drawable drawableMutate = getDrawable().mutate();
                this.RemoteActionCompatParcelizer = drawableMutate;
                drawableArr[0] = drawableMutate;
                this.MediaBrowserCompatItemReceiver[1] = this.read.mutate();
                LayerDrawable layerDrawable = new LayerDrawable(this.MediaBrowserCompatItemReceiver);
                this.IconCompatParcelizer = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.AudioAttributesCompatParcelizer * 255.0f));
                if (!this.MediaBrowserCompatCustomActionResultReceiver) {
                    this.IconCompatParcelizer.getDrawable(0).setAlpha((int) ((1.0f - this.AudioAttributesCompatParcelizer) * 255.0f));
                }
                super.setImageDrawable(this.IconCompatParcelizer);
                return;
            }
            Drawable drawable2 = getDrawable();
            this.RemoteActionCompatParcelizer = drawable2;
            if (drawable2 != null) {
                Drawable[] drawableArr2 = this.MediaBrowserCompatItemReceiver;
                Drawable drawableMutate2 = drawable2.mutate();
                this.RemoteActionCompatParcelizer = drawableMutate2;
                drawableArr2[0] = drawableMutate2;
            }
        }
    }

    public void setImagePanX(float f) {
        this.AudioAttributesImplBaseParcelizer = f;
        write();
    }

    public void setImagePanY(float f) {
        this.AudioAttributesImplApi21Parcelizer = f;
        write();
    }

    public void setImageZoom(float f) {
        this.onAddQueueItem = f;
        write();
    }

    public void setImageRotate(float f) {
        this.MediaMetadataCompat = f;
        write();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.read != null && drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.RemoteActionCompatParcelizer = drawableMutate;
            Drawable[] drawableArr = this.MediaBrowserCompatItemReceiver;
            drawableArr[0] = drawableMutate;
            drawableArr[1] = this.read;
            LayerDrawable layerDrawable = new LayerDrawable(this.MediaBrowserCompatItemReceiver);
            this.IconCompatParcelizer = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.AudioAttributesCompatParcelizer);
            return;
        }
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.read != null) {
            Drawable drawableMutate = getDefaultViewModelCreationExtras.write(getContext(), i).mutate();
            this.RemoteActionCompatParcelizer = drawableMutate;
            Drawable[] drawableArr = this.MediaBrowserCompatItemReceiver;
            drawableArr[0] = drawableMutate;
            drawableArr[1] = this.read;
            LayerDrawable layerDrawable = new LayerDrawable(this.MediaBrowserCompatItemReceiver);
            this.IconCompatParcelizer = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.AudioAttributesCompatParcelizer);
            return;
        }
        super.setImageResource(i);
    }

    public void setAltImageResource(int i) {
        Drawable drawableMutate = getDefaultViewModelCreationExtras.write(getContext(), i).mutate();
        this.read = drawableMutate;
        Drawable[] drawableArr = this.MediaBrowserCompatItemReceiver;
        drawableArr[0] = this.RemoteActionCompatParcelizer;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.MediaBrowserCompatItemReceiver);
        this.IconCompatParcelizer = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.AudioAttributesCompatParcelizer);
    }

    private void write() {
        if (Float.isNaN(this.AudioAttributesImplBaseParcelizer) && Float.isNaN(this.AudioAttributesImplApi21Parcelizer) && Float.isNaN(this.onAddQueueItem) && Float.isNaN(this.MediaMetadataCompat)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            IconCompatParcelizer();
        }
    }

    private void IconCompatParcelizer() {
        if (Float.isNaN(this.AudioAttributesImplBaseParcelizer) && Float.isNaN(this.AudioAttributesImplApi21Parcelizer) && Float.isNaN(this.onAddQueueItem) && Float.isNaN(this.MediaMetadataCompat)) {
            return;
        }
        boolean zIsNaN = Float.isNaN(this.AudioAttributesImplBaseParcelizer);
        float f = BitmapDescriptorFactory.HUE_RED;
        float f2 = zIsNaN ? 0.0f : this.AudioAttributesImplBaseParcelizer;
        float f3 = Float.isNaN(this.AudioAttributesImplApi21Parcelizer) ? 0.0f : this.AudioAttributesImplApi21Parcelizer;
        float f4 = Float.isNaN(this.onAddQueueItem) ? 1.0f : this.onAddQueueItem;
        if (!Float.isNaN(this.MediaMetadataCompat)) {
            f = this.MediaMetadataCompat;
        }
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f5 = f4 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f5, f5);
        float f6 = intrinsicWidth * f5;
        float f7 = f5 * intrinsicHeight;
        matrix.postTranslate((((f2 * (width - f6)) + width) - f6) * 0.5f, (((f3 * (height - f7)) + height) - f7) * 0.5f);
        matrix.postRotate(f, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private void AudioAttributesCompatParcelizer(boolean z) {
        this.MediaBrowserCompatCustomActionResultReceiver = z;
    }

    public void setSaturation(float f) {
        this.write.AudioAttributesCompatParcelizer = f;
        this.write.AudioAttributesCompatParcelizer(this);
    }

    public void setContrast(float f) {
        this.write.write = f;
        this.write.AudioAttributesCompatParcelizer(this);
    }

    public void setWarmth(float f) {
        this.write.read = f;
        this.write.AudioAttributesCompatParcelizer(this);
    }

    public void setCrossfade(float f) {
        this.AudioAttributesCompatParcelizer = f;
        if (this.MediaBrowserCompatItemReceiver != null) {
            if (!this.MediaBrowserCompatCustomActionResultReceiver) {
                this.IconCompatParcelizer.getDrawable(0).setAlpha((int) ((1.0f - this.AudioAttributesCompatParcelizer) * 255.0f));
            }
            this.IconCompatParcelizer.getDrawable(1).setAlpha((int) (this.AudioAttributesCompatParcelizer * 255.0f));
            super.setImageDrawable(this.IconCompatParcelizer);
        }
    }

    public void setBrightness(float f) {
        this.write.RemoteActionCompatParcelizer = f;
        this.write.AudioAttributesCompatParcelizer(this);
    }

    public void setRoundPercent(float f) {
        boolean z = this.MediaBrowserCompatMediaItem != f;
        this.MediaBrowserCompatMediaItem = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (this.AudioAttributesImplApi26Parcelizer == null) {
                this.AudioAttributesImplApi26Parcelizer = new Path();
            }
            if (this.MediaDescriptionCompat == null) {
                this.MediaDescriptionCompat = new RectF();
            }
            if (this.RatingCompat == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.ImageFilterButton.5
                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), (Math.min(r3, r4) * ImageFilterButton.this.MediaBrowserCompatMediaItem) / 2.0f);
                    }
                };
                this.RatingCompat = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.MediaBrowserCompatMediaItem) / 2.0f;
            this.MediaDescriptionCompat.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height);
            this.AudioAttributesImplApi26Parcelizer.reset();
            this.AudioAttributesImplApi26Parcelizer.addRoundRect(this.MediaDescriptionCompat, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.MediaBrowserCompatSearchResultReceiver = f;
            float f2 = this.MediaBrowserCompatMediaItem;
            this.MediaBrowserCompatMediaItem = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.MediaBrowserCompatSearchResultReceiver != f;
        this.MediaBrowserCompatSearchResultReceiver = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (this.AudioAttributesImplApi26Parcelizer == null) {
                this.AudioAttributesImplApi26Parcelizer = new Path();
            }
            if (this.MediaDescriptionCompat == null) {
                this.MediaDescriptionCompat = new RectF();
            }
            if (this.RatingCompat == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.ImageFilterButton.1
                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.MediaBrowserCompatSearchResultReceiver);
                    }
                };
                this.RatingCompat = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            this.MediaDescriptionCompat.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight());
            this.AudioAttributesImplApi26Parcelizer.reset();
            Path path = this.AudioAttributesImplApi26Parcelizer;
            RectF rectF = this.MediaDescriptionCompat;
            float f3 = this.MediaBrowserCompatSearchResultReceiver;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View
    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        IconCompatParcelizer();
    }
}
