package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R)\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00038\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lo/isConcrete;", "Lo/writerFor;", "Lo/isPrimitive;", "Lkotlin/Function3;", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "Lo/withHandlersFrom;", "p0", "<init>", "(Lo/getModuleData;)V", "read", "()Lo/isPrimitive;", "", "(Lo/isPrimitive;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "write", "Lo/getModuleData;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class isConcrete extends writerFor<isPrimitive> {
    private final getModuleData<withContentValueHandler, isTypeOrSuperTypeOf, PropertyValueAny, withHandlersFrom> write;

    /* JADX WARN: Multi-variable type inference failed */
    public isConcrete(getModuleData<? super withContentValueHandler, ? super isTypeOrSuperTypeOf, ? super PropertyValueAny, ? extends withHandlersFrom> getmoduledata) {
        this.write = getmoduledata;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final isPrimitive IconCompatParcelizer() {
        return new isPrimitive(this.write);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(isPrimitive p0) {
        p0.read(this.write);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof isConcrete) && this.write == ((isConcrete) p0).write;
    }

    public final int hashCode() {
        return this.write.hashCode();
    }
}
