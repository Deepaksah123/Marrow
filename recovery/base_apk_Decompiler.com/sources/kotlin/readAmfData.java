package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class readAmfData implements readAmfString {
    private static final Object read = new Object();
    private volatile Object IconCompatParcelizer = read;
    private volatile readAmfString RemoteActionCompatParcelizer;

    public static readAmfString read(readAmfString readamfstring) {
        return readamfstring instanceof readAmfData ? readamfstring : new readAmfData(readamfstring);
    }

    @Override // kotlin.readAmfString
    public final Object IconCompatParcelizer() {
        Object objIconCompatParcelizer;
        Object obj = this.IconCompatParcelizer;
        Object obj2 = read;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            objIconCompatParcelizer = this.IconCompatParcelizer;
            if (objIconCompatParcelizer == obj2) {
                objIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
                Object obj3 = this.IconCompatParcelizer;
                if (obj3 != obj2 && obj3 != objIconCompatParcelizer) {
                    StringBuilder sb = new StringBuilder("Scoped provider was invoked recursively returning different results: ");
                    sb.append(obj3);
                    sb.append(" & ");
                    sb.append(objIconCompatParcelizer);
                    sb.append(". This is likely due to a circular dependency.");
                    throw new IllegalStateException(sb.toString());
                }
                this.IconCompatParcelizer = objIconCompatParcelizer;
                this.RemoteActionCompatParcelizer = null;
            }
        }
        return objIconCompatParcelizer;
    }

    private readAmfData(readAmfString readamfstring) {
        this.RemoteActionCompatParcelizer = readamfstring;
    }
}
