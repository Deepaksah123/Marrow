package kotlin;

import android.content.Context;
import android.os.Bundle;
import kotlin.onUpstreamDiscarded;

/* JADX INFO: loaded from: classes2.dex */
public final class NoSampleRenderer extends MetadataRetrieverMetadataRetrieverInternalMediaSourceHandlerCallback {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoSampleRenderer(Context context, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4, Bundle bundle) {
        super(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4, bundle, onUpstreamDiscarded.RemoteActionCompatParcelizer.product_display_template);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        write(getRemoteActionCompatParcelizer());
        RemoteActionCompatParcelizer(getAudioAttributesCompatParcelizer());
        RemoteActionCompatParcelizer(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getMediaBrowserCompatCustomActionResultReceiver(), onUpstreamDiscarded.AudioAttributesCompatParcelizer.msg);
        RemoteActionCompatParcelizer(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getAudioAttributesImplBaseParcelizer(), onUpstreamDiscarded.AudioAttributesCompatParcelizer.title);
    }
}
