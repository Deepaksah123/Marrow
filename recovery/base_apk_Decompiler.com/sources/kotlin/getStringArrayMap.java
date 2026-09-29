package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getStringArrayMap implements CourseConfigV2CustomModuleQuestionSource {
    public static final AudioAttributesCompatParcelizer IconCompatParcelizer = new AudioAttributesCompatParcelizer(0);

    protected abstract setTags IconCompatParcelizer(getCheapestPlan getcheapestplan);

    protected abstract setTags write(isVideoPlanCtype isvideoplanctype, getCheapestPlan getcheapestplan);

    /* JADX INFO: renamed from: aR_ */
    public /* synthetic */ getQuestionLimit onAddQueueItem() {
        return onAddQueueItem();
    }

    @Override // kotlin.getVariant
    public /* synthetic */ getVariant aS_() {
        return onAddQueueItem();
    }

    public static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        public static setTags read(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, getCheapestPlan getcheapestplan) {
            setTags settagsIconCompatParcelizer;
            toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
            toMagicModuleMetaRepoModel.write(getcheapestplan, "");
            getStringArrayMap getstringarraymap = courseConfigV2CustomModuleQuestionSource instanceof getStringArrayMap ? (getStringArrayMap) courseConfigV2CustomModuleQuestionSource : null;
            if (getstringarraymap != null && (settagsIconCompatParcelizer = getstringarraymap.IconCompatParcelizer(getcheapestplan)) != null) {
                return settagsIconCompatParcelizer;
            }
            setTags settagsOnRemoveQueueItem = courseConfigV2CustomModuleQuestionSource.onRemoveQueueItem();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(settagsOnRemoveQueueItem, "");
            return settagsOnRemoveQueueItem;
        }

        public static setTags RemoteActionCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, isVideoPlanCtype isvideoplanctype, getCheapestPlan getcheapestplan) {
            setTags settagsWrite;
            toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
            toMagicModuleMetaRepoModel.write(isvideoplanctype, "");
            toMagicModuleMetaRepoModel.write(getcheapestplan, "");
            getStringArrayMap getstringarraymap = courseConfigV2CustomModuleQuestionSource instanceof getStringArrayMap ? (getStringArrayMap) courseConfigV2CustomModuleQuestionSource : null;
            if (getstringarraymap != null && (settagsWrite = getstringarraymap.write(isvideoplanctype, getcheapestplan)) != null) {
                return settagsWrite;
            }
            setTags settagsWrite2 = courseConfigV2CustomModuleQuestionSource.write(isvideoplanctype);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(settagsWrite2, "");
            return settagsWrite2;
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(byte b) {
            this();
        }
    }
}
