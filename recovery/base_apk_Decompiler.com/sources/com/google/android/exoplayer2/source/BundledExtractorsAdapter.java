package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class BundledExtractorsAdapter implements ProgressiveMediaExtractor {
    private Extractor extractor;
    private ExtractorInput extractorInput;
    private final ExtractorsFactory extractorsFactory;

    public BundledExtractorsAdapter(ExtractorsFactory extractorsFactory) {
        this.extractorsFactory = extractorsFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void init(com.google.android.exoplayer2.upstream.DataReader r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, com.google.android.exoplayer2.extractor.ExtractorOutput r15) throws java.io.IOException {
        /*
            r7 = this;
            com.google.android.exoplayer2.extractor.DefaultExtractorInput r6 = new com.google.android.exoplayer2.extractor.DefaultExtractorInput
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.extractorInput = r6
            com.google.android.exoplayer2.extractor.Extractor r8 = r7.extractor
            if (r8 == 0) goto L10
            return
        L10:
            com.google.android.exoplayer2.extractor.ExtractorsFactory r8 = r7.extractorsFactory
            com.google.android.exoplayer2.extractor.Extractor[] r8 = r8.createExtractors(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L20
            r8 = r8[r13]
            r7.extractor = r8
            goto L7e
        L20:
            int r10 = r8.length
            r0 = r13
        L22:
            if (r0 >= r10) goto L7a
            r1 = r8[r0]
            boolean r2 = r1.sniff(r6)     // Catch: java.lang.Throwable -> L4d java.io.EOFException -> L62
            if (r2 == 0) goto L40
            r7.extractor = r1     // Catch: java.lang.Throwable -> L4d java.io.EOFException -> L62
            if (r1 != 0) goto L38
            long r0 = r6.getPosition()
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 != 0) goto L39
        L38:
            r13 = r14
        L39:
            com.google.android.exoplayer2.util.Assertions.checkState(r13)
            r6.resetPeekPosition()
            goto L7a
        L40:
            com.google.android.exoplayer2.extractor.Extractor r1 = r7.extractor
            if (r1 != 0) goto L70
            long r1 = r6.getPosition()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L6e
            goto L70
        L4d:
            r8 = move-exception
            com.google.android.exoplayer2.extractor.Extractor r7 = r7.extractor
            if (r7 != 0) goto L5a
            long r9 = r6.getPosition()
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 != 0) goto L5b
        L5a:
            r13 = r14
        L5b:
            com.google.android.exoplayer2.util.Assertions.checkState(r13)
            r6.resetPeekPosition()
            throw r8
        L62:
            com.google.android.exoplayer2.extractor.Extractor r1 = r7.extractor
            if (r1 != 0) goto L70
            long r1 = r6.getPosition()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 == 0) goto L70
        L6e:
            r1 = r13
            goto L71
        L70:
            r1 = r14
        L71:
            com.google.android.exoplayer2.util.Assertions.checkState(r1)
            r6.resetPeekPosition()
            int r0 = r0 + 1
            goto L22
        L7a:
            com.google.android.exoplayer2.extractor.Extractor r10 = r7.extractor
            if (r10 == 0) goto L84
        L7e:
            com.google.android.exoplayer2.extractor.Extractor r7 = r7.extractor
            r7.init(r15)
            return
        L84:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r10 = "None of the available extractors ("
            r7.<init>(r10)
            java.lang.String r8 = com.google.android.exoplayer2.util.Util.getCommaDelimitedSimpleClassNames(r8)
            r7.append(r8)
            java.lang.String r8 = ") could read the stream."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.google.android.exoplayer2.source.UnrecognizedInputFormatException r8 = new com.google.android.exoplayer2.source.UnrecognizedInputFormatException
            java.lang.Object r9 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            r8.<init>(r7, r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.BundledExtractorsAdapter.init(com.google.android.exoplayer2.upstream.DataReader, android.net.Uri, java.util.Map, long, long, com.google.android.exoplayer2.extractor.ExtractorOutput):void");
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public final void release() {
        Extractor extractor = this.extractor;
        if (extractor != null) {
            extractor.release();
            this.extractor = null;
        }
        this.extractorInput = null;
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public final void disableSeekingOnMp3Streams() {
        Extractor extractor = this.extractor;
        if (extractor instanceof Mp3Extractor) {
            ((Mp3Extractor) extractor).disableSeeking();
        }
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public final long getCurrentInputPosition() {
        ExtractorInput extractorInput = this.extractorInput;
        if (extractorInput != null) {
            return extractorInput.getPosition();
        }
        return -1L;
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public final void seek(long j, long j2) {
        ((Extractor) Assertions.checkNotNull(this.extractor)).seek(j, j2);
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public final int read(PositionHolder positionHolder) throws IOException {
        return ((Extractor) Assertions.checkNotNull(this.extractor)).read((ExtractorInput) Assertions.checkNotNull(this.extractorInput), positionHolder);
    }
}
