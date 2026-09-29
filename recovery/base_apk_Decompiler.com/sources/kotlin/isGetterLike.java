package kotlin;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.KotlinKeySerializers;

/* JADX INFO: loaded from: classes2.dex */
final class isGetterLike<Key, Value> {
    private final isRequiredByAnnotation<Key, Value> AudioAttributesCompatParcelizer;
    private final ReentrantLock RemoteActionCompatParcelizer = new ReentrantLock();
    private final getResolutionSize<KotlinKeySerializers> write;

    public isGetterLike() {
        KotlinKeySerializers.write writeVar = KotlinKeySerializers.AudioAttributesCompatParcelizer;
        this.write = setStartTime.RemoteActionCompatParcelizer(KotlinKeySerializers.write.RemoteActionCompatParcelizer());
        this.AudioAttributesCompatParcelizer = new isRequiredByAnnotation<>();
    }

    public final setUpdatedStatus<KotlinKeySerializers> RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final <R> R AudioAttributesCompatParcelizer(getAnswerMap<? super isRequiredByAnnotation<Key, Value>, ? extends R> getanswermap) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        ReentrantLock reentrantLock = this.RemoteActionCompatParcelizer;
        reentrantLock.lock();
        try {
            R rInvoke = getanswermap.invoke(this.AudioAttributesCompatParcelizer);
            this.write.write(this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer());
            return rInvoke;
        } finally {
            reentrantLock.unlock();
        }
    }
}
