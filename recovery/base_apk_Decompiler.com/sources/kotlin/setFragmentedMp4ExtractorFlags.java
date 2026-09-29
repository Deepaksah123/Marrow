package kotlin;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final class setFragmentedMp4ExtractorFlags<S> extends DefaultExtractorsFactoryExternalSyntheticLambda0<S> {
    private DateSelector<S> AudioAttributesCompatParcelizer;
    private int IconCompatParcelizer;
    private CalendarConstraints read;
    private static final byte[] $$c = {14, -10, 42, -103};
    private static final int $$f = 171;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {3, -109, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -57, 74, -14, 7, 4, 2, -25, 12, 21, 14, 7, 7, 26, -8, -10, 13, 8, 12, 22, 74, -74, 14, 18, -2, 24, -17, -3, 10, TarConstants.LF_BLK, -35, 11, 6, 24, -10, 45, -8, -8, 24, 7, 2, 12, -8, 30, -4, -10, 1, 7, 4, 24, 45, -25, -8, 20, 3, 10, TarConstants.LF_BLK, -35, 11, 6, 24, -10, 45, -8, -8, 24, 7, 2, 12, -8, 30, -4};
    private static final int $$e = 60;
    private static final byte[] $$a = {TarConstants.LF_CONTIG, -94, -3, -122, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 247;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int AudioAttributesImplApi26Parcelizer = 1;
    private static char[] RemoteActionCompatParcelizer = {9447, 9333, 9673, 9511, 9927, 9756, 10106, 8396, 8226, 8642, 8484, 8807, 9170, 9020, 11446, 11287, 28058, 27918, 27812, 27734, 28643, 28519, 28177, 27045, 26995, 26867, 26746, 27400, 27292, 27225, 26057, 25953, 31625, 31519, 31422, 31313, 31203, 31100, 30746, 32745, 32591, 32506, 32316, 32040, 31933, 31838, 29634, 29562, 29205, 29058, 28998, 28892, 28799, 30478, 56425, 56569, 56671, 56759, 56859, 56980, 57342, 55409, 55457, 55564, 55706, 56043, 56137, 56228, 54327};
    private static long MediaBrowserCompatCustomActionResultReceiver = -5722362904783496043L;

    private static String $$g(int i, int i2, int i3) {
        int i4 = i2 * 3;
        int i5 = 101 - (i * 4);
        int i6 = (i3 * 2) + 4;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[1 - i4];
        int i7 = 0 - i4;
        int i8 = -1;
        if (bArr == null) {
            i6++;
            i5 = i6 + (-i7);
        }
        while (true) {
            i8++;
            bArr2[i8] = (byte) i5;
            if (i8 == i7) {
                return new String(bArr2, 0);
            }
            byte b = bArr[i6];
            i6++;
            i5 += -b;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 12
            int r8 = r8 + 65
            int r6 = r6 + 4
            int r7 = r7 * 10
            int r0 = 44 - r7
            byte[] r1 = kotlin.setFragmentedMp4ExtractorFlags.$$a
            byte[] r0 = new byte[r0]
            int r7 = 43 - r7
            r2 = -1
            if (r1 != 0) goto L17
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            int r3 = r3 + 1
            byte r4 = (byte) r8
            int r6 = r6 + 1
            r0[r3] = r4
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r0, r7)
            r9[r7] = r6
            return
        L2a:
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2f:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + r2
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setFragmentedMp4ExtractorFlags.a(short, short, byte, java.lang.Object[]):void");
    }

    private static void c(byte b, short s, byte b2, Object[] objArr) {
        int i = b + 4;
        int i2 = s + 73;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[b2 + 20];
        int i3 = b2 + 19;
        int i4 = -1;
        if (bArr == null) {
            i2 = i2 + (-i3) + 9;
        }
        while (true) {
            i++;
            i4++;
            bArr2[i4] = (byte) i2;
            if (i4 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2 = i2 + (-bArr[i]) + 9;
        }
    }

    static <T> setFragmentedMp4ExtractorFlags<T> RemoteActionCompatParcelizer(DateSelector<T> dateSelector, int i, CalendarConstraints calendarConstraints) {
        int i2 = 2 % 2;
        setFragmentedMp4ExtractorFlags<T> setfragmentedmp4extractorflags = new setFragmentedMp4ExtractorFlags<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        setfragmentedmp4extractorflags.setArguments(bundle);
        int i3 = MediaBrowserCompatItemReceiver + 85;
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        return setfragmentedmp4extractorflags;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 95;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            super.onSaveInstanceState(bundle);
            bundle.putInt("THEME_RES_ID_KEY", this.IconCompatParcelizer);
            bundle.putParcelable("DATE_SELECTOR_KEY", this.AudioAttributesCompatParcelizer);
            bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.read);
            int i3 = 13 / 0;
        } else {
            super.onSaveInstanceState(bundle);
            bundle.putInt("THEME_RES_ID_KEY", this.IconCompatParcelizer);
            bundle.putParcelable("DATE_SELECTOR_KEY", this.AudioAttributesCompatParcelizer);
            bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.read);
        }
        int i4 = AudioAttributesImplApi26Parcelizer + 93;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void b(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i4 = $10 + 79;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(RemoteActionCompatParcelizer[i + i6])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((KeyEvent.getMaxKeyCode() >> 16) + 36621), Process.getGidForName("") + 2341, 27 - Process.getGidForName(""), 480654850, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(MediaBrowserCompatCustomActionResultReceiver), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 9701 - Color.blue(0), ImageFormat.getBitsPerPixel(0) + 27, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (MotionEvent.axisFromString("") + 1), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 23784, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                int i7 = $10 + 45;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 5 % 5;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        downloadService.write = 0;
        int i9 = $10 + 49;
        $11 = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 3 / 3;
        }
        while (downloadService.write < i2) {
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr5 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) ExpandableListView.getPackedPositionType(0L), View.MeasureSpec.getSize(0) + 23784, 33 - Color.green(0), -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        Bundle arguments;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 89;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char cLastIndexOf = (char) (13182 - TextUtils.lastIndexOf("", '0', 0, 0));
            int mode = 1649 - View.MeasureSpec.getMode(0);
            int i4 = (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 25;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[53], bArr[5], bArr[17], objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(cLastIndexOf, mode, i4, -133433128, false, (String) objArr2[0], null);
        }
        Object obj = null;
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            int i5 = AudioAttributesImplApi26Parcelizer + 119;
            MediaBrowserCompatItemReceiver = i5 % 128;
            if (i5 % 2 != 0) {
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char cLastIndexOf2 = (char) (13182 - TextUtils.lastIndexOf("", '0', 0, 0));
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 1650;
                    int touchSlop = 26 - (ViewConfiguration.getTouchSlop() >> 8);
                    byte[] bArr2 = $$a;
                    Object[] objArr3 = new Object[1];
                    a(bArr2[65], bArr2[17], bArr2[5], objArr3);
                    objRemoteActionCompatParcelizer2 = startForeground.read(cLastIndexOf2, iLastIndexOf, touchSlop, -1033747278, false, (String) objArr3[0], null);
                }
                throw null;
            }
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer3 == null) {
                char cLastIndexOf3 = (char) (13182 - TextUtils.lastIndexOf("", '0', 0));
                int i6 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1648;
                int capsMode = 26 - TextUtils.getCapsMode("", 0, 0);
                byte[] bArr3 = $$a;
                Object[] objArr4 = new Object[1];
                a(bArr3[65], bArr3[17], bArr3[5], objArr4);
                objRemoteActionCompatParcelizer3 = startForeground.read(cLastIndexOf3, i6, capsMode, -1033747278, false, (String) objArr4[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
        } else {
            Object[] objArr5 = new Object[1];
            b((char) (63617 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), (-1) - TextUtils.lastIndexOf("", '0', 0), 16 - (ViewConfiguration.getTapTimeout() >> 16), objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            b((char) (45567 - Color.red(0)), 16 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 15, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            int i7 = MediaBrowserCompatItemReceiver + 115;
            AudioAttributesImplApi26Parcelizer = i7 % 128;
            int i8 = i7 % 2;
            try {
                Object[] objArr7 = {Integer.valueOf(iIntValue), 0, -1959489063};
                byte[] bArr4 = $$d;
                byte b = (byte) (-bArr4[48]);
                Object[] objArr8 = new Object[1];
                c(b, (byte) (b & 38), (byte) (bArr4[34] - 1), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                byte b2 = (byte) (bArr4[27] - 1);
                byte b3 = (byte) (bArr4[48] - 1);
                Object[] objArr9 = new Object[1];
                c(b2, b3, b3, objArr9);
                objArr = (Object[]) cls2.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr7);
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char bitsPerPixel = (char) (13182 - ImageFormat.getBitsPerPixel(0));
                    int i9 = 1649 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    int i10 = 26 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte[] bArr5 = $$a;
                    Object[] objArr10 = new Object[1];
                    a(bArr5[65], bArr5[17], bArr5[5], objArr10);
                    objRemoteActionCompatParcelizer4 = startForeground.read(bitsPerPixel, i9, i10, -1033747278, false, (String) objArr10[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer4).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    b((char) (42981 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), View.MeasureSpec.getMode(0) + 32, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getLongPressTimeout() >> 16) + 54, View.combineMeasuredStates(0, 0) + 15, objArr12);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 13183);
                        int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 1649;
                        int i11 = 26 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        byte[] bArr6 = $$a;
                        Object[] objArr13 = new Object[1];
                        a((byte) 75, bArr6[17], bArr6[5], objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(absoluteGravity, touchSlop2, i11, 54351865, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 13183);
                        int iMakeMeasureSpec = 1649 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        int bitsPerPixel2 = 25 - ImageFormat.getBitsPerPixel(0);
                        byte[] bArr7 = $$a;
                        Object[] objArr14 = new Object[1];
                        a(bArr7[53], bArr7[5], bArr7[17], objArr14);
                        objRemoteActionCompatParcelizer6 = startForeground.read(maximumDrawingCacheSize, iMakeMeasureSpec, bitsPerPixel2, -133433128, false, (String) objArr14[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i12 = ((int[]) objArr[3])[0];
        int i13 = ((int[]) objArr[2])[0];
        if (i13 != i12) {
            long j = -1;
            long j2 = ((long) (i12 ^ i13)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) (TextUtils.indexOf("", "", 0, 0) + 4535), View.MeasureSpec.getSize(0) + 6054, 43 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer7).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i14 = MediaBrowserCompatItemReceiver + 83;
                AudioAttributesImplApi26Parcelizer = i14 % 128;
                int i15 = i14 % 2;
                try {
                    Object[] objArr15 = {-527263588, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) Color.red(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6030, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24);
                    Object[] objArr16 = new Object[1];
                    c((byte) 42, (byte) ($$d[30] - 1), r5[19], objArr16);
                    cls4.getMethod((String) objArr16[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr15);
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
        super.onCreate(bundle);
        if (bundle == null) {
            int i16 = MediaBrowserCompatItemReceiver + 103;
            AudioAttributesImplApi26Parcelizer = i16 % 128;
            if (i16 % 2 == 0) {
                getArguments();
                obj.hashCode();
                throw null;
            }
            arguments = getArguments();
        } else {
            arguments = bundle;
        }
        this.IconCompatParcelizer = arguments.getInt("THEME_RES_ID_KEY");
        this.AudioAttributesCompatParcelizer = (DateSelector) arguments.getParcelable("DATE_SELECTOR_KEY");
        this.read = (CalendarConstraints) arguments.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.IconCompatParcelizer));
        DateSelector<S> dateSelector = this.AudioAttributesCompatParcelizer;
        new setTsExtractorFlags<S>() { // from class: o.setFragmentedMp4ExtractorFlags.3
            @Override // kotlin.setTsExtractorFlags
            public final void IconCompatParcelizer(S s) {
                Iterator<setTsExtractorFlags<S>> it = setFragmentedMp4ExtractorFlags.this.write.iterator();
                while (it.hasNext()) {
                    it.next().IconCompatParcelizer(s);
                }
            }
        };
        View viewMediaBrowserCompatCustomActionResultReceiver = dateSelector.MediaBrowserCompatCustomActionResultReceiver();
        int i2 = AudioAttributesImplApi26Parcelizer + 71;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 39 / 0;
        }
        return viewMediaBrowserCompatCustomActionResultReceiver;
    }
}
