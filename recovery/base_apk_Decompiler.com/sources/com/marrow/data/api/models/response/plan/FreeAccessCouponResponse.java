package com.marrow.data.api.models.response.plan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/marrow/data/api/models/response/plan/FreeAccessCouponResponse;", "", "<init>", "()V", "", "isApplied", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setApplied", "(Ljava/lang/Boolean;)V", "", "subscriptionPeriod", "Ljava/lang/Integer;", "getSubscriptionPeriod", "()Ljava/lang/Integer;", "setSubscriptionPeriod", "(Ljava/lang/Integer;)V", "", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreeAccessCouponResponse {

    @JsonProperty("is_subscribed")
    private Boolean isApplied;

    @JsonProperty("message")
    private final String message;

    @JsonProperty("subscription_period")
    private Integer subscriptionPeriod;

    /* JADX INFO: renamed from: isApplied, reason: from getter */
    public final Boolean getIsApplied() {
        return this.isApplied;
    }

    public final void setApplied(Boolean bool) {
        this.isApplied = bool;
    }

    public final Integer getSubscriptionPeriod() {
        return this.subscriptionPeriod;
    }

    public final void setSubscriptionPeriod(Integer num) {
        this.subscriptionPeriod = num;
    }

    public final String getMessage() {
        return this.message;
    }
}
