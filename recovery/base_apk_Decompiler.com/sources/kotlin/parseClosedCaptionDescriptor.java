package kotlin;

import android.content.Context;
import com.marrow.data.models.video.VideoResumeInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class parseClosedCaptionDescriptor implements getStreamIndexToTrackGroupIndex {
    private copyWithNewSelectedBaseUrl IconCompatParcelizer;

    public parseClosedCaptionDescriptor(Context context) {
        this.IconCompatParcelizer = new copyWithNewSelectedBaseUrl(context.getApplicationContext());
    }

    @Override // kotlin.getStreamIndexToTrackGroupIndex
    public final void IconCompatParcelizer(VideoResumeInfo videoResumeInfo) {
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(videoResumeInfo);
    }

    @Override // kotlin.getStreamIndexToTrackGroupIndex
    public final long AudioAttributesCompatParcelizer(String str) {
        return this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer(str);
    }

    @Override // kotlin.getStreamIndexToTrackGroupIndex
    public final VideoResumeInfo write(String str) {
        return this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(str);
    }

    @Override // kotlin.getStreamIndexToTrackGroupIndex
    public final int read(String str) {
        VideoResumeInfo videoResumeInfoWrite = write(str);
        if (videoResumeInfoWrite == null || videoResumeInfoWrite.getResumeTimeMs() == 0) {
            return 0;
        }
        return Math.round((videoResumeInfoWrite.getResumeTimeMs() / videoResumeInfoWrite.getTotalDurationMs()) * 100.0f);
    }
}
