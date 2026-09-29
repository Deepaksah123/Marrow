package kotlin;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class setLiveMaxOffsetMs implements onVolumeChanged {
    private final int AudioAttributesCompatParcelizer;
    private final Class<?> AudioAttributesImplApi21Parcelizer;
    private final onVolumeChanged AudioAttributesImplApi26Parcelizer;
    private final Map<Class<?>, MediaItem<?>> AudioAttributesImplBaseParcelizer;
    private final Object IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final Class<?> MediaBrowserCompatItemReceiver;
    private int RemoteActionCompatParcelizer;
    private final r8lambda_r106e6zya8q8i_eKUnQWRolPk write;

    setLiveMaxOffsetMs(Object obj, onVolumeChanged onvolumechanged, int i, int i2, Map<Class<?>, MediaItem<?>> map, Class<?> cls, Class<?> cls2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        this.IconCompatParcelizer = moveMediaSource.AudioAttributesCompatParcelizer(obj);
        this.AudioAttributesImplApi26Parcelizer = (onVolumeChanged) moveMediaSource.IconCompatParcelizer(onvolumechanged, "Signature must not be null");
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        this.AudioAttributesCompatParcelizer = i2;
        this.AudioAttributesImplBaseParcelizer = (Map) moveMediaSource.AudioAttributesCompatParcelizer(map);
        this.AudioAttributesImplApi21Parcelizer = (Class) moveMediaSource.IconCompatParcelizer(cls, "Resource class must not be null");
        this.MediaBrowserCompatItemReceiver = (Class) moveMediaSource.IconCompatParcelizer(cls2, "Transcode class must not be null");
        this.write = (r8lambda_r106e6zya8q8i_eKUnQWRolPk) moveMediaSource.AudioAttributesCompatParcelizer(r8lambda_r106e6zya8q8i_ekunqwrolpk);
    }

    @Override // kotlin.onVolumeChanged
    public final boolean equals(Object obj) {
        if (!(obj instanceof setLiveMaxOffsetMs)) {
            return false;
        }
        setLiveMaxOffsetMs setlivemaxoffsetms = (setLiveMaxOffsetMs) obj;
        return this.IconCompatParcelizer.equals(setlivemaxoffsetms.IconCompatParcelizer) && this.AudioAttributesImplApi26Parcelizer.equals(setlivemaxoffsetms.AudioAttributesImplApi26Parcelizer) && this.AudioAttributesCompatParcelizer == setlivemaxoffsetms.AudioAttributesCompatParcelizer && this.MediaBrowserCompatCustomActionResultReceiver == setlivemaxoffsetms.MediaBrowserCompatCustomActionResultReceiver && this.AudioAttributesImplBaseParcelizer.equals(setlivemaxoffsetms.AudioAttributesImplBaseParcelizer) && this.AudioAttributesImplApi21Parcelizer.equals(setlivemaxoffsetms.AudioAttributesImplApi21Parcelizer) && this.MediaBrowserCompatItemReceiver.equals(setlivemaxoffsetms.MediaBrowserCompatItemReceiver) && this.write.equals(setlivemaxoffsetms.write);
    }

    @Override // kotlin.onVolumeChanged
    public final int hashCode() {
        if (this.RemoteActionCompatParcelizer == 0) {
            int iHashCode = this.IconCompatParcelizer.hashCode();
            this.RemoteActionCompatParcelizer = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode()) * 31) + this.MediaBrowserCompatCustomActionResultReceiver) * 31) + this.AudioAttributesCompatParcelizer;
            this.RemoteActionCompatParcelizer = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.AudioAttributesImplBaseParcelizer.hashCode();
            this.RemoteActionCompatParcelizer = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode();
            this.RemoteActionCompatParcelizer = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.MediaBrowserCompatItemReceiver.hashCode();
            this.RemoteActionCompatParcelizer = iHashCode5;
            this.RemoteActionCompatParcelizer = (iHashCode5 * 31) + this.write.hashCode();
        }
        return this.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EngineKey{model=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", width=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(", height=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", resourceClass=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", transcodeClass=");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(", signature=");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", hashCode=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", transformations=");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(", options=");
        sb.append(this.write);
        sb.append('}');
        return sb.toString();
    }

    @Override // kotlin.onVolumeChanged
    public final void write(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
