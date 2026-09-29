package kotlin;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.MagicModuleUseCaseImplWhenMappings;

/* JADX INFO: loaded from: classes4.dex */
public class CrossDeviceSyncResponseObject {
    public static final <T, K> Map<K, Integer> write(CrossDeviceSyncResponseObjectContentType<T, ? extends K> crossDeviceSyncResponseObjectContentType) {
        toMagicModuleMetaRepoModel.write(crossDeviceSyncResponseObjectContentType, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itWrite = crossDeviceSyncResponseObjectContentType.write();
        while (itWrite.hasNext()) {
            K kWrite = crossDeviceSyncResponseObjectContentType.write(itWrite.next());
            Object iconCompatParcelizer = linkedHashMap.get(kWrite);
            if (iconCompatParcelizer == null && !linkedHashMap.containsKey(kWrite)) {
                iconCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer();
            }
            MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer2 = (MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer) iconCompatParcelizer;
            iconCompatParcelizer2.AudioAttributesCompatParcelizer++;
            linkedHashMap.put(kWrite, iconCompatParcelizer2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            toMagicModuleMetaRepoModel.read(entry, "");
            toMagicModuleStatsLSModel.read(entry).setValue(Integer.valueOf(((MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer) entry.getValue()).AudioAttributesCompatParcelizer));
        }
        return toMagicModuleStatsLSModel.write(linkedHashMap);
    }
}
