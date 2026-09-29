package com.marrow2.data.mcq.remote;

import com.marrow.data.api.models.response.mcq.McqResponseBody;
import com.marrow2.data.bookmark.remote.model.ResetBookmarkResponseBody;
import java.util.List;
import kotlin.Metadata;
import kotlin.SampleVideos;
import kotlin.getShowPopup;
import kotlin.onDisplayInfoChanged;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H¦@¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u0013\u0010\u0014À\u0006\u0003"}, d2 = {"Lcom/marrow2/data/mcq/remote/McqRemoteSource;", "", "", "p0", "Lcom/marrow2/data/bookmark/remote/model/ResetBookmarkResponseBody;", "resetBookmarks", "(ILo/SampleVideos;)Ljava/lang/Object;", "", "Lo/onDisplayInfoChanged;", "p1", "p2", "", "updateBookmark", "(Ljava/lang/String;Lo/onDisplayInfoChanged;ILo/SampleVideos;)Ljava/lang/Object;", "", "Lcom/marrow2/data/mcq/remote/McqFaqResponseBody;", "getFaqsForMcq", "(Ljava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;", "Lcom/marrow/data/api/models/response/mcq/McqResponseBody;", "getRelatedMcq", "(ILjava/lang/String;Lo/SampleVideos;)Ljava/lang/Object;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface McqRemoteSource {
    Object getFaqsForMcq(String str, SampleVideos<? super List<McqFaqResponseBody>> sampleVideos);

    Object getRelatedMcq(int i, String str, SampleVideos<? super List<? extends McqResponseBody>> sampleVideos);

    Object resetBookmarks(int i, SampleVideos<? super ResetBookmarkResponseBody> sampleVideos);

    Object updateBookmark(String str, onDisplayInfoChanged ondisplayinfochanged, int i, SampleVideos<? super getShowPopup> sampleVideos);
}
