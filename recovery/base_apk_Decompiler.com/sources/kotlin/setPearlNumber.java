package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setPearlNumber extends newHeaderInstance implements setRootSubjectIds, getSgstPercentInfo {
    public static final IconCompatParcelizer RemoteActionCompatParcelizer = new IconCompatParcelizer(0);
    private final boolean IconCompatParcelizer;
    private final getHref write;

    @Override // kotlin.newHeaderInstance, kotlin.getLink
    public final boolean ba_() {
        return false;
    }

    @Override // kotlin.PlanAddOnsCompanion
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public final /* synthetic */ PlanAddOnsCompanion read(getGroupDescription getgroupdescription) {
        return read(getgroupdescription);
    }

    @Override // kotlin.PlanAddOnsCompanion
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    public final /* synthetic */ PlanAddOnsCompanion write(boolean z) {
        return write(z);
    }

    public final getHref AudioAttributesImplApi26Parcelizer() {
        return this.write;
    }

    private setPearlNumber(getHref gethref, boolean z) {
        this.write = gethref;
        this.IconCompatParcelizer = z;
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public setPearlNumber RemoteActionCompatParcelizer(PlanAddOnsCompanion planAddOnsCompanion, boolean z, boolean z2) {
            toMagicModuleMetaRepoModel.write(planAddOnsCompanion, "");
            if (planAddOnsCompanion instanceof setPearlNumber) {
                return (setPearlNumber) planAddOnsCompanion;
            }
            if (!AudioAttributesCompatParcelizer(planAddOnsCompanion, z)) {
                return null;
            }
            if (planAddOnsCompanion instanceof getTopicId) {
                getTopicId gettopicid = (getTopicId) planAddOnsCompanion;
                toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(gettopicid.AudioAttributesImplBaseParcelizer().AudioAttributesImplApi21Parcelizer(), gettopicid.AudioAttributesImplApi26Parcelizer().AudioAttributesImplApi21Parcelizer());
            }
            return new setPearlNumber(PearlSubjectInfo.write(planAddOnsCompanion).write(false), z, (byte) 0);
        }

        private static boolean AudioAttributesCompatParcelizer(PlanAddOnsCompanion planAddOnsCompanion, boolean z) {
            if (!IconCompatParcelizer(planAddOnsCompanion)) {
                return false;
            }
            if (planAddOnsCompanion instanceof Plan) {
                return setPlanAddOns.write(planAddOnsCompanion);
            }
            getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = planAddOnsCompanion.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
            getWrongCount getwrongcount = getquestionlimitRemoteActionCompatParcelizer instanceof getWrongCount ? (getWrongCount) getquestionlimitRemoteActionCompatParcelizer : null;
            if (getwrongcount != null && !getwrongcount.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                return true;
            }
            if (z && (planAddOnsCompanion.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer() instanceof getBadgeText)) {
                return setPlanAddOns.write(planAddOnsCompanion);
            }
            getPlanFeatureTitle getplanfeaturetitle = getPlanFeatureTitle.IconCompatParcelizer;
            return !getPlanFeatureTitle.write(planAddOnsCompanion);
        }

        private static boolean IconCompatParcelizer(PlanAddOnsCompanion planAddOnsCompanion) {
            return (planAddOnsCompanion.AudioAttributesImplApi21Parcelizer() instanceof getPlans) || (planAddOnsCompanion.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer() instanceof getBadgeText) || (planAddOnsCompanion instanceof getDefaultPlan) || (planAddOnsCompanion instanceof Plan);
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    @Override // kotlin.newHeaderInstance
    protected final getHref write() {
        return this.write;
    }

    @Override // kotlin.setRootSubjectIds
    public final boolean AudioAttributesCompatParcelizer() {
        return (write().AudioAttributesImplApi21Parcelizer() instanceof getPlans) || (write().AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer() instanceof getBadgeText);
    }

    @Override // kotlin.setRootSubjectIds
    public final getLink IconCompatParcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        return Meta.IconCompatParcelizer(getlink.MediaBrowserCompatMediaItem(), this.IconCompatParcelizer);
    }

    @Override // kotlin.getHref
    public final getHref read(getGroupDescription getgroupdescription) {
        toMagicModuleMetaRepoModel.write(getgroupdescription, "");
        return new setPearlNumber(write().read(getgroupdescription), this.IconCompatParcelizer);
    }

    @Override // kotlin.getHref
    public final getHref write(boolean z) {
        return z ? write().write(z) : this;
    }

    @Override // kotlin.getHref
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(write());
        sb.append(" & Any");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.newHeaderInstance
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public setPearlNumber AudioAttributesCompatParcelizer(getHref gethref) {
        toMagicModuleMetaRepoModel.write(gethref, "");
        return new setPearlNumber(gethref, this.IconCompatParcelizer);
    }

    public /* synthetic */ setPearlNumber(getHref gethref, boolean z, byte b) {
        this(gethref, z);
    }
}
