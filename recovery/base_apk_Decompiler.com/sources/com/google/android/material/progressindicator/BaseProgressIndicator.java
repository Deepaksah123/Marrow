package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import kotlin.FlacStreamMetadataSeekTable;
import kotlin.ForwardingExtractorInput;
import kotlin.InvalidTypeIdException;
import kotlin.calculateNextSearchBytePosition;
import kotlin.createExtractors;
import kotlin.getActivityBanner;
import kotlin.getMetadataCopyWithAppendedEntriesFrom;
import kotlin.peekId3Data;
import kotlin.readFrames;
import kotlin.readId3Metadata;
import kotlin.setFromComment;
import kotlin.setFromMetadata;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseProgressIndicator<S extends getMetadataCopyWithAppendedEntriesFrom> extends ProgressBar {
    private static int RemoteActionCompatParcelizer = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_MaterialComponents_ProgressIndicator;
    private final Runnable AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private final getActivityBanner.RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer;
    private final int AudioAttributesImplBaseParcelizer;
    private final Runnable IconCompatParcelizer;
    private long MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatMediaItem;
    private final getActivityBanner.RemoteActionCompatParcelizer MediaBrowserCompatSearchResultReceiver;
    private final int MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private int RatingCompat;
    S read;
    private FlacStreamMetadataSeekTable write;

    abstract S RemoteActionCompatParcelizer(Context context, AttributeSet attributeSet);

    protected BaseProgressIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(readFrames.IconCompatParcelizer(context, attributeSet, i, RemoteActionCompatParcelizer), attributeSet, i);
        this.MediaBrowserCompatCustomActionResultReceiver = -1L;
        this.MediaBrowserCompatItemReceiver = false;
        this.MediaMetadataCompat = 4;
        this.AudioAttributesCompatParcelizer = new Runnable() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.3
            @Override // java.lang.Runnable
            public final void run() {
                BaseProgressIndicator.this.AudioAttributesImplBaseParcelizer();
            }
        };
        this.IconCompatParcelizer = new Runnable() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.1
            @Override // java.lang.Runnable
            public final void run() {
                BaseProgressIndicator.this.MediaBrowserCompatCustomActionResultReceiver();
            }
        };
        this.MediaBrowserCompatSearchResultReceiver = new getActivityBanner.RemoteActionCompatParcelizer() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.2
            @Override // o.getActivityBanner.RemoteActionCompatParcelizer
            public final void AudioAttributesCompatParcelizer(Drawable drawable) {
                BaseProgressIndicator.this.setIndeterminate(false);
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                baseProgressIndicator.setProgressCompat(baseProgressIndicator.RatingCompat, BaseProgressIndicator.this.MediaBrowserCompatMediaItem);
            }
        };
        this.AudioAttributesImplApi26Parcelizer = new getActivityBanner.RemoteActionCompatParcelizer() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.5
            @Override // o.getActivityBanner.RemoteActionCompatParcelizer
            public final void AudioAttributesCompatParcelizer(Drawable drawable) {
                super.AudioAttributesCompatParcelizer(drawable);
                if (BaseProgressIndicator.this.MediaBrowserCompatItemReceiver) {
                    return;
                }
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                baseProgressIndicator.setVisibility(baseProgressIndicator.MediaMetadataCompat);
            }
        };
        Context context2 = getContext();
        this.read = (S) RemoteActionCompatParcelizer(context2, attributeSet);
        TypedArray typedArrayWrite = readId3Metadata.write(context2, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.BaseProgressIndicator, i, i2, new int[0]);
        this.MediaDescriptionCompat = typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.BaseProgressIndicator_showDelay, -1);
        this.AudioAttributesImplBaseParcelizer = Math.min(typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.BaseProgressIndicator_minHideDelay, -1), 1000);
        typedArrayWrite.recycle();
        this.write = new FlacStreamMetadataSeekTable();
        this.AudioAttributesImplApi21Parcelizer = true;
    }

    private void MediaBrowserCompatItemReceiver() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().write().IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        }
    }

    private void AudioAttributesImplApi26Parcelizer() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
            getIndeterminateDrawable().write().IconCompatParcelizer();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesImplBaseParcelizer() {
        if (this.AudioAttributesImplBaseParcelizer > 0) {
            this.MediaBrowserCompatCustomActionResultReceiver = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaBrowserCompatCustomActionResultReceiver() {
        ((setFromMetadata) getCurrentDrawable()).write(false, false, true);
        if (AudioAttributesImplApi21Parcelizer()) {
            setVisibility(4);
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        RemoteActionCompatParcelizer(i == 0);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        RemoteActionCompatParcelizer(false);
    }

    private void RemoteActionCompatParcelizer(boolean z) {
        if (this.AudioAttributesImplApi21Parcelizer) {
            ((setFromMetadata) getCurrentDrawable()).write(read(), false, z);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MediaBrowserCompatItemReceiver();
        if (read()) {
            AudioAttributesImplBaseParcelizer();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.IconCompatParcelizer);
        removeCallbacks(this.AudioAttributesCompatParcelizer);
        ((setFromMetadata) getCurrentDrawable()).read();
        AudioAttributesImplApi26Parcelizer();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDraw(Canvas canvas) {
        synchronized (this) {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onMeasure(int i, int i2) {
        int iWrite;
        int iRemoteActionCompatParcelizer;
        synchronized (this) {
            ForwardingExtractorInput<S> forwardingExtractorInputIconCompatParcelizer = IconCompatParcelizer();
            if (forwardingExtractorInputIconCompatParcelizer == null) {
                return;
            }
            if (forwardingExtractorInputIconCompatParcelizer.write() < 0) {
                iWrite = getDefaultSize(getSuggestedMinimumWidth(), i);
            } else {
                iWrite = forwardingExtractorInputIconCompatParcelizer.write() + getPaddingLeft() + getPaddingRight();
            }
            if (forwardingExtractorInputIconCompatParcelizer.RemoteActionCompatParcelizer() < 0) {
                iRemoteActionCompatParcelizer = getDefaultSize(getSuggestedMinimumHeight(), i2);
            } else {
                iRemoteActionCompatParcelizer = forwardingExtractorInputIconCompatParcelizer.RemoteActionCompatParcelizer() + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(iWrite, iRemoteActionCompatParcelizer);
        }
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    private ForwardingExtractorInput<S> IconCompatParcelizer() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().MediaBrowserCompatCustomActionResultReceiver();
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().write();
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (drawable instanceof setFromComment) {
                setFromComment setfromcomment = (setFromComment) drawable;
                setfromcomment.read();
                super.setProgressDrawable(setfromcomment);
                setfromcomment.AudioAttributesCompatParcelizer(getProgress() / getMax());
                return;
            }
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (drawable instanceof peekId3Data) {
                ((setFromMetadata) drawable).read();
                super.setIndeterminateDrawable(drawable);
                return;
            }
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    @Override // android.widget.ProgressBar
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final setFromComment<S> getProgressDrawable() {
        return (setFromComment) super.getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final peekId3Data<S> getIndeterminateDrawable() {
        return (peekId3Data) super.getIndeterminateDrawable();
    }

    final boolean read() {
        return InvalidTypeIdException.onPlayFromSearch(this) && getWindowVisibility() == 0 && MediaBrowserCompatSearchResultReceiver();
    }

    private boolean MediaBrowserCompatSearchResultReceiver() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    private boolean AudioAttributesImplApi21Parcelizer() {
        if (getProgressDrawable() == null || !getProgressDrawable().isVisible()) {
            return getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible();
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminate(boolean z) {
        synchronized (this) {
            if (z == isIndeterminate()) {
                return;
            }
            setFromMetadata setfrommetadata = (setFromMetadata) getCurrentDrawable();
            if (setfrommetadata != null) {
                setfrommetadata.read();
            }
            super.setIndeterminate(z);
            setFromMetadata setfrommetadata2 = (setFromMetadata) getCurrentDrawable();
            if (setfrommetadata2 != null) {
                setfrommetadata2.write(read(), false, false);
            }
            if ((setfrommetadata2 instanceof peekId3Data) && read()) {
                ((peekId3Data) setfrommetadata2).write().AudioAttributesCompatParcelizer();
            }
            this.MediaBrowserCompatItemReceiver = false;
        }
    }

    public final int RemoteActionCompatParcelizer() {
        return this.read.MediaBrowserCompatCustomActionResultReceiver;
    }

    public void setTrackThickness(int i) {
        if (this.read.MediaBrowserCompatCustomActionResultReceiver != i) {
            this.read.MediaBrowserCompatCustomActionResultReceiver = i;
            requestLayout();
        }
    }

    private int[] RatingCompat() {
        return this.read.write;
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{createExtractors.write(getContext(), calculateNextSearchBytePosition.IconCompatParcelizer.colorPrimary, -1)};
        }
        if (Arrays.equals(RatingCompat(), iArr)) {
            return;
        }
        this.read.write = iArr;
        getIndeterminateDrawable().write().read();
        invalidate();
    }

    public void setTrackColor(int i) {
        if (this.read.read != i) {
            this.read.read = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        if (this.read.RemoteActionCompatParcelizer != i) {
            S s = this.read;
            s.RemoteActionCompatParcelizer = Math.min(i, s.MediaBrowserCompatCustomActionResultReceiver / 2);
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.read.IconCompatParcelizer = i;
        invalidate();
    }

    public void setHideAnimationBehavior(int i) {
        this.read.AudioAttributesCompatParcelizer = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i) {
        synchronized (this) {
            if (isIndeterminate()) {
                return;
            }
            setProgressCompat(i, false);
        }
    }

    public void setProgressCompat(int i, boolean z) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.RatingCompat = i;
                this.MediaBrowserCompatMediaItem = z;
                this.MediaBrowserCompatItemReceiver = true;
                if (!getIndeterminateDrawable().isVisible() || FlacStreamMetadataSeekTable.RemoteActionCompatParcelizer(getContext().getContentResolver()) == BitmapDescriptorFactory.HUE_RED) {
                    this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(getIndeterminateDrawable());
                    return;
                } else {
                    getIndeterminateDrawable().write().write();
                    return;
                }
            }
            return;
        }
        super.setProgress(i);
        if (getProgressDrawable() == null || z) {
            return;
        }
        getProgressDrawable().jumpToCurrentState();
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.MediaMetadataCompat = i;
    }

    public void setAnimatorDurationScaleProvider(FlacStreamMetadataSeekTable flacStreamMetadataSeekTable) {
        this.write = flacStreamMetadataSeekTable;
        if (getProgressDrawable() != null) {
            getProgressDrawable().AudioAttributesCompatParcelizer = flacStreamMetadataSeekTable;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().AudioAttributesCompatParcelizer = flacStreamMetadataSeekTable;
        }
    }
}
