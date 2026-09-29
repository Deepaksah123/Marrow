package kotlin;

import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getPlaybackAllowed extends getFinalData {
    public abstract Random write();

    @Override // kotlin.getFinalData
    public final int AudioAttributesCompatParcelizer(int i) {
        return setEdition.RemoteActionCompatParcelizer(write().nextInt(), i);
    }

    @Override // kotlin.getFinalData
    public final int IconCompatParcelizer() {
        return write().nextInt();
    }

    @Override // kotlin.getFinalData
    public final int read(int i) {
        return write().nextInt(i);
    }

    @Override // kotlin.getFinalData
    public final byte[] RemoteActionCompatParcelizer(byte[] bArr) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        write().nextBytes(bArr);
        return bArr;
    }
}
