package kotlin;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.setMediaItems;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000eH\u0016J\u0018\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0014H\u0016J\u0010\u0010 \u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010!\u001a\u00020\nH\u0003J\u001a\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u000eH\u0002J4\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\f2\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000bJ\f\u0010+\u001a\u0004\u0018\u00010\u000e*\u00020(R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u0006\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b\u0012\u0004\u0012\u00020\f0\u00078\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0012\u0010\u0019\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Landroidx/work/impl/constraints/SharedNetworkCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;", "<init>", "()V", "requestsLock", "", "requests", "", "Lkotlin/Function1;", "Landroidx/work/impl/constraints/ConstraintsState;", "", "Landroidx/work/impl/constraints/OnConstraintState;", "Landroid/net/NetworkRequest;", "cachedCapabilities", "Landroid/net/NetworkCapabilities;", "getCachedCapabilities", "()Landroid/net/NetworkCapabilities;", "setCachedCapabilities", "(Landroid/net/NetworkCapabilities;)V", "capabilitiesInitialized", "", "getCapabilitiesInitialized", "()Z", "setCapabilitiesInitialized", "(Z)V", "isBlocked", "onCapabilitiesChanged", LogSubCategory.ApiCall.NETWORK, "Landroid/net/Network;", "networkCapabilities", "onBlockedStatusChanged", "blocked", "onLost", "dispatchOnConstraintState", "areNetworkConstraintsSatisfied", "request", "capabilities", "addCallback", "Lkotlin/Function0;", "connManager", "Landroid/net/ConnectivityManager;", "networkRequest", "onConstraintState", "getCurrentNetworkCapabilities", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class getCapabilities extends ConnectivityManager.NetworkCallback {
    private static boolean AudioAttributesCompatParcelizer;
    private static NetworkCapabilities IconCompatParcelizer;
    private static boolean RemoteActionCompatParcelizer;
    public static final getCapabilities read = new getCapabilities();
    private static final Object MediaBrowserCompatCustomActionResultReceiver = new Object();
    private static final Map<getAnswerMap<setMediaItems, getShowPopup>, NetworkRequest> write = new LinkedHashMap();

    private getCapabilities() {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        toMagicModuleMetaRepoModel.write(network, "");
        toMagicModuleMetaRepoModel.write(networkCapabilities, "");
        n.write();
        String unused = getTrackType.AudioAttributesCompatParcelizer;
        synchronized (MediaBrowserCompatCustomActionResultReceiver) {
            IconCompatParcelizer = networkCapabilities;
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
        write();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean blocked) {
        toMagicModuleMetaRepoModel.write(network, "");
        n.write();
        String unused = getTrackType.AudioAttributesCompatParcelizer;
        synchronized (MediaBrowserCompatCustomActionResultReceiver) {
            if (AudioAttributesCompatParcelizer == blocked) {
                return;
            }
            AudioAttributesCompatParcelizer = blocked;
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            write();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        toMagicModuleMetaRepoModel.write(network, "");
        n.write();
        String unused = getTrackType.AudioAttributesCompatParcelizer;
        synchronized (MediaBrowserCompatCustomActionResultReceiver) {
            IconCompatParcelizer = null;
            Iterator<T> it = write.keySet().iterator();
            while (it.hasNext()) {
                ((getAnswerMap) it.next()).invoke(new setMediaItems.RemoteActionCompatParcelizer(7));
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    private static void write() {
        setMediaItems.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        ArrayList<Pair> arrayList = new ArrayList();
        synchronized (MediaBrowserCompatCustomActionResultReceiver) {
            Iterator<T> it = write.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                getAnswerMap getanswermap = (getAnswerMap) entry.getKey();
                if (RemoteActionCompatParcelizer((NetworkRequest) entry.getValue(), IconCompatParcelizer)) {
                    remoteActionCompatParcelizer = setMediaItems.read.INSTANCE;
                } else {
                    remoteActionCompatParcelizer = new setMediaItems.RemoteActionCompatParcelizer(7);
                }
                arrayList.add(setAction.write(getanswermap, remoteActionCompatParcelizer));
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
        for (Pair pair : arrayList) {
            ((getAnswerMap) pair.RemoteActionCompatParcelizer()).invoke((setMediaItems) pair.read());
        }
    }

    private static boolean RemoteActionCompatParcelizer(NetworkRequest networkRequest, NetworkCapabilities networkCapabilities) {
        return !AudioAttributesCompatParcelizer && networkRequest.canBeSatisfiedBy(networkCapabilities);
    }

    public static getCreatedOnDateMs<getShowPopup> AudioAttributesCompatParcelizer(final ConnectivityManager connectivityManager, NetworkRequest networkRequest, final getAnswerMap<? super setMediaItems, getShowPopup> getanswermap) {
        setMediaItems remoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(connectivityManager, "");
        toMagicModuleMetaRepoModel.write(networkRequest, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        synchronized (MediaBrowserCompatCustomActionResultReceiver) {
            Map<getAnswerMap<setMediaItems, getShowPopup>, NetworkRequest> map = write;
            boolean zIsEmpty = map.isEmpty();
            map.put(getanswermap, networkRequest);
            if (zIsEmpty) {
                n.write();
                String unused = getTrackType.AudioAttributesCompatParcelizer;
                connectivityManager.registerDefaultNetworkCallback(read);
            }
            n.write();
            String unused2 = getTrackType.AudioAttributesCompatParcelizer;
            if (RemoteActionCompatParcelizer(networkRequest, write(connectivityManager))) {
                remoteActionCompatParcelizer = setMediaItems.read.INSTANCE;
            } else {
                remoteActionCompatParcelizer = new setMediaItems.RemoteActionCompatParcelizer(7);
            }
            getanswermap.invoke(remoteActionCompatParcelizer);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
        return new getCreatedOnDateMs() { // from class: o.createRendererException
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getCapabilities.IconCompatParcelizer(getanswermap, connectivityManager);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getAnswerMap getanswermap, ConnectivityManager connectivityManager) {
        synchronized (MediaBrowserCompatCustomActionResultReceiver) {
            Map<getAnswerMap<setMediaItems, getShowPopup>, NetworkRequest> map = write;
            map.remove(getanswermap);
            if (map.isEmpty()) {
                n.write();
                String unused = getTrackType.AudioAttributesCompatParcelizer;
                connectivityManager.unregisterNetworkCallback(read);
                AudioAttributesCompatParcelizer = false;
                IconCompatParcelizer = null;
                RemoteActionCompatParcelizer = false;
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
        return getShowPopup.INSTANCE;
    }

    private static NetworkCapabilities write(ConnectivityManager connectivityManager) {
        toMagicModuleMetaRepoModel.write(connectivityManager, "");
        if (RemoteActionCompatParcelizer) {
            return IconCompatParcelizer;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        IconCompatParcelizer = networkCapabilities;
        RemoteActionCompatParcelizer = true;
        return networkCapabilities;
    }
}
