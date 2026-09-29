package kotlin;

import com.marrow.data.models.pearl.PearlMini;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setContentLength {
    public static final setRedirectedUri read(PearlMini pearlMini) {
        List listRemoteActionCompatParcelizer;
        List listRemoteActionCompatParcelizer2;
        toMagicModuleMetaRepoModel.write(pearlMini, "");
        String id = pearlMini.getId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
        String pearlType = pearlMini.getPearlType();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(pearlType, "");
        String title = pearlMini.getTitle();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(title, "");
        String subjectId = pearlMini.getSubjectId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(subjectId, "");
        String[] keySubjectIds = pearlMini.getKeySubjectIds();
        if (keySubjectIds == null || (listRemoteActionCompatParcelizer = getOrderDetails.onCommand(keySubjectIds)) == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        List list = listRemoteActionCompatParcelizer;
        String[] keyRootSubjectIds = pearlMini.getKeyRootSubjectIds();
        if (keyRootSubjectIds == null || (listRemoteActionCompatParcelizer2 = getOrderDetails.onCommand(keyRootSubjectIds)) == null) {
            listRemoteActionCompatParcelizer2 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        String pearlDisplayId = pearlMini.getPearlDisplayId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(pearlDisplayId, "");
        return new setRedirectedUri(id, pearlType, title, subjectId, listRemoteActionCompatParcelizer2, list, pearlDisplayId, pearlMini.isBookmarked);
    }
}
