package kotlin;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;

/* JADX INFO: loaded from: classes2.dex */
public final class createRemoteException extends PlaybackException {
    private MediaSourceListForwardingEventListenerExternalSyntheticLambda4 RemoteActionCompatParcelizer;
    private Bundle write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public createRemoteException(MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4, Bundle bundle) {
        super(mediaSourceListForwardingEventListenerExternalSyntheticLambda4);
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        this.RemoteActionCompatParcelizer = mediaSourceListForwardingEventListenerExternalSyntheticLambda4;
        this.write = bundle;
    }

    @Override // kotlin.PlaybackException
    protected final RemoteViews AudioAttributesCompatParcelizer(Context context, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        return new isReady(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4).read();
    }

    @Override // kotlin.PlaybackException
    protected final RemoteViews read(Context context, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        if (mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getOnSetRepeatMode() != null) {
            String onSetRepeatMode = mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getOnSetRepeatMode();
            toMagicModuleMetaRepoModel.write((Object) onSetRepeatMode);
            if (onSetRepeatMode.length() != 0) {
                return new MetadataRetrieverMetadataRetrieverInternalMediaSourceHandlerCallback(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4, this.write, 0, 8, null).read();
            }
        }
        return new NoSampleRenderer(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4, this.write).read();
    }

    @Override // kotlin.PlaybackException
    protected final PendingIntent AudioAttributesCompatParcelizer(Context context, Bundle bundle, int i) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        return MetadataRetrieverMetadataRetrieverInternal.IconCompatParcelizer(context, i, bundle, true, 20, this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.PlaybackException
    protected final PendingIntent write(Context context, Bundle bundle, int i) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        return MetadataRetrieverMetadataRetrieverInternal.IconCompatParcelizer(context, i, bundle, false, 28, this.RemoteActionCompatParcelizer);
    }
}
