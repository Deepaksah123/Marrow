package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/setOnMaskChangedListener;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setOnMaskChangedListener {
    private static final /* synthetic */ setOnMaskChangedListener[] RemoteActionCompatParcelizer;
    public static final setOnMaskChangedListener IconCompatParcelizer = new setOnMaskChangedListener("SELECTION_MODEL", 0);
    public static final setOnMaskChangedListener write = new setOnMaskChangedListener("NON_SELECTION_MODE", 1);

    private setOnMaskChangedListener(String str, int i) {
    }

    static {
        setOnMaskChangedListener[] setonmaskchangedlistenerArrWrite = write();
        RemoteActionCompatParcelizer = setonmaskchangedlistenerArrWrite;
        getMagicModuleTimeline.IconCompatParcelizer(setonmaskchangedlistenerArrWrite);
    }

    private static final /* synthetic */ setOnMaskChangedListener[] write() {
        return new setOnMaskChangedListener[]{IconCompatParcelizer, write};
    }

    public static setOnMaskChangedListener valueOf(String str) {
        return (setOnMaskChangedListener) Enum.valueOf(setOnMaskChangedListener.class, str);
    }

    public static setOnMaskChangedListener[] values() {
        return (setOnMaskChangedListener[]) RemoteActionCompatParcelizer.clone();
    }
}
