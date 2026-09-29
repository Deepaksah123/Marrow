package kotlin;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.images.zab;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.DayViewDecorator;
import com.google.android.material.datepicker.Month;
import com.google.android.material.datepicker.SmoothCalendarLayoutManager;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.calculateNextSearchBytePosition;
import kotlin.setMatroskaExtractorFlags;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final class setMatroskaExtractorFlags<S> extends DefaultExtractorsFactoryExternalSyntheticLambda0<S> {
    private static Object AudioAttributesCompatParcelizer;
    private static Object IconCompatParcelizer;
    private static Object RemoteActionCompatParcelizer;
    private static long onAddQueueItem;
    private static int onPlayFromMediaId;
    private static Object read;
    private IconCompatParcelizer AudioAttributesImplApi21Parcelizer;
    private setConstantBitrateSeekingEnabled AudioAttributesImplApi26Parcelizer;
    private Month AudioAttributesImplBaseParcelizer;
    private CalendarConstraints MediaBrowserCompatCustomActionResultReceiver;
    private DateSelector<S> MediaBrowserCompatItemReceiver;
    private View MediaBrowserCompatMediaItem;
    private View MediaBrowserCompatSearchResultReceiver;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private View MediaDescriptionCompat;
    private DayViewDecorator MediaMetadataCompat;
    private RecyclerView RatingCompat;
    private RecyclerView onCommand;
    private View onCustomAction;
    private static final byte[] $$c = {61, 46, 102, -127};
    private static final int $$f = 114;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {TarConstants.LF_CHR, -90, -19, 114, 58, -30, -58, 2, 24, -35, 4, -31, 13, -20, 34, -43, -10, -3, 34, -51, -5, -10, -6, -6, 2, -16, -13, 33, -36, -17, -8, 8, -16, 2, -20, 38, -58, -3, 8, -20, -3, 6, -18, 18, -45, 4, -13, 5, -4, -22, 4, -1, 16, -28, -19, 4, -9, -4, 40, -33, -19, -6, 36, -51, -5, -10, 8, -26, 29, -24, -24, 8, -9, -14, -4, -24, 14, -20, -26, -15, -9, -12, 8, 29, -41, -24, 4, -13, -6, 36, -51, -5, -10, 8, -26, 29, -24, -24, 8, -9, -14, -4, -24, 14, -20};
    private static final int $$e = 210;
    private static final byte[] $$a = {30, 6, -112, TarConstants.LF_FIFO, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 118;
    private static int onPause = 0;
    private static int onFastForward = 1;
    private static int handleMediaPlayPauseIfPendingOnHandler = 0;

    enum IconCompatParcelizer {
        DAY,
        YEAR
    }

    interface write {
        void write(long j);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r6, byte r7, int r8) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r7 = r7 * 4
            int r0 = 1 - r7
            byte[] r1 = kotlin.setMatroskaExtractorFlags.$$c
            int r8 = r8 * 2
            int r8 = r8 + 119
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L19
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2f
        L19:
            r3 = r2
        L1a:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L28:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2f:
            int r6 = r6 + 1
            int r4 = -r4
            int r8 = r8 + r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setMatroskaExtractorFlags.$$g(int, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = 79 - r8
            int r7 = r7 * 10
            int r0 = r7 + 34
            int r6 = r6 * 12
            int r6 = r6 + 65
            byte[] r1 = kotlin.setMatroskaExtractorFlags.$$a
            byte[] r0 = new byte[r0]
            int r7 = r7 + 33
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2e
        L17:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            r4 = r1[r6]
            int r3 = r3 + 1
        L2e:
            int r8 = r8 + r4
            int r8 = r8 + (-1)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setMatroskaExtractorFlags.a(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = 78 - r6
            int r5 = r5 * 4
            int r0 = 56 - r5
            byte[] r1 = kotlin.setMatroskaExtractorFlags.$$d
            int r7 = r7 + 73
            byte[] r0 = new byte[r0]
            int r5 = 55 - r5
            r2 = -1
            if (r1 != 0) goto L14
            r3 = r5
            r7 = r6
            goto L29
        L14:
            r4 = r7
            r7 = r6
            r6 = r4
        L17:
            int r2 = r2 + 1
            byte r3 = (byte) r6
            r0[r2] = r3
            if (r2 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L27:
            r3 = r1[r7]
        L29:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-7)
            int r7 = r7 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setMatroskaExtractorFlags.c(int, int, int, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object read(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i3);
        int i9 = (~(i7 | (~i3) | i)) | (~(i | i2 | i3));
        int i10 = ~i;
        int i11 = (~(i3 | i2)) | (~(i10 | i3)) | (~(i10 | i2));
        int i12 = i + i2 + i5 + (1698977638 * i4) + (1466394737 * i6);
        int i13 = i12 * i12;
        int i14 = (((-1250291696) * i) - 490274816) + ((-1116082190) * i2) + (i8 * (-67104753)) + ((-67104753) * i9) + (67104753 * i11) + ((-1183186944) * i5) + (1553727488 * i4) + (1859780608 * i6) + (925827072 * i13);
        int i15 = ((i * (-1787956080)) - 1478154965) + (i2 * (-1787955198)) + (i8 * (-441)) + (i9 * (-441)) + (i11 * 441) + (i5 * (-1787955639)) + (i4 * 552005654) + (i6 * (-2013897159)) + (i13 * (-429457408));
        int i16 = i14 + (i15 * i15 * (-402587648));
        if (i16 == 1) {
            return write(objArr);
        }
        if (i16 == 2) {
            return IconCompatParcelizer(objArr);
        }
        if (i16 == 3) {
            return AudioAttributesCompatParcelizer(objArr);
        }
        if (i16 == 4) {
            return read(objArr);
        }
        setMatroskaExtractorFlags setmatroskaextractorflags = (setMatroskaExtractorFlags) objArr[0];
        int i17 = 2 % 2;
        int i18 = onFastForward;
        int i19 = i18 + 69;
        onPause = i19 % 128;
        int i20 = i19 % 2;
        setConstantBitrateSeekingEnabled setconstantbitrateseekingenabled = setmatroskaextractorflags.AudioAttributesImplApi26Parcelizer;
        int i21 = i18 + 65;
        onPause = i21 % 128;
        int i22 = i21 % 2;
        return setconstantbitrateseekingenabled;
    }

    static /* synthetic */ DateSelector AudioAttributesCompatParcelizer(setMatroskaExtractorFlags setmatroskaextractorflags) {
        int i = 2 % 2;
        int i2 = onFastForward;
        int i3 = i2 + 27;
        onPause = i3 % 128;
        int i4 = i3 % 2;
        DateSelector<S> dateSelector = setmatroskaextractorflags.MediaBrowserCompatItemReceiver;
        int i5 = i2 + 95;
        onPause = i5 % 128;
        int i6 = i5 % 2;
        return dateSelector;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        setMatroskaExtractorFlags setmatroskaextractorflags = (setMatroskaExtractorFlags) objArr[0];
        int i = 2 % 2;
        int i2 = onFastForward + 67;
        int i3 = i2 % 128;
        onPause = i3;
        int i4 = i2 % 2;
        View view = setmatroskaextractorflags.MediaBrowserCompatSearchResultReceiver;
        int i5 = i3 + 89;
        onFastForward = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 6 / 0;
        }
        return view;
    }

    public static /* synthetic */ RecyclerView IconCompatParcelizer(setMatroskaExtractorFlags setmatroskaextractorflags) {
        int i = 2 % 2;
        int i2 = onPause + 29;
        onFastForward = i2 % 128;
        int i3 = i2 % 2;
        RecyclerView recyclerView = setmatroskaextractorflags.RatingCompat;
        if (i3 != 0) {
            return recyclerView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Month IconCompatParcelizer(setMatroskaExtractorFlags setmatroskaextractorflags, Month month) {
        int i = 2 % 2;
        int i2 = onPause + 79;
        int i3 = i2 % 128;
        onFastForward = i3;
        int i4 = i2 % 2;
        setmatroskaextractorflags.AudioAttributesImplBaseParcelizer = month;
        int i5 = i3 + 55;
        onPause = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return month;
    }

    static /* synthetic */ CalendarConstraints RemoteActionCompatParcelizer(setMatroskaExtractorFlags setmatroskaextractorflags) {
        int i = 2 % 2;
        int i2 = onFastForward + 99;
        int i3 = i2 % 128;
        onPause = i3;
        int i4 = i2 % 2;
        CalendarConstraints calendarConstraints = setmatroskaextractorflags.MediaBrowserCompatCustomActionResultReceiver;
        int i5 = i3 + 117;
        onFastForward = i5 % 128;
        if (i5 % 2 != 0) {
            return calendarConstraints;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ setConstantBitrateSeekingEnabled read(setMatroskaExtractorFlags setmatroskaextractorflags) {
        int i = 2 % 2;
        int i2 = onPause;
        int i3 = i2 + 123;
        onFastForward = i3 % 128;
        int i4 = i3 % 2;
        setConstantBitrateSeekingEnabled setconstantbitrateseekingenabled = setmatroskaextractorflags.AudioAttributesImplApi26Parcelizer;
        int i5 = i2 + 51;
        onFastForward = i5 % 128;
        int i6 = i5 % 2;
        return setconstantbitrateseekingenabled;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        setMatroskaExtractorFlags setmatroskaextractorflags = (setMatroskaExtractorFlags) objArr[0];
        int i = 2 % 2;
        int i2 = onFastForward + 23;
        int i3 = i2 % 128;
        onPause = i3;
        int i4 = i2 % 2;
        RecyclerView recyclerView = setmatroskaextractorflags.onCommand;
        int i5 = i3 + 33;
        onFastForward = i5 % 128;
        int i6 = i5 % 2;
        return recyclerView;
    }

    static {
        onPlayFromMediaId = 1;
        AudioAttributesImplApi21Parcelizer();
        IconCompatParcelizer = "MONTHS_VIEW_GROUP_TAG";
        AudioAttributesCompatParcelizer = "NAVIGATION_PREV_TAG";
        read = "NAVIGATION_NEXT_TAG";
        RemoteActionCompatParcelizer = "SELECTOR_TOGGLE_TAG";
        int i = handleMediaPlayPauseIfPendingOnHandler + 79;
        onPlayFromMediaId = i % 128;
        int i2 = i % 2;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        int i3 = $10 + 109;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i5 = $11 + 45;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = notifydownloadchanged.AudioAttributesCompatParcelizer;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 38461), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 531, 8 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -735610793, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() & (onAddQueueItem + 2192498202983240651L);
                    Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (36622 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 2340 - (ViewConfiguration.getJumpTapTimeout() >> 16), 28 - TextUtils.indexOf("", "", 0), 188119637, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
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
                int i7 = notifydownloadchanged.AudioAttributesCompatParcelizer;
                Object[] objArr4 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) ((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 38461), 532 - (ViewConfiguration.getLongPressTimeout() >> 16), 9 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -735610793, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).longValue() ^ (onAddQueueItem ^ 2192498202983240651L);
                Object[] objArr5 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 36621), View.MeasureSpec.getMode(0) + 2340, 28 - Color.alpha(0), 188119637, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i8 = $10 + 121;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
                Object[] objArr6 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer5 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = b9;
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (36620 - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2340, 28 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 188119637, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
                throw null;
            }
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            Object[] objArr7 = {notifydownloadchanged, notifydownloadchanged};
            Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(1971306176);
            if (objRemoteActionCompatParcelizer6 == null) {
                byte b11 = (byte) 0;
                byte b12 = b11;
                objRemoteActionCompatParcelizer6 = startForeground.read((char) (36621 - TextUtils.getOffsetAfter("", 0)), 2340 - Color.argb(0, 0, 0, 0), (Process.myPid() >> 22) + 28, 188119637, false, $$g(b11, b12, b12), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2);
    }

    public static <T> setMatroskaExtractorFlags<T> read(DateSelector<T> dateSelector, int i, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        int i2 = 2 % 2;
        setMatroskaExtractorFlags<T> setmatroskaextractorflags = new setMatroskaExtractorFlags<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.read());
        setmatroskaextractorflags.setArguments(bundle);
        int i3 = onFastForward + 41;
        onPause = i3 % 128;
        if (i3 % 2 == 0) {
            return setmatroskaextractorflags;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onPause + 11;
        onFastForward = i2 % 128;
        int i3 = i2 % 2;
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.MediaBrowserCompatItemReceiver);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.MediaBrowserCompatCustomActionResultReceiver);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.MediaMetadataCompat);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.AudioAttributesImplBaseParcelizer);
        int i4 = onFastForward + 39;
        onPause = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char scrollBarFadeDuration = (char) (13183 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
            int iResolveSizeAndState = 1649 - View.resolveSizeAndState(0, 0, 0);
            int scrollBarFadeDuration2 = 26 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            byte b = $$a[53];
            Object[] objArr2 = new Object[1];
            a(b, b, (byte) 76, objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(scrollBarFadeDuration, iResolveSizeAndState, scrollBarFadeDuration2, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            int i2 = onFastForward + 27;
            onPause = i2 % 128;
            int i3 = i2 % 2;
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 13183);
                int longPressTimeout = 1649 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 26;
                byte[] bArr = $$a;
                byte b2 = bArr[5];
                Object[] objArr3 = new Object[1];
                a(b2, b2, (byte) (-bArr[39]), objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(scrollBarSize, longPressTimeout, iMakeMeasureSpec, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
            int i4 = onFastForward + 69;
            onPause = i4 % 128;
            int i5 = i4 % 2;
        } else {
            Object[] objArr4 = new Object[1];
            b(37199 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new char[]{48227, 11559, 40673, 3973, 63771, 27374, 56242, 17742, 13846, 42976, 4428, 33301, 29646, 56702, 20030, 16325}, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b(57457 - Color.green(0), new char[]{48224, 23580, 31886, 7476, 15801, 56917, 65243, 40807, 49097, 24465, 30736, 6330, 14598, 55771, 64067, 39667}, objArr5);
            int iIntValue = ((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue();
            int i6 = onFastForward + 107;
            onPause = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 2025269570};
                byte[] bArr2 = $$d;
                byte b3 = (byte) (bArr2[51] + 1);
                Object[] objArr7 = new Object[1];
                c(b3, (byte) (b3 | 74), bArr2[35], objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                c((byte) (-bArr2[56]), (byte) (-bArr2[2]), (byte) (bArr2[51] + 1), objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char cRgb = (char) ((-16764033) - Color.rgb(0, 0, 0));
                    int iGreen = Color.green(0) + 1649;
                    int iMakeMeasureSpec2 = 26 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    byte[] bArr3 = $$a;
                    byte b4 = bArr3[5];
                    Object[] objArr9 = new Object[1];
                    a(b4, b4, (byte) (-bArr3[39]), objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(cRgb, iGreen, iMakeMeasureSpec2, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b((ViewConfiguration.getPressedStateDuration() >> 16) + 6269, new char[]{48232, 42010, 35991, 62732, 56722, 50705, 11907, 5964, 32654, 24607, 18629, 45317, 39340, 33315, 60075, 54079, 15284, 7175, 1199, 27937, 21934, 48675}, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b(62828 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), new char[]{48236, 18702, 22206, 23608, 27094, 30587, 31983, 2486, 5940, 7339, 10827, 14308, 15716, 51723, 55222}, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char cResolveSizeAndState = (char) (13183 - View.resolveSizeAndState(0, 0, 0));
                        int gidForName = 1648 - Process.getGidForName("");
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 27;
                        byte b5 = $$a[5];
                        byte b6 = b5;
                        Object[] objArr12 = new Object[1];
                        a(b5, b6, b6, objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(cResolveSizeAndState, gidForName, iIndexOf, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 13183);
                        int iNormalizeMetaState = 1649 - KeyEvent.normalizeMetaState(0);
                        int scrollBarSize2 = 26 - (ViewConfiguration.getScrollBarSize() >> 8);
                        byte b7 = $$a[53];
                        Object[] objArr13 = new Object[1];
                        a(b7, b7, (byte) 76, objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(cMakeMeasureSpec, iNormalizeMetaState, scrollBarSize2, -133433128, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf2);
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
        int i8 = ((int[]) objArr[3])[0];
        int i9 = ((int[]) objArr[2])[0];
        if (i9 != i8) {
            long j = -1;
            long j2 = ((long) (i9 ^ i8)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (((Process.getThreadPriority(0) + 20) >> 6) + 4535), 6054 - View.MeasureSpec.getSize(0), (KeyEvent.getMaxKeyCode() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                try {
                    Object[] objArr14 = {-1154634989, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) Color.alpha(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6029, 24 - View.MeasureSpec.makeMeasureSpec(0, 0));
                    byte[] bArr4 = $$d;
                    Object[] objArr15 = new Object[1];
                    c((byte) (bArr4[31] - 1), (byte) (bArr4[51] + 1), (byte) (-bArr4[56]), objArr15);
                    cls4.getMethod((String) objArr15[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr14);
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
        Bundle arguments = bundle == null ? getArguments() : bundle;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = arguments.getInt("THEME_RES_ID_KEY");
        this.MediaBrowserCompatItemReceiver = (DateSelector) arguments.getParcelable("GRID_SELECTOR_KEY");
        this.MediaBrowserCompatCustomActionResultReceiver = (CalendarConstraints) arguments.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.MediaMetadataCompat = (DayViewDecorator) arguments.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.AudioAttributesImplBaseParcelizer = (Month) arguments.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        final int i2;
        int i3 = 2 % 2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        this.AudioAttributesImplApi26Parcelizer = new setConstantBitrateSeekingEnabled(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month monthAudioAttributesImplApi21Parcelizer = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer();
        if (!setMp3ExtractorFlags.AudioAttributesCompatParcelizer(contextThemeWrapper)) {
            i = calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.mtrl_calendar_horizontal;
            int i4 = onFastForward + 5;
            onPause = i4 % 128;
            int i5 = i4 % 2;
            i2 = 0;
        } else {
            i = calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.mtrl_calendar_vertical;
            i2 = 1;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        viewInflate.setMinimumHeight(write(requireContext()));
        GridView gridView = (GridView) viewInflate.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.mtrl_calendar_days_of_week);
        InvalidTypeIdException.AudioAttributesCompatParcelizer(gridView, new deserializeUsingCustom() { // from class: o.setMatroskaExtractorFlags.1
            @Override // kotlin.deserializeUsingCustom
            public final void onInitializeAccessibilityNodeInfo(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
                super.onInitializeAccessibilityNodeInfo(view, hassuperclassstartingwith);
                hassuperclassstartingwith.RemoteActionCompatParcelizer((Object) null);
            }
        });
        int iAudioAttributesCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer();
        gridView.setAdapter((ListAdapter) (iAudioAttributesCompatParcelizer > 0 ? new setAmrExtractorFlags(iAudioAttributesCompatParcelizer) : new setAmrExtractorFlags()));
        gridView.setNumColumns(monthAudioAttributesImplApi21Parcelizer.write);
        gridView.setEnabled(false);
        this.RatingCompat = (RecyclerView) viewInflate.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.mtrl_calendar_months);
        final Context context = getContext();
        this.RatingCompat.setLayoutManager(new SmoothCalendarLayoutManager(context, i2, i2) { // from class: com.google.android.material.datepicker.MaterialCalendar$2
            private /* synthetic */ int RemoteActionCompatParcelizer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(i2, false);
                this.RemoteActionCompatParcelizer = i2;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public final void RemoteActionCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, int[] iArr) {
                if (this.RemoteActionCompatParcelizer == 0) {
                    iArr[0] = setMatroskaExtractorFlags.IconCompatParcelizer(this.AudioAttributesCompatParcelizer).getWidth();
                    iArr[1] = setMatroskaExtractorFlags.IconCompatParcelizer(this.AudioAttributesCompatParcelizer).getWidth();
                } else {
                    iArr[0] = setMatroskaExtractorFlags.IconCompatParcelizer(this.AudioAttributesCompatParcelizer).getHeight();
                    iArr[1] = setMatroskaExtractorFlags.IconCompatParcelizer(this.AudioAttributesCompatParcelizer).getHeight();
                }
            }
        });
        this.RatingCompat.setTag(IconCompatParcelizer);
        setTsExtractorMode settsextractormode = new setTsExtractorMode(contextThemeWrapper, this.MediaBrowserCompatItemReceiver, this.MediaBrowserCompatCustomActionResultReceiver, this.MediaMetadataCompat, new write() { // from class: o.setMatroskaExtractorFlags.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.setMatroskaExtractorFlags.write
            public final void write(long j) {
                if (setMatroskaExtractorFlags.RemoteActionCompatParcelizer(setMatroskaExtractorFlags.this).write().RemoteActionCompatParcelizer(j)) {
                    setMatroskaExtractorFlags.AudioAttributesCompatParcelizer(setMatroskaExtractorFlags.this);
                    Iterator<setTsExtractorFlags<S>> it = setMatroskaExtractorFlags.this.write.iterator();
                    while (it.hasNext()) {
                        it.next().IconCompatParcelizer(setMatroskaExtractorFlags.AudioAttributesCompatParcelizer(setMatroskaExtractorFlags.this).RemoteActionCompatParcelizer());
                    }
                    setMatroskaExtractorFlags.IconCompatParcelizer(setMatroskaExtractorFlags.this).IconCompatParcelizer().notifyDataSetChanged();
                    Object[] objArr = {setMatroskaExtractorFlags.this};
                    if (((RecyclerView) setMatroskaExtractorFlags.read(949332697, -949332696, zab.IconCompatParcelizer(), zab.IconCompatParcelizer(), zab.IconCompatParcelizer(), objArr, zab.IconCompatParcelizer())) != null) {
                        Object[] objArr2 = {setMatroskaExtractorFlags.this};
                        ((RecyclerView) setMatroskaExtractorFlags.read(949332697, -949332696, zab.IconCompatParcelizer(), zab.IconCompatParcelizer(), zab.IconCompatParcelizer(), objArr2, zab.IconCompatParcelizer())).IconCompatParcelizer().notifyDataSetChanged();
                    }
                }
            }
        });
        this.RatingCompat.setAdapter(settsextractormode);
        int integer = contextThemeWrapper.getResources().getInteger(calculateNextSearchBytePosition.AudioAttributesImplApi21Parcelizer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.mtrl_calendar_year_selector_frame);
        this.onCommand = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.onCommand.setLayoutManager(new GridLayoutManager(integer));
            this.onCommand.setAdapter(new DefaultExtractorsFactoryExternalSyntheticLambda1(this));
            this.onCommand.AudioAttributesCompatParcelizer(AudioAttributesImplBaseParcelizer());
        }
        if (viewInflate.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.month_navigation_fragment_toggle) != null) {
            write(viewInflate, settsextractormode);
            int i6 = onFastForward + 77;
            onPause = i6 % 128;
            int i7 = i6 % 2;
        }
        if (!setMp3ExtractorFlags.AudioAttributesCompatParcelizer(contextThemeWrapper)) {
            new UByteSerializer().read(this.RatingCompat);
        }
        this.RatingCompat.AudioAttributesImplApi21Parcelizer(settsextractormode.write(this.AudioAttributesImplBaseParcelizer));
        MediaBrowserCompatCustomActionResultReceiver();
        return viewInflate;
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        InvalidTypeIdException.AudioAttributesCompatParcelizer(this.RatingCompat, new deserializeUsingCustom() { // from class: o.setMatroskaExtractorFlags.2
            @Override // kotlin.deserializeUsingCustom
            public final void onInitializeAccessibilityNodeInfo(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
                super.onInitializeAccessibilityNodeInfo(view, hassuperclassstartingwith);
                hassuperclassstartingwith.handleMediaPlayPauseIfPendingOnHandler(false);
            }
        });
        int i2 = onFastForward + 15;
        onPause = i2 % 128;
        int i3 = i2 % 2;
    }

    private RecyclerView.AudioAttributesImplBaseParcelizer AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        RecyclerView.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = new RecyclerView.AudioAttributesImplBaseParcelizer() { // from class: o.setMatroskaExtractorFlags.10
            private final Calendar AudioAttributesCompatParcelizer = getExtractor.write();
            private final Calendar RemoteActionCompatParcelizer = getExtractor.write();

            @Override // androidx.recyclerview.widget.RecyclerView.AudioAttributesImplBaseParcelizer
            public final void IconCompatParcelizer(Canvas canvas, RecyclerView recyclerView, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                int width;
                if ((recyclerView.IconCompatParcelizer() instanceof DefaultExtractorsFactoryExternalSyntheticLambda1) && (recyclerView.AudioAttributesImplApi21Parcelizer() instanceof GridLayoutManager)) {
                    DefaultExtractorsFactoryExternalSyntheticLambda1 defaultExtractorsFactoryExternalSyntheticLambda1 = (DefaultExtractorsFactoryExternalSyntheticLambda1) recyclerView.IconCompatParcelizer();
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.AudioAttributesImplApi21Parcelizer();
                    for (StringArrayDeserializer<Long, Long> stringArrayDeserializer : setMatroskaExtractorFlags.AudioAttributesCompatParcelizer(setMatroskaExtractorFlags.this).AudioAttributesCompatParcelizer()) {
                        if (stringArrayDeserializer.RemoteActionCompatParcelizer != null && stringArrayDeserializer.IconCompatParcelizer != null) {
                            this.AudioAttributesCompatParcelizer.setTimeInMillis(stringArrayDeserializer.RemoteActionCompatParcelizer.longValue());
                            this.RemoteActionCompatParcelizer.setTimeInMillis(stringArrayDeserializer.IconCompatParcelizer.longValue());
                            int iIconCompatParcelizer = defaultExtractorsFactoryExternalSyntheticLambda1.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.get(1));
                            int iIconCompatParcelizer2 = defaultExtractorsFactoryExternalSyntheticLambda1.IconCompatParcelizer(this.RemoteActionCompatParcelizer.get(1));
                            View viewWrite = gridLayoutManager.write(iIconCompatParcelizer);
                            View viewWrite2 = gridLayoutManager.write(iIconCompatParcelizer2);
                            int iIconCompatParcelizer3 = iIconCompatParcelizer / gridLayoutManager.IconCompatParcelizer();
                            int iIconCompatParcelizer4 = iIconCompatParcelizer2 / gridLayoutManager.IconCompatParcelizer();
                            int i2 = iIconCompatParcelizer3;
                            while (i2 <= iIconCompatParcelizer4) {
                                View viewWrite3 = gridLayoutManager.write(gridLayoutManager.IconCompatParcelizer() * i2);
                                if (viewWrite3 != null) {
                                    int top = viewWrite3.getTop();
                                    int iIconCompatParcelizer5 = setMatroskaExtractorFlags.read(setMatroskaExtractorFlags.this).AudioAttributesImplBaseParcelizer.IconCompatParcelizer();
                                    int bottom = viewWrite3.getBottom();
                                    int iRemoteActionCompatParcelizer = setMatroskaExtractorFlags.read(setMatroskaExtractorFlags.this).AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer();
                                    int left = (i2 != iIconCompatParcelizer3 || viewWrite == null) ? 0 : viewWrite.getLeft() + (viewWrite.getWidth() / 2);
                                    if (i2 == iIconCompatParcelizer4 && viewWrite2 != null) {
                                        width = viewWrite2.getLeft() + (viewWrite2.getWidth() / 2);
                                    } else {
                                        width = recyclerView.getWidth();
                                    }
                                    canvas.drawRect(left, top + iIconCompatParcelizer5, width, bottom - iRemoteActionCompatParcelizer, setMatroskaExtractorFlags.read(setMatroskaExtractorFlags.this).write);
                                }
                                i2++;
                            }
                        }
                    }
                }
            }
        };
        int i2 = onFastForward + 93;
        onPause = i2 % 128;
        if (i2 % 2 == 0) {
            return audioAttributesImplBaseParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final Month write() {
        int i = 2 % 2;
        int i2 = onFastForward;
        int i3 = i2 + 15;
        onPause = i3 % 128;
        int i4 = i3 % 2;
        Month month = this.AudioAttributesImplBaseParcelizer;
        int i5 = i2 + 25;
        onPause = i5 % 128;
        int i6 = i5 % 2;
        return month;
    }

    final CalendarConstraints read() {
        int i = 2 % 2;
        int i2 = onFastForward;
        int i3 = i2 + 97;
        onPause = i3 % 128;
        int i4 = i3 % 2;
        CalendarConstraints calendarConstraints = this.MediaBrowserCompatCustomActionResultReceiver;
        int i5 = i2 + 71;
        onPause = i5 % 128;
        if (i5 % 2 == 0) {
            return calendarConstraints;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void RemoteActionCompatParcelizer(com.google.android.material.datepicker.Month r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.setMatroskaExtractorFlags.onPause
            int r1 = r1 + 109
            int r2 = r1 % 128
            kotlin.setMatroskaExtractorFlags.onFastForward = r2
            int r1 = r1 % r0
            androidx.recyclerview.widget.RecyclerView r1 = r7.RatingCompat
            androidx.recyclerview.widget.RecyclerView$IconCompatParcelizer r1 = r1.IconCompatParcelizer()
            o.setTsExtractorMode r1 = (kotlin.setTsExtractorMode) r1
            int r2 = r1.write(r8)
            com.google.android.material.datepicker.Month r3 = r7.AudioAttributesImplBaseParcelizer
            int r1 = r1.write(r3)
            int r1 = r2 - r1
            int r3 = java.lang.Math.abs(r1)
            r4 = 0
            r5 = 3
            r6 = 1
            if (r3 <= r5) goto L36
            int r3 = kotlin.setMatroskaExtractorFlags.onFastForward
            int r3 = r3 + r6
            int r5 = r3 % 128
            kotlin.setMatroskaExtractorFlags.onPause = r5
            int r3 = r3 % r0
            if (r3 == 0) goto L34
            goto L36
        L34:
            r3 = r6
            goto L37
        L36:
            r3 = r4
        L37:
            if (r1 > 0) goto L4a
            int r1 = kotlin.setMatroskaExtractorFlags.onFastForward
            int r1 = r1 + 19
            int r5 = r1 % 128
            kotlin.setMatroskaExtractorFlags.onPause = r5
            int r1 = r1 % r0
            int r5 = r5 + 119
            int r1 = r5 % 128
            kotlin.setMatroskaExtractorFlags.onFastForward = r1
            int r5 = r5 % r0
            goto L4b
        L4a:
            r4 = r6
        L4b:
            r7.AudioAttributesImplBaseParcelizer = r8
            if (r3 == r6) goto L50
            goto L5d
        L50:
            if (r4 == 0) goto L5d
            androidx.recyclerview.widget.RecyclerView r8 = r7.RatingCompat
            int r0 = r2 + (-3)
            r8.AudioAttributesImplApi21Parcelizer(r0)
            r7.write(r2)
            return
        L5d:
            if (r3 == 0) goto L73
            int r8 = kotlin.setMatroskaExtractorFlags.onPause
            int r8 = r8 + 121
            int r1 = r8 % 128
            kotlin.setMatroskaExtractorFlags.onFastForward = r1
            int r8 = r8 % r0
            androidx.recyclerview.widget.RecyclerView r8 = r7.RatingCompat
            int r0 = r2 + 3
            r8.AudioAttributesImplApi21Parcelizer(r0)
            r7.write(r2)
            return
        L73:
            r7.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setMatroskaExtractorFlags.RemoteActionCompatParcelizer(com.google.android.material.datepicker.Month):void");
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        setMatroskaExtractorFlags setmatroskaextractorflags = (setMatroskaExtractorFlags) objArr[0];
        int i = 2 % 2;
        int i2 = onFastForward + 121;
        int i3 = i2 % 128;
        onPause = i3;
        int i4 = i2 % 2;
        DateSelector<S> dateSelector = setmatroskaextractorflags.MediaBrowserCompatItemReceiver;
        int i5 = i3 + 77;
        onFastForward = i5 % 128;
        if (i5 % 2 != 0) {
            return dateSelector;
        }
        throw null;
    }

    static int read(Context context) {
        int i = 2 % 2;
        int i2 = onFastForward + 39;
        onPause = i2 % 128;
        int i3 = i2 % 2;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.mtrl_calendar_day_height);
        int i4 = onFastForward + 11;
        onPause = i4 % 128;
        int i5 = i4 % 2;
        return dimensionPixelSize;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        setMatroskaExtractorFlags setmatroskaextractorflags = (setMatroskaExtractorFlags) objArr[0];
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) objArr[1];
        int i = 2 % 2;
        int i2 = onPause + 33;
        onFastForward = i2 % 128;
        int i3 = i2 % 2;
        setmatroskaextractorflags.AudioAttributesImplApi21Parcelizer = iconCompatParcelizer;
        if (iconCompatParcelizer == IconCompatParcelizer.YEAR) {
            int i4 = onFastForward + 119;
            onPause = i4 % 128;
            int i5 = i4 % 2;
            setmatroskaextractorflags.onCommand.AudioAttributesImplApi21Parcelizer().read(((DefaultExtractorsFactoryExternalSyntheticLambda1) setmatroskaextractorflags.onCommand.IconCompatParcelizer()).IconCompatParcelizer(setmatroskaextractorflags.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer));
            setmatroskaextractorflags.onCustomAction.setVisibility(0);
            setmatroskaextractorflags.MediaBrowserCompatSearchResultReceiver.setVisibility(8);
            setmatroskaextractorflags.MediaDescriptionCompat.setVisibility(8);
            setmatroskaextractorflags.MediaBrowserCompatMediaItem.setVisibility(8);
            return null;
        }
        if (iconCompatParcelizer == IconCompatParcelizer.DAY) {
            int i6 = onFastForward + 75;
            onPause = i6 % 128;
            int i7 = i6 % 2;
            setmatroskaextractorflags.onCustomAction.setVisibility(8);
            setmatroskaextractorflags.MediaBrowserCompatSearchResultReceiver.setVisibility(0);
            setmatroskaextractorflags.MediaDescriptionCompat.setVisibility(0);
            setmatroskaextractorflags.MediaBrowserCompatMediaItem.setVisibility(0);
            setmatroskaextractorflags.RemoteActionCompatParcelizer(setmatroskaextractorflags.AudioAttributesImplBaseParcelizer);
        }
        return null;
    }

    final void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        if (this.AudioAttributesImplApi21Parcelizer != IconCompatParcelizer.YEAR) {
            if (this.AudioAttributesImplApi21Parcelizer == IconCompatParcelizer.DAY) {
                int i2 = onFastForward + 29;
                onPause = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {this, IconCompatParcelizer.YEAR};
                read(-1894204853, 1894204857, zab.IconCompatParcelizer(), zab.IconCompatParcelizer(), zab.IconCompatParcelizer(), objArr, zab.IconCompatParcelizer());
                return;
            }
            return;
        }
        int i4 = onPause + 47;
        onFastForward = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr2 = {this, IconCompatParcelizer.DAY};
        read(-1894204853, 1894204857, zab.IconCompatParcelizer(), zab.IconCompatParcelizer(), zab.IconCompatParcelizer(), objArr2, zab.IconCompatParcelizer());
    }

    private void write(View view, final setTsExtractorMode settsextractormode) {
        int i = 2 % 2;
        final MaterialButton materialButton = (MaterialButton) view.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.month_navigation_fragment_toggle);
        materialButton.setTag(RemoteActionCompatParcelizer);
        InvalidTypeIdException.AudioAttributesCompatParcelizer(materialButton, new deserializeUsingCustom() { // from class: o.setMatroskaExtractorFlags.6
            @Override // kotlin.deserializeUsingCustom
            public final void onInitializeAccessibilityNodeInfo(View view2, hasSuperClassStartingWith hassuperclassstartingwith) {
                String string;
                super.onInitializeAccessibilityNodeInfo(view2, hassuperclassstartingwith);
                Object[] objArr = {setMatroskaExtractorFlags.this};
                if (((View) setMatroskaExtractorFlags.read(1509724705, -1509724702, zab.IconCompatParcelizer(), zab.IconCompatParcelizer(), zab.IconCompatParcelizer(), objArr, zab.IconCompatParcelizer())).getVisibility() == 0) {
                    string = setMatroskaExtractorFlags.this.getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.mtrl_picker_toggle_to_year_selection);
                } else {
                    string = setMatroskaExtractorFlags.this.getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.mtrl_picker_toggle_to_day_selection);
                }
                hassuperclassstartingwith.read(string);
            }
        });
        View viewFindViewById = view.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.month_navigation_previous);
        this.MediaDescriptionCompat = viewFindViewById;
        viewFindViewById.setTag(AudioAttributesCompatParcelizer);
        View viewFindViewById2 = view.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.month_navigation_next);
        this.MediaBrowserCompatMediaItem = viewFindViewById2;
        viewFindViewById2.setTag(read);
        this.onCustomAction = view.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.mtrl_calendar_year_selector_frame);
        this.MediaBrowserCompatSearchResultReceiver = view.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.mtrl_calendar_day_selector_frame);
        Object[] objArr = {this, IconCompatParcelizer.DAY};
        read(-1894204853, 1894204857, zab.IconCompatParcelizer(), zab.IconCompatParcelizer(), zab.IconCompatParcelizer(), objArr, zab.IconCompatParcelizer());
        materialButton.setText(this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer());
        this.RatingCompat.RemoteActionCompatParcelizer(new RecyclerView.MediaBrowserCompatSearchResultReceiver() { // from class: o.setMatroskaExtractorFlags.8
            @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatSearchResultReceiver
            public final void RemoteActionCompatParcelizer(RecyclerView recyclerView, int i2, int i3) {
                int iMediaMetadataCompat;
                if (i2 < 0) {
                    iMediaMetadataCompat = setMatroskaExtractorFlags.this.RemoteActionCompatParcelizer().MediaBrowserCompatItemReceiver();
                } else {
                    iMediaMetadataCompat = setMatroskaExtractorFlags.this.RemoteActionCompatParcelizer().MediaMetadataCompat();
                }
                setMatroskaExtractorFlags.IconCompatParcelizer(setMatroskaExtractorFlags.this, settsextractormode.AudioAttributesCompatParcelizer(iMediaMetadataCompat));
                materialButton.setText(settsextractormode.RemoteActionCompatParcelizer(iMediaMetadataCompat));
            }

            @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatSearchResultReceiver
            public final void AudioAttributesCompatParcelizer(RecyclerView recyclerView, int i2) {
                if (i2 == 0) {
                    recyclerView.announceForAccessibility(materialButton.getText());
                }
            }
        });
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: o.setMatroskaExtractorFlags.9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                setMatroskaExtractorFlags.this.MediaBrowserCompatItemReceiver();
            }
        });
        this.MediaBrowserCompatMediaItem.setOnClickListener(new View.OnClickListener() { // from class: o.setMatroskaExtractorFlags.7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int iMediaBrowserCompatItemReceiver = setMatroskaExtractorFlags.this.RemoteActionCompatParcelizer().MediaBrowserCompatItemReceiver() + 1;
                if (iMediaBrowserCompatItemReceiver < setMatroskaExtractorFlags.IconCompatParcelizer(setMatroskaExtractorFlags.this).IconCompatParcelizer().getItemCount()) {
                    setMatroskaExtractorFlags.this.RemoteActionCompatParcelizer(settsextractormode.AudioAttributesCompatParcelizer(iMediaBrowserCompatItemReceiver));
                }
            }
        });
        this.MediaDescriptionCompat.setOnClickListener(new View.OnClickListener() { // from class: o.setMatroskaExtractorFlags.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int iMediaMetadataCompat = setMatroskaExtractorFlags.this.RemoteActionCompatParcelizer().MediaMetadataCompat() - 1;
                if (iMediaMetadataCompat >= 0) {
                    setMatroskaExtractorFlags.this.RemoteActionCompatParcelizer(settsextractormode.AudioAttributesCompatParcelizer(iMediaMetadataCompat));
                }
            }
        });
        int i2 = onPause + 97;
        onFastForward = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private void write(final int i) {
        int i2 = 2 % 2;
        this.RatingCompat.post(new Runnable() { // from class: o.setMatroskaExtractorFlags.4
            @Override // java.lang.Runnable
            public final void run() {
                setMatroskaExtractorFlags.IconCompatParcelizer(setMatroskaExtractorFlags.this).AudioAttributesImplBaseParcelizer(i);
            }
        });
        int i3 = onFastForward + 25;
        onPause = i3 % 128;
        int i4 = i3 % 2;
    }

    private static int write(Context context) {
        int i = 2 % 2;
        int i2 = onPause + 83;
        onFastForward = i2 % 128;
        int i3 = i2 % 2;
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(calculateNextSearchBytePosition.write.mtrl_calendar_navigation_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(calculateNextSearchBytePosition.write.mtrl_calendar_navigation_top_padding);
        int dimensionPixelOffset2 = dimensionPixelSize + dimensionPixelOffset + resources.getDimensionPixelOffset(calculateNextSearchBytePosition.write.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelSize(calculateNextSearchBytePosition.write.mtrl_calendar_days_of_week_height) + (setTsSubtitleFormats.RemoteActionCompatParcelizer * resources.getDimensionPixelSize(calculateNextSearchBytePosition.write.mtrl_calendar_day_height)) + ((setTsSubtitleFormats.RemoteActionCompatParcelizer - 1) * resources.getDimensionPixelOffset(calculateNextSearchBytePosition.write.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(calculateNextSearchBytePosition.write.mtrl_calendar_bottom_padding);
        int i4 = onFastForward + 41;
        onPause = i4 % 128;
        int i5 = i4 % 2;
        return dimensionPixelOffset2;
    }

    final LinearLayoutManager RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onPause + 43;
        onFastForward = i2 % 128;
        int i3 = i2 % 2;
        RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer = this.RatingCompat.AudioAttributesImplApi21Parcelizer();
        if (i3 != 0) {
            return (LinearLayoutManager) mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer;
        }
        throw null;
    }

    @Override // kotlin.DefaultExtractorsFactoryExternalSyntheticLambda0
    public final boolean AudioAttributesCompatParcelizer(setTsExtractorFlags<S> settsextractorflags) {
        int i = 2 % 2;
        int i2 = onPause + 75;
        onFastForward = i2 % 128;
        int i3 = i2 % 2;
        boolean zAudioAttributesCompatParcelizer = super.AudioAttributesCompatParcelizer(settsextractorflags);
        if (i3 == 0) {
            int i4 = 93 / 0;
        }
        int i5 = onPause + 27;
        onFastForward = i5 % 128;
        int i6 = i5 % 2;
        return zAudioAttributesCompatParcelizer;
    }

    static /* synthetic */ RecyclerView write(setMatroskaExtractorFlags setmatroskaextractorflags) {
        int iIconCompatParcelizer = zab.IconCompatParcelizer();
        int iIconCompatParcelizer2 = zab.IconCompatParcelizer();
        return (RecyclerView) read(949332697, -949332696, iIconCompatParcelizer, zab.IconCompatParcelizer(), iIconCompatParcelizer2, new Object[]{setmatroskaextractorflags}, zab.IconCompatParcelizer());
    }

    static /* synthetic */ View AudioAttributesImplBaseParcelizer(setMatroskaExtractorFlags setmatroskaextractorflags) {
        int iIconCompatParcelizer = zab.IconCompatParcelizer();
        int iIconCompatParcelizer2 = zab.IconCompatParcelizer();
        return (View) read(1509724705, -1509724702, iIconCompatParcelizer, zab.IconCompatParcelizer(), iIconCompatParcelizer2, new Object[]{setmatroskaextractorflags}, zab.IconCompatParcelizer());
    }

    final setConstantBitrateSeekingEnabled IconCompatParcelizer() {
        int iIconCompatParcelizer = zab.IconCompatParcelizer();
        int iIconCompatParcelizer2 = zab.IconCompatParcelizer();
        return (setConstantBitrateSeekingEnabled) read(525444929, -525444929, iIconCompatParcelizer, zab.IconCompatParcelizer(), iIconCompatParcelizer2, new Object[]{this}, zab.IconCompatParcelizer());
    }

    public final DateSelector<S> AudioAttributesCompatParcelizer() {
        int iIconCompatParcelizer = zab.IconCompatParcelizer();
        int iIconCompatParcelizer2 = zab.IconCompatParcelizer();
        return (DateSelector) read(-937857988, 937857990, iIconCompatParcelizer, zab.IconCompatParcelizer(), iIconCompatParcelizer2, new Object[]{this}, zab.IconCompatParcelizer());
    }

    final void write(IconCompatParcelizer iconCompatParcelizer) {
        int iIconCompatParcelizer = zab.IconCompatParcelizer();
        int iIconCompatParcelizer2 = zab.IconCompatParcelizer();
        read(-1894204853, 1894204857, iIconCompatParcelizer, zab.IconCompatParcelizer(), iIconCompatParcelizer2, new Object[]{this, iconCompatParcelizer}, zab.IconCompatParcelizer());
    }

    static void AudioAttributesImplApi21Parcelizer() {
        onAddQueueItem = -6952883675061997630L;
    }
}
