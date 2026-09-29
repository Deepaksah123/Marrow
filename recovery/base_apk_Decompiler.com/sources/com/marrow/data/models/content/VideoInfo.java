package com.marrow.data.models.content;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.common.Editor;
import com.marrow.data.models.video.Subtitle;
import kotlin.isDvbProfileDeclared;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class VideoInfo extends VideoInfoMini {
    private static final String KEY_CORRECTION_NOTES = "video_subtitle";
    private static final String KEY_EDITOR_DETAIL = "editor_detail";
    private static final String KEY_ID = "_id";
    private static final String KEY_MEDIA_ID = "training_media_id";
    private static final String KEY_PSSH_DATA = "pssh_data";
    private static final String KEY_SOURCE_TYPE = "source_type";
    private static final String KEY_THUMBNAIL_HEIGHT = "theight";
    private static final String KEY_THUMBNAIL_URL = "thumbnail";
    private static final String KEY_THUMBNAIL_WIDTH = "twidth";
    private static final String KEY_TITLE = "title";

    @JsonProperty(KEY_CORRECTION_NOTES)
    private Subtitle[] mCorrectionNotes;

    @JsonProperty(KEY_EDITOR_DETAIL)
    private Editor mEditorDetail;

    @JsonProperty(KEY_SOURCE_TYPE)
    private String mSourceType;

    @JsonProperty(KEY_THUMBNAIL_HEIGHT)
    private int mThumbnailHeight;

    @JsonProperty("thumbnail")
    private String mThumbnailUrl;

    @JsonProperty(KEY_THUMBNAIL_WIDTH)
    private int mThumbnailWidth;

    @JsonProperty("title")
    private String mTitle;

    public String getThumbnailUrl() {
        return this.mThumbnailUrl;
    }

    public int getThumbnailWidth() {
        return this.mThumbnailWidth;
    }

    public void setThumbnailWidth(int i) {
        this.mThumbnailWidth = i;
    }

    public float getAspectRatio() {
        int i = this.mThumbnailWidth;
        return i == 0 ? BitmapDescriptorFactory.HUE_RED : this.mThumbnailHeight / i;
    }

    public Subtitle[] getCorrectionNotes() {
        return this.mCorrectionNotes;
    }

    public Editor getEditor() {
        return this.mEditorDetail;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public class JsonParser {
        public JsonParser() {
        }

        public void fromJSON(JSONObject jSONObject) {
            VideoInfo.this.mSourceType = jSONObject.optString(VideoInfo.KEY_SOURCE_TYPE);
            VideoInfo.this.mId = jSONObject.optString("_id");
            VideoInfo.this.mTitle = jSONObject.optString("title");
            VideoInfo.this.psshData = jSONObject.optString(VideoInfo.KEY_PSSH_DATA);
            VideoInfo.this.mThumbnailUrl = jSONObject.optString("thumbnail");
            VideoInfo.this.mThumbnailWidth = jSONObject.optInt(VideoInfo.KEY_THUMBNAIL_WIDTH);
            VideoInfo.this.mThumbnailHeight = jSONObject.optInt(VideoInfo.KEY_THUMBNAIL_HEIGHT);
            VideoInfo.this.mMediaId = jSONObject.optString(VideoInfo.KEY_MEDIA_ID);
            VideoInfo.this.mCorrectionNotes = Subtitle.fromJSON(jSONObject.optJSONArray(VideoInfo.KEY_CORRECTION_NOTES));
            VideoInfo.this.mEditorDetail = new Editor();
            VideoInfo.this.mEditorDetail.fromJSON(jSONObject.optJSONObject(VideoInfo.KEY_EDITOR_DETAIL));
        }

        public JSONObject toJSON() {
            JSONObject jSONObject = new JSONObject();
            isDvbProfileDeclared.write(jSONObject, VideoInfo.KEY_SOURCE_TYPE, VideoInfo.this.mSourceType);
            isDvbProfileDeclared.write(jSONObject, "_id", VideoInfo.this.mId);
            isDvbProfileDeclared.write(jSONObject, VideoInfo.KEY_MEDIA_ID, VideoInfo.this.mMediaId);
            isDvbProfileDeclared.write(jSONObject, "title", VideoInfo.this.mTitle);
            isDvbProfileDeclared.write(jSONObject, "thumbnail", VideoInfo.this.mThumbnailUrl);
            isDvbProfileDeclared.read(jSONObject, VideoInfo.KEY_THUMBNAIL_WIDTH, Integer.valueOf(VideoInfo.this.mThumbnailWidth));
            isDvbProfileDeclared.read(jSONObject, VideoInfo.KEY_THUMBNAIL_HEIGHT, Integer.valueOf(VideoInfo.this.mThumbnailHeight));
            isDvbProfileDeclared.write(jSONObject, VideoInfo.KEY_PSSH_DATA, VideoInfo.this.psshData);
            isDvbProfileDeclared.read(jSONObject, VideoInfo.KEY_EDITOR_DETAIL, VideoInfo.this.mEditorDetail.toJSON());
            isDvbProfileDeclared.write(jSONObject, VideoInfo.KEY_CORRECTION_NOTES, Subtitle.toJSON(VideoInfo.this.mCorrectionNotes));
            return jSONObject;
        }
    }
}
