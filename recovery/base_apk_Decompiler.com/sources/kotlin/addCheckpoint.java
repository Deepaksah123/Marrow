package kotlin;

import com.marrow.data.api.models.response.lesson.VideoBookmarkTimelineModel;
import com.marrow.ui.adapter.video.timeline.BookmarkTimelineModelController;

/* JADX INFO: loaded from: classes3.dex */
public interface addCheckpoint {
    addCheckpoint RemoteActionCompatParcelizer(CharSequence charSequence);

    addCheckpoint RemoteActionCompatParcelizer(boolean z);

    addCheckpoint read(VideoBookmarkTimelineModel videoBookmarkTimelineModel);

    addCheckpoint read(BookmarkTimelineModelController.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer);

    addCheckpoint read(boolean z);
}
