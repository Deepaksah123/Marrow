package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getDurationText extends newHeaderInstance implements MediaRestrictions {
    private final getHref IconCompatParcelizer;

    @Override // kotlin.setRootSubjectIds
    public final boolean AudioAttributesCompatParcelizer() {
        return true;
    }

    @Override // kotlin.newHeaderInstance, kotlin.getLink
    public final boolean ba_() {
        return false;
    }

    public getDurationText(getHref gethref) {
        toMagicModuleMetaRepoModel.write(gethref, "");
        this.IconCompatParcelizer = gethref;
    }

    @Override // kotlin.newHeaderInstance
    public final /* synthetic */ newHeaderInstance AudioAttributesCompatParcelizer(getHref gethref) {
        return read(gethref);
    }

    @Override // kotlin.PlanAddOnsCompanion
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    public final /* synthetic */ PlanAddOnsCompanion write(boolean z) {
        return write(z);
    }

    @Override // kotlin.newHeaderInstance
    public final getHref write() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.setRootSubjectIds
    public final getLink IconCompatParcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        PlanAddOnsCompanion planAddOnsCompanionMediaBrowserCompatMediaItem = getlink.MediaBrowserCompatMediaItem();
        PlanAddOnsCompanion planAddOnsCompanion = planAddOnsCompanionMediaBrowserCompatMediaItem;
        if (!getSearchTimes.MediaBrowserCompatItemReceiver(planAddOnsCompanion) && !setPlanAddOns.write(planAddOnsCompanion)) {
            return planAddOnsCompanion;
        }
        if (planAddOnsCompanionMediaBrowserCompatMediaItem instanceof getHref) {
            return RemoteActionCompatParcelizer((getHref) planAddOnsCompanionMediaBrowserCompatMediaItem);
        }
        if (planAddOnsCompanionMediaBrowserCompatMediaItem instanceof getTopicId) {
            getTopicId gettopicid = (getTopicId) planAddOnsCompanionMediaBrowserCompatMediaItem;
            return setPlanType.RemoteActionCompatParcelizer(AddOnMetaKt.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer(gettopicid.AudioAttributesImplBaseParcelizer()), RemoteActionCompatParcelizer(gettopicid.AudioAttributesImplApi26Parcelizer())), setPlanType.RemoteActionCompatParcelizer(planAddOnsCompanion));
        }
        throw new IllegalStateException("Incorrect type: ".concat(String.valueOf(planAddOnsCompanionMediaBrowserCompatMediaItem)).toString());
    }

    private static getHref RemoteActionCompatParcelizer(getHref gethref) {
        getHref gethrefWrite = gethref.write(false);
        return !getSearchTimes.MediaBrowserCompatItemReceiver(gethref) ? gethrefWrite : new getDurationText(gethrefWrite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getHref
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public getDurationText read(getGroupDescription getgroupdescription) {
        toMagicModuleMetaRepoModel.write(getgroupdescription, "");
        return new getDurationText(write().read(getgroupdescription));
    }

    @Override // kotlin.getHref
    public final getHref write(boolean z) {
        return z ? write().write(true) : this;
    }

    private static getDurationText read(getHref gethref) {
        toMagicModuleMetaRepoModel.write(gethref, "");
        return new getDurationText(gethref);
    }
}
