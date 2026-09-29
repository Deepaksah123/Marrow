package kotlin;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
final class MediaItemClippingConfigurationExternalSyntheticLambda0 implements onVolumeChanged {
    private static final prepareChildSource<Class<?>, byte[]> AudioAttributesCompatParcelizer = new prepareChildSource<>(50);
    private final int AudioAttributesImplApi21Parcelizer;
    private final r8lambda_r106e6zya8q8i_eKUnQWRolPk AudioAttributesImplApi26Parcelizer;
    private final MediaItem<?> AudioAttributesImplBaseParcelizer;
    private final Class<?> IconCompatParcelizer;
    private final onVolumeChanged MediaBrowserCompatCustomActionResultReceiver;
    private final onVolumeChanged MediaBrowserCompatItemReceiver;
    private final setSubtitleConfigurations RemoteActionCompatParcelizer;
    private final int write;

    MediaItemClippingConfigurationExternalSyntheticLambda0(setSubtitleConfigurations setsubtitleconfigurations, onVolumeChanged onvolumechanged, onVolumeChanged onvolumechanged2, int i, int i2, MediaItem<?> mediaItem, Class<?> cls, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        this.RemoteActionCompatParcelizer = setsubtitleconfigurations;
        this.MediaBrowserCompatItemReceiver = onvolumechanged;
        this.MediaBrowserCompatCustomActionResultReceiver = onvolumechanged2;
        this.AudioAttributesImplApi21Parcelizer = i;
        this.write = i2;
        this.AudioAttributesImplBaseParcelizer = mediaItem;
        this.IconCompatParcelizer = cls;
        this.AudioAttributesImplApi26Parcelizer = r8lambda_r106e6zya8q8i_ekunqwrolpk;
    }

    @Override // kotlin.onVolumeChanged
    public final boolean equals(Object obj) {
        if (!(obj instanceof MediaItemClippingConfigurationExternalSyntheticLambda0)) {
            return false;
        }
        MediaItemClippingConfigurationExternalSyntheticLambda0 mediaItemClippingConfigurationExternalSyntheticLambda0 = (MediaItemClippingConfigurationExternalSyntheticLambda0) obj;
        return this.write == mediaItemClippingConfigurationExternalSyntheticLambda0.write && this.AudioAttributesImplApi21Parcelizer == mediaItemClippingConfigurationExternalSyntheticLambda0.AudioAttributesImplApi21Parcelizer && moveMediaSourceRange.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer, mediaItemClippingConfigurationExternalSyntheticLambda0.AudioAttributesImplBaseParcelizer) && this.IconCompatParcelizer.equals(mediaItemClippingConfigurationExternalSyntheticLambda0.IconCompatParcelizer) && this.MediaBrowserCompatItemReceiver.equals(mediaItemClippingConfigurationExternalSyntheticLambda0.MediaBrowserCompatItemReceiver) && this.MediaBrowserCompatCustomActionResultReceiver.equals(mediaItemClippingConfigurationExternalSyntheticLambda0.MediaBrowserCompatCustomActionResultReceiver) && this.AudioAttributesImplApi26Parcelizer.equals(mediaItemClippingConfigurationExternalSyntheticLambda0.AudioAttributesImplApi26Parcelizer);
    }

    @Override // kotlin.onVolumeChanged
    public final int hashCode() {
        int iHashCode = this.MediaBrowserCompatItemReceiver.hashCode();
        int iHashCode2 = (((((iHashCode * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode()) * 31) + this.AudioAttributesImplApi21Parcelizer) * 31) + this.write;
        MediaItem<?> mediaItem = this.AudioAttributesImplBaseParcelizer;
        if (mediaItem != null) {
            iHashCode2 = (iHashCode2 * 31) + mediaItem.hashCode();
        }
        return (((iHashCode2 * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode();
    }

    @Override // kotlin.onVolumeChanged
    public final void write(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.RemoteActionCompatParcelizer.write(byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.AudioAttributesImplApi21Parcelizer).putInt(this.write).array();
        this.MediaBrowserCompatCustomActionResultReceiver.write(messageDigest);
        this.MediaBrowserCompatItemReceiver.write(messageDigest);
        messageDigest.update(bArr);
        MediaItem<?> mediaItem = this.AudioAttributesImplBaseParcelizer;
        if (mediaItem != null) {
            mediaItem.write(messageDigest);
        }
        this.AudioAttributesImplApi26Parcelizer.write(messageDigest);
        messageDigest.update(write());
        this.RemoteActionCompatParcelizer.read(bArr);
    }

    private byte[] write() {
        prepareChildSource<Class<?>, byte[]> preparechildsource = AudioAttributesCompatParcelizer;
        byte[] bArrRemoteActionCompatParcelizer = preparechildsource.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        if (bArrRemoteActionCompatParcelizer != null) {
            return bArrRemoteActionCompatParcelizer;
        }
        byte[] bytes = this.IconCompatParcelizer.getName().getBytes(read);
        preparechildsource.IconCompatParcelizer(this.IconCompatParcelizer, bytes);
        return bytes;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResourceCacheKey{sourceKey=");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(", signature=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(", width=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", height=");
        sb.append(this.write);
        sb.append(", decodedResourceClass=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", transformation='");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append("', options=");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append('}');
        return sb.toString();
    }
}
