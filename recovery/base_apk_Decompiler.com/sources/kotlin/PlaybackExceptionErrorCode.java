package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaybackExceptionErrorCode extends copyWithPlaybackError {
    private copyWithNewPosition RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaybackExceptionErrorCode(copyWithNewPosition copywithnewposition) {
        super(copywithnewposition.RemoteActionCompatParcelizer());
        toMagicModuleMetaRepoModel.write(copywithnewposition, "");
        this.RemoteActionCompatParcelizer = copywithnewposition;
    }

    @Override // kotlin.copyWithNewPosition
    public final boolean read() {
        return this.RemoteActionCompatParcelizer.read() && super.write();
    }

    @Override // kotlin.copyWithNewPosition
    public final List<MediaSourceListForwardingEventListenerExternalSyntheticLambda11<? extends Object>> IconCompatParcelizer() {
        MediaSourceListForwardingEventListenerExternalSyntheticLambda11<? extends Object> mediaSourceListForwardingEventListenerExternalSyntheticLambda11 = RemoteActionCompatParcelizer().get("PT_DEEPLINK_LIST");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda11);
        MediaSourceListForwardingEventListenerExternalSyntheticLambda11<? extends Object> mediaSourceListForwardingEventListenerExternalSyntheticLambda112 = RemoteActionCompatParcelizer().get("PT_IMAGE_LIST");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda112);
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new MediaSourceListForwardingEventListenerExternalSyntheticLambda11[]{mediaSourceListForwardingEventListenerExternalSyntheticLambda11, mediaSourceListForwardingEventListenerExternalSyntheticLambda112});
    }
}
