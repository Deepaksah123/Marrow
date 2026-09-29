package com.marrow.data.api.models.response.sync;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.exoplayer2.offline.DownloadService;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.parseDolbyChannelConfiguration;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CrossDeviceSyncResponseObject {
    public static final String CONTENT_TYPE_LESSON = "lesson";
    public static final String CONTENT_TYPE_TEST = "test";

    @JsonProperty(DownloadService.KEY_CONTENT_ID)
    public String contentId;

    @JsonProperty("content_type")
    public String contentType;

    @JsonProperty("data")
    public CrossDeviceSyncData innerData;

    @JsonProperty("last_updated")
    public long lastUpdated;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ContentType {
    }

    public boolean isContentTypeTest() {
        return parseDolbyChannelConfiguration.RemoteActionCompatParcelizer("test", this.contentType);
    }

    public boolean isContentTypeLesson() {
        return parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(CONTENT_TYPE_LESSON, this.contentType);
    }
}
