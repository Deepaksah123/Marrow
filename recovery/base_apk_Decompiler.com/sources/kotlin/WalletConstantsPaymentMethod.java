package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/WalletConstantsPaymentMethod;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Lo/parseLabel;", "RemoteActionCompatParcelizer", "Lo/parseLabel;", "AudioAttributesCompatParcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WalletConstantsPaymentMethod extends WalletConstantsBillingAddressFormat {
    private static long AudioAttributesCompatParcelizer;
    private static char[] IconCompatParcelizer;
    private static int MediaBrowserCompatItemReceiver;
    private static long read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private parseLabel AudioAttributesCompatParcelizer;
    private static final byte[] $$l = {45, 96, -22, -65};
    private static final int $$m = 17;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {20, 28, 18, 12, 18, 4, -57, 62, 1, 24, 7, -9, 19, 12, -5, 5, -56, 66, -3, 8, 14, 14, 2, 5, -58, 60, 3, 25, -13, 7, 13, 11, -4, -48, 66, 0, 13, -52, 9, 0, 34, 0, 13, -20, 9, 39, 37, -5, 9, -66, TarConstants.LF_BLK, 21, 28, -29, 43, -3, -5, -17, 25, 18, -2, 58, -11, 11, 12, -40, 57, 6, 4, -3, -1, 25, 5, -9, 20, -42, TarConstants.LF_SYMLINK, 4, 9, -9, 25, -30, 23, 23, -9, 8, 13, 3, 23, -15, 19, 25, 14, 8, 11, -9, -30, 40, 23, -5, 12, 5, -37, TarConstants.LF_SYMLINK, 4, 9, -9, 25, -30, 23, 23, -9, 8, 13, 3, 23, -15, 19, -59, 30, TarConstants.LF_DIR, -3, 6, -19, 24, 8, 12, -2, 15, 12, -41, 47, -5, 21, 13, -3, 10, -5, 12, 5, -29, 32, 26, -48, 36, 8, 11, 3, -46, 1, -3, 17, -9};
    private static final int $$k = 35;
    private static final byte[] $$d = {28, -38, TarConstants.LF_DIR, -29, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 241;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int AudioAttributesImplBaseParcelizer = 1;
    private static int AudioAttributesImplApi21Parcelizer = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(byte r6, short r7, int r8) {
        /*
            int r6 = r6 * 2
            int r6 = 121 - r6
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r0 = r8 + 1
            byte[] r1 = kotlin.WalletConstantsPaymentMethod.$$l
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2b:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.WalletConstantsPaymentMethod.$$n(byte, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = kotlin.WalletConstantsPaymentMethod.$$d
            int r9 = 190 - r9
            int r8 = r8 + 65
            int r7 = 44 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r8 = r7
            r3 = r9
            r4 = r2
            goto L28
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            int r9 = r9 + 1
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L28:
            int r9 = -r9
            int r8 = r8 + r9
            int r8 = r8 + (-1)
            r9 = r3
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.WalletConstantsPaymentMethod.g(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0023). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = 58 - r7
            byte[] r0 = kotlin.WalletConstantsPaymentMethod.$$j
            int r8 = 149 - r8
            int r6 = 119 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r6
            r6 = r7
            r5 = r2
            goto L23
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            r3 = r0[r8]
        L23:
            int r8 = r8 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-6)
            r3 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.WalletConstantsPaymentMethod.h(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.WalletConstantsPaymentMethod$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/WalletConstantsPaymentMethod$write;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/setBalance;", "p1", "Landroid/content/Intent;", "write", "(Landroid/content/Context;Lo/setBalance;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent write(Context p0, setBalance p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intent = new Intent(p0, (Class<?>) WalletConstantsPaymentMethod.class);
            p1.AudioAttributesCompatParcelizer(intent);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(int r23, char[] r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.WalletConstantsPaymentMethod.f(int, char[], java.lang.Object[]):void");
    }

    private static void e(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i5 = $10 + 57;
            $11 = i5 % 128;
            if (i5 % i3 == 0) {
                int i6 = downloadService.write;
                try {
                    Object[] objArr2 = {Integer.valueOf(IconCompatParcelizer[i - i6])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) (-1);
                        objRemoteActionCompatParcelizer = startForeground.read((char) (36621 - Drawable.resolveOpacity(0, 0)), 2340 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 28, 480654850, false, $$n((byte) 10, b, (byte) (b + 1)), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(AudioAttributesCompatParcelizer), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.argb(0, 0, 0, 0), 9701 - View.combineMeasuredStates(0, 0), 26 - (Process.myPid() >> 22), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {downloadService, downloadService};
                            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                            if (objRemoteActionCompatParcelizer3 == null) {
                                objRemoteActionCompatParcelizer3 = startForeground.read((char) View.MeasureSpec.getSize(0), TextUtils.getOffsetAfter("", 0) + 23784, Color.alpha(0) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
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
            } else {
                int i7 = downloadService.write;
                try {
                    Object[] objArr5 = {Integer.valueOf(IconCompatParcelizer[i + i7])};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1659892375);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        byte b2 = (byte) (-1);
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (TextUtils.indexOf("", "", 0) + 36621), View.resolveSize(0, 0) + 2340, 28 - (ViewConfiguration.getJumpTapTimeout() >> 16), 480654850, false, $$n((byte) 10, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(AudioAttributesCompatParcelizer), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(955774634);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        objRemoteActionCompatParcelizer5 = startForeground.read((char) ExpandableListView.getPackedPositionGroup(0L), KeyEvent.normalizeMetaState(0) + 9701, (ViewConfiguration.getLongPressTimeout() >> 16) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {downloadService, downloadService};
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-452087292);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        objRemoteActionCompatParcelizer6 = startForeground.read((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 23784 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 33 - TextUtils.indexOf("", "", 0, 0), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            int i8 = $11 + 51;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            i3 = 2;
        }
        char[] cArr = new char[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i10 = $10 + 75;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr8 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer7 == null) {
                objRemoteActionCompatParcelizer7 = startForeground.read((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23784, 33 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0122  */
    @Override // kotlin.WalletConstantsBillingAddressFormat, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.WalletConstantsPaymentMethod.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // kotlin.WalletConstantsBillingAddressFormat, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.WalletConstantsPaymentMethod.onResume():void");
    }

    @Override // kotlin.WalletConstantsBillingAddressFormat, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 50277, new char[]{9319, 57351, 44220, 26937, 13781, 62020, 48888, 31521, 1823, 50065, 34848, 21741, 4467, 56774, 39520, 42734, 25216, 12080, 60348, 45122, 31998, 14709, 50686, 33178, 19983, 2741}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 53308, new char[]{9317, 62542, 33806, 21699, 25751, 13657, 50460, 38380, 42398, 30291, 1544, 55024, 59065, 46974, 18212, 6140, 10169, 61541}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = MediaBrowserCompatCustomActionResultReceiver + 113;
            AudioAttributesImplBaseParcelizer = i2 % 128;
            int i3 = i2 % 2;
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i4 = AudioAttributesImplBaseParcelizer + 117;
                MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
                int i5 = i4 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            int i6 = AudioAttributesImplBaseParcelizer + 23;
            MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 4535), 6102 - AndroidCharacter.getMirror('0'), 42 - (ViewConfiguration.getJumpTapTimeout() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) KeyEvent.normalizeMetaState(0), 6030 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 24 - (Process.myPid() >> 22), -861814097, false, "read", new Class[]{Context.class});
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
        super.onPause();
    }

    @Override // kotlin.WalletConstantsBillingAddressFormat, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Context applicationContext;
        String strValueOf;
        String strValueOf2;
        Object[] objArr;
        char c;
        char c2;
        Object[] objArr2;
        List<Object[]> list;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 21;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = 0;
        Object[] objArr3 = new Object[1];
        e((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 115), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 81, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e((char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 18, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 30, objArr4);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            if (context != null) {
                int i5 = MediaBrowserCompatCustomActionResultReceiver + 125;
                AudioAttributesImplBaseParcelizer = i5 % 128;
                if (i5 % 2 == 0) {
                    boolean z = context instanceof ContextWrapper;
                    throw null;
                }
                applicationContext = ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext();
            } else {
                applicationContext = context;
            }
            if (applicationContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 6054 - KeyEvent.getDeadChar(0, 0), 42 - View.combineMeasuredStates(0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr5 = new Object[1];
                    f(36767 - Color.red(0), new char[]{9317, 43948, 15112, 35517, 6681, 60025, 31197, 51517, 22730, 10407, 47107, 4074, 40727, 28531, 65232, 20066, 56774, 44524, 15691, 36091, 7257, 60520, 29642, 50038, 21206, 8935, 45588, 418, 37201, 24884, 61590, 16503, 55171, 42827, 14126, 34526, 5688, 58782, 30206, 50440, 21690, 9282, 46121, 15238, 35690, 6860, 60146, 31314}, objArr5);
                    String str = (String) objArr5[0];
                    Object[] objArr6 = new Object[1];
                    e((char) (9677 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 19, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 45, objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    e((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 4), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 86, View.MeasureSpec.makeMeasureSpec(0, 0) + 64, objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    e((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 87), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 116, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 31, objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    e((char) (12005 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), KeyEvent.getDeadChar(0, 0) + 218, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 2, objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 56046, new char[]{9268, 65318, 37446, 46338, 18548, 25441, 1617, 55616, 64675, 38823, 43722, 19845, 24748, 15350, 57052, 61903, 38178, 43024, 17177, 26236, 14640, 56401, 63296, 35500, 44536, 16536, 7133, 16127, 53741, 62606, 36763, 41839, 17943, 6486, 15474, 55139}, objArr10);
                    Object[] objArr11 = {applicationContext, str, str2, str3, str4, true, str5, (String) objArr10[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 6030 - Color.alpha(0), 23 - TextUtils.lastIndexOf("", '0', 0), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
                char defaultSize = (char) (61148 - View.getDefaultSize(0, 0));
                int iAxisFromString = 2144 - MotionEvent.axisFromString("");
                int i6 = 12 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                byte[] bArr = $$d;
                Object[] objArr12 = new Object[1];
                g((byte) (bArr[61] - 1), (byte) (-bArr[9]), (short) 78, objArr12);
                objRemoteActionCompatParcelizer3 = startForeground.read(defaultSize, iAxisFromString, i6, -2136739198, false, (String) objArr12[0], null);
            }
            if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-629126231);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 61148);
                    int iIndexOf = 2145 - TextUtils.indexOf("", "", 0);
                    int keyRepeatDelay = 12 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    byte[] bArr2 = $$d;
                    Object[] objArr13 = new Object[1];
                    g(bArr2[19], bArr2[113], (short) 75, objArr13);
                    objRemoteActionCompatParcelizer4 = startForeground.read(maxKeyCode, iIndexOf, keyRepeatDelay, -1530294468, false, (String) objArr13[0], null);
                }
                list = (List) ((Field) objRemoteActionCompatParcelizer4).get(null);
            } else {
                Object[] objArr14 = new Object[1];
                e((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 57888), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 220, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 19, objArr14);
                Class<?> cls2 = Class.forName((String) objArr14[0]);
                Object[] objArr15 = new Object[1];
                f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 21559, new char[]{9327, 28761, 35861, 55513, 29854, 33096, 56592, 27106, 34198, 53876, 28219, 47847, 54913, 25238, 48984, 51990}, objArr15);
                int iIntValue2 = ((Integer) cls2.getMethod((String) objArr15[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr16 = {-1171773503};
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-173351824);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        objRemoteActionCompatParcelizer5 = startForeground.read((char) (TextUtils.indexOf("", "", 0, 0) + 45845), 914 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 10 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1948051227, false, null, new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr17 = {Integer.valueOf(iIntValue2), ((Constructor) objRemoteActionCompatParcelizer5).newInstance(objArr16)};
                        Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(1891595430);
                        if (objRemoteActionCompatParcelizer6 == null) {
                            char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 61148);
                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2145;
                            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 12;
                            byte[] bArr3 = $$d;
                            Object[] objArr18 = new Object[1];
                            g((byte) 24, bArr3[37], bArr3[15], objArr18);
                            objRemoteActionCompatParcelizer6 = startForeground.read(packedPositionType, iNormalizeMetaState, doubleTapTimeout, 251047987, false, (String) objArr18[0], new Class[]{Integer.TYPE, (Class) startForeground.IconCompatParcelizer((char) TextUtils.indexOf("", ""), (ViewConfiguration.getWindowTouchSlop() >> 8) + 557, MotionEvent.axisFromString("") + 19)});
                        }
                        list = (List) ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr17);
                        Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-629126231);
                        if (objRemoteActionCompatParcelizer7 == null) {
                            char c3 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 61148);
                            int iArgb = 2145 - Color.argb(0, 0, 0, 0);
                            int i7 = 13 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            byte[] bArr4 = $$d;
                            Object[] objArr19 = new Object[1];
                            g(bArr4[19], bArr4[113], (short) 75, objArr19);
                            objRemoteActionCompatParcelizer7 = startForeground.read(c3, iArgb, i7, -1530294468, false, (String) objArr19[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer7).set(null, list);
                        Object[] objArr20 = new Object[1];
                        e((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 34106), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 230, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 21, objArr20);
                        Class<?> cls3 = Class.forName((String) objArr20[0]);
                        Object[] objArr21 = new Object[1];
                        e((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 227, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 14, objArr21);
                        long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr21[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(301834150);
                        if (objRemoteActionCompatParcelizer8 == null) {
                            char maximumFlingVelocity = (char) (61148 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                            int i8 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2144;
                            int deadChar = 12 - KeyEvent.getDeadChar(0, 0);
                            byte b = $$d[45];
                            Object[] objArr22 = new Object[1];
                            g(b, (byte) (b + 1), r13[33], objArr22);
                            objRemoteActionCompatParcelizer8 = startForeground.read(maximumFlingVelocity, i8, deadChar, 1874090803, false, (String) objArr22[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer8).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(-18205161);
                        if (objRemoteActionCompatParcelizer9 == null) {
                            char packedPositionType2 = (char) (61148 - ExpandableListView.getPackedPositionType(0L));
                            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2145;
                            int iBlue = Color.blue(0) + 12;
                            byte[] bArr5 = $$d;
                            Object[] objArr23 = new Object[1];
                            g((byte) (bArr5[61] - 1), (byte) (-bArr5[9]), (short) 78, objArr23);
                            objRemoteActionCompatParcelizer9 = startForeground.read(packedPositionType2, minimumFlingVelocity, iBlue, -2136739198, false, (String) objArr23[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer9).set(null, lValueOf2);
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
            for (Object[] objArr24 : list) {
                int i9 = MediaBrowserCompatCustomActionResultReceiver + 3;
                AudioAttributesImplBaseParcelizer = i9 % 128;
                int i10 = i9 % 2;
                int i11 = ((int[]) objArr24[3])[i4];
                int i12 = ((int[]) objArr24[1])[i4];
                if (i12 != i11) {
                    ArrayList arrayList = new ArrayList();
                    int i13 = 2;
                    String[] strArr = (String[]) objArr24[2];
                    if (strArr != null) {
                        int i14 = MediaBrowserCompatCustomActionResultReceiver + 101;
                        AudioAttributesImplBaseParcelizer = i14 % 128;
                        int i15 = i14 % 2;
                        int i16 = i4;
                        while (i16 < strArr.length) {
                            int i17 = MediaBrowserCompatCustomActionResultReceiver + 5;
                            AudioAttributesImplBaseParcelizer = i17 % 128;
                            int i18 = i17 % i13;
                            arrayList.add(strArr[i16]);
                            i16++;
                            i13 = 2;
                        }
                    }
                    long j = ((long) i4) << 32;
                    long j2 = -1;
                    long j3 = (j | (j2 - ((j2 >> 63) << 32))) & ((long) (i12 ^ i11));
                    long j4 = 0;
                    long j5 = j3 | (((long) 10) << 32) | (j4 - ((j4 >> 63) << 32));
                    try {
                        Object objRemoteActionCompatParcelizer10 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                        if (objRemoteActionCompatParcelizer10 == null) {
                            objRemoteActionCompatParcelizer10 = startForeground.read((char) (4535 - View.getDefaultSize(0, 0)), (Process.myTid() >> 22) + 6054, 41 - ImageFormat.getBitsPerPixel(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                        }
                        Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer10).invoke(null, null);
                        try {
                            Object[] objArr25 = {-1171773503, Long.valueOf(j5), arrayList, TrainingApplication.RemoteActionCompatParcelizer(), false};
                            Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 6030 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 23 - TextUtils.lastIndexOf("", '0', 0, 0));
                            byte[] bArr6 = $$j;
                            Object[] objArr26 = new Object[1];
                            h(bArr6[46], bArr6[119], bArr6[61], objArr26);
                            cls4.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
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
                i4 = 0;
            }
        } catch (Throwable th6) {
            Object[] objArr27 = new Object[1];
            e((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) - 36), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 267, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 7, objArr27);
            String str6 = (String) objArr27[0];
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
            arrayList2.add(str6);
            Object objRemoteActionCompatParcelizer11 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer11 == null) {
                objRemoteActionCompatParcelizer11 = startForeground.read((char) (4535 - Drawable.resolveOpacity(0, 0)), KeyEvent.keyCodeFromString("") + 6054, KeyEvent.getDeadChar(0, 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke3 = ((Method) objRemoteActionCompatParcelizer11).invoke(null, null);
            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
            int i19 = MediaBrowserCompatCustomActionResultReceiver + 101;
            AudioAttributesImplBaseParcelizer = i19 % 128;
            int i20 = i19 % 2;
            try {
                Object[] objArr28 = {-1171773503, 81604378625L, arrayList2, strRemoteActionCompatParcelizer, false};
                Class cls5 = (Class) startForeground.IconCompatParcelizer((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getTapTimeout() >> 16) + 6030, 24 - View.MeasureSpec.getMode(0));
                byte[] bArr7 = $$j;
                Object[] objArr29 = new Object[1];
                h(bArr7[46], bArr7[119], bArr7[61], objArr29);
                cls5.getMethod((String) objArr29[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke3, objArr28);
            } catch (Throwable th7) {
                Throwable cause6 = th7.getCause();
                if (cause6 == null) {
                    throw th7;
                }
                throw cause6;
            }
        }
        Context applicationContext2 = context;
        if (applicationContext2 != null) {
            try {
                applicationContext2 = ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : context.getApplicationContext();
            } catch (Throwable th8) {
                Object[] objArr30 = new Object[1];
                e((char) (59233 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) + 169, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 7, objArr30);
                String str7 = (String) objArr30[0];
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    PrintStream printStream2 = new PrintStream(byteArrayOutputStream2);
                    th8.printStackTrace(printStream2);
                    printStream2.close();
                    strValueOf2 = byteArrayOutputStream2.toString(CharsetNames.UTF_8);
                } catch (Throwable unused2) {
                    strValueOf2 = String.valueOf(th8);
                }
                ArrayList arrayList3 = new ArrayList(2);
                arrayList3.add(strValueOf2);
                arrayList3.add(str7);
                Object objRemoteActionCompatParcelizer12 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer12 == null) {
                    objRemoteActionCompatParcelizer12 = startForeground.read((char) (4534 - TextUtils.lastIndexOf("", '0')), 6054 - (Process.myTid() >> 22), 41 - TextUtils.lastIndexOf("", '0', 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke4 = ((Method) objRemoteActionCompatParcelizer12).invoke(null, null);
                Object[] objArr31 = {-1171773503, 81604378625L, arrayList3, TrainingApplication.RemoteActionCompatParcelizer(), false};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) Color.argb(0, 0, 0, 0), 6030 - View.resolveSizeAndState(0, 0, 0), (Process.myPid() >> 22) + 24);
                byte[] bArr8 = $$j;
                Object[] objArr32 = new Object[1];
                h(bArr8[46], bArr8[119], bArr8[61], objArr32);
                cls6.getMethod((String) objArr32[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke4, objArr31);
            }
        }
        try {
            Object[] objArr33 = {-1171773503};
            Object objRemoteActionCompatParcelizer13 = startForeground.RemoteActionCompatParcelizer(-1128409246);
            if (objRemoteActionCompatParcelizer13 == null) {
                objRemoteActionCompatParcelizer13 = startForeground.read((char) (ViewConfiguration.getEdgeSlop() >> 16), ImageFormat.getBitsPerPixel(0) + 1992, 11 - TextUtils.lastIndexOf("", '0'), -1024191497, false, null, new Class[]{Integer.TYPE});
            }
            try {
                Object[] objArr34 = {applicationContext2, ((Constructor) objRemoteActionCompatParcelizer13).newInstance(objArr33)};
                Object objRemoteActionCompatParcelizer14 = startForeground.RemoteActionCompatParcelizer(352975618);
                if (objRemoteActionCompatParcelizer14 == null) {
                    char c4 = (char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 19322);
                    int iBlue2 = Color.blue(0) + 2759;
                    int iMyTid = 99 - (Process.myTid() >> 22);
                    byte b2 = $$d[45];
                    Object[] objArr35 = new Object[1];
                    g(b2, (byte) (b2 + 1), r5[33], objArr35);
                    objRemoteActionCompatParcelizer14 = startForeground.read(c4, iBlue2, iMyTid, 1799372695, false, (String) objArr35[0], new Class[]{Context.class, (Class) startForeground.IconCompatParcelizer((char) (KeyEvent.keyCodeFromString("") + 9580), 3447 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 144 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))});
                }
                ((Method) objRemoteActionCompatParcelizer14).invoke(null, objArr34);
                Object objRemoteActionCompatParcelizer15 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                if (objRemoteActionCompatParcelizer15 == null) {
                    char minimumFlingVelocity2 = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 13183);
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 1649;
                    int iNormalizeMetaState2 = 26 - KeyEvent.normalizeMetaState(0);
                    byte[] bArr9 = $$d;
                    Object[] objArr36 = new Object[1];
                    g(bArr9[5], bArr9[113], (short) 187, objArr36);
                    objRemoteActionCompatParcelizer15 = startForeground.read(minimumFlingVelocity2, scrollBarSize, iNormalizeMetaState2, -133433128, false, (String) objArr36[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer15).getLong(null) != -1) {
                    Object objRemoteActionCompatParcelizer16 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                    if (objRemoteActionCompatParcelizer16 == null) {
                        char trimmedLength = (char) (13183 - TextUtils.getTrimmedLength(""));
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 1649;
                        int mirror = AndroidCharacter.getMirror('0') - 22;
                        byte[] bArr10 = $$d;
                        byte b3 = bArr10[30];
                        byte b4 = bArr10[5];
                        Object[] objArr37 = new Object[1];
                        g(b3, b4, (short) (b4 | 144), objArr37);
                        objRemoteActionCompatParcelizer16 = startForeground.read(trimmedLength, capsMode, mirror, -1033747278, false, (String) objArr37[0], null);
                    }
                    objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer16).get(null);
                    int i21 = AudioAttributesImplBaseParcelizer + 37;
                    MediaBrowserCompatCustomActionResultReceiver = i21 % 128;
                    int i22 = i21 % 2;
                    c2 = 3;
                    c = 2;
                } else {
                    Object[] objArr38 = new Object[1];
                    e((char) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 57891), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 220, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1) - 33, objArr38);
                    Class<?> cls7 = Class.forName((String) objArr38[0]);
                    Object[] objArr39 = new Object[1];
                    f(21563 - ExpandableListView.getPackedPositionType(0L), new char[]{9327, 28761, 35861, 55513, 29854, 33096, 56592, 27106, 34198, 53876, 28219, 47847, 54913, 25238, 48984, 51990}, objArr39);
                    try {
                        Object[] objArr40 = {Integer.valueOf(((Integer) cls7.getMethod((String) objArr39[0], Object.class).invoke(null, this)).intValue()), 0, -114258081};
                        byte[] bArr11 = $$j;
                        byte b5 = bArr11[19];
                        byte b6 = bArr11[142];
                        Object[] objArr41 = new Object[1];
                        h(b5, b6, (short) (b6 + 5), objArr41);
                        Class<?> cls8 = Class.forName((String) objArr41[0]);
                        byte b7 = bArr11[35];
                        Object[] objArr42 = new Object[1];
                        h(b7, bArr11[120], b7, objArr42);
                        objArr = (Object[]) cls8.getMethod((String) objArr42[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr40);
                        Object objRemoteActionCompatParcelizer17 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                        if (objRemoteActionCompatParcelizer17 == null) {
                            char c5 = (char) (13184 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                            int i23 = (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1648;
                            int i24 = 27 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            byte[] bArr12 = $$d;
                            byte b8 = bArr12[30];
                            byte b9 = bArr12[5];
                            Object[] objArr43 = new Object[1];
                            g(b8, b9, (short) (b9 | 144), objArr43);
                            objRemoteActionCompatParcelizer17 = startForeground.read(c5, i23, i24, -1033747278, false, (String) objArr43[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer17).set(null, objArr);
                        try {
                            Object[] objArr44 = new Object[1];
                            e((char) (34140 - ImageFormat.getBitsPerPixel(0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) + 125, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1) - 27, objArr44);
                            Class<?> cls9 = Class.forName((String) objArr44[0]);
                            Object[] objArr45 = new Object[1];
                            e((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 227, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 11, objArr45);
                            long jLongValue2 = ((Long) cls9.getDeclaredMethod((String) objArr45[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf3 = Long.valueOf(jLongValue2);
                            Object objRemoteActionCompatParcelizer18 = startForeground.RemoteActionCompatParcelizer(2104791916);
                            if (objRemoteActionCompatParcelizer18 == null) {
                                char cLastIndexOf = (char) (13182 - TextUtils.lastIndexOf("", '0', 0));
                                int minimumFlingVelocity3 = 1649 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 26;
                                byte[] bArr13 = $$d;
                                byte b10 = bArr13[30];
                                byte b11 = bArr13[5];
                                Object[] objArr46 = new Object[1];
                                g(b10, b11, (short) (b11 | 111), objArr46);
                                objRemoteActionCompatParcelizer18 = startForeground.read(cLastIndexOf, minimumFlingVelocity3, touchSlop, 54351865, false, (String) objArr46[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer18).set(null, lValueOf3);
                            Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                            Object objRemoteActionCompatParcelizer19 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                            if (objRemoteActionCompatParcelizer19 == null) {
                                char keyRepeatTimeout = (char) (13183 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1649;
                                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27;
                                byte[] bArr14 = $$d;
                                Object[] objArr47 = new Object[1];
                                g(bArr14[5], bArr14[113], (short) 187, objArr47);
                                objRemoteActionCompatParcelizer19 = startForeground.read(keyRepeatTimeout, doubleTapTimeout2, iIndexOf2, -133433128, false, (String) objArr47[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer19).set(null, lValueOf4);
                            int i25 = AudioAttributesImplBaseParcelizer + 35;
                            MediaBrowserCompatCustomActionResultReceiver = i25 % 128;
                            c = 2;
                            int i26 = i25 % 2;
                            c2 = 3;
                        } catch (Exception unused3) {
                            throw new RuntimeException();
                        }
                    } catch (Throwable th9) {
                        Throwable cause7 = th9.getCause();
                        if (cause7 == null) {
                            throw th9;
                        }
                        throw cause7;
                    }
                }
                int i27 = ((int[]) objArr[c2])[0];
                int i28 = ((int[]) objArr[c])[0];
                if (i28 != i27) {
                    long j6 = -1;
                    long j7 = ((long) (i28 ^ i27)) & ((((long) 0) << 32) | (j6 - ((j6 >> 63) << 32)));
                    long j8 = 0;
                    long j9 = (((long) 2) << 32) | (j8 - ((j8 >> 63) << 32)) | j7;
                    Object objRemoteActionCompatParcelizer20 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer20 == null) {
                        objRemoteActionCompatParcelizer20 = startForeground.read((char) (Color.green(0) + 4535), 6054 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke5 = ((Method) objRemoteActionCompatParcelizer20).invoke(null, null);
                    Object[] objArr48 = {-1171773503, Long.valueOf(j9), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls10 = (Class) startForeground.IconCompatParcelizer((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), KeyEvent.keyCodeFromString("") + 6030, Drawable.resolveOpacity(0, 0) + 24);
                    byte[] bArr15 = $$j;
                    Object[] objArr49 = new Object[1];
                    h(bArr15[46], bArr15[119], bArr15[61], objArr49);
                    cls10.getMethod((String) objArr49[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke5, objArr48);
                }
                Object objRemoteActionCompatParcelizer21 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                if (objRemoteActionCompatParcelizer21 == null) {
                    char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                    int i29 = 944 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    int size = View.MeasureSpec.getSize(0) + 36;
                    byte[] bArr16 = $$d;
                    Object[] objArr50 = new Object[1];
                    g((byte) (bArr16[61] - 1), (byte) (-bArr16[9]), (short) 78, objArr50);
                    objRemoteActionCompatParcelizer21 = startForeground.read(cKeyCodeFromString, i29, size, -167186806, false, (String) objArr50[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer21).getLong(null) != -1) {
                    Object objRemoteActionCompatParcelizer22 = startForeground.RemoteActionCompatParcelizer(-757676623);
                    if (objRemoteActionCompatParcelizer22 == null) {
                        char packedPositionType3 = (char) ExpandableListView.getPackedPositionType(0L);
                        int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 943;
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 36;
                        byte[] bArr17 = $$d;
                        Object[] objArr51 = new Object[1];
                        g(bArr17[19], bArr17[113], (short) 75, objArr51);
                        objRemoteActionCompatParcelizer22 = startForeground.read(packedPositionType3, touchSlop2, absoluteGravity, -1398865628, false, (String) objArr51[0], null);
                    }
                    objArr2 = (Object[]) ((Field) objRemoteActionCompatParcelizer22).get(null);
                } else {
                    Object[] objArr52 = new Object[1];
                    e((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 57892), 224 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 15, objArr52);
                    Class<?> cls11 = Class.forName((String) objArr52[0]);
                    Object[] objArr53 = new Object[1];
                    f(21563 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{9327, 28761, 35861, 55513, 29854, 33096, 56592, 27106, 34198, 53876, 28219, 47847, 54913, 25238, 48984, 51990}, objArr53);
                    Object[] objArr54 = {Integer.valueOf(((Integer) cls11.getMethod((String) objArr53[0], Object.class).invoke(null, this)).intValue()), 0, 1927451484};
                    Object objRemoteActionCompatParcelizer23 = startForeground.RemoteActionCompatParcelizer(-21191141);
                    if (objRemoteActionCompatParcelizer23 == null) {
                        char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                        int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 943;
                        int modifierMetaStateMask = 35 - ((byte) KeyEvent.getModifierMetaStateMask());
                        byte[] bArr18 = $$d;
                        byte b12 = bArr18[13];
                        byte b13 = bArr18[5];
                        Object[] objArr55 = new Object[1];
                        g(b12, b13, b13, objArr55);
                        objRemoteActionCompatParcelizer23 = startForeground.read(packedPositionGroup, packedPositionGroup2, modifierMetaStateMask, -2131402098, false, (String) objArr55[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    objArr2 = (Object[]) ((Method) objRemoteActionCompatParcelizer23).invoke(null, objArr54);
                    Object objRemoteActionCompatParcelizer24 = startForeground.RemoteActionCompatParcelizer(-757676623);
                    if (objRemoteActionCompatParcelizer24 == null) {
                        char packedPositionGroup3 = (char) ExpandableListView.getPackedPositionGroup(0L);
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 943;
                        int mode = 36 - View.MeasureSpec.getMode(0);
                        byte[] bArr19 = $$d;
                        Object[] objArr56 = new Object[1];
                        g(bArr19[19], bArr19[113], (short) 75, objArr56);
                        objRemoteActionCompatParcelizer24 = startForeground.read(packedPositionGroup3, iResolveSizeAndState, mode, -1398865628, false, (String) objArr56[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer24).set(null, objArr2);
                    try {
                        Object[] objArr57 = new Object[1];
                        e((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 34106), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 126, 22 - View.resolveSize(0, 0), objArr57);
                        Class<?> cls12 = Class.forName((String) objArr57[0]);
                        Object[] objArr58 = new Object[1];
                        e((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), TextUtils.getOffsetAfter("", 0) + 262, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 11, objArr58);
                        long jLongValue3 = ((Long) cls12.getDeclaredMethod((String) objArr58[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf5 = Long.valueOf(jLongValue3);
                        Object objRemoteActionCompatParcelizer25 = startForeground.RemoteActionCompatParcelizer(-1539638354);
                        if (objRemoteActionCompatParcelizer25 == null) {
                            char c6 = (char) (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                            int fadingEdgeLength = 943 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 36;
                            byte b14 = $$d[45];
                            Object[] objArr59 = new Object[1];
                            g(b14, (byte) (b14 + 1), r7[33], objArr59);
                            objRemoteActionCompatParcelizer25 = startForeground.read(c6, fadingEdgeLength, offsetBefore, -629981381, false, (String) objArr59[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer25).set(null, lValueOf5);
                        Long lValueOf6 = Long.valueOf(jLongValue3 >> 12);
                        Object objRemoteActionCompatParcelizer26 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                        if (objRemoteActionCompatParcelizer26 == null) {
                            char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                            int i30 = (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 942;
                            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 36;
                            byte[] bArr20 = $$d;
                            Object[] objArr60 = new Object[1];
                            g((byte) (bArr20[61] - 1), (byte) (-bArr20[9]), (short) 78, objArr60);
                            objRemoteActionCompatParcelizer26 = startForeground.read(cLastIndexOf2, i30, edgeSlop, -167186806, false, (String) objArr60[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer26).set(null, lValueOf6);
                    } catch (Exception unused4) {
                        throw new RuntimeException();
                    }
                }
                int i31 = ((int[]) objArr2[2])[0];
                int i32 = ((int[]) objArr2[0])[0];
                if (i32 != i31) {
                    long j10 = -1;
                    long j11 = 0;
                    long j12 = (((long) 1) << 32) | (j11 - ((j11 >> 63) << 32)) | (((long) (i32 ^ i31)) & ((((long) 0) << 32) | (j10 - ((j10 >> 63) << 32))));
                    Object objRemoteActionCompatParcelizer27 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer27 == null) {
                        objRemoteActionCompatParcelizer27 = startForeground.read((char) (4535 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), View.MeasureSpec.makeMeasureSpec(0, 0) + 6054, 42 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke6 = ((Method) objRemoteActionCompatParcelizer27).invoke(null, null);
                    Object[] objArr61 = {-1171773503, Long.valueOf(j12), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls13 = (Class) startForeground.IconCompatParcelizer((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 6029 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getScrollBarSize() >> 8) + 24);
                    byte[] bArr21 = $$j;
                    Object[] objArr62 = new Object[1];
                    h(bArr21[46], bArr21[119], bArr21[61], objArr62);
                    cls13.getMethod((String) objArr62[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke6, objArr61);
                }
            } catch (Throwable th10) {
                Throwable cause8 = th10.getCause();
                if (cause8 == null) {
                    throw th10;
                }
                throw cause8;
            }
        } catch (Throwable th11) {
            Throwable cause9 = th11.getCause();
            if (cause9 == null) {
                throw th11;
            }
            throw cause9;
        }
    }

    static {
        MediaBrowserCompatItemReceiver = 0;
        MediaBrowserCompatCustomActionResultReceiver();
        INSTANCE = new Companion(null);
        int i = AudioAttributesImplApi21Parcelizer + 115;
        MediaBrowserCompatItemReceiver = i % 128;
        int i2 = i % 2;
    }

    @Override // kotlin.WalletConstantsBillingAddressFormat, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 45;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
    }

    static void MediaBrowserCompatCustomActionResultReceiver() {
        IconCompatParcelizer = new char[]{56429, 2586, 28824, 24342, 34179, 60477, 55992, 362, 28579, 22087, 48274, 60276, 53726, 14459, 26367, 19809, 48127, 57735, 56417, 2573, 28841, 24333, 34184, 63985, 12250, 21842, 31385, 40982, 51704, 65318, 9407, 18996, 29646, 39189, 52875, 62545, 7656, 17205, 26879, 40480, 50268, 60880, 4880, 14487, 28193, 38821, 48432, 58083, 2120, 12736, 26457, 36056, 45678, 56291, 377, 14065, 23693, 33363, 43930, 53575, 1707, 11298, 21945, 31545, 41166, 54803, 65421, 9477, 19135, 28768, 39341, 53105, 62720, 6788, 16409, 27024, 40736, 50341, 59964, 5049, 14623, 28308, 37898, 48596, 58172, 2274, 15998, 56430, 2629, 28829, 24320, 34269, 60518, 55999, 380, 28584, 22096, 48265, 60181, 53652, 14453, 26360, 19808, 48052, 57749, 51230, 14037, 7518, 19429, 45679, 39158, 51061, 11729, 5208, 17053, 43295, 38818, 65069, 9404, 4920, 30997, 42955, 36353, 62605, 9009, 2543, 28706, 24317, 34054, 62425, 55828, 207, 28454, 21932, 48229, 60089, 53392, 16154, 25989, 19549, 47842, 57711, 53159, 13949, 7382, 19209, 45510, 38938, 50851, 11562, 7100, 56440, 2588, 28820, 24328, 34179, 60530, 56047, 375, 28596, 22089, 48329, 60244, 53705, 14458, 26351, 19821, 48126, 57740, 51219, 14038, 7428, 19360, 45618, 39101, 50993, 11740, 5187, 17113, 43331, 38908, 65070, 9471, 4965, 30985, 42898, 36380, 62595, 9017, 2485, 28729, 24226, 34125, 62350, 55899, 223, 28517, 21935, 48249, 60128, 53377, 16207, 26001, 19486, 47791, 57637, 53163, 13860, 7303, 19286, 45450, 38943, 50925, 11638, 7165, 17022, 43036, 38547, 62160, 9407, 24104, 29109, 43815, 49795, 15938, 59441, 37550, 48417, 26598, 3612, 14489, 58126, 36239, 46142, 24267, 2425, 13307, 55876, 34013, 44877, 22832, 36679, 62917, 55883, 222, 26976, 24549, 33847, 60158, 54042, 14799, 28202, 21640, 48442, 58293, 51260, 16060, 25834, 19789, 46038, 38994, 52962, 56425, 2584, 28829, 24340, 34207, 60465, 55992, 278, 28585, 22101, 48336, 60240, 53701, 14457, 26361, 56376, 2630, 28869, 24400, 34261, 60514, 56043, 374, 28661, 22018, 48268, 15190, 60711, 38824, 47158, 25274, 2821, 15753, 58910, 34968, 45412, 23530};
        AudioAttributesCompatParcelizer = -8320973728676312460L;
        read = 2156135854331443149L;
    }
}
