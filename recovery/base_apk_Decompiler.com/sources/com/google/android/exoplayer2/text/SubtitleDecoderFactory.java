package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.MimeTypes;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public interface SubtitleDecoderFactory {
    public static final SubtitleDecoderFactory DEFAULT = new SubtitleDecoderFactory() { // from class: com.google.android.exoplayer2.text.SubtitleDecoderFactory.1
        @Override // com.google.android.exoplayer2.text.SubtitleDecoderFactory
        public boolean supportsFormat(Format format) {
            String str = format.sampleMimeType;
            return MimeTypes.TEXT_VTT.equals(str) || MimeTypes.TEXT_SSA.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str) || MimeTypes.APPLICATION_PGS.equals(str) || MimeTypes.TEXT_EXOPLAYER_CUES.equals(str);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:43:0x008e  */
        @Override // com.google.android.exoplayer2.text.SubtitleDecoderFactory
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.google.android.exoplayer2.text.SubtitleDecoder createDecoder(com.google.android.exoplayer2.Format r4) {
            /*
                Method dump skipped, instruction units count: 322
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.SubtitleDecoderFactory.AnonymousClass1.createDecoder(com.google.android.exoplayer2.Format):com.google.android.exoplayer2.text.SubtitleDecoder");
        }
    };

    SubtitleDecoder createDecoder(Format format);

    boolean supportsFormat(Format format);
}
