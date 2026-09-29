package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setPlanType {
    /* JADX WARN: Multi-variable type inference failed */
    public static final getLink RemoteActionCompatParcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        if (getlink instanceof getNoteEdition) {
            return ((getNoteEdition) getlink).MediaBrowserCompatCustomActionResultReceiver();
        }
        return null;
    }

    public static final PlanAddOnsCompanion write(PlanAddOnsCompanion planAddOnsCompanion, getLink getlink, getAnswerMap<? super getLink, ? extends getLink> getanswermap) {
        toMagicModuleMetaRepoModel.write(planAddOnsCompanion, "");
        toMagicModuleMetaRepoModel.write(getlink, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        getLink getlinkRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getlink);
        return RemoteActionCompatParcelizer(planAddOnsCompanion, getlinkRemoteActionCompatParcelizer != null ? getanswermap.invoke(getlinkRemoteActionCompatParcelizer) : null);
    }

    public static final PlanAddOnsCompanion write(PlanAddOnsCompanion planAddOnsCompanion, getLink getlink) {
        toMagicModuleMetaRepoModel.write(planAddOnsCompanion, "");
        toMagicModuleMetaRepoModel.write(getlink, "");
        return RemoteActionCompatParcelizer(planAddOnsCompanion, RemoteActionCompatParcelizer(getlink));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final PlanAddOnsCompanion RemoteActionCompatParcelizer(PlanAddOnsCompanion planAddOnsCompanion, getLink getlink) {
        toMagicModuleMetaRepoModel.write(planAddOnsCompanion, "");
        if (planAddOnsCompanion instanceof getNoteEdition) {
            return RemoteActionCompatParcelizer(((getNoteEdition) planAddOnsCompanion).MediaBrowserCompatItemReceiver(), getlink);
        }
        if (getlink == null || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getlink, planAddOnsCompanion)) {
            return planAddOnsCompanion;
        }
        if (planAddOnsCompanion instanceof getHref) {
            return new getTaxPercentInfo((getHref) planAddOnsCompanion, getlink);
        }
        if (planAddOnsCompanion instanceof getTopicId) {
            return new setKeyRootSubjectIds((getTopicId) planAddOnsCompanion, getlink);
        }
        throw new RenewEligibleCreator();
    }
}
