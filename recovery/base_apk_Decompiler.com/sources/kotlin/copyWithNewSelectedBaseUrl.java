package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.models.video.VideoResumeInfo;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class copyWithNewSelectedBaseUrl extends getIntervalUntilNextManifestRefreshMs<VideoResumeInfo> {
    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(VideoResumeInfo videoResumeInfo) {
        return RemoteActionCompatParcelizer(videoResumeInfo);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ VideoResumeInfo RemoteActionCompatParcelizer(Cursor cursor) {
        return write(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ VideoResumeInfo[] RemoteActionCompatParcelizer(int i) {
        return IconCompatParcelizer(i);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(VideoResumeInfo videoResumeInfo) {
        return AudioAttributesCompatParcelizer(videoResumeInfo);
    }

    public copyWithNewSelectedBaseUrl(Context context) {
        super(context, "video_resume_info");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("video_id", "TEXT PRIMARY KEY NOT NULL");
        linkedHashMap.put("resume_time", "INTEGER");
        linkedHashMap.put("total_duration", "INTEGER");
        linkedHashMap.put("reference_id", "TEXT");
        return linkedHashMap;
    }

    private static VideoResumeInfo write(Cursor cursor) {
        return new VideoResumeInfo(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "video_id"), getPeriodDurationMs.AudioAttributesImplBaseParcelizer(cursor, "resume_time"), getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "reference_id"), getPeriodDurationMs.AudioAttributesImplBaseParcelizer(cursor, "total_duration"));
    }

    private static ContentValues AudioAttributesCompatParcelizer(VideoResumeInfo videoResumeInfo) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("video_id", videoResumeInfo.getVideoId());
        contentValues.put("resume_time", Long.valueOf(videoResumeInfo.getResumeTimeMs()));
        contentValues.put("reference_id", videoResumeInfo.getReferenceId());
        contentValues.put("total_duration", Long.valueOf(videoResumeInfo.getTotalDurationMs()));
        return contentValues;
    }

    private static VideoResumeInfo[] IconCompatParcelizer(int i) {
        return new VideoResumeInfo[i];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "video_id =? ";
    }

    private static String[] RemoteActionCompatParcelizer(VideoResumeInfo videoResumeInfo) {
        return new String[]{videoResumeInfo.getVideoId()};
    }

    public final long AudioAttributesImplApi26Parcelizer(String str) {
        VideoResumeInfo videoResumeInfoA_ = a_(str);
        if (videoResumeInfoA_ == null) {
            return 0L;
        }
        return videoResumeInfoA_.getResumeTimeMs();
    }

    public final VideoResumeInfo MediaBrowserCompatCustomActionResultReceiver(String str) {
        return write("reference_id", str);
    }
}
