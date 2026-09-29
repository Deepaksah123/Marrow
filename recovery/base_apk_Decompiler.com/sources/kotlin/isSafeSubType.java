package kotlin;

import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class isSafeSubType {
    private static final HashSet<String> IconCompatParcelizer = new HashSet<>();
    private static String write = "media3.common";

    private isSafeSubType() {
    }

    public static String write() {
        String str;
        synchronized (isSafeSubType.class) {
            str = write;
        }
        return str;
    }

    public static void AudioAttributesCompatParcelizer(String str) {
        synchronized (isSafeSubType.class) {
            if (IconCompatParcelizer.add(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append(write);
                sb.append(", ");
                sb.append(str);
                write = sb.toString();
            }
        }
    }
}
