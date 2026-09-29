package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/superDispatchKeyEvent;", "", "<init>", "(Ljava/lang/String;I)V", "write", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class superDispatchKeyEvent {
    private static final /* synthetic */ getMagicModuleSavedMcqCount IconCompatParcelizer;
    private static final /* synthetic */ superDispatchKeyEvent[] RemoteActionCompatParcelizer;
    public static final superDispatchKeyEvent write = new superDispatchKeyEvent("Vertical", 0);
    public static final superDispatchKeyEvent AudioAttributesCompatParcelizer = new superDispatchKeyEvent("Horizontal", 1);

    private superDispatchKeyEvent(String str, int i) {
    }

    static {
        superDispatchKeyEvent[] superdispatchkeyeventArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        RemoteActionCompatParcelizer = superdispatchkeyeventArrRemoteActionCompatParcelizer;
        IconCompatParcelizer = getMagicModuleTimeline.IconCompatParcelizer(superdispatchkeyeventArrRemoteActionCompatParcelizer);
    }

    private static final /* synthetic */ superDispatchKeyEvent[] RemoteActionCompatParcelizer() {
        return new superDispatchKeyEvent[]{write, AudioAttributesCompatParcelizer};
    }

    public static superDispatchKeyEvent valueOf(String str) {
        return (superDispatchKeyEvent) Enum.valueOf(superDispatchKeyEvent.class, str);
    }

    public static superDispatchKeyEvent[] values() {
        return (superDispatchKeyEvent[]) RemoteActionCompatParcelizer.clone();
    }
}
