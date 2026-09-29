package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class findCurrentPlayerMediaPeriodInQueue {
    private final ConcurrentHashMap<String, ConcurrentHashMap<String, addTimelineForMediaPeriodId>> RemoteActionCompatParcelizer = new ConcurrentHashMap<>();

    public final void IconCompatParcelizer(String str, List<addTimelineForMediaPeriodId> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        ConcurrentHashMap<String, addTimelineForMediaPeriodId> concurrentHashMap = new ConcurrentHashMap<>();
        for (addTimelineForMediaPeriodId addtimelineformediaperiodid : list) {
            concurrentHashMap.put(addtimelineformediaperiodid.AudioAttributesCompatParcelizer(), addtimelineformediaperiodid);
        }
        this.RemoteActionCompatParcelizer.put(str, concurrentHashMap);
    }

    public final List<addTimelineForMediaPeriodId> write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        ConcurrentHashMap<String, addTimelineForMediaPeriodId> concurrentHashMap = this.RemoteActionCompatParcelizer.get(str);
        if (concurrentHashMap == null) {
            return null;
        }
        ConcurrentHashMap<String, addTimelineForMediaPeriodId> concurrentHashMap2 = concurrentHashMap;
        ArrayList arrayList = new ArrayList(concurrentHashMap2.size());
        Iterator<Map.Entry<String, addTimelineForMediaPeriodId>> it = concurrentHashMap2.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }
}
