package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class isReviewAvailable<T> extends getTncConsentDate implements SampleVideos<T>, TopUserCompanion {
    private final CurrentQuery IconCompatParcelizer;

    protected void AudioAttributesCompatParcelizer(T t) {
    }

    protected void read(Throwable th, boolean z) {
    }

    public isReviewAvailable(CurrentQuery currentQuery, boolean z, boolean z2) {
        super(z2);
        read((setPassingYear) currentQuery.get(setPassingYear.b_));
        this.IconCompatParcelizer = currentQuery.plus(this);
    }

    @Override // kotlin.SampleVideos
    /* JADX INFO: renamed from: getContext */
    public final CurrentQuery getWrite() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.TopUserCompanion
    /* JADX INFO: renamed from: bj_ */
    public CurrentQuery getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.getTncConsentDate, kotlin.setPassingYear
    public boolean read() {
        return super.read();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.getTncConsentDate
    public final String IconCompatParcelizer() {
        StringBuilder sb = new StringBuilder();
        sb.append(isVerified.read(this));
        sb.append(" was cancelled");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.getTncConsentDate
    protected final void RemoteActionCompatParcelizer(Object obj) {
        if (obj instanceof setUserSubmittedTimestampMs) {
            setUserSubmittedTimestampMs setusersubmittedtimestampms = (setUserSubmittedTimestampMs) obj;
            read(setusersubmittedtimestampms.RemoteActionCompatParcelizer, setusersubmittedtimestampms.write());
        } else {
            AudioAttributesCompatParcelizer(obj);
        }
    }

    @Override // kotlin.SampleVideos
    public final void resumeWith(Object obj) {
        Object objAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(setUserStartedTimestampMs.write(obj));
        if (objAudioAttributesImplApi26Parcelizer == isEmailVerified.read) {
            return;
        }
        write(objAudioAttributesImplApi26Parcelizer);
    }

    protected void write(Object obj) {
        b_(obj);
    }

    @Override // kotlin.getTncConsentDate
    public final void IconCompatParcelizer(Throwable th) {
        YearItem.read(this.IconCompatParcelizer, th);
    }

    @Override // kotlin.getTncConsentDate
    public String RemoteActionCompatParcelizer() {
        String str = TestStat.read(this.IconCompatParcelizer);
        if (str == null) {
            return super.RemoteActionCompatParcelizer();
        }
        StringBuilder sb = new StringBuilder("\"");
        sb.append(str);
        sb.append("\":");
        sb.append(super.RemoteActionCompatParcelizer());
        return sb.toString();
    }

    public final <R> void AudioAttributesCompatParcelizer(getCollegeName getcollegename, R r, MagicModuleSubmissionRequestBody<? super R, ? super SampleVideos<? super T>, ? extends Object> magicModuleSubmissionRequestBody) {
        getcollegename.RemoteActionCompatParcelizer(magicModuleSubmissionRequestBody, r, this);
    }
}
