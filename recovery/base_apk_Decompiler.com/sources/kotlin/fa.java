package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lo/fa;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "read", "write", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class fa {
    private static final /* synthetic */ fa[] RemoteActionCompatParcelizer;

    @getRenewGrpId
    private static fa IconCompatParcelizer = new fa("REPLACE", 0);
    public static final fa read = new fa("KEEP", 1);
    public static final fa write = new fa("UPDATE", 2);
    private static fa AudioAttributesCompatParcelizer = new fa("CANCEL_AND_REENQUEUE", 3);

    private fa(String str, int i) {
    }

    static {
        fa[] faVarArr = read();
        RemoteActionCompatParcelizer = faVarArr;
        getMagicModuleTimeline.IconCompatParcelizer(faVarArr);
    }

    private static final /* synthetic */ fa[] read() {
        return new fa[]{IconCompatParcelizer, read, write, AudioAttributesCompatParcelizer};
    }

    public static fa valueOf(String str) {
        return (fa) Enum.valueOf(fa.class, str);
    }

    public static fa[] values() {
        return (fa[]) RemoteActionCompatParcelizer.clone();
    }
}
