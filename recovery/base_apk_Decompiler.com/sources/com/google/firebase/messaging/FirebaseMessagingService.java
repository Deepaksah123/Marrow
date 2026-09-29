package com.google.firebase.messaging;

import android.content.Intent;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import kotlin.bypassRead;
import kotlin.codecNeedsDiscardToSpsWorkaround;
import kotlin.drainAndFlushCodec;
import kotlin.isSecure;
import kotlin.isSecureV21;
import kotlin.isTunnelingV21;
import kotlin.needsStartedService;
import kotlin.notifyDownloadRemoved;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public class FirebaseMessagingService extends isSecure {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    private static char AudioAttributesCompatParcelizer = 0;
    private static int AudioAttributesImplBaseParcelizer = 0;
    static final String EXTRA_TOKEN = "token";
    private static int IconCompatParcelizer = 0;
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static long RemoteActionCompatParcelizer;
    private static char read;
    private static final Queue<String> recentlyReceivedMessageIds;
    private static char[] write;
    private static final byte[] $$l = {18, -64, -35, -97};
    private static final int $$o = 197;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {TarConstants.LF_NORMAL, -59, 73, 39, -23, -12, -6, -9, 11, 32, -38, -21, 7, -10, -3, 39, -48, -2, -7, 11, -23, 32, -21, -21, 11, -6, -11, -1, -21, 17, -17, 61, -61, -2, -19, 30, -19, -23, 7, -9, 3, 9, 0, -7};
    private static final int $$n = 68;
    private static final byte[] $$d = {3, -109, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -57, 12, 3, -4, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 141;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;
    private static int AudioAttributesImplApi21Parcelizer = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$r(int r6, short r7, short r8) {
        /*
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r0 = com.google.firebase.messaging.FirebaseMessagingService.$$l
            int r6 = r6 * 3
            int r1 = 1 - r6
            int r8 = r8 * 4
            int r8 = r8 + 103
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L18
            r3 = r6
            r4 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r7 = r7 + 1
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.$$r(int, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = 191 - r7
            int r9 = r9 + 65
            byte[] r0 = com.google.firebase.messaging.FirebaseMessagingService.$$d
            int r8 = 44 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r9 = r7
            r3 = r8
            r5 = r2
            goto L26
        L11:
            r3 = r2
            r6 = r9
            r9 = r7
            r7 = r6
        L15:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r9]
        L26:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            int r9 = r9 + 1
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.g(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(byte r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 82
            int r6 = 40 - r6
            int r7 = 28 - r7
            byte[] r0 = com.google.firebase.messaging.FirebaseMessagingService.$$m
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r4 = r7
            r3 = r2
            goto L24
        L10:
            r3 = r2
        L11:
            int r6 = r6 + 1
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r0[r6]
        L24:
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-4)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.h(byte, short, short, java.lang.Object[]):void");
    }

    static {
        AudioAttributesImplBaseParcelizer = 1;
        RemoteActionCompatParcelizer();
        recentlyReceivedMessageIds = new ArrayDeque(10);
        int i = AudioAttributesImplApi21Parcelizer + 47;
        AudioAttributesImplBaseParcelizer = i % 128;
        if (i % 2 == 0) {
            int i2 = 27 / 0;
        }
    }

    private static void f(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
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
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i4 = $11 + 69;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 22748 - View.combineMeasuredStates(0, 0), 37 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {notifydownloadremoved};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (31369 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (KeyEvent.getMaxKeyCode() >> 16) + 2721, 38 - ExpandableListView.getPackedPositionType(0L), 1895162189, false, $$r(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) View.getDefaultSize(0, 0), 15714 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 64, -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                objRemoteActionCompatParcelizer4 = startForeground.read((char) (40976 - KeyEvent.normalizeMetaState(0)), 6122 - View.MeasureSpec.getMode(0), 29 - (ViewConfiguration.getLongPressTimeout() >> 16), -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = notifydownloadremoved.write;
                            cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (RemoteActionCompatParcelizer ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) IconCompatParcelizer) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) AudioAttributesCompatParcelizer) ^ (-3498762522182953692L)))));
                            notifydownloadremoved.AudioAttributesCompatParcelizer++;
                            int i6 = $10 + 27;
                            $11 = i6 % 128;
                            int i7 = i6 % 2;
                            i2 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
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
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr6);
        int i8 = $10 + 7;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    @Override // kotlin.isSecure
    public Intent getStartCommandIntent(Intent intent) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 99;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Intent intentIconCompatParcelizer = drainAndFlushCodec.write().IconCompatParcelizer();
        int i4 = AudioAttributesImplApi26Parcelizer + 7;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
        return intentIconCompatParcelizer;
    }

    @Override // kotlin.isSecure
    public void handleIntent(Intent intent) {
        int i = 2 % 2;
        String action = intent.getAction();
        if (!ACTION_REMOTE_INTENT.equals(action)) {
            int i2 = MediaBrowserCompatCustomActionResultReceiver + 111;
            AudioAttributesImplApi26Parcelizer = i2 % 128;
            int i3 = i2 % 2;
            if (!ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
                int i4 = AudioAttributesImplApi26Parcelizer + 45;
                MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
                if (i4 % 2 == 0) {
                    ACTION_NEW_TOKEN.equals(action);
                    throw null;
                }
                if (ACTION_NEW_TOKEN.equals(action)) {
                    onNewToken(intent.getStringExtra("token"));
                    return;
                } else {
                    intent.getAction();
                    return;
                }
            }
        }
        handleMessageIntent(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void handleMessageIntent(android.content.Intent r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.firebase.messaging.FirebaseMessagingService.MediaBrowserCompatCustomActionResultReceiver
            int r1 = r1 + 7
            int r2 = r1 % 128
            com.google.firebase.messaging.FirebaseMessagingService.AudioAttributesImplApi26Parcelizer = r2
            int r1 = r1 % r0
            java.lang.String r2 = "google.message_id"
            if (r1 == 0) goto L1f
            java.lang.String r1 = r4.getStringExtra(r2)
            boolean r1 = r3.alreadyReceivedMessage(r1)
            r2 = 46
            int r2 = r2 / 0
            if (r1 == 0) goto L29
            goto L2c
        L1f:
            java.lang.String r1 = r4.getStringExtra(r2)
            boolean r1 = r3.alreadyReceivedMessage(r1)
            if (r1 != 0) goto L2c
        L29:
            r3.passMessageIntentToSdk(r4)
        L2c:
            int r3 = com.google.firebase.messaging.FirebaseMessagingService.MediaBrowserCompatCustomActionResultReceiver
            int r3 = r3 + 103
            int r4 = r3 % 128
            com.google.firebase.messaging.FirebaseMessagingService.AudioAttributesImplApi26Parcelizer = r4
            int r3 = r3 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.handleMessageIntent(android.content.Intent):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void passMessageIntentToSdk(android.content.Intent r8) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.passMessageIntentToSdk(android.content.Intent):void");
    }

    private void dispatchMessage(Intent intent) {
        int i = 2 % 2;
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (bypassRead.write(extras)) {
            bypassRead bypassread = new bypassRead(extras);
            ExecutorService executorServiceRemoteActionCompatParcelizer = isTunnelingV21.RemoteActionCompatParcelizer();
            try {
                Object obj = null;
                if (!new isSecureV21(this, bypassread, executorServiceRemoteActionCompatParcelizer).IconCompatParcelizer()) {
                    executorServiceRemoteActionCompatParcelizer.shutdown();
                    if (codecNeedsDiscardToSpsWorkaround.RemoteActionCompatParcelizer(intent)) {
                        int i2 = MediaBrowserCompatCustomActionResultReceiver + 109;
                        AudioAttributesImplApi26Parcelizer = i2 % 128;
                        if (i2 % 2 != 0) {
                            codecNeedsDiscardToSpsWorkaround.read(intent);
                            obj.hashCode();
                            throw null;
                        }
                        codecNeedsDiscardToSpsWorkaround.read(intent);
                    }
                } else {
                    int i3 = MediaBrowserCompatCustomActionResultReceiver + 45;
                    AudioAttributesImplApi26Parcelizer = i3 % 128;
                    if (i3 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
            } finally {
                executorServiceRemoteActionCompatParcelizer.shutdown();
            }
        }
        onMessageReceived(new RemoteMessage(extras));
    }

    private boolean alreadyReceivedMessage(String str) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 9;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (queue.contains(str)) {
            int i4 = MediaBrowserCompatCustomActionResultReceiver + 65;
            AudioAttributesImplApi26Parcelizer = i4 % 128;
            return i4 % 2 == 0;
        }
        if (queue.size() >= 10) {
            int i5 = AudioAttributesImplApi26Parcelizer + 75;
            MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
            int i6 = i5 % 2;
            queue.remove();
            int i7 = AudioAttributesImplApi26Parcelizer + 111;
            MediaBrowserCompatCustomActionResultReceiver = i7 % 128;
            int i8 = i7 % 2;
        }
        queue.add(str);
        return false;
    }

    private String getMessageId(Intent intent) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 61;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("message_id");
            int i4 = MediaBrowserCompatCustomActionResultReceiver + 77;
            AudioAttributesImplApi26Parcelizer = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = AudioAttributesImplApi26Parcelizer + 21;
        MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 73 / 0;
        }
        return stringExtra;
    }

    static void resetForTesting() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 1;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            recentlyReceivedMessageIds.clear();
            obj.hashCode();
            throw null;
        }
        recentlyReceivedMessageIds.clear();
        int i3 = MediaBrowserCompatCustomActionResultReceiver + 21;
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static void e(int i, char[] cArr, byte b, Object[] objArr) throws Throwable {
        int i2;
        long j;
        int i3 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr2 = write;
        long j2 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = $11 + 97;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            for (int i6 = 0; i6 < length; i6++) {
                int i7 = $10 + 113;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ExpandableListView.getPackedPositionGroup(0L), 7015 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 31, -626716224, false, "o", new Class[]{Integer.TYPE});
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
        Object[] objArr3 = {Integer.valueOf(read)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getOffsetBefore("", 0), TextUtils.indexOf("", "", 0, 0) + 7015, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 31, -626716224, false, "o", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i9 = $11 + 67;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                i2 = i + 20;
                cArr4[i2] = (char) (cArr[i2] / b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i10 = $10 + 103;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                needsstartedservice.AudioAttributesCompatParcelizer = 1;
            } else {
                needsstartedservice.AudioAttributesCompatParcelizer = 0;
            }
            while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                    int i11 = $11 + 45;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                    int i13 = $10 + 39;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    j = j2;
                } else {
                    Object[] objArr4 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(105000849);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (48194 - (ViewConfiguration.getEdgeSlop() >> 16)), 20126 - (ViewConfiguration.getJumpTapTimeout() >> 16), 19 - TextUtils.lastIndexOf("", '0'), 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                        Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(50135433);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            j = 0;
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), TextUtils.indexOf("", "") + 19368, (ViewConfiguration.getPressedStateDuration() >> 16) + 18, 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            j = 0;
                        }
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                        int i15 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[iIntValue];
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i15];
                    } else {
                        j = 0;
                        if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                            needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                            needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                            int i16 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            int i17 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i16];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i17];
                        } else {
                            int i18 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            int i19 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i18];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i19];
                        }
                    }
                }
                needsstartedservice.AudioAttributesCompatParcelizer += 2;
                int i20 = $11 + 113;
                $10 = i20 % 128;
                int i21 = i20 % 2;
                j2 = j;
            }
        }
        for (int i22 = 0; i22 < i; i22++) {
            cArr4[i22] = (char) (cArr4[i22] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0a84 A[Catch: all -> 0x0385, TryCatch #1 {all -> 0x0385, blocks: (B:125:0x0a7e, B:127:0x0a84, B:128:0x0ab3, B:203:0x1121, B:205:0x1127, B:206:0x1152, B:245:0x158e, B:247:0x1594, B:248:0x15b7, B:226:0x137d, B:228:0x139f, B:229:0x13eb, B:169:0x0cc8, B:171:0x0cce, B:172:0x0cf9, B:19:0x00b8, B:21:0x00be, B:22:0x00e6, B:24:0x02f4, B:26:0x0325, B:27:0x037f, B:133:0x0b3a, B:136:0x0b48, B:140:0x0b54, B:155:0x0c2d, B:157:0x0c33, B:158:0x0c34, B:160:0x0c36, B:162:0x0c3d, B:163:0x0c3e), top: B:272:0x00b8, inners: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0d97  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0de5  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0e39  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x10f9  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x11df  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x122a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x12db  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x1568  */
    /* JADX WARN: Removed duplicated region for block: B:307:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x008e  */
    @Override // kotlin.isSecure, android.app.Service, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.attachBaseContext(android.content.Context):void");
    }

    public void onDeletedMessages() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 111;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 101;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    public void onMessageSent(String str) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 83;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 12 / 0;
        }
    }

    public void onNewToken(String str) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 53;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public void onSendError(String str, Exception exc) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 1;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // kotlin.isSecure, android.app.Service
    public void onCreate() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 87;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate();
        if (i3 != 0) {
            throw null;
        }
    }

    static void RemoteActionCompatParcelizer() {
        write = new char[]{6469, 6507, 6477, 6430, 6837, 6427, 6417, 6478, 6490, 6494, 6522, 6834, 6496, 6424, 6525, 6466, 6471, 6465, 6416, 6476, 6470, 6833, 6491, 6406, 6431, 6523, 6479, 6838, 6473, 6429, 6832, 6467, 6468, 6839, 6474, 6428, 6472, 6520, 6488, 6843, 6492, 6464, 6475, 6835, 6836, 6842, 6426, 6425, 6481};
        read = (char) 11445;
        RemoteActionCompatParcelizer = 4633897922174968297L;
        IconCompatParcelizer = -136981212;
        AudioAttributesCompatParcelizer = (char) 54564;
    }
}
