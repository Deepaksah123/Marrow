package kotlin;

import com.marrow.data.models.mcq.McqTimerAnalyticsModel;

/* JADX INFO: loaded from: classes3.dex */
public final class CacheFileMetadata implements onCacheInitialized {
    private final DashMediaSourceManifestCallback RemoteActionCompatParcelizer;

    @setSdkPayload
    public CacheFileMetadata(DashMediaSourceManifestCallback dashMediaSourceManifestCallback) {
        toMagicModuleMetaRepoModel.write(dashMediaSourceManifestCallback, "");
        this.RemoteActionCompatParcelizer = dashMediaSourceManifestCallback;
    }

    @Override // kotlin.onCacheInitialized
    public final Object IconCompatParcelizer(McqTimerAnalyticsModel mcqTimerAnalyticsModel) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer2(mcqTimerAnalyticsModel);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.onCacheInitialized
    public final Object read(String str) {
        return this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer(str);
    }

    @Override // kotlin.onCacheInitialized
    public final Object RemoteActionCompatParcelizer(String str, String str2) {
        return this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(str, str2);
    }

    @Override // kotlin.onCacheInitialized
    public final Object AudioAttributesCompatParcelizer(String str) {
        this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver(str);
        return getShowPopup.INSTANCE;
    }
}
