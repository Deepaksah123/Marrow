package kotlin;

import android.app.job.JobInfo;
import android.net.NetworkRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class setMediaItem {
    public static final void read(JobInfo.Builder builder, NetworkRequest networkRequest) {
        toMagicModuleMetaRepoModel.write(builder, "");
        builder.setRequiredNetwork(networkRequest);
    }
}
