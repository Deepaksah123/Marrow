package kotlin;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class getTrackTypeForHdlr {
    private final String RemoteActionCompatParcelizer;

    public getTrackTypeForHdlr(String str) {
        int iMyUid = Process.myUid();
        int iMyPid = Process.myPid();
        StringBuilder sb = new StringBuilder("UID: [");
        sb.append(iMyUid);
        sb.append("]  PID: [");
        sb.append(iMyPid);
        sb.append("] ");
        this.RemoteActionCompatParcelizer = sb.toString().concat(str);
    }

    private static String read(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                String strJoin = TextUtils.join(", ", objArr);
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(" [");
                sb.append(strJoin);
                sb.append("]");
                str2 = sb.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" : ");
        sb2.append(str2);
        return sb2.toString();
    }

    public final int IconCompatParcelizer(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", read(this.RemoteActionCompatParcelizer, str, objArr));
        }
        return 0;
    }

    public final int RemoteActionCompatParcelizer(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", read(this.RemoteActionCompatParcelizer, str, objArr));
        }
        return 0;
    }

    public final int RemoteActionCompatParcelizer(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", read(this.RemoteActionCompatParcelizer, str, objArr), th);
        }
        return 0;
    }

    public final int read(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", read(this.RemoteActionCompatParcelizer, str, objArr));
        }
        return 0;
    }

    public final int write(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", read(this.RemoteActionCompatParcelizer, str, objArr));
        }
        return 0;
    }
}
