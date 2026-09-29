package kotlin;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes4.dex */
public final class setAudioUnderrunDurationMs {
    private static final getTotalDurationMs read;
    private static final int write = write((Class<?>) Throwable.class, -1);

    static {
        VideoResumeInfo videoResumeInfo;
        try {
            videoResumeInfo = setPauseTouchCount.IconCompatParcelizer() ? VideoResumeInfo.RemoteActionCompatParcelizer : getLicenseInitiateTimestampMs.read;
        } catch (Throwable unused) {
            videoResumeInfo = VideoResumeInfo.RemoteActionCompatParcelizer;
        }
        read = videoResumeInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends Throwable> E write(E e) {
        Object obj;
        if (e instanceof setTestStatus) {
            try {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                obj = C0177getRfBanners.read(((setTestStatus) e).RemoteActionCompatParcelizer());
            } catch (Throwable th) {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
                obj = C0177getRfBanners.read(SdkPayloadData.write(th));
            }
            if (C0177getRfBanners.RemoteActionCompatParcelizer(obj)) {
                obj = null;
            }
            return (E) obj;
        }
        return (E) read.AudioAttributesCompatParcelizer(e.getClass()).invoke(e);
    }

    static final class write implements getAnswerMap {
        public static final write IconCompatParcelizer = new write();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ Object invoke(Object obj) {
            return null;
        }

        write() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> getAnswerMap<Throwable, Throwable> read(Class<E> cls) {
        Object next;
        getAnswerMap<Throwable, Throwable> getanswermap;
        Pair pairWrite;
        write writeVar = write.IconCompatParcelizer;
        if (write == write((Class<?>) cls, 0)) {
            Constructor<?>[] constructors = cls.getConstructors();
            ArrayList arrayList = new ArrayList(constructors.length);
            int length = constructors.length;
            int i = 0;
            while (true) {
                next = null;
                if (i >= length) {
                    break;
                }
                final Constructor<?> constructor = constructors[i];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length2 = parameterTypes.length;
                if (length2 == 0) {
                    pairWrite = setAction.write(write((getAnswerMap<? super Throwable, ? extends Throwable>) new getAnswerMap() { // from class: o.setLandscapeDurationMs
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj) {
                            return setAudioUnderrunDurationMs.AudioAttributesImplApi26Parcelizer(constructor, (Throwable) obj);
                        }
                    }), 0);
                } else if (length2 == 1) {
                    Class<?> cls2 = parameterTypes[0];
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(cls2, String.class)) {
                        pairWrite = setAction.write(write((getAnswerMap<? super Throwable, ? extends Throwable>) new getAnswerMap() { // from class: o.setLicensingResponseTimestampMs
                            @Override // kotlin.getAnswerMap
                            public final Object invoke(Object obj) {
                                return setAudioUnderrunDurationMs.AudioAttributesImplBaseParcelizer(constructor, (Throwable) obj);
                            }
                        }), 2);
                    } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(cls2, Throwable.class)) {
                        pairWrite = setAction.write(write((getAnswerMap<? super Throwable, ? extends Throwable>) new getAnswerMap() { // from class: o.setMinBitRateReq
                            @Override // kotlin.getAnswerMap
                            public final Object invoke(Object obj) {
                                return setAudioUnderrunDurationMs.MediaBrowserCompatItemReceiver(constructor, (Throwable) obj);
                            }
                        }), 1);
                    } else {
                        pairWrite = setAction.write(null, -1);
                    }
                } else if (length2 == 2) {
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(parameterTypes[0], String.class) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(parameterTypes[1], Throwable.class)) {
                        pairWrite = setAction.write(write((getAnswerMap<? super Throwable, ? extends Throwable>) new getAnswerMap() { // from class: o.setLicenseInitiateTimestampMs
                            @Override // kotlin.getAnswerMap
                            public final Object invoke(Object obj) {
                                return setAudioUnderrunDurationMs.AudioAttributesCompatParcelizer(constructor, (Throwable) obj);
                            }
                        }), 3);
                    } else {
                        pairWrite = setAction.write(null, -1);
                    }
                } else {
                    pairWrite = setAction.write(null, -1);
                }
                arrayList.add(pairWrite);
                i++;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iIntValue = ((Number) ((Pair) next).IconCompatParcelizer()).intValue();
                    do {
                        Object next2 = it.next();
                        int iIntValue2 = ((Number) ((Pair) next2).IconCompatParcelizer()).intValue();
                        if (iIntValue < iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it.hasNext());
                }
            }
            Pair pair = (Pair) next;
            if (pair != null && (getanswermap = (getAnswerMap) pair.write()) != null) {
                return getanswermap;
            }
        }
        return writeVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable AudioAttributesCompatParcelizer(Constructor constructor, Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th.getMessage(), th);
        toMagicModuleMetaRepoModel.read(objNewInstance, "");
        return (Throwable) objNewInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable AudioAttributesImplBaseParcelizer(Constructor constructor, Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th.getMessage());
        toMagicModuleMetaRepoModel.read(objNewInstance, "");
        Throwable th2 = (Throwable) objNewInstance;
        th2.initCause(th);
        return th2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable MediaBrowserCompatItemReceiver(Constructor constructor, Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(th);
        toMagicModuleMetaRepoModel.read(objNewInstance, "");
        return (Throwable) objNewInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable AudioAttributesImplApi26Parcelizer(Constructor constructor, Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = constructor.newInstance(new Object[0]);
        toMagicModuleMetaRepoModel.read(objNewInstance, "");
        Throwable th2 = (Throwable) objNewInstance;
        th2.initCause(th);
        return th2;
    }

    private static final getAnswerMap<Throwable, Throwable> write(final getAnswerMap<? super Throwable, ? extends Throwable> getanswermap) {
        return new getAnswerMap() { // from class: o.setNetworkChanged
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setAudioUnderrunDurationMs.IconCompatParcelizer(getanswermap, (Throwable) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable IconCompatParcelizer(getAnswerMap getanswermap, Throwable th) {
        Object obj;
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            Throwable th2 = (Throwable) getanswermap.invoke(th);
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) th.getMessage(), (Object) th2.getMessage()) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) th2.getMessage(), (Object) th.toString())) {
                th2 = null;
            }
            obj = C0177getRfBanners.read(th2);
        } catch (Throwable th3) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(SdkPayloadData.write(th3));
        }
        return (Throwable) (C0177getRfBanners.RemoteActionCompatParcelizer(obj) ? null : obj);
    }

    private static final int write(Class<?> cls, int i) {
        Object objValueOf;
        MagicModuleFeedbackRequestBody.read(cls);
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            objValueOf = C0177getRfBanners.read(Integer.valueOf(AudioAttributesCompatParcelizer(cls)));
        } catch (Throwable th) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            objValueOf = C0177getRfBanners.read(SdkPayloadData.write(th));
        }
        if (C0177getRfBanners.RemoteActionCompatParcelizer(objValueOf)) {
            objValueOf = Integer.valueOf(i);
        }
        return ((Number) objValueOf).intValue();
    }

    private static /* synthetic */ int AudioAttributesCompatParcelizer(Class cls) {
        return read((Class<?>) cls, 0);
    }

    private static final int read(Class<?> cls, int i) {
        do {
            int i2 = 0;
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i;
    }
}
