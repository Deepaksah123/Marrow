package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lambdaprepareChildSource0comgoogleandroidexoplayer2MediaSourceList {
    abstract void IconCompatParcelizer(boolean z);

    public abstract void read();

    /* synthetic */ lambdaprepareChildSource0comgoogleandroidexoplayer2MediaSourceList(byte b) {
        this();
    }

    public static lambdaprepareChildSource0comgoogleandroidexoplayer2MediaSourceList write() {
        return new write();
    }

    private lambdaprepareChildSource0comgoogleandroidexoplayer2MediaSourceList() {
    }

    static class write extends lambdaprepareChildSource0comgoogleandroidexoplayer2MediaSourceList {
        private volatile boolean IconCompatParcelizer;

        write() {
            super((byte) 0);
        }

        @Override // kotlin.lambdaprepareChildSource0comgoogleandroidexoplayer2MediaSourceList
        public final void read() {
            if (this.IconCompatParcelizer) {
                throw new IllegalStateException("Already released");
            }
        }

        @Override // kotlin.lambdaprepareChildSource0comgoogleandroidexoplayer2MediaSourceList
        public final void IconCompatParcelizer(boolean z) {
            this.IconCompatParcelizer = z;
        }
    }
}
