package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B-\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\f\u0010\u0013j\u0002\b\u0011j\u0002\b\u000e"}, d2 = {"Lo/SntpClientNtpTimeLoadable;", "", "", "p0", "", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Z)V", "read", "Z", "write", "Ljava/lang/String;", "IconCompatParcelizer", "()Ljava/lang/String;", "AudioAttributesImplApi21Parcelizer", "RemoteActionCompatParcelizer", "MediaBrowserCompatItemReceiver", "()Z", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SntpClientNtpTimeLoadable {
    private static final /* synthetic */ SntpClientNtpTimeLoadable[] AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public boolean write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String IconCompatParcelizer;
    private static SntpClientNtpTimeLoadable RemoteActionCompatParcelizer = new SntpClientNtpTimeLoadable("WEB_INTERNAL", 0, false, "miscellaneous", "M15", false, 8, null);
    private static SntpClientNtpTimeLoadable IconCompatParcelizer = new SntpClientNtpTimeLoadable("HOME_ACTIVITY", 1, false, "home_activity", "M20", false);

    private SntpClientNtpTimeLoadable(String str, int i, boolean z, String str2, String str3, boolean z2) {
        this.write = z;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.AudioAttributesCompatParcelizer = z2;
    }

    /* synthetic */ SntpClientNtpTimeLoadable(String str, int i, boolean z, String str2, String str3, boolean z2, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, i, (i2 & 1) != 0 ? false : z, str2, str3, (i2 & 8) != 0 ? true : z2);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    static {
        SntpClientNtpTimeLoadable[] sntpClientNtpTimeLoadableArr = read();
        AudioAttributesCompatParcelizer = sntpClientNtpTimeLoadableArr;
        getMagicModuleTimeline.IconCompatParcelizer(sntpClientNtpTimeLoadableArr);
    }

    private static final /* synthetic */ SntpClientNtpTimeLoadable[] read() {
        return new SntpClientNtpTimeLoadable[]{RemoteActionCompatParcelizer, IconCompatParcelizer};
    }

    public static SntpClientNtpTimeLoadable valueOf(String str) {
        return (SntpClientNtpTimeLoadable) Enum.valueOf(SntpClientNtpTimeLoadable.class, str);
    }

    public static SntpClientNtpTimeLoadable[] values() {
        return (SntpClientNtpTimeLoadable[]) AudioAttributesCompatParcelizer.clone();
    }
}
