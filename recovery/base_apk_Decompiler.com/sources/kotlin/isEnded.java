package kotlin;

import android.content.Context;
import kotlin.Metadata;
import kotlin.onUpstreamDiscarded;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/isEnded;", "Lo/MediaSourceListMediaSourceAndListener;", "Landroid/content/Context;", "p0", "Lo/MediaSourceListForwardingEventListenerExternalSyntheticLambda4;", "p1", "", "p2", "<init>", "(Landroid/content/Context;Lo/MediaSourceListForwardingEventListenerExternalSyntheticLambda4;I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class isEnded extends MediaSourceListMediaSourceAndListener {
    public /* synthetic */ isEnded(Context context, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4, (i2 & 4) != 0 ? onUpstreamDiscarded.RemoteActionCompatParcelizer.content_view_small_single_line_msg : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isEnded(Context context, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4, int i) {
        super(context, i, mediaSourceListForwardingEventListenerExternalSyntheticLambda4);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        IconCompatParcelizer();
        write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getIconCompatParcelizer());
        RemoteActionCompatParcelizer(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getRemoteActionCompatParcelizer());
        read(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getOnCustomAction(), onUpstreamDiscarded.AudioAttributesCompatParcelizer.content_view_small);
        RemoteActionCompatParcelizer(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getAudioAttributesImplBaseParcelizer(), onUpstreamDiscarded.AudioAttributesCompatParcelizer.title);
        RemoteActionCompatParcelizer(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getMediaBrowserCompatCustomActionResultReceiver(), onUpstreamDiscarded.AudioAttributesCompatParcelizer.msg);
        AudioAttributesCompatParcelizer();
        AudioAttributesCompatParcelizer(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getAudioAttributesImplApi26Parcelizer());
    }
}
