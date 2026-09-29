package com.google.android.material.bottomsheet;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.AudioAttributesImplApi26Parcelizer;
import kotlin.InvalidTypeIdException;
import kotlin.SeekMap;
import kotlin.StdKeyDeserializer;
import kotlin.calculateNextSearchBytePosition;
import kotlin.call;
import kotlin.checkAndPeekStreamMarker;
import kotlin.concatenateVorbisMetadata;
import kotlin.frameSizeBytesByTypeNb;
import kotlin.getFramePositionForTimeUs;
import kotlin.hasSuperClassStartingWith;
import kotlin.isValidFrameType;
import kotlin.modifyFieldName;
import kotlin.readStreamInfoBlock;

/* JADX INFO: loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements readStreamInfoBlock {
    private static final int MediaBrowserCompatSearchResultReceiver = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_Design_BottomSheet_Modal;
    int AudioAttributesCompatParcelizer;
    int AudioAttributesImplApi21Parcelizer;
    call AudioAttributesImplApi26Parcelizer;
    WeakReference<View> AudioAttributesImplBaseParcelizer;
    boolean IconCompatParcelizer;
    boolean MediaBrowserCompatCustomActionResultReceiver;
    int MediaBrowserCompatItemReceiver;
    private WeakReference<View> MediaBrowserCompatMediaItem;
    private final ArrayList<write> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private ColorStateList MediaDescriptionCompat;
    private concatenateVorbisMetadata MediaMetadataCompat;
    private boolean MediaSessionCompatQueueItem;
    private boolean MediaSessionCompatResultReceiverWrapper;
    private int MediaSessionCompatToken;
    private boolean ParcelableVolumeInfo;
    private int PlaybackStateCompat;
    private int PlaybackStateCompatCustomAction;
    WeakReference<V> RatingCompat;
    int RemoteActionCompatParcelizer;
    private int ResultReceiver;
    private boolean _init_lambda2;
    private boolean _init_lambda3;
    private VelocityTracker _init_lambda5;
    private final call.IconCompatParcelizer handleMediaPlayPauseIfPendingOnHandler;
    private float onAddQueueItem;
    private boolean onCommand;
    private int onCustomAction;
    private int onFastForward;
    private boolean onMediaButtonEvent;
    private int onPause;
    private boolean onPlay;
    private SparseIntArray onPlayFromMediaId;
    private Map<View, Integer> onPlayFromSearch;
    private float onPlayFromUri;
    private boolean onPrepare;
    private float onPrepareFromMediaId;
    private boolean onPrepareFromSearch;
    private int onPrepareFromUri;
    private int onRemoveQueueItem;
    private ValueAnimator onRemoveQueueItemAt;
    private int onRewind;
    private int onSeekTo;
    private int onSetCaptioningEnabled;
    private boolean onSetPlaybackSpeed;
    private frameSizeBytesByTypeNb onSetRating;
    private boolean onSetRepeatMode;
    private boolean onSetShuffleMode;
    private float onSkipToNext;
    private int onSkipToPrevious;
    private boolean onSkipToQueueItem;
    private boolean onStop;
    private int r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
    private boolean r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
    private isValidFrameType r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    private int r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    private final BottomSheetBehavior<V>.IconCompatParcelizer r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
    private boolean r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
    int read;
    private int setSessionImpl;
    int write;

    public static abstract class write {
        protected void onLayout(View view) {
        }

        public abstract void onSlide(View view, float f);

        public abstract void onStateChanged(View view, int i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void read(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    public BottomSheetBehavior() {
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = 0;
        this.onPlay = true;
        this._init_lambda2 = false;
        this.onSkipToPrevious = -1;
        this.setSessionImpl = -1;
        this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = new IconCompatParcelizer(this, (byte) 0);
        this.onPlayFromUri = 0.5f;
        this.onAddQueueItem = -1.0f;
        this.onCommand = true;
        this.MediaBrowserCompatItemReceiver = 4;
        this.onSetCaptioningEnabled = 4;
        this.onPrepareFromMediaId = 0.1f;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new ArrayList<>();
        this.onRemoveQueueItem = -1;
        this.onPlayFromMediaId = new SparseIntArray();
        this.handleMediaPlayPauseIfPendingOnHandler = new call.IconCompatParcelizer() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.1
            private long read;

            @Override // o.call.IconCompatParcelizer
            public final boolean read(View view, int i) {
                if (BottomSheetBehavior.this.MediaBrowserCompatItemReceiver == 1 || BottomSheetBehavior.this.MediaBrowserCompatCustomActionResultReceiver) {
                    return false;
                }
                if (BottomSheetBehavior.this.MediaBrowserCompatItemReceiver == 3 && BottomSheetBehavior.this.AudioAttributesCompatParcelizer == i) {
                    View view2 = BottomSheetBehavior.this.AudioAttributesImplBaseParcelizer != null ? BottomSheetBehavior.this.AudioAttributesImplBaseParcelizer.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.read = System.currentTimeMillis();
                return BottomSheetBehavior.this.RatingCompat != null && BottomSheetBehavior.this.RatingCompat.get() == view;
            }

            @Override // o.call.IconCompatParcelizer
            public final void AudioAttributesCompatParcelizer(View view, int i, int i2) {
                BottomSheetBehavior.this.read(i2);
            }

            @Override // o.call.IconCompatParcelizer
            public final void IconCompatParcelizer(int i) {
                if (i == 1 && BottomSheetBehavior.this.onCommand) {
                    BottomSheetBehavior.this.write(1);
                }
            }

            private boolean IconCompatParcelizer(View view) {
                return view.getTop() > (BottomSheetBehavior.this.AudioAttributesImplApi21Parcelizer + BottomSheetBehavior.this.write()) / 2;
            }

            /* JADX WARN: Removed duplicated region for block: B:46:0x00d8  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x00f1  */
            @Override // o.call.IconCompatParcelizer
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void read(android.view.View r3, float r4, float r5) {
                /*
                    Method dump skipped, instruction units count: 249
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass1.read(android.view.View, float, float):void");
            }

            @Override // o.call.IconCompatParcelizer
            public final int AudioAttributesCompatParcelizer(View view, int i) {
                return StdKeyDeserializer.read(i, BottomSheetBehavior.this.write(), IconCompatParcelizer());
            }

            @Override // o.call.IconCompatParcelizer
            public final int IconCompatParcelizer(View view, int i) {
                return view.getLeft();
            }

            @Override // o.call.IconCompatParcelizer
            public final int IconCompatParcelizer() {
                if (BottomSheetBehavior.this.MediaBrowserCompatSearchResultReceiver()) {
                    return BottomSheetBehavior.this.AudioAttributesImplApi21Parcelizer;
                }
                return BottomSheetBehavior.this.RemoteActionCompatParcelizer;
            }
        };
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = 0;
        this.onPlay = true;
        this._init_lambda2 = false;
        this.onSkipToPrevious = -1;
        this.setSessionImpl = -1;
        this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = new IconCompatParcelizer(this, (byte) 0);
        this.onPlayFromUri = 0.5f;
        this.onAddQueueItem = -1.0f;
        this.onCommand = true;
        this.MediaBrowserCompatItemReceiver = 4;
        this.onSetCaptioningEnabled = 4;
        this.onPrepareFromMediaId = 0.1f;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new ArrayList<>();
        this.onRemoveQueueItem = -1;
        this.onPlayFromMediaId = new SparseIntArray();
        this.handleMediaPlayPauseIfPendingOnHandler = new call.IconCompatParcelizer() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.1
            private long read;

            @Override // o.call.IconCompatParcelizer
            public final boolean read(View view, int i) {
                if (BottomSheetBehavior.this.MediaBrowserCompatItemReceiver == 1 || BottomSheetBehavior.this.MediaBrowserCompatCustomActionResultReceiver) {
                    return false;
                }
                if (BottomSheetBehavior.this.MediaBrowserCompatItemReceiver == 3 && BottomSheetBehavior.this.AudioAttributesCompatParcelizer == i) {
                    View view2 = BottomSheetBehavior.this.AudioAttributesImplBaseParcelizer != null ? BottomSheetBehavior.this.AudioAttributesImplBaseParcelizer.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.read = System.currentTimeMillis();
                return BottomSheetBehavior.this.RatingCompat != null && BottomSheetBehavior.this.RatingCompat.get() == view;
            }

            @Override // o.call.IconCompatParcelizer
            public final void AudioAttributesCompatParcelizer(View view, int i, int i2) {
                BottomSheetBehavior.this.read(i2);
            }

            @Override // o.call.IconCompatParcelizer
            public final void IconCompatParcelizer(int i) {
                if (i == 1 && BottomSheetBehavior.this.onCommand) {
                    BottomSheetBehavior.this.write(1);
                }
            }

            private boolean IconCompatParcelizer(View view) {
                return view.getTop() > (BottomSheetBehavior.this.AudioAttributesImplApi21Parcelizer + BottomSheetBehavior.this.write()) / 2;
            }

            /* JADX WARN: Removed duplicated region for block: B:46:0x00d8  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x00f1  */
            @Override // o.call.IconCompatParcelizer
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void read(android.view.View r3, float r4, float r5) {
                /*
                    Method dump skipped, instruction units count: 249
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass1.read(android.view.View, float, float):void");
            }

            @Override // o.call.IconCompatParcelizer
            public final int AudioAttributesCompatParcelizer(View view, int i) {
                return StdKeyDeserializer.read(i, BottomSheetBehavior.this.write(), IconCompatParcelizer());
            }

            @Override // o.call.IconCompatParcelizer
            public final int IconCompatParcelizer(View view, int i) {
                return view.getLeft();
            }

            @Override // o.call.IconCompatParcelizer
            public final int IconCompatParcelizer() {
                if (BottomSheetBehavior.this.MediaBrowserCompatSearchResultReceiver()) {
                    return BottomSheetBehavior.this.AudioAttributesImplApi21Parcelizer;
                }
                return BottomSheetBehavior.this.RemoteActionCompatParcelizer;
            }
        };
        this.PlaybackStateCompatCustomAction = context.getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.BottomSheetBehavior_Layout);
        if (typedArrayObtainStyledAttributes.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.BottomSheetBehavior_Layout_backgroundTint)) {
            this.MediaDescriptionCompat = SeekMap.IconCompatParcelizer(context, typedArrayObtainStyledAttributes, calculateNextSearchBytePosition.MediaMetadataCompat.BottomSheetBehavior_Layout_backgroundTint);
        }
        if (typedArrayObtainStyledAttributes.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = isValidFrameType.read(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.bottomSheetStyle, MediaBrowserCompatSearchResultReceiver).RemoteActionCompatParcelizer();
        }
        write(context);
        onAddQueueItem();
        this.onAddQueueItem = typedArrayObtainStyledAttributes.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.BottomSheetBehavior_Layout_android_maxWidth)) {
            MediaBrowserCompatItemReceiver(typedArrayObtainStyledAttributes.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.BottomSheetBehavior_Layout_android_maxWidth, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.BottomSheetBehavior_Layout_android_maxHeight)) {
            AudioAttributesImplApi26Parcelizer(typedArrayObtainStyledAttributes.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.BottomSheetBehavior_Layout_android_maxHeight, -1));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(calculateNextSearchBytePosition.MediaMetadataCompat.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (typedValuePeekValue != null && typedValuePeekValue.data == -1) {
            AudioAttributesCompatParcelizer(typedValuePeekValue.data);
        } else {
            AudioAttributesCompatParcelizer(typedArrayObtainStyledAttributes.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        read(typedArrayObtainStyledAttributes.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.BottomSheetBehavior_Layout_behavior_hideable, false));
        AudioAttributesImplApi26Parcelizer(typedArrayObtainStyledAttributes.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        MediaBrowserCompatCustomActionResultReceiver(typedArrayObtainStyledAttributes.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        RemoteActionCompatParcelizer(typedArrayObtainStyledAttributes.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        write(typedArrayObtainStyledAttributes.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.BottomSheetBehavior_Layout_behavior_draggable, true));
        RatingCompat(typedArrayObtainStyledAttributes.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        RemoteActionCompatParcelizer(typedArrayObtainStyledAttributes.getFloat(calculateNextSearchBytePosition.MediaMetadataCompat.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(calculateNextSearchBytePosition.MediaMetadataCompat.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            AudioAttributesImplBaseParcelizer(typedValuePeekValue2.data);
        } else {
            AudioAttributesImplBaseParcelizer(typedArrayObtainStyledAttributes.getDimensionPixelOffset(calculateNextSearchBytePosition.MediaMetadataCompat.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        }
        MediaMetadataCompat(typedArrayObtainStyledAttributes.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500));
        this.onStop = typedArrayObtainStyledAttributes.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.ParcelableVolumeInfo = typedArrayObtainStyledAttributes.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.MediaSessionCompatResultReceiverWrapper = typedArrayObtainStyledAttributes.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.MediaSessionCompatQueueItem = typedArrayObtainStyledAttributes.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.onSetShuffleMode = typedArrayObtainStyledAttributes.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.onSetPlaybackSpeed = typedArrayObtainStyledAttributes.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.onSetRepeatMode = typedArrayObtainStyledAttributes.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this._init_lambda3 = typedArrayObtainStyledAttributes.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        typedArrayObtainStyledAttributes.recycle();
        this.onSkipToNext = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final Parcelable read(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.read(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void AudioAttributesCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.AudioAttributesCompatParcelizer(coordinatorLayout, v, savedState.read());
        AudioAttributesCompatParcelizer(savedState);
        if (savedState.AudioAttributesImplBaseParcelizer == 1 || savedState.AudioAttributesImplBaseParcelizer == 2) {
            this.MediaBrowserCompatItemReceiver = 4;
            this.onSetCaptioningEnabled = 4;
        } else {
            int i = savedState.AudioAttributesImplBaseParcelizer;
            this.MediaBrowserCompatItemReceiver = i;
            this.onSetCaptioningEnabled = i;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void IconCompatParcelizer(CoordinatorLayout.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        super.IconCompatParcelizer(remoteActionCompatParcelizer);
        this.RatingCompat = null;
        this.AudioAttributesImplApi26Parcelizer = null;
        this.MediaMetadataCompat = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void IconCompatParcelizer() {
        super.IconCompatParcelizer();
        this.RatingCompat = null;
        this.AudioAttributesImplApi26Parcelizer = null;
        this.MediaMetadataCompat = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean write(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int i5 = marginLayoutParams.leftMargin;
        int i6 = read(i, paddingLeft + paddingRight + i5 + marginLayoutParams.rightMargin + i2, this.onSkipToPrevious, ((ViewGroup.LayoutParams) marginLayoutParams).width);
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int i7 = marginLayoutParams.topMargin;
        v.measure(i6, read(i3, paddingTop + paddingBottom + i7 + marginLayoutParams.bottomMargin + i4, this.setSessionImpl, ((ViewGroup.LayoutParams) marginLayoutParams).height));
        return true;
    }

    private static int read(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean write(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(coordinatorLayout) && !InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.RatingCompat == null) {
            this.ResultReceiver = coordinatorLayout.getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.design_bottom_sheet_peek_height_min);
            read(v);
            InvalidTypeIdException.IconCompatParcelizer(v, new getFramePositionForTimeUs(v));
            this.RatingCompat = new WeakReference<>(v);
            this.MediaMetadataCompat = new concatenateVorbisMetadata(v);
            frameSizeBytesByTypeNb framesizebytesbytypenb = this.onSetRating;
            if (framesizebytesbytypenb != null) {
                InvalidTypeIdException.read(v, framesizebytesbytypenb);
                frameSizeBytesByTypeNb framesizebytesbytypenb2 = this.onSetRating;
                float fAudioAttributesImplBaseParcelizer = this.onAddQueueItem;
                if (fAudioAttributesImplBaseParcelizer == -1.0f) {
                    fAudioAttributesImplBaseParcelizer = InvalidTypeIdException.AudioAttributesImplBaseParcelizer(v);
                }
                framesizebytesbytypenb2.handleMediaPlayPauseIfPendingOnHandler(fAudioAttributesImplBaseParcelizer);
            } else {
                ColorStateList colorStateList = this.MediaDescriptionCompat;
                if (colorStateList != null) {
                    InvalidTypeIdException.RemoteActionCompatParcelizer(v, colorStateList);
                }
            }
            onFastForward();
            if (InvalidTypeIdException.MediaBrowserCompatItemReceiver(v) == 0) {
                InvalidTypeIdException.AudioAttributesImplBaseParcelizer(v, 1);
            }
        }
        if (this.AudioAttributesImplApi26Parcelizer == null) {
            this.AudioAttributesImplApi26Parcelizer = call.AudioAttributesCompatParcelizer(coordinatorLayout, this.handleMediaPlayPauseIfPendingOnHandler);
        }
        int top = v.getTop();
        coordinatorLayout.write(v, i);
        this.MediaSessionCompatToken = coordinatorLayout.getWidth();
        this.AudioAttributesImplApi21Parcelizer = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.onCustomAction = height;
        int iMin = this.AudioAttributesImplApi21Parcelizer;
        int i2 = this.onPrepareFromUri;
        if (iMin - height < i2) {
            if (this.MediaSessionCompatQueueItem) {
                int i3 = this.setSessionImpl;
                if (i3 != -1) {
                    iMin = Math.min(iMin, i3);
                }
                this.onCustomAction = iMin;
            } else {
                int iMin2 = iMin - i2;
                int i4 = this.setSessionImpl;
                if (i4 != -1) {
                    iMin2 = Math.min(iMin2, i4);
                }
                this.onCustomAction = iMin2;
            }
        }
        this.write = Math.max(0, this.AudioAttributesImplApi21Parcelizer - this.onCustomAction);
        MediaBrowserCompatMediaItem();
        MediaMetadataCompat();
        int i5 = this.MediaBrowserCompatItemReceiver;
        if (i5 == 3) {
            InvalidTypeIdException.IconCompatParcelizer((View) v, write());
        } else if (i5 == 6) {
            InvalidTypeIdException.IconCompatParcelizer((View) v, this.read);
        } else if (this.IconCompatParcelizer && i5 == 5) {
            InvalidTypeIdException.IconCompatParcelizer((View) v, this.AudioAttributesImplApi21Parcelizer);
        } else if (i5 == 4) {
            InvalidTypeIdException.IconCompatParcelizer((View) v, this.RemoteActionCompatParcelizer);
        } else if (i5 == 1 || i5 == 2) {
            InvalidTypeIdException.IconCompatParcelizer((View) v, top - v.getTop());
        }
        AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver, false);
        this.AudioAttributesImplBaseParcelizer = new WeakReference<>(RemoteActionCompatParcelizer(v));
        for (int i6 = 0; i6 < this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.size(); i6++) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.get(i6).onLayout(v);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean read(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int i;
        call callVar;
        if (!v.isShown() || !this.onCommand) {
            this.onPrepareFromSearch = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        if (this._init_lambda5 == null) {
            this._init_lambda5 = VelocityTracker.obtain();
        }
        this._init_lambda5.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.onRemoveQueueItem = (int) motionEvent.getY();
            if (this.MediaBrowserCompatItemReceiver != 2) {
                WeakReference<View> weakReference = this.AudioAttributesImplBaseParcelizer;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.IconCompatParcelizer(view, x, this.onRemoveQueueItem)) {
                    this.AudioAttributesCompatParcelizer = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.MediaBrowserCompatCustomActionResultReceiver = true;
                }
            }
            this.onPrepareFromSearch = this.AudioAttributesCompatParcelizer == -1 && !coordinatorLayout.IconCompatParcelizer(v, x, this.onRemoveQueueItem);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.MediaBrowserCompatCustomActionResultReceiver = false;
            this.AudioAttributesCompatParcelizer = -1;
            if (this.onPrepareFromSearch) {
                this.onPrepareFromSearch = false;
                return false;
            }
        }
        if (!this.onPrepareFromSearch && (callVar = this.AudioAttributesImplApi26Parcelizer) != null && callVar.read(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.AudioAttributesImplBaseParcelizer;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.onPrepareFromSearch || this.MediaBrowserCompatItemReceiver == 1 || coordinatorLayout.IconCompatParcelizer(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.AudioAttributesImplApi26Parcelizer == null || (i = this.onRemoveQueueItem) == -1 || Math.abs(((float) i) - motionEvent.getY()) <= ((float) this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplBaseParcelizer())) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean AudioAttributesCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.MediaBrowserCompatItemReceiver == 1 && actionMasked == 0) {
            return true;
        }
        if (onPlayFromMediaId()) {
            this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(motionEvent);
        }
        if (actionMasked == 0) {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        if (this._init_lambda5 == null) {
            this._init_lambda5 = VelocityTracker.obtain();
        }
        this._init_lambda5.addMovement(motionEvent);
        if (onPlayFromMediaId() && actionMasked == 2 && !this.onPrepareFromSearch && Math.abs(this.onRemoveQueueItem - motionEvent.getY()) > this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplBaseParcelizer()) {
            this.AudioAttributesImplApi26Parcelizer.read(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.onPrepareFromSearch;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean write(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.onRewind = 0;
        this.onSkipToQueueItem = false;
        return (i & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void read(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 != 1) {
            WeakReference<View> weakReference = this.AudioAttributesImplBaseParcelizer;
            if (view == (weakReference != null ? weakReference.get() : null)) {
                int top = v.getTop();
                int i4 = top - i2;
                if (i2 > 0) {
                    if (i4 < write()) {
                        int iWrite = top - write();
                        iArr[1] = iWrite;
                        InvalidTypeIdException.IconCompatParcelizer((View) v, -iWrite);
                        write(3);
                    } else {
                        if (!this.onCommand) {
                            return;
                        }
                        iArr[1] = i2;
                        InvalidTypeIdException.IconCompatParcelizer((View) v, -i2);
                        write(1);
                    }
                } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                    if (i4 <= this.RemoteActionCompatParcelizer || MediaBrowserCompatSearchResultReceiver()) {
                        if (!this.onCommand) {
                            return;
                        }
                        iArr[1] = i2;
                        InvalidTypeIdException.IconCompatParcelizer((View) v, -i2);
                        write(1);
                    } else {
                        int i5 = top - this.RemoteActionCompatParcelizer;
                        iArr[1] = i5;
                        InvalidTypeIdException.IconCompatParcelizer((View) v, -i5);
                        write(4);
                    }
                }
                read(v.getTop());
                this.onRewind = i2;
                this.onSkipToQueueItem = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0099  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void IconCompatParcelizer(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.view.View r4, int r5) {
        /*
            r1 = this;
            int r2 = r3.getTop()
            int r5 = r1.write()
            r0 = 3
            if (r2 != r5) goto Lf
            r1.write(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r2 = r1.AudioAttributesImplBaseParcelizer
            if (r2 == 0) goto La0
            java.lang.Object r2 = r2.get()
            if (r4 != r2) goto La0
            boolean r2 = r1.onSkipToQueueItem
            if (r2 != 0) goto L1f
            goto La0
        L1f:
            int r2 = r1.onRewind
            if (r2 <= 0) goto L30
            boolean r2 = r1.onPlay
            if (r2 != 0) goto L9a
            int r2 = r3.getTop()
            int r4 = r1.read
            if (r2 <= r4) goto L9a
            goto L97
        L30:
            boolean r2 = r1.IconCompatParcelizer
            if (r2 == 0) goto L40
            float r2 = r1.handleMediaPlayPauseIfPendingOnHandler()
            boolean r2 = r1.write(r3, r2)
            if (r2 == 0) goto L40
            r0 = 5
            goto L9a
        L40:
            int r2 = r1.onRewind
            if (r2 != 0) goto L7d
            int r2 = r3.getTop()
            boolean r4 = r1.onPlay
            if (r4 == 0) goto L5e
            int r4 = r1.write
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.RemoteActionCompatParcelizer
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto L99
            goto L9a
        L5e:
            int r4 = r1.read
            if (r2 >= r4) goto L6d
            int r4 = r1.RemoteActionCompatParcelizer
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            if (r2 < r4) goto L9a
            goto L97
        L6d:
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.RemoteActionCompatParcelizer
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto L99
            goto L97
        L7d:
            boolean r2 = r1.onPlay
            if (r2 == 0) goto L82
            goto L99
        L82:
            int r2 = r3.getTop()
            int r4 = r1.read
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.RemoteActionCompatParcelizer
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto L99
        L97:
            r0 = 6
            goto L9a
        L99:
            r0 = 4
        L9a:
            r2 = 0
            r1.IconCompatParcelizer(r3, r0, r2)
            r1.onSkipToQueueItem = r2
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.IconCompatParcelizer(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean write(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.AudioAttributesImplBaseParcelizer;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.MediaBrowserCompatItemReceiver != 3 || super.write(coordinatorLayout, v, view, f, f2);
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return this.onPlay;
    }

    private void MediaBrowserCompatCustomActionResultReceiver(boolean z) {
        if (this.onPlay == z) {
            return;
        }
        this.onPlay = z;
        if (this.RatingCompat != null) {
            MediaMetadataCompat();
        }
        write((this.onPlay && this.MediaBrowserCompatItemReceiver == 6) ? 3 : this.MediaBrowserCompatItemReceiver);
        AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver, true);
        onFastForward();
    }

    private void MediaBrowserCompatItemReceiver(int i) {
        this.onSkipToPrevious = i;
    }

    private void AudioAttributesImplApi26Parcelizer(int i) {
        this.setSessionImpl = i;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        MediaDescriptionCompat(i);
    }

    private void MediaDescriptionCompat(int i) {
        if (i == -1) {
            if (this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4) {
                return;
            } else {
                this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = true;
            }
        } else {
            if (!this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 && this.PlaybackStateCompat == i) {
                return;
            }
            this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = false;
            this.PlaybackStateCompat = Math.max(0, i);
        }
        IconCompatParcelizer(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer(boolean z) {
        V v;
        if (this.RatingCompat != null) {
            MediaMetadataCompat();
            if (this.MediaBrowserCompatItemReceiver != 4 || (v = this.RatingCompat.get()) == null) {
                return;
            }
            v.requestLayout();
        }
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        if (this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4) {
            return -1;
        }
        return this.PlaybackStateCompat;
    }

    public final void RemoteActionCompatParcelizer(float f) {
        if (f <= BitmapDescriptorFactory.HUE_RED || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.onPlayFromUri = f;
        if (this.RatingCompat != null) {
            MediaBrowserCompatMediaItem();
        }
    }

    public final float AudioAttributesCompatParcelizer() {
        return this.onPlayFromUri;
    }

    private void AudioAttributesImplBaseParcelizer(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.onFastForward = i;
        AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver, true);
    }

    public final int write() {
        if (this.onPlay) {
            return this.write;
        }
        return Math.max(this.onFastForward, this.MediaSessionCompatQueueItem ? 0 : this.onPrepareFromUri);
    }

    public final void read(boolean z) {
        if (this.IconCompatParcelizer != z) {
            this.IconCompatParcelizer = z;
            if (!z && this.MediaBrowserCompatItemReceiver == 5) {
                IconCompatParcelizer(4);
            }
            onFastForward();
        }
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.IconCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = z;
    }

    public final void write(boolean z) {
        this.onCommand = z;
    }

    private void MediaMetadataCompat(int i) {
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i;
    }

    private void RatingCompat(int i) {
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = i;
    }

    public final void read(write writeVar) {
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.contains(writeVar)) {
            return;
        }
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.add(writeVar);
    }

    public final void RemoteActionCompatParcelizer(write writeVar) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.remove(writeVar);
    }

    public final void IconCompatParcelizer(int i) {
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (this.IconCompatParcelizer || i != 5) {
            final int i2 = (i == 6 && this.onPlay && AudioAttributesImplApi21Parcelizer(i) <= this.write) ? 3 : i;
            WeakReference<V> weakReference = this.RatingCompat;
            if (weakReference == null || weakReference.get() == null) {
                write(i);
            } else {
                final V v = this.RatingCompat.get();
                IconCompatParcelizer(v, new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        BottomSheetBehavior.this.IconCompatParcelizer(v, i2, false);
                    }
                });
            }
        }
    }

    private static void IconCompatParcelizer(V v, Runnable runnable) {
        if (IconCompatParcelizer(v)) {
            v.post(runnable);
        } else {
            runnable.run();
        }
    }

    private static boolean IconCompatParcelizer(V v) {
        ViewParent parent = v.getParent();
        return parent != null && parent.isLayoutRequested() && InvalidTypeIdException.onPlayFromSearch(v);
    }

    private void AudioAttributesImplApi26Parcelizer(boolean z) {
        this.onPrepare = z;
    }

    private boolean onPause() {
        return this.onPrepare;
    }

    public final int AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    final void write(int i) {
        V v;
        if (this.MediaBrowserCompatItemReceiver != i) {
            this.MediaBrowserCompatItemReceiver = i;
            if (i == 4 || i == 3 || i == 6 || (this.IconCompatParcelizer && i == 5)) {
                this.onSetCaptioningEnabled = i;
            }
            WeakReference<V> weakReference = this.RatingCompat;
            if (weakReference == null || (v = weakReference.get()) == null) {
                return;
            }
            if (i == 3) {
                AudioAttributesCompatParcelizer(true);
            } else if (i == 6 || i == 5 || i == 4) {
                AudioAttributesCompatParcelizer(false);
            }
            AudioAttributesCompatParcelizer(i, true);
            for (int i2 = 0; i2 < this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.size(); i2++) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.get(i2).onStateChanged(v, i);
            }
            onFastForward();
        }
    }

    private void AudioAttributesCompatParcelizer(int i, boolean z) {
        boolean zOnCustomAction;
        ValueAnimator valueAnimator;
        if (i == 2 || this.onMediaButtonEvent == (zOnCustomAction = onCustomAction()) || this.onSetRating == null) {
            return;
        }
        this.onMediaButtonEvent = zOnCustomAction;
        if (z && (valueAnimator = this.onRemoveQueueItemAt) != null) {
            if (valueAnimator.isRunning()) {
                this.onRemoveQueueItemAt.reverse();
                return;
            } else {
                this.onRemoveQueueItemAt.setFloatValues(this.onSetRating.onPrepareFromMediaId(), zOnCustomAction ? MediaDescriptionCompat() : 1.0f);
                this.onRemoveQueueItemAt.start();
                return;
            }
        }
        ValueAnimator valueAnimator2 = this.onRemoveQueueItemAt;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.onRemoveQueueItemAt.cancel();
        }
        this.onSetRating.onCustomAction(this.onMediaButtonEvent ? MediaDescriptionCompat() : 1.0f);
    }

    private float MediaDescriptionCompat() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        if (this.onSetRating == null || (weakReference = this.RatingCompat) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return (!onCommand() || (rootWindowInsets = this.RatingCompat.get().getRootWindowInsets()) == null) ? BitmapDescriptorFactory.HUE_RED : Math.max(cK_(this.onSetRating.onRemoveQueueItemAt(), rootWindowInsets.getRoundedCorner(0)), cK_(this.onSetRating.onRewind(), rootWindowInsets.getRoundedCorner(1)));
    }

    private static float cK_(float f, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > BitmapDescriptorFactory.HUE_RED && f > BitmapDescriptorFactory.HUE_RED) {
                return radius / f;
            }
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    private boolean onCommand() {
        WeakReference<V> weakReference = this.RatingCompat;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        this.RatingCompat.get().getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    private boolean onCustomAction() {
        if (this.MediaBrowserCompatItemReceiver == 3) {
            return this._init_lambda3 || onCommand();
        }
        return false;
    }

    private int RatingCompat() {
        int iMin;
        int i;
        int i2;
        if (this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4) {
            iMin = Math.min(Math.max(this.ResultReceiver, this.AudioAttributesImplApi21Parcelizer - ((this.MediaSessionCompatToken * 9) / 16)), this.onCustomAction);
            i = this.onSeekTo;
        } else {
            if (!this.onPrepare && !this.onStop && (i2 = this.onPause) > 0) {
                return Math.max(this.PlaybackStateCompat, i2 + this.PlaybackStateCompatCustomAction);
            }
            iMin = this.PlaybackStateCompat;
            i = this.onSeekTo;
        }
        return iMin + i;
    }

    private void MediaMetadataCompat() {
        int iRatingCompat = RatingCompat();
        if (this.onPlay) {
            this.RemoteActionCompatParcelizer = Math.max(this.AudioAttributesImplApi21Parcelizer - iRatingCompat, this.write);
        } else {
            this.RemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer - iRatingCompat;
        }
    }

    private void MediaBrowserCompatMediaItem() {
        this.read = (int) (this.AudioAttributesImplApi21Parcelizer * (1.0f - this.onPlayFromUri));
    }

    private float RemoteActionCompatParcelizer(int i) {
        float f;
        float fWrite;
        int i2 = this.RemoteActionCompatParcelizer;
        if (i > i2 || i2 == write()) {
            int i3 = this.RemoteActionCompatParcelizer;
            f = i3 - i;
            fWrite = this.AudioAttributesImplApi21Parcelizer - i3;
        } else {
            int i4 = this.RemoteActionCompatParcelizer;
            f = i4 - i;
            fWrite = i4 - write();
        }
        return f / fWrite;
    }

    private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        this.AudioAttributesCompatParcelizer = -1;
        this.onRemoveQueueItem = -1;
        VelocityTracker velocityTracker = this._init_lambda5;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this._init_lambda5 = null;
        }
    }

    private void AudioAttributesCompatParcelizer(SavedState savedState) {
        int i = this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.PlaybackStateCompat = savedState.AudioAttributesCompatParcelizer;
            }
            int i2 = this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
            if (i2 == -1 || (i2 & 2) == 2) {
                this.onPlay = savedState.RemoteActionCompatParcelizer;
            }
            int i3 = this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
            if (i3 == -1 || (i3 & 4) == 4) {
                this.IconCompatParcelizer = savedState.read;
            }
            int i4 = this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
            if (i4 == -1 || (i4 & 8) == 8) {
                this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = savedState.IconCompatParcelizer;
            }
        }
    }

    final boolean write(View view, float f) {
        if (this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0) {
            return true;
        }
        if (view.getTop() < this.RemoteActionCompatParcelizer) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f * this.onPrepareFromMediaId)) - ((float) this.RemoteActionCompatParcelizer)) / ((float) RatingCompat()) > 0.5f;
    }

    @Override // kotlin.readStreamInfoBlock
    public final void RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
        concatenateVorbisMetadata concatenatevorbismetadata = this.MediaMetadataCompat;
        if (concatenatevorbismetadata == null) {
            return;
        }
        concatenatevorbismetadata.RemoteActionCompatParcelizer(audioAttributesImplApi26Parcelizer);
    }

    @Override // kotlin.readStreamInfoBlock
    public final void write(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
        concatenateVorbisMetadata concatenatevorbismetadata = this.MediaMetadataCompat;
        if (concatenatevorbismetadata == null) {
            return;
        }
        concatenatevorbismetadata.IconCompatParcelizer(audioAttributesImplApi26Parcelizer);
    }

    @Override // kotlin.readStreamInfoBlock
    public final void AudioAttributesImplApi21Parcelizer() {
        concatenateVorbisMetadata concatenatevorbismetadata = this.MediaMetadataCompat;
        if (concatenatevorbismetadata == null) {
            return;
        }
        AudioAttributesImplApi26Parcelizer audioAttributesImplApi26ParcelizerIconCompatParcelizer = concatenatevorbismetadata.IconCompatParcelizer();
        if (audioAttributesImplApi26ParcelizerIconCompatParcelizer == null || Build.VERSION.SDK_INT < 34) {
            IconCompatParcelizer(this.IconCompatParcelizer ? 5 : 4);
        } else if (this.IconCompatParcelizer) {
            this.MediaMetadataCompat.AudioAttributesCompatParcelizer(audioAttributesImplApi26ParcelizerIconCompatParcelizer, new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.3
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    BottomSheetBehavior.this.write(5);
                    if (BottomSheetBehavior.this.RatingCompat == null || BottomSheetBehavior.this.RatingCompat.get() == null) {
                        return;
                    }
                    BottomSheetBehavior.this.RatingCompat.get().requestLayout();
                }
            });
        } else {
            this.MediaMetadataCompat.AudioAttributesCompatParcelizer(audioAttributesImplApi26ParcelizerIconCompatParcelizer);
            IconCompatParcelizer(4);
        }
    }

    @Override // kotlin.readStreamInfoBlock
    public final void read() {
        concatenateVorbisMetadata concatenatevorbismetadata = this.MediaMetadataCompat;
        if (concatenatevorbismetadata == null) {
            return;
        }
        concatenatevorbismetadata.read();
    }

    private View RemoteActionCompatParcelizer(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (InvalidTypeIdException.onRemoveQueueItemAt(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(viewGroup.getChildAt(i));
                if (viewRemoteActionCompatParcelizer != null) {
                    return viewRemoteActionCompatParcelizer;
                }
            }
        }
        return null;
    }

    private boolean onPlayFromMediaId() {
        if (this.AudioAttributesImplApi26Parcelizer != null) {
            return this.onCommand || this.MediaBrowserCompatItemReceiver == 1;
        }
        return false;
    }

    private void write(Context context) {
        if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null) {
            return;
        }
        frameSizeBytesByTypeNb framesizebytesbytypenb = new frameSizeBytesByTypeNb(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
        this.onSetRating = framesizebytesbytypenb;
        framesizebytesbytypenb.RemoteActionCompatParcelizer(context);
        ColorStateList colorStateList = this.MediaDescriptionCompat;
        if (colorStateList != null) {
            this.onSetRating.AudioAttributesImplApi21Parcelizer(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.onSetRating.setTint(typedValue.data);
    }

    public final frameSizeBytesByTypeNb RemoteActionCompatParcelizer() {
        return this.onSetRating;
    }

    private void onAddQueueItem() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(MediaDescriptionCompat(), 1.0f);
        this.onRemoveQueueItemAt = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.onRemoveQueueItemAt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (BottomSheetBehavior.this.onSetRating != null) {
                    BottomSheetBehavior.this.onSetRating.onCustomAction(fFloatValue);
                }
            }
        });
    }

    private void read(View view) {
        final boolean z = (onPause() || this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4) ? false : true;
        if (this.onStop || this.ParcelableVolumeInfo || this.MediaSessionCompatResultReceiverWrapper || this.onSetShuffleMode || this.onSetPlaybackSpeed || this.onSetRepeatMode || z) {
            checkAndPeekStreamMarker.IconCompatParcelizer(view, new checkAndPeekStreamMarker.RemoteActionCompatParcelizer() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
                /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
                @Override // o.checkAndPeekStreamMarker.RemoteActionCompatParcelizer
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final androidx.core.view.WindowInsetsCompat RemoteActionCompatParcelizer(android.view.View r10, androidx.core.view.WindowInsetsCompat r11, o.checkAndPeekStreamMarker.write r12) {
                    /*
                        Method dump skipped, instruction units count: 211
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.AnonymousClass4.RemoteActionCompatParcelizer(android.view.View, androidx.core.view.WindowInsetsCompat, o.checkAndPeekStreamMarker$write):androidx.core.view.WindowInsetsCompat");
                }
            });
        }
    }

    private float handleMediaPlayPauseIfPendingOnHandler() {
        VelocityTracker velocityTracker = this._init_lambda5;
        if (velocityTracker == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        velocityTracker.computeCurrentVelocity(1000, this.onSkipToNext);
        return this._init_lambda5.getYVelocity(this.AudioAttributesCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer(View view, int i, boolean z) {
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(i);
        call callVar = this.AudioAttributesImplApi26Parcelizer;
        if (callVar != null && (!z ? callVar.AudioAttributesCompatParcelizer(view, view.getLeft(), iAudioAttributesImplApi21Parcelizer) : callVar.RemoteActionCompatParcelizer(view.getLeft(), iAudioAttributesImplApi21Parcelizer))) {
            write(2);
            AudioAttributesCompatParcelizer(i, true);
            this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8.write(i);
            return;
        }
        write(i);
    }

    private int AudioAttributesImplApi21Parcelizer(int i) {
        if (i == 3) {
            return write();
        }
        if (i == 4) {
            return this.RemoteActionCompatParcelizer;
        }
        if (i == 5) {
            return this.AudioAttributesImplApi21Parcelizer;
        }
        if (i == 6) {
            return this.read;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: ".concat(String.valueOf(i)));
    }

    final void read(int i) {
        V v = this.RatingCompat.get();
        if (v == null || this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.isEmpty()) {
            return;
        }
        float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
        for (int i2 = 0; i2 < this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.size(); i2++) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.get(i2).onSlide(v, fRemoteActionCompatParcelizer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean MediaBrowserCompatSearchResultReceiver() {
        return MediaBrowserCompatCustomActionResultReceiver();
    }

    class IconCompatParcelizer {
        private int AudioAttributesCompatParcelizer;
        private final Runnable read;
        private boolean write;

        private IconCompatParcelizer() {
            this.read = new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.IconCompatParcelizer.1
                @Override // java.lang.Runnable
                public final void run() {
                    IconCompatParcelizer.read(IconCompatParcelizer.this);
                    if (BottomSheetBehavior.this.AudioAttributesImplApi26Parcelizer != null && BottomSheetBehavior.this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer()) {
                        IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer.this;
                        iconCompatParcelizer.write(iconCompatParcelizer.AudioAttributesCompatParcelizer);
                    } else if (BottomSheetBehavior.this.MediaBrowserCompatItemReceiver == 2) {
                        BottomSheetBehavior.this.write(IconCompatParcelizer.this.AudioAttributesCompatParcelizer);
                    }
                }
            };
        }

        /* synthetic */ IconCompatParcelizer(BottomSheetBehavior bottomSheetBehavior, byte b) {
            this();
        }

        static /* synthetic */ boolean read(IconCompatParcelizer iconCompatParcelizer) {
            iconCompatParcelizer.write = false;
            return false;
        }

        final void write(int i) {
            if (BottomSheetBehavior.this.RatingCompat == null || BottomSheetBehavior.this.RatingCompat.get() == null) {
                return;
            }
            this.AudioAttributesCompatParcelizer = i;
            if (this.write) {
                return;
            }
            InvalidTypeIdException.AudioAttributesCompatParcelizer(BottomSheetBehavior.this.RatingCompat.get(), this.read);
            this.write = true;
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState.2
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return write(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return AudioAttributesCompatParcelizer(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return write(i);
            }

            private static SavedState AudioAttributesCompatParcelizer(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            private static SavedState write(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            private static SavedState[] write(int i) {
                return new SavedState[i];
            }
        };
        int AudioAttributesCompatParcelizer;
        final int AudioAttributesImplBaseParcelizer;
        boolean IconCompatParcelizer;
        boolean RemoteActionCompatParcelizer;
        boolean read;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.AudioAttributesImplBaseParcelizer = parcel.readInt();
            this.AudioAttributesCompatParcelizer = parcel.readInt();
            this.RemoteActionCompatParcelizer = parcel.readInt() == 1;
            this.read = parcel.readInt() == 1;
            this.IconCompatParcelizer = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.AudioAttributesImplBaseParcelizer = bottomSheetBehavior.MediaBrowserCompatItemReceiver;
            this.AudioAttributesCompatParcelizer = ((BottomSheetBehavior) bottomSheetBehavior).PlaybackStateCompat;
            this.RemoteActionCompatParcelizer = ((BottomSheetBehavior) bottomSheetBehavior).onPlay;
            this.read = bottomSheetBehavior.IconCompatParcelizer;
            this.IconCompatParcelizer = ((BottomSheetBehavior) bottomSheetBehavior).r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.AudioAttributesImplBaseParcelizer);
            parcel.writeInt(this.AudioAttributesCompatParcelizer);
            parcel.writeInt(this.RemoteActionCompatParcelizer ? 1 : 0);
            parcel.writeInt(this.read ? 1 : 0);
            parcel.writeInt(this.IconCompatParcelizer ? 1 : 0);
        }
    }

    public static <V extends View> BottomSheetBehavior<V> AudioAttributesCompatParcelizer(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.RemoteActionCompatParcelizer)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behaviorWrite = ((CoordinatorLayout.RemoteActionCompatParcelizer) layoutParams).write();
        if (!(behaviorWrite instanceof BottomSheetBehavior)) {
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        return (BottomSheetBehavior) behaviorWrite;
    }

    private void AudioAttributesCompatParcelizer(boolean z) {
        WeakReference<V> weakReference = this.RatingCompat;
        if (weakReference != null) {
            ViewParent parent = weakReference.get().getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.onPlayFromSearch != null) {
                        return;
                    } else {
                        this.onPlayFromSearch = new HashMap(childCount);
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.RatingCompat.get() && z) {
                        this.onPlayFromSearch.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (z) {
                    return;
                }
                this.onPlayFromSearch = null;
            }
        }
    }

    final void write(View view) {
        WeakReference<View> weakReference;
        if (view == null && (weakReference = this.MediaBrowserCompatMediaItem) != null) {
            read(weakReference.get(), 1);
            this.MediaBrowserCompatMediaItem = null;
        } else {
            this.MediaBrowserCompatMediaItem = new WeakReference<>(view);
            RemoteActionCompatParcelizer(view, 1);
        }
    }

    private void onFastForward() {
        WeakReference<V> weakReference = this.RatingCompat;
        if (weakReference != null) {
            RemoteActionCompatParcelizer(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.MediaBrowserCompatMediaItem;
        if (weakReference2 != null) {
            RemoteActionCompatParcelizer(weakReference2.get(), 1);
        }
    }

    private void RemoteActionCompatParcelizer(View view, int i) {
        if (view != null) {
            read(view, i);
            if (!this.onPlay && this.MediaBrowserCompatItemReceiver != 6) {
                this.onPlayFromMediaId.put(i, IconCompatParcelizer(view, calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.bottomsheet_action_expand_halfway));
            }
            if (this.IconCompatParcelizer && this.MediaBrowserCompatItemReceiver != 5) {
                IconCompatParcelizer(view, hasSuperClassStartingWith.read.AudioAttributesImplApi26Parcelizer, 5);
            }
            int i2 = this.MediaBrowserCompatItemReceiver;
            if (i2 == 3) {
                IconCompatParcelizer(view, hasSuperClassStartingWith.read.MediaBrowserCompatItemReceiver, this.onPlay ? 4 : 6);
                return;
            }
            if (i2 == 4) {
                IconCompatParcelizer(view, hasSuperClassStartingWith.read.MediaBrowserCompatMediaItem, this.onPlay ? 3 : 6);
            } else {
                if (i2 != 6) {
                    return;
                }
                IconCompatParcelizer(view, hasSuperClassStartingWith.read.MediaBrowserCompatItemReceiver, 4);
                IconCompatParcelizer(view, hasSuperClassStartingWith.read.MediaBrowserCompatMediaItem, 3);
            }
        }
    }

    private void read(View view, int i) {
        if (view != null) {
            InvalidTypeIdException.RemoteActionCompatParcelizer(view, 524288);
            InvalidTypeIdException.RemoteActionCompatParcelizer(view, 262144);
            InvalidTypeIdException.RemoteActionCompatParcelizer(view, ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
            int i2 = this.onPlayFromMediaId.get(i, -1);
            if (i2 != -1) {
                InvalidTypeIdException.RemoteActionCompatParcelizer(view, i2);
                this.onPlayFromMediaId.delete(i);
            }
        }
    }

    private void IconCompatParcelizer(View view, hasSuperClassStartingWith.read readVar, int i) {
        InvalidTypeIdException.IconCompatParcelizer(view, readVar, null, MediaBrowserCompatCustomActionResultReceiver(i));
    }

    private int IconCompatParcelizer(View view, int i) {
        return InvalidTypeIdException.RemoteActionCompatParcelizer(view, view.getResources().getString(i), MediaBrowserCompatCustomActionResultReceiver(6));
    }

    private modifyFieldName MediaBrowserCompatCustomActionResultReceiver(final int i) {
        return new modifyFieldName() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.7
            @Override // kotlin.modifyFieldName
            public final boolean read(View view) {
                BottomSheetBehavior.this.IconCompatParcelizer(i);
                return true;
            }
        };
    }
}
