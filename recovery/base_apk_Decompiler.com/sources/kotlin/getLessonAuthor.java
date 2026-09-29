package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getLessonAuthor {
    public static int read = 5;

    public static void write(Object obj) {
        if (RemoteActionCompatParcelizer()) {
            read();
            String.valueOf(obj);
            read();
            String.valueOf(obj);
        }
    }

    public static void AudioAttributesCompatParcelizer(Exception exc) {
        if (RemoteActionCompatParcelizer()) {
            exc.printStackTrace();
        }
    }

    public static void RemoteActionCompatParcelizer(Object obj) {
        if (write()) {
            read();
            String.valueOf(obj);
        }
    }

    private static boolean write() {
        return read > 4;
    }

    private static boolean RemoteActionCompatParcelizer() {
        return read > 0;
    }

    private static String read() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[2].getMethodName();
        String className = stackTrace[2].getClassName();
        int lineNumber = stackTrace[2].getLineNumber();
        String strSubstring = className.substring(className.lastIndexOf(46) + 1);
        StringBuilder sb = new StringBuilder();
        sb.append(strSubstring);
        sb.append(": ");
        sb.append(methodName);
        sb.append("() [");
        sb.append(lineNumber);
        sb.append("] - ");
        return sb.toString();
    }
}
