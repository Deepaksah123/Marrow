package kotlin;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u0004¢\u0006\u0004\b\t\u0010\bJ/\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u00042\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u000bJ%\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u0004¢\u0006\u0004\b\f\u0010\bJ%\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u0004¢\u0006\u0004\b\r\u0010\bJ/\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u00042\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ%\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u0004¢\u0006\u0004\b\u000f\u0010\bJ-\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u00042\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\u000bJ-\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u00042\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000bJ%\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u0004¢\u0006\u0004\b\u0010\u0010\bJ%\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00060\u0004¢\u0006\u0004\b\u000e\u0010\b"}, d2 = {"Lo/getInfoWindowAnchorV;", "", "<init>", "()V", "Lo/getSubscriptionExpiresOn;", "", "", "AudioAttributesCompatParcelizer", "()Lo/getSubscriptionExpiresOn;", "IconCompatParcelizer", "p0", "(Ljava/lang/String;)Lo/getSubscriptionExpiresOn;", "RemoteActionCompatParcelizer", "write", "read", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getInfoWindowAnchorV {
    public static final getInfoWindowAnchorV INSTANCE = new getInfoWindowAnchorV();

    private getInfoWindowAnchorV() {
    }

    public static Pair<String, Map<String, Object>> AudioAttributesCompatParcelizer() {
        return IconCompatParcelizer("email");
    }

    public static Pair<String, Map<String, Object>> IconCompatParcelizer() {
        return IconCompatParcelizer("google");
    }

    private static Pair<String, Map<String, Object>> IconCompatParcelizer(String p0) {
        return new Pair<>("signup_attempted", VideoTimelineResponseBody.read(setAction.write("source", p0)));
    }

    public static Pair<String, Map<String, Object>> RemoteActionCompatParcelizer() {
        return read("email");
    }

    public static Pair<String, Map<String, Object>> write() {
        return read("google");
    }

    private static Pair<String, Map<String, Object>> read(String p0) {
        return new Pair<>("signup_successful", VideoTimelineResponseBody.read(setAction.write("source", p0)));
    }

    public static Pair<String, Map<String, Object>> AudioAttributesImplBaseParcelizer() {
        return new Pair<>("signup_course_selected", VideoTimelineResponseBody.read());
    }

    public static Pair<String, Map<String, Object>> RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("signup_college_selected", VideoTimelineResponseBody.read(setAction.write("college_id", p0)));
    }

    public static Pair<String, Map<String, Object>> write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Pair<>("signup_yoa_selected", VideoTimelineResponseBody.read(setAction.write("yoa", p0)));
    }

    public static Pair<String, Map<String, Object>> MediaBrowserCompatItemReceiver() {
        return new Pair<>("signup_link_phone_number", VideoTimelineResponseBody.read());
    }

    public static Pair<String, Map<String, Object>> read() {
        return new Pair<>("signup_link_phone_number_popup", VideoTimelineResponseBody.read());
    }
}
