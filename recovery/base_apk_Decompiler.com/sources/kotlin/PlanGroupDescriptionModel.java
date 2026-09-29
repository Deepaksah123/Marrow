package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.addPlan;

/* JADX INFO: loaded from: classes4.dex */
public final class PlanGroupDescriptionModel {
    public static final getHref AudioAttributesCompatParcelizer(getHref gethref, isQbank isqbank) {
        toMagicModuleMetaRepoModel.write(gethref, "");
        toMagicModuleMetaRepoModel.write(isqbank, "");
        getHref gethref2 = gethref;
        List<setDefault> list = read(gethref2, isqbank);
        if (list != null) {
            return read(gethref2, list);
        }
        return null;
    }

    private static final getHref read(PlanAddOnsCompanion planAddOnsCompanion, List<? extends setDefault> list) {
        return AddOnMetaKt.write(planAddOnsCompanion.bc_(), planAddOnsCompanion.AudioAttributesImplApi21Parcelizer(), list, planAddOnsCompanion.ba_());
    }

    private static final List<setDefault> read(PlanAddOnsCompanion planAddOnsCompanion, isQbank isqbank) {
        if (planAddOnsCompanion.bb_().size() != planAddOnsCompanion.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer().size()) {
            return null;
        }
        List<setDefault> listBb_ = planAddOnsCompanion.bb_();
        List<setDefault> list = listBb_;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((setDefault) it.next()).read() != getTotalSubject.INVARIANT) {
                    List<getBadgeText> listAudioAttributesCompatParcelizer = planAddOnsCompanion.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listAudioAttributesCompatParcelizer, "");
                    List<Pair> listAudioAttributesImplApi26Parcelizer = IntermediateLoginResponseBody.AudioAttributesImplApi26Parcelizer(list, listAudioAttributesCompatParcelizer);
                    ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listAudioAttributesImplApi26Parcelizer, 10));
                    for (Pair pair : listAudioAttributesImplApi26Parcelizer) {
                        setDefault setdefaultWrite = (setDefault) pair.RemoteActionCompatParcelizer();
                        getBadgeText getbadgetext = (getBadgeText) pair.read();
                        if (setdefaultWrite.read() != getTotalSubject.INVARIANT) {
                            PlanAddOnsCompanion planAddOnsCompanionMediaBrowserCompatMediaItem = (setdefaultWrite.write() || setdefaultWrite.read() != getTotalSubject.IN_VARIANCE) ? null : setdefaultWrite.AudioAttributesCompatParcelizer().MediaBrowserCompatMediaItem();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getbadgetext, "");
                            setdefaultWrite = getSearchTimes.write(new getDefaultPlan(isqbank, planAddOnsCompanionMediaBrowserCompatMediaItem, setdefaultWrite, getbadgetext));
                        }
                        arrayList.add(setdefaultWrite);
                    }
                    ArrayList arrayList2 = arrayList;
                    setDesriptionList setdesriptionlistAudioAttributesImplBaseParcelizer = getSubscriptionDetails.read.read(planAddOnsCompanion.AudioAttributesImplApi21Parcelizer(), arrayList2).AudioAttributesImplBaseParcelizer();
                    int size = listBb_.size();
                    for (int i = 0; i < size; i++) {
                        setDefault setdefault = listBb_.get(i);
                        setDefault setdefault2 = (setDefault) arrayList2.get(i);
                        if (setdefault.read() != getTotalSubject.INVARIANT) {
                            List<getLink> listMediaBrowserCompatCustomActionResultReceiver = planAddOnsCompanion.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer().get(i).MediaBrowserCompatCustomActionResultReceiver();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaBrowserCompatCustomActionResultReceiver, "");
                            ArrayList arrayList3 = new ArrayList();
                            Iterator<T> it2 = listMediaBrowserCompatCustomActionResultReceiver.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(addPlan.write.write.IconCompatParcelizer(setdesriptionlistAudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer((getLink) it2.next(), getTotalSubject.INVARIANT).MediaBrowserCompatMediaItem()));
                            }
                            ArrayList arrayList4 = arrayList3;
                            if (!setdefault.write() && setdefault.read() == getTotalSubject.OUT_VARIANCE) {
                                arrayList4.add(addPlan.write.write.IconCompatParcelizer(setdefault.AudioAttributesCompatParcelizer().MediaBrowserCompatMediaItem()));
                            }
                            getLink getlinkAudioAttributesCompatParcelizer = setdefault2.AudioAttributesCompatParcelizer();
                            toMagicModuleMetaRepoModel.read(getlinkAudioAttributesCompatParcelizer, "");
                            ((getDefaultPlan) getlinkAudioAttributesCompatParcelizer).AudioAttributesImplApi21Parcelizer().read(arrayList4);
                        }
                    }
                    return arrayList2;
                }
            }
        }
        return null;
    }
}
