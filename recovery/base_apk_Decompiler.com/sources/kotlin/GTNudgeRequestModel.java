package kotlin;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.PlanSubscriptionRSModel;
import kotlin.SchemaDetailRSModel;
import kotlin.SearchMcqResponseBody;
import kotlin.toDownloadInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class GTNudgeRequestModel {
    private List<PlanSubscriptionRSModel.IconCompatParcelizer> AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    final toDownloadInfo.AudioAttributesCompatParcelizer IconCompatParcelizer;
    private final Map<Method, getShowNudge<?>> MediaBrowserCompatCustomActionResultReceiver = new ConcurrentHashMap();
    private List<SearchMcqResponseBody.write> RemoteActionCompatParcelizer;
    private Executor read;
    final ThemeAlphaConstantsKt write;

    GTNudgeRequestModel(toDownloadInfo.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, ThemeAlphaConstantsKt themeAlphaConstantsKt, List<PlanSubscriptionRSModel.IconCompatParcelizer> list, List<SearchMcqResponseBody.write> list2, Executor executor, boolean z) {
        this.IconCompatParcelizer = audioAttributesCompatParcelizer;
        this.write = themeAlphaConstantsKt;
        this.AudioAttributesCompatParcelizer = list;
        this.RemoteActionCompatParcelizer = list2;
        this.read = executor;
        this.AudioAttributesImplApi26Parcelizer = z;
    }

    public final <T> T read(final Class<T> cls) {
        RemoteActionCompatParcelizer(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: o.GTNudgeRequestModel.2
            private final GTNudgeRSModel read = GTNudgeRSModel.IconCompatParcelizer();
            private final Object[] RemoteActionCompatParcelizer = new Object[0];

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                if (objArr == null) {
                    objArr = this.RemoteActionCompatParcelizer;
                }
                if (this.read.write(method)) {
                    return this.read.read(method, cls, obj, objArr);
                }
                return GTNudgeRequestModel.this.read(method).write(objArr);
            }
        });
    }

    private void RemoteActionCompatParcelizer(Class<?> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<?> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.AudioAttributesImplApi26Parcelizer) {
            GTNudgeRSModel gTNudgeRSModelIconCompatParcelizer = GTNudgeRSModel.IconCompatParcelizer();
            for (Method method : cls.getDeclaredMethods()) {
                if (!gTNudgeRSModelIconCompatParcelizer.write(method) && !Modifier.isStatic(method.getModifiers())) {
                    read(method);
                }
            }
        }
    }

    final getShowNudge<?> read(Method method) {
        getShowNudge<?> getshownudgeAudioAttributesCompatParcelizer;
        getShowNudge<?> getshownudge = this.MediaBrowserCompatCustomActionResultReceiver.get(method);
        if (getshownudge != null) {
            return getshownudge;
        }
        synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
            getshownudgeAudioAttributesCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.get(method);
            if (getshownudgeAudioAttributesCompatParcelizer == null) {
                getshownudgeAudioAttributesCompatParcelizer = getShowNudge.AudioAttributesCompatParcelizer(this, method);
                this.MediaBrowserCompatCustomActionResultReceiver.put(method, getshownudgeAudioAttributesCompatParcelizer);
            }
        }
        return getshownudgeAudioAttributesCompatParcelizer;
    }

    public final SearchMcqResponseBody<?, ?> write(Type type, Annotation[] annotationArr) {
        return read(type, annotationArr);
    }

    private SearchMcqResponseBody<?, ?> read(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.RemoteActionCompatParcelizer.indexOf(null) + 1;
        int size = this.RemoteActionCompatParcelizer.size();
        for (int i = iIndexOf; i < size; i++) {
            SearchMcqResponseBody<?, ?> searchMcqResponseBody = this.RemoteActionCompatParcelizer.get(i).read(type, annotationArr);
            if (searchMcqResponseBody != null) {
                return searchMcqResponseBody;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.RemoteActionCompatParcelizer.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.RemoteActionCompatParcelizer.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> PlanSubscriptionRSModel<T, ThemeKtExternalSyntheticLambda2> IconCompatParcelizer(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return RemoteActionCompatParcelizer(type, annotationArr, annotationArr2);
    }

    private <T> PlanSubscriptionRSModel<T, ThemeKtExternalSyntheticLambda2> RemoteActionCompatParcelizer(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.AudioAttributesCompatParcelizer.indexOf(null) + 1;
        int size = this.AudioAttributesCompatParcelizer.size();
        for (int i = iIndexOf; i < size; i++) {
            PlanSubscriptionRSModel<T, ThemeKtExternalSyntheticLambda2> planSubscriptionRSModel = (PlanSubscriptionRSModel<T, ThemeKtExternalSyntheticLambda2>) this.AudioAttributesCompatParcelizer.get(i).write(type);
            if (planSubscriptionRSModel != null) {
                return planSubscriptionRSModel;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.AudioAttributesCompatParcelizer.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.AudioAttributesCompatParcelizer.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> PlanSubscriptionRSModel<ActivityAdapterModule, T> AudioAttributesCompatParcelizer(Type type, Annotation[] annotationArr) {
        return IconCompatParcelizer(type, annotationArr);
    }

    private <T> PlanSubscriptionRSModel<ActivityAdapterModule, T> IconCompatParcelizer(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.AudioAttributesCompatParcelizer.indexOf(null) + 1;
        int size = this.AudioAttributesCompatParcelizer.size();
        for (int i = iIndexOf; i < size; i++) {
            PlanSubscriptionRSModel<ActivityAdapterModule, T> planSubscriptionRSModel = (PlanSubscriptionRSModel<ActivityAdapterModule, T>) this.AudioAttributesCompatParcelizer.get(i).RemoteActionCompatParcelizer(type, annotationArr, this);
            if (planSubscriptionRSModel != null) {
                return planSubscriptionRSModel;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.AudioAttributesCompatParcelizer.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.AudioAttributesCompatParcelizer.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> PlanSubscriptionRSModel<T, String> RemoteActionCompatParcelizer(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.AudioAttributesCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            this.AudioAttributesCompatParcelizer.get(i);
        }
        return SchemaDetailRSModel.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
    }

    public static final class write {
        private final List<SearchMcqResponseBody.write> AudioAttributesCompatParcelizer;
        private boolean AudioAttributesImplBaseParcelizer;
        private Executor IconCompatParcelizer;
        private final GTNudgeRSModel MediaBrowserCompatCustomActionResultReceiver;
        private toDownloadInfo.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer;
        private ThemeAlphaConstantsKt read;
        private final List<PlanSubscriptionRSModel.IconCompatParcelizer> write;

        private write(GTNudgeRSModel gTNudgeRSModel) {
            this.write = new ArrayList();
            this.AudioAttributesCompatParcelizer = new ArrayList();
            this.MediaBrowserCompatCustomActionResultReceiver = gTNudgeRSModel;
        }

        public write() {
            this(GTNudgeRSModel.IconCompatParcelizer());
        }

        public final write read(ThemeKtExternalSyntheticLambda3 themeKtExternalSyntheticLambda3) {
            return IconCompatParcelizer((toDownloadInfo.AudioAttributesCompatParcelizer) Objects.requireNonNull(themeKtExternalSyntheticLambda3, "client == null"));
        }

        private write IconCompatParcelizer(toDownloadInfo.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            this.RemoteActionCompatParcelizer = (toDownloadInfo.AudioAttributesCompatParcelizer) Objects.requireNonNull(audioAttributesCompatParcelizer, "factory == null");
            return this;
        }

        public final write IconCompatParcelizer(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return IconCompatParcelizer(ThemeAlphaConstantsKt.AudioAttributesCompatParcelizer(str));
        }

        private write IconCompatParcelizer(ThemeAlphaConstantsKt themeAlphaConstantsKt) {
            Objects.requireNonNull(themeAlphaConstantsKt, "baseUrl == null");
            if (!"".equals(themeAlphaConstantsKt.MediaBrowserCompatItemReceiver().get(r0.size() - 1))) {
                throw new IllegalArgumentException("baseUrl must end in /: ".concat(String.valueOf(themeAlphaConstantsKt)));
            }
            this.read = themeAlphaConstantsKt;
            return this;
        }

        public final write write(PlanSubscriptionRSModel.IconCompatParcelizer iconCompatParcelizer) {
            this.write.add((PlanSubscriptionRSModel.IconCompatParcelizer) Objects.requireNonNull(iconCompatParcelizer, "factory == null"));
            return this;
        }

        public final write read(SearchMcqResponseBody.write writeVar) {
            this.AudioAttributesCompatParcelizer.add((SearchMcqResponseBody.write) Objects.requireNonNull(writeVar, "factory == null"));
            return this;
        }

        public final GTNudgeRequestModel read() {
            if (this.read == null) {
                throw new IllegalStateException("Base URL required.");
            }
            toDownloadInfo.AudioAttributesCompatParcelizer themeKtExternalSyntheticLambda3 = this.RemoteActionCompatParcelizer;
            if (themeKtExternalSyntheticLambda3 == null) {
                themeKtExternalSyntheticLambda3 = new ThemeKtExternalSyntheticLambda3();
            }
            toDownloadInfo.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = themeKtExternalSyntheticLambda3;
            Executor executor = this.MediaBrowserCompatCustomActionResultReceiver.read();
            ArrayList arrayList = new ArrayList(this.AudioAttributesCompatParcelizer);
            arrayList.addAll(this.MediaBrowserCompatCustomActionResultReceiver.write(executor));
            ArrayList arrayList2 = new ArrayList(this.write.size() + 1 + this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer());
            arrayList2.add(new SchemaDetailRSModel());
            arrayList2.addAll(this.write);
            arrayList2.addAll(this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer());
            return new GTNudgeRequestModel(audioAttributesCompatParcelizer, this.read, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor, this.AudioAttributesImplBaseParcelizer);
        }
    }
}
