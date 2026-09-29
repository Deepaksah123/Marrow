package kotlin;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
final class MediaItemBuilder {
    MediaItemBuilder() {
    }

    public static boolean AudioAttributesCompatParcelizer(File file) {
        return file.exists();
    }

    public static long IconCompatParcelizer(File file) {
        return file.length();
    }

    public static File write(String str) {
        return new File(str);
    }
}
