package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaonLoadCompleted1comgoogleandroidexoplayer2MediaSourceListForwardingEventListener {
    public static boolean AudioAttributesCompatParcelizer(byte[] bArr) {
        return RemoteActionCompatParcelizer(bArr, lambdaonDrmKeysLoaded7comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.write("6C"));
    }

    public static boolean RemoteActionCompatParcelizer(byte[] bArr) {
        return RemoteActionCompatParcelizer(bArr, lambdaonDrmKeysLoaded7comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.write("9000"));
    }

    private static boolean RemoteActionCompatParcelizer(byte[] bArr, byte[] bArr2) {
        return bArr != null && bArr.length >= 2 && bArr[bArr.length - 2] == bArr2[0] && bArr[bArr.length - 1] == bArr2[1];
    }
}
