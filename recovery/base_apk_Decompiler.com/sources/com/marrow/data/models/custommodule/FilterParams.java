package com.marrow.data.models.custommodule;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.isDvbProfileDeclared;
import kotlin.parseLastSegmentNumberSupplementalProperty;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/marrow/data/models/custommodule/FilterParams;", "Ljava/io/Serializable;", "<init>", "()V", "", "isBookmarked", "Z", "", FilterParams.KEY_MODE, "I", "noOfQuestions", "wrong", "", "", FilterParams.KEY_SUBJECTS, "[Ljava/lang/String;", "rootSubjects", FilterParams.KEY_TAGS, "courseId", "Ljava/lang/String;", FilterParams.KEY_DIFFICULTY, "category", "categoryTypes", "includeUntagged", "getIncludeUntagged", "()Z", "setIncludeUntagged", "(Z)V", "Companion", "JsonParser"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FilterParams implements Serializable {
    public static final String KEY_BOOKMARKED = "bookmarked";
    public static final String KEY_CATEGORY = "category";
    public static final String KEY_CATEGORY_TYPES = "category_types";
    public static final String KEY_COURSE_ID = "course_id";
    public static final String KEY_DIFFICULTY = "difficulty";
    public static final String KEY_INCLUDE_UNGTAGGED = "include_untagged";
    public static final String KEY_MODE = "mode";
    public static final String KEY_NUM_QUESTIONS = "num_questions";
    public static final String KEY_ROOT_SUBJECTS = "root_subjects";
    public static final String KEY_SUBJECTS = "subjects";
    public static final String KEY_TAGS = "tags";
    public static final String KEY_WRONG = "wrong";
    public static final String SOURCE_ALL = "all";
    public static final String SOURCE_BOOKMARKED = "bookmarked";
    public static final String SOURCE_GRAND_TEST = "grand_test";
    public static final String SOURCE_QBANK = "qbank";

    @JsonProperty(KEY_COURSE_ID)
    public String courseId;

    @JsonProperty(KEY_DIFFICULTY)
    public String difficulty;

    @JsonProperty(KEY_INCLUDE_UNGTAGGED)
    private boolean includeUntagged;

    @JsonProperty("bookmarked")
    public boolean isBookmarked;

    @JsonProperty(KEY_MODE)
    public int mode;

    @JsonProperty(KEY_NUM_QUESTIONS)
    public int noOfQuestions;

    @JsonProperty("wrong")
    public boolean wrong;

    @JsonProperty(KEY_SUBJECTS)
    public String[] subjects = new String[0];

    @JsonProperty(KEY_ROOT_SUBJECTS)
    public String[] rootSubjects = new String[0];

    @JsonProperty(KEY_TAGS)
    public String[] tags = new String[0];

    @JsonProperty("category")
    public String category = "all";

    @JsonProperty(KEY_CATEGORY_TYPES)
    public String[] categoryTypes = new String[0];

    public final boolean getIncludeUntagged() {
        return this.includeUntagged;
    }

    public final void setIncludeUntagged(boolean z) {
        this.includeUntagged = z;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/marrow/data/models/custommodule/FilterParams$JsonParser;", "", "<init>", "()V", "", "p0", "Lcom/marrow/data/models/custommodule/FilterParams;", "fromJson", "(Ljava/lang/String;)Lcom/marrow/data/models/custommodule/FilterParams;", "toJson", "(Lcom/marrow/data/models/custommodule/FilterParams;)Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class JsonParser {
        public final FilterParams fromJson(String p0) {
            JSONObject jSONObjectAudioAttributesCompatParcelizer = parseLastSegmentNumberSupplementalProperty.AudioAttributesCompatParcelizer(p0);
            if (jSONObjectAudioAttributesCompatParcelizer == null) {
                return null;
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectAudioAttributesCompatParcelizer.optJSONArray(FilterParams.KEY_SUBJECTS);
            JSONArray jSONArrayOptJSONArray2 = jSONObjectAudioAttributesCompatParcelizer.optJSONArray(FilterParams.KEY_ROOT_SUBJECTS);
            JSONArray jSONArrayOptJSONArray3 = jSONObjectAudioAttributesCompatParcelizer.optJSONArray(FilterParams.KEY_TAGS);
            JSONArray jSONArrayOptJSONArray4 = jSONObjectAudioAttributesCompatParcelizer.optJSONArray(FilterParams.KEY_CATEGORY_TYPES);
            FilterParams filterParams = new FilterParams();
            filterParams.courseId = jSONObjectAudioAttributesCompatParcelizer.optString(FilterParams.KEY_COURSE_ID);
            filterParams.difficulty = jSONObjectAudioAttributesCompatParcelizer.optString(FilterParams.KEY_DIFFICULTY);
            String[] strArrRemoteActionCompatParcelizer = parseLastSegmentNumberSupplementalProperty.RemoteActionCompatParcelizer(jSONArrayOptJSONArray3);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strArrRemoteActionCompatParcelizer, "");
            filterParams.tags = strArrRemoteActionCompatParcelizer;
            String[] strArrRemoteActionCompatParcelizer2 = parseLastSegmentNumberSupplementalProperty.RemoteActionCompatParcelizer(jSONArrayOptJSONArray);
            if (strArrRemoteActionCompatParcelizer2 == null) {
                strArrRemoteActionCompatParcelizer2 = new String[0];
            }
            filterParams.subjects = strArrRemoteActionCompatParcelizer2;
            String[] strArrRemoteActionCompatParcelizer3 = parseLastSegmentNumberSupplementalProperty.RemoteActionCompatParcelizer(jSONArrayOptJSONArray2);
            if (strArrRemoteActionCompatParcelizer3 == null) {
                strArrRemoteActionCompatParcelizer3 = new String[0];
            }
            filterParams.rootSubjects = strArrRemoteActionCompatParcelizer3;
            filterParams.wrong = jSONObjectAudioAttributesCompatParcelizer.optBoolean("wrong");
            filterParams.isBookmarked = jSONObjectAudioAttributesCompatParcelizer.optBoolean("bookmarked");
            filterParams.mode = jSONObjectAudioAttributesCompatParcelizer.optInt(FilterParams.KEY_MODE);
            filterParams.noOfQuestions = jSONObjectAudioAttributesCompatParcelizer.optInt(FilterParams.KEY_NUM_QUESTIONS);
            String strOptString = jSONObjectAudioAttributesCompatParcelizer.optString("category");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString, "");
            filterParams.category = strOptString;
            if (jSONArrayOptJSONArray4 != null) {
                String[] strArrRemoteActionCompatParcelizer4 = parseLastSegmentNumberSupplementalProperty.RemoteActionCompatParcelizer(jSONArrayOptJSONArray4);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strArrRemoteActionCompatParcelizer4, "");
                filterParams.categoryTypes = strArrRemoteActionCompatParcelizer4;
            }
            filterParams.setIncludeUntagged(jSONObjectAudioAttributesCompatParcelizer.optBoolean(FilterParams.KEY_INCLUDE_UNGTAGGED));
            return filterParams;
        }

        public final String toJson(FilterParams p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            JSONObject jSONObject = new JSONObject();
            isDvbProfileDeclared.write(jSONObject, FilterParams.KEY_COURSE_ID, p0.courseId);
            isDvbProfileDeclared.read(jSONObject, FilterParams.KEY_TAGS, p0.tags);
            isDvbProfileDeclared.read(jSONObject, FilterParams.KEY_SUBJECTS, p0.subjects);
            isDvbProfileDeclared.write(jSONObject, FilterParams.KEY_DIFFICULTY, p0.difficulty);
            isDvbProfileDeclared.read(jSONObject, FilterParams.KEY_ROOT_SUBJECTS, p0.rootSubjects);
            isDvbProfileDeclared.AudioAttributesCompatParcelizer(jSONObject, "wrong", Boolean.valueOf(p0.wrong));
            isDvbProfileDeclared.AudioAttributesCompatParcelizer(jSONObject, "bookmarked", Boolean.valueOf(p0.isBookmarked));
            isDvbProfileDeclared.read(jSONObject, FilterParams.KEY_MODE, Integer.valueOf(p0.mode));
            isDvbProfileDeclared.read(jSONObject, FilterParams.KEY_NUM_QUESTIONS, Integer.valueOf(p0.noOfQuestions));
            isDvbProfileDeclared.write(jSONObject, "category", p0.category);
            isDvbProfileDeclared.read(jSONObject, FilterParams.KEY_CATEGORY_TYPES, p0.categoryTypes);
            isDvbProfileDeclared.AudioAttributesCompatParcelizer(jSONObject, FilterParams.KEY_INCLUDE_UNGTAGGED, Boolean.valueOf(p0.getIncludeUntagged()));
            String string = jSONObject.toString();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            return string;
        }
    }
}
