package kotlin;

import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.WalletWalletOptionsBuilder;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001a\u0010$\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010*\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010'\u001a\u0004\b)\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010\u001aR\u001a\u0010-\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\u001f\u0010\u0018R\u001a\u0010&\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b*\u0010\u0018R\u001a\u0010,\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010.\u001a\u0004\b \u0010\u0018R\u001a\u0010)\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b(\u0010\u001aR\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u001a\u0010+\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001c\u001a\u0004\b&\u0010\u001eR\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b-\u0010\u001e"}, d2 = {"Lo/setEnvironment;", "", "", "p0", "p1", "Lo/WalletWalletOptionsBuilder;", "p2", "", "p3", "p4", "p5", "", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "<init>", "(ZZLo/WalletWalletOptionsBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;ZZZ)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "MediaBrowserCompatCustomActionResultReceiver", "Z", "MediaBrowserCompatMediaItem", "()Z", "IconCompatParcelizer", "write", "MediaBrowserCompatSearchResultReceiver", "RatingCompat", "Lo/WalletWalletOptionsBuilder;", "RemoteActionCompatParcelizer", "()Lo/WalletWalletOptionsBuilder;", "AudioAttributesImplApi21Parcelizer", "Ljava/lang/String;", "AudioAttributesCompatParcelizer", "MediaBrowserCompatItemReceiver", "read", "MediaMetadataCompat", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer", "I"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class setEnvironment {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean RatingCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;
    private final String MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final String MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final WalletWalletOptionsBuilder RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final boolean MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final boolean MediaMetadataCompat;
    private final boolean write;
    private static final byte[] $$c = {TarConstants.LF_NORMAL, -59, 73, 39};
    private static final int $$d = 24;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {67, -110, -113, 74, -11, -2, 5, -3, -7, 13, -13};
    private static final int $$b = 245;
    private static int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 0;
    private static int onCustomAction = 1;
    private static char[] MediaDescriptionCompat = {56424, 1510, 28522, 20706, 47697, 58276, 50494, 11904, 56424, 1510, 28522, 20711, 47705, 58283, 50483, 56422, 1506, 28516, 20672, 47646, 58283, 50487, 11915, 4115, 31269, 41934, 34113, 61130, 53280, 14761, 25356, 17566, 44575, 36967, 56444, 1521, 28539, 20687, 47684, 58260, 50466, 11908, 4119, 31328, 41934, 34139, 61145, 53292, 14779, 56354, 59024, 16144, 21899, 27182, 32930, 55635, 65487, 5174, 10984, 16518, 39191, 49146, 54276, 60113, 855, 23033, 32375, 38119, 43659, 49941, 6537, 15906, 21705, 27981, 33784, 55394, 56431, 1526, 28512, 20691, 47701, 58281, 50466, 11940, 4100, 31355, 41974, 34112, 61147, 53294, 14762, 25348, 17555, 44573, 56429, 1517, 28534, 20691, 47711, 58286, 50482, 11979, 4119, 31332, 41972, 34141, 61149, 53281, 14762, 25411, 17599, 44572, 36972, 63973, 9029, 1231, 28210, 56427, 1510, 28518, 20721, 47697, 58276, 50493, 11908, 4115, 31342, 41945, 34118, 61148, 53290, 14734, 25356, 17544, 44571};
    private static long MediaBrowserCompatSearchResultReceiver = -8537540511890733693L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(int r6, short r7, short r8) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 101
            byte[] r0 = kotlin.setEnvironment.$$c
            int r6 = r6 * 4
            int r1 = r6 + 1
            int r8 = r8 * 3
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2a:
            int r7 = -r7
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setEnvironment.$$e(int, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 5
            int r7 = 119 - r7
            int r8 = r8 * 3
            int r8 = r8 + 4
            int r0 = r6 + 4
            byte[] r1 = kotlin.setEnvironment.$$a
            byte[] r0 = new byte[r0]
            int r6 = r6 + 3
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L26
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
            int r7 = r7 + r8
            int r7 = r7 + (-2)
            int r8 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setEnvironment.b(short, int, byte, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object read(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i4;
        int i8 = (~(i7 | i6)) | i5;
        int i9 = ~i5;
        int i10 = ~(i9 | i6 | i4);
        int i11 = (~(i4 | i9)) | i6 | (~(i7 | i5));
        int i12 = i6 + i5 + i2 + ((-381402339) * i) + ((-2062754392) * i3);
        int i13 = i12 * i12;
        int i14 = (1317609343 * i6) + 1063714816 + (1288888451 * i5) + (i8 * 14360446) + (14360446 * i10) + ((-14360446) * i11) + (1303248896 * i2) + (1454768128 * i) + (808452096 * i3) + ((-1790509056) * i13);
        int i15 = ((i6 * (-1355236691)) - 921838429) + (i5 * (-1355236103)) + (i8 * (-294)) + (i10 * (-294)) + (i11 * 294) + (i2 * (-1355236397)) + (i * (-1583251481)) + (i3 * 1682205048) + (i13 * (-427491328));
        return i14 + ((i15 * i15) * 844169216) != 1 ? IconCompatParcelizer(objArr) : RemoteActionCompatParcelizer(objArr);
    }

    public setEnvironment(boolean z, boolean z2, WalletWalletOptionsBuilder walletWalletOptionsBuilder, String str, String str2, String str3, int i, int i2, int i3, String str4, boolean z3, boolean z4, boolean z5) {
        toMagicModuleMetaRepoModel.write(walletWalletOptionsBuilder, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        this.IconCompatParcelizer = z;
        this.write = z2;
        this.RemoteActionCompatParcelizer = walletWalletOptionsBuilder;
        this.AudioAttributesCompatParcelizer = str;
        this.read = str2;
        this.MediaBrowserCompatCustomActionResultReceiver = str3;
        this.AudioAttributesImplBaseParcelizer = i;
        this.AudioAttributesImplApi21Parcelizer = i2;
        this.AudioAttributesImplApi26Parcelizer = i3;
        this.MediaBrowserCompatItemReceiver = str4;
        this.MediaBrowserCompatSearchResultReceiver = z3;
        this.MediaMetadataCompat = z4;
        this.RatingCompat = z5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setEnvironment(boolean z, boolean z2, WalletWalletOptionsBuilder walletWalletOptionsBuilder, String str, String str2, String str3, int i, int i2, int i3, String str4, boolean z3, boolean z4, boolean z5, int i4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        boolean z6;
        WalletWalletOptionsBuilder.read readVar;
        String str5;
        String str6;
        String str7;
        boolean z7;
        boolean z8;
        boolean z9 = (i4 & 1) != 0 ? false : z;
        if ((i4 & 2) != 0) {
            int i5 = onCustomAction + 39;
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i5 % 128;
            int i6 = i5 % 2;
            z6 = false;
        } else {
            z6 = z2;
        }
        if ((i4 & 4) != 0) {
            int i7 = onCustomAction + 31;
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i7 % 128;
            int i8 = i7 % 2;
            readVar = WalletWalletOptionsBuilder.read.INSTANCE;
        } else {
            readVar = walletWalletOptionsBuilder;
        }
        String str8 = "";
        if ((i4 & 8) != 0) {
            int i9 = onCustomAction + 51;
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 2 % 2;
            }
            str5 = "";
        } else {
            str5 = str;
        }
        if ((i4 & 16) != 0) {
            int i11 = 2 % 2;
            str6 = "";
        } else {
            str6 = str2;
        }
        if ((i4 & 32) != 0) {
            int i12 = onCustomAction + 61;
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i12 % 128;
            if (i12 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str7 = "";
        } else {
            str7 = str3;
        }
        int i13 = (i4 & 64) != 0 ? -1 : i;
        int i14 = (i4 & 128) != 0 ? 0 : i2;
        int i15 = (i4 & 256) != 0 ? 0 : i3;
        if ((i4 & 512) != 0) {
            int i16 = onCustomAction + 59;
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i16 % 128;
            int i17 = i16 % 2;
        } else {
            str8 = str4;
        }
        if ((i4 & 1024) != 0) {
            int i18 = 2 % 2;
            z7 = false;
        } else {
            z7 = z3;
        }
        if ((i4 & 2048) != 0) {
            int i19 = onCustomAction + 101;
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i19 % 128;
            int i20 = i19 % 2;
            int i21 = 2 % 2;
            z8 = false;
        } else {
            z8 = z4;
        }
        this(z9, z6, readVar, str5, str6, str7, i13, i14, i15, str8, z7, z8, (i4 & 4096) == 0 ? z5 : false);
    }

    public final boolean MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int i3 = i2 + 47;
        onCustomAction = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.IconCompatParcelizer;
        if (i4 == 0) {
            int i5 = 64 / 0;
        }
        int i6 = i2 + 15;
        onCustomAction = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        setEnvironment setenvironment = (setEnvironment) objArr[0];
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int i3 = i2 + 45;
        onCustomAction = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        boolean z = setenvironment.write;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 111;
        onCustomAction = i5 % 128;
        if (i5 % 2 != 0) {
            return Boolean.valueOf(z);
        }
        throw null;
    }

    public final WalletWalletOptionsBuilder RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = i2 + 99;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        WalletWalletOptionsBuilder walletWalletOptionsBuilder = this.RemoteActionCompatParcelizer;
        if (i4 != 0) {
            int i5 = 13 / 0;
        }
        int i6 = i2 + 21;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i6 % 128;
        int i7 = i6 % 2;
        return walletWalletOptionsBuilder;
    }

    public final String MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 51;
        int i3 = i2 % 128;
        onCustomAction = i3;
        int i4 = i2 % 2;
        String str = this.read;
        int i5 = i3 + 77;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 115;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        String str = this.MediaBrowserCompatCustomActionResultReceiver;
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        setEnvironment setenvironment = (setEnvironment) objArr[0];
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = i2 + 13;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        int i5 = setenvironment.AudioAttributesImplBaseParcelizer;
        int i6 = i2 + 123;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i6 % 128;
        if (i6 % 2 == 0) {
            return Integer.valueOf(i5);
        }
        throw null;
    }

    public final int read() {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 11;
        int i3 = i2 % 128;
        onCustomAction = i3;
        int i4 = i2 % 2;
        int i5 = this.AudioAttributesImplApi21Parcelizer;
        int i6 = i3 + 79;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 92 / 0;
        }
        return i5;
    }

    public final int write() {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int i3 = i2 + 125;
        onCustomAction = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.AudioAttributesImplApi26Parcelizer;
        int i5 = i2 + 15;
        onCustomAction = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final String AudioAttributesCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onCustomAction + 81;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            return this.MediaBrowserCompatItemReceiver;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 1;
        onCustomAction = i2 % 128;
        if (i2 % 2 != 0) {
            return this.MediaBrowserCompatSearchResultReceiver;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = onCustomAction + 67;
        int i3 = i2 % 128;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i3;
        int i4 = i2 % 2;
        boolean z = this.MediaMetadataCompat;
        int i5 = i3 + 43;
        onCustomAction = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        int i2 = onCustomAction + 51;
        int i3 = i2 % 128;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i3;
        int i4 = i2 % 2;
        boolean z = this.RatingCompat;
        int i5 = i3 + 71;
        onCustomAction = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
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
            int i4 = $11 + 25;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = downloadService.write;
                try {
                    Object[] objArr2 = {Integer.valueOf(MediaDescriptionCompat[i - i5])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) (36621 - View.resolveSizeAndState(0, 0, 0)), Gravity.getAbsoluteGravity(0, 0) + 2340, 28 - (ViewConfiguration.getJumpTapTimeout() >> 16), 480654850, false, $$e(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(MediaBrowserCompatSearchResultReceiver), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 9701, View.MeasureSpec.getSize(0) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {downloadService, downloadService};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (ImageFormat.getBitsPerPixel(0) + 1), Gravity.getAbsoluteGravity(0, 0) + 23784, 34 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = downloadService.write;
                Object[] objArr5 = {Integer.valueOf(MediaDescriptionCompat[i + i6])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 36622), (ViewConfiguration.getEdgeSlop() >> 16) + 2340, (KeyEvent.getMaxKeyCode() >> 16) + 28, 480654850, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(MediaBrowserCompatSearchResultReceiver), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 9701 - KeyEvent.normalizeMetaState(0), 26 - TextUtils.indexOf("", "", 0, 0), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 23784 - View.MeasureSpec.makeMeasureSpec(0, 0), 32 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i7 = $10 + 75;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr8 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer7 == null) {
                objRemoteActionCompatParcelizer7 = startForeground.read((char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 23784, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 32, -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    public setEnvironment() {
        this(false, false, null, null, null, null, 0, 0, 0, null, false, false, false, 8191, null);
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof setEnvironment)) {
            return false;
        }
        setEnvironment setenvironment = (setEnvironment) p0;
        if (this.IconCompatParcelizer != setenvironment.IconCompatParcelizer || this.write != setenvironment.write || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, setenvironment.RemoteActionCompatParcelizer) || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) setenvironment.AudioAttributesCompatParcelizer)) {
            return false;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) setenvironment.read)) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) setenvironment.MediaBrowserCompatCustomActionResultReceiver)) {
                return this.AudioAttributesImplBaseParcelizer == setenvironment.AudioAttributesImplBaseParcelizer && this.AudioAttributesImplApi21Parcelizer == setenvironment.AudioAttributesImplApi21Parcelizer && this.AudioAttributesImplApi26Parcelizer == setenvironment.AudioAttributesImplApi26Parcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) setenvironment.MediaBrowserCompatItemReceiver) && this.MediaBrowserCompatSearchResultReceiver == setenvironment.MediaBrowserCompatSearchResultReceiver && this.MediaMetadataCompat == setenvironment.MediaMetadataCompat && this.RatingCompat == setenvironment.RatingCompat;
            }
            int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 85;
            onCustomAction = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = onCustomAction;
        int i5 = i4 + 27;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 85;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public final int IconCompatParcelizer() {
        int iIconCompatParcelizer = getVariantWithAudioGroup.IconCompatParcelizer();
        int iIconCompatParcelizer2 = getVariantWithAudioGroup.IconCompatParcelizer();
        return ((Integer) read(getVariantWithAudioGroup.IconCompatParcelizer(), iIconCompatParcelizer2, getVariantWithAudioGroup.IconCompatParcelizer(), iIconCompatParcelizer, 83159486, -83159485, new Object[]{this})).intValue();
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = onCustomAction + 59;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((((((Boolean.hashCode(this.IconCompatParcelizer) * 31) + Boolean.hashCode(this.write)) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.read.hashCode()) * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesImplBaseParcelizer)) * 31) + Integer.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + Integer.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + this.MediaBrowserCompatItemReceiver.hashCode()) * 31) + Boolean.hashCode(this.MediaBrowserCompatSearchResultReceiver)) * 31) + Boolean.hashCode(this.MediaMetadataCompat)) * 31) + Boolean.hashCode(this.RatingCompat);
        int i4 = onCustomAction + 73;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        int iIconCompatParcelizer = getVariantWithAudioGroup.IconCompatParcelizer();
        int iIconCompatParcelizer2 = getVariantWithAudioGroup.IconCompatParcelizer();
        return ((Boolean) read(getVariantWithAudioGroup.IconCompatParcelizer(), iIconCompatParcelizer2, getVariantWithAudioGroup.IconCompatParcelizer(), iIconCompatParcelizer, -1579923222, 1579923222, new Object[]{this})).booleanValue();
    }

    public final String toString() {
        int i = 2 % 2;
        boolean z = this.IconCompatParcelizer;
        boolean z2 = this.write;
        WalletWalletOptionsBuilder walletWalletOptionsBuilder = this.RemoteActionCompatParcelizer;
        String str = this.AudioAttributesCompatParcelizer;
        String str2 = this.read;
        String str3 = this.MediaBrowserCompatCustomActionResultReceiver;
        int i2 = this.AudioAttributesImplBaseParcelizer;
        int i3 = this.AudioAttributesImplApi21Parcelizer;
        int i4 = this.AudioAttributesImplApi26Parcelizer;
        String str4 = this.MediaBrowserCompatItemReceiver;
        boolean z3 = this.MediaBrowserCompatSearchResultReceiver;
        boolean z4 = this.MediaMetadataCompat;
        boolean z5 = this.RatingCompat;
        StringBuilder sb = new StringBuilder("setEnvironment(IconCompatParcelizer=");
        sb.append(z);
        sb.append(", write=");
        sb.append(z2);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(walletWalletOptionsBuilder);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(str);
        sb.append(", read=");
        sb.append(str2);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(str3);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(i2);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(i3);
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        sb.append(i4);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(str4);
        sb.append(", MediaBrowserCompatSearchResultReceiver=");
        sb.append(z3);
        sb.append(", MediaMetadataCompat=");
        sb.append(z4);
        sb.append(", RatingCompat=");
        sb.append(z5);
        sb.append(")");
        String string = sb.toString();
        int i5 = onCustomAction + 51;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v227, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r7v123 */
    /* JADX WARN: Type inference failed for: r7v124, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v125 */
    /* JADX WARN: Type inference failed for: r7v129, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r7v130 */
    /* JADX WARN: Type inference failed for: r7v132, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v137 */
    /* JADX WARN: Type inference failed for: r7v138 */
    /* JADX WARN: Type inference failed for: r7v139 */
    /* JADX WARN: Type inference failed for: r7v140 */
    /* JADX WARN: Type inference failed for: r7v141 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.CharSequence] */
    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] read(android.content.Context r33, java.lang.Class r34, int r35, int r36, int r37) {
        /*
            Method dump skipped, instruction units count: 4872
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setEnvironment.read(android.content.Context, java.lang.Class, int, int, int):java.lang.Object[]");
    }
}
