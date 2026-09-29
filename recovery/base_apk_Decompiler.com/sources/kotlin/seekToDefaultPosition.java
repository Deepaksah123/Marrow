package kotlin;

import android.app.job.JobScheduler;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/seekToDefaultPosition;", "", "<init>", "()V", "Landroid/app/job/JobScheduler;", "p0", "AudioAttributesCompatParcelizer", "(Landroid/app/job/JobScheduler;)Landroid/app/job/JobScheduler;"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class seekToDefaultPosition {
    public static final seekToDefaultPosition INSTANCE = new seekToDefaultPosition();

    private seekToDefaultPosition() {
    }

    public static JobScheduler AudioAttributesCompatParcelizer(JobScheduler p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        JobScheduler jobSchedulerForNamespace = p0.forNamespace("androidx.work.systemjobscheduler");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jobSchedulerForNamespace, "");
        return jobSchedulerForNamespace;
    }
}
