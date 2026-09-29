package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/hasGenericTypes;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class hasGenericTypes {
    public static final hasGenericTypes IconCompatParcelizer = new hasGenericTypes("Min", 0);
    public static final hasGenericTypes RemoteActionCompatParcelizer = new hasGenericTypes("Max", 1);
    private static final /* synthetic */ getMagicModuleSavedMcqCount read;
    private static final /* synthetic */ hasGenericTypes[] write;

    private hasGenericTypes(String str, int i) {
    }

    static {
        hasGenericTypes[] hasgenerictypesArrIconCompatParcelizer = IconCompatParcelizer();
        write = hasgenerictypesArrIconCompatParcelizer;
        read = getMagicModuleTimeline.IconCompatParcelizer(hasgenerictypesArrIconCompatParcelizer);
    }

    private static final /* synthetic */ hasGenericTypes[] IconCompatParcelizer() {
        return new hasGenericTypes[]{IconCompatParcelizer, RemoteActionCompatParcelizer};
    }

    public static hasGenericTypes valueOf(String str) {
        return (hasGenericTypes) Enum.valueOf(hasGenericTypes.class, str);
    }

    public static hasGenericTypes[] values() {
        return (hasGenericTypes[]) write.clone();
    }
}
