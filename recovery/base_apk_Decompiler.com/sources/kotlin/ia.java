package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lo/ia;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "write", "AudioAttributesImplBaseParcelizer", "read", "AudioAttributesCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ia {
    private static final /* synthetic */ ia[] AudioAttributesImplApi26Parcelizer;
    public static final ia RemoteActionCompatParcelizer = new ia("NOT_REQUIRED", 0);
    public static final ia write = new ia("CONNECTED", 1);
    public static final ia AudioAttributesImplBaseParcelizer = new ia("UNMETERED", 2);
    public static final ia read = new ia("NOT_ROAMING", 3);
    public static final ia AudioAttributesCompatParcelizer = new ia("METERED", 4);
    public static final ia IconCompatParcelizer = new ia("TEMPORARILY_UNMETERED", 5);

    private ia(String str, int i) {
    }

    static {
        ia[] iaVarArr = read();
        AudioAttributesImplApi26Parcelizer = iaVarArr;
        getMagicModuleTimeline.IconCompatParcelizer(iaVarArr);
    }

    private static final /* synthetic */ ia[] read() {
        return new ia[]{RemoteActionCompatParcelizer, write, AudioAttributesImplBaseParcelizer, read, AudioAttributesCompatParcelizer, IconCompatParcelizer};
    }

    public static ia valueOf(String str) {
        return (ia) Enum.valueOf(ia.class, str);
    }

    public static ia[] values() {
        return (ia[]) AudioAttributesImplApi26Parcelizer.clone();
    }
}
