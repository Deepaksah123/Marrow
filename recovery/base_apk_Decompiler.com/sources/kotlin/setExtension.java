package kotlin;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public abstract class setExtension<T> extends CountDownLatch implements findFirstAndLastInteractiveTime<T> {
    private volatile boolean AudioAttributesCompatParcelizer;
    SchemaLessonStatus RemoteActionCompatParcelizer;
    Throwable read;
    T write;

    public setExtension() {
        super(1);
    }

    @Override // kotlin.findFirstAndLastInteractiveTime, kotlin.SchemaUserStatusRSModel
    public final void AudioAttributesCompatParcelizer(SchemaLessonStatus schemaLessonStatus) {
        if (getCreatedOn.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, schemaLessonStatus)) {
            this.RemoteActionCompatParcelizer = schemaLessonStatus;
            schemaLessonStatus.write(Long.MAX_VALUE);
        }
    }

    @Override // kotlin.SchemaUserStatusRSModel
    public final void aJ_() {
        countDown();
    }

    public final T RemoteActionCompatParcelizer() {
        if (getCount() != 0) {
            try {
                ModuleSubscriptionData.RemoteActionCompatParcelizer();
                await();
            } catch (InterruptedException e) {
                SchemaLessonStatus schemaLessonStatus = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = getCreatedOn.CANCELLED;
                if (schemaLessonStatus != null) {
                    schemaLessonStatus.AudioAttributesCompatParcelizer();
                }
                throw OrderDetails.RemoteActionCompatParcelizer(e);
            }
        }
        Throwable th = this.read;
        if (th != null) {
            throw OrderDetails.RemoteActionCompatParcelizer(th);
        }
        return this.write;
    }
}
