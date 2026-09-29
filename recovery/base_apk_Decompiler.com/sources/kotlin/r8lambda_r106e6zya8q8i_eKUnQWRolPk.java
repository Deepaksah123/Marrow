package kotlin;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class r8lambda_r106e6zya8q8i_eKUnQWRolPk implements onVolumeChanged {
    private final setTitleOptional<isRated<?>, Object> AudioAttributesCompatParcelizer = new getMediaPeriodIdForChildMediaPeriodId();

    public final void write(r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        this.AudioAttributesCompatParcelizer.write(r8lambda_r106e6zya8q8i_ekunqwrolpk.AudioAttributesCompatParcelizer);
    }

    public final <T> r8lambda_r106e6zya8q8i_eKUnQWRolPk RemoteActionCompatParcelizer(isRated<T> israted, T t) {
        this.AudioAttributesCompatParcelizer.put(israted, t);
        return this;
    }

    public final r8lambda_r106e6zya8q8i_eKUnQWRolPk AudioAttributesCompatParcelizer(isRated<?> israted) {
        this.AudioAttributesCompatParcelizer.remove(israted);
        return this;
    }

    public final <T> T IconCompatParcelizer(isRated<T> israted) {
        return this.AudioAttributesCompatParcelizer.containsKey(israted) ? (T) this.AudioAttributesCompatParcelizer.get(israted) : israted.read();
    }

    @Override // kotlin.onVolumeChanged
    public final boolean equals(Object obj) {
        if (obj instanceof r8lambda_r106e6zya8q8i_eKUnQWRolPk) {
            return this.AudioAttributesCompatParcelizer.equals(((r8lambda_r106e6zya8q8i_eKUnQWRolPk) obj).AudioAttributesCompatParcelizer);
        }
        return false;
    }

    @Override // kotlin.onVolumeChanged
    public final int hashCode() {
        return this.AudioAttributesCompatParcelizer.hashCode();
    }

    @Override // kotlin.onVolumeChanged
    public final void write(MessageDigest messageDigest) {
        for (int i = 0; i < this.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer(); i++) {
            write(this.AudioAttributesCompatParcelizer.write(i), this.AudioAttributesCompatParcelizer.IconCompatParcelizer(i), messageDigest);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Options{values=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void write(isRated<T> israted, Object obj, MessageDigest messageDigest) {
        israted.AudioAttributesCompatParcelizer(obj, messageDigest);
    }
}
