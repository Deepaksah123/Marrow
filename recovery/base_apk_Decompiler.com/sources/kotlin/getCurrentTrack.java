package kotlin;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class getCurrentTrack {
    private final String IconCompatParcelizer;

    public getCurrentTrack(String str) {
        int iMyUid = Process.myUid();
        int iMyPid = Process.myPid();
        StringBuilder sb = new StringBuilder("UID: [");
        sb.append(iMyUid);
        sb.append("]  PID: [");
        sb.append(iMyPid);
        sb.append("] ");
        this.IconCompatParcelizer = sb.toString().concat(str);
    }

    private static String AudioAttributesCompatParcelizer(String str, String str2, Object... objArr) {
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

    public final int AudioAttributesCompatParcelizer(Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", AudioAttributesCompatParcelizer(this.IconCompatParcelizer, "Already connected to the service.", objArr));
        }
        return 0;
    }

    public final int RemoteActionCompatParcelizer(Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", AudioAttributesCompatParcelizer(this.IconCompatParcelizer, "Play Store app is either not installed or not the official version", objArr));
        }
        return 0;
    }

    public final int read(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", AudioAttributesCompatParcelizer(this.IconCompatParcelizer, str, objArr));
        }
        return 0;
    }

    public final int read(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", AudioAttributesCompatParcelizer(this.IconCompatParcelizer, str, objArr), th);
        }
        return 0;
    }

    public final int write(Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", AudioAttributesCompatParcelizer(this.IconCompatParcelizer, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
        }
        return 0;
    }
}
