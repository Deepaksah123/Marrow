package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class copyWithLoadingMediaPeriodId extends copyWithPlaybackError {
    private copyWithNewPosition write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public copyWithLoadingMediaPeriodId(copyWithNewPosition copywithnewposition) {
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
        MediaSourceListForwardingEventListenerExternalSyntheticLambda11<? extends Object> mediaSourceListForwardingEventListenerExternalSyntheticLambda11 = RemoteActionCompatParcelizer().get("PT_THREE_DEEPLINK_LIST");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda11);
        MediaSourceListForwardingEventListenerExternalSyntheticLambda11<? extends Object> mediaSourceListForwardingEventListenerExternalSyntheticLambda112 = RemoteActionCompatParcelizer().get("PT_BIG_TEXT_LIST");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda112);
        MediaSourceListForwardingEventListenerExternalSyntheticLambda11<? extends Object> mediaSourceListForwardingEventListenerExternalSyntheticLambda113 = RemoteActionCompatParcelizer().get("PT_SMALL_TEXT_LIST");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda113);
        MediaSourceListForwardingEventListenerExternalSyntheticLambda11<? extends Object> mediaSourceListForwardingEventListenerExternalSyntheticLambda114 = RemoteActionCompatParcelizer().get("PT_PRODUCT_DISPLAY_ACTION");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda114);
        MediaSourceListForwardingEventListenerExternalSyntheticLambda11<? extends Object> mediaSourceListForwardingEventListenerExternalSyntheticLambda115 = RemoteActionCompatParcelizer().get("PT_PRODUCT_THREE_IMAGE_LIST");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda115);
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new MediaSourceListForwardingEventListenerExternalSyntheticLambda11[]{mediaSourceListForwardingEventListenerExternalSyntheticLambda11, mediaSourceListForwardingEventListenerExternalSyntheticLambda112, mediaSourceListForwardingEventListenerExternalSyntheticLambda113, mediaSourceListForwardingEventListenerExternalSyntheticLambda114, mediaSourceListForwardingEventListenerExternalSyntheticLambda115});
    }
}
