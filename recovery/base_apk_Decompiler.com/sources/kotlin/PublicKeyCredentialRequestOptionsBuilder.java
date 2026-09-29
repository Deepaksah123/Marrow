package kotlin;

import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u00042\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJE\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u00042\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u00042\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\u0012J5\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u00042\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J?\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u00042\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0012"}, d2 = {"Lo/PublicKeyCredentialRequestOptionsBuilder;", "", "<init>", "()V", "Lo/getSubscriptionExpiresOn;", "", "", "AudioAttributesCompatParcelizer", "()Lo/getSubscriptionExpiresOn;", "p0", "", "p1", "write", "(Ljava/lang/String;I)Lo/getSubscriptionExpiresOn;", "p2", "p3", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lo/getSubscriptionExpiresOn;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/getSubscriptionExpiresOn;", "IconCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)Lo/getSubscriptionExpiresOn;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PublicKeyCredentialRequestOptionsBuilder {
    public static final PublicKeyCredentialRequestOptionsBuilder INSTANCE = new PublicKeyCredentialRequestOptionsBuilder();

    private PublicKeyCredentialRequestOptionsBuilder() {
    }

    public static Pair<String, Map<String, String>> AudioAttributesCompatParcelizer() {
        return new Pair<>("qb_review_start", new HashMap());
    }

    public static Pair<String, Map<String, String>> write(String p0, int p1) {
        String str = "";
        toMagicModuleMetaRepoModel.write(p0, "");
        HashMap map = new HashMap();
        HashMap map2 = map;
        map2.put("lesson_id", p0);
        switch (p1) {
            case 1:
                str = CourseConfigKeyConstantsKt.KEY_FEATURED_CARD;
                break;
            case 2:
                str = "suggested_modules";
                break;
            case 3:
                str = "concise_mode";
                break;
            case 4:
                str = "qbank_list";
                break;
            case 5:
                str = "solve_next_module";
                break;
            case 6:
                str = "search";
                break;
            case 7:
                str = CourseConfigKeyConstantsKt.KEY_RELATED_MODULE;
                break;
            case 8:
                str = "deeplink";
                break;
            case 9:
                str = CourseConfigKeyConstantsKt.KEY_CUSTOM_MODULE;
                break;
            case 11:
                str = "active_recall";
                break;
        }
        if (!parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) str)) {
            map2.put("source", str);
        }
        return new Pair<>("qb_play_start", map);
    }

    public static Pair<String, Map<String, Object>> RemoteActionCompatParcelizer(String p0, String p1, int p2, String p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        HashMap map = new HashMap();
        HashMap map2 = map;
        map2.put("lesson_id", p0);
        map2.put("subject_id", p1);
        map2.put("completion_status", Integer.valueOf(p2));
        String str = (String) TestGroupLSModel.write(p3, new String[]{".", "+"}, 0, 6).get(1);
        Locale locale = Locale.getDefault();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(locale, "");
        String lowerCase = str.toLowerCase(locale);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        map2.put(CourseConfigKeyConstantsKt.KEY_THEME, lowerCase);
        return new Pair<>("qb_solve", map);
    }

    public static Pair<String, Map<String, Object>> write(String p0, String p1, String p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        HashMap map = new HashMap();
        HashMap map2 = map;
        map2.put("lesson_id", p0);
        map2.put("subject_id", p1);
        map2.put("source", "qb_lesson_opened");
        String str = (String) TestGroupLSModel.write(p2, new String[]{".", "+"}, 0, 6).get(1);
        Locale locale = Locale.getDefault();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(locale, "");
        String lowerCase = str.toLowerCase(locale);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        map2.put(CourseConfigKeyConstantsKt.KEY_THEME, lowerCase);
        return new Pair<>("qb_review", map);
    }

    public static Pair<String, Map<String, String>> IconCompatParcelizer(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        HashMap map = new HashMap();
        HashMap map2 = map;
        map2.put("lesson_id", p0);
        map2.put("subject_id", p1);
        return new Pair<>("qb_lesson_bookmark", map);
    }

    public static Pair<String, Map<String, String>> RemoteActionCompatParcelizer(String p0, String p1, String p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        HashMap map = new HashMap();
        HashMap map2 = map;
        map2.put("lesson_id", p0);
        map2.put("subject_id", p1);
        if (p2 != null) {
            map2.put("source", p2);
        }
        return new Pair<>("qb_lesson_opened", map);
    }
}
