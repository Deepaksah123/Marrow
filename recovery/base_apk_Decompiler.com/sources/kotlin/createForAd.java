package kotlin;

import com.marrow.data.api.models.response.lesson.VideoBookmarkTimeline;
import com.marrow.data.models.video.Timeline;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class createForAd {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<VideoBookmarkTimeline> IconCompatParcelizer(Timeline[] timelineArr, String str, Map<String, Long> map) {
        Long l;
        ArrayList arrayList = new ArrayList();
        for (Timeline timeline : timelineArr) {
            arrayList.add(new VideoBookmarkTimeline(timeline.getTimelineId(), timeline.getTimelineTitle(), Integer.valueOf(timeline.getStartTime()), Integer.valueOf(timeline.getEndTime()), (map == null || (l = map.get(timeline.getTimelineId())) == null) ? 0L : l.longValue(), str, timeline.getBookmarkType(), true, null, timeline.isTagActive(), timeline.getTagLabel(), timeline.getTagExpiryMs(), 256, null));
        }
        return arrayList;
    }
}
