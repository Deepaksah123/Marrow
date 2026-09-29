package com.marrow2.data.test.remote.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0011\u0010\u0002\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\u0002\u0010\t"}, d2 = {"Lcom/marrow2/data/test/remote/model/GTAnalyticsV2ResponseModel;", "Lcom/marrow2/data/test/remote/model/GTAnalyticsV2RSModel;", "toRSModel", "(Lcom/marrow2/data/test/remote/model/GTAnalyticsV2ResponseModel;)Lcom/marrow2/data/test/remote/model/GTAnalyticsV2RSModel;", "Lcom/marrow2/data/test/remote/model/SubjectStatV2ResponseModel;", "Lcom/marrow2/data/test/remote/model/SubjectStatV2RSModel;", "(Lcom/marrow2/data/test/remote/model/SubjectStatV2ResponseModel;)Lcom/marrow2/data/test/remote/model/SubjectStatV2RSModel;", "Lcom/marrow2/data/test/remote/model/TestProgressV2ResponseModel;", "Lcom/marrow2/data/test/remote/model/TestProgressV2RSModel;", "(Lcom/marrow2/data/test/remote/model/TestProgressV2ResponseModel;)Lcom/marrow2/data/test/remote/model/TestProgressV2RSModel;"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class GTAnalyticsV2RSModelKt {
    public static final GTAnalyticsV2RSModel toRSModel(GTAnalyticsV2ResponseModel gTAnalyticsV2ResponseModel) {
        toMagicModuleMetaRepoModel.write(gTAnalyticsV2ResponseModel, "");
        List<TestProgressV2ResponseModel> testProgressData = gTAnalyticsV2ResponseModel.getTestProgressData();
        if (testProgressData == null) {
            testProgressData = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        List<TestProgressV2ResponseModel> list = testProgressData;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toRSModel((TestProgressV2ResponseModel) it.next()));
        }
        ArrayList arrayList2 = arrayList;
        List<SubjectStatV2ResponseModel> subjectStat = gTAnalyticsV2ResponseModel.getSubjectStat();
        if (subjectStat == null) {
            subjectStat = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        List<SubjectStatV2ResponseModel> list2 = subjectStat;
        ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(toRSModel((SubjectStatV2ResponseModel) it2.next()));
        }
        return new GTAnalyticsV2RSModel(arrayList2, arrayList3);
    }

    private static final SubjectStatV2RSModel toRSModel(SubjectStatV2ResponseModel subjectStatV2ResponseModel) {
        return new SubjectStatV2RSModel(subjectStatV2ResponseModel.getSubjectId(), subjectStatV2ResponseModel.getPercentage(), subjectStatV2ResponseModel.getTitle(), subjectStatV2ResponseModel.getPercentile(), subjectStatV2ResponseModel.getTotalCount());
    }

    public static final TestProgressV2RSModel toRSModel(TestProgressV2ResponseModel testProgressV2ResponseModel) {
        toMagicModuleMetaRepoModel.write(testProgressV2ResponseModel, "");
        return new TestProgressV2RSModel(testProgressV2ResponseModel.getTestId(), testProgressV2ResponseModel.getTestTitle(), testProgressV2ResponseModel.getPercentage(), testProgressV2ResponseModel.getPercentile(), testProgressV2ResponseModel.getRank(), testProgressV2ResponseModel.getSubmittedOn());
    }
}
