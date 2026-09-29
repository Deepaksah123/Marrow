package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public interface ImageUpload {
    boolean IconCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, CourseConfigV2SupportItem courseConfigV2SupportItem);

    public static final class IconCompatParcelizer implements ImageUpload {
        public static final IconCompatParcelizer write = new IconCompatParcelizer();

        private IconCompatParcelizer() {
        }

        @Override // kotlin.ImageUpload
        public final boolean IconCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, CourseConfigV2SupportItem courseConfigV2SupportItem) {
            toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
            toMagicModuleMetaRepoModel.write(courseConfigV2SupportItem, "");
            return true;
        }
    }

    public static final class RemoteActionCompatParcelizer implements ImageUpload {
        public static final RemoteActionCompatParcelizer read = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
        }

        @Override // kotlin.ImageUpload
        public final boolean IconCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, CourseConfigV2SupportItem courseConfigV2SupportItem) {
            toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
            toMagicModuleMetaRepoModel.write(courseConfigV2SupportItem, "");
            return !courseConfigV2SupportItem.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(getDocGroupId.read());
        }
    }
}
