package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setDiscount<T, R> implements getVideoIdEditionId<T>, setShown<R> {
    public setShown<T> AudioAttributesCompatParcelizer;
    public int IconCompatParcelizer;
    public final getVideoIdEditionId<? super R> RemoteActionCompatParcelizer;
    private SchemaLessonStatus read;
    public boolean write;

    public setDiscount(getVideoIdEditionId<? super R> getvideoideditionid) {
        this.RemoteActionCompatParcelizer = getvideoideditionid;
    }

    @Override // kotlin.findFirstAndLastInteractiveTime, kotlin.SchemaUserStatusRSModel
    public final void AudioAttributesCompatParcelizer(SchemaLessonStatus schemaLessonStatus) {
        if (getCreatedOn.AudioAttributesCompatParcelizer(this.read, schemaLessonStatus)) {
            this.read = schemaLessonStatus;
            if (schemaLessonStatus instanceof setShown) {
                this.AudioAttributesCompatParcelizer = (setShown) schemaLessonStatus;
            }
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this);
        }
    }

    @Override // kotlin.SchemaUserStatusRSModel
    public final void AudioAttributesCompatParcelizer(Throwable th) {
        if (this.write) {
            getPaymentRefIds.RemoteActionCompatParcelizer(th);
        } else {
            this.write = true;
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(th);
        }
    }

    protected final void write(Throwable th) {
        getEndTimeMs.RemoteActionCompatParcelizer(th);
        this.read.AudioAttributesCompatParcelizer();
        AudioAttributesCompatParcelizer(th);
    }

    @Override // kotlin.SchemaUserStatusRSModel
    public final void aJ_() {
        if (this.write) {
            return;
        }
        this.write = true;
        this.RemoteActionCompatParcelizer.aJ_();
    }

    protected final int IconCompatParcelizer(int i) {
        setShown<T> setshown = this.AudioAttributesCompatParcelizer;
        if (setshown == null || (i & 4) != 0) {
            return 0;
        }
        int iWrite = setshown.write(i);
        if (iWrite != 0) {
            this.IconCompatParcelizer = iWrite;
        }
        return iWrite;
    }

    @Override // kotlin.SchemaLessonStatus
    public final void write(long j) {
        this.read.write(j);
    }

    @Override // kotlin.SchemaLessonStatus
    public final void AudioAttributesCompatParcelizer() {
        this.read.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.toLSModel
    public final boolean IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
    }

    @Override // kotlin.toLSModel
    public final void RemoteActionCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.toLSModel
    public final boolean RemoteActionCompatParcelizer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
