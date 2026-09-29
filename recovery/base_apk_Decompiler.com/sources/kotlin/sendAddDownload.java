package kotlin;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.ResponseError;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes3.dex */
public final class sendAddDownload implements sendRemoveDownload {
    private static final byte[] $$a = {31, 80, -124, -66};
    private static final int $$b = 214;
    private static final Map<String, Integer> AudioAttributesCompatParcelizer;
    private static char[] IconCompatParcelizer;
    private static long RemoteActionCompatParcelizer;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r7, byte r8, int r9) {
        /*
            int r7 = r7 * 3
            int r7 = 101 - r7
            int r8 = r8 * 4
            int r8 = 1 - r8
            int r9 = r9 * 2
            int r9 = 3 - r9
            byte[] r0 = kotlin.sendAddDownload.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r4 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2b:
            int r9 = -r9
            int r7 = r7 + r9
            r9 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sendAddDownload.$$c(int, byte, int):java.lang.String");
    }

    static {
        RemoteActionCompatParcelizer();
        AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
    }

    private static Map<String, Integer> AudioAttributesCompatParcelizer() throws Throwable {
        HashMap map = new HashMap();
        Object[] objArr = new Object[1];
        a(2 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.getCapsMode("", 0, 0), (char) (11820 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr);
        map.put((String) objArr[0], 35);
        Object[] objArr2 = new Object[1];
        a(View.getDefaultSize(0, 0) + 14, MotionEvent.axisFromString("") + 4, (char) View.MeasureSpec.getMode(0), objArr2);
        map.put((String) objArr2[0], 65);
        Object[] objArr3 = new Object[1];
        a(11 - MotionEvent.axisFromString(""), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 17, (char) ((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 33521), objArr3);
        map.put((String) objArr3[0], 167);
        Object[] objArr4 = new Object[1];
        a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, 29 - TextUtils.indexOf("", ""), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr4);
        map.put((String) objArr4[0], 32);
        Object[] objArr5 = new Object[1];
        a(MotionEvent.axisFromString("") + 8, (Process.myTid() >> 22) + 40, (char) (View.resolveSizeAndState(0, 0, 0) + 20506), objArr5);
        map.put((String) objArr5[0], 142);
        Object[] objArr6 = new Object[1];
        a((KeyEvent.getMaxKeyCode() >> 16) + 12, (ViewConfiguration.getTouchSlop() >> 8) + 47, (char) TextUtils.indexOf("", "", 0), objArr6);
        map.put((String) objArr6[0], 30);
        Object[] objArr7 = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 18, 58 - TextUtils.lastIndexOf("", '0'), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12121), objArr7);
        map.put((String) objArr7[0], 18);
        Object[] objArr8 = new Object[1];
        a(View.MeasureSpec.getSize(0) + 18, 76 - (ViewConfiguration.getTapTimeout() >> 16), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr8);
        map.put((String) objArr8[0], 178);
        Object[] objArr9 = new Object[1];
        a(10 - View.resolveSize(0, 0), KeyEvent.keyCodeFromString("") + 94, (char) View.MeasureSpec.getMode(0), objArr9);
        map.put((String) objArr9[0], 83);
        Object[] objArr10 = new Object[1];
        a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 9, (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 104, (char) (Color.rgb(0, 0, 0) + 16789699), objArr10);
        map.put((String) objArr10[0], 43);
        Object[] objArr11 = new Object[1];
        a(21 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 112 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (41706 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), objArr11);
        map.put((String) objArr11[0], 170);
        Object[] objArr12 = new Object[1];
        a(TextUtils.getCapsMode("", 0, 0) + 15, TextUtils.getCapsMode("", 0, 0) + TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, (char) Gravity.getAbsoluteGravity(0, 0), objArr12);
        map.put((String) objArr12[0], 121);
        Object[] objArr13 = new Object[1];
        a(AndroidCharacter.getMirror('0') - ',', ExpandableListView.getPackedPositionType(0L) + 149, (char) (Color.argb(0, 0, 0, 0) + 9981), objArr13);
        map.put((String) objArr13[0], 158);
        Object[] objArr14 = new Object[1];
        a(11 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 153 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (29248 - KeyEvent.keyCodeFromString("")), objArr14);
        map.put((String) objArr14[0], 79);
        Object[] objArr15 = new Object[1];
        a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 7, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 164, (char) View.getDefaultSize(0, 0), objArr15);
        map.put((String) objArr15[0], 9);
        Object[] objArr16 = new Object[1];
        a((KeyEvent.getMaxKeyCode() >> 16) + 24, TextUtils.getOffsetAfter("", 0) + 170, (char) View.getDefaultSize(0, 0), objArr16);
        map.put((String) objArr16[0], 151);
        Object[] objArr17 = new Object[1];
        a(5 - Color.blue(0), TextUtils.getOffsetBefore("", 0) + 194, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 26209), objArr17);
        map.put((String) objArr17[0], 68);
        Object[] objArr18 = new Object[1];
        a(15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 198 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) Gravity.getAbsoluteGravity(0, 0), objArr18);
        map.put((String) objArr18[0], 96);
        Object[] objArr19 = new Object[1];
        a(Process.getGidForName("") + 12, KeyEvent.keyCodeFromString("") + 214, (char) (22007 - TextUtils.getCapsMode("", 0, 0)), objArr19);
        map.put((String) objArr19[0], 67);
        Object[] objArr20 = new Object[1];
        a(7 - TextUtils.getOffsetBefore("", 0), 225 - View.resolveSizeAndState(0, 0, 0), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr20);
        map.put((String) objArr20[0], 162);
        Object[] objArr21 = new Object[1];
        a(5 - View.MeasureSpec.makeMeasureSpec(0, 0), 232 - Drawable.resolveOpacity(0, 0), (char) (Color.red(0) + 43151), objArr21);
        map.put((String) objArr21[0], 37);
        Object[] objArr22 = new Object[1];
        a(15 - (ViewConfiguration.getScrollBarSize() >> 8), 237 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr22);
        map.put((String) objArr22[0], 11);
        Object[] objArr23 = new Object[1];
        a((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 5, 251 - ImageFormat.getBitsPerPixel(0), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 50157), objArr23);
        map.put((String) objArr23[0], 45);
        Object[] objArr24 = new Object[1];
        a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 20, 258 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 56415), objArr24);
        map.put((String) objArr24[0], 47);
        Object[] objArr25 = new Object[1];
        a(Color.rgb(0, 0, 0) + 16777218, 279 - View.combineMeasuredStates(0, 0), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr25);
        map.put((String) objArr25[0], 159);
        Object[] objArr26 = new Object[1];
        a(15 - KeyEvent.keyCodeFromString(""), KeyEvent.keyCodeFromString("") + 281, (char) (ImageFormat.getBitsPerPixel(0) + 65390), objArr26);
        map.put((String) objArr26[0], 185);
        Object[] objArr27 = new Object[1];
        a(8 - KeyEvent.keyCodeFromString(""), 296 - (Process.myPid() >> 22), (char) (48239 - Gravity.getAbsoluteGravity(0, 0)), objArr27);
        map.put((String) objArr27[0], 91);
        Object[] objArr28 = new Object[1];
        a(6 - Color.red(0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 303, (char) (22798 - Color.blue(0)), objArr28);
        map.put((String) objArr28[0], 59);
        Object[] objArr29 = new Object[1];
        a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11, TextUtils.indexOf((CharSequence) "", '0') + 311, (char) (Color.argb(0, 0, 0, 0) + 50242), objArr29);
        map.put((String) objArr29[0], 136);
        Object[] objArr30 = new Object[1];
        a(TextUtils.lastIndexOf("", '0', 0, 0) + 4, 321 - View.getDefaultSize(0, 0), (char) (ExpandableListView.getPackedPositionChild(0L) + 1), objArr30);
        map.put((String) objArr30[0], 13);
        Object[] objArr31 = new Object[1];
        a(5 - Drawable.resolveOpacity(0, 0), 324 - Drawable.resolveOpacity(0, 0), (char) (27764 - Color.green(0)), objArr31);
        map.put((String) objArr31[0], 56);
        Object[] objArr32 = new Object[1];
        a(23 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 329, (char) (12019 - (ViewConfiguration.getEdgeSlop() >> 16)), objArr32);
        map.put((String) objArr32[0], 60);
        Object[] objArr33 = new Object[1];
        a(9 - TextUtils.getTrimmedLength(""), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 350, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 6322), objArr33);
        map.put((String) objArr33[0], 42);
        Object[] objArr34 = new Object[1];
        a(7 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 360 - ExpandableListView.getPackedPositionType(0L), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), objArr34);
        map.put((String) objArr34[0], 139);
        Object[] objArr35 = new Object[1];
        a(TextUtils.getOffsetAfter("", 0) + 9, Drawable.resolveOpacity(0, 0) + 366, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr35);
        map.put((String) objArr35[0], 102);
        Object[] objArr36 = new Object[1];
        a(10 - (ViewConfiguration.getTapTimeout() >> 16), 375 - View.MeasureSpec.getSize(0), (char) ((-16777216) - Color.rgb(0, 0, 0)), objArr36);
        map.put((String) objArr36[0], 61);
        Object[] objArr37 = new Object[1];
        a((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 15, 384 - Process.getGidForName(""), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 17726), objArr37);
        map.put((String) objArr37[0], 180);
        Object[] objArr38 = new Object[1];
        a(16 - View.MeasureSpec.getMode(0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + ResponseError.NO_INTERNET_ERROR, (char) (Color.alpha(0) + 62717), objArr38);
        map.put((String) objArr38[0], 108);
        Object[] objArr39 = new Object[1];
        a(ExpandableListView.getPackedPositionGroup(0L) + 12, (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 416, (char) (MotionEvent.axisFromString("") + 1), objArr39);
        map.put((String) objArr39[0], 53);
        Object[] objArr40 = new Object[1];
        a(10 - Process.getGidForName(""), 427 - TextUtils.lastIndexOf("", '0', 0), (char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr40);
        map.put((String) objArr40[0], 98);
        Object[] objArr41 = new Object[1];
        a(Color.alpha(0) + 8, ExpandableListView.getPackedPositionType(0L) + 439, (char) (Color.green(0) + 36774), objArr41);
        map.put((String) objArr41[0], Integer.valueOf(TsExtractor.TS_STREAM_TYPE_SPLICE_INFO));
        Object[] objArr42 = new Object[1];
        a((ViewConfiguration.getFadingEdgeLength() >> 16) + 6, Color.argb(0, 0, 0, 0) + 447, (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr42);
        map.put((String) objArr42[0], 75);
        Object[] objArr43 = new Object[1];
        a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9, 454 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (38343 - TextUtils.getOffsetAfter("", 0)), objArr43);
        map.put((String) objArr43[0], 156);
        Object[] objArr44 = new Object[1];
        a(View.resolveSizeAndState(0, 0, 0) + 13, Color.red(0) + 463, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), objArr44);
        map.put((String) objArr44[0], 38);
        Object[] objArr45 = new Object[1];
        a(16 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 476, (char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr45);
        map.put((String) objArr45[0], 82);
        Object[] objArr46 = new Object[1];
        a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11, (ViewConfiguration.getFadingEdgeLength() >> 16) + 492, (char) (62678 - TextUtils.getOffsetAfter("", 0)), objArr46);
        map.put((String) objArr46[0], 111);
        Object[] objArr47 = new Object[1];
        a((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 15, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 502, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr47);
        map.put((String) objArr47[0], 152);
        Object[] objArr48 = new Object[1];
        a(TextUtils.indexOf("", "", 0) + 9, ExpandableListView.getPackedPositionChild(0L) + 519, (char) (TextUtils.indexOf("", "", 0, 0) + 16633), objArr48);
        map.put((String) objArr48[0], 51);
        Object[] objArr49 = new Object[1];
        a(Process.getGidForName("") + 14, 527 - Color.alpha(0), (char) Gravity.getAbsoluteGravity(0, 0), objArr49);
        map.put((String) objArr49[0], 106);
        Object[] objArr50 = new Object[1];
        a(2 - (ViewConfiguration.getEdgeSlop() >> 16), 540 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 4494), objArr50);
        map.put((String) objArr50[0], 28);
        Object[] objArr51 = new Object[1];
        a(10 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 543 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (View.combineMeasuredStates(0, 0) + 5107), objArr51);
        map.put((String) objArr51[0], 120);
        Object[] objArr52 = new Object[1];
        a((ViewConfiguration.getLongPressTimeout() >> 16) + 9, 552 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (35249 - KeyEvent.keyCodeFromString("")), objArr52);
        map.put((String) objArr52[0], 72);
        Object[] objArr53 = new Object[1];
        a(2 - (ViewConfiguration.getWindowTouchSlop() >> 8), KeyEvent.getDeadChar(0, 0) + 560, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21935), objArr53);
        map.put((String) objArr53[0], 107);
        Object[] objArr54 = new Object[1];
        a(ExpandableListView.getPackedPositionType(0L) + 20, 563 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) View.resolveSize(0, 0), objArr54);
        map.put((String) objArr54[0], 174);
        Object[] objArr55 = new Object[1];
        a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 13, 581 - ImageFormat.getBitsPerPixel(0), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr55);
        map.put((String) objArr55[0], 87);
        Object[] objArr56 = new Object[1];
        a(8 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 595, (char) ExpandableListView.getPackedPositionType(0L), objArr56);
        map.put((String) objArr56[0], 3);
        Object[] objArr57 = new Object[1];
        a((KeyEvent.getMaxKeyCode() >> 16) + 10, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 603, (char) (7730 - Process.getGidForName("")), objArr57);
        map.put((String) objArr57[0], 10);
        Object[] objArr58 = new Object[1];
        a(1 - (ViewConfiguration.getJumpTapTimeout() >> 16), 613 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) TextUtils.getOffsetAfter("", 0), objArr58);
        map.put((String) objArr58[0], 150);
        Object[] objArr59 = new Object[1];
        a((-16777207) - Color.rgb(0, 0, 0), 615 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr59);
        map.put((String) objArr59[0], 144);
        Object[] objArr60 = new Object[1];
        a(9 - TextUtils.getCapsMode("", 0, 0), View.resolveSizeAndState(0, 0, 0) + 623, (char) View.resolveSizeAndState(0, 0, 0), objArr60);
        map.put((String) objArr60[0], 24);
        Object[] objArr61 = new Object[1];
        a(10 - View.getDefaultSize(0, 0), 632 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) Color.alpha(0), objArr61);
        map.put((String) objArr61[0], 2);
        Object[] objArr62 = new Object[1];
        a(Color.alpha(0) + 14, ((Process.getThreadPriority(0) + 20) >> 6) + 642, (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr62);
        map.put((String) objArr62[0], 1);
        Object[] objArr63 = new Object[1];
        a(ExpandableListView.getPackedPositionChild(0L) + 9, 656 - (ViewConfiguration.getScrollBarSize() >> 8), (char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 61129), objArr63);
        map.put((String) objArr63[0], 177);
        Object[] objArr64 = new Object[1];
        a((ViewConfiguration.getTouchSlop() >> 8) + 12, TextUtils.indexOf("", "", 0) + 664, (char) (57804 - (ViewConfiguration.getScrollBarSize() >> 8)), objArr64);
        map.put((String) objArr64[0], 50);
        Object[] objArr65 = new Object[1];
        a(TextUtils.indexOf("", "", 0, 0) + 8, 676 - TextUtils.getOffsetAfter("", 0), (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 45113), objArr65);
        map.put((String) objArr65[0], 179);
        Object[] objArr66 = new Object[1];
        a(3 - View.MeasureSpec.getMode(0), 684 - KeyEvent.normalizeMetaState(0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), objArr66);
        map.put((String) objArr66[0], 20);
        Object[] objArr67 = new Object[1];
        a(Color.blue(0) + 7, KeyEvent.keyCodeFromString("") + 687, (char) TextUtils.indexOf("", "", 0, 0), objArr67);
        map.put((String) objArr67[0], 12);
        Object[] objArr68 = new Object[1];
        a(17 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), TextUtils.indexOf("", "", 0) + 694, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 28434), objArr68);
        map.put((String) objArr68[0], 100);
        Object[] objArr69 = new Object[1];
        a(6 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 709, (char) KeyEvent.keyCodeFromString(""), objArr69);
        map.put((String) objArr69[0], 114);
        Object[] objArr70 = new Object[1];
        a((ViewConfiguration.getFadingEdgeLength() >> 16) + 8, 716 - (ViewConfiguration.getTapTimeout() >> 16), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr70);
        map.put((String) objArr70[0], 143);
        Object[] objArr71 = new Object[1];
        a(8 - View.combineMeasuredStates(0, 0), TextUtils.indexOf("", "", 0) + 724, (char) TextUtils.indexOf("", "", 0, 0), objArr71);
        map.put((String) objArr71[0], 94);
        Object[] objArr72 = new Object[1];
        a(Color.blue(0) + 6, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 731, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), objArr72);
        map.put((String) objArr72[0], 92);
        Object[] objArr73 = new Object[1];
        a(1 - Color.red(0), Process.getGidForName("") + 739, (char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr73);
        map.put((String) objArr73[0], 48);
        Object[] objArr74 = new Object[1];
        a(13 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), Color.argb(0, 0, 0, 0) + 739, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 47088), objArr74);
        map.put((String) objArr74[0], 124);
        Object[] objArr75 = new Object[1];
        a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 9, ((byte) KeyEvent.getModifierMetaStateMask()) + 753, (char) (Process.getGidForName("") + 58950), objArr75);
        map.put((String) objArr75[0], 99);
        Object[] objArr76 = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0', 0) + 20, 760 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (242 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr76);
        map.put((String) objArr76[0], 141);
        Object[] objArr77 = new Object[1];
        a(TextUtils.indexOf("", "") + 11, 780 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr77);
        map.put((String) objArr77[0], 44);
        Object[] objArr78 = new Object[1];
        a(11 - TextUtils.indexOf("", ""), 791 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr78);
        map.put((String) objArr78[0], 8);
        Object[] objArr79 = new Object[1];
        a((ViewConfiguration.getTapTimeout() >> 16) + 3, (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 802, (char) ((Process.getThreadPriority(0) + 20) >> 6), objArr79);
        map.put((String) objArr79[0], 109);
        Object[] objArr80 = new Object[1];
        a(7 - (Process.myPid() >> 22), 804 - TextUtils.indexOf((CharSequence) "", '0'), (char) (18456 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), objArr80);
        map.put((String) objArr80[0], 66);
        Object[] objArr81 = new Object[1];
        a((ViewConfiguration.getEdgeSlop() >> 16) + 6, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 811, (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr81);
        map.put((String) objArr81[0], 169);
        Object[] objArr82 = new Object[1];
        a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3, ((byte) KeyEvent.getModifierMetaStateMask()) + TarConstants.LF_CHR, (char) ((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13885), objArr82);
        map.put((String) objArr82[0], 90);
        Object[] objArr83 = new Object[1];
        a(View.resolveSizeAndState(0, 0, 0) + 16, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 821, (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr83);
        map.put((String) objArr83[0], 123);
        Object[] objArr84 = new Object[1];
        a(15 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 837, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), objArr84);
        map.put((String) objArr84[0], 171);
        Object[] objArr85 = new Object[1];
        a(((Process.getThreadPriority(0) + 20) >> 6) + 1, 852 - TextUtils.indexOf("", ""), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), objArr85);
        map.put((String) objArr85[0], 77);
        Object[] objArr86 = new Object[1];
        a(7 - KeyEvent.getDeadChar(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 852, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr86);
        map.put((String) objArr86[0], 101);
        Object[] objArr87 = new Object[1];
        a((Process.myTid() >> 22) + 13, TextUtils.getCapsMode("", 0, 0) + 860, (char) (42095 - View.MeasureSpec.makeMeasureSpec(0, 0)), objArr87);
        map.put((String) objArr87[0], 85);
        Object[] objArr88 = new Object[1];
        a(TextUtils.indexOf("", "") + 13, Gravity.getAbsoluteGravity(0, 0) + 873, (char) (AndroidCharacter.getMirror('0') + 43210), objArr88);
        map.put((String) objArr88[0], 137);
        Object[] objArr89 = new Object[1];
        a(1 - (ViewConfiguration.getEdgeSlop() >> 16), ExpandableListView.getPackedPositionType(0L) + 886, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 63505), objArr89);
        map.put((String) objArr89[0], 93);
        Object[] objArr90 = new Object[1];
        a(6 - ExpandableListView.getPackedPositionType(0L), KeyEvent.keyCodeFromString("") + 887, (char) (38401 - View.combineMeasuredStates(0, 0)), objArr90);
        map.put((String) objArr90[0], 36);
        Object[] objArr91 = new Object[1];
        a(5 - (KeyEvent.getMaxKeyCode() >> 16), 893 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) KeyEvent.normalizeMetaState(0), objArr91);
        map.put((String) objArr91[0], 5);
        Object[] objArr92 = new Object[1];
        a(KeyEvent.keyCodeFromString("") + 13, 898 - TextUtils.getOffsetBefore("", 0), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 65268), objArr92);
        map.put((String) objArr92[0], 7);
        Object[] objArr93 = new Object[1];
        a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 19, (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 910, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr93);
        map.put((String) objArr93[0], 29);
        Object[] objArr94 = new Object[1];
        a(22 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 931, (char) ((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 41434), objArr94);
        map.put((String) objArr94[0], 164);
        Object[] objArr95 = new Object[1];
        a(18 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 952 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr95);
        map.put((String) objArr95[0], 15);
        Object[] objArr96 = new Object[1];
        a(KeyEvent.keyCodeFromString("") + 12, 968 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr96);
        map.put((String) objArr96[0], 81);
        Object[] objArr97 = new Object[1];
        a((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 7, (ViewConfiguration.getEdgeSlop() >> 16) + 980, (char) (4819 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr97);
        map.put((String) objArr97[0], 112);
        Object[] objArr98 = new Object[1];
        a(((Process.getThreadPriority(0) + 20) >> 6) + 9, 987 - View.MeasureSpec.getSize(0), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr98);
        map.put((String) objArr98[0], 69);
        Object[] objArr99 = new Object[1];
        a(Color.red(0) + 10, ((byte) KeyEvent.getModifierMetaStateMask()) + 997, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 7846), objArr99);
        map.put((String) objArr99[0], 117);
        Object[] objArr100 = new Object[1];
        a(9 - TextUtils.indexOf("", "", 0), View.MeasureSpec.makeMeasureSpec(0, 0) + AnalyticsListener.EVENT_BANDWIDTH_ESTIMATE, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), objArr100);
        map.put((String) objArr100[0], 186);
        Object[] objArr101 = new Object[1];
        a(View.combineMeasuredStates(0, 0) + 13, ExpandableListView.getPackedPositionChild(0L) + AnalyticsListener.EVENT_VIDEO_DECODER_INITIALIZED, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr101);
        map.put((String) objArr101[0], 104);
        Object[] objArr102 = new Object[1];
        a(View.MeasureSpec.makeMeasureSpec(0, 0) + 10, 1028 - TextUtils.getOffsetAfter("", 0), (char) (TextUtils.lastIndexOf("", '0', 0) + 14841), objArr102);
        map.put((String) objArr102[0], 128);
        Object[] objArr103 = new Object[1];
        a(View.MeasureSpec.getMode(0) + 5, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1039, (char) (37497 - ((Process.getThreadPriority(0) + 20) >> 6)), objArr103);
        map.put((String) objArr103[0], 70);
        Object[] objArr104 = new Object[1];
        a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 8, 1043 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (15722 - TextUtils.getTrimmedLength("")), objArr104);
        map.put((String) objArr104[0], 63);
        Object[] objArr105 = new Object[1];
        a(8 - TextUtils.getCapsMode("", 0, 0), 1100 - AndroidCharacter.getMirror('0'), (char) Color.blue(0), objArr105);
        map.put((String) objArr105[0], 176);
        Object[] objArr106 = new Object[1];
        a((ViewConfiguration.getScrollBarSize() >> 8) + 4, 1060 - TextUtils.indexOf("", "", 0, 0), (char) (TextUtils.getTrimmedLength("") + 60587), objArr106);
        map.put((String) objArr106[0], 78);
        Object[] objArr107 = new Object[1];
        a(15 - ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.getCapsMode("", 0, 0) + 1064, (char) (KeyEvent.getMaxKeyCode() >> 16), objArr107);
        map.put((String) objArr107[0], 147);
        Object[] objArr108 = new Object[1];
        a(Color.red(0) + 16, 1079 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (View.MeasureSpec.getMode(0) + 44862), objArr108);
        map.put((String) objArr108[0], 163);
        Object[] objArr109 = new Object[1];
        a(8 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), TextUtils.indexOf("", "", 0) + 1095, (char) TextUtils.getTrimmedLength(""), objArr109);
        map.put((String) objArr109[0], 149);
        Object[] objArr110 = new Object[1];
        a(KeyEvent.keyCodeFromString("") + 10, ((byte) KeyEvent.getModifierMetaStateMask()) + 1103, (char) (TextUtils.getTrimmedLength("") + 25633), objArr110);
        map.put((String) objArr110[0], 133);
        Object[] objArr111 = new Object[1];
        a(8 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 1112, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), objArr111);
        map.put((String) objArr111[0], 40);
        Object[] objArr112 = new Object[1];
        a(17 - View.MeasureSpec.getSize(0), 1120 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr112);
        map.put((String) objArr112[0], 153);
        Object[] objArr113 = new Object[1];
        a(8 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1137 - Color.argb(0, 0, 0, 0), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 54030), objArr113);
        map.put((String) objArr113[0], 89);
        Object[] objArr114 = new Object[1];
        a(12 - Process.getGidForName(""), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1144, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 54314), objArr114);
        map.put((String) objArr114[0], 57);
        Object[] objArr115 = new Object[1];
        a(KeyEvent.getDeadChar(0, 0) + 5, 1158 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (ExpandableListView.getPackedPositionChild(0L) + 1), objArr115);
        map.put((String) objArr115[0], 25);
        Object[] objArr116 = new Object[1];
        a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 17, TextUtils.lastIndexOf("", '0') + 1164, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), objArr116);
        map.put((String) objArr116[0], 140);
        Object[] objArr117 = new Object[1];
        a(8 - TextUtils.indexOf("", "", 0), 1180 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16051), objArr117);
        map.put((String) objArr117[0], 52);
        Object[] objArr118 = new Object[1];
        a(View.MeasureSpec.getSize(0) + 11, 1187 - TextUtils.indexOf((CharSequence) "", '0'), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr118);
        map.put((String) objArr118[0], 84);
        Object[] objArr119 = new Object[1];
        a((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1198, (char) (23520 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr119);
        map.put((String) objArr119[0], 74);
        Object[] objArr120 = new Object[1];
        a((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 17, 1224 - TextUtils.getCapsMode("", 0, 0), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr120);
        map.put((String) objArr120[0], Integer.valueOf(TarConstants.PREFIXLEN_XSTAR));
        Object[] objArr121 = new Object[1];
        a(14 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1240 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr121);
        map.put((String) objArr121[0], 113);
        Object[] objArr122 = new Object[1];
        a(Color.alpha(0) + 5, 1255 - Color.red(0), (char) (Color.alpha(0) + 35498), objArr122);
        map.put((String) objArr122[0], 34);
        Object[] objArr123 = new Object[1];
        a(TextUtils.getOffsetAfter("", 0) + 8, 1260 - KeyEvent.normalizeMetaState(0), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr123);
        map.put((String) objArr123[0], 173);
        Object[] objArr124 = new Object[1];
        a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 9, 1268 - Color.red(0), (char) (26674 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr124);
        map.put((String) objArr124[0], 187);
        Object[] objArr125 = new Object[1];
        a(10 - View.resolveSize(0, 0), 1275 - MotionEvent.axisFromString(""), (char) (TextUtils.indexOf("", "", 0) + 37453), objArr125);
        map.put((String) objArr125[0], 88);
        Object[] objArr126 = new Object[1];
        a(ImageFormat.getBitsPerPixel(0) + 9, 1287 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) KeyEvent.getDeadChar(0, 0), objArr126);
        map.put((String) objArr126[0], 154);
        Object[] objArr127 = new Object[1];
        a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7, 1294 - Color.alpha(0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), objArr127);
        map.put((String) objArr127[0], 105);
        Object[] objArr128 = new Object[1];
        a(8 - (ViewConfiguration.getScrollDefaultDelay() >> 16), ExpandableListView.getPackedPositionChild(0L) + 1303, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), objArr128);
        map.put((String) objArr128[0], 27);
        Object[] objArr129 = new Object[1];
        a(20 - View.MeasureSpec.getMode(0), (ViewConfiguration.getLongPressTimeout() >> 16) + 1310, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 12166), objArr129);
        map.put((String) objArr129[0], 6);
        Object[] objArr130 = new Object[1];
        a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 8, (-16775886) - Color.rgb(0, 0, 0), (char) (37094 - (Process.myTid() >> 22)), objArr130);
        map.put((String) objArr130[0], 122);
        Object[] objArr131 = new Object[1];
        a(15 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1338, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr131);
        map.put((String) objArr131[0], 4);
        Object[] objArr132 = new Object[1];
        a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 8, Color.green(0) + 1353, (char) (35401 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr132);
        map.put((String) objArr132[0], 71);
        Object[] objArr133 = new Object[1];
        a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7, 1361 - TextUtils.getTrimmedLength(""), (char) (ViewConfiguration.getTouchSlop() >> 8), objArr133);
        map.put((String) objArr133[0], Integer.valueOf(TarConstants.CHKSUM_OFFSET));
        Object[] objArr134 = new Object[1];
        a(6 - Color.argb(0, 0, 0, 0), View.MeasureSpec.getSize(0) + 1369, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr134);
        map.put((String) objArr134[0], 181);
        Object[] objArr135 = new Object[1];
        a(KeyEvent.normalizeMetaState(0) + 15, (ViewConfiguration.getScrollBarSize() >> 8) + 1375, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 53846), objArr135);
        map.put((String) objArr135[0], 41);
        Object[] objArr136 = new Object[1];
        a((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13, 1390 - Color.alpha(0), (char) (1 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), objArr136);
        map.put((String) objArr136[0], 126);
        Object[] objArr137 = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 9, 1404 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), objArr137);
        map.put((String) objArr137[0], 22);
        Object[] objArr138 = new Object[1];
        a((ViewConfiguration.getWindowTouchSlop() >> 8) + 13, (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1411, (char) (11942 - View.getDefaultSize(0, 0)), objArr138);
        map.put((String) objArr138[0], 39);
        Object[] objArr139 = new Object[1];
        a(16 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1425, (char) TextUtils.getOffsetAfter("", 0), objArr139);
        map.put((String) objArr139[0], 73);
        Object[] objArr140 = new Object[1];
        a((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 7, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1442, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 9688), objArr140);
        map.put((String) objArr140[0], 127);
        Object[] objArr141 = new Object[1];
        a(TextUtils.getOffsetAfter("", 0) + 4, (KeyEvent.getMaxKeyCode() >> 16) + 1450, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 32819), objArr141);
        map.put((String) objArr141[0], 21);
        Object[] objArr142 = new Object[1];
        a((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 12, (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1453, (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr142);
        map.put((String) objArr142[0], 86);
        Object[] objArr143 = new Object[1];
        a(13 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1466, (char) (MotionEvent.axisFromString("") + 29377), objArr143);
        map.put((String) objArr143[0], Integer.valueOf(TsExtractor.TS_STREAM_TYPE_AC3));
        Object[] objArr144 = new Object[1];
        a(3 - Color.argb(0, 0, 0, 0), Color.rgb(0, 0, 0) + 16778695, (char) (36599 - View.combineMeasuredStates(0, 0)), objArr144);
        map.put((String) objArr144[0], 64);
        Object[] objArr145 = new Object[1];
        a(View.combineMeasuredStates(0, 0) + 11, Drawable.resolveOpacity(0, 0) + 1482, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr145);
        map.put((String) objArr145[0], 161);
        Object[] objArr146 = new Object[1];
        a(12 - TextUtils.getOffsetAfter("", 0), 1493 - (Process.myPid() >> 22), (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr146);
        map.put((String) objArr146[0], 23);
        Object[] objArr147 = new Object[1];
        a(View.combineMeasuredStates(0, 0) + 10, ExpandableListView.getPackedPositionChild(0L) + 1506, (char) (61951 - (ViewConfiguration.getScrollBarSize() >> 8)), objArr147);
        map.put((String) objArr147[0], 97);
        Object[] objArr148 = new Object[1];
        a((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 12, 1514 - MotionEvent.axisFromString(""), (char) (Color.rgb(0, 0, 0) + 16788378), objArr148);
        map.put((String) objArr148[0], 46);
        Object[] objArr149 = new Object[1];
        a(9 - View.MeasureSpec.getMode(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1528, (char) (TextUtils.lastIndexOf("", '0') + 1), objArr149);
        map.put((String) objArr149[0], 119);
        Object[] objArr150 = new Object[1];
        a(ExpandableListView.getPackedPositionChild(0L) + 13, 1538 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (19816 - TextUtils.indexOf((CharSequence) "", '0')), objArr150);
        map.put((String) objArr150[0], 103);
        Object[] objArr151 = new Object[1];
        a(13 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1549 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr151);
        map.put((String) objArr151[0], Integer.valueOf(TarConstants.PREFIXLEN));
        Object[] objArr152 = new Object[1];
        a((ViewConfiguration.getTapTimeout() >> 16) + 12, 1562 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (Process.getGidForName("") + 1), objArr152);
        map.put((String) objArr152[0], 95);
        Object[] objArr153 = new Object[1];
        a(11 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1574 - View.resolveSize(0, 0), (char) (46482 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr153);
        map.put((String) objArr153[0], 31);
        Object[] objArr154 = new Object[1];
        a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12, 1584 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr154);
        map.put((String) objArr154[0], 184);
        Object[] objArr155 = new Object[1];
        a(5 - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.indexOf("", "", 0, 0) + 1597, (char) (TextUtils.getCapsMode("", 0, 0) + 11992), objArr155);
        map.put((String) objArr155[0], 14);
        Object[] objArr156 = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 6, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1601, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 23160), objArr156);
        map.put((String) objArr156[0], Integer.valueOf(TsExtractor.TS_STREAM_TYPE_HDMV_DTS));
        Object[] objArr157 = new Object[1];
        a(10 - (ViewConfiguration.getLongPressTimeout() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1607, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr157);
        map.put((String) objArr157[0], 145);
        Object[] objArr158 = new Object[1];
        a((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 8, 1617 - (Process.myPid() >> 22), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr158);
        map.put((String) objArr158[0], 0);
        Object[] objArr159 = new Object[1];
        a(9 - TextUtils.indexOf("", "", 0, 0), 1625 - View.MeasureSpec.getMode(0), (char) ExpandableListView.getPackedPositionType(0L), objArr159);
        map.put((String) objArr159[0], 62);
        Object[] objArr160 = new Object[1];
        a((Process.myTid() >> 22) + 5, TextUtils.lastIndexOf("", '0') + 1635, (char) TextUtils.getCapsMode("", 0, 0), objArr160);
        map.put((String) objArr160[0], 19);
        Object[] objArr161 = new Object[1];
        a(4 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 1639, (char) ((-16740404) - Color.rgb(0, 0, 0)), objArr161);
        map.put((String) objArr161[0], 157);
        Object[] objArr162 = new Object[1];
        a(18 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1643, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), objArr162);
        map.put((String) objArr162[0], 182);
        Object[] objArr163 = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 11, 1662 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr163);
        map.put((String) objArr163[0], 76);
        Object[] objArr164 = new Object[1];
        a((-16777206) - Color.rgb(0, 0, 0), 1672 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr164);
        map.put((String) objArr164[0], 116);
        Object[] objArr165 = new Object[1];
        a(15 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1682 - View.getDefaultSize(0, 0), (char) KeyEvent.normalizeMetaState(0), objArr165);
        map.put((String) objArr165[0], 168);
        Object[] objArr166 = new Object[1];
        a((KeyEvent.getMaxKeyCode() >> 16) + 7, ExpandableListView.getPackedPositionGroup(0L) + 1696, (char) (54052 - (ViewConfiguration.getScrollBarSize() >> 8)), objArr166);
        map.put((String) objArr166[0], 175);
        Object[] objArr167 = new Object[1];
        a(3 - TextUtils.indexOf((CharSequence) "", '0', 0), TextUtils.lastIndexOf("", '0') + 1704, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 14653), objArr167);
        map.put((String) objArr167[0], 160);
        Object[] objArr168 = new Object[1];
        a(Color.blue(0) + 9, 1706 - TextUtils.lastIndexOf("", '0', 0, 0), (char) TextUtils.getOffsetBefore("", 0), objArr168);
        map.put((String) objArr168[0], 146);
        Object[] objArr169 = new Object[1];
        a(9 - KeyEvent.normalizeMetaState(0), 1716 - KeyEvent.normalizeMetaState(0), (char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 27553), objArr169);
        map.put((String) objArr169[0], 33);
        Object[] objArr170 = new Object[1];
        a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 5, 1726 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) TextUtils.getOffsetBefore("", 0), objArr170);
        map.put((String) objArr170[0], 183);
        Object[] objArr171 = new Object[1];
        a(Color.argb(0, 0, 0, 0) + 19, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1730, (char) (11709 - View.MeasureSpec.makeMeasureSpec(0, 0)), objArr171);
        map.put((String) objArr171[0], 54);
        Object[] objArr172 = new Object[1];
        a(6 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 1749, (char) (23457 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr172);
        map.put((String) objArr172[0], 16);
        Object[] objArr173 = new Object[1];
        a(12 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1755, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr173);
        map.put((String) objArr173[0], 132);
        Object[] objArr174 = new Object[1];
        a(9 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1767, (char) View.resolveSizeAndState(0, 0, 0), objArr174);
        map.put((String) objArr174[0], 115);
        Object[] objArr175 = new Object[1];
        a(6 - TextUtils.indexOf("", "", 0), 1775 - Color.blue(0), (char) (29614 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr175);
        map.put((String) objArr175[0], 26);
        Object[] objArr176 = new Object[1];
        a(11 - Drawable.resolveOpacity(0, 0), 1781 - TextUtils.getTrimmedLength(""), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 34681), objArr176);
        map.put((String) objArr176[0], 165);
        Object[] objArr177 = new Object[1];
        a(TextUtils.getCapsMode("", 0, 0) + 11, 1792 - TextUtils.getOffsetBefore("", 0), (char) TextUtils.indexOf("", "", 0), objArr177);
        map.put((String) objArr177[0], 80);
        Object[] objArr178 = new Object[1];
        a((ViewConfiguration.getWindowTouchSlop() >> 8) + 8, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1803, (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr178);
        map.put((String) objArr178[0], Integer.valueOf(TsExtractor.TS_STREAM_TYPE_AC4));
        Object[] objArr179 = new Object[1];
        a(7 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1811 - TextUtils.getOffsetAfter("", 0), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr179);
        map.put((String) objArr179[0], 58);
        Object[] objArr180 = new Object[1];
        a(11 - (Process.myTid() >> 22), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1817, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), objArr180);
        map.put((String) objArr180[0], Integer.valueOf(TsExtractor.TS_STREAM_TYPE_E_AC3));
        Object[] objArr181 = new Object[1];
        a(Gravity.getAbsoluteGravity(0, 0) + 20, 1829 - View.MeasureSpec.getSize(0), (char) (Process.getGidForName("") + 1), objArr181);
        map.put((String) objArr181[0], 118);
        Object[] objArr182 = new Object[1];
        a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 19, 1848 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr182);
        map.put((String) objArr182[0], Integer.valueOf(TsExtractor.TS_STREAM_TYPE_DTS));
        Object[] objArr183 = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 14, 1868 - View.combineMeasuredStates(0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 53910), objArr183);
        map.put((String) objArr183[0], 166);
        Object[] objArr184 = new Object[1];
        a(View.combineMeasuredStates(0, 0) + 6, (ViewConfiguration.getEdgeSlop() >> 16) + 1881, (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr184);
        map.put((String) objArr184[0], 49);
        Object[] objArr185 = new Object[1];
        a(KeyEvent.getDeadChar(0, 0) + 12, 1887 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (24845 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr185);
        map.put((String) objArr185[0], 17);
        Object[] objArr186 = new Object[1];
        a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 13, (-16775317) - Color.rgb(0, 0, 0), (char) View.MeasureSpec.getSize(0), objArr186);
        map.put((String) objArr186[0], 55);
        Object[] objArr187 = new Object[1];
        a(8 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1913, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr187);
        map.put((String) objArr187[0], 125);
        Object[] objArr188 = new Object[1];
        a(15 - Color.alpha(0), Drawable.resolveOpacity(0, 0) + 1920, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), objArr188);
        map.put((String) objArr188[0], 110);
        return map;
    }

    @Override // kotlin.sendRemoveDownload
    public final int AudioAttributesCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
        Integer num = AudioAttributesCompatParcelizer.get(downloadHelperExternalSyntheticLambda4.MediaBrowserCompatMediaItem());
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r27, int r28, char r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sendAddDownload.a(int, int, char, java.lang.Object[]):void");
    }

    static void RemoteActionCompatParcelizer() {
        char[] cArr = new char[1935];
        ByteBuffer.wrap("òmv¢ûÀÜ\u007fX¶ÕÇR\rÏ\u001bDpÀ\u0095}Þúðw1ìHikå³bÃ^\u0093ÚJW<ÐïMçÆ\u0082Bgÿ*x\u001eõön¦ë\u0095Ü\u007fXªÕÉR\bÏ0DXÀ\u0095}ßúþw\u000bìJ\u008cy\b¶\u0085Ö\u0002\u0005\u009f,\u0014E\u0090\u009eÜoX±ÕÚR\bÏ!DuÀ\u0094}ñúów\u001bìVi~ó\u001ewÂú¨}|àLk\u001aïøR§Õ\u008cXqÃ(F\u0010ÊÌM«°`;T¾;ÜnX·ÕÜR\tÏ0DdÀ\u0085}Óúñw=ìOicå bÅ\u009f\u0018\u0014+\u0091B\r\u0099ÜoX±ÕÆR\u001cÏ-DqÀ°}Àúùw\bì¬hxå\u0005bÚÿ½t¥ðPM\u0002Ê7~\u00adúqw\u001bðÏmíæ³b_ß\bX9ÕÊN\u008dË´GgÀ\u001c=ß¶÷3\u0094¯Q(l¥5\u001eÙÜkX¬ÕÇR\u000fÏ4DIÀ\u0093}Çúþw1ìLicå bÊ\u009f\u0015ú\u0085~Zó%tâ®\u0003*Ð§\u00ad e½@6\u0017²ù\u000f\u00ad\u0088\u0091\u0005}ÜxX¶ÕÍR\u0013Ï#D~À\u0094ÜoX±ÕÆR\u001cÏ-DqÀ\u00ad}Ûúòw>ìTikå\u00adbÄ\u009f\u0011\u0014!\u0091G\r\u00ad\u008a\u00ad\u0007ù¼\u000b9X¶d2¡º\u001c>Ê³¦4o©@ÜoX²ÕÁR\u001fÏ*DbÀ¡}Çúèw\u0006ìlieå¿bÃ\u009f\u001e\u0089\u009a\rG\u0080,\u0007ú\u009aÖ\u0011\u0093\u0095H(!¯\u000e\"ê¹¬ÜOX\u008cÕíR;Ï\u0010DYÀ²tóð#}Nú\u0096g®ÜGX\u009bÕñR%Ï\u0012D_À¤}÷úÓw1ìqiDå\u0080bô\u009f?\u001f\u0080\u009bP\u00161\u0091þ\fÆ\u0087\u0095\u00000\u0084í\t\u009e\u008e@\u0013u\u0098=\u001cþ¡\u0098&·«Y03µ:9à¾\u009cCAÈXM\u000bÑÑVþÛ·`BÜeXº#*§ö*\u009c\u00adH0j»4?Ø\u0082\u008f\u0005¾\u0088M\u0013\n\u00963\u001aà\u009d\u009b`X`\u000eäÐi¿îBsBø\u001d|ûÁµ\u0085j\u0001µ\u008cÏ\u000b\u0013\u0096\"\u001dl\u0018)\u009cî\u0011\u0085\u0096M\u000bv\u0080\u000b\u0004Ö¹\u0099>ª³@(\u001fÜzX¿ÕÄ°\u001e4Ä¹½>c£Uò\u008cvEû4|þáçj\u0080îrS3Ô\u0003YÙÂ®G\u0095ËBL!±ê:Þ¿±#]¤T)\u0019\u0092â\u0017µÄÒ@\u0003Í}J\u0094×\u0085\\ÕØ8e`âHÜoX±ÕÌR\u001fÏ'DeÜbX»ÕßR%Ï4DdÀ\u0089}ÑúùÜtX³ÕÄR\u0014Ï7D,À\u0083}×úòw\r\u0099y\u001d¥\u0090Ï\u0017\u001b\u008a*\u0001z\u0085\u00918Ê¿ë2\u001c©C,k º'ÑÚ\r(\u0095¬F!&¦ä;Ë°\u00824m\u0089;\u000e\b\u0083ü\u0018«\u009d¨\u0011E\u00962kþàËÜoX±ÕÆR\u001eÏ\u001bD~À\u0094}ßúðw1ìKi~Ü\u007fXºÕÃR%Ï4DwÀ\u0099}Þúów\u000fì\\SÅ×\nZjÝ¹@\u0090ËïO/òpÜ\u007fXªÕÉR\u000eÏ1DeI§Íp@\fÇØZíÑ¢UBè o)âÅÜaX·ÕÆR8Ï1DpÀ\u0086}×úîw:ìQigå±ÜaX±ÕÌR\u000fÏ(DsÀ\u0093}ñúów\u0003ìHifå±bÒ\u009f\u0015\u0014&(·¬K!\u0011¦Ù;â°¯4X\u00890\u000e3\u0083È\u0018\u008bÜ{X¨ÕûR\u001fÏ'DcÀ\u0092}Ûúèw\u0017ìtioå¢bÃ\u009f\u001c\u009c\u008d\u0018J\u0095=\u0012í\u008fÎ\u0004Õ\u0080a=8º\fÜcX¬ÕÌR\u001fÏ6DIÀ\u0084}×úèw\u000fìQifå§ÍÀIaÏ\u009cK_Æ>AèÜÃW\u0080Ówn\u000eé\u0001UÓÑ\u001a\\}Û¬F\u0090ÍóI(ôssH\u0089ÿ\r]Ü^X\u009bÕæR?Ï\u0013DIÀ¦}þúÓw9ìgi^å\u008dbö\u009f5\u0014\u001d\u0091j\r±\u008a\u009d\u0007ÈÜoX«ÕÛR\u000eÏ+D{À\u0085}ÀúÌw\u0006ìWidå±ÜjX¿ÕÄR\u0016Ï\u0006DwÀ\u0083}ÙÂIF\u008cË÷L Ñ\u0013ZzÞ§cèäÃi1Ü_ÜaX¿ÕÐR2Ï!D\u007fÀ\u0087}ÚúèÜ~X»ÕÙR\u000fÏ!DeÀ\u0094}ûúøÜoX«ÕÛR\u000eÏ+D{À\u0085}ÀúÕw\nÜeX°ÕÁR\u000eÏ-DwÀ\u008c}Ûúæw\u000fìLicå»bÈ2¥¶a;\u0010¼Â!ëª².I\u0093\u0001=£¹s4\u0016³Ò.×¥¹!C\u009c\u0010\u001b$\u0096Ç\r\u009a\u0088²lXè\u0088eõâ6\u007f\u0011ôJp\u0090ÍïÜgX»ÕÑÜ~X¸Õ÷R\u000eÏ=DfÀ\u0085³n7ªºÞ=\u0006 0+i¯\u0085\u0012â\u0095á\u0018\u0016\u0083N\u0006u\u008a¨\rÒð\u000f{'ÜxX©ÕÁR\u001eÏ0D~ÜoX²ÕÁR\u001fÏ*DbÀ©}ÖÜaX\u00adÕ\u0092R\u0016Ï%DcÀ\u0092}ÞÜoX±ÕÝR\nÏ+DxÜhk\u0095ï]b\u001eåãxÆó\u0095wdÊ\u000fM\u0003Àú[½Þ\u0096RA:+¾ú3\u0083´[)v¢:&Á\u009b\u0083\u001c±Ü\u009dXCÕ4RîÏßD\u0083ÀW}8ú\u001ewõì¸i\u0081åub1\u009fá\u0014ß\u0091°\rh\u008aIÜ\u007fX«ÕÊR\u0017Ï-DbÀ\u0094}×úøw!ìVÜ|X¬ÕÇR\u001cÏ-DzÀ\u0085}íúìw\u0007ì[ÜaX\u0097ÕÌ\u0094`\u0010µ\u009dß\u001a\u0017\u0087.\fm\u0088\u009dÜyX¬ÕÄR%Ï2D$êDn\u0091ãùÜoX»ÕÆR\u0019Ï~DrÀ\u0085}Ôúýw\u001bìTi~å\u008bbí\u009f9\u0014\u0006Ü_X»ÕÏR\u0017Ï!DxÀ\u0094}æúùw\u0003ìHifåµbÒ\u009f\u0015Ü~Ü(X\u00adÕÜR\u001bÏ&DzÀ\u0085x\u000eüÐq¿öPkYà\u000bdàÙ¯^°ÓnH\"Í\u000bAÏt½ða}\u000búßgòì\u00adhIÕ\u001cR9ßÚD\u0083Á½Mk$iJlÎ±CÚÄ\fY ÒeÜ{X·ÕÌR\u000eÏ,\"\u0095¦o+$¬ú1Õº\u008c>g\u0083/\u0004\u0007\u0089ô\u0012\u0081\u0097\u009f\u001bPÜ\u007fX«ÕÊR\tÏ'DdÀ\u0089}Âúèw\u0007ìWidå\u008bbÖ\u009f\u0015\u00140\u0091E\r\u0091\u008a¬}\u0084ùAt<óånÉå\u0093a|Ü$[\tÖãM½È\u0084DWÃ,>ïµÇ0¢¬l+@¦\u0005\u001dûÜkX¬ÕÇR\u000fÏ4DIÀ\u0084}×úïw\rìJicå¤bÒ\u009f\u0019\u0014-\u0091BÜ\u007fX³ÕÉR\bÏ0DIÀ\u0092}×úÿw\u000fìTifÎ«JlÇ\u000e@ÝÝÿVªÒAÜ\u007fX¶ÕÇR\rÏ\nDcÀ\u0084}ÕúùÂËF\u001bËmL¹Ñ\u0092ZÄÞ'cväVi\u00adÜnX±ÕÌR\u0003Ï\u001bD~À\u0094}ßúðÜGX\u009bÕñR%Ï\u0001DNÀ´}÷úÒw=ìqiEå\u009aå\u0091a^ì këöÎ}\u008bùkD\u0015Ã\u000bNøN9ÊÆG³Àf]Qá\u0003eÆè°o\u007fò\\y?ýå@¼Ç\u0093ÜaX·ÕÅR\u001fÏ\u0010DoÀ\u0090}×0Å´\u001a9g¾¨ÜaX«ÕÄR\u000eÏ-DIÀ\u0094}Úúéw\u0003ìZidåµbÏ\u009f\u001csB÷\u0081zãý7`\u001fëLo\u0093ÒãUÆØ%CjÆQJ®Íù0:»\u0019Ü|X¿ÕÑR\u0016Ï+DwÀ\u0084¸@<\u009a±û68«\r V¤¯\u0019ç\u009eô\u0013+ÜaX½ÕÙR9Ï+DcÀ\u008e}ÆÜOX±ÕÆR\u000eÏ!DxÀ\u0094}âúîw\u0001ìLioå·bÒ\u009f\u0019\u0014-\u0091B\u000fn\u008b¢\u0006×\u0081\u0007\u001cq\u0097i\u0013\u009d®Ò\bE\u008c\u0081\u0001ñ\u0086$\u001b\u0001\u0090Q\u0014¯©ê.ó£)8s½I1\u0092ÜeX°ÕÜR\bÏ+ÜyX°ÕÌR\u001fÏ6DdÀ\u0095}ÜúÈw\u0006ìJioå§bÎ\u009f\u001f\u0014.\u0091HâÜf\u0002ënl»ñ\u0084zÀþ\u001aCeÜoX±ÕÆR\u000eÏ!DxÀ\u0094}æúåw\u001eì]\u0087\u0081\u0003[\u008e,\tó\u0094Å\u001f¦\u009br&7¡\u000f,ë·¶2\u009e¾U92ÄùOÍÊ¢VZÑ]\\\bçåb¢í\u0089i]ô2Ü\\X\u0092ÕéR4Ï\u001bDBÀ¹}âúÙw1ì|iOå\u0092bç\u009f%\u0014\u000e\u0091xÜ\u007fX¶ÕÇR\rÏ\u001bD~À\u008f}ßúùw1ìHikå³bÃVÁÒ\u0006_mØ¥E\u009eÜcX®ÕÜR\u0013Ï+DxÀ¿}\u0086´Q0\u009c½î:!§\u0019,J¨\u008d\u0015µN2ÊûG\u008aÀ@]VÖ?RØï\u0092h¼åZÜcX®ÕÜR\u0013Ï+DxÀ¿}\u0080ÜcX®ÕÜR\u0013Ï+DxÀ¿}\u0081ÜcX®ÕÜR\u0013Ï+DxÀ¿}\u008aóÁw\u001dúw}£à\u0084kÑï*RxÕEXªÃÿFÏÊ\u0019M\u007f°µ;\u008b¾ÿ\"(¥\u0001(RL\u0085ÈHE:Âõ_ÍÔ\u009ePYíbÜCX\u0090ÕíR%Ï\u0013DSÀ¥}ùúÃw'ìviUå\u0087bã\u009f3V+Òæ_\u0094Ø[EcÎ0J÷÷ÍÜ|X¬ÕÇR\u001cÏ-DzÀ\u0085}ÁÜ\\X»ÕÚR\u0013Ï+Dr\u000e\t\u008aí\u0007\u0099\u0080A\u001dw\u0096.\u0012Â¯°(£¥U>\u000b»07ë°\u009eMCÜ^X»ÕØR\bÏ!DeÀ\u0085}Üúèw\u000fìLicå»bÈÜcX®ÕÜR\u0013Ï+DxÀ¿}\u0083òÛv\rûo|°á\u008bjÖî/SwÔ[Y¼Â÷GÃË\u001cÜmX«ÕÌR\u0013Ï+DEÀ\u0081}ßúìw\u0002ìQidå³bô\u009f\u0011\u00146\u0091Iù }jð\u0019wÁêùa åKX\u000f\\QØ\u008cUöÒ,Ü\u007fXªÕÉR\bÏ0DAÀ\u0089}Æúôw=ìyiZ®\u008d*z§\t Ê½ð6·²T\u000f\u001b\u00883\u0005À\u009e«\u001b¯\u0097`R¤Ö@[;ÜhX»ÕÛR\u0013Ï#DxÀ\u0081}Æúõw\u0001ìVÜaX\u009aÕÁR\tÏ'DyÀ\u0095}Üúèw#ìYiz-¼©o$\u0012£Ú>èµ¬1\\\u008c\u0012\u000b.\u0086Â÷Ýs\u0001þky¿ä\u009doÃë/VzÑU\\±ÇýBÙÎ\nÜhX»ÕÛR\u0019Ï\u001bD~À\u0094}ßúð\u0091\u0001\u0015Ò\u0098¢\u001f|\u0082I\t\u001a\u008dû0\u0097·\u0090:q¡4$\u000fÜ}X«ÕÍR\tÏ0D\u007fÀ\u008f}ÜúÃw\nì]iyå·ÜoX±ÕÆR\u001eÏ\u001bD~À\u0094}ßúðw1ì]i~iùí*`Jç\u0088z§ñîu\u0001ÈWOdÂ\u0090YÇÜGX\u009bÕñR%Ï\u0000D_À³}ñúÓw;ìvi^ò¹vcû\u0014|Ëáý\u0086\u0000\u0002Ï\u008f¤\bn\u0095YÜ~X¸Õ÷R\u0018Ï%DxÀ\u008e}×úîw\u001dÜhX«ÕÚR\u001bÏ0D\u007fÀ\u008f}ÜÜOX±ÕÅR\nÏ%DxÀ\u0089}ÝúòÜ`X°ÕÉR\u0017Ï!S¸×\u007fZ\bÝØ@ûÜGX\u009bÕñR%Ï\u0001DNÀ´}÷úÒw=ìqiEå\u009abù\u009f4\u0014\u0003\u0091u\r\u00adÜnX¿ÕÛR\u001fÏ\u001bDfÀ\u0092}Ûúÿw\u000bÜtX³ÕÄR\u0014Ï7D,À\u008d}Áúìw\u001cÜGX\u009bÕñR%Ï\u0002D_À²}áúÈw1ìviKå\u0099bã\u000fj\u008b\u009b\u0006ÿ\u0081;\u001c5\u0097`\u0013\u0088å]a\u0082ìûk ÜxX·ÕÅR\u001fÏ7DuÀ\u0081}Þúù·å39¾S9\u0087¤·/á«\r\u0016D\u0091{ÜzX¿ÕÄR\u000fÏ!ñãu&ø[\u007f\u0082â®iôí\u001bPC×nZ\u0084ÁÚDãÈ0OK²\u00889 ¼Þ \r§0\u0087Ì\u0003\u0012\u008ef\t®\u0094\u008b\u001fÃÜyX°ÕÉR\u0019Ï'DsÀ\u0090}Æúýw\fìTioÜtX³ÕÄR\u0014Ï7D,À\u008d}Á¯ê+6¦\\!\u0088¼ 7ÿ[:ßéR\u0094Õ\\HyÃ.GÀú\u0094}¶ðRk\u0002ÜiX°ÕÞR\u0013Ï6DyÀ\u008e}ßúùw\u0000ìLÜkX¬ÕÇR\u000fÏ4DIÀ\u0089}ÖÜ\u007fX»ÕÚR\fÏ-DuÀ\u0085Ü\u007fX½ÕÀR\u001fÏ)DsÀ©}ÖúÉw\u001cìQÜ}X«ÕÍR\bÏ=DRÀ\u0095}Àúýw\u001aìQieåºbõ\u009f\u0015\u0014!\u0091C\r\u0090\u008a¬\u0007éÜ^X\u009bÕæR?Ï\u0013DIÀ¦}þúÓw9ìgi^å\u008dbö\u009f5\u0014\u001d\u0091x\r©\u008a\u0087\u000eë\u008a-\u0007b\u0080\u008a\u001d©\u0096ó\u0012\u001c¯U(l¥\u0088>ò»ð7/ÜxX»ÕÛR\u000eÏ\rDr½q9¿´Ä3\u0019®\u0016%\u007f¡\u0088\u001cË\u009bð\u0016\n\u008dY\btÜaX\u009bÕÐR\u000eÏ!DxÀ\u0093}Ûúów\u0000ì|ikå\u00adbÕÜkX¿ÕÜR\u001fÏ3DwÀ\u0099ÜGX\u009bÕñR%Ï\u0000DSÀ³}ûúÛw ìyi^å\u009dbé\u009f>".getBytes(CharsetNames.ISO_8859_1)).asCharBuffer().get(cArr, 0, 1935);
        IconCompatParcelizer = cArr;
        RemoteActionCompatParcelizer = -3597033578997393186L;
    }
}
