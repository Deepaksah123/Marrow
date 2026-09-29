package kotlin;

import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.response.lesson.InteractiveVideoElementLSModel;
import com.marrow.data.api.models.response.lesson.LessonResponseBody;
import com.marrow.data.models.lesson.LessonIndex;
import java.util.List;
import kotlin.AdsMediaSourceAdLoadException;

/* JADX INFO: loaded from: classes3.dex */
public final class AdsMediaSourceAdLoadExceptionType implements AdsMediaSourceAdLoadException.IconCompatParcelizer {
    private final AdsMediaSourceAdLoadException.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
    private final AdsMediaSourceAdLoadException.write write;

    @setSdkPayload
    public AdsMediaSourceAdLoadExceptionType(AdsMediaSourceAdLoadException.write writeVar, AdsMediaSourceAdLoadException.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        this.write = writeVar;
        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
    }

    @Override // o.AdsMediaSourceAdLoadException.IconCompatParcelizer
    public final accessgetEmptyStatecp<LessonIndex> RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (AudioAttributesCompatParcelizer(str)) {
            return this.write.IconCompatParcelizer(str);
        }
        return IconCompatParcelizer(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LessonIndex IconCompatParcelizer(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return (LessonIndex) getanswermap.invoke(obj);
    }

    private final accessgetEmptyStatecp<LessonIndex> IconCompatParcelizer(String str) {
        accessgetEmptyStatecp<MarrowResponse<LessonResponseBody>> accessgetemptystatecp = read(str);
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.createForAdGroup
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return AdsMediaSourceAdLoadExceptionType.RemoteActionCompatParcelizer(this.IconCompatParcelizer, (MarrowResponse) obj);
            }
        };
        accessgetEmptyStatecp accessgetemptystatecpRemoteActionCompatParcelizer = accessgetemptystatecp.RemoteActionCompatParcelizer(new getSubjectTitle() { // from class: o.isInactive
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return AdsMediaSourceAdLoadExceptionType.IconCompatParcelizer(getanswermap, obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpRemoteActionCompatParcelizer, "");
        return accessgetemptystatecpRemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LessonIndex RemoteActionCompatParcelizer(AdsMediaSourceAdLoadExceptionType adsMediaSourceAdLoadExceptionType, MarrowResponse marrowResponse) throws Throwable {
        toMagicModuleMetaRepoModel.write(marrowResponse, "");
        Object objAudioAttributesCompatParcelizer = getSegmentStartTimeUs.AudioAttributesCompatParcelizer((MarrowResponse<Object>) marrowResponse);
        adsMediaSourceAdLoadExceptionType.write((LessonResponseBody) objAudioAttributesCompatParcelizer);
        return (LessonIndex) objAudioAttributesCompatParcelizer;
    }

    private accessgetEmptyStatecp<MarrowResponse<LessonResponseBody>> read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer(str);
    }

    @Override // o.AdsMediaSourceAdLoadException.IconCompatParcelizer
    public final boolean AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.write.write(str);
    }

    private void write(LessonResponseBody lessonResponseBody) {
        toMagicModuleMetaRepoModel.write(lessonResponseBody, "");
        this.write.IconCompatParcelizer(lessonResponseBody);
    }

    @Override // o.AdsMediaSourceAdLoadException.IconCompatParcelizer
    public final List<InteractiveVideoElementLSModel> write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.write.AudioAttributesCompatParcelizer(str);
    }
}
