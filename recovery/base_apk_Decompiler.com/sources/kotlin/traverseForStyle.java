package kotlin;

import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\n0\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\n0\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\n0\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ/\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\n0\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ?\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\n0\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/traverseForStyle;", "", "<init>", "()V", "", "p0", "p1", "p2", "p3", "Lo/getSubscriptionExpiresOn;", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/getSubscriptionExpiresOn;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)Lo/getSubscriptionExpiresOn;", "read", "write", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo/getSubscriptionExpiresOn;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class traverseForStyle {
    public static final traverseForStyle INSTANCE = new traverseForStyle();

    private traverseForStyle() {
    }

    @getMagicModuleMeta
    public static final Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer(String p0, String p1, String p2, String p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        Map mapRemoteActionCompatParcelizer = VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("lesson_id", p0), setAction.write("subject_id", p1), setAction.write("res", p2), setAction.write(CourseConfigKeyConstantsKt.KEY_THEME, p3));
        buildResolutionString.IconCompatParcelizer("darkmode-event", "video_download_start ->".concat(String.valueOf(mapRemoteActionCompatParcelizer)));
        return new Pair<>("video_download_start", mapRemoteActionCompatParcelizer);
    }

    @getMagicModuleMeta
    public static final Pair<String, Map<String, Object>> RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("video_download_pause", VideoTimelineResponseBody.read(setAction.write("lesson_id", p0)));
    }

    @getMagicModuleMeta
    public static final Pair<String, Map<String, Object>> read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("video_download_resume", VideoTimelineResponseBody.read(setAction.write("lesson_id", p0)));
    }

    @getMagicModuleMeta
    public static final Pair<String, Map<String, Object>> write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("video_download_delete", VideoTimelineResponseBody.read(setAction.write("lesson_id", p0)));
    }

    @getMagicModuleMeta
    public static final Pair<String, Map<String, Object>> write(String p0, String p1, String p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return new Pair<>("video_download_complete", VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write("lesson_id", p0), setAction.write("subject_id", p1), setAction.write("res", p2)));
    }
}
