package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/deleteSearchTables;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class deleteSearchTables {
    public static final deleteSearchTables AudioAttributesCompatParcelizer = new deleteSearchTables("INVARIANT", 0);
    public static final deleteSearchTables IconCompatParcelizer = new deleteSearchTables("IN", 1);
    public static final deleteSearchTables read = new deleteSearchTables("OUT", 2);
    private static final /* synthetic */ deleteSearchTables[] write;

    private deleteSearchTables(String str, int i) {
    }

    static {
        deleteSearchTables[] deletesearchtablesArr = read();
        write = deletesearchtablesArr;
        getMagicModuleTimeline.IconCompatParcelizer(deletesearchtablesArr);
    }

    private static final /* synthetic */ deleteSearchTables[] read() {
        return new deleteSearchTables[]{AudioAttributesCompatParcelizer, IconCompatParcelizer, read};
    }

    public static deleteSearchTables valueOf(String str) {
        return (deleteSearchTables) Enum.valueOf(deleteSearchTables.class, str);
    }

    public static deleteSearchTables[] values() {
        return (deleteSearchTables[]) write.clone();
    }
}
