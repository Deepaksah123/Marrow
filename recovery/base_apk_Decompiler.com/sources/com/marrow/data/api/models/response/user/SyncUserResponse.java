package com.marrow.data.api.models.response.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.data.models.common.FeaturedCard;
import com.marrow.data.models.plan.Subscription;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SyncUserResponse extends LoggedUserResponse {

    @JsonProperty(CourseConfigKeyConstantsKt.KEY_FEATURED_CARD)
    public FeaturedCard[] featuredCards;

    @JsonProperty("rf_eligible")
    public boolean isRenewEligible;

    @JsonProperty("notes_purchased_date")
    public Long notesPurchasedDate;

    @JsonProperty("subscription")
    public Subscription[] subscriptions;
}
