package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.api.models.response.sync.CrossDeviceSyncData;
import com.marrow.data.api.models.response.sync.CrossDeviceSyncResponseObject;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow.data.models.lesson.LessonIndex;
import com.marrow.data.models.lesson.LessonSyncUserLocalModel;
import com.marrow.data.models.lesson.RevisionSubjectStatusModel;
import com.marrow.data.models.lesson.home.HomeLessonIndexV2;
import com.marrow.data.models.mcq.schema.SchemaLessonItem;
import com.marrow.data.models.subject.Subject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.IntFunction;
import kotlin.AdsMediaSourceExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes.dex */
public final class onDashManifestPublishTimeExpired extends primaryTrack<LessonIndex> implements resolveUtcTimingElement {

    /* JADX INFO: loaded from: classes3.dex */
    public static class IconCompatParcelizer {
        public int AudioAttributesCompatParcelizer;
        public String write;
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(Object obj) {
        return AudioAttributesCompatParcelizer((LessonIndex) obj);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ Object RemoteActionCompatParcelizer(Cursor cursor) {
        return AudioAttributesCompatParcelizer(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ Object[] RemoteActionCompatParcelizer(int i) {
        return IconCompatParcelizer(i);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* bridge */ /* synthetic */ ContentValues write(Object obj) {
        return write((LessonIndex) obj);
    }

    public final int write(List<String> list, List<String> list2) {
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer("lesson.root_subject_id", list);
        String str = read("lesson.edition_value", new String[]{String.valueOf(((primaryTrack) this).IconCompatParcelizer.onPrepareFromUri()), SessionDescription.SUPPORTED_SDP_VERSION});
        String str2 = String.format("%s.%s = %s.%s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "subject_id", "_subject", "_id");
        String str3 = read("_subject.group_id", (String[]) list2.toArray(new String[0]));
        StringBuilder sb = new StringBuilder("lesson._status = 2 AND ");
        sb.append(strRemoteActionCompatParcelizer);
        sb.append(" AND ");
        sb.append(str);
        sb.append(" AND ");
        sb.append(str2);
        sb.append(" AND ");
        sb.append(str3);
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(String.format("SELECT COUNT(*) FROM %s INNER JOIN %s ON %s.%s = %s.%s WHERE %s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_subject", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "subject_id", "_subject", "_id", sb.toString()));
        if (cursorRemoteActionCompatParcelizer == null) {
            return 0;
        }
        try {
            return cursorRemoteActionCompatParcelizer.moveToFirst() ? cursorRemoteActionCompatParcelizer.getInt(0) : 0;
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }

    public onDashManifestPublishTimeExpired(Context context, getStreamPositionUsForContent getstreampositionusforcontent) {
        super(context, CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, getstreampositionusforcontent);
    }

    @Override // kotlin.primaryTrack, kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        LinkedHashMap<String, String> linkedHashMapRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer();
        linkedHashMapRemoteActionCompatParcelizer.put("_id", "TEXT PRIMARY KEY NOT NULL");
        linkedHashMapRemoteActionCompatParcelizer.put("title", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("sub_title", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("subject_id", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("root_subject_id", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("video_id", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("published_on", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("published_status", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("parent_ids", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("last_updated", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("lesson_read_time", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("intro", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("image_url", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("is_paid", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("_status", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("possible_score", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("score", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("rating_count", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("ppl_rated", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("ppl_solved", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("lesson_number", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("master_order", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("is_updated", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("mcq_count", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("my_rating", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("boolean_flags", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("do_not_consider", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("completion_time_ms", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("last_attempted_time_ms", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("percentile", "REAL");
        linkedHashMapRemoteActionCompatParcelizer.put("is_opt", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("has_video_subtitle", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("edition_value", "INTEGER NOT NULL");
        linkedHashMapRemoteActionCompatParcelizer.put("lesson_activity", "INTEGER NOT NULL");
        linkedHashMapRemoteActionCompatParcelizer.put("pyt_mcq_count", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("active_new", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("new_expiry", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("tag_type", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("tag_active", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("tag_expiry", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("tag_label", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("lesson_type", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("ar_qbank_id", "TEXT");
        return linkedHashMapRemoteActionCompatParcelizer;
    }

    private static LessonIndex AudioAttributesCompatParcelizer(Cursor cursor) {
        LessonIndex lessonIndex = new LessonIndex();
        lessonIndex.setId(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "_id"));
        lessonIndex.setScore(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "score"));
        lessonIndex.setStatus(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "_status"));
        lessonIndex.setIntro(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "intro"));
        lessonIndex.setTitle(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "title"));
        lessonIndex.setPaid(copyAdaptationSets.RemoteActionCompatParcelizer(cursor, "is_paid"));
        lessonIndex.setMCQCount(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "mcq_count"));
        lessonIndex.setMyRating(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "my_rating"));
        lessonIndex.setSubTitle(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "sub_title"));
        lessonIndex.setImageUrl(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "image_url"));
        lessonIndex.setParentIds(copyAdaptationSets.AudioAttributesImplApi26Parcelizer(cursor, "parent_ids"));
        lessonIndex.setSubjectId(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "subject_id"));
        lessonIndex.setMasterOrder(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "master_order"));
        lessonIndex.setRatingCount(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "rating_count"));
        lessonIndex.setLastUpdated(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "last_updated"));
        lessonIndex.setBooleanFlags(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "boolean_flags"));
        lessonIndex.setLessonNumber(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "lesson_number"));
        lessonIndex.setPossibleScore(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "possible_score"));
        lessonIndex.setPublishedTime(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "published_on"));
        lessonIndex.setRootSubjectId(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "root_subject_id"));
        lessonIndex.setVideoId(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "video_id"));
        lessonIndex.setDontConsider(copyAdaptationSets.RemoteActionCompatParcelizer(cursor, "do_not_consider"));
        lessonIndex.setPeopleSolved(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "ppl_solved"));
        lessonIndex.setServerContentUpdated(copyAdaptationSets.RemoteActionCompatParcelizer(cursor, "is_updated"));
        lessonIndex.setTotalPeopleRated(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "ppl_rated"));
        lessonIndex.setPublishedStatus(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "published_status"));
        lessonIndex.setLessonReadTimeText(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "lesson_read_time"));
        lessonIndex.setCourseId(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, FilterParams.KEY_COURSE_ID));
        lessonIndex.setCompletionTimeMs(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "completion_time_ms"));
        lessonIndex.setLastAttemptedTimeMs(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "last_attempted_time_ms"));
        lessonIndex.setPercentile(copyAdaptationSets.read(cursor, "percentile"));
        lessonIndex.setOptional(copyAdaptationSets.RemoteActionCompatParcelizer(cursor, "is_opt"));
        lessonIndex.setHasVideoSubtitle(copyAdaptationSets.RemoteActionCompatParcelizer(cursor, "has_video_subtitle"));
        lessonIndex.setEditionValue(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "edition_value"));
        lessonIndex.setLessonActivityStatus(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "lesson_activity"));
        lessonIndex.setPytMcqCount(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "pyt_mcq_count"));
        lessonIndex.setNewTagToShow(copyAdaptationSets.RemoteActionCompatParcelizer(cursor, "active_new"));
        lessonIndex.setNewExpiryTimeMs(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "new_expiry"));
        lessonIndex.setTagType(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "tag_type"));
        lessonIndex.setTagActive(copyAdaptationSets.RemoteActionCompatParcelizer(cursor, "tag_active"));
        lessonIndex.setTagExpiryMs(copyAdaptationSets.AudioAttributesImplApi21Parcelizer(cursor, "tag_expiry"));
        lessonIndex.setTagLabel(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "tag_label"));
        lessonIndex.setLessonType(copyAdaptationSets.AudioAttributesCompatParcelizer(cursor, "lesson_type"));
        lessonIndex.setActiveRecallQbankId(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, "ar_qbank_id"));
        return lessonIndex;
    }

    private static ContentValues write(LessonIndex lessonIndex) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", lessonIndex.getId());
        contentValues.put("title", lessonIndex.getTitle());
        contentValues.put("intro", lessonIndex.getIntro());
        contentValues.put("is_paid", Boolean.valueOf(lessonIndex.isPaid()));
        contentValues.put("score", Integer.valueOf(lessonIndex.getScore()));
        contentValues.put("_status", Integer.valueOf(lessonIndex.getStatus()));
        contentValues.put(FilterParams.KEY_COURSE_ID, Integer.valueOf(lessonIndex.getCourseId()));
        contentValues.put("image_url", lessonIndex.getImageUrl());
        contentValues.put("mcq_count", Integer.valueOf(lessonIndex.getMCQCount()));
        contentValues.put("my_rating", Integer.valueOf(lessonIndex.getMyRating()));
        contentValues.put("sub_title", lessonIndex.getSubTitle());
        contentValues.put("subject_id", lessonIndex.getSubjectId());
        contentValues.put("master_order", Integer.valueOf(lessonIndex.getMasterOrder()));
        contentValues.put("last_updated", Long.valueOf(lessonIndex.getLastUpdated()));
        contentValues.put("rating_count", Integer.valueOf(lessonIndex.getRatingCount()));
        contentValues.put("boolean_flags", Integer.valueOf(lessonIndex.getBooleanFlags()));
        contentValues.put("lesson_number", Integer.valueOf(lessonIndex.getLessonNumber()));
        contentValues.put("published_on", Long.valueOf(lessonIndex.getPublishedTime()));
        contentValues.put("root_subject_id", lessonIndex.getRootSubjectId());
        contentValues.put("video_id", lessonIndex.getVideoId());
        contentValues.put("possible_score", Integer.valueOf(lessonIndex.getPossibleScore()));
        contentValues.put("ppl_solved", Integer.valueOf(lessonIndex.getPeopleSolved()));
        contentValues.put("is_updated", Boolean.valueOf(lessonIndex.isIsServerContentUpdated()));
        contentValues.put("published_status", lessonIndex.getPublishedStatus());
        contentValues.put("completion_time_ms", Long.valueOf(lessonIndex.getCompletionTimeMs()));
        contentValues.put("ppl_rated", Integer.valueOf(lessonIndex.getTotalPeopleRated()));
        contentValues.put("lesson_read_time", lessonIndex.getLessonReadTimeText());
        contentValues.put("do_not_consider", Integer.valueOf(lessonIndex.isDontConsider() ? 1 : 0));
        contentValues.put("parent_ids", copyAdaptationSets.read(lessonIndex.getParentIds()));
        contentValues.put("last_attempted_time_ms", Long.valueOf(lessonIndex.getLastAttemptedTimeMs()));
        contentValues.put("percentile", Float.valueOf(lessonIndex.getPercentile()));
        contentValues.put("is_opt", Boolean.valueOf(lessonIndex.isOptional()));
        contentValues.put("has_video_subtitle", (Integer) 0);
        contentValues.put("edition_value", Integer.valueOf(lessonIndex.getEditionValue()));
        contentValues.put("lesson_activity", Integer.valueOf(lessonIndex.getLessonActivityStatus()));
        contentValues.put("pyt_mcq_count", Integer.valueOf(lessonIndex.getPytMcqCount()));
        contentValues.put("active_new", Integer.valueOf(lessonIndex.isActiveForNewTag() ? 1 : 0));
        contentValues.put("new_expiry", Long.valueOf(lessonIndex.getExpiryTimeMs()));
        contentValues.put("tag_type", lessonIndex.getTagType());
        contentValues.put("tag_active", Integer.valueOf(lessonIndex.isTagActive() ? 1 : 0));
        contentValues.put("tag_expiry", Long.valueOf(lessonIndex.getTagExpiryMs()));
        contentValues.put("tag_label", lessonIndex.getTagLabel());
        contentValues.put("lesson_type", Integer.valueOf(lessonIndex.getLessonType()));
        contentValues.put("ar_qbank_id", lessonIndex.getActiveRecallQbankId());
        return contentValues;
    }

    public final LessonIndex AudioAttributesImplApi21Parcelizer(String str) {
        return a_(str);
    }

    public final void read(String[] strArr) {
        MediaBrowserCompatItemReceiver("_id", strArr);
    }

    private void write(LessonIndex[] lessonIndexArr) {
        if (lessonIndexArr == null || lessonIndexArr.length == 0) {
            return;
        }
        for (LessonIndex lessonIndex : lessonIndexArr) {
            IconCompatParcelizer(AudioAttributesCompatParcelizer(lessonIndex));
        }
    }

    private void AudioAttributesCompatParcelizer(LessonIndex[] lessonIndexArr) {
        if (lessonIndexArr == null || lessonIndexArr.length == 0) {
            return;
        }
        int length = lessonIndexArr.length;
        Uri uriMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        ContentValues[] contentValuesArr = new ContentValues[length];
        for (int i = 0; i < length; i++) {
            contentValuesArr[i] = write(lessonIndexArr[i]);
        }
        this.MediaBrowserCompatCustomActionResultReceiver.getContentResolver().bulkInsert(uriMediaBrowserCompatItemReceiver, contentValuesArr);
    }

    @Override // kotlin.DashMediaPeriodTrackGroupInfoTrackGroupCategory
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void AudioAttributesCompatParcelizer(LessonIndex lessonIndex) {
        if (!lessonIndex.isPublished()) {
            super.AudioAttributesCompatParcelizer(lessonIndex);
        } else {
            super.AudioAttributesCompatParcelizer(lessonIndex);
        }
    }

    private void IconCompatParcelizer(LessonIndex[] lessonIndexArr) {
        for (LessonIndex lessonIndex : lessonIndexArr) {
            AudioAttributesCompatParcelizer(lessonIndex);
        }
    }

    private void RemoteActionCompatParcelizer(LessonIndex[] lessonIndexArr) {
        LessonIndex[] lessonIndexArrAudioAttributesCompatParcelizer;
        if (lessonIndexArr == null || lessonIndexArr.length == 0) {
            return;
        }
        LessonIndex[] lessonIndexArrWrite = buildAdaptationSet.write(lessonIndexArr);
        if (lessonIndexArrWrite == null || lessonIndexArrWrite.length <= 0) {
            lessonIndexArrAudioAttributesCompatParcelizer = lessonIndexArr;
        } else {
            write(lessonIndexArrWrite);
            lessonIndexArrAudioAttributesCompatParcelizer = buildAdaptationSet.AudioAttributesCompatParcelizer(lessonIndexArr);
        }
        if (IconCompatParcelizer("_id", buildAdaptationSet.RemoteActionCompatParcelizer(lessonIndexArr)) == 0) {
            AudioAttributesCompatParcelizer(lessonIndexArrAudioAttributesCompatParcelizer);
        } else {
            IconCompatParcelizer(lessonIndexArr);
        }
    }

    @Override // kotlin.DashMediaPeriodTrackGroupInfoTrackGroupCategory
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(LessonIndex[] lessonIndexArr) {
        RemoteActionCompatParcelizer(lessonIndexArr);
    }

    private static LessonIndex[] IconCompatParcelizer(int i) {
        return new LessonIndex[i];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "_id =? ";
    }

    private static String[] AudioAttributesCompatParcelizer(LessonIndex lessonIndex) {
        return new String[]{lessonIndex.getId()};
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: merged with bridge method [inline-methods] */
    public final LessonIndex a_(String... strArr) {
        return (LessonIndex) super.a_(strArr);
    }

    public final LessonIndex[] handleMediaPlayPauseIfPendingOnHandler(String str) {
        return RemoteActionCompatParcelizer(str, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LessonIndex[] RemoteActionCompatParcelizer(String str, int i) {
        return (LessonIndex[]) a_(String.format(Locale.getDefault(), "SELECT %s FROM %s, %s WHERE %s AND %s AND %s %s ORDER BY %s", "lesson.*", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_subject", String.format(Locale.getDefault(), "%s.%s='%s'", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "root_subject_id", str), String.format(Locale.getDefault(), "%s.%s & %d != %d", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "boolean_flags", 2, 2), String.format(Locale.getDefault(), "%s.%s=%s.%s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "subject_id", "_subject", "_id"), read(i), String.format(Locale.getDefault(), "%s.%s, %s.%s, %s.%s", "_subject", "sort_order", "_subject", "_id", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "lesson_number")));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LessonIndex[] AudioAttributesCompatParcelizer(String str, int i) {
        String str2 = String.format(Locale.getDefault(), "%s.%s='%s'", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "root_subject_id", str);
        String str3 = String.format(Locale.getDefault(), "%s.%s & %d == %d", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "boolean_flags", 2, 2);
        String str4 = String.format(Locale.getDefault(), "%s.%s=%s.%s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "subject_id", "_subject", "_id");
        String str5 = String.format(Locale.getDefault(), "%s.%s=%d", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "edition_value", Integer.valueOf(((primaryTrack) this).IconCompatParcelizer.onPrepareFromUri()));
        String str6 = read(i);
        String str7 = String.format(Locale.getDefault(), "%s.%s, %s.%s, %s.%s", "_subject", "sort_order", "_subject", "_id", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "lesson_number");
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder("SELECT %s FROM %s, %s WHERE %s AND %s AND %s AND %s");
        sb.append(" AND lesson.is_opt=0");
        sb.append("%s ORDER BY %s");
        return (LessonIndex[]) a_(String.format(locale, sb.toString(), "lesson.*", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_subject", str2, str3, str4, str5, str6, str7));
    }

    public final RevisionSubjectStatusModel AudioAttributesImplBaseParcelizer(String str, String str2) {
        String str3;
        int i;
        int i2;
        int i3;
        int iOnPrepareFromUri = ((primaryTrack) this).IconCompatParcelizer.onPrepareFromUri();
        String str4 = String.format(Locale.getDefault(), " AND %s = 0", "is_opt");
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = String.format(Locale.getDefault(), " AND %s = '%s'", "subject_id", str2);
        }
        int i4 = 0;
        Cursor cursorRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer(String.format(Locale.getDefault(), "SELECT %s, COUNT(*), SUM(CASE WHEN %s = %d THEN 1 ELSE 0 END) FROM %s WHERE %s = '%s'%s AND ((%s = %d AND %s = %d) OR (%s = %d AND %s IN (%d, %d)))%s GROUP BY %s", "lesson_type", "_status", 2, CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "root_subject_id", str, str3, "lesson_type", 0, "edition_value", Integer.valueOf(iOnPrepareFromUri), "lesson_type", 2, "edition_value", 0, Integer.valueOf(iOnPrepareFromUri), str4, "lesson_type"));
        if (cursorRemoteActionCompatParcelizer != null) {
            int i5 = 0;
            i = 0;
            i2 = 0;
            i3 = 0;
            while (cursorRemoteActionCompatParcelizer.moveToNext()) {
                try {
                    int i6 = cursorRemoteActionCompatParcelizer.getInt(0);
                    int i7 = cursorRemoteActionCompatParcelizer.getInt(1);
                    int i8 = cursorRemoteActionCompatParcelizer.getInt(2);
                    if (i6 == 0) {
                        i5 = i7;
                        i = i8;
                    } else if (i6 == 2) {
                        i2 = i7;
                        i3 = i8;
                    }
                } catch (Throwable th) {
                    cursorRemoteActionCompatParcelizer.close();
                    throw th;
                }
            }
            cursorRemoteActionCompatParcelizer.close();
            i4 = i5;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        return new RevisionSubjectStatusModel(i4, i, i3, i2);
    }

    public final float onCustomAction(String str) {
        Cursor cursorRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer(String.format(Locale.getDefault(), "SELECT SUM(CAST(%s AS REAL)) * 100.0 / SUM(CAST(%s AS REAL)) FROM %s WHERE %s = '%s' AND %s = %d AND %s = %d AND %s > 0", "score", "possible_score", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "root_subject_id", str, "lesson_type", 2, "_status", 2, "possible_score"));
        float f = BitmapDescriptorFactory.HUE_RED;
        if (cursorRemoteActionCompatParcelizer == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        try {
            if (!cursorRemoteActionCompatParcelizer.moveToFirst()) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            if (!cursorRemoteActionCompatParcelizer.isNull(0)) {
                f = cursorRemoteActionCompatParcelizer.getFloat(0);
            }
            return f;
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }

    @Override // kotlin.primaryTrack
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LessonIndex[] read(String str, String[] strArr, String str2) {
        return (LessonIndex[]) super.read(str, strArr, str2);
    }

    public final IconCompatParcelizer[] onAddQueueItem(String str) {
        Cursor cursorRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer(str);
        if (cursorRemoteActionCompatParcelizer == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            if (cursorRemoteActionCompatParcelizer.moveToFirst()) {
                do {
                    IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
                    iconCompatParcelizer.write = copyAdaptationSets.MediaBrowserCompatItemReceiver(cursorRemoteActionCompatParcelizer, "_id");
                    iconCompatParcelizer.AudioAttributesCompatParcelizer = copyAdaptationSets.AudioAttributesCompatParcelizer(cursorRemoteActionCompatParcelizer, "_status");
                    arrayList.add(iconCompatParcelizer);
                } while (cursorRemoteActionCompatParcelizer.moveToNext());
            }
            return (IconCompatParcelizer[]) arrayList.toArray(new IconCompatParcelizer[arrayList.size()]);
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }

    public final void AudioAttributesImplApi21Parcelizer(String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_status", Integer.valueOf(i));
        RemoteActionCompatParcelizer(contentValues, "_id", str);
    }

    public final void read(CrossDeviceSyncResponseObject crossDeviceSyncResponseObject) {
        CrossDeviceSyncData crossDeviceSyncData = crossDeviceSyncResponseObject.innerData;
        String strMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver();
        String[] strArr = {crossDeviceSyncResponseObject.contentId};
        if (write(MediaBrowserCompatSearchResultReceiver(), strArr) <= 0) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("score", Integer.valueOf(crossDeviceSyncData.score));
        contentValues.put("possible_score", Integer.valueOf(crossDeviceSyncData.possibleScore));
        contentValues.put("_status", Integer.valueOf(crossDeviceSyncData.status));
        contentValues.put("is_updated", (Integer) 1);
        contentValues.put("completion_time_ms", Long.valueOf(crossDeviceSyncData.userSubmissionTimestamp));
        write(contentValues, strMediaBrowserCompatSearchResultReceiver, strArr);
    }

    public final String MediaDescriptionCompat(String str) {
        return write("root_subject_id", MediaBrowserCompatSearchResultReceiver(), new String[]{str});
    }

    public final void write(String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_status", Integer.valueOf(i));
        write(contentValues, MediaBrowserCompatSearchResultReceiver(), new String[]{str});
    }

    public final void IconCompatParcelizer(String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("my_rating", Integer.valueOf(i));
        write(contentValues, MediaBrowserCompatSearchResultReceiver(), new String[]{str});
    }

    public final int MediaBrowserCompatMediaItem(String str) {
        return AudioAttributesCompatParcelizer("my_rating", MediaBrowserCompatSearchResultReceiver(), new String[]{str});
    }

    @Override // kotlin.primaryTrack, kotlin.getIntervalUntilNextManifestRefreshMs
    public final String[] read(String str, String str2, String[] strArr, String str3) {
        return super.read(str, str2, strArr, str3);
    }

    public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(String str) {
        return AudioAttributesCompatParcelizer("is_updated", MediaBrowserCompatSearchResultReceiver(), new String[]{str}) == 1;
    }

    public final void AudioAttributesCompatParcelizer(String str, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("completion_time_ms", Long.valueOf(j));
        contentValues.put("_status", (Integer) 2);
        contentValues.put("lesson_activity", (Integer) 2);
        RemoteActionCompatParcelizer(contentValues, "_id", str);
    }

    public final void write(String str, int i, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("possible_score", Integer.valueOf(i));
        contentValues.put("score", Integer.valueOf(i2));
        RemoteActionCompatParcelizer(contentValues, "_id", str);
    }

    public final void read(String str, float f) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("percentile", Float.valueOf(f));
        RemoteActionCompatParcelizer(contentValues, "_id", str);
    }

    public final void write(String str, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("last_attempted_time_ms", Long.valueOf(j));
        RemoteActionCompatParcelizer(contentValues, "_id", str);
    }

    @Override // kotlin.resolveUtcTimingElement
    public final LessonIndex IconCompatParcelizer(String str) {
        return (LessonIndex) super.a_(str);
    }

    public final LessonIndex MediaBrowserCompatItemReceiver(String str) {
        return (LessonIndex) super.write("ar_qbank_id", str);
    }

    public final AdsMediaSourceExternalSyntheticLambda1 MediaBrowserCompatItemReceiver(String str, String str2) {
        String str3;
        String str4 = String.format(Locale.getDefault(), "l._id, l.title, l.root_subject_id, sr.title, l.subject_id, sc.title", new Object[0]);
        String str5 = String.format(Locale.getDefault(), "lesson l LEFT JOIN _subject sr ON l.root_subject_id = sr._id LEFT JOIN _subject sc ON l.subject_id = sc._id", new Object[0]);
        if (parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) str2)) {
            str3 = String.format(Locale.getDefault(), "l.video_id = '%s'", str);
        } else {
            str3 = String.format(Locale.getDefault(), "l._id = '%s'", str2);
        }
        String str6 = String.format(Locale.getDefault(), "SELECT %s FROM %s WHERE %s", str4, str5, str3);
        AdsMediaSourceExternalSyntheticLambda1.Companion companion = AdsMediaSourceExternalSyntheticLambda1.INSTANCE;
        AdsMediaSourceExternalSyntheticLambda1 adsMediaSourceExternalSyntheticLambda1Write = AdsMediaSourceExternalSyntheticLambda1.Companion.write();
        Cursor cursorRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer(str6);
        if (cursorRemoteActionCompatParcelizer == null) {
            return adsMediaSourceExternalSyntheticLambda1Write;
        }
        try {
            if (cursorRemoteActionCompatParcelizer.moveToFirst()) {
                adsMediaSourceExternalSyntheticLambda1Write = new AdsMediaSourceExternalSyntheticLambda1(cursorRemoteActionCompatParcelizer.getString(0), cursorRemoteActionCompatParcelizer.getString(1), cursorRemoteActionCompatParcelizer.getString(2), cursorRemoteActionCompatParcelizer.getString(3), cursorRemoteActionCompatParcelizer.getString(4), cursorRemoteActionCompatParcelizer.getString(5));
            }
            return adsMediaSourceExternalSyntheticLambda1Write;
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LessonIndex RemoteActionCompatParcelizer(String str, boolean z) {
        StringBuilder sb = new StringBuilder("select lesson.* from lesson inner join _subject rs, _subject ps on lesson.root_subject_id=rs._id and lesson.subject_id=ps._id where (lesson.boolean_flags & 3) = 2 and lesson.edition_value = ");
        sb.append(((primaryTrack) this).IconCompatParcelizer.onPrepareFromUri());
        sb.append(z ? " AND lesson.is_opt = 0" : "");
        sb.append(" order by rs.sort_order, rs._id, ps.sort_order, ps._id, lesson.lesson_number");
        LessonIndex[] lessonIndexArr = (LessonIndex[]) a_(sb.toString());
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= lessonIndexArr.length) {
                break;
            }
            if (lessonIndexArr[i2].getId().equals(str)) {
                i = i2;
                break;
            }
            i2++;
        }
        do {
            i++;
            if (i >= lessonIndexArr.length) {
                return new LessonIndex();
            }
        } while (lessonIndexArr[i].getStatus() == 2);
        return lessonIndexArr[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: merged with bridge method [inline-methods] */
    public LessonIndex[] MediaBrowserCompatCustomActionResultReceiver(String str, String[] strArr) {
        return (LessonIndex[]) super.MediaBrowserCompatCustomActionResultReceiver(str, strArr);
    }

    public final ArrayList<String> AudioAttributesImplApi26Parcelizer(String str) {
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(String.format(Locale.getDefault(), "SELECT %s FROM %s WHERE %s ORDER BY %s", String.format(Locale.getDefault(), "%s.%s", "concise_parent_info", "parent_video_id"), String.format(Locale.getDefault(), "%s, %s", "concise_parent_info", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON), String.format(Locale.getDefault(), "%s.%s=%s.%s AND %s.%s=%d AND %s.%s='%s'", "concise_parent_info", "concise_id", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_id", "concise_parent_info", "is_intern_module", 1, CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "root_subject_id", str), String.format(Locale.getDefault(), "%s.%s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "lesson_number")));
        if (cursorRemoteActionCompatParcelizer == null) {
            return new ArrayList<>();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            if (cursorRemoteActionCompatParcelizer.moveToFirst()) {
                do {
                    String string = cursorRemoteActionCompatParcelizer.getString(0);
                    if (!arrayList.contains(string)) {
                        arrayList.add(string);
                    }
                } while (cursorRemoteActionCompatParcelizer.moveToNext());
            }
            return arrayList;
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }

    public final HashMap<String, ArrayList<LessonIndex>> MediaBrowserCompatCustomActionResultReceiver(String str) {
        ArrayList<LessonIndex> arrayList;
        Cursor cursorRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer(String.format(Locale.getDefault(), "select %s from %s where %s order by %s", String.format(Locale.getDefault(), " %s.%s, %s.* ", "concise_parent_info", "parent_video_id", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON), String.format(Locale.getDefault(), " %s, %s ", "concise_parent_info", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON), String.format(Locale.getDefault(), " %s %s", String.format(Locale.getDefault(), "%s.%s = %s.%s", "concise_parent_info", "concise_id", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_id"), String.format(Locale.getDefault(), " AND %s.%s = %d AND %s = '%s'", "concise_parent_info", "is_intern_module", 1, "parent_video_id", str)), String.format(Locale.getDefault(), "%s.%s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "lesson_number")));
        if (cursorRemoteActionCompatParcelizer == null) {
            return new HashMap<>();
        }
        HashMap<String, ArrayList<LessonIndex>> map = new HashMap<>();
        try {
            if (cursorRemoteActionCompatParcelizer.moveToFirst()) {
                do {
                    String string = cursorRemoteActionCompatParcelizer.getString(0);
                    if (map.containsKey(string)) {
                        arrayList = map.get(string);
                    } else {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(AudioAttributesCompatParcelizer(cursorRemoteActionCompatParcelizer));
                    map.put(string, arrayList);
                } while (cursorRemoteActionCompatParcelizer.moveToNext());
            }
            return map;
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }

    private static String read(int i) {
        if (i == 0 || i == 1 || i == 2) {
            return String.format(Locale.getDefault(), " AND %s.%s = %d", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_status", Integer.valueOf(i));
        }
        if (i == 3) {
            return String.format(Locale.getDefault(), " AND %s.%s = %d", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "is_paid", 0);
        }
        if (i == 4) {
            return String.format(Locale.getDefault(), " AND %s AND %s.%s != %d", AudioAttributesImplBaseParcelizer("lesson."), CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_status", 2);
        }
        return "";
    }

    public static String AudioAttributesImplBaseParcelizer(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return String.format(Locale.getDefault(), "( (%s%s = '%s' AND %s%s = %d AND (%s%s = %d OR %s%s > %d)) OR ((%s%s IS NULL OR %s%s = '') AND %s%s = %d AND %s%s > %d) )", str, "tag_type", LessonIndex.TAG_TYPE_NEW, str, "tag_active", 1, str, "tag_expiry", 0, str, "tag_expiry", Long.valueOf(jCurrentTimeMillis), str, "tag_type", str, "tag_type", str, "active_new", 1, str, "new_expiry", Long.valueOf(jCurrentTimeMillis));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LessonIndex[] MediaBrowserCompatSearchResultReceiver(String str) {
        return (LessonIndex[]) a_(String.format("SELECT %s.* from %s JOIN %s ON %s.%s == %s.%s AND %s.%s = '%s' AND %s.%s = %d ORDER BY %s.%s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "concise_parent_info", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_id", "concise_parent_info", "concise_id", "concise_parent_info", "parent_video_id", str, "concise_parent_info", "is_related_module", 1, CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_id"));
    }

    public final void read(String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("lesson_activity", Integer.valueOf(i));
        contentValues.put("last_attempted_time_ms", Long.valueOf(System.currentTimeMillis()));
        RemoteActionCompatParcelizer(contentValues, "_id", str);
    }

    public final ArrayList<SchemaLessonItem> onCommand(String str) {
        String str2 = String.format("select %s from %s where %s order by %s", String.format("DISTINCT(%s.%s), %s.%s, %s.%s, %s.%s, %s.%s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_id", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "title", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "completion_time_ms", "_subject", "title", "mcq_hyt", "parent_id"), String.format("%s, %s, %s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_subject", "mcq_hyt"), String.format("%s.%s = %s.%s AND %s.%s = %s.%s AND %s.%s = '%s'", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "root_subject_id", "_subject", "_id", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_id", "mcq_hyt", "lesson_id", "mcq_hyt", "hyt_id", str), String.format(Locale.getDefault(), "%s.%s, %s.%s, %s.%s", "_subject", "sort_order", "_subject", "_id", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "lesson_number"));
        Cursor cursorRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer(str2);
        if (cursorRemoteActionCompatParcelizer == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("incorrect");
            throw new RuntimeException(sb.toString());
        }
        ArrayList<SchemaLessonItem> arrayList = new ArrayList<>();
        try {
            if (cursorRemoteActionCompatParcelizer.moveToFirst()) {
                do {
                    arrayList.add(new SchemaLessonItem(cursorRemoteActionCompatParcelizer.getString(0), cursorRemoteActionCompatParcelizer.getString(1), cursorRemoteActionCompatParcelizer.getLong(2), cursorRemoteActionCompatParcelizer.getString(3), cursorRemoteActionCompatParcelizer.getString(4)));
                } while (cursorRemoteActionCompatParcelizer.moveToNext());
            }
            return arrayList;
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }

    public final HomeLessonIndexV2 AudioAttributesCompatParcelizer(int i, int i2, int i3) {
        String str;
        boolean z = i == 2;
        if (z) {
            str = "boolean_flags & 2 = 2";
        } else {
            str = "boolean_flags & 2 != 2";
        }
        String str2 = str;
        String strConcat = "edition_value = ".concat(String.valueOf(!z ? 0 : i2));
        LessonIndex[] lessonIndexArr = read(str2, strConcat, "boolean_flags & 1 != 1", (String) null, i3);
        if (lessonIndexArr != null) {
            int length = lessonIndexArr.length;
        }
        if (!parseCea608AccessibilityChannel.read(lessonIndexArr)) {
            LessonIndex lessonIndex = lessonIndexArr[0];
            lessonIndex.getId();
            lessonIndex.getStatus();
            lessonIndex.getLessonActivityStatus();
            if (lessonIndex.getLessonActivityStatus() == 1 && lessonIndex.getStatus() == 1) {
                lessonIndex.getId();
                return lessonIndex.toHomeLessonIndex(1);
            }
            if (lessonIndex.getLessonActivityStatus() == 2 || lessonIndex.getStatus() == 2) {
                String strWrite = write(lessonIndex.getId(), strConcat, str2, "boolean_flags & 1 != 1", i3);
                if (!parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) strWrite)) {
                    LessonIndex lessonIndexAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(strWrite);
                    lessonIndexAudioAttributesImplApi21Parcelizer.getId();
                    return lessonIndexAudioAttributesImplApi21Parcelizer.toHomeLessonIndex(2);
                }
                HomeLessonIndexV2 homeLessonIndexV2RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(lessonIndexArr, strConcat, str2, "boolean_flags & 1 != 1", null, i3);
                if (homeLessonIndexV2RemoteActionCompatParcelizer != null) {
                    Objects.toString(homeLessonIndexV2RemoteActionCompatParcelizer);
                    return homeLessonIndexV2RemoteActionCompatParcelizer;
                }
            } else {
                HomeLessonIndexV2 homeLessonIndexV2RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(lessonIndexArr, strConcat, str2, "boolean_flags & 1 != 1", null, i3);
                if (homeLessonIndexV2RemoteActionCompatParcelizer2 != null) {
                    Objects.toString(homeLessonIndexV2RemoteActionCompatParcelizer2);
                    return homeLessonIndexV2RemoteActionCompatParcelizer2;
                }
            }
        }
        if (z) {
            String[] strArrMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(strConcat, i3);
            if (!parseCea608AccessibilityChannel.read(strArrMediaBrowserCompatItemReceiver)) {
                String str3 = strArrMediaBrowserCompatItemReceiver[0];
            }
            if (!parseCea608AccessibilityChannel.read(strArrMediaBrowserCompatItemReceiver)) {
                return a_(strArrMediaBrowserCompatItemReceiver[0]).toHomeLessonIndex(3);
            }
        }
        String str4 = String.format(Locale.getDefault(), "(%s.%s != %d AND %s.%s != %d)", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_status", 2, CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "lesson_activity", 2);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" AND boolean_flags & 1 != 1 AND ");
        sb.append(strConcat);
        sb.append(" AND ");
        sb.append(str4);
        String string = sb.toString();
        if (i3 != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(String.format(" AND %s.%s = %d", "_subject", "group_id", Integer.valueOf(i3)));
            string = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("SELECT lesson._id FROM lesson AS lesson INNER JOIN _subject ON _subject._id = lesson.root_subject_id WHERE ");
        sb3.append(string);
        sb3.append(" ORDER BY lesson.master_order LIMIT 1;");
        String[] strArrIconCompatParcelizer = IconCompatParcelizer("_id", RemoteActionCompatParcelizer(sb3.toString()));
        if (!parseCea608AccessibilityChannel.read(strArrIconCompatParcelizer)) {
            String str5 = strArrIconCompatParcelizer[0];
        }
        if (parseCea608AccessibilityChannel.read(strArrIconCompatParcelizer)) {
            return null;
        }
        return AudioAttributesImplApi21Parcelizer(strArrIconCompatParcelizer[0]).toHomeLessonIndex(0);
    }

    private static String[] IconCompatParcelizer(String str, Cursor cursor) {
        if (cursor == null || !cursor.moveToFirst()) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1) {
            return new String[0];
        }
        do {
            arrayList.add(cursor.getString(columnIndex));
        } while (cursor.moveToNext());
        cursor.close();
        return (String[]) arrayList.toArray(new String[0]);
    }

    private String write(String str, String str2, String str3, String str4, int i) {
        String str5;
        String str6 = String.format(Locale.getDefault(), "%s.%s != %d", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "lesson_activity", 2);
        String str7 = String.format("%s.%s = '%s'", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_id", str);
        if (i == -1) {
            str5 = "";
        } else {
            str5 = String.format("AND rs.%s = %d AND ts.%s = %d ", "group_id", Integer.valueOf(i), "group_id", Integer.valueOf(i));
        }
        String str8 = String.format("%s AND %s AND %s AND %s AND %s OR %s", str3, str2, str6, str4, "lesson.is_opt != 1", str7);
        StringBuilder sb = new StringBuilder();
        sb.append(str8);
        sb.append(str5);
        String[] strArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer("lesson_id", String.format("select %s.%s as %s from %s where %s order by %s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_id", "lesson_id", "lesson inner join _subject rs, _subject ts on lesson.root_subject_id=rs._id and lesson.subject_id=ts._id", sb.toString(), "rs.sort_order, rs._id, ts.sort_order, ts._id, lesson.lesson_number"));
        if (parseCea608AccessibilityChannel.read(strArrAudioAttributesCompatParcelizer)) {
            return null;
        }
        int length = strArrAudioAttributesCompatParcelizer.length;
        int length2 = strArrAudioAttributesCompatParcelizer.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (str.equals(strArrAudioAttributesCompatParcelizer[i2])) {
                break;
            }
            i2++;
        }
        if (i2 == -1 || i2 == length - 1) {
            return null;
        }
        return strArrAudioAttributesCompatParcelizer[i2 + 1];
    }

    private LessonIndex[] read(String str, String str2, String str3, String str4, int i) {
        String string = String.format(Locale.getDefault(), "%s >= %d AND %s AND %s AND %s AND %s != %d ", "last_attempted_time_ms", Long.valueOf(System.currentTimeMillis() - 1209600000), str, str3, str2, "lesson_activity", 0);
        if (i != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(String.format(" AND %s.%s = %d", "_subject", "group_id", Integer.valueOf(i)));
            string = sb.toString();
        }
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(String.format("SELECT lesson.* FROM lesson INNER JOIN _subject ON lesson.subject_id = _subject._id WHERE %s ORDER BY %s DESC", string, "last_attempted_time_ms"));
        try {
            ArrayList arrayList = new ArrayList();
            if (cursorRemoteActionCompatParcelizer == null) {
                LessonIndex[] lessonIndexArr = new LessonIndex[0];
                if (cursorRemoteActionCompatParcelizer != null) {
                    cursorRemoteActionCompatParcelizer.close();
                }
                return lessonIndexArr;
            }
            if (cursorRemoteActionCompatParcelizer.moveToFirst()) {
                do {
                    arrayList.add(AudioAttributesCompatParcelizer(cursorRemoteActionCompatParcelizer));
                } while (cursorRemoteActionCompatParcelizer.moveToNext());
            }
            arrayList.size();
            LessonIndex[] lessonIndexArr2 = (LessonIndex[]) arrayList.toArray(new LessonIndex[0]);
            if (cursorRemoteActionCompatParcelizer != null) {
                cursorRemoteActionCompatParcelizer.close();
            }
            return lessonIndexArr2;
        } catch (Throwable th) {
            if (cursorRemoteActionCompatParcelizer != null) {
                try {
                    cursorRemoteActionCompatParcelizer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private String[] MediaBrowserCompatItemReceiver(String str, int i) {
        String str2 = String.format("%s, %s, %s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "video_ci", "_subject");
        String str3 = String.format(Locale.getDefault(), "%s != %d AND %s != %d", "lesson_activity", 2, "_status", 2);
        String str4 = String.format("%s.%s = %s.%s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_id", "video_ci", "reference_id");
        String str5 = String.format("%s.%s = %s.%s", "_subject", "_id", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "root_subject_id");
        String str6 = String.format("%s.%s, %s.%s limit 1", "_subject", "sort_order", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "lesson_number");
        String string = String.format("%s AND %s AND %s AND %s", str4, str5, str, str3);
        if (i != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(String.format(" AND %s.%s = %d", "_subject", "group_id", Integer.valueOf(i)));
            string = sb.toString();
        }
        String[] strArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer("lesson_id", String.format("select %s.%s as lesson_id from %s where %s order by %s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_id", str2, string, str6));
        if (!parseCea608AccessibilityChannel.read(strArrAudioAttributesCompatParcelizer)) {
            String str7 = strArrAudioAttributesCompatParcelizer[0];
        }
        return strArrAudioAttributesCompatParcelizer;
    }

    private HomeLessonIndexV2 RemoteActionCompatParcelizer(LessonIndex[] lessonIndexArr, String str, String str2, String str3, String str4, int i) {
        Math.min(lessonIndexArr.length, 50);
        for (int i2 = 1; i2 < Math.min(lessonIndexArr.length, 50); i2++) {
            LessonIndex lessonIndex = lessonIndexArr[i2];
            lessonIndex.getId();
            lessonIndex.getStatus();
            lessonIndex.getLessonActivityStatus();
            if (lessonIndex.getLessonActivityStatus() == 1 && lessonIndex.getStatus() == 1) {
                lessonIndex.getId();
                return lessonIndex.toHomeLessonIndex(1);
            }
            if (lessonIndex.getLessonActivityStatus() == 2 || lessonIndex.getStatus() == 2) {
                String strWrite = write(lessonIndex.getId(), str, str2, str3, i);
                if (!parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) strWrite)) {
                    LessonIndex lessonIndexAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(strWrite);
                    lessonIndexAudioAttributesImplApi21Parcelizer.getId();
                    return lessonIndexAudioAttributesImplApi21Parcelizer.toHomeLessonIndex(2);
                }
            }
        }
        return null;
    }

    public final int AudioAttributesCompatParcelizer(String str, int i, int i2, boolean z, int i3) {
        String strConcat = "edition_value = ".concat(String.valueOf(i3));
        StringBuilder sb = new StringBuilder();
        sb.append(strConcat);
        sb.append(" AND lesson_type = ");
        sb.append(i2);
        String string = sb.toString();
        if (z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(" AND is_opt=1");
            string = sb2.toString();
        }
        if (Subject.ROOT_PARENT_ID.equals(str)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string);
            sb3.append(" AND _status =? ");
            return write(sb3.toString(), new String[]{String.valueOf(i)});
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(string);
        sb4.append(" AND root_subject_id =? ");
        String string2 = sb4.toString();
        if (i == -1) {
            return write(string2, new String[]{str});
        }
        if (i == 3) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(string2);
            sb5.append(" AND is_paid =? ");
            return write(sb5.toString(), new String[]{str, SessionDescription.SUPPORTED_SDP_VERSION});
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(string2);
        sb6.append(" AND _status =? ");
        return write(sb6.toString(), new String[]{str, String.valueOf(i)});
    }

    public final int read(String str, int i, int i2, boolean z, int i3) {
        StringBuilder sb = new StringBuilder("SELECT ar_qbank_id FROM lesson WHERE root_subject_id = '");
        sb.append(str);
        sb.append("' AND lesson_type = 0 AND is_opt = 0 AND ar_qbank_id IS NOT NULL AND ar_qbank_id != ''");
        String string = sb.toString();
        String strConcat = "edition_value = ".concat(String.valueOf(i3));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strConcat);
        sb2.append(" AND lesson_type = ");
        sb2.append(i2);
        String string2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(string2);
        sb3.append(" AND _id IN (");
        sb3.append(string);
        sb3.append(")");
        String string3 = sb3.toString();
        if (z) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(string3);
            sb4.append(" AND is_opt=1");
            string3 = sb4.toString();
        }
        if (i == -1) {
            return write(string3, (String[]) null);
        }
        if (i == 3) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(string3);
            sb5.append(" AND is_paid =? ");
            return write(sb5.toString(), new String[]{SessionDescription.SUPPORTED_SDP_VERSION});
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(string3);
        sb6.append(" AND _status =? ");
        return write(sb6.toString(), new String[]{String.valueOf(i)});
    }

    public final HashMap<String, LessonSyncUserLocalModel> AudioAttributesCompatParcelizer(int i) {
        HashMap<String, LessonSyncUserLocalModel> map = new HashMap<>();
        String[] strArr = {"_id", "_status", "last_attempted_time_ms", "lesson_activity", "last_updated"};
        List listAsList = Arrays.asList(strArr);
        String[][] strArrWrite = super.write(strArr, "_status =?  OR lesson_activity =?  AND edition_value =? ", new String[]{IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, String.valueOf(i)}, "");
        if (strArrWrite != null) {
            for (String[] strArr2 : strArrWrite) {
                for (int i2 = 0; i2 < strArr2.length; i2++) {
                    map.put(strArr2[listAsList.indexOf("_id")], new LessonSyncUserLocalModel(Integer.parseInt(strArr2[listAsList.indexOf("_status")]), Long.parseLong(strArr2[listAsList.indexOf("last_attempted_time_ms")]), Integer.parseInt(strArr2[listAsList.indexOf("lesson_activity")]), Long.parseLong(strArr2[listAsList.indexOf("last_updated")])));
                }
            }
        }
        return map;
    }

    @Override // kotlin.resolveUtcTimingElement
    public final int IconCompatParcelizer() {
        return write("video_id IS NOT NULL  AND _status = 2", (String[]) null);
    }

    @Override // kotlin.resolveUtcTimingElement
    public final int read() {
        return write("_status = 2 AND video_id IS NULL", (String[]) null);
    }

    public final int AudioAttributesCompatParcelizer(Long l, Long l2) {
        return write("video_id IS NOT NULL  AND _status =?  AND completion_time_ms BETWEEN ? AND ?", new String[]{"2", l.toString(), l2.toString()});
    }

    public final int IconCompatParcelizer(Long l, Long l2) {
        return write("video_id IS NULL  AND _status =?  AND completion_time_ms BETWEEN ? AND ?", new String[]{"2", l.toString(), l2.toString()});
    }

    public final int RatingCompat(String str) {
        StringBuilder sb = new StringBuilder("video_id IS NOT NULL  AND root_subject_id =?  AND _status != 2 AND ");
        sb.append(AudioAttributesImplBaseParcelizer(""));
        return write(sb.toString(), new String[]{str});
    }

    public final void write() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_status", (Integer) 0);
        contentValues.put("lesson_activity", (Integer) 0);
        contentValues.put("last_attempted_time_ms", (Integer) 0);
        write(contentValues, "boolean_flags & ? != 2 AND lesson_type =? ", new String[]{"2", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE});
    }

    public final List<startLoadingManifest> MediaMetadataCompat(String str) {
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(startLoadingManifest.RemoteActionCompatParcelizer(str));
        if (cursorRemoteActionCompatParcelizer == null) {
            return new ArrayList();
        }
        return startLoadingManifest.IconCompatParcelizer(cursorRemoteActionCompatParcelizer);
    }

    static /* synthetic */ String[] write(int i) {
        return new String[i];
    }

    public final int RemoteActionCompatParcelizer(List<Integer> list) {
        String[] strArr = (String[]) list.stream().map(new Function() { // from class: o.onDashManifestRefreshRequested
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return String.valueOf((Integer) obj);
            }
        }).toArray(new IntFunction() { // from class: o.lambdanew0comgoogleandroidexoplayer2sourcedashDashMediaSource
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return onDashManifestPublishTimeExpired.write(i);
            }
        });
        String str = read("edition_value", new String[]{String.valueOf(((primaryTrack) this).IconCompatParcelizer.onPrepareFromUri()), SessionDescription.SUPPORTED_SDP_VERSION});
        String str2 = read("_subject.group_id", strArr);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" AND ");
        sb.append(str2);
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(String.format("SELECT COUNT(*) FROM %s INNER JOIN %s ON %s.%s = %s.%s WHERE %s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_subject", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "subject_id", "_subject", "_id", sb.toString()));
        if (cursorRemoteActionCompatParcelizer == null) {
            return 0;
        }
        try {
            return cursorRemoteActionCompatParcelizer.moveToFirst() ? cursorRemoteActionCompatParcelizer.getInt(0) : 0;
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }
}
