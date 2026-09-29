package kotlin;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class deleteSkipIntroTable implements ParameterizedType, flushData {
    private final Class<?> RemoteActionCompatParcelizer;
    private final Type[] read;
    private final Type write;

    public deleteSkipIntroTable(Class<?> cls, Type type, List<? extends Type> list) {
        toMagicModuleMetaRepoModel.write(cls, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.RemoteActionCompatParcelizer = cls;
        this.write = type;
        this.read = (Type[]) list.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.write;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.read;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Type type = this.write;
        if (type != null) {
            sb.append(deleteTablesForEditionSwitch.RemoteActionCompatParcelizer(type));
            sb.append("$");
            sb.append(this.RemoteActionCompatParcelizer.getSimpleName());
        } else {
            sb.append(deleteTablesForEditionSwitch.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer));
        }
        Type[] typeArr = this.read;
        if (typeArr.length != 0) {
            getOrderDetails.read(typeArr, sb, ", ", "<", ">", -1, "...", IconCompatParcelizer.read);
        }
        return sb.toString();
    }

    static final /* synthetic */ class IconCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements getAnswerMap<Type, String> {
        public static final IconCompatParcelizer read = new IconCompatParcelizer();

        private static String IconCompatParcelizer(Type type) {
            toMagicModuleMetaRepoModel.write(type, "");
            return deleteTablesForEditionSwitch.RemoteActionCompatParcelizer(type);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ String invoke(Type type) {
            return IconCompatParcelizer(type);
        }

        IconCompatParcelizer() {
            super(1, deleteTablesForEditionSwitch.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, parameterizedType.getRawType()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
    }

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        Type type = this.write;
        return Arrays.hashCode(getActualTypeArguments()) ^ (iHashCode ^ (type != null ? type.hashCode() : 0));
    }

    public final String toString() {
        return getTypeName();
    }
}
