package kotlin;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class DownloadHelperExternalSyntheticLambda3<T> {
    private final int AudioAttributesCompatParcelizer;
    private final Type RemoteActionCompatParcelizer;
    private final Class<? super T> write;

    public DownloadHelperExternalSyntheticLambda3() {
        Type type = read();
        this.RemoteActionCompatParcelizer = type;
        this.write = (Class<? super T>) moveToNext.AudioAttributesCompatParcelizer(type);
        this.AudioAttributesCompatParcelizer = type.hashCode();
    }

    private DownloadHelperExternalSyntheticLambda3(Type type) {
        Type typeIconCompatParcelizer = moveToNext.IconCompatParcelizer((Type) Objects.requireNonNull(type));
        this.RemoteActionCompatParcelizer = typeIconCompatParcelizer;
        this.write = (Class<? super T>) moveToNext.AudioAttributesCompatParcelizer(typeIconCompatParcelizer);
        this.AudioAttributesCompatParcelizer = typeIconCompatParcelizer.hashCode();
    }

    private Type read() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == DownloadHelperExternalSyntheticLambda3.class) {
                return moveToNext.IconCompatParcelizer(parameterizedType.getActualTypeArguments()[0]);
            }
        } else if (genericSuperclass == DownloadHelperExternalSyntheticLambda3.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public final Class<? super T> AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final Type RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof DownloadHelperExternalSyntheticLambda3) && moveToNext.read(this.RemoteActionCompatParcelizer, ((DownloadHelperExternalSyntheticLambda3) obj).RemoteActionCompatParcelizer);
    }

    public final String toString() {
        return moveToNext.write(this.RemoteActionCompatParcelizer);
    }

    public static DownloadHelperExternalSyntheticLambda3<?> write(Type type) {
        return new DownloadHelperExternalSyntheticLambda3<>(type);
    }

    public static <T> DownloadHelperExternalSyntheticLambda3<T> IconCompatParcelizer(Class<T> cls) {
        return new DownloadHelperExternalSyntheticLambda3<>(cls);
    }
}
