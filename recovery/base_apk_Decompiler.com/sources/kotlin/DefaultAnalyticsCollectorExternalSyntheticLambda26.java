package kotlin;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultAnalyticsCollectorExternalSyntheticLambda26 {
    public static Class<?> AudioAttributesCompatParcelizer(String str) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda26.class)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda26.class);
            return null;
        }
    }

    public static Method write(Class<?> cls, String str, Class<?>... clsArr) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda26.class)) {
            return null;
        }
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda26.class);
            return null;
        }
    }

    public static Object write(Class<?> cls, Method method, Object obj, Object... objArr) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda26.class)) {
            return null;
        }
        if (obj != null) {
            try {
                obj = cls.cast(obj);
            } catch (Throwable th) {
                getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda26.class);
                return null;
            }
        }
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
