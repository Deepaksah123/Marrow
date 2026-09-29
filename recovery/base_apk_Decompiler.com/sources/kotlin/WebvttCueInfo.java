package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.ui.activities.plan.PlanActivity;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.VisibilityChecker;
import kotlin.getExtendedEsFrChar;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class WebvttCueInfo<P extends getExtendedEsFrChar> extends convertMessageToByteArray<P> implements SubjectStat {
    private volatile isHighlighted AudioAttributesCompatParcelizer;
    private getSubjectStat read;
    private static final byte[] $$u = {11, -82, -98, -28};
    private static final int $$x = 82;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$p = {77, 21, 89, -51, -14, 0, 61, -59, -10, -2, 6, -7, 5, TarConstants.LF_DIR, -53, -15, 8, -16, 1, 4, 3, TarConstants.LF_BLK, -59, -8, -8, 67, -55, -14, 0, -2, -4, -1, 62, -73, -1, 9, -5, 60, -78, -2, 23, 11, 2, -5, -21, -10, -4, -7, 13, 34, -36, -19, 9, -8, -1, 41, -46, 0, -5, 13, -21, 34, -19, -19, 13, -4, -9, 1, -19, 19, -15, 63, -59, 0, -17, 44, -43, -1, -8, 31, -24, -19, 19, 14, -27, 3, -13, 78, -48, -21, -10, -4, -7, 13, 34, -36, -19, 9, -8, -1, 41, -46, 0, -5, 13, -21, 34, -19, -19, 13, -4, -9, 1, -19, 19, -15, 17};
    private static final int $$q = 169;
    private static final byte[] $$g = {64, -102, 72, -66, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$h = 164;
    private static int handleMediaPlayPauseIfPendingOnHandler = 0;
    private static int onAddQueueItem = 1;
    private static long RemoteActionCompatParcelizer = -3498762522182953692L;
    private static int MediaBrowserCompatCustomActionResultReceiver = -1234196463;
    private static char RatingCompat = 54564;
    private static char[] MediaMetadataCompat = {28385, 28367, 28466, 28412, 28414, 28387, 28384, 28366, 28364, 28465, 28363, 28415, 28362, 28467, 28464, 28365, 28410, 28302, 28402, 28401, 28360, 28469, 28411, 28406, 28299, 28400, 28405, 28303, 28404, 28468, 28413, 28403, 28407, 28300, 28471, 28408, 28369, 28378, 28353, 28409};
    private static int MediaBrowserCompatMediaItem = 411397890;
    private static boolean MediaBrowserCompatSearchResultReceiver = true;
    private static boolean MediaDescriptionCompat = true;
    private final Object IconCompatParcelizer = new Object();
    private boolean write = false;

    private static String $$A(short s, byte b, int i) {
        int i2 = 103 - (b * 4);
        int i3 = i * 4;
        int i4 = 3 - (s * 4);
        byte[] bArr = $$u;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2 = i4 + (-i5);
            i4 = i4;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            int i7 = i4 + 1;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i2 += -bArr[i7];
            i4 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(byte r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 65
            int r0 = r5 + 4
            int r7 = 190 - r7
            byte[] r1 = kotlin.WebvttCueInfo.$$g
            byte[] r0 = new byte[r0]
            int r5 = r5 + 3
            r2 = 0
            if (r1 != 0) goto L12
            r4 = r5
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r7]
        L26:
            int r6 = r6 + r4
            int r6 = r6 + (-1)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.WebvttCueInfo.k(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void l(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r0 = r8 + 4
            int r7 = r7 + 82
            byte[] r1 = kotlin.WebvttCueInfo.$$p
            byte[] r0 = new byte[r0]
            int r8 = r8 + 3
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2b
        L13:
            r3 = r2
        L14:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2b:
            int r6 = r6 + 1
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-2)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.WebvttCueInfo.l(byte, int, int, java.lang.Object[]):void");
    }

    public WebvttCueInfo() {
        onCustomAction();
    }

    private void onCustomAction() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.WebvttCueInfo.4
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                WebvttCueInfo.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            }
        });
        int i2 = onAddQueueItem + 9;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        int i3 = i2 % 2;
    }

    private void onMediaButtonEvent() {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 25;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        if (i2 % 2 != 0) {
            getSubjectStat getsubjectstatWrite = onPlayFromMediaId().write();
            this.read = getsubjectstatWrite;
            int i3 = 0 / 0;
            if (!getsubjectstatWrite.RemoteActionCompatParcelizer()) {
                return;
            }
        } else {
            getSubjectStat getsubjectstatWrite2 = onPlayFromMediaId().write();
            this.read = getsubjectstatWrite2;
            if (!getsubjectstatWrite2.RemoteActionCompatParcelizer()) {
                return;
            }
        }
        this.read.IconCompatParcelizer(getDefaultViewModelCreationExtras());
        int i4 = handleMediaPlayPauseIfPendingOnHandler + 103;
        onAddQueueItem = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void i(char[] cArr, char c, char[] cArr2, char[] cArr3, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
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
        int i5 = $11 + 63;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i7 = $11 + 17;
            $10 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ExpandableListView.getPackedPositionChild(0L) + 1), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22747, 36 - ExpandableListView.getPackedPositionGroup(0L), 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (View.getDefaultSize(0, 0) + 31369), View.MeasureSpec.makeMeasureSpec(0, 0) + 2721, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 38, 1895162189, false, $$A(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) Color.red(0), 15713 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), AndroidCharacter.getMirror('0') + 16, -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    i2 = 2;
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (40977 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 6122 - Color.red(0), 29 - TextUtils.getOffsetAfter("", 0), -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr2[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (RemoteActionCompatParcelizer ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) MediaBrowserCompatCustomActionResultReceiver) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) RatingCompat) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
                i3 = i2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static void j(char[] cArr, byte[] bArr, int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int length;
        char[] cArr2;
        int i3;
        int i4 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr3 = MediaMetadataCompat;
        char c = '0';
        if (cArr3 != null) {
            int i5 = $10 + 55;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (44862 - Drawable.resolveOpacity(0, 0)), 18944 - Color.blue(0), TextUtils.lastIndexOf("", c, 0) + 29, -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr2[i3] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i3++;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(MediaBrowserCompatMediaItem)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 19033 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 75, 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
        int i6 = -1593953308;
        if (MediaDescriptionCompat) {
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr3[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                Object[] objArr4 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) Color.argb(0, 0, 0, 0), 11439 - Color.blue(0), (ViewConfiguration.getTapTimeout() >> 16) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                int i7 = $10 + 77;
                $11 = i7 % 128;
                int i8 = i7 % 2;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!MediaBrowserCompatSearchResultReceiver) {
            notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
            char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            int i9 = $10 + 33;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr3[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                notifydownloads.IconCompatParcelizer++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
        char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
        notifydownloads.IconCompatParcelizer = 0;
        while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
            int i11 = $10 + 39;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr3[cArr[(notifydownloads.AudioAttributesCompatParcelizer + 1) % notifydownloads.IconCompatParcelizer] / i] >>> iIntValue);
                Object[] objArr5 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(i6);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 11438 - Process.getGidForName(""), KeyEvent.getDeadChar(0, 0) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                i2 = -1593953308;
            } else {
                cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr3[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                Object[] objArr6 = {notifydownloads, notifydownloads};
                i2 = -1593953308;
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) ExpandableListView.getPackedPositionGroup(0L), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 11438, TextUtils.indexOf((CharSequence) "", '0', 0) + 15, -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            }
            i6 = i2;
        }
        objArr[0] = new String(cArr6);
    }

    @Override // kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = onAddQueueItem + 49;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        i(new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 31627), new char[]{51459, 34886, 54587, 37695, 7955, 46132, 8364, 45048, 63505, 63957, 24731, 38324, 15237, 62236, 49359, 7545, 36048, 34654}, new char[]{47352, 39705, 36704, 58747}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 4, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        i(new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) + 8345), new char[]{29402, 61177, 23556, 'e', 34280}, new char[]{38651, 64031, 4274, 57889}, (-1292230762) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i4 = handleMediaPlayPauseIfPendingOnHandler + 95;
                onAddQueueItem = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr4 = new Object[1];
                i(new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 40440), new char[]{26937, 13281, 43397, 39436, 43299, 40534, 37710, 43433, 61834, 41891, 11648, 17602, 11768, 21883, 49798, 59501, 42342, 61002, 51126, 26913, 42239, 47196, 43793, 13424, 3854, 34696}, new char[]{32901, 46348, 6922, 41374}, ViewConfiguration.getScrollDefaultDelay() >> 16, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                i(new char[]{0, 0, 0, 0}, (char) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 26488), new char[]{34017, 33769, 30581, 53031, 953, 65189, 31792, 34692, 44563, 1351, 49429, 24114, 13723, 32248, 8031, 46867, 36151, 22051}, new char[]{20217, 63303, 31167, 40551}, ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i6 = handleMediaPlayPauseIfPendingOnHandler + 95;
                onAddQueueItem = i6 % 128;
                int i7 = i6 % 2;
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (View.resolveSize(0, 0) + 4535), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6054, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    j(null, new byte[]{-116, -124, -117, -115, -126, -117, -118, -123, -112, -121, -127, -121, -116, -119, -113, -116, -125, -113, -114, -118, -122, -120, -124, -115, -117, -124, -116, -118, -125, -127, -116, -125, -126, -123, -124, -116, -117, -118, -119, -120, -121, -122, -123, -127, -124, -125, -126, -127}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 92, null, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    i(new char[]{0, 0, 0, 0}, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), new char[]{62990, 64600, 44904, 38288, 26447, 58128, 47731, 44558, 42200, 33186, 33415, 14707, 60728, 35243, 11341, 26320, 11435, 58456, 58754, 45203, 3001, 59005, 30465, 10803, 9525, 12608, 37854, 37116, 4437, 33224, 57144, 32497, 59531, 11211, 51154, 6376, 17546, 50377, 2237, 53400, 14439, 42019, 14225, 46059, 42992, 53276, 3651, 8793, 6472, 57305, 35687, 10643, 20006, 29173, 35640, 60135, 21790, 32770, 23138, 18030, 44411, 671, 30238, 16034}, new char[]{62830, 38621, 7490, 23026}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    i(new char[]{0, 0, 0, 0}, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), new char[]{15788, 36150, 30247, 17371, 57576, 5302, 7545, 379, 21051, 18687, 24283, 31225, 41470, 54680, 56974, 42479, 9191, 17348, 5641, 35450, 11862, 4517, 14633, 58471, 34644, 1828, 62300, 50393, 57866, 63583, 45898, 63735, 61027, 5758, 10145, 39487, 63355, 16302, 34906, 34909, 612, 44676, 49757, 42064, 26893, 45929, 40571, 37520, 65299, 28785, 30504, 47001, 37637, 50982, 12996, 653, 39927, 30615, 24317, 33520, 22193, 32984, 27489, 57870}, new char[]{20185, 40571, 8088, 10821}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    j(null, new byte[]{-108, -110, -99, -116, -94, -116, -106, -113, -94, -106, -110, -108, -116, -97, -99, -105, -106, -105, -109, -122, -106, -95, -101, -127, -98, -116, -102, -122, -100, -96, -108, -123, -102, -122, -100, -97, -98, -110, -108, -122, -127, -110, -122, -116, -102, -111, -110, -98, -108, -123, -99, -100, -101, -102, -103, -104, -105, -122, -123, -106, -106, -107, -108, -109, -110, -110, -111}, View.resolveSize(0, 0) + 127, null, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    j(null, new byte[]{-113, -98, -120, -114, -98, -117}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 92, null, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    j(null, new byte[]{-119, -119, -122, -114, -124, -127, -116, -112, -113, -122, -112, -124, -93, -125, -113, -121, -117, -93, -112, -120, -119, -120, -93, -124, -115, -124, -115, -93, -114, -114, -113, -119, -112, -121, -114, -113}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 117, null, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.indexOf("", ""), TextUtils.lastIndexOf("", '0', 0) + 6031, KeyEvent.normalizeMetaState(0) + 24, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char windowTouchSlop = (char) (13183 - (ViewConfiguration.getWindowTouchSlop() >> 8));
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1649;
            int iGreen = Color.green(0) + 26;
            Object[] objArr13 = new Object[1];
            k((byte) 40, (byte) (-$$g[113]), (short) 187, objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(windowTouchSlop, packedPositionGroup, iGreen, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            int i8 = handleMediaPlayPauseIfPendingOnHandler + 41;
            onAddQueueItem = i8 % 128;
            int i9 = i8 % 2;
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char cGreen = (char) (Color.green(0) + 13183);
                int i10 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1649;
                int iAxisFromString = MotionEvent.axisFromString("") + 27;
                byte[] bArr = $$g;
                byte b = (byte) (-bArr[8]);
                byte b2 = bArr[5];
                Object[] objArr14 = new Object[1];
                k(b, b2, (short) (b2 | 144), objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(cGreen, i10, iAxisFromString, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            j(null, new byte[]{-95, -116, -110, -108, -103, -91, -98, -97, -99, -122, -104, -98, -122, -94, -122, -92}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) + 90, null, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            j(null, new byte[]{-116, -123, -101, -89, -111, -108, -122, -90, -103, -110, -105, -110, -99, -116, -123, -105}, 127 - (Process.myPid() >> 22), null, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i11 = onAddQueueItem + 123;
            handleMediaPlayPauseIfPendingOnHandler = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, -1052417289};
                byte[] bArr2 = $$p;
                Object[] objArr18 = new Object[1];
                l(bArr2[5], bArr2[116], bArr2[49], objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b3 = (byte) 37;
                Object[] objArr19 = new Object[1];
                l(b3, (byte) (b3 - 5), bArr2[5], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char c = (char) ((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13183);
                    int iAxisFromString2 = MotionEvent.axisFromString("") + 1650;
                    int iMyTid = 26 - (Process.myTid() >> 22);
                    byte[] bArr3 = $$g;
                    byte b4 = (byte) (-bArr3[8]);
                    byte b5 = bArr3[5];
                    Object[] objArr20 = new Object[1];
                    k(b4, b5, (short) (b5 | 144), objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(c, iAxisFromString2, iMyTid, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    j(null, new byte[]{-88, -127, -101, -104, -89, -95, -116, -110, -108, -103, -91, -98, -108, -101, -98, -123, -105, -101, -102, -123, -99, -122}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 123, null, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    i(new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 9192), new char[]{16838, 36779, 46417, 50322, 30354, 35952, 30533, 26427, 49592, 28252, 8907, 838, 8772, 40665, 22109}, new char[]{11005, 57889, 2976, 22820}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) - 1595793146, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char cIndexOf = (char) (13183 - TextUtils.indexOf("", ""));
                        int iIndexOf = TextUtils.indexOf("", "", 0) + 1649;
                        int i13 = 27 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        byte[] bArr4 = $$g;
                        byte b6 = (byte) (-bArr4[8]);
                        byte b7 = bArr4[5];
                        Object[] objArr23 = new Object[1];
                        k(b6, b7, (short) (b7 | 111), objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(cIndexOf, iIndexOf, i13, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char cIndexOf2 = (char) (13183 - TextUtils.indexOf("", "", 0, 0));
                        int iResolveSize = 1649 - View.resolveSize(0, 0);
                        int i14 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 25;
                        Object[] objArr24 = new Object[1];
                        k((byte) 40, (byte) (-$$g[113]), (short) 187, objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(cIndexOf2, iResolveSize, i14, -133433128, false, (String) objArr24[0], null);
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
        int i15 = ((int[]) objArr[3])[0];
        int i16 = ((int[]) objArr[2])[0];
        if (i16 != i15) {
            long j = -1;
            long j2 = ((long) (i16 ^ i15)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4535 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), TextUtils.indexOf("", "") + 6054, 41 - ImageFormat.getBitsPerPixel(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
            int i17 = onAddQueueItem + 67;
            handleMediaPlayPauseIfPendingOnHandler = i17 % 128;
            int i18 = i17 % 2;
            try {
                Object[] objArr25 = {-1519334491, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getPressedStateDuration() >> 16), View.combineMeasuredStates(0, 0) + 6030, 23 - ((byte) KeyEvent.getModifierMetaStateMask()));
                Object[] objArr26 = new Object[1];
                l((byte) ($$q & 126), r3[5], (byte) (-$$p[80]), objArr26);
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
        onMediaButtonEvent();
    }

    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 41;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        if (i2 % 2 == 0) {
            super.onDestroy();
            getSubjectStat getsubjectstat = this.read;
            if (getsubjectstat != null) {
                getsubjectstat.AudioAttributesCompatParcelizer();
            }
            int i3 = handleMediaPlayPauseIfPendingOnHandler + 9;
            onAddQueueItem = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.onDestroy();
        throw null;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 37;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        isHighlighted ishighlightedOnPlayFromMediaId = onPlayFromMediaId();
        if (i3 == 0) {
            ishighlightedOnPlayFromMediaId.af_();
            throw null;
        }
        Object objAf_ = ishighlightedOnPlayFromMediaId.af_();
        int i4 = onAddQueueItem + 107;
        handleMediaPlayPauseIfPendingOnHandler = i4 % 128;
        int i5 = i4 % 2;
        return objAf_;
    }

    private isHighlighted onPlay() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 69;
        onAddQueueItem = i2 % 128;
        if (i2 % 2 != 0) {
            return ishighlighted;
        }
        throw null;
    }

    private isHighlighted onPlayFromMediaId() {
        if (this.AudioAttributesCompatParcelizer == null) {
            synchronized (this.IconCompatParcelizer) {
                if (this.AudioAttributesCompatParcelizer == null) {
                    this.AudioAttributesCompatParcelizer = onPlay();
                }
            }
        }
        return this.AudioAttributesCompatParcelizer;
    }

    protected final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler;
        int i3 = i2 + 89;
        onAddQueueItem = i3 % 128;
        if (i3 % 2 != 0) {
            if (this.write) {
                return;
            }
            int i4 = i2 + 11;
            onAddQueueItem = i4 % 128;
            int i5 = i4 % 2;
            this.write = true;
            ((applySpansForTag) af_()).read((PlanActivity) getSubmittedOnDate.AudioAttributesCompatParcelizer(this));
            return;
        }
        throw null;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 29;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        if (i3 == 0) {
            return getNextPercentile.RemoteActionCompatParcelizer(this, defaultViewModelProviderFactory);
        }
        getNextPercentile.RemoteActionCompatParcelizer(this, defaultViewModelProviderFactory);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00db  */
    @Override // kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.WebvttCueInfo.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00c9  */
    @Override // kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.WebvttCueInfo.onPause():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x07fe A[Catch: all -> 0x08b6, TryCatch #17 {all -> 0x08b6, blocks: (B:117:0x07f8, B:119:0x07fe, B:120:0x0829), top: B:335:0x07f8, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x098d A[Catch: all -> 0x03a8, TryCatch #8 {all -> 0x03a8, blocks: (B:242:0x0f86, B:244:0x0f8c, B:245:0x0fb5, B:278:0x1380, B:280:0x1386, B:281:0x13a7, B:259:0x1154, B:261:0x1176, B:262:0x11c4, B:209:0x0b7b, B:211:0x0b81, B:212:0x0bac, B:165:0x0987, B:167:0x098d, B:168:0x09b3, B:28:0x016a, B:30:0x0170, B:31:0x0197, B:33:0x0319, B:35:0x034a, B:36:0x03a2, B:173:0x0a42, B:175:0x0a46, B:179:0x0a52, B:195:0x0b24, B:197:0x0b2a, B:198:0x0b2b, B:200:0x0b2d, B:202:0x0b34, B:203:0x0b35), top: B:318:0x016a, inners: #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x014e  */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v41, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r8v50 */
    /* JADX WARN: Type inference failed for: r8v51 */
    /* JADX WARN: Type inference failed for: r8v52 */
    /* JADX WARN: Type inference failed for: r8v53 */
    /* JADX WARN: Type inference failed for: r8v55 */
    /* JADX WARN: Type inference failed for: r8v56 */
    @Override // kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r36) {
        /*
            Method dump skipped, instruction units count: 5814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.WebvttCueInfo.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 39;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
    }
}
