package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/getMonth;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "read", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getMonth {
    private static final /* synthetic */ getMonth[] AudioAttributesCompatParcelizer;
    public static final getMonth IconCompatParcelizer = new getMonth("COROUTINE_SUSPENDED", 0);
    public static final getMonth read = new getMonth("UNDECIDED", 1);
    public static final getMonth RemoteActionCompatParcelizer = new getMonth("RESUMED", 2);

    private getMonth(String str, int i) {
    }

    static {
        getMonth[] getmonthArrWrite = write();
        AudioAttributesCompatParcelizer = getmonthArrWrite;
        getMagicModuleTimeline.IconCompatParcelizer(getmonthArrWrite);
    }

    private static final /* synthetic */ getMonth[] write() {
        return new getMonth[]{IconCompatParcelizer, read, RemoteActionCompatParcelizer};
    }

    public static getMonth valueOf(String str) {
        return (getMonth) Enum.valueOf(getMonth.class, str);
    }

    public static getMonth[] values() {
        return (getMonth[]) AudioAttributesCompatParcelizer.clone();
    }
}
