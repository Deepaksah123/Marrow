package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.Pair;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.marrow.data.api.models.response.lesson.step.StepResponseBody;
import com.marrow.data.models.LessonMcqUpdateInfo;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow.data.models.mcq.McqIndex;
import com.marrow.data.models.mcq.McqParentInfo;
import com.marrow.data.models.mcq.bookmark.FilterItemRecord;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class setManifestParser extends getIntervalUntilNextManifestRefreshMs<McqParentInfo> {
    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(McqParentInfo mcqParentInfo) {
        return read(mcqParentInfo);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ McqParentInfo RemoteActionCompatParcelizer(Cursor cursor) {
        return AudioAttributesCompatParcelizer(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ McqParentInfo[] RemoteActionCompatParcelizer(int i) {
        return read(i);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(McqParentInfo mcqParentInfo) {
        return AudioAttributesCompatParcelizer(mcqParentInfo);
    }

    public setManifestParser(Context context) {
        super(context, "mcq_parent_info");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(LessonMcqUpdateInfo.KEY_MCQ_ID, "TEXT");
        linkedHashMap.put("parent_id", "TEXT");
        linkedHashMap.put("parent_type", "TEXT");
        linkedHashMap.put("sort_order", "INTEGER");
        linkedHashMap.put("parent_mcq_id", "TEXT");
        return linkedHashMap;
    }

    private static McqParentInfo AudioAttributesCompatParcelizer(Cursor cursor) {
        McqParentInfo mcqParentInfo = new McqParentInfo();
        mcqParentInfo.setMCQId(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, LessonMcqUpdateInfo.KEY_MCQ_ID));
        mcqParentInfo.setParentId(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "parent_id"));
        mcqParentInfo.setParentType(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "parent_type"));
        mcqParentInfo.setSortOrder(getPeriodDurationMs.write(cursor, "sort_order"));
        mcqParentInfo.setParentMcqId(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "parent_mcq_id"));
        return mcqParentInfo;
    }

    private static ContentValues AudioAttributesCompatParcelizer(McqParentInfo mcqParentInfo) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(LessonMcqUpdateInfo.KEY_MCQ_ID, mcqParentInfo.getMCQId());
        contentValues.put("parent_id", mcqParentInfo.getParentId());
        contentValues.put("parent_type", mcqParentInfo.getParentType());
        contentValues.put("sort_order", Integer.valueOf(mcqParentInfo.getSortOrder()));
        contentValues.put("parent_mcq_id", mcqParentInfo.getParentMcqId());
        return contentValues;
    }

    private static McqParentInfo[] read(int i) {
        return new McqParentInfo[i];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "mcq_id =?  AND parent_id =? ";
    }

    private static String[] read(McqParentInfo mcqParentInfo) {
        return new String[]{mcqParentInfo.getMCQId(), mcqParentInfo.getParentId()};
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final McqParentInfo[] RemoteActionCompatParcelizer(String str, String[] strArr, String str2) {
        return (McqParentInfo[]) super.RemoteActionCompatParcelizer(str, strArr, str2);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String[] read(String str, String str2, String[] strArr, String str3) {
        return super.read(str, str2, strArr, str3);
    }

    public final int AudioAttributesImplApi21Parcelizer(String str) {
        return RemoteActionCompatParcelizer("parent_mcq_id", "parent_id =? ", new String[]{str});
    }

    public final int AudioAttributesImplBaseParcelizer(String str) {
        return AudioAttributesCompatParcelizer(String.format(Locale.getDefault(), "%s IN (%s)", "parent_id", String.format(Locale.getDefault(), "SELECT %s FROM %s WHERE %s='%s'", "_id", "_step", "lesson_id", str)), (String[]) null);
    }

    public final int read(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return 0;
        }
        return AudioAttributesCompatParcelizer(String.format(Locale.getDefault(), "%s IN (%s)", "parent_id", String.format(Locale.getDefault(), "SELECT %s FROM %s WHERE %s", "_id", "_step", read("lesson_id", strArr))), (String[]) null);
    }

    public final void write(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        AudioAttributesCompatParcelizer(read("parent_id", (String[]) list.toArray(new String[0])), (String[]) null);
    }

    public final int MediaBrowserCompatCustomActionResultReceiver(String str) {
        return read("parent_id", str);
    }

    public final int RemoteActionCompatParcelizer(String str, long j) {
        return read(String.format(Locale.getDefault(), "SELECT COUNT(*) FROM %s, %s WHERE %s.%s='%s' AND %s.%s!='%s' AND %s.%s < %d AND (%s.%s > %d OR %s.%s <= %d) AND %s.%s=%s.%s", "mcq_parent_info", "mcq_questions", "mcq_parent_info", "parent_id", str, "mcq_questions", "update_status", SessionDescription.SUPPORTED_SDP_VERSION, "mcq_questions", "st_up_start_time_ms", Long.valueOf(j), "mcq_questions", "st_up_end_time_ms", Long.valueOf(j), "mcq_questions", "st_up_end_time_ms", 0, "mcq_questions", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_parent_info", LessonMcqUpdateInfo.KEY_MCQ_ID));
    }

    public final int AudioAttributesImplApi26Parcelizer(String str) {
        return read(String.format(Locale.getDefault(), "SELECT COUNT(*) FROM %s, %s WHERE %s.%s=%s.%s AND %s.%s='%s' AND %s.%s > %d ", "mcq_questions", "mcq_parent_info", "mcq_questions", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_parent_info", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_parent_info", "parent_id", str, "mcq_questions", "bookmarked_type", 0));
    }

    public final int MediaBrowserCompatItemReceiver(String str) {
        return read(String.format(Locale.getDefault(), "SELECT COUNT(DISTINCT(%s.%s)) FROM %s, %s WHERE %s.%s=%s.%s AND %s.%s='%s' AND %s.%s > %d ", "mcq_questions", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_questions", "mcq_hyt", "mcq_questions", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_hyt", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_hyt", "hyt_id", str, "mcq_questions", "bookmarked_type", 0));
    }

    public final FilterItemRecord[] IconCompatParcelizer(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j) {
        String str2 = z || z2 || z3 || z4 || z6 ? String.format(Locale.getDefault(), "%s, %s, %s %s", "mcq_questions", "mcq_parent_info", "_subject", onCommand()) : String.format(Locale.getDefault(), "%s, %s, %s", "mcq_questions", "mcq_parent_info", "_subject");
        String str3 = String.format(Locale.getDefault(), "%s.%s = %s.%s", "mcq_questions", "root_subject_id", "_subject", "_id");
        String str4 = String.format(Locale.getDefault(), "%s.%s = %s.%s", "mcq_questions", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_parent_info", LessonMcqUpdateInfo.KEY_MCQ_ID);
        String str5 = String.format(Locale.getDefault(), "%s.%s = '%s'", "mcq_parent_info", "parent_id", str);
        String[] strArr = {z ? AudioAttributesCompatParcelizer() : null, z2 ? MediaDescriptionCompat() : null, z3 ? MediaMetadataCompat() : null, z4 ? onCustomAction() : null, z7 ? write() : null, z5 ? read(j) : null, z6 ? MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() : null};
        String str6 = String.format(Locale.getDefault(), "%s.%s as %s, %s.%s as %s, COUNT(DISTINCT(%s.%s)) as %s", "mcq_questions", "root_subject_id", "_subject_id", "_subject", "title", "_title", "mcq_parent_info", "parent_mcq_id", "_count");
        StringBuilder sb = new StringBuilder(str3);
        sb.append(" AND ");
        sb.append(str4);
        sb.append(" AND ");
        sb.append(str5);
        for (int i = 0; i < 7; i++) {
            String str7 = strArr[i];
            if (str7 != null) {
                sb.append(" AND ");
                sb.append(str7);
            }
        }
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(String.format(Locale.getDefault(), "SELECT %s FROM %s WHERE %s GROUP BY %s", str6, str2, sb, "_subject_id"));
        ArrayList arrayList = new ArrayList();
        if (cursorRemoteActionCompatParcelizer == null) {
            return null;
        }
        try {
            if (cursorRemoteActionCompatParcelizer.moveToFirst()) {
                do {
                    arrayList.add(new FilterItemRecord(cursorRemoteActionCompatParcelizer.getString(0), cursorRemoteActionCompatParcelizer.getString(1), cursorRemoteActionCompatParcelizer.getInt(2)));
                } while (cursorRemoteActionCompatParcelizer.moveToNext());
            }
            return (FilterItemRecord[]) arrayList.toArray(new FilterItemRecord[arrayList.size()]);
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }

    public final String[] write(int i, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str2, long j) {
        String str3 = z || z2 || z3 || z4 || z6 ? String.format(Locale.getDefault(), "%s, %s %s", "mcq_questions", "mcq_parent_info", onCommand()) : String.format(Locale.getDefault(), "%s, %s", "mcq_questions", "mcq_parent_info");
        String str4 = String.format(Locale.getDefault(), "%s.%s = %s.%s", "mcq_questions", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_parent_info", "parent_mcq_id");
        String str5 = String.format(Locale.getDefault(), "%s.%s = '%s'", "mcq_parent_info", "parent_id", str);
        String str6 = String.format(Locale.getDefault(), "%s.%s = '%s'", "mcq_questions", FilterParams.KEY_COURSE_ID, Integer.valueOf(i));
        String strAudioAttributesCompatParcelizer = z ? AudioAttributesCompatParcelizer() : null;
        String strMediaDescriptionCompat = z2 ? MediaDescriptionCompat() : null;
        String strMediaMetadataCompat = z3 ? MediaMetadataCompat() : null;
        String strOnCustomAction = z4 ? onCustomAction() : null;
        String strWrite = z7 ? write() : null;
        String str7 = z5 ? read(j) : null;
        String strMediaDescriptionCompat2 = (parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) str2) || parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(str2, "all")) ? null : MediaDescriptionCompat(str2);
        String strMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = z6 ? MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() : null;
        String str8 = str3;
        String str9 = String.format(Locale.getDefault(), "%s.%s", "mcq_parent_info", "sort_order");
        String str10 = String.format(Locale.getDefault(), "DISTINCT (%s.%s) as %s", "mcq_parent_info", "parent_mcq_id", "__mcq_id");
        StringBuilder sb = new StringBuilder(str4);
        sb.append(" AND ");
        sb.append(str5);
        sb.append(" AND ");
        sb.append(str6);
        String[] strArr = {strAudioAttributesCompatParcelizer, strMediaDescriptionCompat, strMediaMetadataCompat, strOnCustomAction, strWrite, str7, strMediaDescriptionCompat2, strMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver};
        for (int i2 = 0; i2 < 8; i2++) {
            String str11 = strArr[i2];
            if (str11 != null) {
                sb.append(" AND ");
                sb.append(str11);
            }
        }
        return AudioAttributesCompatParcelizer("__mcq_id", String.format(Locale.getDefault(), "SELECT %s FROM %s WHERE %s ORDER BY %s ", str10, str8, sb, str9));
    }

    private static String onCommand() {
        return String.format(Locale.getDefault(), "LEFT OUTER JOIN %s ON %s.%s = %s.%s AND %s.%s = %s.%s", "mcq_answer", "mcq_questions", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_answer", "parent_mcq_id", "mcq_parent_info", "parent_id", "mcq_answer", "parent_id");
    }

    private static String onCustomAction() {
        return String.format(Locale.getDefault(), "%s.%s= 1 ", "mcq_answer", "is_guessed");
    }

    public static String AudioAttributesCompatParcelizer() {
        return String.format(Locale.getDefault(), "%s.%s= 1 ", "mcq_answer", "is_right");
    }

    public static String MediaMetadataCompat() {
        return String.format(Locale.getDefault(), "(%s.%s = %d OR %s.%s IS NULL)", "mcq_answer", StepResponseBody.KEY_MY_ANSWER, 0, "mcq_answer", StepResponseBody.KEY_MY_ANSWER);
    }

    public static String MediaDescriptionCompat() {
        return String.format(Locale.getDefault(), "%s.%s = 0 AND %s.%s > %d ", "mcq_answer", "is_right", "mcq_answer", StepResponseBody.KEY_MY_ANSWER, 0);
    }

    private static String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return String.format(Locale.getDefault(), "%s.%s > %d AND %s.%s != %s.%s AND %s.%s > %d", "mcq_answer", "first_answer", 0, "mcq_answer", StepResponseBody.KEY_MY_ANSWER, "mcq_answer", "first_answer", "mcq_answer", StepResponseBody.KEY_MY_ANSWER, 0);
    }

    private static String MediaDescriptionCompat(String str) {
        return String.format(Locale.getDefault(), "%s.%s='%s' ", "mcq_questions", "root_subject_id", str);
    }

    private static String read(long j) {
        return String.format(Locale.getDefault(), "%s.%s!='%s' AND %s.%s < %d AND (%s.%s > %d OR %s.%s <= %d)", "mcq_questions", "update_status", SessionDescription.SUPPORTED_SDP_VERSION, "mcq_questions", "st_up_start_time_ms", Long.valueOf(j), "mcq_questions", "st_up_end_time_ms", Long.valueOf(j), "mcq_questions", "st_up_end_time_ms", 0);
    }

    static String write() {
        return String.format(Locale.getDefault(), "%s.%s > %d", "mcq_questions", "bookmarked_type", 0);
    }

    public final int MediaMetadataCompat(String str) {
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(String.format(Locale.getDefault(), "SELECT %s FROM %s WHERE %s %s %s %s %s", String.format(Locale.getDefault(), "%s, %s, %s, %s, %s, %s, %s, %s, %s, %s.%s, %s.%s", "answer_pointer", "answered_option_1", "answered_option_2", "answered_option_3", "answered_option_4", "answered_option_5", "answered_option_6", "answered_option_7", "answered_option_8", "mcq_answer", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_answer", "parent_mcq_id"), String.format(Locale.getDefault(), "%s, %s, %s", "mcq_questions", "mcq_answer", "mcq_parent_info"), String.format(Locale.getDefault(), "%s.%s = %s.%s AND", "mcq_parent_info", "parent_id", "mcq_answer", "parent_id"), String.format(Locale.getDefault(), "%s.%s = %s.%s AND", "mcq_questions", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_parent_info", LessonMcqUpdateInfo.KEY_MCQ_ID), String.format(Locale.getDefault(), "%s.%s = %s.%s AND", "mcq_questions", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_answer", LessonMcqUpdateInfo.KEY_MCQ_ID), String.format(Locale.getDefault(), "%s.%s = '%s' AND", "mcq_parent_info", "parent_id", str), String.format(Locale.getDefault(), "%s.%s !=0  AND %s.%s = 0", "mcq_answer", StepResponseBody.KEY_MY_ANSWER, "mcq_answer", "is_right")));
        int i = 0;
        if (cursorRemoteActionCompatParcelizer == null) {
            return 0;
        }
        HashMap map = new HashMap();
        try {
            if (cursorRemoteActionCompatParcelizer.moveToFirst()) {
                int i2 = 0;
                do {
                    String string = cursorRemoteActionCompatParcelizer.getString(10);
                    if (!map.containsKey(string)) {
                        int i3 = parseText.read(cursorRemoteActionCompatParcelizer.getString(0));
                        int i4 = cursorRemoteActionCompatParcelizer.getInt(1);
                        int i5 = cursorRemoteActionCompatParcelizer.getInt(2);
                        int i6 = cursorRemoteActionCompatParcelizer.getInt(3);
                        int i7 = cursorRemoteActionCompatParcelizer.getInt(4);
                        int i8 = cursorRemoteActionCompatParcelizer.getInt(5);
                        int i9 = cursorRemoteActionCompatParcelizer.getInt(6);
                        int i10 = cursorRemoteActionCompatParcelizer.getInt(7);
                        int i11 = cursorRemoteActionCompatParcelizer.getInt(8);
                        String string2 = cursorRemoteActionCompatParcelizer.getString(9);
                        McqIndex mcqIndex = new McqIndex();
                        mcqIndex.setOption1AnsweredCount(i4);
                        mcqIndex.setOption2AnsweredCount(i5);
                        mcqIndex.setOption3AnsweredCount(i6);
                        mcqIndex.setOption4AnsweredCount(i7);
                        mcqIndex.setOption5AnsweredCount(i8);
                        mcqIndex.setOption6AnsweredCount(i9);
                        mcqIndex.setOption7AnsweredCount(i10);
                        mcqIndex.setOption8AnsweredCount(i11);
                        if (DefaultDashChunkSourceRepresentationSegmentIterator.AudioAttributesCompatParcelizer(mcqIndex, i3) && map.get(string) == null) {
                            map.put(string, string2);
                            i2++;
                        }
                    }
                } while (cursorRemoteActionCompatParcelizer.moveToNext());
                i = i2;
            }
            return i;
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }

    public final String[] AudioAttributesImplApi26Parcelizer(String str, String str2) {
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(String.format(Locale.getDefault(), "SELECT %s FROM %s WHERE %s %s %s %s %s %s ORDER BY %s", String.format(Locale.getDefault(), "%s, %s, %s, %s, %s, %s, %s, %s, %s, %s.%s", "answer_pointer", "answered_option_1", "answered_option_2", "answered_option_3", "answered_option_4", "answered_option_5", "answered_option_6", "answered_option_7", "answered_option_8", "mcq_answer", "parent_mcq_id"), String.format(Locale.getDefault(), "%s, %s, %s", "mcq_questions", "mcq_answer", "mcq_parent_info"), String.format(Locale.getDefault(), "%s.%s = %s.%s AND", "mcq_parent_info", "parent_id", "mcq_answer", "parent_id"), String.format(Locale.getDefault(), "%s.%s = %s.%s AND", "mcq_questions", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_parent_info", LessonMcqUpdateInfo.KEY_MCQ_ID), String.format(Locale.getDefault(), "%s.%s = %s.%s AND", "mcq_questions", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_answer", LessonMcqUpdateInfo.KEY_MCQ_ID), String.format(Locale.getDefault(), "%s.%s = '%s' AND", "mcq_parent_info", "parent_id", str), String.format(Locale.getDefault(), "%s.%s !=0  AND %s.%s = 0", "mcq_answer", StepResponseBody.KEY_MY_ANSWER, "mcq_answer", "is_right"), (parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) str2) || parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(str2, "all")) ? "" : String.format(Locale.getDefault(), " AND %s.%s = '%s'", "mcq_questions", "root_subject_id", str2), String.format(Locale.getDefault(), "%s.%s", "mcq_parent_info", "sort_order")));
        if (cursorRemoteActionCompatParcelizer == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            if (cursorRemoteActionCompatParcelizer.moveToFirst()) {
                do {
                    String string = cursorRemoteActionCompatParcelizer.getString(9);
                    if (arrayList.indexOf(string) == -1) {
                        int i = parseText.read(cursorRemoteActionCompatParcelizer.getString(0));
                        int i2 = cursorRemoteActionCompatParcelizer.getInt(1);
                        int i3 = cursorRemoteActionCompatParcelizer.getInt(2);
                        int i4 = cursorRemoteActionCompatParcelizer.getInt(3);
                        int i5 = cursorRemoteActionCompatParcelizer.getInt(4);
                        int i6 = cursorRemoteActionCompatParcelizer.getInt(5);
                        int i7 = cursorRemoteActionCompatParcelizer.getInt(6);
                        int i8 = cursorRemoteActionCompatParcelizer.getInt(7);
                        int i9 = cursorRemoteActionCompatParcelizer.getInt(8);
                        McqIndex mcqIndex = new McqIndex();
                        mcqIndex.setOption1AnsweredCount(i2);
                        mcqIndex.setOption2AnsweredCount(i3);
                        mcqIndex.setOption3AnsweredCount(i4);
                        mcqIndex.setOption4AnsweredCount(i5);
                        mcqIndex.setOption5AnsweredCount(i6);
                        mcqIndex.setOption6AnsweredCount(i7);
                        mcqIndex.setOption7AnsweredCount(i8);
                        mcqIndex.setOption8AnsweredCount(i9);
                        if (DefaultDashChunkSourceRepresentationSegmentIterator.AudioAttributesCompatParcelizer(mcqIndex, i) && arrayList.indexOf(string) == -1) {
                            arrayList.add(string);
                        }
                    }
                } while (cursorRemoteActionCompatParcelizer.moveToNext());
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }

    public final FilterItemRecord[] MediaBrowserCompatMediaItem(String str) {
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(String.format(Locale.getDefault(), "SELECT %s, %s FROM %s WHERE %s %s %s %s %s %s ORDER BY %s", String.format(Locale.getDefault(), "%s.%s, %s.%s", "_subject", "_id", "_subject", "title"), String.format(Locale.getDefault(), "%s.%s, %s, %s, %s, %s, %s, %s, %s, %s, %s", "mcq_questions", LessonMcqUpdateInfo.KEY_MCQ_ID, "answer_pointer", "answered_option_1", "answered_option_2", "answered_option_3", "answered_option_4", "answered_option_5", "answered_option_6", "answered_option_7", "answered_option_8"), String.format(Locale.getDefault(), "%s, %s, %s, %s", "_subject", "mcq_questions", "mcq_answer", "mcq_parent_info"), String.format(Locale.getDefault(), "%s.%s = %s.%s AND", "mcq_parent_info", "parent_id", "mcq_answer", "parent_id"), String.format(Locale.getDefault(), "%s.%s = %s.%s AND", "mcq_questions", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_parent_info", LessonMcqUpdateInfo.KEY_MCQ_ID), String.format(Locale.getDefault(), "%s.%s = %s.%s AND", "mcq_questions", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_answer", LessonMcqUpdateInfo.KEY_MCQ_ID), String.format(Locale.getDefault(), "%s.%s = %s.%s AND", "mcq_questions", "root_subject_id", "_subject", "_id"), String.format(Locale.getDefault(), "%s.%s = '%s' AND", "mcq_parent_info", "parent_id", str), String.format(Locale.getDefault(), "%s.%s !=0  AND %s.%s = 0", "mcq_answer", StepResponseBody.KEY_MY_ANSWER, "mcq_answer", "is_right"), String.format(Locale.getDefault(), "%s.%s", "_subject", "sort_order")));
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (cursorRemoteActionCompatParcelizer == null) {
            return null;
        }
        try {
            if (cursorRemoteActionCompatParcelizer.moveToFirst()) {
                do {
                    String string = cursorRemoteActionCompatParcelizer.getString(0);
                    String string2 = cursorRemoteActionCompatParcelizer.getString(1);
                    cursorRemoteActionCompatParcelizer.getString(2);
                    int i = parseText.read(cursorRemoteActionCompatParcelizer.getString(3));
                    int i2 = cursorRemoteActionCompatParcelizer.getInt(4);
                    int i3 = cursorRemoteActionCompatParcelizer.getInt(5);
                    int i4 = cursorRemoteActionCompatParcelizer.getInt(6);
                    int i5 = cursorRemoteActionCompatParcelizer.getInt(7);
                    int i6 = cursorRemoteActionCompatParcelizer.getInt(8);
                    int i7 = cursorRemoteActionCompatParcelizer.getInt(9);
                    int i8 = cursorRemoteActionCompatParcelizer.getInt(10);
                    int i9 = cursorRemoteActionCompatParcelizer.getInt(11);
                    McqIndex mcqIndex = new McqIndex();
                    mcqIndex.setOption1AnsweredCount(i2);
                    mcqIndex.setOption2AnsweredCount(i3);
                    mcqIndex.setOption3AnsweredCount(i4);
                    mcqIndex.setOption4AnsweredCount(i5);
                    mcqIndex.setOption5AnsweredCount(i6);
                    mcqIndex.setOption6AnsweredCount(i7);
                    mcqIndex.setOption7AnsweredCount(i8);
                    mcqIndex.setOption8AnsweredCount(i9);
                    if (DefaultDashChunkSourceRepresentationSegmentIterator.AudioAttributesCompatParcelizer(mcqIndex, i)) {
                        FilterItemRecord filterItemRecord = (FilterItemRecord) map.get(string);
                        if (filterItemRecord == null) {
                            arrayList.add(string);
                            filterItemRecord = new FilterItemRecord(string, string2, 0);
                            map.put(string, filterItemRecord);
                        }
                        filterItemRecord.count++;
                    }
                } while (cursorRemoteActionCompatParcelizer.moveToNext());
            }
            FilterItemRecord[] filterItemRecordArr = new FilterItemRecord[map.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                filterItemRecordArr[i10] = (FilterItemRecord) map.get(arrayList.get(i10));
            }
            return filterItemRecordArr;
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }

    public final Pair<Integer, Integer> MediaBrowserCompatSearchResultReceiver(String str) {
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(String.format("%s %s %s", String.format("select COUNT(DISTINCT(%s.%s)), COUNT(DISTINCT(%s.%s))", "mcqInfo", "parent_mcq_id", "ansInfo", "parent_mcq_id"), String.format("from %s as %s, %s as %s, %s as %s", "mcq_parent_info", "mcqInfo", "mcq_answer", "ansInfo", "_step", McqParentInfo.PARENT_TYPE_STEP), String.format("where %s AND %s AND %s AND %s", String.format("%s.%s = %s.%s", "ansInfo", "parent_id", McqParentInfo.PARENT_TYPE_STEP, "_id"), String.format("%s.%s = %s.%s", "mcqInfo", "parent_id", McqParentInfo.PARENT_TYPE_STEP, "_id"), String.format("%s.%s = %s.%s", "ansInfo", "parent_id", "mcqInfo", "parent_id"), String.format("%s.%s = '%s'", McqParentInfo.PARENT_TYPE_STEP, "lesson_id", str))));
        if (cursorRemoteActionCompatParcelizer == null) {
            return null;
        }
        try {
            cursorRemoteActionCompatParcelizer.moveToFirst();
            return new Pair<>(Integer.valueOf(cursorRemoteActionCompatParcelizer.getInt(0)), Integer.valueOf(cursorRemoteActionCompatParcelizer.getInt(1)));
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }
}
