package com.marrow.bgservices;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.marrow.TrainingApplication;
import com.marrow.data.models.pearl.PearlMini;
import com.marrow.ui.activities.onboarding.deeplinkroute.DeeplinkProcessorActivity;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import kotlin.PlayerTimelineChangeReason;
import kotlin.buildResolutionString;
import kotlin.buildSetStopReasonIntent;
import kotlin.canShowMultiWindowTimeBar;
import kotlin.getAdDurationUs;
import kotlin.getDurationUs;
import kotlin.notifyDownloads;
import kotlin.setPreparePositionOverrideToUnpreparedMaskingPeriod;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public class PushReceiverService extends FirebaseMessagingService {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$p = {93, -80, 87, TarConstants.LF_DIR, -25, -14, -8, -11, 9, 30, -40, -23, 5, -12, -5, 37, -50, -4, -9, 9, -25, 30, -23, -23, 9, -8, -13, -3, -23, 15, -19, -18, -4, 57, -62, -1, -24, -7, 9, -19, -12, 5, -5, 56, -66, 3, -8, -14, -14, -2, -5, 58, -60, -3, -25, 13, -7, -13, -11, 4, TarConstants.LF_NORMAL, -66, 0, -13, TarConstants.LF_BLK, -9, 0, -34, 0, -13, 20, -9, -39, -37, 5, -9, 66, -52, -21, -28, 29, -43, 3, 5, 17, -25, -18, 2, -58, 11, -11, -12, 40, -57, -6, -4, 3, 1, -25, -5, 9, -20, 42, -50, -4, -9, 9, -25, 30, -23, -23, 9, -8, -13, -3, -23, 15, -19};
    private static final int $$q = 36;
    private static final byte[] $$g = {64, TarConstants.LF_GNUTYPE_LONGLINK, 61, -128, -12, -3, 4, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$h = 83;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int AudioAttributesImplApi21Parcelizer = 1;
    private static char[] read = {45043, 45021, 44822, 44818, 45021, 44807, 44824, 44818, 44817, 44807, 44829, 44800, 44822, 44822, 44804, 44806, 44818, 44817, 44990, 45036, 45038, 45027, 45051, 45028, 45028, 45052, 45034, 45022, 45024, 45031, 45023, 45011, 45027, 45038, 44974, 44994, 44992, 44993, 44993, 44998, 44993, 44995, 44992, 44998, 44994};
    private static char[] AudioAttributesCompatParcelizer = {28501, 28521, 28493, 28505, 28508, 28511, 28589, 28560, 28506, 28481, 28510, 28588, 28586, 28591, 28585, 28509, 28584, 28561, 28590, 28587, 28504, 28524, 28496, 28527, 28582, 28563, 28500, 28526, 28499, 28525, 28498, 28562, 28507, 28497, 28522, 28565, 28495, 28607, 28503, 28494, 28502};
    private static int write = 411398112;
    private static boolean RemoteActionCompatParcelizer = true;
    private static boolean IconCompatParcelizer = true;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(int r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            byte[] r0 = com.marrow.bgservices.PushReceiverService.$$g
            int r7 = r7 + 4
            int r9 = 114 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r7
            r9 = r8
            r4 = r2
            goto L27
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L21:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L27:
            int r3 = r3 + r8
            int r8 = r3 + (-1)
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.bgservices.PushReceiverService.k(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void l(byte r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 17
            int r7 = r7 + 65
            int r9 = r9 * 3
            int r9 = r9 + 28
            int r8 = r8 + 4
            byte[] r0 = com.marrow.bgservices.PushReceiverService.$$p
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r7 = r9
            r5 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2c:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-6)
            r8 = r3
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.bgservices.PushReceiverService.l(byte, short, int, java.lang.Object[]):void");
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Bitmap bitmap;
        Bitmap bitmap2;
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 77;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onMessageReceived(remoteMessage);
        try {
            if (remoteMessage.IconCompatParcelizer().size() <= 0) {
                return;
            }
            Bundle bundle = new Bundle();
            Iterator<Map.Entry<String, String>> it = remoteMessage.IconCompatParcelizer().entrySet().iterator();
            while (true) {
                Bitmap bitmap3 = null;
                if (!it.hasNext()) {
                    getAdDurationUs getaddurationusWrite = PlayerTimelineChangeReason.write(bundle);
                    String string = bundle.getString(DownloadService.KEY_CONTENT_ID);
                    String string2 = bundle.getString("content_type");
                    String string3 = bundle.getString("icon_img_url");
                    String string4 = bundle.getString(PearlMini.KEY_THUMBNAIL);
                    String string5 = bundle.getString("description");
                    String string6 = bundle.getString("title");
                    if (TextUtils.isEmpty(string6)) {
                        int i4 = AudioAttributesImplApi21Parcelizer + 13;
                        AudioAttributesImplApi26Parcelizer = i4 % 128;
                        if (i4 % 2 != 0) {
                            boolean z = getaddurationusWrite.IconCompatParcelizer;
                            int i5 = 20 / 0;
                            if (!z) {
                                return;
                            }
                        } else if (!getaddurationusWrite.IconCompatParcelizer) {
                            return;
                        }
                        new getDurationUs().RemoteActionCompatParcelizer(getApplicationContext(), remoteMessage);
                        int i6 = AudioAttributesImplApi26Parcelizer + 27;
                        AudioAttributesImplApi21Parcelizer = i6 % 128;
                        int i7 = i6 % 2;
                        return;
                    }
                    if (TextUtils.isEmpty(string4)) {
                        bitmap = null;
                    } else {
                        int i8 = AudioAttributesImplApi21Parcelizer + 37;
                        AudioAttributesImplApi26Parcelizer = i8 % 128;
                        if (i8 % 2 != 0) {
                            bitmap2 = setPreparePositionOverrideToUnpreparedMaskingPeriod.RemoteActionCompatParcelizer(this).RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(string4).write().get();
                            int i9 = 17 / 0;
                        } else {
                            bitmap2 = setPreparePositionOverrideToUnpreparedMaskingPeriod.RemoteActionCompatParcelizer(this).RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(string4).write().get();
                        }
                        bitmap = bitmap2;
                    }
                    if (!TextUtils.isEmpty(string3)) {
                        int i10 = AudioAttributesImplApi26Parcelizer + 11;
                        AudioAttributesImplApi21Parcelizer = i10 % 128;
                        if (i10 % 2 == 0) {
                            bitmap3 = setPreparePositionOverrideToUnpreparedMaskingPeriod.RemoteActionCompatParcelizer(this).RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(string3).write().get();
                            int i11 = 36 / 0;
                        } else {
                            bitmap3 = setPreparePositionOverrideToUnpreparedMaskingPeriod.RemoteActionCompatParcelizer(this).RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(string3).write().get();
                        }
                    }
                    canShowMultiWindowTimeBar.IconCompatParcelizer(this, string6, string5, bitmap3, bitmap, DeeplinkProcessorActivity.read(this, string2, string, "_push"));
                    int i12 = AudioAttributesImplApi21Parcelizer + 9;
                    AudioAttributesImplApi26Parcelizer = i12 % 128;
                    int i13 = i12 % 2;
                    return;
                }
                int i14 = AudioAttributesImplApi21Parcelizer + 5;
                AudioAttributesImplApi26Parcelizer = i14 % 128;
                if (i14 % 2 != 0) {
                    Map.Entry<String, String> next = it.next();
                    bundle.putString(next.getKey(), next.getValue());
                    bitmap3.hashCode();
                    throw null;
                }
                Map.Entry<String, String> next2 = it.next();
                bundle.putString(next2.getKey(), next2.getValue());
            }
        } catch (Throwable th) {
            buildResolutionString.IconCompatParcelizer("push up notification", "Error parsing FCM message", th);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 89;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        TrainingApplication.read().MediaDescriptionCompat().IconCompatParcelizer("gcm_reg_time", 0);
        super.onNewToken(str);
        int i4 = AudioAttributesImplApi21Parcelizer + 21;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void j(char[] cArr, byte[] bArr, int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr2 = AudioAttributesCompatParcelizer;
        double d = 0.0d;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0) + 44863), 18944 - View.resolveSize(0, 0), 28 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d ? 0 : -1)), -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i3++;
                    d = 0.0d;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i4 = $10 + 43;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(write)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) (Process.getGidForName("") + 1), ((byte) KeyEvent.getModifierMetaStateMask()) + 19034, 75 - KeyEvent.getDeadChar(0, 0), 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
        if (IconCompatParcelizer) {
            int i6 = $10 + 21;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                int i8 = $10 + 51;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[notifydownloads.AudioAttributesCompatParcelizer - notifydownloads.IconCompatParcelizer] << i] - iIntValue);
                    Object[] objArr4 = {notifydownloads, notifydownloads};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), TextUtils.getOffsetBefore("", 0) + 11439, View.resolveSize(0, 0) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } else {
                    cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                    Object[] objArr5 = {notifydownloads, notifydownloads};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getTouchSlop() >> 8), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 11439, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13, -558368911, false, "q", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                }
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!RemoteActionCompatParcelizer) {
            notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
            char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr2[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                notifydownloads.IconCompatParcelizer++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i9 = $10 + 41;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
        char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
        notifydownloads.IconCompatParcelizer = 0;
        while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
            int i11 = $11 + 11;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer + 1) / notifydownloads.IconCompatParcelizer] >>> i] + iIntValue);
                Object[] objArr6 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) View.MeasureSpec.getMode(0), Process.getGidForName("") + 11440, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15, -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            } else {
                cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                Object[] objArr7 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) Color.alpha(0), 11439 - Drawable.resolveOpacity(0, 0), 14 - TextUtils.getTrimmedLength(""), -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static void i(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = read;
        char c = '0';
        if (cArr != null) {
            int i6 = $11 + 55;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 9;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf("", c, 0, 0) + 1), 11612 - MotionEvent.axisFromString(""), TextUtils.lastIndexOf("", c) + 21, -1786471333, false, "u", new Class[]{Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                        i8 %= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i8])};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getWindowTouchSlop() >> 8), KeyEvent.getDeadChar(0, 0) + 11613, 20 - TextUtils.indexOf("", "", 0, 0), -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i8++;
                }
                c = '0';
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c2 = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i10 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c2)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) TextUtils.getCapsMode("", 0, 0), 22959 - Color.argb(0, 0, 0, 0), 43 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                } else {
                    int i11 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr5 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c2)};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (31588 - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 9863, 64 - TextUtils.indexOf((CharSequence) "", '0'), 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr6 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (37822 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 9753 - TextUtils.lastIndexOf("", '0', 0, 0), 27 - View.MeasureSpec.getSize(0), 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i12 = $10 + 111;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i14 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i14, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i14);
        }
        if (z) {
            int i15 = $10 + 91;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            char[] cArr6 = new char[i3];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i3 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
                int i17 = $10 + 115;
                $11 = i17 % 128;
                if (i17 % 2 == 0) {
                    int i18 = 2 / 4;
                }
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i19 = $10 + 83;
            $11 = i19 % 128;
            int i20 = i19 % 2;
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        String str = new String(cArr3);
        int i21 = $10 + 91;
        $11 = i21 % 128;
        int i22 = i21 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006d  */
    @Override // com.google.firebase.messaging.FirebaseMessagingService, kotlin.isSecure, android.app.Service, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.bgservices.PushReceiverService.attachBaseContext(android.content.Context):void");
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService, kotlin.isSecure, android.app.Service
    public void onCreate() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 105;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate();
        int i4 = AudioAttributesImplApi26Parcelizer + 43;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }
}
