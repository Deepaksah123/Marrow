package kotlin;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class getPlanDetails<T> extends setQuestion<T, T> {
    private boolean AudioAttributesCompatParcelizer;
    private isTagActive IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    private boolean read;

    public getPlanDetails(accessgetEmptyStatecp<T> accessgetemptystatecp, int i, boolean z, boolean z2, isTagActive istagactive) {
        super(accessgetemptystatecp);
        this.RemoteActionCompatParcelizer = i;
        this.AudioAttributesCompatParcelizer = true;
        this.read = false;
        this.IconCompatParcelizer = istagactive;
    }

    @Override // kotlin.accessgetEmptyStatecp
    public final void read(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel) {
        this.write.RemoteActionCompatParcelizer(new RemoteActionCompatParcelizer(schemaUserStatusRSModel, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.read, this.IconCompatParcelizer));
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class RemoteActionCompatParcelizer<T> extends FreeAccessAvailabilityResponse<T> implements findFirstAndLastInteractiveTime<T> {
        private boolean AudioAttributesCompatParcelizer;
        private isTagActive AudioAttributesImplApi21Parcelizer;
        private toUiModel<T> AudioAttributesImplApi26Parcelizer;
        private AtomicLong AudioAttributesImplBaseParcelizer = new AtomicLong();
        private volatile boolean IconCompatParcelizer;
        private SchemaLessonStatus MediaBrowserCompatCustomActionResultReceiver;
        private boolean MediaBrowserCompatItemReceiver;
        private SchemaUserStatusRSModel<? super T> RemoteActionCompatParcelizer;
        private Throwable read;
        private volatile boolean write;

        RemoteActionCompatParcelizer(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel, int i, boolean z, boolean z2, isTagActive istagactive) {
            toUiModel<T> pearlResponseBody;
            this.RemoteActionCompatParcelizer = schemaUserStatusRSModel;
            this.AudioAttributesImplApi21Parcelizer = istagactive;
            this.AudioAttributesCompatParcelizer = z2;
            if (z) {
                pearlResponseBody = new PaymentStatusResponseKt<>(i);
            } else {
                pearlResponseBody = new PearlResponseBody<>(i);
            }
            this.AudioAttributesImplApi26Parcelizer = pearlResponseBody;
        }

        @Override // kotlin.findFirstAndLastInteractiveTime, kotlin.SchemaUserStatusRSModel
        public final void AudioAttributesCompatParcelizer(SchemaLessonStatus schemaLessonStatus) {
            if (getCreatedOn.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, schemaLessonStatus)) {
                this.MediaBrowserCompatCustomActionResultReceiver = schemaLessonStatus;
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this);
                schemaLessonStatus.write(Long.MAX_VALUE);
            }
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void a_(T t) {
            if (!this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(t)) {
                this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer();
                getLastUpdated getlastupdated = new getLastUpdated("Buffer is full");
                try {
                    this.AudioAttributesImplApi21Parcelizer.write();
                } catch (Throwable th) {
                    getEndTimeMs.RemoteActionCompatParcelizer(th);
                    getlastupdated.initCause(th);
                }
                AudioAttributesCompatParcelizer(getlastupdated);
                return;
            }
            if (this.MediaBrowserCompatItemReceiver) {
                this.RemoteActionCompatParcelizer.a_(null);
            } else {
                write();
            }
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void AudioAttributesCompatParcelizer(Throwable th) {
            this.read = th;
            this.write = true;
            if (this.MediaBrowserCompatItemReceiver) {
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(th);
            } else {
                write();
            }
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void aJ_() {
            this.write = true;
            if (this.MediaBrowserCompatItemReceiver) {
                this.RemoteActionCompatParcelizer.aJ_();
            } else {
                write();
            }
        }

        @Override // kotlin.SchemaLessonStatus
        public final void write(long j) {
            if (this.MediaBrowserCompatItemReceiver || !getCreatedOn.AudioAttributesCompatParcelizer(j)) {
                return;
            }
            getAccessLevel.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, j);
            write();
        }

        @Override // kotlin.SchemaLessonStatus
        public final void AudioAttributesCompatParcelizer() {
            if (this.IconCompatParcelizer) {
                return;
            }
            this.IconCompatParcelizer = true;
            this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer();
            if (getAndIncrement() == 0) {
                this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
            }
        }

        private void write() {
            if (getAndIncrement() == 0) {
                toUiModel<T> touimodel = this.AudioAttributesImplApi26Parcelizer;
                SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel = this.RemoteActionCompatParcelizer;
                int iAddAndGet = 1;
                while (!write(this.write, touimodel.IconCompatParcelizer(), schemaUserStatusRSModel)) {
                    long j = this.AudioAttributesImplBaseParcelizer.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.write;
                        T t = touimodel.read();
                        boolean z2 = t == null;
                        if (!write(z, z2, schemaUserStatusRSModel)) {
                            if (z2) {
                                break;
                            }
                            schemaUserStatusRSModel.a_(t);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (j2 == j && write(this.write, touimodel.IconCompatParcelizer(), schemaUserStatusRSModel)) {
                        return;
                    }
                    if (j2 != 0 && j != Long.MAX_VALUE) {
                        this.AudioAttributesImplBaseParcelizer.addAndGet(-j2);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        private boolean write(boolean z, boolean z2, SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel) {
            if (this.IconCompatParcelizer) {
                this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.AudioAttributesCompatParcelizer) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.read;
                if (th != null) {
                    schemaUserStatusRSModel.AudioAttributesCompatParcelizer(th);
                } else {
                    schemaUserStatusRSModel.aJ_();
                }
                return true;
            }
            Throwable th2 = this.read;
            if (th2 != null) {
                this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
                schemaUserStatusRSModel.AudioAttributesCompatParcelizer(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            schemaUserStatusRSModel.aJ_();
            return true;
        }

        @Override // kotlin.isShown
        public final int write(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.MediaBrowserCompatItemReceiver = true;
            return 2;
        }

        @Override // kotlin.toLSModel
        public final T read() throws Exception {
            return this.AudioAttributesImplApi26Parcelizer.read();
        }

        @Override // kotlin.toLSModel
        public final void RemoteActionCompatParcelizer() {
            this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
        }

        @Override // kotlin.toLSModel
        public final boolean IconCompatParcelizer() {
            return this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
        }
    }
}
