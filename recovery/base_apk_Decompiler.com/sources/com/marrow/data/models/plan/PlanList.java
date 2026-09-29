package com.marrow.data.models.plan;

import com.marrow.data.api.models.response.plan.Coupon;
import kotlin.notifyManifestPublishTimeExpired;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class PlanList implements notifyManifestPublishTimeExpired {
    private Coupon mDefaultCoupon;
    private PlanGroup[] mPlanGroups;

    @Override // kotlin.notifyManifestPublishTimeExpired
    public void fromJSON(JSONObject jSONObject) {
    }

    public PlanList(Plan[] planArr) {
        this(planArr, null);
    }

    public PlanList(Plan[] planArr, Coupon coupon) {
        this.mPlanGroups = PlanGroup.getPlanGroupSorted(planArr, coupon);
        this.mDefaultCoupon = coupon;
    }

    public PlanGroup[] getPlanGroups() {
        return this.mPlanGroups;
    }

    public Coupon getDefaultCoupon() {
        return this.mDefaultCoupon;
    }
}
