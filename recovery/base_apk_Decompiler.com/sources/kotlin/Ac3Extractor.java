package kotlin;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
final class Ac3Extractor<T> implements onInputBufferAvailable<Set<T>> {
    private volatile Set<T> read = null;
    private volatile Set<onInputBufferAvailable<T>> write = Collections.newSetFromMap(new ConcurrentHashMap());

    private Ac3Extractor(Collection<onInputBufferAvailable<T>> collection) {
        this.write.addAll(collection);
    }

    static Ac3Extractor<?> AudioAttributesCompatParcelizer(Collection<onInputBufferAvailable<?>> collection) {
        return new Ac3Extractor<>((Set) collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.onInputBufferAvailable
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public Set<T> write() {
        if (this.read == null) {
            synchronized (this) {
                if (this.read == null) {
                    this.read = Collections.newSetFromMap(new ConcurrentHashMap());
                    IconCompatParcelizer();
                }
            }
        }
        return Collections.unmodifiableSet(this.read);
    }

    final void AudioAttributesCompatParcelizer(onInputBufferAvailable<T> oninputbufferavailable) {
        synchronized (this) {
            if (this.read == null) {
                this.write.add(oninputbufferavailable);
            } else {
                this.read.add(oninputbufferavailable.write());
            }
        }
    }

    private void IconCompatParcelizer() {
        synchronized (this) {
            Iterator<onInputBufferAvailable<T>> it = this.write.iterator();
            while (it.hasNext()) {
                this.read.add(it.next().write());
            }
            this.write = null;
        }
    }
}
