package kotlin;

import java.util.Collection;
import java.util.List;
import kotlin.getVideoModels;

/* JADX INFO: loaded from: classes4.dex */
public final class fromQbank implements CourseConfigV2QbankItem {
    private final getFeaturedCards AudioAttributesCompatParcelizer;
    private final getMcqAnswerIndexes<getNotesCount, RecentUpdatesFilters> IconCompatParcelizer;

    public fromQbank(FilterParamsJsonParser filterParamsJsonParser) {
        toMagicModuleMetaRepoModel.write(filterParamsJsonParser, "");
        getFeaturedCards getfeaturedcards = new getFeaturedCards(filterParamsJsonParser, getVideoModels.AudioAttributesCompatParcelizer.IconCompatParcelizer, getRenewExpiresOn.write());
        this.AudioAttributesCompatParcelizer = getfeaturedcards;
        this.IconCompatParcelizer = getfeaturedcards.read().RemoteActionCompatParcelizer();
    }

    private final RecentUpdatesFilters read(getNotesCount getnotescount) {
        isResultAvailable isresultavailableAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer().IconCompatParcelizer().AudioAttributesCompatParcelizer(getnotescount);
        if (isresultavailableAudioAttributesCompatParcelizer == null) {
            return null;
        }
        return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(getnotescount, new AudioAttributesCompatParcelizer(isresultavailableAudioAttributesCompatParcelizer));
    }

    static final class AudioAttributesCompatParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<RecentUpdatesFilters> {
        private /* synthetic */ isResultAvailable RemoteActionCompatParcelizer;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public RecentUpdatesFilters invoke() {
            return new RecentUpdatesFilters(fromQbank.this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(isResultAvailable isresultavailable) {
            super(0);
            this.RemoteActionCompatParcelizer = isresultavailable;
        }
    }

    @Override // kotlin.CourseConfigV2PracticalItems
    @getRenewGrpId
    public final List<RecentUpdatesFilters> IconCompatParcelizer(getNotesCount getnotescount) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(read(getnotescount));
    }

    @Override // kotlin.CourseConfigV2QbankItem
    public final void write(getNotesCount getnotescount, Collection<getShouldShowEmptyPlanScreen> collection) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        toMagicModuleMetaRepoModel.write(collection, "");
        SubjectGroupTypeConstant.write(collection, read(getnotescount));
    }

    @Override // kotlin.CourseConfigV2QbankItem
    public final boolean RemoteActionCompatParcelizer(getNotesCount getnotescount) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer().IconCompatParcelizer().AudioAttributesCompatParcelizer(getnotescount) == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.CourseConfigV2PracticalItems
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public List<getNotesCount> RemoteActionCompatParcelizer(getNotesCount getnotescount, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        RecentUpdatesFilters recentUpdatesFilters = read(getnotescount);
        List<getNotesCount> listAudioAttributesImplBaseParcelizer = recentUpdatesFilters != null ? recentUpdatesFilters.AudioAttributesImplBaseParcelizer() : null;
        return listAudioAttributesImplBaseParcelizer == null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : listAudioAttributesImplBaseParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LazyJavaPackageFragmentProvider of module ");
        sb.append(this.AudioAttributesCompatParcelizer.IconCompatParcelizer().MediaBrowserCompatSearchResultReceiver());
        return sb.toString();
    }
}
