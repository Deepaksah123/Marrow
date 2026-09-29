package kotlin;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public final class getDeeplinks {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object write(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof isHdPlaybackError) {
            obj = MagicModuleFeedbackRequestBody.IconCompatParcelizer((isHdPlaybackError) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof isHdPlaybackError[]) {
                toMagicModuleMetaRepoModel.read(obj, "");
                isHdPlaybackError[] ishdplaybackerrorArr = (isHdPlaybackError[]) obj;
                ArrayList arrayList = new ArrayList(ishdplaybackerrorArr.length);
                for (isHdPlaybackError ishdplaybackerror : ishdplaybackerrorArr) {
                    arrayList.add(MagicModuleFeedbackRequestBody.IconCompatParcelizer(ishdplaybackerror));
                }
                obj = arrayList.toArray(new Class[0]);
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void AudioAttributesCompatParcelizer(int i, String str, Class<?> cls) {
        isHdPlaybackError ishdplaybackerrorWrite;
        String strAudioAttributesImplBaseParcelizer;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(cls, Class.class)) {
            ishdplaybackerrorWrite = toMagicModuleMetaDataUcModel.write(isHdPlaybackError.class);
        } else {
            ishdplaybackerrorWrite = (cls.isArray() && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(cls.getComponentType(), Class.class)) ? toMagicModuleMetaDataUcModel.write(isHdPlaybackError[].class) : MagicModuleFeedbackRequestBody.read(cls);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ishdplaybackerrorWrite.AudioAttributesImplBaseParcelizer(), (Object) toMagicModuleMetaDataUcModel.write(Object[].class).AudioAttributesImplBaseParcelizer())) {
            StringBuilder sb = new StringBuilder();
            sb.append(ishdplaybackerrorWrite.AudioAttributesImplBaseParcelizer());
            sb.append('<');
            Class<?> componentType = MagicModuleFeedbackRequestBody.IconCompatParcelizer(ishdplaybackerrorWrite).getComponentType();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(componentType, "");
            sb.append(MagicModuleFeedbackRequestBody.read(componentType).AudioAttributesImplBaseParcelizer());
            sb.append('>');
            strAudioAttributesImplBaseParcelizer = sb.toString();
        } else {
            strAudioAttributesImplBaseParcelizer = ishdplaybackerrorWrite.AudioAttributesImplBaseParcelizer();
        }
        StringBuilder sb2 = new StringBuilder("Argument #");
        sb2.append(i);
        sb2.append(' ');
        sb2.append(str);
        sb2.append(" is not of the required type ");
        sb2.append(strAudioAttributesImplBaseParcelizer);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static /* synthetic */ Object RemoteActionCompatParcelizer(Class cls, Map map) {
        Set setKeySet = map.keySet();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(cls.getDeclaredMethod((String) it.next(), new Class[0]));
        }
        return read(cls, map, arrayList);
    }

    private static final <T> boolean IconCompatParcelizer(Class<T> cls, List<Method> list, Map<String, ? extends Object> map, Object obj) throws IllegalAccessException, InvocationTargetException {
        boolean zRemoteActionCompatParcelizer;
        isHdPlaybackError ishdplaybackerrorIconCompatParcelizer;
        Class clsIconCompatParcelizer = null;
        Annotation annotation = obj instanceof Annotation ? (Annotation) obj : null;
        if (annotation != null && (ishdplaybackerrorIconCompatParcelizer = MagicModuleFeedbackRequestBody.IconCompatParcelizer(annotation)) != null) {
            clsIconCompatParcelizer = MagicModuleFeedbackRequestBody.IconCompatParcelizer(ishdplaybackerrorIconCompatParcelizer);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(clsIconCompatParcelizer, cls)) {
            List<Method> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return true;
            }
            for (Method method : list2) {
                Object obj2 = map.get(method.getName());
                Object objInvoke = method.invoke(obj, new Object[0]);
                if (obj2 instanceof boolean[]) {
                    toMagicModuleMetaRepoModel.read(objInvoke, "");
                    zRemoteActionCompatParcelizer = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                } else if (obj2 instanceof char[]) {
                    toMagicModuleMetaRepoModel.read(objInvoke, "");
                    zRemoteActionCompatParcelizer = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                } else if (obj2 instanceof byte[]) {
                    toMagicModuleMetaRepoModel.read(objInvoke, "");
                    zRemoteActionCompatParcelizer = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                } else if (obj2 instanceof short[]) {
                    toMagicModuleMetaRepoModel.read(objInvoke, "");
                    zRemoteActionCompatParcelizer = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                } else if (obj2 instanceof int[]) {
                    toMagicModuleMetaRepoModel.read(objInvoke, "");
                    zRemoteActionCompatParcelizer = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                } else if (obj2 instanceof float[]) {
                    toMagicModuleMetaRepoModel.read(objInvoke, "");
                    zRemoteActionCompatParcelizer = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                } else if (obj2 instanceof long[]) {
                    toMagicModuleMetaRepoModel.read(objInvoke, "");
                    zRemoteActionCompatParcelizer = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                } else if (obj2 instanceof double[]) {
                    toMagicModuleMetaRepoModel.read(objInvoke, "");
                    zRemoteActionCompatParcelizer = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                } else if (obj2 instanceof Object[]) {
                    toMagicModuleMetaRepoModel.read(objInvoke, "");
                    zRemoteActionCompatParcelizer = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
                } else {
                    zRemoteActionCompatParcelizer = toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj2, objInvoke);
                }
                if (!zRemoteActionCompatParcelizer) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: o.getDeeplinks$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "", "IconCompatParcelizer", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<Integer> {
        private /* synthetic */ Map<String, Object> $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            int iHashCode;
            Iterator<T> it = this.$read.entrySet().iterator();
            int iHashCode2 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    iHashCode = Arrays.hashCode((boolean[]) value);
                } else if (value instanceof char[]) {
                    iHashCode = Arrays.hashCode((char[]) value);
                } else if (value instanceof byte[]) {
                    iHashCode = Arrays.hashCode((byte[]) value);
                } else if (value instanceof short[]) {
                    iHashCode = Arrays.hashCode((short[]) value);
                } else if (value instanceof int[]) {
                    iHashCode = Arrays.hashCode((int[]) value);
                } else if (value instanceof float[]) {
                    iHashCode = Arrays.hashCode((float[]) value);
                } else if (value instanceof long[]) {
                    iHashCode = Arrays.hashCode((long[]) value);
                } else if (value instanceof double[]) {
                    iHashCode = Arrays.hashCode((double[]) value);
                } else {
                    iHashCode = value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode();
                }
                iHashCode2 += iHashCode ^ (str.hashCode() * 127);
            }
            return Integer.valueOf(iHashCode2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Map<String, ? extends Object> map) {
            super(0);
            this.$read = map;
        }
    }

    private static final int AudioAttributesCompatParcelizer(RenewEligible<Integer> renewEligible) {
        return renewEligible.RemoteActionCompatParcelizer().intValue();
    }

    public static final <T> T read(Class<T> cls, Map<String, ? extends Object> map, List<Method> list) {
        toMagicModuleMetaRepoModel.write(cls, "");
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(list, "");
        RenewEligible renewEligibleRemoteActionCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new AnonymousClass1(map));
        T t = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new getDefaultPlanBannerDesign(cls, map, getRenewExpiresOn.RemoteActionCompatParcelizer(new AnonymousClass5(cls, map)), renewEligibleRemoteActionCompatParcelizer, list));
        toMagicModuleMetaRepoModel.read(t, "");
        return t;
    }

    /* JADX INFO: renamed from: o.getDeeplinks$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "", "IconCompatParcelizer", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<String> {
        private /* synthetic */ Map<String, Object> $AudioAttributesCompatParcelizer;
        private /* synthetic */ Class<T> $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            Class<T> cls = this.$IconCompatParcelizer;
            Map<String, Object> map = this.$AudioAttributesCompatParcelizer;
            StringBuilder sb = new StringBuilder();
            sb.append('@');
            sb.append(cls.getCanonicalName());
            IntermediateLoginResponseBody.write(map.entrySet(), sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) != 0 ? "" : ")", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : AnonymousClass4.IconCompatParcelizer);
            String string = sb.toString();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            return string;
        }

        /* JADX INFO: renamed from: o.getDeeplinks$5$4, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "", "", "p0", "", "write", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<Map.Entry<? extends String, ? extends Object>, CharSequence> {
            public static final AnonymousClass4 IconCompatParcelizer = new AnonymousClass4();

            @Override // kotlin.getAnswerMap
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(Map.Entry<String, ? extends Object> entry) {
                String string;
                toMagicModuleMetaRepoModel.write(entry, "");
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    string = Arrays.toString((boolean[]) value);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                } else if (value instanceof char[]) {
                    string = Arrays.toString((char[]) value);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                } else if (value instanceof byte[]) {
                    string = Arrays.toString((byte[]) value);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                } else if (value instanceof short[]) {
                    string = Arrays.toString((short[]) value);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                } else if (value instanceof int[]) {
                    string = Arrays.toString((int[]) value);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                } else if (value instanceof float[]) {
                    string = Arrays.toString((float[]) value);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                } else if (value instanceof long[]) {
                    string = Arrays.toString((long[]) value);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                } else if (value instanceof double[]) {
                    string = Arrays.toString((double[]) value);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                } else if (value instanceof Object[]) {
                    string = Arrays.toString((Object[]) value);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                } else {
                    string = value.toString();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(key);
                sb.append('=');
                sb.append(string);
                return sb.toString();
            }

            AnonymousClass4() {
                super(1);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(Class<T> cls, Map<String, ? extends Object> map) {
            super(0);
            this.$IconCompatParcelizer = cls;
            this.$AudioAttributesCompatParcelizer = map;
        }
    }

    private static final String read(RenewEligible<String> renewEligible) {
        return renewEligible.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AudioAttributesCompatParcelizer(Class cls, Map map, RenewEligible renewEligible, RenewEligible renewEligible2, List list, Method method, Object[] objArr) {
        toMagicModuleMetaRepoModel.write(cls, "");
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(renewEligible, "");
        toMagicModuleMetaRepoModel.write(renewEligible2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        String name = method.getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(AudioAttributesCompatParcelizer(renewEligible2));
                }
            } else if (name.equals("toString")) {
                return read(renewEligible);
            }
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) name, (Object) "equals") && objArr != null && objArr.length == 1) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArr, "");
            return Boolean.valueOf(IconCompatParcelizer(cls, list, map, getOrderDetails.MediaBrowserCompatSearchResultReceiver(objArr)));
        }
        if (map.containsKey(name)) {
            return map.get(name);
        }
        StringBuilder sb = new StringBuilder("Method is not supported: ");
        sb.append(method);
        sb.append(" (args: ");
        if (objArr == null) {
            objArr = new Object[0];
        }
        sb.append(getOrderDetails.onCommand(objArr));
        sb.append(')');
        throw new component28(sb.toString());
    }
}
