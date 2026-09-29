package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/_verifyAlloc;", "Lo/quoteAsUTF8;", "", "<init>", "()V", "p0", "p1", "", "IconCompatParcelizer", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class _verifyAlloc implements quoteAsUTF8<Object> {
    public static final _verifyAlloc INSTANCE = new _verifyAlloc();

    @Override // kotlin.quoteAsUTF8
    public final boolean IconCompatParcelizer(Object p0, Object p1) {
        return p0 == p1;
    }

    private _verifyAlloc() {
    }

    public final String toString() {
        return "ReferentialEqualityPolicy";
    }
}
