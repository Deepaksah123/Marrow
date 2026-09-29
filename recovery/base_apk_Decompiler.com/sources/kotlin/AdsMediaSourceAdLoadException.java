package kotlin;

import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.response.lesson.InteractiveVideoElementLSModel;
import com.marrow.data.api.models.response.lesson.LessonResponseBody;
import com.marrow.data.models.lesson.LessonIndex;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface AdsMediaSourceAdLoadException {

    public interface IconCompatParcelizer {
        boolean AudioAttributesCompatParcelizer(String str);

        accessgetEmptyStatecp<LessonIndex> RemoteActionCompatParcelizer(String str);

        List<InteractiveVideoElementLSModel> write(String str);
    }

    public interface RemoteActionCompatParcelizer {
        accessgetEmptyStatecp<MarrowResponse<LessonResponseBody>> IconCompatParcelizer(String str);
    }

    public interface write {
        List<InteractiveVideoElementLSModel> AudioAttributesCompatParcelizer(String str);

        accessgetEmptyStatecp<LessonIndex> IconCompatParcelizer(String str);

        void IconCompatParcelizer(LessonResponseBody lessonResponseBody);

        boolean write(String str);
    }
}
