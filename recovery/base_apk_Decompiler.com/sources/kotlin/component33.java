package kotlin;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes4.dex */
public final class component33 {

    public static abstract class RemoteActionCompatParcelizer<T> {
        private static final Object write = new Object() { // from class: o.component33.RemoteActionCompatParcelizer.2
        };

        public abstract T invoke();

        public final T write() {
            return invoke();
        }

        protected static Object AudioAttributesCompatParcelizer(T t) {
            return t == null ? write : t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        protected static T write(Object obj) {
            if (obj == write) {
                return null;
            }
            return obj;
        }
    }

    public static class AudioAttributesCompatParcelizer<T> extends RemoteActionCompatParcelizer<T> {
        private final getCreatedOnDateMs<T> IconCompatParcelizer;
        private volatile Object RemoteActionCompatParcelizer;

        public AudioAttributesCompatParcelizer(getCreatedOnDateMs<T> getcreatedondatems) {
            if (getcreatedondatems == null) {
                IconCompatParcelizer();
            }
            this.RemoteActionCompatParcelizer = null;
            this.IconCompatParcelizer = getcreatedondatems;
        }

        @Override // o.component33.RemoteActionCompatParcelizer
        public final T invoke() {
            Object obj = this.RemoteActionCompatParcelizer;
            if (obj != null) {
                return (T) write(obj);
            }
            T tInvoke = this.IconCompatParcelizer.invoke();
            this.RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer(tInvoke);
            return tInvoke;
        }

        private static /* synthetic */ void IconCompatParcelizer() {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazyVal", "<init>"));
        }
    }

    public static class IconCompatParcelizer<T> extends RemoteActionCompatParcelizer<T> implements getCreatedOnDateMs<T> {
        private volatile SoftReference<Object> AudioAttributesCompatParcelizer;
        private final getCreatedOnDateMs<T> write;

        public IconCompatParcelizer(T t, getCreatedOnDateMs<T> getcreatedondatems) {
            if (getcreatedondatems == null) {
                RemoteActionCompatParcelizer();
            }
            this.AudioAttributesCompatParcelizer = null;
            this.write = getcreatedondatems;
            if (t != null) {
                this.AudioAttributesCompatParcelizer = new SoftReference<>(AudioAttributesCompatParcelizer(t));
            }
        }

        @Override // o.component33.RemoteActionCompatParcelizer
        public final T invoke() {
            Object obj;
            SoftReference<Object> softReference = this.AudioAttributesCompatParcelizer;
            if (softReference != null && (obj = softReference.get()) != null) {
                return (T) write(obj);
            }
            T tInvoke = this.write.invoke();
            this.AudioAttributesCompatParcelizer = new SoftReference<>(AudioAttributesCompatParcelizer(tInvoke));
            return tInvoke;
        }

        private static /* synthetic */ void RemoteActionCompatParcelizer() {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }
    }

    public static <T> AudioAttributesCompatParcelizer<T> RemoteActionCompatParcelizer(getCreatedOnDateMs<T> getcreatedondatems) {
        return new AudioAttributesCompatParcelizer<>(getcreatedondatems);
    }

    public static <T> IconCompatParcelizer<T> write(T t, getCreatedOnDateMs<T> getcreatedondatems) {
        if (getcreatedondatems == null) {
            IconCompatParcelizer(1);
        }
        return new IconCompatParcelizer<>(t, getcreatedondatems);
    }

    public static <T> IconCompatParcelizer<T> read(getCreatedOnDateMs<T> getcreatedondatems) {
        if (getcreatedondatems == null) {
            IconCompatParcelizer(2);
        }
        return write(null, getcreatedondatems);
    }

    private static /* synthetic */ void IconCompatParcelizer(int i) {
        Object[] objArr = new Object[3];
        objArr[0] = "initializer";
        objArr[1] = "kotlin/reflect/jvm/internal/ReflectProperties";
        if (i == 1 || i == 2) {
            objArr[2] = "lazySoft";
        } else {
            objArr[2] = "lazy";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
