package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class hasSubscriptions {

    public static final class read extends getSubscriptionDetails {
        private /* synthetic */ List<getPlanAddOns> RemoteActionCompatParcelizer;

        /* JADX WARN: Multi-variable type inference failed */
        read(List<? extends getPlanAddOns> list) {
            this.RemoteActionCompatParcelizer = list;
        }

        @Override // kotlin.getSubscriptionDetails
        public final setDefault write(getPlanAddOns getplanaddons) {
            toMagicModuleMetaRepoModel.write(getplanaddons, "");
            if (!this.RemoteActionCompatParcelizer.contains(getplanaddons)) {
                return null;
            }
            getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getplanaddons.RemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.read(getquestionlimitRemoteActionCompatParcelizer, "");
            return setPlanAddOns.write((getBadgeText) getquestionlimitRemoteActionCompatParcelizer);
        }
    }

    private static final getLink write(List<? extends getPlanAddOns> list, List<? extends getLink> list2, getTestTabItems gettesttabitems) {
        getHref gethrefIconCompatParcelizer = setDesriptionList.RemoteActionCompatParcelizer(new read(list)).IconCompatParcelizer((getLink) IntermediateLoginResponseBody.RatingCompat((List) list2), getTotalSubject.OUT_VARIANCE);
        if (gethrefIconCompatParcelizer == null) {
            gethrefIconCompatParcelizer = gettesttabitems.RatingCompat();
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethrefIconCompatParcelizer, "");
        return gethrefIconCompatParcelizer;
    }

    public static final getLink read(getBadgeText getbadgetext) {
        toMagicModuleMetaRepoModel.write(getbadgetext, "");
        getVariant getvariantAudioAttributesImplApi21Parcelizer = getbadgetext.AudioAttributesImplApi21Parcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getvariantAudioAttributesImplApi21Parcelizer, "");
        if (getvariantAudioAttributesImplApi21Parcelizer instanceof getBadge) {
            List<getBadgeText> listAudioAttributesCompatParcelizer = ((getBadge) getvariantAudioAttributesImplApi21Parcelizer).MediaBrowserCompatSearchResultReceiver().AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAudioAttributesCompatParcelizer, "");
            List<getBadgeText> list = listAudioAttributesCompatParcelizer;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                getPlanAddOns getplanaddonsMediaBrowserCompatSearchResultReceiver = ((getBadgeText) it.next()).MediaBrowserCompatSearchResultReceiver();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getplanaddonsMediaBrowserCompatSearchResultReceiver, "");
                arrayList.add(getplanaddonsMediaBrowserCompatSearchResultReceiver);
            }
            List<getLink> listMediaBrowserCompatCustomActionResultReceiver = getbadgetext.MediaBrowserCompatCustomActionResultReceiver();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaBrowserCompatCustomActionResultReceiver, "");
            return write(arrayList, listMediaBrowserCompatCustomActionResultReceiver, setLocked.AudioAttributesCompatParcelizer(getbadgetext));
        }
        if (getvariantAudioAttributesImplApi21Parcelizer instanceof CourseConfigV2NavDrawerItemRateUs) {
            List<getBadgeText> listMediaDescriptionCompat = ((CourseConfigV2NavDrawerItemRateUs) getvariantAudioAttributesImplApi21Parcelizer).MediaDescriptionCompat();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaDescriptionCompat, "");
            List<getBadgeText> list2 = listMediaDescriptionCompat;
            ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                getPlanAddOns getplanaddonsMediaBrowserCompatSearchResultReceiver2 = ((getBadgeText) it2.next()).MediaBrowserCompatSearchResultReceiver();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getplanaddonsMediaBrowserCompatSearchResultReceiver2, "");
                arrayList2.add(getplanaddonsMediaBrowserCompatSearchResultReceiver2);
            }
            List<getLink> listMediaBrowserCompatCustomActionResultReceiver2 = getbadgetext.MediaBrowserCompatCustomActionResultReceiver();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaBrowserCompatCustomActionResultReceiver2, "");
            return write(arrayList2, listMediaBrowserCompatCustomActionResultReceiver2, setLocked.AudioAttributesCompatParcelizer(getbadgetext));
        }
        throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
    }
}
