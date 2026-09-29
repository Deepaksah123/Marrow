package kotlin;

import com.marrow.data.models.video.VideoPlaybackConfiguration;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\bj\u0002\b\u000e"}, d2 = {"Lo/SmsRetrieverStatusCodes;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "AudioAttributesImplBaseParcelizer", "Ljava/lang/String;", "write", "()Ljava/lang/String;", "IconCompatParcelizer", "MediaBrowserCompatItemReceiver", "read", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SmsRetrieverStatusCodes {
    private static final /* synthetic */ SmsRetrieverStatusCodes[] AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final String write;
    public static final SmsRetrieverStatusCodes IconCompatParcelizer = new SmsRetrieverStatusCodes("UPGRADE_PLAN_DIALOG", 0, "UpgradePlanDialogRequestKey");
    public static final SmsRetrieverStatusCodes MediaBrowserCompatItemReceiver = new SmsRetrieverStatusCodes("VERSION_CONFIRMATION_DIALOG", 1, "VersionConfirmationDialogKey");
    public static final SmsRetrieverStatusCodes read = new SmsRetrieverStatusCodes("LOGOUT_SELECTION_DIALOG", 2, "LogoutSelectionDialog");
    public static final SmsRetrieverStatusCodes RemoteActionCompatParcelizer = new SmsRetrieverStatusCodes("PURCHASE_PRO_PLAN_DIALOG", 3, "purchase_pro_plan");
    public static final SmsRetrieverStatusCodes write = new SmsRetrieverStatusCodes("SHOW_PLAYSTORE_INSTALLATION_DIALOG", 4, "show_playstore_installation_dialog");
    public static final SmsRetrieverStatusCodes AudioAttributesCompatParcelizer = new SmsRetrieverStatusCodes(VideoPlaybackConfiguration.WIDEVINE_LVL_DEFAULT, 5, "confirmation_dialog_key");

    private SmsRetrieverStatusCodes(String str, int i, String str2) {
        this.write = str2;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    static {
        SmsRetrieverStatusCodes[] smsRetrieverStatusCodesArr = read();
        AudioAttributesImplApi26Parcelizer = smsRetrieverStatusCodesArr;
        getMagicModuleTimeline.IconCompatParcelizer(smsRetrieverStatusCodesArr);
    }

    private static final /* synthetic */ SmsRetrieverStatusCodes[] read() {
        return new SmsRetrieverStatusCodes[]{IconCompatParcelizer, MediaBrowserCompatItemReceiver, read, RemoteActionCompatParcelizer, write, AudioAttributesCompatParcelizer};
    }

    public static SmsRetrieverStatusCodes valueOf(String str) {
        return (SmsRetrieverStatusCodes) Enum.valueOf(SmsRetrieverStatusCodes.class, str);
    }

    public static SmsRetrieverStatusCodes[] values() {
        return (SmsRetrieverStatusCodes[]) AudioAttributesImplApi26Parcelizer.clone();
    }
}
