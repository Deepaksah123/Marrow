package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public abstract class StepResponseBody<T, R> implements getUpdates<T>, VideoDeleteRecord<R> {
    private MarkIncompleteResponseBody AudioAttributesCompatParcelizer;
    public VideoDeleteRecord<T> IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public int read;
    public final getUpdates<? super R> write;

    public StepResponseBody(getUpdates<? super R> getupdates) {
        this.write = getupdates;
    }

    @Override // kotlin.getUpdates
    public final void AudioAttributesCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
        if (getSubjectId.read(this.AudioAttributesCompatParcelizer, markIncompleteResponseBody)) {
            this.AudioAttributesCompatParcelizer = markIncompleteResponseBody;
            if (markIncompleteResponseBody instanceof VideoDeleteRecord) {
                this.IconCompatParcelizer = (VideoDeleteRecord) markIncompleteResponseBody;
            }
            this.write.AudioAttributesCompatParcelizer(this);
        }
    }

    @Override // kotlin.getUpdates
    public final void IconCompatParcelizer(Throwable th) {
        if (this.RemoteActionCompatParcelizer) {
            getPaymentRefIds.RemoteActionCompatParcelizer(th);
        } else {
            this.RemoteActionCompatParcelizer = true;
            this.write.IconCompatParcelizer(th);
        }
    }

    protected final void RemoteActionCompatParcelizer(Throwable th) {
        getEndTimeMs.RemoteActionCompatParcelizer(th);
        this.AudioAttributesCompatParcelizer.aL_();
        IconCompatParcelizer(th);
    }

    @Override // kotlin.getUpdates
    public final void aI_() {
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        this.RemoteActionCompatParcelizer = true;
        this.write.aI_();
    }

    protected final int AudioAttributesCompatParcelizer(int i) {
        VideoDeleteRecord<T> videoDeleteRecord = this.IconCompatParcelizer;
        if (videoDeleteRecord == null || (i & 4) != 0) {
            return 0;
        }
        int iWrite = videoDeleteRecord.write(i);
        if (iWrite != 0) {
            this.read = iWrite;
        }
        return iWrite;
    }

    @Override // kotlin.MarkIncompleteResponseBody
    public final void aL_() {
        this.AudioAttributesCompatParcelizer.aL_();
    }

    @Override // kotlin.MarkIncompleteResponseBody
    public final boolean write() {
        return this.AudioAttributesCompatParcelizer.write();
    }

    @Override // kotlin.toLSModel
    public final boolean IconCompatParcelizer() {
        return this.IconCompatParcelizer.IconCompatParcelizer();
    }

    @Override // kotlin.toLSModel
    public final void RemoteActionCompatParcelizer() {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.toLSModel
    public final boolean RemoteActionCompatParcelizer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
