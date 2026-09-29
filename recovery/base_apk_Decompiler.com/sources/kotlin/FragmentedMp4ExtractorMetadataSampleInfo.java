package kotlin;

import java.util.Collection;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public interface FragmentedMp4ExtractorMetadataSampleInfo<K, V> extends processAtomEnded<K, V> {
    @Override // kotlin.processAtomEnded
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    SortedSet<V> IconCompatParcelizer();

    @Override // kotlin.processAtomEnded, kotlin.outputPendingMetadataSamples, kotlin.parseMoof
    /* synthetic */ default Collection RemoteActionCompatParcelizer(Object obj) {
        return IconCompatParcelizer();
    }
}
