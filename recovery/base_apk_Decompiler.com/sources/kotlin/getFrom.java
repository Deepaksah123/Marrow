package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getFrom extends addObserverForBackInvoker implements SubjectStat {
    private getSubjectStat AudioAttributesCompatParcelizer;
    private volatile isHighlighted write;
    private static final byte[] $$c = {45, 96, -22, -65};
    private static final int $$f = 147;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {115, -66, -117, -68, -67, 74, -2, -15, 5, 24, 10, -3, -45, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, 17, 6, 0, 3, -17, -38, 32, 15, -13, 4, -3, -45, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, -67, TarConstants.LF_CONTIG, -4, 13, -50, 35, -7, -20, 17, -37, TarConstants.LF_LINK, -17, -2, -3, 11, -80, 81, -7, -11, 9, -17, TarConstants.LF_SYMLINK, -19, 3, 4, -48, TarConstants.LF_LINK, -2, -4, -11, -9, 17, -3, -17, 12, -50, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11};
    private static final int $$k = 101;
    private static final byte[] $$d = {TarConstants.LF_NORMAL, -59, 73, 39, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 40;
    private static int MediaMetadataCompat = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static long RemoteActionCompatParcelizer = -3498762522182953692L;
    private static int AudioAttributesImplBaseParcelizer = -136981212;
    private static char MediaBrowserCompatCustomActionResultReceiver = 29629;
    private static char[] AudioAttributesImplApi26Parcelizer = {28606, 28492, 28593, 28604, 28597, 28495, 28544, 28595, 28599, 28600, 28576, 28594, 28659, 28554, 28557, 28556, 28607, 28577, 28656, 28552, 28555, 28559, 28657, 28558, 28605, 28603, 28494, 28553, 28658, 28488, 28661, 28602, 28592, 28596, 28493, 28660, 28571, 28574};
    private static int AudioAttributesImplApi21Parcelizer = 411398083;
    private static boolean MediaBrowserCompatItemReceiver = true;
    private static boolean MediaBrowserCompatSearchResultReceiver = true;
    private final Object read = new Object();
    private boolean IconCompatParcelizer = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(byte r7, byte r8, short r9) {
        /*
            int r9 = r9 * 3
            int r9 = r9 + 1
            byte[] r0 = kotlin.getFrom.$$c
            int r7 = r7 * 2
            int r7 = 4 - r7
            int r8 = r8 * 3
            int r8 = r8 + 103
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2b
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r8 = r8 + 1
            int r7 = r7 + r3
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getFrom.$$i(byte, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = 114 - r6
            int r0 = r8 + 4
            int r7 = r7 + 4
            byte[] r1 = kotlin.getFrom.$$d
            byte[] r0 = new byte[r0]
            int r8 = r8 + 3
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2a:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-1)
            r7 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getFrom.g(int, int, int, java.lang.Object[]):void");
    }

    private static void h(byte b, byte b2, short s, Object[] objArr) {
        byte[] bArr = $$j;
        int i = 111 - b;
        int i2 = b2 + 4;
        byte[] bArr2 = new byte[31 - s];
        int i3 = 30 - s;
        int i4 = -1;
        if (bArr == null) {
            i = i2 + i + 2;
            i2 = i2;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i;
            int i6 = i2 + 1;
            if (i5 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i = i + bArr[i6] + 2;
            i2 = i6;
            i4 = i5;
        }
    }

    getFrom() {
        MediaBrowserCompatItemReceiver();
    }

    private void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.getFrom.1
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                getFrom.this.AudioAttributesImplBaseParcelizer();
            }
        });
        int i2 = MediaBrowserCompatMediaItem + 35;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 35;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        this.AudioAttributesCompatParcelizer = AudioAttributesImplApi26Parcelizer().write();
        Object obj = null;
        if (!(!r1.RemoteActionCompatParcelizer())) {
            int i4 = MediaMetadataCompat + 67;
            MediaBrowserCompatMediaItem = i4 % 128;
            if (i4 % 2 == 0) {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
                throw null;
            }
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
        }
        int i5 = MediaBrowserCompatMediaItem + 93;
        MediaMetadataCompat = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static void e(char[] cArr, int i, char[] cArr2, char[] cArr3, char c, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i4 = $11 + 57;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) Color.alpha(0), 22747 - TextUtils.indexOf((CharSequence) "", '0'), 36 - (ViewConfiguration.getEdgeSlop() >> 16), 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {notifydownloadremoved};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (31369 - (ViewConfiguration.getLongPressTimeout() >> 16)), 2721 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 38 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1895162189, false, $$i(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) Color.red(0), 15712 - TextUtils.lastIndexOf("", '0', 0, 0), 64 - (KeyEvent.getMaxKeyCode() >> 16), -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                objRemoteActionCompatParcelizer4 = startForeground.read((char) (Color.argb(0, 0, 0, 0) + 40976), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6122, (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 28, -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = notifydownloadremoved.write;
                            cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr2[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (RemoteActionCompatParcelizer ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) AudioAttributesImplBaseParcelizer) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) MediaBrowserCompatCustomActionResultReceiver) ^ (-3498762522182953692L)))));
                            notifydownloadremoved.AudioAttributesCompatParcelizer++;
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
        String str = new String(cArr6);
        int i6 = $11 + 49;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static void f(byte[] bArr, int i, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        char[] cArr2;
        int i3 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr3 = AudioAttributesImplApi26Parcelizer;
        long j = 0;
        char c = 0;
        if (cArr3 != null) {
            int i4 = $11 + 3;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[c] = Integer.valueOf(cArr3[i6]);
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (44862 - TextUtils.indexOf("", "")), (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 18943, 27 - TextUtils.lastIndexOf("", '0'), -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr4[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i6++;
                    j = 0;
                    c = 0;
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
        try {
            Object[] objArr3 = {Integer.valueOf(AudioAttributesImplApi21Parcelizer)};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 19033, 75 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1457087504, false, "r", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
            if (MediaBrowserCompatSearchResultReceiver) {
                notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
                char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                notifydownloads.IconCompatParcelizer = 0;
                while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                    cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr3[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                    Object[] objArr4 = {notifydownloads, notifydownloads};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) KeyEvent.keyCodeFromString(""), TextUtils.lastIndexOf("", '0', 0) + 11440, 14 - ExpandableListView.getPackedPositionType(0L), -558368911, false, "q", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr5);
                return;
            }
            if (MediaBrowserCompatItemReceiver) {
                int i7 = $11 + 85;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
                    cArr2 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                    i2 = 0;
                } else {
                    i2 = 0;
                    notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
                    cArr2 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                }
                notifydownloads.IconCompatParcelizer = i2;
                while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                    cArr2[notifydownloads.IconCompatParcelizer] = (char) (cArr3[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                    Object[] objArr5 = {notifydownloads, notifydownloads};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 11440 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 14 - KeyEvent.keyCodeFromString(""), -558368911, false, "q", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr2);
                return;
            }
            int i8 = 0;
            notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
            char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            while (true) {
                notifydownloads.IconCompatParcelizer = i8;
                if (notifydownloads.IconCompatParcelizer >= notifydownloads.AudioAttributesCompatParcelizer) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr3[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                    i8 = notifydownloads.IconCompatParcelizer + 1;
                }
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        e(new char[]{0, 0, 0, 0}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, new char[]{51812, 27180, 46087, 64800, 18831, 11310, 32905, 40402, 62781, 44787, 61430, 63912, 43579, 55619, 46157, 3243, 22767, 16660}, new char[]{33000, 47196, 6141, 58860}, (char) (TextUtils.indexOf("", "", 0, 0) + 60439), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        e(new char[]{0, 0, 0, 0}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) + 532544773, new char[]{29224, 32624, 55388, 37079, 23290}, new char[]{10562, 48637, 6943, 11347}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 21240), objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i2 = MediaBrowserCompatMediaItem + 109;
                MediaMetadataCompat = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr4 = new Object[1];
                e(new char[]{0, 0, 0, 0}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4, new char[]{17751, 43281, 17947, 17235, 62288, 21494, 14930, 17962, 46880, 63524, 11557, 31814, 15797, 42529, 65405, 7913, 25626, 23262, 16798, 23760, 15902, 34461, 48005, 49247, 40696, 15740}, new char[]{53153, 55499, 53654, 63232}, (char) (209 - TextUtils.getOffsetBefore("", 0)), objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                f(new byte[]{-123, -116, -118, -122, -117, -127, -118, -119, -120, -120, -121, -122, -123, -124, -125, -125, -126, -127}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 123, null, null, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.lastIndexOf("", '0') + 4536), 6054 - Color.blue(0), 43 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 111, new char[]{32375, 25700, 10180, 18926, 61539, 17298, 446, 42764, 15514, 30141, 14306, 42851, 38443, 37770, 13526, 61504, 35870, 61961, 60679, 8231, 39775, 17700, 33572, 3491, 37404, 60401, 17959, 50856, 51638, 2513, 8262, 21168, 25841, 1569, 570, 39759, 51700, 43784, 18182, 65024, 51842, 41585, 18335, 20610, 7501, 36592, 52904, 48337}, new char[]{22049, 40252, 215, 21540}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 99), objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    f(new byte[]{-114, -104, -124, -112, -127, -124, -103, -107, -112, -106, -108, -109, -115, -112, -108, -115, -111, -109, -103, -111, -111, -110, -114, -107, -115, -104, -105, -103, -104, -110, -106, -115, -115, -105, -114, -108, -115, -109, -109, -110, -108, -106, -107, -113, -108, -117, -124, -117, -113, -111, -109, -115, -110, -111, -114, -112, -113, -114, -117, -114, -115, -127, -127, -115}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 13, null, null, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    f(new byte[]{-107, -113, -114, -113, -110, -112, -110, -109, -127, -104, -113, -109, -117, -103, -111, -112, -117, -115, -105, -127, -115, -124, -105, -109, -103, -104, -124, -117, -124, -114, -117, -106, -107, -109, -113, -104, -108, -111, -124, -108, -105, -104, -109, -105, -109, -110, -117, -107, -111, -111, -117, -107, -109, -112, -111, -111, -107, -127, -105, -109, -111, -117, -109, -110}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 123, null, null, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    f(new byte[]{-101, -122, -123, -124, -93, -124, -99, -105, -93, -99, -122, -101, -124, -96, -123, -118, -99, -118, -120, -117, -99, -94, -116, -127, -97, -124, -125, -117, -126, -95, -101, -111, -125, -117, -126, -96, -97, -122, -101, -117, -127, -122, -117, -124, -125, -102, -122, -97, -101, -111, -123, -126, -116, -125, -98, -119, -118, -117, -111, -99, -99, -100, -101, -120, -122, -122, -102}, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, null, null, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    f(new byte[]{-105, -97, -106, -109, -97, -108}, KeyEvent.normalizeMetaState(0) + 127, null, null, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    f(new byte[]{-113, -113, -117, -109, -103, -127, -124, -114, -105, -117, -114, -103, -92, -115, -105, -110, -108, -92, -114, -106, -113, -106, -92, -103, -107, -103, -107, -92, -109, -109, -105, -113, -114, -110, -109, -105}, Process.getGidForName("") + 128, null, null, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - Process.getGidForName("")), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6029, 23 - MotionEvent.axisFromString(""), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char touchSlop = (char) (13183 - (ViewConfiguration.getTouchSlop() >> 8));
            int i4 = 1650 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int size = View.MeasureSpec.getSize(0) + 26;
            Object[] objArr13 = new Object[1];
            g((byte) (-$$d[62]), r0[53], (byte) $$e, objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(touchSlop, i4, size, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char scrollBarFadeDuration = (char) (13183 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                int i5 = 1649 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                int iGreen = Color.green(0) + 26;
                Object[] objArr14 = new Object[1];
                g((byte) (-$$d[9]), r0[65], r0[8], objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(scrollBarFadeDuration, i5, iGreen, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
            int i6 = MediaBrowserCompatMediaItem + 125;
            MediaMetadataCompat = i6 % 128;
            int i7 = i6 % 2;
        } else {
            Object[] objArr15 = new Object[1];
            e(new char[]{0, 0, 0, 0}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 4, new char[]{3629, 5225, 44791, 52703, 54670, 25949, 34815, 39577, 50850, 61458, 5271, 51264, 31704, 37904, 25031, 13634}, new char[]{53201, 9337, 62762, 32815}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 12267), objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            f(new byte[]{-124, -111, -116, -90, -102, -101, -117, -91, -98, -122, -118, -122, -123, -124, -111, -118}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 123, null, null, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i8 = MediaMetadataCompat + 47;
            MediaBrowserCompatMediaItem = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, -983289805};
                byte[] bArr = $$j;
                byte b = bArr[22];
                byte b2 = (byte) (-bArr[15]);
                Object[] objArr18 = new Object[1];
                h(b, b2, (byte) (b2 & 25), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                h((byte) (-bArr[18]), bArr[37], bArr[27], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 13183);
                    int iRgb = (-16775567) - Color.rgb(0, 0, 0);
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 26;
                    Object[] objArr20 = new Object[1];
                    g((byte) (-$$d[9]), r2[65], r2[8], objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(scrollBarSize, iRgb, capsMode, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 4, new char[]{6205, 21966, 7109, 42327, 14569, 28212, 26223, 60909, 35110, 46202, 29938, 34729, 10274, 18871, 45684, 26790, 61173, 28017, 13828, 14590, 9143, 15310}, new char[]{51309, 52799, 19398, 43363}, (char) TextUtils.indexOf("", ""), objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 1614253522, new char[]{9826, 189, 53935, 9093, 31275, 59313, 8309, 44114, 34000, 52264, 13047, 332, 64269, 54395, 60781}, new char[]{40324, 51314, 1951, 53574}, (char) (17927 - Gravity.getAbsoluteGravity(0, 0)), objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char c = (char) (13184 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int i10 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1649;
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 26;
                        Object[] objArr23 = new Object[1];
                        g((byte) (-$$d[9]), (short) 75, r6[8], objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(c, i10, packedPositionType, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char cIndexOf = (char) (13183 - TextUtils.indexOf("", "", 0, 0));
                        int i11 = 1649 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                        int capsMode2 = 26 - TextUtils.getCapsMode("", 0, 0);
                        Object[] objArr24 = new Object[1];
                        g((byte) (-$$d[62]), r4[53], (byte) $$e, objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(cIndexOf, i11, capsMode2, -133433128, false, (String) objArr24[0], null);
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
        int i12 = ((int[]) objArr[3])[0];
        int i13 = ((int[]) objArr[2])[0];
        if (i13 != i12) {
            long j = -1;
            long j2 = ((long) (i13 ^ i12)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4535 - (ViewConfiguration.getTouchSlop() >> 8)), 6054 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.getOffsetBefore("", 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {1565770852, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 6030, 23 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                Object[] objArr26 = new Object[1];
                h((byte) 29, (byte) (-$$j[26]), r3[31], objArr26);
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
        AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.AudioAttributesCompatParcelizer;
        if (getsubjectstat != null) {
            int i2 = MediaMetadataCompat + 29;
            MediaBrowserCompatMediaItem = i2 % 128;
            int i3 = i2 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
            int i4 = MediaMetadataCompat + 33;
            MediaBrowserCompatMediaItem = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 33;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        isHighlighted ishighlightedAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        if (i3 == 0) {
            ishighlightedAudioAttributesImplApi26Parcelizer.af_();
            throw null;
        }
        Object objAf_ = ishighlightedAudioAttributesImplApi26Parcelizer.af_();
        int i4 = MediaBrowserCompatMediaItem + 45;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return objAf_;
    }

    private isHighlighted MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaMetadataCompat + 55;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            return ishighlighted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted AudioAttributesImplApi26Parcelizer() {
        if (this.write == null) {
            synchronized (this.read) {
                if (this.write == null) {
                    this.write = MediaBrowserCompatCustomActionResultReceiver();
                }
            }
        }
        return this.write;
    }

    protected final void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 89;
        MediaBrowserCompatMediaItem = i3 % 128;
        int i4 = i3 % 2;
        if (this.IconCompatParcelizer) {
            return;
        }
        int i5 = i2 + 93;
        MediaBrowserCompatMediaItem = i5 % 128;
        this.IconCompatParcelizer = i5 % 2 != 0;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 47;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 == 0) {
            getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
            throw null;
        }
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer2 = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i3 = MediaBrowserCompatMediaItem + 49;
        MediaMetadataCompat = i3 % 128;
        int i4 = i3 % 2;
        return RemoteActionCompatParcelizer2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00dd  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getFrom.onResume():void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            e(new char[]{0, 0, 0, 0}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(3) - 100, new char[]{17751, 43281, 17947, 17235, 62288, 21494, 14930, 17962, 46880, 63524, 11557, 31814, 15797, 42529, 65405, 7913, 25626, 23262, 16798, 23760, 15902, 34461, 48005, 49247, 40696, 15740}, new char[]{53153, 55499, 53654, 63232}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 205), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(new byte[]{-123, -116, -118, -122, -117, -127, -118, -119, -120, -120, -121, -122, -123, -124, -125, -125, -126, -127}, View.resolveSizeAndState(0, 0, 0) + 127, null, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = MediaBrowserCompatMediaItem + 83;
            MediaMetadataCompat = i2 % 128;
            if (i2 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i3 = MediaBrowserCompatMediaItem + 93;
            MediaMetadataCompat = i3 % 128;
            try {
                if (i3 % 2 != 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4534 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 6053 - TextUtils.lastIndexOf("", '0', 0), 42 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.indexOf("", "", 0, 0), 6031 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 24, -861814097, false, "read", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    throw null;
                }
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (Color.blue(0) + 4535), 6054 - TextUtils.indexOf("", "", 0), 41 - ExpandableListView.getPackedPositionChild(0L), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (Process.myPid() >> 22), 6030 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 24, -861814097, false, "read", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(objInvoke2, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
        int i4 = MediaMetadataCompat + 37;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0873 A[Catch: all -> 0x02f2, TryCatch #11 {all -> 0x02f2, blocks: (B:133:0x086d, B:135:0x0873, B:136:0x089c, B:210:0x0f37, B:212:0x0f3d, B:213:0x0f6a, B:245:0x1398, B:247:0x139e, B:248:0x13c9, B:226:0x1145, B:228:0x1167, B:229:0x11c0, B:177:0x0abe, B:179:0x0ac4, B:180:0x0aed, B:17:0x0134, B:19:0x013a, B:20:0x0166, B:22:0x0264, B:24:0x0295, B:25:0x02ec), top: B:290:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0952 A[Catch: all -> 0x0a0d, TryCatch #8 {all -> 0x0a0d, blocks: (B:152:0x093e, B:154:0x0952, B:155:0x097d), top: B:284:0x093e, outer: #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0990 A[Catch: all -> 0x0a03, TryCatch #3 {all -> 0x0a03, blocks: (B:156:0x0983, B:158:0x0990, B:159:0x09fb), top: B:275:0x0983, outer: #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0b7c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0bce  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0c23  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0f11  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0ffb  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x1040  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x1092  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x1374  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0923 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02f6 A[PHI: r8
      0x02f6: PHI (r8v69 int) = (r8v15 int), (r8v70 int) binds: [B:15:0x012f, B:5:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:310:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0107 A[PHI: r8
      0x0107: PHI (r8v15 int) = (r8v77 int), (r8v78 int) binds: [B:3:0x00f7, B:5:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v49, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v50 */
    /* JADX WARN: Type inference failed for: r8v51 */
    /* JADX WARN: Type inference failed for: r8v65 */
    /* JADX WARN: Type inference failed for: r8v66 */
    /* JADX WARN: Type inference failed for: r8v67 */
    /* JADX WARN: Type inference failed for: r8v72 */
    /* JADX WARN: Type inference failed for: r8v73 */
    /* JADX WARN: Type inference failed for: r8v74 */
    /* JADX WARN: Type inference failed for: r8v75 */
    /* JADX WARN: Type inference failed for: r8v76 */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r37) {
        /*
            Method dump skipped, instruction units count: 5936
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getFrom.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 3;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaMetadataCompat + 41;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
    }
}
