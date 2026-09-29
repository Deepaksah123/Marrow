package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class PublicKeyCredentialRpEntity {
    private final int AudioAttributesCompatParcelizer;
    private double AudioAttributesImplApi21Parcelizer;
    private double IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final int RemoteActionCompatParcelizer;
    private final int read;
    private double write;

    public PublicKeyCredentialRpEntity(int i, int i2, int i3, int i4) {
        this.RemoteActionCompatParcelizer = i;
        this.AudioAttributesCompatParcelizer = i2;
        this.MediaBrowserCompatCustomActionResultReceiver = i3;
        this.read = i4;
        this.IconCompatParcelizer = dispatchTouchEvent.read(i2, MediaBrowserCompatCustomActionResultReceiver(), 1);
        this.AudioAttributesImplApi21Parcelizer = dispatchTouchEvent.read(i3, MediaBrowserCompatCustomActionResultReceiver(), 1);
        double d = dispatchTouchEvent.read(i4, MediaBrowserCompatCustomActionResultReceiver(), 1);
        this.write = d;
        double d2 = this.IconCompatParcelizer;
        double d3 = this.AudioAttributesImplApi21Parcelizer;
        double d4 = 100.0d - ((d2 + d3) + d);
        double dMax = Math.max(d2, Math.max(d3, d));
        double d5 = this.IconCompatParcelizer;
        if (dMax == d5) {
            this.IconCompatParcelizer = d5 + d4;
            return;
        }
        double d6 = this.AudioAttributesImplApi21Parcelizer;
        if (dMax == d6) {
            this.AudioAttributesImplApi21Parcelizer = d6 + d4;
            return;
        }
        double d7 = this.write;
        if (dMax == d7) {
            this.write = d7 + d4;
        }
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final int write() {
        return this.read;
    }

    public final int MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesCompatParcelizer + this.MediaBrowserCompatCustomActionResultReceiver + this.read;
    }

    public final double RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final double AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final double read() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublicKeyCredentialRpEntity)) {
            return false;
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
        return this.RemoteActionCompatParcelizer == publicKeyCredentialRpEntity.RemoteActionCompatParcelizer && this.AudioAttributesCompatParcelizer == publicKeyCredentialRpEntity.AudioAttributesCompatParcelizer && this.MediaBrowserCompatCustomActionResultReceiver == publicKeyCredentialRpEntity.MediaBrowserCompatCustomActionResultReceiver && this.read == publicKeyCredentialRpEntity.read;
    }

    public final int hashCode() {
        return (((((Integer.hashCode(this.RemoteActionCompatParcelizer) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + Integer.hashCode(this.read);
    }

    public final String toString() {
        int i = this.RemoteActionCompatParcelizer;
        int i2 = this.AudioAttributesCompatParcelizer;
        int i3 = this.MediaBrowserCompatCustomActionResultReceiver;
        int i4 = this.read;
        StringBuilder sb = new StringBuilder("QbankPerformanceUiModel(percentile=");
        sb.append(i);
        sb.append(", correctCount=");
        sb.append(i2);
        sb.append(", wrongCount=");
        sb.append(i3);
        sb.append(", skippedCount=");
        sb.append(i4);
        sb.append(")");
        return sb.toString();
    }
}
