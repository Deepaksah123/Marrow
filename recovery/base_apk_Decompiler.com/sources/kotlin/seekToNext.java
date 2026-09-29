package kotlin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class seekToNext extends BroadcastReceiver {
    static {
        n.write("RescheduleReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        n.write();
        Objects.toString(intent);
        try {
            hasPrevious.read(context).AudioAttributesCompatParcelizer(goAsync());
        } catch (IllegalStateException unused) {
            n.write();
        }
    }
}
