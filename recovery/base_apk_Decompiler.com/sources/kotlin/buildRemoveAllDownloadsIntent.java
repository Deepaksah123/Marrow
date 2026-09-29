package kotlin;

/* JADX INFO: loaded from: classes.dex */
public final class buildRemoveAllDownloadsIntent {
    public int AudioAttributesCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public int read;

    public static void read(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    public static int read(int i) {
        DownloadRequestBuilder downloadRequestBuilder = DownloadRequestBuilder.IconCompatParcelizer;
        return ((downloadRequestBuilder.RemoteActionCompatParcelizer[0][(i >>> 24) & 255] + downloadRequestBuilder.RemoteActionCompatParcelizer[1][(i >>> 16) & 255]) ^ downloadRequestBuilder.RemoteActionCompatParcelizer[2][(i >>> 8) & 255]) + downloadRequestBuilder.RemoteActionCompatParcelizer[3][i & 255];
    }
}
