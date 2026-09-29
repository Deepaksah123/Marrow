package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class PearlSubjectInfo {
    public static final boolean AudioAttributesCompatParcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        return getlink.MediaBrowserCompatMediaItem() instanceof getTopicId;
    }

    public static final getTopicId read(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        PlanAddOnsCompanion planAddOnsCompanionMediaBrowserCompatMediaItem = getlink.MediaBrowserCompatMediaItem();
        toMagicModuleMetaRepoModel.read(planAddOnsCompanionMediaBrowserCompatMediaItem, "");
        return (getTopicId) planAddOnsCompanionMediaBrowserCompatMediaItem;
    }

    public static final getHref write(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        PlanAddOnsCompanion planAddOnsCompanionMediaBrowserCompatMediaItem = getlink.MediaBrowserCompatMediaItem();
        if (planAddOnsCompanionMediaBrowserCompatMediaItem instanceof getTopicId) {
            return ((getTopicId) planAddOnsCompanionMediaBrowserCompatMediaItem).AudioAttributesImplBaseParcelizer();
        }
        if (planAddOnsCompanionMediaBrowserCompatMediaItem instanceof getHref) {
            return (getHref) planAddOnsCompanionMediaBrowserCompatMediaItem;
        }
        throw new RenewEligibleCreator();
    }

    public static final getHref RemoteActionCompatParcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        PlanAddOnsCompanion planAddOnsCompanionMediaBrowserCompatMediaItem = getlink.MediaBrowserCompatMediaItem();
        if (planAddOnsCompanionMediaBrowserCompatMediaItem instanceof getTopicId) {
            return ((getTopicId) planAddOnsCompanionMediaBrowserCompatMediaItem).AudioAttributesImplApi26Parcelizer();
        }
        if (planAddOnsCompanionMediaBrowserCompatMediaItem instanceof getHref) {
            return (getHref) planAddOnsCompanionMediaBrowserCompatMediaItem;
        }
        throw new RenewEligibleCreator();
    }
}
