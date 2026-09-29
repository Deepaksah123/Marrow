package kotlin;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class getAdGroupIndexForPositionUs {
    public static PendingIntent IconCompatParcelizer(Bundle bundle, Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return write(bundle, context);
        }
        Intent intent = new Intent(context, (Class<?>) toBundleWithOneWindowOnly.class);
        intent.putExtras(bundle);
        intent.removeExtra("wzrk_acts");
        return PendingIntent.getBroadcast(context, new Random().nextInt(), intent, 201326592);
    }

    public static PendingIntent write(Bundle bundle, Context context) {
        Intent launchIntentForPackage;
        if (bundle.containsKey("wzrk_dl") && bundle.getString("wzrk_dl") != null) {
            launchIntentForPackage = new Intent("android.intent.action.VIEW", Uri.parse(bundle.getString("wzrk_dl")));
            RendererCapabilitiesListener.RemoteActionCompatParcelizer(context, launchIntentForPackage);
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                return null;
            }
        }
        launchIntentForPackage.setFlags(872415232);
        launchIntentForPackage.putExtras(bundle);
        launchIntentForPackage.removeExtra("wzrk_acts");
        return PendingIntent.getActivity(context, new Random().nextInt(), launchIntentForPackage, 201326592, null);
    }
}
