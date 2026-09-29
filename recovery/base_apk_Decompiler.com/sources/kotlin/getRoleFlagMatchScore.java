package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015"}, d2 = {"Lo/getRoleFlagMatchScore;", "Lo/shouldEvaluateQueueSize;", "Lo/getPresentationTimeOffsetUs;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Lo/getRoleFlagMatchScore$RemoteActionCompatParcelizer;", "", "AudioAttributesCompatParcelizer", "(Lo/getRoleFlagMatchScore$RemoteActionCompatParcelizer;)V", "IconCompatParcelizer", "()Lo/getPresentationTimeOffsetUs;", "Landroid/os/Bundle;", "onCreate", "(Landroid/os/Bundle;)V", "", "read", "(Ljava/lang/String;)V", "write", "Lo/getRoleFlagMatchScore$RemoteActionCompatParcelizer;", "Ljava/lang/String;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getRoleFlagMatchScore extends shouldEvaluateQueueSize<getPresentationTimeOffsetUs> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int MediaBrowserCompatItemReceiver;
    private static int[] read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private RemoteActionCompatParcelizer IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private String write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private String AudioAttributesCompatParcelizer;
    private static final byte[] $$g = {47, 110, -5, -26, -18, -4, 57, -62, -1, -24, -7, 9, -19, -12, 5, -5, 56, -66, 3, -8, -14, -14, -2, -5, 58, -60, -3, -25, 13, -7, -13, -11, 4, TarConstants.LF_NORMAL, -66, 0, -13, TarConstants.LF_BLK, -9, 0, -34, 0, -13, 20, -9, -39, -37, 5, -9, 66, -52, -21, -28, 29, -43, 3, 5, 17, -25, -18, 2, -58, 11, -11, -12, 40, -57, -6, -4, 3, 1, -25, -5, 9, -20, 42, -50, -4, -9, 9, -25, 30, -23, -23, 9, -8, -13, -3, -23, 15, -19, -25, -14, -8, -11, 9, 30, -40, -23, 5, -12, -5, 37, -50, -4, -9, 9, -25, 30, -23, -23, 9, -8, -13, -3, -23, 15, -19};
    private static final int $$h = 168;
    private static final byte[] $$a = {9, -121, -22, -93, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 41;
    private static int AudioAttributesImplBaseParcelizer = 1;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int AudioAttributesImplApi26Parcelizer = 1;

    public interface RemoteActionCompatParcelizer {
        void read();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = 79 - r8
            int r6 = r6 * 12
            int r6 = r6 + 65
            int r7 = r7 * 10
            int r0 = r7 + 34
            byte[] r1 = kotlin.getRoleFlagMatchScore.$$a
            byte[] r0 = new byte[r0]
            int r7 = r7 + 33
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2f
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + (-1)
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getRoleFlagMatchScore.a(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = 90 - r8
            byte[] r0 = kotlin.getRoleFlagMatchScore.$$g
            int r7 = r7 * 3
            int r1 = 58 - r7
            int r6 = r6 * 17
            int r6 = 99 - r6
            byte[] r1 = new byte[r1]
            int r7 = 57 - r7
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r7
            goto L32
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            int r8 = r8 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L32:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + (-6)
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getRoleFlagMatchScore.c(byte, short, byte, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object read(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = (~((~i6) | i3)) | i2;
        int i8 = ~i2;
        int i9 = (~(i8 | i3)) | (~(i8 | i6)) | (~(i3 | i6));
        int i10 = (~(i6 | (~i3))) | i8;
        int i11 = i2 + i3 + i + ((-2137991558) * i5) + (111092868 * i4);
        int i12 = i11 * i11;
        int i13 = (((-431794203) * i2) - 566755328) + (427185167 * i3) + (i7 * 1717982222) + (1717982222 * i9) + ((-1717982222) * i10) + ((-1290797056) * i) + ((-1247805440) * i5) + ((-1807745024) * i4) + ((-591921152) * i12);
        int i14 = (i2 * (-1469267343)) + 1003592187 + (i3 * (-1469268429)) + (i7 * (-362)) + (i9 * (-362)) + (i10 * 362) + (i * (-1469268067)) + (i5 * 1951436498) + (i4 * (-746069772)) + (i12 * (-1529348096));
        return i13 + ((i14 * i14) * 1762131968) != 1 ? IconCompatParcelizer(objArr) : RemoteActionCompatParcelizer(objArr);
    }

    public static final /* synthetic */ void AudioAttributesCompatParcelizer(getRoleFlagMatchScore getroleflagmatchscore, String str) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 31;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getroleflagmatchscore.read(str);
        int i4 = AudioAttributesImplApi26Parcelizer + 91;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void write(getRoleFlagMatchScore getroleflagmatchscore, String str) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 19;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getroleflagmatchscore.write(str);
        if (i3 != 0) {
            throw null;
        }
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 41;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
    }

    @Override // kotlin.shouldEvaluateQueueSize
    public final /* synthetic */ getApplicationLabel write() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 21;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getPresentationTimeOffsetUs getpresentationtimeoffsetusIconCompatParcelizer = IconCompatParcelizer();
        int i4 = AudioAttributesImplApi26Parcelizer + 105;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return getpresentationtimeoffsetusIconCompatParcelizer;
        }
        throw null;
    }

    private getRoleFlagMatchScore(Context context) {
        super(context, CmcdConfigurationRequestConfig.read());
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        getRoleFlagMatchScore getroleflagmatchscore = (getRoleFlagMatchScore) objArr[0];
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) objArr[1];
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 61;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        getroleflagmatchscore.IconCompatParcelizer = remoteActionCompatParcelizer;
        if (i3 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private getPresentationTimeOffsetUs IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 83;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        getPresentationTimeOffsetUs getpresentationtimeoffsetusWrite = getPresentationTimeOffsetUs.write(getLayoutInflater());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getpresentationtimeoffsetusWrite, "");
        int i4 = AudioAttributesImplApi26Parcelizer + 67;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return getpresentationtimeoffsetusWrite;
    }

    /* JADX INFO: renamed from: o.getRoleFlagMatchScore$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/getRoleFlagMatchScore$write;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "p2", "Lo/getRoleFlagMatchScore;", "IconCompatParcelizer", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lo/getRoleFlagMatchScore;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static getRoleFlagMatchScore IconCompatParcelizer(Context p0, String p1, String p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            getRoleFlagMatchScore getroleflagmatchscore = new getRoleFlagMatchScore(p0, null);
            getRoleFlagMatchScore.AudioAttributesCompatParcelizer(getroleflagmatchscore, p1);
            getRoleFlagMatchScore.write(getroleflagmatchscore, p2);
            return getroleflagmatchscore;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void b(int i, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = read;
        int i3 = -470782045;
        char c = '0';
        int i4 = 43695;
        int i5 = 1;
        int i6 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i7 = 0;
            while (i7 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (i4 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), Color.green(0) + 23297, 14 - TextUtils.indexOf("", c, 0, 0), -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr4[i7] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i7++;
                    c = '0';
                    i4 = 43695;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = read;
        if (iArr6 != null) {
            int i8 = $10 + 23;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 67;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    Object[] objArr3 = new Object[i5];
                    objArr3[i6] = Integer.valueOf(iArr6[i9]);
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(i3);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ExpandableListView.getPackedPositionGroup(0L) + 43695), ExpandableListView.getPackedPositionChild(0L) + 23298, 14 - TextUtils.lastIndexOf("", '0', i6), -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr2[i9] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    i9 <<= 1;
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr6[i9])};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (43695 - TextUtils.getOffsetBefore("", 0)), 23296 - TextUtils.indexOf((CharSequence) "", '0', 0), 15 - Color.argb(0, 0, 0, 0), -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr2[i9] = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                    i9++;
                }
                i3 = -470782045;
                i5 = 1;
                i6 = 0;
            }
            iArr6 = iArr2;
        }
        int i11 = i6;
        System.arraycopy(iArr6, i11, iArr5, i11, length3);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = i11;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            int i12 = $11 + 103;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr[0] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr5);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[i14];
                Object[] objArr5 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getTouchSlop() >> 8) + 43695), 23297 - (ViewConfiguration.getKeyRepeatDelay() >> 16), '?' - AndroidCharacter.getMirror('0'), -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                buildremovealldownloadsintent.read = iIntValue;
                i14++;
            }
            int i16 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i16;
            buildremovealldownloadsintent.read ^= iArr5[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[17];
            int i17 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i18 = buildremovealldownloadsintent.read;
            cArr[0] = (char) (buildremovealldownloadsintent.AudioAttributesCompatParcelizer >>> 16);
            cArr[1] = (char) buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            cArr[2] = (char) (buildremovealldownloadsintent.read >>> 16);
            cArr[3] = (char) buildremovealldownloadsintent.read;
            buildRemoveAllDownloadsIntent.read(iArr5);
            cArr2[buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2] = cArr[0];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 1] = cArr[1];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 2] = cArr[2];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 3] = cArr[3];
            Object[] objArr6 = {buildremovealldownloadsintent, buildremovealldownloadsintent};
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(516305436);
            if (objRemoteActionCompatParcelizer5 == null) {
                objRemoteActionCompatParcelizer5 = startForeground.read((char) (48194 - Drawable.resolveOpacity(0, 0)), 20125 - Process.getGidForName(""), 20 - TextUtils.indexOf("", ""), 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            int i19 = $10 + 105;
            $11 = i19 % 128;
            int i20 = i19 % 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final getShowPopup IconCompatParcelizer(getRoleFlagMatchScore getroleflagmatchscore) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 91;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        getroleflagmatchscore.dismiss();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 23;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    @Override // kotlin.shouldEvaluateQueueSize, kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 37;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char scrollBarSize = (char) (13183 - (ViewConfiguration.getScrollBarSize() >> 8));
            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 1650;
            int iResolveSizeAndState = 26 - View.resolveSizeAndState(0, 0, 0);
            byte b = $$a[17];
            Object[] objArr2 = new Object[1];
            a(b, b, (byte) 76, objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(scrollBarSize, bitsPerPixel, iResolveSizeAndState, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char size = (char) (View.MeasureSpec.getSize(0) + 13183);
                int scrollDefaultDelay = 1649 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int mode = View.MeasureSpec.getMode(0) + 26;
                byte b2 = $$a[5];
                Object[] objArr3 = new Object[1];
                a(b2, b2, r5[39], objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(size, scrollDefaultDelay, mode, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
            c = 2;
        } else {
            Object[] objArr4 = new Object[1];
            b((Process.myTid() >> 22) + 16, new int[]{126370633, 512701467, -767656623, -1625534365, 2072691235, -484151511, 1847463359, -1728411317}, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b(16 - View.getDefaultSize(0, 0), new int[]{189964246, 1289277776, 923338913, 326687115, -685238212, 1968277479, -1658113520, 1067544802}, objArr5);
            try {
                Object[] objArr6 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue()), 0, -1290728388};
                byte[] bArr = $$g;
                byte b3 = bArr[35];
                Object[] objArr7 = new Object[1];
                c(b3, b3, bArr[53], objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                byte b4 = bArr[60];
                byte b5 = bArr[11];
                Object[] objArr8 = new Object[1];
                c(b4, b5, (byte) (b5 + 1), objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 13183);
                    int scrollBarFadeDuration = 1649 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 26;
                    byte b6 = $$a[5];
                    Object[] objArr9 = new Object[1];
                    a(b6, b6, r9[39], objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(cMakeMeasureSpec, scrollBarFadeDuration, iCombineMeasuredStates, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b(22 - TextUtils.getOffsetAfter("", 0), new int[]{720492040, 2098364152, -1532229617, 609058579, -688798056, -1235835737, -203135652, -362745020, -1290292515, -1872703118, 219365963, -1841739830}, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b(16 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), new int[]{-1543246221, -982143430, 92470976, 1787847049, -1334569618, -1341421157, -1281959920, 852011858}, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 13183);
                        int packedPositionGroup = 1649 - ExpandableListView.getPackedPositionGroup(0L);
                        int scrollBarSize2 = 26 - (ViewConfiguration.getScrollBarSize() >> 8);
                        byte b7 = $$a[5];
                        byte b8 = b7;
                        Object[] objArr12 = new Object[1];
                        a(b7, b8, b8, objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(deadChar, packedPositionGroup, scrollBarSize2, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char cResolveSizeAndState = (char) (13183 - View.resolveSizeAndState(0, 0, 0));
                        int i4 = 1650 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 26;
                        byte b9 = $$a[17];
                        Object[] objArr13 = new Object[1];
                        a(b9, b9, (byte) 76, objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(cResolveSizeAndState, i4, maximumFlingVelocity, -133433128, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf2);
                    int i5 = MediaBrowserCompatCustomActionResultReceiver + 3;
                    AudioAttributesImplApi26Parcelizer = i5 % 128;
                    c = 2;
                    if (i5 % 2 == 0) {
                        int i6 = 4 / 4;
                    }
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i7 = ((int[]) objArr[3])[0];
        int i8 = ((int[]) objArr[c])[0];
        if (i8 != i7) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i7 ^ i8)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (ExpandableListView.getPackedPositionGroup(0L) + 4535), 6054 - (ViewConfiguration.getScrollBarSize() >> 8), 43 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i9 = AudioAttributesImplApi26Parcelizer + 79;
                MediaBrowserCompatCustomActionResultReceiver = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr14 = {301789810, Long.valueOf(j3), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 6029 - TextUtils.lastIndexOf("", '0'), TextUtils.getTrimmedLength("") + 24);
                    Object[] objArr15 = new Object[1];
                    c(r2[70], (byte) ($$g[62] - 1), r2[35], objArr15);
                    cls4.getMethod((String) objArr15[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr14);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(p0);
        AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer.setText(getContext().getString(R.string.f_dialog_delete_queued_cache_msg_any, this.AudioAttributesCompatParcelizer));
        TextView textView = AudioAttributesImplBaseParcelizer().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        RemoteActionCompatParcelizer(textView, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.lambdaselectTextTrack4
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getRoleFlagMatchScore.AudioAttributesCompatParcelizer(this.write);
            }
        });
        TextView textView2 = AudioAttributesImplBaseParcelizer().IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        RemoteActionCompatParcelizer(textView2, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.maybeInvalidateForAudioChannelCountConstraints
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                Object[] objArr16 = {this.write};
                int iIconCompatParcelizer = DefaultHttpDataSource.Factory.IconCompatParcelizer();
                return (getShowPopup) getRoleFlagMatchScore.read(DefaultHttpDataSource.Factory.IconCompatParcelizer(), -1226201899, objArr16, 1226201899, DefaultHttpDataSource.Factory.IconCompatParcelizer(), DefaultHttpDataSource.Factory.IconCompatParcelizer(), iIconCompatParcelizer);
            }
        });
        int i11 = MediaBrowserCompatCustomActionResultReceiver + 105;
        AudioAttributesImplApi26Parcelizer = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private static final getShowPopup read(getRoleFlagMatchScore getroleflagmatchscore) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 69;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = getroleflagmatchscore.IconCompatParcelizer;
            obj.hashCode();
            throw null;
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = getroleflagmatchscore.IconCompatParcelizer;
        if (remoteActionCompatParcelizer2 != null) {
            String str = getroleflagmatchscore.write;
            remoteActionCompatParcelizer2.read();
        }
        getroleflagmatchscore.dismiss();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i3 = AudioAttributesImplApi26Parcelizer + 57;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        if (i3 % 2 == 0) {
            return getshowpopup;
        }
        throw null;
    }

    private final void read(String p0) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer;
        int i3 = i2 + 5;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        this.write = p0;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 123;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 57 / 0;
        }
    }

    private final void write(String p0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver;
        int i3 = i2 + 33;
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        this.AudioAttributesCompatParcelizer = p0;
        int i5 = i2 + 117;
        AudioAttributesImplApi26Parcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ getShowPopup RemoteActionCompatParcelizer(getRoleFlagMatchScore getroleflagmatchscore) {
        int iIconCompatParcelizer = DefaultHttpDataSource.Factory.IconCompatParcelizer();
        return (getShowPopup) read(DefaultHttpDataSource.Factory.IconCompatParcelizer(), -1226201899, new Object[]{getroleflagmatchscore}, 1226201899, DefaultHttpDataSource.Factory.IconCompatParcelizer(), DefaultHttpDataSource.Factory.IconCompatParcelizer(), iIconCompatParcelizer);
    }

    public static /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(getRoleFlagMatchScore getroleflagmatchscore) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 63;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupIconCompatParcelizer = IconCompatParcelizer(getroleflagmatchscore);
        int i4 = AudioAttributesImplApi26Parcelizer + 21;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopupIconCompatParcelizer;
    }

    static {
        MediaBrowserCompatItemReceiver = 0;
        RemoteActionCompatParcelizer();
        INSTANCE = new Companion(null);
        int i = AudioAttributesImplBaseParcelizer + 9;
        MediaBrowserCompatItemReceiver = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ getRoleFlagMatchScore(Context context, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(context);
    }

    public final void AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer p0) {
        int iIconCompatParcelizer = DefaultHttpDataSource.Factory.IconCompatParcelizer();
        read(DefaultHttpDataSource.Factory.IconCompatParcelizer(), -1866970177, new Object[]{this, p0}, 1866970178, DefaultHttpDataSource.Factory.IconCompatParcelizer(), DefaultHttpDataSource.Factory.IconCompatParcelizer(), iIconCompatParcelizer);
    }

    static void RemoteActionCompatParcelizer() {
        read = new int[]{-1624194563, 1260150572, 428311527, -2082521102, -1476854917, 2090635978, 705361688, -416335102, 199487377, 1534428480, 2041966590, -539257616, 766120785, -1400658059, 100723530, -155712241, -1407620784, -443487929};
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        getRoleFlagMatchScore getroleflagmatchscore = (getRoleFlagMatchScore) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 87;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            return read(getroleflagmatchscore);
        }
        read(getroleflagmatchscore);
        throw null;
    }
}
