package kotlin;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class getPopup {
    public static final getPopup IconCompatParcelizer = new getPopup();

    private getPopup() {
    }

    public final Collection<CourseConfigV2CustomModuleQuestionSource> RemoteActionCompatParcelizer(getNotesCount getnotescount, getTestTabItems gettesttabitems) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        toMagicModuleMetaRepoModel.write(gettesttabitems, "");
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceWrite = write(getnotescount, gettesttabitems);
        if (courseConfigV2CustomModuleQuestionSourceWrite == null) {
            return getKycMessage.read();
        }
        CourseConfigV2AnnouncementBanner courseConfigV2AnnouncementBanner = CourseConfigV2AnnouncementBanner.write;
        getNotesCount getnotescountWrite = CourseConfigV2AnnouncementBanner.write(setLocked.read((getVariant) courseConfigV2CustomModuleQuestionSourceWrite));
        if (getnotescountWrite == null) {
            return getKycMessage.read(courseConfigV2CustomModuleQuestionSourceWrite);
        }
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer = gettesttabitems.AudioAttributesCompatParcelizer(getnotescountWrite);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer, "");
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new CourseConfigV2CustomModuleQuestionSource[]{courseConfigV2CustomModuleQuestionSourceWrite, courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer});
    }

    public static /* synthetic */ CourseConfigV2CustomModuleQuestionSource write(getNotesCount getnotescount, getTestTabItems gettesttabitems) {
        return AudioAttributesCompatParcelizer(getnotescount, gettesttabitems, null);
    }

    private static CourseConfigV2CustomModuleQuestionSource AudioAttributesCompatParcelizer(getNotesCount getnotescount, getTestTabItems gettesttabitems, Integer num) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        toMagicModuleMetaRepoModel.write(gettesttabitems, "");
        CourseConfigV2AnnouncementBanner courseConfigV2AnnouncementBanner = CourseConfigV2AnnouncementBanner.write;
        RevisionSubjectStatusModel revisionSubjectStatusModelWrite = CourseConfigV2AnnouncementBanner.write(getnotescount);
        if (revisionSubjectStatusModelWrite != null) {
            return gettesttabitems.AudioAttributesCompatParcelizer(revisionSubjectStatusModelWrite.AudioAttributesCompatParcelizer());
        }
        return null;
    }

    public static boolean RemoteActionCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
        CourseConfigV2AnnouncementBanner courseConfigV2AnnouncementBanner = CourseConfigV2AnnouncementBanner.write;
        return CourseConfigV2AnnouncementBanner.RemoteActionCompatParcelizer(getAnswerDescription.RemoteActionCompatParcelizer((getVariant) courseConfigV2CustomModuleQuestionSource));
    }

    public static boolean read(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
        CourseConfigV2AnnouncementBanner courseConfigV2AnnouncementBanner = CourseConfigV2AnnouncementBanner.write;
        return CourseConfigV2AnnouncementBanner.AudioAttributesCompatParcelizer(getAnswerDescription.RemoteActionCompatParcelizer((getVariant) courseConfigV2CustomModuleQuestionSource));
    }

    public static CourseConfigV2CustomModuleQuestionSource write(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource2 = courseConfigV2CustomModuleQuestionSource;
        getSlidesCount getslidescountRemoteActionCompatParcelizer = getAnswerDescription.RemoteActionCompatParcelizer((getVariant) courseConfigV2CustomModuleQuestionSource2);
        CourseConfigV2AnnouncementBanner courseConfigV2AnnouncementBanner = CourseConfigV2AnnouncementBanner.write;
        getNotesCount getnotescount = CourseConfigV2AnnouncementBanner.read(getslidescountRemoteActionCompatParcelizer);
        if (getnotescount == null) {
            StringBuilder sb = new StringBuilder("Given class ");
            sb.append(courseConfigV2CustomModuleQuestionSource);
            sb.append(" is not a mutable collection");
            throw new IllegalArgumentException(sb.toString());
        }
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer = setLocked.AudioAttributesCompatParcelizer((getVariant) courseConfigV2CustomModuleQuestionSource2).AudioAttributesCompatParcelizer(getnotescount);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer, "");
        return courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer;
    }

    public static CourseConfigV2CustomModuleQuestionSource AudioAttributesCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource2 = courseConfigV2CustomModuleQuestionSource;
        getSlidesCount getslidescountRemoteActionCompatParcelizer = getAnswerDescription.RemoteActionCompatParcelizer((getVariant) courseConfigV2CustomModuleQuestionSource2);
        CourseConfigV2AnnouncementBanner courseConfigV2AnnouncementBanner = CourseConfigV2AnnouncementBanner.write;
        getNotesCount getnotescountWrite = CourseConfigV2AnnouncementBanner.write(getslidescountRemoteActionCompatParcelizer);
        if (getnotescountWrite == null) {
            StringBuilder sb = new StringBuilder("Given class ");
            sb.append(courseConfigV2CustomModuleQuestionSource);
            sb.append(" is not a read-only collection");
            throw new IllegalArgumentException(sb.toString());
        }
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer = setLocked.AudioAttributesCompatParcelizer((getVariant) courseConfigV2CustomModuleQuestionSource2).AudioAttributesCompatParcelizer(getnotescountWrite);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer, "");
        return courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer;
    }
}
