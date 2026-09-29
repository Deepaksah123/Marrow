package kotlin;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class getShowGoProButton {
    public static final boolean read(getQbankItems getqbankitems, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        toMagicModuleMetaRepoModel.write(getqbankitems, "");
        toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
        if (!getAnswerDescription.AudioAttributesImplApi21Parcelizer(courseConfigV2CustomModuleQuestionSource)) {
            return false;
        }
        Set<RevisionSubjectStatusModel> setAudioAttributesCompatParcelizer = getQbankItems.AudioAttributesCompatParcelizer();
        RevisionSubjectStatusModel revisionSubjectStatusModel = setLocked.read((getQuestionLimit) courseConfigV2CustomModuleQuestionSource);
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(setAudioAttributesCompatParcelizer, revisionSubjectStatusModel != null ? revisionSubjectStatusModel.write() : null);
    }
}
