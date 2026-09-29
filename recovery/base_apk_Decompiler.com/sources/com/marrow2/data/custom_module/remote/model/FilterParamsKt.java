package com.marrow2.data.custom_module.remote.model;

import kotlin.Metadata;
import kotlin.getOrderDetails;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b\"\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\b\"\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\b"}, d2 = {"Lcom/marrow/data/models/custommodule/FilterParams;", "Lcom/marrow2/data/custom_module/remote/model/FilterParams;", "toLSModel", "(Lcom/marrow/data/models/custommodule/FilterParams;)Lcom/marrow2/data/custom_module/remote/model/FilterParams;", "toOldModel", "(Lcom/marrow2/data/custom_module/remote/model/FilterParams;)Lcom/marrow/data/models/custommodule/FilterParams;", "", "SOURCE_ALL", "Ljava/lang/String;", "SOURCE_QBANK", "SOURCE_BOOKMARKED", "SOURCE_GRAND_TEST"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class FilterParamsKt {
    public static final String SOURCE_ALL = "all";
    public static final String SOURCE_BOOKMARKED = "bookmarked";
    public static final String SOURCE_GRAND_TEST = "grand_test";
    public static final String SOURCE_QBANK = "qbank";

    public static final FilterParams toLSModel(com.marrow.data.models.custommodule.FilterParams filterParams) {
        toMagicModuleMetaRepoModel.write(filterParams, "");
        return new FilterParams(filterParams.isBookmarked, filterParams.mode, filterParams.noOfQuestions, filterParams.wrong, getOrderDetails.onCommand(filterParams.subjects), getOrderDetails.onCommand(filterParams.rootSubjects), getOrderDetails.onCommand(filterParams.tags), filterParams.courseId, filterParams.difficulty, filterParams.category, getOrderDetails.onCommand(filterParams.categoryTypes), filterParams.getIncludeUntagged());
    }

    public static final com.marrow.data.models.custommodule.FilterParams toOldModel(FilterParams filterParams) {
        toMagicModuleMetaRepoModel.write(filterParams, "");
        com.marrow.data.models.custommodule.FilterParams filterParams2 = new com.marrow.data.models.custommodule.FilterParams();
        filterParams2.isBookmarked = filterParams.isBookmarked();
        filterParams2.mode = filterParams.getMode();
        filterParams2.noOfQuestions = filterParams.getNoOfQuestions();
        filterParams2.wrong = filterParams.getWrong();
        filterParams2.subjects = (String[]) filterParams.getSubjects().toArray(new String[0]);
        filterParams2.rootSubjects = (String[]) filterParams.getRootSubjects().toArray(new String[0]);
        filterParams2.tags = (String[]) filterParams.getTags().toArray(new String[0]);
        filterParams2.courseId = filterParams.getCourseId();
        filterParams2.difficulty = filterParams.getDifficulty();
        filterParams2.category = filterParams.getCategory();
        filterParams2.setIncludeUntagged(filterParams.getIncludeUntagged());
        filterParams2.categoryTypes = (String[]) filterParams.getCategoryTypes().toArray(new String[0]);
        return filterParams2;
    }
}
