package kotlin;

import com.marrow2.data.course_config.remote.model.AuthorRSModel;
import com.marrow2.data.course_config.remote.model.FreeVideoListRSModel;
import com.marrow2.data.course_config.remote.model.FreeVideoPromotionRSModel;
import com.marrow2.data.course_config.remote.model.SampleLessonRSModel;
import com.marrow2.data.course_config.remote.model.SampleVideosRSModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.isTransferAtFullNetworkSpeed;

/* JADX INFO: loaded from: classes3.dex */
public final class getInitialBitrateEstimateForNetworkType {
    private static final isTransferAtFullNetworkSpeed.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(AuthorRSModel authorRSModel) {
        String name = authorRSModel.getName();
        if (name == null) {
            name = "";
        }
        String imageUrl = authorRSModel.getImageUrl();
        return new isTransferAtFullNetworkSpeed.AudioAttributesCompatParcelizer(name, imageUrl != null ? imageUrl : "");
    }

    public static final isTransferAtFullNetworkSpeed AudioAttributesCompatParcelizer(SampleVideosRSModel sampleVideosRSModel) {
        toMagicModuleMetaRepoModel.write(sampleVideosRSModel, "");
        List<FreeVideoListRSModel> list = sampleVideosRSModel.getList();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        for (FreeVideoListRSModel freeVideoListRSModel : list) {
            String title = freeVideoListRSModel.getTitle();
            if (title == null) {
                title = "";
            }
            arrayList.add(new isTransferAtFullNetworkSpeed.read(title, StateResult.MediaBrowserCompatItemReceiver(StateResult.write(StateResult.IconCompatParcelizer(IntermediateLoginResponseBody.AudioAttributesImplBaseParcelizer((Iterable) freeVideoListRSModel.getLessons()), new getAnswerMap() { // from class: o.maybeNotifyBandwidthSample
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(getInitialBitrateEstimateForNetworkType.IconCompatParcelizer((SampleLessonRSModel) obj));
                }
            }), new getAnswerMap() { // from class: o.onNetworkTypeChanged
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return getInitialBitrateEstimateForNetworkType.write((SampleLessonRSModel) obj);
                }
            }))));
        }
        ArrayList arrayList2 = arrayList;
        FreeVideoPromotionRSModel screen = sampleVideosRSModel.getScreen();
        String title2 = screen != null ? screen.getTitle() : null;
        if (title2 == null) {
            title2 = "";
        }
        FreeVideoPromotionRSModel screen2 = sampleVideosRSModel.getScreen();
        String subTitle = screen2 != null ? screen2.getSubTitle() : null;
        if (subTitle == null) {
            subTitle = "";
        }
        FreeVideoPromotionRSModel screen3 = sampleVideosRSModel.getScreen();
        String toolbarTitle = screen3 != null ? screen3.getToolbarTitle() : null;
        return new isTransferAtFullNetworkSpeed(arrayList2, new isTransferAtFullNetworkSpeed.write(title2, subTitle, toolbarTitle != null ? toolbarTitle : ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IconCompatParcelizer(SampleLessonRSModel sampleLessonRSModel) {
        toMagicModuleMetaRepoModel.write(sampleLessonRSModel, "");
        String lessonId = sampleLessonRSModel.getLessonId();
        return !(lessonId == null || lessonId.length() == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final isTransferAtFullNetworkSpeed.RemoteActionCompatParcelizer write(SampleLessonRSModel sampleLessonRSModel) {
        isTransferAtFullNetworkSpeed.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerIconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(sampleLessonRSModel, "");
        AuthorRSModel lessonAuthor = sampleLessonRSModel.getLessonAuthor();
        if (lessonAuthor != null) {
            audioAttributesCompatParcelizerIconCompatParcelizer = RemoteActionCompatParcelizer(lessonAuthor);
        } else {
            isTransferAtFullNetworkSpeed.AudioAttributesCompatParcelizer.Companion companion = isTransferAtFullNetworkSpeed.AudioAttributesCompatParcelizer.INSTANCE;
            audioAttributesCompatParcelizerIconCompatParcelizer = isTransferAtFullNetworkSpeed.AudioAttributesCompatParcelizer.Companion.IconCompatParcelizer();
        }
        String lessonId = sampleLessonRSModel.getLessonId();
        if (lessonId == null) {
            lessonId = "";
        }
        String subjectName = sampleLessonRSModel.getSubjectName();
        if (subjectName == null) {
            subjectName = "";
        }
        String lessonTitle = sampleLessonRSModel.getLessonTitle();
        return new isTransferAtFullNetworkSpeed.RemoteActionCompatParcelizer(audioAttributesCompatParcelizerIconCompatParcelizer, lessonId, subjectName, lessonTitle != null ? lessonTitle : "");
    }
}
