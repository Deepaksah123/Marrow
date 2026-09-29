package com.marrow.data.api.models.response.lesson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LessonDynamicResponseBody {
    private static final String KEY_COURSE_ID = "course_id";
    private static final String KEY_ID = "_id";
    private static final String KEY_RATING = "rating";
    private static final String KEY_SOLVED = "solved";
    private static final String KEY_TOTAL_RATINGS = "total_ratings";

    @JsonProperty("course_id")
    public int courseId;

    @JsonProperty("_id")
    public String id;

    @JsonProperty(KEY_TOTAL_RATINGS)
    public int peopleRated;

    @JsonProperty(KEY_SOLVED)
    public int peopleSolved;

    @JsonProperty(KEY_RATING)
    public int ratingCount;

    public static String[] getIds(LessonDynamicResponseBody[] lessonDynamicResponseBodyArr) {
        if (lessonDynamicResponseBodyArr == null) {
            return null;
        }
        int length = lessonDynamicResponseBodyArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = lessonDynamicResponseBodyArr[i].id;
        }
        return strArr;
    }
}
