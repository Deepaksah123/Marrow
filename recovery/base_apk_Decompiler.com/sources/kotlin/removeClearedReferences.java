package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/removeClearedReferences;", "", "<init>", "(Ljava/lang/String;I)V", "write", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class removeClearedReferences {
    private static final /* synthetic */ removeClearedReferences[] RemoteActionCompatParcelizer;
    public static final removeClearedReferences write = new removeClearedReferences("HOME", 0);
    public static final removeClearedReferences IconCompatParcelizer = new removeClearedReferences("CUSTOM_MODULE", 1);

    private removeClearedReferences(String str, int i) {
    }

    static {
        removeClearedReferences[] removeclearedreferencesArrIconCompatParcelizer = IconCompatParcelizer();
        RemoteActionCompatParcelizer = removeclearedreferencesArrIconCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(removeclearedreferencesArrIconCompatParcelizer);
    }

    private static final /* synthetic */ removeClearedReferences[] IconCompatParcelizer() {
        return new removeClearedReferences[]{write, IconCompatParcelizer};
    }

    public static removeClearedReferences valueOf(String str) {
        return (removeClearedReferences) Enum.valueOf(removeClearedReferences.class, str);
    }

    public static removeClearedReferences[] values() {
        return (removeClearedReferences[]) RemoteActionCompatParcelizer.clone();
    }
}
