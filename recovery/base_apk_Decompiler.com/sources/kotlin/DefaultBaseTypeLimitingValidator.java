package kotlin;

import android.text.TextUtils;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultBaseTypeLimitingValidator {
    private static final ArrayList<RemoteActionCompatParcelizer> write = new ArrayList<>();
    private static final Pattern IconCompatParcelizer = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    static final class RemoteActionCompatParcelizer {
        public final String IconCompatParcelizer;
        public final int read;
        public final String write;
    }

    public static boolean AudioAttributesImplApi21Parcelizer(String str) {
        return "audio".equals(MediaDescriptionCompat(str));
    }

    public static boolean MediaBrowserCompatItemReceiver(String str) {
        return "video".equals(MediaDescriptionCompat(str));
    }

    public static boolean AudioAttributesImplApi26Parcelizer(String str) {
        return "text".equals(MediaDescriptionCompat(str)) || "application/x-media3-cues".equals(str) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_RAWCC.equals(str) || MimeTypes.APPLICATION_VOBSUB.equals(str) || MimeTypes.APPLICATION_PGS.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str);
    }

    public static boolean AudioAttributesImplBaseParcelizer(String str) {
        return "image".equals(MediaDescriptionCompat(str)) || "application/x-image-uri".equals(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean IconCompatParcelizer(java.lang.String r3, java.lang.String r4) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DefaultBaseTypeLimitingValidator.IconCompatParcelizer(java.lang.String, java.lang.String):boolean");
    }

    public static String read(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver(str)) {
            String strWrite = write(str2);
            if (strWrite != null && MediaBrowserCompatItemReceiver(strWrite)) {
                return strWrite;
            }
        }
        return null;
    }

    public static boolean RemoteActionCompatParcelizer(String str, String str2) {
        return write(str, str2) != null;
    }

    public static String write(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] strArrMediaBrowserCompatCustomActionResultReceiver = LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : strArrMediaBrowserCompatCustomActionResultReceiver) {
            if (str2.equals(write(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static String RemoteActionCompatParcelizer(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver(str)) {
            String strWrite = write(str2);
            if (strWrite != null && AudioAttributesImplApi21Parcelizer(strWrite)) {
                return strWrite;
            }
        }
        return null;
    }

    public static String write(String str) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizerRatingCompat;
        String strRemoteActionCompatParcelizer = null;
        if (str == null) {
            return null;
        }
        String str2 = parseMdhd.read(str.trim());
        if (str2.startsWith("avc1") || str2.startsWith("avc3")) {
            return MimeTypes.VIDEO_H264;
        }
        if (str2.startsWith("hev1") || str2.startsWith("hvc1")) {
            return MimeTypes.VIDEO_H265;
        }
        if (str2.startsWith("dvav") || str2.startsWith("dva1") || str2.startsWith("dvhe") || str2.startsWith("dvh1")) {
            return MimeTypes.VIDEO_DOLBY_VISION;
        }
        if (str2.startsWith("av01")) {
            return MimeTypes.VIDEO_AV1;
        }
        if (str2.startsWith("vp9") || str2.startsWith("vp09")) {
            return MimeTypes.VIDEO_VP9;
        }
        if (str2.startsWith("vp8") || str2.startsWith("vp08")) {
            return MimeTypes.VIDEO_VP8;
        }
        if (str2.startsWith("mp4a")) {
            if (str2.startsWith("mp4a.") && (audioAttributesCompatParcelizerRatingCompat = RatingCompat(str2)) != null) {
                strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(audioAttributesCompatParcelizerRatingCompat.IconCompatParcelizer);
            }
            return strRemoteActionCompatParcelizer == null ? MimeTypes.AUDIO_AAC : strRemoteActionCompatParcelizer;
        }
        if (str2.startsWith("mha1")) {
            return MimeTypes.AUDIO_MPEGH_MHA1;
        }
        if (str2.startsWith("mhm1")) {
            return MimeTypes.AUDIO_MPEGH_MHM1;
        }
        if (str2.startsWith("ac-3") || str2.startsWith("dac3")) {
            return MimeTypes.AUDIO_AC3;
        }
        if (str2.startsWith("ec-3") || str2.startsWith("dec3")) {
            return MimeTypes.AUDIO_E_AC3;
        }
        if (str2.startsWith(MimeTypes.CODEC_E_AC3_JOC)) {
            return MimeTypes.AUDIO_E_AC3_JOC;
        }
        if (str2.startsWith("ac-4") || str2.startsWith("dac4")) {
            return MimeTypes.AUDIO_AC4;
        }
        if (str2.startsWith("dtsc")) {
            return MimeTypes.AUDIO_DTS;
        }
        if (str2.startsWith("dtse")) {
            return MimeTypes.AUDIO_DTS_EXPRESS;
        }
        if (str2.startsWith("dtsh") || str2.startsWith("dtsl")) {
            return MimeTypes.AUDIO_DTS_HD;
        }
        if (str2.startsWith("dtsx")) {
            return MimeTypes.AUDIO_DTS_X;
        }
        if (str2.startsWith("opus")) {
            return MimeTypes.AUDIO_OPUS;
        }
        if (str2.startsWith("vorbis")) {
            return MimeTypes.AUDIO_VORBIS;
        }
        if (str2.startsWith("flac")) {
            return MimeTypes.AUDIO_FLAC;
        }
        if (str2.startsWith("stpp")) {
            return MimeTypes.APPLICATION_TTML;
        }
        if (str2.startsWith("wvtt")) {
            return MimeTypes.TEXT_VTT;
        }
        if (str2.contains("cea708")) {
            return MimeTypes.APPLICATION_CEA708;
        }
        if (str2.contains("eia608") || str2.contains("cea608")) {
            return MimeTypes.APPLICATION_CEA608;
        }
        return MediaBrowserCompatMediaItem(str2);
    }

    public static String RemoteActionCompatParcelizer(int i) {
        if (i == 32) {
            return MimeTypes.VIDEO_MP4V;
        }
        if (i == 33) {
            return MimeTypes.VIDEO_H264;
        }
        if (i == 35) {
            return MimeTypes.VIDEO_H265;
        }
        if (i == 64) {
            return MimeTypes.AUDIO_AAC;
        }
        if (i == 163) {
            return MimeTypes.VIDEO_VC1;
        }
        if (i == 177) {
            return MimeTypes.VIDEO_VP9;
        }
        if (i == 221) {
            return MimeTypes.AUDIO_VORBIS;
        }
        if (i == 165) {
            return MimeTypes.AUDIO_AC3;
        }
        if (i != 166) {
            switch (i) {
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                    return MimeTypes.VIDEO_MPEG2;
                case 102:
                case 103:
                case 104:
                    return MimeTypes.AUDIO_AAC;
                case 105:
                case 107:
                    return MimeTypes.AUDIO_MPEG;
                case 106:
                    return MimeTypes.VIDEO_MPEG;
                case 108:
                    return MimeTypes.IMAGE_JPEG;
                default:
                    switch (i) {
                        case 169:
                        case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                            return MimeTypes.AUDIO_DTS;
                        case 170:
                        case 171:
                            return MimeTypes.AUDIO_DTS_HD;
                        case 173:
                            return MimeTypes.AUDIO_OPUS;
                        case 174:
                            return MimeTypes.AUDIO_AC4;
                        default:
                            return null;
                    }
            }
        }
        return MimeTypes.AUDIO_E_AC3;
    }

    public static int IconCompatParcelizer(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (AudioAttributesImplApi21Parcelizer(str)) {
            return 1;
        }
        if (MediaBrowserCompatItemReceiver(str)) {
            return 2;
        }
        if (AudioAttributesImplApi26Parcelizer(str)) {
            return 3;
        }
        if (AudioAttributesImplBaseParcelizer(str)) {
            return 4;
        }
        if (MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str)) {
            return 5;
        }
        if (MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) {
            return 6;
        }
        return MediaBrowserCompatSearchResultReceiver(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int read(java.lang.String r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DefaultBaseTypeLimitingValidator.read(java.lang.String, java.lang.String):int");
    }

    public static int AudioAttributesCompatParcelizer(String str) {
        return IconCompatParcelizer(write(str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String MediaMetadataCompat(java.lang.String r6) {
        /*
            if (r6 != 0) goto L4
            r6 = 0
            return r6
        L4:
            java.lang.String r6 = kotlin.parseMdhd.read(r6)
            r6.hashCode()
            int r0 = r6.hashCode()
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -1007807498: goto L4a;
                case -979095690: goto L40;
                case -586683234: goto L36;
                case -432836268: goto L2c;
                case -432836267: goto L22;
                case 187090231: goto L18;
                default: goto L17;
            }
        L17:
            goto L54
        L18:
            java.lang.String r0 = "audio/mp3"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L54
            r0 = r1
            goto L55
        L22:
            java.lang.String r0 = "audio/mpeg-l2"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L54
            r0 = r2
            goto L55
        L2c:
            java.lang.String r0 = "audio/mpeg-l1"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L54
            r0 = r3
            goto L55
        L36:
            java.lang.String r0 = "audio/x-wav"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L54
            r0 = r4
            goto L55
        L40:
            java.lang.String r0 = "application/x-mpegurl"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L54
            r0 = r5
            goto L55
        L4a:
            java.lang.String r0 = "audio/x-flac"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L54
            r0 = 0
            goto L55
        L54:
            r0 = -1
        L55:
            if (r0 == 0) goto L71
            if (r0 == r5) goto L6e
            if (r0 == r4) goto L6b
            if (r0 == r3) goto L68
            if (r0 == r2) goto L65
            if (r0 == r1) goto L62
            return r6
        L62:
            java.lang.String r6 = "audio/mpeg"
            return r6
        L65:
            java.lang.String r6 = "audio/mpeg-L2"
            return r6
        L68:
            java.lang.String r6 = "audio/mpeg-L1"
            return r6
        L6b:
            java.lang.String r6 = "audio/wav"
            return r6
        L6e:
            java.lang.String r6 = "application/x-mpegURL"
            return r6
        L71:
            java.lang.String r6 = "audio/flac"
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DefaultBaseTypeLimitingValidator.MediaMetadataCompat(java.lang.String):java.lang.String");
    }

    public static boolean MediaBrowserCompatCustomActionResultReceiver(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith(MimeTypes.VIDEO_WEBM) || str.startsWith(MimeTypes.AUDIO_WEBM) || str.startsWith(MimeTypes.APPLICATION_WEBM) || str.startsWith(MimeTypes.VIDEO_MATROSKA) || str.startsWith(MimeTypes.AUDIO_MATROSKA) || str.startsWith(MimeTypes.APPLICATION_MATROSKA);
    }

    private static String MediaDescriptionCompat(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    private static String MediaBrowserCompatMediaItem(String str) {
        int size = write.size();
        for (int i = 0; i < size; i++) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = write.get(i);
            if (str.startsWith(remoteActionCompatParcelizer.write)) {
                return remoteActionCompatParcelizer.IconCompatParcelizer;
            }
        }
        return null;
    }

    private static int MediaBrowserCompatSearchResultReceiver(String str) {
        int size = write.size();
        for (int i = 0; i < size; i++) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = write.get(i);
            if (str.equals(remoteActionCompatParcelizer.IconCompatParcelizer)) {
                return remoteActionCompatParcelizer.read;
            }
        }
        return -1;
    }

    private static AudioAttributesCompatParcelizer RatingCompat(String str) {
        Matcher matcher = IconCompatParcelizer.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) buildTypeSerializer.IconCompatParcelizer(matcher.group(1));
        String strGroup = matcher.group(2);
        try {
            return new AudioAttributesCompatParcelizer(Integer.parseInt(str2, 16), strGroup != null ? Integer.parseInt(strGroup) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static final class AudioAttributesCompatParcelizer {
        public final int IconCompatParcelizer;
        public final int RemoteActionCompatParcelizer;

        public AudioAttributesCompatParcelizer(int i, int i2) {
            this.IconCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = i2;
        }

        public final int write() {
            int i = this.RemoteActionCompatParcelizer;
            if (i == 2) {
                return 10;
            }
            if (i == 5) {
                return 11;
            }
            if (i == 29) {
                return 12;
            }
            if (i == 42) {
                return 16;
            }
            if (i != 22) {
                return i != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }
}
