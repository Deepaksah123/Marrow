package kotlin;

import com.marrow.data.models.lesson.StepIndex;

/* JADX INFO: loaded from: classes3.dex */
public final class correctMediaLoadDataPositionMs implements getMediaPeriodForEvent {
    private final ServerSideAdInsertionMediaSource AudioAttributesCompatParcelizer;
    private final AdsMediaSourceAdPrepareListener RemoteActionCompatParcelizer;

    @setSdkPayload
    public correctMediaLoadDataPositionMs(AdsMediaSourceAdPrepareListener adsMediaSourceAdPrepareListener, ServerSideAdInsertionMediaSource serverSideAdInsertionMediaSource) {
        toMagicModuleMetaRepoModel.write(adsMediaSourceAdPrepareListener, "");
        toMagicModuleMetaRepoModel.write(serverSideAdInsertionMediaSource, "");
        this.RemoteActionCompatParcelizer = adsMediaSourceAdPrepareListener;
        this.AudioAttributesCompatParcelizer = serverSideAdInsertionMediaSource;
    }

    @Override // kotlin.getMediaPeriodForEvent
    public final StepIndex IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.RemoteActionCompatParcelizer.read(str, 0);
    }
}
