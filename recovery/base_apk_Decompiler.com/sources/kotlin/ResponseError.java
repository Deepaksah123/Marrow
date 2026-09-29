package kotlin;

/* JADX INFO: loaded from: classes.dex */
public class ResponseError {
    public static final initEncryptedContent<Float> AudioAttributesCompatParcelizer(float f, float f2) {
        return new decryptSync(f, f2);
    }

    public static final void RemoteActionCompatParcelizer(boolean z, Number number) {
        toMagicModuleMetaRepoModel.write(number, "");
        if (z) {
            return;
        }
        StringBuilder sb = new StringBuilder("Step must be positive, was: ");
        sb.append(number);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }
}
