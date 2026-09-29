package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.api.models.request.sync.SyncParam;
import com.marrow.data.api.models.response.lesson.VideoBookmarkTimeline;
import com.marrow.data.api.models.response.lesson.VideoBookmarkTimelineModel;
import com.marrow.data.api.models.response.sync.CrossDeviceSyncResponseObject;
import com.marrow.data.models.subject.SubjectFilterModel;
import com.marrow.data.models.video.Timeline;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0004\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0016\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0019J\u001b\u0010\u0010\u001a\u00020\u001b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a¢\u0006\u0004\b\u0010\u0010\u001cJ\u000f\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020 0\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010!J\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\"0\n¢\u0006\u0004\b\u0010\u0010#J\u0015\u0010$\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t¢\u0006\u0004\b$\u0010%J!\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020'0&2\u0006\u0010\u0004\u001a\u00020\r¢\u0006\u0004\b(\u0010)J\u001b\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\n2\u0006\u0010\u0004\u001a\u00020\r¢\u0006\u0004\b+\u0010,R\u0011\u0010\u0013\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010-"}, d2 = {"Lo/updateSelectedBaseUrl;", "Lo/getIntervalUntilNextManifestRefreshMs;", "Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimeline;", "Landroid/content/Context;", "p0", "Lo/getStreamPositionUsForContent;", "p1", "<init>", "(Landroid/content/Context;Lo/getStreamPositionUsForContent;)V", "", "", "MediaMetadataCompat", "()[Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimeline;", "", "MediaBrowserCompatSearchResultReceiver", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "(Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimeline;)[Ljava/lang/String;", "Ljava/util/LinkedHashMap;", "RemoteActionCompatParcelizer", "()Ljava/util/LinkedHashMap;", "Landroid/database/Cursor;", "read", "(Landroid/database/Cursor;)Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimeline;", "Landroid/content/ContentValues;", "(Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimeline;)Landroid/content/ContentValues;", "", "", "(Ljava/util/List;)V", "Lcom/marrow/data/api/models/request/sync/SyncParam;", "write", "()Lcom/marrow/data/api/models/request/sync/SyncParam;", "Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimelineModel;", "(Ljava/lang/String;I)[Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimelineModel;", "Lcom/marrow/data/models/subject/SubjectFilterModel;", "()[Lcom/marrow/data/models/subject/SubjectFilterModel;", "IconCompatParcelizer", "(I)I", "", "", "AudioAttributesImplApi21Parcelizer", "(Ljava/lang/String;)Ljava/util/Map;", "Lcom/marrow/data/models/video/Timeline;", "AudioAttributesImplApi26Parcelizer", "(Ljava/lang/String;)[Lcom/marrow/data/models/video/Timeline;", "Lo/getStreamPositionUsForContent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class updateSelectedBaseUrl extends getIntervalUntilNextManifestRefreshMs<VideoBookmarkTimeline> {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getStreamPositionUsForContent RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public updateSelectedBaseUrl(Context context, getStreamPositionUsForContent getstreampositionusforcontent) {
        super(context, "video_bookmark_timeline");
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        this.RemoteActionCompatParcelizer = getstreampositionusforcontent;
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(VideoBookmarkTimeline videoBookmarkTimeline) {
        return AudioAttributesCompatParcelizer(videoBookmarkTimeline);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ VideoBookmarkTimeline RemoteActionCompatParcelizer(Cursor cursor) {
        return read(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ VideoBookmarkTimeline[] RemoteActionCompatParcelizer(int i) {
        return MediaMetadataCompat();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(VideoBookmarkTimeline videoBookmarkTimeline) {
        return read(videoBookmarkTimeline);
    }

    private static VideoBookmarkTimeline[] MediaMetadataCompat() {
        return new VideoBookmarkTimeline[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "_id =? ";
    }

    private static String[] AudioAttributesCompatParcelizer(VideoBookmarkTimeline p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new String[]{p0.getId()};
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        return VideoTimelineResponseBody.IconCompatParcelizer(setAction.write("_id", "TEXT PRIMARY KEY NOT NULL"), setAction.write("title", "TEXT"), setAction.write("start_time", "INTEGER"), setAction.write("end_time", "INTEGER"), setAction.write("last_updated", "INTEGER"), setAction.write("video_id", "TEXT"), setAction.write("bookmark_type", "INTEGER"), setAction.write("is_active", "INTEGER"), setAction.write("tag_active", "INTEGER"), setAction.write("tag_expiry", "INTEGER"), setAction.write("tag_label", "TEXT"));
    }

    private static VideoBookmarkTimeline read(Cursor p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String strAudioAttributesImplBaseParcelizer = copyAdaptationSets.AudioAttributesImplBaseParcelizer(p0, "_id");
        String strMediaBrowserCompatItemReceiver = copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, "title");
        int iAudioAttributesCompatParcelizer = copyAdaptationSets.AudioAttributesCompatParcelizer(p0, "start_time");
        int iAudioAttributesCompatParcelizer2 = copyAdaptationSets.AudioAttributesCompatParcelizer(p0, "end_time");
        return new VideoBookmarkTimeline(strAudioAttributesImplBaseParcelizer, strMediaBrowserCompatItemReceiver, Integer.valueOf(iAudioAttributesCompatParcelizer), Integer.valueOf(iAudioAttributesCompatParcelizer2), copyAdaptationSets.AudioAttributesImplApi21Parcelizer(p0, "last_updated"), copyAdaptationSets.AudioAttributesImplBaseParcelizer(p0, "video_id"), copyAdaptationSets.AudioAttributesCompatParcelizer(p0, "bookmark_type"), copyAdaptationSets.RemoteActionCompatParcelizer(p0, "is_active"), null, copyAdaptationSets.RemoteActionCompatParcelizer(p0, "tag_active"), copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, "tag_label"), copyAdaptationSets.AudioAttributesImplApi21Parcelizer(p0, "tag_expiry"), 256, null);
    }

    private static ContentValues read(VideoBookmarkTimeline p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return copyAdaptationSets.IconCompatParcelizer(setAction.write("_id", p0.getId()), setAction.write("title", p0.getTitle()), setAction.write("start_time", p0.getStartTime()), setAction.write("end_time", p0.getEndTime()), setAction.write("last_updated", Long.valueOf(p0.getLastUpdated())), setAction.write("video_id", p0.getVideoId()), setAction.write("bookmark_type", Integer.valueOf(p0.getBookmarkType())), setAction.write("is_active", Integer.valueOf(p0.isActive() ? 1 : 0)));
    }

    public final void AudioAttributesCompatParcelizer(List<VideoBookmarkTimeline> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        for (VideoBookmarkTimeline videoBookmarkTimeline : p0) {
            write(copyAdaptationSets.IconCompatParcelizer(setAction.write("tag_active", Integer.valueOf(videoBookmarkTimeline.isTagActive() ? 1 : 0)), setAction.write("tag_expiry", Long.valueOf(videoBookmarkTimeline.getTagExpiryMs())), setAction.write("tag_label", videoBookmarkTimeline.getTagLabel())), MediaBrowserCompatSearchResultReceiver(), new String[]{videoBookmarkTimeline.getId()});
        }
    }

    public final SyncParam write() {
        Cursor cursorQuery = this.MediaBrowserCompatCustomActionResultReceiver.getContentResolver().query(MediaBrowserCompatItemReceiver(), new String[]{"MAX(last_updated) AS LAST_UPDATED"}, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        Cursor cursor = cursorQuery;
        try {
            Cursor cursor2 = cursor;
            SyncParam syncParam = new SyncParam();
            if (cursor2.moveToFirst()) {
                syncParam.lastUpdated = copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor2, "LAST_UPDATED");
            }
            MagicModuleMetaLSModel.IconCompatParcelizer(cursor, null);
            return syncParam;
        } finally {
        }
    }

    public final VideoBookmarkTimelineModel[] read(String p0, int p1) {
        String string;
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("%s.%s, %s.%s, %s.%s, %s.%s, %s.%s, %s.%s, %s.%s, %s.%s, %s.%s, %s.%s, %s.%s, %s.%s", Arrays.copyOf(new Object[]{"video_bookmark_timeline", "_id", "video_bookmark_timeline", "start_time", "video_bookmark_timeline", "end_time", "video_bookmark_timeline", "title", "video_bookmark_timeline", "bookmark_type", "subj", "_id", "subj", "title", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "title", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_id", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "is_paid", "video_bookmark_timeline", "video_id", "video_timeline_pyt_mapping_table", "pyt_mcq_id"}, 24));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        String str2 = p0;
        if (str2 == null || str2.length() == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder("AND lesson.root_subject_id = '");
            sb.append(p0);
            sb.append("'");
            string = sb.toString();
        }
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String str3 = String.format("%s, %s, %s as %s, %s as %s", Arrays.copyOf(new Object[]{"video_bookmark_timeline", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_subject", "subj", "_subject", "topic"}, 6));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel3 = toMagicModuleStatusUcModel.INSTANCE;
        String str4 = String.format("%s.%s = %s.%s AND %s.%s = %s.%s AND %s.%s = %s.%s", Arrays.copyOf(new Object[]{"video_bookmark_timeline", "video_id", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "video_id", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "root_subject_id", "subj", "_id", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "subject_id", "topic", "_id"}, 12));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel4 = toMagicModuleStatusUcModel.INSTANCE;
        String str5 = String.format("LEFT JOIN %s ON %s.%s=%s.%s", Arrays.copyOf(new Object[]{"video_timeline_pyt_mapping_table", "video_bookmark_timeline", "_id", "video_timeline_pyt_mapping_table", "timeline_id"}, 5));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str5, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel5 = toMagicModuleStatusUcModel.INSTANCE;
        String str6 = String.format("%s.%s = %d AND %s = %d AND %s.%s = 1 AND %s.%s = %d %s", Arrays.copyOf(new Object[]{CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "edition_value", Integer.valueOf(this.RemoteActionCompatParcelizer.onPrepareFromUri()), "bookmark_type", 1, "video_bookmark_timeline", "is_active", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "edition_value", Integer.valueOf(p1), string}, 11));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str6, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel6 = toMagicModuleStatusUcModel.INSTANCE;
        String str7 = String.format("%s.%s, %s.%s, %s.%s, %s", Arrays.copyOf(new Object[]{"subj", "sort_order", "topic", "_id", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "lesson_number", "start_time"}, 7));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str7, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel7 = toMagicModuleStatusUcModel.INSTANCE;
        String str8 = String.format("select %s from %s %s where %s AND %s order by %s", Arrays.copyOf(new Object[]{str, str3, str5, str4, str6, str7}, 6));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str8, "");
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str8);
        if (cursorRemoteActionCompatParcelizer == null) {
            throw new RuntimeException("Wrong query -> cursor returned null");
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (cursorRemoteActionCompatParcelizer.moveToNext()) {
                String string2 = cursorRemoteActionCompatParcelizer.getString(0);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                int i = cursorRemoteActionCompatParcelizer.getInt(1);
                int i2 = cursorRemoteActionCompatParcelizer.getInt(2);
                String string3 = cursorRemoteActionCompatParcelizer.getString(3);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
                String string4 = cursorRemoteActionCompatParcelizer.getString(5);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string4, "");
                String string5 = cursorRemoteActionCompatParcelizer.getString(6);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string5, "");
                String string6 = cursorRemoteActionCompatParcelizer.getString(7);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string6, "");
                String string7 = cursorRemoteActionCompatParcelizer.getString(8);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string7, "");
                boolean z = cursorRemoteActionCompatParcelizer.getInt(9) == 1;
                String string8 = cursorRemoteActionCompatParcelizer.getString(10);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string8, "");
                String strMediaBrowserCompatItemReceiver = copyAdaptationSets.MediaBrowserCompatItemReceiver(cursorRemoteActionCompatParcelizer, "pyt_mcq_id");
                VideoBookmarkTimelineModel videoBookmarkTimelineModel = new VideoBookmarkTimelineModel(string2, i, i2, string3, string7, string6, string4, string5, z, string8, !(strMediaBrowserCompatItemReceiver == null || strMediaBrowserCompatItemReceiver.length() == 0));
                videoBookmarkTimelineModel.setBookmarkType(cursorRemoteActionCompatParcelizer.getInt(4));
                videoBookmarkTimelineModel.setFilterType(p0);
                if (!arrayList.contains(videoBookmarkTimelineModel)) {
                    arrayList.add(videoBookmarkTimelineModel);
                }
            } else {
                return (VideoBookmarkTimelineModel[]) arrayList.toArray(new VideoBookmarkTimelineModel[0]);
            }
        }
    }

    public final SubjectFilterModel[] AudioAttributesCompatParcelizer() {
        int iOnPrepareFromUri = this.RemoteActionCompatParcelizer.onPrepareFromUri();
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("count(*) as _count, %s.%s, %s.%s", Arrays.copyOf(new Object[]{"_subject", "_id", "_subject", "title"}, 4));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String str2 = String.format("%s, %s, %s", Arrays.copyOf(new Object[]{"video_bookmark_timeline", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_subject"}, 3));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel3 = toMagicModuleStatusUcModel.INSTANCE;
        String str3 = String.format("%s.%s=%s.%s AND %s.%s=%s.%s", Arrays.copyOf(new Object[]{"video_bookmark_timeline", "video_id", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "video_id", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "root_subject_id", "_subject", "_id"}, 8));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel4 = toMagicModuleStatusUcModel.INSTANCE;
        String str4 = String.format("%s.%s = %d", Arrays.copyOf(new Object[]{CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "edition_value", Integer.valueOf(iOnPrepareFromUri)}, 3));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel5 = toMagicModuleStatusUcModel.INSTANCE;
        String str5 = String.format("%s.%s = %d", Arrays.copyOf(new Object[]{"video_bookmark_timeline", "bookmark_type", 1}, 3));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str5, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel6 = toMagicModuleStatusUcModel.INSTANCE;
        String str6 = String.format("%s.%s, %s.%s", Arrays.copyOf(new Object[]{"_subject", "_id", "_subject", "title"}, 4));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str6, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel7 = toMagicModuleStatusUcModel.INSTANCE;
        String str7 = String.format("%s.%s", Arrays.copyOf(new Object[]{"_subject", "sort_order"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str7, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel8 = toMagicModuleStatusUcModel.INSTANCE;
        String str8 = String.format("%s.%s = 1", Arrays.copyOf(new Object[]{"video_bookmark_timeline", "is_active"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str8, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel9 = toMagicModuleStatusUcModel.INSTANCE;
        String str9 = String.format("select %s from %s where %s AND %s AND %s AND %s group by %s order by %s", Arrays.copyOf(new Object[]{str, str2, str3, str4, str5, str8, str6, str7}, 8));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str9, "");
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str9);
        if (cursorRemoteActionCompatParcelizer == null) {
            throw new RuntimeException("Wrong query -> cursor returned null");
        }
        ArrayList arrayList = new ArrayList();
        while (cursorRemoteActionCompatParcelizer.moveToNext()) {
            int i = cursorRemoteActionCompatParcelizer.getInt(0);
            String string = cursorRemoteActionCompatParcelizer.getString(1);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            String string2 = cursorRemoteActionCompatParcelizer.getString(2);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
            arrayList.add(new SubjectFilterModel(string, string2, i));
        }
        return (SubjectFilterModel[]) arrayList.toArray(new SubjectFilterModel[0]);
    }

    public final int IconCompatParcelizer(int p0) {
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("%s.%s=%s.%s", Arrays.copyOf(new Object[]{"video_bookmark_timeline", "video_id", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "video_id"}, 4));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String str2 = String.format("%s, %s", Arrays.copyOf(new Object[]{"video_bookmark_timeline", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel3 = toMagicModuleStatusUcModel.INSTANCE;
        String str3 = String.format("%s.%s = %d AND %s.%s > %d AND %s.%s = 1", Arrays.copyOf(new Object[]{CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "edition_value", Integer.valueOf(p0), "video_bookmark_timeline", "bookmark_type", 0, "video_bookmark_timeline", "is_active"}, 8));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel4 = toMagicModuleStatusUcModel.INSTANCE;
        String str4 = String.format("select %s from %s where %s and %s", Arrays.copyOf(new Object[]{"count(*)", str2, str, str3}, 4));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str4);
        if (cursorRemoteActionCompatParcelizer == null) {
            throw new RuntimeException("Wrong query -> cursor returned null");
        }
        if (cursorRemoteActionCompatParcelizer.moveToNext()) {
            return cursorRemoteActionCompatParcelizer.getInt(0);
        }
        return 0;
    }

    public final Map<String, Long> AudioAttributesImplApi21Parcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("%s, %s", Arrays.copyOf(new Object[]{"_id", "last_updated"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String str2 = String.format("%s = '%s'", Arrays.copyOf(new Object[]{"video_id", p0}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        StringBuilder sb = new StringBuilder("select ");
        sb.append(str);
        sb.append(" from video_bookmark_timeline where ");
        sb.append(str2);
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(sb.toString());
        if (cursorRemoteActionCompatParcelizer == null) {
            throw new RuntimeException("Wrong query -> cursor returned null");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursorRemoteActionCompatParcelizer.moveToNext()) {
            linkedHashMap.put(copyAdaptationSets.AudioAttributesImplBaseParcelizer(cursorRemoteActionCompatParcelizer, "_id"), Long.valueOf(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursorRemoteActionCompatParcelizer, "last_updated")));
        }
        return linkedHashMap;
    }

    public final Timeline[] AudioAttributesImplApi26Parcelizer(String p0) {
        List<String> listMediaBrowserCompatItemReceiver;
        Object next;
        toMagicModuleMetaRepoModel.write(p0, "");
        ArrayList arrayList = new ArrayList();
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("%s.*, %s.%s", Arrays.copyOf(new Object[]{"video_bookmark_timeline", "video_timeline_pyt_mapping_table", "pyt_mcq_id"}, 3));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String str2 = String.format("LEFT JOIN %s ON %s.%s=%s.%s", Arrays.copyOf(new Object[]{"video_timeline_pyt_mapping_table", "video_bookmark_timeline", "_id", "video_timeline_pyt_mapping_table", "timeline_id"}, 5));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel3 = toMagicModuleStatusUcModel.INSTANCE;
        String str3 = String.format("%s.%s = '%s'", Arrays.copyOf(new Object[]{"video_bookmark_timeline", "video_id", p0}, 3));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel4 = toMagicModuleStatusUcModel.INSTANCE;
        String str4 = String.format("%s.%s", Arrays.copyOf(new Object[]{"video_bookmark_timeline", "start_time"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
        StringBuilder sb = new StringBuilder("SELECT ");
        sb.append(str);
        sb.append(" FROM video_bookmark_timeline ");
        sb.append(str2);
        sb.append(" WHERE ");
        sb.append(str3);
        sb.append(" ORDER BY ");
        sb.append(str4);
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(sb.toString());
        if (cursorRemoteActionCompatParcelizer == null) {
            throw new RuntimeException("Wrong query -> cursor returned null");
        }
        while (cursorRemoteActionCompatParcelizer.moveToNext()) {
            String strAudioAttributesImplBaseParcelizer = copyAdaptationSets.AudioAttributesImplBaseParcelizer(cursorRemoteActionCompatParcelizer, "_id");
            String strMediaBrowserCompatItemReceiver = copyAdaptationSets.MediaBrowserCompatItemReceiver(cursorRemoteActionCompatParcelizer, "pyt_mcq_id");
            ArrayList arrayList2 = new ArrayList();
            if (strMediaBrowserCompatItemReceiver != null) {
                arrayList2.add(strMediaBrowserCompatItemReceiver);
            }
            Iterator it = arrayList.iterator();
            while (true) {
                listMediaBrowserCompatItemReceiver = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((Timeline) next).getTimelineId(), (Object) strAudioAttributesImplBaseParcelizer)) {
                    break;
                }
            }
            Timeline timeline = (Timeline) next;
            if (timeline != null) {
                List<String> pytMcqIds = timeline.getPytMcqIds();
                if (pytMcqIds != null) {
                    listMediaBrowserCompatItemReceiver = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) pytMcqIds);
                    listMediaBrowserCompatItemReceiver.addAll(arrayList2);
                }
                timeline.setPytMcqIds(listMediaBrowserCompatItemReceiver);
            } else {
                arrayList.add(new Timeline(strAudioAttributesImplBaseParcelizer, copyAdaptationSets.AudioAttributesCompatParcelizer(cursorRemoteActionCompatParcelizer, "start_time"), copyAdaptationSets.AudioAttributesCompatParcelizer(cursorRemoteActionCompatParcelizer, "end_time"), copyAdaptationSets.AudioAttributesImplBaseParcelizer(cursorRemoteActionCompatParcelizer, "title"), copyAdaptationSets.AudioAttributesCompatParcelizer(cursorRemoteActionCompatParcelizer, "bookmark_type"), arrayList2, copyAdaptationSets.RemoteActionCompatParcelizer(cursorRemoteActionCompatParcelizer, "tag_active"), copyAdaptationSets.MediaBrowserCompatItemReceiver(cursorRemoteActionCompatParcelizer, "tag_label"), copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursorRemoteActionCompatParcelizer, "tag_expiry")));
            }
        }
        return (Timeline[]) arrayList.toArray(new Timeline[0]);
    }
}
