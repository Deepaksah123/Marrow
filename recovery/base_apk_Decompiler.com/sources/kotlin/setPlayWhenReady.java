package kotlin;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class setPlayWhenReady {
    private static final Map<Class, Integer> AudioAttributesCompatParcelizer = new HashMap();
    getCurrentPeriodIndex<?> IconCompatParcelizer;

    setPlayWhenReady() {
    }

    final int RemoteActionCompatParcelizer(getCurrentPeriodIndex<?> getcurrentperiodindex) {
        this.IconCompatParcelizer = getcurrentperiodindex;
        return AudioAttributesCompatParcelizer(getcurrentperiodindex);
    }

    private static int AudioAttributesCompatParcelizer(getCurrentPeriodIndex<?> getcurrentperiodindex) {
        int i = getcurrentperiodindex.read();
        if (i != 0) {
            return i;
        }
        Class<?> cls = getcurrentperiodindex.getClass();
        Map<Class, Integer> map = AudioAttributesCompatParcelizer;
        Integer numValueOf = map.get(cls);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf((-map.size()) - 1);
            map.put(cls, numValueOf);
        }
        return numValueOf.intValue();
    }

    final getCurrentPeriodIndex<?> read(updatePriorityTaskManagerForIsLoadingChange updateprioritytaskmanagerforisloadingchange, int i) {
        getCurrentPeriodIndex<?> getcurrentperiodindex = this.IconCompatParcelizer;
        if (getcurrentperiodindex != null && AudioAttributesCompatParcelizer(getcurrentperiodindex) == i) {
            return this.IconCompatParcelizer;
        }
        updateprioritytaskmanagerforisloadingchange.read(new IllegalStateException("Last model did not match expected view type"));
        for (getCurrentPeriodIndex<?> getcurrentperiodindex2 : updateprioritytaskmanagerforisloadingchange.AudioAttributesCompatParcelizer()) {
            if (AudioAttributesCompatParcelizer(getcurrentperiodindex2) == i) {
                return getcurrentperiodindex2;
            }
        }
        getDuration getduration = new getDuration();
        if (i == getduration.read()) {
            return getduration;
        }
        throw new IllegalStateException("Could not find model for view type: ".concat(String.valueOf(i)));
    }
}
