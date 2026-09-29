package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.marrow2.data.test.remote.model.RankPairModel;
import com.marrow2.data.test.remote.model.TestStatModel;
import com.marrow2.data.test.remote.model.TestSubjectStatModel;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\r\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0017\u0010!\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010\u001bR\u001a\u0010$\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b$\u0010\u001bR\u001a\u0010#\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b%\u0010\u001bR\u001a\u0010%\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b\u001e\u0010\u001bR\u001a\u0010(\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b&\u0010\u001bR\u001a\u0010'\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b#\u0010\u001bR\u001c\u0010&\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b(\u0010+R \u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b)\u0010.R(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010-\u001a\u0004\b0\u0010.\"\u0004\b!\u00101R \u00102\u001a\b\u0012\u0004\u0012\u00020\u00110\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010-\u001a\u0004\b'\u0010.R&\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u00103\u001a\u0004\b \u00104"}, d2 = {"Lo/getCodecCountOfType;", "", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "Lcom/marrow2/data/test/remote/model/TestStatModel;", "p7", "", "Lcom/marrow2/data/test/remote/model/TestSubjectStatModel;", "p8", "p9", "Lcom/marrow2/data/test/remote/model/RankPairModel;", "p10", "", "p11", "<init>", "(Ljava/lang/String;IIIIIILcom/marrow2/data/test/remote/model/TestStatModel;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "MediaBrowserCompatItemReceiver", "Ljava/lang/String;", "read", "RemoteActionCompatParcelizer", "I", "write", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "Lcom/marrow2/data/test/remote/model/TestStatModel;", "()Lcom/marrow2/data/test/remote/model/TestStatModel;", "MediaDescriptionCompat", "Ljava/util/List;", "()Ljava/util/List;", "MediaMetadataCompat", "RatingCompat", "(Ljava/util/List;)V", "MediaBrowserCompatMediaItem", "Ljava/util/Map;", "()Ljava/util/Map;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getCodecCountOfType {
    private static int MediaBrowserCompatMediaItem;
    private static int MediaBrowserCompatSearchResultReceiver;
    private static long MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private static int RatingCompat;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final Map<String, String> MediaMetadataCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final List<RankPairModel> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final TestStatModel AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final List<TestSubjectStatModel> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private List<TestSubjectStatModel> MediaBrowserCompatItemReceiver;
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;
    private static final byte[] $$c = {67, -110, -113, 74};
    private static final int $$d = 221;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {28, -38, TarConstants.LF_DIR, -29, 26, 12, -1, -43, 44, -2, 3, -15, 19, -36, 17, 17, -15, 2, 7, -3, 17, -21, 13};
    private static final int $$b = 127;
    private static final byte[] onCustomAction = {29, -75, -112, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -18, 5, -19, -2, 1, 0, TarConstants.LF_LINK, -77, 8, -1, -23, 68, -36, -39, -10, 6, -11, -4, 36, -54, 12, -14, -11, -28, 10, -15, 40, -49, -2, -3, 21, -38, -3, 4, -10, 2, 4, -26, 16, 46, -67, 6, -18, 2, TarConstants.LF_BLK, -42, -38, -3, 4, -10, 2, -18, 5, -19, -2, 1, 0, TarConstants.LF_LINK, -78, 9, 0, -8, -3, -20, 65, -28, -56, 3, 10, -18, 5, -2, -6, -15, 2, 20, -34, -15, -6, 25, -24, -1, -23, -3, -20, 31, -22, -7, -13, 1, -4, 15, -36, -9, 5, -16, 6, -11, -4, 35, -46, -8, 42, -42, -6, -8, 3, -2, -1, -2, -16, 4, -26, 16, 46, -67, 6, -18, 2, TarConstants.LF_BLK, -32, -42, -11, 10, -7, -3, -18, 16, -16, -14, 11, 17, -28, -10, -11, 25, -16, -16, -14, 11, -18, 5, -19, -2, 1, 0, TarConstants.LF_LINK, -77, 8, -1, -23, 68, -45, -24, -1, -23, 78, -46, -29, -1, -23, -7, -2, 8, 13, -34, 6, -3, 7, -15, 1, 19, -29, -1, -23, -7, -2, 8, 13, -34, 6, -3, -3, -20, 31, -22, -7, -13, 1, -4, 15, -36, -9, 5, -16, 6, -11, -4, 35, -46, -8, 38, -48, -2, -11, 0, 4, -26, 16, 46, -67, 6, -18, 2, TarConstants.LF_BLK, -43, -25, -15, -2, -13, 17, -6, -15, 2, -3, -20, 44, -35, -25, -3, 9, 4, -26, 16, 46, -67, 6, -18, 2, TarConstants.LF_BLK, -38, -24, -13, 0, -3, -22, 4, -26, 16, 46, -67, 6, -18, 2, TarConstants.LF_BLK, -35, -40, -4, 2, -10, 4, 6, 4, -26, 16, 46, -67, 6, -18, 2, TarConstants.LF_BLK, -73, 8, -6, -11, 2, -3, -22, 65, -24, -39, -5, -7, -19, -5, 5, 2, -15, 2, 17, -24, -13, 0, -3, -22, 9, -20, 46, -39, -5, -7, -19, -5, 5, 2, -15, 2, 4, -26, 16, 46, -67, 6, -18, 2, TarConstants.LF_BLK, -73, 8, -6, -11, 2, -3, -22, 65, -36, -29, -20, 7, -12, 6, -10, -13, 2, -1, 1, 10, -35, 4, -26, 16, 46, -67, 6, -18, 2, TarConstants.LF_BLK, -38, -24, -13, 0, -3, -22, TarConstants.LF_BLK};
    private static final int handleMediaPlayPauseIfPendingOnHandler = 168;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(short r5, byte r6, byte r7) {
        /*
            int r5 = r5 * 2
            int r5 = 104 - r5
            byte[] r0 = kotlin.getCodecCountOfType.$$c
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r7 = r7 * 3
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L18
            r4 = r7
            r3 = r2
            goto L28
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            r4 = r0[r6]
            int r3 = r3 + 1
        L28:
            int r4 = -r4
            int r5 = r5 + r4
            int r6 = r6 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getCodecCountOfType.$$e(short, byte, byte):java.lang.String");
    }

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = (~(i7 | i8)) | i;
        int i10 = i8 | i;
        int i11 = (~((~i) | i3)) | (~i10);
        int i12 = (~(i2 | i7 | i)) | (~(i10 | i3));
        int i13 = i + i3 + i4 + (528639218 * i5) + ((-532493036) * i6);
        int i14 = i13 * i13;
        int i15 = ((i * 873666089) - 1460666368) + (873666089 * i3) + ((-875965520) * i9) + (437982760 * i11) + ((-437982760) * i12) + (435683328 * i4) + (1819279360 * i5) + ((-1621098496) * i6) + (586088448 * i14);
        int i16 = (i * (-1573143961)) + 2078511484 + (i3 * (-1573143961)) + (i9 * 1872) + (i11 * (-936)) + (i12 * 936) + (i4 * (-1573143025)) + (i5 * 123045422) + (i6 * (-1548035028)) + (i14 * 1845559296);
        int i17 = i15 + (i16 * i16 * 1848705024);
        return i17 != 1 ? i17 != 2 ? write(objArr) : RemoteActionCompatParcelizer(objArr) : read(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r0 = r7 + 20
            byte[] r1 = kotlin.getCodecCountOfType.$$a
            int r6 = r6 * 4
            int r6 = 3 - r6
            int r8 = r8 * 2
            int r8 = r8 + 73
            byte[] r0 = new byte[r0]
            int r7 = r7 + 19
            r2 = 0
            if (r1 != 0) goto L19
            r8 = r6
            r4 = r7
            r3 = r2
            goto L30
        L19:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1d:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            int r8 = r8 + 1
            r4 = r1[r8]
            int r3 = r3 + 1
        L30:
            int r6 = r6 + r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getCodecCountOfType.d(int, int, short, java.lang.Object[]):void");
    }

    public getCodecCountOfType(String str, int i, int i2, int i3, int i4, int i5, int i6, TestStatModel testStatModel, List<TestSubjectStatModel> list, List<TestSubjectStatModel> list2, List<RankPairModel> list3, Map<String, String> map) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(list3, "");
        toMagicModuleMetaRepoModel.write(map, "");
        this.read = str;
        this.RemoteActionCompatParcelizer = i;
        this.AudioAttributesCompatParcelizer = i2;
        this.write = i3;
        this.IconCompatParcelizer = i4;
        this.AudioAttributesImplApi26Parcelizer = i5;
        this.AudioAttributesImplBaseParcelizer = i6;
        this.AudioAttributesImplApi21Parcelizer = testStatModel;
        this.MediaBrowserCompatCustomActionResultReceiver = list;
        this.MediaBrowserCompatItemReceiver = list2;
        this.MediaBrowserCompatMediaItem = list3;
        this.MediaMetadataCompat = map;
    }

    public final int RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 85;
        int i3 = i2 % 128;
        MediaBrowserCompatMediaItem = i3;
        int i4 = i2 % 2;
        int i5 = this.RemoteActionCompatParcelizer;
        int i6 = i3 + 79;
        RatingCompat = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int AudioAttributesCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 65;
        int i3 = i2 % 128;
        MediaBrowserCompatMediaItem = i3;
        int i4 = i2 % 2;
        int i5 = this.AudioAttributesCompatParcelizer;
        int i6 = i3 + 5;
        RatingCompat = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final int IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 3;
        int i3 = i2 % 128;
        MediaBrowserCompatMediaItem = i3;
        int i4 = i2 % 2;
        int i5 = this.write;
        int i6 = i3 + 85;
        RatingCompat = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 48 / 0;
        }
        return i5;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        getCodecCountOfType getcodeccountoftype = (getCodecCountOfType) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 33;
        int i3 = i2 % 128;
        RatingCompat = i3;
        int i4 = i2 % 2;
        int i5 = getcodeccountoftype.IconCompatParcelizer;
        int i6 = i3 + 93;
        MediaBrowserCompatMediaItem = i6 % 128;
        if (i6 % 2 == 0) {
            return Integer.valueOf(i5);
        }
        int i7 = 94 / 0;
        return Integer.valueOf(i5);
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 35;
        MediaBrowserCompatMediaItem = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.AudioAttributesImplApi26Parcelizer;
        int i6 = i2 + 59;
        MediaBrowserCompatMediaItem = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 32 / 0;
        }
        return i5;
    }

    public final int write() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 65;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            return this.AudioAttributesImplBaseParcelizer;
        }
        throw null;
    }

    public final TestStatModel AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 33;
        MediaBrowserCompatMediaItem = i3 % 128;
        int i4 = i3 % 2;
        TestStatModel testStatModel = this.AudioAttributesImplApi21Parcelizer;
        int i5 = i2 + 117;
        MediaBrowserCompatMediaItem = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 81 / 0;
        }
        return testStatModel;
    }

    public final List<TestSubjectStatModel> MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = RatingCompat + 55;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 == 0) {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<TestSubjectStatModel> RatingCompat() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 33;
        int i3 = i2 % 128;
        RatingCompat = i3;
        int i4 = i2 % 2;
        List<TestSubjectStatModel> list = this.MediaBrowserCompatItemReceiver;
        if (i4 == 0) {
            int i5 = 14 / 0;
        }
        int i6 = i3 + 123;
        MediaBrowserCompatMediaItem = i6 % 128;
        if (i6 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void RemoteActionCompatParcelizer(List<TestSubjectStatModel> list) {
        int i = 2 % 2;
        int i2 = RatingCompat + 101;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(list, "");
            this.MediaBrowserCompatItemReceiver = list;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(list, "");
        this.MediaBrowserCompatItemReceiver = list;
        int i3 = RatingCompat + 35;
        MediaBrowserCompatMediaItem = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 18 / 0;
        }
    }

    public final List<RankPairModel> AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 7;
        MediaBrowserCompatMediaItem = i3 % 128;
        int i4 = i3 % 2;
        List<RankPairModel> list = this.MediaBrowserCompatMediaItem;
        int i5 = i2 + 47;
        MediaBrowserCompatMediaItem = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final Map<String, String> read() {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 79;
        MediaBrowserCompatMediaItem = i3 % 128;
        int i4 = i3 % 2;
        Map<String, String> map = this.MediaMetadataCompat;
        int i5 = i2 + 59;
        MediaBrowserCompatMediaItem = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 85 / 0;
        }
        return map;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i2 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), Color.blue(0) + 12424, 20 - (ViewConfiguration.getTapTimeout() >> 16), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i2] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) View.resolveSize(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 1868, 11 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1983509525, false, $$e(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
    }

    private static void c(int i, char[] cArr, int i2, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i3];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i3) {
            int i5 = $11 + 123;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i2 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i7 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(MediaBrowserCompatSearchResultReceiver)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.getOffsetBefore("", 0), View.resolveSize(0, 0) + 23704, 32 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (44863 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getPressedStateDuration() >> 16) + 18944, 28 - (Process.myPid() >> 22), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i > 0) {
            cleardownloadmanagerhelpers.write = i;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i3 - cleardownloadmanagerhelpers.write);
        }
        if (z) {
            int i8 = $11 + 65;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i3];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i3) {
                cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i3 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 44862), 18943 - Process.getGidForName(""), 28 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public static void RemoteActionCompatParcelizer(Context context, long j, long j2) {
        RemoteActionCompatParcelizer(1173663893, new Object[]{context, Long.valueOf(j), Long.valueOf(j2)}, DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), -1173663892, DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed());
    }

    public final boolean equals(Object p0) {
        return ((Boolean) RemoteActionCompatParcelizer(1284760239, new Object[]{this, p0}, DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), -1284760237, DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed())).booleanValue();
    }

    public final int MediaBrowserCompatItemReceiver() {
        return ((Integer) RemoteActionCompatParcelizer(321299342, new Object[]{this}, DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), -321299342, DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed())).intValue();
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RatingCompat + 65;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.read.hashCode();
        int iHashCode3 = Integer.hashCode(this.RemoteActionCompatParcelizer);
        int iHashCode4 = Integer.hashCode(this.AudioAttributesCompatParcelizer);
        int iHashCode5 = Integer.hashCode(this.write);
        int iHashCode6 = Integer.hashCode(this.IconCompatParcelizer);
        int iHashCode7 = Integer.hashCode(this.AudioAttributesImplApi26Parcelizer);
        int iHashCode8 = Integer.hashCode(this.AudioAttributesImplBaseParcelizer);
        TestStatModel testStatModel = this.AudioAttributesImplApi21Parcelizer;
        if (testStatModel == null) {
            int i4 = RatingCompat + 119;
            MediaBrowserCompatMediaItem = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = testStatModel.hashCode();
        }
        int iHashCode9 = (((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode()) * 31) + this.MediaBrowserCompatItemReceiver.hashCode()) * 31) + this.MediaBrowserCompatMediaItem.hashCode()) * 31) + this.MediaMetadataCompat.hashCode();
        int i6 = RatingCompat + 117;
        MediaBrowserCompatMediaItem = i6 % 128;
        int i7 = i6 % 2;
        return iHashCode9;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.read;
        int i2 = this.RemoteActionCompatParcelizer;
        int i3 = this.AudioAttributesCompatParcelizer;
        int i4 = this.write;
        int i5 = this.IconCompatParcelizer;
        int i6 = this.AudioAttributesImplApi26Parcelizer;
        int i7 = this.AudioAttributesImplBaseParcelizer;
        TestStatModel testStatModel = this.AudioAttributesImplApi21Parcelizer;
        List<TestSubjectStatModel> list = this.MediaBrowserCompatCustomActionResultReceiver;
        List<TestSubjectStatModel> list2 = this.MediaBrowserCompatItemReceiver;
        List<RankPairModel> list3 = this.MediaBrowserCompatMediaItem;
        Map<String, String> map = this.MediaMetadataCompat;
        StringBuilder sb = new StringBuilder("getCodecCountOfType(read=");
        sb.append(str);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(i2);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(i3);
        sb.append(", write=");
        sb.append(i4);
        sb.append(", IconCompatParcelizer=");
        sb.append(i5);
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        sb.append(i6);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(i7);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(testStatModel);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(list);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(list2);
        sb.append(", MediaBrowserCompatMediaItem=");
        sb.append(list3);
        sb.append(", MediaMetadataCompat=");
        sb.append(map);
        sb.append(")");
        String string = sb.toString();
        int i8 = RatingCompat + 63;
        MediaBrowserCompatMediaItem = i8 % 128;
        int i9 = i8 % 2;
        return string;
    }

    static {
        MediaBrowserCompatMediaItem();
        MediaBrowserCompatMediaItem = 0;
        RatingCompat = 1;
        MediaBrowserCompatSearchResultReceiver = 1000326313;
    }

    static void MediaBrowserCompatMediaItem() {
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 433269770770166125L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0022). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.getCodecCountOfType.onCustomAction
            int r6 = 339 - r6
            int r8 = 118 - r8
            int r7 = 34 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r7
            r5 = r2
            goto L22
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L20:
            r3 = r0[r6]
        L22:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-5)
            int r6 = r6 + 1
            r3 = r5
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getCodecCountOfType.a(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0719 A[Catch: all -> 0x071b, TryCatch #23 {all -> 0x071b, blocks: (B:148:0x06d3, B:178:0x0712, B:180:0x0719, B:181:0x071a), top: B:295:0x06d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x071a A[Catch: all -> 0x071b, TRY_LEAVE, TryCatch #23 {all -> 0x071b, blocks: (B:148:0x06d3, B:178:0x0712, B:180:0x0719, B:181:0x071a), top: B:295:0x06d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x089c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object read(java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getCodecCountOfType.read(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        getCodecCountOfType getcodeccountoftype = (getCodecCountOfType) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        if (getcodeccountoftype == obj) {
            return true;
        }
        if (!(obj instanceof getCodecCountOfType)) {
            int i2 = RatingCompat + 79;
            MediaBrowserCompatMediaItem = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        getCodecCountOfType getcodeccountoftype2 = (getCodecCountOfType) obj;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) getcodeccountoftype.read, (Object) getcodeccountoftype2.read) || getcodeccountoftype.RemoteActionCompatParcelizer != getcodeccountoftype2.RemoteActionCompatParcelizer || getcodeccountoftype.AudioAttributesCompatParcelizer != getcodeccountoftype2.AudioAttributesCompatParcelizer) {
            return false;
        }
        if (getcodeccountoftype.write != getcodeccountoftype2.write) {
            int i4 = RatingCompat + 21;
            MediaBrowserCompatMediaItem = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (getcodeccountoftype.IconCompatParcelizer != getcodeccountoftype2.IconCompatParcelizer || getcodeccountoftype.AudioAttributesImplApi26Parcelizer != getcodeccountoftype2.AudioAttributesImplApi26Parcelizer || getcodeccountoftype.AudioAttributesImplBaseParcelizer != getcodeccountoftype2.AudioAttributesImplBaseParcelizer) {
            return false;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getcodeccountoftype.AudioAttributesImplApi21Parcelizer, getcodeccountoftype2.AudioAttributesImplApi21Parcelizer)) {
            int i6 = RatingCompat + 89;
            MediaBrowserCompatMediaItem = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getcodeccountoftype.MediaBrowserCompatCustomActionResultReceiver, getcodeccountoftype2.MediaBrowserCompatCustomActionResultReceiver)) {
            int i8 = RatingCompat + 99;
            int i9 = i8 % 128;
            MediaBrowserCompatMediaItem = i9;
            int i10 = i8 % 2;
            int i11 = i9 + 25;
            RatingCompat = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getcodeccountoftype.MediaBrowserCompatItemReceiver, getcodeccountoftype2.MediaBrowserCompatItemReceiver)) {
            int i13 = MediaBrowserCompatMediaItem + 57;
            RatingCompat = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (true ^ toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getcodeccountoftype.MediaBrowserCompatMediaItem, getcodeccountoftype2.MediaBrowserCompatMediaItem)) {
            return false;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getcodeccountoftype.MediaMetadataCompat, getcodeccountoftype2.MediaMetadataCompat)) {
            return true;
        }
        int i15 = RatingCompat + 59;
        MediaBrowserCompatMediaItem = i15 % 128;
        if (i15 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
