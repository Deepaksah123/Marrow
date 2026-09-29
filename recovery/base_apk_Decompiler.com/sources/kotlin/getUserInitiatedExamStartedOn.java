package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.getZenArea;

/* JADX INFO: loaded from: classes4.dex */
public final class getUserInitiatedExamStartedOn {
    private static final getRelatedLessonId AudioAttributesCompatParcelizer;
    private static final getRelatedLessonId IconCompatParcelizer;
    private static final Map<getNotesCount, getNotesCount> RemoteActionCompatParcelizer;
    private static final getRelatedLessonId read;
    public static final getUserInitiatedExamStartedOn write = new getUserInitiatedExamStartedOn();

    private getUserInitiatedExamStartedOn() {
    }

    static {
        getRelatedLessonId getrelatedlessonidRemoteActionCompatParcelizer = getRelatedLessonId.RemoteActionCompatParcelizer("message");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidRemoteActionCompatParcelizer, "");
        read = getrelatedlessonidRemoteActionCompatParcelizer;
        getRelatedLessonId getrelatedlessonidRemoteActionCompatParcelizer2 = getRelatedLessonId.RemoteActionCompatParcelizer("allowedTargets");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidRemoteActionCompatParcelizer2, "");
        AudioAttributesCompatParcelizer = getrelatedlessonidRemoteActionCompatParcelizer2;
        getRelatedLessonId getrelatedlessonidRemoteActionCompatParcelizer3 = getRelatedLessonId.RemoteActionCompatParcelizer(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidRemoteActionCompatParcelizer3, "");
        IconCompatParcelizer = getrelatedlessonidRemoteActionCompatParcelizer3;
        RemoteActionCompatParcelizer = VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write(getZenArea.RemoteActionCompatParcelizer.setSessionImpl, getPsshData.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver), setAction.write(getZenArea.RemoteActionCompatParcelizer.onSkipToQueueItem, getPsshData.RatingCompat), setAction.write(getZenArea.RemoteActionCompatParcelizer.onPrepareFromSearch, getPsshData.AudioAttributesCompatParcelizer));
    }

    public static getRelatedLessonId AudioAttributesCompatParcelizer() {
        return read;
    }

    public static getRelatedLessonId read() {
        return AudioAttributesCompatParcelizer;
    }

    public static getRelatedLessonId IconCompatParcelizer() {
        return IconCompatParcelizer;
    }

    private static /* synthetic */ dummyEditor read(RecentUpdatesReferences recentUpdatesReferences, getFeaturedCards getfeaturedcards) {
        return read(recentUpdatesReferences, getfeaturedcards, false);
    }

    public static dummyEditor read(RecentUpdatesReferences recentUpdatesReferences, getFeaturedCards getfeaturedcards, boolean z) {
        toMagicModuleMetaRepoModel.write(recentUpdatesReferences, "");
        toMagicModuleMetaRepoModel.write(getfeaturedcards, "");
        RevisionSubjectStatusModel revisionSubjectStatusModelWrite = recentUpdatesReferences.write();
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(revisionSubjectStatusModelWrite, RevisionSubjectStatusModel.RemoteActionCompatParcelizer(getPsshData.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver))) {
            return new setInviteCode(recentUpdatesReferences, getfeaturedcards);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(revisionSubjectStatusModelWrite, RevisionSubjectStatusModel.RemoteActionCompatParcelizer(getPsshData.RatingCompat))) {
            return new setExpired(recentUpdatesReferences, getfeaturedcards);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(revisionSubjectStatusModelWrite, RevisionSubjectStatusModel.RemoteActionCompatParcelizer(getPsshData.AudioAttributesCompatParcelizer))) {
            return new getStartDateTime(getfeaturedcards, recentUpdatesReferences, getZenArea.RemoteActionCompatParcelizer.onPrepareFromSearch);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(revisionSubjectStatusModelWrite, RevisionSubjectStatusModel.RemoteActionCompatParcelizer(getPsshData.write))) {
            return null;
        }
        return new setMainModel(getfeaturedcards, recentUpdatesReferences, z);
    }

    public static dummyEditor AudioAttributesCompatParcelizer(getNotesCount getnotescount, HomeQbankModel homeQbankModel, getFeaturedCards getfeaturedcards) {
        RecentUpdatesReferences recentUpdatesReferencesWrite;
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        toMagicModuleMetaRepoModel.write(homeQbankModel, "");
        toMagicModuleMetaRepoModel.write(getfeaturedcards, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getnotescount, getZenArea.RemoteActionCompatParcelizer.MediaMetadataCompat)) {
            getNotesCount getnotescount2 = getPsshData.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescount2, "");
            RecentUpdatesReferences recentUpdatesReferencesWrite2 = homeQbankModel.write(getnotescount2);
            if (recentUpdatesReferencesWrite2 != null || homeQbankModel.IconCompatParcelizer()) {
                return new setExamDurationSeconds(recentUpdatesReferencesWrite2, getfeaturedcards);
            }
        }
        getNotesCount getnotescount3 = RemoteActionCompatParcelizer.get(getnotescount);
        if (getnotescount3 == null || (recentUpdatesReferencesWrite = homeQbankModel.write(getnotescount3)) == null) {
            return null;
        }
        return read(recentUpdatesReferencesWrite, getfeaturedcards);
    }
}
