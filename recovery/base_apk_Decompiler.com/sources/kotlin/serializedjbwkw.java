package kotlin;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class serializedjbwkw {
    public static int AudioAttributesCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, UIntDeserializer uIntDeserializer, View view, View view2, RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver, boolean z, boolean z2) {
        int iMax;
        if (mediaBrowserCompatItemReceiver.onPlay() == 0 || mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMin = Math.min(RecyclerView.MediaBrowserCompatItemReceiver.MediaDescriptionCompat(view), RecyclerView.MediaBrowserCompatItemReceiver.MediaDescriptionCompat(view2));
        int iMax2 = Math.max(RecyclerView.MediaBrowserCompatItemReceiver.MediaDescriptionCompat(view), RecyclerView.MediaBrowserCompatItemReceiver.MediaDescriptionCompat(view2));
        if (z2) {
            iMax = Math.max(0, (mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read() - iMax2) - 1);
        } else {
            iMax = Math.max(0, iMin);
        }
        if (!z) {
            return iMax;
        }
        return Math.round((iMax * (Math.abs(uIntDeserializer.IconCompatParcelizer(view2) - uIntDeserializer.AudioAttributesCompatParcelizer(view)) / (Math.abs(RecyclerView.MediaBrowserCompatItemReceiver.MediaDescriptionCompat(view) - RecyclerView.MediaBrowserCompatItemReceiver.MediaDescriptionCompat(view2)) + 1))) + (uIntDeserializer.AudioAttributesImplApi21Parcelizer() - uIntDeserializer.AudioAttributesCompatParcelizer(view)));
    }

    public static int write(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, UIntDeserializer uIntDeserializer, View view, View view2, RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver, boolean z) {
        if (mediaBrowserCompatItemReceiver.onPlay() == 0 || mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(RecyclerView.MediaBrowserCompatItemReceiver.MediaDescriptionCompat(view) - RecyclerView.MediaBrowserCompatItemReceiver.MediaDescriptionCompat(view2)) + 1;
        }
        return Math.min(uIntDeserializer.MediaBrowserCompatItemReceiver(), uIntDeserializer.IconCompatParcelizer(view2) - uIntDeserializer.AudioAttributesCompatParcelizer(view));
    }

    public static int RemoteActionCompatParcelizer(RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, UIntDeserializer uIntDeserializer, View view, View view2, RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver, boolean z) {
        if (mediaBrowserCompatItemReceiver.onPlay() == 0 || mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read();
        }
        return (int) (((uIntDeserializer.IconCompatParcelizer(view2) - uIntDeserializer.AudioAttributesCompatParcelizer(view)) / (Math.abs(RecyclerView.MediaBrowserCompatItemReceiver.MediaDescriptionCompat(view) - RecyclerView.MediaBrowserCompatItemReceiver.MediaDescriptionCompat(view2)) + 1)) * mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read());
    }
}
