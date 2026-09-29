package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.source.rtsp.RtspMessageChannel;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.upstream.UdpDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import kotlin.parseTextAttribute;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class UdpDataSourceRtpDataChannel implements RtpDataChannel {
    private static final String DEFAULT_UDP_TRANSPORT_FORMAT = "RTP/AVP;unicast;client_port=%d-%d";
    private final UdpDataSource dataSource;
    private UdpDataSourceRtpDataChannel rtcpChannel;

    @Override // com.google.android.exoplayer2.source.rtsp.RtpDataChannel
    public final RtspMessageChannel.InterleavedBinaryDataListener getInterleavedBinaryDataListener() {
        return null;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtpDataChannel
    public final boolean needsClosingOnLoadCompletion() {
        return true;
    }

    public UdpDataSourceRtpDataChannel(long j) {
        this.dataSource = new UdpDataSource(2000, parseTextAttribute.RemoteActionCompatParcelizer(j));
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtpDataChannel
    public final String getTransport() {
        int localPort = getLocalPort();
        Assertions.checkState(localPort != -1);
        return Util.formatInvariant(DEFAULT_UDP_TRANSPORT_FORMAT, Integer.valueOf(localPort), Integer.valueOf(localPort + 1));
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtpDataChannel
    public final int getLocalPort() {
        int localPort = this.dataSource.getLocalPort();
        if (localPort == -1) {
            return -1;
        }
        return localPort;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void addTransferListener(TransferListener transferListener) {
        this.dataSource.addTransferListener(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long open(DataSpec dataSpec) throws IOException {
        return this.dataSource.open(dataSpec);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        return this.dataSource.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() {
        this.dataSource.close();
        UdpDataSourceRtpDataChannel udpDataSourceRtpDataChannel = this.rtcpChannel;
        if (udpDataSourceRtpDataChannel != null) {
            udpDataSourceRtpDataChannel.close();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.dataSource.read(bArr, i, i2);
        } catch (UdpDataSource.UdpDataSourceException e) {
            if (e.reason == 2002) {
                return -1;
            }
            throw e;
        }
    }

    public final void setRtcpChannel(UdpDataSourceRtpDataChannel udpDataSourceRtpDataChannel) {
        Assertions.checkArgument(this != udpDataSourceRtpDataChannel);
        this.rtcpChannel = udpDataSourceRtpDataChannel;
    }
}
