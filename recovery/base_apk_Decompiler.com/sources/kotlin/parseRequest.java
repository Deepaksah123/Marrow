package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class parseRequest {
    private static final long AudioAttributesImplApi21Parcelizer;
    private static final long AudioAttributesImplApi26Parcelizer;
    private static final long MediaBrowserCompatCustomActionResultReceiver;
    private static final long MediaBrowserCompatItemReceiver;
    private static final long RemoteActionCompatParcelizer;
    private static final long read;
    private static final long write;
    private static final long IconCompatParcelizer = RequestPayload.read(4284664031L);
    private static final long AudioAttributesImplBaseParcelizer = RequestPayload.read(4283809493L);
    private static final long AudioAttributesCompatParcelizer = RequestPayload.read(4282538849L);

    static {
        RequestPayload.read(4288071119L);
        AudioAttributesImplApi26Parcelizer = RequestPayload.read(4294375158L);
        RequestPayload.read(4292404198L);
        RequestPayload.read(4288387995L);
        RequestPayload.read(4292177762L);
        RequestPayload.read(4287010972L);
        MediaBrowserCompatCustomActionResultReceiver = RequestPayload.read(4286284162L);
        RequestPayload.read(4284318666L);
        RequestPayload.read(4292404198L);
        RequestPayload.read(4294375158L);
        RequestPayload.read(3088652569L);
        RequestPayload.read(4290165178L);
        MediaBrowserCompatItemReceiver = RequestPayload.read(4279575591L);
        RequestPayload.read(4293652464L);
        RequestPayload.read(4293765288L);
        RequestPayload.AudioAttributesCompatParcelizer(1305267404);
        RequestPayload.AudioAttributesCompatParcelizer(1306056920);
        RequestPayload.read(4287994523L);
        AudioAttributesImplApi21Parcelizer = RequestPayload.read(4294964683L);
        read = RequestPayload.read(4286749342L);
        RemoteActionCompatParcelizer = RequestPayload.read(4278597956L);
        write = RequestPayload.read(4278527533L);
    }

    public static final long read() {
        return IconCompatParcelizer;
    }

    public static final long MediaBrowserCompatItemReceiver() {
        return AudioAttributesImplBaseParcelizer;
    }

    public static final long IconCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }

    public static final long AudioAttributesImplBaseParcelizer() {
        return AudioAttributesImplApi26Parcelizer;
    }

    public static final long AudioAttributesImplApi21Parcelizer() {
        return MediaBrowserCompatCustomActionResultReceiver;
    }

    public static final long MediaBrowserCompatCustomActionResultReceiver() {
        return MediaBrowserCompatItemReceiver;
    }

    public static final long AudioAttributesImplApi26Parcelizer() {
        return AudioAttributesImplApi21Parcelizer;
    }

    public static final long write() {
        return read;
    }

    public static final long RemoteActionCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }

    public static final long AudioAttributesCompatParcelizer() {
        return write;
    }
}
