package kotlin;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes4.dex */
public final class _coerceEmptyString {
    public static StdKeyDeserializerStringCtorKeyDeserializer IconCompatParcelizer(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            Object obj = read(context);
            if (obj != null) {
                return StdKeyDeserializerStringCtorKeyDeserializer.read(RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(obj));
            }
            return StdKeyDeserializerStringCtorKeyDeserializer.RemoteActionCompatParcelizer();
        }
        return StdKeyDeserializerStringCtorKeyDeserializer.RemoteActionCompatParcelizer(_checkIntToFloatCoercion.IconCompatParcelizer(context));
    }

    private static Object read(Context context) {
        return context.getSystemService("locale");
    }

    static class RemoteActionCompatParcelizer {
        static LocaleList RemoteActionCompatParcelizer(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }
    }
}
