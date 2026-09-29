package kotlin;

import com.google.android.exoplayer2.C;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public abstract class isFreeAccessAvailable<T, R> extends AtomicLong implements findFirstAndLastInteractiveTime<T>, SchemaLessonStatus {
    public long AudioAttributesCompatParcelizer;
    public final SchemaUserStatusRSModel<? super R> IconCompatParcelizer;
    private SchemaLessonStatus RemoteActionCompatParcelizer;
    private R read;

    public isFreeAccessAvailable(SchemaUserStatusRSModel<? super R> schemaUserStatusRSModel) {
        this.IconCompatParcelizer = schemaUserStatusRSModel;
    }

    @Override // kotlin.findFirstAndLastInteractiveTime, kotlin.SchemaUserStatusRSModel
    public final void AudioAttributesCompatParcelizer(SchemaLessonStatus schemaLessonStatus) {
        if (getCreatedOn.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, schemaLessonStatus)) {
            this.RemoteActionCompatParcelizer = schemaLessonStatus;
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this);
        }
    }

    protected final void read(R r) {
        long j = this.AudioAttributesCompatParcelizer;
        if (j != 0) {
            getAccessLevel.write(this, j);
        }
        while (true) {
            long j2 = get();
            if ((j2 & Long.MIN_VALUE) != 0) {
                return;
            }
            if ((j2 & Long.MAX_VALUE) != 0) {
                lazySet(C.TIME_UNSET);
                this.IconCompatParcelizer.a_(r);
                this.IconCompatParcelizer.aJ_();
                return;
            } else {
                this.read = r;
                if (compareAndSet(0L, Long.MIN_VALUE)) {
                    return;
                } else {
                    this.read = null;
                }
            }
        }
    }

    @Override // kotlin.SchemaLessonStatus
    public final void write(long j) {
        long j2;
        if (getCreatedOn.AudioAttributesCompatParcelizer(j)) {
            do {
                j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, C.TIME_UNSET)) {
                        this.IconCompatParcelizer.a_(this.read);
                        this.IconCompatParcelizer.aJ_();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j2, getAccessLevel.write(j2, j)));
            this.RemoteActionCompatParcelizer.write(j);
        }
    }

    @Override // kotlin.SchemaLessonStatus
    public final void AudioAttributesCompatParcelizer() {
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
    }
}
