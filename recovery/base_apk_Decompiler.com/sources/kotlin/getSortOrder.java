package kotlin;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.getGroupMcqId;

/* JADX INFO: loaded from: classes.dex */
public final class getSortOrder<T, R> extends accessgetEmptyStatecp<R> {
    final getSubjectTitle<? super Object[], ? extends R> AudioAttributesCompatParcelizer;
    private SchemaCompletionStatusRSModel<? extends T>[] IconCompatParcelizer;
    private int write;
    private Iterable<? extends SchemaCompletionStatusRSModel<? extends T>> read = null;
    private boolean RemoteActionCompatParcelizer = false;

    public getSortOrder(SchemaCompletionStatusRSModel<? extends T>[] schemaCompletionStatusRSModelArr, getSubjectTitle<? super Object[], ? extends R> getsubjecttitle, int i) {
        this.IconCompatParcelizer = schemaCompletionStatusRSModelArr;
        this.AudioAttributesCompatParcelizer = getsubjecttitle;
        this.write = i;
    }

    @Override // kotlin.accessgetEmptyStatecp
    public final void read(SchemaUserStatusRSModel<? super R> schemaUserStatusRSModel) {
        SchemaCompletionStatusRSModel<? extends T>[] schemaCompletionStatusRSModelArr = this.IconCompatParcelizer;
        if (schemaCompletionStatusRSModelArr == null) {
            try {
                throw new NullPointerException();
            } catch (Throwable th) {
                getEndTimeMs.RemoteActionCompatParcelizer(th);
                FreeAccessCouponResponse.IconCompatParcelizer(th, schemaUserStatusRSModel);
                return;
            }
        }
        int length = schemaCompletionStatusRSModelArr.length;
        if (length == 0) {
            FreeAccessCouponResponse.AudioAttributesCompatParcelizer(schemaUserStatusRSModel);
        } else {
            if (length == 1) {
                schemaCompletionStatusRSModelArr[0].write(new getGroupMcqId.IconCompatParcelizer(schemaUserStatusRSModel, new AudioAttributesCompatParcelizer()));
                return;
            }
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(schemaUserStatusRSModel, this.AudioAttributesCompatParcelizer, length, this.write, this.RemoteActionCompatParcelizer);
            schemaUserStatusRSModel.AudioAttributesCompatParcelizer(iconCompatParcelizer);
            iconCompatParcelizer.write(schemaCompletionStatusRSModelArr, length);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class IconCompatParcelizer<T, R> extends FreeAccessAvailabilityResponse<R> {
        private getSubjectTitle<? super Object[], ? extends R> AudioAttributesCompatParcelizer;
        private volatile boolean AudioAttributesImplApi21Parcelizer;
        private Object[] AudioAttributesImplApi26Parcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private volatile boolean IconCompatParcelizer;
        private boolean MediaBrowserCompatCustomActionResultReceiver;
        private AtomicReference<Throwable> MediaBrowserCompatItemReceiver;
        private PaymentStatusResponseKt<Object> MediaBrowserCompatMediaItem;
        private write<T>[] MediaDescriptionCompat;
        private AtomicLong RatingCompat;
        private SchemaUserStatusRSModel<? super R> RemoteActionCompatParcelizer;
        private boolean read;
        private int write;

        IconCompatParcelizer(SchemaUserStatusRSModel<? super R> schemaUserStatusRSModel, getSubjectTitle<? super Object[], ? extends R> getsubjecttitle, int i, int i2, boolean z) {
            this.RemoteActionCompatParcelizer = schemaUserStatusRSModel;
            this.AudioAttributesCompatParcelizer = getsubjecttitle;
            write<T>[] writeVarArr = new write[i];
            for (int i3 = 0; i3 < i; i3++) {
                writeVarArr[i3] = new write<>(this, i3, i2);
            }
            this.MediaDescriptionCompat = writeVarArr;
            this.AudioAttributesImplApi26Parcelizer = new Object[i];
            this.MediaBrowserCompatMediaItem = new PaymentStatusResponseKt<>(i2);
            this.RatingCompat = new AtomicLong();
            this.MediaBrowserCompatItemReceiver = new AtomicReference<>();
            this.read = z;
        }

        @Override // kotlin.SchemaLessonStatus
        public final void write(long j) {
            if (getCreatedOn.AudioAttributesCompatParcelizer(j)) {
                getAccessLevel.RemoteActionCompatParcelizer(this.RatingCompat, j);
                MediaBrowserCompatItemReceiver();
            }
        }

        @Override // kotlin.SchemaLessonStatus
        public final void AudioAttributesCompatParcelizer() {
            this.IconCompatParcelizer = true;
            write();
        }

        final void write(SchemaCompletionStatusRSModel<? extends T>[] schemaCompletionStatusRSModelArr, int i) {
            write<T>[] writeVarArr = this.MediaDescriptionCompat;
            for (int i2 = 0; i2 < i && !this.AudioAttributesImplApi21Parcelizer && !this.IconCompatParcelizer; i2++) {
                schemaCompletionStatusRSModelArr[i2].write(writeVarArr[i2]);
            }
        }

        final void RemoteActionCompatParcelizer(int i, T t) {
            boolean z;
            synchronized (this) {
                Object[] objArr = this.AudioAttributesImplApi26Parcelizer;
                int i2 = this.AudioAttributesImplBaseParcelizer;
                if (objArr[i] == null) {
                    i2++;
                    this.AudioAttributesImplBaseParcelizer = i2;
                }
                objArr[i] = t;
                if (objArr.length == i2) {
                    this.MediaBrowserCompatMediaItem.IconCompatParcelizer(this.MediaDescriptionCompat[i], objArr.clone());
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                this.MediaDescriptionCompat[i].IconCompatParcelizer();
            } else {
                MediaBrowserCompatItemReceiver();
            }
        }

        final void IconCompatParcelizer(int i) {
            int i2;
            synchronized (this) {
                Object[] objArr = this.AudioAttributesImplApi26Parcelizer;
                if (objArr[i] == null || (i2 = this.write + 1) == objArr.length) {
                    this.AudioAttributesImplApi21Parcelizer = true;
                    MediaBrowserCompatItemReceiver();
                } else {
                    this.write = i2;
                }
            }
        }

        final void read(int i, Throwable th) {
            if (OrderDetails.write(this.MediaBrowserCompatItemReceiver, th)) {
                if (!this.read) {
                    write();
                    this.AudioAttributesImplApi21Parcelizer = true;
                    MediaBrowserCompatItemReceiver();
                    return;
                }
                IconCompatParcelizer(i);
                return;
            }
            getPaymentRefIds.RemoteActionCompatParcelizer(th);
        }

        private void AudioAttributesImplApi26Parcelizer() {
            SchemaUserStatusRSModel<? super R> schemaUserStatusRSModel = this.RemoteActionCompatParcelizer;
            PaymentStatusResponseKt<Object> paymentStatusResponseKt = this.MediaBrowserCompatMediaItem;
            int iAddAndGet = 1;
            while (!this.IconCompatParcelizer) {
                Throwable th = this.MediaBrowserCompatItemReceiver.get();
                if (th != null) {
                    paymentStatusResponseKt.RemoteActionCompatParcelizer();
                    schemaUserStatusRSModel.AudioAttributesCompatParcelizer(th);
                    return;
                }
                boolean z = this.AudioAttributesImplApi21Parcelizer;
                boolean zIconCompatParcelizer = paymentStatusResponseKt.IconCompatParcelizer();
                if (!zIconCompatParcelizer) {
                    schemaUserStatusRSModel.a_(null);
                }
                if (z && zIconCompatParcelizer) {
                    schemaUserStatusRSModel.aJ_();
                    return;
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            paymentStatusResponseKt.RemoteActionCompatParcelizer();
        }

        private void MediaBrowserCompatCustomActionResultReceiver() {
            SchemaUserStatusRSModel<? super R> schemaUserStatusRSModel = this.RemoteActionCompatParcelizer;
            PaymentStatusResponseKt<?> paymentStatusResponseKt = this.MediaBrowserCompatMediaItem;
            int iAddAndGet = 1;
            do {
                long j = this.RatingCompat.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.AudioAttributesImplApi21Parcelizer;
                    Object obj = paymentStatusResponseKt.read();
                    boolean z2 = obj == null;
                    if (!write(z, z2, schemaUserStatusRSModel, paymentStatusResponseKt)) {
                        if (z2) {
                            break;
                        }
                        try {
                            schemaUserStatusRSModel.a_((Object) setHasPyt.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.apply((Object[]) paymentStatusResponseKt.read()), "The combiner returned a null value"));
                            ((write) obj).IconCompatParcelizer();
                            j2++;
                        } catch (Throwable th) {
                            getEndTimeMs.RemoteActionCompatParcelizer(th);
                            write();
                            OrderDetails.write(this.MediaBrowserCompatItemReceiver, th);
                            schemaUserStatusRSModel.AudioAttributesCompatParcelizer(OrderDetails.write(this.MediaBrowserCompatItemReceiver));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (j2 == j && write(this.AudioAttributesImplApi21Parcelizer, paymentStatusResponseKt.IconCompatParcelizer(), schemaUserStatusRSModel, paymentStatusResponseKt)) {
                    return;
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.RatingCompat.addAndGet(-j2);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        private void MediaBrowserCompatItemReceiver() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.MediaBrowserCompatCustomActionResultReceiver) {
                AudioAttributesImplApi26Parcelizer();
            } else {
                MediaBrowserCompatCustomActionResultReceiver();
            }
        }

        private boolean write(boolean z, boolean z2, SchemaUserStatusRSModel<?> schemaUserStatusRSModel, PaymentStatusResponseKt<?> paymentStatusResponseKt) {
            if (this.IconCompatParcelizer) {
                write();
                paymentStatusResponseKt.RemoteActionCompatParcelizer();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.read) {
                if (!z2) {
                    return false;
                }
                write();
                Throwable thWrite = OrderDetails.write(this.MediaBrowserCompatItemReceiver);
                if (thWrite != null && thWrite != OrderDetails.RemoteActionCompatParcelizer) {
                    schemaUserStatusRSModel.AudioAttributesCompatParcelizer(thWrite);
                } else {
                    schemaUserStatusRSModel.aJ_();
                }
                return true;
            }
            Throwable thWrite2 = OrderDetails.write(this.MediaBrowserCompatItemReceiver);
            if (thWrite2 != null && thWrite2 != OrderDetails.RemoteActionCompatParcelizer) {
                write();
                paymentStatusResponseKt.RemoteActionCompatParcelizer();
                schemaUserStatusRSModel.AudioAttributesCompatParcelizer(thWrite2);
                return true;
            }
            if (!z2) {
                return false;
            }
            write();
            schemaUserStatusRSModel.aJ_();
            return true;
        }

        private void write() {
            for (write<T> writeVar : this.MediaDescriptionCompat) {
                writeVar.write();
            }
        }

        @Override // kotlin.isShown
        public final int write(int i) {
            if ((i & 4) != 0) {
                return 0;
            }
            int i2 = i & 2;
            this.MediaBrowserCompatCustomActionResultReceiver = i2 != 0;
            return i2;
        }

        @Override // kotlin.toLSModel
        public final R read() throws Exception {
            Object obj = this.MediaBrowserCompatMediaItem.read();
            if (obj == null) {
                return null;
            }
            R r = (R) setHasPyt.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.apply((Object[]) this.MediaBrowserCompatMediaItem.read()), "The combiner returned a null value");
            ((write) obj).IconCompatParcelizer();
            return r;
        }

        @Override // kotlin.toLSModel
        public final void RemoteActionCompatParcelizer() {
            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
        }

        @Override // kotlin.toLSModel
        public final boolean IconCompatParcelizer() {
            return this.MediaBrowserCompatMediaItem.IconCompatParcelizer();
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class write<T> extends AtomicReference<SchemaLessonStatus> implements findFirstAndLastInteractiveTime<T> {
        private int AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private int read;
        private IconCompatParcelizer<T, ?> write;

        write(IconCompatParcelizer<T, ?> iconCompatParcelizer, int i, int i2) {
            this.write = iconCompatParcelizer;
            this.RemoteActionCompatParcelizer = i;
            this.IconCompatParcelizer = i2;
            this.AudioAttributesCompatParcelizer = i2 - (i2 >> 2);
        }

        @Override // kotlin.findFirstAndLastInteractiveTime, kotlin.SchemaUserStatusRSModel
        public final void AudioAttributesCompatParcelizer(SchemaLessonStatus schemaLessonStatus) {
            getCreatedOn.IconCompatParcelizer(this, schemaLessonStatus, this.IconCompatParcelizer);
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void a_(T t) {
            this.write.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, t);
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void AudioAttributesCompatParcelizer(Throwable th) {
            this.write.read(this.RemoteActionCompatParcelizer, th);
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void aJ_() {
            this.write.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        }

        public final void write() {
            getCreatedOn.AudioAttributesCompatParcelizer(this);
        }

        public final void IconCompatParcelizer() {
            int i = this.read + 1;
            if (i == this.AudioAttributesCompatParcelizer) {
                this.read = 0;
                get().write(i);
            } else {
                this.read = i;
            }
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    final class AudioAttributesCompatParcelizer implements getSubjectTitle<T, R> {
        AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.getSubjectTitle
        public final R apply(T t) throws Exception {
            return getSortOrder.this.AudioAttributesCompatParcelizer.apply(new Object[]{t});
        }
    }
}
