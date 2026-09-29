package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
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
import kotlin.isExtendedWestEuropeanChar;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0018\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017"}, d2 = {"Lo/canSelectFormat;", "Lo/shouldEvaluateQueueSize;", "Lo/Representation;", "Landroid/content/Context;", "p0", "", "p1", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "", "p2", "(Landroid/content/Context;Ljava/lang/String;I)V", "AudioAttributesImplApi21Parcelizer", "()Lo/Representation;", "Landroid/os/Bundle;", "", "onCreate", "(Landroid/os/Bundle;)V", "RemoteActionCompatParcelizer", "()I", "write", "(Ljava/lang/String;)V", "AudioAttributesCompatParcelizer", "Ljava/lang/String;", "IconCompatParcelizer", "I", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class canSelectFormat extends shouldEvaluateQueueSize<Representation> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AudioAttributesImplBaseParcelizer;
    private static int MediaBrowserCompatCustomActionResultReceiver;
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private String read;
    private static final byte[] $$g = {TarConstants.LF_SYMLINK, -51, -30, -2, 18, 4, -57, 63, 14, 6, -2, 11, -1, -49, 57, 19, -4, 20, 3, 0, 1, -48, 69, -6, 25, -9, 19, -3, -2, 17, -56, 59, 11, 7, 13, -60, 27, 43, 7, 13, -70, 19, 1, -3, 17, -9, 25, 14, 8, 11, -9, -30, 40, 23, -5, 12, 5, -37, TarConstants.LF_SYMLINK, 4, 9, -9, 25, -30, 23, 23, -9, 8, 13, 3, 23, -15, 19};
    private static final int $$h = 3;
    private static final byte[] $$a = {115, -66, -117, -68, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 76;
    private static int AudioAttributesImplApi21Parcelizer = 1;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int MediaBrowserCompatItemReceiver = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.canSelectFormat.$$a
            int r7 = r7 + 4
            int r8 = r8 * 10
            int r1 = r8 + 34
            int r6 = r6 * 12
            int r6 = 77 - r6
            byte[] r1 = new byte[r1]
            int r8 = r8 + 33
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2f
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2f:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r7 + (-1)
            r7 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.canSelectFormat.a(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.canSelectFormat.$$g
            int r1 = 39 - r7
            int r6 = r6 + 4
            int r8 = 119 - r8
            byte[] r1 = new byte[r1]
            int r7 = 38 - r7
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r6 = r6 + 1
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2b:
            int r3 = r3 + r6
            int r6 = r3 + (-6)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.canSelectFormat.c(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public canSelectFormat(Context context, String str) {
        super(context, CmcdConfigurationRequestConfig.read());
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        this.AudioAttributesCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = -1;
    }

    @Override // kotlin.shouldEvaluateQueueSize
    public final /* synthetic */ getApplicationLabel write() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 17;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Representation representationAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        if (i3 == 0) {
            return representationAudioAttributesImplApi21Parcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public canSelectFormat(Context context, String str, int i) {
        this(context, str);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        this.RemoteActionCompatParcelizer = i;
    }

    private Representation AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 19;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        Representation representationAudioAttributesCompatParcelizer = Representation.AudioAttributesCompatParcelizer(getLayoutInflater());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(representationAudioAttributesCompatParcelizer, "");
        int i4 = MediaBrowserCompatItemReceiver + 39;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return representationAudioAttributesCompatParcelizer;
    }

    private static void b(int i, boolean z, char[] cArr, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i2];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i3 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i5 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((-1) - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 23704, (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 31, -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (44861 - ((byte) KeyEvent.getModifierMetaStateMask())), ((byte) KeyEvent.getModifierMetaStateMask()) + X5455_ExtendedTimestamp.MODIFY_TIME_BIT, 28 - Color.red(0), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i6 = $10 + 97;
                $11 = i6 % 128;
                int i7 = i6 % 2;
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
        if (z) {
            int i8 = $10 + 71;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i2];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
                cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i2 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (Color.rgb(0, 0, 0) + 16822078), Process.getGidForName("") + 18945, 'L' - AndroidCharacter.getMirror('0'), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Override // kotlin.shouldEvaluateQueueSize, kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 25;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 13183);
            int doubleTapTimeout = 1649 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 26;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[5], bArr[53], bArr[17], objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(offsetBefore, doubleTapTimeout, fadingEdgeLength, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char cArgb = (char) (Color.argb(0, 0, 0, 0) + 13183);
                int iLastIndexOf = 1648 - TextUtils.lastIndexOf("", '0');
                int size = 26 - View.MeasureSpec.getSize(0);
                byte[] bArr2 = $$a;
                Object[] objArr3 = new Object[1];
                a(bArr2[17], bArr2[65], bArr2[5], objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(cArgb, iLastIndexOf, size, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
            c = 3;
        } else {
            Object[] objArr4 = new Object[1];
            b(TextUtils.getCapsMode("", 0, 0) + 1, true, new char[]{'\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535}, View.combineMeasuredStates(0, 0) + 16, 115 - (ViewConfiguration.getScrollBarSize() >> 8), objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b(Gravity.getAbsoluteGravity(0, 0) + 8, false, new char[]{65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14, 19}, 16 - Color.red(0), 119 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr5);
            int iIntValue = ((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue();
            int i4 = MediaBrowserCompatItemReceiver + 5;
            AudioAttributesImplApi26Parcelizer = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -1232105568};
                byte[] bArr3 = $$g;
                Object[] objArr7 = new Object[1];
                c(bArr3[12], bArr3[19], bArr3[17], objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                byte b = (byte) (-bArr3[57]);
                Object[] objArr8 = new Object[1];
                c(b, (byte) (b - 3), bArr3[19], objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char cIndexOf = (char) (13182 - TextUtils.indexOf((CharSequence) "", '0', 0));
                    int i6 = 1649 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    int iAlpha = 26 - Color.alpha(0);
                    byte[] bArr4 = $$a;
                    Object[] objArr9 = new Object[1];
                    a(bArr4[17], bArr4[65], bArr4[5], objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(cIndexOf, i6, iAlpha, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 22, true, new char[]{'\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534}, (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 21, Color.argb(0, 0, 0, 0) + 116, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b(View.resolveSizeAndState(0, 0, 0) + 9, true, new char[]{65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530}, MotionEvent.axisFromString("") + 16, 121 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char cRed = (char) (13183 - Color.red(0));
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1650;
                        int iLastIndexOf2 = 25 - TextUtils.lastIndexOf("", '0', 0);
                        byte b2 = $$a[17];
                        Object[] objArr12 = new Object[1];
                        a(b2, (byte) (b2 | 74), r14[5], objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(cRed, packedPositionChild, iLastIndexOf2, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char c2 = (char) (13183 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1649;
                        int i7 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 25;
                        byte[] bArr5 = $$a;
                        Object[] objArr13 = new Object[1];
                        a(bArr5[5], bArr5[53], bArr5[17], objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(c2, keyRepeatTimeout, i7, -133433128, false, (String) objArr13[0], null);
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
        int i8 = ((int[]) objArr[c])[0];
        int i9 = ((int[]) objArr[2])[0];
        if (i9 != i8) {
            long j = -1;
            long j2 = ((long) (i9 ^ i8)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4534), (ViewConfiguration.getScrollBarSize() >> 8) + 6054, TextUtils.lastIndexOf("", '0', 0) + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                try {
                    Object[] objArr14 = {1744309113, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) TextUtils.indexOf("", "", 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6029, 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    byte[] bArr6 = $$g;
                    Object[] objArr15 = new Object[1];
                    c((byte) (bArr6[52] + 1), bArr6[11], (byte) (-bArr6[57]), objArr15);
                    cls4.getMethod((String) objArr15[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr14);
                    int i10 = AudioAttributesImplApi26Parcelizer + 13;
                    MediaBrowserCompatItemReceiver = i10 % 128;
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
        AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer.setText(this.AudioAttributesCompatParcelizer);
        CustomTextView customTextView = AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        PlayerControlViewExternalSyntheticLambda1.write((View) customTextView);
        String str = this.read;
        if (str != null && str.length() != 0) {
            AudioAttributesImplBaseParcelizer().IconCompatParcelizer.setText(this.read);
        }
        CustomButton customButton = AudioAttributesImplBaseParcelizer().IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customButton, "");
        RemoteActionCompatParcelizer(customButton, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.getTotalAllocatableBandwidth
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return canSelectFormat.read(this.read);
            }
        });
    }

    private static final getShowPopup AudioAttributesCompatParcelizer(canSelectFormat canselectformat) {
        int i = 2 % 2;
        if (canselectformat.RemoteActionCompatParcelizer != -1) {
            int i2 = MediaBrowserCompatItemReceiver + 65;
            AudioAttributesImplApi26Parcelizer = i2 % 128;
            int i3 = i2 % 2;
            getProvider getprovider = getProvider.getInstance(canselectformat.getContext());
            isExtendedWestEuropeanChar.Companion companion = isExtendedWestEuropeanChar.INSTANCE;
            getprovider.AudioAttributesCompatParcelizer(isExtendedWestEuropeanChar.Companion.read(canselectformat.RemoteActionCompatParcelizer, null));
            int i4 = MediaBrowserCompatItemReceiver + 51;
            AudioAttributesImplApi26Parcelizer = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 3;
            }
        }
        canselectformat.dismiss();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i6 = MediaBrowserCompatItemReceiver + 91;
        AudioAttributesImplApi26Parcelizer = i6 % 128;
        int i7 = i6 % 2;
        return getshowpopup;
    }

    public final int RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer;
        int i3 = i2 + 97;
        MediaBrowserCompatItemReceiver = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.RemoteActionCompatParcelizer;
        int i6 = i2 + 119;
        MediaBrowserCompatItemReceiver = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final void write(String p0) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 27;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        this.read = p0;
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
    }

    public static /* synthetic */ getShowPopup read(canSelectFormat canselectformat) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 11;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            return AudioAttributesCompatParcelizer(canselectformat);
        }
        AudioAttributesCompatParcelizer(canselectformat);
        throw null;
    }

    static {
        AudioAttributesImplBaseParcelizer = 0;
        IconCompatParcelizer();
        INSTANCE = new Companion(null);
        int i = AudioAttributesImplApi21Parcelizer + 71;
        AudioAttributesImplBaseParcelizer = i % 128;
        if (i % 2 != 0) {
            int i2 = 52 / 0;
        }
    }

    static void IconCompatParcelizer() {
        MediaBrowserCompatCustomActionResultReceiver = 1000326186;
    }
}
