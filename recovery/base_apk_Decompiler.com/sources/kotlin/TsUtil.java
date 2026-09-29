package kotlin;

import android.database.SQLException;
import android.os.SystemClock;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
final class TsUtil {
    private final parseFrameLength AudioAttributesCompatParcelizer;
    private final long AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private final long AudioAttributesImplBaseParcelizer;
    private final double IconCompatParcelizer;
    private final ThreadPoolExecutor MediaBrowserCompatCustomActionResultReceiver;
    private final double MediaBrowserCompatItemReceiver;
    private final isDeniedByServerException<fillBufferWithAtLeastOnePacket> MediaBrowserCompatMediaItem;
    private long RemoteActionCompatParcelizer;
    private final int read;
    private final BlockingQueue<Runnable> write;

    TsUtil(isDeniedByServerException<fillBufferWithAtLeastOnePacket> isdeniedbyserverexception, readFileType readfiletype, parseFrameLength parseframelength) {
        this(readfiletype.write, readfiletype.RemoteActionCompatParcelizer, ((long) readfiletype.AudioAttributesCompatParcelizer) * 1000, isdeniedbyserverexception, parseframelength);
    }

    private TsUtil(double d, double d2, long j, isDeniedByServerException<fillBufferWithAtLeastOnePacket> isdeniedbyserverexception, parseFrameLength parseframelength) {
        this.MediaBrowserCompatItemReceiver = d;
        this.IconCompatParcelizer = d2;
        this.AudioAttributesImplApi21Parcelizer = j;
        this.MediaBrowserCompatMediaItem = isdeniedbyserverexception;
        this.AudioAttributesCompatParcelizer = parseframelength;
        this.AudioAttributesImplBaseParcelizer = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.read = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.write = arrayBlockingQueue;
        this.MediaBrowserCompatCustomActionResultReceiver = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.AudioAttributesImplApi26Parcelizer = 0;
        this.RemoteActionCompatParcelizer = 0L;
    }

    final TaskCompletionSource<readNalUnitData> read(readNalUnitData readnalunitdata, boolean z) {
        synchronized (this.write) {
            TaskCompletionSource<readNalUnitData> taskCompletionSource = new TaskCompletionSource<>();
            if (z) {
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                if (read()) {
                    DvbSubtitleReader dvbSubtitleReader = DvbSubtitleReader.read();
                    StringBuilder sb = new StringBuilder("Enqueueing report: ");
                    sb.append(readnalunitdata.IconCompatParcelizer());
                    dvbSubtitleReader.IconCompatParcelizer(sb.toString());
                    DvbSubtitleReader dvbSubtitleReader2 = DvbSubtitleReader.read();
                    StringBuilder sb2 = new StringBuilder("Queue size: ");
                    sb2.append(this.write.size());
                    dvbSubtitleReader2.IconCompatParcelizer(sb2.toString());
                    this.MediaBrowserCompatCustomActionResultReceiver.execute(new AudioAttributesCompatParcelizer(this, readnalunitdata, taskCompletionSource, (byte) 0));
                    DvbSubtitleReader dvbSubtitleReader3 = DvbSubtitleReader.read();
                    StringBuilder sb3 = new StringBuilder("Closing task for report: ");
                    sb3.append(readnalunitdata.IconCompatParcelizer());
                    dvbSubtitleReader3.IconCompatParcelizer(sb3.toString());
                    taskCompletionSource.trySetResult(readnalunitdata);
                    return taskCompletionSource;
                }
                AudioAttributesCompatParcelizer();
                DvbSubtitleReader dvbSubtitleReader4 = DvbSubtitleReader.read();
                StringBuilder sb4 = new StringBuilder("Dropping report due to queue being full: ");
                sb4.append(readnalunitdata.IconCompatParcelizer());
                dvbSubtitleReader4.IconCompatParcelizer(sb4.toString());
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
                taskCompletionSource.trySetResult(readnalunitdata);
                return taskCompletionSource;
            }
            read(readnalunitdata, taskCompletionSource);
            return taskCompletionSource;
        }
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: o.findSyncBytePosition
            @Override // java.lang.Runnable
            public final void run() {
                this.write.RemoteActionCompatParcelizer(countDownLatch);
            }
        }).start();
        parsePayloadMux.write(countDownLatch, TimeUnit.SECONDS);
    }

    final /* synthetic */ void RemoteActionCompatParcelizer(CountDownLatch countDownLatch) {
        try {
            getStatusCode.IconCompatParcelizer(this.MediaBrowserCompatMediaItem, DrmUtilApi21.HIGHEST);
        } catch (SQLException unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(final readNalUnitData readnalunitdata, final TaskCompletionSource<readNalUnitData> taskCompletionSource) {
        DvbSubtitleReader dvbSubtitleReader = DvbSubtitleReader.read();
        StringBuilder sb = new StringBuilder("Sending report through Google DataTransport: ");
        sb.append(readnalunitdata.IconCompatParcelizer());
        dvbSubtitleReader.IconCompatParcelizer(sb.toString());
        final boolean z = SystemClock.elapsedRealtime() - this.AudioAttributesImplBaseParcelizer < 2000;
        this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(isNotProvisionedException.write(readnalunitdata.RemoteActionCompatParcelizer()), new DummyExoMediaDrm() { // from class: o.UserDataReader
            @Override // kotlin.DummyExoMediaDrm
            public final void RemoteActionCompatParcelizer(Exception exc) {
                this.write.write(taskCompletionSource, z, readnalunitdata, exc);
            }
        });
    }

    final /* synthetic */ void write(TaskCompletionSource taskCompletionSource, boolean z, readNalUnitData readnalunitdata, Exception exc) {
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (z) {
            MediaBrowserCompatCustomActionResultReceiver();
        }
        taskCompletionSource.trySetResult(readnalunitdata);
    }

    private boolean read() {
        return this.write.size() < this.read;
    }

    private boolean RemoteActionCompatParcelizer() {
        return this.write.size() == this.read;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double write() {
        return Math.min(3600000.0d, (60000.0d / this.MediaBrowserCompatItemReceiver) * Math.pow(this.IconCompatParcelizer, AudioAttributesCompatParcelizer()));
    }

    private int AudioAttributesCompatParcelizer() {
        int iMax;
        if (this.RemoteActionCompatParcelizer == 0) {
            this.RemoteActionCompatParcelizer = IconCompatParcelizer();
        }
        int iIconCompatParcelizer = (int) ((IconCompatParcelizer() - this.RemoteActionCompatParcelizer) / this.AudioAttributesImplApi21Parcelizer);
        if (RemoteActionCompatParcelizer()) {
            iMax = Math.min(100, this.AudioAttributesImplApi26Parcelizer + iIconCompatParcelizer);
        } else {
            iMax = Math.max(0, this.AudioAttributesImplApi26Parcelizer - iIconCompatParcelizer);
        }
        if (this.AudioAttributesImplApi26Parcelizer != iMax) {
            this.AudioAttributesImplApi26Parcelizer = iMax;
            this.RemoteActionCompatParcelizer = IconCompatParcelizer();
        }
        return iMax;
    }

    private static long IconCompatParcelizer() {
        return System.currentTimeMillis();
    }

    final class AudioAttributesCompatParcelizer implements Runnable {
        private final TaskCompletionSource<readNalUnitData> AudioAttributesCompatParcelizer;
        private final readNalUnitData write;

        /* synthetic */ AudioAttributesCompatParcelizer(TsUtil tsUtil, readNalUnitData readnalunitdata, TaskCompletionSource taskCompletionSource, byte b) {
            this(readnalunitdata, taskCompletionSource);
        }

        private AudioAttributesCompatParcelizer(readNalUnitData readnalunitdata, TaskCompletionSource<readNalUnitData> taskCompletionSource) {
            this.write = readnalunitdata;
            this.AudioAttributesCompatParcelizer = taskCompletionSource;
        }

        @Override // java.lang.Runnable
        public final void run() {
            TsUtil.this.read(this.write, this.AudioAttributesCompatParcelizer);
            TsUtil.this.AudioAttributesCompatParcelizer.read();
            double dWrite = TsUtil.this.write();
            DvbSubtitleReader dvbSubtitleReader = DvbSubtitleReader.read();
            StringBuilder sb = new StringBuilder("Delay for: ");
            sb.append(String.format(Locale.US, "%.2f", Double.valueOf(dWrite / 1000.0d)));
            sb.append(" s for report: ");
            sb.append(this.write.IconCompatParcelizer());
            dvbSubtitleReader.IconCompatParcelizer(sb.toString());
            TsUtil.write(dWrite);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void write(double d) {
        try {
            Thread.sleep((long) d);
        } catch (InterruptedException unused) {
        }
    }
}
