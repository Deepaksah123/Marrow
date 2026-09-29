package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class idResolver extends IOException {
    public final int read;

    public static boolean read(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof idResolver) && ((idResolver) cause).read == 2008) {
                return true;
            }
        }
        return false;
    }

    public idResolver(int i) {
        this.read = i;
    }

    public idResolver(Throwable th, int i) {
        super(th);
        this.read = i;
    }

    public idResolver(String str, int i) {
        super(str);
        this.read = i;
    }

    public idResolver(String str, Throwable th, int i) {
        super(str, th);
        this.read = i;
    }
}
