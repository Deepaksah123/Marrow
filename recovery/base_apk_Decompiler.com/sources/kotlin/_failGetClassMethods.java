package kotlin;

import java.util.Arrays;
import kotlin.isCollectionMapOrArray;

/* JADX INFO: loaded from: classes2.dex */
public final class _failGetClassMethods implements isCollectionMapOrArray {
    public final long[] AudioAttributesCompatParcelizer;
    private final long AudioAttributesImplBaseParcelizer;
    public final int IconCompatParcelizer;
    public final long[] RemoteActionCompatParcelizer;
    public final int[] read;
    public final long[] write;

    @Override // kotlin.isCollectionMapOrArray
    public final boolean IconCompatParcelizer() {
        return true;
    }

    public _failGetClassMethods(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.read = iArr;
        this.write = jArr;
        this.RemoteActionCompatParcelizer = jArr2;
        this.AudioAttributesCompatParcelizer = jArr3;
        int length = iArr.length;
        this.IconCompatParcelizer = length;
        if (length > 0) {
            int i = length - 1;
            this.AudioAttributesImplBaseParcelizer = jArr2[i] + jArr3[i];
        } else {
            this.AudioAttributesImplBaseParcelizer = 0L;
        }
    }

    public final int read(long j) {
        return LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, j, true);
    }

    @Override // kotlin.isCollectionMapOrArray
    public final long read() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.isCollectionMapOrArray
    public final isCollectionMapOrArray.read write(long j) {
        int i = read(j);
        isLocalType islocaltype = new isLocalType(this.AudioAttributesCompatParcelizer[i], this.write[i]);
        if (islocaltype.IconCompatParcelizer >= j || i == this.IconCompatParcelizer - 1) {
            return new isCollectionMapOrArray.read(islocaltype);
        }
        int i2 = i + 1;
        return new isCollectionMapOrArray.read(islocaltype, new isLocalType(this.AudioAttributesCompatParcelizer[i2], this.write[i2]));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChunkIndex(length=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", sizes=");
        sb.append(Arrays.toString(this.read));
        sb.append(", offsets=");
        sb.append(Arrays.toString(this.write));
        sb.append(", timeUs=");
        sb.append(Arrays.toString(this.AudioAttributesCompatParcelizer));
        sb.append(", durationsUs=");
        sb.append(Arrays.toString(this.RemoteActionCompatParcelizer));
        sb.append(")");
        return sb.toString();
    }
}
