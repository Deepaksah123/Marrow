package kotlin;

import kotlin.isCollectionMapOrArray;

/* JADX INFO: loaded from: classes2.dex */
public final class getClassMethods implements isCollectionMapOrArray {
    private final long IconCompatParcelizer;
    private final getGenericSuperclass read;

    @Override // kotlin.isCollectionMapOrArray
    public final boolean IconCompatParcelizer() {
        return true;
    }

    public getClassMethods(getGenericSuperclass getgenericsuperclass, long j) {
        this.read = getgenericsuperclass;
        this.IconCompatParcelizer = j;
    }

    @Override // kotlin.isCollectionMapOrArray
    public final long read() {
        return this.read.write();
    }

    @Override // kotlin.isCollectionMapOrArray
    public final isCollectionMapOrArray.read write(long j) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.read.MediaBrowserCompatItemReceiver);
        long[] jArr = this.read.MediaBrowserCompatItemReceiver.write;
        long[] jArr2 = this.read.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer;
        int iRemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(jArr, this.read.AudioAttributesCompatParcelizer(j), false);
        isLocalType islocaltypeAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer == -1 ? 0L : jArr[iRemoteActionCompatParcelizer], iRemoteActionCompatParcelizer != -1 ? jArr2[iRemoteActionCompatParcelizer] : 0L);
        if (islocaltypeAudioAttributesCompatParcelizer.IconCompatParcelizer == j || iRemoteActionCompatParcelizer == jArr.length - 1) {
            return new isCollectionMapOrArray.read(islocaltypeAudioAttributesCompatParcelizer);
        }
        int i = iRemoteActionCompatParcelizer + 1;
        return new isCollectionMapOrArray.read(islocaltypeAudioAttributesCompatParcelizer, AudioAttributesCompatParcelizer(jArr[i], jArr2[i]));
    }

    private isLocalType AudioAttributesCompatParcelizer(long j, long j2) {
        return new isLocalType((j * 1000000) / ((long) this.read.MediaBrowserCompatCustomActionResultReceiver), this.IconCompatParcelizer + j2);
    }
}
