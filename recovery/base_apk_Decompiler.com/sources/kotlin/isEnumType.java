package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006"}, d2 = {"Lo/_handleOddName;", "", "p0", "IconCompatParcelizer", "(Lo/_handleOddName;Ljava/lang/Object;)Lo/_handleOddName;", "Lo/isTypeOrSuperTypeOf;", "(Lo/isTypeOrSuperTypeOf;)Ljava/lang/Object;", "read"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class isEnumType {
    public static final _handleOddName IconCompatParcelizer(_handleOddName _handleoddname, Object obj) {
        return _handleoddname.AudioAttributesCompatParcelizer(new isCollectionLikeType(obj));
    }

    public static final Object IconCompatParcelizer(isTypeOrSuperTypeOf istypeorsupertypeof) {
        Object objQ_ = istypeorsupertypeof.q_();
        isInterface isinterface = objQ_ instanceof isInterface ? (isInterface) objQ_ : null;
        if (isinterface != null) {
            return isinterface.getRemoteActionCompatParcelizer();
        }
        return null;
    }
}
