package kotlin;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.initExtraTracks;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeResolverBuilder {
    public static <T> initExtraTracks<T> AudioAttributesCompatParcelizer(parseMvhd<Bundle, T> parsemvhd, List<Bundle> list) {
        initExtraTracks.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver = initExtraTracks.MediaBrowserCompatCustomActionResultReceiver();
        for (int i = 0; i < list.size(); i++) {
            iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.read(parsemvhd.apply((Bundle) buildTypeSerializer.IconCompatParcelizer(list.get(i))));
        }
        return iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
    }

    public static <T> ArrayList<Bundle> write(Collection<T> collection, parseMvhd<T, Bundle> parsemvhd) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(parsemvhd.apply(it.next()));
        }
        return arrayList;
    }
}
