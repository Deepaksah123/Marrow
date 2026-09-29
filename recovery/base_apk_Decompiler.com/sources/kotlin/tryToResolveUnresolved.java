package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/tryToResolveUnresolved;", "", "<init>", "(Ljava/lang/String;I)V", "write", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class tryToResolveUnresolved {
    private static final /* synthetic */ getMagicModuleSavedMcqCount IconCompatParcelizer;
    private static final /* synthetic */ tryToResolveUnresolved[] read;
    public static final tryToResolveUnresolved write = new tryToResolveUnresolved("Ltr", 0);
    public static final tryToResolveUnresolved RemoteActionCompatParcelizer = new tryToResolveUnresolved("Rtl", 1);

    private tryToResolveUnresolved(String str, int i) {
    }

    static {
        tryToResolveUnresolved[] trytoresolveunresolvedArrIconCompatParcelizer = IconCompatParcelizer();
        read = trytoresolveunresolvedArrIconCompatParcelizer;
        IconCompatParcelizer = getMagicModuleTimeline.IconCompatParcelizer(trytoresolveunresolvedArrIconCompatParcelizer);
    }

    private static final /* synthetic */ tryToResolveUnresolved[] IconCompatParcelizer() {
        return new tryToResolveUnresolved[]{write, RemoteActionCompatParcelizer};
    }

    public static tryToResolveUnresolved valueOf(String str) {
        return (tryToResolveUnresolved) Enum.valueOf(tryToResolveUnresolved.class, str);
    }

    public static tryToResolveUnresolved[] values() {
        return (tryToResolveUnresolved[]) read.clone();
    }
}
