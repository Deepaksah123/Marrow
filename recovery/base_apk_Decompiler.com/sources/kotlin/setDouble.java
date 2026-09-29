package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lo/setDouble;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "read", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setDouble {
    private static final /* synthetic */ setDouble[] AudioAttributesCompatParcelizer;
    public static final setDouble RemoteActionCompatParcelizer = new setDouble("SKIP", 0);
    public static final setDouble IconCompatParcelizer = new setDouble("NEXT", 1);
    public static final setDouble read = new setDouble("COMPLETE", 2);
    public static final setDouble write = new setDouble("DONE", 3);

    private setDouble(String str, int i) {
    }

    static {
        setDouble[] setdoubleArr = read();
        AudioAttributesCompatParcelizer = setdoubleArr;
        getMagicModuleTimeline.IconCompatParcelizer(setdoubleArr);
    }

    private static final /* synthetic */ setDouble[] read() {
        return new setDouble[]{RemoteActionCompatParcelizer, IconCompatParcelizer, read, write};
    }

    public static setDouble valueOf(String str) {
        return (setDouble) Enum.valueOf(setDouble.class, str);
    }

    public static setDouble[] values() {
        return (setDouble[]) AudioAttributesCompatParcelizer.clone();
    }
}
