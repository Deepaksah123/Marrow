package kotlin;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class toMagicModuleMetaRepoModel {
    public static int read(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int read(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    private toMagicModuleMetaRepoModel() {
    }

    public static String RemoteActionCompatParcelizer(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(obj);
        return sb.toString();
    }

    public static void write(Object obj) {
        if (obj == null) {
            RemoteActionCompatParcelizer();
        }
    }

    public static void read(Object obj, String str) {
        if (obj == null) {
            RemoteActionCompatParcelizer(str);
        }
    }

    public static void IconCompatParcelizer() {
        throw ((PlanOrder) write(new PlanOrder()));
    }

    private static void RemoteActionCompatParcelizer() {
        throw ((NullPointerException) write(new NullPointerException()));
    }

    private static void RemoteActionCompatParcelizer(String str) {
        throw ((NullPointerException) write(new NullPointerException(str)));
    }

    private static void AudioAttributesImplBaseParcelizer(String str) {
        throw ((setMerchantId) write(new setMerchantId(str)));
    }

    public static void IconCompatParcelizer(String str) {
        StringBuilder sb = new StringBuilder("lateinit property ");
        sb.append(str);
        sb.append(" has not been initialized");
        AudioAttributesImplBaseParcelizer(sb.toString());
    }

    public static void IconCompatParcelizer(Object obj, String str) {
        if (obj != null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" must not be null");
        throw ((IllegalStateException) write(new IllegalStateException(sb.toString())));
    }

    public static void AudioAttributesCompatParcelizer(Object obj, String str) {
        if (obj != null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" must not be null");
        throw ((NullPointerException) write(new NullPointerException(sb.toString())));
    }

    public static void RemoteActionCompatParcelizer(Object obj, String str) {
        if (obj == null) {
            write(str);
        }
    }

    public static void write(Object obj, String str) {
        if (obj == null) {
            AudioAttributesCompatParcelizer(str);
        }
    }

    private static void write(String str) {
        throw ((IllegalArgumentException) write(new IllegalArgumentException(read(str))));
    }

    private static void AudioAttributesCompatParcelizer(String str) {
        throw ((NullPointerException) write(new NullPointerException(read(str))));
    }

    private static String read(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = toMagicModuleMetaRepoModel.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        StringBuilder sb = new StringBuilder("Parameter specified as non-null is null: method ");
        sb.append(className);
        sb.append(".");
        sb.append(methodName);
        sb.append(", parameter ");
        sb.append(str);
        return sb.toString();
    }

    public static boolean RemoteActionCompatParcelizer(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean read(Double d, double d2) {
        return d != null && d.doubleValue() == d2;
    }

    public static boolean AudioAttributesCompatParcelizer(double d, Double d2) {
        return d2 != null && d == d2.doubleValue();
    }

    private static <T extends Throwable> T write(T t) {
        return (T) RemoteActionCompatParcelizer((Throwable) t, toMagicModuleMetaRepoModel.class.getName());
    }

    static <T extends Throwable> T RemoteActionCompatParcelizer(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }
    }
}
