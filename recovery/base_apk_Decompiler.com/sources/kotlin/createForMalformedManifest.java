package kotlin;

import android.content.Context;
import kotlin.onUpstreamDiscarded;

/* JADX INFO: loaded from: classes2.dex */
public class createForMalformedManifest extends MediaSourceListMediaSourceAndListener {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public createForMalformedManifest(Context context, int i, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4) {
        super(context, i, mediaSourceListForwardingEventListenerExternalSyntheticLambda4);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        IconCompatParcelizer();
        write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getIconCompatParcelizer());
        RemoteActionCompatParcelizer(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getAudioAttributesImplBaseParcelizer(), onUpstreamDiscarded.AudioAttributesCompatParcelizer.title);
        read(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getOnCustomAction(), onUpstreamDiscarded.AudioAttributesCompatParcelizer.content_view_small);
        RemoteActionCompatParcelizer(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getMediaBrowserCompatCustomActionResultReceiver(), onUpstreamDiscarded.AudioAttributesCompatParcelizer.msg);
        AudioAttributesCompatParcelizer();
    }
}
