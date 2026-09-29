package kotlin;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 .2\u00020\u0001:\u0002.\u000fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\r\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\r\u0010\u0017J!\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00182\b\u0010\u0005\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010$R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00130!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010$R\u0014\u0010,\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-"}, d2 = {"Lo/VideoCacheModule;", "", "Lo/VideoOfflineDbModel;", "p0", "Lo/FragmentExtraModule;", "p1", "Lo/toDownloadInfo;", "p2", "Lo/AppThemeKt;", "p3", "<init>", "(Lo/VideoOfflineDbModel;Lo/FragmentExtraModule;Lo/toDownloadInfo;Lo/AppThemeKt;)V", "", "write", "()Z", "AudioAttributesCompatParcelizer", "Lo/VideoCacheModule$AudioAttributesCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/VideoCacheModule$AudioAttributesCompatParcelizer;", "Ljava/net/Proxy;", "read", "()Ljava/net/Proxy;", "", "(Ljava/net/Proxy;)V", "Lo/ThemeAlphaConstantsKt;", "IconCompatParcelizer", "(Lo/ThemeAlphaConstantsKt;Ljava/net/Proxy;)V", "address", "Lo/VideoOfflineDbModel;", "call", "Lo/toDownloadInfo;", "eventListener", "Lo/AppThemeKt;", "", "Ljava/net/InetSocketAddress;", "inetSocketAddresses", "Ljava/util/List;", "", "nextProxyIndex", "I", "", "Lo/ActivityPresenterModule;", "postponedRoutes", "proxies", "routeDatabase", "Lo/FragmentExtraModule;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VideoCacheModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final VideoOfflineDbModel address;
    private final toDownloadInfo call;
    private final AppThemeKt eventListener;
    private List<? extends InetSocketAddress> inetSocketAddresses;
    private int nextProxyIndex;
    private final List<ActivityPresenterModule> postponedRoutes;
    private List<? extends Proxy> proxies;
    private final FragmentExtraModule routeDatabase;

    public VideoCacheModule(VideoOfflineDbModel videoOfflineDbModel, FragmentExtraModule fragmentExtraModule, toDownloadInfo todownloadinfo, AppThemeKt appThemeKt) {
        toMagicModuleMetaRepoModel.write(videoOfflineDbModel, "");
        toMagicModuleMetaRepoModel.write(fragmentExtraModule, "");
        toMagicModuleMetaRepoModel.write(todownloadinfo, "");
        toMagicModuleMetaRepoModel.write(appThemeKt, "");
        this.address = videoOfflineDbModel;
        this.routeDatabase = fragmentExtraModule;
        this.call = todownloadinfo;
        this.eventListener = appThemeKt;
        this.proxies = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        this.inetSocketAddresses = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        this.postponedRoutes = new ArrayList();
        IconCompatParcelizer(videoOfflineDbModel.getUrl(), videoOfflineDbModel.getProxy());
    }

    public final boolean write() {
        return AudioAttributesCompatParcelizer() || !this.postponedRoutes.isEmpty();
    }

    public final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer() throws IOException {
        if (!write()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (AudioAttributesCompatParcelizer()) {
            Proxy proxy = read();
            Iterator<? extends InetSocketAddress> it = this.inetSocketAddresses.iterator();
            while (it.hasNext()) {
                ActivityPresenterModule activityPresenterModule = new ActivityPresenterModule(this.address, proxy, it.next());
                if (this.routeDatabase.IconCompatParcelizer(activityPresenterModule)) {
                    this.postponedRoutes.add(activityPresenterModule);
                } else {
                    arrayList.add(activityPresenterModule);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList, (Iterable) this.postponedRoutes);
            this.postponedRoutes.clear();
        }
        return new AudioAttributesCompatParcelizer(arrayList);
    }

    private static final List<Proxy> RemoteActionCompatParcelizer(Proxy proxy, ThemeAlphaConstantsKt themeAlphaConstantsKt, VideoCacheModule videoCacheModule) {
        if (proxy != null) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(proxy);
        }
        URI uriOnAddQueueItem = themeAlphaConstantsKt.onAddQueueItem();
        if (uriOnAddQueueItem.getHost() == null) {
            return FirebaseDataModule.IconCompatParcelizer(Proxy.NO_PROXY);
        }
        List<Proxy> listSelect = videoCacheModule.address.getProxySelector().select(uriOnAddQueueItem);
        List<Proxy> list = listSelect;
        if (list == null || list.isEmpty()) {
            return FirebaseDataModule.IconCompatParcelizer(Proxy.NO_PROXY);
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listSelect, "");
        return FirebaseDataModule.AudioAttributesCompatParcelizer(listSelect);
    }

    private final void IconCompatParcelizer(ThemeAlphaConstantsKt p0, Proxy p1) {
        AppThemeKt.read(this.call, p0);
        List<Proxy> listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p1, p0, this);
        this.proxies = listRemoteActionCompatParcelizer;
        this.nextProxyIndex = 0;
        AppThemeKt.RemoteActionCompatParcelizer(this.call, p0, listRemoteActionCompatParcelizer);
    }

    private final boolean AudioAttributesCompatParcelizer() {
        return this.nextProxyIndex < this.proxies.size();
    }

    private final Proxy read() throws IOException {
        if (!AudioAttributesCompatParcelizer()) {
            StringBuilder sb = new StringBuilder("No route to ");
            sb.append(this.address.getUrl().getHost());
            sb.append("; exhausted proxy configurations: ");
            sb.append(this.proxies);
            throw new SocketException(sb.toString());
        }
        List<? extends Proxy> list = this.proxies;
        int i = this.nextProxyIndex;
        this.nextProxyIndex = i + 1;
        Proxy proxy = list.get(i);
        write(proxy);
        return proxy;
    }

    private final void write(Proxy p0) throws IOException {
        String host;
        int port;
        List<InetAddress> listRemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        this.inetSocketAddresses = arrayList;
        if (p0.type() == Proxy.Type.DIRECT || p0.type() == Proxy.Type.SOCKS) {
            host = this.address.getUrl().getHost();
            port = this.address.getUrl().getPort();
        } else {
            SocketAddress socketAddressAddress = p0.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                StringBuilder sb = new StringBuilder("Proxy.address() is not an InetSocketAddress: ");
                sb.append(socketAddressAddress.getClass());
                throw new IllegalArgumentException(sb.toString().toString());
            }
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(socketAddressAddress, "");
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            host = Companion.AudioAttributesCompatParcelizer(inetSocketAddress);
            port = inetSocketAddress.getPort();
        }
        if (port <= 0 || port >= 65536) {
            StringBuilder sb2 = new StringBuilder("No route to ");
            sb2.append(host);
            sb2.append(':');
            sb2.append(port);
            sb2.append("; port is out of range");
            throw new SocketException(sb2.toString());
        }
        if (p0.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(host, port));
            return;
        }
        if (FirebaseDataModule.IconCompatParcelizer(host)) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(InetAddress.getByName(host));
        } else {
            AppThemeKt.AudioAttributesCompatParcelizer(this.call, host);
            List<InetAddress> listIconCompatParcelizer = this.address.getDns().IconCompatParcelizer(host);
            if (listIconCompatParcelizer.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.address.getDns());
                sb3.append(" returned no addresses for ");
                sb3.append(host);
                throw new UnknownHostException(sb3.toString());
            }
            AppThemeKt.AudioAttributesCompatParcelizer(this.call, host, listIconCompatParcelizer);
            listRemoteActionCompatParcelizer = listIconCompatParcelizer;
        }
        Iterator<InetAddress> it = listRemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress(it.next(), port));
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/VideoCacheModule$AudioAttributesCompatParcelizer;", "", "", "Lo/ActivityPresenterModule;", "p0", "<init>", "(Ljava/util/List;)V", "", "read", "()Z", "RemoteActionCompatParcelizer", "()Lo/ActivityPresenterModule;", "", "nextRouteIndex", "I", "routes", "Ljava/util/List;", "AudioAttributesCompatParcelizer", "()Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        private int nextRouteIndex;
        private final List<ActivityPresenterModule> routes;

        public AudioAttributesCompatParcelizer(List<ActivityPresenterModule> list) {
            toMagicModuleMetaRepoModel.write(list, "");
            this.routes = list;
        }

        public final List<ActivityPresenterModule> AudioAttributesCompatParcelizer() {
            return this.routes;
        }

        public final boolean read() {
            return this.nextRouteIndex < this.routes.size();
        }

        public final ActivityPresenterModule RemoteActionCompatParcelizer() {
            if (!read()) {
                throw new NoSuchElementException();
            }
            List<ActivityPresenterModule> list = this.routes;
            int i = this.nextRouteIndex;
            this.nextRouteIndex = i + 1;
            return list.get(i);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/VideoCacheModule$Companion;", "", "<init>", "()V", "Ljava/net/InetSocketAddress;", "", "AudioAttributesCompatParcelizer", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", "write"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static String AudioAttributesCompatParcelizer(InetSocketAddress inetSocketAddress) {
            toMagicModuleMetaRepoModel.write(inetSocketAddress, "");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(hostName, "");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(hostAddress, "");
            return hostAddress;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
