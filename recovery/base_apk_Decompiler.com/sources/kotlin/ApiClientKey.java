package kotlin;

import com.google.android.exoplayer2.offline.DownloadService;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u00042\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\nJ=\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u00042\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u000eJ5\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u00042\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u00042\u0006\u0010\t\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u00042\u0006\u0010\t\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013J5\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u00042\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0010J%\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u0004¢\u0006\u0004\b\u0012\u0010\bJ-\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u00042\u0006\u0010\t\u001a\u00020\u0011¢\u0006\u0004\b\u0007\u0010\u0013J-\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u00042\u0006\u0010\t\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0013J5\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u00042\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0010J-\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u00042\u0006\u0010\t\u001a\u00020\u0015¢\u0006\u0004\b\u000f\u0010\u0016J%\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0004\b\u000f\u0010\bJ%\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0004\b\u0014\u0010\b"}, d2 = {"Lo/ApiClientKey;", "", "<init>", "()V", "Lo/getSubscriptionExpiresOn;", "", "", "IconCompatParcelizer", "()Lo/getSubscriptionExpiresOn;", "p0", "(Ljava/lang/String;)Lo/getSubscriptionExpiresOn;", "", "p1", "p2", "(Ljava/lang/String;ILjava/lang/String;)Lo/getSubscriptionExpiresOn;", "write", "(Ljava/lang/String;Ljava/lang/String;)Lo/getSubscriptionExpiresOn;", "", "AudioAttributesCompatParcelizer", "(Z)Lo/getSubscriptionExpiresOn;", "read", "Lo/ApiClientKey$RemoteActionCompatParcelizer;", "(Lo/ApiClientKey$RemoteActionCompatParcelizer;)Lo/getSubscriptionExpiresOn;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ApiClientKey {
    public static final ApiClientKey INSTANCE = new ApiClientKey();

    private ApiClientKey() {
    }

    public static Pair<String, Map<String, String>> IconCompatParcelizer() {
        return new Pair<>("home feed", new HashMap());
    }

    public static Pair<String, Map<String, String>> IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        HashMap map = new HashMap();
        map.put("source", p0);
        return new Pair<>("bm_opened", map);
    }

    public static Pair<String, Map<String, String>> IconCompatParcelizer(String p0, int p1, String p2) {
        String str;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        HashMap map = new HashMap();
        switch (p1) {
            case 1:
                str = "Paused";
                break;
            case 2:
                str = "Next";
                break;
            case 3:
                str = "Saved";
                break;
            case 4:
                str = "free";
                break;
            case 5:
                str = "pro";
                break;
            case 6:
                str = "updated";
                break;
            default:
                str = "Default";
                break;
        }
        HashMap map2 = map;
        map2.put("category", p0);
        map2.put("card_reason", str);
        map2.put("contentid", p2);
        map2.put("source", "home_page");
        return new Pair<>("suggested_card", map);
    }

    public static Pair<String, Map<String, String>> write(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        HashMap map = new HashMap();
        HashMap map2 = map;
        map2.put("Category", p0);
        map2.put("contentid", p1);
        return new Pair<>("suggested_card", map);
    }

    public static Pair<String, Map<String, String>> AudioAttributesCompatParcelizer(boolean p0) {
        HashMap map = new HashMap();
        map.put("iscorrect", String.valueOf(p0));
        return new Pair<>("mcq_day_answered", map);
    }

    public static Pair<String, Map<String, String>> write(boolean p0) {
        HashMap map = new HashMap();
        map.put("iscorrect", String.valueOf(p0));
        return new Pair<>("mcq_day_explanation", map);
    }

    public static Pair<String, Map<String, String>> AudioAttributesCompatParcelizer(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        HashMap map = new HashMap();
        HashMap map2 = map;
        map2.put("Category", p0);
        map2.put("Action", p1);
        return new Pair<>(CourseConfigKeyConstantsKt.KEY_FEATURED_CARD, map);
    }

    public static Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer() {
        return new Pair<>("magic_module_fab_click", new HashMap());
    }

    public static Pair<String, Map<String, String>> IconCompatParcelizer(boolean p0) {
        HashMap map = new HashMap();
        map.put("answer_status", p0 ? "correct" : "wrong");
        return new Pair<>("mcq_of_the_day_answered", map);
    }

    public static Pair<String, Map<String, String>> read(boolean p0) {
        HashMap map = new HashMap();
        map.put("answer_status", p0 ? "correct" : "wrong");
        return new Pair<>("mcq_of_the_day_see_explanation", map);
    }

    public static Pair<String, Map<String, String>> read(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        HashMap map = new HashMap();
        HashMap map2 = map;
        map2.put("content_type", p1);
        map2.put(DownloadService.KEY_CONTENT_ID, p0);
        return new Pair<>("featured_card_opened", map);
    }

    public static Pair<String, Map<String, String>> write(RemoteActionCompatParcelizer p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("purchase_renew_banner_shown", VideoTimelineResponseBody.read(setAction.write("banner_type", p0.getAudioAttributesCompatParcelizer())));
    }

    public static Pair<String, Map<String, String>> write() {
        return new Pair<>("qb_practical_corner_opened", VideoTimelineResponseBody.read());
    }

    public static Pair<String, Map<String, String>> read() {
        return new Pair<>("edition_zen_tapped", VideoTimelineResponseBody.read());
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\b"}, d2 = {"Lo/ApiClientKey$RemoteActionCompatParcelizer;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "IconCompatParcelizer", "Ljava/lang/String;", "AudioAttributesCompatParcelizer", "()Ljava/lang/String;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private static final /* synthetic */ RemoteActionCompatParcelizer[] RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final String AudioAttributesCompatParcelizer;
        public static final RemoteActionCompatParcelizer read = new RemoteActionCompatParcelizer("BOTTOM_CARD", 0, "dismissible");
        public static final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer("FULL_PAGE", 1, "full_page_dismissible");

        private RemoteActionCompatParcelizer(String str, int i, String str2) {
            this.AudioAttributesCompatParcelizer = str2;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final String getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        static {
            RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArrWrite = write();
            RemoteActionCompatParcelizer = remoteActionCompatParcelizerArrWrite;
            getMagicModuleTimeline.IconCompatParcelizer(remoteActionCompatParcelizerArrWrite);
        }

        private static final /* synthetic */ RemoteActionCompatParcelizer[] write() {
            return new RemoteActionCompatParcelizer[]{read, AudioAttributesCompatParcelizer};
        }

        public static RemoteActionCompatParcelizer valueOf(String str) {
            return (RemoteActionCompatParcelizer) Enum.valueOf(RemoteActionCompatParcelizer.class, str);
        }

        public static RemoteActionCompatParcelizer[] values() {
            return (RemoteActionCompatParcelizer[]) RemoteActionCompatParcelizer.clone();
        }
    }
}
