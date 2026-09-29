package kotlin;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014"}, d2 = {"Lo/getMaxVideoPixelsToRetainForViewport;", "Lo/shouldEvaluateQueueSize;", "Lo/RepresentationMultiSegmentRepresentation;", "Landroid/content/Context;", "p0", "", "p1", "p2", "p3", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "IconCompatParcelizer", "()Lo/RepresentationMultiSegmentRepresentation;", "Landroid/os/Bundle;", "", "onCreate", "(Landroid/os/Bundle;)V", "RemoteActionCompatParcelizer", "()V", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "AudioAttributesCompatParcelizer", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getMaxVideoPixelsToRetainForViewport extends shouldEvaluateQueueSize<RepresentationMultiSegmentRepresentation> {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String IconCompatParcelizer;
    private static final byte[] $$g = {5, 107, -8, 109, -61, 61, 2, 19, -47, 39, 10, 15, 2, 5, -11, 3, -11, 31, 7, 5, 2, -9, 0, 16, -35, 45, 7, -1, -8, 23, 23, 12, 6, 9, -11, -32, 38, 21, -7, 10, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17};
    private static final int $$h = 114;
    private static final byte[] $$a = {0, -75, -45, -77, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 191;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int MediaBrowserCompatItemReceiver = 1;
    private static char[] RemoteActionCompatParcelizer = {28516, 28527, 28536, 28576, 28514, 28512, 28521, 28509, 28535, 28541, 28538, 28523, 28515, 28519, 28522, 28486, 28518, 28493, 28513, 28540, 28525, 28517, 28542, 28508};
    private static int write = 411398030;
    private static boolean AudioAttributesImplBaseParcelizer = true;
    private static boolean MediaBrowserCompatCustomActionResultReceiver = true;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.getMaxVideoPixelsToRetainForViewport.$$a
            int r7 = r7 * 10
            int r1 = 44 - r7
            int r8 = r8 * 12
            int r8 = 77 - r8
            int r6 = 80 - r6
            byte[] r1 = new byte[r1]
            int r7 = 43 - r7
            r2 = -1
            if (r0 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            int r3 = r3 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r1, r7)
            r9[r7] = r6
            return
        L28:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2f:
            int r3 = r3 + r6
            int r6 = r8 + 1
            int r8 = r3 + (-1)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getMaxVideoPixelsToRetainForViewport.a(int, byte, byte, java.lang.Object[]):void");
    }

    private static void c(byte b, byte b2, short s, Object[] objArr) {
        int i = (s * 29) + 82;
        byte[] bArr = $$g;
        int i2 = 30 - (b2 * 26);
        byte[] bArr2 = new byte[28 - b];
        int i3 = 27 - b;
        int i4 = -1;
        if (bArr == null) {
            i = (i2 + i3) - 4;
            i2++;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i;
            if (i4 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i5 = i;
            i = (i5 + bArr[i2]) - 4;
            i2++;
        }
    }

    @Override // kotlin.shouldEvaluateQueueSize
    public final /* synthetic */ getApplicationLabel write() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 43;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        RepresentationMultiSegmentRepresentation representationMultiSegmentRepresentationIconCompatParcelizer = IconCompatParcelizer();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = AudioAttributesImplApi26Parcelizer + 111;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
        return representationMultiSegmentRepresentationIconCompatParcelizer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getMaxVideoPixelsToRetainForViewport(Context context, String str, String str2, String str3) {
        super(context, CmcdConfigurationRequestConfig.read());
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.AudioAttributesCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
    }

    private RepresentationMultiSegmentRepresentation IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 59;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        RepresentationMultiSegmentRepresentation representationMultiSegmentRepresentationIconCompatParcelizer = RepresentationMultiSegmentRepresentation.IconCompatParcelizer(getLayoutInflater());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(representationMultiSegmentRepresentationIconCompatParcelizer, "");
        int i4 = AudioAttributesImplApi26Parcelizer + 29;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
        return representationMultiSegmentRepresentationIconCompatParcelizer;
    }

    private static void b(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr2 = RemoteActionCompatParcelizer;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (44862 - (ViewConfiguration.getEdgeSlop() >> 16)), 18944 - Color.argb(0, 0, 0, 0), 28 - KeyEvent.getDeadChar(0, 0), -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
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
        try {
            Object[] objArr3 = {Integer.valueOf(write)};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getTrimmedLength(""), 19032 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 75, 1457087504, false, "r", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
            if (MediaBrowserCompatCustomActionResultReceiver) {
                notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
                char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                notifydownloads.IconCompatParcelizer = 0;
                while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                    int i4 = $10 + 73;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                    Object[] objArr4 = {notifydownloads, notifydownloads};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getEdgeSlop() >> 16), 11439 - TextUtils.indexOf("", "", 0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!AudioAttributesImplBaseParcelizer) {
                notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
                char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                notifydownloads.IconCompatParcelizer = 0;
                while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                    cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr2[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                    notifydownloads.IconCompatParcelizer++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
            char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                int i6 = $10 + 101;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                Object[] objArr5 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 11438, KeyEvent.keyCodeFromString("") + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private static final getShowPopup read(getMaxVideoPixelsToRetainForViewport getmaxvideopixelstoretainforviewport, View view) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 117;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(view, "");
        joinWithSeparator.RemoteActionCompatParcelizer(getmaxvideopixelstoretainforviewport.getContext(), getmaxvideopixelstoretainforviewport.AudioAttributesCompatParcelizer);
        getmaxvideopixelstoretainforviewport.dismiss();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = AudioAttributesImplApi26Parcelizer + 9;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    @Override // kotlin.shouldEvaluateQueueSize, kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        char c;
        String string;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char absoluteGravity = (char) (13183 - Gravity.getAbsoluteGravity(0, 0));
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1649;
            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 26;
            byte b = $$a[0];
            Object[] objArr2 = new Object[1];
            a((byte) 76, b, b, objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(absoluteGravity, longPressTimeout, iKeyCodeFromString, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 13184);
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1649;
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 27;
                byte[] bArr = $$a;
                byte b2 = (byte) (-bArr[39]);
                byte b3 = bArr[53];
                Object[] objArr3 = new Object[1];
                a(b2, b3, b3, objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(cIndexOf, doubleTapTimeout, iLastIndexOf, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
            c = 3;
        } else {
            Object[] objArr4 = new Object[1];
            b(TextUtils.indexOf("", "", 0, 0) + 127, new byte[]{-115, -116, -117, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, null, null, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b(127 - TextUtils.getTrimmedLength(""), new byte[]{-116, -113, -109, -110, -111, -118, -126, -112, -119, -117, -114, -117, -122, -116, -113, -114}, null, null, objArr5);
            int iIntValue = ((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue();
            int i2 = AudioAttributesImplApi26Parcelizer + 47;
            int i3 = i2 % 128;
            MediaBrowserCompatItemReceiver = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 123;
            AudioAttributesImplApi26Parcelizer = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -312840758};
                byte[] bArr2 = $$g;
                byte b4 = bArr2[53];
                byte b5 = b4;
                Object[] objArr7 = new Object[1];
                c(b4, b5, b5, objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                byte b6 = bArr2[22];
                byte b7 = b6;
                Object[] objArr8 = new Object[1];
                c(b6, b7, b7, objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char c2 = (char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13182);
                    int i7 = 1650 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int iKeyCodeFromString2 = 26 - KeyEvent.keyCodeFromString("");
                    byte[] bArr3 = $$a;
                    byte b8 = (byte) (-bArr3[39]);
                    byte b9 = bArr3[53];
                    Object[] objArr9 = new Object[1];
                    a(b8, b9, b9, objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(c2, i7, iKeyCodeFromString2, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b((ViewConfiguration.getWindowTouchSlop() >> 8) + 127, new byte[]{-106, -107, -109, -123, -110, -115, -116, -117, -118, -119, -120, -124, -118, -109, -124, -113, -114, -109, -108, -113, -122, -126}, null, null, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b((ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, new byte[]{-116, -115, -114, -117, -123, -126, -116, -104, -113, -116, -118, -105, -126, -123, -116}, null, null, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 13183);
                        int keyRepeatDelay = 1649 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int i8 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25;
                        byte[] bArr4 = $$a;
                        byte b10 = bArr4[0];
                        byte b11 = bArr4[53];
                        Object[] objArr12 = new Object[1];
                        a(b10, b11, b11, objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(threadPriority, keyRepeatDelay, i8, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char c3 = (char) (13184 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 1649;
                        int i9 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 26;
                        byte b12 = $$a[0];
                        Object[] objArr13 = new Object[1];
                        a((byte) 76, b12, b12, objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(c3, longPressTimeout2, i9, -133433128, false, (String) objArr13[0], null);
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
        int i10 = ((int[]) objArr[c])[0];
        int i11 = ((int[]) objArr[2])[0];
        if (i11 != i10) {
            long j = -1;
            long j2 = ((long) (i10 ^ i11)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (TextUtils.indexOf("", "", 0) + 4535), (Process.myTid() >> 22) + 6054, 42 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                try {
                    Object[] objArr14 = {-1840910504, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6029, TextUtils.getTrimmedLength("") + 24);
                    byte b13 = $$g[22];
                    byte b14 = b13;
                    Object[] objArr15 = new Object[1];
                    c(b13, b14, b14, objArr15);
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
        PackageManager packageManager = getContext().getPackageManager();
        CustomButton customButton = AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customButton, "");
        ImageView imageView = AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        CustomTextView customTextView = AudioAttributesImplBaseParcelizer().IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        read(new View[]{customButton, imageView, customTextView}, (getAnswerMap<? super View, getShowPopup>) new getAnswerMap() { // from class: o.collectTrackSelectionOverrides
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getMaxVideoPixelsToRetainForViewport.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, (View) obj);
            }
        });
        try {
            Drawable applicationIcon = packageManager.getApplicationIcon(this.AudioAttributesCompatParcelizer);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(applicationIcon, "");
            if (Build.VERSION.SDK_INT >= 33) {
                int i12 = AudioAttributesImplApi26Parcelizer + 21;
                MediaBrowserCompatItemReceiver = i12 % 128;
                if (i12 % 2 == 0) {
                    packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.AudioAttributesCompatParcelizer, PackageManager.ApplicationInfoFlags.of(131072L))).toString();
                    throw null;
                }
                string = packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.AudioAttributesCompatParcelizer, PackageManager.ApplicationInfoFlags.of(131072L))).toString();
            } else {
                string = packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.AudioAttributesCompatParcelizer, 0)).toString();
                int i13 = AudioAttributesImplApi26Parcelizer + 89;
                MediaBrowserCompatItemReceiver = i13 % 128;
                int i14 = i13 % 2;
            }
            if (TestGroupLSModel.IconCompatParcelizer((CharSequence) string)) {
                RemoteActionCompatParcelizer();
                return;
            }
            IconCompatParcelizer(string, this.AudioAttributesCompatParcelizer);
            AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer.setImageDrawable(applicationIcon);
            CustomTextView customTextView2 = AudioAttributesImplBaseParcelizer().IconCompatParcelizer;
            String str = string;
            if (TestGroupLSModel.IconCompatParcelizer((CharSequence) str)) {
                int i15 = AudioAttributesImplApi26Parcelizer + 113;
                MediaBrowserCompatItemReceiver = i15 % 128;
                int i16 = i15 % 2;
                str = this.AudioAttributesCompatParcelizer;
            }
            customTextView2.setText(str);
            int i17 = AudioAttributesImplApi26Parcelizer + 45;
            MediaBrowserCompatItemReceiver = i17 % 128;
            if (i17 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (PackageManager.NameNotFoundException unused2) {
            IconCompatParcelizer("Not Found", this.AudioAttributesCompatParcelizer);
            RemoteActionCompatParcelizer();
        }
    }

    private final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        LinearLayout linearLayout = AudioAttributesImplBaseParcelizer().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(linearLayout);
        AudioAttributesImplBaseParcelizer().write.setText(R.string.text_following_app_casting_no_pkg);
        CustomButton customButton = AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customButton, "");
        RemoteActionCompatParcelizer(customButton, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.getMaxVideoSizeInViewport
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getMaxVideoPixelsToRetainForViewport.read(this.write);
            }
        });
        int i2 = AudioAttributesImplApi26Parcelizer + 33;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final getShowPopup RemoteActionCompatParcelizer(getMaxVideoPixelsToRetainForViewport getmaxvideopixelstoretainforviewport) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 23;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            getmaxvideopixelstoretainforviewport.dismiss();
            int i3 = 14 / 0;
            return getShowPopup.INSTANCE;
        }
        getmaxvideopixelstoretainforviewport.dismiss();
        return getShowPopup.INSTANCE;
    }

    private final void IconCompatParcelizer(String p0, String p1) {
        int i = 2 % 2;
        Context context = getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        int iIconCompatParcelizer = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
        RtspHeadersBuilder.IconCompatParcelizer().write(new Pair<>("casting", VideoTimelineResponseBody.RemoteActionCompatParcelizer(new Pair("in_dex", String.valueOf(((Boolean) updateShuffleButton.IconCompatParcelizer(MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), -1519222840, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), 1519222843, new Object[]{context}, iIconCompatParcelizer)).booleanValue())), new Pair("default_route", this.IconCompatParcelizer), new Pair("selected_route", this.read), new Pair("app_name", p0), new Pair("pkg_name", p1))), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
        int i2 = MediaBrowserCompatItemReceiver + 79;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getShowPopup read(getMaxVideoPixelsToRetainForViewport getmaxvideopixelstoretainforviewport) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 121;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getmaxvideopixelstoretainforviewport);
        int i4 = AudioAttributesImplApi26Parcelizer + 59;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopupRemoteActionCompatParcelizer;
    }

    public static /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(getMaxVideoPixelsToRetainForViewport getmaxvideopixelstoretainforviewport, View view) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 113;
        MediaBrowserCompatItemReceiver = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            read(getmaxvideopixelstoretainforviewport, view);
            obj.hashCode();
            throw null;
        }
        getShowPopup getshowpopup = read(getmaxvideopixelstoretainforviewport, view);
        int i3 = MediaBrowserCompatItemReceiver + 39;
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        if (i3 % 2 == 0) {
            return getshowpopup;
        }
        throw null;
    }
}
