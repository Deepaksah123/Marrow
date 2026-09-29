package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lo/getSelectionEligibility;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "write", "read", "AudioAttributesImplBaseParcelizer", "RemoteActionCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getSelectionEligibility {
    private static final /* synthetic */ getSelectionEligibility[] MediaBrowserCompatItemReceiver;
    public static final getSelectionEligibility AudioAttributesCompatParcelizer = new getSelectionEligibility("RESTART_COMPULSORY", 0);
    public static final getSelectionEligibility IconCompatParcelizer = new getSelectionEligibility("RESTART_MIGHT_REQUIRED", 1);
    public static final getSelectionEligibility AudioAttributesImplApi26Parcelizer = new getSelectionEligibility("RESTART_NOT_REQUIRED", 2);
    public static final getSelectionEligibility write = new getSelectionEligibility("DRM_PROVISION_XIAOMI_PAD6", 3);
    public static final getSelectionEligibility read = new getSelectionEligibility("DRM_PROVISION_GENERAL", 4);
    public static final getSelectionEligibility AudioAttributesImplBaseParcelizer = new getSelectionEligibility("SSL_GENERAL", 5);
    public static final getSelectionEligibility RemoteActionCompatParcelizer = new getSelectionEligibility("PLAYER_TIMEOUT_GENERAL", 6);
    public static final getSelectionEligibility MediaBrowserCompatCustomActionResultReceiver = new getSelectionEligibility("SURFACE_TIMEOUT", 7);

    private getSelectionEligibility(String str, int i) {
    }

    static {
        getSelectionEligibility[] getselectioneligibilityArr = read();
        MediaBrowserCompatItemReceiver = getselectioneligibilityArr;
        getMagicModuleTimeline.IconCompatParcelizer(getselectioneligibilityArr);
    }

    private static final /* synthetic */ getSelectionEligibility[] read() {
        return new getSelectionEligibility[]{AudioAttributesCompatParcelizer, IconCompatParcelizer, AudioAttributesImplApi26Parcelizer, write, read, AudioAttributesImplBaseParcelizer, RemoteActionCompatParcelizer, MediaBrowserCompatCustomActionResultReceiver};
    }

    public static getSelectionEligibility valueOf(String str) {
        return (getSelectionEligibility) Enum.valueOf(getSelectionEligibility.class, str);
    }

    public static getSelectionEligibility[] values() {
        return (getSelectionEligibility[]) MediaBrowserCompatItemReceiver.clone();
    }
}
