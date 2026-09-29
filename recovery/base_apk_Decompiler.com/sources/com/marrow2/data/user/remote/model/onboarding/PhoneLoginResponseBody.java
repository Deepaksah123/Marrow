package com.marrow2.data.user.remote.model.onboarding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\r\u0010\u0007R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/marrow2/data/user/remote/model/onboarding/PhoneLoginResponseBody;", "Ljava/io/Serializable;", "<init>", "()V", "", "is_sent", "Z", "()Z", "", "msg", "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "isWhatsappOtpAllowed", "", "displayWhatsappCountdown", "Ljava/lang/Long;", "getDisplayWhatsappCountdown", "()Ljava/lang/Long;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PhoneLoginResponseBody implements Serializable {
    public static final int $stable = 0;

    @JsonProperty("display_whatsapp_countdown")
    private final Long displayWhatsappCountdown;

    @JsonProperty("is_whatsapp_otp_allowed")
    private final boolean isWhatsappOtpAllowed;

    @JsonProperty("is_sent")
    private final boolean is_sent;

    @JsonProperty("msg")
    private final String msg = "";

    /* JADX INFO: renamed from: is_sent, reason: from getter */
    public final boolean getIs_sent() {
        return this.is_sent;
    }

    public final String getMsg() {
        return this.msg;
    }

    /* JADX INFO: renamed from: isWhatsappOtpAllowed, reason: from getter */
    public final boolean getIsWhatsappOtpAllowed() {
        return this.isWhatsappOtpAllowed;
    }

    public final Long getDisplayWhatsappCountdown() {
        return this.displayWhatsappCountdown;
    }
}
