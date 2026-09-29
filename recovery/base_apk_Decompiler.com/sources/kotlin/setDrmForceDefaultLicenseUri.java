package kotlin;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0;
import kotlin.moveToLast;
import kotlin.setDrmConfiguration;
import kotlin.setSelectionFlags;

/* JADX INFO: loaded from: classes2.dex */
final class setDrmForceDefaultLicenseUri<Transcode> {
    private int AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private setRotationDegrees IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private onVolumeChanged MediaBrowserCompatMediaItem;
    private Class<?> MediaBrowserCompatSearchResultReceiver;
    private Class<Transcode> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private r8lambda_r106e6zya8q8i_eKUnQWRolPk MediaDescriptionCompat;
    private setSampleRate MediaMetadataCompat;
    private Object RatingCompat;
    private setDrmSessionForClearTypes RemoteActionCompatParcelizer;
    private Map<Class<?>, MediaItem<?>> handleMediaPlayPauseIfPendingOnHandler;
    private int onCustomAction;
    private setDrmConfiguration.AudioAttributesCompatParcelizer write;
    private final List<MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<?>> AudioAttributesImplBaseParcelizer = new ArrayList();
    private final List<onVolumeChanged> read = new ArrayList();

    setDrmForceDefaultLicenseUri() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    final <R> void AudioAttributesCompatParcelizer(setRotationDegrees setrotationdegrees, Object obj, onVolumeChanged onvolumechanged, int i, int i2, setDrmSessionForClearTypes setdrmsessionforcleartypes, Class<?> cls, Class<R> cls2, setSampleRate setsamplerate, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk, Map<Class<?>, MediaItem<?>> map, boolean z, boolean z2, setDrmConfiguration.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.IconCompatParcelizer = setrotationdegrees;
        this.RatingCompat = obj;
        this.MediaBrowserCompatMediaItem = onvolumechanged;
        this.onCustomAction = i;
        this.AudioAttributesCompatParcelizer = i2;
        this.RemoteActionCompatParcelizer = setdrmsessionforcleartypes;
        this.MediaBrowserCompatSearchResultReceiver = cls;
        this.write = audioAttributesCompatParcelizer;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = cls2;
        this.MediaMetadataCompat = setsamplerate;
        this.MediaDescriptionCompat = r8lambda_r106e6zya8q8i_ekunqwrolpk;
        this.handleMediaPlayPauseIfPendingOnHandler = map;
        this.MediaBrowserCompatItemReceiver = z;
        this.AudioAttributesImplApi21Parcelizer = z2;
    }

    final void RemoteActionCompatParcelizer() {
        this.IconCompatParcelizer = null;
        this.RatingCompat = null;
        this.MediaBrowserCompatMediaItem = null;
        this.MediaBrowserCompatSearchResultReceiver = null;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = null;
        this.MediaDescriptionCompat = null;
        this.MediaMetadataCompat = null;
        this.handleMediaPlayPauseIfPendingOnHandler = null;
        this.RemoteActionCompatParcelizer = null;
        this.AudioAttributesImplBaseParcelizer.clear();
        this.AudioAttributesImplApi26Parcelizer = false;
        this.read.clear();
        this.MediaBrowserCompatCustomActionResultReceiver = false;
    }

    final MediaItemClippingProperties write() {
        return this.write.AudioAttributesCompatParcelizer();
    }

    final setDrmSessionForClearTypes read() {
        return this.RemoteActionCompatParcelizer;
    }

    final <T> r8lambdaS__QVsutFC117zAPgt_KKJAKcRY<T> write(T t) {
        return this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer().write(t);
    }

    final setSampleRate AudioAttributesImplBaseParcelizer() {
        return this.MediaMetadataCompat;
    }

    final r8lambda_r106e6zya8q8i_eKUnQWRolPk AudioAttributesImplApi21Parcelizer() {
        return this.MediaDescriptionCompat;
    }

    final onVolumeChanged MediaMetadataCompat() {
        return this.MediaBrowserCompatMediaItem;
    }

    final int RatingCompat() {
        return this.onCustomAction;
    }

    final int AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    final setSubtitleConfigurations IconCompatParcelizer() {
        Object[] objArr = {this.IconCompatParcelizer};
        int iIconCompatParcelizer = moveToLast.AnonymousClass7.IconCompatParcelizer();
        return (setSubtitleConfigurations) setRotationDegrees.IconCompatParcelizer(moveToLast.AnonymousClass7.IconCompatParcelizer(), objArr, -1599502422, moveToLast.AnonymousClass7.IconCompatParcelizer(), iIconCompatParcelizer, moveToLast.AnonymousClass7.IconCompatParcelizer(), 1599502423);
    }

    final Class<?> MediaDescriptionCompat() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    final Class<?> MediaBrowserCompatItemReceiver() {
        return this.RatingCompat.getClass();
    }

    final List<Class<?>> MediaBrowserCompatSearchResultReceiver() {
        return this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer().AudioAttributesCompatParcelizer(this.RatingCompat.getClass(), this.MediaBrowserCompatSearchResultReceiver, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean RemoteActionCompatParcelizer(Class<?> cls) {
        return AudioAttributesCompatParcelizer((Class) cls) != null;
    }

    final <Data> setRequestMetadata<Data, ?, Transcode> AudioAttributesCompatParcelizer(Class<Data> cls) {
        return this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer().read(cls, this.MediaBrowserCompatSearchResultReceiver, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    final boolean MediaBrowserCompatMediaItem() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    final <Z> MediaItem<Z> read(Class<Z> cls) {
        MediaItem<Z> mediaItem = (MediaItem) this.handleMediaPlayPauseIfPendingOnHandler.get(cls);
        if (mediaItem == null) {
            Iterator<Map.Entry<Class<?>, MediaItem<?>>> it = this.handleMediaPlayPauseIfPendingOnHandler.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, MediaItem<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    mediaItem = (MediaItem) next.getValue();
                    break;
                }
            }
        }
        if (mediaItem != null) {
            return mediaItem;
        }
        if (this.handleMediaPlayPauseIfPendingOnHandler.isEmpty() && this.MediaBrowserCompatItemReceiver) {
            StringBuilder sb = new StringBuilder("Missing transformation for ");
            sb.append(cls);
            sb.append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
            throw new IllegalArgumentException(sb.toString());
        }
        return access3300.write();
    }

    final boolean IconCompatParcelizer(setMimeType<?> setmimetype) {
        return this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer().AudioAttributesCompatParcelizer(setmimetype);
    }

    final <Z> LoadControl<Z> write(setMimeType<Z> setmimetype) {
        return this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer().IconCompatParcelizer((setMimeType) setmimetype);
    }

    final List<MediaItemLocalConfigurationExternalSyntheticLambda0<File, ?>> read(File file) throws setSelectionFlags.RemoteActionCompatParcelizer {
        return this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer().IconCompatParcelizer(file);
    }

    final boolean IconCompatParcelizer(onVolumeChanged onvolumechanged) {
        List<MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<?>> listMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        int size = listMediaBrowserCompatCustomActionResultReceiver.size();
        for (int i = 0; i < size; i++) {
            if (listMediaBrowserCompatCustomActionResultReceiver.get(i).read.equals(onvolumechanged)) {
                return true;
            }
        }
        return false;
    }

    final List<MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<?>> MediaBrowserCompatCustomActionResultReceiver() {
        if (!this.AudioAttributesImplApi26Parcelizer) {
            this.AudioAttributesImplApi26Parcelizer = true;
            this.AudioAttributesImplBaseParcelizer.clear();
            List listIconCompatParcelizer = this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer().IconCompatParcelizer(this.RatingCompat);
            int size = listIconCompatParcelizer.size();
            for (int i = 0; i < size; i++) {
                MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<?> remoteActionCompatParcelizerWrite = ((MediaItemLocalConfigurationExternalSyntheticLambda0) listIconCompatParcelizer.get(i)).write(this.RatingCompat, this.onCustomAction, this.AudioAttributesCompatParcelizer, this.MediaDescriptionCompat);
                if (remoteActionCompatParcelizerWrite != null) {
                    this.AudioAttributesImplBaseParcelizer.add(remoteActionCompatParcelizerWrite);
                }
            }
        }
        return this.AudioAttributesImplBaseParcelizer;
    }

    final List<onVolumeChanged> AudioAttributesCompatParcelizer() {
        if (!this.MediaBrowserCompatCustomActionResultReceiver) {
            this.MediaBrowserCompatCustomActionResultReceiver = true;
            this.read.clear();
            List<MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<?>> listMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
            int size = listMediaBrowserCompatCustomActionResultReceiver.size();
            for (int i = 0; i < size; i++) {
                MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<?> remoteActionCompatParcelizer = listMediaBrowserCompatCustomActionResultReceiver.get(i);
                if (!this.read.contains(remoteActionCompatParcelizer.read)) {
                    this.read.add(remoteActionCompatParcelizer.read);
                }
                for (int i2 = 0; i2 < remoteActionCompatParcelizer.AudioAttributesCompatParcelizer.size(); i2++) {
                    if (!this.read.contains(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer.get(i2))) {
                        this.read.add(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer.get(i2));
                    }
                }
            }
        }
        return this.read;
    }

    final <X> onShuffleModeEnabledChanged<X> AudioAttributesCompatParcelizer(X x) throws setSelectionFlags.read {
        return this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer().RemoteActionCompatParcelizer(x);
    }
}
