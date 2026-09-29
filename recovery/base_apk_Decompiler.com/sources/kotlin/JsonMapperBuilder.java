package kotlin;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/JsonMapperBuilder;", "", "<init>", "()V", "Lo/POJOPropertyBuilderWithMember;", "T", "Ljava/lang/Class;", "p0", "read", "(Ljava/lang/Class;)Lo/POJOPropertyBuilderWithMember;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JsonMapperBuilder {
    public static final JsonMapperBuilder INSTANCE = new JsonMapperBuilder();

    private JsonMapperBuilder() {
    }

    public static <T extends POJOPropertyBuilderWithMember> T read(Class<T> p0) throws InvocationTargetException {
        toMagicModuleMetaRepoModel.write(p0, "");
        try {
            Constructor<T> declaredConstructor = p0.getDeclaredConstructor(new Class[0]);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(p0)));
            }
            try {
                T tNewInstance = declaredConstructor.newInstance(new Object[0]);
                toMagicModuleMetaRepoModel.write(tNewInstance);
                return tNewInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(p0)), e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(p0)), e2);
            }
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(p0)), e3);
        }
    }
}
