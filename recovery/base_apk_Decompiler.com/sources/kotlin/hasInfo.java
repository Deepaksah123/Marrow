package kotlin;

/* JADX INFO: loaded from: classes.dex */
public class hasInfo implements fromJSONArray {
    private final getQuote IconCompatParcelizer;

    public hasInfo(getQuote getquote) {
        if (getquote == null) {
            write(0);
        }
        this.IconCompatParcelizer = getquote;
    }

    @Override // kotlin.fromJSONArray
    public getQuote RemoteActionCompatParcelizer() {
        getQuote getquote = this.IconCompatParcelizer;
        if (getquote == null) {
            write(1);
        }
        return getquote;
    }

    private static /* synthetic */ void write(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 1 ? 3 : 2];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 1) {
            throw new IllegalStateException(str2);
        }
    }
}
