package kotlin;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0013\u001a\u0004\u0018\u00010\fJ\u001a\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\fH\u0002J'\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u00060\u0005j\u0002`\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001e¢\u0006\u0002\u0010\u001fJ\u001b\u0010 \u001a\u0004\u0018\u00010\f2\n\u0010\u001b\u001a\u00060\u0005j\u0002`\u001cH\u0002¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u0004\u0018\u00010\fJ\b\u0010#\u001a\u0004\u0018\u00010\fJ\u0012\u0010$\u001a\u0004\u0018\u00010\f2\u0006\u0010%\u001a\u00020\u0017H\u0002J\u001a\u0010&\u001a\u0004\u0018\u00010\f2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0017H\u0002J\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+J)\u0010,\u001a\u00020\u001a2\n\u0010\u001b\u001a\u00060\u0005j\u0002`\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001eH\u0002¢\u0006\u0002\u0010\u001fJ\u0010\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020+H\u0002J\n\u0010/\u001a\u0004\u0018\u00010\fH\u0002J\u000e\u00100\u001a\u00020)*\u0004\u0018\u00010\fH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000eX\u0082\u0004R\t\u0010\u000f\u001a\u00020\u0010X\u0082\u0004R\t\u0010\u0011\u001a\u00020\u0010X\u0082\u0004R\t\u0010\u0012\u001a\u00020\u0010X\u0082\u0004¨\u00061"}, d2 = {"Lkotlinx/coroutines/scheduling/WorkQueue;", "", "<init>", "()V", "bufferSize", "", "getBufferSize", "()I", "size", "getSize$kotlinx_coroutines_core", "buffer", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Lkotlinx/coroutines/scheduling/Task;", "lastScheduledTask", "Lkotlinx/atomicfu/AtomicRef;", "producerIndex", "Lkotlinx/atomicfu/AtomicInt;", "consumerIndex", "blockingTasksInBuffer", "poll", "add", "task", "fair", "", "addLast", "trySteal", "", "stealingMode", "Lkotlinx/coroutines/scheduling/StealingMode;", "stolenTaskRef", "Lkotlin/jvm/internal/Ref$ObjectRef;", "(ILkotlin/jvm/internal/Ref$ObjectRef;)J", "stealWithExclusiveMode", "(I)Lkotlinx/coroutines/scheduling/Task;", "pollBlocking", "pollCpu", "pollWithExclusiveMode", "onlyBlocking", "tryExtractFromTheMiddle", "index", "offloadAllWorkTo", "", "globalQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "tryStealLastScheduled", "pollTo", "queue", "pollBuffer", "decrementIfBlocking", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getLastQueuedTimeMs {
    private static final /* synthetic */ AtomicReferenceFieldUpdater AudioAttributesCompatParcelizer = AtomicReferenceFieldUpdater.newUpdater(getLastQueuedTimeMs.class, Object.class, "lastScheduledTask$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater IconCompatParcelizer = AtomicIntegerFieldUpdater.newUpdater(getLastQueuedTimeMs.class, "producerIndex$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater RemoteActionCompatParcelizer = AtomicIntegerFieldUpdater.newUpdater(getLastQueuedTimeMs.class, "consumerIndex$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater write = AtomicIntegerFieldUpdater.newUpdater(getLastQueuedTimeMs.class, "blockingTasksInBuffer$volatile");
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    private final AtomicReferenceArray<getDownloadCount> read = new AtomicReferenceArray<>(128);

    private final int RemoteActionCompatParcelizer() {
        return IconCompatParcelizer.get(this) - RemoteActionCompatParcelizer.get(this);
    }

    public final int read() {
        Object obj = AudioAttributesCompatParcelizer.get(this);
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        return obj != null ? iRemoteActionCompatParcelizer + 1 : iRemoteActionCompatParcelizer;
    }

    public final getDownloadCount IconCompatParcelizer() {
        getDownloadCount getdownloadcount = (getDownloadCount) AudioAttributesCompatParcelizer.getAndSet(this, null);
        return getdownloadcount == null ? AudioAttributesImplApi21Parcelizer() : getdownloadcount;
    }

    public final getDownloadCount IconCompatParcelizer(getDownloadCount getdownloadcount, boolean z) {
        if (z) {
            return write(getdownloadcount);
        }
        getDownloadCount getdownloadcount2 = (getDownloadCount) AudioAttributesCompatParcelizer.getAndSet(this, getdownloadcount);
        if (getdownloadcount2 == null) {
            return null;
        }
        return write(getdownloadcount2);
    }

    private final getDownloadCount write(getDownloadCount getdownloadcount) {
        if (RemoteActionCompatParcelizer() == 127) {
            return getdownloadcount;
        }
        if (getdownloadcount.MediaBrowserCompatItemReceiver) {
            write.incrementAndGet(this);
        }
        int i = IconCompatParcelizer.get(this) & 127;
        while (this.read.get(i) != null) {
            Thread.yield();
        }
        this.read.lazySet(i, getdownloadcount);
        IconCompatParcelizer.incrementAndGet(this);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long read(int i, MagicModuleUseCaseImplWhenMappings.write<getDownloadCount> writeVar) {
        T tIconCompatParcelizer;
        if (i == 3) {
            tIconCompatParcelizer = AudioAttributesImplApi21Parcelizer();
        } else {
            tIconCompatParcelizer = IconCompatParcelizer(i);
        }
        if (tIconCompatParcelizer != 0) {
            writeVar.write = tIconCompatParcelizer;
            return -1L;
        }
        return RemoteActionCompatParcelizer(i, writeVar);
    }

    private final getDownloadCount IconCompatParcelizer(int i) {
        getDownloadCount getdownloadcount;
        int i2 = RemoteActionCompatParcelizer.get(this);
        int i3 = IconCompatParcelizer.get(this);
        boolean z = i == 1;
        while (true) {
            getdownloadcount = null;
            if (i2 == i3) {
                break;
            }
            if (!z || write.get(this) != 0) {
                getdownloadcount = read(i2, z);
                if (getdownloadcount != null) {
                    break;
                }
                i2++;
            } else {
                return null;
            }
        }
        return getdownloadcount;
    }

    public final getDownloadCount AudioAttributesCompatParcelizer() {
        return AudioAttributesImplApi26Parcelizer();
    }

    private final getDownloadCount AudioAttributesImplApi26Parcelizer() {
        getDownloadCount getdownloadcount;
        do {
            getdownloadcount = (getDownloadCount) AudioAttributesCompatParcelizer.get(this);
            if (getdownloadcount == null || !getdownloadcount.MediaBrowserCompatItemReceiver) {
                int i = RemoteActionCompatParcelizer.get(this);
                int i2 = IconCompatParcelizer.get(this);
                while (i != i2 && write.get(this) != 0) {
                    i2--;
                    getDownloadCount getdownloadcount2 = read(i2, true);
                    if (getdownloadcount2 != null) {
                        return getdownloadcount2;
                    }
                }
                return null;
            }
        } while (!DateDeserializersDateBasedDeserializer.IconCompatParcelizer(AudioAttributesCompatParcelizer, this, getdownloadcount, null));
        return getdownloadcount;
    }

    private final getDownloadCount read(int i, boolean z) {
        int i2 = i & 127;
        getDownloadCount getdownloadcount = this.read.get(i2);
        if (getdownloadcount == null || getdownloadcount.MediaBrowserCompatItemReceiver != z || !SefReader.RemoteActionCompatParcelizer(this.read, i2, getdownloadcount, null)) {
            return null;
        }
        if (z) {
            write.decrementAndGet(this);
        }
        return getdownloadcount;
    }

    public final void RemoteActionCompatParcelizer(getSubtitleId getsubtitleid) {
        getDownloadCount getdownloadcount = (getDownloadCount) AudioAttributesCompatParcelizer.getAndSet(this, null);
        if (getdownloadcount != null) {
            getsubtitleid.RemoteActionCompatParcelizer(getdownloadcount);
        }
        while (write(getsubtitleid)) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object, o.getDownloadCount] */
    private final long RemoteActionCompatParcelizer(int i, MagicModuleUseCaseImplWhenMappings.write<getDownloadCount> writeVar) {
        ?? r0;
        do {
            r0 = (getDownloadCount) AudioAttributesCompatParcelizer.get(this);
            if (r0 == 0) {
                return -2L;
            }
            if (((r0.MediaBrowserCompatItemReceiver ? 1 : 2) & i) == 0) {
                return -2L;
            }
            long jIconCompatParcelizer = CourseDownloadCount.AudioAttributesImplBaseParcelizer.IconCompatParcelizer() - r0.AudioAttributesImplApi26Parcelizer;
            if (jIconCompatParcelizer < CourseDownloadCount.read) {
                return CourseDownloadCount.read - jIconCompatParcelizer;
            }
        } while (!DateDeserializersDateBasedDeserializer.IconCompatParcelizer(AudioAttributesCompatParcelizer, this, r0, null));
        writeVar.write = r0;
        return -1L;
    }

    private final boolean write(getSubtitleId getsubtitleid) {
        getDownloadCount getdownloadcountAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        if (getdownloadcountAudioAttributesImplApi21Parcelizer == null) {
            return false;
        }
        getsubtitleid.RemoteActionCompatParcelizer(getdownloadcountAudioAttributesImplApi21Parcelizer);
        return true;
    }

    private final getDownloadCount AudioAttributesImplApi21Parcelizer() {
        getDownloadCount andSet;
        while (true) {
            int i = RemoteActionCompatParcelizer.get(this);
            if (i - IconCompatParcelizer.get(this) == 0) {
                return null;
            }
            if (RemoteActionCompatParcelizer.compareAndSet(this, i, i + 1) && (andSet = this.read.getAndSet(i & 127, null)) != null) {
                IconCompatParcelizer(andSet);
                return andSet;
            }
        }
    }

    private final void IconCompatParcelizer(getDownloadCount getdownloadcount) {
        if (getdownloadcount == null || !getdownloadcount.MediaBrowserCompatItemReceiver) {
            return;
        }
        write.decrementAndGet(this);
        getCollegeId.write();
    }
}
