package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.github.mikephil.charting.data.Entry;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.DefaultDrmSessionManagerMediaDrmHandler;
import kotlin.DrmInitDataSchemeData1;
import kotlin.acquireSession;
import kotlin.copyWithData;
import kotlin.createAndAcquireSessionWithRetry;
import kotlin.drmKeysRemoved;
import kotlin.drmSessionAcquired;
import kotlin.drmSessionReleased;
import kotlin.getError;
import kotlin.hasSessionId;
import kotlin.lambdarelease1comgoogleandroidexoplayer2drmDefaultDrmSessionManagerPreacquiredSessionReference;
import kotlin.maybeAcquirePlaceholderSession;
import kotlin.onMediaDrmEvent;
import kotlin.postKeyRequest;
import kotlin.restoreKeys;
import kotlin.setKeyRequestParameters;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BarLineChartBase<T extends onMediaDrmEvent<? extends setKeyRequestParameters<? extends Entry>>> extends Chart<T> implements maybeAcquirePlaceholderSession {
    protected getError AudioAttributesCompatParcelizer;
    protected drmSessionReleased AudioAttributesImplApi21Parcelizer;
    protected drmKeysRemoved AudioAttributesImplApi26Parcelizer;
    protected copyWithData AudioAttributesImplBaseParcelizer;
    protected DrmInitDataSchemeData1 IconCompatParcelizer;
    protected float MediaBrowserCompatCustomActionResultReceiver;
    protected drmKeysRemoved MediaBrowserCompatItemReceiver;
    private long MediaSessionCompatResultReceiverWrapper;
    private Matrix ParcelableVolumeInfo;
    protected getError RemoteActionCompatParcelizer;
    private long onFastForward;
    private boolean onPlay;
    private boolean onPlayFromSearch;
    private boolean onPlayFromUri;
    private Paint onPrepare;
    private boolean onPrepareFromMediaId;
    private boolean onPrepareFromSearch;
    private Matrix onPrepareFromUri;
    private boolean onRemoveQueueItem;
    private lambdarelease1comgoogleandroidexoplayer2drmDefaultDrmSessionManagerPreacquiredSessionReference onRemoveQueueItemAt;
    private boolean onRewind;
    private boolean onSeekTo;
    private boolean onSetCaptioningEnabled;
    private int onSetPlaybackSpeed;
    private float[] onSetRating;
    private boolean onSetRepeatMode;
    private Paint onSetShuffleMode;
    private RectF onSkipToNext;
    private boolean onSkipToPrevious;
    private float[] onSkipToQueueItem;
    private boolean onStop;
    protected drmSessionReleased read;
    private boolean setSessionImpl;
    protected DrmInitDataSchemeData1 write;

    @Override // kotlin.maybeAcquirePlaceholderSession
    public final /* synthetic */ onMediaDrmEvent AudioAttributesImplBaseParcelizer() {
        return (onMediaDrmEvent) super.onSeekTo();
    }

    public BarLineChartBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onSetPlaybackSpeed = 100;
        this.onPlay = false;
        this.onSkipToPrevious = false;
        this.onPlayFromUri = true;
        this.onSetCaptioningEnabled = true;
        this.onPrepareFromMediaId = true;
        this.onRewind = true;
        this.setSessionImpl = true;
        this.onStop = true;
        this.onRemoveQueueItem = false;
        this.onSeekTo = false;
        this.onPrepareFromSearch = false;
        this.MediaBrowserCompatCustomActionResultReceiver = 15.0f;
        this.onSetRepeatMode = false;
        this.MediaSessionCompatResultReceiverWrapper = 0L;
        this.onFastForward = 0L;
        this.onSkipToNext = new RectF();
        this.ParcelableVolumeInfo = new Matrix();
        this.onPrepareFromUri = new Matrix();
        this.onPlayFromSearch = false;
        this.onSetRating = new float[2];
        this.AudioAttributesImplApi26Parcelizer = drmKeysRemoved.read(0.0d, 0.0d);
        this.MediaBrowserCompatItemReceiver = drmKeysRemoved.read(0.0d, 0.0d);
        this.onSkipToQueueItem = new float[2];
    }

    public BarLineChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onSetPlaybackSpeed = 100;
        this.onPlay = false;
        this.onSkipToPrevious = false;
        this.onPlayFromUri = true;
        this.onSetCaptioningEnabled = true;
        this.onPrepareFromMediaId = true;
        this.onRewind = true;
        this.setSessionImpl = true;
        this.onStop = true;
        this.onRemoveQueueItem = false;
        this.onSeekTo = false;
        this.onPrepareFromSearch = false;
        this.MediaBrowserCompatCustomActionResultReceiver = 15.0f;
        this.onSetRepeatMode = false;
        this.MediaSessionCompatResultReceiverWrapper = 0L;
        this.onFastForward = 0L;
        this.onSkipToNext = new RectF();
        this.ParcelableVolumeInfo = new Matrix();
        this.onPrepareFromUri = new Matrix();
        this.onPlayFromSearch = false;
        this.onSetRating = new float[2];
        this.AudioAttributesImplApi26Parcelizer = drmKeysRemoved.read(0.0d, 0.0d);
        this.MediaBrowserCompatItemReceiver = drmKeysRemoved.read(0.0d, 0.0d);
        this.onSkipToQueueItem = new float[2];
    }

    public BarLineChartBase(Context context) {
        super(context);
        this.onSetPlaybackSpeed = 100;
        this.onPlay = false;
        this.onSkipToPrevious = false;
        this.onPlayFromUri = true;
        this.onSetCaptioningEnabled = true;
        this.onPrepareFromMediaId = true;
        this.onRewind = true;
        this.setSessionImpl = true;
        this.onStop = true;
        this.onRemoveQueueItem = false;
        this.onSeekTo = false;
        this.onPrepareFromSearch = false;
        this.MediaBrowserCompatCustomActionResultReceiver = 15.0f;
        this.onSetRepeatMode = false;
        this.MediaSessionCompatResultReceiverWrapper = 0L;
        this.onFastForward = 0L;
        this.onSkipToNext = new RectF();
        this.ParcelableVolumeInfo = new Matrix();
        this.onPrepareFromUri = new Matrix();
        this.onPlayFromSearch = false;
        this.onSetRating = new float[2];
        this.AudioAttributesImplApi26Parcelizer = drmKeysRemoved.read(0.0d, 0.0d);
        this.MediaBrowserCompatItemReceiver = drmKeysRemoved.read(0.0d, 0.0d);
        this.onSkipToQueueItem = new float[2];
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected void RemoteActionCompatParcelizer() {
        super.RemoteActionCompatParcelizer();
        this.RemoteActionCompatParcelizer = new getError(getError.write.LEFT);
        this.AudioAttributesCompatParcelizer = new getError(getError.write.RIGHT);
        this.read = new drmSessionReleased(this.onPause);
        this.AudioAttributesImplApi21Parcelizer = new drmSessionReleased(this.onPause);
        this.write = new DrmInitDataSchemeData1(this.onPause, this.RemoteActionCompatParcelizer, this.read);
        this.IconCompatParcelizer = new DrmInitDataSchemeData1(this.onPause, this.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi21Parcelizer);
        this.AudioAttributesImplBaseParcelizer = new copyWithData(this.onPause, this.onMediaButtonEvent, this.read);
        setHighlighter(new acquireSession(this));
        this.MediaMetadataCompat = new DefaultDrmSessionManagerMediaDrmHandler(this, this.onPause.RatingCompat());
        Paint paint = new Paint();
        this.onSetShuffleMode = paint;
        paint.setStyle(Paint.Style.FILL);
        this.onSetShuffleMode.setColor(Color.rgb(PsExtractor.VIDEO_STREAM_MASK, PsExtractor.VIDEO_STREAM_MASK, PsExtractor.VIDEO_STREAM_MASK));
        Paint paint2 = new Paint();
        this.onPrepare = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.onPrepare.setColor(-16777216);
        this.onPrepare.setStrokeWidth(drmSessionAcquired.write(1.0f));
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.MediaBrowserCompatMediaItem != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            RemoteActionCompatParcelizer(canvas);
            if (this.onPlay) {
                write();
            }
            if (this.RemoteActionCompatParcelizer.onPlayFromSearch()) {
                this.write.write(((restoreKeys) this.RemoteActionCompatParcelizer).IconCompatParcelizer, this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer.onSkipToNext());
            }
            if (this.AudioAttributesCompatParcelizer.onPlayFromSearch()) {
                this.IconCompatParcelizer.write(((restoreKeys) this.AudioAttributesCompatParcelizer).IconCompatParcelizer, this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, this.AudioAttributesCompatParcelizer.onSkipToNext());
            }
            if (this.onMediaButtonEvent.onPlayFromSearch()) {
                this.AudioAttributesImplBaseParcelizer.write(((restoreKeys) this.onMediaButtonEvent).IconCompatParcelizer, this.onMediaButtonEvent.AudioAttributesCompatParcelizer, false);
            }
            this.AudioAttributesImplBaseParcelizer.read(canvas);
            this.write.RemoteActionCompatParcelizer(canvas);
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(canvas);
            if (this.onMediaButtonEvent.MediaBrowserCompatSearchResultReceiver()) {
                this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(canvas);
            }
            if (this.RemoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver()) {
                this.write.AudioAttributesCompatParcelizer(canvas);
            }
            if (this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver()) {
                this.IconCompatParcelizer.AudioAttributesCompatParcelizer(canvas);
            }
            if (this.onMediaButtonEvent.onPlayFromSearch() && this.onMediaButtonEvent.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(canvas);
            }
            if (this.RemoteActionCompatParcelizer.onPlayFromSearch() && this.RemoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                this.write.IconCompatParcelizer(canvas);
            }
            if (this.AudioAttributesCompatParcelizer.onPlayFromSearch() && this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                this.IconCompatParcelizer.IconCompatParcelizer(canvas);
            }
            int iSave = canvas.save();
            canvas.clipRect(this.onPause.MediaBrowserCompatSearchResultReceiver());
            this.onAddQueueItem.IconCompatParcelizer(canvas);
            if (!this.onMediaButtonEvent.MediaBrowserCompatSearchResultReceiver()) {
                this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(canvas);
            }
            if (!this.RemoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver()) {
                this.write.AudioAttributesCompatParcelizer(canvas);
            }
            if (!this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver()) {
                this.IconCompatParcelizer.AudioAttributesCompatParcelizer(canvas);
            }
            if (PlaybackStateCompat()) {
                this.onAddQueueItem.RemoteActionCompatParcelizer(canvas, this.MediaBrowserCompatSearchResultReceiver);
            }
            canvas.restoreToCount(iSave);
            this.onAddQueueItem.read(canvas);
            if (this.onMediaButtonEvent.onPlayFromSearch() && !this.onMediaButtonEvent.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(canvas);
            }
            if (this.RemoteActionCompatParcelizer.onPlayFromSearch() && !this.RemoteActionCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                this.write.IconCompatParcelizer(canvas);
            }
            if (this.AudioAttributesCompatParcelizer.onPlayFromSearch() && !this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                this.IconCompatParcelizer.IconCompatParcelizer(canvas);
            }
            this.AudioAttributesImplBaseParcelizer.write(canvas);
            this.write.write(canvas);
            this.IconCompatParcelizer.write(canvas);
            if (IconCompatParcelizer()) {
                int iSave2 = canvas.save();
                canvas.clipRect(this.onPause.MediaBrowserCompatSearchResultReceiver());
                this.onAddQueueItem.write(canvas);
                canvas.restoreToCount(iSave2);
            } else {
                this.onAddQueueItem.write(canvas);
            }
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(canvas);
            IconCompatParcelizer(canvas);
            read(canvas);
            if (this.handleMediaPlayPauseIfPendingOnHandler) {
                long jCurrentTimeMillis2 = this.MediaSessionCompatResultReceiverWrapper + (System.currentTimeMillis() - jCurrentTimeMillis);
                this.MediaSessionCompatResultReceiverWrapper = jCurrentTimeMillis2;
                long j = this.onFastForward + 1;
                this.onFastForward = j;
                long j2 = jCurrentTimeMillis2 / j;
            }
        }
    }

    protected void onMediaButtonEvent() {
        if (this.handleMediaPlayPauseIfPendingOnHandler) {
            float f = ((restoreKeys) this.onMediaButtonEvent).IconCompatParcelizer;
            float f2 = this.onMediaButtonEvent.AudioAttributesCompatParcelizer;
            float f3 = this.onMediaButtonEvent.RemoteActionCompatParcelizer;
        }
        this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(((restoreKeys) this.onMediaButtonEvent).IconCompatParcelizer, this.onMediaButtonEvent.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer, ((restoreKeys) this.AudioAttributesCompatParcelizer).IconCompatParcelizer);
        this.read.AudioAttributesCompatParcelizer(((restoreKeys) this.onMediaButtonEvent).IconCompatParcelizer, this.onMediaButtonEvent.RemoteActionCompatParcelizer, this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer, ((restoreKeys) this.RemoteActionCompatParcelizer).IconCompatParcelizer);
    }

    protected final void onPlayFromMediaId() {
        this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.onSkipToNext());
        this.read.IconCompatParcelizer(this.RemoteActionCompatParcelizer.onSkipToNext());
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public final void onPlay() {
        if (this.MediaBrowserCompatMediaItem == 0) {
            boolean z = this.handleMediaPlayPauseIfPendingOnHandler;
            return;
        }
        boolean z2 = this.handleMediaPlayPauseIfPendingOnHandler;
        if (this.onAddQueueItem != null) {
            this.onAddQueueItem.RemoteActionCompatParcelizer();
        }
        read();
        this.write.write(((restoreKeys) this.RemoteActionCompatParcelizer).IconCompatParcelizer, this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer.onSkipToNext());
        this.IconCompatParcelizer.write(((restoreKeys) this.AudioAttributesCompatParcelizer).IconCompatParcelizer, this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, this.AudioAttributesCompatParcelizer.onSkipToNext());
        this.AudioAttributesImplBaseParcelizer.write(((restoreKeys) this.onMediaButtonEvent).IconCompatParcelizer, this.onMediaButtonEvent.AudioAttributesCompatParcelizer, false);
        if (this.onCommand != null) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
        }
        AudioAttributesImplApi21Parcelizer();
    }

    private void write() {
        ((onMediaDrmEvent) this.MediaBrowserCompatMediaItem).IconCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver(), AudioAttributesImplApi26Parcelizer());
        this.onMediaButtonEvent.IconCompatParcelizer(((onMediaDrmEvent) this.MediaBrowserCompatMediaItem).MediaBrowserCompatCustomActionResultReceiver(), ((onMediaDrmEvent) this.MediaBrowserCompatMediaItem).AudioAttributesImplApi21Parcelizer());
        if (this.RemoteActionCompatParcelizer.onPlayFromSearch()) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(((onMediaDrmEvent) this.MediaBrowserCompatMediaItem).IconCompatParcelizer(getError.write.LEFT), ((onMediaDrmEvent) this.MediaBrowserCompatMediaItem).read(getError.write.LEFT));
        }
        if (this.AudioAttributesCompatParcelizer.onPlayFromSearch()) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(((onMediaDrmEvent) this.MediaBrowserCompatMediaItem).IconCompatParcelizer(getError.write.RIGHT), ((onMediaDrmEvent) this.MediaBrowserCompatMediaItem).read(getError.write.RIGHT));
        }
        AudioAttributesImplApi21Parcelizer();
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected void read() {
        this.onMediaButtonEvent.IconCompatParcelizer(((onMediaDrmEvent) this.MediaBrowserCompatMediaItem).MediaBrowserCompatCustomActionResultReceiver(), ((onMediaDrmEvent) this.MediaBrowserCompatMediaItem).AudioAttributesImplApi21Parcelizer());
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(((onMediaDrmEvent) this.MediaBrowserCompatMediaItem).IconCompatParcelizer(getError.write.LEFT), ((onMediaDrmEvent) this.MediaBrowserCompatMediaItem).read(getError.write.LEFT));
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(((onMediaDrmEvent) this.MediaBrowserCompatMediaItem).IconCompatParcelizer(getError.write.RIGHT), ((onMediaDrmEvent) this.MediaBrowserCompatMediaItem).read(getError.write.RIGHT));
    }

    protected final void read(RectF rectF) {
        rectF.left = BitmapDescriptorFactory.HUE_RED;
        rectF.right = BitmapDescriptorFactory.HUE_RED;
        rectF.top = BitmapDescriptorFactory.HUE_RED;
        rectF.bottom = BitmapDescriptorFactory.HUE_RED;
        if (this.onCommand == null || !this.onCommand.onPlayFromSearch() || this.onCommand.onCustomAction()) {
            return;
        }
        int i = AnonymousClass4.IconCompatParcelizer[this.onCommand.MediaMetadataCompat().ordinal()];
        if (i != 1) {
            if (i == 2) {
                int i2 = AnonymousClass4.RemoteActionCompatParcelizer[this.onCommand.handleMediaPlayPauseIfPendingOnHandler().ordinal()];
                if (i2 == 1) {
                    rectF.top += Math.min(this.onCommand.RemoteActionCompatParcelizer, this.onPause.MediaDescriptionCompat() * this.onCommand.MediaDescriptionCompat()) + this.onCommand.onPrepare();
                    return;
                } else {
                    if (i2 == 2) {
                        rectF.bottom += Math.min(this.onCommand.RemoteActionCompatParcelizer, this.onPause.MediaDescriptionCompat() * this.onCommand.MediaDescriptionCompat()) + this.onCommand.onPrepare();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int i3 = AnonymousClass4.AudioAttributesCompatParcelizer[this.onCommand.MediaBrowserCompatSearchResultReceiver().ordinal()];
        if (i3 == 1) {
            rectF.left += Math.min(this.onCommand.read, this.onPause.MediaBrowserCompatMediaItem() * this.onCommand.MediaDescriptionCompat()) + this.onCommand.onPlayFromUri();
            return;
        }
        if (i3 == 2) {
            rectF.right += Math.min(this.onCommand.read, this.onPause.MediaBrowserCompatMediaItem() * this.onCommand.MediaDescriptionCompat()) + this.onCommand.onPlayFromUri();
            return;
        }
        if (i3 == 3) {
            int i4 = AnonymousClass4.RemoteActionCompatParcelizer[this.onCommand.handleMediaPlayPauseIfPendingOnHandler().ordinal()];
            if (i4 == 1) {
                rectF.top += Math.min(this.onCommand.RemoteActionCompatParcelizer, this.onPause.MediaDescriptionCompat() * this.onCommand.MediaDescriptionCompat()) + this.onCommand.onPrepare();
            } else if (i4 == 2) {
                rectF.bottom += Math.min(this.onCommand.RemoteActionCompatParcelizer, this.onPause.MediaDescriptionCompat() * this.onCommand.MediaDescriptionCompat()) + this.onCommand.onPrepare();
            }
        }
    }

    /* JADX INFO: renamed from: com.github.mikephil.charting.charts.BarLineChartBase$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] AudioAttributesCompatParcelizer;
        static final /* synthetic */ int[] IconCompatParcelizer;
        static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[postKeyRequest.IconCompatParcelizer.values().length];
            IconCompatParcelizer = iArr;
            try {
                iArr[postKeyRequest.IconCompatParcelizer.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IconCompatParcelizer[postKeyRequest.IconCompatParcelizer.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[postKeyRequest.read.values().length];
            AudioAttributesCompatParcelizer = iArr2;
            try {
                iArr2[postKeyRequest.read.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AudioAttributesCompatParcelizer[postKeyRequest.read.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AudioAttributesCompatParcelizer[postKeyRequest.read.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[postKeyRequest.write.values().length];
            RemoteActionCompatParcelizer = iArr3;
            try {
                iArr3[postKeyRequest.write.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                RemoteActionCompatParcelizer[postKeyRequest.write.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void AudioAttributesImplApi21Parcelizer() {
        if (!this.onPlayFromSearch) {
            read(this.onSkipToNext);
            float fRemoteActionCompatParcelizer = this.onSkipToNext.left + BitmapDescriptorFactory.HUE_RED;
            float f = this.onSkipToNext.top + BitmapDescriptorFactory.HUE_RED;
            float fRemoteActionCompatParcelizer2 = this.onSkipToNext.right + BitmapDescriptorFactory.HUE_RED;
            float f2 = this.onSkipToNext.bottom + BitmapDescriptorFactory.HUE_RED;
            if (this.RemoteActionCompatParcelizer.onSkipToPrevious()) {
                fRemoteActionCompatParcelizer += this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.write.IconCompatParcelizer());
            }
            if (this.AudioAttributesCompatParcelizer.onSkipToPrevious()) {
                fRemoteActionCompatParcelizer2 += this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.IconCompatParcelizer.IconCompatParcelizer());
            }
            if (this.onMediaButtonEvent.onPlayFromSearch() && this.onMediaButtonEvent.onCommand()) {
                float fOnPrepare = this.onMediaButtonEvent.MediaMetadataCompat + this.onMediaButtonEvent.onPrepare();
                if (this.onMediaButtonEvent.onRewind() == hasSessionId.AudioAttributesCompatParcelizer.BOTTOM) {
                    f2 += fOnPrepare;
                } else if (this.onMediaButtonEvent.onRewind() == hasSessionId.AudioAttributesCompatParcelizer.TOP) {
                    f += fOnPrepare;
                } else if (this.onMediaButtonEvent.onRewind() == hasSessionId.AudioAttributesCompatParcelizer.BOTH_SIDED) {
                    f2 += fOnPrepare;
                    f += fOnPrepare;
                }
            }
            float fOnSetPlaybackSpeed = f + onSetPlaybackSpeed();
            float fOnSetCaptioningEnabled = fRemoteActionCompatParcelizer2 + onSetCaptioningEnabled();
            float fOnRemoveQueueItem = f2 + onRemoveQueueItem();
            float fOnRewind = fRemoteActionCompatParcelizer + onRewind();
            float fWrite = drmSessionAcquired.write(this.MediaBrowserCompatCustomActionResultReceiver);
            this.onPause.RemoteActionCompatParcelizer(Math.max(fWrite, fOnRewind), Math.max(fWrite, fOnSetPlaybackSpeed), Math.max(fWrite, fOnSetCaptioningEnabled), Math.max(fWrite, fOnRemoveQueueItem));
            if (this.handleMediaPlayPauseIfPendingOnHandler) {
                this.onPause.MediaBrowserCompatSearchResultReceiver().toString();
            }
        }
        onPlayFromMediaId();
        onMediaButtonEvent();
    }

    private void RemoteActionCompatParcelizer(Canvas canvas) {
        if (this.onRemoveQueueItem) {
            canvas.drawRect(this.onPause.MediaBrowserCompatSearchResultReceiver(), this.onSetShuffleMode);
        }
        if (this.onSeekTo) {
            canvas.drawRect(this.onPause.MediaBrowserCompatSearchResultReceiver(), this.onPrepare);
        }
    }

    @Override // kotlin.maybeAcquirePlaceholderSession
    public final drmSessionReleased write(getError.write writeVar) {
        if (writeVar == getError.write.LEFT) {
            return this.read;
        }
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        if (this.MediaMetadataCompat == null || this.MediaBrowserCompatMediaItem == 0 || !this.onPlayFromMediaId) {
            return false;
        }
        return this.MediaMetadataCompat.onTouch(this, motionEvent);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.MediaMetadataCompat instanceof DefaultDrmSessionManagerMediaDrmHandler) {
            ((DefaultDrmSessionManagerMediaDrmHandler) this.MediaMetadataCompat).read();
        }
    }

    public final void AudioAttributesCompatParcelizer(float f, float f2, float f3, float f4) {
        this.onPause.RemoteActionCompatParcelizer(f, f2, f3, -f4, this.ParcelableVolumeInfo);
        this.onPause.AudioAttributesCompatParcelizer(this.ParcelableVolumeInfo, this, false);
        AudioAttributesImplApi21Parcelizer();
        postInvalidate();
    }

    public void setScaleMinima(float f, float f2) {
        this.onPause.MediaDescriptionCompat(f);
        this.onPause.MediaBrowserCompatSearchResultReceiver(f2);
    }

    public void setVisibleXRangeMaximum(float f) {
        this.onPause.MediaDescriptionCompat(this.onMediaButtonEvent.RemoteActionCompatParcelizer / f);
    }

    public void setVisibleXRangeMinimum(float f) {
        this.onPause.AudioAttributesImplApi26Parcelizer(this.onMediaButtonEvent.RemoteActionCompatParcelizer / f);
    }

    public void setVisibleXRange(float f, float f2) {
        this.onPause.read(this.onMediaButtonEvent.RemoteActionCompatParcelizer / f, this.onMediaButtonEvent.RemoteActionCompatParcelizer / f2);
    }

    public void setVisibleYRangeMaximum(float f, getError.write writeVar) {
        this.onPause.MediaBrowserCompatSearchResultReceiver(IconCompatParcelizer(writeVar) / f);
    }

    public void setVisibleYRangeMinimum(float f, getError.write writeVar) {
        this.onPause.MediaBrowserCompatItemReceiver(IconCompatParcelizer(writeVar) / f);
    }

    public void setVisibleYRange(float f, float f2, getError.write writeVar) {
        this.onPause.RemoteActionCompatParcelizer(IconCompatParcelizer(writeVar) / f, IconCompatParcelizer(writeVar) / f2);
    }

    public void setViewPortOffsets(final float f, final float f2, final float f3, final float f4) {
        this.onPlayFromSearch = true;
        post(new Runnable() { // from class: com.github.mikephil.charting.charts.BarLineChartBase.1
            @Override // java.lang.Runnable
            public final void run() {
                BarLineChartBase.this.onPause.RemoteActionCompatParcelizer(f, f2, f3, f4);
                BarLineChartBase.this.onPlayFromMediaId();
                BarLineChartBase.this.onMediaButtonEvent();
            }
        });
    }

    protected final float IconCompatParcelizer(getError.write writeVar) {
        if (writeVar == getError.write.LEFT) {
            return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        }
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
    }

    public void setOnDrawListener(lambdarelease1comgoogleandroidexoplayer2drmDefaultDrmSessionManagerPreacquiredSessionReference lambdarelease1comgoogleandroidexoplayer2drmdefaultdrmsessionmanagerpreacquiredsessionreference) {
        this.onRemoveQueueItemAt = lambdarelease1comgoogleandroidexoplayer2drmdefaultdrmsessionmanagerpreacquiredsessionreference;
    }

    public void setMaxVisibleValueCount(int i) {
        this.onSetPlaybackSpeed = i;
    }

    @Override // kotlin.getCryptoType
    public final int MediaBrowserCompatMediaItem() {
        return this.onSetPlaybackSpeed;
    }

    public void setHighlightPerDragEnabled(boolean z) {
        this.onSetCaptioningEnabled = z;
    }

    public final boolean onAddQueueItem() {
        return this.onSetCaptioningEnabled;
    }

    public void setGridBackgroundColor(int i) {
        this.onSetShuffleMode.setColor(i);
    }

    public void setDragEnabled(boolean z) {
        this.onPrepareFromMediaId = z;
        this.onRewind = z;
    }

    public final boolean RatingCompat() {
        return this.onPrepareFromMediaId || this.onRewind;
    }

    public void setDragXEnabled(boolean z) {
        this.onPrepareFromMediaId = z;
    }

    public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.onPrepareFromMediaId;
    }

    public void setDragYEnabled(boolean z) {
        this.onRewind = z;
    }

    public final boolean handleMediaPlayPauseIfPendingOnHandler() {
        return this.onRewind;
    }

    public void setScaleEnabled(boolean z) {
        this.setSessionImpl = z;
        this.onStop = z;
    }

    public void setScaleXEnabled(boolean z) {
        this.setSessionImpl = z;
    }

    public void setScaleYEnabled(boolean z) {
        this.onStop = z;
    }

    public final boolean onPause() {
        return this.setSessionImpl;
    }

    public final boolean onFastForward() {
        return this.onStop;
    }

    public void setDoubleTapToZoomEnabled(boolean z) {
        this.onPlayFromUri = z;
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        return this.onPlayFromUri;
    }

    public void setDrawGridBackground(boolean z) {
        this.onRemoveQueueItem = z;
    }

    public void setDrawBorders(boolean z) {
        this.onSeekTo = z;
    }

    public void setClipValuesToContent(boolean z) {
        this.onPrepareFromSearch = z;
    }

    private boolean IconCompatParcelizer() {
        return this.onPrepareFromSearch;
    }

    public void setBorderWidth(float f) {
        this.onPrepare.setStrokeWidth(drmSessionAcquired.write(f));
    }

    public void setBorderColor(int i) {
        this.onPrepare.setColor(i);
    }

    public void setMinOffset(float f) {
        this.MediaBrowserCompatCustomActionResultReceiver = f;
    }

    public void setKeepPositionOnRotation(boolean z) {
        this.onSetRepeatMode = z;
    }

    public final setKeyRequestParameters RemoteActionCompatParcelizer(float f, float f2) {
        createAndAcquireSessionWithRetry createandacquiresessionwithretryAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(f, f2);
        if (createandacquiresessionwithretryAudioAttributesCompatParcelizer != null) {
            return (setKeyRequestParameters) ((onMediaDrmEvent) this.MediaBrowserCompatMediaItem).RemoteActionCompatParcelizer(createandacquiresessionwithretryAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
        }
        return null;
    }

    @Override // kotlin.maybeAcquirePlaceholderSession
    public float MediaBrowserCompatCustomActionResultReceiver() {
        write(getError.write.LEFT).read(this.onPause.AudioAttributesImplBaseParcelizer(), this.onPause.read(), this.AudioAttributesImplApi26Parcelizer);
        return (float) Math.max(((restoreKeys) this.onMediaButtonEvent).IconCompatParcelizer, this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer);
    }

    @Override // kotlin.maybeAcquirePlaceholderSession
    public float AudioAttributesImplApi26Parcelizer() {
        write(getError.write.LEFT).read(this.onPause.MediaBrowserCompatCustomActionResultReceiver(), this.onPause.read(), this.MediaBrowserCompatItemReceiver);
        return (float) Math.min(this.onMediaButtonEvent.AudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver.IconCompatParcelizer);
    }

    @Override // android.view.View
    public float getScaleX() {
        if (this.onPause == null) {
            return 1.0f;
        }
        return this.onPause.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    @Override // android.view.View
    public float getScaleY() {
        if (this.onPause == null) {
            return 1.0f;
        }
        return this.onPause.onAddQueueItem();
    }

    public final boolean onCommand() {
        return this.onPause.onCustomAction();
    }

    private getError RemoteActionCompatParcelizer(getError.write writeVar) {
        if (writeVar == getError.write.LEFT) {
            return this.RemoteActionCompatParcelizer;
        }
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.maybeAcquirePlaceholderSession
    public final boolean read(getError.write writeVar) {
        return RemoteActionCompatParcelizer(writeVar).onSkipToNext();
    }

    public void setPinchZoom(boolean z) {
        this.onSkipToPrevious = z;
    }

    public final boolean onCustomAction() {
        return this.onSkipToPrevious;
    }

    public void setDragOffsetX(float f) {
        this.onPause.AudioAttributesImplApi21Parcelizer(f);
    }

    public void setDragOffsetY(float f) {
        this.onPause.MediaBrowserCompatCustomActionResultReceiver(f);
    }

    public final boolean MediaDescriptionCompat() {
        return this.onPause.onCommand();
    }

    public void setXAxisRenderer(copyWithData copywithdata) {
        this.AudioAttributesImplBaseParcelizer = copywithdata;
    }

    public void setRendererLeftYAxis(DrmInitDataSchemeData1 drmInitDataSchemeData1) {
        this.write = drmInitDataSchemeData1;
    }

    public void setRendererRightYAxis(DrmInitDataSchemeData1 drmInitDataSchemeData1) {
        this.IconCompatParcelizer = drmInitDataSchemeData1;
    }

    public final boolean MediaMetadataCompat() {
        return this.RemoteActionCompatParcelizer.onSkipToNext() || this.AudioAttributesCompatParcelizer.onSkipToNext();
    }

    public void setAutoScaleMinMaxEnabled(boolean z) {
        this.onPlay = z;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void setPaint(Paint paint, int i) {
        super.setPaint(paint, i);
        if (i != 4) {
            return;
        }
        this.onSetShuffleMode = paint;
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        float[] fArr = this.onSkipToQueueItem;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        if (this.onSetRepeatMode) {
            fArr[0] = this.onPause.AudioAttributesImplBaseParcelizer();
            this.onSkipToQueueItem[1] = this.onPause.AudioAttributesImplApi21Parcelizer();
            write(getError.write.LEFT).IconCompatParcelizer(this.onSkipToQueueItem);
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.onSetRepeatMode) {
            write(getError.write.LEFT).RemoteActionCompatParcelizer(this.onSkipToQueueItem);
            this.onPause.AudioAttributesCompatParcelizer(this.onSkipToQueueItem, this);
        } else {
            this.onPause.AudioAttributesCompatParcelizer(this.onPause.RatingCompat(), this, true);
        }
    }
}
