package kotlin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public class onLoadCompleted extends toBundleWithOneWindowOnly {
    @Override // kotlin.toBundleWithOneWindowOnly, android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) {
        if (intent.getStringExtra("wzrk_dl") == null) {
            intent.removeExtra("wzrk_dl");
        }
        super.onReceive(context, intent);
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        PlayerTimelineChangeReason playerTimelineChangeReasonWrite = PlayerTimelineChangeReason.write(context, extras.getString("wzrk_acct_id"));
        if (playerTimelineChangeReasonWrite != null) {
            try {
                TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(playerTimelineChangeReasonWrite.MediaBrowserCompatCustomActionResultReceiver().AudioAttributesImplApi26Parcelizer()).read().read("PTPushNotificationReceiver#cleanUpFiles", new Callable<Void>() { // from class: o.onLoadCompleted.1
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // java.util.concurrent.Callable
                    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
                    public Void call() throws Exception {
                        try {
                            MediaSourceListForwardingEventListenerExternalSyntheticLambda10.AudioAttributesCompatParcelizer(context, intent);
                            MediaSourceListForwardingEventListenerExternalSyntheticLambda10.RemoteActionCompatParcelizer(context);
                            return null;
                        } catch (Throwable th) {
                            th.getLocalizedMessage();
                            onDrmSessionAcquired.IconCompatParcelizer();
                            return null;
                        }
                    }
                });
                return;
            } catch (Exception e) {
                e.getLocalizedMessage();
                onDrmSessionAcquired.IconCompatParcelizer();
                return;
            }
        }
        onDrmSessionAcquired.IconCompatParcelizer();
    }
}
