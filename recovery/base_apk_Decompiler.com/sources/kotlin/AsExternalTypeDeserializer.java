package kotlin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class AsExternalTypeDeserializer {
    private static AsExternalTypeDeserializer RemoteActionCompatParcelizer;
    private final Handler write = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList<WeakReference<AudioAttributesCompatParcelizer>> AudioAttributesCompatParcelizer = new CopyOnWriteArrayList<>();
    private final Object read = new Object();
    private int IconCompatParcelizer = 0;

    public interface AudioAttributesCompatParcelizer {
        void IconCompatParcelizer(int i);
    }

    public static AsExternalTypeDeserializer RemoteActionCompatParcelizer(Context context) {
        AsExternalTypeDeserializer asExternalTypeDeserializer;
        synchronized (AsExternalTypeDeserializer.class) {
            if (RemoteActionCompatParcelizer == null) {
                RemoteActionCompatParcelizer = new AsExternalTypeDeserializer(context);
            }
            asExternalTypeDeserializer = RemoteActionCompatParcelizer;
        }
        return asExternalTypeDeserializer;
    }

    private AsExternalTypeDeserializer(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new write(this, (byte) 0), intentFilter);
    }

    public final void read(final AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        write();
        this.AudioAttributesCompatParcelizer.add(new WeakReference<>(audioAttributesCompatParcelizer));
        this.write.post(new Runnable() { // from class: o.AsExistingPropertyTypeSerializer
            @Override // java.lang.Runnable
            public final void run() {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(audioAttributesCompatParcelizer);
            }
        });
    }

    final /* synthetic */ void IconCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        audioAttributesCompatParcelizer.IconCompatParcelizer(read());
    }

    public final int read() {
        int i;
        synchronized (this.read) {
            i = this.IconCompatParcelizer;
        }
        return i;
    }

    private void write() {
        for (WeakReference<AudioAttributesCompatParcelizer> weakReference : this.AudioAttributesCompatParcelizer) {
            if (weakReference.get() == null) {
                this.AudioAttributesCompatParcelizer.remove(weakReference);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(int i) {
        synchronized (this.read) {
            if (this.IconCompatParcelizer == i) {
                return;
            }
            this.IconCompatParcelizer = i;
            for (WeakReference<AudioAttributesCompatParcelizer> weakReference : this.AudioAttributesCompatParcelizer) {
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = weakReference.get();
                if (audioAttributesCompatParcelizer != null) {
                    audioAttributesCompatParcelizer.IconCompatParcelizer(i);
                } else {
                    this.AudioAttributesCompatParcelizer.remove(weakReference);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int IconCompatParcelizer(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return AudioAttributesCompatParcelizer(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i;
    }

    private static int AudioAttributesCompatParcelizer(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 29 ? 9 : 0;
        }
    }

    final class write extends BroadcastReceiver {
        private write() {
        }

        /* synthetic */ write(AsExternalTypeDeserializer asExternalTypeDeserializer, byte b) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int iIconCompatParcelizer = AsExternalTypeDeserializer.IconCompatParcelizer(context);
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 31 || iIconCompatParcelizer != 5) {
                AsExternalTypeDeserializer.this.write(iIconCompatParcelizer);
            } else {
                IconCompatParcelizer.RemoteActionCompatParcelizer(context, AsExternalTypeDeserializer.this);
            }
        }
    }

    static final class IconCompatParcelizer {
        public static void RemoteActionCompatParcelizer(Context context, AsExternalTypeDeserializer asExternalTypeDeserializer) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) buildTypeSerializer.IconCompatParcelizer((TelephonyManager) context.getSystemService("phone"));
                read readVar = new read(asExternalTypeDeserializer);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), readVar);
                telephonyManager.unregisterTelephonyCallback(readVar);
            } catch (RuntimeException unused) {
                asExternalTypeDeserializer.write(5);
            }
        }

        static final class read extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
            private final AsExternalTypeDeserializer RemoteActionCompatParcelizer;

            public read(AsExternalTypeDeserializer asExternalTypeDeserializer) {
                this.RemoteActionCompatParcelizer = asExternalTypeDeserializer;
            }

            @Override // android.telephony.TelephonyCallback.DisplayInfoListener
            public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.RemoteActionCompatParcelizer.write(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }
    }
}
