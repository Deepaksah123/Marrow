package com.marrow2.data.user.remote.model.onboarding;

import com.marrow.data.models.video.VideoPlaybackConfiguration;
import kotlin.Metadata;
import kotlin.getMagicModuleSavedMcqCount;
import kotlin.getMagicModuleTimeline;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/marrow2/data/user/remote/model/onboarding/OtpRetryType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", VideoPlaybackConfiguration.WIDEVINE_LVL_DEFAULT, "OTP_TYPE_RESEND_TEXT", "OTP_TYPE_CALL"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OtpRetryType {
    private static final /* synthetic */ getMagicModuleSavedMcqCount $ENTRIES;
    private static final /* synthetic */ OtpRetryType[] $VALUES;
    private final String key;
    public static final OtpRetryType DEFAULT = new OtpRetryType(VideoPlaybackConfiguration.WIDEVINE_LVL_DEFAULT, 0, "");
    public static final OtpRetryType OTP_TYPE_RESEND_TEXT = new OtpRetryType("OTP_TYPE_RESEND_TEXT", 1, "text");
    public static final OtpRetryType OTP_TYPE_CALL = new OtpRetryType("OTP_TYPE_CALL", 2, "voice");

    private OtpRetryType(String str, int i, String str2) {
        this.key = str2;
    }

    public final String getKey() {
        return this.key;
    }

    static {
        OtpRetryType[] otpRetryTypeArr$values = $values();
        $VALUES = otpRetryTypeArr$values;
        $ENTRIES = getMagicModuleTimeline.IconCompatParcelizer(otpRetryTypeArr$values);
    }

    private static final /* synthetic */ OtpRetryType[] $values() {
        return new OtpRetryType[]{DEFAULT, OTP_TYPE_RESEND_TEXT, OTP_TYPE_CALL};
    }

    public static getMagicModuleSavedMcqCount<OtpRetryType> getEntries() {
        return $ENTRIES;
    }

    public static OtpRetryType valueOf(String str) {
        return (OtpRetryType) Enum.valueOf(OtpRetryType.class, str);
    }

    public static OtpRetryType[] values() {
        return (OtpRetryType[]) $VALUES.clone();
    }
}
