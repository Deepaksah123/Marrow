package kotlin;

import android.net.NetworkRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b"}, d2 = {"Lo/buildMiscellaneousRenderers;", "", "<init>", "()V", "Landroid/net/NetworkRequest;", "p0", "", "write", "(Landroid/net/NetworkRequest;)[I", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class buildMiscellaneousRenderers {
    public static final buildMiscellaneousRenderers INSTANCE = new buildMiscellaneousRenderers();

    private buildMiscellaneousRenderers() {
    }

    public static int[] write(NetworkRequest p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        int[] capabilities = p0.getCapabilities();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(capabilities, "");
        return capabilities;
    }

    public static int[] RemoteActionCompatParcelizer(NetworkRequest p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        int[] transportTypes = p0.getTransportTypes();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(transportTypes, "");
        return transportTypes;
    }
}
