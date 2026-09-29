package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.JdkDeserializers;
import kotlin._isBlank;

/* JADX INFO: loaded from: classes4.dex */
public class Layer extends ConstraintHelper {
    private boolean AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private float AudioAttributesImplBaseParcelizer;
    private float MediaBrowserCompatCustomActionResultReceiver;
    private float MediaBrowserCompatMediaItem;
    private float MediaBrowserCompatSearchResultReceiver;
    private float MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private float MediaDescriptionCompat;
    private ConstraintLayout MediaMetadataCompat;
    private float RatingCompat;
    private float handleMediaPlayPauseIfPendingOnHandler;
    private float onAddQueueItem;
    private boolean onCommand;
    private float onCustomAction;
    private float onMediaButtonEvent;
    private float onPause;
    private View[] onPlay;
    private float onPlayFromMediaId;

    public Layer(Context context) {
        super(context);
        this.onCustomAction = Float.NaN;
        this.onAddQueueItem = Float.NaN;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = Float.NaN;
        this.handleMediaPlayPauseIfPendingOnHandler = 1.0f;
        this.onPlayFromMediaId = 1.0f;
        this.MediaBrowserCompatCustomActionResultReceiver = Float.NaN;
        this.AudioAttributesImplBaseParcelizer = Float.NaN;
        this.MediaBrowserCompatMediaItem = Float.NaN;
        this.RatingCompat = Float.NaN;
        this.MediaBrowserCompatSearchResultReceiver = Float.NaN;
        this.MediaDescriptionCompat = Float.NaN;
        this.onCommand = true;
        this.onPlay = null;
        this.onMediaButtonEvent = BitmapDescriptorFactory.HUE_RED;
        this.onPause = BitmapDescriptorFactory.HUE_RED;
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onCustomAction = Float.NaN;
        this.onAddQueueItem = Float.NaN;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = Float.NaN;
        this.handleMediaPlayPauseIfPendingOnHandler = 1.0f;
        this.onPlayFromMediaId = 1.0f;
        this.MediaBrowserCompatCustomActionResultReceiver = Float.NaN;
        this.AudioAttributesImplBaseParcelizer = Float.NaN;
        this.MediaBrowserCompatMediaItem = Float.NaN;
        this.RatingCompat = Float.NaN;
        this.MediaBrowserCompatSearchResultReceiver = Float.NaN;
        this.MediaDescriptionCompat = Float.NaN;
        this.onCommand = true;
        this.onPlay = null;
        this.onMediaButtonEvent = BitmapDescriptorFactory.HUE_RED;
        this.onPause = BitmapDescriptorFactory.HUE_RED;
    }

    public Layer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onCustomAction = Float.NaN;
        this.onAddQueueItem = Float.NaN;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = Float.NaN;
        this.handleMediaPlayPauseIfPendingOnHandler = 1.0f;
        this.onPlayFromMediaId = 1.0f;
        this.MediaBrowserCompatCustomActionResultReceiver = Float.NaN;
        this.AudioAttributesImplBaseParcelizer = Float.NaN;
        this.MediaBrowserCompatMediaItem = Float.NaN;
        this.RatingCompat = Float.NaN;
        this.MediaBrowserCompatSearchResultReceiver = Float.NaN;
        this.MediaDescriptionCompat = Float.NaN;
        this.onCommand = true;
        this.onPlay = null;
        this.onMediaButtonEvent = BitmapDescriptorFactory.HUE_RED;
        this.onPause = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void AudioAttributesCompatParcelizer(AttributeSet attributeSet) {
        super.AudioAttributesCompatParcelizer(attributeSet);
        this.AudioAttributesCompatParcelizer = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, _isBlank.read.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == _isBlank.read.ConstraintLayout_Layout_android_visibility) {
                    this.AudioAttributesImplApi21Parcelizer = true;
                } else if (index == _isBlank.read.ConstraintLayout_Layout_android_elevation) {
                    this.AudioAttributesImplApi26Parcelizer = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.MediaMetadataCompat = (ConstraintLayout) getParent();
        if (this.AudioAttributesImplApi21Parcelizer || this.AudioAttributesImplApi26Parcelizer) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.write; i++) {
                View viewMediaBrowserCompatItemReceiver = this.MediaMetadataCompat.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer[i]);
                if (viewMediaBrowserCompatItemReceiver != null) {
                    if (this.AudioAttributesImplApi21Parcelizer) {
                        viewMediaBrowserCompatItemReceiver.setVisibility(visibility);
                    }
                    if (this.AudioAttributesImplApi26Parcelizer && elevation > BitmapDescriptorFactory.HUE_RED) {
                        viewMediaBrowserCompatItemReceiver.setTranslationZ(viewMediaBrowserCompatItemReceiver.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void RemoteActionCompatParcelizer(ConstraintLayout constraintLayout) {
        this.MediaMetadataCompat = constraintLayout;
        float rotation = getRotation();
        if (rotation == BitmapDescriptorFactory.HUE_RED) {
            if (Float.isNaN(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) {
                return;
            }
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = rotation;
            return;
        }
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = rotation;
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = f;
        IconCompatParcelizer();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        this.handleMediaPlayPauseIfPendingOnHandler = f;
        IconCompatParcelizer();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        this.onPlayFromMediaId = f;
        IconCompatParcelizer();
    }

    @Override // android.view.View
    public void setPivotX(float f) {
        this.onCustomAction = f;
        IconCompatParcelizer();
    }

    @Override // android.view.View
    public void setPivotY(float f) {
        this.onAddQueueItem = f;
        IconCompatParcelizer();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        this.onMediaButtonEvent = f;
        IconCompatParcelizer();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        this.onPause = f;
        IconCompatParcelizer();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        AudioAttributesImplBaseParcelizer();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        AudioAttributesImplBaseParcelizer();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void write() {
        read();
        this.MediaBrowserCompatCustomActionResultReceiver = Float.NaN;
        this.AudioAttributesImplBaseParcelizer = Float.NaN;
        JdkDeserializers jdkDeserializersAudioAttributesCompatParcelizer = ((ConstraintLayout.LayoutParams) getLayoutParams()).AudioAttributesCompatParcelizer();
        jdkDeserializersAudioAttributesCompatParcelizer.onFastForward(0);
        jdkDeserializersAudioAttributesCompatParcelizer.MediaMetadataCompat(0);
        RemoteActionCompatParcelizer();
        layout(((int) this.MediaBrowserCompatSearchResultReceiver) - getPaddingLeft(), ((int) this.MediaDescriptionCompat) - getPaddingTop(), ((int) this.MediaBrowserCompatMediaItem) + getPaddingRight(), ((int) this.RatingCompat) + getPaddingBottom());
        IconCompatParcelizer();
    }

    private void read() {
        if (this.MediaMetadataCompat == null || this.write == 0) {
            return;
        }
        View[] viewArr = this.onPlay;
        if (viewArr == null || viewArr.length != this.write) {
            this.onPlay = new View[this.write];
        }
        for (int i = 0; i < this.write; i++) {
            this.onPlay[i] = this.MediaMetadataCompat.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer[i]);
        }
    }

    private void RemoteActionCompatParcelizer() {
        if (this.MediaMetadataCompat != null) {
            if (this.onCommand || Float.isNaN(this.MediaBrowserCompatCustomActionResultReceiver) || Float.isNaN(this.AudioAttributesImplBaseParcelizer)) {
                if (Float.isNaN(this.onCustomAction) || Float.isNaN(this.onAddQueueItem)) {
                    View[] viewArrWrite = write(this.MediaMetadataCompat);
                    int left = viewArrWrite[0].getLeft();
                    int top = viewArrWrite[0].getTop();
                    int right = viewArrWrite[0].getRight();
                    int bottom = viewArrWrite[0].getBottom();
                    for (int i = 0; i < this.write; i++) {
                        View view = viewArrWrite[i];
                        left = Math.min(left, view.getLeft());
                        top = Math.min(top, view.getTop());
                        right = Math.max(right, view.getRight());
                        bottom = Math.max(bottom, view.getBottom());
                    }
                    this.MediaBrowserCompatMediaItem = right;
                    this.RatingCompat = bottom;
                    this.MediaBrowserCompatSearchResultReceiver = left;
                    this.MediaDescriptionCompat = top;
                    if (Float.isNaN(this.onCustomAction)) {
                        this.MediaBrowserCompatCustomActionResultReceiver = (left + right) / 2;
                    } else {
                        this.MediaBrowserCompatCustomActionResultReceiver = this.onCustomAction;
                    }
                    if (Float.isNaN(this.onAddQueueItem)) {
                        this.AudioAttributesImplBaseParcelizer = (top + bottom) / 2;
                        return;
                    } else {
                        this.AudioAttributesImplBaseParcelizer = this.onAddQueueItem;
                        return;
                    }
                }
                this.AudioAttributesImplBaseParcelizer = this.onAddQueueItem;
                this.MediaBrowserCompatCustomActionResultReceiver = this.onCustomAction;
            }
        }
    }

    private void IconCompatParcelizer() {
        if (this.MediaMetadataCompat != null) {
            if (this.onPlay == null) {
                read();
            }
            RemoteActionCompatParcelizer();
            double radians = Float.isNaN(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) ? 0.0d : Math.toRadians(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            float fSin = (float) Math.sin(radians);
            float fCos = (float) Math.cos(radians);
            float f = this.handleMediaPlayPauseIfPendingOnHandler;
            float f2 = this.onPlayFromMediaId;
            float f3 = -f2;
            for (int i = 0; i < this.write; i++) {
                View view = this.onPlay[i];
                int left = (view.getLeft() + view.getRight()) / 2;
                int top = (view.getTop() + view.getBottom()) / 2;
                float f4 = left - this.MediaBrowserCompatCustomActionResultReceiver;
                float f5 = top - this.AudioAttributesImplBaseParcelizer;
                float f6 = this.onMediaButtonEvent;
                float f7 = this.onPause;
                view.setTranslationX(((((f * fCos) * f4) + ((f3 * fSin) * f5)) - f4) + f6);
                view.setTranslationY((((f4 * (f * fSin)) + ((f2 * fCos) * f5)) - f5) + f7);
                view.setScaleY(this.onPlayFromMediaId);
                view.setScaleX(this.handleMediaPlayPauseIfPendingOnHandler);
                if (!Float.isNaN(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) {
                    view.setRotation(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void IconCompatParcelizer(ConstraintLayout constraintLayout) {
        read(constraintLayout);
    }
}
