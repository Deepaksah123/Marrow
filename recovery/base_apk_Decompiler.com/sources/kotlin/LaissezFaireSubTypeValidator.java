package kotlin;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.exoplayer2.util.MimeTypes;
import com.marrow.data.models.common.CourseResponseKeyConstantsKt;
import in.juspay.hypersdk.analytics.LogConstants;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.C0170format;
import kotlin.isUnsafeBaseType;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class LaissezFaireSubTypeValidator {
    public static final String AudioAttributesCompatParcelizer;
    private static final int[] AudioAttributesImplApi21Parcelizer;
    private static final int[] AudioAttributesImplApi26Parcelizer;
    private static final int[] AudioAttributesImplBaseParcelizer;
    public static final long[] IconCompatParcelizer;
    public static final int MediaBrowserCompatCustomActionResultReceiver;
    public static final String MediaBrowserCompatItemReceiver;
    private static final String[] MediaBrowserCompatMediaItem;
    private static final Pattern MediaBrowserCompatSearchResultReceiver;
    private static final String[] MediaDescriptionCompat;
    private static final Pattern MediaMetadataCompat;
    private static final Pattern RatingCompat;
    public static final byte[] RemoteActionCompatParcelizer;
    private static HashMap<String, String> onCommand;
    public static final String read;
    public static final String write;

    public static int AudioAttributesCompatParcelizer(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 22;
        }
        return 21;
    }

    public static <T> T[] AudioAttributesCompatParcelizer(T[] tArr) {
        return tArr;
    }

    public static int AudioAttributesImplApi21Parcelizer(int i) {
        if (i == 13) {
            return 1;
        }
        switch (i) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static int IconCompatParcelizer(int i) {
        if (i == 2 || i == 4) {
            return PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i == 10) {
            return PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
        }
        if (i == 7) {
            return PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i == 8) {
            return PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR;
        }
        switch (i) {
            case 15:
                return PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR;
            case 16:
            case 18:
                return PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return PlaybackException.ERROR_CODE_DRM_PROVISIONING_FAILED;
                    default:
                        return PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
                }
        }
    }

    public static long IconCompatParcelizer(long j) {
        return (j == C.TIME_UNSET || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    public static long IconCompatParcelizer(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j3) & (j2 ^ j3)) < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    public static <T> T IconCompatParcelizer(T t) {
        return t;
    }

    public static boolean MediaBrowserCompatMediaItem(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4;
    }

    public static long MediaBrowserCompatSearchResultReceiver(int i) {
        long j = -1;
        return ((long) i) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
    }

    public static boolean MediaDescriptionCompat(int i) {
        return i == 10 || i == 13;
    }

    public static boolean MediaMetadataCompat(int i) {
        return i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4;
    }

    public static long RemoteActionCompatParcelizer(long j, long j2) {
        long j3 = j - j2;
        if (((j ^ j2) & (j ^ j3)) < 0) {
            return Long.MIN_VALUE;
        }
        return j3;
    }

    public static int read(int i) {
        if (i == 20) {
            return 30;
        }
        if (i == 22) {
            return 31;
        }
        if (i == 30) {
            return 34;
        }
        switch (i) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    public static int write(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    static {
        int i = Build.VERSION.SDK_INT;
        MediaBrowserCompatCustomActionResultReceiver = i;
        String str = Build.DEVICE;
        AudioAttributesCompatParcelizer = str;
        String str2 = Build.MANUFACTURER;
        read = str2;
        String str3 = Build.MODEL;
        MediaBrowserCompatItemReceiver = str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(i);
        write = sb.toString();
        RemoteActionCompatParcelizer = new byte[0];
        IconCompatParcelizer = new long[0];
        MediaBrowserCompatSearchResultReceiver = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        MediaMetadataCompat = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        RatingCompat = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        MediaDescriptionCompat = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", PaymentConstants.WIDGET_NETBANKING, "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        MediaBrowserCompatMediaItem = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        AudioAttributesImplBaseParcelizer = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        AudioAttributesImplApi26Parcelizer = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        AudioAttributesImplApi21Parcelizer = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 133, 168, 175, 166, 161, 180, 179, 186, PsExtractor.PRIVATE_STREAM_1, 199, PsExtractor.AUDIO_STREAM, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, TsExtractor.TS_STREAM_TYPE_AC4, 165, 162, 143, 136, TsExtractor.TS_STREAM_TYPE_AC3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 147, TarConstants.CHKSUM_OFFSET, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, TsExtractor.TS_STREAM_TYPE_E_AC3, 128, 149, 146, TarConstants.PREFIXLEN, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, PsExtractor.VIDEO_STREAM_MASK, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, TsExtractor.TS_PACKET_SIZE, 187, 150, 145, 152, 159, TsExtractor.TS_STREAM_TYPE_DTS, 141, 132, TarConstants.PREFIXLEN_XSTAR, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static boolean AudioAttributesCompatParcelizer(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static boolean read(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static <T> boolean AudioAttributesCompatParcelizer(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (MediaBrowserCompatCustomActionResultReceiver >= 31) {
            return sparseArray.contentEquals(sparseArray2);
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static <T> int IconCompatParcelizer(SparseArray<T> sparseArray) {
        if (MediaBrowserCompatCustomActionResultReceiver >= 31) {
            return sparseArray.contentHashCode();
        }
        int iKeyAt = 17;
        for (int i = 0; i < sparseArray.size(); i++) {
            iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i)) * 31) + Objects.hashCode(sparseArray.valueAt(i));
        }
        return iKeyAt;
    }

    public static boolean AudioAttributesCompatParcelizer(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (read(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean write(SparseArray<T> sparseArray, int i) {
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static <T> void RemoteActionCompatParcelizer(List<T> list, int i, int i2) {
        if (i < 0 || i2 > list.size() || i > i2) {
            throw new IllegalArgumentException();
        }
        if (i != i2) {
            list.subList(i, i2).clear();
        }
    }

    public static <T> T[] AudioAttributesCompatParcelizer(T[] tArr, int i) {
        buildTypeSerializer.IconCompatParcelizer(i <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i);
    }

    public static <T> T[] RemoteActionCompatParcelizer(T[] tArr, int i) {
        buildTypeSerializer.IconCompatParcelizer(true);
        buildTypeSerializer.IconCompatParcelizer(i <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, 1, i);
    }

    public static <T> T[] read(T[] tArr, T t) {
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length + 1);
        objArrCopyOf[tArr.length] = t;
        return (T[]) AudioAttributesCompatParcelizer(objArrCopyOf);
    }

    public static <T> T[] AudioAttributesCompatParcelizer(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static Handler RemoteActionCompatParcelizer() {
        return read((Handler.Callback) null);
    }

    public static Handler read(Handler.Callback callback) {
        return write((Looper) buildTypeSerializer.AudioAttributesCompatParcelizer(Looper.myLooper()), callback);
    }

    public static Handler read() {
        return MediaBrowserCompatItemReceiver();
    }

    private static Handler MediaBrowserCompatItemReceiver() {
        return write(write(), (Handler.Callback) null);
    }

    public static Handler write(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static boolean read(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
            return true;
        }
        return handler.post(runnable);
    }

    public static Looper write() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    static /* synthetic */ Thread AudioAttributesCompatParcelizer(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static ExecutorService RemoteActionCompatParcelizer(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: o._typeFromId
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(str, runnable);
            }
        });
    }

    public static void AudioAttributesCompatParcelizer(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static boolean AudioAttributesCompatParcelizer(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void write(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static String AudioAttributesCompatParcelizer(Locale locale) {
        return MediaBrowserCompatCustomActionResultReceiver >= 21 ? IconCompatParcelizer(locale) : locale.toString();
    }

    public static String read(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals(C.LANGUAGE_UNDETERMINED)) {
            str = strReplace;
        }
        String string = parseMdhd.read(str);
        String str2 = RemoteActionCompatParcelizer(string, "-")[0];
        if (onCommand == null) {
            onCommand = AudioAttributesImplApi26Parcelizer();
        }
        String str3 = onCommand.get(str2);
        if (str3 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(string.substring(str2.length()));
            string = sb.toString();
            str2 = str3;
        }
        return ("no".equals(str2) || CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT.equals(str2) || "zh".equals(str2)) ? MediaDescriptionCompat(string) : string;
    }

    public static String AudioAttributesCompatParcelizer(byte[] bArr) {
        return new String(bArr, parseMdtaFromMeta.AudioAttributesImplApi26Parcelizer);
    }

    public static String write(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, parseMdtaFromMeta.AudioAttributesImplApi26Parcelizer);
    }

    public static byte[] IconCompatParcelizer(String str) {
        return str.getBytes(parseMdtaFromMeta.AudioAttributesImplApi26Parcelizer);
    }

    public static String[] AudioAttributesCompatParcelizer(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] RemoteActionCompatParcelizer(String str, String str2) {
        return str.split(str2, 2);
    }

    public static String read(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static int RemoteActionCompatParcelizer(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    public static long read(long j, long j2) {
        return ((j + j2) - 1) / j2;
    }

    public static int write(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    public static long read(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    public static float AudioAttributesCompatParcelizer(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    public static int IconCompatParcelizer(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public static int write(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            i3 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i2 = iBinarySearch - 1;
                if (i2 < 0 || iArr[i2] != i) {
                    break;
                }
                iBinarySearch = i2;
            }
            i3 = z ? iBinarySearch : i2;
        }
        return z2 ? Math.max(0, i3) : i3;
    }

    public static int RemoteActionCompatParcelizer(long[] jArr, long j, boolean z) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i2 = iBinarySearch - 1;
                if (i2 < 0 || jArr[i2] != j) {
                    break;
                }
                iBinarySearch = i2;
            }
            i = iBinarySearch;
        }
        return z ? Math.max(0, i) : i;
    }

    public static <T extends Comparable<? super T>> int AudioAttributesCompatParcelizer(List<? extends Comparable<? super T>> list, T t, boolean z) {
        int i;
        int iBinarySearch = Collections.binarySearch(list, t);
        if (iBinarySearch < 0) {
            i = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i2 = iBinarySearch - 1;
                if (i2 < 0 || list.get(i2).compareTo(t) != 0) {
                    break;
                }
                iBinarySearch = i2;
            }
            i = iBinarySearch;
        }
        return z ? Math.max(0, i) : i;
    }

    public static int AudioAttributesCompatParcelizer(AsDeductionTypeDeserializer asDeductionTypeDeserializer, long j) {
        int i = asDeductionTypeDeserializer.read() - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            if (asDeductionTypeDeserializer.read(i3) < j) {
                i2 = i3 + 1;
            } else {
                i = i3 - 1;
            }
        }
        int i4 = i + 1;
        if (i4 < asDeductionTypeDeserializer.read() && asDeductionTypeDeserializer.read(i4) == j) {
            return i4;
        }
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public static int read(long[] jArr, long j, boolean z) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i = iBinarySearch + 1;
            if (i >= jArr.length || jArr[i] != j) {
                break;
            }
            iBinarySearch = i;
        }
        return !z ? i : iBinarySearch;
    }

    public static long AudioAttributesCompatParcelizer(long j) {
        return (j == C.TIME_UNSET || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    public static long IconCompatParcelizer(long j, int i) {
        return RemoteActionCompatParcelizer(j, 1000000L, i, RoundingMode.FLOOR);
    }

    public static long write(long j, int i) {
        return RemoteActionCompatParcelizer(j, i, 1000000L, RoundingMode.CEILING);
    }

    public static long AudioAttributesImplBaseParcelizer(String str) {
        Matcher matcher = MediaMetadataCompat.matcher(str);
        if (matcher.matches()) {
            boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
            String strGroup = matcher.group(3);
            double d = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
            String strGroup2 = matcher.group(5);
            double d2 = strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d;
            String strGroup3 = matcher.group(7);
            double d3 = strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d;
            String strGroup4 = matcher.group(10);
            double d4 = strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d;
            String strGroup5 = matcher.group(12);
            double d5 = strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d;
            String strGroup6 = matcher.group(14);
            long j = (long) ((d + d2 + d3 + d4 + d5 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
            return !zIsEmpty ? -j : j;
        }
        return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
    }

    public static long AudioAttributesImplApi26Parcelizer(String str) throws SchemaAware {
        int i;
        Matcher matcher = MediaBrowserCompatSearchResultReceiver.matcher(str);
        if (!matcher.matches()) {
            throw SchemaAware.RemoteActionCompatParcelizer("Invalid date/time format: ".concat(String.valueOf(str)), null);
        }
        if (matcher.group(9) == null || matcher.group(9).equalsIgnoreCase("Z")) {
            i = 0;
        } else {
            i = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i = -i;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            StringBuilder sb = new StringBuilder("0.");
            sb.append(matcher.group(8));
            gregorianCalendar.set(14, new BigDecimal(sb.toString()).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i != 0 ? timeInMillis - (((long) i) * 60000) : timeInMillis;
    }

    public static long RemoteActionCompatParcelizer(long j, long j2, long j3, RoundingMode roundingMode) {
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        if (j3 >= j2 && j3 % j2 == 0) {
            return parseIlstElement.RemoteActionCompatParcelizer(j, parseIlstElement.RemoteActionCompatParcelizer(j3, j2, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return parseIlstElement.RemoteActionCompatParcelizer(j, parseIlstElement.RemoteActionCompatParcelizer(j2, j3, RoundingMode.UNNECESSARY));
        }
        if (j3 >= j && j3 % j == 0) {
            return parseIlstElement.RemoteActionCompatParcelizer(j2, parseIlstElement.RemoteActionCompatParcelizer(j3, j, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j3 < j && j % j3 == 0) {
            return parseIlstElement.RemoteActionCompatParcelizer(j2, parseIlstElement.RemoteActionCompatParcelizer(j, j3, RoundingMode.UNNECESSARY));
        }
        return IconCompatParcelizer(j, j2, j3, roundingMode);
    }

    private static void IconCompatParcelizer(long[] jArr, long j, long j2, RoundingMode roundingMode) {
        int i = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long jRemoteActionCompatParcelizer = parseIlstElement.RemoteActionCompatParcelizer(j2, 1000000L, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = parseIlstElement.RemoteActionCompatParcelizer(jArr[i], jRemoteActionCompatParcelizer, roundingMode);
                i++;
            }
            return;
        }
        if (j2 < 1000000 && 1000000 % j2 == 0) {
            long jRemoteActionCompatParcelizer2 = parseIlstElement.RemoteActionCompatParcelizer(1000000L, j2, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = parseIlstElement.RemoteActionCompatParcelizer(jArr[i], jRemoteActionCompatParcelizer2);
                i++;
            }
            return;
        }
        for (int i2 = 0; i2 < jArr.length; i2++) {
            long j3 = jArr[i2];
            if (j3 != 0) {
                if (j2 >= j3 && j2 % j3 == 0) {
                    jArr[i2] = parseIlstElement.RemoteActionCompatParcelizer(1000000L, parseIlstElement.RemoteActionCompatParcelizer(j2, j3, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j2 < j3 && j3 % j2 == 0) {
                    jArr[i2] = parseIlstElement.RemoteActionCompatParcelizer(1000000L, parseIlstElement.RemoteActionCompatParcelizer(j3, j2, RoundingMode.UNNECESSARY));
                } else {
                    jArr[i2] = IconCompatParcelizer(j3, 1000000L, j2, roundingMode);
                }
            }
        }
    }

    private static long IconCompatParcelizer(long j, long j2, long j3, RoundingMode roundingMode) {
        long jRemoteActionCompatParcelizer = parseIlstElement.RemoteActionCompatParcelizer(j, j2);
        if (jRemoteActionCompatParcelizer != Long.MAX_VALUE && jRemoteActionCompatParcelizer != Long.MIN_VALUE) {
            return parseIlstElement.RemoteActionCompatParcelizer(jRemoteActionCompatParcelizer, j3, roundingMode);
        }
        long jIconCompatParcelizer = parseIlstElement.IconCompatParcelizer(Math.abs(j2), Math.abs(j3));
        long jRemoteActionCompatParcelizer2 = parseIlstElement.RemoteActionCompatParcelizer(j2, jIconCompatParcelizer, RoundingMode.UNNECESSARY);
        long jRemoteActionCompatParcelizer3 = parseIlstElement.RemoteActionCompatParcelizer(j3, jIconCompatParcelizer, RoundingMode.UNNECESSARY);
        long jIconCompatParcelizer2 = parseIlstElement.IconCompatParcelizer(Math.abs(j), Math.abs(jRemoteActionCompatParcelizer3));
        long jRemoteActionCompatParcelizer4 = parseIlstElement.RemoteActionCompatParcelizer(j, jIconCompatParcelizer2, RoundingMode.UNNECESSARY);
        long jRemoteActionCompatParcelizer5 = parseIlstElement.RemoteActionCompatParcelizer(jRemoteActionCompatParcelizer3, jIconCompatParcelizer2, RoundingMode.UNNECESSARY);
        long jRemoteActionCompatParcelizer6 = parseIlstElement.RemoteActionCompatParcelizer(jRemoteActionCompatParcelizer4, jRemoteActionCompatParcelizer2);
        if (jRemoteActionCompatParcelizer6 != Long.MAX_VALUE && jRemoteActionCompatParcelizer6 != Long.MIN_VALUE) {
            return parseIlstElement.RemoteActionCompatParcelizer(jRemoteActionCompatParcelizer6, jRemoteActionCompatParcelizer5, roundingMode);
        }
        double d = jRemoteActionCompatParcelizer4 * (jRemoteActionCompatParcelizer2 / jRemoteActionCompatParcelizer5);
        if (d > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return skipSampleEncryptionData.IconCompatParcelizer(d, roundingMode);
    }

    public static long AudioAttributesCompatParcelizer(long j, long j2, long j3) {
        return RemoteActionCompatParcelizer(j, j2, j3, RoundingMode.FLOOR);
    }

    public static void read(long[] jArr, long j) {
        IconCompatParcelizer(jArr, 1000000L, j, RoundingMode.FLOOR);
    }

    public static long read(long j, float f) {
        return f == 1.0f ? j : Math.round(j * ((double) f));
    }

    public static long IconCompatParcelizer(long j, float f) {
        return f == 1.0f ? j : Math.round(j / ((double) f));
    }

    public static long IconCompatParcelizer(int i, int i2) {
        return MediaBrowserCompatSearchResultReceiver(i2) | (MediaBrowserCompatSearchResultReceiver(i) << 32);
    }

    public static String IconCompatParcelizer(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length << 1);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(Character.forDigit((bArr[i] >> 4) & 15, 16));
            sb.append(Character.forDigit(bArr[i] & 15, 16));
        }
        return sb.toString();
    }

    public static String write(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append(" (Linux;Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append(") AndroidXMedia3/1.4.1");
        return sb.toString();
    }

    public static int RemoteActionCompatParcelizer(String str, int i) {
        int i2 = 0;
        for (String str2 : MediaBrowserCompatCustomActionResultReceiver(str)) {
            if (i == DefaultBaseTypeLimitingValidator.AudioAttributesCompatParcelizer(str2)) {
                i2++;
            }
        }
        return i2;
    }

    public static String IconCompatParcelizer(String str, int i) {
        String[] strArrMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(str);
        if (strArrMediaBrowserCompatCustomActionResultReceiver.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrMediaBrowserCompatCustomActionResultReceiver) {
            if (i == DefaultBaseTypeLimitingValidator.AudioAttributesCompatParcelizer(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static String[] MediaBrowserCompatCustomActionResultReceiver(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return AudioAttributesCompatParcelizer(str.trim(), "(\\s*,\\s*)");
    }

    public static C0170format read(int i, int i2, int i3) {
        return new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer(MimeTypes.AUDIO_RAW).read(i2).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(i3).RatingCompat(i).IconCompatParcelizer();
    }

    public static int RemoteActionCompatParcelizer(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            case 9:
            case 11:
            default:
                return 0;
            case 10:
                return MediaBrowserCompatCustomActionResultReceiver >= 32 ? 737532 : 6396;
            case 12:
                return 743676;
        }
    }

    public static AudioFormat IconCompatParcelizer(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    public static int read(int i, int i2) {
        if (i != 2) {
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                if (i != 21) {
                    if (i != 22) {
                        if (i != 268435456) {
                            if (i != 1342177280) {
                                if (i != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return i2 * 3;
            }
            return i2 << 2;
        }
        return i2 << 1;
    }

    public static int AudioAttributesCompatParcelizer(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    private static int read(Uri uri) {
        int iAudioAttributesImplApi21Parcelizer;
        String scheme = uri.getScheme();
        if (scheme != null && parseMdhd.write("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0 && (iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(lastPathSegment.substring(iLastIndexOf + 1))) != 4) {
            return iAudioAttributesImplApi21Parcelizer;
        }
        Matcher matcher = RatingCompat.matcher((CharSequence) buildTypeSerializer.IconCompatParcelizer(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            if (strGroup.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (strGroup.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int AudioAttributesImplApi21Parcelizer(java.lang.String r5) {
        /*
            java.lang.String r5 = kotlin.parseMdhd.read(r5)
            r5.hashCode()
            int r0 = r5.hashCode()
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case 104579: goto L31;
                case 108321: goto L27;
                case 3242057: goto L1d;
                case 3299913: goto L13;
                default: goto L12;
            }
        L12:
            goto L3b
        L13:
            java.lang.String r0 = "m3u8"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L3b
            r5 = r2
            goto L3c
        L1d:
            java.lang.String r0 = "isml"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L3b
            r5 = r3
            goto L3c
        L27:
            java.lang.String r0 = "mpd"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L3b
            r5 = r4
            goto L3c
        L31:
            java.lang.String r0 = "ism"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L3b
            r5 = r1
            goto L3c
        L3b:
            r5 = -1
        L3c:
            if (r5 == 0) goto L48
            if (r5 == r4) goto L47
            if (r5 == r3) goto L48
            if (r5 == r2) goto L46
            r5 = 4
            return r5
        L46:
            return r3
        L47:
            return r1
        L48:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.LaissezFaireSubTypeValidator.AudioAttributesImplApi21Parcelizer(java.lang.String):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int read(android.net.Uri r4, java.lang.String r5) {
        /*
            if (r5 != 0) goto L7
            int r4 = read(r4)
            return r4
        L7:
            r5.hashCode()
            int r4 = r5.hashCode()
            r0 = 0
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r4) {
                case -979127466: goto L34;
                case -156749520: goto L2a;
                case 64194685: goto L20;
                case 1154777587: goto L16;
                default: goto L15;
            }
        L15:
            goto L3e
        L16:
            java.lang.String r4 = "application/x-rtsp"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L3e
            r4 = r1
            goto L3f
        L20:
            java.lang.String r4 = "application/dash+xml"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L3e
            r4 = r2
            goto L3f
        L2a:
            java.lang.String r4 = "application/vnd.ms-sstr+xml"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L3e
            r4 = r3
            goto L3f
        L34:
            java.lang.String r4 = "application/x-mpegURL"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L3e
            r4 = r0
            goto L3f
        L3e:
            r4 = -1
        L3f:
            if (r4 == 0) goto L4c
            if (r4 == r3) goto L4b
            if (r4 == r2) goto L4a
            if (r4 == r1) goto L49
            r4 = 4
            return r4
        L49:
            return r1
        L4a:
            return r0
        L4b:
            return r3
        L4c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.LaissezFaireSubTypeValidator.read(android.net.Uri, java.lang.String):int");
    }

    public static String read(StringBuilder sb, Formatter formatter, long j) {
        if (j == C.TIME_UNSET) {
            j = 0;
        }
        String str = j < 0 ? "-" : "";
        long jAbs = (Math.abs(j) + 500) / 1000;
        long j2 = jAbs % 60;
        long j3 = (jAbs / 60) % 60;
        long j4 = jAbs / 3600;
        sb.setLength(0);
        if (j4 > 0) {
            return formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j3), Long.valueOf(j2)).toString();
        }
        return formatter.format("%s%02d:%02d", str, Long.valueOf(j3), Long.valueOf(j2)).toString();
    }

    public static int read(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = (i3 << 8) ^ AudioAttributesImplBaseParcelizer[((i3 >>> 24) ^ (bArr[i] & 255)) & 255];
            i++;
        }
        return i3;
    }

    public static int IconCompatParcelizer(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            int iWrite = parseUint8Attribute.write(bArr[i]);
            i3 = write(iWrite & 15, write(iWrite >> 4, i3));
            i++;
        }
        return i3;
    }

    private static int write(int i, int i2) {
        return (AudioAttributesImplApi26Parcelizer[(i ^ ((i2 >> 12) & 255)) & 255] ^ ((i2 << 4) & 65535)) & 65535;
    }

    public static int AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = AudioAttributesImplApi21Parcelizer[i3 ^ (bArr[i] & 255)];
            i++;
        }
        return i3;
    }

    public static int RemoteActionCompatParcelizer(ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i2 : Integer.reverseBytes(i2);
    }

    public static String write(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return parseMdhd.IconCompatParcelizer(networkCountryIso);
            }
        }
        return parseMdhd.IconCompatParcelizer(Locale.getDefault().getCountry());
    }

    public static String[] AudioAttributesCompatParcelizer() {
        String[] strArrAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        for (int i = 0; i < strArrAudioAttributesImplBaseParcelizer.length; i++) {
            strArrAudioAttributesImplBaseParcelizer[i] = read(strArrAudioAttributesImplBaseParcelizer[i]);
        }
        return strArrAudioAttributesImplBaseParcelizer;
    }

    public static Locale IconCompatParcelizer() {
        return MediaBrowserCompatCustomActionResultReceiver >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
    }

    public static boolean AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, AsPropertyTypeDeserializer asPropertyTypeDeserializer2, Inflater inflater) {
        if (asPropertyTypeDeserializer.IconCompatParcelizer() <= 0) {
            return false;
        }
        if (asPropertyTypeDeserializer2.AudioAttributesCompatParcelizer() < asPropertyTypeDeserializer.IconCompatParcelizer()) {
            asPropertyTypeDeserializer2.IconCompatParcelizer(asPropertyTypeDeserializer.IconCompatParcelizer() << 1);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), asPropertyTypeDeserializer.write(), asPropertyTypeDeserializer.IconCompatParcelizer());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(asPropertyTypeDeserializer2.RemoteActionCompatParcelizer(), iInflate, asPropertyTypeDeserializer2.AudioAttributesCompatParcelizer() - iInflate);
                if (inflater.finished()) {
                    asPropertyTypeDeserializer2.AudioAttributesCompatParcelizer(iInflate);
                    return true;
                }
                if (inflater.needsDictionary() || inflater.needsInput()) {
                    break;
                }
                if (iInflate == asPropertyTypeDeserializer2.AudioAttributesCompatParcelizer()) {
                    asPropertyTypeDeserializer2.IconCompatParcelizer(asPropertyTypeDeserializer2.AudioAttributesCompatParcelizer() << 1);
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static boolean AudioAttributesImplApi26Parcelizer(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean read(Context context) {
        return MediaBrowserCompatCustomActionResultReceiver >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static Point RemoteActionCompatParcelizer(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            display = ((WindowManager) buildTypeSerializer.IconCompatParcelizer((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return read(context, display);
    }

    private static Point read(Context context, Display display) {
        String strMediaBrowserCompatItemReceiver;
        if (display.getDisplayId() == 0 && AudioAttributesImplApi26Parcelizer(context)) {
            if (MediaBrowserCompatCustomActionResultReceiver < 28) {
                strMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver("sys.display-size");
            } else {
                strMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver("vendor.display-size");
            }
            if (!TextUtils.isEmpty(strMediaBrowserCompatItemReceiver)) {
                try {
                    String[] strArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(strMediaBrowserCompatItemReceiver.trim(), "x");
                    if (strArrAudioAttributesCompatParcelizer.length == 2) {
                        int i = Integer.parseInt(strArrAudioAttributesCompatParcelizer[0]);
                        int i2 = Integer.parseInt(strArrAudioAttributesCompatParcelizer[1]);
                        if (i > 0 && i2 > 0) {
                            return new Point(i, i2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                prune.AudioAttributesCompatParcelizer("Util", "Invalid display size: ".concat(String.valueOf(strMediaBrowserCompatItemReceiver)));
            }
            if ("Sony".equals(read) && MediaBrowserCompatItemReceiver.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (MediaBrowserCompatCustomActionResultReceiver >= 23) {
            AudioAttributesCompatParcelizer(display, point);
        } else {
            display.getRealSize(point);
        }
        return point;
    }

    public static String MediaBrowserCompatItemReceiver(int i) {
        switch (i) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return LogConstants.DEFAULT_CHANNEL;
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return TtmlNode.TAG_METADATA;
            case 6:
                return "camera motion";
            default:
                if (i >= 10000) {
                    StringBuilder sb = new StringBuilder("custom (");
                    sb.append(i);
                    sb.append(")");
                    return sb.toString();
                }
                return "?";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean write(java.lang.String r3) {
        /*
            r3.hashCode()
            int r0 = r3.hashCode()
            r1 = 1
            r2 = 0
            switch(r0) {
                case -1487656890: goto L49;
                case -1487464693: goto L3f;
                case -1487464690: goto L35;
                case -1487394660: goto L2b;
                case -1487018032: goto L21;
                case -879272239: goto L17;
                case -879258763: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L53
        Ld:
            java.lang.String r0 = "image/png"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L53
            r3 = 6
            goto L54
        L17:
            java.lang.String r0 = "image/bmp"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L53
            r3 = 5
            goto L54
        L21:
            java.lang.String r0 = "image/webp"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L53
            r3 = 4
            goto L54
        L2b:
            java.lang.String r0 = "image/jpeg"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L53
            r3 = 3
            goto L54
        L35:
            java.lang.String r0 = "image/heif"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L53
            r3 = 2
            goto L54
        L3f:
            java.lang.String r0 = "image/heic"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L53
            r3 = r1
            goto L54
        L49:
            java.lang.String r0 = "image/avif"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L53
            r3 = r2
            goto L54
        L53:
            r3 = -1
        L54:
            switch(r3) {
                case 0: goto L61;
                case 1: goto L59;
                case 2: goto L59;
                case 3: goto L58;
                case 4: goto L58;
                case 5: goto L58;
                case 6: goto L58;
                default: goto L57;
            }
        L57:
            return r2
        L58:
            return r1
        L59:
            int r3 = kotlin.LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver
            r0 = 26
            if (r3 < r0) goto L60
            return r1
        L60:
            return r2
        L61:
            int r3 = kotlin.LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver
            r0 = 34
            if (r3 < r0) goto L68
            return r1
        L68:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.LaissezFaireSubTypeValidator.write(java.lang.String):boolean");
    }

    public static List<String> AudioAttributesImplBaseParcelizer(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add(TtmlNode.TEXT_EMPHASIS_AUTO);
        }
        if ((i & 1) != 0) {
            arrayList.add(LogConstants.DEFAULT_CHANNEL);
        }
        if ((i & 2) != 0) {
            arrayList.add("forced");
        }
        return arrayList;
    }

    public static List<String> MediaBrowserCompatCustomActionResultReceiver(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("main");
        }
        if ((i & 2) != 0) {
            arrayList.add("alt");
        }
        if ((i & 4) != 0) {
            arrayList.add("supplementary");
        }
        if ((i & 8) != 0) {
            arrayList.add("commentary");
        }
        if ((i & 16) != 0) {
            arrayList.add("dub");
        }
        if ((i & 32) != 0) {
            arrayList.add("emergency");
        }
        if ((i & 64) != 0) {
            arrayList.add("caption");
        }
        if ((i & 128) != 0) {
            arrayList.add(CourseResponseKeyConstantsKt.KEY_SUBTITLE);
        }
        if ((i & 256) != 0) {
            arrayList.add("sign");
        }
        if ((i & 512) != 0) {
            arrayList.add("describes-video");
        }
        if ((i & 1024) != 0) {
            arrayList.add("describes-music");
        }
        if ((i & 2048) != 0) {
            arrayList.add("enhanced-intelligibility");
        }
        if ((i & 4096) != 0) {
            arrayList.add("transcribes-dialog");
        }
        if ((i & 8192) != 0) {
            arrayList.add("easy-read");
        }
        if ((i & 16384) != 0) {
            arrayList.add("trick-play");
        }
        return arrayList;
    }

    public static long RemoteActionCompatParcelizer(long j) {
        if (j == C.TIME_UNSET) {
            return System.currentTimeMillis();
        }
        return SystemClock.elapsedRealtime() + j;
    }

    public static <T> void AudioAttributesCompatParcelizer(List<T> list, int i, int i2, int i3) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i4 = (i2 - i) - 1; i4 >= 0; i4--) {
            arrayDeque.addFirst(list.remove(i + i4));
        }
        list.addAll(Math.min(i3, list.size()), arrayDeque);
    }

    public static int AudioAttributesCompatParcelizer(String str) {
        String[] strArrAudioAttributesCompatParcelizer;
        int length;
        int i = 0;
        if (str == null || (length = (strArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = strArrAudioAttributesCompatParcelizer[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrAudioAttributesCompatParcelizer[length - 2]);
        try {
            i = Integer.parseInt((String) buildTypeSerializer.IconCompatParcelizer(str2));
            if (z) {
                return -i;
            }
        } catch (NumberFormatException unused) {
        }
        return i;
    }

    public static boolean MediaBrowserCompatCustomActionResultReceiver(Context context) {
        int i = MediaBrowserCompatCustomActionResultReceiver;
        if (i < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i != 30) {
            return false;
        }
        String str = MediaBrowserCompatItemReceiver;
        return parseMdhd.write(str, "moto g(20)") || parseMdhd.write(str, "rmx3231");
    }

    public static int IconCompatParcelizer(Context context) {
        return MediaBrowserCompatCustomActionResultReceiver(context) ? 1 : 5;
    }

    public static String write(int i) {
        if (i == 0) {
            return "NO";
        }
        if (i == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static isUnsafeBaseType.read read(isUnsafeBaseType isunsafebasetype, isUnsafeBaseType.read readVar) {
        boolean sessionImpl = isunsafebasetype.setSessionImpl();
        boolean zMediaBrowserCompatItemReceiver = isunsafebasetype.MediaBrowserCompatItemReceiver();
        boolean z = isunsafebasetype.read();
        boolean zWrite = isunsafebasetype.write();
        boolean zMediaBrowserCompatCustomActionResultReceiver = isunsafebasetype.MediaBrowserCompatCustomActionResultReceiver();
        boolean zAudioAttributesCompatParcelizer = isunsafebasetype.AudioAttributesCompatParcelizer();
        boolean zRemoteActionCompatParcelizer = isunsafebasetype.onPrepare().RemoteActionCompatParcelizer();
        boolean z2 = !sessionImpl;
        boolean z3 = false;
        isUnsafeBaseType.read.C0120read c0120readIconCompatParcelizer = new isUnsafeBaseType.read.C0120read().IconCompatParcelizer(readVar).IconCompatParcelizer(4, z2).IconCompatParcelizer(5, zMediaBrowserCompatItemReceiver && !sessionImpl).IconCompatParcelizer(6, z && !sessionImpl).IconCompatParcelizer(7, !zRemoteActionCompatParcelizer && (z || !zMediaBrowserCompatCustomActionResultReceiver || zMediaBrowserCompatItemReceiver) && !sessionImpl).IconCompatParcelizer(8, zWrite && !sessionImpl).IconCompatParcelizer(9, !zRemoteActionCompatParcelizer && (zWrite || (zMediaBrowserCompatCustomActionResultReceiver && zAudioAttributesCompatParcelizer)) && !sessionImpl).IconCompatParcelizer(10, z2).IconCompatParcelizer(11, zMediaBrowserCompatItemReceiver && !sessionImpl);
        if (zMediaBrowserCompatItemReceiver && !sessionImpl) {
            z3 = true;
        }
        return c0120readIconCompatParcelizer.IconCompatParcelizer(12, z3).read();
    }

    public static Drawable read(Context context, Resources resources, int i) {
        if (MediaBrowserCompatCustomActionResultReceiver >= 21) {
            return read.read(context, resources, i);
        }
        return resources.getDrawable(i);
    }

    public static String AudioAttributesImplApi26Parcelizer(int i) {
        return Integer.toString(i, 36);
    }

    public static boolean RemoteActionCompatParcelizer(isUnsafeBaseType isunsafebasetype, boolean z) {
        return isunsafebasetype == null || !isunsafebasetype.onPrepareFromUri() || isunsafebasetype.onRewind() == 1 || isunsafebasetype.onRewind() == 4 || (z && isunsafebasetype.onSeekTo() != 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean AudioAttributesCompatParcelizer(kotlin.isUnsafeBaseType r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.onRewind()
            r2 = 1
            if (r1 != r2) goto L16
            r3 = 2
            boolean r3 = r4.write(r3)
            if (r3 == 0) goto L16
            r4.onSkipToQueueItem()
            goto L22
        L16:
            r3 = 4
            if (r1 != r3) goto L23
            boolean r1 = r4.write(r3)
            if (r1 == 0) goto L23
            r4.MediaMetadataCompat()
        L22:
            r0 = r2
        L23:
            boolean r1 = r4.write(r2)
            if (r1 == 0) goto L2d
            r4.AudioAttributesImplApi26Parcelizer()
            return r2
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(o.isUnsafeBaseType):boolean");
    }

    public static boolean write(isUnsafeBaseType isunsafebasetype) {
        if (isunsafebasetype == null || !isunsafebasetype.write(1)) {
            return false;
        }
        isunsafebasetype.AudioAttributesImplApi21Parcelizer();
        return true;
    }

    public static boolean IconCompatParcelizer(isUnsafeBaseType isunsafebasetype, boolean z) {
        if (RemoteActionCompatParcelizer(isunsafebasetype, z)) {
            return AudioAttributesCompatParcelizer(isunsafebasetype);
        }
        return write(isunsafebasetype);
    }

    private static String MediaBrowserCompatItemReceiver(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            prune.read("Util", "Failed to read system property ".concat(String.valueOf(str)), e);
            return null;
        }
    }

    private static void AudioAttributesCompatParcelizer(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    private static String[] AudioAttributesImplBaseParcelizer() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (MediaBrowserCompatCustomActionResultReceiver >= 24) {
            return write(configuration);
        }
        return new String[]{AudioAttributesCompatParcelizer(configuration.locale)};
    }

    private static String[] write(Configuration configuration) {
        return AudioAttributesCompatParcelizer(configuration.getLocales().toLanguageTags(), ",");
    }

    private static String IconCompatParcelizer(Locale locale) {
        return locale.toLanguageTag();
    }

    private static HashMap<String, String> AudioAttributesImplApi26Parcelizer() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> map = new HashMap<>(iSOLanguages.length + MediaDescriptionCompat.length);
        int i = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = MediaDescriptionCompat;
            if (i >= strArr.length) {
                return map;
            }
            map.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    private static String MediaDescriptionCompat(String str) {
        int i = 0;
        while (true) {
            String[] strArr = MediaBrowserCompatMediaItem;
            if (i >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i])) {
                StringBuilder sb = new StringBuilder();
                sb.append(strArr[i + 1]);
                sb.append(str.substring(strArr[i].length()));
                return sb.toString();
            }
            i += 2;
        }
    }

    static final class read {
        public static Drawable read(Context context, Resources resources, int i) {
            return resources.getDrawable(i, context.getTheme());
        }
    }
}
