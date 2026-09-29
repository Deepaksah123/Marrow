package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public enum lambdasetPlaybackParameters11 {
    SIMPLE("simple"),
    SIMPLE_WITH_IMAGE("simple-image"),
    CAROUSEL("carousel"),
    CAROUSEL_WITH_IMAGE("carousel-image"),
    MESSAGE_WITH_ICON("message-icon"),
    CUSTOM_KEY_VALUE("custom-key-value");

    private String MediaBrowserCompatItemReceiver;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static kotlin.lambdasetPlaybackParameters11 RemoteActionCompatParcelizer(java.lang.String r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L72
            r6.hashCode()
            int r0 = r6.hashCode()
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -1799711058: goto L48;
                case -1332589953: goto L3e;
                case -902286926: goto L34;
                case -876980953: goto L2a;
                case 2908512: goto L20;
                case 1818845568: goto L16;
                default: goto L15;
            }
        L15:
            goto L52
        L16:
            java.lang.String r0 = "simple-image"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L52
            r6 = r1
            goto L53
        L20:
            java.lang.String r0 = "carousel"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L52
            r6 = r2
            goto L53
        L2a:
            java.lang.String r0 = "custom-key-value"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L52
            r6 = r3
            goto L53
        L34:
            java.lang.String r0 = "simple"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L52
            r6 = r4
            goto L53
        L3e:
            java.lang.String r0 = "message-icon"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L52
            r6 = r5
            goto L53
        L48:
            java.lang.String r0 = "carousel-image"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L52
            r6 = 0
            goto L53
        L52:
            r6 = -1
        L53:
            if (r6 == 0) goto L6f
            if (r6 == r5) goto L6c
            if (r6 == r4) goto L69
            if (r6 == r3) goto L66
            if (r6 == r2) goto L63
            if (r6 == r1) goto L60
            goto L72
        L60:
            o.lambdasetPlaybackParameters11 r6 = kotlin.lambdasetPlaybackParameters11.SIMPLE_WITH_IMAGE
            return r6
        L63:
            o.lambdasetPlaybackParameters11 r6 = kotlin.lambdasetPlaybackParameters11.CAROUSEL
            return r6
        L66:
            o.lambdasetPlaybackParameters11 r6 = kotlin.lambdasetPlaybackParameters11.CUSTOM_KEY_VALUE
            return r6
        L69:
            o.lambdasetPlaybackParameters11 r6 = kotlin.lambdasetPlaybackParameters11.SIMPLE
            return r6
        L6c:
            o.lambdasetPlaybackParameters11 r6 = kotlin.lambdasetPlaybackParameters11.MESSAGE_WITH_ICON
            return r6
        L6f:
            o.lambdasetPlaybackParameters11 r6 = kotlin.lambdasetPlaybackParameters11.CAROUSEL_WITH_IMAGE
            return r6
        L72:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.lambdasetPlaybackParameters11.RemoteActionCompatParcelizer(java.lang.String):o.lambdasetPlaybackParameters11");
    }

    lambdasetPlaybackParameters11(String str) {
        this.MediaBrowserCompatItemReceiver = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.MediaBrowserCompatItemReceiver;
    }
}
