package kotlin;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.util.Timer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class getHevcProfileAndLevel {
    private static final long write;
    private final long IconCompatParcelizer;
    private final String MediaBrowserCompatItemReceiver;
    private ScheduledFuture AudioAttributesImplApi21Parcelizer = null;
    private long AudioAttributesCompatParcelizer = -1;
    public final ConcurrentLinkedQueue<createCodec> RemoteActionCompatParcelizer = new ConcurrentLinkedQueue<>();
    private final ScheduledExecutorService read = Executors.newSingleThreadScheduledExecutor();

    public static boolean write(long j) {
        return j <= 0;
    }

    static {
        MediaCodecRendererDecoderInitializationException.IconCompatParcelizer();
        write = TimeUnit.SECONDS.toMicros(1L);
    }

    getHevcProfileAndLevel() {
        int iMyPid = Process.myPid();
        StringBuilder sb = new StringBuilder("/proc/");
        sb.append(Integer.toString(iMyPid));
        sb.append("/stat");
        this.MediaBrowserCompatItemReceiver = sb.toString();
        this.IconCompatParcelizer = AudioAttributesCompatParcelizer();
    }

    public final void IconCompatParcelizer(long j, Timer timer) {
        long j2 = this.IconCompatParcelizer;
        if (j2 == -1 || j2 == 0 || write(j)) {
            return;
        }
        if (this.AudioAttributesImplApi21Parcelizer == null) {
            RemoteActionCompatParcelizer(j, timer);
        } else if (this.AudioAttributesCompatParcelizer != j) {
            write();
            RemoteActionCompatParcelizer(j, timer);
        }
    }

    public final void write() {
        ScheduledFuture scheduledFuture = this.AudioAttributesImplApi21Parcelizer;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.AudioAttributesImplApi21Parcelizer = null;
        this.AudioAttributesCompatParcelizer = -1L;
    }

    public final void IconCompatParcelizer(Timer timer) {
        read(timer);
    }

    private void RemoteActionCompatParcelizer(long j, final Timer timer) {
        synchronized (this) {
            this.AudioAttributesCompatParcelizer = j;
            try {
                this.AudioAttributesImplApi21Parcelizer = this.read.scheduleAtFixedRate(new Runnable() { // from class: o.getDolbyVisionProfileAndLevel
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.write.write(timer);
                    }
                }, 0L, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                e.getMessage();
            }
        }
    }

    final /* synthetic */ void write(Timer timer) {
        createCodec createcodecRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(timer);
        if (createcodecRemoteActionCompatParcelizer != null) {
            this.RemoteActionCompatParcelizer.add(createcodecRemoteActionCompatParcelizer);
        }
    }

    private void read(final Timer timer) {
        synchronized (this) {
            try {
                this.read.schedule(new Runnable() { // from class: o.hevcCodecStringToProfileLevel
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.read.AudioAttributesCompatParcelizer(timer);
                    }
                }, 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                e.getMessage();
            }
        }
    }

    final /* synthetic */ void AudioAttributesCompatParcelizer(Timer timer) {
        createCodec createcodecRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(timer);
        if (createcodecRemoteActionCompatParcelizer != null) {
            this.RemoteActionCompatParcelizer.add(createcodecRemoteActionCompatParcelizer);
        }
    }

    private createCodec RemoteActionCompatParcelizer(Timer timer) {
        if (timer == null) {
            return null;
        }
        try {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(this.MediaBrowserCompatItemReceiver));
                try {
                    long jRemoteActionCompatParcelizer = timer.RemoteActionCompatParcelizer();
                    String[] strArrSplit = bufferedReader.readLine().split(" ");
                    long j = Long.parseLong(strArrSplit[13]);
                    long j2 = Long.parseLong(strArrSplit[15]);
                    createCodec createcodecMediaBrowserCompatMediaItem = createCodec.write().RemoteActionCompatParcelizer(jRemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer(Long.parseLong(strArrSplit[14]) + Long.parseLong(strArrSplit[16]))).write(RemoteActionCompatParcelizer(j + j2)).MediaBrowserCompatMediaItem();
                    bufferedReader.close();
                    return createcodecMediaBrowserCompatMediaItem;
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e) {
                e.getMessage();
                return null;
            }
        } catch (IOException e2) {
            e2.getMessage();
            return null;
        }
    }

    private static long AudioAttributesCompatParcelizer() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    private long RemoteActionCompatParcelizer(long j) {
        return Math.round((j / this.IconCompatParcelizer) * write);
    }
}
