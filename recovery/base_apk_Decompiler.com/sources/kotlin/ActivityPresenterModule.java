package kotlin;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lo/ActivityPresenterModule;", "", "Lo/VideoOfflineDbModel;", "p0", "Ljava/net/Proxy;", "p1", "Ljava/net/InetSocketAddress;", "p2", "<init>", "(Lo/VideoOfflineDbModel;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "write", "()Z", "", "toString", "()Ljava/lang/String;", "address", "Lo/VideoOfflineDbModel;", "IconCompatParcelizer", "()Lo/VideoOfflineDbModel;", "proxy", "Ljava/net/Proxy;", "RemoteActionCompatParcelizer", "()Ljava/net/Proxy;", "socketAddress", "Ljava/net/InetSocketAddress;", "read", "()Ljava/net/InetSocketAddress;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ActivityPresenterModule {
    private final VideoOfflineDbModel address;
    private final Proxy proxy;
    private final InetSocketAddress socketAddress;

    public ActivityPresenterModule(VideoOfflineDbModel videoOfflineDbModel, Proxy proxy, InetSocketAddress inetSocketAddress) {
        toMagicModuleMetaRepoModel.write(videoOfflineDbModel, "");
        toMagicModuleMetaRepoModel.write(proxy, "");
        toMagicModuleMetaRepoModel.write(inetSocketAddress, "");
        this.address = videoOfflineDbModel;
        this.proxy = proxy;
        this.socketAddress = inetSocketAddress;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final VideoOfflineDbModel getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final InetSocketAddress getSocketAddress() {
        return this.socketAddress;
    }

    public final boolean write() {
        return this.address.getSslSocketFactory() != null && this.proxy.type() == Proxy.Type.HTTP;
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof ActivityPresenterModule)) {
            return false;
        }
        ActivityPresenterModule activityPresenterModule = (ActivityPresenterModule) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(activityPresenterModule.address, this.address) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(activityPresenterModule.proxy, this.proxy) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(activityPresenterModule.socketAddress, this.socketAddress);
    }

    public final int hashCode() {
        return ((((this.address.hashCode() + 527) * 31) + this.proxy.hashCode()) * 31) + this.socketAddress.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Route{");
        sb.append(this.socketAddress);
        sb.append('}');
        return sb.toString();
    }
}
