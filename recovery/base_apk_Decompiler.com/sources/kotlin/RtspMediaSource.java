package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public interface RtspMediaSource {

    public interface RemoteActionCompatParcelizer {
        void e_(String str);

        void write(String str);
    }

    String AudioAttributesCompatParcelizer();

    void AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer);

    void AudioAttributesImplApi21Parcelizer();

    void AudioAttributesImplApi26Parcelizer();

    boolean MediaBrowserCompatCustomActionResultReceiver();

    void MediaBrowserCompatItemReceiver();

    String RemoteActionCompatParcelizer();

    int read();

    String write();
}
