package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/getCStringLength;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getCStringLength {
    private static final /* synthetic */ getCStringLength[] IconCompatParcelizer;
    public static final getCStringLength RemoteActionCompatParcelizer = new getCStringLength("TIMER_UPDATED", 0);
    public static final getCStringLength read = new getCStringLength("TEST_ALREADY_SUBMITTED", 1);

    private getCStringLength(String str, int i) {
    }

    static {
        getCStringLength[] getcstringlengthArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        IconCompatParcelizer = getcstringlengthArrRemoteActionCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(getcstringlengthArrRemoteActionCompatParcelizer);
    }

    private static final /* synthetic */ getCStringLength[] RemoteActionCompatParcelizer() {
        return new getCStringLength[]{RemoteActionCompatParcelizer, read};
    }

    public static getCStringLength valueOf(String str) {
        return (getCStringLength) Enum.valueOf(getCStringLength.class, str);
    }

    public static getCStringLength[] values() {
        return (getCStringLength[]) IconCompatParcelizer.clone();
    }
}
