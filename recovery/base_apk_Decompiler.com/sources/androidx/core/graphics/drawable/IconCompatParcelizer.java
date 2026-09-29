package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import kotlin.getAllPermissionGroups;

/* JADX INFO: loaded from: classes4.dex */
public class IconCompatParcelizer {
    public static IconCompat read(getAllPermissionGroups getallpermissiongroups) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.RatingCompat = getallpermissiongroups.RemoteActionCompatParcelizer(iconCompat.RatingCompat, 1);
        iconCompat.read = getallpermissiongroups.AudioAttributesCompatParcelizer(iconCompat.read);
        iconCompat.MediaBrowserCompatItemReceiver = getallpermissiongroups.IconCompatParcelizer(iconCompat.MediaBrowserCompatItemReceiver, 3);
        iconCompat.AudioAttributesCompatParcelizer = getallpermissiongroups.RemoteActionCompatParcelizer(iconCompat.AudioAttributesCompatParcelizer, 4);
        iconCompat.RemoteActionCompatParcelizer = getallpermissiongroups.RemoteActionCompatParcelizer(iconCompat.RemoteActionCompatParcelizer, 5);
        iconCompat.AudioAttributesImplApi26Parcelizer = (ColorStateList) getallpermissiongroups.IconCompatParcelizer(iconCompat.AudioAttributesImplApi26Parcelizer, 6);
        iconCompat.MediaBrowserCompatCustomActionResultReceiver = getallpermissiongroups.read(iconCompat.MediaBrowserCompatCustomActionResultReceiver, 7);
        iconCompat.AudioAttributesImplApi21Parcelizer = getallpermissiongroups.read(iconCompat.AudioAttributesImplApi21Parcelizer, 8);
        iconCompat.AudioAttributesImplBaseParcelizer();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, getAllPermissionGroups getallpermissiongroups) {
        iconCompat.IconCompatParcelizer(getAllPermissionGroups.write());
        if (-1 != iconCompat.RatingCompat) {
            getallpermissiongroups.IconCompatParcelizer(iconCompat.RatingCompat, 1);
        }
        if (iconCompat.read != null) {
            getallpermissiongroups.read(iconCompat.read);
        }
        if (iconCompat.MediaBrowserCompatItemReceiver != null) {
            getallpermissiongroups.read(iconCompat.MediaBrowserCompatItemReceiver, 3);
        }
        if (iconCompat.AudioAttributesCompatParcelizer != 0) {
            getallpermissiongroups.IconCompatParcelizer(iconCompat.AudioAttributesCompatParcelizer, 4);
        }
        if (iconCompat.RemoteActionCompatParcelizer != 0) {
            getallpermissiongroups.IconCompatParcelizer(iconCompat.RemoteActionCompatParcelizer, 5);
        }
        if (iconCompat.AudioAttributesImplApi26Parcelizer != null) {
            getallpermissiongroups.read(iconCompat.AudioAttributesImplApi26Parcelizer, 6);
        }
        if (iconCompat.MediaBrowserCompatCustomActionResultReceiver != null) {
            getallpermissiongroups.IconCompatParcelizer(iconCompat.MediaBrowserCompatCustomActionResultReceiver, 7);
        }
        if (iconCompat.AudioAttributesImplApi21Parcelizer != null) {
            getallpermissiongroups.IconCompatParcelizer(iconCompat.AudioAttributesImplApi21Parcelizer, 8);
        }
    }
}
