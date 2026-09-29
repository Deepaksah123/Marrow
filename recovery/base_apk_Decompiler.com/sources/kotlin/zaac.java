package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import in.juspay.hyper.constants.LogCategory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.zaai;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/zaac;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zaac extends zaaa {
    private static char AudioAttributesCompatParcelizer;
    private static int[] AudioAttributesImplApi26Parcelizer;
    private static int AudioAttributesImplBaseParcelizer;
    private static char IconCompatParcelizer;
    private static char RemoteActionCompatParcelizer;
    private static char read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final byte[] $$l = {14, -40, -35, 110};
    private static final int $$m = 207;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {8, -19, -66, -33, 67, -55, 4, -13, TarConstants.LF_SYMLINK, -35, 7, 20, -17, 37, -49, 17, 2, 3, -11, 80, -81, 7, 11, -9, 17, -50, 19, -3, -4, TarConstants.LF_NORMAL, -49, 2, 4, 11, 9, -17, 3, 17, -12, TarConstants.LF_SYMLINK, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, -17, -6, 0, -3, 17, 38, -32, -15, 13, -4, 3, 45, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, 67, -55, 4, -13, 36, -13, -17, 13, -3, 9, 15, 6, -1};
    private static final int $$k = TarConstants.PREFIXLEN;
    private static final byte[] $$d = {30, -87, -70, -33, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 52;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int MediaBrowserCompatItemReceiver = 1;
    private static int AudioAttributesImplApi21Parcelizer = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(short r5, short r6, byte r7) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r5 = r5 * 4
            int r0 = 1 - r5
            int r7 = r7 * 2
            int r7 = r7 + 122
            byte[] r1 = kotlin.zaac.$$l
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L19
            r3 = r7
            r4 = r2
            r7 = r5
            goto L29
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L27:
            r3 = r1[r6]
        L29:
            int r6 = r6 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaac.$$n(short, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.zaac.$$d
            int r8 = 114 - r8
            int r7 = r7 + 4
            int r1 = r6 + 4
            byte[] r1 = new byte[r1]
            int r6 = r6 + 3
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2c
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r3 = r3 + r7
            int r7 = r3 + (-1)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaac.g(byte, int, short, java.lang.Object[]):void");
    }

    private static void h(byte b, byte b2, int i, Object[] objArr) {
        byte[] bArr = $$j;
        int i2 = 114 - b;
        int i3 = i + 4;
        byte[] bArr2 = new byte[31 - b2];
        int i4 = 30 - b2;
        int i5 = -1;
        if (bArr == null) {
            i2 = i2 + (-i3) + 2;
            i3++;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i3;
            i2 = i2 + (-bArr[i3]) + 2;
            i3 = i7 + 1;
            i5 = i6;
        }
    }

    /* JADX INFO: renamed from: o.zaac$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/marrow2/ui/magic_module/intro/MagicModuleActivity$Companion;", "", "<init>", "()V", "EXTRA_IS_FROM_DEEPLINK", "", "getLaunchIntent", "Landroid/content/Intent;", LogCategory.CONTEXT, "Landroid/content/Context;", "isFromDeeplink", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Intent RemoteActionCompatParcelizer(Context context, boolean z) {
            toMagicModuleMetaRepoModel.write(context, "");
            Intent intent = new Intent(context, (Class<?>) zaac.class);
            intent.putExtra("isFromDeeplink", z);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void e(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        while (isstopped.read < cArr.length) {
            cArr3[i3] = cArr[isstopped.read];
            cArr3[1] = cArr[isstopped.read + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $11 + 13;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                char[] cArr4 = cArr3;
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i4) ^ ((c2 << 4) + ((char) (((long) RemoteActionCompatParcelizer) ^ 1193402106669854891L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(AudioAttributesCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) Color.blue(0), View.combineMeasuredStates(0, 0) + 1504, 21 - ExpandableListView.getPackedPositionType(0L), 1322448859, false, $$n(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (((long) IconCompatParcelizer) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(read)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 1504 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 21 - KeyEvent.normalizeMetaState(0), 1322448859, false, $$n(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[isstopped.read] = cArr5[0];
            cArr2[isstopped.read + 1] = cArr5[1];
            Object[] objArr4 = {isstopped, isstopped};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-167774474);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 9015 - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getPressedStateDuration() >> 16) + 58, -1950993821, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i8 = $11 + 117;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    private static void f(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = AudioAttributesImplApi26Parcelizer;
        char c = '0';
        int i4 = 43695;
        int i5 = -470782045;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(i5);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (i4 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), View.MeasureSpec.makeMeasureSpec(0, 0) + 23297, 14 - TextUtils.indexOf("", c, 0), -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i7++;
                    int i8 = $10 + 47;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    c = '0';
                    i4 = 43695;
                    i5 = -470782045;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = AudioAttributesImplApi26Parcelizer;
        if (iArr5 != null) {
            int i10 = $11 + 57;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                int i13 = $11 + 69;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i6] = Integer.valueOf(iArr5[i12]);
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 43695), 23297 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 14 - ((byte) KeyEvent.getModifierMetaStateMask()), -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    i12 >>= 1;
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i12])};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 43695), ((Process.getThreadPriority(0) + 20) >> 6) + 23297, 16 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                    i12++;
                }
                i6 = 0;
            }
            i2 = i6;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = i2;
        int i14 = $10 + 83;
        $11 = i14 % 128;
        int i15 = i14 % 2;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            int i16 = $10 + 65;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            cArr[0] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr4);
            int i18 = $10 + 5;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            for (int i20 = 0; i20 < 16; i20++) {
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[i20];
                Object[] objArr5 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0) + 43696), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 23297, 15 - (ViewConfiguration.getLongPressTimeout() >> 16), -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                buildremovealldownloadsintent.read = iIntValue;
            }
            int i21 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i21;
            buildremovealldownloadsintent.read ^= iArr4[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[17];
            int i22 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i23 = buildremovealldownloadsintent.read;
            cArr[0] = (char) (buildremovealldownloadsintent.AudioAttributesCompatParcelizer >>> 16);
            cArr[1] = (char) buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            cArr[2] = (char) (buildremovealldownloadsintent.read >>> 16);
            cArr[3] = (char) buildremovealldownloadsintent.read;
            buildRemoveAllDownloadsIntent.read(iArr4);
            cArr2[buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2] = cArr[0];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 1] = cArr[1];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 2] = cArr[2];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 3] = cArr[3];
            Object[] objArr6 = {buildremovealldownloadsintent, buildremovealldownloadsintent};
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(516305436);
            if (objRemoteActionCompatParcelizer5 == null) {
                objRemoteActionCompatParcelizer5 = startForeground.read((char) (ImageFormat.getBitsPerPixel(0) + 48195), 20126 - (ViewConfiguration.getScrollBarSize() >> 8), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 20, 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // kotlin.zaaa, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        boolean z;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 49;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 8, new char[]{59377, 64463, 13291, 3309, 33636, 40186, 62445, 48678, 13048, 21622, 43098, 43256, 19571, 3017, 54115, 4570, 23605, 25109}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 110, new int[]{-1680067905, -849294764, -1841142659, 1709743102}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i4 = MediaBrowserCompatItemReceiver + 115;
                MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr4 = new Object[1];
                f((ViewConfiguration.getPressedStateDuration() >> 16) + 26, new int[]{-1594862742, -1681006856, 283456453, -1177328964, -854776100, 2042580669, 849149837, 203704934, 1710837460, -1643409524, 1746788609, 109429233, -1307094684, -220106040}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 14, new int[]{-1462036277, -524231402, -501578360, 880048801, -1722896404, -1722957677, 1600652174, 272116017, -1215005544, 693344059}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i6 = MediaBrowserCompatCustomActionResultReceiver + 85;
                MediaBrowserCompatItemReceiver = i6 % 128;
                int i7 = i6 % 2;
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (View.MeasureSpec.getSize(0) + 4535), View.getDefaultSize(0, 0) + 6054, 42 - KeyEvent.keyCodeFromString(""), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    f(47 - TextUtils.lastIndexOf("", '0'), new int[]{86099050, -391571559, 1898209324, 1163948454, -120365912, -317714853, -1149727689, -389270694, -1525532074, 1326054665, -2114144303, -351457658, -2088296182, -157643461, -970551513, 96133450, 1975403571, -2064563546, 1931783792, -100438407, 1655023725, -1126488171, 207204393, -929767782}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 60, new int[]{-2069685893, 1876270261, -909478629, -519703621, 301618242, -1102649551, -920117753, 1854197174, 1554671755, -378169406, -1936150654, -2045136906, 1324416011, 1755732855, -1364314666, 906223064, -1356027274, 1801986509, 1222851013, -726555855, 1727614608, -1119811355, 474102222, 465224851, -1384178628, 787178966, -688269675, -821318967, 1472262342, 1441640062, 1087843288, -1335784441}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 45, new char[]{64635, 1774, 27932, 5585, 45525, 36900, 10272, 7819, 34416, 49157, 1220, 63196, 36894, 21397, 34416, 49157, 36894, 21397, 64635, 1774, 65468, 13178, 2900, 7132, 17422, 18832, 45031, 17363, 60091, 59966, 11135, 28176, 37714, 16701, 10833, 47454, 64723, 31868, 28462, 19100, 45525, 36900, 5393, 12780, 22503, 10161, 5415, 48996, 20843, 52951, 16360, 43647, 9696, 54173, 64023, 54307, 964, 35767, 8163, 24784, 2172, 2453, 16128, 294}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    e(TextUtils.indexOf((CharSequence) "", '0') + 68, new char[]{17053, 52601, 38615, 64930, 17918, 34415, 54127, 57071, 64389, 61068, 10525, 35574, 54620, 20844, 53255, 25960, 45665, 48637, 35452, 56114, 54277, 1519, 64800, 24610, 9347, 23025, 633, 19986, 32702, 7722, 29720, 58457, 29981, 42561, 39554, 6203, 26639, 43564, 29981, 42561, 64800, 24610, 25789, 40296, 39049, 27634, 27868, 7027, 58511, 25951, 58636, 51290, 15752, 51585, 33657, 9381, 18534, 59648, 21267, 41509, 44001, 61238, 26526, 38603, 49295, 29281, 47681, 62461}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    f(MotionEvent.axisFromString("") + 7, new int[]{-1436289840, -51866361, 460296495, -1408758614}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1, new char[]{65468, 13178, 23643, 38844, 15397, 51919, 28964, 13908, 34184, 62722, 34417, 8403, 38449, 26912, 45659, 37259, 21276, 47885, 42104, 10933, 47540, 2029, 39275, 63068, 59416, 59939, 664, 26928, 10833, 47454, 7731, 31074, 4183, 20424, 52568, 30799}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 6030, 23 - TextUtils.lastIndexOf("", '0', 0), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr12);
                    int i8 = MediaBrowserCompatItemReceiver + 39;
                    MediaBrowserCompatCustomActionResultReceiver = i8 % 128;
                    int i9 = i8 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer3 == null) {
            char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 13183);
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1649;
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 26;
            byte[] bArr = $$d;
            Object[] objArr13 = new Object[1];
            g((byte) 40, bArr[17], bArr[62], objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(offsetAfter, minimumFlingVelocity, touchSlop, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char c = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 13183);
                int packedPositionGroup = 1649 - ExpandableListView.getPackedPositionGroup(0L);
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 26;
                Object[] objArr14 = new Object[1];
                g(r4[0], (short) (-$$d[65]), r4[9], objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(c, packedPositionGroup, edgeSlop, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            f(15 - Process.getGidForName(""), new int[]{-1788655746, -1747084630, 1878909047, 324701222, 1032022390, 1223847018, -572665713, 391017353}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            f((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 15, new int[]{-2033403043, -1704107717, 74265826, 2070103345, 1966642953, -2104929523, 294400734, -1073443583}, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, 1454792934};
                byte[] bArr2 = $$j;
                Object[] objArr18 = new Object[1];
                h(bArr2[17], bArr2[34], bArr2[49], objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b = (byte) (-bArr2[14]);
                byte b2 = bArr2[49];
                Object[] objArr19 = new Object[1];
                h(b, b2, (byte) (b2 | 21), objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char absoluteGravity = (char) (13183 - Gravity.getAbsoluteGravity(0, 0));
                    int iBlue = 1649 - Color.blue(0);
                    int iIndexOf = 25 - TextUtils.indexOf((CharSequence) "", '0');
                    Object[] objArr20 = new Object[1];
                    g(r6[0], (short) (-$$d[65]), r6[9], objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(absoluteGravity, iBlue, iIndexOf, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    e(23 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{59377, 64463, 13291, 3309, 33636, 40186, 62445, 48678, 13048, 21622, 25129, 17652, 45117, 36574, 31786, 27166, 48263, 18190, 5605, 64874, 17908, 32542}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    e(TextUtils.lastIndexOf("", '0', 0, 0) + 16, new char[]{57955, 32366, 6842, 10966, 63358, 26704, 34563, 59883, 36722, 8936, 18522, 23737, 38395, 10089, 43035, 64409}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char bitsPerPixel = (char) (13182 - ImageFormat.getBitsPerPixel(0));
                        int i10 = 1649 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int iResolveSize = View.resolveSize(0, 0) + 26;
                        byte[] bArr3 = $$d;
                        Object[] objArr23 = new Object[1];
                        g(bArr3[0], (short) 75, bArr3[9], objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(bitsPerPixel, i10, iResolveSize, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13183);
                        int iRed = 1649 - Color.red(0);
                        int iGreen = Color.green(0) + 26;
                        byte[] bArr4 = $$d;
                        Object[] objArr24 = new Object[1];
                        g((byte) 40, bArr4[17], bArr4[62], objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(scrollBarFadeDuration, iRed, iGreen, -133433128, false, (String) objArr24[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        boolean z2 = false;
        int i11 = ((int[]) objArr[3])[0];
        int i12 = ((int[]) objArr[2])[0];
        if (i12 != i11) {
            long j = -1;
            long j2 = ((long) (i12 ^ i11)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32)) | j2;
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 4536), 6054 - Color.green(0), 43 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
            int i13 = MediaBrowserCompatItemReceiver + 79;
            MediaBrowserCompatCustomActionResultReceiver = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr25 = {-1183262325, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) Color.argb(0, 0, 0, 0), 6030 - Color.alpha(0), 23 - TextUtils.indexOf((CharSequence) "", '0'));
                byte[] bArr5 = $$j;
                byte b3 = (byte) (-bArr5[61]);
                byte b4 = bArr5[17];
                Object[] objArr26 = new Object[1];
                h(b3, b4, (byte) (b4 | TarConstants.LF_NORMAL), objArr26);
                z2 = false;
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        CmcdConfigurationRequestConfig.write(this, null, 0, 0, false, 15);
        super.onCreate(p0);
        setContentView(R.layout.empty_fragment_container);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        int i15 = MediaBrowserCompatCustomActionResultReceiver + 75;
        MediaBrowserCompatItemReceiver = i15 % 128;
        if (i15 % 2 == 0) {
            throw null;
        }
        if (p0 == null) {
            zaac zaacVar = this;
            zaai.Companion iconCompatParcelizer = zaai.INSTANCE;
            Bundle extras = intent.getExtras();
            if (extras != null) {
                int i16 = MediaBrowserCompatItemReceiver + 23;
                MediaBrowserCompatCustomActionResultReceiver = i16 % 128;
                if (i16 % 2 != 0) {
                    extras.getBoolean("isFromDeeplink");
                    throw null;
                }
                z = extras.getBoolean("isFromDeeplink");
            } else {
                z = z2;
            }
            CmcdConfigurationRequestConfig.write(zaacVar, R.id.container, zaai.Companion.IconCompatParcelizer(z));
        }
    }

    @Override // kotlin.zaaa, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 71;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            f((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 25, new int[]{-1594862742, -1681006856, 283456453, -1177328964, -854776100, 2042580669, 849149837, 203704934, 1710837460, -1643409524, 1746788609, 109429233, -1307094684, -220106040}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(0) - 19, new int[]{-1462036277, -524231402, -501578360, 880048801, -1722896404, -1722957677, 1600652174, 272116017, -1215005544, 693344059}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = MediaBrowserCompatCustomActionResultReceiver + 121;
            MediaBrowserCompatItemReceiver = i4 % 128;
            int i5 = i4 % 2;
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i6 = MediaBrowserCompatCustomActionResultReceiver + 17;
                MediaBrowserCompatItemReceiver = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (ViewConfiguration.getWindowTouchSlop() >> 8)), MotionEvent.axisFromString("") + 6055, 43 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 6030, (ViewConfiguration.getLongPressTimeout() >> 16) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onResume();
    }

    @Override // kotlin.zaaa, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = MediaBrowserCompatItemReceiver + 21;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 22, new int[]{-1594862742, -1681006856, 283456453, -1177328964, -854776100, 2042580669, 849149837, 203704934, 1710837460, -1643409524, 1746788609, 109429233, -1307094684, -220106040}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(18 - TextUtils.indexOf("", "", 0), new int[]{-1462036277, -524231402, -501578360, 880048801, -1722896404, -1722957677, 1600652174, 272116017, -1215005544, 693344059}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i4 = MediaBrowserCompatCustomActionResultReceiver + 29;
            MediaBrowserCompatItemReceiver = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (ViewConfiguration.getPressedStateDuration() >> 16)), 6055 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 42 - ((Process.getThreadPriority(0) + 20) >> 6), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.green(0), AndroidCharacter.getMirror('0') + 5982, 24 - TextUtils.indexOf("", "", 0), -861814097, false, "read", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x08be A[Catch: all -> 0x097f, TryCatch #14 {all -> 0x097f, blocks: (B:135:0x08a9, B:137:0x08be, B:138:0x08f0), top: B:286:0x08a9, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0903 A[Catch: all -> 0x0975, TryCatch #8 {all -> 0x0975, blocks: (B:139:0x08f6, B:141:0x0903, B:142:0x096d), top: B:274:0x08f6, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0aaa  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0afb  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0bab  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0e0f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0efa  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0f41  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0f9c  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x11e1  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x088f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.zaaa, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaac.attachBaseContext(android.content.Context):void");
    }

    static {
        AudioAttributesImplBaseParcelizer = 0;
        AudioAttributesImplApi21Parcelizer();
        INSTANCE = new Companion(null);
        int i = AudioAttributesImplApi21Parcelizer + 69;
        AudioAttributesImplBaseParcelizer = i % 128;
        int i2 = i % 2;
    }

    @Override // kotlin.zaaa, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 77;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 89 / 0;
        }
        int i5 = MediaBrowserCompatItemReceiver + 9;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    static void AudioAttributesImplApi21Parcelizer() {
        IconCompatParcelizer = (char) 56020;
        read = (char) 16632;
        RemoteActionCompatParcelizer = (char) 63905;
        AudioAttributesCompatParcelizer = (char) 20231;
        AudioAttributesImplApi26Parcelizer = new int[]{-1242816171, 531725361, 1887091566, 1064688552, 2016297487, 46369701, -2065725613, -303327140, 1832121460, -305480174, -1186095854, -367177673, 840634158, -1977326961, 710660487, -695067775, 2136931248, -891565516};
    }
}
