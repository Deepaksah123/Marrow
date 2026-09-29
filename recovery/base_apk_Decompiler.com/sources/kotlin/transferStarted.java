package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class transferStarted {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    public static final List<ByteArrayDataSource> AudioAttributesCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 9;
        read = i2 % 128;
        int i3 = i2 % 2;
        getMagicModuleSavedMcqCount<ByteArrayDataSource> getmagicmodulesavedmcqcount = ByteArrayDataSource.read();
        int i4 = read;
        int i5 = ((i4 ^ 15) | (i4 & 15)) << 1;
        int i6 = -(((~i4) & 15) | (i4 & (-16)));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        RemoteActionCompatParcelizer = i7 % 128;
        int i8 = i7 % 2;
        return getmagicmodulesavedmcqcount;
    }
}
