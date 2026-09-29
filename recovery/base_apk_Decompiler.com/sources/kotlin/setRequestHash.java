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
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
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
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setRequestHash extends addObserverForBackInvoker implements SubjectStat {
    private static short[] AudioAttributesImplApi21Parcelizer;
    private getSubjectStat IconCompatParcelizer;
    private volatile isHighlighted write;
    private static final byte[] $$c = {64, TarConstants.LF_GNUTYPE_LONGLINK, 61, -128};
    private static final int $$f = 159;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {TarConstants.LF_SYMLINK, 124, -128, 125, 57, -77, 6, -23, 35, -44, 4, -14, -6, 9, -29, -19, 0, -1, -27, -16, -10, -13, 7, 28, -42, -25, 3, -14, -7, 35, -52, -6, -11, 7, -27, 28, -25, -25, 7, -10, -15, -5, -25, 13, -21, 57, -65, -6, -23, 42, -53, 3, -29, 77, -37, -60, 9, -13, -14, 38, -59, -8, -6, 1, -1, -27, -7, 7, -22, 34, -44, -11, -4, 34, -39, -26, 6, 13, -25, -25, 7, -10, -15, -5, -25, 13, -21, -3, 1, -19, 7};
    private static final int $$h = 100;
    private static final byte[] $$a = {24, -109, -85, -94, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 141;
    private static int MediaDescriptionCompat = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RemoteActionCompatParcelizer = -303915853;
    private static int MediaBrowserCompatItemReceiver = -819363142;
    private static int AudioAttributesImplApi26Parcelizer = -1226109571;
    private static byte[] AudioAttributesImplBaseParcelizer = {-52, TarConstants.LF_SYMLINK, -50, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 79, 46, 46, -123, -56, -117, 118, 69, 70, 79, TarConstants.LF_SYMLINK, 90, 63, -106, -55, -58, -97, -95, -18, -112, -98, -58, -104, -64, -92, -9, -90, 11, -107, -102, -122, -33, -50, -49, -56, -101, -61, -104, 81, -93, -113, -115, 82, -120, 65, -93, -69, 81, -113, TarConstants.LF_GNUTYPE_SPARSE, -95, -118, 67, -101, 80, -113, 80, -68, -93, 64, -96, 81, -67, -113, -100, -115, 67, 80, -101, 85, -65, 80, -113, -94, -120, TarConstants.LF_GNUTYPE_SPARSE, -116, -68, -113, TarConstants.LF_GNUTYPE_SPARSE, -113, TarConstants.LF_GNUTYPE_SPARSE, -104, 85, -68, -16, 74, -124, -90, 90, 91, -86, -9, -11, 95, -116, -11, 95, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -115, 72, -121, 79, -10, -12, -10, -81, 91, -116, 89, -11, 72, -121, -91, -86, -16, -12, 90, 95, 90, -115, 91, -12, TarConstants.LF_GNUTYPE_LONGLINK, -83, -15, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -10, 89, -68, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -16, -81, -90, -121, -11, 74, 90, -87, -10, 91, 91, -94, -82, -13, 73, -12, -121, -87, TarConstants.LF_SYMLINK, 59, -103, -61, -30, -105, 104, 113, 109, TarConstants.LF_CHR, 58, -86, -85, 63, -18, -14, -85, 57, -26, -10, -86, 56, -17, -5, -91, -61, -104, TarConstants.LF_NORMAL, -86, 57, -90, -61, -104, 58, -21, 110, TarConstants.LF_CHR, -58, -86, -103, -59, -88, -91, 62, -96, 114, 109, 57, -94, -85, TarConstants.LF_SYMLINK, -105, -85, 39, TarConstants.LF_DIR, 60, -105, -17, TarConstants.LF_BLK, -81, -15, TarConstants.LF_DIR, -88, TarConstants.LF_BLK, 56, -46, 13, 34, 27, -45, 104, 56, -35, 1, 60, 1, 41, 85, 104, 2, 57, -58, 96, -45, 104, -44, -33, 31, 56, 4, 56, -37, 86, -46, 87, 86, 87, 13, 33, 87, 36, 93, 45, 86, 2, 1, 99, 85, 57, 81, 42, 121, 71, TarConstants.LF_LINK, TarConstants.LF_GNUTYPE_SPARSE, -111, 71, 69, -108, -97, 70, -97, 89, -112, 92, -73, -73, -73, -73, -73, -73, -73, -73};
    private static char[] MediaBrowserCompatCustomActionResultReceiver = {6490, 6522, 6431, 6474, 6428, 6417, 6430, 6473, 6426, 6496, 6478, 6523, 6465, 6429, 6488, 6481, 6507, 6467, 6425, 6505, 6471, 6406, 6492, 6424, 6469, 6476, 6491, 6464, 6468, 6427, 6493, 6470, 6525, 6477, 6416, 6475};
    private static char MediaMetadataCompat = 11444;
    private final Object AudioAttributesCompatParcelizer = new Object();
    private boolean read = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(short r6, byte r7, short r8) {
        /*
            byte[] r0 = kotlin.setRequestHash.$$c
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r6 = r6 * 2
            int r6 = 112 - r6
            int r7 = r7 * 2
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2b:
            int r8 = -r8
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setRequestHash.$$i(short, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0022). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 65
            int r6 = r6 + 4
            int r8 = 44 - r8
            byte[] r0 = kotlin.setRequestHash.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r8
            r4 = r2
            goto L22
        L10:
            r3 = r2
        L11:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L20:
            r3 = r0[r6]
        L22:
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            int r6 = r6 + 1
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setRequestHash.c(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            byte[] r0 = kotlin.setRequestHash.$$g
            int r1 = 43 - r7
            int r8 = 119 - r8
            byte[] r1 = new byte[r1]
            int r7 = 42 - r7
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2b
        L13:
            r3 = r2
        L14:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2b:
            int r3 = -r3
            int r6 = r6 + 1
            int r8 = r8 + r3
            int r8 = r8 + (-8)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setRequestHash.d(byte, short, short, java.lang.Object[]):void");
    }

    setRequestHash() {
        AudioAttributesImplBaseParcelizer();
    }

    private void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.setRequestHash.2
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                setRequestHash.this.MediaBrowserCompatItemReceiver();
            }
        });
        int i2 = MediaDescriptionCompat + 125;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        this.IconCompatParcelizer = AudioAttributesImplApi26Parcelizer().write();
        if (!(!r1.RemoteActionCompatParcelizer())) {
            int i2 = MediaDescriptionCompat + 51;
            MediaBrowserCompatMediaItem = i2 % 128;
            if (i2 % 2 == 0) {
                this.IconCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
                throw null;
            }
            this.IconCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            int i3 = MediaDescriptionCompat + 125;
            MediaBrowserCompatMediaItem = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = MediaBrowserCompatMediaItem + 101;
        MediaDescriptionCompat = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0244  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r24, int r25, int r26, short r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setRequestHash.a(byte, int, int, short, int, java.lang.Object[]):void");
    }

    private static void b(byte b, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr2 = MediaBrowserCompatCustomActionResultReceiver;
        float f = BitmapDescriptorFactory.HUE_RED;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (1 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1))), 7015 - KeyEvent.keyCodeFromString(""), 30 - Color.blue(0), -626716224, false, "o", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i4++;
                    f = BitmapDescriptorFactory.HUE_RED;
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
        Object[] objArr3 = {Integer.valueOf(MediaMetadataCompat)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) View.MeasureSpec.getSize(0), TextUtils.getOffsetBefore("", 0) + 7015, 30 - View.combineMeasuredStates(0, 0), -626716224, false, "o", new Class[]{Integer.TYPE});
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
                int i5 = $10 + 105;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                    int i7 = $10 + 99;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write / b);
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.RemoteActionCompatParcelizer * b);
                    } else {
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                    }
                    obj = obj2;
                } else {
                    Object[] objArr4 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(105000849);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (View.MeasureSpec.getMode(0) + 48194), 20126 - (ViewConfiguration.getFadingEdgeLength() >> 16), 20 - (ViewConfiguration.getTapTimeout() >> 16), 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                        int i8 = $11 + 35;
                        $10 = i8 % 128;
                        int i9 = i8 % 2;
                        Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(50135433);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) View.MeasureSpec.getMode(0), 19368 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 17, 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                        int i10 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[iIntValue];
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i10];
                    } else {
                        obj = null;
                        if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                            needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                            needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                            int i11 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            int i12 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i11];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i12];
                        } else {
                            int i13 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            int i14 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i13];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i14];
                        }
                    }
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
        int i = 2 % 2;
        Object obj = null;
        Object[] objArr2 = new Object[1];
        a((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 97), (-2042793882) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1), (-583736872) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1) + 22), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 44, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 12), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 4, new char[]{27, '\f', 30, 14, 13845}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i2 = MediaDescriptionCompat + 43;
                MediaBrowserCompatMediaItem = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr4 = new Object[1];
                a((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 81), (-2042793834) - ImageFormat.getBitsPerPixel(0), (-583736819) - TextUtils.getOffsetBefore("", 0), (short) ((-81) - TextUtils.lastIndexOf("", '0', 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 3, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                b((byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 46), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 93, new char[]{30, 31, 13847, 13847, '\"', ' ', 23, 20, 13849, 13849, 24, 16, 31, 11, 18, 16, 19, ' '}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i4 = MediaDescriptionCompat + 39;
                MediaBrowserCompatMediaItem = i4 % 128;
                if (i4 % 2 == 0) {
                    boolean z = baseContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                    baseContext = null;
                } else {
                    baseContext = baseContext.getApplicationContext();
                    int i5 = MediaDescriptionCompat + 7;
                    MediaBrowserCompatMediaItem = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
            if (baseContext != null) {
                int i7 = MediaBrowserCompatMediaItem + 115;
                MediaDescriptionCompat = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - ExpandableListView.getPackedPositionGroup(0L)), (ViewConfiguration.getEdgeSlop() >> 16) + 6054, 42 - TextUtils.getOffsetBefore("", 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    a((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 136), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 2042793950, (ViewConfiguration.getFadingEdgeLength() >> 16) - 583736794, (short) (112 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 35 - (ViewConfiguration.getEdgeSlop() >> 16), objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    a((byte) (43 - ExpandableListView.getPackedPositionGroup(0L)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 2042793886, (-583736747) - (ViewConfiguration.getEdgeSlop() >> 16), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 59), 51 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 33), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 60, new char[]{0, 21, '\r', 31, 20, 6, 30, '#', 13824, 13824, '\f', 19, 31, '\n', 13824, 13824, 31, '\n', 0, 21, 6, 20, 26, 11, 3, '#', 29, 1, 24, 11, 22, 30, 1, '\n', 3, ' ', '\t', 31, 28, 11, 20, 6, '#', 21, ' ', 11, 19, 11, 19, 31, 11, '\b', 24, '\f', '#', 5, 21, 0, 15, 1, '\b', 0, '\n', 30}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    a((byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 49), (ViewConfiguration.getTapTimeout() >> 16) - 2042793826, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 583736688, (short) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 82), (ViewConfiguration.getEdgeSlop() >> 16) + 54, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 7), 6 - TextUtils.indexOf("", ""), new char[]{3, 23, 22, 0, 20, '\t'}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    a((byte) (67 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(3) - 2042793980, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 583736667, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 45), 23 - KeyEvent.keyCodeFromString(""), objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6029, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 24, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char cIndexOf = (char) (13183 - TextUtils.indexOf("", "", 0, 0));
            int jumpTapTimeout = 1649 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            int iIndexOf = 26 - TextUtils.indexOf("", "", 0, 0);
            byte[] bArr = $$a;
            byte b = bArr[5];
            Object[] objArr13 = new Object[1];
            c(b, (byte) (-bArr[140]), b, objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(cIndexOf, jumpTapTimeout, iIndexOf, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char cMyTid = (char) ((Process.myTid() >> 22) + 13183);
                int iResolveSize = 1649 - View.resolveSize(0, 0);
                int iIndexOf2 = 26 - TextUtils.indexOf("", "", 0, 0);
                byte[] bArr2 = $$a;
                Object[] objArr14 = new Object[1];
                c((short) (-bArr2[27]), bArr2[5], (byte) (-bArr2[30]), objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(cMyTid, iResolveSize, iIndexOf2, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            a((byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 94), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 2042793834, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 583736593, (short) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 61), View.MeasureSpec.getSize(0) + 3, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 13), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 20, new char[]{'\r', 24, '\"', ' ', 18, 16, 21, 16, '\n', '\b', 27, 28, 14, 22, 27, 31}, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i9 = MediaDescriptionCompat + 125;
            MediaBrowserCompatMediaItem = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, 142597046};
                byte[] bArr3 = $$g;
                Object[] objArr18 = new Object[1];
                d(bArr3[16], bArr3[23], (byte) (-bArr3[61]), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                d((byte) (-bArr3[11]), (byte) (-bArr3[40]), (byte) (-bArr3[54]), objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char mirror = (char) (AndroidCharacter.getMirror('0') + 13135);
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 1649;
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 26;
                    byte[] bArr4 = $$a;
                    Object[] objArr20 = new Object[1];
                    c((short) (-bArr4[27]), bArr4[5], (byte) (-bArr4[30]), objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(mirror, iResolveOpacity, maximumDrawingCacheSize, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    b((byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 71), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 12, new char[]{'\r', 1, 24, 1, 18, 14, 27, 19, 26, ' ', 23, '\t', 14, 27, 21, '\"', 28, '\f', 26, 22, 5, 23}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    b((byte) ((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 103), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, new char[]{'\"', 27, '\b', '\r', 27, ' ', 31, 7, 31, '\t', '\"', 28, 18, 30, 13926}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char defaultSize = (char) (View.getDefaultSize(0, 0) + 13183);
                        int iIndexOf3 = 1649 - TextUtils.indexOf("", "");
                        int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 26;
                        byte[] bArr5 = $$a;
                        byte b2 = bArr5[5];
                        byte b3 = (byte) (-bArr5[30]);
                        Object[] objArr23 = new Object[1];
                        c((short) 76, b2, b3, objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(defaultSize, iIndexOf3, iResolveOpacity2, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char trimmedLength = (char) (13183 - TextUtils.getTrimmedLength(""));
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1649;
                        int tapTimeout = 26 - (ViewConfiguration.getTapTimeout() >> 16);
                        byte[] bArr6 = $$a;
                        byte b4 = bArr6[5];
                        Object[] objArr24 = new Object[1];
                        c(b4, (byte) (-bArr6[140]), b4, objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(trimmedLength, keyRepeatTimeout, tapTimeout, -133433128, false, (String) objArr24[0], null);
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
            long j2 = 0;
            long j3 = (((long) (i12 ^ i11)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4534 - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6054, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {663977759, Long.valueOf(j3), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getTouchSlop() >> 8), 6030 - View.getDefaultSize(0, 0), TextUtils.getTrimmedLength("") + 24);
                byte[] bArr7 = $$g;
                Object[] objArr26 = new Object[1];
                d((byte) (-bArr7[11]), (byte) (-bArr7[40]), (byte) (-bArr7[54]), objArr26);
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
        MediaBrowserCompatCustomActionResultReceiver();
        int i13 = MediaBrowserCompatMediaItem + 15;
        MediaDescriptionCompat = i13 % 128;
        int i14 = i13 % 2;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.IconCompatParcelizer;
        if (getsubjectstat != null) {
            getsubjectstat.AudioAttributesCompatParcelizer();
            int i2 = MediaBrowserCompatMediaItem + 7;
            MediaDescriptionCompat = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 4 % 2;
            }
        }
        int i4 = MediaDescriptionCompat + 93;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 93;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        isHighlighted ishighlightedAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        if (i3 == 0) {
            return ishighlightedAudioAttributesImplApi26Parcelizer.af_();
        }
        ishighlightedAudioAttributesImplApi26Parcelizer.af_();
        throw null;
    }

    private isHighlighted AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaDescriptionCompat + 11;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted AudioAttributesImplApi26Parcelizer() {
        if (this.write == null) {
            synchronized (this.AudioAttributesCompatParcelizer) {
                if (this.write == null) {
                    this.write = AudioAttributesImplApi21Parcelizer();
                }
            }
        }
        return this.write;
    }

    protected final void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        if (!this.read) {
            int i2 = MediaDescriptionCompat + 67;
            MediaBrowserCompatMediaItem = i2 % 128;
            if (i2 % 2 == 0) {
                this.read = true;
            } else {
                this.read = true;
            }
        }
        int i3 = MediaBrowserCompatMediaItem + 9;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 47;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        if (i3 != 0) {
            return getNextPercentile.RemoteActionCompatParcelizer(this, defaultViewModelProviderFactory);
        }
        getNextPercentile.RemoteActionCompatParcelizer(this, defaultViewModelProviderFactory);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0109  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setRequestHash.onResume():void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            a((byte) ((-46) - View.combineMeasuredStates(0, 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 2042793868, (-583736819) - (ViewConfiguration.getWindowTouchSlop() >> 8), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) - 116), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 33, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b((byte) (47 - Color.argb(0, 0, 0, 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 18, new char[]{30, 31, 13847, 13847, '\"', ' ', 23, 20, 13849, 13849, 24, 16, 31, 11, 18, 16, 19, ' '}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i2 = MediaBrowserCompatMediaItem + 31;
            MediaDescriptionCompat = i2 % 128;
            int i3 = i2 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (View.getDefaultSize(0, 0) + 4535), (ViewConfiguration.getFadingEdgeLength() >> 16) + 6054, 42 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 6030 - (ViewConfiguration.getPressedStateDuration() >> 16), KeyEvent.normalizeMetaState(0) + 24, -861814097, false, "read", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                int i4 = MediaBrowserCompatMediaItem + 67;
                MediaDescriptionCompat = i4 % 128;
                int i5 = i4 % 2;
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

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Context applicationContext;
        String strValueOf;
        String strValueOf2;
        Object[] objArr;
        Object[] objArr2;
        List<Object[]> list;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 87;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object[] objArr3 = new Object[1];
        a((byte) ((Process.myPid() >> 22) - 62), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 2042793843, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 583736840, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 61), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 1, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 19), (-16777211) - Color.rgb(0, 0, 0), new char[]{27, '\f', 30, 14, 13845}, objArr4);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            if (context != null) {
                int i4 = MediaDescriptionCompat + 25;
                MediaBrowserCompatMediaItem = i4 % 128;
                if (i4 % 2 == 0) {
                    boolean z = context instanceof ContextWrapper;
                    throw null;
                }
                applicationContext = ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext();
            } else {
                applicationContext = context;
            }
            if (applicationContext != null) {
                int i5 = MediaBrowserCompatMediaItem + 57;
                MediaDescriptionCompat = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4534 - Process.getGidForName("")), TextUtils.getOffsetAfter("", 0) + 6054, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr5 = new Object[1];
                    a((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) - 136), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 2042793831, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 583736798, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 108), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, objArr5);
                    String str = (String) objArr5[0];
                    Object[] objArr6 = new Object[1];
                    a((byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 42), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 2042793991, (-583736746) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 34), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 41, objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 33), 64 - (ViewConfiguration.getLongPressTimeout() >> 16), new char[]{0, 21, '\r', 31, 20, 6, 30, '#', 13824, 13824, '\f', 19, 31, '\n', 13824, 13824, 31, '\n', 0, 21, 6, 20, 26, 11, 3, '#', 29, 1, 24, 11, 22, 30, 1, '\n', 3, ' ', '\t', 31, 28, 11, 20, 6, '#', 21, ' ', 11, 19, 11, 19, 31, 11, '\b', 24, '\f', '#', 5, 21, 0, 15, 1, '\b', 0, '\n', 30}, objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    a((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 64), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 2042793862, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 583736685, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 116), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 19, objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 7), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 2, new char[]{3, 23, 22, 0, 20, '\t'}, objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    a((byte) (67 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 2042793915, TextUtils.indexOf((CharSequence) "", '0') - 583736617, (short) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 36), (ViewConfiguration.getEdgeSlop() >> 16) + 23, objArr10);
                    Object[] objArr11 = {applicationContext, str, str2, str3, str4, true, str5, (String) objArr10[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) View.MeasureSpec.getMode(0), (ViewConfiguration.getScrollBarSize() >> 8) + 6030, 24 - View.MeasureSpec.makeMeasureSpec(0, 0), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
                applicationContext2 = ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : context.getApplicationContext();
            } catch (Throwable th2) {
                Object[] objArr12 = new Object[1];
                a((byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 104), (-2042793874) - KeyEvent.normalizeMetaState(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 583736617, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 107), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 111, objArr12);
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
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (((Process.getThreadPriority(0) + 20) >> 6) + 4535), 6054 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                try {
                    Object[] objArr13 = {334186470, 81604378625L, arrayList, TrainingApplication.RemoteActionCompatParcelizer(), false};
                    Class cls2 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6030, 24 - View.resolveSize(0, 0));
                    byte[] bArr = $$g;
                    Object[] objArr14 = new Object[1];
                    d((byte) (-bArr[11]), (byte) (-bArr[40]), (byte) (-bArr[54]), objArr14);
                    cls2.getMethod((String) objArr14[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr13);
                } catch (Throwable th3) {
                    Throwable cause2 = th3.getCause();
                    if (cause2 == null) {
                        throw th3;
                    }
                    throw cause2;
                }
            }
        }
        try {
            Object[] objArr15 = {334186470};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1128409246);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) Color.argb(0, 0, 0, 0), 1991 - (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.getTrimmedLength("") + 12, -1024191497, false, null, new Class[]{Integer.TYPE});
            }
            try {
                Object[] objArr16 = {applicationContext2, ((Constructor) objRemoteActionCompatParcelizer4).newInstance(objArr15)};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(352975618);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 19324);
                    int i7 = 2760 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int packedPositionChild2 = 98 - ExpandableListView.getPackedPositionChild(0L);
                    byte[] bArr2 = $$a;
                    Object[] objArr17 = new Object[1];
                    c((short) (-bArr2[1]), (byte) (bArr2[29] - 1), (byte) (-bArr2[45]), objArr17);
                    objRemoteActionCompatParcelizer5 = startForeground.read(packedPositionChild, i7, packedPositionChild2, 1799372695, false, (String) objArr17[0], new Class[]{Context.class, (Class) startForeground.IconCompatParcelizer((char) (9580 - Color.blue(0)), 3446 - View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.lastIndexOf("", '0', 0) + 145)});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr16);
                try {
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-18205161);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 61147);
                        int iCombineMeasuredStates = 2145 - View.combineMeasuredStates(0, 0);
                        int iIndexOf = 11 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        Object[] objArr18 = new Object[1];
                        c((short) ($$b - 5), $$a[9], (byte) 40, objArr18);
                        objRemoteActionCompatParcelizer6 = startForeground.read(c, iCombineMeasuredStates, iIndexOf, -2136739198, false, (String) objArr18[0], null);
                    }
                    if (((Field) objRemoteActionCompatParcelizer6).getLong(null) != -1) {
                        int i8 = MediaBrowserCompatMediaItem + 75;
                        MediaDescriptionCompat = i8 % 128;
                        if (i8 % 2 != 0) {
                            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-629126231);
                            if (objRemoteActionCompatParcelizer7 == null) {
                                char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 61148);
                                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2145;
                                int maximumFlingVelocity = 12 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                Object[] objArr19 = new Object[1];
                                c((short) ($$b - 2), (byte) (-$$a[140]), r10[14], objArr19);
                                objRemoteActionCompatParcelizer7 = startForeground.read(trimmedLength, doubleTapTimeout, maximumFlingVelocity, -1530294468, false, (String) objArr19[0], null);
                            }
                            throw null;
                        }
                        Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-629126231);
                        if (objRemoteActionCompatParcelizer8 == null) {
                            char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 61148);
                            int i9 = (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 2144;
                            int iGreen = 12 - Color.green(0);
                            Object[] objArr20 = new Object[1];
                            c((short) ($$b - 2), (byte) (-$$a[140]), r10[14], objArr20);
                            objRemoteActionCompatParcelizer8 = startForeground.read(packedPositionType, i9, iGreen, -1530294468, false, (String) objArr20[0], null);
                        }
                        list = (List) ((Field) objRemoteActionCompatParcelizer8).get(null);
                    } else {
                        Object[] objArr21 = new Object[1];
                        a((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 49), (-2042793824) - TextUtils.getOffsetBefore("", 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 583736618, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 95), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 32, objArr21);
                        Class<?> cls3 = Class.forName((String) objArr21[0]);
                        Object[] objArr22 = new Object[1];
                        b((byte) (TextUtils.lastIndexOf("", '0', 0) + 123), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 12, new char[]{'\r', 24, '\"', ' ', 18, 16, 21, 16, '\n', '\b', 27, 28, 14, 22, 27, 31}, objArr22);
                        int iIntValue2 = ((Integer) cls3.getMethod((String) objArr22[0], Object.class).invoke(null, this)).intValue();
                        try {
                            Object[] objArr23 = {334186470};
                            Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(-173351824);
                            if (objRemoteActionCompatParcelizer9 == null) {
                                objRemoteActionCompatParcelizer9 = startForeground.read((char) (Color.red(0) + 45845), 912 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1948051227, false, null, new Class[]{Integer.TYPE});
                            }
                            try {
                                Object[] objArr24 = {Integer.valueOf(iIntValue2), ((Constructor) objRemoteActionCompatParcelizer9).newInstance(objArr23)};
                                Object objRemoteActionCompatParcelizer10 = startForeground.RemoteActionCompatParcelizer(1891595430);
                                if (objRemoteActionCompatParcelizer10 == null) {
                                    char c2 = (char) (61149 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                    int iMakeMeasureSpec = 2145 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                    int capsMode = 12 - TextUtils.getCapsMode("", 0, 0);
                                    byte[] bArr3 = $$a;
                                    Object[] objArr25 = new Object[1];
                                    c((short) 168, bArr3[75], bArr3[0], objArr25);
                                    objRemoteActionCompatParcelizer10 = startForeground.read(c2, iMakeMeasureSpec, capsMode, 251047987, false, (String) objArr25[0], new Class[]{Integer.TYPE, (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 556, 18 - (ViewConfiguration.getScrollDefaultDelay() >> 16))});
                                }
                                list = (List) ((Method) objRemoteActionCompatParcelizer10).invoke(null, objArr24);
                                Object objRemoteActionCompatParcelizer11 = startForeground.RemoteActionCompatParcelizer(-629126231);
                                if (objRemoteActionCompatParcelizer11 == null) {
                                    char packedPositionType2 = (char) (61148 - ExpandableListView.getPackedPositionType(0L));
                                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2145;
                                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 12;
                                    Object[] objArr26 = new Object[1];
                                    c((short) ($$b - 2), (byte) (-$$a[140]), r10[14], objArr26);
                                    objRemoteActionCompatParcelizer11 = startForeground.read(packedPositionType2, fadingEdgeLength, maxKeyCode, -1530294468, false, (String) objArr26[0], null);
                                }
                                ((Field) objRemoteActionCompatParcelizer11).set(null, list);
                                Object[] objArr27 = new Object[1];
                                b((byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 71), View.combineMeasuredStates(0, 0) + 22, new char[]{'\r', 1, 24, 1, 18, 14, 27, 19, 26, ' ', 23, '\t', 14, 27, 21, '\"', 28, '\f', 26, 22, 5, 23}, objArr27);
                                Class<?> cls4 = Class.forName((String) objArr27[0]);
                                Object[] objArr28 = new Object[1];
                                b((byte) (TextUtils.getOffsetAfter("", 0) + 103), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 96, new char[]{'\"', 27, '\b', '\r', 27, ' ', 31, 7, 31, '\t', '\"', 28, 18, 30, 13926}, objArr28);
                                long jLongValue = ((Long) cls4.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue);
                                Object objRemoteActionCompatParcelizer12 = startForeground.RemoteActionCompatParcelizer(301834150);
                                if (objRemoteActionCompatParcelizer12 == null) {
                                    char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 61148);
                                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2145;
                                    int scrollBarSize = 12 - (ViewConfiguration.getScrollBarSize() >> 8);
                                    byte[] bArr4 = $$a;
                                    Object[] objArr29 = new Object[1];
                                    c((short) (-bArr4[1]), (byte) (bArr4[29] - 1), (byte) (-bArr4[45]), objArr29);
                                    objRemoteActionCompatParcelizer12 = startForeground.read(cIndexOf, maximumDrawingCacheSize, scrollBarSize, 1874090803, false, (String) objArr29[0], null);
                                }
                                ((Field) objRemoteActionCompatParcelizer12).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                                Object objRemoteActionCompatParcelizer13 = startForeground.RemoteActionCompatParcelizer(-18205161);
                                if (objRemoteActionCompatParcelizer13 == null) {
                                    char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 61148);
                                    int packedPositionChild3 = 2144 - ExpandableListView.getPackedPositionChild(0L);
                                    int packedPositionChild4 = ExpandableListView.getPackedPositionChild(0L) + 13;
                                    Object[] objArr30 = new Object[1];
                                    c((short) ($$b - 5), $$a[9], (byte) 40, objArr30);
                                    objRemoteActionCompatParcelizer13 = startForeground.read(longPressTimeout, packedPositionChild3, packedPositionChild4, -2136739198, false, (String) objArr30[0], null);
                                }
                                ((Field) objRemoteActionCompatParcelizer13).set(null, lValueOf2);
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
                    for (Object[] objArr31 : list) {
                        int i10 = ((int[]) objArr31[3])[0];
                        int i11 = ((int[]) objArr31[1])[0];
                        if (i11 != i10) {
                            ArrayList arrayList2 = new ArrayList();
                            String[] strArr = (String[]) objArr31[2];
                            if (strArr != null) {
                                int i12 = MediaDescriptionCompat + 113;
                                MediaBrowserCompatMediaItem = i12 % 128;
                                for (int i13 = i12 % 2 == 0 ? 1 : 0; i13 < strArr.length; i13++) {
                                    arrayList2.add(strArr[i13]);
                                }
                            }
                            long j = -1;
                            long j2 = ((long) (i11 ^ i10)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
                            long j3 = 0;
                            long j4 = j2 | (((long) 10) << 32) | (j3 - ((j3 >> 63) << 32));
                            try {
                                Object objRemoteActionCompatParcelizer14 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                                if (objRemoteActionCompatParcelizer14 == null) {
                                    objRemoteActionCompatParcelizer14 = startForeground.read((char) (4535 - KeyEvent.keyCodeFromString("")), 6055 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 42 - Color.green(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                                }
                                Object objInvoke3 = ((Method) objRemoteActionCompatParcelizer14).invoke(null, null);
                                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                                int i14 = MediaDescriptionCompat + 117;
                                int i15 = i14 % 128;
                                MediaBrowserCompatMediaItem = i15;
                                int i16 = i14 % 2;
                                int i17 = i15 + 105;
                                MediaDescriptionCompat = i17 % 128;
                                int i18 = i17 % 2;
                                try {
                                    Object[] objArr32 = {334186470, Long.valueOf(j4), arrayList2, strRemoteActionCompatParcelizer, false};
                                    Class cls5 = (Class) startForeground.IconCompatParcelizer((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6030, 24 - Color.blue(0));
                                    byte[] bArr5 = $$g;
                                    Object[] objArr33 = new Object[1];
                                    d((byte) (-bArr5[11]), (byte) (-bArr5[40]), (byte) (-bArr5[54]), objArr33);
                                    cls5.getMethod((String) objArr33[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke3, objArr32);
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
                    Object[] objArr34 = new Object[1];
                    b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 49), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11, new char[]{2, '\n', 0, 5, 0, 11, '\b', 14, 0, 11, 13822}, objArr34);
                    String str7 = (String) objArr34[0];
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
                    Object objRemoteActionCompatParcelizer15 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer15 == null) {
                        objRemoteActionCompatParcelizer15 = startForeground.read((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4535), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6054, ExpandableListView.getPackedPositionGroup(0L) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke4 = ((Method) objRemoteActionCompatParcelizer15).invoke(null, null);
                    Object[] objArr35 = {334186470, 81604378625L, arrayList3, TrainingApplication.RemoteActionCompatParcelizer(), false};
                    Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (Process.myPid() >> 22), 6030 - Color.argb(0, 0, 0, 0), 24 - Color.green(0));
                    byte[] bArr6 = $$g;
                    Object[] objArr36 = new Object[1];
                    d((byte) (-bArr6[11]), (byte) (-bArr6[40]), (byte) (-bArr6[54]), objArr36);
                    cls6.getMethod((String) objArr36[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke4, objArr35);
                }
                Object objRemoteActionCompatParcelizer16 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                if (objRemoteActionCompatParcelizer16 == null) {
                    char cGreen = (char) (Color.green(0) + 13183);
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 1649;
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26;
                    byte[] bArr7 = $$a;
                    byte b = bArr7[5];
                    Object[] objArr37 = new Object[1];
                    c(b, (byte) (-bArr7[140]), b, objArr37);
                    objRemoteActionCompatParcelizer16 = startForeground.read(cGreen, edgeSlop, scrollBarFadeDuration, -133433128, false, (String) objArr37[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer16).getLong(null) != -1) {
                    int i19 = MediaBrowserCompatMediaItem + 27;
                    MediaDescriptionCompat = i19 % 128;
                    if (i19 % 2 != 0) {
                        Object objRemoteActionCompatParcelizer17 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                        if (objRemoteActionCompatParcelizer17 == null) {
                            char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 13183);
                            int i20 = 1650 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            int i21 = 27 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            byte[] bArr8 = $$a;
                            Object[] objArr38 = new Object[1];
                            c((short) (-bArr8[27]), bArr8[5], (byte) (-bArr8[30]), objArr38);
                            objRemoteActionCompatParcelizer17 = startForeground.read(keyRepeatDelay, i20, i21, -1033747278, false, (String) objArr38[0], null);
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    Object objRemoteActionCompatParcelizer18 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                    if (objRemoteActionCompatParcelizer18 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 13184);
                        int iCombineMeasuredStates2 = 1649 - View.combineMeasuredStates(0, 0);
                        int minimumFlingVelocity = 26 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        byte[] bArr9 = $$a;
                        Object[] objArr39 = new Object[1];
                        c((short) (-bArr9[27]), bArr9[5], (byte) (-bArr9[30]), objArr39);
                        objRemoteActionCompatParcelizer18 = startForeground.read(cLastIndexOf, iCombineMeasuredStates2, minimumFlingVelocity, -1033747278, false, (String) objArr39[0], null);
                    }
                    objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer18).get(null);
                } else {
                    Object[] objArr40 = new Object[1];
                    a((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 85), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 2042793828, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 583736584, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 70), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 32, objArr40);
                    Class<?> cls7 = Class.forName((String) objArr40[0]);
                    Object[] objArr41 = new Object[1];
                    b((byte) (122 - TextUtils.indexOf("", "", 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 12, new char[]{'\r', 24, '\"', ' ', 18, 16, 21, 16, '\n', '\b', 27, 28, 14, 22, 27, 31}, objArr41);
                    try {
                        Object[] objArr42 = {Integer.valueOf(((Integer) cls7.getMethod((String) objArr41[0], Object.class).invoke(null, this)).intValue()), 0, -1151242046};
                        byte[] bArr10 = $$g;
                        Object[] objArr43 = new Object[1];
                        d((byte) (bArr10[49] - 1), bArr10[16], (byte) (-bArr10[61]), objArr43);
                        Class<?> cls8 = Class.forName((String) objArr43[0]);
                        Object[] objArr44 = new Object[1];
                        d((byte) 83, bArr10[59], bArr10[16], objArr44);
                        objArr = (Object[]) cls8.getMethod((String) objArr44[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr42);
                        Object objRemoteActionCompatParcelizer19 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                        if (objRemoteActionCompatParcelizer19 == null) {
                            char offsetAfter = (char) (13183 - TextUtils.getOffsetAfter("", 0));
                            int iAxisFromString = 1648 - MotionEvent.axisFromString("");
                            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 26;
                            byte[] bArr11 = $$a;
                            Object[] objArr45 = new Object[1];
                            c((short) (-bArr11[27]), bArr11[5], (byte) (-bArr11[30]), objArr45);
                            objRemoteActionCompatParcelizer19 = startForeground.read(offsetAfter, iAxisFromString, pressedStateDuration, -1033747278, false, (String) objArr45[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer19).set(null, objArr);
                        try {
                            Object[] objArr46 = new Object[1];
                            b((byte) (73 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getTouchSlop() >> 8) + 22, new char[]{'\r', 1, 24, 1, 18, 14, 27, 19, 26, ' ', 23, '\t', 14, 27, 21, '\"', 28, '\f', 26, 22, 5, 23}, objArr46);
                            Class<?> cls9 = Class.forName((String) objArr46[0]);
                            Object[] objArr47 = new Object[1];
                            b((byte) (103 - Color.argb(0, 0, 0, 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, new char[]{'\"', 27, '\b', '\r', 27, ' ', 31, 7, 31, '\t', '\"', 28, 18, 30, 13926}, objArr47);
                            long jLongValue2 = ((Long) cls9.getDeclaredMethod((String) objArr47[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf3 = Long.valueOf(jLongValue2);
                            Object objRemoteActionCompatParcelizer20 = startForeground.RemoteActionCompatParcelizer(2104791916);
                            if (objRemoteActionCompatParcelizer20 == null) {
                                char c3 = (char) (13184 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 1650;
                                int iRed = Color.red(0) + 26;
                                Object[] objArr48 = new Object[1];
                                c((short) 76, r10[5], (byte) (-$$a[30]), objArr48);
                                objRemoteActionCompatParcelizer20 = startForeground.read(c3, iIndexOf2, iRed, 54351865, false, (String) objArr48[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer20).set(null, lValueOf3);
                            Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                            Object objRemoteActionCompatParcelizer21 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                            if (objRemoteActionCompatParcelizer21 == null) {
                                char mode = (char) (View.MeasureSpec.getMode(0) + 13183);
                                int iLastIndexOf = 1648 - TextUtils.lastIndexOf("", '0', 0);
                                int offsetAfter2 = 26 - TextUtils.getOffsetAfter("", 0);
                                byte[] bArr12 = $$a;
                                byte b2 = bArr12[5];
                                Object[] objArr49 = new Object[1];
                                c(b2, (byte) (-bArr12[140]), b2, objArr49);
                                objRemoteActionCompatParcelizer21 = startForeground.read(mode, iLastIndexOf, offsetAfter2, -133433128, false, (String) objArr49[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer21).set(null, lValueOf4);
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
                int i22 = ((int[]) objArr[3])[0];
                int i23 = ((int[]) objArr[2])[0];
                if (i23 != i22) {
                    long j5 = -1;
                    long j6 = 0;
                    long j7 = (((long) (i23 ^ i22)) & ((((long) 0) << 32) | (j5 - ((j5 >> 63) << 32)))) | (((long) 2) << 32) | (j6 - ((j6 >> 63) << 32));
                    Object objRemoteActionCompatParcelizer22 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer22 == null) {
                        objRemoteActionCompatParcelizer22 = startForeground.read((char) (4535 - (ViewConfiguration.getTouchSlop() >> 8)), 6054 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 42 - (ViewConfiguration.getTouchSlop() >> 8), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke5 = ((Method) objRemoteActionCompatParcelizer22).invoke(null, null);
                    Object[] objArr50 = {334186470, Long.valueOf(j7), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls10 = (Class) startForeground.IconCompatParcelizer((char) TextUtils.getTrimmedLength(""), TextUtils.lastIndexOf("", '0') + 6031, 24 - (ViewConfiguration.getScrollBarSize() >> 8));
                    byte[] bArr13 = $$g;
                    Object[] objArr51 = new Object[1];
                    d((byte) (-bArr13[11]), (byte) (-bArr13[40]), (byte) (-bArr13[54]), objArr51);
                    cls10.getMethod((String) objArr51[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke5, objArr50);
                }
                Object objRemoteActionCompatParcelizer23 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                if (objRemoteActionCompatParcelizer23 == null) {
                    char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                    int iIndexOf3 = 943 - TextUtils.indexOf("", "");
                    int i24 = (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 36;
                    Object[] objArr52 = new Object[1];
                    c((short) ($$b - 5), $$a[9], (byte) 40, objArr52);
                    objRemoteActionCompatParcelizer23 = startForeground.read(modifierMetaStateMask, iIndexOf3, i24, -167186806, false, (String) objArr52[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer23).getLong(null) != -1) {
                    int i25 = MediaDescriptionCompat + 77;
                    MediaBrowserCompatMediaItem = i25 % 128;
                    if (i25 % 2 == 0) {
                        Object objRemoteActionCompatParcelizer24 = startForeground.RemoteActionCompatParcelizer(-757676623);
                        if (objRemoteActionCompatParcelizer24 == null) {
                            char c4 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            int gidForName = 942 - Process.getGidForName("");
                            int deadChar = 36 - KeyEvent.getDeadChar(0, 0);
                            Object[] objArr53 = new Object[1];
                            c((short) ($$b - 2), (byte) (-$$a[140]), r5[14], objArr53);
                            objRemoteActionCompatParcelizer24 = startForeground.read(c4, gidForName, deadChar, -1398865628, false, (String) objArr53[0], null);
                        }
                        objArr2 = (Object[]) ((Field) objRemoteActionCompatParcelizer24).get(null);
                        int i26 = 28 / 0;
                    } else {
                        Object objRemoteActionCompatParcelizer25 = startForeground.RemoteActionCompatParcelizer(-757676623);
                        if (objRemoteActionCompatParcelizer25 == null) {
                            char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                            int i27 = 942 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 36;
                            Object[] objArr54 = new Object[1];
                            c((short) ($$b - 2), (byte) (-$$a[140]), r5[14], objArr54);
                            objRemoteActionCompatParcelizer25 = startForeground.read(cAxisFromString, i27, keyRepeatDelay2, -1398865628, false, (String) objArr54[0], null);
                        }
                        objArr2 = (Object[]) ((Field) objRemoteActionCompatParcelizer25).get(null);
                    }
                } else {
                    Object[] objArr55 = new Object[1];
                    a((byte) ((ViewConfiguration.getTapTimeout() >> 16) + 95), (ViewConfiguration.getJumpTapTimeout() >> 16) - 2042793824, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 583736584, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 64), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 2, objArr55);
                    Class<?> cls11 = Class.forName((String) objArr55[0]);
                    Object[] objArr56 = new Object[1];
                    b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(3) + 22), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 19, new char[]{'\r', 24, '\"', ' ', 18, 16, 21, 16, '\n', '\b', 27, 28, 14, 22, 27, 31}, objArr56);
                    Object[] objArr57 = {Integer.valueOf(((Integer) cls11.getMethod((String) objArr56[0], Object.class).invoke(null, this)).intValue()), 0, -1000030701};
                    Object objRemoteActionCompatParcelizer26 = startForeground.RemoteActionCompatParcelizer(-21191141);
                    if (objRemoteActionCompatParcelizer26 == null) {
                        char c5 = (char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                        int i28 = (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 942;
                        int defaultSize = View.getDefaultSize(0, 0) + 36;
                        byte[] bArr14 = $$a;
                        Object[] objArr58 = new Object[1];
                        c((short) 187, bArr14[5], bArr14[173], objArr58);
                        objRemoteActionCompatParcelizer26 = startForeground.read(c5, i28, defaultSize, -2131402098, false, (String) objArr58[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    objArr2 = (Object[]) ((Method) objRemoteActionCompatParcelizer26).invoke(null, objArr57);
                    Object objRemoteActionCompatParcelizer27 = startForeground.RemoteActionCompatParcelizer(-757676623);
                    if (objRemoteActionCompatParcelizer27 == null) {
                        char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                        int mode2 = View.MeasureSpec.getMode(0) + 943;
                        int iLastIndexOf2 = 35 - TextUtils.lastIndexOf("", '0', 0, 0);
                        Object[] objArr59 = new Object[1];
                        c((short) ($$b - 2), (byte) (-$$a[140]), r7[14], objArr59);
                        objRemoteActionCompatParcelizer27 = startForeground.read(cIndexOf2, mode2, iLastIndexOf2, -1398865628, false, (String) objArr59[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer27).set(null, objArr2);
                    try {
                        Object[] objArr60 = new Object[1];
                        b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 68), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 18, new char[]{'\r', 1, 24, 1, 18, 14, 27, 19, 26, ' ', 23, '\t', 14, 27, 21, '\"', 28, '\f', 26, 22, 5, 23}, objArr60);
                        Class<?> cls12 = Class.forName((String) objArr60[0]);
                        Object[] objArr61 = new Object[1];
                        b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 68), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 99, new char[]{'\"', 27, '\b', '\r', 27, ' ', 31, 7, 31, '\t', '\"', 28, 18, 30, 13926}, objArr61);
                        long jLongValue3 = ((Long) cls12.getDeclaredMethod((String) objArr61[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf5 = Long.valueOf(jLongValue3);
                        Object objRemoteActionCompatParcelizer28 = startForeground.RemoteActionCompatParcelizer(-1539638354);
                        if (objRemoteActionCompatParcelizer28 == null) {
                            char cMyPid = (char) (Process.myPid() >> 22);
                            int iArgb = 943 - Color.argb(0, 0, 0, 0);
                            int trimmedLength2 = 36 - TextUtils.getTrimmedLength("");
                            byte[] bArr15 = $$a;
                            Object[] objArr62 = new Object[1];
                            c((short) (-bArr15[1]), (byte) (bArr15[29] - 1), (byte) (-bArr15[45]), objArr62);
                            objRemoteActionCompatParcelizer28 = startForeground.read(cMyPid, iArgb, trimmedLength2, -629981381, false, (String) objArr62[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer28).set(null, lValueOf5);
                        Long lValueOf6 = Long.valueOf(jLongValue3 >> 12);
                        Object objRemoteActionCompatParcelizer29 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                        if (objRemoteActionCompatParcelizer29 == null) {
                            char edgeSlop2 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 943;
                            int keyRepeatDelay3 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 36;
                            Object[] objArr63 = new Object[1];
                            c((short) ($$b - 5), $$a[9], (byte) 40, objArr63);
                            objRemoteActionCompatParcelizer29 = startForeground.read(edgeSlop2, offsetBefore, keyRepeatDelay3, -167186806, false, (String) objArr63[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer29).set(null, lValueOf6);
                    } catch (Exception unused4) {
                        throw new RuntimeException();
                    }
                }
                int i29 = ((int[]) objArr2[2])[0];
                int i30 = ((int[]) objArr2[0])[0];
                if (i30 != i29) {
                    long j8 = -1;
                    long j9 = ((long) (i30 ^ i29)) & ((((long) 0) << 32) | (j8 - ((j8 >> 63) << 32)));
                    long j10 = 0;
                    long j11 = j9 | (((long) 1) << 32) | (j10 - ((j10 >> 63) << 32));
                    Object objRemoteActionCompatParcelizer30 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer30 == null) {
                        objRemoteActionCompatParcelizer30 = startForeground.read((char) (4535 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 6054, 42 - KeyEvent.keyCodeFromString(""), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke6 = ((Method) objRemoteActionCompatParcelizer30).invoke(null, null);
                    Object[] objArr64 = {334186470, Long.valueOf(j11), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls13 = (Class) startForeground.IconCompatParcelizer((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 6031 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 23);
                    byte[] bArr16 = $$g;
                    Object[] objArr65 = new Object[1];
                    d((byte) (-bArr16[11]), (byte) (-bArr16[40]), (byte) (-bArr16[54]), objArr65);
                    cls13.getMethod((String) objArr65[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke6, objArr64);
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

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 101;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatMediaItem + 51;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }
}
