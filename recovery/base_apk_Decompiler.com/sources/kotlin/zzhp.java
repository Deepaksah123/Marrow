package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lo/zzhp;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "read", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zzhp {
    private static final /* synthetic */ zzhp[] write;
    public static final zzhp AudioAttributesCompatParcelizer = new zzhp("INICET_SKIP", 0);
    public static final zzhp IconCompatParcelizer = new zzhp("SKIPPED", 1);
    public static final zzhp read = new zzhp("SILLY_MISTAKE", 2);
    public static final zzhp RemoteActionCompatParcelizer = new zzhp("NO_LABEL", 3);

    private zzhp(String str, int i) {
    }

    static {
        zzhp[] zzhpVarArrIconCompatParcelizer = IconCompatParcelizer();
        write = zzhpVarArrIconCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(zzhpVarArrIconCompatParcelizer);
    }

    private static final /* synthetic */ zzhp[] IconCompatParcelizer() {
        return new zzhp[]{AudioAttributesCompatParcelizer, IconCompatParcelizer, read, RemoteActionCompatParcelizer};
    }

    public static zzhp valueOf(String str) {
        return (zzhp) Enum.valueOf(zzhp.class, str);
    }

    public static zzhp[] values() {
        return (zzhp[]) write.clone();
    }
}
