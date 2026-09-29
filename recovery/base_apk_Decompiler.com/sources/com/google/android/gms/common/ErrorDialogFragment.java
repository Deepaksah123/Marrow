package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.notifyDownloadRemoved;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public class ErrorDialogFragment extends DialogFragment {
    private Dialog zaa;
    private DialogInterface.OnCancelListener zab;
    private Dialog zac;
    private static final byte[] $$c = {80, -72, 126, -24};
    private static final int $$f = 107;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {99, -29, 19, 27, TarConstants.LF_FIFO, -68, -9, -26, 35, -52, -10, -17, 22, -33, -28, 10, 5, -36, -6, -22, 69, -57, -30, -19, -13, -16, 4, 25, -45, -28, 0, -17, -10, 32, -55, -9, -14, 4, -30, 25, -28, -28, 4, -13, -18, -8, -28, 10, -24, 8, -30, -19, -13, -16, 4, 25, -45, -28, 0, -17, -10, 32, -55, -9, -14, 4, -30, 25, -28, -28, 4, -13, -18, -8, -28, 10, -24};
    private static final int $$e = 11;
    private static final byte[] $$a = {TarConstants.LF_SYMLINK, -51, -30, -2, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 244;
    private static int RemoteActionCompatParcelizer = 0;
    private static int AudioAttributesCompatParcelizer = 1;
    private static long IconCompatParcelizer = 863982655161254200L;
    private static int write = -136981212;
    private static char read = 54564;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r6, short r7, byte r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r7 = r7 * 4
            int r7 = r7 + 103
            byte[] r0 = com.google.android.gms.common.ErrorDialogFragment.$$c
            int r8 = r8 * 3
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2d
        L17:
            r3 = r2
        L18:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L28:
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2d:
            int r6 = r6 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.ErrorDialogFragment.$$g(byte, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 10
            int r0 = 44 - r5
            int r6 = r6 * 12
            int r6 = 77 - r6
            int r7 = 80 - r7
            byte[] r1 = com.google.android.gms.common.ErrorDialogFragment.$$a
            byte[] r0 = new byte[r0]
            int r5 = 43 - r5
            r2 = -1
            if (r1 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            int r3 = r3 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L27:
            r4 = r1[r7]
        L29:
            int r7 = r7 + 1
            int r6 = r6 + r4
            int r6 = r6 + r2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.ErrorDialogFragment.a(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.gms.common.ErrorDialogFragment.$$d
            int r8 = r8 * 29
            int r8 = 111 - r8
            int r6 = r6 * 19
            int r1 = r6 + 28
            int r7 = r7 * 46
            int r7 = 50 - r7
            byte[] r1 = new byte[r1]
            int r6 = r6 + 27
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r6
            r8 = r7
            r4 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L30:
            int r7 = -r7
            int r8 = r8 + 1
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.ErrorDialogFragment.c(short, byte, int, java.lang.Object[]):void");
    }

    public static ErrorDialogFragment newInstance(Dialog dialog) {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 101;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            return newInstance(dialog, null);
        }
        newInstance(dialog, null);
        throw null;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        int i = 2 % 2;
        DialogInterface.OnCancelListener onCancelListener = this.zab;
        if (onCancelListener != null) {
            int i2 = AudioAttributesCompatParcelizer + 83;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            onCancelListener.onCancel(dialogInterface);
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i4 = AudioAttributesCompatParcelizer + 101;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 73;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.show(fragmentManager, str);
        int i4 = AudioAttributesCompatParcelizer + 109;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // android.app.DialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.app.Dialog onCreateDialog(android.os.Bundle r3) {
        /*
            r2 = this;
            r3 = 2
            int r0 = r3 % r3
            android.app.Dialog r0 = r2.zaa
            if (r0 != 0) goto L47
            int r0 = com.google.android.gms.common.ErrorDialogFragment.RemoteActionCompatParcelizer
            int r0 = r0 + 103
            int r1 = r0 % 128
            com.google.android.gms.common.ErrorDialogFragment.AudioAttributesCompatParcelizer = r1
            int r0 = r0 % r3
            r1 = 0
            if (r0 != 0) goto L1b
            r2.setShowsDialog(r1)
            android.app.Dialog r0 = r2.zac
            if (r0 != 0) goto L37
            goto L22
        L1b:
            r2.setShowsDialog(r1)
            android.app.Dialog r0 = r2.zac
            if (r0 != 0) goto L37
        L22:
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            android.app.Activity r1 = r2.getActivity()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            android.content.Context r1 = (android.content.Context) r1
            r0.<init>(r1)
            android.app.AlertDialog r0 = r0.create()
            r2.zac = r0
        L37:
            android.app.Dialog r2 = r2.zac
            int r0 = com.google.android.gms.common.ErrorDialogFragment.AudioAttributesCompatParcelizer
            int r0 = r0 + 9
            int r1 = r0 % 128
            com.google.android.gms.common.ErrorDialogFragment.RemoteActionCompatParcelizer = r1
            int r0 = r0 % r3
            if (r0 != 0) goto L45
            return r2
        L45:
            r2 = 0
            throw r2
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.ErrorDialogFragment.onCreateDialog(android.os.Bundle):android.app.Dialog");
    }

    public static ErrorDialogFragment newInstance(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        int i = 2 % 2;
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Dialog dialog2 = (Dialog) Preconditions.checkNotNull(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        errorDialogFragment.zaa = dialog2;
        if (onCancelListener != null) {
            int i2 = AudioAttributesCompatParcelizer + 39;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            errorDialogFragment.zab = onCancelListener;
        }
        int i4 = AudioAttributesCompatParcelizer + 111;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return errorDialogFragment;
    }

    private static void b(int i, char[] cArr, char[] cArr2, char c, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i3 = $11 + 73;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getTapTimeout() >> 16), 22748 - (ViewConfiguration.getTapTimeout() >> 16), 35 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {notifydownloadremoved};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (31369 - TextUtils.indexOf("", "")), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2721, 38 - KeyEvent.getDeadChar(0, 0), 1895162189, false, $$g(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 15714 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 65 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (40976 - Color.argb(0, 0, 0, 0)), 6122 - (ViewConfiguration.getFadingEdgeLength() >> 16), 29 - TextUtils.indexOf("", "", 0), -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = notifydownloadremoved.write;
                    cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr2[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (IconCompatParcelizer ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) write) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) read) ^ (-3498762522182953692L)))));
                    notifydownloadremoved.AudioAttributesCompatParcelizer++;
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
        }
        String str = new String(cArr6);
        int i5 = $10 + 21;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        objArr[0] = str;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 7;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char maxKeyCode = (char) (13183 - (KeyEvent.getMaxKeyCode() >> 16));
            int iLastIndexOf = 1648 - TextUtils.lastIndexOf("", '0');
            int keyRepeatDelay = 26 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            byte b = $$a[5];
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            a(b, b2, (byte) (b2 | TarConstants.LF_GNUTYPE_LONGNAME), objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(maxKeyCode, iLastIndexOf, keyRepeatDelay, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char c = (char) (13184 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                int offsetBefore = 1649 - TextUtils.getOffsetBefore("", 0);
                int scrollBarSize = 26 - (ViewConfiguration.getScrollBarSize() >> 8);
                byte[] bArr = $$a;
                byte b3 = bArr[53];
                Object[] objArr3 = new Object[1];
                a(b3, b3, (byte) (-bArr[39]), objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(c, offsetBefore, scrollBarSize, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
        } else {
            Object[] objArr4 = new Object[1];
            b(ViewConfiguration.getScrollDefaultDelay() >> 16, new char[]{37916, 17193, 40352, 50316}, new char[]{18005, 46527, 21654, 39498, 10755, 35962, 17737, 36296, 62814, 32526, 34507, 35794, 1279, 3997, 18430, 33083}, (char) (52362 - KeyEvent.keyCodeFromString("")), new char[]{61358, 24687, 35501, 36556}, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b(KeyEvent.keyCodeFromString(""), new char[]{37916, 17193, 40352, 50316}, new char[]{28721, 32917, 10309, 55007, 1107, 38978, 12697, 28177, 53488, 9658, 3093, 39265, 2227, 13027, 50519, 24615}, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 55), new char[]{14158, 52301, 14395, 11264}, objArr5);
            int iIntValue = ((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue();
            int i4 = RemoteActionCompatParcelizer + 79;
            AudioAttributesCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 950148720};
                byte b4 = (byte) ($$e & 5);
                byte[] bArr2 = $$d;
                Object[] objArr7 = new Object[1];
                c(b4, b4, bArr2[30], objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                byte b5 = bArr2[30];
                byte b6 = b5;
                Object[] objArr8 = new Object[1];
                c(b5, b6, (byte) (b6 + 1), objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char cIndexOf = (char) (13182 - TextUtils.indexOf((CharSequence) "", '0'));
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1649;
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 26;
                    byte[] bArr3 = $$a;
                    byte b7 = bArr3[53];
                    Object[] objArr9 = new Object[1];
                    a(b7, b7, (byte) (-bArr3[39]), objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(cIndexOf, minimumFlingVelocity, capsMode, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b(TextUtils.lastIndexOf("", '0', 0, 0) + 1, new char[]{37916, 17193, 40352, 50316}, new char[]{28360, 60655, 40252, 34683, 254, 9975, 40924, 24333, 4403, 40350, 6266, 54681, 27961, 46608, 56928, 39671, 24889, 49084, 54449, 9002, 40616, 57697}, (char) KeyEvent.keyCodeFromString(""), new char[]{56448, 6805, 52817, 14585}, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b((-665662035) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{37916, 17193, 40352, 50316}, new char[]{12083, 28300, 48806, 26126, 14851, 'f', 2899, 53039, 49310, 33880, 35536, 61652, 6657, 43548, 6616}, (char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 49515), new char[]{44287, 21197, 27864, 64449}, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char mode = (char) (13183 - View.MeasureSpec.getMode(0));
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1650;
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 26;
                        byte b8 = $$a[53];
                        Object[] objArr12 = new Object[1];
                        a(b8, b8, r12[5], objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(mode, packedPositionChild, iCombineMeasuredStates, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char cIndexOf2 = (char) (13183 - TextUtils.indexOf("", "", 0, 0));
                        int mode2 = View.MeasureSpec.getMode(0) + 1649;
                        int threadPriority = 26 - ((Process.getThreadPriority(0) + 20) >> 6);
                        byte b9 = $$a[5];
                        byte b10 = b9;
                        Object[] objArr13 = new Object[1];
                        a(b9, b10, (byte) (b10 | TarConstants.LF_GNUTYPE_LONGNAME), objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(cIndexOf2, mode2, threadPriority, -133433128, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf2);
                    int i6 = RemoteActionCompatParcelizer + 27;
                    AudioAttributesCompatParcelizer = i6 % 128;
                    int i7 = i6 % 2;
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
        int i8 = ((int[]) objArr[3])[0];
        int i9 = ((int[]) objArr[2])[0];
        if (i9 != i8) {
            long j = -1;
            long j2 = ((long) (i9 ^ i8)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (4535 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), Color.red(0) + 6054, MotionEvent.axisFromString("") + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                try {
                    Object[] objArr14 = {-1564471569, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) View.getDefaultSize(0, 0), AndroidCharacter.getMirror('0') + 5982, Color.red(0) + 24);
                    byte b11 = $$d[30];
                    byte b12 = b11;
                    Object[] objArr15 = new Object[1];
                    c(b11, b12, (byte) (b12 + 1), objArr15);
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
        super.onCreate(bundle);
    }
}
