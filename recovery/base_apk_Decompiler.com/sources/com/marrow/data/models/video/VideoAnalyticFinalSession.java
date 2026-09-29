package com.marrow.data.models.video;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.cloneAndClear;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0010\n\u0002\bz\b\u0086\b\u0018\u00002\u00020\u0001B\u0099\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\b\u0012\u0006\u0010\u001d\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001f\u001a\u00020\b\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\b\u0012\u0006\u0010\"\u001a\u00020\b\u0012\u0006\u0010#\u001a\u00020\b\u0012\u0006\u0010$\u001a\u00020\b\u0012\u0006\u0010%\u001a\u00020\b\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b0\u0010/J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010-J\u0010\u00102\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010-J\u0010\u00107\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b7\u0010/J\u0010\u00108\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b8\u0010/J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010-J\u0010\u0010:\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b<\u0010;J\u0010\u0010=\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b=\u0010/J\u0010\u0010>\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b>\u00103J\u0010\u0010?\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b?\u0010/J\u0010\u0010@\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b@\u0010/J\u0010\u0010A\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bA\u0010/J\u0010\u0010B\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bB\u0010/J\u0010\u0010C\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bC\u0010;J\u0010\u0010D\u001a\u00020\u001aHÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bF\u00103J\u0010\u0010G\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bG\u0010/J\u0010\u0010H\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bH\u0010/J\u0010\u0010I\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bI\u00103J\u0010\u0010J\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bJ\u0010-J\u0010\u0010K\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bK\u00103J\u0010\u0010L\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bL\u00103J\u0010\u0010M\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bM\u00103J\u0010\u0010N\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bN\u00103J\u0010\u0010O\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bO\u00103J\u0010\u0010P\u001a\u00020&HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bR\u0010-J\u0010\u0010S\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bS\u0010-Jâ\u0002\u0010T\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020\u00022\b\b\u0002\u0010)\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\bT\u0010UJ\u001a\u0010V\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020\bHÖ\u0001¢\u0006\u0004\bX\u00103J\u0010\u0010Y\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bY\u0010-R\u0019\u0010Z\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010-R\u001a\u0010]\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010/R\u001a\u0010`\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b`\u0010^\u001a\u0004\ba\u0010/R\u001c\u0010b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010[\u001a\u0004\bc\u0010-R\u001a\u0010d\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u00103R\u001a\u0010g\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u00105R\u001c\u0010j\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bj\u0010[\u001a\u0004\bk\u0010-R\u001a\u0010l\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bl\u0010^\u001a\u0004\bm\u0010/R\u001a\u0010n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bn\u0010^\u001a\u0004\bo\u0010/R\u001c\u0010p\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bp\u0010[\u001a\u0004\bq\u0010-R\u001a\u0010r\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\br\u0010;R\u001a\u0010t\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\bt\u0010s\u001a\u0004\bu\u0010;R\u001a\u0010v\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bv\u0010^\u001a\u0004\bw\u0010/R\u001a\u0010x\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bx\u0010e\u001a\u0004\by\u00103R\u001a\u0010z\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bz\u0010^\u001a\u0004\b{\u0010/R\u001a\u0010|\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b|\u0010^\u001a\u0004\b}\u0010/R\u001a\u0010~\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b~\u0010^\u001a\u0004\b\u007f\u0010/R\u001d\u0010\u0080\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010^\u001a\u0005\b\u0081\u0001\u0010/R\u001d\u0010\u0082\u0001\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010s\u001a\u0005\b\u0082\u0001\u0010;R\u001e\u0010\u0083\u0001\u001a\u00020\u001a8\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010ER\u001d\u0010\u0086\u0001\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010e\u001a\u0005\b\u0087\u0001\u00103R\u001d\u0010\u0088\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010^\u001a\u0005\b\u0089\u0001\u0010/R\u001d\u0010\u008a\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010^\u001a\u0005\b\u008b\u0001\u0010/R\u001d\u0010\u008c\u0001\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010e\u001a\u0005\b\u008d\u0001\u00103R\u001d\u0010\u008e\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010[\u001a\u0005\b\u008f\u0001\u0010-R\u001d\u0010\u0090\u0001\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010e\u001a\u0005\b\u0091\u0001\u00103R\u001d\u0010\u0092\u0001\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010e\u001a\u0005\b\u0093\u0001\u00103R\u001d\u0010\u0094\u0001\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010e\u001a\u0005\b\u0095\u0001\u00103R\u001d\u0010\u0096\u0001\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010e\u001a\u0005\b\u0097\u0001\u00103R\u001d\u0010\u0098\u0001\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010e\u001a\u0005\b\u0099\u0001\u00103R\u001e\u0010\u009a\u0001\u001a\u00020&8\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0005\b\u009c\u0001\u0010QR\u001d\u0010\u009d\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010[\u001a\u0005\b\u009e\u0001\u0010-R\u001d\u0010\u009f\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010[\u001a\u0005\b \u0001\u0010-"}, d2 = {"Lcom/marrow/data/models/video/VideoAnalyticFinalSession;", "", "", "p0", "", "p1", "p2", "p3", "", "p4", "", "p5", "p6", "p7", "p8", "p9", "", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "Lo/cloneAndClear;", "p19", "p20", "p21", "p22", "p23", "p24", "p25", "p26", "p27", "p28", "p29", "", "p30", "p31", "p32", "<init>", "(Ljava/lang/String;JJLjava/lang/String;IFLjava/lang/String;JJLjava/lang/String;ZZJIJJJJZLo/cloneAndClear;IJJILjava/lang/String;IIIIILjava/lang/Enum;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "component4", "component5", "()I", "component6", "()F", "component7", "component8", "component9", "component10", "component11", "()Z", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "()Lo/cloneAndClear;", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31$5e726e45", "()Ljava/lang/Enum;", "component32", "component33", "copy$27e810f8", "(Ljava/lang/String;JJLjava/lang/String;IFLjava/lang/String;JJLjava/lang/String;ZZJIJJJJZLo/cloneAndClear;IJJILjava/lang/String;IIIIILjava/lang/Enum;Ljava/lang/String;Ljava/lang/String;)Lcom/marrow/data/models/video/VideoAnalyticFinalSession;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "lessonId", "Ljava/lang/String;", "getLessonId", "sessionId", "J", "getSessionId", "rootSessionId", "getRootSessionId", "videoId", "getVideoId", "resolution", "I", "getResolution", "speed", "F", "getSpeed", "geolocation", "getGeolocation", "firstBufferDurationMs", "getFirstBufferDurationMs", "startupDurationMs", "getStartupDurationMs", "decoderName", "getDecoderName", "isNetworkChanged", "Z", "didReBuffer", "getDidReBuffer", "reBufferDurationMs", "getReBufferDurationMs", "reBufferCount", "getReBufferCount", "endTimeMs", "getEndTimeMs", "playbackDurationMs", "getPlaybackDurationMs", "landscapeDurationMs", "getLandscapeDurationMs", "minBitRateReq", "getMinBitRateReq", "isInternetConnected", "playbackType", "Lo/cloneAndClear;", "getPlaybackType", "encryptedPlaybackVersion", "getEncryptedPlaybackVersion", "totalFramesDropped", "getTotalFramesDropped", "audioUnderrunDurationMs", "getAudioUnderrunDurationMs", "version", "getVersion", "pbConfig", "getPbConfig", "pauseCount", "getPauseCount", "pauseTouchCount", "getPauseTouchCount", "seekCount", "getSeekCount", "wvAudioLevel", "getWvAudioLevel", "wvVideoLevel", "getWvVideoLevel", "widevineMode", "Ljava/lang/Enum;", "getWidevineMode$5e726e45", "pbSessionId", "getPbSessionId", CourseConfigKeyConstantsKt.KEY_THEME, "getTheme"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VideoAnalyticFinalSession {
    private final long audioUnderrunDurationMs;
    private final String decoderName;
    private final boolean didReBuffer;
    private final int encryptedPlaybackVersion;
    private final long endTimeMs;
    private final long firstBufferDurationMs;
    private final String geolocation;
    private final boolean isInternetConnected;
    private final boolean isNetworkChanged;
    private final long landscapeDurationMs;
    private final String lessonId;
    private final long minBitRateReq;
    private final int pauseCount;
    private final int pauseTouchCount;
    private final String pbConfig;
    private final String pbSessionId;
    private final long playbackDurationMs;
    private final cloneAndClear playbackType;
    private final int reBufferCount;
    private final long reBufferDurationMs;
    private final int resolution;
    private final long rootSessionId;
    private final int seekCount;
    private final long sessionId;
    private final float speed;
    private final long startupDurationMs;
    private final String theme;
    private final long totalFramesDropped;
    private final int version;
    private final String videoId;
    private final Enum widevineMode;
    private final int wvAudioLevel;
    private final int wvVideoLevel;

    public VideoAnalyticFinalSession(String str, long j, long j2, String str2, int i, float f, String str3, long j3, long j4, String str4, boolean z, boolean z2, long j5, int i2, long j6, long j7, long j8, long j9, boolean z3, cloneAndClear cloneandclear, int i3, long j10, long j11, int i4, String str5, int i5, int i6, int i7, int i8, int i9, Enum r50, String str6, String str7) {
        toMagicModuleMetaRepoModel.write(cloneandclear, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(r50, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        toMagicModuleMetaRepoModel.write(str7, "");
        this.lessonId = str;
        this.sessionId = j;
        this.rootSessionId = j2;
        this.videoId = str2;
        this.resolution = i;
        this.speed = f;
        this.geolocation = str3;
        this.firstBufferDurationMs = j3;
        this.startupDurationMs = j4;
        this.decoderName = str4;
        this.isNetworkChanged = z;
        this.didReBuffer = z2;
        this.reBufferDurationMs = j5;
        this.reBufferCount = i2;
        this.endTimeMs = j6;
        this.playbackDurationMs = j7;
        this.landscapeDurationMs = j8;
        this.minBitRateReq = j9;
        this.isInternetConnected = z3;
        this.playbackType = cloneandclear;
        this.encryptedPlaybackVersion = i3;
        this.totalFramesDropped = j10;
        this.audioUnderrunDurationMs = j11;
        this.version = i4;
        this.pbConfig = str5;
        this.pauseCount = i5;
        this.pauseTouchCount = i6;
        this.seekCount = i7;
        this.wvAudioLevel = i8;
        this.wvVideoLevel = i9;
        this.widevineMode = r50;
        this.pbSessionId = str6;
        this.theme = str7;
    }

    public /* synthetic */ VideoAnalyticFinalSession(String str, long j, long j2, String str2, int i, float f, String str3, long j3, long j4, String str4, boolean z, boolean z2, long j5, int i2, long j6, long j7, long j8, long j9, boolean z3, cloneAndClear cloneandclear, int i3, long j10, long j11, int i4, String str5, int i5, int i6, int i7, int i8, int i9, Enum r88, String str6, String str7, int i10, int i11, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, j, j2, str2, i, f, str3, j3, j4, str4, z, z2, j5, i2, j6, j7, j8, j9, z3, cloneandclear, i3, j10, j11, (i10 & 8388608) != 0 ? 5 : i4, str5, i5, i6, i7, i8, i9, r88, str6, str7);
    }

    public final String getLessonId() {
        return this.lessonId;
    }

    public final long getSessionId() {
        return this.sessionId;
    }

    public final long getRootSessionId() {
        return this.rootSessionId;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public final int getResolution() {
        return this.resolution;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final String getGeolocation() {
        return this.geolocation;
    }

    public final long getFirstBufferDurationMs() {
        return this.firstBufferDurationMs;
    }

    public final long getStartupDurationMs() {
        return this.startupDurationMs;
    }

    public final String getDecoderName() {
        return this.decoderName;
    }

    public final boolean isNetworkChanged() {
        return this.isNetworkChanged;
    }

    public final boolean getDidReBuffer() {
        return this.didReBuffer;
    }

    public final long getReBufferDurationMs() {
        return this.reBufferDurationMs;
    }

    public final int getReBufferCount() {
        return this.reBufferCount;
    }

    public final long getEndTimeMs() {
        return this.endTimeMs;
    }

    public final long getPlaybackDurationMs() {
        return this.playbackDurationMs;
    }

    public final long getLandscapeDurationMs() {
        return this.landscapeDurationMs;
    }

    public final long getMinBitRateReq() {
        return this.minBitRateReq;
    }

    public final boolean isInternetConnected() {
        return this.isInternetConnected;
    }

    public final cloneAndClear getPlaybackType() {
        return this.playbackType;
    }

    public final int getEncryptedPlaybackVersion() {
        return this.encryptedPlaybackVersion;
    }

    public final long getTotalFramesDropped() {
        return this.totalFramesDropped;
    }

    public final long getAudioUnderrunDurationMs() {
        return this.audioUnderrunDurationMs;
    }

    public final int getVersion() {
        return this.version;
    }

    public final String getPbConfig() {
        return this.pbConfig;
    }

    public final int getPauseCount() {
        return this.pauseCount;
    }

    public final int getPauseTouchCount() {
        return this.pauseTouchCount;
    }

    public final int getSeekCount() {
        return this.seekCount;
    }

    public final int getWvAudioLevel() {
        return this.wvAudioLevel;
    }

    public final int getWvVideoLevel() {
        return this.wvVideoLevel;
    }

    public final Enum getWidevineMode$5e726e45() {
        return this.widevineMode;
    }

    public final String getPbSessionId() {
        return this.pbSessionId;
    }

    public final String getTheme() {
        return this.theme;
    }

    public static /* synthetic */ VideoAnalyticFinalSession copy$default$4de49dac(VideoAnalyticFinalSession videoAnalyticFinalSession, String str, long j, long j2, String str2, int i, float f, String str3, long j3, long j4, String str4, boolean z, boolean z2, long j5, int i2, long j6, long j7, long j8, long j9, boolean z3, cloneAndClear cloneandclear, int i3, long j10, long j11, int i4, String str5, int i5, int i6, int i7, int i8, int i9, Enum r59, String str6, String str7, int i10, int i11, Object obj) {
        String str8 = (i10 & 1) != 0 ? videoAnalyticFinalSession.lessonId : str;
        long j12 = (i10 & 2) != 0 ? videoAnalyticFinalSession.sessionId : j;
        long j13 = (i10 & 4) != 0 ? videoAnalyticFinalSession.rootSessionId : j2;
        String str9 = (i10 & 8) != 0 ? videoAnalyticFinalSession.videoId : str2;
        int i12 = (i10 & 16) != 0 ? videoAnalyticFinalSession.resolution : i;
        float f2 = (i10 & 32) != 0 ? videoAnalyticFinalSession.speed : f;
        String str10 = (i10 & 64) != 0 ? videoAnalyticFinalSession.geolocation : str3;
        long j14 = (i10 & 128) != 0 ? videoAnalyticFinalSession.firstBufferDurationMs : j3;
        long j15 = (i10 & 256) != 0 ? videoAnalyticFinalSession.startupDurationMs : j4;
        String str11 = (i10 & 512) != 0 ? videoAnalyticFinalSession.decoderName : str4;
        boolean z4 = (i10 & 1024) != 0 ? videoAnalyticFinalSession.isNetworkChanged : z;
        boolean z5 = (i10 & 2048) != 0 ? videoAnalyticFinalSession.didReBuffer : z2;
        long j16 = j15;
        long j17 = (i10 & 4096) != 0 ? videoAnalyticFinalSession.reBufferDurationMs : j5;
        return videoAnalyticFinalSession.copy$27e810f8(str8, j12, j13, str9, i12, f2, str10, j14, j16, str11, z4, z5, j17, (i10 & 8192) != 0 ? videoAnalyticFinalSession.reBufferCount : i2, (i10 & 16384) != 0 ? videoAnalyticFinalSession.endTimeMs : j6, (32768 & i10) != 0 ? videoAnalyticFinalSession.playbackDurationMs : j7, (65536 & i10) != 0 ? videoAnalyticFinalSession.landscapeDurationMs : j8, (131072 & i10) != 0 ? videoAnalyticFinalSession.minBitRateReq : j9, (262144 & i10) != 0 ? videoAnalyticFinalSession.isInternetConnected : z3, (i10 & 524288) != 0 ? videoAnalyticFinalSession.playbackType : cloneandclear, (i10 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? videoAnalyticFinalSession.encryptedPlaybackVersion : i3, (i10 & 2097152) != 0 ? videoAnalyticFinalSession.totalFramesDropped : j10, (i10 & 4194304) != 0 ? videoAnalyticFinalSession.audioUnderrunDurationMs : j11, (i10 & 8388608) != 0 ? videoAnalyticFinalSession.version : i4, (16777216 & i10) != 0 ? videoAnalyticFinalSession.pbConfig : str5, (i10 & 33554432) != 0 ? videoAnalyticFinalSession.pauseCount : i5, (i10 & 67108864) != 0 ? videoAnalyticFinalSession.pauseTouchCount : i6, (i10 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? videoAnalyticFinalSession.seekCount : i7, (i10 & 268435456) != 0 ? videoAnalyticFinalSession.wvAudioLevel : i8, (i10 & 536870912) != 0 ? videoAnalyticFinalSession.wvVideoLevel : i9, (i10 & 1073741824) != 0 ? videoAnalyticFinalSession.widevineMode : r59, (i10 & Integer.MIN_VALUE) != 0 ? videoAnalyticFinalSession.pbSessionId : str6, (i11 & 1) != 0 ? videoAnalyticFinalSession.theme : str7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLessonId() {
        return this.lessonId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDecoderName() {
        return this.decoderName;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsNetworkChanged() {
        return this.isNetworkChanged;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getDidReBuffer() {
        return this.didReBuffer;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getReBufferDurationMs() {
        return this.reBufferDurationMs;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getReBufferCount() {
        return this.reBufferCount;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final long getEndTimeMs() {
        return this.endTimeMs;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final long getPlaybackDurationMs() {
        return this.playbackDurationMs;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final long getLandscapeDurationMs() {
        return this.landscapeDurationMs;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final long getMinBitRateReq() {
        return this.minBitRateReq;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getIsInternetConnected() {
        return this.isInternetConnected;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final cloneAndClear getPlaybackType() {
        return this.playbackType;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getEncryptedPlaybackVersion() {
        return this.encryptedPlaybackVersion;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final long getTotalFramesDropped() {
        return this.totalFramesDropped;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final long getAudioUnderrunDurationMs() {
        return this.audioUnderrunDurationMs;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getPbConfig() {
        return this.pbConfig;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final int getPauseCount() {
        return this.pauseCount;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final int getPauseTouchCount() {
        return this.pauseTouchCount;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final int getSeekCount() {
        return this.seekCount;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final int getWvAudioLevel() {
        return this.wvAudioLevel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getRootSessionId() {
        return this.rootSessionId;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final int getWvVideoLevel() {
        return this.wvVideoLevel;
    }

    /* JADX INFO: renamed from: component31$5e726e45, reason: from getter */
    public final Enum getWidevineMode() {
        return this.widevineMode;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getPbSessionId() {
        return this.pbSessionId;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVideoId() {
        return this.videoId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getResolution() {
        return this.resolution;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getSpeed() {
        return this.speed;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getGeolocation() {
        return this.geolocation;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getFirstBufferDurationMs() {
        return this.firstBufferDurationMs;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getStartupDurationMs() {
        return this.startupDurationMs;
    }

    public final VideoAnalyticFinalSession copy$27e810f8(String p0, long p1, long p2, String p3, int p4, float p5, String p6, long p7, long p8, String p9, boolean p10, boolean p11, long p12, int p13, long p14, long p15, long p16, long p17, boolean p18, cloneAndClear p19, int p20, long p21, long p22, int p23, String p24, int p25, int p26, int p27, int p28, int p29, Enum p30, String p31, String p32) {
        toMagicModuleMetaRepoModel.write(p19, "");
        toMagicModuleMetaRepoModel.write(p24, "");
        toMagicModuleMetaRepoModel.write(p30, "");
        toMagicModuleMetaRepoModel.write(p31, "");
        toMagicModuleMetaRepoModel.write(p32, "");
        return new VideoAnalyticFinalSession(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof VideoAnalyticFinalSession)) {
            return false;
        }
        VideoAnalyticFinalSession videoAnalyticFinalSession = (VideoAnalyticFinalSession) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.lessonId, (Object) videoAnalyticFinalSession.lessonId) && this.sessionId == videoAnalyticFinalSession.sessionId && this.rootSessionId == videoAnalyticFinalSession.rootSessionId && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.videoId, (Object) videoAnalyticFinalSession.videoId) && this.resolution == videoAnalyticFinalSession.resolution && Float.compare(this.speed, videoAnalyticFinalSession.speed) == 0 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.geolocation, (Object) videoAnalyticFinalSession.geolocation) && this.firstBufferDurationMs == videoAnalyticFinalSession.firstBufferDurationMs && this.startupDurationMs == videoAnalyticFinalSession.startupDurationMs && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.decoderName, (Object) videoAnalyticFinalSession.decoderName) && this.isNetworkChanged == videoAnalyticFinalSession.isNetworkChanged && this.didReBuffer == videoAnalyticFinalSession.didReBuffer && this.reBufferDurationMs == videoAnalyticFinalSession.reBufferDurationMs && this.reBufferCount == videoAnalyticFinalSession.reBufferCount && this.endTimeMs == videoAnalyticFinalSession.endTimeMs && this.playbackDurationMs == videoAnalyticFinalSession.playbackDurationMs && this.landscapeDurationMs == videoAnalyticFinalSession.landscapeDurationMs && this.minBitRateReq == videoAnalyticFinalSession.minBitRateReq && this.isInternetConnected == videoAnalyticFinalSession.isInternetConnected && this.playbackType == videoAnalyticFinalSession.playbackType && this.encryptedPlaybackVersion == videoAnalyticFinalSession.encryptedPlaybackVersion && this.totalFramesDropped == videoAnalyticFinalSession.totalFramesDropped && this.audioUnderrunDurationMs == videoAnalyticFinalSession.audioUnderrunDurationMs && this.version == videoAnalyticFinalSession.version && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.pbConfig, (Object) videoAnalyticFinalSession.pbConfig) && this.pauseCount == videoAnalyticFinalSession.pauseCount && this.pauseTouchCount == videoAnalyticFinalSession.pauseTouchCount && this.seekCount == videoAnalyticFinalSession.seekCount && this.wvAudioLevel == videoAnalyticFinalSession.wvAudioLevel && this.wvVideoLevel == videoAnalyticFinalSession.wvVideoLevel && this.widevineMode == videoAnalyticFinalSession.widevineMode && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.pbSessionId, (Object) videoAnalyticFinalSession.pbSessionId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.theme, (Object) videoAnalyticFinalSession.theme);
    }

    public final int hashCode() {
        String str = this.lessonId;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = Long.hashCode(this.sessionId);
        int iHashCode3 = Long.hashCode(this.rootSessionId);
        String str2 = this.videoId;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        int iHashCode5 = Integer.hashCode(this.resolution);
        int iHashCode6 = Float.hashCode(this.speed);
        String str3 = this.geolocation;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        int iHashCode8 = Long.hashCode(this.firstBufferDurationMs);
        int iHashCode9 = Long.hashCode(this.startupDurationMs);
        String str4 = this.decoderName;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + Boolean.hashCode(this.isNetworkChanged)) * 31) + Boolean.hashCode(this.didReBuffer)) * 31) + Long.hashCode(this.reBufferDurationMs)) * 31) + Integer.hashCode(this.reBufferCount)) * 31) + Long.hashCode(this.endTimeMs)) * 31) + Long.hashCode(this.playbackDurationMs)) * 31) + Long.hashCode(this.landscapeDurationMs)) * 31) + Long.hashCode(this.minBitRateReq)) * 31) + Boolean.hashCode(this.isInternetConnected)) * 31) + this.playbackType.hashCode()) * 31) + Integer.hashCode(this.encryptedPlaybackVersion)) * 31) + Long.hashCode(this.totalFramesDropped)) * 31) + Long.hashCode(this.audioUnderrunDurationMs)) * 31) + Integer.hashCode(this.version)) * 31) + this.pbConfig.hashCode()) * 31) + Integer.hashCode(this.pauseCount)) * 31) + Integer.hashCode(this.pauseTouchCount)) * 31) + Integer.hashCode(this.seekCount)) * 31) + Integer.hashCode(this.wvAudioLevel)) * 31) + Integer.hashCode(this.wvVideoLevel)) * 31) + this.widevineMode.hashCode()) * 31) + this.pbSessionId.hashCode()) * 31) + this.theme.hashCode();
    }

    public final String toString() {
        String str = this.lessonId;
        long j = this.sessionId;
        long j2 = this.rootSessionId;
        String str2 = this.videoId;
        int i = this.resolution;
        float f = this.speed;
        String str3 = this.geolocation;
        long j3 = this.firstBufferDurationMs;
        long j4 = this.startupDurationMs;
        String str4 = this.decoderName;
        boolean z = this.isNetworkChanged;
        boolean z2 = this.didReBuffer;
        long j5 = this.reBufferDurationMs;
        int i2 = this.reBufferCount;
        long j6 = this.endTimeMs;
        long j7 = this.playbackDurationMs;
        long j8 = this.landscapeDurationMs;
        long j9 = this.minBitRateReq;
        boolean z3 = this.isInternetConnected;
        cloneAndClear cloneandclear = this.playbackType;
        int i3 = this.encryptedPlaybackVersion;
        long j10 = this.totalFramesDropped;
        long j11 = this.audioUnderrunDurationMs;
        int i4 = this.version;
        String str5 = this.pbConfig;
        int i5 = this.pauseCount;
        int i6 = this.pauseTouchCount;
        int i7 = this.seekCount;
        int i8 = this.wvAudioLevel;
        int i9 = this.wvVideoLevel;
        Enum r15 = this.widevineMode;
        String str6 = this.pbSessionId;
        String str7 = this.theme;
        StringBuilder sb = new StringBuilder("VideoAnalyticFinalSession(lessonId=");
        sb.append(str);
        sb.append(", sessionId=");
        sb.append(j);
        sb.append(", rootSessionId=");
        sb.append(j2);
        sb.append(", videoId=");
        sb.append(str2);
        sb.append(", resolution=");
        sb.append(i);
        sb.append(", speed=");
        sb.append(f);
        sb.append(", geolocation=");
        sb.append(str3);
        sb.append(", firstBufferDurationMs=");
        sb.append(j3);
        sb.append(", startupDurationMs=");
        sb.append(j4);
        sb.append(", decoderName=");
        sb.append(str4);
        sb.append(", isNetworkChanged=");
        sb.append(z);
        sb.append(", didReBuffer=");
        sb.append(z2);
        sb.append(", reBufferDurationMs=");
        sb.append(j5);
        sb.append(", reBufferCount=");
        sb.append(i2);
        sb.append(", endTimeMs=");
        sb.append(j6);
        sb.append(", playbackDurationMs=");
        sb.append(j7);
        sb.append(", landscapeDurationMs=");
        sb.append(j8);
        sb.append(", minBitRateReq=");
        sb.append(j9);
        sb.append(", isInternetConnected=");
        sb.append(z3);
        sb.append(", playbackType=");
        sb.append(cloneandclear);
        sb.append(", encryptedPlaybackVersion=");
        sb.append(i3);
        sb.append(", totalFramesDropped=");
        sb.append(j10);
        sb.append(", audioUnderrunDurationMs=");
        sb.append(j11);
        sb.append(", version=");
        sb.append(i4);
        sb.append(", pbConfig=");
        sb.append(str5);
        sb.append(", pauseCount=");
        sb.append(i5);
        sb.append(", pauseTouchCount=");
        sb.append(i6);
        sb.append(", seekCount=");
        sb.append(i7);
        sb.append(", wvAudioLevel=");
        sb.append(i8);
        sb.append(", wvVideoLevel=");
        sb.append(i9);
        sb.append(", widevineMode=");
        sb.append(r15);
        sb.append(", pbSessionId=");
        sb.append(str6);
        sb.append(", theme=");
        sb.append(str7);
        sb.append(")");
        return sb.toString();
    }
}
