package com.marrow.data.api.models.response.firebase;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FirebaseSyncResponse implements Serializable {

    @JsonProperty("data")
    public Data data;

    @JsonProperty("success")
    public boolean isSuccess;

    @JsonProperty("versions")
    public Version versions;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Data implements Serializable {

        @JsonProperty("buy_now_banner")
        public BuynowBannerResponse buynowBannerResponse;

        @JsonProperty(CourseConfigKeyConstantsKt.KEY_NOTES)
        public NotesResponse[] notesResponse;

        @JsonProperty("plans")
        public PlanResponse planResponse;

        @JsonProperty("slides")
        public SlidesResponse[] slidesResponse;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Version implements Serializable {

        @JsonProperty("buynow_bannner_version")
        public int buynowBannerVersion;

        @JsonProperty("know_more_version")
        public int knowMoreVersion;

        @JsonProperty("notes_version")
        public int notesVersion;

        @JsonProperty("plans_version")
        public int plansVersion;

        @JsonProperty("slides_version")
        public int slidesVersion;

        @JsonProperty("woq_marrowthon_version")
        public int woqMarrowthonVersion;
    }
}
