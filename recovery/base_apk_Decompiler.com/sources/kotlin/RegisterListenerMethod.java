package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.RegistrationMethodsBuilder;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/RegisterListenerMethod;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RegisterListenerMethod extends OptionalPendingResultImpl {
    private static int[] AudioAttributesCompatParcelizer;
    private static long IconCompatParcelizer;
    private static int read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final byte[] $$l = {10, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 13, 109};
    private static final int $$m = 105;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {118, 56, TarConstants.LF_SYMLINK, 93, -59, 29, 57, -3, -25, 34, -5, 30, -14, 19, -35, 42, 9, 2, -35, TarConstants.LF_SYMLINK, 4, 9, 5, 5, -3, 15, 12, -34, 35, 16, 7, -9, 15, -3, 19, -39, 57, 2, -9, 19, 2, -7, 17, -19, 44, -5, 12, -6, 3, 21, -5, 0, -17, 27, 18, -5, 8, 3, -41, 32, 18, 5, -37, TarConstants.LF_SYMLINK, 4, 9, -9, 25, -30, 23, 23, -9, 8, 13, 3, 23, -15, 19, 25, 14, 8, 11, -9, -30, 40, 23, -5, 12, 5, -37, TarConstants.LF_SYMLINK, 4, 9, -9, 25, -30, 23, 23, -9, 8, 13, 3, 23, -15, 19, 18, 4, -57, 62, 1, 24, 7, -9, 19, 12, -5, 5, -56, 66, -3, 8, 14, 14, 2, 5, -58, 60, 3, 25, -13, 7, 13, 11, -4, -48, 66, 0, 13, -52, 9, 0, 34, 0, 13, -20, 9, 39, 37, -5, 9, -66, TarConstants.LF_BLK, 21, 28, -29, 43, -3, -5, -17, 25, 18, -2, 58, -11, 11, 12, -40, 57, 6, 4, -3, -1, 25, 5, -9, 20, -42, TarConstants.LF_SYMLINK, 4, 9, -9, 25, -30, 23, 23, -9, 8, 13, 3, 23, -15, 19};
    private static final int $$k = 196;
    private static final byte[] $$d = {33, 74, 31, 28, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 195;
    private static int AudioAttributesImplBaseParcelizer = 0;
    private static int AudioAttributesImplApi21Parcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(short r6, int r7, int r8) {
        /*
            int r6 = r6 * 3
            int r6 = 4 - r6
            int r7 = r7 * 3
            int r7 = 1 - r7
            int r8 = r8 * 2
            int r8 = r8 + 104
            byte[] r0 = kotlin.RegisterListenerMethod.$$l
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2a
        L17:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L28:
            r4 = r0[r8]
        L2a:
            int r6 = r6 + r4
            int r8 = r8 + 1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.RegisterListenerMethod.$$n(short, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r8 = r8 + 4
            int r6 = 114 - r6
            byte[] r0 = kotlin.RegisterListenerMethod.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r6 = r7
            r4 = r8
            r3 = r2
            goto L26
        L11:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r4 = r0[r6]
        L26:
            int r7 = r7 + r4
            int r6 = r6 + 1
            int r7 = r7 + (-1)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.RegisterListenerMethod.g(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r0 = 58 - r6
            int r5 = r5 + 4
            int r7 = r7 + 65
            byte[] r1 = kotlin.RegisterListenerMethod.$$j
            byte[] r0 = new byte[r0]
            int r6 = 57 - r6
            r2 = -1
            if (r1 != 0) goto L12
            r7 = r5
            r3 = r6
            goto L29
        L12:
            r4 = r7
            r7 = r5
            r5 = r4
        L15:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r0[r2] = r3
            if (r2 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L25:
            int r7 = r7 + 1
            r3 = r1[r7]
        L29:
            int r5 = r5 + r3
            int r5 = r5 + (-6)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.RegisterListenerMethod.h(short, short, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.RegisterListenerMethod$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/RegisterListenerMethod$write;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Intent AudioAttributesCompatParcelizer(Context p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new Intent(p0, (Class<?>) RegisterListenerMethod.class);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void e(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(IconCompatParcelizer ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        int i3 = $10 + 27;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i5 = $10 + 31;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i7 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(IconCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 12424 - (Process.myPid() >> 22), 20 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) View.MeasureSpec.getMode(0), 1868 - TextUtils.getTrimmedLength(""), 10 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1983509525, false, $$n(b, b2, b2), new Class[]{Object.class, Object.class});
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

    private static void f(int i, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = AudioAttributesCompatParcelizer;
        int i3 = -470782045;
        int i4 = 43695;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i5 = 0;
            while (i5 < length2) {
                int i6 = $10 + 61;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i5])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (i4 - Color.argb(0, 0, 0, 0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 23296, View.MeasureSpec.makeMeasureSpec(0, 0) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr4[i5] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i5++;
                    i4 = 43695;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = AudioAttributesCompatParcelizer;
        int i8 = 16;
        if (iArr6 != null) {
            int i9 = $10 + 29;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i10 = 0;
            while (i10 < length) {
                Object[] objArr3 = {Integer.valueOf(iArr6[i10])};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(i3);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (43695 - (ViewConfiguration.getPressedStateDuration() >> i8)), (ViewConfiguration.getTouchSlop() >> 8) + 23297, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16, -1648776394, false, "A", new Class[]{Integer.TYPE});
                }
                iArr2[i10] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                i10++;
                int i11 = $11 + 99;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                i8 = 16;
                i3 = -470782045;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = 0;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            cArr[0] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr5);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                int i15 = $10 + 125;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[i13];
                Object[] objArr4 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (View.combineMeasuredStates(0, 0) + 43695), 23296 - TextUtils.lastIndexOf("", '0'), 16 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                buildremovealldownloadsintent.read = iIntValue;
                i13++;
            }
            int i17 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i17;
            buildremovealldownloadsintent.read ^= iArr5[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[17];
            int i18 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i19 = buildremovealldownloadsintent.read;
            cArr[0] = (char) (buildremovealldownloadsintent.AudioAttributesCompatParcelizer >>> 16);
            cArr[1] = (char) buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            cArr[2] = (char) (buildremovealldownloadsintent.read >>> 16);
            cArr[3] = (char) buildremovealldownloadsintent.read;
            buildRemoveAllDownloadsIntent.read(iArr5);
            cArr2[buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2] = cArr[0];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 1] = cArr[1];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 2] = cArr[2];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 3] = cArr[3];
            Object[] objArr5 = {buildremovealldownloadsintent, buildremovealldownloadsintent};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(516305436);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (48194 - View.resolveSizeAndState(0, 0, 0)), TextUtils.lastIndexOf("", '0', 0) + 20127, (ViewConfiguration.getWindowTouchSlop() >> 8) + 20, 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // kotlin.OptionalPendingResultImpl, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, new char[]{22929, 23024, 19423, 61483, 16113, 18849, 61045, 56521, 46998, 57780, 11353, 53101, 34094, 54214, 7563, 57787, 37595, 52578, 2990, 4118, 57410, 16022}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        e((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1, new char[]{22681, 22772, 28287, 54684, 12765, 18108, 2407, 15296, 46741}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 22, new int[]{430606296, 747748839, -2104414412, 60985945, -1880859299, -1334815896, 1028835954, -688293523, 1767812311, -375792826, 1012901291, -2102492894, 1350212382, 1439928415}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(0) - 37, new char[]{54598, 54565, 13388, 36771, 9315, 21285, 28019, 24527, 15179, 40480, 14029, 19460, 2534, 44118, 1869, 25220, 7709, 45823, 4413, 37660, 27785, 16664}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i2 = AudioAttributesImplApi21Parcelizer + 3;
                AudioAttributesImplBaseParcelizer = i2 % 128;
                int i3 = i2 % 2;
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - View.MeasureSpec.makeMeasureSpec(0, 0)), KeyEvent.keyCodeFromString("") + 6054, 42 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 4, new char[]{65284, 65383, 4536, 43543, 4586, 26350, 10910, 6198, 4367, 48094, 787, 3018, 9184, 35300, 13017, 9529, 13401, 38668, 9446, 54445, 18068, 25831, 22105, 50880, 22335, 29311, 31156, 61553, 26956, 17364, 27518, 58305, 31727, 20987, 39632, 40200, 35873, 16208, 36012, 36085, 40654, 3225, 48720, 48863, 44912, 6689, 41363, 43125, 49476, 60307, 54052, 23485}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 29, new int[]{-1327287061, -1945579998, 828419494, 1565992990, -279509825, -1322784163, -940914678, -1562182062, 1416846572, 902888207, 2073268986, 194560008, -1772305447, 809015467, 2020442884, -1995884812, -265592332, -835148561, -2029933406, 467235863, 290668528, -1092330266, -1476298231, -2012302932, -1182965520, 1810333435, 1724612678, -1148858242, -840241539, -540865790, 501875974, -525594157}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    f(64 - (ViewConfiguration.getTapTimeout() >> 16), new int[]{-1821148825, -695452664, -2103025237, 469924847, 1184882737, 1549397388, -992278569, -2024225042, 935893904, -234516190, 1749908816, 1984177976, -840754276, -1280158733, 980900816, 185877435, 729502840, -1321297889, 872595940, -1458543902, -1100584465, 1553418778, -1920459025, 739801902, -1970769698, -2021616651, -836887686, -873815569, 1405383849, -1238814368, -2015544426, 655946658}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, new char[]{15577, 15537, 13620, 36570, 51939, 48547, 2732, 14354, 53954, 40716, 55312, 11189, 57453, 44351, 59854, 1374, 63384, 45972, 65440, 62687, 34071, 16490, 36100, 59116, 38053, 22270, 41709, 53279, 43720, 26442, 45156, 50163, 47218, 30002, 16769, 48493, 20460, 7055, 22437, 44230, 23810, 10247, 25866, 40635, 27835, 16123, 31433, 34833, 718, 53067, 2080, 31627, 4169, 56615, 6552, 21867, 10239, 58289, 12218, 17609, 13597, 61521, 15665, 14048, 50414, 34531, 53913, 8239, 55863, 38746, 57444}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    e(Process.myTid() >> 22, new char[]{25408, 25465, 52404, 30464, 17409, 13060, 31016, 19410, 36102, 26244}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1, new int[]{1382900691, -505991992, 275981297, -1131233987, -1071070771, -494227268, 1832348792, -115666856, -1371113157, -432160700, 1250587079, 1300766996, -1720036095, -1579228035, 542119297, 1732065330, 420847384, 1118956030}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 6030 - Color.blue(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 23, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr12);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer3 == null) {
            char cLastIndexOf = (char) (13182 - TextUtils.lastIndexOf("", '0', 0));
            int iAxisFromString = MotionEvent.axisFromString("") + 1650;
            int i4 = 26 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            byte[] bArr = $$d;
            byte b = bArr[62];
            short s = bArr[5];
            Object[] objArr13 = new Object[1];
            g(b, s, (byte) (s | 40), objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(cLastIndexOf, iAxisFromString, i4, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char packedPositionType = (char) (13183 - ExpandableListView.getPackedPositionType(0L));
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1649;
                int i5 = (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 25;
                byte[] bArr2 = $$d;
                Object[] objArr14 = new Object[1];
                g(bArr2[9], (short) (-bArr2[27]), (byte) (-bArr2[8]), objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(packedPositionType, threadPriority, i5, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            f((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 15, new int[]{968792345, -1405023280, -2106487237, -848361874, -510294530, 1335177399, -1662137228, -1706772095}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 19, new int[]{-1373890328, -28271250, -658150555, -1403012649, -586006657, 592949924, 50428144, -175544480}, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, -739762958};
                byte[] bArr3 = $$j;
                short s2 = bArr3[171];
                byte b2 = bArr3[17];
                Object[] objArr18 = new Object[1];
                h(s2, b2, (byte) (b2 | 44), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                short s3 = (short) 54;
                Object[] objArr19 = new Object[1];
                h(s3, (byte) (s3 & 239), bArr3[56], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char c = (char) (13184 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    int iAlpha = 1649 - Color.alpha(0);
                    int iMyPid = (Process.myPid() >> 22) + 26;
                    byte[] bArr4 = $$d;
                    Object[] objArr20 = new Object[1];
                    g(bArr4[9], (short) (-bArr4[27]), (byte) (-bArr4[8]), objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(c, iAlpha, iMyPid, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 18, new int[]{430606296, 747748839, -2104414412, 60985945, -1265350089, 1328285404, -765105948, 865412575, 408453874, 746443006, -650262291, -773111006}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 84, new int[]{199891852, 1908650782, 1045427044, -810663710, 749280443, 936983298, -1908032480, 965759100}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char packedPositionChild = (char) (13182 - ExpandableListView.getPackedPositionChild(0L));
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1649;
                        int i6 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 25;
                        Object[] objArr23 = new Object[1];
                        g(r8[9], (short) 76, (byte) (-$$d[8]), objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(packedPositionChild, iCombineMeasuredStates, i6, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 13184);
                        int touchSlop = 1649 - (ViewConfiguration.getTouchSlop() >> 8);
                        int i7 = (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 26;
                        byte[] bArr5 = $$d;
                        byte b3 = bArr5[62];
                        short s4 = bArr5[5];
                        Object[] objArr24 = new Object[1];
                        g(b3, s4, (byte) (s4 | 40), objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(cIndexOf, touchSlop, i7, -133433128, false, (String) objArr24[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i8 = ((int[]) objArr[3])[0];
        int i9 = ((int[]) objArr[2])[0];
        if (i9 != i8) {
            long j = -1;
            long j2 = ((long) (i9 ^ i8)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4535 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 6053 - Process.getGidForName(""), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {-879287759, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getTapTimeout() >> 16), 6029 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24);
                byte[] bArr6 = $$j;
                Object[] objArr26 = new Object[1];
                h((short) 73, bArr6[11], bArr6[42], objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
                int i10 = AudioAttributesImplApi21Parcelizer + 61;
                AudioAttributesImplBaseParcelizer = i10 % 128;
                int i11 = i10 % 2;
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        CmcdConfigurationRequestConfig.write(this, null, 0, 0, false, 15);
        super.onCreate(p0);
        setContentView(R.layout.empty_fragment_container);
        if (p0 == null) {
            RegistrationMethodsBuilder.Companion companion = RegistrationMethodsBuilder.INSTANCE;
            CmcdConfigurationRequestConfig.write(this, R.id.container, RegistrationMethodsBuilder.Companion.IconCompatParcelizer());
        }
    }

    @Override // kotlin.OptionalPendingResultImpl, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 71;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = AudioAttributesImplApi21Parcelizer + 67;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            f((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 26, new int[]{430606296, 747748839, -2104414412, 60985945, -1880859299, -1334815896, 1028835954, -688293523, 1767812311, -375792826, 1012901291, -2102492894, 1350212382, 1439928415}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e(ViewConfiguration.getLongPressTimeout() >> 16, new char[]{54598, 54565, 13388, 36771, 9315, 21285, 28019, 24527, 15179, 40480, 14029, 19460, 2534, 44118, 1869, 25220, 7709, 45823, 4413, 37660, 27785, 16664}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i6 = AudioAttributesImplApi21Parcelizer + 63;
                AudioAttributesImplBaseParcelizer = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 4 / 2;
                }
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            int i8 = AudioAttributesImplBaseParcelizer + 3;
            AudioAttributesImplApi21Parcelizer = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (KeyEvent.getDeadChar(0, 0) + 4535), ((Process.getThreadPriority(0) + 20) >> 6) + 6054, 41 - TextUtils.indexOf((CharSequence) "", '0', 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), AndroidCharacter.getMirror('0') + 5982, 24 - (Process.myTid() >> 22), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009d  */
    @Override // kotlin.OptionalPendingResultImpl, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.RegisterListenerMethod.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:(26:36|(3:38|(3:40|43|(1:45)(1:46))|47)(2:41|(2:43|(0)(0))(1:47))|82|295|83|(2:286|85)|89|90|(5:92|93|(1:95)|96|97)(21:98|99|294|100|284|101|(1:103)|104|105|273|106|(1:108)|109|110|111|(1:113)|114|(1:116)|117|(1:119)|120)|121|(4:124|(2:126|(13:128|131|(3:133|(3:136|137|134)|308)|138|290|139|(1:141)|142|143|144|282|145|307)(1:305))(2:129|(12:131|(0)|138|290|139|(0)|142|143|144|282|145|307)(1:306))|158|122)|304|185|(1:187)|188|(3:190|(1:192)|193)(13:195|280|196|197|(1:199)|200|302|201|202|(1:204)|205|(1:207)|208)|194|209|(6:211|212|(1:214)|215|216|217)|218|(1:220)|221|(3:223|(1:225)|226)(14:228|229|(1:231)|232|233|(1:235)|236|288|237|238|(1:240)|241|(1:243)|244)|227|245|(7:247|248|(1:250)|251|252|253|254)(1:309))|298|55|(1:57)|58|82|295|83|(0)|89|90|(0)(0)|121|(1:122)|304|185|(0)|188|(0)(0)|194|209|(0)|218|(0)|221|(0)(0)|227|245|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x08d6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x08d7, code lost:
    
        r11 = r23;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0800 A[Catch: all -> 0x08b3, TryCatch #9 {all -> 0x08b3, blocks: (B:139:0x07fa, B:141:0x0800, B:142:0x0828), top: B:290:0x07fa, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0922 A[Catch: all -> 0x0220, TryCatch #1 {all -> 0x0220, blocks: (B:76:0x036f, B:78:0x0375, B:79:0x039f, B:212:0x0d08, B:214:0x0d0e, B:215:0x0d3d, B:248:0x10cd, B:250:0x10d3, B:251:0x10f7, B:229:0x0eaa, B:231:0x0ecc, B:232:0x0f20, B:179:0x091c, B:181:0x0922, B:182:0x0950, B:21:0x00a8, B:23:0x00ae, B:24:0x00d4, B:26:0x0195, B:28:0x01c5, B:29:0x021a, B:38:0x023b, B:43:0x0247, B:47:0x0253, B:41:0x0243, B:62:0x031d, B:64:0x0323, B:65:0x0324, B:67:0x0326, B:69:0x032d, B:70:0x032e), top: B:275:0x00a8, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0a30  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0a8e  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0cea  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0dc7  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0e11  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0e5f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x10ae  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0431 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:309:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04dd A[Catch: all -> 0x08d6, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x08d6, blocks: (B:83:0x042b, B:89:0x0474, B:98:0x04dd), top: B:295:0x042b }] */
    @Override // kotlin.OptionalPendingResultImpl, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5180
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.RegisterListenerMethod.attachBaseContext(android.content.Context):void");
    }

    static {
        read = 1;
        AudioAttributesImplBaseParcelizer();
        INSTANCE = new Companion(null);
        int i = RemoteActionCompatParcelizer + 31;
        read = i % 128;
        int i2 = i % 2;
    }

    @Override // kotlin.OptionalPendingResultImpl, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 95;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = AudioAttributesImplApi21Parcelizer + 45;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    static void AudioAttributesImplBaseParcelizer() {
        IconCompatParcelizer = -7517018063113622271L;
        AudioAttributesCompatParcelizer = new int[]{1057624706, 2098566284, 486746949, -71052163, -275736295, 1899141704, -2084167917, -128900458, -1338606364, 1186006541, 221849542, 1637805605, 2038743125, 127717558, 1891489365, -312368627, 1637643725, 1660391532};
    }
}
