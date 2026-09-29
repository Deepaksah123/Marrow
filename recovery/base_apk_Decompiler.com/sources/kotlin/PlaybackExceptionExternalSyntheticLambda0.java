package kotlin;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaybackExceptionExternalSyntheticLambda0 extends copyWithNewPosition {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaybackExceptionExternalSyntheticLambda0(Map<String, ? extends MediaSourceListForwardingEventListenerExternalSyntheticLambda11<? extends Object>> map) {
        super(map);
        toMagicModuleMetaRepoModel.write(map, "");
    }

    @Override // kotlin.copyWithNewPosition
    public final List<MediaSourceListForwardingEventListenerExternalSyntheticLambda11<? extends Object>> IconCompatParcelizer() {
        MediaSourceListForwardingEventListenerExternalSyntheticLambda11<? extends Object> mediaSourceListForwardingEventListenerExternalSyntheticLambda11 = RemoteActionCompatParcelizer().get("PT_TITLE");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda11);
        MediaSourceListForwardingEventListenerExternalSyntheticLambda11<? extends Object> mediaSourceListForwardingEventListenerExternalSyntheticLambda112 = RemoteActionCompatParcelizer().get("PT_MSG");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda112);
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new MediaSourceListForwardingEventListenerExternalSyntheticLambda11[]{mediaSourceListForwardingEventListenerExternalSyntheticLambda11, mediaSourceListForwardingEventListenerExternalSyntheticLambda112});
    }
}
