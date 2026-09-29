package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class Id3DecoderId3Header {
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072 A[Catch: IOException | XmlPullParserException -> 0x007b, TryCatch #0 {IOException | XmlPullParserException -> 0x007b, blocks: (B:3:0x0005, B:6:0x000c, B:11:0x0021, B:40:0x0076, B:14:0x0029, B:18:0x0039, B:24:0x0045, B:28:0x0053, B:38:0x006d, B:39:0x0072, B:31:0x005d), top: B:44:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map<java.lang.String, java.lang.String> RemoteActionCompatParcelizer(android.content.Context r7, int r8) {
        /*
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            android.content.res.Resources r7 = r7.getResources()     // Catch: java.lang.Throwable -> L7b
            if (r7 != 0) goto Lc
            return r8
        Lc:
            r0 = 2132148227(0x7f160003, float:1.9938426E38)
            android.content.res.XmlResourceParser r7 = r7.getXml(r0)     // Catch: java.lang.Throwable -> L7b
            int r0 = r7.getEventType()     // Catch: java.lang.Throwable -> L7b
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = r3
        L1b:
            r5 = 1
            if (r0 == r5) goto L7b
            r6 = 2
            if (r0 != r6) goto L26
            java.lang.String r2 = r7.getName()     // Catch: java.lang.Throwable -> L7b
            goto L76
        L26:
            r6 = 3
            if (r0 != r6) goto L40
            java.lang.String r0 = r7.getName()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = "entry"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L3e
            if (r3 == 0) goto L3c
            if (r4 == 0) goto L3c
            r8.put(r3, r4)     // Catch: java.lang.Throwable -> L7b
        L3c:
            r3 = r1
            r4 = r3
        L3e:
            r2 = r1
            goto L76
        L40:
            r6 = 4
            if (r0 != r6) goto L76
            if (r2 == 0) goto L76
            int r0 = r2.hashCode()     // Catch: java.lang.Throwable -> L7b
            r6 = 106079(0x19e5f, float:1.48648E-40)
            if (r0 == r6) goto L5d
            r6 = 111972721(0x6ac9171, float:6.4912916E-35)
            if (r0 != r6) goto L67
            java.lang.String r0 = "value"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L67
            r0 = r5
            goto L68
        L5d:
            java.lang.String r0 = "key"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L67
            r0 = 0
            goto L68
        L67:
            r0 = -1
        L68:
            if (r0 == 0) goto L72
            if (r0 == r5) goto L6d
            goto L76
        L6d:
            java.lang.String r4 = r7.getText()     // Catch: java.lang.Throwable -> L7b
            goto L76
        L72:
            java.lang.String r3 = r7.getText()     // Catch: java.lang.Throwable -> L7b
        L76:
            int r0 = r7.next()     // Catch: java.lang.Throwable -> L7b
            goto L1b
        L7b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Id3DecoderId3Header.RemoteActionCompatParcelizer(android.content.Context, int):java.util.Map");
    }
}
