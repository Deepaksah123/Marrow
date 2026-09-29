package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class createKeySerializer {
    public static final createKeySerializer write;
    public final long AudioAttributesCompatParcelizer;
    public final long read;

    static {
        createKeySerializer createkeyserializer = new createKeySerializer(0L, 0L);
        new createKeySerializer(Long.MAX_VALUE, Long.MAX_VALUE);
        new createKeySerializer(Long.MAX_VALUE, 0L);
        new createKeySerializer(0L, Long.MAX_VALUE);
        write = createkeyserializer;
    }

    public createKeySerializer(long j, long j2) {
        buildTypeSerializer.IconCompatParcelizer(j >= 0);
        buildTypeSerializer.IconCompatParcelizer(j2 >= 0);
        this.read = j;
        this.AudioAttributesCompatParcelizer = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long write(long r8, long r10, long r12) {
        /*
            r7 = this;
            long r0 = r7.read
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lf
            long r4 = r7.AudioAttributesCompatParcelizer
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto Lf
            return r8
        Lf:
            long r0 = kotlin.LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(r8, r0)
            long r2 = r7.AudioAttributesCompatParcelizer
            long r2 = kotlin.LaissezFaireSubTypeValidator.IconCompatParcelizer(r8, r2)
            int r7 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            r4 = 0
            r5 = 1
            if (r7 > 0) goto L25
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 > 0) goto L25
            r7 = r5
            goto L26
        L25:
            r7 = r4
        L26:
            int r6 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r6 > 0) goto L30
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 <= 0) goto L2f
            goto L30
        L2f:
            r4 = r5
        L30:
            if (r7 == 0) goto L45
            if (r4 == 0) goto L45
            long r0 = r10 - r8
            long r0 = java.lang.Math.abs(r0)
            long r7 = r12 - r8
            long r7 = java.lang.Math.abs(r7)
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 > 0) goto L4a
            goto L47
        L45:
            if (r7 == 0) goto L48
        L47:
            return r10
        L48:
            if (r4 == 0) goto L4b
        L4a:
            return r12
        L4b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createKeySerializer.write(long, long, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        createKeySerializer createkeyserializer = (createKeySerializer) obj;
        return this.read == createkeyserializer.read && this.AudioAttributesCompatParcelizer == createkeyserializer.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (((int) this.read) * 31) + ((int) this.AudioAttributesCompatParcelizer);
    }
}
