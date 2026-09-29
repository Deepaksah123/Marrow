package kotlin;

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
import kotlin.Metadata;
import kotlin._coercedTypeDesc;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJE\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/canShowMultiWindowTimeBar;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "RemoteActionCompatParcelizer", "(Landroid/content/Context;)V", "", "p1", "p2", "Landroid/graphics/Bitmap;", "p3", "p4", "Landroid/content/Intent;", "p5", "IconCompatParcelizer", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/content/Intent;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class canShowMultiWindowTimeBar {
    public static final canShowMultiWindowTimeBar INSTANCE = new canShowMultiWindowTimeBar();

    private canShowMultiWindowTimeBar() {
    }

    private static void RemoteActionCompatParcelizer(Context p0) {
        PlayerTimelineChangeReason.IconCompatParcelizer(p0, "_push", "General notifications", "General notification are routed through this channel");
    }

    @getMagicModuleMeta
    public static final void IconCompatParcelizer(Context p0, String p1, String p2, Bitmap p3, Bitmap p4, Intent p5) {
        String string;
        PendingIntent activity;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p5, "");
        boolean z = p4 != null;
        boolean z2 = p3 != null;
        if (p2 == null) {
            string = p0.getString(R.string.app_name);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        } else {
            string = p2;
        }
        Object systemService = p0.getSystemService("notification");
        toMagicModuleMetaRepoModel.read(systemService, "");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (Build.VERSION.SDK_INT >= 31) {
            if (Build.VERSION.SDK_INT >= 34) {
                p5.setPackage(p0.getPackageName());
            }
            activity = PendingIntent.getActivity(p0, 0, p5, 167772160);
        } else {
            activity = PendingIntent.getActivity(p0, 0, p5, C.BUFFER_FLAG_FIRST_SAMPLE);
        }
        Uri defaultUri = RingtoneManager.getDefaultUri(2);
        RemoteActionCompatParcelizer(p0);
        _coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = new _coercedTypeDesc.AudioAttributesImplBaseParcelizer(p0, "_push");
        String str = p1;
        audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer((CharSequence) str).AudioAttributesCompatParcelizer(defaultUri).read(activity).RemoteActionCompatParcelizer(true);
        String[] strArr = parseDolbyChannelConfiguration.read(string);
        audioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver(R.drawable.ic_notification_default);
        if (z2) {
            audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(p3);
        }
        if (z) {
            audioAttributesImplBaseParcelizer.read(new _coercedTypeDesc.read().write(p4).RemoteActionCompatParcelizer(str).AudioAttributesCompatParcelizer(string)).read((CharSequence) strArr[0]);
        } else {
            audioAttributesImplBaseParcelizer.read(new _coercedTypeDesc.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(p2).read((CharSequence) str).IconCompatParcelizer(string));
            audioAttributesImplBaseParcelizer.read((CharSequence) strArr[0]);
            audioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer(strArr[1]);
        }
        notificationManager.notify(100, audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer());
    }
}
