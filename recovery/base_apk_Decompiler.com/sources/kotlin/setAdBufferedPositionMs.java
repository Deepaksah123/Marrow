package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public enum setAdBufferedPositionMs {
    SimpleMessage("simple"),
    IconMessage("message-icon"),
    CarouselMessage("carousel"),
    CarouselImageMessage("carousel-image");

    private final String AudioAttributesImplBaseParcelizer;

    setAdBufferedPositionMs(String str) {
        this.AudioAttributesImplBaseParcelizer = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static kotlin.setAdBufferedPositionMs read(java.lang.String r4) {
        /*
            r4.hashCode()
            int r0 = r4.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -1799711058: goto L2c;
                case -1332589953: goto L22;
                case -902286926: goto L18;
                case 2908512: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L36
        Le:
            java.lang.String r0 = "carousel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L36
            r4 = r1
            goto L37
        L18:
            java.lang.String r0 = "simple"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L36
            r4 = r2
            goto L37
        L22:
            java.lang.String r0 = "message-icon"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L36
            r4 = r3
            goto L37
        L2c:
            java.lang.String r0 = "carousel-image"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L36
            r4 = 0
            goto L37
        L36:
            r4 = -1
        L37:
            if (r4 == 0) goto L4a
            if (r4 == r3) goto L47
            if (r4 == r2) goto L44
            if (r4 == r1) goto L41
            r4 = 0
            return r4
        L41:
            o.setAdBufferedPositionMs r4 = kotlin.setAdBufferedPositionMs.CarouselMessage
            return r4
        L44:
            o.setAdBufferedPositionMs r4 = kotlin.setAdBufferedPositionMs.SimpleMessage
            return r4
        L47:
            o.setAdBufferedPositionMs r4 = kotlin.setAdBufferedPositionMs.IconMessage
            return r4
        L4a:
            o.setAdBufferedPositionMs r4 = kotlin.setAdBufferedPositionMs.CarouselImageMessage
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setAdBufferedPositionMs.read(java.lang.String):o.setAdBufferedPositionMs");
    }
}
