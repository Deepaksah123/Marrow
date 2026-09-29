package kotlin;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class TimelineQueueEditor extends SQLiteOpenHelper {
    private static final String AudioAttributesCompatParcelizer;
    private static final List<IconCompatParcelizer> IconCompatParcelizer;
    static int write;
    private final int RemoteActionCompatParcelizer;
    private boolean read;

    public interface IconCompatParcelizer {
        void write(SQLiteDatabase sQLiteDatabase);
    }

    static {
        StringBuilder sb = new StringBuilder("INSERT INTO global_log_event_state VALUES (");
        sb.append(System.currentTimeMillis());
        sb.append(")");
        AudioAttributesCompatParcelizer = sb.toString();
        write = 5;
        IconCompatParcelizer = Arrays.asList(new IconCompatParcelizer() { // from class: o.TimelineQueueEditorMediaDescriptionConverter
            @Override // o.TimelineQueueEditor.IconCompatParcelizer
            public final void write(SQLiteDatabase sQLiteDatabase) {
                TimelineQueueEditor.write(sQLiteDatabase);
            }
        }, new IconCompatParcelizer() { // from class: o.MediaSessionConnectorRatingCallback
            @Override // o.TimelineQueueEditor.IconCompatParcelizer
            public final void write(SQLiteDatabase sQLiteDatabase) {
                TimelineQueueEditor.AudioAttributesCompatParcelizer(sQLiteDatabase);
            }
        }, new IconCompatParcelizer() { // from class: o.TimelineQueueEditorQueueDataAdapter
            @Override // o.TimelineQueueEditor.IconCompatParcelizer
            public final void write(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        }, new IconCompatParcelizer() { // from class: o.TimelineQueueEditorMediaDescriptionEqualityChecker
            @Override // o.TimelineQueueEditor.IconCompatParcelizer
            public final void write(SQLiteDatabase sQLiteDatabase) {
                TimelineQueueEditor.read(sQLiteDatabase);
            }
        }, new IconCompatParcelizer() { // from class: o.TimelineQueueEditorMediaIdEqualityChecker
            @Override // o.TimelineQueueEditor.IconCompatParcelizer
            public final void write(SQLiteDatabase sQLiteDatabase) {
                TimelineQueueEditor.RemoteActionCompatParcelizer(sQLiteDatabase);
            }
        });
    }

    static /* synthetic */ void write(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    static /* synthetic */ void AudioAttributesCompatParcelizer(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    static /* synthetic */ void read(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    static /* synthetic */ void RemoteActionCompatParcelizer(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(AudioAttributesCompatParcelizer);
    }

    @setSdkPayload
    TimelineQueueEditor(Context context, @setGateway(IconCompatParcelizer = "SQLITE_DB_NAME") String str, @setGateway(IconCompatParcelizer = "SCHEMA_VERSION") int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.read = false;
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.read = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    private void MediaBrowserCompatCustomActionResultReceiver(SQLiteDatabase sQLiteDatabase) {
        if (this.read) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        AudioAttributesCompatParcelizer(sQLiteDatabase, this.RemoteActionCompatParcelizer);
    }

    private void AudioAttributesCompatParcelizer(SQLiteDatabase sQLiteDatabase, int i) {
        MediaBrowserCompatCustomActionResultReceiver(sQLiteDatabase);
        AudioAttributesCompatParcelizer(sQLiteDatabase, 0, i);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        MediaBrowserCompatCustomActionResultReceiver(sQLiteDatabase);
        AudioAttributesCompatParcelizer(sQLiteDatabase, i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        AudioAttributesCompatParcelizer(sQLiteDatabase, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        MediaBrowserCompatCustomActionResultReceiver(sQLiteDatabase);
    }

    private static void AudioAttributesCompatParcelizer(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<IconCompatParcelizer> list = IconCompatParcelizer;
        if (i2 <= list.size()) {
            while (i < i2) {
                IconCompatParcelizer.get(i).write(sQLiteDatabase);
                i++;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Migration from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append(" was requested, but cannot be performed. Only ");
        sb.append(list.size());
        sb.append(" migrations are provided");
        throw new IllegalArgumentException(sb.toString());
    }
}
