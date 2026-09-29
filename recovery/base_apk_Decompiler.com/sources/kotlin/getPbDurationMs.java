package kotlin;

import kotlin.CurrentQuery;

/* JADX INFO: loaded from: classes4.dex */
public final class getPbDurationMs implements CurrentQuery.IconCompatParcelizer<isParallelDecodingRequired<?>> {
    private final ThreadLocal<?> AudioAttributesCompatParcelizer;

    public getPbDurationMs(ThreadLocal<?> threadLocal) {
        this.AudioAttributesCompatParcelizer = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getPbDurationMs) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, ((getPbDurationMs) obj).AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThreadLocalKey(threadLocal=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
