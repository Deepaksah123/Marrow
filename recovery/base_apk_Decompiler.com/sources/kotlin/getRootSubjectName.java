package kotlin;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
public class getRootSubjectName implements PageValueCompanion {
    private final Lock write;

    public /* synthetic */ getRootSubjectName(byte b) {
        this(new ReentrantLock());
    }

    public getRootSubjectName(Lock lock) {
        toMagicModuleMetaRepoModel.write(lock, "");
        this.write = lock;
    }

    @Override // kotlin.PageValueCompanion
    public void IconCompatParcelizer() {
        this.write.lock();
    }

    @Override // kotlin.PageValueCompanion
    public final void AudioAttributesCompatParcelizer() {
        this.write.unlock();
    }

    public getRootSubjectName() {
        this((byte) 0);
    }
}
