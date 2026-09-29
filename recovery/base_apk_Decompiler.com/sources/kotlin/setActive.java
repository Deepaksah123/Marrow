package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes4.dex */
public final class setActive {
    private static final Object write = new Object() { // from class: o.setActive.4
        public final String toString() {
            return "NULL_VALUE";
        }
    };
    private static volatile boolean AudioAttributesCompatParcelizer = false;

    static final class write {
        private final Throwable write;

        /* synthetic */ write(Throwable th, byte b) {
            this(th);
        }

        private write(Throwable th) {
            if (th == null) {
                read(0);
            }
            this.write = th;
        }

        public final Throwable read() {
            Throwable th = this.write;
            if (th == null) {
                read(1);
            }
            return th;
        }

        public final String toString() {
            return this.write.toString();
        }

        private static /* synthetic */ void read(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 1 ? 3 : 2];
            if (i != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i != 1) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 1) {
                throw new IllegalStateException(str2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <V> V IconCompatParcelizer(Object obj) {
        if (obj == 0) {
            write(0);
        }
        if (obj == write) {
            return null;
        }
        return obj;
    }

    public static <V> Object write(V v) {
        if (v != null) {
            if (v == null) {
                write(2);
            }
            return v;
        }
        Object obj = write;
        if (obj == null) {
            write(1);
        }
        return obj;
    }

    public static Object AudioAttributesCompatParcelizer(Throwable th) {
        return new write(th, (byte) 0);
    }

    public static <V> V read(Object obj) {
        if (obj == null) {
            write(4);
        }
        return (V) IconCompatParcelizer(RemoteActionCompatParcelizer(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <V> V RemoteActionCompatParcelizer(Object obj) {
        if (obj instanceof write) {
            throw setActiveEdition.IconCompatParcelizer(((write) obj).read());
        }
        return obj;
    }

    private static /* synthetic */ void write(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i != 3) {
            objArr[0] = AppMeasurementSdk.ConditionalUserProperty.VALUE;
        } else {
            objArr[0] = "throwable";
        }
        if (i == 1 || i == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (i != 1 && i != 2) {
            if (i == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }
}
