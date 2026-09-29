package uk.co.senab.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import kotlin.getGuessedStat;
import kotlin.getMyStat;

/* JADX INFO: loaded from: classes4.dex */
public class PhotoView extends ImageView implements getMyStat {
    private getGuessedStat AudioAttributesCompatParcelizer;
    private ImageView.ScaleType IconCompatParcelizer;

    public PhotoView(Context context) {
        this(context, null);
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        write();
    }

    private void write() {
        getGuessedStat getguessedstat = this.AudioAttributesCompatParcelizer;
        if (getguessedstat == null || getguessedstat.IconCompatParcelizer() == null) {
            this.AudioAttributesCompatParcelizer = new getGuessedStat(this);
        }
        ImageView.ScaleType scaleType = this.IconCompatParcelizer;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.IconCompatParcelizer = null;
        }
    }

    public void setRotationTo(float f) {
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(f);
    }

    public void setRotationBy(float f) {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(f);
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver();
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.AudioAttributesCompatParcelizer.write();
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(z);
    }

    public void setMinimumScale(float f) {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(f);
    }

    public void setMediumScale(float f) {
        this.AudioAttributesCompatParcelizer.read(f);
    }

    public void setMaximumScale(float f) {
        this.AudioAttributesCompatParcelizer.write(f);
    }

    public void setScaleLevels(float f, float f2, float f3) {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(f, f2, f3);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        getGuessedStat getguessedstat = this.AudioAttributesCompatParcelizer;
        if (getguessedstat != null) {
            getguessedstat.RatingCompat();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        getGuessedStat getguessedstat = this.AudioAttributesCompatParcelizer;
        if (getguessedstat != null) {
            getguessedstat.RatingCompat();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        getGuessedStat getguessedstat = this.AudioAttributesCompatParcelizer;
        if (getguessedstat != null) {
            getguessedstat.RatingCompat();
        }
    }

    @Override // android.widget.ImageView
    protected boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        getGuessedStat getguessedstat = this.AudioAttributesCompatParcelizer;
        if (getguessedstat != null) {
            getguessedstat.RatingCompat();
        }
        return frame;
    }

    public void setOnMatrixChangeListener(getGuessedStat.IconCompatParcelizer iconCompatParcelizer) {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(iconCompatParcelizer);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.AudioAttributesCompatParcelizer.write(onLongClickListener);
    }

    public void setOnPhotoTapListener(getGuessedStat.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.AudioAttributesCompatParcelizer.read(audioAttributesCompatParcelizer);
    }

    public void setOnViewTapListener(getGuessedStat.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer) {
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(audioAttributesImplBaseParcelizer);
    }

    public void setScale(float f) {
        this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(f);
    }

    public void setScale(float f, boolean z) {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(f, z);
    }

    public void setScale(float f, float f2, float f3, boolean z) {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(f, f2, f3, z);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        getGuessedStat getguessedstat = this.AudioAttributesCompatParcelizer;
        if (getguessedstat != null) {
            getguessedstat.write(scaleType);
        } else {
            this.IconCompatParcelizer = scaleType;
        }
    }

    public void setZoomable(boolean z) {
        this.AudioAttributesCompatParcelizer.read(z);
    }

    public void setZoomTransitionDuration(int i) {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(i);
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(onDoubleTapListener);
    }

    public void setOnScaleChangeListener(getGuessedStat.write writeVar) {
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(writeVar);
    }

    public void setOnSingleFlingListener(getGuessedStat.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
        this.AudioAttributesCompatParcelizer.write(mediaBrowserCompatCustomActionResultReceiver);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        this.AudioAttributesCompatParcelizer.read();
        this.AudioAttributesCompatParcelizer = null;
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        write();
        super.onAttachedToWindow();
    }
}
