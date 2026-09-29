package com.marrow.data.api.models.request.lesson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.request.MarrowRequestBody;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/marrow/data/api/models/request/lesson/LessonDynamicApiRequestBody;", "Lcom/marrow/data/api/models/request/MarrowRequestBody;", "", "p0", "", "", "p1", "<init>", "(ILjava/util/List;)V", "lessonIds", "Ljava/util/List;", "getLessonIds", "()Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LessonDynamicApiRequestBody extends MarrowRequestBody {
    private final List<String> lessonIds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonDynamicApiRequestBody(int i, List<String> list) {
        super(i);
        toMagicModuleMetaRepoModel.write(list, "");
        this.lessonIds = list;
    }

    public /* synthetic */ LessonDynamicApiRequestBody(int i, List list, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(i, (i2 & 2) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list);
    }

    @JsonProperty("_id")
    public final List<String> getLessonIds() {
        return this.lessonIds;
    }
}
