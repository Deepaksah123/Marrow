package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.kt.ui.activities.plan.UpgradePlanActivity;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.VisibilityChecker;
import kotlin.getExtendedEsFrChar;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class setTiming<P extends getExtendedEsFrChar> extends convertMessageToByteArray<P> implements SubjectStat {
    private volatile isHighlighted AudioAttributesCompatParcelizer;
    private getSubjectStat write;
    private static final byte[] $$u = {77, 21, 89, -51};
    private static final int $$x = 115;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$p = {TarConstants.LF_NORMAL, -59, 73, 39, TarConstants.LF_FIFO, -68, -9, -26, 39, -56, 0, -32, 74, -40, -63, 6, -16, -17, 35, -62, -11, -9, -2, -4, -30, -10, 4, -25, 31, -47, -14, -7, 31, -42, -29, 3, 10, -28, -28, 4, -13, -18, -8, -28, 10, -24, -6, -2, -22, 4, -30, -19, -13, -16, 4, 25, -45, -28, 0, -17, -10, 32, -55, -9, -14, 4, -30, 25, -28, -28, 4, -13, -18, -8, -28, 10, -24, -23, -9, TarConstants.LF_BLK, -68, -19, -11, -3, -16, -4, 44, -62, -24, -1, -25, -8, -5, -6, 43, -74, 1, -30, 4, -24, -2, -3, -22, TarConstants.LF_CHR, -64, -16, -12, -18, TarConstants.LF_CONTIG, -32, -48, -12, -18, 65, -24};
    private static final int $$q = 85;
    private static final byte[] $$g = {TarConstants.LF_BLK, -62, -101, -125, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$h = 111;
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    private static long IconCompatParcelizer = -1587591081492578337L;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1000326233;
    private final Object read = new Object();
    private boolean RemoteActionCompatParcelizer = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$A(int r6, short r7, int r8) {
        /*
            byte[] r0 = kotlin.setTiming.$$u
            int r6 = r6 * 4
            int r6 = 104 - r6
            int r8 = r8 * 4
            int r1 = r8 + 1
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r7 = r7 + r4
            int r6 = r6 + 1
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setTiming.$$A(int, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r7 = r7 + 65
            int r0 = 44 - r8
            byte[] r1 = kotlin.setTiming.$$g
            byte[] r0 = new byte[r0]
            int r8 = 43 - r8
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
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setTiming.k(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void l(int r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 5
            int r8 = 76 - r8
            byte[] r0 = kotlin.setTiming.$$p
            int r7 = r7 + 82
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L11
            r7 = r8
            r3 = r9
            r4 = r2
            goto L28
        L11:
            r3 = r2
        L12:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r6
        L28:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setTiming.l(int, byte, short, java.lang.Object[]):void");
    }

    public setTiming() {
        onCustomAction();
    }

    private void onCustomAction() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.setTiming.4
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                setTiming.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            }
        });
        int i2 = MediaBrowserCompatMediaItem + 53;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 33 / 0;
        }
    }

    private void onFastForward() {
        int i = 2 % 2;
        getSubjectStat getsubjectstatWrite = onPlay().write();
        this.write = getsubjectstatWrite;
        if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
            int i2 = MediaDescriptionCompat + 1;
            MediaBrowserCompatMediaItem = i2 % 128;
            if (i2 % 2 != 0) {
                this.write.IconCompatParcelizer(getDefaultViewModelCreationExtras());
                int i3 = 7 / 0;
            } else {
                this.write.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            }
        }
        int i4 = MediaBrowserCompatMediaItem + 17;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void i(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(IconCompatParcelizer ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        int i3 = $11 + 5;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i5 = $10 + 103;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i7 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(IconCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0')), 12424 - ((Process.getThreadPriority(0) + 20) >> 6), 20 - KeyEvent.normalizeMetaState(0), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (Process.myTid() >> 22), ImageFormat.getBitsPerPixel(0) + 1869, 10 - (ViewConfiguration.getPressedStateDuration() >> 16), 1983509525, false, $$A(b, b2, b2), new Class[]{Object.class, Object.class});
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

    private static void j(boolean z, int i, int i2, char[] cArr, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i3];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i3) {
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i5 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 23704 - (ViewConfiguration.getTouchSlop() >> 8), TextUtils.getOffsetBefore("", 0) + 32, -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 44863), 18945 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 29 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1836173544, false, "c", new Class[]{Object.class, Object.class});
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
        if (i2 > 0) {
            cleardownloadmanagerhelpers.write = i2;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i3 - cleardownloadmanagerhelpers.write);
        }
        if (z) {
            char[] cArr4 = new char[i3];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i3) {
                int i6 = $11 + 21;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[i3 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
                    Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.getCapsMode("", 0, 0) + 44862), 18944 - ((Process.getThreadPriority(0) + 20) >> 6), 27 - TextUtils.indexOf((CharSequence) "", '0', 0), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } else {
                    cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i3 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                    Object[] objArr5 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (44862 - (ViewConfiguration.getEdgeSlop() >> 16)), 16796160 + Color.rgb(0, 0, 0), 28 - TextUtils.getOffsetAfter("", 0), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i7 = $11 + 69;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    @Override // kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        i(Color.red(0), new char[]{5070, 11420, 5039, 24395, 29465, 1462, 3495, 2215, 46769, 58017, 43191, 21483, 22913, 24459, 50125, 46757, 64652, 13447, 7824, 6528, 34813, 37227}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        i(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) - 37, new char[]{45723, 56453, 45814, 1762, 36768, 62904, 21567, 62469, 6127}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i2 = MediaDescriptionCompat + 125;
                MediaBrowserCompatMediaItem = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr4 = new Object[1];
                i(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 111, new char[]{6644, 40943, 6549, 63840, 32968, 46789, 43916, 64374, 48267, 20946, 3740, 41018, 21429, 60667, 26040, 17674, 63109, 34808, 47276, 59997, 36290, 8706, 8156, 37053, 8432, 64787, 29386, 13745, 51189, 38959}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                j(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 200, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1, new char[]{6, 2, 65535, 65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 14, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
                int i4 = MediaDescriptionCompat + 117;
                MediaBrowserCompatMediaItem = i4 % 128;
                int i5 = i4 % 2;
            }
            if (baseContext != null) {
                int i6 = MediaDescriptionCompat + 49;
                MediaBrowserCompatMediaItem = i6 % 128;
                int i7 = i6 % 2;
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.getOffsetBefore("", 0) + 4535), 6054 - (ViewConfiguration.getEdgeSlop() >> 16), 42 - Color.argb(0, 0, 0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    i(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 4, new char[]{39302, 8022, 39397, 51703, 9091, 13863, 39759, 22569, 15605, 53606, 15886, 829, 54162, 27652, 21868, 58966, 30419, 1860, 34859, 18762, 3574, 41655, 12124, 13247, 41189, 32167, 16969, 38566, 18398, 6292, 63787, 31182, 6853, 46035, 7229, 56463, 45411, 20128, 45769, 34730, 21620, 59873, 59789, 27368, 60226, 33921, 3302, 52698, 36366, 24475, 41897, 45210}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    j(false, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 164, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 55, new char[]{30, 65524, 65523, 65522, 65524, '!', 31, 65517, 65518, '!', 65523, 30, '\"', 30, 65526, 65523, 65525, 65521, 65526, 31, 65518, 65518, 65517, 65526, 65524, 65519, 65517, 65517, 65521, 31, 65520, '#', 65519, 65520, 65517, 65525, 65524, 31, '!', '!', '#', 65518, '!', 65517, 65526, 65522, 65517, 65518, 65526, 65521, 65522, 65525, '#', '\"', ' ', 65522, '\"', 65520, 65524, 65517, ' ', ' ', 65517, 65524}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) + 28, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    j(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 165, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 12, new char[]{65518, 29, 31, 26, 65514, 65519, 65516, 28, 65514, 27, 65518, 27, 65519, 65520, 65519, 65521, 27, 65514, 26, 29, 65514, 65515, 28, 65521, 29, 29, 65518, 65514, 65521, 26, 29, 29, 65521, 26, 27, 65514, 65515, 65514, 65516, 65515, 65522, 30, 29, 65522, 65516, 65519, 65514, 65521, 65517, 26, 65520, 30, 26, 30, 65516, 31, 65514, 65515, 30, 65513, 28, 65515, 65513, 26}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 45, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    i(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, new char[]{19966, 50827, 19862, 637, 35842, 61371, 20609, 63422, 59549, 2277, 62922, 44273, 1978, 46478, 40636, 18818, 41655, 56973, 17322, 59019, 55760, 31595, 58566, 39968, 29914, 42103, 35287, 14715, 37887, 49499, 13046, 54863, 52989, 27211, 55211, 29529, 25867, 38702, 30983, 10282, 32797, 12334, 8720, 50495, 16172, 23818, 51067, 25101, 23073, 34322, 26730, 7967, 61774, 8422, 3354, 46311, 11328, 19960, 46656, 20973, 19306, 63104, 23395, 3740, 58913, 5082, 64627, 43995, 7312, 48315, 41350}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    i(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, new char[]{11577, 51387, 11520, 38670, 5617, 57809, 50615, 28169, 34823, 1757}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    j(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 158, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) - 3, new char[]{65527, 65526, 65522, 65521, 65521, 65517, 65528, '&', 65528, '&', 65517, 65524, 65526, 65524, 65527, 65517, 65529, '\"', 65522, 65520, 65517, '&', 65527, '!', 65522, 65527, '%', '#', '&', 65521, '!', 65526, 65526, 65522, 65521, '\"'}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), ExpandableListView.getPackedPositionGroup(0L) + 6030, 24 - TextUtils.getOffsetBefore("", 0), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 13183);
            int trimmedLength = 1649 - TextUtils.getTrimmedLength("");
            int iIndexOf = 26 - TextUtils.indexOf("", "", 0);
            byte[] bArr = $$g;
            byte b = bArr[5];
            Object[] objArr13 = new Object[1];
            k(b, (byte) (-bArr[113]), b, objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(maxKeyCode, trimmedLength, iIndexOf, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            int i8 = MediaBrowserCompatMediaItem + 25;
            MediaDescriptionCompat = i8 % 128;
            if (i8 % 2 == 0) {
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char gidForName = (char) (Process.getGidForName("") + 13184);
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 1650;
                    int i9 = (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 25;
                    byte[] bArr2 = $$g;
                    Object[] objArr14 = new Object[1];
                    k((short) (-bArr2[27]), bArr2[5], (byte) (-bArr2[30]), objArr14);
                    objRemoteActionCompatParcelizer4 = startForeground.read(gidForName, bitsPerPixel, i9, -1033747278, false, (String) objArr14[0], null);
                }
                objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
                int i10 = 11 / 0;
            } else {
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13183);
                    int iRgb = (-16775567) - Color.rgb(0, 0, 0);
                    int iMyTid = (Process.myTid() >> 22) + 26;
                    byte[] bArr3 = $$g;
                    Object[] objArr15 = new Object[1];
                    k((short) (-bArr3[27]), bArr3[5], (byte) (-bArr3[30]), objArr15);
                    objRemoteActionCompatParcelizer5 = startForeground.read(scrollBarFadeDuration, iRgb, iMyTid, -1033747278, false, (String) objArr15[0], null);
                }
                objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer5).get(null);
            }
        } else {
            Object[] objArr16 = new Object[1];
            i(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, new char[]{1448, 37495, 1474, 57798, 63571, 47954, 45880, 33790, 41110, 23631, 5695, 55521, 20463, 57661, 32061, 15814, 60139, 35447, 40987, 37570}, objArr16);
            Class<?> cls3 = Class.forName((String) objArr16[0]);
            Object[] objArr17 = new Object[1];
            i(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, new char[]{32800, 31737, 32841, 18716, 5710, 21209, 7153, 28140, 9540, 46532, 48880, 14059, 51784, 2300, 54727, 54218, 28499, 25570, 2240, 31959}, objArr17);
            try {
                Object[] objArr18 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue()), 0, -1664519252};
                byte[] bArr4 = $$p;
                Object[] objArr19 = new Object[1];
                l((byte) (-bArr4[34]), bArr4[2], (byte) (bArr4[3] - 1), objArr19);
                Class<?> cls4 = Class.forName((String) objArr19[0]);
                Object[] objArr20 = new Object[1];
                l((byte) 37, bArr4[28], bArr4[10], objArr20);
                objArr = (Object[]) cls4.getMethod((String) objArr20[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr18);
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer6 == null) {
                    char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 13183);
                    int scrollBarSize = 1649 - (ViewConfiguration.getScrollBarSize() >> 8);
                    int i11 = 27 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    byte[] bArr5 = $$g;
                    Object[] objArr21 = new Object[1];
                    k((short) (-bArr5[27]), bArr5[5], (byte) (-bArr5[30]), objArr21);
                    objRemoteActionCompatParcelizer6 = startForeground.read(maximumFlingVelocity, scrollBarSize, i11, -1033747278, false, (String) objArr21[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer6).set(null, objArr);
                try {
                    Object[] objArr22 = new Object[1];
                    i(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, new char[]{4647, 41395, 4678, 3907, 3506, 34969, 23983, 30220, 46936, 28558, 63679, 11584, 22632, 53924, 37829, 51213, 64878, 47540, 20111, 26411, 34314, 7284, 59879, 7633, 11028, 49996}, objArr22);
                    Class<?> cls5 = Class.forName((String) objArr22[0]);
                    Object[] objArr23 = new Object[1];
                    i((-1) - MotionEvent.axisFromString(""), new char[]{40284, 44080, 40249, 37047, 50728, 34072, 49758, 48532, 14399, 25089, 26443, 59046, 55065, 57141, 3187, 944, 29189, 46121, 53610}, objArr23);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr23[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char windowTouchSlop = (char) (13183 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                        int i12 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1649;
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 26;
                        Object[] objArr24 = new Object[1];
                        k((short) ($$h & 476), r11[5], (byte) (-$$g[30]), objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(windowTouchSlop, i12, keyRepeatTimeout, 54351865, false, (String) objArr24[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer8 == null) {
                        char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 13183);
                        int i13 = (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1648;
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 26;
                        byte[] bArr6 = $$g;
                        byte b2 = bArr6[5];
                        Object[] objArr25 = new Object[1];
                        k(b2, (byte) (-bArr6[113]), b2, objArr25);
                        objRemoteActionCompatParcelizer8 = startForeground.read(absoluteGravity, i13, capsMode, -133433128, false, (String) objArr25[0], null);
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
        int i14 = ((int[]) objArr[3])[0];
        int i15 = ((int[]) objArr[2])[0];
        if (i15 != i14) {
            long j = -1;
            long j2 = ((long) (i15 ^ i14)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer9 == null) {
                objRemoteActionCompatParcelizer9 = startForeground.read((char) (4534 - TextUtils.lastIndexOf("", '0', 0)), 6054 - (Process.myTid() >> 22), (ViewConfiguration.getEdgeSlop() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer9).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
            int i16 = MediaBrowserCompatMediaItem + 121;
            MediaDescriptionCompat = i16 % 128;
            int i17 = i16 % 2;
            try {
                Object[] objArr26 = {-801353593, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) Gravity.getAbsoluteGravity(0, 0), 6030 - (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 25);
                byte[] bArr7 = $$p;
                byte b3 = bArr7[10];
                Object[] objArr27 = new Object[1];
                l(b3, (byte) (b3 | 27), (byte) (-bArr7[77]), objArr27);
                cls6.getMethod((String) objArr27[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr26);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(bundle);
        onFastForward();
    }

    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        getSubjectStat getsubjectstat;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 31;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroy();
            getsubjectstat = this.write;
            int i3 = 15 / 0;
            if (getsubjectstat == null) {
                return;
            }
        } else {
            super.onDestroy();
            getsubjectstat = this.write;
            if (getsubjectstat == null) {
                return;
            }
        }
        getsubjectstat.AudioAttributesCompatParcelizer();
        int i4 = MediaDescriptionCompat + 35;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 67;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        isHighlighted ishighlightedOnPlay = onPlay();
        if (i3 != 0) {
            ishighlightedOnPlay.af_();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objAf_ = ishighlightedOnPlay.af_();
        int i4 = MediaDescriptionCompat + 67;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return objAf_;
    }

    private isHighlighted onMediaButtonEvent() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaBrowserCompatMediaItem + 31;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            return ishighlighted;
        }
        throw null;
    }

    private isHighlighted onPlay() {
        if (this.AudioAttributesCompatParcelizer == null) {
            synchronized (this.read) {
                if (this.AudioAttributesCompatParcelizer == null) {
                    this.AudioAttributesCompatParcelizer = onMediaButtonEvent();
                }
            }
        }
        return this.AudioAttributesCompatParcelizer;
    }

    protected final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 21;
        MediaBrowserCompatMediaItem = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 5 / 0;
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
        } else if (this.RemoteActionCompatParcelizer) {
            return;
        }
        int i5 = i2 + 39;
        MediaBrowserCompatMediaItem = i5 % 128;
        if (i5 % 2 != 0) {
            this.RemoteActionCompatParcelizer = false;
        } else {
            this.RemoteActionCompatParcelizer = true;
        }
        ((processFragmentationUnitPacket) af_()).read((UpgradePlanActivity) getSubmittedOnDate.AudioAttributesCompatParcelizer(this));
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 29;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = MediaDescriptionCompat + 105;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return RemoteActionCompatParcelizer;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c8  */
    @Override // kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setTiming.onResume():void");
    }

    @Override // kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = MediaBrowserCompatMediaItem + 85;
            MediaDescriptionCompat = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            i(Color.green(0), new char[]{6644, 40943, 6549, 63840, 32968, 46789, 43916, 64374, 48267, 20946, 3740, 41018, 21429, 60667, 26040, 17674, 63109, 34808, 47276, 59997, 36290, 8706, 8156, 37053, 8432, 64787, 29386, 13745, 51189, 38959}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            j(false, TextUtils.indexOf("", "", 0) + 204, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 26, new char[]{6, 2, 65535, 65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 8, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = MediaBrowserCompatMediaItem + 9;
            MediaDescriptionCompat = i4 % 128;
            int i5 = i4 % 2;
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i6 = MediaBrowserCompatMediaItem + 43;
                MediaDescriptionCompat = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 4534), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6055, (-16777174) - Color.rgb(0, 0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getOffsetAfter("", 0), Color.red(0) + 6030, 24 - Color.alpha(0), -861814097, false, "read", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:130:0x0955  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x098d A[Catch: all -> 0x0a38, TryCatch #12 {all -> 0x0a38, blocks: (B:142:0x0979, B:144:0x098d, B:145:0x09b2), top: B:289:0x0979, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x09c5 A[Catch: all -> 0x0a2e, TryCatch #6 {all -> 0x0a2e, blocks: (B:146:0x09b8, B:148:0x09c5, B:149:0x0a26), top: B:278:0x09b8, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0b84  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0bd2  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0c82  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0ecd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0fb2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0ffc  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x1047  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x12ab  */
    @Override // kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r35) {
        /*
            Method dump skipped, instruction units count: 5745
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setTiming.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 19;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            throw null;
        }
    }
}
