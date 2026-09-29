package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.TrainingApplication;
import com.marrow.ui.views.CustomButton;
import com.marrow.ui.views.CustomTextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@getRenewGrpId
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016"}, d2 = {"Lo/getLastChunkDurationUs;", "Lo/shouldEvaluateQueueSize;", "Lo/Representation;", "Landroid/content/Context;", "p0", "", "p1", "<init>", "(Landroid/content/Context;I)V", "RemoteActionCompatParcelizer", "()Lo/Representation;", "Landroid/os/Bundle;", "", "onCreate", "(Landroid/os/Bundle;)V", "read", "(I)V", "", "(Ljava/lang/String;)V", "AudioAttributesCompatParcelizer", "I", "IconCompatParcelizer", "Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getLastChunkDurationUs extends shouldEvaluateQueueSize<Representation> {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private int IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private String AudioAttributesCompatParcelizer;
    private static final byte[] $$g = {30, 6, -112, TarConstants.LF_FIFO, 13, -1, -62, 58, 9, 1, -7, 6, -6, -54, TarConstants.LF_BLK, 14, -9, 15, -2, -5, -4, -53, 64, -11, 20, -14, 14, -8, -7, 12, -61, 71, -18, 2, 18, -68, 39, 14, 2, -21, 22, 25, -9, 7, 0, -79, 79, -12, -3, 4, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$h = 214;
    private static final byte[] $$a = {32, -59, 22, 74, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 230;
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    private static int RemoteActionCompatParcelizer = 1000326281;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = kotlin.getLastChunkDurationUs.$$a
            int r7 = r7 * 10
            int r1 = 44 - r7
            int r6 = r6 * 12
            int r6 = 77 - r6
            byte[] r1 = new byte[r1]
            int r7 = 43 - r7
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2f
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + (-1)
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getLastChunkDurationUs.a(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = kotlin.getLastChunkDurationUs.$$g
            int r6 = 68 - r6
            int r1 = r7 + 20
            int r5 = r5 + 73
            byte[] r1 = new byte[r1]
            int r7 = r7 + 19
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r7
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r0[r6]
            int r3 = r3 + 1
        L26:
            int r5 = r5 + r4
            int r5 = r5 + (-1)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getLastChunkDurationUs.c(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private getLastChunkDurationUs(Context context, int i) {
        super(context, i);
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.shouldEvaluateQueueSize
    public final /* synthetic */ getApplicationLabel write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        write = i2 % 128;
        int i3 = i2 % 2;
        Representation representationRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        int i4 = IconCompatParcelizer + 111;
        write = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return representationRemoteActionCompatParcelizer;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getLastChunkDurationUs(Context context, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        if ((i2 & 2) != 0) {
            int i3 = write + 1;
            IconCompatParcelizer = i3 % 128;
            int i4 = i3 % 2;
            i = CmcdConfigurationRequestConfig.read();
            int i5 = write + 83;
            IconCompatParcelizer = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
        }
        this(context, i);
    }

    private Representation RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 69;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Representation representationAudioAttributesCompatParcelizer = Representation.AudioAttributesCompatParcelizer(getLayoutInflater());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(representationAudioAttributesCompatParcelizer, "");
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        return representationAudioAttributesCompatParcelizer;
    }

    private static void b(int i, boolean z, char[] cArr, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i2];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
            int i5 = $10 + 55;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i3 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i7 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(RemoteActionCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) Gravity.getAbsoluteGravity(0, 0), 23704 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.lastIndexOf("", '0', 0) + 33, -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 44862), KeyEvent.normalizeMetaState(0) + 18944, 27 - TextUtils.indexOf((CharSequence) "", '0'), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i8 = $10 + 115;
                $11 = i8 % 128;
                int i9 = i8 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i > 0) {
            int i10 = $10 + 3;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cleardownloadmanagerhelpers.write = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i2 - cleardownloadmanagerhelpers.write);
            int i12 = $11 + 67;
            $10 = i12 % 128;
            int i13 = i12 % 2;
        }
        if (z) {
            char[] cArr4 = new char[i2];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
                int i14 = $10 + 41;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i2 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (44862 - View.resolveSizeAndState(0, 0, 0)), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 18944, 28 - (Process.myPid() >> 22), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static final getShowPopup IconCompatParcelizer(getLastChunkDurationUs getlastchunkdurationus) {
        int i = 2 % 2;
        int i2 = write + 53;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        getlastchunkdurationus.dismiss();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = IconCompatParcelizer + 125;
        write = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
        return getshowpopup;
    }

    @Override // kotlin.shouldEvaluateQueueSize, kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        int i2 = write + 125;
        IconCompatParcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
            if (objRemoteActionCompatParcelizer == null) {
                char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 13183);
                int iAxisFromString = 1648 - MotionEvent.axisFromString("");
                int edgeSlop = 26 - (ViewConfiguration.getEdgeSlop() >> 16);
                byte b = $$a[5];
                Object[] objArr2 = new Object[1];
                a(b, b, r0[53], objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(cNormalizeMetaState, iAxisFromString, edgeSlop, -133433128, false, (String) objArr2[0], null);
            }
            ((Field) objRemoteActionCompatParcelizer).getLong(null);
            obj.hashCode();
            throw null;
        }
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer2 == null) {
            char maxKeyCode = (char) (13183 - (KeyEvent.getMaxKeyCode() >> 16));
            int mode = 1649 - View.MeasureSpec.getMode(0);
            int iIndexOf = TextUtils.indexOf("", "") + 26;
            byte b2 = $$a[5];
            Object[] objArr3 = new Object[1];
            a(b2, b2, r2[53], objArr3);
            objRemoteActionCompatParcelizer2 = startForeground.read(maxKeyCode, mode, iIndexOf, -133433128, false, (String) objArr3[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer2).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer3 == null) {
                char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 13183);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1650;
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 27;
                byte[] bArr = $$a;
                byte b3 = bArr[17];
                byte b4 = bArr[65];
                Object[] objArr4 = new Object[1];
                a(b3, b3, b4, objArr4);
                objRemoteActionCompatParcelizer3 = startForeground.read(packedPositionType, packedPositionChild, modifierMetaStateMask, -1033747278, false, (String) objArr4[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
            c = 3;
        } else {
            Object[] objArr5 = new Object[1];
            b((ViewConfiguration.getKeyRepeatDelay() >> 16) + 6, true, new char[]{'\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f', 65535}, 15 - MotionEvent.axisFromString(""), 276 - View.MeasureSpec.getSize(0), objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            b(View.getDefaultSize(0, 0) + 3, false, new char[]{'\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501}, 16 - Color.blue(0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 280, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            int i3 = IconCompatParcelizer + 117;
            write = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr7 = {Integer.valueOf(iIntValue), 0, -1900347436};
                byte[] bArr2 = $$g;
                byte b5 = bArr2[50];
                Object[] objArr8 = new Object[1];
                c((byte) (b5 - 1), (byte) (bArr2[22] + 1), b5, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                byte b6 = bArr2[44];
                byte b7 = b6;
                Object[] objArr9 = new Object[1];
                c(b7, (byte) (b7 | 19), b6, objArr9);
                objArr = (Object[]) cls2.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr7);
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char touchSlop = (char) (13183 - (ViewConfiguration.getTouchSlop() >> 8));
                    int iAxisFromString2 = MotionEvent.axisFromString("") + 1650;
                    int i5 = 27 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    byte b8 = $$a[17];
                    Object[] objArr10 = new Object[1];
                    a(b8, b8, r7[65], objArr10);
                    objRemoteActionCompatParcelizer4 = startForeground.read(touchSlop, iAxisFromString2, i5, -1033747278, false, (String) objArr10[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer4).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    b(TextUtils.indexOf("", "", 0, 0) + 8, true, new char[]{65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f'}, 22 - (ViewConfiguration.getLongPressTimeout() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 278, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    b((ViewConfiguration.getEdgeSlop() >> 16) + 4, false, new char[]{'\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5}, 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 281, objArr12);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char cMyPid = (char) (13183 - (Process.myPid() >> 22));
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1649;
                        int iAlpha = Color.alpha(0) + 26;
                        byte b9 = $$a[17];
                        byte b10 = b9;
                        Object[] objArr13 = new Object[1];
                        a(b9, b10, (byte) (b10 | 74), objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(cMyPid, fadingEdgeLength, iAlpha, 54351865, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char c2 = (char) (13184 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        int iMyTid = 1649 - (Process.myTid() >> 22);
                        int gidForName = Process.getGidForName("") + 27;
                        byte b11 = $$a[5];
                        Object[] objArr14 = new Object[1];
                        a(b11, b11, r5[53], objArr14);
                        objRemoteActionCompatParcelizer6 = startForeground.read(c2, iMyTid, gidForName, -133433128, false, (String) objArr14[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf2);
                    c = 3;
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
        int i6 = ((int[]) objArr[c])[0];
        int i7 = ((int[]) objArr[2])[0];
        if (i7 != i6) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i6 ^ i7)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) (4535 - View.MeasureSpec.makeMeasureSpec(0, 0)), 6053 - ExpandableListView.getPackedPositionChild(0L), 42 - KeyEvent.normalizeMetaState(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer7).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i8 = IconCompatParcelizer + 99;
                write = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr15 = {-502025895, Long.valueOf(j3), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (Process.myTid() >> 22), TextUtils.indexOf("", "") + 6030, 24 - (ViewConfiguration.getEdgeSlop() >> 16));
                    byte[] bArr3 = $$g;
                    Object[] objArr16 = new Object[1];
                    c(bArr3[8], bArr3[44], bArr3[64], objArr16);
                    cls4.getMethod((String) objArr16[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr15);
                    int i10 = write + 59;
                    IconCompatParcelizer = i10 % 128;
                    int i11 = i10 % 2;
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
        if (this.IconCompatParcelizer > 0) {
            AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer.setText(this.IconCompatParcelizer);
        } else {
            AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer.setText(this.AudioAttributesCompatParcelizer);
        }
        CustomTextView customTextView = AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        PlayerControlViewExternalSyntheticLambda1.write((View) customTextView);
        CustomButton customButton = AudioAttributesImplBaseParcelizer().IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customButton, "");
        RemoteActionCompatParcelizer(customButton, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.getAdaptationCheckpoints
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getLastChunkDurationUs.read(this.read);
            }
        });
    }

    public final void read(int p0) {
        int i = 2 % 2;
        int i2 = write + 25;
        int i3 = i2 % 128;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        this.IconCompatParcelizer = p0;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 85;
        write = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 15 / 0;
        }
    }

    public final void read(String p0) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 19;
        write = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesCompatParcelizer = p0;
        int i4 = IconCompatParcelizer + 115;
        write = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ getShowPopup read(getLastChunkDurationUs getlastchunkdurationus) {
        int i = 2 % 2;
        int i2 = write + 75;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupIconCompatParcelizer = IconCompatParcelizer(getlastchunkdurationus);
        int i4 = IconCompatParcelizer + 33;
        write = i4 % 128;
        if (i4 % 2 != 0) {
            return getshowpopupIconCompatParcelizer;
        }
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getLastChunkDurationUs(Context context) {
        this(context, 0, 2, null);
        toMagicModuleMetaRepoModel.write(context, "");
    }
}
