package kotlin;

import com.marrow.data.models.test.TestGroupLSModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class GlUtil {
    public static final List<setSamplerTexId> write(List<TestGroupLSModel> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        List<TestGroupLSModel> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        for (TestGroupLSModel testGroupLSModel : list2) {
            arrayList.add(new setSamplerTexId(testGroupLSModel.getId(), testGroupLSModel.getParentId(), testGroupLSModel.getName(), testGroupLSModel.getQuestionCount(), testGroupLSModel.getSectionTimeInSec(), testGroupLSModel.getCutOffTimeInSec(), testGroupLSModel.getSkippedTimestampMs()));
        }
        return arrayList;
    }
}
