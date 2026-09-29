package kotlin;

import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.response.common.RatingResponseBody;
import com.marrow.data.api.models.response.lesson.MarkCompleteResponseBody;
import com.marrow.data.api.models.response.lesson.MarkIncompleteResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public interface onAdClicked {
    LessonDynamicResponseBody<MarrowResponse<MarkIncompleteResponseBody>> AudioAttributesCompatParcelizer(String str, int i);

    LessonDynamicResponseBody<MarrowResponse<MarkCompleteResponseBody>> read(String str, int i);

    accessgetEmptyStatecp<MarrowResponse<RatingResponseBody>> read(String str, int i, String[] strArr, int i2);
}
