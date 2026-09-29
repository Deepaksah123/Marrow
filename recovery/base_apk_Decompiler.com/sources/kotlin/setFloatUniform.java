package kotlin;

import com.marrow2.data.test.remote.model.GTAnalyticsV2RSModel;
import com.marrow2.data.test.remote.model.SubjectStatV2RSModel;
import com.marrow2.data.test.remote.model.TestProgressV2RSModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setFloatUniform {
    public static final loadAsset write(GTAnalyticsV2RSModel gTAnalyticsV2RSModel) {
        toMagicModuleMetaRepoModel.write(gTAnalyticsV2RSModel, "");
        List<TestProgressV2RSModel> testProgressData = gTAnalyticsV2RSModel.getTestProgressData();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) testProgressData, 10));
        Iterator<T> it = testProgressData.iterator();
        while (it.hasNext()) {
            arrayList.add(read((TestProgressV2RSModel) it.next()));
        }
        ArrayList arrayList2 = arrayList;
        List<SubjectStatV2RSModel> subjectStat = gTAnalyticsV2RSModel.getSubjectStat();
        ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) subjectStat, 10));
        Iterator<T> it2 = subjectStat.iterator();
        while (it2.hasNext()) {
            arrayList3.add(RemoteActionCompatParcelizer((SubjectStatV2RSModel) it2.next()));
        }
        return new loadAsset(arrayList2, arrayList3);
    }

    public static final getHeight read(TestProgressV2RSModel testProgressV2RSModel) {
        toMagicModuleMetaRepoModel.write(testProgressV2RSModel, "");
        return new getHeight(testProgressV2RSModel.getTestId(), testProgressV2RSModel.getTestTitle(), testProgressV2RSModel.getPercentage(), testProgressV2RSModel.getPercentile(), testProgressV2RSModel.getRank(), testProgressV2RSModel.getSubmittedOn());
    }

    private static final setFloat RemoteActionCompatParcelizer(SubjectStatV2RSModel subjectStatV2RSModel) {
        return new setFloat(subjectStatV2RSModel.getSubjectId(), subjectStatV2RSModel.getPercentage(), subjectStatV2RSModel.getTitle(), subjectStatV2RSModel.getPercentile(), subjectStatV2RSModel.getTotalCount());
    }
}
