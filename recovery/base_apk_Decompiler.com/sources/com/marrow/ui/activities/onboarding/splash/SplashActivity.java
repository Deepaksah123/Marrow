package com.marrow.ui.activities.onboarding.splash;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.fasterxml.jackson.core.TokenStreamFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.wallet.WalletConstants;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.data.models.plan.PlanGroup$$ExternalSyntheticLambda0;
import com.marrow.kt.ui.activities.sync.SyncingActivity;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.BandwidthMeterEventListenerEventDispatcherHandlerAndListener;
import kotlin.NavigationBarViewSavedState;
import kotlin.WebvttCssStyleFontSizeUnit;
import kotlin.buildSetStopReasonIntent;
import kotlin.createFloatList;
import kotlin.getAnchorU;
import kotlin.getExamName;
import kotlin.needsStartedService;
import kotlin.setTargetTagName;
import kotlin.startForeground;
import kotlin.zadb;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes.dex */
public final class SplashActivity extends setTargetTagName<WebvttCssStyleFontSizeUnit.RemoteActionCompatParcelizer> implements WebvttCssStyleFontSizeUnit.write {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$y = {31, 80, -124, -66, 67, -37, -28, 16, -11, TarConstants.LF_LINK, -42, 3, 10, -1, 4, 23, -17, -12, 5, 3, 3, -3, 16, 36, -42, 4, -1, 17, -11, 7, -4, 3, TarConstants.LF_GNUTYPE_LONGNAME, -35, -24, -10, 3, 45, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, -17, -6, 0, -3, 17, 38, -32, -15, 13, -4, 3, 45, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, -10, 4, 65, -61, 14, -15, 2, 5, -6, TarConstants.LF_GNUTYPE_LONGLINK, -36, -28, 19, -6, -3, 7, -3, 9, 40, -45, 2, 6, 5, 8, 4, -17, 13, -4, 3, -50, 19, -3, -4, TarConstants.LF_NORMAL, -49, 2, 4, 11, 9, -17, 3, 17, -12, TarConstants.LF_SYMLINK, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, 67, -34, -32, 6, 46, -27, -17, 21, 23, -33, 16, -1, 5, 1, -8, 9, 7, 11, -9, 17, 67, -55, 4, -13, 36, -17, -9, 13, 6, -17, 34, -25, 10, 2, -3, 9, 26, -32, 13, 1, -12, -24, -10, 3, 45, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, 67, -63, 3, 37, -24, -18, TarConstants.LF_CONTIG, -41, -6, 11, 67, -74, 26, 3, -1, -10, 4, 65, -55, -6, 2, 10, -3, 9, 57, -49, -11, 12, -12, 5, 8, 7, 56, -55, -4, -4, 71, -61, 10, 6, -16, 0, 5, 15, -6, 10, -7, -4, 72, -57, -3, -4, 17, -11, 6, 15, -9, 64, -74, 2, 18, 0, -10, 4, 65, -61, 14, -15, 2, 5, -6, 71, 6, -69, 14, 61, -65, 17, 3, -11, 5, 63, -64, 6, 13, -22, 77, -33, 17, -29, -11, 5, 32, -20, -12, 29, -17, 6, -16, 44, -32, 13, 1, -5, 74, -81, 7, 11, -9, 17, 15, 6, -1, -10, 4, 65, -55, -6, 2, 10, -3, 9, 57, -49, -11, 12, -12, 5, 8, 7, 56, -55, -4, -4, 71, -51, -10, 4, 2, 0, 3, 66, -69, 3, 13, -1, 64, -74, 2, 27, 67, -66, 15, -10, -2, 14, -7, 15, -12, TarConstants.LF_BLK, -32, 2, -10, -4, 9, -4, 67, -25, 10, -32, 2, -10, -4, 9, -4, TarConstants.LF_DIR, -32, 2, 0, -12, 2, 6, -1, 80, -39, -22, 3, -3, 10, 33, -46, 5, -6, 6, 16, -11, TarConstants.LF_LINK, -42, 4, -1, 17, -17, 45, -41, 17, -6, 29, -17, 4, 0, -2, -11, 19, -11, 80, -15, 67, -55, 4, -13, 38, -32, 15, -12, 16, -7, -4, 17, -11, 67, -35, -20, 4, -5, 39, -35, 45, -39, 5, 6, -7, -4, 45, -34, -1, 6, 67, -39, -12, 5, -18, 4, 2, TarConstants.LF_SYMLINK, -31, 4, -10, 13, 1, -11, 67, -35, -31, 21, -17, 1, 4, TarConstants.LF_NORMAL, -49, 23, 0, -9, -2, 13, -4, 3, 35, -18, -13, 2, 13, -11};
    private static final int $$z = 28;
    private static final byte[] $$j = {36, 33, 122, TarConstants.LF_DIR, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -4, -8, 12, -14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$k = 71;
    private static int read = 0;
    private static int write = 1;
    private static char[] RemoteActionCompatParcelizer = {6424, 6464, 6429, 6469, 6478, 6418, 6488, 6490, 6471, 6491, 6405, 6467, 6404, 6473, 6431, 6430, 6400, 6407, 6479, 6520, 6475, 6466, 6505, 6428, 6477, 6425, 6427, 6410, 6401, 6402, 6493, 6522, 6492, 6468, 6403, 6406, 6416, 6474, 6481, 6417, 6507, 6494, 6465, 6523, 6426, 6489, 6496, 6470, 6476};
    private static char AudioAttributesCompatParcelizer = 11445;
    private static char[] IconCompatParcelizer = {44810, 44685, 44913, 44921, 44912, 44985, 45038, 45039, 45031, 45029, 45034, 45026, 45042, 45050, 45051, 45051, 45050, 45031, 45022, 44979, 45019, 45048, 45024, 44995, 44993, 45026, 45028, 45048, 45031, 45025, 45027, 44984, 45039, 44997, 44978, 44988, 44989, 44988, 44993, 44999, 44998, 45032, 45032, 45033, 44999, 44990, 44993, 44992, 44987, 44987, 44984, 44992, 44992, 44999, 44997, 44978, 44997, 45039, 44998, 44987, 44995, 45038, 44992, 44984, 44998, 45039, 45039, 44997, 44988, 44990, 44991, 44993, 45035, 45032, 45033, 45038, 44993, 44984, 44998, 44944, 44987, 44986, 44991, 44985, 44965, 45031, 44880, 44882, 44892, 44895, 44892, 44892, 44893, 44883, 44892, 44893};

    public static /* synthetic */ Object AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~((~i4) | i7 | i2);
        int i9 = (~i2) | i7;
        int i10 = i8 | (~(i9 | i4)) | (~(i3 | i4 | i2));
        int i11 = ~i9;
        int i12 = (~(i2 | i3)) | i4 | i11;
        int i13 = (~(i7 | i4)) | i11;
        int i14 = i3 + i4 + i5 + (933655473 * i6) + ((-1037598838) * i);
        int i15 = i14 * i14;
        int i16 = (((-1556109539) * i3) - 925892608) + (470833381 * i4) + (i10 * (-1134012188)) + (1134012188 * i12) + ((-1134012188) * i13) + (1604845568 * i5) + ((-1691877376) * i6) + ((-393216000) * i) + ((-1633878016) * i15);
        int i17 = ((i3 * (-727610197)) - 1081761860) + (i4 * (-727608285)) + (i10 * 956) + (i12 * (-956)) + (i13 * 956) + (i5 * (-727609241)) + (i6 * 1532828727) + (i * (-747900794)) + (i15 * 556466176);
        int i18 = i16 + (i17 * i17 * (-1911357440));
        return i18 != 1 ? i18 != 2 ? write(objArr) : read(objArr) : IconCompatParcelizer(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void o(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = 191 - r7
            int r6 = r6 + 65
            int r0 = r8 + 4
            byte[] r1 = com.marrow.ui.activities.onboarding.splash.SplashActivity.$$j
            byte[] r0 = new byte[r0]
            int r8 = r8 + 3
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L22:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r6 = r6 + r7
            int r6 = r6 + (-1)
            r7 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.onboarding.splash.SplashActivity.o(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void p(short r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            int r7 = r7 + 65
            int r9 = 51 - r9
            byte[] r0 = com.marrow.ui.activities.onboarding.splash.SplashActivity.$$y
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r8
            r4 = r2
            goto L2b
        L10:
            r3 = r2
        L11:
            r6 = r8
            r8 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + 2
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.onboarding.splash.SplashActivity.p(short, short, short, java.lang.Object[]):void");
    }

    private static void n(byte[] bArr, boolean z, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i;
        int i2 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = IconCompatParcelizer;
        if (cArr2 != null) {
            int i7 = $10 + 89;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i = 0;
            }
            while (i < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) KeyEvent.getDeadChar(0, 0), 11613 - Drawable.resolveOpacity(0, 0), 20 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr[i] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr2, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                int i8 = $10 + 17;
                $11 = i8 % 128;
                if (i8 % 2 != 0 ? bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] != 1 : bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] != 1) {
                    int i9 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 31590), 9863 - View.MeasureSpec.getMode(0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 65, 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                } else {
                    int i10 = $10 + 115;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) View.MeasureSpec.getSize(0), 22960 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), Color.rgb(0, 0, 0) + 16777259, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (37822 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), Color.red(0) + 9754, 27 - Color.blue(0), 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                int i13 = $11 + 77;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 5 / 3;
                }
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i15 = $10 + 23;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 0, cArr5, 1, i4);
                System.arraycopy(cArr5, 0, cArr3, i4 / i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i4 + i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i16 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i16, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i16);
            }
        }
        if (!(!z)) {
            char[] cArr7 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                cArr7[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i4 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                int i17 = $11 + 63;
                $10 = i17 % 128;
                int i18 = i17 % 2;
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static void m(byte b, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr2 = RemoteActionCompatParcelizer;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = $10 + 113;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            for (int i6 = 0; i6 < length; i6++) {
                int i7 = $11 + 55;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7015, 29 - ((byte) KeyEvent.getModifierMetaStateMask()), -626716224, false, "o", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(AudioAttributesCompatParcelizer)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) View.getDefaultSize(0, 0), 7015 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 29 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -626716224, false, "o", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            needsstartedservice.AudioAttributesCompatParcelizer = 0;
            while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                    obj = obj2;
                } else {
                    try {
                        Object[] objArr4 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(105000849);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 48193), TextUtils.getCapsMode("", 0, 0) + 20126, (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 20, 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                            Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(50135433);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.getTrimmedLength("") + 19368, 18 - View.resolveSize(0, 0), 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                            int i9 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[iIntValue];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i9];
                        } else {
                            obj = null;
                            if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                                needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                                needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                                int i10 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                                int i11 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i10];
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i11];
                            } else {
                                int i12 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                                int i13 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i12];
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i13];
                            }
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                needsstartedservice.AudioAttributesCompatParcelizer += 2;
                int i14 = $11 + 41;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                obj2 = obj;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x1007  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x2e56  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0204  */
    @Override // kotlin.setTargetTagName, kotlin.RtspMessageUtil, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 12952
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.onboarding.splash.SplashActivity.onCreate(android.os.Bundle):void");
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        SplashActivity splashActivity = (SplashActivity) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i = 2 % 2;
        int i2 = read + 47;
        write = i2 % 128;
        int i3 = i2 % 2;
        super.onPostCreate(bundle);
        ((WebvttCssStyleFontSizeUnit.RemoteActionCompatParcelizer) splashActivity.getMPresenter()).AudioAttributesCompatParcelizer();
        int i4 = write + 101;
        read = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // o.WebvttCssStyleFontSizeUnit.write
    public final void onPlayFromMediaId() {
        int i = 2 % 2;
        int i2 = write + 45;
        read = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.syncManager.get()};
        int iOnRemoveQueueItem = getExamName.onRemoveQueueItem();
        BandwidthMeterEventListenerEventDispatcherHandlerAndListener.read(getExamName.onRemoveQueueItem(), objArr, iOnRemoveQueueItem, 1896980334, getExamName.onRemoveQueueItem(), -1896980334, getExamName.onRemoveQueueItem());
        onPlay();
        int i4 = read + 101;
        write = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onPlay() {
        int i = 2 % 2;
        int i2 = read + 39;
        write = i2 % 128;
        int i3 = i2 % 2;
        zadb.Companion companion = zadb.INSTANCE;
        Intent intentWrite = zadb.Companion.write(this);
        intentWrite.putExtra("key_override_transition", false);
        startActivity(intentWrite);
        finish();
    }

    @Override // o.WebvttCssStyleFontSizeUnit.write
    public final void onMediaButtonEvent() {
        int i = 2 % 2;
        startActivity(new Intent(this, (Class<?>) SyncingActivity.class));
        finish();
        int i2 = read + 9;
        write = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // o.WebvttCssStyleFontSizeUnit.write
    public final void onCustomAction() {
        int i = 2 % 2;
        int i2 = read + 47;
        write = i2 % 128;
        if (i2 % 2 == 0) {
            RemoteActionCompatParcelizer();
            createFloatList.Companion companion = createFloatList.INSTANCE;
            startActivity(createFloatList.Companion.RemoteActionCompatParcelizer(this));
            finish();
            int i3 = 36 / 0;
        } else {
            RemoteActionCompatParcelizer();
            createFloatList.Companion companion2 = createFloatList.INSTANCE;
            startActivity(createFloatList.Companion.RemoteActionCompatParcelizer(this));
            finish();
        }
        int i4 = read + 65;
        write = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.WebvttCssStyleFontSizeUnit.write
    public final void onCommand() {
        int i = 2 % 2;
        int i2 = read + 83;
        write = i2 % 128;
        int i3 = i2 % 2;
        getAnchorU.Companion companion = getAnchorU.INSTANCE;
        Intent intentIconCompatParcelizer = getAnchorU.Companion.IconCompatParcelizer(this);
        intentIconCompatParcelizer.putExtra("key_override_transition", false);
        startActivity(intentIconCompatParcelizer);
        finish();
        int i4 = read + 103;
        write = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0713  */
    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onStop() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.onboarding.splash.SplashActivity.onStop():void");
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        int i = 2 % 2;
        NavigationBarViewSavedState navigationBarViewSavedState = new NavigationBarViewSavedState(R.style.SplashTheme, null, null, 6, null);
        int i2 = write + 79;
        read = i2 % 128;
        if (i2 % 2 == 0) {
            return navigationBarViewSavedState;
        }
        throw null;
    }

    @Override // kotlin.setTargetTagName, kotlin.RtspMessageUtil, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() throws Throwable {
        String str;
        Object[] objArr;
        String str2;
        Object[] objArr2;
        Method method;
        int i;
        String str3;
        String str4;
        String str5;
        String str6;
        int i2;
        Object[] objArr3;
        Method method2;
        Object[] objArr4;
        String str7;
        Object[] objArr5;
        int i3 = 2 % 2;
        int i4 = write + 21;
        read = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr6 = new Object[1];
        m((byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 103), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 13, new char[]{'\f', '0', '*', '\r', 7, '+', '*', ')', '\t', '\n', '$', '*', '%', '\n', 31, 25, 5, '&', 29, '\f', 18, '\r'}, objArr6);
        String str8 = (String) objArr6[0];
        Object[] objArr7 = new Object[1];
        m((byte) ((ViewConfiguration.getTouchSlop() >> 8) + 43), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(0) - 22, new char[]{26, 31, 20, '\r', '\n', 23, '-', '\"', 27, '\n', '\"', '!', '-', 0, 13866}, objArr7);
        String str9 = (String) objArr7[0];
        Object[] objArr8 = new Object[1];
        n(new byte[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, true, new int[]{5, 26, 2, 0}, objArr8);
        String str10 = (String) objArr8[0];
        Object[] objArr9 = new Object[1];
        m((byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 80), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 14, new char[]{16, '\"', 13881, 13881, 26, '-', 29, 25, 13883, 13883, 28, '/', 27, 20, 28, '.', '\f', '+'}, objArr9);
        String str11 = (String) objArr9[0];
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-767600216);
        if (objRemoteActionCompatParcelizer == null) {
            int mode = View.MeasureSpec.getMode(0) + 885;
            int iGreen = 28 - Color.green(0);
            Object[] objArr10 = new Object[1];
            o(r16[29], (short) 22, (byte) (-$$j[5]), objArr10);
            objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), mode, iGreen, -1401512643, false, (String) objArr10[0], null);
        }
        long j = ((Field) objRemoteActionCompatParcelizer).getLong(null);
        long jLongValue = ((Long) Class.forName(str8).getDeclaredMethod(str9, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(2106938142);
        if (objRemoteActionCompatParcelizer2 == null) {
            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 885;
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 28;
            byte b = $$j[15];
            str = str9;
            Object[] objArr11 = new Object[1];
            o(b, (short) (b | 188), r16[170], objArr11);
            objRemoteActionCompatParcelizer2 = startForeground.read(pressedStateDuration, longPressTimeout, packedPositionGroup, 64788363, false, (String) objArr11[0], null);
        } else {
            str = str9;
        }
        if (j == ((jLongValue - ((((Field) objRemoteActionCompatParcelizer2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(380687563);
            if (objRemoteActionCompatParcelizer3 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                int fadingEdgeLength = 885 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int doubleTapTimeout = 28 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                short s = (short) 154;
                Object[] objArr12 = new Object[1];
                o((byte) ($$k >>> 2), s, (byte) (s & 124), objArr12);
                objRemoteActionCompatParcelizer3 = startForeground.read(cIndexOf, fadingEdgeLength, doubleTapTimeout, 1761153118, false, (String) objArr12[0], null);
            }
            Object[] objArr13 = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
            objArr = new Object[]{new int[]{i}, new int[]{i}, strArr, new int[1]};
            int i6 = ((int[]) objArr13[0])[0];
            int i7 = ((int[]) objArr13[1])[0];
            String[] strArr = (String[]) objArr13[2];
            int iMyPid = Process.myPid();
            int i8 = (~(678017050 | iMyPid)) | 293734049;
            int i9 = ~((~iMyPid) | (-2734081));
            int i10 = 907049526 + ((i8 | i9) * (-470)) + (((~(iMyPid | 971751099)) | i9) * 470) + 1505893470;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[3])[0] = i12 ^ (i12 << 5);
            str2 = str;
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i13 = write + 101;
                read = i13 % 128;
                if (i13 % 2 != 0) {
                    method = Class.forName(str10).getMethod(str11, new Class[0]);
                    objArr2 = null;
                } else {
                    objArr2 = null;
                    method = Class.forName(str10).getMethod(str11, new Class[0]);
                }
                baseContext = (Context) method.invoke(objArr2, objArr2);
            }
            if (baseContext != null) {
                int i14 = read + 45;
                write = i14 % 128;
                if (i14 % 2 == 0) {
                    boolean z = baseContext instanceof ContextWrapper;
                    throw null;
                }
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            Object[] objArr14 = new Object[1];
            m((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1) + 7), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 19, new char[]{27, 7, '0', 20, '(', 28, '\f', '0', 14, '\'', '-', '$', 11, 30, 31, '\n'}, objArr14);
            Class<?> cls = Class.forName((String) objArr14[0]);
            Object[] objArr15 = new Object[1];
            m((byte) (20 - View.MeasureSpec.getSize(0)), (Process.myPid() >> 22) + 16, new char[]{'+', '*', 26, '-', 28, '.', 31, '\'', '0', 11, '\b', 2, '$', '\f', '-', 27}, objArr15);
            int iIntValue = ((Integer) cls.getMethod((String) objArr15[0], Object.class).invoke(null, this)).intValue();
            int i15 = read + 11;
            write = i15 % 128;
            int i16 = i15 % 2;
            try {
                Object[] objArr16 = {baseContext, Integer.valueOf(iIntValue), 0, 1505893470};
                byte[] bArr = $$y;
                Object[] objArr17 = new Object[1];
                p(bArr[143], (short) 360, bArr[47], objArr17);
                Class<?> cls2 = Class.forName((String) objArr17[0]);
                Object[] objArr18 = new Object[1];
                p(bArr[27], bArr[113], bArr[15], objArr18);
                objArr = (Object[]) cls2.getMethod((String) objArr18[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr16);
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(380687563);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int iKeyCodeFromString = 885 - KeyEvent.keyCodeFromString("");
                    int minimumFlingVelocity = 28 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    short s2 = (short) 154;
                    Object[] objArr19 = new Object[1];
                    o((byte) ($$k >>> 2), s2, (byte) (s2 & 124), objArr19);
                    objRemoteActionCompatParcelizer4 = startForeground.read(maximumDrawingCacheSize, iKeyCodeFromString, minimumFlingVelocity, 1761153118, false, (String) objArr19[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer4).set(null, objArr);
                try {
                    str2 = str;
                    long jLongValue2 = ((Long) Class.forName(str8).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(2106938142);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char pressedStateDuration2 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                        int iIndexOf = 884 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        int iRgb = (-16777188) - Color.rgb(0, 0, 0);
                        byte b2 = $$j[15];
                        Object[] objArr20 = new Object[1];
                        o(b2, (short) (b2 | 188), r13[170], objArr20);
                        objRemoteActionCompatParcelizer5 = startForeground.read(pressedStateDuration2, iIndexOf, iRgb, 64788363, false, (String) objArr20[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-767600216);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                        int iArgb = Color.argb(0, 0, 0, 0) + 885;
                        int iAlpha = Color.alpha(0) + 28;
                        Object[] objArr21 = new Object[1];
                        o(r4[29], (short) 22, (byte) (-$$j[5]), objArr21);
                        objRemoteActionCompatParcelizer6 = startForeground.read(packedPositionChild, iArgb, iAlpha, -1401512643, false, (String) objArr21[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf2);
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
        int i17 = ((int[]) objArr[1])[0];
        int i18 = ((int[]) objArr[0])[0];
        if (i18 == i17) {
            Object[] objArr22 = {new int[]{i}, new int[]{i}, strArr, new int[1]};
            int i19 = ((int[]) objArr[3])[0];
            int i20 = ((int[]) objArr[0])[0];
            int i21 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[2];
            int integer = (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 1357265050;
            int i22 = ~integer;
            int i23 = i19 + 1767741952 + (((~(773494263 | i22)) | 1064494232) * 226) + (((~(i22 | 1065022975)) | 772965520 | (~((-1064494233) | integer))) * (-113)) + ((~(integer | 773494263)) * 113);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr22[3])[0] = i25 ^ (i25 << 5);
            Object[] objArr23 = {new int[]{i}, new int[]{i}, strArr, new int[1]};
            int i26 = ((int[]) objArr22[3])[0];
            int i27 = ((int[]) objArr22[0])[0];
            int i28 = ((int[]) objArr22[1])[0];
            String[] strArr3 = (String[]) objArr22[2];
            int i29 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().uiMode;
            int i30 = i26 + (-532469332) + (((~(i29 | 340332763)) | 49332794) * (-668)) + ((340332763 | (~(49332794 | i29))) * 1336) + ((i29 | 385471227) * 668);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr23[3])[0] = i32 ^ (i32 << 5);
            Object[] objArr24 = {new int[]{i}, new int[]{i}, strArr, new int[1]};
            int i33 = ((int[]) objArr23[3])[0];
            int i34 = ((int[]) objArr23[0])[0];
            int i35 = ((int[]) objArr23[1])[0];
            String[] strArr4 = (String[]) objArr23[2];
            int i36 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
            int i37 = (-416910240) + (((~(349170962 | i36)) | (-58170994)) * 672);
            int i38 = ~i36;
            int i39 = i33 + i37 + (((~(i36 | (-58170994))) | (~((-349170963) | i38))) * (-672)) + (((~(58170993 | i38)) | (-402653044)) * 672);
            int i40 = (i39 << 13) ^ i39;
            int i41 = i40 ^ (i40 >>> 17);
            ((int[]) objArr24[3])[0] = i41 ^ (i41 << 5);
            str4 = str8;
            i2 = 0;
            str5 = str10;
            str6 = str11;
            str3 = str2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr5 = (String[]) objArr[2];
            if (strArr5 != null) {
                for (String str12 : strArr5) {
                    arrayList.add(str12);
                }
            }
            Context baseContext2 = getBaseContext();
            if (baseContext2 == null) {
                int i42 = write + 93;
                read = i42 % 128;
                if (i42 % 2 != 0) {
                    method2 = Class.forName(str10).getMethod(str11, new Class[1]);
                    objArr3 = null;
                } else {
                    objArr3 = null;
                    method2 = Class.forName(str10).getMethod(str11, new Class[0]);
                }
                baseContext2 = (Context) method2.invoke(objArr3, objArr3);
            }
            if (baseContext2 != null) {
                baseContext2 = ((baseContext2 instanceof ContextWrapper) && ((ContextWrapper) baseContext2).getBaseContext() == null) ? null : baseContext2.getApplicationContext();
            }
            if (Looper.myLooper() == null) {
                int i43 = write + 75;
                read = i43 % 128;
                if (i43 % 2 != 0) {
                    i = 0;
                    int i44 = 34 / 0;
                } else {
                    i = 0;
                }
                baseContext2 = null;
            } else {
                i = 0;
            }
            str3 = str2;
            long j2 = i17 ^ i18;
            str4 = str8;
            Context context = baseContext2;
            long j3 = -1;
            long j4 = (((((long) i) << 32) | (j3 - ((j3 >> 63) << 32))) & j2) ^ 2264222826200301568L;
            int i45 = read + 13;
            write = i45 % 128;
            int i46 = i45 % 2;
            try {
                Object[] objArr25 = {context, Long.valueOf(j4), 527180450L};
                byte[] bArr2 = $$y;
                str5 = str10;
                str6 = str11;
                Object[] objArr26 = new Object[1];
                p(bArr2[169], bArr2[89], bArr2[146], objArr26);
                Class<?> cls3 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                p(bArr2[9], (short) 304, (byte) (bArr2[113] - 1), objArr27);
                cls3.getMethod((String) objArr27[0], Context.class, Long.TYPE, Long.TYPE).invoke(null, objArr25);
                Object[] objArr28 = {new int[]{i}, new int[]{i}, strArr, new int[1]};
                int i47 = ((int[]) objArr[3])[0];
                int i48 = ((int[]) objArr[0])[0];
                int i49 = ((int[]) objArr[1])[0];
                String[] strArr6 = (String[]) objArr[2];
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i50 = i47 + (((642420576 + (((~elapsedCpuTime) | (-243747993)) * 1444)) + (((~(elapsedCpuTime | 90818956)) | ((~(200181012 | elapsedCpuTime)) | (-267373981))) * (-1444))) - 107608912);
                int i51 = (i50 << 13) ^ i50;
                int i52 = i51 ^ (i51 >>> 17);
                ((int[]) objArr28[3])[0] = i52 ^ (i52 << 5);
                long j5 = -1;
                long j6 = 0;
                long j7 = (((((long) 0) << 32) | (j5 - ((j5 >> 63) << 32))) & j2) | (((long) 4) << 32) | (j6 - ((j6 >> 63) << 32));
                try {
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        objRemoteActionCompatParcelizer7 = startForeground.read((char) (4536 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 6054 - Drawable.resolveOpacity(0, 0), 42 - ((Process.getThreadPriority(0) + 20) >> 6), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer7).invoke(null, null);
                    Object[] objArr29 = {364046471, Long.valueOf(j7), arrayList, TrainingApplication.RemoteActionCompatParcelizer(), false, false};
                    Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(1458445422);
                    if (objRemoteActionCompatParcelizer8 == null) {
                        objRemoteActionCompatParcelizer8 = startForeground.read((char) View.resolveSize(0, 0), 6031 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), TextUtils.getTrimmedLength("") + 24, 682088699, false, "IconCompatParcelizer", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer8).invoke(objInvoke, objArr29);
                    Object[] objArr30 = {new int[]{i}, new int[]{i}, strArr, new int[1]};
                    int i53 = ((int[]) objArr28[3])[0];
                    int i54 = ((int[]) objArr28[0])[0];
                    int i55 = ((int[]) objArr28[1])[0];
                    String[] strArr7 = (String[]) objArr28[2];
                    int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                    int i56 = ~iFreeMemory;
                    int i57 = i53 + 1521376224 + ((iFreeMemory | 239075584) * 988) + (((~(532747216 | i56)) | (-535418880)) * (-1976)) + (((~(iFreeMemory | 241747247)) | 239075584 | (~((-241747248) | i56))) * 988);
                    int i58 = (i57 << 13) ^ i57;
                    int i59 = i58 ^ (i58 >>> 17);
                    ((int[]) objArr30[3])[0] = i59 ^ (i59 << 5);
                    Toast.makeText((Context) null, i18 / (((i18 - 1) * i18) % 2), 0).show();
                    Object[] objArr31 = {new int[]{i}, new int[]{i}, strArr, new int[1]};
                    int i60 = ((int[]) objArr30[3])[0];
                    int i61 = ((int[]) objArr30[0])[0];
                    int i62 = ((int[]) objArr30[1])[0];
                    String[] strArr8 = (String[]) objArr30[2];
                    int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
                    int i63 = i60 + (-1352354400) + (((~(611863644 | layoutDirection)) | 293638817) * 336) + (((~(layoutDirection | 902863613)) | 2638848) * (-168)) + (((~((~layoutDirection) | 902863613)) | 611863644) * 168);
                    int i64 = (i63 << 13) ^ i63;
                    int i65 = i64 ^ (i64 >>> 17);
                    i2 = 0;
                    ((int[]) objArr31[3])[0] = i65 ^ (i65 << 5);
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
        Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(2138589378);
        if (objRemoteActionCompatParcelizer9 == null) {
            char cGreen = (char) (41577 - Color.green(i2));
            int keyRepeatTimeout = 1324 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int iAlpha2 = Color.alpha(i2) + 19;
            Object[] objArr32 = new Object[1];
            o(r1[29], (short) 22, (byte) (-$$j[5]), objArr32);
            objRemoteActionCompatParcelizer9 = startForeground.read(cGreen, keyRepeatTimeout, iAlpha2, 20024407, false, (String) objArr32[0], null);
        }
        long j8 = ((Field) objRemoteActionCompatParcelizer9).getLong(null);
        String str13 = str3;
        long jLongValue3 = ((Long) Class.forName(str4).getDeclaredMethod(str13, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objRemoteActionCompatParcelizer10 = startForeground.RemoteActionCompatParcelizer(-543427635);
        if (objRemoteActionCompatParcelizer10 == null) {
            char modifierMetaStateMask = (char) (41576 - ((byte) KeyEvent.getModifierMetaStateMask()));
            int tapTimeout = 1324 - (ViewConfiguration.getTapTimeout() >> 16);
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 19;
            Object[] objArr33 = new Object[1];
            o((byte) (-$$j[115]), (short) 158, r11[10], objArr33);
            objRemoteActionCompatParcelizer10 = startForeground.read(modifierMetaStateMask, tapTimeout, iNormalizeMetaState, -1580058792, false, (String) objArr33[0], null);
        }
        if (j8 == ((jLongValue3 - ((((Field) objRemoteActionCompatParcelizer10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objRemoteActionCompatParcelizer11 = startForeground.RemoteActionCompatParcelizer(-977490602);
            if (objRemoteActionCompatParcelizer11 == null) {
                char maximumDrawingCacheSize2 = (char) (41577 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                int gidForName = Process.getGidForName("") + 1325;
                int i66 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 20;
                byte[] bArr3 = $$j;
                Object[] objArr34 = new Object[1];
                o(bArr3[70], bArr3[28], bArr3[15], objArr34);
                objRemoteActionCompatParcelizer11 = startForeground.read(maximumDrawingCacheSize2, gidForName, i66, -1141544509, false, (String) objArr34[0], null);
            }
            Object[] objArr35 = (Object[]) ((Field) objRemoteActionCompatParcelizer11).get(null);
            objArr4 = new Object[]{new int[1], new int[1], new int[1]};
            int i67 = ((int[]) objArr35[0])[0];
            int i68 = ((int[]) objArr35[2])[0];
            ((int[]) objArr4[0])[0] = i67;
            ((int[]) objArr4[2])[0] = i68;
            int i69 = ((((~(r0 | 920335862)) * UnixStat.DEFAULT_FILE_PERM) - 1893779947) + (((~((~System.identityHashCode(this)) | 920335862)) | 847249570) * UnixStat.DEFAULT_FILE_PERM)) - 684694217;
            int i70 = (i69 << 13) ^ i69;
            int i71 = i70 ^ (i70 >>> 17);
            ((int[]) objArr4[1])[0] = i71 ^ (i71 << 5);
        } else {
            Object[] objArr36 = new Object[1];
            m((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 21), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 12, new char[]{27, 7, '0', 20, '(', 28, '\f', '0', 14, '\'', '-', '$', 11, 30, 31, '\n'}, objArr36);
            Class<?> cls4 = Class.forName((String) objArr36[0]);
            Object[] objArr37 = new Object[1];
            m((byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 19), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 6, new char[]{'+', '*', 26, '-', 28, '.', 31, '\'', '0', 11, '\b', 2, '$', '\f', '-', 27}, objArr37);
            Object[] objArr38 = {Integer.valueOf(((Integer) cls4.getMethod((String) objArr37[0], Object.class).invoke(null, this)).intValue()), -684694217};
            Object objRemoteActionCompatParcelizer12 = startForeground.RemoteActionCompatParcelizer(642803205);
            if (objRemoteActionCompatParcelizer12 == null) {
                char minimumFlingVelocity2 = (char) (41577 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                int iLastIndexOf = 1323 - TextUtils.lastIndexOf("", '0');
                int i72 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 18;
                byte[] bArr4 = $$j;
                Object[] objArr39 = new Object[1];
                o(bArr4[70], bArr4[28], bArr4[15], objArr39);
                objRemoteActionCompatParcelizer12 = startForeground.read(minimumFlingVelocity2, iLastIndexOf, i72, 1478075024, false, (String) objArr39[0], new Class[]{Integer.TYPE, Integer.TYPE});
            }
            objArr4 = (Object[]) ((Method) objRemoteActionCompatParcelizer12).invoke(null, objArr38);
            Object objRemoteActionCompatParcelizer13 = startForeground.RemoteActionCompatParcelizer(-977490602);
            if (objRemoteActionCompatParcelizer13 == null) {
                char c = (char) (41578 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                int maximumFlingVelocity = 1324 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int packedPositionGroup2 = 19 - ExpandableListView.getPackedPositionGroup(0L);
                byte[] bArr5 = $$j;
                Object[] objArr40 = new Object[1];
                o(bArr5[70], bArr5[28], bArr5[15], objArr40);
                objRemoteActionCompatParcelizer13 = startForeground.read(c, maximumFlingVelocity, packedPositionGroup2, -1141544509, false, (String) objArr40[0], null);
            }
            ((Field) objRemoteActionCompatParcelizer13).set(null, objArr4);
            try {
                long jLongValue4 = ((Long) Class.forName(str4).getDeclaredMethod(str13, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue4);
                Object objRemoteActionCompatParcelizer14 = startForeground.RemoteActionCompatParcelizer(-543427635);
                if (objRemoteActionCompatParcelizer14 == null) {
                    char maxKeyCode = (char) (41577 - (KeyEvent.getMaxKeyCode() >> 16));
                    int iIndexOf2 = 1323 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int touchSlop = 19 - (ViewConfiguration.getTouchSlop() >> 8);
                    Object[] objArr41 = new Object[1];
                    o((byte) (-$$j[115]), (short) 158, r10[10], objArr41);
                    objRemoteActionCompatParcelizer14 = startForeground.read(maxKeyCode, iIndexOf2, touchSlop, -1580058792, false, (String) objArr41[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer14).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                Object objRemoteActionCompatParcelizer15 = startForeground.RemoteActionCompatParcelizer(2138589378);
                if (objRemoteActionCompatParcelizer15 == null) {
                    char packedPositionChild2 = (char) (41576 - ExpandableListView.getPackedPositionChild(0L));
                    int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 1324;
                    int doubleTapTimeout2 = 19 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    Object[] objArr42 = new Object[1];
                    o(r6[29], (short) 22, (byte) (-$$j[5]), objArr42);
                    objRemoteActionCompatParcelizer15 = startForeground.read(packedPositionChild2, touchSlop2, doubleTapTimeout2, 20024407, false, (String) objArr42[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer15).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        Object obj = objArr4[2];
        int i73 = ((int[]) obj)[0];
        Object obj2 = objArr4[0];
        int i74 = ((int[]) obj2)[0];
        if (i74 != i73) {
            String str14 = str6;
            Context baseContext3 = getBaseContext();
            if (baseContext3 == null) {
                baseContext3 = (Context) Class.forName(str5).getMethod(str14, new Class[0]).invoke(null, null);
            }
            if (baseContext3 != null) {
                baseContext3 = (!((baseContext3 instanceof ContextWrapper) ^ true) && ((ContextWrapper) baseContext3).getBaseContext() == null) ? null : baseContext3.getApplicationContext();
            }
            if (Looper.myLooper() == null) {
                baseContext3 = null;
            }
            long j9 = i73 ^ i74;
            long j10 = -1;
            Object[] objArr43 = {baseContext3, Long.valueOf((((((long) 0) << 32) | (j10 - ((j10 >> 63) << 32))) & j9) ^ 3404737037872398336L), 792725068L};
            byte[] bArr6 = $$y;
            Object[] objArr44 = new Object[1];
            p(bArr6[143], (short) WalletConstants.ERROR_CODE_INVALID_TRANSACTION, bArr6[202], objArr44);
            Class<?> cls5 = Class.forName((String) objArr44[0]);
            Object[] objArr45 = new Object[1];
            p((byte) (bArr6[205] - 1), (short) 150, bArr6[143], objArr45);
            cls5.getMethod((String) objArr45[0], Context.class, Long.TYPE, Long.TYPE).invoke(null, objArr43);
            Object[] objArr46 = {new int[1], new int[1], new int[1]};
            int i75 = ((int[]) objArr4[1])[0];
            int i76 = ((int[]) objArr4[0])[0];
            int i77 = ((int[]) objArr4[2])[0];
            ((int[]) objArr46[0])[0] = i76;
            ((int[]) objArr46[2])[0] = i77;
            int iIdentityHashCode = System.identityHashCode(this);
            int i78 = ~iIdentityHashCode;
            int i79 = i75 + (-197472018) + (((~((-1408691484) | i78)) | 361023878) * (-90)) + (((~((-1408691484) | iIdentityHashCode)) | (-1475800480)) * (-45)) + (((~(iIdentityHashCode | (-361023879))) | (-1408691484) | (~(i78 | 361023878))) * 45);
            int i80 = (i79 << 13) ^ i79;
            int i81 = i80 ^ (i80 >>> 17);
            ((int[]) objArr46[1])[0] = i81 ^ (i81 << 5);
            long j11 = -1;
            long j12 = j9 & ((((long) 0) << 32) | (j11 - ((j11 >> 63) << 32)));
            long j13 = 0;
            long j14 = j12 | (((long) 13) << 32) | (j13 - ((j13 >> 63) << 32));
            Object objRemoteActionCompatParcelizer16 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer16 == null) {
                objRemoteActionCompatParcelizer16 = startForeground.read((char) (4535 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), View.resolveSizeAndState(0, 0, 0) + 6054, View.combineMeasuredStates(0, 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer16).invoke(null, null);
            Object[] objArr47 = {364046471, Long.valueOf(j14), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), false, false};
            Object objRemoteActionCompatParcelizer17 = startForeground.RemoteActionCompatParcelizer(1458445422);
            if (objRemoteActionCompatParcelizer17 == null) {
                objRemoteActionCompatParcelizer17 = startForeground.read((char) (ViewConfiguration.getScrollBarSize() >> 8), Gravity.getAbsoluteGravity(0, 0) + 6030, 24 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 682088699, false, "IconCompatParcelizer", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objRemoteActionCompatParcelizer17).invoke(objInvoke2, objArr47);
            Object[] objArr48 = {new int[1], new int[1], new int[1]};
            int i82 = ((int[]) objArr46[1])[0];
            int i83 = ((int[]) objArr46[0])[0];
            int i84 = ((int[]) objArr46[2])[0];
            ((int[]) objArr48[0])[0] = i83;
            ((int[]) objArr48[2])[0] = i84;
            int iMyTid = Process.myTid();
            int i85 = i82 + 1720442616 + ((~((~iMyTid) | (-622952458))) * 433) + (((~((-1112939925) | iMyTid)) | (-656775438)) * (-433)) + (((~(iMyTid | (-656775438))) | (-1735892382)) * 433);
            int i86 = (i85 << 13) ^ i85;
            int i87 = i86 ^ (i86 >>> 17);
            ((int[]) objArr48[1])[0] = i87 ^ (i87 << 5);
            throw null;
        }
        Object[] objArr49 = {new int[1], new int[1], new int[1]};
        int i88 = ((int[]) objArr4[1])[0];
        int i89 = ((int[]) obj2)[0];
        int i90 = ((int[]) obj)[0];
        ((int[]) objArr49[0])[0] = i89;
        ((int[]) objArr49[2])[0] = i90;
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i91 = ~iIdentityHashCode2;
        int i92 = i88 + 1370130863 + (((~((-1118537746) | i91)) | 1076592641) * 98) + (((~(i91 | (-651177617))) | (-1118537746) | (~(651177616 | iIdentityHashCode2))) * (-49)) + (((~(iIdentityHashCode2 | (-1118537746))) | (-1727770258)) * 49);
        int i93 = i92 ^ (i92 << 13);
        int i94 = i93 ^ (i93 >>> 17);
        Object obj3 = objArr49[1];
        ((int[]) obj3)[0] = i94 ^ (i94 << 5);
        Object[] objArr50 = {new int[1], new int[1], new int[1]};
        int i95 = ((int[]) obj3)[0];
        int i96 = ((int[]) objArr49[0])[0];
        int i97 = ((int[]) objArr49[2])[0];
        ((int[]) objArr50[0])[0] = i96;
        ((int[]) objArr50[2])[0] = i97;
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 868013719;
        int i98 = i95 + (-339293135) + (((~((-312215717) | (~iCodePointAt))) | (~(1457499645 | iCodePointAt))) * (-272)) + (((~((-383585718) | iCodePointAt)) | 71370001) * (-272)) + (((~(iCodePointAt | 383585717)) | 1386129644) * 272);
        int i99 = (i98 << 13) ^ i98;
        int i100 = i99 ^ (i99 >>> 17);
        Object obj4 = objArr50[1];
        ((int[]) obj4)[0] = i100 ^ (i100 << 5);
        Object[] objArr51 = {new int[1], new int[1], new int[1]};
        int i101 = ((int[]) obj4)[0];
        int i102 = ((int[]) objArr50[0])[0];
        int i103 = ((int[]) objArr50[2])[0];
        ((int[]) objArr51[0])[0] = i102;
        ((int[]) objArr51[2])[0] = i103;
        int iIdentityHashCode3 = System.identityHashCode(this);
        int i104 = ~iIdentityHashCode3;
        int i105 = (~((-662825446) | i104)) | 25282724;
        int i106 = ~(iIdentityHashCode3 | 1744432637);
        int i107 = i101 + 1576740921 + ((i105 | i106) * (-502)) + ((i106 | (~(i104 | (-637542722)))) * 502);
        int i108 = (i107 << 13) ^ i107;
        int i109 = i108 ^ (i108 >>> 17);
        ((int[]) objArr51[1])[0] = i109 ^ (i109 << 5);
        Object objRemoteActionCompatParcelizer18 = startForeground.RemoteActionCompatParcelizer(-1664046677);
        if (objRemoteActionCompatParcelizer18 == null) {
            char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 57571);
            int i110 = 2202 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int iGreen2 = Color.green(0) + 20;
            Object[] objArr52 = new Object[1];
            o((byte) (-$$j[115]), (short) 158, r3[10], objArr52);
            objRemoteActionCompatParcelizer18 = startForeground.read(c2, i110, iGreen2, -493261506, false, (String) objArr52[0], null);
        }
        long j15 = ((Field) objRemoteActionCompatParcelizer18).getLong(null);
        long jLongValue5 = ((Long) Class.forName(str4).getDeclaredMethod(str13, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objRemoteActionCompatParcelizer19 = startForeground.RemoteActionCompatParcelizer(1747242018);
        if (objRemoteActionCompatParcelizer19 == null) {
            char pressedStateDuration3 = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 57572);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 2201;
            int iMyTid2 = (Process.myTid() >> 22) + 20;
            byte b3 = $$j[15];
            Object[] objArr53 = new Object[1];
            o(b3, (short) (b3 | 188), r10[170], objArr53);
            objRemoteActionCompatParcelizer19 = startForeground.read(pressedStateDuration3, iCombineMeasuredStates, iMyTid2, 376244407, false, (String) objArr53[0], null);
        }
        if (j15 == ((jLongValue5 - ((((Field) objRemoteActionCompatParcelizer19).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objRemoteActionCompatParcelizer20 = startForeground.RemoteActionCompatParcelizer(1244109383);
            if (objRemoteActionCompatParcelizer20 == null) {
                char edgeSlop = (char) (57572 - (ViewConfiguration.getEdgeSlop() >> 16));
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 2201;
                int i111 = 21 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                short s3 = (short) 154;
                Object[] objArr54 = new Object[1];
                o((byte) ($$k >>> 2), s3, (byte) (s3 & 124), objArr54);
                objRemoteActionCompatParcelizer20 = startForeground.read(edgeSlop, offsetAfter, i111, 879648466, false, (String) objArr54[0], null);
            }
            Object[] objArr55 = (Object[]) ((Field) objRemoteActionCompatParcelizer20).get(null);
            objArr5 = new Object[]{new int[1], new int[]{i}, strArr, new int[]{i}};
            int i112 = ((int[]) objArr55[3])[0];
            int i113 = ((int[]) objArr55[1])[0];
            String[] strArr9 = (String[]) objArr55[2];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i114 = ~((-42671431) | startElapsedRealtime);
            int i115 = ~startElapsedRealtime;
            int i116 = (-492379554) + ((i114 | (~(414305064 | i115))) * (-1808)) + (((~((-8456449) | startElapsedRealtime)) | (~(i115 | 448520046))) * 904) + (((~(startElapsedRealtime | (-414305065))) | 34214982 | (~(42671430 | i115))) * 904) + 133765825;
            int i117 = (i116 << 13) ^ i116;
            int i118 = i117 ^ (i117 >>> 17);
            ((int[]) objArr5[0])[0] = i118 ^ (i118 << 5);
            int i119 = read + 121;
            write = i119 % 128;
            int i120 = i119 % 2;
            str7 = str6;
        } else {
            Context baseContext4 = getBaseContext();
            if (baseContext4 == null) {
                str7 = str6;
                baseContext4 = (Context) Class.forName(str5).getMethod(str7, new Class[0]).invoke(null, null);
            } else {
                str7 = str6;
            }
            if (baseContext4 != null) {
                int i121 = read + 51;
                write = i121 % 128;
                if (i121 % 2 == 0) {
                    boolean z2 = baseContext4 instanceof ContextWrapper;
                    Object obj5 = null;
                    obj5.hashCode();
                    throw null;
                }
                baseContext4 = (((baseContext4 instanceof ContextWrapper) ^ true) || ((ContextWrapper) baseContext4).getBaseContext() != null) ? baseContext4.getApplicationContext() : null;
            }
            Object[] objArr56 = new Object[1];
            m((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(0) + 19), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 98, new char[]{27, 7, '0', 20, '(', 28, '\f', '0', 14, '\'', '-', '$', 11, 30, 31, '\n'}, objArr56);
            Class<?> cls6 = Class.forName((String) objArr56[0]);
            Object[] objArr57 = new Object[1];
            m((byte) (20 - (ViewConfiguration.getScrollBarSize() >> 8)), (ViewConfiguration.getPressedStateDuration() >> 16) + 16, new char[]{'+', '*', 26, '-', 28, '.', 31, '\'', '0', 11, '\b', 2, '$', '\f', '-', 27}, objArr57);
            Object[] objArr58 = {baseContext4, Integer.valueOf(((Integer) cls6.getMethod((String) objArr57[0], Object.class).invoke(null, this)).intValue()), 0, 133765825};
            byte[] bArr7 = $$y;
            Object[] objArr59 = new Object[1];
            p(bArr7[143], (short) 423, bArr7[388], objArr59);
            Class<?> cls7 = Class.forName((String) objArr59[0]);
            Object[] objArr60 = new Object[1];
            p((byte) (bArr7[205] - 1), (short) 150, bArr7[143], objArr60);
            objArr5 = (Object[]) cls7.getMethod((String) objArr60[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr58);
            if (baseContext4 != null) {
                Object objRemoteActionCompatParcelizer21 = startForeground.RemoteActionCompatParcelizer(1244109383);
                if (objRemoteActionCompatParcelizer21 == null) {
                    char deadChar = (char) (57572 - KeyEvent.getDeadChar(0, 0));
                    int iIndexOf3 = 2200 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int i122 = 21 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    short s4 = (short) 154;
                    Object[] objArr61 = new Object[1];
                    o((byte) ($$k >>> 2), s4, (byte) (s4 & 124), objArr61);
                    objRemoteActionCompatParcelizer21 = startForeground.read(deadChar, iIndexOf3, i122, 879648466, false, (String) objArr61[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer21).set(null, objArr5);
                try {
                    long jLongValue6 = ((Long) Class.forName(str4).getDeclaredMethod(str13, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf5 = Long.valueOf(jLongValue6);
                    Object objRemoteActionCompatParcelizer22 = startForeground.RemoteActionCompatParcelizer(1747242018);
                    if (objRemoteActionCompatParcelizer22 == null) {
                        char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 57573);
                        int packedPositionChild3 = 2200 - ExpandableListView.getPackedPositionChild(0L);
                        int i123 = 20 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                        byte b4 = $$j[15];
                        Object[] objArr62 = new Object[1];
                        o(b4, (short) (b4 | 188), r9[170], objArr62);
                        objRemoteActionCompatParcelizer22 = startForeground.read(cIndexOf2, packedPositionChild3, i123, 376244407, false, (String) objArr62[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer22).set(null, lValueOf5);
                    Long lValueOf6 = Long.valueOf(jLongValue6 >> 12);
                    Object objRemoteActionCompatParcelizer23 = startForeground.RemoteActionCompatParcelizer(-1664046677);
                    if (objRemoteActionCompatParcelizer23 == null) {
                        char c3 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 57571);
                        int mirror = AndroidCharacter.getMirror('0') + 2153;
                        int mirror2 = 'D' - AndroidCharacter.getMirror('0');
                        Object[] objArr63 = new Object[1];
                        o((byte) (-$$j[115]), (short) 158, r4[10], objArr63);
                        objRemoteActionCompatParcelizer23 = startForeground.read(c3, mirror, mirror2, -493261506, false, (String) objArr63[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer23).set(null, lValueOf6);
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            }
        }
        int i124 = ((int[]) objArr5[1])[0];
        int i125 = ((int[]) objArr5[3])[0];
        if (i125 == i124) {
            Object[] objArr64 = {new int[1], new int[]{i}, strArr, new int[]{i}};
            int i126 = ((int[]) objArr5[0])[0];
            int i127 = ((int[]) objArr5[3])[0];
            int i128 = ((int[]) objArr5[1])[0];
            String[] strArr10 = (String[]) objArr5[2];
            int i129 = Settings.System.getInt(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getContentResolver(), "screen_brightness", -1);
            int i130 = ~i129;
            int i131 = i126 + 1272787272 + (((~(i130 | (-440034318))) | 897010812) * (-1042)) + (((-440034318) | i129) * 521) + (((~(i129 | (-897010813))) | 625281136 | (~(i130 | (-168304642)))) * 521);
            int i132 = (i131 << 13) ^ i131;
            int i133 = i132 ^ (i132 >>> 17);
            ((int[]) objArr64[0])[0] = i133 ^ (i133 << 5);
            Object[] objArr65 = {new int[1], new int[]{i}, strArr, new int[]{i}};
            int i134 = ((int[]) objArr64[0])[0];
            int i135 = ((int[]) objArr64[3])[0];
            int i136 = ((int[]) objArr64[1])[0];
            String[] strArr11 = (String[]) objArr64[2];
            int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
            int i137 = 302358598 + (((~((-950826114) | iFreeMemory2)) | 493849618) * (-318));
            int i138 = ~(493849618 | iFreeMemory2);
            int i139 = ~iFreeMemory2;
            int i140 = i134 + i137 + ((i138 | (~((-88311827) | i139))) * 318) + (((~(iFreeMemory2 | (-88311827))) | (~(1039137939 | i139))) * 318);
            int i141 = (i140 << 13) ^ i140;
            int i142 = i141 ^ (i141 >>> 17);
            ((int[]) objArr65[0])[0] = i142 ^ (i142 << 5);
            Object[] objArr66 = {new int[1], new int[]{i}, strArr, new int[]{i}};
            int i143 = ((int[]) objArr65[0])[0];
            int i144 = ((int[]) objArr65[3])[0];
            int i145 = ((int[]) objArr65[1])[0];
            String[] strArr12 = (String[]) objArr65[2];
            int i146 = ~(System.identityHashCode(this) | 67479886);
            int i147 = i143 + (-605124558) + (((-389496609) | i146) * (-220)) + ((i146 | (-389529455)) * 220) + 1069327172;
            int i148 = (i147 << 13) ^ i147;
            int i149 = i148 ^ (i148 >>> 17);
            ((int[]) objArr66[0])[0] = i149 ^ (i149 << 5);
            super.onStart();
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr13 = (String[]) objArr5[2];
        if (strArr13 != null) {
            for (String str15 : strArr13) {
                arrayList2.add(str15);
            }
        }
        Context baseContext5 = getBaseContext();
        if (baseContext5 == null) {
            baseContext5 = (Context) Class.forName(str5).getMethod(str7, new Class[0]).invoke(null, null);
        }
        if (baseContext5 != null) {
            baseContext5 = ((baseContext5 instanceof ContextWrapper) && ((ContextWrapper) baseContext5).getBaseContext() == null) ? null : baseContext5.getApplicationContext();
        }
        if (Looper.myLooper() == null) {
            baseContext5 = null;
        }
        long j16 = i124 ^ i125;
        long j17 = -1;
        Object[] objArr67 = {baseContext5, Long.valueOf((((((long) 0) << 32) | (j17 - ((j17 >> 63) << 32))) & j16) ^ 7865498365079846912L), 1831329079L};
        byte[] bArr8 = $$y;
        Object[] objArr68 = new Object[1];
        p(bArr8[143], (short) 440, bArr8[23], objArr68);
        Class<?> cls8 = Class.forName((String) objArr68[0]);
        Object[] objArr69 = new Object[1];
        p(bArr8[27], bArr8[113], bArr8[15], objArr69);
        cls8.getMethod((String) objArr69[0], Context.class, Long.TYPE, Long.TYPE).invoke(null, objArr67);
        Object[] objArr70 = {new int[1], new int[]{i}, strArr, new int[]{i}};
        int i150 = ((int[]) objArr5[0])[0];
        int i151 = ((int[]) objArr5[3])[0];
        int i152 = ((int[]) objArr5[1])[0];
        String[] strArr14 = (String[]) objArr5[2];
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i153 = ~iUptimeMillis;
        int i154 = 188296326 + (((~((-579735667) | i153)) | 546181232 | (~(122759171 | i153)) | (~((-89204738) | iUptimeMillis))) * (-84));
        int i155 = (~(iUptimeMillis | 122759171)) | 579735666;
        int i156 = ~(i153 | (-122759172));
        int i157 = i150 + i154 + ((i155 | i156) * (-84)) + ((89204737 | i156) * 84);
        int i158 = (i157 << 13) ^ i157;
        int i159 = i158 ^ (i158 >>> 17);
        ((int[]) objArr70[0])[0] = i159 ^ (i159 << 5);
        long j18 = -1;
        long j19 = j16 & ((((long) 0) << 32) | (j18 - ((j18 >> 63) << 32)));
        long j20 = 0;
        long j21 = j19 | (((long) 3) << 32) | (j20 - ((j20 >> 63) << 32));
        Object objRemoteActionCompatParcelizer24 = startForeground.RemoteActionCompatParcelizer(-1407079962);
        if (objRemoteActionCompatParcelizer24 == null) {
            objRemoteActionCompatParcelizer24 = startForeground.read((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4535), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 6054, 42 - Gravity.getAbsoluteGravity(0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
        }
        Object objInvoke3 = ((Method) objRemoteActionCompatParcelizer24).invoke(null, null);
        Object[] objArr71 = {364046471, Long.valueOf(j21), arrayList2, TrainingApplication.RemoteActionCompatParcelizer(), false, false};
        Object objRemoteActionCompatParcelizer25 = startForeground.RemoteActionCompatParcelizer(1458445422);
        if (objRemoteActionCompatParcelizer25 == null) {
            objRemoteActionCompatParcelizer25 = startForeground.read((char) Color.argb(0, 0, 0, 0), 6029 - TextUtils.indexOf((CharSequence) "", '0', 0), 23 - Process.getGidForName(""), 682088699, false, "IconCompatParcelizer", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
        }
        ((Method) objRemoteActionCompatParcelizer25).invoke(objInvoke3, objArr71);
        Object[] objArr72 = {new int[1], new int[]{i}, strArr, new int[]{i}};
        int i160 = ((int[]) objArr70[0])[0];
        int i161 = ((int[]) objArr70[3])[0];
        int i162 = ((int[]) objArr70[1])[0];
        String[] strArr15 = (String[]) objArr70[2];
        int i163 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
        int i164 = i160 + (((1232429618 + (((~i163) | (-456844905)) * 1444)) + (((~(i163 | 746819)) | ((~(456229675 | i163)) | (-456910700))) * (-1444))) - 870461104);
        int i165 = (i164 << 13) ^ i164;
        int i166 = i165 ^ (i165 >>> 17);
        ((int[]) objArr72[0])[0] = i166 ^ (i166 << 5);
        throw new RuntimeException(String.valueOf(i125));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a7  */
    @Override // kotlin.setTargetTagName, kotlin.RtspMessageUtil, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.onboarding.splash.SplashActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a1  */
    @Override // kotlin.setTargetTagName, kotlin.RtspMessageUtil, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.onboarding.splash.SplashActivity.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x09b9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x09ff A[Catch: all -> 0x0ab9, TryCatch #12 {all -> 0x0ab9, blocks: (B:129:0x09f9, B:131:0x09ff, B:132:0x0a28), top: B:278:0x09f9, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0093  */
    @Override // kotlin.setTargetTagName, kotlin.RtspMessageUtil, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6017
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.onboarding.splash.SplashActivity.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.RtspMessageUtil, com.marrow.ui.activities.base.BaseActivity
    public final NavigationBarViewSavedState onAddQueueItem() {
        int iIconCompatParcelizer = PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer();
        int iIconCompatParcelizer2 = PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer();
        int iIconCompatParcelizer3 = TokenStreamFactory.IconCompatParcelizer();
        return (NavigationBarViewSavedState) AudioAttributesCompatParcelizer(TokenStreamFactory.IconCompatParcelizer(), iIconCompatParcelizer, -1144148583, 1144148584, iIconCompatParcelizer2, new Object[]{this}, iIconCompatParcelizer3);
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final int handleMediaPlayPauseIfPendingOnHandler() {
        return ((Integer) AudioAttributesCompatParcelizer(TokenStreamFactory.IconCompatParcelizer(), 1151647120 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1), -290112595, 290112597, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(3) - 1757282408, new Object[]{this}, TokenStreamFactory.IconCompatParcelizer())).intValue();
    }

    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity
    public final boolean RatingCompat() {
        int i = 2 % 2;
        int i2 = read + 111;
        int i3 = i2 % 128;
        write = i3;
        boolean z = i2 % 2 == 0;
        int i4 = i3 + 25;
        read = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final boolean onSetPlaybackSpeed() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 57;
        write = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 97;
        write = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 96 / 0;
        }
        return true;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) + 207598929;
        int iIconCompatParcelizer = PlanGroup$$ExternalSyntheticLambda0.IconCompatParcelizer();
        AudioAttributesCompatParcelizer(TokenStreamFactory.IconCompatParcelizer(), iCodePointAt, 307550151, -307550151, iIconCompatParcelizer, new Object[]{this, bundle}, TokenStreamFactory.IconCompatParcelizer());
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        int i = 2 % 2;
        int i2 = write + 65;
        read = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 10 / 0;
        }
        return -1;
    }
}
