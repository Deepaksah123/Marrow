package kotlin;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.setTags;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setStatusUpdateEndTimeMs implements setTags {
    @Override // kotlin.setTags
    public Set<getRelatedLessonId> aW_() {
        return null;
    }

    @Override // kotlin.getMcqContentBody
    public void RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        setTags.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this, getrelatedlessonid, gettimestamp);
    }

    @Override // kotlin.setTags
    public Collection<? extends CourseConfigV2SettingsItems> IconCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.setTags, kotlin.getMcqContentBody
    public Collection<? extends CourseConfigV2SupportItem> read(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.getMcqContentBody
    public Collection<getVariant> read(setOption6AnsweredCount setoption6answeredcount, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(setoption6answeredcount, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.setTags
    public Set<getRelatedLessonId> aY_() {
        Collection<getVariant> collection = read(setOption6AnsweredCount.read, UpdatedStatusCompanion.RemoteActionCompatParcelizer());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collection) {
            if (obj instanceof CourseConfigV2SupportItem) {
                getRelatedLessonId getrelatedlessonidAQ_ = ((CourseConfigV2SupportItem) obj).aQ_();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAQ_, "");
                linkedHashSet.add(getrelatedlessonidAQ_);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.setTags
    public Set<getRelatedLessonId> AudioAttributesCompatParcelizer() {
        Collection<getVariant> collection = read(setOption6AnsweredCount.MediaBrowserCompatItemReceiver, UpdatedStatusCompanion.RemoteActionCompatParcelizer());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collection) {
            if (obj instanceof CourseConfigV2SupportItem) {
                getRelatedLessonId getrelatedlessonidAQ_ = ((CourseConfigV2SupportItem) obj).aQ_();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAQ_, "");
                linkedHashSet.add(getrelatedlessonidAQ_);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.getMcqContentBody
    public getQuestionLimit AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        return null;
    }
}
