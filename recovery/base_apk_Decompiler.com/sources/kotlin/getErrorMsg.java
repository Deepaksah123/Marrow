package kotlin;

import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class getErrorMsg extends UserPaymentResponseBody {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class AudioAttributesCompatParcelizer<T> implements Iterator<T>, getCurrentAnsweredMcqProgress {
        private /* synthetic */ Enumeration<T> write;

        AudioAttributesCompatParcelizer(Enumeration<T> enumeration) {
            this.write = enumeration;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.write.hasMoreElements();
        }

        @Override // java.util.Iterator
        public final T next() {
            return this.write.nextElement();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> Iterator<T> AudioAttributesCompatParcelizer(Enumeration<T> enumeration) {
        toMagicModuleMetaRepoModel.write(enumeration, "");
        return new AudioAttributesCompatParcelizer(enumeration);
    }
}
