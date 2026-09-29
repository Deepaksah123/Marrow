package kotlin;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin._isBlank;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public final class PrimitiveArrayDeserializersShortDeser {
    private float MediaMetadataCompat;
    private float RatingCompat;
    private final MotionLayout onCustomAction;
    private static final float[][] read = {new float[]{0.5f, BitmapDescriptorFactory.HUE_RED}, new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f}, new float[]{1.0f, 0.5f}};
    private static final float[][] AudioAttributesCompatParcelizer = {new float[]{BitmapDescriptorFactory.HUE_RED, -1.0f}, new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f}, new float[]{-1.0f, BitmapDescriptorFactory.HUE_RED}, new float[]{1.0f, BitmapDescriptorFactory.HUE_RED}, new float[]{-1.0f, BitmapDescriptorFactory.HUE_RED}, new float[]{1.0f, BitmapDescriptorFactory.HUE_RED}};
    private int onPlayFromSearch = 0;
    private int onRemoveQueueItem = 0;
    private int handleMediaPlayPauseIfPendingOnHandler = 0;
    private int onPrepareFromMediaId = -1;
    private int onRemoveQueueItemAt = -1;
    private int MediaDescriptionCompat = -1;
    private float onPrepareFromSearch = 0.5f;
    private float onPlayFromUri = 0.5f;
    float RemoteActionCompatParcelizer = 0.5f;
    float write = 0.5f;
    private int onAddQueueItem = -1;
    boolean IconCompatParcelizer = false;
    private float onRewind = BitmapDescriptorFactory.HUE_RED;
    private float onSeekTo = 1.0f;
    private boolean MediaBrowserCompatItemReceiver = false;
    private float[] MediaBrowserCompatCustomActionResultReceiver = new float[2];
    private int[] onPrepare = new int[2];
    private float MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 4.0f;
    private float MediaBrowserCompatMediaItem = 1.2f;
    private boolean onCommand = true;
    private float AudioAttributesImplApi21Parcelizer = 1.0f;
    private int MediaBrowserCompatSearchResultReceiver = 0;
    private float AudioAttributesImplBaseParcelizer = 10.0f;
    private float onMediaButtonEvent = 10.0f;
    private float onPause = 1.0f;
    private float onFastForward = Float.NaN;
    private float onPlay = Float.NaN;
    private int onPlayFromMediaId = 0;
    private int AudioAttributesImplApi26Parcelizer = 0;

    PrimitiveArrayDeserializersShortDeser(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.onCustomAction = motionLayout;
        write(context, Xml.asAttributeSet(xmlPullParser));
    }

    public final void IconCompatParcelizer(boolean z) {
        if (z) {
            float[][] fArr = AudioAttributesCompatParcelizer;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = read;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = AudioAttributesCompatParcelizer;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = read;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = read[this.onPlayFromSearch];
        this.onPlayFromUri = fArr5[0];
        this.onPrepareFromSearch = fArr5[1];
        int i = this.onRemoveQueueItem;
        float[][] fArr6 = AudioAttributesCompatParcelizer;
        if (i >= fArr6.length) {
            return;
        }
        float[] fArr7 = fArr6[i];
        this.onRewind = fArr7[0];
        this.onSeekTo = fArr7[1];
    }

    private void write(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, _isBlank.read.OnSwipe);
        read(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void read(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == _isBlank.read.OnSwipe_touchAnchorId) {
                this.onPrepareFromMediaId = typedArray.getResourceId(index, this.onPrepareFromMediaId);
            } else if (index == _isBlank.read.OnSwipe_touchAnchorSide) {
                int i2 = typedArray.getInt(index, this.onPlayFromSearch);
                this.onPlayFromSearch = i2;
                float[] fArr = read[i2];
                this.onPlayFromUri = fArr[0];
                this.onPrepareFromSearch = fArr[1];
            } else if (index == _isBlank.read.OnSwipe_dragDirection) {
                int i3 = typedArray.getInt(index, this.onRemoveQueueItem);
                this.onRemoveQueueItem = i3;
                float[][] fArr2 = AudioAttributesCompatParcelizer;
                if (i3 < fArr2.length) {
                    float[] fArr3 = fArr2[i3];
                    this.onRewind = fArr3[0];
                    this.onSeekTo = fArr3[1];
                } else {
                    this.onSeekTo = Float.NaN;
                    this.onRewind = Float.NaN;
                    this.IconCompatParcelizer = true;
                }
            } else if (index == _isBlank.read.OnSwipe_maxVelocity) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = typedArray.getFloat(index, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            } else if (index == _isBlank.read.OnSwipe_maxAcceleration) {
                this.MediaBrowserCompatMediaItem = typedArray.getFloat(index, this.MediaBrowserCompatMediaItem);
            } else if (index == _isBlank.read.OnSwipe_moveWhenScrollAtTop) {
                this.onCommand = typedArray.getBoolean(index, this.onCommand);
            } else if (index == _isBlank.read.OnSwipe_dragScale) {
                this.AudioAttributesImplApi21Parcelizer = typedArray.getFloat(index, this.AudioAttributesImplApi21Parcelizer);
            } else if (index == _isBlank.read.OnSwipe_dragThreshold) {
                this.AudioAttributesImplBaseParcelizer = typedArray.getFloat(index, this.AudioAttributesImplBaseParcelizer);
            } else if (index == _isBlank.read.OnSwipe_touchRegionId) {
                this.onRemoveQueueItemAt = typedArray.getResourceId(index, this.onRemoveQueueItemAt);
            } else if (index == _isBlank.read.OnSwipe_onTouchUp) {
                this.handleMediaPlayPauseIfPendingOnHandler = typedArray.getInt(index, this.handleMediaPlayPauseIfPendingOnHandler);
            } else if (index == _isBlank.read.OnSwipe_nestedScrollFlags) {
                this.MediaBrowserCompatSearchResultReceiver = typedArray.getInteger(index, 0);
            } else if (index == _isBlank.read.OnSwipe_limitBoundsTo) {
                this.MediaDescriptionCompat = typedArray.getResourceId(index, 0);
            } else if (index == _isBlank.read.OnSwipe_rotationCenterId) {
                this.onAddQueueItem = typedArray.getResourceId(index, this.onAddQueueItem);
            } else if (index == _isBlank.read.OnSwipe_springDamping) {
                this.onMediaButtonEvent = typedArray.getFloat(index, this.onMediaButtonEvent);
            } else if (index == _isBlank.read.OnSwipe_springMass) {
                this.onPause = typedArray.getFloat(index, this.onPause);
            } else if (index == _isBlank.read.OnSwipe_springStiffness) {
                this.onFastForward = typedArray.getFloat(index, this.onFastForward);
            } else if (index == _isBlank.read.OnSwipe_springStopThreshold) {
                this.onPlay = typedArray.getFloat(index, this.onPlay);
            } else if (index == _isBlank.read.OnSwipe_springBoundary) {
                this.onPlayFromMediaId = typedArray.getInt(index, this.onPlayFromMediaId);
            } else if (index == _isBlank.read.OnSwipe_autoCompleteMode) {
                this.AudioAttributesImplApi26Parcelizer = typedArray.getInt(index, this.AudioAttributesImplApi26Parcelizer);
            }
        }
    }

    final void MediaBrowserCompatItemReceiver(float f, float f2) {
        this.RatingCompat = f;
        this.MediaMetadataCompat = f2;
        this.MediaBrowserCompatItemReceiver = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void AudioAttributesCompatParcelizer(android.view.MotionEvent r26, androidx.constraintlayout.motion.widget.MotionLayout.write r27) {
        /*
            Method dump skipped, instruction units count: 829
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.PrimitiveArrayDeserializersShortDeser.AudioAttributesCompatParcelizer(android.view.MotionEvent, androidx.constraintlayout.motion.widget.MotionLayout$write):void");
    }

    final void write(MotionEvent motionEvent, MotionLayout.write writeVar) {
        int i;
        float f;
        if (this.IconCompatParcelizer) {
            AudioAttributesCompatParcelizer(motionEvent, writeVar);
            return;
        }
        writeVar.RemoteActionCompatParcelizer(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.RatingCompat = motionEvent.getRawX();
            this.MediaMetadataCompat = motionEvent.getRawY();
            this.MediaBrowserCompatItemReceiver = false;
            return;
        }
        if (action == 1) {
            this.MediaBrowserCompatItemReceiver = false;
            writeVar.RemoteActionCompatParcelizer(1000);
            float f2 = writeVar.read();
            float fRemoteActionCompatParcelizer = writeVar.RemoteActionCompatParcelizer();
            float fAudioAttributesCompatParcelizer = this.onCustomAction.AudioAttributesCompatParcelizer();
            int i2 = this.onPrepareFromMediaId;
            if (i2 != -1) {
                this.onCustomAction.write(i2, fAudioAttributesCompatParcelizer, this.onPlayFromUri, this.onPrepareFromSearch, this.MediaBrowserCompatCustomActionResultReceiver);
            } else {
                float fMin = Math.min(this.onCustomAction.getWidth(), this.onCustomAction.getHeight());
                float[] fArr = this.MediaBrowserCompatCustomActionResultReceiver;
                fArr[1] = this.onSeekTo * fMin;
                fArr[0] = fMin * this.onRewind;
            }
            float f3 = this.onRewind;
            float[] fArr2 = this.MediaBrowserCompatCustomActionResultReceiver;
            float fAbs = f3 != BitmapDescriptorFactory.HUE_RED ? f2 / fArr2[0] : fRemoteActionCompatParcelizer / fArr2[1];
            float f4 = !Float.isNaN(fAbs) ? (fAbs / 3.0f) + fAudioAttributesCompatParcelizer : fAudioAttributesCompatParcelizer;
            if (f4 == BitmapDescriptorFactory.HUE_RED || f4 == 1.0f || (i = this.handleMediaPlayPauseIfPendingOnHandler) == 3) {
                if (BitmapDescriptorFactory.HUE_RED >= f4 || 1.0f <= f4) {
                    this.onCustomAction.write(MotionLayout.AudioAttributesImplApi21Parcelizer.FINISHED);
                    return;
                }
                return;
            }
            float f5 = ((double) f4) < 0.5d ? 0.0f : 1.0f;
            if (i == 6) {
                if (fAudioAttributesCompatParcelizer + fAbs < BitmapDescriptorFactory.HUE_RED) {
                    fAbs = Math.abs(fAbs);
                }
                f5 = 1.0f;
            }
            if (this.handleMediaPlayPauseIfPendingOnHandler == 7) {
                if (fAudioAttributesCompatParcelizer + fAbs > 1.0f) {
                    fAbs = -Math.abs(fAbs);
                }
                f5 = 0.0f;
            }
            this.onCustomAction.IconCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, f5, fAbs);
            if (BitmapDescriptorFactory.HUE_RED >= fAudioAttributesCompatParcelizer || 1.0f <= fAudioAttributesCompatParcelizer) {
                this.onCustomAction.write(MotionLayout.AudioAttributesImplApi21Parcelizer.FINISHED);
                return;
            }
            return;
        }
        if (action == 2) {
            float rawY = motionEvent.getRawY() - this.MediaMetadataCompat;
            float rawX = motionEvent.getRawX() - this.RatingCompat;
            if (Math.abs((this.onRewind * rawX) + (this.onSeekTo * rawY)) > this.AudioAttributesImplBaseParcelizer || this.MediaBrowserCompatItemReceiver) {
                float fAudioAttributesCompatParcelizer2 = this.onCustomAction.AudioAttributesCompatParcelizer();
                if (!this.MediaBrowserCompatItemReceiver) {
                    this.MediaBrowserCompatItemReceiver = true;
                    this.onCustomAction.setProgress(fAudioAttributesCompatParcelizer2);
                }
                int i3 = this.onPrepareFromMediaId;
                if (i3 != -1) {
                    this.onCustomAction.write(i3, fAudioAttributesCompatParcelizer2, this.onPlayFromUri, this.onPrepareFromSearch, this.MediaBrowserCompatCustomActionResultReceiver);
                } else {
                    float fMin2 = Math.min(this.onCustomAction.getWidth(), this.onCustomAction.getHeight());
                    float[] fArr3 = this.MediaBrowserCompatCustomActionResultReceiver;
                    fArr3[1] = this.onSeekTo * fMin2;
                    fArr3[0] = fMin2 * this.onRewind;
                }
                float f6 = this.onRewind;
                float[] fArr4 = this.MediaBrowserCompatCustomActionResultReceiver;
                if (Math.abs(((f6 * fArr4[0]) + (this.onSeekTo * fArr4[1])) * this.AudioAttributesImplApi21Parcelizer) < 0.01d) {
                    float[] fArr5 = this.MediaBrowserCompatCustomActionResultReceiver;
                    fArr5[0] = 0.01f;
                    fArr5[1] = 0.01f;
                }
                if (this.onRewind != BitmapDescriptorFactory.HUE_RED) {
                    f = rawX / this.MediaBrowserCompatCustomActionResultReceiver[0];
                } else {
                    f = rawY / this.MediaBrowserCompatCustomActionResultReceiver[1];
                }
                float fMax = Math.max(Math.min(fAudioAttributesCompatParcelizer2 + f, 1.0f), BitmapDescriptorFactory.HUE_RED);
                if (this.handleMediaPlayPauseIfPendingOnHandler == 6) {
                    fMax = Math.max(fMax, 0.01f);
                }
                if (this.handleMediaPlayPauseIfPendingOnHandler == 7) {
                    fMax = Math.min(fMax, 0.99f);
                }
                float fAudioAttributesCompatParcelizer3 = this.onCustomAction.AudioAttributesCompatParcelizer();
                if (fMax != fAudioAttributesCompatParcelizer3) {
                    if (fAudioAttributesCompatParcelizer3 == BitmapDescriptorFactory.HUE_RED || fAudioAttributesCompatParcelizer3 == 1.0f) {
                        this.onCustomAction.IconCompatParcelizer(fAudioAttributesCompatParcelizer3 == BitmapDescriptorFactory.HUE_RED);
                    }
                    this.onCustomAction.setProgress(fMax);
                    writeVar.RemoteActionCompatParcelizer(1000);
                    this.onCustomAction.AudioAttributesImplBaseParcelizer = this.onRewind != BitmapDescriptorFactory.HUE_RED ? writeVar.read() / this.MediaBrowserCompatCustomActionResultReceiver[0] : writeVar.RemoteActionCompatParcelizer() / this.MediaBrowserCompatCustomActionResultReceiver[1];
                } else {
                    this.onCustomAction.AudioAttributesImplBaseParcelizer = BitmapDescriptorFactory.HUE_RED;
                }
                this.RatingCompat = motionEvent.getRawX();
                this.MediaMetadataCompat = motionEvent.getRawY();
            }
        }
    }

    final void RemoteActionCompatParcelizer(float f, float f2) {
        this.RatingCompat = f;
        this.MediaMetadataCompat = f2;
    }

    final float read(float f, float f2) {
        this.onCustomAction.write(this.onPrepareFromMediaId, this.onCustomAction.AudioAttributesCompatParcelizer(), this.onPlayFromUri, this.onPrepareFromSearch, this.MediaBrowserCompatCustomActionResultReceiver);
        float f3 = this.onRewind;
        if (f3 != BitmapDescriptorFactory.HUE_RED) {
            float[] fArr = this.MediaBrowserCompatCustomActionResultReceiver;
            if (fArr[0] == BitmapDescriptorFactory.HUE_RED) {
                fArr[0] = 1.0E-7f;
            }
            return (f * f3) / fArr[0];
        }
        float[] fArr2 = this.MediaBrowserCompatCustomActionResultReceiver;
        if (fArr2[1] == BitmapDescriptorFactory.HUE_RED) {
            fArr2[1] = 1.0E-7f;
        }
        return (f2 * this.onSeekTo) / fArr2[1];
    }

    final void IconCompatParcelizer(float f, float f2) {
        this.MediaBrowserCompatItemReceiver = false;
        float fAudioAttributesCompatParcelizer = this.onCustomAction.AudioAttributesCompatParcelizer();
        this.onCustomAction.write(this.onPrepareFromMediaId, fAudioAttributesCompatParcelizer, this.onPlayFromUri, this.onPrepareFromSearch, this.MediaBrowserCompatCustomActionResultReceiver);
        float f3 = this.onRewind;
        float[] fArr = this.MediaBrowserCompatCustomActionResultReceiver;
        float f4 = fArr[0];
        float f5 = this.onSeekTo;
        float f6 = fArr[1];
        float f7 = BitmapDescriptorFactory.HUE_RED;
        float f8 = f3 != BitmapDescriptorFactory.HUE_RED ? (f * f3) / f4 : (f2 * f5) / f6;
        if (!Float.isNaN(f8)) {
            fAudioAttributesCompatParcelizer += f8 / 3.0f;
        }
        if (fAudioAttributesCompatParcelizer != BitmapDescriptorFactory.HUE_RED) {
            boolean z = fAudioAttributesCompatParcelizer != 1.0f;
            int i = this.handleMediaPlayPauseIfPendingOnHandler;
            if ((i != 3) && z) {
                MotionLayout motionLayout = this.onCustomAction;
                if (fAudioAttributesCompatParcelizer >= 0.5d) {
                    f7 = 1.0f;
                }
                motionLayout.IconCompatParcelizer(i, f7, f8);
            }
        }
    }

    final void write(float f, float f2) {
        float f3;
        float fAudioAttributesCompatParcelizer = this.onCustomAction.AudioAttributesCompatParcelizer();
        if (!this.MediaBrowserCompatItemReceiver) {
            this.MediaBrowserCompatItemReceiver = true;
            this.onCustomAction.setProgress(fAudioAttributesCompatParcelizer);
        }
        this.onCustomAction.write(this.onPrepareFromMediaId, fAudioAttributesCompatParcelizer, this.onPlayFromUri, this.onPrepareFromSearch, this.MediaBrowserCompatCustomActionResultReceiver);
        float f4 = this.onRewind;
        float[] fArr = this.MediaBrowserCompatCustomActionResultReceiver;
        if (Math.abs((f4 * fArr[0]) + (this.onSeekTo * fArr[1])) < 0.01d) {
            float[] fArr2 = this.MediaBrowserCompatCustomActionResultReceiver;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f5 = this.onRewind;
        if (f5 != BitmapDescriptorFactory.HUE_RED) {
            f3 = (f * f5) / this.MediaBrowserCompatCustomActionResultReceiver[0];
        } else {
            f3 = (f2 * this.onSeekTo) / this.MediaBrowserCompatCustomActionResultReceiver[1];
        }
        float fMax = Math.max(Math.min(fAudioAttributesCompatParcelizer + f3, 1.0f), BitmapDescriptorFactory.HUE_RED);
        if (fMax != this.onCustomAction.AudioAttributesCompatParcelizer()) {
            this.onCustomAction.setProgress(fMax);
        }
    }

    final void MediaBrowserCompatSearchResultReceiver() {
        View viewFindViewById;
        int i = this.onPrepareFromMediaId;
        if (i != -1) {
            viewFindViewById = this.onCustomAction.findViewById(i);
            if (viewFindViewById == null) {
                NumberDeserializersShortDeserializer.IconCompatParcelizer(this.onCustomAction.getContext(), this.onPrepareFromMediaId);
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new View.OnTouchListener() { // from class: o.PrimitiveArrayDeserializersShortDeser.3
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return false;
                }
            });
            nestedScrollView.setOnScrollChangeListener(new NestedScrollView.write() { // from class: o.PrimitiveArrayDeserializersShortDeser.4
                @Override // androidx.core.widget.NestedScrollView.write
                public final void read(NestedScrollView nestedScrollView2, int i2, int i3, int i4, int i5) {
                }
            });
        }
    }

    final float RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final float AudioAttributesCompatParcelizer() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    final boolean write() {
        return this.onCommand;
    }

    public final int read() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final RectF AudioAttributesCompatParcelizer(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.onRemoveQueueItemAt;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public final int MediaBrowserCompatMediaItem() {
        return this.onRemoveQueueItemAt;
    }

    final RectF RemoteActionCompatParcelizer(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.MediaDescriptionCompat;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    final float AudioAttributesCompatParcelizer(float f, float f2) {
        return (f * this.onRewind) + (f2 * this.onSeekTo);
    }

    public final String toString() {
        if (Float.isNaN(this.onRewind)) {
            return "rotation";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.onRewind);
        sb.append(" , ");
        sb.append(this.onSeekTo);
        return sb.toString();
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.handleMediaPlayPauseIfPendingOnHandler = 5;
    }

    public final float AudioAttributesImplApi21Parcelizer() {
        return this.onFastForward;
    }

    public final float MediaBrowserCompatCustomActionResultReceiver() {
        return this.onPause;
    }

    public final float MediaBrowserCompatItemReceiver() {
        return this.onMediaButtonEvent;
    }

    public final float AudioAttributesImplApi26Parcelizer() {
        return this.onPlay;
    }

    public final int AudioAttributesImplBaseParcelizer() {
        return this.onPlayFromMediaId;
    }

    public final boolean MediaMetadataCompat() {
        return this.MediaBrowserCompatItemReceiver;
    }
}
