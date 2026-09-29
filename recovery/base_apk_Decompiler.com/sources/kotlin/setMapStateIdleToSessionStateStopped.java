package kotlin;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.ExoMediaDrmOnEventListener;
import kotlin.clearKeyRequestProperty;
import kotlin.getSeekMap;
import kotlin.setLogSessionIdOnMediaDrmSession;

/* JADX INFO: loaded from: classes.dex */
@getPlanOldPrice
public final class setMapStateIdleToSessionStateStopped implements invalidateMediaSessionQueue, getSeekMap, invalidateMediaSessionMetadata {
    private static final DrmSessionManagerDrmSessionReference RemoteActionCompatParcelizer = DrmSessionManagerDrmSessionReference.IconCompatParcelizer("proto");
    private final BinarySearchSeeker AudioAttributesCompatParcelizer;
    private final setDescriptionList<String> IconCompatParcelizer;
    private final BinarySearchSeeker MediaBrowserCompatCustomActionResultReceiver;
    private final registerCustomCommandReceiver read;
    private final TimelineQueueEditor write;

    interface AudioAttributesCompatParcelizer<T, U> {
        U AudioAttributesCompatParcelizer(T t);
    }

    /* JADX INFO: loaded from: classes5.dex */
    interface IconCompatParcelizer<T> {
        T write();
    }

    @setSdkPayload
    setMapStateIdleToSessionStateStopped(BinarySearchSeeker binarySearchSeeker, BinarySearchSeeker binarySearchSeeker2, registerCustomCommandReceiver registercustomcommandreceiver, TimelineQueueEditor timelineQueueEditor, @setGateway(IconCompatParcelizer = "PACKAGE_NAME") setDescriptionList<String> setdescriptionlist) {
        this.write = timelineQueueEditor;
        this.MediaBrowserCompatCustomActionResultReceiver = binarySearchSeeker;
        this.AudioAttributesCompatParcelizer = binarySearchSeeker2;
        this.read = registercustomcommandreceiver;
        this.IconCompatParcelizer = setdescriptionlist;
    }

    private SQLiteDatabase RatingCompat() {
        final TimelineQueueEditor timelineQueueEditor = this.write;
        Objects.requireNonNull(timelineQueueEditor);
        return (SQLiteDatabase) AudioAttributesCompatParcelizer(new IconCompatParcelizer() { // from class: o.MediaSessionConnectorMediaMetadataProvider
            @Override // o.setMapStateIdleToSessionStateStopped.IconCompatParcelizer
            public final Object write() {
                return timelineQueueEditor.getWritableDatabase();
            }
        }, new AudioAttributesCompatParcelizer() { // from class: o.MediaSessionConnectorPlaybackActions
            @Override // o.setMapStateIdleToSessionStateStopped.AudioAttributesCompatParcelizer
            public final Object AudioAttributesCompatParcelizer(Object obj) {
                return setMapStateIdleToSessionStateStopped.AudioAttributesCompatParcelizer((Throwable) obj);
            }
        });
    }

    static /* synthetic */ SQLiteDatabase AudioAttributesCompatParcelizer(Throwable th) {
        throw new TimelineQueueNavigator("Timed out while trying to open db.", th);
    }

    @Override // kotlin.invalidateMediaSessionQueue
    public final setCustomActionProviders RemoteActionCompatParcelizer(final ExoMediaDrmProvider exoMediaDrmProvider, final ExoMediaDrmOnEventListener exoMediaDrmOnEventListener) {
        new Object[]{exoMediaDrmProvider.AudioAttributesCompatParcelizer(), exoMediaDrmOnEventListener.RemoteActionCompatParcelizer(), exoMediaDrmProvider.RemoteActionCompatParcelizer()};
        executeKeyRequest.write("SQLiteEventStore");
        long jLongValue = ((Long) write(new AudioAttributesCompatParcelizer() { // from class: o.MediaSessionConnectorQueueEditor
            @Override // o.setMapStateIdleToSessionStateStopped.AudioAttributesCompatParcelizer
            public final Object AudioAttributesCompatParcelizer(Object obj) {
                return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(exoMediaDrmOnEventListener, exoMediaDrmProvider, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return setCustomActionProviders.RemoteActionCompatParcelizer(jLongValue, exoMediaDrmProvider, exoMediaDrmOnEventListener);
    }

    final /* synthetic */ Long AudioAttributesCompatParcelizer(ExoMediaDrmOnEventListener exoMediaDrmOnEventListener, ExoMediaDrmProvider exoMediaDrmProvider, SQLiteDatabase sQLiteDatabase) {
        if (AudioAttributesImplApi26Parcelizer()) {
            IconCompatParcelizer(1L, clearKeyRequestProperty.AudioAttributesCompatParcelizer.CACHE_FULL, exoMediaDrmOnEventListener.RemoteActionCompatParcelizer());
            return -1L;
        }
        long jIconCompatParcelizer = IconCompatParcelizer(sQLiteDatabase, exoMediaDrmProvider);
        int i = this.read.read();
        byte[] bArrIconCompatParcelizer = exoMediaDrmOnEventListener.write().IconCompatParcelizer();
        boolean z = bArrIconCompatParcelizer.length <= i;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jIconCompatParcelizer));
        contentValues.put("transport_name", exoMediaDrmOnEventListener.RemoteActionCompatParcelizer());
        contentValues.put("timestamp_ms", Long.valueOf(exoMediaDrmOnEventListener.IconCompatParcelizer()));
        contentValues.put("uptime_ms", Long.valueOf(exoMediaDrmOnEventListener.AudioAttributesImplBaseParcelizer()));
        contentValues.put("payload_encoding", exoMediaDrmOnEventListener.write().write().write());
        contentValues.put("code", exoMediaDrmOnEventListener.AudioAttributesCompatParcelizer());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? bArrIconCompatParcelizer : new byte[0]);
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z) {
            int iCeil = (int) Math.ceil(((double) bArrIconCompatParcelizer.length) / ((double) i));
            for (int i2 = 1; i2 <= iCeil; i2++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrIconCompatParcelizer, (i2 - 1) * i, Math.min(i2 * i, bArrIconCompatParcelizer.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i2));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : exoMediaDrmOnEventListener.AudioAttributesImplApi26Parcelizer().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    private static long IconCompatParcelizer(SQLiteDatabase sQLiteDatabase, ExoMediaDrmProvider exoMediaDrmProvider) {
        Long lAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(sQLiteDatabase, exoMediaDrmProvider);
        if (lAudioAttributesCompatParcelizer != null) {
            return lAudioAttributesCompatParcelizer.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", exoMediaDrmProvider.RemoteActionCompatParcelizer());
        contentValues.put("priority", Integer.valueOf(markSeekOperationFinished.write(exoMediaDrmProvider.AudioAttributesCompatParcelizer())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (exoMediaDrmProvider.write() != null) {
            contentValues.put("extras", Base64.encodeToString(exoMediaDrmProvider.write(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private static Long AudioAttributesCompatParcelizer(SQLiteDatabase sQLiteDatabase, ExoMediaDrmProvider exoMediaDrmProvider) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(exoMediaDrmProvider.RemoteActionCompatParcelizer(), String.valueOf(markSeekOperationFinished.write(exoMediaDrmProvider.AudioAttributesCompatParcelizer()))));
        if (exoMediaDrmProvider.write() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(exoMediaDrmProvider.write(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) IconCompatParcelizer(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new AudioAttributesCompatParcelizer() { // from class: o.MediaSessionConnectorDefaultMediaMetadataProvider
            @Override // o.setMapStateIdleToSessionStateStopped.AudioAttributesCompatParcelizer
            public final Object AudioAttributesCompatParcelizer(Object obj) {
                return setMapStateIdleToSessionStateStopped.RemoteActionCompatParcelizer((Cursor) obj);
            }
        });
    }

    static /* synthetic */ Long RemoteActionCompatParcelizer(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    @Override // kotlin.invalidateMediaSessionQueue
    public final void AudioAttributesCompatParcelizer(Iterable<setCustomActionProviders> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder sb = new StringBuilder("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
            sb.append(read(iterable));
            final String string = sb.toString();
            final String str = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            write(new AudioAttributesCompatParcelizer() { // from class: o.setQueueEditor
                @Override // o.setMapStateIdleToSessionStateStopped.AudioAttributesCompatParcelizer
                public final Object AudioAttributesCompatParcelizer(Object obj) {
                    return this.write.write(string, str, (SQLiteDatabase) obj);
                }
            });
        }
    }

    final /* synthetic */ Object write(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        IconCompatParcelizer(sQLiteDatabase.rawQuery(str2, null), new AudioAttributesCompatParcelizer() { // from class: o.MediaSessionConnectorPlaybackPreparer
            @Override // o.setMapStateIdleToSessionStateStopped.AudioAttributesCompatParcelizer
            public final Object AudioAttributesCompatParcelizer(Object obj) {
                return this.write.AudioAttributesImplApi21Parcelizer((Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    final /* synthetic */ Object AudioAttributesImplApi21Parcelizer(Cursor cursor) {
        while (cursor.moveToNext()) {
            IconCompatParcelizer(cursor.getInt(0), clearKeyRequestProperty.AudioAttributesCompatParcelizer.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    @Override // kotlin.invalidateMediaSessionQueue
    public final void RemoteActionCompatParcelizer(Iterable<setCustomActionProviders> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder sb = new StringBuilder("DELETE FROM events WHERE _id in ");
            sb.append(read(iterable));
            RatingCompat().compileStatement(sb.toString()).execute();
        }
    }

    private static String read(Iterable<setCustomActionProviders> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<setCustomActionProviders> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().IconCompatParcelizer());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // kotlin.invalidateMediaSessionQueue
    public final long read(ExoMediaDrmProvider exoMediaDrmProvider) {
        return ((Long) IconCompatParcelizer(RatingCompat().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{exoMediaDrmProvider.RemoteActionCompatParcelizer(), String.valueOf(markSeekOperationFinished.write(exoMediaDrmProvider.AudioAttributesCompatParcelizer()))}), new AudioAttributesCompatParcelizer() { // from class: o.MediaSessionConnectorCaptionCallback
            @Override // o.setMapStateIdleToSessionStateStopped.AudioAttributesCompatParcelizer
            public final Object AudioAttributesCompatParcelizer(Object obj) {
                return setMapStateIdleToSessionStateStopped.read((Cursor) obj);
            }
        })).longValue();
    }

    static /* synthetic */ Long read(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    @Override // kotlin.invalidateMediaSessionQueue
    public final boolean write(final ExoMediaDrmProvider exoMediaDrmProvider) {
        return ((Boolean) write(new AudioAttributesCompatParcelizer() { // from class: o.MediaSessionConnectorQueueNavigator
            @Override // o.setMapStateIdleToSessionStateStopped.AudioAttributesCompatParcelizer
            public final Object AudioAttributesCompatParcelizer(Object obj) {
                return this.RemoteActionCompatParcelizer.write(exoMediaDrmProvider, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    final /* synthetic */ Boolean write(ExoMediaDrmProvider exoMediaDrmProvider, SQLiteDatabase sQLiteDatabase) {
        Long lAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(sQLiteDatabase, exoMediaDrmProvider);
        if (lAudioAttributesCompatParcelizer == null) {
            return Boolean.FALSE;
        }
        return (Boolean) IconCompatParcelizer(RatingCompat().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lAudioAttributesCompatParcelizer.toString()}), new MediaSessionConnectorCustomActionProvider());
    }

    @Override // kotlin.invalidateMediaSessionQueue
    public final void IconCompatParcelizer(final ExoMediaDrmProvider exoMediaDrmProvider, final long j) {
        write(new AudioAttributesCompatParcelizer() { // from class: o.getSupportedQueueNavigatorActions
            @Override // o.setMapStateIdleToSessionStateStopped.AudioAttributesCompatParcelizer
            public final Object AudioAttributesCompatParcelizer(Object obj) {
                return setMapStateIdleToSessionStateStopped.write(j, exoMediaDrmProvider, (SQLiteDatabase) obj);
            }
        });
    }

    static /* synthetic */ Object write(long j, ExoMediaDrmProvider exoMediaDrmProvider, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{exoMediaDrmProvider.RemoteActionCompatParcelizer(), String.valueOf(markSeekOperationFinished.write(exoMediaDrmProvider.AudioAttributesCompatParcelizer()))}) <= 0) {
            contentValues.put("backend_name", exoMediaDrmProvider.RemoteActionCompatParcelizer());
            contentValues.put("priority", Integer.valueOf(markSeekOperationFinished.write(exoMediaDrmProvider.AudioAttributesCompatParcelizer())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // kotlin.invalidateMediaSessionQueue
    public final Iterable<setCustomActionProviders> IconCompatParcelizer(final ExoMediaDrmProvider exoMediaDrmProvider) {
        return (Iterable) write(new AudioAttributesCompatParcelizer() { // from class: o.MediaSessionConnectorMediaButtonEventHandler
            @Override // o.setMapStateIdleToSessionStateStopped.AudioAttributesCompatParcelizer
            public final Object AudioAttributesCompatParcelizer(Object obj) {
                return this.IconCompatParcelizer.RemoteActionCompatParcelizer(exoMediaDrmProvider, (SQLiteDatabase) obj);
            }
        });
    }

    final /* synthetic */ List RemoteActionCompatParcelizer(ExoMediaDrmProvider exoMediaDrmProvider, SQLiteDatabase sQLiteDatabase) {
        List<setCustomActionProviders> list = read(sQLiteDatabase, exoMediaDrmProvider, this.read.AudioAttributesCompatParcelizer());
        for (DrmUtilApi21 drmUtilApi21 : DrmUtilApi21.values()) {
            if (drmUtilApi21 != exoMediaDrmProvider.AudioAttributesCompatParcelizer()) {
                int iAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer() - list.size();
                if (iAudioAttributesCompatParcelizer <= 0) {
                    break;
                }
                list.addAll(read(sQLiteDatabase, exoMediaDrmProvider.IconCompatParcelizer(drmUtilApi21), iAudioAttributesCompatParcelizer));
            }
        }
        return IconCompatParcelizer(list, IconCompatParcelizer(sQLiteDatabase, list));
    }

    @Override // kotlin.invalidateMediaSessionQueue
    public final Iterable<ExoMediaDrmProvider> read() {
        return (Iterable) write(new AudioAttributesCompatParcelizer() { // from class: o.setRatingCallback
            @Override // o.setMapStateIdleToSessionStateStopped.AudioAttributesCompatParcelizer
            public final Object AudioAttributesCompatParcelizer(Object obj) {
                return setMapStateIdleToSessionStateStopped.IconCompatParcelizer((SQLiteDatabase) obj);
            }
        });
    }

    static /* synthetic */ List IconCompatParcelizer(SQLiteDatabase sQLiteDatabase) {
        return (List) IconCompatParcelizer(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new AudioAttributesCompatParcelizer() { // from class: o.setQueueNavigator
            @Override // o.setMapStateIdleToSessionStateStopped.AudioAttributesCompatParcelizer
            public final Object AudioAttributesCompatParcelizer(Object obj) {
                return setMapStateIdleToSessionStateStopped.write((Cursor) obj);
            }
        });
    }

    static /* synthetic */ List write(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(ExoMediaDrmProvider.read().write(cursor.getString(1)).read(markSeekOperationFinished.RemoteActionCompatParcelizer(cursor.getInt(2))).RemoteActionCompatParcelizer(read(cursor.getString(3))).RemoteActionCompatParcelizer());
        }
        return arrayList;
    }

    @Override // kotlin.invalidateMediaSessionQueue
    public final int write() {
        final long jIconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer() - this.read.RemoteActionCompatParcelizer();
        return ((Integer) write(new AudioAttributesCompatParcelizer() { // from class: o.setMetadataDeduplicationEnabled
            @Override // o.setMapStateIdleToSessionStateStopped.AudioAttributesCompatParcelizer
            public final Object AudioAttributesCompatParcelizer(Object obj) {
                return this.read.write(jIconCompatParcelizer, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    final /* synthetic */ Integer write(long j, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j)};
        IconCompatParcelizer(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new AudioAttributesCompatParcelizer() { // from class: o.MediaSessionConnectorCommandReceiver
            @Override // o.setMapStateIdleToSessionStateStopped.AudioAttributesCompatParcelizer
            public final Object AudioAttributesCompatParcelizer(Object obj) {
                return this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver((Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    final /* synthetic */ Object MediaBrowserCompatItemReceiver(Cursor cursor) {
        while (cursor.moveToNext()) {
            IconCompatParcelizer(cursor.getInt(0), clearKeyRequestProperty.AudioAttributesCompatParcelizer.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.write.close();
    }

    private static byte[] read(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private List<setCustomActionProviders> read(SQLiteDatabase sQLiteDatabase, final ExoMediaDrmProvider exoMediaDrmProvider, int i) {
        final ArrayList arrayList = new ArrayList();
        Long lAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(sQLiteDatabase, exoMediaDrmProvider);
        if (lAudioAttributesCompatParcelizer == null) {
            return arrayList;
        }
        IconCompatParcelizer(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lAudioAttributesCompatParcelizer.toString()}, null, null, null, String.valueOf(i)), new AudioAttributesCompatParcelizer() { // from class: o.setMediaMetadataProvider
            @Override // o.setMapStateIdleToSessionStateStopped.AudioAttributesCompatParcelizer
            public final Object AudioAttributesCompatParcelizer(Object obj) {
                return this.write.IconCompatParcelizer(arrayList, exoMediaDrmProvider, (Cursor) obj);
            }
        });
        return arrayList;
    }

    final /* synthetic */ Object IconCompatParcelizer(List list, ExoMediaDrmProvider exoMediaDrmProvider, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            ExoMediaDrmOnEventListener.IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer = ExoMediaDrmOnEventListener.AudioAttributesImplApi21Parcelizer().read(cursor.getString(1)).write(cursor.getLong(2)).RemoteActionCompatParcelizer(cursor.getLong(3));
            if (z) {
                iconCompatParcelizerRemoteActionCompatParcelizer.write(new ExoMediaDrmKeyRequest(write(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                iconCompatParcelizerRemoteActionCompatParcelizer.write(new ExoMediaDrmKeyRequest(write(cursor.getString(4)), RemoteActionCompatParcelizer(j)));
            }
            if (!cursor.isNull(6)) {
                iconCompatParcelizerRemoteActionCompatParcelizer.write(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(setCustomActionProviders.RemoteActionCompatParcelizer(j, exoMediaDrmProvider, iconCompatParcelizerRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer()));
        }
        return null;
    }

    private byte[] RemoteActionCompatParcelizer(long j) {
        return (byte[]) IconCompatParcelizer(RatingCompat().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), new AudioAttributesCompatParcelizer() { // from class: o.MediaSessionConnector1
            @Override // o.setMapStateIdleToSessionStateStopped.AudioAttributesCompatParcelizer
            public final Object AudioAttributesCompatParcelizer(Object obj) {
                return setMapStateIdleToSessionStateStopped.IconCompatParcelizer((Cursor) obj);
            }
        });
    }

    static /* synthetic */ byte[] IconCompatParcelizer(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            byte[] bArr2 = (byte[]) arrayList.get(i);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    private static DrmSessionManagerDrmSessionReference write(String str) {
        if (str == null) {
            return RemoteActionCompatParcelizer;
        }
        return DrmSessionManagerDrmSessionReference.IconCompatParcelizer(str);
    }

    private static Map<Long, Set<read>> IconCompatParcelizer(SQLiteDatabase sQLiteDatabase, List<setCustomActionProviders> list) {
        final HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).IconCompatParcelizer());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        IconCompatParcelizer(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", AppMeasurementSdk.ConditionalUserProperty.VALUE}, sb.toString(), null, null, null, null), new AudioAttributesCompatParcelizer() { // from class: o.RepeatModeActionProvider
            @Override // o.setMapStateIdleToSessionStateStopped.AudioAttributesCompatParcelizer
            public final Object AudioAttributesCompatParcelizer(Object obj) {
                return setMapStateIdleToSessionStateStopped.AudioAttributesCompatParcelizer(map, (Cursor) obj);
            }
        });
        return map;
    }

    static /* synthetic */ Object AudioAttributesCompatParcelizer(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            byte b = 0;
            long j = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j), hashSet);
            }
            hashSet.add(new read(cursor.getString(1), cursor.getString(2), b));
        }
        return null;
    }

    private static List<setCustomActionProviders> IconCompatParcelizer(List<setCustomActionProviders> list, Map<Long, Set<read>> map) {
        ListIterator<setCustomActionProviders> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            setCustomActionProviders next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.IconCompatParcelizer()))) {
                ExoMediaDrmOnEventListener.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatItemReceiver = next.write().MediaBrowserCompatItemReceiver();
                for (read readVar : map.get(Long.valueOf(next.IconCompatParcelizer()))) {
                    iconCompatParcelizerMediaBrowserCompatItemReceiver.read(readVar.RemoteActionCompatParcelizer, readVar.write);
                }
                listIterator.set(setCustomActionProviders.RemoteActionCompatParcelizer(next.IconCompatParcelizer(), next.read(), iconCompatParcelizerMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer()));
            }
        }
        return list;
    }

    private <T> T AudioAttributesCompatParcelizer(IconCompatParcelizer<T> iconCompatParcelizer, AudioAttributesCompatParcelizer<Throwable, T> audioAttributesCompatParcelizer) {
        long jIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
        while (true) {
            try {
                return iconCompatParcelizer.write();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.AudioAttributesCompatParcelizer.IconCompatParcelizer() >= ((long) this.read.write()) + jIconCompatParcelizer) {
                    return audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // kotlin.invalidateMediaSessionMetadata
    public final void IconCompatParcelizer(final long j, final clearKeyRequestProperty.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, final String str) {
        write(new AudioAttributesCompatParcelizer() { // from class: o.setPlaybackPreparer
            @Override // o.setMapStateIdleToSessionStateStopped.AudioAttributesCompatParcelizer
            public final Object AudioAttributesCompatParcelizer(Object obj) {
                return setMapStateIdleToSessionStateStopped.write(str, audioAttributesCompatParcelizer, j, (SQLiteDatabase) obj);
            }
        });
    }

    static /* synthetic */ Object write(String str, clearKeyRequestProperty.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, long j, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) IconCompatParcelizer(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(audioAttributesCompatParcelizer.RemoteActionCompatParcelizer())}), new AudioAttributesCompatParcelizer() { // from class: o.sameAs
            @Override // o.setMapStateIdleToSessionStateStopped.AudioAttributesCompatParcelizer
            public final Object AudioAttributesCompatParcelizer(Object obj) {
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            }
        })).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(audioAttributesCompatParcelizer.RemoteActionCompatParcelizer()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        } else {
            StringBuilder sb = new StringBuilder("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ");
            sb.append(j);
            sb.append(" WHERE log_source = ? AND reason = ?");
            sQLiteDatabase.execSQL(sb.toString(), new String[]{str, Integer.toString(audioAttributesCompatParcelizer.RemoteActionCompatParcelizer())});
        }
        return null;
    }

    private static clearKeyRequestProperty.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(int i) {
        if (i == clearKeyRequestProperty.AudioAttributesCompatParcelizer.REASON_UNKNOWN.RemoteActionCompatParcelizer()) {
            return clearKeyRequestProperty.AudioAttributesCompatParcelizer.REASON_UNKNOWN;
        }
        if (i == clearKeyRequestProperty.AudioAttributesCompatParcelizer.MESSAGE_TOO_OLD.RemoteActionCompatParcelizer()) {
            return clearKeyRequestProperty.AudioAttributesCompatParcelizer.MESSAGE_TOO_OLD;
        }
        if (i == clearKeyRequestProperty.AudioAttributesCompatParcelizer.CACHE_FULL.RemoteActionCompatParcelizer()) {
            return clearKeyRequestProperty.AudioAttributesCompatParcelizer.CACHE_FULL;
        }
        if (i == clearKeyRequestProperty.AudioAttributesCompatParcelizer.PAYLOAD_TOO_BIG.RemoteActionCompatParcelizer()) {
            return clearKeyRequestProperty.AudioAttributesCompatParcelizer.PAYLOAD_TOO_BIG;
        }
        if (i == clearKeyRequestProperty.AudioAttributesCompatParcelizer.MAX_RETRIES_REACHED.RemoteActionCompatParcelizer()) {
            return clearKeyRequestProperty.AudioAttributesCompatParcelizer.MAX_RETRIES_REACHED;
        }
        if (i == clearKeyRequestProperty.AudioAttributesCompatParcelizer.INVALID_PAYLOD.RemoteActionCompatParcelizer()) {
            return clearKeyRequestProperty.AudioAttributesCompatParcelizer.INVALID_PAYLOD;
        }
        if (i == clearKeyRequestProperty.AudioAttributesCompatParcelizer.SERVER_ERROR.RemoteActionCompatParcelizer()) {
            return clearKeyRequestProperty.AudioAttributesCompatParcelizer.SERVER_ERROR;
        }
        executeKeyRequest.read("SQLiteEventStore", Integer.valueOf(i));
        return clearKeyRequestProperty.AudioAttributesCompatParcelizer.REASON_UNKNOWN;
    }

    @Override // kotlin.invalidateMediaSessionMetadata
    public final setLogSessionIdOnMediaDrmSession RemoteActionCompatParcelizer() {
        final setLogSessionIdOnMediaDrmSession.read readVar = setLogSessionIdOnMediaDrmSession.read();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (setLogSessionIdOnMediaDrmSession) write(new AudioAttributesCompatParcelizer() { // from class: o.setMediaButtonEventHandler
            @Override // o.setMapStateIdleToSessionStateStopped.AudioAttributesCompatParcelizer
            public final Object AudioAttributesCompatParcelizer(Object obj) {
                return this.AudioAttributesCompatParcelizer.write(str, map, readVar, (SQLiteDatabase) obj);
            }
        });
    }

    final /* synthetic */ setLogSessionIdOnMediaDrmSession write(String str, final Map map, final setLogSessionIdOnMediaDrmSession.read readVar, SQLiteDatabase sQLiteDatabase) {
        return (setLogSessionIdOnMediaDrmSession) IconCompatParcelizer(sQLiteDatabase.rawQuery(str, new String[0]), new AudioAttributesCompatParcelizer() { // from class: o.getSupportedPrepareActions
            @Override // o.setMapStateIdleToSessionStateStopped.AudioAttributesCompatParcelizer
            public final Object AudioAttributesCompatParcelizer(Object obj) {
                return this.RemoteActionCompatParcelizer.write(map, readVar, (Cursor) obj);
            }
        });
    }

    final /* synthetic */ setLogSessionIdOnMediaDrmSession write(Map map, setLogSessionIdOnMediaDrmSession.read readVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            clearKeyRequestProperty.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(clearKeyRequestProperty.IconCompatParcelizer().RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer2).AudioAttributesCompatParcelizer(j).RemoteActionCompatParcelizer());
        }
        AudioAttributesCompatParcelizer(readVar, (Map<String, List<clearKeyRequestProperty>>) map);
        readVar.AudioAttributesCompatParcelizer(AudioAttributesImplBaseParcelizer());
        readVar.write(AudioAttributesCompatParcelizer());
        readVar.IconCompatParcelizer(this.IconCompatParcelizer.get());
        return readVar.read();
    }

    private static void AudioAttributesCompatParcelizer(setLogSessionIdOnMediaDrmSession.read readVar, Map<String, List<clearKeyRequestProperty>> map) {
        for (Map.Entry<String, List<clearKeyRequestProperty>> entry : map.entrySet()) {
            readVar.RemoteActionCompatParcelizer(executeProvisionRequest.read().write(entry.getKey()).AudioAttributesCompatParcelizer(entry.getValue()).write());
        }
    }

    private setKeyRequestProperty AudioAttributesImplBaseParcelizer() {
        final long jIconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
        return (setKeyRequestProperty) write(new AudioAttributesCompatParcelizer() { // from class: o.hasCaptions
            @Override // o.setMapStateIdleToSessionStateStopped.AudioAttributesCompatParcelizer
            public final Object AudioAttributesCompatParcelizer(Object obj) {
                return setMapStateIdleToSessionStateStopped.IconCompatParcelizer(jIconCompatParcelizer, (SQLiteDatabase) obj);
            }
        });
    }

    static /* synthetic */ setKeyRequestProperty IconCompatParcelizer(final long j, SQLiteDatabase sQLiteDatabase) {
        return (setKeyRequestProperty) IconCompatParcelizer(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new AudioAttributesCompatParcelizer() { // from class: o.unregisterCustomCommandReceiver
            @Override // o.setMapStateIdleToSessionStateStopped.AudioAttributesCompatParcelizer
            public final Object AudioAttributesCompatParcelizer(Object obj) {
                return setMapStateIdleToSessionStateStopped.RemoteActionCompatParcelizer(j, (Cursor) obj);
            }
        });
    }

    static /* synthetic */ setKeyRequestProperty RemoteActionCompatParcelizer(long j, Cursor cursor) {
        cursor.moveToNext();
        return setKeyRequestProperty.AudioAttributesCompatParcelizer().read(cursor.getLong(0)).IconCompatParcelizer(j).AudioAttributesCompatParcelizer();
    }

    private clearAllKeyRequestProperties AudioAttributesCompatParcelizer() {
        return clearAllKeyRequestProperties.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(KeysExpiredException.read().AudioAttributesCompatParcelizer(AudioAttributesImplApi21Parcelizer()).write(registerCustomCommandReceiver.AudioAttributesCompatParcelizer.IconCompatParcelizer()).read()).write();
    }

    @Override // kotlin.invalidateMediaSessionMetadata
    public final void IconCompatParcelizer() {
        write(new AudioAttributesCompatParcelizer() { // from class: o.getActiveQueueItemId
            @Override // o.setMapStateIdleToSessionStateStopped.AudioAttributesCompatParcelizer
            public final Object AudioAttributesCompatParcelizer(Object obj) {
                return this.RemoteActionCompatParcelizer.write((SQLiteDatabase) obj);
            }
        });
    }

    final /* synthetic */ Object write(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        StringBuilder sb = new StringBuilder("UPDATE global_log_event_state SET last_metrics_upload_ms=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer());
        sQLiteDatabase.compileStatement(sb.toString()).execute();
        return null;
    }

    private void AudioAttributesCompatParcelizer(final SQLiteDatabase sQLiteDatabase) {
        AudioAttributesCompatParcelizer(new IconCompatParcelizer() { // from class: o.getCustomAction
            @Override // o.setMapStateIdleToSessionStateStopped.IconCompatParcelizer
            public final Object write() {
                return setMapStateIdleToSessionStateStopped.read(sQLiteDatabase);
            }
        }, new AudioAttributesCompatParcelizer() { // from class: o.MediaSessionConnectorComponentListener
            @Override // o.setMapStateIdleToSessionStateStopped.AudioAttributesCompatParcelizer
            public final Object AudioAttributesCompatParcelizer(Object obj) {
                return setMapStateIdleToSessionStateStopped.write((Throwable) obj);
            }
        });
    }

    static /* synthetic */ Object read(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    static /* synthetic */ Object write(Throwable th) {
        throw new TimelineQueueNavigator("Timed out while trying to acquire the lock.", th);
    }

    @Override // kotlin.getSeekMap
    public final <T> T read(getSeekMap.RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer) {
        SQLiteDatabase sQLiteDatabaseRatingCompat = RatingCompat();
        AudioAttributesCompatParcelizer(sQLiteDatabaseRatingCompat);
        try {
            T tRemoteActionCompatParcelizer = remoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            sQLiteDatabaseRatingCompat.setTransactionSuccessful();
            return tRemoteActionCompatParcelizer;
        } finally {
            sQLiteDatabaseRatingCompat.endTransaction();
        }
    }

    private <T> T write(AudioAttributesCompatParcelizer<SQLiteDatabase, T> audioAttributesCompatParcelizer) {
        SQLiteDatabase sQLiteDatabaseRatingCompat = RatingCompat();
        sQLiteDatabaseRatingCompat.beginTransaction();
        try {
            T tAudioAttributesCompatParcelizer = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(sQLiteDatabaseRatingCompat);
            sQLiteDatabaseRatingCompat.setTransactionSuccessful();
            return tAudioAttributesCompatParcelizer;
        } finally {
            sQLiteDatabaseRatingCompat.endTransaction();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static class read {
        final String RemoteActionCompatParcelizer;
        final String write;

        /* synthetic */ read(String str, String str2, byte b) {
            this(str, str2);
        }

        private read(String str, String str2) {
            this.RemoteActionCompatParcelizer = str;
            this.write = str2;
        }
    }

    private boolean AudioAttributesImplApi26Parcelizer() {
        return MediaBrowserCompatItemReceiver() * MediaBrowserCompatCustomActionResultReceiver() >= this.read.IconCompatParcelizer();
    }

    private long AudioAttributesImplApi21Parcelizer() {
        return MediaBrowserCompatItemReceiver() * MediaBrowserCompatCustomActionResultReceiver();
    }

    private long MediaBrowserCompatCustomActionResultReceiver() {
        return RatingCompat().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private long MediaBrowserCompatItemReceiver() {
        return RatingCompat().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private static <T> T IconCompatParcelizer(Cursor cursor, AudioAttributesCompatParcelizer<Cursor, T> audioAttributesCompatParcelizer) {
        try {
            return audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(cursor);
        } finally {
            cursor.close();
        }
    }
}
