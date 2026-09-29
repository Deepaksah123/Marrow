package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lo/access5800;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "write", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class access5800 {
    private static final /* synthetic */ access5800[] read;
    private static access5800 IconCompatParcelizer = new access5800("QUEUED", 0);
    public static final access5800 write = new access5800("IN_PROGRESS", 1);
    public static final access5800 AudioAttributesCompatParcelizer = new access5800("SUCCESSFUL", 2);
    public static final access5800 RemoteActionCompatParcelizer = new access5800("FAILED", 3);

    private access5800(String str, int i) {
    }

    static {
        access5800[] access5800VarArr = read();
        read = access5800VarArr;
        getMagicModuleTimeline.IconCompatParcelizer(access5800VarArr);
    }

    public static access5800 valueOf(String str) {
        return (access5800) Enum.valueOf(access5800.class, str);
    }

    public static access5800[] values() {
        return (access5800[]) read.clone();
    }

    private static final /* synthetic */ access5800[] read() {
        return new access5800[]{IconCompatParcelizer, write, AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer};
    }
}
