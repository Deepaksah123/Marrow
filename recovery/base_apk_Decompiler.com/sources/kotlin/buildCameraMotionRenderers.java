package kotlin;

import android.net.NetworkRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/buildCameraMotionRenderers;", "", "<init>", "()V", "Landroid/net/NetworkRequest;", "p0", "", "p1", "", "AudioAttributesCompatParcelizer", "(Landroid/net/NetworkRequest;I)Z", "RemoteActionCompatParcelizer", "", "write", "([I[I)Landroid/net/NetworkRequest;", "Lo/buildTextRenderers;", "IconCompatParcelizer", "([I[I)Lo/buildTextRenderers;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class buildCameraMotionRenderers {
    public static final buildCameraMotionRenderers INSTANCE = new buildCameraMotionRenderers();

    private buildCameraMotionRenderers() {
    }

    public static boolean AudioAttributesCompatParcelizer(NetworkRequest p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.hasCapability(p1);
    }

    public static boolean RemoteActionCompatParcelizer(NetworkRequest p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.hasTransport(p1);
    }

    @getMagicModuleMeta
    private static NetworkRequest write(int[] p0, int[] p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : p0) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e) {
                n.write();
                buildTextRenderers.INSTANCE.IconCompatParcelizer();
            }
        }
        for (int i2 : buildMetadataRenderers.AudioAttributesCompatParcelizer) {
            if (!getOrderDetails.write(p0, i2)) {
                try {
                    builder.removeCapability(i2);
                } catch (IllegalArgumentException e2) {
                    n.write();
                    buildTextRenderers.INSTANCE.IconCompatParcelizer();
                }
            }
        }
        for (int i3 : p1) {
            builder.addTransportType(i3);
        }
        NetworkRequest networkRequestBuild = builder.build();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(networkRequestBuild, "");
        return networkRequestBuild;
    }

    public static buildTextRenderers IconCompatParcelizer(int[] p0, int[] p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new buildTextRenderers(write(p0, p1));
    }
}
