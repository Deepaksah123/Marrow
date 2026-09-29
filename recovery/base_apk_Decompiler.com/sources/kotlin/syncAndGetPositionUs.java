package kotlin;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes2.dex */
public final class syncAndGetPositionUs {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int read(WorkDatabase workDatabase, String str) {
        Long l = workDatabase.onPlay().read(str);
        int iLongValue = l != null ? (int) l.longValue() : 0;
        read(workDatabase, str, iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0);
        return iLongValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(WorkDatabase workDatabase, String str, int i) {
        workDatabase.onPlay().IconCompatParcelizer(new msToUs(str, Long.valueOf(i)));
    }

    public static final void RemoteActionCompatParcelizer(Context context, setDrawSliceText setdrawslicetext) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            setdrawslicetext.AudioAttributesCompatParcelizer();
            try {
                setdrawslicetext.IconCompatParcelizer("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                setdrawslicetext.IconCompatParcelizer("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                sharedPreferences.edit().clear().apply();
                setdrawslicetext.MediaBrowserCompatItemReceiver();
            } finally {
                setdrawslicetext.write();
            }
        }
    }
}
