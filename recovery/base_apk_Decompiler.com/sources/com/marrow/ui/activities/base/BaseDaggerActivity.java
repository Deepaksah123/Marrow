package com.marrow.ui.activities.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.data.models.ResponseError;
import in.juspay.hypersdk.core.GodelServiceConnection;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.BaseUrl;
import kotlin.MediaSessionConnectorCustomActionProvider;
import kotlin.buildResolutionString;
import kotlin.buildSetRequirementsIntent;
import kotlin.getBasicChar;
import kotlin.getChannel;
import kotlin.getExtendedEsFrChar;
import kotlin.getNextEventTime;
import kotlin.getProvider;
import kotlin.getTrackName;
import kotlin.handlePreambleAddressCode;
import kotlin.hasSelectionOverride;
import kotlin.isSpecialNorthAmericanChar;
import kotlin.notifyDownloads;
import kotlin.setSdkPayload;
import kotlin.startForeground;
import kotlin.updateShuffleButton;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseDaggerActivity<P extends getExtendedEsFrChar> extends BaseActivity implements getBasicChar, getChannel, getNextEventTime, View.OnClickListener {

    @setSdkPayload
    public P mPresenter;
    private static final byte[] $$c = {59, 79, 7, -2};
    private static final int $$f = 215;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {32, -59, 22, 74, 74, -14, 7, 4, 2, -25, 12, 21, 14, 7, 7, 26, -8, -10, 13, 8, 12, 22, 74, -74, 14, 18, -2, 24, -17, -3, 10, TarConstants.LF_BLK, -35, 11, 6, 24, -10, 45, -8, -8, 24, 7, 2, 12, -8, 30, -4, -10, 1, 7, 4, 24, 45, -25, -8, 20, 3, 10, TarConstants.LF_BLK, -35, 11, 6, 24, -10, 45, -8, -8, 24, 7, 2, 12, -8, 30, -4, 74, -48, 11, -6, 60, -26, 3, -2, 11, 8, 24, 10, 24, -18, 6, 8, 11, 22, 13, -3, TarConstants.LF_NORMAL, -32, 6, 14, 21, -10};
    private static final int $$k = 247;
    private static final byte[] $$a = {105, -128, TarConstants.LF_BLK, -25, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 75;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int RatingCompat = 1;
    private static char[] RemoteActionCompatParcelizer = {28485, 28502, 28480, 28498, 28503, 28509, 28566, 28499, 28596, 28483, 28481, 28497, 28496, 28581, 28500, 28504, 28562, 28565, 28482, 28591, 28590, 28569, 28588, 28510, 28560, 28589, 28564, 28525, 28604, 28508, 28579, 28563};
    private static int AudioAttributesCompatParcelizer = 411398116;
    private static boolean IconCompatParcelizer = true;
    private static boolean write = true;
    private static long read = -5144009660439784942L;

    private static String $$i(int i, byte b, short s) {
        int i2 = (b * 2) + 104;
        byte[] bArr = $$c;
        int i3 = i * 4;
        int i4 = 3 - (s * 3);
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            int i6 = i4 + (-i3);
            i4 = i4;
            i2 = i6;
        }
        while (true) {
            int i7 = i4 + 1;
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i3) {
                return new String(bArr2, 0);
            }
            i4 = i7;
            i2 += -bArr[i7];
        }
    }

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = (~((~i2) | i6)) | (~(i6 | i3));
        int i8 = (~i6) | (~i3);
        int i9 = i7 | (~(i8 | i2));
        int i10 = (~i8) | i2;
        int i11 = ~(i3 | i2);
        int i12 = i2 + i6 + i4 + ((-417414852) * i5) + (1247522396 * i);
        int i13 = i12 * i12;
        int i14 = (i2 * (-1219797419)) + 1526988800 + ((-1219797419) * i6) + (825712212 * i9) + ((-1651424424) * i10) + ((-825712212) * i11) + ((-2045509632) * i4) + ((-2135949312) * i5) + ((-953155584) * i) + ((-430374912) * i13);
        int i15 = ((i2 * 184508743) - 476012450) + (i6 * 184508743) + (i9 * (-996)) + (i10 * 1992) + (i11 * 996) + (i4 * 184509739) + (i5 * (-953474796)) + (i * (-288057996)) + (i13 * (-839712768));
        if (i14 + (i15 * i15 * 1709113344) != 1) {
            return AudioAttributesCompatParcelizer(objArr);
        }
        BaseDaggerActivity baseDaggerActivity = (BaseDaggerActivity) objArr[0];
        hasSelectionOverride hasselectionoverride = (hasSelectionOverride) objArr[1];
        int i16 = 2 % 2;
        int i17 = RatingCompat + 27;
        MediaBrowserCompatCustomActionResultReceiver = i17 % 128;
        int i18 = i17 % 2;
        baseDaggerActivity.getSupportFragmentManager().IconCompatParcelizer().write(R.id.video_fragment_container, hasselectionoverride).RemoteActionCompatParcelizer();
        int i19 = MediaBrowserCompatCustomActionResultReceiver + 85;
        RatingCompat = i19 % 128;
        int i20 = i19 % 2;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = 44 - r7
            int r8 = r8 + 65
            int r6 = r6 + 4
            byte[] r1 = com.marrow.ui.activities.base.BaseDaggerActivity.$$a
            byte[] r0 = new byte[r0]
            int r7 = 43 - r7
            r2 = 0
            if (r1 != 0) goto L13
            r8 = r6
            r4 = r7
            r3 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L21:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r5
        L28:
            int r6 = r6 + r4
            int r8 = r8 + 1
            int r6 = r6 + (-1)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.base.BaseDaggerActivity.c(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 4
            int r9 = 28 - r9
            int r8 = 111 - r8
            byte[] r0 = com.marrow.ui.activities.base.BaseDaggerActivity.$$j
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r9
            r4 = r2
            goto L25
        L10:
            r3 = r2
        L11:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L20
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L20:
            r3 = r0[r7]
            r6 = r3
            r3 = r8
            r8 = r6
        L25:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + 9
            int r7 = r7 + 1
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.base.BaseDaggerActivity.d(byte, short, int, java.lang.Object[]):void");
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(read ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i3 = $10 + 89;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i5 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(read)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12424, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 19, -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1868 - Color.red(0), 9 - TextUtils.lastIndexOf("", '0', 0, 0), 1983509525, false, $$i(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i6 = $11 + 93;
                $10 = i6 % 128;
                int i7 = i6 % 2;
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

    private static void a(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr3 = RemoteActionCompatParcelizer;
        long j = 0;
        if (cArr3 != null) {
            int i3 = $10 + 65;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (44862 - (ViewConfiguration.getLongPressTimeout() >> 16)), 18944 - (Process.myTid() >> 22), 29 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)), -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr4[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i5++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(AudioAttributesCompatParcelizer)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 19032, TextUtils.lastIndexOf("", '0', 0) + 76, 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
        int i6 = -1593953308;
        if (write) {
            int i7 = $10 + 65;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
                cArr2 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                notifydownloads.IconCompatParcelizer = 1;
            } else {
                notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
                cArr2 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                notifydownloads.IconCompatParcelizer = 0;
            }
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr2[notifydownloads.IconCompatParcelizer] = (char) (cArr3[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                Object[] objArr4 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 11438, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2);
            return;
        }
        if (!IconCompatParcelizer) {
            notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
            char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                int i8 = $11 + 49;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr3[iArr[(notifydownloads.AudioAttributesCompatParcelizer >> 1) % notifydownloads.IconCompatParcelizer] >>> i] / iIntValue);
                } else {
                    cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr3[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                }
                notifydownloads.IconCompatParcelizer++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i9 = $10 + 67;
        $11 = i9 % 128;
        if (i9 % 2 == 0) {
            notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
        } else {
            notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
        }
        char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
        notifydownloads.IconCompatParcelizer = 0;
        while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
            cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr3[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
            try {
                Object[] objArr5 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(i6);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (Process.myTid() >> 22), TextUtils.getOffsetAfter("", 0) + 11439, 14 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                i6 = -1593953308;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr6);
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = RatingCompat + 93;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 92, new byte[]{-120, -120, -117, -118, -123, -124, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 9, new char[]{33567, 33650, 61124, 43572, 44352, 27294, 37215, 9223, 42860}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i4 = MediaBrowserCompatCustomActionResultReceiver + 23;
                RatingCompat = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr4 = new Object[1];
                b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 34, new char[]{19372, 19405, 60138, 44557, 37924, 23476, 23015, 7506, 63689, 34304, 38493, 18892, 28549, 50860, 45176, 26512, 32129, 54427, 41560, 37427, 842, 9085, 52356, 32783, 4428, 12632, 65254, 48759, 10005, 7944}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                a((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 126, new byte[]{-126, -123, -122, -115, -127, -118, -122, -112, -113, -113, -114, -115, -126, -117, -124, -124, -116, -118}, null, null, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
                int i6 = RatingCompat + 11;
                MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
                int i7 = i6 % 2;
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - TextUtils.getTrimmedLength("")), 6054 - (ViewConfiguration.getPressedStateDuration() >> 16), 42 - Color.green(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 110, new char[]{44650, 44553, 32886, 50378, 64381, 56456, 48173, 29279, 37379, 59656, 4469, 52904, 35350, 44077, 57142, 57519, 39011, 48729, 52549, 5447, 59082, 18870, 41886, 1902, 62701, 23442, 37375, 14595, 49802, 30157, 34689, 11111, 53413, 1918, 31331, 24018, 16175, 4433, 26715, 20395, 3404, 9060, 24171, 24989, 7014, 15624, 19484, 37443, 27102, 51430, 8871, 33847}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 9, new char[]{52724, 52676, 25303, 9789, 21277, 5119, 57319, 55916, 28913, 16749, 56916, 477, 59785, 20187, 30546, 12245, 64424, 23801, 25974, 55909, 34053, 43841, 2991, 51270, 38774, 47416, 14750, 63010, 41294, 38765, 12215, 58391, 45873, 58767, 53840, 37619, 23780, 62368, 49212, 32988, 28374, 49602, 62985, 44731, 30884, 57339, 58484, 23859, 2588, 10830, 35523, 19223, 5236, 14397, 47259, 31023, 9745, 5721, 44734, 26382, 12340, 25818, 23811, 5540, 56797, 29437, 17265, 980}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 9, new char[]{1953, 1987, 34207, 49447, 11152, 35284, 5556, 41699, 38840, 14774, 17451, 39852, 9101, 43410, 3980, 46585, 12789, 48051, 7673, 16456, 20233, 19551, 29475, 21041, 23847, 24107, 16662, 27734, 27456, 28707, 22381, 32353, 31086, 660, 43740, 2180, 38581, 5359, 47334, 6901, 42116, 9871, 36486, 13458, 45816, 14564, 40188, 50968, 49230, 52480, 62029, 53613, 56868, 57210, 49223, 58113, 60484, 61772, 54838, 64807, 64104, 33732, 9692, 36826, 6027, 38325, 15355, 39332}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 3, new char[]{834, 810, 60915, 43278, 32999, 44941, 4373, 2433, 65433, 37528, 25190, 48630, 10094, 49598, 42162, 37865, 13655, 54153, 46736, 26132, 19388, 9331, 55376, 29795, 22914, 13915, 59957, 19020, 28667, 6171, 64520, 22644, 32205, 27391, 417, 11926, 37399, 31942, 5057, 15545, 41077, 20146, 9634, 4824, 46680, 20634, 14293, 57606, 50337, 42358, 22832, 63264, 55938, 46942, 27500, 50500, 59640, 39220, 32002, 56186, 65230, 60320, 36605, 43463, 4977, 64974, 37081, 49076, 8556, 53171, 41632}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 9, new char[]{7401, 7376, 51748, 36483, 50872, 19674, 3811, 20379, 55324, 33141}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 92, new byte[]{-107, -107, -127, -110, -104, -118, -117, -108, -111, -127, -108, -104, -106, -101, -111, -109, -102, -106, -108, -103, -107, -103, -106, -104, -105, -104, -105, -106, -110, -110, -111, -107, -108, -109, -110, -111}, null, null, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 6031 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 23, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr12);
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
            char cRed = (char) (13183 - Color.red(0));
            int threadPriority = 1649 - ((Process.getThreadPriority(0) + 20) >> 6);
            int defaultSize = View.getDefaultSize(0, 0) + 26;
            byte[] bArr = $$a;
            short s = bArr[5];
            Object[] objArr13 = new Object[1];
            c(s, (byte) s, (byte) (-bArr[140]), objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(cRed, threadPriority, defaultSize, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            int i8 = MediaBrowserCompatCustomActionResultReceiver + 123;
            RatingCompat = i8 % 128;
            if (i8 % 2 == 0) {
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char mode = (char) (13183 - View.MeasureSpec.getMode(0));
                    int touchSlop = 1649 - (ViewConfiguration.getTouchSlop() >> 8);
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 26;
                    byte[] bArr2 = $$a;
                    Object[] objArr14 = new Object[1];
                    c((short) (-bArr2[27]), (byte) (-bArr2[30]), bArr2[5], objArr14);
                    objRemoteActionCompatParcelizer4 = startForeground.read(mode, touchSlop, minimumFlingVelocity, -1033747278, false, (String) objArr14[0], null);
                }
                throw null;
            }
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer5 == null) {
                char pressedStateDuration = (char) (13183 - (ViewConfiguration.getPressedStateDuration() >> 16));
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1649;
                int i9 = (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 26;
                byte[] bArr3 = $$a;
                Object[] objArr15 = new Object[1];
                c((short) (-bArr3[27]), (byte) (-bArr3[30]), bArr3[5], objArr15);
                objRemoteActionCompatParcelizer5 = startForeground.read(pressedStateDuration, packedPositionGroup, i9, -1033747278, false, (String) objArr15[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer5).get(null);
        } else {
            Object[] objArr16 = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 3, new char[]{46290, 46264, 10484, 27676, 25534, 45887, 42712, 60122, 15069, 29069, 32453, 41236, 37117, 1251, 18387, 36703, 33485, 5789, 21953, 31407}, objArr16);
            Class<?> cls3 = Class.forName((String) objArr16[0]);
            Object[] objArr17 = new Object[1];
            a(127 - (ViewConfiguration.getTouchSlop() >> 8), new byte[]{-117, -125, -123, -97, -98, -120, -127, -99, -100, -115, -122, -115, -126, -117, -125, -122}, null, null, objArr17);
            try {
                Object[] objArr18 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue()), 0, 2011039196};
                byte b = (byte) ($$j[48] - 1);
                Object[] objArr19 = new Object[1];
                d(b, b, r0[56], objArr19);
                Class<?> cls4 = Class.forName((String) objArr19[0]);
                Object[] objArr20 = new Object[1];
                d(r0[27], (byte) ($$k & 46), r0[19], objArr20);
                objArr = (Object[]) cls4.getMethod((String) objArr20[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr18);
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer6 == null) {
                    char windowTouchSlop = (char) (13183 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                    int scrollBarSize = 1649 - (ViewConfiguration.getScrollBarSize() >> 8);
                    int iIndexOf = TextUtils.indexOf("", "", 0) + 26;
                    byte[] bArr4 = $$a;
                    Object[] objArr21 = new Object[1];
                    c((short) (-bArr4[27]), (byte) (-bArr4[30]), bArr4[5], objArr21);
                    objRemoteActionCompatParcelizer6 = startForeground.read(windowTouchSlop, scrollBarSize, iIndexOf, -1033747278, false, (String) objArr21[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer6).set(null, objArr);
                try {
                    Object[] objArr22 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 34, new char[]{42692, 42661, 4896, 22471, 33458, 12095, 46223, 3012, 259, 37014, 58070, 15687, 33507, 16229, 42672, 4966, 37073, 11585, 46286, 59060, 60985, 55965, 55818, 62610, 64531, 51345}, objArr22);
                    Class<?> cls5 = Class.forName((String) objArr22[0]);
                    Object[] objArr23 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) - 48, new char[]{14643, 14678, 12185, 27516, 35124, 44695, 11108, 'G', 15796, 39701, 25468, 48273, 7454, 972, 44401, 37611, 3894, 4580, 48988}, objArr23);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr23[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char packedPositionGroup2 = (char) (ExpandableListView.getPackedPositionGroup(0L) + 13183);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1650;
                        int iRed = 26 - Color.red(0);
                        Object[] objArr24 = new Object[1];
                        c((short) ($$b + 1), (byte) (-$$a[30]), r12[5], objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(packedPositionGroup2, iLastIndexOf, iRed, 54351865, false, (String) objArr24[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer8 == null) {
                        char touchSlop2 = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 13183);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1649;
                        int iNormalizeMetaState = 26 - KeyEvent.normalizeMetaState(0);
                        byte[] bArr5 = $$a;
                        short s2 = bArr5[5];
                        Object[] objArr25 = new Object[1];
                        c(s2, (byte) s2, (byte) (-bArr5[140]), objArr25);
                        objRemoteActionCompatParcelizer8 = startForeground.read(touchSlop2, iMakeMeasureSpec, iNormalizeMetaState, -133433128, false, (String) objArr25[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer8).set(null, lValueOf2);
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
        int i10 = ((int[]) objArr[3])[0];
        int i11 = ((int[]) objArr[2])[0];
        if (i11 != i10) {
            long j = -1;
            long j2 = ((long) (i11 ^ i10)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer9 == null) {
                objRemoteActionCompatParcelizer9 = startForeground.read((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4535), 6055 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 42 - TextUtils.indexOf("", "", 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer9).invoke(null, null);
            try {
                Object[] objArr26 = {624326553, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) ExpandableListView.getPackedPositionType(0L), (-16771186) - Color.rgb(0, 0, 0), 24 - ExpandableListView.getPackedPositionType(0L));
                byte[] bArr6 = $$j;
                Object[] objArr27 = new Object[1];
                d((byte) 43, (byte) (bArr6[45] - 1), (byte) (bArr6[48] - 1), objArr27);
                cls6.getMethod((String) objArr27[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr26);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        buildResolutionString.read(getClass(), "frames : dagger:", System.currentTimeMillis());
        super.onCreate(bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if ((r4 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r4 = 47 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        overridePendingTransition(0, 0);
        r4 = com.marrow.ui.activities.base.BaseDaggerActivity.MediaBrowserCompatCustomActionResultReceiver + 37;
        com.marrow.ui.activities.base.BaseDaggerActivity.RatingCompat = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (MediaBrowserCompatSearchResultReceiver() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (MediaBrowserCompatSearchResultReceiver() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        overridePendingTransition(com.marrow.R.anim.trans_right_in, com.marrow.R.anim.trans_right_out);
        r4 = com.marrow.ui.activities.base.BaseDaggerActivity.MediaBrowserCompatCustomActionResultReceiver + 113;
        com.marrow.ui.activities.base.BaseDaggerActivity.RatingCompat = r4 % 128;
     */
    @Override // com.marrow.ui.activities.base.BaseActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void finish() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.marrow.ui.activities.base.BaseDaggerActivity.MediaBrowserCompatCustomActionResultReceiver
            int r1 = r1 + 43
            int r2 = r1 % 128
            com.marrow.ui.activities.base.BaseDaggerActivity.RatingCompat = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1c
            super.finish()
            boolean r1 = r4.MediaBrowserCompatSearchResultReceiver()
            r3 = 13
            int r3 = r3 / r2
            if (r1 == 0) goto L3d
            goto L25
        L1c:
            super.finish()
            boolean r1 = r4.MediaBrowserCompatSearchResultReceiver()
            if (r1 == 0) goto L3d
        L25:
            r1 = 2130772025(0x7f010039, float:1.7147157E38)
            r3 = 2130772026(0x7f01003a, float:1.7147159E38)
            r4.overridePendingTransition(r1, r3)
            int r4 = com.marrow.ui.activities.base.BaseDaggerActivity.MediaBrowserCompatCustomActionResultReceiver
            int r4 = r4 + 113
            int r1 = r4 % 128
            com.marrow.ui.activities.base.BaseDaggerActivity.RatingCompat = r1
            int r4 = r4 % r0
            if (r4 != 0) goto L3c
            r4 = 47
            int r4 = r4 / r2
        L3c:
            return
        L3d:
            r4.overridePendingTransition(r2, r2)
            int r4 = com.marrow.ui.activities.base.BaseDaggerActivity.MediaBrowserCompatCustomActionResultReceiver
            int r4 = r4 + 37
            int r1 = r4 % 128
            com.marrow.ui.activities.base.BaseDaggerActivity.RatingCompat = r1
            int r4 = r4 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.base.BaseDaggerActivity.finish():void");
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        super.onStart();
        P p = this.mPresenter;
        if (p != null) {
            int i2 = MediaBrowserCompatCustomActionResultReceiver + 117;
            RatingCompat = i2 % 128;
            int i3 = i2 % 2;
            p.AudioAttributesImplApi21Parcelizer();
            if (i3 == 0) {
                throw null;
            }
        }
        int i4 = RatingCompat + 37;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onStop() throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = RatingCompat + 105;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            P p = this.mPresenter;
            if (p != null) {
                p.MediaBrowserCompatSearchResultReceiver();
                int i3 = RatingCompat + 97;
                MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 4 % 4;
                }
            }
            super.onStop();
            int i5 = RatingCompat + 11;
            MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        throw null;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final void write(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i = 2 % 2;
        int i2 = RatingCompat + 37;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getProvider.getInstance(this).registerReceiver(broadcastReceiver, intentFilter);
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        int i5 = RatingCompat + 115;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final void IconCompatParcelizer(BroadcastReceiver broadcastReceiver) {
        int i = 2 % 2;
        int i2 = RatingCompat + 13;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getProvider.getInstance(this).IconCompatParcelizer(broadcastReceiver);
        int i4 = RatingCompat + 93;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.getNextEventTime
    public final void AudioAttributesCompatParcelizer(Intent intent) {
        int i = 2 % 2;
        int i2 = RatingCompat + 21;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getProvider.getInstance(this).AudioAttributesCompatParcelizer(intent);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 39;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = RatingCompat + 123;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1) - 48, new char[]{19372, 19405, 60138, 44557, 37924, 23476, 23015, 7506, 63689, 34304, 38493, 18892, 28549, 50860, 45176, 26512, 32129, 54427, 41560, 37427, 842, 9085, 52356, 32783, 4428, 12632, 65254, 48759, 10005, 7944}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(127 - View.MeasureSpec.getMode(0), new byte[]{-126, -123, -122, -115, -127, -118, -122, -112, -113, -113, -114, -115, -126, -117, -124, -124, -116, -118}, null, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i4 = MediaBrowserCompatCustomActionResultReceiver + 11;
                RatingCompat = i4 % 128;
                int i5 = i4 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - Gravity.getAbsoluteGravity(0, 0)), 6054 - KeyEvent.normalizeMetaState(0), 42 - (ViewConfiguration.getEdgeSlop() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.MeasureSpec.getMode(0) + 6030, 23 - MotionEvent.axisFromString(""), -861814097, false, "read", new Class[]{Context.class});
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

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 75;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            int i4 = MediaBrowserCompatCustomActionResultReceiver + 33;
            RatingCompat = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) - 35, new char[]{19372, 19405, 60138, 44557, 37924, 23476, 23015, 7506, 63689, 34304, 38493, 18892, 28549, 50860, 45176, 26512, 32129, 54427, 41560, 37427, 842, 9085, 52356, 32783, 4428, 12632, 65254, 48759, 10005, 7944}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 13, new byte[]{-126, -123, -122, -115, -127, -118, -122, -112, -113, -113, -114, -115, -126, -117, -124, -124, -116, -118}, null, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i6 = MediaBrowserCompatCustomActionResultReceiver + 11;
            RatingCompat = i6 % 128;
            if (i6 % 2 == 0) {
                boolean z = baseContext instanceof ContextWrapper;
                obj.hashCode();
                throw null;
            }
            if (!(!(baseContext instanceof ContextWrapper)) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i7 = RatingCompat + 99;
                MediaBrowserCompatCustomActionResultReceiver = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        if (baseContext != null) {
            int i9 = MediaBrowserCompatCustomActionResultReceiver + 5;
            RatingCompat = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ExpandableListView.getPackedPositionChild(0L) + 4536), View.combineMeasuredStates(0, 0) + 6054, ((Process.getThreadPriority(0) + 20) >> 6) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.argb(0, 0, 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 6031, 24 - Drawable.resolveOpacity(0, 0), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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
        P p = this.mPresenter;
        if (p != null) {
            p.MediaBrowserCompatCustomActionResultReceiver();
        }
        int i11 = MediaBrowserCompatCustomActionResultReceiver + 113;
        RatingCompat = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 55;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        P p = this.mPresenter;
        if (p != null) {
            int i5 = i2 + 9;
            MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
            if (i5 % 2 == 0) {
                p.AudioAttributesImplApi26Parcelizer();
            } else {
                p.AudioAttributesImplApi26Parcelizer();
                throw null;
            }
        }
        super.onDestroy();
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    protected final boolean MediaBrowserCompatSearchResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 73;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        boolean booleanExtra = getIntent().getBooleanExtra("key_override_transition", true);
        int i4 = RatingCompat + 63;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return booleanExtra;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.getExtendedPtDeChar
    public void write(ResponseError responseError) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 21;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            int iIconCompatParcelizer = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
            int iIconCompatParcelizer2 = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
            int iIconCompatParcelizer3 = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
            AudioAttributesCompatParcelizer((String) updateShuffleButton.IconCompatParcelizer(iIconCompatParcelizer2, -953939975, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), iIconCompatParcelizer3, 953939977, new Object[]{responseError, this}, iIconCompatParcelizer));
            return;
        }
        int iIconCompatParcelizer4 = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
        int iIconCompatParcelizer5 = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
        int iIconCompatParcelizer6 = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
        AudioAttributesCompatParcelizer((String) updateShuffleButton.IconCompatParcelizer(iIconCompatParcelizer5, -953939975, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), iIconCompatParcelizer6, 953939977, new Object[]{responseError, this}, iIconCompatParcelizer4));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.getChannel
    public final boolean aC_() {
        int i = 2 % 2;
        int i2 = RatingCompat + 25;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        boolean zWrite = getTrackName.write(this);
        int i4 = RatingCompat + 89;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return zWrite;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        BaseDaggerActivity baseDaggerActivity = (BaseDaggerActivity) objArr[0];
        int i = 2 % 2;
        int i2 = RatingCompat + 103;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        baseDaggerActivity.finish();
        if (i3 != 0) {
            throw null;
        }
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 109;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // kotlin.getExtendedPtDeChar
    public void AudioAttributesCompatParcelizer(String str) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 1;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        handleMediaPlayPauseIfPendingOnHandler(str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = RatingCompat + 83;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.getExtendedPtDeChar
    public void read(String str) {
        int i = 2 % 2;
        int i2 = RatingCompat + 113;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Toast.makeText(this, str, 1).show();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 101;
        RatingCompat = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 21 / 0;
        }
    }

    @Override // kotlin.getExtendedPtDeChar
    public void MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 37;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        write(R.string.app_error_no_internet);
        int i4 = RatingCompat + 13;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.getNextEventTime
    public final void RemoteActionCompatParcelizer(String str, String str2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 59;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        AudioAttributesCompatParcelizer(isSpecialNorthAmericanChar.IconCompatParcelizer(str, str2));
        if (i3 == 0) {
            throw null;
        }
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 63;
        RatingCompat = i2 % 128;
        if (i2 % 2 == 0) {
            BaseUrl.IconCompatParcelizer(this.mPresenter.AudioAttributesImplBaseParcelizer(), bundle);
            super.onSaveInstanceState(bundle);
            int i3 = 74 / 0;
        } else {
            BaseUrl.IconCompatParcelizer(this.mPresenter.AudioAttributesImplBaseParcelizer(), bundle);
            super.onSaveInstanceState(bundle);
        }
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 121;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        int i = 2 % 2;
        super.onRestoreInstanceState(bundle);
        if (bundle != null) {
            this.mPresenter.write(BaseUrl.write(bundle));
            int i2 = MediaBrowserCompatCustomActionResultReceiver + 25;
            RatingCompat = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = RatingCompat + 99;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        if (intent != null) {
            int i4 = MediaBrowserCompatCustomActionResultReceiver + 53;
            RatingCompat = i4 % 128;
            if (i4 % 2 == 0) {
                BaseUrl.write(intent.getExtras());
                int i5 = 33 / 0;
            } else {
                BaseUrl.write(intent.getExtras());
            }
        }
        super.onActivityResult(i, i2, intent);
        int i6 = MediaBrowserCompatCustomActionResultReceiver + 85;
        RatingCompat = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x099b A[Catch: all -> 0x025e, TryCatch #16 {all -> 0x025e, blocks: (B:202:0x0dac, B:204:0x0db2, B:205:0x0dd9, B:238:0x1154, B:240:0x115a, B:241:0x117c, B:219:0x0f52, B:221:0x0f74, B:222:0x0fbe, B:169:0x0995, B:171:0x099b, B:172:0x09c6, B:68:0x039a, B:70:0x03a0, B:71:0x03c7, B:19:0x00b7, B:21:0x00bd, B:22:0x00e5, B:24:0x01d0, B:26:0x0201, B:27:0x0258), top: B:291:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x008d  */
    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.base.BaseDaggerActivity.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.getBasicChar
    public final void AudioAttributesImplBaseParcelizer() {
        int iWrite = GodelServiceConnection.write();
        int iWrite2 = GodelServiceConnection.write();
        int iWrite3 = GodelServiceConnection.write();
        RemoteActionCompatParcelizer(GodelServiceConnection.write(), 1402121301, iWrite, iWrite2, iWrite3, new Object[]{this}, -1402121301);
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    protected final handlePreambleAddressCode AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 113;
        int i3 = i2 % 128;
        RatingCompat = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 103;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    protected final handlePreambleAddressCode[] MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = RatingCompat + 59;
        int i3 = i2 % 128;
        MediaBrowserCompatCustomActionResultReceiver = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 81;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    protected boolean RatingCompat() {
        int i = 2 % 2;
        int i2 = RatingCompat + 97;
        int i3 = i2 % 128;
        MediaBrowserCompatCustomActionResultReceiver = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 57;
        RatingCompat = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = RatingCompat + 115;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final void RemoteActionCompatParcelizer(hasSelectionOverride hasselectionoverride) {
        int iWrite = GodelServiceConnection.write();
        int iWrite2 = GodelServiceConnection.write();
        int iWrite3 = GodelServiceConnection.write();
        RemoteActionCompatParcelizer(GodelServiceConnection.write(), 8861781, iWrite, iWrite2, iWrite3, new Object[]{this, hasselectionoverride}, -8861780);
    }
}
