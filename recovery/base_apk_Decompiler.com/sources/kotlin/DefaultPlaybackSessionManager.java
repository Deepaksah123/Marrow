package kotlin;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.getLoadingMediaPeriod;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\n\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u000f\u001a\u0006*\u00020\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013"}, d2 = {"Lo/DefaultPlaybackSessionManager;", "", "<init>", "()V", "Landroid/app/ActivityManager;", "p0", "", "AudioAttributesCompatParcelizer", "(Landroid/app/ActivityManager;)V", "Ljava/lang/Runnable;", "read", "Ljava/lang/Runnable;", "", "I", "", "IconCompatParcelizer", "Ljava/lang/String;", "write", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ScheduledExecutorService;"}, k = 1, mv = {1, 4, 0})
public final class DefaultPlaybackSessionManager {
    public static final DefaultPlaybackSessionManager INSTANCE = new DefaultPlaybackSessionManager();

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private static final int read = Process.myUid();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private static final ScheduledExecutorService IconCompatParcelizer = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private static String write = "";

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private static final Runnable AudioAttributesCompatParcelizer = new Runnable() { // from class: o.DefaultPlaybackSessionManager.2
        @Override // java.lang.Runnable
        public final void run() {
            if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                return;
            }
            try {
                if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                    return;
                }
                try {
                    Object systemService = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer().getSystemService("activity");
                    if (systemService == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
                    }
                    DefaultPlaybackSessionManager.AudioAttributesCompatParcelizer((ActivityManager) systemService);
                } catch (Exception unused) {
                } catch (Throwable th) {
                    getMinWindowSequenceNumber.read(th, this);
                }
            } catch (Throwable th2) {
                getMinWindowSequenceNumber.read(th2, this);
            }
        }
    };

    private DefaultPlaybackSessionManager() {
    }

    @getMagicModuleMeta
    public static final void AudioAttributesCompatParcelizer(ActivityManager p0) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultPlaybackSessionManager.class) || p0 == null) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = p0.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == read) {
                        Looper mainLooper = Looper.getMainLooper();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mainLooper, "");
                        Thread thread = mainLooper.getThread();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(thread, "");
                        String strWrite = getReadingMediaPeriod.write(thread);
                        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) strWrite, (Object) write) && getReadingMediaPeriod.read(thread)) {
                            write = strWrite;
                            getLoadingMediaPeriod.read.write(processErrorStateInfo.shortMsg, strWrite).AudioAttributesCompatParcelizer();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultPlaybackSessionManager.class);
        }
    }

    @getMagicModuleMeta
    public static final void AudioAttributesCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultPlaybackSessionManager.class)) {
            return;
        }
        try {
            IconCompatParcelizer.scheduleAtFixedRate(AudioAttributesCompatParcelizer, 0L, 500L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultPlaybackSessionManager.class);
        }
    }
}
