package kotlin;

import kotlin.getError;

/* JADX INFO: loaded from: classes2.dex */
public final class createAndAcquireSessionWithRetry {
    private getError.write AudioAttributesCompatParcelizer;
    private float AudioAttributesImplApi21Parcelizer;
    private float AudioAttributesImplApi26Parcelizer;
    private float AudioAttributesImplBaseParcelizer;
    private float IconCompatParcelizer;
    private float MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private int RemoteActionCompatParcelizer;
    private float read;
    private int write;

    public createAndAcquireSessionWithRetry(float f, float f2, float f3, float f4, int i, getError.write writeVar) {
        this.write = -1;
        this.MediaBrowserCompatItemReceiver = -1;
        this.AudioAttributesImplApi21Parcelizer = f;
        this.AudioAttributesImplApi26Parcelizer = f2;
        this.AudioAttributesImplBaseParcelizer = f3;
        this.MediaBrowserCompatCustomActionResultReceiver = f4;
        this.RemoteActionCompatParcelizer = i;
        this.AudioAttributesCompatParcelizer = writeVar;
    }

    public createAndAcquireSessionWithRetry(float f, float f2, float f3, float f4, int i, int i2, getError.write writeVar) {
        this(f, f2, f3, f4, i, writeVar);
        this.MediaBrowserCompatItemReceiver = i2;
    }

    public final float MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final float MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final float AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final float AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final int write() {
        return this.write;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.write = i;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final getError.write AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void write(float f, float f2) {
        this.IconCompatParcelizer = f;
        this.read = f2;
    }

    public final float read() {
        return this.IconCompatParcelizer;
    }

    public final float IconCompatParcelizer() {
        return this.read;
    }

    public final boolean AudioAttributesCompatParcelizer(createAndAcquireSessionWithRetry createandacquiresessionwithretry) {
        return createandacquiresessionwithretry != null && this.RemoteActionCompatParcelizer == createandacquiresessionwithretry.RemoteActionCompatParcelizer && this.AudioAttributesImplApi21Parcelizer == createandacquiresessionwithretry.AudioAttributesImplApi21Parcelizer && this.MediaBrowserCompatItemReceiver == createandacquiresessionwithretry.MediaBrowserCompatItemReceiver && this.write == createandacquiresessionwithretry.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Highlight, x: ");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", y: ");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", dataSetIndex: ");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", stackIndex (only stacked barentry): ");
        sb.append(this.MediaBrowserCompatItemReceiver);
        return sb.toString();
    }
}
