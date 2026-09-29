package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class _checkIntToFloatCoercion {
    private static final Object RemoteActionCompatParcelizer = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056 A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #5 {, blocks: (B:5:0x0005, B:27:0x004f, B:30:0x0056, B:26:0x004c, B:23:0x0046, B:24:0x0049, B:6:0x000b, B:7:0x0018, B:11:0x0022, B:16:0x002d, B:18:0x0039), top: B:43:0x0005, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004c A[EXC_TOP_SPLITTER, PHI: r1
      0x004c: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:25:0x004a, B:19:0x0040] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String IconCompatParcelizer(android.content.Context r8) {
        /*
            java.lang.Object r0 = kotlin._checkIntToFloatCoercion.RemoteActionCompatParcelizer
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch: java.lang.Throwable -> L5d java.io.FileNotFoundException -> L60
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L43 java.lang.Throwable -> L4a
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L43 java.lang.Throwable -> L4a
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L43 java.lang.Throwable -> L4a
        L18:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L43 java.lang.Throwable -> L4a
            r6 = 1
            if (r5 == r6) goto L40
            r6 = 3
            if (r5 != r6) goto L28
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L43 java.lang.Throwable -> L4a
            if (r7 <= r4) goto L40
        L28:
            if (r5 == r6) goto L18
            r6 = 4
            if (r5 == r6) goto L18
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L43 java.lang.Throwable -> L4a
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L43 java.lang.Throwable -> L4a
            if (r5 == 0) goto L18
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L43 java.lang.Throwable -> L4a
        L40:
            if (r2 == 0) goto L4f
            goto L4c
        L43:
            r8 = move-exception
            if (r2 == 0) goto L49
            r2.close()     // Catch: java.io.IOException -> L49 java.lang.Throwable -> L5d
        L49:
            throw r8     // Catch: java.lang.Throwable -> L5d
        L4a:
            if (r2 == 0) goto L4f
        L4c:
            r2.close()     // Catch: java.io.IOException -> L4f java.lang.Throwable -> L5d
        L4f:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L5d
            if (r2 != 0) goto L56
            goto L5b
        L56:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch: java.lang.Throwable -> L5d
        L5b:
            monitor-exit(r0)
            return r1
        L5d:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        L60:
            monitor-exit(r0)
            java.lang.String r8 = ""
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._checkIntToFloatCoercion.IconCompatParcelizer(android.content.Context):java.lang.String");
    }
}
