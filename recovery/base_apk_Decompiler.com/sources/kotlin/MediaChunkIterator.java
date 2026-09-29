package kotlin;

import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow.data.models.video.DownloadAnalyticEvent;
import com.marrow.data.models.video.VideoAnalyticFinalSession;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaChunkIterator implements InitializationChunk {
    private final String AudioAttributesCompatParcelizer;
    private final FirebaseAnalytics RemoteActionCompatParcelizer;
    private final getStreamPositionUsForContent write;

    /* JADX INFO: loaded from: classes5.dex */
    public static final /* synthetic */ class write {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[getChunkStartTimeUs.values().length];
            try {
                iArr[getChunkStartTimeUs.read.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getChunkStartTimeUs.write.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getChunkStartTimeUs.AudioAttributesCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            write = iArr;
        }
    }

    @setSdkPayload
    public MediaChunkIterator(@setGateway(IconCompatParcelizer = "device_id") String str, getStreamPositionUsForContent getstreampositionusforcontent, FirebaseAnalytics firebaseAnalytics) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        toMagicModuleMetaRepoModel.write(firebaseAnalytics, "");
        this.AudioAttributesCompatParcelizer = str;
        this.write = getstreampositionusforcontent;
        this.RemoteActionCompatParcelizer = firebaseAnalytics;
    }

    @Override // kotlin.InitializationChunk
    public final void AudioAttributesCompatParcelizer(Throwable th, Map<String, String> map, getChunkStartTimeUs getchunkstarttimeus) {
        String str;
        toMagicModuleMetaRepoModel.write(th, "");
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(getchunkstarttimeus, "");
        Bundle bundle = new Bundle();
        for (Map.Entry entry : VideoTimelineResponseBody.AudioAttributesCompatParcelizer(map).entrySet()) {
            String str2 = (String) entry.getKey();
            String strSubstring = (String) entry.getValue();
            if (strSubstring == null) {
                strSubstring = "NA";
            }
            if (strSubstring.length() > 100) {
                strSubstring = strSubstring.substring(0, 100);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
            }
            bundle.putString(str2, strSubstring);
        }
        int i = write.write[getchunkstarttimeus.ordinal()];
        if (i == 1) {
            str = "user_video_error";
        } else if (i == 2) {
            str = "video_error_2";
        } else {
            if (i != 3) {
                throw new RenewEligibleCreator();
            }
            str = "download_error";
        }
        read(str, bundle);
    }

    @Override // kotlin.InitializationChunk
    public final void IconCompatParcelizer(VideoAnalyticFinalSession videoAnalyticFinalSession) throws Throwable {
        toMagicModuleMetaRepoModel.write(videoAnalyticFinalSession, "");
        String strAudioAttributesImplBaseParcelizer = this.write.AudioAttributesImplBaseParcelizer();
        String videoId = videoAnalyticFinalSession.getVideoId();
        long rootSessionId = videoAnalyticFinalSession.getRootSessionId();
        StringBuilder sb = new StringBuilder();
        sb.append(strAudioAttributesImplBaseParcelizer);
        sb.append("_");
        sb.append(videoId);
        sb.append("_");
        sb.append(rootSessionId);
        String string = sb.toString();
        int speed = (int) (videoAnalyticFinalSession.getSpeed() * 100.0f);
        int resolution = videoAnalyticFinalSession.getResolution();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(resolution);
        sb2.append("_");
        sb2.append(speed);
        String string2 = sb2.toString();
        Bundle bundle = new Bundle();
        bundle.putString("r_s_id", string);
        bundle.putString("v_id", videoAnalyticFinalSession.getVideoId());
        bundle.putString("l_id", videoAnalyticFinalSession.getLessonId());
        bundle.putString("res_speed", string2);
        bundle.putString("d_id", this.AudioAttributesCompatParcelizer);
        bundle.putInt("pause", videoAnalyticFinalSession.getPauseCount());
        bundle.putInt("ui_pause", videoAnalyticFinalSession.getPauseTouchCount());
        bundle.putInt("seek", videoAnalyticFinalSession.getSeekCount());
        bundle.putBoolean("is_net_chng", videoAnalyticFinalSession.isNetworkChanged());
        bundle.putLong("rebuf_d_ms", videoAnalyticFinalSession.getReBufferDurationMs());
        bundle.putLong("fbuf_d_ms", videoAnalyticFinalSession.getFirstBufferDurationMs());
        bundle.putLong("pb_d_ms", videoAnalyticFinalSession.getPlaybackDurationMs());
        bundle.putLong("land_d_ms", videoAnalyticFinalSession.getLandscapeDurationMs());
        bundle.putLong("end_ms", videoAnalyticFinalSession.getEndTimeMs());
        bundle.putLong("st_ms", videoAnalyticFinalSession.getSessionId());
        bundle.putInt("pb_typ", videoAnalyticFinalSession.getPlaybackType().getIconCompatParcelizer());
        bundle.putLong("v_fdrop", videoAnalyticFinalSession.getTotalFramesDropped());
        bundle.putLong("a_urun", videoAnalyticFinalSession.getAudioUnderrunDurationMs());
        String pbConfig = videoAnalyticFinalSession.getPbConfig();
        int encryptedPlaybackVersion = videoAnalyticFinalSession.getEncryptedPlaybackVersion();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(pbConfig);
        sb3.append("__");
        sb3.append(encryptedPlaybackVersion);
        bundle.putString("p_cnf", sb3.toString());
        bundle.putInt(FilterParams.KEY_COURSE_ID, this.write.onRemoveQueueItem());
        int wvAudioLevel = videoAnalyticFinalSession.getWvAudioLevel();
        int wvVideoLevel = videoAnalyticFinalSession.getWvVideoLevel();
        Enum widevineMode$5e726e45 = videoAnalyticFinalSession.getWidevineMode$5e726e45();
        try {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-882924932);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (61116 - (Process.myPid() >> 22)), 11734 - (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.getCapsMode("", 0, 0) + 23, -1256823063, false, "AudioAttributesCompatParcelizer", new Class[0]);
            }
            String str = (String) ((Method) objRemoteActionCompatParcelizer).invoke(widevineMode$5e726e45, null);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(wvAudioLevel);
            sb4.append("_");
            sb4.append(wvVideoLevel);
            sb4.append("_");
            sb4.append(str);
            bundle.putString("wv_lvl_a_v_l", sb4.toString());
            bundle.putString(CourseConfigKeyConstantsKt.KEY_THEME, videoAnalyticFinalSession.getTheme());
            bundle.putString("pb_sid", videoAnalyticFinalSession.getPbSessionId());
            bundle.putString("decoder", videoAnalyticFinalSession.getDecoderName());
            read("video_analytics_".concat(String.valueOf(videoAnalyticFinalSession.getVersion())), bundle);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // kotlin.InitializationChunk
    public final void read(DownloadAnalyticEvent downloadAnalyticEvent) {
        toMagicModuleMetaRepoModel.write(downloadAnalyticEvent, "");
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : downloadAnalyticEvent.getMap().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String str = value;
            if (str == null || str.length() == 0) {
                value = "NA";
            }
            bundle.putString(key, value);
        }
        bundle.putString("d_state", String.valueOf(downloadAnalyticEvent.getState()));
        downloadAnalyticEvent.getState();
        read("download_analytics_2", bundle);
    }

    @Override // kotlin.InitializationChunk
    public final void AudioAttributesCompatParcelizer(String str, Map<String, String> map) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(map, "");
        Bundle bundle = new Bundle();
        for (String str2 : map.keySet()) {
            bundle.putString(str2, map.get(str2));
        }
        read(str, bundle);
    }

    private final void read(String str, Bundle bundle) {
        this.RemoteActionCompatParcelizer.logEvent(str, bundle);
        resumeLoad resumeload = resumeLoad.IconCompatParcelizer;
        RtspMediaPeriodSampleStreamImpl.write(str);
    }
}
