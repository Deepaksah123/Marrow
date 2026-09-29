package kotlin;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SubjectCompletionInfo<K, V> {
    private final ConcurrentHashMap<String, Integer> AudioAttributesCompatParcelizer = new ConcurrentHashMap<>();
    private final AtomicInteger RemoteActionCompatParcelizer = new AtomicInteger(0);

    public abstract int write(ConcurrentHashMap<String, Integer> concurrentHashMap, String str, getAnswerMap<? super String, Integer> getanswermap);

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends V, KK extends K> setCategory<K, V, T> write(isHdPlaybackError<KK> ishdplaybackerror) {
        toMagicModuleMetaRepoModel.write(ishdplaybackerror, "");
        return new setCategory<>(ishdplaybackerror, AudioAttributesCompatParcelizer(ishdplaybackerror));
    }

    static final class AudioAttributesCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<String, Integer> {
        private /* synthetic */ SubjectCompletionInfo<K, V> read;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Integer invoke(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            return Integer.valueOf(((SubjectCompletionInfo) this.read).RemoteActionCompatParcelizer.getAndIncrement());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(SubjectCompletionInfo<K, V> subjectCompletionInfo) {
            super(1);
            this.read = subjectCompletionInfo;
        }
    }

    public final <T extends K> int AudioAttributesCompatParcelizer(isHdPlaybackError<T> ishdplaybackerror) {
        toMagicModuleMetaRepoModel.write(ishdplaybackerror, "");
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.AudioAttributesCompatParcelizer;
        String strAudioAttributesImplBaseParcelizer = ishdplaybackerror.AudioAttributesImplBaseParcelizer();
        toMagicModuleMetaRepoModel.write((Object) strAudioAttributesImplBaseParcelizer);
        return write(concurrentHashMap, strAudioAttributesImplBaseParcelizer, new AudioAttributesCompatParcelizer(this));
    }

    public final Collection<Integer> read() {
        Collection<Integer> collectionValues = this.AudioAttributesCompatParcelizer.values();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(collectionValues, "");
        return collectionValues;
    }
}
