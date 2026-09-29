package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/BaseNodeDeserializer;", "Lo/writerFor;", "Lo/_deserializeObjectAtName;", "<init>", "()V", "write", "()Lo/_deserializeObjectAtName;", "p0", "", "read", "(Lo/_deserializeObjectAtName;)V", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class BaseNodeDeserializer extends writerFor<_deserializeObjectAtName> {
    public static final BaseNodeDeserializer INSTANCE = new BaseNodeDeserializer();

    public final boolean equals(Object p0) {
        return p0 == this;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(_deserializeObjectAtName p0) {
    }

    private BaseNodeDeserializer() {
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final _deserializeObjectAtName IconCompatParcelizer() {
        return new _deserializeObjectAtName();
    }

    public final int hashCode() {
        return "focusTargetInterop".hashCode();
    }
}
