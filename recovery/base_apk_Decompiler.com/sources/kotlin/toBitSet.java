package kotlin;

import android.content.Context;
import android.media.MediaRouter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class toBitSet {

    public interface MediaBrowserCompatItemReceiver {
        void AudioAttributesCompatParcelizer(Object obj, int i);

        void IconCompatParcelizer(Object obj, int i);
    }

    public interface write {
        void AudioAttributesCompatParcelizer(Object obj);

        void AudioAttributesCompatParcelizer(Object obj, Object obj2, int i);

        void IconCompatParcelizer(int i, Object obj);

        void IconCompatParcelizer(Object obj);

        void RemoteActionCompatParcelizer(Object obj);

        void read(int i, Object obj);

        void read(Object obj, Object obj2);

        void write(Object obj);
    }

    public static Object AudioAttributesCompatParcelizer(Context context) {
        return context.getSystemService("media_router");
    }

    public static List read(Object obj) {
        MediaRouter mediaRouter = (MediaRouter) obj;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        return arrayList;
    }

    public static Object IconCompatParcelizer(Object obj, int i) {
        return ((MediaRouter) obj).getSelectedRoute(i);
    }

    public static void read(Object obj, int i, Object obj2) {
        ((MediaRouter) obj).selectRoute(i, (MediaRouter.RouteInfo) obj2);
    }

    public static void IconCompatParcelizer(Object obj, int i, Object obj2) {
        ((MediaRouter) obj).addCallback(i, (MediaRouter.Callback) obj2);
    }

    public static void write(Object obj, Object obj2) {
        ((MediaRouter) obj).removeCallback((MediaRouter.Callback) obj2);
    }

    public static Object AudioAttributesCompatParcelizer(Object obj, String str, boolean z) {
        return ((MediaRouter) obj).createRouteCategory(str, z);
    }

    public static Object RemoteActionCompatParcelizer(Object obj, Object obj2) {
        return ((MediaRouter) obj).createUserRoute((MediaRouter.RouteCategory) obj2);
    }

    public static void IconCompatParcelizer(Object obj, Object obj2) {
        ((MediaRouter) obj).addUserRoute((MediaRouter.UserRouteInfo) obj2);
    }

    public static void read(Object obj, Object obj2) {
        ((MediaRouter) obj).removeUserRoute((MediaRouter.UserRouteInfo) obj2);
    }

    public static Object AudioAttributesCompatParcelizer(write writeVar) {
        return new IconCompatParcelizer(writeVar);
    }

    public static Object AudioAttributesCompatParcelizer(MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
        return new AudioAttributesImplApi21Parcelizer(mediaBrowserCompatItemReceiver);
    }

    public static final class AudioAttributesCompatParcelizer {
        public static CharSequence AudioAttributesCompatParcelizer(Object obj, Context context) {
            return ((MediaRouter.RouteInfo) obj).getName(context);
        }

        public static int write(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getSupportedTypes();
        }

        public static int RemoteActionCompatParcelizer(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getPlaybackType();
        }

        public static int read(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getPlaybackStream();
        }

        public static int AudioAttributesCompatParcelizer(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getVolume();
        }

        public static int AudioAttributesImplApi26Parcelizer(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getVolumeMax();
        }

        public static int AudioAttributesImplApi21Parcelizer(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getVolumeHandling();
        }

        public static Object IconCompatParcelizer(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getTag();
        }

        public static void AudioAttributesCompatParcelizer(Object obj, Object obj2) {
            ((MediaRouter.RouteInfo) obj).setTag(obj2);
        }

        public static void RemoteActionCompatParcelizer(Object obj, int i) {
            ((MediaRouter.RouteInfo) obj).requestSetVolume(i);
        }

        public static void AudioAttributesCompatParcelizer(Object obj, int i) {
            ((MediaRouter.RouteInfo) obj).requestUpdateVolume(i);
        }
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver {
        public static void IconCompatParcelizer(Object obj, CharSequence charSequence) {
            ((MediaRouter.UserRouteInfo) obj).setName(charSequence);
        }

        public static void AudioAttributesCompatParcelizer(Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setPlaybackType(i);
        }

        public static void IconCompatParcelizer(Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setPlaybackStream(i);
        }

        public static void read(Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setVolume(i);
        }

        public static void write(Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setVolumeMax(i);
        }

        public static void RemoteActionCompatParcelizer(Object obj, int i) {
            ((MediaRouter.UserRouteInfo) obj).setVolumeHandling(i);
        }

        public static void AudioAttributesCompatParcelizer(Object obj, Object obj2) {
            ((MediaRouter.UserRouteInfo) obj).setVolumeCallback((MediaRouter.VolumeCallback) obj2);
        }
    }

    public static final class read {
        private Method RemoteActionCompatParcelizer;

        public read() {
            throw new UnsupportedOperationException();
        }

        public final void IconCompatParcelizer(Object obj, int i, Object obj2) {
            Method method;
            MediaRouter mediaRouter = (MediaRouter) obj;
            MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) obj2;
            if ((routeInfo.getSupportedTypes() & 8388608) == 0 && (method = this.RemoteActionCompatParcelizer) != null) {
                try {
                    method.invoke(mediaRouter, Integer.valueOf(i), routeInfo);
                    return;
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            mediaRouter.selectRoute(i, routeInfo);
        }
    }

    public static final class RemoteActionCompatParcelizer {
        private Method IconCompatParcelizer;

        public RemoteActionCompatParcelizer() {
            throw new UnsupportedOperationException();
        }

        public final Object write(Object obj) {
            MediaRouter mediaRouter = (MediaRouter) obj;
            Method method = this.IconCompatParcelizer;
            if (method != null) {
                try {
                    return method.invoke(mediaRouter, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return mediaRouter.getRouteAt(0);
        }
    }

    static class IconCompatParcelizer<T extends write> extends MediaRouter.Callback {
        protected final T write;

        public IconCompatParcelizer(T t) {
            this.write = t;
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
            this.write.IconCompatParcelizer(i, routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
            this.write.read(i, routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.write.AudioAttributesCompatParcelizer(routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.write.write(routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.write.RemoteActionCompatParcelizer(routeInfo);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
            this.write.AudioAttributesCompatParcelizer(routeInfo, routeGroup, i);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
            this.write.read(routeInfo, routeGroup);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            this.write.IconCompatParcelizer(routeInfo);
        }
    }

    static class AudioAttributesImplApi21Parcelizer<T extends MediaBrowserCompatItemReceiver> extends MediaRouter.VolumeCallback {
        protected final T AudioAttributesCompatParcelizer;

        public AudioAttributesImplApi21Parcelizer(T t) {
            this.AudioAttributesCompatParcelizer = t;
        }

        @Override // android.media.MediaRouter.VolumeCallback
        public void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(routeInfo, i);
        }

        @Override // android.media.MediaRouter.VolumeCallback
        public void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(routeInfo, i);
        }
    }
}
