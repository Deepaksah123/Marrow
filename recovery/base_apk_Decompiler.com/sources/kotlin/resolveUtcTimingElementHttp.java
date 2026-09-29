package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.api.models.response.sync.CrossDeviceSyncResponseObject;
import com.marrow.data.models.LessonMcqUpdateInfo;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class resolveUtcTimingElementHttp extends getIntervalUntilNextManifestRefreshMs<LessonMcqUpdateInfo> implements resolveUtcTimingElementDirect {
    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(LessonMcqUpdateInfo lessonMcqUpdateInfo) {
        return AudioAttributesCompatParcelizer(lessonMcqUpdateInfo);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ LessonMcqUpdateInfo RemoteActionCompatParcelizer(Cursor cursor) {
        return write(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ LessonMcqUpdateInfo[] RemoteActionCompatParcelizer(int i) {
        return write(i);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(LessonMcqUpdateInfo lessonMcqUpdateInfo) {
        return RemoteActionCompatParcelizer(lessonMcqUpdateInfo);
    }

    public resolveUtcTimingElementHttp(Context context) {
        super(context, "lesson_mcq_update");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("root_subject_id", "TEXT");
        linkedHashMap.put("lesson_id", "TEXT");
        linkedHashMap.put(LessonMcqUpdateInfo.KEY_MCQ_ID, "TEXT");
        linkedHashMap.put("start_time_ms", "INTEGER");
        linkedHashMap.put("end_time_ms", "INTEGER");
        linkedHashMap.put("_status", "INTEGER");
        return linkedHashMap;
    }

    private static LessonMcqUpdateInfo write(Cursor cursor) {
        LessonMcqUpdateInfo lessonMcqUpdateInfo = new LessonMcqUpdateInfo();
        lessonMcqUpdateInfo.mcqId = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, LessonMcqUpdateInfo.KEY_MCQ_ID);
        lessonMcqUpdateInfo.lessonId = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "lesson_id");
        lessonMcqUpdateInfo.rootSubjectId = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "root_subject_id");
        lessonMcqUpdateInfo.status = getPeriodDurationMs.write(cursor, "_status");
        lessonMcqUpdateInfo.startTimeMs = getPeriodDurationMs.AudioAttributesImplBaseParcelizer(cursor, "start_time_ms");
        lessonMcqUpdateInfo.endTimeMs = getPeriodDurationMs.AudioAttributesImplBaseParcelizer(cursor, "end_time_ms");
        return lessonMcqUpdateInfo;
    }

    private static ContentValues RemoteActionCompatParcelizer(LessonMcqUpdateInfo lessonMcqUpdateInfo) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("root_subject_id", lessonMcqUpdateInfo.rootSubjectId);
        contentValues.put("lesson_id", lessonMcqUpdateInfo.lessonId);
        contentValues.put(LessonMcqUpdateInfo.KEY_MCQ_ID, lessonMcqUpdateInfo.mcqId);
        contentValues.put("start_time_ms", Long.valueOf(lessonMcqUpdateInfo.startTimeMs));
        contentValues.put("end_time_ms", Long.valueOf(lessonMcqUpdateInfo.endTimeMs));
        contentValues.put("_status", Integer.valueOf(lessonMcqUpdateInfo.status));
        return contentValues;
    }

    private static LessonMcqUpdateInfo[] write(int i) {
        return new LessonMcqUpdateInfo[i];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "root_subject_id =?  AND lesson_id =?  AND mcq_id =? ";
    }

    private static String[] AudioAttributesCompatParcelizer(LessonMcqUpdateInfo lessonMcqUpdateInfo) {
        return new String[]{lessonMcqUpdateInfo.rootSubjectId, lessonMcqUpdateInfo.lessonId, lessonMcqUpdateInfo.mcqId};
    }

    public final HashMap<String, int[]> AudioAttributesImplBaseParcelizer(String str) {
        int[] iArr;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Cursor cursorRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer(String.format(Locale.getDefault(), "SELECT %s.%s, %s.%s, COUNT(*) as %s FROM %s, %s WHERE %s GROUP BY %s", "lesson_mcq_update", "lesson_id", "lesson_mcq_update", "_status", "_COUNT", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "lesson_mcq_update", String.format(Locale.getDefault(), "%s.%s > %d AND %s.%s < %d AND %s.%s > %d AND %s.%s > %s.%s AND %s.%s = '%s' AND %s.%s=%s.%s", "lesson_mcq_update", "end_time_ms", Long.valueOf(jCurrentTimeMillis), "lesson_mcq_update", "start_time_ms", Long.valueOf(jCurrentTimeMillis), "lesson_mcq_update", "_status", 0, "lesson_mcq_update", "start_time_ms", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "completion_time_ms", "lesson_mcq_update", "root_subject_id", str, CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_id", "lesson_mcq_update", "lesson_id"), String.format(Locale.getDefault(), "%s.%s, %s.%s", "lesson_mcq_update", "lesson_id", "lesson_mcq_update", "_status")));
        if (cursorRemoteActionCompatParcelizer == null) {
            return new HashMap<>();
        }
        HashMap<String, int[]> map = new HashMap<>();
        try {
            if (cursorRemoteActionCompatParcelizer.moveToFirst()) {
                do {
                    String string = cursorRemoteActionCompatParcelizer.getString(0);
                    int i = cursorRemoteActionCompatParcelizer.getInt(1);
                    int i2 = cursorRemoteActionCompatParcelizer.getInt(2);
                    if (map.containsKey(string)) {
                        iArr = map.get(string);
                    } else {
                        int[] iArr2 = new int[2];
                        map.put(string, iArr2);
                        iArr = iArr2;
                    }
                    if (i == 1) {
                        iArr[0] = i2;
                    } else if (i == 2) {
                        iArr[1] = i2;
                    }
                } while (cursorRemoteActionCompatParcelizer.moveToNext());
            }
            return map;
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }

    @Override // kotlin.resolveUtcTimingElementDirect
    public final HashMap<String, int[]> write(String[] strArr) {
        int[] iArr;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Cursor cursorRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer(String.format(Locale.getDefault(), "SELECT %s.%s, %s.%s, COUNT(*) as %s FROM %s,%s WHERE %s GROUP BY %s", "lesson_mcq_update", "lesson_id", "lesson_mcq_update", "_status", "_COUNT", "lesson_mcq_update", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, String.format(Locale.getDefault(), "%s AND %s AND %s AND %s AND %s AND %s", String.format(Locale.getDefault(), "%s.%s > %d", "lesson_mcq_update", "end_time_ms", Long.valueOf(jCurrentTimeMillis)), String.format(Locale.getDefault(), "%s.%s < %d", "lesson_mcq_update", "start_time_ms", Long.valueOf(jCurrentTimeMillis)), String.format(Locale.getDefault(), "%s.%s > %d", "lesson_mcq_update", "_status", 0), String.format(Locale.getDefault(), "%s.%s > %s.%s", "lesson_mcq_update", "start_time_ms", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "completion_time_ms"), read("lesson_mcq_update.lesson_id", strArr), String.format(Locale.getDefault(), "%s.%s = %s.%s", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_id", "lesson_mcq_update", "lesson_id")), String.format(Locale.getDefault(), "%s.%s, %s.%s", "lesson_mcq_update", "lesson_id", "lesson_mcq_update", "_status")));
        if (cursorRemoteActionCompatParcelizer == null) {
            return new HashMap<>();
        }
        HashMap<String, int[]> map = new HashMap<>();
        try {
            if (cursorRemoteActionCompatParcelizer.moveToFirst()) {
                do {
                    String string = cursorRemoteActionCompatParcelizer.getString(0);
                    int i = cursorRemoteActionCompatParcelizer.getInt(1);
                    int i2 = cursorRemoteActionCompatParcelizer.getInt(2);
                    if (map.containsKey(string)) {
                        iArr = map.get(string);
                    } else {
                        int[] iArr2 = new int[2];
                        map.put(string, iArr2);
                        iArr = iArr2;
                    }
                    if (i == 1) {
                        iArr[0] = i2;
                    } else if (i == 2) {
                        iArr[1] = i2;
                    }
                } while (cursorRemoteActionCompatParcelizer.moveToNext());
            }
            return map;
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }

    public final int[] AudioAttributesImplApi21Parcelizer(String str) {
        int i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Cursor cursorRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer(String.format(Locale.getDefault(), "SELECT %s.%s, COUNT(*) as %s FROM %s, %s WHERE %s GROUP BY %s.%s", "lesson_mcq_update", "_status", "_COUNT", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "lesson_mcq_update", String.format(Locale.getDefault(), "%s.%s > %d AND %s.%s < %d AND %s.%s > %d AND %s.%s > %s.%s AND %s.%s = '%s' AND %s.%s=%s.%s", "lesson_mcq_update", "end_time_ms", Long.valueOf(jCurrentTimeMillis), "lesson_mcq_update", "start_time_ms", Long.valueOf(jCurrentTimeMillis), "lesson_mcq_update", "_status", 0, "lesson_mcq_update", "start_time_ms", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "completion_time_ms", "lesson_mcq_update", "lesson_id", str, CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_id", "lesson_mcq_update", "lesson_id"), "lesson_mcq_update", "_status"));
        if (cursorRemoteActionCompatParcelizer == null) {
            return new int[]{0, 0};
        }
        int i2 = 0;
        try {
            if (cursorRemoteActionCompatParcelizer.moveToFirst()) {
                int i3 = 0;
                i = 0;
                do {
                    int i4 = cursorRemoteActionCompatParcelizer.getInt(0);
                    int i5 = cursorRemoteActionCompatParcelizer.getInt(1);
                    if (i4 == 1) {
                        i = i5;
                    } else if (i4 == 2) {
                        i3 = i5;
                    }
                } while (cursorRemoteActionCompatParcelizer.moveToNext());
                i2 = i3;
            } else {
                i = 0;
            }
            return new int[]{i, i2};
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }

    public final void MediaBrowserCompatItemReceiver(String str) {
        super.read("lesson_id", str);
    }

    public final void read(String[] strArr) {
        MediaBrowserCompatItemReceiver("lesson_id", strArr);
    }

    public final void read(LessonMcqUpdateInfo[] lessonMcqUpdateInfoArr) {
        IconCompatParcelizer((Object[]) lessonMcqUpdateInfoArr);
    }
}
