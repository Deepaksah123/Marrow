package kotlin;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.getIds;

/* JADX INFO: loaded from: classes4.dex */
public final class SdkPayload extends getIds {
    static final write AudioAttributesCompatParcelizer;
    private static getCouponType IconCompatParcelizer;
    private static int read = RemoteActionCompatParcelizer(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());
    private static IconCompatParcelizer write;
    private AtomicReference<IconCompatParcelizer> AudioAttributesImplApi26Parcelizer;
    private ThreadFactory MediaBrowserCompatItemReceiver;

    private static int RemoteActionCompatParcelizer(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    static {
        write writeVar = new write(new getCouponType("RxComputationShutdown"));
        AudioAttributesCompatParcelizer = writeVar;
        writeVar.aL_();
        getCouponType getcoupontype = new getCouponType("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        IconCompatParcelizer = getcoupontype;
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(0, getcoupontype);
        write = iconCompatParcelizer;
        iconCompatParcelizer.IconCompatParcelizer();
    }

    static final class IconCompatParcelizer {
        private long AudioAttributesCompatParcelizer;
        private write[] read;
        private int write;

        IconCompatParcelizer(int i, ThreadFactory threadFactory) {
            this.write = i;
            this.read = new write[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.read[i2] = new write(threadFactory);
            }
        }

        public final write write() {
            int i = this.write;
            if (i == 0) {
                return SdkPayload.AudioAttributesCompatParcelizer;
            }
            write[] writeVarArr = this.read;
            long j = this.AudioAttributesCompatParcelizer;
            this.AudioAttributesCompatParcelizer = 1 + j;
            return writeVarArr[(int) (j % ((long) i))];
        }

        public final void IconCompatParcelizer() {
            for (write writeVar : this.read) {
                writeVar.aL_();
            }
        }
    }

    public SdkPayload() {
        this(IconCompatParcelizer);
    }

    private SdkPayload(ThreadFactory threadFactory) {
        this.MediaBrowserCompatItemReceiver = threadFactory;
        this.AudioAttributesImplApi26Parcelizer = new AtomicReference<>(write);
        write();
    }

    @Override // kotlin.getIds
    public final getIds.IconCompatParcelizer IconCompatParcelizer() {
        return new read(this.AudioAttributesImplApi26Parcelizer.get().write());
    }

    @Override // kotlin.getIds
    public final MarkIncompleteResponseBody IconCompatParcelizer(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.AudioAttributesImplApi26Parcelizer.get().write().AudioAttributesCompatParcelizer(runnable, j, timeUnit);
    }

    @Override // kotlin.getIds
    public final MarkIncompleteResponseBody write(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.AudioAttributesImplApi26Parcelizer.get().write().RemoteActionCompatParcelizer(runnable, j, j2, timeUnit);
    }

    @Override // kotlin.getIds
    public final void write() {
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(read, this.MediaBrowserCompatItemReceiver);
        if (setBackInvokedCallbackEnabled.read(this.AudioAttributesImplApi26Parcelizer, write, iconCompatParcelizer)) {
            return;
        }
        iconCompatParcelizer.IconCompatParcelizer();
    }

    static final class read extends getIds.IconCompatParcelizer {
        private final setFilterType AudioAttributesCompatParcelizer;
        private final getSno IconCompatParcelizer;
        private final setFilterType RemoteActionCompatParcelizer;
        private volatile boolean read;
        private final write write;

        read(write writeVar) {
            this.write = writeVar;
            setFilterType setfiltertype = new setFilterType();
            this.RemoteActionCompatParcelizer = setfiltertype;
            getSno getsno = new getSno();
            this.IconCompatParcelizer = getsno;
            setFilterType setfiltertype2 = new setFilterType();
            this.AudioAttributesCompatParcelizer = setfiltertype2;
            setfiltertype2.read(setfiltertype);
            setfiltertype2.read(getsno);
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final void aL_() {
            if (this.read) {
                return;
            }
            this.read = true;
            this.AudioAttributesCompatParcelizer.aL_();
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final boolean write() {
            return this.read;
        }

        @Override // o.getIds.IconCompatParcelizer
        public final MarkIncompleteResponseBody read(Runnable runnable) {
            if (this.read) {
                return isLessonPaid.INSTANCE;
            }
            return this.write.AudioAttributesCompatParcelizer(runnable, 0L, TimeUnit.MILLISECONDS, this.RemoteActionCompatParcelizer);
        }

        @Override // o.getIds.IconCompatParcelizer
        public final MarkIncompleteResponseBody RemoteActionCompatParcelizer(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.read) {
                return isLessonPaid.INSTANCE;
            }
            return this.write.AudioAttributesCompatParcelizer(runnable, j, timeUnit, this.IconCompatParcelizer);
        }
    }

    static final class write extends getCouponCode {
        write(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }
}
