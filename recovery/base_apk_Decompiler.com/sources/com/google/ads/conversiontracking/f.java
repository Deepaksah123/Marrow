package com.google.ads.conversiontracking;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class f {
    private static final String a = String.format(Locale.US, "CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s TEXT NOT NULL, %s TEXT, %s INTEGER, %s INTEGER, %s TEXT, %s INTEGER, %s INTEGER,%s INTEGER);", "conversiontracking", "conversion_ping_id", "string_url", "preference_key", "is_repeatable", "parameter_is_null", "preference_name", "record_time", "retry_count", "last_retry_time");
    private final a b;
    private final Object c = new Object();

    public f(Context context) {
        this.b = new a(context, "google_conversion_tracking.db");
    }

    public void a(d dVar) {
        if (dVar == null) {
            return;
        }
        synchronized (this.c) {
            SQLiteDatabase sQLiteDatabaseA = a();
            if (sQLiteDatabaseA == null) {
                return;
            }
            sQLiteDatabaseA.delete("conversiontracking", String.format(Locale.US, "%s = %d", "conversion_ping_id", Long.valueOf(dVar.h)), null);
        }
    }

    public SQLiteDatabase a() {
        try {
            return this.b.getWritableDatabase();
        } catch (SQLiteException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049 A[Catch: all -> 0x0054, PHI: r2
      0x0049: PHI (r2v5 android.database.Cursor) = (r2v3 android.database.Cursor), (r2v6 android.database.Cursor) binds: [B:24:0x0046, B:18:0x003d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:9:0x0010, B:26:0x0049, B:30:0x0050, B:31:0x0053, B:14:0x0019, B:16:0x0030, B:23:0x0043), top: B:36:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<com.google.ads.conversiontracking.d> a(long r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.c
            monitor-enter(r0)
            java.util.LinkedList r1 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L54
            r1.<init>()     // Catch: java.lang.Throwable -> L54
            r2 = 0
            int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r2 > 0) goto L10
            monitor-exit(r0)
            return r1
        L10:
            android.database.sqlite.SQLiteDatabase r3 = r12.a()     // Catch: java.lang.Throwable -> L54
            if (r3 != 0) goto L18
            monitor-exit(r0)
            return r1
        L18:
            r2 = 0
            java.lang.String r4 = "conversiontracking"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r10 = "last_retry_time ASC"
            java.lang.String r11 = java.lang.String.valueOf(r13)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            boolean r13 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            if (r13 == 0) goto L3d
        L30:
            com.google.ads.conversiontracking.d r13 = r12.a(r2)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            r1.add(r13)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            boolean r13 = r2.moveToNext()     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            if (r13 != 0) goto L30
        L3d:
            if (r2 == 0) goto L4c
            goto L49
        L40:
            r12 = move-exception
            goto L4e
        L42:
            r12 = move-exception
            r12.getMessage()     // Catch: java.lang.Throwable -> L40
            if (r2 != 0) goto L49
            goto L4c
        L49:
            r2.close()     // Catch: java.lang.Throwable -> L54
        L4c:
            monitor-exit(r0)
            return r1
        L4e:
            if (r2 == 0) goto L53
            r2.close()     // Catch: java.lang.Throwable -> L54
        L53:
            throw r12     // Catch: java.lang.Throwable -> L54
        L54:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.conversiontracking.f.a(long):java.util.List");
    }

    public void b(d dVar) {
        if (dVar == null) {
            return;
        }
        synchronized (this.c) {
            SQLiteDatabase sQLiteDatabaseA = a();
            if (sQLiteDatabaseA == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("string_url", dVar.g);
            contentValues.put("preference_key", dVar.f);
            contentValues.put("is_repeatable", Integer.valueOf(dVar.b ? 1 : 0));
            contentValues.put("parameter_is_null", Integer.valueOf(dVar.a ? 1 : 0));
            contentValues.put("preference_name", dVar.e);
            contentValues.put("record_time", Long.valueOf(dVar.d));
            contentValues.put("retry_count", (Integer) 0);
            contentValues.put("last_retry_time", Long.valueOf(dVar.d));
            dVar.h = sQLiteDatabaseA.insert("conversiontracking", null, contentValues);
            b();
            if (c() > 20000) {
                d();
            }
        }
    }

    public void b() {
        synchronized (this.c) {
            SQLiteDatabase sQLiteDatabaseA = a();
            if (sQLiteDatabaseA == null) {
                return;
            }
            sQLiteDatabaseA.delete("conversiontracking", String.format(Locale.US, "(%s > %d) or (%s < %d and %s > 0)", "retry_count", 9000L, "record_time", Long.valueOf(g.a() - 43200000), "retry_count"), null);
        }
    }

    public void c(d dVar) {
        if (dVar == null) {
            return;
        }
        synchronized (this.c) {
            SQLiteDatabase sQLiteDatabaseA = a();
            if (sQLiteDatabaseA == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("last_retry_time", Long.valueOf(g.a()));
            contentValues.put("retry_count", Integer.valueOf(dVar.c + 1));
            sQLiteDatabaseA.update("conversiontracking", contentValues, String.format(Locale.US, "%s = %d", "conversion_ping_id", Long.valueOf(dVar.h)), null);
            b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0030 A[Catch: all -> 0x003b, PHI: r2
      0x0030: PHI (r2v3 android.database.Cursor) = (r2v2 android.database.Cursor), (r2v4 android.database.Cursor) binds: [B:23:0x002d, B:17:0x0024] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:14:0x001f, B:25:0x0030, B:29:0x0037, B:30:0x003a, B:10:0x000d, B:12:0x0019, B:22:0x002a), top: B:37:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int c() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.c
            monitor-enter(r0)
            android.database.sqlite.SQLiteDatabase r4 = r4.a()     // Catch: java.lang.Throwable -> L3b
            r1 = 0
            if (r4 != 0) goto Lc
            monitor-exit(r0)
            return r1
        Lc:
            r2 = 0
            java.lang.String r3 = "select count(*) from conversiontracking"
            android.database.Cursor r2 = r4.rawQuery(r3, r2)     // Catch: java.lang.Throwable -> L27 android.database.sqlite.SQLiteException -> L29
            boolean r4 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L27 android.database.sqlite.SQLiteException -> L29
            if (r4 == 0) goto L24
            int r4 = r2.getInt(r1)     // Catch: java.lang.Throwable -> L27 android.database.sqlite.SQLiteException -> L29
            if (r2 == 0) goto L22
            r2.close()     // Catch: java.lang.Throwable -> L3b
        L22:
            monitor-exit(r0)
            return r4
        L24:
            if (r2 == 0) goto L33
            goto L30
        L27:
            r4 = move-exception
            goto L35
        L29:
            r4 = move-exception
            r4.getMessage()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L30
            goto L33
        L30:
            r2.close()     // Catch: java.lang.Throwable -> L3b
        L33:
            monitor-exit(r0)
            return r1
        L35:
            if (r2 == 0) goto L3a
            r2.close()     // Catch: java.lang.Throwable -> L3b
        L3a:
            throw r4     // Catch: java.lang.Throwable -> L3b
        L3b:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.conversiontracking.f.c():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0036 A[Catch: all -> 0x0041, PHI: r10
      0x0036: PHI (r10v3 android.database.Cursor) = (r10v2 android.database.Cursor), (r10v4 android.database.Cursor) binds: [B:20:0x0033, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:22:0x0036, B:26:0x003d, B:27:0x0040, B:9:0x000c, B:11:0x001d, B:13:0x0023, B:19:0x0030), top: B:31:0x0003, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            r11 = this;
            java.lang.Object r0 = r11.c
            monitor-enter(r0)
            android.database.sqlite.SQLiteDatabase r1 = r11.a()     // Catch: java.lang.Throwable -> L41
            if (r1 != 0) goto Lb
            monitor-exit(r0)
            return
        Lb:
            r10 = 0
            java.lang.String r2 = "conversiontracking"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r8 = "record_time ASC"
            java.lang.String r9 = "1"
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L2f
            if (r10 == 0) goto L2a
            boolean r1 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L2f
            if (r1 == 0) goto L2a
            com.google.ads.conversiontracking.d r1 = r11.a(r10)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L2f
            r11.a(r1)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L2f
        L2a:
            if (r10 == 0) goto L39
            goto L36
        L2d:
            r11 = move-exception
            goto L3b
        L2f:
            r11 = move-exception
            r11.getMessage()     // Catch: java.lang.Throwable -> L2d
            if (r10 != 0) goto L36
            goto L39
        L36:
            r10.close()     // Catch: java.lang.Throwable -> L41
        L39:
            monitor-exit(r0)
            return
        L3b:
            if (r10 == 0) goto L40
            r10.close()     // Catch: java.lang.Throwable -> L41
        L40:
            throw r11     // Catch: java.lang.Throwable -> L41
        L41:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.conversiontracking.f.d():void");
    }

    public d a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        int i = cursor.getInt(7);
        String string = cursor.getString(1);
        if (i > 0) {
            string = Uri.parse(string).buildUpon().appendQueryParameter("retry", Integer.toString(i)).build().toString();
        }
        return new d(cursor.getLong(0), string, cursor.getString(2), cursor.getInt(3) > 0, cursor.getInt(4) > 0, cursor.getString(5), cursor.getLong(6), i);
    }

    public class a extends SQLiteOpenHelper {
        public a(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 5);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(f.a);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS conversiontracking");
            onCreate(sQLiteDatabase);
        }
    }
}
