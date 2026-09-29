package kotlin;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import java.util.List;
import java.util.Map;
import kotlin.onUpstreamDiscarded;

/* JADX INFO: loaded from: classes2.dex */
public class MetadataRetriever extends MediaSourceListMediaSourceAndListener {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetadataRetriever(Context context, int i, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4) {
        super(context, i, mediaSourceListForwardingEventListenerExternalSyntheticLambda4);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        read(mediaSourceListForwardingEventListenerExternalSyntheticLambda4.read(), mediaSourceListForwardingEventListenerExternalSyntheticLambda4.write());
    }

    private final void read(List<onDrmSessionReleased> list, Map<String, PendingIntent> map) {
        int i;
        if (Build.VERSION.SDK_INT < 31) {
            int i2 = 0;
            for (onDrmSessionReleased ondrmsessionreleased : IntermediateLoginResponseBody.write((Iterable) list, 2)) {
                if (i2 == 0) {
                    i = onUpstreamDiscarded.AudioAttributesCompatParcelizer.action0;
                } else {
                    i = onUpstreamDiscarded.AudioAttributesCompatParcelizer.action1;
                }
                if (ondrmsessionreleased.RemoteActionCompatParcelizer().length() == 0) {
                    RendererWakeupListener.MediaBrowserCompatItemReceiver();
                } else {
                    read().setTextViewText(i, ondrmsessionreleased.RemoteActionCompatParcelizer());
                    read().setViewVisibility(i, 0);
                    PendingIntent pendingIntent = map.get(ondrmsessionreleased.write());
                    if (pendingIntent != null) {
                        read().setOnClickPendingIntent(i, pendingIntent);
                    }
                    i2++;
                }
            }
        }
    }
}
