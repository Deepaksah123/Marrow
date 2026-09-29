package kotlin;

import com.marrow.data.models.common.CourseConfigV2;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/checkInitialization;", "", "<init>", "()V", "Lcom/marrow/data/models/common/CourseConfigV2$CustomModuleConfig;", "RemoteActionCompatParcelizer", "()Lcom/marrow/data/models/common/CourseConfigV2$CustomModuleConfig;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class checkInitialization {
    public static final checkInitialization INSTANCE = new checkInitialization();

    private checkInitialization() {
    }

    public static CourseConfigV2.CustomModuleConfig RemoteActionCompatParcelizer() {
        calculateFieldOfViewInYDirection calculatefieldofviewinydirection = calculateFieldOfViewInYDirection.INSTANCE;
        return new CourseConfigV2.CustomModuleConfig(calculateFieldOfViewInYDirection.IconCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new CourseConfigV2.CustomModuleQuestionSource[]{new CourseConfigV2.CustomModuleQuestionSource("All MCQs", "all", "all"), new CourseConfigV2.CustomModuleQuestionSource("QBank MCQs", "qbank", "qbank"), new CourseConfigV2.CustomModuleQuestionSource("Bookmarked MCQs", "bookmark", "bookmarked"), new CourseConfigV2.CustomModuleQuestionSource("Grand Test MCQs", "test", "grand_test")}));
    }
}
