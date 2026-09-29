package kotlin;

import kotlin.isCollectionMapOrArray;

/* JADX INFO: loaded from: classes2.dex */
public final class hasEnclosingMethod implements isCollectionMapOrArray {
    private final long AudioAttributesCompatParcelizer;
    private final long[] IconCompatParcelizer;
    private final boolean read;
    private final long[] write;

    public hasEnclosingMethod(long[] jArr, long[] jArr2, long j) {
        buildTypeSerializer.IconCompatParcelizer(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.read = z;
        if (z && jArr2[0] > 0) {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.write = jArr3;
            long[] jArr4 = new long[i];
            this.IconCompatParcelizer = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.write = jArr;
            this.IconCompatParcelizer = jArr2;
        }
        this.AudioAttributesCompatParcelizer = j;
    }

    @Override // kotlin.isCollectionMapOrArray
    public final boolean IconCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.isCollectionMapOrArray
    public final long read() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.isCollectionMapOrArray
    public final isCollectionMapOrArray.read write(long j) {
        if (!this.read) {
            return new isCollectionMapOrArray.read(isLocalType.AudioAttributesCompatParcelizer);
        }
        int iRemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(this.IconCompatParcelizer, j, true);
        isLocalType islocaltype = new isLocalType(this.IconCompatParcelizer[iRemoteActionCompatParcelizer], this.write[iRemoteActionCompatParcelizer]);
        if (islocaltype.IconCompatParcelizer != j) {
            long[] jArr = this.IconCompatParcelizer;
            if (iRemoteActionCompatParcelizer != jArr.length - 1) {
                int i = iRemoteActionCompatParcelizer + 1;
                return new isCollectionMapOrArray.read(islocaltype, new isLocalType(jArr[i], this.write[i]));
            }
        }
        return new isCollectionMapOrArray.read(islocaltype);
    }
}
