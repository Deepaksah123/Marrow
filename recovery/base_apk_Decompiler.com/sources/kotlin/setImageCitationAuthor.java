package kotlin;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class setImageCitationAuthor extends setThumbnailHeight implements setCount {
    private final Constructor<?> read;

    public setImageCitationAuthor(Constructor<?> constructor) {
        toMagicModuleMetaRepoModel.write(constructor, "");
        this.read = constructor;
    }

    @Override // kotlin.setThumbnailHeight
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final Constructor<?> write() {
        return this.read;
    }

    @Override // kotlin.setCount
    public final List<setStatus> AudioAttributesImplApi21Parcelizer() {
        Type[] genericParameterTypes = write().getGenericParameterTypes();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(genericParameterTypes, "");
        if (genericParameterTypes.length == 0) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        Class<?> declaringClass = write().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) getOrderDetails.IconCompatParcelizer(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = write().getParameterAnnotations();
        Annotation[][] annotationArr = parameterAnnotations;
        if (annotationArr.length < genericParameterTypes.length) {
            StringBuilder sb = new StringBuilder("Illegal generic signature: ");
            sb.append(write());
            throw new IllegalStateException(sb.toString());
        }
        if (annotationArr.length > genericParameterTypes.length) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parameterAnnotations, "");
            parameterAnnotations = (Annotation[][]) getOrderDetails.IconCompatParcelizer(annotationArr, annotationArr.length - genericParameterTypes.length, annotationArr.length);
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(genericParameterTypes, "");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parameterAnnotations, "");
        return write(genericParameterTypes, parameterAnnotations, write().isVarArgs());
    }

    @Override // kotlin.setResultAvailable
    public final List<getFileName> onCommand() {
        TypeVariable<Constructor<?>>[] typeParameters = write().getTypeParameters();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(typeParameters, "");
        TypeVariable<Constructor<?>>[] typeVariableArr = typeParameters;
        ArrayList arrayList = new ArrayList(typeVariableArr.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeVariableArr) {
            arrayList.add(new getFileName(typeVariable));
        }
        return arrayList;
    }
}
