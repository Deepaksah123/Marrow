package com.google.android.material.sidesheet;

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
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.AmrExtractorExternalSyntheticLambda0;
import kotlin.AmrExtractorFlags;
import kotlin.AudioAttributesImplApi26Parcelizer;
import kotlin.AviChunk;
import kotlin.AviExtractor;
import kotlin.AviExtractorChunkHeaderHolder;
import kotlin.BinarySearchSeekerSeekOperationParams;
import kotlin.InvalidTypeIdException;
import kotlin.SeekMap;
import kotlin.StdKeyDeserializer;
import kotlin._clearIfStdImpl;
import kotlin.calculateNextSearchBytePosition;
import kotlin.call;
import kotlin.frameSizeBytesByTypeNb;
import kotlin.getApproxBytesPerFrame;
import kotlin.hasSuperClassStartingWith;
import kotlin.isValidFrameType;
import kotlin.modifyFieldName;
import kotlin.parseHdrlBody;

/* JADX INFO: loaded from: classes5.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements AmrExtractorFlags<AviExtractorChunkHeaderHolder> {
    private final Set<AviExtractorChunkHeaderHolder> AudioAttributesCompatParcelizer;
    private float AudioAttributesImplApi21Parcelizer;
    private final call.IconCompatParcelizer AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private WeakReference<View> MediaBrowserCompatItemReceiver;
    private float MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private float MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private boolean MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private int RatingCompat;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private frameSizeBytesByTypeNb onAddQueueItem;
    private int onCommand;
    private isValidFrameType onCustomAction;
    private AviExtractor onFastForward;
    private getApproxBytesPerFrame onMediaButtonEvent;
    private int onPause;
    private final SideSheetBehavior<V>.read onPlay;
    private VelocityTracker onPlayFromMediaId;
    private call onPrepare;
    private WeakReference<V> onPrepareFromMediaId;
    private ColorStateList read;
    private int write;
    private static final int RemoteActionCompatParcelizer = calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.side_sheet_accessibility_pane_title;
    private static final int IconCompatParcelizer = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_Material3_SideSheet;

    public SideSheetBehavior() {
        this.onPlay = new read();
        this.AudioAttributesImplBaseParcelizer = true;
        this.onPause = 5;
        this.MediaBrowserCompatSearchResultReceiver = 5;
        this.MediaBrowserCompatMediaItem = 0.1f;
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
        this.AudioAttributesCompatParcelizer = new LinkedHashSet();
        this.AudioAttributesImplApi26Parcelizer = new call.IconCompatParcelizer() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.5
            @Override // o.call.IconCompatParcelizer
            public final boolean read(View view, int i) {
                return (SideSheetBehavior.this.onPause == 1 || SideSheetBehavior.this.onPrepareFromMediaId == null || SideSheetBehavior.this.onPrepareFromMediaId.get() != view) ? false : true;
            }

            @Override // o.call.IconCompatParcelizer
            public final void AudioAttributesCompatParcelizer(View view, int i, int i2) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                View viewRemoteActionCompatParcelizer = SideSheetBehavior.this.RemoteActionCompatParcelizer();
                if (viewRemoteActionCompatParcelizer != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewRemoteActionCompatParcelizer.getLayoutParams()) != null) {
                    SideSheetBehavior.this.onFastForward.IconCompatParcelizer(marginLayoutParams, view.getLeft(), view.getRight());
                    viewRemoteActionCompatParcelizer.setLayoutParams(marginLayoutParams);
                }
                SideSheetBehavior.this.AudioAttributesImplApi21Parcelizer(i);
            }

            @Override // o.call.IconCompatParcelizer
            public final void IconCompatParcelizer(int i) {
                if (i == 1 && SideSheetBehavior.this.AudioAttributesImplBaseParcelizer) {
                    SideSheetBehavior.this.IconCompatParcelizer(1);
                }
            }

            @Override // o.call.IconCompatParcelizer
            public final void read(View view, float f, float f2) {
                SideSheetBehavior.this.write(view, SideSheetBehavior.this.RemoteActionCompatParcelizer(view, f, f2), true);
            }

            @Override // o.call.IconCompatParcelizer
            public final int AudioAttributesCompatParcelizer(View view, int i) {
                return view.getTop();
            }

            @Override // o.call.IconCompatParcelizer
            public final int IconCompatParcelizer(View view, int i) {
                return StdKeyDeserializer.read(i, SideSheetBehavior.this.onFastForward.AudioAttributesCompatParcelizer(), SideSheetBehavior.this.onFastForward.RemoteActionCompatParcelizer());
            }

            @Override // o.call.IconCompatParcelizer
            public final int AudioAttributesCompatParcelizer(View view) {
                return SideSheetBehavior.this.write + SideSheetBehavior.this.MediaBrowserCompatCustomActionResultReceiver();
            }
        };
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onPlay = new read();
        this.AudioAttributesImplBaseParcelizer = true;
        this.onPause = 5;
        this.MediaBrowserCompatSearchResultReceiver = 5;
        this.MediaBrowserCompatMediaItem = 0.1f;
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
        this.AudioAttributesCompatParcelizer = new LinkedHashSet();
        this.AudioAttributesImplApi26Parcelizer = new call.IconCompatParcelizer() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.5
            @Override // o.call.IconCompatParcelizer
            public final boolean read(View view, int i) {
                return (SideSheetBehavior.this.onPause == 1 || SideSheetBehavior.this.onPrepareFromMediaId == null || SideSheetBehavior.this.onPrepareFromMediaId.get() != view) ? false : true;
            }

            @Override // o.call.IconCompatParcelizer
            public final void AudioAttributesCompatParcelizer(View view, int i, int i2) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                View viewRemoteActionCompatParcelizer = SideSheetBehavior.this.RemoteActionCompatParcelizer();
                if (viewRemoteActionCompatParcelizer != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewRemoteActionCompatParcelizer.getLayoutParams()) != null) {
                    SideSheetBehavior.this.onFastForward.IconCompatParcelizer(marginLayoutParams, view.getLeft(), view.getRight());
                    viewRemoteActionCompatParcelizer.setLayoutParams(marginLayoutParams);
                }
                SideSheetBehavior.this.AudioAttributesImplApi21Parcelizer(i);
            }

            @Override // o.call.IconCompatParcelizer
            public final void IconCompatParcelizer(int i) {
                if (i == 1 && SideSheetBehavior.this.AudioAttributesImplBaseParcelizer) {
                    SideSheetBehavior.this.IconCompatParcelizer(1);
                }
            }

            @Override // o.call.IconCompatParcelizer
            public final void read(View view, float f, float f2) {
                SideSheetBehavior.this.write(view, SideSheetBehavior.this.RemoteActionCompatParcelizer(view, f, f2), true);
            }

            @Override // o.call.IconCompatParcelizer
            public final int AudioAttributesCompatParcelizer(View view, int i) {
                return view.getTop();
            }

            @Override // o.call.IconCompatParcelizer
            public final int IconCompatParcelizer(View view, int i) {
                return StdKeyDeserializer.read(i, SideSheetBehavior.this.onFastForward.AudioAttributesCompatParcelizer(), SideSheetBehavior.this.onFastForward.RemoteActionCompatParcelizer());
            }

            @Override // o.call.IconCompatParcelizer
            public final int AudioAttributesCompatParcelizer(View view) {
                return SideSheetBehavior.this.write + SideSheetBehavior.this.MediaBrowserCompatCustomActionResultReceiver();
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.SideSheetBehavior_Layout);
        if (typedArrayObtainStyledAttributes.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.SideSheetBehavior_Layout_backgroundTint)) {
            this.read = SeekMap.IconCompatParcelizer(context, typedArrayObtainStyledAttributes, calculateNextSearchBytePosition.MediaMetadataCompat.SideSheetBehavior_Layout_backgroundTint);
        }
        if (typedArrayObtainStyledAttributes.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.SideSheetBehavior_Layout_shapeAppearance)) {
            this.onCustomAction = isValidFrameType.read(context, attributeSet, 0, IconCompatParcelizer).RemoteActionCompatParcelizer();
        }
        if (typedArrayObtainStyledAttributes.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.SideSheetBehavior_Layout_coplanarSiblingViewId)) {
            MediaBrowserCompatItemReceiver(typedArrayObtainStyledAttributes.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.SideSheetBehavior_Layout_coplanarSiblingViewId, -1));
        }
        read(context);
        this.AudioAttributesImplApi21Parcelizer = typedArrayObtainStyledAttributes.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.SideSheetBehavior_Layout_android_elevation, -1.0f);
        RemoteActionCompatParcelizer(typedArrayObtainStyledAttributes.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.SideSheetBehavior_Layout_behavior_draggable, true));
        typedArrayObtainStyledAttributes.recycle();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private void RemoteActionCompatParcelizer(V v, int i) {
        AudioAttributesImplBaseParcelizer(_clearIfStdImpl.write(((CoordinatorLayout.RemoteActionCompatParcelizer) v.getLayoutParams()).write, i) == 3 ? 1 : 0);
    }

    private void AudioAttributesImplBaseParcelizer(int i) {
        AviExtractor aviExtractor = this.onFastForward;
        if (aviExtractor == null || aviExtractor.write() != i) {
            if (i == 0) {
                this.onFastForward = new AmrExtractorExternalSyntheticLambda0(this);
                if (this.onCustomAction == null || onCommand()) {
                    return;
                }
                isValidFrameType.write writeVarMediaDescriptionCompat = this.onCustomAction.MediaDescriptionCompat();
                writeVarMediaDescriptionCompat.MediaBrowserCompatCustomActionResultReceiver(BitmapDescriptorFactory.HUE_RED).read(BitmapDescriptorFactory.HUE_RED);
                write(writeVarMediaDescriptionCompat.RemoteActionCompatParcelizer());
                return;
            }
            if (i == 1) {
                this.onFastForward = new AviChunk(this);
                if (this.onCustomAction == null || MediaBrowserCompatSearchResultReceiver()) {
                    return;
                }
                isValidFrameType.write writeVarMediaDescriptionCompat2 = this.onCustomAction.MediaDescriptionCompat();
                writeVarMediaDescriptionCompat2.MediaBrowserCompatItemReceiver(BitmapDescriptorFactory.HUE_RED).write(BitmapDescriptorFactory.HUE_RED);
                write(writeVarMediaDescriptionCompat2.RemoteActionCompatParcelizer());
                return;
            }
            StringBuilder sb = new StringBuilder("Invalid sheet edge position value: ");
            sb.append(i);
            sb.append(". Must be 0 or 1.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private int MediaMetadataCompat() {
        AviExtractor aviExtractor = this.onFastForward;
        return (aviExtractor == null || aviExtractor.write() == 0) ? 5 : 3;
    }

    private boolean onCommand() {
        CoordinatorLayout.RemoteActionCompatParcelizer remoteActionCompatParcelizerMediaDescriptionCompat = MediaDescriptionCompat();
        return remoteActionCompatParcelizerMediaDescriptionCompat != null && ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizerMediaDescriptionCompat).rightMargin > 0;
    }

    private boolean MediaBrowserCompatSearchResultReceiver() {
        CoordinatorLayout.RemoteActionCompatParcelizer remoteActionCompatParcelizerMediaDescriptionCompat = MediaDescriptionCompat();
        return remoteActionCompatParcelizerMediaDescriptionCompat != null && ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizerMediaDescriptionCompat).leftMargin > 0;
    }

    private CoordinatorLayout.RemoteActionCompatParcelizer MediaDescriptionCompat() {
        V v;
        WeakReference<V> weakReference = this.onPrepareFromMediaId;
        if (weakReference == null || (v = weakReference.get()) == null || !(v.getLayoutParams() instanceof CoordinatorLayout.RemoteActionCompatParcelizer)) {
            return null;
        }
        return (CoordinatorLayout.RemoteActionCompatParcelizer) v.getLayoutParams();
    }

    private void write(isValidFrameType isvalidframetype) {
        frameSizeBytesByTypeNb framesizebytesbytypenb = this.onAddQueueItem;
        if (framesizebytesbytypenb != null) {
            framesizebytesbytypenb.setShapeAppearanceModel(isvalidframetype);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final Parcelable read(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.read(coordinatorLayout, v), (SideSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void AudioAttributesCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.read() != null) {
            super.AudioAttributesCompatParcelizer(coordinatorLayout, v, savedState.read());
        }
        int i = (savedState.RemoteActionCompatParcelizer == 1 || savedState.RemoteActionCompatParcelizer == 2) ? 5 : savedState.RemoteActionCompatParcelizer;
        this.onPause = i;
        this.MediaBrowserCompatSearchResultReceiver = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void IconCompatParcelizer(CoordinatorLayout.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        super.IconCompatParcelizer(remoteActionCompatParcelizer);
        this.onPrepareFromMediaId = null;
        this.onPrepare = null;
        this.onMediaButtonEvent = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void IconCompatParcelizer() {
        super.IconCompatParcelizer();
        this.onPrepareFromMediaId = null;
        this.onPrepare = null;
        this.onMediaButtonEvent = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean write(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int i5 = marginLayoutParams.leftMargin;
        int i6 = read(i, paddingLeft + paddingRight + i5 + marginLayoutParams.rightMargin + i2, ((ViewGroup.LayoutParams) marginLayoutParams).width);
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int i7 = marginLayoutParams.topMargin;
        v.measure(i6, read(i3, paddingTop + paddingBottom + i7 + marginLayoutParams.bottomMargin + i4, ((ViewGroup.LayoutParams) marginLayoutParams).height));
        return true;
    }

    private static int read(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean write(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(coordinatorLayout) && !InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.onPrepareFromMediaId == null) {
            this.onPrepareFromMediaId = new WeakReference<>(v);
            this.onMediaButtonEvent = new getApproxBytesPerFrame(v);
            frameSizeBytesByTypeNb framesizebytesbytypenb = this.onAddQueueItem;
            if (framesizebytesbytypenb != null) {
                InvalidTypeIdException.read(v, framesizebytesbytypenb);
                frameSizeBytesByTypeNb framesizebytesbytypenb2 = this.onAddQueueItem;
                float fAudioAttributesImplBaseParcelizer = this.AudioAttributesImplApi21Parcelizer;
                if (fAudioAttributesImplBaseParcelizer == -1.0f) {
                    fAudioAttributesImplBaseParcelizer = InvalidTypeIdException.AudioAttributesImplBaseParcelizer(v);
                }
                framesizebytesbytypenb2.handleMediaPlayPauseIfPendingOnHandler(fAudioAttributesImplBaseParcelizer);
            } else {
                ColorStateList colorStateList = this.read;
                if (colorStateList != null) {
                    InvalidTypeIdException.RemoteActionCompatParcelizer(v, colorStateList);
                }
            }
            write(v);
            onAddQueueItem();
            if (InvalidTypeIdException.MediaBrowserCompatItemReceiver(v) == 0) {
                InvalidTypeIdException.AudioAttributesImplBaseParcelizer(v, 1);
            }
            IconCompatParcelizer(v);
        }
        RemoteActionCompatParcelizer(v, i);
        if (this.onPrepare == null) {
            this.onPrepare = call.AudioAttributesCompatParcelizer(coordinatorLayout, this.AudioAttributesImplApi26Parcelizer);
        }
        int iIconCompatParcelizer = this.onFastForward.IconCompatParcelizer(v);
        coordinatorLayout.write(v, i);
        this.handleMediaPlayPauseIfPendingOnHandler = coordinatorLayout.getWidth();
        this.onCommand = this.onFastForward.AudioAttributesCompatParcelizer(coordinatorLayout);
        this.write = v.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        this.MediaMetadataCompat = marginLayoutParams != null ? this.onFastForward.RemoteActionCompatParcelizer(marginLayoutParams) : 0;
        InvalidTypeIdException.AudioAttributesCompatParcelizer(v, write(iIconCompatParcelizer, v));
        RemoteActionCompatParcelizer(coordinatorLayout);
        Iterator<AviExtractorChunkHeaderHolder> it = this.AudioAttributesCompatParcelizer.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof AviExtractorChunkHeaderHolder) {
            }
        }
        return true;
    }

    private void write(View view) {
        int i = this.onPause == 5 ? 4 : 0;
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    private static void IconCompatParcelizer(View view) {
        if (InvalidTypeIdException.read(view) == null) {
            InvalidTypeIdException.read(view, view.getResources().getString(RemoteActionCompatParcelizer));
        }
    }

    private void RemoteActionCompatParcelizer(CoordinatorLayout coordinatorLayout) {
        int i;
        View viewFindViewById;
        if (this.MediaBrowserCompatItemReceiver != null || (i = this.MediaBrowserCompatCustomActionResultReceiver) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i)) == null) {
            return;
        }
        this.MediaBrowserCompatItemReceiver = new WeakReference<>(viewFindViewById);
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final int MediaBrowserCompatItemReceiver() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        return this.onCommand;
    }

    public final int MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaMetadataCompat;
    }

    private int write(int i, V v) {
        int i2 = this.onPause;
        if (i2 == 1 || i2 == 2) {
            return i - this.onFastForward.IconCompatParcelizer(v);
        }
        if (i2 == 3) {
            return 0;
        }
        if (i2 == 5) {
            return this.onFastForward.IconCompatParcelizer();
        }
        StringBuilder sb = new StringBuilder("Unexpected value: ");
        sb.append(this.onPause);
        throw new IllegalStateException(sb.toString());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean read(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        call callVar;
        if (!AudioAttributesCompatParcelizer(v)) {
            this.MediaDescriptionCompat = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            onCustomAction();
        }
        if (this.onPlayFromMediaId == null) {
            this.onPlayFromMediaId = VelocityTracker.obtain();
        }
        this.onPlayFromMediaId.addMovement(motionEvent);
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && this.MediaDescriptionCompat) {
                this.MediaDescriptionCompat = false;
                return false;
            }
        } else {
            this.RatingCompat = (int) motionEvent.getX();
        }
        return (this.MediaDescriptionCompat || (callVar = this.onPrepare) == null || !callVar.read(motionEvent)) ? false : true;
    }

    private boolean AudioAttributesCompatParcelizer(V v) {
        return (v.isShown() || InvalidTypeIdException.read(v) != null) && this.AudioAttributesImplBaseParcelizer;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean AudioAttributesCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.onPause == 1 && actionMasked == 0) {
            return true;
        }
        if (handleMediaPlayPauseIfPendingOnHandler()) {
            this.onPrepare.IconCompatParcelizer(motionEvent);
        }
        if (actionMasked == 0) {
            onCustomAction();
        }
        if (this.onPlayFromMediaId == null) {
            this.onPlayFromMediaId = VelocityTracker.obtain();
        }
        this.onPlayFromMediaId.addMovement(motionEvent);
        if (handleMediaPlayPauseIfPendingOnHandler() && actionMasked == 2 && !this.MediaDescriptionCompat && read(motionEvent)) {
            this.onPrepare.read(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.MediaDescriptionCompat;
    }

    private boolean read(MotionEvent motionEvent) {
        return handleMediaPlayPauseIfPendingOnHandler() && AudioAttributesCompatParcelizer((float) this.RatingCompat, motionEvent.getX()) > ((float) this.onPrepare.AudioAttributesImplBaseParcelizer());
    }

    private static float AudioAttributesCompatParcelizer(float f, float f2) {
        return Math.abs(f - f2);
    }

    private int onMediaButtonEvent() {
        return this.onFastForward.read();
    }

    private void RemoteActionCompatParcelizer(boolean z) {
        this.AudioAttributesImplBaseParcelizer = z;
    }

    public final float AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.AmrExtractorFlags
    public void read(AviExtractorChunkHeaderHolder aviExtractorChunkHeaderHolder) {
        this.AudioAttributesCompatParcelizer.add(aviExtractorChunkHeaderHolder);
    }

    @Override // kotlin.AmrExtractorFlags
    public final void AudioAttributesCompatParcelizer(final int i) {
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference<V> weakReference = this.onPrepareFromMediaId;
        if (weakReference == null || weakReference.get() == null) {
            IconCompatParcelizer(i);
        } else {
            IconCompatParcelizer(this.onPrepareFromMediaId.get(), new Runnable() { // from class: o.processStreamList
                @Override // java.lang.Runnable
                public final void run() {
                    this.write.write(i);
                }
            });
        }
    }

    public final /* synthetic */ void write(int i) {
        V v = this.onPrepareFromMediaId.get();
        if (v != null) {
            write((View) v, i, false);
        }
    }

    private static void IconCompatParcelizer(V v, Runnable runnable) {
        if (RemoteActionCompatParcelizer(v)) {
            v.post(runnable);
        } else {
            runnable.run();
        }
    }

    private static boolean RemoteActionCompatParcelizer(V v) {
        ViewParent parent = v.getParent();
        return parent != null && parent.isLayoutRequested() && InvalidTypeIdException.onPlayFromSearch(v);
    }

    @Override // kotlin.AmrExtractorFlags
    public final int write() {
        return this.onPause;
    }

    final void IconCompatParcelizer(int i) {
        V v;
        if (this.onPause != i) {
            this.onPause = i;
            if (i == 3 || i == 5) {
                this.MediaBrowserCompatSearchResultReceiver = i;
            }
            WeakReference<V> weakReference = this.onPrepareFromMediaId;
            if (weakReference == null || (v = weakReference.get()) == null) {
                return;
            }
            write(v);
            Iterator<AviExtractorChunkHeaderHolder> it = this.AudioAttributesCompatParcelizer.iterator();
            while (it.hasNext()) {
                it.next().read(i);
            }
            onAddQueueItem();
        }
    }

    private void onCustomAction() {
        VelocityTracker velocityTracker = this.onPlayFromMediaId;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.onPlayFromMediaId = null;
        }
    }

    private boolean AudioAttributesCompatParcelizer(View view, float f) {
        return this.onFastForward.RemoteActionCompatParcelizer(view, f);
    }

    private boolean handleMediaPlayPauseIfPendingOnHandler() {
        if (this.onPrepare != null) {
            return this.AudioAttributesImplBaseParcelizer || this.onPause == 1;
        }
        return false;
    }

    private void read(Context context) {
        if (this.onCustomAction == null) {
            return;
        }
        frameSizeBytesByTypeNb framesizebytesbytypenb = new frameSizeBytesByTypeNb(this.onCustomAction);
        this.onAddQueueItem = framesizebytesbytypenb;
        framesizebytesbytypenb.RemoteActionCompatParcelizer(context);
        ColorStateList colorStateList = this.read;
        if (colorStateList != null) {
            this.onAddQueueItem.AudioAttributesImplApi21Parcelizer(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.onAddQueueItem.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(View view, int i, boolean z) {
        if (AudioAttributesCompatParcelizer(view, i, z)) {
            IconCompatParcelizer(2);
            this.onPlay.write(i);
        } else {
            IconCompatParcelizer(i);
        }
    }

    private boolean AudioAttributesCompatParcelizer(View view, int i, boolean z) {
        int iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(i);
        call callVarOnPause = onPause();
        if (callVarOnPause != null) {
            return z ? callVarOnPause.RemoteActionCompatParcelizer(iAudioAttributesImplApi26Parcelizer, view.getTop()) : callVarOnPause.AudioAttributesCompatParcelizer(view, iAudioAttributesImplApi26Parcelizer, view.getTop());
        }
        return false;
    }

    private int AudioAttributesImplApi26Parcelizer(int i) {
        if (i == 3) {
            return onMediaButtonEvent();
        }
        if (i == 5) {
            return this.onFastForward.IconCompatParcelizer();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: ".concat(String.valueOf(i)));
    }

    private call onPause() {
        return this.onPrepare;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int RemoteActionCompatParcelizer(View view, float f, float f2) {
        if (write(f)) {
            return 3;
        }
        if (AudioAttributesCompatParcelizer(view, f)) {
            return (this.onFastForward.read(f, f2) || this.onFastForward.AudioAttributesCompatParcelizer(view)) ? 5 : 3;
        }
        if (f != BitmapDescriptorFactory.HUE_RED && parseHdrlBody.read(f, f2)) {
            return 5;
        }
        int left = view.getLeft();
        return Math.abs(left - onMediaButtonEvent()) < Math.abs(left - this.onFastForward.IconCompatParcelizer()) ? 3 : 5;
    }

    private boolean write(float f) {
        return this.onFastForward.AudioAttributesCompatParcelizer(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesImplApi21Parcelizer(int i) {
        if (this.AudioAttributesCompatParcelizer.isEmpty()) {
            return;
        }
        this.onFastForward.write(i);
        for (AviExtractorChunkHeaderHolder aviExtractorChunkHeaderHolder : this.AudioAttributesCompatParcelizer) {
        }
    }

    private void MediaBrowserCompatItemReceiver(int i) {
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        MediaBrowserCompatMediaItem();
        WeakReference<V> weakReference = this.onPrepareFromMediaId;
        if (weakReference != null) {
            V v = weakReference.get();
            if (i == -1 || !InvalidTypeIdException.onSeekTo(v)) {
                return;
            }
            v.requestLayout();
        }
    }

    public final View RemoteActionCompatParcelizer() {
        WeakReference<View> weakReference = this.MediaBrowserCompatItemReceiver;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private void MediaBrowserCompatMediaItem() {
        WeakReference<View> weakReference = this.MediaBrowserCompatItemReceiver;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.MediaBrowserCompatItemReceiver = null;
    }

    @Override // kotlin.readStreamInfoBlock
    public final void RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
        getApproxBytesPerFrame getapproxbytesperframe = this.onMediaButtonEvent;
        if (getapproxbytesperframe == null) {
            return;
        }
        getapproxbytesperframe.IconCompatParcelizer(audioAttributesImplApi26Parcelizer);
    }

    @Override // kotlin.readStreamInfoBlock
    public final void write(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
        getApproxBytesPerFrame getapproxbytesperframe = this.onMediaButtonEvent;
        if (getapproxbytesperframe == null) {
            return;
        }
        getapproxbytesperframe.IconCompatParcelizer(audioAttributesImplApi26Parcelizer, MediaMetadataCompat());
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference<V> weakReference = this.onPrepareFromMediaId;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        V v = this.onPrepareFromMediaId.get();
        View viewRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (viewRemoteActionCompatParcelizer == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewRemoteActionCompatParcelizer.getLayoutParams()) == null) {
            return;
        }
        this.onFastForward.write(marginLayoutParams, (int) ((this.write * v.getScaleX()) + this.MediaMetadataCompat));
        viewRemoteActionCompatParcelizer.requestLayout();
    }

    @Override // kotlin.readStreamInfoBlock
    public final void AudioAttributesImplApi21Parcelizer() {
        getApproxBytesPerFrame getapproxbytesperframe = this.onMediaButtonEvent;
        if (getapproxbytesperframe == null) {
            return;
        }
        AudioAttributesImplApi26Parcelizer audioAttributesImplApi26ParcelizerIconCompatParcelizer = getapproxbytesperframe.IconCompatParcelizer();
        if (audioAttributesImplApi26ParcelizerIconCompatParcelizer == null || Build.VERSION.SDK_INT < 34) {
            AudioAttributesCompatParcelizer(5);
        } else {
            this.onMediaButtonEvent.write(audioAttributesImplApi26ParcelizerIconCompatParcelizer, MediaMetadataCompat(), new AnimatorListenerAdapter() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.4
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    SideSheetBehavior.this.IconCompatParcelizer(5);
                    if (SideSheetBehavior.this.onPrepareFromMediaId == null || SideSheetBehavior.this.onPrepareFromMediaId.get() == null) {
                        return;
                    }
                    ((View) SideSheetBehavior.this.onPrepareFromMediaId.get()).requestLayout();
                }
            }, RatingCompat());
        }
    }

    private ValueAnimator.AnimatorUpdateListener RatingCompat() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View viewRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (viewRemoteActionCompatParcelizer == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewRemoteActionCompatParcelizer.getLayoutParams()) == null) {
            return null;
        }
        final int i = this.onFastForward.read(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: o.resolvePendingReposition
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.IconCompatParcelizer.read(marginLayoutParams, i, viewRemoteActionCompatParcelizer, valueAnimator);
            }
        };
    }

    public final /* synthetic */ void read(ViewGroup.MarginLayoutParams marginLayoutParams, int i, View view, ValueAnimator valueAnimator) {
        this.onFastForward.write(marginLayoutParams, BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(i, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    @Override // kotlin.readStreamInfoBlock
    public final void read() {
        getApproxBytesPerFrame getapproxbytesperframe = this.onMediaButtonEvent;
        if (getapproxbytesperframe == null) {
            return;
        }
        getapproxbytesperframe.write();
    }

    public class read {
        private final Runnable AudioAttributesCompatParcelizer = new Runnable() { // from class: o.AviExtractor1
            @Override // java.lang.Runnable
            public final void run() {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
            }
        };
        private int read;
        private boolean write;

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer() {
            this.write = false;
            if (SideSheetBehavior.this.onPrepare == null || !SideSheetBehavior.this.onPrepare.IconCompatParcelizer()) {
                if (SideSheetBehavior.this.onPause == 2) {
                    SideSheetBehavior.this.IconCompatParcelizer(this.read);
                    return;
                }
                return;
            }
            write(this.read);
        }

        final void write(int i) {
            if (SideSheetBehavior.this.onPrepareFromMediaId == null || SideSheetBehavior.this.onPrepareFromMediaId.get() == null) {
                return;
            }
            this.read = i;
            if (this.write) {
                return;
            }
            InvalidTypeIdException.AudioAttributesCompatParcelizer((View) SideSheetBehavior.this.onPrepareFromMediaId.get(), this.AudioAttributesCompatParcelizer);
            this.write = true;
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.SavedState.5
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return IconCompatParcelizer(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return RemoteActionCompatParcelizer(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return RemoteActionCompatParcelizer(i);
            }

            private static SavedState RemoteActionCompatParcelizer(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            private static SavedState IconCompatParcelizer(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            private static SavedState[] RemoteActionCompatParcelizer(int i) {
                return new SavedState[i];
            }
        };
        final int RemoteActionCompatParcelizer;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.RemoteActionCompatParcelizer = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.RemoteActionCompatParcelizer = ((SideSheetBehavior) sideSheetBehavior).onPause;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.RemoteActionCompatParcelizer);
        }
    }

    public static <V extends View> SideSheetBehavior<V> read(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.RemoteActionCompatParcelizer)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behaviorWrite = ((CoordinatorLayout.RemoteActionCompatParcelizer) layoutParams).write();
        if (!(behaviorWrite instanceof SideSheetBehavior)) {
            throw new IllegalArgumentException("The view is not associated with SideSheetBehavior");
        }
        return (SideSheetBehavior) behaviorWrite;
    }

    private void onAddQueueItem() {
        V v;
        WeakReference<V> weakReference = this.onPrepareFromMediaId;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        InvalidTypeIdException.RemoteActionCompatParcelizer((View) v, 262144);
        InvalidTypeIdException.RemoteActionCompatParcelizer((View) v, ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        if (this.onPause != 5) {
            AudioAttributesCompatParcelizer(v, hasSuperClassStartingWith.read.AudioAttributesImplApi26Parcelizer, 5);
        }
        if (this.onPause != 3) {
            AudioAttributesCompatParcelizer(v, hasSuperClassStartingWith.read.MediaBrowserCompatMediaItem, 3);
        }
    }

    private void AudioAttributesCompatParcelizer(V v, hasSuperClassStartingWith.read readVar, int i) {
        InvalidTypeIdException.IconCompatParcelizer(v, readVar, null, read(i));
    }

    private modifyFieldName read(final int i) {
        return new modifyFieldName() { // from class: o.peekSeekOffset
            @Override // kotlin.modifyFieldName
            public final boolean read(View view) {
                return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i);
            }
        };
    }

    public final /* synthetic */ boolean RemoteActionCompatParcelizer(int i) {
        AudioAttributesCompatParcelizer(i);
        return true;
    }
}
