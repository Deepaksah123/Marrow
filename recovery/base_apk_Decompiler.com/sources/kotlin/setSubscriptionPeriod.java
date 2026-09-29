package kotlin;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class setSubscriptionPeriod<T> extends AtomicInteger implements setShown<T> {
    private SchemaUserStatusRSModel<? super T> IconCompatParcelizer;
    private T RemoteActionCompatParcelizer;

    @Override // kotlin.isShown
    public final int write(int i) {
        return i & 1;
    }

    public setSubscriptionPeriod(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel, T t) {
        this.IconCompatParcelizer = schemaUserStatusRSModel;
        this.RemoteActionCompatParcelizer = t;
    }

    @Override // kotlin.SchemaLessonStatus
    public final void write(long j) {
        if (getCreatedOn.AudioAttributesCompatParcelizer(j) && compareAndSet(0, 1)) {
            SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel = this.IconCompatParcelizer;
            schemaUserStatusRSModel.a_(this.RemoteActionCompatParcelizer);
            if (get() != 2) {
                schemaUserStatusRSModel.aJ_();
            }
        }
    }

    @Override // kotlin.SchemaLessonStatus
    public final void AudioAttributesCompatParcelizer() {
        lazySet(2);
    }

    @Override // kotlin.toLSModel
    public final boolean RemoteActionCompatParcelizer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // kotlin.toLSModel
    public final T read() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.toLSModel
    public final boolean IconCompatParcelizer() {
        return get() != 0;
    }

    @Override // kotlin.toLSModel
    public final void RemoteActionCompatParcelizer() {
        lazySet(1);
    }
}
