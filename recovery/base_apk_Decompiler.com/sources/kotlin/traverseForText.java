package kotlin;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/traverseForText;", "", "<init>", "()V", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class traverseForText {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o.traverseForText$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JJ\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0007JH\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00190\u00182\u0006\u0010 \u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"H\u0007J@\u0010#\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00190\u00182\u0006\u0010 \u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005H\u0007JH\u0010$\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005H\u0007J(\u0010'\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u0005H\u0007JN\u0010(\u001a*\u0012\u0004\u0012\u00020\u0005\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010)j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001`*0\u00182\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020+2\u0006\u0010,\u001a\u00020+R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/marrow/ui/activities/learn/video/active_recall/ActiveRecallAnalytics$Companion;", "", "<init>", "()V", "EVENT_NAME_LESSON_OPENED", "", "EVENT_NAME_LESSON_SOLVED", "EVENT_NAME_LESSON_SUBMIT", "EVENT_NAME_LESSON_REVIEW", "EVENT_NAME_AR_RESULT", "SOURCE_PORTRAIT", "SOURCE_LANDSCAPE_VIDEO_MID", "SOURCE_LANDSCAPE_VIDEO_END", "SOURCE_VIDEO_SIDE_PANEL", "LESSON_ID", "ROOT_SUBJECT_ID", "CHILD_SUBJECT_ID", "CHILD_SUBJECT_TITLE", "SOURCE", "CORRECT_SCORE", "COMPLETION_STATUS", "PERCENTAGE", "PERCENTILE", "onVideoLessonOpened", "Lkotlin/Pair;", "", "lessonId", "rootSubjectId", "childSubjectId", "childSubjectTitle", "source", "onActiveModuleSolve", "id", "completionStatus", "", "onActieModuleReview", "onActiveModuleSubmit", "subjectId", "percentage", "onVideoReplayed", "recordResultScreenOpenedEvent", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "", "percentile", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer(String str, String str2, String str3, String str4, String str5) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            toMagicModuleMetaRepoModel.write(str4, "");
            Map mapWrite = VideoTimelineResponseBody.write(setAction.write("lesson_id", str), setAction.write("subject_id", str2), setAction.write("child_subject_id", str3), setAction.write("child_subject_title", str4));
            if (str5 != null) {
                mapWrite.put("source", str5);
            }
            return setAction.write("ar_lesson_opened", mapWrite);
        }

        @getMagicModuleMeta
        public static Pair<String, Map<String, Object>> read(String str, String str2, String str3, String str4, int i) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            toMagicModuleMetaRepoModel.write(str4, "");
            HashMap map = new HashMap();
            HashMap map2 = map;
            map2.put("lesson_id", str);
            map2.put("subject_id", str2);
            map2.put("child_subject_id", str3);
            map2.put("child_subject_title", str4);
            map2.put("completion_status", Integer.valueOf(i));
            return new Pair<>("ar_solve", map);
        }

        @getMagicModuleMeta
        public static Pair<String, Map<String, Object>> RemoteActionCompatParcelizer(String str, String str2, String str3, String str4) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            toMagicModuleMetaRepoModel.write(str4, "");
            HashMap map = new HashMap();
            HashMap map2 = map;
            map2.put("lesson_id", str);
            map2.put("subject_id", str2);
            map2.put("child_subject_id", str3);
            map2.put("child_subject_title", str4);
            return new Pair<>("ar_review", map);
        }

        @getMagicModuleMeta
        public static Pair<String, Map<String, String>> read(String str, String str2, int i, String str3, String str4) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            toMagicModuleMetaRepoModel.write(str4, "");
            HashMap map = new HashMap();
            HashMap map2 = map;
            map2.put("lesson_id", str);
            map2.put("ar_correct", String.valueOf(i));
            map2.put("subject_id", str2);
            map2.put("child_subject_id", str3);
            map2.put("child_subject_title", str4);
            return new Pair<>("ar_submit", map);
        }

        @getMagicModuleMeta
        public static Pair<String, Map<String, String>> IconCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            HashMap map = new HashMap();
            map.put("lesson_id", str);
            return new Pair<>("video_replay", map);
        }

        public static Pair<String, HashMap<String, Object>> AudioAttributesCompatParcelizer(String str, String str2, float f, float f2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            HashMap map = new HashMap();
            HashMap map2 = map;
            map2.put("lesson_id", str);
            map2.put("subject_id", str2);
            map2.put("percentage", Float.valueOf(f));
            map2.put("percentile", Float.valueOf(f2));
            return new Pair<>("ar_result", map);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
