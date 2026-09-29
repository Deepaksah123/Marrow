package androidx.media;

import android.media.AudioAttributes;
import kotlin.getAllPermissionGroups;

/* JADX INFO: loaded from: classes4.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(getAllPermissionGroups getallpermissiongroups) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.RemoteActionCompatParcelizer = (AudioAttributes) getallpermissiongroups.IconCompatParcelizer(audioAttributesImplApi21.RemoteActionCompatParcelizer, 1);
        audioAttributesImplApi21.AudioAttributesCompatParcelizer = getallpermissiongroups.RemoteActionCompatParcelizer(audioAttributesImplApi21.AudioAttributesCompatParcelizer, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, getAllPermissionGroups getallpermissiongroups) {
        getallpermissiongroups.read(audioAttributesImplApi21.RemoteActionCompatParcelizer, 1);
        getallpermissiongroups.IconCompatParcelizer(audioAttributesImplApi21.AudioAttributesCompatParcelizer, 2);
    }
}
