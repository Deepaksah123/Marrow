package kotlin;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import kotlin._coercedTypeDesc;

/* JADX INFO: loaded from: classes2.dex */
public final class copyWithEstimatedPosition extends PlaybackException {
    private MediaSourceListForwardingEventListenerExternalSyntheticLambda4 RemoteActionCompatParcelizer;
    private final r8lambdaO1AKYYBs0J_c1Ii_0sR8NCl4HfI read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public copyWithEstimatedPosition(MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4) {
        super(mediaSourceListForwardingEventListenerExternalSyntheticLambda4);
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        this.RemoteActionCompatParcelizer = mediaSourceListForwardingEventListenerExternalSyntheticLambda4;
        this.read = new r8lambdaO1AKYYBs0J_c1Ii_0sR8NCl4HfI(mediaSourceListForwardingEventListenerExternalSyntheticLambda4);
    }

    @Override // kotlin.PlaybackException
    protected final RemoteViews AudioAttributesCompatParcelizer(Context context, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        if (mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getOnPlayFromMediaId() != null && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) mediaSourceListForwardingEventListenerExternalSyntheticLambda4.getOnPlayFromMediaId(), (Object) "text_only")) {
            return new createForMalformedDataOfUnknownType(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4).read();
        }
        return new createForMalformedContainer(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4).read();
    }

    @Override // kotlin.PlaybackException
    protected final RemoteViews read(Context context, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        return new createForManifestWithUnsupportedFeature(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4).read();
    }

    @Override // kotlin.PlaybackException
    protected final PendingIntent AudioAttributesCompatParcelizer(Context context, Bundle bundle, int i) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        return MetadataRetrieverMetadataRetrieverInternal.IconCompatParcelizer(context, i, bundle, true, 29, this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.PlaybackException
    public final _coercedTypeDesc.AudioAttributesImplBaseParcelizer AudioAttributesCompatParcelizer(Context context, Bundle bundle, int i, _coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        toMagicModuleMetaRepoModel.write(audioAttributesImplBaseParcelizer, "");
        return this.read.read(context, bundle, i, super.AudioAttributesCompatParcelizer(context, bundle, i, audioAttributesImplBaseParcelizer), false);
    }

    @Override // kotlin.PlaybackException
    protected final PendingIntent write(Context context, Bundle bundle, int i) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        return null;
    }
}
