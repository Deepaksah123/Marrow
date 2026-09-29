package kotlin;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0096\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lo/getIdType;", "Lo/ObjectIdReferenceProperty;", "", "p0", "", "p1", "Lo/appendReferring;", "p2", "Lo/PropertyBasedCreatorCaseInsensitiveMap;", "p3", "p4", "", "Lo/assign;", "p5", "", "p6", "p7", "", "p8", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Lo/appendReferring;Lo/PropertyBasedCreatorCaseInsensitiveMap;Ljava/lang/Object;Ljava/util/List;Ljava/util/Collection;Ljava/util/Collection;Z)V", "RemoteActionCompatParcelizer", "Ljava/util/List;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getIdType extends ObjectIdReferenceProperty {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final List<assign> write;

    public getIdType(Object obj, String str, appendReferring appendreferring, PropertyBasedCreatorCaseInsensitiveMap propertyBasedCreatorCaseInsensitiveMap, Object obj2, List<assign> list, Collection<? extends Object> collection, Collection<? extends ObjectIdReferenceProperty> collection2, boolean z) {
        super(obj, str, propertyBasedCreatorCaseInsensitiveMap, obj2, appendreferring, collection, collection2, z, null);
        this.write = list;
    }
}
