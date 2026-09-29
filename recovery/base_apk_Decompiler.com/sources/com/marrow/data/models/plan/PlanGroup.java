package com.marrow.data.models.plan;

import com.marrow.data.api.models.response.plan.Coupon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import kotlin.notifyManifestPublishTimeExpired;
import kotlin.parseDolbyChannelConfiguration;
import kotlin.parseLastSegmentNumberSupplementalProperty;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class PlanGroup implements notifyManifestPublishTimeExpired {
    private static final String KEY_GROUP_ID = "group_id";
    private static final String KEY_PLANS = "plans";
    private String mGroupId;
    private ArrayList<Plan> mPlanList;

    public PlanGroup() {
    }

    private PlanGroup(String str) {
        this.mGroupId = str;
    }

    public Plan[] getPlans() {
        ArrayList<Plan> arrayList = this.mPlanList;
        if (arrayList == null) {
            return null;
        }
        return (Plan[]) arrayList.toArray(new Plan[arrayList.size()]);
    }

    public Plan getPlan(int i) {
        return this.mPlanList.get(i);
    }

    public void setPlans(Plan[] planArr) {
        ArrayList<Plan> arrayList = this.mPlanList;
        if (arrayList == null) {
            this.mPlanList = new ArrayList<>();
        } else {
            arrayList.clear();
        }
        for (Plan plan : planArr) {
            this.mPlanList.add(plan);
        }
    }

    public void addPlan(Plan plan) {
        if (this.mPlanList == null) {
            this.mPlanList = new ArrayList<>();
        }
        this.mPlanList.add(plan);
    }

    public Plan getCheapestPlan(Coupon coupon) {
        ArrayList<Plan> arrayList = this.mPlanList;
        Plan plan = null;
        if (arrayList == null) {
            return null;
        }
        for (Plan plan2 : arrayList) {
            if (plan2 != null && (plan == null || plan2.getDiscountedPrice(coupon) < plan.getDiscountedPrice(coupon))) {
                plan = plan2;
            }
        }
        return plan;
    }

    public Plan getDefaultPlan(Coupon coupon) {
        ArrayList<Plan> arrayList = this.mPlanList;
        if (arrayList == null) {
            return null;
        }
        for (Plan plan : arrayList) {
            if (plan.isDefault()) {
                return plan;
            }
        }
        return getCheapestPlan(coupon);
    }

    public Plan getFirstEligiblePlan(Coupon coupon, Coupon coupon2) {
        ArrayList<Plan> arrayList = this.mPlanList;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        for (Plan plan : this.mPlanList) {
            double price = plan.getPrice();
            if (price != price - (plan.getDiscount(coupon) + plan.getDiscount(coupon2))) {
                return plan;
            }
        }
        return this.mPlanList.get(0);
    }

    public String getGroupId() {
        return this.mGroupId;
    }

    public boolean equals(Object obj) {
        if (obj instanceof PlanGroup) {
            return parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(this.mGroupId, ((PlanGroup) obj).getGroupId());
        }
        return false;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(KEY_GROUP_ID, this.mGroupId);
            jSONObject.put(KEY_PLANS, Plan.toJSON(getPlans()));
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    @Override // kotlin.notifyManifestPublishTimeExpired
    public void fromJSON(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.mGroupId = jSONObject.optString(KEY_GROUP_ID);
        setPlans(Plan.fromJSON(jSONObject.optJSONArray(KEY_PLANS)));
    }

    public void fromJSON(String str) {
        fromJSON(parseLastSegmentNumberSupplementalProperty.AudioAttributesCompatParcelizer(str));
    }

    public static PlanGroup[] getPlanGroupSorted(Plan[] planArr, Coupon coupon) {
        if (planArr == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < planArr.length; i++) {
            String groupId = planArr[i].getGroupId();
            if (map.containsKey(groupId)) {
                ((PlanGroup) map.get(groupId)).addPlan(planArr[i]);
            } else {
                PlanGroup planGroup = new PlanGroup(groupId);
                planGroup.addPlan(planArr[i]);
                map.put(groupId, planGroup);
            }
        }
        int size = map.size();
        String[] strArr = (String[]) map.keySet().toArray(new String[size]);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add((PlanGroup) map.get(strArr[i2]));
        }
        Collections.sort(arrayList, new PlanGroup$$ExternalSyntheticLambda0(coupon));
        return (PlanGroup[]) arrayList.toArray(new PlanGroup[size]);
    }

    static /* synthetic */ int lambda$getPlanGroupSorted$0(Coupon coupon, PlanGroup planGroup, PlanGroup planGroup2) {
        Plan cheapestPlan = planGroup.getCheapestPlan(coupon);
        Plan cheapestPlan2 = planGroup2.getCheapestPlan(coupon);
        int iCompare = Boolean.compare(cheapestPlan2.isProPlan(), cheapestPlan.isProPlan());
        return (iCompare == 0 && (iCompare = Integer.compare(cheapestPlan2.getSubscriptionDetails().length, cheapestPlan.getSubscriptionDetails().length)) == 0) ? Double.compare(cheapestPlan2.getPrice(), cheapestPlan.getPrice()) : iCompare;
    }

    public int size() {
        ArrayList<Plan> arrayList = this.mPlanList;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }
}
