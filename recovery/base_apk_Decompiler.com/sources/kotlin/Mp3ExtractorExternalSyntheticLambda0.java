package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class Mp3ExtractorExternalSyntheticLambda0 implements Mp3ExtractorFlags {
    private static final Object IconCompatParcelizer = new Object();
    private volatile Object AudioAttributesCompatParcelizer = IconCompatParcelizer;
    private volatile Mp3ExtractorFlags read;

    @Override // kotlin.evaluate
    public final Object a() {
        Object objA;
        Object obj = this.AudioAttributesCompatParcelizer;
        Object obj2 = IconCompatParcelizer;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            objA = this.AudioAttributesCompatParcelizer;
            if (objA == obj2) {
                objA = this.read.a();
                Object obj3 = this.AudioAttributesCompatParcelizer;
                if (obj3 != obj2 && obj3 != objA) {
                    StringBuilder sb = new StringBuilder("Scoped provider was invoked recursively returning different results: ");
                    sb.append(obj3);
                    sb.append(" & ");
                    sb.append(objA);
                    sb.append(". This is likely due to a circular dependency.");
                    throw new IllegalStateException(sb.toString());
                }
                this.AudioAttributesCompatParcelizer = objA;
                this.read = null;
            }
        }
        return objA;
    }

    private Mp3ExtractorExternalSyntheticLambda0(Mp3ExtractorFlags mp3ExtractorFlags) {
        this.read = mp3ExtractorFlags;
    }

    public static Mp3ExtractorFlags RemoteActionCompatParcelizer(Mp3ExtractorFlags mp3ExtractorFlags) {
        return mp3ExtractorFlags instanceof Mp3ExtractorExternalSyntheticLambda0 ? mp3ExtractorFlags : new Mp3ExtractorExternalSyntheticLambda0(mp3ExtractorFlags);
    }
}
