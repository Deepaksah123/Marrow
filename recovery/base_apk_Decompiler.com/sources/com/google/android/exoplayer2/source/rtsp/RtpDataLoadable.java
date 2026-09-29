package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.source.rtsp.RtpDataChannel;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.upstream.DataSourceUtil;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class RtpDataLoadable implements Loader.Loadable {
    public static int AudioAttributesCompatParcelizer;
    public static int IconCompatParcelizer;
    private RtpDataChannel dataChannel;
    private final EventListener eventListener;
    private RtpExtractor extractor;
    private DefaultExtractorInput extractorInput;
    private volatile boolean loadCancelled;
    private volatile long nextRtpTimestamp;
    private final ExtractorOutput output;
    private final RtpDataChannel.Factory rtpDataChannelFactory;
    public final RtspMediaTrack rtspMediaTrack;
    public final int trackId;
    private final Handler playbackThreadHandler = Util.createHandlerForCurrentLooper();
    private volatile long pendingSeekPositionUs = C.TIME_UNSET;

    public interface EventListener {
        void onTransportReady(String str, RtpDataChannel rtpDataChannel);
    }

    public RtpDataLoadable(int i, RtspMediaTrack rtspMediaTrack, EventListener eventListener, ExtractorOutput extractorOutput, RtpDataChannel.Factory factory) {
        this.trackId = i;
        this.rtspMediaTrack = rtspMediaTrack;
        this.eventListener = eventListener;
        this.output = extractorOutput;
        this.rtpDataChannelFactory = factory;
    }

    public final void setTimestamp(long j) {
        if (j == C.TIME_UNSET || ((RtpExtractor) Assertions.checkNotNull(this.extractor)).hasReadFirstRtpPacket()) {
            return;
        }
        this.extractor.setFirstTimestamp(j);
    }

    public final void setSequenceNumber(int i) {
        if (((RtpExtractor) Assertions.checkNotNull(this.extractor)).hasReadFirstRtpPacket()) {
            return;
        }
        this.extractor.setFirstSequenceNumber(i);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public final void cancelLoad() {
        this.loadCancelled = true;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public final void load() throws IOException {
        if (this.loadCancelled) {
            this.loadCancelled = false;
        }
        try {
            if (this.dataChannel == null) {
                RtpDataChannel rtpDataChannelCreateAndOpenDataChannel = this.rtpDataChannelFactory.createAndOpenDataChannel(this.trackId);
                this.dataChannel = rtpDataChannelCreateAndOpenDataChannel;
                final String transport = rtpDataChannelCreateAndOpenDataChannel.getTransport();
                final RtpDataChannel rtpDataChannel = this.dataChannel;
                this.playbackThreadHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.RtpDataLoadable$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m125lambda$load$0$comgoogleandroidexoplayer2sourcertspRtpDataLoadable(transport, rtpDataChannel);
                    }
                });
                this.extractorInput = new DefaultExtractorInput((DataReader) Assertions.checkNotNull(this.dataChannel), 0L, -1L);
                RtpExtractor rtpExtractor = new RtpExtractor(this.rtspMediaTrack.payloadFormat, this.trackId);
                this.extractor = rtpExtractor;
                rtpExtractor.init(this.output);
            }
            while (!this.loadCancelled) {
                if (this.pendingSeekPositionUs != C.TIME_UNSET) {
                    ((RtpExtractor) Assertions.checkNotNull(this.extractor)).seek(this.nextRtpTimestamp, this.pendingSeekPositionUs);
                    this.pendingSeekPositionUs = C.TIME_UNSET;
                }
                if (((RtpExtractor) Assertions.checkNotNull(this.extractor)).read((ExtractorInput) Assertions.checkNotNull(this.extractorInput), new PositionHolder()) == -1) {
                    break;
                }
            }
            this.loadCancelled = false;
        } finally {
            if (((RtpDataChannel) Assertions.checkNotNull(this.dataChannel)).needsClosingOnLoadCompletion()) {
                DataSourceUtil.closeQuietly(this.dataChannel);
                this.dataChannel = null;
            }
        }
    }

    /* JADX INFO: renamed from: lambda$load$0$com-google-android-exoplayer2-source-rtsp-RtpDataLoadable, reason: not valid java name */
    final /* synthetic */ void m125lambda$load$0$comgoogleandroidexoplayer2sourcertspRtpDataLoadable(String str, RtpDataChannel rtpDataChannel) {
        this.eventListener.onTransportReady(str, rtpDataChannel);
    }

    public final void resetForSeek() {
        ((RtpExtractor) Assertions.checkNotNull(this.extractor)).preSeek();
    }

    public final void seekToUs(long j, long j2) {
        this.pendingSeekPositionUs = j;
        this.nextRtpTimestamp = j2;
    }

    public static int read() {
        int i = AudioAttributesCompatParcelizer;
        int i2 = i % 5786450;
        AudioAttributesCompatParcelizer = i + 1;
        if (i2 != 0) {
            return IconCompatParcelizer;
        }
        int i3 = (int) Runtime.getRuntime().totalMemory();
        IconCompatParcelizer = i3;
        return i3;
    }
}
