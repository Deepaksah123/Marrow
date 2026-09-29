package kotlin;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import kotlin._coercedTypeDesc;

/* JADX INFO: loaded from: classes2.dex */
public final class createThrowable extends PlaybackException {
    private final r8lambdaO1AKYYBs0J_c1Ii_0sR8NCl4HfI AudioAttributesCompatParcelizer;
    private Bundle IconCompatParcelizer;
    private MediaSourceListForwardingEventListenerExternalSyntheticLambda4 read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public createThrowable(MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4, Bundle bundle) {
        super(mediaSourceListForwardingEventListenerExternalSyntheticLambda4);
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        this.read = mediaSourceListForwardingEventListenerExternalSyntheticLambda4;
        this.IconCompatParcelizer = bundle;
        this.AudioAttributesCompatParcelizer = new r8lambdaO1AKYYBs0J_c1Ii_0sR8NCl4HfI(mediaSourceListForwardingEventListenerExternalSyntheticLambda4);
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
        return new MetadataRetriever1(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4, this.IconCompatParcelizer).read();
    }

    @Override // kotlin.PlaybackException
    protected final PendingIntent AudioAttributesCompatParcelizer(Context context, Bundle bundle, int i) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        String string = bundle.getString("extras_from");
        if (string == null || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) string, (Object) "PTReceiver")) {
            return MetadataRetrieverMetadataRetrieverInternal.IconCompatParcelizer(context, i, bundle, true, 3, this.read);
        }
        return MetadataRetrieverMetadataRetrieverInternal.IconCompatParcelizer(context, i, bundle, true, 3, null);
    }

    @Override // kotlin.PlaybackException
    protected final PendingIntent write(Context context, Bundle bundle, int i) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        return MetadataRetrieverMetadataRetrieverInternal.IconCompatParcelizer(context, i, bundle, false, 6, this.read);
    }

    @Override // kotlin.PlaybackException
    public final _coercedTypeDesc.AudioAttributesImplBaseParcelizer AudioAttributesCompatParcelizer(Context context, Bundle bundle, int i, _coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        toMagicModuleMetaRepoModel.write(audioAttributesImplBaseParcelizer, "");
        return this.AudioAttributesCompatParcelizer.read(context, bundle, i, super.AudioAttributesCompatParcelizer(context, bundle, i, audioAttributesImplBaseParcelizer), false);
    }
}
