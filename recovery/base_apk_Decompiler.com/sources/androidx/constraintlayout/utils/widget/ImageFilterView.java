package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
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
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin._isBlank;
import kotlin.getDefaultViewModelCreationExtras;

/* JADX INFO: loaded from: classes4.dex */
public class ImageFilterView extends AppCompatImageView {
    private float AudioAttributesCompatParcelizer;
    private float AudioAttributesImplApi21Parcelizer;
    private Drawable[] AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private IconCompatParcelizer IconCompatParcelizer;
    private float MediaBrowserCompatCustomActionResultReceiver;
    private Path MediaBrowserCompatItemReceiver;
    private RectF MediaBrowserCompatMediaItem;
    private ViewOutlineProvider MediaBrowserCompatSearchResultReceiver;
    private float MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private float MediaDescriptionCompat;
    private float MediaMetadataCompat;
    private float RatingCompat;
    private LayerDrawable RemoteActionCompatParcelizer;
    private Drawable read;
    private Drawable write;

    static class IconCompatParcelizer {
        private float[] IconCompatParcelizer = new float[20];
        private ColorMatrix AudioAttributesImplBaseParcelizer = new ColorMatrix();
        private ColorMatrix MediaBrowserCompatCustomActionResultReceiver = new ColorMatrix();
        float RemoteActionCompatParcelizer = 1.0f;
        float AudioAttributesCompatParcelizer = 1.0f;
        float write = 1.0f;
        float read = 1.0f;

        IconCompatParcelizer() {
        }

        private void read(float f) {
            float f2 = 1.0f - f;
            float f3 = 0.2999f * f2;
            float f4 = 0.587f * f2;
            float f5 = f2 * 0.114f;
            float[] fArr = this.IconCompatParcelizer;
            fArr[0] = f3 + f;
            fArr[1] = f4;
            fArr[2] = f5;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f3;
            fArr[6] = f4 + f;
            fArr[7] = f5;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f3;
            fArr[11] = f4;
            fArr[12] = f5 + f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void write(float f) {
            float fLog;
            float fPow;
            float fLog2;
            if (f <= BitmapDescriptorFactory.HUE_RED) {
                f = 0.01f;
            }
            float f2 = (5000.0f / f) / 100.0f;
            if (f2 > 66.0f) {
                double d = f2 - 60.0f;
                fPow = ((float) Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                fLog = ((float) Math.pow(d, 0.07551484555006027d)) * 288.12216f;
            } else {
                fLog = (((float) Math.log(f2)) * 99.4708f) - 161.11957f;
                fPow = 255.0f;
            }
            if (f2 < 66.0f) {
                fLog2 = f2 > 19.0f ? (((float) Math.log(f2 - 10.0f)) * 138.51773f) - 305.0448f : 0.0f;
            } else {
                fLog2 = 255.0f;
            }
            float fMin = Math.min(255.0f, Math.max(fPow, BitmapDescriptorFactory.HUE_RED));
            float fMin2 = Math.min(255.0f, Math.max(fLog, BitmapDescriptorFactory.HUE_RED));
            float fMin3 = Math.min(255.0f, Math.max(fLog2, BitmapDescriptorFactory.HUE_RED));
            float fLog3 = (float) Math.log(50.0d);
            float fLog4 = (float) Math.log(40.0d);
            float fMin4 = Math.min(255.0f, Math.max(255.0f, BitmapDescriptorFactory.HUE_RED));
            float fMin5 = Math.min(255.0f, Math.max((fLog3 * 99.4708f) - 161.11957f, BitmapDescriptorFactory.HUE_RED));
            float fMin6 = fMin3 / Math.min(255.0f, Math.max((fLog4 * 138.51773f) - 305.0448f, BitmapDescriptorFactory.HUE_RED));
            float[] fArr = this.IconCompatParcelizer;
            fArr[0] = fMin / fMin4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = fMin2 / fMin5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = fMin6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void RemoteActionCompatParcelizer(float f) {
            float[] fArr = this.IconCompatParcelizer;
            fArr[0] = f;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        final void AudioAttributesCompatParcelizer(ImageView imageView) {
            boolean z;
            this.AudioAttributesImplBaseParcelizer.reset();
            float f = this.AudioAttributesCompatParcelizer;
            boolean z2 = true;
            if (f != 1.0f) {
                read(f);
                this.AudioAttributesImplBaseParcelizer.set(this.IconCompatParcelizer);
                z = true;
            } else {
                z = false;
            }
            float f2 = this.write;
            if (f2 != 1.0f) {
                this.MediaBrowserCompatCustomActionResultReceiver.setScale(f2, f2, f2, 1.0f);
                this.AudioAttributesImplBaseParcelizer.postConcat(this.MediaBrowserCompatCustomActionResultReceiver);
                z = true;
            }
            float f3 = this.read;
            if (f3 != 1.0f) {
                write(f3);
                this.MediaBrowserCompatCustomActionResultReceiver.set(this.IconCompatParcelizer);
                this.AudioAttributesImplBaseParcelizer.postConcat(this.MediaBrowserCompatCustomActionResultReceiver);
            } else {
                z2 = z;
            }
            float f4 = this.RemoteActionCompatParcelizer;
            if (f4 != 1.0f) {
                RemoteActionCompatParcelizer(f4);
                this.MediaBrowserCompatCustomActionResultReceiver.set(this.IconCompatParcelizer);
                this.AudioAttributesImplBaseParcelizer.postConcat(this.MediaBrowserCompatCustomActionResultReceiver);
            } else if (!z2) {
                imageView.clearColorFilter();
                return;
            }
            imageView.setColorFilter(new ColorMatrixColorFilter(this.AudioAttributesImplBaseParcelizer));
        }
    }

    public void setImagePanX(float f) {
        this.AudioAttributesImplApi21Parcelizer = f;
        read();
    }

    public void setImagePanY(float f) {
        this.MediaBrowserCompatCustomActionResultReceiver = f;
        read();
    }

    public void setImageZoom(float f) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = f;
        read();
    }

    public void setImageRotate(float f) {
        this.MediaDescriptionCompat = f;
        read();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.write != null && drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.read = drawableMutate;
            Drawable[] drawableArr = this.AudioAttributesImplApi26Parcelizer;
            drawableArr[0] = drawableMutate;
            drawableArr[1] = this.write;
            LayerDrawable layerDrawable = new LayerDrawable(this.AudioAttributesImplApi26Parcelizer);
            this.RemoteActionCompatParcelizer = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.AudioAttributesCompatParcelizer);
            return;
        }
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.write != null) {
            Drawable drawableMutate = getDefaultViewModelCreationExtras.write(getContext(), i).mutate();
            this.read = drawableMutate;
            Drawable[] drawableArr = this.AudioAttributesImplApi26Parcelizer;
            drawableArr[0] = drawableMutate;
            drawableArr[1] = this.write;
            LayerDrawable layerDrawable = new LayerDrawable(this.AudioAttributesImplApi26Parcelizer);
            this.RemoteActionCompatParcelizer = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.AudioAttributesCompatParcelizer);
            return;
        }
        super.setImageResource(i);
    }

    public void setAltImageResource(int i) {
        Drawable drawableMutate = getDefaultViewModelCreationExtras.write(getContext(), i).mutate();
        this.write = drawableMutate;
        Drawable[] drawableArr = this.AudioAttributesImplApi26Parcelizer;
        drawableArr[0] = this.read;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.AudioAttributesImplApi26Parcelizer);
        this.RemoteActionCompatParcelizer = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.AudioAttributesCompatParcelizer);
    }

    private void read() {
        if (Float.isNaN(this.AudioAttributesImplApi21Parcelizer) && Float.isNaN(this.MediaBrowserCompatCustomActionResultReceiver) && Float.isNaN(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && Float.isNaN(this.MediaDescriptionCompat)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            RemoteActionCompatParcelizer();
        }
    }

    private void RemoteActionCompatParcelizer() {
        if (Float.isNaN(this.AudioAttributesImplApi21Parcelizer) && Float.isNaN(this.MediaBrowserCompatCustomActionResultReceiver) && Float.isNaN(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && Float.isNaN(this.MediaDescriptionCompat)) {
            return;
        }
        boolean zIsNaN = Float.isNaN(this.AudioAttributesImplApi21Parcelizer);
        float f = BitmapDescriptorFactory.HUE_RED;
        float f2 = zIsNaN ? 0.0f : this.AudioAttributesImplApi21Parcelizer;
        float f3 = Float.isNaN(this.MediaBrowserCompatCustomActionResultReceiver) ? 0.0f : this.MediaBrowserCompatCustomActionResultReceiver;
        float f4 = Float.isNaN(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) ? 1.0f : this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (!Float.isNaN(this.MediaDescriptionCompat)) {
            f = this.MediaDescriptionCompat;
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

    public ImageFilterView(Context context) {
        super(context);
        this.IconCompatParcelizer = new IconCompatParcelizer();
        this.AudioAttributesImplBaseParcelizer = true;
        this.write = null;
        this.read = null;
        this.AudioAttributesCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.RatingCompat = BitmapDescriptorFactory.HUE_RED;
        this.MediaMetadataCompat = Float.NaN;
        this.AudioAttributesImplApi26Parcelizer = new Drawable[2];
        this.AudioAttributesImplApi21Parcelizer = Float.NaN;
        this.MediaBrowserCompatCustomActionResultReceiver = Float.NaN;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = Float.NaN;
        this.MediaDescriptionCompat = Float.NaN;
        IconCompatParcelizer((AttributeSet) null);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.IconCompatParcelizer = new IconCompatParcelizer();
        this.AudioAttributesImplBaseParcelizer = true;
        this.write = null;
        this.read = null;
        this.AudioAttributesCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.RatingCompat = BitmapDescriptorFactory.HUE_RED;
        this.MediaMetadataCompat = Float.NaN;
        this.AudioAttributesImplApi26Parcelizer = new Drawable[2];
        this.AudioAttributesImplApi21Parcelizer = Float.NaN;
        this.MediaBrowserCompatCustomActionResultReceiver = Float.NaN;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = Float.NaN;
        this.MediaDescriptionCompat = Float.NaN;
        IconCompatParcelizer(attributeSet);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.IconCompatParcelizer = new IconCompatParcelizer();
        this.AudioAttributesImplBaseParcelizer = true;
        this.write = null;
        this.read = null;
        this.AudioAttributesCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.RatingCompat = BitmapDescriptorFactory.HUE_RED;
        this.MediaMetadataCompat = Float.NaN;
        this.AudioAttributesImplApi26Parcelizer = new Drawable[2];
        this.AudioAttributesImplApi21Parcelizer = Float.NaN;
        this.MediaBrowserCompatCustomActionResultReceiver = Float.NaN;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = Float.NaN;
        this.MediaDescriptionCompat = Float.NaN;
        IconCompatParcelizer(attributeSet);
    }

    private void IconCompatParcelizer(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, _isBlank.read.ImageFilterView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.write = typedArrayObtainStyledAttributes.getDrawable(_isBlank.read.ImageFilterView_altSrc);
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
                } else if (index == _isBlank.read.ImageFilterView_brightness) {
                    setBrightness(typedArrayObtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == _isBlank.read.ImageFilterView_round) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == _isBlank.read.ImageFilterView_roundPercent) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == _isBlank.read.ImageFilterView_overlay) {
                    IconCompatParcelizer(typedArrayObtainStyledAttributes.getBoolean(index, this.AudioAttributesImplBaseParcelizer));
                } else if (index == _isBlank.read.ImageFilterView_imagePanX) {
                    setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.AudioAttributesImplApi21Parcelizer));
                } else if (index == _isBlank.read.ImageFilterView_imagePanY) {
                    setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.MediaBrowserCompatCustomActionResultReceiver));
                } else if (index == _isBlank.read.ImageFilterView_imageRotate) {
                    setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.MediaDescriptionCompat));
                } else if (index == _isBlank.read.ImageFilterView_imageZoom) {
                    setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.read = drawable;
            if (this.write != null && drawable != null) {
                Drawable[] drawableArr = this.AudioAttributesImplApi26Parcelizer;
                Drawable drawableMutate = getDrawable().mutate();
                this.read = drawableMutate;
                drawableArr[0] = drawableMutate;
                this.AudioAttributesImplApi26Parcelizer[1] = this.write.mutate();
                LayerDrawable layerDrawable = new LayerDrawable(this.AudioAttributesImplApi26Parcelizer);
                this.RemoteActionCompatParcelizer = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.AudioAttributesCompatParcelizer * 255.0f));
                if (!this.AudioAttributesImplBaseParcelizer) {
                    this.RemoteActionCompatParcelizer.getDrawable(0).setAlpha((int) ((1.0f - this.AudioAttributesCompatParcelizer) * 255.0f));
                }
                super.setImageDrawable(this.RemoteActionCompatParcelizer);
                return;
            }
            Drawable drawable2 = getDrawable();
            this.read = drawable2;
            if (drawable2 != null) {
                Drawable[] drawableArr2 = this.AudioAttributesImplApi26Parcelizer;
                Drawable drawableMutate2 = drawable2.mutate();
                this.read = drawableMutate2;
                drawableArr2[0] = drawableMutate2;
            }
        }
    }

    private void IconCompatParcelizer(boolean z) {
        this.AudioAttributesImplBaseParcelizer = z;
    }

    public void setSaturation(float f) {
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer = f;
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this);
    }

    public void setContrast(float f) {
        this.IconCompatParcelizer.write = f;
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this);
    }

    public void setWarmth(float f) {
        this.IconCompatParcelizer.read = f;
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this);
    }

    public void setCrossfade(float f) {
        this.AudioAttributesCompatParcelizer = f;
        if (this.AudioAttributesImplApi26Parcelizer != null) {
            if (!this.AudioAttributesImplBaseParcelizer) {
                this.RemoteActionCompatParcelizer.getDrawable(0).setAlpha((int) ((1.0f - this.AudioAttributesCompatParcelizer) * 255.0f));
            }
            this.RemoteActionCompatParcelizer.getDrawable(1).setAlpha((int) (this.AudioAttributesCompatParcelizer * 255.0f));
            super.setImageDrawable(this.RemoteActionCompatParcelizer);
        }
    }

    public void setBrightness(float f) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer = f;
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this);
    }

    public void setRoundPercent(float f) {
        boolean z = this.RatingCompat != f;
        this.RatingCompat = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (this.MediaBrowserCompatItemReceiver == null) {
                this.MediaBrowserCompatItemReceiver = new Path();
            }
            if (this.MediaBrowserCompatMediaItem == null) {
                this.MediaBrowserCompatMediaItem = new RectF();
            }
            if (this.MediaBrowserCompatSearchResultReceiver == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.ImageFilterView.4
                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), (Math.min(r3, r4) * ImageFilterView.this.RatingCompat) / 2.0f);
                    }
                };
                this.MediaBrowserCompatSearchResultReceiver = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.RatingCompat) / 2.0f;
            this.MediaBrowserCompatMediaItem.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height);
            this.MediaBrowserCompatItemReceiver.reset();
            this.MediaBrowserCompatItemReceiver.addRoundRect(this.MediaBrowserCompatMediaItem, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.MediaMetadataCompat = f;
            float f2 = this.RatingCompat;
            this.RatingCompat = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.MediaMetadataCompat != f;
        this.MediaMetadataCompat = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (this.MediaBrowserCompatItemReceiver == null) {
                this.MediaBrowserCompatItemReceiver = new Path();
            }
            if (this.MediaBrowserCompatMediaItem == null) {
                this.MediaBrowserCompatMediaItem = new RectF();
            }
            if (this.MediaBrowserCompatSearchResultReceiver == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.ImageFilterView.2
                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.MediaMetadataCompat);
                    }
                };
                this.MediaBrowserCompatSearchResultReceiver = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            this.MediaBrowserCompatMediaItem.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight());
            this.MediaBrowserCompatItemReceiver.reset();
            Path path = this.MediaBrowserCompatItemReceiver;
            RectF rectF = this.MediaBrowserCompatMediaItem;
            float f3 = this.MediaMetadataCompat;
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
        RemoteActionCompatParcelizer();
    }
}
