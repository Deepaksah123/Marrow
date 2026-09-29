package kotlin;

import java.io.File;
import java.util.List;
import kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0;
import kotlin.fromUri;
import kotlin.setDrmLicenseRequestHeaders;

/* JADX INFO: loaded from: classes2.dex */
final class setMediaId implements setDrmLicenseRequestHeaders, fromUri.AudioAttributesCompatParcelizer<Object> {
    private final setDrmForceDefaultLicenseUri<?> AudioAttributesCompatParcelizer;
    private onVolumeChanged AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer = -1;
    private int AudioAttributesImplBaseParcelizer;
    private final setDrmLicenseRequestHeaders.RemoteActionCompatParcelizer IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private List<MediaItemLocalConfigurationExternalSyntheticLambda0<File, ?>> MediaBrowserCompatItemReceiver;
    private File RemoteActionCompatParcelizer;
    private volatile MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<?> read;
    private MediaItemClippingConfigurationExternalSyntheticLambda0 write;

    setMediaId(setDrmForceDefaultLicenseUri<?> setdrmforcedefaultlicenseuri, setDrmLicenseRequestHeaders.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.AudioAttributesCompatParcelizer = setdrmforcedefaultlicenseuri;
        this.IconCompatParcelizer = remoteActionCompatParcelizer;
    }

    @Override // kotlin.setDrmLicenseRequestHeaders
    public final boolean RemoteActionCompatParcelizer() {
        List<onVolumeChanged> listAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        boolean z = false;
        if (listAudioAttributesCompatParcelizer.isEmpty()) {
            return false;
        }
        List<Class<?>> listMediaBrowserCompatSearchResultReceiver = this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver();
        if (listMediaBrowserCompatSearchResultReceiver.isEmpty()) {
            if (File.class.equals(this.AudioAttributesCompatParcelizer.MediaDescriptionCompat())) {
                return false;
            }
            StringBuilder sb = new StringBuilder("Failed to find any load path from ");
            sb.append(this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver());
            sb.append(" to ");
            sb.append(this.AudioAttributesCompatParcelizer.MediaDescriptionCompat());
            throw new IllegalStateException(sb.toString());
        }
        while (true) {
            if (this.MediaBrowserCompatItemReceiver == null || !read()) {
                int i = this.AudioAttributesImplApi26Parcelizer + 1;
                this.AudioAttributesImplApi26Parcelizer = i;
                if (i >= listMediaBrowserCompatSearchResultReceiver.size()) {
                    int i2 = this.AudioAttributesImplBaseParcelizer + 1;
                    this.AudioAttributesImplBaseParcelizer = i2;
                    if (i2 >= listAudioAttributesCompatParcelizer.size()) {
                        return false;
                    }
                    this.AudioAttributesImplApi26Parcelizer = 0;
                }
                onVolumeChanged onvolumechanged = listAudioAttributesCompatParcelizer.get(this.AudioAttributesImplBaseParcelizer);
                Class<?> cls = listMediaBrowserCompatSearchResultReceiver.get(this.AudioAttributesImplApi26Parcelizer);
                this.write = new MediaItemClippingConfigurationExternalSyntheticLambda0(this.AudioAttributesCompatParcelizer.IconCompatParcelizer(), onvolumechanged, this.AudioAttributesCompatParcelizer.MediaMetadataCompat(), this.AudioAttributesCompatParcelizer.RatingCompat(), this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(), this.AudioAttributesCompatParcelizer.read(cls), cls, this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer());
                File fileRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.write().RemoteActionCompatParcelizer(this.write);
                this.RemoteActionCompatParcelizer = fileRemoteActionCompatParcelizer;
                if (fileRemoteActionCompatParcelizer != null) {
                    this.AudioAttributesImplApi21Parcelizer = onvolumechanged;
                    this.MediaBrowserCompatItemReceiver = this.AudioAttributesCompatParcelizer.read(fileRemoteActionCompatParcelizer);
                    this.MediaBrowserCompatCustomActionResultReceiver = 0;
                }
            } else {
                this.read = null;
                while (!z && read()) {
                    List<MediaItemLocalConfigurationExternalSyntheticLambda0<File, ?>> list = this.MediaBrowserCompatItemReceiver;
                    int i3 = this.MediaBrowserCompatCustomActionResultReceiver;
                    this.MediaBrowserCompatCustomActionResultReceiver = i3 + 1;
                    this.read = list.get(i3).write(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer.RatingCompat(), this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(), this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer());
                    if (this.read != null && this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.read.RemoteActionCompatParcelizer.write())) {
                        this.read.RemoteActionCompatParcelizer.write(this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(), this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    private boolean read() {
        return this.MediaBrowserCompatCustomActionResultReceiver < this.MediaBrowserCompatItemReceiver.size();
    }

    @Override // kotlin.setDrmLicenseRequestHeaders
    public final void IconCompatParcelizer() {
        MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<?> remoteActionCompatParcelizer = this.read;
        if (remoteActionCompatParcelizer != null) {
            remoteActionCompatParcelizer.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        }
    }

    @Override // o.fromUri.AudioAttributesCompatParcelizer
    public final void write(Object obj) {
        this.IconCompatParcelizer.read(this.AudioAttributesImplApi21Parcelizer, obj, this.read.RemoteActionCompatParcelizer, onTracksChanged.RESOURCE_DISK_CACHE, this.write);
    }

    @Override // o.fromUri.AudioAttributesCompatParcelizer
    public final void IconCompatParcelizer(Exception exc) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(this.write, exc, this.read.RemoteActionCompatParcelizer, onTracksChanged.RESOURCE_DISK_CACHE);
    }
}
