package kotlin;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001d\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001e\u0010\u0019R\u001a\u0010#\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b#\u0010\u0019R\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b\u001f\u0010\u0019R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b$\u0010\u0019R\u001a\u0010 \u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b \u0010'R\u001a\u0010\u001c\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b(\u0010\u0017R\u001a\u0010%\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010\u0017R\u001c\u0010(\u001a\u00020\u00058\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b\u001d\u0010\u0017R\u001c\u0010)\u001a\u00020\u000f8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u001d\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010,\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b%\u0010\u0019"}, d2 = {"Lo/createEglDisplay;", "", "", "p0", "p1", "", "p2", "p3", "p4", "p5", "", "p6", "p7", "p8", "p9", "", "p10", "p11", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DIIIZLjava/lang/String;)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "MediaMetadataCompat", "Ljava/lang/String;", "AudioAttributesImplApi21Parcelizer", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "I", "MediaBrowserCompatCustomActionResultReceiver", "read", "write", "AudioAttributesImplBaseParcelizer", "D", "()D", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatMediaItem", "MediaDescriptionCompat", "Z", "MediaBrowserCompatSearchResultReceiver", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class createEglDisplay {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;
    private final int AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int read;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final double AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private boolean MediaBrowserCompatMediaItem;
    private final String MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final String MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private int MediaBrowserCompatItemReceiver;
    private static final byte[] $$c = {TarConstants.LF_NORMAL, -59, 73, 39};
    private static final int $$f = 88;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {14, -10, 42, -103, 13, 4, -3, -19, -8, -2, -5, 15, 36, -34, -17, 11, -6, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13, 2, -15, -26, 0, -11};
    private static final int $$e = 35;
    private static final byte[] $$a = {9, -88, -121, TarConstants.LF_FIFO, 15, -8, 16, -1, -4, -3, -52, TarConstants.LF_CONTIG, 14, 1, 8, -13, 11, 8, -68, 68, -1, -61, 21, TarConstants.LF_LINK, 2, -2, -1, -4, 0, 21, -9, 8, 1, -35, 39, -6, 11, -1, 21, -17, -27, 39, 11, -7, 23, -19, -49, 64, -9, 15, -5, -55, 40, 22, 12, -11, -2, 5, 3, -17, 19, 4, -5, -5, 2, 13, 7, -4, 7};
    private static final int $$b = 43;
    private static int onAddQueueItem = 0;
    private static int handleMediaPlayPauseIfPendingOnHandler = 1;
    private static char[] MediaBrowserCompatSearchResultReceiver = {56429, 12295, 1186, 6481, 28151, 16796, 22070, 43745, 48967, 37870, 59280, 62511, 51413, 56643, 12798, 1481, 6687, 28374, 17272, 22279, 43917, 47165, 36054, 17875, 43444, 40202, 32971, 62529, 55342, 53121, 13078, 9979, 2652, 32264, 28034, 20837, 17648, 60417, 'f', 13528, 10504, 23938, 29167, 26196, 39628, 36653, 41866, 55264, 50264, 63669, 60713, 425, 13795, 10832, 24252, 23899, 45347, 34241, 39016, 60630, 49313, 55041, 11208, 15987, 4807, 26298, 29975, 18934, 23661, 45256, 33971, 56409, 12349, 1152, 6414, 28064, 56394, 12296, 1199, 6479, 28157, 16785, 22130, 43707, 48971, 37793, 59293, 62505, 51413, 56652, 12798, 1410, 6780, 28376, 17206, 22275, 43930, 47146, 36033, 57722, 62727, 51618, 56928, 56444, 12296, 1189, 6472, 28153, 16786, 22071, 43765, 56429, 12295, 1186, 6481, 28151, 16796, 22070, 43745, 48965, 37873, 59278, 62581, 51409, 56649, 12775, 1422, 6706, 28311, 17234, 22294, 43934, 47148, 36033, 57722, 62756, 51646, 56866, 12994, 1891, 6916, 28567, 31830, 20674, 42344, 47361, 36262, 57930, 56427, 12300, 1202, 6498, 28155, 16769, 22075, 43705, 48961, 37824, 59290, 62518, 51417, 56643, 12793, 64134, 5881, 8821, 16306, 19220, 26480, 28888, 35904, 39330, 46381, 49514, 53974, 60982, 64444, 5928, 9076, 15567, 56355, 12302, 1203, 6470, 28139, 16769, 22045, 43676, 49005, 37871, 59288, 62516, 56355, 12301, 1191, 6487, 28153, 16858, 22070, 43694, 48976, 37856, 59345, 62520, 51423, 56640, 12708, 1412, 6704, 28374, 17272, 22294, 43974, 47140, 36044, 57723, 62726, 51646, 56871, 13007, 1838, 6937, 28591, 31830, 20672, 42279, 47381, 36275, 57945, 63222, 51863, 57152, 13234, 'L', 19702, 41177, 37991, 35221, 64866, 53577, 50921, 14963, 12165, 890, 30559, 25831, 22545, 19865, 41265, 38172, 35578, 65028};
    private static long RatingCompat = -2114412234474573719L;
    private static char[] MediaDescriptionCompat = {44990, 45020, 44831, 44828, 45030, 44889, 44943, 44810, 44674, 44684, 44869, 44893, 44984, 45036, 45038, 45036, 45037, 45032, 45026, 44997, 44995, 45026, 45027, 45025, 45029, 45025, 44992, 44999, 45028, 45027, 44996, 44986, 45032, 45037, 45036, 45038, 45036, 44997, 44996, 45027, 45028, 44999, 45005, 45037, 45027, 45025, 45050, 45030, 45036, 44995, 44997, 44951, 44984, 45038, 45031, 45029, 45036, 45038, 45032, 45037, 45029, 45031, 45024, 45036, 45028, 44990, 45029, 45054, 45025, 45014, 45034, 45027, 45030, 45049, 45052, 45036, 45033, 45030, 45036, 45036, 45038, 44984, 45027, 45037, 45021, 45035, 45051, 45027, 45027, 45028, 45029, 45028, 45028, 45011, 44978, 45019, 45051, 45027, 45030, 45051, 45028, 45027, 44994, 44995, 45036, 45030, 45050, 45025, 45027, 45037, 44812, 44698, 44703, 44696, 44697, 44688, 44915, 44927, 44698, 44697, 44688, 44695, 44695, 44914, 44923, 44673, 44675, 44677, 44690, 44698, 45009, 44853, 44853, 44823, 44820, 44861, 44853, 44853, 44823, 44820, 44861, 44853, 44853, 44823, 44820, 44852, 44873, 44840, 44821, 44851, 44855, 44866, 44834, 44822, 44854, 44852, 44874, 44879, 44875, 44849, 44820, 44845, 44873, 44875, 44852, 44860};

    private static String $$g(short s, short s2, short s3) {
        int i = 3 - (s2 * 3);
        byte[] bArr = $$c;
        int i2 = (s3 * 2) + 101;
        int i3 = s * 4;
        byte[] bArr2 = new byte[1 - i3];
        int i4 = 0 - i3;
        int i5 = -1;
        if (bArr == null) {
            i2 = i4 + i2;
        }
        while (true) {
            i5++;
            i++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i2 += bArr[i];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 65 - r8
            int r0 = 34 - r7
            byte[] r1 = kotlin.createEglDisplay.$$a
            int r6 = r6 * 3
            int r6 = r6 + 97
            byte[] r0 = new byte[r0]
            int r7 = 33 - r7
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2b:
            int r6 = r6 + r8
            int r6 = r6 + (-2)
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createEglDisplay.b(byte, int, short, java.lang.Object[]):void");
    }

    private static void c(byte b, int i, int i2, Object[] objArr) {
        byte[] bArr = $$d;
        int i3 = i2 + 4;
        int i4 = b + 75;
        byte[] bArr2 = new byte[28 - i];
        int i5 = 27 - i;
        int i6 = -1;
        if (bArr == null) {
            i4 = (-i4) + i5;
            i3 = i3;
            i6 = -1;
        }
        while (true) {
            int i7 = i3 + 1;
            int i8 = i6 + 1;
            bArr2[i8] = (byte) i4;
            if (i8 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i4 = (-bArr[i7]) + i4;
            i3 = i7;
            i6 = i8;
        }
    }

    public createEglDisplay(String str, String str2, int i, String str3, String str4, String str5, double d, int i2, int i3, int i4, boolean z, String str6) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.read = i;
        this.AudioAttributesCompatParcelizer = str3;
        this.write = str4;
        this.MediaBrowserCompatCustomActionResultReceiver = str5;
        this.AudioAttributesImplApi26Parcelizer = d;
        this.AudioAttributesImplApi21Parcelizer = i2;
        this.AudioAttributesImplBaseParcelizer = i3;
        this.MediaBrowserCompatItemReceiver = i4;
        this.MediaBrowserCompatMediaItem = z;
        this.MediaBrowserCompatSearchResultReceiver = str6;
    }

    public final String AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = onAddQueueItem;
        int i3 = i2 + 121;
        handleMediaPlayPauseIfPendingOnHandler = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.IconCompatParcelizer;
        int i4 = i2 + 97;
        handleMediaPlayPauseIfPendingOnHandler = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return str;
    }

    public final String AudioAttributesCompatParcelizer() {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 77;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        String str = this.RemoteActionCompatParcelizer;
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        return str;
    }

    public final int MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 95;
        onAddQueueItem = i2 % 128;
        if (i2 % 2 == 0) {
            return this.read;
        }
        throw null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        createEglDisplay createegldisplay = (createEglDisplay) objArr[0];
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 57;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        String str = createegldisplay.AudioAttributesCompatParcelizer;
        if (i3 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 65;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        if (i2 % 2 != 0) {
            return this.write;
        }
        throw null;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = onAddQueueItem;
        int i3 = i2 + 125;
        handleMediaPlayPauseIfPendingOnHandler = i3 % 128;
        int i4 = i3 % 2;
        String str = this.MediaBrowserCompatCustomActionResultReceiver;
        int i5 = i2 + 77;
        handleMediaPlayPauseIfPendingOnHandler = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final double AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 87;
        int i3 = i2 % 128;
        onAddQueueItem = i3;
        int i4 = i2 % 2;
        double d = this.AudioAttributesImplApi26Parcelizer;
        int i5 = i3 + 25;
        handleMediaPlayPauseIfPendingOnHandler = i5 % 128;
        int i6 = i5 % 2;
        return d;
    }

    public final int MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 69;
        int i3 = i2 % 128;
        onAddQueueItem = i3;
        int i4 = i2 % 2;
        int i5 = this.AudioAttributesImplApi21Parcelizer;
        int i6 = i3 + 29;
        handleMediaPlayPauseIfPendingOnHandler = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = onAddQueueItem;
        int i3 = i2 + 107;
        handleMediaPlayPauseIfPendingOnHandler = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.AudioAttributesImplBaseParcelizer;
        int i6 = i2 + 81;
        handleMediaPlayPauseIfPendingOnHandler = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 25;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.MediaBrowserCompatItemReceiver;
        if (i3 != 0) {
            int i5 = 60 / 0;
        }
        return i4;
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler;
        int i3 = i2 + 101;
        onAddQueueItem = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.MediaBrowserCompatMediaItem;
        int i5 = i2 + 23;
        onAddQueueItem = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 111;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        if (i2 % 2 != 0) {
            return this.MediaBrowserCompatSearchResultReceiver;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i4 = $10 + 67;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(MediaBrowserCompatSearchResultReceiver[i + i6])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (36621 - View.MeasureSpec.getMode(0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2339, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 27, 480654850, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(RatingCompat), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), KeyEvent.normalizeMetaState(0) + 9701, 27 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (AndroidCharacter.getMirror('0') - '0'), (-16753432) - Color.rgb(0, 0, 0), TextUtils.lastIndexOf("", '0', 0) + 34, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i7 = $11 + 1;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[downloadService.write] = (char) jArr[downloadService.write];
                Object[] objArr5 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 23784 - TextUtils.getCapsMode("", 0, 0), 33 - (Process.myPid() >> 22), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                obj.hashCode();
                throw null;
            }
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr6 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer5 == null) {
                objRemoteActionCompatParcelizer5 = startForeground.read((char) (ViewConfiguration.getPressedStateDuration() >> 16), 23784 - (ViewConfiguration.getLongPressTimeout() >> 16), 33 - View.getDefaultSize(0, 0), -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
    }

    private static void d(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = MediaDescriptionCompat;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) - 1), 11613 - (ViewConfiguration.getEdgeSlop() >> 16), 20 - (ViewConfiguration.getLongPressTimeout() >> 16), -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i6++;
                    int i7 = $10 + 113;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 3 % 2;
                    }
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                int i9 = $10 + 87;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i11 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getTrimmedLength(""), Color.red(0) + 22959, 42 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (31589 - View.MeasureSpec.makeMeasureSpec(0, 0)), 9863 - TextUtils.indexOf("", "", 0), TextUtils.indexOf("", "", 0) + 65, 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                try {
                    Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (Color.green(0) + 37822), 9755 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 27, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                    int i13 = $11 + 97;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i15 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i15, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i15);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i3 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i16 = $11 + 115;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 1;
            } else {
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            }
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int iHashCode;
        int i7 = (~(i2 | i6)) | i3;
        int i8 = ~i2;
        int i9 = ~((~i3) | i8 | i6);
        int i10 = (~(i6 | i3)) | (~(i8 | (~i6)));
        int i11 = i2 + i3 + i + (1616745821 * i5) + (2077170981 * i4);
        int i12 = i11 * i11;
        int i13 = ((-162656556) * i2) + 1587019776 + (806482222 * i3) + ((-484569389) * i7) + (i9 * 484569389) + (484569389 * i10) + (321912832 * i) + ((-395313152) * i5) + (904921088 * i4) + (345505792 * i12);
        int i14 = (i2 * (-1558553916)) + 318941677 + (i3 * (-1558553002)) + (i7 * (-457)) + (i9 * 457) + (i10 * 457) + (i * (-1558553459)) + (i5 * 397062201) + (i4 * 609114465) + (i12 * (-138936320));
        if (i13 + (i14 * i14 * 1630011392) == 1) {
            return write(objArr);
        }
        createEglDisplay createegldisplay = (createEglDisplay) objArr[0];
        int i15 = 2 % 2;
        int i16 = handleMediaPlayPauseIfPendingOnHandler + 41;
        onAddQueueItem = i16 % 128;
        int i17 = i16 % 2;
        int iHashCode2 = createegldisplay.IconCompatParcelizer.hashCode();
        String str = createegldisplay.RemoteActionCompatParcelizer;
        if (str == null) {
            int i18 = onAddQueueItem + 105;
            handleMediaPlayPauseIfPendingOnHandler = i18 % 128;
            int i19 = i18 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i20 = handleMediaPlayPauseIfPendingOnHandler + 51;
            onAddQueueItem = i20 % 128;
            int i21 = i20 % 2;
        }
        int iHashCode3 = Integer.hashCode(createegldisplay.read);
        int iHashCode4 = createegldisplay.AudioAttributesCompatParcelizer.hashCode();
        int iHashCode5 = createegldisplay.write.hashCode();
        String str2 = createegldisplay.MediaBrowserCompatCustomActionResultReceiver;
        int iHashCode6 = (((((((((((((((((((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Double.hashCode(createegldisplay.AudioAttributesImplApi26Parcelizer)) * 31) + Integer.hashCode(createegldisplay.AudioAttributesImplApi21Parcelizer)) * 31) + Integer.hashCode(createegldisplay.AudioAttributesImplBaseParcelizer)) * 31) + Integer.hashCode(createegldisplay.MediaBrowserCompatItemReceiver)) * 31) + Boolean.hashCode(createegldisplay.MediaBrowserCompatMediaItem)) * 31) + createegldisplay.MediaBrowserCompatSearchResultReceiver.hashCode();
        int i22 = onAddQueueItem + 45;
        handleMediaPlayPauseIfPendingOnHandler = i22 % 128;
        int i23 = i22 % 2;
        return Integer.valueOf(iHashCode6);
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 35;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof createEglDisplay)) {
            return false;
        }
        createEglDisplay createegldisplay = (createEglDisplay) p0;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) createegldisplay.IconCompatParcelizer) || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) createegldisplay.RemoteActionCompatParcelizer)) {
            return false;
        }
        if (this.read != createegldisplay.read) {
            int i4 = handleMediaPlayPauseIfPendingOnHandler + 83;
            onAddQueueItem = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) createegldisplay.AudioAttributesCompatParcelizer)) || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) createegldisplay.write)) {
            return false;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) createegldisplay.MediaBrowserCompatCustomActionResultReceiver)) {
            int i6 = onAddQueueItem + 115;
            handleMediaPlayPauseIfPendingOnHandler = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Double.compare(this.AudioAttributesImplApi26Parcelizer, createegldisplay.AudioAttributesImplApi26Parcelizer) != 0) {
            int i8 = onAddQueueItem + 83;
            handleMediaPlayPauseIfPendingOnHandler = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.AudioAttributesImplApi21Parcelizer != createegldisplay.AudioAttributesImplApi21Parcelizer || this.AudioAttributesImplBaseParcelizer != createegldisplay.AudioAttributesImplBaseParcelizer || this.MediaBrowserCompatItemReceiver != createegldisplay.MediaBrowserCompatItemReceiver || this.MediaBrowserCompatMediaItem != createegldisplay.MediaBrowserCompatMediaItem) {
            return false;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatSearchResultReceiver, (Object) createegldisplay.MediaBrowserCompatSearchResultReceiver)) {
            return true;
        }
        int i10 = handleMediaPlayPauseIfPendingOnHandler + 17;
        int i11 = i10 % 128;
        onAddQueueItem = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 113;
        handleMediaPlayPauseIfPendingOnHandler = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public final String read() {
        int iRemoteActionCompatParcelizer = logAssumedSupport.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = logAssumedSupport.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = logAssumedSupport.RemoteActionCompatParcelizer();
        return (String) RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer2, 1804388920, -1804388919, logAssumedSupport.RemoteActionCompatParcelizer(), new Object[]{this}, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        int iRemoteActionCompatParcelizer = logAssumedSupport.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = logAssumedSupport.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = logAssumedSupport.RemoteActionCompatParcelizer();
        return ((Integer) RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer2, -722683095, 722683095, logAssumedSupport.RemoteActionCompatParcelizer(), new Object[]{this}, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer)).intValue();
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.IconCompatParcelizer;
        String str2 = this.RemoteActionCompatParcelizer;
        int i2 = this.read;
        String str3 = this.AudioAttributesCompatParcelizer;
        String str4 = this.write;
        String str5 = this.MediaBrowserCompatCustomActionResultReceiver;
        double d = this.AudioAttributesImplApi26Parcelizer;
        int i3 = this.AudioAttributesImplApi21Parcelizer;
        int i4 = this.AudioAttributesImplBaseParcelizer;
        int i5 = this.MediaBrowserCompatItemReceiver;
        boolean z = this.MediaBrowserCompatMediaItem;
        String str6 = this.MediaBrowserCompatSearchResultReceiver;
        StringBuilder sb = new StringBuilder("createEglDisplay(IconCompatParcelizer=");
        sb.append(str);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str2);
        sb.append(", read=");
        sb.append(i2);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(str3);
        sb.append(", write=");
        sb.append(str4);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(str5);
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        sb.append(d);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(i3);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(i4);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(i5);
        sb.append(", MediaBrowserCompatMediaItem=");
        sb.append(z);
        sb.append(", MediaBrowserCompatSearchResultReceiver=");
        sb.append(str6);
        sb.append(")");
        String string = sb.toString();
        int i6 = handleMediaPlayPauseIfPendingOnHandler + 65;
        onAddQueueItem = i6 % 128;
        if (i6 % 2 == 0) {
            return string;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0ced  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0d48 A[Catch: Exception -> 0x0d96, all -> 0x0df0, IOException -> 0x0df9, TryCatch #0 {IOException -> 0x0df9, blocks: (B:188:0x0d7b, B:190:0x0d81, B:191:0x0d82, B:109:0x0b03, B:110:0x0b06, B:112:0x0b14, B:113:0x0b54, B:115:0x0b6a, B:116:0x0bb1, B:118:0x0bc3, B:120:0x0bde, B:122:0x0c01, B:124:0x0c21, B:126:0x0cad, B:128:0x0cc7, B:197:0x0d96, B:198:0x0def, B:155:0x0d1d, B:156:0x0d20, B:160:0x0d28, B:162:0x0d30, B:163:0x0d31, B:171:0x0d41, B:173:0x0d48, B:174:0x0d49, B:182:0x0d68, B:184:0x0d6e, B:185:0x0d6f), top: B:290:0x0b03 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0d49 A[Catch: Exception -> 0x0d96, all -> 0x0df0, IOException -> 0x0df9, TryCatch #0 {IOException -> 0x0df9, blocks: (B:188:0x0d7b, B:190:0x0d81, B:191:0x0d82, B:109:0x0b03, B:110:0x0b06, B:112:0x0b14, B:113:0x0b54, B:115:0x0b6a, B:116:0x0bb1, B:118:0x0bc3, B:120:0x0bde, B:122:0x0c01, B:124:0x0c21, B:126:0x0cad, B:128:0x0cc7, B:197:0x0d96, B:198:0x0def, B:155:0x0d1d, B:156:0x0d20, B:160:0x0d28, B:162:0x0d30, B:163:0x0d31, B:171:0x0d41, B:173:0x0d48, B:174:0x0d49, B:182:0x0d68, B:184:0x0d6e, B:185:0x0d6f), top: B:290:0x0b03 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0d6e A[Catch: Exception -> 0x0d96, all -> 0x0df0, IOException -> 0x0df9, TryCatch #0 {IOException -> 0x0df9, blocks: (B:188:0x0d7b, B:190:0x0d81, B:191:0x0d82, B:109:0x0b03, B:110:0x0b06, B:112:0x0b14, B:113:0x0b54, B:115:0x0b6a, B:116:0x0bb1, B:118:0x0bc3, B:120:0x0bde, B:122:0x0c01, B:124:0x0c21, B:126:0x0cad, B:128:0x0cc7, B:197:0x0d96, B:198:0x0def, B:155:0x0d1d, B:156:0x0d20, B:160:0x0d28, B:162:0x0d30, B:163:0x0d31, B:171:0x0d41, B:173:0x0d48, B:174:0x0d49, B:182:0x0d68, B:184:0x0d6e, B:185:0x0d6f), top: B:290:0x0b03 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0d6f A[Catch: Exception -> 0x0d96, all -> 0x0df0, IOException -> 0x0df9, TryCatch #0 {IOException -> 0x0df9, blocks: (B:188:0x0d7b, B:190:0x0d81, B:191:0x0d82, B:109:0x0b03, B:110:0x0b06, B:112:0x0b14, B:113:0x0b54, B:115:0x0b6a, B:116:0x0bb1, B:118:0x0bc3, B:120:0x0bde, B:122:0x0c01, B:124:0x0c21, B:126:0x0cad, B:128:0x0cc7, B:197:0x0d96, B:198:0x0def, B:155:0x0d1d, B:156:0x0d20, B:160:0x0d28, B:162:0x0d30, B:163:0x0d31, B:171:0x0d41, B:173:0x0d48, B:174:0x0d49, B:182:0x0d68, B:184:0x0d6e, B:185:0x0d6f), top: B:290:0x0b03 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x1318 A[PHI: r3 r4
      0x1318: PHI (r3v5 java.lang.String[]) = (r3v4 java.lang.String[]), (r3v4 java.lang.String[]), (r3v9 java.lang.String[]) binds: [B:214:0x0f30, B:216:0x0fa1, B:356:0x1318] A[DONT_GENERATE, DONT_INLINE]
      0x1318: PHI (r4v19 int) = (r4v17 int), (r4v17 int), (r4v23 int) binds: [B:214:0x0f30, B:216:0x0fa1, B:356:0x1318] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0521 A[PHI: r3 r7
      0x0521: PHI (r3v62 int) = (r3v61 int), (r3v98 int) binds: [B:23:0x03e6, B:345:0x0521] A[DONT_GENERATE, DONT_INLINE]
      0x0521: PHI (r7v47 int) = (r7v8 int), (r7v137 int) binds: [B:23:0x03e6, B:345:0x0521] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x05ae  */
    /* JADX WARN: Type inference failed for: r3v76 */
    /* JADX WARN: Type inference failed for: r3v83 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] write(android.content.Context r46, int r47, int r48, int r49) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6972
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createEglDisplay.write(android.content.Context, int, int, int):java.lang.Object[]");
    }
}
