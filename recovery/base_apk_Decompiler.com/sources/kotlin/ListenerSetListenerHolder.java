package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class ListenerSetListenerHolder {
    private final String AudioAttributesCompatParcelizer;
    private final long IconCompatParcelizer;
    private final long read;
    private final String write;

    public ListenerSetListenerHolder(String str, long j, long j2, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.AudioAttributesCompatParcelizer = str;
        this.IconCompatParcelizer = j;
        this.read = j2;
        this.write = str2;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final long IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final long read() {
        return this.read;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListenerSetListenerHolder)) {
            return false;
        }
        ListenerSetListenerHolder listenerSetListenerHolder = (ListenerSetListenerHolder) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) listenerSetListenerHolder.AudioAttributesCompatParcelizer) && this.IconCompatParcelizer == listenerSetListenerHolder.IconCompatParcelizer && this.read == listenerSetListenerHolder.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) listenerSetListenerHolder.write);
    }

    public final int hashCode() {
        return (((((this.AudioAttributesCompatParcelizer.hashCode() * 31) + Long.hashCode(this.IconCompatParcelizer)) * 31) + Long.hashCode(this.read)) * 31) + this.write.hashCode();
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        long j = this.IconCompatParcelizer;
        long j2 = this.read;
        String str2 = this.write;
        StringBuilder sb = new StringBuilder("VideoResumeInfoLSModel(videoId=");
        sb.append(str);
        sb.append(", resumeTimeMs=");
        sb.append(j);
        sb.append(", totalDurationMs=");
        sb.append(j2);
        sb.append(", referenceId=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
