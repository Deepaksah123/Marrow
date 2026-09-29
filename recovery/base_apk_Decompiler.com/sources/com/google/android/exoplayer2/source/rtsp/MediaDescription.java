package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import kotlin.onMoovContainerAtomRead;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class MediaDescription {
    public static final String MEDIA_TYPE_AUDIO = "audio";
    public static final String MEDIA_TYPE_VIDEO = "video";
    public static final String RTP_AVP_PROFILE = "RTP/AVP";
    public final onMoovContainerAtomRead<String, String> attributes;
    public final int bitrate;
    public final String connection;
    public final String key;
    public final String mediaTitle;
    public final String mediaType;
    public final int payloadType;
    public final int port;
    public final RtpMapAttribute rtpMapAttribute;
    public final String transportProtocol;

    /* JADX INFO: loaded from: classes.dex */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MediaType {
    }

    public static final class RtpMapAttribute {
        public final int clockRate;
        public final int encodingParameters;
        public final String mediaEncoding;
        public final int payloadType;

        public static RtpMapAttribute parse(String str) throws ParserException {
            String[] strArrSplitAtFirst = Util.splitAtFirst(str, " ");
            Assertions.checkArgument(strArrSplitAtFirst.length == 2);
            int i = RtspMessageUtil.parseInt(strArrSplitAtFirst[0]);
            String[] strArrSplit = Util.split(strArrSplitAtFirst[1].trim(), "/");
            Assertions.checkArgument(strArrSplit.length >= 2);
            return new RtpMapAttribute(i, strArrSplit[0], RtspMessageUtil.parseInt(strArrSplit[1]), strArrSplit.length == 3 ? RtspMessageUtil.parseInt(strArrSplit[2]) : -1);
        }

        private RtpMapAttribute(int i, String str, int i2, int i3) {
            this.payloadType = i;
            this.mediaEncoding = str;
            this.clockRate = i2;
            this.encodingParameters = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            RtpMapAttribute rtpMapAttribute = (RtpMapAttribute) obj;
            return this.payloadType == rtpMapAttribute.payloadType && this.mediaEncoding.equals(rtpMapAttribute.mediaEncoding) && this.clockRate == rtpMapAttribute.clockRate && this.encodingParameters == rtpMapAttribute.encodingParameters;
        }

        public final int hashCode() {
            int i = this.payloadType;
            return ((((((i + 217) * 31) + this.mediaEncoding.hashCode()) * 31) + this.clockRate) * 31) + this.encodingParameters;
        }
    }

    public static final class Builder {
        private static final String RTP_MAP_ATTR_AUDIO_FMT = "%d %s/%d/%d";
        private static final int RTP_STATIC_PAYLOAD_TYPE_L16_MONO = 11;
        private static final int RTP_STATIC_PAYLOAD_TYPE_L16_STEREO = 10;
        private static final int RTP_STATIC_PAYLOAD_TYPE_PCMA = 8;
        private static final int RTP_STATIC_PAYLOAD_TYPE_PCMU = 0;
        private final HashMap<String, String> attributes = new HashMap<>();
        private int bitrate = -1;
        private String connection;
        private String key;
        private String mediaTitle;
        private final String mediaType;
        private final int payloadType;
        private final int port;
        private final String transportProtocol;

        public Builder(String str, int i, String str2, int i2) {
            this.mediaType = str;
            this.port = i;
            this.transportProtocol = str2;
            this.payloadType = i2;
        }

        public final Builder setMediaTitle(String str) {
            this.mediaTitle = str;
            return this;
        }

        public final Builder setConnection(String str) {
            this.connection = str;
            return this;
        }

        public final Builder setBitrate(int i) {
            this.bitrate = i;
            return this;
        }

        public final Builder setKey(String str) {
            this.key = str;
            return this;
        }

        public final Builder addAttribute(String str, String str2) {
            this.attributes.put(str, str2);
            return this;
        }

        public final MediaDescription build() {
            RtpMapAttribute rtpMapAttribute;
            try {
                if (this.attributes.containsKey(SessionDescription.ATTR_RTPMAP)) {
                    rtpMapAttribute = RtpMapAttribute.parse((String) Util.castNonNull(this.attributes.get(SessionDescription.ATTR_RTPMAP)));
                } else {
                    rtpMapAttribute = RtpMapAttribute.parse(getRtpMapStringByPayloadType(this.payloadType));
                }
                return new MediaDescription(this, onMoovContainerAtomRead.write(this.attributes), rtpMapAttribute);
            } catch (ParserException e) {
                throw new IllegalStateException(e);
            }
        }

        private static String getRtpMapStringByPayloadType(int i) {
            Assertions.checkArgument(i < 96);
            if (i == 0) {
                return constructAudioRtpMap(0, RtpPayloadFormat.RTP_MEDIA_PCMU, 8000, 1);
            }
            if (i == 8) {
                return constructAudioRtpMap(8, RtpPayloadFormat.RTP_MEDIA_PCMA, 8000, 1);
            }
            if (i == 10) {
                return constructAudioRtpMap(10, RtpPayloadFormat.RTP_MEDIA_PCM_L16, 44100, 2);
            }
            if (i == 11) {
                return constructAudioRtpMap(11, RtpPayloadFormat.RTP_MEDIA_PCM_L16, 44100, 1);
            }
            throw new IllegalStateException("Unsupported static paylod type ".concat(String.valueOf(i)));
        }

        private static String constructAudioRtpMap(int i, String str, int i2, int i3) {
            return Util.formatInvariant(RTP_MAP_ATTR_AUDIO_FMT, Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    private MediaDescription(Builder builder, onMoovContainerAtomRead<String, String> onmoovcontaineratomread, RtpMapAttribute rtpMapAttribute) {
        this.mediaType = builder.mediaType;
        this.port = builder.port;
        this.transportProtocol = builder.transportProtocol;
        this.payloadType = builder.payloadType;
        this.mediaTitle = builder.mediaTitle;
        this.connection = builder.connection;
        this.bitrate = builder.bitrate;
        this.key = builder.key;
        this.attributes = onmoovcontaineratomread;
        this.rtpMapAttribute = rtpMapAttribute;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MediaDescription mediaDescription = (MediaDescription) obj;
        return this.mediaType.equals(mediaDescription.mediaType) && this.port == mediaDescription.port && this.transportProtocol.equals(mediaDescription.transportProtocol) && this.payloadType == mediaDescription.payloadType && this.bitrate == mediaDescription.bitrate && this.attributes.equals(mediaDescription.attributes) && this.rtpMapAttribute.equals(mediaDescription.rtpMapAttribute) && Util.areEqual(this.mediaTitle, mediaDescription.mediaTitle) && Util.areEqual(this.connection, mediaDescription.connection) && Util.areEqual(this.key, mediaDescription.key);
    }

    public final int hashCode() {
        int iHashCode = this.mediaType.hashCode();
        int i = this.port;
        int iHashCode2 = this.transportProtocol.hashCode();
        int i2 = this.payloadType;
        int i3 = this.bitrate;
        int iHashCode3 = this.attributes.hashCode();
        int iHashCode4 = this.rtpMapAttribute.hashCode();
        String str = this.mediaTitle;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.connection;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.key;
        return ((((((((((((((((((iHashCode + 217) * 31) + i) * 31) + iHashCode2) * 31) + i2) * 31) + i3) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final onMoovContainerAtomRead<String, String> getFmtpParametersAsMap() {
        String str = this.attributes.get(SessionDescription.ATTR_FMTP);
        if (str == null) {
            return onMoovContainerAtomRead.AudioAttributesCompatParcelizer();
        }
        String[] strArrSplitAtFirst = Util.splitAtFirst(str, " ");
        Assertions.checkArgument(strArrSplitAtFirst.length == 2, str);
        String[] strArrSplit = strArrSplitAtFirst[1].split(";\\s?", 0);
        onMoovContainerAtomRead.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new onMoovContainerAtomRead.AudioAttributesCompatParcelizer();
        for (String str2 : strArrSplit) {
            String[] strArrSplitAtFirst2 = Util.splitAtFirst(str2, "=");
            audioAttributesCompatParcelizer.read(strArrSplitAtFirst2[0], strArrSplitAtFirst2[1]);
        }
        return audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
    }
}
