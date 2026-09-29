package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.Fragment;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lo/onSingleTapUp;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "Lo/parseAvailabilityTimeOffsetUs;", "read", "Lo/parseAvailabilityTimeOffsetUs;", "AudioAttributesCompatParcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class onSingleTapUp extends onDown {
    private static int AudioAttributesCompatParcelizer;
    private static byte[] AudioAttributesImplApi21Parcelizer;
    private static int AudioAttributesImplApi26Parcelizer;
    private static char[] AudioAttributesImplBaseParcelizer;
    private static int IconCompatParcelizer;
    private static short[] MediaBrowserCompatItemReceiver;
    private static int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private parseAvailabilityTimeOffsetUs AudioAttributesCompatParcelizer;
    private static final byte[] $$c = {32, -1, TarConstants.LF_GNUTYPE_SPARSE, -45};
    private static final int $$f = 156;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {77, 21, 89, -51, 58, -30, -58, 2, 24, -35, 4, -31, 13, -20, 34, -43, -10, -3, 34, -51, -5, -10, -6, -6, 2, -16, -13, 33, -36, -17, -8, 8, -16, 2, -20, 38, -58, -3, 8, -20, -3, 6, -18, 18, -45, 4, -13, 5, -4, -22, 4, -1, 16, -28, -19, 4, -9, -4, 40, -33, -19, -6, 36, -51, -5, -10, 8, -26, 29, -24, -24, 8, -9, -14, -4, -24, 14, -20, -26, -15, -9, -12, 8, 29, -41, -24, 4, -13, -6, 36, -51, -5, -10, 8, -26, 29, -24, -24, 8, -9, -14, -4, -24, 14, -20, 58, -44, -40, 12, -26, -8, -5, 39, -58, 14, -9, -18, -11, 4, -13, -6, 26, -27, -22, -7, 4, -20};
    private static final int $$h = 65;
    private static final byte[] $$a = {3, 113, -44, TarConstants.LF_BLK, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 104;
    private static int MediaBrowserCompatSearchResultReceiver = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(byte r5, byte r6, byte r7) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 112
            int r6 = r6 * 3
            int r6 = 3 - r6
            int r5 = r5 * 4
            int r0 = r5 + 1
            byte[] r1 = kotlin.onSingleTapUp.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r1[r6]
        L28:
            int r4 = -r4
            int r7 = r7 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onSingleTapUp.$$i(byte, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.onSingleTapUp.$$a
            int r8 = r8 + 65
            int r6 = r6 + 4
            int r7 = r7 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2a
        L11:
            r3 = r2
        L12:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-1)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onSingleTapUp.c(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = kotlin.onSingleTapUp.$$g
            int r7 = r7 + 73
            int r9 = r9 + 4
            int r8 = 56 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r9
            r5 = r2
            r9 = r8
            goto L29
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r7
            int r9 = r9 + 1
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L29:
            int r7 = -r7
            int r9 = r9 + r7
            int r7 = r9 + (-7)
            r9 = r3
            r3 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onSingleTapUp.d(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.onSingleTapUp$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/onSingleTapUp$write;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/WorkAccountClient;", "p1", "Landroid/content/Intent;", "RemoteActionCompatParcelizer", "(Landroid/content/Context;Lo/WorkAccountClient;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent RemoteActionCompatParcelizer(Context p0, WorkAccountClient p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intent = new Intent(p0, (Class<?>) onSingleTapUp.class);
            p1.AudioAttributesCompatParcelizer(intent);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = AudioAttributesImplBaseParcelizer;
        char c = '0';
        if (cArr != null) {
            int i7 = $11 + 119;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 87;
                $11 = i10 % 128;
                if (i10 % i == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.getCapsMode("", 0, 0), TextUtils.indexOf("", c, 0) + 11614, 20 - View.MeasureSpec.getMode(0), -1786471333, false, "u", new Class[]{Integer.TYPE});
                        }
                        cArr2[i9] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr[i9])};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-338863922);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getTrimmedLength(""), 11613 - ((Process.getThreadPriority(0) + 20) >> 6), 20 - Color.blue(0), -1786471333, false, "u", new Class[]{Integer.TYPE});
                        }
                        cArr2[i9] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                        i9++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i = 2;
                c = '0';
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            int i11 = $11 + 121;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c2 = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                int i13 = $11 + 83;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i15 = $11 + 125;
                    $10 = i15 % 128;
                    if (i15 % 2 != 0) {
                        int i16 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                        Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c2)};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) ExpandableListView.getPackedPositionType(0L), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22959, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 44, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i16] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                        throw null;
                    }
                    int i17 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr5 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c2)};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) TextUtils.getOffsetBefore("", 0), 22959 - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 44, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i17] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                } else {
                    int i18 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr6 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c2)};
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        objRemoteActionCompatParcelizer5 = startForeground.read((char) (31589 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 9864, 65 - TextUtils.getCapsMode("", 0, 0), 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i18] = ((Character) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).charValue();
                }
                c2 = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr7 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (37822 - Color.green(0)), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 9754, (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 27, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i19 = $11 + 59;
            $10 = i19 % 128;
            int i20 = i19 % 2;
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i21 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i21, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i21);
        }
        if (z) {
            int i22 = $11 + 41;
            $10 = i22 % 128;
            int i23 = i22 % 2;
            char[] cArr6 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i4 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x019b A[PHI: r0
      0x019b: PHI (r0v9 int) = (r0v8 int), (r0v86 int) binds: [B:42:0x0199, B:39:0x0188] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019d A[PHI: r0
      0x019d: PHI (r0v83 int) = (r0v8 int), (r0v86 int) binds: [B:42:0x0199, B:39:0x0188] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x028d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r23, int r24, int r25, short r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onSingleTapUp.a(byte, int, int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0241  */
    @Override // kotlin.onDown, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onSingleTapUp.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 83;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.container);
            if (fragmentFindFragmentById instanceof setShouldSkipGmsCoreVersionCheck) {
                int i3 = MediaBrowserCompatSearchResultReceiver + 81;
                MediaBrowserCompatMediaItem = i3 % 128;
                int i4 = i3 % 2;
                ((setShouldSkipGmsCoreVersionCheck) fragmentFindFragmentById).write();
                return;
            }
            super.onBackPressed();
            return;
        }
        boolean z = getSupportFragmentManager().findFragmentById(R.id.container) instanceof setShouldSkipGmsCoreVersionCheck;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0122  */
    @Override // kotlin.onDown, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onSingleTapUp.onResume():void");
    }

    @Override // kotlin.onDown, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            a((byte) (3 - (ViewConfiguration.getJumpTapTimeout() >> 16)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 68593120, (-665289862) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1) - 116, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(true, null, new int[]{0, 18, TsExtractor.TS_STREAM_TYPE_AC3, 11}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i2 = MediaBrowserCompatMediaItem + 69;
            MediaBrowserCompatSearchResultReceiver = i2 % 128;
            int i3 = i2 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - Color.blue(0)), 6054 - (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.getOffsetAfter("", 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 6030 - Color.red(0), MotionEvent.axisFromString("") + 25, -861814097, false, "read", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                int i4 = MediaBrowserCompatSearchResultReceiver + 45;
                MediaBrowserCompatMediaItem = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 4 / 2;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0a89 A[Catch: all -> 0x0b47, TryCatch #4 {all -> 0x0b47, blocks: (B:132:0x0a75, B:134:0x0a89, B:135:0x0ab9), top: B:264:0x0a75, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0acc A[Catch: all -> 0x0b3d, TryCatch #12 {all -> 0x0b3d, blocks: (B:136:0x0abf, B:138:0x0acc, B:139:0x0b35), top: B:278:0x0abf, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0c54  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0ca4  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0d63  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x109c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x1188  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x11d8  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x122d  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x1558  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0a59 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:290:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0166  */
    @Override // kotlin.onDown, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5931
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onSingleTapUp.attachBaseContext(android.content.Context):void");
    }

    static {
        AudioAttributesImplApi26Parcelizer = 0;
        MediaBrowserCompatItemReceiver();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatCustomActionResultReceiver + 119;
        AudioAttributesImplApi26Parcelizer = i % 128;
        int i2 = i % 2;
    }

    @getMagicModuleMeta
    public static final Intent RemoteActionCompatParcelizer(Context context, WorkAccountClient workAccountClient) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 79;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            Companion.RemoteActionCompatParcelizer(context, workAccountClient);
            throw null;
        }
        Intent intentRemoteActionCompatParcelizer = Companion.RemoteActionCompatParcelizer(context, workAccountClient);
        int i3 = MediaBrowserCompatSearchResultReceiver + 125;
        MediaBrowserCompatMediaItem = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 12 / 0;
        }
        return intentRemoteActionCompatParcelizer;
    }

    @Override // kotlin.onDown, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 47;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatMediaItem + 111;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    static void MediaBrowserCompatItemReceiver() {
        RemoteActionCompatParcelizer = -393345491;
        AudioAttributesCompatParcelizer = -819363094;
        IconCompatParcelizer = 885053642;
        AudioAttributesImplApi21Parcelizer = new byte[]{89, 87, 91, -83, -92, 123, 123, -30, 93, 24, -109, -94, -93, -92, 87, -81, 84, -105, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -80, 96, -73, 72, 71, -66, -96, 111, -79, -65, 71, -71, 65, -91, -106, -89, 10, -76, -69, -121, 126, 79, 78, 73, -70, 66, -71, -126, 80, 124, 126, -127, 123, -78, 80, -88, -126, 124, -128, 82, 121, -80, 72, -125, 124, -125, -81, 80, -77, TarConstants.LF_GNUTYPE_SPARSE, -126, -82, 124, 79, 126, -80, -125, 72, -122, -84, -125, 124, 81, 123, -128, 127, -81, 124, -128, 124, -128, TarConstants.LF_GNUTYPE_LONGLINK, -122, -81, 112, -119, -122, 96, -98, -71, 114, TarConstants.LF_CHR, -56, TarConstants.LF_BLK, -114, -127, 113, 118, -118, -75, 73, 118, -128, -67, 77, 113, -125, -70, 70, 124, -98, 99, -117, 113, -128, 125, -98, 99, -127, -74, TarConstants.LF_DIR, -114, -99, 113, 96, -100, 115, 124, -123, 123, -55, TarConstants.LF_BLK, -128, 121, 118, -119, 114, 118, -126, -116, -121, 114, -70, -113, 122, 72, -116, 115, -113, -125, -9, 14, -2, 5, -39, -38, 56, 6, -14, 10, -63, TarConstants.LF_SYMLINK, 20, -22, 8, -30, 30, -17, 18, 17, -26, 9, -12, -27, -24, 25, 21, -17, 29, -73, -73, -73, -73, -73, -73, -73};
        AudioAttributesImplBaseParcelizer = new char[]{44903, 44923, 44923, 44872, 44927, 44901, 44908, 44921, 44921, 44924, 44910, 44901, 44922, 44896, 44927, 44904, 44910, 44896, 44946, 44987, 44986, 44990, 44978, 44990, 44987, 44986, 44984, 44993, 44992, 44998, 44998, 44984, 44987, 44990, 44989, 44998, 45033, 45038, 45039, 44993, 44992, 44992, 44990, 44989, 44984, 44986, 44991, 44988, 44990, 44988, 44997, 45039, 45038, 44998, 44999, 44998, 44991, 44985, 44995, 45033, 44995, 44985, 44998, 44998, 44988, 44991, 44988, 44999, 45033, 44995, 44986, 44992, 44999, 44993, 45033, 45033, 44999, 44989, 44989, 44988, 44988, 44999, 44984, 44992, 44987, 44992, 44999, 44996, 45038, 44998, 44985, 44990, 44998, 45032, 45038, 44996, 44998, 45035, 44995, 44987, 44987, 44984, 44984, 44991, 44997, 45038, 44996, 44988, 44990, 44985, 44990, 44988, 44992, 44998, 44996, 45033, 45033, 44998, 44998, 44993, 44987, 44993, 44992, 44995, 44992, 44987, 44994, 44993, 44998, 45039, 45033, 44995, 44985, 44990, 44993, 44992, 44995, 44993, 44993, 44998, 44988, 44988, 44989, 44999, 44995, 44995, 45045, 44914, 44926, 44925, 44924, 44927, 44945, 44988, 44993, 44995, 44993, 45038, 45038, 44996, 44990, 44995, 44998, 44996, 44995, 44964, 44987, 44992, 44999, 44985, 44984, 44991, 44991, 44991, 44986, 44995, 44997, 44997, 44997, 44984, 44965, 44987, 44987, 44990, 44988, 44998, 44995, 44987, 44979, 45024, 45022, 45034, 45052, 45028, 45028, 45051, 45027, 45038, 45036, 45037, 45038, 45027, 45011, 45023, 44984, 45052, 44822, 44838, 44835, 44840, 44821, 44804, 44807, 44841, 44821, 44823, 44822, 44823, 44821, 44843, 44844, 44840, 44822, 45045, 44814, 44845, 44944, 44985, 44991, 44988, 44988, 44989, 44988, 44990, 44991, 44989, 44985, 44946, 44985, 44985, 44990, 44988, 44985, 44990, 44989, 44989, 44991, 44985};
    }
}
