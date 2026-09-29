package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CollegeJsonParser extends getPlatform {
    private long AudioAttributesCompatParcelizer;
    private boolean IconCompatParcelizer;
    private setCardContent<setCollegeName<?>> write;

    private static long write(boolean z) {
        if (!z) {
            return 1L;
        }
        long j = 0;
        return (((long) 1) << 32) | (j - ((j >> 63) << 32));
    }

    public void AudioAttributesCompatParcelizer() {
    }

    public long AudioAttributesImplBaseParcelizer() {
        return !MediaBrowserCompatCustomActionResultReceiver() ? Long.MAX_VALUE : 0L;
    }

    protected boolean write() {
        return AudioAttributesImplApi21Parcelizer();
    }

    protected long RemoteActionCompatParcelizer() {
        setCardContent<setCollegeName<?>> setcardcontent = this.write;
        return (setcardcontent == null || setcardcontent.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        setCollegeName<?> setcollegenameAudioAttributesImplBaseParcelizer;
        setCardContent<setCollegeName<?>> setcardcontent = this.write;
        if (setcardcontent == null || (setcollegenameAudioAttributesImplBaseParcelizer = setcardcontent.AudioAttributesImplBaseParcelizer()) == null) {
            return false;
        }
        setcollegenameAudioAttributesImplBaseParcelizer.run();
        return true;
    }

    public final void RemoteActionCompatParcelizer(setCollegeName<?> setcollegename) {
        setCardContent<setCollegeName<?>> setcardcontent = this.write;
        if (setcardcontent == null) {
            setcardcontent = new setCardContent<>();
            this.write = setcardcontent;
        }
        setcardcontent.addLast(setcollegename);
    }

    public final boolean read() {
        return this.AudioAttributesCompatParcelizer >= write(true);
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        setCardContent<setCollegeName<?>> setcardcontent = this.write;
        if (setcardcontent != null) {
            return setcardcontent.isEmpty();
        }
        return true;
    }

    public final void read(boolean z) {
        this.AudioAttributesCompatParcelizer += write(z);
        if (z) {
            return;
        }
        this.IconCompatParcelizer = true;
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        long jWrite = this.AudioAttributesCompatParcelizer - write(z);
        this.AudioAttributesCompatParcelizer = jWrite;
        if (jWrite <= 0) {
            getCollegeId.write();
            if (this.IconCompatParcelizer) {
                AudioAttributesCompatParcelizer();
            }
        }
    }

    @Override // kotlin.getPlatform
    public final getPlatform read(int i, String str) {
        setPbSessionId.AudioAttributesCompatParcelizer(i);
        return setPbSessionId.read(this, str);
    }
}
