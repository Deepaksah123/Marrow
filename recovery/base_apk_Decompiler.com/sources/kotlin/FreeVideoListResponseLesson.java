package kotlin;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes4.dex */
public final class FreeVideoListResponseLesson {
    public static <T> T RemoteActionCompatParcelizer(Object obj, Class<T> cls) {
        if (obj instanceof getSubjPercentile) {
            if (obj instanceof getPercentage) {
                getSubjScore.IconCompatParcelizer(!AudioAttributesCompatParcelizer(cls, "dagger.hilt.android.EarlyEntryPoint"), "Interface, %s, annotated with @EarlyEntryPoint should be called with EarlyEntryPoints.get() rather than EntryPoints.get()", cls.getCanonicalName());
            }
            return cls.cast(obj);
        }
        if (obj instanceof getModifiedScore) {
            return (T) RemoteActionCompatParcelizer(((getModifiedScore) obj).af_(), cls);
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), getSubjPercentile.class, getModifiedScore.class));
    }

    private static boolean AudioAttributesCompatParcelizer(Class<?> cls, String str) {
        for (Annotation annotation : cls.getAnnotations()) {
            if (annotation.annotationType().getCanonicalName().contentEquals(str)) {
                return true;
            }
        }
        return false;
    }
}
