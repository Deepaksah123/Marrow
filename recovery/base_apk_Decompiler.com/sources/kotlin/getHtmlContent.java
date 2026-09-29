package kotlin;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.getMasterOrder;
import kotlin.getZenArea;

/* JADX INFO: loaded from: classes4.dex */
final class getHtmlContent {
    public static final getHtmlContent AudioAttributesCompatParcelizer = new getHtmlContent();

    private getHtmlContent() {
    }

    public static void RemoteActionCompatParcelizer(Class<?> cls, getMasterOrder.RemoteActionCompatParcelizer remoteActionCompatParcelizer) throws InvocationTargetException {
        toMagicModuleMetaRepoModel.write(cls, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaredAnnotations, "");
        for (Annotation annotation : declaredAnnotations) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(annotation, "");
            read(remoteActionCompatParcelizer, annotation);
        }
        remoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public final void RemoteActionCompatParcelizer(Class<?> cls, getMasterOrder.write writeVar) throws InvocationTargetException {
        toMagicModuleMetaRepoModel.write(cls, "");
        toMagicModuleMetaRepoModel.write(writeVar, "");
        AudioAttributesCompatParcelizer(cls, writeVar);
        IconCompatParcelizer(cls, writeVar);
        read(cls, writeVar);
    }

    private static void AudioAttributesCompatParcelizer(Class<?> cls, getMasterOrder.write writeVar) throws InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaredMethods, "");
        for (Method method : declaredMethods) {
            getRelatedLessonId getrelatedlessonidRemoteActionCompatParcelizer = getRelatedLessonId.RemoteActionCompatParcelizer(method.getName());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidRemoteActionCompatParcelizer, "");
            setBodyType setbodytype = setBodyType.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(method, "");
            getMasterOrder.IconCompatParcelizer iconCompatParcelizer = writeVar.read(getrelatedlessonidRemoteActionCompatParcelizer, setBodyType.AudioAttributesCompatParcelizer(method));
            Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaredAnnotations, "");
            for (Annotation annotation : declaredAnnotations) {
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(annotation, "");
                read(iconCompatParcelizer, annotation);
            }
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parameterAnnotations, "");
            Annotation[][] annotationArr = parameterAnnotations;
            int length = annotationArr.length;
            for (int i = 0; i < length; i++) {
                Annotation[] annotationArr2 = annotationArr[i];
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(annotationArr2, "");
                for (Annotation annotation2 : annotationArr2) {
                    Class<?> clsIconCompatParcelizer = MagicModuleFeedbackRequestBody.IconCompatParcelizer(MagicModuleFeedbackRequestBody.IconCompatParcelizer(annotation2));
                    RevisionSubjectStatusModel revisionSubjectStatusModelAudioAttributesCompatParcelizer = getFinalImageUrl.AudioAttributesCompatParcelizer(clsIconCompatParcelizer);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(annotation2, "");
                    getMasterOrder.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerRemoteActionCompatParcelizer = iconCompatParcelizer.RemoteActionCompatParcelizer(i, revisionSubjectStatusModelAudioAttributesCompatParcelizer, new getReadableHtml(annotation2));
                    if (audioAttributesCompatParcelizerRemoteActionCompatParcelizer != null) {
                        AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizerRemoteActionCompatParcelizer, annotation2, clsIconCompatParcelizer);
                    }
                }
            }
            iconCompatParcelizer.RemoteActionCompatParcelizer();
        }
    }

    private static void IconCompatParcelizer(Class<?> cls, getMasterOrder.write writeVar) throws InvocationTargetException {
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        String str = "";
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaredConstructors, "");
        int length = declaredConstructors.length;
        int i = 0;
        while (i < length) {
            Constructor<?> constructor = declaredConstructors[i];
            getRelatedLessonId getrelatedlessonid = getVideoMetaEncrypt.AudioAttributesCompatParcelizer;
            setBodyType setbodytype = setBodyType.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constructor, str);
            getMasterOrder.IconCompatParcelizer iconCompatParcelizer = writeVar.read(getrelatedlessonid, setBodyType.IconCompatParcelizer(constructor));
            Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaredAnnotations, str);
            for (Annotation annotation : declaredAnnotations) {
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(annotation, str);
                read(iconCompatParcelizer, annotation);
            }
            Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parameterAnnotations, str);
            Annotation[][] annotationArr = parameterAnnotations;
            if (annotationArr.length != 0) {
                int length2 = constructor.getParameterTypes().length;
                int length3 = annotationArr.length;
                int length4 = annotationArr.length;
                for (int i2 = 0; i2 < length4; i2++) {
                    Annotation[] annotationArr2 = parameterAnnotations[i2];
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(annotationArr2, str);
                    int length5 = annotationArr2.length;
                    int i3 = 0;
                    while (i3 < length5) {
                        Annotation annotation2 = annotationArr2[i3];
                        Class<?> clsIconCompatParcelizer = MagicModuleFeedbackRequestBody.IconCompatParcelizer(MagicModuleFeedbackRequestBody.IconCompatParcelizer(annotation2));
                        Constructor<?>[] constructorArr = declaredConstructors;
                        RevisionSubjectStatusModel revisionSubjectStatusModelAudioAttributesCompatParcelizer = getFinalImageUrl.AudioAttributesCompatParcelizer(clsIconCompatParcelizer);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(annotation2, str);
                        String str2 = str;
                        int i4 = length;
                        getMasterOrder.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerRemoteActionCompatParcelizer = iconCompatParcelizer.RemoteActionCompatParcelizer(i2 + (length2 - length3), revisionSubjectStatusModelAudioAttributesCompatParcelizer, new getReadableHtml(annotation2));
                        if (audioAttributesCompatParcelizerRemoteActionCompatParcelizer != null) {
                            AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizerRemoteActionCompatParcelizer, annotation2, clsIconCompatParcelizer);
                        }
                        i3++;
                        declaredConstructors = constructorArr;
                        str = str2;
                        length = i4;
                    }
                }
            }
            Constructor<?>[] constructorArr2 = declaredConstructors;
            String str3 = str;
            int i5 = length;
            iconCompatParcelizer.RemoteActionCompatParcelizer();
            i++;
            declaredConstructors = constructorArr2;
            str = str3;
            length = i5;
        }
    }

    private static void read(Class<?> cls, getMasterOrder.write writeVar) throws InvocationTargetException {
        Field[] declaredFields = cls.getDeclaredFields();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaredFields, "");
        for (Field field : declaredFields) {
            getRelatedLessonId getrelatedlessonidRemoteActionCompatParcelizer = getRelatedLessonId.RemoteActionCompatParcelizer(field.getName());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidRemoteActionCompatParcelizer, "");
            setBodyType setbodytype = setBodyType.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(field, "");
            getMasterOrder.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = writeVar.RemoteActionCompatParcelizer(getrelatedlessonidRemoteActionCompatParcelizer, setBodyType.IconCompatParcelizer(field));
            Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaredAnnotations, "");
            for (Annotation annotation : declaredAnnotations) {
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(annotation, "");
                read(RemoteActionCompatParcelizer, annotation);
            }
            RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        }
    }

    private static void read(getMasterOrder.RemoteActionCompatParcelizer remoteActionCompatParcelizer, Annotation annotation) throws InvocationTargetException {
        Class<?> clsIconCompatParcelizer = MagicModuleFeedbackRequestBody.IconCompatParcelizer(MagicModuleFeedbackRequestBody.IconCompatParcelizer(annotation));
        getMasterOrder.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerIconCompatParcelizer = remoteActionCompatParcelizer.IconCompatParcelizer(getFinalImageUrl.AudioAttributesCompatParcelizer(clsIconCompatParcelizer), new getReadableHtml(annotation));
        if (audioAttributesCompatParcelizerIconCompatParcelizer != null) {
            AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizerIconCompatParcelizer, annotation, clsIconCompatParcelizer);
        }
    }

    private final void AudioAttributesCompatParcelizer(getMasterOrder.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, Annotation annotation, Class<?> cls) throws InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(declaredMethods, "");
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, new Object[0]);
                toMagicModuleMetaRepoModel.write(objInvoke);
                getRelatedLessonId getrelatedlessonidRemoteActionCompatParcelizer = getRelatedLessonId.RemoteActionCompatParcelizer(method.getName());
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidRemoteActionCompatParcelizer, "");
                write(audioAttributesCompatParcelizer, getrelatedlessonidRemoteActionCompatParcelizer, objInvoke);
            } catch (IllegalAccessException unused) {
            }
        }
        audioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    private static getChildQuestions RemoteActionCompatParcelizer(Class<?> cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cls, "");
        }
        if (cls.isPrimitive()) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(cls, Void.TYPE)) {
                RevisionSubjectStatusModel revisionSubjectStatusModelRemoteActionCompatParcelizer = RevisionSubjectStatusModel.RemoteActionCompatParcelizer(getZenArea.RemoteActionCompatParcelizer.ResultReceiver.MediaBrowserCompatItemReceiver());
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(revisionSubjectStatusModelRemoteActionCompatParcelizer, "");
                return new getChildQuestions(revisionSubjectStatusModelRemoteActionCompatParcelizer, i);
            }
            getShowNotesWatermark getshownoteswatermarkWrite = setOption2AnsweredCount.RemoteActionCompatParcelizer(cls.getName()).write();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getshownoteswatermarkWrite, "");
            if (i > 0) {
                RevisionSubjectStatusModel revisionSubjectStatusModelRemoteActionCompatParcelizer2 = RevisionSubjectStatusModel.RemoteActionCompatParcelizer(getshownoteswatermarkWrite.RemoteActionCompatParcelizer());
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(revisionSubjectStatusModelRemoteActionCompatParcelizer2, "");
                return new getChildQuestions(revisionSubjectStatusModelRemoteActionCompatParcelizer2, i - 1);
            }
            RevisionSubjectStatusModel revisionSubjectStatusModelRemoteActionCompatParcelizer3 = RevisionSubjectStatusModel.RemoteActionCompatParcelizer(getshownoteswatermarkWrite.AudioAttributesCompatParcelizer());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(revisionSubjectStatusModelRemoteActionCompatParcelizer3, "");
            return new getChildQuestions(revisionSubjectStatusModelRemoteActionCompatParcelizer3, i);
        }
        RevisionSubjectStatusModel revisionSubjectStatusModelAudioAttributesCompatParcelizer = getFinalImageUrl.AudioAttributesCompatParcelizer(cls);
        CourseConfigV2AnnouncementBanner courseConfigV2AnnouncementBanner = CourseConfigV2AnnouncementBanner.write;
        getNotesCount getnotescountAudioAttributesCompatParcelizer = revisionSubjectStatusModelAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescountAudioAttributesCompatParcelizer, "");
        RevisionSubjectStatusModel revisionSubjectStatusModelWrite = CourseConfigV2AnnouncementBanner.write(getnotescountAudioAttributesCompatParcelizer);
        if (revisionSubjectStatusModelWrite != null) {
            revisionSubjectStatusModelAudioAttributesCompatParcelizer = revisionSubjectStatusModelWrite;
        }
        return new getChildQuestions(revisionSubjectStatusModelAudioAttributesCompatParcelizer, i);
    }

    private final void write(getMasterOrder.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, getRelatedLessonId getrelatedlessonid, Object obj) throws InvocationTargetException {
        Class<?> enclosingClass = obj.getClass();
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(enclosingClass, Class.class)) {
            if (isHtmlContent.RemoteActionCompatParcelizer.contains(enclosingClass)) {
                audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(getrelatedlessonid, obj);
                return;
            }
            if (getFinalImageUrl.AudioAttributesImplBaseParcelizer(enclosingClass)) {
                if (!enclosingClass.isEnum()) {
                    enclosingClass = enclosingClass.getEnclosingClass();
                }
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(enclosingClass, "");
                RevisionSubjectStatusModel revisionSubjectStatusModelAudioAttributesCompatParcelizer = getFinalImageUrl.AudioAttributesCompatParcelizer(enclosingClass);
                toMagicModuleMetaRepoModel.read(obj, "");
                getRelatedLessonId getrelatedlessonidRemoteActionCompatParcelizer = getRelatedLessonId.RemoteActionCompatParcelizer(((Enum) obj).name());
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidRemoteActionCompatParcelizer, "");
                audioAttributesCompatParcelizer.write(getrelatedlessonid, revisionSubjectStatusModelAudioAttributesCompatParcelizer, getrelatedlessonidRemoteActionCompatParcelizer);
                return;
            }
            if (Annotation.class.isAssignableFrom(enclosingClass)) {
                Class<?>[] interfaces = enclosingClass.getInterfaces();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(interfaces, "");
                Class<?> cls = (Class) getOrderDetails.MediaBrowserCompatSearchResultReceiver(interfaces);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cls, "");
                getMasterOrder.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer2 = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(getrelatedlessonid, getFinalImageUrl.AudioAttributesCompatParcelizer(cls));
                if (AudioAttributesCompatParcelizer2 != null) {
                    toMagicModuleMetaRepoModel.read(obj, "");
                    AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer2, (Annotation) obj, cls);
                    return;
                }
                return;
            }
            if (enclosingClass.isArray()) {
                getMasterOrder.read readVarRemoteActionCompatParcelizer = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(getrelatedlessonid);
                if (readVarRemoteActionCompatParcelizer == null) {
                    return;
                }
                Class<?> componentType = enclosingClass.getComponentType();
                int i = 0;
                if (componentType.isEnum()) {
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(componentType, "");
                    RevisionSubjectStatusModel revisionSubjectStatusModelAudioAttributesCompatParcelizer2 = getFinalImageUrl.AudioAttributesCompatParcelizer(componentType);
                    toMagicModuleMetaRepoModel.read(obj, "");
                    Object[] objArr = (Object[]) obj;
                    int length = objArr.length;
                    while (i < length) {
                        Object obj2 = objArr[i];
                        toMagicModuleMetaRepoModel.read(obj2, "");
                        getRelatedLessonId getrelatedlessonidRemoteActionCompatParcelizer2 = getRelatedLessonId.RemoteActionCompatParcelizer(((Enum) obj2).name());
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidRemoteActionCompatParcelizer2, "");
                        readVarRemoteActionCompatParcelizer.write(revisionSubjectStatusModelAudioAttributesCompatParcelizer2, getrelatedlessonidRemoteActionCompatParcelizer2);
                        i++;
                    }
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(componentType, Class.class)) {
                    toMagicModuleMetaRepoModel.read(obj, "");
                    Object[] objArr2 = (Object[]) obj;
                    int length2 = objArr2.length;
                    while (i < length2) {
                        Object obj3 = objArr2[i];
                        toMagicModuleMetaRepoModel.read(obj3, "");
                        readVarRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer((Class) obj3));
                        i++;
                    }
                } else if (Annotation.class.isAssignableFrom(componentType)) {
                    toMagicModuleMetaRepoModel.read(obj, "");
                    Object[] objArr3 = (Object[]) obj;
                    int length3 = objArr3.length;
                    while (i < length3) {
                        Object obj4 = objArr3[i];
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(componentType, "");
                        getMasterOrder.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer3 = readVarRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(getFinalImageUrl.AudioAttributesCompatParcelizer(componentType));
                        if (AudioAttributesCompatParcelizer3 != null) {
                            toMagicModuleMetaRepoModel.read(obj4, "");
                            AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer3, (Annotation) obj4, componentType);
                        }
                        i++;
                    }
                } else {
                    toMagicModuleMetaRepoModel.read(obj, "");
                    Object[] objArr4 = (Object[]) obj;
                    int length4 = objArr4.length;
                    while (i < length4) {
                        readVarRemoteActionCompatParcelizer.write(objArr4[i]);
                        i++;
                    }
                }
                readVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                return;
            }
            StringBuilder sb = new StringBuilder("Unsupported annotation argument value (");
            sb.append(enclosingClass);
            sb.append("): ");
            sb.append(obj);
            throw new UnsupportedOperationException(sb.toString());
        }
        toMagicModuleMetaRepoModel.read(obj, "");
        audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(getrelatedlessonid, RemoteActionCompatParcelizer((Class) obj));
    }
}
