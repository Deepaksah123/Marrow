package com.razorpay;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.notifyDownloadChanged;
import kotlin.notifyDownloadRemoved;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public class AppSignatureHelper extends ContextWrapper {
    private static long AudioAttributesCompatParcelizer = 0;
    private static int AudioAttributesImplBaseParcelizer = 0;
    private static long IconCompatParcelizer = 0;
    public static final int NUM_BASE64_CHAR = 11;
    public static final int NUM_HASHED_BYTES = 9;
    private static char RemoteActionCompatParcelizer = 0;
    public static final String TAG = "AppSignatureHelper";
    private static final String l$1_I$l$ = "SHA-256";
    private static int write;
    private static final byte[] $$c = {10, -79, -66, -51};
    private static final int $$f = 22;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {TarConstants.LF_SYMLINK, -51, -30, -2, -29, -18, -12, -15, 5, 26, -44, -27, 1, -16, -9, 33, -54, -8, -13, 5, -29, 26, -27, -27, 5, -12, -17, -7, -27, 11, -23, TarConstants.LF_CONTIG, -41, -34, -9, -15, -2, 20, -54, 1, -11, -8, 3, -29, -5, -11, -20, 19, -29, -19, 0, -11, -23, 3, -23, 37, -54, 1, -11, -8, 12, -30, -33, 24, -21, -21, -19, 6, -24, 3, -6, -13};
    private static final int $$e = 71;
    private static final byte[] $$a = {81, -92, 74, -108, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 177;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int AudioAttributesImplApi26Parcelizer = 1;
    private static int read = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r6, byte r7, int r8) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r8 = r8 + 103
            int r6 = r6 * 4
            int r0 = r6 + 1
            byte[] r1 = com.razorpay.AppSignatureHelper.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2c
        L14:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r8 = r8 + 1
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2c:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.AppSignatureHelper.$$g(int, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = 44 - r7
            int r6 = 190 - r6
            int r8 = r8 + 65
            byte[] r1 = com.razorpay.AppSignatureHelper.$$a
            byte[] r0 = new byte[r0]
            int r7 = 43 - r7
            r2 = -1
            if (r1 != 0) goto L13
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2b
        L13:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L17:
            int r3 = r3 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r0, r7)
            r9[r7] = r6
            return
        L27:
            int r8 = r8 + 1
            r4 = r1[r8]
        L2b:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + r2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.AppSignatureHelper.c(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = 114 - r6
            int r8 = 68 - r8
            byte[] r0 = com.razorpay.AppSignatureHelper.$$d
            int r1 = 39 - r7
            byte[] r1 = new byte[r1]
            int r7 = 38 - r7
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r4 = -r4
            int r8 = r8 + r4
            int r8 = r8 + (-10)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.AppSignatureHelper.d(byte, short, short, java.lang.Object[]):void");
    }

    public AppSignatureHelper(Context context) {
        super(context);
    }

    public ArrayList<String> getAppSignatures() {
        String str;
        int i = 2 % 2;
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            String packageName = getPackageName();
            for (Signature signature : getPackageManager().getPackageInfo(packageName, 64).signatures) {
                int i2 = MediaBrowserCompatCustomActionResultReceiver + 29;
                AudioAttributesImplApi26Parcelizer = i2 % 128;
                int i3 = i2 % 2;
                String strL$1_I$l$ = l$1_I$l$(packageName, signature.toCharsString());
                if (strL$1_I$l$ != null) {
                    int i4 = MediaBrowserCompatCustomActionResultReceiver + 103;
                    AudioAttributesImplApi26Parcelizer = i4 % 128;
                    if (i4 % 2 == 0) {
                        Object[] objArr = new Object[0];
                        objArr[0] = strL$1_I$l$;
                        str = String.format("%s", objArr);
                    } else {
                        str = String.format("%s", strL$1_I$l$);
                    }
                    arrayList.add(str);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    private static String l$1_I$l$(String str, String str2) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        String string = sb.toString();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(l$1_I$l$);
            messageDigest.update(string.getBytes(StandardCharsets.UTF_8));
            String strSubstring = Base64.encodeToString(Arrays.copyOfRange(messageDigest.digest(), 0, 9), 3).substring(0, 11);
            Logger.d(String.format("pkg: %s -- hash: %s", str, strSubstring));
            int i2 = MediaBrowserCompatCustomActionResultReceiver + 33;
            AudioAttributesImplApi26Parcelizer = i2 % 128;
            int i3 = i2 % 2;
            return strSubstring;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i3 = notifydownloadchanged.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objRemoteActionCompatParcelizer = startForeground.read((char) (38461 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (ViewConfiguration.getTouchSlop() >> 8) + 532, TextUtils.indexOf("", "", 0) + 8, -735610793, false, $$g(b, b2, (byte) (b2 & 9)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (IconCompatParcelizer ^ 2192498202983240651L);
                try {
                    Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (36621 - Gravity.getAbsoluteGravity(0, 0)), ExpandableListView.getPackedPositionChild(0L) + 2341, 28 - (ViewConfiguration.getFadingEdgeLength() >> 16), 188119637, false, $$g(b3, b4, (byte) (b4 & 8)), new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i4 = $10 + 49;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            try {
                Object[] objArr4 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 - 1);
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (36620 - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2339, 'L' - AndroidCharacter.getMirror('0'), 188119637, false, $$g(b5, b6, (byte) (b6 & 8)), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        String str = new String(cArr2);
        int i6 = $11 + 125;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
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
            int i4 = $10 + 119;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 22749 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), Color.alpha(0) + 36, 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {notifydownloadremoved};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b - 1);
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (31369 - View.resolveSizeAndState(0, 0, 0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2720, 38 - Drawable.resolveOpacity(0, 0), 1895162189, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 15712 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 64, -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                objRemoteActionCompatParcelizer4 = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 40975), 6122 - TextUtils.indexOf("", ""), 30 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = notifydownloadremoved.write;
                            cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr2[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (AudioAttributesCompatParcelizer ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) write) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) RemoteActionCompatParcelizer) ^ (-3498762522182953692L)))));
                            notifydownloadremoved.AudioAttributesCompatParcelizer++;
                            int i6 = $10 + 9;
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
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:(26:259|33|(3:35|36|(2:38|40)(1:39))(1:40)|76|262|77|(1:79)|80|(3:82|(1:84)|85)(19:86|87|253|88|(1:90)|91|92|271|93|(1:95)|96|97|98|(1:100)|101|(1:103)|104|(1:106)|107)|108|(4:112|(13:277|114|(3:116|(3:119|120|117)|282)|121|265|122|(1:124)|125|126|127|255|128|281)(1:280)|279|109)|278|111|163|(1:165)|166|(3:168|(1:170)|171)(13:172|267|173|174|(1:176)|177|260|178|179|(1:181)|182|(1:184)|185)|186|(6:188|189|(1:191)|192|193|194)|195|(1:197)|198|(3:200|(1:202)|203)(14:205|206|(1:208)|209|210|(1:212)|213|251|214|215|(1:217)|218|(1:220)|221)|204|222|(7:224|225|(1:227)|228|229|230|231)(1:283))|275|49|(1:51)|52|53|76|262|77|(0)|80|(0)(0)|108|(1:109)|278|111|163|(0)|166|(0)(0)|186|(0)|195|(0)|198|(0)(0)|204|222|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0ab1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0ab2, code lost:
    
        r3 = new java.lang.Object[1];
        a(((android.content.Context) java.lang.Class.forName(r24).getMethod(r5, new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 1586383159, new char[]{0, 0, 0, 0}, new char[]{41978, 13471, 14751, 53965, 44717, 64694, 32946, 56644, 56133, 4146, 13566}, (char) android.text.TextUtils.indexOf("", ""), new char[]{52696, 29110, 33697, 62960}, r3);
        r3 = (java.lang.String) r3[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0b04, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString(org.apache.commons.compress.utils.CharsetNames.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0b1b, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0b1f, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0b2e, code lost:
    
        r1 = kotlin.startForeground.RemoteActionCompatParcelizer(-1407079962);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0b32, code lost:
    
        if (r1 == null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0b34, code lost:
    
        r1 = kotlin.startForeground.read((char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)) + 4534), 6054 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0b5e, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0b6a, code lost:
    
        r7 = new java.lang.Object[]{-1941939984, 81604378625L, r2, com.marrow.TrainingApplication.RemoteActionCompatParcelizer(), false};
        r2 = (java.lang.Class) kotlin.startForeground.IconCompatParcelizer((char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 6030, (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 23);
        r10 = new java.lang.Object[1];
        d((byte) (com.razorpay.AppSignatureHelper.$$d[15] - 1), r3[29], (byte) (com.razorpay.AppSignatureHelper.$$e & 497), r10);
        r2.getMethod((java.lang.String) r10[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x097c A[Catch: all -> 0x0ab1, TryCatch #7 {all -> 0x0ab1, blocks: (B:77:0x0520, B:79:0x0526, B:80:0x056a, B:82:0x0577, B:84:0x0580, B:85:0x05be, B:108:0x096f, B:109:0x0973, B:112:0x097c, B:114:0x0993, B:117:0x09a0, B:119:0x09a3, B:126:0x0a08, B:132:0x0a8b, B:134:0x0a91, B:135:0x0a92, B:137:0x0a94, B:139:0x0a9b, B:140:0x0a9c, B:86:0x05c9, B:98:0x076d, B:100:0x0773, B:101:0x07b3, B:103:0x08ce, B:104:0x0911, B:106:0x0927, B:107:0x0969, B:142:0x0a9e, B:144:0x0aa5, B:145:0x0aa6, B:147:0x0aa8, B:149:0x0aaf, B:150:0x0ab0, B:88:0x069c, B:90:0x06ae, B:91:0x06d8, B:128:0x0a0d, B:122:0x09cc, B:124:0x09d2, B:125:0x0a01, B:93:0x06df, B:95:0x06f4, B:96:0x0761), top: B:262:0x0520, outer: #0, inners: #2, #3, #9, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0bfa  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0c44  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0c98  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0f7f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x1063  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x10ac  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x10fa  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x1456  */
    /* JADX WARN: Removed duplicated region for block: B:283:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0526 A[Catch: all -> 0x0ab1, TryCatch #7 {all -> 0x0ab1, blocks: (B:77:0x0520, B:79:0x0526, B:80:0x056a, B:82:0x0577, B:84:0x0580, B:85:0x05be, B:108:0x096f, B:109:0x0973, B:112:0x097c, B:114:0x0993, B:117:0x09a0, B:119:0x09a3, B:126:0x0a08, B:132:0x0a8b, B:134:0x0a91, B:135:0x0a92, B:137:0x0a94, B:139:0x0a9b, B:140:0x0a9c, B:86:0x05c9, B:98:0x076d, B:100:0x0773, B:101:0x07b3, B:103:0x08ce, B:104:0x0911, B:106:0x0927, B:107:0x0969, B:142:0x0a9e, B:144:0x0aa5, B:145:0x0aa6, B:147:0x0aa8, B:149:0x0aaf, B:150:0x0ab0, B:88:0x069c, B:90:0x06ae, B:91:0x06d8, B:128:0x0a0d, B:122:0x09cc, B:124:0x09d2, B:125:0x0a01, B:93:0x06df, B:95:0x06f4, B:96:0x0761), top: B:262:0x0520, outer: #0, inners: #2, #3, #9, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0577 A[Catch: all -> 0x0ab1, TryCatch #7 {all -> 0x0ab1, blocks: (B:77:0x0520, B:79:0x0526, B:80:0x056a, B:82:0x0577, B:84:0x0580, B:85:0x05be, B:108:0x096f, B:109:0x0973, B:112:0x097c, B:114:0x0993, B:117:0x09a0, B:119:0x09a3, B:126:0x0a08, B:132:0x0a8b, B:134:0x0a91, B:135:0x0a92, B:137:0x0a94, B:139:0x0a9b, B:140:0x0a9c, B:86:0x05c9, B:98:0x076d, B:100:0x0773, B:101:0x07b3, B:103:0x08ce, B:104:0x0911, B:106:0x0927, B:107:0x0969, B:142:0x0a9e, B:144:0x0aa5, B:145:0x0aa6, B:147:0x0aa8, B:149:0x0aaf, B:150:0x0ab0, B:88:0x069c, B:90:0x06ae, B:91:0x06d8, B:128:0x0a0d, B:122:0x09cc, B:124:0x09d2, B:125:0x0a01, B:93:0x06df, B:95:0x06f4, B:96:0x0761), top: B:262:0x0520, outer: #0, inners: #2, #3, #9, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x05c9 A[Catch: all -> 0x0ab1, TRY_LEAVE, TryCatch #7 {all -> 0x0ab1, blocks: (B:77:0x0520, B:79:0x0526, B:80:0x056a, B:82:0x0577, B:84:0x0580, B:85:0x05be, B:108:0x096f, B:109:0x0973, B:112:0x097c, B:114:0x0993, B:117:0x09a0, B:119:0x09a3, B:126:0x0a08, B:132:0x0a8b, B:134:0x0a91, B:135:0x0a92, B:137:0x0a94, B:139:0x0a9b, B:140:0x0a9c, B:86:0x05c9, B:98:0x076d, B:100:0x0773, B:101:0x07b3, B:103:0x08ce, B:104:0x0911, B:106:0x0927, B:107:0x0969, B:142:0x0a9e, B:144:0x0aa5, B:145:0x0aa6, B:147:0x0aa8, B:149:0x0aaf, B:150:0x0ab0, B:88:0x069c, B:90:0x06ae, B:91:0x06d8, B:128:0x0a0d, B:122:0x09cc, B:124:0x09d2, B:125:0x0a01, B:93:0x06df, B:95:0x06f4, B:96:0x0761), top: B:262:0x0520, outer: #0, inners: #2, #3, #9, #12 }] */
    @Override // android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.AppSignatureHelper.attachBaseContext(android.content.Context):void");
    }

    static {
        AudioAttributesImplBaseParcelizer = 1;
        IconCompatParcelizer();
        int i = read + 59;
        AudioAttributesImplBaseParcelizer = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void IconCompatParcelizer() {
        AudioAttributesCompatParcelizer = -3498762522182953692L;
        write = -136981212;
        RemoteActionCompatParcelizer = (char) 40843;
        IconCompatParcelizer = 5369087107109083978L;
    }
}
