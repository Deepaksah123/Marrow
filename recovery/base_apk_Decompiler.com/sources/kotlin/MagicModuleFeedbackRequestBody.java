package kotlin;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes4.dex */
public final class MagicModuleFeedbackRequestBody {
    public static final <T> Class<T> IconCompatParcelizer(isHdPlaybackError<T> ishdplaybackerror) {
        toMagicModuleMetaRepoModel.write(ishdplaybackerror, "");
        Class<T> cls = (Class<T>) ((downloadMagicModuleDetaillambda1) ishdplaybackerror).RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.read(cls, "");
        return cls;
    }

    public static final <T> Class<T> read(isHdPlaybackError<T> ishdplaybackerror) {
        toMagicModuleMetaRepoModel.write(ishdplaybackerror, "");
        Class<T> cls = (Class<T>) ((downloadMagicModuleDetaillambda1) ishdplaybackerror).RemoteActionCompatParcelizer();
        if (cls.isPrimitive()) {
            toMagicModuleMetaRepoModel.read(cls, "");
            return cls;
        }
        String name = cls.getName();
        if (name == null) {
            return null;
        }
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final <T> Class<T> write(isHdPlaybackError<T> ishdplaybackerror) {
        toMagicModuleMetaRepoModel.write(ishdplaybackerror, "");
        Class<T> cls = (Class<T>) ((downloadMagicModuleDetaillambda1) ishdplaybackerror).RemoteActionCompatParcelizer();
        if (!cls.isPrimitive()) {
            toMagicModuleMetaRepoModel.read(cls, "");
            return cls;
        }
        String name = cls.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        cls = (Class<T>) Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        cls = (Class<T>) Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        cls = (Class<T>) Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        cls = (Class<T>) Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        cls = (Class<T>) Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        cls = (Class<T>) Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        cls = (Class<T>) Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        cls = (Class<T>) Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        cls = (Class<T>) Short.class;
                    }
                    break;
            }
        }
        toMagicModuleMetaRepoModel.read(cls, "");
        return cls;
    }

    public static final <T> isHdPlaybackError<T> read(Class<T> cls) {
        toMagicModuleMetaRepoModel.write(cls, "");
        return toMagicModuleMetaDataUcModel.write(cls);
    }

    public static final <T extends Annotation> isHdPlaybackError<? extends T> IconCompatParcelizer(T t) {
        toMagicModuleMetaRepoModel.write(t, "");
        Class<? extends Annotation> clsAnnotationType = t.annotationType();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(clsAnnotationType, "");
        isHdPlaybackError<? extends T> ishdplaybackerror = read(clsAnnotationType);
        toMagicModuleMetaRepoModel.read(ishdplaybackerror, "");
        return ishdplaybackerror;
    }
}
