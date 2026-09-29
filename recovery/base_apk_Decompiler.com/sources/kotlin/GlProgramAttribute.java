package kotlin;

import com.marrow2.data.test.remote.model.GTSubjectAnalyticsV2RSModel;
import com.marrow2.data.test.remote.model.GTSubjectAnalyticsV2RSModelKt;
import com.marrow2.data.test.remote.model.TestProgressV2RSModel;
import com.marrow2.data.test.remote.model.TopicStatV2RSModel;
import com.marrow2.data.test.remote.model.WeakLessonV2RSModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class GlProgramAttribute {
    public static final getCountryCode read(assertValidTextureSize assertvalidtexturesize) {
        toMagicModuleMetaRepoModel.write(assertvalidtexturesize, "");
        return new getCountryCode(assertvalidtexturesize.getWrite());
    }

    public static final setSamplerTexIdUniform write(GTSubjectAnalyticsV2RSModel gTSubjectAnalyticsV2RSModel) {
        ArrayList arrayList;
        toMagicModuleMetaRepoModel.write(gTSubjectAnalyticsV2RSModel, "");
        List<TestProgressV2RSModel> testProgressData = gTSubjectAnalyticsV2RSModel.getTestProgressData();
        ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) testProgressData, 10));
        Iterator<T> it = testProgressData.iterator();
        while (it.hasNext()) {
            arrayList2.add(setFloatUniform.read((TestProgressV2RSModel) it.next()));
        }
        ArrayList arrayList3 = arrayList2;
        List<TopicStatV2RSModel> topicStat = gTSubjectAnalyticsV2RSModel.getTopicStat();
        if (topicStat != null) {
            List<TopicStatV2RSModel> list = topicStat;
            ArrayList arrayList4 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList4.add(write((TopicStatV2RSModel) it2.next()));
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        return new setSamplerTexIdUniform(arrayList3, arrayList);
    }

    private static final getWidth write(TopicStatV2RSModel topicStatV2RSModel) {
        String id = topicStatV2RSModel.getId();
        int correct = topicStatV2RSModel.getCorrect();
        int wrong = topicStatV2RSModel.getWrong();
        int skipped = topicStatV2RSModel.getSkipped();
        int total = topicStatV2RSModel.getTotal();
        double percentage = topicStatV2RSModel.getPercentage();
        String title = topicStatV2RSModel.getTitle();
        int weakLessonCount = topicStatV2RSModel.getWeakLessonCount();
        List<WeakLessonV2RSModel> weakLessons = topicStatV2RSModel.getWeakLessons();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) weakLessons, 10));
        Iterator<T> it = weakLessons.iterator();
        while (it.hasNext()) {
            arrayList.add(GTSubjectAnalyticsV2RSModelKt.toRepoModel((WeakLessonV2RSModel) it.next()));
        }
        return new getWidth(id, correct, wrong, skipped, total, percentage, title, weakLessonCount, arrayList);
    }
}
