package com.google.android.exoplayer2.extractor.wav;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class WavExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.google.android.exoplayer2.extractor.wav.WavExtractor$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return WavExtractor.lambda$static$0();
        }
    };
    private static final int STATE_READING_FILE_TYPE = 0;
    private static final int STATE_READING_FORMAT = 2;
    private static final int STATE_READING_RF64_SAMPLE_DATA_SIZE = 1;
    private static final int STATE_READING_SAMPLE_DATA = 4;
    private static final int STATE_SKIPPING_TO_SAMPLE_DATA = 3;
    private static final String TAG = "WavExtractor";
    private static final int TARGET_SAMPLES_PER_SECOND = 10;
    private ExtractorOutput extractorOutput;
    private OutputWriter outputWriter;
    private TrackOutput trackOutput;
    private int state = 0;
    private long rf64SampleDataSize = -1;
    private int dataStartPosition = -1;
    private long dataEndPosition = -1;

    interface OutputWriter {
        void init(int i, long j) throws ParserException;

        void reset(long j);

        boolean sampleData(ExtractorInput extractorInput, long j) throws IOException;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }

    static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new WavExtractor()};
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) throws IOException {
        return WavHeaderReader.checkFileType(extractorInput);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        this.trackOutput = extractorOutput.track(0, 1);
        extractorOutput.endTracks();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void seek(long j, long j2) {
        this.state = j == 0 ? 0 : 4;
        OutputWriter outputWriter = this.outputWriter;
        if (outputWriter != null) {
            outputWriter.reset(j2);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        assertInitialized();
        int i = this.state;
        if (i == 0) {
            readFileType(extractorInput);
            return 0;
        }
        if (i == 1) {
            readRf64SampleDataSize(extractorInput);
            return 0;
        }
        if (i == 2) {
            readFormat(extractorInput);
            return 0;
        }
        if (i == 3) {
            skipToSampleData(extractorInput);
            return 0;
        }
        if (i == 4) {
            return readSampleData(extractorInput);
        }
        throw new IllegalStateException();
    }

    private void assertInitialized() {
        Assertions.checkStateNotNull(this.trackOutput);
        Util.castNonNull(this.extractorOutput);
    }

    private void readFileType(ExtractorInput extractorInput) throws IOException {
        Assertions.checkState(extractorInput.getPosition() == 0);
        int i = this.dataStartPosition;
        if (i != -1) {
            extractorInput.skipFully(i);
            this.state = 4;
        } else {
            if (!WavHeaderReader.checkFileType(extractorInput)) {
                throw ParserException.createForMalformedContainer("Unsupported or unrecognized wav file type.", null);
            }
            extractorInput.skipFully((int) (extractorInput.getPeekPosition() - extractorInput.getPosition()));
            this.state = 1;
        }
    }

    private void readRf64SampleDataSize(ExtractorInput extractorInput) throws IOException {
        this.rf64SampleDataSize = WavHeaderReader.readRf64SampleDataSize(extractorInput);
        this.state = 2;
    }

    private void readFormat(ExtractorInput extractorInput) throws IOException {
        WavFormat format = WavHeaderReader.readFormat(extractorInput);
        if (format.formatType == 17) {
            this.outputWriter = new ImaAdPcmOutputWriter(this.extractorOutput, this.trackOutput, format);
        } else if (format.formatType == 6) {
            this.outputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, format, MimeTypes.AUDIO_ALAW, -1);
        } else if (format.formatType == 7) {
            this.outputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, format, MimeTypes.AUDIO_MLAW, -1);
        } else {
            int pcmEncodingForType = WavUtil.getPcmEncodingForType(format.formatType, format.bitsPerSample);
            if (pcmEncodingForType == 0) {
                StringBuilder sb = new StringBuilder("Unsupported WAV format type: ");
                sb.append(format.formatType);
                throw ParserException.createForUnsupportedContainerFeature(sb.toString());
            }
            this.outputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, format, MimeTypes.AUDIO_RAW, pcmEncodingForType);
        }
        this.state = 3;
    }

    private void skipToSampleData(ExtractorInput extractorInput) throws IOException {
        Pair<Long, Long> pairSkipToSampleData = WavHeaderReader.skipToSampleData(extractorInput);
        this.dataStartPosition = ((Long) pairSkipToSampleData.first).intValue();
        long jLongValue = ((Long) pairSkipToSampleData.second).longValue();
        long j = this.rf64SampleDataSize;
        if (j != -1) {
            long j2 = -1;
            if (jLongValue == ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) {
                jLongValue = j;
            }
        }
        this.dataEndPosition = ((long) this.dataStartPosition) + jLongValue;
        long length = extractorInput.getLength();
        if (length != -1 && this.dataEndPosition > length) {
            StringBuilder sb = new StringBuilder("Data exceeds input length: ");
            sb.append(this.dataEndPosition);
            sb.append(", ");
            sb.append(length);
            Log.w(TAG, sb.toString());
            this.dataEndPosition = length;
        }
        ((OutputWriter) Assertions.checkNotNull(this.outputWriter)).init(this.dataStartPosition, this.dataEndPosition);
        this.state = 4;
    }

    private int readSampleData(ExtractorInput extractorInput) throws IOException {
        Assertions.checkState(this.dataEndPosition != -1);
        return ((OutputWriter) Assertions.checkNotNull(this.outputWriter)).sampleData(extractorInput, this.dataEndPosition - extractorInput.getPosition()) ? -1 : 0;
    }

    static final class PassthroughOutputWriter implements OutputWriter {
        private final ExtractorOutput extractorOutput;
        private final Format format;
        private long outputFrameCount;
        private int pendingOutputBytes;
        private long startTimeUs;
        private final int targetSampleSizeBytes;
        private final TrackOutput trackOutput;
        private final WavFormat wavFormat;

        public PassthroughOutputWriter(ExtractorOutput extractorOutput, TrackOutput trackOutput, WavFormat wavFormat, String str, int i) throws ParserException {
            this.extractorOutput = extractorOutput;
            this.trackOutput = trackOutput;
            this.wavFormat = wavFormat;
            int i2 = (wavFormat.numChannels * wavFormat.bitsPerSample) / 8;
            if (wavFormat.blockSize != i2) {
                StringBuilder sb = new StringBuilder("Expected block size: ");
                sb.append(i2);
                sb.append("; got: ");
                sb.append(wavFormat.blockSize);
                throw ParserException.createForMalformedContainer(sb.toString(), null);
            }
            int i3 = (wavFormat.frameRateHz * i2) << 3;
            int iMax = Math.max(i2, (wavFormat.frameRateHz * i2) / 10);
            this.targetSampleSizeBytes = iMax;
            this.format = new Format.Builder().setSampleMimeType(str).setAverageBitrate(i3).setPeakBitrate(i3).setMaxInputSize(iMax).setChannelCount(wavFormat.numChannels).setSampleRate(wavFormat.frameRateHz).setPcmEncoding(i).build();
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public final void reset(long j) {
            this.startTimeUs = j;
            this.pendingOutputBytes = 0;
            this.outputFrameCount = 0L;
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public final void init(int i, long j) {
            this.extractorOutput.seekMap(new WavSeekMap(this.wavFormat, 1, i, j));
            this.trackOutput.format(this.format);
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public final boolean sampleData(ExtractorInput extractorInput, long j) throws IOException {
            int i;
            int i2;
            long j2 = j;
            while (j2 > 0 && (i = this.pendingOutputBytes) < (i2 = this.targetSampleSizeBytes)) {
                int iSampleData = this.trackOutput.sampleData((DataReader) extractorInput, (int) Math.min(i2 - i, j2), true);
                if (iSampleData == -1) {
                    j2 = 0;
                } else {
                    this.pendingOutputBytes += iSampleData;
                    j2 -= (long) iSampleData;
                }
            }
            int i3 = this.wavFormat.blockSize;
            int i4 = this.pendingOutputBytes / i3;
            if (i4 > 0) {
                long j3 = this.startTimeUs;
                long jScaleLargeTimestamp = Util.scaleLargeTimestamp(this.outputFrameCount, 1000000L, this.wavFormat.frameRateHz);
                int i5 = i4 * i3;
                int i6 = this.pendingOutputBytes - i5;
                this.trackOutput.sampleMetadata(j3 + jScaleLargeTimestamp, 1, i5, i6, null);
                this.outputFrameCount += (long) i4;
                this.pendingOutputBytes = i6;
            }
            return j2 <= 0;
        }
    }

    static final class ImaAdPcmOutputWriter implements OutputWriter {
        private static final int[] INDEX_TABLE = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        private static final int[] STEP_TABLE = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
        private final ParsableByteArray decodedData;
        private final ExtractorOutput extractorOutput;
        private final Format format;
        private final int framesPerBlock;
        private final byte[] inputData;
        private long outputFrameCount;
        private int pendingInputBytes;
        private int pendingOutputBytes;
        private long startTimeUs;
        private final int targetSampleSizeFrames;
        private final TrackOutput trackOutput;
        private final WavFormat wavFormat;

        private static int numOutputFramesToBytes(int i, int i2) {
            return (i << 1) * i2;
        }

        public ImaAdPcmOutputWriter(ExtractorOutput extractorOutput, TrackOutput trackOutput, WavFormat wavFormat) throws ParserException {
            this.extractorOutput = extractorOutput;
            this.trackOutput = trackOutput;
            this.wavFormat = wavFormat;
            int iMax = Math.max(1, wavFormat.frameRateHz / 10);
            this.targetSampleSizeFrames = iMax;
            ParsableByteArray parsableByteArray = new ParsableByteArray(wavFormat.extraData);
            parsableByteArray.readLittleEndianUnsignedShort();
            int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
            this.framesPerBlock = littleEndianUnsignedShort;
            int i = wavFormat.numChannels;
            int i2 = (((wavFormat.blockSize - (i << 2)) << 3) / (wavFormat.bitsPerSample * i)) + 1;
            if (littleEndianUnsignedShort != i2) {
                StringBuilder sb = new StringBuilder("Expected frames per block: ");
                sb.append(i2);
                sb.append("; got: ");
                sb.append(littleEndianUnsignedShort);
                throw ParserException.createForMalformedContainer(sb.toString(), null);
            }
            int iCeilDivide = Util.ceilDivide(iMax, littleEndianUnsignedShort);
            this.inputData = new byte[wavFormat.blockSize * iCeilDivide];
            this.decodedData = new ParsableByteArray(iCeilDivide * numOutputFramesToBytes(littleEndianUnsignedShort, i));
            int i3 = ((wavFormat.frameRateHz * wavFormat.blockSize) << 3) / littleEndianUnsignedShort;
            this.format = new Format.Builder().setSampleMimeType(MimeTypes.AUDIO_RAW).setAverageBitrate(i3).setPeakBitrate(i3).setMaxInputSize(numOutputFramesToBytes(iMax, i)).setChannelCount(wavFormat.numChannels).setSampleRate(wavFormat.frameRateHz).setPcmEncoding(2).build();
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public final void reset(long j) {
            this.pendingInputBytes = 0;
            this.startTimeUs = j;
            this.pendingOutputBytes = 0;
            this.outputFrameCount = 0L;
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public final void init(int i, long j) {
            this.extractorOutput.seekMap(new WavSeekMap(this.wavFormat, this.framesPerBlock, i, j));
            this.trackOutput.format(this.format);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x001c, code lost:
        
            r1 = true;
         */
        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean sampleData(com.google.android.exoplayer2.extractor.ExtractorInput r6, long r7) throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.targetSampleSizeFrames
                int r1 = r5.pendingOutputBytes
                int r1 = r5.numOutputBytesToFrames(r1)
                int r0 = r0 - r1
                int r1 = r5.framesPerBlock
                int r0 = com.google.android.exoplayer2.util.Util.ceilDivide(r0, r1)
                com.google.android.exoplayer2.extractor.wav.WavFormat r1 = r5.wavFormat
                int r1 = r1.blockSize
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r1 != 0) goto L1b
                goto L3b
            L1b:
                r1 = 0
            L1c:
                if (r1 != 0) goto L3d
                int r2 = r5.pendingInputBytes
                if (r2 >= r0) goto L3d
                int r2 = r0 - r2
                long r2 = (long) r2
                long r2 = java.lang.Math.min(r2, r7)
                int r2 = (int) r2
                byte[] r3 = r5.inputData
                int r4 = r5.pendingInputBytes
                int r2 = r6.read(r3, r4, r2)
                r3 = -1
                if (r2 == r3) goto L3b
                int r3 = r5.pendingInputBytes
                int r3 = r3 + r2
                r5.pendingInputBytes = r3
                goto L1c
            L3b:
                r1 = 1
                goto L1c
            L3d:
                int r6 = r5.pendingInputBytes
                com.google.android.exoplayer2.extractor.wav.WavFormat r7 = r5.wavFormat
                int r7 = r7.blockSize
                int r6 = r6 / r7
                if (r6 <= 0) goto L74
                byte[] r7 = r5.inputData
                com.google.android.exoplayer2.util.ParsableByteArray r8 = r5.decodedData
                r5.decode(r7, r6, r8)
                int r7 = r5.pendingInputBytes
                com.google.android.exoplayer2.extractor.wav.WavFormat r8 = r5.wavFormat
                int r8 = r8.blockSize
                int r6 = r6 * r8
                int r7 = r7 - r6
                r5.pendingInputBytes = r7
                com.google.android.exoplayer2.util.ParsableByteArray r6 = r5.decodedData
                int r6 = r6.limit()
                com.google.android.exoplayer2.extractor.TrackOutput r7 = r5.trackOutput
                com.google.android.exoplayer2.util.ParsableByteArray r8 = r5.decodedData
                r7.sampleData(r8, r6)
                int r7 = r5.pendingOutputBytes
                int r7 = r7 + r6
                r5.pendingOutputBytes = r7
                int r6 = r5.numOutputBytesToFrames(r7)
                int r7 = r5.targetSampleSizeFrames
                if (r6 < r7) goto L74
                r5.writeSampleMetadata(r7)
            L74:
                if (r1 == 0) goto L81
                int r6 = r5.pendingOutputBytes
                int r6 = r5.numOutputBytesToFrames(r6)
                if (r6 <= 0) goto L81
                r5.writeSampleMetadata(r6)
            L81:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.wav.WavExtractor.ImaAdPcmOutputWriter.sampleData(com.google.android.exoplayer2.extractor.ExtractorInput, long):boolean");
        }

        private void writeSampleMetadata(int i) {
            long j = this.startTimeUs;
            long jScaleLargeTimestamp = Util.scaleLargeTimestamp(this.outputFrameCount, 1000000L, this.wavFormat.frameRateHz);
            int iNumOutputFramesToBytes = numOutputFramesToBytes(i);
            this.trackOutput.sampleMetadata(j + jScaleLargeTimestamp, 1, iNumOutputFramesToBytes, this.pendingOutputBytes - iNumOutputFramesToBytes, null);
            this.outputFrameCount += (long) i;
            this.pendingOutputBytes -= iNumOutputFramesToBytes;
        }

        private void decode(byte[] bArr, int i, ParsableByteArray parsableByteArray) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < this.wavFormat.numChannels; i3++) {
                    decodeBlockForChannel(bArr, i2, i3, parsableByteArray.getData());
                }
            }
            int iNumOutputFramesToBytes = numOutputFramesToBytes(this.framesPerBlock * i);
            parsableByteArray.setPosition(0);
            parsableByteArray.setLimit(iNumOutputFramesToBytes);
        }

        private void decodeBlockForChannel(byte[] bArr, int i, int i2, byte[] bArr2) {
            int i3 = this.wavFormat.blockSize;
            int i4 = this.wavFormat.numChannels;
            int i5 = (i * i3) + (i2 << 2);
            int i6 = i3 / i4;
            int iConstrainValue = (short) (((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255));
            int iMin = Math.min(bArr[i5 + 2] & 255, 88);
            int i7 = STEP_TABLE[iMin];
            int i8 = (((i * this.framesPerBlock) * i4) + i2) << 1;
            bArr2[i8] = (byte) iConstrainValue;
            bArr2[i8 + 1] = (byte) (iConstrainValue >> 8);
            for (int i9 = 0; i9 < ((i6 - 4) << 1); i9++) {
                byte b = bArr[(((i9 / 8) * i4) << 2) + (i4 << 2) + i5 + ((i9 / 2) % 4)];
                int i10 = i9 % 2 == 0 ? b & 15 : (b & 255) >> 4;
                int i11 = ((((i10 & 7) << 1) + 1) * i7) >> 3;
                if ((i10 & 8) != 0) {
                    i11 = -i11;
                }
                iConstrainValue = Util.constrainValue(iConstrainValue + i11, -32768, 32767);
                i8 += i4 << 1;
                bArr2[i8] = (byte) iConstrainValue;
                bArr2[i8 + 1] = (byte) (iConstrainValue >> 8);
                int i12 = INDEX_TABLE[i10];
                int[] iArr = STEP_TABLE;
                iMin = Util.constrainValue(iMin + i12, 0, iArr.length - 1);
                i7 = iArr[iMin];
            }
        }

        private int numOutputBytesToFrames(int i) {
            return i / (this.wavFormat.numChannels << 1);
        }

        private int numOutputFramesToBytes(int i) {
            return numOutputFramesToBytes(i, this.wavFormat.numChannels);
        }
    }
}
