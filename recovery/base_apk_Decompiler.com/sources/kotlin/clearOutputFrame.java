package kotlin;

import com.marrow2.data.test.remote.model.StateResultRSModel;
import com.marrow2.data.test.remote.model.TestScoreRSModel;
import com.marrow2.data.test.remote.model.TopUserRSModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class clearOutputFrame {
    public static final checkGlError read(TestScoreRSModel testScoreRSModel, String str, String str2) {
        toMagicModuleMetaRepoModel.write(testScoreRSModel, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        StateResultRSModel stateResultRSModel = testScoreRSModel.getStateResultRSModel();
        checkEglException checkeglexceptionAudioAttributesCompatParcelizer = stateResultRSModel != null ? AudioAttributesCompatParcelizer(stateResultRSModel) : null;
        List<TopUserRSModel> topRankers = testScoreRSModel.getTopRankers();
        List<createEglDisplay> listWrite = topRankers != null ? write(topRankers, str, str2) : null;
        if (listWrite == null) {
            listWrite = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        return new checkGlError(checkeglexceptionAudioAttributesCompatParcelizer, listWrite);
    }

    public static final checkEglException AudioAttributesCompatParcelizer(StateResultRSModel stateResultRSModel) {
        toMagicModuleMetaRepoModel.write(stateResultRSModel, "");
        return new checkEglException(stateResultRSModel.getRank(), stateResultRSModel.getStateId(), stateResultRSModel.getPercentile(), stateResultRSModel.getTotalAttempt(), stateResultRSModel.getStateSolved());
    }

    public static final List<createEglDisplay> write(List<TopUserRSModel> list, String str, String str2) {
        String str3 = "";
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        ArrayList arrayList = new ArrayList();
        List<TopUserRSModel> list2 = list;
        ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            TopUserRSModel topUserRSModel = (TopUserRSModel) it.next();
            String id = topUserRSModel.getId();
            String firstName = topUserRSModel.getFirstName();
            String str4 = firstName == null ? str3 : firstName;
            String lastName = topUserRSModel.getLastName();
            String str5 = lastName != null ? lastName : str3;
            String str6 = str3;
            ArrayList arrayList3 = arrayList2;
            ArrayList arrayList4 = arrayList;
            arrayList3.add(Boolean.valueOf(arrayList4.add(new createEglDisplay(str, id, topUserRSModel.getRank(), str4, str5, topUserRSModel.getProfilePic(), topUserRSModel.getScore(), topUserRSModel.getSkipped(), topUserRSModel.getWrong(), topUserRSModel.getCorrect(), topUserRSModel.isAnonymous(), str2))));
            it = it;
            arrayList = arrayList4;
            arrayList2 = arrayList3;
            str3 = str6;
        }
        return arrayList;
    }
}
