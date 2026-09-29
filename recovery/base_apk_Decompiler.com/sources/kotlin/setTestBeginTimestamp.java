package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setTestBeginTimestamp {
    private final newEncryptedObject AudioAttributesCompatParcelizer;
    private final String write;

    public setTestBeginTimestamp(String str, newEncryptedObject newencryptedobject) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(newencryptedobject, "");
        this.write = str;
        this.AudioAttributesCompatParcelizer = newencryptedobject;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setTestBeginTimestamp)) {
            return false;
        }
        setTestBeginTimestamp settestbegintimestamp = (setTestBeginTimestamp) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) settestbegintimestamp.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, settestbegintimestamp.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return (this.write.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MatchGroup(value=");
        sb.append(this.write);
        sb.append(", range=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
