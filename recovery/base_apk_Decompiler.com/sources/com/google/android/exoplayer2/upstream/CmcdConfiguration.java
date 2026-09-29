package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.upstream.CmcdConfiguration;
import com.google.android.exoplayer2.util.Assertions;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.UUID;
import kotlin.onMoovContainerAtomRead;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class CmcdConfiguration {
    public static final String KEY_BITRATE = "br";
    public static final String KEY_BUFFER_LENGTH = "bl";
    public static final String KEY_CMCD_OBJECT = "CMCD-Object";
    public static final String KEY_CMCD_REQUEST = "CMCD-Request";
    public static final String KEY_CMCD_SESSION = "CMCD-Session";
    public static final String KEY_CMCD_STATUS = "CMCD-Status";
    public static final String KEY_CONTENT_ID = "cid";
    public static final String KEY_MAXIMUM_REQUESTED_BITRATE = "rtp";
    public static final String KEY_MEASURED_THROUGHPUT = "mtp";
    public static final String KEY_OBJECT_DURATION = "d";
    public static final String KEY_OBJECT_TYPE = "ot";
    public static final String KEY_SESSION_ID = "sid";
    public static final String KEY_STREAMING_FORMAT = "sf";
    public static final String KEY_STREAM_TYPE = "st";
    public static final String KEY_TOP_BITRATE = "tb";
    public static final String KEY_VERSION = "v";
    public static final int MAX_ID_LENGTH = 64;
    public final String contentId;
    public final RequestConfig requestConfig;
    public final String sessionId;

    /* JADX INFO: loaded from: classes.dex */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface CmcdKey {
    }

    /* JADX INFO: loaded from: classes.dex */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface HeaderKey {
    }

    public interface Factory {
        public static final Factory DEFAULT = new Factory() { // from class: com.google.android.exoplayer2.upstream.CmcdConfiguration$Factory$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.upstream.CmcdConfiguration.Factory
            public final CmcdConfiguration createCmcdConfiguration(MediaItem mediaItem) {
                return CmcdConfiguration.Factory.lambda$static$0(mediaItem);
            }
        };

        CmcdConfiguration createCmcdConfiguration(MediaItem mediaItem);

        static /* synthetic */ CmcdConfiguration lambda$static$0(MediaItem mediaItem) {
            String str;
            String string = UUID.randomUUID().toString();
            if (mediaItem.mediaId != null) {
                str = mediaItem.mediaId;
            } else {
                str = "";
            }
            return new CmcdConfiguration(string, str, new RequestConfig() { // from class: com.google.android.exoplayer2.upstream.CmcdConfiguration.Factory.1
            });
        }
    }

    public interface RequestConfig {
        default int getRequestedMaximumThroughputKbps(int i) {
            return C.RATE_UNSET_INT;
        }

        default boolean isKeyAllowed(String str) {
            return true;
        }

        default onMoovContainerAtomRead<String, String> getCustomData() {
            return onMoovContainerAtomRead.AudioAttributesCompatParcelizer();
        }
    }

    public CmcdConfiguration(String str, String str2, RequestConfig requestConfig) {
        Assertions.checkArgument(str == null || str.length() <= 64);
        Assertions.checkArgument(str2 == null || str2.length() <= 64);
        Assertions.checkNotNull(requestConfig);
        this.sessionId = str;
        this.contentId = str2;
        this.requestConfig = requestConfig;
    }

    public final boolean isBitrateLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("br");
    }

    public final boolean isBufferLengthLoggingAllowed() {
        return this.requestConfig.isKeyAllowed(KEY_BUFFER_LENGTH);
    }

    public final boolean isContentIdLoggingAllowed() {
        return this.requestConfig.isKeyAllowed(KEY_CONTENT_ID);
    }

    public final boolean isSessionIdLoggingAllowed() {
        return this.requestConfig.isKeyAllowed(KEY_SESSION_ID);
    }

    public final boolean isMaximumRequestThroughputLoggingAllowed() {
        return this.requestConfig.isKeyAllowed(KEY_MAXIMUM_REQUESTED_BITRATE);
    }

    public final boolean isStreamingFormatLoggingAllowed() {
        return this.requestConfig.isKeyAllowed(KEY_STREAMING_FORMAT);
    }

    public final boolean isStreamTypeLoggingAllowed() {
        return this.requestConfig.isKeyAllowed(KEY_STREAM_TYPE);
    }

    public final boolean isTopBitrateLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("tb");
    }

    public final boolean isObjectDurationLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("d");
    }

    public final boolean isMeasuredThroughputLoggingAllowed() {
        return this.requestConfig.isKeyAllowed(KEY_MEASURED_THROUGHPUT);
    }

    public final boolean isObjectTypeLoggingAllowed() {
        return this.requestConfig.isKeyAllowed(KEY_OBJECT_TYPE);
    }
}
