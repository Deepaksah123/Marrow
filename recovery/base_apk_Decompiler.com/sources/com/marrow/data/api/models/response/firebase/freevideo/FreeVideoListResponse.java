package com.marrow.data.api.models.response.firebase.freevideo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.notifyManifestPublishTimeExpired;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\t\u0010\nR,\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 "}, d2 = {"Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoListResponse;", "Lo/notifyManifestPublishTimeExpired;", "<init>", "()V", "Lorg/json/JSONObject;", "toJson", "()Lorg/json/JSONObject;", "p0", "", "fromJSON", "(Lorg/json/JSONObject;)V", "", "Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoListResponse$Lesson;", "lessons", "[Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoListResponse$Lesson;", "getLessons", "()[Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoListResponse$Lesson;", "setLessons", "([Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoListResponse$Lesson;)V", "", "sort", "I", "getSort", "()I", "setSort", "(I)V", "", "title", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "Lesson"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreeVideoListResponse implements notifyManifestPublishTimeExpired {

    @JsonProperty("lessons")
    private Lesson[] lessons;

    @JsonProperty("sort")
    private int sort;

    @JsonProperty("title")
    private String title;

    public final Lesson[] getLessons() {
        return this.lessons;
    }

    public final void setLessons(Lesson[] lessonArr) {
        this.lessons = lessonArr;
    }

    public final int getSort() {
        return this.sort;
    }

    public final void setSort(int i) {
        this.sort = i;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R$\u0010\u001c\u001a\u0004\u0018\u00010\u00128\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018"}, d2 = {"Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoListResponse$Lesson;", "Lo/notifyManifestPublishTimeExpired;", "<init>", "()V", "Lorg/json/JSONObject;", "toJson", "()Lorg/json/JSONObject;", "p0", "", "fromJSON", "(Lorg/json/JSONObject;)V", "Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoListResponse$Lesson$Author;", "lessonAuthor", "Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoListResponse$Lesson$Author;", "getLessonAuthor", "()Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoListResponse$Lesson$Author;", "setLessonAuthor", "(Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoListResponse$Lesson$Author;)V", "", "lessonId", "Ljava/lang/String;", "getLessonId", "()Ljava/lang/String;", "setLessonId", "(Ljava/lang/String;)V", "subjectName", "getSubjectName", "setSubjectName", "lessonTitle", "getLessonTitle", "setLessonTitle", "Author"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Lesson implements notifyManifestPublishTimeExpired {

        @JsonProperty("author")
        private Author lessonAuthor;

        @JsonProperty("id")
        private String lessonId;

        @JsonProperty("title")
        private String lessonTitle;

        @JsonProperty("subject")
        private String subjectName;

        public final Author getLessonAuthor() {
            return this.lessonAuthor;
        }

        public final void setLessonAuthor(Author author) {
            this.lessonAuthor = author;
        }

        public final String getLessonId() {
            return this.lessonId;
        }

        public final void setLessonId(String str) {
            this.lessonId = str;
        }

        public final String getSubjectName() {
            return this.subjectName;
        }

        public final void setSubjectName(String str) {
            this.subjectName = str;
        }

        public final String getLessonTitle() {
            return this.lessonTitle;
        }

        public final void setLessonTitle(String str) {
            this.lessonTitle = str;
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011"}, d2 = {"Lcom/marrow/data/api/models/response/firebase/freevideo/FreeVideoListResponse$Lesson$Author;", "Lo/notifyManifestPublishTimeExpired;", "<init>", "()V", "Lorg/json/JSONObject;", "toJson", "()Lorg/json/JSONObject;", "p0", "", "fromJSON", "(Lorg/json/JSONObject;)V", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "imageUrl", "getImageUrl", "setImageUrl"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Author implements notifyManifestPublishTimeExpired {

            @JsonProperty("image")
            private String imageUrl;

            @JsonProperty("name")
            private String name;

            public final String getName() {
                return this.name;
            }

            public final void setName(String str) {
                this.name = str;
            }

            public final String getImageUrl() {
                return this.imageUrl;
            }

            public final void setImageUrl(String str) {
                this.imageUrl = str;
            }

            @JsonIgnore
            public final JSONObject toJson() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("name", this.name);
                    jSONObject.put("image", this.imageUrl);
                    return jSONObject;
                } catch (JSONException e) {
                    e.printStackTrace();
                    return jSONObject;
                }
            }

            @Override // kotlin.notifyManifestPublishTimeExpired
            @JsonIgnore
            public final void fromJSON(JSONObject p0) {
                if (p0 == null) {
                    return;
                }
                this.name = p0.optString("name");
                this.imageUrl = p0.optString("image");
            }
        }

        @JsonIgnore
        public final JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            try {
                Author author = this.lessonAuthor;
                jSONObject.put("author", author != null ? author.toJson() : null);
                jSONObject.put("id", this.lessonId);
                jSONObject.put("subject", this.subjectName);
                jSONObject.put("title", this.lessonTitle);
                return jSONObject;
            } catch (JSONException e) {
                e.printStackTrace();
                return jSONObject;
            }
        }

        @Override // kotlin.notifyManifestPublishTimeExpired
        @JsonIgnore
        public final void fromJSON(JSONObject p0) {
            if (p0 == null) {
                return;
            }
            this.lessonId = p0.optString("id");
            this.lessonTitle = p0.optString("title");
            this.subjectName = p0.optString("subject");
            Author author = new Author();
            this.lessonAuthor = author;
            author.fromJSON(p0.optJSONObject("author"));
        }
    }

    @JsonIgnore
    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sort", this.sort);
            jSONObject.put("title", this.title);
            Lesson[] lessonArr = this.lessons;
            if (lessonArr != null) {
                JSONArray jSONArray = new JSONArray();
                int length = lessonArr.length;
                for (int i = 0; i < length; i++) {
                    Lesson lesson = lessonArr[i];
                    jSONArray.put(lesson != null ? lesson.toJson() : null);
                }
                jSONObject.put("lessons", jSONArray);
            }
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    @Override // kotlin.notifyManifestPublishTimeExpired
    @JsonIgnore
    public final void fromJSON(JSONObject p0) {
        if (p0 != null) {
            this.sort = p0.optInt("sort");
            this.title = p0.optString("title");
            JSONArray jSONArrayOptJSONArray = p0.optJSONArray("lessons");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                Lesson[] lessonArr = new Lesson[length];
                for (int i = 0; i < length; i++) {
                    lessonArr[i] = new Lesson();
                }
                this.lessons = lessonArr;
                int length2 = jSONArrayOptJSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                    Lesson lesson = lessonArr[i2];
                    if (lesson != null) {
                        lesson.fromJSON(jSONObjectOptJSONObject);
                    }
                }
            }
        }
    }
}
