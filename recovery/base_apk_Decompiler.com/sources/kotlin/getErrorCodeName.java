package kotlin;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;

/* JADX INFO: loaded from: classes2.dex */
public final class getErrorCodeName extends PlaybackException {
    private Bundle AudioAttributesCompatParcelizer;
    private MediaSourceListForwardingEventListenerExternalSyntheticLambda4 RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getErrorCodeName(MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4, Bundle bundle) {
        super(mediaSourceListForwardingEventListenerExternalSyntheticLambda4);
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        this.RemoteActionCompatParcelizer = mediaSourceListForwardingEventListenerExternalSyntheticLambda4;
        this.AudioAttributesCompatParcelizer = bundle;
    }

    @Override // kotlin.PlaybackException
    protected final RemoteViews AudioAttributesCompatParcelizer(Context context, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        return new isEnded(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4, 0, 4, null).read();
    }

    @Override // kotlin.PlaybackException
    protected final RemoteViews read(Context context, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        return new onRendererOffsetChanged(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4, this.AudioAttributesCompatParcelizer).read();
    }

    @Override // kotlin.PlaybackException
    protected final PendingIntent AudioAttributesCompatParcelizer(Context context, Bundle bundle, int i) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        return MetadataRetrieverMetadataRetrieverInternal.IconCompatParcelizer(context, i, bundle, false, 7, this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.PlaybackException
    protected final PendingIntent write(Context context, Bundle bundle, int i) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        return null;
    }
}
