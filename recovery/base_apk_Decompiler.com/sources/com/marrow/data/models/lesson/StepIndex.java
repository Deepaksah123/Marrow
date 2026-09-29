package com.marrow.data.models.lesson;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;
import com.marrow.data.models.video.Timeline;

/* JADX INFO: loaded from: classes.dex */
public class StepIndex {
    private static final String KEY_BODY_ENCRYPT = "step_encrypt";
    private static final String KEY_COURSE_ID = "course_id";
    private static final String KEY_ID = "_id";
    private static final String KEY_LESSON_ID = "lesson_id";
    private static final String KEY_NOTES_COUNT = "notes_count";
    private static final String KEY_READ_TIME = "read_time";
    private static final String KEY_SLIDES_COUNT = "slides_count";
    private static final String KEY_STATUS = "status";
    private static final String KEY_STEP_TYPE = "step_type";
    private static final String KEY_TITLE = "title";
    public static final String KEY_VIDEO_ASPECT = "video_aspect_ratio";
    private static final String KEY_VIDEO_ENCRYPT = "video_encrypt";
    private static final String KEY_VIDEO_META_ENCRYPT = "video_meta_enc";
    private static final String KEY_VIDEO_TIMELINE = "video_timeline";

    @JsonProperty("course_id")
    public int mCourseId;

    @JsonProperty("_id")
    private String mId;

    @JsonProperty("lesson_id")
    private String mLessonId;

    @JsonProperty(KEY_READ_TIME)
    private String mReadTime;
    private boolean mResumeExplanation;

    @JsonProperty("status")
    public int mStatus;

    @JsonProperty(KEY_BODY_ENCRYPT)
    public String mStepEncryptBody;

    @JsonProperty(KEY_STEP_TYPE)
    public int mStepType;

    @JsonProperty("title")
    private String mTitle;

    @JsonProperty(KEY_VIDEO_META_ENCRYPT)
    public String mVideoMetaEncrypt;

    @JsonProperty("video_context_android")
    private RemoteActionCompatParcelizer videoContext;

    @JsonProperty(KEY_VIDEO_ENCRYPT)
    public String videoEncrypt;

    @JsonProperty(KEY_VIDEO_TIMELINE)
    public Timeline[] videoTimelines;

    @JsonProperty(KEY_SLIDES_COUNT)
    private int slidesCount = 0;

    @JsonProperty(KEY_NOTES_COUNT)
    private int notesCount = 0;

    @JsonIgnore
    private double videoAspectRatio = 0.5d;

    static class RemoteActionCompatParcelizer {

        @JsonProperty("p_data")
        public String AudioAttributesCompatParcelizer;

        private RemoteActionCompatParcelizer() {
        }

        /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }
    }

    @JsonSetter(KEY_VIDEO_ASPECT)
    public void getAspectRatio(JsonNode jsonNode) {
        String strAsText = jsonNode.asText();
        if (strAsText.isEmpty() || !strAsText.matches("\\d+:\\d+")) {
            return;
        }
        String[] strArrSplit = strAsText.split(":");
        setVideoAspectRatio(Double.parseDouble(strArrSplit[1]) / Double.parseDouble(strArrSplit[0]));
    }

    public String getId() {
        return this.mId;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setVideoAspectRatio(double d) {
        this.videoAspectRatio = d;
    }

    public double getVideoAspectRatio() {
        return this.videoAspectRatio;
    }

    public boolean isAspectRatioValid() {
        return this.videoAspectRatio > 0.0d;
    }

    public String getRelatedLessonId() {
        return this.mLessonId;
    }

    public void setRelatedLessonId(String str) {
        this.mLessonId = str;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public int getStepType() {
        return this.mStepType;
    }

    public void setStepType(int i) {
        this.mStepType = i;
    }

    public String getReadTime() {
        return this.mReadTime;
    }

    public void setReadTime(String str) {
        this.mReadTime = str;
    }

    public boolean isMcq() {
        return 1 == this.mStepType;
    }

    public int getCourseId() {
        return this.mCourseId;
    }

    public void setCourseId(int i) {
        this.mCourseId = i;
    }

    public boolean isResumeExplanation() {
        return this.mResumeExplanation;
    }

    public void setResumeExplanation(boolean z) {
        this.mResumeExplanation = z;
    }

    public String getVideoEncryptBody() {
        return this.videoEncrypt;
    }

    public String getPsshData() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.videoContext;
        if (remoteActionCompatParcelizer != null) {
            return remoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        }
        return null;
    }

    public void setPsshData(String str) {
        if (this.videoContext == null) {
            this.videoContext = new RemoteActionCompatParcelizer((byte) 0);
        }
        this.videoContext.AudioAttributesCompatParcelizer = str;
    }

    public void setVideoMetaEncrypt(String str) {
        this.mVideoMetaEncrypt = str;
    }

    public String getVideoMetaEncrypt() {
        return this.mVideoMetaEncrypt;
    }

    public void setSlidesCount(int i) {
        this.slidesCount = i;
    }

    public int getSlidesCount() {
        return this.slidesCount;
    }

    public void setNotesCount(int i) {
        this.notesCount = i;
    }

    public int getNotesCount() {
        return this.notesCount;
    }
}
