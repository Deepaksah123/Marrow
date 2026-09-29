package kotlin;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class resolveMediaPeriodIdForAds {
    private final AtomicReference<removeMediaSourceRange> write = new AtomicReference<>();
    private final setTitleOptional<removeMediaSourceRange, List<Class<?>>> AudioAttributesCompatParcelizer = new setTitleOptional<>();

    public final List<Class<?>> IconCompatParcelizer(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        removeMediaSourceRange andSet = this.write.getAndSet(null);
        if (andSet == null) {
            andSet = new removeMediaSourceRange(cls, cls2, cls3);
        } else {
            andSet.IconCompatParcelizer(cls, cls2, cls3);
        }
        synchronized (this.AudioAttributesCompatParcelizer) {
            list = this.AudioAttributesCompatParcelizer.get(andSet);
        }
        this.write.set(andSet);
        return list;
    }

    public final void RemoteActionCompatParcelizer(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.AudioAttributesCompatParcelizer) {
            this.AudioAttributesCompatParcelizer.put(new removeMediaSourceRange(cls, cls2, cls3), list);
        }
    }
}
