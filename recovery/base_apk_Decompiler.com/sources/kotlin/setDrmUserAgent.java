package kotlin;

import android.graphics.Canvas;
import android.graphics.Path;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setDrmUserAgent extends createManager {
    private Path RemoteActionCompatParcelizer;

    public setDrmUserAgent(onKeyResponse onkeyresponse, lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher) {
        super(onkeyresponse, lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
        this.RemoteActionCompatParcelizer = new Path();
    }

    protected final void read(Canvas canvas, float f, float f2, onEvent onevent) {
        this.AudioAttributesImplApi26Parcelizer.setColor(onevent.AudioAttributesCompatParcelizer());
        this.AudioAttributesImplApi26Parcelizer.setStrokeWidth(onevent.onSkipToPrevious());
        this.AudioAttributesImplApi26Parcelizer.setPathEffect(onevent.onStop());
        if (onevent.ParcelableVolumeInfo()) {
            this.RemoteActionCompatParcelizer.reset();
            this.RemoteActionCompatParcelizer.moveTo(f, this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer());
            this.RemoteActionCompatParcelizer.lineTo(f, this.MediaBrowserCompatSearchResultReceiver.read());
            canvas.drawPath(this.RemoteActionCompatParcelizer, this.AudioAttributesImplApi26Parcelizer);
        }
        if (onevent.MediaSessionCompatQueueItem()) {
            this.RemoteActionCompatParcelizer.reset();
            this.RemoteActionCompatParcelizer.moveTo(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(), f2);
            this.RemoteActionCompatParcelizer.lineTo(this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver(), f2);
            canvas.drawPath(this.RemoteActionCompatParcelizer, this.AudioAttributesImplApi26Parcelizer);
        }
    }
}
