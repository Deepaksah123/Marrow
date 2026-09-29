package com.marrow.data.models.plan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.response.plan.Coupon;
import java.util.ArrayList;
import kotlin.isDvbProfileDeclared;
import kotlin.notifyManifestPublishTimeExpired;
import kotlin.parseDolbyChannelConfiguration;
import kotlin.parseLastSegmentNumberSupplementalProperty;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Plan implements notifyManifestPublishTimeExpired {
    private static final String KEY_COURSE_ID = "course_id";
    private static final String KEY_DESCRIPTION = "description";
    private static final String KEY_DESCRIPTION_LIST = "group_description_list";
    private static final String KEY_DURATION_TITLE = "duration_title";
    private static final String KEY_GROUP_DESCRIPTION = "group_description";
    private static final String KEY_GROUP_ID = "group_id";
    private static final String KEY_GROUP_SUBTTILE = "group_sub_title";
    private static final String KEY_ID = "_id";
    private static final String KEY_IS_DEFAULT = "is_default";
    private static final String KEY_MIN_PRICE = "min_price";
    private static final String KEY_PLAN_ADDONS = "plan_addons";
    private static final String KEY_PLAN_TYPE = "plan_type";
    private static final String KEY_PRICE = "price";
    private static final String KEY_SUBSCRIPTION_DETAIL = "subscription_detail";
    private static final String KEY_SUBSCRIPTION_PERIOD = "subscription_period";
    private static final String KEY_TITLE = "group_title";

    @JsonProperty(KEY_DESCRIPTION_LIST)
    private String[] descriptionList;

    @JsonProperty(KEY_GROUP_DESCRIPTION)
    private ArrayList<PlanGroupDescriptionModel> groupDescription;

    @JsonProperty(KEY_GROUP_SUBTTILE)
    private String groupSubttile;

    @JsonProperty("is_default")
    private boolean isDefault;

    @JsonProperty("course_id")
    private String mCourseId;

    @JsonProperty("description")
    private String mDescription;

    @JsonProperty(KEY_DURATION_TITLE)
    private String mDurationTitle;

    @JsonProperty(KEY_GROUP_ID)
    private String mGroupId;

    @JsonProperty("_id")
    private String mId;

    @JsonProperty(KEY_MIN_PRICE)
    private double mMinPrice;

    @JsonProperty(KEY_PLAN_TYPE)
    private int mPlanType;

    @JsonProperty("price")
    private double mPrice;

    @JsonProperty(KEY_SUBSCRIPTION_PERIOD)
    private int mSubscriptionPeriod;

    @JsonProperty(KEY_SUBSCRIPTION_DETAIL)
    private SubscriptionType[] mSubscriptionTypes;

    @JsonProperty(KEY_TITLE)
    private String mTitle;

    @JsonProperty(KEY_PLAN_ADDONS)
    private ArrayList<PlanAddOns> planAddOns;

    public String getId() {
        return this.mId;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public String getCourseId() {
        return this.mCourseId;
    }

    public void setCourseId(String str) {
        this.mCourseId = str;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public String[] getDescriptionList() {
        return this.descriptionList;
    }

    public void setDesriptionList(String[] strArr) {
        this.descriptionList = strArr;
    }

    public ArrayList<PlanGroupDescriptionModel> getGroupDescription() {
        return this.groupDescription;
    }

    public void setGroupDescription(ArrayList<PlanGroupDescriptionModel> arrayList) {
        this.groupDescription = arrayList;
    }

    public String getGroupSubttile() {
        return this.groupSubttile;
    }

    public void setGroupSubttile(String str) {
        this.groupSubttile = str;
    }

    public String getGroupId() {
        return this.mGroupId;
    }

    public void setGroupId(String str) {
        this.mGroupId = str;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public double getMinPrice() {
        return this.mMinPrice;
    }

    public void setMinPrice(double d) {
        this.mMinPrice = d;
    }

    public double getPrice() {
        return this.mPrice;
    }

    public void setPrice(double d) {
        this.mPrice = d;
    }

    public int getPlanType() {
        return this.mPlanType;
    }

    public void setPlanType(int i) {
        this.mPlanType = i;
    }

    public int getSubscriptionPeriod() {
        return this.mSubscriptionPeriod;
    }

    public void setSubscriptionPeriod(int i) {
        this.mSubscriptionPeriod = i;
    }

    public SubscriptionType[] getSubscriptionDetails() {
        return this.mSubscriptionTypes;
    }

    public boolean isDefault() {
        return this.isDefault;
    }

    public void setDefault(boolean z) {
        this.isDefault = z;
    }

    public double getDiscountedPrice(Coupon coupon) {
        if (coupon == null) {
            return this.mPrice;
        }
        return Math.max(this.mMinPrice, this.mPrice - coupon.getDiscount(this.mId));
    }

    public double getDiscount(Coupon coupon) {
        if (coupon == null) {
            return 0.0d;
        }
        return coupon.getDiscount(this.mId);
    }

    public ArrayList<PlanAddOns> getPlanAddOns() {
        return this.planAddOns;
    }

    public void setPlanAddOns(ArrayList<PlanAddOns> arrayList) {
        this.planAddOns = arrayList;
    }

    @Override // kotlin.notifyManifestPublishTimeExpired
    public void fromJSON(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.mId = jSONObject.optString("_id");
        this.mCourseId = jSONObject.optString("course_id");
        this.mTitle = jSONObject.optString(KEY_TITLE);
        this.mGroupId = jSONObject.optString(KEY_GROUP_ID);
        this.mDescription = jSONObject.optString("description");
        this.mMinPrice = jSONObject.optDouble(KEY_MIN_PRICE);
        this.mPrice = jSONObject.optDouble("price");
        this.mPlanType = jSONObject.optInt(KEY_PLAN_TYPE);
        this.mSubscriptionPeriod = jSONObject.optInt(KEY_SUBSCRIPTION_PERIOD);
        this.mDurationTitle = jSONObject.optString(KEY_DURATION_TITLE);
        this.isDefault = jSONObject.optBoolean("is_default");
        this.descriptionList = parseLastSegmentNumberSupplementalProperty.RemoteActionCompatParcelizer(jSONObject.optString(KEY_DESCRIPTION_LIST));
        this.groupSubttile = jSONObject.optString(KEY_GROUP_SUBTTILE);
        this.mSubscriptionTypes = SubscriptionType.fromJSON(jSONObject.optJSONArray(KEY_SUBSCRIPTION_DETAIL));
        this.groupDescription = PlanGroupDescriptionModel.fromJSON(jSONObject.optJSONArray(KEY_GROUP_DESCRIPTION));
        this.planAddOns = PlanAddOns.fromJSON(jSONObject.optJSONArray(KEY_PLAN_ADDONS));
    }

    public void fromJSON(String str) {
        fromJSON(parseLastSegmentNumberSupplementalProperty.AudioAttributesCompatParcelizer(str));
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        isDvbProfileDeclared.write(jSONObject, "_id", this.mId);
        isDvbProfileDeclared.write(jSONObject, "course_id", this.mCourseId);
        isDvbProfileDeclared.write(jSONObject, KEY_TITLE, this.mTitle);
        isDvbProfileDeclared.write(jSONObject, KEY_GROUP_ID, this.mGroupId);
        isDvbProfileDeclared.write(jSONObject, "description", this.mDescription);
        isDvbProfileDeclared.read(jSONObject, KEY_MIN_PRICE, Double.valueOf(this.mMinPrice));
        isDvbProfileDeclared.read(jSONObject, "price", Double.valueOf(this.mPrice));
        isDvbProfileDeclared.read(jSONObject, KEY_PLAN_TYPE, Integer.valueOf(this.mPlanType));
        isDvbProfileDeclared.read(jSONObject, KEY_SUBSCRIPTION_PERIOD, Integer.valueOf(this.mSubscriptionPeriod));
        isDvbProfileDeclared.write(jSONObject, KEY_DURATION_TITLE, this.mDurationTitle);
        isDvbProfileDeclared.AudioAttributesCompatParcelizer(jSONObject, "is_default", Boolean.valueOf(this.isDefault));
        isDvbProfileDeclared.write(jSONObject, KEY_DESCRIPTION_LIST, parseLastSegmentNumberSupplementalProperty.read(this.descriptionList));
        isDvbProfileDeclared.write(jSONObject, KEY_GROUP_SUBTTILE, this.groupSubttile);
        isDvbProfileDeclared.write(jSONObject, KEY_SUBSCRIPTION_DETAIL, SubscriptionType.toJSON(this.mSubscriptionTypes));
        isDvbProfileDeclared.write(jSONObject, KEY_GROUP_DESCRIPTION, PlanGroupDescriptionModel.toJSON(this.groupDescription));
        isDvbProfileDeclared.write(jSONObject, KEY_PLAN_ADDONS, PlanAddOns.toJSON(this.planAddOns));
        return jSONObject;
    }

    public boolean isComboPlan() {
        return hasSubscriptions() && this.mSubscriptionTypes.length > 1;
    }

    public boolean isProPlan() {
        boolean z;
        SubscriptionType[] subscriptionTypeArr = this.mSubscriptionTypes;
        int length = subscriptionTypeArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            if (subscriptionTypeArr[i].isTest()) {
                z = true;
                break;
            }
            i++;
        }
        return hasSubscriptions() && z;
    }

    public boolean isIndividualPlan() {
        return hasSubscriptions() && this.mSubscriptionTypes.length == 1;
    }

    public SubscriptionType getIndividualPlan() {
        if (isIndividualPlan()) {
            return this.mSubscriptionTypes[0];
        }
        return null;
    }

    private boolean hasSubscriptions() {
        SubscriptionType[] subscriptionTypeArr = this.mSubscriptionTypes;
        return subscriptionTypeArr != null && subscriptionTypeArr.length > 0;
    }

    public static JSONArray toJSON(Plan[] planArr) {
        JSONArray jSONArray = new JSONArray();
        if (planArr != null) {
            for (Plan plan : planArr) {
                jSONArray.put(plan.toJSON());
            }
        }
        return jSONArray;
    }

    public static Plan[] fromJSON(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        Plan[] planArr = new Plan[length];
        for (int i = 0; i < length; i++) {
            Plan plan = new Plan();
            planArr[i] = plan;
            plan.fromJSON(jSONArray.optJSONObject(i));
        }
        return planArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("id: ");
        sb.append(this.mId);
        sb.append(", course id:  ");
        sb.append(this.mCourseId);
        sb.append(", desc: ");
        sb.append(this.mDescription);
        sb.append(", group id: ");
        sb.append(this.mGroupId);
        sb.append(", title: ");
        sb.append(this.mTitle);
        return sb.toString();
    }

    public String getDurationTitle() {
        return this.mDurationTitle;
    }

    public boolean isVideoPlanCtype() {
        for (SubscriptionType subscriptionType : getSubscriptionDetails()) {
            if ("video".equalsIgnoreCase(subscriptionType.getContentType())) {
                return true;
            }
        }
        return false;
    }

    public boolean isPlanContainsAnyVideo() {
        for (SubscriptionType subscriptionType : getSubscriptionDetails()) {
            if ("video".equalsIgnoreCase(subscriptionType.getContentType()) || "video_subj".equalsIgnoreCase(subscriptionType.getContentType())) {
                return true;
            }
        }
        return false;
    }

    public String getPlanDuration() {
        String str = parseDolbyChannelConfiguration.read(getSubscriptionPeriod());
        String durationTitle = getDurationTitle();
        return parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) durationTitle) ? str : durationTitle;
    }
}
