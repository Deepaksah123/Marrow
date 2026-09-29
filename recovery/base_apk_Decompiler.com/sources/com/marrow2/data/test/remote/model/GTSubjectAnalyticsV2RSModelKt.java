package com.marrow2.data.test.remote.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.Metadata;
import kotlin.assertValidTextureSize;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\u0006\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\u0006\u0010\n"}, d2 = {"Lcom/marrow2/data/test/remote/model/WeakLessonV2RSModel;", "Lo/assertValidTextureSize;", "toRepoModel", "(Lcom/marrow2/data/test/remote/model/WeakLessonV2RSModel;)Lo/assertValidTextureSize;", "Lcom/marrow2/data/test/remote/model/GTSubjectAnalyticsV2ResponseModel;", "Lcom/marrow2/data/test/remote/model/GTSubjectAnalyticsV2RSModel;", "toRSModel", "(Lcom/marrow2/data/test/remote/model/GTSubjectAnalyticsV2ResponseModel;)Lcom/marrow2/data/test/remote/model/GTSubjectAnalyticsV2RSModel;", "Lcom/marrow2/data/test/remote/model/TopicStatV2ResponseModel;", "Lcom/marrow2/data/test/remote/model/TopicStatV2RSModel;", "(Lcom/marrow2/data/test/remote/model/TopicStatV2ResponseModel;)Lcom/marrow2/data/test/remote/model/TopicStatV2RSModel;"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class GTSubjectAnalyticsV2RSModelKt {
    public static final assertValidTextureSize toRepoModel(WeakLessonV2RSModel weakLessonV2RSModel) {
        toMagicModuleMetaRepoModel.write(weakLessonV2RSModel, "");
        return new assertValidTextureSize(weakLessonV2RSModel.getTitle());
    }

    public static final GTSubjectAnalyticsV2RSModel toRSModel(GTSubjectAnalyticsV2ResponseModel gTSubjectAnalyticsV2ResponseModel) {
        ArrayList arrayList;
        toMagicModuleMetaRepoModel.write(gTSubjectAnalyticsV2ResponseModel, "");
        List<TestProgressV2ResponseModel> testProgressData = gTSubjectAnalyticsV2ResponseModel.getTestProgressData();
        if (testProgressData == null) {
            testProgressData = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        List<TestProgressV2ResponseModel> list = testProgressData;
        ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(GTAnalyticsV2RSModelKt.toRSModel((TestProgressV2ResponseModel) it.next()));
        }
        ArrayList arrayList3 = arrayList2;
        List<TopicStatV2ResponseModel> topicStat = gTSubjectAnalyticsV2ResponseModel.getTopicStat();
        if (topicStat != null) {
            List<TopicStatV2ResponseModel> list2 = topicStat;
            ArrayList arrayList4 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList4.add(toRSModel((TopicStatV2ResponseModel) it2.next()));
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        return new GTSubjectAnalyticsV2RSModel(arrayList3, arrayList);
    }

    private static final TopicStatV2RSModel toRSModel(TopicStatV2ResponseModel topicStatV2ResponseModel) {
        String id = topicStatV2ResponseModel.getId();
        int correct = topicStatV2ResponseModel.getCorrect();
        int wrong = topicStatV2ResponseModel.getWrong();
        int skipped = topicStatV2ResponseModel.getSkipped();
        int total = topicStatV2ResponseModel.getTotal();
        double percentage = topicStatV2ResponseModel.getPercentage();
        String title = topicStatV2ResponseModel.getTitle();
        int weakLessonCount = topicStatV2ResponseModel.getWeakLessonCount();
        List<WeakLessonV2ResponseModel> weakLessons = topicStatV2ResponseModel.getWeakLessons();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) weakLessons, 10));
        Iterator<T> it = weakLessons.iterator();
        while (it.hasNext()) {
            arrayList.add(GTSubjectAnalyticsV2ResponseModelKt.toRSModel((WeakLessonV2ResponseModel) it.next()));
        }
        return new TopicStatV2RSModel(id, correct, wrong, skipped, total, percentage, title, weakLessonCount, arrayList);
    }
}
