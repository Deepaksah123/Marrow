package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class getFirstSampleTimeUs extends Track {
    private final read write;

    public enum read {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public getFirstSampleTimeUs(read readVar) {
        this.write = readVar;
    }

    public getFirstSampleTimeUs(String str, read readVar) {
        super(str);
        this.write = readVar;
    }
}
