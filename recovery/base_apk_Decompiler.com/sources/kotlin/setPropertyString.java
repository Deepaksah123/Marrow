package kotlin;

import kotlin.provideProvisionResponse;

/* JADX INFO: loaded from: classes5.dex */
public abstract class setPropertyString {

    public static abstract class AudioAttributesCompatParcelizer {
        public abstract AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(long j);

        public abstract setPropertyString AudioAttributesCompatParcelizer();

        abstract AudioAttributesCompatParcelizer IconCompatParcelizer(byte[] bArr);

        public abstract AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(long j);

        public abstract AudioAttributesCompatParcelizer read(ErrorStateDrmSession errorStateDrmSession);

        public abstract AudioAttributesCompatParcelizer write(long j);

        public abstract AudioAttributesCompatParcelizer write(Integer num);

        abstract AudioAttributesCompatParcelizer write(String str);
    }

    public abstract ErrorStateDrmSession AudioAttributesCompatParcelizer();

    public abstract long IconCompatParcelizer();

    public abstract long MediaBrowserCompatCustomActionResultReceiver();

    public abstract String MediaBrowserCompatItemReceiver();

    public abstract long RemoteActionCompatParcelizer();

    public abstract Integer read();

    public abstract byte[] write();

    public static AudioAttributesCompatParcelizer read(byte[] bArr) {
        return AudioAttributesImplBaseParcelizer().IconCompatParcelizer(bArr);
    }

    public static AudioAttributesCompatParcelizer IconCompatParcelizer(String str) {
        return AudioAttributesImplBaseParcelizer().write(str);
    }

    private static AudioAttributesCompatParcelizer AudioAttributesImplBaseParcelizer() {
        return new provideProvisionResponse.AudioAttributesCompatParcelizer();
    }
}
