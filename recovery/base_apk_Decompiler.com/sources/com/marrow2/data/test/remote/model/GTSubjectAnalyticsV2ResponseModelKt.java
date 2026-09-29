package com.marrow2.data.test.remote.model;

import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow2/data/test/remote/model/WeakLessonV2ResponseModel;", "Lcom/marrow2/data/test/remote/model/WeakLessonV2RSModel;", "toRSModel", "(Lcom/marrow2/data/test/remote/model/WeakLessonV2ResponseModel;)Lcom/marrow2/data/test/remote/model/WeakLessonV2RSModel;"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class GTSubjectAnalyticsV2ResponseModelKt {
    public static final WeakLessonV2RSModel toRSModel(WeakLessonV2ResponseModel weakLessonV2ResponseModel) {
        toMagicModuleMetaRepoModel.write(weakLessonV2ResponseModel, "");
        return new WeakLessonV2RSModel(weakLessonV2ResponseModel.getTitle());
    }
}
