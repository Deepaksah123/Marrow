package kotlin;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import com.google.android.exoplayer2.C;
import com.marrow.R;
import com.marrow.ui.activities.onboarding.deeplinkroute.DeeplinkProcessorActivity;
import kotlin.Metadata;
import kotlin._coercedTypeDesc;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJe\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJC\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0007\u0010\u001cR\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001d\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 "}, d2 = {"Lo/isMiscCode;", "Lo/handleMidrowCtrl;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "read", "()V", "", "p1", "Landroid/graphics/Bitmap;", "p2", "p3", "Landroid/content/Intent;", "p4", "", "p5", "p6", "p7", "", "p8", "p9", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/content/Intent;IILjava/lang/String;)V", "write", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)V", "(I)V", "IconCompatParcelizer", "Landroid/content/Context;", "Landroid/app/NotificationManager;", "Landroid/app/NotificationManager;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class isMiscCode implements handleMidrowCtrl {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Context write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final NotificationManager IconCompatParcelizer;

    @setSdkPayload
    public isMiscCode(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        this.write = context;
        Object systemService = context.getSystemService("notification");
        toMagicModuleMetaRepoModel.read(systemService, "");
        this.IconCompatParcelizer = (NotificationManager) systemService;
        read();
    }

    private final void read() {
        NotificationChannel notificationChannel = new NotificationChannel("_push", "General notification are routed through this channel", 4);
        NotificationChannel notificationChannel2 = new NotificationChannel("notification_download", "Notification to view offline video download progress", 2);
        notificationChannel2.setSound(null, null);
        NotificationChannel notificationChannel3 = new NotificationChannel("notification_local", "Notifications for topic suggestions, reminder etc.", 4);
        NotificationManager notificationManager = this.IconCompatParcelizer;
        notificationManager.createNotificationChannel(notificationChannel);
        notificationManager.createNotificationChannel(notificationChannel2);
        notificationManager.createNotificationChannel(notificationChannel3);
    }

    private final void RemoteActionCompatParcelizer(String str, String str2, Bitmap bitmap, Bitmap bitmap2, Intent intent, int i, int i2, String str3) {
        String string;
        PendingIntent activity;
        if (str2 == null) {
            string = this.write.getString(R.string.app_name);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        } else {
            string = str2;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            if (Build.VERSION.SDK_INT >= 34) {
                intent.setPackage(this.write.getPackageName());
            }
            activity = PendingIntent.getActivity(this.write, 0, intent, 167772160);
        } else {
            activity = PendingIntent.getActivity(this.write, 0, intent, C.BUFFER_FLAG_FIRST_SAMPLE);
        }
        Uri defaultUri = RingtoneManager.getDefaultUri(2);
        _coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = new _coercedTypeDesc.AudioAttributesImplBaseParcelizer(this.write, str3);
        String str4 = str;
        audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer((CharSequence) str4).AudioAttributesCompatParcelizer(defaultUri).read(activity).RemoteActionCompatParcelizer(true);
        String[] strArr = parseDolbyChannelConfiguration.read(string);
        audioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver(i2).IconCompatParcelizer(_isNaN.getColor(this.write, R.color.colorPrimary));
        _coercedTypeDesc.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21ParcelizerIconCompatParcelizer = new _coercedTypeDesc.AudioAttributesImplApi21Parcelizer().read((CharSequence) str4).IconCompatParcelizer(string);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(audioAttributesImplApi21ParcelizerIconCompatParcelizer, "");
        String str5 = str2;
        if (!parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) str5)) {
            audioAttributesImplApi21ParcelizerIconCompatParcelizer.AudioAttributesCompatParcelizer(str5);
        }
        audioAttributesImplBaseParcelizer.read((CharSequence) strArr[0]);
        audioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer(strArr[1]);
        audioAttributesImplBaseParcelizer.read(audioAttributesImplApi21ParcelizerIconCompatParcelizer);
        this.IconCompatParcelizer.notify(i, audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer());
    }

    @Override // kotlin.handleMidrowCtrl
    public final void write(String str, String str2, String str3, String str4) throws Throwable {
        int i;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        Intent intent = DeeplinkProcessorActivity.read(this.write, str3, str4, "notification_local");
        if (parseDolbyChannelConfiguration.RemoteActionCompatParcelizer("video", str3)) {
            i = R.drawable.ic_notification_video;
        } else if (parseDolbyChannelConfiguration.RemoteActionCompatParcelizer("qbank", str3)) {
            i = R.drawable.ic_notification_qbank;
        } else {
            i = parseDolbyChannelConfiguration.RemoteActionCompatParcelizer("test", str3) ? R.drawable.ic_notification_test : R.drawable.ic_notification_default;
        }
        int i2 = i;
        toMagicModuleMetaRepoModel.write(intent);
        RemoteActionCompatParcelizer(str, str2, null, null, intent, 5, i2, "notification_local");
    }

    @Override // kotlin.handleMidrowCtrl
    public final void write(String str, String str2, Intent intent) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(intent, "");
        RemoteActionCompatParcelizer(str, str2, null, null, intent, 3, R.drawable.ic_notification_default, "notification_local");
    }

    @Override // kotlin.handleMidrowCtrl
    public final void read(int p0) {
        this.IconCompatParcelizer.cancel(p0);
    }
}
