package kotlin;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class getPortraitDurationMs {
    public static final <T> T RemoteActionCompatParcelizer(AtomicReference<T> atomicReference) {
        return atomicReference.get();
    }

    public static final <T> void AudioAttributesCompatParcelizer(AtomicReference<T> atomicReference, T t) {
        atomicReference.set(t);
    }
}
