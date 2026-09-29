package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class getMutator implements _resolveAnnotatedClass {
    private final String AudioAttributesCompatParcelizer;
    private final int IconCompatParcelizer;
    private final constructPropertyCollector RemoteActionCompatParcelizer;
    private final Object[] read;

    getMutator(constructPropertyCollector constructpropertycollector, String str, Object[] objArr) {
        this.RemoteActionCompatParcelizer = constructpropertycollector;
        this.AudioAttributesCompatParcelizer = str;
        this.read = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.IconCompatParcelizer = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.IconCompatParcelizer = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2++;
            }
        }
    }

    final String read() {
        return this.AudioAttributesCompatParcelizer;
    }

    final Object[] write() {
        return this.read;
    }

    @Override // kotlin._resolveAnnotatedClass
    public final constructPropertyCollector IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin._resolveAnnotatedClass
    public final getConstructorParameter RemoteActionCompatParcelizer() {
        return (this.IconCompatParcelizer & 1) == 1 ? getConstructorParameter.PROTO2 : getConstructorParameter.PROTO3;
    }

    @Override // kotlin._resolveAnnotatedClass
    public final boolean AudioAttributesCompatParcelizer() {
        return (this.IconCompatParcelizer & 2) == 2;
    }
}
