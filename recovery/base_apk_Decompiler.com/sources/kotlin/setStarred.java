package kotlin;

import java.util.Collection;
import kotlin.getCheapestPlan;
import kotlin.getOptions;
import kotlin.getTestHeaderTitle;

/* JADX INFO: loaded from: classes4.dex */
public final class setStarred {
    public static final setStarred AudioAttributesCompatParcelizer = new setStarred();

    private setStarred() {
    }

    private static /* synthetic */ boolean read(setStarred setstarred, getVariant getvariant, getVariant getvariant2, boolean z) {
        return setstarred.IconCompatParcelizer(getvariant, getvariant2, z, true);
    }

    public final boolean IconCompatParcelizer(getVariant getvariant, getVariant getvariant2, boolean z, boolean z2) {
        if ((getvariant instanceof CourseConfigV2CustomModuleQuestionSource) && (getvariant2 instanceof CourseConfigV2CustomModuleQuestionSource)) {
            return RemoteActionCompatParcelizer((CourseConfigV2CustomModuleQuestionSource) getvariant, (CourseConfigV2CustomModuleQuestionSource) getvariant2);
        }
        if ((getvariant instanceof getBadgeText) && (getvariant2 instanceof getBadgeText)) {
            return RemoteActionCompatParcelizer(this, (getBadgeText) getvariant, (getBadgeText) getvariant2, z);
        }
        if ((getvariant instanceof getVideoPageNotesTitle) && (getvariant2 instanceof getVideoPageNotesTitle)) {
            return IconCompatParcelizer(this, (getVideoPageNotesTitle) getvariant, (getVideoPageNotesTitle) getvariant2, z, true, (getCheapestPlan) getCheapestPlan.read.write);
        }
        return ((getvariant instanceof getShouldShowEmptyPlanScreen) && (getvariant2 instanceof getShouldShowEmptyPlanScreen)) ? toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((getShouldShowEmptyPlanScreen) getvariant).IconCompatParcelizer(), ((getShouldShowEmptyPlanScreen) getvariant2).IconCompatParcelizer()) : toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getvariant, getvariant2);
    }

    private static boolean RemoteActionCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource2) {
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(courseConfigV2CustomModuleQuestionSource.MediaBrowserCompatSearchResultReceiver(), courseConfigV2CustomModuleQuestionSource2.MediaBrowserCompatSearchResultReceiver());
    }

    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<getVariant, getVariant, Boolean> {
        public static final RemoteActionCompatParcelizer read = new RemoteActionCompatParcelizer();

        private static Boolean IconCompatParcelizer() {
            return Boolean.FALSE;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ Boolean invoke(getVariant getvariant, getVariant getvariant2) {
            return IconCompatParcelizer();
        }

        RemoteActionCompatParcelizer() {
            super(2);
        }
    }

    private static /* synthetic */ boolean RemoteActionCompatParcelizer(setStarred setstarred, getBadgeText getbadgetext, getBadgeText getbadgetext2, boolean z) {
        return setstarred.AudioAttributesCompatParcelizer(getbadgetext, getbadgetext2, z, RemoteActionCompatParcelizer.read);
    }

    private boolean AudioAttributesCompatParcelizer(getBadgeText getbadgetext, getBadgeText getbadgetext2, boolean z, MagicModuleSubmissionRequestBody<? super getVariant, ? super getVariant, Boolean> magicModuleSubmissionRequestBody) {
        toMagicModuleMetaRepoModel.write(getbadgetext, "");
        toMagicModuleMetaRepoModel.write(getbadgetext2, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getbadgetext, getbadgetext2)) {
            return true;
        }
        return !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getbadgetext.AudioAttributesImplApi21Parcelizer(), getbadgetext2.AudioAttributesImplApi21Parcelizer()) && IconCompatParcelizer(getbadgetext, getbadgetext2, magicModuleSubmissionRequestBody, z) && getbadgetext.write() == getbadgetext2.write();
    }

    private static getIntroDurationSeconds IconCompatParcelizer(getVideoPageNotesTitle getvideopagenotestitle) {
        while (getvideopagenotestitle instanceof getTestHeaderTitle) {
            getTestHeaderTitle gettestheadertitle = (getTestHeaderTitle) getvideopagenotestitle;
            if (gettestheadertitle.handleMediaPlayPauseIfPendingOnHandler() != getTestHeaderTitle.RemoteActionCompatParcelizer.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends getTestHeaderTitle> collectionAudioAttributesImplApi26Parcelizer = gettestheadertitle.AudioAttributesImplApi26Parcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(collectionAudioAttributesImplApi26Parcelizer, "");
            getTestHeaderTitle gettestheadertitle2 = (getTestHeaderTitle) IntermediateLoginResponseBody.onCommand(collectionAudioAttributesImplApi26Parcelizer);
            if (gettestheadertitle2 == null) {
                return null;
            }
            getvideopagenotestitle = gettestheadertitle2;
        }
        return getvideopagenotestitle.RatingCompat();
    }

    private static /* synthetic */ boolean IconCompatParcelizer(setStarred setstarred, getVideoPageNotesTitle getvideopagenotestitle, getVideoPageNotesTitle getvideopagenotestitle2, boolean z, boolean z2, getCheapestPlan getcheapestplan) {
        return setstarred.IconCompatParcelizer(getvideopagenotestitle, getvideopagenotestitle2, z, z2, false, getcheapestplan);
    }

    private boolean IconCompatParcelizer(getVideoPageNotesTitle getvideopagenotestitle, getVideoPageNotesTitle getvideopagenotestitle2, boolean z, boolean z2, boolean z3, getCheapestPlan getcheapestplan) {
        toMagicModuleMetaRepoModel.write(getvideopagenotestitle, "");
        toMagicModuleMetaRepoModel.write(getvideopagenotestitle2, "");
        toMagicModuleMetaRepoModel.write(getcheapestplan, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getvideopagenotestitle, getvideopagenotestitle2)) {
            return true;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getvideopagenotestitle.aQ_(), getvideopagenotestitle2.aQ_())) {
            return false;
        }
        if (z2 && (getvideopagenotestitle instanceof CourseConfigV2NavDrawerItemYourCourse) && (getvideopagenotestitle2 instanceof CourseConfigV2NavDrawerItemYourCourse) && ((CourseConfigV2NavDrawerItemYourCourse) getvideopagenotestitle).onPause() != ((CourseConfigV2NavDrawerItemYourCourse) getvideopagenotestitle2).onPause()) {
            return false;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getvideopagenotestitle.AudioAttributesImplApi21Parcelizer(), getvideopagenotestitle2.AudioAttributesImplApi21Parcelizer()) && (!z || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(IconCompatParcelizer(getvideopagenotestitle), IconCompatParcelizer(getvideopagenotestitle2)))) {
            return false;
        }
        getVideoPageNotesTitle getvideopagenotestitle3 = getvideopagenotestitle;
        if (!getAnswerDescription.MediaDescriptionCompat(getvideopagenotestitle3)) {
            getVideoPageNotesTitle getvideopagenotestitle4 = getvideopagenotestitle2;
            if (getAnswerDescription.MediaDescriptionCompat(getvideopagenotestitle4) || !IconCompatParcelizer(getvideopagenotestitle3, getvideopagenotestitle4, AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer, z)) {
                return false;
            }
            getOptions getoptionsRemoteActionCompatParcelizer = getOptions.RemoteActionCompatParcelizer(getcheapestplan, new getOption1(z, getvideopagenotestitle, getvideopagenotestitle2));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getoptionsRemoteActionCompatParcelizer, "");
            if (getoptionsRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(getvideopagenotestitle, getvideopagenotestitle2, (CourseConfigV2CustomModuleQuestionSource) null, true).IconCompatParcelizer() == getOptions.RemoteActionCompatParcelizer.IconCompatParcelizer.OVERRIDABLE && getoptionsRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(getvideopagenotestitle2, getvideopagenotestitle, (CourseConfigV2CustomModuleQuestionSource) null, true).IconCompatParcelizer() == getOptions.RemoteActionCompatParcelizer.IconCompatParcelizer.OVERRIDABLE) {
                return true;
            }
        }
        return false;
    }

    static final class AudioAttributesCompatParcelizer extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<getVariant, getVariant, Boolean> {
        public static final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer = new AudioAttributesCompatParcelizer();

        private static Boolean AudioAttributesCompatParcelizer() {
            return Boolean.FALSE;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ Boolean invoke(getVariant getvariant, getVariant getvariant2) {
            return AudioAttributesCompatParcelizer();
        }

        AudioAttributesCompatParcelizer() {
            super(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean read(boolean z, getVideoPageNotesTitle getvideopagenotestitle, getVideoPageNotesTitle getvideopagenotestitle2, getPlanAddOns getplanaddons, getPlanAddOns getplanaddons2) {
        toMagicModuleMetaRepoModel.write(getvideopagenotestitle, "");
        toMagicModuleMetaRepoModel.write(getvideopagenotestitle2, "");
        toMagicModuleMetaRepoModel.write(getplanaddons, "");
        toMagicModuleMetaRepoModel.write(getplanaddons2, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getplanaddons, getplanaddons2)) {
            return true;
        }
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = getplanaddons.RemoteActionCompatParcelizer();
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer2 = getplanaddons2.RemoteActionCompatParcelizer();
        if ((getquestionlimitRemoteActionCompatParcelizer instanceof getBadgeText) && (getquestionlimitRemoteActionCompatParcelizer2 instanceof getBadgeText)) {
            return AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer((getBadgeText) getquestionlimitRemoteActionCompatParcelizer, (getBadgeText) getquestionlimitRemoteActionCompatParcelizer2, z, new IconCompatParcelizer(getvideopagenotestitle, getvideopagenotestitle2));
        }
        return false;
    }

    static final class IconCompatParcelizer extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<getVariant, getVariant, Boolean> {
        private /* synthetic */ getVideoPageNotesTitle read;
        private /* synthetic */ getVideoPageNotesTitle write;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(getVariant getvariant, getVariant getvariant2) {
            return Boolean.valueOf(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getvariant, this.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getvariant2, this.read));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(getVideoPageNotesTitle getvideopagenotestitle, getVideoPageNotesTitle getvideopagenotestitle2) {
            super(2);
            this.write = getvideopagenotestitle;
            this.read = getvideopagenotestitle2;
        }
    }

    private final boolean IconCompatParcelizer(getVariant getvariant, getVariant getvariant2, MagicModuleSubmissionRequestBody<? super getVariant, ? super getVariant, Boolean> magicModuleSubmissionRequestBody, boolean z) {
        getVariant getvariantAudioAttributesImplApi21Parcelizer = getvariant.AudioAttributesImplApi21Parcelizer();
        getVariant getvariantAudioAttributesImplApi21Parcelizer2 = getvariant2.AudioAttributesImplApi21Parcelizer();
        if ((getvariantAudioAttributesImplApi21Parcelizer instanceof getTestHeaderTitle) || (getvariantAudioAttributesImplApi21Parcelizer2 instanceof getTestHeaderTitle)) {
            return magicModuleSubmissionRequestBody.invoke(getvariantAudioAttributesImplApi21Parcelizer, getvariantAudioAttributesImplApi21Parcelizer2).booleanValue();
        }
        return read(this, getvariantAudioAttributesImplApi21Parcelizer, getvariantAudioAttributesImplApi21Parcelizer2, z);
    }

    public final boolean read(getBadgeText getbadgetext, getBadgeText getbadgetext2) {
        toMagicModuleMetaRepoModel.write(getbadgetext, "");
        toMagicModuleMetaRepoModel.write(getbadgetext2, "");
        return RemoteActionCompatParcelizer(this, getbadgetext, getbadgetext2, true);
    }
}
