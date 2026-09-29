package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getVideo implements getFirstAttemptTime {
    public static final getVideo write = new getVideo();

    private getVideo() {
    }

    @Override // kotlin.getFirstAttemptTime
    public final void IconCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, List<String> list) {
        toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
        toMagicModuleMetaRepoModel.write(list, "");
        StringBuilder sb = new StringBuilder("Incomplete hierarchy for class ");
        sb.append(courseConfigV2CustomModuleQuestionSource.aQ_());
        sb.append(", unresolved classes ");
        sb.append(list);
        throw new IllegalStateException(sb.toString());
    }

    @Override // kotlin.getFirstAttemptTime
    public final void write(getTestHeaderTitle gettestheadertitle) {
        toMagicModuleMetaRepoModel.write(gettestheadertitle, "");
        throw new IllegalStateException("Cannot infer visibility for ".concat(String.valueOf(gettestheadertitle)));
    }
}
