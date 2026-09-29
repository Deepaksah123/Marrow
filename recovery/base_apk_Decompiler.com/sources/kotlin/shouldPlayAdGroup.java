package kotlin;

import com.marrow.data.models.home.HomeMainModel;
import com.marrow.data.models.home.HomeRefreshInfoModel;

/* JADX INFO: loaded from: classes.dex */
public final class shouldPlayAdGroup implements withAllAdsReset {
    private static HomeMainModel AudioAttributesCompatParcelizer;
    private static final Object RemoteActionCompatParcelizer = new Object();
    private final AdPlaybackStateAdGroupExternalSyntheticLambda0 write;

    static /* synthetic */ void IconCompatParcelizer() throws Exception {
    }

    static /* synthetic */ void write() throws Exception {
    }

    @setSdkPayload
    public shouldPlayAdGroup(AdPlaybackStateAdGroupExternalSyntheticLambda0 adPlaybackStateAdGroupExternalSyntheticLambda0) {
        this.write = adPlaybackStateAdGroupExternalSyntheticLambda0;
    }

    @Override // kotlin.AdPlaybackStateAdGroupExternalSyntheticLambda0
    public final accessgetEmptyStatecp<HomeMainModel> AudioAttributesImplBaseParcelizer() {
        return this.write.AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer(new getSubjectTitle() { // from class: o.copyStatesWithSpaceForAdCount
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return shouldPlayAdGroup.AudioAttributesCompatParcelizer = (HomeMainModel) obj;
            }
        });
    }

    @Override // kotlin.AdPlaybackStateAdGroupExternalSyntheticLambda0
    public final HomeRefreshInfoModel AudioAttributesImplApi21Parcelizer() {
        return this.write.AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.withAllAdsReset
    public final HomeMainModel AudioAttributesCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }

    private static void MediaBrowserCompatCustomActionResultReceiver() {
        synchronized (RemoteActionCompatParcelizer) {
            AudioAttributesCompatParcelizer = null;
        }
    }

    @Override // kotlin.withAllAdsReset
    public final void AudioAttributesCompatParcelizer(getIds getids) {
        MediaBrowserCompatCustomActionResultReceiver();
        AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer(getids).AudioAttributesCompatParcelizer(getids).IconCompatParcelizer(new getTimelineId() { // from class: o.hasUnplayedAds
            @Override // kotlin.getTimelineId
            public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                shouldPlayAdGroup.IconCompatParcelizer();
            }
        }, new getTimelineId() { // from class: o.withAdUri
            @Override // kotlin.getTimelineId
            public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                shouldPlayAdGroup.write();
            }
        });
    }

    @Override // kotlin.withAllAdsReset
    public final void read() {
        synchronized (RemoteActionCompatParcelizer) {
            HomeRefreshInfoModel homeRefreshInfoModelAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
            if (homeRefreshInfoModelAudioAttributesImplApi21Parcelizer != null) {
                AudioAttributesCompatParcelizer = homeRefreshInfoModelAudioAttributesImplApi21Parcelizer.getMainModel();
            }
        }
    }

    public static void RemoteActionCompatParcelizer() {
        AudioAttributesCompatParcelizer = null;
    }
}
