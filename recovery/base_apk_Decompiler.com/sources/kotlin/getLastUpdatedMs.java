package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lo/getLastUpdatedMs;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "read", "write", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getLastUpdatedMs {
    private static final /* synthetic */ getLastUpdatedMs[] AudioAttributesCompatParcelizer;
    public static final getLastUpdatedMs IconCompatParcelizer = new getLastUpdatedMs("SUCCESSFUL", 0);
    public static final getLastUpdatedMs read = new getLastUpdatedMs("REREGISTER", 1);
    public static final getLastUpdatedMs write = new getLastUpdatedMs("CANCELLED", 2);
    public static final getLastUpdatedMs RemoteActionCompatParcelizer = new getLastUpdatedMs("ALREADY_SELECTED", 3);

    private getLastUpdatedMs(String str, int i) {
    }

    static {
        getLastUpdatedMs[] getlastupdatedmsArrWrite = write();
        AudioAttributesCompatParcelizer = getlastupdatedmsArrWrite;
        getMagicModuleTimeline.IconCompatParcelizer(getlastupdatedmsArrWrite);
    }

    public static getLastUpdatedMs valueOf(String str) {
        return (getLastUpdatedMs) Enum.valueOf(getLastUpdatedMs.class, str);
    }

    public static getLastUpdatedMs[] values() {
        return (getLastUpdatedMs[]) AudioAttributesCompatParcelizer.clone();
    }

    private static final /* synthetic */ getLastUpdatedMs[] write() {
        return new getLastUpdatedMs[]{IconCompatParcelizer, read, write, RemoteActionCompatParcelizer};
    }
}
