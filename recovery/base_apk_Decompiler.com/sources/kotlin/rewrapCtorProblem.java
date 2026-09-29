package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class rewrapCtorProblem {

    public interface IconCompatParcelizer<T> {
        T RemoteActionCompatParcelizer();

        boolean RemoteActionCompatParcelizer(T t);
    }

    public static class AudioAttributesCompatParcelizer<T> implements IconCompatParcelizer<T> {
        private final Object[] RemoteActionCompatParcelizer;
        private int write;

        public AudioAttributesCompatParcelizer(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0".toString());
            }
            this.RemoteActionCompatParcelizer = new Object[i];
        }

        @Override // o.rewrapCtorProblem.IconCompatParcelizer
        public T RemoteActionCompatParcelizer() {
            int i = this.write;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            T t = (T) this.RemoteActionCompatParcelizer[i2];
            toMagicModuleMetaRepoModel.read(t, "");
            this.RemoteActionCompatParcelizer[i2] = null;
            this.write--;
            return t;
        }

        @Override // o.rewrapCtorProblem.IconCompatParcelizer
        public boolean RemoteActionCompatParcelizer(T t) {
            toMagicModuleMetaRepoModel.write(t, "");
            if (write(t)) {
                throw new IllegalStateException("Already in the pool!".toString());
            }
            int i = this.write;
            Object[] objArr = this.RemoteActionCompatParcelizer;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.write = i + 1;
            return true;
        }

        private final boolean write(T t) {
            int i = this.write;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.RemoteActionCompatParcelizer[i2] == t) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class read<T> extends AudioAttributesCompatParcelizer<T> {
        private final Object IconCompatParcelizer;

        public read(int i) {
            super(i);
            this.IconCompatParcelizer = new Object();
        }

        @Override // o.rewrapCtorProblem.AudioAttributesCompatParcelizer, o.rewrapCtorProblem.IconCompatParcelizer
        public final T RemoteActionCompatParcelizer() {
            T t;
            synchronized (this.IconCompatParcelizer) {
                t = (T) super.RemoteActionCompatParcelizer();
            }
            return t;
        }

        @Override // o.rewrapCtorProblem.AudioAttributesCompatParcelizer, o.rewrapCtorProblem.IconCompatParcelizer
        public final boolean RemoteActionCompatParcelizer(T t) {
            boolean zRemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.write(t, "");
            synchronized (this.IconCompatParcelizer) {
                zRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer(t);
            }
            return zRemoteActionCompatParcelizer;
        }
    }
}
