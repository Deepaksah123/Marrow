package kotlin;

import android.content.SharedPreferences;
import java.util.Date;
import kotlin.ChapterFrame1;

/* JADX INFO: loaded from: classes3.dex */
public final class decodeUrlLinkFrame {
    private final SharedPreferences read;
    static final Date RemoteActionCompatParcelizer = new Date(-1);
    private static Date AudioAttributesCompatParcelizer = new Date(-1);
    private final Object write = new Object();
    private final Object IconCompatParcelizer = new Object();
    private final Object MediaBrowserCompatItemReceiver = new Object();

    public decodeUrlLinkFrame(SharedPreferences sharedPreferences) {
        this.read = sharedPreferences;
    }

    public final long read() {
        return this.read.getLong("fetch_timeout_in_seconds", 60L);
    }

    public final long MediaBrowserCompatCustomActionResultReceiver() {
        return this.read.getLong("minimum_fetch_interval_in_seconds", decodeTextInformationFrame.AudioAttributesCompatParcelizer);
    }

    final Date RemoteActionCompatParcelizer() {
        return new Date(this.read.getLong("last_fetch_time_in_millis", -1L));
    }

    final String IconCompatParcelizer() {
        return this.read.getString("last_fetch_etag", null);
    }

    final long MediaBrowserCompatItemReceiver() {
        return this.read.getLong("last_template_version", 0L);
    }

    public final getSubFrame write() {
        InternalFrame1 internalFrame1IconCompatParcelizer;
        synchronized (this.write) {
            long j = this.read.getLong("last_fetch_time_in_millis", -1L);
            int i = this.read.getInt("last_fetch_status", 0);
            internalFrame1IconCompatParcelizer = InternalFrame1.write().RemoteActionCompatParcelizer(i).IconCompatParcelizer(j).write(new ChapterFrame1.IconCompatParcelizer().AudioAttributesCompatParcelizer(this.read.getLong("fetch_timeout_in_seconds", 60L)).RemoteActionCompatParcelizer(this.read.getLong("minimum_fetch_interval_in_seconds", decodeTextInformationFrame.AudioAttributesCompatParcelizer)).IconCompatParcelizer()).IconCompatParcelizer();
        }
        return internalFrame1IconCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(ChapterFrame1 chapterFrame1) {
        synchronized (this.write) {
            this.read.edit().putLong("fetch_timeout_in_seconds", chapterFrame1.write()).putLong("minimum_fetch_interval_in_seconds", chapterFrame1.read()).commit();
        }
    }

    final void RemoteActionCompatParcelizer(Date date) {
        synchronized (this.write) {
            this.read.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    final void MediaMetadataCompat() {
        synchronized (this.write) {
            this.read.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    final void MediaDescriptionCompat() {
        synchronized (this.write) {
            this.read.edit().putInt("last_fetch_status", 2).apply();
        }
    }

    final void write(String str) {
        synchronized (this.write) {
            this.read.edit().putString("last_fetch_etag", str).apply();
        }
    }

    final void read(long j) {
        synchronized (this.write) {
            this.read.edit().putLong("last_template_version", j).apply();
        }
    }

    final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        synchronized (this.IconCompatParcelizer) {
            remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(this.read.getInt("num_failed_fetches", 0), new Date(this.read.getLong("backoff_end_time_in_millis", -1L)));
        }
        return remoteActionCompatParcelizer;
    }

    final void read(int i, Date date) {
        synchronized (this.IconCompatParcelizer) {
            this.read.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    final void AudioAttributesImplBaseParcelizer() {
        read(0, AudioAttributesCompatParcelizer);
    }

    static class RemoteActionCompatParcelizer {
        private Date AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;

        RemoteActionCompatParcelizer(int i, Date date) {
            this.IconCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = date;
        }

        final int AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        final Date RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    final IconCompatParcelizer AudioAttributesImplApi26Parcelizer() {
        IconCompatParcelizer iconCompatParcelizer;
        synchronized (this.MediaBrowserCompatItemReceiver) {
            iconCompatParcelizer = new IconCompatParcelizer(this.read.getInt("num_failed_realtime_streams", 0), new Date(this.read.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return iconCompatParcelizer;
    }

    final void RemoteActionCompatParcelizer(int i, Date date) {
        synchronized (this.MediaBrowserCompatItemReceiver) {
            this.read.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    final void AudioAttributesImplApi21Parcelizer() {
        RemoteActionCompatParcelizer(0, AudioAttributesCompatParcelizer);
    }

    static class IconCompatParcelizer {
        private Date IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;

        IconCompatParcelizer(int i, Date date) {
            this.RemoteActionCompatParcelizer = i;
            this.IconCompatParcelizer = date;
        }

        final int RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        final Date IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }
}
