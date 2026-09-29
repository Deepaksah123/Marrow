package kotlin;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class baseTypeName {
    private static final Pattern RemoteActionCompatParcelizer = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern IconCompatParcelizer = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static String IconCompatParcelizer(long j, long j2) {
        if (j == 0 && j2 == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder("bytes=");
        sb.append(j);
        sb.append("-");
        if (j2 != -1) {
            sb.append((j + j2) - 1);
        }
        return sb.toString();
    }

    public static long RemoteActionCompatParcelizer(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = IconCompatParcelizer.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) buildTypeSerializer.IconCompatParcelizer(matcher.group(1)));
        }
        return -1L;
    }

    public static long read(String str, String str2) {
        long j;
        if (TextUtils.isEmpty(str)) {
            j = -1;
        } else {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder("Unexpected Content-Length [");
                sb.append(str);
                sb.append("]");
                prune.AudioAttributesCompatParcelizer("HttpUtil", sb.toString());
                j = -1;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j;
        }
        Matcher matcher = RemoteActionCompatParcelizer.matcher(str2);
        if (!matcher.matches()) {
            return j;
        }
        try {
            long j2 = (Long.parseLong((String) buildTypeSerializer.IconCompatParcelizer(matcher.group(2))) - Long.parseLong((String) buildTypeSerializer.IconCompatParcelizer(matcher.group(1)))) + 1;
            if (j < 0) {
                return j2;
            }
            if (j == j2) {
                return j;
            }
            StringBuilder sb2 = new StringBuilder("Inconsistent headers [");
            sb2.append(str);
            sb2.append("] [");
            sb2.append(str2);
            sb2.append("]");
            prune.RemoteActionCompatParcelizer("HttpUtil", sb2.toString());
            return Math.max(j, j2);
        } catch (NumberFormatException unused2) {
            StringBuilder sb3 = new StringBuilder("Unexpected Content-Range [");
            sb3.append(str2);
            sb3.append("]");
            prune.AudioAttributesCompatParcelizer("HttpUtil", sb3.toString());
            return j;
        }
    }
}
