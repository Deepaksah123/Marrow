package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getPagerMcqIds implements getTotal, isFirstMcq {
    private final CourseConfigV2CustomModuleQuestionSource AudioAttributesCompatParcelizer;
    private final CourseConfigV2CustomModuleQuestionSource RemoteActionCompatParcelizer;
    private final getPagerMcqIds write;

    public getPagerMcqIds(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
        this.AudioAttributesCompatParcelizer = courseConfigV2CustomModuleQuestionSource;
        this.write = this;
        this.RemoteActionCompatParcelizer = courseConfigV2CustomModuleQuestionSource;
    }

    @Override // kotlin.isFirstMcq
    public final CourseConfigV2CustomModuleQuestionSource read() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getStartIndex
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public getHref write() {
        getHref gethrefAP_ = this.AudioAttributesCompatParcelizer.aP_();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethrefAP_, "");
        return gethrefAP_;
    }

    public final boolean equals(Object obj) {
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = this.AudioAttributesCompatParcelizer;
        getPagerMcqIds getpagermcqids = obj instanceof getPagerMcqIds ? (getPagerMcqIds) obj : null;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(courseConfigV2CustomModuleQuestionSource, getpagermcqids != null ? getpagermcqids.AudioAttributesCompatParcelizer : null);
    }

    public final int hashCode() {
        return this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Class{");
        sb.append(write());
        sb.append('}');
        return sb.toString();
    }
}
