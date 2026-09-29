package kotlin;

import com.marrow.data.api.models.response.notespurchase.NotesPurchasePlanDetailsResponse;
import dagger.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public final class maybeRemove implements assignIdForKey {
    private final Lazy<getOrAdd> IconCompatParcelizer;

    @setSdkPayload
    public maybeRemove(Lazy<getOrAdd> lazy) {
        toMagicModuleMetaRepoModel.write(lazy, "");
        this.IconCompatParcelizer = lazy;
    }

    private final getOrAdd RemoteActionCompatParcelizer() {
        getOrAdd getoradd = this.IconCompatParcelizer.get();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getoradd, "");
        return getoradd;
    }

    @Override // kotlin.assignIdForKey
    public final Object read(SampleVideos<? super NotesPurchasePlanDetailsResponse> sampleVideos) {
        return RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(sampleVideos);
    }
}
