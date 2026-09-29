package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class drainAndReinitializeCodec extends Exception {
    private final int write;

    public drainAndReinitializeCodec(String str) {
        super(str);
        this.write = read(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int read(java.lang.String r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r6 = r6.toLowerCase(r1)
            r6.hashCode()
            int r1 = r6.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case -1743242157: goto L41;
                case -1290953729: goto L37;
                case -920906446: goto L2d;
                case -617027085: goto L23;
                case -95047692: goto L19;
                default: goto L18;
            }
        L18:
            goto L4b
        L19:
            java.lang.String r1 = "missing_to"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L4b
            r6 = r2
            goto L4c
        L23:
            java.lang.String r1 = "messagetoobig"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L4b
            r6 = r3
            goto L4c
        L2d:
            java.lang.String r1 = "invalid_parameters"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L4b
            r6 = r4
            goto L4c
        L37:
            java.lang.String r1 = "toomanymessages"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L4b
            r6 = r5
            goto L4c
        L41:
            java.lang.String r1 = "service_not_available"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L4b
            r6 = r0
            goto L4c
        L4b:
            r6 = -1
        L4c:
            if (r6 == 0) goto L5a
            if (r6 == r5) goto L59
            if (r6 == r4) goto L58
            if (r6 == r3) goto L57
            if (r6 == r2) goto L58
            return r0
        L57:
            return r4
        L58:
            return r5
        L59:
            return r2
        L5a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.drainAndReinitializeCodec.read(java.lang.String):int");
    }
}
