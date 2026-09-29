package kotlin;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class seekToPrevious {
    static {
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(n.write("SystemJobScheduler"), "");
    }

    public static final JobScheduler write(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        Object systemService = context.getSystemService("jobscheduler");
        toMagicModuleMetaRepoModel.read(systemService, "");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        if (Build.VERSION.SDK_INT < 34) {
            return jobScheduler;
        }
        seekToDefaultPosition seektodefaultposition = seekToDefaultPosition.INSTANCE;
        return seekToDefaultPosition.AudioAttributesCompatParcelizer(jobScheduler);
    }

    public static final List<JobInfo> write(JobScheduler jobScheduler) {
        toMagicModuleMetaRepoModel.write(jobScheduler, "");
        try {
            return seekTo.INSTANCE.AudioAttributesCompatParcelizer(jobScheduler);
        } catch (Throwable unused) {
            n.write();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String RemoteActionCompatParcelizer(android.content.Context r10, androidx.work.impl.WorkDatabase r11, kotlin.b r12) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.seekToPrevious.RemoteActionCompatParcelizer(android.content.Context, androidx.work.impl.WorkDatabase, o.b):java.lang.String");
    }
}
