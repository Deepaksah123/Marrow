package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getPlanGroupSorted {
    public static final PlanAddOnsCompanion read(List<? extends PlanAddOnsCompanion> list) {
        getHref gethrefAudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.write(list, "");
        int size = list.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types".toString());
        }
        if (size == 1) {
            return (PlanAddOnsCompanion) IntermediateLoginResponseBody.onCommand((List) list);
        }
        List<? extends PlanAddOnsCompanion> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        boolean z = false;
        boolean z2 = false;
        for (PlanAddOnsCompanion planAddOnsCompanion : list2) {
            z = z || Copy.write(planAddOnsCompanion);
            if (planAddOnsCompanion instanceof getHref) {
                gethrefAudioAttributesImplBaseParcelizer = (getHref) planAddOnsCompanion;
            } else if (planAddOnsCompanion instanceof getTopicId) {
                if (getKeySubjectIds.AudioAttributesCompatParcelizer(planAddOnsCompanion)) {
                    return planAddOnsCompanion;
                }
                gethrefAudioAttributesImplBaseParcelizer = ((getTopicId) planAddOnsCompanion).AudioAttributesImplBaseParcelizer();
                z2 = true;
            } else {
                throw new RenewEligibleCreator();
            }
            arrayList.add(gethrefAudioAttributesImplBaseParcelizer);
        }
        ArrayList arrayList2 = arrayList;
        if (z) {
            return SubscriptionType.read(setAccessLevel.INTERSECTION_OF_ERROR_TYPES, list.toString());
        }
        if (!z2) {
            return getAddOnPlans.IconCompatParcelizer.read(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList3.add(PearlSubjectInfo.RemoteActionCompatParcelizer((PlanAddOnsCompanion) it.next()));
        }
        return AddOnMetaKt.AudioAttributesCompatParcelizer(getAddOnPlans.IconCompatParcelizer.read(arrayList2), getAddOnPlans.IconCompatParcelizer.read(arrayList3));
    }
}
