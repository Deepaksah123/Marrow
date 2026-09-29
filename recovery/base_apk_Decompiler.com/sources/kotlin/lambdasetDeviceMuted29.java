package kotlin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.marrow.data.models.custommodule.FilterParams;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\u0000\u0018\u0000 N2\u00020\u0001:\u0001NB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007J$\u0010\u0016\u001a\u00020\u00112\u0010\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007J\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0014J\u0013\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u001c¢\u0006\u0002\u0010\u001dJ\u001c\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020 0\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u0014J\u001c\u0010\"\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\u00142\b\u0010#\u001a\u0004\u0018\u00010\u0014J\u0006\u0010$\u001a\u00020%J%\u0010&\u001a\u0012\u0012\u0004\u0012\u00020(0)j\b\u0012\u0004\u0012\u00020(`'2\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010*J\u001c\u0010+\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007J$\u0010,\u001a\u00020\u00112\u0010\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007J\u0010\u0010-\u001a\u00020.2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0014J\u0006\u0010/\u001a\u00020.J$\u00100\u001a\u00020%2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00142\b\u0010#\u001a\u0004\u0018\u00010\u00142\u0006\u00101\u001a\u00020 H\u0007J\u0016\u00102\u001a\u00020.2\f\u00103\u001a\b\u0012\u0004\u0012\u00020(0\u0018H\u0007J\u0006\u00104\u001a\u00020.J\u0018\u00105\u001a\u00020.2\u0006\u00106\u001a\u00020\u00142\u0006\u00107\u001a\u000208H\u0007J\u0018\u00109\u001a\u00020.2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00142\u0006\u0010:\u001a\u00020%J\u000e\u0010;\u001a\u00020.2\u0006\u00107\u001a\u000208J\u0018\u0010<\u001a\u0004\u0018\u00010 2\u0006\u00107\u001a\u0002082\u0006\u0010=\u001a\u00020>J\u001d\u0010?\u001a\u00020.2\u000e\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u001cH\u0007¢\u0006\u0002\u0010AJ\u0018\u0010B\u001a\u00020%2\u0006\u00101\u001a\u00020 2\u0006\u00107\u001a\u000208H\u0007J\u000e\u0010C\u001a\u00020.2\u0006\u00107\u001a\u000208J\b\u0010D\u001a\u00020\tH\u0007J\b\u0010E\u001a\u00020\u0011H\u0003J\u0018\u0010F\u001a\u00020.2\u0006\u00107\u001a\u0002082\u0006\u0010G\u001a\u00020%H\u0002J\r\u0010H\u001a\u00020.H\u0001¢\u0006\u0002\bIJ\u0010\u0010J\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0002J\u0010\u0010K\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010L\u001a\u00020\u00142\u0006\u0010M\u001a\u00020>H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lcom/clevertap/android/sdk/db/DBAdapter;", "", LogCategory.CONTEXT, "Landroid/content/Context;", PaymentConstants.Category.CONFIG, "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "<init>", "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;)V", "userEventLogDao", "Lcom/clevertap/android/sdk/usereventlogs/UserEventLogDAO;", "logger", "Lcom/clevertap/android/sdk/Logger;", "kotlin.jvm.PlatformType", "Lcom/clevertap/android/sdk/Logger;", "dbHelper", "Lcom/clevertap/android/sdk/db/DatabaseHelper;", "rtlDirtyFlag", "", "deleteMessageForId", "messageId", "", "userId", "deleteMessagesForIDs", "messageIDs", "", "doesPushNotificationIdExist", "id", "fetchPushNotificationIds", "", "()[Ljava/lang/String;", "fetchUserProfilesByAccountId", "", "Lorg/json/JSONObject;", "accountId", "fetchUserProfileByAccountIdAndDeviceID", "deviceId", "getLastUninstallTimestamp", "", "getMessages", "Lkotlin/collections/ArrayList;", "Lcom/clevertap/android/sdk/inbox/CTMessageDAO;", "Ljava/util/ArrayList;", "(Ljava/lang/String;)Ljava/util/ArrayList;", "markReadMessageForId", "markReadMessagesForIds", "removeUserProfilesForAccountId", "", "storeUninstallTimestamp", "storeUserProfile", "obj", "upsertMessages", "inboxMessages", "cleanUpPushNotifications", "cleanupEventsFromLastId", "lastId", "table", "Lcom/clevertap/android/sdk/db/Table;", "storePushNotificationId", "ttl", "cleanupStaleEvents", "fetchEvents", "limit", "", "updatePushNotificationIds", "ids", "([Ljava/lang/String;)V", "storeObject", "removeEvents", "userEventLogDAO", "belowMemThreshold", "cleanInternal", "expiration", "deleteDB", "deleteDB$clevertap_core_release", "fetchPushNotificationId", "getDatabaseName", "getTemplateMarkersList", "count", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class lambdasetDeviceMuted29 {
    public static final write write = new write(null);
    private volatile WifiLockManager AudioAttributesCompatParcelizer;
    private final lambdasetPlaylistMetadata15 IconCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    private final RendererWakeupListener read;

    public lambdasetDeviceMuted29(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(cleverTapInstanceConfig, "");
        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
        this.read = rendererWakeupListenerMediaBrowserCompatItemReceiver;
        String strWrite = write(cleverTapInstanceConfig);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rendererWakeupListenerMediaBrowserCompatItemReceiver, "");
        this.IconCompatParcelizer = new lambdasetPlaylistMetadata15(context, cleverTapInstanceConfig, strWrite, rendererWakeupListenerMediaBrowserCompatItemReceiver);
        this.RemoteActionCompatParcelizer = true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/lambdasetDeviceMuted29$write;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write {
        public static int AudioAttributesCompatParcelizer;
        public static int read;

        private write() {
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        public static int RemoteActionCompatParcelizer() {
            int i = AudioAttributesCompatParcelizer;
            int i2 = i % 6754542;
            AudioAttributesCompatParcelizer = i + 1;
            if (i2 != 0) {
                return read;
            }
            int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
            read = i3;
            return i3;
        }
    }

    public final boolean read(String str, String str2) {
        synchronized (this) {
            boolean z = false;
            if (str == null || str2 == null) {
                return false;
            }
            try {
                this.IconCompatParcelizer.getWritableDatabase().delete(lambdasetDeviceVolume23.write.getAudioAttributesCompatParcelizer(), "_id = ? AND messageUser = ?", new String[]{str, str2});
                z = true;
            } catch (SQLiteException e) {
                SQLiteException sQLiteException = e;
                RendererWakeupListener.onAddQueueItem();
            }
            return z;
        }
    }

    public final boolean IconCompatParcelizer(String str) {
        boolean zRemoteActionCompatParcelizer;
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(str, "");
            zRemoteActionCompatParcelizer = toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) AudioAttributesCompatParcelizer(str));
        }
        return zRemoteActionCompatParcelizer;
    }

    public final String[] IconCompatParcelizer() {
        synchronized (this) {
            if (!this.RemoteActionCompatParcelizer) {
                return new String[0];
            }
            String audioAttributesCompatParcelizer = lambdasetDeviceVolume23.IconCompatParcelizer.getAudioAttributesCompatParcelizer();
            ArrayList arrayList = new ArrayList();
            try {
                Cursor cursorQuery = this.IconCompatParcelizer.getReadableDatabase().query(audioAttributesCompatParcelizer, null, "isRead = 0", null, null, null, null);
                if (cursorQuery != null) {
                    Cursor cursor = cursorQuery;
                    try {
                        Cursor cursor2 = cursor;
                        while (cursor2.moveToNext()) {
                            int columnIndex = cursor2.getColumnIndex("data");
                            if (columnIndex >= 0) {
                                String string = cursor2.getString(columnIndex);
                                this.read.read();
                                arrayList.add(string);
                            }
                        }
                        getShowPopup getshowpopup = getShowPopup.INSTANCE;
                        MagicModuleMetaLSModel.IconCompatParcelizer(cursor, null);
                    } finally {
                    }
                }
            } catch (SQLiteException e) {
                SQLiteException sQLiteException = e;
                RendererWakeupListener.onAddQueueItem();
            }
            return (String[]) arrayList.toArray(new String[0]);
        }
    }

    public final Map<String, JSONObject> RemoteActionCompatParcelizer(String str) {
        synchronized (this) {
            if (str == null) {
                return VideoTimelineResponseBody.read();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                Cursor cursorQuery = this.IconCompatParcelizer.getReadableDatabase().query(lambdasetDeviceVolume23.MediaBrowserCompatItemReceiver.getAudioAttributesCompatParcelizer(), null, "_id = ?", new String[]{str}, null, null, null);
                if (cursorQuery != null) {
                    Cursor cursor = cursorQuery;
                    try {
                        Cursor cursor2 = cursor;
                        int columnIndex = cursor2.getColumnIndex("data");
                        int columnIndex2 = cursor2.getColumnIndex("deviceID");
                        if (columnIndex >= 0) {
                            while (cursor2.moveToNext()) {
                                String string = cursor2.getString(columnIndex);
                                String string2 = cursor2.getString(columnIndex2);
                                if (string != null) {
                                    try {
                                        JSONObject jSONObject = new JSONObject(string);
                                        toMagicModuleMetaRepoModel.write((Object) string2);
                                        linkedHashMap.put(string2, jSONObject);
                                    } catch (JSONException e) {
                                        JSONException jSONException = e;
                                        RendererWakeupListener.onAddQueueItem();
                                        getShowPopup getshowpopup = getShowPopup.INSTANCE;
                                    }
                                }
                            }
                        }
                        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                        MagicModuleMetaLSModel.IconCompatParcelizer(cursor, null);
                    } finally {
                    }
                }
            } catch (SQLiteException e2) {
                SQLiteException sQLiteException = e2;
                RendererWakeupListener.onAddQueueItem();
            }
            return linkedHashMap;
        }
    }

    public final JSONObject write(String str, String str2) {
        Throwable th;
        int columnIndex;
        synchronized (this) {
            JSONObject jSONObject = null;
            if (str == null || str2 == null) {
                return null;
            }
            try {
                Cursor cursorQuery = this.IconCompatParcelizer.getReadableDatabase().query(lambdasetDeviceVolume23.MediaBrowserCompatItemReceiver.getAudioAttributesCompatParcelizer(), null, "_id = ? AND deviceID = ?", new String[]{str, str2}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        Cursor cursor = cursorQuery;
                        try {
                            Cursor cursor2 = cursor;
                            str2 = (!cursor2.moveToFirst() || (columnIndex = cursor2.getColumnIndex("data")) < 0) ? null : cursor2.getString(columnIndex);
                            try {
                                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                                MagicModuleMetaLSModel.IconCompatParcelizer(cursor, null);
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    MagicModuleMetaLSModel.IconCompatParcelizer(cursor, th);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        SQLiteException sQLiteException = e;
                        RendererWakeupListener.onAddQueueItem();
                    }
                } else {
                    str2 = null;
                }
            } catch (SQLiteException e2) {
                e = e2;
                str2 = null;
            }
            if (str2 != null) {
                try {
                    jSONObject = new JSONObject(str2);
                } catch (JSONException unused) {
                }
            }
            return jSONObject;
        }
    }

    public final long write() {
        long j;
        synchronized (this) {
            try {
                Cursor cursorQuery = this.IconCompatParcelizer.getReadableDatabase().query(lambdasetDeviceVolume23.AudioAttributesImplApi21Parcelizer.getAudioAttributesCompatParcelizer(), null, null, null, null, null, "created_at DESC", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                if (cursorQuery != null) {
                    Cursor cursor = cursorQuery;
                    try {
                        Cursor cursor2 = cursor;
                        j = cursor2.moveToFirst() ? cursor2.getLong(cursor2.getColumnIndexOrThrow("created_at")) : 0L;
                        getShowPopup getshowpopup = getShowPopup.INSTANCE;
                        MagicModuleMetaLSModel.IconCompatParcelizer(cursor, null);
                    } finally {
                    }
                }
            } catch (Exception e) {
                Exception exc = e;
                RendererWakeupListener.onAddQueueItem();
            }
        }
        return j;
    }

    public final ArrayList<clearPositionDiscontinuity> write(String str) {
        ArrayList<clearPositionDiscontinuity> arrayList;
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(str, "");
            String audioAttributesCompatParcelizer = lambdasetDeviceVolume23.write.getAudioAttributesCompatParcelizer();
            arrayList = new ArrayList<>();
            try {
                Cursor cursorQuery = this.IconCompatParcelizer.getReadableDatabase().query(audioAttributesCompatParcelizer, null, "messageUser = ?", new String[]{str}, null, null, "created_at DESC");
                if (cursorQuery != null) {
                    Cursor cursor = cursorQuery;
                    try {
                        Cursor cursor2 = cursor;
                        while (cursor2.moveToNext()) {
                            clearPositionDiscontinuity clearpositiondiscontinuity = new clearPositionDiscontinuity();
                            clearpositiondiscontinuity.IconCompatParcelizer(cursor2.getString(cursor2.getColumnIndexOrThrow("_id")));
                            clearpositiondiscontinuity.AudioAttributesCompatParcelizer(new JSONObject(cursor2.getString(cursor2.getColumnIndexOrThrow("data"))));
                            clearpositiondiscontinuity.IconCompatParcelizer(new JSONObject(cursor2.getString(cursor2.getColumnIndexOrThrow("wzrkParams"))));
                            clearpositiondiscontinuity.write(cursor2.getLong(cursor2.getColumnIndexOrThrow("created_at")));
                            clearpositiondiscontinuity.RemoteActionCompatParcelizer(cursor2.getLong(cursor2.getColumnIndexOrThrow("expires")));
                            clearpositiondiscontinuity.AudioAttributesCompatParcelizer(cursor2.getInt(cursor2.getColumnIndexOrThrow("isRead")));
                            clearpositiondiscontinuity.read(cursor2.getString(cursor2.getColumnIndexOrThrow("messageUser")));
                            clearpositiondiscontinuity.AudioAttributesCompatParcelizer(cursor2.getString(cursor2.getColumnIndexOrThrow(FilterParams.KEY_TAGS)));
                            clearpositiondiscontinuity.write(cursor2.getString(cursor2.getColumnIndexOrThrow("campaignId")));
                            arrayList.add(clearpositiondiscontinuity);
                        }
                        getShowPopup getshowpopup = getShowPopup.INSTANCE;
                        MagicModuleMetaLSModel.IconCompatParcelizer(cursor, null);
                    } finally {
                    }
                }
            } catch (Exception e) {
                Exception exc = e;
                RendererWakeupListener.onAddQueueItem();
            }
        }
        return arrayList;
    }

    public final boolean IconCompatParcelizer(String str, String str2) {
        synchronized (this) {
            boolean z = false;
            if (str == null || str2 == null) {
                return false;
            }
            lambdasetDeviceVolume23.write.getAudioAttributesCompatParcelizer();
            ContentValues contentValues = new ContentValues();
            contentValues.put("isRead", (Integer) 1);
            try {
                this.IconCompatParcelizer.getWritableDatabase().update(lambdasetDeviceVolume23.write.getAudioAttributesCompatParcelizer(), contentValues, "_id = ? AND messageUser = ?", new String[]{str, str2});
                z = true;
            } catch (SQLiteException e) {
                SQLiteException sQLiteException = e;
                RendererWakeupListener.onAddQueueItem();
            }
            return z;
        }
    }

    public final void AudioAttributesCompatParcelizer() {
        synchronized (this) {
            if (!AudioAttributesImplBaseParcelizer()) {
                this.read.read();
                return;
            }
            String audioAttributesCompatParcelizer = lambdasetDeviceVolume23.AudioAttributesImplApi21Parcelizer.getAudioAttributesCompatParcelizer();
            ContentValues contentValues = new ContentValues();
            contentValues.put("created_at", Long.valueOf(System.currentTimeMillis()));
            try {
                this.IconCompatParcelizer.getWritableDatabase().insert(audioAttributesCompatParcelizer, null, contentValues);
            } catch (SQLiteException unused) {
                this.read.read();
                AudioAttributesImplApi21Parcelizer();
            }
        }
    }

    public final long read(String str, String str2, JSONObject jSONObject) {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(jSONObject, "");
            long jInsertWithOnConflict = -1;
            if (str == null || str2 == null) {
                return -1L;
            }
            if (!AudioAttributesImplBaseParcelizer()) {
                this.read.read();
                return -2L;
            }
            String audioAttributesCompatParcelizer = lambdasetDeviceVolume23.MediaBrowserCompatItemReceiver.getAudioAttributesCompatParcelizer();
            this.read.read();
            ContentValues contentValues = new ContentValues();
            contentValues.put("data", jSONObject.toString());
            contentValues.put("_id", str);
            contentValues.put("deviceID", str2);
            try {
                jInsertWithOnConflict = this.IconCompatParcelizer.getWritableDatabase().insertWithOnConflict(audioAttributesCompatParcelizer, null, contentValues, 5);
            } catch (SQLiteException unused) {
                this.read.read();
                AudioAttributesImplApi21Parcelizer();
            }
            return jInsertWithOnConflict;
        }
    }

    public final void read(List<? extends clearPositionDiscontinuity> list) {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(list, "");
            if (!AudioAttributesImplBaseParcelizer()) {
                this.read.read();
                return;
            }
            for (clearPositionDiscontinuity clearpositiondiscontinuity : list) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("_id", clearpositiondiscontinuity.RemoteActionCompatParcelizer());
                contentValues.put("data", clearpositiondiscontinuity.AudioAttributesImplApi26Parcelizer().toString());
                contentValues.put("wzrkParams", clearpositiondiscontinuity.AudioAttributesImplApi21Parcelizer().toString());
                contentValues.put("campaignId", clearpositiondiscontinuity.AudioAttributesCompatParcelizer());
                contentValues.put(FilterParams.KEY_TAGS, clearpositiondiscontinuity.AudioAttributesImplBaseParcelizer());
                contentValues.put("isRead", Integer.valueOf(clearpositiondiscontinuity.MediaBrowserCompatCustomActionResultReceiver()));
                contentValues.put("expires", Long.valueOf(clearpositiondiscontinuity.write()));
                contentValues.put("created_at", Long.valueOf(clearpositiondiscontinuity.read()));
                contentValues.put("messageUser", clearpositiondiscontinuity.MediaBrowserCompatItemReceiver());
                try {
                    this.IconCompatParcelizer.getWritableDatabase().insertWithOnConflict(lambdasetDeviceVolume23.write.getAudioAttributesCompatParcelizer(), null, contentValues, 5);
                } catch (SQLiteException unused) {
                    RendererWakeupListener rendererWakeupListener = this.read;
                    lambdasetDeviceVolume23.write.getAudioAttributesCompatParcelizer();
                    rendererWakeupListener.read();
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                }
            }
        }
    }

    public final void RemoteActionCompatParcelizer() {
        synchronized (this) {
            read(lambdasetDeviceVolume23.IconCompatParcelizer, 0L);
        }
    }

    public final void RemoteActionCompatParcelizer(String str, lambdasetDeviceVolume23 lambdasetdevicevolume23) {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(lambdasetdevicevolume23, "");
            try {
                this.IconCompatParcelizer.getWritableDatabase().delete(lambdasetdevicevolume23.getAudioAttributesCompatParcelizer(), "_id <= ?", new String[]{str});
            } catch (SQLiteException unused) {
                this.read.read();
                AudioAttributesImplApi21Parcelizer();
            }
        }
    }

    public final void write(String str, long j) {
        synchronized (this) {
            if (str == null) {
                return;
            }
            if (!AudioAttributesImplBaseParcelizer()) {
                this.read.read();
                return;
            }
            String audioAttributesCompatParcelizer = lambdasetDeviceVolume23.IconCompatParcelizer.getAudioAttributesCompatParcelizer();
            if (j <= 0) {
                j = System.currentTimeMillis() + 345600000;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("data", str);
            contentValues.put("created_at", Long.valueOf(j));
            contentValues.put("isRead", (Integer) 0);
            try {
                this.IconCompatParcelizer.getWritableDatabase().insert(audioAttributesCompatParcelizer, null, contentValues);
                this.RemoteActionCompatParcelizer = true;
                this.read.read();
            } catch (SQLiteException unused) {
                this.read.read();
                AudioAttributesImplApi21Parcelizer();
            }
        }
    }

    public final void IconCompatParcelizer(lambdasetDeviceVolume23 lambdasetdevicevolume23) {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(lambdasetdevicevolume23, "");
            read(lambdasetdevicevolume23, 432000000L);
        }
    }

    public final JSONObject read(lambdasetDeviceVolume23 lambdasetdevicevolume23, int i) {
        JSONObject jSONObject;
        String string;
        Cursor cursorQuery;
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(lambdasetdevicevolume23, "");
            String audioAttributesCompatParcelizer = lambdasetdevicevolume23.getAudioAttributesCompatParcelizer();
            JSONArray jSONArray = new JSONArray();
            jSONObject = null;
            try {
                cursorQuery = this.IconCompatParcelizer.getReadableDatabase().query(audioAttributesCompatParcelizer, null, null, null, null, null, "created_at ASC", String.valueOf(i));
            } catch (Exception e) {
                Exception exc = e;
                RendererWakeupListener.onAddQueueItem();
            }
            if (cursorQuery != null) {
                Cursor cursor = cursorQuery;
                try {
                    Cursor cursor2 = cursor;
                    string = null;
                    while (cursor2.moveToNext()) {
                        if (cursor2.isLast()) {
                            string = cursor2.getString(cursor2.getColumnIndexOrThrow("_id"));
                        }
                        try {
                            jSONArray.put(new JSONObject(cursor2.getString(cursor2.getColumnIndexOrThrow("data"))));
                        } catch (JSONException unused) {
                        }
                    }
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                    MagicModuleMetaLSModel.IconCompatParcelizer(cursor, null);
                } finally {
                }
            } else {
                string = null;
            }
            if (string != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(string, jSONArray);
                    jSONObject = jSONObject2;
                } catch (JSONException unused2) {
                }
            }
        }
        return jSONObject;
    }

    public final void IconCompatParcelizer(String[] strArr) {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(strArr, "");
            if (strArr.length == 0) {
                return;
            }
            if (!AudioAttributesImplBaseParcelizer()) {
                this.read.read();
                return;
            }
            String audioAttributesCompatParcelizer = lambdasetDeviceVolume23.IconCompatParcelizer.getAudioAttributesCompatParcelizer();
            ContentValues contentValues = new ContentValues();
            contentValues.put("isRead", (Integer) 1);
            String str = read(strArr.length);
            try {
                SQLiteDatabase writableDatabase = this.IconCompatParcelizer.getWritableDatabase();
                StringBuilder sb = new StringBuilder("data IN (");
                sb.append(str);
                sb.append(')');
                writableDatabase.update(audioAttributesCompatParcelizer, contentValues, sb.toString(), strArr);
                this.RemoteActionCompatParcelizer = false;
            } catch (SQLiteException unused) {
                this.read.read();
                AudioAttributesImplApi21Parcelizer();
            }
        }
    }

    public final long write(JSONObject jSONObject, lambdasetDeviceVolume23 lambdasetdevicevolume23) {
        long jSimpleQueryForLong;
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(jSONObject, "");
            toMagicModuleMetaRepoModel.write(lambdasetdevicevolume23, "");
            if (!AudioAttributesImplBaseParcelizer()) {
                this.read.read();
                return -2L;
            }
            String audioAttributesCompatParcelizer = lambdasetdevicevolume23.getAudioAttributesCompatParcelizer();
            ContentValues contentValues = new ContentValues();
            contentValues.put("data", jSONObject.toString());
            contentValues.put("created_at", Long.valueOf(System.currentTimeMillis()));
            try {
                this.IconCompatParcelizer.getWritableDatabase().insert(audioAttributesCompatParcelizer, null, contentValues);
                StringBuilder sb = new StringBuilder("SELECT COUNT(*) FROM ");
                sb.append(audioAttributesCompatParcelizer);
                jSimpleQueryForLong = this.IconCompatParcelizer.getWritableDatabase().compileStatement(sb.toString()).simpleQueryForLong();
            } catch (SQLiteException unused) {
                this.read.read();
                AudioAttributesImplApi21Parcelizer();
                jSimpleQueryForLong = -1;
            }
            return jSimpleQueryForLong;
        }
    }

    public final void RemoteActionCompatParcelizer(lambdasetDeviceVolume23 lambdasetdevicevolume23) {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(lambdasetdevicevolume23, "");
            try {
                this.IconCompatParcelizer.getWritableDatabase().delete(lambdasetdevicevolume23.getAudioAttributesCompatParcelizer(), null, null);
            } catch (SQLiteException unused) {
                this.read.read();
                AudioAttributesImplApi21Parcelizer();
            }
        }
    }

    public final WifiLockManager read() {
        setStayAwake setstayawake;
        WifiLockManager wifiLockManager = this.AudioAttributesCompatParcelizer;
        if (wifiLockManager != null) {
            return wifiLockManager;
        }
        synchronized (this) {
            setstayawake = this.AudioAttributesCompatParcelizer;
            if (setstayawake == null) {
                lambdasetPlaylistMetadata15 lambdasetplaylistmetadata15 = this.IconCompatParcelizer;
                RendererWakeupListener rendererWakeupListener = this.read;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rendererWakeupListener, "");
                setStayAwake setstayawake2 = new setStayAwake(lambdasetplaylistmetadata15, rendererWakeupListener, lambdasetDeviceVolume23.MediaBrowserCompatCustomActionResultReceiver);
                this.AudioAttributesCompatParcelizer = setstayawake2;
                setstayawake = setstayawake2;
            }
        }
        return setstayawake;
    }

    private final boolean AudioAttributesImplBaseParcelizer() {
        return this.IconCompatParcelizer.IconCompatParcelizer();
    }

    private final void read(lambdasetDeviceVolume23 lambdasetdevicevolume23, long j) {
        long jCurrentTimeMillis = (System.currentTimeMillis() - j) / 1000;
        String audioAttributesCompatParcelizer = lambdasetdevicevolume23.getAudioAttributesCompatParcelizer();
        try {
            SQLiteDatabase writableDatabase = this.IconCompatParcelizer.getWritableDatabase();
            StringBuilder sb = new StringBuilder("created_at <= ");
            sb.append(jCurrentTimeMillis);
            writableDatabase.delete(audioAttributesCompatParcelizer, sb.toString(), null);
        } catch (SQLiteException e) {
            RendererWakeupListener.onAddQueueItem();
            AudioAttributesImplApi21Parcelizer();
        }
    }

    private void AudioAttributesImplApi21Parcelizer() {
        this.IconCompatParcelizer.write();
    }

    private final String AudioAttributesCompatParcelizer(String str) {
        String string = "";
        try {
            Cursor cursorQuery = this.IconCompatParcelizer.getReadableDatabase().query(lambdasetDeviceVolume23.IconCompatParcelizer.getAudioAttributesCompatParcelizer(), null, "data =?", new String[]{str}, null, null, null);
            if (cursorQuery == null) {
                return "";
            }
            Cursor cursor = cursorQuery;
            try {
                Cursor cursor2 = cursor;
                if (cursor2.moveToFirst()) {
                    string = cursor2.getString(cursor2.getColumnIndexOrThrow("data"));
                }
                this.read.read();
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                MagicModuleMetaLSModel.IconCompatParcelizer(cursor, null);
                return string;
            } finally {
            }
        } catch (Exception e) {
            RendererWakeupListener.onAddQueueItem();
            return string;
        }
    }

    private static String write(CleverTapInstanceConfig cleverTapInstanceConfig) {
        if (cleverTapInstanceConfig.MediaBrowserCompatSearchResultReceiver()) {
            return "clevertap";
        }
        StringBuilder sb = new StringBuilder("clevertap_");
        sb.append(cleverTapInstanceConfig.write());
        return sb.toString();
    }

    private static String read(int i) {
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            sb.append("?");
            for (int i2 = 0; i2 < i - 1; i2++) {
                sb.append(", ?");
            }
        }
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }
}
