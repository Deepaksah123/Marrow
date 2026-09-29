package in.juspay.widget.qrscanner.com.google.zxing;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ReaderException extends Exception {
    protected static boolean a;
    protected static final StackTraceElement[] b;

    static {
        a = System.getProperty("surefire.test.class.path") != null;
        b = new StackTraceElement[0];
    }

    public ReaderException() {
    }

    ReaderException(Throwable th) {
        super(th);
    }

    public static void setStackTrace(boolean z) {
        a = z;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        synchronized (this) {
        }
        return null;
    }
}
