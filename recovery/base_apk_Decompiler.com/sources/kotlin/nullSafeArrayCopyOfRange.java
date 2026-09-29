package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class nullSafeArrayCopyOfRange {
    private final String IconCompatParcelizer;
    private final boolean read;
    private final String write;

    public nullSafeArrayCopyOfRange(String str, String str2, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.read = z;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String write() {
        return this.write;
    }

    public final boolean read() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nullSafeArrayCopyOfRange)) {
            return false;
        }
        nullSafeArrayCopyOfRange nullsafearraycopyofrange = (nullSafeArrayCopyOfRange) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) nullsafearraycopyofrange.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) nullsafearraycopyofrange.write) && this.read == nullsafearraycopyofrange.read;
    }

    public final int hashCode() {
        return (((this.IconCompatParcelizer.hashCode() * 31) + this.write.hashCode()) * 31) + Boolean.hashCode(this.read);
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        String str2 = this.write;
        boolean z = this.read;
        StringBuilder sb = new StringBuilder("VideoNoteViewInfoUCModel(userId=");
        sb.append(str);
        sb.append(", email=");
        sb.append(str2);
        sb.append(", shouldShowWatermark=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
