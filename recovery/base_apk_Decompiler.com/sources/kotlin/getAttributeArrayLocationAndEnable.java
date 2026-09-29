package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lo/getAttributeArrayLocationAndEnable;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "write", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getAttributeArrayLocationAndEnable {
    private static final /* synthetic */ getAttributeArrayLocationAndEnable[] AudioAttributesImplApi21Parcelizer;
    public static final getAttributeArrayLocationAndEnable RemoteActionCompatParcelizer = new getAttributeArrayLocationAndEnable("TEST_SUBMIT_SUCCESS", 0);
    public static final getAttributeArrayLocationAndEnable IconCompatParcelizer = new getAttributeArrayLocationAndEnable("TEST_ALREADY_SUBMITTED", 1);
    public static final getAttributeArrayLocationAndEnable AudioAttributesCompatParcelizer = new getAttributeArrayLocationAndEnable("TEST_OPEN_IN_MULTIPLE_DEVICES", 2);
    public static final getAttributeArrayLocationAndEnable write = new getAttributeArrayLocationAndEnable("TEST_PARTIALLY_SUBMITTED", 3);
    public static final getAttributeArrayLocationAndEnable read = new getAttributeArrayLocationAndEnable("ERROR_CUSTOM_MODULE_EXPIRED", 4);

    private getAttributeArrayLocationAndEnable(String str, int i) {
    }

    static {
        getAttributeArrayLocationAndEnable[] getattributearraylocationandenableArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        AudioAttributesImplApi21Parcelizer = getattributearraylocationandenableArrRemoteActionCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(getattributearraylocationandenableArrRemoteActionCompatParcelizer);
    }

    private static final /* synthetic */ getAttributeArrayLocationAndEnable[] RemoteActionCompatParcelizer() {
        return new getAttributeArrayLocationAndEnable[]{RemoteActionCompatParcelizer, IconCompatParcelizer, AudioAttributesCompatParcelizer, write, read};
    }

    public static getAttributeArrayLocationAndEnable valueOf(String str) {
        return (getAttributeArrayLocationAndEnable) Enum.valueOf(getAttributeArrayLocationAndEnable.class, str);
    }

    public static getAttributeArrayLocationAndEnable[] values() {
        return (getAttributeArrayLocationAndEnable[]) AudioAttributesImplApi21Parcelizer.clone();
    }
}
