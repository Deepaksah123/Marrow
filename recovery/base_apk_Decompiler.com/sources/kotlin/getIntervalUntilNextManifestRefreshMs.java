package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class getIntervalUntilNextManifestRefreshMs<T> extends mpdEventTrack {
    private final Uri IconCompatParcelizer;
    public Context MediaBrowserCompatCustomActionResultReceiver;
    private final String RemoteActionCompatParcelizer;
    private final Uri write;

    /* JADX INFO: loaded from: classes3.dex */
    protected interface AudioAttributesCompatParcelizer<T> {
        T write(String... strArr);
    }

    public abstract String[] IconCompatParcelizer(T t);

    public abstract String MediaBrowserCompatSearchResultReceiver();

    protected abstract T RemoteActionCompatParcelizer(Cursor cursor);

    protected abstract LinkedHashMap<String, String> RemoteActionCompatParcelizer();

    protected abstract T[] RemoteActionCompatParcelizer(int i);

    protected abstract ContentValues write(T t);

    private static String AudioAttributesCompatParcelizer() {
        return "com.marrow.data.provider";
    }

    public getIntervalUntilNextManifestRefreshMs(Context context, String str) {
        this.MediaBrowserCompatCustomActionResultReceiver = context.getApplicationContext();
        this.RemoteActionCompatParcelizer = str;
        StringBuilder sb = new StringBuilder("content://");
        sb.append(AudioAttributesCompatParcelizer());
        sb.append("/");
        sb.append(str);
        sb.append("?notify=false");
        this.IconCompatParcelizer = Uri.parse(sb.toString());
        StringBuilder sb2 = new StringBuilder("content://");
        sb2.append(AudioAttributesCompatParcelizer());
        sb2.append("/");
        sb2.append(str);
        sb2.append("?notify=true");
        this.write = Uri.parse(sb2.toString());
    }

    protected final Context MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    protected final int RemoteActionCompatParcelizer(ContentValues contentValues, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" =? ");
        return write(contentValues, sb.toString(), new String[]{str2});
    }

    public final int write(ContentValues contentValues, String str, String[] strArr) {
        return this.MediaBrowserCompatCustomActionResultReceiver.getContentResolver().update(MediaDescriptionCompat(), contentValues, str, strArr);
    }

    protected final void read(T t, String str, String[] strArr) {
        ContentValues contentValuesWrite = write(t);
        if (write(contentValuesWrite, str, strArr) == 0) {
            read(contentValuesWrite);
        }
    }

    public final accessgetEmptyStatecp<T[]> RemoteActionCompatParcelizer(final String str, final String str2) {
        return accessgetEmptyStatecp.read(new getAttemptedOption() { // from class: o.getAvailableStartTimeInManifestUs
            @Override // kotlin.getAttemptedOption
            public final void write(getCorrectOption getcorrectoption) throws Exception {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer(str, str2, getcorrectoption);
            }
        }, InteractiveVideoElementRSModel.BUFFER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void IconCompatParcelizer(String str, String str2, getCorrectOption getcorrectoption) throws Exception {
        T[] tArrIconCompatParcelizer = IconCompatParcelizer(str, str2);
        if (tArrIconCompatParcelizer != null) {
            getcorrectoption.IconCompatParcelizer(tArrIconCompatParcelizer);
        } else {
            getcorrectoption.RemoteActionCompatParcelizer(new DashMediaSource());
        }
        getcorrectoption.IconCompatParcelizer();
    }

    public String[] read(String str, String str2, String[] strArr, String str3) {
        return read(str, this.MediaBrowserCompatCustomActionResultReceiver.getContentResolver().query(MediaBrowserCompatItemReceiver(), new String[]{str}, str2, strArr, str3));
    }

    public final String[][] write(String[] strArr, String str, String[] strArr2, String str2) {
        Cursor cursorQuery = this.MediaBrowserCompatCustomActionResultReceiver.getContentResolver().query(MediaBrowserCompatItemReceiver(), strArr, str, strArr2, str2);
        if (cursorQuery == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (cursorQuery.moveToFirst()) {
                do {
                    String[] strArr3 = new String[strArr.length];
                    for (int i = 0; i < strArr.length; i++) {
                        strArr3[i] = copyAdaptationSets.MediaBrowserCompatItemReceiver(cursorQuery, strArr[i]);
                    }
                    arrayList.add(strArr3);
                } while (cursorQuery.moveToNext());
            }
            return (String[][]) arrayList.toArray(new String[arrayList.size()][]);
        } finally {
            cursorQuery.close();
        }
    }

    public final accessgetEmptyStatecp<List<String>> write(final String str) {
        final String str2 = null;
        final String[] strArr = null;
        final String str3 = null;
        return accessgetEmptyStatecp.read(new getAttemptedOption(str, str2, strArr, str3) { // from class: o.onUtcTimestampResolutionError
            private /* synthetic */ String read;
            private /* synthetic */ String IconCompatParcelizer = null;
            private /* synthetic */ String[] AudioAttributesCompatParcelizer = null;
            private /* synthetic */ String write = null;

            @Override // kotlin.getAttemptedOption
            public final void write(getCorrectOption getcorrectoption) throws Exception {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(this.read, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, this.write, getcorrectoption);
            }
        }, InteractiveVideoElementRSModel.BUFFER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void IconCompatParcelizer(String str, String str2, String[] strArr, String str3, getCorrectOption getcorrectoption) throws Exception {
        String[] strArr2 = read(str, str2, strArr, str3);
        if (strArr2 != null) {
            getcorrectoption.IconCompatParcelizer(Arrays.asList(strArr2));
        } else {
            getcorrectoption.IconCompatParcelizer(new ArrayList());
        }
        getcorrectoption.IconCompatParcelizer();
    }

    public final accessgetEmptyStatecp<String[][]> read(final String[] strArr, final String str, final String[] strArr2) {
        final String str2 = null;
        return accessgetEmptyStatecp.read(new getAttemptedOption(strArr, str, strArr2, str2) { // from class: o.hasVideoOrAudioAdaptationSets
            private /* synthetic */ String[] AudioAttributesCompatParcelizer;
            private /* synthetic */ String IconCompatParcelizer = null;
            private /* synthetic */ String RemoteActionCompatParcelizer;
            private /* synthetic */ String[] read;

            @Override // kotlin.getAttemptedOption
            public final void write(getCorrectOption getcorrectoption) throws Exception {
                this.write.read(this.read, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, getcorrectoption);
            }
        }, InteractiveVideoElementRSModel.BUFFER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void read(String[] strArr, String str, String[] strArr2, String str2, getCorrectOption getcorrectoption) throws Exception {
        String[][] strArrWrite = write(strArr, str, strArr2, str2);
        if (strArrWrite != null) {
            getcorrectoption.IconCompatParcelizer(strArrWrite);
        } else {
            getcorrectoption.RemoteActionCompatParcelizer(new DashMediaSource());
        }
        getcorrectoption.IconCompatParcelizer();
    }

    public T[] RemoteActionCompatParcelizer(String str, String[] strArr, String str2) {
        String strWrite = parseDolbyChannelConfiguration.write(strArr);
        try {
            return write(this.MediaBrowserCompatCustomActionResultReceiver.getContentResolver().query(MediaBrowserCompatItemReceiver(), null, str, strArr, str2));
        } finally {
            new String[]{AudioAttributesImplApi26Parcelizer(), str, strWrite};
        }
    }

    private T[] write(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        ArrayList<T> arrayList = new ArrayList<>();
        try {
            if (cursor.moveToFirst()) {
                do {
                    arrayList.add(RemoteActionCompatParcelizer(cursor));
                } while (cursor.moveToNext());
            }
            cursor.close();
            return IconCompatParcelizer((ArrayList) arrayList);
        } catch (Throwable th) {
            cursor.close();
            throw th;
        }
    }

    private static String[] read(String str, Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            if (cursor.moveToFirst()) {
                do {
                    arrayList.add(copyAdaptationSets.MediaBrowserCompatItemReceiver(cursor, str));
                } while (cursor.moveToNext());
            }
            cursor.close();
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        } catch (Throwable th) {
            cursor.close();
            throw th;
        }
    }

    public T a_(String... strArr) {
        T[] tArrAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(MediaBrowserCompatSearchResultReceiver(), strArr);
        if (tArrAudioAttributesImplBaseParcelizer == null || tArrAudioAttributesImplBaseParcelizer.length == 0) {
            return null;
        }
        return tArrAudioAttributesImplBaseParcelizer[0];
    }

    public final accessgetEmptyStatecp<T> RemoteActionCompatParcelizer(String... strArr) {
        return write(new AudioAttributesCompatParcelizer() { // from class: o.getAvailableEndTimeInManifestUs
            @Override // o.getIntervalUntilNextManifestRefreshMs.AudioAttributesCompatParcelizer
            public final Object write(String[] strArr2) {
                return this.AudioAttributesCompatParcelizer.a_(strArr2);
            }
        }, strArr);
    }

    public final T AudioAttributesCompatParcelizer(String str, String[] strArr, String str2) {
        T[] tArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str, strArr, str2);
        if (tArrRemoteActionCompatParcelizer == null || tArrRemoteActionCompatParcelizer.length == 0) {
            return null;
        }
        return tArrRemoteActionCompatParcelizer[0];
    }

    public final T write(String str, String str2) {
        T[] tArrIconCompatParcelizer = IconCompatParcelizer(str, str2);
        if (tArrIconCompatParcelizer == null || tArrIconCompatParcelizer.length == 0) {
            return null;
        }
        return tArrIconCompatParcelizer[0];
    }

    protected final T AudioAttributesImplApi26Parcelizer(String str, String[] strArr) {
        T[] tArrAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(str, strArr);
        if (tArrAudioAttributesImplBaseParcelizer == null || tArrAudioAttributesImplBaseParcelizer.length == 0) {
            return null;
        }
        return tArrAudioAttributesImplBaseParcelizer[0];
    }

    public T[] IconCompatParcelizer(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" =? ");
        return AudioAttributesImplBaseParcelizer(sb.toString(), new String[]{str2});
    }

    public T[] AudioAttributesImplBaseParcelizer(String str, String[] strArr) {
        return RemoteActionCompatParcelizer(str, strArr, (String) null);
    }

    public T[] MediaBrowserCompatCustomActionResultReceiver(String str, String[] strArr) {
        return RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(str, strArr), strArr, (String) null);
    }

    public static String RemoteActionCompatParcelizer(String str, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" IN  ( %s ) ");
        String string = sb.toString();
        int length = strArr.length;
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb2.append(",");
            }
            sb2.append("?");
        }
        return String.format(Locale.getDefault(), string, sb2.toString());
    }

    public static String read(String str, List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" IN  ( %s ) ");
        String string = sb.toString();
        int size = list.size();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                sb2.append(",");
            }
            sb2.append("?");
        }
        return String.format(Locale.getDefault(), string, sb2.toString());
    }

    public static String read(String str, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" IN  ( %s ) ");
        String string = sb.toString();
        int length = strArr.length;
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb2.append(",");
            }
            sb2.append("'");
            sb2.append(strArr[i]);
            sb2.append("'");
        }
        return String.format(Locale.getDefault(), string, sb2.toString());
    }

    public static String AudioAttributesCompatParcelizer(String[] strArr) {
        return read("", strArr);
    }

    public static String RemoteActionCompatParcelizer(String str, List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" NOT IN  ( %s ) ");
        String string = sb.toString();
        int size = list.size();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                sb2.append(",");
            }
            sb2.append("'");
            sb2.append(list.get(i));
            sb2.append("'");
        }
        return String.format(Locale.getDefault(), string, sb2.toString());
    }

    public T[] RatingCompat() {
        return RemoteActionCompatParcelizer((String) null, (String[]) null, (String) null);
    }

    public final Cursor RemoteActionCompatParcelizer(String str) {
        return this.MediaBrowserCompatCustomActionResultReceiver.getContentResolver().query(MediaBrowserCompatItemReceiver().buildUpon().appendQueryParameter("customquery", "true").build(), null, str, null, null);
    }

    public final T[] a_(String str) {
        return write(RemoteActionCompatParcelizer(str));
    }

    public final String[] AudioAttributesCompatParcelizer(String str, String str2) {
        return read(str, RemoteActionCompatParcelizer(str2));
    }

    public final int write(String str, String[] strArr) {
        return AudioAttributesCompatParcelizer("COUNT(*)", str, strArr);
    }

    public final int RemoteActionCompatParcelizer(String str, String str2, String[] strArr) {
        return AudioAttributesCompatParcelizer(String.format(Locale.getDefault(), "COUNT(DISTINCT(%s))", str), str2, strArr);
    }

    public final int ag_() {
        return AudioAttributesCompatParcelizer("COUNT(*)", (String) null, (String[]) null);
    }

    public final int IconCompatParcelizer(String str, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" IN  ( %s ) ");
        String string = sb.toString();
        int length = strArr.length;
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb2.append(",");
            }
            sb2.append("?");
        }
        return write(String.format(Locale.getDefault(), string, sb2.toString()), strArr);
    }

    protected final int read(String str) {
        Cursor cursorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
        if (cursorRemoteActionCompatParcelizer == null) {
            return 0;
        }
        try {
            return cursorRemoteActionCompatParcelizer.moveToFirst() ? cursorRemoteActionCompatParcelizer.getInt(0) : 0;
        } finally {
            cursorRemoteActionCompatParcelizer.close();
        }
    }

    protected int AudioAttributesCompatParcelizer(String str, String str2, String[] strArr) {
        Cursor cursorQuery = this.MediaBrowserCompatCustomActionResultReceiver.getContentResolver().query(MediaBrowserCompatItemReceiver(), new String[]{str}, str2, strArr, null);
        if (cursorQuery == null) {
            return 0;
        }
        try {
            return cursorQuery.moveToFirst() ? cursorQuery.getInt(0) : 0;
        } finally {
            cursorQuery.close();
        }
    }

    public final long IconCompatParcelizer(String str, String str2, String[] strArr) {
        Cursor cursorQuery = this.MediaBrowserCompatCustomActionResultReceiver.getContentResolver().query(MediaBrowserCompatItemReceiver(), new String[]{str}, str2, strArr, null);
        if (cursorQuery == null) {
            return 0L;
        }
        try {
            return cursorQuery.moveToFirst() ? cursorQuery.getLong(0) : 0L;
        } finally {
            cursorQuery.close();
        }
    }

    protected String write(String str, String str2, String[] strArr) {
        Cursor cursorQuery = this.MediaBrowserCompatCustomActionResultReceiver.getContentResolver().query(MediaBrowserCompatItemReceiver(), new String[]{str}, str2, strArr, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            return cursorQuery.moveToFirst() ? cursorQuery.getString(0) : null;
        } finally {
            cursorQuery.close();
        }
    }

    public void IconCompatParcelizer(T[] tArr) {
        if (tArr == null || tArr.length == 0) {
            return;
        }
        int length = tArr.length;
        ArrayList arrayList = new ArrayList();
        Uri uriMediaDescriptionCompat = MediaDescriptionCompat();
        String strMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver();
        for (int i = 0; i < length; i++) {
            ContentValues contentValuesWrite = write(tArr[i]);
            String[] strArrIconCompatParcelizer = IconCompatParcelizer(tArr[i]);
            if (write(strMediaBrowserCompatSearchResultReceiver, strArrIconCompatParcelizer) > 0) {
                write(contentValuesWrite, strMediaBrowserCompatSearchResultReceiver, strArrIconCompatParcelizer);
            } else {
                arrayList.add(contentValuesWrite);
            }
        }
        if (arrayList.size() > 0) {
            this.MediaBrowserCompatCustomActionResultReceiver.getContentResolver().bulkInsert(uriMediaDescriptionCompat, (ContentValues[]) arrayList.toArray(new ContentValues[arrayList.size()]));
        }
    }

    public void AudioAttributesCompatParcelizer(T t) {
        if (t == null) {
            return;
        }
        read(t, MediaBrowserCompatSearchResultReceiver(), IconCompatParcelizer(t));
    }

    private void read(ContentValues contentValues) {
        this.MediaBrowserCompatCustomActionResultReceiver.getContentResolver().insert(MediaDescriptionCompat(), contentValues);
    }

    public int read(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" =? ");
        return AudioAttributesCompatParcelizer(sb.toString(), new String[]{str2});
    }

    public int IconCompatParcelizer(String... strArr) {
        return AudioAttributesCompatParcelizer(MediaBrowserCompatSearchResultReceiver(), strArr);
    }

    public final int AudioAttributesCompatParcelizer(String str, String[] strArr) {
        return this.MediaBrowserCompatCustomActionResultReceiver.getContentResolver().delete(MediaDescriptionCompat(), str, strArr);
    }

    public int ah_() {
        return this.MediaBrowserCompatCustomActionResultReceiver.getContentResolver().delete(MediaDescriptionCompat(), null, null);
    }

    protected final int MediaBrowserCompatItemReceiver(String str, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return 0;
        }
        return AudioAttributesCompatParcelizer(read(str, strArr), (String[]) null);
    }

    public final String AudioAttributesImplBaseParcelizer() {
        return IconCompatParcelizer(AudioAttributesImplApi26Parcelizer(), RemoteActionCompatParcelizer());
    }

    public final String AudioAttributesImplApi21Parcelizer() {
        StringBuilder sb = new StringBuilder("DROP TABLE IF EXISTS ");
        sb.append(AudioAttributesImplApi26Parcelizer());
        return sb.toString();
    }

    public final String AudioAttributesImplApi26Parcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    protected final T[] IconCompatParcelizer(ArrayList<T> arrayList) {
        return (T[]) arrayList.toArray(RemoteActionCompatParcelizer(arrayList.size()));
    }

    protected final Uri MediaBrowserCompatItemReceiver() {
        return this.IconCompatParcelizer;
    }

    private Uri MediaDescriptionCompat() {
        return MediaBrowserCompatItemReceiver();
    }

    public static String AudioAttributesCompatParcelizer(String str) {
        return String.format(Locale.getDefault(), "'%s'", str);
    }

    private static <T> accessgetEmptyStatecp<T> write(final AudioAttributesCompatParcelizer<T> audioAttributesCompatParcelizer, final String... strArr) {
        return accessgetEmptyStatecp.read(new getAttemptedOption() { // from class: o.getManifestLoadRetryDelayMillis
            @Override // kotlin.getAttemptedOption
            public final void write(getCorrectOption getcorrectoption) throws Exception {
                getIntervalUntilNextManifestRefreshMs.write(audioAttributesCompatParcelizer, strArr, getcorrectoption);
            }
        }, InteractiveVideoElementRSModel.BUFFER);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void write(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, String[] strArr, getCorrectOption getcorrectoption) throws Exception {
        Object objWrite = audioAttributesCompatParcelizer.write(strArr);
        if (objWrite != null) {
            getcorrectoption.IconCompatParcelizer(objWrite);
        } else {
            getcorrectoption.RemoteActionCompatParcelizer(new DashMediaSource());
        }
        getcorrectoption.IconCompatParcelizer();
    }

    private String write() {
        LinkedHashMap<String, String> linkedHashMapRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        for (String str : linkedHashMapRemoteActionCompatParcelizer.keySet()) {
            String str2 = linkedHashMapRemoteActionCompatParcelizer.get(str);
            if (str2 != null && str2.contains("PRIMARY KEY")) {
                return str;
            }
        }
        return null;
    }

    public final boolean MediaBrowserCompatMediaItem() {
        String strWrite = write();
        if (parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) strWrite)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strWrite);
        sb.append(" is null");
        return write(sb.toString(), (String[]) null) > 0;
    }
}
