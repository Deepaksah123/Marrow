package kotlin;

import java.util.List;
import kotlin.getQuote;

/* JADX INFO: loaded from: classes4.dex */
public final class setMinPrice {
    public static /* synthetic */ getLink read(getLink getlink, List list, getQuote getquote, List list2, int i) {
        if ((i & 1) != 0) {
            list = getlink.bb_();
        }
        if ((i & 2) != 0) {
            getquote = getlink.RemoteActionCompatParcelizer();
        }
        if ((i & 4) != 0) {
            list2 = list;
        }
        return read(getlink, list, getquote, list2);
    }

    private static getLink read(getLink getlink, List<? extends setDefault> list, getQuote getquote, List<? extends setDefault> list2) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getquote, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        if ((list.isEmpty() || list == getlink.bb_()) && getquote == getlink.RemoteActionCompatParcelizer()) {
            return getlink;
        }
        getGroupDescription getgroupdescriptionBc_ = getlink.bc_();
        if ((getquote instanceof setPublishedStatus) && getquote.RemoteActionCompatParcelizer()) {
            getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
            getquote = getQuote.AudioAttributesCompatParcelizer.read();
        }
        getGroupDescription getgroupdescriptionAudioAttributesCompatParcelizer = getDurationTitle.AudioAttributesCompatParcelizer(getgroupdescriptionBc_, getquote);
        PlanAddOnsCompanion planAddOnsCompanionMediaBrowserCompatMediaItem = getlink.MediaBrowserCompatMediaItem();
        if (planAddOnsCompanionMediaBrowserCompatMediaItem instanceof getTopicId) {
            getTopicId gettopicid = (getTopicId) planAddOnsCompanionMediaBrowserCompatMediaItem;
            return AddOnMetaKt.AudioAttributesCompatParcelizer(IconCompatParcelizer(gettopicid.AudioAttributesImplBaseParcelizer(), list, getgroupdescriptionAudioAttributesCompatParcelizer), IconCompatParcelizer(gettopicid.AudioAttributesImplApi26Parcelizer(), list2, getgroupdescriptionAudioAttributesCompatParcelizer));
        }
        if (planAddOnsCompanionMediaBrowserCompatMediaItem instanceof getHref) {
            return IconCompatParcelizer((getHref) planAddOnsCompanionMediaBrowserCompatMediaItem, list, getgroupdescriptionAudioAttributesCompatParcelizer);
        }
        throw new RenewEligibleCreator();
    }

    public static /* synthetic */ getHref AudioAttributesCompatParcelizer(getHref gethref, List list, getGroupDescription getgroupdescription, int i) {
        if ((i & 1) != 0) {
            list = gethref.bb_();
        }
        if ((i & 2) != 0) {
            getgroupdescription = gethref.bc_();
        }
        return IconCompatParcelizer(gethref, list, getgroupdescription);
    }

    private static getHref IconCompatParcelizer(getHref gethref, List<? extends setDefault> list, getGroupDescription getgroupdescription) {
        toMagicModuleMetaRepoModel.write(gethref, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getgroupdescription, "");
        if (list.isEmpty() && getgroupdescription == gethref.bc_()) {
            return gethref;
        }
        if (list.isEmpty()) {
            return gethref.read(getgroupdescription);
        }
        if (gethref instanceof PlanSubscriptionItemKt) {
            return ((PlanSubscriptionItemKt) gethref).read(list);
        }
        return AddOnMetaKt.write(getgroupdescription, gethref.AudioAttributesImplApi21Parcelizer(), list, gethref.ba_());
    }

    public static final getHref write(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        PlanAddOnsCompanion planAddOnsCompanionMediaBrowserCompatMediaItem = getlink.MediaBrowserCompatMediaItem();
        getHref gethref = planAddOnsCompanionMediaBrowserCompatMediaItem instanceof getHref ? (getHref) planAddOnsCompanionMediaBrowserCompatMediaItem : null;
        if (gethref != null) {
            return gethref;
        }
        throw new IllegalStateException("This is should be simple type: ".concat(String.valueOf(getlink)).toString());
    }

    public static final getLink RemoteActionCompatParcelizer(getLink getlink, List<? extends setDefault> list, getQuote getquote) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getquote, "");
        return read(getlink, list, getquote, null, 4);
    }
}
