package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
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
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow2.data.user.remote.model.onboarding.UserBasicDetails;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.writeLongArray;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/writeLongList;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Lo/buildSegmentTimelineElement;", "RemoteActionCompatParcelizer", "Lo/buildSegmentTimelineElement;", "write", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class writeLongList extends writeIntegerList {
    private static char[] AudioAttributesCompatParcelizer;
    private static boolean AudioAttributesImplApi21Parcelizer;
    private static boolean AudioAttributesImplBaseParcelizer;
    private static long IconCompatParcelizer;
    private static int MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private buildSegmentTimelineElement write;
    private static final byte[] $$l = {18, -127, -77, -105};
    private static final int $$m = 14;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {29, -75, -112, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -61, 61, 2, 19, -44, TarConstants.LF_DIR, 1, -13, 23, -7, 10, 3, -29, 32, 7, 4, 1, 14, 30, 16, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17, 23, 12, 6, 9, -11, -32, 38, 21, -7, 10, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17, -61, 41, 37, -15, 23, 5, 2, -42, TarConstants.LF_CONTIG, -17, 6, 15, 8, -7, 10, 3, -29, 24, 19, 4, -7, 17};
    private static final int $$k = 217;
    private static final byte[] $$d = {TarConstants.LF_BLK, -62, -101, -125, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 51;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int RatingCompat = 1;
    private static int MediaBrowserCompatItemReceiver = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(short r7, short r8, short r9) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 119
            int r9 = r9 * 3
            int r9 = 3 - r9
            int r8 = r8 * 3
            int r8 = r8 + 1
            byte[] r0 = kotlin.writeLongList.$$l
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r6
        L2c:
            int r3 = -r3
            int r9 = r9 + r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeLongList.$$n(short, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = 190 - r7
            byte[] r0 = kotlin.writeLongList.$$d
            int r1 = 44 - r6
            int r5 = 114 - r5
            byte[] r1 = new byte[r1]
            int r6 = 43 - r6
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r6
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L20:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r0[r7]
        L26:
            int r5 = r5 + r4
            int r5 = r5 + (-1)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeLongList.g(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = 111 - r8
            int r0 = r6 + 19
            int r7 = 68 - r7
            byte[] r1 = kotlin.writeLongList.$$j
            byte[] r0 = new byte[r0]
            int r6 = r6 + 18
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L28:
            int r7 = r7 + r3
            int r7 = r7 + (-4)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeLongList.h(int, short, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.writeLongList$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/writeLongList$read;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "Lcom/marrow2/data/user/remote/model/onboarding/UserBasicDetails;", "p1", "", "p2", "p3", "p4", "Landroid/content/Intent;", "read", "(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent read(Context p0, List<UserBasicDetails> p1, String p2, String p3, String p4) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            toMagicModuleMetaRepoModel.write(p3, "");
            toMagicModuleMetaRepoModel.write(p4, "");
            Intent intent = new Intent(p0, (Class<?>) writeLongList.class);
            intent.putParcelableArrayListExtra("multiple_account_list", new ArrayList<>(p1));
            intent.putExtra("intermediate_token", p2);
            intent.putExtra("country_code", p3);
            intent.putExtra("phone_number", p4);
            return intent;
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
        int i3 = $10 + 113;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i5 = notifydownloadchanged.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 1;
                    byte b2 = (byte) (b - 1);
                    objRemoteActionCompatParcelizer = startForeground.read((char) (38461 - Color.blue(0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 531, 8 - Color.green(0), -735610793, false, $$n(b, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (IconCompatParcelizer ^ 2192498202983240651L);
                Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (36622 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 2340 - TextUtils.indexOf("", "", 0), 29 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 188119637, false, $$n(b3, b4, b4), new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i6 = $10 + 47;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
                Object[] objArr4 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (36620 - ExpandableListView.getPackedPositionChild(0L)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2339, 29 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 188119637, false, $$n(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                int i7 = 26 / 0;
            } else {
                cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
                Object[] objArr5 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (Gravity.getAbsoluteGravity(0, 0) + 36621), (ViewConfiguration.getFadingEdgeLength() >> 16) + 2340, KeyEvent.getDeadChar(0, 0) + 28, 188119637, false, $$n(b7, b8, b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
        }
        String str = new String(cArr2);
        int i8 = $10 + 1;
        $11 = i8 % 128;
        if (i8 % 2 != 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static void f(byte[] bArr, int i, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr2 = AudioAttributesCompatParcelizer;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (44862 - View.resolveSizeAndState(0, 0, 0)), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 18944, 'L' - AndroidCharacter.getMirror('0'), -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
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
        Object[] objArr3 = {Integer.valueOf(write)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 19033 - (KeyEvent.getMaxKeyCode() >> 16), 75 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
        long j = 0;
        int i4 = -1593953308;
        if (AudioAttributesImplApi21Parcelizer) {
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                Object[] objArr4 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) Color.blue(0), 11439 - TextUtils.getOffsetBefore("", 0), 14 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                int i5 = $11 + 37;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                j = 0;
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
            int i7 = $10 + 83;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[notifydownloads.AudioAttributesCompatParcelizer + notifydownloads.IconCompatParcelizer] / i] - iIntValue);
                Object[] objArr5 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(i4);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) KeyEvent.keyCodeFromString(""), Gravity.getAbsoluteGravity(0, 0) + 11439, ExpandableListView.getPackedPositionGroup(0L) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            } else {
                cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                try {
                    Object[] objArr6 = {notifydownloads, notifydownloads};
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(i4);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        objRemoteActionCompatParcelizer5 = startForeground.read((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), TextUtils.getTrimmedLength("") + 11439, 14 - ((Process.getThreadPriority(0) + 20) >> 6), -558368911, false, "q", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            i4 = -1593953308;
        }
        objArr[0] = new String(cArr6);
    }

    @Override // kotlin.writeIntegerList, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        buildSegmentTimelineElement buildsegmenttimelineelement;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 26454, new char[]{23159, 15617, 38016, 27663, 51101, 24354, 13988, 36471, 25009, 63780, 20610, 10357, 33736, 7004, 62187, 19044, 11765, 34156}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        f(new byte[]{-123, -124, -125, -126, -127}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 117, null, null, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        String str = "";
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                e((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 52552, new char[]{23159, 38705, 49376, 15807, 28509, 22546, 38340, 50887, 12351, 28151, 24252, 34843, 50491, 14016, 25500, 23864, 36592, 64422, 13632, 26116, 21494, 35971, 65058, 11260, 25775, 22099}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 37861, new char[]{23157, 51596, 32186, 57769, 5583, 47571, 11768, 20958, 50462, 26881, 40236, 314, 46401, 55636, 19824, 61822, 25737, 34983}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - TextUtils.indexOf("", "")), 6054 - (ViewConfiguration.getTapTimeout() >> 16), 42 - ExpandableListView.getPackedPositionGroup(0L), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    f(new byte[]{-112, -119, -113, -111, -121, -113, -114, -123, -108, -117, -122, -117, -112, -115, -109, -112, -120, -109, -110, -114, -118, -116, -119, -111, -113, -119, -112, -114, -120, -122, -112, -120, -121, -123, -119, -112, -113, -114, -115, -116, -117, -118, -123, -122, -119, -120, -121, -122}, 127 - (ViewConfiguration.getEdgeSlop() >> 16), null, null, objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    f(new byte[]{-108, -114, -112, -121, -122, -112, -119, -111, -121, -116, -113, -110, -120, -121, -113, -120, -123, -110, -119, -123, -123, -117, -108, -111, -120, -114, -109, -119, -114, -117, -116, -120, -120, -109, -108, -113, -120, -110, -110, -117, -113, -116, -111, -115, -113, -118, -112, -118, -115, -123, -110, -120, -117, -123, -108, -121, -115, -108, -118, -108, -120, -122, -122, -120}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 92, null, null, objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    f(new byte[]{-111, -115, -108, -115, -117, -121, -117, -110, -122, -114, -115, -110, -118, -119, -123, -121, -118, -120, -109, -122, -120, -112, -109, -110, -119, -114, -112, -118, -112, -108, -118, -116, -111, -110, -115, -114, -113, -123, -112, -113, -109, -114, -110, -109, -110, -117, -118, -111, -123, -123, -118, -111, -110, -121, -123, -123, -111, -122, -109, -110, -123, -118, -110, -117}, 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), null, null, objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    e((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 20020, new char[]{23166, 5207, 50696, 45305, 25265, 56613, 36615, 31050, 11226, 58794, 21613, 1597, 61459, 41685, 7327, 53112, 47400, 27639, 9695, 38871, 17990, 12327, 58090, 23728, 3727, 63823, 43799, 26080, 55209, 34403, 28686, 8730, 40131, 20130, 14702, 60237, 42257, 6094, 49597, 45156, 25132, 56334, 36490, 30866, 11109, 58666, 22463, 460, 62358, 41562, 7267, 52976, 47292, 27272, 9565, 38662, 16890, 13300, 57954, 23571, 3669, 63698, 43702, 25976, 55096, 33047, 29647}, objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    f(new byte[]{-109, -107, -116, -110, -107, -113}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 117, null, null, objArr10);
                    String str6 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    e(AndroidCharacter.getMirror('0') + 54599, new char[]{23076, 36688, 61594, 55876, 4092, 29047, 23277, 35942, 61827, 56065, 3286, 30259, 23524, 36144, 63136, 56281, 3410, 30406, 22629, 36346, 63288, 55527, 540, 30602, 22872, 33470, 62561, 55721, 805, 29704, 22919, 33561, 62663, 56864, 1006, 30053}, objArr11);
                    Object[] objArr12 = {baseContext, str2, str3, str4, str5, true, str6, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ImageFormat.getBitsPerPixel(0) + 1), View.getDefaultSize(0, 0) + 6030, 24 - (ViewConfiguration.getEdgeSlop() >> 16), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr12);
                    int i2 = RatingCompat + 67;
                    AudioAttributesImplApi26Parcelizer = i2 % 128;
                    int i3 = i2 % 2;
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
            char cMyPid = (char) ((Process.myPid() >> 22) + 13183);
            int scrollDefaultDelay = 1649 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int iMyPid = 26 - (Process.myPid() >> 22);
            byte[] bArr = $$d;
            byte b = bArr[62];
            byte b2 = bArr[5];
            Object[] objArr13 = new Object[1];
            g(b, b2, (short) (b2 | 187), objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(cMyPid, scrollDefaultDelay, iMyPid, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            int i4 = RatingCompat + 47;
            AudioAttributesImplApi26Parcelizer = i4 % 128;
            int i5 = i4 % 2;
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char c = (char) ((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13183);
                int iRed = 1649 - Color.red(0);
                int iIndexOf = 25 - TextUtils.indexOf((CharSequence) "", '0');
                Object[] objArr14 = new Object[1];
                g(r1[9], (byte) (-$$d[30]), (short) 144, objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(c, iRed, iIndexOf, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            e((-16760769) - Color.rgb(0, 0, 0), new char[]{23164, 6728, 55838, 39626, 23236, 6977, 56077, 39873, 23433, 6159, 55347, 39130, 22673, 6481, 55553, 39370}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            f(new byte[]{-112, -123, -100, -101, -102, -103, -118, -104, -126, -105, -124, -105, -106, -112, -123, -124}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) + 78, null, null, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i6 = AudioAttributesImplApi26Parcelizer + 67;
            RatingCompat = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, -686474905};
                byte b3 = $$j[10];
                byte b4 = (byte) (b3 - 1);
                Object[] objArr18 = new Object[1];
                h(b4, (byte) (b4 | 64), (byte) (b3 - 1), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                h(r1[10], (byte) 46, r1[47], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 13183);
                    int fadingEdgeLength = 1649 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int i8 = 27 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    Object[] objArr20 = new Object[1];
                    g(r7[9], (byte) (-$$d[30]), (short) 144, objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(longPressTimeout, fadingEdgeLength, i8, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) + 1795, new char[]{23159, 23903, 21564, 20241, 18149, 31164, 28824, 26665, 25409, 6714, 7614, 5352, 4027, 1694, 15936, 12602, 10251, 9154, 56004, 56732, 54649, 52302}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 20997, new char[]{23155, 2163, 65125, 44157, 4673, 49246, 46660, 25723, 51771, 47142, 28192, 56321, 33299, 28686, 9741}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 13183);
                        int iMyTid = 1649 - (Process.myTid() >> 22);
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 26;
                        byte[] bArr2 = $$d;
                        byte b5 = bArr2[9];
                        byte b6 = (byte) (-bArr2[30]);
                        Object[] objArr23 = new Object[1];
                        g(b5, b6, (short) (b6 | 101), objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(deadChar, iMyTid, keyRepeatTimeout, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char maxKeyCode = (char) (13183 - (KeyEvent.getMaxKeyCode() >> 16));
                        int modifierMetaStateMask = 1648 - ((byte) KeyEvent.getModifierMetaStateMask());
                        int iIndexOf2 = 26 - TextUtils.indexOf("", "");
                        byte[] bArr3 = $$d;
                        byte b7 = bArr3[62];
                        byte b8 = bArr3[5];
                        Object[] objArr24 = new Object[1];
                        g(b7, b8, (short) (b8 | 187), objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(maxKeyCode, modifierMetaStateMask, iIndexOf2, -133433128, false, (String) objArr24[0], null);
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
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4534 - MotionEvent.axisFromString("")), 6054 - View.combineMeasuredStates(0, 0), Color.alpha(0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            buildsegmenttimelineelement = null;
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {-1735114918, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) View.MeasureSpec.getMode(0), 6030 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 24);
                byte b9 = $$j[44];
                Object[] objArr26 = new Object[1];
                h(b9, (byte) (b9 | 18), r2[0], objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        } else {
            buildsegmenttimelineelement = null;
        }
        CmcdConfigurationRequestConfig.write(this, null, 0, R.attr.colorSurfaceVariant5, false, 11);
        super.onCreate(p0);
        buildSegmentTimelineElement buildsegmenttimelineelementIconCompatParcelizer = buildSegmentTimelineElement.IconCompatParcelizer(getLayoutInflater());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(buildsegmenttimelineelementIconCompatParcelizer, "");
        this.write = buildsegmenttimelineelementIconCompatParcelizer;
        if (buildsegmenttimelineelementIconCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            buildsegmenttimelineelement = buildsegmenttimelineelementIconCompatParcelizer;
        }
        setContentView(buildsegmenttimelineelement.IconCompatParcelizer());
        if (p0 == null) {
            String stringExtra = getIntent().getStringExtra("country_code");
            if (stringExtra == null) {
                stringExtra = "";
            }
            String stringExtra2 = getIntent().getStringExtra("phone_number");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            String stringExtra3 = getIntent().getStringExtra("intermediate_token");
            if (stringExtra3 != null) {
                int i11 = AudioAttributesImplApi26Parcelizer + 93;
                RatingCompat = i11 % 128;
                int i12 = i11 % 2;
                str = stringExtra3;
            }
            ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("multiple_account_list");
            if (parcelableArrayListExtra == null) {
                int i13 = RatingCompat + 57;
                AudioAttributesImplApi26Parcelizer = i13 % 128;
                if (i13 % 2 != 0) {
                    parcelableArrayListExtra = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
                    int i14 = 80 / 0;
                } else {
                    parcelableArrayListExtra = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
                }
            }
            writeLongArray.Companion companion = writeLongArray.INSTANCE;
            CmcdConfigurationRequestConfig.write(this, R.id.fragment_container, writeLongArray.Companion.AudioAttributesCompatParcelizer(parcelableArrayListExtra, str, stringExtra, stringExtra2));
        }
    }

    @Override // kotlin.writeIntegerList, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 99;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 52549, new char[]{23159, 38705, 49376, 15807, 28509, 22546, 38340, 50887, 12351, 28151, 24252, 34843, 50491, 14016, 25500, 23864, 36592, 64422, 13632, 26116, 21494, 35971, 65058, 11260, 25775, 22099}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e(37871 - Color.alpha(0), new char[]{23157, 51596, 32186, 57769, 5583, 47571, 11768, 20958, 50462, 26881, 40236, 314, 46401, 55636, 19824, 61822, 25737, 34983}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 4535), 6053 - TextUtils.lastIndexOf("", '0', 0), View.MeasureSpec.getMode(0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) Gravity.getAbsoluteGravity(0, 0), 6029 - ExpandableListView.getPackedPositionChild(0L), TextUtils.getCapsMode("", 0, 0) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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
        int i4 = AudioAttributesImplApi26Parcelizer + 123;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // kotlin.writeIntegerList, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeLongList.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x08ac A[Catch: all -> 0x0975, TryCatch #12 {all -> 0x0975, blocks: (B:132:0x0897, B:134:0x08ac, B:135:0x08dd), top: B:271:0x0897, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x08f0 A[Catch: all -> 0x096b, TryCatch #6 {all -> 0x096b, blocks: (B:136:0x08e3, B:138:0x08f0, B:139:0x0963), top: B:262:0x08e3, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0aa7  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0af7  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0b50  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0d90  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0e78  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0ec4  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0f1d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x1196  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0874 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:286:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00aa  */
    @Override // kotlin.writeIntegerList, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeLongList.attachBaseContext(android.content.Context):void");
    }

    static {
        MediaBrowserCompatCustomActionResultReceiver = 1;
        MediaBrowserCompatCustomActionResultReceiver();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatItemReceiver + 45;
        MediaBrowserCompatCustomActionResultReceiver = i % 128;
        int i2 = i % 2;
    }

    @Override // kotlin.writeIntegerList, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 67;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = AudioAttributesImplApi26Parcelizer + 21;
        RatingCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void MediaBrowserCompatCustomActionResultReceiver() {
        IconCompatParcelizer = -933639751540487715L;
        AudioAttributesCompatParcelizer = new char[]{28427, 28447, 28515, 28431, 28530, 28533, 28483, 28486, 28528, 28535, 28532, 28482, 28480, 28485, 28511, 28531, 28510, 28487, 28484, 28481, 28488, 28424, 28418, 28526, 28421, 28430, 28501, 28425};
        write = 411398038;
        AudioAttributesImplBaseParcelizer = true;
        AudioAttributesImplApi21Parcelizer = true;
    }
}
