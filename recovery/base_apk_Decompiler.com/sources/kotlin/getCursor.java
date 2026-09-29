package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class getCursor {
    private final Integer AudioAttributesCompatParcelizer;
    private final Long IconCompatParcelizer;
    private final Boolean RemoteActionCompatParcelizer;
    private final Double read;
    private final Integer write;

    public getCursor(Boolean bool, Double d, Integer num, Integer num2, Long l) {
        this.RemoteActionCompatParcelizer = bool;
        this.read = d;
        this.write = num;
        this.AudioAttributesCompatParcelizer = num2;
        this.IconCompatParcelizer = l;
    }

    public final Boolean write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final Double AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final Integer read() {
        return this.write;
    }

    public final Integer IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final Long RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCursor)) {
            return false;
        }
        getCursor getcursor = (getCursor) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, getcursor.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, getcursor.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, getcursor.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, getcursor.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, getcursor.IconCompatParcelizer);
    }

    public final int hashCode() {
        Boolean bool = this.RemoteActionCompatParcelizer;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Double d = this.read;
        int iHashCode2 = d == null ? 0 : d.hashCode();
        Integer num = this.write;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.AudioAttributesCompatParcelizer;
        int iHashCode4 = num2 == null ? 0 : num2.hashCode();
        Long l = this.IconCompatParcelizer;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionConfigs(sessionEnabled=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", sessionSamplingRate=");
        sb.append(this.read);
        sb.append(", sessionRestartTimeout=");
        sb.append(this.write);
        sb.append(", cacheDuration=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", cacheUpdatedTime=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
