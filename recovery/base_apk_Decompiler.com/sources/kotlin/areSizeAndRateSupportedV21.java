package kotlin;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class areSizeAndRateSupportedV21 {
    public static final long IconCompatParcelizer = TimeUnit.MINUTES.toMillis(3);

    public static final class write {
        public static setTitleOptional<String, String> RemoteActionCompatParcelizer(Bundle bundle) {
            setTitleOptional<String, String> settitleoptional = new setTitleOptional<>();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        settitleoptional.put(str, str2);
                    }
                }
            }
            return settitleoptional;
        }
    }
}
