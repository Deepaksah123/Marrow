package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0016\u0010\u001a"}, d2 = {"Lo/getBytePosition;", "", "", "p0", "", "p1", "p2", "Lo/CacheFileMetadataIndex;", "p3", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Lo/CacheFileMetadataIndex;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "read", "Ljava/lang/String;", "write", "Z", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "Lo/CacheFileMetadataIndex;", "()Lo/CacheFileMetadataIndex;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getBytePosition {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final CacheFileMetadataIndex IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final boolean AudioAttributesCompatParcelizer;

    public getBytePosition(String str, boolean z, String str2, CacheFileMetadataIndex cacheFileMetadataIndex) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(cacheFileMetadataIndex, "");
        this.write = str;
        this.AudioAttributesCompatParcelizer = z;
        this.read = str2;
        this.IconCompatParcelizer = cacheFileMetadataIndex;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ getBytePosition(java.lang.String r18, boolean r19, java.lang.String r20, kotlin.CacheFileMetadataIndex r21, int r22, kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0 r23) {
        /*
            r17 = this;
            r0 = r22 & 1
            java.lang.String r1 = ""
            if (r0 == 0) goto L8
            r0 = r1
            goto La
        L8:
            r0 = r18
        La:
            r2 = r22 & 2
            if (r2 == 0) goto L10
            r2 = 0
            goto L12
        L10:
            r2 = r19
        L12:
            r3 = r22 & 4
            if (r3 == 0) goto L17
            goto L19
        L17:
            r1 = r20
        L19:
            r3 = r22 & 8
            if (r3 == 0) goto L34
            o.CacheFileMetadataIndex r3 = new o.CacheFileMetadataIndex
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 1023(0x3ff, float:1.434E-42)
            r16 = 0
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4 = r17
            goto L38
        L34:
            r4 = r17
            r3 = r21
        L38:
            r4.<init>(r0, r2, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getBytePosition.<init>(java.lang.String, boolean, java.lang.String, o.CacheFileMetadataIndex, int, o.MagicModuleRepositoryImplExternalSyntheticLambda0):void");
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final CacheFileMetadataIndex getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public getBytePosition() {
        this(null, false, null, null, 15, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getBytePosition)) {
            return false;
        }
        getBytePosition getbyteposition = (getBytePosition) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) getbyteposition.write) && this.AudioAttributesCompatParcelizer == getbyteposition.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) getbyteposition.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, getbyteposition.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (((((this.write.hashCode() * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + this.read.hashCode()) * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.write;
        boolean z = this.AudioAttributesCompatParcelizer;
        String str2 = this.read;
        CacheFileMetadataIndex cacheFileMetadataIndex = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("getBytePosition(write=");
        sb.append(str);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(z);
        sb.append(", read=");
        sb.append(str2);
        sb.append(", IconCompatParcelizer=");
        sb.append(cacheFileMetadataIndex);
        sb.append(")");
        return sb.toString();
    }
}
