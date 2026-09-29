package kotlin;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;

/* JADX INFO: loaded from: classes2.dex */
public final class getPercent extends PlaybackException {
    private Bundle AudioAttributesCompatParcelizer;
    private MediaSourceListForwardingEventListenerExternalSyntheticLambda4 IconCompatParcelizer;
    private MediaSourceListMediaSourceAndListener RemoteActionCompatParcelizer;
    private MediaSourceListMediaSourceAndListener read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getPercent(MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4, Bundle bundle) {
        super(mediaSourceListForwardingEventListenerExternalSyntheticLambda4);
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        this.IconCompatParcelizer = mediaSourceListForwardingEventListenerExternalSyntheticLambda4;
        this.AudioAttributesCompatParcelizer = bundle;
    }

    private void read(MediaSourceListMediaSourceAndListener mediaSourceListMediaSourceAndListener) {
        toMagicModuleMetaRepoModel.write(mediaSourceListMediaSourceAndListener, "");
        this.RemoteActionCompatParcelizer = mediaSourceListMediaSourceAndListener;
    }

    public final MediaSourceListMediaSourceAndListener RemoteActionCompatParcelizer() {
        MediaSourceListMediaSourceAndListener mediaSourceListMediaSourceAndListener = this.RemoteActionCompatParcelizer;
        if (mediaSourceListMediaSourceAndListener != null) {
            return mediaSourceListMediaSourceAndListener;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    private void RemoteActionCompatParcelizer(MediaSourceListMediaSourceAndListener mediaSourceListMediaSourceAndListener) {
        toMagicModuleMetaRepoModel.write(mediaSourceListMediaSourceAndListener, "");
        this.read = mediaSourceListMediaSourceAndListener;
    }

    public final MediaSourceListMediaSourceAndListener AudioAttributesCompatParcelizer() {
        MediaSourceListMediaSourceAndListener mediaSourceListMediaSourceAndListener = this.read;
        if (mediaSourceListMediaSourceAndListener != null) {
            return mediaSourceListMediaSourceAndListener;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    @Override // kotlin.PlaybackException
    protected final RemoteViews AudioAttributesCompatParcelizer(Context context, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        read(new MetadataRetrieverMetadataRetrieverInternalMediaSourceHandlerCallbackMediaSourceCaller(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4, this.AudioAttributesCompatParcelizer));
        return RemoteActionCompatParcelizer().read();
    }

    @Override // kotlin.PlaybackException
    protected final RemoteViews read(Context context, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        RemoteActionCompatParcelizer(new MetadataRetrieverMetadataRetrieverInternalMediaSourceHandlerCallbackMediaSourceCallerMediaPeriodCallback(context, mediaSourceListForwardingEventListenerExternalSyntheticLambda4, this.AudioAttributesCompatParcelizer));
        return AudioAttributesCompatParcelizer().read();
    }

    @Override // kotlin.PlaybackException
    protected final PendingIntent AudioAttributesCompatParcelizer(Context context, Bundle bundle, int i) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        return MetadataRetrieverMetadataRetrieverInternal.IconCompatParcelizer(context, i, bundle, true, 13, this.IconCompatParcelizer);
    }

    @Override // kotlin.PlaybackException
    protected final PendingIntent write(Context context, Bundle bundle, int i) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        return null;
    }
}
