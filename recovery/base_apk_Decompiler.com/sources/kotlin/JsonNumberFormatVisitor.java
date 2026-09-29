package kotlin;

import android.net.Uri;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonNumberFormatVisitor {
    public static int IconCompatParcelizer(Map<String, List<String>> map) {
        List<String> list = map.get(RtspHeaders.CONTENT_TYPE);
        return RemoteActionCompatParcelizer((list == null || list.isEmpty()) ? null : list.get(0));
    }

    public static int RemoteActionCompatParcelizer(String str) {
        byte b;
        if (str == null) {
            return -1;
        }
        String strMediaMetadataCompat = DefaultBaseTypeLimitingValidator.MediaMetadataCompat(str);
        strMediaMetadataCompat.hashCode();
        switch (strMediaMetadataCompat.hashCode()) {
            case -2123537834:
                b = !strMediaMetadataCompat.equals(MimeTypes.AUDIO_E_AC3_JOC) ? (byte) -1 : (byte) 0;
                break;
            case -1662384011:
                b = !strMediaMetadataCompat.equals(MimeTypes.VIDEO_PS) ? (byte) -1 : (byte) 1;
                break;
            case -1662384007:
                b = !strMediaMetadataCompat.equals(MimeTypes.VIDEO_MP2T) ? (byte) -1 : (byte) 2;
                break;
            case -1662095187:
                b = !strMediaMetadataCompat.equals(MimeTypes.VIDEO_WEBM) ? (byte) -1 : (byte) 3;
                break;
            case -1606874997:
                b = !strMediaMetadataCompat.equals(MimeTypes.AUDIO_AMR_WB) ? (byte) -1 : (byte) 4;
                break;
            case -1487656890:
                b = !strMediaMetadataCompat.equals("image/avif") ? (byte) -1 : (byte) 5;
                break;
            case -1487464693:
                b = !strMediaMetadataCompat.equals(MimeTypes.IMAGE_HEIC) ? (byte) -1 : (byte) 6;
                break;
            case -1487464690:
                b = !strMediaMetadataCompat.equals(MimeTypes.IMAGE_HEIF) ? (byte) -1 : (byte) 7;
                break;
            case -1487394660:
                b = !strMediaMetadataCompat.equals(MimeTypes.IMAGE_JPEG) ? (byte) -1 : (byte) 8;
                break;
            case -1487018032:
                b = !strMediaMetadataCompat.equals(MimeTypes.IMAGE_WEBP) ? (byte) -1 : (byte) 9;
                break;
            case -1248337486:
                b = !strMediaMetadataCompat.equals(MimeTypes.APPLICATION_MP4) ? (byte) -1 : (byte) 10;
                break;
            case -1079884372:
                b = !strMediaMetadataCompat.equals(MimeTypes.VIDEO_AVI) ? (byte) -1 : (byte) 11;
                break;
            case -1004728940:
                b = !strMediaMetadataCompat.equals(MimeTypes.TEXT_VTT) ? (byte) -1 : (byte) 12;
                break;
            case -879272239:
                b = !strMediaMetadataCompat.equals("image/bmp") ? (byte) -1 : (byte) 13;
                break;
            case -879258763:
                b = !strMediaMetadataCompat.equals(MimeTypes.IMAGE_PNG) ? (byte) -1 : (byte) 14;
                break;
            case -387023398:
                b = !strMediaMetadataCompat.equals(MimeTypes.AUDIO_MATROSKA) ? (byte) -1 : (byte) 15;
                break;
            case -43467528:
                b = !strMediaMetadataCompat.equals(MimeTypes.APPLICATION_WEBM) ? (byte) -1 : (byte) 16;
                break;
            case 13915911:
                b = !strMediaMetadataCompat.equals(MimeTypes.VIDEO_FLV) ? (byte) -1 : (byte) 17;
                break;
            case 187078296:
                b = !strMediaMetadataCompat.equals(MimeTypes.AUDIO_AC3) ? (byte) -1 : (byte) 18;
                break;
            case 187078297:
                b = !strMediaMetadataCompat.equals(MimeTypes.AUDIO_AC4) ? (byte) -1 : (byte) 19;
                break;
            case 187078669:
                b = !strMediaMetadataCompat.equals(MimeTypes.AUDIO_AMR) ? (byte) -1 : (byte) 20;
                break;
            case 187090232:
                b = !strMediaMetadataCompat.equals(MimeTypes.AUDIO_MP4) ? (byte) -1 : (byte) 21;
                break;
            case 187091926:
                b = !strMediaMetadataCompat.equals(MimeTypes.AUDIO_OGG) ? (byte) -1 : (byte) 22;
                break;
            case 187099443:
                b = !strMediaMetadataCompat.equals(MimeTypes.AUDIO_WAV) ? (byte) -1 : (byte) 23;
                break;
            case 1331848029:
                b = !strMediaMetadataCompat.equals(MimeTypes.VIDEO_MP4) ? (byte) -1 : (byte) 24;
                break;
            case 1503095341:
                b = !strMediaMetadataCompat.equals(MimeTypes.AUDIO_AMR_NB) ? (byte) -1 : (byte) 25;
                break;
            case 1504578661:
                b = !strMediaMetadataCompat.equals(MimeTypes.AUDIO_E_AC3) ? (byte) -1 : (byte) 26;
                break;
            case 1504619009:
                b = !strMediaMetadataCompat.equals(MimeTypes.AUDIO_FLAC) ? (byte) -1 : (byte) 27;
                break;
            case 1504824762:
                b = !strMediaMetadataCompat.equals(MimeTypes.AUDIO_MIDI) ? (byte) -1 : (byte) 28;
                break;
            case 1504831518:
                b = !strMediaMetadataCompat.equals(MimeTypes.AUDIO_MPEG) ? (byte) -1 : (byte) 29;
                break;
            case 1505118770:
                b = !strMediaMetadataCompat.equals(MimeTypes.AUDIO_WEBM) ? (byte) -1 : (byte) 30;
                break;
            case 2039520277:
                b = !strMediaMetadataCompat.equals(MimeTypes.VIDEO_MATROSKA) ? (byte) -1 : (byte) 31;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
        }
        return -1;
    }

    public static int read(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }
}
