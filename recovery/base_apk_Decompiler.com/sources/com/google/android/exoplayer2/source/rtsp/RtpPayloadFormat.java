package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Map;
import kotlin.onMoovContainerAtomRead;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class RtpPayloadFormat {
    public static final String RTP_MEDIA_AC3 = "AC3";
    public static final String RTP_MEDIA_AMR = "AMR";
    public static final String RTP_MEDIA_AMR_WB = "AMR-WB";
    public static final String RTP_MEDIA_H263_1998 = "H263-1998";
    public static final String RTP_MEDIA_H263_2000 = "H263-2000";
    public static final String RTP_MEDIA_H264 = "H264";
    public static final String RTP_MEDIA_H265 = "H265";
    public static final String RTP_MEDIA_MPEG4_GENERIC = "MPEG4-GENERIC";
    public static final String RTP_MEDIA_MPEG4_LATM_AUDIO = "MP4A-LATM";
    public static final String RTP_MEDIA_MPEG4_VIDEO = "MP4V-ES";
    public static final String RTP_MEDIA_OPUS = "OPUS";
    public static final String RTP_MEDIA_PCMA = "PCMA";
    public static final String RTP_MEDIA_PCMU = "PCMU";
    public static final String RTP_MEDIA_PCM_L16 = "L16";
    public static final String RTP_MEDIA_PCM_L8 = "L8";
    public static final String RTP_MEDIA_VP8 = "VP8";
    public static final String RTP_MEDIA_VP9 = "VP9";
    public final int clockRate;
    public final onMoovContainerAtomRead<String, String> fmtpParameters;
    public final Format format;
    public final String mediaEncoding;
    public final int rtpPayloadType;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static boolean isFormatSupported(com.google.android.exoplayer2.source.rtsp.MediaDescription r3) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat.isFormatSupported(com.google.android.exoplayer2.source.rtsp.MediaDescription):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getMimeTypeFromRtpMediaType(java.lang.String r2) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.rtsp.RtpPayloadFormat.getMimeTypeFromRtpMediaType(java.lang.String):java.lang.String");
    }

    public static int getRawPcmEncodingType(String str) {
        Assertions.checkArgument(str.equals(RTP_MEDIA_PCM_L8) || str.equals(RTP_MEDIA_PCM_L16));
        return str.equals(RTP_MEDIA_PCM_L8) ? 3 : 268435456;
    }

    public RtpPayloadFormat(Format format, int i, int i2, Map<String, String> map, String str) {
        this.rtpPayloadType = i;
        this.clockRate = i2;
        this.format = format;
        this.fmtpParameters = onMoovContainerAtomRead.write(map);
        this.mediaEncoding = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RtpPayloadFormat rtpPayloadFormat = (RtpPayloadFormat) obj;
        return this.rtpPayloadType == rtpPayloadFormat.rtpPayloadType && this.clockRate == rtpPayloadFormat.clockRate && this.format.equals(rtpPayloadFormat.format) && this.fmtpParameters.equals(rtpPayloadFormat.fmtpParameters) && this.mediaEncoding.equals(rtpPayloadFormat.mediaEncoding);
    }

    public final int hashCode() {
        int i = this.rtpPayloadType;
        int i2 = this.clockRate;
        return ((((((((i + 217) * 31) + i2) * 31) + this.format.hashCode()) * 31) + this.fmtpParameters.hashCode()) * 31) + this.mediaEncoding.hashCode();
    }
}
