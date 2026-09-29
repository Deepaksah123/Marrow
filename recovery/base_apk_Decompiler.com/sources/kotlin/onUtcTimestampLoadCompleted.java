package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow.data.models.lesson.StepIndex;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class onUtcTimestampLoadCompleted extends r8lambdaQhKDSbjrsLfLz7h85E2gZ0PpZrc<StepIndex> {
    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(Object obj) {
        return read((StepIndex) obj);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ Object RemoteActionCompatParcelizer(Cursor cursor) {
        return write(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ Object[] RemoteActionCompatParcelizer(int i) {
        return read(i);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(Object obj) {
        return RemoteActionCompatParcelizer((StepIndex) obj);
    }

    public onUtcTimestampLoadCompleted(Context context, getStreamPositionUsForContent getstreampositionusforcontent) {
        super(context, "_step", getstreampositionusforcontent);
    }

    @Override // kotlin.r8lambdaQhKDSbjrsLfLz7h85E2gZ0PpZrc, kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        LinkedHashMap<String, String> linkedHashMapRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer();
        linkedHashMapRemoteActionCompatParcelizer.put("_id", "TEXT PRIMARY KEY NOT NULL");
        linkedHashMapRemoteActionCompatParcelizer.put("title", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("lesson_id", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("_body", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("read_time", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("step_type", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("status", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("resume_position", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("_video", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("_video_meta", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("_pssh", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("_license_token", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("slides_count", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("notes_count", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("video_aspect", "REAL");
        return linkedHashMapRemoteActionCompatParcelizer;
    }

    private static StepIndex write(Cursor cursor) {
        StepIndex stepIndex = new StepIndex();
        stepIndex.setId(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "_id"));
        stepIndex.setTitle(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "title"));
        stepIndex.setReadTime(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "read_time"));
        stepIndex.setRelatedLessonId(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "lesson_id"));
        stepIndex.setStepType(getPeriodDurationMs.write(cursor, "step_type"));
        stepIndex.setVideoMetaEncrypt(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "_video_meta"));
        stepIndex.setResumeExplanation(getPeriodDurationMs.read(cursor, "resume_position"));
        stepIndex.setCourseId(getPeriodDurationMs.write(cursor, FilterParams.KEY_COURSE_ID));
        stepIndex.videoEncrypt = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "_video");
        stepIndex.setSlidesCount(getPeriodDurationMs.write(cursor, "slides_count"));
        stepIndex.setNotesCount(getPeriodDurationMs.write(cursor, "notes_count"));
        stepIndex.setPsshData(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "_pssh"));
        stepIndex.setVideoAspectRatio(getPeriodDurationMs.IconCompatParcelizer(cursor, "video_aspect"));
        return stepIndex;
    }

    private static ContentValues RemoteActionCompatParcelizer(StepIndex stepIndex) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", stepIndex.getId());
        contentValues.put("read_time", stepIndex.getReadTime());
        contentValues.put("lesson_id", stepIndex.getRelatedLessonId());
        contentValues.put("step_type", Integer.valueOf(stepIndex.getStepType()));
        contentValues.put("title", stepIndex.getTitle());
        contentValues.put("resume_position", Integer.valueOf(stepIndex.isResumeExplanation() ? 1 : 0));
        contentValues.put(FilterParams.KEY_COURSE_ID, Integer.valueOf(stepIndex.getCourseId()));
        contentValues.put("_video_meta", stepIndex.getVideoMetaEncrypt());
        contentValues.put("_video", stepIndex.videoEncrypt);
        contentValues.put("_pssh", stepIndex.getPsshData());
        contentValues.put("slides_count", Integer.valueOf(stepIndex.getSlidesCount()));
        contentValues.put("notes_count", Integer.valueOf(stepIndex.getNotesCount()));
        contentValues.put("video_aspect", Double.valueOf(stepIndex.getVideoAspectRatio()));
        return contentValues;
    }

    private static StepIndex[] read(int i) {
        return new StepIndex[i];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "_id =? ";
    }

    private static String[] read(StepIndex stepIndex) {
        return new String[]{stepIndex.getId()};
    }

    public final void write(String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(i));
        RemoteActionCompatParcelizer(contentValues, "_id", str);
    }

    public final void AudioAttributesCompatParcelizer(String str, boolean z) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("resume_position", Integer.valueOf(z ? 1 : 0));
        RemoteActionCompatParcelizer(contentValues, "_id", str);
    }

    public final void MediaDescriptionCompat() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("resume_position", (Integer) 0);
        write(contentValues, "step_type =? ", new String[]{IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE});
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: merged with bridge method [inline-methods] */
    public final StepIndex a_(String... strArr) {
        return (StepIndex) super.a_(strArr);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: merged with bridge method [inline-methods] */
    public final StepIndex[] IconCompatParcelizer(String str, String str2) {
        return (StepIndex[]) super.IconCompatParcelizer(str, str2);
    }

    public final void AudioAttributesImplApi26Parcelizer(String str) {
        super.read("lesson_id", str);
    }

    public final void read(String[] strArr) {
        MediaBrowserCompatItemReceiver("lesson_id", strArr);
    }

    public final void AudioAttributesCompatParcelizer() {
        AudioAttributesCompatParcelizer("step_type =? ", new String[]{SessionDescription.SUPPORTED_SDP_VERSION});
    }

    public final StepIndex IconCompatParcelizer(String str, int i) {
        return AudioAttributesCompatParcelizer("lesson_id =?  AND step_type =? ", new String[]{str, String.valueOf(i)}, (String) null);
    }
}
