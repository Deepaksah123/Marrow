package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class decryptSync implements initEncryptedContent<Float> {
    private final float AudioAttributesCompatParcelizer;
    private final float RemoteActionCompatParcelizer;

    private static boolean write(float f, float f2) {
        return f <= f2;
    }

    public decryptSync(float f, float f2) {
        this.AudioAttributesCompatParcelizer = f;
        this.RemoteActionCompatParcelizer = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.initEncryptedContent
    public final /* synthetic */ boolean read(Comparable comparable, Comparable comparable2) {
        return write(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.EncryptedContentArray
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public Float write() {
        return Float.valueOf(this.AudioAttributesCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.EncryptedContentArray
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public Float IconCompatParcelizer() {
        return Float.valueOf(this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.initEncryptedContent
    public final boolean AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer > this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof decryptSync)) {
            return false;
        }
        if (AudioAttributesCompatParcelizer() && ((decryptSync) obj).AudioAttributesCompatParcelizer()) {
            return true;
        }
        decryptSync decryptsync = (decryptSync) obj;
        return this.AudioAttributesCompatParcelizer == decryptsync.AudioAttributesCompatParcelizer && this.RemoteActionCompatParcelizer == decryptsync.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        if (AudioAttributesCompatParcelizer()) {
            return -1;
        }
        return (Float.hashCode(this.AudioAttributesCompatParcelizer) * 31) + Float.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append("..");
        sb.append(this.RemoteActionCompatParcelizer);
        return sb.toString();
    }
}
