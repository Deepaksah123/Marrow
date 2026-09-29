package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0004\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lo/prependPath;", "Lo/writerFor;", "Lo/DeserializationConfig;", "Lo/DatabindException;", "p0", "Lo/reportBadDefinition;", "p1", "<init>", "(Lo/DatabindException;Lo/reportBadDefinition;)V", "RemoteActionCompatParcelizer", "()Lo/DeserializationConfig;", "", "IconCompatParcelizer", "(Lo/DeserializationConfig;)V", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "Lo/DatabindException;", "read", "Lo/reportBadDefinition;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class prependPath extends writerFor<DeserializationConfig> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final DatabindException read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final reportBadDefinition IconCompatParcelizer;

    public prependPath(DatabindException databindException, reportBadDefinition reportbaddefinition) {
        this.read = databindException;
        this.IconCompatParcelizer = reportbaddefinition;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final DeserializationConfig IconCompatParcelizer() {
        return new DeserializationConfig(this.read, this.IconCompatParcelizer);
    }

    @Override // kotlin.writerFor
    public final void IconCompatParcelizer(DeserializationConfig p0) {
        p0.RemoteActionCompatParcelizer(this.read, this.IconCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        reportBadDefinition reportbaddefinition = this.IconCompatParcelizer;
        return (iHashCode * 31) + (reportbaddefinition != null ? reportbaddefinition.hashCode() : 0);
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof prependPath)) {
            return false;
        }
        prependPath prependpath = (prependPath) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(prependpath.read, this.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(prependpath.IconCompatParcelizer, this.IconCompatParcelizer);
    }
}
