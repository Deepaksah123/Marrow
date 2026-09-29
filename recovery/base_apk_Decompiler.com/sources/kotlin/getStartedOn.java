package kotlin;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class getStartedOn {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void AudioAttributesCompatParcelizer(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel, T t, AtomicInteger atomicInteger, getContentNameForEvent getcontentnameforevent) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            schemaUserStatusRSModel.a_(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable th = getcontentnameforevent.read();
                if (th != null) {
                    schemaUserStatusRSModel.AudioAttributesCompatParcelizer(th);
                } else {
                    schemaUserStatusRSModel.aJ_();
                }
            }
        }
    }

    public static void read(SchemaUserStatusRSModel<?> schemaUserStatusRSModel, Throwable th, AtomicInteger atomicInteger, getContentNameForEvent getcontentnameforevent) {
        if (getcontentnameforevent.AudioAttributesCompatParcelizer(th)) {
            if (atomicInteger.getAndIncrement() == 0) {
                schemaUserStatusRSModel.AudioAttributesCompatParcelizer(getcontentnameforevent.read());
                return;
            }
            return;
        }
        getPaymentRefIds.RemoteActionCompatParcelizer(th);
    }

    public static void AudioAttributesCompatParcelizer(SchemaUserStatusRSModel<?> schemaUserStatusRSModel, AtomicInteger atomicInteger, getContentNameForEvent getcontentnameforevent) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable th = getcontentnameforevent.read();
            if (th != null) {
                schemaUserStatusRSModel.AudioAttributesCompatParcelizer(th);
            } else {
                schemaUserStatusRSModel.aJ_();
            }
        }
    }
}
