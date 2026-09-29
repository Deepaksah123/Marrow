package androidx.media;

import kotlin.getAllPermissionGroups;

/* JADX INFO: loaded from: classes4.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(getAllPermissionGroups getallpermissiongroups) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.read = getallpermissiongroups.RemoteActionCompatParcelizer(audioAttributesImplBase.read, 1);
        audioAttributesImplBase.write = getallpermissiongroups.RemoteActionCompatParcelizer(audioAttributesImplBase.write, 2);
        audioAttributesImplBase.RemoteActionCompatParcelizer = getallpermissiongroups.RemoteActionCompatParcelizer(audioAttributesImplBase.RemoteActionCompatParcelizer, 3);
        audioAttributesImplBase.IconCompatParcelizer = getallpermissiongroups.RemoteActionCompatParcelizer(audioAttributesImplBase.IconCompatParcelizer, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, getAllPermissionGroups getallpermissiongroups) {
        getallpermissiongroups.IconCompatParcelizer(audioAttributesImplBase.read, 1);
        getallpermissiongroups.IconCompatParcelizer(audioAttributesImplBase.write, 2);
        getallpermissiongroups.IconCompatParcelizer(audioAttributesImplBase.RemoteActionCompatParcelizer, 3);
        getallpermissiongroups.IconCompatParcelizer(audioAttributesImplBase.IconCompatParcelizer, 4);
    }
}
