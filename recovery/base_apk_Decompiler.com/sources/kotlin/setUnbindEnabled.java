package kotlin;

import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@submitMagicModule
public final class setUnbindEnabled {
    private final Bundle read;

    public static final List<String> write(Bundle bundle, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return bundle.getStringArrayList(str);
    }

    public static final Bundle read(Bundle bundle, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        setTouchEnabled.write(str);
        throw new PlanDetailsCreator();
    }

    public static final Bundle AudioAttributesCompatParcelizer(Bundle bundle, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return bundle.getBundle(str);
    }

    public static final boolean write(Bundle bundle) {
        return bundle.isEmpty();
    }

    public static final boolean RemoteActionCompatParcelizer(Bundle bundle, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return bundle.containsKey(str);
    }

    public static final Map<String, Object> AudioAttributesCompatParcelizer(Bundle bundle) {
        Map mapIconCompatParcelizer = VideoTimelineResponseBody.IconCompatParcelizer(bundle.size());
        for (String str : bundle.keySet()) {
            toMagicModuleMetaRepoModel.write((Object) str);
            mapIconCompatParcelizer.put(str, bundle.get(str));
        }
        return VideoTimelineResponseBody.read(mapIconCompatParcelizer);
    }

    public static Bundle RemoteActionCompatParcelizer(Bundle bundle) {
        toMagicModuleMetaRepoModel.write(bundle, "");
        return bundle;
    }

    private static boolean read(Bundle bundle, Object obj) {
        return (obj instanceof setUnbindEnabled) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(bundle, ((setUnbindEnabled) obj).write());
    }

    private static int read(Bundle bundle) {
        return bundle.hashCode();
    }

    private static String IconCompatParcelizer(Bundle bundle) {
        StringBuilder sb = new StringBuilder("SavedStateReader(source=");
        sb.append(bundle);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        return read(this.read, obj);
    }

    public final int hashCode() {
        return read(this.read);
    }

    public final String toString() {
        return IconCompatParcelizer(this.read);
    }

    private /* synthetic */ Bundle write() {
        return this.read;
    }
}
