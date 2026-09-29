package kotlin;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.video.VideoSize;

/* JADX INFO: loaded from: classes5.dex */
public abstract class getAddress extends ProRequestBody {
    private boolean AudioAttributesCompatParcelizer;
    private int IconCompatParcelizer;
    private int read = 1;
    private long RemoteActionCompatParcelizer = 0;
    private boolean write = false;

    protected abstract void AudioAttributesImplApi21Parcelizer();

    protected abstract void AudioAttributesImplBaseParcelizer();

    public void RemoteActionCompatParcelizer(int i, int i2, ExoPlaybackException exoPlaybackException) {
    }

    @Override // com.google.android.exoplayer2.util.EventLogger
    public void logd(String str) {
    }

    @Override // com.google.android.exoplayer2.util.EventLogger
    public void loge(String str) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, int i) {
    }

    @Override // com.google.android.exoplayer2.util.EventLogger, com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onRepeatModeChanged(AnalyticsListener.EventTime eventTime, int i) {
    }

    @Override // com.google.android.exoplayer2.util.EventLogger, com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onShuffleModeChanged(AnalyticsListener.EventTime eventTime, boolean z) {
    }

    @Override // com.google.android.exoplayer2.util.EventLogger, com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onTimelineChanged(AnalyticsListener.EventTime eventTime, int i) {
    }

    public void read(PlaybackException playbackException) {
    }

    public abstract void write(int i);

    public void AudioAttributesCompatParcelizer() {
        logd("onBufferStarted()");
    }

    public void write() {
        logd("onComplete()");
    }

    private void read(float f) {
        logd("onSpeedChanged():".concat(String.valueOf(f)));
    }

    public void IconCompatParcelizer(int i) {
        logd("onResolutionChanged():".concat(String.valueOf(i)));
    }

    @Override // com.google.android.exoplayer2.util.EventLogger, com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onTracksChanged(AnalyticsListener.EventTime eventTime, Tracks tracks) {
        super.onTracksChanged(eventTime, tracks);
    }

    @Override // com.google.android.exoplayer2.util.EventLogger, com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
        super.onVideoDecoderReleased(eventTime, str);
        buildResolutionString.IconCompatParcelizer("prepare video", "onVideoDecoderReleased");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j, long j2) {
        super.onVideoDecoderInitialized(eventTime, str, j, j2);
        buildResolutionString.IconCompatParcelizer("prepare video", "onVideoDecoderInitialized");
    }

    @Override // com.google.android.exoplayer2.util.EventLogger, com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlayWhenReadyChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
        if (i != 1 || z) {
            return;
        }
        AudioAttributesImplApi21Parcelizer();
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlayerStateChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
        write(i);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.RemoteActionCompatParcelizer;
        int i2 = this.read;
        boolean z2 = this.AudioAttributesCompatParcelizer;
        long j2 = j != 0 ? jCurrentTimeMillis - j : 0L;
        this.read = i;
        this.RemoteActionCompatParcelizer = jCurrentTimeMillis;
        this.AudioAttributesCompatParcelizer = z;
        boolean z3 = i2 == 1;
        boolean z4 = i2 == 3;
        boolean z5 = i2 == 2;
        boolean z6 = this.write;
        boolean z7 = z2 && z4;
        boolean z8 = i2 == 4;
        boolean z9 = i == 3;
        boolean z10 = i == 1;
        boolean z11 = z && z9;
        boolean z12 = i == 2;
        boolean z13 = i == 4;
        if (z3 && !z10) {
            RemoteActionCompatParcelizer();
        }
        if (z7 && !z11) {
            write(j2);
        }
        if (!z5 && z12) {
            AudioAttributesCompatParcelizer();
        }
        if (z5 && !z12) {
            RemoteActionCompatParcelizer(j2, z6);
        }
        if (!z4 && z9 && !this.write) {
            this.write = true;
            IconCompatParcelizer();
        } else if (z4 && z11) {
            AudioAttributesImplBaseParcelizer();
        }
        if (!z7 && z11) {
            AudioAttributesImplApi26Parcelizer();
        }
        if (z8 || !z13) {
            return;
        }
        write();
    }

    public void RemoteActionCompatParcelizer(long j, boolean z) {
        StringBuilder sb = new StringBuilder("onBufferCompleted():");
        sb.append(j);
        sb.append(", isRebuffer:");
        sb.append(z);
        logd(sb.toString());
    }

    public void IconCompatParcelizer() {
        logd("onFirstFrameRendered()");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    @Override // kotlin.ProRequestBody
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void write(com.google.android.exoplayer2.PlaybackException r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.exoplayer2.ExoPlaybackException
            if (r0 == 0) goto Lc2
            com.google.android.exoplayer2.ExoPlaybackException r6 = (com.google.android.exoplayer2.ExoPlaybackException) r6
            int r0 = r5.IconCompatParcelizer
            r1 = 1
            int r0 = r0 + r1
            r5.IconCompatParcelizer = r0
            java.lang.Throwable r0 = r6.getCause()
            int r2 = r6.type
            r3 = 401(0x191, float:5.62E-43)
            if (r2 != 0) goto L54
            java.io.IOException r2 = r6.getSourceException()
            java.lang.Throwable r4 = r2.getCause()
            boolean r4 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r4 != 0) goto L51
            boolean r4 = r2 instanceof javax.net.ssl.SSLHandshakeException
            if (r4 != 0) goto L51
            boolean r4 = r2 instanceof com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException
            if (r4 == 0) goto L3f
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException r2 = (com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException) r2
            int r4 = r2.responseCode
            if (r4 == r3) goto L71
            int r3 = r2.responseCode
            r4 = 400(0x190, float:5.6E-43)
            if (r3 == r4) goto L3c
            int r2 = r2.responseCode
            r3 = 404(0x194, float:5.66E-43)
            if (r2 != r3) goto L74
        L3c:
            r2 = 105(0x69, float:1.47E-43)
            goto L76
        L3f:
            boolean r3 = r2 instanceof java.net.SocketTimeoutException
            if (r3 == 0) goto L46
            r2 = 103(0x67, float:1.44E-43)
            goto L76
        L46:
            boolean r3 = r2 instanceof com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException
            if (r3 != 0) goto L4e
            boolean r2 = r2 instanceof java.net.ConnectException
            if (r2 == 0) goto L74
        L4e:
            r2 = 102(0x66, float:1.43E-43)
            goto L76
        L51:
            r2 = 110(0x6e, float:1.54E-43)
            goto L76
        L54:
            int r2 = r6.type
            if (r2 != r1) goto L74
            java.lang.Exception r2 = r6.getRendererException()
            boolean r4 = r2 instanceof com.google.android.exoplayer2.drm.DrmSession.DrmSessionException
            if (r4 == 0) goto L74
            com.google.android.exoplayer2.drm.DrmSession$DrmSessionException r2 = (com.google.android.exoplayer2.drm.DrmSession.DrmSessionException) r2
            java.lang.Throwable r2 = r2.getCause()
            boolean r4 = r2 instanceof com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException
            if (r4 == 0) goto L74
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException r2 = (com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException) r2
            int r2 = r2.responseCode
            if (r2 == r3) goto L71
            goto L74
        L71:
            r2 = 100
            goto L76
        L74:
            r2 = 101(0x65, float:1.42E-43)
        L76:
            boolean r3 = r0 instanceof com.google.android.exoplayer2.drm.DrmSession.DrmSessionException
            if (r3 == 0) goto L83
            java.lang.Throwable r3 = r0.getCause()
            boolean r3 = r3 instanceof com.google.android.exoplayer2.drm.KeysExpiredException
            if (r3 == 0) goto L83
            goto La2
        L83:
            boolean r3 = r0 instanceof android.media.MediaCodec.CryptoException
            if (r3 == 0) goto La5
            r3 = r0
            android.media.MediaCodec$CryptoException r3 = (android.media.MediaCodec.CryptoException) r3
            int r3 = r3.getErrorCode()
            r4 = 2
            if (r3 == r4) goto La2
            if (r3 == r1) goto La2
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "Error decrypting data"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Lbc
            r2 = 107(0x6b, float:1.5E-43)
            goto Lbc
        La2:
            r2 = 106(0x6a, float:1.49E-43)
            goto Lbc
        La5:
            boolean r1 = r0 instanceof android.media.MediaCodec.CodecException
            if (r1 == 0) goto Lbc
            android.media.MediaCodec$CodecException r0 = (android.media.MediaCodec.CodecException) r0
            int r0 = r0.getErrorCode()
            r1 = 1101(0x44d, float:1.543E-42)
            if (r0 != r1) goto Lb6
            r2 = 108(0x6c, float:1.51E-43)
            goto Lbc
        Lb6:
            r1 = 1100(0x44c, float:1.541E-42)
            if (r0 != r1) goto Lbc
            r2 = 109(0x6d, float:1.53E-43)
        Lbc:
            int r0 = r5.IconCompatParcelizer
            r5.RemoteActionCompatParcelizer(r2, r0, r6)
            return
        Lc2:
            r5.read(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getAddress.write(com.google.android.exoplayer2.PlaybackException):void");
    }

    public void RemoteActionCompatParcelizer() {
        logd("onInitializationCompleted()");
    }

    public void AudioAttributesImplApi26Parcelizer() {
        logd("onPlayResumed()");
        this.IconCompatParcelizer = 0;
    }

    public void write(long j) {
        logd("onPlayHalted():".concat(String.valueOf(j)));
    }

    @Override // com.google.android.exoplayer2.util.EventLogger, com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlaybackParametersChanged(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
        read(playbackParameters.speed);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2, int i3, float f) {
        IconCompatParcelizer(i2);
    }

    @Override // com.google.android.exoplayer2.util.EventLogger, com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
        IconCompatParcelizer(videoSize.height);
    }

    public void MediaBrowserCompatItemReceiver() {
        logd("onReleased");
        this.read = 1;
        this.AudioAttributesCompatParcelizer = false;
        this.RemoteActionCompatParcelizer = 0L;
        this.write = false;
    }

    public final long read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(long j) {
        this.RemoteActionCompatParcelizer = j;
    }
}
