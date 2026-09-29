package kotlin;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.getTunnelingSupport;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes2.dex */
public final class Rstyle extends maybeGetTypeVariable implements lambdaupdateStateAndInformListeners54, Rarray, getTunnelingSupport.AudioAttributesCompatParcelizer {
    private static short[] MediaBrowserCompatSearchResultReceiver = null;
    private static boolean read = false;
    private WeakReference<lambdaupdateStateAndInformListeners54> AudioAttributesCompatParcelizer;
    private getTunnelingSupport AudioAttributesImplBaseParcelizer;
    private CleverTapInstanceConfig IconCompatParcelizer;
    private CTInAppNotification RemoteActionCompatParcelizer;
    private boolean write = false;
    private static final byte[] $$c = {81, -92, 74, -108};
    private static final int $$f = 225;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {111, -63, 80, 27, 13, -1, -62, 58, 9, 1, -7, 6, -6, -54, TarConstants.LF_BLK, 14, -9, 15, -2, -5, -4, -53, 64, -11, 20, -14, 14, -8, -7, 12, -61, 71, -18, 2, 18, -68, 39, 14, 2, -21, 22, 25, -9, 7, 0, -79, 79, -12, -3, 4, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -64, 32, 25, 0, 6, -7, -29, 45, -10, 2, -1, -12, 20, -4, 2, 11, -28, 20, 10, -9, 2, 14, -12, 14, -46, 45, -10, 2, -1, -21, 21, 24, -33, 12, 12, 10, -15, 15, -12, -3, 4};
    private static final int $$e = 89;
    private static final byte[] $$a = {121, 72, 116, 113, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 51;
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    private static int MediaBrowserCompatItemReceiver = 1000326261;
    private static int AudioAttributesImplApi21Parcelizer = 1403710955;
    private static int AudioAttributesImplApi26Parcelizer = -819363164;
    private static int MediaBrowserCompatCustomActionResultReceiver = -758710150;
    private static byte[] MediaBrowserCompatMediaItem = {-23, 60, 57, -30, -60, 17, -45, -31, 57, -21, 35, -57, -118, -39, 126, -24, -19, -7, 34, TarConstants.LF_LINK, TarConstants.LF_SYMLINK, 59, -18, 38, -21, -123, 92, -117, 105, -124, -128, -125, -126, 70, -75, -109, 92, 95, -119, 70, -125, 104, -30, -69, -21, -80, -12, -9, -107, -77, -17, -89, -4, -81, 65, -57, -91, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -116, -77, -82, -116, 85, 96, -110, 92, 94, -116, 89, 80, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -114, -120, 38, 36, -119, -114, 35, -114, 32, -115, 33, -73, -73, -73, -73, -73};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(short r6, byte r7, short r8) {
        /*
            byte[] r0 = kotlin.Rstyle.$$c
            int r8 = r8 * 4
            int r8 = 112 - r8
            int r6 = r6 * 3
            int r6 = 4 - r6
            int r7 = r7 * 4
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r6]
        L26:
            int r8 = r8 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Rstyle.$$g(short, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0023). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = 44 - r6
            int r7 = 191 - r7
            byte[] r0 = kotlin.Rstyle.$$a
            int r5 = r5 + 65
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L11
            r4 = r5
            r5 = r6
            r3 = r2
            goto L23
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L21:
            r4 = r0[r7]
        L23:
            int r5 = r5 + r4
            int r5 = r5 + (-1)
            int r7 = r7 + 1
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Rstyle.c(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = 114 - r6
            int r5 = r5 + 4
            byte[] r0 = kotlin.Rstyle.$$d
            int r7 = 133 - r7
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L10
            r4 = r5
            r3 = r2
            goto L24
        L10:
            r3 = r2
        L11:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r0[r7]
        L24:
            int r6 = r6 + r4
            int r6 = r6 + (-1)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Rstyle.d(short, byte, short, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object write(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) throws NoSuchMethodException {
        int i7 = ~i2;
        int i8 = i4 | i3 | i7;
        int i9 = ~i4;
        int i10 = (~i3) | i7;
        int i11 = (~i10) | i9;
        int i12 = (~(i3 | i7 | i9)) | (~(i10 | i4));
        int i13 = i2 + i4 + i6 + (2053704882 * i) + ((-167119771) * i5);
        int i14 = i13 * i13;
        int i15 = (((-385660469) * i2) - 1543503872) + (1501345335 * i4) + (1203980746 * i8) + (i11 * (-1203980746)) + ((-1203980746) * i12) + ((-1589641216) * i6) + (511705088 * i) + ((-1639972864) * i5) + (1278279680 * i14);
        int i16 = ((i2 * (-1228230693)) - 288632672) + (i4 * (-1228230521)) + (i8 * (-86)) + (i11 * 86) + (i12 * 86) + (i6 * (-1228230607)) + (i * 927583762) + (i5 * (-1784727723)) + (i14 * 1163984896);
        int i17 = i15 + (i16 * i16 * 992935936);
        if (i17 == 1) {
            return AudioAttributesCompatParcelizer(objArr);
        }
        if (i17 == 2) {
            return RemoteActionCompatParcelizer(objArr);
        }
        if (i17 == 3) {
            return read(objArr);
        }
        if (i17 == 4) {
            return IconCompatParcelizer(objArr);
        }
        if (i17 == 5) {
            return write(objArr);
        }
        Rstyle rstyle = (Rstyle) objArr[0];
        CTInAppNotificationButton cTInAppNotificationButton = (CTInAppNotificationButton) objArr[1];
        int i18 = 2 % 2;
        int i19 = RatingCompat + 15;
        MediaMetadataCompat = i19 % 128;
        if (i19 % 2 != 0) {
            write(new Object[]{rstyle, cTInAppNotificationButton, false}, r8lambdau6CJUeKuPZwcnST9ZbIffzh_jU.IconCompatParcelizer(), -1468155886, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 652251995, 1468155891, StyledPlayerControlViewLayoutManager4.read(), r8lambdau6CJUeKuPZwcnST9ZbIffzh_jU.IconCompatParcelizer());
            return null;
        }
        write(new Object[]{rstyle, cTInAppNotificationButton, true}, r8lambdau6CJUeKuPZwcnST9ZbIffzh_jU.IconCompatParcelizer(), -1468155886, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 652251995, 1468155891, StyledPlayerControlViewLayoutManager4.read(), r8lambdau6CJUeKuPZwcnST9ZbIffzh_jU.IconCompatParcelizer());
        return null;
    }

    public static void RemoteActionCompatParcelizer(Activity activity, CleverTapInstanceConfig cleverTapInstanceConfig, boolean z) {
        int i = 2 % 2;
        int i2 = RatingCompat + 117;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        if (!activity.getClass().equals(Rstyle.class)) {
            Intent intent = new Intent(activity, (Class<?>) Rstyle.class);
            intent.putExtra(PaymentConstants.Category.CONFIG, cleverTapInstanceConfig);
            intent.putExtra("displayPushPermissionPrompt", true);
            intent.putExtra("shouldShowFallbackSettings", z);
            activity.startActivity(intent);
        }
        int i4 = RatingCompat + 85;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
    }

    public static void RemoteActionCompatParcelizer(Context context, CTInAppNotification cTInAppNotification, CleverTapInstanceConfig cleverTapInstanceConfig) {
        int i = 2 % 2;
        Intent intent = new Intent(context, (Class<?>) Rstyle.class);
        intent.putExtra("inApp", cTInAppNotification);
        intent.putExtra(PaymentConstants.Category.CONFIG, cleverTapInstanceConfig);
        context.startActivity(intent);
        int i2 = MediaMetadataCompat + 5;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void a(int i, boolean z, char[] cArr, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i2];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
            int i5 = $10 + 61;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i3 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i7 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(MediaBrowserCompatItemReceiver)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (1 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 23704 - TextUtils.getOffsetBefore("", 0), 32 - View.resolveSizeAndState(0, 0, 0), -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.lastIndexOf("", '0') + 44863), 18944 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), Color.blue(0) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
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
        if (i > 0) {
            cleardownloadmanagerhelpers.write = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i2 - cleardownloadmanagerhelpers.write);
        }
        if (!(!z)) {
            char[] cArr4 = new char[i2];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
                int i8 = $10 + 5;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i2 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (44862 - View.MeasureSpec.getSize(0)), KeyEvent.keyCodeFromString("") + 18944, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x021a A[PHI: r3
      0x021a: PHI (r3v40 int) = (r3v8 int), (r3v43 int) binds: [B:51:0x0218, B:48:0x0206] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x021c A[PHI: r3
      0x021c: PHI (r3v9 int) = (r3v8 int), (r3v43 int) binds: [B:51:0x0218, B:48:0x0206] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(int r23, short r24, int r25, int r26, byte r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 808
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Rstyle.b(int, short, int, int, byte, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.Rstyle$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[lambdaupdateStateAndInformListeners41.values().length];
            read = iArr;
            try {
                iArr[lambdaupdateStateAndInformListeners41.RemoteActionCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                read[lambdaupdateStateAndInformListeners41.onCustomAction.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                read[lambdaupdateStateAndInformListeners41.MediaMetadataCompat.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                read[lambdaupdateStateAndInformListeners41.IconCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                read[lambdaupdateStateAndInformListeners41.MediaDescriptionCompat.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                read[lambdaupdateStateAndInformListeners41.MediaBrowserCompatItemReceiver.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                read[lambdaupdateStateAndInformListeners41.read.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                read[lambdaupdateStateAndInformListeners41.handleMediaPlayPauseIfPendingOnHandler.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                read[lambdaupdateStateAndInformListeners41.MediaBrowserCompatSearchResultReceiver.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                read[lambdaupdateStateAndInformListeners41.write.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x010b  */
    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Rstyle.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b(((Process.getThreadPriority(0) + 20) >> 6) + 7, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 86), (ViewConfiguration.getTapTimeout() >> 16) - 502170220, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1669107841, (byte) (MotionEvent.axisFromString("") + 107), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 75), (ViewConfiguration.getJumpTapTimeout() >> 16) - 502170218, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) + 1669107865, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 60), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if (!(!(baseContext instanceof ContextWrapper)) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i2 = MediaMetadataCompat + 55;
                RatingCompat = i2 % 128;
                int i3 = i2 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            int i4 = MediaMetadataCompat + 105;
            RatingCompat = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (Color.rgb(0, 0, 0) + 16781751), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 6054, 42 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.red(0), KeyEvent.keyCodeFromString("") + 6030, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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
        this.AudioAttributesImplBaseParcelizer.write(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 50) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 34) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        overrideActivityTransition(1, android.R.anim.fade_in, android.R.anim.fade_out);
        r5 = kotlin.Rstyle.RatingCompat + 87;
        kotlin.Rstyle.MediaMetadataCompat = r5 % 128;
        r5 = r5 % 2;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void finish() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.Rstyle.RatingCompat
            int r1 = r1 + 115
            int r2 = r1 % 128
            kotlin.Rstyle.MediaMetadataCompat = r2
            int r1 = r1 % r0
            r2 = 17432577(0x10a0001, float:2.53466E-38)
            r3 = 17432576(0x10a0000, float:2.5346597E-38)
            if (r1 == 0) goto L1d
            super.finish()
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 50
            if (r1 < r4) goto L34
            goto L26
        L1d:
            super.finish()
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 34
            if (r1 < r4) goto L34
        L26:
            r1 = 1
            r5.overrideActivityTransition(r1, r3, r2)
            int r5 = kotlin.Rstyle.RatingCompat
            int r5 = r5 + 87
            int r1 = r5 % 128
            kotlin.Rstyle.MediaMetadataCompat = r1
            int r5 = r5 % r0
            return
        L34:
            r5.overridePendingTransition(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Rstyle.finish():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        return r0.read(r3, r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r2 = kotlin.Rstyle.MediaMetadataCompat + 55;
        kotlin.Rstyle.RatingCompat = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r0 != null) goto L9;
     */
    @Override // kotlin.lambdaupdateStateAndInformListeners54
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle read(com.clevertap.android.sdk.inapp.CTInAppNotification r3, com.clevertap.android.sdk.inapp.CTInAppNotificationButton r4, android.content.Context r5) {
        /*
            r2 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = kotlin.Rstyle.MediaMetadataCompat
            int r0 = r0 + 5
            int r1 = r0 % 128
            kotlin.Rstyle.RatingCompat = r1
            int r0 = r0 % r5
            if (r0 != 0) goto L19
            o.lambdaupdateStateAndInformListeners54 r0 = r2.AudioAttributesImplApi21Parcelizer()
            r1 = 69
            int r1 = r1 / 0
            if (r0 == 0) goto L24
            goto L1f
        L19:
            o.lambdaupdateStateAndInformListeners54 r0 = r2.AudioAttributesImplApi21Parcelizer()
            if (r0 == 0) goto L24
        L1f:
            android.os.Bundle r2 = r0.read(r3, r4, r2)
            return r2
        L24:
            int r2 = kotlin.Rstyle.MediaMetadataCompat
            int r2 = r2 + 55
            int r3 = r2 % 128
            kotlin.Rstyle.RatingCompat = r3
            int r2 = r2 % r5
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Rstyle.read(com.clevertap.android.sdk.inapp.CTInAppNotification, com.clevertap.android.sdk.inapp.CTInAppNotificationButton, android.content.Context):android.os.Bundle");
    }

    @Override // kotlin.lambdaupdateStateAndInformListeners54
    public final void read(CTInAppNotification cTInAppNotification, Bundle bundle) {
        int i = 2 % 2;
        int i2 = RatingCompat + 89;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        write(bundle);
        int i4 = RatingCompat + 65;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        Rstyle rstyle = (Rstyle) objArr[0];
        Bundle bundle = (Bundle) objArr[2];
        int i = 2 % 2;
        int i2 = RatingCompat + 103;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        rstyle.AudioAttributesCompatParcelizer(bundle);
        int i4 = MediaMetadataCompat + 7;
        RatingCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // kotlin.lambdaupdateStateAndInformListeners54
    public final Bundle RemoteActionCompatParcelizer(CTInAppNotification cTInAppNotification, CTInAppAction cTInAppAction, String str, Bundle bundle, Context context) {
        int i = 2 % 2;
        int i2 = RatingCompat + 35;
        MediaMetadataCompat = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            lambdaupdateStateAndInformListeners54 lambdaupdatestateandinformlisteners54AudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
            if (lambdaupdatestateandinformlisteners54AudioAttributesImplApi21Parcelizer != null) {
                return lambdaupdatestateandinformlisteners54AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(cTInAppNotification, cTInAppAction, str, bundle, this);
            }
            int i3 = MediaMetadataCompat + 115;
            RatingCompat = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 46 / 0;
            }
            return null;
        }
        AudioAttributesImplApi21Parcelizer();
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        int i2 = 2 % 2;
        int i3 = MediaMetadataCompat + 17;
        RatingCompat = i3 % 128;
        int i4 = i3 % 2;
        super.setTheme(android.R.style.Theme.Translucent.NoTitleBar);
        int i5 = MediaMetadataCompat + 123;
        RatingCompat = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.Rarray
    public final void read(boolean z) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 119;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        IconCompatParcelizer(z);
        if (i3 == 0) {
            int i4 = 28 / 0;
        }
        int i5 = MediaMetadataCompat + 119;
        RatingCompat = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // kotlin.Rarray
    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 75;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(this);
        int i4 = RatingCompat + 55;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 43;
        RatingCompat = i2 % 128;
        if (i2 % 2 == 0) {
            this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(this, z);
            int i3 = 74 / 0;
        } else {
            this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(this, z);
        }
        int i4 = MediaMetadataCompat + 97;
        RatingCompat = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = 2 % 2;
        int i3 = MediaMetadataCompat + 23;
        RatingCompat = i3 % 128;
        int i4 = i3 % 2;
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.AudioAttributesImplBaseParcelizer.write(this, i, iArr);
        int i5 = MediaMetadataCompat + 89;
        RatingCompat = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object RemoteActionCompatParcelizer(java.lang.Object[] r6) {
        /*
            r0 = 0
            r6 = r6[r0]
            o.Rstyle r6 = (kotlin.Rstyle) r6
            r1 = 2
            int r2 = r1 % r1
            com.clevertap.android.sdk.inapp.CTInAppNotification r2 = r6.RemoteActionCompatParcelizer
            r3 = 0
            if (r2 == 0) goto L3e
            int r4 = kotlin.Rstyle.RatingCompat
            int r4 = r4 + 35
            int r5 = r4 % 128
            kotlin.Rstyle.MediaMetadataCompat = r5
            int r4 = r4 % r1
            boolean r2 = r2.getHandleMediaPlayPauseIfPendingOnHandler()
            if (r2 == 0) goto L3e
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            com.clevertap.android.sdk.inapp.CTInAppNotification r4 = r6.RemoteActionCompatParcelizer
            java.util.List r4 = r4.IconCompatParcelizer()
            java.lang.Object r0 = r4.get(r0)
            com.clevertap.android.sdk.inapp.CTInAppNotificationButton r0 = (com.clevertap.android.sdk.inapp.CTInAppNotificationButton) r0
            java.lang.String r0 = r0.getIconCompatParcelizer()
            java.lang.String r4 = "wzrk_c2a"
            r2.putString(r4, r0)
            java.lang.String r0 = "wzrk_id"
            java.lang.String r4 = ""
            r2.putString(r0, r4)
            goto L3f
        L3e:
            r2 = r3
        L3f:
            r6.write(r2)
            int r6 = kotlin.Rstyle.MediaMetadataCompat
            int r6 = r6 + 97
            int r0 = r6 % 128
            kotlin.Rstyle.RatingCompat = r0
            int r6 = r6 % r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Rstyle.RemoteActionCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    final void write(Bundle bundle) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 81;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        RemoteActionCompatParcelizer(bundle, true);
        int i4 = RatingCompat + 13;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[PHI: r4
      0x0043: PHI (r4v5 com.clevertap.android.sdk.inapp.CTInAppNotification) = (r4v4 com.clevertap.android.sdk.inapp.CTInAppNotification), (r4v6 com.clevertap.android.sdk.inapp.CTInAppNotification) binds: [B:18:0x0041, B:15:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void RemoteActionCompatParcelizer(android.os.Bundle r7, boolean r8) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = kotlin.Rstyle.read
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L19
            int r1 = kotlin.Rstyle.MediaMetadataCompat
            int r1 = r1 + 27
            int r4 = r1 % 128
            kotlin.Rstyle.RatingCompat = r4
            int r1 = r1 % r0
            if (r1 != 0) goto L17
            kotlin.Rstyle.read = r2
            goto L19
        L17:
            kotlin.Rstyle.read = r3
        L19:
            boolean r1 = r6.write
            if (r1 != 0) goto L48
            int r1 = kotlin.Rstyle.MediaMetadataCompat
            int r1 = r1 + 91
            int r4 = r1 % 128
            kotlin.Rstyle.RatingCompat = r4
            int r1 = r1 % r0
            o.lambdaupdateStateAndInformListeners54 r1 = r6.AudioAttributesImplApi21Parcelizer()
            if (r1 == 0) goto L46
            int r4 = kotlin.Rstyle.RatingCompat
            int r4 = r4 + 39
            int r5 = r4 % 128
            kotlin.Rstyle.MediaMetadataCompat = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L3f
            com.clevertap.android.sdk.inapp.CTInAppNotification r4 = r6.RemoteActionCompatParcelizer
            r5 = 95
            int r5 = r5 / r3
            if (r4 == 0) goto L46
            goto L43
        L3f:
            com.clevertap.android.sdk.inapp.CTInAppNotification r4 = r6.RemoteActionCompatParcelizer
            if (r4 == 0) goto L46
        L43:
            r1.read(r4, r7)
        L46:
            r6.write = r2
        L48:
            if (r8 == 0) goto L61
            int r7 = kotlin.Rstyle.MediaMetadataCompat
            int r7 = r7 + 97
            int r8 = r7 % 128
            kotlin.Rstyle.RatingCompat = r8
            int r7 = r7 % r0
            if (r7 == 0) goto L59
            r6.finish()
            goto L61
        L59:
            r6.finish()
            r6 = 0
            r6.hashCode()
            throw r6
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Rstyle.RemoteActionCompatParcelizer(android.os.Bundle, boolean):void");
    }

    private void AudioAttributesCompatParcelizer(Bundle bundle) {
        int i = 2 % 2;
        lambdaupdateStateAndInformListeners54 lambdaupdatestateandinformlisteners54AudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        if (lambdaupdatestateandinformlisteners54AudioAttributesImplApi21Parcelizer != null) {
            int i2 = MediaMetadataCompat + 99;
            RatingCompat = i2 % 128;
            int i3 = i2 % 2;
            lambdaupdatestateandinformlisteners54AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, bundle);
            if (i3 == 0) {
                throw null;
            }
        }
        int i4 = MediaMetadataCompat + 117;
        RatingCompat = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
    }

    private lambdaupdateStateAndInformListeners54 AudioAttributesImplApi21Parcelizer() {
        lambdaupdateStateAndInformListeners54 lambdaupdatestateandinformlisteners54;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 37;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        try {
            lambdaupdatestateandinformlisteners54 = this.AudioAttributesCompatParcelizer.get();
        } catch (Throwable unused) {
            lambdaupdatestateandinformlisteners54 = null;
        }
        if (lambdaupdatestateandinformlisteners54 == null) {
            int i4 = MediaMetadataCompat + 91;
            RatingCompat = i4 % 128;
            int i5 = i4 % 2;
            if (this.RemoteActionCompatParcelizer != null) {
                RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.IconCompatParcelizer.MediaBrowserCompatItemReceiver();
                String strWrite = this.IconCompatParcelizer.write();
                StringBuilder sb = new StringBuilder("InAppActivityListener is null for notification: ");
                sb.append(this.RemoteActionCompatParcelizer.onCustomAction());
                rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strWrite, sb.toString());
            }
        }
        return lambdaupdatestateandinformlisteners54;
    }

    private void write(lambdaupdateStateAndInformListeners54 lambdaupdatestateandinformlisteners54) {
        int i = 2 % 2;
        this.AudioAttributesCompatParcelizer = new WeakReference<>(lambdaupdatestateandinformlisteners54);
        int i2 = RatingCompat + 125;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        return r1.read(r3.RemoteActionCompatParcelizer, r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        r3 = kotlin.Rstyle.RatingCompat + 27;
        kotlin.Rstyle.MediaMetadataCompat = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if ((r3 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        r3 = 83 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r1 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.os.Bundle IconCompatParcelizer(com.clevertap.android.sdk.inapp.CTInAppNotificationButton r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.Rstyle.RatingCompat
            int r1 = r1 + 69
            int r2 = r1 % 128
            kotlin.Rstyle.MediaMetadataCompat = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L18
            o.lambdaupdateStateAndInformListeners54 r1 = r3.AudioAttributesImplApi21Parcelizer()
            r2 = 2
            int r2 = r2 / 0
            if (r1 == 0) goto L25
            goto L1e
        L18:
            o.lambdaupdateStateAndInformListeners54 r1 = r3.AudioAttributesImplApi21Parcelizer()
            if (r1 == 0) goto L25
        L1e:
            com.clevertap.android.sdk.inapp.CTInAppNotification r0 = r3.RemoteActionCompatParcelizer
            android.os.Bundle r3 = r1.read(r0, r4, r3)
            return r3
        L25:
            int r3 = kotlin.Rstyle.RatingCompat
            int r3 = r3 + 27
            int r4 = r3 % 128
            kotlin.Rstyle.MediaMetadataCompat = r4
            int r3 = r3 % r0
            r4 = 0
            if (r3 == 0) goto L35
            r3 = 83
            int r3 = r3 / 0
        L35:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Rstyle.IconCompatParcelizer(com.clevertap.android.sdk.inapp.CTInAppNotificationButton):android.os.Bundle");
    }

    private SimpleBasePlayerExternalSyntheticLambda2 AudioAttributesCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 99;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        switch (AnonymousClass4.read[this.RemoteActionCompatParcelizer.getWrite().ordinal()]) {
            case 1:
                return new SimpleBasePlayerExternalSyntheticLambda22();
            case 2:
                return new SimpleBasePlayerExternalSyntheticLambda31();
            case 3:
                return new SimpleBasePlayerExternalSyntheticLambda3();
            case 4:
                return new SimpleBasePlayerExternalSyntheticLambda32();
            case 5:
                return new SimpleBasePlayerExternalSyntheticLambda49();
            case 6:
                execute executeVar = new execute();
                int i4 = RatingCompat + 37;
                MediaMetadataCompat = i4 % 128;
                int i5 = i4 % 2;
                return executeVar;
            case 7:
                return new SimpleBasePlayerExternalSyntheticLambda36();
            case 8:
                return new SimpleBasePlayerExternalSyntheticLambda55();
            case 9:
                SimpleBasePlayerExternalSyntheticLambda43 simpleBasePlayerExternalSyntheticLambda43 = new SimpleBasePlayerExternalSyntheticLambda43();
                int i6 = MediaMetadataCompat + 3;
                RatingCompat = i6 % 128;
                int i7 = i6 % 2;
                return simpleBasePlayerExternalSyntheticLambda43;
            case 10:
                IconCompatParcelizer();
                return null;
            default:
                this.IconCompatParcelizer.MediaBrowserCompatItemReceiver().read();
                return null;
        }
    }

    private String write() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.IconCompatParcelizer.write());
        sb.append(":CT_INAPP_CONTENT_FRAGMENT");
        String string = sb.toString();
        int i2 = MediaMetadataCompat + 55;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }

    final /* synthetic */ void RemoteActionCompatParcelizer(CTInAppNotificationButton cTInAppNotificationButton) throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = RatingCompat + 43;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this, cTInAppNotificationButton, false};
        Object obj = null;
        write(objArr, r8lambdau6CJUeKuPZwcnST9ZbIffzh_jU.IconCompatParcelizer(), -1468155886, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 652251995, 1468155891, StyledPlayerControlViewLayoutManager4.read(), r8lambdau6CJUeKuPZwcnST9ZbIffzh_jU.IconCompatParcelizer());
        int i4 = RatingCompat + 103;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ void read(CTInAppNotificationButton cTInAppNotificationButton) {
        int i = 2 % 2;
        int i2 = RatingCompat + 109;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        write(cTInAppNotificationButton);
        int i4 = MediaMetadataCompat + 95;
        RatingCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 119;
        RatingCompat = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            List<CTInAppNotificationButton> listIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
            if (!(!listIconCompatParcelizer.isEmpty())) {
                int i3 = RatingCompat + 15;
                MediaMetadataCompat = i3 % 128;
                int i4 = i3 % 2;
                this.IconCompatParcelizer.MediaBrowserCompatItemReceiver();
                RendererWakeupListener.handleMediaPlayPauseIfPendingOnHandler();
                return;
            }
            final CTInAppNotificationButton cTInAppNotificationButton = listIconCompatParcelizer.get(0);
            AlertDialog alertDialogCreate = new AlertDialog.Builder(this, android.R.style.Theme.Material.Light.Dialog.Alert).setCancelable(false).setTitle(this.RemoteActionCompatParcelizer.getMediaMetadataCompat()).setMessage(this.RemoteActionCompatParcelizer.getRatingCompat()).setPositiveButton(cTInAppNotificationButton.getIconCompatParcelizer(), new DialogInterface.OnClickListener() { // from class: o.render
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i5) throws NoSuchMethodException {
                    Rstyle.write(new Object[]{this.IconCompatParcelizer, cTInAppNotificationButton}, StyledPlayerControlViewLayoutManager4.read(), -2122049986, StyledPlayerControlViewLayoutManager4.read(), 2122049986, r8lambdau6CJUeKuPZwcnST9ZbIffzh_jU.IconCompatParcelizer(), r8lambdau6CJUeKuPZwcnST9ZbIffzh_jU.IconCompatParcelizer());
                }
            }).create();
            if (this.RemoteActionCompatParcelizer.IconCompatParcelizer().size() == 2) {
                final CTInAppNotificationButton cTInAppNotificationButton2 = listIconCompatParcelizer.get(1);
                alertDialogCreate.setButton(-2, cTInAppNotificationButton2.getIconCompatParcelizer(), new DialogInterface.OnClickListener() { // from class: o.Renderer
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i5) throws NoSuchMethodException {
                        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(cTInAppNotificationButton2);
                    }
                });
            }
            if (listIconCompatParcelizer.size() > 2) {
                final CTInAppNotificationButton cTInAppNotificationButton3 = listIconCompatParcelizer.get(2);
                alertDialogCreate.setButton(-3, cTInAppNotificationButton3.getIconCompatParcelizer(), new DialogInterface.OnClickListener() { // from class: o.RendererMessageType
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        this.RemoteActionCompatParcelizer.read(cTInAppNotificationButton3);
                    }
                });
            }
            alertDialogCreate.show();
            read = true;
            AudioAttributesCompatParcelizer((Bundle) null);
            int i5 = MediaMetadataCompat + 3;
            RatingCompat = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.RemoteActionCompatParcelizer.IconCompatParcelizer().isEmpty();
        throw null;
    }

    private void write(CTInAppNotificationButton cTInAppNotificationButton) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 53;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        write(IconCompatParcelizer(cTInAppNotificationButton));
        int i4 = RatingCompat + 97;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        Rstyle rstyle = (Rstyle) objArr[0];
        CTInAppNotificationButton cTInAppNotificationButton = (CTInAppNotificationButton) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = RatingCompat + 101;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        Bundle bundleIconCompatParcelizer = rstyle.IconCompatParcelizer(cTInAppNotificationButton);
        if (!(true ^ rstyle.RemoteActionCompatParcelizer.getHandleMediaPlayPauseIfPendingOnHandler())) {
            if (zBooleanValue) {
                rstyle.IconCompatParcelizer(rstyle.RemoteActionCompatParcelizer.getOnAddQueueItem());
                return null;
            }
            rstyle.RemoteActionCompatParcelizer();
        }
        CTInAppAction cTInAppAction = cTInAppNotificationButton.AudioAttributesImplBaseParcelizer;
        if (cTInAppAction != null) {
            int i4 = RatingCompat + 101;
            MediaMetadataCompat = i4 % 128;
            int i5 = i4 % 2;
            if (lambdaupdateStateAndInformListeners38.AudioAttributesImplBaseParcelizer == cTInAppAction.getRemoteActionCompatParcelizer()) {
                int i6 = RatingCompat + 29;
                MediaMetadataCompat = i6 % 128;
                if (i6 % 2 != 0) {
                    rstyle.IconCompatParcelizer(cTInAppAction.getWrite());
                    int i7 = 84 / 0;
                } else {
                    rstyle.IconCompatParcelizer(cTInAppAction.getWrite());
                }
                return null;
            }
        }
        rstyle.write(bundleIconCompatParcelizer);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object IconCompatParcelizer(java.lang.Object[] r5) {
        /*
            r0 = 0
            r5 = r5[r0]
            o.Rstyle r5 = (kotlin.Rstyle) r5
            r1 = 2
            int r2 = r1 % r1
            int r2 = kotlin.Rstyle.MediaMetadataCompat
            int r2 = r2 + 89
            int r3 = r2 % 128
            kotlin.Rstyle.RatingCompat = r3
            int r2 = r2 % r1
            r3 = 0
            if (r2 != 0) goto L23
            super.onDestroy()
            boolean r2 = r5.isChangingConfigurations()
            r4 = 26
            int r4 = r4 / r0
            r4 = 1
            r2 = r2 ^ r4
            if (r2 == r4) goto L2c
            goto L38
        L23:
            super.onDestroy()
            boolean r2 = r5.isChangingConfigurations()
            if (r2 != 0) goto L38
        L2c:
            r5.RemoteActionCompatParcelizer(r3, r0)
            int r5 = kotlin.Rstyle.MediaMetadataCompat
            int r5 = r5 + 103
            int r0 = r5 % 128
            kotlin.Rstyle.RatingCompat = r0
            int r5 = r5 % r1
        L38:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Rstyle.IconCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.Rstyle.onPause():void");
    }

    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        String strValueOf;
        String strValueOf2;
        Object[] objArr;
        Object[] objArr2;
        List<Object[]> list;
        int i = 2 % 2;
        super.attachBaseContext(context);
        int i2 = 0;
        Object[] objArr3 = new Object[1];
        a((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 5, false, new char[]{15, '\f', 0, 2, 16, 16, 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65517}, 18 - Color.alpha(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 142, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        a(AndroidCharacter.getMirror('0') - '+', false, new char[]{5, 17, 65517, 1, 65532}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 5, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 181, objArr4);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context applicationContext = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
            if (applicationContext != null) {
                int i3 = MediaMetadataCompat + 113;
                RatingCompat = i3 % 128;
                int i4 = i3 % 2;
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 4536), 6054 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 42 - View.MeasureSpec.getSize(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr5 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 16, true, new char[]{24, 26, 65509, 65514, 25, 27, 26, 65518, 65512, 65515, 65513, 23, 22, 25, 24, 27, 65509, 65514, 24, 26, 27, 65518, 65517, 65514, 65518, 65512, 25, 65516, 23, 24, 23, 26, 65515, 65511, 26, 65509, 65511, 65510, 65512, 22, 65513, 27, 65517, 65518, 27, 26, 65512, 65509}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) + 12, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 149, objArr5);
                    String str = (String) objArr5[0];
                    Object[] objArr6 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 29, true, new char[]{65524, 65520, '\"', 65522, ' ', '\"', '#', 65525, 65522, 65521, 65526, 65518, 65517, 65522, 65526, 65517, '!', 65518, '#', '!', '!', 31, 65524, 65525, 65517, 65520, 65519, '#', 65520, 31, 65521, 65517, 65517, 65519, 65524, 65526, 65517, 65518, 65518, 31, 65526, 65521, 65525, 65523, 65526, 30, '\"', 30, 65523, '!', 65518, 65517, 31, '!', 65524, 65522, 65523, 65524, 30, 65524, 65517, ' ', ' ', 65517}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) + 28, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 109, objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 31, false, new char[]{65519, 65514, 65521, 65517, 26, 65520, 30, 26, 30, 65516, 31, 65514, 65515, 30, 65513, 28, 65515, 65513, 26, 65518, 29, 31, 26, 65514, 65519, 65516, 28, 65514, 27, 65518, 27, 65519, 65520, 65519, 65521, 27, 65514, 26, 29, 65514, 65515, 28, 65521, 29, 29, 65518, 65514, 65521, 26, 29, 29, 65521, 26, 27, 65514, 65515, 65514, 65516, 65515, 65522, 30, 29, 65522, 65516}, 64 - Color.alpha(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 139, objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 57, true, new char[]{18, 17, 3, 5, '\f', 7, 65485, 7, 14, 65535, 65485, 11, '\r', 1, 65484, 3, 16, 65535, 19, 15, 17, 2, 16, 65535, 19, 5, 65484, 18, 17, 65535, 1, 18, 65535, 3, 16, 6, 18, 65484, 17, 2, '\f', 19, '\r', 16, 23, '\n', 7, 65535, 2, 65485, 65485, 65496, 17, 14, 18, 18, 6, 17, 18, '\f', 3, 20, 3, 65485, 65488, 20, 65485}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 57, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + TsExtractor.TS_STREAM_TYPE_AC4, objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    a(3 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), true, new char[]{65532, 7, 0, 65532, 2, 65535}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 29, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 127, objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 1, false, new char[]{'!', 65526, 65526, 65522, 65521, '\"', 65527, 65526, 65522, 65521, 65521, 65517, 65528, '&', 65528, '&', 65517, 65524, 65526, 65524, 65527, 65517, 65529, '\"', 65522, 65520, 65517, '&', 65527, '!', 65522, 65527, '%', '#', '&', 65521}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 32, 142 - View.MeasureSpec.getSize(0), objArr10);
                    Object[] objArr11 = {applicationContext, str, str2, str3, str4, true, str5, (String) objArr10[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (Process.getGidForName("") + 1), 6029 - ((byte) KeyEvent.getModifierMetaStateMask()), (Process.myTid() >> 22) + 24, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr11);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        try {
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-18205161);
            if (objRemoteActionCompatParcelizer3 == null) {
                char packedPositionGroup = (char) (61148 - ExpandableListView.getPackedPositionGroup(0L));
                int i5 = 2146 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int iIndexOf = 11 - TextUtils.indexOf((CharSequence) "", '0', 0);
                Object[] objArr12 = new Object[1];
                c($$a[9], (byte) 40, (short) 78, objArr12);
                objRemoteActionCompatParcelizer3 = startForeground.read(packedPositionGroup, i5, iIndexOf, -2136739198, false, (String) objArr12[0], null);
            }
            if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-629126231);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 61148);
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 2145;
                    int i6 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 11;
                    Object[] objArr13 = new Object[1];
                    c((byte) (-$$a[113]), r4[14], (short) 75, objArr13);
                    objRemoteActionCompatParcelizer4 = startForeground.read(keyRepeatDelay, longPressTimeout, i6, -1530294468, false, (String) objArr13[0], null);
                }
                list = (List) ((Field) objRemoteActionCompatParcelizer4).get(null);
                int i7 = MediaMetadataCompat + 3;
                RatingCompat = i7 % 128;
                int i8 = i7 % 2;
            } else {
                Object[] objArr14 = new Object[1];
                b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 38, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 88), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 502170212, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 1669107914, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 6), objArr14);
                Class<?> cls2 = Class.forName((String) objArr14[0]);
                Object[] objArr15 = new Object[1];
                b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 38, (short) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 108), (-502170212) - Drawable.resolveOpacity(0, 0), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 1669107932, (byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 92), objArr15);
                int iIntValue2 = ((Integer) cls2.getMethod((String) objArr15[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr16 = {-1993247872};
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-173351824);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        objRemoteActionCompatParcelizer5 = startForeground.read((char) (View.getDefaultSize(0, 0) + 45845), ExpandableListView.getPackedPositionChild(0L) + 914, 10 - View.resolveSize(0, 0), -1948051227, false, null, new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr17 = {Integer.valueOf(iIntValue2), ((Constructor) objRemoteActionCompatParcelizer5).newInstance(objArr16)};
                        Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(1891595430);
                        if (objRemoteActionCompatParcelizer6 == null) {
                            char scrollBarFadeDuration = (char) (61148 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                            int gidForName = Process.getGidForName("") + 2146;
                            int scrollDefaultDelay = 12 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            byte[] bArr = $$a;
                            byte b = bArr[75];
                            Object[] objArr18 = new Object[1];
                            c(b, (byte) (b | 16), (short) (-bArr[15]), objArr18);
                            objRemoteActionCompatParcelizer6 = startForeground.read(scrollBarFadeDuration, gidForName, scrollDefaultDelay, 251047987, false, (String) objArr18[0], new Class[]{Integer.TYPE, (Class) startForeground.IconCompatParcelizer((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 558, 18 - (ViewConfiguration.getTouchSlop() >> 8))});
                        }
                        list = (List) ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr17);
                        Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-629126231);
                        if (objRemoteActionCompatParcelizer7 == null) {
                            char gidForName2 = (char) (61147 - Process.getGidForName(""));
                            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 2145;
                            int scrollBarFadeDuration2 = 12 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            Object[] objArr19 = new Object[1];
                            c((byte) (-$$a[113]), r6[14], (short) 75, objArr19);
                            objRemoteActionCompatParcelizer7 = startForeground.read(gidForName2, iCombineMeasuredStates, scrollBarFadeDuration2, -1530294468, false, (String) objArr19[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer7).set(null, list);
                        Object[] objArr20 = new Object[1];
                        a((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 19, false, new char[]{1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 89, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) + 128, objArr20);
                        Class<?> cls3 = Class.forName((String) objArr20[0]);
                        Object[] objArr21 = new Object[1];
                        a(11 - View.resolveSize(0, 0), false, new char[]{'\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t'}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 14, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 146, objArr21);
                        long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr21[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(301834150);
                        if (objRemoteActionCompatParcelizer8 == null) {
                            char c = (char) (61149 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                            int deadChar = 2145 - KeyEvent.getDeadChar(0, 0);
                            int capsMode = TextUtils.getCapsMode("", 0, 0) + 12;
                            Object[] objArr22 = new Object[1];
                            c((byte) ($$b & 93), (byte) (-$$a[45]), r11[103], objArr22);
                            objRemoteActionCompatParcelizer8 = startForeground.read(c, deadChar, capsMode, 1874090803, false, (String) objArr22[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer8).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(-18205161);
                        if (objRemoteActionCompatParcelizer9 == null) {
                            char cResolveOpacity = (char) (61148 - Drawable.resolveOpacity(0, 0));
                            int scrollBarFadeDuration3 = 2145 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int i9 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12;
                            Object[] objArr23 = new Object[1];
                            c($$a[9], (byte) 40, (short) 78, objArr23);
                            objRemoteActionCompatParcelizer9 = startForeground.read(cResolveOpacity, scrollBarFadeDuration3, i9, -2136739198, false, (String) objArr23[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer9).set(null, lValueOf2);
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
            for (Object[] objArr24 : list) {
                int i10 = MediaMetadataCompat + 9;
                RatingCompat = i10 % 128;
                int i11 = i10 % 2;
                int i12 = ((int[]) objArr24[3])[i2];
                int i13 = ((int[]) objArr24[1])[i2];
                if (i13 != i12) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr24[2];
                    if (strArr != null) {
                        for (int i14 = i2; i14 < strArr.length; i14++) {
                            arrayList.add(strArr[i14]);
                        }
                    }
                    long j = ((long) i2) << 32;
                    long j2 = -1;
                    long j3 = (j | (j2 - ((j2 >> 63) << 32))) & ((long) (i13 ^ i12));
                    long j4 = 0;
                    long j5 = j3 | (((long) 10) << 32) | (j4 - ((j4 >> 63) << 32));
                    try {
                        Object objRemoteActionCompatParcelizer10 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                        if (objRemoteActionCompatParcelizer10 == null) {
                            objRemoteActionCompatParcelizer10 = startForeground.read((char) (Color.argb(0, 0, 0, 0) + 4535), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 6055, 42 - View.MeasureSpec.makeMeasureSpec(0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                        }
                        Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer10).invoke(null, null);
                        try {
                            Object[] objArr25 = {-1993247872, Long.valueOf(j5), arrayList, TrainingApplication.RemoteActionCompatParcelizer(), false};
                            Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (MotionEvent.axisFromString("") + 1), ExpandableListView.getPackedPositionType(0L) + 6030, 23 - TextUtils.lastIndexOf("", '0'));
                            byte[] bArr2 = $$d;
                            Object[] objArr26 = new Object[1];
                            d(bArr2[127], bArr2[97], (short) ($$e & 487), objArr26);
                            cls4.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
                        } catch (Throwable th4) {
                            Throwable cause4 = th4.getCause();
                            if (cause4 == null) {
                                throw th4;
                            }
                            throw cause4;
                        }
                    } catch (Throwable th5) {
                        Throwable cause5 = th5.getCause();
                        if (cause5 == null) {
                            throw th5;
                        }
                        throw cause5;
                    }
                }
                i2 = 0;
            }
        } catch (Throwable th6) {
            Object[] objArr27 = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 32, false, new char[]{4, 1, 65531, 65535, 65533, 4, 65535, 4, 1, 2, 65533}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(3) - 89, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 96, objArr27);
            String str6 = (String) objArr27[0];
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                PrintStream printStream = new PrintStream(byteArrayOutputStream);
                th6.printStackTrace(printStream);
                printStream.close();
                strValueOf = byteArrayOutputStream.toString(CharsetNames.UTF_8);
            } catch (Throwable unused) {
                strValueOf = String.valueOf(th6);
            }
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(strValueOf);
            arrayList2.add(str6);
            Object objRemoteActionCompatParcelizer11 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer11 == null) {
                objRemoteActionCompatParcelizer11 = startForeground.read((char) (TextUtils.indexOf("", "", 0, 0) + 4535), TextUtils.indexOf((CharSequence) "", '0') + 6055, (ViewConfiguration.getWindowTouchSlop() >> 8) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke3 = ((Method) objRemoteActionCompatParcelizer11).invoke(null, null);
            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
            int i15 = MediaMetadataCompat + 75;
            RatingCompat = i15 % 128;
            int i16 = i15 % 2;
            try {
                Object[] objArr28 = {-1993247872, 81604378625L, arrayList2, strRemoteActionCompatParcelizer, false};
                Class cls5 = (Class) startForeground.IconCompatParcelizer((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 6030 - TextUtils.indexOf("", "", 0, 0), ExpandableListView.getPackedPositionType(0L) + 24);
                byte[] bArr3 = $$d;
                Object[] objArr29 = new Object[1];
                d(bArr3[127], bArr3[97], (short) ($$e & 487), objArr29);
                cls5.getMethod((String) objArr29[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke3, objArr28);
            } catch (Throwable th7) {
                Throwable cause6 = th7.getCause();
                if (cause6 == null) {
                    throw th7;
                }
                throw cause6;
            }
        }
        Context applicationContext2 = context;
        if (applicationContext2 != null) {
            try {
                applicationContext2 = ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : context.getApplicationContext();
            } catch (Throwable th8) {
                Object[] objArr30 = new Object[1];
                b((-9) - TextUtils.indexOf((CharSequence) "", '0', 0), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 109), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 502170370, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 1669107947, (byte) ((KeyEvent.getMaxKeyCode() >> 16) - 44), objArr30);
                String str7 = (String) objArr30[0];
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    PrintStream printStream2 = new PrintStream(byteArrayOutputStream2);
                    th8.printStackTrace(printStream2);
                    printStream2.close();
                    strValueOf2 = byteArrayOutputStream2.toString(CharsetNames.UTF_8);
                } catch (Throwable unused2) {
                    strValueOf2 = String.valueOf(th8);
                }
                ArrayList arrayList3 = new ArrayList(2);
                arrayList3.add(strValueOf2);
                arrayList3.add(str7);
                Object objRemoteActionCompatParcelizer12 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer12 == null) {
                    objRemoteActionCompatParcelizer12 = startForeground.read((char) (4535 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (KeyEvent.getMaxKeyCode() >> 16) + 6054, 42 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke4 = ((Method) objRemoteActionCompatParcelizer12).invoke(null, null);
                Object[] objArr31 = {-1993247872, 81604378625L, arrayList3, TrainingApplication.RemoteActionCompatParcelizer(), false};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 6030 - Color.blue(0), 24 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                byte[] bArr4 = $$d;
                Object[] objArr32 = new Object[1];
                d(bArr4[127], bArr4[97], (short) ($$e & 487), objArr32);
                cls6.getMethod((String) objArr32[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke4, objArr31);
            }
        }
        try {
            Object[] objArr33 = {-1993247872};
            Object objRemoteActionCompatParcelizer13 = startForeground.RemoteActionCompatParcelizer(-1128409246);
            if (objRemoteActionCompatParcelizer13 == null) {
                objRemoteActionCompatParcelizer13 = startForeground.read((char) TextUtils.indexOf("", ""), Color.red(0) + 1991, 12 - TextUtils.getOffsetBefore("", 0), -1024191497, false, null, new Class[]{Integer.TYPE});
            }
            try {
                Object[] objArr34 = {applicationContext2, ((Constructor) objRemoteActionCompatParcelizer13).newInstance(objArr33)};
                Object objRemoteActionCompatParcelizer14 = startForeground.RemoteActionCompatParcelizer(352975618);
                if (objRemoteActionCompatParcelizer14 == null) {
                    char edgeSlop = (char) (19323 - (ViewConfiguration.getEdgeSlop() >> 16));
                    int iIndexOf2 = 2758 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 99;
                    Object[] objArr35 = new Object[1];
                    c((byte) ($$b & 93), (byte) (-$$a[45]), r6[103], objArr35);
                    objRemoteActionCompatParcelizer14 = startForeground.read(edgeSlop, iIndexOf2, threadPriority, 1799372695, false, (String) objArr35[0], new Class[]{Context.class, (Class) startForeground.IconCompatParcelizer((char) (TextUtils.indexOf("", "") + 9580), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3445, 144 - KeyEvent.normalizeMetaState(0))});
                }
                ((Method) objRemoteActionCompatParcelizer14).invoke(null, objArr34);
                Object objRemoteActionCompatParcelizer15 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                if (objRemoteActionCompatParcelizer15 == null) {
                    char c2 = (char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13182);
                    int i17 = 1649 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 26;
                    byte[] bArr5 = $$a;
                    byte b2 = (byte) (-bArr5[113]);
                    byte b3 = bArr5[5];
                    Object[] objArr36 = new Object[1];
                    c(b2, b3, (short) (b3 | 187), objArr36);
                    objRemoteActionCompatParcelizer15 = startForeground.read(c2, i17, absoluteGravity, -133433128, false, (String) objArr36[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer15).getLong(null) != -1) {
                    Object objRemoteActionCompatParcelizer16 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                    if (objRemoteActionCompatParcelizer16 == null) {
                        char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13183);
                        int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 1649;
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 26;
                        Object[] objArr37 = new Object[1];
                        c(r2[5], (byte) (-$$a[30]), (short) 144, objArr37);
                        objRemoteActionCompatParcelizer16 = startForeground.read(keyRepeatTimeout, threadPriority2, iResolveOpacity, -1033747278, false, (String) objArr37[0], null);
                    }
                    objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer16).get(null);
                } else {
                    Object[] objArr38 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 38, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(3) - 167), (-502170211) - (ViewConfiguration.getKeyRepeatDelay() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 1669107869, (byte) (41 - (Process.myPid() >> 22)), objArr38);
                    Class<?> cls7 = Class.forName((String) objArr38[0]);
                    Object[] objArr39 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 38, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) + 60), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 502170222, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 1669107887, (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 92), objArr39);
                    try {
                        Object[] objArr40 = {Integer.valueOf(((Integer) cls7.getMethod((String) objArr39[0], Object.class).invoke(null, this)).intValue()), 0, 205894317};
                        byte[] bArr6 = $$d;
                        Object[] objArr41 = new Object[1];
                        d(bArr6[75], bArr6[63], (short) (bArr6[36] - 1), objArr41);
                        Class<?> cls8 = Class.forName((String) objArr41[0]);
                        byte b4 = bArr6[44];
                        byte b5 = b4;
                        Object[] objArr42 = new Object[1];
                        d(b4, b5, b5, objArr42);
                        objArr = (Object[]) cls8.getMethod((String) objArr42[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr40);
                        Object objRemoteActionCompatParcelizer17 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                        if (objRemoteActionCompatParcelizer17 == null) {
                            char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 13183);
                            int iResolveSize = View.resolveSize(0, 0) + 1649;
                            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 26;
                            Object[] objArr43 = new Object[1];
                            c(r5[5], (byte) (-$$a[30]), (short) 144, objArr43);
                            objRemoteActionCompatParcelizer17 = startForeground.read(maximumFlingVelocity, iResolveSize, minimumFlingVelocity, -1033747278, false, (String) objArr43[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer17).set(null, objArr);
                        try {
                            Object[] objArr44 = new Object[1];
                            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 15, false, new char[]{1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 77, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 167, objArr44);
                            Class<?> cls9 = Class.forName((String) objArr44[0]);
                            Object[] objArr45 = new Object[1];
                            a(11 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), false, new char[]{'\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t'}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) - 21, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 180, objArr45);
                            long jLongValue2 = ((Long) cls9.getDeclaredMethod((String) objArr45[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf3 = Long.valueOf(jLongValue2);
                            Object objRemoteActionCompatParcelizer18 = startForeground.RemoteActionCompatParcelizer(2104791916);
                            if (objRemoteActionCompatParcelizer18 == null) {
                                char keyRepeatDelay2 = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 13183);
                                int iKeyCodeFromString = 1649 - KeyEvent.keyCodeFromString("");
                                int iKeyCodeFromString2 = 26 - KeyEvent.keyCodeFromString("");
                                byte[] bArr7 = $$a;
                                byte b6 = bArr7[5];
                                byte b7 = (byte) (-bArr7[30]);
                                Object[] objArr46 = new Object[1];
                                c(b6, b7, (short) (b7 | 101), objArr46);
                                objRemoteActionCompatParcelizer18 = startForeground.read(keyRepeatDelay2, iKeyCodeFromString, iKeyCodeFromString2, 54351865, false, (String) objArr46[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer18).set(null, lValueOf3);
                            Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                            Object objRemoteActionCompatParcelizer19 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                            if (objRemoteActionCompatParcelizer19 == null) {
                                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 13184);
                                int pressedStateDuration = 1649 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                int packedPositionChild = 25 - ExpandableListView.getPackedPositionChild(0L);
                                byte[] bArr8 = $$a;
                                byte b8 = (byte) (-bArr8[113]);
                                byte b9 = bArr8[5];
                                Object[] objArr47 = new Object[1];
                                c(b8, b9, (short) (b9 | 187), objArr47);
                                objRemoteActionCompatParcelizer19 = startForeground.read(cLastIndexOf, pressedStateDuration, packedPositionChild, -133433128, false, (String) objArr47[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer19).set(null, lValueOf4);
                        } catch (Exception unused3) {
                            throw new RuntimeException();
                        }
                    } catch (Throwable th9) {
                        Throwable cause7 = th9.getCause();
                        if (cause7 == null) {
                            throw th9;
                        }
                        throw cause7;
                    }
                }
                int i18 = ((int[]) objArr[3])[0];
                int i19 = ((int[]) objArr[2])[0];
                if (i19 != i18) {
                    long j6 = -1;
                    long j7 = ((long) (i19 ^ i18)) & ((((long) 0) << 32) | (j6 - ((j6 >> 63) << 32)));
                    long j8 = 0;
                    long j9 = (((long) 2) << 32) | (j8 - ((j8 >> 63) << 32)) | j7;
                    Object objRemoteActionCompatParcelizer20 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer20 == null) {
                        objRemoteActionCompatParcelizer20 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0') + 4536), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 6054, 42 - TextUtils.indexOf("", "", 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke5 = ((Method) objRemoteActionCompatParcelizer20).invoke(null, null);
                    Object[] objArr48 = {-1993247872, Long.valueOf(j9), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls10 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getEdgeSlop() >> 16), 6030 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 24);
                    byte[] bArr9 = $$d;
                    Object[] objArr49 = new Object[1];
                    d(bArr9[127], bArr9[97], (short) ($$e & 487), objArr49);
                    cls10.getMethod((String) objArr49[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke5, objArr48);
                }
                Object objRemoteActionCompatParcelizer21 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                if (objRemoteActionCompatParcelizer21 == null) {
                    char c3 = (char) (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    int i20 = 943 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    int i21 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 36;
                    Object[] objArr50 = new Object[1];
                    c($$a[9], (byte) 40, (short) 78, objArr50);
                    objRemoteActionCompatParcelizer21 = startForeground.read(c3, i20, i21, -167186806, false, (String) objArr50[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer21).getLong(null) != -1) {
                    Object objRemoteActionCompatParcelizer22 = startForeground.RemoteActionCompatParcelizer(-757676623);
                    if (objRemoteActionCompatParcelizer22 == null) {
                        char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 943;
                        int scrollDefaultDelay2 = 36 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        Object[] objArr51 = new Object[1];
                        c((byte) (-$$a[113]), r1[14], (short) 75, objArr51);
                        objRemoteActionCompatParcelizer22 = startForeground.read(maximumDrawingCacheSize, maxKeyCode, scrollDefaultDelay2, -1398865628, false, (String) objArr51[0], null);
                    }
                    objArr2 = (Object[]) ((Field) objRemoteActionCompatParcelizer22).get(null);
                } else {
                    Object[] objArr52 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 100, (short) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 53), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 502170212, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1669107883, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 74), objArr52);
                    Class<?> cls11 = Class.forName((String) objArr52[0]);
                    Object[] objArr53 = new Object[1];
                    b(ExpandableListView.getPackedPositionChild(0L) - 2, (short) (110 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), (-502170212) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 1669107929, (byte) (93 - KeyEvent.normalizeMetaState(0)), objArr53);
                    Object[] objArr54 = {Integer.valueOf(((Integer) cls11.getMethod((String) objArr53[0], Object.class).invoke(null, this)).intValue()), 0, -600474466};
                    Object objRemoteActionCompatParcelizer23 = startForeground.RemoteActionCompatParcelizer(-21191141);
                    if (objRemoteActionCompatParcelizer23 == null) {
                        char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                        int i22 = 944 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 36;
                        byte b10 = $$a[5];
                        Object[] objArr55 = new Object[1];
                        c(b10, r5[146], b10, objArr55);
                        objRemoteActionCompatParcelizer23 = startForeground.read(mirror, i22, iResolveSizeAndState, -2131402098, false, (String) objArr55[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    objArr2 = (Object[]) ((Method) objRemoteActionCompatParcelizer23).invoke(null, objArr54);
                    Object objRemoteActionCompatParcelizer24 = startForeground.RemoteActionCompatParcelizer(-757676623);
                    if (objRemoteActionCompatParcelizer24 == null) {
                        char absoluteGravity2 = (char) Gravity.getAbsoluteGravity(0, 0);
                        int iAxisFromString = 942 - MotionEvent.axisFromString("");
                        int iIndexOf3 = 36 - TextUtils.indexOf("", "", 0);
                        Object[] objArr56 = new Object[1];
                        c((byte) (-$$a[113]), r4[14], (short) 75, objArr56);
                        objRemoteActionCompatParcelizer24 = startForeground.read(absoluteGravity2, iAxisFromString, iIndexOf3, -1398865628, false, (String) objArr56[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer24).set(null, objArr2);
                    try {
                        Object[] objArr57 = new Object[1];
                        a(MotionEvent.axisFromString("") + 21, false, new char[]{1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11}, (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 22, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 167, objArr57);
                        Class<?> cls12 = Class.forName((String) objArr57[0]);
                        Object[] objArr58 = new Object[1];
                        a(11 - (ViewConfiguration.getLongPressTimeout() >> 16), false, new char[]{'\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t'}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) - 22, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 180, objArr58);
                        long jLongValue3 = ((Long) cls12.getDeclaredMethod((String) objArr58[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf5 = Long.valueOf(jLongValue3);
                        Object objRemoteActionCompatParcelizer25 = startForeground.RemoteActionCompatParcelizer(-1539638354);
                        if (objRemoteActionCompatParcelizer25 == null) {
                            char capsMode2 = (char) TextUtils.getCapsMode("", 0, 0);
                            int i23 = 944 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 36;
                            Object[] objArr59 = new Object[1];
                            c((byte) ($$b & 93), (byte) (-$$a[45]), r8[103], objArr59);
                            objRemoteActionCompatParcelizer25 = startForeground.read(capsMode2, i23, touchSlop, -629981381, false, (String) objArr59[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer25).set(null, lValueOf5);
                        Long lValueOf6 = Long.valueOf(jLongValue3 >> 12);
                        Object objRemoteActionCompatParcelizer26 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                        if (objRemoteActionCompatParcelizer26 == null) {
                            char cRed = (char) Color.red(0);
                            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 943;
                            int iArgb = 36 - Color.argb(0, 0, 0, 0);
                            Object[] objArr60 = new Object[1];
                            c($$a[9], (byte) 40, (short) 78, objArr60);
                            objRemoteActionCompatParcelizer26 = startForeground.read(cRed, windowTouchSlop, iArgb, -167186806, false, (String) objArr60[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer26).set(null, lValueOf6);
                    } catch (Exception unused4) {
                        throw new RuntimeException();
                    }
                }
                int i24 = ((int[]) objArr2[2])[0];
                int i25 = ((int[]) objArr2[0])[0];
                if (i25 != i24) {
                    long j10 = -1;
                    long j11 = ((long) (i25 ^ i24)) & ((((long) 0) << 32) | (j10 - ((j10 >> 63) << 32)));
                    long j12 = 0;
                    long j13 = j11 | (((long) 1) << 32) | (j12 - ((j12 >> 63) << 32));
                    Object objRemoteActionCompatParcelizer27 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer27 == null) {
                        objRemoteActionCompatParcelizer27 = startForeground.read((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4535), 6054 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ExpandableListView.getPackedPositionType(0L) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke6 = ((Method) objRemoteActionCompatParcelizer27).invoke(null, null);
                    Object[] objArr61 = {-1993247872, Long.valueOf(j13), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls13 = (Class) startForeground.IconCompatParcelizer((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 6030, View.resolveSize(0, 0) + 24);
                    byte[] bArr10 = $$d;
                    Object[] objArr62 = new Object[1];
                    d(bArr10[127], bArr10[97], (short) ($$e & 487), objArr62);
                    cls13.getMethod((String) objArr62[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke6, objArr61);
                }
            } catch (Throwable th10) {
                Throwable cause8 = th10.getCause();
                if (cause8 == null) {
                    throw th10;
                }
                throw cause8;
            }
        } catch (Throwable th11) {
            Throwable cause9 = th11.getCause();
            if (cause9 == null) {
                throw th11;
            }
            throw cause9;
        }
    }

    private void RemoteActionCompatParcelizer(CTInAppNotificationButton cTInAppNotificationButton, boolean z) throws NoSuchMethodException {
        Object[] objArr = {this, cTInAppNotificationButton, Boolean.valueOf(z)};
        write(objArr, r8lambdau6CJUeKuPZwcnST9ZbIffzh_jU.IconCompatParcelizer(), -1468155886, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 652251995, 1468155891, StyledPlayerControlViewLayoutManager4.read(), r8lambdau6CJUeKuPZwcnST9ZbIffzh_jU.IconCompatParcelizer());
    }

    @Override // kotlin.lambdaupdateStateAndInformListeners54
    public final void AudioAttributesCompatParcelizer(CTInAppNotification cTInAppNotification, Bundle bundle) throws NoSuchMethodException {
        write(new Object[]{this, cTInAppNotification, bundle}, StyledPlayerControlViewLayoutManager4.read(), 902822686, StyledPlayerControlViewLayoutManager4.read(), -902822685, StyledPlayerControlViewLayoutManager4.read(), StyledPlayerControlViewLayoutManager4.read());
    }

    final /* synthetic */ void AudioAttributesCompatParcelizer(CTInAppNotificationButton cTInAppNotificationButton) throws NoSuchMethodException {
        write(new Object[]{this, cTInAppNotificationButton}, StyledPlayerControlViewLayoutManager4.read(), -2122049986, StyledPlayerControlViewLayoutManager4.read(), 2122049986, r8lambdau6CJUeKuPZwcnST9ZbIffzh_jU.IconCompatParcelizer(), r8lambdau6CJUeKuPZwcnST9ZbIffzh_jU.IconCompatParcelizer());
    }

    @Override // kotlin.maybeGetTypeVariable, android.app.Activity
    public final void onDestroy() throws NoSuchMethodException {
        write(new Object[]{this}, r8lambdau6CJUeKuPZwcnST9ZbIffzh_jU.IconCompatParcelizer(), 159637606, StyledPlayerControlViewLayoutManager4.read(), -159637602, StyledPlayerControlViewLayoutManager4.read(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 664690376);
    }

    @Override // o.getTunnelingSupport.AudioAttributesCompatParcelizer
    public final void read() throws NoSuchMethodException {
        write(new Object[]{this}, r8lambdau6CJUeKuPZwcnST9ZbIffzh_jU.IconCompatParcelizer(), -1197836845, StyledPlayerControlViewLayoutManager4.read(), 1197836847, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1761391581, r8lambdau6CJUeKuPZwcnST9ZbIffzh_jU.IconCompatParcelizer());
    }

    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() throws NoSuchMethodException {
        write(new Object[]{this}, (-1699094990) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8), 1025866367, StyledPlayerControlViewLayoutManager4.read(), -1025866364, StyledPlayerControlViewLayoutManager4.read(), StyledPlayerControlViewLayoutManager4.read());
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        Rstyle rstyle = (Rstyle) objArr[0];
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 37;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaMetadataCompat + 69;
        RatingCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }
}
