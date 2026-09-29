package kotlin;

import com.marrow.data.models.video.Timeline;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class count {
    private static parseColorInternal write(Timeline timeline) {
        toMagicModuleMetaRepoModel.write(timeline, "");
        return new parseColorInternal(timeline.getTimelineId(), timeline.getStartTime(), timeline.getEndTime(), timeline.getTimelineTitle(), timeline.getBookmarkType());
    }

    public static final List<parseColorInternal> write(Timeline[] timelineArr) {
        if (timelineArr == null) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        ArrayList arrayList = new ArrayList(timelineArr.length);
        for (Timeline timeline : timelineArr) {
            arrayList.add(write(timeline));
        }
        return arrayList;
    }
}
