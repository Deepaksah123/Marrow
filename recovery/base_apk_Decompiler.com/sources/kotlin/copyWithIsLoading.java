package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class copyWithIsLoading extends copyWithPlaybackError {
    private copyWithNewPosition write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public copyWithIsLoading(copyWithNewPosition copywithnewposition) {
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
        MediaSourceListForwardingEventListenerExternalSyntheticLambda11<? extends Object> mediaSourceListForwardingEventListenerExternalSyntheticLambda11 = RemoteActionCompatParcelizer().get("PT_DEEPLINK_LIST");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda11);
        MediaSourceListForwardingEventListenerExternalSyntheticLambda11<? extends Object> mediaSourceListForwardingEventListenerExternalSyntheticLambda112 = RemoteActionCompatParcelizer().get("PT_RATING_DEFAULT_DL");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda112);
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new MediaSourceListForwardingEventListenerExternalSyntheticLambda11[]{mediaSourceListForwardingEventListenerExternalSyntheticLambda11, mediaSourceListForwardingEventListenerExternalSyntheticLambda112});
    }
}
