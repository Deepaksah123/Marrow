package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lo/ClientSettings;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "write", "AudioAttributesCompatParcelizer", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ClientSettings {
    private static final /* synthetic */ ClientSettings[] AudioAttributesImplApi21Parcelizer;
    public static final ClientSettings RemoteActionCompatParcelizer = new ClientSettings("IDLE", 0);
    public static final ClientSettings IconCompatParcelizer = new ClientSettings("BUFFERING", 1);
    public static final ClientSettings write = new ClientSettings("PLAYING", 2);
    public static final ClientSettings AudioAttributesCompatParcelizer = new ClientSettings("PAUSED", 3);
    public static final ClientSettings read = new ClientSettings("ENDED", 4);

    static {
        ClientSettings[] clientSettingsArrWrite = write();
        AudioAttributesImplApi21Parcelizer = clientSettingsArrWrite;
        getMagicModuleTimeline.IconCompatParcelizer(clientSettingsArrWrite);
    }

    private ClientSettings(String str, int i) {
    }

    private static final /* synthetic */ ClientSettings[] write() {
        return new ClientSettings[]{RemoteActionCompatParcelizer, IconCompatParcelizer, write, AudioAttributesCompatParcelizer, read};
    }

    public static ClientSettings valueOf(String str) {
        return (ClientSettings) Enum.valueOf(ClientSettings.class, str);
    }

    public static ClientSettings[] values() {
        return (ClientSettings[]) AudioAttributesImplApi21Parcelizer.clone();
    }
}
