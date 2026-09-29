package kotlin;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.TrainingApplication;
import com.marrow.data.api.models.response.payment.PaymentStatusResponseKt;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lo/DefaultTrackSelectorExternalSyntheticLambda0;", "Lo/argCount;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lo/SegmentBaseSegmentTimelineElement;", "IconCompatParcelizer", "Lo/SegmentBaseSegmentTimelineElement;", "read", "()Lo/SegmentBaseSegmentTimelineElement;", "RemoteActionCompatParcelizer", "", "AudioAttributesCompatParcelizer", "Ljava/lang/String;", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DefaultTrackSelectorExternalSyntheticLambda0 extends argCount {
    private static byte[] AudioAttributesImplApi26Parcelizer;
    private static short[] MediaBrowserCompatCustomActionResultReceiver;
    private static int MediaBrowserCompatItemReceiver;
    private static int RatingCompat;
    private static int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int write;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private String write = "";

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private SegmentBaseSegmentTimelineElement read;
    private static final byte[] $$c = {14, -40, -35, 110};
    private static final int $$f = 60;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {45, 96, -22, -65, 58, -64, -5, -22, 25, -27, -20, 1, 4, -19, 6, -15, -10, 16, -36, -1, 65, -53, -26, -15, -9, -12, 8, 29, -41, -24, 4, -13, -6, 36, -51, -5, -10, 8, -26, 29, -24, -24, 8, -9, -14, -4, -24, 14, -20, -26, -15, -9, -12, 8, 29, -41, -24, 4, -13, -6, 36, -51, -5, -10, 8, -26, 29, -24, -24, 8, -9, -14, -4, -24, 14, -20};
    private static final int $$e = 43;
    private static final byte[] $$a = {9, -121, -22, -93, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 211;
    private static int MediaMetadataCompat = 0;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int AudioAttributesImplBaseParcelizer = 1;

    private static String $$g(byte b, byte b2, byte b3) {
        int i = (b * 3) + 4;
        int i2 = b2 * 2;
        int i3 = 112 - (b3 * 4);
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i4 = -1;
            i3 = i + i2;
            i++;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i3;
            if (i5 == i2) {
                return new String(bArr2, 0);
            }
            int i6 = i3;
            i4 = i5;
            i3 = bArr[i] + i6;
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 10
            int r0 = r8 + 34
            byte[] r1 = kotlin.DefaultTrackSelectorExternalSyntheticLambda0.$$a
            int r6 = r6 * 12
            int r6 = 77 - r6
            byte[] r0 = new byte[r0]
            int r8 = r8 + 33
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2e
        L16:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r1[r6]
            r5 = r3
            r3 = r6
            r6 = r5
        L2e:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r3 + 1
            int r7 = r7 + (-1)
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DefaultTrackSelectorExternalSyntheticLambda0.a(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 45
            int r8 = r8 + 4
            byte[] r0 = kotlin.DefaultTrackSelectorExternalSyntheticLambda0.$$d
            int r7 = r7 * 18
            int r1 = 46 - r7
            int r6 = r6 * 29
            int r6 = 111 - r6
            byte[] r1 = new byte[r1]
            int r7 = 45 - r7
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2d
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2d:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-7)
            int r8 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DefaultTrackSelectorExternalSyntheticLambda0.c(short, short, byte, java.lang.Object[]):void");
    }

    private final SegmentBaseSegmentTimelineElement read() {
        int i = 2 % 2;
        SegmentBaseSegmentTimelineElement segmentBaseSegmentTimelineElement = this.read;
        if (segmentBaseSegmentTimelineElement == null) {
            int i2 = AudioAttributesImplBaseParcelizer + 27;
            AudioAttributesImplApi21Parcelizer = i2 % 128;
            int i3 = i2 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            if (i3 != 0) {
                int i4 = 9 / 0;
            }
            segmentBaseSegmentTimelineElement = null;
        }
        int i5 = AudioAttributesImplBaseParcelizer + 99;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
        return segmentBaseSegmentTimelineElement;
    }

    /* JADX INFO: renamed from: o.DefaultTrackSelectorExternalSyntheticLambda0$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/DefaultTrackSelectorExternalSyntheticLambda0$read;", "", "<init>", "()V", "", "p0", "Lo/DefaultTrackSelectorExternalSyntheticLambda0;", "write", "(Ljava/lang/String;)Lo/DefaultTrackSelectorExternalSyntheticLambda0;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static DefaultTrackSelectorExternalSyntheticLambda0 write(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            DefaultTrackSelectorExternalSyntheticLambda0 defaultTrackSelectorExternalSyntheticLambda0 = new DefaultTrackSelectorExternalSyntheticLambda0();
            Bundle bundle = new Bundle();
            bundle.putString(PaymentStatusResponseKt.KEY_ERROR_MESSAGE, p0);
            defaultTrackSelectorExternalSyntheticLambda0.setArguments(bundle);
            return defaultTrackSelectorExternalSyntheticLambda0;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char mode = (char) (13183 - View.MeasureSpec.getMode(0));
            int jumpTapTimeout = 1649 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 26;
            byte b = $$a[5];
            Object[] objArr2 = new Object[1];
            a(b, b, r3[17], objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(mode, jumpTapTimeout, absoluteGravity, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char offsetBefore = (char) (13183 - TextUtils.getOffsetBefore("", 0));
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 1649;
                int iRed = 26 - Color.red(0);
                byte[] bArr = $$a;
                Object[] objArr3 = new Object[1];
                a(bArr[17], bArr[27], bArr[5], objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(offsetBefore, edgeSlop, iRed, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
            c = 3;
        } else {
            Object[] objArr4 = new Object[1];
            b((byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 14), 535427490 - View.MeasureSpec.getMode(0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1618571010, (short) Color.green(0), KeyEvent.normalizeMetaState(0) - 91, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b((byte) (TextUtils.lastIndexOf("", '0') + 125), (KeyEvent.getMaxKeyCode() >> 16) + 535427489, TextUtils.indexOf("", "", 0, 0) + 1618571026, (short) TextUtils.getOffsetAfter("", 0), (-91) - Color.green(0), objArr5);
            int iIntValue = ((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue();
            int i2 = AudioAttributesImplApi21Parcelizer + 97;
            AudioAttributesImplBaseParcelizer = i2 % 128;
            int i3 = i2 % 2;
            try {
                Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 1746110882};
                byte[] bArr2 = $$d;
                byte b2 = (byte) (bArr2[11] - 1);
                byte b3 = b2;
                Object[] objArr7 = new Object[1];
                c(b2, b3, b3, objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                byte b4 = bArr2[11];
                byte b5 = b4;
                Object[] objArr8 = new Object[1];
                c(b4, b5, b5, objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char cGreen = (char) (Color.green(0) + 13183);
                    int modifierMetaStateMask = 1648 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int scrollBarFadeDuration = 26 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    byte[] bArr3 = $$a;
                    Object[] objArr9 = new Object[1];
                    a(bArr3[17], bArr3[27], bArr3[5], objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(cGreen, modifierMetaStateMask, scrollBarFadeDuration, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b((byte) ((-83) - TextUtils.lastIndexOf("", '0', 0, 0)), 535427481 - View.MeasureSpec.getSize(0), (ViewConfiguration.getTouchSlop() >> 8) + 1618571042, (short) (ViewConfiguration.getPressedStateDuration() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) - 91, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b((byte) (22 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + 535427485, 1618571064 - View.resolveSizeAndState(0, 0, 0), (short) (ViewConfiguration.getTouchSlop() >> 8), (-91) - KeyEvent.getDeadChar(0, 0), objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 13184);
                        int maximumDrawingCacheSize = 1649 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int iResolveSize = View.resolveSize(0, 0) + 26;
                        byte[] bArr4 = $$a;
                        Object[] objArr12 = new Object[1];
                        a(bArr4[17], (byte) 76, bArr4[5], objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(packedPositionChild, maximumDrawingCacheSize, iResolveSize, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char touchSlop = (char) (13183 - (ViewConfiguration.getTouchSlop() >> 8));
                        int iLastIndexOf = 1648 - TextUtils.lastIndexOf("", '0');
                        int i4 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 25;
                        byte[] bArr5 = $$a;
                        byte b6 = bArr5[5];
                        byte b7 = bArr5[17];
                        Object[] objArr13 = new Object[1];
                        a(b6, b6, b7, objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(touchSlop, iLastIndexOf, i4, -133433128, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf2);
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
        int i5 = ((int[]) objArr[c])[0];
        int i6 = ((int[]) objArr[2])[0];
        if (i6 != i5) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i5 ^ i6)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) ((Process.myPid() >> 22) + 4535), 6054 - View.MeasureSpec.getMode(0), 42 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i7 = AudioAttributesImplBaseParcelizer + 57;
                AudioAttributesImplApi21Parcelizer = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr14 = {-1921846948, Long.valueOf(j3), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) View.resolveSize(0, 0), ImageFormat.getBitsPerPixel(0) + 6031, 24 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                    byte b8 = $$d[11];
                    byte b9 = b8;
                    Object[] objArr15 = new Object[1];
                    c(b8, b9, b9, objArr15);
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
        super.onCreate(p0);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString(PaymentStatusResponseKt.KEY_ERROR_MESSAGE, "");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            this.write = string;
        }
        setCancelable(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 17;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        SegmentBaseSegmentTimelineElement segmentBaseSegmentTimelineElementIconCompatParcelizer = SegmentBaseSegmentTimelineElement.IconCompatParcelizer(p0, p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(segmentBaseSegmentTimelineElementIconCompatParcelizer, "");
        this.read = segmentBaseSegmentTimelineElementIconCompatParcelizer;
        ConstraintLayout constraintLayoutIconCompatParcelizer = read().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        ConstraintLayout constraintLayout = constraintLayoutIconCompatParcelizer;
        int i4 = AudioAttributesImplApi21Parcelizer + 107;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return constraintLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        SegmentBaseSegmentTimelineElement segmentBaseSegmentTimelineElement = read();
        segmentBaseSegmentTimelineElement.read.setText(this.write);
        segmentBaseSegmentTimelineElement.AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.DefaultTrackSelectorExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DefaultTrackSelectorExternalSyntheticLambda0.IconCompatParcelizer(this.read);
            }
        });
        int i2 = AudioAttributesImplApi21Parcelizer + 123;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void AudioAttributesCompatParcelizer(DefaultTrackSelectorExternalSyntheticLambda0 defaultTrackSelectorExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 95;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        defaultTrackSelectorExternalSyntheticLambda0.dismiss();
        int i4 = AudioAttributesImplApi21Parcelizer + 39;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0283 A[PHI: r0
      0x0283: PHI (r0v45 int) = (r0v8 int), (r0v48 int) binds: [B:58:0x0281, B:55:0x026f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0285 A[PHI: r0
      0x0285: PHI (r0v9 int) = (r0v8 int), (r0v48 int) binds: [B:58:0x0281, B:55:0x026f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(byte r25, int r26, int r27, short r28, int r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 898
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DefaultTrackSelectorExternalSyntheticLambda0.b(byte, int, int, short, int, java.lang.Object[]):void");
    }

    public static /* synthetic */ void IconCompatParcelizer(DefaultTrackSelectorExternalSyntheticLambda0 defaultTrackSelectorExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 73;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        AudioAttributesCompatParcelizer(defaultTrackSelectorExternalSyntheticLambda0);
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
    }

    static {
        RatingCompat = 1;
        IconCompatParcelizer();
        INSTANCE = new Companion(null);
        int i = MediaMetadataCompat + 45;
        RatingCompat = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void IconCompatParcelizer() {
        write = 1353650761;
        RemoteActionCompatParcelizer = -819363091;
        MediaBrowserCompatItemReceiver = 792691839;
        AudioAttributesImplApi26Parcelizer = new byte[]{1, -79, 72, -72, 67, -97, -100, 126, 64, -76, TarConstants.LF_GNUTYPE_LONGNAME, -121, 116, 82, -84, 78, 1, -54, 62, -25, 16, 62, -39, -46, 4, -50, -64, 62, -51, -62, -54, TarConstants.LF_NORMAL, 11, 17, -19, 26, TarConstants.LF_NORMAL, -49, 17, -24, 24, -29, 63, 60, -94, 29, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -45, -30, -29, -28, 23, -17, 20, 2, 90, -90, 87, -86, -87, 94, -79, TarConstants.LF_GNUTYPE_LONGNAME, 93, 80, -95, -83, 87, -91};
    }
}
