package kotlin;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class SimpleBasePlayerMediaItemDataBuilder {
    private final long AudioAttributesCompatParcelizer;
    private final long IconCompatParcelizer;
    private final File RemoteActionCompatParcelizer;
    private final long read;

    public SimpleBasePlayerMediaItemDataBuilder(long j, long j2, File file) {
        toMagicModuleMetaRepoModel.write(file, "");
        this.read = j;
        this.AudioAttributesCompatParcelizer = j2;
        this.IconCompatParcelizer = 5120L;
        this.RemoteActionCompatParcelizer = file;
    }

    public final long read() {
        return this.read;
    }

    public final long IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final long write() {
        return this.IconCompatParcelizer;
    }

    public final File AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleBasePlayerMediaItemDataBuilder)) {
            return false;
        }
        SimpleBasePlayerMediaItemDataBuilder simpleBasePlayerMediaItemDataBuilder = (SimpleBasePlayerMediaItemDataBuilder) obj;
        return this.read == simpleBasePlayerMediaItemDataBuilder.read && this.AudioAttributesCompatParcelizer == simpleBasePlayerMediaItemDataBuilder.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == simpleBasePlayerMediaItemDataBuilder.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, simpleBasePlayerMediaItemDataBuilder.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (((((Long.hashCode(this.read) * 31) + Long.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Long.hashCode(this.IconCompatParcelizer)) * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MemoryConfig(minInMemorySizeKB=");
        sb.append(this.read);
        sb.append(", optimistic=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", maxDiskSizeKB=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", diskDirectory=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
