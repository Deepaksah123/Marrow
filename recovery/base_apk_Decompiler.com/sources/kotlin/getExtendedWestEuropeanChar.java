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
import java.util.Set;
import kotlin._coercedTypeDesc;

/* JADX INFO: loaded from: classes3.dex */
public final class getExtendedWestEuropeanChar {
    private String AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private final Context AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private String MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private String RatingCompat;
    private final String RemoteActionCompatParcelizer;
    private String read;
    private final HashMap<String, PendingIntent> write;

    public getExtendedWestEuropeanChar(Context context, String str, String str2) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.AudioAttributesImplApi26Parcelizer = context;
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
        this.write = new LinkedHashMap();
    }

    public final getExtendedWestEuropeanChar read(String str) {
        this.RatingCompat = str;
        return this;
    }

    public final getExtendedWestEuropeanChar write(String str) {
        this.MediaDescriptionCompat = str;
        return this;
    }

    public final getExtendedWestEuropeanChar IconCompatParcelizer(int i) {
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        return this;
    }

    public final getExtendedWestEuropeanChar write(boolean z) {
        this.MediaBrowserCompatSearchResultReceiver = z;
        return this;
    }

    public final getExtendedWestEuropeanChar RemoteActionCompatParcelizer(boolean z) {
        this.AudioAttributesImplApi21Parcelizer = z;
        return this;
    }

    public final getExtendedWestEuropeanChar IconCompatParcelizer(String str) {
        return IconCompatParcelizer(str, null);
    }

    private getExtendedWestEuropeanChar IconCompatParcelizer(String str, String str2) {
        int i;
        if (parseDolbyChannelConfiguration.RemoteActionCompatParcelizer("video", str)) {
            i = R.drawable.ic_notification_video;
        } else if (parseDolbyChannelConfiguration.RemoteActionCompatParcelizer("qbank", str)) {
            i = R.drawable.ic_notification_qbank;
        } else {
            i = parseDolbyChannelConfiguration.RemoteActionCompatParcelizer("test", str) ? R.drawable.ic_notification_test : R.drawable.ic_notification_default;
        }
        AudioAttributesCompatParcelizer(i);
        this.read = null;
        this.AudioAttributesCompatParcelizer = str;
        this.MediaBrowserCompatItemReceiver = 0;
        return this;
    }

    public final _coercedTypeDesc.AudioAttributesImplBaseParcelizer write() throws Throwable {
        PendingIntent activity;
        Intent intent = DeeplinkProcessorActivity.read(this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesCompatParcelizer, this.read, this.RemoteActionCompatParcelizer);
        if (intent == null) {
            activity = null;
        } else if (Build.VERSION.SDK_INT >= 31) {
            activity = PendingIntent.getActivity(this.AudioAttributesImplApi26Parcelizer, 0, intent, 167772160);
        } else {
            activity = PendingIntent.getActivity(this.AudioAttributesImplApi26Parcelizer, 0, intent, C.BUFFER_FLAG_FIRST_SAMPLE);
        }
        _coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = new _coercedTypeDesc.AudioAttributesImplBaseParcelizer(this.AudioAttributesImplApi26Parcelizer, this.RemoteActionCompatParcelizer);
        NotificationChannel notificationChannel = new NotificationChannel(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, 2);
        notificationChannel.setSound(null, null);
        Object systemService = this.AudioAttributesImplApi26Parcelizer.getSystemService("notification");
        toMagicModuleMetaRepoModel.read(systemService, "");
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        audioAttributesImplBaseParcelizer.IconCompatParcelizer(_isNaN.getColor(this.AudioAttributesImplApi26Parcelizer, R.color.colorPrimary)).AudioAttributesCompatParcelizer(true).RemoteActionCompatParcelizer((CharSequence) this.RatingCompat).MediaBrowserCompatItemReceiver(this.MediaMetadataCompat).read(activity);
        if (this.write.size() > 0) {
            Set<String> setKeySet = this.write.keySet();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setKeySet, "");
            for (String str : setKeySet) {
                audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(0, str, this.write.get(str));
            }
        }
        if (this.MediaBrowserCompatSearchResultReceiver) {
            int i = this.MediaBrowserCompatCustomActionResultReceiver;
            audioAttributesImplBaseParcelizer.IconCompatParcelizer(100, i, i == 0);
        } else {
            audioAttributesImplBaseParcelizer.IconCompatParcelizer(0, 0, false);
        }
        audioAttributesImplBaseParcelizer.read(new _coercedTypeDesc.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(this.MediaDescriptionCompat).read((CharSequence) this.RatingCompat));
        audioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesImplApi21Parcelizer).RemoteActionCompatParcelizer(true);
        return audioAttributesImplBaseParcelizer;
    }

    private final getExtendedWestEuropeanChar AudioAttributesCompatParcelizer(int i) {
        this.MediaMetadataCompat = i;
        return this;
    }
}
