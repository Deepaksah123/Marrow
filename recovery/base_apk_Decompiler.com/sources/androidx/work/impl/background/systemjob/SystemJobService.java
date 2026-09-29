package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.AudioBecomingNoisyManagerAudioBecomingNoisyReceiver;
import kotlin.CProjection;
import kotlin.getCurrentWindowIndex;
import kotlin.handlePlatformAudioFocusChange;
import kotlin.hasPrevious;
import kotlin.hasPreviousMediaItem;
import kotlin.lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener;
import kotlin.n;
import kotlin.setAudioAttributes;

/* JADX INFO: loaded from: classes2.dex */
public class SystemJobService extends JobService implements AudioBecomingNoisyManagerAudioBecomingNoisyReceiver {
    private getCurrentWindowIndex IconCompatParcelizer;
    private final Map<CProjection, JobParameters> RemoteActionCompatParcelizer = new HashMap();
    private final setAudioAttributes read = setAudioAttributes.IconCompatParcelizer();
    private hasPrevious write;

    static int read(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return i;
            default:
                return -512;
        }
    }

    static {
        n.write("SystemJobService");
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            hasPrevious hasprevious = hasPrevious.read(getApplicationContext());
            this.write = hasprevious;
            handlePlatformAudioFocusChange handleplatformaudiofocuschangeIconCompatParcelizer = hasprevious.IconCompatParcelizer();
            this.IconCompatParcelizer = new hasPreviousMediaItem(handleplatformaudiofocuschangeIconCompatParcelizer, this.write.MediaBrowserCompatCustomActionResultReceiver());
            handleplatformaudiofocuschangeIconCompatParcelizer.IconCompatParcelizer(this);
        } catch (IllegalStateException e) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
            n.write();
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        hasPrevious hasprevious = this.write;
        if (hasprevious != null) {
            hasprevious.IconCompatParcelizer().read(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        IconCompatParcelizer("onStartJob");
        if (this.write == null) {
            n.write();
            jobFinished(jobParameters, true);
            return false;
        }
        CProjection cProjectionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(jobParameters);
        if (cProjectionRemoteActionCompatParcelizer == null) {
            n.write();
            return false;
        }
        if (this.RemoteActionCompatParcelizer.containsKey(cProjectionRemoteActionCompatParcelizer)) {
            n.write();
            Objects.toString(cProjectionRemoteActionCompatParcelizer);
            return false;
        }
        n.write();
        Objects.toString(cProjectionRemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer.put(cProjectionRemoteActionCompatParcelizer, jobParameters);
        WorkerParameters.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new WorkerParameters.RemoteActionCompatParcelizer();
        if (RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(jobParameters) != null) {
            remoteActionCompatParcelizer.AudioAttributesCompatParcelizer = Arrays.asList(RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(jobParameters));
        }
        if (RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(jobParameters) != null) {
            remoteActionCompatParcelizer.RemoteActionCompatParcelizer = Arrays.asList(RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(jobParameters));
        }
        remoteActionCompatParcelizer.write = write.IconCompatParcelizer(jobParameters);
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this.read.IconCompatParcelizer(cProjectionRemoteActionCompatParcelizer), remoteActionCompatParcelizer);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        IconCompatParcelizer("onStopJob");
        if (this.write == null) {
            n.write();
            return true;
        }
        CProjection cProjectionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(jobParameters);
        if (cProjectionRemoteActionCompatParcelizer == null) {
            n.write();
            return false;
        }
        n.write();
        Objects.toString(cProjectionRemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer.remove(cProjectionRemoteActionCompatParcelizer);
        lambdaonAudioFocusChange0comgoogleandroidexoplayer2AudioFocusManagerAudioFocusListener lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistenerRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer(cProjectionRemoteActionCompatParcelizer);
        if (lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistenerRemoteActionCompatParcelizer != null) {
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(lambdaonaudiofocuschange0comgoogleandroidexoplayer2audiofocusmanageraudiofocuslistenerRemoteActionCompatParcelizer, Build.VERSION.SDK_INT >= 31 ? read.RemoteActionCompatParcelizer(jobParameters) : -512);
        }
        return !this.write.IconCompatParcelizer().AudioAttributesCompatParcelizer(cProjectionRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
    }

    @Override // kotlin.AudioBecomingNoisyManagerAudioBecomingNoisyReceiver
    public final void RemoteActionCompatParcelizer(CProjection cProjection, boolean z) {
        IconCompatParcelizer("onExecuted");
        n.write();
        cProjection.AudioAttributesCompatParcelizer();
        JobParameters jobParametersRemove = this.RemoteActionCompatParcelizer.remove(cProjection);
        this.read.RemoteActionCompatParcelizer(cProjection);
        if (jobParametersRemove != null) {
            jobFinished(jobParametersRemove, z);
        }
    }

    private static CProjection RemoteActionCompatParcelizer(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new CProjection(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    static class RemoteActionCompatParcelizer {
        static Uri[] AudioAttributesCompatParcelizer(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }

        static String[] RemoteActionCompatParcelizer(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }
    }

    static class write {
        static Network IconCompatParcelizer(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    static class read {
        static int RemoteActionCompatParcelizer(JobParameters jobParameters) {
            return SystemJobService.read(jobParameters.getStopReason());
        }
    }

    private static void IconCompatParcelizer(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot invoke ");
        sb.append(str);
        sb.append(" on a background thread");
        throw new IllegalStateException(sb.toString());
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
