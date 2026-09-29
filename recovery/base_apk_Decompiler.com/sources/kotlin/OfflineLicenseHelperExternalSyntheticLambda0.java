package kotlin;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes5.dex */
public final class OfflineLicenseHelperExternalSyntheticLambda0 implements getMediaSessionPlaybackState {
    private final Context AudioAttributesCompatParcelizer;
    private final invalidateMediaSessionQueue IconCompatParcelizer;
    private final renewLicense RemoteActionCompatParcelizer;

    public OfflineLicenseHelperExternalSyntheticLambda0(Context context, invalidateMediaSessionQueue invalidatemediasessionqueue, renewLicense renewlicense) {
        this.AudioAttributesCompatParcelizer = context;
        this.IconCompatParcelizer = invalidatemediasessionqueue;
        this.RemoteActionCompatParcelizer = renewlicense;
    }

    private int RemoteActionCompatParcelizer(ExoMediaDrmProvider exoMediaDrmProvider) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.AudioAttributesCompatParcelizer.getPackageName().getBytes(Charset.forName(CharsetNames.UTF_8)));
        adler32.update(exoMediaDrmProvider.RemoteActionCompatParcelizer().getBytes(Charset.forName(CharsetNames.UTF_8)));
        adler32.update(ByteBuffer.allocate(4).putInt(markSeekOperationFinished.write(exoMediaDrmProvider.AudioAttributesCompatParcelizer())).array());
        if (exoMediaDrmProvider.write() != null) {
            adler32.update(exoMediaDrmProvider.write());
        }
        return (int) adler32.getValue();
    }

    private static boolean read(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i3 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i) {
                return i3 >= i2;
            }
        }
        return false;
    }

    @Override // kotlin.getMediaSessionPlaybackState
    public final void RemoteActionCompatParcelizer(ExoMediaDrmProvider exoMediaDrmProvider, int i) {
        AudioAttributesCompatParcelizer(exoMediaDrmProvider, i, false);
    }

    @Override // kotlin.getMediaSessionPlaybackState
    public final void AudioAttributesCompatParcelizer(ExoMediaDrmProvider exoMediaDrmProvider, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.AudioAttributesCompatParcelizer, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.AudioAttributesCompatParcelizer.getSystemService("jobscheduler");
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(exoMediaDrmProvider);
        if (!z && read(jobScheduler, iRemoteActionCompatParcelizer, i)) {
            executeKeyRequest.read("JobInfoScheduler", exoMediaDrmProvider);
            return;
        }
        long j = this.IconCompatParcelizer.read(exoMediaDrmProvider);
        JobInfo.Builder builderAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(new JobInfo.Builder(iRemoteActionCompatParcelizer, componentName), exoMediaDrmProvider.AudioAttributesCompatParcelizer(), j, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", exoMediaDrmProvider.RemoteActionCompatParcelizer());
        persistableBundle.putInt("priority", markSeekOperationFinished.write(exoMediaDrmProvider.AudioAttributesCompatParcelizer()));
        if (exoMediaDrmProvider.write() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(exoMediaDrmProvider.write(), 0));
        }
        builderAudioAttributesCompatParcelizer.setExtras(persistableBundle);
        new Object[]{exoMediaDrmProvider, Integer.valueOf(iRemoteActionCompatParcelizer), Long.valueOf(this.RemoteActionCompatParcelizer.read(exoMediaDrmProvider.AudioAttributesCompatParcelizer(), j, i)), Long.valueOf(j), Integer.valueOf(i)};
        executeKeyRequest.write("JobInfoScheduler");
        jobScheduler.schedule(builderAudioAttributesCompatParcelizer.build());
    }
}
