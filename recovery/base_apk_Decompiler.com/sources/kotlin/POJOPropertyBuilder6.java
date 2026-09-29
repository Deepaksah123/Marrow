package kotlin;

import kotlin.addField;
import kotlin.anyIgnorals;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class POJOPropertyBuilder6 implements findAccess {
    private final addField.RemoteActionCompatParcelizer IconCompatParcelizer;
    private final Object write;

    POJOPropertyBuilder6(Object obj) {
        this.write = obj;
        this.IconCompatParcelizer = addField.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(obj.getClass());
    }

    @Override // kotlin.findAccess
    public final void read(hasGetter hasgetter, anyIgnorals.read readVar) {
        this.IconCompatParcelizer.IconCompatParcelizer(hasgetter, readVar, this.write);
    }
}
