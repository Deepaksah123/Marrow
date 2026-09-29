package kotlin;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.play.core.integrity.model.IntegrityErrorCode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import kotlin.Metadata;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003"}, d2 = {"Lo/parseMpegChannelConfiguration;", "", "<init>", "()V", "", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class parseMpegChannelConfiguration {
    private static final byte[] $$a = {64, -102, 72, -66};
    private static final int $$b = 4;
    private static int AudioAttributesCompatParcelizer;
    private static long AudioAttributesImplApi26Parcelizer;
    private static final byte[] AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final int MediaBrowserCompatItemReceiver;
    private static char[] RemoteActionCompatParcelizer;
    private static volatile Enum read;
    private static int write;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r6, byte r7, int r8) {
        /*
            int r6 = r6 * 4
            int r6 = 1 - r6
            byte[] r0 = kotlin.parseMpegChannelConfiguration.$$a
            int r8 = r8 * 4
            int r8 = 101 - r8
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r7]
        L27:
            int r7 = r7 + 1
            int r8 = r8 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseMpegChannelConfiguration.$$c(int, byte, int):java.lang.String");
    }

    public static final /* synthetic */ void AudioAttributesCompatParcelizer$26433acb(Enum r18) throws Throwable {
        int i;
        buildRangedUri buildrangeduri = new buildRangedUri(r18);
        try {
            byte[] bArr = AudioAttributesImplBaseParcelizer;
            byte b = bArr[53];
            byte b2 = bArr[29];
            Object[] objArr = new Object[1];
            a(b, b2, (short) (b2 | 297), objArr);
            int i2 = 0;
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(bArr[56], bArr[105], (short) 317, objArr2);
            int iIntValue = 91 - ((byte) ((Integer) cls.getMethod((String) objArr2[0], null).invoke(null, null)).intValue());
            byte b3 = bArr[56];
            byte b4 = bArr[29];
            Object[] objArr3 = new Object[1];
            a(b3, b4, (short) (b4 | 151), objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[39], bArr[105], (short) 340, objArr4);
            int i3 = 92 - (((Float) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).floatValue() > BitmapDescriptorFactory.HUE_RED ? 1 : (((Float) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).floatValue() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            Object[] objArr5 = {"", 0};
            Object[] objArr6 = new Object[1];
            a(bArr[103], bArr[29], bArr[98], objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            byte b5 = bArr[52];
            byte b6 = bArr[105];
            Object[] objArr7 = new Object[1];
            a(b5, b6, (short) (b6 | 345), objArr7);
            String str = (String) objArr7[0];
            Object[] objArr8 = new Object[1];
            a(bArr[103], bArr[56], bArr[246], objArr8);
            Object[] objArr9 = new Object[1];
            b(iIntValue, i3, (char) (24701 - ((Integer) cls3.getMethod(str, Class.forName((String) objArr8[0]), Integer.TYPE).invoke(null, objArr5)).intValue()), objArr9);
            String str2 = (String) objArr9[0];
            byte b7 = bArr[103];
            byte b8 = bArr[29];
            Object[] objArr10 = new Object[1];
            a(b7, b8, (short) (b8 | 365), objArr10);
            Class<?> cls4 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            a(bArr[39], bArr[316], (short) 386, objArr11);
            int i4 = (((Long) cls4.getMethod((String) objArr11[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls4.getMethod((String) objArr11[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1));
            byte b9 = bArr[23];
            byte b10 = bArr[29];
            Object[] objArr12 = new Object[1];
            a(b9, b10, (short) (b10 | 107), objArr12);
            Class<?> cls5 = Class.forName((String) objArr12[0]);
            Object[] objArr13 = new Object[1];
            a(bArr[81], bArr[105], (short) 397, objArr13);
            int iIntValue2 = 90 - (((Integer) cls5.getMethod((String) objArr13[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr14 = {"", '0'};
            Object[] objArr15 = new Object[1];
            a(bArr[103], bArr[29], bArr[98], objArr15);
            Class<?> cls6 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a(bArr[153], bArr[103], (short) 419, objArr16);
            String str3 = (String) objArr16[0];
            Object[] objArr17 = new Object[1];
            a(bArr[103], bArr[56], bArr[246], objArr17);
            Object[] objArr18 = new Object[1];
            b(i4, iIntValue2, (char) (23132 - ((Integer) cls6.getMethod(str3, Class.forName((String) objArr17[0]), Character.TYPE).invoke(null, objArr14)).intValue()), objArr18);
            Object[] objArr19 = {(String) objArr18[0]};
            char c = 17;
            short s = (short) 231;
            Object[] objArr20 = new Object[1];
            a(bArr[17], bArr[56], s, objArr20);
            Class<?> cls7 = Class.forName((String) objArr20[0]);
            byte b11 = bArr[182];
            byte b12 = bArr[52];
            Object[] objArr21 = new Object[1];
            a(b11, b12, (short) (b12 | 228), objArr21);
            String str4 = (String) objArr21[0];
            Object[] objArr22 = new Object[1];
            a(bArr[17], bArr[56], s, objArr22);
            Object[] objArr23 = (Object[]) cls7.getMethod(str4, Class.forName((String) objArr22[0])).invoke(str2, objArr19);
            int[] iArr = new int[objArr23.length];
            int i5 = 0;
            while (i5 < objArr23.length) {
                Object[] objArr24 = {objArr23[i5]};
                byte[] bArr2 = AudioAttributesImplBaseParcelizer;
                short s2 = (short) 250;
                Object[] objArr25 = new Object[1];
                a(bArr2[144], bArr2[56], s2, objArr25);
                Class<?> cls8 = Class.forName((String) objArr25[0]);
                Object[] objArr26 = new Object[1];
                a(bArr2[315], bArr2[39], (short) 266, objArr26);
                String str5 = (String) objArr26[0];
                Object[] objArr27 = new Object[1];
                a(bArr2[c], bArr2[56], s, objArr27);
                Object objInvoke = cls8.getMethod(str5, Class.forName((String) objArr27[0])).invoke(null, objArr24);
                Object[] objArr28 = new Object[1];
                a(bArr2[144], bArr2[56], s2, objArr28);
                Class<?> cls9 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                a(bArr2[185], bArr2[96], (short) 272, objArr29);
                iArr[i5] = ((Integer) cls9.getMethod((String) objArr29[0], null).invoke(objInvoke, null)).intValue();
                i5++;
                c = 17;
            }
            while (true) {
                int i6 = i2 + 1;
                try {
                } catch (Throwable th) {
                    th = th;
                }
                switch (buildrangeduri.read(iArr[i2])) {
                    case -14:
                        i2 = 25;
                        break;
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        try {
                            buildrangeduri.read(16);
                            i = buildrangeduri.RemoteActionCompatParcelizer;
                        } catch (Throwable th2) {
                            th = th2;
                            if (i2 < 21 || i2 >= 25) {
                                throw th;
                            }
                            buildrangeduri.IconCompatParcelizer = th;
                            buildrangeduri.read(19);
                            i2 = 18;
                        }
                        i2 = (i != 0 && i == 1) ? 1 : 19;
                        break;
                    case -12:
                        buildrangeduri.read = 1;
                        buildrangeduri.read(10);
                        buildrangeduri.read(14);
                        buildrangeduri.read = buildrangeduri.write.hashCode();
                        buildrangeduri.read(6);
                        break;
                    case -11:
                        buildrangeduri.read(4);
                        throw ((Throwable) buildrangeduri.write);
                    case -10:
                        i2 = 26;
                        break;
                    case -9:
                        i2 = 28;
                        break;
                    case -8:
                        buildrangeduri.read(25);
                        i2 = buildrangeduri.RemoteActionCompatParcelizer != 0 ? i6 : 17;
                        break;
                    case -7:
                        buildrangeduri.read = 1;
                        buildrangeduri.read(10);
                        buildrangeduri.read(11);
                        write = buildrangeduri.RemoteActionCompatParcelizer;
                        break;
                    case -6:
                        buildrangeduri.read = AudioAttributesCompatParcelizer;
                        buildrangeduri.read(6);
                        break;
                    case -5:
                        return;
                    case -4:
                        i2 = 9;
                        break;
                    case -3:
                        i2 = 7;
                        break;
                    case -2:
                        buildrangeduri.read = 1;
                        buildrangeduri.read(10);
                        buildrangeduri.read(14);
                        read = (Enum) buildrangeduri.write;
                        break;
                    case -1:
                        i2 = 4;
                        break;
                    default:
                        break;
                }
            }
            throw th;
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause == null) {
                throw th3;
            }
            throw cause;
        }
    }

    private final void IconCompatParcelizer() throws Throwable {
        int i;
        buildRangedUri buildrangeduri = new buildRangedUri(this);
        try {
            int i2 = 0;
            byte[] bArr = AudioAttributesImplBaseParcelizer;
            Object[] objArr = new Object[1];
            a(bArr[103], bArr[29], bArr[98], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(bArr[153], bArr[103], (short) 419, objArr2);
            String str = (String) objArr2[0];
            Object[] objArr3 = new Object[1];
            a(bArr[103], bArr[56], bArr[246], objArr3);
            int iIntValue = ((Integer) cls.getMethod(str, Class.forName((String) objArr3[0]), Character.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, "", '0', 0, 0)).intValue() + 88;
            Object[] objArr4 = new Object[1];
            a(bArr[103], bArr[29], bArr[98], objArr4);
            Class<?> cls2 = Class.forName((String) objArr4[0]);
            byte b = bArr[315];
            byte b2 = bArr[96];
            Object[] objArr5 = new Object[1];
            a(b, b2, (short) (b2 | 421), objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            a(bArr[103], bArr[56], bArr[246], objArr6);
            Object[] objArr7 = new Object[1];
            a(bArr[103], bArr[56], bArr[246], objArr7);
            int iIntValue2 = ((Integer) cls2.getMethod(str2, Class.forName((String) objArr6[0]), Class.forName((String) objArr7[0])).invoke(null, "", "")).intValue() + 183;
            Object[] objArr8 = {0, 0};
            byte b3 = bArr[144];
            byte b4 = bArr[29];
            Object[] objArr9 = new Object[1];
            a(b3, b4, (short) (b4 | 435), objArr9);
            Class<?> cls3 = Class.forName((String) objArr9[0]);
            byte b5 = bArr[53];
            byte b6 = bArr[58];
            Object[] objArr10 = new Object[1];
            a(b5, b6, (short) (b6 | 449), objArr10);
            Object[] objArr11 = new Object[1];
            b(iIntValue, iIntValue2, (char) ((Integer) cls3.getMethod((String) objArr10[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr8)).intValue(), objArr11);
            String str3 = (String) objArr11[0];
            byte b7 = bArr[23];
            byte b8 = bArr[29];
            Object[] objArr12 = new Object[1];
            a(b7, b8, (short) (b8 | 107), objArr12);
            Class<?> cls4 = Class.forName((String) objArr12[0]);
            byte b9 = bArr[56];
            byte b10 = bArr[105];
            Object[] objArr13 = new Object[1];
            a(b9, b10, (short) (b10 | 465), objArr13);
            int iIntValue3 = 1 - (((Integer) cls4.getMethod((String) objArr13[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr14 = new Object[1];
            a(bArr[103], bArr[29], bArr[98], objArr14);
            Class<?> cls5 = Class.forName((String) objArr14[0]);
            byte b11 = bArr[315];
            byte b12 = bArr[96];
            Object[] objArr15 = new Object[1];
            a(b11, b12, (short) (b12 | 421), objArr15);
            String str4 = (String) objArr15[0];
            Object[] objArr16 = new Object[1];
            a(bArr[103], bArr[56], bArr[246], objArr16);
            Object[] objArr17 = new Object[1];
            a(bArr[103], bArr[56], bArr[246], objArr17);
            int iIntValue4 = ((Integer) cls5.getMethod(str4, Class.forName((String) objArr16[0]), Class.forName((String) objArr17[0]), Integer.TYPE).invoke(null, "", "", 0)).intValue() + 90;
            byte b13 = bArr[56];
            byte b14 = bArr[29];
            Object[] objArr18 = new Object[1];
            a(b13, b14, (short) (b14 | 494), objArr18);
            Class<?> cls6 = Class.forName((String) objArr18[0]);
            byte b15 = bArr[13];
            byte b16 = bArr[29];
            Object[] objArr19 = new Object[1];
            a(b15, b16, (short) (b16 | 517), objArr19);
            String str5 = (String) objArr19[0];
            char c = 17;
            short s = (short) 231;
            Object[] objArr20 = new Object[1];
            a(bArr[17], bArr[56], s, objArr20);
            Method method = cls6.getMethod(str5, Class.forName((String) objArr20[0]));
            Object[] objArr21 = new Object[1];
            b(iIntValue3, iIntValue4, (char) (23132 - ((Integer) method.invoke(null, "")).intValue()), objArr21);
            Object[] objArr22 = {(String) objArr21[0]};
            Object[] objArr23 = new Object[1];
            a(bArr[17], bArr[56], s, objArr23);
            Class<?> cls7 = Class.forName((String) objArr23[0]);
            byte b17 = bArr[182];
            byte b18 = bArr[52];
            Object[] objArr24 = new Object[1];
            a(b17, b18, (short) (b18 | 228), objArr24);
            String str6 = (String) objArr24[0];
            Object[] objArr25 = new Object[1];
            a(bArr[17], bArr[56], s, objArr25);
            Object[] objArr26 = (Object[]) cls7.getMethod(str6, Class.forName((String) objArr25[0])).invoke(str3, objArr22);
            int[] iArr = new int[objArr26.length];
            int i3 = 0;
            while (i3 < objArr26.length) {
                Object[] objArr27 = {objArr26[i3]};
                byte[] bArr2 = AudioAttributesImplBaseParcelizer;
                short s2 = (short) 250;
                Object[] objArr28 = new Object[1];
                a(bArr2[144], bArr2[56], s2, objArr28);
                Class<?> cls8 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                a(bArr2[315], bArr2[39], (short) 266, objArr29);
                String str7 = (String) objArr29[0];
                Object[] objArr30 = new Object[1];
                a(bArr2[c], bArr2[56], s, objArr30);
                Object objInvoke = cls8.getMethod(str7, Class.forName((String) objArr30[0])).invoke(null, objArr27);
                Object[] objArr31 = new Object[1];
                a(bArr2[144], bArr2[56], s2, objArr31);
                Class<?> cls9 = Class.forName((String) objArr31[0]);
                Object[] objArr32 = new Object[1];
                a(bArr2[185], bArr2[96], (short) 272, objArr32);
                iArr[i3] = ((Integer) cls9.getMethod((String) objArr32[0], null).invoke(objInvoke, null)).intValue();
                i3++;
                c = 17;
            }
            while (true) {
                int i4 = i2 + 1;
                try {
                } catch (Throwable th) {
                    th = th;
                }
                switch (buildrangeduri.read(iArr[i2])) {
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        i2 = 24;
                        break;
                    case -12:
                        try {
                            buildrangeduri.read(16);
                            i = buildrangeduri.RemoteActionCompatParcelizer;
                        } catch (Throwable th2) {
                            th = th2;
                            if (i2 >= 20) {
                            }
                            throw th;
                        }
                        if (i != 10 && i == 63) {
                            i2 = 19;
                        } else {
                            i4 = 5;
                        }
                        break;
                    case -11:
                        try {
                            buildrangeduri.read = 1;
                            buildrangeduri.read(10);
                            buildrangeduri.read(14);
                            buildrangeduri.read = buildrangeduri.write.hashCode();
                            buildrangeduri.read(6);
                        } catch (Throwable th3) {
                            th = th3;
                            if (i2 >= 20 || i2 >= 24) {
                                throw th;
                            }
                            buildrangeduri.IconCompatParcelizer = th;
                            buildrangeduri.read(19);
                            i2 = 18;
                        }
                        break;
                    case -10:
                        buildrangeduri.read(4);
                        throw ((Throwable) buildrangeduri.write);
                    case -9:
                        i2 = 25;
                        break;
                    case -8:
                        i2 = 27;
                        break;
                    case -7:
                        buildrangeduri.read(25);
                        i2 = buildrangeduri.RemoteActionCompatParcelizer != 0 ? i4 : 17;
                        break;
                    case -6:
                        buildrangeduri.read = 1;
                        buildrangeduri.read(10);
                        buildrangeduri.read(11);
                        write = buildrangeduri.RemoteActionCompatParcelizer;
                        break;
                    case -5:
                        buildrangeduri.read = AudioAttributesCompatParcelizer;
                        buildrangeduri.read(6);
                        break;
                    case -4:
                        return;
                    case -3:
                        i2 = 1;
                        break;
                    case -2:
                        i2 = 7;
                        break;
                    case -1:
                        i2 = 2;
                        break;
                    default:
                        break;
                }
            }
            throw th;
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause == null) {
                throw th4;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Enum RemoteActionCompatParcelizer$5e726e45() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 998
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseMpegChannelConfiguration.RemoteActionCompatParcelizer$5e726e45():java.lang.Enum");
    }

    public parseMpegChannelConfiguration() throws Throwable {
        IconCompatParcelizer();
    }

    /* JADX INFO: renamed from: o.parseMpegChannelConfiguration$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001c\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/marrow/data/utils/product/DrmUtils$Companion;", "", "<init>", "()V", "cachedSecurityLevel", "Lcom/marrow/video/components/drm/models/SecurityLevel;", "getDeviceSecurityLevel", "querySecurityLevelFromOs", "getDrmDeviceId", "", "logAnalytics", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "key", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Enum write$5e726e45() throws Throwable {
            Enum enumRemoteActionCompatParcelizer$5e726e45 = parseMpegChannelConfiguration.RemoteActionCompatParcelizer$5e726e45();
            if (enumRemoteActionCompatParcelizer$5e726e45 != null) {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1733856635);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 61115), 11733 - TextUtils.indexOf((CharSequence) "", '0'), View.MeasureSpec.makeMeasureSpec(0, 0) + 23, -420563440, false, "IconCompatParcelizer", null);
                }
                if (enumRemoteActionCompatParcelizer$5e726e45 != ((Field) objRemoteActionCompatParcelizer).get(null)) {
                    return enumRemoteActionCompatParcelizer$5e726e45;
                }
            }
            Enum enumRemoteActionCompatParcelizer$5e726e452 = RemoteActionCompatParcelizer$5e726e45();
            Companion companion = parseMpegChannelConfiguration.INSTANCE;
            parseMpegChannelConfiguration.AudioAttributesCompatParcelizer$26433acb(enumRemoteActionCompatParcelizer$5e726e452);
            return enumRemoteActionCompatParcelizer$5e726e452;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00da A[Catch: all -> 0x010b, UnsupportedSchemeException -> 0x0110, TryCatch #4 {UnsupportedSchemeException -> 0x0110, all -> 0x010b, blocks: (B:4:0x000e, B:8:0x0020, B:11:0x002a, B:13:0x0033, B:14:0x0053, B:15:0x005d, B:18:0x0066, B:20:0x006f, B:21:0x0090, B:22:0x0099, B:25:0x00a2, B:27:0x00ab, B:28:0x00cb, B:29:0x00d4, B:31:0x00da, B:32:0x00ff), top: B:58:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x014c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.Enum RemoteActionCompatParcelizer$5e726e45() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 346
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.parseMpegChannelConfiguration.Companion.RemoteActionCompatParcelizer$5e726e45():java.lang.Enum");
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.String read() throws java.lang.Throwable {
            /*
                r0 = 0
                android.media.MediaDrm r1 = new android.media.MediaDrm     // Catch: java.lang.Throwable -> L1d android.media.UnsupportedSchemeException -> L1f
                java.util.UUID r2 = com.google.android.exoplayer2.C.WIDEVINE_UUID     // Catch: java.lang.Throwable -> L1d android.media.UnsupportedSchemeException -> L1f
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L1d android.media.UnsupportedSchemeException -> L1f
                java.lang.String r2 = "deviceUniqueId"
                byte[] r2 = r1.getPropertyByteArray(r2)     // Catch: android.media.UnsupportedSchemeException -> L1b java.lang.Throwable -> L2f
                java.lang.String r3 = ""
                kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r2, r3)     // Catch: android.media.UnsupportedSchemeException -> L1b java.lang.Throwable -> L2f
                java.lang.String r0 = kotlin.checkContentTypeConsistency.IconCompatParcelizer(r2)     // Catch: android.media.UnsupportedSchemeException -> L1b java.lang.Throwable -> L2f
                r1.close()
                return r0
            L1b:
                r2 = move-exception
                goto L22
            L1d:
                r1 = move-exception
                goto L33
            L1f:
                r1 = move-exception
                r2 = r1
                r1 = r0
            L22:
                java.lang.Exception r2 = (java.lang.Exception) r2     // Catch: java.lang.Throwable -> L2f
                java.lang.String r3 = "device_id"
                read(r2, r3)     // Catch: java.lang.Throwable -> L2f
                if (r1 == 0) goto L2e
                r1.close()
            L2e:
                return r0
            L2f:
                r0 = move-exception
                r4 = r1
                r1 = r0
                r0 = r4
            L33:
                if (r0 == 0) goto L38
                r0.close()
            L38:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.parseMpegChannelConfiguration.Companion.read():java.lang.String");
        }

        private static void read(Exception exc, String str) {
            HashMap map = new HashMap();
            map.put("key", str);
            map.put("ex_title", exc.getClass().getSimpleName().toString());
            String message = exc.getMessage();
            if (message == null) {
                message = "Message not available";
            }
            for (int i = 0; i < 2; i++) {
                int i2 = i * 100;
                if (message.length() > i2) {
                    int iRemoteActionCompatParcelizer = getQues.RemoteActionCompatParcelizer((r1 * 100) - 1, TestGroupLSModel.write((CharSequence) message));
                    String strConcat = "ex_msg_".concat(String.valueOf(i + 1));
                    String strSubstring = message.substring(i2, iRemoteActionCompatParcelizer);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
                    map.put(strConcat, strSubstring);
                }
            }
            RtspHeadersBuilder.IconCompatParcelizer().write("drm_not_loaded", map, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void b(int i, int i2, char c, Object[] objArr) throws Throwable {
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i3 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(RemoteActionCompatParcelizer[i2 + i3])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    char size = (char) (36621 - View.MeasureSpec.getSize(0));
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 2341;
                    int tapTimeout = 28 - (ViewConfiguration.getTapTimeout() >> 16);
                    byte b = (byte) ($$b - 4);
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read(size, packedPositionChild, tapTimeout, 480654850, false, $$c(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i3), Long.valueOf(AudioAttributesImplApi26Parcelizer), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) View.combineMeasuredStates(0, 0), TextUtils.getOffsetBefore("", 0) + 9701, 'J' - AndroidCharacter.getMirror('0'), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i3] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) Gravity.getAbsoluteGravity(0, 0), 23785 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
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
        char[] cArr = new char[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr5 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23784, 'Q' - AndroidCharacter.getMirror('0'), -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    static {
        byte[] bArr = new byte[535];
        System.arraycopy("Q¤J\u0094\rö\u000eýúûÊFñ\u0013üº&\u0011\u0013üá\u001fõ\u0003\u0007þ\u000fÛ\u0017\u0000\rò\u000fÍ%\u000eñ\r÷\u0015ëÍ>õ\rùÇ\u0015%ù\u0011á\u0012\f\u0004ð\tõ\u0002\rö\u000eýúûÊIòû\u0003þ\u000fº\u00173øñ\röý\u0001\nùç\u001d\n\u0001â\u0013ü\u0012þ\u000fÜ\u0011\u0002\búÿì\u001f\u0004ö\u000bõ\u0006ÿÙ+ý\u0006û\rö\u000eýúûÊHóü\u0012·(\u0013ü\u0012Ì,ÿø\u0003þ\u000eýï\u0013õ\u0006ÿþ\u000fß\u0010\u000fýý\u0000Ö\u001f\u0011á\u0016\u0011ë\rö\u000eýúûÊ?øÿ\u0005øÍ\u00134ï\u0005\u0006å\u001eï\u0002\bþ\u000fÙ\u001c\u0005è\u0019ý\tøø\rö\u000eýúûÊ9\u000bï\u000fø\u0001ú\u0010»\u0015,ý\u0003\u0003\u000b\u0004øùþ\u000fæ\u0015\u0000þÖ,ÿ\u0006þýý\u0007á\u0015\u0004ø\n\u0006ÿ÷\u0015ëÍ>õ\rùÇ%!þ÷\u0005ùýüý\u000b÷\u0015ëÍ>õ\rùÇ\u001b%\u0006ñ\u0002þ\rë\u000b\tðê\u0017\u0005\u0006â\u000b\u000b\tð÷\u0015ëÍ>õ\rùÇ\u00173ë\u0002\u000b\u0004õ\u0006ÿ\rö\u000eýúûÊHóü\u0012·\u001d\u001a\u0014Ì1ï\t\u0006þ\u000fÙ\"õ\u0005ý\u0003ü\rÛ\u0018\u000fíò!í\u0013ñè\u0014\u0012øþ\u000fÙ\u0014\u0017Þ\u0019ý\tøøþ\u000fÛ\u0017\u0000\rò\u000fÎ#\u0001\t\u0003ó\rö\u000eýúûÊA\u0004»%&ú\u0001ñ\bÖ)\u0003ô\bû\u0004õ\u0004øè\u001c\u0003\u0000ý\nþ\u000fÙ\u0014\u0017ñ\u0004\bøÙ&ý\u0005ùï\u000f\u0007\u0003ô\u0006\u000b\u0005õ\u0012\u0001Õ%ö\u0001\u0013×\u0017\u0005ö\u0001\u0013×\u0017\rö\u000eýúûÊHóü\u0012·(\u0013ü\u0012\fþõ\u0007\u0005÷è\u0018ü\u0012\u0002ýóÿï!í\u0013ñ\u000eþ\u000fß\u0010\u000fýý\u0000Ö\u001f\u0011Ô\u001b\u0003\u0001ß1ýï\u0013õ\u0006ÿ\rö\u000eýúûÊHóü\u0012·\u001f\"\u0005õ\u0006ÿ×1ï\t\u0006\u0017ñ\nÓ,ýþæ!þ÷\u0005ù".getBytes(CharsetNames.ISO_8859_1), 0, bArr, 0, 535);
        AudioAttributesImplBaseParcelizer = bArr;
        MediaBrowserCompatItemReceiver = 212;
        write();
        AudioAttributesCompatParcelizer = 0;
        write = 1;
        INSTANCE = new Companion(null);
    }

    static void write() {
        RemoteActionCompatParcelizer = new char[]{24195, 24282, 24072, 24140, 24456, 24539, 24349, 24446, 23722, 23793, 23600, 23658, 23998, 23810, 23900, 23177, 23243, 23063, 23129, 23428, 23526, 23338, 23414, 22705, 22753, 22591, 22932, 22981, 22811, 22867, 22165, 22210, 22050, 22138, 22454, 22509, 22327, 22383, 21692, 21504, 21599, 21903, 21969, 21768, 21826, 21155, 21221, 21044, 21103, 21431, 21497, 21283, 20614, 20694, 20501, 20561, 20891, 20930, 20798, 20837, 20145, 20211, 20021, 20070, 20418, 20230, 20309, 19602, 19670, 19462, 19527, 19873, 19947, 19762, 19816, 19125, 19171, 19031, 19332, 19400, 19215, 19279, 18584, 18652, 18491, 18550, 18860, 18928, 18727, 18786, 34429, 48220, 48133, 48343, 48268, 48469, 48388, 48578, 48544, 48757, 48689, 48880, 48810, 49023, 49089, 49051, 47176, 47123, 47304, 47238, 47450, 47417, 47597, 47539, 47727, 47676, 47840, 47966, 47872, 48081, 48018, 46164, 46086, 46307, 46240, 46455, 46375, 46569, 46501, 46712, 46814, 46728, 46926, 46863, 47051, 46997, 45180, 45114, 45283, 45229, 45417, 45370, 45566, 45657, 45589, 45774, 45715, 45893, 45854, 46051, 46010, 44144, 44082, 44267, 44219, 44292, 44504, 44438, 44623, 44567, 44740, 44700, 44926, 44852, 45039, 44975, 43115, 43068, 43139, 43355, 43272, 43479, 43400, 43590, 43551, 43745, 43700, 43885, 43829, 44005, 43937, 41986, 42178, 56353, 56440, 56490, 56558, 56618, 56697, 56736, 56791, 56840, 56915, 56967, 57047, 57117, 57278, 57318, 55346, 55408, 55476, 55522, 55615, 55621, 55696, 55758, 55820, 55876, 55965, 56125, 56186, 56236, 56302, 54312, 54395, 54431, 54490, 54538, 54606, 54670, 54745, 54784, 54974, 55016, 55096, 55154, 55222, 55271, 53249, 53319, 53407, 53456, 53524, 53583, 53663, 53797, 53876, 53938, 54003, 54049, 54141, 54175, 54238, 52236, 52304, 52363, 52422, 52576, 52666, 52714, 52782, 52844, 52921, 52991, 53022, 53078, 53133, 53197, 51215, 51292, 51424, 51515, 51572, 51632, 51690, 51747, 51839, 51845, 51924, 51985};
        AudioAttributesImplApi26Parcelizer = -647279805269025719L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.parseMpegChannelConfiguration.AudioAttributesImplBaseParcelizer
            int r7 = r7 + 97
            int r8 = r8 + 4
            int r1 = 33 - r6
            byte[] r1 = new byte[r1]
            int r6 = 32 - r6
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r6
            r7 = r8
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r8 = r8 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseMpegChannelConfiguration.a(byte, short, short, java.lang.Object[]):void");
    }
}
