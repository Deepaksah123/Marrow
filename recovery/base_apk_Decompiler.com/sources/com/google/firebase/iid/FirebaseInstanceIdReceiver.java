package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import kotlin.codecNeedsDiscardToSpsWorkaround;
import kotlin.isTunneling;

/* JADX INFO: loaded from: classes5.dex */
public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    private static Intent AudioAttributesCompatParcelizer(String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public final int onMessageReceive(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) Tasks.await(new isTunneling(context).AudioAttributesCompatParcelizer(cloudMessage.getIntent()))).intValue();
        } catch (InterruptedException | ExecutionException unused) {
            return 500;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public final void onNotificationDismissed(Context context, Bundle bundle) {
        Intent intentAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS, bundle);
        if (codecNeedsDiscardToSpsWorkaround.RemoteActionCompatParcelizer(intentAudioAttributesCompatParcelizer)) {
            codecNeedsDiscardToSpsWorkaround.IconCompatParcelizer(intentAudioAttributesCompatParcelizer);
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}
