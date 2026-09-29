package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class msToUs {
    private final String IconCompatParcelizer;
    private final Long read;

    public msToUs(String str, Long l) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.IconCompatParcelizer = str;
        this.read = l;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final Long IconCompatParcelizer() {
        return this.read;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public msToUs(String str, boolean z) {
        this(str, (Long) 0L);
        toMagicModuleMetaRepoModel.write(str, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msToUs)) {
            return false;
        }
        msToUs mstous = (msToUs) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) mstous.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, mstous.read);
    }

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        Long l = this.read;
        return (iHashCode * 31) + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Preference(key=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", value=");
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }
}
