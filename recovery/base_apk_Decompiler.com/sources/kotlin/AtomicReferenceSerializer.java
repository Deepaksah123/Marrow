package kotlin;

import kotlin._hasTypeResolver;

/* JADX INFO: loaded from: classes2.dex */
public final class AtomicReferenceSerializer implements _getReferenced {
    private final _hasTypeResolver.write write;

    public AtomicReferenceSerializer(_hasTypeResolver.write writeVar) {
        this.write = writeVar;
    }

    @Override // kotlin._getReferenced
    public final _hasTypeResolver write() {
        return this.write.write();
    }
}
