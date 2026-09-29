package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class getVideoHeaderTitle implements getBadgeText {
    private final int AudioAttributesCompatParcelizer;
    private final getVariant read;
    private final getBadgeText write;

    @Override // kotlin.getBadgeText
    public final boolean MediaDescriptionCompat() {
        return true;
    }

    public getVideoHeaderTitle(getBadgeText getbadgetext, getVariant getvariant, int i) {
        toMagicModuleMetaRepoModel.write(getbadgetext, "");
        toMagicModuleMetaRepoModel.write(getvariant, "");
        this.write = getbadgetext;
        this.read = getvariant;
        this.AudioAttributesCompatParcelizer = i;
    }

    @Override // kotlin.getVariant
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final getBadgeText aS_() {
        getBadgeText getbadgetextOnAddQueueItem = this.write.onAddQueueItem();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getbadgetextOnAddQueueItem, "");
        return getbadgetextOnAddQueueItem;
    }

    @Override // kotlin.CourseConfigV2NavDrawerItemAboutUs, kotlin.getVariant
    public final getVariant AudioAttributesImplApi21Parcelizer() {
        return this.read;
    }

    @Override // kotlin.getBadgeText
    public final int write() {
        return this.AudioAttributesCompatParcelizer + this.write.write();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.write);
        sb.append("[inner-copy]");
        return sb.toString();
    }

    @Override // kotlin.getVariant
    public final <R, D> R AudioAttributesCompatParcelizer(CourseConfigV2NavDrawerItemAddVideo<R, D> courseConfigV2NavDrawerItemAddVideo, D d) {
        return (R) this.write.AudioAttributesCompatParcelizer(courseConfigV2NavDrawerItemAddVideo, d);
    }

    @Override // kotlin.fromJSONArray
    public final getQuote RemoteActionCompatParcelizer() {
        return this.write.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.getQuestionLimit
    public final getHref aP_() {
        return this.write.aP_();
    }

    @Override // kotlin.getEmptyBuyPlanText
    public final getRelatedLessonId aQ_() {
        return this.write.aQ_();
    }

    @Override // kotlin.CourseConfigV2HomePageItems
    public final getIntroDurationSeconds RatingCompat() {
        return this.write.RatingCompat();
    }

    @Override // kotlin.getBadgeText
    public final getMini MediaBrowserCompatItemReceiver() {
        return this.write.MediaBrowserCompatItemReceiver();
    }

    @Override // kotlin.getBadgeText, kotlin.getQuestionLimit
    public final getPlanAddOns MediaBrowserCompatSearchResultReceiver() {
        return this.write.MediaBrowserCompatSearchResultReceiver();
    }

    @Override // kotlin.getBadgeText
    public final List<getLink> MediaBrowserCompatCustomActionResultReceiver() {
        return this.write.MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // kotlin.getBadgeText
    public final getTotalSubject MediaBrowserCompatMediaItem() {
        return this.write.MediaBrowserCompatMediaItem();
    }

    @Override // kotlin.getBadgeText
    public final boolean aZ_() {
        return this.write.aZ_();
    }
}
