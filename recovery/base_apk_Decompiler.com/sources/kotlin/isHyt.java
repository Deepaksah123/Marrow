package kotlin;

import kotlin.getQuote;

/* JADX INFO: loaded from: classes4.dex */
public abstract class isHyt extends PresenterBundle implements getShouldShowEmptyPlanScreen {
    private final String IconCompatParcelizer;
    private final getNotesCount write;

    @Override // kotlin.getShouldShowEmptyPlanScreen
    public final getNotesCount IconCompatParcelizer() {
        return this.write;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isHyt(getTopSection gettopsection, getNotesCount getnotescount) {
        super(gettopsection, getQuote.AudioAttributesCompatParcelizer.read(), getnotescount.AudioAttributesImplApi21Parcelizer(), getIntroDurationSeconds.AudioAttributesCompatParcelizer);
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        getQuote.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getQuote.IconCompatParcelizer;
        this.write = getnotescount;
        StringBuilder sb = new StringBuilder("package ");
        sb.append(getnotescount);
        sb.append(" of ");
        sb.append(gettopsection);
        this.IconCompatParcelizer = sb.toString();
    }

    @Override // kotlin.getVariant
    public final <R, D> R AudioAttributesCompatParcelizer(CourseConfigV2NavDrawerItemAddVideo<R, D> courseConfigV2NavDrawerItemAddVideo, D d) {
        toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemAddVideo, "");
        return courseConfigV2NavDrawerItemAddVideo.RemoteActionCompatParcelizer(this, d);
    }

    @Override // kotlin.PresenterBundle, kotlin.getVariant
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final getTopSection AudioAttributesImplApi21Parcelizer() {
        getVariant getvariantAudioAttributesImplApi21Parcelizer = super.AudioAttributesImplApi21Parcelizer();
        toMagicModuleMetaRepoModel.read(getvariantAudioAttributesImplApi21Parcelizer, "");
        return (getTopSection) getvariantAudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.PresenterBundle, kotlin.CourseConfigV2HomePageItems
    public getIntroDurationSeconds RatingCompat() {
        getIntroDurationSeconds getintrodurationseconds = getIntroDurationSeconds.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getintrodurationseconds, "");
        return getintrodurationseconds;
    }

    @Override // kotlin.getBooleanMap
    public String toString() {
        return this.IconCompatParcelizer;
    }
}
