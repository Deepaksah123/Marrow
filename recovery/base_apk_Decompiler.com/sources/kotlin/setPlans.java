package kotlin;

import kotlin.getCheapestPlan;

/* JADX INFO: loaded from: classes4.dex */
public interface setPlans extends PlanData {
    public static final RemoteActionCompatParcelizer write = RemoteActionCompatParcelizer.IconCompatParcelizer;

    getCheapestPlan RemoteActionCompatParcelizer();

    getOptions write();

    public static final class RemoteActionCompatParcelizer {
        static final /* synthetic */ RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer();
        private static final PlanGroupExternalSyntheticLambda0 write = new PlanGroupExternalSyntheticLambda0(getCheapestPlan.read.write);

        private RemoteActionCompatParcelizer() {
        }

        public static PlanGroupExternalSyntheticLambda0 write() {
            return write;
        }
    }
}
