package com.marrow2.core.di;

import android.app.Application;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.common.ApplicationData;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.RtspHeadersBuilder;
import kotlin.SubtitleViewOutput;
import kotlin.TopUserCompanion;
import kotlin.TrackSelectionViewTrackInfo;
import kotlin.getContentDataSource;
import kotlin.getDataSchemeDataSource;
import kotlin.getPlanOldPrice;
import kotlin.getSampleFormats;
import kotlin.getUserCaptionFontScale;
import kotlin.isSeekPending;
import kotlin.setMinBytesTransferred;
import kotlin.setUriPositionOffset;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.unlockFolder;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/marrow2/core/di/AppModule;", "", "Lo/getUserCaptionFontScale;", "p0", "Lo/SubtitleViewOutput;", "IconCompatParcelizer", "(Lo/getUserCaptionFontScale;)Lo/SubtitleViewOutput;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AppModule {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.RemoteActionCompatParcelizer;

    SubtitleViewOutput IconCompatParcelizer(getUserCaptionFontScale p0);

    /* JADX INFO: renamed from: com.marrow2.core.di.AppModule$IconCompatParcelizer, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion RemoteActionCompatParcelizer = new Companion();

        private Companion() {
        }

        public final isSeekPending IconCompatParcelizer() {
            return RtspHeadersBuilder.IconCompatParcelizer();
        }

        public final TrackSelectionViewTrackInfo write(Application application, unlockFolder unlockfolder, ApplicationData applicationData, TopUserCompanion topUserCompanion, setMinBytesTransferred setminbytestransferred) {
            toMagicModuleMetaRepoModel.write(application, "");
            toMagicModuleMetaRepoModel.write(unlockfolder, "");
            toMagicModuleMetaRepoModel.write(applicationData, "");
            toMagicModuleMetaRepoModel.write(topUserCompanion, "");
            toMagicModuleMetaRepoModel.write(setminbytestransferred, "");
            return new TrackSelectionViewTrackInfo(application, unlockfolder, applicationData, topUserCompanion, setminbytestransferred);
        }

        @getPlanOldPrice
        public final setUriPositionOffset IconCompatParcelizer(Application application) {
            toMagicModuleMetaRepoModel.write(application, "");
            return new setUriPositionOffset(application);
        }

        @getPlanOldPrice
        public final getContentDataSource write$4bf7b70e(Application application, Object obj) {
            toMagicModuleMetaRepoModel.write(application, "");
            toMagicModuleMetaRepoModel.write(obj, "");
            return new getDataSchemeDataSource(application, obj);
        }

        @getPlanOldPrice
        public final Object RemoteActionCompatParcelizer$2d05593c(Application application, ApplicationData applicationData) throws Throwable {
            toMagicModuleMetaRepoModel.write(application, "");
            toMagicModuleMetaRepoModel.write(applicationData, "");
            try {
                Object[] objArr = {application, applicationData};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1843430535);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 19349 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.getCapsMode("", 0, 0) + 19, 329859090, false, null, new Class[]{Application.class, ApplicationData.class});
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

        @getPlanOldPrice
        public final Object write$134b6e9d(Application application, ApplicationData applicationData, getSampleFormats getsampleformats) throws Throwable {
            toMagicModuleMetaRepoModel.write(application, "");
            toMagicModuleMetaRepoModel.write(applicationData, "");
            toMagicModuleMetaRepoModel.write(getsampleformats, "");
            try {
                Object[] objArr = {application, applicationData, getsampleformats};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1720645611);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) View.resolveSize(0, 0), 19944 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 70 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -415708032, false, null, new Class[]{Application.class, ApplicationData.class, getSampleFormats.class});
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

        @getPlanOldPrice
        public final Object read$15f26167(Application application, ApplicationData applicationData, getSampleFormats getsampleformats) throws Throwable {
            toMagicModuleMetaRepoModel.write(application, "");
            toMagicModuleMetaRepoModel.write(applicationData, "");
            toMagicModuleMetaRepoModel.write(getsampleformats, "");
            try {
                Object[] objArr = {application, applicationData, getsampleformats};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-827685437);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 19493, 16 - TextUtils.indexOf("", "", 0, 0), -1327283882, false, null, new Class[]{Application.class, ApplicationData.class, getSampleFormats.class});
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

        @getPlanOldPrice
        public final Object RemoteActionCompatParcelizer$65a33354(Application application, ApplicationData applicationData, getSampleFormats getsampleformats) throws Throwable {
            toMagicModuleMetaRepoModel.write(application, "");
            toMagicModuleMetaRepoModel.write(applicationData, "");
            toMagicModuleMetaRepoModel.write(getsampleformats, "");
            try {
                Object[] objArr = {application, applicationData, getsampleformats};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(2027788568);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (52129 - TextUtils.getTrimmedLength("")), 19716 - (ViewConfiguration.getEdgeSlop() >> 16), Drawable.resolveOpacity(0, 0) + 21, 110386573, false, null, new Class[]{Application.class, ApplicationData.class, getSampleFormats.class});
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

        @getPlanOldPrice
        public final Object AudioAttributesCompatParcelizer$19af4a00(Application application, ApplicationData applicationData, getSampleFormats getsampleformats) throws Throwable {
            toMagicModuleMetaRepoModel.write(application, "");
            toMagicModuleMetaRepoModel.write(applicationData, "");
            toMagicModuleMetaRepoModel.write(getsampleformats, "");
            try {
                Object[] objArr = {application, applicationData, getsampleformats};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-814502049);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getPressedStateDuration() >> 16), 19368 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 18, -1321571382, false, null, new Class[]{Application.class, ApplicationData.class, getSampleFormats.class});
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

        @getPlanOldPrice
        public final Object read$296aae3f(Application application, getSampleFormats getsampleformats) throws Throwable {
            toMagicModuleMetaRepoModel.write(application, "");
            toMagicModuleMetaRepoModel.write(getsampleformats, "");
            try {
                Object[] objArr = {application, getsampleformats};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1980014144);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 18390), 19883 - (ViewConfiguration.getFadingEdgeLength() >> 16), 29 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 139287253, false, null, new Class[]{Application.class, getSampleFormats.class});
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

        @getPlanOldPrice
        public final Object AudioAttributesCompatParcelizer$e1f3d83(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) throws Throwable {
            toMagicModuleMetaRepoModel.write(obj, "");
            toMagicModuleMetaRepoModel.write(obj2, "");
            toMagicModuleMetaRepoModel.write(obj3, "");
            toMagicModuleMetaRepoModel.write(obj4, "");
            toMagicModuleMetaRepoModel.write(obj5, "");
            toMagicModuleMetaRepoModel.write(obj6, "");
            try {
                Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2041696029);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 19477, View.resolveSizeAndState(0, 0, 0) + 16, -133696394, false, null, new Class[]{(Class) startForeground.IconCompatParcelizer((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), TextUtils.getCapsMode("", 0, 0) + 8719, (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 28), (Class) startForeground.IconCompatParcelizer((char) (ImageFormat.getBitsPerPixel(0) + 11782), 8677 - KeyEvent.keyCodeFromString(""), TextUtils.indexOf("", "", 0, 0) + 14), (Class) startForeground.IconCompatParcelizer((char) TextUtils.getOffsetAfter("", 0), 8655 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23), (Class) startForeground.IconCompatParcelizer((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 8581 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getJumpTapTimeout() >> 16) + 31), (Class) startForeground.IconCompatParcelizer((char) Color.blue(0), 8691 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 28), (Class) startForeground.IconCompatParcelizer((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 3615), 11375 - Gravity.getAbsoluteGravity(0, 0), TextUtils.indexOf("", "") + 9)});
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
}
