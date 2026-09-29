package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
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
import kotlin.WakeLockEvent;
import kotlin.getValueObject;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: renamed from: o.zzab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/zzab;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Lo/parseRoleFlagsFromProperties;", "AudioAttributesCompatParcelizer", "Lo/parseRoleFlagsFromProperties;", "read", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActivityC0235zzab extends serializeToString {
    private static int[] IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int read;
    private static long write;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private parseRoleFlagsFromProperties read;
    private static final byte[] $$l = {TarConstants.LF_GNUTYPE_LONGNAME, 36, -23, -15};
    private static final int $$m = 223;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {TarConstants.LF_GNUTYPE_LONGLINK, 28, -90, 102, -61, 61, 2, 19, -44, TarConstants.LF_DIR, 1, -13, 23, -7, 10, 3, -29, 32, 7, 4, 1, 14, 30, 16, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17, 23, 12, 6, 9, -11, -32, 38, 21, -7, 10, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17, -61, 35, 28, 3, 9, -4, -26, TarConstants.LF_NORMAL, -7, 5, 2, -9, 23, -1, 5, 14, -25, 23, 13, -6, 5, 17, -9, 17, -43, TarConstants.LF_NORMAL, -7, 5, 2, -18, 24, 27, -30, 15, 15, 13, -12, 18, -9, 0, 7};
    private static final int $$k = 157;
    private static final byte[] $$d = {10, -96, 35, -27, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 117;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int AudioAttributesImplApi26Parcelizer = 1;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;

    private static String $$n(int i, byte b, int i2) {
        int i3 = i * 3;
        byte[] bArr = $$l;
        int i4 = 104 - (b * 3);
        int i5 = (i2 * 3) + 4;
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        int i7 = -1;
        if (bArr == null) {
            i4 = i6 + (-i5);
            i5++;
            i7 = -1;
        }
        while (true) {
            int i8 = i7 + 1;
            bArr2[i8] = (byte) i4;
            if (i8 == i6) {
                return new String(bArr2, 0);
            }
            int i9 = i5;
            i4 += -bArr[i5];
            i5 = i9 + 1;
            i7 = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 65
            int r0 = r7 + 4
            byte[] r1 = kotlin.ActivityC0235zzab.$$d
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L29
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L29:
            int r3 = r3 + 1
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + (-1)
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityC0235zzab.g(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 73
            int r0 = r5 + 4
            int r7 = r7 + 4
            byte[] r1 = kotlin.ActivityC0235zzab.$$j
            byte[] r0 = new byte[r0]
            int r5 = r5 + 3
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r6
            r4 = r2
            r6 = r5
            goto L27
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L23:
            int r7 = r7 + 1
            r3 = r1[r7]
        L27:
            int r6 = r6 + r3
            int r6 = r6 + (-4)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityC0235zzab.h(int, short, short, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.zzab$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/zzab$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/WakeLockEvent;", "p1", "Landroid/content/Intent;", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;Lo/WakeLockEvent;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent AudioAttributesCompatParcelizer(Context p0, WakeLockEvent p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intent = new Intent(p0, (Class<?>) ActivityC0235zzab.class);
            p1.RemoteActionCompatParcelizer(intent);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(write ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        int i3 = $11 + 61;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i5 = $10 + 31;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i7 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(write)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + 12424, View.getDefaultSize(0, 0) + 20, -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 1867 - TextUtils.indexOf((CharSequence) "", '0'), (KeyEvent.getMaxKeyCode() >> 16) + 10, 1983509525, false, $$n(b, b2, b2), new Class[]{Object.class, Object.class});
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

    private static void e(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IconCompatParcelizer;
        int i4 = -470782045;
        int i5 = 43695;
        int i6 = 1;
        int i7 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(i4);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (i5 - Color.blue(0)), 23298 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i8++;
                    i4 = -470782045;
                    i5 = 43695;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i9 = $11 + 123;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IconCompatParcelizer;
        char c = '0';
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                Object[] objArr3 = new Object[i6];
                objArr3[i7] = Integer.valueOf(iArr5[i11]);
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-470782045);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 43695), 23296 - TextUtils.lastIndexOf("", c, i7, i7), 14 - TextUtils.lastIndexOf("", c), -1648776394, false, "A", new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                i11++;
                c = '0';
                i6 = 1;
                i7 = 0;
            }
            i2 = i7;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = i2;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            int i12 = $11 + 107;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr[0] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr4);
            int i14 = $11 + 63;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            for (int i16 = 0; i16 < 16; i16++) {
                int i17 = $10 + 55;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[i16];
                Object[] objArr4 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (43695 - (ViewConfiguration.getLongPressTimeout() >> 16)), 23297 - (ViewConfiguration.getJumpTapTimeout() >> 16), '?' - AndroidCharacter.getMirror('0'), -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                buildremovealldownloadsintent.read = iIntValue;
            }
            int i19 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i19;
            buildremovealldownloadsintent.read ^= iArr4[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[17];
            int i20 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i21 = buildremovealldownloadsintent.read;
            cArr[0] = (char) (buildremovealldownloadsintent.AudioAttributesCompatParcelizer >>> 16);
            cArr[1] = (char) buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            cArr[2] = (char) (buildremovealldownloadsintent.read >>> 16);
            cArr[3] = (char) buildremovealldownloadsintent.read;
            buildRemoveAllDownloadsIntent.read(iArr4);
            cArr2[buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2] = cArr[0];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 1] = cArr[1];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 2] = cArr[2];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 3] = cArr[3];
            Object[] objArr5 = {buildremovealldownloadsintent, buildremovealldownloadsintent};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(516305436);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (TextUtils.getOffsetAfter("", 0) + 48194), ExpandableListView.getPackedPositionChild(0L) + 20127, View.MeasureSpec.getMode(0) + 20, 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // kotlin.serializeToString, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        parseRoleFlagsFromProperties parseroleflagsfromproperties;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 39;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 91, new int[]{2104986582, -488069923, -639023787, -123166625, -258933755, -1447042311, 1684288638, 774913518, -1396866638, -1550981199}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(0) - 32, new int[]{905668069, 1126266827, -1724626566, 391363759}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i4 = AudioAttributesImplApi26Parcelizer + 27;
                MediaBrowserCompatItemReceiver = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr4 = new Object[1];
                f((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1, new char[]{49257, 49160, 13593, 61569, 15414, 45269, 55262, 11558, 5150, 47038, 35025, 57669, 61368, 1367, 3154, 24825, 34720, 64924, 25790, 30790, 40831, 54718, 23686, 20606, 46853, 52679, 46312, 10298, 20248, 42467}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                e(18 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), new int[]{-1444384345, -1543782447, 1259689236, -568077712, 354161307, 1869101836, 201293625, -1175086236, -1792185628, -1952006221}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 6054 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 42 - KeyEvent.normalizeMetaState(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 13, new int[]{-1434010144, 1168484650, 986401650, -1730261092, -1729781609, -728001870, 1961470218, 1232941389, -386659337, 395338174, -709483557, -110849274, 91295345, -1241340819, 1938185178, 1392105122, 659147046, -1837420861, 1137669410, -920937541, -99851968, -380491102, -431720953, -134912811}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 109, new char[]{41566, 41582, 52830, 3019, 19600, 64276, 46513, 54884, 25836, 50975, 49994, 43718, 36315, 65114, 31975, 11062, 58854, 1668, 5135, 13210, 64863, 12024, 11314, 7101, 54608, 14045, 50191, 25573, 11564, 24316, 56786, 18948, 1167, 26402, 62969, 21052, 7342, 36681, 36305, 47703, 29856, 38775, 42408, 33420, 19478, 49050, 48417, 60144, 42098, 51091, 21786, 62088, 48206, 61412, 27942, 56052, 38807, 61468, 1743, 11561, 61366, 6251, 7878, 13591, 51139, 8240, 14008, 7547}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, new char[]{30113, 30147, 424, 50287, 2321, 50994, 25160, 6547, 8507, 33436, 65334, 38580, 23157, 12717, 14645, 5911, 12817, 51568, 20876, 4026, 11001, 57688, 27058, 10183, 683, 63856, 33163, 24476, 64136, 37132, 38916, 30335, 54138, 43143, 45177, 28230, 52053, 16568, 51207, 34419, 41816, 22660, 57387, 48808, 39904, 28731, 63653, 54998, 29578, 2147, 4248, 52991, 27572, 8221, 10486, 59095, 16488, 16311, 17227, 4365, 14400, 55243, 23317, 2404, 4159, 61382, 29502, 8454}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) - 36, new char[]{19821, 19717, 16552, 34090, 30431, 31095, 23238, 22750, 24236, 64839, 16752, 10469, 25273, 28909, 18098, 43291, 2716, 34854, 11868, 45562, 4707, 40984, 5752, 39305, 14881, 47212, 65041, 57754, 49692, 53336, 59352, 51318, 60406, 59776, 53181, 53320, 62424, 509, 47001, 14371, 39814, 6613, 40886, 254, 41839, 12585, 34613, 26836, 19274, 18809, 28508, 28846, 21309, 24917, 22372, 22670, 30971, 32419, 15558, 44876, 201, 38595, 9357, 46949, 10474, 44753, 3237, 40714, 12419, 50728, 62552}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) - 36, new char[]{16102, 16095, 55676, 7332, 24600, 19131, 10512, 49496, 60357, 7021}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1) - 13, new int[]{-1572003712, -7486560, -1880756260, -1970417222, 908545359, -723466762, 2102260879, -1305059793, -114330042, -300379021, 1590157714, 688805874, 893431558, -876882748, 567312061, -1431563173, 659730845, 1326123398}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) View.MeasureSpec.makeMeasureSpec(0, 0), (-16771186) - Color.rgb(0, 0, 0), 24 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char cGreen = (char) (Color.green(0) + 13183);
            int longPressTimeout = 1649 - (ViewConfiguration.getLongPressTimeout() >> 16);
            int size = 26 - View.MeasureSpec.getSize(0);
            Object[] objArr13 = new Object[1];
            g(r5[140], (byte) ($$d[61] - 1), r5[5], objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(cGreen, longPressTimeout, size, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 13184);
                int iLastIndexOf = 1648 - TextUtils.lastIndexOf("", '0');
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 26;
                byte[] bArr = $$d;
                Object[] objArr14 = new Object[1];
                g(bArr[5], bArr[8], bArr[27], objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(cIndexOf, iLastIndexOf, tapTimeout, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 12, new int[]{1443459407, 586084623, 1356797293, -1492675678, -1171930649, -1978994156, -985559001, -1414428140}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) - 20, new int[]{133610704, 185655934, 814958712, -1531804628, 324130841, -1376519488, 1563450901, -136519514}, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i6 = AudioAttributesImplApi26Parcelizer + 63;
            MediaBrowserCompatItemReceiver = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, 1476533184};
                byte[] bArr2 = $$j;
                Object[] objArr18 = new Object[1];
                h(bArr2[101], bArr2[47], bArr2[81], objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                h(bArr2[23], bArr2[107], bArr2[40], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 13183);
                    int mirror = AndroidCharacter.getMirror('0') + 1601;
                    int mirror2 = AndroidCharacter.getMirror('0') - 22;
                    byte[] bArr3 = $$d;
                    Object[] objArr20 = new Object[1];
                    g(bArr3[5], bArr3[8], bArr3[27], objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(maximumFlingVelocity, mirror, mirror2, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    e(ExpandableListView.getPackedPositionGroup(0L) + 22, new int[]{2104986582, -488069923, -639023787, -123166625, -1679510632, 1841919393, -1099636824, 732217654, -1626205200, -1347384629, 1838743797, 1269759330}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 11, new int[]{-604786820, 1037399717, -2112246491, 1026762046, -1532968479, 44580091, -914498524, 1115166998}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char keyRepeatDelay = (char) (13183 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                        int iLastIndexOf2 = 1648 - TextUtils.lastIndexOf("", '0', 0, 0);
                        int i8 = 27 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        byte[] bArr4 = $$d;
                        Object[] objArr23 = new Object[1];
                        g(bArr4[5], bArr4[8], (short) 76, objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(keyRepeatDelay, iLastIndexOf2, i8, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char c = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 13183);
                        int iIndexOf = 1649 - TextUtils.indexOf("", "", 0);
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 26;
                        Object[] objArr24 = new Object[1];
                        g(r7[140], (byte) ($$d[61] - 1), r7[5], objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(c, iIndexOf, scrollBarSize, -133433128, false, (String) objArr24[0], null);
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
        int i9 = ((int[]) objArr[3])[0];
        int i10 = ((int[]) objArr[2])[0];
        if (i10 != i9) {
            long j = -1;
            long j2 = ((long) (i10 ^ i9)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (Color.argb(0, 0, 0, 0) + 4535), 6054 - Color.red(0), KeyEvent.keyCodeFromString("") + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            parseroleflagsfromproperties = null;
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {608695121, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 6030 - (ViewConfiguration.getTouchSlop() >> 8), TextUtils.getCapsMode("", 0, 0) + 24);
                byte[] bArr5 = $$j;
                byte b = bArr5[98];
                byte b2 = bArr5[44];
                Object[] objArr26 = new Object[1];
                h(b, b2, (byte) (b2 << 2), objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        } else {
            parseroleflagsfromproperties = null;
        }
        CmcdConfigurationRequestConfig.write(this, null, 0, 0, false, 15);
        super.onCreate(p0);
        parseRoleFlagsFromProperties parseroleflagsfrompropertiesRemoteActionCompatParcelizer = parseRoleFlagsFromProperties.RemoteActionCompatParcelizer(getLayoutInflater());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parseroleflagsfrompropertiesRemoteActionCompatParcelizer, "");
        this.read = parseroleflagsfrompropertiesRemoteActionCompatParcelizer;
        if (parseroleflagsfrompropertiesRemoteActionCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            parseroleflagsfrompropertiesRemoteActionCompatParcelizer = parseroleflagsfromproperties;
        }
        setContentView(parseroleflagsfrompropertiesRemoteActionCompatParcelizer.IconCompatParcelizer());
        WakeLockEvent.Companion companion = WakeLockEvent.INSTANCE;
        Intent intent = getIntent();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(intent, "");
        WakeLockEvent wakeLockEventAudioAttributesCompatParcelizer = WakeLockEvent.Companion.AudioAttributesCompatParcelizer(intent);
        if (wakeLockEventAudioAttributesCompatParcelizer == null || p0 != null) {
            return;
        }
        int i11 = AudioAttributesImplApi26Parcelizer + 95;
        MediaBrowserCompatItemReceiver = i11 % 128;
        int i12 = i11 % 2;
        getValueObject.Companion iconCompatParcelizer = getValueObject.INSTANCE;
        CmcdConfigurationRequestConfig.write(this, R.id.container, getValueObject.Companion.RemoteActionCompatParcelizer(wakeLockEventAudioAttributesCompatParcelizer));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a6  */
    @Override // kotlin.serializeToString, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityC0235zzab.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b3  */
    @Override // kotlin.serializeToString, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityC0235zzab.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(35:(29:285|33|(2:35|(2:37|(2:39|43)(1:40))(2:41|42))(1:43)|78|283|79|(2:296|81)|85|86|(5:88|89|(1:91)|92|93)(21:94|95|276|96|300|97|(1:99)|100|101|290|102|(1:104)|105|106|107|(1:109)|110|(1:112)|113|(1:115)|116)|117|(4:120|(13:305|122|(3:124|(3:127|128|125)|309)|129|281|130|(1:132)|133|134|135|302|136|308)(1:307)|306|118)|304|175|(1:177)|178|(2:180|(4:182|(1:184)|185|186)(3:187|(1:189)|190))(13:192|274|193|194|(1:196)|197|294|198|199|(1:201)|202|(1:204)|205)|191|206|(6:208|209|(1:211)|212|213|214)|215|(1:217)|218|(3:220|(1:222)|223)(14:225|226|(1:228)|229|230|(1:232)|233|286|234|235|(1:237)|238|(1:240)|241)|224|242|(6:244|245|(1:247)|248|249|250)|251|(1:253)(2:254|255))|288|47|(1:49)|50|277|51|(1:53)|54|78|283|79|(0)|85|86|(0)(0)|117|(1:118)|304|175|(0)|178|(0)(0)|191|206|(0)|215|(0)|218|(0)(0)|224|242|(0)|251|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0909, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x090a, code lost:
    
        r11 = r21;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x07d7 A[Catch: all -> 0x0907, TryCatch #1 {all -> 0x0907, blocks: (B:117:0x07cd, B:118:0x07d1, B:120:0x07d7, B:122:0x07ec, B:125:0x07f9, B:127:0x07fc, B:134:0x0860, B:140:0x08e1, B:142:0x08e7, B:143:0x08e8, B:145:0x08ea, B:147:0x08f1, B:148:0x08f2, B:96:0x0525, B:107:0x0678, B:109:0x067e, B:110:0x06bc, B:112:0x072c, B:113:0x076c, B:115:0x0783, B:116:0x07c7, B:150:0x08f4, B:152:0x08fb, B:153:0x08fc, B:155:0x08fe, B:157:0x0905, B:158:0x0906, B:130:0x0827, B:132:0x082d, B:133:0x0859, B:102:0x05f3, B:104:0x0606, B:105:0x066c, B:97:0x05a9, B:99:0x05ba, B:100:0x05ec, B:136:0x0865), top: B:276:0x0525, inners: #4, #10, #15, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0955 A[Catch: all -> 0x0274, TryCatch #11 {all -> 0x0274, blocks: (B:209:0x0d94, B:211:0x0d9a, B:212:0x0dc2, B:245:0x1153, B:247:0x1159, B:248:0x1181, B:226:0x0f3b, B:228:0x0f5c, B:229:0x0fa7, B:169:0x094f, B:171:0x0955, B:172:0x0980, B:72:0x03bb, B:74:0x03c1, B:75:0x03e9, B:19:0x00b5, B:21:0x00bb, B:22:0x00e5, B:24:0x01e6, B:26:0x0216, B:27:0x026e), top: B:292:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0a0d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0a5c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0b11  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0d74  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0e4e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0e9c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0eee  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x1135  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x1211 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x1212  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0473 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x051d A[Catch: all -> 0x0909, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x0909, blocks: (B:79:0x046d, B:85:0x04bc, B:94:0x051d), top: B:283:0x046d }] */
    @Override // kotlin.serializeToString, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityC0235zzab.attachBaseContext(android.content.Context):void");
    }

    static {
        read = 0;
        AudioAttributesImplBaseParcelizer();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatCustomActionResultReceiver + 33;
        read = i % 128;
        int i2 = i % 2;
    }

    @Override // kotlin.serializeToString, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 101;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
    }

    static void AudioAttributesImplBaseParcelizer() {
        IconCompatParcelizer = new int[]{1687291443, 299097942, 779458019, 165931510, 1587294858, 1759011360, -93548427, -1579190206, -531935901, -1222063032, -1642255910, 525302905, 382167321, -677783062, -1272362805, -35065975, 967796895, 1582965066};
        write = -1853767570678967443L;
    }
}
