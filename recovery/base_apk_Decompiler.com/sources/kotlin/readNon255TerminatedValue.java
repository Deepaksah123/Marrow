package kotlin;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.calculateNextSearchBytePosition;
import kotlin.onDownloadChanged;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class readNon255TerminatedValue extends menuHostHelperlambda0 {
    private BottomSheetBehavior<FrameLayout> AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private FrameLayout IconCompatParcelizer;
    private FrameLayout MediaBrowserCompatCustomActionResultReceiver;
    private CoordinatorLayout MediaBrowserCompatItemReceiver;
    private write MediaBrowserCompatMediaItem;
    private boolean RatingCompat;
    boolean RemoteActionCompatParcelizer;
    private FlacStreamMetadata read;
    private BottomSheetBehavior.write write;
    private static final byte[] $$c = {10, -79, -66, -51};
    private static final int $$f = 122;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {10, -79, -66, -51, TarConstants.LF_CHR, -71, -12, -29, 36, -59, -3, -35, 71, -43, -66, 3, -19, -20, 32, -65, -14, -12, -5, -7, -33, -13, 1, -28, 28, -50, -17, -10, 28, -45, -32, 0, 7, -31, -31, 1, -16, -21, -11, -31, 7, -27, -9, -5, -25, 1, -33, -22, -16, -19, 1, 22, -48, -31, -3, -20, -13, 29, -58, -12, -17, 1, -33, 22, -31, -31, 1, -16, -21, -11, -31, 7, -27};
    private static final int $$e = TarConstants.CHKSUM_OFFSET;
    private static final byte[] $$a = {59, 79, 7, -2, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 196;
    private static int onCustomAction = 0;
    private static int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 1;
    private static char MediaBrowserCompatSearchResultReceiver = 58449;
    private static char MediaMetadataCompat = 49265;
    private static char MediaDescriptionCompat = 41465;
    private static char handleMediaPlayPauseIfPendingOnHandler = 62919;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r7, int r8, int r9) {
        /*
            byte[] r0 = kotlin.readNon255TerminatedValue.$$c
            int r9 = r9 * 4
            int r9 = r9 + 4
            int r8 = r8 * 3
            int r8 = r8 + 1
            int r7 = r7 * 4
            int r7 = 122 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r5 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L29:
            int r9 = -r9
            int r7 = r7 + r9
            int r9 = r3 + 1
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.readNon255TerminatedValue.$$g(int, int, int):java.lang.String");
    }

    public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = ~i5;
        int i11 = ~(i10 | i8);
        int i12 = i9 | i11 | (~(i6 | i5 | i2));
        int i13 = i7 | i10;
        int i14 = i9 | (~i13) | i11;
        int i15 = (~(i2 | i5)) | (~(i13 | i8)) | (~(i6 | i2));
        int i16 = i6 + i5 + i3 + ((-298151579) * i) + ((-427515960) * i4);
        int i17 = i16 * i16;
        int i18 = (i6 * (-431502880)) + 875560960 + ((-431502880) * i5) + ((-1881159201) * i12) + ((-532648894) * i14) + (1881159201 * i15) + (1449656320 * i3) + ((-16252928) * i) + (423624704 * i4) + (1109590016 * i17);
        int i19 = ((i6 * (-2003555040)) - 1632655964) + (i5 * (-2003555040)) + (i12 * (-423)) + (i14 * 846) + (i15 * 423) + (i3 * (-2003554617)) + (i * 1812671363) + (i4 * (-1519508360)) + (i17 * (-1288372224));
        int i20 = i18 + (i19 * i19 * (-1796407296));
        return i20 != 1 ? i20 != 2 ? i20 != 3 ? AudioAttributesCompatParcelizer(objArr) : write(objArr) : read(objArr) : RemoteActionCompatParcelizer(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = kotlin.readNon255TerminatedValue.$$a
            int r5 = r5 * 10
            int r1 = 44 - r5
            int r7 = r7 * 12
            int r7 = r7 + 65
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r5 = 43 - r5
            r2 = -1
            if (r0 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            int r3 = r3 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L27:
            int r6 = r6 + 1
            r4 = r0[r6]
        L2b:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + r2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.readNon255TerminatedValue.a(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 82
            byte[] r0 = kotlin.readNon255TerminatedValue.$$d
            int r1 = r7 + 5
            int r8 = r8 * 2
            int r8 = 49 - r8
            byte[] r1 = new byte[r1]
            int r7 = r7 + 4
            r2 = 0
            if (r0 != 0) goto L15
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r8 = r8 + 1
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2d:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-14)
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.readNon255TerminatedValue.c(byte, int, short, java.lang.Object[]):void");
    }

    static /* synthetic */ BottomSheetBehavior AudioAttributesCompatParcelizer(readNon255TerminatedValue readnon255terminatedvalue) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 47;
        int i3 = i2 % 128;
        onCustomAction = i3;
        int i4 = i2 % 2;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = readnon255terminatedvalue.AudioAttributesCompatParcelizer;
        int i5 = i3 + 69;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i5 % 128;
        int i6 = i5 % 2;
        return bottomSheetBehavior;
    }

    static /* synthetic */ write read(readNon255TerminatedValue readnon255terminatedvalue) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int i3 = i2 + 79;
        onCustomAction = i3 % 128;
        int i4 = i3 % 2;
        write writeVar = readnon255terminatedvalue.MediaBrowserCompatMediaItem;
        int i5 = i2 + 41;
        onCustomAction = i5 % 128;
        if (i5 % 2 == 0) {
            return writeVar;
        }
        throw null;
    }

    static /* synthetic */ write read(readNon255TerminatedValue readnon255terminatedvalue, write writeVar) {
        int i = 2 % 2;
        int i2 = onCustomAction + 115;
        int i3 = i2 % 128;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i3;
        int i4 = i2 % 2;
        readnon255terminatedvalue.MediaBrowserCompatMediaItem = writeVar;
        int i5 = i3 + 35;
        onCustomAction = i5 % 128;
        int i6 = i5 % 2;
        return writeVar;
    }

    static /* synthetic */ FrameLayout write(readNon255TerminatedValue readnon255terminatedvalue) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int i3 = i2 + 123;
        onCustomAction = i3 % 128;
        int i4 = i3 % 2;
        FrameLayout frameLayout = readnon255terminatedvalue.IconCompatParcelizer;
        if (i4 != 0) {
            int i5 = 21 / 0;
        }
        int i6 = i2 + 63;
        onCustomAction = i6 % 128;
        int i7 = i6 % 2;
        return frameLayout;
    }

    public readNon255TerminatedValue(Context context, int i) {
        super(context, read(context, i));
        this.RemoteActionCompatParcelizer = true;
        this.AudioAttributesImplApi26Parcelizer = true;
        this.write = new BottomSheetBehavior.write() { // from class: o.readNon255TerminatedValue.1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.write
            public final void onSlide(View view, float f) {
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.write
            public final void onStateChanged(View view, int i2) {
                if (i2 == 5) {
                    readNon255TerminatedValue.this.cancel();
                }
            }
        };
        IconCompatParcelizer(1);
        this.RatingCompat = getContext().getTheme().obtainStyledAttributes(new int[]{calculateNextSearchBytePosition.IconCompatParcelizer.enableEdgeToEdge}).getBoolean(0, false);
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        int i6 = 0;
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        int i7 = $11 + 61;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        while (isstopped.read < cArr.length) {
            int i9 = $10 + 115;
            $11 = i9 % 128;
            if (i9 % i4 == 0) {
                cArr3[i6] = cArr[isstopped.read];
                cArr3[1] = cArr[isstopped.read];
                i2 = 1;
            } else {
                cArr3[i6] = cArr[isstopped.read];
                cArr3[1] = cArr[isstopped.read + 1];
                i2 = i6;
            }
            int i10 = 58224;
            while (i2 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i6];
                int i11 = (c2 + i10) ^ ((c2 << 4) + ((char) (((long) MediaDescriptionCompat) ^ 1193402106669854891L)));
                int i12 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(handleMediaPlayPauseIfPendingOnHandler);
                    objArr2[i4] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[i6] = Integer.valueOf(c);
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "");
                        int modifierMetaStateMask = 1503 - ((byte) KeyEvent.getModifierMetaStateMask());
                        int i13 = 21 - (TypedValue.complexToFraction(i6, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(i6, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                        byte b = (byte) i6;
                        byte b2 = b;
                        String str$$g = $$g(b, b2, b2);
                        Class[] clsArr = new Class[4];
                        clsArr[i6] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objRemoteActionCompatParcelizer = startForeground.read(cIndexOf, modifierMetaStateMask, i13, 1322448859, false, str$$g, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i6]), Integer.valueOf((cCharValue + i10) ^ ((cCharValue << 4) + ((char) (((long) MediaBrowserCompatSearchResultReceiver) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(MediaMetadataCompat)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getOffsetAfter("", 0), Color.rgb(0, 0, 0) + 16778720, 'E' - AndroidCharacter.getMirror('0'), 1322448859, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i10 -= 40503;
                    i2++;
                    cArr3 = cArr4;
                    i4 = 2;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[isstopped.read] = cArr5[0];
            cArr2[isstopped.read + 1] = cArr5[1];
            Object[] objArr4 = {isstopped, isstopped};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-167774474);
            if (objRemoteActionCompatParcelizer3 == null) {
                i3 = 2;
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 9016, View.MeasureSpec.makeMeasureSpec(0, 0) + 58, -1950993821, false, "D", new Class[]{Object.class, Object.class});
            } else {
                i3 = 2;
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            i4 = i3;
            cArr3 = cArr5;
            i6 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public final void setContentView(int i) {
        int i2 = 2 % 2;
        int i3 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 67;
        onCustomAction = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        Object[] objArr = {this, Integer.valueOf(i), null, null};
        super.setContentView((View) IconCompatParcelizer(onDownloadChanged.RemoteActionCompatParcelizer.read(), onDownloadChanged.RemoteActionCompatParcelizer.read(), onDownloadChanged.RemoteActionCompatParcelizer.read(), onDownloadChanged.RemoteActionCompatParcelizer.read(), -76039767, 76039770, objArr));
        int i5 = onCustomAction + 1;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public final void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 13184);
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1649;
            int offsetAfter = 26 - TextUtils.getOffsetAfter("", 0);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[5], bArr[53], bArr[17], objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(cLastIndexOf, maximumDrawingCacheSize, offsetAfter, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) == -1) {
            Object[] objArr3 = new Object[1];
            b(16 - View.resolveSize(0, 0), new char[]{49911, 9616, 25932, 28307, 22203, 14079, 33720, 3075, 18056, 40645, 58186, 37634, 16855, 6732, 23682, 50807}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(16 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), new char[]{54274, 19154, 8437, 46375, 63222, 26292, 18648, 43431, 65089, 59573, 14093, 29486, 63221, 6344, 54263, 36190}, objArr4);
            try {
                Object[] objArr5 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue()), 0, 333455509};
                byte[] bArr2 = $$d;
                Object[] objArr6 = new Object[1];
                c(bArr2[61], (byte) 38, (byte) (bArr2[55] + 1), objArr6);
                Class<?> cls2 = Class.forName((String) objArr6[0]);
                byte b = (byte) ($$e >>> 2);
                byte b2 = bArr2[35];
                Object[] objArr7 = new Object[1];
                c(b, b2, (byte) (b2 + 2), objArr7);
                objArr = (Object[]) cls2.getMethod((String) objArr7[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr5);
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char offsetAfter2 = (char) (13183 - TextUtils.getOffsetAfter("", 0));
                    int iCombineMeasuredStates = 1649 - View.combineMeasuredStates(0, 0);
                    int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 26;
                    byte[] bArr3 = $$a;
                    Object[] objArr8 = new Object[1];
                    a(bArr3[17], bArr3[65], bArr3[5], objArr8);
                    objRemoteActionCompatParcelizer2 = startForeground.read(offsetAfter2, iCombineMeasuredStates, maximumDrawingCacheSize2, -1033747278, false, (String) objArr8[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer2).set(null, objArr);
                try {
                    Object[] objArr9 = new Object[1];
                    b((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 22, new char[]{33720, 3075, 42150, 10617, 14322, 14454, 50303, 42245, 16860, 61107, 59835, 65435, 38521, 15971, 16853, 6333, 52298, 11548, 18910, 33304, 52598, 653}, objArr9);
                    Class<?> cls3 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    b(16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{20357, 4206, 50176, 46842, 32956, 56335, 13662, 11655, 61497, 38393, 52297, 19393, 4056, 18248, 10000, 5152}, objArr10);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        char cMakeMeasureSpec = (char) (13183 - View.MeasureSpec.makeMeasureSpec(0, 0));
                        int i2 = 1649 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                        int i3 = 27 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        byte b3 = $$a[17];
                        Object[] objArr11 = new Object[1];
                        a(b3, (byte) (b3 | 74), r13[5], objArr11);
                        objRemoteActionCompatParcelizer3 = startForeground.read(cMakeMeasureSpec, i2, i3, 54351865, false, (String) objArr11[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer3).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char c = (char) (13184 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        int trimmedLength = TextUtils.getTrimmedLength("") + 1649;
                        int iAlpha = 26 - Color.alpha(0);
                        byte[] bArr4 = $$a;
                        Object[] objArr12 = new Object[1];
                        a(bArr4[5], bArr4[53], bArr4[17], objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(c, trimmedLength, iAlpha, -133433128, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf2);
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
        } else {
            int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 55;
            onCustomAction = i4 % 128;
            if (i4 % 2 != 0) {
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char cMyPid = (char) ((Process.myPid() >> 22) + 13183);
                    int i5 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1648;
                    int iCombineMeasuredStates2 = 26 - View.combineMeasuredStates(0, 0);
                    byte[] bArr5 = $$a;
                    Object[] objArr13 = new Object[1];
                    a(bArr5[17], bArr5[65], bArr5[5], objArr13);
                    objRemoteActionCompatParcelizer5 = startForeground.read(cMyPid, i5, iCombineMeasuredStates2, -1033747278, false, (String) objArr13[0], null);
                }
                objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer5).get(null);
                int i6 = 67 / 0;
            } else {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer6 == null) {
                    char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 13183);
                    int i7 = 1650 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 27;
                    byte[] bArr6 = $$a;
                    Object[] objArr14 = new Object[1];
                    a(bArr6[17], bArr6[65], bArr6[5], objArr14);
                    objRemoteActionCompatParcelizer6 = startForeground.read(cNormalizeMetaState, i7, modifierMetaStateMask, -1033747278, false, (String) objArr14[0], null);
                }
                objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer6).get(null);
            }
        }
        int i8 = ((int[]) objArr[3])[0];
        int i9 = ((int[]) objArr[2])[0];
        if (i9 != i8) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i8 ^ i9)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) (4535 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), View.combineMeasuredStates(0, 0) + 6054, 42 - (ViewConfiguration.getTouchSlop() >> 8), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer7).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i10 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 55;
                onCustomAction = i10 % 128;
                int i11 = i10 % 2;
                try {
                    Object[] objArr15 = {-930034844, Long.valueOf(j3), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6029, 23 - ExpandableListView.getPackedPositionChild(0L));
                    byte b4 = $$d[35];
                    byte b5 = b4;
                    Object[] objArr16 = new Object[1];
                    c(b5, (byte) (b5 | 23), b4, objArr16);
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
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public final void setContentView(View view) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 83;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        int i4 = onDownloadChanged.RemoteActionCompatParcelizer.read();
        int i5 = onDownloadChanged.RemoteActionCompatParcelizer.read();
        super.setContentView((View) IconCompatParcelizer(onDownloadChanged.RemoteActionCompatParcelizer.read(), i4, i5, onDownloadChanged.RemoteActionCompatParcelizer.read(), -76039767, 76039770, new Object[]{this, 0, view, null}));
        int i6 = onCustomAction + 35;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        readNon255TerminatedValue readnon255terminatedvalue = (readNon255TerminatedValue) objArr[0];
        View view = (View) objArr[1];
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) objArr[2];
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 17;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        int i4 = onDownloadChanged.RemoteActionCompatParcelizer.read();
        int i5 = onDownloadChanged.RemoteActionCompatParcelizer.read();
        super.setContentView((View) IconCompatParcelizer(onDownloadChanged.RemoteActionCompatParcelizer.read(), i4, i5, onDownloadChanged.RemoteActionCompatParcelizer.read(), -76039767, 76039770, new Object[]{readnon255terminatedvalue, 0, view, layoutParams}));
        int i6 = onCustomAction + 103;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 3 / 0;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026 A[PHI: r1
      0x0026: PHI (r1v6 com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout>) = 
      (r1v5 com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout>)
      (r1v7 com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout>)
     binds: [B:10:0x0024, B:7:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setCancelable(boolean r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            super.setCancelable(r4)
            boolean r1 = r3.RemoteActionCompatParcelizer
            if (r1 == r4) goto L32
            int r1 = kotlin.readNon255TerminatedValue.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            int r1 = r1 + 121
            int r2 = r1 % 128
            kotlin.readNon255TerminatedValue.onCustomAction = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L20
            r3.RemoteActionCompatParcelizer = r4
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r1 = r3.AudioAttributesCompatParcelizer
            r2 = 28
            int r2 = r2 / 0
            if (r1 == 0) goto L29
            goto L26
        L20:
            r3.RemoteActionCompatParcelizer = r4
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r1 = r3.AudioAttributesCompatParcelizer
            if (r1 == 0) goto L29
        L26:
            r1.read(r4)
        L29:
            android.view.Window r4 = r3.getWindow()
            if (r4 == 0) goto L32
            r3.AudioAttributesImplApi26Parcelizer()
        L32:
            int r3 = kotlin.readNon255TerminatedValue.onCustomAction
            int r3 = r3 + 73
            int r4 = r3 % 128
            kotlin.readNon255TerminatedValue.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = r4
            int r3 = r3 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.readNon255TerminatedValue.setCancelable(boolean):void");
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        readNon255TerminatedValue readnon255terminatedvalue = (readNon255TerminatedValue) objArr[0];
        int i = 2 % 2;
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = readnon255terminatedvalue.AudioAttributesCompatParcelizer;
        if (bottomSheetBehavior != null) {
            int i2 = onCustomAction + 17;
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
            if (i2 % 2 != 0 ? bottomSheetBehavior.AudioAttributesImplBaseParcelizer() == 5 : bottomSheetBehavior.AudioAttributesImplBaseParcelizer() == 4) {
                readnon255terminatedvalue.AudioAttributesCompatParcelizer.IconCompatParcelizer(4);
            }
        }
        int i3 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 15;
        onCustomAction = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    @Override // android.app.Dialog, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAttachedToWindow() {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            super.onAttachedToWindow()
            android.view.Window r1 = r8.getWindow()
            if (r1 == 0) goto L67
            int r2 = kotlin.readNon255TerminatedValue.onCustomAction
            int r3 = r2 + 53
            int r4 = r3 % 128
            kotlin.readNon255TerminatedValue.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = r4
            int r3 = r3 % r0
            boolean r3 = r8.RatingCompat
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L30
            int r2 = r2 + 69
            int r3 = r2 % 128
            kotlin.readNon255TerminatedValue.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = r3
            int r2 = r2 % r0
            int r2 = r1.getNavigationBarColor()
            int r2 = android.graphics.Color.alpha(r2)
            r3 = 255(0xff, float:3.57E-43)
            if (r2 >= r3) goto L30
            r2 = r5
            goto L31
        L30:
            r2 = r4
        L31:
            android.widget.FrameLayout r3 = r8.MediaBrowserCompatCustomActionResultReceiver
            if (r3 == 0) goto L3a
            r6 = r2 ^ 1
            r3.setFitsSystemWindows(r6)
        L3a:
            androidx.coordinatorlayout.widget.CoordinatorLayout r3 = r8.MediaBrowserCompatItemReceiver
            if (r3 == 0) goto L4c
            int r6 = kotlin.readNon255TerminatedValue.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            int r6 = r6 + 111
            int r7 = r6 % 128
            kotlin.readNon255TerminatedValue.onCustomAction = r7
            int r6 = r6 % r0
            r6 = r2 ^ 1
            r3.setFitsSystemWindows(r6)
        L4c:
            r2 = r2 ^ r5
            kotlin._IsXOfY.write(r1, r2)
            o.readNon255TerminatedValue$write r2 = r8.MediaBrowserCompatMediaItem
            if (r2 == 0) goto L67
            int r3 = kotlin.readNon255TerminatedValue.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            int r3 = r3 + 19
            int r5 = r3 % 128
            kotlin.readNon255TerminatedValue.onCustomAction = r5
            int r3 = r3 % r0
            if (r3 == 0) goto L64
            r2.AudioAttributesCompatParcelizer(r1)
            int r0 = r0 / r4
            goto L67
        L64:
            r2.AudioAttributesCompatParcelizer(r1)
        L67:
            r8.AudioAttributesImplApi26Parcelizer()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.readNon255TerminatedValue.onAttachedToWindow():void");
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        int i = 2 % 2;
        write writeVar = this.MediaBrowserCompatMediaItem;
        if (writeVar != null) {
            int i2 = onCustomAction + 93;
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
            if (i2 % 2 != 0) {
                writeVar.AudioAttributesCompatParcelizer((Window) null);
            } else {
                writeVar.AudioAttributesCompatParcelizer((Window) null);
                throw null;
            }
        }
        FlacStreamMetadata flacStreamMetadata = this.read;
        if (flacStreamMetadata != null) {
            int i3 = onCustomAction + 75;
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i3 % 128;
            if (i3 % 2 != 0) {
                flacStreamMetadata.IconCompatParcelizer();
            } else {
                flacStreamMetadata.IconCompatParcelizer();
                int i4 = 19 / 0;
            }
        }
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        readNon255TerminatedValue readnon255terminatedvalue = (readNon255TerminatedValue) objArr[0];
        int i = 2 % 2;
        int i2 = onCustomAction + 67;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            readnon255terminatedvalue.RemoteActionCompatParcelizer();
            boolean z = readnon255terminatedvalue.AudioAttributesImplBaseParcelizer;
            super.cancel();
            int i3 = 86 / 0;
            return null;
        }
        readnon255terminatedvalue.RemoteActionCompatParcelizer();
        boolean z2 = readnon255terminatedvalue.AudioAttributesImplBaseParcelizer;
        super.cancel();
        return null;
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 83;
        onCustomAction = i2 % 128;
        if (i2 % 2 == 0) {
            super.setCanceledOnTouchOutside(z);
            if (z) {
                int i3 = onCustomAction + 13;
                int i4 = i3 % 128;
                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4;
                if (i3 % 2 != 0) {
                    if (!this.RemoteActionCompatParcelizer) {
                        int i5 = i4 + 105;
                        onCustomAction = i5 % 128;
                        if (i5 % 2 != 0) {
                            this.RemoteActionCompatParcelizer = false;
                        } else {
                            this.RemoteActionCompatParcelizer = true;
                        }
                    }
                } else {
                    throw null;
                }
            }
            this.AudioAttributesImplApi26Parcelizer = z;
            this.AudioAttributesImplApi21Parcelizer = true;
            int i6 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 105;
            onCustomAction = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            return;
        }
        super.setCanceledOnTouchOutside(z);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> RemoteActionCompatParcelizer() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.readNon255TerminatedValue.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            int r1 = r1 + 117
            int r2 = r1 % 128
            kotlin.readNon255TerminatedValue.onCustomAction = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L17
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r1 = r3.AudioAttributesCompatParcelizer
            r2 = 60
            int r2 = r2 / 0
            if (r1 != 0) goto L1e
            goto L1b
        L17:
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r1 = r3.AudioAttributesCompatParcelizer
            if (r1 != 0) goto L1e
        L1b:
            r3.MediaBrowserCompatCustomActionResultReceiver()
        L1e:
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r3 = r3.AudioAttributesCompatParcelizer
            int r1 = kotlin.readNon255TerminatedValue.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            int r1 = r1 + 47
            int r2 = r1 % 128
            kotlin.readNon255TerminatedValue.onCustomAction = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L2c
            return r3
        L2c:
            r3 = 0
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.readNon255TerminatedValue.RemoteActionCompatParcelizer():com.google.android.material.bottomsheet.BottomSheetBehavior");
    }

    public final boolean IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 25;
        int i3 = i2 % 128;
        onCustomAction = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.AudioAttributesImplBaseParcelizer;
        int i4 = i3 + 21;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    static class write extends BottomSheetBehavior.write {
        private final Boolean AudioAttributesCompatParcelizer;
        private final WindowInsetsCompat IconCompatParcelizer;
        private Window RemoteActionCompatParcelizer;
        private boolean read;

        /* synthetic */ write(View view, WindowInsetsCompat windowInsetsCompat, byte b) {
            this(view, windowInsetsCompat);
        }

        private write(View view, WindowInsetsCompat windowInsetsCompat) {
            ColorStateList colorStateListWrite;
            this.IconCompatParcelizer = windowInsetsCompat;
            frameSizeBytesByTypeNb framesizebytesbytypenbRemoteActionCompatParcelizer = BottomSheetBehavior.AudioAttributesCompatParcelizer(view).RemoteActionCompatParcelizer();
            if (framesizebytesbytypenbRemoteActionCompatParcelizer != null) {
                colorStateListWrite = framesizebytesbytypenbRemoteActionCompatParcelizer.onPlay();
            } else {
                colorStateListWrite = InvalidTypeIdException.write(view);
            }
            if (colorStateListWrite != null) {
                this.AudioAttributesCompatParcelizer = Boolean.valueOf(createExtractors.IconCompatParcelizer(colorStateListWrite.getDefaultColor()));
                return;
            }
            Integer numRemoteActionCompatParcelizer = checkAndPeekStreamMarker.RemoteActionCompatParcelizer(view);
            if (numRemoteActionCompatParcelizer != null) {
                this.AudioAttributesCompatParcelizer = Boolean.valueOf(createExtractors.IconCompatParcelizer(numRemoteActionCompatParcelizer.intValue()));
            } else {
                this.AudioAttributesCompatParcelizer = null;
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.write
        public final void onStateChanged(View view, int i) {
            AudioAttributesCompatParcelizer(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.write
        public final void onSlide(View view, float f) {
            AudioAttributesCompatParcelizer(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.write
        public final void onLayout(View view) {
            AudioAttributesCompatParcelizer(view);
        }

        final void AudioAttributesCompatParcelizer(Window window) {
            if (this.RemoteActionCompatParcelizer != window) {
                this.RemoteActionCompatParcelizer = window;
                if (window != null) {
                    this.read = _IsXOfY.IconCompatParcelizer(window, window.getDecorView()).read();
                }
            }
        }

        private void AudioAttributesCompatParcelizer(View view) {
            if (view.getTop() < this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
                Window window = this.RemoteActionCompatParcelizer;
                if (window != null) {
                    Boolean bool = this.AudioAttributesCompatParcelizer;
                    ExtractorOutput1.IconCompatParcelizer(window, bool == null ? this.read : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.RemoteActionCompatParcelizer;
                if (window2 != null) {
                    ExtractorOutput1.IconCompatParcelizer(window2, this.read);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }
    }

    private FrameLayout MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 89;
        onCustomAction = i2 % 128;
        int i3 = i2 % 2;
        if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.design_bottom_sheet_dialog, null);
            this.MediaBrowserCompatCustomActionResultReceiver = frameLayout;
            this.MediaBrowserCompatItemReceiver = (CoordinatorLayout) frameLayout.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.MediaBrowserCompatCustomActionResultReceiver.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.design_bottom_sheet);
            this.IconCompatParcelizer = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorAudioAttributesCompatParcelizer = BottomSheetBehavior.AudioAttributesCompatParcelizer(frameLayout2);
            this.AudioAttributesCompatParcelizer = bottomSheetBehaviorAudioAttributesCompatParcelizer;
            bottomSheetBehaviorAudioAttributesCompatParcelizer.read(this.write);
            this.AudioAttributesCompatParcelizer.read(this.RemoteActionCompatParcelizer);
            this.read = new FlacStreamMetadata(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer);
            int i4 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 9;
            onCustomAction = i4 % 128;
            int i5 = i4 % 2;
        }
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        readNon255TerminatedValue readnon255terminatedvalue = (readNon255TerminatedValue) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        View viewInflate = (View) objArr[2];
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) objArr[3];
        int i = 2 % 2;
        readnon255terminatedvalue.MediaBrowserCompatCustomActionResultReceiver();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) readnon255terminatedvalue.MediaBrowserCompatCustomActionResultReceiver.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.coordinator);
        if (iIntValue != 0 && viewInflate == null) {
            int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 17;
            onCustomAction = i2 % 128;
            int i3 = i2 % 2;
            viewInflate = readnon255terminatedvalue.getLayoutInflater().inflate(iIntValue, (ViewGroup) coordinatorLayout, false);
        }
        if (readnon255terminatedvalue.RatingCompat) {
            InvalidTypeIdException.read(readnon255terminatedvalue.IconCompatParcelizer, new finishBranchObject() { // from class: o.readNon255TerminatedValue.3
                @Override // kotlin.finishBranchObject
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    if (readNon255TerminatedValue.read(readNon255TerminatedValue.this) != null) {
                        readNon255TerminatedValue.AudioAttributesCompatParcelizer(readNon255TerminatedValue.this).RemoteActionCompatParcelizer(readNon255TerminatedValue.read(readNon255TerminatedValue.this));
                    }
                    if (windowInsetsCompat != null) {
                        readNon255TerminatedValue readnon255terminatedvalue2 = readNon255TerminatedValue.this;
                        readNon255TerminatedValue.read(readnon255terminatedvalue2, new write(readNon255TerminatedValue.write(readnon255terminatedvalue2), windowInsetsCompat, (byte) 0));
                        readNon255TerminatedValue.read(readNon255TerminatedValue.this).AudioAttributesCompatParcelizer(readNon255TerminatedValue.this.getWindow());
                        readNon255TerminatedValue.AudioAttributesCompatParcelizer(readNon255TerminatedValue.this).read(readNon255TerminatedValue.read(readNon255TerminatedValue.this));
                    }
                    return windowInsetsCompat;
                }
            });
        }
        readnon255terminatedvalue.IconCompatParcelizer.removeAllViews();
        if (layoutParams == null) {
            readnon255terminatedvalue.IconCompatParcelizer.addView(viewInflate);
        } else {
            readnon255terminatedvalue.IconCompatParcelizer.addView(viewInflate, layoutParams);
        }
        coordinatorLayout.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.touch_outside).setOnClickListener(new View.OnClickListener() { // from class: o.readNon255TerminatedValue.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (readNon255TerminatedValue.this.RemoteActionCompatParcelizer && readNon255TerminatedValue.this.isShowing() && readNon255TerminatedValue.this.AudioAttributesImplApi21Parcelizer()) {
                    readNon255TerminatedValue.this.cancel();
                }
            }
        });
        InvalidTypeIdException.AudioAttributesCompatParcelizer(readnon255terminatedvalue.IconCompatParcelizer, new deserializeUsingCustom() { // from class: o.readNon255TerminatedValue.4
            @Override // kotlin.deserializeUsingCustom
            public final void onInitializeAccessibilityNodeInfo(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
                super.onInitializeAccessibilityNodeInfo(view, hassuperclassstartingwith);
                if (readNon255TerminatedValue.this.RemoteActionCompatParcelizer) {
                    hassuperclassstartingwith.AudioAttributesCompatParcelizer(ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    hassuperclassstartingwith.MediaBrowserCompatItemReceiver(true);
                } else {
                    hassuperclassstartingwith.MediaBrowserCompatItemReceiver(false);
                }
            }

            @Override // kotlin.deserializeUsingCustom
            public final boolean performAccessibilityAction(View view, int i4, Bundle bundle) {
                if (i4 == 1048576 && readNon255TerminatedValue.this.RemoteActionCompatParcelizer) {
                    readNon255TerminatedValue.this.cancel();
                    return true;
                }
                return super.performAccessibilityAction(view, i4, bundle);
            }
        });
        readnon255terminatedvalue.IconCompatParcelizer.setOnTouchListener(new View.OnTouchListener() { // from class: o.readNon255TerminatedValue.5
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        FrameLayout frameLayout = readnon255terminatedvalue.MediaBrowserCompatCustomActionResultReceiver;
        int i4 = onCustomAction + 109;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return frameLayout;
    }

    private void AudioAttributesImplApi26Parcelizer() {
        FlacStreamMetadata flacStreamMetadata;
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = i2 + 73;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i3 % 128;
        if (i3 % 2 == 0) {
            flacStreamMetadata = this.read;
            int i4 = 28 / 0;
            if (flacStreamMetadata == null) {
                return;
            }
        } else {
            flacStreamMetadata = this.read;
            if (flacStreamMetadata == null) {
                return;
            }
        }
        if (this.RemoteActionCompatParcelizer) {
            int i5 = i2 + 89;
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i5 % 128;
            int i6 = i5 % 2;
            flacStreamMetadata.RemoteActionCompatParcelizer();
            return;
        }
        flacStreamMetadata.IconCompatParcelizer();
    }

    final boolean AudioAttributesImplApi21Parcelizer() {
        TypedArray typedArrayObtainStyledAttributes;
        boolean z;
        int i = 2 % 2;
        if (!this.AudioAttributesImplApi21Parcelizer) {
            int i2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 29;
            onCustomAction = i2 % 128;
            if (i2 % 2 != 0) {
                Context context = getContext();
                int[] iArr = new int[1];
                iArr[1] = 16843611;
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
                z = typedArrayObtainStyledAttributes.getBoolean(1, true);
            } else {
                typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                z = typedArrayObtainStyledAttributes.getBoolean(0, true);
            }
            this.AudioAttributesImplApi26Parcelizer = z;
            typedArrayObtainStyledAttributes.recycle();
            this.AudioAttributesImplApi21Parcelizer = true;
            int i3 = onCustomAction + 25;
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i3 % 128;
            int i4 = i3 % 2;
        }
        return this.AudioAttributesImplApi26Parcelizer;
    }

    private static int read(Context context, int i) {
        int i2 = 2 % 2;
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(calculateNextSearchBytePosition.IconCompatParcelizer.bottomSheetDialogTheme, typedValue, true)) {
            int i3 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 13;
            onCustomAction = i3 % 128;
            int i4 = i3 % 2;
            return typedValue.resourceId;
        }
        int i5 = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Theme_Design_Light_BottomSheetDialog;
        int i6 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 107;
        onCustomAction = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    final void write() {
        int i = 2 % 2;
        int i2 = onCustomAction + 91;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.write);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.write);
        int i3 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 53;
        onCustomAction = i3 % 128;
        int i4 = i3 % 2;
    }

    private View RemoteActionCompatParcelizer(int i, View view, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {this, Integer.valueOf(i), view, layoutParams};
        return (View) IconCompatParcelizer(onDownloadChanged.RemoteActionCompatParcelizer.read(), onDownloadChanged.RemoteActionCompatParcelizer.read(), onDownloadChanged.RemoteActionCompatParcelizer.read(), onDownloadChanged.RemoteActionCompatParcelizer.read(), -76039767, 76039770, objArr);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        int i = onDownloadChanged.RemoteActionCompatParcelizer.read();
        int i2 = onDownloadChanged.RemoteActionCompatParcelizer.read();
        IconCompatParcelizer(onDownloadChanged.RemoteActionCompatParcelizer.read(), i, i2, onDownloadChanged.RemoteActionCompatParcelizer.read(), 1305218408, -1305218407, new Object[]{this});
    }

    @Override // kotlin.onFastForward, android.app.Dialog
    public final void onStart() {
        int i = onDownloadChanged.RemoteActionCompatParcelizer.read();
        int i2 = onDownloadChanged.RemoteActionCompatParcelizer.read();
        IconCompatParcelizer(onDownloadChanged.RemoteActionCompatParcelizer.read(), i, i2, onDownloadChanged.RemoteActionCompatParcelizer.read(), -839316778, 839316780, new Object[]{this});
    }

    @Override // kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        int i = onDownloadChanged.RemoteActionCompatParcelizer.read();
        int i2 = onDownloadChanged.RemoteActionCompatParcelizer.read();
        IconCompatParcelizer(onDownloadChanged.RemoteActionCompatParcelizer.read(), i, i2, onDownloadChanged.RemoteActionCompatParcelizer.read(), 1535892021, -1535892021, new Object[]{this, view, layoutParams});
    }
}
