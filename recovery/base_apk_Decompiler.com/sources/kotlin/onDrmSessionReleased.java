package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class onDrmSessionReleased {
    private final int IconCompatParcelizer;
    private final String read;
    private final String write;

    public onDrmSessionReleased(String str, String str2, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.write = str;
        this.read = str2;
        this.IconCompatParcelizer = i;
    }

    public final String write() {
        return this.write;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final int IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onDrmSessionReleased)) {
            return false;
        }
        onDrmSessionReleased ondrmsessionreleased = (onDrmSessionReleased) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) ondrmsessionreleased.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) ondrmsessionreleased.read) && this.IconCompatParcelizer == ondrmsessionreleased.IconCompatParcelizer;
    }

    public final int hashCode() {
        return (((this.write.hashCode() * 31) + this.read.hashCode()) * 31) + Integer.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionButton(id=");
        sb.append(this.write);
        sb.append(", label=");
        sb.append(this.read);
        sb.append(", icon=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
