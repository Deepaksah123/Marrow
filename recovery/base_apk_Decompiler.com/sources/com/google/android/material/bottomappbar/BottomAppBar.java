package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.BinarySearchSeekerSeekOperationParams;
import kotlin.BinarySearchSeekerTimestampSearchResult;
import kotlin.InvalidTypeIdException;
import kotlin.SeekMap;
import kotlin.calculateNextSearchBytePosition;
import kotlin.checkAndPeekStreamMarker;
import kotlin.consume;
import kotlin.findFormatOverrides;
import kotlin.frameSizeBytesByTypeNb;
import kotlin.getConstantBitrateSeekMap;
import kotlin.getSampleRateLookupKey;
import kotlin.isValidFrameType;
import kotlin.readFrames;
import kotlin.readId3Metadata;

/* JADX INFO: loaded from: classes5.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.read {
    private static final int AudioAttributesImplApi21Parcelizer = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_MaterialComponents_BottomAppBar;
    private static final int AudioAttributesImplApi26Parcelizer = calculateNextSearchBytePosition.IconCompatParcelizer.motionDurationLong2;
    private static final int RatingCompat = calculateNextSearchBytePosition.IconCompatParcelizer.motionEasingEmphasizedInterpolator;
    AnimatorListenerAdapter AudioAttributesImplBaseParcelizer;
    private int MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private Behavior MediaDescriptionCompat;
    private ArrayList<Object> MediaMetadataCompat;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private int onAddQueueItem;
    private boolean onCommand;
    private int onCustomAction;
    private boolean onFastForward;
    private final int onMediaButtonEvent;
    private int onPause;
    private BinarySearchSeekerTimestampSearchResult<FloatingActionButton> onPlay;
    private final frameSizeBytesByTypeNb onPlayFromMediaId;
    private Animator onPlayFromSearch;
    private Integer onPlayFromUri;
    private int onPrepare;
    private Animator onPrepareFromMediaId;
    private boolean onPrepareFromSearch;
    private final boolean onPrepareFromUri;
    private final boolean onRemoveQueueItem;
    private final boolean onRemoveQueueItemAt;
    private int onRewind;
    private final boolean onSeekTo;
    private int onSetPlaybackSpeed;

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    static /* synthetic */ boolean IconCompatParcelizer(BottomAppBar bottomAppBar) {
        bottomAppBar.onPrepareFromSearch = false;
        return false;
    }

    static /* synthetic */ Animator MediaBrowserCompatMediaItem(BottomAppBar bottomAppBar) {
        bottomAppBar.onPlayFromSearch = null;
        return null;
    }

    static /* synthetic */ Animator MediaBrowserCompatSearchResultReceiver(BottomAppBar bottomAppBar) {
        bottomAppBar.onPrepareFromMediaId = null;
        return null;
    }

    public BottomAppBar(Context context) {
        this(context, null);
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.bottomAppBarStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BottomAppBar(Context context, AttributeSet attributeSet, int i) {
        int i2 = AudioAttributesImplApi21Parcelizer;
        super(readFrames.IconCompatParcelizer(context, attributeSet, i, i2), attributeSet, i);
        frameSizeBytesByTypeNb framesizebytesbytypenb = new frameSizeBytesByTypeNb();
        this.onPlayFromMediaId = framesizebytesbytypenb;
        this.MediaBrowserCompatSearchResultReceiver = 0;
        this.onRewind = 0;
        this.onPrepareFromSearch = false;
        this.onCommand = true;
        this.AudioAttributesImplBaseParcelizer = new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                if (BottomAppBar.this.onPrepareFromSearch) {
                    return;
                }
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.AudioAttributesCompatParcelizer(bottomAppBar.onCustomAction, BottomAppBar.this.onCommand);
            }
        };
        this.onPlay = new BinarySearchSeekerTimestampSearchResult<FloatingActionButton>() { // from class: com.google.android.material.bottomappbar.BottomAppBar.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.BinarySearchSeekerTimestampSearchResult
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public void AudioAttributesCompatParcelizer(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.onPlayFromMediaId.onCustomAction((floatingActionButton.getVisibility() == 0 && BottomAppBar.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 1) ? floatingActionButton.getScaleY() : BitmapDescriptorFactory.HUE_RED);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.BinarySearchSeekerTimestampSearchResult
            public void IconCompatParcelizer(FloatingActionButton floatingActionButton) {
                if (BottomAppBar.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != 1) {
                    return;
                }
                float translationX = floatingActionButton.getTranslationX();
                if (BottomAppBar.this.onSetShuffleMode().MediaBrowserCompatCustomActionResultReceiver() != translationX) {
                    BottomAppBar.this.onSetShuffleMode().AudioAttributesImplApi21Parcelizer(translationX);
                    BottomAppBar.this.onPlayFromMediaId.invalidateSelf();
                }
                float f = -floatingActionButton.getTranslationY();
                float scaleY = BitmapDescriptorFactory.HUE_RED;
                float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, f);
                if (BottomAppBar.this.onSetShuffleMode().AudioAttributesCompatParcelizer() != fMax) {
                    BottomAppBar.this.onSetShuffleMode().read(fMax);
                    BottomAppBar.this.onPlayFromMediaId.invalidateSelf();
                }
                frameSizeBytesByTypeNb framesizebytesbytypenb2 = BottomAppBar.this.onPlayFromMediaId;
                if (floatingActionButton.getVisibility() == 0) {
                    scaleY = floatingActionButton.getScaleY();
                }
                framesizebytesbytypenb2.onCustomAction(scaleY);
            }
        };
        Context context2 = getContext();
        TypedArray typedArrayWrite = readId3Metadata.write(context2, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.BottomAppBar, i, i2, new int[0]);
        ColorStateList colorStateListIconCompatParcelizer = SeekMap.IconCompatParcelizer(context2, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.BottomAppBar_backgroundTint);
        if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.BottomAppBar_navigationIconTint)) {
            setNavigationIconTint(typedArrayWrite.getColor(calculateNextSearchBytePosition.MediaMetadataCompat.BottomAppBar_navigationIconTint, -1));
        }
        int dimensionPixelSize = typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.BottomAppBar_elevation, 0);
        float dimensionPixelOffset = typedArrayWrite.getDimensionPixelOffset(calculateNextSearchBytePosition.MediaMetadataCompat.BottomAppBar_fabCradleMargin, 0);
        float dimensionPixelOffset2 = typedArrayWrite.getDimensionPixelOffset(calculateNextSearchBytePosition.MediaMetadataCompat.BottomAppBar_fabCradleRoundedCornerRadius, 0);
        float dimensionPixelOffset3 = typedArrayWrite.getDimensionPixelOffset(calculateNextSearchBytePosition.MediaMetadataCompat.BottomAppBar_fabCradleVerticalOffset, 0);
        this.onCustomAction = typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.BottomAppBar_fabAlignmentMode, 0);
        this.handleMediaPlayPauseIfPendingOnHandler = typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.BottomAppBar_fabAnimationMode, 0);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.BottomAppBar_fabAnchorMode, 1);
        this.onPrepareFromUri = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.BottomAppBar_removeEmbeddedFabElevation, true);
        this.onPrepare = typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.BottomAppBar_menuAlignmentMode, 0);
        this.onFastForward = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.BottomAppBar_hideOnScroll, false);
        this.onRemoveQueueItem = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.BottomAppBar_paddingBottomSystemWindowInsets, false);
        this.onRemoveQueueItemAt = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.BottomAppBar_paddingLeftSystemWindowInsets, false);
        this.onSeekTo = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.BottomAppBar_paddingRightSystemWindowInsets, false);
        this.onAddQueueItem = typedArrayWrite.getDimensionPixelOffset(calculateNextSearchBytePosition.MediaMetadataCompat.BottomAppBar_fabAlignmentModeEndMargin, -1);
        boolean z = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.BottomAppBar_addElevationShadow, true);
        typedArrayWrite.recycle();
        this.onMediaButtonEvent = getResources().getDimensionPixelOffset(calculateNextSearchBytePosition.write.mtrl_bottomappbar_fabOffsetEndMode);
        framesizebytesbytypenb.setShapeAppearanceModel(isValidFrameType.RemoteActionCompatParcelizer().read(new consume(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3)).RemoteActionCompatParcelizer());
        if (z) {
            framesizebytesbytypenb.onSeekTo(2);
        } else {
            framesizebytesbytypenb.onSeekTo(1);
            setOutlineAmbientShadowColor(0);
            setOutlineSpotShadowColor(0);
        }
        framesizebytesbytypenb.RemoteActionCompatParcelizer(Paint.Style.FILL);
        framesizebytesbytypenb.RemoteActionCompatParcelizer(context2);
        setElevation(dimensionPixelSize);
        findFormatOverrides.AudioAttributesCompatParcelizer(framesizebytesbytypenb, colorStateListIconCompatParcelizer);
        InvalidTypeIdException.read(this, framesizebytesbytypenb);
        checkAndPeekStreamMarker.AudioAttributesCompatParcelizer(this, attributeSet, i, i2, new checkAndPeekStreamMarker.RemoteActionCompatParcelizer() { // from class: com.google.android.material.bottomappbar.BottomAppBar.4
            @Override // o.checkAndPeekStreamMarker.RemoteActionCompatParcelizer
            public final WindowInsetsCompat RemoteActionCompatParcelizer(View view, WindowInsetsCompat windowInsetsCompat, checkAndPeekStreamMarker.write writeVar) {
                boolean z2;
                if (BottomAppBar.this.onRemoveQueueItem) {
                    BottomAppBar.this.MediaBrowserCompatMediaItem = windowInsetsCompat.AudioAttributesImplBaseParcelizer();
                }
                boolean z3 = false;
                if (BottomAppBar.this.onRemoveQueueItemAt) {
                    z2 = BottomAppBar.this.onPause != windowInsetsCompat.AudioAttributesImplApi21Parcelizer();
                    BottomAppBar.this.onPause = windowInsetsCompat.AudioAttributesImplApi21Parcelizer();
                } else {
                    z2 = false;
                }
                if (BottomAppBar.this.onSeekTo) {
                    boolean z4 = BottomAppBar.this.onSetPlaybackSpeed != windowInsetsCompat.MediaBrowserCompatItemReceiver();
                    BottomAppBar.this.onSetPlaybackSpeed = windowInsetsCompat.MediaBrowserCompatItemReceiver();
                    z3 = z4;
                }
                if (!z2 && !z3) {
                    return windowInsetsCompat;
                }
                BottomAppBar.this.onPlayFromSearch();
                BottomAppBar.this.onSkipToPrevious();
                BottomAppBar.this.setSessionImpl();
                return windowInsetsCompat;
            }
        });
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(read(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.onPlayFromUri = Integer.valueOf(i);
        Drawable drawableAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        if (drawableAudioAttributesImplApi21Parcelizer != null) {
            setNavigationIcon(drawableAudioAttributesImplApi21Parcelizer);
        }
    }

    public void setFabAlignmentMode(int i) {
        setFabAlignmentModeAndReplaceMenu(i, 0);
    }

    public void setFabAlignmentModeAndReplaceMenu(int i, int i2) {
        this.onRewind = i2;
        this.onPrepareFromSearch = true;
        AudioAttributesCompatParcelizer(i, this.onCommand);
        AudioAttributesCompatParcelizer(i);
        this.onCustomAction = i;
    }

    public void setFabAnchorMode(int i) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i;
        onSkipToPrevious();
        View viewOnRemoveQueueItem = onRemoveQueueItem();
        if (viewOnRemoveQueueItem != null) {
            IconCompatParcelizer(this, viewOnRemoveQueueItem);
            viewOnRemoveQueueItem.requestLayout();
            this.onPlayFromMediaId.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void IconCompatParcelizer(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (CoordinatorLayout.RemoteActionCompatParcelizer) view.getLayoutParams();
        remoteActionCompatParcelizer.IconCompatParcelizer = 17;
        if (bottomAppBar.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 1) {
            remoteActionCompatParcelizer.IconCompatParcelizer |= 48;
        }
        if (bottomAppBar.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0) {
            remoteActionCompatParcelizer.IconCompatParcelizer |= 80;
        }
    }

    public void setFabAnimationMode(int i) {
        this.handleMediaPlayPauseIfPendingOnHandler = i;
    }

    public void setMenuAlignmentMode(int i) {
        if (this.onPrepare != i) {
            this.onPrepare = i;
            ActionMenuView actionMenuViewOnRewind = onRewind();
            if (actionMenuViewOnRewind != null) {
                write(actionMenuViewOnRewind, this.onCustomAction, onSetRating());
            }
        }
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        findFormatOverrides.AudioAttributesCompatParcelizer(this.onPlayFromMediaId, colorStateList);
    }

    private float onSkipToNext() {
        return onSetShuffleMode().RemoteActionCompatParcelizer();
    }

    public void setFabCradleMargin(float f) {
        if (f != onSkipToNext()) {
            onSetShuffleMode().AudioAttributesCompatParcelizer(f);
            this.onPlayFromMediaId.invalidateSelf();
        }
    }

    private float MediaSessionCompatQueueItem() {
        return onSetShuffleMode().read();
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != MediaSessionCompatQueueItem()) {
            onSetShuffleMode().IconCompatParcelizer(f);
            this.onPlayFromMediaId.invalidateSelf();
        }
    }

    private float onStop() {
        return onSetShuffleMode().AudioAttributesCompatParcelizer();
    }

    public void setCradleVerticalOffset(float f) {
        if (f != onStop()) {
            onSetShuffleMode().read(f);
            this.onPlayFromMediaId.invalidateSelf();
            onSkipToPrevious();
        }
    }

    public void setFabAlignmentModeEndMargin(int i) {
        if (this.onAddQueueItem != i) {
            this.onAddQueueItem = i;
            onSkipToPrevious();
        }
    }

    public final boolean onPrepareFromMediaId() {
        return this.onFastForward;
    }

    public void setHideOnScroll(boolean z) {
        this.onFastForward = z;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        this.onPlayFromMediaId.handleMediaPlayPauseIfPendingOnHandler(f);
        write().read(this, this.onPlayFromMediaId.onPrepareFromSearch() - this.onPlayFromMediaId.onPlayFromSearch());
    }

    public final void RemoteActionCompatParcelizer(int i) {
        if (i != 0) {
            this.onRewind = 0;
            MediaBrowserCompatCustomActionResultReceiver().clear();
            write(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPrepareFromSearch() {
        this.MediaBrowserCompatSearchResultReceiver++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPrepare() {
        this.MediaBrowserCompatSearchResultReceiver--;
    }

    final boolean IconCompatParcelizer(int i) {
        float f = i;
        if (f == onSetShuffleMode().write()) {
            return false;
        }
        onSetShuffleMode().RemoteActionCompatParcelizer(f);
        this.onPlayFromMediaId.invalidateSelf();
        return true;
    }

    final void IconCompatParcelizer(float f) {
        if (f != onSetShuffleMode().IconCompatParcelizer()) {
            onSetShuffleMode().write(f);
            this.onPlayFromMediaId.invalidateSelf();
        }
    }

    private void AudioAttributesCompatParcelizer(int i) {
        if (this.onCustomAction == i || !InvalidTypeIdException.onSeekTo(this)) {
            return;
        }
        Animator animator = this.onPrepareFromMediaId;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.handleMediaPlayPauseIfPendingOnHandler == 1) {
            IconCompatParcelizer(i, arrayList);
        } else {
            MediaBrowserCompatItemReceiver(i);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(getSampleRateLookupKey.read(getContext(), RatingCompat, BinarySearchSeekerSeekOperationParams.write));
        this.onPrepareFromMediaId = animatorSet;
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator2) {
                BottomAppBar.this.onPrepareFromSearch();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator2) {
                BottomAppBar.this.onPrepare();
                BottomAppBar.MediaBrowserCompatSearchResultReceiver(BottomAppBar.this);
            }
        });
        this.onPrepareFromMediaId.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FloatingActionButton onPlayFromUri() {
        View viewOnRemoveQueueItem = onRemoveQueueItem();
        if (viewOnRemoveQueueItem instanceof FloatingActionButton) {
            return (FloatingActionButton) viewOnRemoveQueueItem;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View onRemoveQueueItem() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).IconCompatParcelizer(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    private boolean onSetRating() {
        FloatingActionButton floatingActionButtonOnPlayFromUri = onPlayFromUri();
        return floatingActionButtonOnPlayFromUri != null && floatingActionButtonOnPlayFromUri.MediaBrowserCompatItemReceiver();
    }

    private void MediaBrowserCompatItemReceiver(final int i) {
        FloatingActionButton floatingActionButtonOnPlayFromUri = onPlayFromUri();
        if (floatingActionButtonOnPlayFromUri == null || floatingActionButtonOnPlayFromUri.AudioAttributesImplBaseParcelizer()) {
            return;
        }
        onPrepareFromSearch();
        floatingActionButtonOnPlayFromUri.RemoteActionCompatParcelizer(new FloatingActionButton.IconCompatParcelizer() { // from class: com.google.android.material.bottomappbar.BottomAppBar.1
            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.IconCompatParcelizer
            public final void AudioAttributesCompatParcelizer(FloatingActionButton floatingActionButton) {
                floatingActionButton.setTranslationX(BottomAppBar.this.read(i));
                floatingActionButton.read(new FloatingActionButton.IconCompatParcelizer() { // from class: com.google.android.material.bottomappbar.BottomAppBar.1.1
                    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.IconCompatParcelizer
                    public final void write() {
                        BottomAppBar.this.onPrepare();
                    }
                });
            }
        });
    }

    private void IconCompatParcelizer(int i, List<Animator> list) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(onPlayFromUri(), "translationX", read(i));
        objectAnimatorOfFloat.setDuration(onPrepareFromUri());
        list.add(objectAnimatorOfFloat);
    }

    private int onPrepareFromUri() {
        return getSampleRateLookupKey.write(getContext(), AudioAttributesImplApi26Parcelizer, 300);
    }

    private Drawable read(Drawable drawable) {
        if (drawable == null || this.onPlayFromUri == null) {
            return drawable;
        }
        Drawable drawableAudioAttributesImplApi26Parcelizer = findFormatOverrides.AudioAttributesImplApi26Parcelizer(drawable.mutate());
        findFormatOverrides.AudioAttributesCompatParcelizer(drawableAudioAttributesImplApi26Parcelizer, this.onPlayFromUri.intValue());
        return drawableAudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer(int i, boolean z) {
        if (!InvalidTypeIdException.onSeekTo(this)) {
            this.onPrepareFromSearch = false;
            RemoteActionCompatParcelizer(this.onRewind);
            return;
        }
        Animator animator = this.onPlayFromSearch;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!onSetRating()) {
            i = 0;
            z = false;
        }
        read(i, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.onPlayFromSearch = animatorSet;
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.7
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator2) {
                BottomAppBar.this.onPrepareFromSearch();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator2) {
                BottomAppBar.this.onPrepare();
                BottomAppBar.IconCompatParcelizer(BottomAppBar.this);
                BottomAppBar.MediaBrowserCompatMediaItem(BottomAppBar.this);
            }
        });
        this.onPlayFromSearch.start();
    }

    private void read(final int i, final boolean z, List<Animator> list) {
        final ActionMenuView actionMenuViewOnRewind = onRewind();
        if (actionMenuViewOnRewind != null) {
            float fOnPrepareFromUri = onPrepareFromUri();
            Animator animatorOfFloat = ObjectAnimator.ofFloat(actionMenuViewOnRewind, "alpha", 1.0f);
            animatorOfFloat.setDuration((long) (0.8f * fOnPrepareFromUri));
            if (Math.abs(actionMenuViewOnRewind.getTranslationX() - RemoteActionCompatParcelizer(actionMenuViewOnRewind, i, z)) <= 1.0f) {
                if (actionMenuViewOnRewind.getAlpha() < 1.0f) {
                    list.add(animatorOfFloat);
                }
            } else {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuViewOnRewind, "alpha", BitmapDescriptorFactory.HUE_RED);
                objectAnimatorOfFloat.setDuration((long) (fOnPrepareFromUri * 0.2f));
                objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.6
                    private boolean write;

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                        this.write = true;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        if (this.write) {
                            return;
                        }
                        boolean z2 = BottomAppBar.this.onRewind != 0;
                        BottomAppBar bottomAppBar = BottomAppBar.this;
                        bottomAppBar.RemoteActionCompatParcelizer(bottomAppBar.onRewind);
                        BottomAppBar.this.AudioAttributesCompatParcelizer(actionMenuViewOnRewind, i, z, z2);
                    }
                });
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(objectAnimatorOfFloat, animatorOfFloat);
                list.add(animatorSet);
            }
        }
    }

    private float onSetPlaybackSpeed() {
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 1) {
            return -onSetShuffleMode().AudioAttributesCompatParcelizer();
        }
        return onRemoveQueueItem() != null ? (-((getMeasuredHeight() + onRemoveQueueItemAt()) - r0.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float read(int i) {
        int measuredWidth;
        boolean zAudioAttributesImplBaseParcelizer = checkAndPeekStreamMarker.AudioAttributesImplBaseParcelizer(this);
        if (i != 1) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        View viewOnRemoveQueueItem = onRemoveQueueItem();
        int i2 = zAudioAttributesImplBaseParcelizer ? this.onPause : this.onSetPlaybackSpeed;
        if (this.onAddQueueItem != -1 && viewOnRemoveQueueItem != null) {
            measuredWidth = (viewOnRemoveQueueItem.getMeasuredWidth() / 2) + this.onAddQueueItem;
        } else {
            measuredWidth = this.onMediaButtonEvent;
        }
        return ((getMeasuredWidth() / 2) - (i2 + measuredWidth)) * (zAudioAttributesImplBaseParcelizer ? -1 : 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float onSeekTo() {
        return read(this.onCustomAction);
    }

    private ActionMenuView onRewind() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private void write(ActionMenuView actionMenuView, int i, boolean z) {
        AudioAttributesCompatParcelizer(actionMenuView, i, z, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer(final ActionMenuView actionMenuView, final int i, final boolean z, boolean z2) {
        Runnable runnable = new Runnable() { // from class: com.google.android.material.bottomappbar.BottomAppBar.10
            @Override // java.lang.Runnable
            public final void run() {
                actionMenuView.setTranslationX(BottomAppBar.this.RemoteActionCompatParcelizer(r0, i, z));
            }
        };
        if (z2) {
            actionMenuView.post(runnable);
        } else {
            runnable.run();
        }
    }

    protected final int RemoteActionCompatParcelizer(ActionMenuView actionMenuView, int i, boolean z) {
        int dimensionPixelOffset = 0;
        if (this.onPrepare != 1 && (i != 1 || !z)) {
            return 0;
        }
        boolean zAudioAttributesImplBaseParcelizer = checkAndPeekStreamMarker.AudioAttributesImplBaseParcelizer(this);
        int measuredWidth = zAudioAttributesImplBaseParcelizer ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).write & 8388615) == 8388611) {
                if (zAudioAttributesImplBaseParcelizer) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                } else {
                    measuredWidth = Math.max(measuredWidth, childAt.getRight());
                }
            }
        }
        int right = zAudioAttributesImplBaseParcelizer ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i3 = zAudioAttributesImplBaseParcelizer ? this.onSetPlaybackSpeed : -this.onPause;
        if (AudioAttributesImplApi21Parcelizer() == null) {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(calculateNextSearchBytePosition.write.m3_bottomappbar_horizontal_padding);
            if (!zAudioAttributesImplBaseParcelizer) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
        }
        return measuredWidth - ((right + i3) + dimensionPixelOffset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPlayFromSearch() {
        Animator animator = this.onPlayFromSearch;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.onPrepareFromMediaId;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            onPlayFromSearch();
            onSkipToPrevious();
            final View viewOnRemoveQueueItem = onRemoveQueueItem();
            if (viewOnRemoveQueueItem != null && InvalidTypeIdException.onSeekTo(viewOnRemoveQueueItem)) {
                viewOnRemoveQueueItem.post(new Runnable() { // from class: o.ChunkIndex
                    @Override // java.lang.Runnable
                    public final void run() {
                        viewOnRemoveQueueItem.requestLayout();
                    }
                });
            }
        }
        setSessionImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public consume onSetShuffleMode() {
        return (consume) this.onPlayFromMediaId.onPlayFromUri().AudioAttributesImplApi21Parcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSkipToPrevious() {
        onSetShuffleMode().AudioAttributesImplApi21Parcelizer(onSeekTo());
        this.onPlayFromMediaId.onCustomAction((this.onCommand && onSetRating() && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 1) ? 1.0f : BitmapDescriptorFactory.HUE_RED);
        View viewOnRemoveQueueItem = onRemoveQueueItem();
        if (viewOnRemoveQueueItem != null) {
            viewOnRemoveQueueItem.setTranslationY(onSetPlaybackSpeed());
            viewOnRemoveQueueItem.setTranslationX(onSeekTo());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionImpl() {
        ActionMenuView actionMenuViewOnRewind = onRewind();
        if (actionMenuViewOnRewind == null || this.onPlayFromSearch != null) {
            return;
        }
        actionMenuViewOnRewind.setAlpha(1.0f);
        if (!onSetRating()) {
            write(actionMenuViewOnRewind, 0, false);
        } else {
            write(actionMenuViewOnRewind, this.onCustomAction, this.onCommand);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void RemoteActionCompatParcelizer(FloatingActionButton floatingActionButton) {
        floatingActionButton.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
        floatingActionButton.read(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.9
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                BottomAppBar.this.AudioAttributesImplBaseParcelizer.onAnimationStart(animator);
                FloatingActionButton floatingActionButtonOnPlayFromUri = BottomAppBar.this.onPlayFromUri();
                if (floatingActionButtonOnPlayFromUri != null) {
                    floatingActionButtonOnPlayFromUri.setTranslationX(BottomAppBar.this.onSeekTo());
                }
            }
        });
        floatingActionButton.RemoteActionCompatParcelizer(this.onPlay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int onRemoveQueueItemAt() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int onSetRepeatMode() {
        return this.onSetPlaybackSpeed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int onSetCaptioningEnabled() {
        return this.onPause;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.read
    /* JADX INFO: renamed from: onSkipToQueueItem, reason: merged with bridge method [inline-methods] */
    public Behavior write() {
        if (this.MediaDescriptionCompat == null) {
            this.MediaDescriptionCompat = new Behavior();
        }
        return this.MediaDescriptionCompat;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getConstantBitrateSeekMap.RemoteActionCompatParcelizer(this, this.onPlayFromMediaId);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        private final View.OnLayoutChangeListener IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private WeakReference<BottomAppBar> read;
        private final Rect write;

        public Behavior() {
            this.IconCompatParcelizer = new View.OnLayoutChangeListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.Behavior.2
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    boolean z;
                    BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.read.get();
                    if (bottomAppBar == null || (!((z = view instanceof FloatingActionButton)) && !(view instanceof ExtendedFloatingActionButton))) {
                        view.removeOnLayoutChangeListener(this);
                        return;
                    }
                    int height = view.getHeight();
                    if (z) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                        floatingActionButton.IconCompatParcelizer(Behavior.this.write);
                        height = Behavior.this.write.height();
                        bottomAppBar.IconCompatParcelizer(height);
                        bottomAppBar.IconCompatParcelizer(floatingActionButton.read().MediaBrowserCompatSearchResultReceiver().IconCompatParcelizer(new RectF(Behavior.this.write)));
                    }
                    CoordinatorLayout.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (CoordinatorLayout.RemoteActionCompatParcelizer) view.getLayoutParams();
                    if (Behavior.this.RemoteActionCompatParcelizer == 0) {
                        if (bottomAppBar.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 1) {
                            ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).bottomMargin = bottomAppBar.onRemoveQueueItemAt() + (bottomAppBar.getResources().getDimensionPixelOffset(calculateNextSearchBytePosition.write.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                        }
                        ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).leftMargin = bottomAppBar.onSetCaptioningEnabled();
                        ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).rightMargin = bottomAppBar.onSetRepeatMode();
                        if (checkAndPeekStreamMarker.AudioAttributesImplBaseParcelizer(view)) {
                            ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).leftMargin += bottomAppBar.onMediaButtonEvent;
                        } else {
                            ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).rightMargin += bottomAppBar.onMediaButtonEvent;
                        }
                    }
                    bottomAppBar.onSkipToPrevious();
                }
            };
            this.write = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.IconCompatParcelizer = new View.OnLayoutChangeListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.Behavior.2
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    boolean z;
                    BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.read.get();
                    if (bottomAppBar == null || (!((z = view instanceof FloatingActionButton)) && !(view instanceof ExtendedFloatingActionButton))) {
                        view.removeOnLayoutChangeListener(this);
                        return;
                    }
                    int height = view.getHeight();
                    if (z) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                        floatingActionButton.IconCompatParcelizer(Behavior.this.write);
                        height = Behavior.this.write.height();
                        bottomAppBar.IconCompatParcelizer(height);
                        bottomAppBar.IconCompatParcelizer(floatingActionButton.read().MediaBrowserCompatSearchResultReceiver().IconCompatParcelizer(new RectF(Behavior.this.write)));
                    }
                    CoordinatorLayout.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (CoordinatorLayout.RemoteActionCompatParcelizer) view.getLayoutParams();
                    if (Behavior.this.RemoteActionCompatParcelizer == 0) {
                        if (bottomAppBar.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 1) {
                            ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).bottomMargin = bottomAppBar.onRemoveQueueItemAt() + (bottomAppBar.getResources().getDimensionPixelOffset(calculateNextSearchBytePosition.write.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                        }
                        ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).leftMargin = bottomAppBar.onSetCaptioningEnabled();
                        ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).rightMargin = bottomAppBar.onSetRepeatMode();
                        if (checkAndPeekStreamMarker.AudioAttributesImplBaseParcelizer(view)) {
                            ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).leftMargin += bottomAppBar.onMediaButtonEvent;
                        } else {
                            ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).rightMargin += bottomAppBar.onMediaButtonEvent;
                        }
                    }
                    bottomAppBar.onSkipToPrevious();
                }
            };
            this.write = new Rect();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public boolean write(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.read = new WeakReference<>(bottomAppBar);
            View viewOnRemoveQueueItem = bottomAppBar.onRemoveQueueItem();
            if (viewOnRemoveQueueItem != null && !InvalidTypeIdException.onSeekTo(viewOnRemoveQueueItem)) {
                BottomAppBar.IconCompatParcelizer(bottomAppBar, viewOnRemoveQueueItem);
                this.RemoteActionCompatParcelizer = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.RemoteActionCompatParcelizer) viewOnRemoveQueueItem.getLayoutParams())).bottomMargin;
                if (viewOnRemoveQueueItem instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewOnRemoveQueueItem;
                    if (bottomAppBar.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0 && bottomAppBar.onPrepareFromUri) {
                        InvalidTypeIdException.write(floatingActionButton, BitmapDescriptorFactory.HUE_RED);
                        floatingActionButton.setCompatElevation(BitmapDescriptorFactory.HUE_RED);
                    }
                    if (floatingActionButton.AudioAttributesImplApi26Parcelizer() == null) {
                        floatingActionButton.setShowMotionSpecResource(calculateNextSearchBytePosition.RemoteActionCompatParcelizer.mtrl_fab_show_motion_spec);
                    }
                    if (floatingActionButton.AudioAttributesCompatParcelizer() == null) {
                        floatingActionButton.setHideMotionSpecResource(calculateNextSearchBytePosition.RemoteActionCompatParcelizer.mtrl_fab_hide_motion_spec);
                    }
                    bottomAppBar.RemoteActionCompatParcelizer(floatingActionButton);
                }
                viewOnRemoveQueueItem.addOnLayoutChangeListener(this.IconCompatParcelizer);
                bottomAppBar.onSkipToPrevious();
            }
            coordinatorLayout.write(bottomAppBar, i);
            return super.write(coordinatorLayout, bottomAppBar, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public boolean write(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.onPrepareFromMediaId() && super.write(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.IconCompatParcelizer = this.onCustomAction;
        savedState.read = this.onCommand;
        return savedState;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.read());
        this.onCustomAction = savedState.IconCompatParcelizer;
        this.onCommand = savedState.read;
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomappbar.BottomAppBar.SavedState.5
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return RemoteActionCompatParcelizer(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return RemoteActionCompatParcelizer(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return AudioAttributesCompatParcelizer(i);
            }

            private static SavedState RemoteActionCompatParcelizer(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            private static SavedState RemoteActionCompatParcelizer(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            private static SavedState[] AudioAttributesCompatParcelizer(int i) {
                return new SavedState[i];
            }
        };
        int IconCompatParcelizer;
        boolean read;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.IconCompatParcelizer = parcel.readInt();
            this.read = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.IconCompatParcelizer);
            parcel.writeInt(this.read ? 1 : 0);
        }
    }
}
