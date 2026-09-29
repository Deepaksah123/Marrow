package kotlin;

/* JADX INFO: loaded from: classes.dex */
public final class setNegativeButton {
    private int AudioAttributesImplBaseParcelizer = 0;
    private int AudioAttributesImplApi21Parcelizer = 0;
    private int MediaBrowserCompatCustomActionResultReceiver = Integer.MIN_VALUE;
    private int write = Integer.MIN_VALUE;
    private int RemoteActionCompatParcelizer = 0;
    private int AudioAttributesCompatParcelizer = 0;
    private boolean IconCompatParcelizer = false;
    private boolean read = false;

    public final int read() {
        return this.IconCompatParcelizer ? this.AudioAttributesImplApi21Parcelizer : this.AudioAttributesImplBaseParcelizer;
    }

    public final int IconCompatParcelizer() {
        return this.IconCompatParcelizer ? this.AudioAttributesImplBaseParcelizer : this.AudioAttributesImplApi21Parcelizer;
    }

    public final void RemoteActionCompatParcelizer(int i, int i2) {
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        this.write = i2;
        this.read = true;
        if (this.IconCompatParcelizer) {
            if (i2 != Integer.MIN_VALUE) {
                this.AudioAttributesImplBaseParcelizer = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.AudioAttributesImplApi21Parcelizer = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.AudioAttributesImplBaseParcelizer = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.AudioAttributesImplApi21Parcelizer = i2;
        }
    }

    public final void AudioAttributesCompatParcelizer(int i, int i2) {
        this.read = false;
        if (i != Integer.MIN_VALUE) {
            this.RemoteActionCompatParcelizer = i;
            this.AudioAttributesImplBaseParcelizer = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.AudioAttributesCompatParcelizer = i2;
            this.AudioAttributesImplApi21Parcelizer = i2;
        }
    }

    public final void read(boolean z) {
        if (z == this.IconCompatParcelizer) {
            return;
        }
        this.IconCompatParcelizer = z;
        if (!this.read) {
            this.AudioAttributesImplBaseParcelizer = this.RemoteActionCompatParcelizer;
            this.AudioAttributesImplApi21Parcelizer = this.AudioAttributesCompatParcelizer;
            return;
        }
        if (z) {
            int i = this.write;
            if (i == Integer.MIN_VALUE) {
                i = this.RemoteActionCompatParcelizer;
            }
            this.AudioAttributesImplBaseParcelizer = i;
            int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
            if (i2 == Integer.MIN_VALUE) {
                i2 = this.AudioAttributesCompatParcelizer;
            }
            this.AudioAttributesImplApi21Parcelizer = i2;
            return;
        }
        int i3 = this.MediaBrowserCompatCustomActionResultReceiver;
        if (i3 == Integer.MIN_VALUE) {
            i3 = this.RemoteActionCompatParcelizer;
        }
        this.AudioAttributesImplBaseParcelizer = i3;
        int i4 = this.write;
        if (i4 == Integer.MIN_VALUE) {
            i4 = this.AudioAttributesCompatParcelizer;
        }
        this.AudioAttributesImplApi21Parcelizer = i4;
    }
}
