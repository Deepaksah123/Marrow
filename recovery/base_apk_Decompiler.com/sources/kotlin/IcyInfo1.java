package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public class IcyInfo1 extends Track {
    private final RemoteActionCompatParcelizer RemoteActionCompatParcelizer;

    public IcyInfo1(String str) {
        super(str);
        this.RemoteActionCompatParcelizer = RemoteActionCompatParcelizer.UNKNOWN;
    }

    public IcyInfo1(String str, Throwable th) {
        super(str, th);
        this.RemoteActionCompatParcelizer = RemoteActionCompatParcelizer.UNKNOWN;
    }

    public IcyInfo1(String str, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        super(str);
        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
    }

    public IcyInfo1(String str, Throwable th, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        super(str, th);
        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
    }

    public enum RemoteActionCompatParcelizer {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);

        private final int AudioAttributesImplBaseParcelizer;

        RemoteActionCompatParcelizer(int i) {
            this.AudioAttributesImplBaseParcelizer = i;
        }
    }
}
