package kotlin;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.view.KeyEvent;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class expectMapFormat extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Objects.toString(intent);
            return;
        }
        ComponentName componentNameIconCompatParcelizer = IconCompatParcelizer(context, "android.intent.action.MEDIA_BUTTON");
        if (componentNameIconCompatParcelizer != null) {
            intent.setComponent(componentNameIconCompatParcelizer);
            try {
                _isNaN.startForegroundService(context, intent);
                return;
            } catch (IllegalStateException e) {
                if (Build.VERSION.SDK_INT >= 31 && RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(e)) {
                    cG_(RemoteActionCompatParcelizer.cH_(e));
                    return;
                }
                throw e;
            }
        }
        ComponentName componentNameIconCompatParcelizer2 = IconCompatParcelizer(context, "android.media.browse.MediaBrowserService");
        if (componentNameIconCompatParcelizer2 != null) {
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(applicationContext, intent, pendingResultGoAsync);
            MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, componentNameIconCompatParcelizer2, iconCompatParcelizer, null);
            iconCompatParcelizer.read(mediaBrowserCompat);
            mediaBrowserCompat.write();
            return;
        }
        throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
    }

    private static void cG_(ForegroundServiceStartNotAllowedException foregroundServiceStartNotAllowedException) {
        foregroundServiceStartNotAllowedException.getMessage();
    }

    static class IconCompatParcelizer extends MediaBrowserCompat.IconCompatParcelizer {
        private final Intent AudioAttributesCompatParcelizer;
        private final BroadcastReceiver.PendingResult AudioAttributesImplApi26Parcelizer;
        private MediaBrowserCompat IconCompatParcelizer;
        private final Context write;

        IconCompatParcelizer(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.write = context;
            this.AudioAttributesCompatParcelizer = intent;
            this.AudioAttributesImplApi26Parcelizer = pendingResult;
        }

        final void read(MediaBrowserCompat mediaBrowserCompat) {
            this.IconCompatParcelizer = mediaBrowserCompat;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.IconCompatParcelizer
        public final void RemoteActionCompatParcelizer() {
            new MediaControllerCompat(this.write, this.IconCompatParcelizer.RemoteActionCompatParcelizer()).IconCompatParcelizer((KeyEvent) this.AudioAttributesCompatParcelizer.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            AudioAttributesCompatParcelizer();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.IconCompatParcelizer
        public final void write() {
            AudioAttributesCompatParcelizer();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.IconCompatParcelizer
        public final void IconCompatParcelizer() {
            AudioAttributesCompatParcelizer();
        }

        private void AudioAttributesCompatParcelizer() {
            this.IconCompatParcelizer.IconCompatParcelizer();
            this.AudioAttributesImplApi26Parcelizer.finish();
        }
    }

    public static ComponentName IconCompatParcelizer(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers.size() == 1) {
            ResolveInfo resolveInfo = listQueryBroadcastReceivers.get(0);
            return new ComponentName(((PackageItemInfo) resolveInfo.activityInfo).packageName, ((PackageItemInfo) resolveInfo.activityInfo).name);
        }
        listQueryBroadcastReceivers.size();
        return null;
    }

    private static ComponentName IconCompatParcelizer(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ResolveInfo resolveInfo = listQueryIntentServices.get(0);
            return new ComponentName(((PackageItemInfo) resolveInfo.serviceInfo).packageName, ((PackageItemInfo) resolveInfo.serviceInfo).name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder("Expected 1 service that handles ");
        sb.append(str);
        sb.append(", found ");
        sb.append(listQueryIntentServices.size());
        throw new IllegalStateException(sb.toString());
    }

    static final class RemoteActionCompatParcelizer {
        public static boolean AudioAttributesCompatParcelizer(IllegalStateException illegalStateException) {
            return illegalStateException instanceof ForegroundServiceStartNotAllowedException;
        }

        public static ForegroundServiceStartNotAllowedException cH_(IllegalStateException illegalStateException) {
            return (ForegroundServiceStartNotAllowedException) illegalStateException;
        }
    }
}
