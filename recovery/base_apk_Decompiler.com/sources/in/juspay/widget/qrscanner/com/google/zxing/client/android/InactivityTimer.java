package in.juspay.widget.qrscanner.com.google.zxing.client.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: loaded from: classes5.dex */
public final class InactivityTimer {
    private final Context a;
    private Runnable e;
    private boolean f;
    private boolean c = false;
    private final BroadcastReceiver b = new PowerStatusReceiver();
    private Handler d = new Handler();

    final class PowerStatusReceiver extends BroadcastReceiver {
        private PowerStatusReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                final boolean z = intent.getIntExtra("plugged", -1) <= 0;
                InactivityTimer.this.d.post(new Runnable() { // from class: in.juspay.widget.qrscanner.com.google.zxing.client.android.InactivityTimer.PowerStatusReceiver.1
                    @Override // java.lang.Runnable
                    public void run() {
                        InactivityTimer.this.a(z);
                    }
                });
            }
        }
    }

    public InactivityTimer(Context context, Runnable runnable) {
        this.a = context;
        this.e = runnable;
    }

    private void a() {
        this.d.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        this.f = z;
        if (this.c) {
            activity();
        }
    }

    private void b() {
        if (this.c) {
            return;
        }
        this.a.registerReceiver(this.b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.c = true;
    }

    private void c() {
        if (this.c) {
            this.a.unregisterReceiver(this.b);
            this.c = false;
        }
    }

    public final void activity() {
        a();
        if (this.f) {
            this.d.postDelayed(this.e, 300000L);
        }
    }

    public final void cancel() {
        a();
        c();
    }

    public final void start() {
        b();
        activity();
    }
}
