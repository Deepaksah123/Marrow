package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class AppLocalesMetadataHolderService extends Service {

    static class RemoteActionCompatParcelizer {
        static int AudioAttributesCompatParcelizer() {
            return 512;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    public static ServiceInfo RemoteActionCompatParcelizer(Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer() | 128);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
    }
}
