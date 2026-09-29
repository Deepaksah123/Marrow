package kotlin;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import kotlin.BundleListRetriever;

/* JADX INFO: loaded from: classes2.dex */
public class BundleableCreator extends trimByVisibility implements BundleListRetriever.read {
    private static final String RemoteActionCompatParcelizer = n.write("SystemFgService");
    private NotificationManager AudioAttributesCompatParcelizer;
    private BundleListRetriever read;
    private boolean write;

    @Override // kotlin.trimByVisibility, android.app.Service
    public void onCreate() {
        super.onCreate();
        write();
    }

    @Override // kotlin.trimByVisibility, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.write) {
            n.write();
            this.read.RemoteActionCompatParcelizer();
            write();
            this.write = false;
        }
        if (intent == null) {
            return 3;
        }
        this.read.AudioAttributesCompatParcelizer(intent, i2);
        return 3;
    }

    @Override // kotlin.trimByVisibility, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.read.RemoteActionCompatParcelizer();
    }

    private void write() {
        this.AudioAttributesCompatParcelizer = (NotificationManager) getApplicationContext().getSystemService("notification");
        BundleListRetriever bundleListRetriever = new BundleListRetriever(getApplicationContext());
        this.read = bundleListRetriever;
        bundleListRetriever.IconCompatParcelizer(this);
    }

    @Override // o.BundleListRetriever.read
    public final void RemoteActionCompatParcelizer(int i) {
        this.write = true;
        n.write();
        stopForeground(true);
        stopSelf(i);
    }

    @Override // android.app.Service
    public void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.read.AudioAttributesCompatParcelizer(i, 2048);
    }

    public void onTimeout(int i, int i2) {
        this.read.AudioAttributesCompatParcelizer(i, i2);
    }

    @Override // o.BundleListRetriever.read
    public final void write(int i, int i2, Notification notification) {
        if (Build.VERSION.SDK_INT >= 31) {
            write.write(this, i, notification, i2);
        } else {
            RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this, i, notification, i2);
        }
    }

    @Override // o.BundleListRetriever.read
    public final void RemoteActionCompatParcelizer(int i, Notification notification) {
        this.AudioAttributesCompatParcelizer.notify(i, notification);
    }

    @Override // o.BundleListRetriever.read
    public final void read(int i) {
        this.AudioAttributesCompatParcelizer.cancel(i);
    }

    @Override // kotlin.trimByVisibility, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    static class RemoteActionCompatParcelizer {
        static void RemoteActionCompatParcelizer(Service service, int i, Notification notification, int i2) {
            service.startForeground(i, notification, i2);
        }
    }

    static class write {
        static void write(Service service, int i, Notification notification, int i2) {
            try {
                service.startForeground(i, notification, i2);
            } catch (ForegroundServiceStartNotAllowedException unused) {
                n.write();
                String unused2 = BundleableCreator.RemoteActionCompatParcelizer;
            } catch (SecurityException unused3) {
                n.write();
                String unused4 = BundleableCreator.RemoteActionCompatParcelizer;
            }
        }
    }
}
