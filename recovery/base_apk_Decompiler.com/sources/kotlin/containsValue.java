package kotlin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerControlView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.maximumCapacity;

/* JADX INFO: loaded from: classes2.dex */
public final class containsValue {
    private final ViewGroup AudioAttributesCompatParcelizer;
    private final AnimatorSet AudioAttributesImplApi21Parcelizer;
    private final ViewGroup IconCompatParcelizer;
    private final ViewGroup MediaBrowserCompatCustomActionResultReceiver;
    private final ViewGroup MediaBrowserCompatItemReceiver;
    private final AnimatorSet MediaBrowserCompatSearchResultReceiver;
    private final ValueAnimator MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private boolean MediaMetadataCompat;
    private final AnimatorSet RatingCompat;
    private final View RemoteActionCompatParcelizer;
    private final ValueAnimator onAddQueueItem;
    private boolean onCommand;
    private final ViewGroup onCustomAction;
    private final PlayerControlView onMediaButtonEvent;
    private final AnimatorSet onPause;
    private final View onPlay;
    private final AnimatorSet onPlayFromMediaId;
    private final View onPrepare;
    private final ViewGroup onPrepareFromSearch;
    private final ViewGroup write;
    private final Runnable onFastForward = new Runnable() { // from class: o.makeDead
        @Override // java.lang.Runnable
        public final void run() {
            this.IconCompatParcelizer.MediaMetadataCompat();
        }
    };
    private final Runnable AudioAttributesImplApi26Parcelizer = new Runnable() { // from class: o.concurrencyLevel
        @Override // java.lang.Runnable
        public final void run() {
            this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        }
    };
    private final Runnable MediaBrowserCompatMediaItem = new Runnable() { // from class: o.run
        @Override // java.lang.Runnable
        public final void run() {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem();
        }
    };
    private final Runnable MediaDescriptionCompat = new Runnable() { // from class: o.hasOverflowed
        @Override // java.lang.Runnable
        public final void run() {
            this.read.MediaDescriptionCompat();
        }
    };
    private final Runnable AudioAttributesImplBaseParcelizer = new Runnable() { // from class: o.evict
        @Override // java.lang.Runnable
        public final void run() {
            this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer();
        }
    };
    private final View.OnLayoutChangeListener handleMediaPlayPauseIfPendingOnHandler = new View.OnLayoutChangeListener() { // from class: o.keySet
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(view, i, i3, i5, i7);
        }
    };
    private boolean read = true;
    private int onPlayFromSearch = 0;
    private final List<View> onPrepareFromMediaId = new ArrayList();

    static /* synthetic */ boolean MediaDescriptionCompat(containsValue containsvalue) {
        containsvalue.onCommand = false;
        return false;
    }

    public containsValue(final PlayerControlView playerControlView) {
        this.onMediaButtonEvent = playerControlView;
        this.RemoteActionCompatParcelizer = playerControlView.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_controls_background);
        this.AudioAttributesCompatParcelizer = (ViewGroup) playerControlView.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_center_controls);
        this.onCustomAction = (ViewGroup) playerControlView.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) playerControlView.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_bottom_bar);
        this.write = viewGroup;
        this.onPrepareFromSearch = (ViewGroup) playerControlView.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_time);
        View viewFindViewById = playerControlView.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_progress);
        this.onPrepare = viewFindViewById;
        this.IconCompatParcelizer = (ViewGroup) playerControlView.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_basic_controls);
        this.MediaBrowserCompatItemReceiver = (ViewGroup) playerControlView.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_extra_controls);
        this.MediaBrowserCompatCustomActionResultReceiver = (ViewGroup) playerControlView.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_extra_controls_scroll_view);
        View viewFindViewById2 = playerControlView.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_overflow_show);
        this.onPlay = viewFindViewById2;
        View viewFindViewById3 = playerControlView.findViewById(maximumCapacity.AudioAttributesImplBaseParcelizer.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: o.entrySet
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.read.IconCompatParcelizer(view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: o.entrySet
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.read.IconCompatParcelizer(view);
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.recordRead
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: o.containsValue.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                if (!(containsValue.this.onPrepare instanceof DefaultTimeBar) || containsValue.this.MediaMetadataCompat) {
                    return;
                }
                ((DefaultTimeBar) containsValue.this.onPrepare).read();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (containsValue.this.RemoteActionCompatParcelizer != null) {
                    containsValue.this.RemoteActionCompatParcelizer.setVisibility(4);
                }
                if (containsValue.this.AudioAttributesCompatParcelizer != null) {
                    containsValue.this.AudioAttributesCompatParcelizer.setVisibility(4);
                }
                if (containsValue.this.onCustomAction != null) {
                    containsValue.this.onCustomAction.setVisibility(4);
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.tryToRetire
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.write.RemoteActionCompatParcelizer(valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() { // from class: o.containsValue.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                if (containsValue.this.RemoteActionCompatParcelizer != null) {
                    containsValue.this.RemoteActionCompatParcelizer.setVisibility(0);
                }
                if (containsValue.this.AudioAttributesCompatParcelizer != null) {
                    containsValue.this.AudioAttributesCompatParcelizer.setVisibility(0);
                }
                if (containsValue.this.onCustomAction != null) {
                    containsValue.this.onCustomAction.setVisibility(containsValue.this.MediaMetadataCompat ? 0 : 4);
                }
                if (!(containsValue.this.onPrepare instanceof DefaultTimeBar) || containsValue.this.MediaMetadataCompat) {
                    return;
                }
                ((DefaultTimeBar) containsValue.this.onPrepare).RemoteActionCompatParcelizer();
            }
        });
        Resources resources = playerControlView.getResources();
        float dimension = resources.getDimension(maximumCapacity.RemoteActionCompatParcelizer.exo_styled_bottom_bar_height) - resources.getDimension(maximumCapacity.RemoteActionCompatParcelizer.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(maximumCapacity.RemoteActionCompatParcelizer.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.MediaBrowserCompatSearchResultReceiver = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: o.containsValue.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                containsValue.this.write(3);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                containsValue.this.write(1);
                if (containsValue.this.onCommand) {
                    playerControlView.post(containsValue.this.onFastForward);
                    containsValue.MediaDescriptionCompat(containsValue.this);
                }
            }
        });
        animatorSet.play(valueAnimatorOfFloat).with(write(BitmapDescriptorFactory.HUE_RED, dimension, viewFindViewById)).with(write(BitmapDescriptorFactory.HUE_RED, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.RatingCompat = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: o.containsValue.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                containsValue.this.write(3);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                containsValue.this.write(2);
                if (containsValue.this.onCommand) {
                    playerControlView.post(containsValue.this.onFastForward);
                    containsValue.MediaDescriptionCompat(containsValue.this);
                }
            }
        });
        animatorSet2.play(write(dimension, dimension2, viewFindViewById)).with(write(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.AudioAttributesImplApi21Parcelizer = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new AnimatorListenerAdapter() { // from class: o.containsValue.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                containsValue.this.write(3);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                containsValue.this.write(2);
                if (containsValue.this.onCommand) {
                    playerControlView.post(containsValue.this.onFastForward);
                    containsValue.MediaDescriptionCompat(containsValue.this);
                }
            }
        });
        animatorSet3.play(valueAnimatorOfFloat).with(write(BitmapDescriptorFactory.HUE_RED, dimension2, viewFindViewById)).with(write(BitmapDescriptorFactory.HUE_RED, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.onPlayFromMediaId = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new AnimatorListenerAdapter() { // from class: o.containsValue.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                containsValue.this.write(4);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                containsValue.this.write(0);
            }
        });
        animatorSet4.play(valueAnimatorOfFloat2).with(write(dimension, BitmapDescriptorFactory.HUE_RED, viewFindViewById)).with(write(dimension, BitmapDescriptorFactory.HUE_RED, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.onPause = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new AnimatorListenerAdapter() { // from class: o.containsValue.10
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                containsValue.this.write(4);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                containsValue.this.write(0);
            }
        });
        animatorSet5.play(valueAnimatorOfFloat2).with(write(dimension2, BitmapDescriptorFactory.HUE_RED, viewFindViewById)).with(write(dimension2, BitmapDescriptorFactory.HUE_RED, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.makeRetired
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.read.AudioAttributesCompatParcelizer(valueAnimator);
            }
        });
        valueAnimatorOfFloat3.addListener(new AnimatorListenerAdapter() { // from class: o.containsValue.9
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                if (containsValue.this.MediaBrowserCompatCustomActionResultReceiver != null) {
                    containsValue.this.MediaBrowserCompatCustomActionResultReceiver.setVisibility(0);
                    containsValue.this.MediaBrowserCompatCustomActionResultReceiver.setTranslationX(containsValue.this.MediaBrowserCompatCustomActionResultReceiver.getWidth());
                    containsValue.this.MediaBrowserCompatCustomActionResultReceiver.scrollTo(containsValue.this.MediaBrowserCompatCustomActionResultReceiver.getWidth(), 0);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (containsValue.this.IconCompatParcelizer != null) {
                    containsValue.this.IconCompatParcelizer.setVisibility(4);
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        this.onAddQueueItem = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.PrivateMaxEntriesMap1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.AudioAttributesCompatParcelizer.read(valueAnimator);
            }
        });
        valueAnimatorOfFloat4.addListener(new AnimatorListenerAdapter() { // from class: o.containsValue.8
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                if (containsValue.this.IconCompatParcelizer != null) {
                    containsValue.this.IconCompatParcelizer.setVisibility(0);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (containsValue.this.MediaBrowserCompatCustomActionResultReceiver != null) {
                    containsValue.this.MediaBrowserCompatCustomActionResultReceiver.setVisibility(4);
                }
            }
        });
    }

    final /* synthetic */ void IconCompatParcelizer(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.RemoteActionCompatParcelizer;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = this.AudioAttributesCompatParcelizer;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = this.onCustomAction;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    final /* synthetic */ void RemoteActionCompatParcelizer(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.RemoteActionCompatParcelizer;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = this.AudioAttributesCompatParcelizer;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = this.onCustomAction;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    final /* synthetic */ void AudioAttributesCompatParcelizer(ValueAnimator valueAnimator) {
        write(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    final /* synthetic */ void read(ValueAnimator valueAnimator) {
        write(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        if (!this.onMediaButtonEvent.read()) {
            this.onMediaButtonEvent.setVisibility(0);
            this.onMediaButtonEvent.MediaBrowserCompatItemReceiver();
            this.onMediaButtonEvent.AudioAttributesImplBaseParcelizer();
        }
        MediaMetadataCompat();
    }

    public final void IconCompatParcelizer() {
        int i = this.onPlayFromSearch;
        if (i == 3 || i == 2) {
            return;
        }
        MediaBrowserCompatItemReceiver();
        if (!this.read) {
            AudioAttributesImplBaseParcelizer();
        } else if (this.onPlayFromSearch == 1) {
            MediaBrowserCompatMediaItem();
        } else {
            AudioAttributesImplApi26Parcelizer();
        }
    }

    public final void AudioAttributesCompatParcelizer() {
        int i = this.onPlayFromSearch;
        if (i == 3 || i == 2) {
            return;
        }
        MediaBrowserCompatItemReceiver();
        AudioAttributesImplBaseParcelizer();
    }

    public final void write(boolean z) {
        this.read = z;
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        if (this.onPlayFromSearch != 3) {
            MediaBrowserCompatItemReceiver();
            int iAudioAttributesCompatParcelizer = this.onMediaButtonEvent.AudioAttributesCompatParcelizer();
            if (iAudioAttributesCompatParcelizer > 0) {
                if (!this.read) {
                    read(this.AudioAttributesImplBaseParcelizer, iAudioAttributesCompatParcelizer);
                } else if (this.onPlayFromSearch == 1) {
                    read(this.MediaBrowserCompatMediaItem, 2000L);
                } else {
                    read(this.MediaDescriptionCompat, iAudioAttributesCompatParcelizer);
                }
            }
        }
    }

    public final void MediaBrowserCompatItemReceiver() {
        this.onMediaButtonEvent.removeCallbacks(this.AudioAttributesImplBaseParcelizer);
        this.onMediaButtonEvent.removeCallbacks(this.AudioAttributesImplApi26Parcelizer);
        this.onMediaButtonEvent.removeCallbacks(this.MediaDescriptionCompat);
        this.onMediaButtonEvent.removeCallbacks(this.MediaBrowserCompatMediaItem);
    }

    public final void write() {
        this.onMediaButtonEvent.addOnLayoutChangeListener(this.handleMediaPlayPauseIfPendingOnHandler);
    }

    public final void read() {
        this.onMediaButtonEvent.removeOnLayoutChangeListener(this.handleMediaPlayPauseIfPendingOnHandler);
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.onPlayFromSearch == 0 && this.onMediaButtonEvent.read();
    }

    public final void RemoteActionCompatParcelizer(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (!z) {
            view.setVisibility(8);
            this.onPrepareFromMediaId.remove(view);
            return;
        }
        if (this.MediaMetadataCompat && read(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.onPrepareFromMediaId.add(view);
    }

    public final boolean write(View view) {
        return view != null && this.onPrepareFromMediaId.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(int i) {
        int i2 = this.onPlayFromSearch;
        this.onPlayFromSearch = i;
        if (i == 2) {
            this.onMediaButtonEvent.setVisibility(8);
        } else if (i2 == 2) {
            this.onMediaButtonEvent.setVisibility(0);
        }
        if (i2 != i) {
            this.onMediaButtonEvent.AudioAttributesImplApi21Parcelizer();
        }
    }

    public final void AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4) {
        View view = this.RemoteActionCompatParcelizer;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer(View view, int i, int i2, int i3, int i4) {
        boolean zOnCustomAction = onCustomAction();
        if (this.MediaMetadataCompat != zOnCustomAction) {
            this.MediaMetadataCompat = zOnCustomAction;
            view.post(new Runnable() { // from class: o.drainWriteBuffer
                @Override // java.lang.Runnable
                public final void run() {
                    this.write.RatingCompat();
                }
            });
        }
        boolean z = i2 - i != i4 - i3;
        if (this.MediaMetadataCompat || !z) {
            return;
        }
        view.post(new Runnable() { // from class: o.tryToDrainBuffers
            @Override // java.lang.Runnable
            public final void run() {
                this.IconCompatParcelizer.MediaBrowserCompatSearchResultReceiver();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer(View view) {
        MediaBrowserCompatCustomActionResultReceiver();
        if (view.getId() == maximumCapacity.AudioAttributesImplBaseParcelizer.exo_overflow_show) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.start();
        } else if (view.getId() == maximumCapacity.AudioAttributesImplBaseParcelizer.exo_overflow_hide) {
            this.onAddQueueItem.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaMetadataCompat() {
        if (!this.read) {
            write(0);
            MediaBrowserCompatCustomActionResultReceiver();
            return;
        }
        int i = this.onPlayFromSearch;
        if (i == 1) {
            this.onPlayFromMediaId.start();
        } else if (i == 2) {
            this.onPause.start();
        } else if (i == 3) {
            this.onCommand = true;
        } else if (i == 4) {
            return;
        }
        MediaBrowserCompatCustomActionResultReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesImplApi26Parcelizer() {
        this.AudioAttributesImplApi21Parcelizer.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaBrowserCompatMediaItem() {
        this.RatingCompat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaDescriptionCompat() {
        this.MediaBrowserCompatSearchResultReceiver.start();
        read(this.MediaBrowserCompatMediaItem, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesImplBaseParcelizer() {
        write(2);
    }

    private static ObjectAnimator write(float f, float f2, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f2);
    }

    private void read(Runnable runnable, long j) {
        if (j >= 0) {
            this.onMediaButtonEvent.postDelayed(runnable, j);
        }
    }

    private void write(float f) {
        if (this.MediaBrowserCompatCustomActionResultReceiver != null) {
            this.MediaBrowserCompatCustomActionResultReceiver.setTranslationX((int) (r0.getWidth() * (1.0f - f)));
        }
        ViewGroup viewGroup = this.onPrepareFromSearch;
        if (viewGroup != null) {
            viewGroup.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup2 = this.IconCompatParcelizer;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
    }

    private boolean onCustomAction() {
        int width = this.onMediaButtonEvent.getWidth();
        int paddingLeft = this.onMediaButtonEvent.getPaddingLeft();
        int paddingRight = this.onMediaButtonEvent.getPaddingRight();
        int height = this.onMediaButtonEvent.getHeight();
        int paddingBottom = this.onMediaButtonEvent.getPaddingBottom();
        int paddingTop = this.onMediaButtonEvent.getPaddingTop();
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
        ViewGroup viewGroup = this.AudioAttributesCompatParcelizer;
        int paddingLeft2 = viewGroup != null ? viewGroup.getPaddingLeft() + this.AudioAttributesCompatParcelizer.getPaddingRight() : 0;
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
        ViewGroup viewGroup2 = this.AudioAttributesCompatParcelizer;
        return (width - paddingLeft) - paddingRight <= Math.max(iRemoteActionCompatParcelizer - paddingLeft2, RemoteActionCompatParcelizer(this.onPrepareFromSearch) + RemoteActionCompatParcelizer(this.onPlay)) || (height - paddingBottom) - paddingTop <= (iAudioAttributesCompatParcelizer - (viewGroup2 != null ? viewGroup2.getPaddingTop() + this.AudioAttributesCompatParcelizer.getPaddingBottom() : 0)) + (AudioAttributesCompatParcelizer(this.write) << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void RatingCompat() {
        ViewGroup viewGroup = this.onCustomAction;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.MediaMetadataCompat ? 0 : 4);
        }
        if (this.onPrepare != null) {
            int dimensionPixelSize = this.onMediaButtonEvent.getResources().getDimensionPixelSize(maximumCapacity.RemoteActionCompatParcelizer.exo_styled_progress_margin_bottom);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.onPrepare.getLayoutParams();
            if (marginLayoutParams != null) {
                if (this.MediaMetadataCompat) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.onPrepare.setLayoutParams(marginLayoutParams);
            }
            View view = this.onPrepare;
            if (view instanceof DefaultTimeBar) {
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                if (this.MediaMetadataCompat) {
                    defaultTimeBar.read(true);
                } else {
                    int i = this.onPlayFromSearch;
                    if (i == 1) {
                        defaultTimeBar.read(false);
                    } else if (i != 3) {
                        defaultTimeBar.AudioAttributesCompatParcelizer();
                    }
                }
            }
        }
        for (View view2 : this.onPrepareFromMediaId) {
            view2.setVisibility((this.MediaMetadataCompat && read(view2)) ? 4 : 0);
        }
    }

    private static boolean read(View view) {
        int id = view.getId();
        return id == maximumCapacity.AudioAttributesImplBaseParcelizer.exo_bottom_bar || id == maximumCapacity.AudioAttributesImplBaseParcelizer.exo_prev || id == maximumCapacity.AudioAttributesImplBaseParcelizer.exo_next || id == maximumCapacity.AudioAttributesImplBaseParcelizer.exo_rew || id == maximumCapacity.AudioAttributesImplBaseParcelizer.exo_rew_with_amount || id == maximumCapacity.AudioAttributesImplBaseParcelizer.exo_ffwd || id == maximumCapacity.AudioAttributesImplBaseParcelizer.exo_ffwd_with_amount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaBrowserCompatSearchResultReceiver() {
        int i;
        if (this.IconCompatParcelizer == null || this.MediaBrowserCompatItemReceiver == null) {
            return;
        }
        int width = (this.onMediaButtonEvent.getWidth() - this.onMediaButtonEvent.getPaddingLeft()) - this.onMediaButtonEvent.getPaddingRight();
        while (true) {
            if (this.MediaBrowserCompatItemReceiver.getChildCount() <= 1) {
                break;
            }
            int childCount = this.MediaBrowserCompatItemReceiver.getChildCount() - 2;
            View childAt = this.MediaBrowserCompatItemReceiver.getChildAt(childCount);
            this.MediaBrowserCompatItemReceiver.removeViewAt(childCount);
            this.IconCompatParcelizer.addView(childAt, 0);
        }
        View view = this.onPlay;
        if (view != null) {
            view.setVisibility(8);
        }
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.onPrepareFromSearch);
        int childCount2 = this.IconCompatParcelizer.getChildCount() - 1;
        for (int i2 = 0; i2 < childCount2; i2++) {
            iRemoteActionCompatParcelizer += RemoteActionCompatParcelizer(this.IconCompatParcelizer.getChildAt(i2));
        }
        if (iRemoteActionCompatParcelizer > width) {
            View view2 = this.onPlay;
            if (view2 != null) {
                view2.setVisibility(0);
                iRemoteActionCompatParcelizer += RemoteActionCompatParcelizer(this.onPlay);
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < childCount2; i3++) {
                View childAt2 = this.IconCompatParcelizer.getChildAt(i3);
                iRemoteActionCompatParcelizer -= RemoteActionCompatParcelizer(childAt2);
                arrayList.add(childAt2);
                if (iRemoteActionCompatParcelizer <= width) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.IconCompatParcelizer.removeViews(0, arrayList.size());
            for (i = 0; i < arrayList.size(); i++) {
                this.MediaBrowserCompatItemReceiver.addView((View) arrayList.get(i), this.MediaBrowserCompatItemReceiver.getChildCount() - 1);
            }
            return;
        }
        ViewGroup viewGroup = this.MediaBrowserCompatCustomActionResultReceiver;
        if (viewGroup == null || viewGroup.getVisibility() != 0 || this.onAddQueueItem.isStarted()) {
            return;
        }
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.cancel();
        this.onAddQueueItem.start();
    }

    private static int RemoteActionCompatParcelizer(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    private static int AudioAttributesCompatParcelizer(View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }
}
