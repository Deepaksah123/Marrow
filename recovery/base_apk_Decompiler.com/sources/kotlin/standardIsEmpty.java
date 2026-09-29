package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/standardIsEmpty;", "", "<init>", "(Ljava/lang/String;I)V", "write", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class standardIsEmpty {
    private static final /* synthetic */ standardIsEmpty[] RemoteActionCompatParcelizer;
    public static final standardIsEmpty write = new standardIsEmpty("RESTART_REQUIRED", 0);
    public static final standardIsEmpty AudioAttributesCompatParcelizer = new standardIsEmpty("CONTACT_SUPPORT", 1);

    private standardIsEmpty(String str, int i) {
    }

    static {
        standardIsEmpty[] standardisemptyArrIconCompatParcelizer = IconCompatParcelizer();
        RemoteActionCompatParcelizer = standardisemptyArrIconCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(standardisemptyArrIconCompatParcelizer);
    }

    private static final /* synthetic */ standardIsEmpty[] IconCompatParcelizer() {
        return new standardIsEmpty[]{write, AudioAttributesCompatParcelizer};
    }

    public static standardIsEmpty valueOf(String str) {
        return (standardIsEmpty) Enum.valueOf(standardIsEmpty.class, str);
    }

    public static standardIsEmpty[] values() {
        return (standardIsEmpty[]) RemoteActionCompatParcelizer.clone();
    }
}
