package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class ProviderInstaller {
    private final boolean read;
    private final int write;

    public ProviderInstaller(boolean z, int i) {
        this.read = z;
        this.write = i;
    }

    public final boolean write() {
        return this.read;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProviderInstaller)) {
            return false;
        }
        ProviderInstaller providerInstaller = (ProviderInstaller) obj;
        return this.read == providerInstaller.read && this.write == providerInstaller.write;
    }

    public final int hashCode() {
        return (Boolean.hashCode(this.read) * 31) + Integer.hashCode(this.write);
    }

    public final String toString() {
        boolean z = this.read;
        int i = this.write;
        StringBuilder sb = new StringBuilder("CurrentUserPositionUIState(isPredictedRank=");
        sb.append(z);
        sb.append(", currentUserPosition=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
