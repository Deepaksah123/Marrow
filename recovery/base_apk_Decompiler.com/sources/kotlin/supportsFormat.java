package kotlin;

import android.content.Context;
import android.text.Html;
import kotlin.onUpstreamDiscarded;

/* JADX INFO: loaded from: classes2.dex */
public final class supportsFormat extends ParserException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public supportsFormat(Context context, Integer num, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4) {
        super(context, num, mediaSourceListForwardingEventListenerExternalSyntheticLambda4, onUpstreamDiscarded.RemoteActionCompatParcelizer.timer);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        read(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getOnCustomAction(), onUpstreamDiscarded.AudioAttributesCompatParcelizer.content_view_big);
        read(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getRead());
        AudioAttributesCompatParcelizer(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getMediaBrowserCompatItemReceiver(), mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getR8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw(), mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getAudioAttributesImplApi21Parcelizer());
    }

    private final void read(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        read().setTextViewText(onUpstreamDiscarded.AudioAttributesCompatParcelizer.msg, Html.fromHtml(str, 0));
    }
}
