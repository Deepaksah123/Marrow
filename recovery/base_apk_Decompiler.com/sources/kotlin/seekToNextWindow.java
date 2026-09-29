package kotlin;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.getChildPeriodUidFromConcatenatedUid;

/* JADX INFO: loaded from: classes2.dex */
public final class seekToNextWindow implements willPauseWhenDucked {
    private final Context AudioAttributesCompatParcelizer;
    private final seekToPreviousWindow IconCompatParcelizer;
    private final JobScheduler RemoteActionCompatParcelizer;
    private final WorkDatabase read;
    private final b write;

    @Override // kotlin.willPauseWhenDucked
    public final boolean IconCompatParcelizer() {
        return true;
    }

    static {
        n.write("SystemJobScheduler");
    }

    public seekToNextWindow(Context context, WorkDatabase workDatabase, b bVar) {
        this(context, workDatabase, bVar, seekToPrevious.write(context), new seekToPreviousWindow(context, bVar.getAudioAttributesCompatParcelizer(), bVar.getOnAddQueueItem()));
    }

    private seekToNextWindow(Context context, WorkDatabase workDatabase, b bVar, JobScheduler jobScheduler, seekToPreviousWindow seektopreviouswindow) {
        this.AudioAttributesCompatParcelizer = context;
        this.RemoteActionCompatParcelizer = jobScheduler;
        this.IconCompatParcelizer = seektopreviouswindow;
        this.read = workDatabase;
        this.write = bVar;
    }

    @Override // kotlin.willPauseWhenDucked
    public final void read(CVideoChangeFrameRateStrategy... cVideoChangeFrameRateStrategyArr) {
        DefaultMediaClockPlaybackParametersListener defaultMediaClockPlaybackParametersListener = new DefaultMediaClockPlaybackParametersListener(this.read);
        for (CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy : cVideoChangeFrameRateStrategyArr) {
            this.read.read();
            try {
                CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategyAudioAttributesCompatParcelizer = this.read.onMediaButtonEvent().AudioAttributesCompatParcelizer(cVideoChangeFrameRateStrategy.AudioAttributesImplApi21Parcelizer);
                if (cVideoChangeFrameRateStrategyAudioAttributesCompatParcelizer == null) {
                    n.write();
                    String str = cVideoChangeFrameRateStrategy.AudioAttributesImplApi21Parcelizer;
                    this.read.onCustomAction();
                } else if (cVideoChangeFrameRateStrategyAudioAttributesCompatParcelizer.onCommand != getChildPeriodUidFromConcatenatedUid.write.AudioAttributesCompatParcelizer) {
                    n.write();
                    String str2 = cVideoChangeFrameRateStrategy.AudioAttributesImplApi21Parcelizer;
                    this.read.onCustomAction();
                } else {
                    CProjection cProjection = onReleased.read(cVideoChangeFrameRateStrategy);
                    CBufferFlags cBufferFlagsWrite = this.read.onPause().write(cProjection);
                    int iRemoteActionCompatParcelizer = cBufferFlagsWrite != null ? cBufferFlagsWrite.read : defaultMediaClockPlaybackParametersListener.RemoteActionCompatParcelizer(this.write.getMediaMetadataCompat(), this.write.getOnCommand());
                    if (cBufferFlagsWrite == null) {
                        this.read.onPause().RemoteActionCompatParcelizer(CPcmEncoding.IconCompatParcelizer(cProjection, iRemoteActionCompatParcelizer));
                    }
                    AudioAttributesCompatParcelizer(cVideoChangeFrameRateStrategy, iRemoteActionCompatParcelizer);
                    this.read.onCustomAction();
                }
                this.read.AudioAttributesImplApi21Parcelizer();
            } catch (Throwable th) {
                this.read.AudioAttributesImplApi21Parcelizer();
                throw th;
            }
        }
    }

    private void AudioAttributesCompatParcelizer(CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy, int i) {
        JobInfo jobInfoAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(cVideoChangeFrameRateStrategy, i);
        n.write();
        String str = cVideoChangeFrameRateStrategy.AudioAttributesImplApi21Parcelizer;
        try {
            if (this.RemoteActionCompatParcelizer.schedule(jobInfoAudioAttributesCompatParcelizer) == 0) {
                n.write();
                String str2 = cVideoChangeFrameRateStrategy.AudioAttributesImplApi21Parcelizer;
                if (cVideoChangeFrameRateStrategy.write && cVideoChangeFrameRateStrategy.MediaDescriptionCompat == qaa.write) {
                    cVideoChangeFrameRateStrategy.write = false;
                    new Object[]{cVideoChangeFrameRateStrategy.AudioAttributesImplApi21Parcelizer};
                    n.write();
                    AudioAttributesCompatParcelizer(cVideoChangeFrameRateStrategy, i);
                }
            }
        } catch (IllegalStateException e) {
            String strRemoteActionCompatParcelizer = seekToPrevious.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this.read, this.write);
            n.write();
            IllegalStateException illegalStateException = new IllegalStateException(strRemoteActionCompatParcelizer, e);
            wrapAsJsonMappingException<Throwable> wrapasjsonmappingexceptionRatingCompat = this.write.RatingCompat();
            if (wrapasjsonmappingexceptionRatingCompat != null) {
                wrapasjsonmappingexceptionRatingCompat.AudioAttributesCompatParcelizer(illegalStateException);
                return;
            }
            throw illegalStateException;
        } catch (Throwable unused) {
            n.write();
            Objects.toString(cVideoChangeFrameRateStrategy);
        }
    }

    @Override // kotlin.willPauseWhenDucked
    public final void AudioAttributesCompatParcelizer(String str) {
        List<Integer> listIconCompatParcelizer = IconCompatParcelizer(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, str);
        if (listIconCompatParcelizer == null || listIconCompatParcelizer.isEmpty()) {
            return;
        }
        Iterator<Integer> it = listIconCompatParcelizer.iterator();
        while (it.hasNext()) {
            AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, it.next().intValue());
        }
        this.read.onPause().IconCompatParcelizer(str);
    }

    private static void AudioAttributesCompatParcelizer(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable unused) {
            n.write();
            Locale.getDefault();
            new Object[]{Integer.valueOf(i)};
        }
    }

    public static void RemoteActionCompatParcelizer(Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            seekToPrevious.write(context).cancelAll();
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> list = read(context, jobScheduler);
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<JobInfo> it = list.iterator();
        while (it.hasNext()) {
            AudioAttributesCompatParcelizer(jobScheduler, it.next().getId());
        }
    }

    public static boolean AudioAttributesCompatParcelizer(Context context, WorkDatabase workDatabase) {
        JobScheduler jobSchedulerWrite = seekToPrevious.write(context);
        List<JobInfo> list = read(context, jobSchedulerWrite);
        List<String> listRemoteActionCompatParcelizer = workDatabase.onPause().RemoteActionCompatParcelizer();
        boolean z = false;
        HashSet hashSet = new HashSet(list != null ? list.size() : 0);
        if (list != null && !list.isEmpty()) {
            for (JobInfo jobInfo : list) {
                CProjection cProjectionWrite = write(jobInfo);
                if (cProjectionWrite != null) {
                    hashSet.add(cProjectionWrite.AudioAttributesCompatParcelizer());
                } else {
                    AudioAttributesCompatParcelizer(jobSchedulerWrite, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = listRemoteActionCompatParcelizer.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains(it.next())) {
                n.write();
                z = true;
                break;
            }
        }
        if (!z) {
            return z;
        }
        workDatabase.read();
        try {
            CVolumeFlags cVolumeFlagsOnMediaButtonEvent = workDatabase.onMediaButtonEvent();
            Iterator<String> it2 = listRemoteActionCompatParcelizer.iterator();
            while (it2.hasNext()) {
                cVolumeFlagsOnMediaButtonEvent.AudioAttributesCompatParcelizer(it2.next(), -1L);
            }
            workDatabase.onCustomAction();
            return z;
        } finally {
            workDatabase.AudioAttributesImplApi21Parcelizer();
        }
    }

    static List<JobInfo> read(Context context, JobScheduler jobScheduler) {
        List<JobInfo> listWrite = seekToPrevious.write(jobScheduler);
        if (listWrite == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listWrite.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : listWrite) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static List<Integer> IconCompatParcelizer(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> list = read(context, jobScheduler);
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : list) {
            CProjection cProjectionWrite = write(jobInfo);
            if (cProjectionWrite != null && str.equals(cProjectionWrite.AudioAttributesCompatParcelizer())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static CProjection write(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new CProjection(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }
}
