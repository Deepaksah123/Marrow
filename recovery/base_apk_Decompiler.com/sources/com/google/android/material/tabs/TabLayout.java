package com.google.android.material.tabs;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.BinarySearchSeekerSeekOperationParams;
import kotlin.BinarySearchSeekerTimestampSeeker;
import kotlin.ChunkReader;
import kotlin.DefaultExtractorsFactoryExtensionLoader;
import kotlin.InvalidTypeIdException;
import kotlin.SeekMap;
import kotlin._addSuperTypes;
import kotlin._init_lambda5;
import kotlin.advanceCurrentChunk;
import kotlin.calculateNextSearchBytePosition;
import kotlin.checkAndPeekStreamMarker;
import kotlin.childObject;
import kotlin.findFormatOverrides;
import kotlin.frameSizeBytesByTypeNb;
import kotlin.getChunkTimestampUs;
import kotlin.getComponentEnabledSetting;
import kotlin.getConstantBitrateSeekMap;
import kotlin.getDefaultViewModelCreationExtras;
import kotlin.getSampleRateLookupKey;
import kotlin.hasSuperClassStartingWith;
import kotlin.outputPendingSampleMetadata;
import kotlin.readFrames;
import kotlin.readId3Metadata;
import kotlin.rewrapCtorProblem;

/* JADX INFO: loaded from: classes.dex */
@ViewPager.write
public class TabLayout extends HorizontalScrollView {
    private static final int onFastForward = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_Design_TabLayout;
    private static final rewrapCtorProblem.IconCompatParcelizer<MediaBrowserCompatCustomActionResultReceiver> onPause = new rewrapCtorProblem.read(16);
    final int AudioAttributesCompatParcelizer;
    int AudioAttributesImplApi21Parcelizer;
    ColorStateList AudioAttributesImplApi26Parcelizer;
    int AudioAttributesImplBaseParcelizer;
    boolean IconCompatParcelizer;
    PorterDuff.Mode MediaBrowserCompatCustomActionResultReceiver;
    int MediaBrowserCompatItemReceiver;
    Drawable MediaBrowserCompatMediaItem;
    int MediaBrowserCompatSearchResultReceiver;
    float MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    int MediaDescriptionCompat;
    ColorStateList MediaMetadataCompat;
    private int MediaSessionCompatQueueItem;
    private final rewrapCtorProblem.IconCompatParcelizer<TabView> MediaSessionCompatResultReceiverWrapper;
    private final TimeInterpolator MediaSessionCompatToken;
    private final int ParcelableVolumeInfo;
    private final ArrayList<MediaBrowserCompatCustomActionResultReceiver> PlaybackStateCompat;
    private int PlaybackStateCompatCustomAction;
    int RatingCompat;
    int RemoteActionCompatParcelizer;
    float handleMediaPlayPauseIfPendingOnHandler;
    boolean onAddQueueItem;
    ColorStateList onCommand;
    ViewPager onCustomAction;
    private int onMediaButtonEvent;
    private IconCompatParcelizer onPlay;
    private RemoteActionCompatParcelizer onPlayFromMediaId;
    private getComponentEnabledSetting onPlayFromSearch;
    private MediaBrowserCompatItemReceiver onPlayFromUri;
    private final int onPrepare;
    private final int onPrepareFromMediaId;
    private DataSetObserver onPrepareFromSearch;
    private ValueAnimator onPrepareFromUri;
    private final ArrayList<RemoteActionCompatParcelizer> onRemoveQueueItem;
    private final int onRemoveQueueItemAt;
    private RemoteActionCompatParcelizer onRewind;
    private final int onSeekTo;
    private read onSetCaptioningEnabled;
    private float onSetPlaybackSpeed;
    private boolean onSetRating;
    private int onSetRepeatMode;
    private MediaBrowserCompatCustomActionResultReceiver onSetShuffleMode;
    private int onSkipToNext;
    private boolean onSkipToPrevious;
    private int onSkipToQueueItem;
    private advanceCurrentChunk onStop;
    int read;
    private int setSessionImpl;
    int write;

    public interface AudioAttributesCompatParcelizer extends RemoteActionCompatParcelizer<MediaBrowserCompatCustomActionResultReceiver> {
    }

    @Deprecated
    public interface RemoteActionCompatParcelizer<T extends MediaBrowserCompatCustomActionResultReceiver> {
        void IconCompatParcelizer(T t);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateLayoutParams(attributeSet);
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.tabStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        int i2 = onFastForward;
        super(readFrames.IconCompatParcelizer(context, attributeSet, i, i2), attributeSet, i);
        this.read = -1;
        this.PlaybackStateCompat = new ArrayList<>();
        this.onSetRepeatMode = -1;
        this.MediaSessionCompatQueueItem = 0;
        this.AudioAttributesImplApi21Parcelizer = Integer.MAX_VALUE;
        this.setSessionImpl = -1;
        this.onRemoveQueueItem = new ArrayList<>();
        this.MediaSessionCompatResultReceiverWrapper = new rewrapCtorProblem.AudioAttributesCompatParcelizer(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        read readVar = new read(context2);
        this.onSetCaptioningEnabled = readVar;
        super.addView(readVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayWrite = readId3Metadata.write(context2, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout, i, i2, calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabTextAppearance);
        ColorStateList colorStateListIconCompatParcelizer = DefaultExtractorsFactoryExtensionLoader.IconCompatParcelizer(getBackground());
        if (colorStateListIconCompatParcelizer != null) {
            frameSizeBytesByTypeNb framesizebytesbytypenb = new frameSizeBytesByTypeNb();
            framesizebytesbytypenb.AudioAttributesImplApi21Parcelizer(colorStateListIconCompatParcelizer);
            framesizebytesbytypenb.RemoteActionCompatParcelizer(context2);
            framesizebytesbytypenb.handleMediaPlayPauseIfPendingOnHandler(InvalidTypeIdException.AudioAttributesImplBaseParcelizer(this));
            InvalidTypeIdException.read(this, framesizebytesbytypenb);
        }
        setSelectedTabIndicator(SeekMap.RemoteActionCompatParcelizer(context2, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabIndicator));
        setSelectedTabIndicatorColor(typedArrayWrite.getColor(calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabIndicatorColor, 0));
        readVar.IconCompatParcelizer(typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabIndicatorHeight, -1));
        setSelectedTabIndicatorGravity(typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorAnimationMode(typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabIndicatorAnimationMode, 0));
        setTabIndicatorFullWidth(typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabPadding, 0);
        this.MediaBrowserCompatItemReceiver = dimensionPixelSize;
        this.RatingCompat = dimensionPixelSize;
        this.MediaBrowserCompatSearchResultReceiver = dimensionPixelSize;
        this.MediaDescriptionCompat = dimensionPixelSize;
        this.MediaDescriptionCompat = typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabPaddingStart, this.MediaDescriptionCompat);
        this.MediaBrowserCompatSearchResultReceiver = typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabPaddingTop, this.MediaBrowserCompatSearchResultReceiver);
        this.RatingCompat = typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabPaddingEnd, this.RatingCompat);
        this.MediaBrowserCompatItemReceiver = typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabPaddingBottom, this.MediaBrowserCompatItemReceiver);
        if (readId3Metadata.write(context2)) {
            this.onPrepare = calculateNextSearchBytePosition.IconCompatParcelizer.textAppearanceTitleSmall;
        } else {
            this.onPrepare = calculateNextSearchBytePosition.IconCompatParcelizer.textAppearanceButton;
        }
        int resourceId = typedArrayWrite.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabTextAppearance, calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.TextAppearance_Design_Tab);
        this.ParcelableVolumeInfo = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, _init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance);
        try {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = typedArrayObtainStyledAttributes.getDimensionPixelSize(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_android_textSize, 0);
            this.onCommand = SeekMap.IconCompatParcelizer(context2, typedArrayObtainStyledAttributes, _init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_android_textColor);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabSelectedTextAppearance)) {
                this.onSetRepeatMode = typedArrayWrite.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabSelectedTextAppearance, resourceId);
            }
            int i3 = this.onSetRepeatMode;
            if (i3 != -1) {
                typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(i3, _init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance);
                try {
                    this.onSetPlaybackSpeed = typedArrayObtainStyledAttributes.getDimensionPixelSize(_init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_android_textSize, (int) this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                    ColorStateList colorStateListIconCompatParcelizer2 = SeekMap.IconCompatParcelizer(context2, typedArrayObtainStyledAttributes, _init_lambda5.AudioAttributesImplApi26Parcelizer.TextAppearance_android_textColor);
                    if (colorStateListIconCompatParcelizer2 != null) {
                        this.onCommand = read(this.onCommand.getDefaultColor(), colorStateListIconCompatParcelizer2.getColorForState(new int[]{R.attr.state_selected}, colorStateListIconCompatParcelizer2.getDefaultColor()));
                    }
                } finally {
                }
            }
            if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabTextColor)) {
                this.onCommand = SeekMap.IconCompatParcelizer(context2, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabTextColor);
            }
            if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabSelectedTextColor)) {
                this.onCommand = read(this.onCommand.getDefaultColor(), typedArrayWrite.getColor(calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabSelectedTextColor, 0));
            }
            this.AudioAttributesImplApi26Parcelizer = SeekMap.IconCompatParcelizer(context2, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabIconTint);
            this.MediaBrowserCompatCustomActionResultReceiver = checkAndPeekStreamMarker.RemoteActionCompatParcelizer(typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabIconTintMode, -1), (PorterDuff.Mode) null);
            this.MediaMetadataCompat = SeekMap.IconCompatParcelizer(context2, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabRippleColor);
            this.onSkipToNext = typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabIndicatorAnimationDuration, 300);
            this.MediaSessionCompatToken = getSampleRateLookupKey.read(context2, calculateNextSearchBytePosition.IconCompatParcelizer.motionEasingEmphasizedInterpolator, BinarySearchSeekerSeekOperationParams.AudioAttributesCompatParcelizer);
            this.onSeekTo = typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabMinWidth, -1);
            this.onPrepareFromMediaId = typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabMaxWidth, -1);
            this.AudioAttributesCompatParcelizer = typedArrayWrite.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabBackground, 0);
            this.onMediaButtonEvent = typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabContentStart, 0);
            this.write = typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabMode, 1);
            this.RemoteActionCompatParcelizer = typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabGravity, 0);
            this.IconCompatParcelizer = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabInlineLabel, false);
            this.onAddQueueItem = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.TabLayout_tabUnboundedRipple, false);
            typedArrayWrite.recycle();
            Resources resources = getResources();
            this.handleMediaPlayPauseIfPendingOnHandler = resources.getDimensionPixelSize(calculateNextSearchBytePosition.write.design_tab_text_size_2line);
            this.onRemoveQueueItemAt = resources.getDimensionPixelSize(calculateNextSearchBytePosition.write.design_tab_scrollable_min_width);
            AudioAttributesImplBaseParcelizer();
        } finally {
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.MediaSessionCompatQueueItem = i;
        DefaultExtractorsFactoryExtensionLoader.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, i);
        RemoteActionCompatParcelizer(false);
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.setSessionImpl = i;
        this.onSetCaptioningEnabled.IconCompatParcelizer(i);
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        AudioAttributesCompatParcelizer(i, f, z, z2, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void AudioAttributesCompatParcelizer(int r6, float r7, boolean r8, boolean r9, boolean r10) {
        /*
            r5 = this;
            float r0 = (float) r6
            float r0 = r0 + r7
            int r0 = java.lang.Math.round(r0)
            if (r0 < 0) goto L79
            com.google.android.material.tabs.TabLayout$read r1 = r5.onSetCaptioningEnabled
            int r1 = r1.getChildCount()
            if (r0 >= r1) goto L79
            if (r9 == 0) goto L17
            com.google.android.material.tabs.TabLayout$read r9 = r5.onSetCaptioningEnabled
            r9.read(r6, r7)
        L17:
            android.animation.ValueAnimator r9 = r5.onPrepareFromUri
            if (r9 == 0) goto L26
            boolean r9 = r9.isRunning()
            if (r9 == 0) goto L26
            android.animation.ValueAnimator r9 = r5.onPrepareFromUri
            r9.cancel()
        L26:
            int r7 = r5.AudioAttributesCompatParcelizer(r6, r7)
            int r9 = r5.getScrollX()
            int r1 = r5.AudioAttributesCompatParcelizer()
            r2 = 0
            r3 = 1
            if (r6 >= r1) goto L38
            if (r7 >= r9) goto L46
        L38:
            int r1 = r5.AudioAttributesCompatParcelizer()
            if (r6 <= r1) goto L40
            if (r7 <= r9) goto L46
        L40:
            int r1 = r5.AudioAttributesCompatParcelizer()
            if (r6 != r1) goto L48
        L46:
            r1 = r3
            goto L49
        L48:
            r1 = r2
        L49:
            int r4 = kotlin.InvalidTypeIdException.MediaBrowserCompatMediaItem(r5)
            if (r4 != r3) goto L66
            int r1 = r5.AudioAttributesCompatParcelizer()
            if (r6 >= r1) goto L57
            if (r7 <= r9) goto L6e
        L57:
            int r1 = r5.AudioAttributesCompatParcelizer()
            if (r6 <= r1) goto L5f
            if (r7 >= r9) goto L6e
        L5f:
            int r9 = r5.AudioAttributesCompatParcelizer()
            if (r6 != r9) goto L68
            goto L6e
        L66:
            if (r1 != 0) goto L6e
        L68:
            int r9 = r5.PlaybackStateCompatCustomAction
            if (r9 == r3) goto L6e
            if (r10 == 0) goto L74
        L6e:
            if (r6 >= 0) goto L71
            r7 = r2
        L71:
            r5.scrollTo(r7, r2)
        L74:
            if (r8 == 0) goto L79
            r5.AudioAttributesImplApi21Parcelizer(r0)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.AudioAttributesCompatParcelizer(int, float, boolean, boolean, boolean):void");
    }

    public final void write(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
        AudioAttributesCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver, this.PlaybackStateCompat.isEmpty());
    }

    public final void AudioAttributesCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver, boolean z) {
        AudioAttributesCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver, this.PlaybackStateCompat.size(), z);
    }

    private void AudioAttributesCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver, int i, boolean z) {
        if (mediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        read(mediaBrowserCompatCustomActionResultReceiver, i);
        AudioAttributesCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver);
        if (z) {
            mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer();
        }
    }

    private void write(TabItem tabItem) {
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiverAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        if (tabItem.IconCompatParcelizer != null) {
            mediaBrowserCompatCustomActionResultReceiverAudioAttributesImplApi21Parcelizer.write(tabItem.IconCompatParcelizer);
        }
        if (tabItem.RemoteActionCompatParcelizer != null) {
            mediaBrowserCompatCustomActionResultReceiverAudioAttributesImplApi21Parcelizer.read(tabItem.RemoteActionCompatParcelizer);
        }
        if (tabItem.write != 0) {
            mediaBrowserCompatCustomActionResultReceiverAudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(tabItem.write);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            mediaBrowserCompatCustomActionResultReceiverAudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(tabItem.getContentDescription());
        }
        write(mediaBrowserCompatCustomActionResultReceiverAudioAttributesImplApi21Parcelizer);
    }

    private boolean onCommand() {
        return onCustomAction() == 0 || onCustomAction() == 2;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onCommand() && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || onCommand()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Deprecated
    public void setOnTabSelectedListener(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        setOnTabSelectedListener((RemoteActionCompatParcelizer) audioAttributesCompatParcelizer);
    }

    @Deprecated
    public void setOnTabSelectedListener(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.onRewind;
        if (remoteActionCompatParcelizer2 != null) {
            write(remoteActionCompatParcelizer2);
        }
        this.onRewind = remoteActionCompatParcelizer;
        if (remoteActionCompatParcelizer != null) {
            AudioAttributesCompatParcelizer(remoteActionCompatParcelizer);
        }
    }

    public final void write(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer);
    }

    @Deprecated
    private void AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (this.onRemoveQueueItem.contains(remoteActionCompatParcelizer)) {
            return;
        }
        this.onRemoveQueueItem.add(remoteActionCompatParcelizer);
    }

    public final void read(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        write((RemoteActionCompatParcelizer) audioAttributesCompatParcelizer);
    }

    @Deprecated
    private void write(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.onRemoveQueueItem.remove(remoteActionCompatParcelizer);
    }

    public final MediaBrowserCompatCustomActionResultReceiver AudioAttributesImplApi21Parcelizer() {
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiverOnAddQueueItem = onAddQueueItem();
        mediaBrowserCompatCustomActionResultReceiverOnAddQueueItem.AudioAttributesCompatParcelizer = this;
        mediaBrowserCompatCustomActionResultReceiverOnAddQueueItem.write = read(mediaBrowserCompatCustomActionResultReceiverOnAddQueueItem);
        if (mediaBrowserCompatCustomActionResultReceiverOnAddQueueItem.MediaBrowserCompatCustomActionResultReceiver != -1) {
            mediaBrowserCompatCustomActionResultReceiverOnAddQueueItem.write.setId(mediaBrowserCompatCustomActionResultReceiverOnAddQueueItem.MediaBrowserCompatCustomActionResultReceiver);
        }
        return mediaBrowserCompatCustomActionResultReceiverOnAddQueueItem;
    }

    private static MediaBrowserCompatCustomActionResultReceiver onAddQueueItem() {
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiverRemoteActionCompatParcelizer = onPause.RemoteActionCompatParcelizer();
        return mediaBrowserCompatCustomActionResultReceiverRemoteActionCompatParcelizer == null ? new MediaBrowserCompatCustomActionResultReceiver() : mediaBrowserCompatCustomActionResultReceiverRemoteActionCompatParcelizer;
    }

    private static boolean AudioAttributesImplApi26Parcelizer(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
        return onPause.RemoteActionCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver);
    }

    public final int write() {
        return this.PlaybackStateCompat.size();
    }

    public final MediaBrowserCompatCustomActionResultReceiver AudioAttributesCompatParcelizer(int i) {
        if (i < 0 || i >= write()) {
            return null;
        }
        return this.PlaybackStateCompat.get(i);
    }

    public final int AudioAttributesCompatParcelizer() {
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.onSetShuffleMode;
        if (mediaBrowserCompatCustomActionResultReceiver != null) {
            return mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer();
        }
        return -1;
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        for (int childCount = this.onSetCaptioningEnabled.getChildCount() - 1; childCount >= 0; childCount--) {
            RemoteActionCompatParcelizer(childCount);
        }
        Iterator<MediaBrowserCompatCustomActionResultReceiver> it = this.PlaybackStateCompat.iterator();
        while (it.hasNext()) {
            MediaBrowserCompatCustomActionResultReceiver next = it.next();
            it.remove();
            next.AudioAttributesImplApi21Parcelizer();
            AudioAttributesImplApi26Parcelizer(next);
        }
        this.onSetShuffleMode = null;
    }

    public void setTabMode(int i) {
        if (i != this.write) {
            this.write = i;
            AudioAttributesImplBaseParcelizer();
        }
    }

    private int onCustomAction() {
        return this.write;
    }

    public void setTabGravity(int i) {
        if (this.RemoteActionCompatParcelizer != i) {
            this.RemoteActionCompatParcelizer = i;
            AudioAttributesImplBaseParcelizer();
        }
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.AudioAttributesImplBaseParcelizer != i) {
            this.AudioAttributesImplBaseParcelizer = i;
            InvalidTypeIdException.onRemoveQueueItem(this.onSetCaptioningEnabled);
        }
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.onSkipToQueueItem = i;
        if (i == 0) {
            this.onStop = new advanceCurrentChunk();
            return;
        }
        if (i == 1) {
            this.onStop = new getChunkTimestampUs();
        } else {
            if (i == 2) {
                this.onStop = new ChunkReader();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(" is not a valid TabIndicatorAnimationMode");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.onSkipToPrevious = z;
        this.onSetCaptioningEnabled.write();
        InvalidTypeIdException.onRemoveQueueItem(this.onSetCaptioningEnabled);
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.onSkipToPrevious;
    }

    public void setInlineLabel(boolean z) {
        if (this.IconCompatParcelizer != z) {
            this.IconCompatParcelizer = z;
            for (int i = 0; i < this.onSetCaptioningEnabled.getChildCount(); i++) {
                View childAt = this.onSetCaptioningEnabled.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).read();
                }
            }
            AudioAttributesImplBaseParcelizer();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    public void setUnboundedRipple(boolean z) {
        if (this.onAddQueueItem != z) {
            this.onAddQueueItem = z;
            for (int i = 0; i < this.onSetCaptioningEnabled.getChildCount(); i++) {
                View childAt = this.onSetCaptioningEnabled.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).AudioAttributesCompatParcelizer(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.onCommand != colorStateList) {
            this.onCommand = colorStateList;
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(read(i, i2));
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.AudioAttributesImplApi26Parcelizer != colorStateList) {
            this.AudioAttributesImplApi26Parcelizer = colorStateList;
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(getDefaultViewModelCreationExtras.IconCompatParcelizer(getContext(), i));
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.MediaMetadataCompat != colorStateList) {
            this.MediaMetadataCompat = colorStateList;
            for (int i = 0; i < this.onSetCaptioningEnabled.getChildCount(); i++) {
                View childAt = this.onSetCaptioningEnabled.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).AudioAttributesCompatParcelizer(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(getDefaultViewModelCreationExtras.IconCompatParcelizer(getContext(), i));
    }

    public final Drawable read() {
        return this.MediaBrowserCompatMediaItem;
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = findFormatOverrides.AudioAttributesImplApi26Parcelizer(drawable).mutate();
        this.MediaBrowserCompatMediaItem = drawableMutate;
        DefaultExtractorsFactoryExtensionLoader.RemoteActionCompatParcelizer(drawableMutate, this.MediaSessionCompatQueueItem);
        int intrinsicHeight = this.setSessionImpl;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.MediaBrowserCompatMediaItem.getIntrinsicHeight();
        }
        this.onSetCaptioningEnabled.IconCompatParcelizer(intrinsicHeight);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(getDefaultViewModelCreationExtras.write(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setupWithViewPager(ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z) {
        AudioAttributesCompatParcelizer(viewPager, z, false);
    }

    private void AudioAttributesCompatParcelizer(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.onCustomAction;
        if (viewPager2 != null) {
            MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = this.onPlayFromUri;
            if (mediaBrowserCompatItemReceiver != null) {
                viewPager2.IconCompatParcelizer(mediaBrowserCompatItemReceiver);
            }
            IconCompatParcelizer iconCompatParcelizer = this.onPlay;
            if (iconCompatParcelizer != null) {
                this.onCustomAction.AudioAttributesCompatParcelizer(iconCompatParcelizer);
            }
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.onPlayFromMediaId;
        if (remoteActionCompatParcelizer != null) {
            write(remoteActionCompatParcelizer);
            this.onPlayFromMediaId = null;
        }
        if (viewPager != null) {
            this.onCustomAction = viewPager;
            if (this.onPlayFromUri == null) {
                this.onPlayFromUri = new MediaBrowserCompatItemReceiver(this);
            }
            this.onPlayFromUri.AudioAttributesCompatParcelizer();
            viewPager.read(this.onPlayFromUri);
            AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = new AudioAttributesImplApi26Parcelizer(viewPager);
            this.onPlayFromMediaId = audioAttributesImplApi26Parcelizer;
            AudioAttributesCompatParcelizer(audioAttributesImplApi26Parcelizer);
            getComponentEnabledSetting getcomponentenabledsetting = viewPager.read();
            if (getcomponentenabledsetting != null) {
                read(getcomponentenabledsetting, z);
            }
            if (this.onPlay == null) {
                this.onPlay = new IconCompatParcelizer();
            }
            this.onPlay.write(z);
            viewPager.write(this.onPlay);
            setScrollPosition(viewPager.write(), BitmapDescriptorFactory.HUE_RED, true);
        } else {
            this.onCustomAction = null;
            read((getComponentEnabledSetting) null, false);
        }
        this.onSetRating = z2;
    }

    @Deprecated
    public void setTabsFromPagerAdapter(getComponentEnabledSetting getcomponentenabledsetting) {
        read(getcomponentenabledsetting, false);
    }

    final void read(int i) {
        this.PlaybackStateCompatCustomAction = i;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return handleMediaPlayPauseIfPendingOnHandler() > 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getConstantBitrateSeekMap.IconCompatParcelizer(this);
        if (this.onCustomAction == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                AudioAttributesCompatParcelizer((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.onSetRating) {
            setupWithViewPager(null);
            this.onSetRating = false;
        }
    }

    private int handleMediaPlayPauseIfPendingOnHandler() {
        int width = this.onSetCaptioningEnabled.getWidth();
        int width2 = getWidth();
        return Math.max(0, ((width - width2) - getPaddingLeft()) - getPaddingRight());
    }

    final void read(getComponentEnabledSetting getcomponentenabledsetting, boolean z) {
        DataSetObserver dataSetObserver;
        getComponentEnabledSetting getcomponentenabledsetting2 = this.onPlayFromSearch;
        if (getcomponentenabledsetting2 != null && (dataSetObserver = this.onPrepareFromSearch) != null) {
            getcomponentenabledsetting2.read(dataSetObserver);
        }
        this.onPlayFromSearch = getcomponentenabledsetting;
        if (z && getcomponentenabledsetting != null) {
            if (this.onPrepareFromSearch == null) {
                this.onPrepareFromSearch = new write();
            }
            getcomponentenabledsetting.RemoteActionCompatParcelizer(this.onPrepareFromSearch);
        }
        AudioAttributesImplApi26Parcelizer();
    }

    final void AudioAttributesImplApi26Parcelizer() {
        int iWrite;
        MediaBrowserCompatCustomActionResultReceiver();
        getComponentEnabledSetting getcomponentenabledsetting = this.onPlayFromSearch;
        if (getcomponentenabledsetting != null) {
            int iAudioAttributesCompatParcelizer = getcomponentenabledsetting.AudioAttributesCompatParcelizer();
            for (int i = 0; i < iAudioAttributesCompatParcelizer; i++) {
                AudioAttributesCompatParcelizer(AudioAttributesImplApi21Parcelizer().write(this.onPlayFromSearch.read(i)), false);
            }
            ViewPager viewPager = this.onCustomAction;
            if (viewPager == null || iAudioAttributesCompatParcelizer <= 0 || (iWrite = viewPager.write()) == AudioAttributesCompatParcelizer() || iWrite >= write()) {
                return;
            }
            IconCompatParcelizer(AudioAttributesCompatParcelizer(iWrite));
        }
    }

    private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int size = this.PlaybackStateCompat.size();
        for (int i = 0; i < size; i++) {
            this.PlaybackStateCompat.get(i).AudioAttributesImplBaseParcelizer();
        }
    }

    private TabView read(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
        rewrapCtorProblem.IconCompatParcelizer<TabView> iconCompatParcelizer = this.MediaSessionCompatResultReceiverWrapper;
        TabView tabViewRemoteActionCompatParcelizer = iconCompatParcelizer != null ? iconCompatParcelizer.RemoteActionCompatParcelizer() : null;
        if (tabViewRemoteActionCompatParcelizer == null) {
            tabViewRemoteActionCompatParcelizer = new TabView(getContext());
        }
        tabViewRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver);
        tabViewRemoteActionCompatParcelizer.setFocusable(true);
        tabViewRemoteActionCompatParcelizer.setMinimumWidth(MediaDescriptionCompat());
        if (TextUtils.isEmpty(mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer)) {
            tabViewRemoteActionCompatParcelizer.setContentDescription(mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer);
            return tabViewRemoteActionCompatParcelizer;
        }
        tabViewRemoteActionCompatParcelizer.setContentDescription(mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer);
        return tabViewRemoteActionCompatParcelizer;
    }

    private void read(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver, int i) {
        mediaBrowserCompatCustomActionResultReceiver.write(i);
        this.PlaybackStateCompat.add(i, mediaBrowserCompatCustomActionResultReceiver);
        int size = this.PlaybackStateCompat.size();
        int i2 = -1;
        for (int i3 = i + 1; i3 < size; i3++) {
            if (this.PlaybackStateCompat.get(i3).RemoteActionCompatParcelizer() == this.read) {
                i2 = i3;
            }
            this.PlaybackStateCompat.get(i3).write(i3);
        }
        this.read = i2;
    }

    private void AudioAttributesCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
        TabView tabView = mediaBrowserCompatCustomActionResultReceiver.write;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.onSetCaptioningEnabled.addView(tabView, mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(), MediaBrowserCompatItemReceiver());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        read(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        read(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        read(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        read(view);
    }

    private void read(View view) {
        if (view instanceof TabItem) {
            write((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private LinearLayout.LayoutParams MediaBrowserCompatItemReceiver() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        read(layoutParams);
        return layoutParams;
    }

    private void read(LinearLayout.LayoutParams layoutParams) {
        if (this.write == 1 && this.RemoteActionCompatParcelizer == 0) {
            ((ViewGroup.LayoutParams) layoutParams).width = 0;
            layoutParams.weight = 1.0f;
        } else {
            ((ViewGroup.LayoutParams) layoutParams).width = -2;
            layoutParams.weight = BitmapDescriptorFactory.HUE_RED;
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        getConstantBitrateSeekMap.read(this, f);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        hasSuperClassStartingWith.write(accessibilityNodeInfo).RemoteActionCompatParcelizer(hasSuperClassStartingWith.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(1, write(), false, 1));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i = 0; i < this.onSetCaptioningEnabled.getChildCount(); i++) {
            View childAt = this.onSetCaptioningEnabled.getChildAt(i);
            if (childAt instanceof TabView) {
                ((TabView) childAt).write(canvas);
            }
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.RatingCompat()
            float r0 = kotlin.checkAndPeekStreamMarker.AudioAttributesCompatParcelizer(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r0 = r0 + r1
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r3)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5e
            int r1 = r6.onPrepareFromMediaId
            if (r1 > 0) goto L5c
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = kotlin.checkAndPeekStreamMarker.AudioAttributesCompatParcelizer(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5c:
            r6.AudioAttributesImplApi21Parcelizer = r1
        L5e:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto La8
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.write
            if (r0 == 0) goto L80
            if (r0 == r5) goto L75
            r1 = 2
            if (r0 == r1) goto L80
            return
        L75:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 != r1) goto L8a
            return
        L80:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto La8
        L8a:
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            android.view.ViewGroup$LayoutParams r2 = r7.getLayoutParams()
            int r2 = r2.height
            int r0 = r0 + r1
            int r8 = getChildMeasureSpec(r8, r0, r2)
            int r6 = r6.getMeasuredWidth()
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            r7.measure(r6, r8)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    private void RemoteActionCompatParcelizer(int i) {
        TabView tabView = (TabView) this.onSetCaptioningEnabled.getChildAt(i);
        this.onSetCaptioningEnabled.removeViewAt(i);
        if (tabView != null) {
            tabView.write();
            this.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer(tabView);
        }
        requestLayout();
    }

    private void write(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() == null || !InvalidTypeIdException.onSeekTo(this) || this.onSetCaptioningEnabled.AudioAttributesCompatParcelizer()) {
            setScrollPosition(i, BitmapDescriptorFactory.HUE_RED, true);
            return;
        }
        int scrollX = getScrollX();
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i, BitmapDescriptorFactory.HUE_RED);
        if (scrollX != iAudioAttributesCompatParcelizer) {
            MediaMetadataCompat();
            this.onPrepareFromUri.setIntValues(scrollX, iAudioAttributesCompatParcelizer);
            this.onPrepareFromUri.start();
        }
        this.onSetCaptioningEnabled.RemoteActionCompatParcelizer(i, this.onSkipToNext);
    }

    private void MediaMetadataCompat() {
        if (this.onPrepareFromUri == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.onPrepareFromUri = valueAnimator;
            valueAnimator.setInterpolator(this.MediaSessionCompatToken);
            this.onPrepareFromUri.setDuration(this.onSkipToNext);
            this.onPrepareFromUri.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.tabs.TabLayout.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    TabLayout.this.scrollTo(((Integer) valueAnimator2.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    private void AudioAttributesImplApi21Parcelizer(int i) {
        int childCount = this.onSetCaptioningEnabled.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.onSetCaptioningEnabled.getChildAt(i2);
                if ((i2 == i && !childAt.isSelected()) || (i2 != i && childAt.isSelected())) {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                    if (childAt instanceof TabView) {
                        ((TabView) childAt).MediaBrowserCompatItemReceiver();
                    }
                } else {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                }
                i2++;
            }
        }
    }

    public void IconCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
        write(mediaBrowserCompatCustomActionResultReceiver, true);
    }

    public final void write(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver, boolean z) {
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver2 = this.onSetShuffleMode;
        if (mediaBrowserCompatCustomActionResultReceiver2 == mediaBrowserCompatCustomActionResultReceiver) {
            if (mediaBrowserCompatCustomActionResultReceiver2 != null) {
                MediaBrowserCompatSearchResultReceiver();
                write(mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer());
                return;
            }
            return;
        }
        int iRemoteActionCompatParcelizer = mediaBrowserCompatCustomActionResultReceiver != null ? mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer() : -1;
        if (z) {
            if ((mediaBrowserCompatCustomActionResultReceiver2 == null || mediaBrowserCompatCustomActionResultReceiver2.RemoteActionCompatParcelizer() == -1) && iRemoteActionCompatParcelizer != -1) {
                setScrollPosition(iRemoteActionCompatParcelizer, BitmapDescriptorFactory.HUE_RED, true);
            } else {
                write(iRemoteActionCompatParcelizer);
            }
            if (iRemoteActionCompatParcelizer != -1) {
                AudioAttributesImplApi21Parcelizer(iRemoteActionCompatParcelizer);
            }
        }
        this.onSetShuffleMode = mediaBrowserCompatCustomActionResultReceiver;
        if (mediaBrowserCompatCustomActionResultReceiver2 != null && mediaBrowserCompatCustomActionResultReceiver2.AudioAttributesCompatParcelizer != null) {
            MediaBrowserCompatMediaItem();
        }
        if (mediaBrowserCompatCustomActionResultReceiver != null) {
            RemoteActionCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver);
        }
    }

    private void RemoteActionCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
        for (int size = this.onRemoveQueueItem.size() - 1; size >= 0; size--) {
            this.onRemoveQueueItem.get(size).IconCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver);
        }
    }

    private void MediaBrowserCompatMediaItem() {
        for (int size = this.onRemoveQueueItem.size() - 1; size >= 0; size--) {
            this.onRemoveQueueItem.get(size);
        }
    }

    private void MediaBrowserCompatSearchResultReceiver() {
        for (int size = this.onRemoveQueueItem.size() - 1; size >= 0; size--) {
            this.onRemoveQueueItem.get(size);
        }
    }

    private int AudioAttributesCompatParcelizer(int i, float f) {
        View childAt;
        int i2 = this.write;
        if ((i2 != 0 && i2 != 2) || (childAt = this.onSetCaptioningEnabled.getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < this.onSetCaptioningEnabled.getChildCount() ? this.onSetCaptioningEnabled.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        return InvalidTypeIdException.MediaBrowserCompatMediaItem(this) == 0 ? left + i4 : left - i4;
    }

    private void AudioAttributesImplBaseParcelizer() {
        int i = this.write;
        InvalidTypeIdException.read(this.onSetCaptioningEnabled, (i == 0 || i == 2) ? Math.max(0, this.onMediaButtonEvent - this.MediaDescriptionCompat) : 0, 0, 0, 0);
        int i2 = this.write;
        if (i2 == 0) {
            IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        } else if (i2 == 1 || i2 == 2) {
            this.onSetCaptioningEnabled.setGravity(1);
        }
        RemoteActionCompatParcelizer(true);
    }

    private void IconCompatParcelizer(int i) {
        if (i != 0) {
            if (i == 1) {
                this.onSetCaptioningEnabled.setGravity(1);
                return;
            } else if (i != 2) {
                return;
            }
        }
        this.onSetCaptioningEnabled.setGravity(8388611);
    }

    final void RemoteActionCompatParcelizer(boolean z) {
        for (int i = 0; i < this.onSetCaptioningEnabled.getChildCount(); i++) {
            View childAt = this.onSetCaptioningEnabled.getChildAt(i);
            childAt.setMinimumWidth(MediaDescriptionCompat());
            read((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public static class MediaBrowserCompatCustomActionResultReceiver {
        public TabLayout AudioAttributesCompatParcelizer;
        private CharSequence AudioAttributesImplApi21Parcelizer;
        private Object AudioAttributesImplBaseParcelizer;
        private CharSequence IconCompatParcelizer;
        private View RemoteActionCompatParcelizer;
        private Drawable read;
        public TabView write;
        private int AudioAttributesImplApi26Parcelizer = -1;
        private int MediaBrowserCompatItemReceiver = 1;
        private int MediaBrowserCompatCustomActionResultReceiver = -1;

        public final Object AudioAttributesCompatParcelizer() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        public final MediaBrowserCompatCustomActionResultReceiver RemoteActionCompatParcelizer(Object obj) {
            this.AudioAttributesImplBaseParcelizer = obj;
            return this;
        }

        public final View IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final MediaBrowserCompatCustomActionResultReceiver RemoteActionCompatParcelizer(View view) {
            this.RemoteActionCompatParcelizer = view;
            AudioAttributesImplBaseParcelizer();
            return this;
        }

        public final MediaBrowserCompatCustomActionResultReceiver AudioAttributesCompatParcelizer(int i) {
            return RemoteActionCompatParcelizer(LayoutInflater.from(this.write.getContext()).inflate(i, (ViewGroup) this.write, false));
        }

        public final Drawable read() {
            return this.read;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        final void write(int i) {
            this.AudioAttributesImplApi26Parcelizer = i;
        }

        public final CharSequence write() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        public final MediaBrowserCompatCustomActionResultReceiver read(Drawable drawable) {
            this.read = drawable;
            if (this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer == 1 || this.AudioAttributesCompatParcelizer.write == 2) {
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(true);
            }
            AudioAttributesImplBaseParcelizer();
            return this;
        }

        public final MediaBrowserCompatCustomActionResultReceiver write(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.IconCompatParcelizer) && !TextUtils.isEmpty(charSequence)) {
                this.write.setContentDescription(charSequence);
            }
            this.AudioAttributesImplApi21Parcelizer = charSequence;
            AudioAttributesImplBaseParcelizer();
            return this;
        }

        public final void AudioAttributesImplApi26Parcelizer() {
            TabLayout tabLayout = this.AudioAttributesCompatParcelizer;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.IconCompatParcelizer(this);
        }

        public final boolean MediaBrowserCompatCustomActionResultReceiver() {
            TabLayout tabLayout = this.AudioAttributesCompatParcelizer;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int iAudioAttributesCompatParcelizer = tabLayout.AudioAttributesCompatParcelizer();
            return iAudioAttributesCompatParcelizer != -1 && iAudioAttributesCompatParcelizer == this.AudioAttributesImplApi26Parcelizer;
        }

        public final MediaBrowserCompatCustomActionResultReceiver RemoteActionCompatParcelizer(CharSequence charSequence) {
            this.IconCompatParcelizer = charSequence;
            AudioAttributesImplBaseParcelizer();
            return this;
        }

        final void AudioAttributesImplBaseParcelizer() {
            TabView tabView = this.write;
            if (tabView != null) {
                tabView.IconCompatParcelizer();
            }
        }

        final void AudioAttributesImplApi21Parcelizer() {
            this.AudioAttributesCompatParcelizer = null;
            this.write = null;
            this.AudioAttributesImplBaseParcelizer = null;
            this.read = null;
            this.MediaBrowserCompatCustomActionResultReceiver = -1;
            this.AudioAttributesImplApi21Parcelizer = null;
            this.IconCompatParcelizer = null;
            this.AudioAttributesImplApi26Parcelizer = -1;
            this.RemoteActionCompatParcelizer = null;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public final class TabView extends LinearLayout {
        private View AudioAttributesCompatParcelizer;
        private ImageView AudioAttributesImplApi21Parcelizer;
        private MediaBrowserCompatCustomActionResultReceiver AudioAttributesImplApi26Parcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private Drawable IconCompatParcelizer;
        private TextView MediaBrowserCompatCustomActionResultReceiver;
        private TextView RemoteActionCompatParcelizer;
        private ImageView read;
        private BinarySearchSeekerTimestampSeeker write;

        private void MediaBrowserCompatCustomActionResultReceiver() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void RemoteActionCompatParcelizer(View view) {
        }

        public TabView(Context context) {
            super(context);
            this.AudioAttributesImplBaseParcelizer = 2;
            AudioAttributesCompatParcelizer(context);
            InvalidTypeIdException.read(this, TabLayout.this.MediaDescriptionCompat, TabLayout.this.MediaBrowserCompatSearchResultReceiver, TabLayout.this.RatingCompat, TabLayout.this.MediaBrowserCompatItemReceiver);
            setGravity(17);
            setOrientation(!TabLayout.this.IconCompatParcelizer ? 1 : 0);
            setClickable(true);
            InvalidTypeIdException.read(this, childObject.write(getContext(), 1002));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void AudioAttributesCompatParcelizer(Context context) {
            if (TabLayout.this.AudioAttributesCompatParcelizer != 0) {
                Drawable drawableWrite = getDefaultViewModelCreationExtras.write(context, TabLayout.this.AudioAttributesCompatParcelizer);
                this.IconCompatParcelizer = drawableWrite;
                if (drawableWrite != null && drawableWrite.isStateful()) {
                    this.IconCompatParcelizer.setState(getDrawableState());
                }
            } else {
                this.IconCompatParcelizer = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            Drawable rippleDrawable = gradientDrawable;
            if (TabLayout.this.MediaMetadataCompat != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateList = outputPendingSampleMetadata.read(TabLayout.this.MediaMetadataCompat);
                GradientDrawable gradientDrawable3 = gradientDrawable;
                if (TabLayout.this.onAddQueueItem) {
                    gradientDrawable3 = null;
                }
                rippleDrawable = new RippleDrawable(colorStateList, gradientDrawable3, TabLayout.this.onAddQueueItem ? null : gradientDrawable2);
            }
            InvalidTypeIdException.read(this, rippleDrawable);
            TabLayout.this.invalidate();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void write(Canvas canvas) {
            Drawable drawable = this.IconCompatParcelizer;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.IconCompatParcelizer.draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.IconCompatParcelizer;
            if (drawable != null && drawable.isStateful() && this.IconCompatParcelizer.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.AudioAttributesImplApi26Parcelizer == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer();
            return true;
        }

        @Override // android.view.View
        public final void setSelected(boolean z) {
            isSelected();
            super.setSelected(z);
            TextView textView = this.MediaBrowserCompatCustomActionResultReceiver;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.AudioAttributesImplApi21Parcelizer;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.AudioAttributesCompatParcelizer;
            if (view != null) {
                view.setSelected(z);
            }
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            hasSuperClassStartingWith hassuperclassstartingwithWrite = hasSuperClassStartingWith.write(accessibilityNodeInfo);
            hassuperclassstartingwithWrite.AudioAttributesCompatParcelizer(hasSuperClassStartingWith.AudioAttributesImplBaseParcelizer.read(0, 1, this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(), 1, false, isSelected()));
            if (isSelected()) {
                hassuperclassstartingwithWrite.AudioAttributesImplApi26Parcelizer(false);
                hassuperclassstartingwithWrite.IconCompatParcelizer(hasSuperClassStartingWith.read.write);
            }
            hassuperclassstartingwithWrite.AudioAttributesImplBaseParcelizer(getResources().getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int iIconCompatParcelizer = TabLayout.this.IconCompatParcelizer();
            if (iIconCompatParcelizer > 0 && (mode == 0 || size > iIconCompatParcelizer)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.AudioAttributesImplApi21Parcelizer, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.MediaBrowserCompatCustomActionResultReceiver != null) {
                float f = TabLayout.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                int i3 = this.AudioAttributesImplBaseParcelizer;
                ImageView imageView = this.AudioAttributesImplApi21Parcelizer;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.MediaBrowserCompatCustomActionResultReceiver;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.handleMediaPlayPauseIfPendingOnHandler;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.MediaBrowserCompatCustomActionResultReceiver.getTextSize();
                int lineCount = this.MediaBrowserCompatCustomActionResultReceiver.getLineCount();
                int iRemoteActionCompatParcelizer = _addSuperTypes.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
                if (f != textSize || (iRemoteActionCompatParcelizer >= 0 && i3 != iRemoteActionCompatParcelizer)) {
                    if (TabLayout.this.write != 1 || f <= textSize || lineCount != 1 || ((layout = this.MediaBrowserCompatCustomActionResultReceiver.getLayout()) != null && AudioAttributesCompatParcelizer(layout, f) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.MediaBrowserCompatCustomActionResultReceiver.setTextSize(0, f);
                        this.MediaBrowserCompatCustomActionResultReceiver.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        final void AudioAttributesCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
            if (mediaBrowserCompatCustomActionResultReceiver != this.AudioAttributesImplApi26Parcelizer) {
                this.AudioAttributesImplApi26Parcelizer = mediaBrowserCompatCustomActionResultReceiver;
                IconCompatParcelizer();
            }
        }

        final void write() {
            AudioAttributesCompatParcelizer((MediaBrowserCompatCustomActionResultReceiver) null);
            setSelected(false);
        }

        final void MediaBrowserCompatItemReceiver() {
            ViewParent parent;
            MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplApi26Parcelizer;
            View viewIconCompatParcelizer = mediaBrowserCompatCustomActionResultReceiver != null ? mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer() : null;
            if (viewIconCompatParcelizer != null) {
                ViewParent parent2 = viewIconCompatParcelizer.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(viewIconCompatParcelizer);
                    }
                    View view = this.AudioAttributesCompatParcelizer;
                    if (view != null && (parent = view.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.AudioAttributesCompatParcelizer);
                    }
                    addView(viewIconCompatParcelizer);
                }
                this.AudioAttributesCompatParcelizer = viewIconCompatParcelizer;
                TextView textView = this.MediaBrowserCompatCustomActionResultReceiver;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.AudioAttributesImplApi21Parcelizer;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.AudioAttributesImplApi21Parcelizer.setImageDrawable(null);
                }
                TextView textView2 = (TextView) viewIconCompatParcelizer.findViewById(R.id.text1);
                this.RemoteActionCompatParcelizer = textView2;
                if (textView2 != null) {
                    this.AudioAttributesImplBaseParcelizer = _addSuperTypes.RemoteActionCompatParcelizer(textView2);
                }
                this.read = (ImageView) viewIconCompatParcelizer.findViewById(R.id.icon);
            } else {
                View view2 = this.AudioAttributesCompatParcelizer;
                if (view2 != null) {
                    removeView(view2);
                    this.AudioAttributesCompatParcelizer = null;
                }
                this.RemoteActionCompatParcelizer = null;
                this.read = null;
            }
            if (this.AudioAttributesCompatParcelizer == null) {
                if (this.AudioAttributesImplApi21Parcelizer == null) {
                    AudioAttributesImplBaseParcelizer();
                }
                if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
                    AudioAttributesImplApi26Parcelizer();
                    this.AudioAttributesImplBaseParcelizer = _addSuperTypes.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
                }
                _addSuperTypes.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, TabLayout.this.onPrepare);
                if (!isSelected() || TabLayout.this.onSetRepeatMode == -1) {
                    _addSuperTypes.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, TabLayout.this.ParcelableVolumeInfo);
                } else {
                    _addSuperTypes.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, TabLayout.this.onSetRepeatMode);
                }
                if (TabLayout.this.onCommand != null) {
                    this.MediaBrowserCompatCustomActionResultReceiver.setTextColor(TabLayout.this.onCommand);
                }
                RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi21Parcelizer, true);
                MediaBrowserCompatCustomActionResultReceiver();
                IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
                IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
            } else {
                TextView textView3 = this.RemoteActionCompatParcelizer;
                if (textView3 != null || this.read != null) {
                    RemoteActionCompatParcelizer(textView3, this.read, false);
                }
            }
            if (mediaBrowserCompatCustomActionResultReceiver == null || TextUtils.isEmpty(mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer)) {
                return;
            }
            setContentDescription(mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer);
        }

        final void IconCompatParcelizer() {
            MediaBrowserCompatItemReceiver();
            MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesImplApi26Parcelizer;
            setSelected(mediaBrowserCompatCustomActionResultReceiver != null && mediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver());
        }

        private void AudioAttributesImplBaseParcelizer() {
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.design_layout_tab_icon, (ViewGroup) this, false);
            this.AudioAttributesImplApi21Parcelizer = imageView;
            addView(imageView, 0);
        }

        private void AudioAttributesImplApi26Parcelizer() {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.design_layout_tab_text, (ViewGroup) this, false);
            this.MediaBrowserCompatCustomActionResultReceiver = textView;
            addView(textView);
        }

        private void IconCompatParcelizer(final View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.tabs.TabLayout.TabView.4
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    if (view.getVisibility() == 0) {
                        TabView.this.RemoteActionCompatParcelizer(view);
                    }
                }
            });
        }

        final void read() {
            setOrientation(!TabLayout.this.IconCompatParcelizer ? 1 : 0);
            TextView textView = this.RemoteActionCompatParcelizer;
            if (textView != null || this.read != null) {
                RemoteActionCompatParcelizer(textView, this.read, false);
            } else {
                RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi21Parcelizer, true);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void RemoteActionCompatParcelizer(android.widget.TextView r8, android.widget.ImageView r9, boolean r10) {
            /*
                Method dump skipped, instruction units count: 206
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.TabView.RemoteActionCompatParcelizer(android.widget.TextView, android.widget.ImageView, boolean):void");
        }

        public final int RemoteActionCompatParcelizer() {
            View[] viewArr = {this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesCompatParcelizer};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        public final int AudioAttributesCompatParcelizer() {
            View[] viewArr = {this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesCompatParcelizer};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        private static float AudioAttributesCompatParcelizer(Layout layout, float f) {
            return layout.getLineWidth(0) * (f / layout.getPaint().getTextSize());
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public class read extends LinearLayout {
        private ValueAnimator IconCompatParcelizer;
        private int write;
        private static final byte[] $$a = {61, -4, -83, 58, 19, 10, 3, -20, 6, -5};
        private static final int $$b = 220;
        private static int read = 0;
        private static int RemoteActionCompatParcelizer = 1;

        private static void a(byte b, byte b2, short s, Object[] objArr) {
            byte[] bArr = $$a;
            int i = 7 - (b2 * 3);
            int i2 = (b * 39) + 75;
            int i3 = s * 4;
            byte[] bArr2 = new byte[i3 + 4];
            int i4 = i3 + 3;
            int i5 = -1;
            if (bArr == null) {
                i++;
                i2 = i2 + (-i4) + 6;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i2;
                if (i5 == i4) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    int i6 = bArr[i];
                    i++;
                    i2 = i2 + (-i6) + 6;
                }
            }
        }

        read(Context context) {
            super(context);
            this.write = -1;
            setWillNotDraw(false);
        }

        final void IconCompatParcelizer(int i) {
            Rect bounds = TabLayout.this.MediaBrowserCompatMediaItem.getBounds();
            TabLayout.this.MediaBrowserCompatMediaItem.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        final boolean AudioAttributesCompatParcelizer() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        final void read(int i, float f) {
            TabLayout.this.read = Math.round(i + f);
            ValueAnimator valueAnimator = this.IconCompatParcelizer;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.IconCompatParcelizer.cancel();
            }
            IconCompatParcelizer(getChildAt(i), getChildAt(i + 1), f);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                if (TabLayout.this.RemoteActionCompatParcelizer == 1 || TabLayout.this.write == 2) {
                    int childCount = getChildCount();
                    int iMax = 0;
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = getChildAt(i3);
                        if (childAt.getVisibility() == 0) {
                            iMax = Math.max(iMax, childAt.getMeasuredWidth());
                        }
                    }
                    if (iMax > 0) {
                        if (iMax * childCount <= getMeasuredWidth() - (((int) checkAndPeekStreamMarker.AudioAttributesCompatParcelizer(getContext(), 16)) << 1)) {
                            boolean z = false;
                            for (int i4 = 0; i4 < childCount; i4++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                                if (((ViewGroup.LayoutParams) layoutParams).width != iMax || layoutParams.weight != BitmapDescriptorFactory.HUE_RED) {
                                    ((ViewGroup.LayoutParams) layoutParams).width = iMax;
                                    layoutParams.weight = BitmapDescriptorFactory.HUE_RED;
                                    z = true;
                                }
                            }
                            if (!z) {
                                return;
                            }
                        } else {
                            TabLayout.this.RemoteActionCompatParcelizer = 0;
                            TabLayout.this.RemoteActionCompatParcelizer(false);
                        }
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.IconCompatParcelizer;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                IconCompatParcelizer(false, TabLayout.this.AudioAttributesCompatParcelizer(), -1);
            } else {
                read();
            }
        }

        private void write(int i) {
            if (TabLayout.this.PlaybackStateCompatCustomAction == 0 || (TabLayout.this.read().getBounds().left == -1 && TabLayout.this.read().getBounds().right == -1)) {
                View childAt = getChildAt(i);
                advanceCurrentChunk unused = TabLayout.this.onStop;
                TabLayout tabLayout = TabLayout.this;
                advanceCurrentChunk.AudioAttributesCompatParcelizer(tabLayout, childAt, tabLayout.MediaBrowserCompatMediaItem);
                TabLayout.this.read = i;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void write() {
            write(TabLayout.this.AudioAttributesCompatParcelizer());
        }

        private void read() {
            if (TabLayout.this.read == -1) {
                TabLayout tabLayout = TabLayout.this;
                tabLayout.read = tabLayout.AudioAttributesCompatParcelizer();
            }
            write(TabLayout.this.read);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void IconCompatParcelizer(View view, View view2, float f) {
            if (view != null && view.getWidth() > 0) {
                advanceCurrentChunk advancecurrentchunk = TabLayout.this.onStop;
                TabLayout tabLayout = TabLayout.this;
                advancecurrentchunk.AudioAttributesCompatParcelizer(tabLayout, view, view2, f, tabLayout.MediaBrowserCompatMediaItem);
            } else {
                TabLayout.this.MediaBrowserCompatMediaItem.setBounds(-1, TabLayout.this.MediaBrowserCompatMediaItem.getBounds().top, -1, TabLayout.this.MediaBrowserCompatMediaItem.getBounds().bottom);
            }
            InvalidTypeIdException.onRemoveQueueItem(this);
        }

        final void RemoteActionCompatParcelizer(int i, int i2) {
            ValueAnimator valueAnimator = this.IconCompatParcelizer;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.read != i) {
                this.IconCompatParcelizer.cancel();
            }
            IconCompatParcelizer(true, i, i2);
        }

        private void IconCompatParcelizer(boolean z, int i, int i2) {
            if (TabLayout.this.read == i) {
                return;
            }
            final View childAt = getChildAt(TabLayout.this.AudioAttributesCompatParcelizer());
            final View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                write();
                return;
            }
            TabLayout.this.read = i;
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.tabs.TabLayout.read.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    read.this.IconCompatParcelizer(childAt, childAt2, valueAnimator.getAnimatedFraction());
                }
            };
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.IconCompatParcelizer = valueAnimator;
                valueAnimator.setInterpolator(TabLayout.this.MediaSessionCompatToken);
                valueAnimator.setDuration(i2);
                valueAnimator.setFloatValues(BitmapDescriptorFactory.HUE_RED, 1.0f);
                valueAnimator.addUpdateListener(animatorUpdateListener);
                valueAnimator.start();
                return;
            }
            this.IconCompatParcelizer.removeAllUpdateListeners();
            this.IconCompatParcelizer.addUpdateListener(animatorUpdateListener);
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height;
            int iHeight = TabLayout.this.MediaBrowserCompatMediaItem.getBounds().height();
            if (iHeight < 0) {
                iHeight = TabLayout.this.MediaBrowserCompatMediaItem.getIntrinsicHeight();
            }
            int i = TabLayout.this.AudioAttributesImplBaseParcelizer;
            if (i == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i != 1) {
                height = 0;
                if (i != 2) {
                    iHeight = i != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
            if (TabLayout.this.MediaBrowserCompatMediaItem.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.MediaBrowserCompatMediaItem.getBounds();
                TabLayout.this.MediaBrowserCompatMediaItem.setBounds(bounds.left, height, bounds.right, iHeight);
                TabLayout.this.MediaBrowserCompatMediaItem.draw(canvas);
            }
            super.draw(canvas);
        }

        /* JADX WARN: Removed duplicated region for block: B:85:0x07c4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] IconCompatParcelizer(int r39, int r40, int r41) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2698
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.read.IconCompatParcelizer(int, int, int):java.lang.Object[]");
        }
    }

    private static ColorStateList read(int i, int i2) {
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private int RatingCompat() {
        int size = this.PlaybackStateCompat.size();
        for (int i = 0; i < size; i++) {
            MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.PlaybackStateCompat.get(i);
            if (mediaBrowserCompatCustomActionResultReceiver != null && mediaBrowserCompatCustomActionResultReceiver.read() != null && !TextUtils.isEmpty(mediaBrowserCompatCustomActionResultReceiver.write())) {
                return !this.IconCompatParcelizer ? 72 : 48;
            }
        }
        return 48;
    }

    private int MediaDescriptionCompat() {
        int i = this.onSeekTo;
        if (i != -1) {
            return i;
        }
        int i2 = this.write;
        if (i2 == 0 || i2 == 2) {
            return this.onRemoveQueueItemAt;
        }
        return 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    final int IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class MediaBrowserCompatItemReceiver implements ViewPager.RemoteActionCompatParcelizer {
        private final WeakReference<TabLayout> RemoteActionCompatParcelizer;
        private int read;
        private int write;

        public MediaBrowserCompatItemReceiver(TabLayout tabLayout) {
            this.RemoteActionCompatParcelizer = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer(int i) {
            this.write = this.read;
            this.read = i;
            TabLayout tabLayout = this.RemoteActionCompatParcelizer.get();
            if (tabLayout != null) {
                tabLayout.read(this.read);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.RemoteActionCompatParcelizer
        public final void read(int i, float f) {
            TabLayout tabLayout = this.RemoteActionCompatParcelizer.get();
            if (tabLayout != null) {
                int i2 = this.read;
                tabLayout.AudioAttributesCompatParcelizer(i, f, i2 != 2 || this.write == 1, (i2 == 2 && this.write == 0) ? false : true, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.RemoteActionCompatParcelizer
        public final void RemoteActionCompatParcelizer(int i) {
            TabLayout tabLayout = this.RemoteActionCompatParcelizer.get();
            if (tabLayout == null || tabLayout.AudioAttributesCompatParcelizer() == i || i >= tabLayout.write()) {
                return;
            }
            int i2 = this.read;
            tabLayout.write(tabLayout.AudioAttributesCompatParcelizer(i), i2 == 0 || (i2 == 2 && this.write == 0));
        }

        final void AudioAttributesCompatParcelizer() {
            this.read = 0;
            this.write = 0;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class AudioAttributesImplApi26Parcelizer implements AudioAttributesCompatParcelizer {
        private final ViewPager write;

        public AudioAttributesImplApi26Parcelizer(ViewPager viewPager) {
            this.write = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
            this.write.setCurrentItem(mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer());
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    class write extends DataSetObserver {
        write() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            TabLayout.this.AudioAttributesImplApi26Parcelizer();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            TabLayout.this.AudioAttributesImplApi26Parcelizer();
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    class IconCompatParcelizer implements ViewPager.IconCompatParcelizer {
        private boolean read;

        IconCompatParcelizer() {
        }

        @Override // androidx.viewpager.widget.ViewPager.IconCompatParcelizer
        public final void RemoteActionCompatParcelizer(ViewPager viewPager, getComponentEnabledSetting getcomponentenabledsetting, getComponentEnabledSetting getcomponentenabledsetting2) {
            if (TabLayout.this.onCustomAction == viewPager) {
                TabLayout.this.read(getcomponentenabledsetting2, this.read);
            }
        }

        final void write(boolean z) {
            this.read = z;
        }
    }
}
