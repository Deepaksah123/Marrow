package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setCouponType<T, R> implements findFirstAndLastInteractiveTime<T>, setShown<R> {
    private SchemaLessonStatus AudioAttributesCompatParcelizer;
    public final SchemaUserStatusRSModel<? super R> IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public setShown<T> read;
    public int write;

    public setCouponType(SchemaUserStatusRSModel<? super R> schemaUserStatusRSModel) {
        this.IconCompatParcelizer = schemaUserStatusRSModel;
    }

    @Override // kotlin.findFirstAndLastInteractiveTime, kotlin.SchemaUserStatusRSModel
    public final void AudioAttributesCompatParcelizer(SchemaLessonStatus schemaLessonStatus) {
        if (getCreatedOn.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, schemaLessonStatus)) {
            this.AudioAttributesCompatParcelizer = schemaLessonStatus;
            if (schemaLessonStatus instanceof setShown) {
                this.read = (setShown) schemaLessonStatus;
            }
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this);
        }
    }

    @Override // kotlin.SchemaUserStatusRSModel
    public final void AudioAttributesCompatParcelizer(Throwable th) {
        if (this.RemoteActionCompatParcelizer) {
            getPaymentRefIds.RemoteActionCompatParcelizer(th);
        } else {
            this.RemoteActionCompatParcelizer = true;
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer(th);
        }
    }

    protected final void write(Throwable th) {
        getEndTimeMs.RemoteActionCompatParcelizer(th);
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        AudioAttributesCompatParcelizer(th);
    }

    @Override // kotlin.SchemaUserStatusRSModel
    public final void aJ_() {
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        this.RemoteActionCompatParcelizer = true;
        this.IconCompatParcelizer.aJ_();
    }

    protected final int AudioAttributesCompatParcelizer(int i) {
        setShown<T> setshown = this.read;
        if (setshown == null || (i & 4) != 0) {
            return 0;
        }
        int iWrite = setshown.write(i);
        if (iWrite != 0) {
            this.write = iWrite;
        }
        return iWrite;
    }

    @Override // kotlin.SchemaLessonStatus
    public final void write(long j) {
        this.AudioAttributesCompatParcelizer.write(j);
    }

    @Override // kotlin.SchemaLessonStatus
    public final void AudioAttributesCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.toLSModel
    public final boolean IconCompatParcelizer() {
        return this.read.IconCompatParcelizer();
    }

    @Override // kotlin.toLSModel
    public final void RemoteActionCompatParcelizer() {
        this.read.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.toLSModel
    public final boolean RemoteActionCompatParcelizer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
