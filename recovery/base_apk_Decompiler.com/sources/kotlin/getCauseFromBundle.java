package kotlin;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import kotlin._coercedTypeDesc;

/* JADX INFO: loaded from: classes2.dex */
public final class getCauseFromBundle extends PlaybackException {
    private Bundle AudioAttributesCompatParcelizer;
    private final r8lambdaO1AKYYBs0J_c1Ii_0sR8NCl4HfI RemoteActionCompatParcelizer;
    private MediaSourceListForwardingEventListenerExternalSyntheticLambda4 read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getCauseFromBundle(MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4, Bundle bundle) {
        super(mediaSourceListForwardingEventListenerExternalSyntheticLambda4);
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        this.read = mediaSourceListForwardingEventListenerExternalSyntheticLambda4;
        this.AudioAttributesCompatParcelizer = bundle;
        this.RemoteActionCompatParcelizer = new r8lambdaO1AKYYBs0J_c1Ii_0sR8NCl4HfI(mediaSourceListForwardingEventListenerExternalSyntheticLambda4);
    }

    @Override // kotlin.PlaybackException
    protected final RemoteViews AudioAttributesCompatParcelizer(Context context, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        if (RemoteActionCompatParcelizer() == null) {
            return null;
        }
        return new ParserException(context, RemoteActionCompatParcelizer(), mediaSourceListForwardingEventListenerExternalSyntheticLambda4, 0, 8, null).read();
    }

    @Override // kotlin.PlaybackException
    protected final RemoteViews read(Context context, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        if (RemoteActionCompatParcelizer() == null) {
            return null;
        }
        return new supportsFormat(context, RemoteActionCompatParcelizer(), mediaSourceListForwardingEventListenerExternalSyntheticLambda4).read();
    }

    @Override // kotlin.PlaybackException
    protected final PendingIntent AudioAttributesCompatParcelizer(Context context, Bundle bundle, int i) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        return MetadataRetrieverMetadataRetrieverInternal.IconCompatParcelizer(context, i, bundle, true, 30, this.read);
    }

    @Override // kotlin.PlaybackException
    public final _coercedTypeDesc.AudioAttributesImplBaseParcelizer AudioAttributesCompatParcelizer(Context context, Bundle bundle, int i, _coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        toMagicModuleMetaRepoModel.write(audioAttributesImplBaseParcelizer, "");
        return this.RemoteActionCompatParcelizer.read(context, bundle, i, super.AudioAttributesCompatParcelizer(context, bundle, i, audioAttributesImplBaseParcelizer), false);
    }

    private final Integer RemoteActionCompatParcelizer() {
        if (this.read.getOnFastForward() != -1 && this.read.getOnFastForward() >= 10) {
            return Integer.valueOf((this.read.getOnFastForward() * 1000) + 1000);
        }
        if (this.read.getOnPlayFromUri() >= 10) {
            return Integer.valueOf((this.read.getOnPlayFromUri() * 1000) + 1000);
        }
        onDrmSessionAcquired.RemoteActionCompatParcelizer();
        return null;
    }

    @Override // kotlin.PlaybackException
    protected final PendingIntent write(Context context, Bundle bundle, int i) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        return null;
    }
}
