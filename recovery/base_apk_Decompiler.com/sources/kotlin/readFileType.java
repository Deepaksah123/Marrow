package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class readFileType {
    public final int AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    public final long IconCompatParcelizer;
    public final read MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    public final double RemoteActionCompatParcelizer;
    public final AudioAttributesCompatParcelizer read;
    public final double write;

    public static class read {
        public final int IconCompatParcelizer;
        public final int RemoteActionCompatParcelizer = 4;

        public read(int i) {
            this.IconCompatParcelizer = i;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static class AudioAttributesCompatParcelizer {
        public final boolean AudioAttributesCompatParcelizer;
        public final boolean IconCompatParcelizer;
        public final boolean read;

        public AudioAttributesCompatParcelizer(boolean z, boolean z2, boolean z3) {
            this.IconCompatParcelizer = z;
            this.AudioAttributesCompatParcelizer = z2;
            this.read = z3;
        }
    }

    public readFileType(long j, read readVar, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, int i, int i2, double d, double d2, int i3) {
        this.IconCompatParcelizer = j;
        this.MediaBrowserCompatCustomActionResultReceiver = readVar;
        this.read = audioAttributesCompatParcelizer;
        this.AudioAttributesImplApi26Parcelizer = i;
        this.MediaBrowserCompatItemReceiver = i2;
        this.write = d;
        this.RemoteActionCompatParcelizer = d2;
        this.AudioAttributesCompatParcelizer = i3;
    }

    public final boolean read(long j) {
        return this.IconCompatParcelizer < j;
    }
}
