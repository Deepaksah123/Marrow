package kotlin;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class Meta {
    private static fromJsonArray2 IconCompatParcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        PlanAddOnsCompanion planAddOnsCompanionMediaBrowserCompatMediaItem = getlink.MediaBrowserCompatMediaItem();
        if (planAddOnsCompanionMediaBrowserCompatMediaItem instanceof fromJsonArray2) {
            return (fromJsonArray2) planAddOnsCompanionMediaBrowserCompatMediaItem;
        }
        return null;
    }

    public static final getHref write(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        fromJsonArray2 fromjsonarray2IconCompatParcelizer = IconCompatParcelizer(getlink);
        if (fromjsonarray2IconCompatParcelizer != null) {
            return fromjsonarray2IconCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        }
        return null;
    }

    public static final getHref IconCompatParcelizer(getHref gethref, getHref gethref2) {
        toMagicModuleMetaRepoModel.write(gethref, "");
        toMagicModuleMetaRepoModel.write(gethref2, "");
        return Copy.write(gethref) ? gethref : new fromJsonArray2(gethref, gethref2);
    }

    public static final boolean AudioAttributesCompatParcelizer(getLink getlink) {
        toMagicModuleMetaRepoModel.write(getlink, "");
        return getlink.MediaBrowserCompatMediaItem() instanceof setPearlNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static getHref read(getHref gethref, boolean z) {
        toMagicModuleMetaRepoModel.write(gethref, "");
        setPearlNumber setpearlnumberRemoteActionCompatParcelizer = setPearlNumber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(gethref, false, false);
        if (setpearlnumberRemoteActionCompatParcelizer != null) {
            return setpearlnumberRemoteActionCompatParcelizer;
        }
        getHref gethrefRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(gethref);
        return gethrefRemoteActionCompatParcelizer == null ? gethref.write(false) : gethrefRemoteActionCompatParcelizer;
    }

    public static final getDefaultPlan IconCompatParcelizer(getDefaultPlan getdefaultplan) {
        toMagicModuleMetaRepoModel.write(getdefaultplan, "");
        return new getDefaultPlan(getdefaultplan.AudioAttributesImplApi26Parcelizer(), getdefaultplan.AudioAttributesImplApi21Parcelizer(), getdefaultplan.MediaBrowserCompatItemReceiver(), getdefaultplan.bc_(), getdefaultplan.ba_(), true);
    }

    public static /* synthetic */ PlanAddOnsCompanion IconCompatParcelizer(PlanAddOnsCompanion planAddOnsCompanion) {
        return IconCompatParcelizer(planAddOnsCompanion, false);
    }

    public static final PlanAddOnsCompanion IconCompatParcelizer(PlanAddOnsCompanion planAddOnsCompanion, boolean z) {
        toMagicModuleMetaRepoModel.write(planAddOnsCompanion, "");
        setPearlNumber setpearlnumberRemoteActionCompatParcelizer = setPearlNumber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(planAddOnsCompanion, z, false);
        if (setpearlnumberRemoteActionCompatParcelizer != null) {
            return setpearlnumberRemoteActionCompatParcelizer;
        }
        getHref gethrefRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(planAddOnsCompanion);
        if (gethrefRemoteActionCompatParcelizer != null) {
            return gethrefRemoteActionCompatParcelizer;
        }
        return planAddOnsCompanion.write(false);
    }

    private static final getHref RemoteActionCompatParcelizer(getLink getlink) {
        getMainCopy getmaincopyIconCompatParcelizer;
        getPlanAddOns getplanaddonsAudioAttributesImplApi21Parcelizer = getlink.AudioAttributesImplApi21Parcelizer();
        getMainCopy getmaincopy = getplanaddonsAudioAttributesImplApi21Parcelizer instanceof getMainCopy ? (getMainCopy) getplanaddonsAudioAttributesImplApi21Parcelizer : null;
        if (getmaincopy == null || (getmaincopyIconCompatParcelizer = IconCompatParcelizer(getmaincopy)) == null) {
            return null;
        }
        return getmaincopyIconCompatParcelizer.MediaBrowserCompatItemReceiver();
    }

    private static final getMainCopy IconCompatParcelizer(getMainCopy getmaincopy) {
        Collection<getLink> collectionAV_ = getmaincopy.aV_();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(collectionAV_, 10));
        boolean z = false;
        for (PlanAddOnsCompanion planAddOnsCompanionIconCompatParcelizer : collectionAV_) {
            if (setPlanAddOns.write(planAddOnsCompanionIconCompatParcelizer)) {
                planAddOnsCompanionIconCompatParcelizer = IconCompatParcelizer(planAddOnsCompanionIconCompatParcelizer.MediaBrowserCompatMediaItem());
                z = true;
            }
            arrayList.add(planAddOnsCompanionIconCompatParcelizer);
        }
        ArrayList arrayList2 = arrayList;
        PlanAddOnsCompanion planAddOnsCompanionIconCompatParcelizer2 = null;
        if (!z) {
            return null;
        }
        getLink getlinkAudioAttributesImplApi21Parcelizer = getmaincopy.AudioAttributesImplApi21Parcelizer();
        if (getlinkAudioAttributesImplApi21Parcelizer != null) {
            planAddOnsCompanionIconCompatParcelizer2 = setPlanAddOns.write(getlinkAudioAttributesImplApi21Parcelizer) ? IconCompatParcelizer(getlinkAudioAttributesImplApi21Parcelizer.MediaBrowserCompatMediaItem()) : getlinkAudioAttributesImplApi21Parcelizer;
        }
        return new getMainCopy(arrayList2).write(planAddOnsCompanionIconCompatParcelizer2);
    }
}
