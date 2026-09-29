package kotlin;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class isApplied<T> extends AtomicInteger implements findFirstAndLastInteractiveTime<T>, SchemaLessonStatus {
    private volatile boolean IconCompatParcelizer;
    private SchemaUserStatusRSModel<? super T> write;
    private getContentNameForEvent RemoteActionCompatParcelizer = new getContentNameForEvent();
    private AtomicLong AudioAttributesCompatParcelizer = new AtomicLong();
    private AtomicReference<SchemaLessonStatus> AudioAttributesImplApi26Parcelizer = new AtomicReference<>();
    private AtomicBoolean read = new AtomicBoolean();

    public isApplied(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel) {
        this.write = schemaUserStatusRSModel;
    }

    @Override // kotlin.SchemaLessonStatus
    public final void write(long j) {
        if (j <= 0) {
            AudioAttributesCompatParcelizer();
            AudioAttributesCompatParcelizer(new IllegalArgumentException("§3.9 violated: positive request amount required but it was ".concat(String.valueOf(j))));
        } else {
            getCreatedOn.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesCompatParcelizer, j);
        }
    }

    @Override // kotlin.SchemaLessonStatus
    public final void AudioAttributesCompatParcelizer() {
        if (this.IconCompatParcelizer) {
            return;
        }
        getCreatedOn.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
    }

    @Override // kotlin.findFirstAndLastInteractiveTime, kotlin.SchemaUserStatusRSModel
    public final void AudioAttributesCompatParcelizer(SchemaLessonStatus schemaLessonStatus) {
        if (this.read.compareAndSet(false, true)) {
            this.write.AudioAttributesCompatParcelizer(this);
            getCreatedOn.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesCompatParcelizer, schemaLessonStatus);
        } else {
            schemaLessonStatus.AudioAttributesCompatParcelizer();
            AudioAttributesCompatParcelizer();
            AudioAttributesCompatParcelizer(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // kotlin.SchemaUserStatusRSModel
    public final void a_(T t) {
        getStartedOn.AudioAttributesCompatParcelizer(this.write, t, this, this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.SchemaUserStatusRSModel
    public final void AudioAttributesCompatParcelizer(Throwable th) {
        this.IconCompatParcelizer = true;
        getStartedOn.read(this.write, th, this, this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.SchemaUserStatusRSModel
    public final void aJ_() {
        this.IconCompatParcelizer = true;
        getStartedOn.AudioAttributesCompatParcelizer(this.write, this, this.RemoteActionCompatParcelizer);
    }
}
