package kotlin;

import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.response.common.RatingResponseBody;
import com.marrow.data.api.models.response.lesson.MarkCompleteResponseBody;
import com.marrow.data.api.models.response.lesson.MarkIncompleteResponseBody;
import com.marrow.data.models.lesson.LessonIndex;
import com.marrow.data.models.lesson.tab.LessonTabItem;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface setSupportedContentTypes {
    int AudioAttributesCompatParcelizer(String str);

    accessgetEmptyStatecp<MarrowResponse<RatingResponseBody>> AudioAttributesCompatParcelizer(String str, int i);

    LessonDynamicResponseBody<MarrowResponse<MarkIncompleteResponseBody>> AudioAttributesImplApi26Parcelizer(String str);

    int IconCompatParcelizer();

    accessgetEmptyStatecp<List<LessonTabItem<?>>> IconCompatParcelizer(String str);

    int RemoteActionCompatParcelizer(String str);

    LessonDynamicResponseBody<MarrowResponse<MarkCompleteResponseBody>> read(String str);

    LessonDynamicResponseBody<LessonIndex> read(String str, boolean z);

    int write(long j, long j2);

    LessonIndex write(String str);

    void write(String str, int i);
}
