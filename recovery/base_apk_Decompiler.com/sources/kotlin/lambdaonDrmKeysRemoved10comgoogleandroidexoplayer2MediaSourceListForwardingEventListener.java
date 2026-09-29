package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaonDrmKeysRemoved10comgoogleandroidexoplayer2MediaSourceListForwardingEventListener {
    private int AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private int IconCompatParcelizer;
    private byte[] RemoteActionCompatParcelizer;
    private int read;
    private int write;

    public lambdaonDrmKeysRemoved10comgoogleandroidexoplayer2MediaSourceListForwardingEventListener(onSourceInfoRefreshed onsourceinforefreshed, byte[] bArr) {
        this.read = 0;
        this.AudioAttributesCompatParcelizer = 0;
        this.AudioAttributesImplApi26Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = 0;
        this.write = 0;
        this.RemoteActionCompatParcelizer = new byte[0];
        this.IconCompatParcelizer = 0;
        this.AudioAttributesImplApi21Parcelizer = false;
        this.read = onsourceinforefreshed.write();
        this.AudioAttributesCompatParcelizer = onsourceinforefreshed.read();
        this.AudioAttributesImplApi26Parcelizer = onsourceinforefreshed.IconCompatParcelizer();
        this.AudioAttributesImplBaseParcelizer = onsourceinforefreshed.AudioAttributesCompatParcelizer();
        this.write = bArr != null ? bArr.length : 0;
        this.RemoteActionCompatParcelizer = bArr;
        this.IconCompatParcelizer = 0;
        this.AudioAttributesImplApi21Parcelizer = true;
    }

    public lambdaonDrmKeysRemoved10comgoogleandroidexoplayer2MediaSourceListForwardingEventListener(onSourceInfoRefreshed onsourceinforefreshed, int i, int i2, int i3) {
        this.read = 0;
        this.AudioAttributesCompatParcelizer = 0;
        this.AudioAttributesImplApi26Parcelizer = 0;
        this.AudioAttributesImplBaseParcelizer = 0;
        this.write = 0;
        this.RemoteActionCompatParcelizer = new byte[0];
        this.IconCompatParcelizer = 0;
        this.AudioAttributesImplApi21Parcelizer = false;
        this.read = onsourceinforefreshed.write();
        this.AudioAttributesCompatParcelizer = onsourceinforefreshed.read();
        this.AudioAttributesImplApi26Parcelizer = i;
        this.AudioAttributesImplBaseParcelizer = i2;
        this.IconCompatParcelizer = i3;
        this.AudioAttributesImplApi21Parcelizer = true;
    }

    public final byte[] write() {
        byte[] bArr = this.RemoteActionCompatParcelizer;
        int length = 4;
        int length2 = (bArr == null || bArr.length == 0) ? 4 : bArr.length + 5;
        if (this.AudioAttributesImplApi21Parcelizer) {
            length2++;
        }
        byte[] bArr2 = new byte[length2];
        bArr2[0] = (byte) this.read;
        bArr2[1] = (byte) this.AudioAttributesCompatParcelizer;
        bArr2[2] = (byte) this.AudioAttributesImplApi26Parcelizer;
        bArr2[3] = (byte) this.AudioAttributesImplBaseParcelizer;
        if (bArr != null && bArr.length != 0) {
            bArr2[4] = (byte) this.write;
            System.arraycopy(bArr, 0, bArr2, 5, bArr.length);
            length = this.RemoteActionCompatParcelizer.length + 5;
        }
        if (this.AudioAttributesImplApi21Parcelizer) {
            bArr2[length] = (byte) (bArr2[length] + ((byte) this.IconCompatParcelizer));
        }
        return bArr2;
    }
}
