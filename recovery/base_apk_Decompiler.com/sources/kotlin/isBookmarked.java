package kotlin;

import kotlin.getZenArea;

/* JADX INFO: loaded from: classes4.dex */
public final class isBookmarked extends setActiveLessonId<Long> {
    public isBookmarked(long j) {
        super(Long.valueOf(j));
    }

    @Override // kotlin.getMagicLine
    public final getLink AudioAttributesCompatParcelizer(getTopSection gettopsection) {
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer = CourseConfigV2NavDrawerItemReportPiracy.AudioAttributesCompatParcelizer(gettopsection, getZenArea.RemoteActionCompatParcelizer.ParcelableVolumeInfo);
        getHref gethrefAP_ = courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer != null ? courseConfigV2CustomModuleQuestionSourceAudioAttributesCompatParcelizer.aP_() : null;
        if (gethrefAP_ != null) {
            return gethrefAP_;
        }
        return SubscriptionType.read(setAccessLevel.NOT_FOUND_UNSIGNED_TYPE, "ULong");
    }

    @Override // kotlin.getMagicLine
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AudioAttributesCompatParcelizer().longValue());
        sb.append(".toULong()");
        return sb.toString();
    }
}
