package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class decoderInitialized {
    public final String AudioAttributesCompatParcelizer;
    public final String write;

    public decoderInitialized(String str, String str2) {
        this.write = str;
        this.AudioAttributesCompatParcelizer = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof decoderInitialized)) {
            return false;
        }
        decoderInitialized decoderinitialized = (decoderInitialized) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) decoderinitialized.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) decoderinitialized.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return this.AudioAttributesCompatParcelizer.hashCode() + (this.write.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
