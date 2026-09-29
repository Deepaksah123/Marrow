package kotlin;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.r8lambdaS__QVsutFC117zAPgt_KKJAKcRY;

/* JADX INFO: loaded from: classes2.dex */
public final class toBundleIncludeLocalConfiguration {
    private static final r8lambdaS__QVsutFC117zAPgt_KKJAKcRY.RemoteActionCompatParcelizer<?> RemoteActionCompatParcelizer = new r8lambdaS__QVsutFC117zAPgt_KKJAKcRY.RemoteActionCompatParcelizer<Object>() { // from class: o.toBundleIncludeLocalConfiguration.5
        @Override // o.r8lambdaS__QVsutFC117zAPgt_KKJAKcRY.RemoteActionCompatParcelizer
        public final r8lambdaS__QVsutFC117zAPgt_KKJAKcRY<Object> write(Object obj) {
            return new IconCompatParcelizer(obj);
        }

        @Override // o.r8lambdaS__QVsutFC117zAPgt_KKJAKcRY.RemoteActionCompatParcelizer
        public final Class<Object> IconCompatParcelizer() {
            throw new UnsupportedOperationException("Not implemented");
        }
    };
    private final Map<Class<?>, r8lambdaS__QVsutFC117zAPgt_KKJAKcRY.RemoteActionCompatParcelizer<?>> IconCompatParcelizer = new HashMap();

    public final void read(r8lambdaS__QVsutFC117zAPgt_KKJAKcRY.RemoteActionCompatParcelizer<?> remoteActionCompatParcelizer) {
        synchronized (this) {
            this.IconCompatParcelizer.put(remoteActionCompatParcelizer.IconCompatParcelizer(), remoteActionCompatParcelizer);
        }
    }

    public final <T> r8lambdaS__QVsutFC117zAPgt_KKJAKcRY<T> write(T t) {
        r8lambdaS__QVsutFC117zAPgt_KKJAKcRY<T> r8lambdas__qvsutfc117zapgt_kkjakcry;
        synchronized (this) {
            moveMediaSource.AudioAttributesCompatParcelizer(t);
            r8lambdaS__QVsutFC117zAPgt_KKJAKcRY.RemoteActionCompatParcelizer<?> remoteActionCompatParcelizer = this.IconCompatParcelizer.get(t.getClass());
            if (remoteActionCompatParcelizer == null) {
                Iterator<r8lambdaS__QVsutFC117zAPgt_KKJAKcRY.RemoteActionCompatParcelizer<?>> it = this.IconCompatParcelizer.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    r8lambdaS__QVsutFC117zAPgt_KKJAKcRY.RemoteActionCompatParcelizer<?> next = it.next();
                    if (next.IconCompatParcelizer().isAssignableFrom(t.getClass())) {
                        remoteActionCompatParcelizer = next;
                        break;
                    }
                }
            }
            if (remoteActionCompatParcelizer == null) {
                remoteActionCompatParcelizer = RemoteActionCompatParcelizer;
            }
            r8lambdas__qvsutfc117zapgt_kkjakcry = (r8lambdaS__QVsutFC117zAPgt_KKJAKcRY<T>) remoteActionCompatParcelizer.write(t);
        }
        return r8lambdas__qvsutfc117zapgt_kkjakcry;
    }

    static final class IconCompatParcelizer implements r8lambdaS__QVsutFC117zAPgt_KKJAKcRY<Object> {
        private final Object read;

        @Override // kotlin.r8lambdaS__QVsutFC117zAPgt_KKJAKcRY
        public final void read() {
        }

        IconCompatParcelizer(Object obj) {
            this.read = obj;
        }

        @Override // kotlin.r8lambdaS__QVsutFC117zAPgt_KKJAKcRY
        public final Object IconCompatParcelizer() {
            return this.read;
        }
    }
}
