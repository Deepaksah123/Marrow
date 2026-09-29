package kotlin;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u0014\u0010\f\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/setCurrentStreamFinal;", "Lo/onStreamChanged;", "Lo/getLastResetPositionUs;", "Landroid/content/Context;", "p0", "Lo/setEnableDecoderFallback;", "p1", "<init>", "(Landroid/content/Context;Lo/setEnableDecoderFallback;)V", "IconCompatParcelizer", "()Lo/getLastResetPositionUs;", "", "AudioAttributesCompatParcelizer", "()V", "RemoteActionCompatParcelizer", "Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager;", "", "Ljava/lang/Object;", "", "read", "Z", "Lo/setCurrentStreamFinal$RemoteActionCompatParcelizer;", "write", "Lo/setCurrentStreamFinal$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setCurrentStreamFinal extends onStreamChanged<getLastResetPositionUs> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final ConnectivityManager RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Object AudioAttributesCompatParcelizer;
    private volatile boolean read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final RemoteActionCompatParcelizer IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setCurrentStreamFinal(Context context, setEnableDecoderFallback setenabledecoderfallback) {
        super(context, setenabledecoderfallback);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(setenabledecoderfallback, "");
        Object systemService = write().getSystemService("connectivity");
        toMagicModuleMetaRepoModel.read(systemService, "");
        this.RemoteActionCompatParcelizer = (ConnectivityManager) systemService;
        this.AudioAttributesCompatParcelizer = new Object();
        this.IconCompatParcelizer = new RemoteActionCompatParcelizer();
    }

    @Override // kotlin.onStreamChanged
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final getLastResetPositionUs read() {
        ConnectivityManager connectivityManager = this.RemoteActionCompatParcelizer;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null) {
            return supportsMixedMimeTypeAdaptation.read(networkCapabilities, this.read);
        }
        return supportsMixedMimeTypeAdaptation.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.read);
    }

    public static final class RemoteActionCompatParcelizer extends ConnectivityManager.NetworkCallback {
        RemoteActionCompatParcelizer() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            toMagicModuleMetaRepoModel.write(network, "");
            toMagicModuleMetaRepoModel.write(networkCapabilities, "");
            n.write();
            String unused = supportsMixedMimeTypeAdaptation.write;
            Objects.toString(networkCapabilities);
            setCurrentStreamFinal setcurrentstreamfinal = setCurrentStreamFinal.this;
            setcurrentstreamfinal.IconCompatParcelizer(supportsMixedMimeTypeAdaptation.read(networkCapabilities, setcurrentstreamfinal.read));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            toMagicModuleMetaRepoModel.write(network, "");
            n.write();
            String unused = supportsMixedMimeTypeAdaptation.write;
            setCurrentStreamFinal.this.IconCompatParcelizer(new getLastResetPositionUs(false, false, false, false, false));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onBlockedStatusChanged(Network network, boolean z) {
            toMagicModuleMetaRepoModel.write(network, "");
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(network, setCurrentStreamFinal.this.RemoteActionCompatParcelizer.getActiveNetwork())) {
                n.write();
                String unused = supportsMixedMimeTypeAdaptation.write;
                getLastResetPositionUs getlastresetpositionusAudioAttributesImplBaseParcelizer = setCurrentStreamFinal.this.AudioAttributesImplBaseParcelizer();
                Object obj = setCurrentStreamFinal.this.AudioAttributesCompatParcelizer;
                setCurrentStreamFinal setcurrentstreamfinal = setCurrentStreamFinal.this;
                synchronized (obj) {
                    if (setcurrentstreamfinal.read == z) {
                        return;
                    }
                    setcurrentstreamfinal.read = z;
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                    setCurrentStreamFinal.this.IconCompatParcelizer(getLastResetPositionUs.RemoteActionCompatParcelizer(getlastresetpositionusAudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer, getlastresetpositionusAudioAttributesImplBaseParcelizer.read, getlastresetpositionusAudioAttributesImplBaseParcelizer.write, getlastresetpositionusAudioAttributesImplBaseParcelizer.IconCompatParcelizer, z));
                }
            }
        }
    }

    @Override // kotlin.onStreamChanged
    public final void AudioAttributesCompatParcelizer() {
        try {
            n.write();
            String unused = supportsMixedMimeTypeAdaptation.write;
            buildAudioSink.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
        } catch (IllegalArgumentException e) {
            n.write();
            String unused2 = supportsMixedMimeTypeAdaptation.write;
        } catch (SecurityException e2) {
            n.write();
            String unused3 = supportsMixedMimeTypeAdaptation.write;
        }
    }

    @Override // kotlin.onStreamChanged
    public final void RemoteActionCompatParcelizer() {
        try {
            n.write();
            String unused = supportsMixedMimeTypeAdaptation.write;
            this.RemoteActionCompatParcelizer.unregisterNetworkCallback(this.IconCompatParcelizer);
        } catch (IllegalArgumentException e) {
            n.write();
            String unused2 = supportsMixedMimeTypeAdaptation.write;
        } catch (SecurityException e2) {
            n.write();
            String unused3 = supportsMixedMimeTypeAdaptation.write;
        }
    }
}
