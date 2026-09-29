package kotlin;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes5.dex */
final class codecNeedsEosFlushWorkaround {
    private static SharedPreferences IconCompatParcelizer(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    static void write(Context context) {
        SharedPreferences.Editor editorEdit = IconCompatParcelizer(context).edit();
        editorEdit.putBoolean("proxy_notification_initialized", true);
        editorEdit.apply();
    }

    static boolean AudioAttributesCompatParcelizer(Context context) {
        return IconCompatParcelizer(context).getBoolean("proxy_notification_initialized", false);
    }
}
