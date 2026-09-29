package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class addPlan extends setDoNotConsider {
    private static getHref RemoteActionCompatParcelizer(getHref gethref) {
        getLink getlinkAudioAttributesCompatParcelizer;
        getPlanAddOns getplanaddonsAudioAttributesImplApi21Parcelizer = gethref.AudioAttributesImplApi21Parcelizer();
        getMainCopy getmaincopyWrite = null;
        planAddOnsCompanionMediaBrowserCompatMediaItem = null;
        PlanAddOnsCompanion planAddOnsCompanionMediaBrowserCompatMediaItem = null;
        if (getplanaddonsAudioAttributesImplApi21Parcelizer instanceof getAnswerCount) {
            getAnswerCount getanswercount = (getAnswerCount) getplanaddonsAudioAttributesImplApi21Parcelizer;
            setDefault setdefaultIconCompatParcelizer = getanswercount.IconCompatParcelizer();
            if (setdefaultIconCompatParcelizer.read() != getTotalSubject.IN_VARIANCE) {
                setdefaultIconCompatParcelizer = null;
            }
            if (setdefaultIconCompatParcelizer != null && (getlinkAudioAttributesCompatParcelizer = setdefaultIconCompatParcelizer.AudioAttributesCompatParcelizer()) != null) {
                planAddOnsCompanionMediaBrowserCompatMediaItem = getlinkAudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem();
            }
            PlanAddOnsCompanion planAddOnsCompanion = planAddOnsCompanionMediaBrowserCompatMediaItem;
            if (getanswercount.MediaBrowserCompatItemReceiver() == null) {
                setDefault setdefaultIconCompatParcelizer2 = getanswercount.IconCompatParcelizer();
                Collection<getLink> collectionAV_ = getanswercount.aV_();
                ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(collectionAV_, 10));
                Iterator<T> it = collectionAV_.iterator();
                while (it.hasNext()) {
                    arrayList.add(((getLink) it.next()).MediaBrowserCompatMediaItem());
                }
                getanswercount.RemoteActionCompatParcelizer(new getFirstEligiblePlan(setdefaultIconCompatParcelizer2, arrayList));
            }
            isQbank isqbank = isQbank.FOR_SUBTYPING;
            getFirstEligiblePlan getfirsteligibleplanMediaBrowserCompatItemReceiver = getanswercount.MediaBrowserCompatItemReceiver();
            toMagicModuleMetaRepoModel.write(getfirsteligibleplanMediaBrowserCompatItemReceiver);
            return new getDefaultPlan(isqbank, getfirsteligibleplanMediaBrowserCompatItemReceiver, planAddOnsCompanion, gethref.bc_(), gethref.ba_(), 32);
        }
        boolean z = false;
        if (getplanaddonsAudioAttributesImplApi21Parcelizer instanceof getPearlIds) {
            Collection<getLink> collectionAV_2 = ((getPearlIds) getplanaddonsAudioAttributesImplApi21Parcelizer).aV_();
            ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(collectionAV_2, 10));
            Iterator<T> it2 = collectionAV_2.iterator();
            while (it2.hasNext()) {
                getLink getlinkAudioAttributesCompatParcelizer2 = setPlanAddOns.AudioAttributesCompatParcelizer((getLink) it2.next(), gethref.ba_());
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getlinkAudioAttributesCompatParcelizer2, "");
                arrayList2.add(getlinkAudioAttributesCompatParcelizer2);
            }
            return AddOnMetaKt.RemoteActionCompatParcelizer(gethref.bc_(), new getMainCopy(arrayList2), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), false, gethref.read());
        }
        if (!(getplanaddonsAudioAttributesImplApi21Parcelizer instanceof getMainCopy) || !gethref.ba_()) {
            return gethref;
        }
        getMainCopy getmaincopy = (getMainCopy) getplanaddonsAudioAttributesImplApi21Parcelizer;
        Collection<getLink> collectionAV_3 = getmaincopy.aV_();
        ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(collectionAV_3, 10));
        Iterator<T> it3 = collectionAV_3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(getSearchTimes.MediaBrowserCompatMediaItem((getLink) it3.next()));
            z = true;
        }
        ArrayList arrayList4 = arrayList3;
        if (z) {
            getLink getlinkAudioAttributesImplApi21Parcelizer = getmaincopy.AudioAttributesImplApi21Parcelizer();
            getmaincopyWrite = new getMainCopy(arrayList4).write(getlinkAudioAttributesImplApi21Parcelizer != null ? getSearchTimes.MediaBrowserCompatMediaItem(getlinkAudioAttributesImplApi21Parcelizer) : null);
        }
        if (getmaincopyWrite != null) {
            getmaincopy = getmaincopyWrite;
        }
        return getmaincopy.MediaBrowserCompatItemReceiver();
    }

    @Override // kotlin.setDoNotConsider
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final PlanAddOnsCompanion IconCompatParcelizer(Preference preference) {
        getHref gethrefAudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(preference, "");
        if (!(preference instanceof getLink)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        PlanAddOnsCompanion planAddOnsCompanionMediaBrowserCompatMediaItem = ((getLink) preference).MediaBrowserCompatMediaItem();
        if (planAddOnsCompanionMediaBrowserCompatMediaItem instanceof getHref) {
            gethrefAudioAttributesCompatParcelizer = RemoteActionCompatParcelizer((getHref) planAddOnsCompanionMediaBrowserCompatMediaItem);
        } else if (planAddOnsCompanionMediaBrowserCompatMediaItem instanceof getTopicId) {
            getTopicId gettopicid = (getTopicId) planAddOnsCompanionMediaBrowserCompatMediaItem;
            getHref gethrefRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(gettopicid.AudioAttributesImplBaseParcelizer());
            getHref gethrefRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(gettopicid.AudioAttributesImplApi26Parcelizer());
            gethrefAudioAttributesCompatParcelizer = (gethrefRemoteActionCompatParcelizer == gettopicid.AudioAttributesImplBaseParcelizer() && gethrefRemoteActionCompatParcelizer2 == gettopicid.AudioAttributesImplApi26Parcelizer()) ? planAddOnsCompanionMediaBrowserCompatMediaItem : AddOnMetaKt.AudioAttributesCompatParcelizer(gethrefRemoteActionCompatParcelizer, gethrefRemoteActionCompatParcelizer2);
        } else {
            throw new RenewEligibleCreator();
        }
        return setPlanType.write(gethrefAudioAttributesCompatParcelizer, planAddOnsCompanionMediaBrowserCompatMediaItem, new read(this));
    }

    final /* synthetic */ class read extends MagicModuleRepoModelsKt implements getAnswerMap<Preference, PlanAddOnsCompanion> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public PlanAddOnsCompanion invoke(Preference preference) {
            toMagicModuleMetaRepoModel.write(preference, "");
            return ((addPlan) this.AudioAttributesImplApi26Parcelizer).IconCompatParcelizer(preference);
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA, kotlin.isKycAuditIncomplete
        public final String MediaBrowserCompatCustomActionResultReceiver() {
            return "prepareType";
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
        public final isAuthError MediaDescriptionCompat() {
            return toMagicModuleMetaDataUcModel.write(addPlan.class);
        }

        read(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
        public final String MediaBrowserCompatMediaItem() {
            return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
        }
    }

    public static final class write extends addPlan {
        public static final write write = new write();

        private write() {
        }
    }
}
