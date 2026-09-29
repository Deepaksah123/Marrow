package kotlin;

import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.PlanSubscriptionRSModel;
import kotlin.SearchMcqResponseBody;

/* JADX INFO: loaded from: classes4.dex */
class GTNudgeRSModel {
    private static final GTNudgeRSModel IconCompatParcelizer = write();
    private final Constructor<MethodHandles.Lookup> AudioAttributesCompatParcelizer;
    private final boolean write = true;

    Executor read() {
        return null;
    }

    static GTNudgeRSModel IconCompatParcelizer() {
        return IconCompatParcelizer;
    }

    private static GTNudgeRSModel write() {
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            return new RemoteActionCompatParcelizer();
        }
        return new GTNudgeRSModel();
    }

    GTNudgeRSModel() {
        Constructor<MethodHandles.Lookup> declaredConstructor = null;
        try {
            declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
        } catch (NoClassDefFoundError | NoSuchMethodException unused) {
        }
        this.AudioAttributesCompatParcelizer = declaredConstructor;
    }

    final List<? extends SearchMcqResponseBody.write> write(Executor executor) {
        Source source = new Source(executor);
        return this.write ? Arrays.asList(NotesSubscriptionRSModelKt.AudioAttributesCompatParcelizer, source) : Collections.singletonList(source);
    }

    final List<? extends PlanSubscriptionRSModel.IconCompatParcelizer> RemoteActionCompatParcelizer() {
        return this.write ? Collections.singletonList(GTAnalyticsV2ResponseModel.read) : Collections.emptyList();
    }

    final int AudioAttributesCompatParcelizer() {
        return this.write ? 1 : 0;
    }

    final boolean write(Method method) {
        return this.write && method.isDefault();
    }

    Object read(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        MethodHandles.Lookup lookup;
        Constructor<MethodHandles.Lookup> constructor = this.AudioAttributesCompatParcelizer;
        if (constructor != null) {
            lookup = constructor.newInstance(cls, -1);
        } else {
            lookup = MethodHandles.lookup();
        }
        return lookup.unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    static final class RemoteActionCompatParcelizer extends GTNudgeRSModel {
        RemoteActionCompatParcelizer() {
        }

        @Override // kotlin.GTNudgeRSModel
        public final Executor read() {
            return new write();
        }

        @Override // kotlin.GTNudgeRSModel
        final Object read(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            return super.read(method, cls, obj, objArr);
        }

        static final class write implements Executor {
            private final Handler IconCompatParcelizer = new Handler(Looper.getMainLooper());

            write() {
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.IconCompatParcelizer.post(runnable);
            }
        }
    }
}
