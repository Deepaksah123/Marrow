package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class getMaxPendingFramesCountForMediaCodecDecoders {
    private final int read;
    private final String write;

    public getMaxPendingFramesCountForMediaCodecDecoders(String str, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.write = str;
        this.read = i;
    }

    public final String read() {
        return this.write;
    }

    public final int write() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getMaxPendingFramesCountForMediaCodecDecoders)) {
            return false;
        }
        getMaxPendingFramesCountForMediaCodecDecoders getmaxpendingframescountformediacodecdecoders = (getMaxPendingFramesCountForMediaCodecDecoders) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) getmaxpendingframescountformediacodecdecoders.write) && this.read == getmaxpendingframescountformediacodecdecoders.read;
    }

    public final int hashCode() {
        return (this.write.hashCode() * 31) + Integer.hashCode(this.read);
    }

    public final String toString() {
        String str = this.write;
        int i = this.read;
        StringBuilder sb = new StringBuilder("ForgotPasswordUseCaseModel(email=");
        sb.append(str);
        sb.append(", courseId=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
