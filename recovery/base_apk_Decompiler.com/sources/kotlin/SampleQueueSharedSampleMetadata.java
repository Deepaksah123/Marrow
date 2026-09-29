package kotlin;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.play.core.integrity.model.IntegrityErrorCode;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import com.marrow.R;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u000e\u0019B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0005R\u0014\u0010\u0014\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018"}, d2 = {"Lo/SampleQueueSharedSampleMetadata;", "Lcom/marrow/bgservices/BaseService;", "Lo/getDisplayCues;", "Lo/getLargestReadTimestampUs$write;", "<init>", "()V", "", "write", "()Ljava/lang/String;", "", "p0", "p1", "p2", "", "IconCompatParcelizer", "(ILjava/lang/String;Ljava/lang/String;)V", "Landroid/content/Intent;", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)V", "onCreate", "Landroid/os/Binder;", "Landroid/os/Binder;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SampleQueueSharedSampleMetadata extends getReadIndex<getDisplayCues> implements getLargestReadTimestampUs$write {
    private static boolean AudioAttributesImplApi21Parcelizer;
    private static int AudioAttributesImplApi26Parcelizer;
    private static int AudioAttributesImplBaseParcelizer;
    private static long IconCompatParcelizer;
    private static boolean MediaBrowserCompatCustomActionResultReceiver;
    private static int MediaBrowserCompatItemReceiver;
    private static final byte[] MediaBrowserCompatMediaItem;
    private static int MediaBrowserCompatSearchResultReceiver;
    private static char[] MediaDescriptionCompat;
    private static long MediaMetadataCompat;
    private static final int RatingCompat;
    private static int RemoteActionCompatParcelizer;
    public static final Object read;
    private static char[] write;
    private final Binder AudioAttributesCompatParcelizer;
    private static final byte[] $$s = {59, 77, -89, -73};
    private static final int $$t = 198;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$p = {14, -10, 42, -103, -33, -22, -16, -19, 1, 22, -48, -31, -3, -20, -13, 29, -58, -12, -17, 1, -33, 22, -31, -31, 1, -16, -21, -11, -31, 7, -27, TarConstants.LF_CHR, -71, -12, -29, 36, -59, -3, -35, 71, -43, -66, 3, -19, -20, 32, -65, -14, -12, -5, -7, -33, -13, 1, -28, 28, -50, -17, -10, 28, -45, -32, 0, 7, -31, -31, 1, -16, -21, -11, -31, 7, -27, -9, -5, -25, 1};
    private static final int $$q = 226;
    private static final byte[] $$g = {34, TarConstants.LF_NORMAL, 18, 42, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$h = 201;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$u(short r5, short r6, byte r7) {
        /*
            byte[] r0 = kotlin.SampleQueueSharedSampleMetadata.$$s
            int r5 = r5 * 3
            int r1 = r5 + 1
            int r6 = r6 * 3
            int r6 = 104 - r6
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r0[r7]
        L26:
            int r4 = -r4
            int r6 = r6 + r4
            int r7 = r7 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SampleQueueSharedSampleMetadata.$$u(short, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0412 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0438  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object AudioAttributesCompatParcelizer(java.lang.Object[] r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SampleQueueSharedSampleMetadata.AudioAttributesCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) throws Throwable {
        int i;
        int i2;
        char c = 0;
        getSkipCount getskipcount = new getSkipCount((SampleQueueSharedSampleMetadata) objArr[0]);
        try {
            byte[] bArr = MediaBrowserCompatMediaItem;
            byte b = bArr[13];
            byte b2 = bArr[79];
            Object[] objArr2 = new Object[1];
            m(b, b2, (short) (b2 | 1009), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            short s = (short) 994;
            Object[] objArr3 = new Object[1];
            m(bArr[47], bArr[3], s, objArr3);
            String str = (String) objArr3[0];
            short s2 = (short) 988;
            Object[] objArr4 = new Object[1];
            m(bArr[13], bArr[82], s2, objArr4);
            Object[] objArr5 = new Object[1];
            m(bArr[13], bArr[82], s2, objArr5);
            char cIntValue = (char) (((Integer) cls.getMethod(str, Class.forName((String) objArr4[0]), Class.forName((String) objArr5[0]), Integer.TYPE, Integer.TYPE).invoke(null, "", "", 0, 0)).intValue() + 12568);
            byte b3 = bArr[13];
            byte b4 = bArr[79];
            Object[] objArr6 = new Object[1];
            m(b3, b4, (short) (b4 | 1009), objArr6);
            Class<?> cls2 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            m(bArr[47], bArr[3], s, objArr7);
            String str2 = (String) objArr7[0];
            Object[] objArr8 = new Object[1];
            m(bArr[13], bArr[82], s2, objArr8);
            int iIntValue = (-1) - ((Integer) cls2.getMethod(str2, Class.forName((String) objArr8[0]), Character.TYPE, Integer.TYPE).invoke(null, "", '0', 0)).intValue();
            char c2 = 262;
            byte b5 = bArr[262];
            byte b6 = bArr[79];
            Object[] objArr9 = new Object[1];
            m(b5, b6, (short) (b6 | 961), objArr9);
            Class<?> cls3 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            m(bArr[0], bArr[46], (short) 938, objArr10);
            Object[] objArr11 = new Object[1];
            n(cIntValue, iIntValue, 258 - (((Integer) cls3.getMethod((String) objArr10[0], null).invoke(null, null)).intValue() >> 16), objArr11);
            String str3 = (String) objArr11[0];
            Object[] objArr12 = new Object[1];
            m(bArr[13], bArr[79], (short) 920, objArr12);
            Class<?> cls4 = Class.forName((String) objArr12[0]);
            Object[] objArr13 = new Object[1];
            m(bArr[85], bArr[114], (short) 899, objArr13);
            char c3 = (char) (1 - (((Long) cls4.getMethod((String) objArr13[0], null).invoke(null, null)).longValue() > (-1L) ? 1 : (((Long) cls4.getMethod((String) objArr13[0], null).invoke(null, null)).longValue() == (-1L) ? 0 : -1)));
            Object[] objArr14 = new Object[1];
            m(bArr[327], bArr[79], (short) 877, objArr14);
            Class<?> cls5 = Class.forName((String) objArr14[0]);
            byte b7 = bArr[451];
            byte b8 = bArr[46];
            Object[] objArr15 = new Object[1];
            m(b7, b8, (short) (b8 | 833), objArr15);
            int i3 = (((Long) cls5.getMethod((String) objArr15[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).longValue() > 0L ? 1 : (((Long) cls5.getMethod((String) objArr15[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).longValue() == 0L ? 0 : -1)) + 259;
            Object[] objArr16 = {'0'};
            Object[] objArr17 = new Object[1];
            m(bArr[84], bArr[79], (short) 821, objArr17);
            Class<?> cls6 = Class.forName((String) objArr17[0]);
            m(bArr[79], bArr[46], (short) 793, new Object[1]);
            Object[] objArr18 = new Object[1];
            n(c3, i3, ((Character) cls6.getMethod((String) r14[0], Character.TYPE).invoke(null, objArr16)).charValue() - '/', objArr18);
            try {
                Object[] objArr19 = {(String) objArr18[0]};
                short s3 = (short) 785;
                Object[] objArr20 = new Object[1];
                m(bArr[4], bArr[82], s3, objArr20);
                Class<?> cls7 = Class.forName((String) objArr20[0]);
                Object[] objArr21 = new Object[1];
                m(bArr[51], bArr[472], (short) 770, objArr21);
                String str4 = (String) objArr21[0];
                Object[] objArr22 = new Object[1];
                m(bArr[4], bArr[82], s3, objArr22);
                Object[] objArr23 = (Object[]) cls7.getMethod(str4, Class.forName((String) objArr22[0])).invoke(str3, objArr19);
                int[] iArr = new int[objArr23.length];
                int i4 = 0;
                while (i4 < objArr23.length) {
                    try {
                        Object[] objArr24 = {objArr23[i4]};
                        byte[] bArr2 = MediaBrowserCompatMediaItem;
                        short s4 = (short) 766;
                        Object[] objArr25 = new Object[1];
                        m(bArr2[3], bArr2[82], s4, objArr25);
                        Class<?> cls8 = Class.forName((String) objArr25[c]);
                        Object[] objArr26 = new Object[1];
                        m(bArr2[47], bArr2[c2], (short) 750, objArr26);
                        String str5 = (String) objArr26[c];
                        Object[] objArr27 = new Object[1];
                        m(bArr2[4], bArr2[82], s3, objArr27);
                        Object objInvoke = cls8.getMethod(str5, Class.forName((String) objArr27[0])).invoke(null, objArr24);
                        try {
                            Object[] objArr28 = new Object[1];
                            m(bArr2[3], bArr2[82], s4, objArr28);
                            Class<?> cls9 = Class.forName((String) objArr28[0]);
                            Object[] objArr29 = new Object[1];
                            m(bArr2[25], bArr2[3], (short) 744, objArr29);
                            iArr[i4] = ((Integer) cls9.getMethod((String) objArr29[0], null).invoke(objInvoke, null)).intValue();
                            i4++;
                            c = 0;
                            c2 = 262;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    try {
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    switch (getskipcount.write(iArr[i5])) {
                        case -25:
                            i5 = 76;
                            break;
                        case -24:
                            getskipcount.write(41);
                            int i7 = getskipcount.AudioAttributesCompatParcelizer;
                            i6 = (i7 == 25 || i7 != 82) ? 8 : 31;
                            i5 = i6;
                            break;
                        case -23:
                            i5 = 71;
                            break;
                        case -22:
                            getskipcount.write(41);
                            if (getskipcount.AudioAttributesCompatParcelizer == 0) {
                                i6 = 59;
                                i5 = i6;
                            } else {
                                i5 = 1;
                            }
                            break;
                        case -21:
                            i5 = 72;
                            break;
                        case -20:
                            i5 = 74;
                            break;
                        case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                            getskipcount.write(35);
                            if (getskipcount.AudioAttributesCompatParcelizer == 0) {
                                i6 = 57;
                            }
                            i5 = i6;
                            break;
                        case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                            getskipcount.IconCompatParcelizer = 1;
                            getskipcount.write(2);
                            getskipcount.write(19);
                            MediaBrowserCompatSearchResultReceiver = getskipcount.AudioAttributesCompatParcelizer;
                            i5 = i6;
                            break;
                        case -17:
                            getskipcount.IconCompatParcelizer = AudioAttributesImplBaseParcelizer;
                            getskipcount.write(11);
                            i5 = i6;
                            break;
                        case -16:
                            getskipcount.IconCompatParcelizer = 1;
                            getskipcount.write(2);
                            getskipcount.write(3);
                            getskipcount.IconCompatParcelizer = getskipcount.read.hashCode();
                            getskipcount.write(11);
                            i5 = i6;
                            break;
                        case -15:
                            getskipcount.write(10);
                            throw ((Throwable) getskipcount.read);
                        case -14:
                            i5 = 77;
                            break;
                        case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                            i5 = 79;
                            break;
                        case -12:
                            getskipcount.write(21);
                            if (getskipcount.AudioAttributesCompatParcelizer == 0) {
                                i6 = 29;
                            }
                            i5 = i6;
                            break;
                        case -11:
                            getskipcount.IconCompatParcelizer = 1;
                            getskipcount.write(2);
                            getskipcount.write(19);
                            AudioAttributesImplBaseParcelizer = getskipcount.AudioAttributesCompatParcelizer;
                            i5 = i6;
                            break;
                        case -10:
                            getskipcount.IconCompatParcelizer = MediaBrowserCompatSearchResultReceiver;
                            getskipcount.write(11);
                            i5 = i6;
                            break;
                        case -9:
                            getskipcount.write(10);
                            return (String) getskipcount.read;
                        case -8:
                            i5 = 36;
                            break;
                        case -7:
                            i5 = 13;
                            break;
                        case -6:
                            i5 = 15;
                            break;
                        case -5:
                            getskipcount.IconCompatParcelizer = 2;
                            getskipcount.write(2);
                            getskipcount.write(3);
                            Object obj = getskipcount.read;
                            getskipcount.write(3);
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(obj, (String) getskipcount.read);
                            i5 = i6;
                            break;
                        case -4:
                            getskipcount.RemoteActionCompatParcelizer = "";
                            try {
                                getskipcount.write(4);
                                i5 = i6;
                            } catch (Throwable th4) {
                                th = th4;
                                byte[] bArr3 = MediaBrowserCompatMediaItem;
                                Object[] objArr30 = new Object[1];
                                m(bArr3[137], bArr3[82], (short) 737, objArr30);
                                if (!Class.forName((String) objArr30[0]).isInstance(th) || i5 < 2 || i5 >= 3) {
                                    short s5 = (short) 707;
                                    Object[] objArr31 = new Object[1];
                                    m(bArr3[759], bArr3[82], s5, objArr31);
                                    if (!Class.forName((String) objArr31[0]).isInstance(th) || i5 < 3 || i5 >= 7) {
                                        Object[] objArr32 = new Object[1];
                                        m(bArr3[759], bArr3[82], s5, objArr32);
                                        if (Class.forName((String) objArr32[0]).isInstance(th) && i5 >= 15) {
                                            if (i5 < 16) {
                                            }
                                            i5 = 82;
                                            getskipcount.RemoteActionCompatParcelizer = th;
                                            getskipcount.write(45);
                                        }
                                        Object[] objArr33 = new Object[1];
                                        m(bArr3[382], bArr3[82], (short) 680, objArr33);
                                        if (Class.forName((String) objArr33[0]).isInstance(th) && i5 >= 24) {
                                            if (i5 >= 25) {
                                            }
                                            i5 = 82;
                                            getskipcount.RemoteActionCompatParcelizer = th;
                                            getskipcount.write(45);
                                        }
                                        if (i5 < 32 || i5 >= 36) {
                                            Object[] objArr34 = new Object[1];
                                            m(bArr3[759], bArr3[82], s5, objArr34);
                                            if (!Class.forName((String) objArr34[0]).isInstance(th) || i5 < 36 || i5 >= 54) {
                                                if (i5 < 66 || i5 >= 71) {
                                                    Object[] objArr35 = new Object[1];
                                                    m(bArr3[137], bArr3[82], (short) 646, objArr35);
                                                    if (!Class.forName((String) objArr35[0]).isInstance(th) || i5 < 60 || i5 >= 61) {
                                                        Object[] objArr36 = new Object[1];
                                                        m(bArr3[30], bArr3[82], (short) 616, objArr36);
                                                        if (!Class.forName((String) objArr36[0]).isInstance(th) || i5 < 61 || i5 >= 66) {
                                                            throw th;
                                                        }
                                                        i5 = 82;
                                                        getskipcount.RemoteActionCompatParcelizer = th;
                                                        getskipcount.write(45);
                                                    } else {
                                                        i5 = 81;
                                                    }
                                                } else {
                                                    i = 58;
                                                }
                                            }
                                            i5 = 82;
                                            getskipcount.RemoteActionCompatParcelizer = th;
                                            getskipcount.write(45);
                                        } else {
                                            i = 30;
                                        }
                                        i5 = i;
                                    } else {
                                        i5 = 81;
                                    }
                                    getskipcount.RemoteActionCompatParcelizer = th;
                                    getskipcount.write(45);
                                }
                                i5 = 82;
                                getskipcount.RemoteActionCompatParcelizer = th;
                                getskipcount.write(45);
                            }
                            break;
                        case -3:
                            getskipcount.IconCompatParcelizer = 1;
                            getskipcount.write(2);
                            getskipcount.write(3);
                            getskipcount.RemoteActionCompatParcelizer = parseDuration.AudioAttributesCompatParcelizer((Context) getskipcount.read);
                            i2 = 4;
                            getskipcount.write(i2);
                            i5 = i6;
                            break;
                        case -2:
                            getskipcount.IconCompatParcelizer = 1;
                            getskipcount.write(2);
                            getskipcount.write(3);
                            getskipcount.RemoteActionCompatParcelizer = getskipcount.read;
                            i2 = 4;
                            getskipcount.write(i2);
                            i5 = i6;
                            break;
                        case -1:
                            i5 = 10;
                            break;
                        default:
                            i5 = i6;
                            break;
                    }
                }
                throw th;
            } catch (Throwable th5) {
                Throwable cause3 = th5.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th5;
            }
        } catch (Throwable th6) {
            Throwable cause4 = th6.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x03af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object MediaBrowserCompatCustomActionResultReceiver(java.lang.Object[] r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1170
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SampleQueueSharedSampleMetadata.MediaBrowserCompatCustomActionResultReceiver(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0813 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0897  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object RemoteActionCompatParcelizer(java.lang.Object[] r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SampleQueueSharedSampleMetadata.RemoteActionCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(int r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = 114 - r6
            int r0 = 44 - r7
            int r5 = r5 + 4
            byte[] r1 = kotlin.SampleQueueSharedSampleMetadata.$$g
            byte[] r0 = new byte[r0]
            int r7 = 43 - r7
            r2 = 0
            if (r1 != 0) goto L13
            r6 = r5
            r4 = r7
            r3 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L21:
            int r3 = r3 + 1
            r4 = r1[r5]
        L25:
            int r5 = r5 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-1)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SampleQueueSharedSampleMetadata.k(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void l(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 4
            int r0 = r6 + 5
            byte[] r1 = kotlin.SampleQueueSharedSampleMetadata.$$p
            int r7 = r7 + 82
            byte[] r0 = new byte[r0]
            int r6 = r6 + 4
            r2 = 0
            if (r1 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2b:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-14)
            int r8 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SampleQueueSharedSampleMetadata.l(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0874  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x098e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object read(java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SampleQueueSharedSampleMetadata.read(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ Object write(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~(i | i6 | i3);
        int i8 = ~i;
        int i9 = ~i6;
        int i10 = ~(i8 | i9);
        int i11 = ~i3;
        int i12 = (~(i8 | i11)) | i10 | (~(i9 | i11));
        int i13 = i11 | i10;
        int i14 = i + i6 + i2 + (105149790 * i5) + ((-719480883) * i4);
        int i15 = i14 * i14;
        int i16 = (i * (-424837635)) + 281018368 + ((-424837635) * i6) + (1798143484 * i7) + (i12 * (-1798143484)) + ((-1798143484) * i13) + (2071986176 * i2) + ((-654311424) * i5) + (1702887424 * i4) + ((-155189248) * i15);
        int i17 = (i * 910058005) + 1460508013 + (i6 * 910058005) + (i7 * (-484)) + (i12 * 484) + (i13 * 484) + (i2 * 910058489) + (i5 * (-759332242)) + (i4 * (-1121784475)) + (i15 * 1086324736);
        int i18 = i16 + (i17 * i17 * (-1925185536));
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? i18 != 5 ? write(objArr) : MediaBrowserCompatCustomActionResultReceiver(objArr) : read(objArr) : IconCompatParcelizer(objArr) : AudioAttributesCompatParcelizer(objArr) : RemoteActionCompatParcelizer(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0612  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object write(java.lang.Object[] r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SampleQueueSharedSampleMetadata.write(java.lang.Object[]):java.lang.Object");
    }

    public SampleQueueSharedSampleMetadata() throws Throwable {
        try {
            Object[] objArr = {this};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-578008752);
            this.AudioAttributesCompatParcelizer = (Binder) ((Constructor) (objRemoteActionCompatParcelizer == null ? startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), 8513 - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getPressedStateDuration() >> 16) + 54, -1547334203, false, null, new Class[]{SampleQueueSharedSampleMetadata.class}) : objRemoteActionCompatParcelizer)).newInstance(objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void i(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(IconCompatParcelizer ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        int i3 = $10 + 121;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i5 = $11 + 97;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i7 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(IconCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 12423 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 20 - (ViewConfiguration.getTapTimeout() >> 16), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.blue(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1867, 10 - ((Process.getThreadPriority(0) + 20) >> 6), 1983509525, false, $$u(b, b2, b2), new Class[]{Object.class, Object.class});
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

    private static void n(char c, int i, int i2, Object[] objArr) throws Throwable {
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i3 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(MediaDescriptionCompat[i + i3])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 1);
                    objRemoteActionCompatParcelizer = startForeground.read((char) (36621 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ViewConfiguration.getPressedStateDuration() >> 16) + 2340, KeyEvent.keyCodeFromString("") + 28, 480654850, false, $$u(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i3), Long.valueOf(MediaMetadataCompat), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 9701, 26 - Gravity.getAbsoluteGravity(0, 0), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i3] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) Color.argb(0, 0, 0, 0), TextUtils.indexOf("", "", 0, 0) + 23784, (ViewConfiguration.getPressedStateDuration() >> 16) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr5 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (Process.myPid() >> 22), ImageFormat.getBitsPerPixel(0) + 23785, View.combineMeasuredStates(0, 0) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    private static void j(char[] cArr, byte[] bArr, int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr2 = write;
        if (cArr2 != null) {
            int i3 = $11 + 107;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (Drawable.resolveOpacity(0, 0) + 44862), (-16758272) - Color.rgb(0, 0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 28, -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(RemoteActionCompatParcelizer)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) View.getDefaultSize(0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 19033, 76 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
        if (MediaBrowserCompatCustomActionResultReceiver) {
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            int i6 = $11 + 13;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 / 4;
            }
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                Object[] objArr4 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) ExpandableListView.getPackedPositionType(0L), 11439 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (AudioAttributesImplApi21Parcelizer) {
            notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
            char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                Object[] objArr5 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), ImageFormat.getBitsPerPixel(0) + 11440, Drawable.resolveOpacity(0, 0) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
        char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
        notifydownloads.IconCompatParcelizer = 0;
        while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
            int i8 = $10 + 35;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
            notifydownloads.IconCompatParcelizer++;
        }
        String str = new String(cArr6);
        int i10 = $10 + 3;
        $11 = i10 % 128;
        if (i10 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i11 = 98 / 0;
            objArr[0] = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x08be  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0902 A[Catch: all -> 0x09b4, TryCatch #10 {all -> 0x09b4, blocks: (B:141:0x08ee, B:143:0x0902, B:144:0x092c), top: B:276:0x08ee, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x093f A[Catch: all -> 0x09aa, TryCatch #5 {all -> 0x09aa, blocks: (B:145:0x0932, B:147:0x093f, B:148:0x09a2), top: B:268:0x0932, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0ae5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0b30  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0b7f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0dee  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0ece  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0f12  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0f67  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x11e9  */
    /* JADX WARN: Removed duplicated region for block: B:292:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.getReadIndex, com.marrow.bgservices.BaseService, android.app.Service, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SampleQueueSharedSampleMetadata.attachBaseContext(android.content.Context):void");
    }

    static {
        byte[] bArr = new byte[1041];
        System.arraycopy("\u0010M²\u000e\rö\u000eýúûÊFñ\u0013üº&\u0011\u0013üá\u001fõ\u0003\u0007\u0005ö\u0001\u0013×\u0017÷\u0015ëÍ>õ\rùÇ\u0015%ù\u0011á\u0012\f\u0004ð\tõ\u0002\rö\u000eýúûÊHóü\u0012·(\u0013ü\u0012Ì,ÿø\u0003þ\u000eýï\u0013õ\u0006ÿþ\u000f×\u001a\u0014Ù\u0013\u000bõü\u0013à\u0015\u0004ø\n\u0006ÿ\rö\u000eýúûÊA\u0004»%&ú\u0001ñ\bÖ)\u0003ô\b\u0012ý\u0000ó\t\u0006à\u0014\nóü\u0003ð\u0015\u0004øè\u001c\u0003\u0000ý\n\rö\u000eýúûÊIòû\u0003þ\u000fº\u00173øñ\röý\u0001\nùç\u001d\n\u0001â\u0013ü\u0012þ\u000fÜ\u0011\u0002\búÿì\u001f\u0004ö\u000bõ\u0006ÿØ)\u0003Ñ%\u0001\u0003ø\rö\u000eýúûÊFñ\u0013üº\u0013-ö\u000eýúûß%ù\u0011ï\u0002\u0011ñ\rþ\u000fÙ\u001c\t\u0000ý\u0003÷\u0015ëÍ>õ\rùÇ%!þ÷\u0005ùýüý\u000b÷\u0015ëÍ>õ\rùÇ\u001b%\u0006ñ\u0002þ\rë\u000b\tðê\u0017\u0005\u0006â\u000b\u000b\tð÷\u0015ëÍ>õ\rùÇ\u001b#\u0000ù\u0002ú\u000bç!í\u0013ñà3ë\u0002\u000b\u0004õ\u0006ÿ÷\u0015ëÍ>õ\rùÇ\u0015)õ\u0012\u0000Ð\u001e\u0012\u0001Ñ3ë\u0002\u000b\u0004õ\u0006ÿ÷\u0015ëÍ>õ\rùÇ\u001b%ö\u0001\u0013×&ÿÛ\u0017Ü-\u0006ùö\u000fÒ3ë\u0002\u000b\u0004õ\u0006ÿ÷\u0015ëÍ>õ\rùÇ 'øõ\u0003\rÔ)\u0003ûô\u0013Ñ3ë\u0002\u000b\u0004õ\u0006ÿ÷\u0015ëÍ>õ\rùÇ$#ù\u0006õ\u0004øà3ë\u0002\u000b\u0004õ\u0006ÿ\rö\u000eýúûÊHóü\u0012·(\u0013ü\u0012ó\u000eüý\nïî\u0016\u0011ë÷\u0015ëÍ>õ\rùÇDó\u0001\u0006ùþ\u0011º\u001f\u0018\u000fô\u0007õ\u0005\bùüú÷\u0015ëÍ>õ\rùÇ!\u0013\bûþ\u0011ñ\u001e÷\u0015ëÍ>õ\rùÇ!\u0013\bûþ\u0011Çù\tù\rô\u0007õ\u000f\u0003òÿî\u0013ü\u000b\bõ\u0004øé\u0013\r\u0001\u0004\rö\u000eýúûÊ9\u000bï\u000fø\u0001ú\u0010»\u0015,ý\u0003\u0003\u000b\u0004øù\rö\u000eýúûÊ5\fÿ\u0006ñ\t\u0006ºBýÁ\u0013/\u0000üýúþ\u0013õ\u0006ÿÛ%ø\tí\u0011õþ\u000fß\u0011\u0007ë\u000f\r\u0001ö\u0006ÿ\rö\u000eýúûÊ5\fÿ\u0006ñ\t\u0006ºDó\u000e»$\u0013\u000eü\u0006ýñ\u0002\u000eþ\u000fß!þ÷\u0005ù\u0002í\u0011\u0001þ÷\u0005ù÷\u0015ëÍ>õ\rùÇ\u00173ë\u0002\u000b\u0004õ\u0006ÿ÷\u0015ëÍ>õ\rùÇ '÷\u0000ä\u001fú\u0005\u0006ñ\rÓ3ë\u0002\u000b\u0004õ\u0006ÿ÷\u0015ëÍ>õ\rùÇ\u00131\u0000ï\u0018Ú!û\u0003óà3ë\u0002\u000b\u0004õ\u0006ÿþ\u000fÕ%\u0006ñ\u0002þ\r\rö\u000eýúûÊA\u0004»\"\"ýô\u0002\u000e\u0000\f×\u0019ûþ\u000fÖ+ø\u0003ä\r\u000fä\u0015\u0004ø\n\u0006ÿþ\u000fà\u001e÷\u0004\u0000øÿè\u0019\tù\rô\n\tð\rö\u000eýúûÊGÿõ\u0003Â&%÷õÿò\u000b\u000b\tð\fþ\u0003üù\u0013Ü\u001b×,ï\u0002\u0011õ\u0006ÿ\fÿõþ\u0013÷\u0015ëÍ>õ\rùÇ'\u0019\u0005\u0002û\u0000ÿ\u0003\u0002ñÿë!õ\rï\u0013õ\u0006ÿ×3ë\u0002\u000b\u0004õ\u0006ÿ÷\u0015ëÍ>õ\rùÇ\u001b#\u0000ù\u0002ú\u000bÕ1õ\u000eøø\t\u0006Ñ3ë\u0002\u000b\u0004õ\u0006ÿóÿþ\u000fÜ\u0011\u0002\búÿì\u001f\u0004ö\u000bõ\u0006ÿÕ%\u0001\u0003øþ\u000fÜ\u0011\u0002\búÿì\u001f\u0004ö\u000bõ\u0006ÿæ%÷õþ\u000fà\u001b\u0006î\u0005ë\u0019\u0003\u0001þ\u000fÒ\u001b\u0003\u0005\u0005ùÞ\u001f\u0003þç\u0019\tù\rô\rö\u000eýúûÊ?øÿ\u0005øÍ\u00134ï\u0005\u0006å\u001eï\u0002\bþ\u000fÙ\u001c\u0005è\u0019ý\tøø\fÛ\u0015û\rö\u000eýúûÊ9\u000bï\u000fø\u0001ú\u0010»\"\u001fú\u0005\u0006Ò".getBytes(CharsetNames.ISO_8859_1), 0, bArr, 0, 1041);
        MediaBrowserCompatMediaItem = bArr;
        RatingCompat = 191;
        AudioAttributesCompatParcelizer();
        AudioAttributesImplBaseParcelizer = 0;
        MediaBrowserCompatSearchResultReceiver = 1;
        AudioAttributesImplApi26Parcelizer = 0;
        MediaBrowserCompatItemReceiver = 1;
        read();
        try {
            Object[] objArr = {null};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1773808335);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (49996 - TextUtils.getOffsetAfter("", 0)), (ViewConfiguration.getScrollBarSize() >> 8) + 8475, 'V' - AndroidCharacter.getMirror('0'), -401862236, false, null, new Class[]{MagicModuleRepositoryImplExternalSyntheticLambda0.class});
            }
            read = ((Constructor) objRemoteActionCompatParcelizer).newInstance(objArr);
            int i = MediaBrowserCompatItemReceiver + 5;
            AudioAttributesImplApi26Parcelizer = i % 128;
            int i2 = i % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // kotlin.getLargestReadTimestampUs$write
    public final String write() {
        int iRemoteActionCompatParcelizer = zba.RemoteActionCompatParcelizer();
        return (String) write(-2077161895, zba.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, new Object[]{this}, zba.RemoteActionCompatParcelizer(), zba.RemoteActionCompatParcelizer(), 2077161898);
    }

    @Override // com.marrow.bgservices.BaseService, android.app.Service
    public final IBinder onBind(Intent p0) {
        Object[] objArr = {this, p0};
        return (IBinder) write(-1220917778, zba.RemoteActionCompatParcelizer(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 1298691711, objArr, zba.RemoteActionCompatParcelizer(), setTabTextColors.RemoteActionCompatParcelizer(), 1220917778);
    }

    @Override // kotlin.getReadIndex, com.marrow.bgservices.BaseService, android.app.Service
    public final void onCreate() {
        int iRemoteActionCompatParcelizer = setTabTextColors.RemoteActionCompatParcelizer();
        write(-39068841, setTabTextColors.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, new Object[]{this}, zba.RemoteActionCompatParcelizer(), setTabTextColors.RemoteActionCompatParcelizer(), 39068842);
    }

    public final void IconCompatParcelizer(int p0, String p1, String p2) {
        Object[] objArr = {this, Integer.valueOf(p0), p1, p2};
        int iRemoteActionCompatParcelizer = zba.RemoteActionCompatParcelizer();
        write(-1911278760, zba.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, objArr, zba.RemoteActionCompatParcelizer(), zba.RemoteActionCompatParcelizer(), 1911278764);
    }

    @Override // kotlin.getLargestReadTimestampUs$write
    public final void IconCompatParcelizer() {
        int iRemoteActionCompatParcelizer = zba.RemoteActionCompatParcelizer();
        write(1659663202, zba.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, new Object[]{this}, zba.RemoteActionCompatParcelizer(), zba.RemoteActionCompatParcelizer(), -1659663197);
    }

    @Override // kotlin.getLargestReadTimestampUs$write
    public final void AudioAttributesCompatParcelizer(String p0, String p1) {
        int iRemoteActionCompatParcelizer = zba.RemoteActionCompatParcelizer();
        write(701582373, zba.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, new Object[]{this, p0, p1}, zba.RemoteActionCompatParcelizer(), zba.RemoteActionCompatParcelizer(), -701582371);
    }

    static void read() {
        IconCompatParcelizer = -4250796697651971820L;
        write = new char[]{28447, 28435, 28535, 28419, 28422, 28424, 28507, 28427, 28504, 28425, 28498, 28503, 28505, 28499, 28423, 28500, 28502, 28501, 28420, 28506, 28418, 28438, 28442, 28441, 28496, 28509, 28446, 28440, 28445, 28439, 28444, 28508, 28421, 28443, 28436, 28416, 28537, 28514, 28521, 28417};
        RemoteActionCompatParcelizer = 411398058;
        AudioAttributesImplApi21Parcelizer = true;
        MediaBrowserCompatCustomActionResultReceiver = true;
    }

    static void AudioAttributesCompatParcelizer() {
        char[] cArr = new char[1791];
        ByteBuffer.wrap("í9y\u000eÅnQ¤½\u0094\tî\u0094$à\u0015LaØ¤$\u0096°ø\u001f<k\u0016÷zC½¯\u0089;ú\u0086>\u0012\b~~Ê¿V\u0090¢å\t1\u0095\u0010áfMªÙ\u008c%ó°2\u001c\fhLô³@\u009b¬Ù;5\u0087\u001a\u0013Z\u007f´Ë\u009dWÇ¢6\u000e\u001c\u009aBæ·r\u009fÞÂ%(±\u001e\u001dFi©õ\u0090Aß¬78\u001c\u0084P\u0010¶|\u009cÈÑW1£\u001c\u000fR\u009b°çìsÓÞ/*d¶I\u0002¯näúÉA \u00ade9H\u0085¡\u0011ý}ÊÈ<T} I\f¾\u0098áäÉs%ßb+R·¥\u0003ñoÖú?FqÒV>§\u008aì\u0016Ò}\u0018ÉrUS¡\u0083\rô\u0099Ûä\u001aptÜ[(\u009b´÷\u0000Üo\u0007ûwG\\Ó\u0085?è\u008bÝ\u0016\u0007biÎZZ\u0085¦ê2Û\u0099\u000båkq[Ý\u008b)ìµÙ\u0000\u0006lmø¦D\u008aÐî?'\u008b\u0001\u0017oc§Ï\u008a[à¦$2\n\u009eaê£v\u008aÂâ)\"µ\u0016\u0001cm¡ù\u0096EäÐ <\u0012\u0088e\u0014®`\u0095Ìæ[0§\u00113s\u009f²ë\u0093wÄÂ3.\u0010ºG\u0006´\u0092\u008eþÇE Ñ\u0000=Z\u0089¨\u0015\u009daÜÌ6X\u001c¤@0¨\u009c\u0082èÃw0Ã\u0004/B»ª\u0007\u0084\u0093Îþ+J\u0007ÖN\"¬\u008e\u0098\u001aÈa-ÍgYH¥®1ø\u009dÌè/t{ÀL, ¸ä\u0004Â\u0093!ÿcKB×¢#å\u008fÔ\u001a#fjòI^¥ªå6Ê\u009d$énuUÁ¦-ì¹Ö\u0004'\u0090süSH\u0087Ôó Ö\u008f\u0007\u001btgNó\u0084_ê«À6\u001a\u0082hîYz\u009cÆïRÝ¹\u001d\u0005i\u0091]ý\u0087IéÕÜ \u0007\u008cj\u0018Dd\u008eðò\\Æ«\u00107q\u0083^ï\u0092{ìÆ%R\nÜ Ü!H\u0016ôv`»\u008c\u008c8ö¥<Ñ\r}yé¼\u0015\u008e\u0081ä.$Z\u000eÆbr¥\u009e\u0091\nâ·&#\u0010Ofû§g\u0089\u0093ý8<¤\u0013Ð\u007f|²è\u0094\u0014ê\u0081*-\u0014YTÅ«q\u0097\u009dÔ\n,¶\u000f\"XN\u00adú\u0086fÚ\u0093.?\u0001«_×¯C\u0084ïÐ\u00140\u0080\u0006,YX±Ä\u0083pÛ\u009d2\t\u0002µU!³M\u0081ù×f4\u0092\u0002>RªµÖôBËï.\u001bu\u0087L3¯_÷ËÍp&\u009cz\bN´  øLÏù#ex\u0091P=¢©øÕÑB#îx\u001aR\u0086¢2ð^ÓË wwãT\u000f¾»÷'ÉL\u0000øudJ\u0090\u0081<ò¨ÉÕ\u0002AlíE\u0019\u009e\u0085î1Ø^\u0019ÊqvZâ\u0084\u000eíºÄ'\u0006SpÿAk\u009f\u0097ò\u0003Ç¨\bÔr@@ì\u0089\u0018õ\u0084À1\n]hÉ u\u008aáî\u000e!º\r&nR¢þ\u0093jç\u0097#\u0003\u000f¯dÛ½G\u008fóî\u0018%\u0084\u00110a\\¦È\u0090táá=\r\u0012¹d%·Q\u0093ýÿj4\u0096\u000f\u0002\u007f®³Ú\u008dFÀó*\u001f\u000b\u008bZ7¬£\u0096Ïßt5à\u0018\fB¸³$\u0081Á\u008cU»éÛ}\u0011\u0091!%[¸\u0091Ì `Èô\u000e\b\"\u009cK3\u0089G£ÛÏo\b\u0083<\u0017Oª\u008b>½RËæ\nz$\u008eP%\u0091¹¾ÍÒa\u001fõ9\tG\u009c\u00870¹DùØ\u0006l:\u0080y\u0017\u0081«£?öS\u0000ç,{t\u008e\u0083\"ª¶ýÊ\u0002^*òw\t\u009d\u009d©1ôE\u001cÙ(mq\u0080\u009f\u0014©¨ñ<\u001eP-äz{\u0099\u008f³#ú·\u0004ËM_xò\u0087\u0006Ì\u009aÿ.\u0004BOÖam\u0088\u0081Ó\u0015ã©\u0015=TQ|ä\u0097xÉ\u008cà \t´KÈ}_\u008cóÒ\u0007ÿ\u009b\u0005/ECgÖ\u0086jÄþí\u0012\u0012¦F:lQ\u00adåÇyæ\u008d5!Aµ`È³\\Àðë\u00047\u0098C,iC°×Âkíÿ5\u0013]§l:µNÜâëv5\u008a_\u001enµ°ÉÞ]îñ;\u0005Y\u0099o,¸@ØÔ\u0017h>ü[\u0013\u0091§»;ÚO\u0015ã9wU\u008a\u0094\u001e¹²ÔÆ\u0013Z9îW\u0005\u0097\u0099¢-ÖA\u0011Õ(iQü\u0097\u0010«¤Ð8\u0004L#àIw\u0084\u008b§\u001fÎ³\u0007Ç&[sî\u0086\u0002º\u0096ñ*\u001a¾:Òni\u009dý¡\u0011î¥\u00029)M|à\u0082t¶\u0088õ\u001c\b°6Äj[\u0082ï\u00ad\u0003ê\u0097\u0002+*¿eÒ\u009ff\u00adúù\u000e\u0019¢*6yM\u0098áÌuø\u0089\u0006\u001dL±`Ä\u0087X×ìà\u0000\u0014\u0094S({Ü!H\u0016ôv`»\u008c\u00998÷¥#Ñ\u0013}xé¢\u0015\u0091\u0081ù.?Z\u0013Æzr¤\u009e\u008e\nû·'#\u000eO|û¦g\u008a\u0093ý8)¤\nÐ~|¨è\u008e\u0014ÿ\u00811-\bY@Åªq\u008d\u009dÁ\n-¶\u0003\"BN¬ú\u008dfÃ\u0093/?\u0004«X×¯C\u0081ïØ\u00140\u0080\u001a,[X¬Ä\u009cpÆ\u009d/\t\u0003µH!²M\u0083ùÖf4\u0092\u0004>UªµÖáBÖï.\u001ba\u0087M3ª_ûËÍp9\u009c~\bT´¹ åLÒù!ee\u0091M=»©çÕÌB(îg\u001aS\u0086 2ý^ÓË$w|ãT\u000f¤»ö'ÕL\u0001øudJ\u0090\u0081<í¨ÉÕ\u001fAmíE\u0019\u0083\u0085ï1Ä^\u0010Êov[â\u009b\u000eîºÛ'\u001eSoÿ\\k\u009f\u0097ì\u0003Ý¨\u0013Ôk@^ì\u0097\u0018ë\u0084ß1\u000b]kÉ¿u\u008bá÷\u000e?º\u0014&wR¼þ\u0091jø\u00978\u0003\u0017¯yÛ°G\u008fóû\u0018;\u0084\t0{\\³È\u0091týá9\r\b¹}%½Q\u0093ýÿj7\u0096\u000e\u0002\u007f®¿Ú\u0095FÁó5\u001f\f\u008bA7\u00ad£\u0089ÏÙt-à\u0003\fY¸®$\u0080PÐý/i\u0004\u0095[\u0001°\u00ad\u009aÙØF%ò\u001c\u001e\\\u008a«6\u009d¢ÉÏ-{\u000bçI\u0013µ¿\u0080+ÖP5üahT\u0094«\u0000á¬ÍÙ(E|ñM\u001d¹\u0089ú5Î¢8Î~zOæ¡\u0012ø¾Ð+:W}ÃQo½\u009bó\u0007Ò¬<Ø}DSð¥\u001cò\u0088Ô5 ¡\u007fÍUy\u009båÿ\u0011Ö¾\u0000*qVKÂ\u0082nì\u009aÆ\u0007\u0018³nßBK\u0091÷ïcÄ\u0088\u001c4p OÌ\u009axñäÈ\u0011\u0007½o)DU\u0088ÁîmÆ\u009a\t\u0006`²BÞ\u008aJá÷>c\u000b\u008fb;¾§\u008cÓãx:ä\r\u0010g¼»(\u008eTçÁ:m\u000f\u0099{\u0005»±\u0084ÝûJ=ö\bb|\u008e¦:\u008d¦âÓ(\u007f\u0012ëa\u0017±\u0083\u0094/þT5À\fl@\u0098ª\u0004\u0089°ßÝ,I\u0002õBa³\u008d\u00879Ã¦/Ò\u0006~^ê¯\u0016\u008e\u0082Å/1[\u0005Ç\\s±\u009f\u009d\u000bÙ°)Ü\u001dH\\ôª`\u009e\u008cÝ9,¥\u001fÑS}®éà\u0015Ò\u0082\".aZRÆ©râ\u009eÌ\u000b&·w#NO§ûøgÏ\u008c$8{¤PÐº|ùèÊ\u0015<\u0081f-MY©ÅèqÒ\u009e!\n|¶T\"¾NõúËg\u0000\u0093~?V«\u0095×öC×è\u0016\u0014m\u0080Y,\u009dXôÄÙq\u0005\u009dq\tAµ\u0085!äMÀú\u0006fo\u0092I>\u0087ªìÖÄC\bïg\u001bJ\u0087\u00893à_ÊÄ\npa\u009c \b\u009e´ê!!M\u0018ùce¢\u0091\u0090=áª#Ö\u001bBdî¤\u001a\u0090\u0086å3%_\rËaw¦ã\u0084\u000fâ´' \u0007Lbø¨d\u0086\u0090æ=)©\rÕdAªí\u008c\u0019Ô\u0086+2\b^_Ê¬v\u0096âÜ\u000f9»\u0018']S²ÿ\u0099kÚ\u00901<\u001a¨DÔ¨@\u0087ìÆ\u00190\u0085\u00041Z]²É\u009cuÐâ-\u000e\u001eºH&¬R\u0081þÊk4\u0097~\u0003P¯¶ÛôGÕì7\u0018w\u0084W0¸\\þÈÖu9áq\rT¹º%ðQÄþ;js\u0096D\u0002¼®óÚÊG=óu\u001fG\u008b¾7è£ÊÈ+tjàN\f\u0099¸ë$×Q\u0019ýsiW\u0095\u0083\u0001õ\u00adÀÚ\u0003FoòA\u001e\u009d\u008aï6Û£\u001dÏi{[ç\u0087\u0013é¿Æ$\u0007PoüAh\u0094\u0094ó\u0000À\u00ad\u0010ÙtEJñ\u0094\u001dõ\u008a=6\u0017¢kÎ¡z\u0091æî\u0013\"¿\u0010+dW½Ã\u008eoí\u00940\u0000\u000f¬gØ¹D\u008fðû\u001d;\u0089\t5|¡²Í\u0089yýæ6\u0012\n¾~*½V\u0080Âÿo7\u009b\n\u0007@³¿ß\u0096KÜð5\u001c\u0017\u0088_4± \u0080ÌÃy7å\u0002\u0011D½º)\u0084UÅÂ$n\u000f\u009aF\u0006¤²\u0080ÞÇK&÷\u001dcU\u008f¯;\u0087§ÉÌ+x\u0007äJ\u0010«¼þ(ËU7ÁymW\u0099·\u0005ù±ÔÞ8JböVb\u00ad\u008eä:Î§\"Óp\u007fPëº\u0017ÿ\u0083Í(<TfÀMl£\u0098è\u0004É±+ÝiIUõ¡aê\u008dÔ:\u001f¦kÒM~\u009dêì\u0016Ö\u0083\u001c/m[YÇ\u009csî\u009fÇ\u0004\u001b°oÜ[H\u009aôê`Û\u008d\u00129q¥]Ñ\u009f}òéÜ\u0016\u0011\u0082n.^Z\u0091Æêrß\u009f\u000b\u000bl·¾#\u008bOëô;`\f\u008cv8»¤\u0093Ðø}\"é\u0017\u0015f\u0081¤-\u0090YïÆ%r\u0011\u009eb\n¾¶\u0091\"áO;û\bg}\u0093©?\u008a«æÐ)|\u0015èf\u0014³\u0080\u0095,ÝY7Å\rqA\u009d\u00ad\t\u008eµØ\"-N\u0005ú_fº\u0092\u0099>Å«6×\u0000CEï±\u001b\u0082\u0087Ý,1X\u0007Ä\\p²\u009c\u009c\bÑµ'!\u001eMTù¨e\u008a\u0091Ê>4ªyÖ_B¶îà\u001aÕ\u0087\"3b_PË¥wÿãÎ\b8´~ SLºøødÍ\u0091&=f©PÕ¦AûíÒ\u001a<\u0086w2M^¾ÊèvËã!fàò×N·Ú}6M\u00827\u001fýkÌÇ¸S}¯O;&\u0094ùàÎ|¥Èx$Q°'\rú\u0099Îõ½AgÝK)<\u0082ü\u001eÒj¾ÆqRU®?;ñ\u0097Ôã\u009c\u007fwËH'\u0000°ø\fÈ\u0098\u0083ôq@DÜ\u001a)ï\u0085Æ\u0011\u0090mnùEU\u001d®ñ:Ç\u0096\u009eâp~IÊ\u0012'ó³Á\u000f\u0094\u009bk÷_C\u0015Üè(Ä\u0084\u008b\u0010`l!ø\u001fUé¡ =\u0093\u0089oå#q\u0011Êæ&¢²\u0092\u000e`\u009a%ö\u001aCûß¹+\u0088\u0087z\u0013:o\nøýT» \u0088<|\u00884ä\bqÿÍ½Y\u008bµ~\u0001>\u009d\u000böÁB·Þ\u008a*[\u0086-\u0012\u000boÞû¸W\u0099£\\?1\u008b\u0018äÄpµÌ\u009bXZ´-\u0000\u001a\u009dÙé®E\u009dÑG-'¹\u001c\u0012Èn§ú\u009fVI¢(>\u0002\u008bËçµs|ÏV[7´á\u0000×\u009c¶è~DQÐ,-â¹Ò\u0015¥aqýNI%¢ú>Ñ\u008a»æ|rPÎ&[ÿ·Ó\u0003½\u009ftëOG?Ðé,È¸ \u0014k`Uü\u001cIõ¥×1\u0081\u008dp\u0019Iu\u0003ÎíZÄ¶\u009a\u0002o\u009eYê\u0018Gö×*C\u001dÿ}k·\u0087\u00873ý®7Ú\u0006vnâ¶\u001e\u0099\u008aò%.Q\u001bÍqy³\u0095\u0085\u0001í¼-(\u001bDoð¬l\u0084\u0098è3=¯\u0018Ûtw»ã\u009f\u001fî\u008a!&\u001fRQÎ z\u0089\u0096Ê\u0001&½\u0007)IE¸ñ\u008fmÈ\u0098;4\u000e OÜ¹H\u008cäÐ\u001f;\u008b\u0011'YSºÏ\u0082{Ì\u00968\u0002\u0003¾C*¹F\u0088òÞm?\u0099\t5_¡¡ÝëIÝä#\u0010r\u008cG8¡TõÀÛ{3\u0097u\u0003[¿«+ïGÙò)nn\u009aN6«¢íÞÄI.ål\u0011G\u008d¬9ãUÌÀ5|\u007fèF\u0004´°ü,ÀG\u0011ó`o@\u009b\u00957ç£ÉÞ\u0015JfæN\u0012\u0096\u008eþ:ÒU\u0010Á{}Qé\u0097\u0005à±Ð,\u0010XdôC`\u008c\u009cø\bË£\u001eßxKKç\u009e\u0013ÿ\u008fÊ:\u001fV~Âª~\u009dêã\u0005*±\u0006-aY¶õ\u0086aò\u009c5\b\u001d¤rÐ®L\u0099øé\u0013.\u008f\u001a;mW±Ã\u009a\u007fêê2\u0006\f²v.ºZ\u0083öõa;\u009d\u000b\tt¥¿Ñ\u0080MËø!\u0014\u0000\u0080W<§¨\u0082ÄÕ\u007f&ë\r\u0007V³¥/\u0093[Òö=b\u0011\u009eO\n¦¦\u008aÒÍM;ù\n\u0015W\u0081¹=\u0097©ÞÄ,p\u0015ì_\u0018¿´\u0095 ß[>÷vc^\u009f¡\u000bê§ÆÒ#Niú[\u0016\u00ad\u0082õ>Å©3ÅwqDí®\u0019õµÛ +\\qÈZd©\u0090ó\fÙ§7Ó~OMûµ\u0017ö\u0083ß>5ªxÆ^r\u008aîþ\u001aÁµ\n!z]FÉ\u0089eç\u0091Í\f\u0015¸eÔJ@\u0091üähÐ\u0083\u0010?f«PÇ\u008csçïÃ\u001a\f¶x\"K^\u0097".getBytes(CharsetNames.ISO_8859_1)).asCharBuffer().get(cArr, 0, 1791);
        MediaDescriptionCompat = cArr;
        MediaMetadataCompat = -6353577093855754201L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m(int r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 91
            int r0 = r5 + 3
            byte[] r1 = kotlin.SampleQueueSharedSampleMetadata.MediaBrowserCompatMediaItem
            int r7 = 1019 - r7
            byte[] r0 = new byte[r0]
            int r5 = r5 + 2
            r2 = 0
            if (r1 != 0) goto L12
            r4 = r5
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L20:
            r4 = r1[r7]
            int r3 = r3 + 1
        L24:
            int r6 = r6 + r4
            int r7 = r7 + 1
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SampleQueueSharedSampleMetadata.m(int, byte, int, java.lang.Object[]):void");
    }
}
