package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class Seeker implements Mp3ExtractorExternalSyntheticLambda1 {
    private final Object read;

    public static Mp3ExtractorExternalSyntheticLambda1 read(Object obj) {
        if (obj != null) {
            return new Seeker(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    private Seeker(Object obj) {
        this.read = obj;
    }

    @Override // kotlin.evaluate
    public final Object a() {
        return this.read;
    }
}
