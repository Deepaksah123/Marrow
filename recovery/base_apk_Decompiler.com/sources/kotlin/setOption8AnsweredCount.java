package kotlin;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setOption8AnsweredCount implements setTags {
    protected abstract setTags write();

    public final setTags IconCompatParcelizer() {
        if (write() instanceof setOption8AnsweredCount) {
            setTags settagsWrite = write();
            toMagicModuleMetaRepoModel.read(settagsWrite, "");
            return ((setOption8AnsweredCount) settagsWrite).IconCompatParcelizer();
        }
        return write();
    }

    @Override // kotlin.setTags, kotlin.getMcqContentBody
    public Collection<CourseConfigV2SupportItem> read(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        return write().read(getrelatedlessonid, gettimestamp);
    }

    @Override // kotlin.getMcqContentBody
    public final getQuestionLimit AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        return write().AudioAttributesCompatParcelizer(getrelatedlessonid, gettimestamp);
    }

    @Override // kotlin.setTags
    public Collection<CourseConfigV2SettingsItems> IconCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        return write().IconCompatParcelizer(getrelatedlessonid, gettimestamp);
    }

    @Override // kotlin.getMcqContentBody
    public Collection<getVariant> read(setOption6AnsweredCount setoption6answeredcount, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(setoption6answeredcount, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        return write().read(setoption6answeredcount, getanswermap);
    }

    @Override // kotlin.setTags
    public final Set<getRelatedLessonId> aY_() {
        return write().aY_();
    }

    @Override // kotlin.setTags
    public final Set<getRelatedLessonId> AudioAttributesCompatParcelizer() {
        return write().AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.setTags
    public final Set<getRelatedLessonId> aW_() {
        return write().aW_();
    }

    @Override // kotlin.getMcqContentBody
    public final void RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        write().RemoteActionCompatParcelizer(getrelatedlessonid, gettimestamp);
    }
}
