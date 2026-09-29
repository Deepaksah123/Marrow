package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lo/setGlobalDebugLoggingEnabled;", "", "<init>", "(Ljava/lang/String;I)V", "read", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setGlobalDebugLoggingEnabled {
    private static final /* synthetic */ setGlobalDebugLoggingEnabled[] MediaBrowserCompatItemReceiver;
    private static final /* synthetic */ getMagicModuleSavedMcqCount write;
    public static final setGlobalDebugLoggingEnabled read = new setGlobalDebugLoggingEnabled("Up", 0);
    public static final setGlobalDebugLoggingEnabled RemoteActionCompatParcelizer = new setGlobalDebugLoggingEnabled("Drag", 1);
    public static final setGlobalDebugLoggingEnabled IconCompatParcelizer = new setGlobalDebugLoggingEnabled("Timeout", 2);
    public static final setGlobalDebugLoggingEnabled AudioAttributesCompatParcelizer = new setGlobalDebugLoggingEnabled("Cancel", 3);

    private setGlobalDebugLoggingEnabled(String str, int i) {
    }

    static {
        setGlobalDebugLoggingEnabled[] setglobaldebugloggingenabledArr = read();
        MediaBrowserCompatItemReceiver = setglobaldebugloggingenabledArr;
        write = getMagicModuleTimeline.IconCompatParcelizer(setglobaldebugloggingenabledArr);
    }

    private static final /* synthetic */ setGlobalDebugLoggingEnabled[] read() {
        return new setGlobalDebugLoggingEnabled[]{read, RemoteActionCompatParcelizer, IconCompatParcelizer, AudioAttributesCompatParcelizer};
    }

    public static setGlobalDebugLoggingEnabled valueOf(String str) {
        return (setGlobalDebugLoggingEnabled) Enum.valueOf(setGlobalDebugLoggingEnabled.class, str);
    }

    public static setGlobalDebugLoggingEnabled[] values() {
        return (setGlobalDebugLoggingEnabled[]) MediaBrowserCompatItemReceiver.clone();
    }
}
