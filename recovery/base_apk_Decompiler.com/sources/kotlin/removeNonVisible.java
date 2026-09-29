package kotlin;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\u00020\t2\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u000f2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u001d\u0010\u0006\u001a\u00020\u00132\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0006\u0010\u0014J\u0017\u0010\u0010\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0010\u0010\u0016R$\u0010\u000b\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u000f0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R2\u0010\u001a\u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b0\u00190\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018"}, d2 = {"Lo/removeNonVisible;", "", "<init>", "()V", "p0", "Lo/findAccess;", "write", "(Ljava/lang/Object;)Lo/findAccess;", "Ljava/lang/reflect/Constructor;", "Lo/explode;", "p1", "AudioAttributesCompatParcelizer", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Lo/explode;", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", "", "read", "(Ljava/lang/Class;)I", "RemoteActionCompatParcelizer", "", "(Ljava/lang/Class;)Z", "", "(Ljava/lang/String;)Ljava/lang/String;", "", "Ljava/util/Map;", "", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class removeNonVisible {
    public static final removeNonVisible INSTANCE = new removeNonVisible();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private static final Map<Class<?>, Integer> AudioAttributesCompatParcelizer = new HashMap();

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private static final Map<Class<?>, List<Constructor<? extends InterfaceC0169explode>>> IconCompatParcelizer = new HashMap();

    private removeNonVisible() {
    }

    @getMagicModuleMeta
    public static final findAccess write(Object p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        boolean z = p0 instanceof findAccess;
        boolean z2 = p0 instanceof addGetter;
        if (z && z2) {
            return new anyVisible((addGetter) p0, (findAccess) p0);
        }
        if (z2) {
            return new anyVisible((addGetter) p0, null);
        }
        if (z) {
            return (findAccess) p0;
        }
        Class<?> cls = p0.getClass();
        if (INSTANCE.read(cls) == 2) {
            List<Constructor<? extends InterfaceC0169explode>> list = IconCompatParcelizer.get(cls);
            toMagicModuleMetaRepoModel.write(list);
            List<Constructor<? extends InterfaceC0169explode>> list2 = list;
            if (list2.size() == 1) {
                return new SimpleMixInResolver(AudioAttributesCompatParcelizer(list2.get(0), p0));
            }
            int size = list2.size();
            InterfaceC0169explode[] interfaceC0169explodeArr = new InterfaceC0169explode[size];
            for (int i = 0; i < size; i++) {
                interfaceC0169explodeArr[i] = AudioAttributesCompatParcelizer(list2.get(i), p0);
            }
            return new _setterPriority(interfaceC0169explodeArr);
        }
        return new POJOPropertyBuilder6(p0);
    }

    private static InterfaceC0169explode AudioAttributesCompatParcelizer(Constructor<? extends InterfaceC0169explode> p0, Object p1) {
        try {
            InterfaceC0169explode interfaceC0169explodeNewInstance = p0.newInstance(p1);
            toMagicModuleMetaRepoModel.write(interfaceC0169explodeNewInstance);
            return interfaceC0169explodeNewInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    private static Constructor<? extends InterfaceC0169explode> AudioAttributesCompatParcelizer(Class<?> p0) {
        try {
            Package r0 = p0.getPackage();
            String canonicalName = p0.getCanonicalName();
            String name = r0 != null ? r0.getName() : "";
            toMagicModuleMetaRepoModel.write((Object) name);
            if (name.length() != 0) {
                toMagicModuleMetaRepoModel.write((Object) canonicalName);
                canonicalName = canonicalName.substring(name.length() + 1);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(canonicalName, "");
            }
            toMagicModuleMetaRepoModel.write((Object) canonicalName);
            String string = read(canonicalName);
            if (name.length() != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(name);
                sb.append('.');
                sb.append(string);
                string = sb.toString();
            }
            Class<?> cls = Class.forName(string);
            toMagicModuleMetaRepoModel.read(cls, "");
            Constructor declaredConstructor = cls.getDeclaredConstructor(p0);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    private final int read(Class<?> p0) {
        Map<Class<?>, Integer> map = AudioAttributesCompatParcelizer;
        Integer num = map.get(p0);
        if (num != null) {
            return num.intValue();
        }
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0);
        map.put(p0, Integer.valueOf(iRemoteActionCompatParcelizer));
        return iRemoteActionCompatParcelizer;
    }

    private final int RemoteActionCompatParcelizer(Class<?> p0) {
        ArrayList arrayList;
        if (p0.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends InterfaceC0169explode> constructorAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0);
        if (constructorAudioAttributesCompatParcelizer != null) {
            IconCompatParcelizer.put(p0, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(constructorAudioAttributesCompatParcelizer));
            return 2;
        }
        if (addField.AudioAttributesCompatParcelizer.IconCompatParcelizer(p0)) {
            return 1;
        }
        Class<? super Object> superclass = p0.getSuperclass();
        if (write((Class<?>) superclass)) {
            toMagicModuleMetaRepoModel.write(superclass);
            if (read(superclass) == 1) {
                return 1;
            }
            List<Constructor<? extends InterfaceC0169explode>> list = IconCompatParcelizer.get(superclass);
            toMagicModuleMetaRepoModel.write(list);
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        Iterator itAudioAttributesCompatParcelizer = r8lambda_QgM1da7JykGH9FQp_oipiZItrY.AudioAttributesCompatParcelizer(p0.getInterfaces());
        while (itAudioAttributesCompatParcelizer.hasNext()) {
            Class<?> cls = (Class) itAudioAttributesCompatParcelizer.next();
            if (write(cls)) {
                toMagicModuleMetaRepoModel.write(cls);
                if (read(cls) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<Constructor<? extends InterfaceC0169explode>> list2 = IconCompatParcelizer.get(cls);
                toMagicModuleMetaRepoModel.write(list2);
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        IconCompatParcelizer.put(p0, arrayList);
        return 2;
    }

    private static boolean write(Class<?> p0) {
        return p0 != null && findExplicitNames.class.isAssignableFrom(p0);
    }

    @getMagicModuleMeta
    private static String read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        StringBuilder sb = new StringBuilder();
        sb.append(TestGroupLSModel.read(p0, ".", "_", false));
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }
}
