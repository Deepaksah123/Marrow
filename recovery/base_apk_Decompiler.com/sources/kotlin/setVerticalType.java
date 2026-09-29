package kotlin;

import com.marrow.data.api.models.response.plan.Coupon;
import com.marrow.data.models.plan.Plan;
import com.marrow.data.models.plan.PlanAddOns;
import com.marrow.data.models.plan.PlanGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setVerticalType {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Plan RemoteActionCompatParcelizer(PlanGroup planGroup, Plan plan, Coupon coupon, Coupon coupon2) {
        Plan plan2;
        Plan[] plans = planGroup.getPlans();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(plans, "");
        Plan[] planArr = plans;
        int length = planArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                plan2 = null;
                break;
            }
            plan2 = planArr[i];
            Plan plan3 = plan2;
            if (plan3.getSubscriptionPeriod() > plan.getSubscriptionPeriod()) {
                toMagicModuleMetaRepoModel.write(plan3);
                if (AudioAttributesCompatParcelizer(plan3, coupon, coupon2) > 0.0d) {
                    break;
                }
            }
            i++;
        }
        return plan2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Plan> write(PlanGroup planGroup, Plan plan, Plan plan2) {
        Plan[] plans = planGroup.getPlans();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(plans, "");
        ArrayList arrayList = new ArrayList();
        for (Plan plan3 : plans) {
            Plan plan4 = plan3;
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) plan4.getId(), (Object) plan.getId()) && (plan2 == null || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) plan4.getId(), (Object) plan2.getId()))) {
                arrayList.add(plan3);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IconCompatParcelizer(Coupon coupon) {
        String couponCode;
        return (coupon == null || (couponCode = coupon.getCouponCode()) == null || couponCode.length() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double AudioAttributesCompatParcelizer(Plan plan, Coupon coupon, Coupon coupon2) {
        return plan.getDiscount(coupon) + plan.getDiscount(coupon2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesCompatParcelizer(Coupon coupon) {
        Coupon fallBack;
        return (coupon == null || (fallBack = coupon.getFallBack()) == null || !coupon.isValid() || !fallBack.isValid() || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) coupon.getCouponCode(), (Object) fallBack.getCouponCode())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double RemoteActionCompatParcelizer(Plan plan, Coupon coupon, Coupon coupon2, boolean z) {
        ArrayList<PlanAddOns> planAddOns;
        return (plan.getPrice() - AudioAttributesCompatParcelizer(plan, coupon, coupon2)) + ((!z || (planAddOns = plan.getPlanAddOns()) == null || planAddOns.isEmpty()) ? 0.0d : plan.getPlanAddOns().get(0).getPrice());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<ArrayList<Plan>, ArrayList<Plan>> write(Plan[] planArr, Coupon coupon, Coupon coupon2, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(coupon);
        for (Plan plan : planArr) {
            if (plan != null) {
                if (!z || AudioAttributesCompatParcelizer(plan, coupon, coupon2) > 0.0d || !zAudioAttributesCompatParcelizer) {
                    arrayList.add(plan);
                } else {
                    arrayList2.add(plan);
                }
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String IconCompatParcelizer(double d) {
        return d % 1.0d == 0.0d ? String.valueOf((int) d) : String.valueOf(d);
    }
}
