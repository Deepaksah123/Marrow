package kotlin;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.TrainingApplication;
import com.marrow.ui.views.CustomTextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.isExtendedWestEuropeanChar;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0010\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0010\u0010\u0017J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0016¢\u0006\u0004\b\u0014\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0010\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u0016\u0010\u0014\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d"}, d2 = {"Lo/isDolbyAudio;", "Lo/shouldEvaluateQueueSize;", "Lo/SegmentBase;", "Landroid/content/Context;", "p0", "", "p1", "Landroid/os/Bundle;", "p2", "<init>", "(Landroid/content/Context;ILandroid/os/Bundle;)V", "AudioAttributesImplApi21Parcelizer", "()Lo/SegmentBase;", "", "onCreate", "(Landroid/os/Bundle;)V", "read", "(I)V", "IconCompatParcelizer", "()V", "RemoteActionCompatParcelizer", "onBackPressed", "", "(Ljava/lang/String;)V", "MediaBrowserCompatItemReceiver", "I", "AudioAttributesCompatParcelizer", "Landroid/os/Bundle;", "write", "Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class isDolbyAudio extends shouldEvaluateQueueSize<SegmentBase> {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final Bundle write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private String MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private int read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;
    private static final byte[] $$g = {118, 56, TarConstants.LF_SYMLINK, 93, -61, 61, 2, 19, -47, 39, 10, 15, 2, 5, -11, 3, -11, 31, 7, 5, 2, -9, 0, 16, -35, 45, 7, -1, -8, 23, 23, 12, 6, 9, -11, -32, 38, 21, -7, 10, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17};
    private static final int $$h = 218;
    private static final byte[] $$a = {3, 110, -29, 16, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 243;
    private static int AudioAttributesImplBaseParcelizer = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;
    private static int MediaBrowserCompatItemReceiver = 1000326251;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 12
            int r6 = 77 - r6
            int r7 = r7 * 10
            int r7 = r7 + 34
            byte[] r0 = kotlin.isDolbyAudio.$$a
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r6
            r6 = r7
            r4 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r8]
        L27:
            int r6 = r6 + r3
            int r8 = r8 + 1
            int r6 = r6 + (-1)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isDolbyAudio.a(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = kotlin.isDolbyAudio.$$g
            int r6 = r6 * 26
            int r6 = 30 - r6
            int r7 = r7 * 29
            int r7 = r7 + 82
            int r1 = 28 - r5
            byte[] r1 = new byte[r1]
            int r5 = 27 - r5
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r6]
        L28:
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-4)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isDolbyAudio.c(int, int, short, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object read(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i5;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i2);
        int i11 = (~i2) | i7;
        int i12 = i10 | (~(i11 | i5));
        int i13 = (~(i2 | i7)) | (~i9);
        int i14 = (~i11) | (~(i8 | i));
        int i15 = i + i5 + i4 + (783392123 * i3) + ((-786872706) * i6);
        int i16 = i15 * i15;
        int i17 = ((-1525980173) * i) + 1729888256 + (218870266 * i5) + (i12 * 1744850439) + ((-805266418) * i13) + (1744850439 * i14) + (1963720704 * i4) + ((-1731985408) * i3) + ((-471334912) * i6) + ((-600899584) * i16);
        int i18 = (i * 375823119) + 1642083618 + (i5 * 375823682) + (i12 * 563) + (i13 * 1126) + (i14 * 563) + (i4 * 375824245) + (i3 * (-117547465)) + (i6 * 763984278) + (i16 * (-763691008));
        return i17 + ((i18 * i18) * 1830354944) != 1 ? AudioAttributesCompatParcelizer(objArr) : IconCompatParcelizer(objArr);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ isDolbyAudio(Context context, int i, Bundle bundle, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        if ((i2 & 4) != 0) {
            int i3 = MediaBrowserCompatCustomActionResultReceiver + 107;
            int i4 = i3 % 128;
            AudioAttributesImplBaseParcelizer = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 111;
            MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            bundle = null;
        }
        this(context, i, bundle);
    }

    @Override // kotlin.shouldEvaluateQueueSize
    public final /* synthetic */ getApplicationLabel write() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 55;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        SegmentBase segmentBaseAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        if (i3 == 0) {
            int i4 = 33 / 0;
        }
        return segmentBaseAudioAttributesImplApi21Parcelizer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private isDolbyAudio(Context context, int i, Bundle bundle) {
        super(context, CmcdConfigurationRequestConfig.read());
        toMagicModuleMetaRepoModel.write(context, "");
        this.IconCompatParcelizer = i;
        this.write = bundle;
    }

    private SegmentBase AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 3;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        SegmentBase segmentBaseIconCompatParcelizer = SegmentBase.IconCompatParcelizer(getLayoutInflater());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(segmentBaseIconCompatParcelizer, "");
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = AudioAttributesImplBaseParcelizer + 27;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
        return segmentBaseIconCompatParcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(int r23, boolean r24, char[] r25, int r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isDolbyAudio.b(int, boolean, char[], int, int, java.lang.Object[]):void");
    }

    private static final getShowPopup RemoteActionCompatParcelizer(isDolbyAudio isdolbyaudio) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 25;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        getProvider getprovider = getProvider.getInstance(isdolbyaudio.getContext());
        isExtendedWestEuropeanChar.Companion iconCompatParcelizer = isExtendedWestEuropeanChar.INSTANCE;
        getprovider.AudioAttributesCompatParcelizer(isExtendedWestEuropeanChar.Companion.AudioAttributesCompatParcelizer(isdolbyaudio.IconCompatParcelizer, isdolbyaudio.write));
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = AudioAttributesImplBaseParcelizer + 33;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    @Override // kotlin.shouldEvaluateQueueSize, kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char windowTouchSlop = (char) (13183 - (ViewConfiguration.getWindowTouchSlop() >> 8));
            int defaultSize = View.getDefaultSize(0, 0) + 1649;
            int iMyPid = (Process.myPid() >> 22) + 26;
            byte b = $$a[5];
            Object[] objArr2 = new Object[1];
            a(b, r2[53], b, objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(windowTouchSlop, defaultSize, iMyPid, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) == -1) {
            Object[] objArr3 = new Object[1];
            b(13 - (ViewConfiguration.getLongPressTimeout() >> 16), true, new char[]{17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18}, 16 - View.resolveSize(0, 0), 178 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(4 - TextUtils.indexOf("", "", 0, 0), false, new char[]{65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2}, TextUtils.lastIndexOf("", '0') + 17, (Process.myTid() >> 22) + 182, objArr4);
            try {
                Object[] objArr5 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue()), 0, 743027402};
                byte[] bArr = $$g;
                byte b2 = bArr[53];
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                c(b2, b3, b3, objArr6);
                Class<?> cls2 = Class.forName((String) objArr6[0]);
                byte b4 = bArr[22];
                byte b5 = b4;
                Object[] objArr7 = new Object[1];
                c(b4, b5, b5, objArr7);
                objArr = (Object[]) cls2.getMethod((String) objArr7[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr5);
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char size = (char) (View.MeasureSpec.getSize(0) + 13183);
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 1650;
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 26;
                    Object[] objArr8 = new Object[1];
                    a(r12[53], r12[5], (byte) (-$$a[27]), objArr8);
                    objRemoteActionCompatParcelizer2 = startForeground.read(size, bitsPerPixel, iResolveOpacity, -1033747278, false, (String) objArr8[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer2).set(null, objArr);
                try {
                    Object[] objArr9 = new Object[1];
                    b(13 - Color.blue(0), true, new char[]{22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16}, TextUtils.lastIndexOf("", '0') + 23, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 178, objArr9);
                    Class<?> cls3 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    b(TextUtils.indexOf((CharSequence) "", '0', 0) + 11, false, new char[]{65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f'}, 15 - TextUtils.indexOf("", "", 0), 183 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr10);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        char cNormalizeMetaState = (char) (13183 - KeyEvent.normalizeMetaState(0));
                        int scrollBarSize = 1649 - (ViewConfiguration.getScrollBarSize() >> 8);
                        int i2 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 25;
                        byte[] bArr2 = $$a;
                        byte b6 = bArr2[53];
                        byte b7 = bArr2[5];
                        Object[] objArr11 = new Object[1];
                        a(b6, b7, (byte) (b7 | TarConstants.LF_GNUTYPE_LONGNAME), objArr11);
                        objRemoteActionCompatParcelizer3 = startForeground.read(cNormalizeMetaState, scrollBarSize, i2, 54351865, false, (String) objArr11[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer3).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 13183);
                        int iBlue = 1649 - Color.blue(0);
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 26;
                        byte b8 = $$a[5];
                        Object[] objArr12 = new Object[1];
                        a(b8, r9[53], b8, objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(cIndexOf, iBlue, packedPositionType, -133433128, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf2);
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
        } else {
            int i3 = MediaBrowserCompatCustomActionResultReceiver + 31;
            AudioAttributesImplBaseParcelizer = i3 % 128;
            int i4 = i3 % 2;
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer5 == null) {
                char mode = (char) (13183 - View.MeasureSpec.getMode(0));
                int modifierMetaStateMask = 1648 - ((byte) KeyEvent.getModifierMetaStateMask());
                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 26;
                Object[] objArr13 = new Object[1];
                a(r2[53], r2[5], (byte) (-$$a[27]), objArr13);
                objRemoteActionCompatParcelizer5 = startForeground.read(mode, modifierMetaStateMask, fadingEdgeLength, -1033747278, false, (String) objArr13[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer5).get(null);
            c = 3;
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
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (4536 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 6054 - (ViewConfiguration.getLongPressTimeout() >> 16), 42 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                try {
                    Object[] objArr14 = {-1386734296, Long.valueOf(j3), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 6029 - ExpandableListView.getPackedPositionChild(0L), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24);
                    byte b9 = $$g[22];
                    byte b10 = b9;
                    Object[] objArr15 = new Object[1];
                    c(b9, b10, b10, objArr15);
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
        AudioAttributesImplBaseParcelizer().write.setText(this.read);
        if (this.RemoteActionCompatParcelizer == 0) {
            CustomTextView customTextView = AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(customTextView);
        } else {
            AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer.setText(this.RemoteActionCompatParcelizer);
        }
        AudioAttributesImplBaseParcelizer().read.setText(this.AudioAttributesCompatParcelizer);
        String str = this.MediaBrowserCompatItemReceiver;
        if (str != null && str.length() != 0) {
            CustomTextView customTextView2 = AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView2, "");
            PlayerControlViewExternalSyntheticLambda1.write((View) customTextView2);
            AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer.setText(this.MediaBrowserCompatItemReceiver);
        }
        CustomTextView customTextView3 = AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView3, "");
        RemoteActionCompatParcelizer(customTextView3, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.isAudioFormatWithinAudioChannelCountConstraints
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return isDolbyAudio.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
            }
        });
        Button button = AudioAttributesImplBaseParcelizer().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(button, "");
        RemoteActionCompatParcelizer(button, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.getVideoCodecPreferenceScore
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return isDolbyAudio.read(this.AudioAttributesCompatParcelizer);
            }
        });
        int i7 = MediaBrowserCompatCustomActionResultReceiver + 69;
        AudioAttributesImplBaseParcelizer = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 71 / 0;
        }
    }

    private static final getShowPopup IconCompatParcelizer(isDolbyAudio isdolbyaudio) {
        getShowPopup getshowpopup;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 19;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            getProvider getprovider = getProvider.getInstance(isdolbyaudio.getContext());
            isExtendedWestEuropeanChar.Companion iconCompatParcelizer = isExtendedWestEuropeanChar.INSTANCE;
            getprovider.AudioAttributesCompatParcelizer(isExtendedWestEuropeanChar.Companion.read(isdolbyaudio.IconCompatParcelizer, isdolbyaudio.write));
            getshowpopup = getShowPopup.INSTANCE;
            int i3 = 91 / 0;
        } else {
            getProvider getprovider2 = getProvider.getInstance(isdolbyaudio.getContext());
            isExtendedWestEuropeanChar.Companion iconCompatParcelizer2 = isExtendedWestEuropeanChar.INSTANCE;
            getprovider2.AudioAttributesCompatParcelizer(isExtendedWestEuropeanChar.Companion.read(isdolbyaudio.IconCompatParcelizer, isdolbyaudio.write));
            getshowpopup = getShowPopup.INSTANCE;
        }
        int i4 = AudioAttributesImplBaseParcelizer + 73;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return getshowpopup;
        }
        throw null;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        isDolbyAudio isdolbyaudio = (isDolbyAudio) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver;
        int i3 = i2 + 105;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
        isdolbyaudio.read = iIntValue;
        int i5 = i2 + 9;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final void IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 39;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = R.string.cancel;
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
    }

    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 11;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            read(getContext().getString(com.marrow.R.string.payment_cnf_mail_message));
            int i3 = 57 / 0;
        } else {
            read(getContext().getString(com.marrow.R.string.payment_cnf_mail_message));
        }
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 49;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // kotlin.onFastForward, android.app.Dialog
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 125;
        int i3 = i2 % 128;
        MediaBrowserCompatCustomActionResultReceiver = i3;
        int i4 = i2 % 2;
        int i5 = this.IconCompatParcelizer;
        if (i5 == 0) {
            int i6 = i3 + 73;
            AudioAttributesImplBaseParcelizer = i6 % 128;
            int i7 = i6 % 2;
            if (i5 == 1 && i5 == 2) {
                return;
            }
        }
        super.onBackPressed();
    }

    public final void read(String p0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 39;
        int i3 = i2 % 128;
        AudioAttributesImplBaseParcelizer = i3;
        int i4 = i2 % 2;
        this.AudioAttributesCompatParcelizer = p0;
        int i5 = i3 + 71;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        isDolbyAudio isdolbyaudio = (isDolbyAudio) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 109;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(str, "");
            isdolbyaudio.MediaBrowserCompatItemReceiver = str;
            return null;
        }
        toMagicModuleMetaRepoModel.write(str, "");
        isdolbyaudio.MediaBrowserCompatItemReceiver = str;
        throw null;
    }

    public final void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 77;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        String string = getContext().getString(com.marrow.R.string.taking_longer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        read(-1199223675, new Object[]{this, string}, getColorInfoString.write(), getColorInfoString.write(), getColorInfoString.write(), 1199223676, getColorInfoString.write());
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 23;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
    }

    public static /* synthetic */ getShowPopup read(isDolbyAudio isdolbyaudio) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 95;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupIconCompatParcelizer = IconCompatParcelizer(isdolbyaudio);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 103;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopupIconCompatParcelizer;
    }

    public static /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(isDolbyAudio isdolbyaudio) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 21;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(isdolbyaudio);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 91;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopupRemoteActionCompatParcelizer;
    }

    public final void read(int p0) {
        read(742101932, new Object[]{this, Integer.valueOf(p0)}, getColorInfoString.write(), getColorInfoString.write(), getColorInfoString.write(), -742101932, getColorInfoString.write());
    }

    private void RemoteActionCompatParcelizer(String p0) {
        read(-1199223675, new Object[]{this, p0}, getColorInfoString.write(), getColorInfoString.write(), getColorInfoString.write(), 1199223676, getColorInfoString.write());
    }
}
