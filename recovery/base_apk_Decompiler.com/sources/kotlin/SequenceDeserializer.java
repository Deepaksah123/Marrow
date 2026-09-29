package kotlin;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class SequenceDeserializer extends RecyclerView.AudioAttributesImplBaseParcelizer implements RecyclerView.MediaBrowserCompatMediaItem {
    private static final int[] AudioAttributesImplApi26Parcelizer = {R.attr.state_pressed};
    private static final int[] read = new int[0];
    final Drawable AudioAttributesCompatParcelizer;
    private final Runnable AudioAttributesImplApi21Parcelizer;
    final StateListDrawable IconCompatParcelizer;
    private float MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private final RecyclerView.MediaBrowserCompatSearchResultReceiver MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final int MediaDescriptionCompat;
    private final Drawable MediaMetadataCompat;
    private final StateListDrawable RatingCompat;
    final ValueAnimator RemoteActionCompatParcelizer;
    private final int handleMediaPlayPauseIfPendingOnHandler;
    private final int onCommand;
    private final int onFastForward;
    private RecyclerView onPause;
    private int onPlayFromSearch;
    private final int onPrepare;
    private float onPrepareFromMediaId;
    private int onPrepareFromSearch;
    private final int onRemoveQueueItemAt;
    int write;
    private int onMediaButtonEvent = 0;
    private int onPlayFromMediaId = 0;
    private boolean onAddQueueItem = false;
    private boolean onCustomAction = false;
    private int onPlay = 0;
    private int AudioAttributesImplBaseParcelizer = 0;
    private final int[] onPlayFromUri = new int[2];
    private final int[] MediaBrowserCompatItemReceiver = new int[2];

    public SequenceDeserializer(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.RemoteActionCompatParcelizer = valueAnimatorOfFloat;
        this.write = 0;
        this.AudioAttributesImplApi21Parcelizer = new Runnable() { // from class: o.SequenceDeserializer.3
            @Override // java.lang.Runnable
            public final void run() {
                SequenceDeserializer.this.AudioAttributesCompatParcelizer();
            }
        };
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new RecyclerView.MediaBrowserCompatSearchResultReceiver() { // from class: o.SequenceDeserializer.2
            @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatSearchResultReceiver
            public final void RemoteActionCompatParcelizer(RecyclerView recyclerView2, int i4, int i5) {
                SequenceDeserializer.this.AudioAttributesCompatParcelizer(recyclerView2.computeHorizontalScrollOffset(), recyclerView2.computeVerticalScrollOffset());
            }
        };
        this.IconCompatParcelizer = stateListDrawable;
        this.AudioAttributesCompatParcelizer = drawable;
        this.RatingCompat = stateListDrawable2;
        this.MediaMetadataCompat = drawable2;
        this.onPrepare = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.onRemoveQueueItemAt = Math.max(i, drawable.getIntrinsicWidth());
        this.MediaDescriptionCompat = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.handleMediaPlayPauseIfPendingOnHandler = Math.max(i, drawable2.getIntrinsicWidth());
        this.onFastForward = i2;
        this.onCommand = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new write());
        valueAnimatorOfFloat.addUpdateListener(new IconCompatParcelizer());
        read(recyclerView);
    }

    private void read(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.onPause;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                RemoteActionCompatParcelizer();
            }
            this.onPause = recyclerView;
            if (recyclerView != null) {
                AudioAttributesImplApi21Parcelizer();
            }
        }
    }

    private void AudioAttributesImplApi21Parcelizer() {
        this.onPause.AudioAttributesCompatParcelizer((RecyclerView.AudioAttributesImplBaseParcelizer) this);
        this.onPause.AudioAttributesCompatParcelizer((RecyclerView.MediaBrowserCompatMediaItem) this);
        this.onPause.RemoteActionCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    private void RemoteActionCompatParcelizer() {
        this.onPause.RemoteActionCompatParcelizer(this);
        this.onPause.write(this);
        this.onPause.write(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        write();
    }

    final void read() {
        this.onPause.invalidate();
    }

    final void RemoteActionCompatParcelizer(int i) {
        if (i == 2 && this.onPlay != 2) {
            this.IconCompatParcelizer.setState(AudioAttributesImplApi26Parcelizer);
            write();
        }
        if (i == 0) {
            read();
        } else {
            AudioAttributesImplApi26Parcelizer();
        }
        if (this.onPlay == 2 && i != 2) {
            this.IconCompatParcelizer.setState(read);
            AudioAttributesCompatParcelizer(1200);
        } else if (i == 1) {
            AudioAttributesCompatParcelizer(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.onPlay = i;
    }

    private boolean MediaBrowserCompatItemReceiver() {
        return InvalidTypeIdException.MediaBrowserCompatMediaItem(this.onPause) == 1;
    }

    private void AudioAttributesImplApi26Parcelizer() {
        int i = this.write;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.RemoteActionCompatParcelizer.cancel();
            }
        }
        this.write = 1;
        ValueAnimator valueAnimator = this.RemoteActionCompatParcelizer;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.RemoteActionCompatParcelizer.setDuration(500L);
        this.RemoteActionCompatParcelizer.setStartDelay(0L);
        this.RemoteActionCompatParcelizer.start();
    }

    final void AudioAttributesCompatParcelizer() {
        int i = this.write;
        if (i == 1) {
            this.RemoteActionCompatParcelizer.cancel();
        } else if (i != 2) {
            return;
        }
        this.write = 3;
        ValueAnimator valueAnimator = this.RemoteActionCompatParcelizer;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), BitmapDescriptorFactory.HUE_RED);
        this.RemoteActionCompatParcelizer.setDuration(500L);
        this.RemoteActionCompatParcelizer.start();
    }

    private void write() {
        this.onPause.removeCallbacks(this.AudioAttributesImplApi21Parcelizer);
    }

    private void AudioAttributesCompatParcelizer(int i) {
        write();
        this.onPause.postDelayed(this.AudioAttributesImplApi21Parcelizer, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AudioAttributesImplBaseParcelizer
    public final void AudioAttributesCompatParcelizer(Canvas canvas, RecyclerView recyclerView, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        if (this.onMediaButtonEvent != this.onPause.getWidth() || this.onPlayFromMediaId != this.onPause.getHeight()) {
            this.onMediaButtonEvent = this.onPause.getWidth();
            this.onPlayFromMediaId = this.onPause.getHeight();
            RemoteActionCompatParcelizer(0);
        } else if (this.write != 0) {
            if (this.onAddQueueItem) {
                read(canvas);
            }
            if (this.onCustomAction) {
                AudioAttributesCompatParcelizer(canvas);
            }
        }
    }

    private void read(Canvas canvas) {
        int i = this.onMediaButtonEvent;
        int i2 = this.onPrepare;
        int i3 = i - i2;
        int i4 = this.onPrepareFromSearch;
        int i5 = this.onPlayFromSearch;
        int i6 = i4 - (i5 / 2);
        this.IconCompatParcelizer.setBounds(0, 0, i2, i5);
        this.AudioAttributesCompatParcelizer.setBounds(0, 0, this.onRemoveQueueItemAt, this.onPlayFromMediaId);
        if (MediaBrowserCompatItemReceiver()) {
            this.AudioAttributesCompatParcelizer.draw(canvas);
            canvas.translate(this.onPrepare, i6);
            canvas.scale(-1.0f, 1.0f);
            this.IconCompatParcelizer.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate(-this.onPrepare, -i6);
            return;
        }
        canvas.translate(i3, BitmapDescriptorFactory.HUE_RED);
        this.AudioAttributesCompatParcelizer.draw(canvas);
        canvas.translate(BitmapDescriptorFactory.HUE_RED, i6);
        this.IconCompatParcelizer.draw(canvas);
        canvas.translate(-i3, -i6);
    }

    private void AudioAttributesCompatParcelizer(Canvas canvas) {
        int i = this.onPlayFromMediaId;
        int i2 = this.MediaDescriptionCompat;
        int i3 = this.MediaBrowserCompatMediaItem;
        int i4 = this.MediaBrowserCompatSearchResultReceiver;
        this.RatingCompat.setBounds(0, 0, i4, i2);
        this.MediaMetadataCompat.setBounds(0, 0, this.onMediaButtonEvent, this.handleMediaPlayPauseIfPendingOnHandler);
        canvas.translate(BitmapDescriptorFactory.HUE_RED, i - i2);
        this.MediaMetadataCompat.draw(canvas);
        canvas.translate(i3 - (i4 / 2), BitmapDescriptorFactory.HUE_RED);
        this.RatingCompat.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    final void AudioAttributesCompatParcelizer(int i, int i2) {
        int iComputeVerticalScrollRange = this.onPause.computeVerticalScrollRange();
        int i3 = this.onPlayFromMediaId;
        this.onAddQueueItem = iComputeVerticalScrollRange - i3 > 0 && i3 >= this.onFastForward;
        int iComputeHorizontalScrollRange = this.onPause.computeHorizontalScrollRange();
        int i4 = this.onMediaButtonEvent;
        boolean z = iComputeHorizontalScrollRange - i4 > 0 && i4 >= this.onFastForward;
        this.onCustomAction = z;
        boolean z2 = this.onAddQueueItem;
        if (!z2 && !z) {
            if (this.onPlay != 0) {
                RemoteActionCompatParcelizer(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i3;
            this.onPrepareFromSearch = (int) ((f * (i2 + (f / 2.0f))) / iComputeVerticalScrollRange);
            this.onPlayFromSearch = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        }
        if (this.onCustomAction) {
            float f2 = i4;
            this.MediaBrowserCompatMediaItem = (int) ((f2 * (i + (f2 / 2.0f))) / iComputeHorizontalScrollRange);
            this.MediaBrowserCompatSearchResultReceiver = Math.min(i4, (i4 * i4) / iComputeHorizontalScrollRange);
        }
        int i5 = this.onPlay;
        if (i5 == 0 || i5 == 1) {
            RemoteActionCompatParcelizer(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatMediaItem
    public final boolean IconCompatParcelizer(MotionEvent motionEvent) {
        int i = this.onPlay;
        if (i != 1) {
            return i == 2;
        }
        boolean zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(motionEvent.getX(), motionEvent.getY());
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!zAudioAttributesCompatParcelizer && !zRemoteActionCompatParcelizer)) {
            return false;
        }
        if (zRemoteActionCompatParcelizer) {
            this.AudioAttributesImplBaseParcelizer = 1;
            this.MediaBrowserCompatCustomActionResultReceiver = (int) motionEvent.getX();
        } else if (zAudioAttributesCompatParcelizer) {
            this.AudioAttributesImplBaseParcelizer = 2;
            this.onPrepareFromMediaId = (int) motionEvent.getY();
        }
        RemoteActionCompatParcelizer(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatMediaItem
    public final void read(MotionEvent motionEvent) {
        if (this.onPlay != 0) {
            if (motionEvent.getAction() == 0) {
                boolean zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(motionEvent.getX(), motionEvent.getY());
                boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(motionEvent.getX(), motionEvent.getY());
                if (zAudioAttributesCompatParcelizer || zRemoteActionCompatParcelizer) {
                    if (zRemoteActionCompatParcelizer) {
                        this.AudioAttributesImplBaseParcelizer = 1;
                        this.MediaBrowserCompatCustomActionResultReceiver = (int) motionEvent.getX();
                    } else if (zAudioAttributesCompatParcelizer) {
                        this.AudioAttributesImplBaseParcelizer = 2;
                        this.onPrepareFromMediaId = (int) motionEvent.getY();
                    }
                    RemoteActionCompatParcelizer(2);
                    return;
                }
                return;
            }
            if (motionEvent.getAction() == 1 && this.onPlay == 2) {
                this.onPrepareFromMediaId = BitmapDescriptorFactory.HUE_RED;
                this.MediaBrowserCompatCustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
                RemoteActionCompatParcelizer(1);
                this.AudioAttributesImplBaseParcelizer = 0;
                return;
            }
            if (motionEvent.getAction() == 2 && this.onPlay == 2) {
                AudioAttributesImplApi26Parcelizer();
                if (this.AudioAttributesImplBaseParcelizer == 1) {
                    AudioAttributesCompatParcelizer(motionEvent.getX());
                }
                if (this.AudioAttributesImplBaseParcelizer == 2) {
                    RemoteActionCompatParcelizer(motionEvent.getY());
                }
            }
        }
    }

    private void RemoteActionCompatParcelizer(float f) {
        int[] iArrAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        float fMax = Math.max(iArrAudioAttributesImplBaseParcelizer[0], Math.min(iArrAudioAttributesImplBaseParcelizer[1], f));
        if (Math.abs(this.onPrepareFromSearch - fMax) < 2.0f) {
            return;
        }
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.onPrepareFromMediaId, fMax, iArrAudioAttributesImplBaseParcelizer, this.onPause.computeVerticalScrollRange(), this.onPause.computeVerticalScrollOffset(), this.onPlayFromMediaId);
        if (iAudioAttributesCompatParcelizer != 0) {
            this.onPause.scrollBy(0, iAudioAttributesCompatParcelizer);
        }
        this.onPrepareFromMediaId = fMax;
    }

    private void AudioAttributesCompatParcelizer(float f) {
        int[] iArrIconCompatParcelizer = IconCompatParcelizer();
        float fMax = Math.max(iArrIconCompatParcelizer[0], Math.min(iArrIconCompatParcelizer[1], f));
        if (Math.abs(this.MediaBrowserCompatMediaItem - fMax) < 2.0f) {
            return;
        }
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, fMax, iArrIconCompatParcelizer, this.onPause.computeHorizontalScrollRange(), this.onPause.computeHorizontalScrollOffset(), this.onMediaButtonEvent);
        if (iAudioAttributesCompatParcelizer != 0) {
            this.onPause.scrollBy(iAudioAttributesCompatParcelizer, 0);
        }
        this.MediaBrowserCompatCustomActionResultReceiver = fMax;
    }

    private static int AudioAttributesCompatParcelizer(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    private boolean AudioAttributesCompatParcelizer(float f, float f2) {
        if (MediaBrowserCompatItemReceiver()) {
            if (f > this.onPrepare) {
                return false;
            }
        } else if (f < this.onMediaButtonEvent - this.onPrepare) {
            return false;
        }
        int i = this.onPrepareFromSearch;
        int i2 = this.onPlayFromSearch / 2;
        return f2 >= ((float) (i - i2)) && f2 <= ((float) (i + i2));
    }

    private boolean RemoteActionCompatParcelizer(float f, float f2) {
        if (f2 < this.onPlayFromMediaId - this.MediaDescriptionCompat) {
            return false;
        }
        int i = this.MediaBrowserCompatMediaItem;
        int i2 = this.MediaBrowserCompatSearchResultReceiver / 2;
        return f >= ((float) (i - i2)) && f <= ((float) (i + i2));
    }

    private int[] AudioAttributesImplBaseParcelizer() {
        int[] iArr = this.onPlayFromUri;
        int i = this.onCommand;
        iArr[0] = i;
        iArr[1] = this.onPlayFromMediaId - i;
        return iArr;
    }

    private int[] IconCompatParcelizer() {
        int[] iArr = this.MediaBrowserCompatItemReceiver;
        int i = this.onCommand;
        iArr[0] = i;
        iArr[1] = this.onMediaButtonEvent - i;
        return iArr;
    }

    class write extends AnimatorListenerAdapter {
        private boolean RemoteActionCompatParcelizer = false;

        write() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.RemoteActionCompatParcelizer) {
                this.RemoteActionCompatParcelizer = false;
            } else if (((Float) SequenceDeserializer.this.RemoteActionCompatParcelizer.getAnimatedValue()).floatValue() == BitmapDescriptorFactory.HUE_RED) {
                SequenceDeserializer.this.write = 0;
                SequenceDeserializer.this.RemoteActionCompatParcelizer(0);
            } else {
                SequenceDeserializer.this.write = 2;
                SequenceDeserializer.this.read();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.RemoteActionCompatParcelizer = true;
        }
    }

    class IconCompatParcelizer implements ValueAnimator.AnimatorUpdateListener {
        IconCompatParcelizer() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            SequenceDeserializer.this.IconCompatParcelizer.setAlpha(iFloatValue);
            SequenceDeserializer.this.AudioAttributesCompatParcelizer.setAlpha(iFloatValue);
            SequenceDeserializer.this.read();
        }
    }
}
