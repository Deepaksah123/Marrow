package kotlin;

import android.os.Bundle;

/* JADX INFO: renamed from: o.jsonMapper, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0183jsonMapper {
    private C0185kotlinModule RemoteActionCompatParcelizer;
    private final Bundle write;

    public C0183jsonMapper(C0185kotlinModule c0185kotlinModule, boolean z) {
        if (c0185kotlinModule == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.write = bundle;
        this.RemoteActionCompatParcelizer = c0185kotlinModule;
        bundle.putBundle("selector", c0185kotlinModule.IconCompatParcelizer());
        bundle.putBoolean("activeScan", z);
    }

    public final C0185kotlinModule write() {
        IconCompatParcelizer();
        return this.RemoteActionCompatParcelizer;
    }

    private void IconCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer == null) {
            C0185kotlinModule c0185kotlinModuleRemoteActionCompatParcelizer = C0185kotlinModule.RemoteActionCompatParcelizer(this.write.getBundle("selector"));
            this.RemoteActionCompatParcelizer = c0185kotlinModuleRemoteActionCompatParcelizer;
            if (c0185kotlinModuleRemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = C0185kotlinModule.read;
            }
        }
    }

    public final boolean read() {
        return this.write.getBoolean("activeScan");
    }

    private boolean AudioAttributesCompatParcelizer() {
        IconCompatParcelizer();
        return this.RemoteActionCompatParcelizer.read();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0183jsonMapper)) {
            return false;
        }
        C0183jsonMapper c0183jsonMapper = (C0183jsonMapper) obj;
        return write().equals(c0183jsonMapper.write()) && read() == c0183jsonMapper.read();
    }

    public final int hashCode() {
        return read() ^ write().hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        sb.append(write());
        sb.append(", activeScan=");
        sb.append(read());
        sb.append(", isValid=");
        sb.append(AudioAttributesCompatParcelizer());
        sb.append(" }");
        return sb.toString();
    }

    public final Bundle RemoteActionCompatParcelizer() {
        return this.write;
    }
}
