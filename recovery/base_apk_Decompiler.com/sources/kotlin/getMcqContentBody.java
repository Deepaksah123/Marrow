package kotlin;

import java.util.Collection;
import kotlin.setTags;

/* JADX INFO: loaded from: classes4.dex */
public interface getMcqContentBody {
    getQuestionLimit AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp);

    void RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp);

    Collection<? extends CourseConfigV2NavDrawerItemRateUs> read(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp);

    Collection<getVariant> read(setOption6AnsweredCount setoption6answeredcount, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap);

    public static final class IconCompatParcelizer {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Collection RemoteActionCompatParcelizer(getMcqContentBody getmcqcontentbody, setOption6AnsweredCount setoption6answeredcount, getAnswerMap getanswermap, int i) {
            if ((i & 1) != 0) {
                setoption6answeredcount = setOption6AnsweredCount.write;
            }
            if ((i & 2) != 0) {
                setTags.RemoteActionCompatParcelizer remoteActionCompatParcelizer = setTags.read;
                getanswermap = setTags.RemoteActionCompatParcelizer.write();
            }
            return getmcqcontentbody.read(setoption6answeredcount, (getAnswerMap<? super getRelatedLessonId, Boolean>) getanswermap);
        }

        public static void IconCompatParcelizer(getMcqContentBody getmcqcontentbody, getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            toMagicModuleMetaRepoModel.write(gettimestamp, "");
            getmcqcontentbody.read(getrelatedlessonid, gettimestamp);
        }
    }
}
