package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/getPackagesHoldingPermissions;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "read", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getPackagesHoldingPermissions {
    private static final /* synthetic */ getPackagesHoldingPermissions[] AudioAttributesCompatParcelizer;
    public static final getPackagesHoldingPermissions RemoteActionCompatParcelizer = new getPackagesHoldingPermissions("STRICT", 0);
    public static final getPackagesHoldingPermissions read = new getPackagesHoldingPermissions("LOG", 1);
    public static final getPackagesHoldingPermissions write = new getPackagesHoldingPermissions("QUIET", 2);

    private getPackagesHoldingPermissions(String str, int i) {
    }

    static {
        getPackagesHoldingPermissions[] getpackagesholdingpermissionsArrIconCompatParcelizer = IconCompatParcelizer();
        AudioAttributesCompatParcelizer = getpackagesholdingpermissionsArrIconCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(getpackagesholdingpermissionsArrIconCompatParcelizer);
    }

    private static final /* synthetic */ getPackagesHoldingPermissions[] IconCompatParcelizer() {
        return new getPackagesHoldingPermissions[]{RemoteActionCompatParcelizer, read, write};
    }

    public static getPackagesHoldingPermissions valueOf(String str) {
        return (getPackagesHoldingPermissions) Enum.valueOf(getPackagesHoldingPermissions.class, str);
    }

    public static getPackagesHoldingPermissions[] values() {
        return (getPackagesHoldingPermissions[]) AudioAttributesCompatParcelizer.clone();
    }
}
