package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface getFirstAttemptTime {
    public static final getFirstAttemptTime AudioAttributesCompatParcelizer = new getFirstAttemptTime() { // from class: o.getFirstAttemptTime.5
        private static /* synthetic */ void RemoteActionCompatParcelizer(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.getFirstAttemptTime
        public final void write(getTestHeaderTitle gettestheadertitle) {
            if (gettestheadertitle == null) {
                RemoteActionCompatParcelizer(2);
            }
        }

        @Override // kotlin.getFirstAttemptTime
        public final void IconCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, List<String> list) {
            if (courseConfigV2CustomModuleQuestionSource == null) {
                RemoteActionCompatParcelizer(0);
            }
        }
    };

    void IconCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, List<String> list);

    void write(getTestHeaderTitle gettestheadertitle);
}
