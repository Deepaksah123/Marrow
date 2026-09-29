package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.setOption6AnsweredCount;

/* JADX INFO: loaded from: classes4.dex */
public final class McqIndexMini extends setStatusUpdateEndTimeMs {
    private final setTags RemoteActionCompatParcelizer;

    public McqIndexMini(setTags settags) {
        toMagicModuleMetaRepoModel.write(settags, "");
        this.RemoteActionCompatParcelizer = settags;
    }

    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.getMcqContentBody
    public final getQuestionLimit AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        getQuestionLimit getquestionlimitAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(getrelatedlessonid, gettimestamp);
        getQuestionLimit getquestionlimit = null;
        if (getquestionlimitAudioAttributesCompatParcelizer != null) {
            CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = getquestionlimitAudioAttributesCompatParcelizer instanceof CourseConfigV2CustomModuleQuestionSource ? (CourseConfigV2CustomModuleQuestionSource) getquestionlimitAudioAttributesCompatParcelizer : null;
            if (courseConfigV2CustomModuleQuestionSource != null) {
                getquestionlimit = courseConfigV2CustomModuleQuestionSource;
            } else if (getquestionlimitAudioAttributesCompatParcelizer instanceof CourseConfigV2VideoProperties) {
                getquestionlimit = (CourseConfigV2VideoProperties) getquestionlimitAudioAttributesCompatParcelizer;
            }
            getquestionlimit = (getBadge) getquestionlimit;
        }
        return getquestionlimit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.getMcqContentBody
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public List<getQuestionLimit> read(setOption6AnsweredCount setoption6answeredcount, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(setoption6answeredcount, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        setOption6AnsweredCount.write writeVar = setOption6AnsweredCount.IconCompatParcelizer;
        setOption6AnsweredCount setoption6answeredcountWrite = setoption6answeredcount.write(setOption6AnsweredCount.write.IconCompatParcelizer());
        if (setoption6answeredcountWrite == null) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        Collection<getVariant> collection = this.RemoteActionCompatParcelizer.read(setoption6answeredcountWrite, getanswermap);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (obj instanceof getBadge) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.setTags
    public final Set<getRelatedLessonId> aY_() {
        return this.RemoteActionCompatParcelizer.aY_();
    }

    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.setTags
    public final Set<getRelatedLessonId> AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.setTags
    public final Set<getRelatedLessonId> aW_() {
        return this.RemoteActionCompatParcelizer.aW_();
    }

    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.getMcqContentBody
    public final void RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(getrelatedlessonid, gettimestamp);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Classes from ");
        sb.append(this.RemoteActionCompatParcelizer);
        return sb.toString();
    }
}
