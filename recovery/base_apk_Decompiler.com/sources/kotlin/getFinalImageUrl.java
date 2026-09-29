package kotlin;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class getFinalImageUrl {
    private static final Map<Class<? extends Object>, Class<? extends Object>> AudioAttributesCompatParcelizer;
    private static final Map<Class<? extends Object>, Class<? extends Object>> RemoteActionCompatParcelizer;
    private static final List<isHdPlaybackError<? extends Object>> read;
    private static final Map<Class<? extends setRenewGrpId<?>>, Integer> write;

    public static final ClassLoader read(Class<?> cls) {
        toMagicModuleMetaRepoModel.write(cls, "");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(systemClassLoader, "");
        return systemClassLoader;
    }

    public static final boolean AudioAttributesImplBaseParcelizer(Class<?> cls) {
        toMagicModuleMetaRepoModel.write(cls, "");
        return Enum.class.isAssignableFrom(cls);
    }

    static {
        List<isHdPlaybackError<? extends Object>> listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new isHdPlaybackError[]{toMagicModuleMetaDataUcModel.write(Boolean.TYPE), toMagicModuleMetaDataUcModel.write(Byte.TYPE), toMagicModuleMetaDataUcModel.write(Character.TYPE), toMagicModuleMetaDataUcModel.write(Double.TYPE), toMagicModuleMetaDataUcModel.write(Float.TYPE), toMagicModuleMetaDataUcModel.write(Integer.TYPE), toMagicModuleMetaDataUcModel.write(Long.TYPE), toMagicModuleMetaDataUcModel.write(Short.TYPE)});
        read = listRemoteActionCompatParcelizer;
        List<isHdPlaybackError<? extends Object>> list = listRemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            isHdPlaybackError ishdplaybackerror = (isHdPlaybackError) it.next();
            arrayList.add(setAction.write(MagicModuleFeedbackRequestBody.write(ishdplaybackerror), MagicModuleFeedbackRequestBody.read(ishdplaybackerror)));
        }
        AudioAttributesCompatParcelizer = VideoTimelineResponseBody.read(arrayList);
        List<isHdPlaybackError<? extends Object>> list2 = read;
        ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            isHdPlaybackError ishdplaybackerror2 = (isHdPlaybackError) it2.next();
            arrayList2.add(setAction.write(MagicModuleFeedbackRequestBody.read(ishdplaybackerror2), MagicModuleFeedbackRequestBody.write(ishdplaybackerror2)));
        }
        RemoteActionCompatParcelizer = VideoTimelineResponseBody.read(arrayList2);
        List listRemoteActionCompatParcelizer2 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Class[]{getCreatedOnDateMs.class, getAnswerMap.class, MagicModuleSubmissionRequestBody.class, getModuleData.class, getMagicModuleStat.class, MagicModuleRepository.class, markComplete.class, isDetailDownloaded.class, saveMagicModuleModule.class, MagicModuleRepositoryImpl.class, MagicModuleModel.class, getComment.class, getError_code.class, getMcqResponseList.class, toMagicModuleMetaLSModel.class, MagicModuleRSModelsKt.class, getMagicModuleRsStat.class, getCorrected.class, getNeedRevision.class, MagicModuleStatsRSModel.class, getModuleCompleted.class, MagicModuleTimelineRSModel.class, MagicModuleSubmissionResponseBody.class});
        ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listRemoteActionCompatParcelizer2, 10));
        int i = 0;
        for (Object obj : listRemoteActionCompatParcelizer2) {
            if (i < 0) {
                IntermediateLoginResponseBody.read();
            }
            arrayList3.add(setAction.write((Class) obj, Integer.valueOf(i)));
            i++;
        }
        write = VideoTimelineResponseBody.read(arrayList3);
    }

    public static final Class<?> write(Class<?> cls) {
        toMagicModuleMetaRepoModel.write(cls, "");
        return AudioAttributesCompatParcelizer.get(cls);
    }

    public static final Class<?> MediaBrowserCompatCustomActionResultReceiver(Class<?> cls) {
        toMagicModuleMetaRepoModel.write(cls, "");
        return RemoteActionCompatParcelizer.get(cls);
    }

    public static final Integer RemoteActionCompatParcelizer(Class<?> cls) {
        toMagicModuleMetaRepoModel.write(cls, "");
        return write.get(cls);
    }

    public static final RevisionSubjectStatusModel AudioAttributesCompatParcelizer(Class<?> cls) {
        RevisionSubjectStatusModel revisionSubjectStatusModelAudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(cls, "");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: ".concat(String.valueOf(cls)));
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: ".concat(String.valueOf(cls)));
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            String simpleName = cls.getSimpleName();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(simpleName, "");
            if (simpleName.length() != 0) {
                Class<?> declaringClass = cls.getDeclaringClass();
                RevisionSubjectStatusModel revisionSubjectStatusModelRemoteActionCompatParcelizer = (declaringClass == null || (revisionSubjectStatusModelAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(declaringClass)) == null) ? RevisionSubjectStatusModel.RemoteActionCompatParcelizer(new getNotesCount(cls.getName())) : revisionSubjectStatusModelAudioAttributesCompatParcelizer.read(getRelatedLessonId.RemoteActionCompatParcelizer(cls.getSimpleName()));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(revisionSubjectStatusModelRemoteActionCompatParcelizer, "");
                return revisionSubjectStatusModelRemoteActionCompatParcelizer;
            }
        }
        getNotesCount getnotescount = new getNotesCount(cls.getName());
        return new RevisionSubjectStatusModel(getnotescount.AudioAttributesCompatParcelizer(), getNotesCount.IconCompatParcelizer(getnotescount.IconCompatParcelizer()), true);
    }

    public static final String IconCompatParcelizer(Class<?> cls) {
        toMagicModuleMetaRepoModel.write(cls, "");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String name = cls.getName();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name, "");
                return TestGroupLSModel.AudioAttributesCompatParcelizer(name, '.', '/', false);
            }
            StringBuilder sb = new StringBuilder("L");
            String name2 = cls.getName();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name2, "");
            sb.append(TestGroupLSModel.AudioAttributesCompatParcelizer(name2, '.', '/', false));
            sb.append(';');
            return sb.toString();
        }
        String name3 = cls.getName();
        if (name3 != null) {
            switch (name3.hashCode()) {
                case -1325958191:
                    if (name3.equals("double")) {
                        return "D";
                    }
                    break;
                case 104431:
                    if (name3.equals("int")) {
                        return "I";
                    }
                    break;
                case 3039496:
                    if (name3.equals("byte")) {
                        return "B";
                    }
                    break;
                case 3052374:
                    if (name3.equals("char")) {
                        return "C";
                    }
                    break;
                case 3327612:
                    if (name3.equals("long")) {
                        return "J";
                    }
                    break;
                case 3625364:
                    if (name3.equals("void")) {
                        return "V";
                    }
                    break;
                case 64711720:
                    if (name3.equals("boolean")) {
                        return "Z";
                    }
                    break;
                case 97526364:
                    if (name3.equals("float")) {
                        return "F";
                    }
                    break;
                case 109413500:
                    if (name3.equals("short")) {
                        return "S";
                    }
                    break;
            }
        }
        throw new IllegalArgumentException("Unsupported primitive type: ".concat(String.valueOf(cls)));
    }

    public static final List<Type> read(Type type) {
        toMagicModuleMetaRepoModel.write(type, "");
        if (!(type instanceof ParameterizedType)) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return StateResult.MediaBrowserCompatItemReceiver(StateResult.RemoteActionCompatParcelizer(StateResult.RemoteActionCompatParcelizer(type, IconCompatParcelizer.IconCompatParcelizer), (getAnswerMap) RemoteActionCompatParcelizer.read));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(actualTypeArguments, "");
        return getOrderDetails.onCommand(actualTypeArguments);
    }

    static final class IconCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<ParameterizedType, ParameterizedType> {
        public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer();

        private static ParameterizedType RemoteActionCompatParcelizer(ParameterizedType parameterizedType) {
            toMagicModuleMetaRepoModel.write(parameterizedType, "");
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType instanceof ParameterizedType) {
                return (ParameterizedType) ownerType;
            }
            return null;
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ ParameterizedType invoke(ParameterizedType parameterizedType) {
            return RemoteActionCompatParcelizer(parameterizedType);
        }

        IconCompatParcelizer() {
            super(1);
        }
    }

    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<ParameterizedType, getTopRankers<? extends Type>> {
        public static final RemoteActionCompatParcelizer read = new RemoteActionCompatParcelizer();

        private static getTopRankers<Type> AudioAttributesCompatParcelizer(ParameterizedType parameterizedType) {
            toMagicModuleMetaRepoModel.write(parameterizedType, "");
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(actualTypeArguments, "");
            return getOrderDetails.MediaBrowserCompatItemReceiver(actualTypeArguments);
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getTopRankers<? extends Type> invoke(ParameterizedType parameterizedType) {
            return AudioAttributesCompatParcelizer(parameterizedType);
        }

        RemoteActionCompatParcelizer() {
            super(1);
        }
    }
}
