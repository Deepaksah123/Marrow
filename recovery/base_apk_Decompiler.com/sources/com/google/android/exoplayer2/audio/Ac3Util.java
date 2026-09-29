package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class Ac3Util {
    public static final int AC3_MAX_RATE_BYTES_PER_SECOND = 80000;
    private static final int AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT = 1536;
    private static final int AUDIO_SAMPLES_PER_AUDIO_BLOCK = 256;
    public static final int E_AC3_MAX_RATE_BYTES_PER_SECOND = 768000;
    public static final int TRUEHD_MAX_RATE_BYTES_PER_SECOND = 3062500;
    public static final int TRUEHD_RECHUNK_SAMPLE_COUNT = 16;
    public static final int TRUEHD_SYNCFRAME_PREFIX_LENGTH = 10;
    private static final int[] BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD = {1, 2, 3, 6};
    private static final int[] SAMPLE_RATE_BY_FSCOD = {OpusUtil.SAMPLE_RATE, 44100, 32000};
    private static final int[] SAMPLE_RATE_BY_FSCOD2 = {24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND};
    private static final int[] CHANNEL_COUNT_BY_ACMOD = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] BITRATE_BY_HALF_FRMSIZECOD = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, 320, RendererCapabilities.MODE_SUPPORT_MASK, 448, 512, 576, 640};
    private static final int[] SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1 = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static final class SyncFrameInfo {
        public static final int STREAM_TYPE_TYPE0 = 0;
        public static final int STREAM_TYPE_TYPE1 = 1;
        public static final int STREAM_TYPE_TYPE2 = 2;
        public static final int STREAM_TYPE_UNDEFINED = -1;
        public final int bitrate;
        public final int channelCount;
        public final int frameSize;
        public final String mimeType;
        public final int sampleCount;
        public final int sampleRate;
        public final int streamType;

        /* JADX INFO: loaded from: classes.dex */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface StreamType {
        }

        private SyncFrameInfo(String str, int i, int i2, int i3, int i4, int i5, int i6) {
            this.mimeType = str;
            this.streamType = i;
            this.channelCount = i2;
            this.sampleRate = i3;
            this.frameSize = i4;
            this.sampleCount = i5;
            this.bitrate = i6;
        }
    }

    public static Format parseAc3AnnexFFormat(ParsableByteArray parsableByteArray, String str, String str2, DrmInitData drmInitData) {
        ParsableBitArray parsableBitArray = new ParsableBitArray();
        parsableBitArray.reset(parsableByteArray);
        int i = SAMPLE_RATE_BY_FSCOD[parsableBitArray.readBits(2)];
        parsableBitArray.skipBits(8);
        int i2 = CHANNEL_COUNT_BY_ACMOD[parsableBitArray.readBits(3)];
        if (parsableBitArray.readBits(1) != 0) {
            i2++;
        }
        int i3 = BITRATE_BY_HALF_FRMSIZECOD[parsableBitArray.readBits(5)] * 1000;
        parsableBitArray.byteAlign();
        parsableByteArray.setPosition(parsableBitArray.getBytePosition());
        return new Format.Builder().setId(str).setSampleMimeType(MimeTypes.AUDIO_AC3).setChannelCount(i2).setSampleRate(i).setDrmInitData(drmInitData).setLanguage(str2).setAverageBitrate(i3).setPeakBitrate(i3).build();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.Format parseEAc3AnnexFFormat(com.google.android.exoplayer2.util.ParsableByteArray r7, java.lang.String r8, java.lang.String r9, com.google.android.exoplayer2.drm.DrmInitData r10) {
        /*
            com.google.android.exoplayer2.util.ParsableBitArray r0 = new com.google.android.exoplayer2.util.ParsableBitArray
            r0.<init>()
            r0.reset(r7)
            r1 = 13
            int r1 = r0.readBits(r1)
            r2 = 3
            r0.skipBits(r2)
            r3 = 2
            int r3 = r0.readBits(r3)
            int[] r4 = com.google.android.exoplayer2.audio.Ac3Util.SAMPLE_RATE_BY_FSCOD
            r3 = r4[r3]
            r4 = 10
            r0.skipBits(r4)
            int[] r4 = com.google.android.exoplayer2.audio.Ac3Util.CHANNEL_COUNT_BY_ACMOD
            int r5 = r0.readBits(r2)
            r4 = r4[r5]
            r5 = 1
            int r6 = r0.readBits(r5)
            if (r6 == 0) goto L31
            int r4 = r4 + 1
        L31:
            r0.skipBits(r2)
            r2 = 4
            int r2 = r0.readBits(r2)
            r0.skipBits(r5)
            if (r2 <= 0) goto L4d
            r2 = 6
            r0.skipBits(r2)
            int r2 = r0.readBits(r5)
            if (r2 == 0) goto L4a
            int r4 = r4 + 2
        L4a:
            r0.skipBits(r5)
        L4d:
            int r2 = r0.bitsLeft()
            r6 = 7
            if (r2 <= r6) goto L60
            r0.skipBits(r6)
            int r2 = r0.readBits(r5)
            if (r2 == 0) goto L60
            java.lang.String r2 = "audio/eac3-joc"
            goto L62
        L60:
            java.lang.String r2 = "audio/eac3"
        L62:
            r0.byteAlign()
            int r0 = r0.getBytePosition()
            r7.setPosition(r0)
            com.google.android.exoplayer2.Format$Builder r7 = new com.google.android.exoplayer2.Format$Builder
            r7.<init>()
            com.google.android.exoplayer2.Format$Builder r7 = r7.setId(r8)
            com.google.android.exoplayer2.Format$Builder r7 = r7.setSampleMimeType(r2)
            com.google.android.exoplayer2.Format$Builder r7 = r7.setChannelCount(r4)
            com.google.android.exoplayer2.Format$Builder r7 = r7.setSampleRate(r3)
            com.google.android.exoplayer2.Format$Builder r7 = r7.setDrmInitData(r10)
            com.google.android.exoplayer2.Format$Builder r7 = r7.setLanguage(r9)
            int r1 = r1 * 1000
            com.google.android.exoplayer2.Format$Builder r7 = r7.setPeakBitrate(r1)
            com.google.android.exoplayer2.Format r7 = r7.build()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.Ac3Util.parseEAc3AnnexFFormat(com.google.android.exoplayer2.util.ParsableByteArray, java.lang.String, java.lang.String, com.google.android.exoplayer2.drm.DrmInitData):com.google.android.exoplayer2.Format");
    }

    public static SyncFrameInfo parseAc3SyncframeInfo(ParsableBitArray parsableBitArray) {
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        String str2;
        int position = parsableBitArray.getPosition();
        parsableBitArray.skipBits(40);
        boolean z = parsableBitArray.readBits(5) > 10;
        parsableBitArray.setPosition(position);
        int i10 = -1;
        if (z) {
            parsableBitArray.skipBits(16);
            int bits = parsableBitArray.readBits(2);
            if (bits == 0) {
                i10 = 0;
            } else if (bits == 1) {
                i10 = 1;
            } else if (bits == 2) {
                i10 = 2;
            }
            parsableBitArray.skipBits(3);
            int bits2 = (parsableBitArray.readBits(11) + 1) << 1;
            int bits3 = parsableBitArray.readBits(2);
            if (bits3 == 3) {
                i8 = SAMPLE_RATE_BY_FSCOD2[parsableBitArray.readBits(2)];
                i9 = 6;
                i7 = 3;
            } else {
                int bits4 = parsableBitArray.readBits(2);
                int i11 = BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD[bits4];
                i7 = bits4;
                i8 = SAMPLE_RATE_BY_FSCOD[bits3];
                i9 = i11;
            }
            int i12 = i9 << 8;
            int iCalculateEac3Bitrate = calculateEac3Bitrate(bits2, i8, i9);
            int bits5 = parsableBitArray.readBits(3);
            boolean bit = parsableBitArray.readBit();
            i = CHANNEL_COUNT_BY_ACMOD[bits5] + (bit ? 1 : 0);
            parsableBitArray.skipBits(10);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(8);
            }
            if (bits5 == 0) {
                parsableBitArray.skipBits(5);
                if (parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(8);
                }
            }
            if (i10 == 1 && parsableBitArray.readBit()) {
                parsableBitArray.skipBits(16);
            }
            if (parsableBitArray.readBit()) {
                if (bits5 > 2) {
                    parsableBitArray.skipBits(2);
                }
                if ((bits5 & 1) != 0 && bits5 > 2) {
                    parsableBitArray.skipBits(6);
                }
                if ((bits5 & 4) != 0) {
                    parsableBitArray.skipBits(6);
                }
                if (bit && parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(5);
                }
                if (i10 == 0) {
                    if (parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(6);
                    }
                    if (bits5 == 0 && parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(6);
                    }
                    if (parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(6);
                    }
                    int bits6 = parsableBitArray.readBits(2);
                    if (bits6 == 1) {
                        parsableBitArray.skipBits(5);
                    } else if (bits6 == 2) {
                        parsableBitArray.skipBits(12);
                    } else if (bits6 == 3) {
                        int bits7 = parsableBitArray.readBits(5);
                        if (parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(5);
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(4);
                            }
                            if (parsableBitArray.readBit()) {
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(4);
                                }
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(4);
                                }
                            }
                        }
                        if (parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(5);
                            if (parsableBitArray.readBit()) {
                                parsableBitArray.skipBits(7);
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(8);
                                }
                            }
                        }
                        parsableBitArray.skipBits((bits7 + 2) << 3);
                        parsableBitArray.byteAlign();
                    }
                    if (bits5 < 2) {
                        if (parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(14);
                        }
                        if (bits5 == 0 && parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(14);
                        }
                    }
                    if (parsableBitArray.readBit()) {
                        if (i7 == 0) {
                            parsableBitArray.skipBits(5);
                        } else {
                            for (int i13 = 0; i13 < i9; i13++) {
                                if (parsableBitArray.readBit()) {
                                    parsableBitArray.skipBits(5);
                                }
                            }
                        }
                    }
                }
            }
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(5);
                if (bits5 == 2) {
                    parsableBitArray.skipBits(4);
                }
                if (bits5 >= 6) {
                    parsableBitArray.skipBits(2);
                }
                if (parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(8);
                }
                if (bits5 == 0 && parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(8);
                }
                if (bits3 < 3) {
                    parsableBitArray.skipBit();
                }
            }
            if (i10 == 0 && i7 != 3) {
                parsableBitArray.skipBit();
            }
            if (i10 == 2 && (i7 == 3 || parsableBitArray.readBit())) {
                parsableBitArray.skipBits(6);
            }
            if (parsableBitArray.readBit() && parsableBitArray.readBits(6) == 1 && parsableBitArray.readBits(8) == 1) {
                str2 = MimeTypes.AUDIO_E_AC3_JOC;
            } else {
                str2 = MimeTypes.AUDIO_E_AC3;
            }
            str = str2;
            i3 = i10;
            i4 = bits2;
            i5 = i8;
            i6 = i12;
            i2 = iCalculateEac3Bitrate;
        } else {
            parsableBitArray.skipBits(32);
            int bits8 = parsableBitArray.readBits(2);
            String str3 = bits8 == 3 ? null : MimeTypes.AUDIO_AC3;
            int bits9 = parsableBitArray.readBits(6);
            int i14 = BITRATE_BY_HALF_FRMSIZECOD[bits9 / 2];
            int ac3SyncframeSize = getAc3SyncframeSize(bits8, bits9);
            parsableBitArray.skipBits(8);
            int bits10 = parsableBitArray.readBits(3);
            if ((bits10 & 1) != 0 && bits10 != 1) {
                parsableBitArray.skipBits(2);
            }
            if ((bits10 & 4) != 0) {
                parsableBitArray.skipBits(2);
            }
            if (bits10 == 2) {
                parsableBitArray.skipBits(2);
            }
            int[] iArr = SAMPLE_RATE_BY_FSCOD;
            int i15 = bits8 < iArr.length ? iArr[bits8] : -1;
            i = CHANNEL_COUNT_BY_ACMOD[bits10] + (parsableBitArray.readBit() ? 1 : 0);
            i2 = i14 * 1000;
            i3 = -1;
            str = str3;
            i4 = ac3SyncframeSize;
            i5 = i15;
            i6 = AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT;
        }
        return new SyncFrameInfo(str, i3, i, i5, i4, i6, i2);
    }

    public static int parseAc3SyncframeSize(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) << 1;
        }
        byte b = bArr[4];
        return getAc3SyncframeSize((b & 192) >> 6, b & 63);
    }

    public static int parseAc3SyncframeAudioSampleCount(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & TarConstants.LF_NORMAL) >> 4 : 3] << 8;
        }
        return AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT;
    }

    public static int findTrueHdSyncframeOffset(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        for (int i = iPosition; i <= iLimit - 10; i++) {
            if ((Util.getBigEndianInt(byteBuffer, i + 4) & (-2)) == -126718022) {
                return i - iPosition;
            }
        }
        return -1;
    }

    public static int parseTrueHdSyncframeAudioSampleCount(byte[] bArr) {
        if (bArr[4] != -8 || bArr[5] != 114 || bArr[6] != 111) {
            return 0;
        }
        byte b = bArr[7];
        if ((b & 254) == 186) {
            return 40 << ((bArr[(b & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
        }
        return 0;
    }

    public static int parseTrueHdSyncframeAudioSampleCount(ByteBuffer byteBuffer, int i) {
        boolean z = (byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187;
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + (z ? 9 : 8)) >> 4) & 7);
    }

    private static int getAc3SyncframeSize(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = SAMPLE_RATE_BY_FSCOD;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) << 1;
        }
        int i5 = BITRATE_BY_HALF_FRMSIZECOD[i3];
        return i4 == 32000 ? i5 * 6 : i5 << 2;
    }

    private static int calculateEac3Bitrate(int i, int i2, int i3) {
        return (i * i2) / (i3 << 5);
    }

    private Ac3Util() {
    }
}
