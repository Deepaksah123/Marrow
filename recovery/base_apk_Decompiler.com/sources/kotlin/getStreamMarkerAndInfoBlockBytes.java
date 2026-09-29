package kotlin;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.timepicker.TimeModel;
import com.google.android.material.timepicker.TimePickerView;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.calculateNextSearchBytePosition;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final class getStreamMarkerAndInfoBlockBytes extends argCount implements TimePickerView.read {
    private int AudioAttributesImplApi21Parcelizer;
    private MaterialButton AudioAttributesImplApi26Parcelizer;
    private parseHeader IconCompatParcelizer;
    private CharSequence MediaBrowserCompatItemReceiver;
    private CharSequence MediaBrowserCompatSearchResultReceiver;
    private ViewStub MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private Button RemoteActionCompatParcelizer;
    private FlacExtractorExternalSyntheticLambda0 handleMediaPlayPauseIfPendingOnHandler;
    private TimePickerView onAddQueueItem;
    private FlvExtractor onCommand;
    private TimeModel onCustomAction;
    private CharSequence onMediaButtonEvent;
    private int write;
    private static final byte[] $$c = {36, 0, 10, -55};
    private static final int $$f = 206;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {TarConstants.LF_GNUTYPE_LONGLINK, 28, -90, 102, -13, 1, 62, -58, -9, -1, 7, -6, 6, TarConstants.LF_FIFO, -52, -14, 9, -15, 2, 5, 4, TarConstants.LF_DIR, -64, 11, -20, 14, -14, 8, 7, -12, 61, -71, 18, -2, -18, 68, -39, -14, -2, 21, -22, -25, 9, -7, 0, 79, -79, 12, 3, -4, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 248;
    private static final byte[] $$a = {14, -10, 42, -103, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 91;
    private static int onPrepareFromSearch = 0;
    private static int onPlayFromSearch = 1;
    private static char onFastForward = 56474;
    private static char onPlayFromMediaId = 29809;
    private static char onPlay = 28380;
    private static char onPrepare = 63705;
    private final Set<View.OnClickListener> MediaDescriptionCompat = new LinkedHashSet();
    private final Set<View.OnClickListener> MediaBrowserCompatCustomActionResultReceiver = new LinkedHashSet();
    private final Set<DialogInterface.OnCancelListener> read = new LinkedHashSet();
    private final Set<DialogInterface.OnDismissListener> AudioAttributesCompatParcelizer = new LinkedHashSet();
    private int onPause = 0;
    private int MediaMetadataCompat = 0;
    private int RatingCompat = 0;
    private int AudioAttributesImplBaseParcelizer = 0;
    private int MediaBrowserCompatMediaItem = 0;

    private static String $$g(byte b, short s, byte b2) {
        byte[] bArr = $$c;
        int i = b * 2;
        int i2 = 4 - (b2 * 2);
        int i3 = (s * 3) + 122;
        byte[] bArr2 = new byte[1 - i];
        int i4 = 0 - i;
        int i5 = -1;
        if (bArr == null) {
            i3 += -i2;
            i2++;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            int i7 = i2;
            i3 += -bArr[i2];
            i2 = i7 + 1;
            i5 = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r7 = r7 * 10
            int r7 = 44 - r7
            byte[] r0 = kotlin.getStreamMarkerAndInfoBlockBytes.$$a
            int r6 = r6 * 12
            int r6 = 77 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2c
        L15:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r8
            int r6 = r6 + 1
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r4 = r0[r6]
        L2c:
            int r8 = r8 + r4
            int r8 = r8 + (-1)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getStreamMarkerAndInfoBlockBytes.a(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = kotlin.getStreamMarkerAndInfoBlockBytes.$$d
            int r1 = r7 + 20
            int r6 = r6 + 73
            byte[] r1 = new byte[r1]
            int r7 = r7 + 19
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2b
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + (-1)
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getStreamMarkerAndInfoBlockBytes.c(short, int, int, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object read(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i5;
        int i8 = (~(i7 | i2)) | i3;
        int i9 = ~i3;
        int i10 = ~(i7 | i9);
        int i11 = ~i2;
        int i12 = i10 | (~(i9 | i11));
        int i13 = (~(i2 | i9)) | (~(i7 | i11));
        int i14 = i5 + i3 + i6 + (417615942 * i) + (566850886 * i4);
        int i15 = i14 * i14;
        int i16 = ((-370608051) * i5) + 147849216 + ((-2147356519) * i3) + (i8 * 1776748468) + (i12 * 1776748468) + (1776748468 * i13) + (1406140416 * i6) + ((-354418688) * i) + ((-85983232) * i4) + ((-608960512) * i15);
        int i17 = (i5 * (-1357469509)) + 140661806 + (i3 * (-1357469617)) + (i8 * 108) + (i12 * 108) + (i13 * 108) + (i6 * (-1357469401)) + (i * 1137340586) + (i4 * 304092074) + (i15 * 1282146304);
        int i18 = i16 + (i17 * i17 * 1158414336);
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? RemoteActionCompatParcelizer(objArr) : read(objArr) : write(objArr) : IconCompatParcelizer(objArr);
    }

    static /* synthetic */ Set IconCompatParcelizer(getStreamMarkerAndInfoBlockBytes getstreammarkerandinfoblockbytes) {
        int i = 2 % 2;
        int i2 = onPlayFromSearch + 69;
        int i3 = i2 % 128;
        onPrepareFromSearch = i3;
        int i4 = i2 % 2;
        Set<View.OnClickListener> set = getstreammarkerandinfoblockbytes.MediaBrowserCompatCustomActionResultReceiver;
        int i5 = i3 + 43;
        onPlayFromSearch = i5 % 128;
        int i6 = i5 % 2;
        return set;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        getStreamMarkerAndInfoBlockBytes getstreammarkerandinfoblockbytes = (getStreamMarkerAndInfoBlockBytes) objArr[0];
        int i = 2 % 2;
        int i2 = onPrepareFromSearch + 61;
        onPlayFromSearch = i2 % 128;
        int i3 = i2 % 2;
        MaterialButton materialButton = getstreammarkerandinfoblockbytes.AudioAttributesImplApi26Parcelizer;
        if (i3 != 0) {
            return materialButton;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ Set RemoteActionCompatParcelizer(getStreamMarkerAndInfoBlockBytes getstreammarkerandinfoblockbytes) {
        int i = 2 % 2;
        int i2 = onPrepareFromSearch;
        int i3 = i2 + 109;
        onPlayFromSearch = i3 % 128;
        int i4 = i3 % 2;
        Set<View.OnClickListener> set = getstreammarkerandinfoblockbytes.MediaDescriptionCompat;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 37;
        onPlayFromSearch = i5 % 128;
        int i6 = i5 % 2;
        return set;
    }

    static /* synthetic */ int read(getStreamMarkerAndInfoBlockBytes getstreammarkerandinfoblockbytes) {
        int i = 2 % 2;
        int i2 = onPrepareFromSearch;
        int i3 = i2 + 29;
        onPlayFromSearch = i3 % 128;
        int i4 = i3 % 2;
        int i5 = getstreammarkerandinfoblockbytes.AudioAttributesImplBaseParcelizer;
        int i6 = i2 + 39;
        onPlayFromSearch = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    static /* synthetic */ int read(getStreamMarkerAndInfoBlockBytes getstreammarkerandinfoblockbytes, int i) {
        int i2 = 2 % 2;
        int i3 = onPlayFromSearch;
        int i4 = i3 + 39;
        onPrepareFromSearch = i4 % 128;
        int i5 = i4 % 2;
        getstreammarkerandinfoblockbytes.AudioAttributesImplBaseParcelizer = i;
        int i6 = i3 + 33;
        onPrepareFromSearch = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 98 / 0;
        }
        return i;
    }

    static /* synthetic */ void read(getStreamMarkerAndInfoBlockBytes getstreammarkerandinfoblockbytes, MaterialButton materialButton) {
        int i = 2 % 2;
        int i2 = onPlayFromSearch + 13;
        onPrepareFromSearch = i2 % 128;
        int i3 = i2 % 2;
        getstreammarkerandinfoblockbytes.IconCompatParcelizer(materialButton);
        int i4 = onPrepareFromSearch + 3;
        onPlayFromSearch = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        while (isstopped.read < cArr.length) {
            int i5 = $10 + 57;
            $11 = i5 % 128;
            if (i5 % i3 == 0) {
                cArr3[0] = cArr[isstopped.read];
                int i6 = isstopped.read;
                cArr3[0] = cArr[0];
            } else {
                cArr3[0] = cArr[isstopped.read];
                cArr3[1] = cArr[isstopped.read + 1];
            }
            int i7 = 58224;
            int i8 = 0;
            while (i8 < 16) {
                int i9 = $10 + 65;
                $11 = i9 % 128;
                int i10 = i9 % i3;
                char c = cArr3[1];
                char c2 = cArr3[0];
                int i11 = (c2 + i7) ^ ((c2 << 4) + ((char) (((long) onPlay) ^ 1193402106669854891L)));
                int i12 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onPrepare);
                    objArr2[i3] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[0] = Integer.valueOf(c);
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                        int i13 = 1505 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int iIndexOf = 20 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        byte b = $$c[1];
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read(cLastIndexOf, i13, iIndexOf, 1322448859, false, $$g(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) onFastForward) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onPlayFromMediaId)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        int i14 = 1504 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                        int iCombineMeasuredStates = 21 - View.combineMeasuredStates(0, 0);
                        byte b3 = $$c[1];
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), i14, iCombineMeasuredStates, 1322448859, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
                    i3 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[isstopped.read] = cArr3[0];
            cArr2[isstopped.read + 1] = cArr3[1];
            Object[] objArr4 = {isstopped, isstopped};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-167774474);
            if (objRemoteActionCompatParcelizer3 == null) {
                i2 = 2;
                objRemoteActionCompatParcelizer3 = startForeground.read((char) TextUtils.getOffsetBefore("", 0), 9016 - Color.red(0), Drawable.resolveOpacity(0, 0) + 58, -1950993821, false, "D", new Class[]{Object.class, Object.class});
            } else {
                i2 = 2;
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            i3 = i2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // kotlin.argCount
    public final Dialog onCreateDialog(Bundle bundle) {
        int i = 2 % 2;
        Dialog dialog = new Dialog(requireContext(), AudioAttributesCompatParcelizer());
        Context context = dialog.getContext();
        frameSizeBytesByTypeNb framesizebytesbytypenb = new frameSizeBytesByTypeNb(context, null, calculateNextSearchBytePosition.IconCompatParcelizer.materialTimePickerStyle, calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_MaterialComponents_TimePicker);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialTimePicker, calculateNextSearchBytePosition.IconCompatParcelizer.materialTimePickerStyle, calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_MaterialComponents_TimePicker);
        this.write = typedArrayObtainStyledAttributes.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialTimePicker_clockIcon, 0);
        this.AudioAttributesImplApi21Parcelizer = typedArrayObtainStyledAttributes.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialTimePicker_keyboardIcon, 0);
        int color = typedArrayObtainStyledAttributes.getColor(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialTimePicker_backgroundTint, 0);
        typedArrayObtainStyledAttributes.recycle();
        framesizebytesbytypenb.RemoteActionCompatParcelizer(context);
        framesizebytesbytypenb.AudioAttributesImplApi21Parcelizer(ColorStateList.valueOf(color));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(framesizebytesbytypenb);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        framesizebytesbytypenb.handleMediaPlayPauseIfPendingOnHandler(InvalidTypeIdException.AudioAttributesImplBaseParcelizer(window.getDecorView()));
        int i2 = onPlayFromSearch + 17;
        onPrepareFromSearch = i2 % 128;
        if (i2 % 2 == 0) {
            return dialog;
        }
        throw null;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) throws Throwable {
        Object[] objArr2;
        getStreamMarkerAndInfoBlockBytes getstreammarkerandinfoblockbytes = (getStreamMarkerAndInfoBlockBytes) objArr[0];
        Bundle arguments = (Bundle) objArr[1];
        int i = 2 % 2;
        int i2 = onPlayFromSearch + 87;
        onPrepareFromSearch = i2 % 128;
        int i3 = i2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char cMyPid = (char) (13183 - (Process.myPid() >> 22));
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1649;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 27;
            byte b = $$a[5];
            Object[] objArr3 = new Object[1];
            a(b, b, r6[17], objArr3);
            objRemoteActionCompatParcelizer = startForeground.read(cMyPid, keyRepeatDelay, iLastIndexOf, -133433128, false, (String) objArr3[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            int i4 = onPlayFromSearch + 55;
            onPrepareFromSearch = i4 % 128;
            if (i4 % 2 != 0) {
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 13183);
                    int i5 = 1650 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    int trimmedLength = 26 - TextUtils.getTrimmedLength("");
                    byte b2 = $$a[53];
                    Object[] objArr4 = new Object[1];
                    a(b2, b2, r8[2], objArr4);
                    objRemoteActionCompatParcelizer2 = startForeground.read(minimumFlingVelocity, i5, trimmedLength, -1033747278, false, (String) objArr4[0], null);
                }
                objArr2 = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
                int i6 = 29 / 0;
            } else {
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char c = (char) ((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13183);
                    int i7 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1648;
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 27;
                    byte b3 = $$a[53];
                    Object[] objArr5 = new Object[1];
                    a(b3, b3, r8[2], objArr5);
                    objRemoteActionCompatParcelizer3 = startForeground.read(c, i7, iLastIndexOf2, -1033747278, false, (String) objArr5[0], null);
                }
                objArr2 = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
            }
        } else {
            Object[] objArr6 = new Object[1];
            b(16 - Color.green(0), new char[]{31011, 53847, 31520, 63480, 17442, 32669, 53511, 317, 17533, 64198, 53563, 26118, 19637, 39288, 65171, 13990}, objArr6);
            Class<?> cls = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            b(16 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), new char[]{21621, 11416, 57971, 15460, 23143, 52071, 31163, 33121, 53281, 23472, 29697, 13042, 3006, 23405, 4548, 39929}, objArr7);
            int iIntValue = ((Integer) cls.getMethod((String) objArr7[0], Object.class).invoke(null, getstreammarkerandinfoblockbytes)).intValue();
            int i8 = onPrepareFromSearch + 89;
            onPlayFromSearch = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr8 = {Integer.valueOf(iIntValue), 0, 1869685775};
                byte[] bArr = $$d;
                Object[] objArr9 = new Object[1];
                c((byte) 26, (byte) (-bArr[50]), bArr[9], objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                byte b4 = bArr[44];
                Object[] objArr10 = new Object[1];
                c(b4, b4, (byte) (-bArr[54]), objArr10);
                objArr2 = (Object[]) cls2.getMethod((String) objArr10[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char scrollBarFadeDuration = (char) (13183 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 1649;
                    int i10 = 26 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    byte b5 = $$a[53];
                    Object[] objArr11 = new Object[1];
                    a(b5, b5, r9[2], objArr11);
                    objRemoteActionCompatParcelizer4 = startForeground.read(scrollBarFadeDuration, capsMode, i10, -1033747278, false, (String) objArr11[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer4).set(null, objArr2);
                try {
                    Object[] objArr12 = new Object[1];
                    b(View.resolveSize(0, 0) + 22, new char[]{53511, 317, 21335, 58001, 42519, 9199, 64182, 849, 1908, 37160, 14877, 30843, 57980, 6960, 26803, 21219, 62674, 15150, 39746, 58816, 43407, 19046}, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    b(15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{26016, 20630, 5219, 44291, 28433, 5142, 19720, 19808, 40054, 44851, 49220, 14735, 63157, 22221, 47631, 20608}, objArr13);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char c2 = (char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13182);
                        int iRgb = Color.rgb(0, 0, 0) + 16778865;
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 27;
                        byte b6 = $$a[53];
                        byte b7 = b6;
                        Object[] objArr14 = new Object[1];
                        a(b6, b7, (byte) (b7 | 74), objArr14);
                        objRemoteActionCompatParcelizer5 = startForeground.read(c2, iRgb, iIndexOf, 54351865, false, (String) objArr14[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 13184);
                        int iGreen = Color.green(0) + 1649;
                        int i11 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 25;
                        byte b8 = $$a[5];
                        Object[] objArr15 = new Object[1];
                        a(b8, b8, r8[17], objArr15);
                        objRemoteActionCompatParcelizer6 = startForeground.read(packedPositionChild, iGreen, i11, -133433128, false, (String) objArr15[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i12 = ((int[]) objArr2[3])[0];
        int i13 = ((int[]) objArr2[2])[0];
        if (i13 != i12) {
            long j = -1;
            long j2 = ((long) (i13 ^ i12)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 4536), (ViewConfiguration.getJumpTapTimeout() >> 16) + 6054, Color.red(0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer7).invoke(null, null);
                try {
                    Object[] objArr16 = {-755285907, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) TextUtils.getCapsMode("", 0, 0), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6030, 23 - TextUtils.lastIndexOf("", '0'));
                    Object[] objArr17 = new Object[1];
                    c(r7[16], r7[27], (byte) (-$$d[22]), objArr17);
                    cls4.getMethod((String) objArr17[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr16);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
        }
        super.onCreate(arguments);
        if (arguments == null) {
            int i14 = onPlayFromSearch + 9;
            onPrepareFromSearch = i14 % 128;
            int i15 = i14 % 2;
            arguments = getstreammarkerandinfoblockbytes.getArguments();
        }
        getstreammarkerandinfoblockbytes.read(arguments);
        return null;
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onPlayFromSearch + 7;
        onPrepareFromSearch = i2 % 128;
        int i3 = i2 % 2;
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.onCustomAction);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.AudioAttributesImplBaseParcelizer);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.onPause);
        bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", this.onMediaButtonEvent);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.MediaMetadataCompat);
        bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.MediaBrowserCompatSearchResultReceiver);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.RatingCompat);
        bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.MediaBrowserCompatItemReceiver);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.MediaBrowserCompatMediaItem);
        int i4 = onPlayFromSearch + 49;
        onPrepareFromSearch = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private void read(Bundle bundle) {
        int i = 2 % 2;
        int i2 = onPrepareFromSearch + 23;
        onPlayFromSearch = i2 % 128;
        int i3 = i2 % 2;
        if (bundle == null) {
            return;
        }
        TimeModel timeModel = (TimeModel) bundle.getParcelable("TIME_PICKER_TIME_MODEL");
        this.onCustomAction = timeModel;
        if (timeModel == null) {
            this.onCustomAction = new TimeModel();
        }
        int i4 = 1;
        if (this.onCustomAction.RemoteActionCompatParcelizer != 1) {
            int i5 = onPrepareFromSearch + 113;
            onPlayFromSearch = i5 % 128;
            int i6 = i5 % 2;
            i4 = 0;
        }
        this.AudioAttributesImplBaseParcelizer = bundle.getInt("TIME_PICKER_INPUT_MODE", i4);
        this.onPause = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
        this.onMediaButtonEvent = bundle.getCharSequence("TIME_PICKER_TITLE_TEXT");
        this.MediaMetadataCompat = bundle.getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
        this.MediaBrowserCompatSearchResultReceiver = bundle.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");
        this.RatingCompat = bundle.getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
        this.MediaBrowserCompatItemReceiver = bundle.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");
        this.MediaBrowserCompatMediaItem = bundle.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = onPlayFromSearch + 85;
        onPrepareFromSearch = i2 % 128;
        int i3 = i2 % 2;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.material_timepicker_view);
        this.onAddQueueItem = timePickerView;
        timePickerView.read(this);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = (ViewStub) viewGroup2.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.material_textinput_timepicker);
        this.AudioAttributesImplApi26Parcelizer = (MaterialButton) viewGroup2.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.header_title);
        int i4 = this.onPause;
        if (i4 != 0) {
            textView.setText(i4);
        } else if (!TextUtils.isEmpty(this.onMediaButtonEvent)) {
            int i5 = onPlayFromSearch + 1;
            onPrepareFromSearch = i5 % 128;
            int i6 = i5 % 2;
            textView.setText(this.onMediaButtonEvent);
        }
        IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        Button button = (Button) viewGroup2.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.material_timepicker_ok_button);
        button.setOnClickListener(new View.OnClickListener() { // from class: o.getStreamMarkerAndInfoBlockBytes.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Iterator it = getStreamMarkerAndInfoBlockBytes.RemoteActionCompatParcelizer(getStreamMarkerAndInfoBlockBytes.this).iterator();
                while (it.hasNext()) {
                    ((View.OnClickListener) it.next()).onClick(view);
                }
                getStreamMarkerAndInfoBlockBytes.this.dismiss();
            }
        });
        int i7 = this.MediaMetadataCompat;
        if (i7 != 0) {
            int i8 = onPrepareFromSearch + 73;
            onPlayFromSearch = i8 % 128;
            int i9 = i8 % 2;
            button.setText(i7);
            int i10 = onPrepareFromSearch + 101;
            onPlayFromSearch = i10 % 128;
            int i11 = i10 % 2;
        } else if (!TextUtils.isEmpty(this.MediaBrowserCompatSearchResultReceiver)) {
            button.setText(this.MediaBrowserCompatSearchResultReceiver);
        }
        Button button2 = (Button) viewGroup2.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.material_timepicker_cancel_button);
        this.RemoteActionCompatParcelizer = button2;
        button2.setOnClickListener(new View.OnClickListener() { // from class: o.getStreamMarkerAndInfoBlockBytes.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Iterator it = getStreamMarkerAndInfoBlockBytes.IconCompatParcelizer(getStreamMarkerAndInfoBlockBytes.this).iterator();
                while (it.hasNext()) {
                    ((View.OnClickListener) it.next()).onClick(view);
                }
                getStreamMarkerAndInfoBlockBytes.this.dismiss();
            }
        });
        int i12 = this.RatingCompat;
        if (i12 != 0) {
            this.RemoteActionCompatParcelizer.setText(i12);
        } else if (!TextUtils.isEmpty(this.MediaBrowserCompatItemReceiver)) {
            this.RemoteActionCompatParcelizer.setText(this.MediaBrowserCompatItemReceiver);
            int i13 = onPrepareFromSearch + 109;
            onPlayFromSearch = i13 % 128;
            int i14 = i13 % 2;
        }
        IconCompatParcelizer();
        this.AudioAttributesImplApi26Parcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.getStreamMarkerAndInfoBlockBytes.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getStreamMarkerAndInfoBlockBytes getstreammarkerandinfoblockbytes = getStreamMarkerAndInfoBlockBytes.this;
                getStreamMarkerAndInfoBlockBytes.read(getstreammarkerandinfoblockbytes, getStreamMarkerAndInfoBlockBytes.read(getstreammarkerandinfoblockbytes) == 0 ? 1 : 0);
                getStreamMarkerAndInfoBlockBytes getstreammarkerandinfoblockbytes2 = getStreamMarkerAndInfoBlockBytes.this;
                getStreamMarkerAndInfoBlockBytes.read(getstreammarkerandinfoblockbytes2, (MaterialButton) getStreamMarkerAndInfoBlockBytes.read(DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), 896425383, DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), -896425383, DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), new Object[]{getstreammarkerandinfoblockbytes2}));
            }
        });
        return viewGroup2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        int i2 = onPrepareFromSearch + 87;
        onPlayFromSearch = i2 % 128;
        int i3 = i2 % 2;
        super.onViewCreated(view, bundle);
        if (this.IconCompatParcelizer instanceof FlvExtractor) {
            view.postDelayed(new Runnable() { // from class: o.FlacExtractorFlags
                private static int AudioAttributesCompatParcelizer;
                private static short[] AudioAttributesImplApi21Parcelizer;
                private static int AudioAttributesImplApi26Parcelizer;
                private static byte[] MediaBrowserCompatCustomActionResultReceiver;
                private static int MediaBrowserCompatItemReceiver;
                private static int RemoteActionCompatParcelizer;
                private static int[] read;
                private static int write;
                private static final byte[] $$c = {14, -10, 42, -103};
                private static final int $$d = 100;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$a = {26, 47, -113, 59, -26, -12, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13};
                private static final int $$b = 126;
                private static final byte[] AudioAttributesImplBaseParcelizer = {123, -91, -44, 22, 13, -10, 14, -3, -6, -5, -54, 57, 11, -17, 15, -8, 1, -6, 16, -69, 34, 31, -6, 5, 6, -46, -7, 9, -7, 13, -12, 13, -10, 14, -3, -6, -5, -54, 57, 11, -17, 15, -8, 1, -6, 16, -69, 21, 44, -3, 3, 3, -11, -5, 13, -10, 14, -3, -6, -5, -54, 70, -15, 19, -4, -70, 38, 17, 19, -4, -31, 31, -11, 3, 7, 5, -10, 1, 19, -41, 23, -9, 21, -21, -51, 62, -11, 13, -7, -57, 21, 37, -7, 17, -31, 18, 12, 4, -16, 9, -11, 2, 13, -10, 14, -3, -6, -5, -54, 65, 4, -69, 37, 38, -6, 1, -15, 8, -42, 41, 3, -12, 8, 7, -11, 15, 3, -14, -1, -18, 19, -4, 11, 8, -11, 4, -8, 13, -10, 14, -3, -6, -5, -54, 72, -13, -4, 18, -73, 29, 26, 20, -52, TarConstants.LF_LINK, -17, 9, 6, -2, 15, -39, 34, -11, 5, -3, 3, -4, 13, -37, 24, 15, -19, -14, 33, -19, 19, -15, -24, 20, 18, -8, 10, 9, -16, -2, 15, -49, 30, 15, 3, -38, 34, -11, 1, -11, 18, 1, -43, 37, -10, 1, 19, -41, 23, -9, 21, -21, -51, 62, -11, 13, -7, -57, 37, 33, -2, -9, 5, -7, -3, -4, -3, 11, -9, 21, -21, -51, 62, -11, 13, -7, -57, 27, 37, 6, -15, 2, -2, 13, -21, 11, 9, -16, -22, 23, 5, 6, -30, 11, 11, 9, -16, -9, 21, -21, -51, 62, -11, 13, -7, -57, 38, 20, 10, -3, 8, -22, 1, 10, -7, -2, 15, -49, 30, 20, -2, -14, -9, 21, -21, -51, 62, -11, 13, -7, -57, 33, 19, 8, -5, -2, 17, -9, 21, -21, -51, 62, -11, 13, -7, -57, 30, 35, -1, -7, 5, -9, -11, -9, 21, -21, -51, 62, -11, 13, -7, -57, 68, -13, 1, 6, -7, -2, 17, -70, 19, 34, 0, 2, 14, 0, -10, -7, 10, -7, -22, 19, 8, -5, -2, 17, -14, 15, -51, 34, 0, 2, 14, 0, -10, -7, 10, -7, -9, 21, -21, -51, 62, -11, 13, -7, -57, 68, -13, 1, 6, -7, -2, 17, -70, 31, 24, 15, -12, 7, -11, 5, 8, -7, -4, -6, -15, 30, -9, 21, -21, -51, 62, -11, 13, -7, -57, 33, 19, 8, -5, -2, 17, -57};
                private static final int MediaDescriptionCompat = 114;

                /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static java.lang.String $$e(byte r6, short r7, int r8) {
                    /*
                        int r8 = r8 * 3
                        int r0 = 1 - r8
                        int r7 = r7 * 3
                        int r7 = r7 + 4
                        byte[] r1 = kotlin.FlacExtractorFlags.$$c
                        int r6 = r6 * 2
                        int r6 = r6 + 112
                        byte[] r0 = new byte[r0]
                        r2 = 0
                        int r8 = 0 - r8
                        if (r1 != 0) goto L19
                        r6 = r7
                        r4 = r8
                        r3 = r2
                        goto L2f
                    L19:
                        r3 = r2
                    L1a:
                        r5 = r7
                        r7 = r6
                        r6 = r5
                        byte r4 = (byte) r7
                        r0[r3] = r4
                        if (r3 != r8) goto L28
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r0, r2)
                        return r6
                    L28:
                        int r3 = r3 + 1
                        r4 = r1[r6]
                        r5 = r7
                        r7 = r6
                        r6 = r5
                    L2f:
                        int r7 = r7 + 1
                        int r6 = r6 + r4
                        goto L1a
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.FlacExtractorFlags.$$e(byte, short, int):java.lang.String");
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static void d(short r5, byte r6, short r7, java.lang.Object[] r8) {
                    /*
                        int r7 = r7 * 2
                        int r7 = r7 + 73
                        int r5 = r5 * 2
                        int r5 = 4 - r5
                        byte[] r0 = kotlin.FlacExtractorFlags.$$a
                        int r6 = r6 * 2
                        int r1 = 20 - r6
                        byte[] r1 = new byte[r1]
                        int r6 = 19 - r6
                        r2 = 0
                        if (r0 != 0) goto L18
                        r3 = r5
                        r4 = r2
                        goto L2a
                    L18:
                        r3 = r2
                    L19:
                        byte r4 = (byte) r7
                        r1[r3] = r4
                        int r4 = r3 + 1
                        if (r3 != r6) goto L28
                        java.lang.String r5 = new java.lang.String
                        r5.<init>(r1, r2)
                        r8[r2] = r5
                        return
                    L28:
                        r3 = r0[r5]
                    L2a:
                        int r5 = r5 + 1
                        int r3 = -r3
                        int r7 = r7 + r3
                        r3 = r4
                        goto L19
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.FlacExtractorFlags.d(short, byte, short, java.lang.Object[]):void");
                }

                private static void c(int i4, int[] iArr, Object[] objArr) throws Throwable {
                    int i5 = 2 % 2;
                    buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length * 2];
                    int[] iArr2 = read;
                    long j = 0;
                    int i6 = -470782045;
                    if (iArr2 != null) {
                        int length = iArr2.length;
                        int[] iArr3 = new int[length];
                        int i7 = 0;
                        while (i7 < length) {
                            int i8 = $11 + 107;
                            $10 = i8 % 128;
                            int i9 = i8 % 2;
                            try {
                                Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-470782045);
                                if (objRemoteActionCompatParcelizer == null) {
                                    objRemoteActionCompatParcelizer = startForeground.read((char) (ExpandableListView.getPackedPositionGroup(j) + 43695), Color.alpha(0) + 23297, Color.alpha(0) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                                }
                                iArr3[i7] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                                i7++;
                                j = 0;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        iArr2 = iArr3;
                    }
                    int length2 = iArr2.length;
                    int[] iArr4 = new int[length2];
                    int[] iArr5 = read;
                    if (iArr5 != null) {
                        int length3 = iArr5.length;
                        int[] iArr6 = new int[length3];
                        int i10 = 0;
                        while (i10 < length3) {
                            Object[] objArr3 = {Integer.valueOf(iArr5[i10])};
                            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(i6);
                            if (objRemoteActionCompatParcelizer2 == null) {
                                objRemoteActionCompatParcelizer2 = startForeground.read((char) (43695 - Drawable.resolveOpacity(0, 0)), 23297 - (Process.myTid() >> 22), (ViewConfiguration.getTouchSlop() >> 8) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                            }
                            iArr6[i10] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                            i10++;
                            i6 = -470782045;
                        }
                        iArr5 = iArr6;
                    }
                    System.arraycopy(iArr5, 0, iArr4, 0, length2);
                    buildremovealldownloadsintent.RemoteActionCompatParcelizer = 0;
                    while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
                        int i11 = $10 + 7;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        cArr[0] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
                        cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
                        cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
                        cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
                        buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
                        buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
                        buildRemoveAllDownloadsIntent.read(iArr4);
                        for (int i13 = 0; i13 < 16; i13++) {
                            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[i13];
                            Object[] objArr4 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                            if (objRemoteActionCompatParcelizer3 == null) {
                                objRemoteActionCompatParcelizer3 = startForeground.read((char) (ExpandableListView.getPackedPositionType(0L) + 43695), 23297 - (ViewConfiguration.getTapTimeout() >> 16), 15 - View.combineMeasuredStates(0, 0), -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                            buildremovealldownloadsintent.read = iIntValue;
                        }
                        int i14 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
                        buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                        buildremovealldownloadsintent.read = i14;
                        buildremovealldownloadsintent.read ^= iArr4[16];
                        buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[17];
                        int i15 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
                        int i16 = buildremovealldownloadsintent.read;
                        cArr[0] = (char) (buildremovealldownloadsintent.AudioAttributesCompatParcelizer >>> 16);
                        cArr[1] = (char) buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
                        cArr[2] = (char) (buildremovealldownloadsintent.read >>> 16);
                        cArr[3] = (char) buildremovealldownloadsintent.read;
                        buildRemoveAllDownloadsIntent.read(iArr4);
                        cArr2[buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2] = cArr[0];
                        cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 1] = cArr[1];
                        cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 2] = cArr[2];
                        cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 3] = cArr[3];
                        Object[] objArr5 = {buildremovealldownloadsintent, buildremovealldownloadsintent};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(516305436);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) (KeyEvent.normalizeMetaState(0) + 48194), Color.rgb(0, 0, 0) + 16797342, AndroidCharacter.getMirror('0') - 28, 1620047497, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                    }
                    String str = new String(cArr2, 0, i4);
                    int i17 = $10 + 121;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                    objArr[0] = str;
                }

                private static void b(byte b, int i4, int i5, short s, int i6, Object[] objArr) throws Throwable {
                    long j;
                    buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
                    StringBuilder sb = new StringBuilder();
                    try {
                        Object[] objArr2 = {Integer.valueOf(i6), Integer.valueOf(AudioAttributesImplApi26Parcelizer)};
                        int i7 = 0;
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
                        long j2 = 0;
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 24297 - View.resolveSize(0, 0), 12 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                        int i8 = iIntValue == -1 ? 1 : 0;
                        if (i8 == 0) {
                            j = 7899112766888837815L;
                        } else {
                            byte[] bArr = MediaBrowserCompatCustomActionResultReceiver;
                            if (bArr != null) {
                                int length = bArr.length;
                                byte[] bArr2 = new byte[length];
                                int i9 = 0;
                                while (i9 < length) {
                                    Object[] objArr3 = new Object[1];
                                    objArr3[i7] = Integer.valueOf(bArr[i9]);
                                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                                    if (objRemoteActionCompatParcelizer2 == null) {
                                        byte b2 = (byte) i7;
                                        byte b3 = b2;
                                        objRemoteActionCompatParcelizer2 = startForeground.read((char) View.MeasureSpec.getSize(i7), ExpandableListView.getPackedPositionChild(j2) + 3083, Color.green(i7) + 128, 2145850993, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                                    }
                                    bArr2[i9] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                                    i9++;
                                    i7 = 0;
                                    j2 = 0;
                                }
                                bArr = bArr2;
                            }
                            if (bArr != null) {
                                byte[] bArr3 = MediaBrowserCompatCustomActionResultReceiver;
                                Object[] objArr4 = {Integer.valueOf(i5), Integer.valueOf(AudioAttributesCompatParcelizer)};
                                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                                if (objRemoteActionCompatParcelizer3 == null) {
                                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 24297, 12 - TextUtils.indexOf("", "", 0, 0), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) AudioAttributesImplApi26Parcelizer) ^ 7899112766888837815L)));
                                j = 7899112766888837815L;
                            } else {
                                j = 7899112766888837815L;
                                iIntValue = (short) (((short) (((long) AudioAttributesImplApi21Parcelizer[i5 + ((int) (((long) AudioAttributesCompatParcelizer) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) AudioAttributesImplApi26Parcelizer) ^ 7899112766888837815L)));
                            }
                        }
                        if (iIntValue > 0) {
                            buildresumedownloadsintent.read = ((i5 + iIntValue) - 2) + ((int) (((long) AudioAttributesCompatParcelizer) ^ j)) + i8;
                            Object[] objArr5 = {buildresumedownloadsintent, Integer.valueOf(i4), Integer.valueOf(MediaBrowserCompatItemReceiver), sb};
                            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(107629512);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                objRemoteActionCompatParcelizer4 = startForeground.read((char) (KeyEvent.normalizeMetaState(0) + 34134), 13431 - TextUtils.lastIndexOf("", '0', 0), 20 - TextUtils.lastIndexOf("", '0'), 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                            }
                            ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(buildresumedownloadsintent.IconCompatParcelizer);
                            buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                            byte[] bArr4 = MediaBrowserCompatCustomActionResultReceiver;
                            if (bArr4 != null) {
                                int length2 = bArr4.length;
                                byte[] bArr5 = new byte[length2];
                                for (int i10 = 0; i10 < length2; i10++) {
                                    bArr5[i10] = (byte) (((long) bArr4[i10]) ^ 7899112766888837815L);
                                }
                                bArr4 = bArr5;
                            }
                            boolean z = bArr4 != null;
                            buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                            while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                                if (z) {
                                    byte[] bArr6 = MediaBrowserCompatCustomActionResultReceiver;
                                    buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                                    buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr6[r3]) ^ 7899112766888837815L)) + s)) ^ b));
                                } else {
                                    short[] sArr = AudioAttributesImplApi21Parcelizer;
                                    buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                                    buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r3]) ^ 7899112766888837815L)) + s)) ^ b));
                                }
                                sb.append(buildresumedownloadsintent.IconCompatParcelizer);
                                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                                buildresumedownloadsintent.AudioAttributesCompatParcelizer++;
                            }
                        }
                        objArr[0] = sb.toString();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = 2 % 2;
                    int i5 = RemoteActionCompatParcelizer + 51;
                    write = i5 % 128;
                    int i6 = i5 % 2;
                    this.IconCompatParcelizer.write();
                    if (i6 == 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                /* JADX WARN: Removed duplicated region for block: B:155:0x09fa A[Catch: all -> 0x0a7d, TryCatch #21 {all -> 0x0a7d, blocks: (B:127:0x09ba, B:153:0x09f3, B:155:0x09fa, B:156:0x09fb, B:163:0x0a1a, B:164:0x0a26, B:165:0x0a2d, B:166:0x0a45, B:173:0x0a70), top: B:255:0x09ba }] */
                /* JADX WARN: Removed duplicated region for block: B:156:0x09fb A[Catch: all -> 0x0a7d, TryCatch #21 {all -> 0x0a7d, blocks: (B:127:0x09ba, B:153:0x09f3, B:155:0x09fa, B:156:0x09fb, B:163:0x0a1a, B:164:0x0a26, B:165:0x0a2d, B:166:0x0a45, B:173:0x0a70), top: B:255:0x09ba }] */
                /* JADX WARN: Removed duplicated region for block: B:205:0x0b03  */
                /* JADX WARN: Removed duplicated region for block: B:272:0x0b11 A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public static void IconCompatParcelizer(android.content.Context r22, long r23, long r25) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 2920
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.FlacExtractorFlags.IconCompatParcelizer(android.content.Context, long, long):void");
                }

                static {
                    AudioAttributesCompatParcelizer();
                    write = 0;
                    RemoteActionCompatParcelizer = 1;
                    read = new int[]{887284415, -607522974, 1848215902, 1663626016, 1726162575, 1952843812, 418979676, 1172658101, -1122094234, 543009971, -354467379, -710224873, -765479925, -290635203, -1076886443, 1458114977, -1122075893, -862142616};
                }

                static void AudioAttributesCompatParcelizer() {
                    AudioAttributesCompatParcelizer = 1399986000;
                    AudioAttributesImplApi26Parcelizer = -279118748;
                    MediaBrowserCompatItemReceiver = -891743486;
                    MediaBrowserCompatCustomActionResultReceiver = new byte[]{18, 23, 16, -27, 21, 25, -25, 18, 23, 16, -28, 18, 25, -26, 19, 23, 16, -23, 16, 23, 16, -23, 16, 23, 16, -24, 17, 23, 16, -21, -18, 23, 16, -23, 16, 22, -27, 22, 20, -22, -17, 23, 16, -23, 17, 25, -24, -18, 25, -21, -17, 25, -19, -20, 23, 16, -25, 24, 16, -21, 16, 20, -26, 25, 16, -23, 22, 16, -22, -20, 25, -24, 23, 16, -19, -19, 25, -21, 20, 16, -30, 23, 22, -27, 20, 22, -28, 21, 22, -22, 20, -30, 22, 20, 16, -27, 23, 20, 16, -28, 20, 20, 16, -26, 19, 22, -25, 21, 20, 16, -23, 16, 22, -24, 17, 22, -22, 17, 20, -21, -18, 22, -26, 18, 20, 16, -23, 19, 20, 16, -22, -17, 22, -24, 16, 20, 16, -25, 20, 20, -19, -20, 22, -21, 17, 20, 16, -25, 20, 20, -22, -18, 20, 16, -30, 22, 23, -19, -17, 20, 16, -27, 23, 23, -24, 19, 20, -30, 25, 21, 16, -26, 18, 23, -27, 22, 21, 16, -27, 23, 23, -28, 20, 23, -28, 23, 21, 16, -25, 21, 23, -25, 20, 21, 16, -27, 22, 20, -26, 21, 21, 16, -23, 18, 21, 16, -26, 18, 23, -23, 19, 23, -24, 16, 23, -21, 17, 23, -22, -18, 23, -26, 21, 20, -24, 19, 21, 16, -25, 20, 20, -30, 25, 20, -21, 16, 21, 16, -27, 22, 20, -22, 17, 21, 16, -25, 20, 20, -22, 17, 21, 16, -25, 20, 20, -26, 21, 20, -19, -18, 21, 16, -30, 29, 16, -27, 26, 16, -24, 19, 20, -28, 27, 16, -24, 19, 20, -25, 24, 16, -21, 16, 20, -26, 25, 16, -23, 22, 16, -22, 17, 20, -24, 23, 16, -19, -18, 20, -21, 20, 16, -26, 24, -24, 22, -21, 23, -22, 20, -22, 21};
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static void a(short r7, short r8, byte r9, java.lang.Object[] r10) {
                    /*
                        int r7 = r7 + 4
                        int r8 = r8 + 3
                        byte[] r0 = kotlin.FlacExtractorFlags.AudioAttributesImplBaseParcelizer
                        int r9 = 118 - r9
                        byte[] r1 = new byte[r8]
                        r2 = 0
                        if (r0 != 0) goto L11
                        r3 = r9
                        r4 = r2
                        r9 = r7
                        goto L29
                    L11:
                        r3 = r2
                    L12:
                        int r4 = r3 + 1
                        byte r5 = (byte) r9
                        r1[r3] = r5
                        int r7 = r7 + 1
                        if (r4 != r8) goto L23
                        java.lang.String r7 = new java.lang.String
                        r7.<init>(r1, r2)
                        r10[r2] = r7
                        return
                    L23:
                        r3 = r0[r7]
                        r6 = r9
                        r9 = r7
                        r7 = r3
                        r3 = r6
                    L29:
                        int r7 = r7 + r3
                        r3 = r4
                        r6 = r9
                        r9 = r7
                        r7 = r6
                        goto L12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.FlacExtractorFlags.a(short, short, byte, java.lang.Object[]):void");
                }
            }, 100L);
            int i4 = onPlayFromSearch + 117;
            onPrepareFromSearch = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    final /* synthetic */ void write() {
        int i = 2 % 2;
        parseHeader parseheader = this.IconCompatParcelizer;
        if (parseheader instanceof FlvExtractor) {
            int i2 = onPrepareFromSearch + 73;
            onPlayFromSearch = i2 % 128;
            int i3 = i2 % 2;
            ((FlvExtractor) parseheader).IconCompatParcelizer();
            if (i3 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i4 = onPlayFromSearch + 85;
        onPrepareFromSearch = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        getStreamMarkerAndInfoBlockBytes getstreammarkerandinfoblockbytes = (getStreamMarkerAndInfoBlockBytes) objArr[0];
        int i = 2 % 2;
        super.onDestroyView();
        getstreammarkerandinfoblockbytes.IconCompatParcelizer = null;
        getstreammarkerandinfoblockbytes.handleMediaPlayPauseIfPendingOnHandler = null;
        getstreammarkerandinfoblockbytes.onCommand = null;
        TimePickerView timePickerView = getstreammarkerandinfoblockbytes.onAddQueueItem;
        if (timePickerView != null) {
            int i2 = onPrepareFromSearch + 59;
            onPlayFromSearch = i2 % 128;
            int i3 = i2 % 2;
            timePickerView.read((TimePickerView.read) null);
            getstreammarkerandinfoblockbytes.onAddQueueItem = null;
        }
        int i4 = onPrepareFromSearch + 37;
        onPlayFromSearch = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return null;
    }

    @Override // kotlin.argCount, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onPrepareFromSearch + 113;
        onPlayFromSearch = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.read.iterator();
            obj.hashCode();
            throw null;
        }
        Iterator<DialogInterface.OnCancelListener> it = this.read.iterator();
        while (!(!it.hasNext())) {
            int i3 = onPrepareFromSearch + 33;
            onPlayFromSearch = i3 % 128;
            if (i3 % 2 == 0) {
                it.next().onCancel(dialogInterface);
                throw null;
            }
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
        int i4 = onPrepareFromSearch + 35;
        onPlayFromSearch = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
    }

    @Override // kotlin.argCount, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = 2 % 2;
        Iterator<DialogInterface.OnDismissListener> it = this.AudioAttributesCompatParcelizer.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
            int i2 = onPrepareFromSearch + 7;
            onPlayFromSearch = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 % 3;
            }
        }
        super.onDismiss(dialogInterface);
        int i4 = onPrepareFromSearch + 23;
        onPlayFromSearch = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
    }

    @Override // kotlin.argCount
    public final void setCancelable(boolean z) {
        int i = 2 % 2;
        int i2 = onPlayFromSearch + 61;
        onPrepareFromSearch = i2 % 128;
        if (i2 % 2 != 0) {
            super.setCancelable(z);
            IconCompatParcelizer();
            int i3 = 34 / 0;
        } else {
            super.setCancelable(z);
            IconCompatParcelizer();
        }
    }

    @Override // com.google.android.material.timepicker.TimePickerView.read
    public final void read() {
        int i = 2 % 2;
        int i2 = onPrepareFromSearch + 73;
        onPlayFromSearch = i2 % 128;
        int i3 = i2 % 2;
        this.AudioAttributesImplBaseParcelizer = 1;
        IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        this.onCommand.IconCompatParcelizer();
        int i4 = onPrepareFromSearch + 87;
        onPlayFromSearch = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void IconCompatParcelizer(com.google.android.material.button.MaterialButton r12) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            if (r12 == 0) goto L84
            int r1 = kotlin.getStreamMarkerAndInfoBlockBytes.onPlayFromSearch
            int r1 = r1 + 73
            int r2 = r1 % 128
            kotlin.getStreamMarkerAndInfoBlockBytes.onPrepareFromSearch = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L19
            com.google.android.material.timepicker.TimePickerView r1 = r11.onAddQueueItem
            r2 = 39
            int r2 = r2 / 0
            if (r1 == 0) goto L84
            goto L1d
        L19:
            com.google.android.material.timepicker.TimePickerView r1 = r11.onAddQueueItem
            if (r1 == 0) goto L84
        L1d:
            android.view.ViewStub r1 = r11.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            if (r1 == 0) goto L84
            o.parseHeader r1 = r11.IconCompatParcelizer
            if (r1 == 0) goto L28
            r1.AudioAttributesCompatParcelizer()
        L28:
            int r1 = r11.AudioAttributesImplBaseParcelizer
            com.google.android.material.timepicker.TimePickerView r2 = r11.onAddQueueItem
            android.view.ViewStub r3 = r11.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r10 = new java.lang.Object[]{r11, r1, r2, r3}
            int r5 = kotlin.DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed()
            int r9 = kotlin.DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed()
            int r4 = kotlin.DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed()
            int r7 = kotlin.DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed()
            r8 = -1314117632(0xffffffffb1ac2800, float:-5.0104063E-9)
            r6 = 1314117635(0x4e53d803, float:8.885373E8)
            java.lang.Object r1 = read(r4, r5, r6, r7, r8, r9, r10)
            o.parseHeader r1 = (kotlin.parseHeader) r1
            r11.IconCompatParcelizer = r1
            r1.write()
            o.parseHeader r1 = r11.IconCompatParcelizer
            r1.read()
            int r1 = r11.AudioAttributesImplBaseParcelizer
            android.util.Pair r1 = r11.AudioAttributesCompatParcelizer(r1)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r12.setIconResource(r2)
            android.content.res.Resources r11 = r11.getResources()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.String r11 = r11.getString(r1)
            r12.setContentDescription(r11)
            r11 = 4
            r12.sendAccessibilityEvent(r11)
        L84:
            int r11 = kotlin.getStreamMarkerAndInfoBlockBytes.onPlayFromSearch
            int r11 = r11 + 125
            int r12 = r11 % 128
            kotlin.getStreamMarkerAndInfoBlockBytes.onPrepareFromSearch = r12
            int r11 = r11 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getStreamMarkerAndInfoBlockBytes.IconCompatParcelizer(com.google.android.material.button.MaterialButton):void");
    }

    private void IconCompatParcelizer() {
        int i;
        int i2 = 2 % 2;
        int i3 = onPlayFromSearch + 35;
        onPrepareFromSearch = i3 % 128;
        int i4 = i3 % 2;
        Button button = this.RemoteActionCompatParcelizer;
        if (button != null) {
            if (!isCancelable()) {
                i = 8;
            } else {
                int i5 = onPrepareFromSearch + 103;
                onPlayFromSearch = i5 % 128;
                int i6 = i5 % 2;
                i = 0;
            }
            button.setVisibility(i);
        }
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        getStreamMarkerAndInfoBlockBytes getstreammarkerandinfoblockbytes = (getStreamMarkerAndInfoBlockBytes) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        TimePickerView timePickerView = (TimePickerView) objArr[2];
        ViewStub viewStub = (ViewStub) objArr[3];
        int i = 2 % 2;
        if (iIntValue == 0) {
            int i2 = onPlayFromSearch + 11;
            onPrepareFromSearch = i2 % 128;
            int i3 = i2 % 2;
            FlacExtractorExternalSyntheticLambda0 flacExtractorExternalSyntheticLambda0 = getstreammarkerandinfoblockbytes.handleMediaPlayPauseIfPendingOnHandler;
            if (flacExtractorExternalSyntheticLambda0 == null) {
                flacExtractorExternalSyntheticLambda0 = new FlacExtractorExternalSyntheticLambda0(timePickerView, getstreammarkerandinfoblockbytes.onCustomAction);
            }
            getstreammarkerandinfoblockbytes.handleMediaPlayPauseIfPendingOnHandler = flacExtractorExternalSyntheticLambda0;
            return flacExtractorExternalSyntheticLambda0;
        }
        if (getstreammarkerandinfoblockbytes.onCommand == null) {
            getstreammarkerandinfoblockbytes.onCommand = new FlvExtractor((LinearLayout) viewStub.inflate(), getstreammarkerandinfoblockbytes.onCustomAction);
        }
        getstreammarkerandinfoblockbytes.onCommand.RemoteActionCompatParcelizer();
        FlvExtractor flvExtractor = getstreammarkerandinfoblockbytes.onCommand;
        int i4 = onPlayFromSearch + 29;
        onPrepareFromSearch = i4 % 128;
        int i5 = i4 % 2;
        return flvExtractor;
    }

    private Pair<Integer, Integer> AudioAttributesCompatParcelizer(int i) {
        int i2 = 2 % 2;
        int i3 = onPlayFromSearch + 75;
        onPrepareFromSearch = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (i != 0) {
            if (i == 1) {
                return new Pair<>(Integer.valueOf(this.write), Integer.valueOf(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.material_timepicker_clock_mode_description));
            }
            throw new IllegalArgumentException("no icon for mode: ".concat(String.valueOf(i)));
        }
        Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(this.AudioAttributesImplApi21Parcelizer), Integer.valueOf(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.material_timepicker_text_input_mode_description));
        int i4 = onPlayFromSearch + 99;
        onPrepareFromSearch = i4 % 128;
        if (i4 % 2 == 0) {
            return pair;
        }
        throw null;
    }

    private int AudioAttributesCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onPlayFromSearch;
        int i3 = i2 + 45;
        onPrepareFromSearch = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.MediaBrowserCompatMediaItem;
        if (i5 == 0) {
            TypedValue typedValueAudioAttributesCompatParcelizer = SeekPoint.AudioAttributesCompatParcelizer(requireContext(), calculateNextSearchBytePosition.IconCompatParcelizer.materialTimePickerTheme);
            if (typedValueAudioAttributesCompatParcelizer == null) {
                return 0;
            }
            int i6 = typedValueAudioAttributesCompatParcelizer.data;
            int i7 = onPlayFromSearch + 53;
            onPrepareFromSearch = i7 % 128;
            if (i7 % 2 == 0) {
                return i6;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i8 = i2 + 53;
        onPrepareFromSearch = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 62 / 0;
        }
        return i5;
    }

    static /* synthetic */ MaterialButton write(getStreamMarkerAndInfoBlockBytes getstreammarkerandinfoblockbytes) {
        int iOnSetPlaybackSpeed = DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed();
        int iOnSetPlaybackSpeed2 = DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed();
        return (MaterialButton) read(DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), iOnSetPlaybackSpeed, 896425383, DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), -896425383, iOnSetPlaybackSpeed2, new Object[]{getstreammarkerandinfoblockbytes});
    }

    private parseHeader AudioAttributesCompatParcelizer(int i, TimePickerView timePickerView, ViewStub viewStub) {
        Object[] objArr = {this, Integer.valueOf(i), timePickerView, viewStub};
        return (parseHeader) read(DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), 1314117635, DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), -1314117632, DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), objArr);
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int iOnSetPlaybackSpeed = DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed();
        int iOnSetPlaybackSpeed2 = DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed();
        read(DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), iOnSetPlaybackSpeed, 802018444, DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), -802018443, iOnSetPlaybackSpeed2, new Object[]{this, bundle});
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int iOnSetPlaybackSpeed = DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed();
        int iOnSetPlaybackSpeed2 = DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed();
        read(DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), iOnSetPlaybackSpeed, -2064179971, DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), 2064179973, iOnSetPlaybackSpeed2, new Object[]{this});
    }
}
