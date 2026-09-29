package kotlin;

import kotlin.addPlan;
import kotlin.getCheapestPlan;

/* JADX INFO: loaded from: classes4.dex */
public final class PlanAddOnsKt {
    public static /* synthetic */ getPlanType AudioAttributesCompatParcelizer(boolean z, boolean z2, PlanGroup planGroup, addPlan addplan, getCheapestPlan getcheapestplan, int i) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            planGroup = getPlanGroups.RemoteActionCompatParcelizer;
        }
        if ((i & 8) != 0) {
            addplan = addPlan.write.write;
        }
        if ((i & 16) != 0) {
            getcheapestplan = getCheapestPlan.read.write;
        }
        return IconCompatParcelizer(z, z2, planGroup, addplan, getcheapestplan);
    }

    public static final getPlanType IconCompatParcelizer(boolean z, boolean z2, PlanGroup planGroup, addPlan addplan, getCheapestPlan getcheapestplan) {
        toMagicModuleMetaRepoModel.write(planGroup, "");
        toMagicModuleMetaRepoModel.write(addplan, "");
        toMagicModuleMetaRepoModel.write(getcheapestplan, "");
        return new getPlanType(z, z2, planGroup, addplan, getcheapestplan);
    }
}
