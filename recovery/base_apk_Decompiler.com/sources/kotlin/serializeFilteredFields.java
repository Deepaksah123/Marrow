package kotlin;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class serializeFilteredFields {
    private static final Pattern read = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap<AudioAttributesCompatParcelizer, List<_writeNullKeyedEntry>> RemoteActionCompatParcelizer = new HashMap<>();
    private static int AudioAttributesCompatParcelizer = -1;

    interface AudioAttributesImplApi21Parcelizer<T> {
        int write(T t);
    }

    interface RemoteActionCompatParcelizer {
        MediaCodecInfo AudioAttributesCompatParcelizer(int i);

        boolean AudioAttributesCompatParcelizer();

        boolean AudioAttributesCompatParcelizer(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean RemoteActionCompatParcelizer(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int write();
    }

    private static int AudioAttributesCompatParcelizer(int i) {
        int i2 = 17;
        if (i != 17) {
            i2 = 20;
            if (i != 20) {
                i2 = 23;
                if (i != 23) {
                    i2 = 29;
                    if (i != 29) {
                        i2 = 39;
                        if (i != 39) {
                            i2 = 42;
                            if (i != 42) {
                                switch (i) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i2;
    }

    private static int AudioAttributesImplBaseParcelizer(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? -1 : 8;
        }
        return 4;
    }

    private static int IconCompatParcelizer(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return C.DEFAULT_BUFFER_SEGMENT_SIZE;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int MediaBrowserCompatCustomActionResultReceiver(int i) {
        if (i == 10) {
            return 1;
        }
        if (i == 11) {
            return 2;
        }
        if (i == 20) {
            return 4;
        }
        if (i == 21) {
            return 8;
        }
        if (i == 30) {
            return 16;
        }
        if (i == 31) {
            return 32;
        }
        if (i == 40) {
            return 64;
        }
        if (i == 41) {
            return 128;
        }
        if (i == 50) {
            return 256;
        }
        if (i == 51) {
            return 512;
        }
        switch (i) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static int RemoteActionCompatParcelizer(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case C.DEFAULT_BUFFER_SEGMENT_SIZE /* 65536 */:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    private static int read(int i) {
        if (i == 66) {
            return 1;
        }
        if (i == 77) {
            return 2;
        }
        if (i == 88) {
            return 4;
        }
        if (i == 100) {
            return 8;
        }
        if (i == 110) {
            return 16;
        }
        if (i != 122) {
            return i != 244 ? -1 : 64;
        }
        return 32;
    }

    private static int write(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return C.DEFAULT_BUFFER_SEGMENT_SIZE;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    public static class write extends Exception {
        /* synthetic */ write(Throwable th, byte b) {
            this(th);
        }

        private write(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    private serializeFilteredFields() {
    }

    public static _writeNullKeyedEntry AudioAttributesCompatParcelizer() throws write {
        return read(MimeTypes.AUDIO_RAW);
    }

    private static _writeNullKeyedEntry read(String str) throws write {
        List<_writeNullKeyedEntry> listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str, false, false);
        if (listRemoteActionCompatParcelizer.isEmpty()) {
            return null;
        }
        return listRemoteActionCompatParcelizer.get(0);
    }

    public static List<_writeNullKeyedEntry> RemoteActionCompatParcelizer(String str, boolean z, boolean z2) throws write {
        RemoteActionCompatParcelizer readVar;
        synchronized (serializeFilteredFields.class) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(str, z, z2);
            HashMap<AudioAttributesCompatParcelizer, List<_writeNullKeyedEntry>> map = RemoteActionCompatParcelizer;
            List<_writeNullKeyedEntry> list = map.get(audioAttributesCompatParcelizer);
            if (list != null) {
                return list;
            }
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 21) {
                readVar = new IconCompatParcelizer(z, z2);
            } else {
                readVar = new read();
            }
            ArrayList<_writeNullKeyedEntry> arrayListRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(audioAttributesCompatParcelizer, readVar);
            if (z && arrayListRemoteActionCompatParcelizer.isEmpty() && 21 <= LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver && LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver <= 23) {
                arrayListRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(audioAttributesCompatParcelizer, new read());
                if (!arrayListRemoteActionCompatParcelizer.isEmpty()) {
                    StringBuilder sb = new StringBuilder("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(arrayListRemoteActionCompatParcelizer.get(0).MediaBrowserCompatCustomActionResultReceiver);
                    prune.RemoteActionCompatParcelizer("MediaCodecUtil", sb.toString());
                }
            }
            read(str, arrayListRemoteActionCompatParcelizer);
            initExtraTracks initextratracksWrite = initExtraTracks.write(arrayListRemoteActionCompatParcelizer);
            map.put(audioAttributesCompatParcelizer, initextratracksWrite);
            return initextratracksWrite;
        }
    }

    public static List<_writeNullKeyedEntry> write(serializeFilteredAnyProperties serializefilteredanyproperties, C0170format c0170format, boolean z, boolean z2) throws write {
        List<_writeNullKeyedEntry> listWrite = serializefilteredanyproperties.write(c0170format.onPlayFromUri, z, z2);
        return initExtraTracks.MediaBrowserCompatCustomActionResultReceiver().RemoteActionCompatParcelizer(listWrite).RemoteActionCompatParcelizer(IconCompatParcelizer(serializefilteredanyproperties, c0170format, z, z2)).IconCompatParcelizer();
    }

    public static List<_writeNullKeyedEntry> IconCompatParcelizer(serializeFilteredAnyProperties serializefilteredanyproperties, C0170format c0170format, boolean z, boolean z2) throws write {
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(c0170format);
        if (strRemoteActionCompatParcelizer == null) {
            return initExtraTracks.AudioAttributesImplApi26Parcelizer();
        }
        return serializefilteredanyproperties.write(strRemoteActionCompatParcelizer, z, z2);
    }

    public static List<_writeNullKeyedEntry> read(List<_writeNullKeyedEntry> list, final C0170format c0170format) {
        ArrayList arrayList = new ArrayList(list);
        AudioAttributesCompatParcelizer(arrayList, new AudioAttributesImplApi21Parcelizer() { // from class: o.NumberSerializer
            @Override // o.serializeFilteredFields.AudioAttributesImplApi21Parcelizer
            public final int write(Object obj) {
                return serializeFilteredFields.AudioAttributesCompatParcelizer(c0170format, (_writeNullKeyedEntry) obj);
            }
        });
        return arrayList;
    }

    static /* synthetic */ int AudioAttributesCompatParcelizer(C0170format c0170format, _writeNullKeyedEntry _writenullkeyedentry) {
        return _writenullkeyedentry.read(c0170format) ? 1 : 0;
    }

    public static int write() throws write {
        if (AudioAttributesCompatParcelizer == -1) {
            _writeNullKeyedEntry _writenullkeyedentry = read(MimeTypes.VIDEO_H264);
            int iMax = 0;
            if (_writenullkeyedentry != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrAudioAttributesCompatParcelizer = _writenullkeyedentry.AudioAttributesCompatParcelizer();
                int length = codecProfileLevelArrAudioAttributesCompatParcelizer.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(RemoteActionCompatParcelizer(codecProfileLevelArrAudioAttributesCompatParcelizer[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 21 ? 345600 : 172800);
            }
            AudioAttributesCompatParcelizer = iMax;
        }
        return AudioAttributesCompatParcelizer;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> write(kotlin.C0170format r5) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeFilteredFields.write(o.format):android.util.Pair");
    }

    public static String RemoteActionCompatParcelizer(C0170format c0170format) {
        Pair<Integer, Integer> pairWrite;
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(c0170format.onPlayFromUri)) {
            return MimeTypes.AUDIO_E_AC3;
        }
        if (!MimeTypes.VIDEO_DOLBY_VISION.equals(c0170format.onPlayFromUri) || (pairWrite = write(c0170format)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairWrite.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return MimeTypes.VIDEO_H265;
        }
        if (iIntValue == 512) {
            return MimeTypes.VIDEO_H264;
        }
        if (iIntValue == 1024) {
            return MimeTypes.VIDEO_AV1;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0102 A[Catch: Exception -> 0x0151, TRY_ENTER, TryCatch #5 {Exception -> 0x0151, blocks: (B:3:0x0008, B:5:0x001a, B:8:0x002c, B:11:0x0037, B:55:0x00fa, B:58:0x0102, B:60:0x0108, B:61:0x0122, B:62:0x0145), top: B:78:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0122 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList<kotlin._writeNullKeyedEntry> RemoteActionCompatParcelizer(o.serializeFilteredFields.AudioAttributesCompatParcelizer r24, o.serializeFilteredFields.RemoteActionCompatParcelizer r25) throws o.serializeFilteredFields.write {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeFilteredFields.RemoteActionCompatParcelizer(o.serializeFilteredFields$AudioAttributesCompatParcelizer, o.serializeFilteredFields$RemoteActionCompatParcelizer):java.util.ArrayList");
    }

    private static String read(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals(MimeTypes.VIDEO_DOLBY_VISION)) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals(MimeTypes.AUDIO_ALAC) && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals(MimeTypes.AUDIO_FLAC) && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals(MimeTypes.AUDIO_AC3) && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    private static boolean write(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(LaissezFaireSubTypeValidator.read) && (LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer.startsWith("zeroflte") || LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer.startsWith("zerolte") || LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer.startsWith("zenlte") || "SC-05G".equals(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer) || "marinelteatt".equals(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer) || "404SC".equals(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer) || "SC-04G".equals(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer) || "SCV31".equals(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer)))) {
            return false;
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver == 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(LaissezFaireSubTypeValidator.read) && (LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer.startsWith("d2") || LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer.startsWith("serrano") || LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer.startsWith("jflte") || LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer.startsWith("santos") || LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer.startsWith("t0"))) {
            return false;
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver == 19 && LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver <= 23 && MimeTypes.AUDIO_E_AC3_JOC.equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    private static void read(String str, List<_writeNullKeyedEntry> list) {
        if (MimeTypes.AUDIO_RAW.equals(str)) {
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 26 && LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer.equals("R9") && list.size() == 1 && list.get(0).MediaBrowserCompatCustomActionResultReceiver.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(_writeNullKeyedEntry.IconCompatParcelizer("OMX.google.raw.decoder", MimeTypes.AUDIO_RAW, MimeTypes.AUDIO_RAW, null, false, true, false, false));
            }
            AudioAttributesCompatParcelizer(list, new AudioAttributesImplApi21Parcelizer() { // from class: o.bigDecimalAsStringSerializer
                @Override // o.serializeFilteredFields.AudioAttributesImplApi21Parcelizer
                public final int write(Object obj) {
                    return serializeFilteredFields.IconCompatParcelizer((_writeNullKeyedEntry) obj);
                }
            });
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 21 && list.size() > 1) {
            String str2 = list.get(0).MediaBrowserCompatCustomActionResultReceiver;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                AudioAttributesCompatParcelizer(list, new AudioAttributesImplApi21Parcelizer() { // from class: o.serializeWithoutTypeInfo
                    @Override // o.serializeFilteredFields.AudioAttributesImplApi21Parcelizer
                    public final int write(Object obj) {
                        return serializeFilteredFields.read((_writeNullKeyedEntry) obj);
                    }
                });
            }
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).MediaBrowserCompatCustomActionResultReceiver)) {
            return;
        }
        list.add(list.remove(0));
    }

    static /* synthetic */ int IconCompatParcelizer(_writeNullKeyedEntry _writenullkeyedentry) {
        String str = _writenullkeyedentry.MediaBrowserCompatCustomActionResultReceiver;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    static /* synthetic */ int read(_writeNullKeyedEntry _writenullkeyedentry) {
        return _writenullkeyedentry.MediaBrowserCompatCustomActionResultReceiver.startsWith("OMX.google") ? 1 : 0;
    }

    private static boolean IconCompatParcelizer(MediaCodecInfo mediaCodecInfo) {
        return LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 29 && RemoteActionCompatParcelizer(mediaCodecInfo);
    }

    private static boolean RemoteActionCompatParcelizer(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean write(MediaCodecInfo mediaCodecInfo, String str) {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 29) {
            return AudioAttributesCompatParcelizer(mediaCodecInfo);
        }
        return !RemoteActionCompatParcelizer(mediaCodecInfo, str);
    }

    private static boolean AudioAttributesCompatParcelizer(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean RemoteActionCompatParcelizer(MediaCodecInfo mediaCodecInfo, String str) {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 29) {
            return read(mediaCodecInfo);
        }
        if (DefaultBaseTypeLimitingValidator.AudioAttributesImplApi21Parcelizer(str)) {
            return true;
        }
        String str2 = parseMdhd.read(mediaCodecInfo.getName());
        if (str2.startsWith("arc.")) {
            return false;
        }
        return str2.startsWith("omx.google.") || str2.startsWith("omx.ffmpeg.") || (str2.startsWith("omx.sec.") && str2.contains(".sw.")) || str2.equals("omx.qcom.video.decoder.hevcswvdec") || str2.startsWith("c2.android.") || str2.startsWith("c2.google.") || !(str2.startsWith("omx.") || str2.startsWith("c2."));
    }

    private static boolean read(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean write(MediaCodecInfo mediaCodecInfo) {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 29) {
            return MediaBrowserCompatItemReceiver(mediaCodecInfo);
        }
        String str = parseMdhd.read(mediaCodecInfo.getName());
        return (str.startsWith("omx.google.") || str.startsWith("c2.android.") || str.startsWith("c2.google.")) ? false : true;
    }

    private static boolean MediaBrowserCompatItemReceiver(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    private static Pair<Integer, Integer> IconCompatParcelizer(String str, String[] strArr) {
        if (strArr.length < 3) {
            prune.RemoteActionCompatParcelizer("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: ".concat(String.valueOf(str)));
            return null;
        }
        Matcher matcher = read.matcher(strArr[1]);
        if (!matcher.matches()) {
            prune.RemoteActionCompatParcelizer("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: ".concat(String.valueOf(str)));
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numWrite = write(strGroup);
        if (numWrite == null) {
            prune.RemoteActionCompatParcelizer("MediaCodecUtil", "Unknown Dolby Vision profile string: ".concat(String.valueOf(strGroup)));
            return null;
        }
        String str2 = strArr[2];
        Integer numRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str2);
        if (numRemoteActionCompatParcelizer == null) {
            prune.RemoteActionCompatParcelizer("MediaCodecUtil", "Unknown Dolby Vision level string: ".concat(String.valueOf(str2)));
            return null;
        }
        return new Pair<>(numWrite, numRemoteActionCompatParcelizer);
    }

    private static Pair<Integer, Integer> read(String str, String[] strArr, keyFormat keyformat) {
        if (strArr.length < 4) {
            prune.RemoteActionCompatParcelizer("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        int i = 1;
        Matcher matcher = read.matcher(strArr[1]);
        if (!matcher.matches()) {
            prune.RemoteActionCompatParcelizer("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        String strGroup = matcher.group(1);
        if (!IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(strGroup)) {
            if ("2".equals(strGroup)) {
                i = (keyformat == null || keyformat.AudioAttributesCompatParcelizer != 6) ? 2 : 4096;
            } else {
                prune.RemoteActionCompatParcelizer("MediaCodecUtil", "Unknown HEVC profile string: ".concat(String.valueOf(strGroup)));
                return null;
            }
        }
        String str2 = strArr[3];
        Integer numIconCompatParcelizer = IconCompatParcelizer(str2);
        if (numIconCompatParcelizer == null) {
            prune.RemoteActionCompatParcelizer("MediaCodecUtil", "Unknown HEVC level string: ".concat(String.valueOf(str2)));
            return null;
        }
        return new Pair<>(Integer.valueOf(i), numIconCompatParcelizer);
    }

    private static Pair<Integer, Integer> RemoteActionCompatParcelizer(String str, String[] strArr) {
        int i;
        int i2;
        if (strArr.length < 2) {
            prune.RemoteActionCompatParcelizer("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i2 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i = Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                int i3 = Integer.parseInt(strArr[1]);
                i = Integer.parseInt(strArr[2]);
                i2 = i3;
            } else {
                StringBuilder sb = new StringBuilder("Ignoring malformed AVC codec string: ");
                sb.append(str);
                prune.RemoteActionCompatParcelizer("MediaCodecUtil", sb.toString());
                return null;
            }
            int i4 = read(i2);
            if (i4 == -1) {
                prune.RemoteActionCompatParcelizer("MediaCodecUtil", "Unknown AVC profile: ".concat(String.valueOf(i2)));
                return null;
            }
            int iWrite = write(i);
            if (iWrite == -1) {
                prune.RemoteActionCompatParcelizer("MediaCodecUtil", "Unknown AVC level: ".concat(String.valueOf(i)));
                return null;
            }
            return new Pair<>(Integer.valueOf(i4), Integer.valueOf(iWrite));
        } catch (NumberFormatException unused) {
            prune.RemoteActionCompatParcelizer("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
    }

    private static Pair<Integer, Integer> write(String str, String[] strArr) {
        if (strArr.length < 3) {
            prune.RemoteActionCompatParcelizer("MediaCodecUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str)));
            return null;
        }
        try {
            int i = Integer.parseInt(strArr[1]);
            int i2 = Integer.parseInt(strArr[2]);
            int iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(i);
            if (iAudioAttributesImplBaseParcelizer == -1) {
                prune.RemoteActionCompatParcelizer("MediaCodecUtil", "Unknown VP9 profile: ".concat(String.valueOf(i)));
                return null;
            }
            int iMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(i2);
            if (iMediaBrowserCompatCustomActionResultReceiver == -1) {
                prune.RemoteActionCompatParcelizer("MediaCodecUtil", "Unknown VP9 level: ".concat(String.valueOf(i2)));
                return null;
            }
            return new Pair<>(Integer.valueOf(iAudioAttributesImplBaseParcelizer), Integer.valueOf(iMediaBrowserCompatCustomActionResultReceiver));
        } catch (NumberFormatException unused) {
            prune.RemoteActionCompatParcelizer("MediaCodecUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str)));
            return null;
        }
    }

    private static Pair<Integer, Integer> RemoteActionCompatParcelizer(String str, String[] strArr, keyFormat keyformat) {
        if (strArr.length < 4) {
            prune.RemoteActionCompatParcelizer("MediaCodecUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str)));
            return null;
        }
        int i = 1;
        try {
            int i2 = Integer.parseInt(strArr[1]);
            int i3 = Integer.parseInt(strArr[2].substring(0, 2));
            int i4 = Integer.parseInt(strArr[3]);
            if (i2 != 0) {
                prune.RemoteActionCompatParcelizer("MediaCodecUtil", "Unknown AV1 profile: ".concat(String.valueOf(i2)));
                return null;
            }
            if (i4 != 8 && i4 != 10) {
                prune.RemoteActionCompatParcelizer("MediaCodecUtil", "Unknown AV1 bit depth: ".concat(String.valueOf(i4)));
                return null;
            }
            if (i4 != 8) {
                i = (keyformat == null || !(keyformat.MediaBrowserCompatCustomActionResultReceiver != null || keyformat.AudioAttributesCompatParcelizer == 7 || keyformat.AudioAttributesCompatParcelizer == 6)) ? 2 : 4096;
            }
            int iIconCompatParcelizer = IconCompatParcelizer(i3);
            if (iIconCompatParcelizer == -1) {
                prune.RemoteActionCompatParcelizer("MediaCodecUtil", "Unknown AV1 level: ".concat(String.valueOf(i3)));
                return null;
            }
            return new Pair<>(Integer.valueOf(i), Integer.valueOf(iIconCompatParcelizer));
        } catch (NumberFormatException unused) {
            prune.RemoteActionCompatParcelizer("MediaCodecUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str)));
            return null;
        }
    }

    private static Pair<Integer, Integer> read(String str, String[] strArr) {
        int iAudioAttributesCompatParcelizer;
        if (strArr.length != 3) {
            prune.RemoteActionCompatParcelizer("MediaCodecUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str)));
            return null;
        }
        try {
            if (MimeTypes.AUDIO_AAC.equals(DefaultBaseTypeLimitingValidator.RemoteActionCompatParcelizer(Integer.parseInt(strArr[1], 16))) && (iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(iAudioAttributesCompatParcelizer), 0);
            }
        } catch (NumberFormatException unused) {
            prune.RemoteActionCompatParcelizer("MediaCodecUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str)));
        }
        return null;
    }

    private static <T> void AudioAttributesCompatParcelizer(List<T> list, final AudioAttributesImplApi21Parcelizer<T> audioAttributesImplApi21Parcelizer) {
        Collections.sort(list, new Comparator() { // from class: o.MapSerializer1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return serializeFilteredFields.read(audioAttributesImplApi21Parcelizer, obj, obj2);
            }
        });
    }

    static /* synthetic */ int read(AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer, Object obj, Object obj2) {
        return audioAttributesImplApi21Parcelizer.write(obj2) - audioAttributesImplApi21Parcelizer.write(obj);
    }

    static final class IconCompatParcelizer implements RemoteActionCompatParcelizer {
        private final int IconCompatParcelizer;
        private MediaCodecInfo[] RemoteActionCompatParcelizer;

        @Override // o.serializeFilteredFields.RemoteActionCompatParcelizer
        public final boolean AudioAttributesCompatParcelizer() {
            return true;
        }

        public IconCompatParcelizer(boolean z, boolean z2) {
            this.IconCompatParcelizer = (z || z2) ? 1 : 0;
        }

        @Override // o.serializeFilteredFields.RemoteActionCompatParcelizer
        public final int write() {
            read();
            return this.RemoteActionCompatParcelizer.length;
        }

        @Override // o.serializeFilteredFields.RemoteActionCompatParcelizer
        public final MediaCodecInfo AudioAttributesCompatParcelizer(int i) {
            read();
            return this.RemoteActionCompatParcelizer[i];
        }

        @Override // o.serializeFilteredFields.RemoteActionCompatParcelizer
        public final boolean AudioAttributesCompatParcelizer(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // o.serializeFilteredFields.RemoteActionCompatParcelizer
        public final boolean RemoteActionCompatParcelizer(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        private void read() {
            if (this.RemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = new MediaCodecList(this.IconCompatParcelizer).getCodecInfos();
            }
        }
    }

    static final class read implements RemoteActionCompatParcelizer {
        @Override // o.serializeFilteredFields.RemoteActionCompatParcelizer
        public final boolean AudioAttributesCompatParcelizer() {
            return false;
        }

        @Override // o.serializeFilteredFields.RemoteActionCompatParcelizer
        public final boolean RemoteActionCompatParcelizer(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        private read() {
        }

        @Override // o.serializeFilteredFields.RemoteActionCompatParcelizer
        public final int write() {
            return MediaCodecList.getCodecCount();
        }

        @Override // o.serializeFilteredFields.RemoteActionCompatParcelizer
        public final MediaCodecInfo AudioAttributesCompatParcelizer(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // o.serializeFilteredFields.RemoteActionCompatParcelizer
        public final boolean AudioAttributesCompatParcelizer(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && MimeTypes.VIDEO_H264.equals(str2);
        }
    }

    static final class AudioAttributesCompatParcelizer {
        public final boolean AudioAttributesCompatParcelizer;
        public final boolean RemoteActionCompatParcelizer;
        public final String read;

        public AudioAttributesCompatParcelizer(String str, boolean z, boolean z2) {
            this.read = str;
            this.RemoteActionCompatParcelizer = z;
            this.AudioAttributesCompatParcelizer = z2;
        }

        public final int hashCode() {
            int iHashCode = this.read.hashCode();
            return ((((iHashCode + 31) * 31) + (this.RemoteActionCompatParcelizer ? 1231 : 1237)) * 31) + (this.AudioAttributesCompatParcelizer ? 1231 : 1237);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != AudioAttributesCompatParcelizer.class) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) obj;
            return TextUtils.equals(this.read, audioAttributesCompatParcelizer.read) && this.RemoteActionCompatParcelizer == audioAttributesCompatParcelizer.RemoteActionCompatParcelizer && this.AudioAttributesCompatParcelizer == audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Integer IconCompatParcelizer(java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeFilteredFields.IconCompatParcelizer(java.lang.String):java.lang.Integer");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Integer write(java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeFilteredFields.write(java.lang.String):java.lang.Integer");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Integer RemoteActionCompatParcelizer(java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeFilteredFields.RemoteActionCompatParcelizer(java.lang.String):java.lang.Integer");
    }
}
