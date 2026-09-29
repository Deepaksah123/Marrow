package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
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
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public abstract class endCap extends addObserverForBackInvoker implements SubjectStat {
    private volatile isHighlighted AudioAttributesCompatParcelizer;
    private getSubjectStat read;
    private static final byte[] $$c = {80, -72, 126, -24};
    private static final int $$f = 167;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {TarConstants.LF_SYMLINK, -51, -30, -2, -51, 71, 12, 29, -36, 59, 3, 35, -71, 43, 66, -3, 19, 20, -32, 65, 14, 12, 5, 7, 33, 13, -1, 28, -28, TarConstants.LF_SYMLINK, 17, 10, -28, 45, 32, 0, -7, 31, 31, -1, 16, 21, 11, 31, -7, 27, 9, 5, 25, -1, 33, 22, 16, 19, -1, -22, TarConstants.LF_NORMAL, 31, 3, 20, 13, -29, 58, 12, 17, -1, 33, -22, 31, 31, -1, 16, 21, 11, 31, -7, 27, -51, 71, 12, 29, -37, TarConstants.LF_LINK, 20, 25, 12, 15, -1, 13, -1, 41, 17, 15, 12, 1, 10, 26, -25, TarConstants.LF_CONTIG, 17, 9, 2, 33};
    private static final int $$h = 197;
    private static final byte[] $$a = {112, 17, 101, TarConstants.LF_CONTIG, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 168;
    private static int AudioAttributesImplBaseParcelizer = 0;
    private static int MediaBrowserCompatSearchResultReceiver = 1;
    private static char[] RemoteActionCompatParcelizer = {28295, 28312, 28290, 28308, 28313, 28319, 28376, 28309, 28406, 28293, 28291, 28315, 28335, 28403, 28310, 28391, 28306, 28304, 28402, 28318, 28399, 28375, 28370, 28372, 28405, 28389, 28314, 28317, 28404, 28398, 28368, 28374, 28373, 28369};
    private static int AudioAttributesImplApi21Parcelizer = 411397926;
    private static boolean MediaBrowserCompatCustomActionResultReceiver = true;
    private static boolean MediaBrowserCompatItemReceiver = true;
    private static long AudioAttributesImplApi26Parcelizer = 5107334752593925234L;
    private final Object write = new Object();
    private boolean IconCompatParcelizer = false;

    private static String $$i(short s, byte b, short s2) {
        int i = 121 - (b * 2);
        int i2 = s2 + 4;
        byte[] bArr = $$c;
        int i3 = s * 4;
        byte[] bArr2 = new byte[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i += i3;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i;
            i2++;
            if (i4 == i3) {
                return new String(bArr2, 0);
            }
            i += bArr[i2];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.endCap.$$a
            int r6 = r6 + 65
            int r1 = 44 - r7
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            int r7 = 43 - r7
            r2 = -1
            if (r0 != 0) goto L13
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            int r3 = r3 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r1, r7)
            r9[r7] = r6
            return
        L24:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r6 = r6 + r8
            int r8 = r3 + 1
            int r6 = r6 + r2
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.endCap.c(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.endCap.$$g
            int r1 = r6 + 5
            int r8 = 77 - r8
            int r7 = 119 - r7
            byte[] r1 = new byte[r1]
            int r6 = r6 + 4
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
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r7]
        L28:
            int r8 = r8 + r4
            int r8 = r8 + (-14)
            int r7 = r7 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.endCap.d(int, int, int, java.lang.Object[]):void");
    }

    endCap() {
        MediaBrowserCompatItemReceiver();
    }

    private void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.endCap.3
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                endCap.this.AudioAttributesImplApi21Parcelizer();
            }
        });
        int i2 = AudioAttributesImplBaseParcelizer + 113;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
    }

    private void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 111;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            getSubjectStat getsubjectstatWrite = AudioAttributesImplApi26Parcelizer().write();
            this.read = getsubjectstatWrite;
            if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
                this.read.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            }
            int i3 = AudioAttributesImplBaseParcelizer + 103;
            MediaBrowserCompatSearchResultReceiver = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 44 / 0;
                return;
            }
            return;
        }
        getSubjectStat getsubjectstatWrite2 = AudioAttributesImplApi26Parcelizer().write();
        this.read = getsubjectstatWrite2;
        getsubjectstatWrite2.RemoteActionCompatParcelizer();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i3 = $10 + 105;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = notifydownloadchanged.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 38461), 532 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8, -735610793, false, $$i(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (AudioAttributesImplApi26Parcelizer ^ 2192498202983240651L);
                Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 1);
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (Color.alpha(0) + 36621), 2340 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getTouchSlop() >> 8) + 28, 188119637, false, $$i(b3, b4, (byte) (-b4)), new Class[]{Object.class, Object.class});
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
            int i6 = $11 + 117;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            try {
                Object[] objArr4 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 + 1);
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 36620), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2340, (ViewConfiguration.getPressedStateDuration() >> 16) + 28, 188119637, false, $$i(b5, b6, (byte) (-b6)), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr2);
    }

    private static void a(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr3 = RemoteActionCompatParcelizer;
        float f = BitmapDescriptorFactory.HUE_RED;
        if (cArr3 != null) {
            int i3 = $11 + 5;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (44861 - TextUtils.lastIndexOf("", '0', 0, 0)), 18944 - (ViewConfiguration.getJumpTapTimeout() >> 16), 28 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)), -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr4[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i5++;
                    f = BitmapDescriptorFactory.HUE_RED;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(AudioAttributesImplApi21Parcelizer)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
        long j = 0;
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 19034 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 75, 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
        if (!MediaBrowserCompatItemReceiver) {
            if (!MediaBrowserCompatCustomActionResultReceiver) {
                notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
                char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                notifydownloads.IconCompatParcelizer = 0;
                while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                    cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr3[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                    notifydownloads.IconCompatParcelizer++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i6 = $11 + 95;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
            char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr3[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                Object[] objArr4 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) Drawable.resolveOpacity(0, 0), 11439 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 13, -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                j = 0;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i8 = $10 + 21;
        $11 = i8 % 128;
        if (i8 % 2 == 0) {
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            cArr2 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 1;
        } else {
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            cArr2 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
        }
        while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
            int i9 = $10 + 105;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr2[notifydownloads.IconCompatParcelizer] = (char) (cArr3[bArr[(notifydownloads.AudioAttributesCompatParcelizer << 1) % notifydownloads.IconCompatParcelizer] >>> i] + iIntValue);
                Object[] objArr5 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ExpandableListView.getPackedPositionGroup(0L), View.getDefaultSize(0, 0) + 11439, Color.argb(0, 0, 0, 0) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            } else {
                cArr2[notifydownloads.IconCompatParcelizer] = (char) (cArr3[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                Object[] objArr6 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 11439, 14 - (ViewConfiguration.getJumpTapTimeout() >> 16), -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr2);
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 78, new byte[]{-120, -120, -117, -118, -123, -124, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        a(127 - TextUtils.indexOf("", "", 0), new byte[]{-125, -122, -114, -115, -116}, null, null, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                a(127 - (ViewConfiguration.getScrollBarSize() >> 8), new byte[]{-125, -127, -117, -124, -108, -109, -115, -111, -122, -110, -122, -111, -118, -112, -121, -113, -113, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 36384, new char[]{51162, 18845, 56169, 27960, 65176, 'B', 37419, 9167, 46401, 50960, 18687, 55979, 27670, 64965, 4003, 37231, 8902, 46262}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
                int i2 = MediaBrowserCompatSearchResultReceiver + 59;
                AudioAttributesImplBaseParcelizer = i2 % 128;
                int i3 = i2 % 2;
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i4 = MediaBrowserCompatSearchResultReceiver + 73;
                AudioAttributesImplBaseParcelizer = i4 % 128;
                int i5 = i4 % 2;
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (View.combineMeasuredStates(0, 0) + 4535), TextUtils.getOffsetBefore("", 0) + 6054, 43 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 52758, new char[]{51162, 2507, 23303, 44298, 65222, 49342, 4722, 25642, 46517, 34800, 51532, 6797, 27784, 48708, 32831, 53669, 9209, 30059, 18212, 35020, 55814, 11279, 32197, 20449, 37161, 58160, 13499, 1701, 18510, 39299, 60377, 15632, 3900, 20652, 41697, 62569, 50727, 6041, 22865, 43871, 64709, 52949, 4134, 25185, 46005, 34299, 55069, 6357}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 19315, new char[]{51081, 36013, 20788, 9708, 59986, 48779, 836, 55246, 39988, 24737, 13691, 63942, 19997, 4739, 59231, 44150, 28840, 50491, 35206, 24149, 8899, 63298, 48055, '1', 54515, 39191, 28062, 12804, 34436, 19445, 4217, 58592, 43369, 32218, 49685, 38607, 23395, 12216, 62496, 47272, 3353, 53633, 42589, 27424, 16297, 33844, 18666, 7428, 57817, 46663, 31410, 53052, 37796, 22563, 11415, 61725, 17801, 2720, 57130, 41911, 26728, 15495, 33112, 21959}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 8349, new char[]{51163, 59177, 34458, 42558, 17676, 25774, 1052, 9190, 49877, 57972, 33222, 41315, 16397, 28661, 3859, 11954, 52625, 60777, 35977, 44155, 19231, 27325, 2652, 10748, 51352, 59493, 38791, 46971, 22038, 30130, 5462, 13566, 54189, 62233, 37612, 45535, 20860, 28825, 4204, 16216, 56992, 65090, 40374, 48258, 23670, 31686, 7015, 14935, 55740, 63756, 39085, 18379, 26428, 1754, 9852, 50509, 58544, 33794, 41974, 17088, 25139, 467, 8561, 49182}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    b(3624 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{51153, 51690, 56195, 60860, 65366, 33088, 37756, 42119, 46821, 47239, 19030, 23672, 28180, 28720, 500, 4997, 9639, 14154, 14708, 52082, 56513, 61154, 61585, 33373, 38000, 42498, 43052, 47557, 19342, 23974, 28421, 29031, 812, 5343, 9957, 10376, 15030, 52331, 56838, 57385, 61907, 33763, 38385, 42839, 43362, 47887, 19604, 24305, 24729, 29351, 1032, 5653, 6203, 10701, 15334, 52651, 57157, 57657, 62233, 34166, 38578, 39063, 43709, 48197, 19991, 20522, 25028}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) + 13, new byte[]{-104, -121, -105, -106, -121, -107}, null, null, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    b(62141 - TextUtils.indexOf("", "", 0, 0), new char[]{51083, 13621, 8865, 8121, 3451, 31290, 30694, 25763, 21116, 20260, 48317, 43422, 42755, 37901, 33243, 65180, 60509, 55555, 55006, 50055, 12575, 11786, 7095, 2415, 1639, 29691, 24810, 24164, 19234, 47285, 46588, 41788, 36904, 36229, 64149, 59480}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) Drawable.resolveOpacity(0, 0), 6030 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 24, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char c = (char) (13182 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int size = View.MeasureSpec.getSize(0) + 1649;
            int i6 = 27 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            byte[] bArr = $$a;
            byte b = bArr[113];
            byte b2 = bArr[5];
            Object[] objArr13 = new Object[1];
            c(b, b2, b2, objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(c, size, i6, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            int i7 = MediaBrowserCompatSearchResultReceiver + 115;
            AudioAttributesImplBaseParcelizer = i7 % 128;
            int i8 = i7 % 2;
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char cGreen = (char) (Color.green(0) + 13183);
                int iResolveOpacity = 1649 - Drawable.resolveOpacity(0, 0);
                int longPressTimeout = 26 - (ViewConfiguration.getLongPressTimeout() >> 16);
                byte[] bArr2 = $$a;
                Object[] objArr14 = new Object[1];
                c(bArr2[5], bArr2[30], bArr2[27], objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(cGreen, iResolveOpacity, longPressTimeout, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 61638, new char[]{51155, 14129, 9757, 5475, 1075, 29528, 25262, 20872, 16534, 49062, 44784, 40387, 36134, 64536, 60258, 55923}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            b(42358 - TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{51152, 25258, 36146, 14258, 21009, 64643, 9991, 16769, 60489, 5879, 45420, 56268, 1646, 41181, 52063, 30245}, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, -1316903162};
                byte[] bArr3 = $$g;
                byte b3 = (byte) (bArr3[46] - 1);
                Object[] objArr18 = new Object[1];
                d((byte) 38, b3, (byte) (b3 | 65), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b4 = bArr3[35];
                Object[] objArr19 = new Object[1];
                d(b4, b4, bArr3[37], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 13183);
                    int iResolveSize = 1649 - View.resolveSize(0, 0);
                    int i9 = 26 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    byte[] bArr4 = $$a;
                    Object[] objArr20 = new Object[1];
                    c(bArr4[5], bArr4[30], bArr4[27], objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(cKeyCodeFromString, iResolveSize, i9, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) + 90, new byte[]{-100, -118, -123, -101, -102, -116, -117, -111, -120, -115, -103, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    a(126 - TextUtils.indexOf((CharSequence) "", '0'), new byte[]{-117, -116, -122, -111, -101, -127, -117, -99, -125, -117, -120, -113, -127, -101, -117}, null, null, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 13183);
                        int packedPositionType = 1649 - ExpandableListView.getPackedPositionType(0L);
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 26;
                        byte[] bArr5 = $$a;
                        Object[] objArr23 = new Object[1];
                        c(bArr5[5], bArr5[30], (short) 76, objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(threadPriority, packedPositionType, maxKeyCode, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char offsetBefore = (char) (13183 - TextUtils.getOffsetBefore("", 0));
                        int iLastIndexOf = 1648 - TextUtils.lastIndexOf("", '0', 0, 0);
                        int i10 = 26 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                        byte[] bArr6 = $$a;
                        byte b5 = bArr6[113];
                        byte b6 = bArr6[5];
                        Object[] objArr24 = new Object[1];
                        c(b5, b6, b6, objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(offsetBefore, iLastIndexOf, i10, -133433128, false, (String) objArr24[0], null);
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
        int i11 = ((int[]) objArr[3])[0];
        int i12 = ((int[]) objArr[2])[0];
        if (i12 != i11) {
            long j = -1;
            long j2 = ((long) (i12 ^ i11)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4535 - View.resolveSize(0, 0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6054, 42 - (ViewConfiguration.getWindowTouchSlop() >> 8), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {-348954201, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) View.MeasureSpec.getMode(0), 6029 - TextUtils.indexOf((CharSequence) "", '0'), 25 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                byte[] bArr7 = $$g;
                Object[] objArr26 = new Object[1];
                d((byte) (bArr7[51] + 1), (byte) (-bArr7[81]), bArr7[45], objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(bundle);
        AudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 29;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            super.onDestroy();
            getSubjectStat getsubjectstat = this.read;
            if (getsubjectstat != null) {
                getsubjectstat.AudioAttributesCompatParcelizer();
            }
            int i3 = MediaBrowserCompatSearchResultReceiver + 77;
            AudioAttributesImplBaseParcelizer = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.onDestroy();
        throw null;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 99;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = AudioAttributesImplApi26Parcelizer().af_();
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        int i5 = MediaBrowserCompatSearchResultReceiver + 91;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return objAf_;
    }

    private isHighlighted MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = AudioAttributesImplBaseParcelizer + 39;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            return ishighlighted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted AudioAttributesImplApi26Parcelizer() {
        if (this.AudioAttributesCompatParcelizer == null) {
            synchronized (this.write) {
                if (this.AudioAttributesCompatParcelizer == null) {
                    this.AudioAttributesCompatParcelizer = MediaBrowserCompatCustomActionResultReceiver();
                }
            }
        }
        return this.AudioAttributesCompatParcelizer;
    }

    protected final void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver;
        int i3 = i2 + 81;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        if (i3 % 2 == 0) {
            if (this.IconCompatParcelizer) {
                return;
            }
            int i4 = i2 + 37;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            this.IconCompatParcelizer = i4 % 2 == 0;
            int i5 = MediaBrowserCompatSearchResultReceiver + 111;
            AudioAttributesImplBaseParcelizer = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 109;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
            throw null;
        }
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer2 = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i3 = AudioAttributesImplBaseParcelizer + 105;
        MediaBrowserCompatSearchResultReceiver = i3 % 128;
        if (i3 % 2 != 0) {
            return RemoteActionCompatParcelizer2;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a4  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.endCap.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.endCap.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(2:6|(2:(2:11|(2:13|(1:19)(1:18))(2:20|21))(1:22)|(9:24|266|25|(1:27)|28|29|30|(1:32)|33)))(1:9))(0)|37|(9:281|38|(1:40)|41|(3:43|(1:45)|46)(19:47|269|48|(1:50)|51|52|288|53|(1:55)|56|57|58|(1:60)|61|(1:63)|64|(1:66)|67|68)|69|70|(4:73|(15:291|75|(3:77|(4:80|81|82|78)|295)|83|279|84|(1:86)|87|88|89|(1:91)|92|267|93|294)(1:293)|292|71)|290)|106|263|(2:131|(2:133|(1:139)(1:138))(2:142|143))|(22:282|144|(1:146)|147|271|148|(1:150)|151|175|(1:177)|178|(3:180|(1:182)|183)(13:185|277|186|187|(1:189)|190|264|191|192|(1:194)|195|(1:197)|198)|184|199|(6:201|202|(1:204)|205|206|207)|208|(1:210)|211|(3:213|(1:215)|216)(14:218|219|(1:221)|222|223|(1:225)|226|284|227|228|(1:230)|231|(1:233)|234)|217|235|(7:237|238|(1:240)|241|242|243|244)(1:296))|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0842, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x091f, code lost:
    
        r8 = (java.lang.Object[]) null;
        r5 = new java.lang.Object[1];
        a((((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(com.marrow.R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 126, new byte[]{-105, -104, -97, -98, -94, -95, -105, -96, -97, -106, -98}, null, null, r5);
        r2 = (java.lang.String) r5[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0957, code lost:
    
        r4 = new java.io.ByteArrayOutputStream();
        r5 = new java.io.PrintStream(r4);
        r0.printStackTrace(r5);
        r5.close();
        r1 = r4.toString(org.apache.commons.compress.utils.CharsetNames.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x096e, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0972, code lost:
    
        r4 = new java.util.ArrayList(2);
        r4.add(r1);
        r4.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0981, code lost:
    
        r1 = kotlin.startForeground.RemoteActionCompatParcelizer(-1407079962);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0985, code lost:
    
        if (r1 == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0987, code lost:
    
        r1 = kotlin.startForeground.read((char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)) + 4534), android.text.TextUtils.getOffsetAfter("", 0) + 6054, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x09b3, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x09bf, code lost:
    
        r7 = new java.lang.Object[]{-632121714, 81604378625L, r4, com.marrow.TrainingApplication.RemoteActionCompatParcelizer(), false};
        r2 = (java.lang.Class) kotlin.startForeground.IconCompatParcelizer((char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.text.TextUtils.indexOf("", "") + 6030, 24 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
        r4 = kotlin.endCap.$$g;
        r9 = new java.lang.Object[1];
        d((byte) (r4[51] + 1), (byte) (-r4[81]), r4[45], r9);
        r2.getMethod((java.lang.String) r9[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x085e A[Catch: all -> 0x0915, TryCatch #11 {all -> 0x0915, blocks: (B:144:0x084a, B:146:0x085e, B:147:0x088b), top: B:282:0x084a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x089e A[Catch: all -> 0x090b, TryCatch #5 {all -> 0x090b, blocks: (B:148:0x0891, B:150:0x089e, B:151:0x0903), top: B:271:0x0891, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0a42  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0a8c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0ade  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0cfd  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0de1  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0e2b  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0e86  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x10f9  */
    /* JADX WARN: Removed duplicated region for block: B:296:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r31) {
        /*
            Method dump skipped, instruction units count: 5150
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.endCap.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 83;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
    }
}
