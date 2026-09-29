package com.clevertap.android.sdk.pushnotification;

import android.app.IntentService;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.RendererCapabilitiesListener;
import kotlin.RendererWakeupListener;
import kotlin.notifyDownloadChanged;
import kotlin.notifyDownloadRemoved;
import kotlin.setAdPositionMs;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated(since = "4.3.0")
public class CTNotificationIntentService extends IntentService {
    public static final String MAIN_ACTION = "com.clevertap.PUSH_EVENT";
    public static final String TYPE_BUTTON_CLICK = "com.clevertap.ACTION_BUTTON_CLICK";
    private setAdPositionMs mActionButtonClickHandler;
    private static final byte[] $$c = {TarConstants.LF_SYMLINK, -57, 8, -14};
    private static final int $$f = 109;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {109, -42, -99, -39, 14, 3, -3, 0, -20, -41, 29, 12, -16, 1, -6, -48, 39, -7, -2, -20, 14, -41, 12, 12, -20, -3, 2, -8, 12, -26, 8, -70, 71, -5, -27, 7, -10, -14, 6, -20};
    private static final int $$e = 161;
    private static final byte[] $$a = {TarConstants.LF_CONTIG, -94, -3, -122, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 209;
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatItemReceiver = 1;
    private static long write = 5999005759899565274L;
    private static long read = -3498762522182953692L;
    private static int RemoteActionCompatParcelizer = -136981212;
    private static char AudioAttributesCompatParcelizer = 3760;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r5, byte r6, byte r7) {
        /*
            byte[] r0 = com.clevertap.android.sdk.pushnotification.CTNotificationIntentService.$$c
            int r5 = r5 + 4
            int r6 = r6 * 4
            int r6 = 1 - r6
            int r7 = r7 * 2
            int r7 = r7 + 103
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            int r5 = r5 + 1
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            r4 = r0[r5]
        L26:
            int r4 = -r4
            int r7 = r7 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.pushnotification.CTNotificationIntentService.$$g(byte, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            byte[] r0 = com.clevertap.android.sdk.pushnotification.CTNotificationIntentService.$$a
            int r1 = r7 + 4
            int r8 = 114 - r8
            byte[] r1 = new byte[r1]
            int r7 = r7 + 3
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2c
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r3 = r3 + r6
            int r6 = r3 + (-1)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.pushnotification.CTNotificationIntentService.c(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 82
            int r6 = r6 + 4
            byte[] r0 = com.clevertap.android.sdk.pushnotification.CTNotificationIntentService.$$d
            int r1 = r8 + 5
            byte[] r1 = new byte[r1]
            int r8 = r8 + 4
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2b:
            int r3 = r3 + r6
            int r6 = r3 + 5
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.pushnotification.CTNotificationIntentService.d(byte, byte, short, java.lang.Object[]):void");
    }

    public CTNotificationIntentService() {
        super("CTNotificationIntentService");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    @Override // android.app.IntentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onHandleIntent(android.content.Intent r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.clevertap.android.sdk.pushnotification.CTNotificationIntentService.IconCompatParcelizer
            int r1 = r1 + 29
            int r2 = r1 % 128
            com.clevertap.android.sdk.pushnotification.CTNotificationIntentService.MediaBrowserCompatItemReceiver = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L19
            android.os.Bundle r1 = r6.getExtras()
            r2 = 64
            int r2 = r2 / 0
            if (r1 != 0) goto L20
            goto L1f
        L19:
            android.os.Bundle r1 = r6.getExtras()
            if (r1 != 0) goto L20
        L1f:
            return
        L20:
            o.setCurrentAd r2 = kotlin.PlayerTimelineChangeReason.read()
            boolean r3 = kotlin.getAdGroupCount.IconCompatParcelizer(r1)
            if (r3 == 0) goto L43
            int r3 = com.clevertap.android.sdk.pushnotification.CTNotificationIntentService.IconCompatParcelizer
            int r3 = r3 + 1
            int r4 = r3 % 128
            com.clevertap.android.sdk.pushnotification.CTNotificationIntentService.MediaBrowserCompatItemReceiver = r4
            int r3 = r3 % r0
            if (r3 != 0) goto L3c
            r3 = 18
            int r3 = r3 / 0
            if (r2 == 0) goto L43
            goto L3e
        L3c:
            if (r2 == 0) goto L43
        L3e:
            o.setAdPositionMs r2 = (kotlin.setAdPositionMs) r2
            r5.mActionButtonClickHandler = r2
            goto L59
        L43:
            o.setCurrentAd r2 = kotlin.getAdGroupCount.IconCompatParcelizer()
            o.setAdPositionMs r2 = (kotlin.setAdPositionMs) r2
            r5.mActionButtonClickHandler = r2
            int r2 = com.clevertap.android.sdk.pushnotification.CTNotificationIntentService.IconCompatParcelizer
            int r2 = r2 + 41
            int r3 = r2 % 128
            com.clevertap.android.sdk.pushnotification.CTNotificationIntentService.MediaBrowserCompatItemReceiver = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L59
            r0 = 5
            int r0 = r0 / 3
        L59:
            java.lang.String r0 = "ct_type"
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r2 = "com.clevertap.ACTION_BUTTON_CLICK"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L6e
            kotlin.RendererWakeupListener.MediaMetadataCompat()
            r5.handleActionButtonClick(r1)
            return
        L6e:
            r6.getAction()
            kotlin.RendererWakeupListener.MediaMetadataCompat()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.pushnotification.CTNotificationIntentService.onHandleIntent(android.content.Intent):void");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i3 = $11 + 103;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = notifydownloadchanged.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objRemoteActionCompatParcelizer = startForeground.read((char) (38461 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 533 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 9, -735610793, false, $$g(b, b2, (byte) (b2 | 9)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (write ^ 2192498202983240651L);
                Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b3 = (byte) (-1);
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.lastIndexOf("", '0') + 36622), 2341 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 28, 188119637, false, $$g(b3, (byte) (b3 + 1), $$c[2]), new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        int i6 = $11 + 125;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            Object[] objArr4 = {notifydownloadchanged, notifydownloadchanged};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1971306176);
            if (objRemoteActionCompatParcelizer3 == null) {
                byte b4 = (byte) (-1);
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (Color.alpha(0) + 36621), View.combineMeasuredStates(0, 0) + 2340, 28 - TextUtils.indexOf("", ""), 188119637, false, $$g(b4, (byte) (b4 + 1), $$c[2]), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
        }
        String str = new String(cArr2);
        int i8 = $10 + 99;
        $11 = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private void handleActionButtonClick(Bundle bundle) {
        boolean z;
        int i;
        String string;
        Context applicationContext;
        Intent launchIntentForPackage;
        NotificationManager notificationManager;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatItemReceiver + 71;
        IconCompatParcelizer = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                z = bundle.getBoolean("autoCancel", false);
                i = bundle.getInt("notificationId", -1);
                string = bundle.getString("dl");
                applicationContext = getApplicationContext();
                if (this.mActionButtonClickHandler.IconCompatParcelizer(applicationContext, bundle, i)) {
                    return;
                }
            } else {
                z = bundle.getBoolean("autoCancel", false);
                i = bundle.getInt("notificationId", -1);
                string = bundle.getString("dl");
                applicationContext = getApplicationContext();
                if (this.mActionButtonClickHandler.IconCompatParcelizer(applicationContext, bundle, i)) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 31) {
                return;
            }
            if (string != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW", Uri.parse(string));
                RendererCapabilitiesListener.RemoteActionCompatParcelizer(applicationContext, launchIntentForPackage);
            } else {
                launchIntentForPackage = applicationContext.getPackageManager().getLaunchIntentForPackage(applicationContext.getPackageName());
            }
            if (launchIntentForPackage == null) {
                int i4 = IconCompatParcelizer + 53;
                MediaBrowserCompatItemReceiver = i4 % 128;
                if (i4 % 2 != 0) {
                    RendererWakeupListener.MediaMetadataCompat();
                    return;
                } else {
                    RendererWakeupListener.MediaMetadataCompat();
                    throw null;
                }
            }
            launchIntentForPackage.setFlags(872415232);
            launchIntentForPackage.putExtras(bundle);
            launchIntentForPackage.removeExtra("dl");
            String string2 = bundle.getString("pt_dismiss_on_click", "");
            if (z && i >= 0 && string2.isEmpty() && (notificationManager = (NotificationManager) getApplicationContext().getSystemService("notification")) != null) {
                int i5 = IconCompatParcelizer + 71;
                MediaBrowserCompatItemReceiver = i5 % 128;
                int i6 = i5 % 2;
                notificationManager.cancel(i);
                int i7 = IconCompatParcelizer + 57;
                MediaBrowserCompatItemReceiver = i7 % 128;
                int i8 = i7 % 2;
            }
            sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            startActivity(launchIntentForPackage);
        } catch (Throwable th) {
            th.getLocalizedMessage();
            RendererWakeupListener.MediaMetadataCompat();
        }
    }

    private static void b(char[] cArr, char c, char[] cArr2, char[] cArr3, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i3 = $11 + 21;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), Color.red(0) + 22748, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 36, 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 31369), TextUtils.getOffsetBefore("", 0) + 2721, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 38, 1895162189, false, $$g(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) ((-16777216) - Color.rgb(0, 0, 0)), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 15713, 64 - View.resolveSizeAndState(0, 0, 0), -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (40976 - View.MeasureSpec.makeMeasureSpec(0, 0)), Color.alpha(0) + 6122, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 29, -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (read ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) RemoteActionCompatParcelizer) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) AudioAttributesCompatParcelizer) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i5 = $10 + 95;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0a5d A[Catch: all -> 0x0b24, TryCatch #2 {all -> 0x0b24, blocks: (B:140:0x0a49, B:142:0x0a5d, B:143:0x0a90), top: B:263:0x0a49, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0aa3 A[Catch: all -> 0x0b1a, TryCatch #11 {all -> 0x0b1a, blocks: (B:144:0x0a96, B:146:0x0aa3, B:147:0x0b12), top: B:277:0x0a96, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0c51  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0c9d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0cf0  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0f98  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x1080  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x10cd  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x112b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x13c4  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0a2f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:295:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x082f A[Catch: all -> 0x08e7, TryCatch #4 {all -> 0x08e7, blocks: (B:85:0x0829, B:87:0x082f, B:88:0x085a), top: B:266:0x0829, outer: #5 }] */
    @Override // android.app.Service, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6083
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.pushnotification.CTNotificationIntentService.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 41;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate();
        if (i3 == 0) {
            throw null;
        }
        int i4 = MediaBrowserCompatItemReceiver + 85;
        IconCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }
}
