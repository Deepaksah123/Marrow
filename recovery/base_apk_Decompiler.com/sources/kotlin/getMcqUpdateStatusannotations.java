package kotlin;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getMcqUpdateStatusannotations {
    private static getLink IconCompatParcelizer(setDefault setdefault) {
        toMagicModuleMetaRepoModel.write(setdefault, "");
        return new setOption2(setdefault);
    }

    public static final boolean AudioAttributesCompatParcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        return getlink.AudioAttributesImplApi21Parcelizer() instanceof McqIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static isVideoPlanCtype write(isVideoPlanCtype isvideoplanctype, boolean z) {
        toMagicModuleMetaRepoModel.write(isvideoplanctype, "");
        if (isvideoplanctype instanceof setKeySubjectIds) {
            setKeySubjectIds setkeysubjectids = (setKeySubjectIds) isvideoplanctype;
            getBadgeText[] getbadgetextArrIconCompatParcelizer = setkeysubjectids.IconCompatParcelizer();
            List<Pair> listRemoteActionCompatParcelizer = getOrderDetails.RemoteActionCompatParcelizer((Object[]) setkeysubjectids.RemoteActionCompatParcelizer(), (Object[]) setkeysubjectids.IconCompatParcelizer());
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listRemoteActionCompatParcelizer, 10));
            for (Pair pair : listRemoteActionCompatParcelizer) {
                arrayList.add(IconCompatParcelizer((setDefault) pair.write(), (getBadgeText) pair.IconCompatParcelizer()));
            }
            return new setKeySubjectIds(getbadgetextArrIconCompatParcelizer, (setDefault[]) arrayList.toArray(new setDefault[0]), true);
        }
        return new write(isvideoplanctype, true);
    }

    public static final class write extends PearlListModel {
        private /* synthetic */ boolean read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(isVideoPlanCtype isvideoplanctype, boolean z) {
            super(isvideoplanctype);
            this.read = z;
        }

        @Override // kotlin.PearlListModel, kotlin.isVideoPlanCtype
        public final boolean write() {
            return this.read;
        }

        @Override // kotlin.PearlListModel, kotlin.isVideoPlanCtype
        public final setDefault IconCompatParcelizer(getLink getlink) {
            toMagicModuleMetaRepoModel.write(getlink, "");
            setDefault setdefaultIconCompatParcelizer = super.IconCompatParcelizer(getlink);
            if (setdefaultIconCompatParcelizer == null) {
                return null;
            }
            getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getlink.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
            return getMcqUpdateStatusannotations.IconCompatParcelizer(setdefaultIconCompatParcelizer, getquestionlimitRemoteActionCompatParcelizer instanceof getBadgeText ? (getBadgeText) getquestionlimitRemoteActionCompatParcelizer : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final setDefault IconCompatParcelizer(setDefault setdefault, getBadgeText getbadgetext) {
        if (getbadgetext == null || setdefault.read() == getTotalSubject.INVARIANT) {
            return setdefault;
        }
        if (getbadgetext.MediaBrowserCompatMediaItem() == setdefault.read()) {
            if (setdefault.write()) {
                getMini getmini = getSchemaCompletion.read;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getmini, "");
                return new isIndividualPlan(new AddOnTaxInfoKt(getmini, new AudioAttributesCompatParcelizer(setdefault)));
            }
            return new isIndividualPlan(setdefault.AudioAttributesCompatParcelizer());
        }
        return new isIndividualPlan(IconCompatParcelizer(setdefault));
    }

    static final class AudioAttributesCompatParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<getLink> {
        private /* synthetic */ setDefault IconCompatParcelizer;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public getLink invoke() {
            getLink getlinkAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer, "");
            return getlinkAudioAttributesCompatParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(setDefault setdefault) {
            super(0);
            this.IconCompatParcelizer = setdefault;
        }
    }
}
