package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/isAtLeastKitKatWatch;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Lo/parseTileCountFromProperties;", "RemoteActionCompatParcelizer", "Lo/parseTileCountFromProperties;", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class isAtLeastKitKatWatch extends isAtLeastJellyBeanMR2 {
    private static long AudioAttributesCompatParcelizer;
    private static char AudioAttributesImplApi21Parcelizer;
    private static char AudioAttributesImplBaseParcelizer;
    private static char IconCompatParcelizer;
    private static int MediaBrowserCompatCustomActionResultReceiver;
    private static char read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private parseTileCountFromProperties write;
    private static final byte[] $$c = {112, -82, -21, -22};
    private static final int $$f = 81;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {38, -16, -7, 121, -59, 63, 4, 21, -45, 41, 12, 17, 4, 7, -9, 5, -9, 33, 9, 7, 4, -7, 2, 18, -33, 47, 9, 1, -6, 25, 25, 14, 8, 11, -9, -30, 40, 23, -5, 12, 5, -37, TarConstants.LF_SYMLINK, 4, 9, -9, 25, -30, 23, 23, -9, 8, 13, 3, 23, -15, 19, 18, 4, -57, 62, 1, 24, 7, -9, 19, 12, -5, 5, -56, 66, -3, 8, 14, 14, 2, 5, -58, 60, 3, 25, -13, 7, 13, 11, -4, -48, 66, 0, 13, -52, 9, 0, 34, 0, 13, -20, 9, 39, 37, -5, 9, -66, TarConstants.LF_BLK, 21, 28, -29, 43, -3, -5, -17, 25, 18, -2, 58, -11, 11, 12, -40, 57, 6, 4, -3, -1, 25, 5, -9, 20, -42, TarConstants.LF_SYMLINK, 4, 9, -9, 25, -30, 23, 23, -9, 8, 13, 3, 23, -15, 19};
    private static final int $$k = 191;
    private static final byte[] $$d = {81, -92, 74, -108, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 30;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static int AudioAttributesImplApi26Parcelizer = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(short r6, int r7, byte r8) {
        /*
            int r8 = r8 + 4
            byte[] r0 = kotlin.isAtLeastKitKatWatch.$$c
            int r6 = r6 * 2
            int r1 = r6 + 1
            int r7 = r7 + 119
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r6
            r7 = r8
            r3 = r2
            goto L28
        L13:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L17:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r0[r7]
        L28:
            int r4 = -r4
            int r8 = r8 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isAtLeastKitKatWatch.$$i(short, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = 191 - r5
            int r6 = r6 + 65
            int r0 = 44 - r7
            byte[] r1 = kotlin.isAtLeastKitKatWatch.$$d
            byte[] r0 = new byte[r0]
            int r7 = 43 - r7
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r5
            r6 = r7
            r3 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L21:
            r4 = r1[r5]
            int r3 = r3 + 1
        L25:
            int r5 = r5 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-1)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isAtLeastKitKatWatch.g(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = 111 - r7
            int r6 = 58 - r6
            int r5 = 113 - r5
            byte[] r0 = kotlin.isAtLeastKitKatWatch.$$j
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L11
            r4 = r7
            r3 = r2
            r7 = r6
            goto L25
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L21:
            int r5 = r5 + 1
            r4 = r0[r5]
        L25:
            int r7 = r7 + r4
            int r7 = r7 + (-6)
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isAtLeastKitKatWatch.h(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.isAtLeastKitKatWatch$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/isAtLeastKitKatWatch$write;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent AudioAttributesCompatParcelizer(Context p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new Intent(p0, (Class<?>) isAtLeastKitKatWatch.class);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void e(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i3 = notifydownloadchanged.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 2);
                    objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.getTrimmedLength("") + 38461), 532 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 9 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -735610793, false, $$i(b, b2, (byte) (b2 - 3)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (AudioAttributesCompatParcelizer ^ 2192498202983240651L);
                Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (View.getDefaultSize(0, 0) + 36621), 2340 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 29, 188119637, false, $$i(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i4 = $11 + 59;
                $10 = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i6 = $10 + 123;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            Object[] objArr4 = {notifydownloadchanged, notifydownloadchanged};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1971306176);
            if (objRemoteActionCompatParcelizer3 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (Color.blue(0) + 36621), 2340 - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 29, 188119637, false, $$i(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        int i5 = 0;
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        while (isstopped.read < cArr.length) {
            int i6 = $11 + 1;
            $10 = i6 % 128;
            int i7 = 58224;
            if (i6 % i3 != 0) {
                cArr3[i5] = cArr[isstopped.read];
                cArr3[i5] = cArr[isstopped.read];
                i2 = 1;
            } else {
                cArr3[i5] = cArr[isstopped.read];
                cArr3[1] = cArr[isstopped.read + 1];
                i2 = i5;
            }
            while (i2 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i5];
                int i8 = (c2 + i7) ^ ((c2 << 4) + ((char) (((long) AudioAttributesImplBaseParcelizer) ^ 1193402106669854891L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(AudioAttributesImplApi21Parcelizer);
                    objArr2[i3] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i5] = Integer.valueOf(c);
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        int iNormalizeMetaState = 1504 - KeyEvent.normalizeMetaState(i5);
                        int mirror = 'E' - AndroidCharacter.getMirror('0');
                        byte b = (byte) i5;
                        byte b2 = (byte) (b + 3);
                        String str$$i = $$i(b, b2, (byte) (b2 - 4));
                        Class[] clsArr = new Class[4];
                        clsArr[i5] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objRemoteActionCompatParcelizer = startForeground.read(tapTimeout, iNormalizeMetaState, mirror, 1322448859, false, str$$i, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) IconCompatParcelizer) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(read)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 3);
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) View.MeasureSpec.getSize(0), View.resolveSizeAndState(0, 0, 0) + 1504, 20 - ExpandableListView.getPackedPositionChild(0L), 1322448859, false, $$i(b3, b4, (byte) (b4 - 4)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i2++;
                    cArr3 = cArr4;
                    i3 = 2;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[isstopped.read] = cArr5[0];
            cArr2[isstopped.read + 1] = cArr5[1];
            Object[] objArr4 = {isstopped, isstopped};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-167774474);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 9016 - View.MeasureSpec.getSize(0), 58 - TextUtils.indexOf("", "", 0), -1950993821, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            int i10 = $10 + 103;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 5 / 4;
            }
            cArr3 = cArr5;
            i3 = 2;
            i5 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i12 = $11 + 15;
        $10 = i12 % 128;
        int i13 = i12 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0140  */
    @Override // kotlin.isAtLeastJellyBeanMR2, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isAtLeastKitKatWatch.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ba  */
    @Override // kotlin.isAtLeastJellyBeanMR2, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isAtLeastKitKatWatch.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a8  */
    @Override // kotlin.isAtLeastJellyBeanMR2, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isAtLeastKitKatWatch.onPause():void");
    }

    @Override // kotlin.isAtLeastJellyBeanMR2, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        String strValueOf;
        String strValueOf2;
        Object[] objArr;
        Object[] objArr2;
        List<Object[]> list;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 103;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        char c = 1;
        Object[] objArr3 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 23202, new char[]{44141, 63153, 6606, 48135, 50991, 27258, 35994, 55271, 31483, 40212, 8220, 19277, 60826, 12500, 23525, 65076, 335, 42108}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(3) + 18502, new char[]{44129, 58572, 15659, 30286, 36492}, objArr4);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context applicationContext = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
            if (applicationContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.getCapsMode("", 0, 0) + 4535), Gravity.getAbsoluteGravity(0, 0) + 6054, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr5 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(3) + 39066, new char[]{44143, 13620, 40486, 26445, 51291, 20777, 14883, 33589, 25680, 52559, 22205, 16314, 33013, 27075, 62174, 23546, 15596, 34228, 28293, 63435, 22843, 8824, 35700, 27678, 62732, 24111, 10090, 34866, 4435, 64068, 17336, 9391, 36297, 5779, 65408, 16558, 10682, 45710, 7040, 64704, 18016, 12074, 45079, 6422, 57864, 19324, 11324, 46346}, objArr5);
                    String str = (String) objArr5[0];
                    Object[] objArr6 = new Object[1];
                    e((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 36096, new char[]{44092, 8558, 46701, 2879, 38975, 28008, 57917, 30525, 50225, 22834, 11874, 41829, 12336, 34096, 6758, 61237, 31869, 61816, 18047, 56102, 43054, 15649, 45614, 1826, 38006, 26916, 65063, 29479, 49193, 21798, 10784, 48931, 3100, 33049, 5708, 60188, 30798, 52507, 16921, 55067, 42012, 14610, 36420, 835, 36932, 25927, 64019, 20295, 56332, 20740, 9739, 47887, 2057, 40192, 4622, 59150, 29708, 51539, 24147, 54100, 40965, 13652, 35329, 7940}, objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    e(31013 - View.resolveSize(0, 0), new char[]{44142, 54552, 24103, 50951, 18601, 61831, 31409, 64567, 25920, 60965, 5963, 39082, 392, 35468, 3182, 46403, 15972, 42776, 10484, 20866, 56026, 23604, 50449, 20077, 63309, 30964, 57770, 27346, 60467, 5387, 40555, 1871, 34968, 12712, 47825, 15462, 42329, 11824, 22337, 55497, 16885, 51923, 19579, 62731, 32307, 59327, 26778, 37286, 6857, 40061, 1360, 36402, 14265, 47251, 8689, 43676, 11301, 21843, 56923, 18409, 51350, 29162, 64204, 31791}, objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(0) + 51856, new char[]{44132, 26317, 14610, 52323, 34475, 22975, 27677, 9936, 63936, 35888, 18295, 6567, 11273, 59215, 47493, 19682, 1842, 55917, 60613, 42829, 31324, 3261, 51184, 39466, 44181, 26581, 14861, 52602, 34739, 23289, 27924, 10112, 64217, 36152, 16500, 6871, 11531, 57428, 47783, 19966, '6', 55956, 60816, 40968, 31615, 3504, 49317, 39766, 44428, 24768, 15225, 52842, 32934, 23314, 28231, 8348, 64480, 36462, 16760, 7049, 11855, 57672, 48044, 20194, 290, 56205, 61141}, objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    f(6 - (KeyEvent.getMaxKeyCode() >> 16), new char[]{29920, 16570, 47322, 46138, 13529, 16087}, objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    e((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 16032, new char[]{44094, 37532, 53548, 6104, 22206, 38171, 56315, 6746, 22825, 40861, 56864, 7391, 17382, 33292, 49398, 1877, 17960, 33930, 52083, 2502, 18682, 36619, 52714, 3158, 29554, 45442, 61495, 14021, 30119, 46164, 64177, 14613, 30749, 48812, 64856, 15417}, objArr10);
                    Object[] objArr11 = {applicationContext, str, str2, str3, str4, true, str5, (String) objArr10[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getJumpTapTimeout() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 6030, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 24, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr11);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        try {
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-18205161);
            if (objRemoteActionCompatParcelizer3 == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 61148);
                int i4 = 2145 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 12;
                Object[] objArr12 = new Object[1];
                g((short) 78, $$d[9], (byte) 40, objArr12);
                objRemoteActionCompatParcelizer3 = startForeground.read(cIndexOf, i4, iKeyCodeFromString, -2136739198, false, (String) objArr12[0], null);
            }
            if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
                int i5 = MediaBrowserCompatItemReceiver + 89;
                MediaBrowserCompatMediaItem = i5 % 128;
                if (i5 % 2 == 0) {
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-629126231);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char c2 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 61148);
                        int i6 = 2145 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 12;
                        byte[] bArr = $$d;
                        Object[] objArr13 = new Object[1];
                        g((short) (bArr[2] + 1), (byte) (-bArr[113]), bArr[14], objArr13);
                        objRemoteActionCompatParcelizer4 = startForeground.read(c2, i6, doubleTapTimeout, -1530294468, false, (String) objArr13[0], null);
                    }
                    throw null;
                }
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-629126231);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 61148);
                    int i7 = 2145 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    int deadChar = 12 - KeyEvent.getDeadChar(0, 0);
                    byte[] bArr2 = $$d;
                    Object[] objArr14 = new Object[1];
                    g((short) (bArr2[2] + 1), (byte) (-bArr2[113]), bArr2[14], objArr14);
                    objRemoteActionCompatParcelizer5 = startForeground.read(packedPositionGroup, i7, deadChar, -1530294468, false, (String) objArr14[0], null);
                }
                list = (List) ((Field) objRemoteActionCompatParcelizer5).get(null);
            } else {
                Object[] objArr15 = new Object[1];
                f(((byte) KeyEvent.getModifierMetaStateMask()) + 17, new char[]{50041, 41657, 64389, 21902, 47669, 4183, 50565, 56348, 2610, 40287, 56054, 51490, 6952, 57074, 61936, 3524}, objArr15);
                Class<?> cls2 = Class.forName((String) objArr15[0]);
                Object[] objArr16 = new Object[1];
                f((ViewConfiguration.getScrollDefaultDelay() >> 16) + 16, new char[]{15719, 36021, 24404, 4988, 40389, 43577, 6107, 25041, 3590, 29417, 1844, 47639, 15025, 62629, 30319, 14254}, objArr16);
                int iIntValue2 = ((Integer) cls2.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr17 = {-1525758498};
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-173351824);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        objRemoteActionCompatParcelizer6 = startForeground.read((char) (TextUtils.indexOf("", "") + 45845), View.MeasureSpec.getMode(0) + 913, 9 - TextUtils.indexOf((CharSequence) "", '0'), -1948051227, false, null, new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr18 = {Integer.valueOf(iIntValue2), ((Constructor) objRemoteActionCompatParcelizer6).newInstance(objArr17)};
                        Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(1891595430);
                        if (objRemoteActionCompatParcelizer7 == null) {
                            char c3 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 61147);
                            int iResolveSizeAndState = 2145 - View.resolveSizeAndState(0, 0, 0);
                            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 12;
                            byte[] bArr3 = $$d;
                            short s = (short) (-bArr3[15]);
                            byte b = bArr3[75];
                            Object[] objArr19 = new Object[1];
                            g(s, b, (byte) (b | 16), objArr19);
                            objRemoteActionCompatParcelizer7 = startForeground.read(c3, iResolveSizeAndState, iIndexOf, 251047987, false, (String) objArr19[0], new Class[]{Integer.TYPE, (Class) startForeground.IconCompatParcelizer((char) (ImageFormat.getBitsPerPixel(0) + 1), 557 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 19 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))});
                        }
                        list = (List) ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr18);
                        Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-629126231);
                        if (objRemoteActionCompatParcelizer8 == null) {
                            char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 61148);
                            int absoluteGravity = 2145 - Gravity.getAbsoluteGravity(0, 0);
                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 12;
                            byte[] bArr4 = $$d;
                            Object[] objArr20 = new Object[1];
                            g((short) (bArr4[2] + 1), (byte) (-bArr4[113]), bArr4[14], objArr20);
                            objRemoteActionCompatParcelizer8 = startForeground.read(threadPriority, absoluteGravity, maxKeyCode, -1530294468, false, (String) objArr20[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer8).set(null, list);
                        Object[] objArr21 = new Object[1];
                        f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 18, new char[]{50565, 56348, 21324, 47107, 42014, 41473, 8208, 41131, 5665, 44803, 16334, 8691, 25669, 32713, 45185, 49348, 64266, 7364, 53848, 22110, 62647, 30822}, objArr21);
                        Class<?> cls3 = Class.forName((String) objArr21[0]);
                        Object[] objArr22 = new Object[1];
                        e((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 50152, new char[]{44137, 28553, 11199, 59335, 41947, 32740, 15134, 63233, 45857, 20316, 2938, 51067, 33417, 24244, 6871}, objArr22);
                        long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(301834150);
                        if (objRemoteActionCompatParcelizer9 == null) {
                            char c4 = (char) (61148 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                            int iGreen = Color.green(0) + 2145;
                            int packedPositionType = 12 - ExpandableListView.getPackedPositionType(0L);
                            byte[] bArr5 = $$d;
                            short s2 = bArr5[103];
                            Object[] objArr23 = new Object[1];
                            g(s2, (byte) (s2 & 117), (byte) (-bArr5[45]), objArr23);
                            objRemoteActionCompatParcelizer9 = startForeground.read(c4, iGreen, packedPositionType, 1874090803, false, (String) objArr23[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer9).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        Object objRemoteActionCompatParcelizer10 = startForeground.RemoteActionCompatParcelizer(-18205161);
                        if (objRemoteActionCompatParcelizer10 == null) {
                            char trimmedLength = (char) (61148 - TextUtils.getTrimmedLength(""));
                            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2145;
                            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 13;
                            Object[] objArr24 = new Object[1];
                            g((short) 78, $$d[9], (byte) 40, objArr24);
                            objRemoteActionCompatParcelizer10 = startForeground.read(trimmedLength, maximumDrawingCacheSize, packedPositionChild, -2136739198, false, (String) objArr24[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer10).set(null, lValueOf2);
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
            for (Object[] objArr25 : list) {
                int i8 = MediaBrowserCompatItemReceiver + 105;
                MediaBrowserCompatMediaItem = i8 % 128;
                int i9 = i8 % 2;
                int i10 = ((int[]) objArr25[3])[0];
                int i11 = ((int[]) objArr25[c])[0];
                if (i11 != i10) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr25[2];
                    if (strArr != null) {
                        for (String str6 : strArr) {
                            arrayList.add(str6);
                        }
                    }
                    long j = -1;
                    long j2 = 0;
                    long j3 = (((j - ((j >> 63) << 32)) | (((long) 0) << 32)) & ((long) (i11 ^ i10))) | (((long) 10) << 32) | (j2 - ((j2 >> 63) << 32));
                    try {
                        Object objRemoteActionCompatParcelizer11 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                        if (objRemoteActionCompatParcelizer11 == null) {
                            objRemoteActionCompatParcelizer11 = startForeground.read((char) (4535 - Color.red(0)), 6054 - ExpandableListView.getPackedPositionGroup(0L), 43 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                        }
                        Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer11).invoke(null, null);
                        try {
                            Object[] objArr26 = {-1525758498, Long.valueOf(j3), arrayList, TrainingApplication.RemoteActionCompatParcelizer(), false};
                            Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), View.MeasureSpec.getMode(0) + 6030, 25 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                            byte[] bArr6 = $$j;
                            Object[] objArr27 = new Object[1];
                            h((byte) 84, (byte) (-bArr6[35]), (byte) (-bArr6[106]), objArr27);
                            cls4.getMethod((String) objArr27[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr26);
                        } catch (Throwable th4) {
                            Throwable cause4 = th4.getCause();
                            if (cause4 == null) {
                                throw th4;
                            }
                            throw cause4;
                        }
                    } catch (Throwable th5) {
                        Throwable cause5 = th5.getCause();
                        if (cause5 == null) {
                            throw th5;
                        }
                        throw cause5;
                    }
                }
                c = 1;
            }
        } catch (Throwable th6) {
            Object[] objArr28 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(3) + 40527, new char[]{44088, 12941, 37203, 28705, 55033, 46405, 5129, 64219, 22957, 14449, 40642}, objArr28);
            String str7 = (String) objArr28[0];
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                PrintStream printStream = new PrintStream(byteArrayOutputStream);
                th6.printStackTrace(printStream);
                printStream.close();
                strValueOf = byteArrayOutputStream.toString(CharsetNames.UTF_8);
            } catch (Throwable unused) {
                strValueOf = String.valueOf(th6);
            }
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(strValueOf);
            arrayList2.add(str7);
            Object objRemoteActionCompatParcelizer12 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer12 == null) {
                objRemoteActionCompatParcelizer12 = startForeground.read((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 4535), 6054 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke3 = ((Method) objRemoteActionCompatParcelizer12).invoke(null, null);
            try {
                Object[] objArr29 = {-1525758498, 81604378625L, arrayList2, TrainingApplication.RemoteActionCompatParcelizer(), false};
                Class cls5 = (Class) startForeground.IconCompatParcelizer((char) ExpandableListView.getPackedPositionType(0L), 6030 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24);
                byte[] bArr7 = $$j;
                Object[] objArr30 = new Object[1];
                h((byte) 84, (byte) (-bArr7[35]), (byte) (-bArr7[106]), objArr30);
                cls5.getMethod((String) objArr30[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke3, objArr29);
            } catch (Throwable th7) {
                Throwable cause6 = th7.getCause();
                if (cause6 == null) {
                    throw th7;
                }
                throw cause6;
            }
        }
        Context applicationContext2 = context;
        try {
            if (applicationContext2 != null) {
                int i12 = MediaBrowserCompatItemReceiver + 5;
                MediaBrowserCompatMediaItem = i12 % 128;
                if (i12 % 2 == 0) {
                    boolean z = applicationContext2 instanceof ContextWrapper;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                applicationContext2 = ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : context.getApplicationContext();
            }
            try {
                Object[] objArr31 = {-1525758498};
                Object objRemoteActionCompatParcelizer13 = startForeground.RemoteActionCompatParcelizer(-1128409246);
                if (objRemoteActionCompatParcelizer13 == null) {
                    objRemoteActionCompatParcelizer13 = startForeground.read((char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getLongPressTimeout() >> 16) + 1991, 12 - View.MeasureSpec.makeMeasureSpec(0, 0), -1024191497, false, null, new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr32 = {applicationContext2, ((Constructor) objRemoteActionCompatParcelizer13).newInstance(objArr31)};
                    Object objRemoteActionCompatParcelizer14 = startForeground.RemoteActionCompatParcelizer(352975618);
                    if (objRemoteActionCompatParcelizer14 == null) {
                        char c5 = (char) (19324 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 2759;
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 99;
                        byte[] bArr8 = $$d;
                        short s3 = bArr8[103];
                        Object[] objArr33 = new Object[1];
                        g(s3, (byte) (s3 & 117), (byte) (-bArr8[45]), objArr33);
                        objRemoteActionCompatParcelizer14 = startForeground.read(c5, pressedStateDuration, tapTimeout, 1799372695, false, (String) objArr33[0], new Class[]{Context.class, (Class) startForeground.IconCompatParcelizer((char) (TextUtils.getOffsetAfter("", 0) + 9580), 3446 - TextUtils.getCapsMode("", 0, 0), 144 - (ViewConfiguration.getScrollDefaultDelay() >> 16))});
                    }
                    ((Method) objRemoteActionCompatParcelizer14).invoke(null, objArr32);
                } catch (Throwable th8) {
                    Throwable cause7 = th8.getCause();
                    if (cause7 == null) {
                        throw th8;
                    }
                    throw cause7;
                }
            } catch (Throwable th9) {
                Throwable cause8 = th9.getCause();
                if (cause8 == null) {
                    throw th9;
                }
                throw cause8;
            }
        } catch (Throwable th10) {
            Object[] objArr34 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(3) + 9009, new char[]{44084, 36776, 60176, 50819, 8812, 7638, 31045, 21799, 45202, 60419, 53226}, objArr34);
            String str8 = (String) objArr34[0];
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                PrintStream printStream2 = new PrintStream(byteArrayOutputStream2);
                th10.printStackTrace(printStream2);
                printStream2.close();
                strValueOf2 = byteArrayOutputStream2.toString(CharsetNames.UTF_8);
            } catch (Throwable unused2) {
                strValueOf2 = String.valueOf(th10);
            }
            ArrayList arrayList3 = new ArrayList(2);
            arrayList3.add(strValueOf2);
            arrayList3.add(str8);
            Object objRemoteActionCompatParcelizer15 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer15 == null) {
                objRemoteActionCompatParcelizer15 = startForeground.read((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 4534), (KeyEvent.getMaxKeyCode() >> 16) + 6054, Color.alpha(0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke4 = ((Method) objRemoteActionCompatParcelizer15).invoke(null, null);
            Object[] objArr35 = {-1525758498, 81604378625L, arrayList3, TrainingApplication.RemoteActionCompatParcelizer(), false};
            Class cls6 = (Class) startForeground.IconCompatParcelizer((char) ExpandableListView.getPackedPositionGroup(0L), 6030 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (Process.myPid() >> 22) + 24);
            byte[] bArr9 = $$j;
            Object[] objArr36 = new Object[1];
            h((byte) 84, (byte) (-bArr9[35]), (byte) (-bArr9[106]), objArr36);
            cls6.getMethod((String) objArr36[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke4, objArr35);
        }
        Object objRemoteActionCompatParcelizer16 = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer16 == null) {
            char c6 = (char) (13184 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
            int iIndexOf2 = 1649 - TextUtils.indexOf("", "", 0);
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 26;
            Object[] objArr37 = new Object[1];
            g((short) 187, (byte) (-$$d[113]), r4[5], objArr37);
            objRemoteActionCompatParcelizer16 = startForeground.read(c6, iIndexOf2, minimumFlingVelocity, -133433128, false, (String) objArr37[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer16).getLong(null) != -1) {
            int i13 = MediaBrowserCompatMediaItem + 41;
            MediaBrowserCompatItemReceiver = i13 % 128;
            int i14 = i13 % 2;
            Object objRemoteActionCompatParcelizer17 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer17 == null) {
                char mirror = (char) (AndroidCharacter.getMirror('0') + 13135);
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1649;
                int i15 = (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 26;
                Object[] objArr38 = new Object[1];
                g((short) 144, r4[5], (byte) (-$$d[30]), objArr38);
                objRemoteActionCompatParcelizer17 = startForeground.read(mirror, keyRepeatTimeout, i15, -1033747278, false, (String) objArr38[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer17).get(null);
        } else {
            Object[] objArr39 = new Object[1];
            f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 30, new char[]{50041, 41657, 64389, 21902, 47669, 4183, 50565, 56348, 2610, 40287, 56054, 51490, 6952, 57074, 61936, 3524}, objArr39);
            Class<?> cls7 = Class.forName((String) objArr39[0]);
            Object[] objArr40 = new Object[1];
            f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 30, new char[]{15719, 36021, 24404, 4988, 40389, 43577, 6107, 25041, 3590, 29417, 1844, 47639, 15025, 62629, 30319, 14254}, objArr40);
            try {
                Object[] objArr41 = {Integer.valueOf(((Integer) cls7.getMethod((String) objArr40[0], Object.class).invoke(null, this)).intValue()), 0, -307266128};
                byte[] bArr10 = $$j;
                Object[] objArr42 = new Object[1];
                h(bArr10[119], bArr10[88], bArr10[10], objArr42);
                Class<?> cls8 = Class.forName((String) objArr42[0]);
                byte b2 = bArr10[88];
                Object[] objArr43 = new Object[1];
                h(b2, (byte) (b2 | 27), (byte) ($$k & 110), objArr43);
                objArr = (Object[]) cls8.getMethod((String) objArr43[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr41);
                Object objRemoteActionCompatParcelizer18 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer18 == null) {
                    char c7 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 13182);
                    int mirror2 = 1697 - AndroidCharacter.getMirror('0');
                    int iBlue = Color.blue(0) + 26;
                    Object[] objArr44 = new Object[1];
                    g((short) 144, r6[5], (byte) (-$$d[30]), objArr44);
                    objRemoteActionCompatParcelizer18 = startForeground.read(c7, mirror2, iBlue, -1033747278, false, (String) objArr44[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer18).set(null, objArr);
                try {
                    Object[] objArr45 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 12, new char[]{50565, 56348, 21324, 47107, 42014, 41473, 8208, 41131, 5665, 44803, 16334, 8691, 25669, 32713, 45185, 49348, 64266, 7364, 53848, 22110, 62647, 30822}, objArr45);
                    Class<?> cls9 = Class.forName((String) objArr45[0]);
                    Object[] objArr46 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 50149, new char[]{44137, 28553, 11199, 59335, 41947, 32740, 15134, 63233, 45857, 20316, 2938, 51067, 33417, 24244, 6871}, objArr46);
                    long jLongValue2 = ((Long) cls9.getDeclaredMethod((String) objArr46[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue2);
                    Object objRemoteActionCompatParcelizer19 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer19 == null) {
                        char maximumDrawingCacheSize2 = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 13183);
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 1649;
                        int capsMode = 26 - TextUtils.getCapsMode("", 0, 0);
                        Object[] objArr47 = new Object[1];
                        g((short) 111, r13[5], (byte) (-$$d[30]), objArr47);
                        objRemoteActionCompatParcelizer19 = startForeground.read(maximumDrawingCacheSize2, offsetAfter, capsMode, 54351865, false, (String) objArr47[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer19).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                    Object objRemoteActionCompatParcelizer20 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer20 == null) {
                        char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 13183);
                        int i16 = 1650 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 26;
                        Object[] objArr48 = new Object[1];
                        g((short) 187, (byte) (-$$d[113]), r14[5], objArr48);
                        objRemoteActionCompatParcelizer20 = startForeground.read(longPressTimeout, i16, iMakeMeasureSpec, -133433128, false, (String) objArr48[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer20).set(null, lValueOf4);
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            } catch (Throwable th11) {
                Throwable cause9 = th11.getCause();
                if (cause9 == null) {
                    throw th11;
                }
                throw cause9;
            }
        }
        int i17 = ((int[]) objArr[3])[0];
        int i18 = ((int[]) objArr[2])[0];
        if (i18 != i17) {
            long j4 = -1;
            long j5 = ((long) (i18 ^ i17)) & ((((long) 0) << 32) | (j4 - ((j4 >> 63) << 32)));
            long j6 = 0;
            long j7 = j5 | (((long) 2) << 32) | (j6 - ((j6 >> 63) << 32));
            Object objRemoteActionCompatParcelizer21 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer21 == null) {
                objRemoteActionCompatParcelizer21 = startForeground.read((char) (4535 - (ViewConfiguration.getPressedStateDuration() >> 16)), ExpandableListView.getPackedPositionGroup(0L) + 6054, 42 - Gravity.getAbsoluteGravity(0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke5 = ((Method) objRemoteActionCompatParcelizer21).invoke(null, null);
            Object[] objArr49 = {-1525758498, Long.valueOf(j7), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
            Class cls10 = (Class) startForeground.IconCompatParcelizer((char) (MotionEvent.axisFromString("") + 1), 6030 - (ViewConfiguration.getFadingEdgeLength() >> 16), 24 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
            byte[] bArr11 = $$j;
            Object[] objArr50 = new Object[1];
            h((byte) 84, (byte) (-bArr11[35]), (byte) (-bArr11[106]), objArr50);
            cls10.getMethod((String) objArr50[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke5, objArr49);
        }
        Object objRemoteActionCompatParcelizer22 = startForeground.RemoteActionCompatParcelizer(-2008995297);
        if (objRemoteActionCompatParcelizer22 == null) {
            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
            int iResolveSize = View.resolveSize(0, 0) + 943;
            int i19 = 37 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            Object[] objArr51 = new Object[1];
            g((short) 78, $$d[9], (byte) 40, objArr51);
            objRemoteActionCompatParcelizer22 = startForeground.read(cResolveSizeAndState, iResolveSize, i19, -167186806, false, (String) objArr51[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer22).getLong(null) != -1) {
            int i20 = MediaBrowserCompatItemReceiver + 13;
            MediaBrowserCompatMediaItem = i20 % 128;
            if (i20 % 2 == 0) {
                Object objRemoteActionCompatParcelizer23 = startForeground.RemoteActionCompatParcelizer(-757676623);
                if (objRemoteActionCompatParcelizer23 == null) {
                    char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                    int i21 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 944;
                    int windowTouchSlop = 36 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    byte[] bArr12 = $$d;
                    Object[] objArr52 = new Object[1];
                    g((short) (bArr12[2] + 1), (byte) (-bArr12[113]), bArr12[14], objArr52);
                    objRemoteActionCompatParcelizer23 = startForeground.read(cLastIndexOf, i21, windowTouchSlop, -1398865628, false, (String) objArr52[0], null);
                }
                throw null;
            }
            Object objRemoteActionCompatParcelizer24 = startForeground.RemoteActionCompatParcelizer(-757676623);
            if (objRemoteActionCompatParcelizer24 == null) {
                char trimmedLength2 = (char) TextUtils.getTrimmedLength("");
                int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 943;
                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 37;
                byte[] bArr13 = $$d;
                Object[] objArr53 = new Object[1];
                g((short) (bArr13[2] + 1), (byte) (-bArr13[113]), bArr13[14], objArr53);
                objRemoteActionCompatParcelizer24 = startForeground.read(trimmedLength2, windowTouchSlop2, bitsPerPixel, -1398865628, false, (String) objArr53[0], null);
            }
            objArr2 = (Object[]) ((Field) objRemoteActionCompatParcelizer24).get(null);
        } else {
            Object[] objArr54 = new Object[1];
            f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 6, new char[]{50041, 41657, 64389, 21902, 47669, 4183, 50565, 56348, 2610, 40287, 56054, 51490, 6952, 57074, 61936, 3524}, objArr54);
            Class<?> cls11 = Class.forName((String) objArr54[0]);
            Object[] objArr55 = new Object[1];
            f(15 - Process.getGidForName(""), new char[]{15719, 36021, 24404, 4988, 40389, 43577, 6107, 25041, 3590, 29417, 1844, 47639, 15025, 62629, 30319, 14254}, objArr55);
            Object[] objArr56 = {Integer.valueOf(((Integer) cls11.getMethod((String) objArr55[0], Object.class).invoke(null, this)).intValue()), 0, 202692201};
            Object objRemoteActionCompatParcelizer25 = startForeground.RemoteActionCompatParcelizer(-21191141);
            if (objRemoteActionCompatParcelizer25 == null) {
                int iLastIndexOf = 942 - TextUtils.lastIndexOf("", '0');
                int gidForName = 35 - Process.getGidForName("");
                short s4 = $$d[5];
                Object[] objArr57 = new Object[1];
                g(s4, (byte) s4, r1[146], objArr57);
                objRemoteActionCompatParcelizer25 = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), iLastIndexOf, gidForName, -2131402098, false, (String) objArr57[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE});
            }
            objArr2 = (Object[]) ((Method) objRemoteActionCompatParcelizer25).invoke(null, objArr56);
            Object objRemoteActionCompatParcelizer26 = startForeground.RemoteActionCompatParcelizer(-757676623);
            if (objRemoteActionCompatParcelizer26 == null) {
                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                int iBlue2 = 943 - Color.blue(0);
                int iIndexOf3 = 36 - TextUtils.indexOf("", "", 0, 0);
                byte[] bArr14 = $$d;
                Object[] objArr58 = new Object[1];
                g((short) (bArr14[2] + 1), (byte) (-bArr14[113]), bArr14[14], objArr58);
                objRemoteActionCompatParcelizer26 = startForeground.read(cKeyCodeFromString, iBlue2, iIndexOf3, -1398865628, false, (String) objArr58[0], null);
            }
            ((Field) objRemoteActionCompatParcelizer26).set(null, objArr2);
            try {
                Object[] objArr59 = new Object[1];
                f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(0) - 15, new char[]{50565, 56348, 21324, 47107, 42014, 41473, 8208, 41131, 5665, 44803, 16334, 8691, 25669, 32713, 45185, 49348, 64266, 7364, 53848, 22110, 62647, 30822}, objArr59);
                Class<?> cls12 = Class.forName((String) objArr59[0]);
                Object[] objArr60 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 50118, new char[]{44137, 28553, 11199, 59335, 41947, 32740, 15134, 63233, 45857, 20316, 2938, 51067, 33417, 24244, 6871}, objArr60);
                long jLongValue3 = ((Long) cls12.getDeclaredMethod((String) objArr60[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue3);
                Object objRemoteActionCompatParcelizer27 = startForeground.RemoteActionCompatParcelizer(-1539638354);
                if (objRemoteActionCompatParcelizer27 == null) {
                    char c8 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int trimmedLength3 = 943 - TextUtils.getTrimmedLength("");
                    int scrollBarFadeDuration = 36 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    byte[] bArr15 = $$d;
                    short s5 = bArr15[103];
                    Object[] objArr61 = new Object[1];
                    g(s5, (byte) (s5 & 117), (byte) (-bArr15[45]), objArr61);
                    objRemoteActionCompatParcelizer27 = startForeground.read(c8, trimmedLength3, scrollBarFadeDuration, -629981381, false, (String) objArr61[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer27).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue3 >> 12);
                Object objRemoteActionCompatParcelizer28 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                if (objRemoteActionCompatParcelizer28 == null) {
                    char cIndexOf2 = (char) TextUtils.indexOf("", "", 0);
                    int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 943;
                    int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 36;
                    Object[] objArr62 = new Object[1];
                    g((short) 78, $$d[9], (byte) 40, objArr62);
                    objRemoteActionCompatParcelizer28 = startForeground.read(cIndexOf2, doubleTapTimeout2, capsMode2, -167186806, false, (String) objArr62[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer28).set(null, lValueOf6);
            } catch (Exception unused4) {
                throw new RuntimeException();
            }
        }
        int i22 = ((int[]) objArr2[2])[0];
        int i23 = ((int[]) objArr2[0])[0];
        if (i23 != i22) {
            long j8 = -1;
            long j9 = 0;
            long j10 = (((long) (i23 ^ i22)) & ((((long) 0) << 32) | (j8 - ((j8 >> 63) << 32)))) | (((long) 1) << 32) | (j9 - ((j9 >> 63) << 32));
            Object objRemoteActionCompatParcelizer29 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer29 == null) {
                objRemoteActionCompatParcelizer29 = startForeground.read((char) (TextUtils.indexOf("", "") + 4535), 6054 - View.MeasureSpec.getMode(0), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke6 = ((Method) objRemoteActionCompatParcelizer29).invoke(null, null);
            Object[] objArr63 = {-1525758498, Long.valueOf(j10), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
            Class cls13 = (Class) startForeground.IconCompatParcelizer((char) View.resolveSizeAndState(0, 0, 0), View.resolveSize(0, 0) + 6030, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24);
            byte[] bArr16 = $$j;
            Object[] objArr64 = new Object[1];
            h((byte) 84, (byte) (-bArr16[35]), (byte) (-bArr16[106]), objArr64);
            cls13.getMethod((String) objArr64[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke6, objArr63);
        }
    }

    static {
        MediaBrowserCompatCustomActionResultReceiver = 0;
        AudioAttributesImplBaseParcelizer();
        INSTANCE = new Companion(null);
        int i = AudioAttributesImplApi26Parcelizer + 71;
        MediaBrowserCompatCustomActionResultReceiver = i % 128;
        int i2 = i % 2;
    }

    @getMagicModuleMeta
    public static final Intent AudioAttributesCompatParcelizer(Context context) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 119;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        Intent intentAudioAttributesCompatParcelizer = Companion.AudioAttributesCompatParcelizer(context);
        int i4 = MediaBrowserCompatMediaItem + 39;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
        return intentAudioAttributesCompatParcelizer;
    }

    @Override // kotlin.isAtLeastJellyBeanMR2, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 43;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatItemReceiver + 115;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
    }

    static void AudioAttributesImplBaseParcelizer() {
        AudioAttributesCompatParcelizer = 2565064345785155527L;
        IconCompatParcelizer = (char) 58079;
        read = (char) 33057;
        AudioAttributesImplBaseParcelizer = (char) 13713;
        AudioAttributesImplApi21Parcelizer = (char) 49682;
    }
}
