package kotlin;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public interface ResolvedRecursiveType {
    public static final ResolvedRecursiveType AudioAttributesCompatParcelizer = new ResolvedRecursiveType() { // from class: o.ResolvedRecursiveType.3
        @Override // kotlin.ResolvedRecursiveType
        public final boolean read() {
            return false;
        }

        @Override // kotlin.ResolvedRecursiveType
        public final long RemoteActionCompatParcelizer() {
            throw new NoSuchElementException();
        }

        @Override // kotlin.ResolvedRecursiveType
        public final long AudioAttributesCompatParcelizer() {
            throw new NoSuchElementException();
        }
    };

    long AudioAttributesCompatParcelizer();

    long RemoteActionCompatParcelizer();

    boolean read();
}
