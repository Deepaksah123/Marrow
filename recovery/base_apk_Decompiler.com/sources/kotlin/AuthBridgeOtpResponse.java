package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AuthBridgeOtpResponse extends getSuccess {
    public static final <K, V> List<Pair<K, V>> MediaBrowserCompatCustomActionResultReceiver(Map<? extends K, ? extends V> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        if (map.size() == 0) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(new Pair(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new Pair(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
