package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getPaymentFlag<T> {
    private int AudioAttributesCompatParcelizer;
    private int IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    private T[] read;
    private float write;

    private static int RemoteActionCompatParcelizer(int i) {
        int i2 = i * (-1640531527);
        return i2 ^ (i2 >>> 16);
    }

    public getPaymentFlag() {
        this((byte) 0);
    }

    private getPaymentFlag(byte b) {
        this.write = 0.75f;
        int iAudioAttributesCompatParcelizer = getExpiresOn.AudioAttributesCompatParcelizer(16);
        this.IconCompatParcelizer = iAudioAttributesCompatParcelizer - 1;
        this.AudioAttributesCompatParcelizer = (int) (iAudioAttributesCompatParcelizer * 0.75f);
        this.read = (T[]) new Object[iAudioAttributesCompatParcelizer];
    }

    public final boolean RemoteActionCompatParcelizer(T t) {
        T t2;
        T[] tArr = this.read;
        int i = this.IconCompatParcelizer;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(t.hashCode()) & i;
        T t3 = tArr[iRemoteActionCompatParcelizer];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                iRemoteActionCompatParcelizer = (iRemoteActionCompatParcelizer + 1) & i;
                t2 = tArr[iRemoteActionCompatParcelizer];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[iRemoteActionCompatParcelizer] = t;
        int i2 = this.RemoteActionCompatParcelizer + 1;
        this.RemoteActionCompatParcelizer = i2;
        if (i2 >= this.AudioAttributesCompatParcelizer) {
            IconCompatParcelizer();
        }
        return true;
    }

    public final boolean AudioAttributesCompatParcelizer(T t) {
        T t2;
        T[] tArr = this.read;
        int i = this.IconCompatParcelizer;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(t.hashCode()) & i;
        T t3 = tArr[iRemoteActionCompatParcelizer];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, tArr, i);
        }
        do {
            iRemoteActionCompatParcelizer = (iRemoteActionCompatParcelizer + 1) & i;
            t2 = tArr[iRemoteActionCompatParcelizer];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, tArr, i);
    }

    private boolean AudioAttributesCompatParcelizer(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.RemoteActionCompatParcelizer--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(t.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= iRemoteActionCompatParcelizer || iRemoteActionCompatParcelizer > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else if (i < iRemoteActionCompatParcelizer || iRemoteActionCompatParcelizer <= i3) {
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    private void IconCompatParcelizer() {
        T t;
        T[] tArr = this.read;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = (T[]) new Object[i];
        for (int i3 = this.RemoteActionCompatParcelizer; i3 != 0; i3--) {
            do {
                length--;
                t = tArr[length];
            } while (t == null);
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(t.hashCode()) & i2;
            if (tArr2[iRemoteActionCompatParcelizer] != null) {
                do {
                    iRemoteActionCompatParcelizer = (iRemoteActionCompatParcelizer + 1) & i2;
                } while (tArr2[iRemoteActionCompatParcelizer] != null);
            }
            tArr2[iRemoteActionCompatParcelizer] = tArr[length];
        }
        this.IconCompatParcelizer = i2;
        this.AudioAttributesCompatParcelizer = (int) (i * this.write);
        this.read = tArr2;
    }

    public final Object[] RemoteActionCompatParcelizer() {
        return this.read;
    }
}
