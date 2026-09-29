package kotlin;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public interface SearchMcqResponseBody<R, T> {
    T AudioAttributesCompatParcelizer(SearchTextResponseBody<R> searchTextResponseBody);

    Type read();

    public static abstract class write {
        public abstract SearchMcqResponseBody<?, ?> read(Type type, Annotation[] annotationArr);

        protected static Type read(ParameterizedType parameterizedType) {
            return GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(0, parameterizedType);
        }

        protected static Class<?> IconCompatParcelizer(Type type) {
            return GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(type);
        }
    }
}
