package kotlin;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.C0177getRfBanners;
import kotlin.Metadata;
import kotlin.buildRequestUri;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\nH\u0002¢\u0006\u0004\b\b\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/buildRequestUri;", "", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "Lo/NewNumberOtpResendRequest;", "AudioAttributesCompatParcelizer", "()Lo/NewNumberOtpResendRequest;", "Landroid/net/Network;", "(Landroid/net/Network;)Z", "IconCompatParcelizer", "Landroid/content/Context;", "Landroid/net/ConnectivityManager;", "write", "Landroid/net/ConnectivityManager;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class buildRequestUri {
    private final Context IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final ConnectivityManager RemoteActionCompatParcelizer;

    @setSdkPayload
    public buildRequestUri(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        this.IconCompatParcelizer = context;
        Object systemService = context.getSystemService("connectivity");
        toMagicModuleMetaRepoModel.read(systemService, "");
        this.RemoteActionCompatParcelizer = (ConnectivityManager) systemService;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<getShowPearlDeletionPopup<? super Boolean>, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ boolean AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private /* synthetic */ Object RemoteActionCompatParcelizer;
        private Object write;

        public static final class RemoteActionCompatParcelizer extends ConnectivityManager.NetworkCallback {
            private /* synthetic */ getShowPearlDeletionPopup<Boolean> AudioAttributesCompatParcelizer;
            private /* synthetic */ buildRequestUri RemoteActionCompatParcelizer;

            /* JADX WARN: Multi-variable type inference failed */
            RemoteActionCompatParcelizer(getShowPearlDeletionPopup<? super Boolean> getshowpearldeletionpopup, buildRequestUri buildrequesturi) {
                this.AudioAttributesCompatParcelizer = getshowpearldeletionpopup;
                this.RemoteActionCompatParcelizer = buildrequesturi;
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                toMagicModuleMetaRepoModel.write(network, "");
                this.AudioAttributesCompatParcelizer.read(Boolean.valueOf(this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(network)));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                toMagicModuleMetaRepoModel.write(network, "");
                toMagicModuleMetaRepoModel.write(networkCapabilities, "");
                this.AudioAttributesCompatParcelizer.read(Boolean.valueOf(networkCapabilities.hasCapability(16)));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                toMagicModuleMetaRepoModel.write(network, "");
                this.AudioAttributesCompatParcelizer.read(Boolean.FALSE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            final getShowPearlDeletionPopup getshowpearldeletionpopup = (getShowPearlDeletionPopup) this.RemoteActionCompatParcelizer;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                final RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(getshowpearldeletionpopup, buildRequestUri.this);
                try {
                    buildRequestUri.this.RemoteActionCompatParcelizer.registerDefaultNetworkCallback(remoteActionCompatParcelizer);
                } catch (Exception e) {
                    getshowpearldeletionpopup.read(QBankStatsResponse.AudioAttributesCompatParcelizer(false));
                    getshowpearldeletionpopup.write(e);
                }
                if (this.AudioAttributesCompatParcelizer) {
                    Network activeNetwork = buildRequestUri.this.RemoteActionCompatParcelizer.getActiveNetwork();
                    getshowpearldeletionpopup.read(QBankStatsResponse.AudioAttributesCompatParcelizer(activeNetwork != null ? buildRequestUri.this.AudioAttributesCompatParcelizer(activeNetwork) : false));
                }
                final buildRequestUri buildrequesturi = buildRequestUri.this;
                this.RemoteActionCompatParcelizer = null;
                this.write = null;
                this.IconCompatParcelizer = 1;
                if (UserConfigResponse.RemoteActionCompatParcelizer(getshowpearldeletionpopup, new getCreatedOnDateMs() { // from class: o.SsManifestProtectionElement
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return buildRequestUri.IconCompatParcelizer.write(buildrequesturi, remoteActionCompatParcelizer);
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup write(buildRequestUri buildrequesturi, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            try {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                buildrequesturi.RemoteActionCompatParcelizer.unregisterNetworkCallback(remoteActionCompatParcelizer);
                C0177getRfBanners.read(getShowPopup.INSTANCE);
            } catch (Throwable th) {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
                C0177getRfBanners.read(SdkPayloadData.write(th));
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(boolean z, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = z;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            IconCompatParcelizer iconCompatParcelizer = buildRequestUri.this.new IconCompatParcelizer(this.AudioAttributesCompatParcelizer, sampleVideos);
            iconCompatParcelizer.RemoteActionCompatParcelizer = obj;
            return iconCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(getShowPearlDeletionPopup<? super Boolean> getshowpearldeletionpopup, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(getshowpearldeletionpopup, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final NewNumberOtpResendRequest<Boolean> AudioAttributesCompatParcelizer() {
        return VerifyNewNumberRequest.read(VerifyNewNumberRequest.read(VerifyNewNumberRequest.write(new IconCompatParcelizer(true, null)), new write(null)));
    }

    static final class write extends getMagicModuleStats implements getModuleData<getValidationToken<? super Boolean>, Throwable, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getValidationToken getvalidationtoken = (getValidationToken) this.write;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = null;
                this.RemoteActionCompatParcelizer = 1;
                if (getvalidationtoken.IconCompatParcelizer(QBankStatsResponse.AudioAttributesCompatParcelizer(false), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(3, sampleVideos);
        }

        @Override // kotlin.getModuleData
        public final /* synthetic */ Object AudioAttributesCompatParcelizer(getValidationToken<? super Boolean> getvalidationtoken, Throwable th, SampleVideos<? super getShowPopup> sampleVideos) {
            return IconCompatParcelizer(getvalidationtoken, sampleVideos);
        }

        private static Object IconCompatParcelizer(getValidationToken<? super Boolean> getvalidationtoken, SampleVideos<? super getShowPopup> sampleVideos) {
            write writeVar = new write(sampleVideos);
            writeVar.write = getvalidationtoken;
            return writeVar.invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean AudioAttributesCompatParcelizer(Network p0) {
        NetworkCapabilities networkCapabilities = this.RemoteActionCompatParcelizer.getNetworkCapabilities(p0);
        return networkCapabilities != null && networkCapabilities.hasCapability(16);
    }
}
