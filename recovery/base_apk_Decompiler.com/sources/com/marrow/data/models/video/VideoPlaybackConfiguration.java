package com.marrow.data.models.video;

import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.getMagicModuleMeta;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\nJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\fR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/marrow/data/models/video/VideoPlaybackConfiguration;", "", "", "p0", "", "p1", "p2", "<init>", "(IZZ)V", "component1", "()I", "component2", "()Z", "component3", "copy", "(IZZ)Lcom/marrow/data/models/video/VideoPlaybackConfiguration;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "bufferMultiplier", "I", "getBufferMultiplier", "isParallelDecodingRequired", "Z", "enableDecoderFallback", "getEnableDecoderFallback", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VideoPlaybackConfiguration {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String WIDEVINE_LVL_DEFAULT = "DEFAULT";
    public static final String WIDEVINE_LVL_L3 = "L3";
    public static final String _C0 = "C0";
    public static final String _C1 = "C1";
    public static final String _C2 = "C2";
    public static final String _C3 = "C3";
    private static VideoPlaybackConfiguration videoConfigurationC0;
    private static VideoPlaybackConfiguration videoConfigurationC1;
    private static VideoPlaybackConfiguration videoConfigurationC2;
    private static VideoPlaybackConfiguration videoConfigurationC3;
    private final int bufferMultiplier;
    private final boolean enableDecoderFallback;
    private final boolean isParallelDecodingRequired;

    public VideoPlaybackConfiguration(int i, boolean z, boolean z2) {
        this.bufferMultiplier = i;
        this.isParallelDecodingRequired = z;
        this.enableDecoderFallback = z2;
    }

    public /* synthetic */ VideoPlaybackConfiguration(int i, boolean z, boolean z2, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2);
    }

    public final int getBufferMultiplier() {
        return this.bufferMultiplier;
    }

    public final boolean isParallelDecodingRequired() {
        return this.isParallelDecodingRequired;
    }

    public final boolean getEnableDecoderFallback() {
        return this.enableDecoderFallback;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0016\u0010\u0012\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013"}, d2 = {"Lcom/marrow/data/models/video/VideoPlaybackConfiguration$Companion;", "", "<init>", "()V", "", "p0", "", "p1", "Lcom/marrow/data/models/video/VideoPlaybackConfiguration;", "getVideoPlaybackSettings", "(Ljava/lang/String;Z)Lcom/marrow/data/models/video/VideoPlaybackConfiguration;", "_C0", "Ljava/lang/String;", "_C1", "_C2", "_C3", "WIDEVINE_LVL_DEFAULT", "WIDEVINE_LVL_L3", "videoConfigurationC0", "Lcom/marrow/data/models/video/VideoPlaybackConfiguration;", "videoConfigurationC1", "videoConfigurationC2", "videoConfigurationC3"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
        @kotlin.getMagicModuleMeta
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.marrow.data.models.video.VideoPlaybackConfiguration getVideoPlaybackSettings(java.lang.String r7, boolean r8) {
            /*
                r6 = this;
                java.lang.String r6 = ""
                kotlin.toMagicModuleMetaRepoModel.write(r7, r6)
                int r6 = r7.hashCode()
                switch(r6) {
                    case 2126: goto L27;
                    case 2127: goto L1a;
                    case 2128: goto Ld;
                    default: goto Lc;
                }
            Lc:
                goto L34
            Ld:
                java.lang.String r6 = "C3"
                boolean r6 = r7.equals(r6)
                if (r6 == 0) goto L34
                com.marrow.data.models.video.VideoPlaybackConfiguration r6 = com.marrow.data.models.video.VideoPlaybackConfiguration.access$getVideoConfigurationC3$cp()
                goto L38
            L1a:
                java.lang.String r6 = "C2"
                boolean r6 = r7.equals(r6)
                if (r6 == 0) goto L34
                com.marrow.data.models.video.VideoPlaybackConfiguration r6 = com.marrow.data.models.video.VideoPlaybackConfiguration.access$getVideoConfigurationC2$cp()
                goto L38
            L27:
                java.lang.String r6 = "C1"
                boolean r6 = r7.equals(r6)
                if (r6 == 0) goto L34
                com.marrow.data.models.video.VideoPlaybackConfiguration r6 = com.marrow.data.models.video.VideoPlaybackConfiguration.access$getVideoConfigurationC1$cp()
                goto L38
            L34:
                com.marrow.data.models.video.VideoPlaybackConfiguration r6 = com.marrow.data.models.video.VideoPlaybackConfiguration.access$getVideoConfigurationC0$cp()
            L38:
                r0 = r6
                r1 = 0
                r2 = 0
                r4 = 3
                r5 = 0
                r3 = r8
                com.marrow.data.models.video.VideoPlaybackConfiguration r6 = com.marrow.data.models.video.VideoPlaybackConfiguration.copy$default(r0, r1, r2, r3, r4, r5)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow.data.models.video.VideoPlaybackConfiguration.Companion.getVideoPlaybackSettings(java.lang.String, boolean):com.marrow.data.models.video.VideoPlaybackConfiguration");
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        boolean z = false;
        videoConfigurationC0 = new VideoPlaybackConfiguration(0, z, false, 7, null);
        boolean z2 = false;
        videoConfigurationC1 = new VideoPlaybackConfiguration(2, z2, false, 6, null);
        videoConfigurationC2 = new VideoPlaybackConfiguration(0, true, z, 5, null);
        videoConfigurationC3 = new VideoPlaybackConfiguration(2, true, z2, 4, null);
    }

    public VideoPlaybackConfiguration() {
        this(0, false, false, 7, null);
    }

    public static /* synthetic */ VideoPlaybackConfiguration copy$default(VideoPlaybackConfiguration videoPlaybackConfiguration, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = videoPlaybackConfiguration.bufferMultiplier;
        }
        if ((i2 & 2) != 0) {
            z = videoPlaybackConfiguration.isParallelDecodingRequired;
        }
        if ((i2 & 4) != 0) {
            z2 = videoPlaybackConfiguration.enableDecoderFallback;
        }
        return videoPlaybackConfiguration.copy(i, z, z2);
    }

    @getMagicModuleMeta
    public static final VideoPlaybackConfiguration getVideoPlaybackSettings(String str, boolean z) {
        return INSTANCE.getVideoPlaybackSettings(str, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBufferMultiplier() {
        return this.bufferMultiplier;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsParallelDecodingRequired() {
        return this.isParallelDecodingRequired;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnableDecoderFallback() {
        return this.enableDecoderFallback;
    }

    public final VideoPlaybackConfiguration copy(int p0, boolean p1, boolean p2) {
        return new VideoPlaybackConfiguration(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof VideoPlaybackConfiguration)) {
            return false;
        }
        VideoPlaybackConfiguration videoPlaybackConfiguration = (VideoPlaybackConfiguration) p0;
        return this.bufferMultiplier == videoPlaybackConfiguration.bufferMultiplier && this.isParallelDecodingRequired == videoPlaybackConfiguration.isParallelDecodingRequired && this.enableDecoderFallback == videoPlaybackConfiguration.enableDecoderFallback;
    }

    public final int hashCode() {
        return (((Integer.hashCode(this.bufferMultiplier) * 31) + Boolean.hashCode(this.isParallelDecodingRequired)) * 31) + Boolean.hashCode(this.enableDecoderFallback);
    }

    public final String toString() {
        int i = this.bufferMultiplier;
        boolean z = this.isParallelDecodingRequired;
        boolean z2 = this.enableDecoderFallback;
        StringBuilder sb = new StringBuilder("VideoPlaybackConfiguration(bufferMultiplier=");
        sb.append(i);
        sb.append(", isParallelDecodingRequired=");
        sb.append(z);
        sb.append(", enableDecoderFallback=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }
}
