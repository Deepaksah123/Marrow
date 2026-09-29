package kotlin;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.ui.views.CustomButton;
import com.marrow.ui.views.CustomTextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResolvableApiException;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final class getRendererCapabilitiesListener extends shouldEvaluateQueueSize<SegmentBaseMultiSegmentBase> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {9, -88, -121, TarConstants.LF_FIFO, 58, -44, -40, 12, -26, -8, -5, 39, -58, 14, -9, -18, -11, 4, -13, -6, 26, -27, -22, -7, 4, -20, -26, -15, -9, -12, 8, 29, -41, -24, 4, -13, -6, 36, -51, -5, -10, 8, -26, 29, -24, -24, 8, -9, -14, -4, -24, 14, -20};
    private static final int $$h = 50;
    private static final byte[] $$a = {36, 33, 122, TarConstants.LF_DIR, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 164;
    private static int AudioAttributesCompatParcelizer = 0;
    private static int write = 1;
    private static int read = 1000326162;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            byte[] r0 = kotlin.getRendererCapabilitiesListener.$$a
            int r7 = r7 * 10
            int r7 = r7 + 34
            int r9 = r9 * 12
            int r9 = r9 + 65
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r9 = r8
            r5 = r2
            goto L2a
        L15:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L19:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r9]
        L2a:
            int r8 = r8 + r3
            int r8 = r8 + (-1)
            int r9 = r9 + 1
            r3 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getRendererCapabilitiesListener.a(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 22
            int r6 = r6 + 4
            int r7 = r7 * 5
            int r0 = r7 + 23
            byte[] r1 = kotlin.getRendererCapabilitiesListener.$$g
            int r8 = r8 * 29
            int r8 = r8 + 82
            byte[] r0 = new byte[r0]
            int r7 = r7 + 22
            r2 = 0
            if (r1 != 0) goto L19
            r8 = r6
            r4 = r7
            r3 = r2
            goto L31
        L19:
            r3 = r2
        L1a:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r5
        L31:
            int r4 = -r4
            int r6 = r6 + 1
            int r8 = r8 + r4
            int r8 = r8 + (-7)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getRendererCapabilitiesListener.c(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getRendererCapabilitiesListener(Context context) {
        super(context);
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // kotlin.shouldEvaluateQueueSize
    public final /* synthetic */ getApplicationLabel write() {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 63;
        write = i2 % 128;
        int i3 = i2 % 2;
        SegmentBaseMultiSegmentBase segmentBaseMultiSegmentBaseRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        int i4 = write + 103;
        AudioAttributesCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return segmentBaseMultiSegmentBaseRemoteActionCompatParcelizer;
    }

    private SegmentBaseMultiSegmentBase RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 31;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        SegmentBaseMultiSegmentBase segmentBaseMultiSegmentBaseWrite = SegmentBaseMultiSegmentBase.write(getLayoutInflater());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(segmentBaseMultiSegmentBaseWrite, "");
        int i4 = AudioAttributesCompatParcelizer + 107;
        write = i4 % 128;
        int i5 = i4 % 2;
        return segmentBaseMultiSegmentBaseWrite;
    }

    private static final getShowPopup write(getRendererCapabilitiesListener getrenderercapabilitieslistener) {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 57;
        write = i2 % 128;
        int i3 = i2 % 2;
        getrenderercapabilitieslistener.dismiss();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        int i5 = write + 111;
        AudioAttributesCompatParcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            return getshowpopup;
        }
        throw null;
    }

    @Override // kotlin.shouldEvaluateQueueSize, kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public final void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        char c;
        char c2;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char fadingEdgeLength = (char) (13183 - (ViewConfiguration.getFadingEdgeLength() >> 16));
            int iResolveOpacity = 1649 - Drawable.resolveOpacity(0, 0);
            int iMyPid = (Process.myPid() >> 22) + 26;
            byte b = $$a[53];
            Object[] objArr2 = new Object[1];
            a(b, r2[5], b, objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(fadingEdgeLength, iResolveOpacity, iMyPid, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char c3 = (char) (13184 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                int keyRepeatTimeout = 1649 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int i2 = 27 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                byte[] bArr = $$a;
                byte b2 = bArr[5];
                Object[] objArr3 = new Object[1];
                a(b2, (byte) (-bArr[27]), b2, objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(c3, keyRepeatTimeout, i2, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
            c2 = 3;
            c = 2;
        } else {
            Object[] objArr4 = new Object[1];
            b(13 - ExpandableListView.getPackedPositionGroup(0L), true, new char[]{17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 16, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + TsExtractor.TS_STREAM_TYPE_DTS, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b(TextUtils.indexOf((CharSequence) "", '0', 0) + 6, true, new char[]{14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531, 65506, 19, 14, 3}, Process.getGidForName("") + 17, 142 - TextUtils.lastIndexOf("", '0'), objArr5);
            try {
                Object[] objArr6 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue()), 0, 1001590355};
                byte b3 = (byte) 0;
                byte b4 = b3;
                Object[] objArr7 = new Object[1];
                c(b3, b4, (byte) (b4 + 1), objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                byte b5 = (byte) 1;
                byte b6 = b5;
                Object[] objArr8 = new Object[1];
                c(b5, b6, (byte) (b6 - 1), objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char threadPriority = (char) (13183 - ((Process.getThreadPriority(0) + 20) >> 6));
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1649;
                    int capsMode = 26 - TextUtils.getCapsMode("", 0, 0);
                    byte[] bArr2 = $$a;
                    byte b7 = bArr2[5];
                    Object[] objArr9 = new Object[1];
                    a(b7, (byte) (-bArr2[27]), b7, objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(threadPriority, keyRepeatDelay, capsMode, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b(19 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), true, new char[]{'\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f'}, 22 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 140, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b(14 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), true, new char[]{6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534}, 15 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 143, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char cIndexOf = (char) (13182 - TextUtils.indexOf((CharSequence) "", '0', 0));
                        int iMyTid = (Process.myTid() >> 22) + 1649;
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 26;
                        byte b8 = $$a[5];
                        byte b9 = b8;
                        Object[] objArr12 = new Object[1];
                        a(b9, (byte) (b9 | TarConstants.LF_GNUTYPE_LONGNAME), b8, objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(cIndexOf, iMyTid, longPressTimeout, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 13183);
                        int i3 = 1650 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int i4 = 27 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        byte b10 = $$a[53];
                        Object[] objArr13 = new Object[1];
                        a(b10, r9[5], b10, objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(tapTimeout, i3, i4, -133433128, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf2);
                    int i5 = write + 85;
                    AudioAttributesCompatParcelizer = i5 % 128;
                    c = 2;
                    int i6 = i5 % 2;
                    c2 = 3;
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
        int i7 = ((int[]) objArr[c2])[0];
        int i8 = ((int[]) objArr[c])[0];
        if (i8 != i7) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i8 ^ i7)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (4535 - KeyEvent.getDeadChar(0, 0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 6054, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i9 = write + 61;
                AudioAttributesCompatParcelizer = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr14 = {-412810589, Long.valueOf(j3), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6030, TextUtils.lastIndexOf("", '0', 0) + 25);
                    byte b11 = (byte) 1;
                    byte b12 = b11;
                    Object[] objArr15 = new Object[1];
                    c(b11, b12, (byte) (b12 - 1), objArr15);
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
        CustomButton customButton = AudioAttributesImplBaseParcelizer().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customButton, "");
        RemoteActionCompatParcelizer(customButton, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.buildUponParameters
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getRendererCapabilitiesListener.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
            }
        });
        CustomButton customButton2 = AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customButton2, "");
        RemoteActionCompatParcelizer(customButton2, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.setParametersInternal
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getRendererCapabilitiesListener.read(this.RemoteActionCompatParcelizer);
            }
        });
    }

    private static final getShowPopup RemoteActionCompatParcelizer(getRendererCapabilitiesListener getrenderercapabilitieslistener) {
        int i = 2 % 2;
        Context context = getrenderercapabilitieslistener.getContext();
        ResolvableApiException.Companion companion = ResolvableApiException.INSTANCE;
        Context context2 = getrenderercapabilitieslistener.getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context2, "");
        context.startActivity(ResolvableApiException.Companion.read(context2, new canceledPendingResult("https://www.marrow.com/blog/update-regarding-playing-marrow-videos-on-mobile-devices/", "", null, 4, null)));
        getrenderercapabilitieslistener.dismiss();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i2 = write + 23;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        return getshowpopup;
    }

    private static void b(int i, boolean z, char[] cArr, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i2];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        int i5 = $11 + 83;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
            int i7 = $10 + 21;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i3 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i9 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i9]), Integer.valueOf(read)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) View.getDefaultSize(0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 23704, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 31, -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i9] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (44861 - Process.getGidForName("")), 18944 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
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
            int i10 = $11 + 125;
            $10 = i10 % 128;
            int i11 = i10 % 2;
        }
        if (z) {
            char[] cArr4 = new char[i2];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
                int i12 = $10 + 67;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i2 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (44862 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 18944 - TextUtils.getOffsetBefore("", 0), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Override // kotlin.shouldEvaluateQueueSize
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 59;
        write = i2 % 128;
        int i3 = i2 % 2;
        CustomTextView customTextView = AudioAttributesImplBaseParcelizer().IconCompatParcelizer;
        Context context = getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        customTextView.setText(DefaultTimeBarExternalSyntheticLambda0.AudioAttributesCompatParcelizer(context, R.array.app_name_toast_error_drm, new Object[0]));
        int i4 = write + 7;
        AudioAttributesCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getShowPopup read(getRendererCapabilitiesListener getrenderercapabilitieslistener) {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 75;
        write = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getrenderercapabilitieslistener);
        if (i3 == 0) {
            int i4 = 4 / 0;
        }
        int i5 = write + 89;
        AudioAttributesCompatParcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 8 / 0;
        }
        return getshowpopupRemoteActionCompatParcelizer;
    }

    public static /* synthetic */ getShowPopup IconCompatParcelizer(getRendererCapabilitiesListener getrenderercapabilitieslistener) {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 101;
        write = i2 % 128;
        if (i2 % 2 == 0) {
            write(getrenderercapabilitieslistener);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getShowPopup getshowpopupWrite = write(getrenderercapabilitieslistener);
        int i3 = AudioAttributesCompatParcelizer + 49;
        write = i3 % 128;
        int i4 = i3 % 2;
        return getshowpopupWrite;
    }
}
