package kotlin;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.getIds;

/* JADX INFO: loaded from: classes.dex */
public final class getSectionTimeInSec<T> extends setQuestion<T, T> {
    private boolean IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    private getIds read;

    public getSectionTimeInSec(accessgetEmptyStatecp<T> accessgetemptystatecp, getIds getids, boolean z, int i) {
        super(accessgetemptystatecp);
        this.read = getids;
        this.IconCompatParcelizer = false;
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // kotlin.accessgetEmptyStatecp
    public final void read(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel) {
        getIds.IconCompatParcelizer IconCompatParcelizer2 = this.read.IconCompatParcelizer();
        if (schemaUserStatusRSModel instanceof getVideoIdEditionId) {
            this.write.RemoteActionCompatParcelizer(new AudioAttributesCompatParcelizer((getVideoIdEditionId) schemaUserStatusRSModel, IconCompatParcelizer2, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer));
        } else {
            this.write.RemoteActionCompatParcelizer(new IconCompatParcelizer(schemaUserStatusRSModel, IconCompatParcelizer2, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer));
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static abstract class write<T> extends FreeAccessAvailabilityResponse<T> implements findFirstAndLastInteractiveTime<T>, Runnable {
        final int AudioAttributesCompatParcelizer;
        toLSModel<T> AudioAttributesImplApi21Parcelizer;
        SchemaLessonStatus AudioAttributesImplApi26Parcelizer;
        long AudioAttributesImplBaseParcelizer;
        volatile boolean IconCompatParcelizer;
        final AtomicLong MediaBrowserCompatCustomActionResultReceiver = new AtomicLong();
        int MediaBrowserCompatItemReceiver;
        final getIds.IconCompatParcelizer MediaBrowserCompatMediaItem;
        private boolean MediaMetadataCompat;
        private boolean RatingCompat;
        Throwable RemoteActionCompatParcelizer;
        final int read;
        volatile boolean write;

        abstract void AudioAttributesImplApi21Parcelizer();

        abstract void MediaBrowserCompatCustomActionResultReceiver();

        abstract void write();

        write(getIds.IconCompatParcelizer iconCompatParcelizer, boolean z, int i) {
            this.MediaBrowserCompatMediaItem = iconCompatParcelizer;
            this.MediaMetadataCompat = z;
            this.read = i;
            this.AudioAttributesCompatParcelizer = i - (i >> 2);
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void a_(T t) {
            if (this.IconCompatParcelizer) {
                return;
            }
            if (this.MediaBrowserCompatItemReceiver == 2) {
                AudioAttributesImplApi26Parcelizer();
                return;
            }
            if (!this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(t)) {
                this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
                this.RemoteActionCompatParcelizer = new getLastUpdated("Queue is full?!");
                this.IconCompatParcelizer = true;
            }
            AudioAttributesImplApi26Parcelizer();
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void AudioAttributesCompatParcelizer(Throwable th) {
            if (this.IconCompatParcelizer) {
                getPaymentRefIds.RemoteActionCompatParcelizer(th);
                return;
            }
            this.RemoteActionCompatParcelizer = th;
            this.IconCompatParcelizer = true;
            AudioAttributesImplApi26Parcelizer();
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void aJ_() {
            if (this.IconCompatParcelizer) {
                return;
            }
            this.IconCompatParcelizer = true;
            AudioAttributesImplApi26Parcelizer();
        }

        @Override // kotlin.SchemaLessonStatus
        public final void write(long j) {
            if (getCreatedOn.AudioAttributesCompatParcelizer(j)) {
                getAccessLevel.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, j);
                AudioAttributesImplApi26Parcelizer();
            }
        }

        @Override // kotlin.SchemaLessonStatus
        public final void AudioAttributesCompatParcelizer() {
            if (this.write) {
                return;
            }
            this.write = true;
            this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
            this.MediaBrowserCompatMediaItem.aL_();
            if (getAndIncrement() == 0) {
                this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer();
            }
        }

        private void AudioAttributesImplApi26Parcelizer() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.MediaBrowserCompatMediaItem.read(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.RatingCompat) {
                AudioAttributesImplApi21Parcelizer();
            } else if (this.MediaBrowserCompatItemReceiver == 1) {
                MediaBrowserCompatCustomActionResultReceiver();
            } else {
                write();
            }
        }

        final boolean IconCompatParcelizer(boolean z, boolean z2, SchemaUserStatusRSModel<?> schemaUserStatusRSModel) {
            if (this.write) {
                RemoteActionCompatParcelizer();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.MediaMetadataCompat) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.RemoteActionCompatParcelizer;
                if (th != null) {
                    schemaUserStatusRSModel.AudioAttributesCompatParcelizer(th);
                } else {
                    schemaUserStatusRSModel.aJ_();
                }
                this.MediaBrowserCompatMediaItem.aL_();
                return true;
            }
            Throwable th2 = this.RemoteActionCompatParcelizer;
            if (th2 != null) {
                RemoteActionCompatParcelizer();
                schemaUserStatusRSModel.AudioAttributesCompatParcelizer(th2);
                this.MediaBrowserCompatMediaItem.aL_();
                return true;
            }
            if (!z2) {
                return false;
            }
            schemaUserStatusRSModel.aJ_();
            this.MediaBrowserCompatMediaItem.aL_();
            return true;
        }

        @Override // kotlin.isShown
        public final int write(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.RatingCompat = true;
            return 2;
        }

        @Override // kotlin.toLSModel
        public final void RemoteActionCompatParcelizer() {
            this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer();
        }

        @Override // kotlin.toLSModel
        public final boolean IconCompatParcelizer() {
            return this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer();
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class IconCompatParcelizer<T> extends write<T> {
        private SchemaUserStatusRSModel<? super T> RatingCompat;

        IconCompatParcelizer(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel, getIds.IconCompatParcelizer iconCompatParcelizer, boolean z, int i) {
            super(iconCompatParcelizer, z, i);
            this.RatingCompat = schemaUserStatusRSModel;
        }

        @Override // kotlin.findFirstAndLastInteractiveTime, kotlin.SchemaUserStatusRSModel
        public final void AudioAttributesCompatParcelizer(SchemaLessonStatus schemaLessonStatus) {
            if (getCreatedOn.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, schemaLessonStatus)) {
                this.AudioAttributesImplApi26Parcelizer = schemaLessonStatus;
                if (schemaLessonStatus instanceof setShown) {
                    setShown setshown = (setShown) schemaLessonStatus;
                    int iWrite = setshown.write(7);
                    if (iWrite == 1) {
                        this.MediaBrowserCompatItemReceiver = 1;
                        this.AudioAttributesImplApi21Parcelizer = setshown;
                        this.IconCompatParcelizer = true;
                        this.RatingCompat.AudioAttributesCompatParcelizer(this);
                        return;
                    }
                    if (iWrite == 2) {
                        this.MediaBrowserCompatItemReceiver = 2;
                        this.AudioAttributesImplApi21Parcelizer = setshown;
                        this.RatingCompat.AudioAttributesCompatParcelizer(this);
                        schemaLessonStatus.write(this.read);
                        return;
                    }
                }
                this.AudioAttributesImplApi21Parcelizer = new PearlResponseBody(this.read);
                this.RatingCompat.AudioAttributesCompatParcelizer(this);
                schemaLessonStatus.write(this.read);
            }
        }

        @Override // o.getSectionTimeInSec.write
        final void MediaBrowserCompatCustomActionResultReceiver() {
            SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel = this.RatingCompat;
            toLSModel<T> tolsmodel = this.AudioAttributesImplApi21Parcelizer;
            long j = this.AudioAttributesImplBaseParcelizer;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.MediaBrowserCompatCustomActionResultReceiver.get();
                while (j != j2) {
                    try {
                        T t = tolsmodel.read();
                        if (this.write) {
                            return;
                        }
                        if (t == null) {
                            schemaUserStatusRSModel.aJ_();
                            this.MediaBrowserCompatMediaItem.aL_();
                            return;
                        } else {
                            schemaUserStatusRSModel.a_(t);
                            j++;
                        }
                    } catch (Throwable th) {
                        getEndTimeMs.RemoteActionCompatParcelizer(th);
                        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
                        schemaUserStatusRSModel.AudioAttributesCompatParcelizer(th);
                        this.MediaBrowserCompatMediaItem.aL_();
                        return;
                    }
                }
                if (this.write) {
                    return;
                }
                if (tolsmodel.IconCompatParcelizer()) {
                    schemaUserStatusRSModel.aJ_();
                    this.MediaBrowserCompatMediaItem.aL_();
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.AudioAttributesImplBaseParcelizer = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // o.getSectionTimeInSec.write
        final void write() {
            SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel = this.RatingCompat;
            toLSModel<T> tolsmodel = this.AudioAttributesImplApi21Parcelizer;
            long j = this.AudioAttributesImplBaseParcelizer;
            int iAddAndGet = 1;
            while (true) {
                long jAddAndGet = this.MediaBrowserCompatCustomActionResultReceiver.get();
                while (j != jAddAndGet) {
                    boolean z = this.IconCompatParcelizer;
                    try {
                        T t = tolsmodel.read();
                        boolean z2 = t == null;
                        if (!IconCompatParcelizer(z, z2, schemaUserStatusRSModel)) {
                            if (z2) {
                                break;
                            }
                            schemaUserStatusRSModel.a_(t);
                            j++;
                            if (j == this.AudioAttributesCompatParcelizer) {
                                if (jAddAndGet != Long.MAX_VALUE) {
                                    jAddAndGet = this.MediaBrowserCompatCustomActionResultReceiver.addAndGet(-j);
                                }
                                this.AudioAttributesImplApi26Parcelizer.write(j);
                                j = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        getEndTimeMs.RemoteActionCompatParcelizer(th);
                        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
                        tolsmodel.RemoteActionCompatParcelizer();
                        schemaUserStatusRSModel.AudioAttributesCompatParcelizer(th);
                        this.MediaBrowserCompatMediaItem.aL_();
                        return;
                    }
                }
                if (j == jAddAndGet && IconCompatParcelizer(this.IconCompatParcelizer, tolsmodel.IconCompatParcelizer(), schemaUserStatusRSModel)) {
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.AudioAttributesImplBaseParcelizer = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // o.getSectionTimeInSec.write
        final void AudioAttributesImplApi21Parcelizer() {
            int iAddAndGet = 1;
            while (!this.write) {
                boolean z = this.IconCompatParcelizer;
                this.RatingCompat.a_(null);
                if (z) {
                    Throwable th = this.RemoteActionCompatParcelizer;
                    if (th != null) {
                        this.RatingCompat.AudioAttributesCompatParcelizer(th);
                    } else {
                        this.RatingCompat.aJ_();
                    }
                    this.MediaBrowserCompatMediaItem.aL_();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // kotlin.toLSModel
        public final T read() throws Exception {
            T t = this.AudioAttributesImplApi21Parcelizer.read();
            if (t != null && this.MediaBrowserCompatItemReceiver != 1) {
                long j = this.AudioAttributesImplBaseParcelizer + 1;
                if (j == this.AudioAttributesCompatParcelizer) {
                    this.AudioAttributesImplBaseParcelizer = 0L;
                    this.AudioAttributesImplApi26Parcelizer.write(j);
                    return t;
                }
                this.AudioAttributesImplBaseParcelizer = j;
            }
            return t;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class AudioAttributesCompatParcelizer<T> extends write<T> {
        private long MediaDescriptionCompat;
        private getVideoIdEditionId<? super T> RatingCompat;

        AudioAttributesCompatParcelizer(getVideoIdEditionId<? super T> getvideoideditionid, getIds.IconCompatParcelizer iconCompatParcelizer, boolean z, int i) {
            super(iconCompatParcelizer, z, i);
            this.RatingCompat = getvideoideditionid;
        }

        @Override // kotlin.findFirstAndLastInteractiveTime, kotlin.SchemaUserStatusRSModel
        public final void AudioAttributesCompatParcelizer(SchemaLessonStatus schemaLessonStatus) {
            if (getCreatedOn.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, schemaLessonStatus)) {
                this.AudioAttributesImplApi26Parcelizer = schemaLessonStatus;
                if (schemaLessonStatus instanceof setShown) {
                    setShown setshown = (setShown) schemaLessonStatus;
                    int iWrite = setshown.write(7);
                    if (iWrite == 1) {
                        this.MediaBrowserCompatItemReceiver = 1;
                        this.AudioAttributesImplApi21Parcelizer = setshown;
                        this.IconCompatParcelizer = true;
                        this.RatingCompat.AudioAttributesCompatParcelizer(this);
                        return;
                    }
                    if (iWrite == 2) {
                        this.MediaBrowserCompatItemReceiver = 2;
                        this.AudioAttributesImplApi21Parcelizer = setshown;
                        this.RatingCompat.AudioAttributesCompatParcelizer(this);
                        schemaLessonStatus.write(this.read);
                        return;
                    }
                }
                this.AudioAttributesImplApi21Parcelizer = new PearlResponseBody(this.read);
                this.RatingCompat.AudioAttributesCompatParcelizer(this);
                schemaLessonStatus.write(this.read);
            }
        }

        @Override // o.getSectionTimeInSec.write
        final void MediaBrowserCompatCustomActionResultReceiver() {
            getVideoIdEditionId<? super T> getvideoideditionid = this.RatingCompat;
            toLSModel<T> tolsmodel = this.AudioAttributesImplApi21Parcelizer;
            long j = this.AudioAttributesImplBaseParcelizer;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.MediaBrowserCompatCustomActionResultReceiver.get();
                while (j != j2) {
                    try {
                        T t = tolsmodel.read();
                        if (this.write) {
                            return;
                        }
                        if (t == null) {
                            getvideoideditionid.aJ_();
                            this.MediaBrowserCompatMediaItem.aL_();
                            return;
                        } else if (getvideoideditionid.IconCompatParcelizer(t)) {
                            j++;
                        }
                    } catch (Throwable th) {
                        getEndTimeMs.RemoteActionCompatParcelizer(th);
                        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
                        getvideoideditionid.AudioAttributesCompatParcelizer(th);
                        this.MediaBrowserCompatMediaItem.aL_();
                        return;
                    }
                }
                if (this.write) {
                    return;
                }
                if (tolsmodel.IconCompatParcelizer()) {
                    getvideoideditionid.aJ_();
                    this.MediaBrowserCompatMediaItem.aL_();
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.AudioAttributesImplBaseParcelizer = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // o.getSectionTimeInSec.write
        final void write() {
            getVideoIdEditionId<? super T> getvideoideditionid = this.RatingCompat;
            toLSModel<T> tolsmodel = this.AudioAttributesImplApi21Parcelizer;
            long j = this.AudioAttributesImplBaseParcelizer;
            long j2 = this.MediaDescriptionCompat;
            int iAddAndGet = 1;
            while (true) {
                long j3 = this.MediaBrowserCompatCustomActionResultReceiver.get();
                while (j != j3) {
                    boolean z = this.IconCompatParcelizer;
                    try {
                        T t = tolsmodel.read();
                        boolean z2 = t == null;
                        if (!IconCompatParcelizer(z, z2, getvideoideditionid)) {
                            if (z2) {
                                break;
                            }
                            if (getvideoideditionid.IconCompatParcelizer(t)) {
                                j++;
                            }
                            j2++;
                            if (j2 == this.AudioAttributesCompatParcelizer) {
                                this.AudioAttributesImplApi26Parcelizer.write(j2);
                                j2 = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        getEndTimeMs.RemoteActionCompatParcelizer(th);
                        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
                        tolsmodel.RemoteActionCompatParcelizer();
                        getvideoideditionid.AudioAttributesCompatParcelizer(th);
                        this.MediaBrowserCompatMediaItem.aL_();
                        return;
                    }
                }
                if (j == j3 && IconCompatParcelizer(this.IconCompatParcelizer, tolsmodel.IconCompatParcelizer(), getvideoideditionid)) {
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.AudioAttributesImplBaseParcelizer = j;
                    this.MediaDescriptionCompat = j2;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // o.getSectionTimeInSec.write
        final void AudioAttributesImplApi21Parcelizer() {
            int iAddAndGet = 1;
            while (!this.write) {
                boolean z = this.IconCompatParcelizer;
                this.RatingCompat.a_(null);
                if (z) {
                    Throwable th = this.RemoteActionCompatParcelizer;
                    if (th != null) {
                        this.RatingCompat.AudioAttributesCompatParcelizer(th);
                    } else {
                        this.RatingCompat.aJ_();
                    }
                    this.MediaBrowserCompatMediaItem.aL_();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // kotlin.toLSModel
        public final T read() throws Exception {
            T t = this.AudioAttributesImplApi21Parcelizer.read();
            if (t != null && this.MediaBrowserCompatItemReceiver != 1) {
                long j = this.MediaDescriptionCompat + 1;
                if (j == this.AudioAttributesCompatParcelizer) {
                    this.MediaDescriptionCompat = 0L;
                    this.AudioAttributesImplApi26Parcelizer.write(j);
                    return t;
                }
                this.MediaDescriptionCompat = j;
            }
            return t;
        }
    }
}
