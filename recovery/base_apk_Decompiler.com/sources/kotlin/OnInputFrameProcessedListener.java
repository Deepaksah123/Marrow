package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class OnInputFrameProcessedListener {
    private final String read;
    private final String write;

    public OnInputFrameProcessedListener(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.write = str;
        this.read = str2;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnInputFrameProcessedListener)) {
            return false;
        }
        OnInputFrameProcessedListener onInputFrameProcessedListener = (OnInputFrameProcessedListener) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) onInputFrameProcessedListener.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) onInputFrameProcessedListener.read);
    }

    public final int hashCode() {
        return (this.write.hashCode() * 31) + this.read.hashCode();
    }

    public final String toString() {
        String str = this.write;
        String str2 = this.read;
        StringBuilder sb = new StringBuilder("McqFaqUCModel(answer=");
        sb.append(str);
        sb.append(", question=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
