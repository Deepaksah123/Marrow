package kotlin;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import in.juspay.hyper.constants.LogSubCategory;
import kotlin.BaseRenderer;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.setMediaItems;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB!\b\u0002\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u001e\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/work/impl/constraints/IndividualNetworkCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;", "onConstraintState", "Lkotlin/Function1;", "Landroidx/work/impl/constraints/ConstraintsState;", "", "Landroidx/work/impl/constraints/OnConstraintState;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "onCapabilitiesChanged", LogSubCategory.ApiCall.NETWORK, "Landroid/net/Network;", "networkCapabilities", "Landroid/net/NetworkCapabilities;", "onLost", "Companion", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class BaseRenderer extends ConnectivityManager.NetworkCallback {
    public static final write write = new write(null);
    private final getAnswerMap<setMediaItems, getShowPopup> IconCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    private BaseRenderer(getAnswerMap<? super setMediaItems, getShowPopup> getanswermap) {
        this.IconCompatParcelizer = getanswermap;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        toMagicModuleMetaRepoModel.write(network, "");
        toMagicModuleMetaRepoModel.write(networkCapabilities, "");
        n.write();
        String unused = getTrackType.AudioAttributesCompatParcelizer;
        this.IconCompatParcelizer.invoke(setMediaItems.read.INSTANCE);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        toMagicModuleMetaRepoModel.write(network, "");
        n.write();
        String unused = getTrackType.AudioAttributesCompatParcelizer;
        this.IconCompatParcelizer.invoke(new setMediaItems.RemoteActionCompatParcelizer(7));
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\fj\u0002`\u000e¨\u0006\u000f"}, d2 = {"Landroidx/work/impl/constraints/IndividualNetworkCallback$Companion;", "", "<init>", "()V", "addCallback", "Lkotlin/Function0;", "", "connManager", "Landroid/net/ConnectivityManager;", "networkRequest", "Landroid/net/NetworkRequest;", "onConstraintState", "Lkotlin/Function1;", "Landroidx/work/impl/constraints/ConstraintsState;", "Landroidx/work/impl/constraints/OnConstraintState;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class write {
        private write() {
        }

        public static getCreatedOnDateMs<getShowPopup> RemoteActionCompatParcelizer(final ConnectivityManager connectivityManager, NetworkRequest networkRequest, getAnswerMap<? super setMediaItems, getShowPopup> getanswermap) {
            toMagicModuleMetaRepoModel.write(connectivityManager, "");
            toMagicModuleMetaRepoModel.write(networkRequest, "");
            toMagicModuleMetaRepoModel.write(getanswermap, "");
            final BaseRenderer baseRenderer = new BaseRenderer(getanswermap, null);
            final MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer();
            try {
                n.write();
                String unused = getTrackType.AudioAttributesCompatParcelizer;
                connectivityManager.registerNetworkCallback(networkRequest, baseRenderer);
                audioAttributesCompatParcelizer.IconCompatParcelizer = true;
            } catch (RuntimeException e) {
                String name = e.getClass().getName();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name, "");
                if (TestGroupLSModel.AudioAttributesImplApi21Parcelizer(name, "TooManyRequestsException")) {
                    n.write();
                    String unused2 = getTrackType.AudioAttributesCompatParcelizer;
                    getanswermap.invoke(new setMediaItems.RemoteActionCompatParcelizer(7));
                } else {
                    throw e;
                }
            }
            return new getCreatedOnDateMs() { // from class: o.clearListener
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return BaseRenderer.write.read(audioAttributesCompatParcelizer, connectivityManager, baseRenderer);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup read(MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, ConnectivityManager connectivityManager, BaseRenderer baseRenderer) {
            if (audioAttributesCompatParcelizer.IconCompatParcelizer) {
                n.write();
                String unused = getTrackType.AudioAttributesCompatParcelizer;
                connectivityManager.unregisterNetworkCallback(baseRenderer);
            }
            return getShowPopup.INSTANCE;
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public /* synthetic */ BaseRenderer(getAnswerMap getanswermap, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(getanswermap);
    }
}
