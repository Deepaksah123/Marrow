package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public enum onSourceInfoRefreshed {
    SELECT(0, 164, 4),
    READ_RECORD(0, 178, 0),
    GPO(128, 168, 0),
    GET_DATA(128, 202, 0);

    private int AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver = 0;
    private int MediaBrowserCompatItemReceiver;

    onSourceInfoRefreshed(int i, int i2, int i3) {
        this.AudioAttributesImplApi26Parcelizer = i;
        this.MediaBrowserCompatItemReceiver = i2;
        this.AudioAttributesImplApi21Parcelizer = i3;
    }

    public final int write() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final int read() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final int IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }
}
