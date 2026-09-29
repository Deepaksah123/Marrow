package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.api.models.response.sync.CrossDeviceSyncResponseObject;
import com.marrow.data.models.common.Editor;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow.data.models.subject.Subject;
import com.marrow.data.models.subject.SubjectCompletionInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes.dex */
public final class getSegmentUrl extends primaryTrack<Subject> {
    private onDashManifestPublishTimeExpired write;

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(Object obj) {
        return write((Subject) obj);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ Object RemoteActionCompatParcelizer(Cursor cursor) {
        return AudioAttributesCompatParcelizer(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ Object[] RemoteActionCompatParcelizer(int i) {
        return read(i);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(Object obj) {
        return read((Subject) obj);
    }

    public getSegmentUrl(Context context, getStreamPositionUsForContent getstreampositionusforcontent, onDashManifestPublishTimeExpired ondashmanifestpublishtimeexpired) {
        super(context, "_subject", getstreampositionusforcontent);
        this.write = ondashmanifestpublishtimeexpired;
    }

    public final String AudioAttributesImplBaseParcelizer(String str) {
        return write("title", "_id =? ", new String[]{str});
    }

    public final Map<String, String> RemoteActionCompatParcelizer(String[] strArr, boolean z) {
        String str;
        String str2 = String.format(Locale.getDefault(), "%s, %s", "_id", "title");
        String str3 = getIntervalUntilNextManifestRefreshMs.read("_id", strArr);
        if (z) {
            str = " ORDER BY sort_order";
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder("SELECT ");
        sb.append(str2);
        sb.append(" FROM _subject WHERE ");
        sb.append(str3);
        sb.append(str);
        Cursor cursorRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer(sb.toString());
        if (cursorRemoteActionCompatParcelizer == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cursorRemoteActionCompatParcelizer.moveToFirst()) {
            do {
                linkedHashMap.put(cursorRemoteActionCompatParcelizer.getString(0), cursorRemoteActionCompatParcelizer.getString(1));
            } while (cursorRemoteActionCompatParcelizer.moveToNext());
        }
        cursorRemoteActionCompatParcelizer.close();
        return linkedHashMap;
    }

    @Override // kotlin.primaryTrack, kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        LinkedHashMap<String, String> linkedHashMapRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer();
        linkedHashMapRemoteActionCompatParcelizer.put("_id", "TEXT PRIMARY KEY NOT NULL");
        linkedHashMapRemoteActionCompatParcelizer.put("title", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("image_url", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("is_interactive", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("lesson_count", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("last_updated", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("sort_order", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("published_status", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("parent_id", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("do_not_consider", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("qbank_dynamics_last_updated", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("video_dynamics_last_updated", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("editor_info", "TEXT");
        linkedHashMapRemoteActionCompatParcelizer.put("last_opened", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("category", "INTEGER");
        linkedHashMapRemoteActionCompatParcelizer.put("group_id", "INTEGER");
        return linkedHashMapRemoteActionCompatParcelizer;
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "_id =? ";
    }

    private static String[] write(Subject subject) {
        return new String[]{subject.getId()};
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final int IconCompatParcelizer(String[] strArr) {
        String str = strArr[0];
        int iIconCompatParcelizer = super.IconCompatParcelizer(strArr);
        if (iIconCompatParcelizer > 0) {
            this.write.read("subject_id", str);
        }
        return iIconCompatParcelizer;
    }

    private static Subject AudioAttributesCompatParcelizer(Cursor cursor) {
        Subject subject = new Subject();
        subject.setId(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "_id"));
        subject.setTitle(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "title"));
        subject.setImageUrl(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "image_url"));
        subject.setInteractive(Boolean.valueOf(getPeriodDurationMs.read(cursor, "is_interactive")));
        subject.setLastUpdated(getPeriodDurationMs.AudioAttributesImplBaseParcelizer(cursor, "last_updated"));
        subject.setSortOrder(getPeriodDurationMs.write(cursor, "sort_order"));
        subject.setPublishedStatus(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "published_status"));
        subject.setParentId(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "parent_id"));
        subject.setDoNotConsider(getPeriodDurationMs.read(cursor, "do_not_consider"));
        subject.setCourseId(getPeriodDurationMs.write(cursor, FilterParams.KEY_COURSE_ID));
        subject.setQbankUpdatedTime(getPeriodDurationMs.AudioAttributesImplBaseParcelizer(cursor, "qbank_dynamics_last_updated"));
        subject.setVideoUpdatedTime(getPeriodDurationMs.AudioAttributesImplBaseParcelizer(cursor, "video_dynamics_last_updated"));
        subject.setCategory(getPeriodDurationMs.write(cursor, "category"));
        subject.setGroupId(getPeriodDurationMs.write(cursor, "group_id"));
        String strAudioAttributesImplApi21Parcelizer = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "editor_info");
        if (!parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) strAudioAttributesImplApi21Parcelizer)) {
            subject.setEditorDetail((Editor) new setDownloadingStatesToQueued().IconCompatParcelizer(strAudioAttributesImplApi21Parcelizer, Editor.class));
        }
        return subject;
    }

    private static ContentValues read(Subject subject) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", subject.getId());
        contentValues.put("title", subject.getTitle());
        contentValues.put("image_url", subject.getImageUrl());
        contentValues.put("is_interactive", Integer.valueOf(subject.getIsInteractive() ? 1 : 0));
        if (subject.getIconThumbnail() != null && subject.getIconThumbnail().containsKey("url")) {
            contentValues.put("image_url", subject.getIconThumbnail().get("url"));
        } else {
            contentValues.put("image_url", subject.getImageUrl());
        }
        contentValues.put("last_updated", Long.valueOf(subject.getLastUpdated()));
        contentValues.put("sort_order", Integer.valueOf(subject.getSortOrder()));
        contentValues.put("published_status", subject.getPublishedStatus());
        contentValues.put("parent_id", subject.getParentId());
        contentValues.put("do_not_consider", Integer.valueOf(subject.isDoNotConsider() ? 1 : 0));
        contentValues.put(FilterParams.KEY_COURSE_ID, Integer.valueOf(subject.getCourseId()));
        contentValues.put("qbank_dynamics_last_updated", Long.valueOf(subject.getQbankUpdatedTime()));
        contentValues.put("video_dynamics_last_updated", Long.valueOf(subject.getVideoUpdatedTime()));
        contentValues.put("category", Integer.valueOf(subject.getCategory()));
        contentValues.put("group_id", Integer.valueOf(subject.getGroupId()));
        if (subject.getEditor() != null) {
            contentValues.put("editor_info", subject.getEditor().toEditorInfoJSON());
        }
        return contentValues;
    }

    private static Subject[] read(int i) {
        return new Subject[i];
    }

    public final SubjectCompletionInfo[] write(List<Integer> list) {
        String str = String.format(Locale.getDefault(), "%s, %s, %s, %s, %s, %s, %s", String.format(Locale.getDefault(), "%s.%s AS %s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "root_subject_id", "__root_subject_id"), String.format(Locale.getDefault(), "%s.%s AS %s", "_subject", "title", "__title"), String.format(Locale.getDefault(), "%s.%s AS %s", "_subject", "image_url", "__image_url"), String.format(Locale.getDefault(), "%s.%s AS %s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_status", "___status"), "count(*)", String.format(Locale.getDefault(), "%s.%s AS %s", "_subject", "last_opened", "__last_opened"), String.format(Locale.getDefault(), "%s.%s AS %s", "_subject", "is_interactive", "__is_interactive"));
        String str2 = String.format(Locale.getDefault(), "%s,%s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_subject");
        String str3 = String.format(Locale.getDefault(), "%s.%s & %d == %d", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "boolean_flags", 2, 2);
        String str4 = String.format(Locale.getDefault(), "%s.%s = %s.%s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "root_subject_id", "_subject", "_id");
        String str5 = String.format(Locale.getDefault(), "%s.%s = %d", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "edition_value", Integer.valueOf(((primaryTrack) this).IconCompatParcelizer.onPrepareFromUri()));
        String str6 = String.format(Locale.getDefault(), "%s.%s = %d", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "is_opt", 0);
        if (list.isEmpty()) {
            list = Collections.singletonList(1);
        }
        return AudioAttributesCompatParcelizer("__root_subject_id", "__title", "__image_url", "___status", "count(*)", "__last_opened", "__is_interactive", true, super.RemoteActionCompatParcelizer(String.format(Locale.getDefault(), "SELECT %s FROM %s WHERE %s GROUP BY %s ORDER BY %s", str, str2, String.format(Locale.getDefault(), "%s AND %s AND %s AND %s AND %s", str3, str4, str5, str6, read("_subject.group_id", (String[]) list.stream().map(new Function() { // from class: o.getNextSegmentAvailableTimeUs
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return String.valueOf((Integer) obj);
            }
        }).toArray(new IntFunction() { // from class: o.loadChunkIndex
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return getSegmentUrl.write(i);
            }
        }))), String.format(Locale.getDefault(), "%s.%s , %s.%s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "root_subject_id", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_status"), String.format(Locale.getDefault(), "%s.%s", "_subject", "sort_order"))));
    }

    static /* synthetic */ String[] write(int i) {
        return new String[i];
    }

    public final SubjectCompletionInfo[] IconCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer("__root_subject_id", "__title", "__image_url", "___status", "count(*)", null, null, false, super.RemoteActionCompatParcelizer(String.format(Locale.getDefault(), "SELECT %s FROM %s WHERE %s GROUP BY %s ORDER BY %s", String.format(Locale.getDefault(), "%s, %s, %s, %s, %s", String.format(Locale.getDefault(), "%s.%s AS %s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "root_subject_id", "__root_subject_id"), String.format(Locale.getDefault(), "%s.%s AS %s", "_subject", "title", "__title"), String.format(Locale.getDefault(), "%s.%s AS %s", "_subject", "image_url", "__image_url"), String.format(Locale.getDefault(), "%s.%s AS %s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_status", "___status"), "count(*)"), String.format(Locale.getDefault(), "%s,%s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_subject"), String.format(Locale.getDefault(), "%s AND %s AND %s", String.format(Locale.getDefault(), "%s.%s & %d != %d", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "boolean_flags", 2, 2), String.format(Locale.getDefault(), "%s.%s = %s.%s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "root_subject_id", "_subject", "_id"), String.format(Locale.getDefault(), "%s.%s = %d", "_subject", "group_id", Integer.valueOf(i))), String.format(Locale.getDefault(), "%s.%s , %s.%s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "root_subject_id", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_status"), String.format(Locale.getDefault(), "%s.%s", "_subject", "sort_order"))));
    }

    public final SubjectCompletionInfo AudioAttributesImplApi26Parcelizer(String str) {
        Cursor cursorRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer(String.format(Locale.getDefault(), "SELECT %s FROM %s WHERE %s", String.format(Locale.getDefault(), "%s, %s, %s, %s", String.format(Locale.getDefault(), "%s.%s AS %s", "_subject", "title", "__title"), String.format(Locale.getDefault(), "%s.%s AS %s", "_subject", "image_url", "__image_url"), String.format(Locale.getDefault(), "count(*) AS %s", "__total"), String.format(Locale.getDefault(), "SUM(CASE WHEN %s.%s = %d THEN 1 ELSE 0 END) AS %s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_status", 2, "__completed")), String.format(Locale.getDefault(), "%s,%s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_subject"), String.format(Locale.getDefault(), "%s AND %s AND %s", String.format(Locale.getDefault(), "%s.%s & %d != %d", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "boolean_flags", 2, 2), String.format(Locale.getDefault(), "%s.%s = %s.%s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "root_subject_id", "_subject", "_id"), String.format(Locale.getDefault(), "%s.%s = '%s'", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "root_subject_id", str))));
        if (cursorRemoteActionCompatParcelizer == null) {
            return null;
        }
        try {
            if (!cursorRemoteActionCompatParcelizer.moveToFirst()) {
                return null;
            }
            int iWrite = getPeriodDurationMs.write(cursorRemoteActionCompatParcelizer, "__total");
            if (iWrite == 0) {
                return null;
            }
            String strAudioAttributesImplApi21Parcelizer = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursorRemoteActionCompatParcelizer, "__title");
            SubjectCompletionInfo subjectCompletionInfo = new SubjectCompletionInfo();
            subjectCompletionInfo.id = str;
            if (strAudioAttributesImplApi21Parcelizer == null) {
                strAudioAttributesImplApi21Parcelizer = "";
            }
            subjectCompletionInfo.title = strAudioAttributesImplApi21Parcelizer;
            subjectCompletionInfo.imageUrl = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursorRemoteActionCompatParcelizer, "__image_url");
            subjectCompletionInfo.totalLessons = iWrite;
            subjectCompletionInfo.completedCount = getPeriodDurationMs.write(cursorRemoteActionCompatParcelizer, "__completed");
            return subjectCompletionInfo;
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }

    private SubjectCompletionInfo[] AudioAttributesCompatParcelizer(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, Cursor cursor) {
        SubjectCompletionInfo subjectCompletionInfo;
        if (cursor == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        if (z) {
            StringBuilder sb = new StringBuilder("select _subject._id, count(*) from _subject, lesson where _subject._id = lesson.root_subject_id and ");
            sb.append(onDashManifestPublishTimeExpired.AudioAttributesImplBaseParcelizer("lesson."));
            sb.append(" and lesson._status != 2 group by _subject._id");
            Cursor cursorRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer(sb.toString());
            try {
                if (cursorRemoteActionCompatParcelizer.moveToFirst()) {
                    do {
                        map2.put(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursorRemoteActionCompatParcelizer, "_subject._id"), Integer.valueOf(getPeriodDurationMs.write(cursorRemoteActionCompatParcelizer, "count(*)")));
                    } while (cursorRemoteActionCompatParcelizer.moveToNext());
                }
                cursorRemoteActionCompatParcelizer.close();
                cursorRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer("SELECT subject_id, is_active, expires_on, active_edition FROM _subject_updated_status");
                if (cursorRemoteActionCompatParcelizer != null) {
                    while (cursorRemoteActionCompatParcelizer.moveToNext()) {
                        try {
                            String strAudioAttributesImplApi21Parcelizer = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursorRemoteActionCompatParcelizer, "subject_id");
                            map3.put(strAudioAttributesImplApi21Parcelizer, new DashUtil(strAudioAttributesImplApi21Parcelizer, getPeriodDurationMs.read(cursorRemoteActionCompatParcelizer, "is_active"), getPeriodDurationMs.AudioAttributesImplBaseParcelizer(cursorRemoteActionCompatParcelizer, "expires_on"), getPeriodDurationMs.write(cursorRemoteActionCompatParcelizer, "active_edition")));
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
        try {
            if (cursor.moveToFirst()) {
                do {
                    String strAudioAttributesImplApi21Parcelizer2 = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, str);
                    String strAudioAttributesImplApi21Parcelizer3 = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, str2);
                    String strAudioAttributesImplApi21Parcelizer4 = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, str3);
                    int iWrite = getPeriodDurationMs.write(cursor, str4);
                    int iWrite2 = getPeriodDurationMs.write(cursor, str5);
                    if (map.containsKey(strAudioAttributesImplApi21Parcelizer2)) {
                        subjectCompletionInfo = (SubjectCompletionInfo) arrayList.get(((Integer) map.get(strAudioAttributesImplApi21Parcelizer2)).intValue());
                    } else {
                        SubjectCompletionInfo subjectCompletionInfo2 = new SubjectCompletionInfo();
                        subjectCompletionInfo2.id = strAudioAttributesImplApi21Parcelizer2;
                        subjectCompletionInfo2.title = strAudioAttributesImplApi21Parcelizer3;
                        subjectCompletionInfo2.imageUrl = strAudioAttributesImplApi21Parcelizer4;
                        if (str6 != null) {
                            subjectCompletionInfo2.lastOpened = getPeriodDurationMs.AudioAttributesImplBaseParcelizer(cursor, str6);
                        }
                        if (str7 != null) {
                            subjectCompletionInfo2.isInteractive = getPeriodDurationMs.read(cursor, str7);
                        }
                        arrayList.add(subjectCompletionInfo2);
                        map.put(strAudioAttributesImplApi21Parcelizer2, Integer.valueOf(arrayList.size() - 1));
                        subjectCompletionInfo = subjectCompletionInfo2;
                    }
                    if (map2.containsKey(strAudioAttributesImplApi21Parcelizer2)) {
                        subjectCompletionInfo.totalNewLessons = ((Integer) map2.get(strAudioAttributesImplApi21Parcelizer2)).intValue();
                    }
                    DashUtil dashUtil = (DashUtil) map3.get(strAudioAttributesImplApi21Parcelizer2);
                    if (dashUtil != null) {
                        subjectCompletionInfo.allNewActive = dashUtil.AudioAttributesCompatParcelizer();
                        subjectCompletionInfo.allNewExpiresOn = dashUtil.IconCompatParcelizer();
                        subjectCompletionInfo.allNewActiveEdition = dashUtil.RemoteActionCompatParcelizer();
                    }
                    subjectCompletionInfo.totalLessons += iWrite2;
                    if (iWrite == 2) {
                        subjectCompletionInfo.completedCount = iWrite2;
                    }
                } while (cursor.moveToNext());
            }
            return (SubjectCompletionInfo[]) arrayList.toArray(new SubjectCompletionInfo[arrayList.size()]);
        } finally {
            cursor.close();
        }
    }

    public final HashMap<String, String> MediaMetadataCompat() {
        String[][] strArrWrite = write(new String[]{"_id", "parent_id"}, null, null, null);
        HashMap<String, String> map = new HashMap<>();
        if (strArrWrite != null) {
            for (String[] strArr : strArrWrite) {
                map.put(strArr[0], strArr[1]);
            }
        }
        return map;
    }

    public final void AudioAttributesCompatParcelizer(String str, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("last_opened", Long.valueOf(j));
        RemoteActionCompatParcelizer(contentValues, "_id", str);
    }

    public final void read(String str, String str2, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("video_dynamics_last_updated", Long.valueOf(j));
        RemoteActionCompatParcelizer(contentValues, str, str2);
    }

    public final ArrayList<Subject> read(String str, int i) {
        String strConcat;
        String string;
        if (i == -1) {
            strConcat = "";
        } else {
            strConcat = " AND group_id = ".concat(String.valueOf(i));
        }
        if (parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(Subject.ROOT_PARENT_ID, str)) {
            StringBuilder sb = new StringBuilder("SELECT * FROM _subject WHERE _id IN (SELECT DISTINCT(root_subject_id) FROM lesson WHERE mcq_count > 0) AND category != 2");
            sb.append(strConcat);
            sb.append(" ORDER BY sort_order");
            string = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder("SELECT * FROM _subject WHERE _id IN (SELECT DISTINCT(subject_id) FROM lesson WHERE mcq_count > 0 AND root_subject_id='");
            sb2.append(str);
            sb2.append("') ");
            sb2.append(strConcat);
            sb2.append(" ORDER BY sort_order");
            string = sb2.toString();
        }
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(string);
        if (cursorRemoteActionCompatParcelizer == null) {
            return new ArrayList<>();
        }
        ArrayList<Subject> arrayList = new ArrayList<>();
        try {
            if (cursorRemoteActionCompatParcelizer.moveToFirst()) {
                do {
                    arrayList.add(AudioAttributesCompatParcelizer(cursorRemoteActionCompatParcelizer));
                } while (cursorRemoteActionCompatParcelizer.moveToNext());
            }
            return arrayList;
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }

    public final int MediaDescriptionCompat() {
        String strRemoteActionCompatParcelizer = getIntervalUntilNextManifestRefreshMs.RemoteActionCompatParcelizer("_id", write());
        StringBuilder sb = new StringBuilder("select count(*) from _subject where _id in (select distinct(root_subject_id) from lesson where  mcq_count > 0) and ");
        sb.append(strRemoteActionCompatParcelizer);
        sb.append("order by sort_order");
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(sb.toString());
        if (cursorRemoteActionCompatParcelizer == null) {
            return 0;
        }
        try {
            return cursorRemoteActionCompatParcelizer.moveToFirst() ? cursorRemoteActionCompatParcelizer.getInt(0) : 0;
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }

    public final List<String> write() {
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer("select _id from _subject where category = 2");
        if (cursorRemoteActionCompatParcelizer == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        try {
            if (cursorRemoteActionCompatParcelizer.moveToFirst()) {
                do {
                    arrayList.add(cursorRemoteActionCompatParcelizer.getString(0));
                } while (cursorRemoteActionCompatParcelizer.moveToNext());
            }
            return arrayList;
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Subject MediaBrowserCompatCustomActionResultReceiver(String str) {
        return (Subject) AudioAttributesCompatParcelizer("_id =? ", new String[]{str}, (String) null);
    }

    public final long MediaBrowserCompatItemReceiver(String str) {
        return IconCompatParcelizer("video_dynamics_last_updated", "_id =? ", new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Subject[] IconCompatParcelizer(List<String> list) {
        String str = read("_id", (String[]) list.toArray(new String[0]));
        StringBuilder sb = new StringBuilder("SELECT * FROM _subject WHERE ");
        sb.append(str);
        sb.append(" ORDER BY sort_order");
        return (Subject[]) a_(sb.toString());
    }
}
