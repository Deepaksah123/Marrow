package com.google.android.exoplayer2.source;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class DefaultCompositeSequenceableLoaderFactory implements CompositeSequenceableLoaderFactory {
    @Override // com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory
    public final SequenceableLoader createCompositeSequenceableLoader(SequenceableLoader... sequenceableLoaderArr) {
        return new CompositeSequenceableLoader(sequenceableLoaderArr);
    }
}
