package kotlin;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getCurrentAdIndexInAdGroup {
    private final getCurrentPeriodIndex<?> AudioAttributesCompatParcelizer;
    private final setPresenter<getCurrentPeriodIndex<?>> write;

    private getCurrentAdIndexInAdGroup(List<? extends getCurrentPeriodIndex<?>> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("Models must not be empty");
        }
        int size = list.size();
        if (size == 1) {
            this.AudioAttributesCompatParcelizer = list.get(0);
            this.write = null;
            return;
        }
        this.AudioAttributesCompatParcelizer = null;
        this.write = new setPresenter<>(size);
        for (getCurrentPeriodIndex<?> getcurrentperiodindex : list) {
            this.write.write(getcurrentperiodindex.AudioAttributesCompatParcelizer(), getcurrentperiodindex);
        }
    }

    public getCurrentAdIndexInAdGroup(getCurrentPeriodIndex<?> getcurrentperiodindex) {
        this((List<? extends getCurrentPeriodIndex<?>>) Collections.singletonList(getcurrentperiodindex));
    }

    public static getCurrentPeriodIndex<?> read(List<Object> list, long j) {
        if (list.isEmpty()) {
            return null;
        }
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            getCurrentAdIndexInAdGroup getcurrentadindexinadgroup = (getCurrentAdIndexInAdGroup) it.next();
            getCurrentPeriodIndex<?> getcurrentperiodindex = getcurrentadindexinadgroup.AudioAttributesCompatParcelizer;
            if (getcurrentperiodindex == null) {
                getCurrentPeriodIndex<?> getcurrentperiodindexIconCompatParcelizer = getcurrentadindexinadgroup.write.IconCompatParcelizer(j);
                if (getcurrentperiodindexIconCompatParcelizer != null) {
                    return getcurrentperiodindexIconCompatParcelizer;
                }
            } else if (getcurrentperiodindex.AudioAttributesCompatParcelizer() == j) {
                return getcurrentadindexinadgroup.AudioAttributesCompatParcelizer;
            }
        }
        return null;
    }
}
