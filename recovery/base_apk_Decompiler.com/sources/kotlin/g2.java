package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lo/g2;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "read", "IconCompatParcelizer", "write"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g2 {
    private static final /* synthetic */ g2[] RemoteActionCompatParcelizer;
    public static final g2 AudioAttributesCompatParcelizer = new g2("REPLACE", 0);
    public static final g2 read = new g2("KEEP", 1);
    public static final g2 IconCompatParcelizer = new g2("APPEND", 2);
    public static final g2 write = new g2("APPEND_OR_REPLACE", 3);

    private g2(String str, int i) {
    }

    static {
        g2[] g2VarArrIconCompatParcelizer = IconCompatParcelizer();
        RemoteActionCompatParcelizer = g2VarArrIconCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(g2VarArrIconCompatParcelizer);
    }

    private static final /* synthetic */ g2[] IconCompatParcelizer() {
        return new g2[]{AudioAttributesCompatParcelizer, read, IconCompatParcelizer, write};
    }

    public static g2 valueOf(String str) {
        return (g2) Enum.valueOf(g2.class, str);
    }

    public static g2[] values() {
        return (g2[]) RemoteActionCompatParcelizer.clone();
    }
}
