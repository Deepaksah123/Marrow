package kotlin;

import kotlin.isCollectionMapOrArray;

/* JADX INFO: loaded from: classes2.dex */
final class LinkedDeque2 implements isCollectionMapOrArray {
    private final long AudioAttributesCompatParcelizer;
    private final int IconCompatParcelizer;
    private final unlinkLast RemoteActionCompatParcelizer;
    private final long read;
    private final long write;

    @Override // kotlin.isCollectionMapOrArray
    public final boolean IconCompatParcelizer() {
        return true;
    }

    public LinkedDeque2(unlinkLast unlinklast, int i, long j, long j2) {
        this.RemoteActionCompatParcelizer = unlinklast;
        this.IconCompatParcelizer = i;
        this.write = j;
        long j3 = (j2 - j) / ((long) unlinklast.RemoteActionCompatParcelizer);
        this.read = j3;
        this.AudioAttributesCompatParcelizer = IconCompatParcelizer(j3);
    }

    @Override // kotlin.isCollectionMapOrArray
    public final long read() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.isCollectionMapOrArray
    public final isCollectionMapOrArray.read write(long j) {
        long j2 = LaissezFaireSubTypeValidator.read((((long) this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver) * j) / (((long) this.IconCompatParcelizer) * 1000000), 0L, this.read - 1);
        long j3 = this.write;
        long j4 = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        long jIconCompatParcelizer = IconCompatParcelizer(j2);
        isLocalType islocaltype = new isLocalType(jIconCompatParcelizer, j3 + (j4 * j2));
        if (jIconCompatParcelizer >= j || j2 == this.read - 1) {
            return new isCollectionMapOrArray.read(islocaltype);
        }
        long j5 = j2 + 1;
        return new isCollectionMapOrArray.read(islocaltype, new isLocalType(IconCompatParcelizer(j5), this.write + (((long) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer) * j5)));
    }

    private long IconCompatParcelizer(long j) {
        return LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(j * ((long) this.IconCompatParcelizer), 1000000L, this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver);
    }
}
