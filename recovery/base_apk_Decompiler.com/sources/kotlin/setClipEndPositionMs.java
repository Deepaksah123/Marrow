package kotlin;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class setClipEndPositionMs {
    public static boolean IconCompatParcelizer(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    public static boolean IconCompatParcelizer(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean AudioAttributesCompatParcelizer(Uri uri) {
        return IconCompatParcelizer(uri) && uri.getPathSegments().contains("picker");
    }

    private static boolean read(Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    public static boolean RemoteActionCompatParcelizer(Uri uri) {
        return IconCompatParcelizer(uri) && read(uri);
    }

    public static boolean write(Uri uri) {
        return IconCompatParcelizer(uri) && !read(uri);
    }
}
