package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.data.models.video.PixelInfo;
import com.marrow.ui.views.CustomTextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.FastSafeParcelableJsonResponse;
import kotlin.areRendererDisabledFlagsEqual;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class isCompatibleForAdaptationWith extends shouldEvaluateQueueSize<SegmentBaseSegmentTemplate> implements areRendererDisabledFlagsEqual.RemoteActionCompatParcelizer {
    private static short[] AudioAttributesImplBaseParcelizer;
    private final boolean IconCompatParcelizer;
    private final WebvttDecoder RemoteActionCompatParcelizer;
    private final areRendererDisabledFlagsEqual.IconCompatParcelizer write;
    private static final byte[] $$c = {TarConstants.LF_CONTIG, -94, -3, -122};
    private static final int $$f = 202;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {11, 40, -34, 98, 18, 4, -57, 63, 14, 6, -2, 11, -1, -49, 57, 19, -4, 20, 3, 0, 1, -48, 69, -6, 25, -9, 19, -3, -2, 17, -56, 59, 11, 7, 13, -60, 27, 43, 7, 13, -70, 19, 1, -3, 17, -9, 25, 14, 8, 11, -9, -30, 40, 23, -5, 12, 5, -37, TarConstants.LF_SYMLINK, 4, 9, -9, 25, -30, 23, 23, -9, 8, 13, 3, 23, -15, 19};
    private static final int $$h = 93;
    private static final byte[] $$a = {79, -100, -79, 21, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 236;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;
    private static int AudioAttributesCompatParcelizer = 915659854;
    private static int read = -819363110;
    private static int MediaBrowserCompatItemReceiver = 1990918917;
    private static byte[] AudioAttributesImplApi26Parcelizer = {114, -117, 123, -128, 92, 95, -67, -125, 119, -113, 68, -73, -111, 111, -115, -85, 95, -122, 113, 95, -72, -77, 101, -81, -95, 95, -84, -93, -85, 81, -36, 32, -41, -3, 2, -36, 37, -43, 46, -14, -15, 111, -48, -107, 30, 47, 46, 41, -38, 34, -39, 40, -44, 37, -40, -37, 44, -61, 62, 47, 34, -45, -33, 37, -41, -73, -73, -73, -73};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(byte r6, short r7, int r8) {
        /*
            int r6 = r6 * 3
            int r6 = 3 - r6
            int r7 = r7 * 4
            int r7 = 1 - r7
            int r8 = r8 * 3
            int r8 = 112 - r8
            byte[] r0 = kotlin.isCompatibleForAdaptationWith.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2c
        L17:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L28:
            int r8 = r8 + 1
            r4 = r0[r8]
        L2c:
            int r4 = -r4
            int r6 = r6 + r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isCompatibleForAdaptationWith.$$i(byte, short, int):java.lang.String");
    }

    public static /* synthetic */ Object IconCompatParcelizer(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = i | i7;
        int i9 = ~i4;
        int i10 = ~((~i) | i7);
        int i11 = i2 + i4 + i5 + (1977613057 * i6) + (454551927 * i3);
        int i12 = i11 * i11;
        int i13 = (1378041352 * i2) + 473956352 + (953991674 * i4) + (212024839 * i8) + (i9 * (-212024839)) + ((-212024839) * i10) + (1166016512 * i5) + ((-981467136) * i6) + ((-830472192) * i3) + ((-499122176) * i12);
        int i14 = (i2 * (-1131120504)) + 246467939 + (i4 * (-1131119078)) + (i8 * (-713)) + (i9 * 713) + (i10 * 713) + (i5 * (-1131119791)) + (i6 * (-1039407535)) + (i3 * 1820920743) + (i12 * 1447034880);
        return i13 + ((i14 * i14) * 1170210816) != 1 ? AudioAttributesCompatParcelizer(objArr) : IconCompatParcelizer(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 12
            int r6 = r6 + 65
            int r7 = r7 * 10
            int r7 = r7 + 34
            int r8 = 79 - r8
            byte[] r0 = kotlin.isCompatibleForAdaptationWith.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r6 = r6 + r8
            int r6 = r6 + (-1)
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isCompatibleForAdaptationWith.a(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 82
            int r7 = 39 - r7
            byte[] r0 = kotlin.isCompatibleForAdaptationWith.$$g
            int r8 = r8 * 2
            int r8 = 46 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r9 = r8
            r4 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L28:
            int r8 = r8 + r3
            int r8 = r8 + (-6)
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isCompatibleForAdaptationWith.c(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isCompatibleForAdaptationWith(Context context, PixelInfo[] pixelInfoArr, areRendererDisabledFlagsEqual.write writeVar, int i, boolean z) throws Throwable {
        super(context);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(pixelInfoArr, "");
        toMagicModuleMetaRepoModel.write(writeVar, "");
        this.IconCompatParcelizer = z;
        getStreamPositionUsForContent getstreampositionusforcontentMediaDescriptionCompat = TrainingApplication.IconCompatParcelizer(context).MediaDescriptionCompat();
        parsePercentage parsepercentage = new parsePercentage(getstreampositionusforcontentMediaDescriptionCompat.onPrepareFromUri());
        this.RemoteActionCompatParcelizer = new WebvttDecoder(parsepercentage);
        MediaChunkIterator1 mediaChunkIterator1 = new MediaChunkIterator1(new newMediaChunk(context), new newInitializationChunk(context));
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontentMediaDescriptionCompat);
        this.write = new areSelectionOverridesEqual(pixelInfoArr, parsepercentage, getstreampositionusforcontentMediaDescriptionCompat, mediaChunkIterator1, writeVar, i, this);
    }

    @Override // kotlin.shouldEvaluateQueueSize
    public final /* synthetic */ getApplicationLabel write() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 105;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            return (SegmentBaseSegmentTemplate) IconCompatParcelizer(FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer(), new Object[]{this}, 1939739248, FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer(), -1939739247, FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer(), FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        isCompatibleForAdaptationWith iscompatibleforadaptationwith = (isCompatibleForAdaptationWith) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 3;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        SegmentBaseSegmentTemplate segmentBaseSegmentTemplateAudioAttributesCompatParcelizer = SegmentBaseSegmentTemplate.AudioAttributesCompatParcelizer(iscompatibleforadaptationwith.getLayoutInflater());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(segmentBaseSegmentTemplateAudioAttributesCompatParcelizer, "");
        if (i3 == 0) {
            return segmentBaseSegmentTemplateAudioAttributesCompatParcelizer;
        }
        throw null;
    }

    private static final getShowPopup read(isCompatibleForAdaptationWith iscompatibleforadaptationwith) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 47;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        iscompatibleforadaptationwith.write.IconCompatParcelizer();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = AudioAttributesImplApi21Parcelizer + 39;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    @Override // kotlin.shouldEvaluateQueueSize, kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public final void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char c = (char) (13184 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
            int i2 = 1650 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 26;
            byte b = $$a[53];
            Object[] objArr2 = new Object[1];
            a(b, b, (byte) ($$b & 351), objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(c, i2, threadPriority, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            int i3 = MediaBrowserCompatCustomActionResultReceiver + 95;
            AudioAttributesImplApi21Parcelizer = i3 % 128;
            if (i3 % 2 != 0) {
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 13183);
                    int iLastIndexOf = 1648 - TextUtils.lastIndexOf("", '0');
                    int i4 = 27 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    byte[] bArr = $$a;
                    byte b2 = bArr[5];
                    byte b3 = (byte) (-bArr[39]);
                    Object[] objArr3 = new Object[1];
                    a(b2, b2, b3, objArr3);
                    objRemoteActionCompatParcelizer2 = startForeground.read(cNormalizeMetaState, iLastIndexOf, i4, -1033747278, false, (String) objArr3[0], null);
                }
                objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
                int i5 = 19 / 0;
            } else {
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 13184);
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 1649;
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 26;
                    byte[] bArr2 = $$a;
                    byte b4 = bArr2[5];
                    Object[] objArr4 = new Object[1];
                    a(b4, b4, (byte) (-bArr2[39]), objArr4);
                    objRemoteActionCompatParcelizer3 = startForeground.read(cIndexOf, iResolveOpacity, deadChar, -1033747278, false, (String) objArr4[0], null);
                }
                objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
            }
        } else {
            Object[] objArr5 = new Object[1];
            b((byte) (MotionEvent.axisFromString("") - 50), 1182629560 - Color.alpha(0), 105226502 - TextUtils.lastIndexOf("", '0'), (short) (ViewConfiguration.getLongPressTimeout() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 93, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            b((byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 29), 1182629559 - (ViewConfiguration.getWindowTouchSlop() >> 8), 105226519 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (short) (ViewConfiguration.getTapTimeout() >> 16), (-93) - (ViewConfiguration.getTapTimeout() >> 16), objArr6);
            try {
                Object[] objArr7 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue()), 0, -292397565};
                byte[] bArr3 = $$g;
                byte b5 = bArr3[19];
                Object[] objArr8 = new Object[1];
                c(b5, (byte) (b5 | 21), bArr3[29], objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c((byte) (-bArr3[2]), (byte) (-bArr3[10]), (byte) (-bArr3[57]), objArr9);
                objArr = (Object[]) cls2.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr7);
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char deadChar2 = (char) (KeyEvent.getDeadChar(0, 0) + 13183);
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1649;
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 27;
                    byte[] bArr4 = $$a;
                    byte b6 = bArr4[5];
                    Object[] objArr10 = new Object[1];
                    a(b6, b6, (byte) (-bArr4[39]), objArr10);
                    objRemoteActionCompatParcelizer4 = startForeground.read(deadChar2, iCombineMeasuredStates, iLastIndexOf2, -1033747278, false, (String) objArr10[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer4).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    b((byte) (KeyEvent.normalizeMetaState(0) + 99), 1182629551 - Color.green(0), 105226533 - Color.blue(0), (short) (ViewConfiguration.getKeyRepeatDelay() >> 16), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 88, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    b((byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 103), 1182629555 - Color.green(0), 105226554 - (Process.myPid() >> 22), (short) (ViewConfiguration.getMinimumFlingVelocity() >> 16), View.combineMeasuredStates(0, 0) - 94, objArr12);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char deadChar3 = (char) (KeyEvent.getDeadChar(0, 0) + 13183);
                        int keyRepeatTimeout = 1649 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int gidForName = Process.getGidForName("") + 27;
                        byte b7 = $$a[5];
                        byte b8 = b7;
                        Object[] objArr13 = new Object[1];
                        a(b7, b8, b8, objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(deadChar3, keyRepeatTimeout, gidForName, 54351865, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 13183);
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1649;
                        int i6 = 26 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                        byte b9 = $$a[53];
                        Object[] objArr14 = new Object[1];
                        a(b9, b9, (byte) ($$b & 351), objArr14);
                        objRemoteActionCompatParcelizer6 = startForeground.read(capsMode, tapTimeout, i6, -133433128, false, (String) objArr14[0], null);
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
        int i7 = ((int[]) objArr[3])[0];
        int i8 = ((int[]) objArr[2])[0];
        if (i8 != i7) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i7 ^ i8)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) (4535 - View.getDefaultSize(0, 0)), 6054 - (ViewConfiguration.getEdgeSlop() >> 16), 41 - MotionEvent.axisFromString(""), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer7).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i9 = AudioAttributesImplApi21Parcelizer + 35;
                MediaBrowserCompatCustomActionResultReceiver = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr15 = {-1942125284, Long.valueOf(j3), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) + 6031, 24 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                    byte[] bArr5 = $$g;
                    byte b10 = bArr5[0];
                    byte b11 = bArr5[19];
                    Object[] objArr16 = new Object[1];
                    c(b10, b11, b11, objArr16);
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
        RecyclerView recyclerView = AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.RemoteActionCompatParcelizer);
        if (this.IconCompatParcelizer) {
            IconCompatParcelizer(FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer(), new Object[]{this}, -1770411404, FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer(), 1770411404, FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer(), FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer());
            int i11 = MediaBrowserCompatCustomActionResultReceiver + 65;
            AudioAttributesImplApi21Parcelizer = i11 % 128;
            int i12 = i11 % 2;
        }
        CustomTextView customTextView = AudioAttributesImplBaseParcelizer().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        RemoteActionCompatParcelizer(customTextView, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.getDefaults
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return isCompatibleForAdaptationWith.AudioAttributesCompatParcelizer(this.read);
            }
        });
        this.write.AudioAttributesCompatParcelizer();
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        isCompatibleForAdaptationWith iscompatibleforadaptationwith = (isCompatibleForAdaptationWith) objArr[0];
        int i = 2 % 2;
        String string = iscompatibleforadaptationwith.getContext().getString(R.string.download_only_available_in_light_mode_note);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String str = string;
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new StyleSpan(1), 0, TestGroupLSModel.read((CharSequence) str, ":", 0, false, 6) + 1, 33);
        iscompatibleforadaptationwith.AudioAttributesImplBaseParcelizer().write.setText(spannableString);
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 65;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // o.areRendererDisabledFlagsEqual.RemoteActionCompatParcelizer
    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 25;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        SegmentBaseSegmentTemplate segmentBaseSegmentTemplateAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        if (i3 == 0) {
            CustomTextView customTextView = segmentBaseSegmentTemplateAudioAttributesImplBaseParcelizer.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(customTextView);
        } else {
            CustomTextView customTextView2 = segmentBaseSegmentTemplateAudioAttributesImplBaseParcelizer.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView2, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(customTextView2);
            int i4 = 78 / 0;
        }
    }

    @Override // o.areRendererDisabledFlagsEqual.RemoteActionCompatParcelizer
    public final void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 33;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        CustomTextView customTextView = AudioAttributesImplBaseParcelizer().IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        PlayerControlViewExternalSyntheticLambda1.write((View) customTextView);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 89;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.areRendererDisabledFlagsEqual.RemoteActionCompatParcelizer
    public final void read(int i) {
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatCustomActionResultReceiver + 43;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        AudioAttributesImplBaseParcelizer().IconCompatParcelizer.setText(IconCompatParcelizer(R.string.f_video_download_limit_warning, Integer.valueOf(i)));
        int i5 = MediaBrowserCompatCustomActionResultReceiver + 97;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.areRendererDisabledFlagsEqual.RemoteActionCompatParcelizer
    public final void read(String str, getChunkEndTimeUs getchunkendtimeus) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 105;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(getchunkendtimeus, "");
        if (str != null) {
            int i4 = AudioAttributesImplApi21Parcelizer + 23;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            int i5 = i4 % 2;
            IconCompatParcelizer(str);
            return;
        }
        IconCompatParcelizer(IconCompatParcelizer(R.string.err_resolution_incompatible_toast, getchunkendtimeus.getWrite()));
        int i6 = MediaBrowserCompatCustomActionResultReceiver + 17;
        AudioAttributesImplApi21Parcelizer = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // o.areRendererDisabledFlagsEqual.RemoteActionCompatParcelizer
    public final void IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 123;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        dismiss();
        if (i3 != 0) {
            throw null;
        }
        int i4 = AudioAttributesImplApi21Parcelizer + 57;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static void b(byte b, int i, int i2, short s, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        int length;
        byte[] bArr;
        int i5 = 2;
        int i6 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(read)};
            int i7 = 0;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) ((Process.getThreadPriority(0) + 20) >> 6), KeyEvent.getDeadChar(0, 0) + 24297, 11 - Process.getGidForName(""), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i8 = $10 + 49;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                int i10 = $10;
                int i11 = i10 + 21;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                byte[] bArr2 = AudioAttributesImplApi26Parcelizer;
                long j2 = 0;
                if (bArr2 != null) {
                    int i13 = i10 + 63;
                    $11 = i13 % 128;
                    if (i13 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    int i14 = 0;
                    while (i14 < length) {
                        int i15 = $11 + 75;
                        $10 = i15 % 128;
                        if (i15 % i5 != 0) {
                            Object[] objArr3 = new Object[1];
                            objArr3[i7] = Integer.valueOf(bArr2[i14]);
                            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                            if (objRemoteActionCompatParcelizer2 == null) {
                                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                int iIndexOf = 3081 - TextUtils.indexOf((CharSequence) "", '0');
                                int i16 = (Process.getElapsedCpuTime() > j2 ? 1 : (Process.getElapsedCpuTime() == j2 ? 0 : -1)) + 127;
                                byte b2 = (byte) i7;
                                byte b3 = b2;
                                String str$$i = $$i(b2, b3, b3);
                                Class[] clsArr = new Class[1];
                                clsArr[i7] = Integer.TYPE;
                                objRemoteActionCompatParcelizer2 = startForeground.read(tapTimeout, iIndexOf, i16, 2145850993, false, str$$i, clsArr);
                            }
                            bArr[i14] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                            i14 %= 1;
                            i5 = 2;
                        } else {
                            try {
                                Object[] objArr4 = new Object[1];
                                objArr4[i7] = Integer.valueOf(bArr2[i14]);
                                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(28234468);
                                if (objRemoteActionCompatParcelizer3 == null) {
                                    byte b4 = (byte) i7;
                                    byte b5 = b4;
                                    objRemoteActionCompatParcelizer3 = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 3082 - (ViewConfiguration.getLongPressTimeout() >> 16), (ExpandableListView.getPackedPositionForGroup(i7) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i7) == 0L ? 0 : -1)) + 128, 2145850993, false, $$i(b4, b5, b5), new Class[]{Integer.TYPE});
                                }
                                bArr[i14] = ((Byte) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).byteValue();
                                i14++;
                                i5 = 2;
                                i7 = 0;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        j2 = 0;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = AudioAttributesImplApi26Parcelizer;
                    Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(AudioAttributesCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(559968424);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), Color.alpha(0) + 24297, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 11, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) read) ^ 7899112766888837815L)));
                    j = 7899112766888837815L;
                } else {
                    j = 7899112766888837815L;
                    iIntValue = (short) (((short) (((long) AudioAttributesImplBaseParcelizer[i2 + ((int) (((long) AudioAttributesCompatParcelizer) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) read) ^ 7899112766888837815L)));
                }
            } else {
                j = 7899112766888837815L;
            }
            if (iIntValue > 0) {
                buildresumedownloadsintent.read = ((i2 + iIntValue) - 2) + ((int) (((long) AudioAttributesCompatParcelizer) ^ j)) + i4;
                try {
                    Object[] objArr6 = {buildresumedownloadsintent, Integer.valueOf(i), Integer.valueOf(MediaBrowserCompatItemReceiver), sb};
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(107629512);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        objRemoteActionCompatParcelizer5 = startForeground.read((char) (34135 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 13433 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 21, 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).append(buildresumedownloadsintent.IconCompatParcelizer);
                    buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                    byte[] bArr4 = AudioAttributesImplApi26Parcelizer;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        int i17 = 0;
                        while (i17 < length2) {
                            int i18 = $10 + 81;
                            int i19 = i18 % 128;
                            $11 = i19;
                            int i20 = i18 % 2;
                            bArr5[i17] = (byte) (((long) bArr4[i17]) ^ 7899112766888837815L);
                            i17++;
                            int i21 = i19 + 49;
                            $10 = i21 % 128;
                            int i22 = i21 % 2;
                        }
                        bArr4 = bArr5;
                    }
                    boolean z = bArr4 != null;
                    buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                    while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                        if (z) {
                            byte[] bArr6 = AudioAttributesImplApi26Parcelizer;
                            buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                            buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr6[r3]) ^ 7899112766888837815L)) + s)) ^ b));
                        } else {
                            short[] sArr = AudioAttributesImplBaseParcelizer;
                            buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                            buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r3]) ^ 7899112766888837815L)) + s)) ^ b));
                        }
                        sb.append(buildresumedownloadsintent.IconCompatParcelizer);
                        buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                        buildresumedownloadsintent.AudioAttributesCompatParcelizer++;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    public static /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(isCompatibleForAdaptationWith iscompatibleforadaptationwith) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 53;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopup = read(iscompatibleforadaptationwith);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 31;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return getshowpopup;
    }

    private final void MediaBrowserCompatItemReceiver() {
        IconCompatParcelizer(FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer(), new Object[]{this}, -1770411404, FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer(), 1770411404, FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer(), FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer());
    }

    private SegmentBaseSegmentTemplate MediaBrowserCompatMediaItem() {
        return (SegmentBaseSegmentTemplate) IconCompatParcelizer(FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer(), new Object[]{this}, 1939739248, FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer(), -1939739247, FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer(), FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer());
    }
}
