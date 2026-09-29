package kotlin;

import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.response.common.RatingResponseBody;
import com.marrow.data.api.models.response.lesson.MarkCompleteResponseBody;
import com.marrow.data.api.models.response.lesson.MarkIncompleteResponseBody;
import com.marrow.data.models.lesson.LessonIndex;
import com.marrow.data.models.lesson.tab.LessonTabItem;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface onAdPlaybackState {
    LessonDynamicResponseBody<MarrowResponse<MarkCompleteResponseBody>> AudioAttributesCompatParcelizer(String str);

    int IconCompatParcelizer(long j, long j2);

    LessonDynamicResponseBody<LessonIndex> IconCompatParcelizer(String str, boolean z);

    accessgetEmptyStatecp<List<LessonTabItem<?>>> IconCompatParcelizer(String str);

    LessonDynamicResponseBody<MarrowResponse<MarkIncompleteResponseBody>> MediaBrowserCompatItemReceiver(String str);

    LessonIndex RemoteActionCompatParcelizer(String str);

    void RemoteActionCompatParcelizer(String str, int i);

    int read(String str);

    int write(String str);

    accessgetEmptyStatecp<MarrowResponse<RatingResponseBody>> write(String str, int i, String[] strArr);
}
