package kotlin;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlayerBuilderExternalSyntheticLambda20 extends setRelatedModuleAdapter implements getAnswerMap<Throwable, getShowPopup> {
    private final Thread RemoteActionCompatParcelizer;
    private final AtomicInteger write;

    @Override // kotlin.getAnswerMap
    public final /* synthetic */ getShowPopup invoke(Throwable th) {
        write();
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExoPlayerBuilderExternalSyntheticLambda20(setStateRank<?> setstaterank, setLockedFromSeek setlockedfromseek) {
        int i;
        super(setlockedfromseek);
        toMagicModuleMetaRepoModel.write(setstaterank, "");
        toMagicModuleMetaRepoModel.write(setlockedfromseek, "");
        AtomicInteger atomicInteger = new AtomicInteger(1);
        this.write = atomicInteger;
        this.RemoteActionCompatParcelizer = Thread.currentThread();
        setstaterank.write((getAnswerMap<? super Throwable, getShowPopup>) this);
        do {
            i = atomicInteger.get();
            if (i != 1) {
                if (i == 3 || i == 4 || i == 5) {
                    return;
                }
                RemoteActionCompatParcelizer(i);
                throw new PlanDetailsCreator();
            }
        } while (!this.write.compareAndSet(i, 1));
    }

    @Override // kotlin.setRelatedModuleAdapter, kotlin.setLockedFromSeek
    public final long AudioAttributesCompatParcelizer(resetCurrentSelectedPosition resetcurrentselectedposition, long j) {
        toMagicModuleMetaRepoModel.write(resetcurrentselectedposition, "");
        try {
            read(false);
            return super.AudioAttributesCompatParcelizer(resetcurrentselectedposition, j);
        } finally {
            read(true);
        }
    }

    private final void read(boolean z) {
        AtomicInteger atomicInteger = this.write;
        while (true) {
            int i = atomicInteger.get();
            if (i == 0 || i == 1) {
                if (this.write.compareAndSet(i, 1 ^ (z ? 1 : 0))) {
                    return;
                }
            } else if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        Thread.interrupted();
                        return;
                    } else {
                        RemoteActionCompatParcelizer(i);
                        throw new PlanDetailsCreator();
                    }
                }
            } else if (this.write.compareAndSet(i, 4)) {
                this.RemoteActionCompatParcelizer.interrupt();
                this.write.set(5);
                return;
            }
        }
    }

    public final void AudioAttributesCompatParcelizer() {
        AtomicInteger atomicInteger = this.write;
        while (true) {
            int i = atomicInteger.get();
            if (i == 0 || i == 3) {
                if (this.write.compareAndSet(i, 2)) {
                    return;
                }
            } else if (i != 4) {
                if (i == 5) {
                    Thread.interrupted();
                    return;
                } else {
                    RemoteActionCompatParcelizer(i);
                    throw new PlanDetailsCreator();
                }
            }
        }
    }

    private void write() {
        AtomicInteger atomicInteger = this.write;
        while (true) {
            int i = atomicInteger.get();
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3 || i == 4 || i == 5) {
                        return;
                    }
                    RemoteActionCompatParcelizer(i);
                    throw new PlanDetailsCreator();
                }
                if (this.write.compareAndSet(i, 3)) {
                    return;
                }
            } else if (this.write.compareAndSet(i, 4)) {
                this.RemoteActionCompatParcelizer.interrupt();
                this.write.set(5);
                return;
            }
        }
    }

    private static Void RemoteActionCompatParcelizer(int i) {
        throw new IllegalStateException(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer("Illegal state: ", (Object) Integer.valueOf(i)).toString());
    }
}
