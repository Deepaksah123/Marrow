package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class readUtf8EncodedLong {
    public static final List<readUnsignedIntToInt> AudioAttributesCompatParcelizer(List<LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        List<LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(RemoteActionCompatParcelizer((LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0) it.next()));
        }
        return arrayList;
    }

    private static final readUnsignedIntToInt RemoteActionCompatParcelizer(LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0 leastRecentlyUsedCacheEvictorExternalSyntheticLambda0) {
        return new readUnsignedIntToInt(leastRecentlyUsedCacheEvictorExternalSyntheticLambda0.getReferralBenefitLimit(), leastRecentlyUsedCacheEvictorExternalSyntheticLambda0.getReferralExtensionDaysLimit(), leastRecentlyUsedCacheEvictorExternalSyntheticLambda0.getReferralCode(), leastRecentlyUsedCacheEvictorExternalSyntheticLambda0.getIsCodeActive(), leastRecentlyUsedCacheEvictorExternalSyntheticLambda0.getCodeEndTime(), leastRecentlyUsedCacheEvictorExternalSyntheticLambda0.getNumberOfReferralCouponsUsedByCurrentUser(), leastRecentlyUsedCacheEvictorExternalSyntheticLambda0.getNumberOfTimesCurrentUserReferralUsed(), leastRecentlyUsedCacheEvictorExternalSyntheticLambda0.getTotalRedeemCount(), leastRecentlyUsedCacheEvictorExternalSyntheticLambda0.getCurrentUserId(), leastRecentlyUsedCacheEvictorExternalSyntheticLambda0.IconCompatParcelizer());
    }
}
