package kotlin;

import kotlin.HomeLessonIndexV2;
import kotlin.setActiveRecallQbankId;

/* JADX INFO: loaded from: classes4.dex */
public final class getIntro implements setQuestions {
    private final getMasterOrder AudioAttributesImplApi21Parcelizer;
    private final boolean AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final setMcqType IconCompatParcelizer;
    private final getQuestions RemoteActionCompatParcelizer;
    private final isAnswerAvailable<incrementTotalCount> read;
    private final setMcqType write;

    private getIntro(setMcqType setmcqtype, setMcqType setmcqtype2, setActiveRecallQbankId.RatingCompat ratingCompat, setRatingCount setratingcount, isAnswerAvailable<incrementTotalCount> isansweravailable, boolean z, getQuestions getquestions, getMasterOrder getmasterorder) {
        String strAudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(setmcqtype, "");
        toMagicModuleMetaRepoModel.write(ratingCompat, "");
        toMagicModuleMetaRepoModel.write(setratingcount, "");
        toMagicModuleMetaRepoModel.write(getquestions, "");
        this.write = setmcqtype;
        this.IconCompatParcelizer = setmcqtype2;
        this.read = isansweravailable;
        this.AudioAttributesImplApi26Parcelizer = z;
        this.RemoteActionCompatParcelizer = getquestions;
        this.AudioAttributesImplApi21Parcelizer = getmasterorder;
        HomeLessonIndexV2.IconCompatParcelizer<setActiveRecallQbankId.RatingCompat, Integer> iconCompatParcelizer = toHomeLessonIndex.MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCompatParcelizer, "");
        Integer num = (Integer) setTagLabel.read(ratingCompat, iconCompatParcelizer);
        this.AudioAttributesImplBaseParcelizer = (num == null || (strAudioAttributesCompatParcelizer = setratingcount.AudioAttributesCompatParcelizer(num.intValue())) == null) ? "main" : strAudioAttributesCompatParcelizer;
    }

    private setMcqType MediaBrowserCompatCustomActionResultReceiver() {
        return this.write;
    }

    public final setMcqType RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final getMasterOrder read() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getIntro(getMasterOrder getmasterorder, setActiveRecallQbankId.RatingCompat ratingCompat, setRatingCount setratingcount, isAnswerAvailable<incrementTotalCount> isansweravailable, boolean z, getQuestions getquestions) {
        toMagicModuleMetaRepoModel.write(getmasterorder, "");
        toMagicModuleMetaRepoModel.write(ratingCompat, "");
        toMagicModuleMetaRepoModel.write(setratingcount, "");
        toMagicModuleMetaRepoModel.write(getquestions, "");
        setMcqType setmcqtypeRemoteActionCompatParcelizer = setMcqType.RemoteActionCompatParcelizer(getmasterorder.read());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setmcqtypeRemoteActionCompatParcelizer, "");
        String str = getmasterorder.write().read();
        this(setmcqtypeRemoteActionCompatParcelizer, (str == null || str.length() <= 0) ? null : setMcqType.read(str), ratingCompat, setratingcount, isansweravailable, z, getquestions, getmasterorder);
    }

    @Override // kotlin.setQuestions
    public final String IconCompatParcelizer() {
        StringBuilder sb = new StringBuilder("Class '");
        sb.append(write().AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer());
        sb.append('\'');
        return sb.toString();
    }

    public final getRelatedLessonId AudioAttributesImplApi26Parcelizer() {
        String strAudioAttributesCompatParcelizer = MediaBrowserCompatCustomActionResultReceiver().AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, "");
        getRelatedLessonId getrelatedlessonidRemoteActionCompatParcelizer = getRelatedLessonId.RemoteActionCompatParcelizer(TestGroupLSModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, '/', strAudioAttributesCompatParcelizer));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidRemoteActionCompatParcelizer, "");
        return getrelatedlessonidRemoteActionCompatParcelizer;
    }

    public final RevisionSubjectStatusModel write() {
        return new RevisionSubjectStatusModel(MediaBrowserCompatCustomActionResultReceiver().read(), AudioAttributesImplApi26Parcelizer());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(": ");
        sb.append(MediaBrowserCompatCustomActionResultReceiver());
        return sb.toString();
    }

    @Override // kotlin.getIntroDurationSeconds
    public final CourseConfigV2VideoPageItem AudioAttributesCompatParcelizer() {
        CourseConfigV2VideoPageItem courseConfigV2VideoPageItem = CourseConfigV2VideoPageItem.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(courseConfigV2VideoPageItem, "");
        return courseConfigV2VideoPageItem;
    }
}
