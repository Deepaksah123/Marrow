package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
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

/* JADX INFO: loaded from: classes.dex */
public abstract class toFloat extends addObserverForBackInvoker implements SubjectStat {
    private volatile isHighlighted read;
    private getSubjectStat write;
    private static final byte[] $$l = {94, -36, -26, 62};
    private static final int $$m = 112;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {112, -40, -93, -59, -13, 1, 62, -58, -9, -1, 7, -6, 6, TarConstants.LF_FIFO, -52, -14, 9, -15, 2, 5, 4, TarConstants.LF_DIR, -64, 11, -20, 14, -14, 8, 7, -12, 61, -54, -6, -2, -8, 65, -22, -38, -2, -8, TarConstants.LF_GNUTYPE_LONGLINK, -14, 4, 8, -12, 14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -13, 1, 62, -58, -9, -1, 7, -6, 6, TarConstants.LF_FIFO, -52, -14, 9, -15, 2, 5, 4, TarConstants.LF_DIR, -64, 11, -20, 14, -14, 8, 7, -12, 61, -71, 18, -2, -18, 68, -39, -14, -2, 21, -22, -25, 9, -7, 0, 79, -79, 12, 3, -4, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$k = 227;
    private static final byte[] $$d = {34, TarConstants.LF_NORMAL, 18, 42, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 235;
    private static int AudioAttributesImplBaseParcelizer = 0;
    private static int AudioAttributesImplApi26Parcelizer = 1;
    private static char[] RemoteActionCompatParcelizer = {6416, 6428, 6464, 6417, 6475, 6427, 6477, 6488, 6522, 6474, 6493, 6423, 6421, 6426, 6523, 6481, 6524, 6466, 6490, 6425, 6420, 6471, 6494, 6478, 6422, 6489, 6429, 6525, 6473, 6476, 6407, 6468, 6424, 6418, 6469, 6491, 6402, 6507, 6492, 6406, 6505, 6465, 6430, 6520, 6470, 6431, 6403, 6467, 6479};
    private static char MediaBrowserCompatCustomActionResultReceiver = 11445;
    private static long MediaBrowserCompatItemReceiver = 4728127335934727995L;
    private final Object IconCompatParcelizer = new Object();
    private boolean AudioAttributesCompatParcelizer = false;

    private static String $$n(short s, int i, short s2) {
        int i2 = i * 2;
        int i3 = (s * 4) + 104;
        int i4 = (s2 * 3) + 4;
        byte[] bArr = $$l;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i3 = i5 + i4;
            i4++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            int i8 = i4;
            i3 += bArr[i4];
            i4 = i8 + 1;
            i6 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r0 = r6 + 4
            int r5 = 114 - r5
            int r7 = 191 - r7
            byte[] r1 = kotlin.toFloat.$$d
            byte[] r0 = new byte[r0]
            int r6 = r6 + 3
            r2 = -1
            if (r1 != 0) goto L12
            r4 = r6
            r3 = r2
            goto L25
        L12:
            r3 = r2
        L13:
            int r3 = r3 + 1
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L23:
            r4 = r1[r7]
        L25:
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + r2
            int r7 = r7 + 1
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.toFloat.g(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r7 + 5
            byte[] r1 = kotlin.toFloat.$$j
            int r8 = 119 - r8
            int r6 = 118 - r6
            byte[] r0 = new byte[r0]
            int r7 = r7 + 4
            r2 = -1
            if (r1 != 0) goto L13
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            int r3 = r3 + 1
            byte r4 = (byte) r8
            int r6 = r6 + 1
            r0[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r0, r7)
            r9[r7] = r6
            return
        L26:
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2b:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + r2
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.toFloat.h(byte, short, int, java.lang.Object[]):void");
    }

    toFloat() {
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.toFloat.2
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                toFloat.this.MediaBrowserCompatItemReceiver();
            }
        });
        int i2 = AudioAttributesImplApi26Parcelizer + 59;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    private void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 19;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        getSubjectStat getsubjectstatWrite = AudioAttributesImplBaseParcelizer().write();
        this.write = getsubjectstatWrite;
        if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
            int i4 = AudioAttributesImplBaseParcelizer + 73;
            AudioAttributesImplApi26Parcelizer = i4 % 128;
            int i5 = i4 % 2;
            getSubjectStat getsubjectstat = this.write;
            withFieldVisibility defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
            if (i5 != 0) {
                getsubjectstat.IconCompatParcelizer(defaultViewModelCreationExtras);
            } else {
                getsubjectstat.IconCompatParcelizer(defaultViewModelCreationExtras);
                throw null;
            }
        }
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(MediaBrowserCompatItemReceiver ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i3 = $11 + 41;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i5 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(MediaBrowserCompatItemReceiver)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 12424 - Color.green(0), 19 - TextUtils.lastIndexOf("", '0', 0, 0), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.indexOf("", "", 0), TextUtils.getOffsetAfter("", 0) + 1868, ((Process.getThreadPriority(0) + 20) >> 6) + 10, 1983509525, false, $$n(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                    int i6 = $10 + 61;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
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
        }
        objArr[0] = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
    }

    private static void e(int i, char[] cArr, byte b, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr2 = RemoteActionCompatParcelizer;
        Object obj2 = null;
        if (cArr2 != null) {
            int i4 = $10 + 47;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 23;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getTapTimeout() >> 16), Color.green(0) + 7015, ExpandableListView.getPackedPositionGroup(0L) + 30, -626716224, false, "o", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (Process.getGidForName("") + 1), View.MeasureSpec.getSize(0) + 7015, (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 30, -626716224, false, "o", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i6++;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver)};
        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1527982763);
        if (objRemoteActionCompatParcelizer3 == null) {
            objRemoteActionCompatParcelizer3 = startForeground.read((char) (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 7015, View.MeasureSpec.makeMeasureSpec(0, 0) + 30, -626716224, false, "o", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i8 = $11 + 41;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i10 = $10 + 81;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                needsstartedservice.AudioAttributesCompatParcelizer = 1;
            } else {
                needsstartedservice.AudioAttributesCompatParcelizer = 0;
            }
            while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                    obj = obj2;
                } else {
                    Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(105000849);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (48194 - Drawable.resolveOpacity(0, 0)), 20126 - (ViewConfiguration.getTapTimeout() >> 16), 20 - Color.green(0), 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                        Object[] objArr6 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                        Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(50135433);
                        if (objRemoteActionCompatParcelizer5 == null) {
                            objRemoteActionCompatParcelizer5 = startForeground.read((char) Color.red(0), 19368 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 18, 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).intValue();
                        int i11 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[iIntValue];
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i11];
                    } else {
                        obj = null;
                        if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                            needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                            needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                            int i12 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            int i13 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i12];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i13];
                        } else {
                            int i14 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            int i15 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i14];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i15];
                        }
                    }
                }
                needsstartedservice.AudioAttributesCompatParcelizer += 2;
                obj2 = obj;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 9;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        e(18 - View.getDefaultSize(0, 0), new char[]{30, '*', ' ', 15, 27, '#', ' ', '$', 28, '*', '$', '.', 14, 25, 5, 0, 13922, 13922}, (byte) (122 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 5, new char[]{29, 20, '\"', '0', 13891}, (byte) (69 - (ViewConfiguration.getTouchSlop() >> 8)), objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 88, new char[]{30, '*', ' ', 15, 27, '#', ' ', '$', '#', 14, 11, '#', '\'', 5, '\'', '#', 27, '$', '$', 17, 23, '\t', 20, 4, 29, 30}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 73), objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 14, new char[]{3, 11, 13895, 13895, 2, '0', '\'', ')', 13897, 13897, '\"', '&', 0, ' ', '\'', '#', 23, '*'}, (byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 94), objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i4 = AudioAttributesImplApi26Parcelizer + 23;
                AudioAttributesImplBaseParcelizer = i4 % 128;
                int i5 = i4 % 2;
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 4535), 6054 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 41 - ImageFormat.getBitsPerPixel(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    e(47 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{5, 25, 30, 25, 1, ' ', 30, 7, 0, '+', 6, 4, 2, 27, '!', 22, '\"', 4, 11, '\'', 6, 0, 24, 2, 2, 21, 0, 29, '\f', 26, 11, '\"', '\r', 20, '0', 0, 11, 2, '\n', ',', '!', 1, 5, 24, 1, 4, 27, 2}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 44), objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    e(ExpandableListView.getPackedPositionGroup(0L) + 64, new char[]{'\'', 11, 11, '\'', '*', 31, '.', '+', 24, '/', 30, '\b', '!', 18, 28, '+', '\"', 0, 31, 0, 0, 7, 2, 4, '\f', 16, 18, '!', '\n', 3, 11, '\"', 29, 4, '\f', 2, 27, '\t', 4, '!', 3, '*', '\b', 30, 30, 22, 15, '!', 31, 4, 25, '!', 17, 5, 5, 22, 2, 21, 0, 5, 27, 5, 3, '/'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 114), objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 29, new char[]{'\f', 16, 29, 30, 20, '\f', 5, 1, 13844, 13844, '!', 26, 7, '#', 13844, 13844, 7, '#', '\f', 16, '\f', 20, 6, '\f', 4, 0, 31, 1, 0, '/', 14, 5, 0, 29, '0', 3, '\"', 0, 2, 26, 20, '\f', 4, '\"', 6, 11, '!', 29, 22, '!', 21, 30, 14, '/', 6, 5, 16, '\f', 23, '\f', '+', '.', 0, 7}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 18), objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    e(67 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), new char[]{3, '%', '#', '\n', '(', 28, 13771, 13771, 30, 29, '&', '\"', 16, 19, 24, 7, '+', 30, '$', '(', '%', 3, 20, 4, 31, '#', 0, ' ', '$', '\'', ')', '.', 7, 31, 15, ' ', '\'', 21, 7, 31, 20, 4, '.', 11, 27, 28, 31, 29, '\r', '#', '\"', '%', '-', '*', 0, ')', '%', 31, 27, '\b', '\"', 2, 27, 1, '-', '%', 13823}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 13), objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1) - 49, new char[]{5402, 41275, 28821, 3214, 5411, 57525, 62436, 51290, 5044, 59689}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, new char[]{35194, 42199, 18268, 15, 35144, 58694, 50302, 50392, 36812, 60613, 52909, 52062, 33879, 59983, 55162, 53719, 39580, 61914, 53672, 55385, 37710, 65344, 55857, 57046, 43416, 50885, 58540, 58690, 44572, 52288, 60797, 60381, 42189, 52114, 63487, 61961, 48459, 53526, 61482, 63705}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getLongPressTimeout() >> 16), MotionEvent.axisFromString("") + 6031, 24 - TextUtils.indexOf("", ""), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char c = (char) ((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13183);
            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1649;
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 27;
            byte b = (byte) (-$$d[62]);
            byte b2 = (byte) (b + 3);
            Object[] objArr13 = new Object[1];
            g(b, b2, (short) (b2 | 147), objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(c, maxKeyCode, packedPositionChild, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "") + 13183);
                int i6 = (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1649;
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 26;
                Object[] objArr14 = new Object[1];
                g((byte) (-$$d[9]), r3[8], (short) 144, objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(cIndexOf, i6, packedPositionGroup, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
            int i7 = AudioAttributesImplApi26Parcelizer + 69;
            AudioAttributesImplBaseParcelizer = i7 % 128;
            int i8 = i7 % 2;
        } else {
            Object[] objArr15 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(0) - 21, new char[]{14, 31, 21, 29, '&', ' ', 30, '*', '.', ')', 15, 16, '$', '\'', '\r', ')'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 49), objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, new char[]{21598, 63215, 38920, 43452, 21559, 46891, 6957, 27954, 21162, 48806, 4540, 25253, 22806, 47150, 2107, 30772, 18333, 41888, 3756, 29113}, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, -1748320460};
                byte b3 = (byte) 115;
                byte[] bArr = $$j;
                Object[] objArr18 = new Object[1];
                h(b3, (byte) (b3 & 174), bArr[71], objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b4 = bArr[56];
                Object[] objArr19 = new Object[1];
                h((byte) 77, b4, b4, objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13182);
                    int iLastIndexOf = 1648 - TextUtils.lastIndexOf("", '0');
                    int trimmedLength = 26 - TextUtils.getTrimmedLength("");
                    Object[] objArr20 = new Object[1];
                    g((byte) (-$$d[9]), r8[8], (short) 144, objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(c2, iLastIndexOf, trimmedLength, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 13, new char[]{30, '*', ' ', 15, 27, '#', ' ', '$', 28, '*', '#', 18, 14, '$', ')', 3, 30, ')', 28, 24, 5, '.'}, (byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 116), objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(0) - 22, new char[]{3, '\"', '#', 14, ')', 0, '$', 15, 0, '\"', '&', '-', '0', ')', 13826}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 32), objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char packedPositionType = (char) (13183 - ExpandableListView.getPackedPositionType(0L));
                        int iResolveSize = 1649 - View.resolveSize(0, 0);
                        int doubleTapTimeout = 26 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        Object[] objArr23 = new Object[1];
                        g((byte) (-$$d[9]), r9[8], (short) 111, objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(packedPositionType, iResolveSize, doubleTapTimeout, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char threadPriority = (char) (13183 - ((Process.getThreadPriority(0) + 20) >> 6));
                        int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 1649;
                        int iResolveSizeAndState = 26 - View.resolveSizeAndState(0, 0, 0);
                        byte b5 = (byte) (-$$d[62]);
                        byte b6 = (byte) (b5 + 3);
                        Object[] objArr24 = new Object[1];
                        g(b5, b6, (short) (b6 | 147), objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(threadPriority, threadPriority2, iResolveSizeAndState, -133433128, false, (String) objArr24[0], null);
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
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4536 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 6053 - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.indexOf("", "") + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {1712662177, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getPressedStateDuration() >> 16), ExpandableListView.getPackedPositionType(0L) + 6030, View.MeasureSpec.getMode(0) + 24);
                Object[] objArr26 = new Object[1];
                h((byte) 73, (byte) 23, (byte) 37, objArr26);
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
        AudioAttributesImplApi26Parcelizer();
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 37;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroy();
            getSubjectStat getsubjectstat = this.write;
            if (getsubjectstat != null) {
                int i3 = AudioAttributesImplBaseParcelizer + 105;
                AudioAttributesImplApi26Parcelizer = i3 % 128;
                int i4 = i3 % 2;
                getsubjectstat.AudioAttributesCompatParcelizer();
            }
            int i5 = AudioAttributesImplApi26Parcelizer + 101;
            AudioAttributesImplBaseParcelizer = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        super.onDestroy();
        throw null;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 19;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = AudioAttributesImplBaseParcelizer().af_();
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        int i5 = AudioAttributesImplBaseParcelizer + 85;
        AudioAttributesImplApi26Parcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            return objAf_;
        }
        throw null;
    }

    private isHighlighted AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = AudioAttributesImplBaseParcelizer + 81;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            return ishighlighted;
        }
        throw null;
    }

    private isHighlighted AudioAttributesImplBaseParcelizer() {
        if (this.read == null) {
            synchronized (this.IconCompatParcelizer) {
                if (this.read == null) {
                    this.read = AudioAttributesImplApi21Parcelizer();
                }
            }
        }
        return this.read;
    }

    protected final void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 41;
        int i3 = i2 % 128;
        AudioAttributesImplBaseParcelizer = i3;
        int i4 = i2 % 2;
        if (this.AudioAttributesCompatParcelizer) {
            return;
        }
        int i5 = i3 + 101;
        AudioAttributesImplApi26Parcelizer = i5 % 128;
        int i6 = i5 % 2;
        this.AudioAttributesCompatParcelizer = true;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 9;
        AudioAttributesImplBaseParcelizer = i2 % 128;
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

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 89;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            getBaseContext();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 9, new char[]{30, '*', ' ', 15, 27, '#', ' ', '$', '#', 14, 11, '#', '\'', 5, '\'', '#', 27, '$', '$', 17, 23, '\t', 20, 4, 29, 30}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 32), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 17, new char[]{3, 11, 13895, 13895, 2, '0', '\'', ')', 13897, 13897, '\"', '&', 0, ' ', '\'', '#', 23, '*'}, (byte) (95 - KeyEvent.keyCodeFromString("")), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i3 = AudioAttributesImplBaseParcelizer + 47;
            AudioAttributesImplApi26Parcelizer = i3 % 128;
            int i4 = i3 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4534 - TextUtils.lastIndexOf("", '0', 0)), TextUtils.indexOf((CharSequence) "", '0') + 6055, 42 - Gravity.getAbsoluteGravity(0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 6030 - KeyEvent.getDeadChar(0, 0), 23 - TextUtils.lastIndexOf("", '0'), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00e0  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.toFloat.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(41:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|310|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|(29:294|32|(2:34|(2:36|(2:38|42)(1:39))(2:40|41))(1:42)|78|308|79|(3:81|303|82)|86|87|307|(4:89|90|(1:92)|93)(19:95|96|292|97|(3:99|284|100)|104|105|280|106|(2:295|108)|112|113|114|(1:116)|117|(1:119)|120|(1:122)|123)|124|(4:127|(12:129|(3:131|(4:134|(3:317|136|320)(4:316|137|138|319)|318|132)|315)|139|297|140|(1:142)|143|144|145|286|146|314)(2:161|313)|162|125)|312|163|190|(1:192)|193|(3:195|(1:197)|198)(13:200|288|201|202|(1:204)|205|299|206|207|(1:209)|210|(1:212)|213)|199|214|(6:216|217|(1:219)|220|221|222)|223|(1:225)|226|(3:228|(1:230)|231)(14:233|234|(1:236)|237|238|(1:240)|241|305|242|243|(1:245)|246|(1:248)|249)|232|250|(7:252|253|(1:255)|256|257|258|259)(1:321))|46|290|47|(1:49)|50|278|51|(1:53)|54|55|78|308|79|(0)|86|87|307|(0)(0)|124|(1:125)|312|163|190|(0)|193|(0)(0)|199|214|(0)|223|(0)|226|(0)(0)|232|250|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0ab8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0ab9, code lost:
    
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0ad8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0ad9, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0ada, code lost:
    
        r1 = r0;
        r9 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x097e A[Catch: all -> 0x0ad8, TryCatch #17 {all -> 0x0ad8, blocks: (B:79:0x0589, B:86:0x05d9, B:124:0x0974, B:125:0x0978, B:127:0x097e, B:129:0x0994, B:95:0x064d, B:114:0x079f, B:117:0x07e9, B:120:0x0915, B:123:0x096e), top: B:308:0x0589 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0b3b A[Catch: all -> 0x033c, TryCatch #18 {all -> 0x033c, blocks: (B:184:0x0b35, B:186:0x0b3b, B:187:0x0b66, B:217:0x0fbe, B:219:0x0fc4, B:220:0x0ff2, B:253:0x1442, B:255:0x1448, B:256:0x1474, B:234:0x11c9, B:236:0x11ec, B:237:0x123f, B:72:0x04c7, B:74:0x04cd, B:75:0x04f8, B:19:0x0121, B:21:0x0127, B:22:0x0154, B:24:0x02ad, B:26:0x02de, B:27:0x0336), top: B:310:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0bf4  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0c43  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0cb2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0f99  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x107e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x10cc  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x1126  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x141f  */
    /* JADX WARN: Removed duplicated region for block: B:321:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x064d A[Catch: all -> 0x0ad8, TRY_ENTER, TRY_LEAVE, TryCatch #17 {all -> 0x0ad8, blocks: (B:79:0x0589, B:86:0x05d9, B:124:0x0974, B:125:0x0978, B:127:0x097e, B:129:0x0994, B:95:0x064d, B:114:0x079f, B:117:0x07e9, B:120:0x0915, B:123:0x096e), top: B:308:0x0589 }] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v145 */
    /* JADX WARN: Type inference failed for: r6v146 */
    /* JADX WARN: Type inference failed for: r6v163 */
    /* JADX WARN: Type inference failed for: r6v164 */
    /* JADX WARN: Type inference failed for: r6v180 */
    /* JADX WARN: Type inference failed for: r6v181 */
    /* JADX WARN: Type inference failed for: r9v100 */
    /* JADX WARN: Type inference failed for: r9v101 */
    /* JADX WARN: Type inference failed for: r9v102 */
    /* JADX WARN: Type inference failed for: r9v104 */
    /* JADX WARN: Type inference failed for: r9v115 */
    /* JADX WARN: Type inference failed for: r9v119 */
    /* JADX WARN: Type inference failed for: r9v125 */
    /* JADX WARN: Type inference failed for: r9v126 */
    /* JADX WARN: Type inference failed for: r9v127 */
    /* JADX WARN: Type inference failed for: r9v128 */
    /* JADX WARN: Type inference failed for: r9v129 */
    /* JADX WARN: Type inference failed for: r9v130 */
    /* JADX WARN: Type inference failed for: r9v131 */
    /* JADX WARN: Type inference failed for: r9v132 */
    /* JADX WARN: Type inference failed for: r9v133 */
    /* JADX WARN: Type inference failed for: r9v134 */
    /* JADX WARN: Type inference failed for: r9v135 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v54, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v55 */
    /* JADX WARN: Type inference failed for: r9v56 */
    /* JADX WARN: Type inference failed for: r9v62 */
    /* JADX WARN: Type inference failed for: r9v63 */
    /* JADX WARN: Type inference failed for: r9v65 */
    /* JADX WARN: Type inference failed for: r9v95 */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r31) {
        /*
            Method dump skipped, instruction units count: 6065
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.toFloat.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 83;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
    }
}
