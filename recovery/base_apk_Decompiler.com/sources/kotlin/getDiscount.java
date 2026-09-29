package kotlin;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.getIds;

/* JADX INFO: loaded from: classes.dex */
public final class getDiscount<T> extends setQuestion<T, T> {
    private getIds IconCompatParcelizer;
    private boolean read;

    public getDiscount(accessgetEmptyStatecp<T> accessgetemptystatecp, getIds getids, boolean z) {
        super(accessgetemptystatecp);
        this.IconCompatParcelizer = getids;
        this.read = z;
    }

    @Override // kotlin.accessgetEmptyStatecp
    public final void read(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel) {
        getIds.IconCompatParcelizer IconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer();
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(schemaUserStatusRSModel, IconCompatParcelizer, this.write, this.read);
        schemaUserStatusRSModel.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer);
        IconCompatParcelizer.read(remoteActionCompatParcelizer);
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class RemoteActionCompatParcelizer<T> extends AtomicReference<Thread> implements findFirstAndLastInteractiveTime<T>, SchemaLessonStatus, Runnable {
        private SchemaCompletionStatusRSModel<T> AudioAttributesCompatParcelizer;
        private getIds.IconCompatParcelizer AudioAttributesImplBaseParcelizer;
        private boolean RemoteActionCompatParcelizer;
        private SchemaUserStatusRSModel<? super T> read;
        private AtomicReference<SchemaLessonStatus> IconCompatParcelizer = new AtomicReference<>();
        private AtomicLong write = new AtomicLong();

        RemoteActionCompatParcelizer(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel, getIds.IconCompatParcelizer iconCompatParcelizer, SchemaCompletionStatusRSModel<T> schemaCompletionStatusRSModel, boolean z) {
            this.read = schemaUserStatusRSModel;
            this.AudioAttributesImplBaseParcelizer = iconCompatParcelizer;
            this.AudioAttributesCompatParcelizer = schemaCompletionStatusRSModel;
            this.RemoteActionCompatParcelizer = !z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            lazySet(Thread.currentThread());
            SchemaCompletionStatusRSModel<T> schemaCompletionStatusRSModel = this.AudioAttributesCompatParcelizer;
            this.AudioAttributesCompatParcelizer = null;
            schemaCompletionStatusRSModel.write(this);
        }

        @Override // kotlin.findFirstAndLastInteractiveTime, kotlin.SchemaUserStatusRSModel
        public final void AudioAttributesCompatParcelizer(SchemaLessonStatus schemaLessonStatus) {
            if (getCreatedOn.write(this.IconCompatParcelizer, schemaLessonStatus)) {
                long andSet = this.write.getAndSet(0L);
                if (andSet != 0) {
                    read(andSet, schemaLessonStatus);
                }
            }
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void a_(T t) {
            this.read.a_(t);
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void AudioAttributesCompatParcelizer(Throwable th) {
            this.read.AudioAttributesCompatParcelizer(th);
            this.AudioAttributesImplBaseParcelizer.aL_();
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void aJ_() {
            this.read.aJ_();
            this.AudioAttributesImplBaseParcelizer.aL_();
        }

        @Override // kotlin.SchemaLessonStatus
        public final void write(long j) {
            if (getCreatedOn.AudioAttributesCompatParcelizer(j)) {
                SchemaLessonStatus schemaLessonStatus = this.IconCompatParcelizer.get();
                if (schemaLessonStatus != null) {
                    read(j, schemaLessonStatus);
                    return;
                }
                getAccessLevel.RemoteActionCompatParcelizer(this.write, j);
                SchemaLessonStatus schemaLessonStatus2 = this.IconCompatParcelizer.get();
                if (schemaLessonStatus2 != null) {
                    long andSet = this.write.getAndSet(0L);
                    if (andSet != 0) {
                        read(andSet, schemaLessonStatus2);
                    }
                }
            }
        }

        private void read(long j, SchemaLessonStatus schemaLessonStatus) {
            if (this.RemoteActionCompatParcelizer || Thread.currentThread() == get()) {
                schemaLessonStatus.write(j);
            } else {
                this.AudioAttributesImplBaseParcelizer.read(new IconCompatParcelizer(schemaLessonStatus, j));
            }
        }

        @Override // kotlin.SchemaLessonStatus
        public final void AudioAttributesCompatParcelizer() {
            getCreatedOn.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
            this.AudioAttributesImplBaseParcelizer.aL_();
        }

        static final class IconCompatParcelizer implements Runnable {
            private final SchemaLessonStatus AudioAttributesCompatParcelizer;
            private final long IconCompatParcelizer;

            IconCompatParcelizer(SchemaLessonStatus schemaLessonStatus, long j) {
                this.AudioAttributesCompatParcelizer = schemaLessonStatus;
                this.IconCompatParcelizer = j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.AudioAttributesCompatParcelizer.write(this.IconCompatParcelizer);
            }
        }
    }
}
