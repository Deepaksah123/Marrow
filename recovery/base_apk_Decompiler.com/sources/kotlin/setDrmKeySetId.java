package kotlin;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
final class setDrmKeySetId implements onVolumeChanged {
    private final onVolumeChanged AudioAttributesCompatParcelizer;
    private final onVolumeChanged write;

    setDrmKeySetId(onVolumeChanged onvolumechanged, onVolumeChanged onvolumechanged2) {
        this.write = onvolumechanged;
        this.AudioAttributesCompatParcelizer = onvolumechanged2;
    }

    @Override // kotlin.onVolumeChanged
    public final boolean equals(Object obj) {
        if (!(obj instanceof setDrmKeySetId)) {
            return false;
        }
        setDrmKeySetId setdrmkeysetid = (setDrmKeySetId) obj;
        return this.write.equals(setdrmkeysetid.write) && this.AudioAttributesCompatParcelizer.equals(setdrmkeysetid.AudioAttributesCompatParcelizer);
    }

    @Override // kotlin.onVolumeChanged
    public final int hashCode() {
        return (this.write.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataCacheKey{sourceKey=");
        sb.append(this.write);
        sb.append(", signature=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append('}');
        return sb.toString();
    }

    @Override // kotlin.onVolumeChanged
    public final void write(MessageDigest messageDigest) {
        this.write.write(messageDigest);
        this.AudioAttributesCompatParcelizer.write(messageDigest);
    }
}
