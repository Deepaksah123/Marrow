package kotlin;

import com.marrow.data.models.plan.Plan;
import com.marrow.data.models.plan.PlanGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class SubtitleDecoderFactory {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int IconCompatParcelizer(PlanGroup[] planGroupArr, String str) {
        Plan plan;
        if (planGroupArr == null) {
            return -1;
        }
        int length = planGroupArr.length;
        for (int i = 0; i < length; i++) {
            Plan[] plans = planGroupArr[i].getPlans();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(plans, "");
            Plan[] planArr = plans;
            int length2 = planArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    plan = null;
                    break;
                }
                plan = planArr[i2];
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) plan.getGroupId(), (Object) str)) {
                    break;
                }
                i2++;
            }
            if (plan != null) {
                return i;
            }
        }
        return -1;
    }
}
