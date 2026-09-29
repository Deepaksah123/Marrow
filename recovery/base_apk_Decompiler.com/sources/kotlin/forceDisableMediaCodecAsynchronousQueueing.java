package kotlin;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes2.dex */
public final class forceDisableMediaCodecAsynchronousQueueing {
    private final WorkDatabase AudioAttributesCompatParcelizer;

    public forceDisableMediaCodecAsynchronousQueueing(WorkDatabase workDatabase) {
        this.AudioAttributesCompatParcelizer = workDatabase;
    }

    public final void read(long j) {
        this.AudioAttributesCompatParcelizer.onPlay().IconCompatParcelizer(new msToUs("last_cancel_all_time_ms", Long.valueOf(j)));
    }

    public final boolean read() {
        Long l = this.AudioAttributesCompatParcelizer.onPlay().read("reschedule_needed");
        return l != null && l.longValue() == 1;
    }

    public final void AudioAttributesCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.onPlay().IconCompatParcelizer(new msToUs("reschedule_needed", false));
    }

    public final void IconCompatParcelizer(long j) {
        this.AudioAttributesCompatParcelizer.onPlay().IconCompatParcelizer(new msToUs("last_force_stop_ms", Long.valueOf(j)));
    }

    public final long write() {
        Long l = this.AudioAttributesCompatParcelizer.onPlay().read("last_force_stop_ms");
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static void write(Context context, setDrawSliceText setdrawslicetext) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            setdrawslicetext.AudioAttributesCompatParcelizer();
            try {
                setdrawslicetext.IconCompatParcelizer("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                setdrawslicetext.IconCompatParcelizer("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j2)});
                sharedPreferences.edit().clear().apply();
                setdrawslicetext.MediaBrowserCompatItemReceiver();
            } finally {
                setdrawslicetext.write();
            }
        }
    }
}
