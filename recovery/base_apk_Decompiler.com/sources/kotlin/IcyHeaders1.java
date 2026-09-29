package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class IcyHeaders1 extends IcyInfo1 {
    private final long write;

    public IcyHeaders1(long j) {
        this("Fetch was throttled.", j);
    }

    public IcyHeaders1(String str, long j) {
        super(str);
        this.write = j;
    }
}
