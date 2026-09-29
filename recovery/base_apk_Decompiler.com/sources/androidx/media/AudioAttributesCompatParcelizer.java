package androidx.media;

import kotlin.getAllPermissionGroups;

/* JADX INFO: loaded from: classes4.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(getAllPermissionGroups getallpermissiongroups) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.write = (AudioAttributesImpl) getallpermissiongroups.read(audioAttributesCompat.write);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, getAllPermissionGroups getallpermissiongroups) {
        getallpermissiongroups.IconCompatParcelizer(audioAttributesCompat.write);
    }
}
