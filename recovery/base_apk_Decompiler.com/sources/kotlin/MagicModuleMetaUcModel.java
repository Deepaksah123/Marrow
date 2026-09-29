package kotlin;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class MagicModuleMetaUcModel {
    private final ArrayList<Object> read;

    public MagicModuleMetaUcModel(int i) {
        this.read = new ArrayList<>(i);
    }

    public final void write(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    ArrayList<Object> arrayList = this.read;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(this.read, objArr);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder("Don't know how to spread ");
            sb.append(obj.getClass());
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    public final int RemoteActionCompatParcelizer() {
        return this.read.size();
    }

    public final void read(Object obj) {
        this.read.add(obj);
    }

    public final Object[] write(Object[] objArr) {
        return this.read.toArray(objArr);
    }
}
