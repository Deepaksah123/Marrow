package com.github.mikephil.charting.charts;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.github.mikephil.charting.data.Entry;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.DefaultDrmSessionManagerMissingSchemeDataException;
import kotlin.DefaultDrmSessionManagerMode;
import kotlin.DefaultDrmSessionManagerPreacquiredSessionReference;
import kotlin.acquire;
import kotlin.acquireSession;
import kotlin.createAndAcquireSessionWithRetry;
import kotlin.createSessionCreationData;
import kotlin.drmSessionAcquired;
import kotlin.getCryptoType;
import kotlin.getSchemeDatas;
import kotlin.hasSessionId;
import kotlin.lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher;
import kotlin.lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher;
import kotlin.lambdaonReferenceCountDecremented0;
import kotlin.onKeyResponse;
import kotlin.onReferenceCountDecremented;
import kotlin.postKeyRequest;
import kotlin.requiresSecureDecoder;
import kotlin.setPlayClearSamplesWithoutKeys;
import kotlin.verifyPlaybackThread;

/* JADX INFO: loaded from: classes.dex */
public abstract class Chart<T extends requiresSecureDecoder<? extends setPlayClearSamplesWithoutKeys<? extends Entry>>> extends ViewGroup implements getCryptoType {
    private verifyPlaybackThread AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private float AudioAttributesImplApi26Parcelizer;
    private float AudioAttributesImplBaseParcelizer;
    private float IconCompatParcelizer;
    private float MediaBrowserCompatCustomActionResultReceiver;
    private float MediaBrowserCompatItemReceiver;
    protected T MediaBrowserCompatMediaItem;
    protected createAndAcquireSessionWithRetry[] MediaBrowserCompatSearchResultReceiver;
    protected createSessionCreationData MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    protected getSchemeDatas MediaDescriptionCompat;
    protected DefaultDrmSessionManagerMode MediaMetadataCompat;
    protected onKeyResponse RatingCompat;
    private boolean RemoteActionCompatParcelizer;
    protected boolean handleMediaPlayPauseIfPendingOnHandler;
    protected lambdaonReferenceCountDecremented0 onAddQueueItem;
    protected postKeyRequest onCommand;
    protected acquire onCustomAction;
    private DefaultDrmSessionManagerPreacquiredSessionReference onFastForward;
    protected hasSessionId onMediaButtonEvent;
    protected lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher onPause;
    private boolean onPlay;
    protected boolean onPlayFromMediaId;
    private ArrayList<Runnable> onPlayFromSearch;
    private boolean onPlayFromUri;
    private String onPrepare;
    private Paint onPrepareFromMediaId;
    private float onPrepareFromSearch;
    private boolean onRemoveQueueItem;
    private DefaultDrmSessionManagerMissingSchemeDataException onRewind;
    private onReferenceCountDecremented read;
    private Paint write;

    protected abstract void AudioAttributesImplApi21Parcelizer();

    public abstract void onPlay();

    protected abstract void read();

    public Chart(Context context) {
        super(context);
        this.handleMediaPlayPauseIfPendingOnHandler = false;
        this.MediaBrowserCompatMediaItem = null;
        this.onPlay = true;
        this.RemoteActionCompatParcelizer = true;
        this.IconCompatParcelizer = 0.9f;
        this.read = new onReferenceCountDecremented(0);
        this.onPlayFromMediaId = true;
        this.onPrepare = "No chart data available.";
        this.onPause = new lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher();
        this.AudioAttributesImplBaseParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.MediaBrowserCompatCustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
        this.AudioAttributesImplApi26Parcelizer = BitmapDescriptorFactory.HUE_RED;
        this.MediaBrowserCompatItemReceiver = BitmapDescriptorFactory.HUE_RED;
        this.onPlayFromUri = false;
        this.onPrepareFromSearch = BitmapDescriptorFactory.HUE_RED;
        this.AudioAttributesImplApi21Parcelizer = true;
        this.onPlayFromSearch = new ArrayList<>();
        this.onRemoveQueueItem = false;
        RemoteActionCompatParcelizer();
    }

    public Chart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.handleMediaPlayPauseIfPendingOnHandler = false;
        this.MediaBrowserCompatMediaItem = null;
        this.onPlay = true;
        this.RemoteActionCompatParcelizer = true;
        this.IconCompatParcelizer = 0.9f;
        this.read = new onReferenceCountDecremented(0);
        this.onPlayFromMediaId = true;
        this.onPrepare = "No chart data available.";
        this.onPause = new lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher();
        this.AudioAttributesImplBaseParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.MediaBrowserCompatCustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
        this.AudioAttributesImplApi26Parcelizer = BitmapDescriptorFactory.HUE_RED;
        this.MediaBrowserCompatItemReceiver = BitmapDescriptorFactory.HUE_RED;
        this.onPlayFromUri = false;
        this.onPrepareFromSearch = BitmapDescriptorFactory.HUE_RED;
        this.AudioAttributesImplApi21Parcelizer = true;
        this.onPlayFromSearch = new ArrayList<>();
        this.onRemoveQueueItem = false;
        RemoteActionCompatParcelizer();
    }

    public Chart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.handleMediaPlayPauseIfPendingOnHandler = false;
        this.MediaBrowserCompatMediaItem = null;
        this.onPlay = true;
        this.RemoteActionCompatParcelizer = true;
        this.IconCompatParcelizer = 0.9f;
        this.read = new onReferenceCountDecremented(0);
        this.onPlayFromMediaId = true;
        this.onPrepare = "No chart data available.";
        this.onPause = new lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher();
        this.AudioAttributesImplBaseParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.MediaBrowserCompatCustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
        this.AudioAttributesImplApi26Parcelizer = BitmapDescriptorFactory.HUE_RED;
        this.MediaBrowserCompatItemReceiver = BitmapDescriptorFactory.HUE_RED;
        this.onPlayFromUri = false;
        this.onPrepareFromSearch = BitmapDescriptorFactory.HUE_RED;
        this.AudioAttributesImplApi21Parcelizer = true;
        this.onPlayFromSearch = new ArrayList<>();
        this.onRemoveQueueItem = false;
        RemoteActionCompatParcelizer();
    }

    protected void RemoteActionCompatParcelizer() {
        setWillNotDraw(false);
        this.RatingCompat = new onKeyResponse(new ValueAnimator.AnimatorUpdateListener() { // from class: com.github.mikephil.charting.charts.Chart.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Chart.this.postInvalidate();
            }
        });
        drmSessionAcquired.IconCompatParcelizer(getContext());
        this.onPrepareFromSearch = drmSessionAcquired.write(500.0f);
        this.AudioAttributesCompatParcelizer = new verifyPlaybackThread();
        this.onCommand = new postKeyRequest();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new createSessionCreationData(this.onPause, this.onCommand);
        this.onMediaButtonEvent = new hasSessionId();
        this.write = new Paint(1);
        Paint paint = new Paint(1);
        this.onPrepareFromMediaId = paint;
        paint.setColor(Color.rgb(247, PsExtractor.PRIVATE_STREAM_1, 51));
        this.onPrepareFromMediaId.setTextAlign(Paint.Align.CENTER);
        this.onPrepareFromMediaId.setTextSize(drmSessionAcquired.write(12.0f));
    }

    public void setData(T t) {
        this.MediaBrowserCompatMediaItem = t;
        this.onPlayFromUri = false;
        if (t != null) {
            write(t.MediaBrowserCompatItemReceiver(), t.AudioAttributesImplApi26Parcelizer());
            for (setPlayClearSamplesWithoutKeys setplayclearsampleswithoutkeys : this.MediaBrowserCompatMediaItem.IconCompatParcelizer()) {
                if (setplayclearsampleswithoutkeys.onPause() || setplayclearsampleswithoutkeys.MediaBrowserCompatMediaItem() == this.read) {
                    setplayclearsampleswithoutkeys.write(this.read);
                }
            }
            onPlay();
        }
    }

    private void write(float f, float f2) {
        float fMax;
        T t = this.MediaBrowserCompatMediaItem;
        if (t == null || t.write() < 2) {
            fMax = Math.max(Math.abs(f), Math.abs(f2));
        } else {
            fMax = Math.abs(f2 - f);
        }
        this.read.RemoteActionCompatParcelizer(drmSessionAcquired.read(fMax));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.MediaBrowserCompatMediaItem == null) {
            if (TextUtils.isEmpty(this.onPrepare)) {
                return;
            }
            lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromSearch = onPrepareFromSearch();
            canvas.drawText(this.onPrepare, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromSearch.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromSearch.write, this.onPrepareFromMediaId);
            return;
        }
        if (this.onPlayFromUri) {
            return;
        }
        AudioAttributesImplApi21Parcelizer();
        this.onPlayFromUri = true;
    }

    protected final void IconCompatParcelizer(Canvas canvas) {
        float height;
        float width;
        verifyPlaybackThread verifyplaybackthread = this.AudioAttributesCompatParcelizer;
        if (verifyplaybackthread == null || !verifyplaybackthread.onPlayFromSearch()) {
            return;
        }
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher = this.AudioAttributesCompatParcelizer.read();
        this.write.setTypeface(this.AudioAttributesCompatParcelizer.onPrepareFromSearch());
        this.write.setTextSize(this.AudioAttributesCompatParcelizer.onPrepareFromMediaId());
        this.write.setColor(this.AudioAttributesCompatParcelizer.onFastForward());
        this.write.setTextAlign(this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer());
        if (lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher == null) {
            width = (getWidth() - this.onPause.onPlay()) - this.AudioAttributesCompatParcelizer.onPlayFromUri();
            height = (getHeight() - this.onPause.onPlayFromMediaId()) - this.AudioAttributesCompatParcelizer.onPrepare();
        } else {
            float f = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer;
            height = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write;
            width = f;
        }
        canvas.drawText(this.AudioAttributesCompatParcelizer.IconCompatParcelizer(), width, height, this.write);
    }

    @Override // kotlin.getCryptoType
    public final float onSetShuffleMode() {
        return this.onPrepareFromSearch;
    }

    public void setMaxHighlightDistance(float f) {
        this.onPrepareFromSearch = drmSessionAcquired.write(f);
    }

    public final boolean MediaSessionCompatQueueItem() {
        return this.onPlay;
    }

    public void setHighlightPerTapEnabled(boolean z) {
        this.onPlay = z;
    }

    public final boolean PlaybackStateCompat() {
        createAndAcquireSessionWithRetry[] createandacquiresessionwithretryArr = this.MediaBrowserCompatSearchResultReceiver;
        return (createandacquiresessionwithretryArr == null || createandacquiresessionwithretryArr.length <= 0 || createandacquiresessionwithretryArr[0] == null) ? false : true;
    }

    private void RemoteActionCompatParcelizer(createAndAcquireSessionWithRetry[] createandacquiresessionwithretryArr) {
        createAndAcquireSessionWithRetry createandacquiresessionwithretry;
        if (createandacquiresessionwithretryArr == null || createandacquiresessionwithretryArr.length <= 0 || (createandacquiresessionwithretry = createandacquiresessionwithretryArr[0]) == null) {
            this.MediaMetadataCompat.AudioAttributesCompatParcelizer(null);
        } else {
            this.MediaMetadataCompat.AudioAttributesCompatParcelizer(createandacquiresessionwithretry);
        }
    }

    public final void RemoteActionCompatParcelizer(createAndAcquireSessionWithRetry createandacquiresessionwithretry) {
        if (createandacquiresessionwithretry == null) {
            this.MediaBrowserCompatSearchResultReceiver = null;
        } else {
            if (this.handleMediaPlayPauseIfPendingOnHandler) {
                createandacquiresessionwithretry.toString();
            }
            if (this.MediaBrowserCompatMediaItem.IconCompatParcelizer(createandacquiresessionwithretry) == null) {
                this.MediaBrowserCompatSearchResultReceiver = null;
            } else {
                this.MediaBrowserCompatSearchResultReceiver = new createAndAcquireSessionWithRetry[]{createandacquiresessionwithretry};
            }
        }
        RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver);
        if (this.onRewind != null) {
            PlaybackStateCompat();
        }
        invalidate();
    }

    public createAndAcquireSessionWithRetry AudioAttributesCompatParcelizer(float f, float f2) {
        if (this.MediaBrowserCompatMediaItem == null) {
            return null;
        }
        return onSetRating().RemoteActionCompatParcelizer(f, f2);
    }

    public void setOnTouchListener(DefaultDrmSessionManagerMode defaultDrmSessionManagerMode) {
        this.MediaMetadataCompat = defaultDrmSessionManagerMode;
    }

    protected void read(Canvas canvas) {
        if (this.onCustomAction == null || !onSkipToNext() || !PlaybackStateCompat()) {
            return;
        }
        int i = 0;
        while (true) {
            createAndAcquireSessionWithRetry[] createandacquiresessionwithretryArr = this.MediaBrowserCompatSearchResultReceiver;
            if (i >= createandacquiresessionwithretryArr.length) {
                return;
            }
            createAndAcquireSessionWithRetry createandacquiresessionwithretry = createandacquiresessionwithretryArr[i];
            setPlayClearSamplesWithoutKeys setplayclearsampleswithoutkeysRemoteActionCompatParcelizer = this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(createandacquiresessionwithretry.RemoteActionCompatParcelizer());
            Entry entryIconCompatParcelizer = this.MediaBrowserCompatMediaItem.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver[i]);
            int iAudioAttributesCompatParcelizer = setplayclearsampleswithoutkeysRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(entryIconCompatParcelizer);
            if (entryIconCompatParcelizer != null && iAudioAttributesCompatParcelizer <= setplayclearsampleswithoutkeysRemoteActionCompatParcelizer.onMediaButtonEvent() * this.RatingCompat.IconCompatParcelizer()) {
                float[] fArr = read(createandacquiresessionwithretry);
                if (this.onPause.write(fArr[0], fArr[1])) {
                    this.onCustomAction.RemoteActionCompatParcelizer();
                    this.onCustomAction.write(canvas, fArr[0], fArr[1]);
                }
            }
            i++;
        }
    }

    protected float[] read(createAndAcquireSessionWithRetry createandacquiresessionwithretry) {
        return new float[]{createandacquiresessionwithretry.read(), createandacquiresessionwithretry.IconCompatParcelizer()};
    }

    public final onKeyResponse onPlayFromUri() {
        return this.RatingCompat;
    }

    public final boolean onSkipToPrevious() {
        return this.RemoteActionCompatParcelizer;
    }

    public void setDragDecelerationEnabled(boolean z) {
        this.RemoteActionCompatParcelizer = z;
    }

    public final float onRemoveQueueItemAt() {
        return this.IconCompatParcelizer;
    }

    public void setDragDecelerationFrictionCoef(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f = 0.0f;
        }
        if (f >= 1.0f) {
            f = 0.999f;
        }
        this.IconCompatParcelizer = f;
    }

    public hasSessionId setSessionImpl() {
        return this.onMediaButtonEvent;
    }

    public void setOnChartValueSelectedListener(DefaultDrmSessionManagerMissingSchemeDataException defaultDrmSessionManagerMissingSchemeDataException) {
        this.onRewind = defaultDrmSessionManagerMissingSchemeDataException;
    }

    public void setOnChartGestureListener(DefaultDrmSessionManagerPreacquiredSessionReference defaultDrmSessionManagerPreacquiredSessionReference) {
        this.onFastForward = defaultDrmSessionManagerPreacquiredSessionReference;
    }

    public final DefaultDrmSessionManagerPreacquiredSessionReference onStop() {
        return this.onFastForward;
    }

    public final lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher onPrepareFromSearch() {
        return lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(getWidth() / 2.0f, getHeight() / 2.0f);
    }

    public final lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher onPrepareFromMediaId() {
        return this.onPause.MediaMetadataCompat();
    }

    public void setExtraOffsets(float f, float f2, float f3, float f4) {
        setExtraLeftOffset(f);
        setExtraTopOffset(f2);
        setExtraRightOffset(f3);
        setExtraBottomOffset(f4);
    }

    public void setExtraTopOffset(float f) {
        this.AudioAttributesImplBaseParcelizer = drmSessionAcquired.write(f);
    }

    public final float onSetPlaybackSpeed() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public void setExtraRightOffset(float f) {
        this.MediaBrowserCompatCustomActionResultReceiver = drmSessionAcquired.write(f);
    }

    public final float onSetCaptioningEnabled() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public void setExtraBottomOffset(float f) {
        this.AudioAttributesImplApi26Parcelizer = drmSessionAcquired.write(f);
    }

    public final float onRemoveQueueItem() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public void setExtraLeftOffset(float f) {
        this.MediaBrowserCompatItemReceiver = drmSessionAcquired.write(f);
    }

    public final float onRewind() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public void setLogEnabled(boolean z) {
        this.handleMediaPlayPauseIfPendingOnHandler = z;
    }

    public final boolean MediaSessionCompatResultReceiverWrapper() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public void setNoDataText(String str) {
        this.onPrepare = str;
    }

    public void setNoDataTextColor(int i) {
        this.onPrepareFromMediaId.setColor(i);
    }

    public void setNoDataTextTypeface(Typeface typeface) {
        this.onPrepareFromMediaId.setTypeface(typeface);
    }

    public void setTouchEnabled(boolean z) {
        this.onPlayFromMediaId = z;
    }

    public void setMarker(acquire acquireVar) {
        this.onCustomAction = acquireVar;
    }

    @Deprecated
    public void setMarkerView(acquire acquireVar) {
        setMarker(acquireVar);
    }

    public void setDescription(verifyPlaybackThread verifyplaybackthread) {
        this.AudioAttributesCompatParcelizer = verifyplaybackthread;
    }

    public final verifyPlaybackThread onPrepareFromUri() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final postKeyRequest onSetRepeatMode() {
        return this.onCommand;
    }

    public final void onPlayFromSearch() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public final void onPrepare() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    public void setPaint(Paint paint, int i) {
        if (i == 7) {
            this.onPrepareFromMediaId = paint;
        } else {
            if (i != 11) {
                return;
            }
            this.write = paint;
        }
    }

    @Deprecated
    public void setDrawMarkerViews(boolean z) {
        setDrawMarkers(z);
    }

    public final boolean onSkipToNext() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public void setDrawMarkers(boolean z) {
        this.AudioAttributesImplApi21Parcelizer = z;
    }

    @Override // kotlin.getCryptoType
    public final T onSeekTo() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher onSkipToQueueItem() {
        return this.onPause;
    }

    public void setRenderer(lambdaonReferenceCountDecremented0 lambdaonreferencecountdecremented0) {
        if (lambdaonreferencecountdecremented0 != null) {
            this.onAddQueueItem = lambdaonreferencecountdecremented0;
        }
    }

    public final getSchemeDatas onSetRating() {
        return this.MediaDescriptionCompat;
    }

    public void setHighlighter(acquireSession acquiresession) {
        this.MediaDescriptionCompat = acquiresession;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).layout(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iWrite = (int) drmSessionAcquired.write(50.0f);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), resolveSize(iWrite, i)), Math.max(getSuggestedMinimumHeight(), resolveSize(iWrite, i2)));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i > 0 && i2 > 0 && i < 10000 && i2 < 10000) {
            this.onPause.IconCompatParcelizer(i, i2);
        }
        onPlay();
        Iterator<Runnable> it = this.onPlayFromSearch.iterator();
        while (it.hasNext()) {
            post(it.next());
        }
        this.onPlayFromSearch.clear();
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setHardwareAccelerationEnabled(boolean z) {
        if (z) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.onRemoveQueueItem) {
            IconCompatParcelizer(this);
        }
    }

    private void IconCompatParcelizer(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        int i = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i < viewGroup.getChildCount()) {
                IconCompatParcelizer(viewGroup.getChildAt(i));
                i++;
            } else {
                viewGroup.removeAllViews();
                return;
            }
        }
    }

    public void setUnbindEnabled(boolean z) {
        this.onRemoveQueueItem = z;
    }
}
