package kotlin;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.RemoteViews;
import kotlin._coercedTypeDesc;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PlaybackException {
    private MediaSourceListForwardingEventListenerExternalSyntheticLambda4 write;

    protected abstract PendingIntent AudioAttributesCompatParcelizer(Context context, Bundle bundle, int i);

    protected abstract RemoteViews AudioAttributesCompatParcelizer(Context context, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4);

    protected abstract RemoteViews read(Context context, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4);

    protected abstract PendingIntent write(Context context, Bundle bundle, int i);

    public PlaybackException(MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4) {
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        this.write = mediaSourceListForwardingEventListenerExternalSyntheticLambda4;
    }

    protected _coercedTypeDesc.AudioAttributesImplBaseParcelizer IconCompatParcelizer(_coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer, RemoteViews remoteViews, RemoteViews remoteViews2, String str, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        toMagicModuleMetaRepoModel.write(audioAttributesImplBaseParcelizer, "");
        if (pendingIntent2 != null) {
            audioAttributesImplBaseParcelizer.IconCompatParcelizer(pendingIntent2);
        }
        if (remoteViews != null) {
            audioAttributesImplBaseParcelizer.IconCompatParcelizer(remoteViews);
        }
        if (remoteViews2 != null) {
            audioAttributesImplBaseParcelizer.write(remoteViews2);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            audioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer(this.write.getPlaybackStateCompat());
        }
        _coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizerRemoteActionCompatParcelizer = audioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver(this.write.getOnPause()).RemoteActionCompatParcelizer(Html.fromHtml(str)).read(pendingIntent).write(new long[]{0}).RemoteActionCompatParcelizer(System.currentTimeMillis());
        String onSetCaptioningEnabled = this.write.getOnSetCaptioningEnabled();
        if (onSetCaptioningEnabled == null) {
            onSetCaptioningEnabled = "#A6A6A6";
        }
        _coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer2 = audioAttributesImplBaseParcelizerRemoteActionCompatParcelizer.IconCompatParcelizer(Color.parseColor(onSetCaptioningEnabled)).RemoteActionCompatParcelizer(true).read(Build.VERSION.SDK_INT >= 31 ? new _coercedTypeDesc.MediaBrowserCompatCustomActionResultReceiver() : null);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(audioAttributesImplBaseParcelizer2, "");
        return audioAttributesImplBaseParcelizer2;
    }

    public _coercedTypeDesc.AudioAttributesImplBaseParcelizer AudioAttributesCompatParcelizer(Context context, Bundle bundle, int i, _coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        toMagicModuleMetaRepoModel.write(audioAttributesImplBaseParcelizer, "");
        return IconCompatParcelizer(audioAttributesImplBaseParcelizer, AudioAttributesCompatParcelizer(context, this.write), read(context, this.write), this.write.getIconCompatParcelizer(), AudioAttributesCompatParcelizer(context, bundle, i), write(context, bundle, i));
    }
}
