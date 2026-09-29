package kotlin;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.media.MediaRouter;
import android.os.Handler;
import android.view.Display;
import com.google.android.exoplayer2.C;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.toBitSet;

/* JADX INFO: loaded from: classes4.dex */
final class KotlinAnnotationIntrospector {

    public interface IconCompatParcelizer extends toBitSet.write {
        void read(Object obj);
    }

    public static Object IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        return new read(iconCompatParcelizer);
    }

    public static final class RemoteActionCompatParcelizer {
        public static boolean write(Object obj) {
            return ((MediaRouter.RouteInfo) obj).isEnabled();
        }

        public static Display RemoteActionCompatParcelizer(Object obj) {
            try {
                return ((MediaRouter.RouteInfo) obj).getPresentationDisplay();
            } catch (NoSuchMethodError unused) {
                return null;
            }
        }
    }

    public static final class AudioAttributesCompatParcelizer implements Runnable {
        private final Handler AudioAttributesCompatParcelizer;
        private Method IconCompatParcelizer;
        private final DisplayManager read;
        private boolean write;

        public AudioAttributesCompatParcelizer(Context context, Handler handler) {
            throw new UnsupportedOperationException();
        }

        public final void AudioAttributesCompatParcelizer(int i) {
            if ((i & 2) != 0) {
                if (this.write || this.IconCompatParcelizer == null) {
                    return;
                }
                this.write = true;
                this.AudioAttributesCompatParcelizer.post(this);
                return;
            }
            if (this.write) {
                this.write = false;
                this.AudioAttributesCompatParcelizer.removeCallbacks(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.write) {
                try {
                    this.IconCompatParcelizer.invoke(this.read, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
                this.AudioAttributesCompatParcelizer.postDelayed(this, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
            }
        }
    }

    public static final class write {
        private int IconCompatParcelizer;
        private Method read;

        public write() {
            throw new UnsupportedOperationException();
        }

        public final boolean IconCompatParcelizer(Object obj) {
            MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) obj;
            Method method = this.read;
            if (method != null) {
                try {
                    if (((Integer) method.invoke(routeInfo, new Object[0])).intValue() == this.IconCompatParcelizer) {
                        return true;
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return false;
        }
    }

    static class read<T extends IconCompatParcelizer> extends toBitSet.IconCompatParcelizer<T> {
        public read(T t) {
            super(t);
        }

        @Override // android.media.MediaRouter.Callback
        public void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            ((IconCompatParcelizer) this.write).read(routeInfo);
        }
    }
}
