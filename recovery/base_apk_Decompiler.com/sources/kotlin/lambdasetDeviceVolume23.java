package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\bj\u0002\b\u000fj\u0002\b\nj\u0002\b\u0010"}, d2 = {"Lo/lambdasetDeviceVolume23;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "AudioAttributesImplBaseParcelizer", "Ljava/lang/String;", "IconCompatParcelizer", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "read", "MediaBrowserCompatItemReceiver", "write", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class lambdasetDeviceVolume23 {
    private static final /* synthetic */ lambdasetDeviceVolume23[] AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;
    public static final lambdasetDeviceVolume23 RemoteActionCompatParcelizer = new lambdasetDeviceVolume23("EVENTS", 0, "events");
    public static final lambdasetDeviceVolume23 read = new lambdasetDeviceVolume23("PROFILE_EVENTS", 1, "profileEvents");
    public static final lambdasetDeviceVolume23 MediaBrowserCompatItemReceiver = new lambdasetDeviceVolume23("USER_PROFILES", 2, "userProfiles");
    public static final lambdasetDeviceVolume23 write = new lambdasetDeviceVolume23("INBOX_MESSAGES", 3, "inboxMessages");
    public static final lambdasetDeviceVolume23 IconCompatParcelizer = new lambdasetDeviceVolume23("PUSH_NOTIFICATIONS", 4, "pushNotifications");
    public static final lambdasetDeviceVolume23 AudioAttributesImplApi21Parcelizer = new lambdasetDeviceVolume23("UNINSTALL_TS", 5, "uninstallTimestamp");
    public static final lambdasetDeviceVolume23 AudioAttributesCompatParcelizer = new lambdasetDeviceVolume23("PUSH_NOTIFICATION_VIEWED", 6, "notificationViewed");
    public static final lambdasetDeviceVolume23 MediaBrowserCompatCustomActionResultReceiver = new lambdasetDeviceVolume23("USER_EVENT_LOGS_TABLE", 7, "userEventLogs");

    private lambdasetDeviceVolume23(String str, int i, String str2) {
        this.AudioAttributesCompatParcelizer = str2;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    static {
        lambdasetDeviceVolume23[] lambdasetdevicevolume23ArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        AudioAttributesImplApi26Parcelizer = lambdasetdevicevolume23ArrRemoteActionCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(lambdasetdevicevolume23ArrRemoteActionCompatParcelizer);
    }

    public static lambdasetDeviceVolume23 valueOf(String str) {
        return (lambdasetDeviceVolume23) Enum.valueOf(lambdasetDeviceVolume23.class, str);
    }

    public static lambdasetDeviceVolume23[] values() {
        return (lambdasetDeviceVolume23[]) AudioAttributesImplApi26Parcelizer.clone();
    }

    private static final /* synthetic */ lambdasetDeviceVolume23[] RemoteActionCompatParcelizer() {
        return new lambdasetDeviceVolume23[]{RemoteActionCompatParcelizer, read, MediaBrowserCompatItemReceiver, write, IconCompatParcelizer, AudioAttributesImplApi21Parcelizer, AudioAttributesCompatParcelizer, MediaBrowserCompatCustomActionResultReceiver};
    }
}
