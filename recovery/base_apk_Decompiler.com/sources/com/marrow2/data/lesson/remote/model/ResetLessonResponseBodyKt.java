package com.marrow2.data.lesson.remote.model;

import kotlin.Metadata;
import kotlin.handleBeforeThrow;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow2/data/lesson/remote/model/ResetLessonResponseBody;", "Lo/handleBeforeThrow;", "toResetLessonRepoModel", "(Lcom/marrow2/data/lesson/remote/model/ResetLessonResponseBody;)Lo/handleBeforeThrow;"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ResetLessonResponseBodyKt {
    public static final handleBeforeThrow toResetLessonRepoModel(ResetLessonResponseBody resetLessonResponseBody) {
        toMagicModuleMetaRepoModel.write(resetLessonResponseBody, "");
        return new handleBeforeThrow(resetLessonResponseBody.isReset());
    }
}
