package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdanewSingleThreadExecutor3 {
    private final String AudioAttributesCompatParcelizer;
    private final boolean read;

    public lambdanewSingleThreadExecutor3(String str, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.AudioAttributesCompatParcelizer = str;
        this.read = z;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lambdanewSingleThreadExecutor3)) {
            return false;
        }
        lambdanewSingleThreadExecutor3 lambdanewsinglethreadexecutor3 = (lambdanewSingleThreadExecutor3) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) lambdanewsinglethreadexecutor3.AudioAttributesCompatParcelizer) && this.read == lambdanewsinglethreadexecutor3.read;
    }

    public final int hashCode() {
        return (this.AudioAttributesCompatParcelizer.hashCode() * 31) + Boolean.hashCode(this.read);
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        boolean z = this.read;
        StringBuilder sb = new StringBuilder("NextModuleUcModel(id=");
        sb.append(str);
        sb.append(", isPaid=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
