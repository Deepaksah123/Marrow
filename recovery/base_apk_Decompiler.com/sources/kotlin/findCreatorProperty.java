package kotlin;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0013"}, d2 = {"Lo/findCreatorProperty;", "Lo/ObjectIdReferenceProperty;", "", "p0", "p1", "Lo/appendReferring;", "p2", "", "p3", "", "Lo/getAbsentValue;", "p4", "p5", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lo/appendReferring;Ljava/util/Collection;Ljava/util/List;Ljava/util/Collection;)V", "AudioAttributesCompatParcelizer", "Ljava/lang/Object;", "write", "Ljava/util/List;", "()Ljava/util/List;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class findCreatorProperty extends ObjectIdReferenceProperty {
    private final Object AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final List<getAbsentValue> read;

    public findCreatorProperty(Object obj, Object obj2, appendReferring appendreferring, Collection<? extends Object> collection, List<getAbsentValue> list, Collection<? extends ObjectIdReferenceProperty> collection2) {
        super(obj, null, null, null, appendreferring, collection, collection2, false, null);
        this.AudioAttributesCompatParcelizer = obj2;
        this.read = list;
    }

    @Override // kotlin.ObjectIdReferenceProperty
    public final List<getAbsentValue> AudioAttributesCompatParcelizer() {
        return this.read;
    }
}
