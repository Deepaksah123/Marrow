package kotlin;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class PlanMetaDataResponse {
    public static final getLink IconCompatParcelizer(getLink getlink, getLink getlink2, PlanSubscriptionItem planSubscriptionItem) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        toMagicModuleMetaRepoModel.write(getlink2, "");
        toMagicModuleMetaRepoModel.write(planSubscriptionItem, "");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new PlanList(getlink, null));
        getPlanAddOns getplanaddonsAudioAttributesImplApi21Parcelizer = getlink2.AudioAttributesImplApi21Parcelizer();
        while (!arrayDeque.isEmpty()) {
            PlanList planList = (PlanList) arrayDeque.poll();
            getLink getlinkAudioAttributesCompatParcelizer = planList.AudioAttributesCompatParcelizer();
            getPlanAddOns getplanaddonsAudioAttributesImplApi21Parcelizer2 = getlinkAudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
            if (planSubscriptionItem.AudioAttributesCompatParcelizer(getplanaddonsAudioAttributesImplApi21Parcelizer2, getplanaddonsAudioAttributesImplApi21Parcelizer)) {
                boolean zBa_ = getlinkAudioAttributesCompatParcelizer.ba_();
                for (PlanList planList2 = planList.read(); planList2 != null; planList2 = planList2.read()) {
                    getLink getlinkAudioAttributesCompatParcelizer2 = planList2.AudioAttributesCompatParcelizer();
                    List<setDefault> listBb_ = getlinkAudioAttributesCompatParcelizer2.bb_();
                    if ((listBb_ instanceof Collection) && listBb_.isEmpty()) {
                        getlinkAudioAttributesCompatParcelizer = getSubscriptionDetails.read.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer2).AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer, getTotalSubject.INVARIANT);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer, "");
                    } else {
                        Iterator<T> it = listBb_.iterator();
                        while (it.hasNext()) {
                            if (((setDefault) it.next()).read() != getTotalSubject.INVARIANT) {
                                getLink getlinkAudioAttributesCompatParcelizer3 = getMcqUpdateStatusannotations.write(getSubscriptionDetails.read.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer2), true).AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer, getTotalSubject.INVARIANT);
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer3, "");
                                getlinkAudioAttributesCompatParcelizer = RemoteActionCompatParcelizer(getlinkAudioAttributesCompatParcelizer3);
                                break;
                            }
                        }
                        getlinkAudioAttributesCompatParcelizer = getSubscriptionDetails.read.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer2).AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer, getTotalSubject.INVARIANT);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer, "");
                    }
                    zBa_ = zBa_ || getlinkAudioAttributesCompatParcelizer2.ba_();
                }
                getPlanAddOns getplanaddonsAudioAttributesImplApi21Parcelizer3 = getlinkAudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
                if (planSubscriptionItem.AudioAttributesCompatParcelizer(getplanaddonsAudioAttributesImplApi21Parcelizer3, getplanaddonsAudioAttributesImplApi21Parcelizer)) {
                    return setPlanAddOns.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer, zBa_);
                }
                StringBuilder sb = new StringBuilder("Type constructors should be equals!\nsubstitutedSuperType: ");
                sb.append(read(getplanaddonsAudioAttributesImplApi21Parcelizer3));
                sb.append(", \n\nsupertype: ");
                sb.append(read(getplanaddonsAudioAttributesImplApi21Parcelizer));
                sb.append(" \n");
                sb.append(planSubscriptionItem.AudioAttributesCompatParcelizer(getplanaddonsAudioAttributesImplApi21Parcelizer3, getplanaddonsAudioAttributesImplApi21Parcelizer));
                throw new AssertionError(sb.toString());
            }
            for (getLink getlink3 : getplanaddonsAudioAttributesImplApi21Parcelizer2.aV_()) {
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlink3, "");
                arrayDeque.add(new PlanList(getlink3, planList));
            }
        }
        return null;
    }

    private static final getLink RemoteActionCompatParcelizer(getLink getlink) {
        return getBulletDescText.IconCompatParcelizer(getlink).IconCompatParcelizer();
    }

    private static final String read(getPlanAddOns getplanaddons) {
        StringBuilder sb = new StringBuilder();
        write("type: ".concat(String.valueOf(getplanaddons)), sb);
        StringBuilder sb2 = new StringBuilder("hashCode: ");
        sb2.append(getplanaddons.hashCode());
        write(sb2.toString(), sb);
        StringBuilder sb3 = new StringBuilder("javaClass: ");
        sb3.append(getplanaddons.getClass().getCanonicalName());
        write(sb3.toString(), sb);
        for (getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getplanaddons.RemoteActionCompatParcelizer(); getquestionlimitRemoteActionCompatParcelizer != null; getquestionlimitRemoteActionCompatParcelizer = getquestionlimitRemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer()) {
            StringBuilder sb4 = new StringBuilder("fqName: ");
            sb4.append(setGuessed.read.RemoteActionCompatParcelizer(getquestionlimitRemoteActionCompatParcelizer));
            write(sb4.toString(), sb);
            StringBuilder sb5 = new StringBuilder("javaClass: ");
            sb5.append(getquestionlimitRemoteActionCompatParcelizer.getClass().getCanonicalName());
            write(sb5.toString(), sb);
        }
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    private static final StringBuilder write(String str, StringBuilder sb) {
        toMagicModuleMetaRepoModel.write(str, "");
        sb.append(str);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sb, "");
        sb.append('\n');
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sb, "");
        return sb;
    }
}
