package kotlin;

import kotlin.Subject;

/* JADX INFO: loaded from: classes4.dex */
public final class setCategory<K, V, T extends V> extends Subject.read<K, V, T> implements PlaybackConfigRootRequestBody<Subject<K, V>, V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setCategory(isHdPlaybackError<? extends K> ishdplaybackerror, int i) {
        super(ishdplaybackerror, i);
        toMagicModuleMetaRepoModel.write(ishdplaybackerror, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.PlaybackConfigRootRequestBody
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public T read(Subject<K, V> subject, isResolutionNotSupported<?> isresolutionnotsupported) {
        toMagicModuleMetaRepoModel.write(subject, "");
        toMagicModuleMetaRepoModel.write(isresolutionnotsupported, "");
        return read(subject);
    }
}
