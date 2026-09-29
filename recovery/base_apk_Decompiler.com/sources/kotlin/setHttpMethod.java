package kotlin;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.exoplayer2.C;
import com.marrow.R;
import com.marrow.ui.activities.onboarding.deeplinkroute.DeeplinkProcessorActivity;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import kotlin._coercedTypeDesc;

/* JADX INFO: loaded from: classes5.dex */
public final class setHttpMethod {
    private final HashMap<String, PendingIntent> AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private final Context MediaBrowserCompatItemReceiver;
    private String MediaBrowserCompatMediaItem;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private int MediaDescriptionCompat;
    private String RatingCompat;
    private String RemoteActionCompatParcelizer;
    private final String read;
    private String write;

    public setHttpMethod(Context context, String str, String str2) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.MediaBrowserCompatItemReceiver = context;
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.AudioAttributesCompatParcelizer = new LinkedHashMap();
    }

    public final setHttpMethod RemoteActionCompatParcelizer(String str) {
        this.RatingCompat = str;
        return this;
    }

    public final setHttpMethod read(String str) {
        this.MediaBrowserCompatMediaItem = str;
        return this;
    }

    public final setHttpMethod read(int i) {
        this.AudioAttributesImplApi21Parcelizer = i;
        return this;
    }

    public final setHttpMethod write(boolean z) {
        this.MediaBrowserCompatSearchResultReceiver = z;
        return this;
    }

    public final setHttpMethod read(boolean z) {
        this.MediaBrowserCompatCustomActionResultReceiver = z;
        return this;
    }

    public final setHttpMethod AudioAttributesCompatParcelizer(String str, Intent intent) {
        PendingIntent service;
        toMagicModuleMetaRepoModel.write(str, "");
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 34) {
                intent.setPackage(this.MediaBrowserCompatItemReceiver.getPackageName());
            }
            if (intent.getAction() == null) {
                String upperCase = str.toUpperCase(Locale.ROOT);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
                int i = this.AudioAttributesImplApi26Parcelizer;
                StringBuilder sb = new StringBuilder("ACTION_");
                sb.append(upperCase);
                sb.append("_");
                sb.append(i);
                intent.setAction(sb.toString());
            }
            if (Build.VERSION.SDK_INT >= 31) {
                service = PendingIntent.getService(this.MediaBrowserCompatItemReceiver, intent.hashCode(), intent, 167772160);
            } else {
                service = PendingIntent.getService(this.MediaBrowserCompatItemReceiver, intent.hashCode(), intent, C.BUFFER_FLAG_FIRST_SAMPLE);
            }
        } else {
            service = null;
        }
        this.AudioAttributesCompatParcelizer.put(str, service);
        return this;
    }

    public final setHttpMethod RemoteActionCompatParcelizer(int i, String str, String str2) {
        int i2;
        if (parseDolbyChannelConfiguration.RemoteActionCompatParcelizer("video", str)) {
            i2 = R.drawable.ic_notification_video;
        } else if (parseDolbyChannelConfiguration.RemoteActionCompatParcelizer("qbank", str)) {
            i2 = R.drawable.ic_notification_qbank;
        } else {
            i2 = parseDolbyChannelConfiguration.RemoteActionCompatParcelizer("test", str) ? R.drawable.ic_notification_test : R.drawable.ic_notification_default;
        }
        IconCompatParcelizer(i2);
        this.RemoteActionCompatParcelizer = str2;
        this.write = str;
        this.AudioAttributesImplApi26Parcelizer = i;
        return this;
    }

    public final _coercedTypeDesc.AudioAttributesImplBaseParcelizer RemoteActionCompatParcelizer() throws Throwable {
        PendingIntent activity;
        Intent intent = DeeplinkProcessorActivity.read(this.MediaBrowserCompatItemReceiver, this.write, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
        if (intent == null) {
            activity = null;
        } else if (Build.VERSION.SDK_INT >= 31) {
            activity = PendingIntent.getActivity(this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi26Parcelizer, intent, 167772160);
        } else {
            activity = PendingIntent.getActivity(this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi26Parcelizer, intent, C.BUFFER_FLAG_FIRST_SAMPLE);
        }
        _coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = new _coercedTypeDesc.AudioAttributesImplBaseParcelizer(this.MediaBrowserCompatItemReceiver, this.IconCompatParcelizer);
        NotificationChannel notificationChannel = new NotificationChannel(this.IconCompatParcelizer, this.read, 2);
        notificationChannel.setSound(null, null);
        Object systemService = this.MediaBrowserCompatItemReceiver.getSystemService("notification");
        toMagicModuleMetaRepoModel.read(systemService, "");
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        audioAttributesImplBaseParcelizer.IconCompatParcelizer(_isNaN.getColor(this.MediaBrowserCompatItemReceiver, R.color.colorPrimary)).AudioAttributesCompatParcelizer(true).RemoteActionCompatParcelizer((CharSequence) this.RatingCompat).MediaBrowserCompatItemReceiver(this.MediaDescriptionCompat).read(activity);
        if (!this.AudioAttributesCompatParcelizer.isEmpty()) {
            Set<String> setKeySet = this.AudioAttributesCompatParcelizer.keySet();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setKeySet, "");
            for (String str : setKeySet) {
                audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(0, str, this.AudioAttributesCompatParcelizer.get(str));
            }
        }
        if (this.MediaBrowserCompatSearchResultReceiver) {
            int i = this.AudioAttributesImplApi21Parcelizer;
            audioAttributesImplBaseParcelizer.IconCompatParcelizer(100, i, i == 0);
        } else {
            audioAttributesImplBaseParcelizer.IconCompatParcelizer(0, 0, false);
        }
        audioAttributesImplBaseParcelizer.read(new _coercedTypeDesc.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(this.MediaBrowserCompatMediaItem).read((CharSequence) this.RatingCompat));
        audioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver(this.MediaBrowserCompatCustomActionResultReceiver).RemoteActionCompatParcelizer(true);
        return audioAttributesImplBaseParcelizer;
    }

    private final setHttpMethod IconCompatParcelizer(int i) {
        this.MediaDescriptionCompat = i;
        return this;
    }
}
