package kotlin;

import java.io.File;
import java.util.List;
import kotlin.MediaItemLocalConfigurationExternalSyntheticLambda0;
import kotlin.fromUri;
import kotlin.setDrmLicenseRequestHeaders;

/* JADX INFO: loaded from: classes2.dex */
final class setClipStartPositionMs implements setDrmLicenseRequestHeaders, fromUri.AudioAttributesCompatParcelizer<Object> {
    private File AudioAttributesCompatParcelizer;
    private List<MediaItemLocalConfigurationExternalSyntheticLambda0<File, ?>> AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private onVolumeChanged AudioAttributesImplBaseParcelizer;
    private final setDrmLicenseRequestHeaders.RemoteActionCompatParcelizer IconCompatParcelizer;
    private int MediaBrowserCompatItemReceiver;
    private final setDrmForceDefaultLicenseUri<?> RemoteActionCompatParcelizer;
    private volatile MediaItemLocalConfigurationExternalSyntheticLambda0.RemoteActionCompatParcelizer<?> read;
    private final List<onVolumeChanged> write;

    setClipStartPositionMs(setDrmForceDefaultLicenseUri<?> setdrmforcedefaultlicenseuri, setDrmLicenseRequestHeaders.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this(setdrmforcedefaultlicenseuri.AudioAttributesCompatParcelizer(), setdrmforcedefaultlicenseuri, remoteActionCompatParcelizer);
    }

    setClipStartPositionMs(List<onVolumeChanged> list, setDrmForceDefaultLicenseUri<?> setdrmforcedefaultlicenseuri, setDrmLicenseRequestHeaders.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.AudioAttributesImplApi26Parcelizer = -1;
        this.write = list;
        this.RemoteActionCompatParcelizer = setdrmforcedefaultlicenseuri;
        this.IconCompatParcelizer = remoteActionCompatParcelizer;
    }

    @Override // kotlin.setDrmLicenseRequestHeaders
    public final boolean RemoteActionCompatParcelizer() {
        while (true) {
            boolean z = false;
            if (this.AudioAttributesImplApi21Parcelizer == null || !write()) {
                int i = this.AudioAttributesImplApi26Parcelizer + 1;
                this.AudioAttributesImplApi26Parcelizer = i;
                if (i >= this.write.size()) {
                    return false;
                }
                onVolumeChanged onvolumechanged = this.write.get(this.AudioAttributesImplApi26Parcelizer);
                File fileRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.write().RemoteActionCompatParcelizer(new setDrmKeySetId(onvolumechanged, this.RemoteActionCompatParcelizer.MediaMetadataCompat()));
                this.AudioAttributesCompatParcelizer = fileRemoteActionCompatParcelizer;
                if (fileRemoteActionCompatParcelizer != null) {
                    this.AudioAttributesImplBaseParcelizer = onvolumechanged;
                    this.AudioAttributesImplApi21Parcelizer = this.RemoteActionCompatParcelizer.read(fileRemoteActionCompatParcelizer);
                    this.MediaBrowserCompatItemReceiver = 0;
                }
            } else {
                this.read = null;
                while (!z && write()) {
                    List<MediaItemLocalConfigurationExternalSyntheticLambda0<File, ?>> list = this.AudioAttributesImplApi21Parcelizer;
                    int i2 = this.MediaBrowserCompatItemReceiver;
                    this.MediaBrowserCompatItemReceiver = i2 + 1;
                    this.read = list.get(i2).write(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer.RatingCompat(), this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(), this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer());
                    if (this.read != null && this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.read.RemoteActionCompatParcelizer.write())) {
                        this.read.RemoteActionCompatParcelizer.write(this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer(), this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    private boolean write() {
        return this.MediaBrowserCompatItemReceiver < this.AudioAttributesImplApi21Parcelizer.size();
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
        this.IconCompatParcelizer.read(this.AudioAttributesImplBaseParcelizer, obj, this.read.RemoteActionCompatParcelizer, onTracksChanged.DATA_DISK_CACHE, this.AudioAttributesImplBaseParcelizer);
    }

    @Override // o.fromUri.AudioAttributesCompatParcelizer
    public final void IconCompatParcelizer(Exception exc) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, exc, this.read.RemoteActionCompatParcelizer, onTracksChanged.DATA_DISK_CACHE);
    }
}
