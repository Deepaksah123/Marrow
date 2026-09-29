package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/isBufferLate;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class isBufferLate {
    public static final isBufferLate IconCompatParcelizer = new isBufferLate("ALL", 0);
    public static final isBufferLate RemoteActionCompatParcelizer = new isBufferLate("STEP", 1);
    private static final /* synthetic */ isBufferLate[] write;

    private isBufferLate(String str, int i) {
    }

    static {
        isBufferLate[] isbufferlateArrWrite = write();
        write = isbufferlateArrWrite;
        getMagicModuleTimeline.IconCompatParcelizer(isbufferlateArrWrite);
    }

    private static final /* synthetic */ isBufferLate[] write() {
        return new isBufferLate[]{IconCompatParcelizer, RemoteActionCompatParcelizer};
    }

    public static isBufferLate valueOf(String str) {
        return (isBufferLate) Enum.valueOf(isBufferLate.class, str);
    }

    public static isBufferLate[] values() {
        return (isBufferLate[]) write.clone();
    }
}
