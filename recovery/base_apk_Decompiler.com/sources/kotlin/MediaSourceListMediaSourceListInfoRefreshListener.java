package kotlin;

import android.content.Context;
import android.text.Html;
import kotlin.Metadata;
import kotlin.onUpstreamDiscarded;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/MediaSourceListMediaSourceListInfoRefreshListener;", "Lo/MetadataRetriever;", "Landroid/content/Context;", "p0", "Lo/MediaSourceListForwardingEventListenerExternalSyntheticLambda4;", "p1", "", "p2", "<init>", "(Landroid/content/Context;Lo/MediaSourceListForwardingEventListenerExternalSyntheticLambda4;I)V", "", "", "read", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class MediaSourceListMediaSourceListInfoRefreshListener extends MetadataRetriever {
    public /* synthetic */ MediaSourceListMediaSourceListInfoRefreshListener(Context context, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4, (i2 & 4) != 0 ? onUpstreamDiscarded.RemoteActionCompatParcelizer.image_only_big : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaSourceListMediaSourceListInfoRefreshListener(Context context, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4, int i) {
        super(context, i, mediaSourceListForwardingEventListenerExternalSyntheticLambda4);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        IconCompatParcelizer();
        write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getIconCompatParcelizer());
        RemoteActionCompatParcelizer(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getRemoteActionCompatParcelizer());
        read(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getOnCustomAction(), onUpstreamDiscarded.AudioAttributesCompatParcelizer.content_view_big);
        RemoteActionCompatParcelizer(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getAudioAttributesImplBaseParcelizer(), onUpstreamDiscarded.AudioAttributesCompatParcelizer.title);
        RemoteActionCompatParcelizer(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getMediaBrowserCompatCustomActionResultReceiver(), onUpstreamDiscarded.AudioAttributesCompatParcelizer.msg);
        read(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getRead());
        AudioAttributesCompatParcelizer();
        AudioAttributesCompatParcelizer(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getMediaBrowserCompatItemReceiver(), mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getR8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw(), mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getAudioAttributesImplApi21Parcelizer());
        AudioAttributesCompatParcelizer(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getAudioAttributesImplApi26Parcelizer());
    }

    private final void read(String p0) {
        if (onLoadStarted.read(p0)) {
            read().setTextViewText(onUpstreamDiscarded.AudioAttributesCompatParcelizer.msg, Html.fromHtml(p0, 0));
        }
    }
}
