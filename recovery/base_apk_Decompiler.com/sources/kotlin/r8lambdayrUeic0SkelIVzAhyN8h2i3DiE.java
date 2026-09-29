package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdayrUeic0SkelIVzAhyN8h2i3DiE {
    private static volatile int RemoteActionCompatParcelizer = 100;
    private int AudioAttributesCompatParcelizer;
    private boolean IconCompatParcelizer;
    private int read;

    public abstract int IconCompatParcelizer();

    public abstract int RemoteActionCompatParcelizer(int i) throws getMaxParallelDownloads;

    /* synthetic */ r8lambdayrUeic0SkelIVzAhyN8h2i3DiE(byte b) {
        this();
    }

    public static r8lambdayrUeic0SkelIVzAhyN8h2i3DiE read(byte[] bArr) {
        return write(bArr, bArr.length);
    }

    private static r8lambdayrUeic0SkelIVzAhyN8h2i3DiE write(byte[] bArr, int i) {
        return IconCompatParcelizer(bArr, 0, i, false);
    }

    private static r8lambdayrUeic0SkelIVzAhyN8h2i3DiE IconCompatParcelizer(byte[] bArr, int i, int i2, boolean z) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(bArr, 0, i2, false, (byte) 0);
        try {
            remoteActionCompatParcelizer.RemoteActionCompatParcelizer(i2);
            return remoteActionCompatParcelizer;
        } catch (getMaxParallelDownloads e) {
            throw new IllegalArgumentException(e);
        }
    }

    private r8lambdayrUeic0SkelIVzAhyN8h2i3DiE() {
        this.read = RemoteActionCompatParcelizer;
        this.AudioAttributesCompatParcelizer = Integer.MAX_VALUE;
        this.IconCompatParcelizer = false;
    }

    static final class RemoteActionCompatParcelizer extends r8lambdayrUeic0SkelIVzAhyN8h2i3DiE {
        private int AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private final byte[] IconCompatParcelizer;
        private int MediaBrowserCompatItemReceiver;
        private int RemoteActionCompatParcelizer;
        private final boolean read;
        private int write;

        /* synthetic */ RemoteActionCompatParcelizer(byte[] bArr, int i, int i2, boolean z, byte b) {
            this(bArr, i, i2, z);
        }

        private RemoteActionCompatParcelizer(byte[] bArr, int i, int i2, boolean z) {
            super((byte) 0);
            this.write = Integer.MAX_VALUE;
            this.IconCompatParcelizer = bArr;
            this.RemoteActionCompatParcelizer = i2 + i;
            this.MediaBrowserCompatItemReceiver = i;
            this.AudioAttributesImplApi21Parcelizer = i;
            this.read = z;
        }

        @Override // kotlin.r8lambdayrUeic0SkelIVzAhyN8h2i3DiE
        public final int RemoteActionCompatParcelizer(int i) throws getMaxParallelDownloads {
            if (i < 0) {
                throw getMaxParallelDownloads.IconCompatParcelizer();
            }
            int iIconCompatParcelizer = i + IconCompatParcelizer();
            if (iIconCompatParcelizer < 0) {
                throw getMaxParallelDownloads.AudioAttributesCompatParcelizer();
            }
            int i2 = this.write;
            if (iIconCompatParcelizer > i2) {
                throw getMaxParallelDownloads.RemoteActionCompatParcelizer();
            }
            this.write = iIconCompatParcelizer;
            read();
            return i2;
        }

        private void read() {
            int i = this.RemoteActionCompatParcelizer + this.AudioAttributesCompatParcelizer;
            this.RemoteActionCompatParcelizer = i;
            int i2 = i - this.AudioAttributesImplApi21Parcelizer;
            int i3 = this.write;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.AudioAttributesCompatParcelizer = i4;
                this.RemoteActionCompatParcelizer = i - i4;
                return;
            }
            this.AudioAttributesCompatParcelizer = 0;
        }

        @Override // kotlin.r8lambdayrUeic0SkelIVzAhyN8h2i3DiE
        public final int IconCompatParcelizer() {
            return this.MediaBrowserCompatItemReceiver - this.AudioAttributesImplApi21Parcelizer;
        }
    }
}
