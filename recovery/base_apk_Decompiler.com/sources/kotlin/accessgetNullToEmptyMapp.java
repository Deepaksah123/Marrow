package kotlin;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import in.juspay.hypersdk.ota.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class accessgetNullToEmptyMapp {
    private final PackageManager AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private final Context RemoteActionCompatParcelizer;
    private final IconCompatParcelizer read;
    private final ArrayList<accesshasRequiredMarker> write = new ArrayList<>();
    private final BroadcastReceiver AudioAttributesImplBaseParcelizer = new BroadcastReceiver() { // from class: o.accessgetNullToEmptyMapp.4
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            accessgetNullToEmptyMapp.this.AudioAttributesCompatParcelizer();
        }
    };
    private final Runnable MediaBrowserCompatItemReceiver = new Runnable() { // from class: o.accessgetNullToEmptyMapp.5
        @Override // java.lang.Runnable
        public final void run() {
            accessgetNullToEmptyMapp.this.AudioAttributesCompatParcelizer();
        }
    };
    private final Handler IconCompatParcelizer = new Handler();

    public interface IconCompatParcelizer {
        void RemoteActionCompatParcelizer(jacksonObjectMapper jacksonobjectmapper);

        void read(jacksonObjectMapper jacksonobjectmapper);
    }

    public accessgetNullToEmptyMapp(Context context, IconCompatParcelizer iconCompatParcelizer) {
        this.RemoteActionCompatParcelizer = context;
        this.read = iconCompatParcelizer;
        this.AudioAttributesCompatParcelizer = context.getPackageManager();
    }

    public final void IconCompatParcelizer() {
        if (this.AudioAttributesImplApi21Parcelizer) {
            return;
        }
        this.AudioAttributesImplApi21Parcelizer = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
        intentFilter.addDataScheme(Constants.PACKAGE_DIR_NAME);
        this.RemoteActionCompatParcelizer.registerReceiver(this.AudioAttributesImplBaseParcelizer, intentFilter, null, this.IconCompatParcelizer);
        this.IconCompatParcelizer.post(this.MediaBrowserCompatItemReceiver);
    }

    final void AudioAttributesCompatParcelizer() {
        int i;
        if (this.AudioAttributesImplApi21Parcelizer) {
            int i2 = 0;
            Iterator<ResolveInfo> it = this.AudioAttributesCompatParcelizer.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null) {
                    int iWrite = write(((PackageItemInfo) serviceInfo).packageName, ((PackageItemInfo) serviceInfo).name);
                    if (iWrite < 0) {
                        accesshasRequiredMarker accesshasrequiredmarker = new accesshasRequiredMarker(this.RemoteActionCompatParcelizer, new ComponentName(((PackageItemInfo) serviceInfo).packageName, ((PackageItemInfo) serviceInfo).name));
                        accesshasrequiredmarker.MediaBrowserCompatCustomActionResultReceiver();
                        i = i2 + 1;
                        this.write.add(i2, accesshasrequiredmarker);
                        this.read.read(accesshasrequiredmarker);
                    } else if (iWrite >= i2) {
                        accesshasRequiredMarker accesshasrequiredmarker2 = this.write.get(iWrite);
                        accesshasrequiredmarker2.MediaBrowserCompatCustomActionResultReceiver();
                        accesshasrequiredmarker2.AudioAttributesImplBaseParcelizer();
                        i = i2 + 1;
                        Collections.swap(this.write, iWrite, i2);
                    }
                    i2 = i;
                }
            }
            if (i2 < this.write.size()) {
                for (int size = this.write.size() - 1; size >= i2; size--) {
                    accesshasRequiredMarker accesshasrequiredmarker3 = this.write.get(size);
                    this.read.RemoteActionCompatParcelizer(accesshasrequiredmarker3);
                    this.write.remove(accesshasrequiredmarker3);
                    accesshasrequiredmarker3.MediaBrowserCompatItemReceiver();
                }
            }
        }
    }

    private int write(String str, String str2) {
        int size = this.write.size();
        for (int i = 0; i < size; i++) {
            if (this.write.get(i).AudioAttributesCompatParcelizer(str, str2)) {
                return i;
            }
        }
        return -1;
    }
}
