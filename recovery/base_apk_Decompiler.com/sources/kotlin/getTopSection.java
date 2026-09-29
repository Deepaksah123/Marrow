package kotlin;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface getTopSection extends getVariant {
    <T> T AudioAttributesCompatParcelizer(getBottomSection<T> getbottomsection);

    Collection<getNotesCount> IconCompatParcelizer(getNotesCount getnotescount, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap);

    List<getTopSection> IconCompatParcelizer();

    CourseConfigV2SearchItem RemoteActionCompatParcelizer(getNotesCount getnotescount);

    boolean read(getTopSection gettopsection);

    getTestTabItems write();

    public static final class write {
        public static <R, D> R read(getTopSection gettopsection, CourseConfigV2NavDrawerItemAddVideo<R, D> courseConfigV2NavDrawerItemAddVideo, D d) {
            toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemAddVideo, "");
            return courseConfigV2NavDrawerItemAddVideo.AudioAttributesCompatParcelizer(gettopsection, d);
        }
    }
}
