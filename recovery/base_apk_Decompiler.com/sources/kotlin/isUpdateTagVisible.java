package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/isUpdateTagVisible;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "read", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class isUpdateTagVisible {
    private static final /* synthetic */ isUpdateTagVisible[] RemoteActionCompatParcelizer;
    public static final isUpdateTagVisible IconCompatParcelizer = new isUpdateTagVisible("START", 0);
    public static final isUpdateTagVisible read = new isUpdateTagVisible("STOP", 1);
    public static final isUpdateTagVisible write = new isUpdateTagVisible("STOP_AND_RESET_REPLAY_CACHE", 2);

    private isUpdateTagVisible(String str, int i) {
    }

    static {
        isUpdateTagVisible[] isupdatetagvisibleArrIconCompatParcelizer = IconCompatParcelizer();
        RemoteActionCompatParcelizer = isupdatetagvisibleArrIconCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(isupdatetagvisibleArrIconCompatParcelizer);
    }

    public static isUpdateTagVisible valueOf(String str) {
        return (isUpdateTagVisible) Enum.valueOf(isUpdateTagVisible.class, str);
    }

    public static isUpdateTagVisible[] values() {
        return (isUpdateTagVisible[]) RemoteActionCompatParcelizer.clone();
    }

    private static final /* synthetic */ isUpdateTagVisible[] IconCompatParcelizer() {
        return new isUpdateTagVisible[]{IconCompatParcelizer, read, write};
    }
}
