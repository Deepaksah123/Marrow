package kotlin;

import com.marrow.data.api.models.response.plan.RenewEligible;
import com.marrow.data.models.user.NotesDispatchAddressRequest;
import dagger.Lazy;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class NoOpCacheEvictor implements SimpleCache {
    private final Lazy<LeastRecentlyUsedCacheEvictor> IconCompatParcelizer;

    @setSdkPayload
    public NoOpCacheEvictor(Lazy<LeastRecentlyUsedCacheEvictor> lazy) {
        toMagicModuleMetaRepoModel.write(lazy, "");
        this.IconCompatParcelizer = lazy;
    }

    private final LeastRecentlyUsedCacheEvictor IconCompatParcelizer() {
        LeastRecentlyUsedCacheEvictor leastRecentlyUsedCacheEvictor = this.IconCompatParcelizer.get();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(leastRecentlyUsedCacheEvictor, "");
        return leastRecentlyUsedCacheEvictor;
    }

    @Override // kotlin.SimpleCache
    public final Object AudioAttributesCompatParcelizer(SampleVideos<? super List<LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0>> sampleVideos) {
        return IconCompatParcelizer().RemoteActionCompatParcelizer(sampleVideos);
    }

    @Override // kotlin.SimpleCache
    public final Object write(SampleVideos<? super RenewEligible> sampleVideos) {
        return IconCompatParcelizer().read(sampleVideos);
    }

    @Override // kotlin.SimpleCache
    public final Object AudioAttributesCompatParcelizer(NotesDispatchAddressRequest notesDispatchAddressRequest, SampleVideos<? super getShowPopup> sampleVideos) {
        Object obj = IconCompatParcelizer().read(notesDispatchAddressRequest, sampleVideos);
        return obj == getYear.IconCompatParcelizer() ? obj : getShowPopup.INSTANCE;
    }
}
