package com.marrow.data.api.models.response.lesson;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.marrow.data.models.LessonMcqUpdateInfo;
import com.marrow.data.models.lesson.LessonIndex;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LessonIndexResponseBody extends LessonIndex {
    private static final String KEY_MCQ_UPDATES = "mcq_updates";

    @JsonIgnore
    private LessonMcqUpdateInfo[] mMcqUpdates;

    @Override // com.marrow.data.models.lesson.LessonIndex
    public void setId(JsonNode jsonNode) {
        super.setId(jsonNode);
        LessonMcqUpdateInfo[] lessonMcqUpdateInfoArr = this.mMcqUpdates;
        if (lessonMcqUpdateInfoArr != null) {
            for (LessonMcqUpdateInfo lessonMcqUpdateInfo : lessonMcqUpdateInfoArr) {
                lessonMcqUpdateInfo.lessonId = this.mId;
            }
        }
    }

    @Override // com.marrow.data.models.lesson.LessonIndex
    public void setRootSubjectId(JsonNode jsonNode) {
        super.setRootSubjectId(jsonNode);
        LessonMcqUpdateInfo[] lessonMcqUpdateInfoArr = this.mMcqUpdates;
        if (lessonMcqUpdateInfoArr != null) {
            for (LessonMcqUpdateInfo lessonMcqUpdateInfo : lessonMcqUpdateInfoArr) {
                lessonMcqUpdateInfo.rootSubjectId = this.mRootSubjectId;
            }
        }
    }

    @JsonProperty(KEY_MCQ_UPDATES)
    public void setUpdates(JsonNode jsonNode) {
        if (jsonNode.isArray()) {
            return;
        }
        Iterator<String> itFieldNames = jsonNode.fieldNames();
        ArrayList arrayList = new ArrayList();
        while (itFieldNames.hasNext()) {
            String next = itFieldNames.next();
            JsonNode jsonNodeFindValue = jsonNode.findValue(next);
            if (jsonNodeFindValue != null) {
                arrayList.add(LessonMcqUpdateInfo.from(this.mRootSubjectId, this.mId, next, jsonNodeFindValue));
            }
        }
        this.mMcqUpdates = (LessonMcqUpdateInfo[]) arrayList.toArray(new LessonMcqUpdateInfo[arrayList.size()]);
    }

    public LessonMcqUpdateInfo[] getUpdates() {
        return this.mMcqUpdates;
    }
}
