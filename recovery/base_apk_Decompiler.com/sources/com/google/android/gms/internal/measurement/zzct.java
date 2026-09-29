package com.google.android.gms.internal.measurement;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.notifyDownloads;
import kotlin.startForeground;

/* JADX INFO: loaded from: classes5.dex */
public final class zzct extends zzdu {
    private static int $10 = 0;
    private static int $11 = 1;
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzef zzb;
    private static final byte[] $$a = {109, -78, -126, 25, -11, -2, 5, -3, -7, 13, -13};
    private static final int $$b = 3;
    private static int RemoteActionCompatParcelizer = 0;
    private static int MediaBrowserCompatItemReceiver = 1;
    private static char[] IconCompatParcelizer = {28458, 28459, 28470, 28429, 28463, 28461, 28454, 28424, 28455, 28450, 28452, 28472, 28512, 28448, 28457, 28442, 28476, 28449, 28473, 28460, 28478, 28474, 28445, 28453, 28431, 28471, 28475, 28446};
    private static int write = 411397966;
    private static boolean AudioAttributesCompatParcelizer = true;
    private static boolean read = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzct(zzef zzefVar, Bundle bundle) {
        super(zzefVar, true);
        this.zzb = zzefVar;
        this.zza = bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(int r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 5
            int r7 = 119 - r7
            byte[] r0 = com.google.android.gms.internal.measurement.zzct.$$a
            int r1 = 5 - r5
            int r6 = r6 * 3
            int r6 = 7 - r6
            byte[] r1 = new byte[r1]
            int r5 = 4 - r5
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r6]
        L28:
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-2)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzct.b(int, byte, short, java.lang.Object[]):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    final void zza() throws RemoteException {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 1;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zzcc zzccVar = this.zzb.zzj;
        if (i3 == 0) {
            ((zzcc) Preconditions.checkNotNull(zzccVar)).setConsent(this.zza, this.zzh);
            return;
        }
        ((zzcc) Preconditions.checkNotNull(zzccVar)).setConsent(this.zza, this.zzh);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        char[] cArr2;
        int i3 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr3 = IconCompatParcelizer;
        Object obj = null;
        if (cArr3 != null) {
            int i4 = $10 + 53;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (44862 - TextUtils.indexOf("", "")), (Process.myPid() >> 22) + 18944, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28, -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr4[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(write)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) Gravity.getAbsoluteGravity(0, 0), 19033 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 75 - TextUtils.indexOf("", "", 0, 0), 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
        int i7 = -1593953308;
        if (!read) {
            if (!(!AudioAttributesCompatParcelizer)) {
                notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
                char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                notifydownloads.IconCompatParcelizer = 0;
                while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                    cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr3[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                    Object[] objArr4 = {notifydownloads, notifydownloads};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 11439, 16777230 + Color.rgb(0, 0, 0), -558368911, false, "q", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr5);
                return;
            }
            notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
            char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                int i8 = $11 + 43;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr3[iArr[(notifydownloads.AudioAttributesCompatParcelizer + 1) % notifydownloads.IconCompatParcelizer] - i] << iIntValue);
                    i2 = notifydownloads.IconCompatParcelizer;
                } else {
                    cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr3[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                    i2 = notifydownloads.IconCompatParcelizer + 1;
                }
                notifydownloads.IconCompatParcelizer = i2;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i9 = $11 + 53;
        $10 = i9 % 128;
        if (i9 % 2 != 0) {
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            cArr2 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 1;
        } else {
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            cArr2 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
        }
        while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
            int i10 = $11 + 21;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr2[notifydownloads.IconCompatParcelizer] = (char) (cArr3[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
            Object[] objArr5 = {notifydownloads, notifydownloads};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(i7);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) Color.red(0), View.MeasureSpec.getSize(0) + 11439, 15 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -558368911, false, "q", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            i7 = -1593953308;
        }
        String str = new String(cArr2);
        int i12 = $10 + 33;
        $11 = i12 % 128;
        if (i12 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        objArr[0] = str;
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] IconCompatParcelizer(android.content.Context r32, java.lang.Class r33, int r34, int r35, int r36) {
        /*
            Method dump skipped, instruction units count: 4607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzct.IconCompatParcelizer(android.content.Context, java.lang.Class, int, int, int):java.lang.Object[]");
    }
}
