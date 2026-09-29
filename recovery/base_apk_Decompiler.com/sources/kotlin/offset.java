package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/offset;", "", "<init>", "(Ljava/lang/String;I)V", "write", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class offset {
    private static final /* synthetic */ getMagicModuleSavedMcqCount RemoteActionCompatParcelizer;
    private static final /* synthetic */ offset[] read;
    public static final offset write = new offset("Closed", 0);
    public static final offset AudioAttributesCompatParcelizer = new offset("Open", 1);

    private offset(String str, int i) {
    }

    static {
        offset[] offsetVarArrWrite = write();
        read = offsetVarArrWrite;
        RemoteActionCompatParcelizer = getMagicModuleTimeline.IconCompatParcelizer(offsetVarArrWrite);
    }

    private static final /* synthetic */ offset[] write() {
        return new offset[]{write, AudioAttributesCompatParcelizer};
    }

    public static offset valueOf(String str) {
        return (offset) Enum.valueOf(offset.class, str);
    }

    public static offset[] values() {
        return (offset[]) read.clone();
    }
}
