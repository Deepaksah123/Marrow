package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/setAddressLine2;", "", "<init>", "(Ljava/lang/String;I)V", "read", "AudioAttributesCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setAddressLine2 {
    private static final /* synthetic */ setAddressLine2[] write;
    public static final setAddressLine2 read = new setAddressLine2("SUSPEND", 0);
    public static final setAddressLine2 AudioAttributesCompatParcelizer = new setAddressLine2("DROP_OLDEST", 1);
    public static final setAddressLine2 IconCompatParcelizer = new setAddressLine2("DROP_LATEST", 2);

    private setAddressLine2(String str, int i) {
    }

    static {
        setAddressLine2[] setaddressline2ArrIconCompatParcelizer = IconCompatParcelizer();
        write = setaddressline2ArrIconCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(setaddressline2ArrIconCompatParcelizer);
    }

    public static setAddressLine2 valueOf(String str) {
        return (setAddressLine2) Enum.valueOf(setAddressLine2.class, str);
    }

    public static setAddressLine2[] values() {
        return (setAddressLine2[]) write.clone();
    }

    private static final /* synthetic */ setAddressLine2[] IconCompatParcelizer() {
        return new setAddressLine2[]{read, AudioAttributesCompatParcelizer, IconCompatParcelizer};
    }
}
