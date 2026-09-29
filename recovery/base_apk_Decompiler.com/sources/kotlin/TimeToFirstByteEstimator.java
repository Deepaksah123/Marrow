package kotlin;

import com.marrow.data.api.models.response.lesson.InteractiveVideoElementLSModel;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class TimeToFirstByteEstimator implements TransferListener {
    private final DefaultDashChunkSource RemoteActionCompatParcelizer;

    @setSdkPayload
    public TimeToFirstByteEstimator(DefaultDashChunkSource defaultDashChunkSource) {
        toMagicModuleMetaRepoModel.write(defaultDashChunkSource, "");
        this.RemoteActionCompatParcelizer = defaultDashChunkSource;
    }

    @Override // kotlin.TransferListener
    public final Object RemoteActionCompatParcelizer(List<InteractiveVideoElementLSModel> list) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(list.toArray(new InteractiveVideoElementLSModel[0]));
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.TransferListener
    public final Object write(String str) {
        this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver(str);
        return getShowPopup.INSTANCE;
    }
}
