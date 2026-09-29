package kotlin;

import com.marrow.data.models.video.DownloadAnalyticEvent;
import com.marrow.data.models.video.VideoAnalyticFinalSession;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\f2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u000e2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0011\u0010\u0013À\u0006\u0003"}, d2 = {"Lo/InitializationChunk;", "", "Lcom/marrow/data/models/video/VideoAnalyticFinalSession;", "p0", "", "IconCompatParcelizer", "(Lcom/marrow/data/models/video/VideoAnalyticFinalSession;)V", "Lcom/marrow/data/models/video/DownloadAnalyticEvent;", "", "p1", "read", "(Lcom/marrow/data/models/video/DownloadAnalyticEvent;)V", "", "", "", "Lo/getChunkStartTimeUs;", "p2", "AudioAttributesCompatParcelizer", "(Ljava/lang/Throwable;Ljava/util/Map;Lo/getChunkStartTimeUs;)V", "(Ljava/lang/String;Ljava/util/Map;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InitializationChunk {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.AudioAttributesCompatParcelizer;

    void AudioAttributesCompatParcelizer(String p0, Map<String, String> p1);

    void AudioAttributesCompatParcelizer(Throwable p0, Map<String, String> p1, getChunkStartTimeUs p2);

    void IconCompatParcelizer(VideoAnalyticFinalSession p0);

    void read(DownloadAnalyticEvent downloadAnalyticEvent);

    /* JADX INFO: renamed from: o.InitializationChunk$IconCompatParcelizer, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion AudioAttributesCompatParcelizer = new Companion();

        private Companion() {
        }
    }
}
