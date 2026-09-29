package kotlin;

import android.media.MediaRouter;

/* JADX INFO: loaded from: classes4.dex */
final class ExtensionsKtjacksonObjectMapper1 {
    public static Object read(Object obj) {
        return ((MediaRouter) obj).getDefaultRoute();
    }

    public static void AudioAttributesCompatParcelizer(Object obj, int i, Object obj2, int i2) {
        ((MediaRouter) obj).addCallback(i, (MediaRouter.Callback) obj2, i2);
    }

    public static final class AudioAttributesCompatParcelizer {
        public static CharSequence IconCompatParcelizer(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getDescription();
        }

        public static boolean write(Object obj) {
            return ((MediaRouter.RouteInfo) obj).isConnecting();
        }
    }

    public static final class IconCompatParcelizer {
        public static void write(Object obj, CharSequence charSequence) {
            ((MediaRouter.UserRouteInfo) obj).setDescription(charSequence);
        }
    }
}
