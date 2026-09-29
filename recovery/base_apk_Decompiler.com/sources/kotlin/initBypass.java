package kotlin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
final class initBypass implements Runnable {
    private static final Object AudioAttributesCompatParcelizer = new Object();
    private static Boolean RemoteActionCompatParcelizer;
    private static Boolean write;
    private final drainAndUpdateCodecDrmSessionV23 AudioAttributesImplApi26Parcelizer;
    private final PowerManager.WakeLock AudioAttributesImplBaseParcelizer;
    private final bypassRender IconCompatParcelizer;
    private final long MediaBrowserCompatItemReceiver;
    private final Context read;

    initBypass(drainAndUpdateCodecDrmSessionV23 drainandupdatecodecdrmsessionv23, Context context, bypassRender bypassrender, long j) {
        this.AudioAttributesImplApi26Parcelizer = drainandupdatecodecdrmsessionv23;
        this.read = context;
        this.MediaBrowserCompatItemReceiver = j;
        this.IconCompatParcelizer = bypassrender;
        this.AudioAttributesImplBaseParcelizer = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (IconCompatParcelizer(this.read)) {
            this.AudioAttributesImplBaseParcelizer.acquire(areSizeAndRateSupportedV21.IconCompatParcelizer);
        }
        try {
            try {
                try {
                    this.AudioAttributesImplApi26Parcelizer.write(true);
                    if (!this.IconCompatParcelizer.IconCompatParcelizer()) {
                        this.AudioAttributesImplApi26Parcelizer.write(false);
                        if (IconCompatParcelizer(this.read)) {
                            try {
                                this.AudioAttributesImplBaseParcelizer.release();
                                return;
                            } catch (RuntimeException unused) {
                                return;
                            }
                        }
                        return;
                    }
                    if (AudioAttributesCompatParcelizer(this.read) && !IconCompatParcelizer()) {
                        new RemoteActionCompatParcelizer(this).AudioAttributesCompatParcelizer();
                        if (IconCompatParcelizer(this.read)) {
                            try {
                                this.AudioAttributesImplBaseParcelizer.release();
                                return;
                            } catch (RuntimeException unused2) {
                                return;
                            }
                        }
                        return;
                    }
                    if (this.AudioAttributesImplApi26Parcelizer.read()) {
                        this.AudioAttributesImplApi26Parcelizer.write(false);
                    } else {
                        this.AudioAttributesImplApi26Parcelizer.read(this.MediaBrowserCompatItemReceiver);
                    }
                    if (IconCompatParcelizer(this.read)) {
                        this.AudioAttributesImplBaseParcelizer.release();
                    }
                } catch (IOException e) {
                    e.getMessage();
                    this.AudioAttributesImplApi26Parcelizer.write(false);
                    if (IconCompatParcelizer(this.read)) {
                        this.AudioAttributesImplBaseParcelizer.release();
                    }
                }
            } catch (RuntimeException unused3) {
            }
        } catch (Throwable th) {
            if (IconCompatParcelizer(this.read)) {
                try {
                    this.AudioAttributesImplBaseParcelizer.release();
                } catch (RuntimeException unused4) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean IconCompatParcelizer() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.read     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L20
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L12
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L20
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L1d
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L1d
            r0 = 1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            monitor-exit(r2)
            return r0
        L20:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.initBypass.IconCompatParcelizer():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean AudioAttributesCompatParcelizer() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    private static boolean IconCompatParcelizer(Context context) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        synchronized (AudioAttributesCompatParcelizer) {
            Boolean bool = write;
            if (bool == null) {
                zBooleanValue = read(context, "android.permission.WAKE_LOCK", bool);
            } else {
                zBooleanValue = bool.booleanValue();
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            write = boolValueOf;
            zBooleanValue2 = boolValueOf.booleanValue();
        }
        return zBooleanValue2;
    }

    private static boolean AudioAttributesCompatParcelizer(Context context) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        synchronized (AudioAttributesCompatParcelizer) {
            Boolean bool = RemoteActionCompatParcelizer;
            if (bool == null) {
                zBooleanValue = read(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                zBooleanValue = bool.booleanValue();
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            RemoteActionCompatParcelizer = boolValueOf;
            zBooleanValue2 = boolValueOf.booleanValue();
        }
        return zBooleanValue2;
    }

    private static boolean read(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            write(str);
        }
        return z;
    }

    private static String write(String str) {
        StringBuilder sb = new StringBuilder("Missing Permission: ");
        sb.append(str);
        sb.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        return sb.toString();
    }

    class RemoteActionCompatParcelizer extends BroadcastReceiver {
        private initBypass read;

        public RemoteActionCompatParcelizer(initBypass initbypass) {
            this.read = initbypass;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            synchronized (this) {
                initBypass initbypass = this.read;
                if (initbypass == null) {
                    return;
                }
                if (initbypass.IconCompatParcelizer()) {
                    initBypass.AudioAttributesCompatParcelizer();
                    this.read.AudioAttributesImplApi26Parcelizer.write(this.read, 0L);
                    context.unregisterReceiver(this);
                    this.read = null;
                }
            }
        }

        public final void AudioAttributesCompatParcelizer() {
            initBypass.AudioAttributesCompatParcelizer();
            initBypass.this.read.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }
}
