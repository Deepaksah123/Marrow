package kotlin;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.ErrorViewModel;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\rJ/\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u000e\u0010\u0015J\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\rJ-\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u001a¢\u0006\u0004\b\u0013\u0010\u001bJ+\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0004\b\u0017\u0010\u001eJ\r\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u001fJ%\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010 J\u001d\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0019¢\u0006\u0004\b\u0013\u0010!J\u0015\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\"¢\u0006\u0004\b\u000e\u0010#J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\"H\u0002¢\u0006\u0004\b\n\u0010#R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010'\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0011\u0010*\u001a\u00020)8\u0006¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/"}, d2 = {"Lo/ErrorViewModel_HiltModulesKeyModule;", "Ljava/io/Closeable;", "Lo/LessonCompletedDialogonViewCreatedllm1;", "p0", "", "p1", "<init>", "(Lo/LessonCompletedDialogonViewCreatedllm1;Z)V", "Lo/getTimelineAdapter;", "", "write", "(Lo/getTimelineAdapter;)V", "close", "()V", "read", "", "Lo/resetCurrentSelectedPosition;", "p2", "p3", "AudioAttributesCompatParcelizer", "(ZILo/resetCurrentSelectedPosition;I)V", "(IILo/resetCurrentSelectedPosition;I)V", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "(IIII)V", "Lo/getConnectionMonitor;", "", "(ILo/getConnectionMonitor;[B)V", "", "Lo/SyncingActivity;", "(ZILjava/util/List;)V", "()I", "(ZII)V", "(ILo/getConnectionMonitor;)V", "", "(IJ)V", "client", "Z", "closed", "hpackBuffer", "Lo/resetCurrentSelectedPosition;", "Lo/ErrorViewModel$AudioAttributesCompatParcelizer;", "hpackWriter", "Lo/ErrorViewModel$AudioAttributesCompatParcelizer;", "maxFrameSize", "I", "sink", "Lo/LessonCompletedDialogonViewCreatedllm1;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ErrorViewModel_HiltModulesKeyModule implements Closeable {
    private static final Logger logger = Logger.getLogger(setConnectionMonitor.class.getName());
    private final boolean client;
    private boolean closed;
    private final resetCurrentSelectedPosition hpackBuffer;
    private final ErrorViewModel.AudioAttributesCompatParcelizer hpackWriter;
    private int maxFrameSize;
    private final LessonCompletedDialogonViewCreatedllm1 sink;

    public ErrorViewModel_HiltModulesKeyModule(LessonCompletedDialogonViewCreatedllm1 lessonCompletedDialogonViewCreatedllm1, boolean z) {
        toMagicModuleMetaRepoModel.write(lessonCompletedDialogonViewCreatedllm1, "");
        this.sink = lessonCompletedDialogonViewCreatedllm1;
        this.client = z;
        resetCurrentSelectedPosition resetcurrentselectedposition = new resetCurrentSelectedPosition();
        this.hpackBuffer = resetcurrentselectedposition;
        this.maxFrameSize = 16384;
        this.hpackWriter = new ErrorViewModel.AudioAttributesCompatParcelizer(0, false, resetcurrentselectedposition, 3, null);
    }

    public final void read() throws IOException {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (this.client) {
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    StringBuilder sb = new StringBuilder(">> CONNECTION ");
                    sb.append(setConnectionMonitor.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
                    logger2.fine(FirebaseDataModule.read(sb.toString(), new Object[0]));
                }
                this.sink.AudioAttributesCompatParcelizer(setConnectionMonitor.AudioAttributesCompatParcelizer);
                this.sink.flush();
            }
        }
    }

    public final void write(getTimelineAdapter p0) throws IOException {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(p0, "");
            if (this.closed) {
                throw new IOException("closed");
            }
            this.maxFrameSize = p0.read(this.maxFrameSize);
            if (p0.write() != -1) {
                this.hpackWriter.IconCompatParcelizer(p0.write());
            }
            IconCompatParcelizer(0, 0, 4, 1);
            this.sink.flush();
        }
    }

    public final void RemoteActionCompatParcelizer() throws IOException {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            this.sink.flush();
        }
    }

    public final void AudioAttributesCompatParcelizer(int p0, getConnectionMonitor p1) throws IOException {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(p1, "");
            if (this.closed) {
                throw new IOException("closed");
            }
            if (p1.getHttpCode() == -1) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            IconCompatParcelizer(p0, 4, 3, 0);
            this.sink.write(p1.getHttpCode());
            this.sink.flush();
        }
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getMaxFrameSize() {
        return this.maxFrameSize;
    }

    public final void AudioAttributesCompatParcelizer(boolean p0, int p1, resetCurrentSelectedPosition p2, int p3) throws IOException {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            read(p1, p0 ? 1 : 0, p2, p3);
        }
    }

    private void read(int p0, int p1, resetCurrentSelectedPosition p2, int p3) throws IOException {
        IconCompatParcelizer(p0, p3, 0, p1);
        if (p3 > 0) {
            LessonCompletedDialogonViewCreatedllm1 lessonCompletedDialogonViewCreatedllm1 = this.sink;
            toMagicModuleMetaRepoModel.write(p2);
            lessonCompletedDialogonViewCreatedllm1.IconCompatParcelizer(p2, p3);
        }
    }

    public final void RemoteActionCompatParcelizer(getTimelineAdapter p0) throws IOException {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(p0, "");
            if (this.closed) {
                throw new IOException("closed");
            }
            int i = 0;
            IconCompatParcelizer(0, p0.read() * 6, 4, 0);
            while (i < 10) {
                if (p0.RemoteActionCompatParcelizer(i)) {
                    this.sink.AudioAttributesImplApi26Parcelizer(i != 4 ? i != 7 ? i : 4 : 3);
                    this.sink.write(p0.IconCompatParcelizer(i));
                }
                i++;
            }
            this.sink.flush();
        }
    }

    public final void IconCompatParcelizer(boolean p0, int p1, int p2) throws IOException {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            IconCompatParcelizer(0, 8, 6, p0 ? 1 : 0);
            this.sink.write(p1);
            this.sink.write(p2);
            this.sink.flush();
        }
    }

    public final void AudioAttributesCompatParcelizer(int p0, getConnectionMonitor p1, byte[] p2) throws IOException {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            if (this.closed) {
                throw new IOException("closed");
            }
            if (p1.getHttpCode() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
            IconCompatParcelizer(0, p2.length + 8, 7, 0);
            this.sink.write(p0);
            this.sink.write(p1.getHttpCode());
            if (p2.length != 0) {
                this.sink.RemoteActionCompatParcelizer(p2);
            }
            this.sink.flush();
        }
    }

    public final void read(int p0, long p1) throws IOException {
        synchronized (this) {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (p1 == 0 || p1 > 2147483647L) {
                StringBuilder sb = new StringBuilder("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ");
                sb.append(p1);
                throw new IllegalArgumentException(sb.toString().toString());
            }
            IconCompatParcelizer(p0, 4, 8, 0);
            this.sink.write((int) p1);
            this.sink.flush();
        }
    }

    private void IconCompatParcelizer(int p0, int p1, int p2, int p3) throws IOException {
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            setConnectionMonitor setconnectionmonitor = setConnectionMonitor.INSTANCE;
            logger2.fine(setConnectionMonitor.AudioAttributesCompatParcelizer(false, p0, p1, p2, p3));
        }
        if (p1 > this.maxFrameSize) {
            StringBuilder sb = new StringBuilder("FRAME_SIZE_ERROR length > ");
            sb.append(this.maxFrameSize);
            sb.append(": ");
            sb.append(p1);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if ((Integer.MIN_VALUE & p0) != 0) {
            throw new IllegalArgumentException("reserved bit set: ".concat(String.valueOf(p0)).toString());
        }
        FirebaseDataModule.write(this.sink, p1);
        this.sink.read(p2 & 255);
        this.sink.read(p3 & 255);
        this.sink.write(p0 & Integer.MAX_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this) {
            this.closed = true;
            this.sink.close();
        }
    }

    private final void write(int p0, long p1) throws IOException {
        while (p1 > 0) {
            long jMin = Math.min(this.maxFrameSize, p1);
            p1 -= jMin;
            IconCompatParcelizer(p0, (int) jMin, 9, p1 == 0 ? 4 : 0);
            this.sink.IconCompatParcelizer(this.hpackBuffer, jMin);
        }
    }

    public final void IconCompatParcelizer(boolean p0, int p1, List<SyncingActivity> p2) throws IOException {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(p2, "");
            if (this.closed) {
                throw new IOException("closed");
            }
            this.hpackWriter.AudioAttributesCompatParcelizer(p2);
            long size = this.hpackBuffer.getSize();
            long jMin = Math.min(this.maxFrameSize, size);
            int i = size == jMin ? 4 : 0;
            if (p0) {
                i |= 1;
            }
            IconCompatParcelizer(p1, (int) jMin, 1, i);
            this.sink.IconCompatParcelizer(this.hpackBuffer, jMin);
            if (size > jMin) {
                write(p1, size - jMin);
            }
        }
    }
}
