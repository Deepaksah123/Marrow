package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getEstimatedPositionUs extends copyWithPlaybackError {
    private copyWithNewPosition write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getEstimatedPositionUs(copyWithNewPosition copywithnewposition) {
        super(copywithnewposition.RemoteActionCompatParcelizer());
        toMagicModuleMetaRepoModel.write(copywithnewposition, "");
        this.write = copywithnewposition;
    }

    @Override // kotlin.copyWithNewPosition
    public final boolean read() {
        return this.write.read() && super.write();
    }

    @Override // kotlin.copyWithNewPosition
    public final List<MediaSourceListForwardingEventListenerExternalSyntheticLambda11<? extends Object>> IconCompatParcelizer() {
        MediaSourceListForwardingEventListenerExternalSyntheticLambda11<? extends Object> mediaSourceListForwardingEventListenerExternalSyntheticLambda11 = RemoteActionCompatParcelizer().get("PT_BIG_IMG");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda11);
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(mediaSourceListForwardingEventListenerExternalSyntheticLambda11);
    }
}
