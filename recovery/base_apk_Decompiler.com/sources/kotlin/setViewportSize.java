package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/setViewportSize;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "write", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setViewportSize {
    private static final /* synthetic */ setViewportSize[] RemoteActionCompatParcelizer;
    public static final setViewportSize AudioAttributesCompatParcelizer = new setViewportSize("NO_PIP", 0);
    public static final setViewportSize write = new setViewportSize("INTERNAL_PIP", 1);
    public static final setViewportSize IconCompatParcelizer = new setViewportSize("EXTERNAL_PIP", 2);

    private setViewportSize(String str, int i) {
    }

    static {
        setViewportSize[] setviewportsizeArrWrite = write();
        RemoteActionCompatParcelizer = setviewportsizeArrWrite;
        getMagicModuleTimeline.IconCompatParcelizer(setviewportsizeArrWrite);
    }

    private static final /* synthetic */ setViewportSize[] write() {
        return new setViewportSize[]{AudioAttributesCompatParcelizer, write, IconCompatParcelizer};
    }

    public static setViewportSize valueOf(String str) {
        return (setViewportSize) Enum.valueOf(setViewportSize.class, str);
    }

    public static setViewportSize[] values() {
        return (setViewportSize[]) RemoteActionCompatParcelizer.clone();
    }
}
