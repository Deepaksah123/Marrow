package kotlin;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.BubbleEntry;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultDrmSessionManagerProvider extends createManager {
    private float[] IconCompatParcelizer;
    private float[] RemoteActionCompatParcelizer;
    private float[] read;
    protected maybeReleaseMediaDrm write;

    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void RemoteActionCompatParcelizer() {
    }

    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void read(Canvas canvas) {
    }

    public DefaultDrmSessionManagerProvider(maybeReleaseMediaDrm maybereleasemediadrm, onKeyResponse onkeyresponse, lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher) {
        super(onkeyresponse, lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
        this.read = new float[4];
        this.RemoteActionCompatParcelizer = new float[2];
        this.IconCompatParcelizer = new float[3];
        this.write = maybereleasemediadrm;
        this.AudioAttributesImplBaseParcelizer.setStyle(Paint.Style.FILL);
        this.AudioAttributesImplApi26Parcelizer.setStyle(Paint.Style.STROKE);
        this.AudioAttributesImplApi26Parcelizer.setStrokeWidth(drmSessionAcquired.write(1.5f));
    }

    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void IconCompatParcelizer(Canvas canvas) {
        for (T t : this.write.J_().IconCompatParcelizer()) {
            if (t.handleMediaPlayPauseIfPendingOnHandler()) {
                read(canvas, t);
            }
        }
    }

    private static float IconCompatParcelizer(float f, float f2, float f3, boolean z) {
        if (z) {
            f = f2 == BitmapDescriptorFactory.HUE_RED ? 1.0f : (float) Math.sqrt(f / f2);
        }
        return f3 * f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void read(Canvas canvas, DefaultDrmSessionManager1 defaultDrmSessionManager1) {
        if (defaultDrmSessionManager1.onMediaButtonEvent() <= 0) {
            return;
        }
        drmSessionReleased drmsessionreleasedWrite = this.write.write(defaultDrmSessionManager1.IconCompatParcelizer());
        float f = this.MediaBrowserCompatItemReceiver.read();
        this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(this.write, defaultDrmSessionManager1);
        float[] fArr = this.read;
        fArr[0] = 0.0f;
        fArr[2] = 1.0f;
        drmsessionreleasedWrite.RemoteActionCompatParcelizer(fArr);
        boolean zOnPrepareFromSearch = defaultDrmSessionManager1.onPrepareFromSearch();
        float[] fArr2 = this.read;
        float fMin = Math.min(Math.abs(this.MediaBrowserCompatSearchResultReceiver.read() - this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer()), Math.abs(fArr2[2] - fArr2[0]));
        for (int i = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer; i <= this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer + this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer; i++) {
            BubbleEntry bubbleEntry = (BubbleEntry) defaultDrmSessionManager1.IconCompatParcelizer(i);
            this.RemoteActionCompatParcelizer[0] = bubbleEntry.MediaBrowserCompatCustomActionResultReceiver();
            this.RemoteActionCompatParcelizer[1] = bubbleEntry.read() * f;
            drmsessionreleasedWrite.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
            float fIconCompatParcelizer = IconCompatParcelizer(bubbleEntry.RemoteActionCompatParcelizer(), defaultDrmSessionManager1.onPrepareFromMediaId(), fMin, zOnPrepareFromSearch) / 2.0f;
            if (this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer[1] + fIconCompatParcelizer) && this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(this.RemoteActionCompatParcelizer[1] - fIconCompatParcelizer) && this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer[0] + fIconCompatParcelizer)) {
                if (!this.MediaBrowserCompatSearchResultReceiver.write(this.RemoteActionCompatParcelizer[0] - fIconCompatParcelizer)) {
                    return;
                }
                this.AudioAttributesImplBaseParcelizer.setColor(defaultDrmSessionManager1.AudioAttributesCompatParcelizer((int) bubbleEntry.MediaBrowserCompatCustomActionResultReceiver()));
                float[] fArr3 = this.RemoteActionCompatParcelizer;
                canvas.drawCircle(fArr3[0], fArr3[1], fIconCompatParcelizer, this.AudioAttributesImplBaseParcelizer);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void write(Canvas canvas) {
        int i;
        BubbleEntry bubbleEntry;
        float f;
        float f2;
        onProvisionError onprovisionerrorJ_ = this.write.J_();
        if (onprovisionerrorJ_ == null || !AudioAttributesCompatParcelizer(this.write)) {
            return;
        }
        List<T> listIconCompatParcelizer = onprovisionerrorJ_.IconCompatParcelizer();
        float fAudioAttributesCompatParcelizer = drmSessionAcquired.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        for (int i2 = 0; i2 < listIconCompatParcelizer.size(); i2++) {
            DefaultDrmSessionManager1 defaultDrmSessionManager1 = (DefaultDrmSessionManager1) listIconCompatParcelizer.get(i2);
            if (IconCompatParcelizer(defaultDrmSessionManager1) && defaultDrmSessionManager1.onMediaButtonEvent() > 0) {
                RemoteActionCompatParcelizer(defaultDrmSessionManager1);
                float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(1.0f, this.MediaBrowserCompatItemReceiver.IconCompatParcelizer()));
                float f3 = this.MediaBrowserCompatItemReceiver.read();
                this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(this.write, defaultDrmSessionManager1);
                float[] fArr = this.write.write(defaultDrmSessionManager1.IconCompatParcelizer()).read(defaultDrmSessionManager1, f3, this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer);
                float f4 = fMax == 1.0f ? f3 : fMax;
                DefaultDrmSessionResponseHandler defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem = defaultDrmSessionManager1.MediaBrowserCompatMediaItem();
                lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(defaultDrmSessionManager1.MediaDescriptionCompat());
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer = drmSessionAcquired.write(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer);
                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write = drmSessionAcquired.write(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write);
                for (int i3 = 0; i3 < fArr.length; i3 = i + 2) {
                    int i4 = i3 / 2;
                    int iWrite = defaultDrmSessionManager1.write(this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer + i4);
                    int iArgb = Color.argb(Math.round(255.0f * f4), Color.red(iWrite), Color.green(iWrite), Color.blue(iWrite));
                    float f5 = fArr[i3];
                    float f6 = fArr[i3 + 1];
                    if (!this.MediaBrowserCompatSearchResultReceiver.write(f5)) {
                        break;
                    }
                    if (this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(f5) && this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(f6)) {
                        BubbleEntry bubbleEntry2 = (BubbleEntry) defaultDrmSessionManager1.IconCompatParcelizer(i4 + this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer);
                        if (defaultDrmSessionManager1.onAddQueueItem()) {
                            bubbleEntry = bubbleEntry2;
                            f = f6;
                            f2 = f5;
                            i = i3;
                            read(canvas, defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(bubbleEntry2), f5, f6 + (0.5f * fAudioAttributesCompatParcelizer), iArgb);
                        } else {
                            bubbleEntry = bubbleEntry2;
                            f = f6;
                            f2 = f5;
                            i = i3;
                        }
                        if (bubbleEntry.AudioAttributesImplApi21Parcelizer() != null && defaultDrmSessionManager1.onCommand()) {
                            Drawable drawableAudioAttributesImplApi21Parcelizer = bubbleEntry.AudioAttributesImplApi21Parcelizer();
                            drmSessionAcquired.write(canvas, drawableAudioAttributesImplApi21Parcelizer, (int) (f2 + lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer), (int) (f + lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write), drawableAudioAttributesImplApi21Parcelizer.getIntrinsicWidth(), drawableAudioAttributesImplApi21Parcelizer.getIntrinsicHeight());
                        }
                    } else {
                        i = i3;
                    }
                }
                lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
            }
        }
    }

    private void read(Canvas canvas, String str, float f, float f2, int i) {
        this.AudioAttributesImplApi21Parcelizer.setColor(i);
        canvas.drawText(str, f, f2, this.AudioAttributesImplApi21Parcelizer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0131  */
    @Override // kotlin.lambdaonReferenceCountDecremented0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void RemoteActionCompatParcelizer(android.graphics.Canvas r18, kotlin.createAndAcquireSessionWithRetry[] r19) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DefaultDrmSessionManagerProvider.RemoteActionCompatParcelizer(android.graphics.Canvas, o.createAndAcquireSessionWithRetry[]):void");
    }
}
