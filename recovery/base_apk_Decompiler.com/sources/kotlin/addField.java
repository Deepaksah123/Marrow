package kotlin;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.anyIgnorals;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class addField {
    static addField AudioAttributesCompatParcelizer = new addField();
    private final Map<Class<?>, RemoteActionCompatParcelizer> write = new HashMap();
    private final Map<Class<?>, Boolean> IconCompatParcelizer = new HashMap();

    addField() {
    }

    final boolean IconCompatParcelizer(Class<?> cls) {
        Boolean bool = this.IconCompatParcelizer.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(cls);
        for (Method method : methodArrRemoteActionCompatParcelizer) {
            if (((withMember) method.getAnnotation(withMember.class)) != null) {
                RemoteActionCompatParcelizer(cls, methodArrRemoteActionCompatParcelizer);
                return true;
            }
        }
        this.IconCompatParcelizer.put(cls, Boolean.FALSE);
        return false;
    }

    private static Method[] RemoteActionCompatParcelizer(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(Class<?> cls) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.write.get(cls);
        return remoteActionCompatParcelizer != null ? remoteActionCompatParcelizer : RemoteActionCompatParcelizer(cls, null);
    }

    private static void IconCompatParcelizer(Map<IconCompatParcelizer, anyIgnorals.read> map, IconCompatParcelizer iconCompatParcelizer, anyIgnorals.read readVar, Class<?> cls) {
        anyIgnorals.read readVar2 = map.get(iconCompatParcelizer);
        if (readVar2 == null || readVar == readVar2) {
            if (readVar2 == null) {
                map.put(iconCompatParcelizer, readVar);
                return;
            }
            return;
        }
        Method method = iconCompatParcelizer.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("Method ");
        sb.append(method.getName());
        sb.append(" in ");
        sb.append(cls.getName());
        sb.append(" already declared with different @OnLifecycleEvent value: previous value ");
        sb.append(readVar2);
        sb.append(", new value ");
        sb.append(readVar);
        throw new IllegalArgumentException(sb.toString());
    }

    private RemoteActionCompatParcelizer RemoteActionCompatParcelizer(Class<?> cls, Method[] methodArr) {
        int i;
        RemoteActionCompatParcelizer remoteActionCompatParcelizerAudioAttributesCompatParcelizer;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (remoteActionCompatParcelizerAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(superclass)) != null) {
            map.putAll(remoteActionCompatParcelizerAudioAttributesCompatParcelizer.read);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<IconCompatParcelizer, anyIgnorals.read> entry : AudioAttributesCompatParcelizer(cls2).read.entrySet()) {
                IconCompatParcelizer(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = RemoteActionCompatParcelizer(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            withMember withmember = (withMember) method.getAnnotation(withMember.class);
            if (withmember != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!hasGetter.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                anyIgnorals.read readVar = withmember.read();
                if (parameterTypes.length > 1) {
                    if (!anyIgnorals.read.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (readVar != anyIgnorals.read.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                IconCompatParcelizer(map, new IconCompatParcelizer(i, method), readVar, cls);
                z = true;
            }
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(map);
        this.write.put(cls, remoteActionCompatParcelizer);
        this.IconCompatParcelizer.put(cls, Boolean.valueOf(z));
        return remoteActionCompatParcelizer;
    }

    @Deprecated
    static class RemoteActionCompatParcelizer {
        final Map<IconCompatParcelizer, anyIgnorals.read> read;
        final Map<anyIgnorals.read, List<IconCompatParcelizer>> write = new HashMap();

        RemoteActionCompatParcelizer(Map<IconCompatParcelizer, anyIgnorals.read> map) {
            this.read = map;
            for (Map.Entry<IconCompatParcelizer, anyIgnorals.read> entry : map.entrySet()) {
                anyIgnorals.read value = entry.getValue();
                List<IconCompatParcelizer> arrayList = this.write.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.write.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        final void IconCompatParcelizer(hasGetter hasgetter, anyIgnorals.read readVar, Object obj) {
            write(this.write.get(readVar), hasgetter, readVar, obj);
            write(this.write.get(anyIgnorals.read.ON_ANY), hasgetter, readVar, obj);
        }

        private static void write(List<IconCompatParcelizer> list, hasGetter hasgetter, anyIgnorals.read readVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).write(hasgetter, readVar, obj);
                }
            }
        }
    }

    @Deprecated
    static final class IconCompatParcelizer {
        final Method IconCompatParcelizer;
        final int RemoteActionCompatParcelizer;

        IconCompatParcelizer(int i, Method method) {
            this.RemoteActionCompatParcelizer = i;
            this.IconCompatParcelizer = method;
            method.setAccessible(true);
        }

        final void write(hasGetter hasgetter, anyIgnorals.read readVar, Object obj) {
            try {
                int i = this.RemoteActionCompatParcelizer;
                if (i == 0) {
                    this.IconCompatParcelizer.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.IconCompatParcelizer.invoke(obj, hasgetter);
                } else {
                    if (i != 2) {
                        return;
                    }
                    this.IconCompatParcelizer.invoke(obj, hasgetter, readVar);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return this.RemoteActionCompatParcelizer == iconCompatParcelizer.RemoteActionCompatParcelizer && this.IconCompatParcelizer.getName().equals(iconCompatParcelizer.IconCompatParcelizer.getName());
        }

        public final int hashCode() {
            return (this.RemoteActionCompatParcelizer * 31) + this.IconCompatParcelizer.getName().hashCode();
        }
    }
}
