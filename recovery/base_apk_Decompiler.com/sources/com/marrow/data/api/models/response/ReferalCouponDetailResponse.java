package com.marrow.data.api.models.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReferalCouponDetailResponse implements Serializable {

    @JsonProperty("benefit_details")
    public BenefitDetails[] benefitDetails;

    @JsonProperty("end_time")
    public long codeEndTime;

    @JsonProperty("user_id")
    public String currentUserId;

    @JsonProperty("is_active")
    public boolean isCodeActive;

    @JsonProperty("me_rfc_applied_count")
    public int numberOfReferalCouponsUsedByCurrentUser;

    @JsonProperty("my_rfc_applied_count")
    public int numberOfTimesCurrentUserReferalUsed;

    @JsonProperty("REFERRAL_BENEFIT_LIMIT")
    public int referalBenefitLimit;

    @JsonProperty("_id")
    public String referalCode;

    @JsonProperty("REFERRAL_EXTENSION_DAYS_LIMIT")
    public int referalExtensionDaysLimit;

    @JsonProperty("total_redeem_count")
    public int totalRedeemCount;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class BenefitDetails implements Serializable {

        @JsonProperty("rf_coupon")
        public String couponCode;

        @JsonProperty("extension_days")
        public int numberOfExtensionDays;

        @JsonProperty("user_details")
        public UserDetail userDetail;

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class UserDetail {

            @JsonProperty("fname")
            public String firstName;

            @JsonProperty("lname")
            public String lastName;

            @JsonProperty("_id")
            public String userId;
        }
    }

    public boolean isValid() {
        return this.isCodeActive && System.currentTimeMillis() < this.codeEndTime;
    }
}
