package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class LessonIndex {
    private static final <T> T write(Set<? extends T> set, T t, T t2, T t3, boolean z) {
        Set<? extends T> setOnPlayFromUri;
        if (z) {
            T t4 = set.contains(t) ? t : set.contains(t2) ? t2 : null;
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(t4, t) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(t3, t2)) {
                return null;
            }
            return t3 == null ? t4 : t3;
        }
        if (t3 != null && (setOnPlayFromUri = IntermediateLoginResponseBody.onPlayFromUri(getKycMessage.write(set, t3))) != null) {
            set = setOnPlayFromUri;
        }
        return (T) IntermediateLoginResponseBody.onCommand(set);
    }

    private static final VideoSubModel AudioAttributesCompatParcelizer(Set<? extends VideoSubModel> set, VideoSubModel videoSubModel, boolean z) {
        if (videoSubModel == VideoSubModel.FORCE_FLEXIBILITY) {
            return VideoSubModel.FORCE_FLEXIBILITY;
        }
        return (VideoSubModel) write(set, VideoSubModel.NOT_NULL, VideoSubModel.NULLABLE, videoSubModel, z);
    }

    private static final VideoSubModel RemoteActionCompatParcelizer(getSubject getsubject) {
        if (getsubject.read()) {
            return null;
        }
        return getsubject.IconCompatParcelizer();
    }

    public static final getSubject AudioAttributesCompatParcelizer(getSubject getsubject, Collection<getSubject> collection, boolean z, boolean z2, boolean z3) {
        VideoSubModel videoSubModelAudioAttributesCompatParcelizer;
        boolean z4;
        toMagicModuleMetaRepoModel.write(getsubject, "");
        toMagicModuleMetaRepoModel.write(collection, "");
        Collection<getSubject> collection2 = collection;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            VideoSubModel videoSubModelRemoteActionCompatParcelizer = RemoteActionCompatParcelizer((getSubject) it.next());
            if (videoSubModelRemoteActionCompatParcelizer != null) {
                arrayList.add(videoSubModelRemoteActionCompatParcelizer);
            }
        }
        VideoSubModel videoSubModelAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(IntermediateLoginResponseBody.onPlayFromUri(arrayList), RemoteActionCompatParcelizer(getsubject), z);
        if (videoSubModelAudioAttributesCompatParcelizer2 == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = collection2.iterator();
            while (it2.hasNext()) {
                VideoSubModel videoSubModelIconCompatParcelizer = ((getSubject) it2.next()).IconCompatParcelizer();
                if (videoSubModelIconCompatParcelizer != null) {
                    arrayList2.add(videoSubModelIconCompatParcelizer);
                }
            }
            videoSubModelAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(IntermediateLoginResponseBody.onPlayFromUri(arrayList2), getsubject.IconCompatParcelizer(), z);
        } else {
            videoSubModelAudioAttributesCompatParcelizer = videoSubModelAudioAttributesCompatParcelizer2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it3 = collection2.iterator();
        while (it3.hasNext()) {
            HomeVideoModel homeVideoModelAudioAttributesCompatParcelizer = ((getSubject) it3.next()).AudioAttributesCompatParcelizer();
            if (homeVideoModelAudioAttributesCompatParcelizer != null) {
                arrayList3.add(homeVideoModelAudioAttributesCompatParcelizer);
            }
        }
        HomeVideoModel homeVideoModel = (HomeVideoModel) write(IntermediateLoginResponseBody.onPlayFromUri(arrayList3), HomeVideoModel.MUTABLE, HomeVideoModel.READ_ONLY, getsubject.AudioAttributesCompatParcelizer(), z);
        VideoSubModel videoSubModel = null;
        if (videoSubModelAudioAttributesCompatParcelizer != null && !z3 && (!z2 || videoSubModelAudioAttributesCompatParcelizer != VideoSubModel.NULLABLE)) {
            videoSubModel = videoSubModelAudioAttributesCompatParcelizer;
        }
        boolean z5 = false;
        if (videoSubModel == VideoSubModel.NOT_NULL) {
            if (!getsubject.RemoteActionCompatParcelizer()) {
                if (!collection2.isEmpty()) {
                    Iterator<T> it4 = collection2.iterator();
                    while (it4.hasNext()) {
                        if (((getSubject) it4.next()).RemoteActionCompatParcelizer()) {
                        }
                    }
                }
                z4 = false;
            }
            z4 = true;
            break;
        }
        z4 = false;
        if (videoSubModel != null && videoSubModelAudioAttributesCompatParcelizer2 != videoSubModelAudioAttributesCompatParcelizer) {
            z5 = true;
        }
        return new getSubject(videoSubModel, homeVideoModel, z4, z5);
    }

    public static final boolean RemoteActionCompatParcelizer(setGroupDescription setgroupdescription, Preference preference) {
        toMagicModuleMetaRepoModel.write(setgroupdescription, "");
        toMagicModuleMetaRepoModel.write(preference, "");
        getNotesCount getnotescount = getPsshData.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescount, "");
        return setgroupdescription.IconCompatParcelizer(preference, getnotescount);
    }
}
