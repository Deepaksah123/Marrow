package kotlin;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class isProgressive {
    public static DateFormat RemoteActionCompatParcelizer() {
        StringBuilder sb = new StringBuilder();
        sb.append(read(2));
        sb.append(" ");
        sb.append(RemoteActionCompatParcelizer(2));
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }

    private static String read(int i) {
        return "MMM d, yyyy";
    }

    private static String RemoteActionCompatParcelizer(int i) {
        return "h:mm:ss a";
    }
}
