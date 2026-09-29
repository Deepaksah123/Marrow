package com.marrow.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
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
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.ui.TimeBar;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.marrow.ui.views.DefaultTimeBar;
import in.juspay.hyper.constants.LogCategory;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MediaPeriodId;
import kotlin.Metadata;
import kotlin.SubtitleDecoder;
import kotlin.getQues;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 ®\u00012\u00020\u00012\u00020\u0002:\u0006¬\u0001\u00ad\u0001®\u0001B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010Q\u001a\u00020R2\f\u00108\u001a\b\u0012\u0004\u0012\u00020:09¢\u0006\u0002\u0010SJ\u000e\u0010T\u001a\u00020R2\u0006\u0010U\u001a\u00020DJ\u000e\u0010V\u001a\u00020R2\u0006\u0010W\u001a\u00020\bJ\u0019\u0010X\u001a\u00020R2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020=09¢\u0006\u0002\u0010YJ\u0010\u0010Z\u001a\u00020R2\u0006\u0010[\u001a\u00020.H\u0016J\u000e\u0010\\\u001a\u00020R2\u0006\u0010/\u001a\u000200J\u0010\u0010]\u001a\u00020R2\u0006\u0010[\u001a\u00020.H\u0016J\u0010\u0010^\u001a\u00020R2\u0006\u0010_\u001a\u00020AH\u0016J\u0010\u0010`\u001a\u00020R2\u0006\u0010a\u001a\u00020\bH\u0016J\u0010\u0010b\u001a\u00020R2\u0006\u0010H\u001a\u00020AH\u0016J\u0010\u0010c\u001a\u00020R2\u0006\u0010J\u001a\u00020AH\u0016J\u0010\u0010d\u001a\u00020R2\u0006\u0010G\u001a\u00020AH\u0016J\b\u0010e\u001a\u00020AH\u0016J$\u0010f\u001a\u00020R2\b\u0010L\u001a\u0004\u0018\u00010M2\b\u0010N\u001a\u0004\u0018\u00010O2\u0006\u0010K\u001a\u00020\bH\u0016J\u0010\u0010g\u001a\u00020R2\u0006\u0010h\u001a\u00020DH\u0016J\u0010\u0010i\u001a\u00020R2\u0006\u0010j\u001a\u00020kH\u0016J\u0010\u0010l\u001a\u00020R2\u0006\u0010j\u001a\u00020kH\u0002J\u0010\u0010m\u001a\u00020R2\u0006\u0010j\u001a\u00020kH\u0002J\u0010\u0010n\u001a\u00020D2\u0006\u0010o\u001a\u00020pH\u0016J\u0018\u0010q\u001a\u00020D2\u0006\u0010r\u001a\u00020\b2\u0006\u0010o\u001a\u00020sH\u0016J\"\u0010t\u001a\u00020R2\u0006\u0010u\u001a\u00020D2\u0006\u0010v\u001a\u00020\b2\b\u0010w\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010x\u001a\u00020RH\u0014J\b\u0010y\u001a\u00020RH\u0016J\u0018\u0010z\u001a\u00020R2\u0006\u0010{\u001a\u00020\b2\u0006\u0010|\u001a\u00020\bH\u0014J3\u0010}\u001a\u00020R2\u0006\u0010~\u001a\u00020D2\u0006\u0010\u007f\u001a\u00020\b2\u0007\u0010\u0080\u0001\u001a\u00020\b2\u0007\u0010\u0081\u0001\u001a\u00020\b2\u0007\u0010\u0082\u0001\u001a\u00020\bH\u0014J\u0012\u0010\u0083\u0001\u001a\u00020R2\u0007\u0010\u0084\u0001\u001a\u00020\bH\u0016J\u0012\u0010\u0085\u0001\u001a\u00020R2\u0007\u0010o\u001a\u00030\u0086\u0001H\u0016J\u0013\u0010\u0087\u0001\u001a\u00020R2\b\u0010\u0088\u0001\u001a\u00030\u0089\u0001H\u0016J\u001e\u0010\u008a\u0001\u001a\u00020D2\u0007\u0010\u008b\u0001\u001a\u00020\b2\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008d\u0001H\u0016J\u0011\u0010\u008e\u0001\u001a\u00020R2\u0006\u0010F\u001a\u00020AH\u0002J\u0011\u0010\u008f\u0001\u001a\u00020R2\u0006\u0010F\u001a\u00020AH\u0002J\u0012\u0010\u0090\u0001\u001a\u00020R2\u0007\u0010\u0091\u0001\u001a\u00020DH\u0002J\u0012\u0010\u0092\u0001\u001a\u00020D2\u0007\u0010\u0093\u0001\u001a\u00020AH\u0002J\t\u0010\u0094\u0001\u001a\u00020RH\u0002J\u0012\u0010\u0095\u0001\u001a\u00020R2\u0007\u0010\u0096\u0001\u001a\u000206H\u0002J\u0012\u0010\u0097\u0001\u001a\u0002042\u0007\u0010\u0098\u0001\u001a\u00020pH\u0002J\u001b\u0010\u009c\u0001\u001a\u00020D2\u0007\u0010\u009d\u0001\u001a\u0002062\u0007\u0010\u009e\u0001\u001a\u000206H\u0002J\u0011\u0010\u009f\u0001\u001a\u00020R2\u0006\u0010j\u001a\u00020kH\u0002J\u0011\u0010 \u0001\u001a\u00020R2\u0006\u0010j\u001a\u00020kH\u0002J\t\u0010¡\u0001\u001a\u00020RH\u0002J\u0012\u0010¨\u0001\u001a\u00020D2\u0007\u0010©\u0001\u001a\u00020\u001cH\u0002J\u0010\u0010ª\u0001\u001a\u00020R2\u0007\u0010«\u0001\u001a\u00020OR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010%\u001a\u00060&j\u0002`'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u00108\u001a\n\u0012\u0004\u0012\u00020:\u0018\u000109X\u0082\u000e¢\u0006\u0004\n\u0002\u0010;R\u0018\u0010<\u001a\n\u0012\u0004\u0012\u00020=\u0018\u000109X\u0082\u000e¢\u0006\u0004\n\u0002\u0010>R\u000e\u0010?\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020AX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020DX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020DX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020AX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020AX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020AX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020AX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010L\u001a\u0004\u0018\u00010MX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010N\u001a\u0004\u0018\u00010OX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020DX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0099\u0001\u001a\u00020A8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0018\u0010¢\u0001\u001a\u00030£\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001R\u0017\u0010¦\u0001\u001a\u00020A8BX\u0082\u0004¢\u0006\b\u001a\u0006\b§\u0001\u0010\u009b\u0001¨\u0006¯\u0001"}, d2 = {"Lcom/marrow/ui/views/DefaultTimeBar;", "Landroid/view/View;", "Lcom/google/android/exoplayer2/ui/TimeBar;", LogCategory.CONTEXT, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "timebarAttrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/util/AttributeSet;)V", "seekBounds", "Landroid/graphics/Rect;", "progressBar", "bufferedBar", "scrubberBar", "playedPaint", "Landroid/graphics/Paint;", "timelineIndicatorPaint", "timelineIndicatorNotReachedPaint", "bufferedPaint", "unplayedPaint", "adMarkerPaint", "playedAdMarkerPaint", "scrubberPaint", "subtitleMarkerPaint", "scrubberDrawable", "Landroid/graphics/drawable/Drawable;", "barHeight", "touchTargetHeight", "adMarkerWidth", "scrubberEnabledSize", "scrubberDisabledSize", "scrubberDraggedSize", "scrubberPadding", "fineScrubYThreshold", "formatBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "formatter", "Ljava/util/Formatter;", "stopScrubbingRunnable", "Ljava/lang/Runnable;", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/google/android/exoplayer2/ui/TimeBar$OnScrubListener;", "scrubEventListener", "Lcom/marrow/listeners/ScrubEventListener;", "locationOnScreen", "", "touchPosition", "Landroid/graphics/Point;", "density", "", "totalVideoDuration", "markers", "", "Lcom/marrow/ui/views/DefaultTimeBar$Marker;", "[Lcom/marrow/ui/views/DefaultTimeBar$Marker;", "timelines", "Lcom/marrow/ui/views/DefaultTimeBar$TimelineIndicator;", "[Lcom/marrow/ui/views/DefaultTimeBar$TimelineIndicator;", "keyCountIncrement", "keyTimeIncrement", "", "lastCoarseScrubXPosition", "scrubbing", "", "enableSubtitleMarkers", "scrubPosition", "duration", "position", "timelineIndicatorRadius", "bufferedPosition", "adGroupCount", "adGroupTimesMs", "", "playedAdGroups", "", "isLockedFromSeek", "setMarkers", "", "([Lcom/marrow/ui/views/DefaultTimeBar$Marker;)V", "setLockedFromSeek", "isLocked", "setTotalVideoDuration", "sTotalVideoDuration", "setTimelines", "([Lcom/marrow/ui/views/DefaultTimeBar$TimelineIndicator;)V", "addListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addScrubEventListener", "removeListener", "setKeyTimeIncrement", "time", "setKeyCountIncrement", "count", "setPosition", "setBufferedPosition", "setDuration", "getPreferredUpdateDelay", "setAdGroupTimesMs", "setEnabled", "enabled", "onDraw", "canvas", "Landroid/graphics/Canvas;", "drawSubtitleMarkers", "drawTimelines", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "onKeyDown", "keyCode", "Landroid/view/KeyEvent;", "onFocusChanged", "gainFocus", "direction", "previouslyFocusedRect", "drawableStateChanged", "jumpDrawablesToCurrentState", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "onRtlPropertiesChanged", "layoutDirection", "onInitializeAccessibilityEvent", "Landroid/view/accessibility/AccessibilityEvent;", "onInitializeAccessibilityNodeInfo", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "performAccessibilityAction", "action", "args", "Landroid/os/Bundle;", "startScrubbing", "updateScrubbing", "stopScrubbing", "canceled", "scrubIncrementally", "positionChange", "update", "positionScrubber", "xPosition", "resolveRelativeTouchPosition", "motionEvent", "scrubberPosition", "getScrubberPosition", "()J", "isInSeekBar", "x", "y", "drawTimeBar", "drawPlayhead", "updateDrawableState", "progressText", "", "getProgressText", "()Ljava/lang/String;", "positionIncrement", "getPositionIncrement", "setDrawableLayoutDirection", "drawable", "updateTimelineIndicators", "timelineIndicatorStates", "Marker", "TimelineIndicator", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DefaultTimeBar extends View implements TimeBar {
    private int AudioAttributesImplApi21Parcelizer;
    private final Paint AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private final Paint MediaBrowserCompatCustomActionResultReceiver;
    private final Rect MediaBrowserCompatItemReceiver;
    private long MediaBrowserCompatMediaItem;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private final Formatter MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final int MediaDescriptionCompat;
    private long MediaMetadataCompat;
    private final Point MediaSessionCompatQueueItem;
    private final Paint MediaSessionCompatResultReceiverWrapper;
    private int MediaSessionCompatToken;
    private int ParcelableVolumeInfo;
    private AudioAttributesCompatParcelizer[] PlaybackStateCompat;
    private final float RatingCompat;
    private long[] RemoteActionCompatParcelizer;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private long onAddQueueItem;
    private boolean onCommand;
    private final StringBuilder onCustomAction;
    private boolean[] onFastForward;
    private RemoteActionCompatParcelizer[] onMediaButtonEvent;
    private int onPause;
    private final CopyOnWriteArraySet<TimeBar.OnScrubListener> onPlay;
    private final int[] onPlayFromMediaId;
    private SubtitleDecoder onPlayFromSearch;
    private final Paint onPlayFromUri;
    private final Rect onPrepare;
    private long onPrepareFromMediaId;
    private final Paint onPrepareFromSearch;
    private Drawable onPrepareFromUri;
    private long onRemoveQueueItem;
    private int onRemoveQueueItemAt;
    private final Rect onRewind;
    private int onSeekTo;
    private final Rect onSetCaptioningEnabled;
    private int onSetPlaybackSpeed;
    private int onSetRating;
    private boolean onSetRepeatMode;
    private final Paint onSetShuffleMode;
    private final Paint onSkipToNext;
    private final Paint onSkipToPrevious;
    private final int onSkipToQueueItem;
    private final Paint onStop;
    private final Runnable setSessionImpl;
    private int write;
    public static final write IconCompatParcelizer = new write(null);
    private static final int AudioAttributesCompatParcelizer = Color.parseColor("#62c8df");
    private static final int read = Color.parseColor("#d56f62");

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0005\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/marrow/ui/views/DefaultTimeBar$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "read", "I", "AudioAttributesCompatParcelizer", "", "IconCompatParcelizer", "Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        public boolean read;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        public int AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/marrow/ui/views/DefaultTimeBar$RemoteActionCompatParcelizer;", "", "<init>", "()V", "", "IconCompatParcelizer", "J", "AudioAttributesCompatParcelizer", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        public long AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        public long IconCompatParcelizer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        toMagicModuleMetaRepoModel.write(context, "");
        this.onSetCaptioningEnabled = new Rect();
        this.onPrepare = new Rect();
        this.MediaBrowserCompatItemReceiver = new Rect();
        this.onRewind = new Rect();
        Paint paint = new Paint();
        this.onPrepareFromSearch = paint;
        Paint paint2 = new Paint();
        this.AudioAttributesImplApi26Parcelizer = paint2;
        Paint paint3 = new Paint();
        this.MediaSessionCompatResultReceiverWrapper = paint3;
        Paint paint4 = new Paint();
        this.onStop = paint4;
        Paint paint5 = new Paint();
        this.MediaBrowserCompatCustomActionResultReceiver = paint5;
        Paint paint6 = new Paint();
        this.onSkipToPrevious = paint6;
        Paint paint7 = new Paint();
        this.onSkipToNext = paint7;
        Paint paint8 = new Paint();
        this.onPlayFromUri = paint8;
        Paint paint9 = new Paint();
        this.onSetShuffleMode = paint9;
        paint9.setAntiAlias(true);
        this.onPlay = new CopyOnWriteArraySet<>();
        this.onPlayFromMediaId = new int[2];
        this.MediaSessionCompatQueueItem = new Point();
        paint4.setStyle(Paint.Style.FILL);
        paint4.setColor(read);
        paint6.setStyle(Paint.Style.FILL);
        paint7.setStyle(Paint.Style.FILL);
        paint6.setColor(AudioAttributesCompatParcelizer);
        paint7.setColor(-1);
        this.onSkipToQueueItem = 16;
        float f = context.getResources().getDisplayMetrics().density;
        this.RatingCompat = f;
        this.MediaDescriptionCompat = write.AudioAttributesCompatParcelizer(f, -50);
        int iAudioAttributesCompatParcelizer = write.AudioAttributesCompatParcelizer(f, 4);
        int iAudioAttributesCompatParcelizer2 = write.AudioAttributesCompatParcelizer(f, 26);
        int iAudioAttributesCompatParcelizer3 = write.AudioAttributesCompatParcelizer(f, 4);
        int iAudioAttributesCompatParcelizer4 = write.AudioAttributesCompatParcelizer(f, 12);
        int iAudioAttributesCompatParcelizer5 = write.AudioAttributesCompatParcelizer(f, 0);
        int iAudioAttributesCompatParcelizer6 = write.AudioAttributesCompatParcelizer(f, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, MediaPeriodId.AudioAttributesCompatParcelizer.DefaultTimeBar, 0, 0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(typedArrayObtainStyledAttributes, "");
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.onPrepareFromUri = drawable;
                if (drawable != null) {
                    read(drawable);
                    iAudioAttributesCompatParcelizer2 = getQues.write(drawable.getMinimumHeight(), iAudioAttributesCompatParcelizer2);
                }
                this.AudioAttributesImplApi21Parcelizer = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iAudioAttributesCompatParcelizer);
                this.MediaSessionCompatToken = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iAudioAttributesCompatParcelizer2);
                this.AudioAttributesImplBaseParcelizer = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iAudioAttributesCompatParcelizer3);
                this.onSetRating = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iAudioAttributesCompatParcelizer4);
                this.onSeekTo = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iAudioAttributesCompatParcelizer5);
                this.onRemoveQueueItemAt = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iAudioAttributesCompatParcelizer6);
                int i2 = typedArrayObtainStyledAttributes.getInt(6, -1);
                int i3 = typedArrayObtainStyledAttributes.getInt(7, write.IconCompatParcelizer(i2));
                int i4 = typedArrayObtainStyledAttributes.getInt(4, write.write(i2));
                int i5 = typedArrayObtainStyledAttributes.getInt(13, write.RemoteActionCompatParcelizer(i2));
                int i6 = typedArrayObtainStyledAttributes.getInt(0, com.google.android.exoplayer2.ui.DefaultTimeBar.DEFAULT_AD_MARKER_COLOR);
                int i7 = typedArrayObtainStyledAttributes.getInt(5, write.AudioAttributesCompatParcelizer(i6));
                paint.setColor(i2);
                paint9.setColor(i3);
                paint2.setColor(i4);
                paint3.setColor(i5);
                paint5.setColor(i6);
                paint8.setColor(i7);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } else {
            this.AudioAttributesImplApi21Parcelizer = iAudioAttributesCompatParcelizer;
            this.MediaSessionCompatToken = iAudioAttributesCompatParcelizer2;
            this.AudioAttributesImplBaseParcelizer = iAudioAttributesCompatParcelizer3;
            this.onSetRating = iAudioAttributesCompatParcelizer4;
            this.onSeekTo = iAudioAttributesCompatParcelizer5;
            this.onRemoveQueueItemAt = iAudioAttributesCompatParcelizer6;
            paint.setColor(-1);
            paint9.setColor(write.IconCompatParcelizer(-1));
            paint2.setColor(write.write(-1));
            paint3.setColor(write.RemoteActionCompatParcelizer(-1));
            paint5.setColor(com.google.android.exoplayer2.ui.DefaultTimeBar.DEFAULT_AD_MARKER_COLOR);
            this.onPrepareFromUri = null;
        }
        StringBuilder sb = new StringBuilder();
        this.onCustomAction = sb;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new Formatter(sb, Locale.getDefault());
        this.setSessionImpl = new Runnable() { // from class: o.isInSeekBar
            @Override // java.lang.Runnable
            public final void run() {
                DefaultTimeBar.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
            }
        };
        Drawable drawable2 = this.onPrepareFromUri;
        this.onSetPlaybackSpeed = ((drawable2 != null ? drawable2.getMinimumWidth() : Math.max(this.onSeekTo, Math.max(this.onSetRating, this.onRemoveQueueItemAt))) + 1) / 2;
        this.MediaBrowserCompatMediaItem = C.TIME_UNSET;
        this.onAddQueueItem = C.TIME_UNSET;
        this.handleMediaPlayPauseIfPendingOnHandler = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? attributeSet : attributeSet2);
    }

    public final void setMarkers(RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr) {
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizerArr, "");
        this.onMediaButtonEvent = remoteActionCompatParcelizerArr;
        invalidate();
    }

    public final void setLockedFromSeek(boolean isLocked) {
        this.onCommand = isLocked;
        boolean z = !isLocked;
        setEnabled(z);
        setFocusable(z);
        setFocusableInTouchMode(z);
    }

    public final void setTotalVideoDuration(int sTotalVideoDuration) {
        this.ParcelableVolumeInfo = sTotalVideoDuration;
    }

    public final void setTimelines(AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizerArr, "");
        this.PlaybackStateCompat = audioAttributesCompatParcelizerArr;
        invalidate();
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public final void addListener(TimeBar.OnScrubListener listener) {
        toMagicModuleMetaRepoModel.write(listener, "");
        this.onPlay.add(listener);
    }

    public final void IconCompatParcelizer(SubtitleDecoder subtitleDecoder) {
        toMagicModuleMetaRepoModel.write(subtitleDecoder, "");
        this.onPlayFromSearch = subtitleDecoder;
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public final void removeListener(TimeBar.OnScrubListener listener) {
        toMagicModuleMetaRepoModel.write(listener, "");
        this.onPlay.remove(listener);
        this.onPlayFromSearch = null;
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public final void setKeyTimeIncrement(long time) {
        Assertions.checkArgument(time > 0);
        this.handleMediaPlayPauseIfPendingOnHandler = -1;
        this.onAddQueueItem = time;
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public final void setKeyCountIncrement(int count) {
        Assertions.checkArgument(count > 0);
        this.handleMediaPlayPauseIfPendingOnHandler = count;
        this.onAddQueueItem = C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public final void setPosition(long position) {
        this.onPrepareFromMediaId = position;
        setContentDescription(write());
        AudioAttributesCompatParcelizer();
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public final void setBufferedPosition(long bufferedPosition) {
        this.MediaMetadataCompat = bufferedPosition;
        AudioAttributesCompatParcelizer();
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public final void setDuration(long duration) {
        this.MediaBrowserCompatMediaItem = duration;
        if (this.onSetRepeatMode && duration == C.TIME_UNSET) {
            write(true);
        }
        AudioAttributesCompatParcelizer();
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public final long getPreferredUpdateDelay() {
        int i = write.read(this.RatingCompat, this.onPrepare.width());
        if (i == 0) {
            return Long.MAX_VALUE;
        }
        long j = this.MediaBrowserCompatMediaItem;
        if (j == 0 || j == C.TIME_UNSET) {
            return Long.MAX_VALUE;
        }
        return j / ((long) i);
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public final void setAdGroupTimesMs(long[] adGroupTimesMs, boolean[] playedAdGroups, int adGroupCount) {
        Assertions.checkArgument(adGroupCount == 0 || !(adGroupTimesMs == null || playedAdGroups == null));
        this.write = adGroupCount;
        this.RemoteActionCompatParcelizer = adGroupTimesMs;
        this.onFastForward = playedAdGroups;
        AudioAttributesCompatParcelizer();
    }

    @Override // android.view.View, com.google.android.exoplayer2.ui.TimeBar
    public final void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if (!this.onSetRepeatMode || enabled) {
            return;
        }
        write(true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        toMagicModuleMetaRepoModel.write(canvas, "");
        canvas.save();
        AudioAttributesCompatParcelizer(canvas);
        write(canvas);
        read(canvas);
        canvas.restore();
    }

    private final void write(Canvas canvas) {
        AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr = this.PlaybackStateCompat;
        if (audioAttributesCompatParcelizerArr == null || this.ParcelableVolumeInfo == 0) {
            return;
        }
        int iCenterY = this.onRewind.centerY();
        int i = this.onSkipToQueueItem / 2;
        int width = getWidth();
        for (AudioAttributesCompatParcelizer audioAttributesCompatParcelizer : audioAttributesCompatParcelizerArr) {
            canvas.drawCircle(((int) (width * (r6.AudioAttributesCompatParcelizer / this.ParcelableVolumeInfo))) + this.onRewind.left, iCenterY, i, audioAttributesCompatParcelizer.read ? this.onSkipToPrevious : this.onSkipToNext);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            kotlin.toMagicModuleMetaRepoModel.write(r9, r0)
            boolean r1 = r8.onCommand
            r2 = 1
            if (r1 != 0) goto La0
            boolean r1 = r8.isEnabled()
            if (r1 == 0) goto La0
            long r3 = r8.MediaBrowserCompatMediaItem
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto La0
            android.graphics.Point r1 = r8.read(r9)
            int r3 = r1.x
            int r1 = r1.y
            int r4 = r9.getAction()
            r5 = 0
            if (r4 == 0) goto L86
            r6 = 3
            if (r4 == r2) goto L77
            r7 = 2
            if (r4 == r7) goto L30
            if (r4 == r6) goto L77
            goto L9f
        L30:
            boolean r9 = r8.onSetRepeatMode
            if (r9 == 0) goto L9f
            int r9 = r8.MediaDescriptionCompat
            if (r1 >= r9) goto L45
            int r9 = r8.onPause
            float r1 = (float) r9
            int r3 = r3 - r9
            float r9 = (float) r3
            r3 = 1077936128(0x40400000, float:3.0)
            float r9 = r9 / r3
            float r1 = r1 + r9
            r8.RemoteActionCompatParcelizer(r1)
            goto L4b
        L45:
            r8.onPause = r3
            float r9 = (float) r3
            r8.RemoteActionCompatParcelizer(r9)
        L4b:
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.exoplayer2.ui.TimeBar$OnScrubListener> r9 = r8.onPlay
            java.util.Iterator r9 = r9.iterator()
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r9, r0)
        L54:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r0 = r9.next()
            com.google.android.exoplayer2.ui.TimeBar$OnScrubListener r0 = (com.google.android.exoplayer2.ui.TimeBar.OnScrubListener) r0
            r1 = r8
            com.google.android.exoplayer2.ui.TimeBar r1 = (com.google.android.exoplayer2.ui.TimeBar) r1
            long r3 = r8.onRemoveQueueItem
            r0.onScrubMove(r1, r3)
            goto L54
        L69:
            long r0 = r8.IconCompatParcelizer()
            r8.RemoteActionCompatParcelizer(r0)
            r8.AudioAttributesCompatParcelizer()
            r8.invalidate()
            return r2
        L77:
            boolean r0 = r8.onSetRepeatMode
            if (r0 == 0) goto L9f
            int r9 = r9.getAction()
            if (r9 != r6) goto L82
            r5 = r2
        L82:
            r8.write(r5)
            return r2
        L86:
            float r9 = (float) r3
            float r0 = (float) r1
            boolean r0 = r8.AudioAttributesCompatParcelizer(r9, r0)
            if (r0 == 0) goto L9f
            r8.RemoteActionCompatParcelizer(r9)
            long r0 = r8.IconCompatParcelizer()
            r8.write(r0)
            r8.AudioAttributesCompatParcelizer()
            r8.invalidate()
            return r2
        L9f:
            return r5
        La0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.views.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onKeyDown(int r7, android.view.KeyEvent r8) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            kotlin.toMagicModuleMetaRepoModel.write(r8, r0)
            boolean r0 = r6.isEnabled()
            if (r0 == 0) goto L4a
            boolean r0 = r6.onCommand
            if (r0 != 0) goto L4a
            long r0 = r6.read()
            r2 = 66
            r3 = 1
            if (r7 == r2) goto L41
            r4 = 1000(0x3e8, double:4.94E-321)
            switch(r7) {
                case 21: goto L2f;
                case 22: goto L1e;
                case 23: goto L41;
                default: goto L1d;
            }
        L1d:
            goto L4a
        L1e:
            boolean r0 = r6.AudioAttributesCompatParcelizer(r0)
            if (r0 == 0) goto L4a
            java.lang.Runnable r7 = r6.setSessionImpl
            r6.removeCallbacks(r7)
            java.lang.Runnable r7 = r6.setSessionImpl
            r6.postDelayed(r7, r4)
            return r3
        L2f:
            long r0 = -r0
            boolean r0 = r6.AudioAttributesCompatParcelizer(r0)
            if (r0 == 0) goto L4a
            java.lang.Runnable r7 = r6.setSessionImpl
            r6.removeCallbacks(r7)
            java.lang.Runnable r7 = r6.setSessionImpl
            r6.postDelayed(r7, r4)
            return r3
        L41:
            boolean r0 = r6.onSetRepeatMode
            if (r0 == 0) goto L4a
            r7 = 0
            r6.write(r7)
            return r3
        L4a:
            boolean r6 = super.onKeyDown(r7, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.views.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    protected final void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        if (!this.onSetRepeatMode || gainFocus) {
            return;
        }
        write(false);
    }

    @Override // android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        RemoteActionCompatParcelizer();
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.onPrepareFromUri;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        int size = View.MeasureSpec.getSize(heightMeasureSpec);
        if (mode == 0) {
            size = this.MediaSessionCompatToken;
        } else if (mode != 1073741824) {
            size = Math.min(this.MediaSessionCompatToken, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), size);
        RemoteActionCompatParcelizer();
    }

    @Override // android.view.View
    protected final void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int i = ((bottom - top) - this.MediaSessionCompatToken) / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i2 = this.MediaSessionCompatToken;
        int i3 = ((i2 - this.AudioAttributesImplApi21Parcelizer) / 2) + i;
        this.onSetCaptioningEnabled.set(paddingLeft, i, (right - left) - paddingRight, i2 + i);
        this.onPrepare.set(this.onSetCaptioningEnabled.left + this.onSetPlaybackSpeed, i3, this.onSetCaptioningEnabled.right - this.onSetPlaybackSpeed, this.AudioAttributesImplApi21Parcelizer + i3);
        AudioAttributesCompatParcelizer();
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int layoutDirection) {
        Drawable drawable = this.onPrepareFromUri;
        if (drawable == null || !write.IconCompatParcelizer(drawable, layoutDirection)) {
            return;
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        toMagicModuleMetaRepoModel.write(event, "");
        super.onInitializeAccessibilityEvent(event);
        if (event.getEventType() == 4) {
            event.getText().add(write());
        }
        event.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        toMagicModuleMetaRepoModel.write(info, "");
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName("android.widget.SeekBar");
        info.setContentDescription(write());
        if (this.MediaBrowserCompatMediaItem <= 0) {
            return;
        }
        info.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        info.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int action, Bundle args) {
        if (super.performAccessibilityAction(action, args)) {
            return true;
        }
        if (this.MediaBrowserCompatMediaItem <= 0) {
            return false;
        }
        if (action != 4096) {
            if (action != 8192) {
                return false;
            }
            if (AudioAttributesCompatParcelizer(-read())) {
                write(false);
            }
        } else if (AudioAttributesCompatParcelizer(read())) {
            write(false);
        }
        sendAccessibilityEvent(4);
        return true;
    }

    private final void write(long j) {
        this.onRemoveQueueItem = j;
        this.onSetRepeatMode = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<TimeBar.OnScrubListener> it = this.onPlay.iterator();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(it, "");
        while (it.hasNext()) {
            it.next().onScrubStart(this, j);
        }
    }

    private final void RemoteActionCompatParcelizer(long j) {
        if (this.onRemoveQueueItem != j) {
            this.onRemoveQueueItem = j;
            Iterator<TimeBar.OnScrubListener> it = this.onPlay.iterator();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(it, "");
            while (it.hasNext()) {
                it.next().onScrubMove(this, j);
            }
        }
    }

    private final void write(boolean z) {
        SubtitleDecoder subtitleDecoder;
        long j = this.onRemoveQueueItem;
        long j2 = this.onPrepareFromMediaId;
        if (j > j2) {
            SubtitleDecoder subtitleDecoder2 = this.onPlayFromSearch;
            if (subtitleDecoder2 != null) {
                subtitleDecoder2.AudioAttributesCompatParcelizer();
            }
        } else if (j < j2 && (subtitleDecoder = this.onPlayFromSearch) != null) {
            subtitleDecoder.read();
        }
        removeCallbacks(this.setSessionImpl);
        this.onSetRepeatMode = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<TimeBar.OnScrubListener> it = this.onPlay.iterator();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(it, "");
        while (it.hasNext()) {
            it.next().onScrubStop(this, this.onRemoveQueueItem, z);
        }
    }

    private final boolean AudioAttributesCompatParcelizer(long j) {
        long j2 = this.MediaBrowserCompatMediaItem;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.onSetRepeatMode ? this.onRemoveQueueItem : this.onPrepareFromMediaId;
        long jConstrainValue = Util.constrainValue(j3 + j, 0L, j2);
        if (jConstrainValue == j3) {
            return false;
        }
        if (!this.onSetRepeatMode) {
            write(jConstrainValue);
        } else {
            RemoteActionCompatParcelizer(jConstrainValue);
        }
        AudioAttributesCompatParcelizer();
        return true;
    }

    private final void AudioAttributesCompatParcelizer() {
        this.MediaBrowserCompatItemReceiver.set(this.onPrepare);
        this.onRewind.set(this.onPrepare);
        long j = this.onSetRepeatMode ? this.onRemoveQueueItem : this.onPrepareFromMediaId;
        if (this.MediaBrowserCompatMediaItem > 0) {
            this.MediaBrowserCompatItemReceiver.right = Math.min(this.onPrepare.left + ((int) ((((long) this.onPrepare.width()) * this.MediaMetadataCompat) / this.MediaBrowserCompatMediaItem)), this.onPrepare.right);
            this.onRewind.right = Math.min(this.onPrepare.left + ((int) ((((long) this.onPrepare.width()) * j) / this.MediaBrowserCompatMediaItem)), this.onPrepare.right);
        } else {
            this.MediaBrowserCompatItemReceiver.right = this.onPrepare.left;
            this.onRewind.right = this.onPrepare.left;
        }
        invalidate(this.onSetCaptioningEnabled);
    }

    private final void RemoteActionCompatParcelizer(float f) {
        this.onRewind.right = Util.constrainValue((int) f, this.onPrepare.left, this.onPrepare.right);
    }

    private final Point read(MotionEvent motionEvent) {
        getLocationOnScreen(this.onPlayFromMediaId);
        this.MediaSessionCompatQueueItem.set(((int) motionEvent.getRawX()) - this.onPlayFromMediaId[0], ((int) motionEvent.getRawY()) - this.onPlayFromMediaId[1]);
        return this.MediaSessionCompatQueueItem;
    }

    private final long IconCompatParcelizer() {
        if (this.onPrepare.width() <= 0 || this.MediaBrowserCompatMediaItem == C.TIME_UNSET) {
            return 0L;
        }
        return (((long) this.onRewind.width()) * this.MediaBrowserCompatMediaItem) / ((long) this.onPrepare.width());
    }

    private final boolean AudioAttributesCompatParcelizer(float f, float f2) {
        return this.onSetCaptioningEnabled.contains((int) f, (int) f2);
    }

    private final void AudioAttributesCompatParcelizer(Canvas canvas) {
        int iHeight = this.onPrepare.height();
        int iCenterY = this.onPrepare.centerY() - (iHeight / 2);
        int i = iHeight + iCenterY;
        if (this.MediaBrowserCompatMediaItem <= 0) {
            canvas.drawRect(this.onPrepare.left, iCenterY, this.onPrepare.right, i, this.MediaSessionCompatResultReceiverWrapper);
            return;
        }
        int i2 = this.MediaBrowserCompatItemReceiver.left;
        int i3 = this.MediaBrowserCompatItemReceiver.right;
        int iWrite = getQues.write(getQues.write(this.onPrepare.left, i3), this.onRewind.right);
        if (iWrite < this.onPrepare.right) {
            canvas.drawRect(iWrite, iCenterY, this.onPrepare.right, i, this.MediaSessionCompatResultReceiverWrapper);
        }
        int iWrite2 = getQues.write(i2, this.onRewind.right);
        if (i3 > iWrite2) {
            canvas.drawRect(iWrite2, iCenterY, i3, i, this.AudioAttributesImplApi26Parcelizer);
        }
        if (this.onRewind.width() > 0) {
            canvas.drawRect(this.onRewind.left, iCenterY, this.onRewind.right, i, this.onPrepareFromSearch);
        }
        if (this.write != 0) {
            Object objCheckNotNull = Assertions.checkNotNull(this.RemoteActionCompatParcelizer);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objCheckNotNull, "");
            long[] jArr = (long[]) objCheckNotNull;
            Object objCheckNotNull2 = Assertions.checkNotNull(this.onFastForward);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objCheckNotNull2, "");
            boolean[] zArr = (boolean[]) objCheckNotNull2;
            int i4 = this.AudioAttributesImplBaseParcelizer / 2;
            int i5 = this.write;
            for (int i6 = 0; i6 < i5; i6++) {
                int iWidth = (int) ((((long) this.onPrepare.width()) * Util.constrainValue(jArr[i6], 0L, this.MediaBrowserCompatMediaItem)) / this.MediaBrowserCompatMediaItem);
                float fRemoteActionCompatParcelizer = this.onPrepare.left + getQues.RemoteActionCompatParcelizer(this.onPrepare.width() - this.AudioAttributesImplBaseParcelizer, getQues.write(0, iWidth - i4));
                canvas.drawRect(fRemoteActionCompatParcelizer, iCenterY, fRemoteActionCompatParcelizer + this.AudioAttributesImplBaseParcelizer, i, zArr[i6] ? this.onPlayFromUri : this.MediaBrowserCompatCustomActionResultReceiver);
            }
        }
    }

    private final void read(Canvas canvas) {
        if (this.MediaBrowserCompatMediaItem > 0) {
            int iConstrainValue = Util.constrainValue(this.onRewind.right, this.onRewind.left, this.onPrepare.right);
            int iCenterY = this.onRewind.centerY();
            Drawable drawable = this.onPrepareFromUri;
            if (drawable == null) {
                canvas.drawCircle(iConstrainValue, iCenterY, ((this.onSetRepeatMode || isFocused()) ? this.onRemoveQueueItemAt : isEnabled() ? this.onSetRating : this.onSeekTo) / 2, this.onSetShuffleMode);
            } else if (drawable != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                drawable.setBounds(iConstrainValue - intrinsicWidth, iCenterY - intrinsicHeight, iConstrainValue + intrinsicWidth, iCenterY + intrinsicHeight);
                drawable.draw(canvas);
            }
        }
    }

    private final void RemoteActionCompatParcelizer() {
        Drawable drawable = this.onPrepareFromUri;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    private final String write() {
        String stringForTime = Util.getStringForTime(this.onCustomAction, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onPrepareFromMediaId);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(stringForTime, "");
        return stringForTime;
    }

    private final long read() {
        long j = this.onAddQueueItem;
        if (j != C.TIME_UNSET) {
            return j;
        }
        long j2 = this.MediaBrowserCompatMediaItem;
        if (j2 == C.TIME_UNSET) {
            return 0L;
        }
        return j2 / ((long) this.handleMediaPlayPauseIfPendingOnHandler);
    }

    private final boolean read(Drawable drawable) {
        return Util.SDK_INT >= 23 && write.IconCompatParcelizer(drawable, getLayoutDirection());
    }

    public final void AudioAttributesCompatParcelizer(boolean[] zArr) {
        toMagicModuleMetaRepoModel.write(zArr, "");
        AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr = this.PlaybackStateCompat;
        if (audioAttributesCompatParcelizerArr != null) {
            int length = audioAttributesCompatParcelizerArr.length;
            for (int i = 0; i < length; i++) {
                audioAttributesCompatParcelizerArr[i].read = zArr[i];
            }
        }
        invalidate();
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0010R\u0011\u0010\r\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0011\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/marrow/ui/views/DefaultTimeBar$write;", "", "<init>", "()V", "Landroid/graphics/drawable/Drawable;", "p0", "", "p1", "", "IconCompatParcelizer", "(Landroid/graphics/drawable/Drawable;I)Z", "(I)I", "RemoteActionCompatParcelizer", "write", "AudioAttributesCompatParcelizer", "", "(FI)I", "read", "I"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write {
        /* JADX INFO: Access modifiers changed from: private */
        public static int AudioAttributesCompatParcelizer(float p0, int p1) {
            return (int) ((p1 * p0) + 0.5f);
        }

        public static int AudioAttributesCompatParcelizer(int p0) {
            return (p0 & 16777215) | 855638016;
        }

        public static int IconCompatParcelizer(int p0) {
            return p0 | (-16777216);
        }

        public static int RemoteActionCompatParcelizer(int p0) {
            return (p0 & 16777215) | 855638016;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int read(float p0, int p1) {
            return (int) (p1 / p0);
        }

        public static int write(int p0) {
            return (p0 & 16777215) | (-872415232);
        }

        private write() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean IconCompatParcelizer(Drawable p0, int p1) {
            return Util.SDK_INT >= 23 && p0.setLayoutDirection(p1);
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(DefaultTimeBar defaultTimeBar) {
        defaultTimeBar.write(false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultTimeBar(Context context) {
        this(context, null, 0, null, 14, null);
        toMagicModuleMetaRepoModel.write(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
        toMagicModuleMetaRepoModel.write(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 8, null);
        toMagicModuleMetaRepoModel.write(context, "");
    }
}
