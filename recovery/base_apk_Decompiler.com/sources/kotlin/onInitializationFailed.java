package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.marrow.data.api.models.response.lesson.step.StepResponseBody;
import com.marrow.data.api.models.response.sync.CrossDeviceSyncResponseObject;
import com.marrow.data.models.LessonMcqUpdateInfo;
import com.marrow.data.models.mcq.McqAnswer;
import com.marrow.data.models.mcq.QaPair;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class onInitializationFailed extends getIntervalUntilNextManifestRefreshMs<McqAnswer> {
    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* bridge */ /* synthetic */ String[] IconCompatParcelizer(McqAnswer mcqAnswer) {
        return IconCompatParcelizer2(mcqAnswer);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ McqAnswer RemoteActionCompatParcelizer(Cursor cursor) {
        return write(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ McqAnswer[] RemoteActionCompatParcelizer(int i) {
        return IconCompatParcelizer(i);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(McqAnswer mcqAnswer) {
        return RemoteActionCompatParcelizer(mcqAnswer);
    }

    public onInitializationFailed(Context context) {
        super(context, "mcq_answer");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(LessonMcqUpdateInfo.KEY_MCQ_ID, "TEXT");
        linkedHashMap.put("parent_id", "TEXT");
        linkedHashMap.put(StepResponseBody.KEY_MY_ANSWER, "INTEGER");
        linkedHashMap.put("is_guessed", "INTEGER");
        linkedHashMap.put("is_starred", "INTEGER");
        linkedHashMap.put("is_right", "INTEGER");
        linkedHashMap.put("first_answer", "INTEGER");
        linkedHashMap.put("parent_mcq_id", "TEXT");
        return linkedHashMap;
    }

    private static McqAnswer write(Cursor cursor) {
        McqAnswer mcqAnswer = new McqAnswer();
        mcqAnswer.setMcqId(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, LessonMcqUpdateInfo.KEY_MCQ_ID));
        mcqAnswer.setServerAnswer(getPeriodDurationMs.write(cursor, StepResponseBody.KEY_MY_ANSWER));
        mcqAnswer.setParentId(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "parent_id"));
        mcqAnswer.setGuessed(getPeriodDurationMs.read(cursor, "is_guessed"));
        mcqAnswer.setRight(getPeriodDurationMs.read(cursor, "is_right"));
        mcqAnswer.setFirstAnswer(getPeriodDurationMs.write(cursor, "first_answer"));
        mcqAnswer.setParentMcqId(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "parent_mcq_id"));
        mcqAnswer.setStarred(getPeriodDurationMs.read(cursor, "is_starred"));
        return mcqAnswer;
    }

    private static ContentValues RemoteActionCompatParcelizer(McqAnswer mcqAnswer) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(LessonMcqUpdateInfo.KEY_MCQ_ID, mcqAnswer.getMcqId());
        contentValues.put("parent_id", mcqAnswer.getParentId());
        contentValues.put(StepResponseBody.KEY_MY_ANSWER, Integer.valueOf(mcqAnswer.getSelectedAnswer()));
        contentValues.put("is_guessed", Boolean.valueOf(mcqAnswer.isGuessed()));
        contentValues.put("is_right", Boolean.valueOf(mcqAnswer.isRight()));
        contentValues.put("first_answer", Integer.valueOf(mcqAnswer.getFirstAnswer()));
        contentValues.put("parent_mcq_id", mcqAnswer.getParentMcqId());
        contentValues.put("is_starred", Boolean.valueOf(mcqAnswer.isStarred()));
        return contentValues;
    }

    private static McqAnswer[] IconCompatParcelizer(int i) {
        return new McqAnswer[i];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "parent_id =?  AND mcq_id =? ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: merged with bridge method [inline-methods] */
    public McqAnswer[] IconCompatParcelizer(String str, String str2) {
        return (McqAnswer[]) super.IconCompatParcelizer(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: merged with bridge method [inline-methods] */
    public McqAnswer[] AudioAttributesImplBaseParcelizer(String str, String[] strArr) {
        return (McqAnswer[]) super.AudioAttributesImplBaseParcelizer(str, strArr);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: avoid collision after fix types in other method */
    private static String[] IconCompatParcelizer2(McqAnswer mcqAnswer) {
        return new String[]{mcqAnswer.getParentId(), mcqAnswer.getMcqId()};
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: merged with bridge method [inline-methods] */
    public final McqAnswer a_(String... strArr) {
        return (McqAnswer) super.a_(strArr);
    }

    public final int MediaDescriptionCompat(String str) {
        return RemoteActionCompatParcelizer(String.format(Locale.getDefault(), "%s.%s", "mcq_answer", "parent_mcq_id"), "parent_id =?  AND is_right =?  AND my_answer <> ? ", new String[]{str, SessionDescription.SUPPORTED_SDP_VERSION, SessionDescription.SUPPORTED_SDP_VERSION});
    }

    public final int AudioAttributesImplApi21Parcelizer(String str) {
        return RemoteActionCompatParcelizer(String.format(Locale.getDefault(), "%s.%s", "mcq_answer", "parent_mcq_id"), "parent_id =?  AND is_right =? ", new String[]{str, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE});
    }

    public final int RatingCompat(String str) {
        return read(String.format(Locale.getDefault(), "SELECT COUNT(DISTINCT(%s.%s)) FROM %s LEFT OUTER JOIN %s ON %s.%s = %s.%s AND %s.%s = %s.%s LEFT OUTER JOIN %s ON %s.%s = %s.%s WHERE %s.%s = '%s' AND (%s.%s = %d OR (%s.%s IS NULL AND %s.%s == 0))", "mcq_parent_info", "parent_mcq_id", "mcq_parent_info", "mcq_answer", "mcq_answer", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_parent_info", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_answer", "parent_id", "mcq_parent_info", "parent_id", "mcq_questions", "mcq_questions", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_parent_info", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_parent_info", "parent_id", str, "mcq_answer", StepResponseBody.KEY_MY_ANSWER, 0, "mcq_answer", StepResponseBody.KEY_MY_ANSWER, "mcq_questions", "mcq_type"));
    }

    public final int AudioAttributesImplApi26Parcelizer(String str) {
        return write("parent_id =?  AND is_guessed =?  AND is_right =?  AND my_answer <> ? ", new String[]{str, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, SessionDescription.SUPPORTED_SDP_VERSION, SessionDescription.SUPPORTED_SDP_VERSION});
    }

    public final int AudioAttributesImplBaseParcelizer(String str) {
        return write("parent_id =?  AND is_guessed =?  AND is_right =? ", new String[]{str, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE});
    }

    public final int MediaBrowserCompatCustomActionResultReceiver(String str) {
        return write("parent_id =?  AND first_answer != my_answer AND first_answer>? AND my_answer>?", new String[]{str, SessionDescription.SUPPORTED_SDP_VERSION, SessionDescription.SUPPORTED_SDP_VERSION});
    }

    public final QaPair[] MediaBrowserCompatMediaItem(String str) {
        return AudioAttributesCompatParcelizer(super.RemoteActionCompatParcelizer(String.format(Locale.getDefault(), "SELECT %s FROM %s,%s LEFT OUTER JOIN %s ON %s AND %s WHERE %s AND %s ORDER BY %s", String.format(Locale.getDefault(), "%s,%s,%s,%s,%s,%s,%s,%s,%s", String.format(Locale.getDefault(), "%s.%s", "mcq_questions", LessonMcqUpdateInfo.KEY_MCQ_ID), String.format(Locale.getDefault(), "%s.%s", "mcq_questions", "answer_pointer"), String.format(Locale.getDefault(), "%s.%s", "mcq_answer", "parent_id"), String.format(Locale.getDefault(), "%s.%s", "mcq_answer", StepResponseBody.KEY_MY_ANSWER), String.format(Locale.getDefault(), "%s.%s", "mcq_questions", "boolean_flags"), String.format(Locale.getDefault(), "%s.%s", "mcq_answer", "is_guessed"), String.format(Locale.getDefault(), "%s.%s", "mcq_answer", "is_right"), String.format(Locale.getDefault(), "%s.%s", "mcq_answer", "first_answer"), String.format(Locale.getDefault(), "%s.%s", "mcq_answer", "is_starred")), "mcq_questions", "mcq_parent_info", "mcq_answer", String.format(Locale.getDefault(), "%s.%s=%s.%s", "mcq_questions", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_answer", LessonMcqUpdateInfo.KEY_MCQ_ID), String.format(Locale.getDefault(), "%s.%s=%s.%s", "mcq_parent_info", "parent_id", "mcq_answer", "parent_id"), String.format(Locale.getDefault(), "%s.%s=%s.%s", "mcq_parent_info", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_questions", LessonMcqUpdateInfo.KEY_MCQ_ID), String.format(Locale.getDefault(), "%s.%s='%s'", "mcq_parent_info", "parent_id", str), String.format(Locale.getDefault(), "%s.%s", "mcq_parent_info", "sort_order"))));
    }

    private QaPair[] AudioAttributesCompatParcelizer(Cursor cursor) {
        McqAnswer mcqAnswer;
        if (cursor == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (cursor.moveToFirst()) {
            do {
                String string = cursor.getString(0);
                String string2 = cursor.getString(1);
                String string3 = cursor.getString(2);
                int i = cursor.getInt(3);
                boolean z = cursor.getInt(5) == 1;
                boolean z2 = cursor.getInt(6) == 1;
                int i2 = cursor.getInt(7);
                boolean z3 = cursor.getInt(8) == 1;
                if (parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) string3)) {
                    mcqAnswer = null;
                } else {
                    mcqAnswer = new McqAnswer();
                    mcqAnswer.setMcqId(string);
                    mcqAnswer.setParentId(string3);
                    mcqAnswer.setServerAnswer(i);
                    mcqAnswer.setGuessed(z);
                    mcqAnswer.setStarred(z3);
                    mcqAnswer.setRight(z2);
                    mcqAnswer.setFirstAnswer(i2);
                    mcqAnswer.setHighYieldIds(AudioAttributesCompatParcelizer("hyt_id", String.format("select %s from %s where %s='%s'", "hyt_id", "mcq_hyt", LessonMcqUpdateInfo.KEY_MCQ_ID, mcqAnswer.getMcqId())));
                }
                arrayList.add(new QaPair(string, string2, z3, mcqAnswer));
            } while (cursor.moveToNext());
        }
        return (QaPair[]) arrayList.toArray(new QaPair[arrayList.size()]);
    }

    public final int MediaBrowserCompatItemReceiver(String str) {
        return AudioAttributesCompatParcelizer(String.format(Locale.getDefault(), "%s IN (%s)", "parent_id", String.format(Locale.getDefault(), "SELECT %s FROM %s WHERE %s='%s'", "_id", "_step", "lesson_id", str)), (String[]) null);
    }

    public final int read(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return 0;
        }
        return AudioAttributesCompatParcelizer(String.format(Locale.getDefault(), "%s IN (%s)", "parent_id", String.format(Locale.getDefault(), "SELECT %s FROM %s WHERE %s", "_id", "_step", read("lesson_id", strArr))), (String[]) null);
    }

    public final void AudioAttributesCompatParcelizer() {
        AudioAttributesCompatParcelizer(String.format(Locale.getDefault(), "%s IN (%s)", "parent_id", String.format(Locale.getDefault(), "SELECT %s FROM %s WHERE %s IN (%s)", "_id", "_step", "lesson_id", String.format(Locale.getDefault(), "SELECT %s FROM %s WHERE %s = %s", "_id", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "lesson_type", 1))), (String[]) null);
    }

    public final void IconCompatParcelizer(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        AudioAttributesCompatParcelizer(read("parent_id", (String[]) list.toArray(new String[0])), (String[]) null);
    }

    public final int MediaMetadataCompat(String str) {
        return read(String.format("SELECT count(*) FROM %s LEFT OUTER JOIN %s ON %s.%s == %s.%s AND %s.%s == %s.%s WHERE %s.%s = '%s'", "mcq_answer", "mcq_parent_info", "mcq_answer", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_parent_info", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_answer", "parent_id", "mcq_parent_info", "parent_id", "mcq_parent_info", "parent_id", str));
    }

    public final void MediaBrowserCompatSearchResultReceiver(String str) {
        String[] strArr = {str, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, SessionDescription.SUPPORTED_SDP_VERSION};
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_starred", (Integer) 0);
        write(contentValues, "parent_id =?  AND is_starred =?  AND my_answer =? ", strArr);
        String[] strArr2 = {str, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, SessionDescription.SUPPORTED_SDP_VERSION};
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put(StepResponseBody.KEY_MY_ANSWER, (Integer) 0);
        contentValues2.put("is_right", (Integer) 0);
        write(contentValues2, "parent_id =?  AND is_starred =?  AND my_answer <> ? ", strArr2);
    }
}
