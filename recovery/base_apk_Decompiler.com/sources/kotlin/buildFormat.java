package kotlin;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaDrm;
import android.media.MediaFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.data.models.video.DownloadableResolution;
import com.marrow.data.models.video.PixelInfo;
import com.marrow.data.models.video.ThemeState;
import com.marrow.data.models.video.cache.VideoCacheInfo;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/buildFormat;", "", "<init>", "()V", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class buildFormat {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o.buildFormat$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0013\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u0013\u0010\u001dJ/\u0010 \u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u001d\u0010\u0013\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001b¢\u0006\u0004\b\u0013\u0010\"J\u0011\u0010\u0013\u001a\u00020\b*\u00020#¢\u0006\u0004\b\u0013\u0010$J\u0011\u0010%\u001a\u00020\u001c*\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010\u0019\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010'J\u0015\u0010(\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b(\u0010)"}, d2 = {"Lo/buildFormat$write;", "", "<init>", "()V", "p0", "p1", "p2", "p3", "", "IconCompatParcelizer$6ffdff8f", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;", "read$2f5d8281", "(Ljava/lang/Object;)Ljava/lang/String;", "IconCompatParcelizer$8a40897", "write$2ce95730", "write$438f1c32", "read$44314062", "AudioAttributesCompatParcelizer$39e27c23", "Lcom/google/android/exoplayer2/Format;", "IconCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/exoplayer2/Format;", "", "Lcom/marrow/data/models/video/DownloadableResolution;", "", "Lcom/marrow/data/models/video/PixelInfo;", "AudioAttributesCompatParcelizer", "(Ljava/util/List;)[Lcom/marrow/data/models/video/PixelInfo;", "", "Lo/getChunkEndTimeUs;", "(I)Lo/getChunkEndTimeUs;", "Lcom/marrow/data/models/video/cache/VideoCacheInfo;", "", "RemoteActionCompatParcelizer$4c8a7848", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/marrow/data/models/video/cache/VideoCacheInfo;Ljava/lang/String;)Z", "(II)Z", "Lo/PlayerNotificationManager1;", "(Lo/PlayerNotificationManager1;)Ljava/lang/String;", "read", "(Lo/PlayerNotificationManager1;)Lo/getChunkEndTimeUs;", "(Ljava/lang/String;)I", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: o.buildFormat$write$AudioAttributesCompatParcelizer */
        /* JADX INFO: loaded from: classes3.dex */
        public static final /* synthetic */ class AudioAttributesCompatParcelizer {
            public static final /* synthetic */ int[] IconCompatParcelizer;

            static {
                int[] iArr = new int[PlayerNotificationManager1.values().length];
                try {
                    iArr[PlayerNotificationManager1.IconCompatParcelizer.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PlayerNotificationManager1.read.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PlayerNotificationManager1.write.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                IconCompatParcelizer = iArr;
            }
        }

        private Companion() {
        }

        public static String IconCompatParcelizer$6ffdff8f(Object p0, Object p1, Object p2, Object p3) throws Throwable {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            toMagicModuleMetaRepoModel.write(p3, "");
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(716508383);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.getTrimmedLength("") + 12507, Color.alpha(0) + 34, 1425852490, false, "IconCompatParcelizer", new Class[0]);
                }
                String write = read((PlayerNotificationManager1) ((Method) objRemoteActionCompatParcelizer).invoke(p0, null)).getWrite();
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1197914128);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.lastIndexOf("", '0') + 1), 16789678 + Color.rgb(0, 0, 0), (-16777181) - Color.rgb(0, 0, 0), 959413381, false, "IconCompatParcelizer", new Class[0]);
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(p3, null);
                JSONObject jSONObject = new JSONObject();
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-120727975);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (10850 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), View.getDefaultSize(0, 0) + 12541, TextUtils.indexOf((CharSequence) "", '0', 0) + 42, -2038164788, false, "write", new Class[0]);
                }
                isDvbProfileDeclared.write(jSONObject, "lesson_id", (String) ((Method) objRemoteActionCompatParcelizer3).invoke(p1, null));
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1780362656);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 10850), 12540 - TextUtils.lastIndexOf("", '0', 0, 0), 41 - View.MeasureSpec.makeMeasureSpec(0, 0), 341305653, false, "read", new Class[0]);
                }
                isDvbProfileDeclared.write(jSONObject, "video_id", (String) ((Method) objRemoteActionCompatParcelizer4).invoke(p1, null));
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(566843675);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) View.resolveSize(0, 0), 12370 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 22, 1602264462, false, "read", new Class[0]);
                }
                isDvbProfileDeclared.write(jSONObject, "device_id", (String) ((Method) objRemoteActionCompatParcelizer5).invoke(p2, null));
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(1602462258);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10850), 12541 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 41 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 566912679, false, "MediaBrowserCompatItemReceiver", new Class[0]);
                }
                isDvbProfileDeclared.read(jSONObject, "playback_type", Integer.valueOf(((cloneAndClear) ((Method) objRemoteActionCompatParcelizer6).invoke(p1, null)).getIconCompatParcelizer()));
                isDvbProfileDeclared.read(jSONObject, "dr_dv_ts", Long.valueOf(System.currentTimeMillis() / 1000));
                isDvbProfileDeclared.write(jSONObject, "quality", write);
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(2068396149);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) KeyEvent.getDeadChar(0, 0), 12369 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 22 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 83950816, false, "AudioAttributesCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer7).invoke(p2, null);
                Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-882924932);
                if (objRemoteActionCompatParcelizer8 == null) {
                    objRemoteActionCompatParcelizer8 = startForeground.read((char) (KeyEvent.keyCodeFromString("") + 61116), ((byte) KeyEvent.getModifierMetaStateMask()) + 11735, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 23, -1256823063, false, "AudioAttributesCompatParcelizer", new Class[0]);
                }
                isDvbProfileDeclared.write(jSONObject, "wv_level", (String) ((Method) objRemoteActionCompatParcelizer8).invoke(objInvoke, null));
                Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(914889278);
                if (objRemoteActionCompatParcelizer9 == null) {
                    objRemoteActionCompatParcelizer9 = startForeground.read((char) Color.alpha(0), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 12368, TextUtils.indexOf("", "") + 22, 1220665003, false, "write", new Class[0]);
                }
                isDvbProfileDeclared.read(jSONObject, "wv_number_v", Integer.valueOf(((Integer) ((Method) objRemoteActionCompatParcelizer9).invoke(p2, null)).intValue()));
                Object objRemoteActionCompatParcelizer10 = startForeground.RemoteActionCompatParcelizer(1223641991);
                if (objRemoteActionCompatParcelizer10 == null) {
                    objRemoteActionCompatParcelizer10 = startForeground.read((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 12370 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22, 916885266, false, "IconCompatParcelizer", new Class[0]);
                }
                isDvbProfileDeclared.read(jSONObject, "wv_number_a", Integer.valueOf(((Integer) ((Method) objRemoteActionCompatParcelizer10).invoke(p2, null)).intValue()));
                Object objRemoteActionCompatParcelizer11 = startForeground.RemoteActionCompatParcelizer(1197914128);
                if (objRemoteActionCompatParcelizer11 == null) {
                    objRemoteActionCompatParcelizer11 = startForeground.read((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 12462 - KeyEvent.getDeadChar(0, 0), 35 - View.resolveSize(0, 0), 959413381, false, "IconCompatParcelizer", new Class[0]);
                }
                isDvbProfileDeclared.write(jSONObject, "pb_s_id", (String) ((Method) objRemoteActionCompatParcelizer11).invoke(p3, null));
                Object objRemoteActionCompatParcelizer12 = startForeground.RemoteActionCompatParcelizer(1347096838);
                if (objRemoteActionCompatParcelizer12 == null) {
                    objRemoteActionCompatParcelizer12 = startForeground.read((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 12462, ((Process.getThreadPriority(0) + 20) >> 6) + 35, 771937683, false, "AudioAttributesImplApi26Parcelizer", new Class[0]);
                }
                isDvbProfileDeclared.write(jSONObject, CourseConfigKeyConstantsKt.KEY_THEME, ((ThemeState) ((Method) objRemoteActionCompatParcelizer12).invoke(p3, null)).getTheme());
                String string = jSONObject.toString();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                return string;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        public static String read$2f5d8281(Object p0) throws Throwable {
            toMagicModuleMetaRepoModel.write(p0, "");
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(2049869480);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (30217 - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 12391, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33, 73876029, false, "read", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(p0, null);
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1831926472);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 30218), 12391 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 32, 326712925, false, "AudioAttributesCompatParcelizer", new Class[0]);
                }
                String str = String.format("%s://%s/%s/%s", Arrays.copyOf(new Object[]{((Method) objRemoteActionCompatParcelizer2).invoke(p0, null), objInvoke, "v3.1", "dr_lang/rEkHsNQYmWSFgT8/18h84iFpabJA1Jn"}, 4));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                return str;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        public static String IconCompatParcelizer$8a40897(Object p0) throws Throwable {
            toMagicModuleMetaRepoModel.write(p0, "");
            JSONObject jSONObject = new JSONObject();
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1939145536);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0) + 1), (ViewConfiguration.getJumpTapTimeout() >> 16) + 12926, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31, -232572843, false, "read", new Class[0]);
                }
                jSONObject.put("lesson_id", ((Method) objRemoteActionCompatParcelizer).invoke(p0, null));
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1396718882);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getOffsetBefore("", 0), 12926 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 31 - ExpandableListView.getPackedPositionGroup(0L), 755628471, false, "AudioAttributesImplApi26Parcelizer", new Class[0]);
                }
                jSONObject.put("video_id", ((Method) objRemoteActionCompatParcelizer2).invoke(p0, null));
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1032620624);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), Color.red(0) + 12926, 32 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1137004251, false, "AudioAttributesCompatParcelizer", new Class[0]);
                }
                jSONObject.put("device_id", ((Method) objRemoteActionCompatParcelizer3).invoke(p0, null));
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(538635065);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 12926 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 31, 1582509996, false, "write", new Class[0]);
                }
                jSONObject.put("playback_type", ((cloneAndClear) ((Method) objRemoteActionCompatParcelizer4).invoke(p0, null)).getIconCompatParcelizer());
                jSONObject.put("dr_dv_ts", String.valueOf(System.currentTimeMillis() / 1000));
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(467891215);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) TextUtils.indexOf("", "", 0, 0), 12927 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), Color.rgb(0, 0, 0) + 16777247, 1705685146, false, "RemoteActionCompatParcelizer", new Class[0]);
                }
                jSONObject.put("quality", ((getChunkEndTimeUs) ((Method) objRemoteActionCompatParcelizer5).invoke(p0, null)).getWrite());
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-176442497);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) View.MeasureSpec.getSize(0), Color.argb(0, 0, 0, 0) + 12926, (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 30, -1959626774, false, "AudioAttributesImplBaseParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(p0, null);
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-882924932);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) (61116 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 11734, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 23, -1256823063, false, "AudioAttributesCompatParcelizer", new Class[0]);
                }
                jSONObject.put("wv_level", ((Method) objRemoteActionCompatParcelizer7).invoke(objInvoke, null));
                Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(2003240236);
                if (objRemoteActionCompatParcelizer8 == null) {
                    objRemoteActionCompatParcelizer8 = startForeground.read((char) Color.blue(0), Process.getGidForName("") + 12927, 31 - ExpandableListView.getPackedPositionType(0L), 154059193, false, "IconCompatParcelizer", new Class[0]);
                }
                jSONObject.put(CourseConfigKeyConstantsKt.KEY_THEME, ((Method) objRemoteActionCompatParcelizer8).invoke(p0, null));
                String string = jSONObject.toString();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                return string;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        public static String write$2ce95730(Object p0) throws Throwable {
            toMagicModuleMetaRepoModel.write(p0, "");
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1012550041);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 31538), 12957 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 28 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1108577548, false, "read", new Class[0]);
                }
                Objects.toString(parseFrameRate.write((List<String>) ((Method) objRemoteActionCompatParcelizer).invoke(p0, null)));
                JSONObject jSONObject = new JSONObject();
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(312477160);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (31537 - ExpandableListView.getPackedPositionChild(0L)), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 12957, 29 - ((Process.getThreadPriority(0) + 20) >> 6), 1827258749, false, "RemoteActionCompatParcelizer", new Class[0]);
                }
                jSONObject.put("lesson_id", ((Method) objRemoteActionCompatParcelizer2).invoke(p0, null));
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-997988041);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 31537), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12956, (ViewConfiguration.getTouchSlop() >> 8) + 29, -1161155166, false, "AudioAttributesCompatParcelizer", new Class[0]);
                }
                jSONObject.put("video_id", ((Method) objRemoteActionCompatParcelizer3).invoke(p0, null));
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(926646277);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 31537), 12956 - MotionEvent.axisFromString(""), TextUtils.indexOf("", "", 0, 0) + 29, 1232225424, false, "IconCompatParcelizer", new Class[0]);
                }
                jSONObject.put("device_id", ((Method) objRemoteActionCompatParcelizer4).invoke(p0, null));
                jSONObject.put("playback_type", cloneAndClear.AudioAttributesCompatParcelizer.getIconCompatParcelizer());
                jSONObject.put("dr_dv_ts", String.valueOf(System.currentTimeMillis() / 1000));
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-346208021);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (TextUtils.lastIndexOf("", '0') + 31539), 12957 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 28, -1793815426, false, "MediaBrowserCompatItemReceiver", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer5).invoke(p0, null);
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-882924932);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (61115 - TextUtils.indexOf((CharSequence) "", '0', 0)), View.MeasureSpec.getMode(0) + 11734, 24 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1256823063, false, "AudioAttributesCompatParcelizer", new Class[0]);
                }
                jSONObject.put("wv_level", ((Method) objRemoteActionCompatParcelizer6).invoke(objInvoke, null));
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(1012550041);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) (View.combineMeasuredStates(0, 0) + 31538), TextUtils.indexOf("", "") + 12957, 29 - View.MeasureSpec.getSize(0), 1108577548, false, "read", new Class[0]);
                }
                jSONObject.put("active_sessions", parseFrameRate.write((List<String>) ((Method) objRemoteActionCompatParcelizer7).invoke(p0, null)));
                Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(1846884736);
                if (objRemoteActionCompatParcelizer8 == null) {
                    objRemoteActionCompatParcelizer8 = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 31537), 12957 - TextUtils.indexOf("", ""), 30 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 274529557, false, "write", new Class[0]);
                }
                jSONObject.put(CourseConfigKeyConstantsKt.KEY_THEME, ((Method) objRemoteActionCompatParcelizer8).invoke(p0, null));
                String string = jSONObject.toString();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                return string;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        public static String write$438f1c32(Object p0) throws Throwable {
            toMagicModuleMetaRepoModel.write(p0, "");
            JSONObject jSONObject = new JSONObject();
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1132381090);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) Drawable.resolveOpacity(0, 0), 12986 - KeyEvent.getDeadChar(0, 0), 18 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1027016503, false, "write", new Class[0]);
                }
                jSONObject.put("lesson_id", ((Method) objRemoteActionCompatParcelizer).invoke(p0, null));
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-2005324583);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), View.combineMeasuredStates(0, 0) + 12986, Process.getGidForName("") + 19, -164566964, false, "AudioAttributesCompatParcelizer", new Class[0]);
                }
                jSONObject.put("video_id", ((Method) objRemoteActionCompatParcelizer2).invoke(p0, null));
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-2041563770);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) Color.red(0), TextUtils.getOffsetAfter("", 0) + 12986, 17 - TextUtils.lastIndexOf("", '0', 0, 0), -132517613, false, "RemoteActionCompatParcelizer", new Class[0]);
                }
                jSONObject.put("device_id", ((Method) objRemoteActionCompatParcelizer3).invoke(p0, null));
                jSONObject.put("playback_type", cloneAndClear.IconCompatParcelizer.getIconCompatParcelizer());
                jSONObject.put("dr_dv_ts", String.valueOf(System.currentTimeMillis() / 1000));
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-395971785);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) View.resolveSizeAndState(0, 0, 0), 12986 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 19, -1775487070, false, "read", new Class[0]);
                }
                jSONObject.put("quality", ((getChunkEndTimeUs) ((Method) objRemoteActionCompatParcelizer4).invoke(p0, null)).getWrite());
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1504456099);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) ((-1) - MotionEvent.axisFromString("")), (ViewConfiguration.getLongPressTimeout() >> 16) + 12986, (KeyEvent.getMaxKeyCode() >> 16) + 18, 669378870, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer5).invoke(p0, null);
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-882924932);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 61115), 11733 - TextUtils.lastIndexOf("", '0', 0, 0), Color.blue(0) + 23, -1256823063, false, "AudioAttributesCompatParcelizer", new Class[0]);
                }
                jSONObject.put("wv_level", ((Method) objRemoteActionCompatParcelizer6).invoke(objInvoke, null));
                String string = jSONObject.toString();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                return string;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        public static String read$44314062(Object p0) throws Throwable {
            toMagicModuleMetaRepoModel.write(p0, "");
            JSONObject jSONObject = new JSONObject();
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1456551562);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (Process.getGidForName("") + 31299), View.resolveSizeAndState(0, 0, 0) + 12897, 29 - ExpandableListView.getPackedPositionType(0L), -681112093, false, "RemoteActionCompatParcelizer", new Class[0]);
                }
                jSONObject.put("lesson_id", ((Method) objRemoteActionCompatParcelizer).invoke(p0, null));
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1161779592);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (31297 - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12897, TextUtils.indexOf("", "", 0) + 29, -997629203, false, "AudioAttributesImplBaseParcelizer", new Class[0]);
                }
                jSONObject.put("video_id", ((Method) objRemoteActionCompatParcelizer2).invoke(p0, null));
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1888858515);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (31299 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0) + 12898, (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 29, 249328902, false, "IconCompatParcelizer", new Class[0]);
                }
                jSONObject.put("device_id", ((Method) objRemoteActionCompatParcelizer3).invoke(p0, null));
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(758470439);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (31298 - (ViewConfiguration.getPressedStateDuration() >> 16)), 12897 - (ViewConfiguration.getScrollBarSize() >> 8), 28 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1400673202, false, "read", new Class[0]);
                }
                jSONObject.put("playback_type", ((cloneAndClear) ((Method) objRemoteActionCompatParcelizer4).invoke(p0, null)).getIconCompatParcelizer());
                jSONObject.put("dr_dv_ts", String.valueOf(System.currentTimeMillis() / 1000));
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1411044073);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (31297 - TextUtils.lastIndexOf("", '0', 0)), 12897 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 29 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 710088316, false, "AudioAttributesCompatParcelizer", new Class[0]);
                }
                jSONObject.put("quality", ((getChunkEndTimeUs) ((Method) objRemoteActionCompatParcelizer5).invoke(p0, null)).getWrite());
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(111479786);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (Drawable.resolveOpacity(0, 0) + 31298), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 12897, 29 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2028785535, false, "MediaBrowserCompatCustomActionResultReceiver", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(p0, null);
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-882924932);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) (61115 - ((byte) KeyEvent.getModifierMetaStateMask())), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 11733, MotionEvent.axisFromString("") + 24, -1256823063, false, "AudioAttributesCompatParcelizer", new Class[0]);
                }
                jSONObject.put("wv_level", ((Method) objRemoteActionCompatParcelizer7).invoke(objInvoke, null));
                Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1734615630);
                if (objRemoteActionCompatParcelizer8 == null) {
                    objRemoteActionCompatParcelizer8 = startForeground.read((char) (31298 - ExpandableListView.getPackedPositionGroup(0L)), Color.red(0) + 12897, 29 - KeyEvent.getDeadChar(0, 0), -422438617, false, "write", new Class[0]);
                }
                jSONObject.put("pb_s_id", ((Method) objRemoteActionCompatParcelizer8).invoke(p0, null));
                String string = jSONObject.toString();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                return string;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        public static String AudioAttributesCompatParcelizer$39e27c23(Object p0) throws Throwable {
            toMagicModuleMetaRepoModel.write(p0, "");
            JSONObject jSONObject = new JSONObject();
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-304398318);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 11904 - Color.blue(0), 21 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1819114361, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(p0, null);
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(127903051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12049, (ViewConfiguration.getTouchSlop() >> 8) + 26, 2044092894, false, "read", new Class[0]);
                }
                jSONObject.put("lesson_id", ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, null));
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-304398318);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 11903 - Process.getGidForName(""), KeyEvent.keyCodeFromString("") + 20, -1819114361, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(p0, null);
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-720056763);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12050, 26 - View.combineMeasuredStates(0, 0), -1419965744, false, "AudioAttributesCompatParcelizer", new Class[0]);
                }
                jSONObject.put("video_id", ((Method) objRemoteActionCompatParcelizer4).invoke(objInvoke2, null));
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1399995482);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (ViewConfiguration.getTouchSlop() >> 8), 11905 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 20 - View.getDefaultSize(0, 0), -758905037, false, "read", new Class[0]);
                }
                Object objInvoke3 = ((Method) objRemoteActionCompatParcelizer5).invoke(p0, null);
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(1404029948);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (Process.getGidForName("") + 39308), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11998, (-16777164) - Color.rgb(0, 0, 0), 770051945, false, "AudioAttributesCompatParcelizer", new Class[0]);
                }
                jSONObject.put("device_id", ((Method) objRemoteActionCompatParcelizer6).invoke(objInvoke3, null));
                jSONObject.put("playback_type", cloneAndClear.IconCompatParcelizer.getIconCompatParcelizer());
                jSONObject.put("dr_dv_ts", String.valueOf(System.currentTimeMillis() / 1000));
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-304398318);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) Color.alpha(0), 11904 - (ViewConfiguration.getTapTimeout() >> 16), 20 - Color.blue(0), -1819114361, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke4 = ((Method) objRemoteActionCompatParcelizer7).invoke(p0, null);
                Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1277564006);
                if (objRemoteActionCompatParcelizer8 == null) {
                    objRemoteActionCompatParcelizer8 = startForeground.read((char) View.MeasureSpec.getSize(0), KeyEvent.getDeadChar(0, 0) + 12050, 26 - View.MeasureSpec.makeMeasureSpec(0, 0), -846188785, false, "RemoteActionCompatParcelizer", new Class[0]);
                }
                jSONObject.put("quality", ((getChunkEndTimeUs) ((Method) objRemoteActionCompatParcelizer8).invoke(objInvoke4, null)).getWrite());
                Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(-1795593995);
                if (objRemoteActionCompatParcelizer9 == null) {
                    objRemoteActionCompatParcelizer9 = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 11904, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 20, -357520288, false, "RemoteActionCompatParcelizer", new Class[0]);
                }
                Object objInvoke5 = ((Method) objRemoteActionCompatParcelizer9).invoke(p0, null);
                Object objRemoteActionCompatParcelizer10 = startForeground.RemoteActionCompatParcelizer(-1621230191);
                if (objRemoteActionCompatParcelizer10 == null) {
                    objRemoteActionCompatParcelizer10 = startForeground.read((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 33611), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 11972, 25 - (ViewConfiguration.getScrollBarSize() >> 8), -518768380, false, "RemoteActionCompatParcelizer", new Class[0]);
                }
                jSONObject.put("wv_level", ((Method) objRemoteActionCompatParcelizer10).invoke(objInvoke5, null));
                Object objRemoteActionCompatParcelizer11 = startForeground.RemoteActionCompatParcelizer(928599299);
                if (objRemoteActionCompatParcelizer11 == null) {
                    objRemoteActionCompatParcelizer11 = startForeground.read((char) (Process.myTid() >> 22), Drawable.resolveOpacity(0, 0) + 11904, TextUtils.indexOf("", "", 0, 0) + 20, 1225820566, false, "AudioAttributesImplApi21Parcelizer", new Class[0]);
                }
                jSONObject.put(CourseConfigKeyConstantsKt.KEY_THEME, ((ThemeState) ((Method) objRemoteActionCompatParcelizer11).invoke(p0, null)).getTheme());
                String string = jSONObject.toString();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                return string;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        public static Format IconCompatParcelizer(String p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Format formatBuild = new Format.Builder().setDrmInitData(new DrmInitData(new DrmInitData.SchemeData(C.WIDEVINE_UUID, p0, MimeTypes.VIDEO_MP4, filterRedundantIncompleteSchemeDatas.RemoteActionCompatParcelizer(p1)))).build();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(formatBuild, "");
            return formatBuild;
        }

        @getMagicModuleMeta
        public static PixelInfo[] AudioAttributesCompatParcelizer(List<DownloadableResolution> p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            ArrayList arrayList = new ArrayList();
            for (DownloadableResolution downloadableResolution : p0) {
                if (downloadableResolution.getResolutionHeight() <= 360) {
                    arrayList.add(new PixelInfo(downloadableResolution, "Low", getChunkEndTimeUs.write));
                } else {
                    int resolutionHeight = downloadableResolution.getResolutionHeight();
                    if (361 <= resolutionHeight && resolutionHeight < 720) {
                        arrayList.add(new PixelInfo(downloadableResolution, "Medium", getChunkEndTimeUs.read));
                    } else if (downloadableResolution.getResolutionHeight() >= 720) {
                        arrayList.add(new PixelInfo(downloadableResolution, "HD", getChunkEndTimeUs.RemoteActionCompatParcelizer));
                    }
                }
            }
            return (PixelInfo[]) arrayList.toArray(new PixelInfo[0]);
        }

        @getMagicModuleMeta
        public static getChunkEndTimeUs IconCompatParcelizer(int p0) {
            if (p0 >= 720) {
                return getChunkEndTimeUs.RemoteActionCompatParcelizer;
            }
            if (p0 >= 540) {
                return getChunkEndTimeUs.read;
            }
            return getChunkEndTimeUs.write;
        }

        public static boolean RemoteActionCompatParcelizer$4c8a7848(Object p0, Object p1, VideoCacheInfo p2, String p3) throws Throwable {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p3, "");
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(814928870);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 12508 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 34 - View.MeasureSpec.getMode(0), 1322981235, false, "write", new Class[0]);
                }
                if (((Boolean) ((Method) objRemoteActionCompatParcelizer).invoke(p1, null)).booleanValue() || p2 == null || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p2.getId(), (Object) p3) || p2.getDownloadStatus() != 1) {
                    return false;
                }
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(895611276);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), View.MeasureSpec.getSize(0) + 12338, View.MeasureSpec.getSize(0) + 31, 1260926233, false, "IconCompatParcelizer", new Class[0]);
                }
                Object[] objArr = {((Method) objRemoteActionCompatParcelizer2).invoke(p0, null), p2};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-367321276);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (46709 - Color.blue(0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 17371, 15 - (ViewConfiguration.getPressedStateDuration() >> 16), -1806509103, false, "write", new Class[]{File.class, VideoCacheInfo.class});
                }
                return ((Boolean) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr)).booleanValue();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        public static boolean IconCompatParcelizer(int p0, int p1) {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i = 0; i < codecCount; i++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (codecInfoAt.isEncoder()) {
                    String[] supportedTypes = codecInfoAt.getSupportedTypes();
                    toMagicModuleMetaRepoModel.write(supportedTypes);
                    for (String str : supportedTypes) {
                        toMagicModuleMetaRepoModel.write((Object) str);
                        if (TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str, "video/")) {
                            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str, p0, p1);
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mediaFormatCreateVideoFormat, "");
                            if (codecInfoAt.getCapabilitiesForType(str).isFormatSupported(mediaFormatCreateVideoFormat)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }

        public static String IconCompatParcelizer(PlayerNotificationManager1 playerNotificationManager1) {
            toMagicModuleMetaRepoModel.write(playerNotificationManager1, "");
            int i = AudioAttributesCompatParcelizer.IconCompatParcelizer[playerNotificationManager1.ordinal()];
            if (i == 1) {
                return "HD";
            }
            if (i == 2) {
                return "Medium";
            }
            if (i == 3) {
                return "Low";
            }
            return "Auto";
        }

        public static getChunkEndTimeUs read(PlayerNotificationManager1 playerNotificationManager1) {
            toMagicModuleMetaRepoModel.write(playerNotificationManager1, "");
            int i = AudioAttributesCompatParcelizer.IconCompatParcelizer[playerNotificationManager1.ordinal()];
            if (i == 1) {
                return getChunkEndTimeUs.RemoteActionCompatParcelizer;
            }
            if (i == 3) {
                return getChunkEndTimeUs.write;
            }
            return getChunkEndTimeUs.read;
        }

        public static int AudioAttributesCompatParcelizer(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Iterator it = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Integer[]{5, 4, 3, 2, 1}).iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (MediaDrm.isCryptoSchemeSupported(C.WIDEVINE_UUID, p0, iIntValue)) {
                    return iIntValue;
                }
            }
            return -1;
        }

        public static String RemoteActionCompatParcelizer(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0);
            if (iAudioAttributesCompatParcelizer == 1) {
                return "d";
            }
            if (iAudioAttributesCompatParcelizer == 2) {
                return "m";
            }
            if (iAudioAttributesCompatParcelizer == 3) {
                return CmcdHeadersFactory.STREAMING_FORMAT_SS;
            }
            if (iAudioAttributesCompatParcelizer == 4) {
                return "r";
            }
            if (iAudioAttributesCompatParcelizer == 5) {
                return "g";
            }
            return TtmlNode.TAG_P;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
