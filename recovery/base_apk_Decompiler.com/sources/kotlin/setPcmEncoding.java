package kotlin;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import java.util.List;
import kotlin.getSeekPoints;

/* JADX INFO: loaded from: classes2.dex */
public final class setPcmEncoding extends InstallReferrerClient {
    private ServiceConnection IconCompatParcelizer;
    private final Context RemoteActionCompatParcelizer;
    private int read = 0;
    private getSeekPoints write;

    public setPcmEncoding(Context context) {
        this.RemoteActionCompatParcelizer = context.getApplicationContext();
    }

    private boolean write() {
        try {
            return this.RemoteActionCompatParcelizer.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final void IconCompatParcelizer() {
        this.read = 3;
        ServiceConnection serviceConnection = this.IconCompatParcelizer;
        if (serviceConnection != null) {
            this.RemoteActionCompatParcelizer.unbindService(serviceConnection);
            this.IconCompatParcelizer = null;
        }
        this.write = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final void IconCompatParcelizer(InstallReferrerStateListener installReferrerStateListener) {
        byte b = 0;
        if (AudioAttributesCompatParcelizer()) {
            installReferrerStateListener.RemoteActionCompatParcelizer(0);
            return;
        }
        int i = this.read;
        if (i == 1) {
            installReferrerStateListener.RemoteActionCompatParcelizer(3);
            return;
        }
        if (i == 3) {
            installReferrerStateListener.RemoteActionCompatParcelizer(3);
            return;
        }
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> listQueryIntentServices = this.RemoteActionCompatParcelizer.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
            ResolveInfo resolveInfo = listQueryIntentServices.get(0);
            if (resolveInfo.serviceInfo != null) {
                String str = ((PackageItemInfo) resolveInfo.serviceInfo).packageName;
                String str2 = ((PackageItemInfo) resolveInfo.serviceInfo).name;
                if (!"com.android.vending".equals(str) || str2 == null || !write()) {
                    this.read = 0;
                    installReferrerStateListener.RemoteActionCompatParcelizer(2);
                    return;
                }
                Intent intent2 = new Intent(intent);
                IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this, installReferrerStateListener, b);
                this.IconCompatParcelizer = iconCompatParcelizer;
                try {
                    if (this.RemoteActionCompatParcelizer.bindService(intent2, iconCompatParcelizer, 1)) {
                        return;
                    }
                    this.read = 0;
                    installReferrerStateListener.RemoteActionCompatParcelizer(1);
                    return;
                } catch (SecurityException unused) {
                    this.read = 0;
                    installReferrerStateListener.RemoteActionCompatParcelizer(4);
                    return;
                }
            }
        }
        this.read = 0;
        installReferrerStateListener.RemoteActionCompatParcelizer(2);
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public final ReferrerDetails RemoteActionCompatParcelizer() throws RemoteException {
        if (!AudioAttributesCompatParcelizer()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.RemoteActionCompatParcelizer.getPackageName());
        try {
            return new ReferrerDetails(this.write.read(bundle));
        } catch (RemoteException e) {
            this.read = 0;
            throw e;
        }
    }

    final class IconCompatParcelizer implements ServiceConnection {
        private final InstallReferrerStateListener read;

        private IconCompatParcelizer(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.read = installReferrerStateListener;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            setPcmEncoding.this.write = getSeekPoints.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(iBinder);
            setPcmEncoding.this.read = 2;
            this.read.RemoteActionCompatParcelizer(0);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            setPcmEncoding.this.write = null;
            setPcmEncoding.this.read = 0;
            this.read.RemoteActionCompatParcelizer();
        }

        /* synthetic */ IconCompatParcelizer(setPcmEncoding setpcmencoding, InstallReferrerStateListener installReferrerStateListener, byte b) {
            this(installReferrerStateListener);
        }
    }

    private boolean AudioAttributesCompatParcelizer() {
        return (this.read != 2 || this.write == null || this.IconCompatParcelizer == null) ? false : true;
    }
}
