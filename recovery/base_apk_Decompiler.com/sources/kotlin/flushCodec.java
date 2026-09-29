package kotlin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
final class flushCodec implements Runnable {
    private final long AudioAttributesCompatParcelizer;
    private final PowerManager.WakeLock IconCompatParcelizer;
    private ExecutorService read = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
    private final needsDisableAdaptationWorkaround write;

    public flushCodec(needsDisableAdaptationWorkaround needsdisableadaptationworkaround, long j) {
        this.write = needsdisableadaptationworkaround;
        this.AudioAttributesCompatParcelizer = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) IconCompatParcelizer().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.IconCompatParcelizer = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (drainAndFlushCodec.write().IconCompatParcelizer(IconCompatParcelizer())) {
            this.IconCompatParcelizer.acquire();
        }
        try {
            try {
                this.write.RemoteActionCompatParcelizer(true);
                if (!this.write.MediaBrowserCompatCustomActionResultReceiver()) {
                    this.write.RemoteActionCompatParcelizer(false);
                    if (!drainAndFlushCodec.write().IconCompatParcelizer(IconCompatParcelizer())) {
                        return;
                    }
                } else if (!drainAndFlushCodec.write().write(IconCompatParcelizer()) || write()) {
                    if (AudioAttributesCompatParcelizer()) {
                        this.write.RemoteActionCompatParcelizer(false);
                    } else {
                        this.write.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
                    }
                    if (!drainAndFlushCodec.write().IconCompatParcelizer(IconCompatParcelizer())) {
                        return;
                    }
                } else {
                    new write(this).AudioAttributesCompatParcelizer();
                    if (!drainAndFlushCodec.write().IconCompatParcelizer(IconCompatParcelizer())) {
                        return;
                    }
                }
                this.IconCompatParcelizer.release();
            } catch (IOException e) {
                e.getMessage();
                this.write.RemoteActionCompatParcelizer(false);
                if (drainAndFlushCodec.write().IconCompatParcelizer(IconCompatParcelizer())) {
                    this.IconCompatParcelizer.release();
                }
            }
        } catch (Throwable th) {
            if (drainAndFlushCodec.write().IconCompatParcelizer(IconCompatParcelizer())) {
                this.IconCompatParcelizer.release();
            }
            throw th;
        }
    }

    private boolean AudioAttributesCompatParcelizer() throws IOException {
        try {
            return this.write.AudioAttributesCompatParcelizer() != null;
        } catch (IOException e) {
            if (isVideoSizeAndRateSupportedV21.RemoteActionCompatParcelizer(e.getMessage())) {
                e.getMessage();
                return false;
            }
            if (e.getMessage() == null) {
                return false;
            }
            throw e;
        } catch (SecurityException unused) {
            return false;
        }
    }

    final Context IconCompatParcelizer() {
        return this.write.write();
    }

    final boolean write() {
        ConnectivityManager connectivityManager = (ConnectivityManager) IconCompatParcelizer().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    static class write extends BroadcastReceiver {
        private flushCodec IconCompatParcelizer;

        public write(flushCodec flushcodec) {
            this.IconCompatParcelizer = flushcodec;
        }

        public final void AudioAttributesCompatParcelizer() {
            flushCodec.RemoteActionCompatParcelizer();
            this.IconCompatParcelizer.IconCompatParcelizer().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            flushCodec flushcodec = this.IconCompatParcelizer;
            if (flushcodec == null || !flushcodec.write()) {
                return;
            }
            flushCodec.RemoteActionCompatParcelizer();
            needsDisableAdaptationWorkaround unused = this.IconCompatParcelizer.write;
            needsDisableAdaptationWorkaround.IconCompatParcelizer(this.IconCompatParcelizer, 0L);
            this.IconCompatParcelizer.IconCompatParcelizer().unregisterReceiver(this);
            this.IconCompatParcelizer = null;
        }
    }

    static boolean RemoteActionCompatParcelizer() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }
}
