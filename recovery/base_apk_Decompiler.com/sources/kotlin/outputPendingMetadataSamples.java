package kotlin;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public interface outputPendingMetadataSamples<K, V> {
    boolean IconCompatParcelizer(Object obj, Object obj2);

    Collection<Map.Entry<K, V>> MediaMetadataCompat();

    int RatingCompat();

    Collection<V> RemoteActionCompatParcelizer(K k);

    Map<K, Collection<V>> RemoteActionCompatParcelizer();

    boolean handleMediaPlayPauseIfPendingOnHandler();

    Collection<V> onAddQueueItem();

    Set<K> onCommand();

    void read();

    boolean read(K k, V v);

    boolean write(Object obj, Object obj2);
}
