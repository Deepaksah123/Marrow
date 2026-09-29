package kotlin;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import kotlin.DownloadFailureReason;

/* JADX INFO: loaded from: classes3.dex */
public final class moveToLast {
    private final Map<Type, DefaultDownloadIndexDownloadCursorImpl<?>> RemoteActionCompatParcelizer;
    private final boolean read = true;
    private final List<DownloadFailureReason> write;

    public moveToLast(Map<Type, DefaultDownloadIndexDownloadCursorImpl<?>> map, boolean z, List<DownloadFailureReason> list) {
        this.RemoteActionCompatParcelizer = map;
        this.write = list;
    }

    static String RemoteActionCompatParcelizer(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder sb = new StringBuilder("Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ");
            sb.append(cls.getName());
            return sb.toString();
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder("Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ");
        sb2.append(cls.getName());
        return sb2.toString();
    }

    public final <T> getRendererCapabilities<T> write(DownloadHelperExternalSyntheticLambda3<T> downloadHelperExternalSyntheticLambda3) {
        final Type typeRemoteActionCompatParcelizer = downloadHelperExternalSyntheticLambda3.RemoteActionCompatParcelizer();
        Class<? super T> clsAudioAttributesCompatParcelizer = downloadHelperExternalSyntheticLambda3.AudioAttributesCompatParcelizer();
        final DefaultDownloadIndexDownloadCursorImpl<?> defaultDownloadIndexDownloadCursorImpl = this.RemoteActionCompatParcelizer.get(typeRemoteActionCompatParcelizer);
        if (defaultDownloadIndexDownloadCursorImpl != null) {
            return new getRendererCapabilities<T>() { // from class: o.moveToLast.1
                @Override // kotlin.getRendererCapabilities
                public final T write() {
                    return (T) defaultDownloadIndexDownloadCursorImpl.RemoteActionCompatParcelizer();
                }
            };
        }
        final DefaultDownloadIndexDownloadCursorImpl<?> defaultDownloadIndexDownloadCursorImpl2 = this.RemoteActionCompatParcelizer.get(clsAudioAttributesCompatParcelizer);
        if (defaultDownloadIndexDownloadCursorImpl2 != null) {
            return new getRendererCapabilities<T>() { // from class: o.moveToLast.15
                @Override // kotlin.getRendererCapabilities
                public final T write() {
                    return (T) defaultDownloadIndexDownloadCursorImpl2.RemoteActionCompatParcelizer();
                }
            };
        }
        getRendererCapabilities<T> getrenderercapabilitiesWrite = write(typeRemoteActionCompatParcelizer, clsAudioAttributesCompatParcelizer);
        if (getrenderercapabilitiesWrite != null) {
            return getrenderercapabilitiesWrite;
        }
        DownloadFailureReason.read readVarRemoteActionCompatParcelizer = forMediaItem.RemoteActionCompatParcelizer(this.write, clsAudioAttributesCompatParcelizer);
        getRendererCapabilities<T> getrenderercapabilities = read(clsAudioAttributesCompatParcelizer, readVarRemoteActionCompatParcelizer);
        if (getrenderercapabilities != null) {
            return getrenderercapabilities;
        }
        getRendererCapabilities<T> getrenderercapabilitiesRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(typeRemoteActionCompatParcelizer, clsAudioAttributesCompatParcelizer);
        if (getrenderercapabilitiesRemoteActionCompatParcelizer != null) {
            return getrenderercapabilitiesRemoteActionCompatParcelizer;
        }
        final String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(clsAudioAttributesCompatParcelizer);
        if (strRemoteActionCompatParcelizer != null) {
            return new getRendererCapabilities<T>() { // from class: o.moveToLast.13
                @Override // kotlin.getRendererCapabilities
                public final T write() {
                    throw new getDownloaderConstructor(strRemoteActionCompatParcelizer);
                }
            };
        }
        if (readVarRemoteActionCompatParcelizer == DownloadFailureReason.read.ALLOW) {
            return write(clsAudioAttributesCompatParcelizer);
        }
        StringBuilder sb = new StringBuilder("Unable to create instance of ");
        sb.append(clsAudioAttributesCompatParcelizer);
        sb.append("; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
        final String string = sb.toString();
        return new getRendererCapabilities<T>() { // from class: o.moveToLast.14
            @Override // kotlin.getRendererCapabilities
            public final T write() {
                throw new getDownloaderConstructor(string);
            }
        };
    }

    private static <T> getRendererCapabilities<T> write(final Type type, Class<? super T> cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new getRendererCapabilities<T>() { // from class: o.moveToLast.17
                @Override // kotlin.getRendererCapabilities
                public final T write() {
                    Type type2 = type;
                    if (type2 instanceof ParameterizedType) {
                        Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                        if (type3 instanceof Class) {
                            return (T) EnumSet.noneOf((Class) type3);
                        }
                        StringBuilder sb = new StringBuilder("Invalid EnumSet type: ");
                        sb.append(type.toString());
                        throw new getDownloaderConstructor(sb.toString());
                    }
                    StringBuilder sb2 = new StringBuilder("Invalid EnumSet type: ");
                    sb2.append(type.toString());
                    throw new getDownloaderConstructor(sb2.toString());
                }
            };
        }
        if (cls == EnumMap.class) {
            return new getRendererCapabilities<T>() { // from class: o.moveToLast.20
                @Override // kotlin.getRendererCapabilities
                public final T write() {
                    Type type2 = type;
                    if (type2 instanceof ParameterizedType) {
                        Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                        if (type3 instanceof Class) {
                            return (T) new EnumMap((Class) type3);
                        }
                        StringBuilder sb = new StringBuilder("Invalid EnumMap type: ");
                        sb.append(type.toString());
                        throw new getDownloaderConstructor(sb.toString());
                    }
                    StringBuilder sb2 = new StringBuilder("Invalid EnumMap type: ");
                    sb2.append(type.toString());
                    throw new getDownloaderConstructor(sb2.toString());
                }
            };
        }
        return null;
    }

    private static <T> getRendererCapabilities<T> read(Class<? super T> cls, DownloadFailureReason.read readVar) {
        final String str;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (readVar != DownloadFailureReason.read.ALLOW && (!forMediaItem.IconCompatParcelizer(declaredConstructor, null) || (readVar == DownloadFailureReason.read.BLOCK_ALL && !Modifier.isPublic(declaredConstructor.getModifiers())))) {
                StringBuilder sb = new StringBuilder("Unable to invoke no-args constructor of ");
                sb.append(cls);
                sb.append("; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
                final String string = sb.toString();
                return new getRendererCapabilities<T>() { // from class: o.moveToLast.19
                    @Override // kotlin.getRendererCapabilities
                    public final T write() {
                        throw new getDownloaderConstructor(string);
                    }
                };
            }
            if (readVar == DownloadFailureReason.read.ALLOW && (str = getTracks.read(declaredConstructor)) != null) {
                return new getRendererCapabilities<T>() { // from class: o.moveToLast.18
                    @Override // kotlin.getRendererCapabilities
                    public final T write() {
                        throw new getDownloaderConstructor(str);
                    }
                };
            }
            return new getRendererCapabilities<T>() { // from class: o.moveToLast.16
                @Override // kotlin.getRendererCapabilities
                public final T write() {
                    try {
                        return (T) declaredConstructor.newInstance(new Object[0]);
                    } catch (IllegalAccessException e) {
                        throw getTracks.read(e);
                    } catch (InstantiationException e2) {
                        StringBuilder sb2 = new StringBuilder("Failed to invoke constructor '");
                        sb2.append(getTracks.RemoteActionCompatParcelizer((Constructor<?>) declaredConstructor));
                        sb2.append("' with no args");
                        throw new RuntimeException(sb2.toString(), e2);
                    } catch (InvocationTargetException e3) {
                        StringBuilder sb3 = new StringBuilder("Failed to invoke constructor '");
                        sb3.append(getTracks.RemoteActionCompatParcelizer((Constructor<?>) declaredConstructor));
                        sb3.append("' with no args");
                        throw new RuntimeException(sb3.toString(), e3.getCause());
                    }
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private static <T> getRendererCapabilities<T> RemoteActionCompatParcelizer(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new getRendererCapabilities<T>() { // from class: o.moveToLast.2
                    @Override // kotlin.getRendererCapabilities
                    public final T write() {
                        return (T) new TreeSet();
                    }
                };
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new getRendererCapabilities<T>() { // from class: o.moveToLast.3
                    @Override // kotlin.getRendererCapabilities
                    public final T write() {
                        return (T) new LinkedHashSet();
                    }
                };
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new getRendererCapabilities<T>() { // from class: o.moveToLast.5
                    @Override // kotlin.getRendererCapabilities
                    public final T write() {
                        return (T) new ArrayDeque();
                    }
                };
            }
            return new getRendererCapabilities<T>() { // from class: o.moveToLast.4
                @Override // kotlin.getRendererCapabilities
                public final T write() {
                    return (T) new ArrayList();
                }
            };
        }
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
            return new getRendererCapabilities<T>() { // from class: o.moveToLast.6
                @Override // kotlin.getRendererCapabilities
                public final T write() {
                    return (T) new ConcurrentSkipListMap();
                }
            };
        }
        if (ConcurrentMap.class.isAssignableFrom(cls)) {
            return new getRendererCapabilities<T>() { // from class: o.moveToLast.8
                @Override // kotlin.getRendererCapabilities
                public final T write() {
                    return (T) new ConcurrentHashMap();
                }
            };
        }
        if (SortedMap.class.isAssignableFrom(cls)) {
            return new AnonymousClass7();
        }
        if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(DownloadHelperExternalSyntheticLambda3.write(((ParameterizedType) type).getActualTypeArguments()[0]).AudioAttributesCompatParcelizer())) {
            return new getRendererCapabilities<T>() { // from class: o.moveToLast.10
                @Override // kotlin.getRendererCapabilities
                public final T write() {
                    return (T) new LinkedHashMap();
                }
            };
        }
        return new getRendererCapabilities<T>() { // from class: o.moveToLast.9
            @Override // kotlin.getRendererCapabilities
            public final T write() {
                return (T) new DownloadHelper();
            }
        };
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: o.moveToLast$7, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public class AnonymousClass7<T> implements getRendererCapabilities<T> {
        public static int AudioAttributesCompatParcelizer;
        public static int RemoteActionCompatParcelizer;

        AnonymousClass7() {
        }

        @Override // kotlin.getRendererCapabilities
        public final T write() {
            return (T) new TreeMap();
        }

        public static int IconCompatParcelizer() {
            int i = RemoteActionCompatParcelizer;
            int i2 = i % 8107720;
            RemoteActionCompatParcelizer = i + 1;
            if (i2 != 0) {
                return AudioAttributesCompatParcelizer;
            }
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            AudioAttributesCompatParcelizer = iMaxMemory;
            return iMaxMemory;
        }
    }

    private <T> getRendererCapabilities<T> write(final Class<? super T> cls) {
        if (this.read) {
            return new getRendererCapabilities<T>() { // from class: o.moveToLast.12
                @Override // kotlin.getRendererCapabilities
                public final T write() {
                    try {
                        return (T) runTrackSelection.RemoteActionCompatParcelizer.write(cls);
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder("Unable to create instance of ");
                        sb.append(cls);
                        sb.append(". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.");
                        throw new RuntimeException(sb.toString(), e);
                    }
                }
            };
        }
        StringBuilder sb = new StringBuilder("Unable to create instance of ");
        sb.append(cls);
        sb.append("; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
        final String string = sb.toString();
        return new getRendererCapabilities<T>() { // from class: o.moveToLast.11
            @Override // kotlin.getRendererCapabilities
            public final T write() {
                throw new getDownloaderConstructor(string);
            }
        };
    }

    public final String toString() {
        return this.RemoteActionCompatParcelizer.toString();
    }
}
