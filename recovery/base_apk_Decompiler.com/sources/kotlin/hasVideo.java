package kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.CourseConfigV2AnnouncementBanner;

/* JADX INFO: loaded from: classes4.dex */
public final class hasVideo {
    public static final <T> T write(getLastAttemptedTimeMs<T> getlastattemptedtimems, T t, boolean z) {
        toMagicModuleMetaRepoModel.write(getlastattemptedtimems, "");
        toMagicModuleMetaRepoModel.write(t, "");
        return z ? getlastattemptedtimems.write(t) : t;
    }

    public static final <T> T AudioAttributesCompatParcelizer(setGroupDescription setgroupdescription, Preference preference, getLastAttemptedTimeMs<T> getlastattemptedtimems, isDontConsider isdontconsider) {
        RevisionSubjectStatusModel revisionSubjectStatusModelIconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(setgroupdescription, "");
        toMagicModuleMetaRepoModel.write(preference, "");
        toMagicModuleMetaRepoModel.write(getlastattemptedtimems, "");
        toMagicModuleMetaRepoModel.write(isdontconsider, "");
        isPermanent ispermanentOnCustomAction = setgroupdescription.onCustomAction(preference);
        if (!setgroupdescription.AudioAttributesImplBaseParcelizer(ispermanentOnCustomAction)) {
            return null;
        }
        getShowNotesWatermark getshownoteswatermarkAudioAttributesCompatParcelizer = setgroupdescription.AudioAttributesCompatParcelizer(ispermanentOnCustomAction);
        if (getshownoteswatermarkAudioAttributesCompatParcelizer != null) {
            return (T) write(getlastattemptedtimems, getlastattemptedtimems.AudioAttributesCompatParcelizer(getshownoteswatermarkAudioAttributesCompatParcelizer), setgroupdescription.RatingCompat(preference) || LessonIndex.RemoteActionCompatParcelizer(setgroupdescription, preference));
        }
        getShowNotesWatermark getshownoteswatermarkRemoteActionCompatParcelizer = setgroupdescription.RemoteActionCompatParcelizer(ispermanentOnCustomAction);
        if (getshownoteswatermarkRemoteActionCompatParcelizer != null) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(setOption2AnsweredCount.AudioAttributesCompatParcelizer(getshownoteswatermarkRemoteActionCompatParcelizer).AudioAttributesCompatParcelizer());
            return getlastattemptedtimems.write(sb.toString());
        }
        if (setgroupdescription.MediaMetadataCompat(ispermanentOnCustomAction)) {
            getSlidesCount getslidescountWrite = setgroupdescription.write(ispermanentOnCustomAction);
            if (getslidescountWrite != null) {
                CourseConfigV2AnnouncementBanner courseConfigV2AnnouncementBanner = CourseConfigV2AnnouncementBanner.write;
                revisionSubjectStatusModelIconCompatParcelizer = CourseConfigV2AnnouncementBanner.IconCompatParcelizer(getslidescountWrite);
            } else {
                revisionSubjectStatusModelIconCompatParcelizer = null;
            }
            if (revisionSubjectStatusModelIconCompatParcelizer != null) {
                if (!isdontconsider.IconCompatParcelizer()) {
                    CourseConfigV2AnnouncementBanner courseConfigV2AnnouncementBanner2 = CourseConfigV2AnnouncementBanner.write;
                    List<CourseConfigV2AnnouncementBanner.IconCompatParcelizer> list = CourseConfigV2AnnouncementBanner.read();
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((CourseConfigV2AnnouncementBanner.IconCompatParcelizer) it.next()).read(), revisionSubjectStatusModelIconCompatParcelizer)) {
                                return null;
                            }
                        }
                    }
                }
                String strAudioAttributesCompatParcelizer = setMcqType.RemoteActionCompatParcelizer(revisionSubjectStatusModelIconCompatParcelizer).AudioAttributesCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
                return getlastattemptedtimems.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer);
            }
        }
        return null;
    }
}
