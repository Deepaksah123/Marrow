package kotlin;

import android.media.MediaCodecInfo;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.List;
import kotlin.C0170format;
import kotlin.serializeFilteredFields;

/* JADX INFO: loaded from: classes2.dex */
final class serializeTypedFields {
    private static Boolean AudioAttributesCompatParcelizer;

    public static int RemoteActionCompatParcelizer(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 29) {
            return 0;
        }
        Boolean bool = AudioAttributesCompatParcelizer;
        if (bool == null || !bool.booleanValue()) {
            return IconCompatParcelizer.read(videoCapabilities, i, i2, d);
        }
        return 0;
    }

    static final class IconCompatParcelizer {
        public static int read(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
            List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            int i3 = read(supportedPerformancePoints, new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d));
            if (i3 == 1 && serializeTypedFields.AudioAttributesCompatParcelizer == null) {
                Boolean unused = serializeTypedFields.AudioAttributesCompatParcelizer = Boolean.valueOf(write());
                if (serializeTypedFields.AudioAttributesCompatParcelizer.booleanValue()) {
                    return 0;
                }
            }
            return i3;
        }

        private static boolean write() {
            List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 35) {
                return false;
            }
            try {
                C0170format c0170formatIconCompatParcelizer = new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer(MimeTypes.VIDEO_H264).IconCompatParcelizer();
                if (c0170formatIconCompatParcelizer.onPlayFromUri != null) {
                    List<_writeNullKeyedEntry> listWrite = serializeFilteredFields.write(serializeFilteredAnyProperties.AudioAttributesCompatParcelizer, c0170formatIconCompatParcelizer, false, false);
                    for (int i = 0; i < listWrite.size(); i++) {
                        if (listWrite.get(i).RemoteActionCompatParcelizer != null && listWrite.get(i).RemoteActionCompatParcelizer.getVideoCapabilities() != null && (supportedPerformancePoints = listWrite.get(i).RemoteActionCompatParcelizer.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                            return read(supportedPerformancePoints, new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60)) == 1;
                        }
                    }
                }
            } catch (serializeFilteredFields.write unused) {
            }
            return true;
        }

        private static int read(List<MediaCodecInfo.VideoCapabilities.PerformancePoint> list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).covers(performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }
    }
}
