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
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
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
import org.apache.commons.compress.compressors.bzip2.BZip2Constants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zas extends addObserverForBackInvoker implements SubjectStat {
    private static int $10 = 0;
    private static int $11 = 1;
    private getSubjectStat RemoteActionCompatParcelizer;
    private volatile isHighlighted read;
    private static final byte[] $$g = {28, -38, TarConstants.LF_DIR, -29, 74, -14, 7, 4, 2, -25, 12, 21, 14, 7, 7, 26, -8, -10, 13, 8, 12, 22, 74, -74, 14, 18, -2, 24, -17, -3, 10, TarConstants.LF_BLK, -35, 11, 6, 24, -10, 45, -8, -8, 24, 7, 2, 12, -8, 30, -4, -10, 1, 7, 4, 24, 45, -25, -8, 20, 3, 10, TarConstants.LF_BLK, -35, 11, 6, 24, -10, 45, -8, -8, 24, 7, 2, 12, -8, 30, -4, 74, -14, -42, 18, 40, -19, 20, -15, 29, -4, TarConstants.LF_SYMLINK, -27, 6, 13, TarConstants.LF_SYMLINK, -35, 11, 6, 10, 10, 18, 0, 3, TarConstants.LF_LINK, -20, -1, 8, 24, 0, 18, -4, TarConstants.LF_FIFO, -42, 13, 24, -4, 13, 22, -2, 34, -29, 20, 3, 21, 12, -6, 20, 15, 32, -12, -3, 20, 7, 12, 56};
    private static final int $$h = 44;
    private static final byte[] $$a = {20, 28, 18, 12, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 107;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int AudioAttributesImplBaseParcelizer = 1;
    private static int IconCompatParcelizer = 1000326311;
    private static char[] AudioAttributesImplApi21Parcelizer = {6464, 6505, 6470, 6494, 6429, 6477, 6416, 6525, 6476, 6430, 6469, 6426, 6479, 6465, 6431, 6406, 6522, 6405, 6488, 6490, 6474, 6424, 6524, 6473, 6481, 6471, 6472, 6492, 6468, 6491, 6475, 6427, 6428, 6478, 6417, 6425};
    private static char MediaBrowserCompatCustomActionResultReceiver = 11444;
    private final Object AudioAttributesCompatParcelizer = new Object();
    private boolean write = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = 190 - r7
            int r8 = 44 - r8
            byte[] r0 = kotlin.zas.$$a
            int r6 = r6 + 65
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r7
            r6 = r8
            r4 = r2
            goto L29
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            int r3 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L29:
            int r6 = r6 + r7
            int r6 = r6 + (-1)
            r7 = r3
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zas.c(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 73
            byte[] r0 = kotlin.zas.$$g
            int r1 = r5 + 20
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            int r5 = r5 + 19
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r5
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r3 = r0[r7]
        L24:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + 9
            int r7 = r7 + 1
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zas.d(byte, short, byte, java.lang.Object[]):void");
    }

    zas() {
        AudioAttributesImplBaseParcelizer();
    }

    private void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.zas.3
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                zas.this.MediaBrowserCompatCustomActionResultReceiver();
            }
        });
        int i2 = AudioAttributesImplBaseParcelizer + 73;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
    }

    private void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 13;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            getSubjectStat getsubjectstatWrite = MediaBrowserCompatItemReceiver().write();
            this.RemoteActionCompatParcelizer = getsubjectstatWrite;
            if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
                int i3 = MediaBrowserCompatItemReceiver + 27;
                AudioAttributesImplBaseParcelizer = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            return;
        }
        getSubjectStat getsubjectstatWrite2 = MediaBrowserCompatItemReceiver().write();
        this.RemoteActionCompatParcelizer = getsubjectstatWrite2;
        getsubjectstatWrite2.RemoteActionCompatParcelizer();
        throw null;
    }

    private static void a(int i, boolean z, char[] cArr, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i2];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
            int i5 = $10 + 57;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i3 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i7 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(IconCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 23704, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 32, -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (Color.argb(0, 0, 0, 0) + 44862), 18944 - View.combineMeasuredStates(0, 0), 28 - View.MeasureSpec.getMode(0), -1836173544, false, "c", new Class[]{Object.class, Object.class});
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
        if (i > 0) {
            int i8 = $11 + 89;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cleardownloadmanagerhelpers.write = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i2 - cleardownloadmanagerhelpers.write);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
                int i10 = $10 + 31;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i2 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 44862), 18943 - TextUtils.lastIndexOf("", '0', 0), 28 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                int i12 = $10 + 119;
                $11 = i12 % 128;
                int i13 = i12 % 2;
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i14 = $11 + 1;
        $10 = i14 % 128;
        int i15 = i14 % 2;
        objArr[0] = str;
    }

    private static void b(byte b, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3;
        int i4;
        int length;
        char[] cArr2;
        int i5 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr3 = AudioAttributesImplApi21Parcelizer;
        Object obj2 = null;
        if (cArr3 != null) {
            int i6 = $10 + 101;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i7])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 7015 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 31 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -626716224, false, "o", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) KeyEvent.getDeadChar(0, 0), ExpandableListView.getPackedPositionChild(0L) + 7016, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 29, -626716224, false, "o", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            needsstartedservice.AudioAttributesCompatParcelizer = 0;
            while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(105000849);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (Color.argb(0, 0, 0, 0) + 48194), 20126 - ExpandableListView.getPackedPositionGroup(0L), View.MeasureSpec.getMode(0) + 20, 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                        Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(50135433);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) Color.argb(0, 0, 0, 0), 19368 - Color.red(0), 18 - (Process.myTid() >> 22), 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                        int i8 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr3[iIntValue];
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr3[i8];
                        i4 = $10 + 121;
                        $11 = i4 % 128;
                        i3 = 2;
                    } else {
                        obj = null;
                        if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                            needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                            needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                            int i9 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            int i10 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr3[i9];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr3[i10];
                            int i11 = $11 + 53;
                            $10 = i11 % 128;
                            i3 = 2;
                            if (i11 % 2 != 0) {
                                i4 = 4;
                            }
                        } else {
                            int i12 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            int i13 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr3[i12];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr3[i13];
                        }
                    }
                    int i14 = i4 % i3;
                }
                needsstartedservice.AudioAttributesCompatParcelizer += 2;
                obj2 = obj;
            }
        }
        for (int i15 = 0; i15 < i; i15++) {
            cArr4[i15] = (char) (cArr4[i15] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr;
        char c;
        char c2;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) - 26, true, new char[]{16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, 16, 16, 2, 0, '\f', 15, 65517, 65483}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 17, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 254, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 98), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 30, new char[]{6, 28, '\r', 19, 13924}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i2 = MediaBrowserCompatItemReceiver + 15;
                AudioAttributesImplBaseParcelizer = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr4 = new Object[1];
                b((byte) ((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 81), 26 - Gravity.getAbsoluteGravity(0, 0), new char[]{20, 5, 7, 20, 31, 19, '\t', 14, 18, 19, 21, '\f', 0, 31, 25, 15, 1, 15, 28, 25, 18, 4, 23, 1, 20, 11}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 6, true, new char[]{65535, '\n', 65527, 65529, 65535, 2, 6, 6, 65495, '\n', 4, 65531, '\b', '\b', 11, 65529, 4, 5}, 18 - (ViewConfiguration.getTouchSlop() >> 8), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + BZip2Constants.MAX_ALPHA_SIZE, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
                int i4 = MediaBrowserCompatItemReceiver + 117;
                AudioAttributesImplBaseParcelizer = i4 % 128;
                int i5 = i4 % 2;
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((Process.myPid() >> 22) + 4535), (ViewConfiguration.getScrollBarSize() >> 8) + 6054, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    b((byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 120), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 13, new char[]{'\"', 0, 27, 3, ' ', 6, 18, 21, '!', '\b', ' ', '#', 3, '#', '\n', 2, 23, 3, '!', 18, '#', 1, '\"', '#', '\t', 30, '#', 20, ' ', 30, '\t', 23, 11, 17, 11, 3, 18, ' ', 26, 20, 7, ' ', 4, '\n', '\n', 30, '#', 3}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 12, false, new char[]{65517, 65526, 65522, 65517, 65518, 65526, 65521, 65522, 65525, '#', '\"', ' ', 65522, '\"', 65520, 65524, 65517, ' ', ' ', 65517, 65524, 30, 65524, 65523, 65522, 65524, '!', 31, 65517, 65518, '!', 65523, 30, '\"', 30, 65526, 65523, 65525, 65521, 65526, 31, 65518, 65518, 65517, 65526, 65524, 65519, 65517, 65517, 65521, 31, 65520, '#', 65519, 65520, 65517, 65525, 65524, 31, '!', '!', '#', 65518, '!'}, TextUtils.getTrimmedLength("") + 64, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + TsExtractor.TS_PACKET_SIZE, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 67), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 64, new char[]{23, ' ', 20, 11, 5, 17, 0, '\f', 13899, 13899, 5, '\"', 11, 18, 13899, 13899, 11, 18, 23, ' ', 17, 5, '#', 7, '#', 4, '\n', ' ', '!', 7, 30, 11, '#', 20, 17, 2, 29, 11, ' ', '\"', 5, 17, 3, 23, '#', 6, 22, 18, 2, '\n', '#', 21, '!', 11, ' ', 31, ' ', 23, 2, 22, '\b', 15, '\n', 7}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 108, true, new char[]{65485, 65496, 17, 14, 18, 18, 6, 17, 18, '\f', 3, 20, 3, 65485, 65488, 20, 65485, 18, 17, 3, 5, '\f', 7, 65485, 7, 14, 65535, 65485, 11, '\r', 1, 65484, 3, 16, 65535, 19, 15, 17, 2, 16, 65535, 19, 5, 65484, 18, 17, 65535, 1, 18, 65535, 3, 16, 6, 18, 65484, 17, 2, '\f', 19, '\r', 16, 23, '\n', 7, 65535, 2, 65485}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 66, TextUtils.getTrimmedLength("") + 254, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), true, new char[]{7, 0, 65532, 2, 65535, 65532}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 108, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 207, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 111), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 35, new char[]{17, 5, 26, 20, '\n', 6, 13860, 13860, '\f', 11, 30, '\t', '#', 15, '!', '\b', 2, 20, 16, '#', 23, '\b', 23, 15, ' ', 15, 29, 17, 17, 2, 31, '\"', 5, 29, 13861, 13861}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ExpandableListView.getPackedPositionGroup(0L), 6029 - TextUtils.lastIndexOf("", '0'), Color.green(0) + 24, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 13184);
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1649;
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 26;
            byte[] bArr = $$a;
            Object[] objArr13 = new Object[1];
            c(bArr[3], (short) 187, bArr[5], objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(cLastIndexOf, longPressTimeout, minimumFlingVelocity, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char cGreen = (char) (Color.green(0) + 13183);
                int iMyPid = (Process.myPid() >> 22) + 1649;
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27;
                byte[] bArr2 = $$a;
                byte b = bArr2[5];
                Object[] objArr14 = new Object[1];
                c(b, (short) (b | 144), (byte) (-bArr2[30]), objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(cGreen, iMyPid, iIndexOf, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
            c2 = 3;
            c = 2;
        } else {
            Object[] objArr15 = new Object[1];
            a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 10, false, new char[]{65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n'}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 19, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 250, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 27, true, new char[]{19, 14, 3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r', 65531, 65506}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 19, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 254, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, -663479162};
                byte[] bArr3 = $$g;
                Object[] objArr18 = new Object[1];
                d((byte) (bArr3[34] - 1), (byte) (-bArr3[1]), bArr3[95], objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b2 = bArr3[95];
                Object[] objArr19 = new Object[1];
                d(b2, b2, bArr3[27], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char cNormalizeMetaState = (char) (13183 - KeyEvent.normalizeMetaState(0));
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 1650;
                    int trimmedLength = TextUtils.getTrimmedLength("") + 26;
                    byte[] bArr4 = $$a;
                    byte b3 = bArr4[5];
                    Object[] objArr20 = new Object[1];
                    c(b3, (short) (b3 | 144), (byte) (-bArr4[30]), objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(cNormalizeMetaState, iLastIndexOf, trimmedLength, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 30, false, new char[]{65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n'}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 87, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 206, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 6), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, new char[]{4, 29, 18, 19, '#', 11, '\n', 14, 11, 29, 29, 28, 16, 7, 13852}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char cAlpha = (char) (Color.alpha(0) + 13183);
                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1650;
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 26;
                        byte[] bArr5 = $$a;
                        byte b4 = bArr5[5];
                        Object[] objArr23 = new Object[1];
                        c(b4, (short) (b4 | 111), (byte) (-bArr5[30]), objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(cAlpha, iIndexOf2, offsetBefore, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "") + 13183);
                        int iArgb = Color.argb(0, 0, 0, 0) + 1649;
                        int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 26;
                        byte[] bArr6 = $$a;
                        Object[] objArr24 = new Object[1];
                        c(bArr6[3], (short) 187, bArr6[5], objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(cIndexOf, iArgb, offsetBefore2, -133433128, false, (String) objArr24[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf2);
                    int i6 = MediaBrowserCompatItemReceiver + 87;
                    AudioAttributesImplBaseParcelizer = i6 % 128;
                    c = 2;
                    int i7 = i6 % 2;
                    c2 = 3;
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
        int i8 = ((int[]) objArr[c2])[0];
        int i9 = ((int[]) objArr[c])[0];
        if (i9 != i8) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i9 ^ i8)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4535 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6053, TextUtils.lastIndexOf("", '0', 0) + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
            int i10 = MediaBrowserCompatItemReceiver + 11;
            AudioAttributesImplBaseParcelizer = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr25 = {-1842584390, Long.valueOf(j3), arrayList, strRemoteActionCompatParcelizer, true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) Color.red(0), 6029 - ExpandableListView.getPackedPositionChild(0L), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 24);
                byte b5 = $$g[19];
                byte b6 = (byte) (b5 + 1);
                Object[] objArr26 = new Object[1];
                d(b5, b6, (byte) (b6 | 34), objArr26);
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
        int i12 = AudioAttributesImplBaseParcelizer + 21;
        MediaBrowserCompatItemReceiver = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 84 / 0;
        }
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 91;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.RemoteActionCompatParcelizer;
        if (getsubjectstat != null) {
            getsubjectstat.AudioAttributesCompatParcelizer();
            int i4 = MediaBrowserCompatItemReceiver + 71;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 97;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = MediaBrowserCompatItemReceiver().af_();
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
        return objAf_;
    }

    private isHighlighted AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = AudioAttributesImplBaseParcelizer + 95;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted MediaBrowserCompatItemReceiver() {
        if (this.read == null) {
            synchronized (this.AudioAttributesCompatParcelizer) {
                if (this.read == null) {
                    this.read = AudioAttributesImplApi26Parcelizer();
                }
            }
        }
        return this.read;
    }

    protected final void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 71;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (!this.write) {
            this.write = true;
        }
        int i3 = AudioAttributesImplBaseParcelizer + 51;
        MediaBrowserCompatItemReceiver = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 63;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        if (i3 == 0) {
            int i4 = 6 / 0;
        }
        return RemoteActionCompatParcelizer;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 34), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 22, new char[]{20, 5, 7, 20, 31, 19, '\t', 14, 18, 19, 21, '\f', 0, 31, 25, 15, 1, 15, 28, 25, 18, 4, 23, 1, 20, 11}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((-16777200) - Color.rgb(0, 0, 0), true, new char[]{65535, '\n', 65527, 65529, 65535, 2, 6, 6, 65495, '\n', 4, 65531, '\b', '\b', 11, 65529, 4, 5}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 17, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + BZip2Constants.MAX_ALPHA_SIZE, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = AudioAttributesImplBaseParcelizer + 55;
            MediaBrowserCompatItemReceiver = i2 % 128;
            int i3 = i2 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i4 = MediaBrowserCompatItemReceiver + 57;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            try {
                if (i4 % 2 == 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - Color.alpha(0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6053, 42 - View.resolveSizeAndState(0, 0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 6030, 24 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    int i5 = 77 / 0;
                } else {
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (4536 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), (ViewConfiguration.getFadingEdgeLength() >> 16) + 6054, AndroidCharacter.getMirror('0') - 6, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(823471051);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) Drawable.resolveOpacity(0, 0), 6030 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 25, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zas.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x00c6  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r32) {
        /*
            Method dump skipped, instruction units count: 6455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zas.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 13;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
        int i4 = MediaBrowserCompatItemReceiver + 87;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
