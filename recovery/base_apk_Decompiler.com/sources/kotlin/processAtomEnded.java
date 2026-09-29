package kotlin;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public interface processAtomEnded<K, V> extends outputPendingMetadataSamples<K, V> {
    Set<V> IconCompatParcelizer();

    @Override // kotlin.outputPendingMetadataSamples
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    Set<Map.Entry<K, V>> MediaMetadataCompat();

    @Override // kotlin.outputPendingMetadataSamples, kotlin.parseMoof
    /* synthetic */ default Collection RemoteActionCompatParcelizer(Object obj) {
        return IconCompatParcelizer();
    }
}
