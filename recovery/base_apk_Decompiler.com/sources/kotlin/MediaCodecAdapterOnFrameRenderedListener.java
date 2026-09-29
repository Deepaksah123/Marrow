package kotlin;

import kotlin.MediaCodecInfo;

/* JADX INFO: loaded from: classes5.dex */
final class MediaCodecAdapterOnFrameRenderedListener extends MediaCodecInfo {
    private final adjustMaxInputChannelCount AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String read;
    private final MediaCodecInfo.read write;

    /* synthetic */ MediaCodecAdapterOnFrameRenderedListener(String str, String str2, String str3, adjustMaxInputChannelCount adjustmaxinputchannelcount, MediaCodecInfo.read readVar, byte b) {
        this(str, str2, str3, adjustmaxinputchannelcount, readVar);
    }

    private MediaCodecAdapterOnFrameRenderedListener(String str, String str2, String str3, adjustMaxInputChannelCount adjustmaxinputchannelcount, MediaCodecInfo.read readVar) {
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.AudioAttributesCompatParcelizer = adjustmaxinputchannelcount;
        this.write = readVar;
    }

    @Override // kotlin.MediaCodecInfo
    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.MediaCodecInfo
    public final String read() {
        return this.read;
    }

    @Override // kotlin.MediaCodecInfo
    public final String RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.MediaCodecInfo
    public final adjustMaxInputChannelCount write() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.MediaCodecInfo
    public final MediaCodecInfo.read AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", fid=");
        sb.append(this.read);
        sb.append(", refreshToken=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", authToken=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", responseCode=");
        sb.append(this.write);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaCodecInfo)) {
            return false;
        }
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) obj;
        String str = this.IconCompatParcelizer;
        if (str == null) {
            if (mediaCodecInfo.IconCompatParcelizer() != null) {
                return false;
            }
        } else if (!str.equals(mediaCodecInfo.IconCompatParcelizer())) {
            return false;
        }
        String str2 = this.read;
        if (str2 == null) {
            if (mediaCodecInfo.read() != null) {
                return false;
            }
        } else if (!str2.equals(mediaCodecInfo.read())) {
            return false;
        }
        String str3 = this.RemoteActionCompatParcelizer;
        if (str3 == null) {
            if (mediaCodecInfo.RemoteActionCompatParcelizer() != null) {
                return false;
            }
        } else if (!str3.equals(mediaCodecInfo.RemoteActionCompatParcelizer())) {
            return false;
        }
        adjustMaxInputChannelCount adjustmaxinputchannelcount = this.AudioAttributesCompatParcelizer;
        if (adjustmaxinputchannelcount == null) {
            if (mediaCodecInfo.write() != null) {
                return false;
            }
        } else if (!adjustmaxinputchannelcount.equals(mediaCodecInfo.write())) {
            return false;
        }
        MediaCodecInfo.read readVar = this.write;
        if (readVar == null) {
            if (mediaCodecInfo.AudioAttributesCompatParcelizer() != null) {
                return false;
            }
        } else if (!readVar.equals(mediaCodecInfo.AudioAttributesCompatParcelizer())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.read;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.RemoteActionCompatParcelizer;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        adjustMaxInputChannelCount adjustmaxinputchannelcount = this.AudioAttributesCompatParcelizer;
        int iHashCode4 = adjustmaxinputchannelcount == null ? 0 : adjustmaxinputchannelcount.hashCode();
        MediaCodecInfo.read readVar = this.write;
        return ((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ (readVar != null ? readVar.hashCode() : 0);
    }

    static final class RemoteActionCompatParcelizer extends MediaCodecInfo.IconCompatParcelizer {
        private String AudioAttributesCompatParcelizer;
        private adjustMaxInputChannelCount IconCompatParcelizer;
        private MediaCodecInfo.read RemoteActionCompatParcelizer;
        private String read;
        private String write;

        RemoteActionCompatParcelizer() {
        }

        @Override // o.MediaCodecInfo.IconCompatParcelizer
        public final MediaCodecInfo.IconCompatParcelizer RemoteActionCompatParcelizer(String str) {
            this.write = str;
            return this;
        }

        @Override // o.MediaCodecInfo.IconCompatParcelizer
        public final MediaCodecInfo.IconCompatParcelizer AudioAttributesCompatParcelizer(String str) {
            this.read = str;
            return this;
        }

        @Override // o.MediaCodecInfo.IconCompatParcelizer
        public final MediaCodecInfo.IconCompatParcelizer write(String str) {
            this.AudioAttributesCompatParcelizer = str;
            return this;
        }

        @Override // o.MediaCodecInfo.IconCompatParcelizer
        public final MediaCodecInfo.IconCompatParcelizer AudioAttributesCompatParcelizer(adjustMaxInputChannelCount adjustmaxinputchannelcount) {
            this.IconCompatParcelizer = adjustmaxinputchannelcount;
            return this;
        }

        @Override // o.MediaCodecInfo.IconCompatParcelizer
        public final MediaCodecInfo.IconCompatParcelizer RemoteActionCompatParcelizer(MediaCodecInfo.read readVar) {
            this.RemoteActionCompatParcelizer = readVar;
            return this;
        }

        @Override // o.MediaCodecInfo.IconCompatParcelizer
        public final MediaCodecInfo AudioAttributesCompatParcelizer() {
            return new MediaCodecAdapterOnFrameRenderedListener(this.write, this.read, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, (byte) 0);
        }
    }
}
