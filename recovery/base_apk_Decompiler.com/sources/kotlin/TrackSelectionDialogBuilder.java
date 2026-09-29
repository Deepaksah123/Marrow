package kotlin;

import com.marrow2.core.di.NetworkModule;
import com.marrow2.data.mcq.remote.McqService;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackSelectionDialogBuilder implements getSubmittedOn<McqService> {
    private final NetworkModule IconCompatParcelizer;
    private final getTestId<TrackSelectionViewTrackInfo> write;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setDescriptionList
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public McqService get() {
        throw null;
    }

    public static McqService IconCompatParcelizer(NetworkModule networkModule, TrackSelectionViewTrackInfo trackSelectionViewTrackInfo) {
        return (McqService) setPossibleScore.write(networkModule.write(trackSelectionViewTrackInfo));
    }
}
