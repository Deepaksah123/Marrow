package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/dump;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class dump {
    private static final /* synthetic */ getMagicModuleSavedMcqCount IconCompatParcelizer;
    private static final /* synthetic */ dump[] write;
    public static final dump AudioAttributesCompatParcelizer = new dump("Min", 0);
    public static final dump read = new dump("Max", 1);

    private dump(String str, int i) {
    }

    static {
        dump[] dumpVarArrIconCompatParcelizer = IconCompatParcelizer();
        write = dumpVarArrIconCompatParcelizer;
        IconCompatParcelizer = getMagicModuleTimeline.IconCompatParcelizer(dumpVarArrIconCompatParcelizer);
    }

    private static final /* synthetic */ dump[] IconCompatParcelizer() {
        return new dump[]{AudioAttributesCompatParcelizer, read};
    }

    public static dump valueOf(String str) {
        return (dump) Enum.valueOf(dump.class, str);
    }

    public static dump[] values() {
        return (dump[]) write.clone();
    }
}
