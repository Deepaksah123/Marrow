package com.google.android.exoplayer2.source.hls;

import android.media.MediaFormat;
import android.media.MediaParser;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30;
import com.google.android.exoplayer2.source.mediaparser.MediaParserUtil;
import com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.FileTypes;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.initExtraTracks;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class MediaParserHlsMediaChunkExtractor implements HlsMediaChunkExtractor {
    public static final HlsExtractorFactory FACTORY = new HlsExtractorFactory() { // from class: com.google.android.exoplayer2.source.hls.MediaParserHlsMediaChunkExtractor$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.source.hls.HlsExtractorFactory
        public final HlsMediaChunkExtractor createExtractor(Uri uri, Format format, List list, TimestampAdjuster timestampAdjuster, Map map, ExtractorInput extractorInput, PlayerId playerId) {
            return MediaParserHlsMediaChunkExtractor.lambda$static$0(uri, format, list, timestampAdjuster, map, extractorInput, playerId);
        }
    };
    private final Format format;
    private final InputReaderAdapterV30 inputReaderAdapter = new InputReaderAdapterV30();
    private final MediaParser mediaParser;
    private final initExtraTracks<MediaFormat> muxedCaptionMediaFormats;
    private final OutputConsumerAdapterV30 outputConsumerAdapter;
    private final boolean overrideInBandCaptionDeclarations;
    private int pendingSkipBytes;
    private final PlayerId playerId;

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ HlsMediaChunkExtractor lambda$static$0(Uri uri, Format format, List list, TimestampAdjuster timestampAdjuster, Map map, ExtractorInput extractorInput, PlayerId playerId) throws IOException {
        if (FileTypes.inferFileTypeFromMimeType(format.sampleMimeType) == 13) {
            return new BundledHlsMediaChunkExtractor(new WebvttExtractor(format.language, timestampAdjuster), format, timestampAdjuster);
        }
        boolean z = list != null;
        initExtraTracks.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver = initExtraTracks.MediaBrowserCompatCustomActionResultReceiver();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.read(MediaParserUtil.toCaptionsMediaFormat((Format) list.get(i)));
            }
        } else {
            iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.read(MediaParserUtil.toCaptionsMediaFormat(new Format.Builder().setSampleMimeType(MimeTypes.APPLICATION_CEA608).build()));
        }
        initExtraTracks initextratracksIconCompatParcelizer = iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
        OutputConsumerAdapterV30 outputConsumerAdapterV30 = new OutputConsumerAdapterV30();
        if (list == null) {
            list = initExtraTracks.AudioAttributesImplApi26Parcelizer();
        }
        outputConsumerAdapterV30.setMuxedCaptionFormats(list);
        outputConsumerAdapterV30.setTimestampAdjuster(timestampAdjuster);
        MediaParser mediaParserCreateMediaParserInstance = createMediaParserInstance(outputConsumerAdapterV30, format, z, initextratracksIconCompatParcelizer, playerId, "android.media.mediaparser.FragmentedMp4Parser", "android.media.mediaparser.Ac3Parser", "android.media.mediaparser.Ac4Parser", "android.media.mediaparser.AdtsParser", "android.media.mediaparser.Mp3Parser", "android.media.mediaparser.TsParser");
        PeekingInputReader peekingInputReader = new PeekingInputReader(extractorInput);
        mediaParserCreateMediaParserInstance.advance(peekingInputReader);
        outputConsumerAdapterV30.setSelectedParserName(mediaParserCreateMediaParserInstance.getParserName());
        return new MediaParserHlsMediaChunkExtractor(mediaParserCreateMediaParserInstance, outputConsumerAdapterV30, format, z, initextratracksIconCompatParcelizer, peekingInputReader.totalPeekedBytes, playerId);
    }

    public MediaParserHlsMediaChunkExtractor(MediaParser mediaParser, OutputConsumerAdapterV30 outputConsumerAdapterV30, Format format, boolean z, initExtraTracks<MediaFormat> initextratracks, int i, PlayerId playerId) {
        this.mediaParser = mediaParser;
        this.outputConsumerAdapter = outputConsumerAdapterV30;
        this.overrideInBandCaptionDeclarations = z;
        this.muxedCaptionMediaFormats = initextratracks;
        this.format = format;
        this.playerId = playerId;
        this.pendingSkipBytes = i;
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    public final void init(ExtractorOutput extractorOutput) {
        this.outputConsumerAdapter.setExtractorOutput(extractorOutput);
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    public final boolean read(ExtractorInput extractorInput) throws IOException {
        extractorInput.skipFully(this.pendingSkipBytes);
        this.pendingSkipBytes = 0;
        this.inputReaderAdapter.setDataReader(extractorInput, extractorInput.getLength());
        return this.mediaParser.advance(this.inputReaderAdapter);
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    public final boolean isPackedAudioExtractor() {
        String parserName = this.mediaParser.getParserName();
        return "android.media.mediaparser.Ac3Parser".equals(parserName) || "android.media.mediaparser.Ac4Parser".equals(parserName) || "android.media.mediaparser.AdtsParser".equals(parserName) || "android.media.mediaparser.Mp3Parser".equals(parserName);
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    public final boolean isReusable() {
        String parserName = this.mediaParser.getParserName();
        return "android.media.mediaparser.FragmentedMp4Parser".equals(parserName) || "android.media.mediaparser.TsParser".equals(parserName);
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    public final HlsMediaChunkExtractor recreate() {
        Assertions.checkState(!isReusable());
        return new MediaParserHlsMediaChunkExtractor(createMediaParserInstance(this.outputConsumerAdapter, this.format, this.overrideInBandCaptionDeclarations, this.muxedCaptionMediaFormats, this.playerId, this.mediaParser.getParserName()), this.outputConsumerAdapter, this.format, this.overrideInBandCaptionDeclarations, this.muxedCaptionMediaFormats, 0, this.playerId);
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsMediaChunkExtractor
    public final void onTruncatedSegmentParsed() {
        this.mediaParser.seek(MediaParser.SeekPoint.START);
    }

    private static MediaParser createMediaParserInstance(MediaParser.OutputConsumer outputConsumer, Format format, boolean z, initExtraTracks<MediaFormat> initextratracks, PlayerId playerId, String... strArr) {
        MediaParser mediaParserCreate;
        int length = strArr.length;
        Boolean bool = Boolean.TRUE;
        if (length == 1) {
            mediaParserCreate = MediaParser.createByName(strArr[0], outputConsumer);
        } else {
            mediaParserCreate = MediaParser.create(outputConsumer, strArr);
        }
        mediaParserCreate.setParameter(MediaParserUtil.PARAMETER_EXPOSE_CAPTION_FORMATS, initextratracks);
        mediaParserCreate.setParameter(MediaParserUtil.PARAMETER_OVERRIDE_IN_BAND_CAPTION_DECLARATIONS, Boolean.valueOf(z));
        mediaParserCreate.setParameter(MediaParserUtil.PARAMETER_IN_BAND_CRYPTO_INFO, bool);
        mediaParserCreate.setParameter(MediaParserUtil.PARAMETER_EAGERLY_EXPOSE_TRACK_TYPE, bool);
        mediaParserCreate.setParameter(MediaParserUtil.PARAMETER_IGNORE_TIMESTAMP_OFFSET, bool);
        mediaParserCreate.setParameter("android.media.mediaparser.ts.ignoreSpliceInfoStream", bool);
        mediaParserCreate.setParameter("android.media.mediaparser.ts.mode", "hls");
        String str = format.codecs;
        if (!TextUtils.isEmpty(str)) {
            if (!MimeTypes.AUDIO_AAC.equals(MimeTypes.getAudioMediaMimeType(str))) {
                mediaParserCreate.setParameter("android.media.mediaparser.ts.ignoreAacStream", bool);
            }
            if (!MimeTypes.VIDEO_H264.equals(MimeTypes.getVideoMediaMimeType(str))) {
                mediaParserCreate.setParameter("android.media.mediaparser.ts.ignoreAvcStream", bool);
            }
        }
        if (Util.SDK_INT >= 31) {
            MediaParserUtil.setLogSessionIdOnMediaParser(mediaParserCreate, playerId);
        }
        return mediaParserCreate;
    }

    static final class PeekingInputReader implements MediaParser.SeekableInputReader {
        private final ExtractorInput extractorInput;
        private int totalPeekedBytes;

        private PeekingInputReader(ExtractorInput extractorInput) {
            this.extractorInput = extractorInput;
        }

        @Override // android.media.MediaParser.InputReader
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            int iPeek = this.extractorInput.peek(bArr, i, i2);
            this.totalPeekedBytes += iPeek;
            return iPeek;
        }

        @Override // android.media.MediaParser.InputReader
        public final long getPosition() {
            return this.extractorInput.getPeekPosition();
        }

        @Override // android.media.MediaParser.InputReader
        public final long getLength() {
            return this.extractorInput.getLength();
        }

        @Override // android.media.MediaParser.SeekableInputReader
        public final void seekToPosition(long j) {
            throw new UnsupportedOperationException();
        }
    }
}
