package kotlin;

import com.google.android.exoplayer2.util.MimeTypes;

/* JADX INFO: loaded from: classes2.dex */
public interface NumberSerializer1 {
    public static final NumberSerializer1 AudioAttributesCompatParcelizer = new NumberSerializer1() { // from class: o.NumberSerializer1.1
        @Override // kotlin.NumberSerializer1
        public final boolean IconCompatParcelizer(C0170format c0170format) {
            String str = c0170format.onPlayFromUri;
            return MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str) || MimeTypes.APPLICATION_ICY.equals(str) || MimeTypes.APPLICATION_AIT.equals(str);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
        @Override // kotlin.NumberSerializer1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final kotlin._enumConstants read(kotlin.C0170format r5) {
            /*
                r4 = this;
                java.lang.String r4 = r5.onPlayFromUri
                if (r4 == 0) goto L6e
                r4.hashCode()
                int r5 = r4.hashCode()
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                switch(r5) {
                    case -1354451219: goto L3b;
                    case -1348231605: goto L31;
                    case -1248341703: goto L27;
                    case 1154383568: goto L1d;
                    case 1652648887: goto L13;
                    default: goto L12;
                }
            L12:
                goto L45
            L13:
                java.lang.String r5 = "application/x-scte35"
                boolean r5 = r4.equals(r5)
                if (r5 == 0) goto L45
                r5 = r0
                goto L46
            L1d:
                java.lang.String r5 = "application/x-emsg"
                boolean r5 = r4.equals(r5)
                if (r5 == 0) goto L45
                r5 = r1
                goto L46
            L27:
                java.lang.String r5 = "application/id3"
                boolean r5 = r4.equals(r5)
                if (r5 == 0) goto L45
                r5 = r2
                goto L46
            L31:
                java.lang.String r5 = "application/x-icy"
                boolean r5 = r4.equals(r5)
                if (r5 == 0) goto L45
                r5 = r3
                goto L46
            L3b:
                java.lang.String r5 = "application/vnd.dvb.ait"
                boolean r5 = r4.equals(r5)
                if (r5 == 0) goto L45
                r5 = 0
                goto L46
            L45:
                r5 = -1
            L46:
                if (r5 == 0) goto L68
                if (r5 == r3) goto L62
                if (r5 == r2) goto L5c
                if (r5 == r1) goto L56
                if (r5 != r0) goto L6e
                o.findEnum r4 = new o.findEnum
                r4.<init>()
                return r4
            L56:
                o.constructLookup r4 = new o.constructLookup
                r4.<init>()
                return r4
            L5c:
                o.constructUsingIndex r4 = new o.constructUsingIndex
                r4.<init>()
                return r4
            L62:
                o.constructUsingMethod r4 = new o.constructUsingMethod
                r4.<init>()
                return r4
            L68:
                o.constructUsingToString r4 = new o.constructUsingToString
                r4.<init>()
                return r4
            L6e:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Attempted to create decoder for unsupported MIME type: "
                java.lang.String r4 = java.lang.String.valueOf(r4)
                java.lang.String r4 = r0.concat(r4)
                r5.<init>(r4)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.NumberSerializer1.AnonymousClass1.read(o.format):o._enumConstants");
        }
    };

    boolean IconCompatParcelizer(C0170format c0170format);

    _enumConstants read(C0170format c0170format);
}
