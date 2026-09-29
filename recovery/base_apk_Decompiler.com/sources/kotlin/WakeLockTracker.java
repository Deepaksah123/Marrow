package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class WakeLockTracker {
    private final String RemoteActionCompatParcelizer;
    private final boolean write;

    public WakeLockTracker(String str, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.RemoteActionCompatParcelizer = str;
        this.write = z;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean write() {
        return this.write;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static WakeLockTracker read(String str, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        return new WakeLockTracker(str, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WakeLockTracker)) {
            return false;
        }
        WakeLockTracker wakeLockTracker = (WakeLockTracker) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) wakeLockTracker.RemoteActionCompatParcelizer) && this.write == wakeLockTracker.write;
    }

    public final int hashCode() {
        return (this.RemoteActionCompatParcelizer.hashCode() * 31) + Boolean.hashCode(this.write);
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        boolean z = this.write;
        StringBuilder sb = new StringBuilder("PearlScrollUIState(pearlId=");
        sb.append(str);
        sb.append(", needToScroll=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
