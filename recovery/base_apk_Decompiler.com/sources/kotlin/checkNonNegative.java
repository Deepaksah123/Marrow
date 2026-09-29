package kotlin;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class checkNonNegative {
    private static final checkNonNegative AudioAttributesCompatParcelizer = new checkNonNegative() { // from class: o.checkNonNegative.3
        @Override // kotlin.checkNonNegative
        public final int read() {
            return 0;
        }

        @Override // kotlin.checkNonNegative
        public final <T> checkNonNegative AudioAttributesCompatParcelizer(T t, T t2, Comparator<T> comparator) {
            return read(comparator.compare(t, t2));
        }

        @Override // kotlin.checkNonNegative
        public final checkNonNegative AudioAttributesCompatParcelizer(int i, int i2) {
            return read(parseTextAttribute.write(i, i2));
        }

        @Override // kotlin.checkNonNegative
        public final checkNonNegative IconCompatParcelizer(long j, long j2) {
            return read(setFormatMetadata.write(j, j2));
        }

        @Override // kotlin.checkNonNegative
        public final checkNonNegative RemoteActionCompatParcelizer(boolean z, boolean z2) {
            return read(parseCommentAttribute.IconCompatParcelizer(z2, z));
        }

        @Override // kotlin.checkNonNegative
        public final checkNonNegative IconCompatParcelizer(boolean z, boolean z2) {
            return read(parseCommentAttribute.IconCompatParcelizer(z, z2));
        }

        private static checkNonNegative read(int i) {
            if (i < 0) {
                return checkNonNegative.RemoteActionCompatParcelizer;
            }
            return i > 0 ? checkNonNegative.write : checkNonNegative.AudioAttributesCompatParcelizer;
        }
    };
    private static final checkNonNegative RemoteActionCompatParcelizer = new IconCompatParcelizer(-1);
    private static final checkNonNegative write = new IconCompatParcelizer(1);

    public abstract checkNonNegative AudioAttributesCompatParcelizer(int i, int i2);

    public abstract <T> checkNonNegative AudioAttributesCompatParcelizer(T t, T t2, Comparator<T> comparator);

    public abstract checkNonNegative IconCompatParcelizer(long j, long j2);

    public abstract checkNonNegative IconCompatParcelizer(boolean z, boolean z2);

    public abstract checkNonNegative RemoteActionCompatParcelizer(boolean z, boolean z2);

    public abstract int read();

    /* synthetic */ checkNonNegative(byte b) {
        this();
    }

    private checkNonNegative() {
    }

    public static checkNonNegative write() {
        return AudioAttributesCompatParcelizer;
    }

    static final class IconCompatParcelizer extends checkNonNegative {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.checkNonNegative
        public final checkNonNegative AudioAttributesCompatParcelizer(int i, int i2) {
            return this;
        }

        @Override // kotlin.checkNonNegative
        public final <T> checkNonNegative AudioAttributesCompatParcelizer(T t, T t2, Comparator<T> comparator) {
            return this;
        }

        @Override // kotlin.checkNonNegative
        public final checkNonNegative IconCompatParcelizer(long j, long j2) {
            return this;
        }

        @Override // kotlin.checkNonNegative
        public final checkNonNegative IconCompatParcelizer(boolean z, boolean z2) {
            return this;
        }

        @Override // kotlin.checkNonNegative
        public final checkNonNegative RemoteActionCompatParcelizer(boolean z, boolean z2) {
            return this;
        }

        IconCompatParcelizer(int i) {
            super((byte) 0);
            this.RemoteActionCompatParcelizer = i;
        }

        @Override // kotlin.checkNonNegative
        public final int read() {
            return this.RemoteActionCompatParcelizer;
        }
    }
}
