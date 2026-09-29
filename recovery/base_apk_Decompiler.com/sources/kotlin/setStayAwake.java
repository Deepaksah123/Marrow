package kotlin;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class setStayAwake implements WifiLockManager {
    private final RendererWakeupListener RemoteActionCompatParcelizer;
    private final lambdasetPlaylistMetadata15 read;
    private final lambdasetDeviceVolume23 write;

    public setStayAwake(lambdasetPlaylistMetadata15 lambdasetplaylistmetadata15, RendererWakeupListener rendererWakeupListener, lambdasetDeviceVolume23 lambdasetdevicevolume23) {
        toMagicModuleMetaRepoModel.write(lambdasetplaylistmetadata15, "");
        toMagicModuleMetaRepoModel.write(rendererWakeupListener, "");
        toMagicModuleMetaRepoModel.write(lambdasetdevicevolume23, "");
        this.read = lambdasetplaylistmetadata15;
        this.RemoteActionCompatParcelizer = rendererWakeupListener;
        this.write = lambdasetdevicevolume23;
    }

    @Override // kotlin.WifiLockManager
    public final long IconCompatParcelizer(String str, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        if (!this.read.IconCompatParcelizer()) {
            this.RemoteActionCompatParcelizer.read();
            return -2L;
        }
        String audioAttributesCompatParcelizer = this.write.getAudioAttributesCompatParcelizer();
        this.RemoteActionCompatParcelizer.read();
        long jAudioAttributesCompatParcelizer = RendererCapabilitiesListener.AudioAttributesCompatParcelizer();
        ContentValues contentValues = new ContentValues();
        contentValues.put("eventName", str2);
        contentValues.put("normalizedEventName", str3);
        contentValues.put("firstTs", Long.valueOf(jAudioAttributesCompatParcelizer));
        contentValues.put("lastTs", Long.valueOf(jAudioAttributesCompatParcelizer));
        contentValues.put("count", (Integer) 1);
        contentValues.put("deviceID", str);
        try {
            return this.read.getWritableDatabase().insertWithOnConflict(audioAttributesCompatParcelizer, null, contentValues, 5);
        } catch (Exception e) {
            RendererWakeupListener rendererWakeupListener = this.RemoteActionCompatParcelizer;
            e.toString();
            rendererWakeupListener.read();
            this.read.write();
            return -1L;
        }
    }

    @Override // kotlin.WifiLockManager
    public final boolean AudioAttributesCompatParcelizer(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        String audioAttributesCompatParcelizer = this.write.getAudioAttributesCompatParcelizer();
        long jAudioAttributesCompatParcelizer = RendererCapabilitiesListener.AudioAttributesCompatParcelizer();
        try {
            StringBuilder sb = new StringBuilder("\n            UPDATE ");
            sb.append(audioAttributesCompatParcelizer);
            sb.append(" \n            SET \n                count = count + 1,\n                lastTs = ?\n            WHERE deviceID = ? \n            AND normalizedEventName = ?;\n        ");
            String strWrite = TestGroupLSModel.write(sb.toString());
            this.RemoteActionCompatParcelizer.read();
            this.read.getWritableDatabase().execSQL(strWrite, new Object[]{Long.valueOf(jAudioAttributesCompatParcelizer), str, str2});
            return true;
        } catch (Exception e) {
            RendererWakeupListener.onAddQueueItem();
            return false;
        }
    }

    @Override // kotlin.WifiLockManager
    public final boolean write(String str, Set<Pair<String, String>> set) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(set, "");
        this.write.getAudioAttributesCompatParcelizer();
        this.RemoteActionCompatParcelizer.read();
        try {
            this.read.getWritableDatabase().beginTransaction();
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (read(str, (String) pair.IconCompatParcelizer())) {
                    RendererWakeupListener rendererWakeupListener = this.RemoteActionCompatParcelizer;
                    Objects.toString(pair);
                    rendererWakeupListener.read();
                    AudioAttributesCompatParcelizer(str, (String) pair.IconCompatParcelizer());
                } else {
                    RendererWakeupListener rendererWakeupListener2 = this.RemoteActionCompatParcelizer;
                    Objects.toString(pair);
                    rendererWakeupListener2.read();
                    IconCompatParcelizer(str, (String) pair.write(), (String) pair.IconCompatParcelizer());
                }
            }
            this.read.getWritableDatabase().setTransactionSuccessful();
            this.read.getWritableDatabase().endTransaction();
            return true;
        } catch (Exception e) {
            RendererWakeupListener.onAddQueueItem();
            try {
                this.read.getWritableDatabase().endTransaction();
                return false;
            } catch (Exception e2) {
                RendererWakeupListener.onAddQueueItem();
                return false;
            }
        }
    }

    @Override // kotlin.WifiLockManager
    public final notifySeekStarted IconCompatParcelizer(String str, String str2) {
        notifySeekStarted notifyseekstarted;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        try {
            Cursor cursorQuery = this.read.getReadableDatabase().query(this.write.getAudioAttributesCompatParcelizer(), null, "deviceID = ? AND normalizedEventName = ?", new String[]{str, str2}, null, null, null, null);
            if (cursorQuery == null) {
                return null;
            }
            Cursor cursor = cursorQuery;
            try {
                Cursor cursor2 = cursor;
                if (cursor2.moveToFirst()) {
                    String string = cursor2.getString(cursor2.getColumnIndexOrThrow("eventName"));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                    String string2 = cursor2.getString(cursor2.getColumnIndexOrThrow("normalizedEventName"));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                    long j = cursor2.getLong(cursor2.getColumnIndexOrThrow("firstTs"));
                    long j2 = cursor2.getLong(cursor2.getColumnIndexOrThrow("lastTs"));
                    int i = cursor2.getInt(cursor2.getColumnIndexOrThrow("count"));
                    String string3 = cursor2.getString(cursor2.getColumnIndexOrThrow("deviceID"));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
                    notifyseekstarted = new notifySeekStarted(string, string2, j, j2, i, string3);
                } else {
                    notifyseekstarted = null;
                }
                MagicModuleMetaLSModel.IconCompatParcelizer(cursor, null);
                return notifyseekstarted;
            } finally {
            }
        } catch (Exception e) {
            RendererWakeupListener.onAddQueueItem();
            return null;
        }
    }

    @Override // kotlin.WifiLockManager
    public final int RemoteActionCompatParcelizer(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        try {
            Cursor cursorQuery = this.read.getReadableDatabase().query(this.write.getAudioAttributesCompatParcelizer(), new String[]{"count"}, "deviceID = ? AND normalizedEventName = ?", new String[]{str, str2}, null, null, null, null);
            if (cursorQuery == null) {
                return -1;
            }
            Cursor cursor = cursorQuery;
            try {
                Cursor cursor2 = cursor;
                int i = cursor2.moveToFirst() ? cursor2.getInt(cursor2.getColumnIndexOrThrow("count")) : 0;
                MagicModuleMetaLSModel.IconCompatParcelizer(cursor, null);
                return i;
            } finally {
            }
        } catch (Exception e) {
            RendererWakeupListener.onAddQueueItem();
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    @Override // kotlin.WifiLockManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean read(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            kotlin.toMagicModuleMetaRepoModel.write(r3, r0)
            kotlin.toMagicModuleMetaRepoModel.write(r4, r0)
            o.lambdasetDeviceVolume23 r0 = r2.write
            java.lang.String r0 = r0.getAudioAttributesCompatParcelizer()
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "\n            SELECT EXISTS(\n                SELECT 1 \n                FROM "
            r4.<init>(r1)
            r4.append(r0)
            java.lang.String r0 = " \n                WHERE deviceID = ? AND normalizedEventName = ?\n            ) AS eventExists;\n        "
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = kotlin.TestGroupLSModel.write(r4)
            r0 = 0
            o.lambdasetPlaylistMetadata15 r2 = r2.read     // Catch: java.lang.Exception -> L5c
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch: java.lang.Exception -> L5c
            android.database.Cursor r2 = r2.rawQuery(r4, r3)     // Catch: java.lang.Exception -> L5c
            if (r2 == 0) goto L5b
            java.io.Closeable r2 = (java.io.Closeable) r2     // Catch: java.lang.Exception -> L5c
            r3 = r2
            android.database.Cursor r3 = (android.database.Cursor) r3     // Catch: java.lang.Throwable -> L54
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L54
            if (r4 == 0) goto L4e
            java.lang.String r4 = "eventExists"
            int r4 = r3.getColumnIndexOrThrow(r4)     // Catch: java.lang.Throwable -> L54
            int r3 = r3.getInt(r4)     // Catch: java.lang.Throwable -> L54
            r4 = 1
            if (r3 == r4) goto L4f
        L4e:
            r4 = r0
        L4f:
            r3 = 0
            kotlin.MagicModuleMetaLSModel.IconCompatParcelizer(r2, r3)     // Catch: java.lang.Exception -> L5c
            return r4
        L54:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L56
        L56:
            r4 = move-exception
            kotlin.MagicModuleMetaLSModel.IconCompatParcelizer(r2, r3)     // Catch: java.lang.Exception -> L5c
            throw r4     // Catch: java.lang.Exception -> L5c
        L5b:
            return r0
        L5c:
            r2 = move-exception
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            kotlin.RendererWakeupListener.onAddQueueItem()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setStayAwake.read(java.lang.String, java.lang.String):boolean");
    }

    @Override // kotlin.WifiLockManager
    public final boolean RemoteActionCompatParcelizer() {
        String audioAttributesCompatParcelizer = this.write.getAudioAttributesCompatParcelizer();
        try {
            StringBuilder sb = new StringBuilder("\n            DELETE FROM ");
            sb.append(audioAttributesCompatParcelizer);
            sb.append("\n            WHERE (normalizedEventName, deviceID) IN (\n                SELECT normalizedEventName, deviceID\n                FROM ");
            sb.append(audioAttributesCompatParcelizer);
            sb.append("\n                ORDER BY lastTs ASC \n                LIMIT (\n                SELECT CASE \n                    WHEN COUNT(*) > ? THEN COUNT(*) - ?\n                    ELSE 0\n                END \n                FROM ");
            sb.append(audioAttributesCompatParcelizer);
            sb.append("\n                )\n            );\n        ");
            this.read.getWritableDatabase().execSQL(TestGroupLSModel.write(sb.toString()), new Integer[]{11520, 9216});
            this.RemoteActionCompatParcelizer.read();
            return true;
        } catch (Exception e) {
            RendererWakeupListener.onAddQueueItem();
            return false;
        }
    }
}
