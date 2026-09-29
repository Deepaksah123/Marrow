package kotlin;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.media.MediaCodec;
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
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.wallet.WalletConstants;
import com.marrow.data.models.ResponseError;
import com.marrow.data.models.lesson.LessonIndex;
import com.marrow.data.models.video.ThemeState;
import com.marrow.data.utils.product.exceptions.ResponseErrorException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import kotlin.getCurrentEventTimeUs;
import kotlin.getLatestBitrateEstimate;
import kotlin.getSaveProfileModel;
import kotlin.parseCea708AccessibilityChannel;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes5.dex */
public final class setEductionDegrees$2 extends getAddress {
    private static final byte[] $$a;
    private static final int $$b;
    private /* synthetic */ getCurrentEventTimeUs IconCompatParcelizer;

    static {
        byte[] bArr = new byte[825];
        System.arraycopy("\u000eØÝn\u0000*Ó\u0001ÿ\u000bò\tç\u0000ú\u0007\u0013çð\u0012ü\u0002ì\u0012\u001dÓ\u0001ü\u000eìåó\u0000*Ó\u0001ü\u000eì#îî\u000eýø\u0002î\u0014ò\u0000\u001dã\nç2Ó\u0002\u0001\u0017â\böúý\u0002\f\u000eì\u0003í)Ý\nþø\u0018Þ\u0004ü\fç\u0000ú\u0007\u001cÞñ\u000fð\bøû\nù\u0000*Ó\u0001ü\u000eì\u0000,Üÿ\u0012Û\u000fï\u000f\u001bÔ\u000e÷ì÷ýú\u000e#Ýî\nù\u0000*Ó\u0001ü\u000eì#îî\u000eýø\u0002î\u0014òðì\nú\u0006#Ó\u0001ü\u000eìýÿýñÿ\u000b\u0001ð!ìô\u0000üý-Ð\bÿò4Ñ\u0010é\b(Ì\u0012\u0001í\u0000\u0004ü\u0001\u0000\u001dã\nç2Ó\u0002\u0001\u001fç\u0000ú\u0007\u0017ä\u0000\u001aíÿù\u0016äË\u0010úù-Ìÿ\u0001\b\u0006ì\u0000\u000eñ/Ó\u0001ü\u000eì#îî\u000eýø\u0002î\u0014ò\u0000\u001dã\nç2Ó\u0002\u0001\u0019í\u0003î\u000eú\u0000\u001aç\u0001ø\u001bä\u001eÝ\fî\fùù\u0001\u0000\u001aç\u0001ø\u001bä\u001dÛ\u000fï\u000f\u001bÔ\u000e÷\u0000\u001aÞ\u0004þç\u0000ú\u0007\u001eÏ\u0002÷\u0003\rò.Ó\u0001ü\u000eì&ç\u0000ú\u0007\u0017Ô\u000e÷\u0004\bô\u000eç\u0000ú\u0007\u001eÏ\u0002÷\u0003\rò.Ó\u0001ü\u000eì í\u0003î\u000eú\u0015ìñý\b÷!ì\u0001ýûò\u0010òýÿýñÿ\röúý\u0002\f\u000eì\u0003í)Ý\nþø\u0018Þ\u0004ü\f\u0000\u001dÝ\fô\u000eî\f\u0000\u001dÝ\fô\u000eî\f\u001eÓ\u0002\u0001\u0017â\b\u0000\u001dîë\u0001\r\u0000\u001aç\u0001ø\u001bä èì\u0003\u0006ò\t÷\u0006\u0017ç\u0000ú\u0007\u0010ã\nç(îë\u0001\r\u001bâ\u0015êö\túú\u0006\u0017à%æò\t÷\u0006òË\u0010úù-Ìÿ\u0001\b\u0006ì\u0000\u000eñ)Ûü\u0003*Ð\u00066ûåîî\u000eýø\u0002î\u0014ò\u0000'äíþ-Öüú\u0015î\r\u0000\u001dã\nç\u0000 ç\u0000ú\u0007\u001eÌ\u0000ÿ\u0004\u0000(Î\u0010öùç\u0000ú\u0007\u001eÏ\u0002÷\u0003\rò.Ó\u0001ü\u000eì0Í\u0001þ\u0004\u0001+Ýî\nù\u0000\u001bìñý\b÷!ì\u0001ýûò\u0010òç\u0000ú\u0007\u001dÓ\u0000ù\u0001\u0002\u0002ÿ\u0006ò.Ó\u0001ü\u000eì&ç\u0000ú\u0007\u001dÓ\u0000ù\u0001\u0002\u0002ÿ\u0006ò(Ûü\u0003*Ð\u00066\u0000ëÌ\u0003\u0001\u0010\u001eØú\tþò\u001fìóû\u000fñþ!ìñý\b÷!ì\u0001ýûò\u0010òç\u0000ú\u0007\u001eÏ\u0002÷\u0003\rò.Ó\u0001ü\u000eì*Ô\u000e÷\u001aì\u0001ýûò\u0010ò\u0000*Í\u0001þ\u0004\u0001+Ýî\nù\u0000\f\u0003üüÿ\u0014ìî\ròû\u0010ò+Öü/àý÷!Ú÷\u0006\u0003\u0005ò\u0005\nó\ný\u0002)Ë\u0010úù-Ìÿ\u0001\b\u0006ì\u0000\u000eñ)Ûü\u0003)àí\r\u0014îî\u000eýø\u0002î\u0014ò\u0000\u001aíð êò\u000eÿù\u0006\u0017Ý\nþ\u0000\u001aíð0áðû\nù\u0000\u0004ú\u0006!Ö\fþõ\u0006\u0000\u0000\u001dÝ\fô\u000eî\f\u001eÓ\u0002\u0001\u0019í\u0003î\u000eú\u0000\u001dÝ\fô\u000eî\f\u001eÓ\u0002\u0001\u001fç\u0000ú\u0007\u0017ä".getBytes(CharsetNames.ISO_8859_1), 0, bArr, 0, 825);
        $$a = bArr;
        $$b = 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 65
            byte[] r0 = kotlin.setEductionDegrees$2.$$a
            int r7 = r7 + 4
            int r1 = 77 - r8
            byte[] r1 = new byte[r1]
            int r8 = 76 - r8
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L20:
            int r3 = r3 + 1
            int r7 = r7 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-1)
            r7 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setEductionDegrees$2.a(int, short, byte, java.lang.Object[]):void");
    }

    public setEductionDegrees$2(getCurrentEventTimeUs getcurrenteventtimeus) {
        this.IconCompatParcelizer = getcurrenteventtimeus;
    }

    @Override // kotlin.ProRequestBody
    public final void RemoteActionCompatParcelizer(Map<String, String> map, PlaybackException playbackException) throws Throwable {
        getCurrentEventTimeUs getcurrenteventtimeus = this.IconCompatParcelizer;
        try {
            Object[] objArr = {playbackException, 1000};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(478375515);
            if (objRemoteActionCompatParcelizer == null) {
                char scrollBarSize = (char) (63098 - (ViewConfiguration.getScrollBarSize() >> 8));
                int minimumFlingVelocity = 24580 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int i = 20 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                byte b = (byte) $$b;
                short s = $$a[247];
                Object[] objArr2 = new Object[1];
                a(b, s, (byte) (s | 32), objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(scrollBarSize, minimumFlingVelocity, i, 1657449166, false, (String) objArr2[0], new Class[]{Throwable.class, Integer.TYPE});
            }
            AbstractMap abstractMap = (AbstractMap) ((Method) objRemoteActionCompatParcelizer).invoke(getcurrenteventtimeus, objArr);
            abstractMap.putAll(map);
            getCurrentEventTimeUs getcurrenteventtimeus2 = this.IconCompatParcelizer;
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(875815479);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 63098), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 24580, 20 - (ViewConfiguration.getLongPressTimeout() >> 16), 1249519266, false, "onRemoveQueueItem", null);
            }
            ((maybeExpandData) ((Field) objRemoteActionCompatParcelizer2).get(getcurrenteventtimeus2)).IconCompatParcelizer(playbackException, abstractMap);
            Object[] objArr3 = {this.IconCompatParcelizer};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1818491688);
            if (objRemoteActionCompatParcelizer3 == null) {
                char c = (char) (63098 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                int i2 = 24580 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                int jumpTapTimeout = 20 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                Object[] objArr4 = new Object[1];
                a($$a[300], (short) 180, (byte) ($$b | 52), objArr4);
                objRemoteActionCompatParcelizer3 = startForeground.read(c, i2, jumpTapTimeout, 304758717, false, (String) objArr4[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (Process.getGidForName("") + 63099), 24580 - TextUtils.indexOf("", ""), 20 - Drawable.resolveOpacity(0, 0))});
            }
            ((parseLongAttr) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr3)).read(playbackException, "video_error", abstractMap);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // kotlin.ProRequestBody
    public final void RemoteActionCompatParcelizer$6204f77f(Enum r11) throws Throwable {
        if (setEductionDegrees$5.IconCompatParcelizer[r11.ordinal()] != 1) {
            return;
        }
        getCurrentEventTimeUs getcurrenteventtimeus = this.IconCompatParcelizer;
        try {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-726329590);
            if (objRemoteActionCompatParcelizer == null) {
                char cResolveSizeAndState = (char) (63098 - View.resolveSizeAndState(0, 0, 0));
                int iLastIndexOf = 24579 - TextUtils.lastIndexOf("", '0');
                int i = 20 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                byte[] bArr = $$a;
                Object[] objArr = new Object[1];
                a(bArr[336], (short) 147, bArr[548], objArr);
                objRemoteActionCompatParcelizer = startForeground.read(cResolveSizeAndState, iLastIndexOf, i, -1426271329, false, (String) objArr[0], new Class[0]);
            }
            ((Method) objRemoteActionCompatParcelizer).invoke(getcurrenteventtimeus, null);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // kotlin.ProRequestBody
    public final void write(int i, String str, PlaybackException playbackException) throws Throwable {
        try {
            Object[] objArr = {this.IconCompatParcelizer, ResponseError.customVideoError(i, str)};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1317869733);
            if (objRemoteActionCompatParcelizer == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 63099);
                int touchSlop = 24580 - (ViewConfiguration.getTouchSlop() >> 8);
                int iRed = Color.red(0) + 20;
                byte b = $$a[4];
                Object[] objArr2 = new Object[1];
                a(b, (short) (b | 203), r10[300], objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(cLastIndexOf, touchSlop, iRed, -818207794, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (TextUtils.getOffsetBefore("", 0) + 63098), TextUtils.lastIndexOf("", '0', 0) + 24581, KeyEvent.keyCodeFromString("") + 20), ResponseError.class});
            }
            ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr);
            getCurrentEventTimeUs getcurrenteventtimeus = this.IconCompatParcelizer;
            Object[] objArr3 = {playbackException, Integer.valueOf(i)};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(478375515);
            if (objRemoteActionCompatParcelizer2 == null) {
                char windowTouchSlop = (char) (63098 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                int iIndexOf = TextUtils.indexOf("", "") + 24580;
                int iMyPid = (Process.myPid() >> 22) + 20;
                byte b2 = (byte) $$b;
                short s = $$a[247];
                Object[] objArr4 = new Object[1];
                a(b2, s, (byte) (s | 32), objArr4);
                objRemoteActionCompatParcelizer2 = startForeground.read(windowTouchSlop, iIndexOf, iMyPid, 1657449166, false, (String) objArr4[0], new Class[]{Throwable.class, Integer.TYPE});
            }
            Map<String, String> map = (Map) ((Method) objRemoteActionCompatParcelizer2).invoke(getcurrenteventtimeus, objArr3);
            getCurrentEventTimeUs getcurrenteventtimeus2 = this.IconCompatParcelizer;
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(875815479);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (ExpandableListView.getPackedPositionGroup(0L) + 63098), (ViewConfiguration.getTouchSlop() >> 8) + 24580, (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 20, 1249519266, false, "onRemoveQueueItem", null);
            }
            ((maybeExpandData) ((Field) objRemoteActionCompatParcelizer3).get(getcurrenteventtimeus2)).RemoteActionCompatParcelizer(getChunkStartTimeUs.read, playbackException, map);
            Object[] objArr5 = {this.IconCompatParcelizer};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1247833003);
            if (objRemoteActionCompatParcelizer4 == null) {
                char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 63098);
                int scrollDefaultDelay = 24580 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int i2 = (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 20;
                Object[] objArr6 = new Object[1];
                a($$a[300], (short) 801, (byte) ($$b | 49), objArr6);
                objRemoteActionCompatParcelizer4 = startForeground.read(cResolveOpacity, scrollDefaultDelay, i2, -875147072, false, (String) objArr6[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 63098), 24580 - (ViewConfiguration.getTapTimeout() >> 16), 20 - TextUtils.indexOf("", ""))});
            }
            ((parseLongAttr) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).read(playbackException, "video_error", map);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // com.google.android.exoplayer2.util.EventLogger, com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void onAudioUnderrun(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        super.onAudioUnderrun(eventTime, i, j, j2);
        getCurrentEventTimeUs getcurrenteventtimeus = this.IconCompatParcelizer;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(875815479);
        if (objRemoteActionCompatParcelizer == null) {
            objRemoteActionCompatParcelizer = startForeground.read((char) (View.resolveSizeAndState(0, 0, 0) + 63098), TextUtils.getTrimmedLength("") + 24580, View.MeasureSpec.getMode(0) + 20, 1249519266, false, "onRemoveQueueItem", null);
        }
        ((maybeExpandData) ((Field) objRemoteActionCompatParcelizer).get(getcurrenteventtimeus)).IconCompatParcelizer(j2);
    }

    @Override // com.google.android.exoplayer2.util.EventLogger, com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i, long j) {
        super.onDroppedVideoFrames(eventTime, i, j);
        getCurrentEventTimeUs getcurrenteventtimeus = this.IconCompatParcelizer;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(875815479);
        if (objRemoteActionCompatParcelizer == null) {
            objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 63097), 24580 - Color.argb(0, 0, 0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 19, 1249519266, false, "onRemoveQueueItem", null);
        }
        ((maybeExpandData) ((Field) objRemoteActionCompatParcelizer).get(getcurrenteventtimeus)).AudioAttributesCompatParcelizer(i);
    }

    @Override // kotlin.getAddress
    public final void RemoteActionCompatParcelizer(int i, int i2, ExoPlaybackException exoPlaybackException) throws Throwable {
        try {
            Object[] objArr = {this.IconCompatParcelizer, setEductionDegrees$AudioAttributesCompatParcelizer.IDLE};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-510556995);
            if (objRemoteActionCompatParcelizer == null) {
                char cRgb = (char) (Color.rgb(0, 0, 0) + 16840314);
                int i3 = 24581 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int defaultSize = 20 - View.getDefaultSize(0, 0);
                byte b = (byte) $$b;
                short s = $$a[247];
                Object[] objArr2 = new Object[1];
                a(b, s, (byte) (s | 32), objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(cRgb, i3, defaultSize, -1613217752, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 63097), Color.red(0) + 24580, 20 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), setEductionDegrees$AudioAttributesCompatParcelizer.class});
            }
            ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr);
            if (i2 >= 3) {
                Object[] objArr3 = {this.IconCompatParcelizer, Integer.valueOf(i), exoPlaybackException, false};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(549842802);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char maxKeyCode = (char) (63098 - (KeyEvent.getMaxKeyCode() >> 16));
                    int absoluteGravity = 24580 - Gravity.getAbsoluteGravity(0, 0);
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 20;
                    byte b2 = (byte) $$b;
                    short s2 = $$a[247];
                    Object[] objArr4 = new Object[1];
                    a(b2, s2, (byte) (s2 | 32), objArr4);
                    objRemoteActionCompatParcelizer2 = startForeground.read(maxKeyCode, absoluteGravity, scrollDefaultDelay, 1586244583, false, (String) objArr4[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 63098), TextUtils.indexOf("", "", 0) + 24580, 20 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), Integer.TYPE, ExoPlaybackException.class, Boolean.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                return;
            }
            if (exoPlaybackException.getCause() instanceof MediaCodec.CodecException) {
                MediaCodec.CodecException codecException = (MediaCodec.CodecException) exoPlaybackException.getCause();
                String diagnosticInfo = codecException.getDiagnosticInfo();
                boolean zIsRecoverable = codecException.isRecoverable();
                boolean zIsTransient = codecException.isTransient();
                int errorCode = codecException.getErrorCode();
                HashMap map = new HashMap();
                map.put("diag_info", diagnosticInfo);
                map.put("recoverable", String.valueOf(zIsRecoverable));
                map.put("transient", String.valueOf(zIsTransient));
                map.put("error_cde", String.valueOf(errorCode));
                Object[] objArr5 = {this.IconCompatParcelizer};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1353886482);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char cArgb = (char) (Color.argb(0, 0, 0, 0) + 63098);
                    int iIndexOf = 24580 - TextUtils.indexOf("", "");
                    int mode = View.MeasureSpec.getMode(0) + 20;
                    Object[] objArr6 = new Object[1];
                    a($$a[300], (short) ($$b | 368), (byte) 68, objArr6);
                    objRemoteActionCompatParcelizer3 = startForeground.read(cArgb, iIndexOf, mode, -788230021, false, (String) objArr6[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 63098), 24581 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 20)});
                }
                ((getSaveProfileModel.RemoteActionCompatParcelizer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr5)).MediaBrowserCompatSearchResultReceiver("media_codec_ex - \n ".concat(String.valueOf(map)));
                RemoteActionCompatParcelizer("media_codec_ex", map.toString());
            } else {
                RemoteActionCompatParcelizer("player_ex", exoPlaybackException.getMessage());
            }
            Object[] objArr7 = {this.IconCompatParcelizer, Integer.valueOf(i), exoPlaybackException};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1792844208);
            if (objRemoteActionCompatParcelizer4 == null) {
                char c = (char) (63098 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                int gidForName = 24579 - Process.getGidForName("");
                int iRed = 20 - Color.red(0);
                byte b3 = $$a[4];
                Object[] objArr8 = new Object[1];
                a(b3, (short) (b3 | 203), r8[300], objArr8);
                objRemoteActionCompatParcelizer4 = startForeground.read(c, gidForName, iRed, 345335077, false, (String) objArr8[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63146 - AndroidCharacter.getMirror('0')), 24579 - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 20), Integer.TYPE, ExoPlaybackException.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr7);
            Object[] objArr9 = {this.IconCompatParcelizer, exoPlaybackException};
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1588838543);
            if (objRemoteActionCompatParcelizer5 == null) {
                char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 63098);
                int packedPositionGroup = 24580 - ExpandableListView.getPackedPositionGroup(0L);
                int i4 = (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 19;
                byte b4 = (byte) $$b;
                short s3 = $$a[247];
                Object[] objArr10 = new Object[1];
                a(b4, s3, (byte) (s3 | 32), objArr10);
                objRemoteActionCompatParcelizer5 = startForeground.read(pressedStateDuration, packedPositionGroup, i4, -553255964, false, (String) objArr10[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 63097), 24580 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 19), ExoPlaybackException.class});
            }
            ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr9);
            Object[] objArr11 = {this.IconCompatParcelizer, Integer.valueOf(i)};
            Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(1212533769);
            if (objRemoteActionCompatParcelizer6 == null) {
                char c2 = (char) (63098 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 24580;
                int i5 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 19;
                byte b5 = $$a[4];
                Object[] objArr12 = new Object[1];
                a(b5, (short) (b5 | 203), r5[300], objArr12);
                objRemoteActionCompatParcelizer6 = startForeground.read(c2, pressedStateDuration2, i5, 906758300, false, (String) objArr12[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63097 - TextUtils.indexOf((CharSequence) "", '0')), 24580 - (ViewConfiguration.getTouchSlop() >> 8), TextUtils.indexOf((CharSequence) "", '0') + 21), Integer.TYPE});
            }
            ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr11);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // kotlin.getAddress
    public final void read(PlaybackException playbackException) throws Throwable {
        try {
            Object[] objArr = {this.IconCompatParcelizer, setEductionDegrees$AudioAttributesCompatParcelizer.IDLE};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-510556995);
            if (objRemoteActionCompatParcelizer == null) {
                char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 63098);
                int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24580;
                int packedPositionGroup = 20 - ExpandableListView.getPackedPositionGroup(0L);
                byte b = (byte) $$b;
                short s = $$a[247];
                Object[] objArr2 = new Object[1];
                a(b, s, (byte) (s | 32), objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(scrollBarFadeDuration, scrollBarFadeDuration2, packedPositionGroup, -1613217752, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63098 - TextUtils.getOffsetAfter("", 0)), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24580, 20 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), setEductionDegrees$AudioAttributesCompatParcelizer.class});
            }
            ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr);
            StringBuilder sb = new StringBuilder();
            sb.append(playbackException.errorCode);
            sb.append(", ");
            sb.append(playbackException.getMessage());
            RemoteActionCompatParcelizer("player_ex_generic", sb.toString());
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // kotlin.getAddress
    public final void write(int i) throws Throwable {
        try {
            Object[] objArr = {this.IconCompatParcelizer, Integer.valueOf(i)};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1837447353);
            if (objRemoteActionCompatParcelizer == null) {
                char cGreen = (char) (63098 - Color.green(0));
                int iIndexOf = 24580 - TextUtils.indexOf("", "", 0);
                int scrollDefaultDelay = 20 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                byte b = (byte) (-$$a[294]);
                int i2 = $$b;
                Object[] objArr2 = new Object[1];
                a(b, (short) (i2 | 673), (byte) (i2 | 65), objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(cGreen, iIndexOf, scrollDefaultDelay, -332201006, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) ((KeyEvent.getMaxKeyCode() >> 16) + 63098), TextUtils.lastIndexOf("", '0') + 24581, 20 - (ViewConfiguration.getScrollBarSize() >> 8)), Integer.TYPE});
            }
            ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr);
            getCurrentEventTimeUs getcurrenteventtimeus = this.IconCompatParcelizer;
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-2080775187);
            if (objRemoteActionCompatParcelizer2 == null) {
                char mirror = (char) (63146 - AndroidCharacter.getMirror('0'));
                int i3 = 24579 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int keyRepeatDelay = 20 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                Object[] objArr3 = new Object[1];
                a($$a[300], (short) RendererCapabilities.MODE_SUPPORT_MASK, (byte) ($$b | 53), objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(mirror, i3, keyRepeatDelay, -38787208, false, (String) objArr3[0], new Class[0]);
            }
            ((Method) objRemoteActionCompatParcelizer2).invoke(getcurrenteventtimeus, null);
            getCurrentEventTimeUs getcurrenteventtimeus2 = this.IconCompatParcelizer;
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1358160811);
            if (objRemoteActionCompatParcelizer3 == null) {
                char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 63098);
                int trimmedLength = 24580 - TextUtils.getTrimmedLength("");
                int i4 = (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 20;
                byte b2 = (byte) $$b;
                short s = $$a[247];
                Object[] objArr4 = new Object[1];
                a(b2, s, (byte) (s | 32), objArr4);
                objRemoteActionCompatParcelizer3 = startForeground.read(offsetAfter, trimmedLength, i4, -783951680, false, (String) objArr4[0], new Class[0]);
            }
            if (((Boolean) ((Method) objRemoteActionCompatParcelizer3).invoke(getcurrenteventtimeus2, null)).booleanValue()) {
                Object[] objArr5 = {this.IconCompatParcelizer};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1580002368);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char cMyPid = (char) (63098 - (Process.myPid() >> 22));
                    int packedPositionGroup = 24580 - ExpandableListView.getPackedPositionGroup(0L);
                    int iMyPid = (Process.myPid() >> 22) + 20;
                    byte b3 = $$a[300];
                    int i5 = $$b;
                    Object[] objArr6 = new Object[1];
                    a(b3, (short) (i5 | 775), (byte) (i5 | 50), objArr6);
                    objRemoteActionCompatParcelizer4 = startForeground.read(cMyPid, packedPositionGroup, iMyPid, 543500501, false, (String) objArr6[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63098 - View.MeasureSpec.getMode(0)), (KeyEvent.getMaxKeyCode() >> 16) + 24580, 19 - ImageFormat.getBitsPerPixel(0))});
                }
                ((getSaveProfileModel.RemoteActionCompatParcelizer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).onMenuItemSelected();
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // kotlin.getAddress
    public final void AudioAttributesCompatParcelizer() throws Throwable {
        super.AudioAttributesCompatParcelizer();
        try {
            Object[] objArr = {this.IconCompatParcelizer};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1230577907);
            if (objRemoteActionCompatParcelizer == null) {
                char packedPositionChild = (char) (63097 - ExpandableListView.getPackedPositionChild(0L));
                int maxKeyCode = 24580 - (KeyEvent.getMaxKeyCode() >> 16);
                int iAxisFromString = 19 - MotionEvent.axisFromString("");
                byte b = $$a[300];
                int i = $$b;
                Object[] objArr2 = new Object[1];
                a(b, (short) (i | 225), (byte) (i | 53), objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(packedPositionChild, maxKeyCode, iAxisFromString, -923853928, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (ExpandableListView.getPackedPositionType(0L) + 63098), 24581 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 20 - (Process.myTid() >> 22))});
            }
            ((getSaveProfileModel.RemoteActionCompatParcelizer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr)).onUserLeaveHint();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // kotlin.getAddress, com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j, long j2) throws Throwable {
        super.onVideoDecoderInitialized(eventTime, str, j, j2);
        getCurrentEventTimeUs getcurrenteventtimeus = this.IconCompatParcelizer;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(875815479);
        if (objRemoteActionCompatParcelizer == null) {
            objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 63097), 24580 - (Process.myPid() >> 22), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 20, 1249519266, false, "onRemoveQueueItem", null);
        }
        ((maybeExpandData) ((Field) objRemoteActionCompatParcelizer).get(getcurrenteventtimeus)).RemoteActionCompatParcelizer(str);
        RemoteActionCompatParcelizer("vid_decoder_init_name", str);
        RemoteActionCompatParcelizer("vid_decoder_init_ts", String.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // kotlin.getAddress, com.google.android.exoplayer2.util.EventLogger, com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void onVideoDecoderReleased(AnalyticsListener.EventTime eventTime, String str) throws Throwable {
        super.onVideoDecoderReleased(eventTime, str);
        RemoteActionCompatParcelizer("vid_decoder_released_name", str);
        RemoteActionCompatParcelizer("vid_decoder_released_ts", String.valueOf(SystemClock.elapsedRealtime()));
        getCurrentEventTimeUs getcurrenteventtimeus = this.IconCompatParcelizer;
        try {
            Object[] objArr = {getcurrenteventtimeus};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-823689109);
            if (objRemoteActionCompatParcelizer == null) {
                char cRed = (char) (Color.red(0) + 63098);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 24581;
                int i = 20 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                byte b = $$a[4];
                Object[] objArr2 = new Object[1];
                a(b, (short) (b | 715), r2[102], objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(cRed, iLastIndexOf, i, -1330756354, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63097 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 24580 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 20)});
            }
            Object[] objArr3 = {getcurrenteventtimeus, Integer.valueOf(((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr)).intValue() + 1)};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-472386592);
            if (objRemoteActionCompatParcelizer2 == null) {
                char capsMode = (char) (63098 - TextUtils.getCapsMode("", 0, 0));
                int i2 = 24579 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int i3 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 21;
                byte b2 = $$a[479];
                Object[] objArr4 = new Object[1];
                a(b2, (short) (b2 | TarConstants.LF_OLDNORM), (byte) ($$b | 64), objArr4);
                objRemoteActionCompatParcelizer2 = startForeground.read(capsMode, i2, i3, -1650575499, false, (String) objArr4[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63097 - TextUtils.indexOf((CharSequence) "", '0', 0)), 24580 - Color.blue(0), 20 - (ViewConfiguration.getScrollBarSize() >> 8)), Integer.TYPE});
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e8  */
    @Override // kotlin.getAddress
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void RemoteActionCompatParcelizer() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setEductionDegrees$2.RemoteActionCompatParcelizer():void");
    }

    @Override // kotlin.getAddress
    public final void IconCompatParcelizer() throws Throwable {
        super.IconCompatParcelizer();
        getCurrentEventTimeUs getcurrenteventtimeus = this.IconCompatParcelizer;
        try {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-180402220);
            if (objRemoteActionCompatParcelizer == null) {
                char cCombineMeasuredStates = (char) (63098 - View.combineMeasuredStates(0, 0));
                int threadPriority = 24580 - ((Process.getThreadPriority(0) + 20) >> 6);
                int defaultSize = View.getDefaultSize(0, 0) + 20;
                Object[] objArr = new Object[1];
                a($$a[300], (short) 279, (byte) 71, objArr);
                objRemoteActionCompatParcelizer = startForeground.read(cCombineMeasuredStates, threadPriority, defaultSize, -1955167423, false, (String) objArr[0], new Class[0]);
            }
            ((Method) objRemoteActionCompatParcelizer).invoke(getcurrenteventtimeus, null);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object[] objArr2 = {this.IconCompatParcelizer};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-536083881);
            if (objRemoteActionCompatParcelizer2 == null) {
                char c = (char) (63098 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                int packedPositionGroup = 24580 - ExpandableListView.getPackedPositionGroup(0L);
                int iResolveSizeAndState = 20 - View.resolveSizeAndState(0, 0, 0);
                byte b = $$a[65];
                Object[] objArr3 = new Object[1];
                a(b, (short) (b | 272), r9[54], objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(c, packedPositionGroup, iResolveSizeAndState, -1639594302, false, (String) objArr3[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (Color.argb(0, 0, 0, 0) + 63098), 24580 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 20 - KeyEvent.getDeadChar(0, 0))});
            }
            buildResolutionString.IconCompatParcelizer("QALogs", "Total Prepare Time (Till First frame render) %d ms", Long.valueOf(jCurrentTimeMillis - ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr2)).longValue()));
            Object[] objArr4 = {this.IconCompatParcelizer};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1981048014);
            if (objRemoteActionCompatParcelizer3 == null) {
                char fadingEdgeLength = (char) (63098 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                int iMyPid = 24580 - (Process.myPid() >> 22);
                int jumpTapTimeout = 20 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                byte[] bArr = $$a;
                byte b2 = bArr[300];
                short s = bArr[8];
                Object[] objArr5 = new Object[1];
                a(b2, s, (byte) (s & 68), objArr5);
                objRemoteActionCompatParcelizer3 = startForeground.read(fadingEdgeLength, iMyPid, jumpTapTimeout, -140353625, false, (String) objArr5[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63099 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 24580 - Color.green(0), 19 - ImageFormat.getBitsPerPixel(0))});
            }
            Object objInvoke = ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            getCurrentEventTimeUs getcurrenteventtimeus2 = this.IconCompatParcelizer;
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1608602634);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (63098 - Color.alpha(0)), 24581 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 20, 564695199, false, "onSeekTo", null);
            }
            Object obj = ((Field) objRemoteActionCompatParcelizer4).get(getcurrenteventtimeus2);
            getCurrentEventTimeUs getcurrenteventtimeus3 = this.IconCompatParcelizer;
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-79695939);
            if (objRemoteActionCompatParcelizer5 == null) {
                objRemoteActionCompatParcelizer5 = startForeground.read((char) ((Process.myTid() >> 22) + 63098), Color.argb(0, 0, 0, 0) + 24580, 20 - Color.red(0), -2055853272, false, "onPlayFromSearch", null);
            }
            Enum enumAudioAttributesCompatParcelizer$58854885 = FirebaseSyncResponseVersion.AudioAttributesCompatParcelizer$58854885(objInvoke, obj, ((Field) objRemoteActionCompatParcelizer5).get(getcurrenteventtimeus3));
            getCurrentEventTimeUs getcurrenteventtimeus4 = this.IconCompatParcelizer;
            Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(875815479);
            if (objRemoteActionCompatParcelizer6 == null) {
                objRemoteActionCompatParcelizer6 = startForeground.read((char) (Color.green(0) + 63098), 24580 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 21, 1249519266, false, "onRemoveQueueItem", null);
            }
            maybeExpandData maybeexpanddata = (maybeExpandData) ((Field) objRemoteActionCompatParcelizer6).get(getcurrenteventtimeus4);
            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-1617844022);
            if (objRemoteActionCompatParcelizer7 == null) {
                objRemoteActionCompatParcelizer7 = startForeground.read((char) ((Process.getThreadPriority(0) + 20) >> 6), 13515 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 25, -505910177, false, "RemoteActionCompatParcelizer", new Class[0]);
            }
            maybeexpanddata.read(((Integer) ((Method) objRemoteActionCompatParcelizer7).invoke(enumAudioAttributesCompatParcelizer$58854885, null)).intValue());
            Object[] objArr6 = {this.IconCompatParcelizer, parseCea708AccessibilityChannel.write(new parseCea708AccessibilityChannel.RemoteActionCompatParcelizer() { // from class: o.getPrevLoadMore
                @Override // o.parseCea708AccessibilityChannel.RemoteActionCompatParcelizer
                public final Object write() {
                    return this.read.MediaBrowserCompatCustomActionResultReceiver();
                }
            }), new getCurrentEventTimeUs.IconCompatParcelizer() { // from class: o.getResultCount
                @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
                public final void write(Object obj2) {
                }
            }, new getCurrentEventTimeUs.IconCompatParcelizer() { // from class: o.ReferalCouponDetailResponse
                @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
                public final void write(Object obj2) throws Throwable {
                    this.write.AudioAttributesCompatParcelizer((Throwable) obj2);
                }
            }};
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(1237614423);
            if (objRemoteActionCompatParcelizer8 == null) {
                char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 63098);
                int iAlpha = 24580 - Color.alpha(0);
                int iMyTid = (Process.myTid() >> 22) + 20;
                byte b3 = $$a[4];
                Object[] objArr7 = new Object[1];
                a(b3, (short) (b3 | 203), r15[300], objArr7);
                objRemoteActionCompatParcelizer8 = startForeground.read(trimmedLength, iAlpha, iMyTid, 932035522, false, (String) objArr7[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63097 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 24579, (ViewConfiguration.getTapTimeout() >> 16) + 20), LessonDynamicResponseBody.class, getCurrentEventTimeUs.IconCompatParcelizer.class, getCurrentEventTimeUs.IconCompatParcelizer.class});
            }
            ((Method) objRemoteActionCompatParcelizer8).invoke(null, objArr6);
            getCurrentEventTimeUs getcurrenteventtimeus5 = this.IconCompatParcelizer;
            Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(17391646);
            if (objRemoteActionCompatParcelizer9 == null) {
                objRemoteActionCompatParcelizer9 = startForeground.read((char) (63098 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), View.MeasureSpec.getMode(0) + 24580, 20 - View.MeasureSpec.makeMeasureSpec(0, 0), 2134942859, false, "onPrepare", null);
            }
            Object[] objArr8 = {getcurrenteventtimeus5, Integer.valueOf(((getStreamPositionUsForContent) ((Field) objRemoteActionCompatParcelizer9).get(getcurrenteventtimeus5)).onSeekTo()), true};
            Object objRemoteActionCompatParcelizer10 = startForeground.RemoteActionCompatParcelizer(1917126795);
            if (objRemoteActionCompatParcelizer10 == null) {
                char c2 = (char) ((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 63098);
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 24580;
                int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 20;
                byte b4 = $$a[4];
                Object[] objArr9 = new Object[1];
                a(b4, (short) (b4 | 203), r8[300], objArr9);
                objRemoteActionCompatParcelizer10 = startForeground.read(c2, offsetAfter, iResolveSizeAndState2, 202165278, false, (String) objArr9[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63097 - ExpandableListView.getPackedPositionChild(0L)), 24579 - ExpandableListView.getPackedPositionChild(0L), 21 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), Integer.TYPE, Boolean.TYPE});
            }
            ((Method) objRemoteActionCompatParcelizer10).invoke(null, objArr8);
            Object[] objArr10 = {this.IconCompatParcelizer, 0};
            Object objRemoteActionCompatParcelizer11 = startForeground.RemoteActionCompatParcelizer(-472386592);
            if (objRemoteActionCompatParcelizer11 == null) {
                char maximumFlingVelocity = (char) (63098 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                int trimmedLength2 = 24580 - TextUtils.getTrimmedLength("");
                int defaultSize2 = 20 - View.getDefaultSize(0, 0);
                byte b5 = $$a[479];
                Object[] objArr11 = new Object[1];
                a(b5, (short) (b5 | TarConstants.LF_OLDNORM), (byte) ($$b | 64), objArr11);
                objRemoteActionCompatParcelizer11 = startForeground.read(maximumFlingVelocity, trimmedLength2, defaultSize2, -1650575499, false, (String) objArr11[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (ExpandableListView.getPackedPositionGroup(0L) + 63098), Drawable.resolveOpacity(0, 0) + 24580, 19 - ImageFormat.getBitsPerPixel(0)), Integer.TYPE});
            }
            ((Method) objRemoteActionCompatParcelizer11).invoke(null, objArr10);
            Object[] objArr12 = {this.IconCompatParcelizer, 0};
            Object objRemoteActionCompatParcelizer12 = startForeground.RemoteActionCompatParcelizer(278921819);
            if (objRemoteActionCompatParcelizer12 == null) {
                char cResolveOpacity = (char) (63098 - Drawable.resolveOpacity(0, 0));
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 24581;
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 21;
                byte b6 = (byte) $$b;
                short s2 = $$a[247];
                Object[] objArr13 = new Object[1];
                a(b6, s2, (byte) (s2 | 32), objArr13);
                objRemoteActionCompatParcelizer12 = startForeground.read(cResolveOpacity, iIndexOf, iIndexOf2, 1860814542, false, (String) objArr13[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (Drawable.resolveOpacity(0, 0) + 63098), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24580, 20 - (ViewConfiguration.getLongPressTimeout() >> 16)), Integer.TYPE});
            }
            ((Method) objRemoteActionCompatParcelizer12).invoke(null, objArr12);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer MediaBrowserCompatCustomActionResultReceiver() throws Throwable {
        getCurrentEventTimeUs getcurrenteventtimeus = this.IconCompatParcelizer;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(988782874);
        if (objRemoteActionCompatParcelizer == null) {
            objRemoteActionCompatParcelizer = startForeground.read((char) (63098 - (ViewConfiguration.getPressedStateDuration() >> 16)), 24579 - MotionEvent.axisFromString(""), 20 - ExpandableListView.getPackedPositionType(0L), 1151755663, false, "onAddQueueItem", null);
        }
        onAdPlaybackState onadplaybackstate = (onAdPlaybackState) ((Field) objRemoteActionCompatParcelizer).get(getcurrenteventtimeus);
        try {
            Object[] objArr = {this.IconCompatParcelizer};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1981048014);
            if (objRemoteActionCompatParcelizer2 == null) {
                char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 63098);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 24581;
                int iAlpha = 20 - Color.alpha(0);
                byte[] bArr = $$a;
                byte b = bArr[300];
                short s = bArr[8];
                Object[] objArr2 = new Object[1];
                a(b, s, (byte) (s & 68), objArr2);
                objRemoteActionCompatParcelizer2 = startForeground.read(scrollDefaultDelay, iLastIndexOf, iAlpha, -140353625, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (ExpandableListView.getPackedPositionChild(0L) + 63099), 24580 - ((Process.getThreadPriority(0) + 20) >> 6), View.MeasureSpec.getMode(0) + 20)});
            }
            Object objInvoke = ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr);
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-120727975);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.indexOf("", "", 0, 0) + 10850), TextUtils.indexOf((CharSequence) "", '0') + 12542, KeyEvent.keyCodeFromString("") + 41, -2038164788, false, "write", new Class[0]);
            }
            LessonIndex lessonIndexRemoteActionCompatParcelizer = onadplaybackstate.RemoteActionCompatParcelizer((String) ((Method) objRemoteActionCompatParcelizer3).invoke(objInvoke, null));
            if (lessonIndexRemoteActionCompatParcelizer != null) {
                getCurrentEventTimeUs getcurrenteventtimeus2 = this.IconCompatParcelizer;
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-79695939);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (Color.alpha(0) + 63098), Color.blue(0) + 24580, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 19, -2055853272, false, "onPlayFromSearch", null);
                }
                Object obj = ((Field) objRemoteActionCompatParcelizer4).get(getcurrenteventtimeus2);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1347096838);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 12462 - KeyEvent.getDeadChar(0, 0), TextUtils.getOffsetAfter("", 0) + 35, 771937683, false, "AudioAttributesImplApi26Parcelizer", new Class[0]);
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(obj, null);
                String rootSubjectId = lessonIndexRemoteActionCompatParcelizer.getRootSubjectId();
                Object[] objArr3 = {this.IconCompatParcelizer};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1981048014);
                if (objRemoteActionCompatParcelizer6 == null) {
                    char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 63098);
                    int threadPriority = 24580 - ((Process.getThreadPriority(0) + 20) >> 6);
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 20;
                    byte[] bArr2 = $$a;
                    byte b2 = bArr2[300];
                    short s2 = bArr2[8];
                    Object[] objArr4 = new Object[1];
                    a(b2, s2, (byte) (s2 & 68), objArr4);
                    objRemoteActionCompatParcelizer6 = startForeground.read(cMakeMeasureSpec, threadPriority, absoluteGravity, -140353625, false, (String) objArr4[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (TextUtils.indexOf("", "", 0) + 63098), 24581 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 20 - (ViewConfiguration.getTouchSlop() >> 8))});
                }
                Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr3);
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-120727975);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10849), 12541 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 42, -2038164788, false, "write", new Class[0]);
                }
                String str = (String) ((Method) objRemoteActionCompatParcelizer7).invoke(objInvoke2, null);
                String title = lessonIndexRemoteActionCompatParcelizer.getTitle();
                Object[] objArr5 = {this.IconCompatParcelizer};
                Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-750030469);
                if (objRemoteActionCompatParcelizer8 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 63099);
                    int i = 24581 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    int iIndexOf = 19 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    byte[] bArr3 = $$a;
                    Object[] objArr6 = new Object[1];
                    a(bArr3[65], bArr3[15], (byte) ($$b | 50), objArr6);
                    objRemoteActionCompatParcelizer8 = startForeground.read(cIndexOf, i, iIndexOf, -1392331282, false, (String) objArr6[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 63097), Gravity.getAbsoluteGravity(0, 0) + 24580, 20 - (ViewConfiguration.getScrollDefaultDelay() >> 16))});
                }
                String strRemoteActionCompatParcelizer = ((BundledChunkExtractorExternalSyntheticLambda0) ((Method) objRemoteActionCompatParcelizer8).invoke(null, objArr5)).RemoteActionCompatParcelizer(lessonIndexRemoteActionCompatParcelizer.getRootSubjectId());
                getCurrentEventTimeUs getcurrenteventtimeus3 = this.IconCompatParcelizer;
                Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(17391646);
                if (objRemoteActionCompatParcelizer9 == null) {
                    objRemoteActionCompatParcelizer9 = startForeground.read((char) (63098 - TextUtils.indexOf("", "")), 24580 - KeyEvent.getDeadChar(0, 0), 20 - View.resolveSize(0, 0), 2134942859, false, "onPrepare", null);
                }
                boolean zRemoteActionCompatParcelizer = ((getStreamPositionUsForContent) ((Field) objRemoteActionCompatParcelizer9).get(getcurrenteventtimeus3)).RemoteActionCompatParcelizer();
                String subjectId = lessonIndexRemoteActionCompatParcelizer.getSubjectId();
                Object[] objArr7 = {this.IconCompatParcelizer};
                Object objRemoteActionCompatParcelizer10 = startForeground.RemoteActionCompatParcelizer(-750030469);
                if (objRemoteActionCompatParcelizer10 == null) {
                    char cBlue = (char) (63098 - Color.blue(0));
                    int gidForName = 24579 - Process.getGidForName("");
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 20;
                    byte[] bArr4 = $$a;
                    Object[] objArr8 = new Object[1];
                    a(bArr4[65], bArr4[15], (byte) ($$b | 50), objArr8);
                    objRemoteActionCompatParcelizer10 = startForeground.read(cBlue, gidForName, offsetBefore, -1392331282, false, (String) objArr8[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63098 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 24580 - TextUtils.indexOf("", "", 0, 0), 19 - TextUtils.lastIndexOf("", '0', 0, 0))});
                }
                String strRemoteActionCompatParcelizer2 = ((BundledChunkExtractorExternalSyntheticLambda0) ((Method) objRemoteActionCompatParcelizer10).invoke(null, objArr7)).RemoteActionCompatParcelizer(lessonIndexRemoteActionCompatParcelizer.getSubjectId());
                getCurrentEventTimeUs getcurrenteventtimeus4 = this.IconCompatParcelizer;
                Object objRemoteActionCompatParcelizer11 = startForeground.RemoteActionCompatParcelizer(-79695939);
                if (objRemoteActionCompatParcelizer11 == null) {
                    objRemoteActionCompatParcelizer11 = startForeground.read((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 63098), TextUtils.getOffsetBefore("", 0) + 24580, 20 - (Process.myPid() >> 22), -2055853272, false, "onPlayFromSearch", null);
                }
                Object obj2 = ((Field) objRemoteActionCompatParcelizer11).get(getcurrenteventtimeus4);
                Object objRemoteActionCompatParcelizer12 = startForeground.RemoteActionCompatParcelizer(1347096838);
                if (objRemoteActionCompatParcelizer12 == null) {
                    objRemoteActionCompatParcelizer12 = startForeground.read((char) (Color.rgb(0, 0, 0) + BlockingViewModel_HiltModulesKeyModule.OKHTTP_CLIENT_WINDOW_SIZE), Gravity.getAbsoluteGravity(0, 0) + 12462, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 35, 771937683, false, "AudioAttributesImplApi26Parcelizer", new Class[0]);
                }
                getLatestBitrateEstimate.MediaDescriptionCompat.AudioAttributesCompatParcelizer(rootSubjectId, str, title, strRemoteActionCompatParcelizer, zRemoteActionCompatParcelizer, subjectId, strRemoteActionCompatParcelizer2, ((ThemeState) ((Method) objRemoteActionCompatParcelizer12).invoke(obj2, null)).getTheme());
            }
            return 1;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AudioAttributesCompatParcelizer(Throwable th) throws Throwable {
        try {
            Object[] objArr = {this.IconCompatParcelizer, th, "video_event_started"};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(105770859);
            if (objRemoteActionCompatParcelizer == null) {
                char c = (char) (63099 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 24580;
                int i = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 19;
                byte b = (byte) $$b;
                short s = $$a[247];
                Object[] objArr2 = new Object[1];
                a(b, s, (byte) (s | 32), objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(c, iIndexOf, i, 2013539326, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 63097), 24580 - (ViewConfiguration.getEdgeSlop() >> 16), Color.rgb(0, 0, 0) + 16777236), Throwable.class, String.class});
            }
            ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    @Override // kotlin.getAddress
    public final void AudioAttributesImplBaseParcelizer() throws Throwable {
        getCurrentEventTimeUs getcurrenteventtimeus = this.IconCompatParcelizer;
        try {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-187962699);
            if (objRemoteActionCompatParcelizer == null) {
                char maxKeyCode = (char) (63098 - (KeyEvent.getMaxKeyCode() >> 16));
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 24580;
                int mode = View.MeasureSpec.getMode(0) + 20;
                Object[] objArr = new Object[1];
                a(r1[300], (short) ($$b | 754), (byte) ($$a[479] + 1), objArr);
                objRemoteActionCompatParcelizer = startForeground.read(maxKeyCode, keyRepeatDelay, mode, -1971180000, false, (String) objArr[0], new Class[0]);
            }
            ((Method) objRemoteActionCompatParcelizer).invoke(getcurrenteventtimeus, null);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // kotlin.getAddress
    public final void AudioAttributesImplApi21Parcelizer() throws Throwable {
        getCurrentEventTimeUs getcurrenteventtimeus = this.IconCompatParcelizer;
        try {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1952800692);
            if (objRemoteActionCompatParcelizer == null) {
                char cMyTid = (char) ((Process.myTid() >> 22) + 63098);
                int jumpTapTimeout = 24580 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                int keyRepeatDelay = 20 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                byte b = $$a[300];
                int i = $$b;
                Object[] objArr = new Object[1];
                a(b, (short) (i | 739), (byte) (i | 53), objArr);
                objRemoteActionCompatParcelizer = startForeground.read(cMyTid, jumpTapTimeout, keyRepeatDelay, -170695463, false, (String) objArr[0], new Class[0]);
            }
            ((Method) objRemoteActionCompatParcelizer).invoke(getcurrenteventtimeus, null);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // kotlin.getAddress
    public final void AudioAttributesImplApi26Parcelizer() throws Throwable {
        super.AudioAttributesImplApi26Parcelizer();
        getCurrentEventTimeUs getcurrenteventtimeus = this.IconCompatParcelizer;
        try {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-381834369);
            if (objRemoteActionCompatParcelizer == null) {
                char keyRepeatDelay = (char) (63098 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                int size = 24580 - View.MeasureSpec.getSize(0);
                int i = (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 20;
                Object[] objArr = new Object[1];
                a($$a[300], (short) WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR, (byte) 65, objArr);
                objRemoteActionCompatParcelizer = startForeground.read(keyRepeatDelay, size, i, -1753976854, false, (String) objArr[0], new Class[0]);
            }
            ((Method) objRemoteActionCompatParcelizer).invoke(getcurrenteventtimeus, null);
            Object[] objArr2 = {this.IconCompatParcelizer};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-533955425);
            if (objRemoteActionCompatParcelizer2 == null) {
                char jumpTapTimeout = (char) (63098 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                int iResolveSize = View.resolveSize(0, 0) + 24580;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 20;
                byte b = $$a[492];
                Object[] objArr3 = new Object[1];
                a(b, (short) 416, b, objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(jumpTapTimeout, iResolveSize, iMakeMeasureSpec, -1637500918, false, (String) objArr3[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63097 - TextUtils.indexOf((CharSequence) "", '0', 0)), Color.red(0) + 24580, 19 - TextUtils.lastIndexOf("", '0', 0, 0))});
            }
            ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr2);
            Object[] objArr4 = {this.IconCompatParcelizer};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1025588160);
            if (objRemoteActionCompatParcelizer3 == null) {
                char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 63098);
                int keyRepeatTimeout = 24580 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int packedPositionGroup = 20 - ExpandableListView.getPackedPositionGroup(0L);
                byte b2 = $$a[4];
                Object[] objArr5 = new Object[1];
                a(b2, (short) (b2 | 453), r15[548], objArr5);
                objRemoteActionCompatParcelizer3 = startForeground.read(longPressTimeout, keyRepeatTimeout, packedPositionGroup, -1130954539, false, (String) objArr5[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 63098), 24581 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), TextUtils.indexOf("", "") + 20)});
            }
            if (((Boolean) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).booleanValue()) {
                Object[] objArr6 = {this.IconCompatParcelizer, false};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1212534296);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 63097);
                    int i2 = (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24579;
                    int iGreen = Color.green(0) + 20;
                    byte b3 = $$a[4];
                    Object[] objArr7 = new Object[1];
                    a(b3, (short) (b3 | 203), r10[300], objArr7);
                    objRemoteActionCompatParcelizer4 = startForeground.read(c, i2, iGreen, 906758797, false, (String) objArr7[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (TextUtils.getCapsMode("", 0, 0) + 63098), 24580 - Color.green(0), 20 - Gravity.getAbsoluteGravity(0, 0)), Boolean.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr6);
            }
            getCurrentEventTimeUs getcurrenteventtimeus2 = this.IconCompatParcelizer;
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(350361861);
            if (objRemoteActionCompatParcelizer5 == null) {
                objRemoteActionCompatParcelizer5 = startForeground.read((char) (View.resolveSize(0, 0) + 63098), 24579 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), KeyEvent.keyCodeFromString("") + 20, 1789648272, false, "onPrepareFromMediaId", null);
            }
            if (((getSampleFormats) ((Field) objRemoteActionCompatParcelizer5).get(getcurrenteventtimeus2)).MediaMetadataCompat()) {
                Object[] objArr8 = {this.IconCompatParcelizer};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(28380336);
                if (objRemoteActionCompatParcelizer6 == null) {
                    char c2 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 63098);
                    int i3 = 24580 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    int windowTouchSlop = 20 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    short s = (short) 486;
                    Object[] objArr9 = new Object[1];
                    a($$a[300], s, (byte) (s & 80), objArr9);
                    objRemoteActionCompatParcelizer6 = startForeground.read(c2, i3, windowTouchSlop, 2147010597, false, (String) objArr9[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (Gravity.getAbsoluteGravity(0, 0) + 63098), KeyEvent.keyCodeFromString("") + 24580, (ViewConfiguration.getTapTimeout() >> 16) + 20)});
                }
                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr8);
            }
            Object[] objArr10 = {this.IconCompatParcelizer};
            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(2112156667);
            if (objRemoteActionCompatParcelizer7 == null) {
                char packedPositionType = (char) (63098 - ExpandableListView.getPackedPositionType(0L));
                int iResolveSizeAndState = 24580 - View.resolveSizeAndState(0, 0, 0);
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 20;
                Object[] objArr11 = new Object[1];
                a($$a[300], (short) 498, (byte) 71, objArr11);
                objRemoteActionCompatParcelizer7 = startForeground.read(packedPositionType, iResolveSizeAndState, offsetAfter, 61683566, false, (String) objArr11[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63097 - ExpandableListView.getPackedPositionChild(0L)), MotionEvent.axisFromString("") + 24581, 20 - View.MeasureSpec.getSize(0))});
            }
            ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr10);
            Object[] objArr12 = {this.IconCompatParcelizer};
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-178570037);
            if (objRemoteActionCompatParcelizer8 == null) {
                char cMyTid = (char) (63098 - (Process.myTid() >> 22));
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24580;
                int i4 = 21 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                Object[] objArr13 = new Object[1];
                a($$a[300], (short) 503, (byte) ($$b | 51), objArr13);
                objRemoteActionCompatParcelizer8 = startForeground.read(cMyTid, maximumDrawingCacheSize, i4, -1961691042, false, (String) objArr13[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63098 - Drawable.resolveOpacity(0, 0)), 24580 - TextUtils.getOffsetBefore("", 0), 20 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))});
            }
            ((Method) objRemoteActionCompatParcelizer8).invoke(null, objArr12);
            Object[] objArr14 = {this.IconCompatParcelizer};
            Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(-1431552607);
            if (objRemoteActionCompatParcelizer9 == null) {
                char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 63098);
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 24580;
                int scrollDefaultDelay = 20 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                byte[] bArr = $$a;
                Object[] objArr15 = new Object[1];
                a(bArr[65], (short) ($$b | 512), bArr[160], objArr15);
                objRemoteActionCompatParcelizer9 = startForeground.read(cNormalizeMetaState, absoluteGravity, scrollDefaultDelay, -723125964, false, (String) objArr15[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 63097), TextUtils.indexOf((CharSequence) "", '0', 0) + 24581, KeyEvent.keyCodeFromString("") + 20)});
            }
            if (!((getChannel) ((Method) objRemoteActionCompatParcelizer9).invoke(null, objArr14)).aC_()) {
                Object[] objArr16 = {this.IconCompatParcelizer};
                Object objRemoteActionCompatParcelizer10 = startForeground.RemoteActionCompatParcelizer(536157282);
                if (objRemoteActionCompatParcelizer10 == null) {
                    char c3 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 63097);
                    int iRed = 24580 - Color.red(0);
                    int i5 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 20;
                    byte[] bArr2 = $$a;
                    Object[] objArr17 = new Object[1];
                    a(bArr2[65], (short) 563, bArr2[4], objArr17);
                    objRemoteActionCompatParcelizer10 = startForeground.read(c3, iRed, i5, 1639766263, false, (String) objArr17[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) ((Process.myPid() >> 22) + 63098), Color.green(0) + 24580, 20 - ExpandableListView.getPackedPositionGroup(0L))});
                }
                ((Method) objRemoteActionCompatParcelizer10).invoke(null, objArr16);
            }
            getCurrentEventTimeUs getcurrenteventtimeus3 = this.IconCompatParcelizer;
            Object[] objArr18 = {true};
            Object objRemoteActionCompatParcelizer11 = startForeground.RemoteActionCompatParcelizer(-1362794971);
            if (objRemoteActionCompatParcelizer11 == null) {
                char cKeyCodeFromString = (char) (63098 - KeyEvent.keyCodeFromString(""));
                int i6 = 24581 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                int iArgb = Color.argb(0, 0, 0, 0) + 20;
                byte b4 = $$a[65];
                Object[] objArr19 = new Object[1];
                a(b4, (short) (b4 | 627), r9[222], objArr19);
                objRemoteActionCompatParcelizer11 = startForeground.read(cKeyCodeFromString, i6, iArgb, -796089680, false, (String) objArr19[0], new Class[]{Boolean.TYPE});
            }
            ((Method) objRemoteActionCompatParcelizer11).invoke(getcurrenteventtimeus3, objArr18);
            Object[] objArr20 = {this.IconCompatParcelizer};
            Object objRemoteActionCompatParcelizer12 = startForeground.RemoteActionCompatParcelizer(-1205613362);
            if (objRemoteActionCompatParcelizer12 == null) {
                char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 63098);
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 24580;
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 21;
                byte b5 = $$a[300];
                int i7 = $$b;
                Object[] objArr21 = new Object[1];
                a(b5, (short) (i7 | 660), (byte) (i7 | 55), objArr21);
                objRemoteActionCompatParcelizer12 = startForeground.read(threadPriority, iResolveOpacity, iIndexOf, -966129573, false, (String) objArr21[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63097 - TextUtils.lastIndexOf("", '0')), 24580 - Color.alpha(0), 20 - (ViewConfiguration.getScrollDefaultDelay() >> 16))});
            }
            ((Method) objRemoteActionCompatParcelizer12).invoke(null, objArr20);
            MediaDescriptionCompat();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private void MediaDescriptionCompat() throws Throwable {
        try {
            Object[] objArr = {this.IconCompatParcelizer};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-440300249);
            if (objRemoteActionCompatParcelizer == null) {
                char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 63098);
                int iLastIndexOf = 24579 - TextUtils.lastIndexOf("", '0', 0);
                int iCombineMeasuredStates = 20 - View.combineMeasuredStates(0, 0);
                Object[] objArr2 = new Object[1];
                a((byte) (-$$a[108]), (short) ($$b | 128), (byte) 65, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(threadPriority, iLastIndexOf, iCombineMeasuredStates, -1685567054, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63098 - View.resolveSizeAndState(0, 0, 0)), 24580 - (KeyEvent.getMaxKeyCode() >> 16), 21 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)))});
            }
            if (((Boolean) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr)).booleanValue()) {
                getCurrentEventTimeUs getcurrenteventtimeus = this.IconCompatParcelizer;
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(350361861);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (63098 - KeyEvent.normalizeMetaState(0)), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24579, TextUtils.getTrimmedLength("") + 20, 1789648272, false, "onPrepareFromMediaId", null);
                }
                if (((getSampleFormats) ((Field) objRemoteActionCompatParcelizer2).get(getcurrenteventtimeus)).RatingCompat()) {
                    return;
                }
            }
            Object[] objArr3 = {this.IconCompatParcelizer, parseCea708AccessibilityChannel.write(new parseCea708AccessibilityChannel.RemoteActionCompatParcelizer() { // from class: o.fromJSON
                @Override // o.parseCea708AccessibilityChannel.RemoteActionCompatParcelizer
                public final Object write() {
                    return this.AudioAttributesCompatParcelizer.RatingCompat();
                }
            }), new getCurrentEventTimeUs.IconCompatParcelizer() { // from class: o.ReferalCouponDetailResponseBenefitDetails
                @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
                public final void write(Object obj) throws Throwable {
                    this.read.MediaBrowserCompatMediaItem();
                }
            }, new getCurrentEventTimeUs.IconCompatParcelizer() { // from class: o.VersionUpdateData
                @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
                public final void write(Object obj) {
                }
            }};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-661445466);
            if (objRemoteActionCompatParcelizer3 == null) {
                char scrollDefaultDelay = (char) (63098 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                int iBlue = 24580 - Color.blue(0);
                int i = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 19;
                byte[] bArr = $$a;
                Object[] objArr4 = new Object[1];
                a((byte) (-bArr[108]), (short) ($$b | 101), (byte) (-bArr[294]), objArr4);
                objRemoteActionCompatParcelizer3 = startForeground.read(scrollDefaultDelay, iBlue, i, -1495605197, false, (String) objArr4[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63098 - Color.green(0)), 24580 - Color.green(0), 20 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), LessonDynamicResponseBody.class, getCurrentEventTimeUs.IconCompatParcelizer.class, getCurrentEventTimeUs.IconCompatParcelizer.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr3);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer RatingCompat() {
        getCurrentEventTimeUs getcurrenteventtimeus = this.IconCompatParcelizer;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(17391646);
        if (objRemoteActionCompatParcelizer == null) {
            objRemoteActionCompatParcelizer = startForeground.read((char) (63097 - MotionEvent.axisFromString("")), 24580 - (ViewConfiguration.getScrollDefaultDelay() >> 16), KeyEvent.getDeadChar(0, 0) + 20, 2134942859, false, "onPrepare", null);
        }
        ((getStreamPositionUsForContent) ((Field) objRemoteActionCompatParcelizer).get(getcurrenteventtimeus)).MediaBrowserCompatCustomActionResultReceiver(0L);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void MediaBrowserCompatMediaItem() throws Throwable {
        try {
            Object[] objArr = {this.IconCompatParcelizer, true};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(278922346);
            if (objRemoteActionCompatParcelizer == null) {
                char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 63098);
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 24580;
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 20;
                byte b = (byte) $$b;
                short s = $$a[247];
                Object[] objArr2 = new Object[1];
                a(b, s, (byte) (s | 32), objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(keyRepeatDelay, iCombineMeasuredStates, scrollBarFadeDuration, 1860813055, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (TextUtils.indexOf("", "", 0, 0) + 63098), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24580, 19 - TextUtils.indexOf((CharSequence) "", '0')), Boolean.TYPE});
            }
            ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // kotlin.getAddress
    public final void write(long j) throws Throwable {
        super.write(j);
        getCurrentEventTimeUs getcurrenteventtimeus = this.IconCompatParcelizer;
        try {
            Object[] objArr = {Long.valueOf(j)};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(846687323);
            if (objRemoteActionCompatParcelizer == null) {
                char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 63098);
                int scrollBarFadeDuration2 = 24580 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int tapTimeout = 20 - (ViewConfiguration.getTapTimeout() >> 16);
                byte b = (byte) $$b;
                short s = $$a[247];
                Object[] objArr2 = new Object[1];
                a(b, s, (byte) (s | 32), objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(scrollBarFadeDuration, scrollBarFadeDuration2, tapTimeout, 1279174862, false, (String) objArr2[0], new Class[]{Long.TYPE});
            }
            ((Method) objRemoteActionCompatParcelizer).invoke(getcurrenteventtimeus, objArr);
            getCurrentEventTimeUs getcurrenteventtimeus2 = this.IconCompatParcelizer;
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(875815479);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.getCapsMode("", 0, 0) + 63098), 24580 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 20, 1249519266, false, "onRemoveQueueItem", null);
            }
            maybeExpandData maybeexpanddata = (maybeExpandData) ((Field) objRemoteActionCompatParcelizer2).get(getcurrenteventtimeus2);
            Object[] objArr3 = {this.IconCompatParcelizer};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1854274082);
            if (objRemoteActionCompatParcelizer3 == null) {
                char pressedStateDuration = (char) (63098 - (ViewConfiguration.getPressedStateDuration() >> 16));
                int i = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 24579;
                int iIndexOf = TextUtils.indexOf("", "") + 20;
                Object[] objArr4 = new Object[1];
                a($$a[300], (short) RendererCapabilities.MODE_SUPPORT_MASK, (byte) ($$b | 53), objArr4);
                objRemoteActionCompatParcelizer3 = startForeground.read(pressedStateDuration, i, iIndexOf, 281820855, false, (String) objArr4[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63098 - (ViewConfiguration.getTapTimeout() >> 16)), ImageFormat.getBitsPerPixel(0) + 24581, TextUtils.lastIndexOf("", '0', 0) + 21)});
            }
            maybeexpanddata.RemoteActionCompatParcelizer(j, ((getSaveProfileModel.RemoteActionCompatParcelizer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr3)).onPanelClosed());
            getCurrentEventTimeUs getcurrenteventtimeus3 = this.IconCompatParcelizer;
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1711400792);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 63097), 24580 - (ViewConfiguration.getEdgeSlop() >> 16), Gravity.getAbsoluteGravity(0, 0) + 20, 407380941, false, "onPlayFromMediaId", null);
            }
            if (((Field) objRemoteActionCompatParcelizer4).get(getcurrenteventtimeus3) != null) {
                getCurrentEventTimeUs getcurrenteventtimeus4 = this.IconCompatParcelizer;
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1711400792);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 63097), 24580 - Gravity.getAbsoluteGravity(0, 0), 20 - Color.green(0), 407380941, false, "onPlayFromMediaId", null);
                }
                getSaveProfileModel.write writeVar = (getSaveProfileModel.write) ((Field) objRemoteActionCompatParcelizer5).get(getcurrenteventtimeus4);
                getCurrentEventTimeUs getcurrenteventtimeus5 = this.IconCompatParcelizer;
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-193378734);
                if (objRemoteActionCompatParcelizer6 == null) {
                    char edgeSlop = (char) (63098 - (ViewConfiguration.getEdgeSlop() >> 16));
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 24580;
                    int i2 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 19;
                    Object[] objArr5 = new Object[1];
                    a(r7[336], (short) ($$b | 343), (byte) (-$$a[543]), objArr5);
                    objRemoteActionCompatParcelizer6 = startForeground.read(edgeSlop, iResolveSizeAndState, i2, -1976532281, false, (String) objArr5[0], new Class[0]);
                }
                writeVar.MediaBrowserCompatMediaItem((String) ((Method) objRemoteActionCompatParcelizer6).invoke(getcurrenteventtimeus5, null));
            }
            Object[] objArr6 = {this.IconCompatParcelizer};
            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(1277973725);
            if (objRemoteActionCompatParcelizer7 == null) {
                char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 63098);
                int offsetBefore = 24580 - TextUtils.getOffsetBefore("", 0);
                int minimumFlingVelocity = 20 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                Object[] objArr7 = new Object[1];
                a($$a[300], (short) ($$b | 391), (byte) 70, objArr7);
                objRemoteActionCompatParcelizer7 = startForeground.read(windowTouchSlop, offsetBefore, minimumFlingVelocity, 845516872, false, (String) objArr7[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63098 - Color.green(0)), 24580 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 20)});
            }
            ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr6);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // kotlin.getAddress
    public final void MediaBrowserCompatItemReceiver() throws Throwable {
        super.MediaBrowserCompatItemReceiver();
        try {
            Object[] objArr = {this.IconCompatParcelizer};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1277973725);
            if (objRemoteActionCompatParcelizer == null) {
                char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 63098);
                int i = 24580 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                int i2 = 21 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                Object[] objArr2 = new Object[1];
                a($$a[300], (short) ($$b | 391), (byte) 70, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(maximumDrawingCacheSize, i, i2, 845516872, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63098 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 24579, 20 - TextUtils.indexOf("", "", 0, 0))});
            }
            ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // kotlin.getAddress
    public final void write() throws Throwable {
        super.write();
        getCurrentEventTimeUs getcurrenteventtimeus = this.IconCompatParcelizer;
        try {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1331108477);
            if (objRemoteActionCompatParcelizer == null) {
                char cLastIndexOf = (char) (63097 - TextUtils.lastIndexOf("", '0', 0, 0));
                int touchSlop = 24580 - (ViewConfiguration.getTouchSlop() >> 8);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 21;
                byte b = $$a[300];
                int i = $$b;
                Object[] objArr = new Object[1];
                a(b, (short) (i | PsExtractor.VIDEO_STREAM_MASK), (byte) (i | 53), objArr);
                objRemoteActionCompatParcelizer = startForeground.read(cLastIndexOf, touchSlop, packedPositionChild, -824106730, false, (String) objArr[0], new Class[0]);
            }
            ((Method) objRemoteActionCompatParcelizer).invoke(getcurrenteventtimeus, null);
            getCurrentEventTimeUs getcurrenteventtimeus2 = this.IconCompatParcelizer;
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1506696828);
            if (objRemoteActionCompatParcelizer2 == null) {
                char cAlpha = (char) (Color.alpha(0) + 63098);
                int windowTouchSlop = 24580 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                int i2 = 20 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                Object[] objArr2 = new Object[1];
                a($$a[300], (short) TarConstants.VERSION_OFFSET, (byte) ($$b | 52), objArr2);
                objRemoteActionCompatParcelizer2 = startForeground.read(cAlpha, windowTouchSlop, i2, 663198441, false, (String) objArr2[0], new Class[0]);
            }
            ((Method) objRemoteActionCompatParcelizer2).invoke(getcurrenteventtimeus2, null);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // kotlin.getAddress
    public final void IconCompatParcelizer(int i) throws Throwable {
        super.IconCompatParcelizer(i);
        getCurrentEventTimeUs getcurrenteventtimeus = this.IconCompatParcelizer;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1608602634);
        if (objRemoteActionCompatParcelizer == null) {
            objRemoteActionCompatParcelizer = startForeground.read((char) (63099 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24579, 20 - (KeyEvent.getMaxKeyCode() >> 16), 564695199, false, "onSeekTo", null);
        }
        try {
            if (((Field) objRemoteActionCompatParcelizer).get(getcurrenteventtimeus) == null) {
                getCurrentEventTimeUs getcurrenteventtimeus2 = this.IconCompatParcelizer;
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1042944706);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 63098);
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 24580;
                    int maximumFlingVelocity = 20 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    byte b = $$a[336];
                    Object[] objArr = new Object[1];
                    a(b, (short) (b | 652), r1[166], objArr);
                    objRemoteActionCompatParcelizer2 = startForeground.read(keyRepeatDelay, threadPriority, maximumFlingVelocity, 1080284759, false, (String) objArr[0], new Class[0]);
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(getcurrenteventtimeus2, null);
                return;
            }
            getCurrentEventTimeUs getcurrenteventtimeus3 = this.IconCompatParcelizer;
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1691346958);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (63097 - Process.getGidForName("")), 24579 - TextUtils.lastIndexOf("", '0', 0, 0), 20 - TextUtils.indexOf("", ""), -445000857, false, "MediaBrowserCompatSearchResultReceiver", null);
            }
            ((Field) objRemoteActionCompatParcelizer3).setInt(getcurrenteventtimeus3, i);
            getCurrentEventTimeUs getcurrenteventtimeus4 = this.IconCompatParcelizer;
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2141089165);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (63098 - ((Process.getThreadPriority(0) + 20) >> 6)), 24580 - View.MeasureSpec.makeMeasureSpec(0, 0), 21 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 30910744, false, "onPause", null);
            }
            Object obj = ((Field) objRemoteActionCompatParcelizer4).get(getcurrenteventtimeus4);
            Object[] objArr2 = {Integer.valueOf(i)};
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1431016725);
            if (objRemoteActionCompatParcelizer5 == null) {
                objRemoteActionCompatParcelizer5 = startForeground.read((char) (ViewConfiguration.getScrollBarSize() >> 8), KeyEvent.keyCodeFromString("") + 24442, (Process.myTid() >> 22) + 12, 721572224, false, "AudioAttributesCompatParcelizer", new Class[]{Integer.TYPE});
            }
            long jLongValue = ((Long) ((Method) objRemoteActionCompatParcelizer5).invoke(obj, objArr2)).longValue();
            if (jLongValue == 0) {
                getCurrentEventTimeUs getcurrenteventtimeus5 = this.IconCompatParcelizer;
                Object[] objArr3 = {new ResponseErrorException(ResponseError.customError("bit rate is 0")), 1803};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(1795578863);
                if (objRemoteActionCompatParcelizer6 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 63098);
                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 24580;
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 21;
                    byte b2 = (byte) (-$$a[294]);
                    int i2 = $$b;
                    Object[] objArr4 = new Object[1];
                    a(b2, (short) (i2 | 673), (byte) (i2 | 65), objArr4);
                    objRemoteActionCompatParcelizer6 = startForeground.read(cIndexOf, offsetAfter, modifierMetaStateMask, 357539706, false, (String) objArr4[0], new Class[]{Throwable.class, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer6).invoke(getcurrenteventtimeus5, objArr3);
                return;
            }
            getCurrentEventTimeUs getcurrenteventtimeus6 = this.IconCompatParcelizer;
            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(875815479);
            if (objRemoteActionCompatParcelizer7 == null) {
                objRemoteActionCompatParcelizer7 = startForeground.read((char) (63098 - TextUtils.indexOf("", "", 0, 0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24580, 19 - TextUtils.lastIndexOf("", '0', 0, 0), 1249519266, false, "onRemoveQueueItem", null);
            }
            ((maybeExpandData) ((Field) objRemoteActionCompatParcelizer7).get(getcurrenteventtimeus6)).IconCompatParcelizer(i, jLongValue);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // kotlin.getAddress, com.google.android.exoplayer2.util.EventLogger, com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void onTracksChanged(AnalyticsListener.EventTime eventTime, Tracks tracks) throws Throwable {
        super.onTracksChanged(eventTime, tracks);
        try {
            Object[] objArr = {this.IconCompatParcelizer, parseCea708AccessibilityChannel.write(new parseCea708AccessibilityChannel.RemoteActionCompatParcelizer() { // from class: o.getNextUrl
                @Override // o.parseCea708AccessibilityChannel.RemoteActionCompatParcelizer
                public final Object write() {
                    return this.write.MediaMetadataCompat();
                }
            }), new getCurrentEventTimeUs.IconCompatParcelizer() { // from class: o.ReferalCouponDetailResponseBenefitDetailsUserDetail
                @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
                public final void write(Object obj) throws Throwable {
                    this.IconCompatParcelizer.RemoteActionCompatParcelizer((Boolean) obj);
                }
            }, new getCurrentEventTimeUs.IconCompatParcelizer() { // from class: o.setForBuild
                @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
                public final void write(Object obj) {
                }
            }};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-681383531);
            if (objRemoteActionCompatParcelizer == null) {
                char cIndexOf = (char) (63098 - TextUtils.indexOf("", ""));
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 24580;
                int mirror = 'D' - AndroidCharacter.getMirror('0');
                byte b = (byte) (-$$a[294]);
                int i = $$b;
                Object[] objArr2 = new Object[1];
                a(b, (short) (i | 673), (byte) (i | 65), objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(cIndexOf, iKeyCodeFromString, mirror, -1456788224, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 63098), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24580, 20 - Color.red(0)), LessonDynamicResponseBody.class, getCurrentEventTimeUs.IconCompatParcelizer.class, getCurrentEventTimeUs.IconCompatParcelizer.class});
            }
            ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean MediaMetadataCompat() {
        getCurrentEventTimeUs getcurrenteventtimeus = this.IconCompatParcelizer;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(17391646);
        if (objRemoteActionCompatParcelizer == null) {
            objRemoteActionCompatParcelizer = startForeground.read((char) (63098 - (ViewConfiguration.getPressedStateDuration() >> 16)), 24580 - View.MeasureSpec.makeMeasureSpec(0, 0), 20 - KeyEvent.normalizeMetaState(0), 2134942859, false, "onPrepare", null);
        }
        return Boolean.valueOf(((getStreamPositionUsForContent) ((Field) objRemoteActionCompatParcelizer).get(getcurrenteventtimeus)).RemoteActionCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void RemoteActionCompatParcelizer(java.lang.Boolean r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setEductionDegrees$2.RemoteActionCompatParcelizer(java.lang.Boolean):void");
    }

    @Override // kotlin.getAddress
    public final void RemoteActionCompatParcelizer(long j, boolean z) throws Throwable {
        super.RemoteActionCompatParcelizer(j, z);
        try {
            Object[] objArr = {this.IconCompatParcelizer};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(179313370);
            if (objRemoteActionCompatParcelizer == null) {
                char cMyTid = (char) (63098 - (Process.myTid() >> 22));
                int iBlue = Color.blue(0) + 24580;
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 21;
                Object[] objArr2 = new Object[1];
                a($$a[300], (short) 196, (byte) 69, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(cMyTid, iBlue, iIndexOf, 1962532431, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63097 - TextUtils.lastIndexOf("", '0', 0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 24579, 19 - TextUtils.lastIndexOf("", '0', 0))});
            }
            ((getSaveProfileModel.RemoteActionCompatParcelizer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr)).invalidateMenu();
            Object[] objArr3 = {this.IconCompatParcelizer, null};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1588838543);
            if (objRemoteActionCompatParcelizer2 == null) {
                char cNormalizeMetaState = (char) (63098 - KeyEvent.normalizeMetaState(0));
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24581;
                int i = (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 19;
                byte b = (byte) $$b;
                short s = $$a[247];
                Object[] objArr4 = new Object[1];
                a(b, s, (byte) (s | 32), objArr4);
                objRemoteActionCompatParcelizer2 = startForeground.read(cNormalizeMetaState, iIndexOf2, i, -553255964, false, (String) objArr4[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63098 - (Process.myTid() >> 22)), 24580 - (Process.myPid() >> 22), View.MeasureSpec.getSize(0) + 20), ExoPlaybackException.class});
            }
            ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
            Object[] objArr5 = {this.IconCompatParcelizer, -1};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1212533769);
            if (objRemoteActionCompatParcelizer3 == null) {
                char c = (char) (63099 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int iIndexOf3 = TextUtils.indexOf("", "", 0) + 24580;
                int deadChar = 20 - KeyEvent.getDeadChar(0, 0);
                byte b2 = $$a[4];
                Object[] objArr6 = new Object[1];
                a(b2, (short) (b2 | 203), r1[300], objArr6);
                objRemoteActionCompatParcelizer3 = startForeground.read(c, iIndexOf3, deadChar, 906758300, false, (String) objArr6[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (ExpandableListView.getPackedPositionChild(0L) + 63099), 24581 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 20), Integer.TYPE});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr5);
            if (z) {
                getCurrentEventTimeUs getcurrenteventtimeus = this.IconCompatParcelizer;
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(875815479);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (63098 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 24580 - TextUtils.indexOf("", "", 0), 20 - (KeyEvent.getMaxKeyCode() >> 16), 1249519266, false, "onRemoveQueueItem", null);
                }
                ((maybeExpandData) ((Field) objRemoteActionCompatParcelizer4).get(getcurrenteventtimeus)).read(j);
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // kotlin.getAddress, com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, int i) throws Throwable {
        getCurrentEventTimeUs getcurrenteventtimeus = this.IconCompatParcelizer;
        try {
            Object[] objArr = {Integer.valueOf(i)};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(748893480);
            if (objRemoteActionCompatParcelizer == null) {
                char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 63098);
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 24580;
                int i2 = (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 20;
                byte b = (byte) (-$$a[294]);
                int i3 = $$b;
                Object[] objArr2 = new Object[1];
                a(b, (short) (i3 | 673), (byte) (i3 | 65), objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(edgeSlop, offsetBefore, i2, 1391129021, false, (String) objArr2[0], new Class[]{Integer.TYPE});
            }
            ((Method) objRemoteActionCompatParcelizer).invoke(getcurrenteventtimeus, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void onVideoCodecError(AnalyticsListener.EventTime eventTime, Exception exc) throws Throwable {
        super.onVideoCodecError(eventTime, exc);
        buildResolutionString.IconCompatParcelizer("video_3.0_codec_error ", exc.getMessage());
        RemoteActionCompatParcelizer("vid_codec_error", exc.getMessage());
    }

    @Override // com.google.android.exoplayer2.util.EventLogger, com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime, int i) throws Throwable {
        String str;
        super.onDrmSessionAcquired(eventTime, i);
        if (i == 0) {
            str = "state_released";
        } else if (i == 1) {
            str = "state_error";
        } else if (i == 2) {
            str = "state_opening";
        } else if (i == 3) {
            str = "state_opened";
        } else if (i != 4) {
            str = "noState";
        } else {
            str = "state_keys";
        }
        buildResolutionString.IconCompatParcelizer("video_3.0_drm_acq", str);
        RemoteActionCompatParcelizer("drm_acquired_state", str);
        RemoteActionCompatParcelizer("drm_acquired_ts", String.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // com.google.android.exoplayer2.util.EventLogger, com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) throws Throwable {
        super.onDrmSessionManagerError(eventTime, exc);
        buildResolutionString.IconCompatParcelizer("video_3.0_drm_error", exc.getMessage());
        RemoteActionCompatParcelizer("drm_session_error", exc.getMessage());
    }

    @Override // com.google.android.exoplayer2.util.EventLogger, com.google.android.exoplayer2.analytics.AnalyticsListener
    public final void onDrmSessionReleased(AnalyticsListener.EventTime eventTime) throws Throwable {
        super.onDrmSessionReleased(eventTime);
        buildResolutionString.IconCompatParcelizer("video_3.0_drm_release", "".concat(String.valueOf(eventTime)));
        RemoteActionCompatParcelizer("drm_session_release_ts", String.valueOf(SystemClock.elapsedRealtime()));
    }

    private void RemoteActionCompatParcelizer(String str, String str2) throws Throwable {
        try {
            Object[] objArr = {this.IconCompatParcelizer};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1765409150);
            if (objRemoteActionCompatParcelizer == null) {
                char defaultSize = (char) (View.getDefaultSize(0, 0) + 63098);
                int iIndexOf = 24580 - TextUtils.indexOf("", "");
                int mode = View.MeasureSpec.getMode(0) + 20;
                Object[] objArr2 = new Object[1];
                a(r2[65], (short) ($$b | 67), (byte) ($$a[479] + 1), objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(defaultSize, iIndexOf, mode, -393463273, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 63098), 24579 - Process.getGidForName(""), 20 - (ViewConfiguration.getTapTimeout() >> 16))});
            }
            AbstractMap abstractMap = (AbstractMap) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr);
            StringBuilder sb = new StringBuilder();
            getCurrentEventTimeUs getcurrenteventtimeus = this.IconCompatParcelizer;
            Object[] objArr3 = {getcurrenteventtimeus};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1641725974);
            if (objRemoteActionCompatParcelizer2 == null) {
                char packedPositionType = (char) (63098 - ExpandableListView.getPackedPositionType(0L));
                int scrollBarFadeDuration = 24580 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int iGreen = Color.green(0) + 20;
                Object[] objArr4 = new Object[1];
                a($$a[300], (short) 96, (byte) ($$b | 55), objArr4);
                objRemoteActionCompatParcelizer2 = startForeground.read(packedPositionType, scrollBarFadeDuration, iGreen, -529728641, false, (String) objArr4[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (63098 - View.getDefaultSize(0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 24581, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 21)});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
            Object[] objArr5 = {getcurrenteventtimeus, Integer.valueOf(iIntValue + 1)};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-595648040);
            if (objRemoteActionCompatParcelizer3 == null) {
                char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 63098);
                int gidForName = 24579 - Process.getGidForName("");
                int iIndexOf2 = 20 - TextUtils.indexOf("", "");
                byte[] bArr = $$a;
                Object[] objArr6 = new Object[1];
                a((byte) (-bArr[108]), (short) ($$b | 101), (byte) (-bArr[294]), objArr6);
                objRemoteActionCompatParcelizer3 = startForeground.read(packedPositionGroup, gidForName, iIndexOf2, -1573460659, false, (String) objArr6[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 63098), 24580 - View.MeasureSpec.makeMeasureSpec(0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 20), Integer.TYPE});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr5);
            sb.append(iIntValue);
            sb.append("_");
            sb.append(str2);
            abstractMap.put(str, sb.toString());
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
