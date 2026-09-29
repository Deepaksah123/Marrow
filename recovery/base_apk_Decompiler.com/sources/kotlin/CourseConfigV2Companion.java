package kotlin;

import java.io.InputStream;
import java.util.List;
import kotlin.FilterItemRecord;
import kotlin.McqTimerAnalyticsModel;
import kotlin.getChangeAnswerTime;
import kotlin.getMyAnswer;
import kotlin.setEncryptKey;

/* JADX INFO: loaded from: classes4.dex */
public final class CourseConfigV2Companion extends McqParentInfo {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseConfigV2Companion(getMini getmini, getLessonActivityStatus getlessonactivitystatus, getTopSection gettopsection, CourseConfigV2PlanScreenConfig courseConfigV2PlanScreenConfig, getCourseIdInt getcourseidint, ImageUpload imageUpload, McqPearlInfo mcqPearlInfo, setPlans setplans, setOption4AnsweredCount setoption4answeredcount) {
        super(getmini, getlessonactivitystatus, gettopsection);
        toMagicModuleMetaRepoModel.write(getmini, "");
        toMagicModuleMetaRepoModel.write(getlessonactivitystatus, "");
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        toMagicModuleMetaRepoModel.write(courseConfigV2PlanScreenConfig, "");
        toMagicModuleMetaRepoModel.write(getcourseidint, "");
        toMagicModuleMetaRepoModel.write(imageUpload, "");
        toMagicModuleMetaRepoModel.write(mcqPearlInfo, "");
        toMagicModuleMetaRepoModel.write(setplans, "");
        toMagicModuleMetaRepoModel.write(setoption4answeredcount, "");
        CourseConfigV2Companion courseConfigV2Companion = this;
        getHasBeenAnswered gethasbeenanswered = new getHasBeenAnswered(courseConfigV2Companion);
        setParentType setparenttype = new setParentType(gettopsection, courseConfigV2PlanScreenConfig, McqAnswerIndex.read);
        FilterItemRecord.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = FilterItemRecord.AudioAttributesCompatParcelizer.write;
        getFirstAttemptTime getfirstattempttime = getFirstAttemptTime.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getfirstattempttime, "");
        setEncryptKey.RemoteActionCompatParcelizer remoteActionCompatParcelizer = setEncryptKey.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        getChangeAnswerTime.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = getChangeAnswerTime.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        List listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new getDocSideType[]{new getEndDate(getmini, gettopsection), new CourseConfigV2BottomTabItem(getmini, gettopsection)});
        McqTimerAnalyticsModel.write writeVar = McqTimerAnalyticsModel.write;
        read(new getPearlId(getmini, gettopsection, mcqPearlInfo, gethasbeenanswered, setparenttype, courseConfigV2Companion, audioAttributesCompatParcelizer, getfirstattempttime, remoteActionCompatParcelizer, remoteActionCompatParcelizer2, listRemoteActionCompatParcelizer, courseConfigV2PlanScreenConfig, McqTimerAnalyticsModel.write.IconCompatParcelizer(), getcourseidint, imageUpload, McqAnswerIndex.read.RemoteActionCompatParcelizer(), setplans, setoption4answeredcount, null, null, 786432));
    }

    @Override // kotlin.McqParentInfo
    public final QaPair read(getNotesCount getnotescount) {
        getMyAnswer getmyanswerIconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        InputStream inputStreamWrite = read().write(getnotescount);
        if (inputStreamWrite != null) {
            getMyAnswer.RemoteActionCompatParcelizer remoteActionCompatParcelizer = getMyAnswer.RemoteActionCompatParcelizer;
            getmyanswerIconCompatParcelizer = getMyAnswer.RemoteActionCompatParcelizer.IconCompatParcelizer(getnotescount, AudioAttributesCompatParcelizer(), IconCompatParcelizer(), inputStreamWrite, false);
        } else {
            getmyanswerIconCompatParcelizer = null;
        }
        return getmyanswerIconCompatParcelizer;
    }

    static {
        new RemoteActionCompatParcelizer((byte) 0);
    }

    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }
    }
}
