package com.marrow.data.models.video;

import android.media.AudioTrack;
import android.os.Process;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.cloneAndClear;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\u0010\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0005R\"\u0010\u000e\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u0005R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010&\u001a\u00020\u00188\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001a\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR\"\u0010*\u001a\u00020)8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.R\"\u0010/\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010\n\u001a\u0004\b0\u0010\f\"\u0004\b1\u0010\u0005R\"\u00102\u001a\u00020\u00188\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010\u001a\u001a\u0004\b3\u0010\u001c\"\u0004\b4\u0010\u001eR$\u00105\u001a\u0004\u0018\u00010\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0013\u001a\u0004\b6\u0010\u0015\"\u0004\b7\u0010\u0017R$\u00108\u001a\u0004\u0018\u00010\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u0010\u0013\u001a\u0004\b9\u0010\u0015\"\u0004\b:\u0010\u0017R\"\u0010;\u001a\u00020\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u0010\u0013\u001a\u0004\b<\u0010\u0015\"\u0004\b=\u0010\u0017R\"\u0010>\u001a\u00020)8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b>\u0010+\u001a\u0004\b>\u0010,\"\u0004\b?\u0010.R\"\u0010@\u001a\u00020\u00188\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u0010\u001a\u001a\u0004\bA\u0010\u001c\"\u0004\bB\u0010\u001eR\"\u0010D\u001a\u00020C8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010J\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bJ\u0010\n\u001a\u0004\bK\u0010\f\"\u0004\bL\u0010\u0005R\"\u0010M\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bM\u0010\n\u001a\u0004\bN\u0010\f\"\u0004\bO\u0010\u0005R\"\u0010P\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bP\u0010\n\u001a\u0004\bQ\u0010\f\"\u0004\bR\u0010\u0005R\"\u0010S\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bS\u0010\n\u001a\u0004\bT\u0010\f\"\u0004\bU\u0010\u0005R\"\u0010V\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bV\u0010\n\u001a\u0004\bW\u0010\f\"\u0004\bX\u0010\u0005R\"\u0010Y\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bY\u0010\n\u001a\u0004\bZ\u0010\f\"\u0004\b[\u0010\u0005R\"\u0010\\\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\\\u0010\n\u001a\u0004\b]\u0010\f\"\u0004\b^\u0010\u0005R\"\u0010_\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b_\u0010\n\u001a\u0004\b`\u0010\f\"\u0004\ba\u0010\u0005R\"\u0010b\u001a\u00020\u00188\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bb\u0010\u001a\u001a\u0004\bc\u0010\u001c\"\u0004\bd\u0010\u001eR\"\u0010e\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\be\u0010\n\u001a\u0004\bf\u0010\f\"\u0004\bg\u0010\u0005R\"\u0010h\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bh\u0010\n\u001a\u0004\bi\u0010\f\"\u0004\bj\u0010\u0005R\"\u0010k\u001a\u00020\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bk\u0010\u0013\u001a\u0004\bl\u0010\u0015\"\u0004\bm\u0010\u0017R\"\u0010n\u001a\u00020\u00188\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bn\u0010\u001a\u001a\u0004\bo\u0010\u001c\"\u0004\bp\u0010\u001eR\"\u0010q\u001a\u00020\u00188\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bq\u0010\u001a\u001a\u0004\br\u0010\u001c\"\u0004\bs\u0010\u001eR\"\u0010t\u001a\u00020\u00188\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bt\u0010\u001a\u001a\u0004\bu\u0010\u001c\"\u0004\bv\u0010\u001eR\"\u0010w\u001a\u00020\u00188\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bw\u0010\u001a\u001a\u0004\bx\u0010\u001c\"\u0004\by\u0010\u001eR\"\u0010z\u001a\u00020\u00188\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bz\u0010\u001a\u001a\u0004\b{\u0010\u001c\"\u0004\b|\u0010\u001eR&\u0010~\u001a\u00020}8\u0007@\u0007X\u0087\u000e¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R&\u0010\u0084\u0001\u001a\u00020\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010\u0013\u001a\u0005\b\u0085\u0001\u0010\u0015\"\u0005\b\u0086\u0001\u0010\u0017R&\u0010\u0087\u0001\u001a\u00020\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010\u0013\u001a\u0005\b\u0088\u0001\u0010\u0015\"\u0005\b\u0089\u0001\u0010\u0017"}, d2 = {"Lcom/marrow/data/models/video/VideoAnalyticInterimSession;", "", "", "p0", "<init>", "(J)V", "", CourseConfigKeyConstantsKt.KEY_RESET, "()V", "sessionId", "J", "getSessionId", "()J", "setSessionId", "rootSessionId", "getRootSessionId", "setRootSessionId", "", "videoId", "Ljava/lang/String;", "getVideoId", "()Ljava/lang/String;", "setVideoId", "(Ljava/lang/String;)V", "", "resolution", "I", "getResolution", "()I", "setResolution", "(I)V", "", "speed", "F", "getSpeed", "()F", "setSpeed", "(F)V", "networkType", "getNetworkType", "setNetworkType", "", "isNetworkChanged", "Z", "()Z", "setNetworkChanged", "(Z)V", "reBufferDurationMs", "getReBufferDurationMs", "setReBufferDurationMs", "reBufferCount", "getReBufferCount", "setReBufferCount", "lessonId", "getLessonId", "setLessonId", TtmlNode.TAG_REGION, "getRegion", "setRegion", "decoderName", "getDecoderName", "setDecoderName", "isInternetConnected", "setInternetConnected", "selectedUrlIndex", "getSelectedUrlIndex", "setSelectedUrlIndex", "Lo/cloneAndClear;", "playbackType", "Lo/cloneAndClear;", "getPlaybackType", "()Lo/cloneAndClear;", "setPlaybackType", "(Lo/cloneAndClear;)V", "minBitRateReq", "getMinBitRateReq", "setMinBitRateReq", "totalDurationMs", "getTotalDurationMs", "setTotalDurationMs", "portraitDurationMs", "getPortraitDurationMs", "setPortraitDurationMs", "landscapeDurationMs", "getLandscapeDurationMs", "setLandscapeDurationMs", "prepareTimestampMs", "getPrepareTimestampMs", "setPrepareTimestampMs", "licenseInitiateTimestampMs", "getLicenseInitiateTimestampMs", "setLicenseInitiateTimestampMs", "licensingResponseTimestampMs", "getLicensingResponseTimestampMs", "setLicensingResponseTimestampMs", "firstFrameRenderedTimestampMs", "getFirstFrameRenderedTimestampMs", "setFirstFrameRenderedTimestampMs", "encryptedPlaybackVersion", "getEncryptedPlaybackVersion", "setEncryptedPlaybackVersion", "totalFramesDropped", "getTotalFramesDropped", "setTotalFramesDropped", "audioUnderrunDurationMs", "getAudioUnderrunDurationMs", "setAudioUnderrunDurationMs", "pbConfig", "getPbConfig", "setPbConfig", "pauseCount", "getPauseCount", "setPauseCount", "pauseTouchCount", "getPauseTouchCount", "setPauseTouchCount", "seekCount", "getSeekCount", "setSeekCount", "wvAudioLevel", "getWvAudioLevel", "setWvAudioLevel", "wvVideoLevel", "getWvVideoLevel", "setWvVideoLevel", "", "widevineMode", "Ljava/lang/Enum;", "getWidevineMode$5e726e45", "()Ljava/lang/Enum;", "setWidevineMode$26433acb", "(Ljava/lang/Enum;)V", "pbSessionId", "getPbSessionId", "setPbSessionId", CourseConfigKeyConstantsKt.KEY_THEME, "getTheme", "setTheme"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VideoAnalyticInterimSession {
    private long audioUnderrunDurationMs;
    private long firstFrameRenderedTimestampMs;
    private boolean isInternetConnected;
    private boolean isNetworkChanged;
    private long landscapeDurationMs;
    private String lessonId;
    private long licenseInitiateTimestampMs;
    private long licensingResponseTimestampMs;
    private long minBitRateReq;
    private int networkType;
    private int pauseCount;
    private int pauseTouchCount;
    private String pbSessionId;
    private long portraitDurationMs;
    private long prepareTimestampMs;
    private int reBufferCount;
    private long reBufferDurationMs;
    private String region;
    private int resolution;
    private long rootSessionId;
    private int seekCount;
    private int selectedUrlIndex;
    private long sessionId;
    private String theme;
    private long totalDurationMs;
    private long totalFramesDropped;
    private String videoId;
    private Enum widevineMode;
    private float speed = 1.0f;
    private String decoderName = "NA";
    private cloneAndClear playbackType = cloneAndClear.RemoteActionCompatParcelizer;
    private int encryptedPlaybackVersion = -1;
    private String pbConfig = "";
    private int wvAudioLevel = -1;
    private int wvVideoLevel = -1;

    public VideoAnalyticInterimSession(long j) {
        this.sessionId = j;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1733856635);
        this.widevineMode = (Enum) ((Field) (objRemoteActionCompatParcelizer == null ? startForeground.read((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 61115), 11734 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), Process.getGidForName("") + 24, -420563440, false, "IconCompatParcelizer", null) : objRemoteActionCompatParcelizer)).get(null);
        this.pbSessionId = "NA";
        this.theme = "NA";
        long j2 = this.sessionId;
        this.rootSessionId = j2;
        this.prepareTimestampMs = j2;
    }

    public final long getSessionId() {
        return this.sessionId;
    }

    public final void setSessionId(long j) {
        this.sessionId = j;
    }

    public final long getRootSessionId() {
        return this.rootSessionId;
    }

    public final void setRootSessionId(long j) {
        this.rootSessionId = j;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public final void setVideoId(String str) {
        this.videoId = str;
    }

    public final int getResolution() {
        return this.resolution;
    }

    public final void setResolution(int i) {
        this.resolution = i;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final void setSpeed(float f) {
        this.speed = f;
    }

    public final int getNetworkType() {
        return this.networkType;
    }

    public final void setNetworkType(int i) {
        this.networkType = i;
    }

    /* JADX INFO: renamed from: isNetworkChanged, reason: from getter */
    public final boolean getIsNetworkChanged() {
        return this.isNetworkChanged;
    }

    public final void setNetworkChanged(boolean z) {
        this.isNetworkChanged = z;
    }

    public final long getReBufferDurationMs() {
        return this.reBufferDurationMs;
    }

    public final void setReBufferDurationMs(long j) {
        this.reBufferDurationMs = j;
    }

    public final int getReBufferCount() {
        return this.reBufferCount;
    }

    public final void setReBufferCount(int i) {
        this.reBufferCount = i;
    }

    public final String getLessonId() {
        return this.lessonId;
    }

    public final void setLessonId(String str) {
        this.lessonId = str;
    }

    public final String getRegion() {
        return this.region;
    }

    public final void setRegion(String str) {
        this.region = str;
    }

    public final String getDecoderName() {
        return this.decoderName;
    }

    public final void setDecoderName(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.decoderName = str;
    }

    /* JADX INFO: renamed from: isInternetConnected, reason: from getter */
    public final boolean getIsInternetConnected() {
        return this.isInternetConnected;
    }

    public final void setInternetConnected(boolean z) {
        this.isInternetConnected = z;
    }

    public final int getSelectedUrlIndex() {
        return this.selectedUrlIndex;
    }

    public final void setSelectedUrlIndex(int i) {
        this.selectedUrlIndex = i;
    }

    public final cloneAndClear getPlaybackType() {
        return this.playbackType;
    }

    public final void setPlaybackType(cloneAndClear cloneandclear) {
        toMagicModuleMetaRepoModel.write(cloneandclear, "");
        this.playbackType = cloneandclear;
    }

    public final long getMinBitRateReq() {
        return this.minBitRateReq;
    }

    public final void setMinBitRateReq(long j) {
        this.minBitRateReq = j;
    }

    public final long getTotalDurationMs() {
        return this.totalDurationMs;
    }

    public final void setTotalDurationMs(long j) {
        this.totalDurationMs = j;
    }

    public final long getPortraitDurationMs() {
        return this.portraitDurationMs;
    }

    public final void setPortraitDurationMs(long j) {
        this.portraitDurationMs = j;
    }

    public final long getLandscapeDurationMs() {
        return this.landscapeDurationMs;
    }

    public final void setLandscapeDurationMs(long j) {
        this.landscapeDurationMs = j;
    }

    public final long getPrepareTimestampMs() {
        return this.prepareTimestampMs;
    }

    public final void setPrepareTimestampMs(long j) {
        this.prepareTimestampMs = j;
    }

    public final long getLicenseInitiateTimestampMs() {
        return this.licenseInitiateTimestampMs;
    }

    public final void setLicenseInitiateTimestampMs(long j) {
        this.licenseInitiateTimestampMs = j;
    }

    public final long getLicensingResponseTimestampMs() {
        return this.licensingResponseTimestampMs;
    }

    public final void setLicensingResponseTimestampMs(long j) {
        this.licensingResponseTimestampMs = j;
    }

    public final long getFirstFrameRenderedTimestampMs() {
        return this.firstFrameRenderedTimestampMs;
    }

    public final void setFirstFrameRenderedTimestampMs(long j) {
        this.firstFrameRenderedTimestampMs = j;
    }

    public final int getEncryptedPlaybackVersion() {
        return this.encryptedPlaybackVersion;
    }

    public final void setEncryptedPlaybackVersion(int i) {
        this.encryptedPlaybackVersion = i;
    }

    public final long getTotalFramesDropped() {
        return this.totalFramesDropped;
    }

    public final void setTotalFramesDropped(long j) {
        this.totalFramesDropped = j;
    }

    public final long getAudioUnderrunDurationMs() {
        return this.audioUnderrunDurationMs;
    }

    public final void setAudioUnderrunDurationMs(long j) {
        this.audioUnderrunDurationMs = j;
    }

    public final String getPbConfig() {
        return this.pbConfig;
    }

    public final void setPbConfig(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.pbConfig = str;
    }

    public final int getPauseCount() {
        return this.pauseCount;
    }

    public final void setPauseCount(int i) {
        this.pauseCount = i;
    }

    public final int getPauseTouchCount() {
        return this.pauseTouchCount;
    }

    public final void setPauseTouchCount(int i) {
        this.pauseTouchCount = i;
    }

    public final int getSeekCount() {
        return this.seekCount;
    }

    public final void setSeekCount(int i) {
        this.seekCount = i;
    }

    public final int getWvAudioLevel() {
        return this.wvAudioLevel;
    }

    public final void setWvAudioLevel(int i) {
        this.wvAudioLevel = i;
    }

    public final int getWvVideoLevel() {
        return this.wvVideoLevel;
    }

    public final void setWvVideoLevel(int i) {
        this.wvVideoLevel = i;
    }

    /* JADX INFO: renamed from: getWidevineMode$5e726e45, reason: from getter */
    public final Enum getWidevineMode() {
        return this.widevineMode;
    }

    public final void setWidevineMode$26433acb(Enum r2) {
        toMagicModuleMetaRepoModel.write(r2, "");
        this.widevineMode = r2;
    }

    public final String getPbSessionId() {
        return this.pbSessionId;
    }

    public final void setPbSessionId(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.pbSessionId = str;
    }

    public final String getTheme() {
        return this.theme;
    }

    public final void setTheme(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.theme = str;
    }

    public final void reset() {
        this.totalDurationMs = 0L;
        this.portraitDurationMs = 0L;
        this.landscapeDurationMs = 0L;
        this.isNetworkChanged = false;
        this.reBufferDurationMs = 0L;
        this.reBufferCount = 0;
        this.audioUnderrunDurationMs = 0L;
        this.totalFramesDropped = 0L;
        this.pauseCount = 0;
        this.pauseTouchCount = 0;
        this.seekCount = 0;
    }
}
