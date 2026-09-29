package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import kotlin.getAllPermissionGroups;

/* JADX INFO: loaded from: classes4.dex */
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(getAllPermissionGroups getallpermissiongroups) {
        return androidx.media.AudioAttributesCompatParcelizer.read(getallpermissiongroups);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, getAllPermissionGroups getallpermissiongroups) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, getallpermissiongroups);
    }
}
