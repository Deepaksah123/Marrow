package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/setTrackTintMode;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setTrackTintMode {
    private static final /* synthetic */ getMagicModuleSavedMcqCount IconCompatParcelizer;
    private static final /* synthetic */ setTrackTintMode[] read;
    public static final setTrackTintMode AudioAttributesCompatParcelizer = new setTrackTintMode("Default", 0);
    public static final setTrackTintMode RemoteActionCompatParcelizer = new setTrackTintMode("UserInput", 1);
    public static final setTrackTintMode write = new setTrackTintMode("PreventUserInput", 2);

    private setTrackTintMode(String str, int i) {
    }

    static {
        setTrackTintMode[] settracktintmodeArrWrite = write();
        read = settracktintmodeArrWrite;
        IconCompatParcelizer = getMagicModuleTimeline.IconCompatParcelizer(settracktintmodeArrWrite);
    }

    private static final /* synthetic */ setTrackTintMode[] write() {
        return new setTrackTintMode[]{AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer, write};
    }

    public static setTrackTintMode valueOf(String str) {
        return (setTrackTintMode) Enum.valueOf(setTrackTintMode.class, str);
    }

    public static setTrackTintMode[] values() {
        return (setTrackTintMode[]) read.clone();
    }
}
