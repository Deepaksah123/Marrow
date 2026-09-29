package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.github.mikephil.charting.data.Entry;
import kotlin.DefaultDrmSessionExternalSyntheticLambda1;
import kotlin.DefaultDrmSessionExternalSyntheticLambda2;
import kotlin.DefaultDrmSessionManagerReferenceCountListenerImpl;
import kotlin.DefaultDrmSessionRequestHandler;
import kotlin.DefaultDrmSessionUnexpectedDrmSessionException;
import kotlin.createAndAcquireSessionWithRetry;
import kotlin.getCryptoConfig;
import kotlin.onProvisionError;
import kotlin.preacquireSession;
import kotlin.queryKeyStatus;
import kotlin.setKeyRequestParameters;

/* JADX INFO: loaded from: classes4.dex */
public class CombinedChart extends BarLineChartBase<DefaultDrmSessionExternalSyntheticLambda2> implements preacquireSession {
    private boolean onFastForward;
    private write[] onPlay;
    private boolean onPlayFromUri;
    private boolean onPrepareFromMediaId;

    public enum write {
        BAR,
        BUBBLE,
        LINE,
        CANDLE,
        SCATTER
    }

    public CombinedChart(Context context) {
        super(context);
        this.onPlayFromUri = true;
        this.onPrepareFromMediaId = false;
        this.onFastForward = false;
    }

    public CombinedChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onPlayFromUri = true;
        this.onPrepareFromMediaId = false;
        this.onFastForward = false;
    }

    public CombinedChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onPlayFromUri = true;
        this.onPrepareFromMediaId = false;
        this.onFastForward = false;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    protected final void RemoteActionCompatParcelizer() {
        super.RemoteActionCompatParcelizer();
        this.onPlay = new write[]{write.BAR, write.BUBBLE, write.LINE, write.CANDLE, write.SCATTER};
        setHighlighter(new DefaultDrmSessionUnexpectedDrmSessionException(this, this));
        setHighlightFullBarEnabled(true);
        this.onAddQueueItem = new DefaultDrmSessionManagerReferenceCountListenerImpl(this, this.RatingCompat, this.onPause);
    }

    @Override // kotlin.preacquireSession
    public final DefaultDrmSessionExternalSyntheticLambda2 MediaBrowserCompatItemReceiver() {
        return (DefaultDrmSessionExternalSyntheticLambda2) this.MediaBrowserCompatMediaItem;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void setData(DefaultDrmSessionExternalSyntheticLambda2 defaultDrmSessionExternalSyntheticLambda2) {
        super.setData(defaultDrmSessionExternalSyntheticLambda2);
        setHighlighter(new DefaultDrmSessionUnexpectedDrmSessionException(this, this));
        ((DefaultDrmSessionManagerReferenceCountListenerImpl) this.onAddQueueItem).read();
        this.onAddQueueItem.RemoteActionCompatParcelizer();
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public final createAndAcquireSessionWithRetry AudioAttributesCompatParcelizer(float f, float f2) {
        if (this.MediaBrowserCompatMediaItem == 0) {
            return null;
        }
        createAndAcquireSessionWithRetry createandacquiresessionwithretryRemoteActionCompatParcelizer = onSetRating().RemoteActionCompatParcelizer(f, f2);
        return (createandacquiresessionwithretryRemoteActionCompatParcelizer == null || !r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw()) ? createandacquiresessionwithretryRemoteActionCompatParcelizer : new createAndAcquireSessionWithRetry(createandacquiresessionwithretryRemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(), createandacquiresessionwithretryRemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver(), createandacquiresessionwithretryRemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer(), createandacquiresessionwithretryRemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer(), createandacquiresessionwithretryRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(), -1, createandacquiresessionwithretryRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
    }

    @Override // kotlin.undoAcquisition
    public final DefaultDrmSessionExternalSyntheticLambda1 MediaSessionCompatToken() {
        if (this.MediaBrowserCompatMediaItem == 0) {
            return null;
        }
        return ((DefaultDrmSessionExternalSyntheticLambda2) this.MediaBrowserCompatMediaItem).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    @Override // kotlin.releaseAllKeepaliveSessions
    public final getCryptoConfig write() {
        if (this.MediaBrowserCompatMediaItem == 0) {
            return null;
        }
        return ((DefaultDrmSessionExternalSyntheticLambda2) this.MediaBrowserCompatMediaItem).MediaBrowserCompatMediaItem();
    }

    @Override // kotlin.releaseAllPreacquiredSessions
    public final DefaultDrmSessionRequestHandler PlaybackStateCompatCustomAction() {
        if (this.MediaBrowserCompatMediaItem == 0) {
            return null;
        }
        return ((DefaultDrmSessionExternalSyntheticLambda2) this.MediaBrowserCompatMediaItem).onCustomAction();
    }

    @Override // kotlin.setMode
    public final queryKeyStatus IconCompatParcelizer() {
        if (this.MediaBrowserCompatMediaItem == 0) {
            return null;
        }
        return ((DefaultDrmSessionExternalSyntheticLambda2) this.MediaBrowserCompatMediaItem).handleMediaPlayPauseIfPendingOnHandler();
    }

    @Override // kotlin.maybeReleaseMediaDrm
    public final onProvisionError J_() {
        if (this.MediaBrowserCompatMediaItem == 0) {
            return null;
        }
        return ((DefaultDrmSessionExternalSyntheticLambda2) this.MediaBrowserCompatMediaItem).MediaDescriptionCompat();
    }

    @Override // kotlin.releaseAllKeepaliveSessions
    public final boolean K_() {
        return this.onFastForward;
    }

    @Override // kotlin.releaseAllKeepaliveSessions
    public final boolean AudioAttributesCompatParcelizer() {
        return this.onPlayFromUri;
    }

    public void setDrawValueAboveBar(boolean z) {
        this.onPlayFromUri = z;
    }

    public void setDrawBarShadow(boolean z) {
        this.onFastForward = z;
    }

    public void setHighlightFullBarEnabled(boolean z) {
        this.onPrepareFromMediaId = z;
    }

    public final boolean r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw() {
        return this.onPrepareFromMediaId;
    }

    public final write[] ParcelableVolumeInfo() {
        return this.onPlay;
    }

    public void setDrawOrder(write[] writeVarArr) {
        if (writeVarArr == null || writeVarArr.length <= 0) {
            return;
        }
        this.onPlay = writeVarArr;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected final void read(Canvas canvas) {
        if (this.onCustomAction != null && onSkipToNext() && PlaybackStateCompat()) {
            for (int i = 0; i < this.MediaBrowserCompatSearchResultReceiver.length; i++) {
                createAndAcquireSessionWithRetry createandacquiresessionwithretry = this.MediaBrowserCompatSearchResultReceiver[i];
                setKeyRequestParameters<? extends Entry> setkeyrequestparameters = ((DefaultDrmSessionExternalSyntheticLambda2) this.MediaBrowserCompatMediaItem).read(createandacquiresessionwithretry);
                if (((DefaultDrmSessionExternalSyntheticLambda2) this.MediaBrowserCompatMediaItem).IconCompatParcelizer(createandacquiresessionwithretry) != null && setkeyrequestparameters.AudioAttributesCompatParcelizer(r4) <= setkeyrequestparameters.onMediaButtonEvent() * this.RatingCompat.IconCompatParcelizer()) {
                    float[] fArr = read(createandacquiresessionwithretry);
                    if (this.onPause.write(fArr[0], fArr[1])) {
                        this.onCustomAction.RemoteActionCompatParcelizer();
                        this.onCustomAction.write(canvas, fArr[0], fArr[1]);
                    }
                }
            }
        }
    }
}
