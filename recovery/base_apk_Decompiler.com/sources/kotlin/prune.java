package kotlin;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes2.dex */
public final class prune {
    private static final Object IconCompatParcelizer = new Object();
    private static read read = read.write;

    public interface read {
        public static final read write = new read() { // from class: o.prune.read.3
            @Override // o.prune.read
            public final void RemoteActionCompatParcelizer(String str) {
                prune.AudioAttributesCompatParcelizer(str, (Throwable) null);
            }

            @Override // o.prune.read
            public final void AudioAttributesCompatParcelizer(String str) {
                prune.AudioAttributesCompatParcelizer(str, (Throwable) null);
            }

            @Override // o.prune.read
            public final void IconCompatParcelizer(String str, Throwable th) {
                prune.AudioAttributesCompatParcelizer(str, th);
            }

            @Override // o.prune.read
            public final void AudioAttributesCompatParcelizer(String str, Throwable th) {
                prune.AudioAttributesCompatParcelizer(str, th);
            }
        };

        void AudioAttributesCompatParcelizer(String str);

        void AudioAttributesCompatParcelizer(String str, Throwable th);

        void IconCompatParcelizer(String str, Throwable th);

        void RemoteActionCompatParcelizer(String str);
    }

    public static void IconCompatParcelizer(String str, String str2) {
        synchronized (IconCompatParcelizer) {
            read.RemoteActionCompatParcelizer(str2);
        }
    }

    public static void write(String str, String str2) {
        synchronized (IconCompatParcelizer) {
            read.AudioAttributesCompatParcelizer(str2);
        }
    }

    public static void RemoteActionCompatParcelizer(String str, String str2) {
        synchronized (IconCompatParcelizer) {
            read.IconCompatParcelizer(str2, null);
        }
    }

    public static void write(String str, String str2, Throwable th) {
        synchronized (IconCompatParcelizer) {
            read.IconCompatParcelizer(str2, th);
        }
    }

    public static void AudioAttributesCompatParcelizer(String str, String str2) {
        synchronized (IconCompatParcelizer) {
            read.AudioAttributesCompatParcelizer(str2, null);
        }
    }

    public static void read(String str, String str2, Throwable th) {
        synchronized (IconCompatParcelizer) {
            read.AudioAttributesCompatParcelizer(str2, th);
        }
    }

    private static String write(Throwable th) {
        if (th == null) {
            return null;
        }
        synchronized (IconCompatParcelizer) {
            if (read(th)) {
                return "UnknownHostException (no network)";
            }
            return Log.getStackTraceString(th).trim().replace("\t", "    ");
        }
    }

    public static String AudioAttributesCompatParcelizer(String str, Throwable th) {
        String strWrite = write(th);
        if (TextUtils.isEmpty(strWrite)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\n  ");
        sb.append(strWrite.replace("\n", "\n  "));
        sb.append('\n');
        return sb.toString();
    }

    private static boolean read(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }
}
