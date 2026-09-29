package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.api.models.response.sync.CrossDeviceSyncResponseObject;
import com.marrow.data.models.LessonMcqUpdateInfo;
import com.marrow.data.models.lesson.McqHighYieldRecord;
import com.marrow.data.models.mcq.bookmark.FilterItemRecord;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\u0004\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\b¢\u0006\u0004\b!\u0010\"J\u001b\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b#\u0010\u0019J\u001b\u0010\u0016\u001a\u00020$2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0004\b\u0016\u0010%J#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0010¢\u0006\u0004\b\f\u0010&J+\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\b2\b\u0010 \u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0018\u0010'"}, d2 = {"Lo/getAdjustedWindowDefaultStartPositionUs;", "Lo/getIntervalUntilNextManifestRefreshMs;", "Lcom/marrow/data/models/lesson/McqHighYieldRecord;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Ljava/util/LinkedHashMap;", "", "RemoteActionCompatParcelizer", "()Ljava/util/LinkedHashMap;", "Landroid/database/Cursor;", "IconCompatParcelizer", "(Landroid/database/Cursor;)Lcom/marrow/data/models/lesson/McqHighYieldRecord;", "Landroid/content/ContentValues;", "(Lcom/marrow/data/models/lesson/McqHighYieldRecord;)Landroid/content/ContentValues;", "", "", "AudioAttributesCompatParcelizer", "()[Lcom/marrow/data/models/lesson/McqHighYieldRecord;", "MediaBrowserCompatSearchResultReceiver", "()Ljava/lang/String;", "read", "(Lcom/marrow/data/models/lesson/McqHighYieldRecord;)[Ljava/lang/String;", "MediaBrowserCompatItemReceiver", "(Ljava/lang/String;)[Ljava/lang/String;", "MediaBrowserCompatCustomActionResultReceiver", "(Ljava/lang/String;)I", "", "Lcom/marrow/data/models/mcq/bookmark/FilterItemRecord;", "AudioAttributesImplApi21Parcelizer", "(Ljava/lang/String;)Ljava/util/List;", "p1", "AudioAttributesImplApi26Parcelizer", "(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "AudioAttributesImplBaseParcelizer", "", "([Ljava/lang/String;)V", "(Ljava/lang/String;I)[Ljava/lang/String;", "(Ljava/lang/String;Ljava/lang/String;)[Lcom/marrow/data/models/lesson/McqHighYieldRecord;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getAdjustedWindowDefaultStartPositionUs extends getIntervalUntilNextManifestRefreshMs<McqHighYieldRecord> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getAdjustedWindowDefaultStartPositionUs(Context context) {
        super(context, "mcq_hyt");
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(McqHighYieldRecord mcqHighYieldRecord) {
        return read(mcqHighYieldRecord);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ McqHighYieldRecord RemoteActionCompatParcelizer(Cursor cursor) {
        return IconCompatParcelizer(cursor);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ McqHighYieldRecord[] RemoteActionCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ ContentValues write(McqHighYieldRecord mcqHighYieldRecord) {
        return IconCompatParcelizer2(mcqHighYieldRecord);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        return VideoTimelineResponseBody.IconCompatParcelizer(setAction.write(LessonMcqUpdateInfo.KEY_MCQ_ID, "TEXT"), setAction.write("hyt_id", "TEXT"), setAction.write("parent_id", "TEXT"), setAction.write("lesson_id", "TEXT"));
    }

    private static McqHighYieldRecord IconCompatParcelizer(Cursor p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String strMediaBrowserCompatItemReceiver = copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, LessonMcqUpdateInfo.KEY_MCQ_ID);
        if (strMediaBrowserCompatItemReceiver == null) {
            strMediaBrowserCompatItemReceiver = "";
        }
        String strMediaBrowserCompatItemReceiver2 = copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, "hyt_id");
        if (strMediaBrowserCompatItemReceiver2 == null) {
            strMediaBrowserCompatItemReceiver2 = "";
        }
        String strMediaBrowserCompatItemReceiver3 = copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, "parent_id");
        if (strMediaBrowserCompatItemReceiver3 == null) {
            strMediaBrowserCompatItemReceiver3 = "";
        }
        String strMediaBrowserCompatItemReceiver4 = copyAdaptationSets.MediaBrowserCompatItemReceiver(p0, "lesson_id");
        return new McqHighYieldRecord(strMediaBrowserCompatItemReceiver, strMediaBrowserCompatItemReceiver2, strMediaBrowserCompatItemReceiver3, strMediaBrowserCompatItemReceiver4 != null ? strMediaBrowserCompatItemReceiver4 : "");
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: avoid collision after fix types in other method */
    private static ContentValues IconCompatParcelizer2(McqHighYieldRecord p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        ContentValues contentValues = new ContentValues();
        contentValues.put(LessonMcqUpdateInfo.KEY_MCQ_ID, p0.getMcqId());
        contentValues.put("hyt_id", p0.getHighYieldId());
        contentValues.put("parent_id", p0.getParentId());
        contentValues.put("lesson_id", p0.getLessonId());
        return contentValues;
    }

    private static McqHighYieldRecord[] AudioAttributesCompatParcelizer() {
        return new McqHighYieldRecord[0];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "mcq_id =?  AND mcq_id =? ";
    }

    private static String[] read(McqHighYieldRecord p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new String[]{LessonMcqUpdateInfo.KEY_MCQ_ID, "hyt_id"};
    }

    public final String[] MediaBrowserCompatItemReceiver(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String[] strArr = read("hyt_id", "mcq_id =? ", new String[]{p0}, null);
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        return strArr;
    }

    public final int MediaBrowserCompatCustomActionResultReceiver(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("%s.%s", Arrays.copyOf(new Object[]{"mcq_hyt", LessonMcqUpdateInfo.KEY_MCQ_ID}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String str2 = String.format("%s, %s", Arrays.copyOf(new Object[]{"mcq_hyt", "_schema"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel3 = toMagicModuleStatusUcModel.INSTANCE;
        String str3 = String.format("%s.%s = %s.%s", Arrays.copyOf(new Object[]{"mcq_hyt", "hyt_id", "_schema", "_id"}, 4));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel4 = toMagicModuleStatusUcModel.INSTANCE;
        String str4 = String.format("%s AND %s.%s = '%s'", Arrays.copyOf(new Object[]{str3, "mcq_hyt", "parent_id", p0}, 4));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel5 = toMagicModuleStatusUcModel.INSTANCE;
        String str5 = String.format("select count(distinct(%s)) from %s where %s", Arrays.copyOf(new Object[]{str, str2, str4}, 3));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str5, "");
        return read(str5);
    }

    public final List<FilterItemRecord> AudioAttributesImplApi21Parcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("%s.%s = '%s'", Arrays.copyOf(new Object[]{"mcq_hyt", "parent_id", p0}, 3));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String str2 = String.format("%s.%s, %s.%s, count(*)", Arrays.copyOf(new Object[]{"_schema", "_id", "_schema", "title"}, 4));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel3 = toMagicModuleStatusUcModel.INSTANCE;
        String str3 = String.format("%s, %s", Arrays.copyOf(new Object[]{"_schema", "mcq_hyt"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel4 = toMagicModuleStatusUcModel.INSTANCE;
        String str4 = String.format("%s.%s = %s.%s", Arrays.copyOf(new Object[]{"_schema", "_id", "mcq_hyt", "hyt_id"}, 4));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel5 = toMagicModuleStatusUcModel.INSTANCE;
        String str5 = String.format("%s and %s", Arrays.copyOf(new Object[]{str4, str}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str5, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel6 = toMagicModuleStatusUcModel.INSTANCE;
        String str6 = String.format("%s.%s", Arrays.copyOf(new Object[]{"_schema", "_id"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str6, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel7 = toMagicModuleStatusUcModel.INSTANCE;
        String str7 = String.format("select %s from %s where %s group by %s", Arrays.copyOf(new Object[]{str2, str3, str5, str6}, 4));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str7, "");
        final ArrayList arrayList = new ArrayList();
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str7);
        if (cursorRemoteActionCompatParcelizer == null) {
            return arrayList;
        }
        Cursor cursor = cursorRemoteActionCompatParcelizer;
        try {
            final Cursor cursor2 = cursor;
            copyAdaptationSets.RemoteActionCompatParcelizer(cursor2, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.DashMediaSourceDashTimeline
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return getAdjustedWindowDefaultStartPositionUs.IconCompatParcelizer(cursor2, arrayList);
                }
            });
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            MagicModuleMetaLSModel.IconCompatParcelizer(cursor, null);
            return arrayList;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(Cursor cursor, List list) {
        String string = cursor.getString(0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = cursor.getString(1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        list.add(new FilterItemRecord(string, string2, cursor.getInt(2), 0, 8, null));
        return getShowPopup.INSTANCE;
    }

    public final String[] AudioAttributesImplApi26Parcelizer(String p0, String p1) {
        String str;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str2 = String.format("%s = '%s'", Arrays.copyOf(new Object[]{"hyt_id", p1}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String str3 = String.format("%s = '%s'", Arrays.copyOf(new Object[]{"parent_id", p0}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        String str4 = p1;
        if (str4 == null || str4.length() == 0 || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p1, (Object) "all")) {
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel3 = toMagicModuleStatusUcModel.INSTANCE;
            str = String.format("%s", Arrays.copyOf(new Object[]{str3}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        } else {
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel4 = toMagicModuleStatusUcModel.INSTANCE;
            str = String.format("%s AND %s", Arrays.copyOf(new Object[]{str2, str3}, 2));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        }
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel5 = toMagicModuleStatusUcModel.INSTANCE;
        String str5 = String.format("%s", Arrays.copyOf(new Object[]{"mcq_hyt"}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str5, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel6 = toMagicModuleStatusUcModel.INSTANCE;
        String str6 = String.format("%s", Arrays.copyOf(new Object[]{LessonMcqUpdateInfo.KEY_MCQ_ID}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str6, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel7 = toMagicModuleStatusUcModel.INSTANCE;
        String str7 = String.format("select distinct(%s) from %s where %s", Arrays.copyOf(new Object[]{str6, str5, str}, 3));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str7, "");
        String[] strArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(str6, str7);
        return strArrAudioAttributesCompatParcelizer == null ? new String[0] : strArrAudioAttributesCompatParcelizer;
    }

    public final String[] AudioAttributesImplBaseParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("select distinct(%s) from %s where %s = '%s'", Arrays.copyOf(new Object[]{"hyt_id", "mcq_hyt", "lesson_id", p0}, 4));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        String[] strArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer("hyt_id", str);
        return strArrAudioAttributesCompatParcelizer == null ? new String[0] : strArrAudioAttributesCompatParcelizer;
    }

    public final void read(String[] p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        MediaBrowserCompatItemReceiver("lesson_id", p0);
    }

    public final String[] IconCompatParcelizer(String p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        boolean z = p1 == -4;
        boolean z2 = p1 == -3;
        boolean z3 = p1 == -5;
        boolean z4 = p1 == -6;
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("%s.%s = %s.%s", Arrays.copyOf(new Object[]{"mcq_hyt", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_answer", LessonMcqUpdateInfo.KEY_MCQ_ID}, 4));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String str2 = String.format(Locale.getDefault(), "%s.%s, %s.%s, %s.%s", Arrays.copyOf(new Object[]{"_subject", "sort_order", "_subject", "_id", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "lesson_number"}, 6));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel3 = toMagicModuleStatusUcModel.INSTANCE;
        String str3 = String.format(Locale.getDefault(), "%s, %s, %s, %s, %s", Arrays.copyOf(new Object[]{"mcq_hyt", "mcq_answer", "_subject", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "mcq_questions"}, 5));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel4 = toMagicModuleStatusUcModel.INSTANCE;
        String str4 = String.format("%s.%s = %s.%s", Arrays.copyOf(new Object[]{"mcq_hyt", "lesson_id", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "_id"}, 4));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel5 = toMagicModuleStatusUcModel.INSTANCE;
        String str5 = String.format("%s.%s = %s.%s", Arrays.copyOf(new Object[]{CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "root_subject_id", "_subject", "_id"}, 4));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str5, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel6 = toMagicModuleStatusUcModel.INSTANCE;
        String str6 = String.format(Locale.getDefault(), "%s.%s = '%s'", Arrays.copyOf(new Object[]{"mcq_hyt", "hyt_id", p0}, 3));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str6, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel7 = toMagicModuleStatusUcModel.INSTANCE;
        String str7 = String.format("%s.%s = %s.%s", Arrays.copyOf(new Object[]{"mcq_hyt", LessonMcqUpdateInfo.KEY_MCQ_ID, "mcq_questions", LessonMcqUpdateInfo.KEY_MCQ_ID}, 4));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str7, "");
        String strAudioAttributesCompatParcelizer = z ? setManifestParser.AudioAttributesCompatParcelizer() : null;
        String strMediaDescriptionCompat = z2 ? setManifestParser.MediaDescriptionCompat() : null;
        String strMediaMetadataCompat = z3 ? setManifestParser.MediaMetadataCompat() : null;
        String strWrite = z4 ? setManifestParser.write() : null;
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel8 = toMagicModuleStatusUcModel.INSTANCE;
        String str8 = String.format(Locale.getDefault(), "DISTINCT (%s.%s) as %s", Arrays.copyOf(new Object[]{"mcq_hyt", LessonMcqUpdateInfo.KEY_MCQ_ID, "__mcq_id"}, 3));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str8, "");
        StringBuilder sb = new StringBuilder(str);
        sb.append(" AND ");
        sb.append(str4);
        sb.append(" AND ");
        sb.append(str5);
        sb.append(" AND ");
        sb.append(str6);
        sb.append(" AND ");
        sb.append(str7);
        String[] strArr = {strAudioAttributesCompatParcelizer, strMediaDescriptionCompat, strMediaMetadataCompat, strWrite};
        for (int i = 0; i < 4; i++) {
            String str9 = strArr[i];
            if (str9 != null) {
                sb.append(" AND ");
                sb.append(str9);
            }
        }
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel9 = toMagicModuleStatusUcModel.INSTANCE;
        String str10 = String.format(Locale.getDefault(), "SELECT %s FROM %s WHERE %s order by %s", Arrays.copyOf(new Object[]{str8, str3, sb, str2}, 4));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str10, "");
        String[] strArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer("__mcq_id", str10);
        return strArrAudioAttributesCompatParcelizer == null ? new String[0] : strArrAudioAttributesCompatParcelizer;
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: merged with bridge method [inline-methods] */
    public final McqHighYieldRecord[] IconCompatParcelizer(String p0, String p1) {
        return (McqHighYieldRecord[]) super.IconCompatParcelizer(p0, p1);
    }
}
