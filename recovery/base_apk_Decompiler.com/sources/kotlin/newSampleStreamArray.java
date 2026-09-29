package kotlin;

import com.marrow.data.api.models.response.lesson.VideoBookmarkTimeline;
import com.marrow.data.api.models.response.lesson.VideoBookmarkTimelineModel;
import com.marrow.data.models.subject.SubjectFilterModel;
import com.marrow.data.models.video.Timeline;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface newSampleStreamArray {

    public interface IconCompatParcelizer {
        int AudioAttributesCompatParcelizer();

        VideoBookmarkTimeline AudioAttributesCompatParcelizer(String str);

        void IconCompatParcelizer();

        VideoBookmarkTimelineModel[] IconCompatParcelizer(String str);

        accessgetEmptyStatecp<SubjectFilterModel[]> RemoteActionCompatParcelizer();

        Timeline[] RemoteActionCompatParcelizer(String str);

        int write();
    }

    List<Timeline> AudioAttributesCompatParcelizer(String str);

    void IconCompatParcelizer();

    int RemoteActionCompatParcelizer();

    int read();

    accessgetEmptyStatecp<VideoBookmarkTimelineModel[]> read(String str);

    VideoBookmarkTimeline write(String str);

    accessgetEmptyStatecp<SubjectFilterModel[]> write();
}
