package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.marrow.data.models.mcq.bookmark.FilterItemRecord;
import com.marrow.data.models.mcq.bookmark.MultiBookmarkCounter;
import com.marrow.data.models.pearl.PearlListItem;
import com.marrow.data.models.pearl.PearlListModel;
import com.marrow.data.models.pearl.PearlMini;
import com.marrow.data.models.subject.Subject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class maybeThrowManifestError extends r8lambdaQhKDSbjrsLfLz7h85E2gZ0PpZrc<PearlMini> {
    private static final String[] RemoteActionCompatParcelizer = {"_id", "title", "subject_id", PearlMini.KEY_PEARL_TYPE, PearlMini.KEY_THUMBNAIL, PearlMini.KEY_THUMBNAIL_V2, PearlMini.KEY_PEARL_DISPLAY_ID, "is_bookmarked"};

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ void AudioAttributesCompatParcelizer(Object obj) {
        MediaMetadataCompat();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ void IconCompatParcelizer(Object[] objArr) {
        MediaDescriptionCompat();
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final /* synthetic */ String[] IconCompatParcelizer(Object obj) {
        return write((PearlMini) obj);
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
    public final /* synthetic */ ContentValues write(Object obj) {
        return AudioAttributesCompatParcelizer();
    }

    public maybeThrowManifestError(Context context, getStreamPositionUsForContent getstreampositionusforcontent) {
        super(context, "_pearl", getstreampositionusforcontent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.r8lambdaQhKDSbjrsLfLz7h85E2gZ0PpZrc, kotlin.getIntervalUntilNextManifestRefreshMs
    public PearlMini[] read(String str, String[] strArr, String str2) {
        Cursor cursorQuery = this.MediaBrowserCompatCustomActionResultReceiver.getContentResolver().query(MediaBrowserCompatItemReceiver(), RemoteActionCompatParcelizer, str, strArr, str2);
        if (cursorQuery == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            if (cursorQuery.moveToFirst()) {
                do {
                    arrayList.add(AudioAttributesCompatParcelizer(cursorQuery));
                } while (cursorQuery.moveToNext());
            }
            return IconCompatParcelizer(arrayList);
        } finally {
            cursorQuery.close();
        }
    }

    public final PearlMini MediaBrowserCompatCustomActionResultReceiver(String str) {
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(String.format(Locale.getDefault(), "select %s from %s where UPPER(%s) = '%s'", "_id", "_pearl", PearlMini.KEY_PEARL_DISPLAY_ID, str.toUpperCase(), null));
        if (cursorRemoteActionCompatParcelizer != null && cursorRemoteActionCompatParcelizer.moveToFirst()) {
            return MediaBrowserCompatItemReceiver(cursorRemoteActionCompatParcelizer.getString(0));
        }
        return null;
    }

    public final String[][] IconCompatParcelizer(String str, String str2, boolean z, int i) {
        String str3;
        if (!Subject.ROOT_PARENT_ID.equals(str2)) {
            return AudioAttributesCompatParcelizer(str, str2, z, i);
        }
        String str4 = String.format(Locale.getDefault(), "%s, %s", "_id", PearlMini.KEY_PEARL_DISPLAY_ID);
        String str5 = String.format(Locale.getDefault(), "%s", "_pearl");
        String str6 = String.format(Locale.getDefault(), "%s='%s'", PearlMini.KEY_PEARL_TYPE, str);
        if (z) {
            str3 = i == 0 ? String.format(Locale.getDefault(), "%s > 0 ", "is_bookmarked") : String.format(Locale.getDefault(), " %s = %s ", "is_bookmarked", Integer.valueOf(i));
        } else {
            str3 = null;
        }
        String string = String.format(Locale.getDefault(), "%s ", str6);
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(" AND ");
            sb.append(str3);
            string = sb.toString();
        }
        Cursor cursorRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer(String.format(Locale.getDefault(), "Select %s from %s where %s ORDER BY %s.%s DESC", str4, str5, string, "_pearl", "_id"));
        if (cursorRemoteActionCompatParcelizer == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String[] strArr = {"_id", PearlMini.KEY_PEARL_DISPLAY_ID};
            if (cursorRemoteActionCompatParcelizer.moveToFirst()) {
                do {
                    String[] strArr2 = new String[2];
                    for (int i2 = 0; i2 < 2; i2++) {
                        strArr2[i2] = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursorRemoteActionCompatParcelizer, strArr[i2]);
                    }
                    arrayList.add(strArr2);
                } while (cursorRemoteActionCompatParcelizer.moveToNext());
            }
            return (String[][]) arrayList.toArray(new String[arrayList.size()][]);
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }

    private String[][] AudioAttributesCompatParcelizer(String str, String str2, boolean z, int i) {
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(String.format(Locale.getDefault(), "select  %s, %s from %s where %s = '%s' order by %s ", "_id", "title", "_subject", "parent_id", str2, "sort_order"));
        if (cursorRemoteActionCompatParcelizer == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            if (cursorRemoteActionCompatParcelizer.moveToFirst()) {
                do {
                    String string = cursorRemoteActionCompatParcelizer.getString(0);
                    cursorRemoteActionCompatParcelizer.getString(1);
                    String[][] strArr = read(string, str, z, i);
                    if (!parseCea608AccessibilityChannel.read(strArr)) {
                        arrayList.addAll(Arrays.asList(strArr));
                    }
                } while (cursorRemoteActionCompatParcelizer.moveToNext());
            }
            String[][] strArr2 = read(str2, str, z, i);
            if (!parseCea608AccessibilityChannel.read(strArr2) && !parseCea608AccessibilityChannel.read(strArr2)) {
                arrayList.addAll(Arrays.asList(strArr2));
            }
            return (String[][]) arrayList.toArray(new String[arrayList.size()][]);
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }

    private String[][] read(String str, String str2, boolean z, int i) {
        StringBuilder sb = new StringBuilder("pearl_type = ");
        sb.append(String.format(Locale.getDefault(), "'%s'  AND ", str2));
        String string = sb.toString();
        if (z) {
            string = i == 0 ? String.format(Locale.getDefault(), "%s %s > 0 AND ", string, "is_bookmarked") : String.format(Locale.getDefault(), "%s %s = %s AND ", string, "is_bookmarked", Integer.valueOf(i));
        }
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(String.format(Locale.getDefault(), "select %s.%s, %s from %s, %s where %s %s.%s = %s.%s and %s = '%s' order by display_id desc", "_pearl", "_id", PearlMini.KEY_PEARL_DISPLAY_ID, "_pearl", "pearl_topic_info", string, "_pearl", "_id", "pearl_topic_info", "pearl_id", "topic_id", str, PearlMini.KEY_PEARL_DISPLAY_ID));
        if (cursorRemoteActionCompatParcelizer == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String[] strArr = {"_id", PearlMini.KEY_PEARL_DISPLAY_ID};
            if (cursorRemoteActionCompatParcelizer.moveToFirst()) {
                do {
                    String[] strArr2 = new String[2];
                    for (int i2 = 0; i2 < 2; i2++) {
                        strArr2[i2] = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursorRemoteActionCompatParcelizer, strArr[i2]);
                    }
                    arrayList.add(strArr2);
                } while (cursorRemoteActionCompatParcelizer.moveToNext());
            }
            return (String[][]) arrayList.toArray(new String[arrayList.size()][]);
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }

    private static PearlMini AudioAttributesCompatParcelizer(Cursor cursor) {
        PearlMini pearlMini = new PearlMini();
        pearlMini.setId(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "_id"));
        pearlMini.setTitle(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "title"));
        pearlMini.setSubjectId(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "subject_id"));
        pearlMini.setPearlType(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, PearlMini.KEY_PEARL_TYPE));
        pearlMini.setPearlDisplayId(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, PearlMini.KEY_PEARL_DISPLAY_ID));
        pearlMini.setThumbnailUrl(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, PearlMini.KEY_THUMBNAIL));
        pearlMini.setThumbnailV2Url(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, PearlMini.KEY_THUMBNAIL_V2));
        pearlMini.isBookmarked = getPeriodDurationMs.write(cursor, "is_bookmarked");
        return pearlMini;
    }

    public final PearlMini MediaBrowserCompatItemReceiver(String str) {
        return (PearlMini) super.a_(str);
    }

    private static ContentValues AudioAttributesCompatParcelizer() {
        throw new UnsupportedOperationException("PearlMiniTable is shortcut table. Insertion should be done through PearlTable");
    }

    private static void MediaMetadataCompat() {
        throw new UnsupportedOperationException("PearlMiniTable is shortcut table. Insertion should be done through PearlTable");
    }

    private static void MediaDescriptionCompat() {
        throw new UnsupportedOperationException("PearlMiniTable is shortcut table. Insertion should be done through PearlTable");
    }

    @Override // kotlin.r8lambdaQhKDSbjrsLfLz7h85E2gZ0PpZrc, kotlin.getIntervalUntilNextManifestRefreshMs
    public final LinkedHashMap<String, String> RemoteActionCompatParcelizer() {
        super.RemoteActionCompatParcelizer();
        throw new UnsupportedOperationException("PearlMiniTable is shortcut table. Creation should be done through PearlTable");
    }

    private static PearlMini[] IconCompatParcelizer(int i) {
        return new PearlMini[i];
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public final String MediaBrowserCompatSearchResultReceiver() {
        return "_id =? ";
    }

    private static String[] write(PearlMini pearlMini) {
        return new String[]{pearlMini.getId()};
    }

    public final FilterItemRecord[] write(String str, List<String> list) {
        String str2 = String.format(Locale.getDefault(), "%s.%s, %s.%s, %s, SUM(%s) as %s", "_subject", "_id", "_subject", "title", "Count(*)", "is_bookmarked", "bookmark_count");
        String str3 = String.format(Locale.getDefault(), "%s.%s = %s.%s", "pearl_subject_info", "subject_id", "_subject", "_id");
        String str4 = String.format(Locale.getDefault(), "%s.%s = %s.%s", "_pearl", "_id", "pearl_subject_info", "pearl_id");
        String str5 = String.format(Locale.getDefault(), "%s.%s = '%s'", "_pearl", PearlMini.KEY_PEARL_TYPE, str);
        String str6 = String.format(Locale.getDefault(), "%s.%s = '%s'", "_subject", "parent_id", Subject.ROOT_PARENT_ID);
        String str7 = String.format(Locale.getDefault(), "%s.%s", "_subject", getIntervalUntilNextManifestRefreshMs.RemoteActionCompatParcelizer("_id", list));
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append(" AND ");
        sb.append(str4);
        sb.append(" AND ");
        sb.append(str5);
        sb.append(" AND ");
        sb.append(str6);
        sb.append(" AND ");
        sb.append(str7);
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(String.format(Locale.getDefault(), "SELECT %s FROM %s,%s,%s WHERE %s GROUP BY %s ORDER BY %s", str2, "_subject", "_pearl", "pearl_subject_info", sb.toString(), String.format(Locale.getDefault(), "%s.%s", "_subject", "_id"), String.format(Locale.getDefault(), "%s.%s", "_subject", "sort_order")));
        if (cursorRemoteActionCompatParcelizer == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            if (cursorRemoteActionCompatParcelizer.moveToFirst()) {
                do {
                    arrayList.add(IconCompatParcelizer(cursorRemoteActionCompatParcelizer));
                } while (cursorRemoteActionCompatParcelizer.moveToNext());
            }
            return (FilterItemRecord[]) arrayList.toArray(new FilterItemRecord[0]);
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }

    private static FilterItemRecord IconCompatParcelizer(Cursor cursor) {
        return new FilterItemRecord(getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "_id"), getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "title"), getPeriodDurationMs.write(cursor, "Count(*)"), getPeriodDurationMs.write(cursor, "bookmark_count"));
    }

    public final PearlListItem[] read(String str, boolean z, int i, String str2) {
        if (!Subject.ROOT_PARENT_ID.equals(str)) {
            return write(str, z, i);
        }
        String str3 = String.format(Locale.getDefault(), "%s = '%s' AND %s.%s = %s.%s", PearlMini.KEY_PEARL_TYPE, "html", "_pearl", "subject_id", "_subject", "_id");
        String str4 = String.format(Locale.getDefault(), "%s, %s", "_pearl", "_subject");
        if (z) {
            str3 = String.format(Locale.getDefault(), "%s AND %s", str3, i == 0 ? String.format(Locale.getDefault(), "%s > 0 ", "is_bookmarked") : String.format(Locale.getDefault(), "%s = %s ", "is_bookmarked", Integer.valueOf(i)));
        }
        if (!str2.isEmpty()) {
            str3 = String.format(Locale.getDefault(), "%s  AND %s", str3, String.format(Locale.getDefault(), "%s = '%s'", PearlMini.KEY_PEARL_DISPLAY_ID, str2));
        }
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(String.format(Locale.getDefault(), "Select %s from %s where %s order by %s desc", String.format(Locale.getDefault(), "%s.%s, %s, %s.%s, %s, %s.%s", "_pearl", "_id", PearlMini.KEY_PEARL_DISPLAY_ID, "_pearl", "title", "is_bookmarked", "_subject", "title"), str4, str3, PearlMini.KEY_PEARL_DISPLAY_ID));
        if (cursorRemoteActionCompatParcelizer == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            if (cursorRemoteActionCompatParcelizer.moveToFirst()) {
                do {
                    arrayList.add(PearlListItem.newInstance(str, new PearlListModel(cursorRemoteActionCompatParcelizer.getString(0), cursorRemoteActionCompatParcelizer.getString(1), cursorRemoteActionCompatParcelizer.getString(2), cursorRemoteActionCompatParcelizer.getInt(3), cursorRemoteActionCompatParcelizer.getString(4))));
                } while (cursorRemoteActionCompatParcelizer.moveToNext());
            }
            return (PearlListItem[]) arrayList.toArray(new PearlListItem[0]);
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }

    private PearlListItem[] write(String str, boolean z, int i) {
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(String.format(Locale.getDefault(), "select  %s, %s from %s where %s = '%s' order by %s ", "_id", "title", "_subject", "parent_id", str, "sort_order"));
        if (cursorRemoteActionCompatParcelizer == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            if (cursorRemoteActionCompatParcelizer.moveToFirst()) {
                do {
                    String string = cursorRemoteActionCompatParcelizer.getString(0);
                    String string2 = cursorRemoteActionCompatParcelizer.getString(1);
                    PearlListModel[] pearlListModelArrWrite = write(string, str, z, i);
                    if (!parseCea608AccessibilityChannel.read(pearlListModelArrWrite)) {
                        arrayList.add(PearlListItem.newHeaderInstance(string, string2, pearlListModelArrWrite.length));
                        for (PearlListModel pearlListModel : pearlListModelArrWrite) {
                            arrayList.add(PearlListItem.newInstance(string, pearlListModel));
                        }
                    }
                } while (cursorRemoteActionCompatParcelizer.moveToNext());
            }
            PearlListModel[] pearlListModelArrWrite2 = write(str, str, z, i);
            if (!parseCea608AccessibilityChannel.read(pearlListModelArrWrite2)) {
                arrayList.add(PearlListItem.newHeaderInstance("", "Others", pearlListModelArrWrite2.length));
                for (PearlListModel pearlListModel2 : pearlListModelArrWrite2) {
                    arrayList.add(PearlListItem.newInstance("", pearlListModel2));
                }
            }
            return (PearlListItem[]) arrayList.toArray(new PearlListItem[0]);
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }

    private PearlListModel[] write(String str, String str2, boolean z, int i) {
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(String.format(Locale.getDefault(), "SELECT %s FROM %s WHERE %s ORDER BY %s", String.format("%s.%s, %s, %s, %s", "_pearl", "_id", PearlMini.KEY_PEARL_DISPLAY_ID, "title", "is_bookmarked"), String.format("%s, %s", "_pearl", "pearl_topic_info"), String.format("%s %s AND %s AND %s", z ? i == 0 ? String.format(Locale.getDefault(), "%s > 0 AND", "is_bookmarked") : String.format(Locale.getDefault(), "%s = %s AND", "is_bookmarked", Integer.valueOf(i)) : "", String.format("%s.%s = %s.%s", "_pearl", "_id", "pearl_topic_info", "pearl_id"), String.format("%s.%s = '%s'", "pearl_topic_info", "topic_id", str), String.format("%s.%s = 'html'", "_pearl", PearlMini.KEY_PEARL_TYPE)), String.format("%s DESC", PearlMini.KEY_PEARL_DISPLAY_ID)));
        if (cursorRemoteActionCompatParcelizer == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            if (cursorRemoteActionCompatParcelizer.moveToFirst()) {
                do {
                    arrayList.add(new PearlListModel(cursorRemoteActionCompatParcelizer.getString(0), cursorRemoteActionCompatParcelizer.getString(1), cursorRemoteActionCompatParcelizer.getString(2), cursorRemoteActionCompatParcelizer.getInt(3), str2));
                } while (cursorRemoteActionCompatParcelizer.moveToNext());
            }
            return (PearlListModel[]) arrayList.toArray(new PearlListModel[0]);
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }

    public final MultiBookmarkCounter[] AudioAttributesImplBaseParcelizer(String str) {
        String str2;
        if (str.equals(Subject.ROOT_PARENT_ID)) {
            str2 = String.format("SELECT %s, COUNT(*) FROM %s WHERE %s > 0 AND pearl_type = 'html' GROUP BY %s", "is_bookmarked", "_pearl", "is_bookmarked", "is_bookmarked");
        } else {
            str2 = String.format("SELECT %s.%s, COUNT(*) FROM %s, %s WHERE %s.%s = %s.%s AND %s > 0 AND pearl_type = 'html' AND %s.%s = '%s' GROUP BY %s", "_pearl", "is_bookmarked", "_pearl", "pearl_subject_info", "_pearl", "_id", "pearl_subject_info", "pearl_id", "is_bookmarked", "pearl_subject_info", "subject_id", str, "is_bookmarked");
        }
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str2);
        if (cursorRemoteActionCompatParcelizer == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (cursorRemoteActionCompatParcelizer.moveToFirst()) {
                do {
                    arrayList.add(new MultiBookmarkCounter(cursorRemoteActionCompatParcelizer.getInt(0), cursorRemoteActionCompatParcelizer.getInt(1)));
                } while (cursorRemoteActionCompatParcelizer.moveToNext());
            }
            return (MultiBookmarkCounter[]) arrayList.toArray(new MultiBookmarkCounter[0]);
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }
}
