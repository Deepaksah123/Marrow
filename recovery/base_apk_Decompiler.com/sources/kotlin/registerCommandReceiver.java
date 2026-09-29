package kotlin;

/* JADX INFO: loaded from: classes5.dex */
final class registerCommandReceiver extends setCustomActionProviders {
    private final ExoMediaDrmOnEventListener IconCompatParcelizer;
    private final ExoMediaDrmProvider RemoteActionCompatParcelizer;
    private final long read;

    registerCommandReceiver(long j, ExoMediaDrmProvider exoMediaDrmProvider, ExoMediaDrmOnEventListener exoMediaDrmOnEventListener) {
        this.read = j;
        if (exoMediaDrmProvider == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.RemoteActionCompatParcelizer = exoMediaDrmProvider;
        if (exoMediaDrmOnEventListener == null) {
            throw new NullPointerException("Null event");
        }
        this.IconCompatParcelizer = exoMediaDrmOnEventListener;
    }

    @Override // kotlin.setCustomActionProviders
    public final long IconCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.setCustomActionProviders
    public final ExoMediaDrmProvider read() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.setCustomActionProviders
    public final ExoMediaDrmOnEventListener write() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedEvent{id=");
        sb.append(this.read);
        sb.append(", transportContext=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", event=");
        sb.append(this.IconCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setCustomActionProviders)) {
            return false;
        }
        setCustomActionProviders setcustomactionproviders = (setCustomActionProviders) obj;
        return this.read == setcustomactionproviders.IconCompatParcelizer() && this.RemoteActionCompatParcelizer.equals(setcustomactionproviders.read()) && this.IconCompatParcelizer.equals(setcustomactionproviders.write());
    }

    public final int hashCode() {
        long j = this.read;
        return this.IconCompatParcelizer.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.RemoteActionCompatParcelizer.hashCode()) * 1000003);
    }
}
