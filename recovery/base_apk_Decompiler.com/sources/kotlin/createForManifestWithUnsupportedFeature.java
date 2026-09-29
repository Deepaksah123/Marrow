package kotlin;

import android.content.Context;
import android.text.Html;
import kotlin.onUpstreamDiscarded;

/* JADX INFO: loaded from: classes2.dex */
public final class createForManifestWithUnsupportedFeature extends MetadataRetriever {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public createForManifestWithUnsupportedFeature(Context context, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4) {
        super(context, onUpstreamDiscarded.RemoteActionCompatParcelizer.zero_bezel, mediaSourceListForwardingEventListenerExternalSyntheticLambda4);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        IconCompatParcelizer();
        write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getIconCompatParcelizer());
        RemoteActionCompatParcelizer(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getRemoteActionCompatParcelizer());
        IconCompatParcelizer(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getRead());
        RemoteActionCompatParcelizer(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getAudioAttributesImplBaseParcelizer(), onUpstreamDiscarded.AudioAttributesCompatParcelizer.title);
        read(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getOnCustomAction(), onUpstreamDiscarded.AudioAttributesCompatParcelizer.content_view_big);
        RemoteActionCompatParcelizer(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getMediaBrowserCompatCustomActionResultReceiver(), onUpstreamDiscarded.AudioAttributesCompatParcelizer.msg);
        AudioAttributesCompatParcelizer(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getMediaBrowserCompatItemReceiver(), mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getR8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw(), mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getAudioAttributesImplApi21Parcelizer());
        AudioAttributesCompatParcelizer();
    }

    private final void IconCompatParcelizer(String str) {
        if (onLoadStarted.read(str)) {
            read().setTextViewText(onUpstreamDiscarded.AudioAttributesCompatParcelizer.msg, Html.fromHtml(str, 0));
        }
    }
}
