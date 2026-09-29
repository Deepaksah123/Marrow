package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import kotlin.getChildIndexByWindowIndex;
import kotlin.n;
import kotlin.onServiceDisconnected;

/* JADX INFO: loaded from: classes4.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    static {
        n.write("DiagnosticsRcvr");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        n.write();
        try {
            getChildIndexByWindowIndex.AudioAttributesCompatParcelizer(context).RemoteActionCompatParcelizer(onServiceDisconnected.write(DiagnosticsWorker.class));
        } catch (IllegalStateException unused) {
            n.write();
        }
    }
}
