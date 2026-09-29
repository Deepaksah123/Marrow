package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lo/reconnect;", "", "<init>", "(Ljava/lang/String;I)V", "write", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class reconnect {
    private static final /* synthetic */ reconnect[] MediaBrowserCompatCustomActionResultReceiver;
    public static final reconnect write = new reconnect("NONE", 0);
    public static final reconnect RemoteActionCompatParcelizer = new reconnect("TI_EXPIRED_WARNING", 1);
    public static final reconnect IconCompatParcelizer = new reconnect("PAUSED_WARNING", 2);
    public static final reconnect AudioAttributesCompatParcelizer = new reconnect("LIVE_WARNING", 3);
    public static final reconnect read = new reconnect("UNATTEMPTED_WARNING", 4);

    private reconnect(String str, int i) {
    }

    static {
        reconnect[] reconnectVarArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        MediaBrowserCompatCustomActionResultReceiver = reconnectVarArrAudioAttributesCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(reconnectVarArrAudioAttributesCompatParcelizer);
    }

    private static final /* synthetic */ reconnect[] AudioAttributesCompatParcelizer() {
        return new reconnect[]{write, RemoteActionCompatParcelizer, IconCompatParcelizer, AudioAttributesCompatParcelizer, read};
    }

    public static reconnect valueOf(String str) {
        return (reconnect) Enum.valueOf(reconnect.class, str);
    }

    public static reconnect[] values() {
        return (reconnect[]) MediaBrowserCompatCustomActionResultReceiver.clone();
    }
}
