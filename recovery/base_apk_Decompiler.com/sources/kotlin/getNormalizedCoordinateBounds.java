package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class getNormalizedCoordinateBounds {
    private final String AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;

    public getNormalizedCoordinateBounds(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = str2;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getNormalizedCoordinateBounds)) {
            return false;
        }
        getNormalizedCoordinateBounds getnormalizedcoordinatebounds = (getNormalizedCoordinateBounds) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) getnormalizedcoordinatebounds.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) getnormalizedcoordinatebounds.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return (this.RemoteActionCompatParcelizer.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("UserName(firstName=");
        sb.append(str);
        sb.append(", lastName=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
