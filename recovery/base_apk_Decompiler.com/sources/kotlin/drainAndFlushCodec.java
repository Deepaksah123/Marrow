package kotlin;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.wallet.WalletConstants;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public class drainAndFlushCodec {
    private static drainAndFlushCodec RemoteActionCompatParcelizer;
    private String write = null;
    private Boolean AudioAttributesCompatParcelizer = null;
    private Boolean IconCompatParcelizer = null;
    private final Queue<Intent> read = new ArrayDeque();

    public static drainAndFlushCodec write() {
        drainAndFlushCodec drainandflushcodec;
        synchronized (drainAndFlushCodec.class) {
            if (RemoteActionCompatParcelizer == null) {
                RemoteActionCompatParcelizer = new drainAndFlushCodec();
            }
            drainandflushcodec = RemoteActionCompatParcelizer;
        }
        return drainandflushcodec;
    }

    private drainAndFlushCodec() {
    }

    public final Intent IconCompatParcelizer() {
        return this.read.poll();
    }

    public final int AudioAttributesCompatParcelizer(Context context, Intent intent) {
        this.read.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return read(context, intent2);
    }

    private int read(Context context, Intent intent) {
        ComponentName componentNameStartService;
        String strIconCompatParcelizer = IconCompatParcelizer(context, intent);
        if (strIconCompatParcelizer != null) {
            intent.setClassName(context.getPackageName(), strIconCompatParcelizer);
        }
        try {
            if (IconCompatParcelizer(context)) {
                componentNameStartService = isMediaCodecException.RemoteActionCompatParcelizer(context, intent);
            } else {
                componentNameStartService = context.startService(intent);
            }
            if (componentNameStartService == null) {
                return WalletConstants.ERROR_CODE_INVALID_PARAMETERS;
            }
            return -1;
        } catch (IllegalStateException e) {
            e.toString();
            return WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE;
        } catch (SecurityException unused) {
            return 401;
        }
    }

    private String IconCompatParcelizer(Context context, Intent intent) {
        synchronized (this) {
            String str = this.write;
            if (str != null) {
                return str;
            }
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveInfoResolveService != null && resolveInfoResolveService.serviceInfo != null) {
                ServiceInfo serviceInfo = resolveInfoResolveService.serviceInfo;
                if (context.getPackageName().equals(((PackageItemInfo) serviceInfo).packageName) && ((PackageItemInfo) serviceInfo).name != null) {
                    if (((PackageItemInfo) serviceInfo).name.startsWith(".")) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(context.getPackageName());
                        sb.append(((PackageItemInfo) serviceInfo).name);
                        this.write = sb.toString();
                    } else {
                        this.write = ((PackageItemInfo) serviceInfo).name;
                    }
                    return this.write;
                }
                String str2 = ((PackageItemInfo) serviceInfo).packageName;
                String str3 = ((PackageItemInfo) serviceInfo).name;
                return null;
            }
            return null;
        }
    }

    final boolean IconCompatParcelizer(Context context) {
        if (this.AudioAttributesCompatParcelizer == null) {
            this.AudioAttributesCompatParcelizer = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        return this.AudioAttributesCompatParcelizer.booleanValue();
    }

    final boolean write(Context context) {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        return this.IconCompatParcelizer.booleanValue();
    }
}
