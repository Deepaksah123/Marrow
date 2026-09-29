package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import kotlin.PrimitiveArrayDeserializersFloatDeser;
import kotlin.ReferenceTypeDeserializer;
import kotlin._isBlank;

/* JADX INFO: loaded from: classes4.dex */
public class Carousel extends MotionHelper {
    private int AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private float AudioAttributesImplBaseParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatMediaItem;
    private RemoteActionCompatParcelizer MediaBrowserCompatSearchResultReceiver;
    private MotionLayout MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private int MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private boolean RatingCompat;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private final ArrayList<View> onAddQueueItem;
    private int onCommand;
    private int onCustomAction;
    private int onFastForward;
    private int onMediaButtonEvent;
    private int onPause;
    private Runnable onPlay;
    private int onPlayFromMediaId;
    private float onPrepareFromMediaId;

    public interface RemoteActionCompatParcelizer {
        int read();
    }

    public Carousel(Context context) {
        super(context);
        this.MediaBrowserCompatSearchResultReceiver = null;
        this.onAddQueueItem = new ArrayList<>();
        this.onCustomAction = 0;
        this.MediaDescriptionCompat = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
        this.RatingCompat = false;
        this.AudioAttributesImplApi21Parcelizer = -1;
        this.MediaBrowserCompatMediaItem = -1;
        this.onPause = -1;
        this.onMediaButtonEvent = -1;
        this.AudioAttributesImplBaseParcelizer = 0.9f;
        this.onFastForward = 0;
        this.AudioAttributesImplApi26Parcelizer = 4;
        this.onPlayFromMediaId = 1;
        this.onPrepareFromMediaId = 2.0f;
        this.onCommand = -1;
        this.MediaMetadataCompat = 200;
        this.handleMediaPlayPauseIfPendingOnHandler = -1;
        this.onPlay = new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.4
            @Override // java.lang.Runnable
            public final void run() {
                Carousel.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setProgress(BitmapDescriptorFactory.HUE_RED);
                Carousel.this.AudioAttributesImplApi21Parcelizer();
                RemoteActionCompatParcelizer unused = Carousel.this.MediaBrowserCompatSearchResultReceiver;
                int unused2 = Carousel.this.MediaDescriptionCompat;
                float fAudioAttributesImplBaseParcelizer = Carousel.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesImplBaseParcelizer();
                if (Carousel.this.onPlayFromMediaId != 2 || fAudioAttributesImplBaseParcelizer <= Carousel.this.onPrepareFromMediaId || Carousel.this.MediaDescriptionCompat >= Carousel.this.MediaBrowserCompatSearchResultReceiver.read() - 1) {
                    return;
                }
                float f = Carousel.this.AudioAttributesImplBaseParcelizer;
                if (Carousel.this.MediaDescriptionCompat != 0 || Carousel.this.onCustomAction <= Carousel.this.MediaDescriptionCompat) {
                    if (Carousel.this.MediaDescriptionCompat != Carousel.this.MediaBrowserCompatSearchResultReceiver.read() - 1 || Carousel.this.onCustomAction >= Carousel.this.MediaDescriptionCompat) {
                        final float f2 = fAudioAttributesImplBaseParcelizer * f;
                        Carousel.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.post(new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                Carousel.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(5, 1.0f, f2);
                            }
                        });
                    }
                }
            }
        };
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MediaBrowserCompatSearchResultReceiver = null;
        this.onAddQueueItem = new ArrayList<>();
        this.onCustomAction = 0;
        this.MediaDescriptionCompat = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
        this.RatingCompat = false;
        this.AudioAttributesImplApi21Parcelizer = -1;
        this.MediaBrowserCompatMediaItem = -1;
        this.onPause = -1;
        this.onMediaButtonEvent = -1;
        this.AudioAttributesImplBaseParcelizer = 0.9f;
        this.onFastForward = 0;
        this.AudioAttributesImplApi26Parcelizer = 4;
        this.onPlayFromMediaId = 1;
        this.onPrepareFromMediaId = 2.0f;
        this.onCommand = -1;
        this.MediaMetadataCompat = 200;
        this.handleMediaPlayPauseIfPendingOnHandler = -1;
        this.onPlay = new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.4
            @Override // java.lang.Runnable
            public final void run() {
                Carousel.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setProgress(BitmapDescriptorFactory.HUE_RED);
                Carousel.this.AudioAttributesImplApi21Parcelizer();
                RemoteActionCompatParcelizer unused = Carousel.this.MediaBrowserCompatSearchResultReceiver;
                int unused2 = Carousel.this.MediaDescriptionCompat;
                float fAudioAttributesImplBaseParcelizer = Carousel.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesImplBaseParcelizer();
                if (Carousel.this.onPlayFromMediaId != 2 || fAudioAttributesImplBaseParcelizer <= Carousel.this.onPrepareFromMediaId || Carousel.this.MediaDescriptionCompat >= Carousel.this.MediaBrowserCompatSearchResultReceiver.read() - 1) {
                    return;
                }
                float f = Carousel.this.AudioAttributesImplBaseParcelizer;
                if (Carousel.this.MediaDescriptionCompat != 0 || Carousel.this.onCustomAction <= Carousel.this.MediaDescriptionCompat) {
                    if (Carousel.this.MediaDescriptionCompat != Carousel.this.MediaBrowserCompatSearchResultReceiver.read() - 1 || Carousel.this.onCustomAction >= Carousel.this.MediaDescriptionCompat) {
                        final float f2 = fAudioAttributesImplBaseParcelizer * f;
                        Carousel.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.post(new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                Carousel.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(5, 1.0f, f2);
                            }
                        });
                    }
                }
            }
        };
        IconCompatParcelizer(context, attributeSet);
    }

    public Carousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MediaBrowserCompatSearchResultReceiver = null;
        this.onAddQueueItem = new ArrayList<>();
        this.onCustomAction = 0;
        this.MediaDescriptionCompat = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
        this.RatingCompat = false;
        this.AudioAttributesImplApi21Parcelizer = -1;
        this.MediaBrowserCompatMediaItem = -1;
        this.onPause = -1;
        this.onMediaButtonEvent = -1;
        this.AudioAttributesImplBaseParcelizer = 0.9f;
        this.onFastForward = 0;
        this.AudioAttributesImplApi26Parcelizer = 4;
        this.onPlayFromMediaId = 1;
        this.onPrepareFromMediaId = 2.0f;
        this.onCommand = -1;
        this.MediaMetadataCompat = 200;
        this.handleMediaPlayPauseIfPendingOnHandler = -1;
        this.onPlay = new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.4
            @Override // java.lang.Runnable
            public final void run() {
                Carousel.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setProgress(BitmapDescriptorFactory.HUE_RED);
                Carousel.this.AudioAttributesImplApi21Parcelizer();
                RemoteActionCompatParcelizer unused = Carousel.this.MediaBrowserCompatSearchResultReceiver;
                int unused2 = Carousel.this.MediaDescriptionCompat;
                float fAudioAttributesImplBaseParcelizer = Carousel.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesImplBaseParcelizer();
                if (Carousel.this.onPlayFromMediaId != 2 || fAudioAttributesImplBaseParcelizer <= Carousel.this.onPrepareFromMediaId || Carousel.this.MediaDescriptionCompat >= Carousel.this.MediaBrowserCompatSearchResultReceiver.read() - 1) {
                    return;
                }
                float f = Carousel.this.AudioAttributesImplBaseParcelizer;
                if (Carousel.this.MediaDescriptionCompat != 0 || Carousel.this.onCustomAction <= Carousel.this.MediaDescriptionCompat) {
                    if (Carousel.this.MediaDescriptionCompat != Carousel.this.MediaBrowserCompatSearchResultReceiver.read() - 1 || Carousel.this.onCustomAction >= Carousel.this.MediaDescriptionCompat) {
                        final float f2 = fAudioAttributesImplBaseParcelizer * f;
                        Carousel.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.post(new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                Carousel.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(5, 1.0f, f2);
                            }
                        });
                    }
                }
            }
        };
        IconCompatParcelizer(context, attributeSet);
    }

    private void IconCompatParcelizer(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, _isBlank.read.Carousel);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == _isBlank.read.Carousel_carousel_firstView) {
                    this.MediaBrowserCompatCustomActionResultReceiver = typedArrayObtainStyledAttributes.getResourceId(index, this.MediaBrowserCompatCustomActionResultReceiver);
                } else if (index == _isBlank.read.Carousel_carousel_backwardTransition) {
                    this.AudioAttributesImplApi21Parcelizer = typedArrayObtainStyledAttributes.getResourceId(index, this.AudioAttributesImplApi21Parcelizer);
                } else if (index == _isBlank.read.Carousel_carousel_forwardTransition) {
                    this.MediaBrowserCompatMediaItem = typedArrayObtainStyledAttributes.getResourceId(index, this.MediaBrowserCompatMediaItem);
                } else if (index == _isBlank.read.Carousel_carousel_emptyViewsBehavior) {
                    this.AudioAttributesImplApi26Parcelizer = typedArrayObtainStyledAttributes.getInt(index, this.AudioAttributesImplApi26Parcelizer);
                } else if (index == _isBlank.read.Carousel_carousel_previousState) {
                    this.onPause = typedArrayObtainStyledAttributes.getResourceId(index, this.onPause);
                } else if (index == _isBlank.read.Carousel_carousel_nextState) {
                    this.onMediaButtonEvent = typedArrayObtainStyledAttributes.getResourceId(index, this.onMediaButtonEvent);
                } else if (index == _isBlank.read.Carousel_carousel_touchUp_dampeningFactor) {
                    this.AudioAttributesImplBaseParcelizer = typedArrayObtainStyledAttributes.getFloat(index, this.AudioAttributesImplBaseParcelizer);
                } else if (index == _isBlank.read.Carousel_carousel_touchUpMode) {
                    this.onPlayFromMediaId = typedArrayObtainStyledAttributes.getInt(index, this.onPlayFromMediaId);
                } else if (index == _isBlank.read.Carousel_carousel_touchUp_velocityThreshold) {
                    this.onPrepareFromMediaId = typedArrayObtainStyledAttributes.getFloat(index, this.onPrepareFromMediaId);
                } else if (index == _isBlank.read.Carousel_carousel_infinite) {
                    this.RatingCompat = typedArrayObtainStyledAttributes.getBoolean(index, this.RatingCompat);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setAdapter(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.MediaBrowserCompatSearchResultReceiver = remoteActionCompatParcelizer;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.AudioAttributesImplApi26Parcelizer
    public final void read(int i) {
        int i2 = this.MediaDescriptionCompat;
        this.onCustomAction = i2;
        if (i == this.onMediaButtonEvent) {
            this.MediaDescriptionCompat = i2 + 1;
        } else if (i == this.onPause) {
            this.MediaDescriptionCompat = i2 - 1;
        }
        if (this.RatingCompat) {
            if (this.MediaDescriptionCompat >= this.MediaBrowserCompatSearchResultReceiver.read()) {
                this.MediaDescriptionCompat = 0;
            }
            if (this.MediaDescriptionCompat < 0) {
                this.MediaDescriptionCompat = this.MediaBrowserCompatSearchResultReceiver.read() - 1;
            }
        } else {
            if (this.MediaDescriptionCompat >= this.MediaBrowserCompatSearchResultReceiver.read()) {
                this.MediaDescriptionCompat = this.MediaBrowserCompatSearchResultReceiver.read() - 1;
            }
            if (this.MediaDescriptionCompat < 0) {
                this.MediaDescriptionCompat = 0;
            }
        }
        if (this.onCustomAction != this.MediaDescriptionCompat) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.post(this.onPlay);
        }
    }

    private boolean AudioAttributesCompatParcelizer(int i, boolean z) {
        MotionLayout motionLayout;
        PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerWrite;
        if (i == -1 || (motionLayout = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) == null || (audioAttributesCompatParcelizerWrite = motionLayout.write(i)) == null || z == audioAttributesCompatParcelizerWrite.AudioAttributesImplBaseParcelizer()) {
            return false;
        }
        audioAttributesCompatParcelizerWrite.write(z);
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            for (int i = 0; i < this.write; i++) {
                int i2 = this.IconCompatParcelizer[i];
                View viewMediaBrowserCompatItemReceiver = motionLayout.MediaBrowserCompatItemReceiver(i2);
                if (this.MediaBrowserCompatCustomActionResultReceiver == i2) {
                    this.onFastForward = i;
                }
                this.onAddQueueItem.add(viewMediaBrowserCompatItemReceiver);
            }
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = motionLayout;
            if (this.onPlayFromMediaId == 2) {
                PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerWrite = motionLayout.write(this.MediaBrowserCompatMediaItem);
                if (audioAttributesCompatParcelizerWrite != null) {
                    audioAttributesCompatParcelizerWrite.AudioAttributesImplApi26Parcelizer();
                }
                PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerWrite2 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(this.AudioAttributesImplApi21Parcelizer);
                if (audioAttributesCompatParcelizerWrite2 != null) {
                    audioAttributesCompatParcelizerWrite2.AudioAttributesImplApi26Parcelizer();
                }
            }
            AudioAttributesImplApi21Parcelizer();
        }
    }

    private boolean AudioAttributesCompatParcelizer(View view, int i) {
        MotionLayout motionLayout = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (motionLayout == null) {
            return false;
        }
        boolean z = false;
        for (int i2 : motionLayout.RemoteActionCompatParcelizer()) {
            z |= read(i2, view, i);
        }
        return z;
    }

    private boolean read(int i, View view, int i2) {
        ReferenceTypeDeserializer.write writeVarRemoteActionCompatParcelizer;
        ReferenceTypeDeserializer referenceTypeDeserializerRemoteActionCompatParcelizer = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer(i);
        if (referenceTypeDeserializerRemoteActionCompatParcelizer == null || (writeVarRemoteActionCompatParcelizer = referenceTypeDeserializerRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(view.getId())) == null) {
            return false;
        }
        writeVarRemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer = 1;
        view.setVisibility(i2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesImplApi21Parcelizer() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver;
        if (remoteActionCompatParcelizer == null || this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null || remoteActionCompatParcelizer.read() == 0) {
            return;
        }
        int size = this.onAddQueueItem.size();
        for (int i = 0; i < size; i++) {
            View view = this.onAddQueueItem.get(i);
            int i2 = (this.MediaDescriptionCompat + i) - this.onFastForward;
            if (this.RatingCompat) {
                if (i2 < 0) {
                    int i3 = this.AudioAttributesImplApi26Parcelizer;
                    if (i3 != 4) {
                        AudioAttributesCompatParcelizer(view, i3);
                    } else {
                        AudioAttributesCompatParcelizer(view, 0);
                    }
                    if (i2 % this.MediaBrowserCompatSearchResultReceiver.read() != 0) {
                        int i4 = i2 % this.MediaBrowserCompatSearchResultReceiver.read();
                    }
                } else if (i2 >= this.MediaBrowserCompatSearchResultReceiver.read()) {
                    if (i2 != this.MediaBrowserCompatSearchResultReceiver.read() && i2 > this.MediaBrowserCompatSearchResultReceiver.read()) {
                        int i5 = i2 % this.MediaBrowserCompatSearchResultReceiver.read();
                    }
                    int i6 = this.AudioAttributesImplApi26Parcelizer;
                    if (i6 != 4) {
                        AudioAttributesCompatParcelizer(view, i6);
                    } else {
                        AudioAttributesCompatParcelizer(view, 0);
                    }
                } else {
                    AudioAttributesCompatParcelizer(view, 0);
                }
            } else if (i2 < 0) {
                AudioAttributesCompatParcelizer(view, this.AudioAttributesImplApi26Parcelizer);
            } else if (i2 >= this.MediaBrowserCompatSearchResultReceiver.read()) {
                AudioAttributesCompatParcelizer(view, this.AudioAttributesImplApi26Parcelizer);
            } else {
                AudioAttributesCompatParcelizer(view, 0);
            }
        }
        int i7 = this.onCommand;
        if (i7 != -1 && i7 != this.MediaDescriptionCompat) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.post(new Runnable() { // from class: o.NumberDeserializersByteDeserializer
                @Override // java.lang.Runnable
                public final void run() {
                    this.write.AudioAttributesCompatParcelizer();
                }
            });
        } else if (i7 == this.MediaDescriptionCompat) {
            this.onCommand = -1;
        }
        if (this.AudioAttributesImplApi21Parcelizer == -1 || this.MediaBrowserCompatMediaItem == -1 || this.RatingCompat) {
            return;
        }
        int i8 = this.MediaBrowserCompatSearchResultReceiver.read();
        if (this.MediaDescriptionCompat == 0) {
            AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, false);
        } else {
            AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, true);
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setTransition(this.AudioAttributesImplApi21Parcelizer);
        }
        if (this.MediaDescriptionCompat == i8 - 1) {
            AudioAttributesCompatParcelizer(this.MediaBrowserCompatMediaItem, false);
        } else {
            AudioAttributesCompatParcelizer(this.MediaBrowserCompatMediaItem, true);
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setTransition(this.MediaBrowserCompatMediaItem);
        }
    }

    public final /* synthetic */ void AudioAttributesCompatParcelizer() {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setTransitionDuration(this.MediaMetadataCompat);
        if (this.onCommand < this.MediaDescriptionCompat) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(this.onPause, this.MediaMetadataCompat);
        } else {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(this.onMediaButtonEvent, this.MediaMetadataCompat);
        }
    }
}
