package com.marrow.data.api.models.response.lesson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.response.lesson.step.StepResponseBody;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LessonResponseBody extends LessonIndexResponseBody {

    @JsonProperty("steps")
    public StepResponseBody[] steps;

    @JsonProperty("stub_articles")
    public List<StubResponseBody> stubsArticles = new ArrayList();

    @JsonProperty("interactive_video_elements")
    public List<InteractiveVideoElementRSModel> interactiveVideoElementsList = new ArrayList();
}
