package kotlin;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.exoplayer2.util.MimeTypes;
import kotlin.serializeFilteredFields;

/* JADX INFO: loaded from: classes2.dex */
public final class _writeNullKeyedEntry {
    public final boolean AudioAttributesCompatParcelizer;
    public final boolean AudioAttributesImplApi21Parcelizer;
    public final boolean AudioAttributesImplApi26Parcelizer;
    public final boolean AudioAttributesImplBaseParcelizer;
    public final boolean IconCompatParcelizer;
    public final String MediaBrowserCompatCustomActionResultReceiver;
    public final boolean MediaBrowserCompatItemReceiver;
    private final boolean MediaBrowserCompatSearchResultReceiver;
    public final MediaCodecInfo.CodecCapabilities RemoteActionCompatParcelizer;
    public final String read;
    public final String write;

    public static _writeNullKeyedEntry IconCompatParcelizer(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
        return new _writeNullKeyedEntry(str, str2, str3, codecCapabilities, z, z2, z3, (codecCapabilities == null || !RemoteActionCompatParcelizer(codecCapabilities) || IconCompatParcelizer(str)) ? false : true, codecCapabilities != null && write(codecCapabilities), z4 || (codecCapabilities != null && read(codecCapabilities)));
    }

    private _writeNullKeyedEntry(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.MediaBrowserCompatCustomActionResultReceiver = (String) buildTypeSerializer.IconCompatParcelizer(str);
        this.write = str2;
        this.read = str3;
        this.RemoteActionCompatParcelizer = codecCapabilities;
        this.IconCompatParcelizer = z;
        this.AudioAttributesImplApi21Parcelizer = z2;
        this.AudioAttributesImplBaseParcelizer = z3;
        this.AudioAttributesCompatParcelizer = z4;
        this.MediaBrowserCompatItemReceiver = z5;
        this.AudioAttributesImplApi26Parcelizer = z6;
        this.MediaBrowserCompatSearchResultReceiver = DefaultBaseTypeLimitingValidator.MediaBrowserCompatItemReceiver(str2);
    }

    public final String toString() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final MediaCodecInfo.CodecProfileLevel[] AudioAttributesCompatParcelizer() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.RemoteActionCompatParcelizer;
        if (codecCapabilities == null || codecCapabilities.profileLevels == null) {
            return new MediaCodecInfo.CodecProfileLevel[0];
        }
        return this.RemoteActionCompatParcelizer.profileLevels;
    }

    public final boolean write(C0170format c0170format) throws serializeFilteredFields.write {
        if (!IconCompatParcelizer(c0170format) || !IconCompatParcelizer(c0170format, true)) {
            return false;
        }
        if (!this.MediaBrowserCompatSearchResultReceiver) {
            return LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 21 || ((c0170format.onPrepareFromUri == -1 || AudioAttributesCompatParcelizer(c0170format.onPrepareFromUri)) && (c0170format.AudioAttributesCompatParcelizer == -1 || write(c0170format.AudioAttributesCompatParcelizer)));
        }
        if (c0170format.onSetCaptioningEnabled <= 0 || c0170format.MediaMetadataCompat <= 0) {
            return true;
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 21) {
            return read(c0170format.onSetCaptioningEnabled, c0170format.MediaMetadataCompat, c0170format.RatingCompat);
        }
        boolean z = c0170format.onSetCaptioningEnabled * c0170format.MediaMetadataCompat <= serializeFilteredFields.write();
        if (!z) {
            StringBuilder sb = new StringBuilder("legacyFrameSize, ");
            sb.append(c0170format.onSetCaptioningEnabled);
            sb.append("x");
            sb.append(c0170format.MediaMetadataCompat);
            RemoteActionCompatParcelizer(sb.toString());
        }
        return z;
    }

    public final boolean read(C0170format c0170format) {
        return IconCompatParcelizer(c0170format) && IconCompatParcelizer(c0170format, false);
    }

    private boolean IconCompatParcelizer(C0170format c0170format) {
        return this.write.equals(c0170format.onPlayFromUri) || this.write.equals(serializeFilteredFields.RemoteActionCompatParcelizer(c0170format));
    }

    private boolean IconCompatParcelizer(C0170format c0170format, boolean z) {
        int i;
        Pair<Integer, Integer> pairWrite = serializeFilteredFields.write(c0170format);
        if (pairWrite == null) {
            return true;
        }
        int iIntValue = ((Integer) pairWrite.first).intValue();
        int iIntValue2 = ((Integer) pairWrite.second).intValue();
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(c0170format.onPlayFromUri)) {
            if (!MimeTypes.VIDEO_H264.equals(this.write)) {
                i = MimeTypes.VIDEO_H265.equals(this.write) ? 2 : 8;
            }
            iIntValue = i;
            iIntValue2 = 0;
        }
        if (!this.MediaBrowserCompatSearchResultReceiver && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver <= 23 && MimeTypes.VIDEO_VP9.equals(this.write) && codecProfileLevelArrAudioAttributesCompatParcelizer.length == 0) {
            codecProfileLevelArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrAudioAttributesCompatParcelizer) {
            if (codecProfileLevel.profile == iIntValue && ((codecProfileLevel.level >= iIntValue2 || !z) && !write(this.write, iIntValue))) {
                return true;
            }
        }
        StringBuilder sb = new StringBuilder("codec.profileLevel, ");
        sb.append(c0170format.RemoteActionCompatParcelizer);
        sb.append(", ");
        sb.append(this.read);
        RemoteActionCompatParcelizer(sb.toString());
        return false;
    }

    public final boolean write() {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 29 && MimeTypes.VIDEO_VP9.equals(this.write)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : AudioAttributesCompatParcelizer()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean RemoteActionCompatParcelizer(C0170format c0170format) {
        if (this.MediaBrowserCompatSearchResultReceiver) {
            return this.AudioAttributesCompatParcelizer;
        }
        Pair<Integer, Integer> pairWrite = serializeFilteredFields.write(c0170format);
        return pairWrite != null && ((Integer) pairWrite.first).intValue() == 42;
    }

    public final findMapLikeSerializer AudioAttributesCompatParcelizer(C0170format c0170format, C0170format c0170format2) {
        int i = !LaissezFaireSubTypeValidator.read(c0170format.onPlayFromUri, c0170format2.onPlayFromUri) ? 8 : 0;
        if (this.MediaBrowserCompatSearchResultReceiver) {
            if (c0170format.onPlayFromSearch != c0170format2.onPlayFromSearch) {
                i |= 1024;
            }
            if (!this.AudioAttributesCompatParcelizer && (c0170format.onSetCaptioningEnabled != c0170format2.onSetCaptioningEnabled || c0170format.MediaMetadataCompat != c0170format2.MediaMetadataCompat)) {
                i |= 512;
            }
            if ((!keyFormat.IconCompatParcelizer(c0170format.AudioAttributesImplBaseParcelizer) || !keyFormat.IconCompatParcelizer(c0170format2.AudioAttributesImplBaseParcelizer)) && !LaissezFaireSubTypeValidator.read(c0170format.AudioAttributesImplBaseParcelizer, c0170format2.AudioAttributesImplBaseParcelizer)) {
                i |= 2048;
            }
            if (read(this.MediaBrowserCompatCustomActionResultReceiver) && !c0170format.AudioAttributesCompatParcelizer(c0170format2)) {
                i |= 2;
            }
            if (i == 0) {
                return new findMapLikeSerializer(this.MediaBrowserCompatCustomActionResultReceiver, c0170format, c0170format2, c0170format.AudioAttributesCompatParcelizer(c0170format2) ? 3 : 2, 0);
            }
        } else {
            if (c0170format.AudioAttributesCompatParcelizer != c0170format2.AudioAttributesCompatParcelizer) {
                i |= 4096;
            }
            if (c0170format.onPrepareFromUri != c0170format2.onPrepareFromUri) {
                i |= 8192;
            }
            if (c0170format.onMediaButtonEvent != c0170format2.onMediaButtonEvent) {
                i |= 16384;
            }
            if (i == 0 && MimeTypes.AUDIO_AAC.equals(this.write)) {
                Pair<Integer, Integer> pairWrite = serializeFilteredFields.write(c0170format);
                Pair<Integer, Integer> pairWrite2 = serializeFilteredFields.write(c0170format2);
                if (pairWrite != null && pairWrite2 != null) {
                    int iIntValue = ((Integer) pairWrite.first).intValue();
                    int iIntValue2 = ((Integer) pairWrite2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new findMapLikeSerializer(this.MediaBrowserCompatCustomActionResultReceiver, c0170format, c0170format2, 3, 0);
                    }
                }
            }
            if (!c0170format.AudioAttributesCompatParcelizer(c0170format2)) {
                i |= 32;
            }
            if (write(this.write)) {
                i |= 2;
            }
            if (i == 0) {
                return new findMapLikeSerializer(this.MediaBrowserCompatCustomActionResultReceiver, c0170format, c0170format2, 1, 0);
            }
        }
        return new findMapLikeSerializer(this.MediaBrowserCompatCustomActionResultReceiver, c0170format, c0170format2, 0, i);
    }

    public final boolean read(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.RemoteActionCompatParcelizer;
        if (codecCapabilities == null) {
            RemoteActionCompatParcelizer("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            RemoteActionCompatParcelizer("sizeAndRate.vCaps");
            return false;
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 29) {
            int iRemoteActionCompatParcelizer = serializeTypedFields.RemoteActionCompatParcelizer(videoCapabilities, i, i2, d);
            if (iRemoteActionCompatParcelizer == 2) {
                return true;
            }
            if (iRemoteActionCompatParcelizer == 1) {
                StringBuilder sb = new StringBuilder("sizeAndRate.cover, ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                sb.append("@");
                sb.append(d);
                RemoteActionCompatParcelizer(sb.toString());
                return false;
            }
        }
        if (!RemoteActionCompatParcelizer(videoCapabilities, i, i2, d)) {
            if (i >= i2 || !MediaBrowserCompatCustomActionResultReceiver(this.MediaBrowserCompatCustomActionResultReceiver) || !RemoteActionCompatParcelizer(videoCapabilities, i2, i, d)) {
                StringBuilder sb2 = new StringBuilder("sizeAndRate.support, ");
                sb2.append(i);
                sb2.append("x");
                sb2.append(i2);
                sb2.append("@");
                sb2.append(d);
                RemoteActionCompatParcelizer(sb2.toString());
                return false;
            }
            StringBuilder sb3 = new StringBuilder("sizeAndRate.rotated, ");
            sb3.append(i);
            sb3.append("x");
            sb3.append(i2);
            sb3.append("@");
            sb3.append(d);
            AudioAttributesCompatParcelizer(sb3.toString());
        }
        return true;
    }

    public final Point write(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.RemoteActionCompatParcelizer;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return write(videoCapabilities, i, i2);
    }

    private boolean AudioAttributesCompatParcelizer(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.RemoteActionCompatParcelizer;
        if (codecCapabilities == null) {
            RemoteActionCompatParcelizer("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            RemoteActionCompatParcelizer("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        }
        RemoteActionCompatParcelizer("sampleRate.support, ".concat(String.valueOf(i)));
        return false;
    }

    private boolean write(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.RemoteActionCompatParcelizer;
        if (codecCapabilities == null) {
            RemoteActionCompatParcelizer("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            RemoteActionCompatParcelizer("channelCount.aCaps");
            return false;
        }
        if (AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, this.write, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        }
        RemoteActionCompatParcelizer("channelCount.support, ".concat(String.valueOf(i)));
        return false;
    }

    private void RemoteActionCompatParcelizer(String str) {
        StringBuilder sb = new StringBuilder("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(", ");
        sb.append(this.write);
        sb.append("] [");
        sb.append(LaissezFaireSubTypeValidator.write);
        sb.append("]");
        prune.IconCompatParcelizer(com.google.android.exoplayer2.mediacodec.MediaCodecInfo.TAG, sb.toString());
    }

    private void AudioAttributesCompatParcelizer(String str) {
        StringBuilder sb = new StringBuilder("AssumedSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(", ");
        sb.append(this.write);
        sb.append("] [");
        sb.append(LaissezFaireSubTypeValidator.write);
        sb.append("]");
        prune.IconCompatParcelizer(com.google.android.exoplayer2.mediacodec.MediaCodecInfo.TAG, sb.toString());
    }

    private static int AudioAttributesCompatParcelizer(String str, String str2, int i) {
        int i2;
        if (i > 1 || ((LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 26 && i > 0) || MimeTypes.AUDIO_MPEG.equals(str2) || MimeTypes.AUDIO_AMR_NB.equals(str2) || MimeTypes.AUDIO_AMR_WB.equals(str2) || MimeTypes.AUDIO_AAC.equals(str2) || MimeTypes.AUDIO_VORBIS.equals(str2) || MimeTypes.AUDIO_OPUS.equals(str2) || MimeTypes.AUDIO_RAW.equals(str2) || MimeTypes.AUDIO_FLAC.equals(str2) || MimeTypes.AUDIO_ALAW.equals(str2) || MimeTypes.AUDIO_MLAW.equals(str2) || MimeTypes.AUDIO_MSGSM.equals(str2))) {
            return i;
        }
        if (MimeTypes.AUDIO_AC3.equals(str2)) {
            i2 = 6;
        } else {
            i2 = MimeTypes.AUDIO_E_AC3.equals(str2) ? 16 : 30;
        }
        StringBuilder sb = new StringBuilder("AssumedMaxChannelAdjustment: ");
        sb.append(str);
        sb.append(", [");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append("]");
        prune.RemoteActionCompatParcelizer(com.google.android.exoplayer2.mediacodec.MediaCodecInfo.TAG, sb.toString());
        return i2;
    }

    private static boolean RemoteActionCompatParcelizer(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean write(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 21 && MediaBrowserCompatCustomActionResultReceiver(codecCapabilities);
    }

    private static boolean MediaBrowserCompatCustomActionResultReceiver(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private static boolean read(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 21 && IconCompatParcelizer(codecCapabilities);
    }

    private static boolean IconCompatParcelizer(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean RemoteActionCompatParcelizer(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point pointWrite = write(videoCapabilities, i, i2);
        int i3 = pointWrite.x;
        int i4 = pointWrite.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    private static Point write(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(i, widthAlignment) * widthAlignment, LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(i2, heightAlignment) * heightAlignment);
    }

    private static MediaCodecInfo.CodecProfileLevel[] AudioAttributesCompatParcelizer(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        int i = iIntValue >= 180000000 ? 1024 : iIntValue >= 120000000 ? 512 : iIntValue >= 60000000 ? 256 : iIntValue >= 30000000 ? 128 : iIntValue >= 18000000 ? 64 : iIntValue >= 12000000 ? 32 : iIntValue >= 7200000 ? 16 : iIntValue >= 3600000 ? 8 : iIntValue >= 1800000 ? 4 : iIntValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    private static boolean IconCompatParcelizer(String str) {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver > 22) {
            return false;
        }
        if ("ODROID-XU3".equals(LaissezFaireSubTypeValidator.MediaBrowserCompatItemReceiver) || "Nexus 10".equals(LaissezFaireSubTypeValidator.MediaBrowserCompatItemReceiver)) {
            return "OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str);
        }
        return false;
    }

    private static boolean read(String str) {
        return LaissezFaireSubTypeValidator.MediaBrowserCompatItemReceiver.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean write(String str) {
        return MimeTypes.AUDIO_OPUS.equals(str);
    }

    private static boolean MediaBrowserCompatCustomActionResultReceiver(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer)) ? false : true;
    }

    private static boolean write(String str, int i) {
        if (MimeTypes.VIDEO_H265.equals(str) && 2 == i) {
            return "sailfish".equals(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer) || "marlin".equals(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer);
        }
        return false;
    }
}
