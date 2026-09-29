package kotlin;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/seekTo;", "", "<init>", "()V", "Landroid/app/job/JobScheduler;", "p0", "", "Landroid/app/job/JobInfo;", "AudioAttributesCompatParcelizer", "(Landroid/app/job/JobScheduler;)Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class seekTo {
    public static final seekTo INSTANCE = new seekTo();

    private seekTo() {
    }

    public final List<JobInfo> AudioAttributesCompatParcelizer(JobScheduler p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        List<JobInfo> allPendingJobs = p0.getAllPendingJobs();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(allPendingJobs, "");
        return allPendingJobs;
    }
}
