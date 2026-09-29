package kotlin;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.Objects;
import kotlin.e;

/* JADX INFO: loaded from: classes2.dex */
final class seekToPreviousWindow {
    private final boolean AudioAttributesCompatParcelizer;
    private final ComponentName IconCompatParcelizer;
    private final setInstallerPackageName read;

    static {
        n.write("SystemJobInfoConverter");
    }

    seekToPreviousWindow(Context context, setInstallerPackageName setinstallerpackagename, boolean z) {
        this.read = setinstallerpackagename;
        this.IconCompatParcelizer = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.AudioAttributesCompatParcelizer = z;
    }

    final JobInfo AudioAttributesCompatParcelizer(CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy, int i) {
        String onPlayFromSearch;
        e eVar = cVideoChangeFrameRateStrategy.AudioAttributesCompatParcelizer;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", cVideoChangeFrameRateStrategy.AudioAttributesImplApi21Parcelizer);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", cVideoChangeFrameRateStrategy.getOnPlay());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", cVideoChangeFrameRateStrategy.MediaDescriptionCompat());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.IconCompatParcelizer).setRequiresCharging(eVar.getWrite()).setRequiresDeviceIdle(eVar.getRemoteActionCompatParcelizer()).setExtras(persistableBundle);
        NetworkRequest networkRequestRemoteActionCompatParcelizer = eVar.RemoteActionCompatParcelizer();
        if (networkRequestRemoteActionCompatParcelizer != null) {
            setMediaItem.read(extras, networkRequestRemoteActionCompatParcelizer);
        } else {
            AudioAttributesCompatParcelizer(extras, eVar.getAudioAttributesCompatParcelizer());
        }
        if (!eVar.getRemoteActionCompatParcelizer()) {
            extras.setBackoffCriteria(cVideoChangeFrameRateStrategy.read, cVideoChangeFrameRateStrategy.RemoteActionCompatParcelizer == verifyPendingInstall.RemoteActionCompatParcelizer ? 0 : 1);
        }
        long jMax = Math.max(cVideoChangeFrameRateStrategy.read() - this.read.read(), 0L);
        if (jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!cVideoChangeFrameRateStrategy.write && this.AudioAttributesCompatParcelizer) {
            extras.setImportantWhileForeground(true);
        }
        if (eVar.MediaBrowserCompatCustomActionResultReceiver()) {
            Iterator<e.read> it = eVar.write().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(IconCompatParcelizer(it.next()));
            }
            extras.setTriggerContentUpdateDelay(eVar.getMediaBrowserCompatItemReceiver());
            extras.setTriggerContentMaxDelay(eVar.getMediaBrowserCompatCustomActionResultReceiver());
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(eVar.getAudioAttributesImplApi21Parcelizer());
        extras.setRequiresStorageNotLow(eVar.getAudioAttributesImplApi26Parcelizer());
        boolean z = cVideoChangeFrameRateStrategy.onAddQueueItem > 0;
        boolean z2 = jMax > 0;
        if (Build.VERSION.SDK_INT >= 31 && cVideoChangeFrameRateStrategy.write && !z && !z2) {
            extras.setExpedited(true);
        }
        if (Build.VERSION.SDK_INT >= 35 && (onPlayFromSearch = cVideoChangeFrameRateStrategy.getOnPlayFromSearch()) != null) {
            extras.setTraceTag(onPlayFromSearch);
        }
        return extras.build();
    }

    private static JobInfo.TriggerContentUri IconCompatParcelizer(e.read readVar) {
        return new JobInfo.TriggerContentUri(readVar.IconCompatParcelizer(), readVar.AudioAttributesCompatParcelizer() ? 1 : 0);
    }

    private static void AudioAttributesCompatParcelizer(JobInfo.Builder builder, ia iaVar) {
        if (Build.VERSION.SDK_INT >= 30 && iaVar == ia.IconCompatParcelizer) {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        } else {
            builder.setRequiredNetworkType(write(iaVar));
        }
    }

    /* JADX INFO: renamed from: o.seekToPreviousWindow$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[ia.values().length];
            RemoteActionCompatParcelizer = iArr;
            try {
                iArr[ia.RemoteActionCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RemoteActionCompatParcelizer[ia.write.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RemoteActionCompatParcelizer[ia.AudioAttributesImplBaseParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                RemoteActionCompatParcelizer[ia.read.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                RemoteActionCompatParcelizer[ia.AudioAttributesCompatParcelizer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private static int write(ia iaVar) {
        int i = AnonymousClass4.RemoteActionCompatParcelizer[iaVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        n.write();
        Objects.toString(iaVar);
        return 1;
    }
}
