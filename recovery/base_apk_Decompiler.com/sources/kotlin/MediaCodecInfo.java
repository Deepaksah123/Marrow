package kotlin;

import kotlin.MediaCodecAdapterOnFrameRenderedListener;

/* JADX INFO: loaded from: classes5.dex */
public abstract class MediaCodecInfo {

    public static abstract class IconCompatParcelizer {
        public abstract IconCompatParcelizer AudioAttributesCompatParcelizer(String str);

        public abstract IconCompatParcelizer AudioAttributesCompatParcelizer(adjustMaxInputChannelCount adjustmaxinputchannelcount);

        public abstract MediaCodecInfo AudioAttributesCompatParcelizer();

        public abstract IconCompatParcelizer RemoteActionCompatParcelizer(String str);

        public abstract IconCompatParcelizer RemoteActionCompatParcelizer(read readVar);

        public abstract IconCompatParcelizer write(String str);
    }

    public enum read {
        OK,
        BAD_CONFIG
    }

    public abstract read AudioAttributesCompatParcelizer();

    public abstract String IconCompatParcelizer();

    public abstract String RemoteActionCompatParcelizer();

    public abstract String read();

    public abstract adjustMaxInputChannelCount write();

    public static IconCompatParcelizer AudioAttributesImplApi21Parcelizer() {
        return new MediaCodecAdapterOnFrameRenderedListener.RemoteActionCompatParcelizer();
    }
}
