package in.juspay.hypersmshandler;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.widget.Toast;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lin/juspay/hypersmshandler/DeliverReceiver;", "Landroid/content/BroadcastReceiver;", "Lin/juspay/hypersmshandler/JuspayDuiHook;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DeliverReceiver extends BroadcastReceiver implements JuspayDuiHook {
    @Override // in.juspay.hypersmshandler.JuspayDuiHook
    public final void attach(Activity activity) {
        toMagicModuleMetaRepoModel.write(activity, "");
        if (Build.VERSION.SDK_INT >= 33) {
            activity.registerReceiver(this, new IntentFilter("SMS_DELIVERED"), 2);
        } else {
            activity.registerReceiver(this, new IntentFilter("SMS_DELIVERED"));
        }
    }

    @Override // in.juspay.hypersmshandler.JuspayDuiHook
    public final void detach(Activity activity) {
        toMagicModuleMetaRepoModel.write(activity, "");
        activity.unregisterReceiver(this);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(intent, "");
        int resultCode = getResultCode();
        if (resultCode == -1) {
            Toast.makeText(context, "SMS DELIVERED", 0).show();
        } else {
            if (resultCode != 0) {
                return;
            }
            Toast.makeText(context, "SMS NOT DELIVERED", 0).show();
        }
    }

    @Override // in.juspay.hypersmshandler.JuspayDuiHook
    public final String execute(Activity activity, String str, JSONObject jSONObject) {
        toMagicModuleMetaRepoModel.write(activity, "");
        return null;
    }
}
