package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.AviStreamHeaderChunk;
import kotlin.BinarySearchSeekerSeekOperationParams;
import kotlin.InvalidTypeIdException;
import kotlin.SeekMap;
import kotlin.calculateNextSearchBytePosition;
import kotlin.checkAndPeekStreamMarker;
import kotlin.createExtractors;
import kotlin.deserializeUsingCustom;
import kotlin.findFormatOverrides;
import kotlin.finishBranchObject;
import kotlin.frameSizeBytesByTypeNb;
import kotlin.getSampleRateLookupKey;
import kotlin.hasSuperClassStartingWith;
import kotlin.isValidFrameType;
import kotlin.parseFrom;
import kotlin.readFrames;
import kotlin.readId3Metadata;
import kotlin.readStreamMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    private final AccessibilityManager AudioAttributesImplApi21Parcelizer;
    private write AudioAttributesImplBaseParcelizer;
    protected final SnackbarBaseLayout IconCompatParcelizer;
    private final int MediaBrowserCompatMediaItem;
    private final int MediaBrowserCompatSearchResultReceiver;
    private List<AudioAttributesCompatParcelizer<B>> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final int MediaDescriptionCompat;
    private final TimeInterpolator MediaMetadataCompat;
    private final TimeInterpolator RatingCompat;
    private final TimeInterpolator handleMediaPlayPauseIfPendingOnHandler;
    private int onCommand;
    private Behavior onCustomAction;
    private final AviStreamHeaderChunk onFastForward;
    private int onMediaButtonEvent;
    private int onPause;
    private int onPlay;
    private final Context onPlayFromMediaId;
    private boolean onPlayFromSearch;
    private int onPlayFromUri;
    private boolean onPrepare;
    private int onPrepareFromMediaId;
    private int onPrepareFromSearch;
    private final ViewGroup onSeekTo;
    private static final TimeInterpolator AudioAttributesImplApi26Parcelizer = BinarySearchSeekerSeekOperationParams.AudioAttributesCompatParcelizer;
    private static final TimeInterpolator write = BinarySearchSeekerSeekOperationParams.write;
    private static final TimeInterpolator read = BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer;
    private static final int[] MediaBrowserCompatCustomActionResultReceiver = {calculateNextSearchBytePosition.IconCompatParcelizer.snackbarStyle};
    static final Handler RemoteActionCompatParcelizer = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.1
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).MediaDescriptionCompat();
                return true;
            }
            if (i != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).write(message.arg1);
            return true;
        }
    });
    private boolean MediaBrowserCompatItemReceiver = false;
    private final Runnable onAddQueueItem = new Runnable() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.7
        @Override // java.lang.Runnable
        public final void run() {
            if (BaseTransientBottomBar.this.IconCompatParcelizer == null || BaseTransientBottomBar.this.onPlayFromMediaId == null) {
                return;
            }
            int iHeight = (readStreamMarker.AudioAttributesCompatParcelizer(BaseTransientBottomBar.this.onPlayFromMediaId).height() - BaseTransientBottomBar.this.MediaBrowserCompatSearchResultReceiver()) + ((int) BaseTransientBottomBar.this.IconCompatParcelizer.getTranslationY());
            if (iHeight >= BaseTransientBottomBar.this.onPlay) {
                BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
                baseTransientBottomBar.onCommand = baseTransientBottomBar.onPlay;
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.IconCompatParcelizer.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                baseTransientBottomBar2.onCommand = baseTransientBottomBar2.onPlay;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.onPlay - iHeight;
                BaseTransientBottomBar.this.IconCompatParcelizer.requestLayout();
            }
        }
    };
    parseFrom.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = new parseFrom.AudioAttributesCompatParcelizer() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.11
        @Override // o.parseFrom.AudioAttributesCompatParcelizer
        public final void IconCompatParcelizer() {
            Handler handler = BaseTransientBottomBar.RemoteActionCompatParcelizer;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // o.parseFrom.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer(int i) {
            BaseTransientBottomBar.RemoteActionCompatParcelizer.sendMessage(BaseTransientBottomBar.RemoteActionCompatParcelizer.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    };

    /* JADX INFO: loaded from: classes3.dex */
    public static abstract class AudioAttributesCompatParcelizer<B> {
        public void write(B b) {
        }
    }

    protected BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, AviStreamHeaderChunk aviStreamHeaderChunk) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (aviStreamHeaderChunk == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.onSeekTo = viewGroup;
        this.onFastForward = aviStreamHeaderChunk;
        this.onPlayFromMediaId = context;
        readId3Metadata.RemoteActionCompatParcelizer(context);
        SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) LayoutInflater.from(context).inflate(onPlayFromMediaId(), viewGroup, false);
        this.IconCompatParcelizer = snackbarBaseLayout;
        snackbarBaseLayout.IconCompatParcelizer(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            snackbarContentLayout.read(snackbarBaseLayout.write());
            snackbarContentLayout.setMaxInlineActionWidth(snackbarBaseLayout.RemoteActionCompatParcelizer());
        }
        snackbarBaseLayout.addView(view);
        InvalidTypeIdException.AudioAttributesImplApi21Parcelizer(snackbarBaseLayout, 1);
        InvalidTypeIdException.AudioAttributesImplBaseParcelizer(snackbarBaseLayout, 1);
        InvalidTypeIdException.AudioAttributesCompatParcelizer((View) snackbarBaseLayout, true);
        InvalidTypeIdException.read(snackbarBaseLayout, new finishBranchObject() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.10
            @Override // kotlin.finishBranchObject
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                BaseTransientBottomBar.this.onPlayFromUri = windowInsetsCompat.AudioAttributesImplBaseParcelizer();
                BaseTransientBottomBar.this.onPrepareFromMediaId = windowInsetsCompat.AudioAttributesImplApi21Parcelizer();
                BaseTransientBottomBar.this.onPrepareFromSearch = windowInsetsCompat.MediaBrowserCompatItemReceiver();
                BaseTransientBottomBar.this.onPlay();
                return windowInsetsCompat;
            }
        });
        InvalidTypeIdException.AudioAttributesCompatParcelizer(snackbarBaseLayout, new deserializeUsingCustom() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.14
            @Override // kotlin.deserializeUsingCustom
            public final void onInitializeAccessibilityNodeInfo(View view2, hasSuperClassStartingWith hassuperclassstartingwith) {
                super.onInitializeAccessibilityNodeInfo(view2, hassuperclassstartingwith);
                hassuperclassstartingwith.AudioAttributesCompatParcelizer(ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                hassuperclassstartingwith.MediaBrowserCompatItemReceiver(true);
            }

            @Override // kotlin.deserializeUsingCustom
            public final boolean performAccessibilityAction(View view2, int i, Bundle bundle) {
                if (i == 1048576) {
                    BaseTransientBottomBar.this.RemoteActionCompatParcelizer();
                    return true;
                }
                return super.performAccessibilityAction(view2, i, bundle);
            }
        });
        this.AudioAttributesImplApi21Parcelizer = (AccessibilityManager) context.getSystemService("accessibility");
        this.MediaBrowserCompatMediaItem = getSampleRateLookupKey.write(context, calculateNextSearchBytePosition.IconCompatParcelizer.motionDurationLong2, 250);
        this.MediaDescriptionCompat = getSampleRateLookupKey.write(context, calculateNextSearchBytePosition.IconCompatParcelizer.motionDurationLong2, 150);
        this.MediaBrowserCompatSearchResultReceiver = getSampleRateLookupKey.write(context, calculateNextSearchBytePosition.IconCompatParcelizer.motionDurationMedium1, 75);
        this.RatingCompat = getSampleRateLookupKey.read(context, calculateNextSearchBytePosition.IconCompatParcelizer.motionEasingEmphasizedInterpolator, write);
        this.MediaMetadataCompat = getSampleRateLookupKey.read(context, calculateNextSearchBytePosition.IconCompatParcelizer.motionEasingEmphasizedInterpolator, read);
        this.handleMediaPlayPauseIfPendingOnHandler = getSampleRateLookupKey.read(context, calculateNextSearchBytePosition.IconCompatParcelizer.motionEasingEmphasizedInterpolator, AudioAttributesImplApi26Parcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPlay() {
        ViewGroup.LayoutParams layoutParams = this.IconCompatParcelizer.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || this.IconCompatParcelizer.MediaBrowserCompatSearchResultReceiver == null || this.IconCompatParcelizer.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = this.IconCompatParcelizer.MediaBrowserCompatSearchResultReceiver.bottom + (onFastForward() != null ? this.onMediaButtonEvent : this.onPlayFromUri);
        int i2 = this.IconCompatParcelizer.MediaBrowserCompatSearchResultReceiver.left + this.onPrepareFromMediaId;
        int i3 = this.IconCompatParcelizer.MediaBrowserCompatSearchResultReceiver.right + this.onPrepareFromSearch;
        int i4 = this.IconCompatParcelizer.MediaBrowserCompatSearchResultReceiver.top;
        boolean z = (marginLayoutParams.bottomMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3 && marginLayoutParams.topMargin == i4) ? false : true;
        if (z) {
            marginLayoutParams.bottomMargin = i;
            marginLayoutParams.leftMargin = i2;
            marginLayoutParams.rightMargin = i3;
            marginLayoutParams.topMargin = i4;
            this.IconCompatParcelizer.requestLayout();
        }
        if ((z || this.onCommand != this.onPlay) && onCustomAction()) {
            this.IconCompatParcelizer.removeCallbacks(this.onAddQueueItem);
            this.IconCompatParcelizer.post(this.onAddQueueItem);
        }
    }

    private boolean onCustomAction() {
        return this.onPlay > 0 && MediaBrowserCompatMediaItem();
    }

    private boolean MediaBrowserCompatMediaItem() {
        ViewGroup.LayoutParams layoutParams = this.IconCompatParcelizer.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.RemoteActionCompatParcelizer) && (((CoordinatorLayout.RemoteActionCompatParcelizer) layoutParams).write() instanceof SwipeDismissBehavior);
    }

    private int onPlayFromMediaId() {
        return onPlayFromUri() ? calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.mtrl_layout_snackbar : calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.design_layout_snackbar;
    }

    private boolean onPlayFromUri() {
        TypedArray typedArrayObtainStyledAttributes = this.onPlayFromMediaId.obtainStyledAttributes(MediaBrowserCompatCustomActionResultReceiver);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    public final B read(int i) {
        this.onPause = i;
        return this;
    }

    public int AudioAttributesCompatParcelizer() {
        return this.onPause;
    }

    private View onFastForward() {
        write writeVar = this.AudioAttributesImplBaseParcelizer;
        if (writeVar == null) {
            return null;
        }
        return writeVar.read();
    }

    public final B IconCompatParcelizer(View view) {
        write writeVar = this.AudioAttributesImplBaseParcelizer;
        if (writeVar != null) {
            writeVar.RemoteActionCompatParcelizer();
        }
        this.AudioAttributesImplBaseParcelizer = view == null ? null : write.write(this, view);
        return this;
    }

    public final Context read() {
        return this.onPlayFromMediaId;
    }

    public final View IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public void AudioAttributesImplApi21Parcelizer() {
        parseFrom.read().IconCompatParcelizer(AudioAttributesCompatParcelizer(), this.AudioAttributesCompatParcelizer);
    }

    public void RemoteActionCompatParcelizer() {
        RemoteActionCompatParcelizer(3);
    }

    protected final void RemoteActionCompatParcelizer(int i) {
        parseFrom.read().AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, i);
    }

    public final B AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer<B> audioAttributesCompatParcelizer) {
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new ArrayList();
        }
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.add(audioAttributesCompatParcelizer);
        return this;
    }

    public boolean write() {
        return parseFrom.read().IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    private boolean onPlayFromSearch() {
        return parseFrom.read().read(this.AudioAttributesCompatParcelizer);
    }

    private static SwipeDismissBehavior<? extends View> onMediaButtonEvent() {
        return new Behavior();
    }

    final void MediaDescriptionCompat() {
        if (this.IconCompatParcelizer.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.IconCompatParcelizer.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.RemoteActionCompatParcelizer) {
                IconCompatParcelizer((CoordinatorLayout.RemoteActionCompatParcelizer) layoutParams);
            }
            this.IconCompatParcelizer.read(this.onSeekTo);
            handleMediaPlayPauseIfPendingOnHandler();
            this.IconCompatParcelizer.setVisibility(4);
        }
        if (InvalidTypeIdException.onSeekTo(this.IconCompatParcelizer)) {
            onAddQueueItem();
        } else {
            this.onPlayFromSearch = true;
        }
    }

    final void AudioAttributesImplBaseParcelizer() {
        WindowInsets rootWindowInsets = this.IconCompatParcelizer.getRootWindowInsets();
        if (rootWindowInsets != null) {
            this.onPlay = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            onPlay();
        }
    }

    final void MediaBrowserCompatCustomActionResultReceiver() {
        if (onPlayFromSearch()) {
            RemoteActionCompatParcelizer.post(new Runnable() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.13
                @Override // java.lang.Runnable
                public final void run() {
                    BaseTransientBottomBar.this.AudioAttributesCompatParcelizer(3);
                }
            });
        }
    }

    final void AudioAttributesImplApi26Parcelizer() {
        if (this.onPlayFromSearch) {
            onAddQueueItem();
            this.onPlayFromSearch = false;
        }
    }

    private void onAddQueueItem() {
        if (onPrepareFromMediaId()) {
            onPause();
            return;
        }
        if (this.IconCompatParcelizer.getParent() != null) {
            this.IconCompatParcelizer.setVisibility(0);
        }
        MediaBrowserCompatItemReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int MediaBrowserCompatSearchResultReceiver() {
        int[] iArr = new int[2];
        this.IconCompatParcelizer.getLocationInWindow(iArr);
        return iArr[1] + this.IconCompatParcelizer.getHeight();
    }

    private void IconCompatParcelizer(CoordinatorLayout.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        SwipeDismissBehavior<? extends View> swipeDismissBehaviorOnMediaButtonEvent = onMediaButtonEvent();
        ((Behavior) swipeDismissBehaviorOnMediaButtonEvent).AudioAttributesCompatParcelizer((BaseTransientBottomBar<?>) this);
        swipeDismissBehaviorOnMediaButtonEvent.AudioAttributesCompatParcelizer(new SwipeDismissBehavior.IconCompatParcelizer() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.12
            @Override // com.google.android.material.behavior.SwipeDismissBehavior.IconCompatParcelizer
            public final void read(View view) {
                if (view.getParent() != null) {
                    view.setVisibility(8);
                }
                BaseTransientBottomBar.this.RemoteActionCompatParcelizer(0);
            }

            @Override // com.google.android.material.behavior.SwipeDismissBehavior.IconCompatParcelizer
            public final void AudioAttributesCompatParcelizer(int i) {
                if (i == 0) {
                    parseFrom.read().AudioAttributesImplBaseParcelizer(BaseTransientBottomBar.this.AudioAttributesCompatParcelizer);
                } else if (i == 1 || i == 2) {
                    parseFrom.read().AudioAttributesCompatParcelizer(BaseTransientBottomBar.this.AudioAttributesCompatParcelizer);
                }
            }
        });
        remoteActionCompatParcelizer.write(swipeDismissBehaviorOnMediaButtonEvent);
        if (onFastForward() == null) {
            remoteActionCompatParcelizer.read = 80;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleMediaPlayPauseIfPendingOnHandler() {
        this.onMediaButtonEvent = MediaMetadataCompat();
        onPlay();
    }

    private int MediaMetadataCompat() {
        if (onFastForward() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        onFastForward().getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        this.onSeekTo.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.onSeekTo.getHeight()) - i;
    }

    private void onPause() {
        this.IconCompatParcelizer.post(new Runnable() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.15
            @Override // java.lang.Runnable
            public final void run() {
                if (BaseTransientBottomBar.this.IconCompatParcelizer == null) {
                    return;
                }
                if (BaseTransientBottomBar.this.IconCompatParcelizer.getParent() != null) {
                    BaseTransientBottomBar.this.IconCompatParcelizer.setVisibility(0);
                }
                if (BaseTransientBottomBar.this.IconCompatParcelizer.AudioAttributesCompatParcelizer() == 1) {
                    BaseTransientBottomBar.this.onCommand();
                } else {
                    BaseTransientBottomBar.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                }
            }
        });
    }

    private void IconCompatParcelizer(int i) {
        if (this.IconCompatParcelizer.AudioAttributesCompatParcelizer() == 1) {
            AudioAttributesImplBaseParcelizer(i);
        } else {
            AudioAttributesImplApi26Parcelizer(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCommand() {
        ValueAnimator valueAnimator = read(BitmapDescriptorFactory.HUE_RED, 1.0f);
        ValueAnimator valueAnimatorIconCompatParcelizer = IconCompatParcelizer(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimator, valueAnimatorIconCompatParcelizer);
        animatorSet.setDuration(this.MediaDescriptionCompat);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.17
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.MediaBrowserCompatItemReceiver();
            }
        });
        animatorSet.start();
    }

    private void AudioAttributesImplBaseParcelizer(final int i) {
        ValueAnimator valueAnimator = read(1.0f, BitmapDescriptorFactory.HUE_RED);
        valueAnimator.setDuration(this.MediaBrowserCompatSearchResultReceiver);
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.AudioAttributesCompatParcelizer(i);
            }
        });
        valueAnimator.start();
    }

    private ValueAnimator read(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.RatingCompat);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseTransientBottomBar.this.IconCompatParcelizer.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return valueAnimatorOfFloat;
    }

    private ValueAnimator IconCompatParcelizer(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.MediaMetadataCompat);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BaseTransientBottomBar.this.IconCompatParcelizer.setScaleX(fFloatValue);
                BaseTransientBottomBar.this.IconCompatParcelizer.setScaleY(fFloatValue);
            }
        });
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int iRatingCompat = RatingCompat();
        this.IconCompatParcelizer.setTranslationY(iRatingCompat);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(iRatingCompat, 0);
        valueAnimator.setInterpolator(this.handleMediaPlayPauseIfPendingOnHandler);
        valueAnimator.setDuration(this.MediaBrowserCompatMediaItem);
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                BaseTransientBottomBar.this.onFastForward.read(BaseTransientBottomBar.this.MediaBrowserCompatMediaItem - BaseTransientBottomBar.this.MediaDescriptionCompat, BaseTransientBottomBar.this.MediaDescriptionCompat);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.MediaBrowserCompatItemReceiver();
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(iRatingCompat) { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.9
            private /* synthetic */ int read;
            private int write;

            {
                this.read = iRatingCompat;
                this.write = iRatingCompat;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int iIntValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                BaseTransientBottomBar.this.IconCompatParcelizer.setTranslationY(iIntValue);
                this.write = iIntValue;
            }
        });
        valueAnimator.start();
    }

    private void AudioAttributesImplApi26Parcelizer(final int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, RatingCompat());
        valueAnimator.setInterpolator(this.handleMediaPlayPauseIfPendingOnHandler);
        valueAnimator.setDuration(this.MediaBrowserCompatMediaItem);
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.8
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                BaseTransientBottomBar.this.onFastForward.read(BaseTransientBottomBar.this.MediaBrowserCompatSearchResultReceiver);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.AudioAttributesCompatParcelizer(i);
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.6
            private int AudioAttributesCompatParcelizer = 0;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int iIntValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                BaseTransientBottomBar.this.IconCompatParcelizer.setTranslationY(iIntValue);
                this.AudioAttributesCompatParcelizer = iIntValue;
            }
        });
        valueAnimator.start();
    }

    private int RatingCompat() {
        int height = this.IconCompatParcelizer.getHeight();
        ViewGroup.LayoutParams layoutParams = this.IconCompatParcelizer.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    final void write(int i) {
        if (onPrepareFromMediaId() && this.IconCompatParcelizer.getVisibility() == 0) {
            IconCompatParcelizer(i);
        } else {
            AudioAttributesCompatParcelizer(i);
        }
    }

    final void MediaBrowserCompatItemReceiver() {
        parseFrom.read().write(this.AudioAttributesCompatParcelizer);
        List<AudioAttributesCompatParcelizer<B>> list = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.get(size);
            }
        }
    }

    final void AudioAttributesCompatParcelizer(int i) {
        parseFrom.read().RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
        List<AudioAttributesCompatParcelizer<B>> list = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.get(size).write(this);
            }
        }
        ViewParent parent = this.IconCompatParcelizer.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.IconCompatParcelizer);
        }
    }

    private boolean onPrepareFromMediaId() {
        AccessibilityManager accessibilityManager = this.AudioAttributesImplApi21Parcelizer;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    /* JADX INFO: loaded from: classes3.dex */
    protected static class SnackbarBaseLayout extends FrameLayout {
        private static final View.OnTouchListener IconCompatParcelizer = new View.OnTouchListener() { // from class: com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        };
        private final float AudioAttributesCompatParcelizer;
        private ColorStateList AudioAttributesImplApi21Parcelizer;
        private PorterDuff.Mode AudioAttributesImplApi26Parcelizer;
        private BaseTransientBottomBar<?> AudioAttributesImplBaseParcelizer;
        private final int MediaBrowserCompatCustomActionResultReceiver;
        private final int MediaBrowserCompatItemReceiver;
        private Rect MediaBrowserCompatSearchResultReceiver;
        private isValidFrameType MediaMetadataCompat;
        private final float RemoteActionCompatParcelizer;
        private boolean read;
        private int write;

        protected SnackbarBaseLayout(Context context) {
            this(context, null);
        }

        protected SnackbarBaseLayout(Context context, AttributeSet attributeSet) {
            super(readFrames.IconCompatParcelizer(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.SnackbarLayout);
            if (typedArrayObtainStyledAttributes.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.SnackbarLayout_elevation)) {
                InvalidTypeIdException.write(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.SnackbarLayout_elevation, 0));
            }
            this.write = typedArrayObtainStyledAttributes.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.SnackbarLayout_animationMode, 0);
            if (typedArrayObtainStyledAttributes.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.SnackbarLayout_shapeAppearance) || typedArrayObtainStyledAttributes.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.SnackbarLayout_shapeAppearanceOverlay)) {
                this.MediaMetadataCompat = isValidFrameType.read(context2, attributeSet, 0, 0).RemoteActionCompatParcelizer();
            }
            this.AudioAttributesCompatParcelizer = typedArrayObtainStyledAttributes.getFloat(calculateNextSearchBytePosition.MediaMetadataCompat.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(SeekMap.IconCompatParcelizer(context2, typedArrayObtainStyledAttributes, calculateNextSearchBytePosition.MediaMetadataCompat.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(checkAndPeekStreamMarker.RemoteActionCompatParcelizer(typedArrayObtainStyledAttributes.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getFloat(calculateNextSearchBytePosition.MediaMetadataCompat.SnackbarLayout_actionTextColorAlpha, 1.0f);
            this.MediaBrowserCompatCustomActionResultReceiver = typedArrayObtainStyledAttributes.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.SnackbarLayout_android_maxWidth, -1);
            this.MediaBrowserCompatItemReceiver = typedArrayObtainStyledAttributes.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.SnackbarLayout_maxActionInlineWidth, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(IconCompatParcelizer);
            setFocusable(true);
            if (getBackground() == null) {
                InvalidTypeIdException.read(this, IconCompatParcelizer());
            }
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.AudioAttributesImplApi21Parcelizer != null) {
                drawable = findFormatOverrides.AudioAttributesImplApi26Parcelizer(drawable.mutate());
                findFormatOverrides.AudioAttributesCompatParcelizer(drawable, this.AudioAttributesImplApi21Parcelizer);
                findFormatOverrides.read(drawable, this.AudioAttributesImplApi26Parcelizer);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.AudioAttributesImplApi21Parcelizer = colorStateList;
            if (getBackground() != null) {
                Drawable drawableAudioAttributesImplApi26Parcelizer = findFormatOverrides.AudioAttributesImplApi26Parcelizer(getBackground().mutate());
                findFormatOverrides.AudioAttributesCompatParcelizer(drawableAudioAttributesImplApi26Parcelizer, colorStateList);
                findFormatOverrides.read(drawableAudioAttributesImplApi26Parcelizer, this.AudioAttributesImplApi26Parcelizer);
                if (drawableAudioAttributesImplApi26Parcelizer != getBackground()) {
                    super.setBackgroundDrawable(drawableAudioAttributesImplApi26Parcelizer);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.AudioAttributesImplApi26Parcelizer = mode;
            if (getBackground() != null) {
                Drawable drawableAudioAttributesImplApi26Parcelizer = findFormatOverrides.AudioAttributesImplApi26Parcelizer(getBackground().mutate());
                findFormatOverrides.read(drawableAudioAttributesImplApi26Parcelizer, mode);
                if (drawableAudioAttributesImplApi26Parcelizer != getBackground()) {
                    super.setBackgroundDrawable(drawableAudioAttributesImplApi26Parcelizer);
                }
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : IconCompatParcelizer);
            super.setOnClickListener(onClickListener);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.MediaBrowserCompatCustomActionResultReceiver > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = this.MediaBrowserCompatCustomActionResultReceiver;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.AudioAttributesImplBaseParcelizer;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.AudioAttributesImplApi26Parcelizer();
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.AudioAttributesImplBaseParcelizer;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.AudioAttributesImplBaseParcelizer();
            }
            InvalidTypeIdException.onSetRepeatMode(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.AudioAttributesImplBaseParcelizer;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.MediaBrowserCompatCustomActionResultReceiver();
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.read || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            RemoteActionCompatParcelizer((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.AudioAttributesImplBaseParcelizer;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.onPlay();
            }
        }

        final int AudioAttributesCompatParcelizer() {
            return this.write;
        }

        private float read() {
            return this.AudioAttributesCompatParcelizer;
        }

        final float write() {
            return this.RemoteActionCompatParcelizer;
        }

        final int RemoteActionCompatParcelizer() {
            return this.MediaBrowserCompatItemReceiver;
        }

        final void read(ViewGroup viewGroup) {
            this.read = true;
            viewGroup.addView(this);
            this.read = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void IconCompatParcelizer(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.AudioAttributesImplBaseParcelizer = baseTransientBottomBar;
        }

        private void RemoteActionCompatParcelizer(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.MediaBrowserCompatSearchResultReceiver = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        private Drawable IconCompatParcelizer() {
            int iWrite = createExtractors.write(this, calculateNextSearchBytePosition.IconCompatParcelizer.colorSurface, calculateNextSearchBytePosition.IconCompatParcelizer.colorOnSurface, read());
            isValidFrameType isvalidframetype = this.MediaMetadataCompat;
            Drawable drawableIconCompatParcelizer = isvalidframetype != null ? BaseTransientBottomBar.IconCompatParcelizer(iWrite, isvalidframetype) : BaseTransientBottomBar.IconCompatParcelizer(iWrite, getResources());
            if (this.AudioAttributesImplApi21Parcelizer != null) {
                Drawable drawableAudioAttributesImplApi26Parcelizer = findFormatOverrides.AudioAttributesImplApi26Parcelizer(drawableIconCompatParcelizer);
                findFormatOverrides.AudioAttributesCompatParcelizer(drawableAudioAttributesImplApi26Parcelizer, this.AudioAttributesImplApi21Parcelizer);
                return drawableAudioAttributesImplApi26Parcelizer;
            }
            return findFormatOverrides.AudioAttributesImplApi26Parcelizer(drawableIconCompatParcelizer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static frameSizeBytesByTypeNb IconCompatParcelizer(int i, isValidFrameType isvalidframetype) {
        frameSizeBytesByTypeNb framesizebytesbytypenb = new frameSizeBytesByTypeNb(isvalidframetype);
        framesizebytesbytypenb.AudioAttributesImplApi21Parcelizer(ColorStateList.valueOf(i));
        return framesizebytesbytypenb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GradientDrawable IconCompatParcelizer(int i, Resources resources) {
        float dimension = resources.getDimension(calculateNextSearchBytePosition.write.mtrl_snackbar_background_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {
        private final read MediaBrowserCompatItemReceiver = new read(this);

        /* JADX INFO: Access modifiers changed from: private */
        public void AudioAttributesCompatParcelizer(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.MediaBrowserCompatItemReceiver.write(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean IconCompatParcelizer(View view) {
            return read.write(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean read(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(coordinatorLayout, view, motionEvent);
            return super.read(coordinatorLayout, view, motionEvent);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class read {
        private parseFrom.AudioAttributesCompatParcelizer IconCompatParcelizer;

        public read(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.RemoteActionCompatParcelizer();
            swipeDismissBehavior.read();
            swipeDismissBehavior.write();
        }

        public final void write(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.IconCompatParcelizer = baseTransientBottomBar.AudioAttributesCompatParcelizer;
        }

        public static boolean write(View view) {
            return view instanceof SnackbarBaseLayout;
        }

        public final void RemoteActionCompatParcelizer(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.IconCompatParcelizer(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    parseFrom.read().AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                parseFrom.read().AudioAttributesImplBaseParcelizer(this.IconCompatParcelizer);
            }
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static class write implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
        private final WeakReference<BaseTransientBottomBar> AudioAttributesCompatParcelizer;
        private final WeakReference<View> RemoteActionCompatParcelizer;

        static write write(BaseTransientBottomBar baseTransientBottomBar, View view) {
            write writeVar = new write(baseTransientBottomBar, view);
            if (InvalidTypeIdException.onPlayFromSearch(view)) {
                checkAndPeekStreamMarker.AudioAttributesCompatParcelizer(view, writeVar);
            }
            view.addOnAttachStateChangeListener(writeVar);
            return writeVar;
        }

        private write(BaseTransientBottomBar baseTransientBottomBar, View view) {
            this.AudioAttributesCompatParcelizer = new WeakReference<>(baseTransientBottomBar);
            this.RemoteActionCompatParcelizer = new WeakReference<>(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            if (write()) {
                return;
            }
            checkAndPeekStreamMarker.AudioAttributesCompatParcelizer(view, this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            if (write()) {
                return;
            }
            checkAndPeekStreamMarker.RemoteActionCompatParcelizer(view, this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (write() || !this.AudioAttributesCompatParcelizer.get().MediaBrowserCompatItemReceiver) {
                return;
            }
            this.AudioAttributesCompatParcelizer.get().handleMediaPlayPauseIfPendingOnHandler();
        }

        final View read() {
            return this.RemoteActionCompatParcelizer.get();
        }

        private boolean write() {
            if (this.AudioAttributesCompatParcelizer.get() != null) {
                return false;
            }
            RemoteActionCompatParcelizer();
            return true;
        }

        final void RemoteActionCompatParcelizer() {
            if (this.RemoteActionCompatParcelizer.get() != null) {
                this.RemoteActionCompatParcelizer.get().removeOnAttachStateChangeListener(this);
                checkAndPeekStreamMarker.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.get(), this);
            }
            this.RemoteActionCompatParcelizer.clear();
            this.AudioAttributesCompatParcelizer.clear();
        }
    }
}
