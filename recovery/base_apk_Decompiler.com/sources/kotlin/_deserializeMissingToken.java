package kotlin;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.handlePropertyValue;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0003\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a5\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0014\u0010\u0005\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u00020\u000e2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013*\u00020\u000e2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\u000fH\u0000¢\u0006\u0004\b\f\u0010\u0014\u001a;\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00132\u0006\u0010\u0005\u001a\u00020\u000e2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\n\u0010\u0016\u001a+\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00172\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"", "Ljava/lang/Class;", "Lo/PropertyValueMap;", "read", "(Ljava/lang/String;)Ljava/lang/Class;", "p0", "", "p1", "", "", "write", "(Ljava/lang/Class;I)[Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lo/ObjectIdReferenceProperty;", "Lkotlin/Function1;", "", "RemoteActionCompatParcelizer", "(Lo/ObjectIdReferenceProperty;Lo/getAnswerMap;)Lo/ObjectIdReferenceProperty;", "", "(Lo/ObjectIdReferenceProperty;Lo/getAnswerMap;)Ljava/util/List;", "p2", "(Lo/ObjectIdReferenceProperty;Lo/getAnswerMap;Z)Ljava/util/List;", "Lo/getTopRankers;", "IconCompatParcelizer", "(Lo/getTopRankers;I)[Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _deserializeMissingToken {
    public static final Class<? extends PropertyValueMap<?>> read(String str) {
        try {
            Class cls = Class.forName(str);
            if (cls instanceof Class) {
                return cls;
            }
            return null;
        } catch (ClassNotFoundException e) {
            handlePropertyValue.Companion companion = handlePropertyValue.INSTANCE;
            StringBuilder sb = new StringBuilder("Unable to find PreviewProvider '");
            sb.append(str);
            sb.append('\'');
            companion.write(sb.toString(), e);
            return null;
        }
    }

    public static final Object[] write(Class<? extends PropertyValueMap<?>> cls, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        if (cls != null) {
            try {
                Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                Constructor<?> constructor = null;
                int i2 = 0;
                boolean z = false;
                Constructor<?> constructor2 = null;
                while (true) {
                    if (i2 < length) {
                        Constructor<?> constructor3 = constructors[i2];
                        if (constructor3.getParameterTypes().length == 0) {
                            if (z) {
                                break;
                            }
                            z = true;
                            constructor2 = constructor3;
                        }
                        i2++;
                    } else if (z) {
                        constructor = constructor2;
                    }
                }
                if (constructor != null) {
                    constructor.setAccessible(true);
                    Object objNewInstance = constructor.newInstance(new Object[0]);
                    toMagicModuleMetaRepoModel.read(objNewInstance, "");
                    PropertyValueMap propertyValueMap = (PropertyValueMap) objNewInstance;
                    if (i < 0) {
                        return IconCompatParcelizer(propertyValueMap.read(), propertyValueMap.write());
                    }
                    List listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(StateResult.AudioAttributesCompatParcelizer(propertyValueMap.read(), i));
                    ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listRemoteActionCompatParcelizer, 10));
                    Iterator it = listRemoteActionCompatParcelizer.iterator();
                    while (it.hasNext()) {
                        arrayList.add(AudioAttributesCompatParcelizer(it.next()));
                    }
                    return arrayList.toArray(new Object[0]);
                }
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            } catch (getFeedbacks unused) {
                throw new IllegalStateException("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
            }
        }
        return new Object[0];
    }

    private static final Object AudioAttributesCompatParcelizer(Object obj) throws NoSuchFieldException {
        if (obj != null) {
            for (Annotation annotation : obj.getClass().getAnnotations()) {
                if (annotation instanceof submitMagicModule) {
                    for (Field field : obj.getClass().getDeclaredFields()) {
                        if (field.getType().isPrimitive()) {
                            Field declaredField = obj.getClass().getDeclaredField(field.getName());
                            declaredField.setAccessible(true);
                            return declaredField.get(obj);
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
        }
        return obj;
    }

    public static final ObjectIdReferenceProperty RemoteActionCompatParcelizer(ObjectIdReferenceProperty objectIdReferenceProperty, getAnswerMap<? super ObjectIdReferenceProperty, Boolean> getanswermap) {
        return (ObjectIdReferenceProperty) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) write(objectIdReferenceProperty, getanswermap, true));
    }

    public static final List<ObjectIdReferenceProperty> AudioAttributesCompatParcelizer(ObjectIdReferenceProperty objectIdReferenceProperty, getAnswerMap<? super ObjectIdReferenceProperty, Boolean> getanswermap) {
        return write$default(objectIdReferenceProperty, getanswermap, false, 4, null);
    }

    static /* synthetic */ List write$default(ObjectIdReferenceProperty objectIdReferenceProperty, getAnswerMap getanswermap, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return write(objectIdReferenceProperty, getanswermap, z);
    }

    private static final List<ObjectIdReferenceProperty> write(ObjectIdReferenceProperty objectIdReferenceProperty, getAnswerMap<? super ObjectIdReferenceProperty, Boolean> getanswermap, boolean z) {
        ArrayList arrayList = new ArrayList();
        List listWrite = IntermediateLoginResponseBody.write(objectIdReferenceProperty);
        while (!listWrite.isEmpty()) {
            ObjectIdReferenceProperty objectIdReferenceProperty2 = (ObjectIdReferenceProperty) IntermediateLoginResponseBody.AudioAttributesImplBaseParcelizer(listWrite);
            if (getanswermap.invoke(objectIdReferenceProperty2).booleanValue()) {
                if (z) {
                    return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(objectIdReferenceProperty2);
                }
                arrayList.add(objectIdReferenceProperty2);
            }
            listWrite.addAll(objectIdReferenceProperty2.read());
        }
        return arrayList;
    }

    private static final Object[] IconCompatParcelizer(getTopRankers<? extends Object> gettoprankers, int i) {
        Iterator<? extends Object> itWrite = gettoprankers.write();
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = itWrite.next();
        }
        return objArr;
    }
}
