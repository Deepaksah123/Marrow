package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.Preconditions;
import com.marrow.R;
import java.lang.reflect.Method;
import kotlin.buildSetRequirementsIntent;
import kotlin.notifyDownloadRemoved;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    protected int zaa = 0;
    private static final byte[] $$c = {28, -38, TarConstants.LF_DIR, -29};
    private static final int $$f = 204;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {TarConstants.LF_GNUTYPE_LONGLINK, -63, -64, 24, 61, -41, -37, 15, -23, -5, -2, 42, -55, 17, -6, -15, -8, 7, -10, -3, 29, -24, -19, -4, 7, -17, -23, -12, -6, -9, 11, 32, -38, -21, 7, -10, -3, 39, -48, -2, -7, 11, -23, 32, -21, -21, 11, -6, -11, -1, -21, 17, -17, 61, -61, -2, -19, 30, -19, -23, 7, -9, 3, 9, 0, -7};
    private static final int $$e = 150;
    private static final byte[] $$a = {94, -36, -26, 62, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 73;
    private static int read = 0;
    private static int MediaBrowserCompatItemReceiver = 1;
    private static long AudioAttributesCompatParcelizer = -3498762522182953692L;
    private static int write = -136981212;
    private static char IconCompatParcelizer = 39848;
    private static long RemoteActionCompatParcelizer = 6151452871518741524L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r6, int r7, byte r8) {
        /*
            int r7 = r7 + 4
            byte[] r0 = com.google.android.gms.common.api.GoogleApiActivity.$$c
            int r6 = r6 * 3
            int r1 = r6 + 1
            int r8 = r8 + 103
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r6
            r8 = r7
            r3 = r2
            goto L28
        L13:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L17:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r0[r8]
        L28:
            int r4 = -r4
            int r7 = r7 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApiActivity.$$g(int, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = 114 - r5
            int r6 = r6 + 4
            int r0 = r7 + 4
            byte[] r1 = com.google.android.gms.common.api.GoogleApiActivity.$$a
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = 0
            if (r1 != 0) goto L12
            r4 = r7
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r6]
        L26:
            int r5 = r5 + r4
            int r5 = r5 + (-1)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApiActivity.c(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = 114 - r7
            int r0 = 28 - r6
            int r8 = 63 - r8
            byte[] r1 = com.google.android.gms.common.api.GoogleApiActivity.$$d
            byte[] r0 = new byte[r0]
            int r6 = 27 - r6
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r6
            goto L29
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L29:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-4)
            int r8 = r3 + 1
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApiActivity.d(int, byte, int, java.lang.Object[]):void");
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = read + 125;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        this.zaa = 0;
        setResult(0);
        finish();
        int i4 = MediaBrowserCompatItemReceiver + 31;
        read = i4 % 128;
        int i5 = i4 % 2;
    }

    public static Intent zaa(Context context, PendingIntent pendingIntent, int i, boolean z) {
        int i2 = 2 % 2;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra(CloudMessagingReceiver.IntentKeys.PENDING_INTENT, pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        int i3 = MediaBrowserCompatItemReceiver + 13;
        read = i3 % 128;
        int i4 = i3 % 2;
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.common.api.GoogleApiActivity.MediaBrowserCompatItemReceiver
            int r1 = r1 + 121
            int r2 = r1 % 128
            com.google.android.gms.common.api.GoogleApiActivity.read = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L16
            super.onActivityResult(r5, r6, r7)
            if (r5 != 0) goto L6a
            goto L1b
        L16:
            super.onActivityResult(r5, r6, r7)
            if (r5 != r3) goto L6a
        L1b:
            int r5 = com.google.android.gms.common.api.GoogleApiActivity.read
            int r5 = r5 + 89
            int r1 = r5 % 128
            com.google.android.gms.common.api.GoogleApiActivity.MediaBrowserCompatItemReceiver = r1
            int r5 = r5 % r0
            java.lang.String r1 = "notify_manager"
            if (r5 != 0) goto L38
            android.content.Intent r5 = r4.getIntent()
            boolean r5 = r5.getBooleanExtra(r1, r3)
            r4.zaa = r2
            r4.setResult(r6, r7)
            if (r5 == 0) goto L71
            goto L47
        L38:
            android.content.Intent r5 = r4.getIntent()
            boolean r5 = r5.getBooleanExtra(r1, r3)
            r4.zaa = r2
            r4.setResult(r6, r7)
            if (r5 == 0) goto L71
        L47:
            com.google.android.gms.common.api.internal.GoogleApiManager r5 = com.google.android.gms.common.api.internal.GoogleApiManager.zak(r4)
            r7 = -1
            if (r6 == r7) goto L66
            if (r6 != 0) goto L71
            com.google.android.gms.common.ConnectionResult r6 = new com.google.android.gms.common.ConnectionResult
            r1 = 13
            r2 = 0
            r6.<init>(r1, r2)
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r2 = "failing_client_id"
            int r7 = r1.getIntExtra(r2, r7)
            r5.zax(r6, r7)
            goto L71
        L66:
            r5.zay()
            goto L71
        L6a:
            if (r5 != r0) goto L71
            r4.zaa = r2
            r4.setResult(r6, r7)
        L71:
            r4.finish()
            int r4 = com.google.android.gms.common.api.GoogleApiActivity.MediaBrowserCompatItemReceiver
            int r4 = r4 + 97
            int r5 = r4 % 128
            com.google.android.gms.common.api.GoogleApiActivity.read = r5
            int r4 = r4 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApiActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    private final void zab() {
        int i;
        int i2 = 2 % 2;
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get(CloudMessagingReceiver.IntentKeys.PENDING_INTENT);
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null) {
            int i3 = read + 69;
            int i4 = i3 % 128;
            MediaBrowserCompatItemReceiver = i4;
            int i5 = i3 % 2;
            if (num == null) {
                int i6 = i4 + 37;
                read = i6 % 128;
                if (i6 % 2 == 0) {
                    finish();
                    return;
                } else {
                    finish();
                    int i7 = 30 / 0;
                    return;
                }
            }
        }
        if (pendingIntent == null) {
            GoogleApiAvailability.getInstance().showErrorDialogFragment(this, ((Integer) Preconditions.checkNotNull(num)).intValue(), 2, this);
            this.zaa = 1;
            return;
        }
        int i8 = MediaBrowserCompatItemReceiver + 99;
        read = i8 % 128;
        try {
            if (i8 % 2 != 0) {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 0, null, 0, 1, 0);
                this.zaa = 0;
            } else {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                this.zaa = 1;
            }
        } catch (ActivityNotFoundException unused) {
            if (extras.getBoolean("notify_manager", true)) {
                GoogleApiManager.zak(this).zax(new ConnectionResult(22, null), getIntent().getIntExtra("failing_client_id", -1));
                i = MediaBrowserCompatItemReceiver + 39;
                read = i % 128;
            } else {
                pendingIntent.toString();
                Build.FINGERPRINT.contains("generic");
                i = read + 97;
                MediaBrowserCompatItemReceiver = i % 128;
            }
            int i9 = i % 2;
            this.zaa = 1;
            finish();
        } catch (IntentSender.SendIntentException unused2) {
            finish();
        }
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        int i3 = $10 + 79;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i5 = $10 + 65;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i7 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(RemoteActionCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) Drawable.resolveOpacity(0, 0), Color.blue(0) + 12424, View.MeasureSpec.getSize(0) + 20, -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0')), Color.argb(0, 0, 0, 0) + 1868, 10 - TextUtils.getOffsetAfter("", 0), 1983509525, false, $$g(b, b2, (byte) (-b2)), new Class[]{Object.class, Object.class});
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
            int i4 = $10 + 1;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) Color.green(0), 22747 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getPressedStateDuration() >> 16) + 36, 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.indexOf("", "") + 31369), TextUtils.indexOf("", "", 0, 0) + 2721, 38 - Drawable.resolveOpacity(0, 0), 1895162189, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 15713 - (ViewConfiguration.getKeyRepeatDelay() >> 16), Color.argb(0, 0, 0, 0) + 64, -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (40975 - ImageFormat.getBitsPerPixel(0)), 6122 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 29 - View.MeasureSpec.makeMeasureSpec(0, 0), -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr2[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (AudioAttributesCompatParcelizer ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) write) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) IconCompatParcelizer) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
                int i6 = $11 + 109;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
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

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        int i2 = read + 79;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        bundle.putInt("resolution", this.zaa);
        super.onSaveInstanceState(bundle);
        int i4 = read + 7;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00cd  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2921
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApiActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x011a  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApiActivity.onResume():void");
    }

    @Override // android.app.Activity
    protected void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 109;
        read = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            a(ViewConfiguration.getWindowTouchSlop() >> 8, new char[]{0, 0, 0, 0}, new char[]{17308, 53125, 44812, 2851, 48621, 5649, 28857, 16320, 41292, 41566, 28956, 2030, 14807, 21289, 1819, 22179, 11314, 15590, 5047, 17873, 52907, 59539, 24461, 38614, 7040, 11912}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 6862), new char[]{13291, 48828, 61825, 50714}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 4, new char[]{0, 0, 0, 0}, new char[]{21229, 7499, 17959, 42751, 30113, 38625, 33681, 49983, 25065, 43870, 46992, 34065, 37170, 37573, 19511, 64964, 40207, 10846}, (char) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 37331), new char[]{61542, 42260, 54488, 32401}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = MediaBrowserCompatItemReceiver + 93;
            read = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            baseContext = (!((baseContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 4536), KeyEvent.getDeadChar(0, 0) + 6054, (KeyEvent.getMaxKeyCode() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.green(0), 6029 - Process.getGidForName(""), 24 - TextUtils.indexOf("", "", 0, 0), -861814097, false, "read", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:131:0x0922 A[Catch: all -> 0x036a, TryCatch #7 {all -> 0x036a, blocks: (B:178:0x0b94, B:180:0x0b9a, B:181:0x0bc6, B:211:0x0f9b, B:213:0x0fa1, B:214:0x0fce, B:247:0x139c, B:249:0x13a2, B:250:0x13cb, B:228:0x118e, B:230:0x11b1, B:231:0x1202, B:129:0x091c, B:131:0x0922, B:132:0x094d, B:19:0x0115, B:21:0x011b, B:22:0x0143, B:24:0x02d6, B:26:0x0308, B:27:0x0364), top: B:285:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0a07  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0a08  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0c5a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0cae  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0d0b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0f76  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x105f  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x10ac  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x1102  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x1379  */
    /* JADX WARN: Removed duplicated region for block: B:310:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00f4  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6059
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApiActivity.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = read + 13;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = MediaBrowserCompatItemReceiver + 15;
        read = i4 % 128;
        int i5 = i4 % 2;
    }
}
