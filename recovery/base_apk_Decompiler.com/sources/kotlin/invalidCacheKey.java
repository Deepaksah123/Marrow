package kotlin;

import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public interface invalidCacheKey {
    public static final invalidCacheKey RemoteActionCompatParcelizer = new invalidCacheKey() { // from class: o.invalidCacheKey.5
        private final _clearFormats IconCompatParcelizer = new _clearFormats();

        @Override // kotlin.invalidCacheKey
        public final boolean IconCompatParcelizer(C0170format c0170format) {
            String str = c0170format.onPlayFromUri;
            return this.IconCompatParcelizer.write(c0170format) || Objects.equals(str, MimeTypes.APPLICATION_CEA608) || Objects.equals(str, MimeTypes.APPLICATION_MP4CEA608) || Objects.equals(str, MimeTypes.APPLICATION_CEA708);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x003e A[ADDED_TO_REGION] */
        @Override // kotlin.invalidCacheKey
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final kotlin.parseAsISO8601 write(kotlin.C0170format r6) {
            /*
                r5 = this;
                java.lang.String r0 = r6.onPlayFromUri
                if (r0 == 0) goto L55
                r0.hashCode()
                int r1 = r0.hashCode()
                r2 = 930165504(0x37713300, float:1.4376594E-5)
                r3 = 2
                r4 = 1
                if (r1 == r2) goto L31
                r2 = 1566015601(0x5d578071, float:9.705335E17)
                if (r1 == r2) goto L27
                r2 = 1566016562(0x5d578432, float:9.705995E17)
                if (r1 == r2) goto L1d
                goto L3b
            L1d:
                java.lang.String r1 = "application/cea-708"
                boolean r1 = r0.equals(r1)
                if (r1 == 0) goto L3b
                r1 = r3
                goto L3c
            L27:
                java.lang.String r1 = "application/cea-608"
                boolean r1 = r0.equals(r1)
                if (r1 == 0) goto L3b
                r1 = r4
                goto L3c
            L31:
                java.lang.String r1 = "application/x-mp4-cea-608"
                boolean r1 = r0.equals(r1)
                if (r1 == 0) goto L3b
                r1 = 0
                goto L3c
            L3b:
                r1 = -1
            L3c:
                if (r1 == 0) goto L4d
                if (r1 == r4) goto L4d
                if (r1 == r3) goto L43
                goto L55
            L43:
                o.writeLazyDecimal r5 = new o.writeLazyDecimal
                int r0 = r6.write
                java.util.List<byte[]> r6 = r6.onAddQueueItem
                r5.<init>(r0, r6)
                return r5
            L4d:
                o._checkNativeIds r5 = new o._checkNativeIds
                int r6 = r6.write
                r5.<init>(r0, r6)
                return r5
            L55:
                o._clearFormats r1 = r5.IconCompatParcelizer
                boolean r1 = r1.write(r6)
                if (r1 == 0) goto L82
                o._clearFormats r5 = r5.IconCompatParcelizer
                o.withTimeZone r5 = r5.IconCompatParcelizer(r6)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                o.setReference r0 = new o.setReference
                java.lang.Class r1 = r5.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r6.append(r1)
                java.lang.String r1 = "Decoder"
                r6.append(r1)
                java.lang.String r6 = r6.toString()
                r0.<init>(r6, r5)
                return r0
            L82:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r6 = "Attempted to create decoder for unsupported MIME type: "
                java.lang.String r0 = java.lang.String.valueOf(r0)
                java.lang.String r6 = r6.concat(r0)
                r5.<init>(r6)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.invalidCacheKey.AnonymousClass5.write(o.format):o.parseAsISO8601");
        }
    };

    boolean IconCompatParcelizer(C0170format c0170format);

    parseAsISO8601 write(C0170format c0170format);
}
