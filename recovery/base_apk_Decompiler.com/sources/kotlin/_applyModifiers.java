package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class _applyModifiers extends emptyBindings {
    private final int RemoteActionCompatParcelizer;
    private final Object write;

    @Override // kotlin._verifyAndResolvePlaceholders
    public final void RemoteActionCompatParcelizer(long j, long j2, long j3, List<? extends getSelfReferencedType> list, ResolvedRecursiveType[] resolvedRecursiveTypeArr) {
    }

    @Override // kotlin._verifyAndResolvePlaceholders
    public final int read() {
        return 0;
    }

    public _applyModifiers(setName setname, int i, int i2) {
        this(setname, i, i2, (byte) 0);
    }

    private _applyModifiers(setName setname, int i, int i2, byte b) {
        super(setname, new int[]{i}, i2);
        this.RemoteActionCompatParcelizer = 0;
        this.write = null;
    }

    @Override // kotlin._verifyAndResolvePlaceholders
    public final int write() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin._verifyAndResolvePlaceholders
    public final Object AudioAttributesCompatParcelizer() {
        return this.write;
    }
}
