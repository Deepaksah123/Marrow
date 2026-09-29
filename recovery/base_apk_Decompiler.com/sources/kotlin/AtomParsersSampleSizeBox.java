package kotlin;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
abstract class AtomParsersSampleSizeBox<K, V> extends moveNext<K, V> implements parseMoof<K, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.moveNext
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public abstract List<V> write();

    protected AtomParsersSampleSizeBox(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // kotlin.moveNext
    final <E> Collection<E> write(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // kotlin.moveNext
    final Collection<V> AudioAttributesCompatParcelizer(K k, Collection<V> collection) {
        return RemoteActionCompatParcelizer(k, (List) collection, null);
    }

    @Override // kotlin.moveNext, kotlin.outputPendingMetadataSamples, kotlin.parseMoof
    /* JADX INFO: renamed from: IconCompatParcelizer */
    public List<V> RemoteActionCompatParcelizer(K k) {
        return (List) super.RemoteActionCompatParcelizer(k);
    }

    @Override // kotlin.moveNext, kotlin.readNextSampleSize, kotlin.outputPendingMetadataSamples
    public boolean read(K k, V v) {
        return super.read(k, v);
    }

    @Override // kotlin.readNextSampleSize, kotlin.outputPendingMetadataSamples
    public Map<K, Collection<V>> RemoteActionCompatParcelizer() {
        return super.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.readNextSampleSize
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
