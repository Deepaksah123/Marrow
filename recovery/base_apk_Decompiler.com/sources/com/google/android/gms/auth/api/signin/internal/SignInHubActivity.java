package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import in.juspay.hypersdk.core.PaymentConstants;
import java.lang.reflect.Method;
import kotlin.buildSetRequirementsIntent;
import kotlin.maybeGetTypeVariable;
import kotlin.notifyDownloadRemoved;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public class SignInHubActivity extends maybeGetTypeVariable {
    private static int AudioAttributesCompatParcelizer = 0;
    private static long IconCompatParcelizer = 0;
    private static char RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static long write = 0;
    private static boolean zba = false;
    private boolean zbb = false;
    private SignInConfiguration zbc;
    private boolean zbd;
    private int zbe;
    private Intent zbf;
    private static final byte[] $$c = {31, 80, -124, -66};
    private static final int $$f = 176;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {3, -120, 17, 23, 67, -55, 4, -13, 34, -18, -11, 10, 13, -10, 15, -6, -1, 25, -27, 8, 74, -44, -17, -6, 0, -3, 17, 38, -32, -15, 13, -4, 3, 45, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, -17, -6, 0, -3, 17, 38, -32, -15, 13, -4, 3, 45, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, 67, -74, 2, 15, -5, -24, -10, 3, 45, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11};
    private static final int $$e = 158;
    private static final byte[] $$a = {9, -121, -22, -93, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 225;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int AudioAttributesImplApi21Parcelizer = 1;
    private static int MediaBrowserCompatItemReceiver = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r5, short r6, byte r7) {
        /*
            byte[] r0 = com.google.android.gms.auth.api.signin.internal.SignInHubActivity.$$c
            int r6 = r6 * 4
            int r1 = 1 - r6
            int r5 = 104 - r5
            int r7 = r7 * 3
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            r3 = r0[r7]
        L26:
            int r5 = r5 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.SignInHubActivity.$$g(byte, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 65
            int r6 = 44 - r6
            byte[] r0 = com.google.android.gms.auth.api.signin.internal.SignInHubActivity.$$a
            int r8 = 190 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r7
            r5 = r2
            r7 = r6
            goto L25
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r7
            int r8 = r8 + 1
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r8]
        L25:
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            r3 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.SignInHubActivity.c(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = 46 - r6
            byte[] r0 = com.google.android.gms.auth.api.signin.internal.SignInHubActivity.$$d
            int r7 = r7 + 4
            int r8 = 111 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r6
            r5 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r7]
        L26:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + 2
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.SignInHubActivity.d(int, short, short, java.lang.Object[]):void");
    }

    private final void zbc() {
        int i = 2 % 2;
        getSupportLoaderManager().read(new zbw(this, null));
        zba = false;
        int i2 = AudioAttributesImplApi21Parcelizer + 103;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 12 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r7 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r7 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        r7 = com.google.android.gms.auth.api.signin.internal.SignInHubActivity.AudioAttributesImplApi21Parcelizer + 95;
        com.google.android.gms.auth.api.signin.internal.SignInHubActivity.MediaBrowserCompatCustomActionResultReceiver = r7 % 128;
        r7 = r7 % 2;
        zbd(com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes.SIGN_IN_FAILED);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        com.google.android.gms.auth.api.signin.internal.zbn.zbc(r6).zbe(r6.zbc.zba(), r7);
        r9.removeExtra(com.google.android.gms.auth.api.signin.GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
        r9.putExtra("googleSignInAccount", r7);
        r6.zbd = true;
        r6.zbe = r8;
        r6.zbf = r9;
        zbc();
        r6 = com.google.android.gms.auth.api.signin.internal.SignInHubActivity.MediaBrowserCompatCustomActionResultReceiver + 109;
        com.google.android.gms.auth.api.signin.internal.SignInHubActivity.AudioAttributesImplApi21Parcelizer = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        return;
     */
    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityResult(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r6.zbb
            if (r1 != 0) goto La8
            r1 = 0
            r6.setResult(r1)
            r2 = 40962(0xa002, float:5.74E-41)
            if (r7 == r2) goto L12
            goto La8
        L12:
            r7 = 8
            if (r9 == 0) goto La5
            java.lang.String r2 = "signInAccount"
            android.os.Parcelable r3 = r9.getParcelableExtra(r2)
            com.google.android.gms.auth.api.signin.SignInAccount r3 = (com.google.android.gms.auth.api.signin.SignInAccount) r3
            if (r3 == 0) goto L81
            int r4 = com.google.android.gms.auth.api.signin.internal.SignInHubActivity.MediaBrowserCompatCustomActionResultReceiver
            int r4 = r4 + 47
            int r5 = r4 % 128
            com.google.android.gms.auth.api.signin.internal.SignInHubActivity.AudioAttributesImplApi21Parcelizer = r5
            int r4 = r4 % r0
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r4 = r3.zba()
            if (r4 == 0) goto L81
            int r7 = com.google.android.gms.auth.api.signin.internal.SignInHubActivity.AudioAttributesImplApi21Parcelizer
            int r7 = r7 + 117
            int r4 = r7 % 128
            com.google.android.gms.auth.api.signin.internal.SignInHubActivity.MediaBrowserCompatCustomActionResultReceiver = r4
            int r7 = r7 % r0
            if (r7 == 0) goto L43
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r7 = r3.zba()
            r3 = 4
            int r3 = r3 / r1
            if (r7 != 0) goto L58
            goto L49
        L43:
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r7 = r3.zba()
            if (r7 != 0) goto L58
        L49:
            int r7 = com.google.android.gms.auth.api.signin.internal.SignInHubActivity.AudioAttributesImplApi21Parcelizer
            int r7 = r7 + 95
            int r8 = r7 % 128
            com.google.android.gms.auth.api.signin.internal.SignInHubActivity.MediaBrowserCompatCustomActionResultReceiver = r8
            int r7 = r7 % r0
            r7 = 12500(0x30d4, float:1.7516E-41)
            r6.zbd(r7)
            return
        L58:
            com.google.android.gms.auth.api.signin.internal.zbn r1 = com.google.android.gms.auth.api.signin.internal.zbn.zbc(r6)
            com.google.android.gms.auth.api.signin.internal.SignInConfiguration r3 = r6.zbc
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r3 = r3.zba()
            r1.zbe(r3, r7)
            r9.removeExtra(r2)
            java.lang.String r1 = "googleSignInAccount"
            r9.putExtra(r1, r7)
            r7 = 1
            r6.zbd = r7
            r6.zbe = r8
            r6.zbf = r9
            r6.zbc()
            int r6 = com.google.android.gms.auth.api.signin.internal.SignInHubActivity.MediaBrowserCompatCustomActionResultReceiver
            int r6 = r6 + 109
            int r7 = r6 % 128
            com.google.android.gms.auth.api.signin.internal.SignInHubActivity.AudioAttributesImplApi21Parcelizer = r7
            int r6 = r6 % r0
            return
        L81:
            java.lang.String r8 = "errorCode"
            boolean r1 = r9.hasExtra(r8)
            if (r1 == 0) goto La5
            int r7 = r9.getIntExtra(r8, r7)
            r8 = 13
            if (r7 != r8) goto La1
            int r7 = com.google.android.gms.auth.api.signin.internal.SignInHubActivity.AudioAttributesImplApi21Parcelizer
            int r7 = r7 + 27
            int r8 = r7 % 128
            com.google.android.gms.auth.api.signin.internal.SignInHubActivity.MediaBrowserCompatCustomActionResultReceiver = r8
            int r7 = r7 % r0
            if (r7 == 0) goto L9f
            r7 = 28578(0x6fa2, float:4.0046E-41)
            goto La1
        L9f:
            r7 = 12501(0x30d5, float:1.7518E-41)
        La1:
            r6.zbd(r7)
            return
        La5:
            r6.zbd(r7)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.SignInHubActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    private final void zbd(int i) {
        int i2 = 2 % 2;
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        zba = false;
        int i3 = AudioAttributesImplApi21Parcelizer + 27;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void zbe(String str) {
        int i = 2 % 2;
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            int i2 = MediaBrowserCompatCustomActionResultReceiver + 95;
            AudioAttributesImplApi21Parcelizer = i2 % 128;
            int i3 = i2 % 2;
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
            int i4 = AudioAttributesImplApi21Parcelizer + 83;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            int i5 = i4 % 2;
        }
        intent.putExtra(PaymentConstants.Category.CONFIG, this.zbc);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.zbb = true;
            zbd(17);
        }
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(write ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        int i3 = $11 + 79;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i5 = $10 + 87;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i7 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(write)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) Color.green(0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 12424, TextUtils.lastIndexOf("", '0') + 21, -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getTrimmedLength(""), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1867, 11 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1983509525, false, $$g(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
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
        objArr[0] = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
    }

    private static void a(int i, char[] cArr, char[] cArr2, char c, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
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
            int i4 = $11 + 105;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), AndroidCharacter.getMirror('0') + 22700, 36 - ExpandableListView.getPackedPositionGroup(0L), 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 1;
                    byte b2 = (byte) (b - 1);
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (View.combineMeasuredStates(0, 0) + 31369), Color.red(0) + 2721, 38 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1895162189, false, $$g(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 15714 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 64, -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (40976 - View.MeasureSpec.getMode(0)), 6122 - View.MeasureSpec.getSize(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29, -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr2[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (IconCompatParcelizer ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) AudioAttributesCompatParcelizer) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) RemoteActionCompatParcelizer) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i6 = $11 + 13;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i7 = 35 / 0;
            objArr[0] = str;
        }
    }

    @Override // kotlin.maybeGetTypeVariable, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 39;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        zba = i3 == 0;
        int i4 = AudioAttributesImplApi21Parcelizer + 59;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.zbd);
        if (this.zbd) {
            int i2 = AudioAttributesImplApi21Parcelizer + 83;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            int i3 = i2 % 2;
            bundle.putInt("signInResultCode", this.zbe);
            bundle.putParcelable("signInResultData", this.zbf);
            int i4 = AudioAttributesImplApi21Parcelizer + 105;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00a0  */
    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2942
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.SignInHubActivity.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = MediaBrowserCompatCustomActionResultReceiver + 103;
            AudioAttributesImplApi21Parcelizer = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 4, new char[]{37095, 29898, 52238, 10855}, new char[]{50186, 22689, 29842, 46223, 63802, '1', 63580, 37140, 1149, 64774, 64656, 30076, 49641, 30324, 56468, 28057, 23432, 26016, 37819, 61670, 34165, 22951, 17333, 23367, 55872, 43142}, (char) (14395 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), new char[]{35451, 64218, 15168, 37688}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(-TextUtils.lastIndexOf("", '0', 0), new char[]{15492, 15591, 49707, 43617, 36166, 31615, 55397, 59060, 55377, 36579, 43505, 42583, 62972, 63782, 58231, 21077, 37227, 7603, 51179, 32465, 44795, 12320}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i4 = MediaBrowserCompatCustomActionResultReceiver + 97;
                AudioAttributesImplApi21Parcelizer = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 / 3;
                }
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            int i6 = AudioAttributesImplApi21Parcelizer + 9;
            MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 6054 - (ViewConfiguration.getPressedStateDuration() >> 16), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getOffsetBefore("", 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6029, TextUtils.indexOf((CharSequence) "", '0', 0) + 25, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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

    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 9;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, new char[]{37095, 29898, 52238, 10855}, new char[]{50186, 22689, 29842, 46223, 63802, '1', 63580, 37140, 1149, 64774, 64656, 30076, 49641, 30324, 56468, 28057, 23432, 26016, 37819, 61670, 34165, 22951, 17333, 23367, 55872, 43142}, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14394), new char[]{35451, 64218, 15168, 37688}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 9, new char[]{15492, 15591, 49707, 43617, 36166, 31615, 55397, 59060, 55377, 36579, 43505, 42583, 62972, 63782, 58231, 21077, 37227, 7603, 51179, 32465, 44795, 12320}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = MediaBrowserCompatCustomActionResultReceiver + 45;
            AudioAttributesImplApi21Parcelizer = i4 % 128;
            int i5 = i4 % 2;
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i6 = AudioAttributesImplApi21Parcelizer + 83;
                MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
                int i7 = i6 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 4535), 6053 - TextUtils.lastIndexOf("", '0', 0), TextUtils.getOffsetBefore("", 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.getOffsetBefore("", 0) + 6030, (Process.myPid() >> 22) + 24, -861814097, false, "read", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x00eb  */
    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6126
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.SignInHubActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        read = 0;
        write();
        int i = MediaBrowserCompatItemReceiver + 17;
        read = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ int zba(SignInHubActivity signInHubActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 125;
        int i3 = i2 % 128;
        AudioAttributesImplApi21Parcelizer = i3;
        int i4 = i2 % 2;
        int i5 = signInHubActivity.zbe;
        int i6 = i3 + 11;
        MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    static /* synthetic */ Intent zbb(SignInHubActivity signInHubActivity) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 97;
        int i3 = i2 % 128;
        MediaBrowserCompatCustomActionResultReceiver = i3;
        int i4 = i2 % 2;
        Intent intent = signInHubActivity.zbf;
        int i5 = i3 + 3;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 96 / 0;
        }
        return intent;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver;
        int i3 = i2 + 91;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 37;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 101;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
    }

    static void write() {
        IconCompatParcelizer = -1939316360603548221L;
        AudioAttributesCompatParcelizer = -136981212;
        RemoteActionCompatParcelizer = (char) 54564;
        write = -4335423489939083334L;
    }
}
