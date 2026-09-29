package com.google.android.gms.wallet.callback;

import android.app.Service;
import android.content.Intent;
import android.media.AudioTrack;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.buildSetRequirementsIntent;
import kotlin.notifyDownloads;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzd extends Service {
    ExecutorService zza;
    private Messenger zzb = new Messenger(new zza(this, Looper.getMainLooper()));
    private static final byte[] $$c = {79, -100, -79, 21};
    private static final int $$f = 183;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {67, -110, -113, 74, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -13, 1, 62, -58, -9, -1, 7, -6, 6, TarConstants.LF_FIFO, -52, -14, 9, -15, 2, 5, 4, TarConstants.LF_DIR, -64, 11, -20, 14, -14, 8, 7, -12, 61, -71, 18, -2, -18, 68, -39, -14, -2, 21, -22, -25, 9, -7, 0, 79, -79, 12, 3, -4, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$k = 200;
    private static final byte[] $$d = {24, -109, -85, -94, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 13;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;
    private static long write = -5754992778092146024L;
    private static char[] RemoteActionCompatParcelizer = {28541, 28456, 28532, 28458, 28535, 28534, 28457, 28459, 28538, 28454, 28530, 28533, 28537, 28539, 28536, 28455, 28543, 28542};
    private static int IconCompatParcelizer = 411397965;
    private static boolean AudioAttributesCompatParcelizer = true;
    private static boolean read = true;

    private static String $$i(int i, short s, byte b) {
        int i2 = i * 2;
        int i3 = 104 - (s * 2);
        int i4 = 3 - (b * 3);
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            int i7 = i4 + i5;
            i4 = i4;
            i3 = i7;
        }
        while (true) {
            i6++;
            int i8 = i4 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i4 = i8;
            i3 += bArr[i8];
        }
    }

    zzd() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.gms.wallet.callback.zzd.$$d
            int r6 = 114 - r6
            int r8 = r8 + 4
            int r1 = 44 - r7
            byte[] r1 = new byte[r1]
            int r7 = 43 - r7
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L20:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r6
            r6 = r4
            r4 = r5
        L28:
            int r8 = r8 + 1
            int r3 = r3 + r6
            int r6 = r3 + (-1)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.callback.zzd.g(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(short r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 20
            int r7 = r7 + 73
            byte[] r0 = com.google.android.gms.wallet.callback.zzd.$$j
            int r6 = 76 - r6
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L10
            r4 = r5
            r3 = r2
            goto L24
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r7
            int r6 = r6 + 1
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r0[r6]
        L24:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-1)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.callback.zzd.h(short, byte, int, java.lang.Object[]):void");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 61;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        IBinder binder = this.zzb.getBinder();
        int i4 = AudioAttributesImplApi21Parcelizer + 47;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return binder;
    }

    protected abstract void onRunTask(String str, CallbackInput callbackInput, OnCompleteListener<CallbackOutput> onCompleteListener);

    @Override // android.app.Service
    public void onCreate() {
        int i = 2 % 2;
        super.onCreate();
        this.zzb = new Messenger(new zza(this, Looper.getMainLooper()));
        com.google.android.gms.internal.wallet.zzg.zza();
        this.zza = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 3;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static void e(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(write ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i3 = $10 + 99;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i5 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(write)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.getOffsetAfter("", 0), TextUtils.indexOf("", "", 0) + 12424, 20 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) KeyEvent.normalizeMetaState(0), 1868 - KeyEvent.getDeadChar(0, 0), 10 - KeyEvent.keyCodeFromString(""), 1983509525, false, $$i(b, b2, b2), new Class[]{Object.class, Object.class});
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
        String str = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
        int i6 = $10 + 89;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i7 = 87 / 0;
            objArr[0] = str;
        }
    }

    private static void f(byte[] bArr, int i, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr3 = RemoteActionCompatParcelizer;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $10 + 65;
                $11 = i5 % 128;
                int i6 = i5 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (44862 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 18944, (ViewConfiguration.getWindowTouchSlop() >> 8) + 28, -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr4[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i4++;
                    i2 = 2;
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
        try {
            Object[] objArr3 = {Integer.valueOf(IconCompatParcelizer)};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), MotionEvent.axisFromString("") + 19034, 75 - (Process.myPid() >> 22), 1457087504, false, "r", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
            if (!(!read)) {
                notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
                char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                notifydownloads.IconCompatParcelizer = 0;
                while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                    int i7 = $11 + 95;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr3[bArr[notifydownloads.AudioAttributesCompatParcelizer % notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                        Object[] objArr4 = {notifydownloads, notifydownloads};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (Process.getGidForName("") + 1), (ViewConfiguration.getPressedStateDuration() >> 16) + 11439, 14 - View.getDefaultSize(0, 0), -558368911, false, "q", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                    } else {
                        cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr3[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                        Object[] objArr5 = {notifydownloads, notifydownloads};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) TextUtils.getOffsetBefore("", 0), 11439 - TextUtils.indexOf("", "", 0, 0), 14 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -558368911, false, "q", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                    }
                }
                objArr[0] = new String(cArr5);
                return;
            }
            if (!AudioAttributesCompatParcelizer) {
                notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
                char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                notifydownloads.IconCompatParcelizer = 0;
                while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                    cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr3[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                    notifydownloads.IconCompatParcelizer++;
                }
                objArr[0] = new String(cArr6);
                return;
            }
            int i8 = $11 + 43;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
                cArr2 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                notifydownloads.IconCompatParcelizer = 1;
            } else {
                notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
                cArr2 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                notifydownloads.IconCompatParcelizer = 0;
            }
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr2[notifydownloads.IconCompatParcelizer] = (char) (cArr3[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                Object[] objArr6 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) View.combineMeasuredStates(0, 0), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 11438, View.MeasureSpec.makeMeasureSpec(0, 0) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
                int i9 = $11 + 87;
                $10 = i9 % 128;
                int i10 = i9 % 2;
            }
            objArr[0] = new String(cArr2);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x084f A[Catch: all -> 0x099a, TryCatch #14 {all -> 0x099a, blocks: (B:83:0x04d8, B:85:0x04de, B:86:0x051f, B:90:0x0538, B:92:0x053e, B:93:0x0588, B:116:0x0845, B:117:0x0849, B:119:0x084f, B:121:0x0865, B:124:0x087b, B:126:0x087e, B:133:0x08e9, B:139:0x0974, B:141:0x097a, B:142:0x097b, B:144:0x097d, B:146:0x0984, B:147:0x0985, B:94:0x0592, B:106:0x06cf, B:108:0x06d5, B:109:0x071f, B:111:0x079e, B:112:0x07e3, B:114:0x07fa, B:115:0x083f, B:149:0x0987, B:151:0x098e, B:152:0x098f, B:154:0x0991, B:156:0x0998, B:157:0x0999, B:101:0x0648, B:103:0x065c, B:104:0x06c4, B:96:0x05fb, B:98:0x060f, B:99:0x0641, B:135:0x08f8, B:129:0x08b1, B:131:0x08b7, B:132:0x08e2), top: B:284:0x04d8, outer: #7, inners: #3, #9, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0ab7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0b03  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0b58  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0d7d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0e68  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0eb8  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0f06  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x1161  */
    /* JADX WARN: Removed duplicated region for block: B:295:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0328 A[Catch: all -> 0x039d, TryCatch #16 {all -> 0x039d, blocks: (B:50:0x031b, B:52:0x0328, B:53:0x0394), top: B:287:0x031b, outer: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0419 A[Catch: all -> 0x02ab, TryCatch #7 {all -> 0x02ab, blocks: (B:197:0x0da2, B:199:0x0da8, B:200:0x0dd4, B:233:0x1186, B:235:0x118c, B:236:0x11ad, B:214:0x0f87, B:216:0x0fa9, B:217:0x0ff3, B:164:0x09f4, B:166:0x09fa, B:167:0x0a26, B:76:0x0413, B:78:0x0419, B:79:0x0445, B:19:0x00b5, B:21:0x00bb, B:22:0x00e9, B:24:0x021d, B:26:0x024e, B:27:0x02a5, B:83:0x04d8, B:85:0x04de, B:86:0x051f, B:90:0x0538, B:92:0x053e, B:93:0x0588, B:116:0x0845, B:117:0x0849, B:119:0x084f, B:121:0x0865, B:124:0x087b, B:126:0x087e, B:133:0x08e9, B:139:0x0974, B:141:0x097a, B:142:0x097b, B:144:0x097d, B:146:0x0984, B:147:0x0985, B:94:0x0592, B:106:0x06cf, B:108:0x06d5, B:109:0x071f, B:111:0x079e, B:112:0x07e3, B:114:0x07fa, B:115:0x083f, B:149:0x0987, B:151:0x098e, B:152:0x098f, B:154:0x0991, B:156:0x0998, B:157:0x0999), top: B:272:0x00b5, inners: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0089 A[PHI: r6
      0x0089: PHI (r6v50 ??) = (r6v11 ??), (r6v9 ??) binds: [B:17:0x00a7, B:5:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04de A[Catch: all -> 0x099a, TryCatch #14 {all -> 0x099a, blocks: (B:83:0x04d8, B:85:0x04de, B:86:0x051f, B:90:0x0538, B:92:0x053e, B:93:0x0588, B:116:0x0845, B:117:0x0849, B:119:0x084f, B:121:0x0865, B:124:0x087b, B:126:0x087e, B:133:0x08e9, B:139:0x0974, B:141:0x097a, B:142:0x097b, B:144:0x097d, B:146:0x0984, B:147:0x0985, B:94:0x0592, B:106:0x06cf, B:108:0x06d5, B:109:0x071f, B:111:0x079e, B:112:0x07e3, B:114:0x07fa, B:115:0x083f, B:149:0x0987, B:151:0x098e, B:152:0x098f, B:154:0x0991, B:156:0x0998, B:157:0x0999, B:101:0x0648, B:103:0x065c, B:104:0x06c4, B:96:0x05fb, B:98:0x060f, B:99:0x0641, B:135:0x08f8, B:129:0x08b1, B:131:0x08b7, B:132:0x08e2), top: B:284:0x04d8, outer: #7, inners: #3, #9, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0592 A[Catch: all -> 0x099a, TRY_LEAVE, TryCatch #14 {all -> 0x099a, blocks: (B:83:0x04d8, B:85:0x04de, B:86:0x051f, B:90:0x0538, B:92:0x053e, B:93:0x0588, B:116:0x0845, B:117:0x0849, B:119:0x084f, B:121:0x0865, B:124:0x087b, B:126:0x087e, B:133:0x08e9, B:139:0x0974, B:141:0x097a, B:142:0x097b, B:144:0x097d, B:146:0x0984, B:147:0x0985, B:94:0x0592, B:106:0x06cf, B:108:0x06d5, B:109:0x071f, B:111:0x079e, B:112:0x07e3, B:114:0x07fa, B:115:0x083f, B:149:0x0987, B:151:0x098e, B:152:0x098f, B:154:0x0991, B:156:0x0998, B:157:0x0999, B:101:0x0648, B:103:0x065c, B:104:0x06c4, B:96:0x05fb, B:98:0x060f, B:99:0x0641, B:135:0x08f8, B:129:0x08b1, B:131:0x08b7, B:132:0x08e2), top: B:284:0x04d8, outer: #7, inners: #3, #9, #11, #15 }] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v57 */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Type inference failed for: r6v59 */
    /* JADX WARN: Type inference failed for: r6v9, types: [int] */
    @Override // android.app.Service, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.callback.zzd.attachBaseContext(android.content.Context):void");
    }
}
