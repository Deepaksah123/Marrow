package kotlin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated(since = "4.3.0")
public class toBundleWithOneWindowOnly extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intent launchIntentForPackage;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                if (extras.containsKey("wzrk_dl")) {
                    launchIntentForPackage = new Intent("android.intent.action.VIEW", Uri.parse(intent.getStringExtra("wzrk_dl")));
                    RendererCapabilitiesListener.RemoteActionCompatParcelizer(context, launchIntentForPackage);
                } else {
                    launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                    if (launchIntentForPackage == null) {
                        return;
                    }
                }
                PlayerTimelineChangeReason.read(context, extras);
                launchIntentForPackage.setFlags(872415232);
                launchIntentForPackage.putExtras(extras);
                launchIntentForPackage.putExtra("wzrk_from", "CTPushNotificationReceiver");
                if (extras.containsKey("close_system_dialogs") && extras.getBoolean("close_system_dialogs")) {
                    context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                }
                context.startActivity(launchIntentForPackage);
                extras.toString();
                RendererWakeupListener.MediaBrowserCompatItemReceiver();
            }
        } catch (Throwable unused) {
            RendererWakeupListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
    }
}
