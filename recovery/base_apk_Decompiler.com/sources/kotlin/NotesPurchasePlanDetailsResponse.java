package kotlin;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class NotesPurchasePlanDetailsResponse<T> extends setQuestion<T, T> {
    public NotesPurchasePlanDetailsResponse(accessgetEmptyStatecp<T> accessgetemptystatecp) {
        super(accessgetemptystatecp);
    }

    @Override // kotlin.accessgetEmptyStatecp
    public final void read(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel) {
        this.write.RemoteActionCompatParcelizer(new AudioAttributesCompatParcelizer(schemaUserStatusRSModel));
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class AudioAttributesCompatParcelizer<T> extends AtomicInteger implements findFirstAndLastInteractiveTime<T>, SchemaLessonStatus {
        private volatile boolean AudioAttributesCompatParcelizer;
        private SchemaLessonStatus AudioAttributesImplApi26Parcelizer;
        private SchemaUserStatusRSModel<? super T> IconCompatParcelizer;
        private Throwable RemoteActionCompatParcelizer;
        private volatile boolean read;
        private AtomicLong AudioAttributesImplApi21Parcelizer = new AtomicLong();
        private AtomicReference<T> write = new AtomicReference<>();

        AudioAttributesCompatParcelizer(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel) {
            this.IconCompatParcelizer = schemaUserStatusRSModel;
        }

        @Override // kotlin.findFirstAndLastInteractiveTime, kotlin.SchemaUserStatusRSModel
        public final void AudioAttributesCompatParcelizer(SchemaLessonStatus schemaLessonStatus) {
            if (getCreatedOn.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, schemaLessonStatus)) {
                this.AudioAttributesImplApi26Parcelizer = schemaLessonStatus;
                this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this);
                schemaLessonStatus.write(Long.MAX_VALUE);
            }
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void a_(T t) {
            this.write.lazySet(t);
            RemoteActionCompatParcelizer();
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void AudioAttributesCompatParcelizer(Throwable th) {
            this.RemoteActionCompatParcelizer = th;
            this.read = true;
            RemoteActionCompatParcelizer();
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void aJ_() {
            this.read = true;
            RemoteActionCompatParcelizer();
        }

        @Override // kotlin.SchemaLessonStatus
        public final void write(long j) {
            if (getCreatedOn.AudioAttributesCompatParcelizer(j)) {
                getAccessLevel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, j);
                RemoteActionCompatParcelizer();
            }
        }

        @Override // kotlin.SchemaLessonStatus
        public final void AudioAttributesCompatParcelizer() {
            if (this.AudioAttributesCompatParcelizer) {
                return;
            }
            this.AudioAttributesCompatParcelizer = true;
            this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
            if (getAndIncrement() == 0) {
                this.write.lazySet(null);
            }
        }

        private void RemoteActionCompatParcelizer() {
            if (getAndIncrement() == 0) {
                SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel = this.IconCompatParcelizer;
                AtomicLong atomicLong = this.AudioAttributesImplApi21Parcelizer;
                AtomicReference<T> atomicReference = this.write;
                int iAddAndGet = 1;
                do {
                    long j = 0;
                    while (true) {
                        if (j == atomicLong.get()) {
                            break;
                        }
                        boolean z = this.read;
                        T andSet = atomicReference.getAndSet(null);
                        boolean z2 = andSet == null;
                        if (!RemoteActionCompatParcelizer(z, z2, schemaUserStatusRSModel, atomicReference)) {
                            if (z2) {
                                break;
                            }
                            schemaUserStatusRSModel.a_(andSet);
                            j++;
                        } else {
                            return;
                        }
                    }
                    if (j == atomicLong.get()) {
                        if (RemoteActionCompatParcelizer(this.read, atomicReference.get() == null, schemaUserStatusRSModel, atomicReference)) {
                            return;
                        }
                    }
                    if (j != 0) {
                        getAccessLevel.write(atomicLong, j);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }

        private boolean RemoteActionCompatParcelizer(boolean z, boolean z2, SchemaUserStatusRSModel<?> schemaUserStatusRSModel, AtomicReference<T> atomicReference) {
            if (this.AudioAttributesCompatParcelizer) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.RemoteActionCompatParcelizer;
            if (th != null) {
                atomicReference.lazySet(null);
                schemaUserStatusRSModel.AudioAttributesCompatParcelizer(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            schemaUserStatusRSModel.aJ_();
            return true;
        }
    }
}
