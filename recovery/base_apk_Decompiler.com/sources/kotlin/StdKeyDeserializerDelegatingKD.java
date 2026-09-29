package kotlin;

import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class StdKeyDeserializerDelegatingKD {
    public static <T> T IconCompatParcelizer(Bundle bundle, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) AudioAttributesCompatParcelizer.write(bundle, str, cls);
        }
        T t = (T) bundle.getParcelable(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    public static <T> ArrayList<T> RemoteActionCompatParcelizer(Bundle bundle, String str, Class<? extends T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return AudioAttributesCompatParcelizer.IconCompatParcelizer(bundle, str, cls);
        }
        return bundle.getParcelableArrayList(str);
    }

    static class AudioAttributesCompatParcelizer {
        static <T> T write(Bundle bundle, String str, Class<T> cls) {
            return (T) bundle.getParcelable(str, cls);
        }

        static <T> ArrayList<T> IconCompatParcelizer(Bundle bundle, String str, Class<? extends T> cls) {
            return bundle.getParcelableArrayList(str, cls);
        }
    }
}
