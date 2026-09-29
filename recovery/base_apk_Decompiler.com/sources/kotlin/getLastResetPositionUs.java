package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class getLastResetPositionUs {
    private final boolean AudioAttributesCompatParcelizer;
    private final boolean IconCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;
    private final boolean read;
    private final boolean write;

    public getLastResetPositionUs(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.RemoteActionCompatParcelizer = z;
        this.read = z2;
        this.write = z3;
        this.IconCompatParcelizer = z4;
        this.AudioAttributesCompatParcelizer = z5;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean IconCompatParcelizer() {
        return this.read;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final boolean write() {
        return this.IconCompatParcelizer;
    }

    public final boolean read() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static getLastResetPositionUs RemoteActionCompatParcelizer(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new getLastResetPositionUs(z, z2, z3, z4, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getLastResetPositionUs)) {
            return false;
        }
        getLastResetPositionUs getlastresetpositionus = (getLastResetPositionUs) obj;
        return this.RemoteActionCompatParcelizer == getlastresetpositionus.RemoteActionCompatParcelizer && this.read == getlastresetpositionus.read && this.write == getlastresetpositionus.write && this.IconCompatParcelizer == getlastresetpositionus.IconCompatParcelizer && this.AudioAttributesCompatParcelizer == getlastresetpositionus.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (((((((Boolean.hashCode(this.RemoteActionCompatParcelizer) * 31) + Boolean.hashCode(this.read)) * 31) + Boolean.hashCode(this.write)) * 31) + Boolean.hashCode(this.IconCompatParcelizer)) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkState(isConnected=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", isValidated=");
        sb.append(this.read);
        sb.append(", isMetered=");
        sb.append(this.write);
        sb.append(", isNotRoaming=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", isBlocked=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
