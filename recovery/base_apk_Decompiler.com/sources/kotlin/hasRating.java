package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class hasRating {
    public static final getAssociatedLessons write(getTopSection gettopsection, CourseConfigV2PlanScreenConfig courseConfigV2PlanScreenConfig, getMini getmini, getLessonActivityStatus getlessonactivitystatus, incrementTotalCount incrementtotalcount) {
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        toMagicModuleMetaRepoModel.write(courseConfigV2PlanScreenConfig, "");
        toMagicModuleMetaRepoModel.write(getmini, "");
        toMagicModuleMetaRepoModel.write(getlessonactivitystatus, "");
        toMagicModuleMetaRepoModel.write(incrementtotalcount, "");
        getAssociatedLessons getassociatedlessons = new getAssociatedLessons(gettopsection, courseConfigV2PlanScreenConfig, getmini, getlessonactivitystatus);
        getassociatedlessons.read(incrementtotalcount);
        return getassociatedlessons;
    }
}
