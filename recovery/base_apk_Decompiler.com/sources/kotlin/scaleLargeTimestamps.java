package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
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
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.scaleLargeTimestamp;
import kotlin.sneakyThrow;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lo/scaleLargeTimestamps;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "Lo/buildSingleSegmentBase;", "IconCompatParcelizer", "Lo/buildSingleSegmentBase;", "RemoteActionCompatParcelizer", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class scaleLargeTimestamps extends toFloat {
    private static long AudioAttributesCompatParcelizer;
    private static int MediaBrowserCompatItemReceiver;
    private static char[] RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private buildSingleSegmentBase RemoteActionCompatParcelizer;
    private static final byte[] $$c = {TarConstants.LF_GNUTYPE_LONGNAME, 36, -23, -15};
    private static final int $$f = 197;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {45, 96, -22, -65, 74, -14, 7, 4, 2, -25, 12, 21, 14, 7, 7, 26, -8, -10, 13, 8, 12, 22, 74, -74, 14, 18, -2, 24, -17, -3, 10, TarConstants.LF_BLK, -35, 11, 6, 24, -10, 45, -8, -8, 24, 7, 2, 12, -8, 30, -4, -10, 1, 7, 4, 24, 45, -25, -8, 20, 3, 10, TarConstants.LF_BLK, -35, 11, 6, 24, -10, 45, -8, -8, 24, 7, 2, 12, -8, 30, -4, 74, -22, -15, 10, 4, 17, 39, -35, 20, 8, 11, 22, -10, 14, 8, -1, 38, -10, 0, 19, 8, -4, 22, -4, 56, -35, 20, 8, 11, 31, -11, -14, 43, -2, -2, 0, 25, -5, 22, 13, 6};
    private static final int $$h = 104;
    private static final byte[] $$a = {11, -82, -98, -28, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 199;
    private static int AudioAttributesImplBaseParcelizer = 0;
    private static int AudioAttributesImplApi26Parcelizer = 1;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(short r7, byte r8, short r9) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 101
            byte[] r0 = kotlin.scaleLargeTimestamps.$$c
            int r9 = r9 * 2
            int r9 = r9 + 1
            int r7 = r7 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r4 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            r3 = r0[r7]
            r6 = r3
            r3 = r8
            r8 = r6
        L29:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.scaleLargeTimestamps.$$i(short, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = 190 - r7
            int r8 = r8 + 65
            int r0 = 44 - r6
            byte[] r1 = kotlin.scaleLargeTimestamps.$$a
            byte[] r0 = new byte[r0]
            int r6 = 43 - r6
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L20:
            int r3 = r3 + 1
            int r7 = r7 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-1)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.scaleLargeTimestamps.c(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = kotlin.scaleLargeTimestamps.$$g
            int r8 = r8 + 4
            int r9 = r9 + 73
            int r7 = 111 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r9 = r7
            r3 = r8
            r5 = r2
            goto L29
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            int r7 = r7 + 1
            if (r5 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L29:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + 9
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.scaleLargeTimestamps.d(int, short, short, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.scaleLargeTimestamps$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/scaleLargeTimestamps$read;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "Landroid/content/Intent;", "RemoteActionCompatParcelizer", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent RemoteActionCompatParcelizer(Context p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            scaleLargeTimestamp scalelargetimestamp = new scaleLargeTimestamp(p1);
            Intent intent = new Intent(p0, (Class<?>) scaleLargeTimestamps.class);
            scalelargetimestamp.AudioAttributesCompatParcelizer(intent);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i3 = $11 + 117;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = notifydownloadchanged.AudioAttributesCompatParcelizer;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) (-1);
                        objRemoteActionCompatParcelizer = startForeground.read((char) (38460 - TextUtils.lastIndexOf("", '0', 0)), 532 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 8, -735610793, false, $$i(b, (byte) (b & 10), (byte) 0), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() & write & 2192498202983240651L;
                    Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b2 = (byte) (-1);
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.lastIndexOf("", '0') + 36622), 2340 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 28, 188119637, false, $$i(b2, (byte) (b2 & 9), (byte) 0), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = notifydownloadchanged.AudioAttributesCompatParcelizer;
                Object[] objArr4 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer3 == null) {
                    byte b3 = (byte) (-1);
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) ((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 38461), TextUtils.indexOf((CharSequence) "", '0') + 533, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 7, -735610793, false, $$i(b3, (byte) (b3 & 10), (byte) 0), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).longValue() ^ (write ^ 2192498202983240651L);
                Object[] objArr5 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b4 = (byte) (-1);
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 36621), View.MeasureSpec.getMode(0) + 2340, MotionEvent.axisFromString("") + 29, 188119637, false, $$i(b4, (byte) (b4 & 9), (byte) 0), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            int i6 = $10 + 53;
            $11 = i6 % 128;
            int i7 = i6 % 2;
        }
        char[] cArr2 = new char[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i8 = $10 + 55;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
                try {
                    Object[] objArr6 = {notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1971306176);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        byte b5 = (byte) (-1);
                        objRemoteActionCompatParcelizer5 = startForeground.read((char) (36621 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 2340 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28, 188119637, false, $$i(b5, (byte) (b5 & 9), (byte) 0), new Class[]{Object.class, Object.class});
                    }
                    Object obj = null;
                    ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
                    obj.hashCode();
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            Object[] objArr7 = {notifydownloadchanged, notifydownloadchanged};
            Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(1971306176);
            if (objRemoteActionCompatParcelizer6 == null) {
                byte b6 = (byte) (-1);
                objRemoteActionCompatParcelizer6 = startForeground.read((char) (KeyEvent.normalizeMetaState(0) + 36621), KeyEvent.keyCodeFromString("") + 2340, 29 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 188119637, false, $$i(b6, (byte) (b6 & 9), (byte) 0), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
        }
        String str = new String(cArr2);
        int i9 = $10 + 15;
        $11 = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i4 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(RemoteActionCompatParcelizer[i2 + i4])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 36621), 2340 - View.MeasureSpec.getMode(0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 28, 480654850, false, $$i(b, b2, b2), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(AudioAttributesCompatParcelizer), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 9701, 26 - KeyEvent.normalizeMetaState(0), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {downloadService, downloadService};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) KeyEvent.normalizeMetaState(0), 23784 - Color.alpha(0), 33 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1690012015, false, "b", new Class[]{Object.class, Object.class});
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
        }
        char[] cArr = new char[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i5 = $11 + 113;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            try {
                Object[] objArr5 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 23784 - (ViewConfiguration.getPressedStateDuration() >> 16), View.MeasureSpec.getSize(0) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                int i7 = $10 + 103;
                $11 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr);
    }

    @Override // kotlin.toFloat, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        buildSingleSegmentBase buildsinglesegmentbase;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        a((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 6636, new char[]{60891, 62521, 56836, 40975, 35425, 27762, 30288, 22767, 8893, 1180, 61142, 61637, 56020, 48348, 34607, 26940, 29465, 21876}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 1, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 42657, new char[]{60891, 19327, 41096, 6601, 30585, 44164, 1500, 25401, 55427, 12745, 28516, 50381, 15871, 39798, 61588, 10710, 34684, 64648, 21960, 45938, 59570, 16853, 49018, 5250, 19923, 43885}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                b(18 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 5, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i2 = AudioAttributesImplApi26Parcelizer + 51;
                AudioAttributesImplBaseParcelizer = i2 % 128;
                int i3 = i2 % 2;
                baseContext = (((baseContext instanceof ContextWrapper) ^ true) || ((ContextWrapper) baseContext).getBaseContext() != null) ? baseContext.getApplicationContext() : null;
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (ImageFormat.getBitsPerPixel(0) + 4536), 6054 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 42 - (ViewConfiguration.getJumpTapTimeout() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 61, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 4), MotionEvent.axisFromString("") + 24, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    a(37987 - View.resolveSizeAndState(0, 0, 0), new char[]{60810, 31162, 50463, 20643, 48129, 2100, 38879, 58169, 20119, 56054, 9728, 36249, 6446, 25740, 61620, 23617, 44011, 14156, 33581, 61146, 31280, 49565, 11532, 47462, 1168, 36896, 65413, 19451, 55127, 8890, 36370, 6775, 25066, 52557, 22782, 41984, 12336, 40903, 60219, 30367, 49914, 11862, 46566, 383, 27866, 63675, 17473, 54259, 16154, 35696, 5849, 25139, 51607, 22012, 41324, 3274, 38954, 59351, 29617, 57096, 10939, 46664, 627, 27088}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    b(63 - TextUtils.lastIndexOf("", '0', 0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 67, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 57, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 89, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    b(5 - TextUtils.lastIndexOf("", '0', 0), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 11878), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 198, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    a(5437 - (ViewConfiguration.getTapTimeout() >> 16), new char[]{60808, 63670, 51106, 53818, 47480, 34745, 37605, 31008, 17535, 21159, 14782, 1053, 4864, 63886, 50392, 54047, 48734, 33920, 37853, 32260, 17692, 21385, 16052, 1516, 4196, 65400, 50665, 53479, 48929, 35382, 37119, 32703, 18987, 20742, 16278, 2779}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) KeyEvent.normalizeMetaState(0), 6029 - TextUtils.lastIndexOf("", '0', 0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 23, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char pressedStateDuration = (char) (13183 - (ViewConfiguration.getPressedStateDuration() >> 16));
            int iArgb = 1649 - Color.argb(0, 0, 0, 0);
            int deadChar = KeyEvent.getDeadChar(0, 0) + 26;
            byte b = $$a[5];
            Object[] objArr13 = new Object[1];
            c(b, (short) (b | 187), r5[140], objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(pressedStateDuration, iArgb, deadChar, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            int i4 = AudioAttributesImplBaseParcelizer + 67;
            AudioAttributesImplApi26Parcelizer = i4 % 128;
            if (i4 % 2 == 0) {
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char c = (char) ((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13183);
                    int deadChar2 = KeyEvent.getDeadChar(0, 0) + 1649;
                    int i5 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26;
                    byte[] bArr = $$a;
                    Object[] objArr14 = new Object[1];
                    c(bArr[30], (short) 144, bArr[5], objArr14);
                    objRemoteActionCompatParcelizer4 = startForeground.read(c, deadChar2, i5, -1033747278, false, (String) objArr14[0], null);
                }
                throw null;
            }
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer5 == null) {
                char deadChar3 = (char) (13183 - KeyEvent.getDeadChar(0, 0));
                int iResolveOpacity = 1649 - Drawable.resolveOpacity(0, 0);
                int iNormalizeMetaState = 26 - KeyEvent.normalizeMetaState(0);
                byte[] bArr2 = $$a;
                Object[] objArr15 = new Object[1];
                c(bArr2[30], (short) 144, bArr2[5], objArr15);
                objRemoteActionCompatParcelizer5 = startForeground.read(deadChar3, iResolveOpacity, iNormalizeMetaState, -1033747278, false, (String) objArr15[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer5).get(null);
        } else {
            Object[] objArr16 = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 99, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 37687), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 173, objArr16);
            Class<?> cls3 = Class.forName((String) objArr16[0]);
            Object[] objArr17 = new Object[1];
            a(55871 - Color.blue(0), new char[]{60883, 14305, 22945, 25449, 34098, 44776, 61620, 6778, 15370, 16876, 27583, 36199, 55053, 63718, 684, 9326}, objArr17);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue();
            int i6 = AudioAttributesImplApi26Parcelizer + 53;
            AudioAttributesImplBaseParcelizer = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object[] objArr18 = {Integer.valueOf(iIntValue2), 0, -564968646};
                byte b2 = (byte) ($$h + 4);
                byte[] bArr3 = $$g;
                Object[] objArr19 = new Object[1];
                d(b2, bArr3[11], bArr3[90], objArr19);
                Class<?> cls4 = Class.forName((String) objArr19[0]);
                byte b3 = (byte) 84;
                Object[] objArr20 = new Object[1];
                d(b3, (byte) (b3 & 56), bArr3[92], objArr20);
                objArr = (Object[]) cls4.getMethod((String) objArr20[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr18);
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer6 == null) {
                    char c2 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 13182);
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1649;
                    int offsetBefore = 26 - TextUtils.getOffsetBefore("", 0);
                    byte[] bArr4 = $$a;
                    Object[] objArr21 = new Object[1];
                    c(bArr4[30], (short) 144, bArr4[5], objArr21);
                    objRemoteActionCompatParcelizer6 = startForeground.read(c2, doubleTapTimeout, offsetBefore, -1033747278, false, (String) objArr21[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer6).set(null, objArr);
                try {
                    Object[] objArr22 = new Object[1];
                    b((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 21, (char) TextUtils.getOffsetBefore("", 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + PsExtractor.PRIVATE_STREAM_1, objArr22);
                    Class<?> cls5 = Class.forName((String) objArr22[0]);
                    Object[] objArr23 = new Object[1];
                    b(TextUtils.indexOf("", "", 0, 0) + 15, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1) + 33116), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 242, objArr23);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr23[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char jumpTapTimeout = (char) (13183 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                        int i8 = (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1649;
                        int mirror = AndroidCharacter.getMirror('0') - 22;
                        byte b4 = $$a[30];
                        Object[] objArr24 = new Object[1];
                        c(b4, (short) (b4 | 101), r3[5], objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(jumpTapTimeout, i8, mirror, 54351865, false, (String) objArr24[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer8 == null) {
                        char size = (char) (View.MeasureSpec.getSize(0) + 13183);
                        int packedPositionType = 1649 - ExpandableListView.getPackedPositionType(0L);
                        int i9 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25;
                        byte b5 = $$a[5];
                        Object[] objArr25 = new Object[1];
                        c(b5, (short) (b5 | 187), r3[140], objArr25);
                        objRemoteActionCompatParcelizer8 = startForeground.read(size, packedPositionType, i9, -133433128, false, (String) objArr25[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer8).set(null, lValueOf2);
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
        int i10 = ((int[]) objArr[3])[0];
        int i11 = ((int[]) objArr[2])[0];
        if (i11 != i10) {
            long j = -1;
            long j2 = ((long) (i11 ^ i10)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer9 == null) {
                objRemoteActionCompatParcelizer9 = startForeground.read((char) (4534 - TextUtils.lastIndexOf("", '0', 0)), View.resolveSize(0, 0) + 6054, 42 - Drawable.resolveOpacity(0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            buildsinglesegmentbase = null;
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer9).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
            int i12 = AudioAttributesImplApi26Parcelizer + 85;
            AudioAttributesImplBaseParcelizer = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr26 = {2029894019, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) View.resolveSizeAndState(0, 0, 0), TextUtils.indexOf((CharSequence) "", '0') + 6031, 24 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                byte[] bArr5 = $$g;
                Object[] objArr27 = new Object[1];
                d((byte) (-bArr5[3]), bArr5[27], (byte) (bArr5[30] - 1), objArr27);
                cls6.getMethod((String) objArr27[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr26);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        } else {
            buildsinglesegmentbase = null;
        }
        CmcdConfigurationRequestConfig.write(this, null, 0, 0, false, 15);
        super.onCreate(p0);
        buildSingleSegmentBase buildsinglesegmentbaseAudioAttributesCompatParcelizer = buildSingleSegmentBase.AudioAttributesCompatParcelizer(getLayoutInflater());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(buildsinglesegmentbaseAudioAttributesCompatParcelizer, "");
        this.RemoteActionCompatParcelizer = buildsinglesegmentbaseAudioAttributesCompatParcelizer;
        if (buildsinglesegmentbaseAudioAttributesCompatParcelizer == null) {
            int i14 = AudioAttributesImplApi26Parcelizer + 19;
            AudioAttributesImplBaseParcelizer = i14 % 128;
            int i15 = i14 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            buildsinglesegmentbase = buildsinglesegmentbaseAudioAttributesCompatParcelizer;
        }
        setContentView(buildsinglesegmentbase.IconCompatParcelizer());
        if (p0 == null) {
            scaleLargeTimestamp.Companion companion = scaleLargeTimestamp.INSTANCE;
            Intent intent = getIntent();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(intent, "");
            scaleLargeTimestamp scalelargetimestampAudioAttributesCompatParcelizer = scaleLargeTimestamp.Companion.AudioAttributesCompatParcelizer(intent);
            sneakyThrow.Companion companion2 = sneakyThrow.INSTANCE;
            CmcdConfigurationRequestConfig.write(this, R.id.container, sneakyThrow.Companion.IconCompatParcelizer(scalelargetimestampAudioAttributesCompatParcelizer));
            int i16 = AudioAttributesImplBaseParcelizer + 29;
            AudioAttributesImplApi26Parcelizer = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 4 / 4;
            }
        }
    }

    @Override // kotlin.toFloat, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 69;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getBaseContext();
            obj.hashCode();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i3 = AudioAttributesImplApi26Parcelizer + 5;
            AudioAttributesImplBaseParcelizer = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            a(TextUtils.indexOf((CharSequence) "", '0') + 42668, new char[]{60891, 19327, 41096, 6601, 30585, 44164, 1500, 25401, 55427, 12745, 28516, 50381, 15871, 39798, 61588, 10710, 34684, 64648, 21960, 45938, 59570, 16853, 49018, 5250, 19923, 43885}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 17, (char) View.MeasureSpec.makeMeasureSpec(0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) - 31, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i5 = AudioAttributesImplApi26Parcelizer + 23;
            AudioAttributesImplBaseParcelizer = i5 % 128;
            try {
                if (i5 % 2 != 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - Color.alpha(0)), 6054 - View.resolveSize(0, 0), 42 - View.MeasureSpec.getMode(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.indexOf("", "", 0, 0), 6030 - View.resolveSizeAndState(0, 0, 0), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    int i6 = 84 / 0;
                } else {
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (4534 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), Process.getGidForName("") + 6055, 42 - View.resolveSizeAndState(0, 0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(823471051);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) KeyEvent.keyCodeFromString(""), 6031 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 24 - ((Process.getThreadPriority(0) + 20) >> 6), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(objInvoke2, objArr4);
                }
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d6  */
    @Override // kotlin.toFloat, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.scaleLargeTimestamps.onPause():void");
    }

    @Override // kotlin.toFloat, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        String strValueOf;
        String strValueOf2;
        Object[] objArr;
        Object[] objArr2;
        List list;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object[] objArr3 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 6633, new char[]{60891, 62521, 56836, 40975, 35425, 27762, 30288, 22767, 8893, 1180, 61142, 61637, 56020, 48348, 34607, 26940, 29465, 21876}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 104, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), View.resolveSizeAndState(0, 0, 0), objArr4);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context applicationContext = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
            if (applicationContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (Color.blue(0) + 4535), 6054 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 42 - Color.red(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr5 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 44, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 109), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 22, objArr5);
                    String str = (String) objArr5[0];
                    Object[] objArr6 = new Object[1];
                    a(37986 - TextUtils.lastIndexOf("", '0', 0, 0), new char[]{60810, 31162, 50463, 20643, 48129, 2100, 38879, 58169, 20119, 56054, 9728, 36249, 6446, 25740, 61620, 23617, 44011, 14156, 33581, 61146, 31280, 49565, 11532, 47462, 1168, 36896, 65413, 19451, 55127, 8890, 36370, 6775, 25066, 52557, 22782, 41984, 12336, 40903, 60219, 30367, 49914, 11862, 46566, 383, 27866, 63675, 17473, 54259, 16154, 35696, 5849, 25139, 51607, 22012, 41324, 3274, 38954, 59351, 29617, 57096, 10939, 46664, 627, 27088}, objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    b((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 63, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 36, objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 31, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 36), 135 - KeyEvent.getDeadChar(0, 0), objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    b(ExpandableListView.getPackedPositionGroup(0L) + 6, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 11847), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 201, objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 5402, new char[]{60808, 63670, 51106, 53818, 47480, 34745, 37605, 31008, 17535, 21159, 14782, 1053, 4864, 63886, 50392, 54047, 48734, 33920, 37853, 32260, 17692, 21385, 16052, 1516, 4196, 65400, 50665, 53479, 48929, 35382, 37119, 32703, 18987, 20742, 16278, 2779}, objArr10);
                    Object[] objArr11 = {applicationContext, str, str2, str3, str4, true, str5, (String) objArr10[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6030, 24 - Drawable.resolveOpacity(0, 0), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
        Context applicationContext2 = context;
        if (applicationContext2 != null) {
            try {
                try {
                    applicationContext2 = ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : context.getApplicationContext();
                } catch (Throwable th2) {
                    Object[] objArr12 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 49473, new char[]{60802, 11470, 28422, 44613, 59546, 11216, 27155, 42337, 59300, 9957, 24892}, objArr12);
                    String str6 = (String) objArr12[0];
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        PrintStream printStream = new PrintStream(byteArrayOutputStream);
                        th2.printStackTrace(printStream);
                        printStream.close();
                        strValueOf = byteArrayOutputStream.toString(CharsetNames.UTF_8);
                    } catch (Throwable unused) {
                        strValueOf = String.valueOf(th2);
                    }
                    ArrayList arrayList = new ArrayList(2);
                    arrayList.add(strValueOf);
                    arrayList.add(str6);
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 4535), 6055 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), Color.red(0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                    Object[] objArr13 = {1395740170, 81604378625L, arrayList, TrainingApplication.RemoteActionCompatParcelizer(), false};
                    Class cls2 = (Class) startForeground.IconCompatParcelizer((char) TextUtils.indexOf("", "", 0, 0), (Process.myPid() >> 22) + 6030, 24 - ((Process.getThreadPriority(0) + 20) >> 6));
                    byte[] bArr = $$g;
                    Object[] objArr14 = new Object[1];
                    d((byte) (-bArr[3]), bArr[27], (byte) (bArr[30] - 1), objArr14);
                    cls2.getMethod((String) objArr14[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr13);
                }
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 == null) {
                    throw th3;
                }
                throw cause2;
            }
        }
        try {
            Object[] objArr15 = {1395740170};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1128409246);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1991, (Process.myPid() >> 22) + 12, -1024191497, false, null, new Class[]{Integer.TYPE});
            }
            try {
                Object[] objArr16 = {applicationContext2, ((Constructor) objRemoteActionCompatParcelizer4).newInstance(objArr15)};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(352975618);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char c = (char) (19324 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    int iAlpha = Color.alpha(0) + 2759;
                    int iIndexOf = TextUtils.indexOf("", "", 0) + 99;
                    byte b = $$a[45];
                    Object[] objArr17 = new Object[1];
                    c(b, (short) 78, (byte) (b + 1), objArr17);
                    objRemoteActionCompatParcelizer5 = startForeground.read(c, iAlpha, iIndexOf, 1799372695, false, (String) objArr17[0], new Class[]{Context.class, (Class) startForeground.IconCompatParcelizer((char) (9580 - ((Process.getThreadPriority(0) + 20) >> 6)), TextUtils.indexOf("", "") + 3446, View.MeasureSpec.makeMeasureSpec(0, 0) + 144)});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr16);
                try {
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-18205161);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char cBlue = (char) (61148 - Color.blue(0));
                        int mirror = 2193 - AndroidCharacter.getMirror('0');
                        int iArgb = 12 - Color.argb(0, 0, 0, 0);
                        byte[] bArr2 = $$a;
                        Object[] objArr18 = new Object[1];
                        c((byte) (bArr2[61] - 1), (short) (-bArr2[22]), (byte) (-bArr2[9]), objArr18);
                        objRemoteActionCompatParcelizer6 = startForeground.read(cBlue, mirror, iArgb, -2136739198, false, (String) objArr18[0], null);
                    }
                    if (((Field) objRemoteActionCompatParcelizer6).getLong(null) != -1) {
                        int i2 = AudioAttributesImplApi26Parcelizer + 85;
                        AudioAttributesImplBaseParcelizer = i2 % 128;
                        int i3 = i2 % 2;
                        Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-629126231);
                        if (objRemoteActionCompatParcelizer7 == null) {
                            char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 61148);
                            int keyRepeatTimeout = 2145 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int packedPositionChild = 11 - ExpandableListView.getPackedPositionChild(0L);
                            byte[] bArr3 = $$a;
                            Object[] objArr19 = new Object[1];
                            c(bArr3[19], bArr3[21], bArr3[140], objArr19);
                            objRemoteActionCompatParcelizer7 = startForeground.read(jumpTapTimeout, keyRepeatTimeout, packedPositionChild, -1530294468, false, (String) objArr19[0], null);
                        }
                        list = (List) ((Field) objRemoteActionCompatParcelizer7).get(null);
                    } else {
                        Object[] objArr20 = new Object[1];
                        b(15 - ExpandableListView.getPackedPositionChild(0L), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 37687), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 159, objArr20);
                        Class<?> cls3 = Class.forName((String) objArr20[0]);
                        Object[] objArr21 = new Object[1];
                        a((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 55870, new char[]{60883, 14305, 22945, 25449, 34098, 44776, 61620, 6778, 15370, 16876, 27583, 36199, 55053, 63718, 684, 9326}, objArr21);
                        int iIntValue2 = ((Integer) cls3.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
                        try {
                            Object[] objArr22 = {1395740170};
                            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-173351824);
                            if (objRemoteActionCompatParcelizer8 == null) {
                                objRemoteActionCompatParcelizer8 = startForeground.read((char) (45845 - (ViewConfiguration.getTouchSlop() >> 8)), 912 - Process.getGidForName(""), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9, -1948051227, false, null, new Class[]{Integer.TYPE});
                            }
                            try {
                                Object[] objArr23 = {Integer.valueOf(iIntValue2), ((Constructor) objRemoteActionCompatParcelizer8).newInstance(objArr22)};
                                Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(1891595430);
                                if (objRemoteActionCompatParcelizer9 == null) {
                                    char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 61147);
                                    int tapTimeout = 2145 - (ViewConfiguration.getTapTimeout() >> 16);
                                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 12;
                                    byte b2 = (byte) 24;
                                    Object[] objArr24 = new Object[1];
                                    c(b2, (short) (b2 - 5), $$a[37], objArr24);
                                    objRemoteActionCompatParcelizer9 = startForeground.read(c2, tapTimeout, iCombineMeasuredStates, 251047987, false, (String) objArr24[0], new Class[]{Integer.TYPE, (Class) startForeground.IconCompatParcelizer((char) TextUtils.indexOf("", "", 0), 557 - TextUtils.getOffsetBefore("", 0), 18 - (ViewConfiguration.getWindowTouchSlop() >> 8))});
                                }
                                list = (List) ((Method) objRemoteActionCompatParcelizer9).invoke(null, objArr23);
                                Object objRemoteActionCompatParcelizer10 = startForeground.RemoteActionCompatParcelizer(-629126231);
                                if (objRemoteActionCompatParcelizer10 == null) {
                                    char c3 = (char) (61148 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                                    int iIndexOf2 = 2145 - TextUtils.indexOf("", "", 0);
                                    int iNormalizeMetaState = 12 - KeyEvent.normalizeMetaState(0);
                                    byte[] bArr4 = $$a;
                                    Object[] objArr25 = new Object[1];
                                    c(bArr4[19], bArr4[21], bArr4[140], objArr25);
                                    objRemoteActionCompatParcelizer10 = startForeground.read(c3, iIndexOf2, iNormalizeMetaState, -1530294468, false, (String) objArr25[0], null);
                                }
                                ((Field) objRemoteActionCompatParcelizer10).set(null, list);
                                Object[] objArr26 = new Object[1];
                                b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 92, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 114), (KeyEvent.getMaxKeyCode() >> 16) + 224, objArr26);
                                Class<?> cls4 = Class.forName((String) objArr26[0]);
                                Object[] objArr27 = new Object[1];
                                b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 11, (char) (TextUtils.getOffsetBefore("", 0) + 33165), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 211, objArr27);
                                long jLongValue = ((Long) cls4.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue);
                                Object objRemoteActionCompatParcelizer11 = startForeground.RemoteActionCompatParcelizer(301834150);
                                if (objRemoteActionCompatParcelizer11 == null) {
                                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 61149);
                                    int iMyPid = 2145 - (Process.myPid() >> 22);
                                    int scrollBarSize = 12 - (ViewConfiguration.getScrollBarSize() >> 8);
                                    byte b3 = $$a[45];
                                    Object[] objArr28 = new Object[1];
                                    c(b3, (short) 78, (byte) (b3 + 1), objArr28);
                                    objRemoteActionCompatParcelizer11 = startForeground.read(cIndexOf, iMyPid, scrollBarSize, 1874090803, false, (String) objArr28[0], null);
                                }
                                ((Field) objRemoteActionCompatParcelizer11).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                                Object objRemoteActionCompatParcelizer12 = startForeground.RemoteActionCompatParcelizer(-18205161);
                                if (objRemoteActionCompatParcelizer12 == null) {
                                    char cIndexOf2 = (char) (61147 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                    int i4 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2144;
                                    int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 12;
                                    byte[] bArr5 = $$a;
                                    Object[] objArr29 = new Object[1];
                                    c((byte) (bArr5[61] - 1), (short) (-bArr5[22]), (byte) (-bArr5[9]), objArr29);
                                    objRemoteActionCompatParcelizer12 = startForeground.read(cIndexOf2, i4, jumpTapTimeout2, -2136739198, false, (String) objArr29[0], null);
                                }
                                ((Field) objRemoteActionCompatParcelizer12).set(null, lValueOf2);
                            } catch (Throwable th4) {
                                Throwable cause3 = th4.getCause();
                                if (cause3 == null) {
                                    throw th4;
                                }
                                throw cause3;
                            }
                        } catch (Throwable th5) {
                            Throwable cause4 = th5.getCause();
                            if (cause4 == null) {
                                throw th5;
                            }
                            throw cause4;
                        }
                    }
                    Iterator it = list.iterator();
                    while (!(!it.hasNext())) {
                        int i5 = AudioAttributesImplBaseParcelizer + 83;
                        AudioAttributesImplApi26Parcelizer = i5 % 128;
                        int i6 = i5 % 2;
                        Object[] objArr30 = (Object[]) it.next();
                        int i7 = ((int[]) objArr30[3])[0];
                        int i8 = ((int[]) objArr30[1])[0];
                        if (i8 != i7) {
                            ArrayList arrayList2 = new ArrayList();
                            String[] strArr = (String[]) objArr30[2];
                            if (strArr != null) {
                                int i9 = AudioAttributesImplBaseParcelizer + 73;
                                AudioAttributesImplApi26Parcelizer = i9 % 128;
                                int i10 = i9 % 2;
                                for (String str7 : strArr) {
                                    arrayList2.add(str7);
                                }
                            }
                            long j = -1;
                            long j2 = ((long) (i8 ^ i7)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
                            long j3 = 0;
                            long j4 = j2 | (((long) 10) << 32) | (j3 - ((j3 >> 63) << 32));
                            try {
                                Object objRemoteActionCompatParcelizer13 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                                if (objRemoteActionCompatParcelizer13 == null) {
                                    objRemoteActionCompatParcelizer13 = startForeground.read((char) ((-16772681) - Color.rgb(0, 0, 0)), 6054 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 42 - Color.alpha(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                                }
                                Object objInvoke3 = ((Method) objRemoteActionCompatParcelizer13).invoke(null, null);
                                try {
                                    Object[] objArr31 = {1395740170, Long.valueOf(j4), arrayList2, TrainingApplication.RemoteActionCompatParcelizer(), false};
                                    Class cls5 = (Class) startForeground.IconCompatParcelizer((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 6078 - AndroidCharacter.getMirror('0'), 24 - (KeyEvent.getMaxKeyCode() >> 16));
                                    byte[] bArr6 = $$g;
                                    Object[] objArr32 = new Object[1];
                                    d((byte) (-bArr6[3]), bArr6[27], (byte) (bArr6[30] - 1), objArr32);
                                    cls5.getMethod((String) objArr32[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke3, objArr31);
                                } catch (Throwable th6) {
                                    Throwable cause5 = th6.getCause();
                                    if (cause5 == null) {
                                        throw th6;
                                    }
                                    throw cause5;
                                }
                            } catch (Throwable th7) {
                                Throwable cause6 = th7.getCause();
                                if (cause6 == null) {
                                    throw th7;
                                }
                                throw cause6;
                            }
                        }
                    }
                } catch (Throwable th8) {
                    Object[] objArr33 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 24, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 257, objArr33);
                    String str8 = (String) objArr33[0];
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
                    arrayList3.add(str8);
                    Object objRemoteActionCompatParcelizer14 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer14 == null) {
                        objRemoteActionCompatParcelizer14 = startForeground.read((char) (TextUtils.getCapsMode("", 0, 0) + 4535), 6053 - Process.getGidForName(""), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke4 = ((Method) objRemoteActionCompatParcelizer14).invoke(null, null);
                    Object[] objArr34 = {1395740170, 81604378625L, arrayList3, TrainingApplication.RemoteActionCompatParcelizer(), false};
                    Class cls6 = (Class) startForeground.IconCompatParcelizer((char) View.combineMeasuredStates(0, 0), 6030 - TextUtils.getTrimmedLength(""), 24 - ExpandableListView.getPackedPositionGroup(0L));
                    byte[] bArr7 = $$g;
                    Object[] objArr35 = new Object[1];
                    d((byte) (-bArr7[3]), bArr7[27], (byte) (bArr7[30] - 1), objArr35);
                    cls6.getMethod((String) objArr35[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke4, objArr34);
                }
                Object objRemoteActionCompatParcelizer15 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                if (objRemoteActionCompatParcelizer15 == null) {
                    char c4 = (char) ((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13183);
                    int scrollDefaultDelay = 1649 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 26;
                    byte b4 = $$a[5];
                    Object[] objArr36 = new Object[1];
                    c(b4, (short) (b4 | 187), r4[140], objArr36);
                    objRemoteActionCompatParcelizer15 = startForeground.read(c4, scrollDefaultDelay, packedPositionType, -133433128, false, (String) objArr36[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer15).getLong(null) != -1) {
                    Object objRemoteActionCompatParcelizer16 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                    if (objRemoteActionCompatParcelizer16 == null) {
                        char packedPositionGroup = (char) (13183 - ExpandableListView.getPackedPositionGroup(0L));
                        int iCombineMeasuredStates2 = 1649 - View.combineMeasuredStates(0, 0);
                        int threadPriority = 26 - ((Process.getThreadPriority(0) + 20) >> 6);
                        byte[] bArr8 = $$a;
                        Object[] objArr37 = new Object[1];
                        c(bArr8[30], (short) 144, bArr8[5], objArr37);
                        objRemoteActionCompatParcelizer16 = startForeground.read(packedPositionGroup, iCombineMeasuredStates2, threadPriority, -1033747278, false, (String) objArr37[0], null);
                    }
                    objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer16).get(null);
                } else {
                    Object[] objArr38 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 12, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 37687), View.MeasureSpec.getMode(0) + 208, objArr38);
                    Class<?> cls7 = Class.forName((String) objArr38[0]);
                    Object[] objArr39 = new Object[1];
                    a(55872 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new char[]{60883, 14305, 22945, 25449, 34098, 44776, 61620, 6778, 15370, 16876, 27583, 36199, 55053, 63718, 684, 9326}, objArr39);
                    try {
                        Object[] objArr40 = {Integer.valueOf(((Integer) cls7.getMethod((String) objArr39[0], Object.class).invoke(null, this)).intValue()), 0, -808665640};
                        byte[] bArr9 = $$g;
                        byte b5 = bArr9[90];
                        Object[] objArr41 = new Object[1];
                        d(b5, (byte) (-bArr9[32]), b5, objArr41);
                        Class<?> cls8 = Class.forName((String) objArr41[0]);
                        byte b6 = bArr9[92];
                        byte b7 = b6;
                        Object[] objArr42 = new Object[1];
                        d(b6, b7, (byte) (b7 | 41), objArr42);
                        objArr = (Object[]) cls8.getMethod((String) objArr42[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr40);
                        Object objRemoteActionCompatParcelizer17 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                        if (objRemoteActionCompatParcelizer17 == null) {
                            char c5 = (char) ((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13183);
                            int i11 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1648;
                            int i12 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26;
                            byte[] bArr10 = $$a;
                            Object[] objArr43 = new Object[1];
                            c(bArr10[30], (short) 144, bArr10[5], objArr43);
                            objRemoteActionCompatParcelizer17 = startForeground.read(c5, i11, i12, -1033747278, false, (String) objArr43[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer17).set(null, objArr);
                        try {
                            Object[] objArr44 = new Object[1];
                            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 13, (char) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 214, objArr44);
                            Class<?> cls9 = Class.forName((String) objArr44[0]);
                            Object[] objArr45 = new Object[1];
                            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 11, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 33155), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(3) + TarConstants.PREFIXLEN_XSTAR, objArr45);
                            long jLongValue2 = ((Long) cls9.getDeclaredMethod((String) objArr45[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf3 = Long.valueOf(jLongValue2);
                            Object objRemoteActionCompatParcelizer18 = startForeground.RemoteActionCompatParcelizer(2104791916);
                            if (objRemoteActionCompatParcelizer18 == null) {
                                char c6 = (char) (13184 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                int capsMode = TextUtils.getCapsMode("", 0, 0) + 1649;
                                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26;
                                byte b8 = $$a[30];
                                Object[] objArr46 = new Object[1];
                                c(b8, (short) (b8 | 101), r10[5], objArr46);
                                objRemoteActionCompatParcelizer18 = startForeground.read(c6, capsMode, scrollBarFadeDuration, 54351865, false, (String) objArr46[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer18).set(null, lValueOf3);
                            Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                            Object objRemoteActionCompatParcelizer19 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                            if (objRemoteActionCompatParcelizer19 == null) {
                                char cRed = (char) (13183 - Color.red(0));
                                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1649;
                                int absoluteGravity = 26 - Gravity.getAbsoluteGravity(0, 0);
                                byte b9 = $$a[5];
                                Object[] objArr47 = new Object[1];
                                c(b9, (short) (b9 | 187), r8[140], objArr47);
                                objRemoteActionCompatParcelizer19 = startForeground.read(cRed, offsetBefore, absoluteGravity, -133433128, false, (String) objArr47[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer19).set(null, lValueOf4);
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
                int i13 = ((int[]) objArr[3])[0];
                int i14 = ((int[]) objArr[2])[0];
                if (i14 != i13) {
                    long j5 = -1;
                    long j6 = ((long) (i14 ^ i13)) & ((((long) 0) << 32) | (j5 - ((j5 >> 63) << 32)));
                    long j7 = 0;
                    long j8 = j6 | (((long) 2) << 32) | (j7 - ((j7 >> 63) << 32));
                    Object objRemoteActionCompatParcelizer20 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer20 == null) {
                        objRemoteActionCompatParcelizer20 = startForeground.read((char) (TextUtils.lastIndexOf("", '0') + 4536), 6054 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), KeyEvent.getDeadChar(0, 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke5 = ((Method) objRemoteActionCompatParcelizer20).invoke(null, null);
                    Object[] objArr48 = {1395740170, Long.valueOf(j8), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls10 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 6030 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 24);
                    byte[] bArr11 = $$g;
                    Object[] objArr49 = new Object[1];
                    d((byte) (-bArr11[3]), bArr11[27], (byte) (bArr11[30] - 1), objArr49);
                    cls10.getMethod((String) objArr49[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke5, objArr48);
                }
                Object objRemoteActionCompatParcelizer21 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                if (objRemoteActionCompatParcelizer21 == null) {
                    int touchSlop = 943 - (ViewConfiguration.getTouchSlop() >> 8);
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 36;
                    byte[] bArr12 = $$a;
                    Object[] objArr50 = new Object[1];
                    c((byte) (bArr12[61] - 1), (short) (-bArr12[22]), (byte) (-bArr12[9]), objArr50);
                    objRemoteActionCompatParcelizer21 = startForeground.read((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), touchSlop, keyRepeatDelay, -167186806, false, (String) objArr50[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer21).getLong(null) != -1) {
                    Object objRemoteActionCompatParcelizer22 = startForeground.RemoteActionCompatParcelizer(-757676623);
                    if (objRemoteActionCompatParcelizer22 == null) {
                        char cMyPid = (char) (Process.myPid() >> 22);
                        int iAlpha2 = 943 - Color.alpha(0);
                        int windowTouchSlop = 36 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        byte[] bArr13 = $$a;
                        Object[] objArr51 = new Object[1];
                        c(bArr13[19], bArr13[21], bArr13[140], objArr51);
                        objRemoteActionCompatParcelizer22 = startForeground.read(cMyPid, iAlpha2, windowTouchSlop, -1398865628, false, (String) objArr51[0], null);
                    }
                    objArr2 = (Object[]) ((Field) objRemoteActionCompatParcelizer22).get(null);
                    int i15 = AudioAttributesImplApi26Parcelizer + 73;
                    AudioAttributesImplBaseParcelizer = i15 % 128;
                    if (i15 % 2 != 0) {
                        int i16 = 4 % 2;
                    }
                } else {
                    Object[] objArr52 = new Object[1];
                    b(View.resolveSizeAndState(0, 0, 0) + 16, (char) (37722 - ((Process.getThreadPriority(0) + 20) >> 6)), 208 - TextUtils.getCapsMode("", 0, 0), objArr52);
                    Class<?> cls11 = Class.forName((String) objArr52[0]);
                    Object[] objArr53 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 55836, new char[]{60883, 14305, 22945, 25449, 34098, 44776, 61620, 6778, 15370, 16876, 27583, 36199, 55053, 63718, 684, 9326}, objArr53);
                    Object[] objArr54 = {Integer.valueOf(((Integer) cls11.getMethod((String) objArr53[0], Object.class).invoke(null, this)).intValue()), 0, -1230800519};
                    Object objRemoteActionCompatParcelizer23 = startForeground.RemoteActionCompatParcelizer(-21191141);
                    if (objRemoteActionCompatParcelizer23 == null) {
                        char cRed2 = (char) Color.red(0);
                        int bitsPerPixel = 942 - ImageFormat.getBitsPerPixel(0);
                        int i17 = 36 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        byte[] bArr14 = $$a;
                        byte b10 = bArr14[13];
                        short s = bArr14[5];
                        Object[] objArr55 = new Object[1];
                        c(b10, s, (byte) s, objArr55);
                        objRemoteActionCompatParcelizer23 = startForeground.read(cRed2, bitsPerPixel, i17, -2131402098, false, (String) objArr55[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    objArr2 = (Object[]) ((Method) objRemoteActionCompatParcelizer23).invoke(null, objArr54);
                    Object objRemoteActionCompatParcelizer24 = startForeground.RemoteActionCompatParcelizer(-757676623);
                    if (objRemoteActionCompatParcelizer24 == null) {
                        char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int iAxisFromString = MotionEvent.axisFromString("") + 944;
                        int iLastIndexOf = 35 - TextUtils.lastIndexOf("", '0');
                        byte[] bArr15 = $$a;
                        Object[] objArr56 = new Object[1];
                        c(bArr15[19], bArr15[21], bArr15[140], objArr56);
                        objRemoteActionCompatParcelizer24 = startForeground.read(scrollDefaultDelay2, iAxisFromString, iLastIndexOf, -1398865628, false, (String) objArr56[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer24).set(null, objArr2);
                    try {
                        Object[] objArr57 = new Object[1];
                        b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) - 14, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(0) + 187, objArr57);
                        Class<?> cls12 = Class.forName((String) objArr57[0]);
                        Object[] objArr58 = new Object[1];
                        b((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 33164), (ViewConfiguration.getTouchSlop() >> 8) + 246, objArr58);
                        long jLongValue3 = ((Long) cls12.getDeclaredMethod((String) objArr58[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf5 = Long.valueOf(jLongValue3);
                        Object objRemoteActionCompatParcelizer25 = startForeground.RemoteActionCompatParcelizer(-1539638354);
                        if (objRemoteActionCompatParcelizer25 == null) {
                            char windowTouchSlop2 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                            int packedPositionChild2 = 942 - ExpandableListView.getPackedPositionChild(0L);
                            int packedPositionType2 = 36 - ExpandableListView.getPackedPositionType(0L);
                            byte b11 = $$a[45];
                            Object[] objArr59 = new Object[1];
                            c(b11, (short) 78, (byte) (b11 + 1), objArr59);
                            objRemoteActionCompatParcelizer25 = startForeground.read(windowTouchSlop2, packedPositionChild2, packedPositionType2, -629981381, false, (String) objArr59[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer25).set(null, lValueOf5);
                        Long lValueOf6 = Long.valueOf(jLongValue3 >> 12);
                        Object objRemoteActionCompatParcelizer26 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                        if (objRemoteActionCompatParcelizer26 == null) {
                            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                            int scrollBarFadeDuration2 = 943 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int trimmedLength = TextUtils.getTrimmedLength("") + 36;
                            byte[] bArr16 = $$a;
                            Object[] objArr60 = new Object[1];
                            c((byte) (bArr16[61] - 1), (short) (-bArr16[22]), (byte) (-bArr16[9]), objArr60);
                            objRemoteActionCompatParcelizer26 = startForeground.read(edgeSlop, scrollBarFadeDuration2, trimmedLength, -167186806, false, (String) objArr60[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer26).set(null, lValueOf6);
                    } catch (Exception unused4) {
                        throw new RuntimeException();
                    }
                }
                int i18 = ((int[]) objArr2[2])[0];
                int i19 = ((int[]) objArr2[0])[0];
                if (i19 != i18) {
                    long j9 = -1;
                    long j10 = 0;
                    long j11 = (((long) (i19 ^ i18)) & ((((long) 0) << 32) | (j9 - ((j9 >> 63) << 32)))) | (((long) 1) << 32) | (j10 - ((j10 >> 63) << 32));
                    Object objRemoteActionCompatParcelizer27 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer27 == null) {
                        objRemoteActionCompatParcelizer27 = startForeground.read((char) (TextUtils.getOffsetAfter("", 0) + 4535), AndroidCharacter.getMirror('0') + 6006, (Process.myTid() >> 22) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke6 = ((Method) objRemoteActionCompatParcelizer27).invoke(null, null);
                    Object[] objArr61 = {1395740170, Long.valueOf(j11), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls13 = (Class) startForeground.IconCompatParcelizer((char) (Process.myPid() >> 22), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6030, 23 - ImageFormat.getBitsPerPixel(0));
                    byte[] bArr17 = $$g;
                    Object[] objArr62 = new Object[1];
                    d((byte) (-bArr17[3]), bArr17[27], (byte) (bArr17[30] - 1), objArr62);
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
        AudioAttributesImplBaseParcelizer();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatCustomActionResultReceiver + 25;
        MediaBrowserCompatItemReceiver = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @getMagicModuleMeta
    public static final Intent IconCompatParcelizer(Context context, String str) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 117;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Intent intentRemoteActionCompatParcelizer = Companion.RemoteActionCompatParcelizer(context, str);
        int i4 = AudioAttributesImplBaseParcelizer + 29;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        return intentRemoteActionCompatParcelizer;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 125;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // kotlin.toFloat, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 17;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = AudioAttributesImplApi26Parcelizer + 95;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void AudioAttributesImplBaseParcelizer() {
        write = -5603694336940540303L;
        RemoteActionCompatParcelizer = new char[]{56417, 3993, 31617, 42913, 37848, 56431, 3989, 31654, 42938, 37849, 65534, 11248, 5945, 17180, 44848, 39768, 51009, 13183, 7825, 19088, 46769, 58019, 52942, 56431, 4053, 31716, 42926, 37855, 65524, 11237, 5914, 17240, 44918, 39687, 50961, 13177, 7830, 19072, 46829, 58108, 52933, 15095, 26296, 21071, 48693, 59938, 54785, 532, 28262, 22976, 34185, 61935, 56705, 2454, 30120, 41449, 36178, 63842, 9517, 4446, 32115, 43366, 38095, 49288, 11507, 6285, 17565, 45220, 40009, 51202, 13373, 56430, 4049, 31669, 42924, 37773, 65442, 11239, 5952, 17160, 44836, 39681, 50969, 13092, 7825, 19072, 46780, 58100, 52929, 15094, 26297, 21070, 48737, 60023, 54794, 533, 28261, 22928, 34257, 61935, 56710, 2453, 30112, 41400, 36097, 63843, 9517, 4445, 32117, 43319, 38046, 49373, 11506, 6353, 17560, 45311, 40002, 51284, 13369, 24697, 19524, 47218, 58473, 55245, 998, 28663, 23515, 34717, 62434, 57153, 2826, 30570, 41735, 36626, 64288, 56420, 3988, 31648, 42936, 37839, 65450, 11179, 5975, 17160, 44833, 39773, 51012, 13157, 7810, 19083, 46765, 58018, 52932, 15079, 26278, 21000, 48696, 59958, 54877, 589, 28276, 22935, 34185, 61871, 56772, 2442, 30207, 41465, 36097, 63782, 9516, 4431, 32097, 43377, 38041, 49310, 11429, 6298, 17611, 45299, 39965, 51275, 13369, 24636, 19529, 47163, 58465, 55186, 951, 28577, 23499, 34776, 62383, 57090, 2906, 30579, 41813, 36690, 64381, 10082, 4756, 32423, 62047, 8612, 21903, 35222, 48632, 53704, 20284, 40155, 59640, 13555, 200, 27814, 47295, 33868, 53329, 15412, 2109, 21515, 41013, 36318, 55771, 9711, 56429, 3982, 31664, 42938, 37843, 65529, 11232, 5974, 17155, 44851, 39706, 51067, 13157, 7811, 19088, 46781, 58017, 52963, 15096, 26343, 21023, 48699, 24036, 36353, 64056, 9781, 4674, 32376, 43629, 38567, 49796, 11948, 6869, 18129, 45816, 40720, 51980, 56376, 4050, 31725, 43004, 37765, 65446, 11187, 5962, 17237, 44918, 39684};
        AudioAttributesCompatParcelizer = -5244778630115618848L;
    }
}
