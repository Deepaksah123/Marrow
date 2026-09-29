package kotlin;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.OsConstants;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import kotlin.JacksonAnnotationIntrospector;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.compressors.bzip2.BZip2Constants;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes2.dex */
public final class createEnumNamingStrategyInstance {
    static final int[] AudioAttributesCompatParcelizer;
    private static AudioAttributesCompatParcelizer[][] AudioAttributesImplApi21Parcelizer;
    private static final byte[] AudioAttributesImplApi26Parcelizer;
    private static final AudioAttributesCompatParcelizer[] AudioAttributesImplBaseParcelizer;
    private static int[] IconCompatParcelizer;
    private static int[] MediaBrowserCompatCustomActionResultReceiver;
    private static final boolean MediaBrowserCompatItemReceiver = Log.isLoggable("ExifInterface", 3);
    private static byte[] MediaBrowserCompatMediaItem;
    private static final byte[] MediaBrowserCompatSearchResultReceiver;
    private static final byte[] MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private static final byte[] MediaDescriptionCompat;
    private static byte[] MediaMetadataCompat;
    private static final byte[] RatingCompat;
    static final byte[] RemoteActionCompatParcelizer;
    private static final byte[] handleMediaPlayPauseIfPendingOnHandler;
    private static final byte[] onAddQueueItem;
    private static final byte[] onCommand;
    private static final byte[] onCustomAction;
    private static final byte[] onFastForward;
    private static final byte[] onMediaButtonEvent;
    private static final AudioAttributesCompatParcelizer onPause;
    private static final byte[] onPlay;
    private static final byte[] onPlayFromMediaId;
    private static final HashMap<Integer, Integer> onPlayFromUri;
    private static final HashMap<String, AudioAttributesCompatParcelizer>[] onPrepare;
    private static final HashMap<Integer, AudioAttributesCompatParcelizer>[] onPrepareFromMediaId;
    private static final HashSet<String> onPrepareFromSearch;
    static final String[] read;
    static final Charset write;
    private int MediaSessionCompatResultReceiverWrapper;
    private boolean MediaSessionCompatToken;
    private int ParcelableVolumeInfo;
    private int PlaybackStateCompat;
    private boolean onPlayFromSearch;
    private String onPrepareFromUri;
    private Set<Integer> onRemoveQueueItem;
    private ByteOrder onRemoveQueueItemAt;
    private AssetManager.AssetInputStream onRewind;
    private final HashMap<String, RemoteActionCompatParcelizer>[] onSeekTo;
    private boolean onSetCaptioningEnabled;
    private boolean onSetPlaybackSpeed;
    private int onSetRating;
    private int onSetRepeatMode;
    private boolean onSetShuffleMode;
    private FileDescriptor onSkipToNext;
    private int onSkipToPrevious;
    private int onSkipToQueueItem;
    private byte[] onStop;
    private int setSessionImpl;

    private static boolean AudioAttributesCompatParcelizer(int i) {
        return (i == 4 || i == 9 || i == 13 || i == 14) ? false : true;
    }

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        MediaBrowserCompatCustomActionResultReceiver = new int[]{8, 8, 8};
        IconCompatParcelizer = new int[]{8};
        MediaBrowserCompatMediaItem = new byte[]{-1, -40, -1};
        RatingCompat = new byte[]{102, 116, 121, 112};
        MediaBrowserCompatSearchResultReceiver = new byte[]{109, 105, 102, TarConstants.LF_LINK};
        AudioAttributesImplApi26Parcelizer = new byte[]{104, 101, 105, 99};
        handleMediaPlayPauseIfPendingOnHandler = new byte[]{79, TarConstants.LF_GNUTYPE_LONGNAME, 89, 77, 80, 0};
        onCommand = new byte[]{79, TarConstants.LF_GNUTYPE_LONGNAME, 89, 77, 80, 85, TarConstants.LF_GNUTYPE_SPARSE, 0, 73, 73};
        onMediaButtonEvent = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        onCustomAction = new byte[]{101, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 73, 102};
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new byte[]{73, 72, 68, 82};
        onAddQueueItem = new byte[]{73, 69, 78, 68};
        onPlay = new byte[]{82, 73, 70, 70};
        onFastForward = new byte[]{87, 69, 66, 80};
        onPlayFromMediaId = new byte[]{69, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 73, 70};
        Charset.defaultCharset();
        Charset.defaultCharset();
        Charset.defaultCharset();
        Charset.defaultCharset();
        Charset.defaultCharset();
        read = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        AudioAttributesCompatParcelizer = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        RemoteActionCompatParcelizer = new byte[]{65, TarConstants.LF_GNUTYPE_SPARSE, 67, 73, 73, 0, 0, 0};
        AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr = {new AudioAttributesCompatParcelizer("NewSubfileType", 254, 4), new AudioAttributesCompatParcelizer("SubfileType", 255, 4), new AudioAttributesCompatParcelizer("ImageWidth", 256, 3, 4), new AudioAttributesCompatParcelizer("ImageLength", 257, 3, 4), new AudioAttributesCompatParcelizer("BitsPerSample", BZip2Constants.MAX_ALPHA_SIZE, 3), new AudioAttributesCompatParcelizer("Compression", 259, 3), new AudioAttributesCompatParcelizer("PhotometricInterpretation", 262, 3), new AudioAttributesCompatParcelizer("ImageDescription", 270, 2), new AudioAttributesCompatParcelizer("Make", 271, 2), new AudioAttributesCompatParcelizer("Model", 272, 2), new AudioAttributesCompatParcelizer("StripOffsets", 273, 3, 4), new AudioAttributesCompatParcelizer("Orientation", 274, 3), new AudioAttributesCompatParcelizer("SamplesPerPixel", 277, 3), new AudioAttributesCompatParcelizer("RowsPerStrip", 278, 3, 4), new AudioAttributesCompatParcelizer("StripByteCounts", 279, 3, 4), new AudioAttributesCompatParcelizer("XResolution", 282, 5), new AudioAttributesCompatParcelizer("YResolution", 283, 5), new AudioAttributesCompatParcelizer("PlanarConfiguration", 284, 3), new AudioAttributesCompatParcelizer("ResolutionUnit", 296, 3), new AudioAttributesCompatParcelizer("TransferFunction", 301, 3), new AudioAttributesCompatParcelizer("Software", 305, 2), new AudioAttributesCompatParcelizer("DateTime", 306, 2), new AudioAttributesCompatParcelizer("Artist", 315, 2), new AudioAttributesCompatParcelizer("WhitePoint", 318, 5), new AudioAttributesCompatParcelizer("PrimaryChromaticities", 319, 5), new AudioAttributesCompatParcelizer("SubIFDPointer", 330, 4), new AudioAttributesCompatParcelizer("JPEGInterchangeFormat", 513, 4), new AudioAttributesCompatParcelizer("JPEGInterchangeFormatLength", 514, 4), new AudioAttributesCompatParcelizer("YCbCrCoefficients", 529, 5), new AudioAttributesCompatParcelizer("YCbCrSubSampling", 530, 3), new AudioAttributesCompatParcelizer("YCbCrPositioning", 531, 3), new AudioAttributesCompatParcelizer("ReferenceBlackWhite", 532, 5), new AudioAttributesCompatParcelizer("Copyright", 33432, 2), new AudioAttributesCompatParcelizer("ExifIFDPointer", 34665, 4), new AudioAttributesCompatParcelizer("GPSInfoIFDPointer", 34853, 4), new AudioAttributesCompatParcelizer("SensorTopBorder", 4, 4), new AudioAttributesCompatParcelizer("SensorLeftBorder", 5, 4), new AudioAttributesCompatParcelizer("SensorBottomBorder", 6, 4), new AudioAttributesCompatParcelizer("SensorRightBorder", 7, 4), new AudioAttributesCompatParcelizer("ISO", 23, 3), new AudioAttributesCompatParcelizer("JpgFromRaw", 46, 7), new AudioAttributesCompatParcelizer("Xmp", 700, 1)};
        AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr2 = {new AudioAttributesCompatParcelizer("ExposureTime", 33434, 5), new AudioAttributesCompatParcelizer("FNumber", 33437, 5), new AudioAttributesCompatParcelizer("ExposureProgram", 34850, 3), new AudioAttributesCompatParcelizer("SpectralSensitivity", 34852, 2), new AudioAttributesCompatParcelizer("PhotographicSensitivity", 34855, 3), new AudioAttributesCompatParcelizer("OECF", 34856, 7), new AudioAttributesCompatParcelizer("SensitivityType", 34864, 3), new AudioAttributesCompatParcelizer("StandardOutputSensitivity", 34865, 4), new AudioAttributesCompatParcelizer("RecommendedExposureIndex", 34866, 4), new AudioAttributesCompatParcelizer("ISOSpeed", 34867, 4), new AudioAttributesCompatParcelizer("ISOSpeedLatitudeyyy", 34868, 4), new AudioAttributesCompatParcelizer("ISOSpeedLatitudezzz", 34869, 4), new AudioAttributesCompatParcelizer("ExifVersion", CpioConstants.C_ISNWK, 2), new AudioAttributesCompatParcelizer("DateTimeOriginal", 36867, 2), new AudioAttributesCompatParcelizer("DateTimeDigitized", 36868, 2), new AudioAttributesCompatParcelizer("OffsetTime", 36880, 2), new AudioAttributesCompatParcelizer("OffsetTimeOriginal", 36881, 2), new AudioAttributesCompatParcelizer("OffsetTimeDigitized", 36882, 2), new AudioAttributesCompatParcelizer("ComponentsConfiguration", 37121, 7), new AudioAttributesCompatParcelizer("CompressedBitsPerPixel", 37122, 5), new AudioAttributesCompatParcelizer("ShutterSpeedValue", 37377, 10), new AudioAttributesCompatParcelizer("ApertureValue", 37378, 5), new AudioAttributesCompatParcelizer("BrightnessValue", 37379, 10), new AudioAttributesCompatParcelizer("ExposureBiasValue", 37380, 10), new AudioAttributesCompatParcelizer("MaxApertureValue", 37381, 5), new AudioAttributesCompatParcelizer("SubjectDistance", 37382, 5), new AudioAttributesCompatParcelizer("MeteringMode", 37383, 3), new AudioAttributesCompatParcelizer("LightSource", 37384, 3), new AudioAttributesCompatParcelizer("Flash", 37385, 3), new AudioAttributesCompatParcelizer("FocalLength", 37386, 5), new AudioAttributesCompatParcelizer("SubjectArea", 37396, 3), new AudioAttributesCompatParcelizer("MakerNote", 37500, 7), new AudioAttributesCompatParcelizer("UserComment", 37510, 7), new AudioAttributesCompatParcelizer("SubSecTime", 37520, 2), new AudioAttributesCompatParcelizer("SubSecTimeOriginal", 37521, 2), new AudioAttributesCompatParcelizer("SubSecTimeDigitized", 37522, 2), new AudioAttributesCompatParcelizer("FlashpixVersion", 40960, 7), new AudioAttributesCompatParcelizer("ColorSpace", 40961, 3), new AudioAttributesCompatParcelizer("PixelXDimension", 40962, 3, 4), new AudioAttributesCompatParcelizer("PixelYDimension", 40963, 3, 4), new AudioAttributesCompatParcelizer("RelatedSoundFile", 40964, 2), new AudioAttributesCompatParcelizer("InteroperabilityIFDPointer", 40965, 4), new AudioAttributesCompatParcelizer("FlashEnergy", 41483, 5), new AudioAttributesCompatParcelizer("SpatialFrequencyResponse", 41484, 7), new AudioAttributesCompatParcelizer("FocalPlaneXResolution", 41486, 5), new AudioAttributesCompatParcelizer("FocalPlaneYResolution", 41487, 5), new AudioAttributesCompatParcelizer("FocalPlaneResolutionUnit", 41488, 3), new AudioAttributesCompatParcelizer("SubjectLocation", 41492, 3), new AudioAttributesCompatParcelizer("ExposureIndex", 41493, 5), new AudioAttributesCompatParcelizer("SensingMethod", 41495, 3), new AudioAttributesCompatParcelizer("FileSource", 41728, 7), new AudioAttributesCompatParcelizer("SceneType", 41729, 7), new AudioAttributesCompatParcelizer("CFAPattern", 41730, 7), new AudioAttributesCompatParcelizer("CustomRendered", 41985, 3), new AudioAttributesCompatParcelizer("ExposureMode", 41986, 3), new AudioAttributesCompatParcelizer("WhiteBalance", 41987, 3), new AudioAttributesCompatParcelizer("DigitalZoomRatio", 41988, 5), new AudioAttributesCompatParcelizer("FocalLengthIn35mmFilm", 41989, 3), new AudioAttributesCompatParcelizer("SceneCaptureType", 41990, 3), new AudioAttributesCompatParcelizer("GainControl", 41991, 3), new AudioAttributesCompatParcelizer("Contrast", 41992, 3), new AudioAttributesCompatParcelizer("Saturation", 41993, 3), new AudioAttributesCompatParcelizer("Sharpness", 41994, 3), new AudioAttributesCompatParcelizer("DeviceSettingDescription", 41995, 7), new AudioAttributesCompatParcelizer("SubjectDistanceRange", 41996, 3), new AudioAttributesCompatParcelizer("ImageUniqueID", 42016, 2), new AudioAttributesCompatParcelizer("CameraOwnerName", 42032, 2), new AudioAttributesCompatParcelizer("BodySerialNumber", 42033, 2), new AudioAttributesCompatParcelizer("LensSpecification", 42034, 5), new AudioAttributesCompatParcelizer("LensMake", 42035, 2), new AudioAttributesCompatParcelizer("LensModel", 42036, 2), new AudioAttributesCompatParcelizer("Gamma", 42240, 5), new AudioAttributesCompatParcelizer("DNGVersion", 50706, 1), new AudioAttributesCompatParcelizer("DefaultCropSize", 50720, 3, 4)};
        AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr3 = {new AudioAttributesCompatParcelizer("GPSVersionID", 0, 1), new AudioAttributesCompatParcelizer("GPSLatitudeRef", 1, 2), new AudioAttributesCompatParcelizer("GPSLatitude", 2, 5, 10), new AudioAttributesCompatParcelizer("GPSLongitudeRef", 3, 2), new AudioAttributesCompatParcelizer("GPSLongitude", 4, 5, 10), new AudioAttributesCompatParcelizer("GPSAltitudeRef", 5, 1), new AudioAttributesCompatParcelizer("GPSAltitude", 6, 5), new AudioAttributesCompatParcelizer("GPSTimeStamp", 7, 5), new AudioAttributesCompatParcelizer("GPSSatellites", 8, 2), new AudioAttributesCompatParcelizer("GPSStatus", 9, 2), new AudioAttributesCompatParcelizer("GPSMeasureMode", 10, 2), new AudioAttributesCompatParcelizer("GPSDOP", 11, 5), new AudioAttributesCompatParcelizer("GPSSpeedRef", 12, 2), new AudioAttributesCompatParcelizer("GPSSpeed", 13, 5), new AudioAttributesCompatParcelizer("GPSTrackRef", 14, 2), new AudioAttributesCompatParcelizer("GPSTrack", 15, 5), new AudioAttributesCompatParcelizer("GPSImgDirectionRef", 16, 2), new AudioAttributesCompatParcelizer("GPSImgDirection", 17, 5), new AudioAttributesCompatParcelizer("GPSMapDatum", 18, 2), new AudioAttributesCompatParcelizer("GPSDestLatitudeRef", 19, 2), new AudioAttributesCompatParcelizer("GPSDestLatitude", 20, 5), new AudioAttributesCompatParcelizer("GPSDestLongitudeRef", 21, 2), new AudioAttributesCompatParcelizer("GPSDestLongitude", 22, 5), new AudioAttributesCompatParcelizer("GPSDestBearingRef", 23, 2), new AudioAttributesCompatParcelizer("GPSDestBearing", 24, 5), new AudioAttributesCompatParcelizer("GPSDestDistanceRef", 25, 2), new AudioAttributesCompatParcelizer("GPSDestDistance", 26, 5), new AudioAttributesCompatParcelizer("GPSProcessingMethod", 27, 7), new AudioAttributesCompatParcelizer("GPSAreaInformation", 28, 7), new AudioAttributesCompatParcelizer("GPSDateStamp", 29, 2), new AudioAttributesCompatParcelizer("GPSDifferential", 30, 3), new AudioAttributesCompatParcelizer("GPSHPositioningError", 31, 5)};
        AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr4 = {new AudioAttributesCompatParcelizer("InteroperabilityIndex", 1, 2)};
        AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr5 = {new AudioAttributesCompatParcelizer("NewSubfileType", 254, 4), new AudioAttributesCompatParcelizer("SubfileType", 255, 4), new AudioAttributesCompatParcelizer("ThumbnailImageWidth", 256, 3, 4), new AudioAttributesCompatParcelizer("ThumbnailImageLength", 257, 3, 4), new AudioAttributesCompatParcelizer("BitsPerSample", BZip2Constants.MAX_ALPHA_SIZE, 3), new AudioAttributesCompatParcelizer("Compression", 259, 3), new AudioAttributesCompatParcelizer("PhotometricInterpretation", 262, 3), new AudioAttributesCompatParcelizer("ImageDescription", 270, 2), new AudioAttributesCompatParcelizer("Make", 271, 2), new AudioAttributesCompatParcelizer("Model", 272, 2), new AudioAttributesCompatParcelizer("StripOffsets", 273, 3, 4), new AudioAttributesCompatParcelizer("ThumbnailOrientation", 274, 3), new AudioAttributesCompatParcelizer("SamplesPerPixel", 277, 3), new AudioAttributesCompatParcelizer("RowsPerStrip", 278, 3, 4), new AudioAttributesCompatParcelizer("StripByteCounts", 279, 3, 4), new AudioAttributesCompatParcelizer("XResolution", 282, 5), new AudioAttributesCompatParcelizer("YResolution", 283, 5), new AudioAttributesCompatParcelizer("PlanarConfiguration", 284, 3), new AudioAttributesCompatParcelizer("ResolutionUnit", 296, 3), new AudioAttributesCompatParcelizer("TransferFunction", 301, 3), new AudioAttributesCompatParcelizer("Software", 305, 2), new AudioAttributesCompatParcelizer("DateTime", 306, 2), new AudioAttributesCompatParcelizer("Artist", 315, 2), new AudioAttributesCompatParcelizer("WhitePoint", 318, 5), new AudioAttributesCompatParcelizer("PrimaryChromaticities", 319, 5), new AudioAttributesCompatParcelizer("SubIFDPointer", 330, 4), new AudioAttributesCompatParcelizer("JPEGInterchangeFormat", 513, 4), new AudioAttributesCompatParcelizer("JPEGInterchangeFormatLength", 514, 4), new AudioAttributesCompatParcelizer("YCbCrCoefficients", 529, 5), new AudioAttributesCompatParcelizer("YCbCrSubSampling", 530, 3), new AudioAttributesCompatParcelizer("YCbCrPositioning", 531, 3), new AudioAttributesCompatParcelizer("ReferenceBlackWhite", 532, 5), new AudioAttributesCompatParcelizer("Copyright", 33432, 2), new AudioAttributesCompatParcelizer("ExifIFDPointer", 34665, 4), new AudioAttributesCompatParcelizer("GPSInfoIFDPointer", 34853, 4), new AudioAttributesCompatParcelizer("DNGVersion", 50706, 1), new AudioAttributesCompatParcelizer("DefaultCropSize", 50720, 3, 4)};
        onPause = new AudioAttributesCompatParcelizer("StripOffsets", 273, 3);
        AudioAttributesImplApi21Parcelizer = new AudioAttributesCompatParcelizer[][]{audioAttributesCompatParcelizerArr, audioAttributesCompatParcelizerArr2, audioAttributesCompatParcelizerArr3, audioAttributesCompatParcelizerArr4, audioAttributesCompatParcelizerArr5, audioAttributesCompatParcelizerArr, new AudioAttributesCompatParcelizer[]{new AudioAttributesCompatParcelizer("ThumbnailImage", 256, 7), new AudioAttributesCompatParcelizer("CameraSettingsIFDPointer", 8224, 4), new AudioAttributesCompatParcelizer("ImageProcessingIFDPointer", 8256, 4)}, new AudioAttributesCompatParcelizer[]{new AudioAttributesCompatParcelizer("PreviewImageStart", 257, 4), new AudioAttributesCompatParcelizer("PreviewImageLength", BZip2Constants.MAX_ALPHA_SIZE, 4)}, new AudioAttributesCompatParcelizer[]{new AudioAttributesCompatParcelizer("AspectFrame", 4371, 3)}, new AudioAttributesCompatParcelizer[]{new AudioAttributesCompatParcelizer("ColorSpace", 55, 3)}};
        AudioAttributesImplBaseParcelizer = new AudioAttributesCompatParcelizer[]{new AudioAttributesCompatParcelizer("SubIFDPointer", 330, 4), new AudioAttributesCompatParcelizer("ExifIFDPointer", 34665, 4), new AudioAttributesCompatParcelizer("GPSInfoIFDPointer", 34853, 4), new AudioAttributesCompatParcelizer("InteroperabilityIFDPointer", 40965, 4), new AudioAttributesCompatParcelizer("CameraSettingsIFDPointer", 8224, 1), new AudioAttributesCompatParcelizer("ImageProcessingIFDPointer", 8256, 1)};
        onPrepareFromMediaId = new HashMap[10];
        onPrepare = new HashMap[10];
        onPrepareFromSearch = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        onPlayFromUri = new HashMap<>();
        Charset charsetForName = Charset.forName(CharsetNames.US_ASCII);
        write = charsetForName;
        MediaMetadataCompat = "Exif\u0000\u0000".getBytes(charsetForName);
        MediaDescriptionCompat = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            AudioAttributesCompatParcelizer[][] audioAttributesCompatParcelizerArr6 = AudioAttributesImplApi21Parcelizer;
            if (i < audioAttributesCompatParcelizerArr6.length) {
                onPrepareFromMediaId[i] = new HashMap<>();
                onPrepare[i] = new HashMap<>();
                for (AudioAttributesCompatParcelizer audioAttributesCompatParcelizer : audioAttributesCompatParcelizerArr6[i]) {
                    onPrepareFromMediaId[i].put(Integer.valueOf(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer), audioAttributesCompatParcelizer);
                    onPrepare[i].put(audioAttributesCompatParcelizer.RemoteActionCompatParcelizer, audioAttributesCompatParcelizer);
                }
                i++;
            } else {
                HashMap<Integer, Integer> map = onPlayFromUri;
                AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr7 = AudioAttributesImplBaseParcelizer;
                map.put(Integer.valueOf(audioAttributesCompatParcelizerArr7[0].AudioAttributesCompatParcelizer), 5);
                map.put(Integer.valueOf(audioAttributesCompatParcelizerArr7[1].AudioAttributesCompatParcelizer), 1);
                map.put(Integer.valueOf(audioAttributesCompatParcelizerArr7[2].AudioAttributesCompatParcelizer), 2);
                map.put(Integer.valueOf(audioAttributesCompatParcelizerArr7[3].AudioAttributesCompatParcelizer), 3);
                map.put(Integer.valueOf(audioAttributesCompatParcelizerArr7[4].AudioAttributesCompatParcelizer), 7);
                map.put(Integer.valueOf(audioAttributesCompatParcelizerArr7[5].AudioAttributesCompatParcelizer), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    static class write {
        public final long AudioAttributesCompatParcelizer;
        public final long write;

        write(long j, long j2) {
            if (j2 == 0) {
                this.AudioAttributesCompatParcelizer = 0L;
                this.write = 1L;
            } else {
                this.AudioAttributesCompatParcelizer = j;
                this.write = j2;
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append("/");
            sb.append(this.write);
            return sb.toString();
        }

        public final double RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer / this.write;
        }
    }

    static class RemoteActionCompatParcelizer {
        public final long AudioAttributesCompatParcelizer;
        public final int RemoteActionCompatParcelizer;
        public final byte[] read;
        public final int write;

        private RemoteActionCompatParcelizer(int i, int i2, byte[] bArr) {
            this(i, i2, -1L, bArr);
        }

        RemoteActionCompatParcelizer(int i, int i2, long j, byte[] bArr) {
            this.RemoteActionCompatParcelizer = i;
            this.write = i2;
            this.AudioAttributesCompatParcelizer = j;
            this.read = bArr;
        }

        private static RemoteActionCompatParcelizer RemoteActionCompatParcelizer(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[createEnumNamingStrategyInstance.AudioAttributesCompatParcelizer[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            int length = iArr.length;
            for (int i = 0; i <= 0; i++) {
                byteBufferWrap.putShort((short) iArr[0]);
            }
            return new RemoteActionCompatParcelizer(3, iArr.length, byteBufferWrap.array());
        }

        public static RemoteActionCompatParcelizer RemoteActionCompatParcelizer(int i, ByteOrder byteOrder) {
            return RemoteActionCompatParcelizer(new int[]{i}, byteOrder);
        }

        private static RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[createEnumNamingStrategyInstance.AudioAttributesCompatParcelizer[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            int length = jArr.length;
            for (int i = 0; i <= 0; i++) {
                byteBufferWrap.putInt((int) jArr[0]);
            }
            return new RemoteActionCompatParcelizer(4, jArr.length, byteBufferWrap.array());
        }

        public static RemoteActionCompatParcelizer read(long j, ByteOrder byteOrder) {
            return AudioAttributesCompatParcelizer(new long[]{j}, byteOrder);
        }

        public static RemoteActionCompatParcelizer RemoteActionCompatParcelizer(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append((char) 0);
            byte[] bytes = sb.toString().getBytes(createEnumNamingStrategyInstance.write);
            return new RemoteActionCompatParcelizer(2, bytes.length, bytes);
        }

        private static RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(write[] writeVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[createEnumNamingStrategyInstance.AudioAttributesCompatParcelizer[5] * writeVarArr.length]);
            byteBufferWrap.order(byteOrder);
            int length = writeVarArr.length;
            for (int i = 0; i <= 0; i++) {
                write writeVar = writeVarArr[0];
                byteBufferWrap.putInt((int) writeVar.AudioAttributesCompatParcelizer);
                byteBufferWrap.putInt((int) writeVar.write);
            }
            return new RemoteActionCompatParcelizer(5, writeVarArr.length, byteBufferWrap.array());
        }

        public static RemoteActionCompatParcelizer RemoteActionCompatParcelizer(write writeVar, ByteOrder byteOrder) {
            return AudioAttributesCompatParcelizer(new write[]{writeVar}, byteOrder);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(createEnumNamingStrategyInstance.read[this.RemoteActionCompatParcelizer]);
            sb.append(", data length:");
            sb.append(this.read.length);
            sb.append(")");
            return sb.toString();
        }

        final Object AudioAttributesCompatParcelizer(ByteOrder byteOrder) throws Throwable {
            read readVar;
            byte b;
            Object str;
            byte b2;
            read readVar2 = null;
            try {
                readVar = new read(this.read);
            } catch (IOException unused) {
                readVar = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                readVar.RemoteActionCompatParcelizer(byteOrder);
                int length = 0;
                switch (this.RemoteActionCompatParcelizer) {
                    case 1:
                    case 6:
                        byte[] bArr = this.read;
                        str = (bArr.length == 1 && (b = bArr[0]) >= 0 && b <= 1) ? new String(new char[]{(char) (b + TarConstants.LF_NORMAL)}) : new String(bArr, createEnumNamingStrategyInstance.write);
                        break;
                    case 2:
                    case 7:
                        if (this.write >= createEnumNamingStrategyInstance.RemoteActionCompatParcelizer.length) {
                            int i = 0;
                            while (true) {
                                if (i >= createEnumNamingStrategyInstance.RemoteActionCompatParcelizer.length) {
                                    length = createEnumNamingStrategyInstance.RemoteActionCompatParcelizer.length;
                                } else if (this.read[i] == createEnumNamingStrategyInstance.RemoteActionCompatParcelizer[i]) {
                                    i++;
                                }
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        while (length < this.write && (b2 = this.read[length]) != 0) {
                            if (b2 >= 32) {
                                sb.append((char) b2);
                            } else {
                                sb.append('?');
                            }
                            length++;
                        }
                        String string = sb.toString();
                        try {
                            readVar.close();
                            break;
                        } catch (IOException unused2) {
                        }
                        return string;
                    case 3:
                        int[] iArr = new int[this.write];
                        while (true) {
                            str = iArr;
                            if (length < this.write) {
                                iArr[length] = readVar.readUnsignedShort();
                                length++;
                            }
                        }
                        break;
                    case 4:
                        long[] jArr = new long[this.write];
                        while (true) {
                            str = jArr;
                            if (length < this.write) {
                                jArr[length] = readVar.IconCompatParcelizer();
                                length++;
                            }
                        }
                        break;
                    case 5:
                        write[] writeVarArr = new write[this.write];
                        while (true) {
                            str = writeVarArr;
                            if (length < this.write) {
                                writeVarArr[length] = new write(readVar.IconCompatParcelizer(), readVar.IconCompatParcelizer());
                                length++;
                            }
                        }
                        break;
                    case 8:
                        int[] iArr2 = new int[this.write];
                        while (true) {
                            str = iArr2;
                            if (length < this.write) {
                                iArr2[length] = readVar.readShort();
                                length++;
                            }
                        }
                        break;
                    case 9:
                        int[] iArr3 = new int[this.write];
                        while (true) {
                            str = iArr3;
                            if (length < this.write) {
                                iArr3[length] = readVar.readInt();
                                length++;
                            }
                        }
                        break;
                    case 10:
                        write[] writeVarArr2 = new write[this.write];
                        while (true) {
                            str = writeVarArr2;
                            if (length < this.write) {
                                writeVarArr2[length] = new write(readVar.readInt(), readVar.readInt());
                                length++;
                            }
                        }
                        break;
                    case 11:
                        double[] dArr = new double[this.write];
                        while (true) {
                            str = dArr;
                            if (length < this.write) {
                                dArr[length] = readVar.readFloat();
                                length++;
                            }
                        }
                        break;
                    case 12:
                        double[] dArr2 = new double[this.write];
                        while (true) {
                            str = dArr2;
                            if (length < this.write) {
                                dArr2[length] = readVar.readDouble();
                                length++;
                            }
                        }
                        break;
                    default:
                        try {
                            readVar.close();
                            break;
                        } catch (IOException unused3) {
                        }
                        return null;
                }
                try {
                    readVar.close();
                } catch (IOException unused4) {
                }
                return str;
            } catch (IOException unused5) {
                if (readVar != null) {
                    try {
                        readVar.close();
                    } catch (IOException unused6) {
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                readVar2 = readVar;
                if (readVar2 != null) {
                    try {
                        readVar2.close();
                    } catch (IOException unused7) {
                    }
                }
                throw th;
            }
        }

        public final double IconCompatParcelizer(ByteOrder byteOrder) throws Throwable {
            Object objAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(byteOrder);
            if (objAudioAttributesCompatParcelizer == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objAudioAttributesCompatParcelizer instanceof String) {
                return Double.parseDouble((String) objAudioAttributesCompatParcelizer);
            }
            if (objAudioAttributesCompatParcelizer instanceof long[]) {
                if (((long[]) objAudioAttributesCompatParcelizer).length == 1) {
                    return r3[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objAudioAttributesCompatParcelizer instanceof int[]) {
                if (((int[]) objAudioAttributesCompatParcelizer).length == 1) {
                    return r3[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objAudioAttributesCompatParcelizer instanceof double[]) {
                double[] dArr = (double[]) objAudioAttributesCompatParcelizer;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objAudioAttributesCompatParcelizer instanceof write[]) {
                write[] writeVarArr = (write[]) objAudioAttributesCompatParcelizer;
                if (writeVarArr.length == 1) {
                    return writeVarArr[0].RemoteActionCompatParcelizer();
                }
                throw new NumberFormatException("There are more than one component");
            }
            throw new NumberFormatException("Couldn't find a double value");
        }

        public final int read(ByteOrder byteOrder) throws Throwable {
            Object objAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(byteOrder);
            if (objAudioAttributesCompatParcelizer == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objAudioAttributesCompatParcelizer instanceof String) {
                return Integer.parseInt((String) objAudioAttributesCompatParcelizer);
            }
            if (objAudioAttributesCompatParcelizer instanceof long[]) {
                long[] jArr = (long[]) objAudioAttributesCompatParcelizer;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objAudioAttributesCompatParcelizer instanceof int[]) {
                int[] iArr = (int[]) objAudioAttributesCompatParcelizer;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            throw new NumberFormatException("Couldn't find a integer value");
        }

        public final String write(ByteOrder byteOrder) throws Throwable {
            Object objAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(byteOrder);
            if (objAudioAttributesCompatParcelizer == null) {
                return null;
            }
            if (objAudioAttributesCompatParcelizer instanceof String) {
                return (String) objAudioAttributesCompatParcelizer;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (objAudioAttributesCompatParcelizer instanceof long[]) {
                long[] jArr = (long[]) objAudioAttributesCompatParcelizer;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objAudioAttributesCompatParcelizer instanceof int[]) {
                int[] iArr = (int[]) objAudioAttributesCompatParcelizer;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objAudioAttributesCompatParcelizer instanceof double[]) {
                double[] dArr = (double[]) objAudioAttributesCompatParcelizer;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objAudioAttributesCompatParcelizer instanceof write[])) {
                return null;
            }
            write[] writeVarArr = (write[]) objAudioAttributesCompatParcelizer;
            while (i < writeVarArr.length) {
                sb.append(writeVarArr[i].AudioAttributesCompatParcelizer);
                sb.append('/');
                sb.append(writeVarArr[i].write);
                i++;
                if (i != writeVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
    }

    static class AudioAttributesCompatParcelizer {
        public final int AudioAttributesCompatParcelizer;
        public final String RemoteActionCompatParcelizer;
        public final int read;
        public final int write;

        AudioAttributesCompatParcelizer(String str, int i, int i2) {
            this.RemoteActionCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = i;
            this.write = i2;
            this.read = -1;
        }

        AudioAttributesCompatParcelizer(String str, int i, int i2, int i3) {
            this.RemoteActionCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = i;
            this.write = i2;
            this.read = i3;
        }

        final boolean RemoteActionCompatParcelizer(int i) {
            int i2;
            int i3 = this.write;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.read) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            return (i3 == 12 || i2 == 12) && i == 11;
        }
    }

    public createEnumNamingStrategyInstance(InputStream inputStream) throws IOException {
        this(inputStream, (byte) 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private createEnumNamingStrategyInstance(java.io.InputStream r3, byte r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r2.<init>()
            o.createEnumNamingStrategyInstance$AudioAttributesCompatParcelizer[][] r4 = kotlin.createEnumNamingStrategyInstance.AudioAttributesImplApi21Parcelizer
            int r0 = r4.length
            java.util.HashMap[] r0 = new java.util.HashMap[r0]
            r2.onSeekTo = r0
            java.util.HashSet r0 = new java.util.HashSet
            int r4 = r4.length
            r0.<init>(r4)
            r2.onRemoveQueueItem = r0
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN
            r2.onRemoveQueueItemAt = r4
            if (r3 == 0) goto L49
            r4 = 0
            r2.onPrepareFromUri = r4
            boolean r0 = r3 instanceof android.content.res.AssetManager.AssetInputStream
            if (r0 == 0) goto L27
            r0 = r3
            android.content.res.AssetManager$AssetInputStream r0 = (android.content.res.AssetManager.AssetInputStream) r0
            r2.onRewind = r0
            r2.onSkipToNext = r4
            goto L45
        L27:
            boolean r0 = r3 instanceof java.io.FileInputStream
            if (r0 == 0) goto L41
            r0 = r3
            java.io.FileInputStream r0 = (java.io.FileInputStream) r0
            java.io.FileDescriptor r1 = r0.getFD()
            boolean r1 = read(r1)
            if (r1 == 0) goto L41
            r2.onRewind = r4
            java.io.FileDescriptor r4 = r0.getFD()
            r2.onSkipToNext = r4
            goto L45
        L41:
            r2.onRewind = r4
            r2.onSkipToNext = r4
        L45:
            r2.write(r3)
            return
        L49:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "inputStream cannot be null"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createEnumNamingStrategyInstance.<init>(java.io.InputStream, byte):void");
    }

    private RemoteActionCompatParcelizer IconCompatParcelizer(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < AudioAttributesImplApi21Parcelizer.length; i++) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.onSeekTo[i].get(str);
            if (remoteActionCompatParcelizer != null) {
                return remoteActionCompatParcelizer;
            }
        }
        return null;
    }

    private String AudioAttributesCompatParcelizer(String str) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = IconCompatParcelizer(str);
        if (remoteActionCompatParcelizerIconCompatParcelizer != null) {
            if (!onPrepareFromSearch.contains(str)) {
                return remoteActionCompatParcelizerIconCompatParcelizer.write(this.onRemoveQueueItemAt);
            }
            if (str.equals("GPSTimeStamp")) {
                if (remoteActionCompatParcelizerIconCompatParcelizer.RemoteActionCompatParcelizer != 5 && remoteActionCompatParcelizerIconCompatParcelizer.RemoteActionCompatParcelizer != 10) {
                    int i = remoteActionCompatParcelizerIconCompatParcelizer.RemoteActionCompatParcelizer;
                    return null;
                }
                write[] writeVarArr = (write[]) remoteActionCompatParcelizerIconCompatParcelizer.AudioAttributesCompatParcelizer(this.onRemoveQueueItemAt);
                if (writeVarArr == null || writeVarArr.length != 3) {
                    Arrays.toString(writeVarArr);
                    return null;
                }
                return String.format("%02d:%02d:%02d", Integer.valueOf((int) (writeVarArr[0].AudioAttributesCompatParcelizer / writeVarArr[0].write)), Integer.valueOf((int) (writeVarArr[1].AudioAttributesCompatParcelizer / writeVarArr[1].write)), Integer.valueOf((int) (writeVarArr[2].AudioAttributesCompatParcelizer / writeVarArr[2].write)));
            }
            try {
                return Double.toString(remoteActionCompatParcelizerIconCompatParcelizer.IconCompatParcelizer(this.onRemoveQueueItemAt));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int write(String str) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = IconCompatParcelizer(str);
        if (remoteActionCompatParcelizerIconCompatParcelizer == null) {
            return 1;
        }
        try {
            return remoteActionCompatParcelizerIconCompatParcelizer.read(this.onRemoveQueueItemAt);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    public final boolean AudioAttributesCompatParcelizer() {
        int iWrite = write("Orientation");
        return iWrite == 2 || iWrite == 7 || iWrite == 4 || iWrite == 5;
    }

    public final int RemoteActionCompatParcelizer() {
        switch (write("Orientation")) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    private void write(InputStream inputStream) throws Throwable {
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i = 0; i < AudioAttributesImplApi21Parcelizer.length; i++) {
            try {
                try {
                    this.onSeekTo[i] = new HashMap<>();
                } catch (IOException | UnsupportedOperationException unused) {
                    boolean z = MediaBrowserCompatItemReceiver;
                    read();
                    if (z) {
                        IconCompatParcelizer();
                        return;
                    }
                    return;
                }
            } finally {
                read();
                if (MediaBrowserCompatItemReceiver) {
                    IconCompatParcelizer();
                }
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iWrite = write(bufferedInputStream);
        this.onSetRepeatMode = iWrite;
        if (AudioAttributesCompatParcelizer(iWrite)) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(bufferedInputStream);
            int i2 = this.onSetRepeatMode;
            if (i2 == 12) {
                read(iconCompatParcelizer);
            } else if (i2 == 7) {
                write(iconCompatParcelizer);
            } else if (i2 == 10) {
                AudioAttributesCompatParcelizer(iconCompatParcelizer);
            } else {
                IconCompatParcelizer(iconCompatParcelizer);
            }
            iconCompatParcelizer.IconCompatParcelizer(this.onSetRating);
            AudioAttributesImplBaseParcelizer(iconCompatParcelizer);
        } else {
            read readVar = new read(bufferedInputStream);
            int i3 = this.onSetRepeatMode;
            if (i3 == 4) {
                read(readVar, 0, 0);
            } else if (i3 == 13) {
                AudioAttributesCompatParcelizer(readVar);
            } else if (i3 == 9) {
                write(readVar);
            } else if (i3 == 14) {
                IconCompatParcelizer(readVar);
            }
        }
    }

    private static boolean read(FileDescriptor fileDescriptor) {
        try {
            JacksonAnnotationIntrospector.RemoteActionCompatParcelizer.write(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private void IconCompatParcelizer() throws Throwable {
        for (int i = 0; i < this.onSeekTo.length; i++) {
            this.onSeekTo[i].size();
            for (Map.Entry<String, RemoteActionCompatParcelizer> entry : this.onSeekTo[i].entrySet()) {
                RemoteActionCompatParcelizer value = entry.getValue();
                entry.getKey();
                value.toString();
                value.write(this.onRemoveQueueItemAt);
            }
        }
    }

    private int write(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (IconCompatParcelizer(bArr)) {
            return 4;
        }
        if (AudioAttributesCompatParcelizer(bArr)) {
            return 9;
        }
        if (write(bArr)) {
            return 12;
        }
        if (read(bArr)) {
            return 7;
        }
        if (AudioAttributesImplBaseParcelizer(bArr)) {
            return 10;
        }
        if (RemoteActionCompatParcelizer(bArr)) {
            return 13;
        }
        return MediaBrowserCompatItemReceiver(bArr) ? 14 : 0;
    }

    private static boolean IconCompatParcelizer(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = MediaBrowserCompatMediaItem;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    private static boolean AudioAttributesCompatParcelizer(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    private static boolean write(byte[] bArr) throws Throwable {
        long j;
        read readVar = null;
        try {
            read readVar2 = new read(bArr);
            try {
                long j2 = readVar2.readInt();
                byte[] bArr2 = new byte[4];
                readVar2.read(bArr2);
                if (!Arrays.equals(bArr2, RatingCompat)) {
                    readVar2.close();
                    return false;
                }
                if (j2 == 1) {
                    j2 = readVar2.readLong();
                    j = 16;
                    if (j2 < 16) {
                        readVar2.close();
                        return false;
                    }
                } else {
                    j = 8;
                }
                int length = bArr.length;
                if (j2 > 5000) {
                    int length2 = bArr.length;
                    j2 = 5000;
                }
                long j3 = j2 - j;
                if (j3 < 8) {
                    readVar2.close();
                    return false;
                }
                byte[] bArr3 = new byte[4];
                boolean z = false;
                boolean z2 = false;
                for (long j4 = 0; j4 < j3 / 4; j4++) {
                    if (readVar2.read(bArr3) != 4) {
                        readVar2.close();
                        return false;
                    }
                    if (j4 != 1) {
                        if (Arrays.equals(bArr3, MediaBrowserCompatSearchResultReceiver)) {
                            z2 = true;
                        } else if (Arrays.equals(bArr3, AudioAttributesImplApi26Parcelizer)) {
                            z = true;
                        }
                        if (z2 && z) {
                            readVar2.close();
                            return true;
                        }
                    }
                }
                readVar2.close();
            } catch (Exception unused) {
                readVar = readVar2;
                if (readVar != null) {
                    readVar.close();
                }
            } catch (Throwable th) {
                th = th;
                readVar = readVar2;
                if (readVar != null) {
                    readVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        return false;
    }

    private boolean read(byte[] bArr) throws Throwable {
        read readVar = null;
        try {
            read readVar2 = new read(bArr);
            try {
                ByteOrder byteOrderRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(readVar2);
                this.onRemoveQueueItemAt = byteOrderRemoteActionCompatParcelizer;
                readVar2.RemoteActionCompatParcelizer(byteOrderRemoteActionCompatParcelizer);
                short s = readVar2.readShort();
                boolean z = s == 20306 || s == 21330;
                readVar2.close();
                return z;
            } catch (Exception unused) {
                readVar = readVar2;
                if (readVar != null) {
                    readVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                readVar = readVar2;
                if (readVar != null) {
                    readVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean AudioAttributesImplBaseParcelizer(byte[] bArr) throws Throwable {
        read readVar = null;
        try {
            read readVar2 = new read(bArr);
            try {
                ByteOrder byteOrderRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(readVar2);
                this.onRemoveQueueItemAt = byteOrderRemoteActionCompatParcelizer;
                readVar2.RemoteActionCompatParcelizer(byteOrderRemoteActionCompatParcelizer);
                boolean z = readVar2.readShort() == 85;
                readVar2.close();
                return z;
            } catch (Exception unused) {
                readVar = readVar2;
                if (readVar != null) {
                    readVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                readVar = readVar2;
                if (readVar != null) {
                    readVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean RemoteActionCompatParcelizer(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = onMediaButtonEvent;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    private static boolean MediaBrowserCompatItemReceiver(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = onPlay;
            if (i >= bArr2.length) {
                int i2 = 0;
                while (true) {
                    byte[] bArr3 = onFastForward;
                    if (i2 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[onPlay.length + i2 + 4] != bArr3[i2]) {
                        return false;
                    }
                    i2++;
                }
            } else {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0068 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012e A[LOOP:0: B:10:0x0024->B:63:0x012e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0135 A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1091)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void read(o.createEnumNamingStrategyInstance.read r21, int r22, int r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createEnumNamingStrategyInstance.read(o.createEnumNamingStrategyInstance$read, int, int):void");
    }

    private void IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) throws Throwable {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        read((read) iconCompatParcelizer);
        read(iconCompatParcelizer, 0);
        write(iconCompatParcelizer, 0);
        write(iconCompatParcelizer, 5);
        write(iconCompatParcelizer, 4);
        write();
        if (this.onSetRepeatMode != 8 || (remoteActionCompatParcelizer = this.onSeekTo[1].get("MakerNote")) == null) {
            return;
        }
        IconCompatParcelizer iconCompatParcelizer2 = new IconCompatParcelizer(remoteActionCompatParcelizer.read);
        iconCompatParcelizer2.RemoteActionCompatParcelizer(this.onRemoveQueueItemAt);
        iconCompatParcelizer2.IconCompatParcelizer(6);
        read(iconCompatParcelizer2, 9);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.onSeekTo[9].get("ColorSpace");
        if (remoteActionCompatParcelizer2 != null) {
            this.onSeekTo[1].put("ColorSpace", remoteActionCompatParcelizer2);
        }
    }

    private void write(read readVar) throws Throwable {
        if (MediaBrowserCompatItemReceiver) {
            Objects.toString(readVar);
        }
        readVar.IconCompatParcelizer(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        readVar.read(bArr);
        readVar.read(bArr2);
        readVar.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        readVar.IconCompatParcelizer(i - readVar.RemoteActionCompatParcelizer());
        readVar.read(bArr4);
        read(new read(bArr4), i, 5);
        readVar.IconCompatParcelizer(i3 - readVar.RemoteActionCompatParcelizer());
        readVar.RemoteActionCompatParcelizer(ByteOrder.BIG_ENDIAN);
        int i4 = readVar.readInt();
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = readVar.readUnsignedShort();
            int unsignedShort2 = readVar.readUnsignedShort();
            if (unsignedShort == onPause.AudioAttributesCompatParcelizer) {
                short s = readVar.readShort();
                short s2 = readVar.readShort();
                RemoteActionCompatParcelizer RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(s, this.onRemoveQueueItemAt);
                RemoteActionCompatParcelizer RemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(s2, this.onRemoveQueueItemAt);
                this.onSeekTo[0].put("ImageLength", RemoteActionCompatParcelizer2);
                this.onSeekTo[0].put("ImageWidth", RemoteActionCompatParcelizer3);
                return;
            }
            readVar.IconCompatParcelizer(unsignedShort2);
        }
    }

    private void read(final IconCompatParcelizer iconCompatParcelizer) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                JacksonAnnotationIntrospector.read.read(mediaMetadataRetriever, new MediaDataSource() { // from class: o.createEnumNamingStrategyInstance.2
                    private long AudioAttributesCompatParcelizer;

                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() throws IOException {
                    }

                    @Override // android.media.MediaDataSource
                    public final long getSize() throws IOException {
                        return -1L;
                    }

                    @Override // android.media.MediaDataSource
                    public final int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
                        if (i2 == 0) {
                            return 0;
                        }
                        if (j < 0) {
                            return -1;
                        }
                        try {
                            long j2 = this.AudioAttributesCompatParcelizer;
                            if (j2 != j) {
                                if (j2 >= 0 && j >= j2 + ((long) iconCompatParcelizer.available())) {
                                    return -1;
                                }
                                iconCompatParcelizer.IconCompatParcelizer(j);
                                this.AudioAttributesCompatParcelizer = j;
                            }
                            if (i2 > iconCompatParcelizer.available()) {
                                i2 = iconCompatParcelizer.available();
                            }
                            int i3 = iconCompatParcelizer.read(bArr, i, i2);
                            if (i3 >= 0) {
                                this.AudioAttributesCompatParcelizer += (long) i3;
                                return i3;
                            }
                        } catch (IOException unused) {
                        }
                        this.AudioAttributesCompatParcelizer = -1L;
                        return -1;
                    }
                });
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    this.onSeekTo[0].put("ImageWidth", RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(Integer.parseInt(strExtractMetadata), this.onRemoveQueueItemAt));
                }
                if (strExtractMetadata2 != null) {
                    this.onSeekTo[0].put("ImageLength", RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(Integer.parseInt(strExtractMetadata2), this.onRemoveQueueItemAt));
                }
                if (strExtractMetadata3 != null) {
                    int i = Integer.parseInt(strExtractMetadata3);
                    this.onSeekTo[0].put("Orientation", RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(i != 90 ? i != 180 ? i != 270 ? 1 : 8 : 3 : 6, this.onRemoveQueueItemAt));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata4);
                    int i3 = Integer.parseInt(strExtractMetadata5);
                    if (i3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    iconCompatParcelizer.IconCompatParcelizer(i2);
                    byte[] bArr = new byte[6];
                    if (iconCompatParcelizer.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i4 = i3 - 6;
                    if (!Arrays.equals(bArr, MediaMetadataCompat)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i4];
                    if (iconCompatParcelizer.read(bArr2) != i4) {
                        throw new IOException("Can't read exif");
                    }
                    this.onSetRating = i2 + 6;
                    IconCompatParcelizer(bArr2, 0);
                }
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    private void write(IconCompatParcelizer iconCompatParcelizer) throws Throwable {
        int i;
        int i2;
        IconCompatParcelizer(iconCompatParcelizer);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.onSeekTo[1].get("MakerNote");
        if (remoteActionCompatParcelizer != null) {
            IconCompatParcelizer iconCompatParcelizer2 = new IconCompatParcelizer(remoteActionCompatParcelizer.read);
            iconCompatParcelizer2.RemoteActionCompatParcelizer(this.onRemoveQueueItemAt);
            byte[] bArr = handleMediaPlayPauseIfPendingOnHandler;
            byte[] bArr2 = new byte[bArr.length];
            iconCompatParcelizer2.readFully(bArr2);
            iconCompatParcelizer2.IconCompatParcelizer(0L);
            byte[] bArr3 = onCommand;
            byte[] bArr4 = new byte[bArr3.length];
            iconCompatParcelizer2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                iconCompatParcelizer2.IconCompatParcelizer(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                iconCompatParcelizer2.IconCompatParcelizer(12L);
            }
            read(iconCompatParcelizer2, 6);
            RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.onSeekTo[7].get("PreviewImageStart");
            RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = this.onSeekTo[7].get("PreviewImageLength");
            if (remoteActionCompatParcelizer2 != null && remoteActionCompatParcelizer3 != null) {
                this.onSeekTo[5].put("JPEGInterchangeFormat", remoteActionCompatParcelizer2);
                this.onSeekTo[5].put("JPEGInterchangeFormatLength", remoteActionCompatParcelizer3);
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer4 = this.onSeekTo[8].get("AspectFrame");
            if (remoteActionCompatParcelizer4 != null) {
                int[] iArr = (int[]) remoteActionCompatParcelizer4.AudioAttributesCompatParcelizer(this.onRemoveQueueItemAt);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                RemoteActionCompatParcelizer RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(i5, this.onRemoveQueueItemAt);
                RemoteActionCompatParcelizer RemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(i6, this.onRemoveQueueItemAt);
                this.onSeekTo[0].put("ImageWidth", RemoteActionCompatParcelizer2);
                this.onSeekTo[0].put("ImageLength", RemoteActionCompatParcelizer3);
            }
        }
    }

    private void AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) throws Throwable {
        if (MediaBrowserCompatItemReceiver) {
            Objects.toString(iconCompatParcelizer);
        }
        IconCompatParcelizer(iconCompatParcelizer);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.onSeekTo[0].get("JpgFromRaw");
        if (remoteActionCompatParcelizer != null) {
            read(new read(remoteActionCompatParcelizer.read), (int) remoteActionCompatParcelizer.AudioAttributesCompatParcelizer, 5);
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.onSeekTo[0].get("ISO");
        RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = this.onSeekTo[1].get("PhotographicSensitivity");
        if (remoteActionCompatParcelizer2 == null || remoteActionCompatParcelizer3 != null) {
            return;
        }
        this.onSeekTo[1].put("PhotographicSensitivity", remoteActionCompatParcelizer2);
    }

    private void AudioAttributesCompatParcelizer(read readVar) throws Throwable {
        if (MediaBrowserCompatItemReceiver) {
            Objects.toString(readVar);
        }
        readVar.RemoteActionCompatParcelizer(ByteOrder.BIG_ENDIAN);
        byte[] bArr = onMediaButtonEvent;
        readVar.IconCompatParcelizer(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = readVar.readInt();
                byte[] bArr2 = new byte[4];
                if (readVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, onAddQueueItem)) {
                    return;
                }
                if (Arrays.equals(bArr2, onCustomAction)) {
                    byte[] bArr3 = new byte[i];
                    if (readVar.read(bArr3) != i) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to read given length for given PNG chunk type: ");
                        sb.append(JacksonAnnotationIntrospector.write(bArr2));
                        throw new IOException(sb.toString());
                    }
                    int i3 = readVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) != i3) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: ");
                        sb2.append(i3);
                        sb2.append(", calculated CRC value: ");
                        sb2.append(crc32.getValue());
                        throw new IOException(sb2.toString());
                    }
                    this.onSetRating = i2;
                    IconCompatParcelizer(bArr3, 0);
                    write();
                    AudioAttributesImplBaseParcelizer(new read(bArr3));
                    return;
                }
                int i4 = i + 4;
                readVar.IconCompatParcelizer(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void IconCompatParcelizer(read readVar) throws Throwable {
        if (MediaBrowserCompatItemReceiver) {
            Objects.toString(readVar);
        }
        readVar.RemoteActionCompatParcelizer(ByteOrder.LITTLE_ENDIAN);
        readVar.IconCompatParcelizer(onPlay.length);
        int i = readVar.readInt() + 8;
        byte[] bArr = onFastForward;
        readVar.IconCompatParcelizer(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (readVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = readVar.readInt();
                int i3 = length + 8;
                if (Arrays.equals(onPlayFromMediaId, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (readVar.read(bArr3) != i2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to read given length for given PNG chunk type: ");
                        sb.append(JacksonAnnotationIntrospector.write(bArr2));
                        throw new IOException(sb.toString());
                    }
                    this.onSetRating = i3;
                    IconCompatParcelizer(bArr3, 0);
                    AudioAttributesImplBaseParcelizer(new read(bArr3));
                    return;
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                readVar.IconCompatParcelizer(i2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private void IconCompatParcelizer(byte[] bArr, int i) throws IOException {
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(bArr);
        read((read) iconCompatParcelizer);
        read(iconCompatParcelizer, i);
    }

    private void read() {
        String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer("DateTimeOriginal");
        if (strAudioAttributesCompatParcelizer != null && AudioAttributesCompatParcelizer("DateTime") == null) {
            this.onSeekTo[0].put("DateTime", RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(strAudioAttributesCompatParcelizer));
        }
        if (AudioAttributesCompatParcelizer("ImageWidth") == null) {
            this.onSeekTo[0].put("ImageWidth", RemoteActionCompatParcelizer.read(0L, this.onRemoveQueueItemAt));
        }
        if (AudioAttributesCompatParcelizer("ImageLength") == null) {
            this.onSeekTo[0].put("ImageLength", RemoteActionCompatParcelizer.read(0L, this.onRemoveQueueItemAt));
        }
        if (AudioAttributesCompatParcelizer("Orientation") == null) {
            this.onSeekTo[0].put("Orientation", RemoteActionCompatParcelizer.read(0L, this.onRemoveQueueItemAt));
        }
        if (AudioAttributesCompatParcelizer("LightSource") == null) {
            this.onSeekTo[1].put("LightSource", RemoteActionCompatParcelizer.read(0L, this.onRemoveQueueItemAt));
        }
    }

    private static ByteOrder RemoteActionCompatParcelizer(read readVar) throws IOException {
        short s = readVar.readShort();
        if (s == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        StringBuilder sb = new StringBuilder("Invalid byte order: ");
        sb.append(Integer.toHexString(s));
        throw new IOException(sb.toString());
    }

    private void read(read readVar) throws IOException {
        ByteOrder byteOrderRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(readVar);
        this.onRemoveQueueItemAt = byteOrderRemoteActionCompatParcelizer;
        readVar.RemoteActionCompatParcelizer(byteOrderRemoteActionCompatParcelizer);
        int unsignedShort = readVar.readUnsignedShort();
        int i = this.onSetRepeatMode;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            StringBuilder sb = new StringBuilder("Invalid start code: ");
            sb.append(Integer.toHexString(unsignedShort));
            throw new IOException(sb.toString());
        }
        int i2 = readVar.readInt();
        if (i2 < 8) {
            throw new IOException("Invalid first Ifd offset: ".concat(String.valueOf(i2)));
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            readVar.IconCompatParcelizer(i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void read(o.createEnumNamingStrategyInstance.IconCompatParcelizer r24, int r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createEnumNamingStrategyInstance.read(o.createEnumNamingStrategyInstance$IconCompatParcelizer, int):void");
    }

    private void AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, int i) throws Throwable {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.onSeekTo[i].get("ImageLength");
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.onSeekTo[i].get("ImageWidth");
        if (remoteActionCompatParcelizer == null || remoteActionCompatParcelizer2 == null) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = this.onSeekTo[i].get("JPEGInterchangeFormat");
            RemoteActionCompatParcelizer remoteActionCompatParcelizer4 = this.onSeekTo[i].get("JPEGInterchangeFormatLength");
            if (remoteActionCompatParcelizer3 == null || remoteActionCompatParcelizer4 == null) {
                return;
            }
            int i2 = remoteActionCompatParcelizer3.read(this.onRemoveQueueItemAt);
            int i3 = remoteActionCompatParcelizer3.read(this.onRemoveQueueItemAt);
            iconCompatParcelizer.IconCompatParcelizer(i2);
            byte[] bArr = new byte[i3];
            iconCompatParcelizer.read(bArr);
            read(new read(bArr), i2, i);
        }
    }

    private void AudioAttributesImplBaseParcelizer(read readVar) throws Throwable {
        HashMap<String, RemoteActionCompatParcelizer> map = this.onSeekTo[4];
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = map.get("Compression");
        if (remoteActionCompatParcelizer != null) {
            int i = remoteActionCompatParcelizer.read(this.onRemoveQueueItemAt);
            this.PlaybackStateCompat = i;
            if (i != 1) {
                if (i == 6) {
                    AudioAttributesCompatParcelizer(readVar, map);
                    return;
                } else if (i != 7) {
                    return;
                }
            }
            if (IconCompatParcelizer(map)) {
                read(readVar, map);
                return;
            }
            return;
        }
        this.PlaybackStateCompat = 6;
        AudioAttributesCompatParcelizer(readVar, map);
    }

    private void AudioAttributesCompatParcelizer(read readVar, HashMap map) throws Throwable {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) map.get("JPEGInterchangeFormat");
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = (RemoteActionCompatParcelizer) map.get("JPEGInterchangeFormatLength");
        if (remoteActionCompatParcelizer == null || remoteActionCompatParcelizer2 == null) {
            return;
        }
        int i = remoteActionCompatParcelizer.read(this.onRemoveQueueItemAt);
        int i2 = remoteActionCompatParcelizer2.read(this.onRemoveQueueItemAt);
        if (this.onSetRepeatMode == 7) {
            i += this.onSkipToPrevious;
        }
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.onSetCaptioningEnabled = true;
        if (this.onRewind == null && this.onSkipToNext == null) {
            byte[] bArr = new byte[i2];
            readVar.skip(i);
            readVar.read(bArr);
            this.onStop = bArr;
        }
        this.ParcelableVolumeInfo = i;
        this.MediaSessionCompatResultReceiverWrapper = i2;
    }

    private void read(read readVar, HashMap map) throws IOException {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) map.get("StripOffsets");
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = (RemoteActionCompatParcelizer) map.get("StripByteCounts");
        if (remoteActionCompatParcelizer == null || remoteActionCompatParcelizer2 == null) {
            return;
        }
        long[] jArrWrite = JacksonAnnotationIntrospector.write(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.onRemoveQueueItemAt));
        long[] jArrWrite2 = JacksonAnnotationIntrospector.write(remoteActionCompatParcelizer2.AudioAttributesCompatParcelizer(this.onRemoveQueueItemAt));
        if (jArrWrite == null || jArrWrite.length == 0 || jArrWrite2 == null || jArrWrite2.length == 0 || jArrWrite.length != jArrWrite2.length) {
            return;
        }
        long j = 0;
        for (long j2 : jArrWrite2) {
            j += j2;
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        this.onPlayFromSearch = true;
        this.onSetShuffleMode = true;
        this.onSetCaptioningEnabled = true;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < jArrWrite.length; i4++) {
            int i5 = (int) jArrWrite[i4];
            int i6 = (int) jArrWrite2[i4];
            if (i4 < jArrWrite.length - 1 && i5 + i6 != jArrWrite[i4 + 1]) {
                this.onPlayFromSearch = false;
            }
            int i7 = i5 - i2;
            if (i7 < 0) {
                return;
            }
            long j3 = i7;
            if (readVar.skip(j3) != j3) {
                return;
            }
            byte[] bArr2 = new byte[i6];
            if (readVar.read(bArr2) != i6) {
                return;
            }
            i2 = i2 + i7 + i6;
            System.arraycopy(bArr2, 0, bArr, i3, i6);
            i3 += i6;
        }
        this.onStop = bArr;
        if (this.onPlayFromSearch) {
            this.ParcelableVolumeInfo = (int) jArrWrite[0];
            this.MediaSessionCompatResultReceiverWrapper = i;
        }
    }

    private boolean IconCompatParcelizer(HashMap map) throws Throwable {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = (RemoteActionCompatParcelizer) map.get("BitsPerSample");
        if (remoteActionCompatParcelizer2 == null) {
            return false;
        }
        int[] iArr = (int[]) remoteActionCompatParcelizer2.AudioAttributesCompatParcelizer(this.onRemoveQueueItemAt);
        int[] iArr2 = MediaBrowserCompatCustomActionResultReceiver;
        if (Arrays.equals(iArr2, iArr)) {
            return true;
        }
        if (this.onSetRepeatMode != 3 || (remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) map.get("PhotometricInterpretation")) == null) {
            return false;
        }
        int i = remoteActionCompatParcelizer.read(this.onRemoveQueueItemAt);
        return (i == 1 && Arrays.equals(iArr, IconCompatParcelizer)) || (i == 6 && Arrays.equals(iArr, iArr2));
    }

    private boolean RemoteActionCompatParcelizer(HashMap map) throws IOException {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) map.get("ImageLength");
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = (RemoteActionCompatParcelizer) map.get("ImageWidth");
        if (remoteActionCompatParcelizer == null || remoteActionCompatParcelizer2 == null) {
            return false;
        }
        return remoteActionCompatParcelizer.read(this.onRemoveQueueItemAt) <= 512 && remoteActionCompatParcelizer2.read(this.onRemoveQueueItemAt) <= 512;
    }

    private void write() throws Throwable {
        AudioAttributesCompatParcelizer(0, 5);
        AudioAttributesCompatParcelizer(0, 4);
        AudioAttributesCompatParcelizer(5, 4);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.onSeekTo[1].get("PixelXDimension");
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.onSeekTo[1].get("PixelYDimension");
        if (remoteActionCompatParcelizer != null && remoteActionCompatParcelizer2 != null) {
            this.onSeekTo[0].put("ImageWidth", remoteActionCompatParcelizer);
            this.onSeekTo[0].put("ImageLength", remoteActionCompatParcelizer2);
        }
        if (this.onSeekTo[4].isEmpty() && RemoteActionCompatParcelizer(this.onSeekTo[5])) {
            HashMap<String, RemoteActionCompatParcelizer>[] mapArr = this.onSeekTo;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        RemoteActionCompatParcelizer(this.onSeekTo[4]);
        write(0, "ThumbnailOrientation", "Orientation");
        write(0, "ThumbnailImageLength", "ImageLength");
        write(0, "ThumbnailImageWidth", "ImageWidth");
        write(5, "ThumbnailOrientation", "Orientation");
        write(5, "ThumbnailImageLength", "ImageLength");
        write(5, "ThumbnailImageWidth", "ImageWidth");
        write(4, "Orientation", "ThumbnailOrientation");
        write(4, "ImageLength", "ThumbnailImageLength");
        write(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private void write(IconCompatParcelizer iconCompatParcelizer, int i) throws Throwable {
        RemoteActionCompatParcelizer RemoteActionCompatParcelizer2;
        RemoteActionCompatParcelizer RemoteActionCompatParcelizer3;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.onSeekTo[i].get("DefaultCropSize");
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.onSeekTo[i].get("SensorTopBorder");
        RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = this.onSeekTo[i].get("SensorLeftBorder");
        RemoteActionCompatParcelizer remoteActionCompatParcelizer4 = this.onSeekTo[i].get("SensorBottomBorder");
        RemoteActionCompatParcelizer remoteActionCompatParcelizer5 = this.onSeekTo[i].get("SensorRightBorder");
        if (remoteActionCompatParcelizer != null) {
            if (remoteActionCompatParcelizer.RemoteActionCompatParcelizer == 5) {
                write[] writeVarArr = (write[]) remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.onRemoveQueueItemAt);
                if (writeVarArr == null || writeVarArr.length != 2) {
                    Arrays.toString(writeVarArr);
                    return;
                } else {
                    RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(writeVarArr[0], this.onRemoveQueueItemAt);
                    RemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(writeVarArr[1], this.onRemoveQueueItemAt);
                }
            } else {
                int[] iArr = (int[]) remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.onRemoveQueueItemAt);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(iArr[0], this.onRemoveQueueItemAt);
                    RemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(iArr[1], this.onRemoveQueueItemAt);
                }
            }
            this.onSeekTo[i].put("ImageWidth", RemoteActionCompatParcelizer2);
            this.onSeekTo[i].put("ImageLength", RemoteActionCompatParcelizer3);
            return;
        }
        if (remoteActionCompatParcelizer2 != null && remoteActionCompatParcelizer3 != null && remoteActionCompatParcelizer4 != null && remoteActionCompatParcelizer5 != null) {
            int i2 = remoteActionCompatParcelizer2.read(this.onRemoveQueueItemAt);
            int i3 = remoteActionCompatParcelizer4.read(this.onRemoveQueueItemAt);
            int i4 = remoteActionCompatParcelizer5.read(this.onRemoveQueueItemAt);
            int i5 = remoteActionCompatParcelizer3.read(this.onRemoveQueueItemAt);
            if (i3 <= i2 || i4 <= i5) {
                return;
            }
            RemoteActionCompatParcelizer RemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(i3 - i2, this.onRemoveQueueItemAt);
            RemoteActionCompatParcelizer RemoteActionCompatParcelizer5 = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(i4 - i5, this.onRemoveQueueItemAt);
            this.onSeekTo[i].put("ImageLength", RemoteActionCompatParcelizer4);
            this.onSeekTo[i].put("ImageWidth", RemoteActionCompatParcelizer5);
            return;
        }
        AudioAttributesCompatParcelizer(iconCompatParcelizer, i);
    }

    static class IconCompatParcelizer extends read {
        IconCompatParcelizer(byte[] bArr) throws IOException {
            super(bArr);
            this.AudioAttributesCompatParcelizer.mark(Integer.MAX_VALUE);
        }

        IconCompatParcelizer(InputStream inputStream) throws IOException {
            super(inputStream);
            if (!inputStream.markSupported()) {
                throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            }
            this.AudioAttributesCompatParcelizer.mark(Integer.MAX_VALUE);
        }

        public final void IconCompatParcelizer(long j) throws IOException {
            if (this.write > j) {
                this.write = 0;
                this.AudioAttributesCompatParcelizer.reset();
            } else {
                j -= (long) this.write;
            }
            IconCompatParcelizer((int) j);
        }
    }

    static class read extends InputStream implements DataInput {
        final DataInputStream AudioAttributesCompatParcelizer;
        private byte[] AudioAttributesImplApi26Parcelizer;
        private ByteOrder RemoteActionCompatParcelizer;
        int write;
        private static final ByteOrder read = ByteOrder.LITTLE_ENDIAN;
        private static final ByteOrder IconCompatParcelizer = ByteOrder.BIG_ENDIAN;

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            return null;
        }

        read(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        read(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        private read(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.RemoteActionCompatParcelizer = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.AudioAttributesCompatParcelizer = dataInputStream;
            dataInputStream.mark(0);
            this.write = 0;
            this.RemoteActionCompatParcelizer = byteOrder;
        }

        public final void RemoteActionCompatParcelizer(ByteOrder byteOrder) {
            this.RemoteActionCompatParcelizer = byteOrder;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.write;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.AudioAttributesCompatParcelizer.available();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.write++;
            return this.AudioAttributesCompatParcelizer.read();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.AudioAttributesCompatParcelizer.read(bArr, i, i2);
            this.write += i3;
            return i3;
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.write++;
            return this.AudioAttributesCompatParcelizer.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.write++;
            return this.AudioAttributesCompatParcelizer.readBoolean();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.write += 2;
            return this.AudioAttributesCompatParcelizer.readChar();
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.write += 2;
            return this.AudioAttributesCompatParcelizer.readUTF();
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            this.write += i2;
            this.AudioAttributesCompatParcelizer.readFully(bArr, i, i2);
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.write += bArr.length;
            this.AudioAttributesCompatParcelizer.readFully(bArr);
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.write++;
            int i = this.AudioAttributesCompatParcelizer.read();
            if (i >= 0) {
                return (byte) i;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            int i;
            this.write += 2;
            int i2 = this.AudioAttributesCompatParcelizer.read();
            int i3 = this.AudioAttributesCompatParcelizer.read();
            if ((i2 | i3) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.RemoteActionCompatParcelizer;
            if (byteOrder == read) {
                i = (i3 << 8) + i2;
            } else {
                if (byteOrder != IconCompatParcelizer) {
                    StringBuilder sb = new StringBuilder("Invalid byte order: ");
                    sb.append(this.RemoteActionCompatParcelizer);
                    throw new IOException(sb.toString());
                }
                i = (i2 << 8) + i3;
            }
            return (short) i;
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.write += 4;
            int i = this.AudioAttributesCompatParcelizer.read();
            int i2 = this.AudioAttributesCompatParcelizer.read();
            int i3 = this.AudioAttributesCompatParcelizer.read();
            int i4 = this.AudioAttributesCompatParcelizer.read();
            if ((i | i2 | i3 | i4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.RemoteActionCompatParcelizer;
            if (byteOrder == read) {
                return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
            }
            if (byteOrder == IconCompatParcelizer) {
                return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
            }
            StringBuilder sb = new StringBuilder("Invalid byte order: ");
            sb.append(this.RemoteActionCompatParcelizer);
            throw new IOException(sb.toString());
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public final void IconCompatParcelizer(int i) throws IOException {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                int iSkip = (int) this.AudioAttributesCompatParcelizer.skip(i3);
                if (iSkip <= 0) {
                    if (this.AudioAttributesImplApi26Parcelizer == null) {
                        this.AudioAttributesImplApi26Parcelizer = new byte[8192];
                    }
                    iSkip = this.AudioAttributesCompatParcelizer.read(this.AudioAttributesImplApi26Parcelizer, 0, Math.min(8192, i3));
                    if (iSkip == -1) {
                        StringBuilder sb = new StringBuilder("Reached EOF while skipping ");
                        sb.append(i);
                        sb.append(" bytes.");
                        throw new EOFException(sb.toString());
                    }
                }
                i2 += iSkip;
            }
            this.write += i2;
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.write += 2;
            int i = this.AudioAttributesCompatParcelizer.read();
            int i2 = this.AudioAttributesCompatParcelizer.read();
            if ((i | i2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.RemoteActionCompatParcelizer;
            if (byteOrder == read) {
                return (i2 << 8) + i;
            }
            if (byteOrder == IconCompatParcelizer) {
                return (i << 8) + i2;
            }
            StringBuilder sb = new StringBuilder("Invalid byte order: ");
            sb.append(this.RemoteActionCompatParcelizer);
            throw new IOException(sb.toString());
        }

        public final long IconCompatParcelizer() throws IOException {
            long j = -1;
            return ((long) readInt()) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.write += 8;
            int i = this.AudioAttributesCompatParcelizer.read();
            int i2 = this.AudioAttributesCompatParcelizer.read();
            int i3 = this.AudioAttributesCompatParcelizer.read();
            int i4 = this.AudioAttributesCompatParcelizer.read();
            int i5 = this.AudioAttributesCompatParcelizer.read();
            int i6 = this.AudioAttributesCompatParcelizer.read();
            int i7 = this.AudioAttributesCompatParcelizer.read();
            int i8 = this.AudioAttributesCompatParcelizer.read();
            if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.RemoteActionCompatParcelizer;
            if (byteOrder == read) {
                return (((long) i8) << 56) + (((long) i7) << 48) + (((long) i6) << 40) + (((long) i5) << 32) + (((long) i4) << 24) + (((long) i3) << 16) + (((long) i2) << 8) + ((long) i);
            }
            if (byteOrder == IconCompatParcelizer) {
                return (((long) i) << 56) + (((long) i2) << 48) + (((long) i3) << 40) + (((long) i4) << 32) + (((long) i5) << 24) + (((long) i6) << 16) + (((long) i7) << 8) + ((long) i8);
            }
            StringBuilder sb = new StringBuilder("Invalid byte order: ");
            sb.append(this.RemoteActionCompatParcelizer);
            throw new IOException(sb.toString());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }
    }

    private void AudioAttributesCompatParcelizer(int i, int i2) throws Throwable {
        if (this.onSeekTo[i].isEmpty() || this.onSeekTo[i2].isEmpty()) {
            return;
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.onSeekTo[i].get("ImageLength");
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.onSeekTo[i].get("ImageWidth");
        RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = this.onSeekTo[i2].get("ImageLength");
        RemoteActionCompatParcelizer remoteActionCompatParcelizer4 = this.onSeekTo[i2].get("ImageWidth");
        if (remoteActionCompatParcelizer == null || remoteActionCompatParcelizer2 == null || remoteActionCompatParcelizer3 == null || remoteActionCompatParcelizer4 == null) {
            return;
        }
        int i3 = remoteActionCompatParcelizer.read(this.onRemoveQueueItemAt);
        int i4 = remoteActionCompatParcelizer2.read(this.onRemoveQueueItemAt);
        int i5 = remoteActionCompatParcelizer3.read(this.onRemoveQueueItemAt);
        int i6 = remoteActionCompatParcelizer4.read(this.onRemoveQueueItemAt);
        if (i3 >= i5 || i4 >= i6) {
            return;
        }
        HashMap<String, RemoteActionCompatParcelizer>[] mapArr = this.onSeekTo;
        HashMap<String, RemoteActionCompatParcelizer> map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    private void write(int i, String str, String str2) {
        if (this.onSeekTo[i].isEmpty() || this.onSeekTo[i].get(str) == null) {
            return;
        }
        HashMap<String, RemoteActionCompatParcelizer> map = this.onSeekTo[i];
        map.put(str2, map.get(str));
        this.onSeekTo[i].remove(str);
    }
}
