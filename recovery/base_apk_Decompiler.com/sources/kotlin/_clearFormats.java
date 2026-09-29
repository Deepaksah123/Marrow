package kotlin;

import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Objects;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class _clearFormats implements withTimeZone.IconCompatParcelizer {
    @Override // o.withTimeZone.IconCompatParcelizer
    public final boolean write(C0170format c0170format) {
        String str = c0170format.onPlayFromUri;
        return Objects.equals(str, MimeTypes.TEXT_SSA) || Objects.equals(str, MimeTypes.TEXT_VTT) || Objects.equals(str, MimeTypes.APPLICATION_MP4VTT) || Objects.equals(str, MimeTypes.APPLICATION_SUBRIP) || Objects.equals(str, MimeTypes.APPLICATION_TX3G) || Objects.equals(str, MimeTypes.APPLICATION_PGS) || Objects.equals(str, MimeTypes.APPLICATION_DVBSUBS) || Objects.equals(str, MimeTypes.APPLICATION_TTML);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    @Override // o.withTimeZone.IconCompatParcelizer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int RemoteActionCompatParcelizer(kotlin.C0170format r3) {
        /*
            r2 = this;
            java.lang.String r2 = r3.onPlayFromUri
            if (r2 == 0) goto L6a
            r2.hashCode()
            int r3 = r2.hashCode()
            r0 = 2
            r1 = 1
            switch(r3) {
                case -1351681404: goto L57;
                case -1248334819: goto L4d;
                case -1026075066: goto L43;
                case -1004728940: goto L39;
                case 691401887: goto L2f;
                case 822864842: goto L25;
                case 1668750253: goto L1b;
                case 1693976202: goto L11;
                default: goto L10;
            }
        L10:
            goto L61
        L11:
            java.lang.String r3 = "application/ttml+xml"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L61
            r3 = 7
            goto L62
        L1b:
            java.lang.String r3 = "application/x-subrip"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L61
            r3 = 6
            goto L62
        L25:
            java.lang.String r3 = "text/x-ssa"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L61
            r3 = 5
            goto L62
        L2f:
            java.lang.String r3 = "application/x-quicktime-tx3g"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L61
            r3 = 4
            goto L62
        L39:
            java.lang.String r3 = "text/vtt"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L61
            r3 = 3
            goto L62
        L43:
            java.lang.String r3 = "application/x-mp4-vtt"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L61
            r3 = r0
            goto L62
        L4d:
            java.lang.String r3 = "application/pgs"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L61
            r3 = r1
            goto L62
        L57:
            java.lang.String r3 = "application/dvbsubs"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L61
            r3 = 0
            goto L62
        L61:
            r3 = -1
        L62:
            switch(r3) {
                case 0: goto L69;
                case 1: goto L69;
                case 2: goto L69;
                case 3: goto L68;
                case 4: goto L67;
                case 5: goto L66;
                case 6: goto L66;
                case 7: goto L66;
                default: goto L65;
            }
        L65:
            goto L6a
        L66:
            return r1
        L67:
            return r0
        L68:
            return r1
        L69:
            return r0
        L6a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported MIME type: "
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r0.concat(r2)
            r3.<init>(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._clearFormats.RemoteActionCompatParcelizer(o.format):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    @Override // o.withTimeZone.IconCompatParcelizer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.withTimeZone IconCompatParcelizer(kotlin.C0170format r2) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._clearFormats.IconCompatParcelizer(o.format):o.withTimeZone");
    }
}
