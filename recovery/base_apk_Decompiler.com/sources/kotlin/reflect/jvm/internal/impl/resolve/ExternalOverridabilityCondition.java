package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.CourseConfigV2CustomModuleQuestionSource;
import kotlin.getVideoPageNotesTitle;

/* JADX INFO: loaded from: classes4.dex */
public interface ExternalOverridabilityCondition {

    public enum IconCompatParcelizer {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    public enum read {
        OVERRIDABLE,
        CONFLICT,
        INCOMPATIBLE,
        UNKNOWN
    }

    IconCompatParcelizer getContract();

    read isOverridable(getVideoPageNotesTitle getvideopagenotestitle, getVideoPageNotesTitle getvideopagenotestitle2, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource);
}
