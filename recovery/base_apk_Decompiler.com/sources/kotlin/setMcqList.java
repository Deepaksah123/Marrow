package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class setMcqList extends getKeyRootSubjectIds {

    public final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[getPearlList.values().length];
            try {
                iArr[getPearlList.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getPearlList.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getPearlList.INFLEXIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            write = iArr;
        }
    }

    @Override // kotlin.getKeyRootSubjectIds
    public final setDefault RemoteActionCompatParcelizer(getBadgeText getbadgetext, PearlMini pearlMini, isProPlan isproplan, getLink getlink) {
        isIndividualPlan isindividualplanWrite;
        toMagicModuleMetaRepoModel.write(getbadgetext, "");
        toMagicModuleMetaRepoModel.write(pearlMini, "");
        toMagicModuleMetaRepoModel.write(isproplan, "");
        toMagicModuleMetaRepoModel.write(getlink, "");
        if (!(pearlMini instanceof RecentUpdatesLastSyncedModel)) {
            return super.RemoteActionCompatParcelizer(getbadgetext, pearlMini, isproplan, getlink);
        }
        RecentUpdatesLastSyncedModel recentUpdatesLastSyncedModelAudioAttributesCompatParcelizer = (RecentUpdatesLastSyncedModel) pearlMini;
        if (!recentUpdatesLastSyncedModelAudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
            recentUpdatesLastSyncedModelAudioAttributesCompatParcelizer = recentUpdatesLastSyncedModelAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(getPearlList.INFLEXIBLE);
        }
        int i = RemoteActionCompatParcelizer.write[recentUpdatesLastSyncedModelAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer().ordinal()];
        if (i == 1) {
            return new isIndividualPlan(getTotalSubject.INVARIANT, getlink);
        }
        if (i == 2 || i == 3) {
            if (!getbadgetext.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer()) {
                isindividualplanWrite = new isIndividualPlan(getTotalSubject.INVARIANT, setLocked.AudioAttributesCompatParcelizer(getbadgetext).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
            } else {
                List<getBadgeText> listAudioAttributesCompatParcelizer = getlink.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAudioAttributesCompatParcelizer, "");
                if (!listAudioAttributesCompatParcelizer.isEmpty()) {
                    isindividualplanWrite = new isIndividualPlan(getTotalSubject.OUT_VARIANCE, getlink);
                } else {
                    isindividualplanWrite = setPlanAddOns.write(getbadgetext, recentUpdatesLastSyncedModelAudioAttributesCompatParcelizer);
                }
            }
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(isindividualplanWrite, "");
            return isindividualplanWrite;
        }
        throw new RenewEligibleCreator();
    }
}
