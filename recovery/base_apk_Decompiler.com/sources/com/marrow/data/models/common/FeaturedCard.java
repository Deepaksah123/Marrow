package com.marrow.data.models.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.home.HomeCardModel;
import com.marrow.data.models.mcq.McqIndex;
import java.io.Serializable;
import kotlin.PlayerEmsgHandlerManifestExpiryEventInfo;
import kotlin.parseDolbyChannelConfiguration;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeaturedCard implements PlayerEmsgHandlerManifestExpiryEventInfo {
    private static final String KEY_CONTENT_DETAILS = "content_details";
    private static final String KEY_CONTENT_ID = "content_id";
    private static final String KEY_CONTENT_STEP_IDS = "content_step_ids";
    private static final String KEY_CONTENT_TYPE = "content_type";
    private static final String KEY_COURSE_ID = "course_id";
    private static final String KEY_ID = "_id";
    private static final String KEY_LABEL = "label";
    private static final String KEY_SORT_ORDER = "sort_order";
    private static final String KEY_SUB_CONTENT_ID = "sub_content_id";
    private static final String KEY_SUB_CONTENT_TYPE = "sub_content_type";
    private static final String KEY_SUB_TITLE = "sub_title";
    private static final String KEY_THUMBNAIL = "thumbnail";
    private static final String KEY_THUMBNAIL_HEIGHT = "t_height";
    private static final String KEY_THUMBNAIL_WIDTH = "t_width";
    private static final String KEY_TITLE = "title";

    @JsonProperty("_id")
    public String _id;

    @JsonProperty("content_id")
    public String contentId;

    @JsonProperty(KEY_CONTENT_STEP_IDS)
    public String[] contentStepIds;

    @JsonProperty("title")
    public String contentTitle;

    @JsonProperty(KEY_CONTENT_TYPE)
    public String contentType;

    @JsonProperty("course_id")
    public String courseId;

    @JsonProperty("label")
    public Label label;

    @JsonProperty(KEY_CONTENT_DETAILS)
    public McqIndex mcqContentDetails;

    @JsonProperty("published_status")
    public String publishedStatus;

    @JsonProperty(KEY_SORT_ORDER)
    public int sortOrder;

    @JsonProperty(KEY_SUB_CONTENT_ID)
    public String subContentId;

    @JsonProperty(KEY_SUB_CONTENT_TYPE)
    public String subContentType;

    @JsonProperty(KEY_SUB_TITLE)
    public String subTitle;

    @JsonProperty("thumbnail")
    public String thumbnail;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Label implements Serializable {
        private static final String KEY_BG_COLOR = "bgcolor";
        private static final String KEY_COLOR = "color";
        private static final String KEY_TEXT = "text";

        @JsonProperty(KEY_BG_COLOR)
        public String bgColor;

        @JsonProperty("color")
        public String color;

        @JsonProperty("text")
        public String text;
    }

    @Override // kotlin.PlayerEmsgHandlerManifestExpiryEventInfo
    public boolean isPublished() {
        return parseDolbyChannelConfiguration.RemoteActionCompatParcelizer("published", this.publishedStatus);
    }

    public String getPublishedStatus() {
        return this.publishedStatus;
    }

    public void setPublishedStatus(String str) {
        this.publishedStatus = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof FeaturedCard) {
            return parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(((FeaturedCard) obj)._id, this._id);
        }
        return super.equals(obj);
    }

    public int getCourseIdInt() {
        try {
            return Integer.parseInt(this.courseId);
        } catch (Exception unused) {
            return 1;
        }
    }

    public static FeaturedCard from(HomeCardModel homeCardModel) {
        FeaturedCard featuredCard = new FeaturedCard();
        featuredCard._id = homeCardModel._id;
        featuredCard.courseId = String.valueOf(homeCardModel.courseId);
        featuredCard.contentType = homeCardModel.contentType;
        featuredCard.contentId = homeCardModel.contentId;
        featuredCard.subContentType = homeCardModel.subContentType;
        featuredCard.subContentId = homeCardModel.subContentId;
        featuredCard.contentTitle = homeCardModel.contentTitle;
        featuredCard.subTitle = homeCardModel.subTitle;
        featuredCard.thumbnail = homeCardModel.thumbnail;
        featuredCard.contentStepIds = new String[]{homeCardModel.stepId};
        if (homeCardModel.isLabelVisibile) {
            Label label = new Label();
            featuredCard.label = label;
            label.text = homeCardModel.labelText;
            featuredCard.label.color = homeCardModel.labelTextColor;
            featuredCard.label.bgColor = homeCardModel.labelBackgroundColor;
        }
        return featuredCard;
    }
}
