package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class SpliceInsertCommand1 {
    private final int AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final String read;
    private final long write;

    public SpliceInsertCommand1(String str, String str2, int i, long j) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.AudioAttributesCompatParcelizer = i;
        this.write = j;
    }

    public final String IconCompatParcelizer() {
        return this.read;
    }

    public final String read() {
        return this.IconCompatParcelizer;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final long write() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpliceInsertCommand1)) {
            return false;
        }
        SpliceInsertCommand1 spliceInsertCommand1 = (SpliceInsertCommand1) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) spliceInsertCommand1.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) spliceInsertCommand1.IconCompatParcelizer) && this.AudioAttributesCompatParcelizer == spliceInsertCommand1.AudioAttributesCompatParcelizer && this.write == spliceInsertCommand1.write;
    }

    public final int hashCode() {
        return (((((this.read.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Long.hashCode(this.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionDetails(sessionId=");
        sb.append(this.read);
        sb.append(", firstSessionId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", sessionIndex=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", sessionStartTimestampUs=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
