package com.google.android.exoplayer2.metadata;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.MimeTypes;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public interface MetadataDecoderFactory {
    public static final MetadataDecoderFactory DEFAULT = new MetadataDecoderFactory() { // from class: com.google.android.exoplayer2.metadata.MetadataDecoderFactory.1
        @Override // com.google.android.exoplayer2.metadata.MetadataDecoderFactory
        public boolean supportsFormat(Format format) {
            String str = format.sampleMimeType;
            return MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str) || MimeTypes.APPLICATION_ICY.equals(str) || MimeTypes.APPLICATION_AIT.equals(str);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
        @Override // com.google.android.exoplayer2.metadata.MetadataDecoderFactory
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.google.android.exoplayer2.metadata.MetadataDecoder createDecoder(com.google.android.exoplayer2.Format r5) {
            /*
                r4 = this;
                java.lang.String r4 = r5.sampleMimeType
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
                com.google.android.exoplayer2.metadata.scte35.SpliceInfoDecoder r4 = new com.google.android.exoplayer2.metadata.scte35.SpliceInfoDecoder
                r4.<init>()
                return r4
            L56:
                com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder r4 = new com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder
                r4.<init>()
                return r4
            L5c:
                com.google.android.exoplayer2.metadata.id3.Id3Decoder r4 = new com.google.android.exoplayer2.metadata.id3.Id3Decoder
                r4.<init>()
                return r4
            L62:
                com.google.android.exoplayer2.metadata.icy.IcyDecoder r4 = new com.google.android.exoplayer2.metadata.icy.IcyDecoder
                r4.<init>()
                return r4
            L68:
                com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder r4 = new com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.MetadataDecoderFactory.AnonymousClass1.createDecoder(com.google.android.exoplayer2.Format):com.google.android.exoplayer2.metadata.MetadataDecoder");
        }
    };

    MetadataDecoder createDecoder(Format format);

    boolean supportsFormat(Format format);
}
