package kotlin;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class getWindowIndexForChildWindowIndex implements onVolumeChanged {
    private final Object IconCompatParcelizer;

    public getWindowIndexForChildWindowIndex(Object obj) {
        this.IconCompatParcelizer = moveMediaSource.AudioAttributesCompatParcelizer(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ObjectKey{object=");
        sb.append(this.IconCompatParcelizer);
        sb.append('}');
        return sb.toString();
    }

    @Override // kotlin.onVolumeChanged
    public final boolean equals(Object obj) {
        if (obj instanceof getWindowIndexForChildWindowIndex) {
            return this.IconCompatParcelizer.equals(((getWindowIndexForChildWindowIndex) obj).IconCompatParcelizer);
        }
        return false;
    }

    @Override // kotlin.onVolumeChanged
    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    @Override // kotlin.onVolumeChanged
    public final void write(MessageDigest messageDigest) {
        messageDigest.update(this.IconCompatParcelizer.toString().getBytes(read));
    }
}
