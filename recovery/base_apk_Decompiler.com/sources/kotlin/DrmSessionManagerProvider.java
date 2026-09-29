package kotlin;

/* JADX INFO: loaded from: classes2.dex */
final class DrmSessionManagerProvider<T> extends isNotProvisionedException<T> {
    private final DrmUtilApi21 AudioAttributesCompatParcelizer;
    private final Integer read = null;
    private final T write;

    DrmSessionManagerProvider(T t, DrmUtilApi21 drmUtilApi21) {
        if (t == null) {
            throw new NullPointerException("Null payload");
        }
        this.write = t;
        if (drmUtilApi21 == null) {
            throw new NullPointerException("Null priority");
        }
        this.AudioAttributesCompatParcelizer = drmUtilApi21;
    }

    @Override // kotlin.isNotProvisionedException
    public final Integer read() {
        return this.read;
    }

    @Override // kotlin.isNotProvisionedException
    public final T write() {
        return this.write;
    }

    @Override // kotlin.isNotProvisionedException
    public final DrmUtilApi21 RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Event{code=");
        sb.append(this.read);
        sb.append(", payload=");
        sb.append(this.write);
        sb.append(", priority=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof isNotProvisionedException)) {
            return false;
        }
        isNotProvisionedException isnotprovisionedexception = (isNotProvisionedException) obj;
        return isnotprovisionedexception.read() == null && this.write.equals(isnotprovisionedexception.write()) && this.AudioAttributesCompatParcelizer.equals(isnotprovisionedexception.RemoteActionCompatParcelizer());
    }

    public final int hashCode() {
        return this.AudioAttributesCompatParcelizer.hashCode() ^ ((this.write.hashCode() ^ (-721379959)) * 1000003);
    }
}
