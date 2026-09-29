package kotlin;

import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0012j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u0013H\u0007J\"\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0012j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u0013JN\u0010\u0015\u001a*\u0012\u0004\u0012\u00020\u0005\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0012j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001`\u00130\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aJ6\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u001d0\u00162\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/marrow2/ui/qbank/introduction/analytics/QbankScoreAnalytics;", "", "<init>", "()V", "EVENT_SOLVE_NEXT_MODULE", "", "PARAM_ORIGIN", "PARAM_ACTION", "KEY_QB_RESULT", "PERCENTAGE", "PERCENTILE", "KEY_QBANK_REVIEW", "LESSON_ID", "SUBJECT_ID", "SOURCE", "SOURCE_QBANK_RESULT", "THEME", "solveNextModuleClicked", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "recordHytTappedEvent", "recordResultScreenOpenedEvent", "Lkotlin/Pair;", "lessonId", "subjectId", "percentage", "", "percentile", "qbReviewClickEvent", "", "id", CourseConfigKeyConstantsKt.KEY_THEME, "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getAlgorithmIdAsInteger {
    public static final getAlgorithmIdAsInteger read = new getAlgorithmIdAsInteger();

    private getAlgorithmIdAsInteger() {
    }

    @getMagicModuleMeta
    public static final HashMap<String, String> write() {
        HashMap<String, String> map = new HashMap<>();
        map.put("action", "on_click");
        return map;
    }

    public static Pair<String, HashMap<String, Object>> write(String str, String str2, float f, float f2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        HashMap map = new HashMap();
        HashMap map2 = map;
        map2.put("lesson_id", str);
        map2.put("subject_id", str2);
        map2.put("percentage", Float.valueOf(f));
        map2.put("percentile", Float.valueOf(f2));
        return new Pair<>("qb_result", map);
    }

    public static Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer(String str, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        HashMap map = new HashMap();
        HashMap map2 = map;
        map2.put("lesson_id", str);
        map2.put("subject_id", str2);
        map2.put("source", "qb_result");
        String str4 = (String) TestGroupLSModel.write(str3, new String[]{".", "+"}, 0, 6).get(1);
        Locale locale = Locale.getDefault();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(locale, "");
        String lowerCase = str4.toLowerCase(locale);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        map2.put(CourseConfigKeyConstantsKt.KEY_THEME, lowerCase);
        return new Pair<>("qb_review", map);
    }
}
