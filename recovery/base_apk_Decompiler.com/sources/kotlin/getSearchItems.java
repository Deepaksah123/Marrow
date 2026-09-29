package kotlin;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.getMasterOrder;

/* JADX INFO: loaded from: classes4.dex */
public final class getSearchItems {
    public static final getSearchItems IconCompatParcelizer = new getSearchItems();
    private static final Set<RevisionSubjectStatusModel> RemoteActionCompatParcelizer;
    private static final RevisionSubjectStatusModel write;

    private getSearchItems() {
    }

    public static Set<RevisionSubjectStatusModel> read() {
        return RemoteActionCompatParcelizer;
    }

    static {
        List listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new getNotesCount[]{getPsshData.AudioAttributesImplApi21Parcelizer, getPsshData.AudioAttributesImplApi26Parcelizer, getPsshData.MediaBrowserCompatCustomActionResultReceiver, getPsshData.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, getPsshData.RatingCompat, getPsshData.AudioAttributesCompatParcelizer});
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listRemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(RevisionSubjectStatusModel.RemoteActionCompatParcelizer((getNotesCount) it.next()));
        }
        RemoteActionCompatParcelizer = linkedHashSet;
        RevisionSubjectStatusModel revisionSubjectStatusModelRemoteActionCompatParcelizer = RevisionSubjectStatusModel.RemoteActionCompatParcelizer(getPsshData.MediaBrowserCompatSearchResultReceiver);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(revisionSubjectStatusModelRemoteActionCompatParcelizer, "");
        write = revisionSubjectStatusModelRemoteActionCompatParcelizer;
    }

    public static RevisionSubjectStatusModel write() {
        return write;
    }

    public static final class read implements getMasterOrder.RemoteActionCompatParcelizer {
        private /* synthetic */ MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer;

        @Override // o.getMasterOrder.RemoteActionCompatParcelizer
        public final void RemoteActionCompatParcelizer() {
        }

        read(MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            this.RemoteActionCompatParcelizer = audioAttributesCompatParcelizer;
        }

        @Override // o.getMasterOrder.RemoteActionCompatParcelizer
        public final getMasterOrder.AudioAttributesCompatParcelizer IconCompatParcelizer(RevisionSubjectStatusModel revisionSubjectStatusModel, getIntroDurationSeconds getintrodurationseconds) {
            toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
            toMagicModuleMetaRepoModel.write(getintrodurationseconds, "");
            VideoInfoMini videoInfoMini = VideoInfoMini.read;
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(revisionSubjectStatusModel, VideoInfoMini.IconCompatParcelizer())) {
                return null;
            }
            this.RemoteActionCompatParcelizer.IconCompatParcelizer = true;
            return null;
        }
    }

    public static boolean write(getMasterOrder getmasterorder) {
        toMagicModuleMetaRepoModel.write(getmasterorder, "");
        MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.AudioAttributesCompatParcelizer();
        getmasterorder.write(new read(audioAttributesCompatParcelizer));
        return audioAttributesCompatParcelizer.IconCompatParcelizer;
    }
}
