package kotlin;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.api.models.response.lesson.VideoBookmarkTimeline;
import com.marrow.data.models.content.VideoInfo;
import com.marrow.data.models.video.VideoPlaybackConfiguration;
import com.marrow.data.models.video.cache.VideoCacheInfo;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.buildFormat;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\b\u0010\t\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u00020\u0001*\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Lo/onManifestExpiredMessageEncountered;", "", "<init>", "()V", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "RemoteActionCompatParcelizer$5d6b4f3f", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/marrow/data/models/content/VideoInfo;", "", "Lcom/marrow/data/models/video/cache/VideoCacheInfo;", "write$21cae09e", "(Ljava/lang/Object;Lcom/marrow/data/models/content/VideoInfo;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/marrow/data/models/video/cache/VideoCacheInfo;)Ljava/lang/Object;", "Lcom/marrow/data/models/video/VideoPlaybackConfiguration;", "AudioAttributesCompatParcelizer$35aeb77a", "(Lcom/marrow/data/models/video/VideoPlaybackConfiguration;)Ljava/lang/Object;", "Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimeline;", "AudioAttributesCompatParcelizer$3508f4ea", "(Ljava/lang/String;Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimeline;)Ljava/lang/Object;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class onManifestExpiredMessageEncountered {
    public static final onManifestExpiredMessageEncountered INSTANCE = new onManifestExpiredMessageEncountered();

    private onManifestExpiredMessageEncountered() {
    }

    public static Object RemoteActionCompatParcelizer$5d6b4f3f(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) throws Throwable {
        Object obj;
        Object obj2;
        Object obj3;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        toMagicModuleMetaRepoModel.write(p5, "");
        toMagicModuleMetaRepoModel.write(p6, "");
        try {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(566843675);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), KeyEvent.getDeadChar(0, 0) + 12369, 22 - ((Process.getThreadPriority(0) + 20) >> 6), 1602264462, false, "read", new Class[0]);
            }
            Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(p2, null);
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(149998297);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 12338, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 30, 1991839308, false, "write", new Class[0]);
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(p4, null)).intValue();
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-819875811);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12507, 35 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1318554488, false, "AudioAttributesCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(p1, null);
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1197914128);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 12462, 36 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 959413381, false, "IconCompatParcelizer", new Class[0]);
            }
            Object[] objArr = {objInvoke, String.valueOf(iIntValue), objInvoke2, ((Method) objRemoteActionCompatParcelizer4).invoke(p5, null)};
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(377608395);
            if (objRemoteActionCompatParcelizer5 == null) {
                objRemoteActionCompatParcelizer5 = startForeground.read((char) (39223 - Color.argb(0, 0, 0, 0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14497, 111 - TextUtils.lastIndexOf("", '0'), 1757944926, false, null, new Class[]{String.class, String.class, String.class, String.class});
            }
            Object objNewInstance = ((Constructor) objRemoteActionCompatParcelizer5).newInstance(objArr);
            Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(1780362656);
            if (objRemoteActionCompatParcelizer6 == null) {
                objRemoteActionCompatParcelizer6 = startForeground.read((char) (TextUtils.indexOf("", "", 0) + 10850), 12541 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 41, 341305653, false, "read", new Class[0]);
            }
            Object objInvoke3 = ((Method) objRemoteActionCompatParcelizer6).invoke(p0, null);
            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-270794641);
            if (objRemoteActionCompatParcelizer7 == null) {
                objRemoteActionCompatParcelizer7 = startForeground.read((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 12338 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 32, -1852455686, false, "RemoteActionCompatParcelizer", new Class[0]);
            }
            Object objInvoke4 = ((Method) objRemoteActionCompatParcelizer7).invoke(p4, null);
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(566843675);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) Color.blue(0), 12370 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 22 - (ViewConfiguration.getScrollBarSize() >> 8), 1602264462, false, "read", new Class[0]);
            }
            Object objInvoke5 = ((Method) objRemoteActionCompatParcelizer8).invoke(p2, null);
            Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(-819875811);
            if (objRemoteActionCompatParcelizer9 == null) {
                objRemoteActionCompatParcelizer9 = startForeground.read((char) View.resolveSize(0, 0), 12507 - View.MeasureSpec.getSize(0), 34 - View.resolveSizeAndState(0, 0, 0), -1318554488, false, "AudioAttributesCompatParcelizer", new Class[0]);
            }
            Object objInvoke6 = ((Method) objRemoteActionCompatParcelizer9).invoke(p1, null);
            Object objRemoteActionCompatParcelizer10 = startForeground.RemoteActionCompatParcelizer(1602462258);
            if (objRemoteActionCompatParcelizer10 == null) {
                objRemoteActionCompatParcelizer10 = startForeground.read((char) (10849 - Process.getGidForName("")), 12541 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 41, 566912679, false, "MediaBrowserCompatItemReceiver", new Class[0]);
            }
            boolean z = ((Method) objRemoteActionCompatParcelizer10).invoke(p0, null) == cloneAndClear.AudioAttributesCompatParcelizer;
            Object objRemoteActionCompatParcelizer11 = startForeground.RemoteActionCompatParcelizer(895611276);
            if (objRemoteActionCompatParcelizer11 == null) {
                obj = objInvoke3;
                objRemoteActionCompatParcelizer11 = startForeground.read((char) ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12337, ExpandableListView.getPackedPositionType(0L) + 31, 1260926233, false, "IconCompatParcelizer", new Class[0]);
            } else {
                obj = objInvoke3;
            }
            Object objInvoke7 = ((Method) objRemoteActionCompatParcelizer11).invoke(p4, null);
            Object objRemoteActionCompatParcelizer12 = startForeground.RemoteActionCompatParcelizer(-718751536);
            if (objRemoteActionCompatParcelizer12 == null) {
                objRemoteActionCompatParcelizer12 = startForeground.read((char) (10850 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 12541 - KeyEvent.getDeadChar(0, 0), 41 - (ViewConfiguration.getEdgeSlop() >> 16), -1419674555, false, "AudioAttributesCompatParcelizer", new Class[0]);
            }
            Object objInvoke8 = ((Method) objRemoteActionCompatParcelizer12).invoke(p0, null);
            Object objRemoteActionCompatParcelizer13 = startForeground.RemoteActionCompatParcelizer(716508383);
            if (objRemoteActionCompatParcelizer13 == null) {
                obj2 = objInvoke5;
                objRemoteActionCompatParcelizer13 = startForeground.read((char) Color.red(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12507, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 35, 1425852490, false, "IconCompatParcelizer", new Class[0]);
            } else {
                obj2 = objInvoke5;
            }
            Object objInvoke9 = ((Method) objRemoteActionCompatParcelizer13).invoke(p1, null);
            Object objRemoteActionCompatParcelizer14 = startForeground.RemoteActionCompatParcelizer(520356595);
            if (objRemoteActionCompatParcelizer14 == null) {
                objRemoteActionCompatParcelizer14 = startForeground.read((char) KeyEvent.getDeadChar(0, 0), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 12462, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 35, 1632487014, false, "RemoteActionCompatParcelizer", new Class[0]);
            }
            Object objInvoke10 = ((Method) objRemoteActionCompatParcelizer14).invoke(p5, null);
            Object objRemoteActionCompatParcelizer15 = startForeground.RemoteActionCompatParcelizer(-120727975);
            if (objRemoteActionCompatParcelizer15 == null) {
                objRemoteActionCompatParcelizer15 = startForeground.read((char) (10849 - ExpandableListView.getPackedPositionChild(0L)), 12542 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 42 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -2038164788, false, "write", new Class[0]);
            }
            Object objInvoke11 = ((Method) objRemoteActionCompatParcelizer15).invoke(p0, null);
            Object objRemoteActionCompatParcelizer16 = startForeground.RemoteActionCompatParcelizer(-44272116);
            if (objRemoteActionCompatParcelizer16 == null) {
                obj3 = objInvoke11;
                objRemoteActionCompatParcelizer16 = startForeground.read((char) (10849 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getEdgeSlop() >> 16) + 12541, Color.alpha(0) + 41, -2095730023, false, "IconCompatParcelizer", new Class[0]);
            } else {
                obj3 = objInvoke11;
            }
            Object objInvoke12 = ((Method) objRemoteActionCompatParcelizer16).invoke(p0, null);
            Object objRemoteActionCompatParcelizer17 = startForeground.RemoteActionCompatParcelizer(693357836);
            if (objRemoteActionCompatParcelizer17 == null) {
                objRemoteActionCompatParcelizer17 = startForeground.read((char) TextUtils.indexOf("", "", 0, 0), 11612 - ExpandableListView.getPackedPositionChild(0L), Color.rgb(0, 0, 0) + 16777236, 1461324185, false, "read", new Class[0]);
            }
            Object[] objArr2 = {obj, obj3, obj2, objInvoke6, Boolean.valueOf(z), objInvoke9, objInvoke7, objInvoke4, objInvoke8, objNewInstance, objInvoke10, p6, objInvoke12, ((Method) objRemoteActionCompatParcelizer17).invoke(p3, null)};
            Object objRemoteActionCompatParcelizer18 = startForeground.RemoteActionCompatParcelizer(2145939953);
            if (objRemoteActionCompatParcelizer18 == null) {
                objRemoteActionCompatParcelizer18 = startForeground.read((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), Process.getGidForName("") + 14419, View.resolveSize(0, 0) + 80, 27374948, false, null, new Class[]{String.class, String.class, String.class, String.class, Boolean.TYPE, PlayerNotificationManager1.class, File.class, String.class, String.class, (Class) startForeground.IconCompatParcelizer((char) (39223 - (ViewConfiguration.getEdgeSlop() >> 16)), 14498 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.red(0) + 112), (Class) startForeground.IconCompatParcelizer((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12424, (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 19), (Class) startForeground.IconCompatParcelizer((char) (32105 - Color.argb(0, 0, 0, 0)), ExpandableListView.getPackedPositionChild(0L) + 13845, KeyEvent.getDeadChar(0, 0) + 34), (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 13514 - ((byte) KeyEvent.getModifierMetaStateMask()), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 26), String.class});
            }
            return ((Constructor) objRemoteActionCompatParcelizer18).newInstance(objArr2);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object write$21cae09e(Object p0, VideoInfo p1, String p2, Object p3, Object p4, VideoCacheInfo p5) throws Throwable {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        buildFormat.Companion companion = buildFormat.INSTANCE;
        String mediaId = p1.getMediaId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mediaId, "");
        boolean zRemoteActionCompatParcelizer$4c8a7848 = buildFormat.Companion.RemoteActionCompatParcelizer$4c8a7848(p3, p4, p5, mediaId);
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1516683194);
        if (objRemoteActionCompatParcelizer == null) {
            objRemoteActionCompatParcelizer = startForeground.read((char) (28099 - TextUtils.indexOf("", "", 0, 0)), 8766 - TextUtils.lastIndexOf("", '0'), View.resolveSizeAndState(0, 0, 0) + 13, 607091503, false, "RemoteActionCompatParcelizer", null);
        }
        Object obj = ((Field) objRemoteActionCompatParcelizer).get(null);
        String mediaId2 = p1.getMediaId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mediaId2, "");
        try {
            Object[] objArr = {mediaId2, p0, p4};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1611327142);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 28099), 8768 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Process.getGidForName("") + 14, 507716147, false, "AudioAttributesCompatParcelizer", new Class[]{String.class, (Class) startForeground.IconCompatParcelizer((char) (ImageFormat.getBitsPerPixel(0) + 1), 12369 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 22 - ExpandableListView.getPackedPositionType(0L)), (Class) startForeground.IconCompatParcelizer((char) KeyEvent.normalizeMetaState(0), 12555 - AndroidCharacter.getMirror('0'), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 33)});
            }
            Object objInvoke = ((Method) objRemoteActionCompatParcelizer2).invoke(obj, objArr);
            cloneAndClear cloneandclear = cloneAndClear.AudioAttributesCompatParcelizer;
            if (zRemoteActionCompatParcelizer$4c8a7848) {
                cloneandclear = cloneAndClear.IconCompatParcelizer;
            }
            String mediaId3 = p1.getMediaId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mediaId3, "");
            String psshData = p1.getPsshData();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(psshData, "");
            String thumbnailUrl = p1.getThumbnailUrl();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(thumbnailUrl, "");
            float aspectRatio = p1.getAspectRatio();
            int downloadStatus = p5 != null ? p5.getDownloadStatus() : 0;
            float downloadPercent = p5 != null ? p5.getDownloadPercent() : BitmapDescriptorFactory.HUE_RED;
            String encryptSalt = p5 != null ? p5.getEncryptSalt() : null;
            Object[] objArr2 = {Integer.valueOf(p5 != null ? p5.getDownloadVersion() : 0)};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-301147001);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (AndroidCharacter.getMirror('0') + 21280), 13711 - TextUtils.getOffsetAfter("", 0), View.resolveSizeAndState(0, 0, 0) + 56, -1874520046, false, "write", new Class[]{Integer.TYPE});
            }
            Object[] objArr3 = {mediaId3, p2, ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr2), cloneandclear, objInvoke, psshData, thumbnailUrl, Float.valueOf(aspectRatio), Integer.valueOf(downloadStatus), Float.valueOf(downloadPercent), encryptSalt};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1675538266);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (10850 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12541, Color.green(0) + 41, 496462799, false, null, new Class[]{String.class, String.class, (Class) startForeground.IconCompatParcelizer((char) (AndroidCharacter.getMirror('0') - '0'), 13516 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), Color.green(0) + 25), cloneAndClear.class, String.class, String.class, String.class, Float.TYPE, Integer.TYPE, Float.TYPE, String.class});
            }
            return ((Constructor) objRemoteActionCompatParcelizer4).newInstance(objArr3);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object AudioAttributesCompatParcelizer$35aeb77a(VideoPlaybackConfiguration videoPlaybackConfiguration) throws Throwable {
        toMagicModuleMetaRepoModel.write(videoPlaybackConfiguration, "");
        try {
            Object[] objArr = {Integer.valueOf(videoPlaybackConfiguration.getBufferMultiplier()), Boolean.valueOf(videoPlaybackConfiguration.isParallelDecodingRequired()), Boolean.valueOf(videoPlaybackConfiguration.getEnableDecoderFallback())};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1510077378);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (30733 - TextUtils.indexOf("", "", 0, 0)), 14229 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 28, -608712533, false, null, new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE});
            }
            return ((Constructor) objRemoteActionCompatParcelizer).newInstance(objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object AudioAttributesCompatParcelizer$3508f4ea(String p0, VideoBookmarkTimeline p1) throws Throwable {
        toMagicModuleMetaRepoModel.write(p0, "");
        try {
            Object[] objArr = {p0, Long.valueOf(onKeyDown.read(p1 != null ? Long.valueOf(p1.getStartTimeMs()) : null)), Long.valueOf(p1 != null ? p1.getEndTimeMs() : Long.MIN_VALUE), Boolean.valueOf(p1 != null)};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(2136239581);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 12582 - (ViewConfiguration.getJumpTapTimeout() >> 16), 51 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 18721096, false, null, new Class[]{String.class, Long.TYPE, Long.TYPE, Boolean.TYPE});
            }
            return ((Constructor) objRemoteActionCompatParcelizer).newInstance(objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
