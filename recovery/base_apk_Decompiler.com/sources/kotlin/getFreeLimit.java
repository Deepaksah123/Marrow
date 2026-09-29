package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class getFreeLimit {
    private static final String AudioAttributesCompatParcelizer;
    private static final Map<Context, getFreeLimit> AudioAttributesImplApi21Parcelizer = new HashMap();
    private static final String AudioAttributesImplBaseParcelizer;
    private static final String IconCompatParcelizer;
    private static final String MediaBrowserCompatCustomActionResultReceiver;
    private static final String MediaBrowserCompatItemReceiver;
    private static final String RemoteActionCompatParcelizer;
    private static final String read;
    private static final String write;
    private final IconCompatParcelizer AudioAttributesImplApi26Parcelizer;

    static {
        StringBuilder sb = new StringBuilder("CREATE TABLE ");
        sb.append(AudioAttributesCompatParcelizer.EVENTS.RemoteActionCompatParcelizer());
        sb.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL, automatic_data INTEGER DEFAULT 0, token STRING NOT NULL DEFAULT '')");
        write = sb.toString();
        StringBuilder sb2 = new StringBuilder("CREATE TABLE ");
        sb2.append(AudioAttributesCompatParcelizer.PEOPLE.RemoteActionCompatParcelizer());
        sb2.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL, automatic_data INTEGER DEFAULT 0, token STRING NOT NULL DEFAULT '')");
        IconCompatParcelizer = sb2.toString();
        StringBuilder sb3 = new StringBuilder("CREATE TABLE ");
        sb3.append(AudioAttributesCompatParcelizer.GROUPS.RemoteActionCompatParcelizer());
        sb3.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL, automatic_data INTEGER DEFAULT 0, token STRING NOT NULL DEFAULT '')");
        RemoteActionCompatParcelizer = sb3.toString();
        StringBuilder sb4 = new StringBuilder("CREATE TABLE ");
        sb4.append(AudioAttributesCompatParcelizer.ANONYMOUS_PEOPLE.RemoteActionCompatParcelizer());
        sb4.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL, automatic_data INTEGER DEFAULT 0, token STRING NOT NULL DEFAULT '')");
        AudioAttributesCompatParcelizer = sb4.toString();
        StringBuilder sb5 = new StringBuilder("CREATE INDEX IF NOT EXISTS time_idx ON ");
        sb5.append(AudioAttributesCompatParcelizer.EVENTS.RemoteActionCompatParcelizer());
        sb5.append(" (created_at);");
        AudioAttributesImplBaseParcelizer = sb5.toString();
        StringBuilder sb6 = new StringBuilder("CREATE INDEX IF NOT EXISTS time_idx ON ");
        sb6.append(AudioAttributesCompatParcelizer.PEOPLE.RemoteActionCompatParcelizer());
        sb6.append(" (created_at);");
        MediaBrowserCompatCustomActionResultReceiver = sb6.toString();
        StringBuilder sb7 = new StringBuilder("CREATE INDEX IF NOT EXISTS time_idx ON ");
        sb7.append(AudioAttributesCompatParcelizer.GROUPS.RemoteActionCompatParcelizer());
        sb7.append(" (created_at);");
        MediaBrowserCompatItemReceiver = sb7.toString();
        StringBuilder sb8 = new StringBuilder("CREATE INDEX IF NOT EXISTS time_idx ON ");
        sb8.append(AudioAttributesCompatParcelizer.ANONYMOUS_PEOPLE.RemoteActionCompatParcelizer());
        sb8.append(" (created_at);");
        read = sb8.toString();
    }

    public enum AudioAttributesCompatParcelizer {
        EVENTS("events"),
        PEOPLE("people"),
        ANONYMOUS_PEOPLE("anonymous_people"),
        GROUPS("groups");

        private final String MediaBrowserCompatItemReceiver;

        AudioAttributesCompatParcelizer(String str) {
            this.MediaBrowserCompatItemReceiver = str;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.MediaBrowserCompatItemReceiver;
        }
    }

    static class IconCompatParcelizer extends SQLiteOpenHelper {
        private final Context AudioAttributesCompatParcelizer;
        private final File IconCompatParcelizer;
        private final PlanResponsePromo RemoteActionCompatParcelizer;

        IconCompatParcelizer(Context context, String str, PlanResponsePromo planResponsePromo) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 7);
            this.IconCompatParcelizer = context.getDatabasePath(str);
            this.RemoteActionCompatParcelizer = planResponsePromo;
            this.AudioAttributesCompatParcelizer = context;
        }

        public final void AudioAttributesCompatParcelizer() {
            close();
            this.IconCompatParcelizer.delete();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(getFreeLimit.write);
            sQLiteDatabase.execSQL(getFreeLimit.IconCompatParcelizer);
            sQLiteDatabase.execSQL(getFreeLimit.RemoteActionCompatParcelizer);
            sQLiteDatabase.execSQL(getFreeLimit.AudioAttributesCompatParcelizer);
            sQLiteDatabase.execSQL(getFreeLimit.AudioAttributesImplBaseParcelizer);
            sQLiteDatabase.execSQL(getFreeLimit.MediaBrowserCompatCustomActionResultReceiver);
            sQLiteDatabase.execSQL(getFreeLimit.MediaBrowserCompatItemReceiver);
            sQLiteDatabase.execSQL(getFreeLimit.read);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i >= 4 && i2 <= 7) {
                if (i == 4) {
                    AudioAttributesCompatParcelizer(sQLiteDatabase);
                    RemoteActionCompatParcelizer(sQLiteDatabase);
                    read(sQLiteDatabase);
                }
                if (i == 5) {
                    RemoteActionCompatParcelizer(sQLiteDatabase);
                    read(sQLiteDatabase);
                }
                if (i == 6) {
                    read(sQLiteDatabase);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder("DROP TABLE IF EXISTS ");
            sb.append(AudioAttributesCompatParcelizer.EVENTS.RemoteActionCompatParcelizer());
            sQLiteDatabase.execSQL(sb.toString());
            StringBuilder sb2 = new StringBuilder("DROP TABLE IF EXISTS ");
            sb2.append(AudioAttributesCompatParcelizer.PEOPLE.RemoteActionCompatParcelizer());
            sQLiteDatabase.execSQL(sb2.toString());
            StringBuilder sb3 = new StringBuilder("DROP TABLE IF EXISTS ");
            sb3.append(AudioAttributesCompatParcelizer.GROUPS.RemoteActionCompatParcelizer());
            sQLiteDatabase.execSQL(sb3.toString());
            StringBuilder sb4 = new StringBuilder("DROP TABLE IF EXISTS ");
            sb4.append(AudioAttributesCompatParcelizer.ANONYMOUS_PEOPLE.RemoteActionCompatParcelizer());
            sQLiteDatabase.execSQL(sb4.toString());
            sQLiteDatabase.execSQL(getFreeLimit.write);
            sQLiteDatabase.execSQL(getFreeLimit.IconCompatParcelizer);
            sQLiteDatabase.execSQL(getFreeLimit.RemoteActionCompatParcelizer);
            sQLiteDatabase.execSQL(getFreeLimit.AudioAttributesCompatParcelizer);
            sQLiteDatabase.execSQL(getFreeLimit.AudioAttributesImplBaseParcelizer);
            sQLiteDatabase.execSQL(getFreeLimit.MediaBrowserCompatCustomActionResultReceiver);
            sQLiteDatabase.execSQL(getFreeLimit.MediaBrowserCompatItemReceiver);
            sQLiteDatabase.execSQL(getFreeLimit.read);
        }

        public final boolean RemoteActionCompatParcelizer() {
            if (this.IconCompatParcelizer.exists()) {
                return this.IconCompatParcelizer.length() > Math.max(this.IconCompatParcelizer.getUsableSpace(), (long) this.RemoteActionCompatParcelizer.MediaMetadataCompat()) || this.IconCompatParcelizer.length() > ((long) this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver());
            }
            return false;
        }

        private static void AudioAttributesCompatParcelizer(SQLiteDatabase sQLiteDatabase) {
            int i;
            String string;
            StringBuilder sb = new StringBuilder("ALTER TABLE ");
            sb.append(AudioAttributesCompatParcelizer.EVENTS.RemoteActionCompatParcelizer());
            sb.append(" ADD COLUMN automatic_data INTEGER DEFAULT 0");
            sQLiteDatabase.execSQL(sb.toString());
            StringBuilder sb2 = new StringBuilder("ALTER TABLE ");
            sb2.append(AudioAttributesCompatParcelizer.PEOPLE.RemoteActionCompatParcelizer());
            sb2.append(" ADD COLUMN automatic_data INTEGER DEFAULT 0");
            sQLiteDatabase.execSQL(sb2.toString());
            StringBuilder sb3 = new StringBuilder("ALTER TABLE ");
            sb3.append(AudioAttributesCompatParcelizer.EVENTS.RemoteActionCompatParcelizer());
            sb3.append(" ADD COLUMN token STRING NOT NULL DEFAULT ''");
            sQLiteDatabase.execSQL(sb3.toString());
            StringBuilder sb4 = new StringBuilder("ALTER TABLE ");
            sb4.append(AudioAttributesCompatParcelizer.PEOPLE.RemoteActionCompatParcelizer());
            sb4.append(" ADD COLUMN token STRING NOT NULL DEFAULT ''");
            sQLiteDatabase.execSQL(sb4.toString());
            StringBuilder sb5 = new StringBuilder("SELECT * FROM ");
            sb5.append(AudioAttributesCompatParcelizer.EVENTS.RemoteActionCompatParcelizer());
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery(sb5.toString(), null);
            while (true) {
                if (!cursorRawQuery.moveToNext()) {
                    break;
                }
                try {
                    String string2 = new JSONObject(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("data") >= 0 ? cursorRawQuery.getColumnIndex("data") : 1)).getJSONObject("properties").getString(LoggedUserResponse.KEY_TOKEN);
                    int i2 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("_id") >= 0 ? cursorRawQuery.getColumnIndex("_id") : 0);
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("UPDATE ");
                    sb6.append(AudioAttributesCompatParcelizer.EVENTS.RemoteActionCompatParcelizer());
                    sb6.append(" SET token = '");
                    sb6.append(string2);
                    sb6.append("' WHERE _id = ");
                    sb6.append(i2);
                    sQLiteDatabase.execSQL(sb6.toString());
                } catch (JSONException unused) {
                    sQLiteDatabase.delete(AudioAttributesCompatParcelizer.EVENTS.RemoteActionCompatParcelizer(), "_id = ".concat(String.valueOf(0)), null);
                }
            }
            StringBuilder sb7 = new StringBuilder("SELECT * FROM ");
            sb7.append(AudioAttributesCompatParcelizer.PEOPLE.RemoteActionCompatParcelizer());
            Cursor cursorRawQuery2 = sQLiteDatabase.rawQuery(sb7.toString(), null);
            while (cursorRawQuery2.moveToNext()) {
                try {
                    string = new JSONObject(cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex("data") >= 0 ? cursorRawQuery2.getColumnIndex("data") : 1)).getString("$token");
                    i = cursorRawQuery2.getInt(cursorRawQuery2.getColumnIndex("_id") >= 0 ? cursorRawQuery2.getColumnIndex("_id") : 0);
                } catch (JSONException unused2) {
                    i = 0;
                }
                try {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("UPDATE ");
                    sb8.append(AudioAttributesCompatParcelizer.PEOPLE.RemoteActionCompatParcelizer());
                    sb8.append(" SET token = '");
                    sb8.append(string);
                    sb8.append("' WHERE _id = ");
                    sb8.append(i);
                    sQLiteDatabase.execSQL(sb8.toString());
                } catch (JSONException unused3) {
                    sQLiteDatabase.delete(AudioAttributesCompatParcelizer.PEOPLE.RemoteActionCompatParcelizer(), "_id = ".concat(String.valueOf(i)), null);
                }
            }
        }

        private static void RemoteActionCompatParcelizer(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(getFreeLimit.RemoteActionCompatParcelizer);
            sQLiteDatabase.execSQL(getFreeLimit.MediaBrowserCompatItemReceiver);
        }

        private void read(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(getFreeLimit.AudioAttributesCompatParcelizer);
            sQLiteDatabase.execSQL(getFreeLimit.read);
            File file = new File(this.AudioAttributesCompatParcelizer.getApplicationInfo().dataDir, "shared_prefs");
            if (file.exists() && file.isDirectory()) {
                for (String str : file.list(new FilenameFilter() { // from class: o.getFreeLimit.IconCompatParcelizer.4
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file2, String str2) {
                        return str2.startsWith("com.mixpanel.android.mpmetrics.MixpanelAPI_");
                    }
                })) {
                    SharedPreferences sharedPreferences = this.AudioAttributesCompatParcelizer.getSharedPreferences(str.split("\\.xml")[0], 0);
                    String string = sharedPreferences.getString("waiting_array", null);
                    if (string != null) {
                        try {
                            JSONArray jSONArray = new JSONArray(string);
                            sQLiteDatabase.beginTransaction();
                            for (int i = 0; i < jSONArray.length(); i++) {
                                try {
                                    try {
                                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                                        String string2 = jSONObject.getString("$token");
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("data", jSONObject.toString());
                                        contentValues.put("created_at", Long.valueOf(System.currentTimeMillis()));
                                        contentValues.put("automatic_data", Boolean.FALSE);
                                        contentValues.put(LoggedUserResponse.KEY_TOKEN, string2);
                                        sQLiteDatabase.insert(AudioAttributesCompatParcelizer.ANONYMOUS_PEOPLE.RemoteActionCompatParcelizer(), null, contentValues);
                                    } catch (JSONException unused) {
                                    }
                                } catch (Throwable th) {
                                    sQLiteDatabase.endTransaction();
                                    throw th;
                                }
                            }
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                        } catch (JSONException unused2) {
                        }
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.remove("waiting_array");
                        editorEdit.apply();
                    }
                }
            }
        }
    }

    private getFreeLimit(Context context, PlanResponsePromo planResponsePromo) {
        this(context, "mixpanel", planResponsePromo);
    }

    private getFreeLimit(Context context, String str, PlanResponsePromo planResponsePromo) {
        this.AudioAttributesImplApi26Parcelizer = new IconCompatParcelizer(context, str, planResponsePromo);
    }

    public static getFreeLimit IconCompatParcelizer(Context context, PlanResponsePromo planResponsePromo) {
        getFreeLimit getfreelimit;
        Map<Context, getFreeLimit> map = AudioAttributesImplApi21Parcelizer;
        synchronized (map) {
            Context applicationContext = context.getApplicationContext();
            if (!map.containsKey(applicationContext)) {
                getfreelimit = new getFreeLimit(applicationContext, planResponsePromo);
                map.put(applicationContext, getfreelimit);
            } else {
                getfreelimit = map.get(applicationContext);
            }
        }
        return getfreelimit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080 A[PHI: r0
      0x0080: PHI (r0v3 android.database.Cursor) = (r0v2 android.database.Cursor), (r0v5 android.database.Cursor) binds: [B:16:0x006c, B:26:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int IconCompatParcelizer(org.json.JSONObject r6, java.lang.String r7, o.getFreeLimit.AudioAttributesCompatParcelizer r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r5.MediaBrowserCompatMediaItem()
            if (r0 == 0) goto L8
            r5 = -2
            return r5
        L8:
            java.lang.String r8 = r8.RemoteActionCompatParcelizer()
            r0 = 0
            o.getFreeLimit$IconCompatParcelizer r1 = r5.AudioAttributesImplApi26Parcelizer     // Catch: java.lang.Throwable -> L6a java.lang.OutOfMemoryError -> L6c android.database.sqlite.SQLiteException -> L6f
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch: java.lang.Throwable -> L6a java.lang.OutOfMemoryError -> L6c android.database.sqlite.SQLiteException -> L6f
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L6a java.lang.OutOfMemoryError -> L6c android.database.sqlite.SQLiteException -> L6f
            r2.<init>()     // Catch: java.lang.Throwable -> L6a java.lang.OutOfMemoryError -> L6c android.database.sqlite.SQLiteException -> L6f
            java.lang.String r3 = "data"
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L6a java.lang.OutOfMemoryError -> L6c android.database.sqlite.SQLiteException -> L6f
            r2.put(r3, r6)     // Catch: java.lang.Throwable -> L6a java.lang.OutOfMemoryError -> L6c android.database.sqlite.SQLiteException -> L6f
            java.lang.String r6 = "created_at"
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6a java.lang.OutOfMemoryError -> L6c android.database.sqlite.SQLiteException -> L6f
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L6a java.lang.OutOfMemoryError -> L6c android.database.sqlite.SQLiteException -> L6f
            r2.put(r6, r3)     // Catch: java.lang.Throwable -> L6a java.lang.OutOfMemoryError -> L6c android.database.sqlite.SQLiteException -> L6f
            java.lang.String r6 = "token"
            r2.put(r6, r7)     // Catch: java.lang.Throwable -> L6a java.lang.OutOfMemoryError -> L6c android.database.sqlite.SQLiteException -> L6f
            r1.insert(r8, r0, r2)     // Catch: java.lang.Throwable -> L6a java.lang.OutOfMemoryError -> L6c android.database.sqlite.SQLiteException -> L6f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a java.lang.OutOfMemoryError -> L6c android.database.sqlite.SQLiteException -> L6f
            java.lang.String r2 = "SELECT COUNT(*) FROM "
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L6a java.lang.OutOfMemoryError -> L6c android.database.sqlite.SQLiteException -> L6f
            r6.append(r8)     // Catch: java.lang.Throwable -> L6a java.lang.OutOfMemoryError -> L6c android.database.sqlite.SQLiteException -> L6f
            java.lang.String r8 = " WHERE token='"
            r6.append(r8)     // Catch: java.lang.Throwable -> L6a java.lang.OutOfMemoryError -> L6c android.database.sqlite.SQLiteException -> L6f
            r6.append(r7)     // Catch: java.lang.Throwable -> L6a java.lang.OutOfMemoryError -> L6c android.database.sqlite.SQLiteException -> L6f
            java.lang.String r7 = "'"
            r6.append(r7)     // Catch: java.lang.Throwable -> L6a java.lang.OutOfMemoryError -> L6c android.database.sqlite.SQLiteException -> L6f
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L6a java.lang.OutOfMemoryError -> L6c android.database.sqlite.SQLiteException -> L6f
            android.database.Cursor r6 = r1.rawQuery(r6, r0)     // Catch: java.lang.Throwable -> L6a java.lang.OutOfMemoryError -> L6c android.database.sqlite.SQLiteException -> L6f
            r6.moveToFirst()     // Catch: java.lang.OutOfMemoryError -> L68 android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L76
            r7 = 0
            int r7 = r6.getInt(r7)     // Catch: java.lang.OutOfMemoryError -> L68 android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L76
            if (r6 == 0) goto L62
            r6.close()
        L62:
            o.getFreeLimit$IconCompatParcelizer r5 = r5.AudioAttributesImplApi26Parcelizer
            r5.close()
            return r7
        L68:
            r0 = r6
            goto L6c
        L6a:
            r6 = move-exception
            goto L8a
        L6c:
            if (r0 == 0) goto L83
            goto L80
        L6f:
            r6 = r0
        L70:
            if (r6 == 0) goto L78
            r6.close()     // Catch: java.lang.Throwable -> L76
            goto L79
        L76:
            r7 = move-exception
            goto L8c
        L78:
            r0 = r6
        L79:
            o.getFreeLimit$IconCompatParcelizer r6 = r5.AudioAttributesImplApi26Parcelizer     // Catch: java.lang.Throwable -> L6a
            r6.AudioAttributesCompatParcelizer()     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L83
        L80:
            r0.close()
        L83:
            o.getFreeLimit$IconCompatParcelizer r5 = r5.AudioAttributesImplApi26Parcelizer
            r5.close()
            r5 = -1
            return r5
        L8a:
            r7 = r6
            r6 = r0
        L8c:
            if (r6 == 0) goto L91
            r6.close()
        L91:
            o.getFreeLimit$IconCompatParcelizer r5 = r5.AudioAttributesImplApi26Parcelizer
            r5.close()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getFreeLimit.IconCompatParcelizer(org.json.JSONObject, java.lang.String, o.getFreeLimit$AudioAttributesCompatParcelizer):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [o.getFreeLimit] */
    /* JADX WARN: Type inference failed for: r12v1, types: [o.getFreeLimit] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [android.database.sqlite.SQLiteOpenHelper, o.getFreeLimit$IconCompatParcelizer] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    final int AudioAttributesCompatParcelizer(String str, String str2) throws Throwable {
        Throwable th;
        Cursor cursorRawQuery;
        if (MediaBrowserCompatMediaItem()) {
            return -2;
        }
        int i = -1;
        ?? r6 = 0;
        r6 = 0;
        r6 = 0;
        Cursor cursor = null;
        try {
            try {
                try {
                    SQLiteDatabase writableDatabase = this.AudioAttributesImplApi26Parcelizer.getWritableDatabase();
                    StringBuilder sb = new StringBuilder("SELECT * FROM ");
                    sb.append(AudioAttributesCompatParcelizer.ANONYMOUS_PEOPLE.RemoteActionCompatParcelizer());
                    sb.append(" WHERE token = '");
                    sb.append(str);
                    sb.append("'");
                    cursorRawQuery = writableDatabase.rawQuery(new StringBuffer(sb.toString()).toString(), null);
                    try {
                        writableDatabase.beginTransaction();
                        while (cursorRawQuery.moveToNext()) {
                            try {
                                try {
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("created_at", Long.valueOf(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("created_at") >= 0 ? cursorRawQuery.getColumnIndex("created_at") : 2)));
                                    contentValues.put("automatic_data", Integer.valueOf(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("automatic_data") >= 0 ? cursorRawQuery.getColumnIndex("automatic_data") : 3)));
                                    contentValues.put(LoggedUserResponse.KEY_TOKEN, cursorRawQuery.getString(cursorRawQuery.getColumnIndex(LoggedUserResponse.KEY_TOKEN) >= 0 ? cursorRawQuery.getColumnIndex(LoggedUserResponse.KEY_TOKEN) : 4));
                                    JSONObject jSONObject = new JSONObject(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("data") >= 0 ? cursorRawQuery.getColumnIndex("data") : 1));
                                    jSONObject.put("$distinct_id", str2);
                                    contentValues.put("data", jSONObject.toString());
                                    writableDatabase.insert(AudioAttributesCompatParcelizer.PEOPLE.RemoteActionCompatParcelizer(), null, contentValues);
                                    int i2 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("_id") >= 0 ? cursorRawQuery.getColumnIndex("_id") : 0);
                                    String strRemoteActionCompatParcelizer = AudioAttributesCompatParcelizer.ANONYMOUS_PEOPLE.RemoteActionCompatParcelizer();
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("_id = ");
                                    sb2.append(i2);
                                    writableDatabase.delete(strRemoteActionCompatParcelizer, sb2.toString(), null);
                                    i++;
                                } catch (JSONException unused) {
                                }
                            } finally {
                                writableDatabase.endTransaction();
                            }
                        }
                        writableDatabase.setTransactionSuccessful();
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                    } catch (SQLiteException unused2) {
                        AudioAttributesCompatParcelizer.ANONYMOUS_PEOPLE.RemoteActionCompatParcelizer();
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        } else {
                            cursor = cursorRawQuery;
                        }
                        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
                        r6 = cursor;
                        if (cursor != null) {
                            cursor.close();
                            r6 = cursor;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (r6 != 0) {
                        r6.close();
                    }
                    this.AudioAttributesImplApi26Parcelizer.close();
                    throw th;
                }
            } catch (SQLiteException unused3) {
                cursorRawQuery = null;
            }
            this = this.AudioAttributesImplApi26Parcelizer;
            this.close();
            return i;
        } catch (Throwable th3) {
            r6 = str;
            th = th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ff  */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v3, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int write(java.util.Map<java.lang.String, java.lang.String> r14, java.lang.String r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getFreeLimit.write(java.util.Map, java.lang.String):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.database.sqlite.SQLiteOpenHelper, o.getFreeLimit$IconCompatParcelizer] */
    public final void AudioAttributesCompatParcelizer(String str, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, String str2) {
        String strRemoteActionCompatParcelizer = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        try {
            try {
                SQLiteDatabase writableDatabase = this.AudioAttributesImplApi26Parcelizer.getWritableDatabase();
                StringBuilder sb = new StringBuilder("_id <= ");
                sb.append(str);
                sb.append(" AND token = '");
                sb.append(str2);
                sb.append("'");
                writableDatabase.delete(strRemoteActionCompatParcelizer, new StringBuffer(sb.toString()).toString(), null);
            } catch (SQLiteException unused) {
                this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
            } catch (Exception unused2) {
                this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
            }
        } finally {
            this.AudioAttributesImplApi26Parcelizer.close();
        }
    }

    public final void IconCompatParcelizer(long j, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        String strRemoteActionCompatParcelizer = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        try {
            try {
                SQLiteDatabase writableDatabase = this.AudioAttributesImplApi26Parcelizer.getWritableDatabase();
                StringBuilder sb = new StringBuilder("created_at <= ");
                sb.append(j);
                writableDatabase.delete(strRemoteActionCompatParcelizer, sb.toString(), null);
            } catch (SQLiteException unused) {
                this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
            }
        } finally {
            this.AudioAttributesImplApi26Parcelizer.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.database.sqlite.SQLiteOpenHelper, o.getFreeLimit$IconCompatParcelizer] */
    public final void RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, String str) {
        String strRemoteActionCompatParcelizer = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        try {
            try {
                SQLiteDatabase writableDatabase = this.AudioAttributesImplApi26Parcelizer.getWritableDatabase();
                StringBuilder sb = new StringBuilder("token = '");
                sb.append(str);
                sb.append("'");
                writableDatabase.delete(strRemoteActionCompatParcelizer, sb.toString(), null);
            } catch (SQLiteException unused) {
                this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
            }
        } finally {
            this.AudioAttributesImplApi26Parcelizer.close();
        }
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String[] AudioAttributesCompatParcelizer(o.getFreeLimit.AudioAttributesCompatParcelizer r11, java.lang.String r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getFreeLimit.AudioAttributesCompatParcelizer(o.getFreeLimit$AudioAttributesCompatParcelizer, java.lang.String):java.lang.String[]");
    }

    public final File MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer;
    }

    private boolean MediaBrowserCompatMediaItem() {
        return this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
    }
}
