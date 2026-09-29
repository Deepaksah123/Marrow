package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class PearlTopicInfo extends getTopicId implements setRootSubjectIds {

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PearlTopicInfo(getHref gethref, getHref gethref2) {
        super(gethref, gethref2);
        toMagicModuleMetaRepoModel.write(gethref, "");
        toMagicModuleMetaRepoModel.write(gethref2, "");
    }

    @Override // kotlin.getTopicId
    public final getHref IconCompatParcelizer() {
        return AudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin.setRootSubjectIds
    public final boolean AudioAttributesCompatParcelizer() {
        return (AudioAttributesImplBaseParcelizer().AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer() instanceof getBadgeText) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(AudioAttributesImplBaseParcelizer().AudioAttributesImplApi21Parcelizer(), AudioAttributesImplApi26Parcelizer().AudioAttributesImplApi21Parcelizer());
    }

    @Override // kotlin.setRootSubjectIds
    public final getLink IconCompatParcelizer(getLink getlink) {
        PlanAddOnsCompanion planAddOnsCompanionAudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(getlink, "");
        PlanAddOnsCompanion planAddOnsCompanionMediaBrowserCompatMediaItem = getlink.MediaBrowserCompatMediaItem();
        if (planAddOnsCompanionMediaBrowserCompatMediaItem instanceof getTopicId) {
            planAddOnsCompanionAudioAttributesCompatParcelizer = planAddOnsCompanionMediaBrowserCompatMediaItem;
        } else {
            if (!(planAddOnsCompanionMediaBrowserCompatMediaItem instanceof getHref)) {
                throw new RenewEligibleCreator();
            }
            getHref gethref = (getHref) planAddOnsCompanionMediaBrowserCompatMediaItem;
            planAddOnsCompanionAudioAttributesCompatParcelizer = AddOnMetaKt.AudioAttributesCompatParcelizer(gethref, gethref.write(true));
        }
        return setPlanType.write(planAddOnsCompanionAudioAttributesCompatParcelizer, planAddOnsCompanionMediaBrowserCompatMediaItem);
    }

    @Override // kotlin.PlanAddOnsCompanion
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public final PlanAddOnsCompanion read(getGroupDescription getgroupdescription) {
        toMagicModuleMetaRepoModel.write(getgroupdescription, "");
        return AddOnMetaKt.AudioAttributesCompatParcelizer(AudioAttributesImplBaseParcelizer().read(getgroupdescription), AudioAttributesImplApi26Parcelizer().read(getgroupdescription));
    }

    @Override // kotlin.getTopicId
    public final String read(setGuessed setguessed, setFirstAnswer setfirstanswer) {
        toMagicModuleMetaRepoModel.write(setguessed, "");
        toMagicModuleMetaRepoModel.write(setfirstanswer, "");
        if (setfirstanswer.IconCompatParcelizer()) {
            StringBuilder sb = new StringBuilder("(");
            sb.append(setguessed.read(AudioAttributesImplBaseParcelizer()));
            sb.append("..");
            sb.append(setguessed.read(AudioAttributesImplApi26Parcelizer()));
            sb.append(')');
            return sb.toString();
        }
        return setguessed.read(setguessed.read(AudioAttributesImplBaseParcelizer()), setguessed.read(AudioAttributesImplApi26Parcelizer()), getSearchTimes.read(this));
    }

    @Override // kotlin.getTopicId
    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(AudioAttributesImplBaseParcelizer());
        sb.append("..");
        sb.append(AudioAttributesImplApi26Parcelizer());
        sb.append(')');
        return sb.toString();
    }

    @Override // kotlin.PlanAddOnsCompanion
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    public final PlanAddOnsCompanion write(boolean z) {
        return AddOnMetaKt.AudioAttributesCompatParcelizer(AudioAttributesImplBaseParcelizer().write(z), AudioAttributesImplApi26Parcelizer().write(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.PlanAddOnsCompanion
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public getTopicId write(getCheapestPlan getcheapestplan) {
        toMagicModuleMetaRepoModel.write(getcheapestplan, "");
        getLink getlink = getcheapestplan.read(AudioAttributesImplBaseParcelizer());
        toMagicModuleMetaRepoModel.read(getlink, "");
        getLink getlink2 = getcheapestplan.read(AudioAttributesImplApi26Parcelizer());
        toMagicModuleMetaRepoModel.read(getlink2, "");
        return new PearlTopicInfo((getHref) getlink, (getHref) getlink2);
    }

    static {
        new read((byte) 0);
    }
}
