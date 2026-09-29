package kotlin;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lo/checkPermissionState;", "Lo/argCount;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "Lo/UrlTemplate;", "RemoteActionCompatParcelizer", "Lo/UrlTemplate;", "read", "()Lo/UrlTemplate;", "write", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class checkPermissionState extends argCount {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char[] write;
    private UrlTemplate RemoteActionCompatParcelizer;
    private static final byte[] $$d = {3, 113, -44, TarConstants.LF_BLK, -18, -4, 57, -63, -14, -6, 2, -11, 1, TarConstants.LF_LINK, -57, -19, 4, -20, -3, 0, -1, TarConstants.LF_NORMAL, -69, 6, -25, 9, -19, 3, 2, -17, 56, -59, -11, -7, -13, 60, -27, -43, -7, -13, 70, -19, -1, 3, -17, 9, -25, -14, -8, -11, 9, 30, -40, -23, 5, -12, -5, 37, -50, -4, -9, 9, -25, 30, -23, -23, 9, -8, -13, -3, -23, 15, -19};
    private static final int $$e = 41;
    private static final byte[] $$a = {109, -78, -126, 25, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 235;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int AudioAttributesCompatParcelizer = 0;
    private static int read = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r7 = r7 * 10
            int r0 = r7 + 34
            int r6 = r6 * 12
            int r6 = 77 - r6
            byte[] r1 = kotlin.checkPermissionState.$$a
            byte[] r0 = new byte[r0]
            int r7 = r7 + 33
            r2 = 0
            if (r1 != 0) goto L17
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2d:
            int r8 = -r8
            int r3 = r3 + 1
            int r6 = r6 + r8
            int r6 = r6 + (-1)
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.checkPermissionState.a(short, byte, byte, java.lang.Object[]):void");
    }

    private static void c(short s, int i, short s2, Object[] objArr) {
        int i2 = 119 - s2;
        byte[] bArr = $$d;
        int i3 = s + 4;
        byte[] bArr2 = new byte[39 - i];
        int i4 = 38 - i;
        int i5 = -1;
        if (bArr == null) {
            i2 = (i4 + (-i2)) - 6;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            i3++;
            bArr2[i6] = (byte) i2;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = (i2 + (-bArr[i3])) - 6;
                i5 = i6;
            }
        }
    }

    private final UrlTemplate read() {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 75;
        read = i2 % 128;
        int i3 = i2 % 2;
        UrlTemplate urlTemplate = this.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(urlTemplate);
        int i4 = read + 111;
        AudioAttributesCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return urlTemplate;
    }

    public static final class RemoteActionCompatParcelizer extends ClickableSpan {
        RemoteActionCompatParcelizer() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            toMagicModuleMetaRepoModel.write(view, "");
            withAlwaysAsId.read(checkPermissionState.this, "tnq_dialog_key", _getIndexResolver.write(setAction.write("terms_key_press", Boolean.TRUE)));
        }
    }

    public static final class AudioAttributesCompatParcelizer extends ClickableSpan {
        AudioAttributesCompatParcelizer() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            toMagicModuleMetaRepoModel.write(view, "");
            withAlwaysAsId.read(checkPermissionState.this, "tnq_dialog_key", _getIndexResolver.write(setAction.write("privacy_key_press", Boolean.TRUE)));
        }
    }

    /* JADX INFO: renamed from: o.checkPermissionState$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/checkPermissionState$IconCompatParcelizer;", "", "<init>", "()V", "Lo/checkPermissionState;", "write", "()Lo/checkPermissionState;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static checkPermissionState write() {
            return new checkPermissionState();
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = read + 25;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char c = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 13183);
            int i4 = 1649 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int iIndexOf = TextUtils.indexOf("", "", 0) + 26;
            byte b = $$a[5];
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            a(b, r2[17], b2, objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(c, i4, iIndexOf, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char cMyTid = (char) ((Process.myTid() >> 22) + 13183);
                int i5 = 1649 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 26;
                byte[] bArr = $$a;
                Object[] objArr3 = new Object[1];
                a(bArr[17], bArr[5], bArr[27], objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(cMyTid, i5, offsetBefore, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
        } else {
            Object[] objArr4 = new Object[1];
            b(new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1}, new int[]{0, 16, 0, 15}, false, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b(null, new int[]{16, 16, 57, 15}, true, objArr5);
            try {
                Object[] objArr6 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue()), 0, -149906354};
                byte[] bArr2 = $$d;
                Object[] objArr7 = new Object[1];
                c(bArr2[20], bArr2[19], (byte) (-bArr2[17]), objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                byte b3 = bArr2[57];
                Object[] objArr8 = new Object[1];
                c(b3, (byte) (b3 - 3), bArr2[19], objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 13183);
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 1649;
                    int i6 = (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 25;
                    byte[] bArr3 = $$a;
                    Object[] objArr9 = new Object[1];
                    a(bArr3[17], bArr3[5], bArr3[27], objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(maximumDrawingCacheSize, iResolveOpacity, i6, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b(new byte[]{1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1}, new int[]{32, 22, 0, 6}, false, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b(new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, new int[]{54, 15, 0, 0}, true, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 13183);
                        int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 1649;
                        int edgeSlop = 26 - (ViewConfiguration.getEdgeSlop() >> 16);
                        byte[] bArr4 = $$a;
                        byte b4 = bArr4[17];
                        byte b5 = bArr4[5];
                        Object[] objArr12 = new Object[1];
                        a(b4, b5, (byte) (b5 | TarConstants.LF_GNUTYPE_LONGNAME), objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(capsMode, capsMode2, edgeSlop, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 13184);
                        int minimumFlingVelocity = 1649 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int iNormalizeMetaState = 26 - KeyEvent.normalizeMetaState(0);
                        byte[] bArr5 = $$a;
                        byte b6 = bArr5[5];
                        byte b7 = b6;
                        byte b8 = bArr5[17];
                        byte b9 = b6;
                        Object[] objArr13 = new Object[1];
                        a(b7, b8, b9, objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(packedPositionChild, minimumFlingVelocity, iNormalizeMetaState, -133433128, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf2);
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
        int i7 = ((int[]) objArr[3])[0];
        int i8 = ((int[]) objArr[2])[0];
        if (i8 != i7) {
            long j = -1;
            long j2 = ((long) (i7 ^ i8)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (4535 - (ViewConfiguration.getEdgeSlop() >> 16)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 6054, 42 - (Process.myPid() >> 22), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i9 = AudioAttributesCompatParcelizer + 21;
                read = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr14 = {1128348824, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) KeyEvent.keyCodeFromString(""), Color.alpha(0) + 6030, MotionEvent.axisFromString("") + 25);
                    Object[] objArr15 = new Object[1];
                    c((byte) $$e, (byte) (-$$d[11]), r3[57], objArr15);
                    cls4.getMethod((String) objArr15[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr14);
                    int i11 = read + 87;
                    AudioAttributesCompatParcelizer = i11 % 128;
                    int i12 = i11 % 2;
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
        super.onCreate(p0);
        setCancelable(false);
    }

    private static void b(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = write;
        char c = '0';
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 67;
                $11 = i9 % 128;
                if (i9 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.lastIndexOf("", c) + 1), 11613 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 20, -1786471333, false, "u", new Class[]{Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                        i8 <<= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i8])};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 11613 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 20 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i8++;
                }
                i2 = 2;
                c = '0';
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c2 = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i10 = $10 + 23;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                        Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c2)};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) View.combineMeasuredStates(0, 0), Color.green(0) + 22959, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 42, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                        int i12 = 62 / 0;
                    } else {
                        int i13 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c2)};
                            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 22959, 42 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i13] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                } else {
                    int i14 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    try {
                        Object[] objArr6 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c2)};
                        Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1859710730);
                        if (objRemoteActionCompatParcelizer5 == null) {
                            objRemoteActionCompatParcelizer5 = startForeground.read((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 31588), KeyEvent.keyCodeFromString("") + 9863, 65 - TextUtils.getOffsetBefore("", 0), 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).charValue();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                c2 = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr7 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (AndroidCharacter.getMirror('0') + 37774), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 9753, TextUtils.getOffsetBefore("", 0) + 27, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i15 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i15, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i15);
        }
        if (z) {
            char[] cArr6 = new char[i5];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i5 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            int i16 = $11 + 3;
            $10 = i16 % 128;
            i = 2;
            int i17 = i16 % 2;
            cArr3 = cArr6;
        } else {
            i = 2;
        }
        if (i6 > 0) {
            int i18 = $10 + 7;
            $11 = i18 % 128;
            int i19 = i18 % i;
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[i]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static final void write(checkPermissionState checkpermissionstate) {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 107;
        read = i2 % 128;
        int i3 = i2 % 2;
        withAlwaysAsId.read(checkpermissionstate, "tnq_dialog_key", _getIndexResolver.write(setAction.write("confirmation_key_press", Boolean.TRUE)));
        checkpermissionstate.dismiss();
        int i4 = read + 81;
        AudioAttributesCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        this.RemoteActionCompatParcelizer = UrlTemplate.IconCompatParcelizer(p0, p1);
        String string = getString(R.string.consent_tnC_text);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = getString(R.string.clickable_text_terms_condition_landing_page);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        String string3 = getString(R.string.clickable_text_privacy_landing_page);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(_isNaN.getColor(requireContext(), R.color.text_blue));
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer();
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(_isNaN.getColor(requireContext(), R.color.text_blue));
        String str = string;
        int iWrite = TestGroupLSModel.write(str, string2, 0, 6);
        int iWrite2 = TestGroupLSModel.write(str, string3, 0, 6);
        read().AudioAttributesCompatParcelizer.setText(getString(R.string.updated_t_and_c));
        TextView textView = read().read;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(remoteActionCompatParcelizer, iWrite, string2.length() + iWrite, 18);
        spannableStringBuilder.setSpan(foregroundColorSpan2, iWrite, string2.length() + iWrite, 18);
        spannableStringBuilder.setSpan(audioAttributesCompatParcelizer, iWrite2, string3.length() + iWrite2, 18);
        spannableStringBuilder.setSpan(foregroundColorSpan, iWrite, iWrite2 + string3.length(), 18);
        textView.setText(spannableStringBuilder);
        read().read.setMovementMethod(LinkMovementMethod.getInstance());
        read().IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.startSmsCodeRetriever
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                checkPermissionState.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
            }
        });
        ScrollView scrollViewIconCompatParcelizer = read().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollViewIconCompatParcelizer, "");
        ScrollView scrollView = scrollViewIconCompatParcelizer;
        int i2 = AudioAttributesCompatParcelizer + 119;
        read = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 74 / 0;
        }
        return scrollView;
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 79;
        read = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroyView();
        this.RemoteActionCompatParcelizer = null;
        int i4 = read + 109;
        AudioAttributesCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(checkPermissionState checkpermissionstate) {
        int i = 2 % 2;
        int i2 = read + 17;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        write(checkpermissionstate);
        int i4 = AudioAttributesCompatParcelizer + 61;
        read = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        AudioAttributesImplBaseParcelizer = 1;
        RemoteActionCompatParcelizer();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatItemReceiver + 63;
        AudioAttributesImplBaseParcelizer = i % 128;
        if (i % 2 == 0) {
            int i2 = 96 / 0;
        }
    }

    static void RemoteActionCompatParcelizer() {
        write = new char[]{44986, 45025, 45025, 45005, 44999, 45036, 45037, 45024, 44992, 45002, 45036, 45052, 45049, 45030, 45027, 45025, 44823, 44834, 45046, 44843, 44838, 44816, 44811, 44856, 44839, 44840, 44839, 44845, 44820, 44823, 44840, 44820, 44988, 45010, 45021, 45031, 45027, 45037, 45036, 45037, 45027, 45025, 45050, 45030, 45036, 44995, 44996, 45051, 45018, 45002, 45036, 45052, 45049, 45030, 44984, 45027, 45025, 45028, 45050, 45036, 45033, 45009, 45009, 45038, 45030, 45051, 45026, 45036, 45026};
    }
}
