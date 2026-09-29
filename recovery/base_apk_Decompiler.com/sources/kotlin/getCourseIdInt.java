package kotlin;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public interface getCourseIdInt {
    Collection<getRelatedLessonId> AudioAttributesCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource);

    Collection<getLink> read(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource);

    Collection<CourseConfigV2EditionSwitch> write(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource);

    Collection<CourseConfigV2SupportItem> write(getRelatedLessonId getrelatedlessonid, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource);

    public static final class read implements getCourseIdInt {
        public static final read RemoteActionCompatParcelizer = new read();

        private read() {
        }

        @Override // kotlin.getCourseIdInt
        public final Collection<getLink> read(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
            toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }

        @Override // kotlin.getCourseIdInt
        public final Collection<CourseConfigV2SupportItem> write(getRelatedLessonId getrelatedlessonid, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }

        @Override // kotlin.getCourseIdInt
        public final Collection<getRelatedLessonId> AudioAttributesCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
            toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }

        @Override // kotlin.getCourseIdInt
        public final Collection<CourseConfigV2EditionSwitch> write(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
            toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
    }
}
