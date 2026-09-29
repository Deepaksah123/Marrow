package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.createFloatSparseArray;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/createFloatList;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class createFloatList extends createDoubleSparseArray {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int AudioAttributesImplApi21Parcelizer;
    private static char[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer;
    private static char read;
    private static long write;
    private static final byte[] $$l = {114, -20, -35, -46};
    private static final int $$m = 95;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {112, -40, -93, -59, -67, 21, 0, 3, 5, 32, -5, -14, -7, 0, 0, -19, 15, 17, -6, -1, -5, -15, -67, 81, -7, -11, 9, -17, 24, 10, -3, -45, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, 17, 6, 0, 3, -17, -38, 32, 15, -13, 4, -3, -45, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, -67, TarConstants.LF_CHR, -4, 11, -37, 24, -2, 9, -37, 22, -3, 3, -10, -19, 19, 11, -11, 4, -13, -30, 37, -5, -10, -1, 11, -80, 11, TarConstants.LF_SYMLINK, -19, 3, 4, -48, TarConstants.LF_LINK, -2, -4, -11, -9, 17, -3, -17, 12, -50, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, -67, TarConstants.LF_CONTIG, -4, 13, -40, 21, 13, 1, -10, 1, -9, -25, 35, -11, -13, -33, 42, -5, -4, -44, 42, -3, -2, -11, -4, 15, -13, 11, -15, 9, 3, -46, 18, 11, -15, 4, -4, 11, -7, -11, 9, -17};
    private static final int $$k = 170;
    private static final byte[] $$d = {TarConstants.LF_CHR, -23, 108, 101, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, 4, 8, -12, 14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 11;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int MediaBrowserCompatItemReceiver = 1;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(short r5, short r6, byte r7) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 103
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r5 = r5 * 3
            int r0 = r5 + 1
            byte[] r1 = kotlin.createFloatList.$$l
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r6
            r4 = r2
            r6 = r5
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L25:
            r3 = r1[r7]
        L27:
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createFloatList.$$n(short, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = kotlin.createFloatList.$$d
            int r6 = r6 + 4
            int r5 = 119 - r5
            int r1 = r7 + 4
            byte[] r1 = new byte[r1]
            int r7 = r7 + 3
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r6 = r6 + 1
            byte r4 = (byte) r5
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            r3 = r0[r6]
        L26:
            int r3 = -r3
            int r5 = r5 + r3
            int r5 = r5 + (-1)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createFloatList.g(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0022). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(byte r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 4
            int r5 = r5 + 65
            byte[] r0 = kotlin.createFloatList.$$j
            int r7 = 39 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r4 = r7
            r3 = r2
            goto L22
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L20:
            r4 = r0[r6]
        L22:
            int r5 = r5 + r4
            int r5 = r5 + 2
            int r6 = r6 + 1
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createFloatList.h(byte, int, int, java.lang.Object[]):void");
    }

    public createFloatList() {
        super((byte) 0);
    }

    /* JADX INFO: renamed from: o.createFloatList$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/createFloatList$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "RemoteActionCompatParcelizer", "(Landroid/content/Context;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent RemoteActionCompatParcelizer(Context p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new Intent(p0, (Class<?>) createFloatList.class);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void f(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i4 = $11 + 45;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getWindowTouchSlop() >> 8), KeyEvent.keyCodeFromString("") + 22748, 36 - Gravity.getAbsoluteGravity(0, 0), 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {notifydownloadremoved};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 31369), 2722 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 38 - View.resolveSize(0, 0), 1895162189, false, $$n(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15712, 64 - (ViewConfiguration.getFadingEdgeLength() >> 16), -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 40976), 6122 - TextUtils.indexOf("", "", 0, 0), 29 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = notifydownloadremoved.write;
                            cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (write ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) RemoteActionCompatParcelizer) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) read) ^ (-3498762522182953692L)))));
                            notifydownloadremoved.AudioAttributesCompatParcelizer++;
                            int i6 = $10 + 59;
                            $11 = i6 % 128;
                            int i7 = i6 % 2;
                            i2 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
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
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static void e(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i;
        int i2;
        char[] cArr;
        int i3 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = IconCompatParcelizer;
        char c = '0';
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getTouchSlop() >> 8), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 11612, 19 - TextUtils.indexOf("", c), -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i8++;
                    c = '0';
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
        char[] cArr4 = new char[i5];
        System.arraycopy(cArr2, i4, cArr4, 0, i5);
        if (bArr != null) {
            int i9 = $11 + 49;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr = new char[i5];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 1;
            } else {
                cArr = new char[i5];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            }
            char c2 = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i10 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr3 = {Integer.valueOf(cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c2)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), KeyEvent.keyCodeFromString("") + 22959, 43 - TextUtils.indexOf("", "", 0, 0), -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i10] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c2)};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (View.combineMeasuredStates(0, 0) + 31589), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 9863, TextUtils.lastIndexOf("", '0') + 66, 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i11] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c2 = cArr[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (37822 - (ViewConfiguration.getEdgeSlop() >> 16)), 9754 - View.MeasureSpec.makeMeasureSpec(0, 0), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 27, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            cArr4 = cArr;
        }
        if (i7 > 0) {
            int i12 = $11 + 63;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                char[] cArr5 = new char[i5];
                System.arraycopy(cArr4, 0, cArr5, 0, i5);
                int i13 = i5 >> i7;
                System.arraycopy(cArr5, 1, cArr4, i13, i7);
                System.arraycopy(cArr5, i7, cArr4, 0, i13);
            } else {
                char[] cArr6 = new char[i5];
                System.arraycopy(cArr4, 0, cArr6, 0, i5);
                int i14 = i5 - i7;
                System.arraycopy(cArr6, 0, cArr4, i14, i7);
                System.arraycopy(cArr6, i7, cArr4, 0, i14);
            }
        }
        if (z) {
            int i15 = $11 + 35;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            char[] cArr7 = new char[i5];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                int i17 = $11 + 43;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    cArr7[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr4[i5 >>> buildsetstopreasonintent.RemoteActionCompatParcelizer];
                    i2 = buildsetstopreasonintent.RemoteActionCompatParcelizer % 0;
                } else {
                    cArr7[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr4[(i5 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                    i2 = buildsetstopreasonintent.RemoteActionCompatParcelizer + 1;
                }
                buildsetstopreasonintent.RemoteActionCompatParcelizer = i2;
            }
            cArr4 = cArr7;
        }
        if (i6 > 0) {
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                int i18 = $11 + 23;
                $10 = i18 % 128;
                if (i18 % 2 != 0) {
                    cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] + iArr[2]);
                    i = buildsetstopreasonintent.RemoteActionCompatParcelizer >> 1;
                } else {
                    cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                    i = buildsetstopreasonintent.RemoteActionCompatParcelizer + 1;
                }
                buildsetstopreasonintent.RemoteActionCompatParcelizer = i;
            }
        }
        objArr[0] = new String(cArr4);
    }

    @Override // kotlin.createDoubleSparseArray, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        e(new byte[]{1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1}, new int[]{0, 18, 0, 13}, false, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        f((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 4478), 1357544109 + (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{29462, 64399, 54652, 56738, 8005}, new char[]{44496, 60026, 41296, 45585}, new char[]{0, 0, 0, 0}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                e(new byte[]{0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0}, new int[]{18, 26, 0, 23}, true, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                e(new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}, new int[]{44, 18, 0, 0}, true, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i2 = MediaBrowserCompatItemReceiver + 93;
                AudioAttributesImplApi26Parcelizer = i2 % 128;
                int i3 = i2 % 2;
                baseContext = (!((baseContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4535), 6053 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 42 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    e(new byte[]{1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0}, new int[]{62, 48, 0, 0}, true, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    e(new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0}, new int[]{110, 64, 0, 0}, false, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    e(new byte[]{1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1}, new int[]{174, 64, 87, 17}, true, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    f((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 18868), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 1683737058, new char[]{62357, 37155, 61724, 8879, 20504, 44376, 41113, 18487, 62890, 62862, 12424, 11309, 33525, 26498, 49177, 29558, 12086, 57606, 4066, 22896, 34746, 46377, 63534, 57698, 63741, 2695, 8414, 14563, 29069, 36619, 61156, 57826, 6143, 12828, 65078, 3486, 54121, 63746, 55096, 17757, 8250, 27505, 32936, 64216, 1961, 3720, 59062, 57936, 19497, 2256, 28519, 36100, 9872, 49903, 40733, 56768, 18000, 27887, 27154, 61395, 51018, 10396, 34443, 21444, 57600, 61798, 2826}, new char[]{33215, 42038, 48795, 21065}, new char[]{0, 0, 0, 0}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    f((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 43806), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, new char[]{52640, 48623, 29691, 13846, 36686, 40146}, new char[]{11133, 55836, 16828, 57771}, new char[]{0, 0, 0, 0}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    e(new byte[]{0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1}, new int[]{238, 36, 0, 12}, true, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 6030, 24 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 13183);
            int iBlue = Color.blue(0) + 1649;
            int iBlue2 = Color.blue(0) + 26;
            byte[] bArr = $$d;
            byte b = bArr[65];
            short s = bArr[53];
            Object[] objArr13 = new Object[1];
            g(b, s, (byte) (s & 40), objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(offsetBefore, iBlue, iBlue2, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            int i4 = AudioAttributesImplApi26Parcelizer + 11;
            MediaBrowserCompatItemReceiver = i4 % 128;
            int i5 = i4 % 2;
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char cResolveSize = (char) (View.resolveSize(0, 0) + 13183);
                int scrollBarSize = 1649 - (ViewConfiguration.getScrollBarSize() >> 8);
                int iBlue3 = Color.blue(0) + 26;
                byte[] bArr2 = $$d;
                Object[] objArr14 = new Object[1];
                g(bArr2[68], bArr2[65], bArr2[8], objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(cResolveSize, scrollBarSize, iBlue3, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            f((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 61497), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) - 36, new char[]{44748, 34455, 10403, 47025, 28743, 47222, 53270, 49032, 37922, 20045, 30630, 40071, 58530, 49814, 13748, 54209}, new char[]{25611, 28011, 15851, 20208}, new char[]{0, 0, 0, 0}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            f((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 52912), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 4, new char[]{62920, 25580, 37923, 50731, 32171, 12250, 31706, 55255, 54068, 65161, 38861, 63516, 18575, 16909, 19099, 361}, new char[]{5425, 20614, 47662, 22734}, new char[]{0, 0, 0, 0}, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i6 = AudioAttributesImplApi26Parcelizer + 69;
            MediaBrowserCompatItemReceiver = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, -1202378563};
                byte[] bArr3 = $$j;
                Object[] objArr18 = new Object[1];
                h((byte) (-bArr3[162]), bArr3[6], (byte) (-bArr3[11]), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                h((byte) ($$k & 28), bArr3[28], bArr3[88], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char doubleTapTimeout = (char) (13183 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                    int iBlue4 = Color.blue(0) + 1649;
                    int keyRepeatDelay = 26 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    byte[] bArr4 = $$d;
                    Object[] objArr20 = new Object[1];
                    g(bArr4[68], bArr4[65], bArr4[8], objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(doubleTapTimeout, iBlue4, keyRepeatDelay, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    e(new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, new int[]{274, 22, 119, 0}, false, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    f((char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 29880), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 404266820, new char[]{39104, 14708, 3028, 58803, 60574, 11012, 34936, 10238, 13932, 62435, 40298, 32458, 38611, 4270, 12222}, new char[]{48407, 59232, 47591, 64628}, new char[]{0, 0, 0, 0}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 13183);
                        int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1649;
                        int iIndexOf = 26 - TextUtils.indexOf("", "", 0);
                        byte[] bArr5 = $$d;
                        Object[] objArr23 = new Object[1];
                        g(bArr5[68], (short) ($$e | 64), bArr5[8], objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(trimmedLength, doubleTapTimeout2, iIndexOf, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 13184);
                        int absoluteGravity = 1649 - Gravity.getAbsoluteGravity(0, 0);
                        int tapTimeout = 26 - (ViewConfiguration.getTapTimeout() >> 16);
                        byte[] bArr6 = $$d;
                        byte b2 = bArr6[65];
                        short s2 = bArr6[53];
                        Object[] objArr24 = new Object[1];
                        g(b2, s2, (byte) (s2 & 40), objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(cLastIndexOf, absoluteGravity, tapTimeout, -133433128, false, (String) objArr24[0], null);
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
            long j2 = 0;
            long j3 = (((long) (i9 ^ i8)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (View.resolveSizeAndState(0, 0, 0) + 4535), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6053, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
            int i10 = MediaBrowserCompatItemReceiver + 23;
            AudioAttributesImplApi26Parcelizer = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr25 = {324087576, Long.valueOf(j3), arrayList, strRemoteActionCompatParcelizer, true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getTapTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6029, View.MeasureSpec.getMode(0) + 24);
                Object[] objArr26 = new Object[1];
                h(r1[17], (short) ($$j[32] + 1), r1[46], objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        CmcdConfigurationRequestConfig.write(this, null, R.attr.onSurfaceBlue2, R.attr.onSurfaceBlue2, false, 9);
        super.onCreate(p0);
        if (p0 == null) {
            int i12 = AudioAttributesImplApi26Parcelizer + 63;
            MediaBrowserCompatItemReceiver = i12 % 128;
            int i13 = i12 % 2;
            createFloatSparseArray.Companion iconCompatParcelizer = createFloatSparseArray.INSTANCE;
            CmcdConfigurationRequestConfig.write(this, R.id.container, createFloatSparseArray.Companion.RemoteActionCompatParcelizer());
        }
        int i14 = AudioAttributesImplApi26Parcelizer + 55;
        MediaBrowserCompatItemReceiver = i14 % 128;
        int i15 = i14 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x073f  */
    @Override // kotlin.createDoubleSparseArray, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onStart() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createFloatList.onStart():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009d  */
    @Override // kotlin.createDoubleSparseArray, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createFloatList.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    @Override // kotlin.createDoubleSparseArray, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createFloatList.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:(28:33|294|34|(3:36|37|(2:39|41)(1:40))(1:41)|77|282|78|(2:288|80)|84|85|(2:87|(5:89|90|(1:92)|93|94)(4:95|(1:97)|98|99))(22:100|101|289|102|103|297|104|(1:106)|107|108|290|109|(1:111)|112|113|114|(1:116)|117|(1:119)|120|(1:122)|123)|124|(5:127|128|(13:307|130|(3:132|(3:135|136|133)|312)|137|280|138|(1:140)|141|142|143|299|144|311)(1:310)|309|125)|308|183|(1:185)|186|(2:188|(4:190|(1:192)|193|194)(3:195|(1:197)|198))(13:200|286|201|202|(1:204)|205|292|206|207|(1:209)|210|(1:212)|213)|199|214|(6:216|217|(1:219)|220|221|222)|223|(1:225)|226|(3:228|(1:230)|231)(14:233|234|(1:236)|237|238|(1:240)|241|295|242|243|(1:245)|246|(1:248)|249)|232|250|(7:252|253|(1:255)|256|257|258|259)(1:313))|301|50|(1:52)|53|77|282|78|(0)|84|85|(0)(0)|124|(1:125)|308|183|(0)|186|(0)(0)|199|214|(0)|223|(0)|226|(0)(0)|232|250|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0aa2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0aa3, code lost:
    
        r9 = r32;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0617 A[Catch: all -> 0x0aa2, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0aa2, blocks: (B:78:0x04fe, B:84:0x0551, B:100:0x0617), top: B:282:0x04fe }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x095e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0b36 A[Catch: all -> 0x02dc, TryCatch #15 {all -> 0x02dc, blocks: (B:71:0x0433, B:73:0x0439, B:74:0x0466, B:217:0x1048, B:219:0x104e, B:220:0x107b, B:253:0x14de, B:255:0x14e4, B:256:0x150d, B:234:0x129c, B:236:0x12bf, B:237:0x1311, B:177:0x0b30, B:179:0x0b36, B:180:0x0b62, B:19:0x00d8, B:21:0x00de, B:22:0x0105, B:24:0x0250, B:26:0x0282, B:27:0x02d6), top: B:303:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0bfd  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0c4f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0d0d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x1025  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x1112  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x1161  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x11af  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x14bb  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0504 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:313:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x055e  */
    @Override // kotlin.createDoubleSparseArray, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createFloatList.attachBaseContext(android.content.Context):void");
    }

    static {
        AudioAttributesImplApi21Parcelizer = 1;
        MediaBrowserCompatCustomActionResultReceiver();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatCustomActionResultReceiver + 101;
        AudioAttributesImplApi21Parcelizer = i % 128;
        int i2 = i % 2;
    }

    @getMagicModuleMeta
    public static final Intent RemoteActionCompatParcelizer(Context context) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 5;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Intent intentRemoteActionCompatParcelizer = Companion.RemoteActionCompatParcelizer(context);
        int i4 = MediaBrowserCompatItemReceiver + 89;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return intentRemoteActionCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void MediaBrowserCompatCustomActionResultReceiver() {
        IconCompatParcelizer = new char[]{44990, 45036, 44995, 44996, 45051, 45018, 44981, 45035, 45050, 45027, 45038, 45030, 45049, 45024, 45037, 45027, 45025, 45050, 44979, 45031, 45012, 45036, 45052, 45028, 45029, 45029, 45028, 45025, 45016, 44989, 44997, 45050, 45026, 45005, 44995, 45036, 45030, 45050, 45025, 45027, 45037, 45032, 45032, 45033, 44989, 45028, 45030, 45028, 45024, 45032, 45036, 45024, 45028, 45050, 45010, 45008, 45051, 45027, 45025, 45048, 45049, 45030, 44984, 45039, 44997, 44978, 44988, 44989, 44988, 44993, 44999, 44998, 45032, 45032, 45033, 44999, 44990, 44993, 44992, 44987, 44987, 44984, 44992, 44992, 44999, 44997, 44978, 44997, 45039, 44998, 44987, 44995, 45038, 44992, 44984, 44998, 45039, 45039, 44997, 44988, 44990, 44991, 44993, 45035, 45032, 45033, 45038, 44993, 44984, 44998, 44946, 44995, 45033, 44995, 44985, 44998, 44998, 44988, 44991, 44988, 44999, 45033, 44995, 44986, 44992, 44999, 44993, 45033, 45033, 44999, 44989, 44989, 44988, 44988, 44999, 44995, 44987, 44986, 44990, 44978, 44990, 44987, 44986, 44984, 44993, 44992, 44998, 44998, 44984, 44987, 44990, 44989, 44998, 45033, 45038, 45039, 44993, 44992, 44992, 44990, 44989, 44984, 44986, 44991, 44988, 44990, 44988, 44997, 45039, 45038, 44998, 44999, 44998, 44991, 45005, 44847, 44849, 44851, 44841, 44801, 44800, 44841, 44849, 44847, 44846, 44843, 44802, 44843, 44851, 44842, 44842, 44846, 44804, 44807, 44807, 44841, 44840, 44840, 44842, 44843, 44840, 44801, 44800, 44842, 44848, 44854, 44841, 44840, 44821, 44802, 44843, 44842, 44843, 44840, 44802, 44840, 44841, 44841, 44848, 44848, 44847, 44841, 44843, 44807, 44801, 44800, 44801, 44807, 44847, 44849, 44844, 44806, 44803, 44803, 44802, 44802, 44842, 44850, 44950, 44997, 44997, 44984, 44965, 44987, 44987, 44990, 44988, 44998, 44995, 44987, 44990, 44988, 44993, 44995, 44993, 45038, 45038, 44996, 44990, 44995, 44998, 44996, 44995, 44964, 44987, 44992, 44999, 44985, 44984, 44991, 44991, 44991, 44986, 44995, 45030, 44884, 44906, 44904, 44909, 44905, 44887, 44874, 44879, 44898, 44877, 44861, 44887, 44903, 44896, 44905, 44906, 44869, 44868, 44910, 44906, 44884, 44950, 44990, 44985, 44985, 44984, 44985, 44991, 44989, 44989, 44990, 44985};
        write = -3498762522182953692L;
        RemoteActionCompatParcelizer = -136981212;
        read = (char) 11504;
    }
}
