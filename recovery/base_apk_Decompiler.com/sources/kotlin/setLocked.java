package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.getActiveEdition;
import kotlin.getCheapestPlan;
import kotlin.getMediaRestrictions;

/* JADX INFO: loaded from: classes4.dex */
public final class setLocked {
    static {
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getRelatedLessonId.RemoteActionCompatParcelizer(AppMeasurementSdk.ConditionalUserProperty.VALUE), "");
    }

    public static final getSlidesCount read(getVariant getvariant) {
        toMagicModuleMetaRepoModel.write(getvariant, "");
        getSlidesCount getslidescountRemoteActionCompatParcelizer = getAnswerDescription.RemoteActionCompatParcelizer(getvariant);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getslidescountRemoteActionCompatParcelizer, "");
        return getslidescountRemoteActionCompatParcelizer;
    }

    public static final getNotesCount write(getVariant getvariant) {
        toMagicModuleMetaRepoModel.write(getvariant, "");
        getNotesCount getnotescount = getAnswerDescription.read(getvariant);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescount, "");
        return getnotescount;
    }

    public static final getTopSection IconCompatParcelizer(getVariant getvariant) {
        toMagicModuleMetaRepoModel.write(getvariant, "");
        getTopSection gettopsectionAudioAttributesCompatParcelizer = getAnswerDescription.AudioAttributesCompatParcelizer(getvariant);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gettopsectionAudioAttributesCompatParcelizer, "");
        return gettopsectionAudioAttributesCompatParcelizer;
    }

    public static final CourseConfigV2CustomModuleQuestionSource AudioAttributesCompatParcelizer(getTopSection gettopsection, getNotesCount getnotescount, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        getnotescount.read();
        getNotesCount getnotescountAudioAttributesCompatParcelizer = getnotescount.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescountAudioAttributesCompatParcelizer, "");
        setTags settagsIconCompatParcelizer = gettopsection.RemoteActionCompatParcelizer(getnotescountAudioAttributesCompatParcelizer).IconCompatParcelizer();
        getRelatedLessonId getrelatedlessonidIconCompatParcelizer = getnotescount.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidIconCompatParcelizer, "");
        getQuestionLimit getquestionlimitAudioAttributesCompatParcelizer = settagsIconCompatParcelizer.AudioAttributesCompatParcelizer(getrelatedlessonidIconCompatParcelizer, gettimestamp);
        if (getquestionlimitAudioAttributesCompatParcelizer instanceof CourseConfigV2CustomModuleQuestionSource) {
            return (CourseConfigV2CustomModuleQuestionSource) getquestionlimitAudioAttributesCompatParcelizer;
        }
        return null;
    }

    public static final RevisionSubjectStatusModel read(getQuestionLimit getquestionlimit) {
        getVariant getvariantAudioAttributesImplApi21Parcelizer;
        RevisionSubjectStatusModel revisionSubjectStatusModel;
        if (getquestionlimit == null || (getvariantAudioAttributesImplApi21Parcelizer = getquestionlimit.AudioAttributesImplApi21Parcelizer()) == null) {
            return null;
        }
        if (getvariantAudioAttributesImplApi21Parcelizer instanceof getShouldShowEmptyPlanScreen) {
            return new RevisionSubjectStatusModel(((getShouldShowEmptyPlanScreen) getvariantAudioAttributesImplApi21Parcelizer).IconCompatParcelizer(), getquestionlimit.aQ_());
        }
        if (!(getvariantAudioAttributesImplApi21Parcelizer instanceof getBadge) || (revisionSubjectStatusModel = read((getQuestionLimit) getvariantAudioAttributesImplApi21Parcelizer)) == null) {
            return null;
        }
        return revisionSubjectStatusModel.read(getquestionlimit.aQ_());
    }

    public static final CourseConfigV2CustomModuleQuestionSource IconCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
        for (getLink getlink : courseConfigV2CustomModuleQuestionSource.aP_().AudioAttributesImplApi21Parcelizer().aV_()) {
            if (!getTestTabItems.write(getlink)) {
                getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getlink.AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
                if (getAnswerDescription.MediaBrowserCompatCustomActionResultReceiver(getquestionlimitRemoteActionCompatParcelizer)) {
                    toMagicModuleMetaRepoModel.read(getquestionlimitRemoteActionCompatParcelizer, "");
                    return (CourseConfigV2CustomModuleQuestionSource) getquestionlimitRemoteActionCompatParcelizer;
                }
            }
        }
        return null;
    }

    public static final getTestTabItems AudioAttributesCompatParcelizer(getVariant getvariant) {
        toMagicModuleMetaRepoModel.write(getvariant, "");
        return IconCompatParcelizer(getvariant).write();
    }

    public static final boolean AudioAttributesCompatParcelizer(getMeta getmeta) {
        toMagicModuleMetaRepoModel.write(getmeta, "");
        Boolean boolAudioAttributesCompatParcelizer = getActiveEdition.AudioAttributesCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(getmeta), setMagicLine.AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer.write);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(boolAudioAttributesCompatParcelizer, "");
        return boolAudioAttributesCompatParcelizer.booleanValue();
    }

    final /* synthetic */ class RemoteActionCompatParcelizer extends MagicModuleRepoModelsKt implements getAnswerMap<getMeta, Boolean> {
        public static final RemoteActionCompatParcelizer write = new RemoteActionCompatParcelizer();

        private static Boolean IconCompatParcelizer(getMeta getmeta) {
            toMagicModuleMetaRepoModel.write(getmeta, "");
            return Boolean.valueOf(getmeta.IconCompatParcelizer());
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA, kotlin.isKycAuditIncomplete
        public final String MediaBrowserCompatCustomActionResultReceiver() {
            return "declaresDefaultValue";
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
        public final isAuthError MediaDescriptionCompat() {
            return toMagicModuleMetaDataUcModel.write(getMeta.class);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Boolean invoke(getMeta getmeta) {
            return IconCompatParcelizer(getmeta);
        }

        RemoteActionCompatParcelizer() {
            super(1);
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
        public final String MediaBrowserCompatMediaItem() {
            return "declaresDefaultValue()Z";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable RemoteActionCompatParcelizer(getMeta getmeta) {
        Collection<getMeta> collectionAudioAttributesImplApi26Parcelizer = getmeta.AudioAttributesImplApi26Parcelizer();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(collectionAudioAttributesImplApi26Parcelizer, 10));
        Iterator<T> it = collectionAudioAttributesImplApi26Parcelizer.iterator();
        while (it.hasNext()) {
            arrayList.add(((getMeta) it.next()).onAddQueueItem());
        }
        return arrayList;
    }

    static final class write extends MagicModuleUseCase implements getAnswerMap<getVariant, getVariant> {
        public static final write RemoteActionCompatParcelizer = new write();

        private static getVariant write(getVariant getvariant) {
            toMagicModuleMetaRepoModel.write(getvariant, "");
            return getvariant.AudioAttributesImplApi21Parcelizer();
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getVariant invoke(getVariant getvariant) {
            return write(getvariant);
        }

        write() {
            super(1);
        }
    }

    private static getTopRankers<getVariant> AudioAttributesImplApi26Parcelizer(getVariant getvariant) {
        toMagicModuleMetaRepoModel.write(getvariant, "");
        return StateResult.RemoteActionCompatParcelizer(getvariant, write.RemoteActionCompatParcelizer);
    }

    public static final getTopRankers<getVariant> AudioAttributesImplApi21Parcelizer(getVariant getvariant) {
        toMagicModuleMetaRepoModel.write(getvariant, "");
        return StateResult.RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer(getvariant), 1);
    }

    public static final getTestHeaderTitle AudioAttributesCompatParcelizer(getTestHeaderTitle gettestheadertitle) {
        toMagicModuleMetaRepoModel.write(gettestheadertitle, "");
        if (!(gettestheadertitle instanceof getAllSettings)) {
            return gettestheadertitle;
        }
        CourseConfigV2SettingsItems courseConfigV2SettingsItemsMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = ((getAllSettings) gettestheadertitle).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2SettingsItemsMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, "");
        return courseConfigV2SettingsItemsMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public static final getNotesCount RemoteActionCompatParcelizer(getVariant getvariant) {
        toMagicModuleMetaRepoModel.write(getvariant, "");
        getSlidesCount getslidescount = read(getvariant);
        if (!getslidescount.read()) {
            getslidescount = null;
        }
        if (getslidescount != null) {
            return getslidescount.MediaBrowserCompatItemReceiver();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static getTestHeaderTitle RemoteActionCompatParcelizer(getTestHeaderTitle gettestheadertitle, boolean z, getAnswerMap<? super getTestHeaderTitle, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(gettestheadertitle, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        return (getTestHeaderTitle) getActiveEdition.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(gettestheadertitle), new setDisplayId(false), new IconCompatParcelizer(new MagicModuleUseCaseImplWhenMappings.write(), getanswermap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable AudioAttributesCompatParcelizer(boolean z, getTestHeaderTitle gettestheadertitle) {
        if (z) {
            gettestheadertitle = gettestheadertitle != null ? gettestheadertitle.onPrepareFromMediaId() : null;
        }
        Collection<? extends getTestHeaderTitle> collectionAudioAttributesImplApi26Parcelizer = gettestheadertitle != null ? gettestheadertitle.AudioAttributesImplApi26Parcelizer() : null;
        return collectionAudioAttributesImplApi26Parcelizer == null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : collectionAudioAttributesImplApi26Parcelizer;
    }

    public static final class IconCompatParcelizer extends getActiveEdition.AudioAttributesCompatParcelizer<getTestHeaderTitle, getTestHeaderTitle> {
        private /* synthetic */ MagicModuleUseCaseImplWhenMappings.write<getTestHeaderTitle> IconCompatParcelizer;
        private /* synthetic */ getAnswerMap<getTestHeaderTitle, Boolean> RemoteActionCompatParcelizer;

        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(MagicModuleUseCaseImplWhenMappings.write<getTestHeaderTitle> writeVar, getAnswerMap<? super getTestHeaderTitle, Boolean> getanswermap) {
            this.IconCompatParcelizer = writeVar;
            this.RemoteActionCompatParcelizer = getanswermap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.getActiveEdition.AudioAttributesCompatParcelizer, o.getActiveEdition.RemoteActionCompatParcelizer
        public boolean IconCompatParcelizer(getTestHeaderTitle gettestheadertitle) {
            toMagicModuleMetaRepoModel.write(gettestheadertitle, "");
            return this.IconCompatParcelizer.write == null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.getActiveEdition.AudioAttributesCompatParcelizer, o.getActiveEdition.RemoteActionCompatParcelizer
        public void RemoteActionCompatParcelizer(getTestHeaderTitle gettestheadertitle) {
            toMagicModuleMetaRepoModel.write(gettestheadertitle, "");
            if (this.IconCompatParcelizer.write == null && this.RemoteActionCompatParcelizer.invoke(gettestheadertitle).booleanValue()) {
                this.IconCompatParcelizer.write = gettestheadertitle;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.getActiveEdition.RemoteActionCompatParcelizer
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public getTestHeaderTitle write() {
            return this.IconCompatParcelizer.write;
        }
    }

    public static final CourseConfigV2CustomModuleQuestionSource RemoteActionCompatParcelizer(dummyEditor dummyeditor) {
        toMagicModuleMetaRepoModel.write(dummyeditor, "");
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = dummyeditor.RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
        if (getquestionlimitRemoteActionCompatParcelizer instanceof CourseConfigV2CustomModuleQuestionSource) {
            return (CourseConfigV2CustomModuleQuestionSource) getquestionlimitRemoteActionCompatParcelizer;
        }
        return null;
    }

    public static final getCheapestPlan write(getTopSection gettopsection) {
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        PlanGroupDescriptionModelKt planGroupDescriptionModelKt = (PlanGroupDescriptionModelKt) gettopsection.AudioAttributesCompatParcelizer(getPlan.IconCompatParcelizer());
        getMediaRestrictions getmediarestrictions = planGroupDescriptionModelKt != null ? (getMediaRestrictions) planGroupDescriptionModelKt.RemoteActionCompatParcelizer() : null;
        return getmediarestrictions instanceof getMediaRestrictions.AudioAttributesCompatParcelizer ? ((getMediaRestrictions.AudioAttributesCompatParcelizer) getmediarestrictions).IconCompatParcelizer() : getCheapestPlan.read.write;
    }

    public static final boolean IconCompatParcelizer(getTopSection gettopsection) {
        getMediaRestrictions getmediarestrictions;
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        PlanGroupDescriptionModelKt planGroupDescriptionModelKt = (PlanGroupDescriptionModelKt) gettopsection.AudioAttributesCompatParcelizer(getPlan.IconCompatParcelizer());
        return (planGroupDescriptionModelKt == null || (getmediarestrictions = (getMediaRestrictions) planGroupDescriptionModelKt.RemoteActionCompatParcelizer()) == null || !getmediarestrictions.RemoteActionCompatParcelizer()) ? false : true;
    }

    public static final CourseConfigV2NavDrawerItemMarrowNotes<getHref> AudioAttributesCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        CourseConfigV2ZenAreaItem<getHref> courseConfigV2ZenAreaItemMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = courseConfigV2CustomModuleQuestionSource != null ? courseConfigV2CustomModuleQuestionSource.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() : null;
        if (courseConfigV2ZenAreaItemMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver instanceof CourseConfigV2NavDrawerItemMarrowNotes) {
            return (CourseConfigV2NavDrawerItemMarrowNotes) courseConfigV2ZenAreaItemMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }
        return null;
    }
}
