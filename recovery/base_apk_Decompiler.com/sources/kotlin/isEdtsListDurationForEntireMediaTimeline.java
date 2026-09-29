package kotlin;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
final class isEdtsListDurationForEntireMediaTimeline<K, V> extends AtomParsersEsdsData<K, V> implements Serializable {
    private K AudioAttributesCompatParcelizer;
    private V write;

    isEdtsListDurationForEntireMediaTimeline(K k, V v) {
        this.AudioAttributesCompatParcelizer = k;
        this.write = v;
    }

    @Override // kotlin.AtomParsersEsdsData, java.util.Map.Entry
    public final K getKey() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.AtomParsersEsdsData, java.util.Map.Entry
    public final V getValue() {
        return this.write;
    }

    @Override // kotlin.AtomParsersEsdsData, java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
