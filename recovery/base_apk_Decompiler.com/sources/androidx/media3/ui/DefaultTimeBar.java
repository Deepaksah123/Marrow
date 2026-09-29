package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.exoplayer2.C;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.LaissezFaireSubTypeValidator;
import kotlin.PrivateMaxEntriesMapRemovalTask;
import kotlin.buildTypeSerializer;
import kotlin.maximumCapacity;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultTimeBar extends View implements PrivateMaxEntriesMapRemovalTask {
    private final int AudioAttributesCompatParcelizer;
    private final float AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private final Rect AudioAttributesImplBaseParcelizer;
    private long[] IconCompatParcelizer;
    private final Paint MediaBrowserCompatCustomActionResultReceiver;
    private long MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private final StringBuilder MediaBrowserCompatSearchResultReceiver;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final int MediaDescriptionCompat;
    private long MediaMetadataCompat;
    private final Formatter RatingCompat;
    private final int RemoteActionCompatParcelizer;
    private final CopyOnWriteArraySet<PrivateMaxEntriesMapRemovalTask.write> handleMediaPlayPauseIfPendingOnHandler;
    private long onAddQueueItem;
    private boolean[] onCommand;
    private Rect onCustomAction;
    private final Paint onFastForward;
    private final Paint onMediaButtonEvent;
    private long onPause;
    private final Rect onPlay;
    private long onPlayFromMediaId;
    private final Drawable onPlayFromSearch;
    private final int onPlayFromUri;
    private final int onPrepare;
    private final int onPrepareFromMediaId;
    private final Rect onPrepareFromSearch;
    private final int onPrepareFromUri;
    private final Paint onRemoveQueueItem;
    private float onRemoveQueueItemAt;
    private boolean onRewind;
    private ValueAnimator onSeekTo;
    private final int onSetCaptioningEnabled;
    private final Point onSetPlaybackSpeed;
    private final Runnable onSetRating;
    private boolean onSetRepeatMode;
    private final Rect onSetShuffleMode;
    private final Paint onSkipToQueueItem;
    private int read;
    private final Paint write;

    private static int AudioAttributesCompatParcelizer(float f, int i) {
        return (int) (i / f);
    }

    private static int IconCompatParcelizer(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    public DefaultTimeBar(Context context) {
        this(context, null);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        this(context, attributeSet, i, attributeSet2, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        this.onSetShuffleMode = new Rect();
        this.onPlay = new Rect();
        this.AudioAttributesImplBaseParcelizer = new Rect();
        this.onPrepareFromSearch = new Rect();
        Paint paint = new Paint();
        this.onFastForward = paint;
        Paint paint2 = new Paint();
        this.MediaBrowserCompatCustomActionResultReceiver = paint2;
        Paint paint3 = new Paint();
        this.onSkipToQueueItem = paint3;
        Paint paint4 = new Paint();
        this.write = paint4;
        Paint paint5 = new Paint();
        this.onMediaButtonEvent = paint5;
        Paint paint6 = new Paint();
        this.onRemoveQueueItem = paint6;
        paint6.setAntiAlias(true);
        this.handleMediaPlayPauseIfPendingOnHandler = new CopyOnWriteArraySet<>();
        this.onSetPlaybackSpeed = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.AudioAttributesImplApi21Parcelizer = f;
        this.MediaDescriptionCompat = IconCompatParcelizer(f, -50);
        int iIconCompatParcelizer = IconCompatParcelizer(f, 4);
        int iIconCompatParcelizer2 = IconCompatParcelizer(f, 26);
        int iIconCompatParcelizer3 = IconCompatParcelizer(f, 4);
        int iIconCompatParcelizer4 = IconCompatParcelizer(f, 12);
        int iIconCompatParcelizer5 = IconCompatParcelizer(f, 0);
        int iIconCompatParcelizer6 = IconCompatParcelizer(f, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, maximumCapacity.MediaDescriptionCompat.DefaultTimeBar, i, i2);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(maximumCapacity.MediaDescriptionCompat.DefaultTimeBar_scrubber_drawable);
                this.onPlayFromSearch = drawable;
                if (drawable != null) {
                    IconCompatParcelizer(drawable);
                    iIconCompatParcelizer2 = Math.max(drawable.getMinimumHeight(), iIconCompatParcelizer2);
                }
                this.AudioAttributesImplApi26Parcelizer = typedArrayObtainStyledAttributes.getDimensionPixelSize(maximumCapacity.MediaDescriptionCompat.DefaultTimeBar_bar_height, iIconCompatParcelizer);
                this.onSetCaptioningEnabled = typedArrayObtainStyledAttributes.getDimensionPixelSize(maximumCapacity.MediaDescriptionCompat.DefaultTimeBar_touch_target_height, iIconCompatParcelizer2);
                this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getInt(maximumCapacity.MediaDescriptionCompat.DefaultTimeBar_bar_gravity, 0);
                this.AudioAttributesCompatParcelizer = typedArrayObtainStyledAttributes.getDimensionPixelSize(maximumCapacity.MediaDescriptionCompat.DefaultTimeBar_ad_marker_width, iIconCompatParcelizer3);
                this.onPrepare = typedArrayObtainStyledAttributes.getDimensionPixelSize(maximumCapacity.MediaDescriptionCompat.DefaultTimeBar_scrubber_enabled_size, iIconCompatParcelizer4);
                this.onPlayFromUri = typedArrayObtainStyledAttributes.getDimensionPixelSize(maximumCapacity.MediaDescriptionCompat.DefaultTimeBar_scrubber_disabled_size, iIconCompatParcelizer5);
                this.onPrepareFromMediaId = typedArrayObtainStyledAttributes.getDimensionPixelSize(maximumCapacity.MediaDescriptionCompat.DefaultTimeBar_scrubber_dragged_size, iIconCompatParcelizer6);
                int i3 = typedArrayObtainStyledAttributes.getInt(maximumCapacity.MediaDescriptionCompat.DefaultTimeBar_played_color, -1);
                int i4 = typedArrayObtainStyledAttributes.getInt(maximumCapacity.MediaDescriptionCompat.DefaultTimeBar_scrubber_color, -1);
                int i5 = typedArrayObtainStyledAttributes.getInt(maximumCapacity.MediaDescriptionCompat.DefaultTimeBar_buffered_color, com.google.android.exoplayer2.ui.DefaultTimeBar.DEFAULT_BUFFERED_COLOR);
                int i6 = typedArrayObtainStyledAttributes.getInt(maximumCapacity.MediaDescriptionCompat.DefaultTimeBar_unplayed_color, com.google.android.exoplayer2.ui.DefaultTimeBar.DEFAULT_UNPLAYED_COLOR);
                int i7 = typedArrayObtainStyledAttributes.getInt(maximumCapacity.MediaDescriptionCompat.DefaultTimeBar_ad_marker_color, com.google.android.exoplayer2.ui.DefaultTimeBar.DEFAULT_AD_MARKER_COLOR);
                int i8 = typedArrayObtainStyledAttributes.getInt(maximumCapacity.MediaDescriptionCompat.DefaultTimeBar_played_ad_marker_color, com.google.android.exoplayer2.ui.DefaultTimeBar.DEFAULT_PLAYED_AD_MARKER_COLOR);
                paint.setColor(i3);
                paint6.setColor(i4);
                paint2.setColor(i5);
                paint3.setColor(i6);
                paint4.setColor(i7);
                paint5.setColor(i8);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } else {
            this.AudioAttributesImplApi26Parcelizer = iIconCompatParcelizer;
            this.onSetCaptioningEnabled = iIconCompatParcelizer2;
            this.RemoteActionCompatParcelizer = 0;
            this.AudioAttributesCompatParcelizer = iIconCompatParcelizer3;
            this.onPrepare = iIconCompatParcelizer4;
            this.onPlayFromUri = iIconCompatParcelizer5;
            this.onPrepareFromMediaId = iIconCompatParcelizer6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(com.google.android.exoplayer2.ui.DefaultTimeBar.DEFAULT_BUFFERED_COLOR);
            paint3.setColor(com.google.android.exoplayer2.ui.DefaultTimeBar.DEFAULT_UNPLAYED_COLOR);
            paint4.setColor(com.google.android.exoplayer2.ui.DefaultTimeBar.DEFAULT_AD_MARKER_COLOR);
            paint5.setColor(com.google.android.exoplayer2.ui.DefaultTimeBar.DEFAULT_PLAYED_AD_MARKER_COLOR);
            this.onPlayFromSearch = null;
        }
        StringBuilder sb = new StringBuilder();
        this.MediaBrowserCompatSearchResultReceiver = sb;
        this.RatingCompat = new Formatter(sb, Locale.getDefault());
        this.onSetRating = new Runnable() { // from class: o.checkNotNull
            @Override // java.lang.Runnable
            public final void run() {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
            }
        };
        Drawable drawable2 = this.onPlayFromSearch;
        if (drawable2 != null) {
            this.onPrepareFromUri = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.onPrepareFromUri = (Math.max(this.onPlayFromUri, Math.max(this.onPrepare, this.onPrepareFromMediaId)) + 1) / 2;
        }
        this.onRemoveQueueItemAt = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.onSeekTo = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.ceilingNextPowerOfTwo
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.read.read(valueAnimator2);
            }
        });
        this.MediaMetadataCompat = C.TIME_UNSET;
        this.onAddQueueItem = C.TIME_UNSET;
        this.MediaBrowserCompatMediaItem = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public final /* synthetic */ void IconCompatParcelizer() {
        write(false);
    }

    public final /* synthetic */ void read(ValueAnimator valueAnimator) {
        this.onRemoveQueueItemAt = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.onSetShuffleMode);
    }

    public final void AudioAttributesCompatParcelizer() {
        if (this.onSeekTo.isStarted()) {
            this.onSeekTo.cancel();
        }
        this.onRewind = false;
        this.onRemoveQueueItemAt = 1.0f;
        invalidate(this.onSetShuffleMode);
    }

    public final void RemoteActionCompatParcelizer() {
        if (this.onSeekTo.isStarted()) {
            this.onSeekTo.cancel();
        }
        this.onRewind = false;
        this.onSeekTo.setFloatValues(this.onRemoveQueueItemAt, 1.0f);
        this.onSeekTo.setDuration(250L);
        this.onSeekTo.start();
    }

    public final void read(boolean z) {
        if (this.onSeekTo.isStarted()) {
            this.onSeekTo.cancel();
        }
        this.onRewind = z;
        this.onRemoveQueueItemAt = BitmapDescriptorFactory.HUE_RED;
        invalidate(this.onSetShuffleMode);
    }

    public final void read() {
        if (this.onSeekTo.isStarted()) {
            this.onSeekTo.cancel();
        }
        this.onSeekTo.setFloatValues(this.onRemoveQueueItemAt, BitmapDescriptorFactory.HUE_RED);
        this.onSeekTo.setDuration(250L);
        this.onSeekTo.start();
    }

    public void setPlayedColor(int i) {
        this.onFastForward.setColor(i);
        invalidate(this.onSetShuffleMode);
    }

    public void setScrubberColor(int i) {
        this.onRemoveQueueItem.setColor(i);
        invalidate(this.onSetShuffleMode);
    }

    public void setBufferedColor(int i) {
        this.MediaBrowserCompatCustomActionResultReceiver.setColor(i);
        invalidate(this.onSetShuffleMode);
    }

    public void setUnplayedColor(int i) {
        this.onSkipToQueueItem.setColor(i);
        invalidate(this.onSetShuffleMode);
    }

    public void setAdMarkerColor(int i) {
        this.write.setColor(i);
        invalidate(this.onSetShuffleMode);
    }

    public void setPlayedAdMarkerColor(int i) {
        this.onMediaButtonEvent.setColor(i);
        invalidate(this.onSetShuffleMode);
    }

    @Override // kotlin.PrivateMaxEntriesMapRemovalTask
    public final void read(PrivateMaxEntriesMapRemovalTask.write writeVar) {
        this.handleMediaPlayPauseIfPendingOnHandler.add(writeVar);
    }

    public void setKeyTimeIncrement(long j) {
        buildTypeSerializer.IconCompatParcelizer(j > 0);
        this.MediaBrowserCompatMediaItem = -1;
        this.onAddQueueItem = j;
    }

    public void setKeyCountIncrement(int i) {
        buildTypeSerializer.IconCompatParcelizer(i > 0);
        this.MediaBrowserCompatMediaItem = i;
        this.onAddQueueItem = C.TIME_UNSET;
    }

    @Override // kotlin.PrivateMaxEntriesMapRemovalTask
    public void setPosition(long j) {
        if (this.onPlayFromMediaId == j) {
            return;
        }
        this.onPlayFromMediaId = j;
        setContentDescription(AudioAttributesImplBaseParcelizer());
        AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.PrivateMaxEntriesMapRemovalTask
    public void setBufferedPosition(long j) {
        if (this.MediaBrowserCompatItemReceiver == j) {
            return;
        }
        this.MediaBrowserCompatItemReceiver = j;
        AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.PrivateMaxEntriesMapRemovalTask
    public void setDuration(long j) {
        if (this.MediaMetadataCompat == j) {
            return;
        }
        this.MediaMetadataCompat = j;
        if (this.onSetRepeatMode && j == C.TIME_UNSET) {
            write(true);
        }
        AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.PrivateMaxEntriesMapRemovalTask
    public final long write() {
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, this.onPlay.width());
        if (iAudioAttributesCompatParcelizer == 0) {
            return Long.MAX_VALUE;
        }
        long j = this.MediaMetadataCompat;
        if (j == 0 || j == C.TIME_UNSET) {
            return Long.MAX_VALUE;
        }
        return j / ((long) iAudioAttributesCompatParcelizer);
    }

    @Override // kotlin.PrivateMaxEntriesMapRemovalTask
    public void setAdGroupTimesMs(long[] jArr, boolean[] zArr, int i) {
        buildTypeSerializer.IconCompatParcelizer(i == 0 || !(jArr == null || zArr == null));
        this.read = i;
        this.IconCompatParcelizer = jArr;
        this.onCommand = zArr;
        AudioAttributesImplApi21Parcelizer();
    }

    @Override // android.view.View, kotlin.PrivateMaxEntriesMapRemovalTask
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.onSetRepeatMode || z) {
            return;
        }
        write(true);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        AudioAttributesCompatParcelizer(canvas);
        IconCompatParcelizer(canvas);
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L75
            long r2 = r7.MediaMetadataCompat
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L75
            android.graphics.Point r0 = r7.read(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L5c
            r5 = 3
            if (r3 == r4) goto L4d
            r6 = 2
            if (r3 == r6) goto L27
            if (r3 == r5) goto L4d
            goto L75
        L27:
            boolean r8 = r7.onSetRepeatMode
            if (r8 == 0) goto L75
            int r8 = r7.MediaDescriptionCompat
            if (r0 >= r8) goto L39
            int r8 = r7.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.IconCompatParcelizer(r8)
            goto L3f
        L39:
            r7.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = r2
            float r8 = (float) r2
            r7.IconCompatParcelizer(r8)
        L3f:
            long r0 = r7.MediaBrowserCompatCustomActionResultReceiver()
            r7.RemoteActionCompatParcelizer(r0)
            r7.AudioAttributesImplApi21Parcelizer()
            r7.invalidate()
            return r4
        L4d:
            boolean r0 = r7.onSetRepeatMode
            if (r0 == 0) goto L75
            int r8 = r8.getAction()
            if (r8 != r5) goto L58
            r1 = r4
        L58:
            r7.write(r1)
            return r4
        L5c:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.AudioAttributesCompatParcelizer(r8, r0)
            if (r0 == 0) goto L75
            r7.IconCompatParcelizer(r8)
            long r0 = r7.MediaBrowserCompatCustomActionResultReceiver()
            r7.read(r0)
            r7.AudioAttributesImplApi21Parcelizer()
            r7.invalidate()
            return r4
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L30
            long r0 = r4.AudioAttributesImplApi26Parcelizer()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L30
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.AudioAttributesCompatParcelizer(r0)
            if (r0 == 0) goto L30
            java.lang.Runnable r5 = r4.onSetRating
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.onSetRating
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.onSetRepeatMode
            if (r0 == 0) goto L30
            r5 = 0
            r4.write(r5)
            return r3
        L30:
            boolean r4 = super.onKeyDown(r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.onSetRepeatMode || z) {
            return;
        }
        write(false);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        MediaBrowserCompatItemReceiver();
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.onPlayFromSearch;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.onSetCaptioningEnabled;
        } else if (mode != 1073741824) {
            size = Math.min(this.onSetCaptioningEnabled, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        MediaBrowserCompatItemReceiver();
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingBottom;
        int iMax;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i7 = this.onRewind ? 0 : this.onPrepareFromUri;
        if (this.RemoteActionCompatParcelizer == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - this.onSetCaptioningEnabled;
            int paddingBottom2 = getPaddingBottom();
            int i8 = this.AudioAttributesImplApi26Parcelizer;
            iMax = ((i6 - paddingBottom2) - i8) - Math.max(i7 - (i8 / 2), 0);
        } else {
            paddingBottom = (i6 - this.onSetCaptioningEnabled) / 2;
            iMax = (i6 - this.AudioAttributesImplApi26Parcelizer) / 2;
        }
        this.onSetShuffleMode.set(paddingLeft, paddingBottom, i5 - paddingRight, this.onSetCaptioningEnabled + paddingBottom);
        this.onPlay.set(this.onSetShuffleMode.left + i7, iMax, this.onSetShuffleMode.right - i7, this.AudioAttributesImplApi26Parcelizer + iMax);
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 29) {
            AudioAttributesCompatParcelizer(i5, i6);
        }
        AudioAttributesImplApi21Parcelizer();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.onPlayFromSearch;
        if (drawable == null || !AudioAttributesCompatParcelizer(drawable, i)) {
            return;
        }
        invalidate();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(AudioAttributesImplBaseParcelizer());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(AudioAttributesImplBaseParcelizer());
        if (this.MediaMetadataCompat <= 0) {
            return;
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.MediaMetadataCompat <= 0) {
            return false;
        }
        if (i == 8192) {
            if (AudioAttributesCompatParcelizer(-AudioAttributesImplApi26Parcelizer())) {
                write(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (AudioAttributesCompatParcelizer(AudioAttributesImplApi26Parcelizer())) {
                write(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    private void read(long j) {
        this.onPause = j;
        this.onSetRepeatMode = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<PrivateMaxEntriesMapRemovalTask.write> it = this.handleMediaPlayPauseIfPendingOnHandler.iterator();
        while (it.hasNext()) {
            it.next().RemoteActionCompatParcelizer(j);
        }
    }

    private void RemoteActionCompatParcelizer(long j) {
        if (this.onPause != j) {
            this.onPause = j;
            Iterator<PrivateMaxEntriesMapRemovalTask.write> it = this.handleMediaPlayPauseIfPendingOnHandler.iterator();
            while (it.hasNext()) {
                it.next().IconCompatParcelizer(j);
            }
        }
    }

    private void write(boolean z) {
        removeCallbacks(this.onSetRating);
        this.onSetRepeatMode = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<PrivateMaxEntriesMapRemovalTask.write> it = this.handleMediaPlayPauseIfPendingOnHandler.iterator();
        while (it.hasNext()) {
            it.next().RemoteActionCompatParcelizer(this.onPause, z);
        }
    }

    private boolean AudioAttributesCompatParcelizer(long j) {
        long j2 = this.MediaMetadataCompat;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.onSetRepeatMode ? this.onPause : this.onPlayFromMediaId;
        long j4 = LaissezFaireSubTypeValidator.read(j3 + j, 0L, j2);
        if (j4 == j3) {
            return false;
        }
        if (!this.onSetRepeatMode) {
            read(j4);
        } else {
            RemoteActionCompatParcelizer(j4);
        }
        AudioAttributesImplApi21Parcelizer();
        return true;
    }

    private void AudioAttributesImplApi21Parcelizer() {
        this.AudioAttributesImplBaseParcelizer.set(this.onPlay);
        this.onPrepareFromSearch.set(this.onPlay);
        long j = this.onSetRepeatMode ? this.onPause : this.onPlayFromMediaId;
        if (this.MediaMetadataCompat > 0) {
            this.AudioAttributesImplBaseParcelizer.right = Math.min(this.onPlay.left + ((int) ((((long) this.onPlay.width()) * this.MediaBrowserCompatItemReceiver) / this.MediaMetadataCompat)), this.onPlay.right);
            this.onPrepareFromSearch.right = Math.min(this.onPlay.left + ((int) ((((long) this.onPlay.width()) * j) / this.MediaMetadataCompat)), this.onPlay.right);
        } else {
            this.AudioAttributesImplBaseParcelizer.right = this.onPlay.left;
            this.onPrepareFromSearch.right = this.onPlay.left;
        }
        invalidate(this.onSetShuffleMode);
    }

    private void IconCompatParcelizer(float f) {
        this.onPrepareFromSearch.right = LaissezFaireSubTypeValidator.write((int) f, this.onPlay.left, this.onPlay.right);
    }

    private Point read(MotionEvent motionEvent) {
        this.onSetPlaybackSpeed.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.onSetPlaybackSpeed;
    }

    private long MediaBrowserCompatCustomActionResultReceiver() {
        if (this.onPlay.width() <= 0 || this.MediaMetadataCompat == C.TIME_UNSET) {
            return 0L;
        }
        return (((long) this.onPrepareFromSearch.width()) * this.MediaMetadataCompat) / ((long) this.onPlay.width());
    }

    private boolean AudioAttributesCompatParcelizer(float f, float f2) {
        return this.onSetShuffleMode.contains((int) f, (int) f2);
    }

    private void AudioAttributesCompatParcelizer(Canvas canvas) {
        int iHeight = this.onPlay.height();
        int iCenterY = this.onPlay.centerY() - (iHeight / 2);
        int i = iHeight + iCenterY;
        if (this.MediaMetadataCompat <= 0) {
            canvas.drawRect(this.onPlay.left, iCenterY, this.onPlay.right, i, this.onSkipToQueueItem);
            return;
        }
        int i2 = this.AudioAttributesImplBaseParcelizer.left;
        int i3 = this.AudioAttributesImplBaseParcelizer.right;
        int iMax = Math.max(Math.max(this.onPlay.left, i3), this.onPrepareFromSearch.right);
        if (iMax < this.onPlay.right) {
            canvas.drawRect(iMax, iCenterY, this.onPlay.right, i, this.onSkipToQueueItem);
        }
        int iMax2 = Math.max(i2, this.onPrepareFromSearch.right);
        if (i3 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i3, i, this.MediaBrowserCompatCustomActionResultReceiver);
        }
        if (this.onPrepareFromSearch.width() > 0) {
            canvas.drawRect(this.onPrepareFromSearch.left, iCenterY, this.onPrepareFromSearch.right, i, this.onFastForward);
        }
        if (this.read != 0) {
            long[] jArr = (long[]) buildTypeSerializer.IconCompatParcelizer(this.IconCompatParcelizer);
            boolean[] zArr = (boolean[]) buildTypeSerializer.IconCompatParcelizer(this.onCommand);
            int i4 = this.AudioAttributesCompatParcelizer / 2;
            for (int i5 = 0; i5 < this.read; i5++) {
                canvas.drawRect(this.onPlay.left + Math.min(this.onPlay.width() - this.AudioAttributesCompatParcelizer, Math.max(0, ((int) ((((long) this.onPlay.width()) * LaissezFaireSubTypeValidator.read(jArr[i5], 0L, this.MediaMetadataCompat)) / this.MediaMetadataCompat)) - i4)), iCenterY, r9 + this.AudioAttributesCompatParcelizer, i, zArr[i5] ? this.onMediaButtonEvent : this.write);
            }
        }
    }

    private void IconCompatParcelizer(Canvas canvas) {
        int i;
        if (this.MediaMetadataCompat <= 0) {
            return;
        }
        int iWrite = LaissezFaireSubTypeValidator.write(this.onPrepareFromSearch.right, this.onPrepareFromSearch.left, this.onPlay.right);
        int iCenterY = this.onPrepareFromSearch.centerY();
        if (this.onPlayFromSearch == null) {
            if (this.onSetRepeatMode || isFocused()) {
                i = this.onPrepareFromMediaId;
            } else {
                i = isEnabled() ? this.onPrepare : this.onPlayFromUri;
            }
            canvas.drawCircle(iWrite, iCenterY, (int) ((i * this.onRemoveQueueItemAt) / 2.0f), this.onRemoveQueueItem);
            return;
        }
        int intrinsicWidth = ((int) (r2.getIntrinsicWidth() * this.onRemoveQueueItemAt)) / 2;
        int intrinsicHeight = ((int) (this.onPlayFromSearch.getIntrinsicHeight() * this.onRemoveQueueItemAt)) / 2;
        this.onPlayFromSearch.setBounds(iWrite - intrinsicWidth, iCenterY - intrinsicHeight, iWrite + intrinsicWidth, iCenterY + intrinsicHeight);
        this.onPlayFromSearch.draw(canvas);
    }

    private void MediaBrowserCompatItemReceiver() {
        Drawable drawable = this.onPlayFromSearch;
        if (drawable != null && drawable.isStateful() && this.onPlayFromSearch.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void AudioAttributesCompatParcelizer(int i, int i2) {
        Rect rect = this.onCustomAction;
        if (rect != null && rect.width() == i && this.onCustomAction.height() == i2) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i, i2);
        this.onCustomAction = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    private String AudioAttributesImplBaseParcelizer() {
        return LaissezFaireSubTypeValidator.read(this.MediaBrowserCompatSearchResultReceiver, this.RatingCompat, this.onPlayFromMediaId);
    }

    private long AudioAttributesImplApi26Parcelizer() {
        long j = this.onAddQueueItem;
        if (j != C.TIME_UNSET) {
            return j;
        }
        long j2 = this.MediaMetadataCompat;
        if (j2 == C.TIME_UNSET) {
            return 0L;
        }
        return j2 / ((long) this.MediaBrowserCompatMediaItem);
    }

    private boolean IconCompatParcelizer(Drawable drawable) {
        return LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 23 && AudioAttributesCompatParcelizer(drawable, getLayoutDirection());
    }

    private static boolean AudioAttributesCompatParcelizer(Drawable drawable, int i) {
        return LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 23 && drawable.setLayoutDirection(i);
    }
}
