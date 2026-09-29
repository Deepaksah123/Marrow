package kotlin;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000bj\u0002`\n2\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\bH\u0016¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\u0006\u001a(\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000bj\u0002`\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/internal/WeakMapCtorCache;", "Lkotlinx/coroutines/internal/CtorCache;", "<init>", "()V", "cacheLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "exceptionCtors", "Ljava/util/WeakHashMap;", "Ljava/lang/Class;", "", "Lkotlinx/coroutines/internal/Ctor;", "Lkotlin/Function1;", "get", "key", "(Ljava/lang/Class;)Lkotlin/jvm/functions/Function1;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class VideoResumeInfo extends getTotalDurationMs {
    public static final VideoResumeInfo RemoteActionCompatParcelizer = new VideoResumeInfo();
    private static final ReentrantReadWriteLock write = new ReentrantReadWriteLock();
    private static final WeakHashMap<Class<? extends Throwable>, getAnswerMap<Throwable, Throwable>> IconCompatParcelizer = new WeakHashMap<>();

    private VideoResumeInfo() {
    }

    @Override // kotlin.getTotalDurationMs
    public final getAnswerMap<Throwable, Throwable> AudioAttributesCompatParcelizer(Class<? extends Throwable> cls) {
        ReentrantReadWriteLock reentrantReadWriteLock = write;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            getAnswerMap<Throwable, Throwable> getanswermap = IconCompatParcelizer.get(cls);
            if (getanswermap != null) {
                return getanswermap;
            }
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap<Class<? extends Throwable>, getAnswerMap<Throwable, Throwable>> weakHashMap = IconCompatParcelizer;
                getAnswerMap<Throwable, Throwable> getanswermap2 = weakHashMap.get(cls);
                if (getanswermap2 != null) {
                    return getanswermap2;
                }
                getAnswerMap<Throwable, Throwable> getanswermap3 = setAudioUnderrunDurationMs.read(cls);
                weakHashMap.put(cls, getanswermap3);
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                return getanswermap3;
            } finally {
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
            }
        } finally {
            lock.unlock();
        }
    }
}
