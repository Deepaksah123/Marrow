package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.RtpDataChannel;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class TransferRtpDataChannelFactory implements RtpDataChannel.Factory {
    private static final int INTERLEAVED_CHANNELS_PER_TRACK = 2;
    private final long timeoutMs;

    public TransferRtpDataChannelFactory(long j) {
        this.timeoutMs = j;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtpDataChannel.Factory
    public final RtpDataChannel createAndOpenDataChannel(int i) {
        TransferRtpDataChannel transferRtpDataChannel = new TransferRtpDataChannel(this.timeoutMs);
        transferRtpDataChannel.open(RtpUtils.getIncomingRtpDataSpec(i << 1));
        return transferRtpDataChannel;
    }
}
