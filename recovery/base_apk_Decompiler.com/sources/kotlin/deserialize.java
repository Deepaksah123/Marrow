package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\u000b*\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0011\u001a\u00020\u0010*\u00020\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\n\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\f\u001a\u00020\u0010*\u00020\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\n\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\f\u0010\u0012J)\u0010\u0013\u001a\u00020\u0010*\u00020\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\n\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J)\u0010\u0014\u001a\u00020\u0010*\u00020\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\n\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\f\u0010\u001e"}, d2 = {"Lo/deserialize;", "Lo/withTypeHandler;", "Lo/findBackReference;", "p0", "<init>", "(Lo/findBackReference;)V", "Lo/withContentValueHandler;", "", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "p1", "Lo/withHandlersFrom;", "AudioAttributesCompatParcelizer", "(Lo/withContentValueHandler;Ljava/util/List;J)Lo/withHandlersFrom;", "Lo/getValueHandler;", "Lo/hasHandlers;", "", "write", "(Lo/getValueHandler;Ljava/util/List;I)I", "RemoteActionCompatParcelizer", "read", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lo/findBackReference;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class deserialize implements withTypeHandler {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final findBackReference IconCompatParcelizer;

    public deserialize(findBackReference findbackreference) {
        this.IconCompatParcelizer = findbackreference;
    }

    @Override // kotlin.withTypeHandler
    public final withHandlersFrom AudioAttributesCompatParcelizer(withContentValueHandler withcontentvaluehandler, List<? extends isTypeOrSuperTypeOf> list, long j) {
        return this.IconCompatParcelizer.read(withcontentvaluehandler, writeValueAsString.RemoteActionCompatParcelizer(withcontentvaluehandler), j);
    }

    @Override // kotlin.withTypeHandler
    public final int write(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
        return this.IconCompatParcelizer.IconCompatParcelizer(getvaluehandler, writeValueAsString.RemoteActionCompatParcelizer(getvaluehandler), i);
    }

    @Override // kotlin.withTypeHandler
    public final int AudioAttributesCompatParcelizer(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
        return this.IconCompatParcelizer.read(getvaluehandler, writeValueAsString.RemoteActionCompatParcelizer(getvaluehandler), i);
    }

    @Override // kotlin.withTypeHandler
    public final int RemoteActionCompatParcelizer(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
        return this.IconCompatParcelizer.write(getvaluehandler, writeValueAsString.RemoteActionCompatParcelizer(getvaluehandler), i);
    }

    @Override // kotlin.withTypeHandler
    public final int read(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
        return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(getvaluehandler, writeValueAsString.RemoteActionCompatParcelizer(getvaluehandler), i);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof deserialize) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ((deserialize) p0).IconCompatParcelizer);
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("deserialize(IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
