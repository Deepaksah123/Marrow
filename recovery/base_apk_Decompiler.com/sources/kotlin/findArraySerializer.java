package kotlin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
final class findArraySerializer {
    private final read IconCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    private final Context write;

    public interface IconCompatParcelizer {
        void RemoteActionCompatParcelizer();
    }

    public findArraySerializer(Context context, Handler handler, IconCompatParcelizer iconCompatParcelizer) {
        this.write = context.getApplicationContext();
        this.IconCompatParcelizer = new read(handler, iconCompatParcelizer);
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        if (z && !this.RemoteActionCompatParcelizer) {
            this.write.registerReceiver(this.IconCompatParcelizer, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.RemoteActionCompatParcelizer = true;
        } else {
            if (z || !this.RemoteActionCompatParcelizer) {
                return;
            }
            this.write.unregisterReceiver(this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = false;
        }
    }

    final class read extends BroadcastReceiver implements Runnable {
        private final Handler read;
        private final IconCompatParcelizer write;

        public read(Handler handler, IconCompatParcelizer iconCompatParcelizer) {
            this.read = handler;
            this.write = iconCompatParcelizer;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.read.post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (findArraySerializer.this.RemoteActionCompatParcelizer) {
                this.write.RemoteActionCompatParcelizer();
            }
        }
    }
}
