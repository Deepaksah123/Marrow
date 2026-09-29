package kotlin;

/* JADX INFO: loaded from: classes2.dex */
final class EnumDeserializer1 {

    interface AudioAttributesCompatParcelizer<T> {
        T AudioAttributesCompatParcelizer();

        void RemoteActionCompatParcelizer(T[] tArr, int i);

        boolean write(T t);
    }

    static class IconCompatParcelizer<T> implements AudioAttributesCompatParcelizer<T> {
        private final Object[] AudioAttributesCompatParcelizer = new Object[256];
        private int write;

        IconCompatParcelizer() {
        }

        @Override // o.EnumDeserializer1.AudioAttributesCompatParcelizer
        public final T AudioAttributesCompatParcelizer() {
            int i = this.write;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            Object[] objArr = this.AudioAttributesCompatParcelizer;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.write = i2;
            return t;
        }

        @Override // o.EnumDeserializer1.AudioAttributesCompatParcelizer
        public final boolean write(T t) {
            int i = this.write;
            Object[] objArr = this.AudioAttributesCompatParcelizer;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.write = i + 1;
            return true;
        }

        @Override // o.EnumDeserializer1.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                int i3 = this.write;
                Object[] objArr = this.AudioAttributesCompatParcelizer;
                if (i3 < objArr.length) {
                    objArr[i3] = t;
                    this.write = i3 + 1;
                }
            }
        }
    }
}
