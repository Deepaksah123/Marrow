package androidx.media;

import android.media.AudioAttributes;
import kotlin.getAllPermissionGroups;

/* JADX INFO: loaded from: classes4.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(getAllPermissionGroups getallpermissiongroups) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.RemoteActionCompatParcelizer = (AudioAttributes) getallpermissiongroups.IconCompatParcelizer(audioAttributesImplApi26.RemoteActionCompatParcelizer, 1);
        audioAttributesImplApi26.AudioAttributesCompatParcelizer = getallpermissiongroups.RemoteActionCompatParcelizer(audioAttributesImplApi26.AudioAttributesCompatParcelizer, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, getAllPermissionGroups getallpermissiongroups) {
        getallpermissiongroups.read(audioAttributesImplApi26.RemoteActionCompatParcelizer, 1);
        getallpermissiongroups.IconCompatParcelizer(audioAttributesImplApi26.AudioAttributesCompatParcelizer, 2);
    }
}
