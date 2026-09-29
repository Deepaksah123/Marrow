package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class setKeySubjectIds extends isVideoPlanCtype {
    private final boolean AudioAttributesCompatParcelizer;
    private final setDefault[] IconCompatParcelizer;
    private final getBadgeText[] RemoteActionCompatParcelizer;

    private /* synthetic */ setKeySubjectIds(getBadgeText[] getbadgetextArr, setDefault[] setdefaultArr) {
        this(getbadgetextArr, setdefaultArr, false);
    }

    public final getBadgeText[] IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final setDefault[] RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public setKeySubjectIds(getBadgeText[] getbadgetextArr, setDefault[] setdefaultArr, boolean z) {
        toMagicModuleMetaRepoModel.write(getbadgetextArr, "");
        toMagicModuleMetaRepoModel.write(setdefaultArr, "");
        this.RemoteActionCompatParcelizer = getbadgetextArr;
        this.IconCompatParcelizer = setdefaultArr;
        this.AudioAttributesCompatParcelizer = z;
        int length = getbadgetextArr.length;
        int length2 = setdefaultArr.length;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setKeySubjectIds(List<? extends getBadgeText> list, List<? extends setDefault> list2) {
        this((getBadgeText[]) list.toArray(new getBadgeText[0]), (setDefault[]) list2.toArray(new setDefault[0]));
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
    }

    @Override // kotlin.isVideoPlanCtype
    public final boolean read() {
        return this.IconCompatParcelizer.length == 0;
    }

    @Override // kotlin.isVideoPlanCtype
    public final boolean write() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.isVideoPlanCtype
    public final setDefault IconCompatParcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getlink.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
        getBadgeText getbadgetext = getquestionlimitRemoteActionCompatParcelizer instanceof getBadgeText ? (getBadgeText) getquestionlimitRemoteActionCompatParcelizer : null;
        if (getbadgetext == null) {
            return null;
        }
        int iWrite = getbadgetext.write();
        getBadgeText[] getbadgetextArr = this.RemoteActionCompatParcelizer;
        if (iWrite >= getbadgetextArr.length || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getbadgetextArr[iWrite].MediaBrowserCompatSearchResultReceiver(), getbadgetext.MediaBrowserCompatSearchResultReceiver())) {
            return null;
        }
        return this.IconCompatParcelizer[iWrite];
    }
}
