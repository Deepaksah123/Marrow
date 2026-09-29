package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import kotlin.getAllPermissionGroups;

/* JADX INFO: loaded from: classes4.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(getAllPermissionGroups getallpermissiongroups) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.write = (IconCompat) getallpermissiongroups.read(remoteActionCompat.write);
        remoteActionCompat.AudioAttributesImplApi26Parcelizer = getallpermissiongroups.write(remoteActionCompat.AudioAttributesImplApi26Parcelizer, 2);
        remoteActionCompat.RemoteActionCompatParcelizer = getallpermissiongroups.write(remoteActionCompat.RemoteActionCompatParcelizer, 3);
        remoteActionCompat.AudioAttributesCompatParcelizer = (PendingIntent) getallpermissiongroups.IconCompatParcelizer(remoteActionCompat.AudioAttributesCompatParcelizer, 4);
        remoteActionCompat.read = getallpermissiongroups.read(remoteActionCompat.read, 5);
        remoteActionCompat.IconCompatParcelizer = getallpermissiongroups.read(remoteActionCompat.IconCompatParcelizer, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, getAllPermissionGroups getallpermissiongroups) {
        getallpermissiongroups.IconCompatParcelizer(remoteActionCompat.write);
        getallpermissiongroups.AudioAttributesCompatParcelizer(remoteActionCompat.AudioAttributesImplApi26Parcelizer, 2);
        getallpermissiongroups.AudioAttributesCompatParcelizer(remoteActionCompat.RemoteActionCompatParcelizer, 3);
        getallpermissiongroups.read(remoteActionCompat.AudioAttributesCompatParcelizer, 4);
        getallpermissiongroups.AudioAttributesCompatParcelizer(remoteActionCompat.read, 5);
        getallpermissiongroups.AudioAttributesCompatParcelizer(remoteActionCompat.IconCompatParcelizer, 6);
    }
}
