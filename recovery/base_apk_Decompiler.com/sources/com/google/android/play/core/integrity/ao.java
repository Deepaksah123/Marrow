package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes5.dex */
final class ao extends IntegrityTokenRequest {
    private final String a;
    private final Long b;
    private final Object c = null;

    private static boolean a() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.google.android.play.core.integrity.IntegrityTokenRequest
            r2 = 0
            if (r1 == 0) goto L2f
            r1 = r6
            com.google.android.play.core.integrity.IntegrityTokenRequest r1 = (com.google.android.play.core.integrity.IntegrityTokenRequest) r1
            java.lang.String r3 = r5.a
            java.lang.String r4 = r1.nonce()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L2f
            java.lang.Long r5 = r5.b
            if (r5 != 0) goto L23
            java.lang.Long r5 = r1.cloudProjectNumber()
            if (r5 != 0) goto L2f
            goto L2d
        L23:
            java.lang.Long r1 = r1.cloudProjectNumber()
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L2f
        L2d:
            r5 = r0
            goto L30
        L2f:
            r5 = r2
        L30:
            boolean r1 = r6 instanceof com.google.android.play.core.integrity.ao
            if (r1 == 0) goto L42
            boolean r1 = a()
            if (r1 == 0) goto L42
            com.google.android.play.core.integrity.ao r6 = (com.google.android.play.core.integrity.ao) r6
            if (r5 == 0) goto L41
            java.lang.Object r5 = r6.c
            return r0
        L41:
            return r2
        L42:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.ao.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        Long l = this.b;
        int iHashCode2 = (l == null ? 0 : l.hashCode()) ^ ((iHashCode ^ 1000003) * 1000003);
        return a() ? iHashCode2 * 1000003 : iHashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntegrityTokenRequest{nonce=");
        sb.append(this.a);
        sb.append(", cloudProjectNumber=");
        sb.append(this.b);
        String string = sb.toString();
        if (a()) {
            string = string.concat(", network=null");
        }
        return string.concat("}");
    }

    /* synthetic */ ao(String str, Long l, Object obj, an anVar) {
        this.a = str;
        this.b = l;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.b;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.a;
    }
}
