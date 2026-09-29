package kotlin;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class setSequenceId<T, U> extends setQuestion<T, U> {
    private boolean AudioAttributesCompatParcelizer;
    private int IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    private getSubjectTitle<? super T, ? extends SchemaCompletionStatusRSModel<? extends U>> read;

    public setSequenceId(accessgetEmptyStatecp<T> accessgetemptystatecp, getSubjectTitle<? super T, ? extends SchemaCompletionStatusRSModel<? extends U>> getsubjecttitle, boolean z, int i, int i2) {
        super(accessgetemptystatecp);
        this.read = getsubjecttitle;
        this.AudioAttributesCompatParcelizer = false;
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = i2;
    }

    @Override // kotlin.accessgetEmptyStatecp
    public final void read(SchemaUserStatusRSModel<? super U> schemaUserStatusRSModel) {
        if (getPrice.AudioAttributesCompatParcelizer(this.write, schemaUserStatusRSModel, this.read)) {
            return;
        }
        this.write.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(schemaUserStatusRSModel, this.read, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer));
    }

    private static <T, U> findFirstAndLastInteractiveTime<T> AudioAttributesCompatParcelizer(SchemaUserStatusRSModel<? super U> schemaUserStatusRSModel, getSubjectTitle<? super T, ? extends SchemaCompletionStatusRSModel<? extends U>> getsubjecttitle, boolean z, int i, int i2) {
        return new IconCompatParcelizer(schemaUserStatusRSModel, getsubjecttitle, z, i, i2);
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class IconCompatParcelizer<T, U> extends AtomicInteger implements findFirstAndLastInteractiveTime<T>, SchemaLessonStatus {
        private static write<?, ?>[] AudioAttributesCompatParcelizer = new write[0];
        private static write<?, ?>[] IconCompatParcelizer = new write[0];
        private int AudioAttributesImplApi21Parcelizer;
        private getContentNameForEvent AudioAttributesImplApi26Parcelizer = new getContentNameForEvent();
        private boolean AudioAttributesImplBaseParcelizer;
        private long MediaBrowserCompatCustomActionResultReceiver;
        private volatile boolean MediaBrowserCompatItemReceiver;
        private volatile toUiModel<U> MediaBrowserCompatMediaItem;
        private int MediaBrowserCompatSearchResultReceiver;
        private SchemaLessonStatus MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private int MediaDescriptionCompat;
        private AtomicLong MediaMetadataCompat;
        private getSubjectTitle<? super T, ? extends SchemaCompletionStatusRSModel<? extends U>> RatingCompat;
        private SchemaUserStatusRSModel<? super U> RemoteActionCompatParcelizer;
        private AtomicReference<write<?, ?>[]> handleMediaPlayPauseIfPendingOnHandler;
        private int onAddQueueItem;
        private long onCustomAction;
        final int read;
        private volatile boolean write;

        IconCompatParcelizer(SchemaUserStatusRSModel<? super U> schemaUserStatusRSModel, getSubjectTitle<? super T, ? extends SchemaCompletionStatusRSModel<? extends U>> getsubjecttitle, boolean z, int i, int i2) {
            AtomicReference<write<?, ?>[]> atomicReference = new AtomicReference<>();
            this.handleMediaPlayPauseIfPendingOnHandler = atomicReference;
            this.MediaMetadataCompat = new AtomicLong();
            this.RemoteActionCompatParcelizer = schemaUserStatusRSModel;
            this.RatingCompat = getsubjecttitle;
            this.AudioAttributesImplBaseParcelizer = z;
            this.MediaBrowserCompatSearchResultReceiver = i;
            this.read = i2;
            this.onAddQueueItem = Math.max(1, i >> 1);
            atomicReference.lazySet(AudioAttributesCompatParcelizer);
        }

        @Override // kotlin.findFirstAndLastInteractiveTime, kotlin.SchemaUserStatusRSModel
        public final void AudioAttributesCompatParcelizer(SchemaLessonStatus schemaLessonStatus) {
            if (getCreatedOn.AudioAttributesCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, schemaLessonStatus)) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = schemaLessonStatus;
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this);
                if (this.write) {
                    return;
                }
                int i = this.MediaBrowserCompatSearchResultReceiver;
                if (i == Integer.MAX_VALUE) {
                    schemaLessonStatus.write(Long.MAX_VALUE);
                } else {
                    schemaLessonStatus.write(i);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.SchemaUserStatusRSModel
        public final void a_(T t) {
            if (this.MediaBrowserCompatItemReceiver) {
                return;
            }
            try {
                SchemaCompletionStatusRSModel schemaCompletionStatusRSModel = (SchemaCompletionStatusRSModel) setHasPyt.AudioAttributesCompatParcelizer(this.RatingCompat.apply(t), "The mapper returned a null Publisher");
                if (schemaCompletionStatusRSModel instanceof Callable) {
                    try {
                        Object objCall = ((Callable) schemaCompletionStatusRSModel).call();
                        if (objCall != null) {
                            read(objCall);
                            return;
                        }
                        if (this.MediaBrowserCompatSearchResultReceiver == Integer.MAX_VALUE || this.write) {
                            return;
                        }
                        int i = this.MediaDescriptionCompat + 1;
                        this.MediaDescriptionCompat = i;
                        int i2 = this.onAddQueueItem;
                        if (i == i2) {
                            this.MediaDescriptionCompat = 0;
                            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(i2);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        getEndTimeMs.RemoteActionCompatParcelizer(th);
                        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(th);
                        RemoteActionCompatParcelizer();
                        return;
                    }
                }
                long j = this.onCustomAction;
                this.onCustomAction = 1 + j;
                write writeVar = new write(this, j);
                if (RemoteActionCompatParcelizer(writeVar)) {
                    schemaCompletionStatusRSModel.write(writeVar);
                }
            } catch (Throwable th2) {
                getEndTimeMs.RemoteActionCompatParcelizer(th2);
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer();
                AudioAttributesCompatParcelizer(th2);
            }
        }

        private boolean RemoteActionCompatParcelizer(write<T, U> writeVar) {
            write<?, ?>[] writeVarArr;
            write[] writeVarArr2;
            do {
                writeVarArr = this.handleMediaPlayPauseIfPendingOnHandler.get();
                if (writeVarArr == IconCompatParcelizer) {
                    writeVar.aL_();
                    return false;
                }
                int length = writeVarArr.length;
                writeVarArr2 = new write[length + 1];
                System.arraycopy(writeVarArr, 0, writeVarArr2, 0, length);
                writeVarArr2[length] = writeVar;
            } while (!setBackInvokedCallbackEnabled.read(this.handleMediaPlayPauseIfPendingOnHandler, writeVarArr, writeVarArr2));
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void IconCompatParcelizer(write<T, U> writeVar) {
            write<?, ?>[] writeVarArr;
            write<?, ?>[] writeVarArr2;
            do {
                writeVarArr = this.handleMediaPlayPauseIfPendingOnHandler.get();
                int length = writeVarArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (writeVarArr[i] == writeVar) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    writeVarArr2 = AudioAttributesCompatParcelizer;
                } else {
                    write<?, ?>[] writeVarArr3 = new write[length - 1];
                    System.arraycopy(writeVarArr, 0, writeVarArr3, 0, i);
                    System.arraycopy(writeVarArr, i + 1, writeVarArr3, i, (length - i) - 1);
                    writeVarArr2 = writeVarArr3;
                }
            } while (!setBackInvokedCallbackEnabled.read(this.handleMediaPlayPauseIfPendingOnHandler, writeVarArr, writeVarArr2));
        }

        private toLSModel<U> AudioAttributesImplBaseParcelizer() {
            toUiModel<U> pearlResponseBody = this.MediaBrowserCompatMediaItem;
            if (pearlResponseBody == null) {
                if (this.MediaBrowserCompatSearchResultReceiver == Integer.MAX_VALUE) {
                    pearlResponseBody = new PaymentStatusResponseKt<>(this.read);
                } else {
                    pearlResponseBody = new PearlResponseBody<>(this.MediaBrowserCompatSearchResultReceiver);
                }
                this.MediaBrowserCompatMediaItem = pearlResponseBody;
            }
            return pearlResponseBody;
        }

        private void read(U u) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.MediaMetadataCompat.get();
                toLSModel<U> tolsmodelAudioAttributesImplBaseParcelizer = this.MediaBrowserCompatMediaItem;
                if (j != 0 && (tolsmodelAudioAttributesImplBaseParcelizer == null || tolsmodelAudioAttributesImplBaseParcelizer.IconCompatParcelizer())) {
                    this.RemoteActionCompatParcelizer.a_(u);
                    if (j != Long.MAX_VALUE) {
                        this.MediaMetadataCompat.decrementAndGet();
                    }
                    if (this.MediaBrowserCompatSearchResultReceiver != Integer.MAX_VALUE && !this.write) {
                        int i = this.MediaDescriptionCompat + 1;
                        this.MediaDescriptionCompat = i;
                        int i2 = this.onAddQueueItem;
                        if (i == i2) {
                            this.MediaDescriptionCompat = 0;
                            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.write(i2);
                        }
                    }
                } else {
                    if (tolsmodelAudioAttributesImplBaseParcelizer == null) {
                        tolsmodelAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
                    }
                    if (!tolsmodelAudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(u)) {
                        AudioAttributesCompatParcelizer(new IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer(u)) {
                AudioAttributesCompatParcelizer(new IllegalStateException("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            MediaBrowserCompatCustomActionResultReceiver();
        }

        private toLSModel<U> read(write<T, U> writeVar) {
            toLSModel<U> tolsmodel = writeVar.RemoteActionCompatParcelizer;
            if (tolsmodel != null) {
                return tolsmodel;
            }
            PearlResponseBody pearlResponseBody = new PearlResponseBody(this.read);
            writeVar.RemoteActionCompatParcelizer = pearlResponseBody;
            return pearlResponseBody;
        }

        final void RemoteActionCompatParcelizer(U u, write<T, U> writeVar) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.MediaMetadataCompat.get();
                toLSModel<U> tolsmodel = writeVar.RemoteActionCompatParcelizer;
                if (j != 0 && (tolsmodel == null || tolsmodel.IconCompatParcelizer())) {
                    this.RemoteActionCompatParcelizer.a_(u);
                    if (j != Long.MAX_VALUE) {
                        this.MediaMetadataCompat.decrementAndGet();
                    }
                    writeVar.AudioAttributesCompatParcelizer(1L);
                } else {
                    if (tolsmodel == null) {
                        tolsmodel = read((write) writeVar);
                    }
                    if (!tolsmodel.RemoteActionCompatParcelizer(u)) {
                        AudioAttributesCompatParcelizer(new getLastUpdated("Inner queue full?!"));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                toLSModel pearlResponseBody = writeVar.RemoteActionCompatParcelizer;
                if (pearlResponseBody == null) {
                    pearlResponseBody = new PearlResponseBody(this.read);
                    writeVar.RemoteActionCompatParcelizer = pearlResponseBody;
                }
                if (!pearlResponseBody.RemoteActionCompatParcelizer(u)) {
                    AudioAttributesCompatParcelizer(new getLastUpdated("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            }
            MediaBrowserCompatCustomActionResultReceiver();
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void AudioAttributesCompatParcelizer(Throwable th) {
            if (this.MediaBrowserCompatItemReceiver) {
                getPaymentRefIds.RemoteActionCompatParcelizer(th);
            } else if (this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(th)) {
                this.MediaBrowserCompatItemReceiver = true;
                RemoteActionCompatParcelizer();
            } else {
                getPaymentRefIds.RemoteActionCompatParcelizer(th);
            }
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void aJ_() {
            if (this.MediaBrowserCompatItemReceiver) {
                return;
            }
            this.MediaBrowserCompatItemReceiver = true;
            RemoteActionCompatParcelizer();
        }

        @Override // kotlin.SchemaLessonStatus
        public final void write(long j) {
            if (getCreatedOn.AudioAttributesCompatParcelizer(j)) {
                getAccessLevel.RemoteActionCompatParcelizer(this.MediaMetadataCompat, j);
                RemoteActionCompatParcelizer();
            }
        }

        @Override // kotlin.SchemaLessonStatus
        public final void AudioAttributesCompatParcelizer() {
            toUiModel<U> touimodel;
            if (this.write) {
                return;
            }
            this.write = true;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer();
            AudioAttributesImplApi26Parcelizer();
            if (getAndIncrement() != 0 || (touimodel = this.MediaBrowserCompatMediaItem) == null) {
                return;
            }
            touimodel.RemoteActionCompatParcelizer();
        }

        final void RemoteActionCompatParcelizer() {
            if (getAndIncrement() == 0) {
                MediaBrowserCompatCustomActionResultReceiver();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:87:0x012e, code lost:
        
            if (r10 == r14) goto L92;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x0130, code lost:
        
            if (r9 != false) goto L90;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x0132, code lost:
        
            r5 = r24.MediaMetadataCompat.addAndGet(-r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x013a, code lost:
        
            r5 = Long.MAX_VALUE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x013f, code lost:
        
            r7.AudioAttributesCompatParcelizer(r10);
            r10 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x0145, code lost:
        
            r10 = r14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x0148, code lost:
        
            if (r5 == r10) goto L155;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x014a, code lost:
        
            if (r22 != null) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x014d, code lost:
        
            r10 = r13;
            r11 = r22;
            r14 = 0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void MediaBrowserCompatCustomActionResultReceiver() {
            /*
                Method dump skipped, instruction units count: 442
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setSequenceId.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver():void");
        }

        private boolean IconCompatParcelizer() {
            if (this.write) {
                write();
                return true;
            }
            if (this.AudioAttributesImplBaseParcelizer || this.AudioAttributesImplApi26Parcelizer.get() == null) {
                return false;
            }
            write();
            Throwable th = this.AudioAttributesImplApi26Parcelizer.read();
            if (th != OrderDetails.RemoteActionCompatParcelizer) {
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(th);
            }
            return true;
        }

        private void write() {
            toUiModel<U> touimodel = this.MediaBrowserCompatMediaItem;
            if (touimodel != null) {
                touimodel.RemoteActionCompatParcelizer();
            }
        }

        private void AudioAttributesImplApi26Parcelizer() {
            write<?, ?>[] andSet;
            write<?, ?>[] writeVarArr = this.handleMediaPlayPauseIfPendingOnHandler.get();
            write<?, ?>[] writeVarArr2 = IconCompatParcelizer;
            if (writeVarArr == writeVarArr2 || (andSet = this.handleMediaPlayPauseIfPendingOnHandler.getAndSet(writeVarArr2)) == writeVarArr2) {
                return;
            }
            for (write<?, ?> writeVar : andSet) {
                writeVar.aL_();
            }
            Throwable th = this.AudioAttributesImplApi26Parcelizer.read();
            if (th == null || th == OrderDetails.RemoteActionCompatParcelizer) {
                return;
            }
            getPaymentRefIds.RemoteActionCompatParcelizer(th);
        }

        final void write(write<T, U> writeVar, Throwable th) {
            if (this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(th)) {
                writeVar.read = true;
                if (!this.AudioAttributesImplBaseParcelizer) {
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer();
                    for (write<?, ?> writeVar2 : this.handleMediaPlayPauseIfPendingOnHandler.getAndSet(IconCompatParcelizer)) {
                        writeVar2.aL_();
                    }
                }
                RemoteActionCompatParcelizer();
                return;
            }
            getPaymentRefIds.RemoteActionCompatParcelizer(th);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class write<T, U> extends AtomicReference<SchemaLessonStatus> implements findFirstAndLastInteractiveTime<U>, MarkIncompleteResponseBody {
        private int AudioAttributesCompatParcelizer;
        private long AudioAttributesImplApi21Parcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        final long IconCompatParcelizer;
        private IconCompatParcelizer<T, U> MediaBrowserCompatCustomActionResultReceiver;
        volatile toLSModel<U> RemoteActionCompatParcelizer;
        volatile boolean read;
        private int write;

        write(IconCompatParcelizer<T, U> iconCompatParcelizer, long j) {
            this.IconCompatParcelizer = j;
            this.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizer;
            int i = iconCompatParcelizer.read;
            this.AudioAttributesCompatParcelizer = i;
            this.AudioAttributesImplApi26Parcelizer = i >> 2;
        }

        @Override // kotlin.findFirstAndLastInteractiveTime, kotlin.SchemaUserStatusRSModel
        public final void AudioAttributesCompatParcelizer(SchemaLessonStatus schemaLessonStatus) {
            if (getCreatedOn.write(this, schemaLessonStatus)) {
                if (schemaLessonStatus instanceof setShown) {
                    setShown setshown = (setShown) schemaLessonStatus;
                    int iWrite = setshown.write(7);
                    if (iWrite == 1) {
                        this.write = iWrite;
                        this.RemoteActionCompatParcelizer = setshown;
                        this.read = true;
                        this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer();
                        return;
                    }
                    if (iWrite == 2) {
                        this.write = iWrite;
                        this.RemoteActionCompatParcelizer = setshown;
                    }
                }
                schemaLessonStatus.write(this.AudioAttributesCompatParcelizer);
            }
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void a_(U u) {
            if (this.write != 2) {
                this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(u, this);
            } else {
                this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer();
            }
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void AudioAttributesCompatParcelizer(Throwable th) {
            lazySet(getCreatedOn.CANCELLED);
            this.MediaBrowserCompatCustomActionResultReceiver.write(this, th);
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void aJ_() {
            this.read = true;
            this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer();
        }

        final void AudioAttributesCompatParcelizer(long j) {
            if (this.write != 1) {
                long j2 = this.AudioAttributesImplApi21Parcelizer + j;
                if (j2 >= this.AudioAttributesImplApi26Parcelizer) {
                    this.AudioAttributesImplApi21Parcelizer = 0L;
                    get().write(j2);
                } else {
                    this.AudioAttributesImplApi21Parcelizer = j2;
                }
            }
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final void aL_() {
            getCreatedOn.AudioAttributesCompatParcelizer(this);
        }

        @Override // kotlin.MarkIncompleteResponseBody
        public final boolean write() {
            return get() == getCreatedOn.CANCELLED;
        }
    }
}
