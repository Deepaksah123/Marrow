package kotlin;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Subject<K, V> implements Iterable<V>, getCurrentAnsweredMcqProgress {
    protected abstract void AudioAttributesCompatParcelizer(isHdPlaybackError<? extends K> ishdplaybackerror, V v);

    protected abstract setSearchTimes<V> IconCompatParcelizer();

    protected abstract SubjectCompletionInfo<K, V> RemoteActionCompatParcelizer();

    public static abstract class read<K, V, T extends V> {
        private final int IconCompatParcelizer;
        private final isHdPlaybackError<? extends K> read;

        public read(isHdPlaybackError<? extends K> ishdplaybackerror, int i) {
            toMagicModuleMetaRepoModel.write(ishdplaybackerror, "");
            this.read = ishdplaybackerror;
            this.IconCompatParcelizer = i;
        }

        protected final T read(Subject<K, V> subject) {
            toMagicModuleMetaRepoModel.write(subject, "");
            return subject.IconCompatParcelizer().AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<V> iterator() {
        return IconCompatParcelizer().iterator();
    }

    public final boolean write() {
        return IconCompatParcelizer().RemoteActionCompatParcelizer() == 0;
    }
}
