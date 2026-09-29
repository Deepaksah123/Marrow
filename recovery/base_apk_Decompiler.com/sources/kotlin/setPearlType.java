package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setPearlType implements getPlanAddOns {
    private int IconCompatParcelizer;

    protected abstract boolean AudioAttributesCompatParcelizer(getQuestionLimit getquestionlimit);

    @Override // kotlin.getPlanAddOns
    public abstract getQuestionLimit RemoteActionCompatParcelizer();

    public int hashCode() {
        int iIdentityHashCode;
        int i = this.IconCompatParcelizer;
        if (i != 0) {
            return i;
        }
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (write(getquestionlimitRemoteActionCompatParcelizer)) {
            iIdentityHashCode = getAnswerDescription.RemoteActionCompatParcelizer(getquestionlimitRemoteActionCompatParcelizer).hashCode();
        } else {
            iIdentityHashCode = System.identityHashCode(this);
        }
        this.IconCompatParcelizer = iIdentityHashCode;
        return iIdentityHashCode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getPlanAddOns) || obj.hashCode() != hashCode()) {
            return false;
        }
        getPlanAddOns getplanaddons = (getPlanAddOns) obj;
        if (getplanaddons.AudioAttributesCompatParcelizer().size() != AudioAttributesCompatParcelizer().size()) {
            return false;
        }
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer2 = getplanaddons.RemoteActionCompatParcelizer();
        if (getquestionlimitRemoteActionCompatParcelizer2 != null && write(getquestionlimitRemoteActionCompatParcelizer) && write(getquestionlimitRemoteActionCompatParcelizer2)) {
            return AudioAttributesCompatParcelizer(getquestionlimitRemoteActionCompatParcelizer2);
        }
        return false;
    }

    protected static boolean write(getQuestionLimit getquestionlimit, getQuestionLimit getquestionlimit2) {
        toMagicModuleMetaRepoModel.write(getquestionlimit, "");
        toMagicModuleMetaRepoModel.write(getquestionlimit2, "");
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getquestionlimit.aQ_(), getquestionlimit2.aQ_())) {
            return false;
        }
        getVariant getvariantAudioAttributesImplApi21Parcelizer = getquestionlimit.AudioAttributesImplApi21Parcelizer();
        for (getVariant getvariantAudioAttributesImplApi21Parcelizer2 = getquestionlimit2.AudioAttributesImplApi21Parcelizer(); getvariantAudioAttributesImplApi21Parcelizer != null && getvariantAudioAttributesImplApi21Parcelizer2 != null; getvariantAudioAttributesImplApi21Parcelizer2 = getvariantAudioAttributesImplApi21Parcelizer2.AudioAttributesImplApi21Parcelizer()) {
            if (getvariantAudioAttributesImplApi21Parcelizer instanceof getTopSection) {
                return getvariantAudioAttributesImplApi21Parcelizer2 instanceof getTopSection;
            }
            if (getvariantAudioAttributesImplApi21Parcelizer2 instanceof getTopSection) {
                return false;
            }
            if (getvariantAudioAttributesImplApi21Parcelizer instanceof getShouldShowEmptyPlanScreen) {
                return (getvariantAudioAttributesImplApi21Parcelizer2 instanceof getShouldShowEmptyPlanScreen) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((getShouldShowEmptyPlanScreen) getvariantAudioAttributesImplApi21Parcelizer).IconCompatParcelizer(), ((getShouldShowEmptyPlanScreen) getvariantAudioAttributesImplApi21Parcelizer2).IconCompatParcelizer());
            }
            if ((getvariantAudioAttributesImplApi21Parcelizer2 instanceof getShouldShowEmptyPlanScreen) || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getvariantAudioAttributesImplApi21Parcelizer.aQ_(), getvariantAudioAttributesImplApi21Parcelizer2.aQ_())) {
                return false;
            }
            getvariantAudioAttributesImplApi21Parcelizer = getvariantAudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer();
        }
        return true;
    }

    private static boolean write(getQuestionLimit getquestionlimit) {
        getQuestionLimit getquestionlimit2 = getquestionlimit;
        return (SubscriptionType.write(getquestionlimit2) || getAnswerDescription.MediaDescriptionCompat(getquestionlimit2)) ? false : true;
    }
}
