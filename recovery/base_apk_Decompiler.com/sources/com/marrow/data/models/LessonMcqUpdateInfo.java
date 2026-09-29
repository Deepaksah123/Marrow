package com.marrow.data.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonNode;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LessonMcqUpdateInfo {
    private static final long EPOCH_MAX = 2145916800000L;
    public static final String KEY_LESSON_ID = "lesson_id";
    public static final String KEY_MCQ_ID = "mcq_id";
    public static final String KEY_STATUS = "m_status";
    public static final String KEY_STATUS_END_TIME = "m_status_et";
    public static final String KEY_STATUS_START_TIME = "m_status_st";
    public String lessonId;
    public String mcqId;
    public String rootSubjectId;
    public long startTimeMs = 0;
    public long endTimeMs = EPOCH_MAX;
    public int status = 0;

    public @interface STATUS {
        public static final int NA = 0;
        public static final int NEW = 1;
        public static final int UPDATED = 2;
    }

    public static LessonMcqUpdateInfo from(String str, String str2, String str3, JsonNode jsonNode) {
        LessonMcqUpdateInfo lessonMcqUpdateInfo = new LessonMcqUpdateInfo();
        if (jsonNode.has(KEY_STATUS_END_TIME)) {
            lessonMcqUpdateInfo.endTimeMs = jsonNode.findValue(KEY_STATUS_END_TIME).asLong();
        }
        if (jsonNode.has(KEY_STATUS_START_TIME)) {
            lessonMcqUpdateInfo.startTimeMs = jsonNode.findValue(KEY_STATUS_START_TIME).asLong();
        }
        lessonMcqUpdateInfo.status = jsonNode.findValue(KEY_STATUS).asInt();
        lessonMcqUpdateInfo.mcqId = str3;
        lessonMcqUpdateInfo.lessonId = str2;
        lessonMcqUpdateInfo.rootSubjectId = str;
        return lessonMcqUpdateInfo;
    }
}
