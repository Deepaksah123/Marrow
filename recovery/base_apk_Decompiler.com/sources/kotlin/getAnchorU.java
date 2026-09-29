package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.IndoorBuilding;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/getAnchorU;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Lo/parseAdaptationSetChild;", "AudioAttributesCompatParcelizer", "Lo/parseAdaptationSetChild;", "IconCompatParcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getAnchorU extends getImage {
    private static char AudioAttributesImplApi21Parcelizer;
    private static int AudioAttributesImplBaseParcelizer;
    private static int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer;
    private static long read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private parseAdaptationSetChild IconCompatParcelizer;
    private static final byte[] $$l = {TarConstants.LF_NORMAL, -108, 98, 5};
    private static final int $$m = 65;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {80, -72, 126, -24, -74, 14, 42, -18, -40, 19, -20, 15, -29, 4, -50, 27, -6, -13, -50, 35, -11, -6, -10, -10, -18, 0, -3, -49, 20, 1, -8, -24, 0, -18, 4, -54, 42, -13, -24, 4, -13, -22, 2, -34, 29, -20, -3, -21, -12, 6, -20, -15, -32, 12, 3, -20, -7, -12, -56, 17, 3, -10, -52, 35, -11, -6, -24, 10, -45, 8, 8, -24, -7, -2, -12, 8, -30, 4, 10, -1, -7, -4, -24, -45, 25, 8, -20, -3, -10, -52, 35, -11, -6, -24, 10, -45, 8, 8, -24, -7, -2, -12, 8, -30, 4, -74, 14, -7, -4, -2, 25, -12, -21, -14, -7, -7, -26, 8, 10, -13, -8, -12, -22, -74, 74, -14, -18, 2, -24};
    private static final int $$k = 217;
    private static final byte[] $$d = {123, -86, 125, 25, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 203;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;
    private static int MediaBrowserCompatItemReceiver = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(int r6, short r7, byte r8) {
        /*
            byte[] r0 = kotlin.getAnchorU.$$l
            int r7 = r7 * 4
            int r7 = 103 - r7
            int r6 = r6 + 4
            int r8 = r8 * 4
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r6 = r6 + 1
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getAnchorU.$$n(int, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.getAnchorU.$$d
            int r8 = 114 - r8
            int r1 = 44 - r6
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            int r6 = 43 - r6
            r2 = -1
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2d
        L13:
            r3 = r2
        L14:
            int r3 = r3 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r1, r7)
            r9[r7] = r6
            return
        L26:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r3 = r3 + r7
            int r7 = r3 + (-1)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getAnchorU.g(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0023). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 105 - r8
            int r6 = 56 - r6
            int r7 = r7 + 73
            byte[] r0 = kotlin.getAnchorU.$$j
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r7
            r4 = r2
            r7 = r6
            goto L23
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            r3 = r0[r8]
        L23:
            int r7 = r7 + r3
            int r7 = r7 + 9
            int r8 = r8 + 1
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getAnchorU.h(int, int, short, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.getAnchorU$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/getAnchorU$write;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "IconCompatParcelizer", "(Landroid/content/Context;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Intent IconCompatParcelizer(Context p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new Intent(p0, (Class<?>) getAnchorU.class);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void f(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        int i5 = $10 + 17;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i7 = $11 + 75;
            $10 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 22748 - TextUtils.getOffsetBefore("", 0), 36 - Color.green(0), 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (31368 - MotionEvent.axisFromString("")), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 2721, 37 - MotionEvent.axisFromString(""), 1895162189, false, $$n(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) ExpandableListView.getPackedPositionType(0L), 15713 - Color.blue(0), 64 - Color.green(0), -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    i2 = 2;
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (View.MeasureSpec.getMode(0) + 40976), Color.green(0) + 6122, KeyEvent.getDeadChar(0, 0) + 29, -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (read ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) RemoteActionCompatParcelizer) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) AudioAttributesImplApi21Parcelizer) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
                i3 = i2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static void e(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3;
        int i4 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = IconCompatParcelizer;
        int i5 = -470782045;
        int i6 = 43695;
        int i7 = 1;
        int i8 = 0;
        if (iArr3 != null) {
            int i9 = $11 + 1;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i11 = 0;
            while (i11 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i11])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(i5);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (i6 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), KeyEvent.keyCodeFromString("") + 23297, View.MeasureSpec.makeMeasureSpec(0, 0) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr4[i11] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i11++;
                    i5 = -470782045;
                    i6 = 43695;
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
        int[] iArr6 = IconCompatParcelizer;
        float f = BitmapDescriptorFactory.HUE_RED;
        if (iArr6 != null) {
            int i12 = $11 + 35;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                int i13 = $10 + 93;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                Object[] objArr3 = new Object[i7];
                objArr3[i8] = Integer.valueOf(iArr6[i3]);
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-470782045);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.getCapsMode("", i8, i8) + 43695), (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)) + 23296, (ExpandableListView.getPackedPositionForGroup(i8) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i8) == 0L ? 0 : -1)) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                }
                iArr2[i3] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                i3++;
                int i15 = $10 + 107;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                i7 = 1;
                i8 = 0;
                f = BitmapDescriptorFactory.HUE_RED;
            }
            i2 = i8;
            iArr6 = iArr2;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr6, i2, iArr5, i2, length3);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = i2;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            cArr[i2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr5);
            for (int i17 = 0; i17 < 16; i17++) {
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[i17];
                Object[] objArr4 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (43695 - Color.argb(0, 0, 0, 0)), 23297 - View.getDefaultSize(0, 0), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 15, -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                buildremovealldownloadsintent.read = iIntValue;
            }
            int i18 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i18;
            buildremovealldownloadsintent.read ^= iArr5[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[17];
            int i19 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i20 = buildremovealldownloadsintent.read;
            cArr[0] = (char) (buildremovealldownloadsintent.AudioAttributesCompatParcelizer >>> 16);
            cArr[1] = (char) buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            cArr[2] = (char) (buildremovealldownloadsintent.read >>> 16);
            cArr[3] = (char) buildremovealldownloadsintent.read;
            buildRemoveAllDownloadsIntent.read(iArr5);
            cArr2[buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2] = cArr[0];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 1] = cArr[1];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 2] = cArr[2];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 3] = cArr[3];
            Object[] objArr5 = {buildremovealldownloadsintent, buildremovealldownloadsintent};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(516305436);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (48194 - ExpandableListView.getPackedPositionType(0L)), 20126 - View.getDefaultSize(0, 0), View.resolveSizeAndState(0, 0, 0) + 20, 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            i2 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i21 = $10 + 41;
        $11 = i21 % 128;
        int i22 = i21 % 2;
        objArr[0] = str;
    }

    @Override // kotlin.getImage, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        parseAdaptationSetChild parseadaptationsetchild;
        parseAdaptationSetChild parseadaptationsetchild2;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 91, new int[]{-219644573, 2081197929, 2097160361, 1745313190, 860544537, 929675615, -471402823, -1818555504, -101439093, 357460104}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 30, new int[]{-1466808354, 483962833, 29796743, -1073420659}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                f((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2454), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) - 37, new char[]{17859, 505, 15758, 11914, 48794, 63686, 54737, 45365, 44379, 21660, 16104, 43086, 45188, 9544, 52095, 22739, 56684, 17993, 46529, 63786, 9246, 5327, 12916, 20068, 41531, 13544}, new char[]{2903, 63097, 47552, 42761}, new char[]{0, 0, 0, 0}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 14, new int[]{361994500, -532666240, 770603759, 112662336, 1568006567, 333574209, -2115516108, 1061930364, 1943870252, -217356837}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                    int i2 = MediaBrowserCompatCustomActionResultReceiver + 77;
                    AudioAttributesImplApi26Parcelizer = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 5 / 3;
                    }
                    baseContext = null;
                } else {
                    baseContext = baseContext.getApplicationContext();
                }
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 4535), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 6054, 42 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 13, new int[]{-725140623, -76873794, 89974672, 2102307872, -1384827959, 173179860, 907556929, -1298886457, 1777730467, 2017378047, -652322788, -186388766, 1095355512, -1839423018, 805558377, 1300955716, -350403603, -433552432, -1099310855, 255263251, 1428262175, -1863658197, 1117586927, 792303480}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    e(TextUtils.getTrimmedLength("") + 64, new int[]{1381038210, -1703334301, 1595066458, -913833507, -1651987283, 403208706, -1425469411, 1548510180, 809151921, -625606989, -1538865292, -392798902, 850167703, -1433559312, -1123524869, 1843652318, 1286934339, 679957748, 1491039874, 446888180, -201378691, -438374364, -1639938343, -1682676817, -205398396, 1818333115, -1078294395, -1337995054, 578771308, 1597900275, -552926493, -979440719}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    f((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4, new char[]{5794, 55784, 14657, 27591, 46137, 42978, 17223, 4161, 57140, 12359, 31825, 12038, 26199, 45200, 39292, 38503, 17290, 33840, 6979, 9411, 11584, 32667, 31595, 52344, 45463, 41022, 22396, 6688, 14662, 28043, 5154, 4401, 51245, 26431, 30656, 34150, 17116, 11953, 50258, 8023, 28433, 22592, 19280, 4421, 65103, 54893, 21207, 49461, 33938, 19254, 6125, 40942, 51647, 15979, 37719, 27371, 58021, 64187, 31700, 32219, 13615, 25477, 14184, 58837}, new char[]{53301, 21494, 1766, 23916}, new char[]{0, 0, 0, 0}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    e((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 66, new int[]{1824366604, -871872646, 125616100, -1139363287, -1818369560, 1266103125, -868449638, 1316378478, 902099144, 1700688874, -1914095658, 53487586, -1752286323, -1658594802, 1415140685, 1821335215, 1781536427, -1327576646, 1993380784, 1556947907, -272276618, 278780222, -215347764, -1365361385, 384140936, -1373153409, -881089625, 1762386332, 574928189, -1942498601, 1226626526, -1345638372, 1659077861, -1724587590}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    f((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 34797), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 4, new char[]{59847, 27007, 60107, 32982, 8048, 56158}, new char[]{40818, 40497, 61949, 45447}, new char[]{0, 0, 0, 0}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    f((char) ((-1) - Process.getGidForName("")), ViewConfiguration.getMinimumFlingVelocity() >> 16, new char[]{12178, 19833, 40022, 12435, 29018, 41375, 58077, 49435, 33800, 2035, 56088, 56965, 32169, 50016, 8486, 4815, 12779, 1669, 58437, 20322, 4295, 54823, 27436, 26252, 40039, 39855, 49657, 1879, 53957, 56326, 24913, 1437, 60564, 12846, 56718, 54010}, new char[]{50284, 9200, 11474, 45635}, new char[]{0, 0, 0, 0}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), 6030 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr12);
                    int i4 = AudioAttributesImplApi26Parcelizer + 119;
                    MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
                    int i5 = i4 % 2;
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
            char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 13183);
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1649;
            int mirror = 'J' - AndroidCharacter.getMirror('0');
            byte[] bArr = $$d;
            Object[] objArr13 = new Object[1];
            g(bArr[5], bArr[17], bArr[62], objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(deadChar, tapTimeout, mirror, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            int i6 = MediaBrowserCompatCustomActionResultReceiver + 5;
            AudioAttributesImplApi26Parcelizer = i6 % 128;
            int i7 = i6 % 2;
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char c = (char) (13184 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                int iIndexOf = 1648 - TextUtils.indexOf((CharSequence) "", '0', 0);
                int size = 26 - View.MeasureSpec.getSize(0);
                byte[] bArr2 = $$d;
                Object[] objArr14 = new Object[1];
                g((byte) (-bArr2[30]), (short) (-bArr2[65]), bArr2[9], objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(c, iIndexOf, size, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            f((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 48634), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, new char[]{12162, 20097, 12362, 2540, 18675, 40271, 56744, 25687, 25416, 12032, 43714, 54057, 25060, 41114, 10051, 25219}, new char[]{11263, 5573, 7527, 14014}, new char[]{0, 0, 0, 0}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            e((ViewConfiguration.getWindowTouchSlop() >> 8) + 16, new int[]{1261427244, 427230382, 1255166542, -188716455, 1358809898, 1929211339, 1822866523, 409302623}, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, -928765569};
                byte[] bArr3 = $$j;
                byte b = bArr3[25];
                Object[] objArr18 = new Object[1];
                h(b, (byte) (b | 38), (byte) 101, objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b2 = (byte) (bArr3[19] + 1);
                byte b3 = bArr3[25];
                Object[] objArr19 = new Object[1];
                h(b2, b3, (byte) (b3 | 46), objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char doubleTapTimeout = (char) (13183 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                    int iRgb = Color.rgb(0, 0, 0) + 16778865;
                    int scrollBarFadeDuration = 26 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    byte[] bArr4 = $$d;
                    Object[] objArr20 = new Object[1];
                    g((byte) (-bArr4[30]), (short) (-bArr4[65]), bArr4[9], objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(doubleTapTimeout, iRgb, scrollBarFadeDuration, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 13, new int[]{-219644573, 2081197929, 2097160361, 1745313190, 2119383834, -1719121453, -1478203667, -485637276, -342894501, -1989138919, -7587513, 1956941284}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    f((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) + 2100), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(0) - 229167515, new char[]{44281, 19648, 27057, 49197, 6705, 19794, 27005, 35244, 3574, 58333, 38110, 3047, 21447, 56396, 42553}, new char[]{35462, 22318, 38386, 34568}, new char[]{0, 0, 0, 0}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char pressedStateDuration = (char) (13183 - (ViewConfiguration.getPressedStateDuration() >> 16));
                        int iResolveSize = View.resolveSize(0, 0) + 1649;
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 26;
                        byte b4 = (byte) (-$$d[30]);
                        Object[] objArr23 = new Object[1];
                        g(b4, (short) (b4 | 65), r7[9], objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(pressedStateDuration, iResolveSize, minimumFlingVelocity, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 13183);
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 1649;
                        int i8 = (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 25;
                        byte[] bArr5 = $$d;
                        Object[] objArr24 = new Object[1];
                        g(bArr5[5], bArr5[17], bArr5[62], objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(scrollDefaultDelay, capsMode, i8, -133433128, false, (String) objArr24[0], null);
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
        int i9 = ((int[]) objArr[3])[0];
        int i10 = ((int[]) objArr[2])[0];
        if (i10 != i9) {
            long j = -1;
            long j2 = ((long) (i10 ^ i9)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4534 - TextUtils.indexOf((CharSequence) "", '0', 0)), 6054 - TextUtils.getOffsetBefore("", 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            parseadaptationsetchild = null;
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {189207808, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getEdgeSlop() >> 16), View.resolveSizeAndState(0, 0, 0) + 6030, KeyEvent.normalizeMetaState(0) + 24);
                Object[] objArr26 = new Object[1];
                h((byte) ($$j[44] - 1), (byte) ($$k & 47), r3[15], objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        } else {
            parseadaptationsetchild = null;
        }
        CmcdConfigurationRequestConfig.write(this, Integer.valueOf(R.style.Theme_Marrow2), 0, R.attr.colorSurfaceVariant5, false, 10);
        super.onCreate(p0);
        parseAdaptationSetChild parseadaptationsetchildRemoteActionCompatParcelizer = parseAdaptationSetChild.RemoteActionCompatParcelizer(getLayoutInflater());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parseadaptationsetchildRemoteActionCompatParcelizer, "");
        this.IconCompatParcelizer = parseadaptationsetchildRemoteActionCompatParcelizer;
        if (parseadaptationsetchildRemoteActionCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            parseadaptationsetchild2 = parseadaptationsetchild;
        } else {
            parseadaptationsetchild2 = parseadaptationsetchildRemoteActionCompatParcelizer;
        }
        setContentView(parseadaptationsetchild2.IconCompatParcelizer());
        if (p0 == null) {
            IndoorBuilding.Companion remoteActionCompatParcelizer = IndoorBuilding.INSTANCE;
            CmcdConfigurationRequestConfig.write(this, R.id.fragment_container, IndoorBuilding.Companion.write());
        }
    }

    @Override // kotlin.getImage, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = AudioAttributesImplApi26Parcelizer + 53;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            f((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) + 2453), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 4, new char[]{17859, 505, 15758, 11914, 48794, 63686, 54737, 45365, 44379, 21660, 16104, 43086, 45188, 9544, 52095, 22739, 56684, 17993, 46529, 63786, 9246, 5327, 12916, 20068, 41531, 13544}, new char[]{2903, 63097, 47552, 42761}, new char[]{0, 0, 0, 0}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 14, new int[]{361994500, -532666240, 770603759, 112662336, 1568006567, 333574209, -2115516108, 1061930364, 1943870252, -217356837}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = AudioAttributesImplApi26Parcelizer + 73;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            if (i4 % 2 == 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4534 - Process.getGidForName("")), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6053, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.indexOf("", ""), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 6030, Color.blue(0) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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

    @Override // kotlin.getImage, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 41;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr = new Object[1];
                f((char) (TextUtils.getTrimmedLength("") + 2489), TextUtils.indexOf("", "", 0, 0), new char[]{17859, 505, 15758, 11914, 48794, 63686, 54737, 45365, 44379, 21660, 16104, 43086, 45188, 9544, 52095, 22739, 56684, 17993, 46529, 63786, 9246, 5327, 12916, 20068, 41531, 13544}, new char[]{2903, 63097, 47552, 42761}, new char[]{0, 0, 0, 0}, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 81, new int[]{361994500, -532666240, 770603759, 112662336, 1568006567, 333574209, -2115516108, 1061930364, 1943870252, -217356837}, objArr2);
                baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                    int i3 = AudioAttributesImplApi26Parcelizer + 39;
                    MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
                    int i4 = i3 % 2;
                    baseContext = null;
                } else {
                    baseContext = baseContext.getApplicationContext();
                }
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf("", "", 0, 0) + 4535), 6055 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.getOffsetAfter("", 0) + 6030, View.MeasureSpec.makeMeasureSpec(0, 0) + 24, -861814097, false, "read", new Class[]{Context.class});
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
            int i5 = AudioAttributesImplApi26Parcelizer + 57;
            MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        getBaseContext();
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:0|2|(2:4|(2:(2:9|(2:11|(1:15)(1:14))(0))(1:16)|(9:18|273|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0))(0)|31|(26:262|33|(2:35|(2:37|(2:39|43)(1:40))(2:41|42))(1:43)|79|279|80|(1:82)|83|(3:85|(1:87)|88)(19:89|90|269|91|(1:93)|94|95|258|96|(1:98)|99|100|101|(1:103)|104|(1:106)|107|(1:109)|110)|111|(4:114|(12:116|(3:118|(3:121|122|119)|283)|123|275|124|(1:126)|127|128|129|267|130|282)(1:281)|143|112)|280|166|(1:168)|169|(3:171|(1:173)|174)(13:176|254|177|178|(1:180)|181|271|182|183|(1:185)|186|(1:188)|189)|175|190|(6:192|193|(1:195)|196|197|198)|199|(1:201)|202|(3:204|(1:206)|207)(14:209|210|(1:212)|213|214|(1:216)|217|260|218|219|(1:221)|222|(1:224)|225)|208|226|(7:228|229|(1:231)|232|233|234|235)(1:284))|47|256|48|(1:50)|51|277|52|(1:54)|55|56|79|279|80|(0)|83|(0)(0)|111|(1:112)|280|166|(0)|169|(0)(0)|175|190|(0)|199|(0)|202|(0)(0)|208|226|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0ade, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0adf, code lost:
    
        r8 = new java.lang.Object[1];
        f((char) (android.view.MotionEvent.axisFromString("") + 1), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1134746541, new char[]{28599, 9177, 60099, 43908, 512, 39433, 15373, 51979, 22959, 42078, 24268}, new char[]{44470, 41691, 45123, 3162}, new char[]{0, 0, 0, 0}, r8);
        r4 = (java.lang.String) r8[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0b1a, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r5 = new java.io.PrintStream(r2);
        r0.printStackTrace(r5);
        r5.close();
        r1 = r2.toString(org.apache.commons.compress.utils.CharsetNames.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0b31, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0b35, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0b44, code lost:
    
        r1 = kotlin.startForeground.RemoteActionCompatParcelizer(-1407079962);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0b48, code lost:
    
        if (r1 == null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0b4a, code lost:
    
        r1 = kotlin.startForeground.read((char) (4534 - android.text.TextUtils.lastIndexOf("", '0')), 6054 - android.text.TextUtils.indexOf("", "", 0, 0), android.view.View.getDefaultSize(0, 0) + 42, -764908173, false, "IconCompatParcelizer", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0b73, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0b7f, code lost:
    
        r6 = new java.lang.Object[]{941597483, 81604378625L, r2, com.marrow.TrainingApplication.RemoteActionCompatParcelizer(), false};
        r2 = (java.lang.Class) kotlin.startForeground.IconCompatParcelizer((char) android.text.TextUtils.getOffsetBefore("", 0), (-16771186) - android.graphics.Color.rgb(0, 0, 0), android.view.View.MeasureSpec.getMode(0) + 24);
        r9 = new java.lang.Object[1];
        h((byte) (kotlin.getAnchorU.$$j[44] - 1), (byte) (kotlin.getAnchorU.$$k & 47), r4[15], r9);
        r2.getMethod((java.lang.String) r9[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x098e A[Catch: all -> 0x0ade, TryCatch #14 {all -> 0x0ade, blocks: (B:80:0x05ac, B:82:0x05b2, B:83:0x05f3, B:85:0x0600, B:87:0x0609, B:88:0x0653, B:111:0x0984, B:112:0x0988, B:114:0x098e, B:116:0x09a5, B:119:0x09b2, B:121:0x09b5, B:128:0x0a24, B:134:0x0ab4, B:136:0x0aba, B:137:0x0abb, B:139:0x0abd, B:141:0x0ac4, B:142:0x0ac5, B:89:0x065e, B:101:0x07f2, B:103:0x07f8, B:104:0x0843, B:106:0x08d9, B:107:0x0923, B:109:0x0938, B:110:0x097e, B:145:0x0acb, B:147:0x0ad2, B:148:0x0ad3, B:150:0x0ad5, B:152:0x0adc, B:153:0x0add, B:96:0x0763, B:98:0x0778, B:99:0x07e6, B:130:0x0a34, B:91:0x071a, B:93:0x072c, B:94:0x075c, B:124:0x09ee, B:126:0x09f4, B:127:0x0a1d), top: B:279:0x05ac, outer: #4, inners: #2, #8, #9, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0c07  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0c5a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0cc2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0f94  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x107b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x10ca  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x1128  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x13fe  */
    /* JADX WARN: Removed duplicated region for block: B:284:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x05b2 A[Catch: all -> 0x0ade, TryCatch #14 {all -> 0x0ade, blocks: (B:80:0x05ac, B:82:0x05b2, B:83:0x05f3, B:85:0x0600, B:87:0x0609, B:88:0x0653, B:111:0x0984, B:112:0x0988, B:114:0x098e, B:116:0x09a5, B:119:0x09b2, B:121:0x09b5, B:128:0x0a24, B:134:0x0ab4, B:136:0x0aba, B:137:0x0abb, B:139:0x0abd, B:141:0x0ac4, B:142:0x0ac5, B:89:0x065e, B:101:0x07f2, B:103:0x07f8, B:104:0x0843, B:106:0x08d9, B:107:0x0923, B:109:0x0938, B:110:0x097e, B:145:0x0acb, B:147:0x0ad2, B:148:0x0ad3, B:150:0x0ad5, B:152:0x0adc, B:153:0x0add, B:96:0x0763, B:98:0x0778, B:99:0x07e6, B:130:0x0a34, B:91:0x071a, B:93:0x072c, B:94:0x075c, B:124:0x09ee, B:126:0x09f4, B:127:0x0a1d), top: B:279:0x05ac, outer: #4, inners: #2, #8, #9, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0600 A[Catch: all -> 0x0ade, TryCatch #14 {all -> 0x0ade, blocks: (B:80:0x05ac, B:82:0x05b2, B:83:0x05f3, B:85:0x0600, B:87:0x0609, B:88:0x0653, B:111:0x0984, B:112:0x0988, B:114:0x098e, B:116:0x09a5, B:119:0x09b2, B:121:0x09b5, B:128:0x0a24, B:134:0x0ab4, B:136:0x0aba, B:137:0x0abb, B:139:0x0abd, B:141:0x0ac4, B:142:0x0ac5, B:89:0x065e, B:101:0x07f2, B:103:0x07f8, B:104:0x0843, B:106:0x08d9, B:107:0x0923, B:109:0x0938, B:110:0x097e, B:145:0x0acb, B:147:0x0ad2, B:148:0x0ad3, B:150:0x0ad5, B:152:0x0adc, B:153:0x0add, B:96:0x0763, B:98:0x0778, B:99:0x07e6, B:130:0x0a34, B:91:0x071a, B:93:0x072c, B:94:0x075c, B:124:0x09ee, B:126:0x09f4, B:127:0x0a1d), top: B:279:0x05ac, outer: #4, inners: #2, #8, #9, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x065e A[Catch: all -> 0x0ade, TRY_LEAVE, TryCatch #14 {all -> 0x0ade, blocks: (B:80:0x05ac, B:82:0x05b2, B:83:0x05f3, B:85:0x0600, B:87:0x0609, B:88:0x0653, B:111:0x0984, B:112:0x0988, B:114:0x098e, B:116:0x09a5, B:119:0x09b2, B:121:0x09b5, B:128:0x0a24, B:134:0x0ab4, B:136:0x0aba, B:137:0x0abb, B:139:0x0abd, B:141:0x0ac4, B:142:0x0ac5, B:89:0x065e, B:101:0x07f2, B:103:0x07f8, B:104:0x0843, B:106:0x08d9, B:107:0x0923, B:109:0x0938, B:110:0x097e, B:145:0x0acb, B:147:0x0ad2, B:148:0x0ad3, B:150:0x0ad5, B:152:0x0adc, B:153:0x0add, B:96:0x0763, B:98:0x0778, B:99:0x07e6, B:130:0x0a34, B:91:0x071a, B:93:0x072c, B:94:0x075c, B:124:0x09ee, B:126:0x09f4, B:127:0x0a1d), top: B:279:0x05ac, outer: #4, inners: #2, #8, #9, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a1  */
    @Override // kotlin.getImage, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6180
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getAnchorU.attachBaseContext(android.content.Context):void");
    }

    static {
        AudioAttributesImplBaseParcelizer = 1;
        AudioAttributesImplApi21Parcelizer();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatItemReceiver + 41;
        AudioAttributesImplBaseParcelizer = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // kotlin.getImage, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 51;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 63;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    static void AudioAttributesImplApi21Parcelizer() {
        IconCompatParcelizer = new int[]{-289470575, -351976810, -1982963944, -559800979, -1455081780, -176261048, 758760177, -695696676, 599842550, -264431543, 124229700, -1623338023, -1984588796, -1692707399, 1558217687, 190475008, 1267047969, 1532667960};
        read = -3498762522182953692L;
        RemoteActionCompatParcelizer = -136981212;
        AudioAttributesImplApi21Parcelizer = (char) 65148;
    }
}
