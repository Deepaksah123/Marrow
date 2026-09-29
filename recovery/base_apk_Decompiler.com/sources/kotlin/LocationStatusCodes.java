package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/LocationStatusCodes;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LocationStatusCodes {
    public static final LocationStatusCodes AudioAttributesCompatParcelizer = new LocationStatusCodes("RESEND_OTP", 0);
    public static final LocationStatusCodes RemoteActionCompatParcelizer = new LocationStatusCodes("CONTACT_SUPPORT", 1);
    private static final /* synthetic */ LocationStatusCodes[] read;

    private LocationStatusCodes(String str, int i) {
    }

    static {
        LocationStatusCodes[] locationStatusCodesArrWrite = write();
        read = locationStatusCodesArrWrite;
        getMagicModuleTimeline.IconCompatParcelizer(locationStatusCodesArrWrite);
    }

    private static final /* synthetic */ LocationStatusCodes[] write() {
        return new LocationStatusCodes[]{AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer};
    }

    public static LocationStatusCodes valueOf(String str) {
        return (LocationStatusCodes) Enum.valueOf(LocationStatusCodes.class, str);
    }

    public static LocationStatusCodes[] values() {
        return (LocationStatusCodes[]) read.clone();
    }
}
