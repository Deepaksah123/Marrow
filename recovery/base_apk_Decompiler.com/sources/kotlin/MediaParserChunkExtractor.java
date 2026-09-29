package kotlin;

import com.google.android.exoplayer2.C;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.data.models.video.ThemeState;
import com.marrow.data.models.video.VideoAnalyticFinalSession;
import com.marrow.data.models.video.VideoAnalyticInterimSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 W2\u00020\u0001:\u0001WB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016J,\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0012H\u0016J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J \u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J(\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u001eH\u0016J(\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020#H\u0016J\u0010\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\fH\u0016J\b\u0010-\u001a\u00020\fH\u0016J\u0018\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020#2\u0006\u00100\u001a\u00020\u0012H\u0016J\u0010\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u001eH\u0016J\u0010\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\fH\u0002J\b\u00108\u001a\u00020\u0007H\u0016J8\u00109\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\f2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020#2\u0006\u0010=\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0016J\b\u0010@\u001a\u00020\u0007H\u0016J\b\u0010A\u001a\u00020\u0007H\u0016J\b\u0010B\u001a\u00020\u0007H\u0016J\u0010\u0010C\u001a\u00020\u00072\u0006\u0010D\u001a\u00020#H\u0016J\b\u0010E\u001a\u00020\u0007H\u0016J\b\u0010F\u001a\u00020\u0007H\u0016J\u0018\u0010G\u001a\u00020\u00072\u0006\u0010H\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u001eH\u0016J\u0010\u0010I\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u0012H\u0016J\u0010\u0010K\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\u0012H\u0016J\u0010\u0010M\u001a\u00020\u00072\u0006\u0010N\u001a\u00020\fH\u0016J\u0012\u0010O\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J4\u0010P\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020\f2\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0Rj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f`SH\u0016J\u0010\u0010T\u001a\u00020\u00072\u0006\u0010U\u001a\u00020\fH\u0016J\b\u0010V\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006X"}, d2 = {"Lcom/marrow/data/dataprovider/video/analytics/VideoAnalyticSessionManager;", "Lcom/marrow/data/dataprovider/video/analytics/IVideoAnalyticSessionManager;", "analyticPublishProvider", "Lcom/marrow/data/dataprovider/video/analytics/IVideoAnalyticPublisher;", "<init>", "(Lcom/marrow/data/dataprovider/video/analytics/IVideoAnalyticPublisher;)V", "logError", "", "e", "", "map", "", "", "errorType", "Lcom/marrow/data/dataprovider/video/analytics/VideoErrorType;", "session", "Lcom/marrow/data/models/video/VideoAnalyticInterimSession;", "lastKnownPlaybackTimeMs", "", "lastPauseTimeMs", "setPlaybackTheme", CourseConfigKeyConstantsKt.KEY_THEME, "Lcom/marrow/data/models/video/ThemeState;", "onAudioUnderrun", "durationMs", "onFramesDropped", "frameDropCount", "onRotationChanged", "soFarPlayedDurationMs", "prevOrientationIsPortrait", "", "currOrientationIsPortrait", "onNetworkChanged", "changeTimeMs", "networkType", "", "playBackDurationMs", "isPortrait", "onCdnSwitch", "lessonId", "videoId", "videoUrl", "selectedUrlIndex", "onDecoderInitialized", "name", "getSessionDecoderName", "onResolutionChanged", "resolution", "minBitRateRequired", "onPipModeChanged", "isPip", "onSpeedChanged", "speed", "", "logd", "msg", "onPlayReleased", "onPrepareStarted", "playbackType", "Lcom/marrow/data/annotations/PlaybackType;", "wvAudioLevel", "wvVideoLevel", "widevineMode", "Lcom/marrow/video/components/drm/models/SecurityLevel;", "onPrepareFailed", "onLicenseCallRequested", "onLicenseGenerated", "onPlayStarted", "encryptedPlaybackVersion", "onSeeked", "onPauseTouch", "onPlayPaused", "playDurationMs", "onReBufferCompleted", "bufferDurationMs", "onPlayProgressed", "currentPlaybackTimeMs", "onConfigurationSet", "pbConfiguration", "push", "logRecord", "eventName", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "setPlaybackSessionId", "pbSessionId", "getSessionId", "Companion", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MediaParserChunkExtractor implements maybeExpandData {
    public static final read write = new read(null);
    private final InitializationChunk AudioAttributesCompatParcelizer;
    private long IconCompatParcelizer;
    private VideoAnalyticInterimSession RemoteActionCompatParcelizer;
    private long read;

    @setSdkPayload
    public MediaParserChunkExtractor(InitializationChunk initializationChunk) {
        toMagicModuleMetaRepoModel.write(initializationChunk, "");
        this.AudioAttributesCompatParcelizer = initializationChunk;
    }

    @Override // kotlin.maybeExpandData
    public final void IconCompatParcelizer(Throwable th, Map<String, String> map) {
        toMagicModuleMetaRepoModel.write(th, "");
        toMagicModuleMetaRepoModel.write(map, "");
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(th, map, getChunkStartTimeUs.write);
    }

    @Override // kotlin.maybeExpandData
    public final void RemoteActionCompatParcelizer(getChunkStartTimeUs getchunkstarttimeus, Throwable th, Map<String, String> map) {
        toMagicModuleMetaRepoModel.write(getchunkstarttimeus, "");
        toMagicModuleMetaRepoModel.write(th, "");
        toMagicModuleMetaRepoModel.write(map, "");
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(th, map, getchunkstarttimeus);
    }

    @Override // kotlin.maybeExpandData
    public final void RemoteActionCompatParcelizer(ThemeState themeState) {
        toMagicModuleMetaRepoModel.write(themeState, "");
        VideoAnalyticInterimSession videoAnalyticInterimSession = this.RemoteActionCompatParcelizer;
        if (videoAnalyticInterimSession != null) {
            videoAnalyticInterimSession.setTheme(themeState.getTheme());
        }
    }

    @Override // kotlin.maybeExpandData
    public final void IconCompatParcelizer(long j) {
        VideoAnalyticInterimSession videoAnalyticInterimSession = this.RemoteActionCompatParcelizer;
        if (videoAnalyticInterimSession != null) {
            videoAnalyticInterimSession.setAudioUnderrunDurationMs(videoAnalyticInterimSession.getAudioUnderrunDurationMs() + j);
            videoAnalyticInterimSession.getAudioUnderrunDurationMs();
        }
    }

    @Override // kotlin.maybeExpandData
    public final void AudioAttributesCompatParcelizer(long j) {
        VideoAnalyticInterimSession videoAnalyticInterimSession = this.RemoteActionCompatParcelizer;
        if (videoAnalyticInterimSession != null) {
            videoAnalyticInterimSession.setTotalFramesDropped(videoAnalyticInterimSession.getTotalFramesDropped() + j);
        }
    }

    @Override // kotlin.maybeExpandData
    public final void AudioAttributesCompatParcelizer(long j, boolean z) {
        VideoAnalyticInterimSession videoAnalyticInterimSession = this.RemoteActionCompatParcelizer;
        if (videoAnalyticInterimSession != null) {
            videoAnalyticInterimSession.setTotalDurationMs(videoAnalyticInterimSession.getTotalDurationMs() + j);
            videoAnalyticInterimSession.setPortraitDurationMs(videoAnalyticInterimSession.getPortraitDurationMs() + (z ? j : 0L));
            long landscapeDurationMs = videoAnalyticInterimSession.getLandscapeDurationMs();
            if (z) {
                j = 0;
            }
            videoAnalyticInterimSession.setLandscapeDurationMs(landscapeDurationMs + j);
        }
    }

    @Override // kotlin.maybeExpandData
    public final void read(long j, int i, long j2, boolean z) {
        VideoAnalyticInterimSession videoAnalyticInterimSession = this.RemoteActionCompatParcelizer;
        if (videoAnalyticInterimSession != null) {
            videoAnalyticInterimSession.setTotalDurationMs(videoAnalyticInterimSession.getTotalDurationMs() + j2);
            videoAnalyticInterimSession.setPortraitDurationMs(videoAnalyticInterimSession.getPortraitDurationMs() + (z ? j2 : 0L));
            long landscapeDurationMs = videoAnalyticInterimSession.getLandscapeDurationMs();
            if (z) {
                j2 = 0;
            }
            videoAnalyticInterimSession.setLandscapeDurationMs(landscapeDurationMs + j2);
            videoAnalyticInterimSession.getTotalDurationMs();
            if (videoAnalyticInterimSession.getNetworkType() == i || videoAnalyticInterimSession.getPlaybackType() != cloneAndClear.AudioAttributesCompatParcelizer) {
                return;
            }
            write(videoAnalyticInterimSession);
            videoAnalyticInterimSession.reset();
            videoAnalyticInterimSession.setSessionId(j);
            videoAnalyticInterimSession.setNetworkChanged(true);
            videoAnalyticInterimSession.setNetworkType(i);
        }
    }

    @Override // kotlin.maybeExpandData
    public final void write(String str, String str2, String str3, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        VideoAnalyticInterimSession videoAnalyticInterimSession = this.RemoteActionCompatParcelizer;
        if (videoAnalyticInterimSession != null) {
            videoAnalyticInterimSession.setLessonId(str);
            videoAnalyticInterimSession.setVideoId(str2);
            videoAnalyticInterimSession.setSelectedUrlIndex(i);
            write(videoAnalyticInterimSession);
        }
    }

    @Override // kotlin.maybeExpandData
    public final void RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        VideoAnalyticInterimSession videoAnalyticInterimSession = this.RemoteActionCompatParcelizer;
        if (videoAnalyticInterimSession != null) {
            videoAnalyticInterimSession.setDecoderName(str);
        }
    }

    @Override // kotlin.maybeExpandData
    public final String IconCompatParcelizer() {
        String decoderName;
        VideoAnalyticInterimSession videoAnalyticInterimSession = this.RemoteActionCompatParcelizer;
        return (videoAnalyticInterimSession == null || (decoderName = videoAnalyticInterimSession.getDecoderName()) == null) ? "NA" : decoderName;
    }

    @Override // kotlin.maybeExpandData
    public final void IconCompatParcelizer(int i, long j) {
        VideoAnalyticInterimSession videoAnalyticInterimSession = this.RemoteActionCompatParcelizer;
        if (videoAnalyticInterimSession != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (videoAnalyticInterimSession.getResolution() != i) {
                if (videoAnalyticInterimSession.getResolution() > 0) {
                    write(videoAnalyticInterimSession);
                    videoAnalyticInterimSession.setSessionId(jCurrentTimeMillis);
                }
                videoAnalyticInterimSession.reset();
                videoAnalyticInterimSession.setResolution(i);
                videoAnalyticInterimSession.setMinBitRateReq(j);
                this.IconCompatParcelizer = 0L;
            }
        }
    }

    @Override // kotlin.maybeExpandData
    public final void AudioAttributesCompatParcelizer(boolean z) {
        if (z) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        VideoAnalyticInterimSession videoAnalyticInterimSession = this.RemoteActionCompatParcelizer;
        if (videoAnalyticInterimSession != null) {
            write(videoAnalyticInterimSession);
            videoAnalyticInterimSession.reset();
            videoAnalyticInterimSession.setSessionId(jCurrentTimeMillis);
        }
    }

    @Override // kotlin.maybeExpandData
    public final void AudioAttributesCompatParcelizer(float f) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        VideoAnalyticInterimSession videoAnalyticInterimSession = this.RemoteActionCompatParcelizer;
        if (videoAnalyticInterimSession == null || videoAnalyticInterimSession.getSpeed() == f) {
            return;
        }
        write(videoAnalyticInterimSession);
        videoAnalyticInterimSession.reset();
        videoAnalyticInterimSession.setSpeed(f);
        videoAnalyticInterimSession.setSessionId(jCurrentTimeMillis);
        videoAnalyticInterimSession.getSpeed();
    }

    @Override // kotlin.maybeExpandData
    public final void AudioAttributesCompatParcelizer() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        VideoAnalyticInterimSession videoAnalyticInterimSession = this.RemoteActionCompatParcelizer;
        if (videoAnalyticInterimSession != null) {
            write(videoAnalyticInterimSession);
            videoAnalyticInterimSession.reset();
            videoAnalyticInterimSession.setSessionId(jCurrentTimeMillis);
        }
        this.RemoteActionCompatParcelizer = null;
    }

    @Override // kotlin.maybeExpandData
    public final void write$5bdc8345(String str, String str2, cloneAndClear cloneandclear, int i, int i2, Enum r9) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(cloneandclear, "");
        toMagicModuleMetaRepoModel.write(r9, "");
        cloneandclear.getIconCompatParcelizer();
        Objects.toString(r9);
        long jCurrentTimeMillis = System.currentTimeMillis();
        VideoAnalyticInterimSession videoAnalyticInterimSession = new VideoAnalyticInterimSession(jCurrentTimeMillis);
        this.RemoteActionCompatParcelizer = videoAnalyticInterimSession;
        videoAnalyticInterimSession.setVideoId(str2);
        videoAnalyticInterimSession.setLessonId(str);
        videoAnalyticInterimSession.setPlaybackType(cloneandclear);
        videoAnalyticInterimSession.setPrepareTimestampMs(jCurrentTimeMillis);
        videoAnalyticInterimSession.setWvAudioLevel(i);
        videoAnalyticInterimSession.setWvVideoLevel(i2);
        videoAnalyticInterimSession.setWidevineMode$26433acb(r9);
    }

    @Override // kotlin.maybeExpandData
    public final void AudioAttributesImplBaseParcelizer() {
        this.RemoteActionCompatParcelizer = null;
    }

    @Override // kotlin.maybeExpandData
    public final void write() {
        VideoAnalyticInterimSession videoAnalyticInterimSession = this.RemoteActionCompatParcelizer;
        if (videoAnalyticInterimSession != null) {
            videoAnalyticInterimSession.setLicensingResponseTimestampMs(System.currentTimeMillis());
        }
        VideoAnalyticInterimSession videoAnalyticInterimSession2 = this.RemoteActionCompatParcelizer;
        Objects.toString(videoAnalyticInterimSession2 != null ? Long.valueOf(videoAnalyticInterimSession2.getLicensingResponseTimestampMs()) : null);
    }

    @Override // kotlin.maybeExpandData
    public final void read(int i) {
        VideoAnalyticInterimSession videoAnalyticInterimSession = this.RemoteActionCompatParcelizer;
        if (videoAnalyticInterimSession != null) {
            videoAnalyticInterimSession.setFirstFrameRenderedTimestampMs(System.currentTimeMillis());
            videoAnalyticInterimSession.setEncryptedPlaybackVersion(i);
            videoAnalyticInterimSession.getFirstFrameRenderedTimestampMs();
            videoAnalyticInterimSession.getLicensingResponseTimestampMs();
        }
    }

    @Override // kotlin.maybeExpandData
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        VideoAnalyticInterimSession videoAnalyticInterimSession = this.RemoteActionCompatParcelizer;
        if (videoAnalyticInterimSession != null) {
            videoAnalyticInterimSession.setSeekCount(videoAnalyticInterimSession.getSeekCount() + 1);
        }
    }

    @Override // kotlin.maybeExpandData
    public final void RemoteActionCompatParcelizer() {
        VideoAnalyticInterimSession videoAnalyticInterimSession = this.RemoteActionCompatParcelizer;
        if (videoAnalyticInterimSession != null) {
            videoAnalyticInterimSession.setPauseTouchCount(videoAnalyticInterimSession.getPauseTouchCount() + 1);
        }
    }

    @Override // kotlin.maybeExpandData
    public final void RemoteActionCompatParcelizer(long j, boolean z) {
        this.IconCompatParcelizer = System.currentTimeMillis();
        VideoAnalyticInterimSession videoAnalyticInterimSession = this.RemoteActionCompatParcelizer;
        if (videoAnalyticInterimSession != null) {
            videoAnalyticInterimSession.setTotalDurationMs(videoAnalyticInterimSession.getTotalDurationMs() + j);
            videoAnalyticInterimSession.setPortraitDurationMs(videoAnalyticInterimSession.getPortraitDurationMs() + (z ? j : 0L));
            long landscapeDurationMs = videoAnalyticInterimSession.getLandscapeDurationMs();
            if (z) {
                j = 0;
            }
            videoAnalyticInterimSession.setLandscapeDurationMs(landscapeDurationMs + j);
            videoAnalyticInterimSession.setPauseCount(videoAnalyticInterimSession.getPauseCount() + 1);
        }
    }

    @Override // kotlin.maybeExpandData
    public final void read(long j) {
        VideoAnalyticInterimSession videoAnalyticInterimSession;
        if (j <= C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS || (videoAnalyticInterimSession = this.RemoteActionCompatParcelizer) == null) {
            return;
        }
        videoAnalyticInterimSession.setReBufferDurationMs(videoAnalyticInterimSession.getReBufferDurationMs() + j);
        videoAnalyticInterimSession.setReBufferCount(videoAnalyticInterimSession.getReBufferCount() + 1);
    }

    @Override // kotlin.maybeExpandData
    public final void RemoteActionCompatParcelizer(long j) {
        long jAbs = Math.abs(this.read - j);
        if (this.read <= 0 || jAbs >= C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
            this.read = j;
            this.IconCompatParcelizer = 0L;
        }
    }

    @Override // kotlin.maybeExpandData
    public final void write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        VideoAnalyticInterimSession videoAnalyticInterimSession = this.RemoteActionCompatParcelizer;
        if (videoAnalyticInterimSession != null) {
            videoAnalyticInterimSession.setPbConfig(str);
        }
    }

    private final void write(VideoAnalyticInterimSession videoAnalyticInterimSession) {
        if (videoAnalyticInterimSession != null && videoAnalyticInterimSession.getTotalDurationMs() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long totalDurationMs = videoAnalyticInterimSession.getTotalDurationMs() - (jCurrentTimeMillis - videoAnalyticInterimSession.getSessionId());
            long j = this.IconCompatParcelizer;
            if (j > 0) {
                jCurrentTimeMillis = Math.min(j, jCurrentTimeMillis);
            }
            new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date(videoAnalyticInterimSession.getSessionId()));
            new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date(jCurrentTimeMillis));
            videoAnalyticInterimSession.getResolution();
            videoAnalyticInterimSession.getSpeed();
            videoAnalyticInterimSession.getTotalDurationMs();
            if (totalDurationMs > 0) {
                StringBuilder sb = new StringBuilder(" | Diff:");
                sb.append(totalDurationMs);
                sb.append(" WARN");
                sb.toString();
            }
            String lessonId = videoAnalyticInterimSession.getLessonId();
            long sessionId = videoAnalyticInterimSession.getSessionId();
            long rootSessionId = videoAnalyticInterimSession.getRootSessionId();
            String videoId = videoAnalyticInterimSession.getVideoId();
            int resolution = videoAnalyticInterimSession.getResolution();
            float speed = videoAnalyticInterimSession.getSpeed();
            String region = videoAnalyticInterimSession.getRegion();
            String decoderName = videoAnalyticInterimSession.getDecoderName();
            long jMax = Math.max(videoAnalyticInterimSession.getFirstFrameRenderedTimestampMs() - videoAnalyticInterimSession.getLicensingResponseTimestampMs(), 0L);
            long jMax2 = Math.max(videoAnalyticInterimSession.getFirstFrameRenderedTimestampMs() - videoAnalyticInterimSession.getPrepareTimestampMs(), 0L);
            boolean isNetworkChanged = videoAnalyticInterimSession.getIsNetworkChanged();
            boolean z = videoAnalyticInterimSession.getReBufferDurationMs() > C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
            long reBufferDurationMs = videoAnalyticInterimSession.getReBufferDurationMs();
            int reBufferCount = videoAnalyticInterimSession.getReBufferCount();
            long totalDurationMs2 = videoAnalyticInterimSession.getTotalDurationMs();
            long landscapeDurationMs = videoAnalyticInterimSession.getLandscapeDurationMs();
            long minBitRateReq = videoAnalyticInterimSession.getMinBitRateReq();
            cloneAndClear playbackType = videoAnalyticInterimSession.getPlaybackType();
            int encryptedPlaybackVersion = videoAnalyticInterimSession.getEncryptedPlaybackVersion();
            long j2 = jCurrentTimeMillis;
            VideoAnalyticFinalSession videoAnalyticFinalSession = new VideoAnalyticFinalSession(lessonId, sessionId, rootSessionId, videoId, resolution, speed, region, jMax, jMax2, decoderName, isNetworkChanged, z, reBufferDurationMs, reBufferCount, j2, totalDurationMs2, landscapeDurationMs, minBitRateReq, videoAnalyticInterimSession.getIsInternetConnected(), playbackType, encryptedPlaybackVersion, videoAnalyticInterimSession.getTotalFramesDropped(), videoAnalyticInterimSession.getAudioUnderrunDurationMs(), 0, videoAnalyticInterimSession.getPbConfig(), Math.max(videoAnalyticInterimSession.getPauseCount() - 1, 0), Math.max(videoAnalyticInterimSession.getPauseTouchCount() - 1, 0), videoAnalyticInterimSession.getSeekCount(), videoAnalyticInterimSession.getWvAudioLevel(), videoAnalyticInterimSession.getWvVideoLevel(), videoAnalyticInterimSession.getWidevineMode(), videoAnalyticInterimSession.getPbSessionId(), videoAnalyticInterimSession.getTheme(), 8388608, 0, null);
            videoAnalyticInterimSession.getSeekCount();
            videoAnalyticInterimSession.getPauseCount();
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(videoAnalyticFinalSession);
        }
        this.read = 0L;
        this.IconCompatParcelizer = 0L;
    }

    @Override // kotlin.maybeExpandData
    public final void AudioAttributesCompatParcelizer(String str, HashMap<String, String> map) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(map, "");
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(str, map);
    }

    @Override // kotlin.maybeExpandData
    public final void IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        VideoAnalyticInterimSession videoAnalyticInterimSession = this.RemoteActionCompatParcelizer;
        if (videoAnalyticInterimSession != null) {
            videoAnalyticInterimSession.setPbSessionId(str);
        }
    }

    @Override // kotlin.maybeExpandData
    public final long read() {
        VideoAnalyticInterimSession videoAnalyticInterimSession = this.RemoteActionCompatParcelizer;
        if (videoAnalyticInterimSession != null) {
            return videoAnalyticInterimSession.getSessionId();
        }
        return 0L;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/MediaParserChunkExtractor$read;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
