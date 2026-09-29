package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getMcqType extends getMagicLine<Pair<? extends RevisionSubjectStatusModel, ? extends getRelatedLessonId>> {
    private final RevisionSubjectStatusModel AudioAttributesCompatParcelizer;
    private final getRelatedLessonId IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getMcqType(RevisionSubjectStatusModel revisionSubjectStatusModel, getRelatedLessonId getrelatedlessonid) {
        super(setAction.write(revisionSubjectStatusModel, getrelatedlessonid));
        toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        this.AudioAttributesCompatParcelizer = revisionSubjectStatusModel;
        this.IconCompatParcelizer = getrelatedlessonid;
    }

    public final getRelatedLessonId read() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.getMagicLine
    public final getLink AudioAttributesCompatParcelizer(getTopSection gettopsection) {
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer = CourseConfigV2NavDrawerItemReportPiracy.AudioAttributesCompatParcelizer(gettopsection, this.AudioAttributesCompatParcelizer);
        getHref gethrefAP_ = null;
        if (courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer != null) {
            if (!getAnswerDescription.MediaBrowserCompatItemReceiver(courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer)) {
                courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer = null;
            }
            if (courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer != null) {
                gethrefAP_ = courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer.aP_();
            }
        }
        if (gethrefAP_ != null) {
            return gethrefAP_;
        }
        setAccessLevel setaccesslevel = setAccessLevel.ERROR_ENUM_TYPE;
        String string = this.AudioAttributesCompatParcelizer.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = this.IconCompatParcelizer.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        return SubscriptionType.read(setaccesslevel, string, string2);
    }

    @Override // kotlin.getMagicLine
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer());
        sb.append('.');
        sb.append(this.IconCompatParcelizer);
        return sb.toString();
    }
}
