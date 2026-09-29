package kotlin;

import android.R;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import kotlin._coercedTypeDesc;
import kotlin._findNullProvider;

/* JADX INFO: loaded from: classes2.dex */
public final class createForUnsupportedContainerFeature extends PlaybackException {
    private final r8lambdaO1AKYYBs0J_c1Ii_0sR8NCl4HfI RemoteActionCompatParcelizer;
    private MediaSourceListForwardingEventListenerExternalSyntheticLambda4 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public createForUnsupportedContainerFeature(MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4) {
        super(mediaSourceListForwardingEventListenerExternalSyntheticLambda4);
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        this.write = mediaSourceListForwardingEventListenerExternalSyntheticLambda4;
        this.RemoteActionCompatParcelizer = new r8lambdaO1AKYYBs0J_c1Ii_0sR8NCl4HfI(mediaSourceListForwardingEventListenerExternalSyntheticLambda4);
    }

    @Override // kotlin.PlaybackException
    protected final _coercedTypeDesc.AudioAttributesImplBaseParcelizer IconCompatParcelizer(_coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer, RemoteViews remoteViews, RemoteViews remoteViews2, String str, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        toMagicModuleMetaRepoModel.write(audioAttributesImplBaseParcelizer, "");
        _coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer2 = super.IconCompatParcelizer(audioAttributesImplBaseParcelizer, remoteViews, remoteViews2, str, pendingIntent, pendingIntent2).read((CharSequence) this.write.getRemoteActionCompatParcelizer());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(audioAttributesImplBaseParcelizer2, "");
        return audioAttributesImplBaseParcelizer2;
    }

    @Override // kotlin.PlaybackException
    public final _coercedTypeDesc.AudioAttributesImplBaseParcelizer AudioAttributesCompatParcelizer(Context context, Bundle bundle, int i, _coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        toMagicModuleMetaRepoModel.write(audioAttributesImplBaseParcelizer, "");
        _coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.write.getMediaBrowserCompatItemReceiver(), context, this.RemoteActionCompatParcelizer.read(context, bundle, i, super.AudioAttributesCompatParcelizer(context, bundle, i, audioAttributesImplBaseParcelizer), true));
        if (this.write.getOnPlayFromSearch() != null) {
            String onPlayFromSearch = this.write.getOnPlayFromSearch();
            toMagicModuleMetaRepoModel.write((Object) onPlayFromSearch);
            if (onPlayFromSearch.length() > 0) {
                _findNullProvider _findnullproviderAudioAttributesCompatParcelizer = new _findNullProvider.read("pt_input_reply").AudioAttributesCompatParcelizer(this.write.getOnPlayFromSearch()).AudioAttributesCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(_findnullproviderAudioAttributesCompatParcelizer, "");
                PendingIntent pendingIntentIconCompatParcelizer = MetadataRetrieverMetadataRetrieverInternal.IconCompatParcelizer(context, i, bundle, false, 32, this.write);
                toMagicModuleMetaRepoModel.write(pendingIntentIconCompatParcelizer);
                _coercedTypeDesc.write writeVarWrite = new _coercedTypeDesc.write.AudioAttributesCompatParcelizer(R.drawable.sym_action_chat, this.write.getOnPlayFromSearch(), pendingIntentIconCompatParcelizer).write(_findnullproviderAudioAttributesCompatParcelizer).read(true).write();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(writeVarWrite, "");
                audioAttributesImplBaseParcelizerRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(writeVarWrite);
            }
        }
        if (this.write.getOnPrepareFromMediaId() != null) {
            String onPrepareFromMediaId = this.write.getOnPrepareFromMediaId();
            toMagicModuleMetaRepoModel.write((Object) onPrepareFromMediaId);
            if (onPrepareFromMediaId.length() > 0) {
                bundle.putString("pt_dismiss_on_click", this.write.getOnPrepareFromMediaId());
            }
        }
        return audioAttributesImplBaseParcelizerRemoteActionCompatParcelizer;
    }

    private final _coercedTypeDesc.AudioAttributesImplBaseParcelizer RemoteActionCompatParcelizer(String str, Context context, _coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer) {
        _coercedTypeDesc.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21ParcelizerAudioAttributesCompatParcelizer;
        if (str != null && TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(str, "http")) {
            try {
                Bitmap bitmap = MediaSourceListForwardingEventListenerExternalSyntheticLambda10.read(str, context);
                if (bitmap == null) {
                    throw new Exception("Failed to fetch big picture!");
                }
                String read = this.write.getRead();
                if (read == null) {
                    read = this.write.getRemoteActionCompatParcelizer();
                }
                audioAttributesImplApi21ParcelizerAudioAttributesCompatParcelizer = new _coercedTypeDesc.read().AudioAttributesCompatParcelizer(read).write(bitmap);
                if (Build.VERSION.SDK_INT >= 31) {
                    audioAttributesImplApi21ParcelizerAudioAttributesCompatParcelizer.read((CharSequence) this.write.getAudioAttributesImplApi21Parcelizer());
                }
            } catch (Throwable unused) {
                audioAttributesImplApi21ParcelizerAudioAttributesCompatParcelizer = new _coercedTypeDesc.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(this.write.getRemoteActionCompatParcelizer());
                onDrmSessionAcquired.read();
            }
        } else {
            audioAttributesImplApi21ParcelizerAudioAttributesCompatParcelizer = new _coercedTypeDesc.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(this.write.getRemoteActionCompatParcelizer());
        }
        audioAttributesImplBaseParcelizer.read(audioAttributesImplApi21ParcelizerAudioAttributesCompatParcelizer);
        return audioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.PlaybackException
    protected final PendingIntent AudioAttributesCompatParcelizer(Context context, Bundle bundle, int i) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        return MetadataRetrieverMetadataRetrieverInternal.IconCompatParcelizer(context, i, bundle, true, 31, this.write);
    }

    @Override // kotlin.PlaybackException
    protected final RemoteViews read(Context context, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        return null;
    }

    @Override // kotlin.PlaybackException
    protected final PendingIntent write(Context context, Bundle bundle, int i) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        return null;
    }

    @Override // kotlin.PlaybackException
    protected final RemoteViews AudioAttributesCompatParcelizer(Context context, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        return null;
    }
}
